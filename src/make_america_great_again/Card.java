package make_america_great_again;

public class Card {
	private int number;
	private int mark;

	public Card(int number, int mark) {
		this.setNumber(number);
		this.setMark(mark);
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getNumber() {
		return String.valueOf(this.number);
	}

	public String getMark() {
		return String.valueOf(this.mark);
	}
}
