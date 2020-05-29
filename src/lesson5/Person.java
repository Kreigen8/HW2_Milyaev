package lesson5;

public class Person {

    private String name;
    private String job;
    private String email;
    private int tel;
    private int salary;
    private int age;

    public Person(String name, String job, String email, int tel, int salary, int age) {
        this.name = name;
        this.job = job;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println(name + " " + job + " " + email + " " + tel + " " + salary + " " + age);
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getEmail() { return email; }

    public int getTel() { return tel; }

    public int getSalary() { return salary; }

    public int getAge() {
        return age;
    }
}
