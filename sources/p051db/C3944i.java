package p051db;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p037cb.C2057b;
import p051db.C3944i.AbstractC3948d;
import p051db.C3955n;
import p108hb.C5070i;

public class C3944i<T extends AbstractC3948d> implements Iterable<C3955n.C3958c<C3947c<T>>> {
    public boolean f13277M;
    public final AbstractC3946b<T> f13278a;
    public final C3955n<C3947c<T>> f13279b;
    public long f13280c;

    public class C3945a implements C3955n.AbstractC3961f<C3947c<T>> {
        public final long f13281a;
        public final long f13282b;

        public C3945a(long j, long j2) {
            this.f13281a = j;
            this.f13282b = j2;
        }

        public void mo29471b(C3947c<T> cVar, boolean z) {
            long j = this.f13281a;
            if (j != 0 && j < this.f13282b) {
                cVar.f13287c.m29453f(-1.0f);
            } else if (j > this.f13282b) {
                cVar.f13287c.m29453f(1.0f);
            }
            cVar.f13284M = 0;
        }

        public void mo29472a(C3947c<T> cVar) {
            long j = this.f13282b;
            if (j == 0) {
                cVar.f13284M = 0;
                return;
            }
            long j2 = this.f13281a;
            if (j2 < j) {
                cVar.f13284M = 1;
            } else if (j2 > j) {
                cVar.f13284M = -1;
            }
        }
    }

    public interface AbstractC3946b<T extends AbstractC3948d> {
        T mo23041a(String str);

        void mo23040b(C3944i<?> iVar);
    }

    public static class C3947c<T extends AbstractC3948d> implements C3955n.AbstractC3959d, AbstractC3936b {
        public final int f13285a;
        public final T f13286b;
        public final C3967s f13287c = new C3967s(0.0f);
        public int f13284M = 0;

        public C3947c(int i, T t) {
            this.f13285a = i;
            this.f13286b = t;
        }

        @Override
        public boolean mo26679a() {
            return this.f13287c.m29457b(this.f13284M);
        }

        @Override
        public void mo26678b(boolean z) {
            this.f13287c.m29456c(z);
        }

        @Override
        public boolean mo26677c(float f) {
            return this.f13287c.m29458a(f);
        }

        @Override
        public int mo7991d(boolean z) {
            return C3962o.m29470a(this, z);
        }

        @Override
        public void mo26676e() {
            this.f13287c.m29454e(this.f13284M);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C3947c cVar = (C3947c) obj;
            return this.f13285a == cVar.f13285a && this.f13286b.equals(cVar.f13286b);
        }

        @Override
        public void mo26675f() {
            this.f13287c.m29452g(this.f13284M);
        }

        @Override
        public int mo7990g(boolean z) {
            return C3962o.m29469b(this, z);
        }

        @Override
        public int getHeight() {
            return this.f13286b.getHeight();
        }

        @Override
        public int getWidth() {
            return this.f13286b.getWidth();
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f13285a), this.f13286b.mo22956a());
        }

        public float m29559j() {
            return this.f13287c.m29455d();
        }
    }

    public interface AbstractC3948d {
        String mo22956a();

        int getHeight();

        int getWidth();
    }

    public C3944i(final AbstractC3946b<T> bVar) {
        this.f13278a = bVar;
        this.f13279b = new C3955n<>(new C3955n.AbstractC3957b() {
            @Override
            public final void mo26892a(C3955n nVar) {
                C3944i.this.m29567r(bVar, nVar);
            }
        }, C2057b.f7280b, 180L);
    }

    public void m29567r(AbstractC3946b bVar, C3955n nVar) {
        bVar.mo23040b(this);
    }

    public float m29569i() {
        return this.f13279b.m29516t().m29475k();
    }

    @Override
    public Iterator<C3955n.C3958c<C3947c<T>>> iterator() {
        return this.f13279b.iterator();
    }

    public void m29568m(boolean z) {
        m29565t(0L, null, z);
    }

    public void m29566s(long j, String str, boolean z) {
        m29565t(j, m29564u(str), z);
    }

    public final void m29565t(long j, List<C3947c<T>> list, boolean z) {
        boolean z2 = list != null && !list.isEmpty();
        long j2 = this.f13280c;
        if (j2 != j || this.f13277M != z2) {
            this.f13280c = j;
            this.f13277M = z2;
            if (z2) {
                this.f13279b.m29523C(list, z, new C3945a(j2, j));
            } else {
                this.f13279b.m29524B(null, z);
            }
        }
    }

    public final List<C3947c<T>> m29564u(String str) {
        if (C5070i.m24061i(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(str.length());
        int i = 0;
        while (i < str.length()) {
            int charCount = Character.charCount(str.codePointAt(i)) + i;
            arrayList.add(new C3947c(arrayList.size(), this.f13278a.mo23041a(str.substring(i, charCount))));
            i = charCount;
        }
        return arrayList;
    }
}
