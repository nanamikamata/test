package jp.co.internous.action;

public class Test {
	public static void main(String[] args){
		Person taro =new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="080-0000-0000";
		taro.address="岩手県";
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		
		Person jiro =new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.phoneNumber="090-0000-0000";
		jiro.address="秋田県";
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		
		Person hanako =new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="080-0001-0000";
		hanako.address="石川県";
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		
		Person kamata =new Person();
		kamata.name="鎌田七海";
		kamata.age=25;
		kamata.phoneNumber="080-0088-0000";
		kamata.address="神奈川県";
		System.out.println(kamata.name);
		System.out.println(kamata.age);
		System.out.println(kamata.phoneNumber);
		System.out.println(kamata.address);
		
		taro.talk();
		taro.walk();
		taro.run();
		
		Robot aibo=new Robot();
		aibo.name="aibo";
		aibo.talk();
		aibo.walk();
		aibo.run();
		
		Robot asimo=new Robot();
		asimo.name="asimo";
		asimo.talk();
		asimo.walk();
		asimo.run();
		
		Robot pepper=new Robot();
		pepper.name="pepper";
		pepper.talk();
		pepper.walk();
		pepper.run();
		
		Robot doraemon=new Robot();
		doraemon.name="doraemon";
		doraemon.talk();
		doraemon.walk();
		doraemon.run();
	
	}

}
