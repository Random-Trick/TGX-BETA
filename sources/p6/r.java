package p6;

import android.os.Bundle;
import t6.a;
import t6.m;
import w6.p;

public final class r extends l {
    public final int f20761c;
    public final String f20762d;
    public final int f20763e;
    public final t f20764f;

    public r(t tVar, p pVar, int i10, String str, int i11) {
        super(tVar, pVar);
        this.f20764f = tVar;
        this.f20761c = i10;
        this.f20762d = str;
        this.f20763e = i11;
    }

    @Override
    public final void r0(Bundle bundle) {
        m mVar;
        a aVar;
        mVar = this.f20764f.f20800d;
        mVar.s(this.f20698a);
        int i10 = bundle.getInt("error_code");
        aVar = t.f20795g;
        aVar.b("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(i10));
        int i11 = this.f20763e;
        if (i11 > 0) {
            this.f20764f.j(this.f20761c, this.f20762d, i11 - 1);
        }
    }
}
