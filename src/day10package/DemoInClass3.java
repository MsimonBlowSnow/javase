package day10package;
/**
 * Ҫ�����30��20��10
 * */
public class DemoInClass3 {
	public static void main(String[] args) {
		Outer31.Inner31 io=new Outer31().new Inner31();
		io.show();
	}
}

//�ڲ����ܻ�ȡ�ⲿ����Ҫ��ӦΪ�����Ի�ȡ�ⲿ�������.this.����
class Outer31{
    public int num = 10;
    class Inner31{
        public int num = 20;
        public void show() {
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer31.this.num);
        }
    }
}


