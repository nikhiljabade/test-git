public class LoadConfig {
    public static void main(String[] args) {
        /* ADDED COMMENT */
        Properties prop = new Properties();
        prop.load(App.class.getClassLoader().getResourceAsStream("./resources/config.properties"));
        System.out.println(prop.getProperty("user"));
    }
}