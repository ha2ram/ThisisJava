package chap08;

public class Example {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();

		InterfaceA ia = impl;
		ia.methodA(); // InterfaceA 변수는 methodA()만 호출 가능
		System.out.println();

		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();

		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
