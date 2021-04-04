package Lesson_5;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Вася", "дворник", "fпееhfh@li.tu", 30, 34);
        employees[1] = new Employee("Дима", "шеф", "fhfh@пеli.tu", 56, 23);
        employees[2] = new Employee("Света", "повар", "fhпеfh@li.tu", 36, 43);
        employees[3] = new Employee("Люся", "секретарь", "fhпеfh@li.tu", 39, 45);
        employees[4] = new Employee("Петя", "учитель", "fhепfh@li.tu", 20, 67);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                Employee.print(employees[i]);
            }
        }
    }
}
