/**
 *
 */
package pl.umk.mat.goobar.lab.objectmodelling;

/**
 * @author goobar
 *
 */
public class Rectangle extends Figure
{
	private double height;

	private double width;

	public Rectangle()
	{
		super();
	}

	public Rectangle(double height, double width)
	{
		this.height = height;
		this.width = width;
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

	/**
	 * @return the height
	 */
	double getHeight()
	{
		return height;
	}

	/**
	 * @return the width
	 */
	double getWidth()
	{
		return width;
	}

	/**
	 * @param height
	 *                the height to set
	 */
	void setHeight(double height)
	{
		this.height = height;
	}

	/**
	 * @param width
	 *                the width to set
	 */
	void setWidth(double width)
	{
		this.width = width;
	}
}
