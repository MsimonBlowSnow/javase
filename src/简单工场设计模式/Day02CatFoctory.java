package 简单工场设计模式;

public class Day02CatFoctory implements Day02Foctory{

	@Override
	public Day01Aminal newAminal() {
	return new Day01Cat();
	}

}
