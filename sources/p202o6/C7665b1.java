package p202o6;

import java.io.File;
import org.thunderdog.challegram.Log;
import p262s6.AbstractC8689y;
import p262s6.C8646a;

public final class C7665b1 {
    public static final C8646a f24571g = new C8646a("ExtractChunkTaskHandler");
    public final byte[] f24572a = new byte[Log.TAG_LUX];
    public final C7688f0 f24573b;
    public final AbstractC8689y f24574c;
    public final AbstractC8689y f24575d;
    public final C7714k1 f24576e;
    public final C7765u2 f24577f;

    public C7665b1(C7688f0 f0Var, AbstractC8689y yVar, AbstractC8689y yVar2, C7714k1 k1Var, C7765u2 u2Var) {
        this.f24573b = f0Var;
        this.f24574c = yVar;
        this.f24575d = yVar2;
        this.f24576e = k1Var;
        this.f24577f = u2Var;
    }

    public final void m15280a(p202o6.C7659a1 r23) {
        throw new UnsupportedOperationException("Method not decompiled: p202o6.C7665b1.m15280a(o6.a1):void");
    }

    public final File m15279b(C7659a1 a1Var) {
        File C = this.f24573b.m15259C(a1Var.f24579b, a1Var.f24552c, a1Var.f24553d, a1Var.f24555f);
        if (!C.exists()) {
            C.mkdirs();
        }
        return C;
    }
}
