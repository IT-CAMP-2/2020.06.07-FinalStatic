package pl.camp.it;

public class Main {

    public static void main(String[] args) {
        final ExampleClass exampleClass = new ExampleClass();

        System.out.println(exampleClass.b);

        exampleClass.b = false;

        System.out.println(exampleClass.b);


        Car c1 = new Car();
        Car c2 = new Car();

        c1.id = 5;
        c1.brand = "BMW";

        c2.id = 6;
        c2.brand = "KIA";

        System.out.println(c1.id);
        System.out.println(c1.brand);

        System.out.println(c2.id);
        System.out.println(c2.brand);

        A.a();

    }
}
