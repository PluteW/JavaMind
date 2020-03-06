package JavaMind.week3;

public class orderTest {
    public static void main(String[] args) {

        System.out.println ("Circle constructor");

        Circle b = new Circle ();

        System.out.println ("b.k="+b.k);

    }
}
class Shape {

    private static int i;

    protected static int j=10;

    Shape () {

        System.out.println ("i = " + i + ", j = " + j);

        j = 5;

    }

    private static int x1 = printInit("private Shape.x1 initialized");

    static int printInit(String s) {

        System.out.println (s);

        return ++i;

    }

}

class Circle extends Shape {

    int k = printInit("Circle.k initialized");

    public Circle () {

        System.out.println ("k = " + k);

        System.out.println ("j = " + j);

        System.out.println ("x2 = " + x2);

        super.printInit("super");

    }

    public static int x2 = printInit("public Circle.x2 initialized");

}
