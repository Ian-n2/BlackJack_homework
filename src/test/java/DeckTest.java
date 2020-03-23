import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {
    Deck deck;

    @Before
    public void setup(){
        deck = new Deck();
    }
    @Test
    public void freshDeck(){
        assertEquals(52, deck.cardCount());
    }
    @Test
    public void dealCard(){
        deck.dealone();
        assertEquals(51, deck.cardCount());
    }
    @Test
    public void dealCards(){
        deck.dealone();
        deck.dealone();
        deck.dealone();
        assertEquals(49,deck.cardCount());
    }
}
