import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    Card card;

    @Before
    public void setup(){ card = new Card(SuitType.CLUBS, RankType.KING);}

    @Test
    public void cardRank(){
        assertEquals(RankType.KING, card.getRank());
    }
    @Test
    public void cardSuit(){
        assertEquals(SuitType.CLUBS, card.getSuit());
    }
    @Test
    public void printCardName(){
        assertEquals("KING of CLUBS", card.cardName());
    }
    @Test
    public void CardsValue(){
        assertEquals(10,card.getValue());
    }
}
