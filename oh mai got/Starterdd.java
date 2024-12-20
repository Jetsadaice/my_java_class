public class Starterdd {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        cat1.name ="ข้าวเหนียว";
        cat1.age = 1;
        //cat1.gender = 'm'; ไม่ต้องสร้างเพราะกำหนดใน construter แล้ว
        cat1.color="red";
        cat1.species="thai";

        cat1.eat();
        cat1.sleep();
        cat1.getter();

    }
}
