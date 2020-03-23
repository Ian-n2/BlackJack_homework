import java.util.ArrayList;

public class Dealer {

    private String dealer;
    private ArrayList<Card> hand;

    public Dealer(String dealer){
        this.dealer = dealer;
        this.hand = new ArrayList<Card>();
    }

    public int cardCount(){
        return this.hand.size();
    }
    public void takeCard(Card card){
        this.hand.add(card);
    }
    public String ShowHand(int index){
        return this.hand.get(index).cardName();
    }
    public int handTotal(){
        int total = 0;
        for(Card card : this.hand){
            total += card.getValue();
        }
        return total;
    }



}
