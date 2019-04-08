package main;

public class Exec {

	public static void main(String[] args) {
//		Deck deck = new Deck();
//		for (int i = 0; i < 54; i++) {
//			Card drowCard = deck.draw();
//			String cardNumber = drowCard.getNumber();
//			String cardMark = drowCard.getMark();
//			System.out.println("カードの数字は" + cardNumber + "、マークは" + cardMark + "です");
//		}

		Deck deck1 = new Deck();
		Card drowCard1 = deck1.draw();
		String cardNumber1 = drowCard1.getNumber();
		String cardMark1 = drowCard1.getMark();
		System.out.println("最初のカードの数字は" + cardNumber1 + "、マークは" + cardMark1 + "です");
		Card drowCard2 = deck1.draw();
		String cardNumber2 = drowCard2.getNumber();
		String cardMark2 = drowCard2.getMark();
		System.out.println("次のカードの数字は" + cardNumber2 + "、マークは" + cardMark2 + "です");
		int ans = drowCard1.compareTo(drowCard2);
		String output = "";
		if (ans == 1) {
			output = "最初に引いたカードのほうが強いです。";
		}
		if (ans == -1) {
			output = "あとに引いたカードのほうが強いです。";
		}
		if (ans == 0) {
			output = "引き分けです。このカードに引き分けはないので不正行為が行われています。";
		}
		System.out.println(output);
	}

}
