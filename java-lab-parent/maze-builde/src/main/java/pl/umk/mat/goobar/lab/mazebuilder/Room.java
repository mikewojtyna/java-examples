/**
 *
 */
package pl.umk.mat.goobar.lab.mazebuilder;

/**
 * @author goobar
 *
 */
public class Room
{
	private final AdjacentRooms adjacentRooms;

	private final RoomId id;

	public Room(RoomId id)
	{
		this.id = id;
		adjacentRooms = new AdjacentRooms();
	}

	public AdjacentRooms adjacentRooms()
	{
		return adjacentRooms;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj == null)
		{
			return false;
		}
		if (getClass() != obj.getClass())
		{
			return false;
		}
		Room other = (Room) obj;
		if (id == null)
		{
			if (other.id != null)
			{
				return false;
			}
		}
		else if (!id.equals(other.id))
		{
			return false;
		}
		return true;
	}

	/**
	 * @return the id
	 */
	public RoomId getId()
	{
		return id;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Room [id=" + id + "]";
	}

	void addEastRoom(Room room)
	{
		adjacentRooms.setEastRoom(room);
	}

	void addNorthRoom(Room room)
	{
		adjacentRooms.setNorthRoom(room);
	}

	void addSouthRoom(Room room)
	{
		adjacentRooms.setSouthRoom(room);
	}

	void addWestRoom(Room room)
	{
		adjacentRooms.setWestRoom(room);
	}
}
