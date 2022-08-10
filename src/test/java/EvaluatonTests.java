import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class EvaluatonTests
{
    //Objects needed for the game
    Player p = new Player(5);;
    pokerGame s = new pokerGame(5);

    //evaluate of Straight Flush case
    @Test
    public void testStraightFlush()
    {
        List<Card> straightFlush = new ArrayList<>(5);
        straightFlush.add(new Card('J', 'S'));
        straightFlush.add(new Card('T', 'S'));
        straightFlush.add(new Card('9', 'S'));
        straightFlush.add(new Card('8', 'S'));
        straightFlush.add(new Card('7', 'S'));

        this.p.setHand(straightFlush);
        assertEquals("You have: Straight flush", s.evaluate(p));
    }

    //evaluate of Four Of A Kind case
    @Test
    public void testFourOfAKind()
    {
        List<Card> fourOfAKind = new ArrayList<>(5);

        fourOfAKind.add(new Card('5','S'));
        fourOfAKind.add(new Card('5','D'));
        fourOfAKind.add(new Card('T','S'));
        fourOfAKind.add(new Card('5','H'));
        fourOfAKind.add(new Card('5','C'));

        this.p.setHand(fourOfAKind);
        assertEquals("You have: Four of a kind", s.evaluate(p));
    }

    //evaluate of Full House case
    @Test
    public void testFullHouse()
    {
        List<Card> fullHouse = new ArrayList<>(5);

        fullHouse.add(new Card('6','S'));
        fullHouse.add(new Card('6','D'));
        fullHouse.add(new Card('6','C'));
        fullHouse.add(new Card('K','H'));
        fullHouse.add(new Card('K','S'));

        this.p.setHand(fullHouse);
        assertEquals("You have: Full house", s.evaluate(p));
    }


    //evaluate of Flush case
    @Test
    public void testFlush()
    {
        List<Card> flush = new ArrayList<>(5);

        flush.add(new Card('J','D'));
        flush.add(new Card('9','D'));
        flush.add(new Card('8','D'));
        flush.add(new Card('4','D'));
        flush.add(new Card('3','D'));

        this.p.setHand(flush);
        assertEquals("You have: Flush", s.evaluate(p));
    }

    //evaluate of Stright case
    @Test
    public void testStraight()
    {
        List<Card> straight = new ArrayList<>(5);

        straight.add(new Card('5','S'));
        straight.add(new Card('6','D'));
        straight.add(new Card('7','S'));
        straight.add(new Card('8','H'));
        straight.add(new Card('9','C'));

        this.p.setHand(straight);
        assertEquals("You have: Straight", s.evaluate(p));
    }

    //evaluate of Three Of A Kind case
    @Test
    public void testThreeOfAKind()
    {
        List<Card> threeOfAKind = new ArrayList<>(5);

        threeOfAKind.add(new Card('Q','S'));
        threeOfAKind.add(new Card('Q','D'));
        threeOfAKind.add(new Card('Q','C'));
        threeOfAKind.add(new Card('9','H'));
        threeOfAKind.add(new Card('2','S'));

        this.p.setHand(threeOfAKind);
        assertEquals("You have: Three of a kind", s.evaluate(p));
    }

    //evaluate of Two Pair case
    @Test
    public void testTwoPair()
    {
        List<Card> twoPair = new ArrayList<>(5);

        twoPair.add(new Card('J','S'));
        twoPair.add(new Card('J','D'));
        twoPair.add(new Card('3','S'));
        twoPair.add(new Card('3','H'));
        twoPair.add(new Card('2','C'));

        this.p.setHand(twoPair);
        assertEquals("You have: Two pair", s.evaluate(p));
    }

    //evaluate of One Pair case
    @Test
    public void testOnePair()
    {
        List<Card> onePair = new ArrayList<>(5);

        onePair.add(new Card('T','S'));
        onePair.add(new Card('T','D'));
        onePair.add(new Card('8','S'));
        onePair.add(new Card('7','H'));
        onePair.add(new Card('4','C'));

        this.p.setHand(onePair);
        assertEquals("You have: One pair", s.evaluate(p));
    }

    //evaluate of High Card case
    @Test
    public void testHighCard()
    {
        List<Card> highCard = new ArrayList<>(5);

        highCard.add(new Card('K','S'));
        highCard.add(new Card('Q','D'));
        highCard.add(new Card('7','S'));
        highCard.add(new Card('4','H'));
        highCard.add(new Card('3','C'));

        this.p.setHand(highCard);
        assertEquals("You have: High card", s.evaluate(p));
    }
}
