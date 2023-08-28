package example;

public class Student {
	private int id;
	private MathCheat mathCheat;
	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}
	public void cheating() {
		mathCheat.mathCheat();
	}

}
