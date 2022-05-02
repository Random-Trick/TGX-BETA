package p255s;

import p266t.C8927z;

public class C8590x1 {
    public final Object f27824a = new Object();
    public final C8927z f27825b;
    public int f27826c;

    public C8590x1(C8927z zVar, int i) {
        this.f27825b = zVar;
        this.f27826c = i;
    }

    public int m12026a() {
        int i;
        synchronized (this.f27824a) {
            i = this.f27826c;
        }
        return i;
    }

    public void m12025b(int i) {
        synchronized (this.f27824a) {
            this.f27826c = i;
        }
    }
}
