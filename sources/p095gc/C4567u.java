package p095gc;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.thunderdog.challegram.Log;
import p109hc.C5072a;
import qa.C8298k;
import za.C11434a;

public final class C4567u implements AbstractC4551g {
    public final C4549e f15000a = new C4549e();
    public boolean f15001b;
    public final AbstractC4537a0 f15002c;

    public C4567u(AbstractC4537a0 a0Var) {
        C8298k.m12934e(a0Var, "source");
        this.f15002c = a0Var;
    }

    public boolean m27340A0(long j) {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (!this.f15001b) {
            while (this.f15000a.size() < j) {
                if (this.f15002c.mo5028s(this.f15000a, (long) Log.TAG_LUX) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    @Override
    public boolean mo27339B() {
        if (!this.f15001b) {
            return this.f15000a.mo27339B() && this.f15002c.mo5028s(this.f15000a, (long) Log.TAG_LUX) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    public String mo27338H(long j) {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            byte b = (byte) 10;
            long t = m27328t(b, 0L, j2);
            if (t != -1) {
                return C5072a.m24041b(this.f15000a, t);
            }
            if (j2 < Long.MAX_VALUE && m27340A0(j2) && this.f15000a.m27444D0(j2 - 1) == ((byte) 13) && m27340A0(1 + j2) && this.f15000a.m27444D0(j2) == b) {
                return C5072a.m24041b(this.f15000a, j2);
            }
            C4549e eVar = new C4549e();
            C4549e eVar2 = this.f15000a;
            eVar2.m27445C0(eVar, 0L, Math.min(32, eVar2.size()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f15000a.size(), j) + " content=" + eVar.m27438J0().mo27312i() + "…");
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    @Override
    public String mo27337T(Charset charset) {
        C8298k.m12934e(charset, "charset");
        this.f15000a.m27424X0(this.f15002c);
        return this.f15000a.mo27337T(charset);
    }

    @Override
    public C4549e mo27336a() {
        return this.f15000a;
    }

    @Override
    public void mo27335a0(long j) {
        if (!this.f15001b) {
            while (j > 0) {
                if (this.f15000a.size() == 0 && this.f15002c.mo5028s(this.f15000a, (long) Log.TAG_LUX) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f15000a.size());
                this.f15000a.mo27335a0(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    public C4539b0 mo27334c() {
        return this.f15002c.mo27334c();
    }

    @Override
    public void close() {
        if (!this.f15001b) {
            this.f15001b = true;
            this.f15002c.close();
            this.f15000a.m27415y0();
        }
    }

    @Override
    public String mo27333e0() {
        return mo27338H(Long.MAX_VALUE);
    }

    @Override
    public byte[] mo27332g0(long j) {
        mo27329s0(j);
        return this.f15000a.mo27332g0(j);
    }

    @Override
    public boolean isOpen() {
        return !this.f15001b;
    }

    public long m27331m(byte b) {
        return m27328t(b, 0L, Long.MAX_VALUE);
    }

    @Override
    public C4552h mo27330o(long j) {
        mo27329s0(j);
        return this.f15000a.mo27330o(j);
    }

    @Override
    public int read(ByteBuffer byteBuffer) {
        C8298k.m12934e(byteBuffer, "sink");
        if (this.f15000a.size() == 0 && this.f15002c.mo5028s(this.f15000a, (long) Log.TAG_LUX) == -1) {
            return -1;
        }
        return this.f15000a.read(byteBuffer);
    }

    @Override
    public byte readByte() {
        mo27329s0(1L);
        return this.f15000a.readByte();
    }

    @Override
    public int readInt() {
        mo27329s0(4L);
        return this.f15000a.readInt();
    }

    @Override
    public short readShort() {
        mo27329s0(2L);
        return this.f15000a.readShort();
    }

    @Override
    public long mo5028s(C4549e eVar, long j) {
        C8298k.m12934e(eVar, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (!(true ^ this.f15001b)) {
            throw new IllegalStateException("closed".toString());
        } else if (this.f15000a.size() == 0 && this.f15002c.mo5028s(this.f15000a, (long) Log.TAG_LUX) == -1) {
            return -1L;
        } else {
            return this.f15000a.mo5028s(eVar, Math.min(j, this.f15000a.size()));
        }
    }

    @Override
    public void mo27329s0(long j) {
        if (!m27340A0(j)) {
            throw new EOFException();
        }
    }

    public long m27328t(byte b, long j, long j2) {
        boolean z = true;
        if (!this.f15001b) {
            if (0 > j || j2 < j) {
                z = false;
            }
            if (z) {
                while (j < j2) {
                    long E0 = this.f15000a.m27443E0(b, j, j2);
                    if (E0 != -1) {
                        return E0;
                    }
                    long size = this.f15000a.size();
                    if (size >= j2 || this.f15002c.mo5028s(this.f15000a, (long) Log.TAG_LUX) == -1) {
                        return -1L;
                    }
                    j = Math.max(j, size);
                }
                return -1L;
            }
            throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    public String toString() {
        return "buffer(" + this.f15002c + ')';
    }

    @Override
    public long mo27327v0() {
        byte D0;
        mo27329s0(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!m27340A0(i2)) {
                break;
            }
            D0 = this.f15000a.m27444D0(i);
            if ((D0 < ((byte) 48) || D0 > ((byte) 57)) && ((D0 < ((byte) 97) || D0 > ((byte) 102)) && (D0 < ((byte) 65) || D0 > ((byte) 70)))) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected leading [0-9a-fA-F] character but was 0x");
            String num = Integer.toString(D0, C11434a.m661a(C11434a.m661a(16)));
            C8298k.m12935d(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            sb2.append(num);
            throw new NumberFormatException(sb2.toString());
        }
        return this.f15000a.mo27327v0();
    }

    public int m27326y0() {
        mo27329s0(4L);
        return this.f15000a.m27436L0();
    }

    public short m27325z0() {
        mo27329s0(2L);
        return this.f15000a.m27435M0();
    }
}
