/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package democomp603;

/**
 *
 * @author anusingh
 */

// Shape interface
interface Shape {
    void draw();
}

// Circle class
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

// Rectangle class
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

// ShapeFactory class
class ShapeFactory {
    // Method to get an object of type Shape
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}

// Client code
public class W9_01_FactoryPattern {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Get an object of Circle and call its draw method
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        // Get an object of Rectangle and call its draw method
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
    }
}


//// ShapeFactory class with static method
//class ShapeFactory {
//    // Static method to get an object of type Shape
//    public static Shape getShape(String shapeType) {
//        if (shapeType == null) {
//            return null;
//        }
//        if (shapeType.equalsIgnoreCase("CIRCLE")) {
//            return new Circle();
//        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
//            return new Rectangle();
//        }
//        return null;
//    }
//}
//
//public class FactoryPatternDemo {
//    public static void main(String[] args) {
//        // Get an object of Circle and call its draw method
//        Shape shape1 = ShapeFactory.getShape("CIRCLE");
//        shape1.draw();
//
//        // Get an object of Rectangle and call its draw method
//        Shape shape2 = ShapeFactory.getShape("RECTANGLE");
//        shape2.draw();
//    }
//}


//// Client code without Factory Pattern
//public class W9_01_FactoryPattern {
//    public static void main(String[] args) {
//        Shape shape1;
//        Shape shape2;
//
//        // Logic to create Circle object
//        String shapeType1 = "CIRCLE";
//        if (shapeType1.equalsIgnoreCase("CIRCLE")) {
//            shape1 = new Circle();
//        } else if (shapeType1.equalsIgnoreCase("RECTANGLE")) {
//            shape1 = new Rectangle();
//        } else {
//            shape1 = null;
//        }
//
//        if (shape1 != null) {
//            shape1.draw();
//        } else {
//            System.out.println("Invalid shape type: " + shapeType1);
//        }
//
//        // Logic to create Rectangle object
//        String shapeType2 = "RECTANGLE";
//        if (shapeType2.equalsIgnoreCase("CIRCLE")) {
//            shape2 = new Circle();
//        } else if (shapeType2.equalsIgnoreCase("RECTANGLE")) {
//            shape2 = new Rectangle();
//        } else {
//            shape2 = null;
//        }
//
//        if (shape2 != null) {
//            shape2.draw();
//        } else {
//            System.out.println("Invalid shape type: " + shapeType2);
//        }
//    }
//}
