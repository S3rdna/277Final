

import java.util.ArrayList;

/**
 *
 */
public class ReservationData implements Reservation {

    
    private Room roomType;
    
    protected ArrayList<Observer> reservationList;
    protected ArrayList<Observer> waitingList;
    //This reference is used to track those who made reservations have acutalliy checkedIn
    protected ArrayList<Observer> checkedIn;
    protected ArrayList<Observer> checkedOut;
    


    private double totalCost;
    private double deposit;

    /**
     * Default constructor initializes two lists, reservationList and Waiting
     * List
     */
    public ReservationData() {
        this.reservationList = new ArrayList<>();
        this.waitingList = new ArrayList<>();
    }
    
    public ReservationData(Room roomType) {
        this.reservationList = new ArrayList<>();
        this.waitingList = new ArrayList<>();
        
    }

    /**
     * This method adds a a guest to the reservation list
     *
     * @param newObserver
     */
    @Override
    public void addObserver(Observer newObserver) {
        // Adds a new observer to the ArrayList
        reservationList.add(newObserver);
    }

    /**
     *
     * @param deleteObserver
     */
    @Override
    public void removerObserver(Observer deleteObserver) {
        // Get the index of the observer to delete
        int observerIndex = reservationList.indexOf(deleteObserver);
        // Print out message (Have to increment index to match)
        System.out.println("Observer " + (observerIndex + 1) + " deleted");
        // Removes observer from the ArrayList - Observer is guest
        reservationList.remove(observerIndex);

    }

    /**
     *
     */
    @Override
    public void notifyObserver() {
        // Cycle through all waiting List observers and notifies them of if the desired room becomes available
        //if(RoomType isAvailable) then do below and informa the guest
        
        System.out.println("Notifying the Guests....and the Pary World Employee.");
 
        for(Observer observer : waitingList){
            observer.update();
        }


    }
    /**
     * Checks if a room is available and adds a reservation object to both the
     * list of reservations and to the rooms associated with the object.
     */
    public boolean checkAvailability(int dateFrom, int dateTo, Room roomType) {
        
        System.out.println("Checking Room availability now...");
        if(dateFrom == 5 && dateTo == 7 && roomType.getNoOfRooms() > 0)
        {
            notifyObserver();
            System.out.println(roomType + " Room is available from " + dateFrom + " to "+dateTo);
            setRoomType(roomType);
            return true;
        }
        
        System.out.println(roomType + " Room is not available from " + dateFrom + " to " + dateTo);
        
        return false;
    }

    /**
     * @return the totalCost
     */
    public double getTotalCost() {
        return totalCost;
    }

    /**
     * @param totalCost the totalCost to set
     */
    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    /**
     * @return the deposit
     */
    public double getDeposit() {
        return deposit;
    }

    /**
     * @param deposit the deposit to set
     */
    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    /**
     * @return the reservationList
     */
    public ArrayList<Observer> getReservationList() {
        return reservationList;
    }

    /**
     * @param reservationList the reservationList to set
     */
    public void setReservationList(ArrayList<Observer> reservationList) {
        this.reservationList = reservationList;
    }

    /**
     * @return the waitingList
     */
    public ArrayList<Observer> getWaitingList() {
        return waitingList;
    }

    /**
     * @param waitingList the waitingList to set
     */
    public void setWaitingList(ArrayList<Observer> waitingList) {
        this.waitingList = waitingList;
    }

    /**
     * @return the checkedIn
     */
    public ArrayList<Observer> getCheckedIn() {
        return checkedIn;
    }

    /**
     * @param checkedIn the checkedIn to set
     */
    public void setCheckedIn(ArrayList<Observer> checkedIn) {
        this.checkedIn = checkedIn;
    }

    /**
     * @return the checkedOut
     */
    public ArrayList<Observer> getCheckedOut() {
        return checkedOut;
    }

    /**
     * @param checkedOut the checkedOut to set
     */
    public void setCheckedOut(ArrayList<Observer> checkedOut) {
        this.checkedOut = checkedOut;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Welcome...\nNumber of reservations: " + this.getReservationList().size()
                + "\nNumber of waitingInLine: " + this.getWaitingList().size();
    }

    /**
     * @return the roomType
     */
    public Room getRoomType() {
        return roomType;
    }

    /**
     * @param roomType the roomType to set
     */
    public void setRoomType(Room roomType) {
        this.roomType = roomType;
    }

}
