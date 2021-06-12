package core.interfaces;

import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionInterfaceClass {

    private String field;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public static void method(Function<String, String> function, String value) {
        System.out.println(function.apply(value));
    }

    public static void main(String[] args) {
        FunctionInterfaceClass sup = new FunctionInterfaceClass();
        sup.setField("test message");
        method(it -> it.toUpperCase(), sup.getField());
    }
}
