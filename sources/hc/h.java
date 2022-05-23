package hc;

import ab.n;
import ic.b;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Objects;
import ra.g;
import ra.k;

public class h implements Serializable, Comparable<h> {
    public transient int f12646a;
    public transient String f12647b;
    public final byte[] f12648c;
    public static final a N = new a(null);
    public static final h M = new h(new byte[0]);

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }

        public static h e(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = bArr.length;
            }
            return aVar.d(bArr, i10, i11);
        }

        public final h a(String str) {
            int e10;
            int e11;
            k.e(str, "$this$decodeHex");
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = i10 * 2;
                    e10 = b.e(str.charAt(i11));
                    e11 = b.e(str.charAt(i11 + 1));
                    bArr[i10] = (byte) ((e10 << 4) + e11);
                }
                return new h(bArr);
            }
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }

        public final h b(String str, Charset charset) {
            k.e(str, "$this$encode");
            k.e(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            k.d(bytes, "(this as java.lang.String).getBytes(charset)");
            return new h(bytes);
        }

        public final h c(String str) {
            k.e(str, "$this$encodeUtf8");
            h hVar = new h(b.a(str));
            hVar.o(str);
            return hVar;
        }

        public final h d(byte[] bArr, int i10, int i11) {
            k.e(bArr, "$this$toByteString");
            c.b(bArr.length, i10, i11);
            return new h(ja.h.h(bArr, i10, i11 + i10));
        }
    }

    public h(byte[] bArr) {
        k.e(bArr, "data");
        this.f12648c = bArr;
    }

    public String a() {
        return hc.a.b(e(), null, 1, null);
    }

    public int compareTo(hc.h r10) {
        throw new UnsupportedOperationException("Method not decompiled: hc.h.compareTo(hc.h):int");
    }

    public h c(String str) {
        k.e(str, "algorithm");
        byte[] digest = MessageDigest.getInstance(str).digest(this.f12648c);
        k.d(digest, "MessageDigest.getInstance(algorithm).digest(data)");
        return new h(digest);
    }

    public final byte d(int i10) {
        return k(i10);
    }

    public final byte[] e() {
        return this.f12648c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.r() == e().length && hVar.m(0, e(), 0, e().length)) {
                return true;
            }
        }
        return false;
    }

    public final int f() {
        return this.f12646a;
    }

    public int g() {
        return e().length;
    }

    public final String h() {
        return this.f12647b;
    }

    public int hashCode() {
        int f10 = f();
        if (f10 != 0) {
            return f10;
        }
        int hashCode = Arrays.hashCode(e());
        n(hashCode);
        return hashCode;
    }

    public String i() {
        byte[] e10;
        char[] cArr = new char[e().length * 2];
        int i10 = 0;
        for (byte b10 : e()) {
            int i11 = i10 + 1;
            cArr[i10] = b.f()[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = b.f()[b10 & 15];
        }
        return new String(cArr);
    }

    public byte[] j() {
        return e();
    }

    public byte k(int i10) {
        return e()[i10];
    }

    public boolean l(int i10, h hVar, int i11, int i12) {
        k.e(hVar, "other");
        return hVar.m(i11, e(), i10, i12);
    }

    public boolean m(int i10, byte[] bArr, int i11, int i12) {
        k.e(bArr, "other");
        return i10 >= 0 && i10 <= e().length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && c.a(e(), i10, bArr, i11, i12);
    }

    public final void n(int i10) {
        this.f12646a = i10;
    }

    public final void o(String str) {
        this.f12647b = str;
    }

    public h p() {
        return c("SHA-1");
    }

    public h q() {
        return c("SHA-256");
    }

    public final int r() {
        return g();
    }

    public final boolean s(h hVar) {
        k.e(hVar, "prefix");
        return l(0, hVar, 0, hVar.r());
    }

    public h t() {
        byte b10;
        for (int i10 = 0; i10 < e().length; i10++) {
            byte b11 = e()[i10];
            byte b12 = (byte) 65;
            if (b11 >= b12 && b11 <= (b10 = (byte) 90)) {
                byte[] e10 = e();
                byte[] copyOf = Arrays.copyOf(e10, e10.length);
                k.d(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i10] = (byte) (b11 + 32);
                for (int i11 = i10 + 1; i11 < copyOf.length; i11++) {
                    byte b13 = copyOf[i11];
                    if (b13 >= b12 && b13 <= b10) {
                        copyOf[i11] = (byte) (b13 + 32);
                    }
                }
                return new h(copyOf);
            }
        }
        return this;
    }

    public String toString() {
        int c10;
        boolean z10 = true;
        if (e().length == 0) {
            return "[size=0]";
        }
        c10 = b.c(e(), 64);
        if (c10 != -1) {
            String u10 = u();
            Objects.requireNonNull(u10, "null cannot be cast to non-null type java.lang.String");
            String substring = u10.substring(0, c10);
            k.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String t10 = n.t(n.t(n.t(substring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (c10 < u10.length()) {
                return "[size=" + e().length + " text=" + t10 + "…]";
            }
            return "[text=" + t10 + ']';
        } else if (e().length <= 64) {
            return "[hex=" + i() + ']';
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[size=");
            sb2.append(e().length);
            sb2.append(" hex=");
            if (64 > e().length) {
                z10 = false;
            }
            if (z10) {
                sb2.append((64 == e().length ? this : new h(ja.h.h(e(), 0, 64))).i());
                sb2.append("…]");
                return sb2.toString();
            }
            throw new IllegalArgumentException(("endIndex > length(" + e().length + ')').toString());
        }
    }

    public String u() {
        String h10 = h();
        if (h10 != null) {
            return h10;
        }
        String b10 = b.b(j());
        o(b10);
        return b10;
    }

    public void v(e eVar, int i10, int i11) {
        k.e(eVar, "buffer");
        b.d(this, eVar, i10, i11);
    }
}
