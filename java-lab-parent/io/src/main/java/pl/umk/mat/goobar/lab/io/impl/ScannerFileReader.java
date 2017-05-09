/**
 *
 */
package pl.umk.mat.goobar.lab.io.impl;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import pl.umk.mat.goobar.lab.io.FileReader;

/**
 * @author goobar
 *
 */
public class ScannerFileReader implements FileReader
{

	/* (non-Javadoc)
	 * @see pl.umk.mat.goobar.lab.io.showcase.FileReader#readAllLines(java.nio.file.Path)
	 */
	@Override
	public List<String> readAllLines(Path pathToFile) throws IOException
	{
		List<String> result = new ArrayList<>();
		try (Scanner scanner = new Scanner(pathToFile))
		{
			scanner.useDelimiter("\n");
			while (scanner.hasNext())
			{
				result.add(scanner.next());
			}
			return result;
		}
	}

}
