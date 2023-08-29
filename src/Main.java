import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Currency;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var poke1 = new PokemonClass("Charmander", 20, 100);

        var poke2 = new PokemonClass("Squirtle", 18, 95);


        System.out.println("Name: " + poke1.name + "\n" + "Level: " + poke1.level);
        System.out.println("====================================");
        System.out.println("Charmander found a wild " + poke2.name + " level " + poke2.level);
        System.out.println("====================================");

        poke1.attack();
        poke1.damage();

        // poke2.setHealth(); // need to figure out hp 

    }
}