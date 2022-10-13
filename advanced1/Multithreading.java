package com.complete.advanced1;

public class Multithreading {
    public static void main(String[] args) {

        /*

        MULTITHREADING :
            - Multiprocessing and multithreading are used to achieve multitasking in a process
            - Multitasking inside a process is achieved using threads.
              ( It is heavy to run different processes at the same time hence we use threads.
                e.g. If you have one waiter in a cafe, for multitasking,
                     you will hire new waiters and not open a new cafe with one waiter in each
                Cafe corresponds to a process
                A waiter corresponds to a thread
                Using threads leads to the light weight independent execution.
              )

        WHY TO USE THREADS :
            - Threads use shared memory area.
            - Threads -> faster content switching
            - Thread is light-weight whereas a process is heavyweight

            -Asynchronous programming is about the asynchronous sequence of Tasks,
             while multithreading is about multiple threads running in parallel.

            - e.g.
                A text editor has multiple features as following :
                1) Printing typed text on screen
                2) Checking for text corrections
                3) Auto save typed content

        FLOW OF A THREAD :
            Without threading :
                main() ---> function1() ---> function2() ---> END
            With threading :
                main() -----------┑
                 function1() -----|---> END
                  function2() ----┙

        CREATING A THREAD :
			java.lang.Thread
            1) Extending Thread class ---> override run()
            2) Implementing a Runnable interface ---> implement run()

        CONCURRENCY vs PARALLELISM
            Concurrency is the task of running and managing multiple computations at same time. (2 different guys doing 2 different tasks)
            Parallelism is the task of running multiple tasks simultaneously. (same guy doing 2 tasks)

		MULTITHREADING allows you to achieve concurrency and not parallelism.

		LIFE CYCLE OF A THREAD

		    New
		     ↓
		    Runnable ←---------┑
		     ↓              Non Runnable (Blocked)
            Running  __________↑
             ↓
            Terminated

            New : Instance of thread created which is not yet started by invoking start().
            Runnable : After invocation of start() & before it is selected to be run by the scheduler.
            Running : After thread scheduler has selected it.
            Non Runnable : Thread alive, not eligible to run.
            Terminated : run() method has exited.


        */

    }
}
