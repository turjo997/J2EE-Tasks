
class Rectangle{

    public int Width;
    public int Height;

}

class Square{
    public int Size;

}

class Calculator{
  public int GetArea(Rectangle rectangle){
     int area = rectangle.Width * rectangle.Height;
     return area;
  }

}

class CalculatorAdapter{
    public int GetArea(Square square){
        Calculator calculator = new Calculator();
        Rectangle rectangle = new Rectangle();
        rectangle.Width = rectangle.Height = square.Size;
        int area = calculator.GetArea(rectangle);
        return area;
    }
}

class Triangle{
    public int base , height;
}

class TriangleAdapter{
    public double GetArea(Triangle triangle){
        Calculator calculator = new Calculator();
        Rectangle rectangle = new Rectangle();
        rectangle.Width = triangle.base;
        rectangle.Height = triangle.height;

        double area = 0.5 * calculator.GetArea(rectangle);
        return area;
    }
}


public class AdapterTest {

    public static void main(String[] args) {
         Square square = new Square();

         square.Size = 10;

         CalculatorAdapter adapter = new CalculatorAdapter();

         int area = adapter.GetArea(square);

        System.out.println("Area : " +area);


        TriangleAdapter triangleAdapter = new TriangleAdapter();
        Triangle triangle = new Triangle();
        triangle.base = 10;
        triangle.height = 20;
        System.out.println("Area of triangle is : "+triangleAdapter.GetArea(triangle));

    }
}
