import java.util.Date;
public class Quinceanera extends BirthdayParty {
    private static final int AGE = 15;
    private int numberOfDammas;
    private int numberOfToasts;
    private String danceMusicChoice;

    public Quinceanera() {
        super(); // Call the constructor of the parent class (BirthdayParty)
        
    }

    // Additional constructor for Quinceanera

    public Quinceanera(Date date, String startTime, String endTime, String locationName,
                       String locationAddress, String eventName, int numberOfGuests,
                       String pointOfContact, double price, String cake, int candles,
                       String decorations, int numberOfDammas, int numberOfToasts,
                       String danceMusicChoice) {
        super(date, startTime, endTime, locationName, locationAddress, eventName,
                numberOfGuests, pointOfContact, price, AGE, cake, candles, decorations);
        this.numberOfDammas = numberOfDammas;
        this.numberOfToasts = numberOfToasts;
        this.danceMusicChoice = danceMusicChoice;
    }

    // Getters and setters

    public int getNumberOfDammas() {
        return numberOfDammas;
    }

    public void setNumberOfDammas(int numberOfDammas) {
        this.numberOfDammas = numberOfDammas;
    }

    public int getNumberOfToasts() {
        return numberOfToasts;
    }

    public void setNumberOfToasts(int numberOfToasts) {
        this.numberOfToasts = numberOfToasts;
    }

    public String getDanceMusicChoice() {
        return danceMusicChoice;
    }

    public void setDanceMusicChoice(String danceMusicChoice) {
        this.danceMusicChoice = danceMusicChoice;
    }

    // Override toString method

    @Override
    public String toString() {
        return super.toString() +
                "\nNumber of Dammas: " + numberOfDammas +
                "\nNumber of toasts: " + numberOfToasts +
                "\nDance music: '" + danceMusicChoice + '\'' 
                ;
    }
}
