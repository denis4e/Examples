package core.all;
public class App {
    public static int b;
	public static void main(String[] args) {
        System.err.println(f());
    }
    public static int f() {
        try {
            System.err.println("��� ���������� ���!!!???");
            throw new Error("� ���� ������ ���� � ������!!!");
        } finally {
            throw new RuntimeException("�������� ������� ;-)");
        }
    }
}
