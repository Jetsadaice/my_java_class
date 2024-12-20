
public class what_r_u_doing_cat {

    public static void main(String[] args) {
        cats cats1 = new cats(2);
        cats cats2 = new cats(3);
        cats cats3 = new cats(4);

        cats1.name = "moodeng";
        //cats1.gender = 'm';
        // cats1.age = 90;
        cats1.sleep();
        System.out.println("  " + cats1.name);
        System.out.println("  " + cats1.age);
        System.out.println("  " + cats1.gender);

        cats2.name = "moowan";
        // cats2.gender = 'm';
        // cats2.age = 90;
        cats2.eat();

        cats3.name = "mooping";
        // cats3.gender = 'm';
        // cats3.age = 90;
        cats3.play();

    }
}
