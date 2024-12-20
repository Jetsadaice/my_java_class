public class Cat {
   public String name;
   public int age;
   public char gender;
   public String species;
   public String color; 
   public Cat()
   {
      gender = 'm';
   }
   public void eat()
   {     System.out.println("Eat");}
   public void sleep()
   {  System.out.println("Sleep");}
   public void getter()
   { System.out.println("name ="+name);
   System.out.println("age ="+age);
   System.out.println("gender ="+gender);
   System.out.println("species ="+species);
   System.out.println("color ="+color);
   }
}
