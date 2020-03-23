import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Card jack;
    Card ace;

    @Before
    public void setup(){
        player = new Player("Ian");
        jack = new Card(SuitType.DIAMONDS, RankType.JACK);
        ace = new Card(SuitType.HEARTS, RankType.ACE);

    }

    @Test
    public void playerName(){
        assertEquals("Ian", player.getName());
    }
    @Test
    public void playerHasNoCards(){
        assertEquals(0, player.cardCount());
    }
    @Test
    public void takesCard(){
        player.takeCard(ace);
        assertEquals(1,player.cardCount());
    }
    @Test
    public void canTakeCards(){
        player.takeCard(jack);
        player.takeCard(jack);
        assertEquals(2,player.cardCount());
    }
    @Test
    public void canGetcardValue(){
        player.takeCard(jack);
        assertEquals(10,player.handTotal());
    }
    @Test
    public void canGetHandValue(){
        player.takeCard(jack);
        player.takeCard(ace);
        assertEquals(11, player.handTotal());
    }
//    @Test
//    public void canGoBust(){
//        player.bust(); //<<note to self Don't think this should be a runner or maybe a game method,
//        assertEquals("Sorry you bust",player.bust());
//    }

}
