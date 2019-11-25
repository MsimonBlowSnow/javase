package 枚举类;

public enum Week12 {
	MON("星期一"),TUES("星期二"),WED("星期三");
	 private String name;
	private Week12(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
