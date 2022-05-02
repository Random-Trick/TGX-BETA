package p287u7;

import p342y5.AbstractC10394d0;
import p342y5.AbstractC10398f0;

public final class C9452a {
    public static final C9452a f30631p = new C9453a().m8603a();
    public final long f30632a;
    public final String f30633b;
    public final String f30634c;
    public final EnumC9455c f30635d;
    public final EnumC9456d f30636e;
    public final String f30637f;
    public final String f30638g;
    public final int f30639h;
    public final int f30640i;
    public final String f30641j;
    public final long f30642k;
    public final EnumC9454b f30643l;
    public final String f30644m;
    public final long f30645n;
    public final String f30646o;

    public static final class C9453a {
        public long f30647a = 0;
        public String f30648b = "";
        public String f30649c = "";
        public EnumC9455c f30650d = EnumC9455c.UNKNOWN;
        public EnumC9456d f30651e = EnumC9456d.UNKNOWN_OS;
        public String f30652f = "";
        public String f30653g = "";
        public int f30654h = 0;
        public int f30655i = 0;
        public String f30656j = "";
        public long f30657k = 0;
        public EnumC9454b f30658l = EnumC9454b.UNKNOWN_EVENT;
        public String f30659m = "";
        public long f30660n = 0;
        public String f30661o = "";

        public C9452a m8603a() {
            return new C9452a(this.f30647a, this.f30648b, this.f30649c, this.f30650d, this.f30651e, this.f30652f, this.f30653g, this.f30654h, this.f30655i, this.f30656j, this.f30657k, this.f30658l, this.f30659m, this.f30660n, this.f30661o);
        }

        public C9453a m8602b(String str) {
            this.f30659m = str;
            return this;
        }

        public C9453a m8601c(String str) {
            this.f30653g = str;
            return this;
        }

        public C9453a m8600d(String str) {
            this.f30661o = str;
            return this;
        }

        public C9453a m8599e(EnumC9454b bVar) {
            this.f30658l = bVar;
            return this;
        }

        public C9453a m8598f(String str) {
            this.f30649c = str;
            return this;
        }

        public C9453a m8597g(String str) {
            this.f30648b = str;
            return this;
        }

        public C9453a m8596h(EnumC9455c cVar) {
            this.f30650d = cVar;
            return this;
        }

        public C9453a m8595i(String str) {
            this.f30652f = str;
            return this;
        }

        public C9453a m8594j(long j) {
            this.f30647a = j;
            return this;
        }

        public C9453a m8593k(EnumC9456d dVar) {
            this.f30651e = dVar;
            return this;
        }

        public C9453a m8592l(String str) {
            this.f30656j = str;
            return this;
        }

        public C9453a m8591m(int i) {
            this.f30655i = i;
            return this;
        }
    }

    public enum EnumC9454b implements AbstractC10394d0 {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        
        public final int f30666a;

        EnumC9454b(int i) {
            this.f30666a = i;
        }

        @Override
        public int mo5173a() {
            return this.f30666a;
        }
    }

    public enum EnumC9455c implements AbstractC10394d0 {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        
        public final int f30672a;

        EnumC9455c(int i) {
            this.f30672a = i;
        }

        @Override
        public int mo5173a() {
            return this.f30672a;
        }
    }

    public enum EnumC9456d implements AbstractC10394d0 {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        
        public final int f30678a;

        EnumC9456d(int i) {
            this.f30678a = i;
        }

        @Override
        public int mo5173a() {
            return this.f30678a;
        }
    }

    public C9452a(long j, String str, String str2, EnumC9455c cVar, EnumC9456d dVar, String str3, String str4, int i, int i2, String str5, long j2, EnumC9454b bVar, String str6, long j3, String str7) {
        this.f30632a = j;
        this.f30633b = str;
        this.f30634c = str2;
        this.f30635d = cVar;
        this.f30636e = dVar;
        this.f30637f = str3;
        this.f30638g = str4;
        this.f30639h = i;
        this.f30640i = i2;
        this.f30641j = str5;
        this.f30642k = j2;
        this.f30643l = bVar;
        this.f30644m = str6;
        this.f30645n = j3;
        this.f30646o = str7;
    }

    public static C9453a m8604p() {
        return new C9453a();
    }

    @AbstractC10398f0(zza = 13)
    public String m8619a() {
        return this.f30644m;
    }

    @AbstractC10398f0(zza = 11)
    public long m8618b() {
        return this.f30642k;
    }

    @AbstractC10398f0(zza = 14)
    public long m8617c() {
        return this.f30645n;
    }

    @AbstractC10398f0(zza = 7)
    public String m8616d() {
        return this.f30638g;
    }

    @AbstractC10398f0(zza = 15)
    public String m8615e() {
        return this.f30646o;
    }

    @AbstractC10398f0(zza = 12)
    public EnumC9454b m8614f() {
        return this.f30643l;
    }

    @AbstractC10398f0(zza = 3)
    public String m8613g() {
        return this.f30634c;
    }

    @AbstractC10398f0(zza = 2)
    public String m8612h() {
        return this.f30633b;
    }

    @AbstractC10398f0(zza = 4)
    public EnumC9455c m8611i() {
        return this.f30635d;
    }

    @AbstractC10398f0(zza = 6)
    public String m8610j() {
        return this.f30637f;
    }

    @AbstractC10398f0(zza = 8)
    public int m8609k() {
        return this.f30639h;
    }

    @AbstractC10398f0(zza = 1)
    public long m8608l() {
        return this.f30632a;
    }

    @AbstractC10398f0(zza = 5)
    public EnumC9456d m8607m() {
        return this.f30636e;
    }

    @AbstractC10398f0(zza = 10)
    public String m8606n() {
        return this.f30641j;
    }

    @AbstractC10398f0(zza = 9)
    public int m8605o() {
        return this.f30640i;
    }
}
