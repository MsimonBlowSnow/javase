package �򵥹������ģʽ;
/*A:��������ģʽ����
	* ��������ģʽ�г��󹤳��ฺ���崴������Ľӿڣ��������Ĵ��������ɼ̳г��󹤳��ľ�����ʵ�֡�
* B:�ŵ�
	* �ͻ��˲���Ҫ�ڸ������Ĵ������Ӷ���ȷ�˸������ְ��������µĶ������ӣ�ֻ��Ҫ����һ���������;���Ĺ����༴�ɣ���Ӱ�����еĴ��룬����ά�����ף���ǿ��ϵͳ����չ��
* C:ȱ��
	* ��Ҫ����ı�д���룬�����˹�����
* D:������ʾ
*  
		��������ࣺpublic abstract Animal { public abstract void eat(); }
		�����ӿڣ�public interface Factory {public abstract Animal createAnimal();}
		���幷�ࣺpublic class Dog extends Animal {}
		����è�ࣺpublic class Cat extends Animal {}
		��ʼ���ڲ�������ÿ������������Լ��������󣬵��ǣ���������Ĺ�������Ƚ��鷳������Ҫ����ר����������飬���Ծ�֪����һ��ר�ŵ������������󡣷���ÿ���޸Ĵ���̫�鷳���ù��������Ľ������ÿһ�������ʵ���ṩһ�����幤����
		��������public class DogFactory implements Factory {
			public Animal createAnimal() {��}
		        }
		è������public class CatFactory implements Factory {
			public Animal createAnimal() {��}
		        }  
*/
public class Day02DemoFoctry {
	public static void main(String[] args) {
		Day02CatFoctory catFoctory= new Day02CatFoctory();
		Day01Cat cat02=(Day01Cat) catFoctory.newAminal(); 
		Day02DogFoctory dogFoctory= new Day02DogFoctory();
		Day01Dog adog=(Day01Dog) dogFoctory.newAminal();
		adog.eat();
		cat02.eat();
	}
}
