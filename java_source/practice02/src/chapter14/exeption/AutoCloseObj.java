package chapter14.exeption;

public class AutoCloseObj implements AutoCloseable  {

	@Override
	public void close() throws Exception {
		System.out.println("close()");
		
	}

}