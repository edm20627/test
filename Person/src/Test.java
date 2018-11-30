
public class Test {
	public static void main(String[]args){

		Person taro =new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNunber="000-0000-0000";
		taro.address="aaa@aaa";
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNunber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();

		Person ziro=new Person();
		ziro.name="木村次郎";
		ziro.age=18;
		ziro.phoneNunber="111-1111-1111";
		ziro.address="bbb@bbb";
		System.out.println(ziro.name);
		System.out.println(ziro.age);
		System.out.println(ziro.phoneNunber);
		System.out.println(ziro.address);

		Person hanako=new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNunber="222-2222-2222";
		hanako.address="ccc@ccc";
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNunber);
		System.out.println(hanako.address);

		Robot aibo=new Robot();
		aibo.name="aibo";
		System.out.println(aibo.name);
		aibo.talk();
		aibo.walk();
		aibo.run();

		Robot asimo=new Robot();
		asimo.name="asimo";
		System.out.println(asimo.name);
		asimo.talk();
		asimo.walk();
		asimo.run();

		Robot pepper=new Robot();
		pepper.name="pepper";
		System.out.println(pepper.name);
		pepper.talk();
		pepper.walk();
		pepper.run();


	}

}
