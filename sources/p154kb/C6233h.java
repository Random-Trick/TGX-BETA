package p154kb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p154kb.C6227d;

public class C6233h<K, T> {
    public final boolean f19660a;
    public final boolean f19661b;
    public final C6227d.AbstractC6228a f19662c;
    public int f19663d;
    public C6227d<T> f19664e;
    public final Map<K, C6227d<T>> f19665f;

    public interface AbstractC6234a<KK, TT> {
        void mo1980a(C6233h<KK, TT> hVar, boolean z);
    }

    public C6233h() {
        this(false, true, null);
    }

    public void m21018e(AbstractC6234a aVar, C6227d dVar, boolean z) {
        synchronized (aVar) {
            if (z) {
                int i = this.f19663d;
                this.f19663d = i + 1;
                if (i == 0) {
                    aVar.mo1980a(this, true);
                }
            } else {
                int i2 = this.f19663d - 1;
                this.f19663d = i2;
                if (i2 == 0) {
                    aVar.mo1980a(this, false);
                }
            }
        }
    }

    public final boolean m21021b(K k, T t) {
        boolean add;
        synchronized (this.f19665f) {
            C6227d<T> dVar = this.f19665f.get(k);
            if (dVar == null) {
                dVar = this.f19664e;
                if (dVar != null) {
                    this.f19664e = dVar.f19650R;
                    dVar.f19650R = null;
                } else {
                    dVar = new C6227d<>(this.f19660a, this.f19661b, this.f19662c);
                }
                this.f19665f.put(k, dVar);
            }
            add = dVar.add(t);
        }
        return add;
    }

    public final void m21020c() {
        synchronized (this.f19665f) {
            for (Map.Entry<K, C6227d<T>> entry : this.f19665f.entrySet()) {
                C6227d<T> value = entry.getValue();
                value.clear();
                value.f19650R = this.f19664e;
                this.f19664e = value;
            }
            this.f19665f.clear();
        }
    }

    public final Iterator<T> m21019d(K k) {
        Iterator<T> it;
        synchronized (this.f19665f) {
            C6227d<T> dVar = this.f19665f.get(k);
            it = dVar != null ? dVar.iterator() : null;
        }
        return it;
    }

    public final void m21017f(K k, K k2) {
        synchronized (this.f19665f) {
            C6227d<T> remove = this.f19665f.remove(k);
            if (remove != null) {
                C6227d<T> dVar = this.f19665f.get(k2);
                if (dVar != null) {
                    dVar.m21026u(remove);
                    remove.clear();
                    remove.f19650R = this.f19664e;
                    this.f19664e = remove;
                } else {
                    this.f19665f.put(k2, remove);
                }
            }
        }
    }

    public final void m21016g(K k, T t) {
        synchronized (this.f19665f) {
            C6227d<T> dVar = this.f19665f.get(k);
            if (dVar != null) {
                dVar.remove(t);
                if (dVar.isEmpty()) {
                    this.f19665f.remove(k);
                    dVar.f19650R = this.f19664e;
                    this.f19664e = dVar;
                }
            }
        }
    }

    public C6233h(boolean z) {
        this(z, true, null);
    }

    public C6233h(boolean z, boolean z2, final AbstractC6234a<K, T> aVar) {
        this.f19665f = new HashMap();
        this.f19660a = z;
        this.f19661b = z2;
        if (aVar != null) {
            this.f19662c = new C6227d.AbstractC6228a() {
                @Override
                public final void mo4374b(C6227d dVar, boolean z3) {
                    C6233h.this.m21018e(aVar, dVar, z3);
                }
            };
        } else {
            this.f19662c = null;
        }
    }
}
