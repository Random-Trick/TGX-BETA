package o6;

import android.os.Bundle;
import t6.a;
import w6.p;

public final class s extends r {
    public s(u uVar, p pVar) {
        super(uVar, new a("OnCompleteUpdateCallback"), pVar);
    }

    @Override
    public final void N0(Bundle bundle) {
        int i10;
        int i11;
        super.N0(bundle);
        i10 = bundle.getInt("error.code", -2);
        if (i10 != 0) {
            p pVar = this.f19250b;
            i11 = bundle.getInt("error.code", -2);
            pVar.d(new com.google.android.play.core.install.a(i11));
            return;
        }
        this.f19250b.e(null);
    }
}
