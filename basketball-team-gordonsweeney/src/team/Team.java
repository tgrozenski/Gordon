package team;
import java.util.ArrayList;
import java.util.Random;

public class Team 
{
    private ArrayList<Player> team;
    private Bench bench;

    public Team(Bench bench)
    {
        this.bench = bench;
        team = new ArrayList<>();
        for (int i = 0; i < 5; i++)
        {
            team.add(bench.getRandomPlayer());
        }
    }

    // 1. Write a changePlayer() method that has a void return type and takes an int parameter. 
    // The method should remove a player at the index given as the parameter from the team and replace 
    // them with a new player from the bench by using the swapPlayer() method. 
    // The old player should be placed back on the bench and the new player should occupy the same index on the team as the old player.
    public void changePlayer(int index)
    {
        Player oldPlayer = team.get(index);
        System.out.println("\n Player Removed: " + oldPlayer.toString() + "\n");
        team.remove(index);

        Player newPlayer = bench.swapPlayer(oldPlayer);
        System.out.println("\n Player Added in: " + newPlayer.toString() + "\n");
        team.set(index, newPlayer);
    }

    // 2. Write an improveShooting() method that finds the worst shooter on the team (lowest fgp) and replaces them with the 
    // best shooter on the bench using the getMostAccurate() method. 
    // This method has no return value and no parameters.
    public void improveShooting()
    {
        Player worstShooter = team.get(0);
        int worstIndex = 0;

        for (int i = 1; i < team.size(); i++)
        {
            if (team.get(i).getFgp() < worstShooter.getFgp())
            {
                worstShooter = team.get(i);
                worstIndex = i;
            }
        }

        Player bestShooterOnBench = bench.getMostAccurate();
        team.set(worstIndex, bestShooterOnBench);
        bench.addPlayer(worstShooter);
        System.out.println("\nWorst shooter (removed from team): " + worstShooter.toString() + "\n");
        System.out.println("\nBest shooter on bench(added to team): " + bestShooterOnBench.toString() + "\n");
    }

    // 3. Write a toString() method so you can print out the team. It should make use of the Player toString() method.
    @Override
    public String toString()
    {
        String result = "Team: ";
        for (int i = 0; i < team.size(); i++)
        {
            result += team.get(i).toString() + " ";
        }
        return result;
    }


    // print the bench of the team
    public void printBench()
    {
        bench.printBench();
    }
}