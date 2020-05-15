public class Rectangle implements Shape {
   //rectangle has 4 points.
   Point p1;
   Point p2;
   Point p3;
   Point p4;
   

   public double getPerimeter() {
      return p1.distance( p2 ) + p2.distance( p3 ) + p3.distance( p1 ) + p4.distance( p3 );
   }
   
   public double getArea() {
      double sideA = p1.distance( p2 );
      double sideB = p2.distance( p3 );
      double area = sideA * sideB;
      return area;
   }
}