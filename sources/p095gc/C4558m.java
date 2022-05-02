package p095gc;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import qa.C8298k;

public final class C4558m implements AbstractC4537a0 {
    public final Inflater f14985M;
    public int f14986a;
    public boolean f14987b;
    public final AbstractC4551g f14988c;

    public C4558m(AbstractC4551g gVar, Inflater inflater) {
        C8298k.m12934e(gVar, "source");
        C8298k.m12934e(inflater, "inflater");
        this.f14988c = gVar;
        this.f14985M = inflater;
    }

    @Override
    public C4539b0 mo27334c() {
        return this.f14988c.mo27334c();
    }

    @Override
    public void close() {
        if (!this.f14987b) {
            this.f14985M.end();
            this.f14987b = true;
            this.f14988c.close();
        }
    }

    public final long m27382m(C4549e eVar, long j) {
        C8298k.m12934e(eVar, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (!(!this.f14987b)) {
            throw new IllegalStateException("closed".toString());
        } else if (i == 0) {
            return 0L;
        } else {
            try {
                C4568v T0 = eVar.m27428T0(1);
                int min = (int) Math.min(j, 8192 - T0.f15006c);
                m27381t();
                int inflate = this.f14985M.inflate(T0.f15004a, T0.f15006c, min);
                m27380y0();
                if (inflate > 0) {
                    T0.f15006c += inflate;
                    long j2 = inflate;
                    eVar.m27431Q0(eVar.size() + j2);
                    return j2;
                }
                if (T0.f15005b == T0.f15006c) {
                    eVar.f14970a = T0.m27323b();
                    C4570w.m27317b(T0);
                }
                return 0L;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
    }

    @Override
    public long mo5028s(C4549e eVar, long j) {
        C8298k.m12934e(eVar, "sink");
        do {
            long m = m27382m(eVar, j);
            if (m > 0) {
                return m;
            }
            if (this.f14985M.finished() || this.f14985M.needsDictionary()) {
                return -1L;
            }
        } while (!this.f14988c.mo27339B());
        throw new EOFException("source exhausted prematurely");
    }

    public final boolean m27381t() {
        if (!this.f14985M.needsInput()) {
            return false;
        }
        if (this.f14988c.mo27339B()) {
            return true;
        }
        C4568v vVar = this.f14988c.mo27336a().f14970a;
        C8298k.m12936c(vVar);
        int i = vVar.f15006c;
        int i2 = vVar.f15005b;
        int i3 = i - i2;
        this.f14986a = i3;
        this.f14985M.setInput(vVar.f15004a, i2, i3);
        return false;
    }

    public final void m27380y0() {
        int i = this.f14986a;
        if (i != 0) {
            int remaining = i - this.f14985M.getRemaining();
            this.f14986a -= remaining;
            this.f14988c.mo27335a0(remaining);
        }
    }
}
