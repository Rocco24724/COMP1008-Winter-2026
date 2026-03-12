public class Fighter {

    private String name;
    private int power, health;

    public Fighter(String name, int power, int health) {
        this.name = name;
        this.power = power;
        this.health = health;
    }

    public void attack(Fighter attackedFighter){
        attackedFighter.setHealth(attackedFighter.getHealth() - getPower());
    }

    public boolean isAlive(){
        return health > 0;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getHealth() {
        return health;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setHealth(int health) {
        this.health = health;
    }

}
