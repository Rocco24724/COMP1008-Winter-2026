public class Week9 extends Object {

    public static void main(String[] args) {

        Human Bruce = new Human("Bruce Wayne", 10, 20, 150, 40);
        System.out.println(Bruce);
        System.out.println("------------------------------");

        Human SuperMan = new SuperHero("Clark Kent", 20, 40, 160, 30);
        System.out.println(SuperMan.getSpeed());
        System.out.println("------------------------------");


        Human[] humans = {new Human(), new SuperHero()};

        Object[] obs = {1, true, 1.1, new Human(), "Hello", 'c'};


    }

    public static void example1(){
        Human h1 = new Human();

        Human h2 = new Human("Bruce Wayne", 10, 20, 150, 40);

        System.out.println(h1);
        System.out.println("------------------------------");

        System.out.println(h2);
        System.out.println("------------------------------");

        SuperHero Batman = new SuperHero();
        System.out.println(Batman);
        System.out.println("------------------------------");

        SuperHero SuperMan = new SuperHero("Clark Kent", 20, 40, 160, 30);
        System.out.println(SuperMan);
        System.out.println("------------------------------");

        SuperHero SpiderMan = new SuperHero("Peter Parker", 15, 50, 155, 20, "Webs", "Spider Man", 10);
        System.out.println(SpiderMan);
        System.out.println("------------------------------");
    }

}