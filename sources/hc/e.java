package hc;

import ab.c;
import ic.a;
import ja.h;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Objects;
import org.thunderdog.challegram.Log;
import ra.k;

public final class e implements g, f, Cloneable, ByteChannel {
    public v f12644a;
    public long f12645b;

    @Override
    public long A(e eVar, long j10) {
        k.e(eVar, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        } else if (size() == 0) {
            return -1L;
        } else {
            if (j10 > size()) {
                j10 = size();
            }
            eVar.c0(this, j10);
            return j10;
        }
    }

    public final long A0() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        v vVar = this.f12644a;
        k.c(vVar);
        v vVar2 = vVar.f12678g;
        k.c(vVar2);
        int i10 = vVar2.f12674c;
        if (i10 < 8192 && vVar2.f12676e) {
            size -= i10 - vVar2.f12673b;
        }
        return size;
    }

    public final e B0() {
        e eVar = new e();
        if (size() != 0) {
            v vVar = this.f12644a;
            k.c(vVar);
            v d10 = vVar.d();
            eVar.f12644a = d10;
            d10.f12678g = d10;
            d10.f12677f = d10;
            for (v vVar2 = vVar.f12677f; vVar2 != vVar; vVar2 = vVar2.f12677f) {
                v vVar3 = d10.f12678g;
                k.c(vVar3);
                k.c(vVar2);
                vVar3.c(vVar2.d());
            }
            eVar.Q0(size());
        }
        return eVar;
    }

    @Override
    public boolean C() {
        return this.f12645b == 0;
    }

    public final e C0(e eVar, long j10, long j11) {
        k.e(eVar, "out");
        c.b(size(), j10, j11);
        if (j11 != 0) {
            eVar.Q0(eVar.size() + j11);
            v vVar = this.f12644a;
            while (true) {
                k.c(vVar);
                int i10 = vVar.f12674c;
                int i11 = vVar.f12673b;
                if (j10 >= i10 - i11) {
                    j10 -= i10 - i11;
                    vVar = vVar.f12677f;
                }
            }
            while (j11 > 0) {
                k.c(vVar);
                v d10 = vVar.d();
                int i12 = d10.f12673b + ((int) j10);
                d10.f12673b = i12;
                d10.f12674c = Math.min(i12 + ((int) j11), d10.f12674c);
                v vVar2 = eVar.f12644a;
                if (vVar2 == null) {
                    d10.f12678g = d10;
                    d10.f12677f = d10;
                    eVar.f12644a = d10;
                } else {
                    k.c(vVar2);
                    v vVar3 = vVar2.f12678g;
                    k.c(vVar3);
                    vVar3.c(d10);
                }
                j11 -= d10.f12674c - d10.f12673b;
                vVar = vVar.f12677f;
                j10 = 0;
            }
        }
        return this;
    }

    public final byte D0(long j10) {
        c.b(size(), j10, 1L);
        v vVar = this.f12644a;
        if (vVar == null) {
            k.c(null);
            throw null;
        } else if (size() - j10 < j10) {
            long size = size();
            while (size > j10) {
                vVar = vVar.f12678g;
                k.c(vVar);
                size -= vVar.f12674c - vVar.f12673b;
            }
            k.c(vVar);
            return vVar.f12672a[(int) ((vVar.f12673b + j10) - size)];
        } else {
            long j11 = 0;
            while (true) {
                long j12 = (vVar.f12674c - vVar.f12673b) + j11;
                if (j12 > j10) {
                    k.c(vVar);
                    return vVar.f12672a[(int) ((vVar.f12673b + j10) - j11)];
                }
                vVar = vVar.f12677f;
                k.c(vVar);
                j11 = j12;
            }
        }
    }

    public long E0(byte b10, long j10, long j11) {
        v vVar;
        int i10;
        long j12 = 0;
        if (0 <= j10 && j11 >= j10) {
            if (j11 > size()) {
                j11 = size();
            }
            if (j10 == j11 || (vVar = this.f12644a) == null) {
                return -1L;
            }
            if (size() - j10 < j10) {
                j12 = size();
                while (j12 > j10) {
                    vVar = vVar.f12678g;
                    k.c(vVar);
                    j12 -= vVar.f12674c - vVar.f12673b;
                }
                while (j12 < j11) {
                    byte[] bArr = vVar.f12672a;
                    int min = (int) Math.min(vVar.f12674c, (vVar.f12673b + j11) - j12);
                    i10 = (int) ((vVar.f12673b + j10) - j12);
                    while (i10 < min) {
                        if (bArr[i10] != b10) {
                            i10++;
                        }
                    }
                    j12 += vVar.f12674c - vVar.f12673b;
                    vVar = vVar.f12677f;
                    k.c(vVar);
                    j10 = j12;
                }
                return -1L;
            }
            while (true) {
                long j13 = (vVar.f12674c - vVar.f12673b) + j12;
                if (j13 > j10) {
                    break;
                }
                vVar = vVar.f12677f;
                k.c(vVar);
                j12 = j13;
            }
            while (j12 < j11) {
                byte[] bArr2 = vVar.f12672a;
                int min2 = (int) Math.min(vVar.f12674c, (vVar.f12673b + j11) - j12);
                i10 = (int) ((vVar.f12673b + j10) - j12);
                while (i10 < min2) {
                    if (bArr2[i10] != b10) {
                        i10++;
                    }
                }
                j12 += vVar.f12674c - vVar.f12673b;
                vVar = vVar.f12677f;
                k.c(vVar);
                j10 = j12;
            }
            return -1L;
            return (i10 - vVar.f12673b) + j12;
        }
        throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j10 + " toIndex=" + j11).toString());
    }

    public long F0(h hVar) {
        k.e(hVar, "targetBytes");
        return G0(hVar, 0L);
    }

    public long G0(h hVar, long j10) {
        int i10;
        int i11;
        k.e(hVar, "targetBytes");
        long j11 = 0;
        if (j10 >= 0) {
            v vVar = this.f12644a;
            if (vVar == null) {
                return -1L;
            }
            if (size() - j10 < j10) {
                j11 = size();
                while (j11 > j10) {
                    vVar = vVar.f12678g;
                    k.c(vVar);
                    j11 -= vVar.f12674c - vVar.f12673b;
                }
                if (hVar.r() == 2) {
                    byte d10 = hVar.d(0);
                    byte d11 = hVar.d(1);
                    while (j11 < size()) {
                        byte[] bArr = vVar.f12672a;
                        i10 = (int) ((vVar.f12673b + j10) - j11);
                        int i12 = vVar.f12674c;
                        while (i10 < i12) {
                            byte b10 = bArr[i10];
                            if (!(b10 == d10 || b10 == d11)) {
                                i10++;
                            }
                            i11 = vVar.f12673b;
                        }
                        j11 += vVar.f12674c - vVar.f12673b;
                        vVar = vVar.f12677f;
                        k.c(vVar);
                        j10 = j11;
                    }
                    return -1L;
                }
                byte[] j12 = hVar.j();
                while (j11 < size()) {
                    byte[] bArr2 = vVar.f12672a;
                    i10 = (int) ((vVar.f12673b + j10) - j11);
                    int i13 = vVar.f12674c;
                    while (i10 < i13) {
                        byte b11 = bArr2[i10];
                        for (byte b12 : j12) {
                            if (b11 == b12) {
                                i11 = vVar.f12673b;
                            }
                        }
                        i10++;
                    }
                    j11 += vVar.f12674c - vVar.f12673b;
                    vVar = vVar.f12677f;
                    k.c(vVar);
                    j10 = j11;
                }
                return -1L;
            }
            while (true) {
                long j13 = (vVar.f12674c - vVar.f12673b) + j11;
                if (j13 > j10) {
                    break;
                }
                vVar = vVar.f12677f;
                k.c(vVar);
                j11 = j13;
            }
            if (hVar.r() == 2) {
                byte d12 = hVar.d(0);
                byte d13 = hVar.d(1);
                while (j11 < size()) {
                    byte[] bArr3 = vVar.f12672a;
                    i10 = (int) ((vVar.f12673b + j10) - j11);
                    int i14 = vVar.f12674c;
                    while (i10 < i14) {
                        byte b13 = bArr3[i10];
                        if (!(b13 == d12 || b13 == d13)) {
                            i10++;
                        }
                        i11 = vVar.f12673b;
                    }
                    j11 += vVar.f12674c - vVar.f12673b;
                    vVar = vVar.f12677f;
                    k.c(vVar);
                    j10 = j11;
                }
                return -1L;
            }
            byte[] j14 = hVar.j();
            while (j11 < size()) {
                byte[] bArr4 = vVar.f12672a;
                i10 = (int) ((vVar.f12673b + j10) - j11);
                int i15 = vVar.f12674c;
                while (i10 < i15) {
                    byte b14 = bArr4[i10];
                    for (byte b15 : j14) {
                        if (b14 == b15) {
                            i11 = vVar.f12673b;
                        }
                    }
                    i10++;
                }
                j11 += vVar.f12674c - vVar.f12673b;
                vVar = vVar.f12677f;
                k.c(vVar);
                j10 = j11;
            }
            return -1L;
            return (i10 - i11) + j11;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j10).toString());
    }

    public int H0(byte[] bArr, int i10, int i11) {
        k.e(bArr, "sink");
        c.b(bArr.length, i10, i11);
        v vVar = this.f12644a;
        if (vVar == null) {
            return -1;
        }
        int min = Math.min(i11, vVar.f12674c - vVar.f12673b);
        byte[] bArr2 = vVar.f12672a;
        int i12 = vVar.f12673b;
        h.d(bArr2, bArr, i10, i12, i12 + min);
        vVar.f12673b += min;
        Q0(size() - min);
        if (vVar.f12673b != vVar.f12674c) {
            return min;
        }
        this.f12644a = vVar.b();
        w.b(vVar);
        return min;
    }

    @Override
    public String I(long j10) {
        if (j10 >= 0) {
            long j11 = Long.MAX_VALUE;
            if (j10 != Long.MAX_VALUE) {
                j11 = j10 + 1;
            }
            byte b10 = (byte) 10;
            long E0 = E0(b10, 0L, j11);
            if (E0 != -1) {
                return a.b(this, E0);
            }
            if (j11 < size() && D0(j11 - 1) == ((byte) 13) && D0(j11) == b10) {
                return a.b(this, j11);
            }
            e eVar = new e();
            C0(eVar, 0L, Math.min(32, size()));
            throw new EOFException("\\n not found: limit=" + Math.min(size(), j10) + " content=" + eVar.J0().i() + (char) 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j10).toString());
    }

    public byte[] I0() {
        return i0(size());
    }

    public h J0() {
        return o(size());
    }

    public void K0(byte[] bArr) {
        k.e(bArr, "sink");
        int i10 = 0;
        while (i10 < bArr.length) {
            int H0 = H0(bArr, i10, bArr.length - i10);
            if (H0 != -1) {
                i10 += H0;
            } else {
                throw new EOFException();
            }
        }
    }

    public int L0() {
        return c.c(readInt());
    }

    public short M0() {
        return c.d(readShort());
    }

    public String N0(long j10, Charset charset) {
        k.e(charset, "charset");
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (!(i10 >= 0 && j10 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        } else if (this.f12645b < j10) {
            throw new EOFException();
        } else if (i10 == 0) {
            return "";
        } else {
            v vVar = this.f12644a;
            k.c(vVar);
            int i11 = vVar.f12673b;
            if (i11 + j10 > vVar.f12674c) {
                return new String(i0(j10), charset);
            }
            int i12 = (int) j10;
            String str = new String(vVar.f12672a, i11, i12, charset);
            int i13 = vVar.f12673b + i12;
            vVar.f12673b = i13;
            this.f12645b -= j10;
            if (i13 == vVar.f12674c) {
                this.f12644a = vVar.b();
                w.b(vVar);
            }
            return str;
        }
    }

    public String O0() {
        return N0(this.f12645b, c.f695b);
    }

    public String P0(long j10) {
        return N0(j10, c.f695b);
    }

    public final void Q0(long j10) {
        this.f12645b = j10;
    }

    public final h R0() {
        if (size() <= ((long) Integer.MAX_VALUE)) {
            return S0((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    public final h S0(int i10) {
        if (i10 == 0) {
            return h.M;
        }
        c.b(size(), 0L, i10);
        v vVar = this.f12644a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            k.c(vVar);
            int i14 = vVar.f12674c;
            int i15 = vVar.f12673b;
            if (i14 != i15) {
                i12 += i14 - i15;
                i13++;
                vVar = vVar.f12677f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i13];
        int[] iArr = new int[i13 * 2];
        v vVar2 = this.f12644a;
        int i16 = 0;
        while (i11 < i10) {
            k.c(vVar2);
            bArr[i16] = vVar2.f12672a;
            i11 += vVar2.f12674c - vVar2.f12673b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = vVar2.f12673b;
            vVar2.f12675d = true;
            i16++;
            vVar2 = vVar2.f12677f;
        }
        return new x(bArr, iArr);
    }

    public final v T0(int i10) {
        boolean z10 = true;
        if (i10 < 1 || i10 > 8192) {
            z10 = false;
        }
        if (z10) {
            v vVar = this.f12644a;
            if (vVar == null) {
                v c10 = w.c();
                this.f12644a = c10;
                c10.f12678g = c10;
                c10.f12677f = c10;
                return c10;
            }
            k.c(vVar);
            v vVar2 = vVar.f12678g;
            k.c(vVar2);
            return (vVar2.f12674c + i10 > 8192 || !vVar2.f12676e) ? vVar2.c(w.c()) : vVar2;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    @Override
    public String U(Charset charset) {
        k.e(charset, "charset");
        return N0(this.f12645b, charset);
    }

    public e n0(h hVar) {
        k.e(hVar, "byteString");
        hVar.v(this, 0, hVar.r());
        return this;
    }

    public e l0(byte[] bArr) {
        k.e(bArr, "source");
        return V(bArr, 0, bArr.length);
    }

    public e V(byte[] bArr, int i10, int i11) {
        k.e(bArr, "source");
        long j10 = i11;
        c.b(bArr.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            v T0 = T0(1);
            int min = Math.min(i12 - i10, 8192 - T0.f12674c);
            int i13 = i10 + min;
            h.d(bArr, T0.f12672a, T0.f12674c, i10, i13);
            T0.f12674c += min;
            i10 = i13;
        }
        Q0(size() + j10);
        return this;
    }

    public long X0(a0 a0Var) {
        k.e(a0Var, "source");
        long j10 = 0;
        while (true) {
            long A = a0Var.A(this, (long) Log.TAG_LUX);
            if (A == -1) {
                return j10;
            }
            j10 += A;
        }
    }

    public e D(int i10) {
        v T0 = T0(1);
        byte[] bArr = T0.f12672a;
        int i11 = T0.f12674c;
        T0.f12674c = i11 + 1;
        bArr[i11] = (byte) i10;
        Q0(size() + 1);
        return this;
    }

    public e X(long j10) {
        if (j10 == 0) {
            return D(48);
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + 3) / 4);
        v T0 = T0(i10);
        byte[] bArr = T0.f12672a;
        int i11 = T0.f12674c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = a.a()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        T0.f12674c += i10;
        Q0(size() + i10);
        return this;
    }

    @Override
    public e a() {
        return this;
    }

    public e v(int i10) {
        v T0 = T0(4);
        byte[] bArr = T0.f12672a;
        int i11 = T0.f12674c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 16) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 8) & 255);
        bArr[i14] = (byte) (i10 & 255);
        T0.f12674c = i14 + 1;
        Q0(size() + 4);
        return this;
    }

    @Override
    public void b0(long j10) {
        while (j10 > 0) {
            v vVar = this.f12644a;
            if (vVar != null) {
                int min = (int) Math.min(j10, vVar.f12674c - vVar.f12673b);
                long j11 = min;
                Q0(size() - j11);
                j10 -= j11;
                int i10 = vVar.f12673b + min;
                vVar.f12673b = i10;
                if (i10 == vVar.f12674c) {
                    this.f12644a = vVar.b();
                    w.b(vVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public e r(int i10) {
        v T0 = T0(2);
        byte[] bArr = T0.f12672a;
        int i11 = T0.f12674c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i12] = (byte) (i10 & 255);
        T0.f12674c = i12 + 1;
        Q0(size() + 2);
        return this;
    }

    @Override
    public b0 c() {
        return b0.f12628d;
    }

    @Override
    public void c0(e eVar, long j10) {
        v vVar;
        v vVar2;
        k.e(eVar, "source");
        if (eVar != this) {
            c.b(eVar.size(), 0L, j10);
            while (j10 > 0) {
                v vVar3 = eVar.f12644a;
                k.c(vVar3);
                int i10 = vVar3.f12674c;
                k.c(eVar.f12644a);
                if (j10 < i10 - vVar.f12673b) {
                    v vVar4 = this.f12644a;
                    if (vVar4 != null) {
                        k.c(vVar4);
                        vVar2 = vVar4.f12678g;
                    } else {
                        vVar2 = null;
                    }
                    if (vVar2 != null && vVar2.f12676e) {
                        if ((vVar2.f12674c + j10) - (vVar2.f12675d ? 0 : vVar2.f12673b) <= ((long) Log.TAG_LUX)) {
                            v vVar5 = eVar.f12644a;
                            k.c(vVar5);
                            vVar5.f(vVar2, (int) j10);
                            eVar.Q0(eVar.size() - j10);
                            Q0(size() + j10);
                            return;
                        }
                    }
                    v vVar6 = eVar.f12644a;
                    k.c(vVar6);
                    eVar.f12644a = vVar6.e((int) j10);
                }
                v vVar7 = eVar.f12644a;
                k.c(vVar7);
                long j11 = vVar7.f12674c - vVar7.f12673b;
                eVar.f12644a = vVar7.b();
                v vVar8 = this.f12644a;
                if (vVar8 == null) {
                    this.f12644a = vVar7;
                    vVar7.f12678g = vVar7;
                    vVar7.f12677f = vVar7;
                } else {
                    k.c(vVar8);
                    v vVar9 = vVar8.f12678g;
                    k.c(vVar9);
                    vVar9.c(vVar7).a();
                }
                eVar.Q0(eVar.size() - j11);
                Q0(size() + j11);
                j10 -= j11;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    public e c1(String str, int i10, int i11, Charset charset) {
        k.e(str, "string");
        k.e(charset, "charset");
        boolean z10 = true;
        if (i10 >= 0) {
            if (i11 >= i10) {
                if (i11 > str.length()) {
                    z10 = false;
                }
                if (!z10) {
                    throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + str.length()).toString());
                } else if (k.b(charset, c.f695b)) {
                    return e1(str, i10, i11);
                } else {
                    String substring = str.substring(i10, i11);
                    k.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Objects.requireNonNull(substring, "null cannot be cast to non-null type java.lang.String");
                    byte[] bytes = substring.getBytes(charset);
                    k.d(bytes, "(this as java.lang.String).getBytes(charset)");
                    return V(bytes, 0, bytes.length);
                }
            } else {
                throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
            }
        } else {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
    }

    @Override
    public void close() {
    }

    public e P(String str) {
        k.e(str, "string");
        return e1(str, 0, str.length());
    }

    public e e1(String str, int i10, int i11) {
        k.e(str, "string");
        if (i10 >= 0) {
            if (i11 >= i10) {
                if (i11 <= str.length()) {
                    while (i10 < i11) {
                        char charAt = str.charAt(i10);
                        if (charAt < 128) {
                            v T0 = T0(1);
                            byte[] bArr = T0.f12672a;
                            int i12 = T0.f12674c - i10;
                            int min = Math.min(i11, 8192 - i12);
                            int i13 = i10 + 1;
                            bArr[i10 + i12] = (byte) charAt;
                            while (i13 < min) {
                                char charAt2 = str.charAt(i13);
                                if (charAt2 >= 128) {
                                    break;
                                }
                                i13++;
                                bArr[i13 + i12] = (byte) charAt2;
                            }
                            int i14 = T0.f12674c;
                            int i15 = (i12 + i13) - i14;
                            T0.f12674c = i14 + i15;
                            Q0(size() + i15);
                            i10 = i13;
                        } else {
                            if (charAt < 2048) {
                                v T02 = T0(2);
                                byte[] bArr2 = T02.f12672a;
                                int i16 = T02.f12674c;
                                bArr2[i16] = (byte) ((charAt >> 6) | 192);
                                bArr2[i16 + 1] = (byte) ((charAt & '?') | Log.TAG_YOUTUBE);
                                T02.f12674c = i16 + 2;
                                Q0(size() + 2);
                            } else if (charAt < 55296 || charAt > 57343) {
                                v T03 = T0(3);
                                byte[] bArr3 = T03.f12672a;
                                int i17 = T03.f12674c;
                                bArr3[i17] = (byte) ((charAt >> '\f') | 224);
                                bArr3[i17 + 1] = (byte) ((63 & (charAt >> 6)) | Log.TAG_YOUTUBE);
                                bArr3[i17 + 2] = (byte) ((charAt & '?') | Log.TAG_YOUTUBE);
                                T03.f12674c = i17 + 3;
                                Q0(size() + 3);
                            } else {
                                int i18 = i10 + 1;
                                char charAt3 = i18 < i11 ? str.charAt(i18) : (char) 0;
                                if (charAt > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                                    D(63);
                                    i10 = i18;
                                } else {
                                    int i19 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + Log.TAG_COMPRESS;
                                    v T04 = T0(4);
                                    byte[] bArr4 = T04.f12672a;
                                    int i20 = T04.f12674c;
                                    bArr4[i20] = (byte) ((i19 >> 18) | 240);
                                    bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | Log.TAG_YOUTUBE);
                                    bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | Log.TAG_YOUTUBE);
                                    bArr4[i20 + 3] = (byte) ((i19 & 63) | Log.TAG_YOUTUBE);
                                    T04.f12674c = i20 + 4;
                                    Q0(size() + 4);
                                    i10 += 2;
                                }
                            }
                            i10++;
                        }
                    }
                    return this;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (size() != eVar.size()) {
                return false;
            }
            if (size() != 0) {
                v vVar = this.f12644a;
                k.c(vVar);
                v vVar2 = eVar.f12644a;
                k.c(vVar2);
                int i10 = vVar.f12673b;
                int i11 = vVar2.f12673b;
                long j10 = 0;
                while (j10 < size()) {
                    long min = Math.min(vVar.f12674c - i10, vVar2.f12674c - i11);
                    for (long j11 = 0; j11 < min; j11++) {
                        i10++;
                        i11++;
                        if (vVar.f12672a[i10] != vVar2.f12672a[i11]) {
                            return false;
                        }
                    }
                    if (i10 == vVar.f12674c) {
                        vVar = vVar.f12677f;
                        k.c(vVar);
                        i10 = vVar.f12673b;
                    }
                    if (i11 == vVar2.f12674c) {
                        vVar2 = vVar2.f12677f;
                        k.c(vVar2);
                        i11 = vVar2.f12673b;
                    }
                    j10 += min;
                }
            }
        }
        return true;
    }

    public e f1(int i10) {
        if (i10 < 128) {
            D(i10);
        } else if (i10 < 2048) {
            v T0 = T0(2);
            byte[] bArr = T0.f12672a;
            int i11 = T0.f12674c;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | Log.TAG_YOUTUBE);
            T0.f12674c = i11 + 2;
            Q0(size() + 2);
        } else if (55296 <= i10 && 57343 >= i10) {
            D(63);
        } else if (i10 < 65536) {
            v T02 = T0(3);
            byte[] bArr2 = T02.f12672a;
            int i12 = T02.f12674c;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | Log.TAG_YOUTUBE);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | Log.TAG_YOUTUBE);
            T02.f12674c = i12 + 3;
            Q0(size() + 3);
        } else if (i10 <= 1114111) {
            v T03 = T0(4);
            byte[] bArr3 = T03.f12672a;
            int i13 = T03.f12674c;
            bArr3[i13] = (byte) ((i10 >> 18) | 240);
            bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | Log.TAG_YOUTUBE);
            bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | Log.TAG_YOUTUBE);
            bArr3[i13 + 3] = (byte) ((i10 & 63) | Log.TAG_YOUTUBE);
            T03.f12674c = i13 + 4;
            Q0(size() + 4);
        } else {
            throw new IllegalArgumentException("Unexpected code point: 0x" + c.f(i10));
        }
        return this;
    }

    @Override
    public void flush() {
    }

    @Override
    public String g0() {
        return I(Long.MAX_VALUE);
    }

    public int hashCode() {
        v vVar = this.f12644a;
        if (vVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = vVar.f12674c;
            for (int i12 = vVar.f12673b; i12 < i11; i12++) {
                i10 = (i10 * 31) + vVar.f12672a[i12];
            }
            vVar = vVar.f12677f;
            k.c(vVar);
        } while (vVar != this.f12644a);
        return i10;
    }

    @Override
    public byte[] i0(long j10) {
        if (!(j10 >= 0 && j10 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        } else if (size() >= j10) {
            byte[] bArr = new byte[(int) j10];
            K0(bArr);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    @Override
    public boolean isOpen() {
        return true;
    }

    @Override
    public h o(long j10) {
        if (!(j10 >= 0 && j10 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        } else if (size() < j10) {
            throw new EOFException();
        } else if (j10 < ((long) Log.TAG_EMOJI)) {
            return new h(i0(j10));
        } else {
            h S0 = S0((int) j10);
            b0(j10);
            return S0;
        }
    }

    @Override
    public int read(ByteBuffer byteBuffer) {
        k.e(byteBuffer, "sink");
        v vVar = this.f12644a;
        if (vVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), vVar.f12674c - vVar.f12673b);
        byteBuffer.put(vVar.f12672a, vVar.f12673b, min);
        int i10 = vVar.f12673b + min;
        vVar.f12673b = i10;
        this.f12645b -= min;
        if (i10 == vVar.f12674c) {
            this.f12644a = vVar.b();
            w.b(vVar);
        }
        return min;
    }

    @Override
    public byte readByte() {
        if (size() != 0) {
            v vVar = this.f12644a;
            k.c(vVar);
            int i10 = vVar.f12673b;
            int i11 = vVar.f12674c;
            int i12 = i10 + 1;
            byte b10 = vVar.f12672a[i10];
            Q0(size() - 1);
            if (i12 == i11) {
                this.f12644a = vVar.b();
                w.b(vVar);
            } else {
                vVar.f12673b = i12;
            }
            return b10;
        }
        throw new EOFException();
    }

    @Override
    public int readInt() {
        if (size() >= 4) {
            v vVar = this.f12644a;
            k.c(vVar);
            int i10 = vVar.f12673b;
            int i11 = vVar.f12674c;
            if (i11 - i10 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = vVar.f12672a;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            int i14 = ((bArr[i10] & 255) << 24) | ((bArr[i12] & 255) << 16);
            int i15 = i13 + 1;
            int i16 = i14 | ((bArr[i13] & 255) << 8);
            int i17 = i15 + 1;
            int i18 = i16 | (bArr[i15] & 255);
            Q0(size() - 4);
            if (i17 == i11) {
                this.f12644a = vVar.b();
                w.b(vVar);
            } else {
                vVar.f12673b = i17;
            }
            return i18;
        }
        throw new EOFException();
    }

    @Override
    public short readShort() {
        if (size() >= 2) {
            v vVar = this.f12644a;
            k.c(vVar);
            int i10 = vVar.f12673b;
            int i11 = vVar.f12674c;
            if (i11 - i10 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = vVar.f12672a;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            int i14 = ((bArr[i10] & 255) << 8) | (bArr[i12] & 255);
            Q0(size() - 2);
            if (i13 == i11) {
                this.f12644a = vVar.b();
                w.b(vVar);
            } else {
                vVar.f12673b = i13;
            }
            return (short) i14;
        }
        throw new EOFException();
    }

    @Override
    public void s0(long j10) {
        if (this.f12645b < j10) {
            throw new EOFException();
        }
    }

    public final long size() {
        return this.f12645b;
    }

    public String toString() {
        return R0().toString();
    }

    @Override
    public long v0() {
        throw new UnsupportedOperationException("Method not decompiled: hc.e.v0():long");
    }

    @Override
    public int write(ByteBuffer byteBuffer) {
        k.e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i10 = remaining;
        while (i10 > 0) {
            v T0 = T0(1);
            int min = Math.min(i10, 8192 - T0.f12674c);
            byteBuffer.get(T0.f12672a, T0.f12674c, min);
            i10 -= min;
            T0.f12674c += min;
        }
        this.f12645b += remaining;
        return remaining;
    }

    public final void y0() {
        b0(size());
    }

    public e clone() {
        return B0();
    }
}
