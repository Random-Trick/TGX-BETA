package zb;

import ia.a;
import java.io.IOException;
import ra.k;
import z.e;

public final class j extends RuntimeException {
    public IOException f27131a;
    public final IOException f27132b;

    public j(IOException iOException) {
        super(iOException);
        k.e(iOException, "firstConnectException");
        this.f27132b = iOException;
        this.f27131a = iOException;
    }

    public final void a(IOException iOException) {
        k.e(iOException, e.f26712c);
        a.a(this.f27132b, iOException);
        this.f27131a = iOException;
    }

    public final IOException b() {
        return this.f27132b;
    }

    public final IOException c() {
        return this.f27131a;
    }
}
