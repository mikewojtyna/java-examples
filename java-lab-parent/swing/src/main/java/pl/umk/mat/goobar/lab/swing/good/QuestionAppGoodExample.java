/**
 *
 */
package pl.umk.mat.goobar.lab.swing.good;

import javax.swing.SwingUtilities;

/**
 * An app bootstrapper.
 * 
 * @author goobar
 *
 */
public class QuestionAppGoodExample
{
	public static void main(String[] args)
	{
		// this simply bootstraps the application
		SwingUtilities.invokeLater(() -> {
			new QuestionAppSwingView(new AnswerButtonListener(
				new DeepThoughComplexImpl()));
		});
	}
}
