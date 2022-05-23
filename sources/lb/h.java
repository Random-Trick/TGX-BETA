package lb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import lb.d;

public class h<K, T> {
    public final boolean f16334a;
    public final boolean f16335b;
    public final d.a f16336c;
    public int f16337d;
    public d<T> f16338e;
    public final Map<K, d<T>> f16339f;

    public interface a<KK, TT> {
        void a(h<KK, TT> hVar, boolean z10);
    }

    public h() {
        this(false, true, null);
    }

    public void e(a aVar, d dVar, boolean z10) {
        synchronized (aVar) {
            if (z10) {
                int i10 = this.f16337d;
                this.f16337d = i10 + 1;
                if (i10 == 0) {
                    aVar.a(this, true);
                }
            } else {
                int i11 = this.f16337d - 1;
                this.f16337d = i11;
                if (i11 == 0) {
                    aVar.a(this, false);
                }
            }
        }
    }

    public final boolean b(K k10, T t10) {
        boolean add;
        synchronized (this.f16339f) {
            d<T> dVar = this.f16339f.get(k10);
            if (dVar == null) {
                dVar = this.f16338e;
                if (dVar != null) {
                    this.f16338e = dVar.R;
                    dVar.R = null;
                } else {
                    dVar = new d<>(this.f16334a, this.f16335b, this.f16336c);
                }
                this.f16339f.put(k10, dVar);
            }
            add = dVar.add(t10);
        }
        return add;
    }

    public final void c() {
        synchronized (this.f16339f) {
            for (Map.Entry<K, d<T>> entry : this.f16339f.entrySet()) {
                d<T> value = entry.getValue();
                value.clear();
                value.R = this.f16338e;
                this.f16338e = value;
            }
            this.f16339f.clear();
        }
    }

    public final Iterator<T> d(K k10) {
        Iterator<T> it;
        synchronized (this.f16339f) {
            d<T> dVar = this.f16339f.get(k10);
            it = dVar != null ? dVar.iterator() : null;
        }
        return it;
    }

    public final void f(K k10, K k11) {
        synchronized (this.f16339f) {
            d<T> remove = this.f16339f.remove(k10);
            if (remove != null) {
                d<T> dVar = this.f16339f.get(k11);
                if (dVar != null) {
                    dVar.u(remove);
                    remove.clear();
                    remove.R = this.f16338e;
                    this.f16338e = remove;
                } else {
                    this.f16339f.put(k11, remove);
                }
            }
        }
    }

    public final void g(K k10, T t10) {
        synchronized (this.f16339f) {
            d<T> dVar = this.f16339f.get(k10);
            if (dVar != null) {
                dVar.remove(t10);
                if (dVar.isEmpty()) {
                    this.f16339f.remove(k10);
                    dVar.R = this.f16338e;
                    this.f16338e = dVar;
                }
            }
        }
    }

    public h(boolean z10) {
        this(z10, true, null);
    }

    public h(boolean z10, boolean z11, final a<K, T> aVar) {
        this.f16339f = new HashMap();
        this.f16334a = z10;
        this.f16335b = z11;
        if (aVar != null) {
            this.f16336c = new d.a() {
                @Override
                public final void b(d dVar, boolean z12) {
                    h.this.e(aVar, dVar, z12);
                }
            };
        } else {
            this.f16336c = null;
        }
    }
}
