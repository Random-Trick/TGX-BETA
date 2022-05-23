package yb;

import ra.g;
import ra.k;

public abstract class a {
    public d f26678a;
    public long f26679b;
    public final String f26680c;
    public final boolean f26681d;

    public a(String str, boolean z10) {
        k.e(str, "name");
        this.f26680c = str;
        this.f26681d = z10;
        this.f26679b = -1L;
    }

    public final boolean a() {
        return this.f26681d;
    }

    public final String b() {
        return this.f26680c;
    }

    public final long c() {
        return this.f26679b;
    }

    public final d d() {
        return this.f26678a;
    }

    public final void e(d dVar) {
        k.e(dVar, "queue");
        d dVar2 = this.f26678a;
        if (dVar2 != dVar) {
            if (dVar2 == null) {
                this.f26678a = dVar;
                return;
            }
            throw new IllegalStateException("task is in multiple queues".toString());
        }
    }

    public abstract long f();

    public final void g(long j10) {
        this.f26679b = j10;
    }

    public String toString() {
        return this.f26680c;
    }

    public a(String str, boolean z10, int i10, g gVar) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }
}
