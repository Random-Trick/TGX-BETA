package p166l8;

import p093g8.C4530m;

public final class C6425i {
    public final boolean f20107a;

    public C6425i(boolean z) {
        this.f20107a = z;
    }

    public void m20425a(C4530m[] mVarArr) {
        if (this.f20107a && mVarArr != null && mVarArr.length >= 3) {
            C4530m mVar = mVarArr[0];
            mVarArr[0] = mVarArr[2];
            mVarArr[2] = mVar;
        }
    }
}
