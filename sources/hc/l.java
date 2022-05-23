package hc;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import ra.k;

public final class l implements a0 {
    public final m M;
    public final CRC32 N = new CRC32();
    public byte f12652a;
    public final u f12653b;
    public final Inflater f12654c;

    public l(a0 a0Var) {
        k.e(a0Var, "source");
        u uVar = new u(a0Var);
        this.f12653b = uVar;
        Inflater inflater = new Inflater(true);
        this.f12654c = inflater;
        this.M = new m(uVar, inflater);
    }

    @Override
    public long A(e eVar, long j10) {
        k.e(eVar, "sink");
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        } else if (i10 == 0) {
            return 0L;
        } else {
            if (this.f12652a == 0) {
                s();
                this.f12652a = (byte) 1;
            }
            if (this.f12652a == 1) {
                long size = eVar.size();
                long A = this.M.A(eVar, j10);
                if (A != -1) {
                    z0(eVar, size, A);
                    return A;
                }
                this.f12652a = (byte) 2;
            }
            if (this.f12652a == 2) {
                y0();
                this.f12652a = (byte) 3;
                if (!this.f12653b.C()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
    }

    @Override
    public b0 c() {
        return this.f12653b.c();
    }

    @Override
    public void close() {
        this.M.close();
    }

    public final void m(String str, int i10, int i11) {
        if (i11 != i10) {
            String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}, 3));
            k.d(format, "java.lang.String.format(this, *args)");
            throw new IOException(format);
        }
    }

    public final void s() {
        this.f12653b.s0(10L);
        byte D0 = this.f12653b.f12668a.D0(3L);
        boolean z10 = true;
        boolean z11 = ((D0 >> 1) & 1) == 1;
        if (z11) {
            z0(this.f12653b.f12668a, 0L, 10L);
        }
        m("ID1ID2", 8075, this.f12653b.readShort());
        this.f12653b.b0(8L);
        if (((D0 >> 2) & 1) == 1) {
            this.f12653b.s0(2L);
            if (z11) {
                z0(this.f12653b.f12668a, 0L, 2L);
            }
            long M0 = this.f12653b.f12668a.M0();
            this.f12653b.s0(M0);
            if (z11) {
                z0(this.f12653b.f12668a, 0L, M0);
            }
            this.f12653b.b0(M0);
        }
        if (((D0 >> 3) & 1) == 1) {
            long m10 = this.f12653b.m((byte) 0);
            if (m10 != -1) {
                if (z11) {
                    z0(this.f12653b.f12668a, 0L, m10 + 1);
                }
                this.f12653b.b0(m10 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((D0 >> 4) & 1) != 1) {
            z10 = false;
        }
        if (z10) {
            long m11 = this.f12653b.m((byte) 0);
            if (m11 != -1) {
                if (z11) {
                    z0(this.f12653b.f12668a, 0L, m11 + 1);
                }
                this.f12653b.b0(m11 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z11) {
            m("FHCRC", this.f12653b.z0(), (short) this.N.getValue());
            this.N.reset();
        }
    }

    public final void y0() {
        m("CRC", this.f12653b.y0(), (int) this.N.getValue());
        m("ISIZE", this.f12653b.y0(), (int) this.f12654c.getBytesWritten());
    }

    public final void z0(e eVar, long j10, long j11) {
        int i10;
        v vVar = eVar.f12644a;
        k.c(vVar);
        while (true) {
            int i11 = vVar.f12674c;
            int i12 = vVar.f12673b;
            if (j10 >= i11 - i12) {
                j10 -= i11 - i12;
                vVar = vVar.f12677f;
                k.c(vVar);
            }
        }
        while (j11 > 0) {
            int min = (int) Math.min(vVar.f12674c - i10, j11);
            this.N.update(vVar.f12672a, (int) (vVar.f12673b + j10), min);
            j11 -= min;
            vVar = vVar.f12677f;
            k.c(vVar);
            j10 = 0;
        }
    }
}
