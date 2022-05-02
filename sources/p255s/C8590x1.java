package p255s;

import p266t.C8927z;

public class C8590x1 {
    public final Object f27827a = new Object();
    public final C8927z f27828b;
    public int f27829c;

    public C8590x1(C8927z zVar, int i) {
        this.f27828b = zVar;
        this.f27829c = i;
    }

    public int m12025a() {
        int i;
        synchronized (this.f27827a) {
            i = this.f27829c;
        }
        return i;
    }

    public void m12024b(int i) {
        synchronized (this.f27827a) {
            this.f27829c = i;
        }
    }
}
