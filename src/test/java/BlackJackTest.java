import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BlackJackTest {
    Player ian;
    Dealer dealer;
    Deck deck;
    BlackJack game;
    Card ace;
    Card king;
    Card three;
    Card two;
    Card four;

    @Before
    public void setup(){
        ian = new Player("Ian");
        dealer = new Dealer("Dealer");
        deck = new Deck();
        game = new BlackJack(deck);
        three = new Card(SuitType.CLUBS,RankType.THREE);
        two = new Card(SuitType.HEARTS,RankType.TWO);
        four = new Card(SuitType.HEARTS,RankType.FOUR);
        king = new Card(SuitType.DIAMONDS,RankType.KING);
        ace = new Card(SuitType.SPADES,RankType.ACE);
    }
    @Test
    public void gameHasPlayer(){
        game.addPlayer(ian);
        assertEquals(1, game.playerCount());
    }
    @Test
    public void gameCanStart(){
        game.addPlayer(ian);
        game.addDealer(dealer);
        game.start(2);
        assertEquals(2, ian.cardCount());
        assertEquals(2, dealer.cardCount());
    }
}
