package core.interfaces;

import java.util.function.Consumer;

public class ConsumerInterfaceClass {

    private String field;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public static void main(String[] args) {
        ConsumerInterfaceClass entity = new ConsumerInterfaceClass();
        method(entity, it -> it.setField("this is consumer"));
        System.out.println(entity.getField());
    }

    public static void method(ConsumerInterfaceClass entity, Consumer<ConsumerInterfaceClass> consumer) {
        consumer.accept(entity);
    }
}
