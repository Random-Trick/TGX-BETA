package p298v4;

import java.util.Collections;
import java.util.List;
import p020b5.C1186a;
import p020b5.C1216l0;
import p217p4.AbstractC8041f;
import p217p4.C8032b;

public final class C9840b implements AbstractC8041f {
    public final C8032b[] f32118a;
    public final long[] f32119b;

    public C9840b(C8032b[] bVarArr, long[] jArr) {
        this.f32118a = bVarArr;
        this.f32119b = jArr;
    }

    @Override
    public int mo5200a(long j) {
        int e = C1216l0.m37978e(this.f32119b, j, false, false);
        if (e < this.f32119b.length) {
            return e;
        }
        return -1;
    }

    @Override
    public long mo5199b(int i) {
        boolean z = true;
        C1186a.m38189a(i >= 0);
        if (i >= this.f32119b.length) {
            z = false;
        }
        C1186a.m38189a(z);
        return this.f32119b[i];
    }

    @Override
    public List<C8032b> mo5198c(long j) {
        int i = C1216l0.m37970i(this.f32119b, j, true, false);
        if (i != -1) {
            C8032b[] bVarArr = this.f32118a;
            if (bVarArr[i] != C8032b.f26155a0) {
                return Collections.singletonList(bVarArr[i]);
            }
        }
        return Collections.emptyList();
    }

    @Override
    public int mo5197d() {
        return this.f32119b.length;
    }
}
