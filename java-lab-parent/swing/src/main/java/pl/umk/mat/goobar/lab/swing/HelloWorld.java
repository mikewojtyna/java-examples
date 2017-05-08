/**
 *
 */
package pl.umk.mat.goobar.lab.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 * @author goobar
 *
 */
public class HelloWorld
{
	public static void main(String[] args)
	{
		createFrame();
	}

	/**
	 *
	 */
	private static void createFrame()
	{
		// Every swing app needs to be run in Event Dispatch Thread.
		// It's possible to invoke code in EDT by calling invokeLater()
		SwingUtilities.invokeLater(new Runnable()
		{

			@Override
			public void run()
			{
				// create the main frame
				final JFrame frame = new JFrame();
				// use the simple FlowLayout
				// TODO: read about layouts here
				// https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html
				frame.setLayout(new FlowLayout());
				// frame/window title
				frame.setTitle("First Swing App");
				// Close when X is clicked
				frame.setDefaultCloseOperation(
					JFrame.EXIT_ON_CLOSE);

				// Create a text field...
				final JTextField textField = new JTextField(
					"Hello World!");
				// ... And add it to the frame
				frame.add(textField);

				// Create a button...
				JButton button = new JButton("AAA");
				// Register an ActionListener in it, so it's
				// called when button is clicked
				button.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(
						ActionEvent e)
					{
						// perform the action
						// change text field content
						textField.setText(
							"You clicked!");
						// update background color
						frame.getContentPane()
							.setBackground(
								new Color(255,
									0, 0));
					}
				});
				// ... Add the button to frame
				frame.add(button);
				// set frame's size
				frame.setPreferredSize(new Dimension(320, 240));
				// these 2 methods need to be called for every
				// frame
				// pack() places all component inside frame
				// according to used layout manager.
				frame.pack();
				// shows the frame
				frame.setVisible(true);
			}
		});
	}
}
