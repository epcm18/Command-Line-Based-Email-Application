import java.util.ArrayList;

public class DataStore {
	private ArrayList<String> serializedData = new ArrayList<String>();
	
	public void readData(ArrayList<Object> datastore, String date) {
		
		for (int i=0; i<datastore.size(); i++) {
			serializedData.add(datastore.get(i).toString());
		}
	
		printData(date);
	}
	
	public void printData(String day) {
		
		String newday = day.substring(0, 4) + "-" + day.substring(5, 7) + "-" + day.substring(8, 10);
		for (int i=0; i<this.serializedData.size(); i++) {
			if (this.serializedData.get(i).contains(newday)) {
				System.out.println(serializedData.get(i));
			}
			
		}
	}
}
