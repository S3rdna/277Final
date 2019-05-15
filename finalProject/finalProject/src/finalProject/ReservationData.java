

/**
 *
 */
public class ReservationData implements Reservation {

    
    private Room roomType;
    private Guest guest;

    private double totalCost;
    private double deposit;

    public ReservationData() {
        this.roomType = null;
        this.guest = null;

    }
    /**
     * 
     * @param roomType
     * @param guest 
     */
    public ReservationData(Room roomType, Guest guest) {
        roomType = new Room();
        guest = new Guest();        
    }
    /**
     * 
     * @param newObserver 
     */
    @Override
    public void addObserver(Observer newObserver) {
        
    }
    /**
     * 
     * @param deleteObserver 
     */
    @Override
    public void removerObserver(Observer deleteObserver) {
        
    }
    /**
     * 
     */
    @Override
    public void notifyObserver() {
        
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

    /**
     * @return the guest
     */
    public Guest getGuest() {
        return guest;
    }

    /**
     * @param guest the guest to set
     */
    public void setGuest(Guest guest) {
        this.guest = guest;
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

}
