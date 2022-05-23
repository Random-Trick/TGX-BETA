package eb;

import eb.i.d;
import eb.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class i<T extends d> implements Iterable<n.c<c<T>>> {
    public boolean M;
    public final b<T> f11445a;
    public final n<c<T>> f11446b;
    public long f11447c;

    public class a implements n.f<c<T>> {
        public final long f11448a;
        public final long f11449b;

        public a(long j10, long j11) {
            this.f11448a = j10;
            this.f11449b = j11;
        }

        public void b(c<T> cVar, boolean z10) {
            long j10 = this.f11448a;
            if (j10 != 0 && j10 < this.f11449b) {
                cVar.f11453c.f(-1.0f);
            } else if (j10 > this.f11449b) {
                cVar.f11453c.f(1.0f);
            }
            cVar.M = 0;
        }

        public void a(c<T> cVar) {
            long j10 = this.f11449b;
            if (j10 == 0) {
                cVar.M = 0;
                return;
            }
            long j11 = this.f11448a;
            if (j11 < j10) {
                cVar.M = 1;
            } else if (j11 > j10) {
                cVar.M = -1;
            }
        }
    }

    public interface b<T extends d> {
        void a(i<?> iVar);

        T b(String str);
    }

    public static class c<T extends d> implements n.d, eb.b {
        public final int f11451a;
        public final T f11452b;
        public final s f11453c = new s(0.0f);
        public int M = 0;

        public c(int i10, T t10) {
            this.f11451a = i10;
            this.f11452b = t10;
        }

        @Override
        public boolean a() {
            return this.f11453c.b(this.M);
        }

        @Override
        public void b(boolean z10) {
            this.f11453c.c(z10);
        }

        @Override
        public boolean c(float f10) {
            return this.f11453c.a(f10);
        }

        @Override
        public int d(boolean z10) {
            return o.a(this, z10);
        }

        @Override
        public void e() {
            this.f11453c.e(this.M);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f11451a == cVar.f11451a && this.f11452b.equals(cVar.f11452b);
        }

        @Override
        public void f() {
            this.f11453c.g(this.M);
        }

        @Override
        public int g(boolean z10) {
            return o.b(this, z10);
        }

        @Override
        public int getHeight() {
            return this.f11452b.getHeight();
        }

        @Override
        public int getWidth() {
            return this.f11452b.getWidth();
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f11451a), this.f11452b.a());
        }

        public float j() {
            return this.f11453c.d();
        }
    }

    public interface d {
        String a();

        int getHeight();

        int getWidth();
    }

    public i(final b<T> bVar) {
        this.f11445a = bVar;
        this.f11446b = new n<>(new n.b() {
            @Override
            public final void a(n nVar) {
                i.this.r(bVar, nVar);
            }
        }, db.b.f7287b, 180L);
    }

    public void r(b bVar, n nVar) {
        bVar.a(this);
    }

    public float g() {
        return this.f11446b.t().k();
    }

    @Override
    public Iterator<n.c<c<T>>> iterator() {
        return this.f11446b.iterator();
    }

    public void m(boolean z10) {
        t(0L, null, z10);
    }

    public void s(long j10, String str, boolean z10) {
        t(j10, u(str), z10);
    }

    public final void t(long j10, List<c<T>> list, boolean z10) {
        boolean z11 = list != null && !list.isEmpty();
        long j11 = this.f11447c;
        if (j11 != j10 || this.M != z11) {
            this.f11447c = j10;
            this.M = z11;
            if (z11) {
                this.f11446b.C(list, z10, new a(j11, j10));
            } else {
                this.f11446b.B(null, z10);
            }
        }
    }

    public final List<c<T>> u(String str) {
        if (ib.i.i(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(str.length());
        int i10 = 0;
        while (i10 < str.length()) {
            int charCount = Character.charCount(str.codePointAt(i10)) + i10;
            arrayList.add(new c(arrayList.size(), this.f11445a.b(str.substring(i10, charCount))));
            i10 = charCount;
        }
        return arrayList;
    }
}
