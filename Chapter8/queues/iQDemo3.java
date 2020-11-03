package queues;

import qpack.CircularDynQueue;
import qpack.DynQueue;
import qpack.ICharQ;

public class iQDemo3 {
        public static void main(String args[]) {
            CircularDynQueue q1 = new CircularDynQueue(5);

            ICharQ q;
            int i;

            q = q1;
            // Store into Circular Queue
            for(i = 0; i < 10; i++) {
                q.put((char) ('A' + i));
            }

            DynQueue q2 = DynQueue.copy(q, 10);

            System.out.print("Contents of Dynamic Queue: ");
            for(i = 0; i < 10; i++) {
                System.out.print(q2.get());
            }
        }
}
