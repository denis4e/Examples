package core.exceptions.trow;

import javax.management.RuntimeErrorException;

public class TestEx {
	public void cool1() throws RuntimeErrorException {
		System.out.println("�������");
		throw new  RuntimeErrorException(null, "RTE");
	}
	public void cool2() throws SecurityException {
		System.out.println("�������");
		throw new SecurityException();
	}
}
