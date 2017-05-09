/**
 * 
 */
package pl.umk.mat.goobar.lab.io;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

/**
 * @author goobar
 *
 */
public interface FileReader
{
	List<String> readAllLines(Path pathToFile) throws IOException;
}
