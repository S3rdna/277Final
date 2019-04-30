import java.util.GregorianCalendar;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 */
public class Room implements Reservation {
    
    private ArrayList<Observer> guests;
    private boolean reserved;
    
    
    //State of rooms
    private boolean isAvailable = false;
    
    //getter for isAvailable
    
    public Room()
    {
        guests = new ArrayList<Observer>();
        this.reserved = true;
    }
    public boolean roomIsAvailable(GregorianCalendar date)
    {
        return isAvailable;
    }
    
    //setter for isAvailable
    public void setRoomAvailable(boolean isAvailable)
    {
        this.isAvailable = isAvailable;
        if(isAvailable == true){
            System.out.println("Specify booking details...");
            new Guest();
            this.reserved = true;
            System.out.println("reserved for party from " + " to ");
        }
        
        notifyObserver();//notifying the guests the state of change of the room
    }

    @Override
    public void addObserver(Observer o) {
        guests.add(o);
    }

    @Override
    public void removerObserver(Observer o) {
        int j = guests.indexOf(o);
        if(j >= 0){
            guests.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        //notify all the guests
        for(Observer guest: guests)
        {
            guest.update();
        }
    }
}
