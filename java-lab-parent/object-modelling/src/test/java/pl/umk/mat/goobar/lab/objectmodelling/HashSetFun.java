/**
 *
 */
package pl.umk.mat.goobar.lab.objectmodelling;

import static org.junit.Assert.assertTrue;
import java.util.HashSet;
import java.util.Set;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author goobar
 *
 */
public class HashSetFun
{

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception
	{
	}

	@Test
	public void test_HashSet()
	{
		Set<Rectangle> rectangles = new HashSet<>();
		Rectangle rectangle_5_10 = new Rectangle(5, 10);
		rectangles.add(rectangle_5_10);
		rectangles.add(new Rectangle(10, 15));

		// when
		// rectangle_5_10.setWidth(100);
		rectangle_5_10.setHeight(50);
		boolean containsRectangle = rectangles.contains(rectangle_5_10);

		// then
		assertTrue(containsRectangle);
	}

}
