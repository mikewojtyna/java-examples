/**
 * 
 */
package pl.umk.mat.goobar.lab.io;

import static org.junit.Assert.assertEquals;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pl.umk.mat.goobar.lab.io.IntegersFileReader;
import pl.umk.mat.goobar.lab.io.impl.DataIntegersFileReader;

/**
 * @author goobar
 *
 */
public class IntegersFileReaderIntegrationTest
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

	private IntegersFileReader dataIntegersFileReader;
	private Path pathToFile;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
		pathToFile = FileSystems.getDefault().getPath("src", "test",
			"resources", "test-file.data");
		try (DataOutputStream dataOutputStream = new DataOutputStream(
			new FileOutputStream(pathToFile.toFile())))
		{
			dataOutputStream.writeInt(0);
			dataOutputStream.writeInt(1);
			dataOutputStream.writeInt(2);
			dataOutputStream.writeInt(3);
		}
	}

	@Test
	public void shouldReadAllIntegers() throws IOException
	{
		// given
		dataIntegersFileReader = new DataIntegersFileReader();

		// when
		List<Integer> integers = dataIntegersFileReader
			.readAllIntegers(pathToFile);

		// then
		assertEquals(4, integers.size());
		assertEquals(Integer.valueOf(0), integers.get(0));
		assertEquals(Integer.valueOf(1), integers.get(1));
		assertEquals(Integer.valueOf(2), integers.get(2));
		assertEquals(Integer.valueOf(3), integers.get(3));
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception
	{
	}

}
