import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SentMails {
	private String data;

	
	public void serialize(String name, String subject, String content) throws FileNotFoundException, IOException, ClassNotFoundException {
		data = java.time.LocalDate.now().toString() + ", To: "+ name + ", Subject: " + subject + ", Content: " + content + "";
		
	
		try {
			new File("clientList.txt");
			appendFile(data);
		} catch (Exception e) {
			ObjectOutputStream os1 = new ObjectOutputStream(new FileOutputStream("clientList.txt"));
			os1.writeObject(new Mails("first"));
			os1.close();

		}
		
	}
	
	public void appendFile(String data) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectOutputStream os2 = new ObjectOutputStream(new FileOutputStream("clientList.txt", true)) {
			protected void writeStreamHeader() throws IOException {
                reset();
            } 
		};
		
		os2.writeObject(data);
		os2.close();
	}
	
	public void readFile(String date) throws FileNotFoundException, IOException {
		ObjectInputStream is1 = new ObjectInputStream(new FileInputStream("clientList.txt"));
		ArrayList<Object> dataStored = new ArrayList<Object>();
		
		
		while (true) {
			try {
				dataStored.add(is1.readObject());
			} catch (Exception e) {
				break;
			}
		}
		
		var datastore = new DataStore();
		datastore.readData(dataStored, date);
		
	}
}

class EndofFile implements Serializable {
	
}