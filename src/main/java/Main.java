public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Game started!");
        Player p = new Player(5);

        pokerGame s = new pokerGame(5);
        s.deal(p);
        p.showHand();
        s.evaluate(p);
    }
}
