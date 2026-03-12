public class SuperHero extends Human{
    
    private String superPower, heroName;
    public double scarinessLevel;

    public SuperHero(){}

    public SuperHero(String name, double power, int speed, double height, int age){
        super(name, power, speed, height, age);
    }

    public SuperHero(String name, double power, int speed, double height, int age, String superPower, String heroName, double scarinessLevel){
        super(name, power, speed, height, age);
        this.superPower = superPower;
        this.heroName = heroName;
        this.scarinessLevel = scarinessLevel;
    }

    // Getters
    public String getSuperPower() {
        return superPower;
    }

    public String getHeroName() {
        return heroName;
    }

    // Setters
    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    @Override
    public String toString() {
        return "SuperHero{" +
                "name='" + getName() + '\'' +
                ", power=" + getPower() +
                ", speed=" + getSpeed() +
                ", height=" + height +
                ", age=" + age +
                ", superPower='" + superPower + '\'' +
                ", heroName='" + heroName + '\'' +
                ", scarinessLevel=" + scarinessLevel +
                '}';
    }
}
