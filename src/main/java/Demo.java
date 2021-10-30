import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo {

	public static void main(String[] args) throws IOException, ServletException {
		Demo Demo = new Demo();
	    Demo.readUserData(null, null);
	}
	
	public void readUserData(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String details = req.getParameter("details");
		DataProcessor dataProcessor = new DataProcessor();
		dataProcessor.parseData(details);
	}
}
