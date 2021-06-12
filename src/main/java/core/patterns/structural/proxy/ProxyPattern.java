package core.patterns.structural.proxy;

public class ProxyPattern {
    public static void main(String[] args) {
        Video video = new ProxyVideo("Film #1");
        video.display();
        System.out.println("");
        video.display();
    }

}
