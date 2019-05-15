package finalProject;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Room {

	private Map<Date, Date> reservedDates = new HashMap<Date, Date>();
	private double hours = 0;
	
	public Room()
	{
		
	}
	
	public double getHours()
	{
		return hours;
	}
	
	public void setHours(double newHours)
	{
		hours = newHours;
	}
	
	public void addReservationTime(Date begin, Date end)
	{
		reservedDates.put(begin, end);
	}
	
	public void removeReservationTime(Date reservationBegin)
	{
		
	}
	
	public Map<Date, Date> getDates()
	{
		return reservedDates;
	}
}
