public class Card
{
    private char face;
    private char suit;

    public Card(char face, char suit)
    {
        this.face = face;
        this.suit = suit;
    }

    public char getFace()
    {
        return face;
    }

    public void setFace(char face)
    {
        this.face = face;
    }

    public char getSuit()
    {
        return suit;
    }

    public void setSuit(char suit)
    {
        this.suit = suit;
    }

    public int evaluate()
    {
        switch (this.face)
        {
            case 'A':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            case 'T':
                return 10;
            case 'J':
                return 11;
            case 'Q':
                return 12;
            case 'K':
                return 13;
            default:
                return 0;
        }
    }

    @Override
    public String toString()
    {
        switch (this.suit)
        {

            case 'H':
                return this.face+" Hearts";
            case 'D':
                return this.face+" Diamonds";
            case 'C':
                return this.face+" Clubs";
            case 'S':
                return this.face+" Spades";
            default:
                return "";
        }
    }
}
