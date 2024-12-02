public class Pokemon
{
    private String name;
    private String type;
    private int hp;
    /* other stats not shown */
    public Pokemon(String name, String type, int hp)
    {
    /* constructor body not shown */
    this.name = name;
    this.type = type;
    this.hp = hp;

    }
    public int getHP()
    {
        return hp;
    }
    public String getType()
    {
        return type;
    }
}