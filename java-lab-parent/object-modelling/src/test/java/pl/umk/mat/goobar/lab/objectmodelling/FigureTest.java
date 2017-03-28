/**
 *
 */
package pl.umk.mat.goobar.lab.objectmodelling;

import static org.junit.Assert.assertNotNull;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author goobar
 *
 */
public class FigureTest
{

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
	}

	@Test
	public void should_FigureCalculateItsArea()
	{
		// given
		Figure figure = new Figure();

		// when
		Area area = figure.calculateArea();

		// then
		assertNotNull(area);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception
	{
	}

}
