package Human01_2;

public class Member extends Object {
	public int age;
	public int score;
	
	public Member(int id) {
		this.age = age;
	}
	public Member(int age,int score) {
		this.age = age;
		this.score = score;
	}
	
	//	Object가 가지고 있는 equals를 오버라이딩 하여
	//	아래와 같이 재정의함.

	public boolean equals(Member m) {
		// Member m = m2;
		if(this.age == m.age) {
			return true;
		}
		return false;
		
	}
}
	
	