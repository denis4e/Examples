package core.generics.collections.ext;

import java.util.ArrayList;
import java.util.List;

public class Container {
	List<Product> ar= new ArrayList<>();
	
public <T extends Product>  void addProduct(Product p){	
	ar.add(p);
}

void print (){
	for (int i = 0; i < ar.size(); i++) {
		System.out.println(ar.get(i));
	}
	
}

}
