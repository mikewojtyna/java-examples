/**
 *
 */
package pl.umk.mat.goobar.lab.helloworld.impl;

import java.io.InputStream;
import java.util.Scanner;
import pl.umk.mat.goobar.lab.helloworld.HelloWorldLineParser;
import pl.umk.mat.goobar.lab.helloworld.HelloWorldMessageStore;

/**
 * @author goobar
 *
 */
public class ScannerHelloWorldLineParser implements HelloWorldLineParser
{
	@Override
	public void parseLines(InputStream input,
		HelloWorldMessageStore messageStore)
	{
		try (Scanner scanner = new Scanner(input))
		{
			while (scanner.hasNext())
			{
				String line = scanner.nextLine();
				messageStore.storeMessage(line);
			}
		}
	}
}
