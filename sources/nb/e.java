package nb;

import java.util.ArrayList;
import java.util.List;
import kb.f;

public final class e {
    public final f f17821a;
    public final List<Runnable> f17822b;
    public volatile boolean f17823c;
    public Runnable f17824d;
    public Runnable f17825e;

    public e(f fVar) {
        this.f17821a = fVar;
        ArrayList arrayList = new ArrayList();
        this.f17822b = arrayList;
        synchronized (arrayList) {
            this.f17823c = fVar.get();
        }
    }

    public void a(Runnable runnable) {
        int i10;
        boolean z10;
        int i11;
        synchronized (this.f17822b) {
            if (f()) {
                runnable.run();
                i11 = b();
                z10 = false;
            } else {
                this.f17822b.add(runnable);
                z10 = true;
                i11 = 0;
            }
        }
        if (z10) {
            Runnable runnable2 = this.f17824d;
            if (runnable2 != null) {
                runnable2.run();
            }
        } else if (this.f17825e != null) {
            for (i10 = 0; i10 < i11; i10++) {
                this.f17825e.run();
            }
        }
    }

    public final int b() {
        int size = this.f17822b.size();
        if (size == 0) {
            return 0;
        }
        ArrayList arrayList = new ArrayList(this.f17822b);
        this.f17822b.clear();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            ((Runnable) arrayList.get(i10)).run();
        }
        return size;
    }

    public e c(Runnable runnable, Runnable runnable2) {
        this.f17824d = runnable;
        this.f17825e = runnable2;
        return this;
    }

    public void d() {
        e(false);
    }

    public void e(boolean z10) {
        int i10;
        int i11;
        synchronized (this.f17822b) {
            if (!f() && !z10) {
                i11 = 0;
            }
            i11 = b();
        }
        if (this.f17825e != null) {
            for (i10 = 0; i10 < i11; i10++) {
                this.f17825e.run();
            }
        }
    }

    public final boolean f() {
        boolean z10 = this.f17821a.get();
        if (this.f17823c != z10) {
            this.f17823c = z10;
            return z10;
        } else if (!z10 || this.f17822b.isEmpty()) {
            return z10;
        } else {
            throw new IllegalStateException();
        }
    }
}
