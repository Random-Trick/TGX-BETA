package p095gc;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Objects;
import p109hc.C5073b;
import p123ia.C5294h;
import qa.C8294g;
import qa.C8298k;
import za.C11451n;

public class C4552h implements Serializable, Comparable<C4552h> {
    public transient int f14974a;
    public transient String f14975b;
    public final byte[] f14976c;
    public static final C4553a f14973N = new C4553a(null);
    public static final C4552h f14972M = new C4552h(new byte[0]);

    public static final class C4553a {
        public C4553a() {
        }

        public static C4552h m27399e(C4553a aVar, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = bArr.length;
            }
            return aVar.m27400d(bArr, i, i2);
        }

        public final C4552h m27403a(String str) {
            int e;
            int e2;
            C8298k.m12933e(str, "$this$decodeHex");
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    e = C5073b.m24037e(str.charAt(i2));
                    e2 = C5073b.m24037e(str.charAt(i2 + 1));
                    bArr[i] = (byte) ((e << 4) + e2);
                }
                return new C4552h(bArr);
            }
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }

        public final C4552h m27402b(String str, Charset charset) {
            C8298k.m12933e(str, "$this$encode");
            C8298k.m12933e(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            C8298k.m12934d(bytes, "(this as java.lang.String).getBytes(charset)");
            return new C4552h(bytes);
        }

        public final C4552h m27401c(String str) {
            C8298k.m12933e(str, "$this$encodeUtf8");
            C4552h hVar = new C4552h(C4538b.m27481a(str));
            hVar.m27409o(str);
            return hVar;
        }

        public final C4552h m27400d(byte[] bArr, int i, int i2) {
            C8298k.m12933e(bArr, "$this$toByteString");
            C4542c.m27477b(bArr.length, i, i2);
            return new C4552h(C5294h.m23429h(bArr, i, i2 + i));
        }

        public C4553a(C8294g gVar) {
            this();
        }
    }

    public C4552h(byte[] bArr) {
        C8298k.m12933e(bArr, "data");
        this.f14976c = bArr;
    }

    public String mo27317a() {
        return C4536a.m27482b(m27413e(), null, 1, null);
    }

    public int compareTo(p095gc.C4552h r10) {
        throw new UnsupportedOperationException("Method not decompiled: p095gc.C4552h.compareTo(gc.h):int");
    }

    public C4552h mo27316c(String str) {
        C8298k.m12933e(str, "algorithm");
        byte[] digest = MessageDigest.getInstance(str).digest(this.f14976c);
        C8298k.m12934d(digest, "MessageDigest.getInstance(algorithm).digest(data)");
        return new C4552h(digest);
    }

    public final byte m27414d(int i) {
        return mo27312k(i);
    }

    public final byte[] m27413e() {
        return this.f14976c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4552h) {
            C4552h hVar = (C4552h) obj;
            if (hVar.m27406r() == m27413e().length && hVar.mo27310m(0, m27413e(), 0, m27413e().length)) {
                return true;
            }
        }
        return false;
    }

    public final int m27412f() {
        return this.f14974a;
    }

    public int mo27315g() {
        return m27413e().length;
    }

    public final String m27411h() {
        return this.f14975b;
    }

    public int hashCode() {
        int f = m27412f();
        if (f != 0) {
            return f;
        }
        int hashCode = Arrays.hashCode(m27413e());
        m27410n(hashCode);
        return hashCode;
    }

    public String mo27314i() {
        byte[] e;
        char[] cArr = new char[m27413e().length * 2];
        int i = 0;
        for (byte b : m27413e()) {
            int i2 = i + 1;
            cArr[i] = C5073b.m24036f()[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = C5073b.m24036f()[b & 15];
        }
        return new String(cArr);
    }

    public byte[] mo27313j() {
        return m27413e();
    }

    public byte mo27312k(int i) {
        return m27413e()[i];
    }

    public boolean mo27311l(int i, C4552h hVar, int i2, int i3) {
        C8298k.m12933e(hVar, "other");
        return hVar.mo27310m(i2, m27413e(), i, i3);
    }

    public boolean mo27310m(int i, byte[] bArr, int i2, int i3) {
        C8298k.m12933e(bArr, "other");
        return i >= 0 && i <= m27413e().length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C4542c.m27478a(m27413e(), i, bArr, i2, i3);
    }

    public final void m27410n(int i) {
        this.f14974a = i;
    }

    public final void m27409o(String str) {
        this.f14975b = str;
    }

    public C4552h m27408p() {
        return mo27316c("SHA-1");
    }

    public C4552h m27407q() {
        return mo27316c("SHA-256");
    }

    public final int m27406r() {
        return mo27315g();
    }

    public final boolean m27405s(C4552h hVar) {
        C8298k.m12933e(hVar, "prefix");
        return mo27311l(0, hVar, 0, hVar.m27406r());
    }

    public C4552h mo27309t() {
        byte b;
        for (int i = 0; i < m27413e().length; i++) {
            byte b2 = m27413e()[i];
            byte b3 = (byte) 65;
            if (b2 >= b3 && b2 <= (b = (byte) 90)) {
                byte[] e = m27413e();
                byte[] copyOf = Arrays.copyOf(e, e.length);
                C8298k.m12934d(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new C4552h(copyOf);
            }
        }
        return this;
    }

    public String toString() {
        int c;
        boolean z = true;
        if (m27413e().length == 0) {
            return "[size=0]";
        }
        c = C5073b.m24039c(m27413e(), 64);
        if (c != -1) {
            String u = m27404u();
            Objects.requireNonNull(u, "null cannot be cast to non-null type java.lang.String");
            String substring = u.substring(0, c);
            C8298k.m12934d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String t = C11451n.m625t(C11451n.m625t(C11451n.m625t(substring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (c < u.length()) {
                return "[size=" + m27413e().length + " text=" + t + "…]";
            }
            return "[text=" + t + ']';
        } else if (m27413e().length <= 64) {
            return "[hex=" + mo27314i() + ']';
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[size=");
            sb2.append(m27413e().length);
            sb2.append(" hex=");
            if (64 > m27413e().length) {
                z = false;
            }
            if (z) {
                sb2.append((64 == m27413e().length ? this : new C4552h(C5294h.m23429h(m27413e(), 0, 64))).mo27314i());
                sb2.append("…]");
                return sb2.toString();
            }
            throw new IllegalArgumentException(("endIndex > length(" + m27413e().length + ')').toString());
        }
    }

    public String m27404u() {
        String h = m27411h();
        if (h != null) {
            return h;
        }
        String b = C4538b.m27480b(mo27313j());
        m27409o(b);
        return b;
    }

    public void mo27308v(C4549e eVar, int i, int i2) {
        C8298k.m12933e(eVar, "buffer");
        C5073b.m24038d(this, eVar, i, i2);
    }
}
