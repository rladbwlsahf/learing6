package Human90;

public class NewInstanceExam {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class clazz1 = Class.forName("Human90.BodyInfo");
		Info info = (Info) clazz1.newInstance();
		
		System.out.print()
	}

}
