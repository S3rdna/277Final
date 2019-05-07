
import java.util.ArrayList;


/*
 * The guest class will collect guest information for the reservation to be made.
 */

public class Guest implements Observer {
    
    private String name;
    private String phone;
    private String email;
    private String address;
    private String creditCardInfo;
    private ArrayList<String> guestDetails;
    
    
    /**
     * Default constructor
     */
    public Guest()
    {
        System.out.println("Default Constructor has been invoked.");
        this.name = "Dimi";
        this.phone = "1234567890";
        this.email = "dimi2019@yahoo.com";
        this.address = "1250 Long beach, CA ";
        this.creditCardInfo = "4400456912347895";
        this.guestDetails = new ArrayList<>();
        guestDetails.add(name);
        guestDetails.add(phone);
        guestDetails.add(email);
        guestDetails.add(address);
        guestDetails.add(creditCardInfo);
        
    }
    /**
     * Allows the Party World! employee to create a guest
     * @param name
     * @param ph
     * @param em
     * @param addr
     * @param ccInfo 
     */
    public Guest(String nam, String ph, String em, String addr, String ccInfo)
    {
        this.name = nam;
        this.phone = ph;
        this.email = em;
        this.address = addr;
        this.creditCardInfo = ccInfo;
        guestDetails.add(name);
        guestDetails.add(phone);
        guestDetails.add(email);
        guestDetails.add(address);
        guestDetails.add(creditCardInfo);
    }   

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the creditCardInfo
     */
    public String getCreditCardInfo() {
        return creditCardInfo;
    }

    /**
     * @param creditCardInfo the creditCardInfo to set
     */
    public void setCreditCardInfo(String creditCardInfo) {
        this.creditCardInfo = creditCardInfo;
    }

    /**
     * 
     */
    @Override
    public void update() {
        //after room becomes available and after cleaning is done.
        //Needs some code here
        System.out.println("The desired room is now available.");
    }
    /**
     * 
     */
    public void getRoom()
    {
        System.out.println("Got my room.");
    }
    
    @Override
    public void update(String nam, String ph, String em, String addr, String ccInfo) {
        System.out.println("Updating guest information now...");        
    }
    
    @Override
    public String toString()
    {
        return "Guest Details:\n\t Name: " + 
                this.name +"\nAddress: "+
                this.address + "\nPhone number: " + this.phone
                +"\nEmail: "+ this.email;
                
    }
    
}
