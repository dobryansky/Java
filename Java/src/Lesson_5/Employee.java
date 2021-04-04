package Lesson_5;

public class Employee {
    private String name;
    private String post;
    private String email;
    private int salary;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Employee(String name, String post, String email, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }

    public static void print(Employee employee) {
        StringBuilder sb = new StringBuilder();
        sb.append(" ФИО-").append(employee.getName()).append(" Должность-").append(employee.getPost()).
                append(" email-").append(employee.getEmail()).append(" зарплата-").append(employee.getSalary()).
                append(" возраст-").append(employee.getAge());
        System.out.println(sb.toString());
    }
}
