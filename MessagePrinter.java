public class MessagePrinter {

    public static String getWelcomeMessage() {
        return "Hello! Welcome to Git and GitHub Tutorial!";
    }

    public static String getDateMessage() {
        return "Today is: " + java.time.LocalDate.now();
    }

    public static String getTimeMessage() {
        return "Current time: " + java.time.LocalTime.now();
    }

    public static String getGoodbyeMessage() {
        return "Thank you for using MessagePrinter!";
    }

    public static String getAuthorMessage() {
        return "Created by: Your Name";
    }

    public static void main(String[] args) {
        System.out.println(getWelcomeMessage());
        System.out.println(getDateMessage());
<<<<<<< HEAD
        System.out.println(getAuthorMessage());
=======
        System.out.println(getTimeMessage());
>>>>>>> feature/add-time
        System.out.println("Learning remote repositories!");
        System.out.println(getGoodbyeMessage());
    }
}
