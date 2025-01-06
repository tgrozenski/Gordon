package team;
import java.util.ArrayList;
import java.util.Random;

public class Bench 
{
    private ArrayList<Player> players;

    public Bench()
    {
        players = new ArrayList<>();
    }

    public void addPlayer(Player player)
    {
        players.add(player);
    }

    public Player getRandomPlayer()
    {
        Random random = new Random();
        int index = random.nextInt(players.size());
        return players.remove(index);
    }

    public Player getMostAccurate()
    {
        Player mostAccurate = players.get(0);
        for (int i = 1; i < players.size(); i++)
        {
            if (players.get(i).getFgp() > mostAccurate.getFgp())
            {
                mostAccurate = players.get(i);
            }
        }
        players.remove(mostAccurate);
        return mostAccurate;
    }

    // The method should find the Player on the bench that has the next highest number from the Player parameter, 
    // remove them from the bench list and return them. 
    // If there is no Player with a higher number than the Player parameter then the method should return the last Player on the bench list. 
    // The method should also put the Player parameter back on the bench.

    public Player swapPlayer(Player play)
    {

        for (int i = 0; i < players.size(); i++)
        {
            Player currentPlayer = players.get(i);
            // System.out.println("Comparing player: " + currentPlayer + " with player: " + play);
            if (currentPlayer.getNumber() > play.getNumber())
            {
                // remove player from bench list
                players.remove(currentPlayer);

                // return them
                // System.out.println("\nPlayer removed from bench list: " + currentPlayer + "\n");
                return currentPlayer;
            }
        }

        // The method should also put the Player parameter back on the bench.
        players.add(play);

        // If there is no Player with a higher number than the Player parameter then the method should return the last 
        // Player on the bench list. 

        Player lastPlayer = players.get(players.size() - 1);
        // System.out.println("\nNo player with a higher number than the Player parameter. Last player on the bench list: " + lastPlayer + "\n");
        return lastPlayer;
    }

    // print out the bench list
    public void printBench()
    {
        if (players.size() == 0)
        {
            System.out.println("Bench list is empty.");
            return;
        }

        System.out.println("Bench list: ");
        for (int i = 0; i < players.size(); i++)
        {
            System.out.println(players.get(i));
        }
    }
}
