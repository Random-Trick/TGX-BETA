package hc;

import ic.a;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.thunderdog.challegram.Log;
import ra.k;

public final class u implements g {
    public final e f12668a = new e();
    public boolean f12669b;
    public final a0 f12670c;

    public u(a0 a0Var) {
        k.e(a0Var, "source");
        this.f12670c = a0Var;
    }

    @Override
    public long A(e eVar, long j10) {
        k.e(eVar, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        } else if (!(true ^ this.f12669b)) {
            throw new IllegalStateException("closed".toString());
        } else if (this.f12668a.size() == 0 && this.f12670c.A(this.f12668a, (long) Log.TAG_LUX) == -1) {
            return -1L;
        } else {
            return this.f12668a.A(eVar, Math.min(j10, this.f12668a.size()));
        }
    }

    public boolean A0(long j10) {
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        } else if (!this.f12669b) {
            while (this.f12668a.size() < j10) {
                if (this.f12670c.A(this.f12668a, (long) Log.TAG_LUX) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    @Override
    public boolean C() {
        if (!this.f12669b) {
            return this.f12668a.C() && this.f12670c.A(this.f12668a, (long) Log.TAG_LUX) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    public String I(long j10) {
        if (j10 >= 0) {
            long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
            byte b10 = (byte) 10;
            long s10 = s(b10, 0L, j11);
            if (s10 != -1) {
                return a.b(this.f12668a, s10);
            }
            if (j11 < Long.MAX_VALUE && A0(j11) && this.f12668a.D0(j11 - 1) == ((byte) 13) && A0(1 + j11) && this.f12668a.D0(j11) == b10) {
                return a.b(this.f12668a, j11);
            }
            e eVar = new e();
            e eVar2 = this.f12668a;
            eVar2.C0(eVar, 0L, Math.min(32, eVar2.size()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f12668a.size(), j10) + " content=" + eVar.J0().i() + "…");
        }
        throw new IllegalArgumentException(("limit < 0: " + j10).toString());
    }

    @Override
    public String U(Charset charset) {
        k.e(charset, "charset");
        this.f12668a.X0(this.f12670c);
        return this.f12668a.U(charset);
    }

    @Override
    public e a() {
        return this.f12668a;
    }

    @Override
    public void b0(long j10) {
        if (!this.f12669b) {
            while (j10 > 0) {
                if (this.f12668a.size() == 0 && this.f12670c.A(this.f12668a, (long) Log.TAG_LUX) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j10, this.f12668a.size());
                this.f12668a.b0(min);
                j10 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    public b0 c() {
        return this.f12670c.c();
    }

    @Override
    public void close() {
        if (!this.f12669b) {
            this.f12669b = true;
            this.f12670c.close();
            this.f12668a.y0();
        }
    }

    @Override
    public String g0() {
        return I(Long.MAX_VALUE);
    }

    @Override
    public byte[] i0(long j10) {
        s0(j10);
        return this.f12668a.i0(j10);
    }

    @Override
    public boolean isOpen() {
        return !this.f12669b;
    }

    public long m(byte b10) {
        return s(b10, 0L, Long.MAX_VALUE);
    }

    @Override
    public h o(long j10) {
        s0(j10);
        return this.f12668a.o(j10);
    }

    @Override
    public int read(ByteBuffer byteBuffer) {
        k.e(byteBuffer, "sink");
        if (this.f12668a.size() == 0 && this.f12670c.A(this.f12668a, (long) Log.TAG_LUX) == -1) {
            return -1;
        }
        return this.f12668a.read(byteBuffer);
    }

    @Override
    public byte readByte() {
        s0(1L);
        return this.f12668a.readByte();
    }

    @Override
    public int readInt() {
        s0(4L);
        return this.f12668a.readInt();
    }

    @Override
    public short readShort() {
        s0(2L);
        return this.f12668a.readShort();
    }

    public long s(byte b10, long j10, long j11) {
        boolean z10 = true;
        if (!this.f12669b) {
            if (0 > j10 || j11 < j10) {
                z10 = false;
            }
            if (z10) {
                while (j10 < j11) {
                    long E0 = this.f12668a.E0(b10, j10, j11);
                    if (E0 != -1) {
                        return E0;
                    }
                    long size = this.f12668a.size();
                    if (size >= j11 || this.f12670c.A(this.f12668a, (long) Log.TAG_LUX) == -1) {
                        return -1L;
                    }
                    j10 = Math.max(j10, size);
                }
                return -1L;
            }
            throw new IllegalArgumentException(("fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    public void s0(long j10) {
        if (!A0(j10)) {
            throw new EOFException();
        }
    }

    public String toString() {
        return "buffer(" + this.f12670c + ')';
    }

    @Override
    public long v0() {
        byte D0;
        s0(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!A0(i11)) {
                break;
            }
            D0 = this.f12668a.D0(i10);
            if ((D0 < ((byte) 48) || D0 > ((byte) 57)) && ((D0 < ((byte) 97) || D0 > ((byte) 102)) && (D0 < ((byte) 65) || D0 > ((byte) 70)))) {
                break;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected leading [0-9a-fA-F] character but was 0x");
            String num = Integer.toString(D0, ab.a.a(ab.a.a(16)));
            k.d(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            sb2.append(num);
            throw new NumberFormatException(sb2.toString());
        }
        return this.f12668a.v0();
    }

    public int y0() {
        s0(4L);
        return this.f12668a.L0();
    }

    public short z0() {
        s0(2L);
        return this.f12668a.M0();
    }
}
