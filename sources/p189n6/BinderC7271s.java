package p189n6;

import android.os.Bundle;
import com.google.android.play.core.install.C3505a;
import p262s6.C8646a;
import p300v6.C9865p;

public final class BinderC7271s extends BinderC7270r {
    public BinderC7271s(C7273u uVar, C9865p pVar) {
        super(uVar, new C8646a("OnCompleteUpdateCallback"), pVar);
    }

    @Override
    public final void mo11796P0(Bundle bundle) {
        int i;
        int i2;
        super.mo11796P0(bundle);
        i = bundle.getInt("error.code", -2);
        if (i != 0) {
            C9865p pVar = this.f23112b;
            i2 = bundle.getInt("error.code", -2);
            pVar.m6732d(new C3505a(i2));
            return;
        }
        this.f23112b.m6731e(null);
    }
}
