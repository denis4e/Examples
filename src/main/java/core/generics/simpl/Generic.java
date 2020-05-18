package core.generics.simpl;

public class Generic<T> {
	T  login;
	Integer password;
	public T getLogin() {
		return login;
	}
	public void setLogin(T login) {
		this.login = login;
	}
	public Integer getPassword() {
		return password;
	}
	public void setPassword(Integer password) {
		this.password = password;
	}

}