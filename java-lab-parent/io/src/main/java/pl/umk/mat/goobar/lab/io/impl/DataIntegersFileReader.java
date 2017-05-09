/**
 *
 */
package pl.umk.mat.goobar.lab.io.impl;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import pl.umk.mat.goobar.lab.io.IntegersFileReader;

/**
 * @author goobar
 *
 */
public class DataIntegersFileReader implements IntegersFileReader
{

	/* (non-Javadoc)
	 * @see pl.umk.mat.goobar.lab.io.IntegersFileReader#readAllIntegers(java.nio.file.Path)
	 */
	@Override
	public List<Integer> readAllIntegers(Path pathToFile) throws IOException
	{
		try (DataInputStream dataInputStream = new DataInputStream(
			new FileInputStream(pathToFile.toFile())))
		{
			// TODO: implement
			throw new UnsupportedOperationException("Implement me");
		}
	}

}
