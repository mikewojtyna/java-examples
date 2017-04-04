/**
 *
 */
package pl.umk.mat.goobar.lab.figures;

/**
 * @author goobar
 *
 */
public class Perimeter
{
	private final double value;

	public Perimeter(double value)
	{
		this.value = value;
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
		Perimeter other = (Perimeter) obj;
		if (Double.doubleToLongBits(value) != Double
			.doubleToLongBits(other.value))
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
		temp = Double.doubleToLongBits(value);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Perimeter [value=" + value + "]";
	}
}
