package Human05;

public class FinalizeExam {

	public static void main(String[] args) {
			Counter cnt = null;
			
			for (int i=0; i<=50; i++) {
				cnt = new Counter(i);
				
				cnt = null;
				
				System.gc();
			}
			// gc는 GarbageCollector를 의미하고,
			// gc() 메서드 호출에 의해서 finalize()가 호출.
	}

}
