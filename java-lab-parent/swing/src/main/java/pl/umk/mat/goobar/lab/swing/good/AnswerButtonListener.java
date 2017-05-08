/**
 *
 */
package pl.umk.mat.goobar.lab.swing.good;

/**
 * The only responsibility of this concrete listener is to update the label with
 * answer retrieved from {@link DeepThought}. It works as a "proxy", which
 * delegates the logic to the business service (DeepThought) and retrieves the
 * result.
 *
 * @author goobar
 *
 */
public class AnswerButtonListener implements ViewActionListener
{

	private final DeepThought deepThought;

	public AnswerButtonListener(DeepThought deepThought)
	{
		this.deepThought = deepThought;
	}

	/**
	 * The only responsibility of this concrete listener is to update the
	 * label with answer retrieved from {@link DeepThought}. It works as a
	 * "proxy", which delegates the logic to the business service
	 * (DeepThought) and retrieves the result. The result is then set as a
	 * new value for the answer label, retrieved from view by calling
	 * {@link QuestionAppView#getAnswerLabel()} method.
	 *
	 * @param view
	 *                the answer label of this view (retrieved by calling
	 *                {@link QuestionAppView#getAnswerLabel()}) will be
	 *                updated with the value computed by {@link DeepThought}
	 *                business service
	 */
	@Override
	public void performAction(QuestionAppView view)
	{
		view.getAnswerLabel().setText(deepThought
			.answerToTheUltimateQuestionOfLifeTheUniverseAndEverything());
	}
}
