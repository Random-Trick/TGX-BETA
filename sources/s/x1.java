package s;

import t.z;

public class x1 {
    public final Object f22340a = new Object();
    public final z f22341b;
    public int f22342c;

    public x1(z zVar, int i10) {
        this.f22341b = zVar;
        this.f22342c = i10;
    }

    public int a() {
        int i10;
        synchronized (this.f22340a) {
            i10 = this.f22342c;
        }
        return i10;
    }

    public void b(int i10) {
        synchronized (this.f22340a) {
            this.f22342c = i10;
        }
    }
}
