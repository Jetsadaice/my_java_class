
import java.util.Scanner;

public class over {

    public static double Areacalculate(double width, double height) {
        double z = width * height;
        return z;
    }

    public static double Areacalculate(double side) {
        double z = side * side;
        return z;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("คำนวนพื้นที่ สีเหลี่ยมผืนผ้า");
        System.out.println("ป้อนค่า กว้าง");
        double w = scanner.nextDouble();
        System.out.println("ป้อนค่ายาว");
        double h = scanner.nextDouble();
        System.out.println("ผลลัพธ์" + Areacalculate(w, h));

        System.out.println("คำนวนพื้นที่สีเหลียมจตุรัส");
        System.out.println("ป้อนค่า ด้าน ");
        double side = scanner.nextDouble();
        System.out.println("ผลลัพธ์" + Areacalculate(side));
    }
}
