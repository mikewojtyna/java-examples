package pl.umk.mat.goobar.lab.io;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pl.umk.mat.goobar.lab.io.FileReader;
import pl.umk.mat.goobar.lab.io.impl.BufferedFileReader;
import pl.umk.mat.goobar.lab.io.impl.NioFileReader;
import pl.umk.mat.goobar.lab.io.impl.ScannerFileReader;
import pl.umk.mat.goobar.lab.io.impl.StreamFileReader;

/**
 * 
 */

/**
 * @author goobar
 *
 */
public class FileReaderIntegrationTest
{

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
	}

	private FileReader fileReader;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
	}

	@Test
	public void shouldReadAllLinesWhenUsingBufferedFileReader()
		throws IOException
	{
		// given
		fileReader = new BufferedFileReader();

		// then
		performTest();
	}

	@Test
	public void shouldReadAllLinesWhenUsingNioFileReader() throws Exception
	{
		// given
		fileReader = new NioFileReader();

		// then
		performTest();
	}

	@Test
	public void shouldReadAllLinesWhenUsingScannerFileReader()
		throws Exception
	{
		// given
		fileReader = new ScannerFileReader();

		// then
		performTest();
	}

	@Test
	public void shouldReadAllLinesWhenUsingStreamFileReader()
		throws Exception
	{
		// given
		fileReader = new StreamFileReader();

		// then
		performTest();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception
	{
	}

	private void performTest() throws IOException
	{
		// when
		List<String> allLines = fileReader
			.readAllLines(FileSystems.getDefault().getPath("src",
				"test", "resources", "test-file.txt"));

		// then
		assertEquals("line0", allLines.get(0));
		assertEquals("line1", allLines.get(1));
		assertEquals("line2", allLines.get(2));
		assertEquals(3, allLines.size());
	}

}
