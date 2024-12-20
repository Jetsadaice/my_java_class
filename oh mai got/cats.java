
public class cats {

    public String name;
    public int age;
    public char gender;
    
    cats(int a) //special medtod
    {
        gender ='n';
        age = a;
    }

    public void sleep() {
        System.out.println("กูกำลังนอน");
    }

    public void play() {
        System.out.println("แมวตั้ง");
    }

    public void eat() {
        System.out.println("แมวแดก");
    }

}
