package �򵥹������ģʽ;
/* A:��������ģʽ����
 	* ��������ģʽ�г��󹤳��ฺ���崴������Ľӿڣ��������Ĵ��������ɼ̳г��󹤳��ľ�����ʵ�֡�
* B:�ŵ�
	* �ͻ��˲���Ҫ�ڸ������Ĵ������Ӷ���ȷ�˸������ְ��������µĶ������ӣ�
	* ֻ��Ҫ����һ���������;���Ĺ����༴�ɣ���Ӱ�����еĴ��룬����ά�����ף���ǿ��ϵͳ����չ��
* C:ȱ��
	* ��Ҫ����ı�д���룬�����˹�����
* D:������ʾ
* 
	��������ࣺpublic abstract Animal { public abstract void eat(); }
	�����ӿڣ�public interface Factory {public abstract Animal createAnimal();}
	���幷�ࣺpublic class Dog extends Animal {}
	����è�ࣺpublic class Cat extends Animal {}
	��ʼ���ڲ�������ÿ������������Լ��������󣬵��ǣ���������Ĺ�������Ƚ��鷳��
	����Ҫ����ר����������飬���Ծ�֪����һ��ר�ŵ������������󡣷���ÿ���޸Ĵ���̫�鷳��
	�ù��������Ľ������ÿһ�������ʵ���ṩһ�����幤����
	��������public class DogFactory implements Factory {
		public Animal createAnimal() {��}
	        }
	è������public class CatFactory implements Factory {
		public Animal createAnimal() {��}
	        }  */
public class Day01DemoFoctory {
	public static void main(String[] agrs) {
		Day01Dog adog=(Day01Dog) Day01Foctory.Amianl("Dog");
		Day01Cat aCat=(Day01Cat) Day01Foctory.Amianl("Cat");
		adog.eat();
		aCat.eat();
	}
}
