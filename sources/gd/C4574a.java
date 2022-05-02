package gd;

import be.C1410y;
import ie.C5386e;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p156kd.C6246h;
import p350yd.C10930q6;

public class C4574a {
    public final C10930q6 f15019a;
    public final long f15020b;
    public C6246h f15021c;
    public int f15022d;
    public C5386e f15023e;
    public float f15024f;

    public C4574a(C10930q6 q6Var, long j) {
        this.f15019a = q6Var;
        this.f15020b = j;
        m27299a();
    }

    public void m27299a() {
        TdApi.User v2 = this.f15019a.m2480e2().m1583v2(this.f15020b);
        this.f15023e = C4779t2.m25701E1(v2);
        this.f15022d = C4779t2.m25674I0(v2, this.f15019a.m2519ba());
        this.f15021c = C4779t2.m25688G0(this.f15019a, v2);
        this.f15024f = C1410y.m37008v0(this.f15023e, 15.0f);
    }
}
