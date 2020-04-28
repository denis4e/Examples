package tes.all;
public class App {
    public static int b;
	public static void main(String[] args) {
        System.err.println(f());
    }
    public static int f() {
        try {
            System.err.println("Что происходит бля!!!???");
            throw new Error("Я лечу ребята всем с торону!!!");
        } finally {
            throw new RuntimeException("Подвинся сосунок ;-)");
        }
    }
}
