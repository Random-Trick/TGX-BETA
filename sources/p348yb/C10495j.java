package p348yb;

import java.io.IOException;
import p107ha.C5040a;
import p351z.C11183e;
import qa.C8298k;

public final class C10495j extends RuntimeException {
    public IOException f33647a;
    public final IOException f33648b;

    public C10495j(IOException iOException) {
        super(iOException);
        C8298k.m12933e(iOException, "firstConnectException");
        this.f33648b = iOException;
        this.f33647a = iOException;
    }

    public final void m4939a(IOException iOException) {
        C8298k.m12933e(iOException, C11183e.f35837c);
        C5040a.m24202a(this.f33648b, iOException);
        this.f33647a = iOException;
    }

    public final IOException m4938b() {
        return this.f33648b;
    }

    public final IOException m4937c() {
        return this.f33647a;
    }
}
