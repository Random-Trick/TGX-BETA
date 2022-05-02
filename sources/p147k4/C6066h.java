package p147k4;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.thunderdog.challegram.Log;
import p020b5.C1187a0;
import p020b5.C1189b0;
import p020b5.C1216l0;
import p020b5.C1230s;
import p073f4.AbstractC4270h;
import p073f4.C4260a;
import p073f4.C4267e;
import p343y6.C10422b;

public final class C6066h extends AbstractC4270h {
    public static final AbstractC6067a f19284b = C6065g.f19283a;
    public final AbstractC6067a f19285a;

    public interface AbstractC6067a {
        boolean mo1156a(int i, int i2, int i3, int i4, int i5);
    }

    public static final class C6068b {
        public final int f19286a;
        public final boolean f19287b;
        public final int f19288c;

        public C6068b(int i, boolean z, int i2) {
            this.f19286a = i;
            this.f19287b = z;
            this.f19288c = i2;
        }
    }

    public C6066h() {
        this(null);
    }

    public static int m21430A(C1189b0 b0Var, int i) {
        byte[] d = b0Var.m38142d();
        int e = b0Var.m38141e();
        int i2 = e;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= e + i) {
                return i;
            }
            if ((d[i2] & 255) == 255 && d[i3] == 0) {
                System.arraycopy(d, i2 + 2, d, i3, (i - (i2 - e)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    public static boolean m21429B(p020b5.C1189b0 r18, int r19, int r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: p147k4.C6066h.m21429B(b5.b0, int, int, boolean):boolean");
    }

    public static byte[] m21427d(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return C1216l0.f4531f;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    public static C6053a m21425f(C1189b0 b0Var, int i, int i2) {
        int i3;
        String str;
        int D = b0Var.m38159D();
        String v = m21409v(D);
        int i4 = i - 1;
        byte[] bArr = new byte[i4];
        b0Var.m38136j(bArr, 0, i4);
        if (i2 == 2) {
            String valueOf = String.valueOf(C10422b.m5149c(new String(bArr, 0, 3, "ISO-8859-1")));
            str = valueOf.length() != 0 ? "image/".concat(valueOf) : new String("image/");
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            i3 = 2;
        } else {
            i3 = m21406y(bArr, 0);
            String c = C10422b.m5149c(new String(bArr, 0, i3, "ISO-8859-1"));
            if (c.indexOf(47) == -1) {
                if (c.length() != 0) {
                    str = "image/".concat(c);
                } else {
                    c = new String("image/");
                }
            }
            str = c;
        }
        int i5 = i3 + 2;
        int x = m21407x(bArr, i5, D);
        return new C6053a(str, new String(bArr, i5, x - i5, v), bArr[i3 + 1] & 255, m21427d(bArr, x + m21410u(D), i4));
    }

    public static C6055b m21424g(C1189b0 b0Var, int i, String str) {
        byte[] bArr = new byte[i];
        b0Var.m38136j(bArr, 0, i);
        return new C6055b(str, bArr);
    }

    public static C6057c m21423h(C1189b0 b0Var, int i, int i2, boolean z, int i3, AbstractC6067a aVar) {
        int e = b0Var.m38141e();
        int y = m21406y(b0Var.m38142d(), e);
        String str = new String(b0Var.m38142d(), e, y - e, "ISO-8859-1");
        b0Var.m38147P(y + 1);
        int n = b0Var.m38132n();
        int n2 = b0Var.m38132n();
        long F = b0Var.m38157F();
        long j = F == 4294967295L ? -1L : F;
        long F2 = b0Var.m38157F();
        long j2 = F2 == 4294967295L ? -1L : F2;
        ArrayList arrayList = new ArrayList();
        int i4 = e + i;
        while (b0Var.m38141e() < i4) {
            AbstractC6069i k = m21420k(i2, b0Var, z, i3, aVar);
            if (k != null) {
                arrayList.add(k);
            }
        }
        return new C6057c(str, n, n2, j, j2, (AbstractC6069i[]) arrayList.toArray(new AbstractC6069i[0]));
    }

    public static C6059d m21422i(C1189b0 b0Var, int i, int i2, boolean z, int i3, AbstractC6067a aVar) {
        int e = b0Var.m38141e();
        int y = m21406y(b0Var.m38142d(), e);
        String str = new String(b0Var.m38142d(), e, y - e, "ISO-8859-1");
        b0Var.m38147P(y + 1);
        int D = b0Var.m38159D();
        boolean z2 = (D & 2) != 0;
        boolean z3 = (D & 1) != 0;
        int D2 = b0Var.m38159D();
        String[] strArr = new String[D2];
        for (int i4 = 0; i4 < D2; i4++) {
            int e2 = b0Var.m38141e();
            int y2 = m21406y(b0Var.m38142d(), e2);
            strArr[i4] = new String(b0Var.m38142d(), e2, y2 - e2, "ISO-8859-1");
            b0Var.m38147P(y2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = e + i;
        while (b0Var.m38141e() < i5) {
            AbstractC6069i k = m21420k(i2, b0Var, z, i3, aVar);
            if (k != null) {
                arrayList.add(k);
            }
        }
        return new C6059d(str, z2, z3, strArr, (AbstractC6069i[]) arrayList.toArray(new AbstractC6069i[0]));
    }

    public static C6061e m21421j(C1189b0 b0Var, int i) {
        if (i < 4) {
            return null;
        }
        int D = b0Var.m38159D();
        String v = m21409v(D);
        byte[] bArr = new byte[3];
        b0Var.m38136j(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        b0Var.m38136j(bArr2, 0, i2);
        int x = m21407x(bArr2, 0, D);
        String str2 = new String(bArr2, 0, x, v);
        int u = x + m21410u(D);
        return new C6061e(str, str2, m21415p(bArr2, u, m21407x(bArr2, u, D), v));
    }

    public static p147k4.AbstractC6069i m21420k(int r19, p020b5.C1189b0 r20, boolean r21, int r22, p147k4.C6066h.AbstractC6067a r23) {
        throw new UnsupportedOperationException("Method not decompiled: p147k4.C6066h.m21420k(int, b5.b0, boolean, int, k4.h$a):k4.i");
    }

    public static C6063f m21419l(C1189b0 b0Var, int i) {
        int D = b0Var.m38159D();
        String v = m21409v(D);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        b0Var.m38136j(bArr, 0, i2);
        int y = m21406y(bArr, 0);
        String str = new String(bArr, 0, y, "ISO-8859-1");
        int i3 = y + 1;
        int x = m21407x(bArr, i3, D);
        String p = m21415p(bArr, i3, x, v);
        int u = x + m21410u(D);
        int x2 = m21407x(bArr, u, D);
        return new C6063f(str, p, m21415p(bArr, u, x2, v), m21427d(bArr, x2 + m21410u(D), i2));
    }

    public static C6068b m21418m(C1189b0 b0Var) {
        if (b0Var.m38145a() < 10) {
            C1230s.m37884i("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int G = b0Var.m38156G();
        boolean z = false;
        if (G != 4801587) {
            String valueOf = String.valueOf(String.format("%06X", Integer.valueOf(G)));
            C1230s.m37884i("Id3Decoder", valueOf.length() != 0 ? "Unexpected first three bytes of ID3 tag header: 0x".concat(valueOf) : new String("Unexpected first three bytes of ID3 tag header: 0x"));
            return null;
        }
        int D = b0Var.m38159D();
        b0Var.m38146Q(1);
        int D2 = b0Var.m38159D();
        int C = b0Var.m38160C();
        if (D == 2) {
            if ((D2 & 64) != 0) {
                C1230s.m37884i("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (D == 3) {
            if ((D2 & 64) != 0) {
                int n = b0Var.m38132n();
                b0Var.m38146Q(n);
                C -= n + 4;
            }
        } else if (D == 4) {
            if ((D2 & 64) != 0) {
                int C2 = b0Var.m38160C();
                b0Var.m38146Q(C2 - 4);
                C -= C2;
            }
            if ((D2 & 16) != 0) {
                C -= 10;
            }
        } else {
            StringBuilder sb2 = new StringBuilder(57);
            sb2.append("Skipped ID3 tag with unsupported majorVersion=");
            sb2.append(D);
            C1230s.m37884i("Id3Decoder", sb2.toString());
            return null;
        }
        if (D < 4 && (D2 & Log.TAG_YOUTUBE) != 0) {
            z = true;
        }
        return new C6068b(D, z, C);
    }

    public static C6072k m21417n(C1189b0 b0Var, int i) {
        int J = b0Var.m38153J();
        int G = b0Var.m38156G();
        int G2 = b0Var.m38156G();
        int D = b0Var.m38159D();
        int D2 = b0Var.m38159D();
        C1187a0 a0Var = new C1187a0();
        a0Var.m38171m(b0Var);
        int i2 = ((i - 10) * 8) / (D + D2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int h = a0Var.m38176h(D);
            int h2 = a0Var.m38176h(D2);
            iArr[i3] = h;
            iArr2[i3] = h2;
        }
        return new C6072k(J, G, G2, iArr, iArr2);
    }

    public static C6074l m21416o(C1189b0 b0Var, int i) {
        byte[] bArr = new byte[i];
        b0Var.m38136j(bArr, 0, i);
        int y = m21406y(bArr, 0);
        return new C6074l(new String(bArr, 0, y, "ISO-8859-1"), m21427d(bArr, y + 1, i));
    }

    public static String m21415p(byte[] bArr, int i, int i2, String str) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    public static C6076m m21414q(C1189b0 b0Var, int i, String str) {
        if (i < 1) {
            return null;
        }
        int D = b0Var.m38159D();
        String v = m21409v(D);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        b0Var.m38136j(bArr, 0, i2);
        return new C6076m(str, null, new String(bArr, 0, m21407x(bArr, 0, D), v));
    }

    public static C6076m m21413r(C1189b0 b0Var, int i) {
        if (i < 1) {
            return null;
        }
        int D = b0Var.m38159D();
        String v = m21409v(D);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        b0Var.m38136j(bArr, 0, i2);
        int x = m21407x(bArr, 0, D);
        String str = new String(bArr, 0, x, v);
        int u = x + m21410u(D);
        return new C6076m("TXXX", str, m21415p(bArr, u, m21407x(bArr, u, D), v));
    }

    public static C6078n m21412s(C1189b0 b0Var, int i, String str) {
        byte[] bArr = new byte[i];
        b0Var.m38136j(bArr, 0, i);
        return new C6078n(str, null, new String(bArr, 0, m21406y(bArr, 0), "ISO-8859-1"));
    }

    public static C6078n m21411t(C1189b0 b0Var, int i) {
        if (i < 1) {
            return null;
        }
        int D = b0Var.m38159D();
        String v = m21409v(D);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        b0Var.m38136j(bArr, 0, i2);
        int x = m21407x(bArr, 0, D);
        String str = new String(bArr, 0, x, v);
        int u = x + m21410u(D);
        return new C6078n("WXXX", str, m21415p(bArr, u, m21406y(bArr, u), "ISO-8859-1"));
    }

    public static int m21410u(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static String m21409v(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    public static String m21408w(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int m21407x(byte[] bArr, int i, int i2) {
        int y = m21406y(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return y;
        }
        while (y < bArr.length - 1) {
            if ((y - i) % 2 == 0 && bArr[y + 1] == 0) {
                return y;
            }
            y = m21406y(bArr, y + 1);
        }
        return bArr.length;
    }

    public static int m21406y(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static boolean m21405z(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    @Override
    public C4260a mo19176b(C4267e eVar, ByteBuffer byteBuffer) {
        return m21426e(byteBuffer.array(), byteBuffer.limit());
    }

    public C4260a m21426e(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        C1189b0 b0Var = new C1189b0(bArr, i);
        C6068b m = m21418m(b0Var);
        if (m == null) {
            return null;
        }
        int e = b0Var.m38141e();
        int i2 = m.f19286a == 2 ? 6 : 10;
        int i3 = m.f19288c;
        if (m.f19287b) {
            i3 = m21430A(b0Var, m.f19288c);
        }
        b0Var.m38148O(e + i3);
        boolean z = false;
        if (!m21429B(b0Var, m.f19286a, i2, false)) {
            if (m.f19286a != 4 || !m21429B(b0Var, 4, i2, true)) {
                int i4 = m.f19286a;
                StringBuilder sb2 = new StringBuilder(56);
                sb2.append("Failed to validate ID3 tag with majorVersion=");
                sb2.append(i4);
                C1230s.m37884i("Id3Decoder", sb2.toString());
                return null;
            }
            z = true;
        }
        while (b0Var.m38145a() >= i2) {
            AbstractC6069i k = m21420k(m.f19286a, b0Var, z, i2, this.f19285a);
            if (k != null) {
                arrayList.add(k);
            }
        }
        return new C4260a(arrayList);
    }

    public C6066h(AbstractC6067a aVar) {
        this.f19285a = aVar;
    }
}
