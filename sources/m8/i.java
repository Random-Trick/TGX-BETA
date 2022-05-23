package m8;

import h8.m;

public final class i {
    public final boolean f17322a;

    public i(boolean z10) {
        this.f17322a = z10;
    }

    public void a(m[] mVarArr) {
        if (this.f17322a && mVarArr != null && mVarArr.length >= 3) {
            m mVar = mVarArr[0];
            mVarArr[0] = mVarArr[2];
            mVarArr[2] = mVar;
        }
    }
}
