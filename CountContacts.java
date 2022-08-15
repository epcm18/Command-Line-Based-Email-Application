import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountContacts {
	public void count() throws FileNotFoundException {
		var log = new File("EmailClient.txt");
		var scanner = new Scanner(log);
		
		List<String> contacts = new ArrayList<>();
		while (scanner.hasNextLine()) {
			contacts.add(scanner.nextLine());
		}
		System.out.println(contacts.size());
		scanner.close();
	}
}
