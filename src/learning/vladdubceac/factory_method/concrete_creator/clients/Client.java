package learning.vladdubceac.factory_method.concrete_creator.clients;

import learning.vladdubceac.factory_method.concrete_creator.factory.ShapeFactory;
import learning.vladdubceac.factory_method.concrete_creator.product.Shape;

public class Client {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape(ShapeFactory.CIRCLE);
        shape1.draw();

        Shape shape2 = shapeFactory.getShape(ShapeFactory.RECTANGLE);
        shape2.draw();

        Shape shape3 = shapeFactory.getShape(ShapeFactory.SQUARE);
        shape3.draw();
    }
}
