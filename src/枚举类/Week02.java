package ö����;

public class Week02 {
	public static final Week02 MON=new Week02("����һ");
	public static  final Week02 TUES=new Week02("���ڶ�");
	public static final Week02 WED=new Week02("������");
	private String name;
	private Week02(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	};
	
}
