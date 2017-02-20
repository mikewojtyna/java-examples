/**
 *
 */
package pl.umk.mat.goobar.lab.helloworld;

import java.io.InputStream;

/**
 * @author goobar
 *
 */
public interface HelloWorldLineParser
{
	/**
	 * Reads all lines in this stream until it's closed. Each parsed line is
	 * then stored using provided {@link HelloWorldMessageStore}.
	 *
	 * @param input
	 *                input stream
	 * @param messageStore
	 *                a message store that will be used to collect all
	 *                parsed lines
	 * @throws NullPointerException
	 *                 if any argument is null
	 * @throws HelloWorldLineParserException
	 */
	void parseLines(InputStream input, HelloWorldMessageStore messageStore)
		throws NullPointerException, HelloWorldLineParserException;
}
