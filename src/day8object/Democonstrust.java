package day8object;

public class Democonstrust {
	public static void main(String[] args) {
		Son a=new Son();
		System.out.println(a.a);//0 �ͽ�ԭ��
	}
}
/*Ĭ�ϵ���father����޲ι���,*/
class Father{
	int a=1;
	Father(){
		System.out.println("I'm father");
	}
}
class Son extends Father{
	int a=0;
	Son(){
		System.out.println("son");
	}
}