package p333xb;

import qa.C8294g;
import qa.C8298k;

public abstract class AbstractC10176a {
    public C10179d f32897a;
    public long f32898b;
    public final String f32899c;
    public final boolean f32900d;

    public AbstractC10176a(String str, boolean z) {
        C8298k.m12933e(str, "name");
        this.f32899c = str;
        this.f32900d = z;
        this.f32898b = -1L;
    }

    public final boolean m5849a() {
        return this.f32900d;
    }

    public final String m5848b() {
        return this.f32899c;
    }

    public final long m5847c() {
        return this.f32898b;
    }

    public final C10179d m5846d() {
        return this.f32897a;
    }

    public final void m5845e(C10179d dVar) {
        C8298k.m12933e(dVar, "queue");
        C10179d dVar2 = this.f32897a;
        if (dVar2 != dVar) {
            if (dVar2 == null) {
                this.f32897a = dVar;
                return;
            }
            throw new IllegalStateException("task is in multiple queues".toString());
        }
    }

    public abstract long mo4943f();

    public final void m5844g(long j) {
        this.f32898b = j;
    }

    public String toString() {
        return this.f32899c;
    }

    public AbstractC10176a(String str, boolean z, int i, C8294g gVar) {
        this(str, (i & 2) != 0 ? true : z);
    }
}
