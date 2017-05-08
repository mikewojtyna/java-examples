/**
 *
 */
package pl.umk.mat.goobar.lab.swing.good;

/**
 * A view strategy interface, used to perform actions initiated by views (e.g.
 * button clicks).
 *
 * @author goobar
 *
 */
public interface ViewActionListener
{
	/**
	 * Performs the action initiated by the view.
	 *
	 * @param view
	 */
	void performAction(QuestionAppView view);
}
