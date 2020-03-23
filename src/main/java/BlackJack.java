import java.util.ArrayList;

public class BlackJack {


ArrayList<Player> players;
Deck deck;
ArrayList<Dealer> dealer;

    public BlackJack(Deck deck){
    this.players = new ArrayList<Player>();
    this.deck = deck;
    this.dealer = new ArrayList<Dealer>();
 }

  public ArrayList<Player> getPlayer(){ return players;}

  public int playerCount(){ return this.players.size();}

  public void addPlayer(Player player){ this.players.add(player);}

  public void addDealer(Dealer dealer){ this.dealer.add(dealer);}

    public void start(int amountOfCards){
        for(Player player:this.players){
            for (int i = 0; i < amountOfCards; i++){
                Card card = deck.dealone();
                player.takeCard(card);
            }
        }
        for(Dealer dealer:this.dealer){
            for (int i = 0; i < amountOfCards; i++){
                Card card = deck.dealone();
                dealer.takeCard(card);
            }
        }
    }

    public void winner(){
        int highest = 0 ;
        Player winner = null;
        Dealer house = null;
        for (Player player:this.players){
    if(player.handTotal() > dealer.handTotal();
    highest = player.handTotal() || dealer.handTotal(§)

        }
    }

    public Player checkWinner(){
        int highest = 0;
        Player winner = null;
        for(Player player:this.players){
            if(player.handTotal() > highest){
                highest = player.handTotal();
                winner = player;
            }
        }
        return winner;
    }

//    public void PlayerHit() {
//        for (Player player : this.players) {
//            if (player.handTotal() < 22) {
//                // trying to word code to sale player can pick hit or stick
//
//            } else {
//                player.bust()
//            }
//        }
//    }
}
