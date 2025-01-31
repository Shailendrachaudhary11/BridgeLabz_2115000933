import java.util.*;
class Circle{
    private int radius;
    Circle(int radius){
        this.radius=radius;
    }
    public double areaOfCircle(){
        return 2 * Math.PI * radius*radius;
    }
    public double circumferenceOfCircle(){
        return 2 * Math.PI * radius;
    }
    public void display(){
        System.out.println("Area of circle: "+areaOfCircle());
        System.out.println("Area of circle: "+circumferenceOfCircle());
    }
}
public class CircleDetails {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int radius=sc.nextInt();
        Circle circle=new Circle(radius);
        circle.display();

    }
}
