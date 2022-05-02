package p025bc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.thunderdog.challegram.Log;
import p095gc.AbstractC4537a0;
import p095gc.AbstractC4551g;
import p095gc.C4549e;
import p095gc.C4552h;
import p095gc.C4560o;
import p123ia.C5294h;
import p123ia.C5312v;
import p290ub.C9489b;
import qa.C8294g;
import qa.C8298k;

public final class C1311d {
    public static final C1309c[] f4732a;
    public static final Map<C4552h, Integer> f4733b;
    public static final C1311d f4734c;

    static {
        C1311d dVar = new C1311d();
        f4734c = dVar;
        C4552h hVar = C1309c.f4724f;
        C4552h hVar2 = C1309c.f4725g;
        C4552h hVar3 = C1309c.f4726h;
        C4552h hVar4 = C1309c.f4723e;
        f4732a = new C1309c[]{new C1309c(C1309c.f4727i, ""), new C1309c(hVar, "GET"), new C1309c(hVar, "POST"), new C1309c(hVar2, "/"), new C1309c(hVar2, "/index.html"), new C1309c(hVar3, "http"), new C1309c(hVar3, "https"), new C1309c(hVar4, "200"), new C1309c(hVar4, "204"), new C1309c(hVar4, "206"), new C1309c(hVar4, "304"), new C1309c(hVar4, "400"), new C1309c(hVar4, "404"), new C1309c(hVar4, "500"), new C1309c("accept-charset", ""), new C1309c("accept-encoding", "gzip, deflate"), new C1309c("accept-language", ""), new C1309c("accept-ranges", ""), new C1309c("accept", ""), new C1309c("access-control-allow-origin", ""), new C1309c("age", ""), new C1309c("allow", ""), new C1309c("authorization", ""), new C1309c("cache-control", ""), new C1309c("content-disposition", ""), new C1309c("content-encoding", ""), new C1309c("content-language", ""), new C1309c("content-length", ""), new C1309c("content-location", ""), new C1309c("content-range", ""), new C1309c("content-type", ""), new C1309c("cookie", ""), new C1309c("date", ""), new C1309c("etag", ""), new C1309c("expect", ""), new C1309c("expires", ""), new C1309c("from", ""), new C1309c("host", ""), new C1309c("if-match", ""), new C1309c("if-modified-since", ""), new C1309c("if-none-match", ""), new C1309c("if-range", ""), new C1309c("if-unmodified-since", ""), new C1309c("last-modified", ""), new C1309c("link", ""), new C1309c("location", ""), new C1309c("max-forwards", ""), new C1309c("proxy-authenticate", ""), new C1309c("proxy-authorization", ""), new C1309c("range", ""), new C1309c("referer", ""), new C1309c("refresh", ""), new C1309c("retry-after", ""), new C1309c("server", ""), new C1309c("set-cookie", ""), new C1309c("strict-transport-security", ""), new C1309c("transfer-encoding", ""), new C1309c("user-agent", ""), new C1309c("vary", ""), new C1309c("via", ""), new C1309c("www-authenticate", "")};
        f4733b = dVar.m37773d();
    }

    public final C4552h m37776a(C4552h hVar) {
        C8298k.m12934e(hVar, "name");
        int r = hVar.m27404r();
        for (int i = 0; i < r; i++) {
            byte b = (byte) 65;
            byte b2 = (byte) 90;
            byte d = hVar.m27412d(i);
            if (b <= d && b2 >= d) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + hVar.m27402u());
            }
        }
        return hVar;
    }

    public final Map<C4552h, Integer> m37775b() {
        return f4733b;
    }

    public final C1309c[] m37774c() {
        return f4732a;
    }

    public final Map<C4552h, Integer> m37773d() {
        C1309c[] cVarArr = f4732a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length);
        int length = cVarArr.length;
        for (int i = 0; i < length; i++) {
            C1309c[] cVarArr2 = f4732a;
            if (!linkedHashMap.containsKey(cVarArr2[i].f4730b)) {
                linkedHashMap.put(cVarArr2[i].f4730b, Integer.valueOf(i));
            }
        }
        Map<C4552h, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C8298k.m12935d(unmodifiableMap, "Collections.unmodifiableMap(result)");
        return unmodifiableMap;
    }

    public static final class C1312a {
        public final List<C1309c> f4735a;
        public final AbstractC4551g f4736b;
        public C1309c[] f4737c;
        public int f4738d;
        public int f4739e;
        public int f4740f;
        public final int f4741g;
        public int f4742h;

        public C1312a(AbstractC4537a0 a0Var, int i, int i2) {
            C8298k.m12934e(a0Var, "source");
            this.f4741g = i;
            this.f4742h = i2;
            this.f4735a = new ArrayList();
            this.f4736b = C4560o.m27378b(a0Var);
            C1309c[] cVarArr = new C1309c[8];
            this.f4737c = cVarArr;
            this.f4738d = cVarArr.length - 1;
        }

        public final void m37772a() {
            int i = this.f4742h;
            int i2 = this.f4740f;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m37771b();
            } else {
                m37769d(i2 - i);
            }
        }

        public final void m37771b() {
            C5294h.m23426j(this.f4737c, null, 0, 0, 6, null);
            this.f4738d = this.f4737c.length - 1;
            this.f4739e = 0;
            this.f4740f = 0;
        }

        public final int m37770c(int i) {
            return this.f4738d + 1 + i;
        }

        public final int m37769d(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f4737c.length;
                while (true) {
                    length--;
                    i2 = this.f4738d;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    C1309c cVar = this.f4737c[length];
                    C8298k.m12936c(cVar);
                    int i4 = cVar.f4729a;
                    i -= i4;
                    this.f4740f -= i4;
                    this.f4739e--;
                    i3++;
                }
                C1309c[] cVarArr = this.f4737c;
                System.arraycopy(cVarArr, i2 + 1, cVarArr, i2 + 1 + i3, this.f4739e);
                this.f4738d += i3;
            }
            return i3;
        }

        public final List<C1309c> m37768e() {
            List<C1309c> S = C5312v.m23329S(this.f4735a);
            this.f4735a.clear();
            return S;
        }

        public final C4552h m37767f(int i) {
            if (m37765h(i)) {
                return C1311d.f4734c.m37774c()[i].f4730b;
            }
            int c = m37770c(i - C1311d.f4734c.m37774c().length);
            if (c >= 0) {
                C1309c[] cVarArr = this.f4737c;
                if (c < cVarArr.length) {
                    C1309c cVar = cVarArr[c];
                    C8298k.m12936c(cVar);
                    return cVar.f4730b;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        public final void m37766g(int i, C1309c cVar) {
            this.f4735a.add(cVar);
            int i2 = cVar.f4729a;
            if (i != -1) {
                C1309c cVar2 = this.f4737c[m37770c(i)];
                C8298k.m12936c(cVar2);
                i2 -= cVar2.f4729a;
            }
            int i3 = this.f4742h;
            if (i2 > i3) {
                m37771b();
                return;
            }
            int d = m37769d((this.f4740f + i2) - i3);
            if (i == -1) {
                int i4 = this.f4739e + 1;
                C1309c[] cVarArr = this.f4737c;
                if (i4 > cVarArr.length) {
                    C1309c[] cVarArr2 = new C1309c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f4738d = this.f4737c.length - 1;
                    this.f4737c = cVarArr2;
                }
                int i5 = this.f4738d;
                this.f4738d = i5 - 1;
                this.f4737c[i5] = cVar;
                this.f4739e++;
            } else {
                this.f4737c[i + m37770c(i) + d] = cVar;
            }
            this.f4740f += i2;
        }

        public final boolean m37765h(int i) {
            return i >= 0 && i <= C1311d.f4734c.m37774c().length - 1;
        }

        public final int m37764i() {
            return C9489b.m8522b(this.f4736b.readByte(), 255);
        }

        public final C4552h m37763j() {
            int i = m37764i();
            boolean z = (i & Log.TAG_YOUTUBE) == 128;
            long m = m37760m(i, 127);
            if (!z) {
                return this.f4736b.mo27330o(m);
            }
            C4549e eVar = new C4549e();
            C1347k.f4926d.m37582b(this.f4736b, m, eVar);
            return eVar.m27438J0();
        }

        public final void m37762k() {
            while (!this.f4736b.mo27339B()) {
                int b = C9489b.m8522b(this.f4736b.readByte(), 255);
                if (b == 128) {
                    throw new IOException("index == 0");
                } else if ((b & Log.TAG_YOUTUBE) == 128) {
                    m37761l(m37760m(b, 127) - 1);
                } else if (b == 64) {
                    m37758o();
                } else if ((b & 64) == 64) {
                    m37759n(m37760m(b, 63) - 1);
                } else if ((b & 32) == 32) {
                    int m = m37760m(b, 31);
                    this.f4742h = m;
                    if (m < 0 || m > this.f4741g) {
                        throw new IOException("Invalid dynamic table size update " + this.f4742h);
                    }
                    m37772a();
                } else if (b == 16 || b == 0) {
                    m37756q();
                } else {
                    m37757p(m37760m(b, 15) - 1);
                }
            }
        }

        public final void m37761l(int i) {
            if (m37765h(i)) {
                this.f4735a.add(C1311d.f4734c.m37774c()[i]);
                return;
            }
            int c = m37770c(i - C1311d.f4734c.m37774c().length);
            if (c >= 0) {
                C1309c[] cVarArr = this.f4737c;
                if (c < cVarArr.length) {
                    List<C1309c> list = this.f4735a;
                    C1309c cVar = cVarArr[c];
                    C8298k.m12936c(cVar);
                    list.add(cVar);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        public final int m37760m(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int i5 = m37764i();
                if ((i5 & Log.TAG_YOUTUBE) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (i5 & 127) << i4;
                i4 += 7;
            }
        }

        public final void m37759n(int i) {
            m37766g(-1, new C1309c(m37767f(i), m37763j()));
        }

        public final void m37758o() {
            m37766g(-1, new C1309c(C1311d.f4734c.m37776a(m37763j()), m37763j()));
        }

        public final void m37757p(int i) {
            this.f4735a.add(new C1309c(m37767f(i), m37763j()));
        }

        public final void m37756q() {
            this.f4735a.add(new C1309c(C1311d.f4734c.m37776a(m37763j()), m37763j()));
        }

        public C1312a(AbstractC4537a0 a0Var, int i, int i2, int i3, C8294g gVar) {
            this(a0Var, i, (i3 & 4) != 0 ? i : i2);
        }
    }

    public static final class C1313b {
        public int f4743a;
        public boolean f4744b;
        public int f4745c;
        public C1309c[] f4746d;
        public int f4747e;
        public int f4748f;
        public int f4749g;
        public int f4750h;
        public final boolean f4751i;
        public final C4549e f4752j;

        public C1313b(int i, boolean z, C4549e eVar) {
            C8298k.m12934e(eVar, "out");
            this.f4750h = i;
            this.f4751i = z;
            this.f4752j = eVar;
            this.f4743a = Integer.MAX_VALUE;
            this.f4745c = i;
            C1309c[] cVarArr = new C1309c[8];
            this.f4746d = cVarArr;
            this.f4747e = cVarArr.length - 1;
        }

        public final void m37755a() {
            int i = this.f4745c;
            int i2 = this.f4749g;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m37754b();
            } else {
                m37753c(i2 - i);
            }
        }

        public final void m37754b() {
            C5294h.m23426j(this.f4746d, null, 0, 0, 6, null);
            this.f4747e = this.f4746d.length - 1;
            this.f4748f = 0;
            this.f4749g = 0;
        }

        public final int m37753c(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f4746d.length;
                while (true) {
                    length--;
                    i2 = this.f4747e;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    C1309c cVar = this.f4746d[length];
                    C8298k.m12936c(cVar);
                    i -= cVar.f4729a;
                    int i4 = this.f4749g;
                    C1309c cVar2 = this.f4746d[length];
                    C8298k.m12936c(cVar2);
                    this.f4749g = i4 - cVar2.f4729a;
                    this.f4748f--;
                    i3++;
                }
                C1309c[] cVarArr = this.f4746d;
                System.arraycopy(cVarArr, i2 + 1, cVarArr, i2 + 1 + i3, this.f4748f);
                C1309c[] cVarArr2 = this.f4746d;
                int i5 = this.f4747e;
                Arrays.fill(cVarArr2, i5 + 1, i5 + 1 + i3, (Object) null);
                this.f4747e += i3;
            }
            return i3;
        }

        public final void m37752d(C1309c cVar) {
            int i = cVar.f4729a;
            int i2 = this.f4745c;
            if (i > i2) {
                m37754b();
                return;
            }
            m37753c((this.f4749g + i) - i2);
            int i3 = this.f4748f + 1;
            C1309c[] cVarArr = this.f4746d;
            if (i3 > cVarArr.length) {
                C1309c[] cVarArr2 = new C1309c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f4747e = this.f4746d.length - 1;
                this.f4746d = cVarArr2;
            }
            int i4 = this.f4747e;
            this.f4747e = i4 - 1;
            this.f4746d[i4] = cVar;
            this.f4748f++;
            this.f4749g += i;
        }

        public final void m37751e(int i) {
            this.f4750h = i;
            int min = Math.min(i, (int) Log.TAG_VIDEO);
            int i2 = this.f4745c;
            if (i2 != min) {
                if (min < i2) {
                    this.f4743a = Math.min(this.f4743a, min);
                }
                this.f4744b = true;
                this.f4745c = min;
                m37755a();
            }
        }

        public final void m37750f(C4552h hVar) {
            C8298k.m12934e(hVar, "data");
            if (this.f4751i) {
                C1347k kVar = C1347k.f4926d;
                if (kVar.m37580d(hVar) < hVar.m27404r()) {
                    C4549e eVar = new C4549e();
                    kVar.m37581c(hVar, eVar);
                    C4552h J0 = eVar.m27438J0();
                    m37748h(J0.m27404r(), 127, Log.TAG_YOUTUBE);
                    this.f4752j.mo27345k0(J0);
                    return;
                }
            }
            m37748h(hVar.m27404r(), 127, 0);
            this.f4752j.mo27345k0(hVar);
        }

        public final void m37749g(java.util.List<p025bc.C1309c> r14) {
            throw new UnsupportedOperationException("Method not decompiled: p025bc.C1311d.C1313b.m37749g(java.util.List):void");
        }

        public final void m37748h(int i, int i2, int i3) {
            if (i < i2) {
                this.f4752j.mo27349C(i | i3);
                return;
            }
            this.f4752j.mo27349C(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.f4752j.mo27349C(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.f4752j.mo27349C(i4);
        }

        public C1313b(int i, boolean z, C4549e eVar, int i2, C8294g gVar) {
            this((i2 & 1) != 0 ? Log.TAG_EMOJI : i, (i2 & 2) != 0 ? true : z, eVar);
        }
    }
}
