public class Starter {
 public static void main(String[] args) {
     hippo hip1 =new hippo();
     hippo hip2 =new hippo();
     hip1.name ="moodeng";
     hip1.age = 2;
     hip1.weight = 15;
    
     System.out.println(" "+hip1.name);
     System.out.println(" "+hip1.age+" year");
     System.out.println(" "+hip1.weight +"kg");
     System.out.println(" "+hip1.specie);
     System.out.println(" "+hip1.food);
     hip1.eat();

     hip2.name ="mootung";
     hip2.age = 14;
     hip2.weight = 110;
    
     System.out.println(" "+hip2.name);
     System.out.println(" "+hip2.age+" year");
     System.out.println(" "+hip2.weight +"kg");
     System.out.println(" "+hip2.specie);
     System.out.println(" "+hip2.food);
     hip1.deng();
 }   
}
