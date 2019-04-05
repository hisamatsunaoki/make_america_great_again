package make_america_great_again;

public class Exec {

	public static void main(String[] args) {
		// ここにコードを挿入
		Deck deck = new Deck();
		//		System.out.println(deck.cards.size());
		for(int i = 0; i < 54; i++) {
			Card drowCard = deck.draw();
			String cardNumber = drowCard.getNumber();
			String cardMark = drowCard.getMark();
			System.out.println("カードの数字は" + cardNumber + "、マークは" + cardMark + "です");
		}

	}

}
