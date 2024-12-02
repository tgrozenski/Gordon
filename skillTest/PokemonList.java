import java.util.*;
/* Given the following two classes, complete the method in the PokemonList class that finds
the first Pokemon on the list that has the same type but lower hit points and replaces it with
the parameter at the same location on the list. The method should return true if it replaces a
Pokemon and false otherwise. */

public class PokemonList
{
    private ArrayList<Pokemon> list;
/* constructor and other methods not shown */
public boolean upgradeWeak(Pokemon strong)
{
/* complete this method */
for(int index = 0; index < list.size(); index++)
{
    // cars.set(0, "Opel");
    Pokemon currentPokemon = list.get(index);
    if (currentPokemon.getType().equals(strong.getType()) && currentPokemon.getHP() < strong.getHP()) {
        list.set(index, strong);
        return true;
    }
}
return false;

// compare the pokemon strong that goes into the function, with the first pokemon that has the same type as it
}
}