package Human17;

import java.util.Arrays;
import java.util.Random;

public class RandomExam {

	public static void main(String[] args) {
		long seed1;
		seed1 = System.currentTimeMillis();
		
		int[] selectNum1 = new int[6];
		Random r1 = new Random(seed1);
		
		System.out.print("선택번호 : ");
		for(int i =0; i<selectNum1.length; i++) {
			selectNum1[i] = r1.nextInt(45) + 1; //(1~45 사이의수)
			System.out.printf("%d ", selectNum1[i]);
		}
		System.out.println();
		
		long seed2 = System.currentTimeMillis();
		Random r2 = new Random(seed2);
		
		System.out.print("선택번호 : ");
		for(int i =0; i<selectNum2.length; i++) {
			selectNum2[i] = r2.nextInt(45) + 1; //(1~45 사이의수)
			System.out.printf("%d ", selectNum2[i]);
		}
		
		Arrays.sort(selectNum1);
		Arrays.sort(selectNum2);
		
		
	}

}
