/**
 *
 */
package pl.umk.mat.goobar.lab.helloworld;

import static org.assertj.core.api.Assertions.assertThat;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.StringReader;
import org.apache.commons.io.input.ReaderInputStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pl.umk.mat.goobar.lab.helloworld.impl.InMemoryHelloWorldMessageStore;
import pl.umk.mat.goobar.lab.helloworld.impl.ScannerHelloWorldLineParser;

/**
 * @author goobar
 *
 */
@SuppressWarnings("javadoc")
public class HelloWorldLineParserTest
{
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
	}

	@Test
	public void should_ParseAllLines() throws Exception
	{
		// given
		HelloWorldLineParser helloWorldLineParser = new ScannerHelloWorldLineParser();
		InputStream input = new ReaderInputStream(new BufferedReader(
			new StringReader("line0\nline1\nline2")));
		HelloWorldMessageStore messageStore = new InMemoryHelloWorldMessageStore();

		// when
		helloWorldLineParser.parseLines(input, messageStore);

		// then
		assertThat(messageStore.readAllMessages())
			.containsExactly("line0", "line1", "line2");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception
	{
	}

}
