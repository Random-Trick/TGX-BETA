package eb;

import android.view.animation.Interpolator;
import eb.n;
import java.util.Collections;
import java.util.Iterator;

public class r<T> implements Iterable<n.c<T>> {
    public final n<T> f11490a;

    public interface a {
        void a(r rVar);
    }

    public r(a aVar) {
        this(aVar, null, 0L);
    }

    public void s(a aVar, n nVar) {
        aVar.a(this);
    }

    public void g(float f10) {
        this.f11490a.g(f10);
    }

    public boolean isEmpty() {
        return v() == null;
    }

    @Override
    public Iterator<n.c<T>> iterator() {
        return this.f11490a.iterator();
    }

    public void m(boolean z10) {
        this.f11490a.m(z10);
    }

    public n.e r() {
        return this.f11490a.t();
    }

    public void t(boolean z10) {
        this.f11490a.w(z10);
    }

    public void u(T t10, boolean z10) {
        this.f11490a.B(t10 != null ? Collections.singletonList(t10) : null, z10);
    }

    public n.c<T> v() {
        Iterator<n.c<T>> it = this.f11490a.iterator();
        n.c<T> cVar = null;
        while (it.hasNext()) {
            n.c<T> next = it.next();
            if (next.t()) {
                if (cVar == null) {
                    cVar = next;
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        return cVar;
    }

    public T w() {
        n.c<T> v10 = v();
        if (v10 != null) {
            return v10.f11479a;
        }
        return null;
    }

    public void x(boolean z10) {
        this.f11490a.D(z10);
    }

    public r(final a aVar, Interpolator interpolator, long j10) {
        this.f11490a = new n<>(new n.b() {
            @Override
            public final void a(n nVar) {
                r.this.s(aVar, nVar);
            }
        }, interpolator, j10);
    }
}
