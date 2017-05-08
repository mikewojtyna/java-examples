/**
 *
 */
package pl.umk.mat.goobar.lab.swing.bad;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 * An untestable example of simple swing application.
 *
 * @author goobar
 *
 */
// TODO: How to test it? Everything is just a big pile of code. We need to
// refactor it. See QuestionAppGoodExample class and related tests.
public class QuestionAppBadExample
{
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(() -> {
			final JFrame frame = new JFrame();
			frame.setLayout(new BoxLayout(frame.getContentPane(),
				BoxLayout.Y_AXIS));
			frame.setTitle("The Ultimate Question App");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			JLabel answerLabel = new JLabel();
			answerLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
			frame.add(answerLabel);

			JButton button = new JButton(
				"Get Answer To The Ultimate Question");
			button.setAlignmentX(Component.CENTER_ALIGNMENT);
			button.addActionListener(new ActionListener()
			{

				@Override
				public void actionPerformed(ActionEvent e)
				{
					answerLabel.setText("42");
				}
			});
			frame.add(button);
			frame.setPreferredSize(new Dimension(320, 240));
			frame.pack();
			frame.setVisible(true);
		});
	}
}
