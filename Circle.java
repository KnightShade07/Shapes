public class Circle implements Shape {
   int radius;
   int circumference;
   Point p1;  
   Point center;
   
   
   //no-arg constructor
   public Circle(){
      
   }
   
   //general constructor
   public Circle(Point center, int radius) {
      this.p1 = p1;
      this.center = center;
      this.radius = radius;
   }
   public double getArea() {
      final double PI = 3.14;
      double area = (radius * radius) * PI;
      return area;
   }
   //the perimeter of a circle is actually circumference, but we roll
   //with what the interface gives us.
   public double getPerimeter() {
      final double PI = 3.14;
      double circumference = PI * (2 * radius);
      return circumference;
   }
   


   
   public boolean equals( Object other ){
   //filters out any possible nulls.
      if ( other == null ) {
            return false;
         }
         if( other instanceof Circle) {
            Circle line = (Circle) other;
            return line.p1.equals( p1 ) && line.center.equals( center ) || 
            line.p1.equals( p1 ) && line.center.equals( center );
         }
         else {
            return false;
         }
   }
   
   public String toString() {
        return "{(" + p1 + ")" + "," + radius + "}";
    }

}