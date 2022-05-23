package o4;

import android.net.Uri;
import b5.i0;
import b5.k;
import b5.o;
import c5.b0;
import java.util.List;
import java.util.Map;

public final class j implements k {
    public final k f19120a;
    public final int f19121b;
    public final a f19122c;
    public final byte[] f19123d;
    public int f19124e;

    public interface a {
        void a(b0 b0Var);
    }

    public j(k kVar, int i10, a aVar) {
        c5.a.a(i10 > 0);
        this.f19120a = kVar;
        this.f19121b = i10;
        this.f19122c = aVar;
        this.f19123d = new byte[1];
        this.f19124e = i10;
    }

    @Override
    public int b(byte[] bArr, int i10, int i11) {
        if (this.f19124e == 0) {
            if (!s()) {
                return -1;
            }
            this.f19124e = this.f19121b;
        }
        int b10 = this.f19120a.b(bArr, i10, Math.min(this.f19124e, i11));
        if (b10 != -1) {
            this.f19124e -= b10;
        }
        return b10;
    }

    @Override
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override
    public long d(o oVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void i(i0 i0Var) {
        c5.a.e(i0Var);
        this.f19120a.i(i0Var);
    }

    @Override
    public Map<String, List<String>> l() {
        return this.f19120a.l();
    }

    @Override
    public Uri p() {
        return this.f19120a.p();
    }

    public final boolean s() {
        if (this.f19120a.b(this.f19123d, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.f19123d[0] & 255) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (i11 > 0) {
            int b10 = this.f19120a.b(bArr, i12, i11);
            if (b10 == -1) {
                return false;
            }
            i12 += b10;
            i11 -= b10;
        }
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        if (i10 > 0) {
            this.f19122c.a(new b0(bArr, i10));
        }
        return true;
    }
}
