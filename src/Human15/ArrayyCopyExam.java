package Human15;

import java.util.Arrays;

public class ArrayyCopyExam {

	public static void main(String[] args) {
		char[] arr1 = {'J','A','V','A'};
		//arr1[0] = 'J'
		//arr2[1] = 'V'
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		//arr1의 배열을 전체길이만큼 Copy
		System.out.println(Arrays.toString(arr2));
		
		char[] arr3 = Arrays.copyOfRange(arr2, 1, 3);
		System.out.println(Arrays.toString(arr3));
		
		char[] arr4 = new char[arr1.length]; // arr4의 배열크기를 지정
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		System.out.println(Arrays.toString(arr4));
		
		for (int i=0; i<arr4.length; i++) {
			System.out.printf("arr4[%d] : %c \n", i,arr4[i]);
		}
		arr4[2] = 'Z';
		System.out.println(Arrays.toString(arr4));
	}
}
