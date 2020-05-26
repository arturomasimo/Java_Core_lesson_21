package lession21;

/**
 * The Main class to work with Annotation 
 * 
 * @author ARTUR
 * @since JDK 13.0.2
 */
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		GetInform.getInformAndWriteToFile(Worker.class);
	}
}
