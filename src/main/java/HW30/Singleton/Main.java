package HW30.Singleton;

public class Main {
    public static void main(String[] args) {
        ConfigurationService configurationService = ConfigurationService.getInstance();
        System.out.println(configurationService.getProperties("name"));
        System.out.println(configurationService.getProperties("age"));
        System.out.println(configurationService.getProperties("game"));

    }
}
