/**
 *
 */
package pl.umk.mat.goobar.lab.io.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import pl.umk.mat.goobar.lab.io.FileReader;

/**
 * @author goobar
 *
 */
public class NioFileReader implements FileReader
{

	/* (non-Javadoc)
	 * @see pl.umk.mat.goobar.lab.io.showcase.FileReader#readAllLines(java.nio.file.Path)
	 */
	@Override
	public List<String> readAllLines(Path pathToFile) throws IOException
	{
		return Files.readAllLines(pathToFile);
	}

}
