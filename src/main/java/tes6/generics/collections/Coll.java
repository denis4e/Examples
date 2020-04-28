package tes6.generics.collections;

public class Coll<T, K> {
	T name ;
	K surname;
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	public K getSurname() {
		return surname;
	}
	public void setSurname(K surname) {
		this.surname = surname;
	}

}

