import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class EventPlanner {

    public static void main(String[] args) {
        System.out.println("Course: Java Advanced");
        System.out.println("Assignment: Event Planner Program");
        System.out.println("Date: 2024-02-18");
        System.out.println("Student: Dominic Uson");
        //ask user how many events to create, store in numEvents
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of events to create: ");
        int numEvents = scanner.nextInt();
        //array for events
        Event[] events = new Event[numEvents];
        //loop for number of events chosen
        for (int i = 0; i < numEvents; i++) {
            System.out.println("Choose the type of event for event #" + (i + 1) + ":");
            System.out.println("1. Birthday Party");
            System.out.println("2. Event");
            System.out.println("3. Quinceanera");
            System.out.print("Enter your choice (1, 2, or 3): ");
            
            int eventType = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            Event event;

            switch (eventType) {
                case 1:
                    event = createBirthdayParty(scanner);
                    break;
                case 2:
                    event = createEvent(scanner);
                    break;
                case 3:
                    event = createQuinceanera(scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Defaulting to a generic event.");
                    event = createEvent(scanner);
            }

            events[i] = event;
        }
        //print planning report
        System.out.println("\nEvent Planning Report:");
        for (int i = 0; i < numEvents; i++) {
            System.out.println("Event #" + (i + 1) + ":");
            System.out.println(events[i].toString());
            System.out.println();
        }
        //close scanner (end of program)
        scanner.close();
    }
    //create birthday party
    private static BirthdayParty createBirthdayParty(Scanner scanner) {
        System.out.print("Enter date (yyyy-mm-dd): ");
        String dateStr = scanner.next();

        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace(); // Handle the exceptions
        }
        
        System.out.print("Enter start time: ");
        String startTime = scanner.next();
    
        System.out.print("Enter end time: ");
        String endTime = scanner.next();
        scanner.nextLine();
        System.out.print("Enter location name: ");
        String locationName = scanner.nextLine();
    
        System.out.print("Enter location address: ");
        String locationAddress = scanner.nextLine();
        
        System.out.print("Enter event name: ");
        String eventName = scanner.nextLine();
    
        System.out.print("Enter number of guests: ");
        int numberOfGuests = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter point of contact: ");
        String pointOfContact = scanner.nextLine();
        
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter age of birthday person: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter cake type: ");
        String cake = scanner.nextLine();
        
        System.out.print("Enter number of candles on the cake: ");
        int candles = scanner.nextInt();
        scanner.nextLine();
    
        System.out.print("Enter decorations: ");
        String decorations = scanner.nextLine();
        return new BirthdayParty(date, startTime, endTime, locationName, locationAddress,
            eventName, numberOfGuests, pointOfContact, price, age, cake, candles, decorations); 
    }
    //create event
    private static Event createEvent(Scanner scanner) {
        System.out.print("Enter date (yyyy-mm-dd): ");
        String dateStr = scanner.next();
        
         Date date = null;
    try {
        date = new SimpleDateFormat("yyyy-MM-dd").parse(dateStr);
    } catch (ParseException e) {
        e.printStackTrace(); // Handle the exceptions
    }
        System.out.print("Enter start time: ");
        String startTime = scanner.next();
    
        System.out.print("Enter end time: ");
        String endTime = scanner.next();
        scanner.nextLine();
        System.out.print("Enter location name: ");
        String locationName = scanner.nextLine();
    
        System.out.print("Enter location address: ");
        String locationAddress = scanner.nextLine();
        
        System.out.print("Enter event name: ");
        String eventName = scanner.nextLine();   

        System.out.print("Enter number of participants: ");
        int numberOfParticipants = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter point of contact: ");
        String pointOfContact = scanner.nextLine();
        
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        return new Event(date, startTime, endTime, locationName, locationAddress,
            eventName, numberOfParticipants, pointOfContact, price);
    }
    //create Quinceanera
    private static Quinceanera createQuinceanera(Scanner scanner) {
    System.out.print("Enter date (yyyy-mm-dd): ");
    String dateStr = scanner.next();

    Date date = null;
    try {
        date = new SimpleDateFormat("yyyy-MM-dd").parse(dateStr);
    } catch (ParseException e) {
        e.printStackTrace(); // Handle the exceptions
    }
    
    System.out.print("Enter start time: ");
    String startTime = scanner.next();

    System.out.print("Enter end time: ");
    String endTime = scanner.next();
    scanner.nextLine();
    System.out.print("Enter location name: ");
    String locationName = scanner.nextLine();

    System.out.print("Enter location address: ");
    String locationAddress = scanner.nextLine();
    
    System.out.print("Enter event name: ");
    String eventName = scanner.nextLine();

    System.out.print("Enter number of guests: ");
    int numberOfGuests = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Enter point of contact: ");
    String pointOfContact = scanner.nextLine();
    
    System.out.print("Enter price: ");
    double price = scanner.nextDouble();
    scanner.nextLine();

    System.out.print("Enter cake type: ");
    String cake = scanner.nextLine();
    

    System.out.print("Enter number of candles on the cake: ");
    int candles = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Enter decorations: ");
    String decorations = scanner.nextLine();
    
    System.out.print("Enter number of damas: ");
    int numberOfDammas = scanner.nextInt();

    System.out.print("Enter number of toasts: ");
    int numberOfToasts = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Enter choice of dance music: ");
    String danceMusicChoice = scanner.nextLine();
    
    return new Quinceanera(date, startTime, endTime, locationName, locationAddress,
            eventName, numberOfGuests, pointOfContact, price, cake, candles, decorations,
            numberOfDammas, numberOfToasts, danceMusicChoice);
    }
}

