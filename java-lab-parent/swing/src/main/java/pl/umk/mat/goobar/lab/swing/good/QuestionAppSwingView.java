/**
 *
 */
package pl.umk.mat.goobar.lab.swing.good;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author goobar
 *
 */
public class QuestionAppSwingView extends JFrame implements QuestionAppView
{
	private JButton answerButton;

	private final ViewActionListener answerButtonViewListener;

	private JLabel answerLabel;

	public QuestionAppSwingView(ViewActionListener answerButtonViewListener)
	{
		this.answerButtonViewListener = answerButtonViewListener;
		initView();
	}

	@Override
	public JButton getAnswerButton()
	{
		return answerButton;
	}

	@Override
	public JLabel getAnswerLabel()
	{
		return answerLabel;
	}

	/**
	 * This is just a view setup - there's no logic here.
	 */
	private void initView()
	{
		// create the frame
		final JFrame frame = new JFrame();
		frame.setLayout(new BoxLayout(frame.getContentPane(),
			BoxLayout.Y_AXIS));
		frame.setTitle("The Ultimate Question App");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(320, 240));

		// create the answer label
		answerLabel = new JLabel();
		answerLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		frame.add(answerLabel);

		// create the answer button
		answerButton = new JButton(
			"Get Answer To The Ultimate Question");
		answerButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		answerButton.addActionListener(event -> {
			answerButtonViewListener.performAction(this);
		});
		frame.add(answerButton);

		// show the view
		frame.pack();
		frame.setVisible(true);
	}

}
