package kodlama.io.project.core.logging;

public class DatabaseLogger implements Logger {

	public void log(String mesaj) {
		System.out.println("Veritabanına loglandı: "+ mesaj);
	}

}
