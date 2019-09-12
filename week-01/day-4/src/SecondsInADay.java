public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int totalHours = 24;
        int totalMinutes = 60;
        int totalSeconds = 60;

        int remainingHours = totalHours - currentHours;
        int remainingMinutes = totalMinutes - currentMinutes;
        int remainingSeconds = totalSeconds - currentSeconds;

        int totalRemainingSeconds = (remainingHours * 60 * 60) + (remainingMinutes * 60) + remainingSeconds;

        System.out.println("The remaining seconds from this day are: " + totalRemainingSeconds);
        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
    }
}