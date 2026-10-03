class Character {
    private int health;
    private final int maxHealth;

    Character(int max) {
        maxHealth = max;
        health = max;
    }

    void takeDamage(int amount) {
        health = Math.max(0, health - amount);
    }

    void heal(int amount) {
        health = Math.min(maxHealth, health + amount);
    }

    int getHealth() {
        return health;
    }
}

public class HealthMain {
    public static void main(String[] args) {

        Character c = new Character(100);

        c.takeDamage(30);
        System.out.println("health = " + c.getHealth());

        c.heal(50);
        System.out.println("health = " + c.getHealth());

        c.takeDamage(150);
        System.out.println("health = " + c.getHealth());
    }
}