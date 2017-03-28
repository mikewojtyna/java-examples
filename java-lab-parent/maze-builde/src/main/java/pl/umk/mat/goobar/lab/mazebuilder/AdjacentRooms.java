/**
 *
 */
package pl.umk.mat.goobar.lab.mazebuilder;

import java.util.Optional;

/**
 * @author goobar
 *
 */
public class AdjacentRooms
{
	private Optional<Room> eastRoom;

	private Optional<Room> northRoom;

	private Optional<Room> southRoom;

	private Optional<Room> westRoom;

	public Optional<Room> getEastRoom()
	{
		// TODO: implement
		throw new UnsupportedOperationException("Not implemented");
	}

	public Optional<Room> getNorthRoom()
	{
		// TODO: implement
		return northRoom;
	}

	public Optional<Room> getSouthRoom()
	{
		// TODO: implement
		throw new UnsupportedOperationException("Not implemented");
	}

	public Optional<Room> getWestRoom()
	{
		// TODO: implement
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * @param eastRoom
	 *                the eastRoom to set
	 */
	void setEastRoom(Room eastRoom)
	{
		this.eastRoom = Optional.of(eastRoom);
	}

	/**
	 * @param northRoom
	 *                the northRoom to set
	 */
	void setNorthRoom(Room northRoom)
	{
		this.northRoom = Optional.of(northRoom);
	}

	/**
	 * @param southRoom
	 *                the southRoom to set
	 */
	void setSouthRoom(Room southRoom)
	{
		this.southRoom = Optional.of(southRoom);
	}

	/**
	 * @param westRoom
	 *                the westRoom to set
	 */
	void setWestRoom(Room westRoom)
	{
		this.westRoom = Optional.of(westRoom);
	}
}
