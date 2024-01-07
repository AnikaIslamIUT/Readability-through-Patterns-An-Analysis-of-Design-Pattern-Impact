public class TemperatureAdapter implements TemperatureClient {
    private TemperatureProvider temperatureProvider;

    public TemperatureAdapter(TemperatureProvider temperatureProvider) {
        this.temperatureProvider = temperatureProvider;
    }

    @Override
    public void displayTemperature(double temperatureInFahrenheit) {
        // Convert Celsius to Fahrenheit and display in the new system
        double temperatureInCelsius = temperatureProvider.getTemperatureInCelsius();
        double temperatureInF = (temperatureInCelsius * 9 / 5) + 32;
        System.out.println("Temperature displayed in Fahrenheit: " + temperatureInF);
    }
}
