package kodlama.io.project.core.logging;

public class FileLogger implements Logger {

	public void log(String mesaj) {

		System.out.println("Dosyaya loglandı:"+ mesaj);
	}

}
