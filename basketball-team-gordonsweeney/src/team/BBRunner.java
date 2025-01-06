package team;

import java.io.File;
import java.util.Scanner;
public class BBRunner 
{
	public static void main(String[] args) 
	{
		Bench bench = new Bench();
		try {
			File file = new File("src/Roster.csv");
			Scanner reader = new Scanner(file);
			while(reader.hasNextLine())
			{
				String line = reader.nextLine();
				String[] parts = line.split(",");
				bench.addPlayer(new Player(parts[0], Integer.parseInt(parts[1]), Double.parseDouble(parts[2])));
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Team team = new Team(bench);
		System.out.println();
		System.out.println(team);
		System.out.println();
		team.changePlayer(3);
		System.out.println();
		System.out.println(team);
		System.out.println();
		team.improveShooting();
		System.out.println(team);

		// Bench bench = new Bench();
		// bench.addPlayer(new Player("LeBron James", 35, 0.5));
		// bench.addPlayer(new Player("Anthony Davis", 27, 0.6));
		// bench.addPlayer(new Player("Dwight Howard", 34, 0.4));
		// bench.addPlayer(new Player("Rajon Rondo", 34, 0.3));
		// bench.addPlayer(new Player("Danny Green", 33, 0.4));

		// Team team = new Team(bench);
		// bench.addPlayer(new Player("Kyle Kuzma", 24, 0.4));
		// bench.addPlayer(new Player("Alex Caruso", 4, 0.3));
		// bench.addPlayer(new Player("Kentavious Caldwell-Pope", 1, 0.4));
		// bench.addPlayer(new Player("Markieff Morris", 88, 0.4));

		// System.out.println("before" + team);
		// team.changePlayer(3);
		// System.out.println("after" + team);

	}
}
