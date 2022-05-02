package p020b5;

import java.util.Collections;
import java.util.PriorityQueue;

public final class C1193d0 {
    public final Object f4482a = new Object();
    public final PriorityQueue<Integer> f4483b = new PriorityQueue<>(10, Collections.reverseOrder());
    public int f4484c = Integer.MIN_VALUE;

    public void m38101a(int i) {
        synchronized (this.f4482a) {
            this.f4483b.add(Integer.valueOf(i));
            this.f4484c = Math.max(this.f4484c, i);
        }
    }

    public void m38100b(int i) {
        synchronized (this.f4482a) {
            this.f4483b.remove(Integer.valueOf(i));
            this.f4484c = this.f4483b.isEmpty() ? Integer.MIN_VALUE : ((Integer) C1216l0.m37971j(this.f4483b.peek())).intValue();
            this.f4482a.notifyAll();
        }
    }
}
