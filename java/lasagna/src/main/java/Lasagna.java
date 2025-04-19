public class Lasagna {
    int expectedOvenTime = 40;

    public int expectedMinutesInOven() {
        return expectedOvenTime;
    }

    public int remainingMinutesInOven(int minutesInOven) {
        return expectedMinutesInOven() - minutesInOven;
    }

    public int preparationTimeInMinutes(int numberOfLayers) {
        return 2 * numberOfLayers;
    }

    public int totalTimeInMinutes(int numberOfLayers, int minutesInOven) {
        return preparationTimeInMinutes(numberOfLayers) + minutesInOven;
    }
}
