public class ShapeCalculator {

    double squareArea(Square square){
        return square.a*square.a; }

    double circleArea(Circle circle){
        return circle.r*circle.r*3.14;}

    double trianglePerimeter(Triangle triangle){
        return triangle.a + triangle.b + triangle.c; }

    double rectPerimeter(Rectangle rectangle){
        return 2 * (rectangle.a + rectangle.b) ; }

}
