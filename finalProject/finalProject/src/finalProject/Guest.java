
/*
 * The guest class will collect guest information for the reservation to be made.
 */

public class Guest implements Observer {
    
    private String fName; 
    private String lName;
    private String phone;
    private String email;
    private String address;
    private String DOB;
    
    private String[] creditCardInfo = new String[3];
    
    
    /**
     * Default constructor
     */
    public Guest()
    {
        this.fName = "Dimi";
        this.lName = "Perer";
        this.phone = "1234567890";
        this.email = "dimi2019@yahoo.com";
        this.address = "1250 Long beach, CA ";
        this.creditCardInfo[0] = "name";
        this.creditCardInfo[1] = "4815232615694878";
        this.creditCardInfo[2] = "482";
        
    }
    /**
     * Allows the Party World! employee to create a guest
     * @param name
     * @param ph
     * @param em
     * @param addr
     */
    public Guest(String fNam, String lNam, String ph, String em, String addr, String nameOnCard, String ccNumber, String secCode)
    {
        this.fName = fNam;
        this.lName = lNam;
        this.phone = ph;
        this.email = em;
        this.address = addr;
        this.creditCardInfo[0] = nameOnCard;
        this.creditCardInfo[1] = ccNumber;
        this.creditCardInfo[2] = secCode;
    }   

    /**
     * @return the DOB
     */
    public String getDOB() {
        return DOB;
    }

    /**
     * @param DOB the DOB to set
     */
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    /**
     * @return the fName
     */
    public String getfName() {
        return fName;
    }

    /**
     * @param fName the fName to set
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     * @return the lName
     */
    public String getlName() {
        return lName;
    }

    /**
     * @param lName the lName to set
     */
    public void setlName(String lName) {
        this.lName = lName;
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
    public void update(String fnam, String lnam, String ph, String em, String addr, String ccInfo) {
        System.out.println("Updating guest information now..."); 
        
    }
    
    @Override
    public String toString()
    {
        return "Guest Details:\n\t Name: " + 
                this.getfName() + " " +this.getlName()+"\nAddress: "+
                this.address + "\nPhone number: " + this.phone
                +"\nEmail: "+ this.email;
                
    }

    /**
     * @return the creditCardInfo
     */
    public String[] getCreditCardInfo() {
        return creditCardInfo;
    }

    /**
     * @param creditCardInfo the creditCardInfo to set
     */
    public void setCreditCardInfo(String[] creditCardInfo) {
        this.creditCardInfo = creditCardInfo;
    }
    
}
