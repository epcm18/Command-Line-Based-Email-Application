import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class BdayRecipients {
	private String contact;
	
	public void loadData(String date) throws Exception {
		ArrayList<String> recipients = new ArrayList<>();
		Scanner s = new Scanner(new FileReader("EmailClient.txt"));
		
		while (s.hasNext()) {
			recipients.add(s.nextLine());
		}
		
		for (int i=0; i<recipients.size(); i++) {
			String substr = recipients.get(i);
			if (substr.contains(date.substring(5, 10))) {
				this.contact = recipients.get(i);
				int iend = contact.indexOf(",");
				System.out.println(contact.substring(0, iend) + " has birthday.");
			}
			
		}
	}
	
}
