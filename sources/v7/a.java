package v7;

import z5.d0;
import z5.f0;

public final class a {
    public static final a f24740p = new C0230a().a();
    public final long f24741a;
    public final String f24742b;
    public final String f24743c;
    public final c f24744d;
    public final d f24745e;
    public final String f24746f;
    public final String f24747g;
    public final int f24748h;
    public final int f24749i;
    public final String f24750j;
    public final long f24751k;
    public final b f24752l;
    public final String f24753m;
    public final long f24754n;
    public final String f24755o;

    public static final class C0230a {
        public long f24756a = 0;
        public String f24757b = "";
        public String f24758c = "";
        public c f24759d = c.UNKNOWN;
        public d f24760e = d.UNKNOWN_OS;
        public String f24761f = "";
        public String f24762g = "";
        public int f24763h = 0;
        public int f24764i = 0;
        public String f24765j = "";
        public long f24766k = 0;
        public b f24767l = b.UNKNOWN_EVENT;
        public String f24768m = "";
        public long f24769n = 0;
        public String f24770o = "";

        public a a() {
            return new a(this.f24756a, this.f24757b, this.f24758c, this.f24759d, this.f24760e, this.f24761f, this.f24762g, this.f24763h, this.f24764i, this.f24765j, this.f24766k, this.f24767l, this.f24768m, this.f24769n, this.f24770o);
        }

        public C0230a b(String str) {
            this.f24768m = str;
            return this;
        }

        public C0230a c(String str) {
            this.f24762g = str;
            return this;
        }

        public C0230a d(String str) {
            this.f24770o = str;
            return this;
        }

        public C0230a e(b bVar) {
            this.f24767l = bVar;
            return this;
        }

        public C0230a f(String str) {
            this.f24758c = str;
            return this;
        }

        public C0230a g(String str) {
            this.f24757b = str;
            return this;
        }

        public C0230a h(c cVar) {
            this.f24759d = cVar;
            return this;
        }

        public C0230a i(String str) {
            this.f24761f = str;
            return this;
        }

        public C0230a j(long j10) {
            this.f24756a = j10;
            return this;
        }

        public C0230a k(d dVar) {
            this.f24760e = dVar;
            return this;
        }

        public C0230a l(String str) {
            this.f24765j = str;
            return this;
        }

        public C0230a m(int i10) {
            this.f24764i = i10;
            return this;
        }
    }

    public enum b implements d0 {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        
        public final int f24773a;

        b(int i10) {
            this.f24773a = i10;
        }

        @Override
        public int a() {
            return this.f24773a;
        }
    }

    public enum c implements d0 {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        
        public final int f24776a;

        c(int i10) {
            this.f24776a = i10;
        }

        @Override
        public int a() {
            return this.f24776a;
        }
    }

    public enum d implements d0 {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        
        public final int f24779a;

        d(int i10) {
            this.f24779a = i10;
        }

        @Override
        public int a() {
            return this.f24779a;
        }
    }

    public a(long j10, String str, String str2, c cVar, d dVar, String str3, String str4, int i10, int i11, String str5, long j11, b bVar, String str6, long j12, String str7) {
        this.f24741a = j10;
        this.f24742b = str;
        this.f24743c = str2;
        this.f24744d = cVar;
        this.f24745e = dVar;
        this.f24746f = str3;
        this.f24747g = str4;
        this.f24748h = i10;
        this.f24749i = i11;
        this.f24750j = str5;
        this.f24751k = j11;
        this.f24752l = bVar;
        this.f24753m = str6;
        this.f24754n = j12;
        this.f24755o = str7;
    }

    public static C0230a p() {
        return new C0230a();
    }

    @f0(zza = 13)
    public String a() {
        return this.f24753m;
    }

    @f0(zza = 11)
    public long b() {
        return this.f24751k;
    }

    @f0(zza = 14)
    public long c() {
        return this.f24754n;
    }

    @f0(zza = 7)
    public String d() {
        return this.f24747g;
    }

    @f0(zza = 15)
    public String e() {
        return this.f24755o;
    }

    @f0(zza = 12)
    public b f() {
        return this.f24752l;
    }

    @f0(zza = 3)
    public String g() {
        return this.f24743c;
    }

    @f0(zza = 2)
    public String h() {
        return this.f24742b;
    }

    @f0(zza = 4)
    public c i() {
        return this.f24744d;
    }

    @f0(zza = 6)
    public String j() {
        return this.f24746f;
    }

    @f0(zza = 8)
    public int k() {
        return this.f24748h;
    }

    @f0(zza = 1)
    public long l() {
        return this.f24741a;
    }

    @f0(zza = 5)
    public d m() {
        return this.f24745e;
    }

    @f0(zza = 10)
    public String n() {
        return this.f24750j;
    }

    @f0(zza = 9)
    public int o() {
        return this.f24749i;
    }
}
