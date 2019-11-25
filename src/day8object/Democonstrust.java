package day8object;

public class Democonstrust {
	public static void main(String[] args) {
		Son a=new Son();
		System.out.println(a.a);//0 就近原则
	}
}
/*默认调用father类的无参构造,*/
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