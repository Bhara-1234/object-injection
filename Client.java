package example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {
	public static void main(String args[]) throws Exception{
//		Student student = new Student();
//		MathCheat mc = new MathCheat();
//		student.setMathCheat(mc);
//		
		//student.cheating();
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("hello");
	}

}
