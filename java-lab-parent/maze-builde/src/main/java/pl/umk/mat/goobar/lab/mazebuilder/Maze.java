/**
 *
 */
package pl.umk.mat.goobar.lab.mazebuilder;

import java.util.Collection;
import java.util.List;

/**
 * @author goobar
 *
 */
public class Maze
{
	private final List<Room> rooms;

	Maze(List<Room> rooms)
	{
		this.rooms = rooms;
	}

	public Room getFirstRoom()
	{
		return rooms.get(0);
	}

	/**
	 * @return
	 */
	public Collection<Room> getRooms()
	{
		return rooms;
	}
}
