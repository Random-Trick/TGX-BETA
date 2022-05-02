package la;

import p153ka.C6220a;
import qa.C8298k;

public class C6432a extends C6220a {
    @Override
    public void mo20407a(Throwable th, Throwable th2) {
        C8298k.m12933e(th, "cause");
        C8298k.m12933e(th2, "exception");
        th.addSuppressed(th2);
    }
}
