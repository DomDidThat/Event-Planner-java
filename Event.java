import java.util.Date;

public class Event {
private Date date;
private String startTime;
private String endTime;
private String locationName;
private String locationAddress;
private String eventName;
private int numberOfGuests;
private String pointOfContact;
private double price;


public Event(Date date, String startTime, String endTime, String locationName,
String locationAddress, String eventName, int numberOfGuests,
String pointOfContact, double price) {
this.date = date;
this.startTime = startTime;
this.endTime = endTime;
this.locationName = locationName;
this.locationAddress = locationAddress;
this.eventName = eventName;
this.numberOfGuests = numberOfGuests;
this.pointOfContact = pointOfContact;
this.price = price;
}

public Event() {
    // You can provide default values or leave them uninitialized
    this.date = new Date();
    this.startTime = "";
    this.endTime = "";
    this.locationName = "";
    this.locationAddress = "";
    this.eventName = "";
    this.numberOfGuests = 0;
    this.pointOfContact = "";
    this.price = 0;
}

public Date getDate() {
    return date;
}

public void setDate(Date date) {
    this.date = date;
}

public String getStartTime() {
    return startTime;
}

public void setStartTime(String startTime) {
    this.startTime = startTime;
}

public String getEndTime() {
    return endTime;
}

public void setEndTime(String endTime) {
    this.endTime = endTime;
}

public String getLocationName() {
    return locationName;
}

public void setLocationName(String locationName) {
    this.locationName = locationName;
}

public String getLocationAddress() {
    return locationAddress;
}

public void setLocationAddress(String locationAddress) {
    this.locationAddress = locationAddress;
}

public String getEventName() {
    return eventName;
}

public void setEventName(String eventName) {
    this.eventName = eventName;
}

public int getNumberOfGuests() {
    return numberOfGuests;
}

public void setNumberOfGuests(int numberOfGuests) {
    this.numberOfGuests = numberOfGuests;
}

public String getPointOfContact() {
    return pointOfContact;
}

public void setPointOfContact(String pointOfContact) {
    this.pointOfContact = pointOfContact;
}

public double getPrice() {
    return price;
}

public void setPrice(double price) {
    this.price = price;
}

// toString method

@Override
public String toString() {
    return "\nEvent" +
            "\nDate: " + date +
            "\nStart time: '" + startTime + '\'' +
            "\nEnd time: '" + endTime + '\'' +
            "\nLocation Name: '" + locationName + '\'' +
            "\nLocation Address: '" + locationAddress + '\'' +
            "\nEvent Name'" + eventName + '\'' +
            "\nNumber of Guests: " + numberOfGuests +
            "\nPoint of Contact: '" + pointOfContact + '\'' +
            "\nPrice: $" + price 
            ;
}
}
