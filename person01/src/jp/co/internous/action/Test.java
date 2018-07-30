package jp.co.internous.action;

public class Test {
	public static void main(String[] args){
		Person p=new Person();
		
		Person taro=new Person();
		taro.name="taro";
		taro.age=18;
		System.out.println(taro.name);
		System.out.println(taro.age);
		
		Person jiro=new Person("jiro",20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		
		Person saburo=new Person("saburo");
		System.out.println(saburo.name);
		System.out.println(saburo.age);
		
		Person noname=new Person(25);
		System.out.println(noname.name);
		System.out.println(noname.age);
		
		Person hanako=new Person("hanako",17);
		System.out.println(hanako.name);
		System.out.println(hanako.age);
				
	}

}
