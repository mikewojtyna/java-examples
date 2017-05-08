/**
 *
 */
package pl.umk.mat.goobar.lab.threads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * An examples showing how two threads can communicate using simple Observer
 * pattern.
 *
 * @author goobar
 *
 */
@SuppressWarnings("javadoc")
public class ObserverPatternExampleTest
{

	@Test
	public void runObserverPatternExample() throws Exception
	{
		// create observable object that will notify listeners when
		// result is available
		Observable observable = new Observable();
		// register 3 listeners
		observable.registerListeners(new PrinterResultListener(),
			new LoggerResultListener(),
			obj -> System.out.println(obj), System.out::println);
		// start the thread that will run the observable code
		Thread thread = new Thread(observable);
		thread.start();
		// Wait for the thread to see all notification in the console.
		// There's no order of received notifications - listeners can be
		// fired in any order.
		thread.join();
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

	private static class LoggerResultListener implements ResultListener
	{

		/* (non-Javadoc)
		 * @see goobar.lab.jform.threads.App.ResultListener#onResultReceived(java.lang.Object)
		 */
		@Override
		public void onResultReceived(Object result)
		{
			Logger.getGlobal().log(Level.INFO, result.toString());
		}

	}

	private static class Observable implements Runnable
	{
		private final Collection<ResultListener> listeners;

		public Observable()
		{
			listeners = new ArrayList<>();
		}

		public void registerListeners(ResultListener... listeners)
		{
			Stream.of(listeners).forEach(
				listener -> this.listeners.add(listener));
		}

		public void registerResultListener(
			ResultListener resultListener)
		{
			listeners.add(resultListener);
		}

		/* (non-Javadoc)
		 * @see java.lang.Runnable#run()
		 */
		@Override
		public void run()
		{
			String complexString = randomizeVeryComplexString();
			listeners.forEach(listener -> listener
				.onResultReceived(complexString));
		}

		/**
		 *
		 */
		private String randomizeVeryComplexString()
		{
			try
			{
				Thread.sleep(5000);
				return UUID.randomUUID().toString();
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}

	}

	private static class PrinterResultListener implements ResultListener
	{

		/* (non-Javadoc)
		 * @see goobar.lab.jform.threads.App.ResultListener#onResultReceived(java.lang.Object)
		 */
		@Override
		public void onResultReceived(Object result)
		{
			{
				System.out
					.println("Listener received a result: "
						+ result);
			}
		}

	}

	private static interface ResultListener
	{

		void onResultReceived(Object result);
	}

}
