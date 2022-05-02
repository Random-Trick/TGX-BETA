package p202o6;

import android.os.Bundle;
import p262s6.C8646a;
import p262s6.C8670m;
import p300v6.C9865p;

public final class BinderC7747r extends BinderC7717l {
    public final int f24807c;
    public final String f24808d;
    public final int f24809e;
    public final C7757t f24810f;

    public BinderC7747r(C7757t tVar, C9865p pVar, int i, String str, int i2) {
        super(tVar, pVar);
        this.f24810f = tVar;
        this.f24807c = i;
        this.f24808d = str;
        this.f24809e = i2;
    }

    @Override
    public final void mo11753p0(Bundle bundle) {
        C8670m mVar;
        C8646a aVar;
        mVar = this.f24810f.f24848d;
        mVar.m11775s(this.f24744a);
        int i = bundle.getInt("error_code");
        aVar = C7757t.f24843g;
        aVar.m11816b("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(i));
        int i2 = this.f24809e;
        if (i2 > 0) {
            this.f24810f.m15132j(this.f24807c, this.f24808d, i2 - 1);
        }
    }
}
