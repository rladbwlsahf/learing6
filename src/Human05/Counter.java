package Human05;

public class Counter {
	public int no;
	
	public Counter(int no) {
		this.no = no;
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println
			(this.no + "번째 fianlize가 실행됨");
		super.finalize();
	}
	

}
