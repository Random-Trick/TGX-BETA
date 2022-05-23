package f2;

import android.os.Build;

public final class b {
    public static final b f11790i = new a().a();
    public k f11791a;
    public boolean f11792b;
    public boolean f11793c;
    public boolean f11794d;
    public boolean f11795e;
    public long f11796f;
    public long f11797g;
    public c f11798h;

    public static final class a {
        public boolean f11799a = false;
        public boolean f11800b = false;
        public k f11801c = k.NOT_REQUIRED;
        public boolean f11802d = false;
        public boolean f11803e = false;
        public long f11804f = -1;
        public long f11805g = -1;
        public c f11806h = new c();

        public b a() {
            return new b(this);
        }

        public a b(k kVar) {
            this.f11801c = kVar;
            return this;
        }
    }

    public b() {
        this.f11791a = k.NOT_REQUIRED;
        this.f11796f = -1L;
        this.f11797g = -1L;
        this.f11798h = new c();
    }

    public c a() {
        return this.f11798h;
    }

    public k b() {
        return this.f11791a;
    }

    public long c() {
        return this.f11796f;
    }

    public long d() {
        return this.f11797g;
    }

    public boolean e() {
        return this.f11798h.c() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f11792b == bVar.f11792b && this.f11793c == bVar.f11793c && this.f11794d == bVar.f11794d && this.f11795e == bVar.f11795e && this.f11796f == bVar.f11796f && this.f11797g == bVar.f11797g && this.f11791a == bVar.f11791a) {
            return this.f11798h.equals(bVar.f11798h);
        }
        return false;
    }

    public boolean f() {
        return this.f11794d;
    }

    public boolean g() {
        return this.f11792b;
    }

    public boolean h() {
        return this.f11793c;
    }

    public int hashCode() {
        long j10 = this.f11796f;
        long j11 = this.f11797g;
        return (((((((((((((this.f11791a.hashCode() * 31) + (this.f11792b ? 1 : 0)) * 31) + (this.f11793c ? 1 : 0)) * 31) + (this.f11794d ? 1 : 0)) * 31) + (this.f11795e ? 1 : 0)) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f11798h.hashCode();
    }

    public boolean i() {
        return this.f11795e;
    }

    public void j(c cVar) {
        this.f11798h = cVar;
    }

    public void k(k kVar) {
        this.f11791a = kVar;
    }

    public void l(boolean z10) {
        this.f11794d = z10;
    }

    public void m(boolean z10) {
        this.f11792b = z10;
    }

    public void n(boolean z10) {
        this.f11793c = z10;
    }

    public void o(boolean z10) {
        this.f11795e = z10;
    }

    public void p(long j10) {
        this.f11796f = j10;
    }

    public void q(long j10) {
        this.f11797g = j10;
    }

    public b(a aVar) {
        this.f11791a = k.NOT_REQUIRED;
        this.f11796f = -1L;
        this.f11797g = -1L;
        this.f11798h = new c();
        this.f11792b = aVar.f11799a;
        int i10 = Build.VERSION.SDK_INT;
        this.f11793c = i10 >= 23 && aVar.f11800b;
        this.f11791a = aVar.f11801c;
        this.f11794d = aVar.f11802d;
        this.f11795e = aVar.f11803e;
        if (i10 >= 24) {
            this.f11798h = aVar.f11806h;
            this.f11796f = aVar.f11804f;
            this.f11797g = aVar.f11805g;
        }
    }

    public b(b bVar) {
        this.f11791a = k.NOT_REQUIRED;
        this.f11796f = -1L;
        this.f11797g = -1L;
        this.f11798h = new c();
        this.f11792b = bVar.f11792b;
        this.f11793c = bVar.f11793c;
        this.f11791a = bVar.f11791a;
        this.f11794d = bVar.f11794d;
        this.f11795e = bVar.f11795e;
        this.f11798h = bVar.f11798h;
    }
}
