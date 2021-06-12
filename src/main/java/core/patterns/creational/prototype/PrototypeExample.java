package core.patterns.creational.prototype;

public class PrototypeExample {

    public static void main(String[] args) {

        PlasticTree plasticTree = new PlasticTree(10, 25);
        plasticTree.setPosition("top");
        PlasticTree anotherPlasticTree = (PlasticTree) plasticTree.copy();
        anotherPlasticTree.setPosition("bottom");
    }
}

