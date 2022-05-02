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

    public void m29466s(AbstractC3966a aVar, C3955n nVar) {
        aVar.mo7848a(this);
    }

    public void m29469i(float f) {
        this.f13331a.m29522i(f);
    }

    public boolean isEmpty() {
        return m29463v() == null;
    }

    @Override
    public Iterator<C3955n.C3958c<T>> iterator() {
        return this.f13331a.iterator();
    }

    public void m29468m(boolean z) {
        this.f13331a.m29521m(z);
    }

    public C3955n.C3960e m29467r() {
        return this.f13331a.m29518t();
    }

    public void m29465t(boolean z) {
        this.f13331a.m29515w(z);
    }

    public void m29464u(T t, boolean z) {
        this.f13331a.m29526B(t != null ? Collections.singletonList(t) : null, z);
    }

    public C3955n.C3958c<T> m29463v() {
        Iterator<C3955n.C3958c<T>> it = this.f13331a.iterator();
        C3955n.C3958c<T> cVar = null;
        while (it.hasNext()) {
            C3955n.C3958c<T> next = it.next();
            if (next.m29492t()) {
                if (cVar == null) {
                    cVar = next;
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        return cVar;
    }

    public T m29462w() {
        C3955n.C3958c<T> v = m29463v();
        if (v != null) {
            return v.f13320a;
        }
        return null;
    }

    public void m29461x(boolean z) {
        this.f13331a.m29524D(z);
    }

    public C3965r(final AbstractC3966a aVar, Interpolator interpolator, long j) {
        this.f13331a = new C3955n<>(new C3955n.AbstractC3957b() {
            @Override
            public final void mo26894a(C3955n nVar) {
                C3965r.this.m29466s(aVar, nVar);
            }
        }, interpolator, j);
    }
}
