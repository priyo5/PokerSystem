import java.util.Random;

public class Deck
{
    private Card [] deck;

    public Deck()
    {
        init();
    }

    public void init()
    {
        String faces = "A23456789TJQK";
        String suits = "SDCH";

        deck = new Card[52];
        int count = 0;
        for (int j = 0; j < suits.length(); j++)
        {
            if (j < 2)
            {
                for (int i = 0; i < faces.length(); i++)
                {
                    deck[count] = new Card(faces.charAt(i), suits.charAt(j));
                    count++;
                }
            }
            else
            {
                for (int i = faces.length()-1; i >= 0 ; i--)
                {
                    deck[count] = new Card(faces.charAt(i), suits.charAt(j));
                    count++;
                }
            }
        }
    }

    public void shuffle()
    {
        java.lang.System.out.println("Shuffling deck...");
        Random r = new Random();
        for (int i = 0; i < deck.length; i++)
        {
            int j = r.nextInt(deck.length);
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
        java.lang.System.out.println("Deck shuffled!");
    }

    public void reset()
    {
        this.deck = null;
        init();
    }

    public Card[] getDeck()
    {
        return deck;
    }

    public void setDeck(Card[] deck)
    {
        this.deck = deck;
    }

    public void printDeck()
    {
        for (int i = 0; i < deck.length; i++)
        {
            System.out.printf(deck[i].toString());
            if (i != deck.length-1)
            {
                System.out.printf(" | ");
            }
        }
        System.out.println();
    }
}
