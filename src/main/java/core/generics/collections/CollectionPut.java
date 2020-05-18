
package core.generics.collections;

import java.util.*;
public class CollectionPut {
	public <T, K> void AddToCollection(){
		Coll co= new Coll();
		co.setName(12.2);
		co.setSurname("Denis");
		Map<T,K> c= new HashMap<T,K>();
		c.put((T)co.getName(),(K)co.getSurname());
		co.setName(2);
		co.setSurname("Pavel");
		c.put((T)co.getName(),(K)co.getSurname());
		co.setName(null);
		co.setSurname("Mark");
		c.put((T)co.getName(),(K)co.getSurname());
		System.err.println(c);
		}
	}
