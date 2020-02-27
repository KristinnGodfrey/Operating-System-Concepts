// You are free to modify this class, e.g. add fields, methods,
// constructors, extend from class Thread etc. with the two exceptions:
// 1. Do not change the name of this class nor put it into another package
// 2. Do not modify the name and input and output parameter of the main method.

public class MyAssignment11 extends Thread{ // TODO: Modify as necessary

	// TODO: fill in your code here
	private long theNumberOfIterations;

	private Counter theCounter;

	public MyAssignment11(Counter counter, long iterationsPerThread) {
		theCounter = counter;
		theNumberOfIterations = iterationsPerThread;
	}

	public void run() {
		for (long i = 0; i < theNumberOfIterations; ++i) {
			theCounter.increment();
		}
	}

	public static long main(long iterationsPerThread) { // Do not modify this line!

		// TODO: fill in your code here
		Counter counter = new Counter();

		MyAssignment11 raceDemo0 = new MyAssignment11(counter, iterationsPerThread);
		MyAssignment11 raceDemo1 = new MyAssignment11(counter, iterationsPerThread);
		raceDemo0.start();
		raceDemo1.start();
		try {
			raceDemo0.join();
			raceDemo1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return counter.getIn();
	}
}

class Counter {
	private volatile long in = 0;
    
    public void increment() {
        long next_free_slot;

        next_free_slot = in;
        next_free_slot = next_free_slot + 1;
        in = next_free_slot;
    }

    public long getIn() {
      return in;
    }

}
