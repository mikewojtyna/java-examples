/**
 *
 */
package pl.umk.mat.goobar.lab.threads;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Contains simple examples how to create new threads.
 *
 * @author goobar
 *
 */
@SuppressWarnings("javadoc")
public class ThreadRunExamplesTest
{

	/**
	 *
	 */
	private static void sayHello()
	{
		System.out.println(String.format("Hello from thread %s!",
			Thread.currentThread().getId()));
	}

	@Test
	public void runThreadExample_Using_Inheritance() throws Exception
	{
		new MyThread().start();
	}

	@Test
	public void runThreadExample_Using_Lambda() throws Exception
	{
		// the same as in Runnable scenario but using lambda expression
		new Thread(ThreadRunExamplesTest::sayHello).start();
	}

	@Test
	public void runThreadExample_Using_Runnable()
	{
		new Thread(new Runnable()
		{

			@Override
			public void run()
			{
				sayHello();
			}
		}).start();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception
	{
	}

	private static class MyThread extends Thread
	{

		/* (non-Javadoc)
		 * @see java.lang.Thread#run()
		 */
		@Override
		public void run()
		{
			// According to official docs, classes should not
			// override start() directly. Use run() method instead.
			sayHello();
		}

	}

}
