package make_america_great_again;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> cards = new ArrayList<Card>();

	public Deck() {

		//13(数字)×4(マーク)
		for(int j = 1; j < 14; j++) {
			for(int k = 1; k < 5; k++) {
				cards.add(new Card(j, k));
			}
		}

		//ジョーカー
		cards.add(new Card(14, 5));
		cards.add(new Card(14, 5));

		//シャッフル
		Collections.shuffle(cards);
	}

	public Card draw() {
		Card drowCard = cards.get(0);
		cards.remove(0);
		return drowCard;
	}

}
