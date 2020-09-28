package by.htp.les07.task02.main;

public class Test2 {
	private int a;
	private int b;
	
	public Test2(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public Test2 () {
		this.a=10;
		this.b=20;
	}
	public void setA(int a) {
		this.a=a;
	}
	public int getA(int a) {
		return this.a;
	}
	public void setB(int b) {
		this.b=b;
	}
	public int getB(int b) {
		return this.b;
	}
	public void print() {
		System.out.println(this.a);
		System.out.println(this.b);
	}
}
