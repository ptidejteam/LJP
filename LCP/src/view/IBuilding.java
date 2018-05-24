package view;

import java.util.Iterator;

public interface IBuilding extends IDisplayable {
	public void addRoom(final IRoom room);
	public void removeRoom(final IRoom room);
	public Iterator<IRoom> getRoom();
	
	public void addOccupant(final IPerson occupant);
	public void removeOccupant(final IPerson occupant);
	public Iterator<IPerson> getOccupants();
	
	public void addPet(final IPet pet);
	public void removePet(final IPet pet);
	public Iterator<IPet> getPets();
	
	public void setNumFloors(final Integer numFloors);
	public Integer getNumFloors();
}