package p071f2;

import android.os.Build;

public final class C4223b {
    public static final C4223b f14246i = new C4224a().m28380a();
    public EnumC4236k f14247a;
    public boolean f14248b;
    public boolean f14249c;
    public boolean f14250d;
    public boolean f14251e;
    public long f14252f;
    public long f14253g;
    public C4225c f14254h;

    public static final class C4224a {
        public boolean f14255a = false;
        public boolean f14256b = false;
        public EnumC4236k f14257c = EnumC4236k.NOT_REQUIRED;
        public boolean f14258d = false;
        public boolean f14259e = false;
        public long f14260f = -1;
        public long f14261g = -1;
        public C4225c f14262h = new C4225c();

        public C4223b m28380a() {
            return new C4223b(this);
        }

        public C4224a m28379b(EnumC4236k kVar) {
            this.f14257c = kVar;
            return this;
        }
    }

    public C4223b() {
        this.f14247a = EnumC4236k.NOT_REQUIRED;
        this.f14252f = -1L;
        this.f14253g = -1L;
        this.f14254h = new C4225c();
    }

    public C4225c m28397a() {
        return this.f14254h;
    }

    public EnumC4236k m28396b() {
        return this.f14247a;
    }

    public long m28395c() {
        return this.f14252f;
    }

    public long m28394d() {
        return this.f14253g;
    }

    public boolean m28393e() {
        return this.f14254h.m28376c() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4223b.class != obj.getClass()) {
            return false;
        }
        C4223b bVar = (C4223b) obj;
        if (this.f14248b == bVar.f14248b && this.f14249c == bVar.f14249c && this.f14250d == bVar.f14250d && this.f14251e == bVar.f14251e && this.f14252f == bVar.f14252f && this.f14253g == bVar.f14253g && this.f14247a == bVar.f14247a) {
            return this.f14254h.equals(bVar.f14254h);
        }
        return false;
    }

    public boolean m28392f() {
        return this.f14250d;
    }

    public boolean m28391g() {
        return this.f14248b;
    }

    public boolean m28390h() {
        return this.f14249c;
    }

    public int hashCode() {
        long j = this.f14252f;
        long j2 = this.f14253g;
        return (((((((((((((this.f14247a.hashCode() * 31) + (this.f14248b ? 1 : 0)) * 31) + (this.f14249c ? 1 : 0)) * 31) + (this.f14250d ? 1 : 0)) * 31) + (this.f14251e ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f14254h.hashCode();
    }

    public boolean m28389i() {
        return this.f14251e;
    }

    public void m28388j(C4225c cVar) {
        this.f14254h = cVar;
    }

    public void m28387k(EnumC4236k kVar) {
        this.f14247a = kVar;
    }

    public void m28386l(boolean z) {
        this.f14250d = z;
    }

    public void m28385m(boolean z) {
        this.f14248b = z;
    }

    public void m28384n(boolean z) {
        this.f14249c = z;
    }

    public void m28383o(boolean z) {
        this.f14251e = z;
    }

    public void m28382p(long j) {
        this.f14252f = j;
    }

    public void m28381q(long j) {
        this.f14253g = j;
    }

    public C4223b(C4224a aVar) {
        this.f14247a = EnumC4236k.NOT_REQUIRED;
        this.f14252f = -1L;
        this.f14253g = -1L;
        this.f14254h = new C4225c();
        this.f14248b = aVar.f14255a;
        int i = Build.VERSION.SDK_INT;
        this.f14249c = i >= 23 && aVar.f14256b;
        this.f14247a = aVar.f14257c;
        this.f14250d = aVar.f14258d;
        this.f14251e = aVar.f14259e;
        if (i >= 24) {
            this.f14254h = aVar.f14262h;
            this.f14252f = aVar.f14260f;
            this.f14253g = aVar.f14261g;
        }
    }

    public C4223b(C4223b bVar) {
        this.f14247a = EnumC4236k.NOT_REQUIRED;
        this.f14252f = -1L;
        this.f14253g = -1L;
        this.f14254h = new C4225c();
        this.f14248b = bVar.f14248b;
        this.f14249c = bVar.f14249c;
        this.f14247a = bVar.f14247a;
        this.f14250d = bVar.f14250d;
        this.f14251e = bVar.f14251e;
        this.f14254h = bVar.f14254h;
    }
}
