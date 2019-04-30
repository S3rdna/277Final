/**
 * The reservation interface 
 */
public interface Reservation {
    public void addObserver(Observer o);
    public void removerObserver(Observer o);
    public void notifyObserver(); 
}
