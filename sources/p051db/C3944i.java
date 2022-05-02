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

        public void mo29473b(C3947c<T> cVar, boolean z) {
            long j = this.f13281a;
            if (j != 0 && j < this.f13282b) {
                cVar.f13287c.m29455f(-1.0f);
            } else if (j > this.f13282b) {
                cVar.f13287c.m29455f(1.0f);
            }
            cVar.f13284M = 0;
        }

        public void mo29474a(C3947c<T> cVar) {
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
        T mo23042a(String str);

        void mo23041b(C3944i<?> iVar);
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
        public boolean mo26680a() {
            return this.f13287c.m29459b(this.f13284M);
        }

        @Override
        public void mo26679b(boolean z) {
            this.f13287c.m29458c(z);
        }

        @Override
        public boolean mo26678c(float f) {
            return this.f13287c.m29460a(f);
        }

        @Override
        public int mo7991d(boolean z) {
            return C3962o.m29472a(this, z);
        }

        @Override
        public void mo26677e() {
            this.f13287c.m29456e(this.f13284M);
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
        public void mo26676f() {
            this.f13287c.m29454g(this.f13284M);
        }

        @Override
        public int mo7990g(boolean z) {
            return C3962o.m29471b(this, z);
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
            return Objects.hash(Integer.valueOf(this.f13285a), this.f13286b.mo22957a());
        }

        public float m29561j() {
            return this.f13287c.m29457d();
        }
    }

    public interface AbstractC3948d {
        String mo22957a();

        int getHeight();

        int getWidth();
    }

    public C3944i(final AbstractC3946b<T> bVar) {
        this.f13278a = bVar;
        this.f13279b = new C3955n<>(new C3955n.AbstractC3957b() {
            @Override
            public final void mo26894a(C3955n nVar) {
                C3944i.this.m29569r(bVar, nVar);
            }
        }, C2057b.f7280b, 180L);
    }

    public void m29569r(AbstractC3946b bVar, C3955n nVar) {
        bVar.mo23041b(this);
    }

    public float m29571i() {
        return this.f13279b.m29518t().m29477k();
    }

    @Override
    public Iterator<C3955n.C3958c<C3947c<T>>> iterator() {
        return this.f13279b.iterator();
    }

    public void m29570m(boolean z) {
        m29567t(0L, null, z);
    }

    public void m29568s(long j, String str, boolean z) {
        m29567t(j, m29566u(str), z);
    }

    public final void m29567t(long j, List<C3947c<T>> list, boolean z) {
        boolean z2 = list != null && !list.isEmpty();
        long j2 = this.f13280c;
        if (j2 != j || this.f13277M != z2) {
            this.f13280c = j;
            this.f13277M = z2;
            if (z2) {
                this.f13279b.m29525C(list, z, new C3945a(j2, j));
            } else {
                this.f13279b.m29526B(null, z);
            }
        }
    }

    public final List<C3947c<T>> m29566u(String str) {
        if (C5070i.m24062i(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(str.length());
        int i = 0;
        while (i < str.length()) {
            int charCount = Character.charCount(str.codePointAt(i)) + i;
            arrayList.add(new C3947c(arrayList.size(), this.f13278a.mo23042a(str.substring(i, charCount))));
            i = charCount;
        }
        return arrayList;
    }
}
