package 枚举类;

public class Week02 {
	public static final Week02 MON=new Week02("星期一");
	public static  final Week02 TUES=new Week02("星期二");
	public static final Week02 WED=new Week02("星期三");
	private String name;
	private Week02(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	};
	
}
