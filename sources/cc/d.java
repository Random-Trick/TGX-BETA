package cc;

import hc.a0;
import hc.e;
import hc.g;
import hc.h;
import hc.o;
import ja.v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.thunderdog.challegram.Log;
import ra.k;

public final class d {
    public static final c[] f5041a;
    public static final Map<h, Integer> f5042b;
    public static final d f5043c;

    static {
        d dVar = new d();
        f5043c = dVar;
        h hVar = c.f5033f;
        h hVar2 = c.f5034g;
        h hVar3 = c.f5035h;
        h hVar4 = c.f5032e;
        f5041a = new c[]{new c(c.f5036i, ""), new c(hVar, "GET"), new c(hVar, "POST"), new c(hVar2, "/"), new c(hVar2, "/index.html"), new c(hVar3, "http"), new c(hVar3, "https"), new c(hVar4, "200"), new c(hVar4, "204"), new c(hVar4, "206"), new c(hVar4, "304"), new c(hVar4, "400"), new c(hVar4, "404"), new c(hVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f5042b = dVar.d();
    }

    public final h a(h hVar) {
        k.e(hVar, "name");
        int r10 = hVar.r();
        for (int i10 = 0; i10 < r10; i10++) {
            byte b10 = (byte) 65;
            byte b11 = (byte) 90;
            byte d10 = hVar.d(i10);
            if (b10 <= d10 && b11 >= d10) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + hVar.u());
            }
        }
        return hVar;
    }

    public final Map<h, Integer> b() {
        return f5042b;
    }

    public final c[] c() {
        return f5041a;
    }

    public final Map<h, Integer> d() {
        c[] cVarArr = f5041a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length);
        int length = cVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            c[] cVarArr2 = f5041a;
            if (!linkedHashMap.containsKey(cVarArr2[i10].f5039b)) {
                linkedHashMap.put(cVarArr2[i10].f5039b, Integer.valueOf(i10));
            }
        }
        Map<h, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        k.d(unmodifiableMap, "Collections.unmodifiableMap(result)");
        return unmodifiableMap;
    }

    public static final class a {
        public final List<c> f5044a;
        public final g f5045b;
        public c[] f5046c;
        public int f5047d;
        public int f5048e;
        public int f5049f;
        public final int f5050g;
        public int f5051h;

        public a(a0 a0Var, int i10, int i11) {
            k.e(a0Var, "source");
            this.f5050g = i10;
            this.f5051h = i11;
            this.f5044a = new ArrayList();
            this.f5045b = o.b(a0Var);
            c[] cVarArr = new c[8];
            this.f5046c = cVarArr;
            this.f5047d = cVarArr.length - 1;
        }

        public final void a() {
            int i10 = this.f5051h;
            int i11 = this.f5049f;
            if (i10 >= i11) {
                return;
            }
            if (i10 == 0) {
                b();
            } else {
                d(i11 - i10);
            }
        }

        public final void b() {
            ja.h.j(this.f5046c, null, 0, 0, 6, null);
            this.f5047d = this.f5046c.length - 1;
            this.f5048e = 0;
            this.f5049f = 0;
        }

        public final int c(int i10) {
            return this.f5047d + 1 + i10;
        }

        public final int d(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f5046c.length;
                while (true) {
                    length--;
                    i11 = this.f5047d;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    c cVar = this.f5046c[length];
                    k.c(cVar);
                    int i13 = cVar.f5038a;
                    i10 -= i13;
                    this.f5049f -= i13;
                    this.f5048e--;
                    i12++;
                }
                c[] cVarArr = this.f5046c;
                System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f5048e);
                this.f5047d += i12;
            }
            return i12;
        }

        public final List<c> e() {
            List<c> S = v.S(this.f5044a);
            this.f5044a.clear();
            return S;
        }

        public final h f(int i10) {
            if (h(i10)) {
                return d.f5043c.c()[i10].f5039b;
            }
            int c10 = c(i10 - d.f5043c.c().length);
            if (c10 >= 0) {
                c[] cVarArr = this.f5046c;
                if (c10 < cVarArr.length) {
                    c cVar = cVarArr[c10];
                    k.c(cVar);
                    return cVar.f5039b;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        public final void g(int i10, c cVar) {
            this.f5044a.add(cVar);
            int i11 = cVar.f5038a;
            if (i10 != -1) {
                c cVar2 = this.f5046c[c(i10)];
                k.c(cVar2);
                i11 -= cVar2.f5038a;
            }
            int i12 = this.f5051h;
            if (i11 > i12) {
                b();
                return;
            }
            int d10 = d((this.f5049f + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f5048e + 1;
                c[] cVarArr = this.f5046c;
                if (i13 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f5047d = this.f5046c.length - 1;
                    this.f5046c = cVarArr2;
                }
                int i14 = this.f5047d;
                this.f5047d = i14 - 1;
                this.f5046c[i14] = cVar;
                this.f5048e++;
            } else {
                this.f5046c[i10 + c(i10) + d10] = cVar;
            }
            this.f5049f += i11;
        }

        public final boolean h(int i10) {
            return i10 >= 0 && i10 <= d.f5043c.c().length - 1;
        }

        public final int i() {
            return vb.b.b(this.f5045b.readByte(), 255);
        }

        public final h j() {
            int i10 = i();
            boolean z10 = (i10 & Log.TAG_YOUTUBE) == 128;
            long m10 = m(i10, 127);
            if (!z10) {
                return this.f5045b.o(m10);
            }
            e eVar = new e();
            k.f5204d.b(this.f5045b, m10, eVar);
            return eVar.J0();
        }

        public final void k() {
            while (!this.f5045b.C()) {
                int b10 = vb.b.b(this.f5045b.readByte(), 255);
                if (b10 == 128) {
                    throw new IOException("index == 0");
                } else if ((b10 & Log.TAG_YOUTUBE) == 128) {
                    l(m(b10, 127) - 1);
                } else if (b10 == 64) {
                    o();
                } else if ((b10 & 64) == 64) {
                    n(m(b10, 63) - 1);
                } else if ((b10 & 32) == 32) {
                    int m10 = m(b10, 31);
                    this.f5051h = m10;
                    if (m10 < 0 || m10 > this.f5050g) {
                        throw new IOException("Invalid dynamic table size update " + this.f5051h);
                    }
                    a();
                } else if (b10 == 16 || b10 == 0) {
                    q();
                } else {
                    p(m(b10, 15) - 1);
                }
            }
        }

        public final void l(int i10) {
            if (h(i10)) {
                this.f5044a.add(d.f5043c.c()[i10]);
                return;
            }
            int c10 = c(i10 - d.f5043c.c().length);
            if (c10 >= 0) {
                c[] cVarArr = this.f5046c;
                if (c10 < cVarArr.length) {
                    List<c> list = this.f5044a;
                    c cVar = cVarArr[c10];
                    k.c(cVar);
                    list.add(cVar);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        public final int m(int i10, int i11) {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int i14 = i();
                if ((i14 & Log.TAG_YOUTUBE) == 0) {
                    return i11 + (i14 << i13);
                }
                i11 += (i14 & 127) << i13;
                i13 += 7;
            }
        }

        public final void n(int i10) {
            g(-1, new c(f(i10), j()));
        }

        public final void o() {
            g(-1, new c(d.f5043c.a(j()), j()));
        }

        public final void p(int i10) {
            this.f5044a.add(new c(f(i10), j()));
        }

        public final void q() {
            this.f5044a.add(new c(d.f5043c.a(j()), j()));
        }

        public a(a0 a0Var, int i10, int i11, int i12, ra.g gVar) {
            this(a0Var, i10, (i12 & 4) != 0 ? i10 : i11);
        }
    }

    public static final class b {
        public int f5052a;
        public boolean f5053b;
        public int f5054c;
        public c[] f5055d;
        public int f5056e;
        public int f5057f;
        public int f5058g;
        public int f5059h;
        public final boolean f5060i;
        public final e f5061j;

        public b(int i10, boolean z10, e eVar) {
            k.e(eVar, "out");
            this.f5059h = i10;
            this.f5060i = z10;
            this.f5061j = eVar;
            this.f5052a = Integer.MAX_VALUE;
            this.f5054c = i10;
            c[] cVarArr = new c[8];
            this.f5055d = cVarArr;
            this.f5056e = cVarArr.length - 1;
        }

        public final void a() {
            int i10 = this.f5054c;
            int i11 = this.f5058g;
            if (i10 >= i11) {
                return;
            }
            if (i10 == 0) {
                b();
            } else {
                c(i11 - i10);
            }
        }

        public final void b() {
            ja.h.j(this.f5055d, null, 0, 0, 6, null);
            this.f5056e = this.f5055d.length - 1;
            this.f5057f = 0;
            this.f5058g = 0;
        }

        public final int c(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f5055d.length;
                while (true) {
                    length--;
                    i11 = this.f5056e;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    c cVar = this.f5055d[length];
                    k.c(cVar);
                    i10 -= cVar.f5038a;
                    int i13 = this.f5058g;
                    c cVar2 = this.f5055d[length];
                    k.c(cVar2);
                    this.f5058g = i13 - cVar2.f5038a;
                    this.f5057f--;
                    i12++;
                }
                c[] cVarArr = this.f5055d;
                System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f5057f);
                c[] cVarArr2 = this.f5055d;
                int i14 = this.f5056e;
                Arrays.fill(cVarArr2, i14 + 1, i14 + 1 + i12, (Object) null);
                this.f5056e += i12;
            }
            return i12;
        }

        public final void d(c cVar) {
            int i10 = cVar.f5038a;
            int i11 = this.f5054c;
            if (i10 > i11) {
                b();
                return;
            }
            c((this.f5058g + i10) - i11);
            int i12 = this.f5057f + 1;
            c[] cVarArr = this.f5055d;
            if (i12 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f5056e = this.f5055d.length - 1;
                this.f5055d = cVarArr2;
            }
            int i13 = this.f5056e;
            this.f5056e = i13 - 1;
            this.f5055d[i13] = cVar;
            this.f5057f++;
            this.f5058g += i10;
        }

        public final void e(int i10) {
            this.f5059h = i10;
            int min = Math.min(i10, (int) Log.TAG_VIDEO);
            int i11 = this.f5054c;
            if (i11 != min) {
                if (min < i11) {
                    this.f5052a = Math.min(this.f5052a, min);
                }
                this.f5053b = true;
                this.f5054c = min;
                a();
            }
        }

        public final void f(h hVar) {
            k.e(hVar, "data");
            if (this.f5060i) {
                k kVar = k.f5204d;
                if (kVar.d(hVar) < hVar.r()) {
                    e eVar = new e();
                    kVar.c(hVar, eVar);
                    h J0 = eVar.J0();
                    h(J0.r(), 127, Log.TAG_YOUTUBE);
                    this.f5061j.n0(J0);
                    return;
                }
            }
            h(hVar.r(), 127, 0);
            this.f5061j.n0(hVar);
        }

        public final void g(java.util.List<cc.c> r14) {
            throw new UnsupportedOperationException("Method not decompiled: cc.d.b.g(java.util.List):void");
        }

        public final void h(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.f5061j.D(i10 | i12);
                return;
            }
            this.f5061j.D(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f5061j.D(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.f5061j.D(i13);
        }

        public b(int i10, boolean z10, e eVar, int i11, ra.g gVar) {
            this((i11 & 1) != 0 ? Log.TAG_EMOJI : i10, (i11 & 2) != 0 ? true : z10, eVar);
        }
    }
}
