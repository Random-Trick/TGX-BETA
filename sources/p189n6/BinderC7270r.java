package p189n6;

import android.os.Bundle;
import p262s6.AbstractBinderC8665j0;
import p262s6.C8646a;
import p300v6.C9865p;

public class BinderC7270r extends AbstractBinderC8665j0 {
    public final C8646a f23114a;
    public final C9865p f23115b;
    public final C7273u f23116c;

    public BinderC7270r(C7273u uVar, C8646a aVar, C9865p pVar) {
        this.f23116c = uVar;
        this.f23114a = aVar;
        this.f23115b = pVar;
    }

    @Override
    public void mo11795P0(Bundle bundle) {
        this.f23116c.f23121a.m11775s(this.f23115b);
        this.f23114a.m11814d("onCompleteUpdate", new Object[0]);
    }

    @Override
    public void mo11794n(Bundle bundle) {
        this.f23116c.f23121a.m11775s(this.f23115b);
        this.f23114a.m11814d("onRequestInfo", new Object[0]);
    }
}
