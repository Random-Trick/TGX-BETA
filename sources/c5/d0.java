package c5;

import java.util.Collections;
import java.util.PriorityQueue;

public final class d0 {
    public final Object f4805a = new Object();
    public final PriorityQueue<Integer> f4806b = new PriorityQueue<>(10, Collections.reverseOrder());
    public int f4807c = Integer.MIN_VALUE;

    public void a(int i10) {
        synchronized (this.f4805a) {
            this.f4806b.add(Integer.valueOf(i10));
            this.f4807c = Math.max(this.f4807c, i10);
        }
    }

    public void b(int i10) {
        synchronized (this.f4805a) {
            this.f4806b.remove(Integer.valueOf(i10));
            this.f4807c = this.f4806b.isEmpty() ? Integer.MIN_VALUE : ((Integer) l0.j(this.f4806b.peek())).intValue();
            this.f4805a.notifyAll();
        }
    }
}
