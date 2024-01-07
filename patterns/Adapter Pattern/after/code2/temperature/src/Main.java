public class Main {
    public static void main(String[] args) {
        // Creating an instance of TemperatureProvider
        TemperatureProvider temperatureProvider = new TemperatureProvider();

        // Creating an instance of TemperatureAdapter, adapting TemperatureProvider to the new system
        TemperatureClient temperatureAdapter = new TemperatureAdapter(temperatureProvider);

        // Using the adapted object in the new system
        temperatureAdapter.displayTemperature(0.0);
    }
}
