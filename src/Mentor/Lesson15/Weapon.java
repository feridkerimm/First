package Mentor.Lesson15;

public class Weapon {

    public void attack() {
        System.out.println("Performing a basic attack");
    }

    public void attack(int damage) {
        System.out.println("Performing a regular attack with " + damage + " damage. ");
    }

    public void attack(double criticalDamage) {
        System.out.println("Performing a critical attack with multiply of " + criticalDamage + " damage. ");
    }

    public void attack(String specialMove) {
        System.out.println("Performing a special attack: " + specialMove + ". ");
    }

    public static void main(String[] args) {
        Weapon sword = new Weapon();
        Weapon bow = new Weapon();

        sword.attack();
        sword.attack(30);
        sword.attack(2.5);
        sword.attack("Strike");
        System.out.println();
        bow.attack();
        bow.attack(20);
        bow.attack(1.5);
        bow.attack("Piercing Arrow");
    }


}