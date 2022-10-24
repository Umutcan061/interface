package Loggers;

public class DatabaseLogger implements Logger{

	@Override
	public void log(String mesaj) {

		System.out.println("Databaseye loglandı: ");
	}

}
