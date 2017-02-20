/**
 *
 */
package pl.umk.mat.goobar.lab.helloworld;

import java.util.List;

/**
 * @author goobar
 *
 */
public interface HelloWorldMessageStore
{
	/**
	 * @return all stored messages
	 */
	List<String> readAllMessages();

	/**
	 * Stores the single message.
	 *
	 * @param message
	 */
	void storeMessage(String message);
}
