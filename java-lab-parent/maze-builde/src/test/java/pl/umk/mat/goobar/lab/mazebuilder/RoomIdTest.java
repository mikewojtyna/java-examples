/**
 *
 */
package pl.umk.mat.goobar.lab.mazebuilder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import nl.jqno.equalsverifier.EqualsVerifier;

/**
 * @author goobar
 *
 */
public class RoomIdTest
{

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
	}

	@Test
	public void should_Pass_EqualsTests() throws Exception
	{
		EqualsVerifier.forClass(RoomId.class).usingGetClass().verify();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception
	{
	}

}
