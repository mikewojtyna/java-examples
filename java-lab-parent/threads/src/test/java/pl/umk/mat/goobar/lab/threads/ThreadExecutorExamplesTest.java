/**
 *
 */
package pl.umk.mat.goobar.lab.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author goobar
 *
 */
public class ThreadExecutorExamplesTest
{

	private static void longRunningTask()
	{
		System.out.println(String.format("Time to sleep from thread %s",
			Thread.currentThread().getId()));
		try
		{
			Thread.sleep(5000);
		}
		catch (InterruptedException e)
		{
			throw new RuntimeException(e);
		}
	}

	private static void sayHello()
	{
		System.out.println(String.format("Hello from thread %s!",
			Thread.currentThread().getId()));
	}

	@Test
	public void createThreads_Using_FixedThreadPool() throws Exception
	{
		// create fixed pool of 4 threads
		ExecutorService service = Executors.newFixedThreadPool(4);

		// these functions should be executed in new thread each
		service.execute(ThreadExecutorExamplesTest::sayHello);
		service.execute(ThreadExecutorExamplesTest::sayHello);
		service.execute(ThreadExecutorExamplesTest::sayHello);
		service.execute(ThreadExecutorExamplesTest::sayHello);

		// however, this one will be executed again in the same thread
		// as first task, because we are using pooling and re-using
		// existing threads which already finished their job (sayHello
		// function is very quick)
		service.execute(ThreadExecutorExamplesTest::sayHello);
	}

	@Test
	public void createThreads_Using_FixedThreadPool_When_AllThreadsAreBusy()
		throws Exception
	{
		// create fixed pool of 4 threads
		ExecutorService service = Executors.newFixedThreadPool(4);

		// these functions shall block all threads...
		service.execute(ThreadExecutorExamplesTest::longRunningTask);
		service.execute(ThreadExecutorExamplesTest::longRunningTask);
		service.execute(ThreadExecutorExamplesTest::longRunningTask);
		service.execute(ThreadExecutorExamplesTest::longRunningTask);

		// ... so, the next task should wait, because all threads are
		// busy
		// this task will wait approximately 5 seconds before saying
		// hello
		// TODO: read about Future
		Future<?> future = service
			.submit(ThreadExecutorExamplesTest::sayHello);

		// we use the future to wait for last thread (otherwise we would
		// not see the result in the console), as the main thread would
		// end immediately and kill any child threads
		future.get();
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
}
