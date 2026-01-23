public class Main {
    public static void main(String[] args) {
        // Step 1: Create a WorldStats object for 6 continents
        worldStats world = new worldStats(6);
        
        // Step 2: Add continents with populations
        System.out.println("=== Adding Continents ===");
        world.addContinent("North America", 579000000);
        world.addContinent("South America", 422500000);
        world.addContinent("Europe", 741400000);
        world.addContinent("Asia", 4641000000);
        world.addContinent("Africa", 1340000000);
        world.addContinent("Australia", 25687041);
        System.out.println("Added " + world.getIndexTracker() + " continents");
        
        // Step 3: Display all continents and populations
        System.out.println("\n=== All Continents ===");
        String[] continents = world.getContinents();
        int[] populations = world.getPopulationPerContinent();
        for (int i = 0; i < world.getIndexTracker(); i++) {
            System.out.println(continents[i] + ": " + populations[i]);
        }
        
        // Step 4: Search for specific continents by name
        System.out.println("\n=== Search by Continent Name ===");
        System.out.println("Asia population: " + world.getContinentByName("Asia"));
        System.out.println("Africa population: " + world.getContinentByName("Africa"));
        System.out.println("Antarctica population: " + world.getContinentByName("Antarctica"));
        
        // Step 5: Display summary
        System.out.println("\n=== Summary ===");
        System.out.println("Total continents in system: " + world.getNumberOfContinents());
        System.out.println("Continents added: " + world.getIndexTracker());
    }
}