public class ShapeCalculatorTest {

    public static void main(String[] args) {

        Square square1 = new Square(10);
        Circle circle1 = new Circle(9);
        Rectangle rect1 = new Rectangle(4,5);
        Triangle triangle1 = new Triangle(4,7,9);
        ShapeCalculator shapeCalculator1 = new ShapeCalculator();

        double squareArea = shapeCalculator1.squareArea(square1);
        double circleArea = shapeCalculator1.circleArea(circle1);
        double trianglePerimeter = shapeCalculator1.trianglePerimeter(triangle1);
        double rectPerimeter = shapeCalculator1.rectPerimeter(rect1);

        System.out.println("Pole kwadratu o boku " + square1.a + " to " + squareArea);
        System.out.println("Pole koła o promieniu " + circle1.r + " to " + circleArea);
        System.out.println("Obwód prostokąta o bokach " + rect1.a + " i " + rect1.b + " to " + rectPerimeter);
        System.out.println("Obwód trójkąta o bokach " + triangle1.a + ", " + triangle1.b + " i " + triangle1.c + " to " + trianglePerimeter);

    }
}
