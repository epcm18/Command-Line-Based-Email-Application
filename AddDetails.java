import java.io.IOException;

public class AddDetails {
	private String contact;
	
	public AddDetails(String contact) {
		this.contact = contact;
	}
	public void addContact() throws IOException {
		var log = new ContactLog();
		log.addContact(this.contact);
	}
}
