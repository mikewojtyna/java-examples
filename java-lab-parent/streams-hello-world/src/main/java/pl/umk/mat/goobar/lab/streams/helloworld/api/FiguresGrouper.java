/**
 *
 */
package pl.umk.mat.goobar.lab.streams.helloworld.api;

import java.util.Collection;
import pl.umk.mat.goobar.lab.figures.Ellipse;
import pl.umk.mat.goobar.lab.figures.Figure;
import pl.umk.mat.goobar.lab.figures.Rectangle;

/**
 * @author goobar
 *
 */
// TODO: create collection and stream implementation
public interface FiguresGrouper
{
	/**
	 * Selects only {@link Ellipse}s from figures collection.
	 *
	 * @param figures
	 *                a group of any figures
	 * @return a collection containing ellipses only, empty when there are
	 *         no rectangles in the initial figures collection
	 */
	Collection<Ellipse> groupEllipses(Collection<Figure> figures);

	/**
	 * Selects only {@link Rectangle}s from figures collection.
	 *
	 * @param figures
	 *                a group of any figures
	 * @return a collection containing rectangles only, empty when there are
	 *         no rectangles in the initial figures collection
	 */
	Collection<Rectangle> groupRectangles(Collection<Figure> figures);
}
