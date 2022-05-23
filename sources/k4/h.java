package k4;

import c5.a0;
import c5.b0;
import c5.l0;
import c5.s;
import f4.e;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.thunderdog.challegram.Log;

public final class h extends f4.h {
    public static final a f15642b = g.f15641a;
    public final a f15643a;

    public interface a {
        boolean a(int i10, int i11, int i12, int i13, int i14);
    }

    public static final class b {
        public final int f15644a;
        public final boolean f15645b;
        public final int f15646c;

        public b(int i10, boolean z10, int i11) {
            this.f15644a = i10;
            this.f15645b = z10;
            this.f15646c = i11;
        }
    }

    public h() {
        this(null);
    }

    public static int A(b0 b0Var, int i10) {
        byte[] d10 = b0Var.d();
        int e10 = b0Var.e();
        int i11 = e10;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= e10 + i10) {
                return i10;
            }
            if ((d10[i11] & 255) == 255 && d10[i12] == 0) {
                System.arraycopy(d10, i11 + 2, d10, i12, (i10 - (i11 - e10)) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    public static boolean B(c5.b0 r18, int r19, int r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: k4.h.B(c5.b0, int, int, boolean):boolean");
    }

    public static byte[] d(byte[] bArr, int i10, int i11) {
        if (i11 <= i10) {
            return l0.f4846f;
        }
        return Arrays.copyOfRange(bArr, i10, i11);
    }

    public static k4.a f(b0 b0Var, int i10, int i11) {
        int i12;
        String str;
        int D = b0Var.D();
        String v10 = v(D);
        int i13 = i10 - 1;
        byte[] bArr = new byte[i13];
        b0Var.j(bArr, 0, i13);
        if (i11 == 2) {
            String valueOf = String.valueOf(z6.b.c(new String(bArr, 0, 3, "ISO-8859-1")));
            str = valueOf.length() != 0 ? "image/".concat(valueOf) : new String("image/");
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            i12 = 2;
        } else {
            i12 = y(bArr, 0);
            String c10 = z6.b.c(new String(bArr, 0, i12, "ISO-8859-1"));
            if (c10.indexOf(47) == -1) {
                if (c10.length() != 0) {
                    str = "image/".concat(c10);
                } else {
                    c10 = new String("image/");
                }
            }
            str = c10;
        }
        int i14 = i12 + 2;
        int x10 = x(bArr, i14, D);
        return new k4.a(str, new String(bArr, i14, x10 - i14, v10), bArr[i12 + 1] & 255, d(bArr, x10 + u(D), i13));
    }

    public static k4.b g(b0 b0Var, int i10, String str) {
        byte[] bArr = new byte[i10];
        b0Var.j(bArr, 0, i10);
        return new k4.b(str, bArr);
    }

    public static c h(b0 b0Var, int i10, int i11, boolean z10, int i12, a aVar) {
        int e10 = b0Var.e();
        int y10 = y(b0Var.d(), e10);
        String str = new String(b0Var.d(), e10, y10 - e10, "ISO-8859-1");
        b0Var.P(y10 + 1);
        int n10 = b0Var.n();
        int n11 = b0Var.n();
        long F = b0Var.F();
        long j10 = F == 4294967295L ? -1L : F;
        long F2 = b0Var.F();
        long j11 = F2 == 4294967295L ? -1L : F2;
        ArrayList arrayList = new ArrayList();
        int i13 = e10 + i10;
        while (b0Var.e() < i13) {
            i k10 = k(i11, b0Var, z10, i12, aVar);
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        return new c(str, n10, n11, j10, j11, (i[]) arrayList.toArray(new i[0]));
    }

    public static d i(b0 b0Var, int i10, int i11, boolean z10, int i12, a aVar) {
        int e10 = b0Var.e();
        int y10 = y(b0Var.d(), e10);
        String str = new String(b0Var.d(), e10, y10 - e10, "ISO-8859-1");
        b0Var.P(y10 + 1);
        int D = b0Var.D();
        boolean z11 = (D & 2) != 0;
        boolean z12 = (D & 1) != 0;
        int D2 = b0Var.D();
        String[] strArr = new String[D2];
        for (int i13 = 0; i13 < D2; i13++) {
            int e11 = b0Var.e();
            int y11 = y(b0Var.d(), e11);
            strArr[i13] = new String(b0Var.d(), e11, y11 - e11, "ISO-8859-1");
            b0Var.P(y11 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = e10 + i10;
        while (b0Var.e() < i14) {
            i k10 = k(i11, b0Var, z10, i12, aVar);
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        return new d(str, z11, z12, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    public static e j(b0 b0Var, int i10) {
        if (i10 < 4) {
            return null;
        }
        int D = b0Var.D();
        String v10 = v(D);
        byte[] bArr = new byte[3];
        b0Var.j(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        b0Var.j(bArr2, 0, i11);
        int x10 = x(bArr2, 0, D);
        String str2 = new String(bArr2, 0, x10, v10);
        int u10 = x10 + u(D);
        return new e(str, str2, p(bArr2, u10, x(bArr2, u10, D), v10));
    }

    public static k4.i k(int r19, c5.b0 r20, boolean r21, int r22, k4.h.a r23) {
        throw new UnsupportedOperationException("Method not decompiled: k4.h.k(int, c5.b0, boolean, int, k4.h$a):k4.i");
    }

    public static f l(b0 b0Var, int i10) {
        int D = b0Var.D();
        String v10 = v(D);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        b0Var.j(bArr, 0, i11);
        int y10 = y(bArr, 0);
        String str = new String(bArr, 0, y10, "ISO-8859-1");
        int i12 = y10 + 1;
        int x10 = x(bArr, i12, D);
        String p10 = p(bArr, i12, x10, v10);
        int u10 = x10 + u(D);
        int x11 = x(bArr, u10, D);
        return new f(str, p10, p(bArr, u10, x11, v10), d(bArr, x11 + u(D), i11));
    }

    public static b m(b0 b0Var) {
        if (b0Var.a() < 10) {
            s.i("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int G = b0Var.G();
        boolean z10 = false;
        if (G != 4801587) {
            String valueOf = String.valueOf(String.format("%06X", Integer.valueOf(G)));
            s.i("Id3Decoder", valueOf.length() != 0 ? "Unexpected first three bytes of ID3 tag header: 0x".concat(valueOf) : new String("Unexpected first three bytes of ID3 tag header: 0x"));
            return null;
        }
        int D = b0Var.D();
        b0Var.Q(1);
        int D2 = b0Var.D();
        int C = b0Var.C();
        if (D == 2) {
            if ((D2 & 64) != 0) {
                s.i("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (D == 3) {
            if ((D2 & 64) != 0) {
                int n10 = b0Var.n();
                b0Var.Q(n10);
                C -= n10 + 4;
            }
        } else if (D == 4) {
            if ((D2 & 64) != 0) {
                int C2 = b0Var.C();
                b0Var.Q(C2 - 4);
                C -= C2;
            }
            if ((D2 & 16) != 0) {
                C -= 10;
            }
        } else {
            StringBuilder sb2 = new StringBuilder(57);
            sb2.append("Skipped ID3 tag with unsupported majorVersion=");
            sb2.append(D);
            s.i("Id3Decoder", sb2.toString());
            return null;
        }
        if (D < 4 && (D2 & Log.TAG_YOUTUBE) != 0) {
            z10 = true;
        }
        return new b(D, z10, C);
    }

    public static k n(b0 b0Var, int i10) {
        int J = b0Var.J();
        int G = b0Var.G();
        int G2 = b0Var.G();
        int D = b0Var.D();
        int D2 = b0Var.D();
        a0 a0Var = new a0();
        a0Var.m(b0Var);
        int i11 = ((i10 - 10) * 8) / (D + D2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int h10 = a0Var.h(D);
            int h11 = a0Var.h(D2);
            iArr[i12] = h10;
            iArr2[i12] = h11;
        }
        return new k(J, G, G2, iArr, iArr2);
    }

    public static l o(b0 b0Var, int i10) {
        byte[] bArr = new byte[i10];
        b0Var.j(bArr, 0, i10);
        int y10 = y(bArr, 0);
        return new l(new String(bArr, 0, y10, "ISO-8859-1"), d(bArr, y10 + 1, i10));
    }

    public static String p(byte[] bArr, int i10, int i11, String str) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, str);
    }

    public static m q(b0 b0Var, int i10, String str) {
        if (i10 < 1) {
            return null;
        }
        int D = b0Var.D();
        String v10 = v(D);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        b0Var.j(bArr, 0, i11);
        return new m(str, null, new String(bArr, 0, x(bArr, 0, D), v10));
    }

    public static m r(b0 b0Var, int i10) {
        if (i10 < 1) {
            return null;
        }
        int D = b0Var.D();
        String v10 = v(D);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        b0Var.j(bArr, 0, i11);
        int x10 = x(bArr, 0, D);
        String str = new String(bArr, 0, x10, v10);
        int u10 = x10 + u(D);
        return new m("TXXX", str, p(bArr, u10, x(bArr, u10, D), v10));
    }

    public static n s(b0 b0Var, int i10, String str) {
        byte[] bArr = new byte[i10];
        b0Var.j(bArr, 0, i10);
        return new n(str, null, new String(bArr, 0, y(bArr, 0), "ISO-8859-1"));
    }

    public static n t(b0 b0Var, int i10) {
        if (i10 < 1) {
            return null;
        }
        int D = b0Var.D();
        String v10 = v(D);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        b0Var.j(bArr, 0, i11);
        int x10 = x(bArr, 0, D);
        String str = new String(bArr, 0, x10, v10);
        int u10 = x10 + u(D);
        return new n("WXXX", str, p(bArr, u10, y(bArr, u10), "ISO-8859-1"));
    }

    public static int u(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static String v(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    public static String w(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static int x(byte[] bArr, int i10, int i11) {
        int y10 = y(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return y10;
        }
        while (y10 < bArr.length - 1) {
            if ((y10 - i10) % 2 == 0 && bArr[y10 + 1] == 0) {
                return y10;
            }
            y10 = y(bArr, y10 + 1);
        }
        return bArr.length;
    }

    public static int y(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    public static boolean z(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    @Override
    public f4.a b(e eVar, ByteBuffer byteBuffer) {
        return e(byteBuffer.array(), byteBuffer.limit());
    }

    public f4.a e(byte[] bArr, int i10) {
        ArrayList arrayList = new ArrayList();
        b0 b0Var = new b0(bArr, i10);
        b m10 = m(b0Var);
        if (m10 == null) {
            return null;
        }
        int e10 = b0Var.e();
        int i11 = m10.f15644a == 2 ? 6 : 10;
        int i12 = m10.f15646c;
        if (m10.f15645b) {
            i12 = A(b0Var, m10.f15646c);
        }
        b0Var.O(e10 + i12);
        boolean z10 = false;
        if (!B(b0Var, m10.f15644a, i11, false)) {
            if (m10.f15644a != 4 || !B(b0Var, 4, i11, true)) {
                int i13 = m10.f15644a;
                StringBuilder sb2 = new StringBuilder(56);
                sb2.append("Failed to validate ID3 tag with majorVersion=");
                sb2.append(i13);
                s.i("Id3Decoder", sb2.toString());
                return null;
            }
            z10 = true;
        }
        while (b0Var.a() >= i11) {
            i k10 = k(m10.f15644a, b0Var, z10, i11, this.f15643a);
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        return new f4.a(arrayList);
    }

    public h(a aVar) {
        this.f15643a = aVar;
    }
}
