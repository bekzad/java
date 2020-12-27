package test11.queueWithExceptions;

public class MyThread implements Runnable {
    FixedQueue q;
    Thread thrd;
    MyThread(String name, FixedQueue q) {
        thrd = new Thread(this, name);
        this.q = q;
    }

    public static MyThread createAndStart(String name, FixedQueue q) {
        MyThread newThread = new MyThread(name, q);
        newThread.thrd.start();
        return newThread;
    }

    public void run() {
        System.out.println(thrd.getName() + " is starting");
        if (thrd.getName().equals("Child #1")) {
            System.out.printf("I'm here");
            // Store into Fixed Queue
            try {
                for (int i = 0; i < 12; i++) {
                    System.out.println("Putting " + (char)('A' + i) + " into queue");
                    q.put((char) ('A' + i), true);
                }
                q.put('0', false);
            } catch (QueueFullException e) {
                System.out.println(e);
            }
        } else {
            // Get from fixed queue
            System.out.print("Contents of Fixed Queue: ");
            try {
                for (int i = 0; i < 12; i++) {
                    System.out.println(q.get(true));
                    q.state = "got";
                    q.notify();

                    try {
                        while (!q.state.equals("put")) {
                            wait();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                q.get(false);
            } catch (QueueEmptyException e) {
                System.out.println(e);
            }
            System.out.println();
        }

        System.out.println(thrd.getName() + " terminating");
    }
}
