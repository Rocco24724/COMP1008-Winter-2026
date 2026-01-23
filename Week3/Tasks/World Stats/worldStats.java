public class worldStats {
    private String[] continents;
    private int[] populationPerContinent;
    private int numberOfContinents;
    private int indexTracker;

    // 1-arg constructor: takes number of continents
    public worldStats(int numContinents) {
        this.numberOfContinents = numContinents;
        this.continents = new String[numContinents];
        this.populationPerContinent = new int[numContinents];
        this.indexTracker = 0;
    }

    // Add a continent with name and population
    public void addContinent(String name, int population) {
        if (indexTracker < numberOfContinents) {
            continents[indexTracker] = name;
            populationPerContinent[indexTracker] = population;
            indexTracker++;
        }
    }

    // Get population by continent name
    public double getContinentByName(String name) {
        for (int i = 0; i < indexTracker; i++) {
            if (continents[i].equals(name)) {
                return populationPerContinent[i];
            }
        }
        return -1; 
    }

    public String[] getContinents() {
        return continents;
    }

    public int[] getPopulationPerContinent() {
        return populationPerContinent;
    }

    public int getNumberOfContinents() {
        return numberOfContinents;
    }

    public int getIndexTracker() {
        return indexTracker;
    }
}