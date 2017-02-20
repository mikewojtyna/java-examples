/**
 *
 */
package pl.umk.mat.goobar.lab.helloworld.impl;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.umk.mat.goobar.lab.helloworld.HelloWorldMessageStore;

/**
 * @author goobar
 *
 */
public class InMemoryHelloWorldMessageStore implements HelloWorldMessageStore
{
	private static final Logger LOGGER = LoggerFactory
		.getLogger(InMemoryHelloWorldMessageStore.class);

	private final List<String> messages;

	/**
	 *
	 */
	public InMemoryHelloWorldMessageStore()
	{
		messages = new ArrayList<>();
	}

	@Override
	public List<String> readAllMessages()
	{
		return messages;
	}

	@Override
	public void storeMessage(String message)
	{
		LOGGER.info("Message received: {}", message);
		messages.add(message);
	}

}
