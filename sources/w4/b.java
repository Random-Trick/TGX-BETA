package w4;

import c5.a;
import c5.l0;
import java.util.Collections;
import java.util.List;
import q4.f;

public final class b implements f {
    public final q4.b[] f25766a;
    public final long[] f25767b;

    public b(q4.b[] bVarArr, long[] jArr) {
        this.f25766a = bVarArr;
        this.f25767b = jArr;
    }

    @Override
    public int a(long j10) {
        int e10 = l0.e(this.f25767b, j10, false, false);
        if (e10 < this.f25767b.length) {
            return e10;
        }
        return -1;
    }

    @Override
    public long b(int i10) {
        boolean z10 = true;
        a.a(i10 >= 0);
        if (i10 >= this.f25767b.length) {
            z10 = false;
        }
        a.a(z10);
        return this.f25767b[i10];
    }

    @Override
    public List<q4.b> c(long j10) {
        int i10 = l0.i(this.f25767b, j10, true, false);
        if (i10 != -1) {
            q4.b[] bVarArr = this.f25766a;
            if (bVarArr[i10] != q4.b.f21377a0) {
                return Collections.singletonList(bVarArr[i10]);
            }
        }
        return Collections.emptyList();
    }

    @Override
    public int d() {
        return this.f25767b.length;
    }
}
