package m3;

import a7.q;
import a7.r;
import android.net.Uri;
import android.os.Bundle;
import c5.l0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import m3.h;

public final class y1 implements m3.h {
    public static final y1 Q = new c().a();
    public static final h.a<y1> R = x1.f17039a;
    public final g M;
    public final c2 N;
    public final d O;
    @Deprecated
    public final e P;
    public final String f17042a;
    public final h f17043b;
    @Deprecated
    public final i f17044c;

    public static final class b {
    }

    public static final class c {
        public String f17045a;
        public Uri f17046b;
        public String f17047c;
        public d.a f17048d;
        public f.a f17049e;
        public List<Object> f17050f;
        public String f17051g;
        public q<k> f17052h;
        public Object f17053i;
        public c2 f17054j;
        public g.a f17055k;

        public y1 a() {
            i iVar;
            c5.a.f(this.f17049e.f17076b == null || this.f17049e.f17075a != null);
            Uri uri = this.f17046b;
            f fVar = null;
            if (uri != null) {
                String str = this.f17047c;
                if (this.f17049e.f17075a != null) {
                    fVar = this.f17049e.i();
                }
                iVar = new i(uri, str, fVar, null, this.f17050f, this.f17051g, this.f17052h, this.f17053i);
            } else {
                iVar = null;
            }
            String str2 = this.f17045a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            e g10 = this.f17048d.g();
            g f10 = this.f17055k.f();
            c2 c2Var = this.f17054j;
            if (c2Var == null) {
                c2Var = c2.f16553q0;
            }
            return new y1(str3, g10, iVar, f10, c2Var);
        }

        public c b(String str) {
            this.f17051g = str;
            return this;
        }

        public c c(String str) {
            this.f17045a = (String) c5.a.e(str);
            return this;
        }

        public c d(Object obj) {
            this.f17053i = obj;
            return this;
        }

        public c e(Uri uri) {
            this.f17046b = uri;
            return this;
        }

        public c() {
            this.f17048d = new d.a();
            this.f17049e = new f.a();
            this.f17050f = Collections.emptyList();
            this.f17052h = q.D();
            this.f17055k = new g.a();
        }

        public c(y1 y1Var) {
            this();
            f.a aVar;
            this.f17048d = y1Var.O.b();
            this.f17045a = y1Var.f17042a;
            this.f17054j = y1Var.N;
            this.f17055k = y1Var.M.b();
            h hVar = y1Var.f17043b;
            if (hVar != null) {
                this.f17051g = hVar.f17095e;
                this.f17047c = hVar.f17092b;
                this.f17046b = hVar.f17091a;
                this.f17050f = hVar.f17094d;
                this.f17052h = hVar.f17096f;
                this.f17053i = hVar.f17098h;
                f fVar = hVar.f17093c;
                if (fVar != null) {
                    aVar = fVar.b();
                } else {
                    aVar = new f.a();
                }
                this.f17049e = aVar;
            }
        }
    }

    public static class d implements m3.h {
        public static final d O = new a().f();
        public static final h.a<e> P = z1.f17116a;
        public final boolean M;
        public final boolean N;
        public final long f17056a;
        public final long f17057b;
        public final boolean f17058c;

        public static final class a {
            public long f17059a;
            public long f17060b;
            public boolean f17061c;
            public boolean f17062d;
            public boolean f17063e;

            public d f() {
                return g();
            }

            @Deprecated
            public e g() {
                return new e(this);
            }

            public a h(long j10) {
                c5.a.a(j10 == Long.MIN_VALUE || j10 >= 0);
                this.f17060b = j10;
                return this;
            }

            public a i(boolean z10) {
                this.f17062d = z10;
                return this;
            }

            public a j(boolean z10) {
                this.f17061c = z10;
                return this;
            }

            public a k(long j10) {
                c5.a.a(j10 >= 0);
                this.f17059a = j10;
                return this;
            }

            public a l(boolean z10) {
                this.f17063e = z10;
                return this;
            }

            public a() {
                this.f17060b = Long.MIN_VALUE;
            }

            public a(d dVar) {
                this.f17059a = dVar.f17056a;
                this.f17060b = dVar.f17057b;
                this.f17061c = dVar.f17058c;
                this.f17062d = dVar.M;
                this.f17063e = dVar.N;
            }
        }

        public static String c(int i10) {
            return Integer.toString(i10, 36);
        }

        public static e d(Bundle bundle) {
            return new a().k(bundle.getLong(c(0), 0L)).h(bundle.getLong(c(1), Long.MIN_VALUE)).j(bundle.getBoolean(c(2), false)).i(bundle.getBoolean(c(3), false)).l(bundle.getBoolean(c(4), false)).g();
        }

        public a b() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f17056a == dVar.f17056a && this.f17057b == dVar.f17057b && this.f17058c == dVar.f17058c && this.M == dVar.M && this.N == dVar.N;
        }

        public int hashCode() {
            long j10 = this.f17056a;
            long j11 = this.f17057b;
            return (((((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f17058c ? 1 : 0)) * 31) + (this.M ? 1 : 0)) * 31) + (this.N ? 1 : 0);
        }

        public d(a aVar) {
            this.f17056a = aVar.f17059a;
            this.f17057b = aVar.f17060b;
            this.f17058c = aVar.f17061c;
            this.M = aVar.f17062d;
            this.N = aVar.f17063e;
        }
    }

    @Deprecated
    public static final class e extends d {
        public static final e Q = new d.a().g();

        public e(d.a aVar) {
            super(aVar);
        }
    }

    public static final class f {
        public final UUID f17064a;
        @Deprecated
        public final UUID f17065b;
        public final Uri f17066c;
        @Deprecated
        public final r<String, String> f17067d;
        public final r<String, String> f17068e;
        public final boolean f17069f;
        public final boolean f17070g;
        public final boolean f17071h;
        @Deprecated
        public final q<Integer> f17072i;
        public final q<Integer> f17073j;
        public final byte[] f17074k;

        public a b() {
            return new a();
        }

        public byte[] c() {
            byte[] bArr = this.f17074k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f17064a.equals(fVar.f17064a) && l0.c(this.f17066c, fVar.f17066c) && l0.c(this.f17068e, fVar.f17068e) && this.f17069f == fVar.f17069f && this.f17071h == fVar.f17071h && this.f17070g == fVar.f17070g && this.f17073j.equals(fVar.f17073j) && Arrays.equals(this.f17074k, fVar.f17074k);
        }

        public int hashCode() {
            int hashCode = this.f17064a.hashCode() * 31;
            Uri uri = this.f17066c;
            return ((((((((((((hashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f17068e.hashCode()) * 31) + (this.f17069f ? 1 : 0)) * 31) + (this.f17071h ? 1 : 0)) * 31) + (this.f17070g ? 1 : 0)) * 31) + this.f17073j.hashCode()) * 31) + Arrays.hashCode(this.f17074k);
        }

        public static final class a {
            public UUID f17075a;
            public Uri f17076b;
            public r<String, String> f17077c;
            public boolean f17078d;
            public boolean f17079e;
            public boolean f17080f;
            public q<Integer> f17081g;
            public byte[] f17082h;

            public f i() {
                return new f(this);
            }

            @Deprecated
            public a() {
                this.f17077c = r.j();
                this.f17081g = q.D();
            }

            public a(f fVar) {
                this.f17075a = fVar.f17064a;
                this.f17076b = fVar.f17066c;
                this.f17077c = fVar.f17068e;
                this.f17078d = fVar.f17069f;
                this.f17079e = fVar.f17070g;
                this.f17080f = fVar.f17071h;
                this.f17081g = fVar.f17073j;
                this.f17082h = fVar.f17074k;
            }
        }

        public f(a aVar) {
            c5.a.f(!aVar.f17080f || aVar.f17076b != null);
            UUID uuid = (UUID) c5.a.e(aVar.f17075a);
            this.f17064a = uuid;
            this.f17065b = uuid;
            this.f17066c = aVar.f17076b;
            this.f17067d = aVar.f17077c;
            this.f17068e = aVar.f17077c;
            this.f17069f = aVar.f17078d;
            this.f17071h = aVar.f17080f;
            this.f17070g = aVar.f17079e;
            this.f17072i = aVar.f17081g;
            this.f17073j = aVar.f17081g;
            this.f17074k = aVar.f17082h != null ? Arrays.copyOf(aVar.f17082h, aVar.f17082h.length) : null;
        }
    }

    public static final class g implements m3.h {
        public static final g O = new a().f();
        public static final h.a<g> P = a2.f16485a;
        public final float M;
        public final float N;
        public final long f17083a;
        public final long f17084b;
        public final long f17085c;

        public static final class a {
            public long f17086a;
            public long f17087b;
            public long f17088c;
            public float f17089d;
            public float f17090e;

            public g f() {
                return new g(this);
            }

            public a() {
                this.f17086a = -9223372036854775807L;
                this.f17087b = -9223372036854775807L;
                this.f17088c = -9223372036854775807L;
                this.f17089d = -3.4028235E38f;
                this.f17090e = -3.4028235E38f;
            }

            public a(g gVar) {
                this.f17086a = gVar.f17083a;
                this.f17087b = gVar.f17084b;
                this.f17088c = gVar.f17085c;
                this.f17089d = gVar.M;
                this.f17090e = gVar.N;
            }
        }

        public static String c(int i10) {
            return Integer.toString(i10, 36);
        }

        public static g d(Bundle bundle) {
            return new g(bundle.getLong(c(0), -9223372036854775807L), bundle.getLong(c(1), -9223372036854775807L), bundle.getLong(c(2), -9223372036854775807L), bundle.getFloat(c(3), -3.4028235E38f), bundle.getFloat(c(4), -3.4028235E38f));
        }

        public a b() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f17083a == gVar.f17083a && this.f17084b == gVar.f17084b && this.f17085c == gVar.f17085c && this.M == gVar.M && this.N == gVar.N;
        }

        public int hashCode() {
            long j10 = this.f17083a;
            long j11 = this.f17084b;
            long j12 = this.f17085c;
            int i10 = ((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            float f10 = this.M;
            int i11 = 0;
            int floatToIntBits = (i10 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.N;
            if (f11 != 0.0f) {
                i11 = Float.floatToIntBits(f11);
            }
            return floatToIntBits + i11;
        }

        public g(a aVar) {
            this(aVar.f17086a, aVar.f17087b, aVar.f17088c, aVar.f17089d, aVar.f17090e);
        }

        @Deprecated
        public g(long j10, long j11, long j12, float f10, float f11) {
            this.f17083a = j10;
            this.f17084b = j11;
            this.f17085c = j12;
            this.M = f10;
            this.N = f11;
        }
    }

    public static class h {
        public final Uri f17091a;
        public final String f17092b;
        public final f f17093c;
        public final List<Object> f17094d;
        public final String f17095e;
        public final q<k> f17096f;
        @Deprecated
        public final List<j> f17097g;
        public final Object f17098h;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f17091a.equals(hVar.f17091a) && l0.c(this.f17092b, hVar.f17092b) && l0.c(this.f17093c, hVar.f17093c) && l0.c(null, null) && this.f17094d.equals(hVar.f17094d) && l0.c(this.f17095e, hVar.f17095e) && this.f17096f.equals(hVar.f17096f) && l0.c(this.f17098h, hVar.f17098h);
        }

        public int hashCode() {
            int hashCode = this.f17091a.hashCode() * 31;
            String str = this.f17092b;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f17093c;
            int hashCode3 = (((((hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31) + 0) * 31) + this.f17094d.hashCode()) * 31;
            String str2 = this.f17095e;
            int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f17096f.hashCode()) * 31;
            Object obj = this.f17098h;
            if (obj != null) {
                i10 = obj.hashCode();
            }
            return hashCode4 + i10;
        }

        public h(Uri uri, String str, f fVar, b bVar, List<Object> list, String str2, q<k> qVar, Object obj) {
            this.f17091a = uri;
            this.f17092b = str;
            this.f17093c = fVar;
            this.f17094d = list;
            this.f17095e = str2;
            this.f17096f = qVar;
            q.a x10 = q.x();
            for (int i10 = 0; i10 < qVar.size(); i10++) {
                x10.a(qVar.get(i10).a().i());
            }
            this.f17097g = x10.h();
            this.f17098h = obj;
        }
    }

    @Deprecated
    public static final class i extends h {
        public i(Uri uri, String str, f fVar, b bVar, List<Object> list, String str2, q<k> qVar, Object obj) {
            super(uri, str, fVar, bVar, list, str2, qVar, obj);
        }
    }

    @Deprecated
    public static final class j extends k {
        public j(k.a aVar) {
            super(aVar);
        }
    }

    public static class k {
        public final Uri f17099a;
        public final String f17100b;
        public final String f17101c;
        public final int f17102d;
        public final int f17103e;
        public final String f17104f;
        public final String f17105g;

        public static final class a {
            public Uri f17106a;
            public String f17107b;
            public String f17108c;
            public int f17109d;
            public int f17110e;
            public String f17111f;
            public String f17112g;

            public final j i() {
                return new j(this);
            }

            public a(k kVar) {
                this.f17106a = kVar.f17099a;
                this.f17107b = kVar.f17100b;
                this.f17108c = kVar.f17101c;
                this.f17109d = kVar.f17102d;
                this.f17110e = kVar.f17103e;
                this.f17111f = kVar.f17104f;
                this.f17112g = kVar.f17105g;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f17099a.equals(kVar.f17099a) && l0.c(this.f17100b, kVar.f17100b) && l0.c(this.f17101c, kVar.f17101c) && this.f17102d == kVar.f17102d && this.f17103e == kVar.f17103e && l0.c(this.f17104f, kVar.f17104f) && l0.c(this.f17105g, kVar.f17105g);
        }

        public int hashCode() {
            int hashCode = this.f17099a.hashCode() * 31;
            String str = this.f17100b;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f17101c;
            int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f17102d) * 31) + this.f17103e) * 31;
            String str3 = this.f17104f;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f17105g;
            if (str4 != null) {
                i10 = str4.hashCode();
            }
            return hashCode4 + i10;
        }

        public k(a aVar) {
            this.f17099a = aVar.f17106a;
            this.f17100b = aVar.f17107b;
            this.f17101c = aVar.f17108c;
            this.f17102d = aVar.f17109d;
            this.f17103e = aVar.f17110e;
            this.f17104f = aVar.f17111f;
            this.f17105g = aVar.f17112g;
        }
    }

    public static y1 c(Bundle bundle) {
        g gVar;
        c2 c2Var;
        e eVar;
        String str = (String) c5.a.e(bundle.getString(d(0), ""));
        Bundle bundle2 = bundle.getBundle(d(1));
        if (bundle2 == null) {
            gVar = g.O;
        } else {
            gVar = g.P.a(bundle2);
        }
        g gVar2 = gVar;
        Bundle bundle3 = bundle.getBundle(d(2));
        if (bundle3 == null) {
            c2Var = c2.f16553q0;
        } else {
            c2Var = c2.f16554r0.a(bundle3);
        }
        c2 c2Var2 = c2Var;
        Bundle bundle4 = bundle.getBundle(d(3));
        if (bundle4 == null) {
            eVar = e.Q;
        } else {
            eVar = d.P.a(bundle4);
        }
        return new y1(str, eVar, null, gVar2, c2Var2);
    }

    public static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    public c b() {
        return new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return l0.c(this.f17042a, y1Var.f17042a) && this.O.equals(y1Var.O) && l0.c(this.f17043b, y1Var.f17043b) && l0.c(this.M, y1Var.M) && l0.c(this.N, y1Var.N);
    }

    public int hashCode() {
        int hashCode = this.f17042a.hashCode() * 31;
        h hVar = this.f17043b;
        return ((((((hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.M.hashCode()) * 31) + this.O.hashCode()) * 31) + this.N.hashCode();
    }

    public y1(String str, e eVar, i iVar, g gVar, c2 c2Var) {
        this.f17042a = str;
        this.f17043b = iVar;
        this.f17044c = iVar;
        this.M = gVar;
        this.N = c2Var;
        this.O = eVar;
        this.P = eVar;
    }
}
