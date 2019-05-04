/**
 * The Observers update method is called when the Subject changes
 */
public interface Observer {
    public void update();//For Waiting List observerst that the room requested is available
    public void update(String nam, String ph, String em, String addr, String ccInfo);
}
