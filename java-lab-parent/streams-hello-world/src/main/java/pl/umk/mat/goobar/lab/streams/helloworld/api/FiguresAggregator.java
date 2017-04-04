/**
 *
 */
package pl.umk.mat.goobar.lab.streams.helloworld.api;

import java.util.Collection;
import pl.umk.mat.goobar.lab.figures.Figure;

/**
 * A generic interface to aggregate any kind of {@link Figure} properties.
 * 
 * @author goobar
 * @param <T>
 *                a property type to aggregate
 *
 */
public interface FiguresAggregator<T>
{
	/**
	 * Aggregates the generic property.
	 *
	 * @param figures
	 *                a collection of figures to perform aggregation upon
	 * @return the aggregated property
	 */
	T aggregate(Collection<Figure> figures);
}
