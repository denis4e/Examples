package tes9.nested.clazz;

public class InnerNestedAndStatic {
    private static String abbr = "class";


    // Simple Nested Inner Class
    class Inner {
        public void show() {
            System.out.println("inner nested " + abbr);
        }
    }

    // Simple Nested Inner Class
    private static class InnerStatic {
        public static void show() {
            System.out.println("inner static " + abbr);
        }
    }

    public static void main(String[] args) {
        InnerNestedAndStatic.Inner inner = new InnerNestedAndStatic().new Inner();
        inner.show();

        InnerNestedAndStatic.InnerStatic.show();
    }
}

