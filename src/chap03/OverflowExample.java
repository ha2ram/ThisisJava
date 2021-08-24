package chap03;

public class OverflowExample {
	public static void main(String[] args) {
//		int x = 1000000;
//		int y = 1000000;
//		int z = x * y;	//int 타입에 저장될 수 있는 값의 범위 초과
		
		long x = 1000000;
		long y = 1000000;
		long z = x * y;
		System.out.println(z);
	}
}
