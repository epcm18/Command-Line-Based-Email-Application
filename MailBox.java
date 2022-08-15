
public class MailBox {
	private String[] recipient = new String[3];
	private String name;
	private String subject;
	private String content;
	
	public MailBox(String name, String subject, String content) {
		this.name = name;
		this.subject = subject;
		this.content = content;
	}
	
	public void fillDetails() throws Exception {
		recipient[0] = this.name;
		recipient[1] = this.subject;
		recipient[2] = this.content;
		Mail.sendMail(recipient);

	}
}
