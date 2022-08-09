import java.util.ArrayList;
import java.util.List;

public class Player
{
    private List<Card> hand;

    public Player(int handsize)
    {
        this.hand = new ArrayList<>(handsize);
    }

    public void setHand(List<Card> hand)
    {
        this.hand = hand;
    }

    public void showHand()
    {
        System.out.printf("Your hand is: ");
        for (int i = 0; i < hand.size(); i++)
        {
            System.out.printf(hand.get(i).toString()+" ");
        }
        System.out.println();
    }

    public List<Card> getHand()
    {
        return this.hand;
    }
}
