/**
 *
 */
package pl.umk.mat.goobar.lab.mazebuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author goobar
 *
 */
public class OptionalFunTest
{
	private Optional<Maze> maze;

	@Test
	public void optionalFun()
	{
		List<String> strings = Arrays.asList("one", "two", "three");

		for (String string : strings)
		{
			System.out.println(string);
		}

		strings.forEach(System.out::println);

		List<Integer> lengths = new ArrayList<>();
		for (String string : strings)
		{
			if (string.length() != 3)
			{
				lengths.add(string.length());
			}
		}
		lengths.forEach(System.out::println);

		strings.stream().filter(s -> s.length() != 3)
			.map(String::length).forEach(System.out::println);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
		maze = Optional.empty();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception
	{
	}

}
