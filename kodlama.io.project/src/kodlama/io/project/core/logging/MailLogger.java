package kodlama.io.project.core.logging;

public class MailLogger implements Logger{

	public void log(String mesaj) {
		System.out.println("Mail gönderildi: "+mesaj);
	}

}
