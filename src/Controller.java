import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Controller {
    private WeatherModel weatherModel = new AccuweatherModel();
    private Map<Integer, Period> variants = new HashMap<>();

    public Controller() {
        variants.put(1, Period.NOW);
        variants.put(5, Period.FIVE_DAYS);
    }

    public void getWeather(String userInput, String city) throws IOException {
        Integer option = Integer.parseInt(userInput);
        switch (variants.get(option)) {
            case NOW:
                weatherModel.getWeather(city, Period.NOW);
                break;
            case FIVE_DAYS:
                weatherModel.getWeather(city, Period.FIVE_DAYS);
        }
    }
}