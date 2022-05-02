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
            C3955n.this.m29520i(f);
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
            C3955n.this.m29520i(f);
        }
    }

    public interface AbstractC3957b {
        void mo26892a(C3955n<?> nVar);
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
            m29496n(false);
        }

        public final boolean m29498l(float f) {
            boolean z = false;
            boolean z2 = this.f13318O.m29458a(f) || (this.f13317N.mo26677c(f) || (this.f13316M.m29458a(f) || this.f13322c.m29458a(f)));
            T t = this.f13320a;
            if (!(t instanceof AbstractC3936b)) {
                return z2;
            }
            if (((AbstractC3936b) t).mo26677c(f) || z2) {
                z = true;
            }
            return z;
        }

        public int compareTo(C3958c<T> cVar) {
            return Integer.compare(this.f13321b, cVar.f13321b);
        }

        public final void m29496n(boolean z) {
            this.f13322c.m29456c(z);
            this.f13316M.m29456c(z);
            this.f13317N.mo26678b(z);
            this.f13318O.m29456c(z);
            T t = this.f13320a;
            if (t instanceof AbstractC3936b) {
                ((AbstractC3936b) t).mo26678b(z);
            }
        }

        public int m29495o() {
            return this.f13321b;
        }

        public float m29494p() {
            return this.f13322c.m29455d();
        }

        public RectF m29493q() {
            return this.f13317N.m29444m();
        }

        public float m29492r() {
            return this.f13318O.m29455d();
        }

        public float m29491s() {
            return C5069h.m24089d(this.f13316M.m29455d());
        }

        public boolean m29490t() {
            return !this.f13319P;
        }

        public boolean m29489u() {
            return m29491s() == 0.0f && !m29490t();
        }

        public final void m29488v() {
            this.f13316M.m29452g(1.0f);
            this.f13319P = false;
        }

        public final void m29487w() {
            this.f13316M.m29452g(0.0f);
            this.f13319P = true;
        }

        public final void m29486x() {
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

        public boolean m29480f(float f) {
            return this.f13324b.m29458a(f) || (this.f13328f.m29458a(f) || (this.f13327e.m29458a(f) || (this.f13326d.m29458a(f) || (this.f13325c.m29458a(f) || this.f13323a.m29458a(f)))));
        }

        public void m29479g(boolean z) {
            this.f13323a.m29456c(z);
            this.f13325c.m29456c(z);
            this.f13326d.m29456c(z);
            this.f13327e.m29456c(z);
            this.f13328f.m29456c(z);
            this.f13324b.m29456c(z);
        }

        public float m29478h() {
            return this.f13325c.m29455d();
        }

        public float m29477i() {
            return this.f13323a.m29455d();
        }

        public float m29476j() {
            return this.f13328f.m29455d();
        }

        public float m29475k() {
            return this.f13327e.m29455d();
        }

        public float m29474l() {
            return this.f13324b.m29455d();
        }

        public final void m29473m(int i, boolean z) {
            float f = 1.0f;
            if (z) {
                this.f13323a.m29452g(i);
                C3967s sVar = this.f13324b;
                if (i <= 0) {
                    f = 0.0f;
                }
                sVar.m29452g(f);
                return;
            }
            this.f13323a.m29454e(i);
            C3967s sVar2 = this.f13324b;
            if (i <= 0) {
                f = 0.0f;
            }
            sVar2.m29454e(f);
        }
    }

    public interface AbstractC3961f<T> {
        void mo29472a(T t);

        void mo29471b(T t, boolean z);
    }

    public C3955n(final AbstractC4345j jVar) {
        this(new AbstractC3957b() {
            @Override
            public final void mo26892a(C3955n nVar) {
                AbstractC4345j.this.invalidate();
            }
        });
    }

    public final void m29525A(boolean z) {
        boolean z2 = false;
        for (int size = this.f13313b.size() - 1; size >= 0; size--) {
            C3958c<T> cVar = this.f13313b.get(size);
            cVar.m29496n(z);
            if (cVar.m29489u()) {
                this.f13313b.remove(size);
                cVar.m29486x();
                z2 = true;
            }
        }
        if (z2) {
            this.f13313b.trimToSize();
        }
        this.f13309M.m29479g(z);
    }

    public void m29524B(List<T> list, boolean z) {
        m29523C(list, z, null);
    }

    public void m29523C(List<T> list, boolean z, AbstractC3961f<T> fVar) {
        boolean z2 = false;
        if (!z) {
            m29522D(false);
            for (int size = this.f13313b.size() - 1; size >= 0; size--) {
                this.f13313b.get(size).m29486x();
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
            this.f13309M.m29473m(size2, false);
            m29512x(false);
            this.f13312a.mo26892a(this);
        } else if (!m29518r(list)) {
            m29510z();
            if (list == null || list.isEmpty()) {
                if (!this.f13311O) {
                    Iterator<C3958c<T>> it = this.f13313b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().f13316M.m29457b(0.0f)) {
                                m29510z();
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
                        if (next.f13316M.m29457b(0.0f)) {
                            m29510z();
                            next.m29487w();
                            C5062b.m24181A(this.f13310N, next);
                            this.f13309M.m29473m(this.f13310N.size(), true);
                            if (fVar != null) {
                                fVar.mo29472a(next.f13320a);
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
                        if (cVar2.f13322c.m29457b(f)) {
                            m29510z();
                            cVar2.f13322c.m29452g(f);
                        }
                        if (cVar2.f13321b != indexOf) {
                            cVar2.f13321b = indexOf;
                            z3 = z3 || cVar2.m29490t();
                            z4 = true;
                        }
                        if (cVar2.f13316M.m29457b(1.0f)) {
                            m29510z();
                            cVar2.m29488v();
                            this.f13310N.add(cVar2);
                            this.f13309M.m29473m(this.f13310N.size(), true);
                            if (fVar != null) {
                                fVar.mo29471b(cVar2.f13320a, true);
                            }
                            z3 = true;
                        }
                    } else if (cVar2.f13316M.m29457b(0.0f)) {
                        m29510z();
                        cVar2.m29487w();
                        ArrayList<C3958c<T>> arrayList = this.f13310N;
                        if (z3 ? arrayList.remove(cVar2) : C5062b.m24181A(arrayList, cVar2)) {
                            this.f13309M.m29473m(this.f13310N.size(), true);
                            if (fVar != null) {
                                fVar.mo29472a(cVar2.f13320a);
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
                        if (m29515u(t2) == -1) {
                            if (i3 != this.f13313b.size()) {
                                z4 = true;
                            }
                            m29510z();
                            C3958c<T> cVar3 = new C3958c<>(t2, i3, false);
                            cVar3.m29488v();
                            this.f13313b.add(cVar3);
                            C5062b.m24169c(this.f13310N, cVar3);
                            this.f13309M.m29473m(this.f13310N.size(), true);
                            if (fVar != null) {
                                fVar.mo29471b(cVar3.f13320a, false);
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
            m29512x(true);
            m29511y();
        }
    }

    public void m29522D(boolean z) {
        C3950k kVar = this.f13314c;
        if (kVar != null) {
            kVar.m29542k();
            m29525A(z);
            this.f13314c.m29541l(0.0f);
            return;
        }
        m29525A(z);
    }

    public void m29520i(float f) {
        boolean f2 = this.f13309M.m29480f(f);
        Iterator<C3958c<T>> it = this.f13313b.iterator();
        while (it.hasNext()) {
            f2 = it.next().m29498l(f) || f2;
        }
        if (f2) {
            this.f13312a.mo26892a(this);
            if (f == 1.0f) {
                m29525A(true);
            }
        }
    }

    @Override
    public Iterator<C3958c<T>> iterator() {
        return this.f13313b.iterator();
    }

    public void m29519m(boolean z) {
        m29524B(null, z);
    }

    public boolean m29518r(List<T> list) {
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

    public C3958c<T> m29517s(int i) {
        return this.f13313b.get(i);
    }

    public int size() {
        return this.f13313b.size();
    }

    public C3960e m29516t() {
        return this.f13309M;
    }

    public final int m29515u(T t) {
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

    public void m29513w(boolean z) {
        if (!z) {
            m29522D(true);
        }
        m29512x(z);
        if (z) {
            m29511y();
        }
    }

    public void m29512x(boolean z) {
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
                if (!z || next.m29491s() <= 0.0f) {
                    next.f13317N.m29446k(i, i2, i5, i6);
                    next.f13318O.m29454e(g);
                } else {
                    float f = i;
                    float f2 = i2;
                    float f3 = i5;
                    float f4 = i6;
                    if (next.f13317N.m29451d(f, f2, f3, f4)) {
                        m29510z();
                        next.f13317N.m29445l(f, f2, f3, f4);
                    }
                    float f5 = g;
                    if (next.f13318O.m29457b(f5)) {
                        m29510z();
                        next.f13318O.m29452g(f5);
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
                    bVar.mo26676e();
                } else if (bVar.mo26679a()) {
                    m29510z();
                    bVar.mo26675f();
                }
            }
        }
        if (z) {
            float f6 = i;
            if (this.f13309M.f13327e.m29457b(f6)) {
                m29510z();
                this.f13309M.f13327e.m29452g(f6);
            }
            float f7 = i2;
            if (this.f13309M.f13328f.m29457b(f7)) {
                m29510z();
                this.f13309M.f13328f.m29452g(f7);
            }
            float f8 = i3;
            if (this.f13309M.f13325c.m29457b(f8)) {
                m29510z();
                this.f13309M.f13325c.m29452g(f8);
            }
            float f9 = i4;
            if (this.f13309M.f13326d.m29457b(f9)) {
                m29510z();
                this.f13309M.f13326d.m29452g(f9);
                return;
            }
            return;
        }
        this.f13309M.f13327e.m29454e(i);
        this.f13309M.f13328f.m29454e(i2);
        this.f13309M.f13325c.m29454e(i3);
        this.f13309M.f13326d.m29454e(i4);
    }

    public final void m29511y() {
        if (this.f13311O) {
            this.f13311O = false;
            C3950k kVar = this.f13314c;
            if (kVar != null) {
                kVar.m29544i(1.0f);
            }
        } else if (this.f13314c == null) {
            Iterator<C3958c<T>> it = this.f13313b.iterator();
            while (it.hasNext()) {
                C3958c<T> next = it.next();
                next.f13316M.m29453f(next.f13316M.m29455d());
                next.f13322c.m29453f(next.f13322c.m29455d());
            }
        }
    }

    public final void m29510z() {
        if (!this.f13311O) {
            this.f13311O = true;
            m29522D(false);
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
