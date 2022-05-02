package okhttp3.internal.publicsuffix;

import cc.C2083h;
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
import p095gc.AbstractC4551g;
import p095gc.C4557l;
import p095gc.C4560o;
import p107ha.C5060q;
import p123ia.C5303m;
import p123ia.C5304n;
import p123ia.C5312v;
import p290ub.C9489b;
import p347ya.C10471i;
import qa.C8294g;
import qa.C8298k;
import za.C11452o;

public final class PublicSuffixDatabase {
    public final AtomicBoolean f25338a = new AtomicBoolean(false);
    public final CountDownLatch f25339b = new CountDownLatch(1);
    public byte[] f25340c;
    public byte[] f25341d;
    public static final C7858a f25337h = new C7858a(null);
    public static final byte[] f25334e = {(byte) 42};
    public static final List<String> f25335f = C5303m.m23370b("*");
    public static final PublicSuffixDatabase f25336g = new PublicSuffixDatabase();

    public static final class C7858a {
        public C7858a() {
        }

        public final String m14799b(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            int i3;
            int b;
            int length = bArr.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = (i4 + length) / 2;
                while (i5 > -1 && bArr[i5] != ((byte) 10)) {
                    i5--;
                }
                int i6 = i5 + 1;
                int i7 = 1;
                while (true) {
                    i2 = i6 + i7;
                    if (bArr[i2] == ((byte) 10)) {
                        break;
                    }
                    i7++;
                }
                int i8 = i2 - i6;
                int i9 = i;
                boolean z2 = false;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (z2) {
                        i3 = 46;
                        z = false;
                    } else {
                        i3 = C9489b.m8522b(bArr2[i9][i10], 255);
                        z = z2;
                    }
                    b = i3 - C9489b.m8522b(bArr[i6 + i11], 255);
                    if (b != 0) {
                        break;
                    }
                    i11++;
                    i10++;
                    if (i11 == i8) {
                        break;
                    } else if (bArr2[i9].length != i10) {
                        z2 = z;
                    } else if (i9 == bArr2.length - 1) {
                        break;
                    } else {
                        i9++;
                        z2 = true;
                        i10 = -1;
                    }
                }
                if (b >= 0) {
                    if (b <= 0) {
                        int i12 = i8 - i11;
                        int length2 = bArr2[i9].length - i10;
                        int length3 = bArr2.length;
                        for (int i13 = i9 + 1; i13 < length3; i13++) {
                            length2 += bArr2[i13].length;
                        }
                        if (length2 >= i12) {
                            if (length2 <= i12) {
                                Charset charset = StandardCharsets.UTF_8;
                                C8298k.m12935d(charset, "UTF_8");
                                return new String(bArr, i6, i8, charset);
                            }
                        }
                    }
                    i4 = i2 + 1;
                }
                length = i6 - 1;
            }
            return null;
        }

        public final PublicSuffixDatabase m14798c() {
            return PublicSuffixDatabase.f25336g;
        }

        public C7858a(C8294g gVar) {
            this();
        }
    }

    public final List<String> m14805b(List<String> list) {
        String str;
        String str2;
        String str3;
        List<String> list2;
        List<String> list3;
        if (this.f25338a.get() || !this.f25338a.compareAndSet(false, true)) {
            try {
                this.f25339b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            m14802e();
        }
        if (this.f25340c != null) {
            int size = list.size();
            byte[][] bArr = new byte[size];
            for (int i = 0; i < size; i++) {
                String str4 = list.get(i);
                Charset charset = StandardCharsets.UTF_8;
                C8298k.m12935d(charset, "UTF_8");
                Objects.requireNonNull(str4, "null cannot be cast to non-null type java.lang.String");
                byte[] bytes = str4.getBytes(charset);
                C8298k.m12935d(bytes, "(this as java.lang.String).getBytes(charset)");
                bArr[i] = bytes;
            }
            int i2 = 0;
            while (true) {
                str = null;
                if (i2 >= size) {
                    str2 = null;
                    break;
                }
                C7858a aVar = f25337h;
                byte[] bArr2 = this.f25340c;
                if (bArr2 == null) {
                    C8298k.m12925n("publicSuffixListBytes");
                }
                str2 = aVar.m14799b(bArr2, bArr, i2);
                if (str2 != null) {
                    break;
                }
                i2++;
            }
            if (size > 1) {
                byte[][] bArr3 = (byte[][]) bArr.clone();
                int length = bArr3.length - 1;
                for (int i3 = 0; i3 < length; i3++) {
                    bArr3[i3] = f25334e;
                    C7858a aVar2 = f25337h;
                    byte[] bArr4 = this.f25340c;
                    if (bArr4 == null) {
                        C8298k.m12925n("publicSuffixListBytes");
                    }
                    String b = aVar2.m14799b(bArr4, bArr3, i3);
                    if (b != null) {
                        str3 = b;
                        break;
                    }
                }
            }
            str3 = null;
            if (str3 != null) {
                int i4 = size - 1;
                int i5 = 0;
                while (true) {
                    if (i5 >= i4) {
                        break;
                    }
                    C7858a aVar3 = f25337h;
                    byte[] bArr5 = this.f25341d;
                    if (bArr5 == null) {
                        C8298k.m12925n("publicSuffixExceptionListBytes");
                    }
                    String b2 = aVar3.m14799b(bArr5, bArr, i5);
                    if (b2 != null) {
                        str = b2;
                        break;
                    }
                    i5++;
                }
            }
            if (str != null) {
                return C11452o.m587h0('!' + str, new char[]{'.'}, false, 0, 6, null);
            } else if (str2 == null && str3 == null) {
                return f25335f;
            } else {
                if (str2 == null || (list2 = C11452o.m587h0(str2, new char[]{'.'}, false, 0, 6, null)) == null) {
                    list2 = C5304n.m23366f();
                }
                if (str3 == null || (list3 = C11452o.m587h0(str3, new char[]{'.'}, false, 0, 6, null)) == null) {
                    list3 = C5304n.m23366f();
                }
                return list2.size() > list3.size() ? list2 : list3;
            }
        } else {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
    }

    public final String m14804c(String str) {
        int i;
        int i2;
        C8298k.m12934e(str, "domain");
        String unicode = IDN.toUnicode(str);
        C8298k.m12935d(unicode, "unicodeDomain");
        List<String> f = m14801f(unicode);
        List<String> b = m14805b(f);
        if (f.size() == b.size() && b.get(0).charAt(0) != '!') {
            return null;
        }
        if (b.get(0).charAt(0) == '!') {
            i2 = f.size();
            i = b.size();
        } else {
            i2 = f.size();
            i = b.size() + 1;
        }
        return C10471i.m5062h(C10471i.m5068b(C5312v.m23322y(m14801f(str)), i2 - i), ".", null, null, 0, null, null, 62, null);
    }

    public final void m14803d() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream != null) {
            AbstractC4551g b = C4560o.m27378b(new C4557l(C4560o.m27370j(resourceAsStream)));
            th = null;
            try {
                byte[] g0 = b.mo27332g0(b.readInt());
                byte[] g02 = b.mo27332g0(b.readInt());
                C5060q qVar = C5060q.f17066a;
                synchronized (this) {
                    C8298k.m12936c(g0);
                    this.f25340c = g0;
                    C8298k.m12936c(g02);
                    this.f25341d = g02;
                }
                this.f25339b.countDown();
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
    }

    public final void m14802e() {
        boolean z = false;
        while (true) {
            try {
                try {
                    m14803d();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    C2083h.f7326c.m35674g().m35686j("Failed to read public suffix list", 5, e);
                    if (z) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final List<String> m14801f(String str) {
        List<String> h0 = C11452o.m587h0(str, new char[]{'.'}, false, 0, 6, null);
        return C8298k.m12937b((String) C5312v.m23339I(h0), "") ? C5312v.m23347A(h0, 1) : h0;
    }
}
