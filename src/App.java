public class App {
    private String message;

    public App(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static void main(String[] args) throws Exception {
        App app = new App("Hello, World!");
        System.out.println(app.getMessage());
    }
}
