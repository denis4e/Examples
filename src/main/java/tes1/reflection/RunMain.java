package tes1.reflection;
public class RunMain {
public static void main(String[] args) {
		FruitTrees fr= new FruitTrees();
		fr.FruitStart();
		SpruceTree spr= new SpruceTree();
		fr.reflectInfo(spr);
}
}


