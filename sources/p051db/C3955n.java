package p051db;

import android.graphics.RectF;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p051db.C3950k;
import p080fb.AbstractC4345j;
import p108hb.C5062b;
import p108hb.C5069h;
import p139jb.AbstractC5911c;

public final class C3955n<T> implements Iterable<C3958c<T>> {
    public final C3960e f13309M;
    public final ArrayList<C3958c<T>> f13310N;
    public boolean f13311O;
    public final AbstractC3957b f13312a;
    public final ArrayList<C3958c<T>> f13313b;
    public final C3950k f13314c;

    public class C3956a implements C3950k.AbstractC3952b {
        public C3956a() {
        }

        @Override
        public void mo45P5(int i, float f, float f2, C3950k kVar) {
            C3955n.this.m29522i(f);
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
            C3955n.this.m29522i(f);
        }
    }

    public interface AbstractC3957b {
        void mo26894a(C3955n<?> nVar);
    }

    public static class C3958c<T> implements Comparable<C3958c<T>> {
        public final C3967s f13316M;
        public final C3968t f13317N;
        public final C3967s f13318O;
        public boolean f13319P = false;
        public final T f13320a;
        public int f13321b;
        public final C3967s f13322c;

        public C3958c(T t, int i, boolean z) {
            this.f13320a = t;
            this.f13321b = i;
            this.f13316M = new C3967s(z ? 1.0f : 0.0f);
            this.f13322c = new C3967s(i);
            this.f13317N = new C3968t();
            this.f13318O = new C3967s(0.0f);
            m29498n(false);
        }

        public final boolean m29500l(float f) {
            boolean z = false;
            boolean z2 = this.f13318O.m29460a(f) || (this.f13317N.mo26678c(f) || (this.f13316M.m29460a(f) || this.f13322c.m29460a(f)));
            T t = this.f13320a;
            if (!(t instanceof AbstractC3936b)) {
                return z2;
            }
            if (((AbstractC3936b) t).mo26678c(f) || z2) {
                z = true;
            }
            return z;
        }

        public int compareTo(C3958c<T> cVar) {
            return Integer.compare(this.f13321b, cVar.f13321b);
        }

        public final void m29498n(boolean z) {
            this.f13322c.m29458c(z);
            this.f13316M.m29458c(z);
            this.f13317N.mo26679b(z);
            this.f13318O.m29458c(z);
            T t = this.f13320a;
            if (t instanceof AbstractC3936b) {
                ((AbstractC3936b) t).mo26679b(z);
            }
        }

        public int m29497o() {
            return this.f13321b;
        }

        public float m29496p() {
            return this.f13322c.m29457d();
        }

        public RectF m29495q() {
            return this.f13317N.m29446m();
        }

        public float m29494r() {
            return this.f13318O.m29457d();
        }

        public float m29493s() {
            return C5069h.m24090d(this.f13316M.m29457d());
        }

        public boolean m29492t() {
            return !this.f13319P;
        }

        public boolean m29491u() {
            return m29493s() == 0.0f && !m29492t();
        }

        public final void m29490v() {
            this.f13316M.m29454g(1.0f);
            this.f13319P = false;
        }

        public final void m29489w() {
            this.f13316M.m29454g(0.0f);
            this.f13319P = true;
        }

        public final void m29488x() {
            T t = this.f13320a;
            if (t instanceof AbstractC5911c) {
                ((AbstractC5911c) t).mo4501a3();
            }
        }
    }

    public interface AbstractC3959d {
        int mo7991d(boolean z);

        int mo7990g(boolean z);

        int getHeight();

        int getWidth();
    }

    public static class C3960e {
        public final C3967s f13323a;
        public final C3967s f13324b;
        public final C3967s f13325c;
        public final C3967s f13326d;
        public final C3967s f13327e;
        public final C3967s f13328f;

        public C3960e() {
            this.f13323a = new C3967s(0.0f);
            this.f13324b = new C3967s(0.0f);
            this.f13325c = new C3967s(0.0f);
            this.f13326d = new C3967s(0.0f);
            this.f13327e = new C3967s(0.0f);
            this.f13328f = new C3967s(0.0f);
        }

        public boolean m29482f(float f) {
            return this.f13324b.m29460a(f) || (this.f13328f.m29460a(f) || (this.f13327e.m29460a(f) || (this.f13326d.m29460a(f) || (this.f13325c.m29460a(f) || this.f13323a.m29460a(f)))));
        }

        public void m29481g(boolean z) {
            this.f13323a.m29458c(z);
            this.f13325c.m29458c(z);
            this.f13326d.m29458c(z);
            this.f13327e.m29458c(z);
            this.f13328f.m29458c(z);
            this.f13324b.m29458c(z);
        }

        public float m29480h() {
            return this.f13325c.m29457d();
        }

        public float m29479i() {
            return this.f13323a.m29457d();
        }

        public float m29478j() {
            return this.f13328f.m29457d();
        }

        public float m29477k() {
            return this.f13327e.m29457d();
        }

        public float m29476l() {
            return this.f13324b.m29457d();
        }

        public final void m29475m(int i, boolean z) {
            float f = 1.0f;
            if (z) {
                this.f13323a.m29454g(i);
                C3967s sVar = this.f13324b;
                if (i <= 0) {
                    f = 0.0f;
                }
                sVar.m29454g(f);
                return;
            }
            this.f13323a.m29456e(i);
            C3967s sVar2 = this.f13324b;
            if (i <= 0) {
                f = 0.0f;
            }
            sVar2.m29456e(f);
        }
    }

    public interface AbstractC3961f<T> {
        void mo29474a(T t);

        void mo29473b(T t, boolean z);
    }

    public C3955n(final AbstractC4345j jVar) {
        this(new AbstractC3957b() {
            @Override
            public final void mo26894a(C3955n nVar) {
                AbstractC4345j.this.invalidate();
            }
        });
    }

    public final void m29527A(boolean z) {
        boolean z2 = false;
        for (int size = this.f13313b.size() - 1; size >= 0; size--) {
            C3958c<T> cVar = this.f13313b.get(size);
            cVar.m29498n(z);
            if (cVar.m29491u()) {
                this.f13313b.remove(size);
                cVar.m29488x();
                z2 = true;
            }
        }
        if (z2) {
            this.f13313b.trimToSize();
        }
        this.f13309M.m29481g(z);
    }

    public void m29526B(List<T> list, boolean z) {
        m29525C(list, z, null);
    }

    public void m29525C(List<T> list, boolean z, AbstractC3961f<T> fVar) {
        boolean z2 = false;
        if (!z) {
            m29524D(false);
            for (int size = this.f13313b.size() - 1; size >= 0; size--) {
                this.f13313b.get(size).m29488x();
            }
            this.f13313b.clear();
            this.f13310N.clear();
            int size2 = list != null ? list.size() : 0;
            if (size2 > 0) {
                this.f13313b.ensureCapacity(size2);
                this.f13310N.ensureCapacity(size2);
                for (T t : list) {
                    C3958c<T> cVar = new C3958c<>(t, this.f13310N.size(), true);
                    this.f13313b.add(cVar);
                    this.f13310N.add(cVar);
                }
                this.f13313b.trimToSize();
                this.f13310N.trimToSize();
            }
            this.f13309M.m29475m(size2, false);
            m29514x(false);
            this.f13312a.mo26894a(this);
        } else if (!m29520r(list)) {
            m29512z();
            if (list == null || list.isEmpty()) {
                if (!this.f13311O) {
                    Iterator<C3958c<T>> it = this.f13313b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().f13316M.m29459b(0.0f)) {
                                m29512z();
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (this.f13311O) {
                    Iterator<C3958c<T>> it2 = this.f13313b.iterator();
                    while (it2.hasNext()) {
                        C3958c<T> next = it2.next();
                        if (next.f13316M.m29459b(0.0f)) {
                            m29512z();
                            next.m29489w();
                            C5062b.m24182A(this.f13310N, next);
                            this.f13309M.m29475m(this.f13310N.size(), true);
                            if (fVar != null) {
                                fVar.mo29474a(next.f13320a);
                            }
                        }
                    }
                }
            } else {
                boolean z3 = false;
                int i = 0;
                boolean z4 = false;
                for (int i2 = 0; i2 < this.f13313b.size(); i2++) {
                    C3958c<T> cVar2 = this.f13313b.get(i2);
                    int indexOf = list.indexOf(cVar2.f13320a);
                    if (indexOf != -1) {
                        i++;
                        float f = indexOf;
                        if (cVar2.f13322c.m29459b(f)) {
                            m29512z();
                            cVar2.f13322c.m29454g(f);
                        }
                        if (cVar2.f13321b != indexOf) {
                            cVar2.f13321b = indexOf;
                            z3 = z3 || cVar2.m29492t();
                            z4 = true;
                        }
                        if (cVar2.f13316M.m29459b(1.0f)) {
                            m29512z();
                            cVar2.m29490v();
                            this.f13310N.add(cVar2);
                            this.f13309M.m29475m(this.f13310N.size(), true);
                            if (fVar != null) {
                                fVar.mo29473b(cVar2.f13320a, true);
                            }
                            z3 = true;
                        }
                    } else if (cVar2.f13316M.m29459b(0.0f)) {
                        m29512z();
                        cVar2.m29489w();
                        ArrayList<C3958c<T>> arrayList = this.f13310N;
                        if (z3 ? arrayList.remove(cVar2) : C5062b.m24182A(arrayList, cVar2)) {
                            this.f13309M.m29475m(this.f13310N.size(), true);
                            if (fVar != null) {
                                fVar.mo29474a(cVar2.f13320a);
                            }
                        } else {
                            throw new IllegalArgumentException();
                        }
                    } else {
                        continue;
                    }
                }
                if (z3) {
                    Collections.sort(this.f13310N);
                }
                if (i < list.size()) {
                    ArrayList<C3958c<T>> arrayList2 = this.f13313b;
                    arrayList2.ensureCapacity(arrayList2.size() + (list.size() - i));
                    int i3 = 0;
                    for (T t2 : list) {
                        if (m29517u(t2) == -1) {
                            if (i3 != this.f13313b.size()) {
                                z4 = true;
                            }
                            m29512z();
                            C3958c<T> cVar3 = new C3958c<>(t2, i3, false);
                            cVar3.m29490v();
                            this.f13313b.add(cVar3);
                            C5062b.m24170c(this.f13310N, cVar3);
                            this.f13309M.m29475m(this.f13310N.size(), true);
                            if (fVar != null) {
                                fVar.mo29473b(cVar3.f13320a, false);
                            }
                        }
                        i3++;
                    }
                }
                z2 = z4;
            }
            if (z2) {
                Collections.sort(this.f13313b);
            }
            m29514x(true);
            m29513y();
        }
    }

    public void m29524D(boolean z) {
        C3950k kVar = this.f13314c;
        if (kVar != null) {
            kVar.m29544k();
            m29527A(z);
            this.f13314c.m29543l(0.0f);
            return;
        }
        m29527A(z);
    }

    public void m29522i(float f) {
        boolean f2 = this.f13309M.m29482f(f);
        Iterator<C3958c<T>> it = this.f13313b.iterator();
        while (it.hasNext()) {
            f2 = it.next().m29500l(f) || f2;
        }
        if (f2) {
            this.f13312a.mo26894a(this);
            if (f == 1.0f) {
                m29527A(true);
            }
        }
    }

    @Override
    public Iterator<C3958c<T>> iterator() {
        return this.f13313b.iterator();
    }

    public void m29521m(boolean z) {
        m29526B(null, z);
    }

    public boolean m29520r(List<T> list) {
        if (list == null || list.isEmpty()) {
            return this.f13310N.isEmpty();
        }
        if (this.f13310N.size() != list.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!this.f13310N.get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public C3958c<T> m29519s(int i) {
        return this.f13313b.get(i);
    }

    public int size() {
        return this.f13313b.size();
    }

    public C3960e m29518t() {
        return this.f13309M;
    }

    public final int m29517u(T t) {
        int i = 0;
        if (t == null) {
            Iterator<C3958c<T>> it = this.f13313b.iterator();
            while (it.hasNext()) {
                if (it.next().f13320a == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        Iterator<C3958c<T>> it2 = this.f13313b.iterator();
        while (it2.hasNext()) {
            if (t.equals(it2.next().f13320a)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void m29515w(boolean z) {
        if (!z) {
            m29524D(true);
        }
        m29514x(z);
        if (z) {
            m29513y();
        }
    }

    public void m29514x(boolean z) {
        Iterator<C3958c<T>> it = this.f13310N.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (it.hasNext()) {
            C3958c<T> next = it.next();
            T t = next.f13320a;
            if (t instanceof AbstractC3959d) {
                AbstractC3959d dVar = (AbstractC3959d) t;
                boolean z2 = true;
                boolean z3 = next.f13321b == 0;
                if (next.f13321b + 1 != this.f13310N.size()) {
                    z2 = false;
                }
                int g = dVar.mo7990g(z3);
                int d = dVar.mo7991d(z2);
                int width = dVar.getWidth();
                int height = dVar.getHeight();
                int i5 = g + width + d + i;
                int i6 = g + height + d + i2;
                if (!z || next.m29493s() <= 0.0f) {
                    next.f13317N.m29448k(i, i2, i5, i6);
                    next.f13318O.m29456e(g);
                } else {
                    float f = i;
                    float f2 = i2;
                    float f3 = i5;
                    float f4 = i6;
                    if (next.f13317N.m29453d(f, f2, f3, f4)) {
                        m29512z();
                        next.f13317N.m29447l(f, f2, f3, f4);
                    }
                    float f5 = g;
                    if (next.f13318O.m29459b(f5)) {
                        m29512z();
                        next.f13318O.m29454g(f5);
                    }
                }
                i3 = Math.max(i3, width);
                i4 = Math.max(i4, height);
                i = i5;
                i2 = i6;
            }
        }
        Iterator<C3958c<T>> it2 = this.f13313b.iterator();
        while (it2.hasNext()) {
            T t2 = it2.next().f13320a;
            if (t2 instanceof AbstractC3936b) {
                AbstractC3936b bVar = (AbstractC3936b) t2;
                if (!z) {
                    bVar.mo26677e();
                } else if (bVar.mo26680a()) {
                    m29512z();
                    bVar.mo26676f();
                }
            }
        }
        if (z) {
            float f6 = i;
            if (this.f13309M.f13327e.m29459b(f6)) {
                m29512z();
                this.f13309M.f13327e.m29454g(f6);
            }
            float f7 = i2;
            if (this.f13309M.f13328f.m29459b(f7)) {
                m29512z();
                this.f13309M.f13328f.m29454g(f7);
            }
            float f8 = i3;
            if (this.f13309M.f13325c.m29459b(f8)) {
                m29512z();
                this.f13309M.f13325c.m29454g(f8);
            }
            float f9 = i4;
            if (this.f13309M.f13326d.m29459b(f9)) {
                m29512z();
                this.f13309M.f13326d.m29454g(f9);
                return;
            }
            return;
        }
        this.f13309M.f13327e.m29456e(i);
        this.f13309M.f13328f.m29456e(i2);
        this.f13309M.f13325c.m29456e(i3);
        this.f13309M.f13326d.m29456e(i4);
    }

    public final void m29513y() {
        if (this.f13311O) {
            this.f13311O = false;
            C3950k kVar = this.f13314c;
            if (kVar != null) {
                kVar.m29546i(1.0f);
            }
        } else if (this.f13314c == null) {
            Iterator<C3958c<T>> it = this.f13313b.iterator();
            while (it.hasNext()) {
                C3958c<T> next = it.next();
                next.f13316M.m29455f(next.f13316M.m29457d());
                next.f13322c.m29455f(next.f13322c.m29457d());
            }
        }
    }

    public final void m29512z() {
        if (!this.f13311O) {
            this.f13311O = true;
            m29524D(false);
        }
    }

    public C3955n(AbstractC3957b bVar) {
        this(bVar, null, 0L);
    }

    public C3955n(AbstractC3957b bVar, Interpolator interpolator, long j) {
        this.f13312a = bVar;
        this.f13309M = new C3960e();
        this.f13313b = new ArrayList<>();
        this.f13310N = new ArrayList<>();
        if (interpolator == null || j <= 0) {
            this.f13314c = null;
        } else {
            this.f13314c = new C3950k(0, new C3956a(), interpolator, j);
        }
    }
}
