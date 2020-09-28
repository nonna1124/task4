package by.htp.les07.task07.main;

public class Test1 {
	private int a;
	private int b;
	
	public Test1(int a,int b) {
		this.a=a;
		this.b=b;		
	}
	public Test1() {
	this.a=1;
	this.b=2;
	}
	
	public  void setA(int a) {
		this.a=a;
	}
	
	public int  getA(int a) {
		return (this.a);
	}
	
	public  void setB(int b) {
		this.b=b;
	}
	
	public int  getB(int b) {
		return (this.b);
	}
	
	public int  sum() {
		return this.a+this.b;
	}
	
	public int max() {
     	return 	this.a>this.b?this.a:this.b ;
	}
			 
		
	}


