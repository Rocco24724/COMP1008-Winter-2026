import java.util.Random;
// Abstract Player
public abstract class Player {
    public String name;
    public int health;
    public int power;
    public int stamina;
    public int maxStamina;
    public int comboCounter;
    public Random rand;

    public Player(String name, int health, int power, int stamina) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.stamina = stamina;
        this.maxStamina = stamina;
        this.comboCounter = 0;
        this.rand = new Random();
    }

    public abstract void performAttack(Player opponent);

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public boolean canAttack() {
        return rand.nextInt(100) < 70;
    }

    public int applyCombo(int baseDamage) {
        int scaled = (int)(baseDamage * (1 + comboCounter * 0.1));
        comboCounter++;
        return scaled;
    }

    public void resetCombo() {
        comboCounter = 0;
    }

    public void regenStamina() {
        stamina += 10;
        if (stamina > maxStamina) stamina = maxStamina;
    }

    public boolean consumeStamina(int cost) {
        if (stamina >= cost) {
            stamina -= cost;
            return true;
        }
        return false;
    }

    public String getStatus() {
        return name + " | HP: " + health + " | STA: " + stamina + " | Combo: " + comboCounter;
    }
}
