/**
 *
 */
package pl.umk.mat.goobar.lab.io.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import pl.umk.mat.goobar.lab.io.FileReader;

/**
 * @author goobar
 *
 */
public class BufferedFileReader implements FileReader
{
	@Override
	public List<String> readAllLines(Path path) throws IOException
	{
		List<String> result = new ArrayList<>();
		try (BufferedReader bufferedReader = new BufferedReader(
			new java.io.FileReader(path.toFile())))
		{
			// TODO: implement
		}
		return result;
	}
}
