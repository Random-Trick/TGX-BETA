package p095gc;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Objects;
import org.thunderdog.challegram.Log;
import p109hc.C5072a;
import p123ia.C5294h;
import qa.C8298k;
import za.C11436c;

public final class C4549e implements AbstractC4551g, AbstractC4550f, Cloneable, ByteChannel {
    public C4568v f14970a;
    public long f14971b;

    public final long m27447A0() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        C4568v vVar = this.f14970a;
        C8298k.m12936c(vVar);
        C4568v vVar2 = vVar.f15010g;
        C8298k.m12936c(vVar2);
        int i = vVar2.f15006c;
        if (i < 8192 && vVar2.f15008e) {
            size -= i - vVar2.f15005b;
        }
        return size;
    }

    @Override
    public boolean mo27339B() {
        return this.f14971b == 0;
    }

    public final C4549e m27446B0() {
        C4549e eVar = new C4549e();
        if (size() != 0) {
            C4568v vVar = this.f14970a;
            C8298k.m12936c(vVar);
            C4568v d = vVar.m27321d();
            eVar.f14970a = d;
            d.f15010g = d;
            d.f15009f = d;
            for (C4568v vVar2 = vVar.f15009f; vVar2 != vVar; vVar2 = vVar2.f15009f) {
                C4568v vVar3 = d.f15010g;
                C8298k.m12936c(vVar3);
                C8298k.m12936c(vVar2);
                vVar3.m27322c(vVar2.m27321d());
            }
            eVar.m27431Q0(size());
        }
        return eVar;
    }

    public final C4549e m27445C0(C4549e eVar, long j, long j2) {
        C8298k.m12934e(eVar, "out");
        C4542c.m27475b(size(), j, j2);
        if (j2 != 0) {
            eVar.m27431Q0(eVar.size() + j2);
            C4568v vVar = this.f14970a;
            while (true) {
                C8298k.m12936c(vVar);
                int i = vVar.f15006c;
                int i2 = vVar.f15005b;
                if (j >= i - i2) {
                    j -= i - i2;
                    vVar = vVar.f15009f;
                }
            }
            while (j2 > 0) {
                C8298k.m12936c(vVar);
                C4568v d = vVar.m27321d();
                int i3 = d.f15005b + ((int) j);
                d.f15005b = i3;
                d.f15006c = Math.min(i3 + ((int) j2), d.f15006c);
                C4568v vVar2 = eVar.f14970a;
                if (vVar2 == null) {
                    d.f15010g = d;
                    d.f15009f = d;
                    eVar.f14970a = d;
                } else {
                    C8298k.m12936c(vVar2);
                    C4568v vVar3 = vVar2.f15010g;
                    C8298k.m12936c(vVar3);
                    vVar3.m27322c(d);
                }
                j2 -= d.f15006c - d.f15005b;
                vVar = vVar.f15009f;
                j = 0;
            }
        }
        return this;
    }

    public final byte m27444D0(long j) {
        C4542c.m27475b(size(), j, 1L);
        C4568v vVar = this.f14970a;
        if (vVar == null) {
            C8298k.m12936c(null);
            throw null;
        } else if (size() - j < j) {
            long size = size();
            while (size > j) {
                vVar = vVar.f15010g;
                C8298k.m12936c(vVar);
                size -= vVar.f15006c - vVar.f15005b;
            }
            C8298k.m12936c(vVar);
            return vVar.f15004a[(int) ((vVar.f15005b + j) - size)];
        } else {
            long j2 = 0;
            while (true) {
                long j3 = (vVar.f15006c - vVar.f15005b) + j2;
                if (j3 > j) {
                    C8298k.m12936c(vVar);
                    return vVar.f15004a[(int) ((vVar.f15005b + j) - j2)];
                }
                vVar = vVar.f15009f;
                C8298k.m12936c(vVar);
                j2 = j3;
            }
        }
    }

    public long m27443E0(byte b, long j, long j2) {
        C4568v vVar;
        int i;
        long j3 = 0;
        if (0 <= j && j2 >= j) {
            if (j2 > size()) {
                j2 = size();
            }
            if (j == j2 || (vVar = this.f14970a) == null) {
                return -1L;
            }
            if (size() - j < j) {
                j3 = size();
                while (j3 > j) {
                    vVar = vVar.f15010g;
                    C8298k.m12936c(vVar);
                    j3 -= vVar.f15006c - vVar.f15005b;
                }
                while (j3 < j2) {
                    byte[] bArr = vVar.f15004a;
                    int min = (int) Math.min(vVar.f15006c, (vVar.f15005b + j2) - j3);
                    i = (int) ((vVar.f15005b + j) - j3);
                    while (i < min) {
                        if (bArr[i] != b) {
                            i++;
                        }
                    }
                    j3 += vVar.f15006c - vVar.f15005b;
                    vVar = vVar.f15009f;
                    C8298k.m12936c(vVar);
                    j = j3;
                }
                return -1L;
            }
            while (true) {
                long j4 = (vVar.f15006c - vVar.f15005b) + j3;
                if (j4 > j) {
                    break;
                }
                vVar = vVar.f15009f;
                C8298k.m12936c(vVar);
                j3 = j4;
            }
            while (j3 < j2) {
                byte[] bArr2 = vVar.f15004a;
                int min2 = (int) Math.min(vVar.f15006c, (vVar.f15005b + j2) - j3);
                i = (int) ((vVar.f15005b + j) - j3);
                while (i < min2) {
                    if (bArr2[i] != b) {
                        i++;
                    }
                }
                j3 += vVar.f15006c - vVar.f15005b;
                vVar = vVar.f15009f;
                C8298k.m12936c(vVar);
                j = j3;
            }
            return -1L;
            return (i - vVar.f15005b) + j3;
        }
        throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j + " toIndex=" + j2).toString());
    }

    public long m27442F0(C4552h hVar) {
        C8298k.m12934e(hVar, "targetBytes");
        return m27441G0(hVar, 0L);
    }

    public long m27441G0(C4552h hVar, long j) {
        int i;
        int i2;
        C8298k.m12934e(hVar, "targetBytes");
        long j2 = 0;
        if (j >= 0) {
            C4568v vVar = this.f14970a;
            if (vVar == null) {
                return -1L;
            }
            if (size() - j < j) {
                j2 = size();
                while (j2 > j) {
                    vVar = vVar.f15010g;
                    C8298k.m12936c(vVar);
                    j2 -= vVar.f15006c - vVar.f15005b;
                }
                if (hVar.m27404r() == 2) {
                    byte d = hVar.m27412d(0);
                    byte d2 = hVar.m27412d(1);
                    while (j2 < size()) {
                        byte[] bArr = vVar.f15004a;
                        i = (int) ((vVar.f15005b + j) - j2);
                        int i3 = vVar.f15006c;
                        while (i < i3) {
                            byte b = bArr[i];
                            if (!(b == d || b == d2)) {
                                i++;
                            }
                            i2 = vVar.f15005b;
                        }
                        j2 += vVar.f15006c - vVar.f15005b;
                        vVar = vVar.f15009f;
                        C8298k.m12936c(vVar);
                        j = j2;
                    }
                    return -1L;
                }
                byte[] j3 = hVar.mo27311j();
                while (j2 < size()) {
                    byte[] bArr2 = vVar.f15004a;
                    i = (int) ((vVar.f15005b + j) - j2);
                    int i4 = vVar.f15006c;
                    while (i < i4) {
                        byte b2 = bArr2[i];
                        for (byte b3 : j3) {
                            if (b2 == b3) {
                                i2 = vVar.f15005b;
                            }
                        }
                        i++;
                    }
                    j2 += vVar.f15006c - vVar.f15005b;
                    vVar = vVar.f15009f;
                    C8298k.m12936c(vVar);
                    j = j2;
                }
                return -1L;
            }
            while (true) {
                long j4 = (vVar.f15006c - vVar.f15005b) + j2;
                if (j4 > j) {
                    break;
                }
                vVar = vVar.f15009f;
                C8298k.m12936c(vVar);
                j2 = j4;
            }
            if (hVar.m27404r() == 2) {
                byte d3 = hVar.m27412d(0);
                byte d4 = hVar.m27412d(1);
                while (j2 < size()) {
                    byte[] bArr3 = vVar.f15004a;
                    i = (int) ((vVar.f15005b + j) - j2);
                    int i5 = vVar.f15006c;
                    while (i < i5) {
                        byte b4 = bArr3[i];
                        if (!(b4 == d3 || b4 == d4)) {
                            i++;
                        }
                        i2 = vVar.f15005b;
                    }
                    j2 += vVar.f15006c - vVar.f15005b;
                    vVar = vVar.f15009f;
                    C8298k.m12936c(vVar);
                    j = j2;
                }
                return -1L;
            }
            byte[] j5 = hVar.mo27311j();
            while (j2 < size()) {
                byte[] bArr4 = vVar.f15004a;
                i = (int) ((vVar.f15005b + j) - j2);
                int i6 = vVar.f15006c;
                while (i < i6) {
                    byte b5 = bArr4[i];
                    for (byte b6 : j5) {
                        if (b5 == b6) {
                            i2 = vVar.f15005b;
                        }
                    }
                    i++;
                }
                j2 += vVar.f15006c - vVar.f15005b;
                vVar = vVar.f15009f;
                C8298k.m12936c(vVar);
                j = j2;
            }
            return -1L;
            return (i - i2) + j2;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j).toString());
    }

    @Override
    public String mo27338H(long j) {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long E0 = m27443E0(b, 0L, j2);
            if (E0 != -1) {
                return C5072a.m24041b(this, E0);
            }
            if (j2 < size() && m27444D0(j2 - 1) == ((byte) 13) && m27444D0(j2) == b) {
                return C5072a.m24041b(this, j2);
            }
            C4549e eVar = new C4549e();
            m27445C0(eVar, 0L, Math.min(32, size()));
            throw new EOFException("\\n not found: limit=" + Math.min(size(), j) + " content=" + eVar.m27438J0().mo27312i() + (char) 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    public int m27440H0(byte[] bArr, int i, int i2) {
        C8298k.m12934e(bArr, "sink");
        C4542c.m27475b(bArr.length, i, i2);
        C4568v vVar = this.f14970a;
        if (vVar == null) {
            return -1;
        }
        int min = Math.min(i2, vVar.f15006c - vVar.f15005b);
        byte[] bArr2 = vVar.f15004a;
        int i3 = vVar.f15005b;
        C5294h.m23432d(bArr2, bArr, i, i3, i3 + min);
        vVar.f15005b += min;
        m27431Q0(size() - min);
        if (vVar.f15005b != vVar.f15006c) {
            return min;
        }
        this.f14970a = vVar.m27323b();
        C4570w.m27317b(vVar);
        return min;
    }

    public byte[] m27439I0() {
        return mo27332g0(size());
    }

    public C4552h m27438J0() {
        return mo27330o(size());
    }

    public void m27437K0(byte[] bArr) {
        C8298k.m12934e(bArr, "sink");
        int i = 0;
        while (i < bArr.length) {
            int H0 = m27440H0(bArr, i, bArr.length - i);
            if (H0 != -1) {
                i += H0;
            } else {
                throw new EOFException();
            }
        }
    }

    public int m27436L0() {
        return C4542c.m27474c(readInt());
    }

    public short m27435M0() {
        return C4542c.m27473d(readShort());
    }

    public String m27434N0(long j, Charset charset) {
        C8298k.m12934e(charset, "charset");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (!(i >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (this.f14971b < j) {
            throw new EOFException();
        } else if (i == 0) {
            return "";
        } else {
            C4568v vVar = this.f14970a;
            C8298k.m12936c(vVar);
            int i2 = vVar.f15005b;
            if (i2 + j > vVar.f15006c) {
                return new String(mo27332g0(j), charset);
            }
            int i3 = (int) j;
            String str = new String(vVar.f15004a, i2, i3, charset);
            int i4 = vVar.f15005b + i3;
            vVar.f15005b = i4;
            this.f14971b -= j;
            if (i4 == vVar.f15006c) {
                this.f14970a = vVar.m27323b();
                C4570w.m27317b(vVar);
            }
            return str;
        }
    }

    public String m27433O0() {
        return m27434N0(this.f14971b, C11436c.f36396b);
    }

    public String m27432P0(long j) {
        return m27434N0(j, C11436c.f36396b);
    }

    public final void m27431Q0(long j) {
        this.f14971b = j;
    }

    public final C4552h m27430R0() {
        if (size() <= ((long) Integer.MAX_VALUE)) {
            return m27429S0((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    public final C4552h m27429S0(int i) {
        if (i == 0) {
            return C4552h.f14972M;
        }
        C4542c.m27475b(size(), 0L, i);
        C4568v vVar = this.f14970a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            C8298k.m12936c(vVar);
            int i5 = vVar.f15006c;
            int i6 = vVar.f15005b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                vVar = vVar.f15009f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4];
        int[] iArr = new int[i4 * 2];
        C4568v vVar2 = this.f14970a;
        int i7 = 0;
        while (i2 < i) {
            C8298k.m12936c(vVar2);
            bArr[i7] = vVar2.f15004a;
            i2 += vVar2.f15006c - vVar2.f15005b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = vVar2.f15005b;
            vVar2.f15007d = true;
            i7++;
            vVar2 = vVar2.f15009f;
        }
        return new C4571x(bArr, iArr);
    }

    @Override
    public String mo27337T(Charset charset) {
        C8298k.m12934e(charset, "charset");
        return m27434N0(this.f14971b, charset);
    }

    public final C4568v m27428T0(int i) {
        boolean z = true;
        if (i < 1 || i > 8192) {
            z = false;
        }
        if (z) {
            C4568v vVar = this.f14970a;
            if (vVar == null) {
                C4568v c = C4570w.m27316c();
                this.f14970a = c;
                c.f15010g = c;
                c.f15009f = c;
                return c;
            }
            C8298k.m12936c(vVar);
            C4568v vVar2 = vVar.f15010g;
            C8298k.m12936c(vVar2);
            return (vVar2.f15006c + i > 8192 || !vVar2.f15008e) ? vVar2.m27322c(C4570w.m27316c()) : vVar2;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    public C4549e mo27345k0(C4552h hVar) {
        C8298k.m12934e(hVar, "byteString");
        hVar.mo27306v(this, 0, hVar.m27404r());
        return this;
    }

    public C4549e mo27344l0(byte[] bArr) {
        C8298k.m12934e(bArr, "source");
        return mo27347U(bArr, 0, bArr.length);
    }

    public C4549e mo27347U(byte[] bArr, int i, int i2) {
        C8298k.m12934e(bArr, "source");
        long j = i2;
        C4542c.m27475b(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C4568v T0 = m27428T0(1);
            int min = Math.min(i3 - i, 8192 - T0.f15006c);
            int i4 = i + min;
            C5294h.m23432d(bArr, T0.f15004a, T0.f15006c, i, i4);
            T0.f15006c += min;
            i = i4;
        }
        m27431Q0(size() + j);
        return this;
    }

    public long m27424X0(AbstractC4537a0 a0Var) {
        C8298k.m12934e(a0Var, "source");
        long j = 0;
        while (true) {
            long s = a0Var.mo5028s(this, (long) Log.TAG_LUX);
            if (s == -1) {
                return j;
            }
            j += s;
        }
    }

    public C4549e mo27349C(int i) {
        C4568v T0 = m27428T0(1);
        byte[] bArr = T0.f15004a;
        int i2 = T0.f15006c;
        T0.f15006c = i2 + 1;
        bArr[i2] = (byte) i;
        m27431Q0(size() + 1);
        return this;
    }

    public C4549e mo27346W(long j) {
        if (j == 0) {
            return mo27349C(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        C4568v T0 = m27428T0(i);
        byte[] bArr = T0.f15004a;
        int i2 = T0.f15006c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = C5072a.m24042a()[(int) (15 & j)];
            j >>>= 4;
        }
        T0.f15006c += i;
        m27431Q0(size() + i);
        return this;
    }

    @Override
    public C4549e mo27336a() {
        return this;
    }

    @Override
    public void mo27335a0(long j) {
        while (j > 0) {
            C4568v vVar = this.f14970a;
            if (vVar != null) {
                int min = (int) Math.min(j, vVar.f15006c - vVar.f15005b);
                long j2 = min;
                m27431Q0(size() - j2);
                j -= j2;
                int i = vVar.f15005b + min;
                vVar.f15005b = i;
                if (i == vVar.f15006c) {
                    this.f14970a = vVar.m27323b();
                    C4570w.m27317b(vVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public C4549e mo27341w(int i) {
        C4568v T0 = m27428T0(4);
        byte[] bArr = T0.f15004a;
        int i2 = T0.f15006c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        T0.f15006c = i5 + 1;
        m27431Q0(size() + 4);
        return this;
    }

    public C4549e mo27342r(int i) {
        C4568v T0 = m27428T0(2);
        byte[] bArr = T0.f15004a;
        int i2 = T0.f15006c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        T0.f15006c = i3 + 1;
        m27431Q0(size() + 2);
        return this;
    }

    @Override
    public C4539b0 mo27334c() {
        return C4539b0.f14954d;
    }

    public C4549e m27419c1(String str, int i, int i2, Charset charset) {
        C8298k.m12934e(str, "string");
        C8298k.m12934e(charset, "charset");
        boolean z = true;
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 > str.length()) {
                    z = false;
                }
                if (!z) {
                    throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
                } else if (C8298k.m12937b(charset, C11436c.f36396b)) {
                    return m27417e1(str, i, i2);
                } else {
                    String substring = str.substring(i, i2);
                    C8298k.m12935d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Objects.requireNonNull(substring, "null cannot be cast to non-null type java.lang.String");
                    byte[] bytes = substring.getBytes(charset);
                    C8298k.m12935d(bytes, "(this as java.lang.String).getBytes(charset)");
                    return mo27347U(bytes, 0, bytes.length);
                }
            } else {
                throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
            }
        } else {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
    }

    @Override
    public void close() {
    }

    public C4549e mo27348O(String str) {
        C8298k.m12934e(str, "string");
        return m27417e1(str, 0, str.length());
    }

    @Override
    public String mo27333e0() {
        return mo27338H(Long.MAX_VALUE);
    }

    public C4549e m27417e1(String str, int i, int i2) {
        C8298k.m12934e(str, "string");
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    while (i < i2) {
                        char charAt = str.charAt(i);
                        if (charAt < 128) {
                            C4568v T0 = m27428T0(1);
                            byte[] bArr = T0.f15004a;
                            int i3 = T0.f15006c - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            bArr[i + i3] = (byte) charAt;
                            while (i4 < min) {
                                char charAt2 = str.charAt(i4);
                                if (charAt2 >= 128) {
                                    break;
                                }
                                i4++;
                                bArr[i4 + i3] = (byte) charAt2;
                            }
                            int i5 = T0.f15006c;
                            int i6 = (i3 + i4) - i5;
                            T0.f15006c = i5 + i6;
                            m27431Q0(size() + i6);
                            i = i4;
                        } else {
                            if (charAt < 2048) {
                                C4568v T02 = m27428T0(2);
                                byte[] bArr2 = T02.f15004a;
                                int i7 = T02.f15006c;
                                bArr2[i7] = (byte) ((charAt >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt & '?') | Log.TAG_YOUTUBE);
                                T02.f15006c = i7 + 2;
                                m27431Q0(size() + 2);
                            } else if (charAt < 55296 || charAt > 57343) {
                                C4568v T03 = m27428T0(3);
                                byte[] bArr3 = T03.f15004a;
                                int i8 = T03.f15006c;
                                bArr3[i8] = (byte) ((charAt >> '\f') | 224);
                                bArr3[i8 + 1] = (byte) ((63 & (charAt >> 6)) | Log.TAG_YOUTUBE);
                                bArr3[i8 + 2] = (byte) ((charAt & '?') | Log.TAG_YOUTUBE);
                                T03.f15006c = i8 + 3;
                                m27431Q0(size() + 3);
                            } else {
                                int i9 = i + 1;
                                char charAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                                if (charAt > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                                    mo27349C(63);
                                    i = i9;
                                } else {
                                    int i10 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + Log.TAG_COMPRESS;
                                    C4568v T04 = m27428T0(4);
                                    byte[] bArr4 = T04.f15004a;
                                    int i11 = T04.f15006c;
                                    bArr4[i11] = (byte) ((i10 >> 18) | 240);
                                    bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | Log.TAG_YOUTUBE);
                                    bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | Log.TAG_YOUTUBE);
                                    bArr4[i11 + 3] = (byte) ((i10 & 63) | Log.TAG_YOUTUBE);
                                    T04.f15006c = i11 + 4;
                                    m27431Q0(size() + 4);
                                    i += 2;
                                }
                            }
                            i++;
                        }
                    }
                    return this;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C4549e)) {
                return false;
            }
            C4549e eVar = (C4549e) obj;
            if (size() != eVar.size()) {
                return false;
            }
            if (size() != 0) {
                C4568v vVar = this.f14970a;
                C8298k.m12936c(vVar);
                C4568v vVar2 = eVar.f14970a;
                C8298k.m12936c(vVar2);
                int i = vVar.f15005b;
                int i2 = vVar2.f15005b;
                long j = 0;
                while (j < size()) {
                    long min = Math.min(vVar.f15006c - i, vVar2.f15006c - i2);
                    for (long j2 = 0; j2 < min; j2++) {
                        i++;
                        i2++;
                        if (vVar.f15004a[i] != vVar2.f15004a[i2]) {
                            return false;
                        }
                    }
                    if (i == vVar.f15006c) {
                        vVar = vVar.f15009f;
                        C8298k.m12936c(vVar);
                        i = vVar.f15005b;
                    }
                    if (i2 == vVar2.f15006c) {
                        vVar2 = vVar2.f15009f;
                        C8298k.m12936c(vVar2);
                        i2 = vVar2.f15005b;
                    }
                    j += min;
                }
            }
        }
        return true;
    }

    public C4549e m27416f1(int i) {
        if (i < 128) {
            mo27349C(i);
        } else if (i < 2048) {
            C4568v T0 = m27428T0(2);
            byte[] bArr = T0.f15004a;
            int i2 = T0.f15006c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | Log.TAG_YOUTUBE);
            T0.f15006c = i2 + 2;
            m27431Q0(size() + 2);
        } else if (55296 <= i && 57343 >= i) {
            mo27349C(63);
        } else if (i < 65536) {
            C4568v T02 = m27428T0(3);
            byte[] bArr2 = T02.f15004a;
            int i3 = T02.f15006c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | Log.TAG_YOUTUBE);
            bArr2[i3 + 2] = (byte) ((i & 63) | Log.TAG_YOUTUBE);
            T02.f15006c = i3 + 3;
            m27431Q0(size() + 3);
        } else if (i <= 1114111) {
            C4568v T03 = m27428T0(4);
            byte[] bArr3 = T03.f15004a;
            int i4 = T03.f15006c;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | Log.TAG_YOUTUBE);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | Log.TAG_YOUTUBE);
            bArr3[i4 + 3] = (byte) ((i & 63) | Log.TAG_YOUTUBE);
            T03.f15006c = i4 + 4;
            m27431Q0(size() + 4);
        } else {
            throw new IllegalArgumentException("Unexpected code point: 0x" + C4542c.m27471f(i));
        }
        return this;
    }

    @Override
    public void flush() {
    }

    @Override
    public byte[] mo27332g0(long j) {
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (size() >= j) {
            byte[] bArr = new byte[(int) j];
            m27437K0(bArr);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    @Override
    public void mo5030h0(C4549e eVar, long j) {
        C4568v vVar;
        C4568v vVar2;
        C8298k.m12934e(eVar, "source");
        if (eVar != this) {
            C4542c.m27475b(eVar.size(), 0L, j);
            while (j > 0) {
                C4568v vVar3 = eVar.f14970a;
                C8298k.m12936c(vVar3);
                int i = vVar3.f15006c;
                C8298k.m12936c(eVar.f14970a);
                if (j < i - vVar.f15005b) {
                    C4568v vVar4 = this.f14970a;
                    if (vVar4 != null) {
                        C8298k.m12936c(vVar4);
                        vVar2 = vVar4.f15010g;
                    } else {
                        vVar2 = null;
                    }
                    if (vVar2 != null && vVar2.f15008e) {
                        if ((vVar2.f15006c + j) - (vVar2.f15007d ? 0 : vVar2.f15005b) <= ((long) Log.TAG_LUX)) {
                            C4568v vVar5 = eVar.f14970a;
                            C8298k.m12936c(vVar5);
                            vVar5.m27319f(vVar2, (int) j);
                            eVar.m27431Q0(eVar.size() - j);
                            m27431Q0(size() + j);
                            return;
                        }
                    }
                    C4568v vVar6 = eVar.f14970a;
                    C8298k.m12936c(vVar6);
                    eVar.f14970a = vVar6.m27320e((int) j);
                }
                C4568v vVar7 = eVar.f14970a;
                C8298k.m12936c(vVar7);
                long j2 = vVar7.f15006c - vVar7.f15005b;
                eVar.f14970a = vVar7.m27323b();
                C4568v vVar8 = this.f14970a;
                if (vVar8 == null) {
                    this.f14970a = vVar7;
                    vVar7.f15010g = vVar7;
                    vVar7.f15009f = vVar7;
                } else {
                    C8298k.m12936c(vVar8);
                    C4568v vVar9 = vVar8.f15010g;
                    C8298k.m12936c(vVar9);
                    vVar9.m27322c(vVar7).m27324a();
                }
                eVar.m27431Q0(eVar.size() - j2);
                m27431Q0(size() + j2);
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    public int hashCode() {
        C4568v vVar = this.f14970a;
        if (vVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = vVar.f15006c;
            for (int i3 = vVar.f15005b; i3 < i2; i3++) {
                i = (i * 31) + vVar.f15004a[i3];
            }
            vVar = vVar.f15009f;
            C8298k.m12936c(vVar);
        } while (vVar != this.f14970a);
        return i;
    }

    @Override
    public boolean isOpen() {
        return true;
    }

    @Override
    public C4552h mo27330o(long j) {
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (size() < j) {
            throw new EOFException();
        } else if (j < ((long) Log.TAG_EMOJI)) {
            return new C4552h(mo27332g0(j));
        } else {
            C4552h S0 = m27429S0((int) j);
            mo27335a0(j);
            return S0;
        }
    }

    @Override
    public int read(ByteBuffer byteBuffer) {
        C8298k.m12934e(byteBuffer, "sink");
        C4568v vVar = this.f14970a;
        if (vVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), vVar.f15006c - vVar.f15005b);
        byteBuffer.put(vVar.f15004a, vVar.f15005b, min);
        int i = vVar.f15005b + min;
        vVar.f15005b = i;
        this.f14971b -= min;
        if (i == vVar.f15006c) {
            this.f14970a = vVar.m27323b();
            C4570w.m27317b(vVar);
        }
        return min;
    }

    @Override
    public byte readByte() {
        if (size() != 0) {
            C4568v vVar = this.f14970a;
            C8298k.m12936c(vVar);
            int i = vVar.f15005b;
            int i2 = vVar.f15006c;
            int i3 = i + 1;
            byte b = vVar.f15004a[i];
            m27431Q0(size() - 1);
            if (i3 == i2) {
                this.f14970a = vVar.m27323b();
                C4570w.m27317b(vVar);
            } else {
                vVar.f15005b = i3;
            }
            return b;
        }
        throw new EOFException();
    }

    @Override
    public int readInt() {
        if (size() >= 4) {
            C4568v vVar = this.f14970a;
            C8298k.m12936c(vVar);
            int i = vVar.f15005b;
            int i2 = vVar.f15006c;
            if (i2 - i < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = vVar.f15004a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i6 = i4 + 1;
            int i7 = i5 | ((bArr[i4] & 255) << 8);
            int i8 = i6 + 1;
            int i9 = i7 | (bArr[i6] & 255);
            m27431Q0(size() - 4);
            if (i8 == i2) {
                this.f14970a = vVar.m27323b();
                C4570w.m27317b(vVar);
            } else {
                vVar.f15005b = i8;
            }
            return i9;
        }
        throw new EOFException();
    }

    @Override
    public short readShort() {
        if (size() >= 2) {
            C4568v vVar = this.f14970a;
            C8298k.m12936c(vVar);
            int i = vVar.f15005b;
            int i2 = vVar.f15006c;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = vVar.f15004a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            m27431Q0(size() - 2);
            if (i4 == i2) {
                this.f14970a = vVar.m27323b();
                C4570w.m27317b(vVar);
            } else {
                vVar.f15005b = i4;
            }
            return (short) i5;
        }
        throw new EOFException();
    }

    @Override
    public long mo5028s(C4549e eVar, long j) {
        C8298k.m12934e(eVar, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (size() == 0) {
            return -1L;
        } else {
            if (j > size()) {
                j = size();
            }
            eVar.mo5030h0(this, j);
            return j;
        }
    }

    @Override
    public void mo27329s0(long j) {
        if (this.f14971b < j) {
            throw new EOFException();
        }
    }

    public final long size() {
        return this.f14971b;
    }

    public String toString() {
        return m27430R0().toString();
    }

    @Override
    public long mo27327v0() {
        throw new UnsupportedOperationException("Method not decompiled: p095gc.C4549e.mo27327v0():long");
    }

    @Override
    public int write(ByteBuffer byteBuffer) {
        C8298k.m12934e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            C4568v T0 = m27428T0(1);
            int min = Math.min(i, 8192 - T0.f15006c);
            byteBuffer.get(T0.f15004a, T0.f15006c, min);
            i -= min;
            T0.f15006c += min;
        }
        this.f14971b += remaining;
        return remaining;
    }

    public final void m27415y0() {
        mo27335a0(size());
    }

    public C4549e clone() {
        return m27446B0();
    }
}
