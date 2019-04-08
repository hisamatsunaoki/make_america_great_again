package main;

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
		String str = "";
		switch (this.number) {

		case 11:
			str = "ジャック";
			break;
		case 12:
			str = "クイーン";
			break;
		case 13:
			str = "キング";
			break;
		case 14:
			str = "エース";
			break;
		case 15:
			str = "ジョーカー";
			break;
		default:
			str = Integer.toString(this.number);
			break;
		}
		return str;
	}

	public String getMark() {
		String str;
		switch (this.mark) {
		case 1:
			str = "クラブ";
			break;
		case 2:
			str = "ダイヤ";
			break;
		case 3:
			str = "ハート";
			break;
		case 4:
			str = "スペード";
			break;
		case 5:
			str = "赤";
		case 6:
			str = "黒";
			break;
		default:
			str = Integer.toString(this.mark);
			break;
		}
		return str;
	}

	public int getRowNumber() {
		return this.number;
	}

	public int getRowMark() {
		return this.mark;
	}

	public int compareTo(Card anotherCard) {
		int anotherCardNumber = anotherCard.getRowNumber();
		int anotherCardMark = anotherCard.getRowMark();
		int result = -1;
		if (this.number > anotherCardNumber) {
			result = 1;
		} else if (this.number == anotherCardNumber) {
			if (this.mark > anotherCardMark) {
				result = 1;
			} else if (this.mark == anotherCardMark) {
				result = 0;
			}
		}
		return result;
	}
}
