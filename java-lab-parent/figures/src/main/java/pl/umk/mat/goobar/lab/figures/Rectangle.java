/**
 *
 */
package pl.umk.mat.goobar.lab.figures;

/**
 * @author goobar
 *
 */
public class Rectangle implements Figure
{
	private final double height;

	private final double width;

	public Rectangle(double width, double height)
	{
		this.width = width;
		this.height = height;
	}

	/* (non-Javadoc)
	 * @see pl.umk.mat.goobar.lab.figures.Figure#area()
	 */
	@Override
	public Area area()
	{
		return new Area(width * height);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj == null)
		{
			return false;
		}
		if (getClass() != obj.getClass())
		{
			return false;
		}
		Rectangle other = (Rectangle) obj;
		if (Double.doubleToLongBits(height) != Double
			.doubleToLongBits(other.height))
		{
			return false;
		}
		if (Double.doubleToLongBits(width) != Double
			.doubleToLongBits(other.width))
		{
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	public double height()
	{
		return height;
	}

	/* (non-Javadoc)
	 * @see pl.umk.mat.goobar.lab.figures.Figure#perimeter()
	 */
	@Override
	public Perimeter perimeter()
	{
		return new Perimeter(width * 2 + height * 2);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Rectangle [height=" + height + ", width=" + width + "]";
	}

	public double width()
	{
		return width;
	}

}
