package p051db;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import p051db.C3955n;

public class C3965r<T> implements Iterable<C3955n.C3958c<T>> {
    public final C3955n<T> f13331a;

    public interface AbstractC3966a {
        void mo7848a(C3965r rVar);
    }

    public C3965r(AbstractC3966a aVar) {
        this(aVar, null, 0L);
    }

    public void m29464s(AbstractC3966a aVar, C3955n nVar) {
        aVar.mo7848a(this);
    }

    public void m29467i(float f) {
        this.f13331a.m29520i(f);
    }

    public boolean isEmpty() {
        return m29461v() == null;
    }

    @Override
    public Iterator<C3955n.C3958c<T>> iterator() {
        return this.f13331a.iterator();
    }

    public void m29466m(boolean z) {
        this.f13331a.m29519m(z);
    }

    public C3955n.C3960e m29465r() {
        return this.f13331a.m29516t();
    }

    public void m29463t(boolean z) {
        this.f13331a.m29513w(z);
    }

    public void m29462u(T t, boolean z) {
        this.f13331a.m29524B(t != null ? Collections.singletonList(t) : null, z);
    }

    public C3955n.C3958c<T> m29461v() {
        Iterator<C3955n.C3958c<T>> it = this.f13331a.iterator();
        C3955n.C3958c<T> cVar = null;
        while (it.hasNext()) {
            C3955n.C3958c<T> next = it.next();
            if (next.m29490t()) {
                if (cVar == null) {
                    cVar = next;
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        return cVar;
    }

    public T m29460w() {
        C3955n.C3958c<T> v = m29461v();
        if (v != null) {
            return v.f13320a;
        }
        return null;
    }

    public void m29459x(boolean z) {
        this.f13331a.m29522D(z);
    }

    public C3965r(final AbstractC3966a aVar, Interpolator interpolator, long j) {
        this.f13331a = new C3955n<>(new C3955n.AbstractC3957b() {
            @Override
            public final void mo26892a(C3955n nVar) {
                C3965r.this.m29464s(aVar, nVar);
            }
        }, interpolator, j);
    }
}
