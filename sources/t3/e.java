package t3;

import b5.h;
import c5.b0;
import java.io.EOFException;
import m3.q1;
import org.thunderdog.challegram.Log;
import t3.t;

public final class e implements t {
    public final byte[] f22890a = new byte[Log.TAG_EMOJI];

    @Override
    public void a(q1 q1Var) {
    }

    @Override
    public int b(h hVar, int i10, boolean z10) {
        return s.a(this, hVar, i10, z10);
    }

    @Override
    public int c(h hVar, int i10, boolean z10, int i11) {
        int b10 = hVar.b(this.f22890a, 0, Math.min(this.f22890a.length, i10));
        if (b10 != -1) {
            return b10;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override
    public void d(b0 b0Var, int i10) {
        s.b(this, b0Var, i10);
    }

    @Override
    public void e(b0 b0Var, int i10, int i11) {
        b0Var.Q(i10);
    }

    @Override
    public void f(long j10, int i10, int i11, int i12, t.a aVar) {
    }
}
