package lession21;
/**
 * The class to work with Annotation 
 * 
 * @author ARTUR
 * @since JDK 13.0.2
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface MyAnnotation {
	String value() default "";
}
