import java.util.*;
class Celsius_to_Fahrenheit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double temp=sc.nextDouble();
       double fahrenheit=(temp*1.8)+32;
       System.out.println("Temprature in fahrenheit: "+fahrenheit);
    }
}