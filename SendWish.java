
public class SendWish {
	private String email;
	private String[] recipients = new String[3];
	
	public void fillDetails(String contact) throws Exception {
		String[] values = contact.split(",");
		for (int i=0; i<values.length;i++) {
			String substr = values[i];
			if (substr.contains("@")) {
				email = values[i];
				if (i==1) {
					sendOffice();
				}
				else if(i==2) {
					sendPersonal();
				}
			}
		}
	}
	
	public void sendOffice() throws Exception {
		recipients[0] = email;
		recipients[1] = "Happy Birthday";
		recipients[2] = "Wish you a Happy Birthday. Pasindu";
		Mail.sendMail(recipients);
	}
	
	public void sendPersonal() throws Exception {
		recipients[0] = email;
		recipients[1] = "Happy Birthday";
		recipients[2] = "Hugs and love on your birthday. Pasindu";
		Mail.sendMail(recipients);
	}
	
}
