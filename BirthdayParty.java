import java.util.Date;
public class BirthdayParty extends Event {
    private int age;
    private String cake;
    private int candles;
    private String decorations;

    public BirthdayParty() {
        super(new Date(), "", "", "", "", "", 0, "", 0.0); // Call the constructor of the parent class (Event)
    }

    // Additional constructor for BirthdayParty

    public BirthdayParty(Date date, String startTime, String endTime, String locationName,
                         String locationAddress, String eventName, int numberOfGuests,
                         String pointOfContact, double price, int age, String cake,
                         int candles, String decorations) {
        super(date, startTime, endTime, locationName, locationAddress, eventName,
                numberOfGuests, pointOfContact, price);
        this.age = age;
        this.cake = cake;
        this.candles = candles;
        this.decorations = decorations;
    }

    // Getters and setters

    public int getAge() {
        return age;
    }

    // No setter for age to demonstrate immutability

    public String getCake() {
        return cake;
    }

    public void setCake(String cake) {
        this.cake = cake;
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }

    public String getDecorations() {
        return decorations;
    }

    public void setDecorations(String decorations) {
        this.decorations = decorations;
    }

    // Override toString method

    @Override
    public String toString() {
        return super.toString() +
                "\nAge: " + age +
                "\nType of cake: '" + cake + '\'' +
                "\nAmount of candles: " + candles +
                "\nDecorations: '" + decorations + '\'' 
                ;
    }
}
