/**
 * The reservation interface 
 */
public interface Reservation {
    public void addObserver(Observer newObserver);
    public void removerObserver(Observer deleteObserver);
    public void notifyObserver(); //when desired room becomes available
}
