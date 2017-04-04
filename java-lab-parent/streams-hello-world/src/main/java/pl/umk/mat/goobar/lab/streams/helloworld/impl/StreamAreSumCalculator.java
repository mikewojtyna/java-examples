/**
 *
 */
package pl.umk.mat.goobar.lab.streams.helloworld.impl;

import java.util.Collection;
import pl.umk.mat.goobar.lab.figures.Area;
import pl.umk.mat.goobar.lab.figures.Figure;
import pl.umk.mat.goobar.lab.streams.helloworld.api.AreaSumCalculator;

/**
 * @author goobar
 *
 */
public class StreamAreSumCalculator implements AreaSumCalculator
{

	/* (non-Javadoc)
	 * @see pl.umk.mat.goobar.lab.streams.helloworld.api.FiguresAggregator#aggregate(java.util.Collection)
	 */
	@Override
	public Area aggregate(Collection<Figure> figures)
	{
		return figures.parallelStream().map(Figure::area)
			.reduce((sum, figureArea) -> sum.plus(figureArea))
			.orElse(new Area(0));
	}

}
