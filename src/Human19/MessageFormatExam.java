package Human19;

import java.text.MessageFormat;

public class MessageFormatExam {

	public static void main(String[] args) {
		String id = "Human";
		String name = "김우진";
		String tel = "010-1234-5678";
		
//		String text
		
		String tempText = "회원ID : {0}, \n회원이름 : {1} \n전화번호 : {2}";
		String text = MessageFormat.format(tempText, id,name,tel);
		
//		System.out.println(MessageFormat.format("회원ID : {0}, \n회원이름 : {1} \n전화번호 : {2}", id,name,tel));
		//위랑 같음 근데 위가 더 깔끔
		
		System.out.println(text);
	}

}
