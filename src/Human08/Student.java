package Human08;

import java.util.Objects;

public class Student {
	
	public int sNo;
	public String name;
	
	public Student(int sNo, String name) {
		this.sNo = sNo;
		this.name = name;
	}
	
	public int hashCode() {
		return Objects.hash(sNo,name);
//		return Objects.hash(name);
		//Objects가 가지고있는 hashCode로직을.
		//멤버 변수 기반으로 hashCode를 만드는 것으로 오버라이딩.

		
	}

}
