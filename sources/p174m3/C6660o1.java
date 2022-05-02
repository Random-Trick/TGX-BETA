package p174m3;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p020b5.C1186a;
import p020b5.C1216l0;
import p174m3.AbstractC6609h;
import p358z6.AbstractC11396q;
import p358z6.AbstractC11401r;

public final class C6660o1 implements AbstractC6609h {
    public static final C6660o1 f20809Q = new C6663c().m19638a();
    public static final AbstractC6609h.AbstractC6610a<C6660o1> f20810R = C6653n1.f20784a;
    public final C6669g f20811M;
    public final C6693s1 f20812N;
    public final C6664d f20813O;
    @Deprecated
    public final C6666e f20814P;
    public final String f20815a;
    public final C6671h f20816b;
    @Deprecated
    public final C6672i f20817c;

    public static final class C6662b {
    }

    public static final class C6663c {
        public String f20818a;
        public Uri f20819b;
        public String f20820c;
        public C6664d.C6665a f20821d;
        public C6667f.C6668a f20822e;
        public List<Object> f20823f;
        public String f20824g;
        public AbstractC11396q<C6674k> f20825h;
        public C6662b f20826i;
        public Object f20827j;
        public C6693s1 f20828k;
        public C6669g.C6670a f20829l;

        public C6660o1 m19638a() {
            C6672i iVar;
            C1186a.m38187f(this.f20822e.f20855b == null || this.f20822e.f20854a != null);
            Uri uri = this.f20819b;
            C6667f fVar = null;
            if (uri != null) {
                String str = this.f20820c;
                if (this.f20822e.f20854a != null) {
                    fVar = this.f20822e.m19606i();
                }
                iVar = new C6672i(uri, str, fVar, this.f20826i, this.f20823f, this.f20824g, this.f20825h, this.f20827j);
            } else {
                iVar = null;
            }
            String str2 = this.f20818a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            C6666e g = this.f20821d.m19623g();
            C6669g f = this.f20829l.m19596f();
            C6693s1 s1Var = this.f20828k;
            if (s1Var == null) {
                s1Var = C6693s1.f20948q0;
            }
            return new C6660o1(str3, g, iVar, f, s1Var);
        }

        public C6663c m19637b(String str) {
            this.f20824g = str;
            return this;
        }

        public C6663c m19636c(String str) {
            this.f20818a = (String) C1186a.m38188e(str);
            return this;
        }

        public C6663c m19635d(Object obj) {
            this.f20827j = obj;
            return this;
        }

        public C6663c m19634e(Uri uri) {
            this.f20819b = uri;
            return this;
        }

        public C6663c() {
            this.f20821d = new C6664d.C6665a();
            this.f20822e = new C6667f.C6668a();
            this.f20823f = Collections.emptyList();
            this.f20825h = AbstractC11396q.m768D();
            this.f20829l = new C6669g.C6670a();
        }

        public C6663c(C6660o1 o1Var) {
            this();
            C6667f.C6668a aVar;
            this.f20821d = o1Var.f20813O.m19632b();
            this.f20818a = o1Var.f20815a;
            this.f20828k = o1Var.f20812N;
            this.f20829l = o1Var.f20811M.m19604b();
            C6671h hVar = o1Var.f20816b;
            if (hVar != null) {
                this.f20824g = hVar.f20879f;
                this.f20820c = hVar.f20875b;
                this.f20819b = hVar.f20874a;
                this.f20823f = hVar.f20878e;
                this.f20825h = hVar.f20880g;
                this.f20827j = hVar.f20882i;
                C6667f fVar = hVar.f20876c;
                if (fVar != null) {
                    aVar = fVar.m19616b();
                } else {
                    aVar = new C6667f.C6668a();
                }
                this.f20822e = aVar;
            }
        }
    }

    public static class C6664d implements AbstractC6609h {
        public static final C6664d f20830O = new C6665a().m19624f();
        public static final AbstractC6609h.AbstractC6610a<C6666e> f20831P = C6679p1.f20905a;
        public final boolean f20832M;
        public final boolean f20833N;
        public final long f20834a;
        public final long f20835b;
        public final boolean f20836c;

        public static final class C6665a {
            public long f20837a;
            public long f20838b;
            public boolean f20839c;
            public boolean f20840d;
            public boolean f20841e;

            public C6664d m19624f() {
                return m19623g();
            }

            @Deprecated
            public C6666e m19623g() {
                return new C6666e(this);
            }

            public C6665a m19622h(long j) {
                C1186a.m38192a(j == Long.MIN_VALUE || j >= 0);
                this.f20838b = j;
                return this;
            }

            public C6665a m19621i(boolean z) {
                this.f20840d = z;
                return this;
            }

            public C6665a m19620j(boolean z) {
                this.f20839c = z;
                return this;
            }

            public C6665a m19619k(long j) {
                C1186a.m38192a(j >= 0);
                this.f20837a = j;
                return this;
            }

            public C6665a m19618l(boolean z) {
                this.f20841e = z;
                return this;
            }

            public C6665a() {
                this.f20838b = Long.MIN_VALUE;
            }

            public C6665a(C6664d dVar) {
                this.f20837a = dVar.f20834a;
                this.f20838b = dVar.f20835b;
                this.f20839c = dVar.f20836c;
                this.f20840d = dVar.f20832M;
                this.f20841e = dVar.f20833N;
            }
        }

        public static String m19631c(int i) {
            return Integer.toString(i, 36);
        }

        public static C6666e m19630d(Bundle bundle) {
            return new C6665a().m19619k(bundle.getLong(m19631c(0), 0L)).m19622h(bundle.getLong(m19631c(1), Long.MIN_VALUE)).m19620j(bundle.getBoolean(m19631c(2), false)).m19621i(bundle.getBoolean(m19631c(3), false)).m19618l(bundle.getBoolean(m19631c(4), false)).m19623g();
        }

        public C6665a m19632b() {
            return new C6665a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6664d)) {
                return false;
            }
            C6664d dVar = (C6664d) obj;
            return this.f20834a == dVar.f20834a && this.f20835b == dVar.f20835b && this.f20836c == dVar.f20836c && this.f20832M == dVar.f20832M && this.f20833N == dVar.f20833N;
        }

        public int hashCode() {
            long j = this.f20834a;
            long j2 = this.f20835b;
            return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f20836c ? 1 : 0)) * 31) + (this.f20832M ? 1 : 0)) * 31) + (this.f20833N ? 1 : 0);
        }

        public C6664d(C6665a aVar) {
            this.f20834a = aVar.f20837a;
            this.f20835b = aVar.f20838b;
            this.f20836c = aVar.f20839c;
            this.f20832M = aVar.f20840d;
            this.f20833N = aVar.f20841e;
        }
    }

    @Deprecated
    public static final class C6666e extends C6664d {
        public static final C6666e f20842Q = new C6664d.C6665a().m19623g();

        public C6666e(C6664d.C6665a aVar) {
            super(aVar);
        }
    }

    public static final class C6667f {
        public final UUID f20843a;
        @Deprecated
        public final UUID f20844b;
        public final Uri f20845c;
        @Deprecated
        public final AbstractC11401r<String, String> f20846d;
        public final AbstractC11401r<String, String> f20847e;
        public final boolean f20848f;
        public final boolean f20849g;
        public final boolean f20850h;
        @Deprecated
        public final AbstractC11396q<Integer> f20851i;
        public final AbstractC11396q<Integer> f20852j;
        public final byte[] f20853k;

        public C6668a m19616b() {
            return new C6668a();
        }

        public byte[] m19615c() {
            byte[] bArr = this.f20853k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6667f)) {
                return false;
            }
            C6667f fVar = (C6667f) obj;
            return this.f20843a.equals(fVar.f20843a) && C1216l0.m37985c(this.f20845c, fVar.f20845c) && C1216l0.m37985c(this.f20847e, fVar.f20847e) && this.f20848f == fVar.f20848f && this.f20850h == fVar.f20850h && this.f20849g == fVar.f20849g && this.f20852j.equals(fVar.f20852j) && Arrays.equals(this.f20853k, fVar.f20853k);
        }

        public int hashCode() {
            int hashCode = this.f20843a.hashCode() * 31;
            Uri uri = this.f20845c;
            return ((((((((((((hashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f20847e.hashCode()) * 31) + (this.f20848f ? 1 : 0)) * 31) + (this.f20850h ? 1 : 0)) * 31) + (this.f20849g ? 1 : 0)) * 31) + this.f20852j.hashCode()) * 31) + Arrays.hashCode(this.f20853k);
        }

        public static final class C6668a {
            public UUID f20854a;
            public Uri f20855b;
            public AbstractC11401r<String, String> f20856c;
            public boolean f20857d;
            public boolean f20858e;
            public boolean f20859f;
            public AbstractC11396q<Integer> f20860g;
            public byte[] f20861h;

            public C6667f m19606i() {
                return new C6667f(this);
            }

            @Deprecated
            public C6668a() {
                this.f20856c = AbstractC11401r.m740j();
                this.f20860g = AbstractC11396q.m768D();
            }

            public C6668a(C6667f fVar) {
                this.f20854a = fVar.f20843a;
                this.f20855b = fVar.f20845c;
                this.f20856c = fVar.f20847e;
                this.f20857d = fVar.f20848f;
                this.f20858e = fVar.f20849g;
                this.f20859f = fVar.f20850h;
                this.f20860g = fVar.f20852j;
                this.f20861h = fVar.f20853k;
            }
        }

        public C6667f(C6668a aVar) {
            C1186a.m38187f(!aVar.f20859f || aVar.f20855b != null);
            UUID uuid = (UUID) C1186a.m38188e(aVar.f20854a);
            this.f20843a = uuid;
            this.f20844b = uuid;
            this.f20845c = aVar.f20855b;
            this.f20846d = aVar.f20856c;
            this.f20847e = aVar.f20856c;
            this.f20848f = aVar.f20857d;
            this.f20850h = aVar.f20859f;
            this.f20849g = aVar.f20858e;
            this.f20851i = aVar.f20860g;
            this.f20852j = aVar.f20860g;
            this.f20853k = aVar.f20861h != null ? Arrays.copyOf(aVar.f20861h, aVar.f20861h.length) : null;
        }
    }

    public static final class C6669g implements AbstractC6609h {
        public static final C6669g f20862O = new C6670a().m19596f();
        public static final AbstractC6609h.AbstractC6610a<C6669g> f20863P = C6683q1.f20916a;
        public final float f20864M;
        public final float f20865N;
        public final long f20866a;
        public final long f20867b;
        public final long f20868c;

        public static final class C6670a {
            public long f20869a;
            public long f20870b;
            public long f20871c;
            public float f20872d;
            public float f20873e;

            public C6669g m19596f() {
                return new C6669g(this);
            }

            public C6670a() {
                this.f20869a = -9223372036854775807L;
                this.f20870b = -9223372036854775807L;
                this.f20871c = -9223372036854775807L;
                this.f20872d = -3.4028235E38f;
                this.f20873e = -3.4028235E38f;
            }

            public C6670a(C6669g gVar) {
                this.f20869a = gVar.f20866a;
                this.f20870b = gVar.f20867b;
                this.f20871c = gVar.f20868c;
                this.f20872d = gVar.f20864M;
                this.f20873e = gVar.f20865N;
            }
        }

        public static String m19603c(int i) {
            return Integer.toString(i, 36);
        }

        public static C6669g m19602d(Bundle bundle) {
            return new C6669g(bundle.getLong(m19603c(0), -9223372036854775807L), bundle.getLong(m19603c(1), -9223372036854775807L), bundle.getLong(m19603c(2), -9223372036854775807L), bundle.getFloat(m19603c(3), -3.4028235E38f), bundle.getFloat(m19603c(4), -3.4028235E38f));
        }

        public C6670a m19604b() {
            return new C6670a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6669g)) {
                return false;
            }
            C6669g gVar = (C6669g) obj;
            return this.f20866a == gVar.f20866a && this.f20867b == gVar.f20867b && this.f20868c == gVar.f20868c && this.f20864M == gVar.f20864M && this.f20865N == gVar.f20865N;
        }

        public int hashCode() {
            long j = this.f20866a;
            long j2 = this.f20867b;
            long j3 = this.f20868c;
            int i = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            float f = this.f20864M;
            int i2 = 0;
            int floatToIntBits = (i + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
            float f2 = this.f20865N;
            if (f2 != 0.0f) {
                i2 = Float.floatToIntBits(f2);
            }
            return floatToIntBits + i2;
        }

        public C6669g(C6670a aVar) {
            this(aVar.f20869a, aVar.f20870b, aVar.f20871c, aVar.f20872d, aVar.f20873e);
        }

        @Deprecated
        public C6669g(long j, long j2, long j3, float f, float f2) {
            this.f20866a = j;
            this.f20867b = j2;
            this.f20868c = j3;
            this.f20864M = f;
            this.f20865N = f2;
        }
    }

    public static class C6671h {
        public final Uri f20874a;
        public final String f20875b;
        public final C6667f f20876c;
        public final C6662b f20877d;
        public final List<Object> f20878e;
        public final String f20879f;
        public final AbstractC11396q<C6674k> f20880g;
        @Deprecated
        public final List<C6673j> f20881h;
        public final Object f20882i;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6671h)) {
                return false;
            }
            C6671h hVar = (C6671h) obj;
            return this.f20874a.equals(hVar.f20874a) && C1216l0.m37985c(this.f20875b, hVar.f20875b) && C1216l0.m37985c(this.f20876c, hVar.f20876c) && C1216l0.m37985c(this.f20877d, hVar.f20877d) && this.f20878e.equals(hVar.f20878e) && C1216l0.m37985c(this.f20879f, hVar.f20879f) && this.f20880g.equals(hVar.f20880g) && C1216l0.m37985c(this.f20882i, hVar.f20882i);
        }

        public int hashCode() {
            int hashCode = this.f20874a.hashCode() * 31;
            String str = this.f20875b;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            C6667f fVar = this.f20876c;
            int hashCode3 = (((((hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31) + 0) * 31) + this.f20878e.hashCode()) * 31;
            String str2 = this.f20879f;
            int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f20880g.hashCode()) * 31;
            Object obj = this.f20882i;
            if (obj != null) {
                i = obj.hashCode();
            }
            return hashCode4 + i;
        }

        public C6671h(Uri uri, String str, C6667f fVar, C6662b bVar, List<Object> list, String str2, AbstractC11396q<C6674k> qVar, Object obj) {
            this.f20874a = uri;
            this.f20875b = str;
            this.f20876c = fVar;
            this.f20878e = list;
            this.f20879f = str2;
            this.f20880g = qVar;
            AbstractC11396q.C11397a x = AbstractC11396q.m760x();
            for (int i = 0; i < qVar.size(); i++) {
                x.m757d(qVar.get(i).m19595a().m19587h());
            }
            this.f20881h = x.m756e();
            this.f20882i = obj;
        }
    }

    @Deprecated
    public static final class C6672i extends C6671h {
        public C6672i(Uri uri, String str, C6667f fVar, C6662b bVar, List<Object> list, String str2, AbstractC11396q<C6674k> qVar, Object obj) {
            super(uri, str, fVar, bVar, list, str2, qVar, obj);
        }
    }

    @Deprecated
    public static final class C6673j extends C6674k {
        public C6673j(C6674k.C6675a aVar) {
            super(aVar);
        }
    }

    public static class C6674k {
        public final Uri f20883a;
        public final String f20884b;
        public final String f20885c;
        public final int f20886d;
        public final int f20887e;
        public final String f20888f;

        public static final class C6675a {
            public Uri f20889a;
            public String f20890b;
            public String f20891c;
            public int f20892d;
            public int f20893e;
            public String f20894f;

            public final C6673j m19587h() {
                return new C6673j(this);
            }

            public C6675a(C6674k kVar) {
                this.f20889a = kVar.f20883a;
                this.f20890b = kVar.f20884b;
                this.f20891c = kVar.f20885c;
                this.f20892d = kVar.f20886d;
                this.f20893e = kVar.f20887e;
                this.f20894f = kVar.f20888f;
            }
        }

        public C6675a m19595a() {
            return new C6675a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6674k)) {
                return false;
            }
            C6674k kVar = (C6674k) obj;
            return this.f20883a.equals(kVar.f20883a) && C1216l0.m37985c(this.f20884b, kVar.f20884b) && C1216l0.m37985c(this.f20885c, kVar.f20885c) && this.f20886d == kVar.f20886d && this.f20887e == kVar.f20887e && C1216l0.m37985c(this.f20888f, kVar.f20888f);
        }

        public int hashCode() {
            int hashCode = this.f20883a.hashCode() * 31;
            String str = this.f20884b;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f20885c;
            int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f20886d) * 31) + this.f20887e) * 31;
            String str3 = this.f20888f;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode3 + i;
        }

        public C6674k(C6675a aVar) {
            this.f20883a = aVar.f20889a;
            this.f20884b = aVar.f20890b;
            this.f20885c = aVar.f20891c;
            this.f20886d = aVar.f20892d;
            this.f20887e = aVar.f20893e;
            this.f20888f = aVar.f20894f;
        }
    }

    public static C6660o1 m19640c(Bundle bundle) {
        C6669g gVar;
        C6693s1 s1Var;
        C6666e eVar;
        String str = (String) C1186a.m38188e(bundle.getString(m19639d(0), ""));
        Bundle bundle2 = bundle.getBundle(m19639d(1));
        if (bundle2 == null) {
            gVar = C6669g.f20862O;
        } else {
            gVar = C6669g.f20863P.mo998a(bundle2);
        }
        C6669g gVar2 = gVar;
        Bundle bundle3 = bundle.getBundle(m19639d(2));
        if (bundle3 == null) {
            s1Var = C6693s1.f20948q0;
        } else {
            s1Var = C6693s1.f20949r0.mo998a(bundle3);
        }
        C6693s1 s1Var2 = s1Var;
        Bundle bundle4 = bundle.getBundle(m19639d(3));
        if (bundle4 == null) {
            eVar = C6666e.f20842Q;
        } else {
            eVar = C6664d.f20831P.mo998a(bundle4);
        }
        return new C6660o1(str, eVar, null, gVar2, s1Var2);
    }

    public static String m19639d(int i) {
        return Integer.toString(i, 36);
    }

    public C6663c m19641b() {
        return new C6663c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6660o1)) {
            return false;
        }
        C6660o1 o1Var = (C6660o1) obj;
        return C1216l0.m37985c(this.f20815a, o1Var.f20815a) && this.f20813O.equals(o1Var.f20813O) && C1216l0.m37985c(this.f20816b, o1Var.f20816b) && C1216l0.m37985c(this.f20811M, o1Var.f20811M) && C1216l0.m37985c(this.f20812N, o1Var.f20812N);
    }

    public int hashCode() {
        int hashCode = this.f20815a.hashCode() * 31;
        C6671h hVar = this.f20816b;
        return ((((((hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f20811M.hashCode()) * 31) + this.f20813O.hashCode()) * 31) + this.f20812N.hashCode();
    }

    public C6660o1(String str, C6666e eVar, C6672i iVar, C6669g gVar, C6693s1 s1Var) {
        this.f20815a = str;
        this.f20816b = iVar;
        this.f20817c = iVar;
        this.f20811M = gVar;
        this.f20812N = s1Var;
        this.f20813O = eVar;
        this.f20814P = eVar;
    }
}
