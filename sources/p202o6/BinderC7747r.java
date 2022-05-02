package p202o6;

import android.os.Bundle;
import p262s6.C8646a;
import p262s6.C8670m;
import p300v6.C9865p;

public final class BinderC7747r extends BinderC7717l {
    public final int f24804c;
    public final String f24805d;
    public final int f24806e;
    public final C7757t f24807f;

    public BinderC7747r(C7757t tVar, C9865p pVar, int i, String str, int i2) {
        super(tVar, pVar);
        this.f24807f = tVar;
        this.f24804c = i;
        this.f24805d = str;
        this.f24806e = i2;
    }

    @Override
    public final void mo11754p0(Bundle bundle) {
        C8670m mVar;
        C8646a aVar;
        mVar = this.f24807f.f24845d;
        mVar.m11776s(this.f24741a);
        int i = bundle.getInt("error_code");
        aVar = C7757t.f24840g;
        aVar.m11817b("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(i));
        int i2 = this.f24806e;
        if (i2 > 0) {
            this.f24807f.m15132j(this.f24804c, this.f24805d, i2 - 1);
        }
    }
}
