
import java.util.ArrayList;


public class CheckInCheckOut {

    private ArrayList<Guest> reservationList;
    private ArrayList<Guest> waitingList;
    private ArrayList<Guest> checkedIn;
    private ArrayList<Guest> checkedOut;
    /**
     * @return the reservationList
     */
    public ArrayList<Guest> getReservationList() {
        return reservationList;
    }

    /**
     * @param reservationList the reservationList to set
     */
    public void setReservationList(ArrayList<Guest> reservationList) {
        this.reservationList = reservationList;
    }

    /**
     * @return the waitingList
     */
    public ArrayList<Guest> getWaitingList() {
        return waitingList;
    }

    /**
     * @param waitingList the waitingList to set
     */
    public void setWaitingList(ArrayList<Guest> waitingList) {
        this.waitingList = waitingList;
    }

    /**
     * @return the checkedIn
     */
    public ArrayList<Guest> getCheckedIn() {
        return checkedIn;
    }

    /**
     * @param checkedIn the checkedIn to set
     */
    public void setCheckedIn(ArrayList<Guest> checkedIn) {
        this.checkedIn = checkedIn;
    }

    /**
     * @return the checkedOut
     */
    public ArrayList<Guest> getCheckedOut() {
        return checkedOut;
    }

    /**
     * @param checkedOut the checkedOut to set
     */
    public void setCheckedOut(ArrayList<Guest> checkedOut) {
        this.checkedOut = checkedOut;
    }


}