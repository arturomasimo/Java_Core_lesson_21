package lession21;
/**
 * The class to work with Annotation 
 * 
 * @author ARTUR
 * @since JDK 13.0.2
 */
public class Worker {
	@MyAnnotation(value = "Worker PIB")
	private String pib;
	@MyAnnotation(value = "Worker posada")
	private String posada;
	@MyAnnotation(value = "Worker age")
	private int age;

	public Worker() {
	};

	public Worker(String pib, String posada) {
		super();
		this.pib = pib;
		this.posada = posada;
	}

	public Worker(String pib, String posada, int age) {
		super();
		this.pib = pib;
		this.posada = posada;
		this.age = age;
	}

	public String getPib() {
		return pib;
	}

	public void setPib(String pib) {
		this.pib = pib;
	}

	public String getPosada() {
		return posada;
	}

	public void setPosada(String posada) {
		this.posada = posada;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Worker [pib=" + pib + ", posada=" + posada + ", age=" + age + "]";
	}

}
