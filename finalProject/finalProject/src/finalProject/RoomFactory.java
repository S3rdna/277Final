package finalProject;

import java.util.ArrayList;

public class RoomFactory {

	private ArrayList<Room> availableRooms = new ArrayList<Room>();
	private ArrayList<Room> unavailableRooms = new ArrayList<Room>();
	
	public RoomFactory()
	{
		Room Aqua1 = new AquaRoom(); availableRooms.add(Aqua1);
		Room SmallParty1 = new SmallPartyRoom(); availableRooms.add(SmallParty1);
		Room SmallParty2 = new SmallPartyRoom(); availableRooms.add(SmallParty2);
		Room SmallParty3 = new SmallPartyRoom(); availableRooms.add(SmallParty3);
		Room SmallParty4 = new SmallPartyRoom(); availableRooms.add(SmallParty4);
		Room SmallParty5 = new SmallPartyRoom(); availableRooms.add(SmallParty5);
		Room SmallParty6 = new SmallPartyRoom(); availableRooms.add(SmallParty6);
		Room SmallParty7 = new SmallPartyRoom(); availableRooms.add(SmallParty7);
		Room SmallParty8 = new SmallPartyRoom(); availableRooms.add(SmallParty8);
		Room SmallParty9 = new SmallPartyRoom(); availableRooms.add(SmallParty9);
		Room SmallParty10 = new SmallPartyRoom(); availableRooms.add(SmallParty10);
		Room MediumParty1 = new MediumPartyRoom(); availableRooms.add(MediumParty1);
		Room MediumParty2 = new MediumPartyRoom(); availableRooms.add(MediumParty2);
		Room Karaoke1 = new KaraokeRoom(); availableRooms.add(Karaoke1);
		Room Karaoke2 = new KaraokeRoom(); availableRooms.add(Karaoke2);
		Room Karaoke3 = new KaraokeRoom(); availableRooms.add(Karaoke3);
		Room Karaoke4 = new KaraokeRoom(); availableRooms.add(Karaoke4);
		Room Karaoke5 = new KaraokeRoom(); availableRooms.add(Karaoke5);
		Room Karaoke6 = new KaraokeRoom(); availableRooms.add(Karaoke6);
		Room Karaoke7 = new KaraokeRoom(); availableRooms.add(Karaoke7);
		Room Karaoke8 = new KaraokeRoom(); availableRooms.add(Karaoke8);
		Room Karaoke9 = new KaraokeRoom(); availableRooms.add(Karaoke9);
		Room Karaoke10 = new KaraokeRoom(); availableRooms.add(Karaoke10);
		Room Billiards1 = new BilliardsRoom(); availableRooms.add(Billiards1);
		Room Billiards2 = new BilliardsRoom(); availableRooms.add(Billiards2);
		Room Billiards3 = new BilliardsRoom(); availableRooms.add(Billiards3);
		Room Billiards4 = new BilliardsRoom(); availableRooms.add(Billiards4);
		Room Billiards5 = new BilliardsRoom(); availableRooms.add(Billiards5);
	}
	
	public ArrayList<Room> getAvailableRooms()
	{
		return availableRooms;
	}
	
	public ArrayList<Room> getUnavailableRooms()
	{
		return unavailableRooms;
	}
	
	public boolean isAvailable(String roomType)
	{
		if (roomType == "AquaRoom")
		{
			
		}
		else if (roomType == "SmallPartyRoom")
		{
			
		}
		else if (roomType == "MediumPartyRoom")
		{
			
		}
		else if (roomType == "KaraokeRoom")
		{
			
		}
		else if (roomType == "BilliardsRoom")
		{
			
		}
		return true;
	}
	
}
