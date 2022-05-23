package okhttp3.internal.publicsuffix;

import ab.o;
import dc.h;
import hc.l;
import ia.q;
import ja.m;
import ja.n;
import ja.v;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import ra.g;
import ra.k;
import vb.b;
import za.i;

public final class PublicSuffixDatabase {
    public final AtomicBoolean f19891a = new AtomicBoolean(false);
    public final CountDownLatch f19892b = new CountDownLatch(1);
    public byte[] f19893c;
    public byte[] f19894d;
    public static final a f19890h = new a(null);
    public static final byte[] f19887e = {(byte) 42};
    public static final List<String> f19888f = m.b("*");
    public static final PublicSuffixDatabase f19889g = new PublicSuffixDatabase();

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }

        public final String b(byte[] bArr, byte[][] bArr2, int i10) {
            int i11;
            boolean z10;
            int i12;
            int b10;
            int length = bArr.length;
            int i13 = 0;
            while (i13 < length) {
                int i14 = (i13 + length) / 2;
                while (i14 > -1 && bArr[i14] != ((byte) 10)) {
                    i14--;
                }
                int i15 = i14 + 1;
                int i16 = 1;
                while (true) {
                    i11 = i15 + i16;
                    if (bArr[i11] == ((byte) 10)) {
                        break;
                    }
                    i16++;
                }
                int i17 = i11 - i15;
                int i18 = i10;
                boolean z11 = false;
                int i19 = 0;
                int i20 = 0;
                while (true) {
                    if (z11) {
                        i12 = 46;
                        z10 = false;
                    } else {
                        i12 = b.b(bArr2[i18][i19], 255);
                        z10 = z11;
                    }
                    b10 = i12 - b.b(bArr[i15 + i20], 255);
                    if (b10 != 0) {
                        break;
                    }
                    i20++;
                    i19++;
                    if (i20 == i17) {
                        break;
                    } else if (bArr2[i18].length != i19) {
                        z11 = z10;
                    } else if (i18 == bArr2.length - 1) {
                        break;
                    } else {
                        i18++;
                        z11 = true;
                        i19 = -1;
                    }
                }
                if (b10 >= 0) {
                    if (b10 <= 0) {
                        int i21 = i17 - i20;
                        int length2 = bArr2[i18].length - i19;
                        int length3 = bArr2.length;
                        for (int i22 = i18 + 1; i22 < length3; i22++) {
                            length2 += bArr2[i22].length;
                        }
                        if (length2 >= i21) {
                            if (length2 <= i21) {
                                Charset charset = StandardCharsets.UTF_8;
                                k.d(charset, "UTF_8");
                                return new String(bArr, i15, i17, charset);
                            }
                        }
                    }
                    i13 = i11 + 1;
                }
                length = i15 - 1;
            }
            return null;
        }

        public final PublicSuffixDatabase c() {
            return PublicSuffixDatabase.f19889g;
        }
    }

    public final List<String> b(List<String> list) {
        String str;
        String str2;
        String str3;
        List<String> list2;
        List<String> list3;
        if (this.f19891a.get() || !this.f19891a.compareAndSet(false, true)) {
            try {
                this.f19892b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            e();
        }
        if (this.f19893c != null) {
            int size = list.size();
            byte[][] bArr = new byte[size];
            for (int i10 = 0; i10 < size; i10++) {
                String str4 = list.get(i10);
                Charset charset = StandardCharsets.UTF_8;
                k.d(charset, "UTF_8");
                Objects.requireNonNull(str4, "null cannot be cast to non-null type java.lang.String");
                byte[] bytes = str4.getBytes(charset);
                k.d(bytes, "(this as java.lang.String).getBytes(charset)");
                bArr[i10] = bytes;
            }
            int i11 = 0;
            while (true) {
                str = null;
                if (i11 >= size) {
                    str2 = null;
                    break;
                }
                a aVar = f19890h;
                byte[] bArr2 = this.f19893c;
                if (bArr2 == null) {
                    k.n("publicSuffixListBytes");
                }
                str2 = aVar.b(bArr2, bArr, i11);
                if (str2 != null) {
                    break;
                }
                i11++;
            }
            if (size > 1) {
                byte[][] bArr3 = (byte[][]) bArr.clone();
                int length = bArr3.length - 1;
                for (int i12 = 0; i12 < length; i12++) {
                    bArr3[i12] = f19887e;
                    a aVar2 = f19890h;
                    byte[] bArr4 = this.f19893c;
                    if (bArr4 == null) {
                        k.n("publicSuffixListBytes");
                    }
                    String b10 = aVar2.b(bArr4, bArr3, i12);
                    if (b10 != null) {
                        str3 = b10;
                        break;
                    }
                }
            }
            str3 = null;
            if (str3 != null) {
                int i13 = size - 1;
                int i14 = 0;
                while (true) {
                    if (i14 >= i13) {
                        break;
                    }
                    a aVar3 = f19890h;
                    byte[] bArr5 = this.f19894d;
                    if (bArr5 == null) {
                        k.n("publicSuffixExceptionListBytes");
                    }
                    String b11 = aVar3.b(bArr5, bArr, i14);
                    if (b11 != null) {
                        str = b11;
                        break;
                    }
                    i14++;
                }
            }
            if (str != null) {
                return o.h0('!' + str, new char[]{'.'}, false, 0, 6, null);
            } else if (str2 == null && str3 == null) {
                return f19888f;
            } else {
                if (str2 == null || (list2 = o.h0(str2, new char[]{'.'}, false, 0, 6, null)) == null) {
                    list2 = n.f();
                }
                if (str3 == null || (list3 = o.h0(str3, new char[]{'.'}, false, 0, 6, null)) == null) {
                    list3 = n.f();
                }
                return list2.size() > list3.size() ? list2 : list3;
            }
        } else {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
    }

    public final String c(String str) {
        int i10;
        int i11;
        k.e(str, "domain");
        String unicode = IDN.toUnicode(str);
        k.d(unicode, "unicodeDomain");
        List<String> f10 = f(unicode);
        List<String> b10 = b(f10);
        if (f10.size() == b10.size() && b10.get(0).charAt(0) != '!') {
            return null;
        }
        if (b10.get(0).charAt(0) == '!') {
            i11 = f10.size();
            i10 = b10.size();
        } else {
            i11 = f10.size();
            i10 = b10.size() + 1;
        }
        return i.h(i.b(v.y(f(str)), i11 - i10), ".", null, null, 0, null, null, 62, null);
    }

    public final void d() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream != null) {
            hc.g b10 = hc.o.b(new l(hc.o.j(resourceAsStream)));
            th = null;
            try {
                byte[] i02 = b10.i0(b10.readInt());
                byte[] i03 = b10.i0(b10.readInt());
                q qVar = q.f14159a;
                synchronized (this) {
                    k.c(i02);
                    this.f19893c = i02;
                    k.c(i03);
                    this.f19894d = i03;
                }
                this.f19892b.countDown();
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
    }

    public final void e() {
        boolean z10 = false;
        while (true) {
            try {
                try {
                    d();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z10 = true;
                } catch (IOException e10) {
                    h.f7333c.g().j("Failed to read public suffix list", 5, e10);
                    if (z10) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final List<String> f(String str) {
        List<String> h02 = o.h0(str, new char[]{'.'}, false, 0, 6, null);
        return k.b((String) v.I(h02), "") ? v.A(h02, 1) : h02;
    }
}
