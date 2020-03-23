import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;
    Card two;
    Card three;

    @Before
    public void setup() {
        dealer = new Dealer("Dealer");
        two = new Card(SuitType.HEARTS, RankType.TWO);
        three = new Card(SuitType.CLUBS, RankType.THREE);
    }

        @Test
        public void cardCounter(){
           assertEquals(0, dealer.cardCount());
        }
        @Test
    public void canTakeCard(){
        dealer.takeCard(two);
        assertEquals(1,dealer.cardCount());
        }
        @Test
        public void canShowHand(){
        dealer.takeCard(two);
        assertEquals("TWO of HEARTS", dealer.ShowHand(0));
        }
        @Test
    public void HandValue(){
        dealer.takeCard(two);
        dealer.takeCard(three);
        assertEquals(5,dealer.handTotal());
        }


}
