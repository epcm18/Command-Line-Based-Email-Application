import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ContactLog {
	private boolean check;
	private ArrayList<String> recipients = new ArrayList<>();
	
	public void addContact(String contact) throws IOException {
		
		check = checkContact(contact);
		if (check==false) {
			File contactLog = new File("EmailClient.txt");
			BufferedWriter bw = new BufferedWriter(new FileWriter(contactLog,true));
			bw.append(contact);
			bw.append("\n");
			bw.close();
			System.out.println("Successfully added " + contact);
		}
		else {
			System.out.println("User already exists.");
		}
	}
	
	public boolean checkContact(String contact) throws FileNotFoundException {
		Scanner s = new Scanner(new FileReader("EmailClient.txt"));
		while (s.hasNext()) {
			this.recipients.add(s.nextLine());
		}
		if (recipients.contains(contact) ) {
			return true;
		}
		return false;
		
	}
}
