package learning.vladdubceac.factory_method.concrete_creator.factory;

import learning.vladdubceac.factory_method.concrete_creator.product.implementation.Circle;
import learning.vladdubceac.factory_method.concrete_creator.product.implementation.Rectangle;
import learning.vladdubceac.factory_method.concrete_creator.product.Shape;
import learning.vladdubceac.factory_method.concrete_creator.product.implementation.Square;

public class ShapeFactory {

    public static final String CIRCLE = "circle";
    public static final String RECTANGLE = "rectangle";
    public static final String SQUARE = "square";

    // use getShape method to get object of type shape
    public Shape getShape(String shapeType){
        if(shapeType == null || shapeType.isBlank()){
            return null;
        }else if(shapeType.equalsIgnoreCase(CIRCLE)){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase(RECTANGLE)){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase(SQUARE)){
            return new Square();
        }
        return null;
    }
}
