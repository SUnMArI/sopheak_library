package User;

public abstract class Person {
    private String firstName ;
    private String lastName;
    private String gender;
    private int age;
    private String province;
    private String email;
    private String password;
    private boolean statue;


    public Person(String firstName, String lastName, String gender, int age, String province, String email, String password, boolean statue) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.province = province;
        this.email = email;
        this.password = password;
        this.statue = statue;
    }
}
