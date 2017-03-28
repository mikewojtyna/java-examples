/**
 *
 */
package pl.umk.mat.goobar.lab.mazebuilder;

import java.util.List;

/**
 * @author goobar
 *
 */
public class MazeConnectionBuilder
{
	private final List<Room> rooms;

	private final MazeBuilder rootMazeBuilder;

	public MazeConnectionBuilder(MazeBuilder rootMazeBuilder,
		List<Room> rooms)
	{
		this.rootMazeBuilder = rootMazeBuilder;
		this.rooms = rooms;
	}

	public MazeBuilder buildConnections()
	{
		return rootMazeBuilder;
	}

	public MazeConnectionBuilder placeEastRoom(RoomId startRoomId,
		RoomId eastRoomId)
	{
		// TODO: implement
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * Connects the start room with new room on north side of start room.
	 *
	 * @param startRoomId
	 *                start room id
	 * @param northRoomId
	 *                north room id
	 * @return the connection builder
	 */
	// TODO: think about exceptions
	// TODO: should we really use so many "place[Side]Room" methods?
	public MazeConnectionBuilder placeNorthRoom(RoomId startRoomId,
		RoomId northRoomId)
	{
		findRoom(startRoomId).addNorthRoom(findRoom(northRoomId));

		return this;
	}

	// TODO: add javadoc
	// TODO: think about exceptions
	// TODO: should we really use so many "place[Side]Room" methods?
	public MazeConnectionBuilder placeSouthRoom(RoomId startRoomId,
		RoomId southRoomId)
	{
		// TODO: implement
		throw new UnsupportedOperationException("Not implemented");
	}

	// TODO: add javadoc
	// TODO: think about exceptions
	// TODO: should we really use so many "place[Side]Room" methods?
	public MazeConnectionBuilder placeWestRoom(RoomId startRoomId,
		RoomId westRoomId)
	{
		// TODO: implement
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * @param firstRoomId
	 * @return
	 */
	private Room findRoom(RoomId firstRoomId)
	{
		// TODO: Handle exceptions. Should this method declare any
		// exceptions? Use runtime or checked exceptions?
		return rooms.stream().filter(r -> r.getId().equals(firstRoomId))
			.findFirst()
			// is it ok to call "get" now?
			.get();
	}
}
