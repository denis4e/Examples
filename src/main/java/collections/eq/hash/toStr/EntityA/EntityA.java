package collections.eq.hash.toStr.EntityA;

import java.util.Comparator;

public class EntityA {
    private int age;
    private int height;
    private String name;

    public EntityA(int age, int height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + height;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.name == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        EntityA other = (EntityA) obj;
        if (age != other.age) return false;
        if (height != other.height) return false;
        if (this.name == null && other.name != null) {
            return false;
        }
        if (this.name == null && other.name == null) {
            return true;
        }
        if (this.name != null && other.name == null) {
            return false;
        }
        if (this.name.length() != other.name.length()) return false;
        if (this.name != null) {
            if (other.name != null) {
                char v1[] = this.name.toCharArray();
                char v2[] = other.name.toCharArray();
                int i = 0;
                int n = this.name.length();
                while (n-- != 0) {
                    if (v1[i] != v2[i])
                        return false;
                    i++;
                }
                return true;
            }
            return false;
        }
        return false;
    }


    @Override
    public String toString() {
        return "EntityA [Age=" + age + ", Height=" + height + ", Name=" + name + "]";
    }

    public static void main(String[] args) {
        System.out.println("------Java 7 with equals------");
        EntityA acct0 = new EntityA(256, 465, "Vlad");
        EntityA acct1 = new EntityA(256, 465, "Vlad1");
        System.out.println("RESULT - " + acct0.equals(acct1));
        System.out.println("------Java 7 classic Comparator by Name------");
        Comparator<EntityA> byName = new Comparator<EntityA>() {
            @Override
            public int compare(EntityA o1, EntityA o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        System.out.println("RESULT - " + (byName.compare(acct0, acct1) == 0));
        System.out.println("------Java 8 use Comparator by Name------");
        Comparator<EntityA> forName = (o2, o1) -> o1.getName().compareTo(o2.getName());
        System.out.print("RESULT - " + (forName.compare(acct0, acct1) == 0));
    }
}
