import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class AutoSend {
	private String date = java.time.LocalDate.now().toString();
	private String contact;
	
	public void sendBdayWish() throws Exception {
		String newDate = date.substring(0, 4) + "/" + date.substring(5, 7) + "/" + date.substring(8, 10);
		ArrayList<String> recipients = new ArrayList<>();
		Scanner s = new Scanner(new FileReader("EmailClient.txt"));
		
		while (s.hasNext()) {
			recipients.add(s.nextLine());
		}
		
		for (int i=0; i<recipients.size(); i++) {
			String substr = recipients.get(i);
			if (substr.contains(newDate.substring(5, 10))) {
				var wish = new SendWish();
				this.contact = recipients.get(i);
				int iend = contact.indexOf(",");
				System.out.println(contact.substring(0, iend) + " has birthday today. \n"
						+ "Seending a birthday wish to him.");
				wish.fillDetails(contact);
			}
			
		}
	}
}
