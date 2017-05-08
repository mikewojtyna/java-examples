/**
 *
 */
package pl.umk.mat.goobar.lab.swing.good;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Here we are testing only the view component. The application logic is
 * included in the {@link DeepThought} service, so we will test that in a
 * separate file. Also, all {@link ViewActionListener}s registered in the
 * {@link QuestionAppSwingView} are tested in isolation as well. This allows us to
 * easily modify and test our application.
 *
 * @author goobar
 *
 */
@SuppressWarnings("javadoc")
public class QuestionAppViewTest
{

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
	}

	@Test
	public void should_CallViewUpdaterListener_When_ButtonIsClicked()
		throws Exception
	{
		// given
		// we use a Mockito mock library to create a fake implementation
		// of dependent components
		// thanks to that we can do simple unit tests on the otherwise
		// hard to test swing views
		ViewActionListener viewActionListenerMock = mock(
			ViewActionListener.class);
		QuestionAppSwingView questionAppView = new QuestionAppSwingView(
			viewActionListenerMock);

		// when
		questionAppView.getAnswerButton().doClick();

		// then
		// since we structured our app so the only responsibility of the
		// QuestionAppSwingView is to create a view and delegate all the task
		// to other components, the only thing we need to test is to
		// check if registered button listener is called with right
		// parameters
		verify(viewActionListenerMock, times(1))
			.performAction(questionAppView);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception
	{
	}

}
