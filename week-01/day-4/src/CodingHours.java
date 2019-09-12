public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        int hours = 6;
        int weeks = 17;
        int workDays = 5;
        int totalWorkHours = hours*weeks*workDays;
        int avrWorkHours = 52;
        System.out.println("An average Greenfox attendee spends " + totalWorkHours+ " hours with coding in a semester.");
        System.out.println("Coding percentage: " + (int) (((float)totalWorkHours / ((float)weeks*(float)avrWorkHours))*100) + "%");
    }
}