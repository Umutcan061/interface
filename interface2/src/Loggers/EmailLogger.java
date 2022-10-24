package Loggers;

public class EmailLogger implements Logger {

	@Override
	public void log(String mesaj) {

		
		System.out.println("Emaile loglandı");
	}

}
