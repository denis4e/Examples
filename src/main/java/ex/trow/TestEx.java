package ex.trow;

import java.io.IOException;

import javax.management.RuntimeErrorException;

public class TestEx {
	public void cool1() throws RuntimeErrorException {
		System.out.println("Бросаем");
		throw new  RuntimeErrorException(null, "RTE");
	}
	public void cool2() throws SecurityException {
		System.out.println("Бросаем");
		throw new SecurityException();
	}
}
