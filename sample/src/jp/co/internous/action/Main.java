package jp.co.internous.action;

public class Main {

	public static void main(String[] args){
		System.out.println("Hello World");
		System.out.println(hikizan(10,10));
		System.out.println(kakezan(10,10));
		System.out.println(warizan(10,10));

	}
	public static int hikizan(int n1,int n2){
		return n1-n2;
	}

	public static int kakezan(int n1,int n2){
		return n1*n2;
	}

	public static int warizan(int n1,int n2){
		return n1/n2;
	}
}
