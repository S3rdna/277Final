
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * If a user has to become an Observer it will implement Observer functionality. notifyObserver() method.
 * From update method User can do something when state of Observable is changed. 
 * In this case getRoom() is called.

 * Here, User is not doing much with the status of Observable. 
 * But in some cases user might need to know the changed current status.
 * e.g. if user needs to know the change in price of the dress. 
 * In such a case the state of Observable is passed as parameter to the update method.

 * update(int price);

 * Once, user calls buyDress() he is not interested in any status change of RedDress. 
 * So, it calls unsubscribe() to get removed from the observer list of RedDress (Point 3 below). 
 * For this removeObserver of Observable need to be called. 
 * User keeps a reference of Observable so that it can call removeObserver when required.
 */

public class Guest implements Observer {
    
    private String name;
    private String phone;
    private String email;
    private String address;
    private String creditCardInfo;
    
    
    private GregorianCalendar dateFrom;
    private String dateF;
    private String dateT;
    private GregorianCalendar dateTo;
    private Date time;
    
    private int numberNights;
    private int roomsNum;
    private double totalCost;
    private double deposit;
    
    private MealPlan mealPlan;
    private Room roomType;
    private String upgrdesOrSpecInstruc;

    private Reservation res = null;
    
    public Guest()
    {
        
    }
    
    public Guest(Reservation res, String name, String ph, String em, String addr, String ccInfo, 
            String dateFrom, int nights)
    {
        this.res = res;
        //Guest info
        this.name = name;
        this.phone = ph;
        this.email = em;
        this.address = addr;
        this.creditCardInfo = ccInfo;
        
        this.dateF = dateFrom;
        String[] f = dateFrom.split("/");
        int d = Integer.parseInt(f[0]);
        int m = Integer.parseInt(f[1]) - 1;
        int y = Integer.parseInt(f[2]);
        int length = d + nights;
        this.dateT = length + "/" + (m + 1) + "/" + y;
        this.dateFrom = new GregorianCalendar(y, m, d);
        this.dateTo = new GregorianCalendar(y, m, d + nights);
    }   
    
    @Override
    public void update() {
        getRoom();//when room becomes availanble the guest gets the room
        unsubscribe(); // The guest is now no longer interested in the status so call this method
    }
    
    public void getRoom()
    {
        System.out.println("Got my room.");
    }
    
    //to stop further notifications to the user
    public void unsubscribe()
    {
        res.removerObserver(this);
    }
    
}
