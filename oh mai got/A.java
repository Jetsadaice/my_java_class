
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        double h;
        double w;

        Scanner hinp = new Scanner(System.in);
        System.out.println(".(input h)");
        h = hinp.nextDouble();
        
        Scanner wimp = new Scanner(System.in);
        System.out.println(".(input w)");
        w = wimp.nextDouble();
        double bmi = w / (h*h) ;

        if (bmi < 18.5) { 
            System.out.println("น้ำหนักตำกว่าเกนณ์");
        }
        else if ((bmi >= 18.5)&&(bmi <= 22.9)) {
            System.out.println("น้ำหนักตำกว่าเกนณ์");
        }
        else if ((bmi >= 23.0)&&(bmi <= 24.9)) {
            System.out.println("น้ำหนักสมส่วน");    
        }
        else if ((bmi >= 25.0)&&(bmi <= 29.9)) {
            System.out.println("น้ำหนักเกินมาตรฐาน");    
        }
        else {
            System.out.println("หยุดแดกดี้");    
        }
    }
}