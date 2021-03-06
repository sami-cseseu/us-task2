
public class DataProcessor {
	public void parseData(String data) {
		String[] user = data.split(",");
		checkId(user);
	}
	
	public void checkId(String[] user) {
		if(user.length == 4 && user[0] != null) {
			checkCompany(user);
		}
	}
	
	public void checkCompany(String[] user) {
		if(user.length == 4 && user[1] == "UPB") {
			informationCheck(user);
		} else {
			checkOtherCompany(user);
		}
	}
	
	
	public void informationCheck(String[] user) {
		if(user.length == 4 && user[3] != null) {
			String details = user[3].substring(0, Math.min(user[3].length(), 100));
			Validator validator = new Validator();
			validator.removeScriptAndSaveFile(details);
		}
	}
	
	public void checkOtherCompany(String[] user) {
		if(user.length == 4 && user[3] != null) {
			FileOperation fileOperation = new FileOperation();
			String details = user[0] + " : " +user[3].substring(0, Math.min(user[3].length(), 100));
			fileOperation.saveOtherCompanyFile(details);
		}
	}
}
