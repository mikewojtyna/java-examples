/**
 *
 */
package pl.umk.mat.goobar.lab.mazebuilder;

import java.util.List;

/**
 * @author goobar
 *
 */
public class MazeRoomBuilder
{
	private final List<Room> rooms;

	private final MazeBuilder rootMazeBuilder;

	MazeRoomBuilder(List<Room> rooms, MazeBuilder rootMazeBuilder)
	{
		super();
		this.rootMazeBuilder = rootMazeBuilder;
		this.rooms = rooms;
	}

	/**
	 * Adds a new room to the maze.
	 *
	 * @return the first phase (rooms) builder
	 */
	public MazeRoomBuilder addRoom(Room room)
	{
		rooms.add(room);
		return this;
	}

	public MazeConnectionBuilder buildRooms()
	{
		return new MazeConnectionBuilder(rootMazeBuilder, rooms);
	}

}
