package core.interfaces;

import java.util.function.Supplier;

public class SupplierInterfaceClass {

    private String field;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public void method(Supplier<String> supplier) {
        System.out.println(supplier.get() + " a supplier test");
    }

    public static void main(String[] args) {
        SupplierInterfaceClass sup = new SupplierInterfaceClass();
        sup.setField("This is");
        sup.method(() -> sup.getField());
        sup.method(() -> sup.getField().toUpperCase());
    }
}
