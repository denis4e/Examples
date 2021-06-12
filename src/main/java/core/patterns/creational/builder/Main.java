package core.patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        Car car = Car.builder().setName("KIA").setAge(3).setColor("Red").build();
        Tree tree = Tree.builder().setName("KIA").setAge(3).build();
        System.out.println(car.getAge() + car.getName() + car.getColor());
        System.out.println(tree.getAge() + tree.getName());
    }

    static class Car {

        private String name;
        private String color;
        private Integer age;

        public static Builder builder() {
            return new Builder();
        }

        public String getName() {
            return name;
        }

        public String getColor() {
            return color;
        }

        public Integer getAge() {
            return age;
        }

        private Car(Builder builder) {
            this.name = builder.name;
            this.color = builder.color;
            this.age = builder.age;
        }

        private static class Builder {
            private String name;
            private String color;
            private Integer age;

            public Builder setColor(String color) {
                this.color = color;
                return this;
            }

            public Builder setAge(Integer age) {
                this.age = age;
                return this;
            }

            public Builder setName(String name) {
                this.name = name;
                return this;
            }

            Car build() {
                return new Car(this);
            }
        }
    }
}

