
import java.util.Properties;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;

public class Mail {
	public static void sendMail(String[] recipient) throws Exception {
		System.out.println("Sending...");
		Properties properties = new Properties();
		
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		
		String myAcc = "your email address";
		String password = "api";
		
		Session session = Session.getInstance(properties, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(myAcc, password);
			}
		});
		
		Message message = prepareMessage(session, myAcc, recipient);
		
		Transport.send(message);
		System.out.println("Mail sent succesfully.");
		var sentmails = new SentMails();
		//sentmails.setFile();
		sentmails.serialize(recipient[0], recipient[1], recipient[2]);
	}
	
	public static Message prepareMessage(Session session, String myAcc, String[] recipient) throws Exception {
		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress(myAcc));
		message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient[0]));
		message.setSubject(recipient[1]);
		message.setText(recipient[2]);
		//var sentmails = new SentMails(recipient[0], recipient[1], recipient[2]);
		//sentmails.serialize();
		return message;
	}
}
