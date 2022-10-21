package Human04_2;

import Human04_2.Member;

public class MemberExam {
	public static void main(String[]args) {
		int[] score = {10,20,30};
		Car car1 = new Car("아이오닉6",120);
		Member origin 
		= new Member("Black", "김우진","12345", 26
				, true, score,car1);
		
		
		Member cloned = origin.getMember();
		
		cloned.password = "67890";
		cloned.score[0] = 100;
		cloned.car.model = "기아차";
		
		System.out.println(origin.password);
		System.out.println(cloned.password);
		
		System.out.println(origin.score[0]);
		System.out.println(cloned.score[0]);
		
		System.out.println(origin.car.model);
		System.out.println(cloned.car.model);

		
	}

}
