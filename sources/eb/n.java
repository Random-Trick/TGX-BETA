package eb;

import android.graphics.RectF;
import android.view.animation.Interpolator;
import eb.k;
import gb.j;
import ib.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class n<T> implements Iterable<c<T>> {
    public final e M;
    public final ArrayList<c<T>> N;
    public boolean O;
    public final b f11475a;
    public final ArrayList<c<T>> f11476b;
    public final k f11477c;

    public class a implements k.b {
        public a() {
        }

        @Override
        public void n4(int i10, float f10, float f11, k kVar) {
            n.this.g(f10);
        }

        @Override
        public void o4(int i10, float f10, k kVar) {
            n.this.g(f10);
        }
    }

    public interface b {
        void a(n<?> nVar);
    }

    public static class c<T> implements Comparable<c<T>> {
        public final s M;
        public final t N;
        public final s O;
        public boolean P = false;
        public final T f11479a;
        public int f11480b;
        public final s f11481c;

        public c(T t10, int i10, boolean z10) {
            this.f11479a = t10;
            this.f11480b = i10;
            this.M = new s(z10 ? 1.0f : 0.0f);
            this.f11481c = new s(i10);
            this.N = new t();
            this.O = new s(0.0f);
            n(false);
        }

        public final boolean l(float f10) {
            boolean z10 = false;
            boolean z11 = this.O.a(f10) || (this.N.c(f10) || (this.M.a(f10) || this.f11481c.a(f10)));
            T t10 = this.f11479a;
            if (!(t10 instanceof eb.b)) {
                return z11;
            }
            if (((eb.b) t10).c(f10) || z11) {
                z10 = true;
            }
            return z10;
        }

        public int compareTo(c<T> cVar) {
            return Integer.compare(this.f11480b, cVar.f11480b);
        }

        public final void n(boolean z10) {
            this.f11481c.c(z10);
            this.M.c(z10);
            this.N.b(z10);
            this.O.c(z10);
            T t10 = this.f11479a;
            if (t10 instanceof eb.b) {
                ((eb.b) t10).b(z10);
            }
        }

        public int o() {
            return this.f11480b;
        }

        public float p() {
            return this.f11481c.d();
        }

        public RectF q() {
            return this.N.m();
        }

        public float r() {
            return this.O.d();
        }

        public float s() {
            return h.d(this.M.d());
        }

        public boolean t() {
            return !this.P;
        }

        public boolean u() {
            return s() == 0.0f && !t();
        }

        public final void v() {
            this.M.g(1.0f);
            this.P = false;
        }

        public final void w() {
            this.M.g(0.0f);
            this.P = true;
        }

        public final void x() {
            T t10 = this.f11479a;
            if (t10 instanceof kb.c) {
                ((kb.c) t10).Q2();
            }
        }
    }

    public interface d {
        int d(boolean z10);

        int g(boolean z10);

        int getHeight();

        int getWidth();
    }

    public static class e {
        public final s f11482a;
        public final s f11483b;
        public final s f11484c;
        public final s f11485d;
        public final s f11486e;
        public final s f11487f;

        public e() {
            this.f11482a = new s(0.0f);
            this.f11483b = new s(0.0f);
            this.f11484c = new s(0.0f);
            this.f11485d = new s(0.0f);
            this.f11486e = new s(0.0f);
            this.f11487f = new s(0.0f);
        }

        public boolean f(float f10) {
            return this.f11483b.a(f10) || (this.f11487f.a(f10) || (this.f11486e.a(f10) || (this.f11485d.a(f10) || (this.f11484c.a(f10) || this.f11482a.a(f10)))));
        }

        public void g(boolean z10) {
            this.f11482a.c(z10);
            this.f11484c.c(z10);
            this.f11485d.c(z10);
            this.f11486e.c(z10);
            this.f11487f.c(z10);
            this.f11483b.c(z10);
        }

        public float h() {
            return this.f11484c.d();
        }

        public float i() {
            return this.f11482a.d();
        }

        public float j() {
            return this.f11487f.d();
        }

        public float k() {
            return this.f11486e.d();
        }

        public float l() {
            return this.f11483b.d();
        }

        public final void m(int i10, boolean z10) {
            float f10 = 1.0f;
            if (z10) {
                this.f11482a.g(i10);
                s sVar = this.f11483b;
                if (i10 <= 0) {
                    f10 = 0.0f;
                }
                sVar.g(f10);
                return;
            }
            this.f11482a.e(i10);
            s sVar2 = this.f11483b;
            if (i10 <= 0) {
                f10 = 0.0f;
            }
            sVar2.e(f10);
        }
    }

    public interface f<T> {
        void a(T t10);

        void b(T t10, boolean z10);
    }

    public n(final j jVar) {
        this(new b() {
            @Override
            public final void a(n nVar) {
                j.this.invalidate();
            }
        });
    }

    public final void A(boolean z10) {
        boolean z11 = false;
        for (int size = this.f11476b.size() - 1; size >= 0; size--) {
            c<T> cVar = this.f11476b.get(size);
            cVar.n(z10);
            if (cVar.u()) {
                this.f11476b.remove(size);
                cVar.x();
                z11 = true;
            }
        }
        if (z11) {
            this.f11476b.trimToSize();
        }
        this.M.g(z10);
    }

    public void B(List<T> list, boolean z10) {
        C(list, z10, null);
    }

    public void C(List<T> list, boolean z10, f<T> fVar) {
        boolean z11 = false;
        if (!z10) {
            D(false);
            for (int size = this.f11476b.size() - 1; size >= 0; size--) {
                this.f11476b.get(size).x();
            }
            this.f11476b.clear();
            this.N.clear();
            int size2 = list != null ? list.size() : 0;
            if (size2 > 0) {
                this.f11476b.ensureCapacity(size2);
                this.N.ensureCapacity(size2);
                for (T t10 : list) {
                    c<T> cVar = new c<>(t10, this.N.size(), true);
                    this.f11476b.add(cVar);
                    this.N.add(cVar);
                }
                this.f11476b.trimToSize();
                this.N.trimToSize();
            }
            this.M.m(size2, false);
            x(false);
            this.f11475a.a(this);
        } else if (!r(list)) {
            z();
            if (list == null || list.isEmpty()) {
                if (!this.O) {
                    Iterator<c<T>> it = this.f11476b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().M.b(0.0f)) {
                                z();
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (this.O) {
                    Iterator<c<T>> it2 = this.f11476b.iterator();
                    while (it2.hasNext()) {
                        c<T> next = it2.next();
                        if (next.M.b(0.0f)) {
                            z();
                            next.w();
                            ib.b.A(this.N, next);
                            this.M.m(this.N.size(), true);
                            if (fVar != null) {
                                fVar.a(next.f11479a);
                            }
                        }
                    }
                }
            } else {
                boolean z12 = false;
                int i10 = 0;
                boolean z13 = false;
                for (int i11 = 0; i11 < this.f11476b.size(); i11++) {
                    c<T> cVar2 = this.f11476b.get(i11);
                    int indexOf = list.indexOf(cVar2.f11479a);
                    if (indexOf != -1) {
                        i10++;
                        float f10 = indexOf;
                        if (cVar2.f11481c.b(f10)) {
                            z();
                            cVar2.f11481c.g(f10);
                        }
                        if (cVar2.f11480b != indexOf) {
                            cVar2.f11480b = indexOf;
                            z12 = z12 || cVar2.t();
                            z13 = true;
                        }
                        if (cVar2.M.b(1.0f)) {
                            z();
                            cVar2.v();
                            this.N.add(cVar2);
                            this.M.m(this.N.size(), true);
                            if (fVar != null) {
                                fVar.b(cVar2.f11479a, true);
                            }
                            z12 = true;
                        }
                    } else if (cVar2.M.b(0.0f)) {
                        z();
                        cVar2.w();
                        ArrayList<c<T>> arrayList = this.N;
                        if (z12 ? arrayList.remove(cVar2) : ib.b.A(arrayList, cVar2)) {
                            this.M.m(this.N.size(), true);
                            if (fVar != null) {
                                fVar.a(cVar2.f11479a);
                            }
                        } else {
                            throw new IllegalArgumentException();
                        }
                    } else {
                        continue;
                    }
                }
                if (z12) {
                    Collections.sort(this.N);
                }
                if (i10 < list.size()) {
                    ArrayList<c<T>> arrayList2 = this.f11476b;
                    arrayList2.ensureCapacity(arrayList2.size() + (list.size() - i10));
                    int i12 = 0;
                    for (T t11 : list) {
                        if (u(t11) == -1) {
                            if (i12 != this.f11476b.size()) {
                                z13 = true;
                            }
                            z();
                            c<T> cVar3 = new c<>(t11, i12, false);
                            cVar3.v();
                            this.f11476b.add(cVar3);
                            ib.b.c(this.N, cVar3);
                            this.M.m(this.N.size(), true);
                            if (fVar != null) {
                                fVar.b(cVar3.f11479a, false);
                            }
                        }
                        i12++;
                    }
                }
                z11 = z13;
            }
            if (z11) {
                Collections.sort(this.f11476b);
            }
            x(true);
            y();
        }
    }

    public void D(boolean z10) {
        k kVar = this.f11477c;
        if (kVar != null) {
            kVar.k();
            A(z10);
            this.f11477c.l(0.0f);
            return;
        }
        A(z10);
    }

    public void g(float f10) {
        boolean f11 = this.M.f(f10);
        Iterator<c<T>> it = this.f11476b.iterator();
        while (it.hasNext()) {
            f11 = it.next().l(f10) || f11;
        }
        if (f11) {
            this.f11475a.a(this);
            if (f10 == 1.0f) {
                A(true);
            }
        }
    }

    @Override
    public Iterator<c<T>> iterator() {
        return this.f11476b.iterator();
    }

    public void m(boolean z10) {
        B(null, z10);
    }

    public boolean r(List<T> list) {
        if (list == null || list.isEmpty()) {
            return this.N.isEmpty();
        }
        if (this.N.size() != list.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!this.N.get(i10).equals(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public c<T> s(int i10) {
        return this.f11476b.get(i10);
    }

    public int size() {
        return this.f11476b.size();
    }

    public e t() {
        return this.M;
    }

    public final int u(T t10) {
        int i10 = 0;
        if (t10 == null) {
            Iterator<c<T>> it = this.f11476b.iterator();
            while (it.hasNext()) {
                if (it.next().f11479a == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        Iterator<c<T>> it2 = this.f11476b.iterator();
        while (it2.hasNext()) {
            if (t10.equals(it2.next().f11479a)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public void w(boolean z10) {
        if (!z10) {
            D(true);
        }
        x(z10);
        if (z10) {
            y();
        }
    }

    public void x(boolean z10) {
        Iterator<c<T>> it = this.N.iterator();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (it.hasNext()) {
            c<T> next = it.next();
            T t10 = next.f11479a;
            if (t10 instanceof d) {
                d dVar = (d) t10;
                boolean z11 = true;
                boolean z12 = next.f11480b == 0;
                if (next.f11480b + 1 != this.N.size()) {
                    z11 = false;
                }
                int g10 = dVar.g(z12);
                int d10 = dVar.d(z11);
                int width = dVar.getWidth();
                int height = dVar.getHeight();
                int i14 = g10 + width + d10 + i10;
                int i15 = g10 + height + d10 + i11;
                if (!z10 || next.s() <= 0.0f) {
                    next.N.k(i10, i11, i14, i15);
                    next.O.e(g10);
                } else {
                    float f10 = i10;
                    float f11 = i11;
                    float f12 = i14;
                    float f13 = i15;
                    if (next.N.d(f10, f11, f12, f13)) {
                        z();
                        next.N.l(f10, f11, f12, f13);
                    }
                    float f14 = g10;
                    if (next.O.b(f14)) {
                        z();
                        next.O.g(f14);
                    }
                }
                i12 = Math.max(i12, width);
                i13 = Math.max(i13, height);
                i10 = i14;
                i11 = i15;
            }
        }
        Iterator<c<T>> it2 = this.f11476b.iterator();
        while (it2.hasNext()) {
            T t11 = it2.next().f11479a;
            if (t11 instanceof eb.b) {
                eb.b bVar = (eb.b) t11;
                if (!z10) {
                    bVar.e();
                } else if (bVar.a()) {
                    z();
                    bVar.f();
                }
            }
        }
        if (z10) {
            float f15 = i10;
            if (this.M.f11486e.b(f15)) {
                z();
                this.M.f11486e.g(f15);
            }
            float f16 = i11;
            if (this.M.f11487f.b(f16)) {
                z();
                this.M.f11487f.g(f16);
            }
            float f17 = i12;
            if (this.M.f11484c.b(f17)) {
                z();
                this.M.f11484c.g(f17);
            }
            float f18 = i13;
            if (this.M.f11485d.b(f18)) {
                z();
                this.M.f11485d.g(f18);
                return;
            }
            return;
        }
        this.M.f11486e.e(i10);
        this.M.f11487f.e(i11);
        this.M.f11484c.e(i12);
        this.M.f11485d.e(i13);
    }

    public final void y() {
        if (this.O) {
            this.O = false;
            k kVar = this.f11477c;
            if (kVar != null) {
                kVar.i(1.0f);
            }
        } else if (this.f11477c == null) {
            Iterator<c<T>> it = this.f11476b.iterator();
            while (it.hasNext()) {
                c<T> next = it.next();
                next.M.f(next.M.d());
                next.f11481c.f(next.f11481c.d());
            }
        }
    }

    public final void z() {
        if (!this.O) {
            this.O = true;
            D(false);
        }
    }

    public n(b bVar) {
        this(bVar, null, 0L);
    }

    public n(b bVar, Interpolator interpolator, long j10) {
        this.f11475a = bVar;
        this.M = new e();
        this.f11476b = new ArrayList<>();
        this.N = new ArrayList<>();
        if (interpolator == null || j10 <= 0) {
            this.f11477c = null;
        } else {
            this.f11477c = new k(0, new a(), interpolator, j10);
        }
    }
}
