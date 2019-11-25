package 枚举类;

public enum Week13 {
	MON("星期一") {

		@Override
		public void show() {
			System.out.println(this.getName());
		}

	},
	TUES("星期二") {

		@Override
		public void show() {
			System.out.println(this.getName());

		}

	},
	WED("星期三") {

		@Override
		public void show() {
			System.out.println(this.getName());

		}

	};
	
	private String name;

	private Week13(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public String toString(){
		return name;
	}
	public abstract void show();
}
