
public class Validator {
	
	public void removeScriptAndSaveFile(String details){
		String data = details.replaceAll("\\<.*?\\>", "");
		FileOperation fileOperation = new FileOperation();
		fileOperation.makeFileAndSave(data);
	}
}
