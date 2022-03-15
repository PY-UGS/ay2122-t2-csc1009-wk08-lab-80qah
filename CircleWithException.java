import java.lang.Math;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleWithException {
    private int radius;
    public static void main(String[] arg) throws Exception{
        
        Scanner s=new Scanner(System.in);
        System.out.print("Enter radius: ");
        int input=s.nextInt();
    
        CircleWithException c=new CircleWithException();
        c.setRadius(input);
        int radius=c.getRadius();
        double area=c.getArea();
        
        if(radius<=0){
            throw new IllegalArgumentException("Radius cannot be zero or negative");
        }
        else if(area>1000){
            throw new Exception("Area is more than 1000");
        }
        else{
            System.out.println("Area is "+c.getArea());
        }
    }
    
    public void setRadius(int radius){
        this.radius=radius;
    }

    public int getRadius(){
        return radius;
    }

    public double getArea(){
        double area=Math.PI*radius*radius;
        return area;
    }

    public double getDiameter(){
        return radius*2;
    }
}
