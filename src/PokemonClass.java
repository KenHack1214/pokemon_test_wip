public class PokemonClass {
    String name;
    int level;
    int health;

    PokemonClass(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
    }

    void attack() {
        System.out.println(name + " Attack! ");
    }

    public void damage() {
        System.out.println(name + " " + "attacked for " + Math.round(Math.random() * 10 + 1) + " Damage! ");
    }

    void setHealth() {
        System.out.println(name + " has " + health + " Health ");
    }
}
