package ua.ithillel.oop.classes;

public class Outer {
    private static int OUTER_INT_CONST = 100;

    private int outerInt;

    public Outer(int outerInt) {
        this.outerInt = outerInt;


    }

    public class Inner {
        private int innerInt;

        public Inner(int innerInt) {
            System.out.println("outer" + outerInt);
            System.out.println("inner" + innerInt);
        }

    }

    public static class StaticInner {
        public StaticInner() {
            System.out.println("staticInner" +  OUTER_INT_CONST);
        }
    }

}
