import java.util.Scanner;

public class EmailClient {

	public static void main(String[] args) throws Exception {
		var auto = new AutoSend();
		auto.sendBdayWish();
		outerloop :
		while (1<2) {
			Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter option type: \n"
	              + "1 - Adding a new recipient\n"
	              + "2 - Sending an email\n"
	              + "3 - Printing out all the recipients who have birthdays\n"
	              + "4 - Printing out details of all the emails sent\n"
	              + "5 - Printing out the number of recipient objects in the application \n"
	              + "6 - Exit");
	
	        int option = scanner.nextInt();
	        
	        switch (option) {
	        	case 1 :
	        		System.out.println("Add a new contact \n"
	        				+ "input format \n"
	        				+ "Official: nimal,nimal@gmail.com,ceo \n"
	        				+ "Friends: nimal,<nickname>,email,birthday");
	        		var scanner1 = new Scanner(System.in);
	        		String contact = scanner1.nextLine();
	        		
	        		var details = new AddDetails(contact);
	        		details.addContact();
	                break;
	        	 case 2:
	        		 System.out.println("Send an email \nAdd details to send an email \n"
	        		 		+ "input format - email, subject, content");
	        		 var scanner2 = new Scanner(System.in);
	        			System.out.println("***Recipient Details***");
	        			System.out.println("Email: ");
	        			String recipientName = scanner2.nextLine();
	        			System.out.println("Subject: ");
	        			String subject = scanner2.nextLine();
	        			System.out.println("content: ");
	        			String content = scanner2.nextLine();
	        			
	        			var mailbox = new MailBox(recipientName, subject, content);
	        			mailbox.fillDetails();
	                 break;
	             case 3:
	            	 System.out.println("Check your friends' birthdays \n"
	            	 		+ "input format - yyyy/MM/dd (ex: 2018/09/17)");
	            	 var scanner3 = new Scanner(System.in);
	         		
	         		 String birthDay = scanner3.nextLine();
	         		 var recipients = new BdayRecipients();
	        		 recipients.loadData(birthDay);
	                 break;
	             case 4:
	            	 System.out.println("Check the emails sent \n"
		            	 		+ "input format - yyyy/MM/dd (ex: 2018/09/17)");
	            	 var scanner4 = new Scanner(System.in);
	            	 String day = scanner4.nextLine();
	            	 var mail = new SentMails();
	            	 mail.readFile(day);
	                 break;
	             case 5:
	            	 System.out.println("Print the number of contacts");
	            	 var count = new CountContacts();
	         		 count.count();
	                 break;
	             case 6:
	            	 System.out.println("Exiting from the app.");
	            	 break outerloop;
	            	 
	        }
		}	
	}

}
