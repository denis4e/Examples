package core.patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
    Car car = new Car.Builder("KIA").setAge(12).setColor("Red").build();
        System.out.println(car.getAge());
        System.out.println(car.getName());
        System.out.println(car.getColor());
    }


    static class Car {

        private String name;
        private String color;
        private Integer age;

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

            Builder(String name) {
                this.name = name;
            }

            public Builder setColor(String color) {
                this.color = color;
                return this;
            }

            public Builder setAge(Integer age) {
                this.age = age;
                return this;
            }

            Car build(){
                return new Car(this);
            }
        }
    }
}

