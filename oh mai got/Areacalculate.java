
import java.util.Scanner;


// import java.util.Scanner;

// public class Areacalculate {

//     public static double Areacalculate(int a) {
//         double z = a + a;
//         return z;
//     }
//     public static double Areacalculate(int a, int b) {
//         double z = a * b;
//         return z;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("รับค่า ตัวแปร A เพื่อใช้ใน Method ตัวที่ 1 ");
//         int aa = scanner.nextInt();
//         System.out.println("ผลลัพธ์ method ตัวที่ 1 " + Areacalculate(aa));
//         System.out.println("รับค่า ตัวแปร B เพื่อใช้ใน Method ตัวที่ 2 ");
//         int bb = scanner.nextInt();
//         int cc = scanner.nextInt();
//         System.out.println("ผลลัพธ์ B C  method ตัวที่ 2 " + Areacalculate(bb, cc));

//     }
// }

public class Areacalculate {

    public static double Areacalculate(double width,double height) {
        double z = width * height;  
        return z;
    }
    public static double Areacalculate(double side) {
        double z = side*side;  
        return z;
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("คำนวนพื้นที่ สีเหลี่ยมผืนผ้า");
        System.out.println("ป้อนค่า กว้าง"); 
        double w = scanner.nextDouble();
        System.out.println("ป้อนค่ายาว");
        double h =scanner.nextDouble();        
        System.out.println("ผลลัพธ์" + Areacalculate(w,h));
        
        System.out.println("คำนวนพื้นที่สีเหลียมจตุรัส");
        System.out.println("ป้อนค่า ด้าน "); 
        double side = scanner.nextDouble();
        System.out.println("ผลลัพธ์" + Areacalculate(side));
    }
}
