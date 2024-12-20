public class students {
    private String id;
    private String name;
    private double gpa;
    public void set(String stdid, String stdname, double stdgpa)
    {
        id = stdid;
        name = stdname;
        gpa = stdgpa;
    }
    public void get()
    {
        System.out.println("id = " +id );
        System.out.println("name = " +name );
        System.out.println("gpa = " +gpa );


    }
}

