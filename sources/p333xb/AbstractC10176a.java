package p333xb;

import qa.C8294g;
import qa.C8298k;

public abstract class AbstractC10176a {
    public C10179d f32894a;
    public long f32895b;
    public final String f32896c;
    public final boolean f32897d;

    public AbstractC10176a(String str, boolean z) {
        C8298k.m12934e(str, "name");
        this.f32896c = str;
        this.f32897d = z;
        this.f32895b = -1L;
    }

    public final boolean m5849a() {
        return this.f32897d;
    }

    public final String m5848b() {
        return this.f32896c;
    }

    public final long m5847c() {
        return this.f32895b;
    }

    public final C10179d m5846d() {
        return this.f32894a;
    }

    public final void m5845e(C10179d dVar) {
        C8298k.m12934e(dVar, "queue");
        C10179d dVar2 = this.f32894a;
        if (dVar2 != dVar) {
            if (dVar2 == null) {
                this.f32894a = dVar;
                return;
            }
            throw new IllegalStateException("task is in multiple queues".toString());
        }
    }

    public abstract long mo4943f();

    public final void m5844g(long j) {
        this.f32895b = j;
    }

    public String toString() {
        return this.f32896c;
    }

    public AbstractC10176a(String str, boolean z, int i, C8294g gVar) {
        this(str, (i & 2) != 0 ? true : z);
    }
}
