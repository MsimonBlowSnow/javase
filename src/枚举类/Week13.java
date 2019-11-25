package ö����;

public enum Week13 {
	MON("����һ") {

		@Override
		public void show() {
			System.out.println(this.getName());
		}

	},
	TUES("���ڶ�") {

		@Override
		public void show() {
			System.out.println(this.getName());

		}

	},
	WED("������") {

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
