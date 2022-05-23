package hd;

import ce.y;
import je.e;
import ld.h;
import org.drinkless.td.libcore.telegram.TdApi;
import zd.o6;

public class a {
    public final o6 f12685a;
    public final long f12686b;
    public h f12687c;
    public int f12688d;
    public e f12689e;
    public float f12690f;

    public a(o6 o6Var, long j10) {
        this.f12685a = o6Var;
        this.f12686b = j10;
        a();
    }

    public void a() {
        TdApi.User u22 = this.f12685a.e2().u2(this.f12686b);
        this.f12689e = t2.E1(u22);
        this.f12688d = t2.I0(u22, this.f12685a.fa());
        this.f12687c = t2.G0(this.f12685a, u22);
        this.f12690f = y.v0(this.f12689e, 15.0f);
    }
}
