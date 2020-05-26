package lession21;
/**
 * The class to work with Annotation 
 * 
 * @author ARTUR
 * @since JDK 13.0.2
 */
import java.io.*;
import java.lang.reflect.Field;

public class GetInform {

	public static void getInformAndWriteToFile(Class<?> inputClass) throws IOException {
		Field[] fields = inputClass.getDeclaredFields();
		Writer w = new FileWriter("MyAnnotation.txt");
		System.out.println("Print to console and write to file \"MyAnnotation.txt\" fields in class Worker");
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			if (field.getAnnotation(MyAnnotation.class) instanceof MyAnnotation) {
				System.out.println("Field name= " + field.getName() + ", annotation = "
						+ field.getAnnotation(MyAnnotation.class).value() + ", type field = "
						+ field.getType().getName());
				w.write("Field name= " + field.getName() + ", annotation = "
						+ field.getAnnotation(MyAnnotation.class).value() + ", type field = "
						+ field.getType().getName());
			}

		}
		System.out.println("Close file \"MyAnnotation.txt\"");
		w.close();
	}

}
