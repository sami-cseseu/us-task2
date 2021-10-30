import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {
	private String FILE_NAME = "data-save.txt";
	private String OTHER_FILE_NAME = "other-data-save.txt";
	public void makeFileAndSave(String data) {
		if(isFileExist(FILE_NAME)) {
			saveToFile(data);
		}
	}
	
	public boolean isFileExist(String fileName) {
		File file = new File(fileName);
		if(file.exists() && !file.isDirectory()) { 
		    return true;
		}
		
		return false;
	}
	
    public void saveToFile(String data) {
     String content = "<html><body>"+data+"</body></html>";	
	 try {
		  String path = FILE_NAME;
		  File  file = new File(path);
	      FileWriter myWriter = new FileWriter(file);
	      myWriter.write(content);
	      myWriter.close();
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	}
    
    public void saveOtherCompanyFile(String data) {
    	if(isFileExist(OTHER_FILE_NAME)) {
    		saveToOtherFile(data);
		}
    }
    
    
    public void saveToOtherFile(String data) {
     String content = "<html><body>"+data+"</body></html>";	
   	 try {
   		  String path = OTHER_FILE_NAME;
   		  File  file = new File(path);
   	      FileWriter myWriter = new FileWriter(file);
   	      myWriter.write(content);
   	      myWriter.close();
   	    } catch (IOException e) {
   	      e.printStackTrace();
   	    }
   	}
}
