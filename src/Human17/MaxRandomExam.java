package Human17;

public class MaxRandomExam {

	public static void main(String[] args) {
		//	Math.random() : 0~1사이의 난수..(단,1은 미포함)
		//	주사위는 1,2,3,4,5,6 동일 확률로 나와야 함.
		//	0 <= Math.radnom() < 1
		// 	0*6 <= 6*Math.random() < 1*6 => 0~6
		//	0*6+1 < 6*Math.random()+1 < 1*6+1 ==> 1~7 (7은 미포함)
		//	현상황에서 소수점 버림.
		
		double temp1 = Math.random() * 6 + 1;			//	1~7사이의 난수
		double num1 = Math.floor(Math.random()*6+1);	//	소수점 버림.
		System.out.printf("주사위의 눈 %d \n",(int)num1);
		
		//	로또번호 (1~45 사이의 수)
		System.out.printf("1~45의 숫자 %d \n", (int) Math.floor(Math.random() * 45 + 1));

	}

}
