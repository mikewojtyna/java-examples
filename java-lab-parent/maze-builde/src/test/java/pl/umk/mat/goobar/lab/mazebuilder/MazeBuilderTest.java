/**
 *
 */
package pl.umk.mat.goobar.lab.mazebuilder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.UUID;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author goobar
 *
 */
@SuppressWarnings("javadoc")
public class MazeBuilderTest
{

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
	}

	@Test
	public void should_CreateBasicMaze_When_OnlyBeginIsCalled()
	{
		// given
		MazeBuilder mazeBuilder = mazeBuilder();
		Room firstRoom = uniqueRoom();

		// when
		Maze maze = mazeBuilder.begin(firstRoom).buildRooms()
			.buildConnections().buildMaze();

		// then
		assertEquals(1, maze.getRooms().size());
		assertEquals(firstRoom, maze.getFirstRoom());
	}

	@Test
	public void should_CreateMaze_With_FirstRoomConnectedWithSecondRoomOnNorthSide()
		throws Exception
	{
		// given
		MazeBuilder builder = mazeBuilder();
		Room firstRoom = uniqueRoom();
		Room secondRoom = uniqueRoom();

		// when
		MazeConnectionBuilder connectionBuilder = builder
			.begin(firstRoom).addRoom(secondRoom).buildRooms();
		Maze maze = connectionBuilder
			.placeNorthRoom(firstRoom.getId(), secondRoom.getId())
			.buildConnections().buildMaze();

		// then
		assertTrue(maze.getFirstRoom().adjacentRooms().getNorthRoom()
			.isPresent());
	}

	@Test
	public void should_CreateMaze_With_ThreeNotConnectedRooms()
		throws Exception
	{
		// given
		MazeBuilder builder = mazeBuilder();

		// when
		Room room0 = uniqueRoom();
		Room room1 = uniqueRoom();
		Room firstRoom = uniqueRoom();
		Maze maze = builder.begin(firstRoom).addRoom(room0)
			.addRoom(room1).buildRooms().buildConnections()
			.buildMaze();

		// then
		assertEquals(3, maze.getRooms().size());
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception
	{
	}

	/**
	 * @return
	 */
	private MazeBuilder mazeBuilder()
	{
		return new MazeBuilder();
	}

	/**
	 * @return
	 */
	private RoomId uniqueId()
	{
		return new RoomId(UUID.randomUUID().toString());
	}

	/**
	 * @return
	 */
	private Room uniqueRoom()
	{
		return new Room(uniqueId());
	}

}
