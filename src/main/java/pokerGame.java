import java.util.*;

public class pokerGame extends Rules
{
    public pokerGame(int handsize)
    {
        super(handsize);
    }

    //implementation of abstract fucntion from Rules class
    public String evaluate(Player p)
    {
        boolean flush = true;
        boolean straight = false;

        //check for possible flush
        for (int i = 0; i < p.getHand().size()-1; i++)
        {
            if (p.getHand().get(i).getSuit() != p.getHand().get(i + 1).getSuit()) {
                flush = false;
                break;
            }
        }

        //checks for matching cards in the deck
        List<Integer> same = new ArrayList<>(getHandsize());
        for(int i = 0; i < getHandsize(); i++)
        {
            same.add(1);
        }

        for (int i = 0; i < p.getHand().size(); i++)
        {
            for (int j = 0; j < p.getHand().size(); j++)
            {
                if (p.getHand().get(i).getFace() == p.getHand().get(j).getFace() && i != j)
                {
                    int temp = same.get(i)+1;
                    same.set(i,temp);
                }
            }
        }

        //cant have a straight if the lowest card is greater than 10
        int [] ranks = new int[14];
        for (int i = 0; i < p.getHand().size(); i++)
        {
            ranks[p.getHand().get(i).evaluate()]++;
        }

        for (int i = 0; i <= 9; i++)
        {
            if (ranks[i] == 1 && ranks[i + 1] == 1 && ranks[i + 2] == 1 && ranks[i + 3] == 1 && ranks[i + 4] == 1) {
                straight = true;
                break;
            }
        }

        //for ace under high rules
        if ((p.getHand().contains(new Card('A', 'S')) || p.getHand().contains(new Card('A', 'C')) || p.getHand().contains(new Card('A', 'D')) || p.getHand().contains(new Card('A', 'H')))
                && (p.getHand().contains(new Card('T', 'S')) || p.getHand().contains(new Card('T', 'C')) || p.getHand().contains(new Card('T', 'D')) || p.getHand().contains(new Card('T', 'H')))
                && (p.getHand().contains(new Card('J', 'S')) || p.getHand().contains(new Card('J', 'C')) || p.getHand().contains(new Card('J', 'D')) || p.getHand().contains(new Card('J', 'H')))
                && (p.getHand().contains(new Card('Q', 'S')) || p.getHand().contains(new Card('Q', 'C')) || p.getHand().contains(new Card('Q', 'D')) || p.getHand().contains(new Card('Q', 'H')))
                && (p.getHand().contains(new Card('K', 'S')) || p.getHand().contains(new Card('K', 'C')) || p.getHand().contains(new Card('K', 'D')) || p.getHand().contains(new Card('K', 'H'))))
        {
            straight= true;
        }

        if (straight && flush)
        {
            return "You have: Straight flush";
        }

        if (same.contains(4))
        {
            return "You have: Four of a kind";
        }

        if (same.contains(3) && same.contains(2))
        {
            return "You have: Full house";
        }

        if (flush && !straight)
        {
            return "You have: Flush";
        }

        if (straight && !flush)
        {
            return "You have: Straight";
        }

        if (same.contains(3) && !same.contains(2))
        {
            return "You have: Three of a kind";
        }

        if (Collections.frequency(same, 2) == 4)
        {
            return "You have: Two pair";
        }

        if (same.contains(2) && same.contains(1))
        {
            return "You have: One pair";
        }
        return "You have: High card";
    }
}
