package dataProviders;
	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
	import java.util.List;
	import com.google.gson.Gson;


import managers.FileReaderManager;
import testDataTypes.Users;
	
public class JsonDataReader {
	private final String userFilePath = FileReaderManager.getInstance().getConfigReader().getTestDataResourcePath() + "Users.json";
	private List<Users> userList;
	
	public JsonDataReader(){		
		userList = getUserData();
	}
	
	private List<Users> getUserData() {
		Gson gson = new Gson();
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(userFilePath));
			Users[] users = gson.fromJson(bufferReader, Users[].class);
			return Arrays.asList(users);
		}catch(FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + userFilePath);
		}finally {
			try { if(bufferReader != null) bufferReader.close();}
			catch (IOException ignore) {}
		}
	}
		
	//public final Users getUserByEmail(String email){
			// return userList.stream().filter(x -> x.email.equalsIgnoreCase(email)).findAny().get();
	//}
	

}