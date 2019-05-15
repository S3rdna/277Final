package finalProject;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RoomFactory {

	private ArrayList<Room> aquaRooms = new ArrayList<Room>();
	private ArrayList<Room> smallPartyRooms = new ArrayList<Room>();
	private ArrayList<Room> mediumPartyRooms = new ArrayList<Room>();
	private ArrayList<Room> karaokeRooms = new ArrayList<Room>();
	private ArrayList<Room> billiardsRooms = new ArrayList<Room>();
	
	public RoomFactory()
	{
		Room Aqua1 = new AquaRoom(); aquaRooms.add(Aqua1);
		Room SmallParty1 = new SmallPartyRoom(); smallPartyRooms.add(SmallParty1);
		Room SmallParty2 = new SmallPartyRoom(); smallPartyRooms.add(SmallParty2);
		Room SmallParty3 = new SmallPartyRoom(); smallPartyRooms.add(SmallParty3);
		Room SmallParty4 = new SmallPartyRoom(); smallPartyRooms.add(SmallParty4);
		Room SmallParty5 = new SmallPartyRoom(); smallPartyRooms.add(SmallParty5);
		Room SmallParty6 = new SmallPartyRoom(); smallPartyRooms.add(SmallParty6);
		Room SmallParty7 = new SmallPartyRoom(); smallPartyRooms.add(SmallParty7);
		Room SmallParty8 = new SmallPartyRoom(); smallPartyRooms.add(SmallParty8);
		Room SmallParty9 = new SmallPartyRoom(); smallPartyRooms.add(SmallParty9);
		Room SmallParty10 = new SmallPartyRoom(); smallPartyRooms.add(SmallParty10);
		Room MediumParty1 = new MediumPartyRoom(); mediumPartyRooms.add(MediumParty1);
		Room MediumParty2 = new MediumPartyRoom(); mediumPartyRooms.add(MediumParty2);
		Room Karaoke1 = new KaraokeRoom(); karaokeRooms.add(Karaoke1);
		Room Karaoke2 = new KaraokeRoom(); karaokeRooms.add(Karaoke2);
		Room Karaoke3 = new KaraokeRoom(); karaokeRooms.add(Karaoke3);
		Room Karaoke4 = new KaraokeRoom(); karaokeRooms.add(Karaoke4);
		Room Karaoke5 = new KaraokeRoom(); karaokeRooms.add(Karaoke5);
		Room Karaoke6 = new KaraokeRoom(); karaokeRooms.add(Karaoke6);
		Room Karaoke7 = new KaraokeRoom(); karaokeRooms.add(Karaoke7);
		Room Karaoke8 = new KaraokeRoom(); karaokeRooms.add(Karaoke8);
		Room Karaoke9 = new KaraokeRoom(); karaokeRooms.add(Karaoke9);
		Room Karaoke10 = new KaraokeRoom(); karaokeRooms.add(Karaoke10);
		Room Billiards1 = new BilliardsRoom(); billiardsRooms.add(Billiards1);
		Room Billiards2 = new BilliardsRoom(); billiardsRooms.add(Billiards2);
		Room Billiards3 = new BilliardsRoom(); billiardsRooms.add(Billiards3);
		Room Billiards4 = new BilliardsRoom(); billiardsRooms.add(Billiards4);
		Room Billiards5 = new BilliardsRoom(); billiardsRooms.add(Billiards5);
	}
	
	public ArrayList<Room> getAvailableRooms()
	{
		return aquaRooms;
	}
	
	public Room isAvailable(String roomType, Date begin, Date end)
	{
		boolean available = false;
		if (roomType == "AquaRoom")
		{
			for (int i = 0; i < aquaRooms.size(); i++)//iterate through each room
			{
				Room tempRoom = aquaRooms.get(i);
				Map<Date, Date> tempDates = tempRoom.getDates();
				if (tempDates.size() == 0)//map has no reserved times yet
				{
					return tempRoom;
				}
				for (Map.Entry<Date, Date> entry : tempDates.entrySet())//iterate through all entries in the map
				{
					Date tempKey = entry.getKey();
					Date tempValue = entry.getValue();
					System.out.println(tempKey.toString());
					System.out.println(tempValue.toString());
					//need to account for time to clean
					if ((begin.after(tempKey) && begin.before(tempValue)) || (end.after(tempKey) && end.before(tempValue)))
					{
						available = false;
					}
					else
					{
						return tempRoom;
					}
				}
			}
		}
		else if (roomType == "SmallPartyRoom")
		{
			for (int i = 0; i < smallPartyRooms.size(); i++)
			{
				Room tempRoom = smallPartyRooms.get(i);
				Map<Date, Date> tempDates = tempRoom.getDates();
				if (tempDates.size() == 0)
				{
					return tempRoom;
				}
				for (Map.Entry<Date, Date> entry : tempDates.entrySet())
				{
					Date tempKey = entry.getKey();
					Date tempValue = entry.getValue();
					if ((begin.after(tempKey) && begin.before(tempValue)) || (end.after(tempKey) && end.before(tempValue)))
					{
						available = false;
					}
					else
					{
						return tempRoom;
					}
				}
			}
		}
		else if (roomType == "MediumPartyRoom")
		{
			for (int i = 0; i < mediumPartyRooms.size(); i++)
			{
				Room tempRoom = mediumPartyRooms.get(i);
				Map<Date, Date> tempDates = tempRoom.getDates();
				if (tempDates.size() == 0)
				{
					return tempRoom;
				}
				for (Map.Entry<Date, Date> entry : tempDates.entrySet())
				{
					Date tempKey = entry.getKey();
					Date tempValue = entry.getValue();
					if ((begin.after(tempKey) && begin.before(tempValue)) || (end.after(tempKey) && end.before(tempValue)))
					{
						available = false;
					}
					else
					{
						return tempRoom;
					}
				}
			}
		}
		else if (roomType == "KaraokeRoom")
		{
			for (int i = 0; i < karaokeRooms.size(); i++)
			{
				Room tempRoom = karaokeRooms.get(i);
				Map<Date, Date> tempDates = tempRoom.getDates();
				if (tempDates.size() == 0)
				{
					return tempRoom;
				}
				for (Map.Entry<Date, Date> entry : tempDates.entrySet())
				{
					Date tempKey = entry.getKey();
					Date tempValue = entry.getValue();
					if ((begin.after(tempKey) && begin.before(tempValue)) || (end.after(tempKey) && end.before(tempValue)))
					{
						available = false;
					}
					else
					{
						return tempRoom;
					}
				}
			}
		}
		else if (roomType == "BilliardsRoom")
		{
			for (int i = 0; i < billiardsRooms.size(); i++)
			{
				Room tempRoom = billiardsRooms.get(i);
				Map<Date, Date> tempDates = tempRoom.getDates();
				if (tempDates.size() == 0)
				{
					return tempRoom;
				}
				for (Map.Entry<Date, Date> entry : tempDates.entrySet())
				{
					Date tempKey = entry.getKey();
					Date tempValue = entry.getValue();
					if ((begin.after(tempKey) && begin.before(tempValue)) || (end.after(tempKey) && end.before(tempValue)))
					{
						available = false;
					}
					else
					{
						return tempRoom;
					}
				}
			}
		}
		return null;
	}
	
}
