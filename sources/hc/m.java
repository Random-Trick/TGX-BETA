package hc;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import ra.k;

public final class m implements a0 {
    public final Inflater M;
    public int f12655a;
    public boolean f12656b;
    public final g f12657c;

    public m(g gVar, Inflater inflater) {
        k.e(gVar, "source");
        k.e(inflater, "inflater");
        this.f12657c = gVar;
        this.M = inflater;
    }

    @Override
    public long A(e eVar, long j10) {
        k.e(eVar, "sink");
        do {
            long m10 = m(eVar, j10);
            if (m10 > 0) {
                return m10;
            }
            if (this.M.finished() || this.M.needsDictionary()) {
                return -1L;
            }
        } while (!this.f12657c.C());
        throw new EOFException("source exhausted prematurely");
    }

    @Override
    public b0 c() {
        return this.f12657c.c();
    }

    @Override
    public void close() {
        if (!this.f12656b) {
            this.M.end();
            this.f12656b = true;
            this.f12657c.close();
        }
    }

    public final long m(e eVar, long j10) {
        k.e(eVar, "sink");
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        } else if (!(!this.f12656b)) {
            throw new IllegalStateException("closed".toString());
        } else if (i10 == 0) {
            return 0L;
        } else {
            try {
                v T0 = eVar.T0(1);
                int min = (int) Math.min(j10, 8192 - T0.f12674c);
                s();
                int inflate = this.M.inflate(T0.f12672a, T0.f12674c, min);
                y0();
                if (inflate > 0) {
                    T0.f12674c += inflate;
                    long j11 = inflate;
                    eVar.Q0(eVar.size() + j11);
                    return j11;
                }
                if (T0.f12673b == T0.f12674c) {
                    eVar.f12644a = T0.b();
                    w.b(T0);
                }
                return 0L;
            } catch (DataFormatException e10) {
                throw new IOException(e10);
            }
        }
    }

    public final boolean s() {
        if (!this.M.needsInput()) {
            return false;
        }
        if (this.f12657c.C()) {
            return true;
        }
        v vVar = this.f12657c.a().f12644a;
        k.c(vVar);
        int i10 = vVar.f12674c;
        int i11 = vVar.f12673b;
        int i12 = i10 - i11;
        this.f12655a = i12;
        this.M.setInput(vVar.f12672a, i11, i12);
        return false;
    }

    public final void y0() {
        int i10 = this.f12655a;
        if (i10 != 0) {
            int remaining = i10 - this.M.getRemaining();
            this.f12655a -= remaining;
            this.f12657c.b0(remaining);
        }
    }
}
