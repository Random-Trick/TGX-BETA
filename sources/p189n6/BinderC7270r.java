package p189n6;

import android.os.Bundle;
import p262s6.AbstractBinderC8665j0;
import p262s6.C8646a;
import p300v6.C9865p;

public class BinderC7270r extends AbstractBinderC8665j0 {
    public final C8646a f23111a;
    public final C9865p f23112b;
    public final C7273u f23113c;

    public BinderC7270r(C7273u uVar, C8646a aVar, C9865p pVar) {
        this.f23113c = uVar;
        this.f23111a = aVar;
        this.f23112b = pVar;
    }

    @Override
    public void mo11796P0(Bundle bundle) {
        this.f23113c.f23118a.m11776s(this.f23112b);
        this.f23111a.m11815d("onCompleteUpdate", new Object[0]);
    }

    @Override
    public void mo11795n(Bundle bundle) {
        this.f23113c.f23118a.m11776s(this.f23112b);
        this.f23111a.m11815d("onRequestInfo", new Object[0]);
    }
}
