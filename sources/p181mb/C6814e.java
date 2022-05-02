package p181mb;

import java.util.ArrayList;
import java.util.List;
import p139jb.AbstractC5914f;

public final class C6814e {
    public final AbstractC5914f f21344a;
    public final List<Runnable> f21345b;
    public volatile boolean f21346c;
    public Runnable f21347d;
    public Runnable f21348e;

    public C6814e(AbstractC5914f fVar) {
        this.f21344a = fVar;
        ArrayList arrayList = new ArrayList();
        this.f21345b = arrayList;
        synchronized (arrayList) {
            this.f21346c = fVar.get();
        }
    }

    public void m18907a(Runnable runnable) {
        int i;
        boolean z;
        int i2;
        synchronized (this.f21345b) {
            if (m18902f()) {
                runnable.run();
                i2 = m18906b();
                z = false;
            } else {
                this.f21345b.add(runnable);
                z = true;
                i2 = 0;
            }
        }
        if (z) {
            Runnable runnable2 = this.f21347d;
            if (runnable2 != null) {
                runnable2.run();
            }
        } else if (this.f21348e != null) {
            for (i = 0; i < i2; i++) {
                this.f21348e.run();
            }
        }
    }

    public final int m18906b() {
        int size = this.f21345b.size();
        if (size == 0) {
            return 0;
        }
        ArrayList arrayList = new ArrayList(this.f21345b);
        this.f21345b.clear();
        for (int i = size - 1; i >= 0; i--) {
            ((Runnable) arrayList.get(i)).run();
        }
        return size;
    }

    public C6814e m18905c(Runnable runnable, Runnable runnable2) {
        this.f21347d = runnable;
        this.f21348e = runnable2;
        return this;
    }

    public void m18904d() {
        m18903e(false);
    }

    public void m18903e(boolean z) {
        int i;
        int i2;
        synchronized (this.f21345b) {
            if (!m18902f() && !z) {
                i2 = 0;
            }
            i2 = m18906b();
        }
        if (this.f21348e != null) {
            for (i = 0; i < i2; i++) {
                this.f21348e.run();
            }
        }
    }

    public final boolean m18902f() {
        boolean z = this.f21344a.get();
        if (this.f21346c != z) {
            this.f21346c = z;
            return z;
        } else if (!z || this.f21345b.isEmpty()) {
            return z;
        } else {
            throw new IllegalStateException();
        }
    }
}
