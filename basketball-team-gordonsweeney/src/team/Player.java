package team;

public class Player 
{
    private String name;
    private int number;
    private double fgp;

    public Player(String name, int number, double fgp)
    {
        this.name = name;
        this.number = number;
        this.fgp = fgp;
    }

    public String getName()
    {
        return name;
    }

    public int getNumber()
    {
        return number;
    }

    public double getFgp()
    {
        return fgp;
    }

    @Override
    public String toString()
    {
        return "Name: " + name + ", Number: " + number + ", FGP: " + fgp;
    }
}
