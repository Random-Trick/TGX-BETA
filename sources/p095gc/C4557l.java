package p095gc;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import qa.C8298k;

public final class C4557l implements AbstractC4537a0 {
    public final C4558m f14980M;
    public final CRC32 f14981N = new CRC32();
    public byte f14982a;
    public final C4567u f14983b;
    public final Inflater f14984c;

    public C4557l(AbstractC4537a0 a0Var) {
        C8298k.m12933e(a0Var, "source");
        C4567u uVar = new C4567u(a0Var);
        this.f14983b = uVar;
        Inflater inflater = new Inflater(true);
        this.f14984c = inflater;
        this.f14980M = new C4558m(uVar, inflater);
    }

    @Override
    public C4539b0 mo27336c() {
        return this.f14983b.mo27336c();
    }

    @Override
    public void close() {
        this.f14980M.close();
    }

    public final void m27388m(String str, int i, int i2) {
        if (i2 != i) {
            String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
            C8298k.m12934d(format, "java.lang.String.format(this, *args)");
            throw new IOException(format);
        }
    }

    @Override
    public long mo5028s(C4549e eVar, long j) {
        C8298k.m12933e(eVar, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (i == 0) {
            return 0L;
        } else {
            if (this.f14982a == 0) {
                m27387t();
                this.f14982a = (byte) 1;
            }
            if (this.f14982a == 1) {
                long size = eVar.size();
                long s = this.f14980M.mo5028s(eVar, j);
                if (s != -1) {
                    m27385z0(eVar, size, s);
                    return s;
                }
                this.f14982a = (byte) 2;
            }
            if (this.f14982a == 2) {
                m27386y0();
                this.f14982a = (byte) 3;
                if (!this.f14983b.mo27341B()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
    }

    public final void m27387t() {
        this.f14983b.mo27331s0(10L);
        byte D0 = this.f14983b.f15000a.m27446D0(3L);
        boolean z = true;
        boolean z2 = ((D0 >> 1) & 1) == 1;
        if (z2) {
            m27385z0(this.f14983b.f15000a, 0L, 10L);
        }
        m27388m("ID1ID2", 8075, this.f14983b.readShort());
        this.f14983b.mo27337a0(8L);
        if (((D0 >> 2) & 1) == 1) {
            this.f14983b.mo27331s0(2L);
            if (z2) {
                m27385z0(this.f14983b.f15000a, 0L, 2L);
            }
            long M0 = this.f14983b.f15000a.m27437M0();
            this.f14983b.mo27331s0(M0);
            if (z2) {
                m27385z0(this.f14983b.f15000a, 0L, M0);
            }
            this.f14983b.mo27337a0(M0);
        }
        if (((D0 >> 3) & 1) == 1) {
            long m = this.f14983b.m27333m((byte) 0);
            if (m != -1) {
                if (z2) {
                    m27385z0(this.f14983b.f15000a, 0L, m + 1);
                }
                this.f14983b.mo27337a0(m + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((D0 >> 4) & 1) != 1) {
            z = false;
        }
        if (z) {
            long m2 = this.f14983b.m27333m((byte) 0);
            if (m2 != -1) {
                if (z2) {
                    m27385z0(this.f14983b.f15000a, 0L, m2 + 1);
                }
                this.f14983b.mo27337a0(m2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z2) {
            m27388m("FHCRC", this.f14983b.m27327z0(), (short) this.f14981N.getValue());
            this.f14981N.reset();
        }
    }

    public final void m27386y0() {
        m27388m("CRC", this.f14983b.m27328y0(), (int) this.f14981N.getValue());
        m27388m("ISIZE", this.f14983b.m27328y0(), (int) this.f14984c.getBytesWritten());
    }

    public final void m27385z0(C4549e eVar, long j, long j2) {
        int i;
        C4568v vVar = eVar.f14970a;
        C8298k.m12935c(vVar);
        while (true) {
            int i2 = vVar.f15006c;
            int i3 = vVar.f15005b;
            if (j >= i2 - i3) {
                j -= i2 - i3;
                vVar = vVar.f15009f;
                C8298k.m12935c(vVar);
            }
        }
        while (j2 > 0) {
            int min = (int) Math.min(vVar.f15006c - i, j2);
            this.f14981N.update(vVar.f15004a, (int) (vVar.f15005b + j), min);
            j2 -= min;
            vVar = vVar.f15009f;
            C8298k.m12935c(vVar);
            j = 0;
        }
    }
}
