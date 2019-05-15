
import java.util.ArrayList;


public class CheckInCheckOut {

    private ArrayList<Observer> reservationList;
    private ArrayList<Observer> waitingList;
    //This reference is used to track those who made reservations have acutalliy checkedIn
    private ArrayList<Observer> checkedIn;
    private ArrayList<Observer> checkedOut;
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
        

    
}
