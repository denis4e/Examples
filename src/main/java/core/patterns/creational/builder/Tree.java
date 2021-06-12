package core.patterns.creational.builder;

public class Tree {
    private String name;
    private int age;

    public Tree(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    static Builder builder() {
        return new Builder();
    }

    static class Builder {
        private String name;
        private int age;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        Tree build() {
            return new Tree(this);
        }
    }
}
