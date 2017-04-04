/**
 *
 */
package pl.umk.mat.goobar.lab.figures;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author goobar
 *
 */
public class RectangleTest
{

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
	}

	@Test
	public void should_CalcularePerimeter() throws Exception
	{
		// given
		Rectangle rectangle = new Rectangle(5, 10);
		Perimeter expectedPerimeter = new Perimeter(30);

		// when
		Perimeter perimeter = rectangle.perimeter();

		// then
		assertEquals(expectedPerimeter, perimeter);
	}

	@Test
	public void should_CalculateArea() throws Exception
	{
		// given
		Rectangle rectangle = new Rectangle(5, 10);
		Area expectedArea = new Area(50);

		// when
		Area area = rectangle.area();

		// then
		assertEquals(expectedArea, area);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception
	{
	}

}
