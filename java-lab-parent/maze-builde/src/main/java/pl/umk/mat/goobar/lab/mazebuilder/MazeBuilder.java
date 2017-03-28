/**
 *
 */
package pl.umk.mat.goobar.lab.mazebuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author goobar
 *
 */
public class MazeBuilder
{

	private List<Room> rooms;

	/**
	 * Creates a basic maze with single room only as a starting point.
	 *
	 * @return
	 */
	public MazeRoomBuilder begin(Room firstRoom)
	{
		rooms = new ArrayList<>();
		rooms.add(firstRoom);
		return new MazeRoomBuilder(rooms, this);
	}

	public Maze buildMaze()
	{
		return new Maze(rooms);
	}
}
