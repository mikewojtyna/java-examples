/**
 *
 */
package pl.umk.mat.goobar.lab.io.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import pl.umk.mat.goobar.lab.io.FileReader;

/**
 * @author goobar
 *
 */
public class StreamFileReader implements FileReader
{

	/* (non-Javadoc)
	 * @see pl.umk.mat.goobar.lab.io.showcase.FileReader#readAllLines(java.nio.file.Path)
	 */
	@Override
	public List<String> readAllLines(Path pathToFile) throws IOException
	{
		return Files.lines(pathToFile).collect(Collectors.toList());
	}

}
