import java.util.Scanner;

public class switcha {
    public static void main(String[] args) {
        int number;
        Scanner hinp = new Scanner(System.in);
        System.out.println(".(ชั้นไหนพี่ :)");
        number = hinp.nextInt();
        
        switch (number) {
            case 1:
                {System.out.println("ชั้น1");}
                break;
            case 2:
                {System.out.println("ชั้น2");}
                break;
            case 3:
                {System.out.println("ชั้น3");}
                break;
            case 4:
                {System.out.println("ชั้น4");}
                break;
            default:
                {System.out.println("ไปไหนอะ");}
                break;
        }
    }
}
