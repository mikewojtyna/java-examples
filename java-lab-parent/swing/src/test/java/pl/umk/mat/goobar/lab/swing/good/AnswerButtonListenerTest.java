/**
 *
 */
package pl.umk.mat.goobar.lab.swing.good;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import javax.swing.JLabel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Here we test a concrete {@link ViewActionListener}, registered as handler to
 * the answer button's clicks. We do not test the main business logic of the
 * application here yet - that's the part of {@link DeepThought} service, so
 * here we just mock it.
 *
 * @author goobar
 *
 */
public class AnswerButtonListenerTest
{

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
	}

	@Test
	public void should_UpdateLabel() throws Exception
	{
		// given
		// we use a Mockito mock library to create a fake implementation
		// of dependent components
		// We don't need the real view implementation - we tested it
		// already. So, just mock it to return some fake JLabel.
		QuestionAppView view = mock(QuestionAppView.class);
		JLabel answerLabel = new JLabel("default text");
		when(view.getAnswerLabel()).thenReturn(answerLabel);
		// Again - we don't test logic of the DeepThought here.
		// Therefore - mock it.
		DeepThought deepThought = mock(DeepThought.class);
		when(deepThought
			.answerToTheUltimateQuestionOfLifeTheUniverseAndEverything())
				.thenReturn("the fake answer");
		// Yes, that's the part we really want to test. Create the real
		// implementation and call the method we want to test.
		AnswerButtonListener answerButtonListener = new AnswerButtonListener(
			deepThought);

		// when
		// call the real method
		answerButtonListener.performAction(view);

		// then
		// Simply verify whether the contract of AnswerButtonListener is
		// met. The contract states the answer label should be updated
		// with the value computed by DeepThough business service, so
		// that's all what we really need to test.
		assertEquals("the fake answer", answerLabel.getText());
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception
	{
	}

}
