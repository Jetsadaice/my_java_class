
import java.util.Scanner;

//for loop
// import java.util.Scanner;

// public class sudkon {
//     public static void main(String[] args) {
//       int number; 
//       Scanner keybord =new Scanner(System.in);
//       System.out.println("INPUT NUMBER ");
//       number = keybord.nextInt();
   
//     for (int count =1; count <=12; count++){
//             System.out.println(count + "x"+number+"="+(count*number));
//             }
//         }
//     }


// while loop
// import java.util.Scanner;

// public class sudkon {
//     public static void main(String[] args) {
//       int number; 
//       Scanner keybord =new Scanner(System.in);
//       System.out.println("INPUT NUMBER ");
//       number = keybord.nextInt();
//    int count = 1;
//    while (count<=12) {
//     System.out.println(count + "x"+number+"="+(count*number));      
//         ++count;     
//             }
//         }
//     }

//do while
public class doWhile{
    public static void main(String[] args) {
        String input;
        char repeat;
        Scanner scan=new Scanner(System.in);
        do { 
            System.err.println("My program....");
            System.out.println("Do wanna leave (y/n)");
            input=scan.nextLine();
            repeat=input.charAt(0);
        } while (repeat == 'Y'  ||  repeat == 'y' );
        System.out.println("oh no why you leave");
    }

}