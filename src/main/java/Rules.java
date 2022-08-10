import java.util.*;

public abstract class Rules
{
    private int handsize;
    private Deck deck;

    public Rules(int handsize)
    {
        this.handsize = handsize;
        this.deck = new Deck();
        deck.shuffle();
    }

    public int getHandsize()
    {
        return this.handsize;
    }

    //Deals a random hand to a player
    public void deal(Player p)
    {
        System.out.println("Dealing a hand...");
        List<Integer> chosen = new ArrayList<>();
        List<Card> hand = new ArrayList<>(getHandsize());
        int c = 0;
        while(c < getHandsize())
        {
            int random = (int) (Math.random() * 52);
            if (!chosen.contains(random))
            {
                hand.add(this.deck.getDeck()[random]);
                chosen.add(random);
                c++;
            }
        }
        p.setHand(hand);
    }

    //Can be used to specify the hands that are used in the game being played
    public abstract String evaluate(Player p);
}
