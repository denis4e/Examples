package core.generics.simpl;

public class Run {

    public static void main(String[] args) {
        Generic in = new Generic<>();
        in.setPassword(12345);
        in.setLogin("Denis");
        System.out.println(in.getPassword() + " " + in.getLogin());
        in.setLogin(1.2);
        System.out.println(in.getPassword() + " " + in.getLogin());


    }

}
