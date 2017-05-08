/**
 *
 */
package pl.umk.mat.goobar.lab.swing.good;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Here we finally test the real application logic. The service is extremely
 * simple though - the only responsibility of this concrete
 * {@link DeepThoughtComplexImplTest} implementation is to Answer the Ultimate
 * Question. That is - return the "42" string. Oh well.
 *
 * @author goobar
 *
 */
public class DeepThoughtComplexImplTest
{

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
	}

	@Test
	public void should_AnswerTheUltimateQuestion() throws Exception
	{
		// given
		DeepThoughComplexImpl deepThought = new DeepThoughComplexImpl();

		// when
		String answer = deepThought
			.answerToTheUltimateQuestionOfLifeTheUniverseAndEverything();

		// then
		assertEquals("42", answer);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception
	{
	}

}
