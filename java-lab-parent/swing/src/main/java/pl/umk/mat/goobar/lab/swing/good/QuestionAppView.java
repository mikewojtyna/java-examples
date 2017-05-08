/**
 *
 */
package pl.umk.mat.goobar.lab.swing.good;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 * @author goobar
 *
 */
public interface QuestionAppView
{
	/**
	 * <strong>Used by tests only - do not use directly</strong> <br/>
	 * This method is required by view tests. Generally, it's not a good
	 * idea to expose internal part of classes just to perform tests.
	 * However, this situation is a bit different. First of all - we need
	 * some way to perform tests on UI views. This is possible using other
	 * methods (e.g. Robot, tree view traversal etc), but all of these
	 * methods are quite complex. Because of this, I decided to simply
	 * expose parts of the view we want to test. The application is
	 * extremely small, so it's feasible. Keep in mind though, that this is
	 * not a good solution when view has many elements. In such situation
	 * mentioned tree view traversal is probably the way to go.
	 *
	 * @return the answerButton
	 */
	JButton getAnswerButton();

	/**
	 * <strong>Used by tests only - do not use directly</strong> <br/>
	 * This method is required by view tests. Generally, it's not a good
	 * idea to expose internal part of classes just to perform tests.
	 * However, this situation is a bit different. First of all - we need
	 * some way to perform tests on UI views. This is possible using other
	 * methods (e.g. Robot, tree view traversal etc), but all of these
	 * methods are quite complex. Because of this, I decided to simply
	 * expose parts of the view we want to test. The application is
	 * extremely small, so it's feasible. Keep in mind though, that this is
	 * not a good solution when view has many elements. In such situation
	 * mentioned tree view traversal is probably the way to go.
	 *
	 * @return the answerButton
	 */
	JLabel getAnswerLabel();
}
