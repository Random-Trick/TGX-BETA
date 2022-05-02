package p287u7;

import p342y5.AbstractC10394d0;
import p342y5.AbstractC10398f0;

public final class C9452a {
    public static final C9452a f30634p = new C9453a().m8603a();
    public final long f30635a;
    public final String f30636b;
    public final String f30637c;
    public final EnumC9455c f30638d;
    public final EnumC9456d f30639e;
    public final String f30640f;
    public final String f30641g;
    public final int f30642h;
    public final int f30643i;
    public final String f30644j;
    public final long f30645k;
    public final EnumC9454b f30646l;
    public final String f30647m;
    public final long f30648n;
    public final String f30649o;

    public static final class C9453a {
        public long f30650a = 0;
        public String f30651b = "";
        public String f30652c = "";
        public EnumC9455c f30653d = EnumC9455c.UNKNOWN;
        public EnumC9456d f30654e = EnumC9456d.UNKNOWN_OS;
        public String f30655f = "";
        public String f30656g = "";
        public int f30657h = 0;
        public int f30658i = 0;
        public String f30659j = "";
        public long f30660k = 0;
        public EnumC9454b f30661l = EnumC9454b.UNKNOWN_EVENT;
        public String f30662m = "";
        public long f30663n = 0;
        public String f30664o = "";

        public C9452a m8603a() {
            return new C9452a(this.f30650a, this.f30651b, this.f30652c, this.f30653d, this.f30654e, this.f30655f, this.f30656g, this.f30657h, this.f30658i, this.f30659j, this.f30660k, this.f30661l, this.f30662m, this.f30663n, this.f30664o);
        }

        public C9453a m8602b(String str) {
            this.f30662m = str;
            return this;
        }

        public C9453a m8601c(String str) {
            this.f30656g = str;
            return this;
        }

        public C9453a m8600d(String str) {
            this.f30664o = str;
            return this;
        }

        public C9453a m8599e(EnumC9454b bVar) {
            this.f30661l = bVar;
            return this;
        }

        public C9453a m8598f(String str) {
            this.f30652c = str;
            return this;
        }

        public C9453a m8597g(String str) {
            this.f30651b = str;
            return this;
        }

        public C9453a m8596h(EnumC9455c cVar) {
            this.f30653d = cVar;
            return this;
        }

        public C9453a m8595i(String str) {
            this.f30655f = str;
            return this;
        }

        public C9453a m8594j(long j) {
            this.f30650a = j;
            return this;
        }

        public C9453a m8593k(EnumC9456d dVar) {
            this.f30654e = dVar;
            return this;
        }

        public C9453a m8592l(String str) {
            this.f30659j = str;
            return this;
        }

        public C9453a m8591m(int i) {
            this.f30658i = i;
            return this;
        }
    }

    public enum EnumC9454b implements AbstractC10394d0 {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        
        public final int f30669a;

        EnumC9454b(int i) {
            this.f30669a = i;
        }

        @Override
        public int mo5173a() {
            return this.f30669a;
        }
    }

    public enum EnumC9455c implements AbstractC10394d0 {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        
        public final int f30675a;

        EnumC9455c(int i) {
            this.f30675a = i;
        }

        @Override
        public int mo5173a() {
            return this.f30675a;
        }
    }

    public enum EnumC9456d implements AbstractC10394d0 {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        
        public final int f30681a;

        EnumC9456d(int i) {
            this.f30681a = i;
        }

        @Override
        public int mo5173a() {
            return this.f30681a;
        }
    }

    public C9452a(long j, String str, String str2, EnumC9455c cVar, EnumC9456d dVar, String str3, String str4, int i, int i2, String str5, long j2, EnumC9454b bVar, String str6, long j3, String str7) {
        this.f30635a = j;
        this.f30636b = str;
        this.f30637c = str2;
        this.f30638d = cVar;
        this.f30639e = dVar;
        this.f30640f = str3;
        this.f30641g = str4;
        this.f30642h = i;
        this.f30643i = i2;
        this.f30644j = str5;
        this.f30645k = j2;
        this.f30646l = bVar;
        this.f30647m = str6;
        this.f30648n = j3;
        this.f30649o = str7;
    }

    public static C9453a m8604p() {
        return new C9453a();
    }

    @AbstractC10398f0(zza = 13)
    public String m8619a() {
        return this.f30647m;
    }

    @AbstractC10398f0(zza = 11)
    public long m8618b() {
        return this.f30645k;
    }

    @AbstractC10398f0(zza = 14)
    public long m8617c() {
        return this.f30648n;
    }

    @AbstractC10398f0(zza = 7)
    public String m8616d() {
        return this.f30641g;
    }

    @AbstractC10398f0(zza = 15)
    public String m8615e() {
        return this.f30649o;
    }

    @AbstractC10398f0(zza = 12)
    public EnumC9454b m8614f() {
        return this.f30646l;
    }

    @AbstractC10398f0(zza = 3)
    public String m8613g() {
        return this.f30637c;
    }

    @AbstractC10398f0(zza = 2)
    public String m8612h() {
        return this.f30636b;
    }

    @AbstractC10398f0(zza = 4)
    public EnumC9455c m8611i() {
        return this.f30638d;
    }

    @AbstractC10398f0(zza = 6)
    public String m8610j() {
        return this.f30640f;
    }

    @AbstractC10398f0(zza = 8)
    public int m8609k() {
        return this.f30642h;
    }

    @AbstractC10398f0(zza = 1)
    public long m8608l() {
        return this.f30635a;
    }

    @AbstractC10398f0(zza = 5)
    public EnumC9456d m8607m() {
        return this.f30639e;
    }

    @AbstractC10398f0(zza = 10)
    public String m8606n() {
        return this.f30644j;
    }

    @AbstractC10398f0(zza = 9)
    public int m8605o() {
        return this.f30643i;
    }
}
