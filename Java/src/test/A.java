package test;

public class A {
    private int a;
    private int b;

    public A() {
    }

    @Override
    public int hashCode() {
        return a + b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static void main(String[] args) {
        A o1 = new A();
        A o2 = new A();

        o1.setA(1);
        o1.setB(2);

        o2.setA(1);
        o2.setB(2);

        /*
         * Проверка на эквивалентность.
         * Должно быть true
         * */
        System.out.println(o1.equals(o2));

        /*
         * Меняем значения местами, как с хэш-кодом
         * и проверяем...
         * */
        o2.setA(2);
        o2.setB(1);
        System.out.println(o1.equals(o2));
    }
}