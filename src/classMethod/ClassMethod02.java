package classMethod;

import classMethod.human.Human02;
//classMethod.human.Human02クラスを参照できるようにしている

public class ClassMethod02 {
	public static void main(String[] args) {
		Human02 yamada = new Human02();
		System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");
		
		Human02 satou = new Human02("佐藤", 25) ;
		System.out.println("名前は" + satou.name + "で、年齢は" + satou.age + "です。");
	}

}
