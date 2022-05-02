package p202o6;

import java.io.File;
import org.thunderdog.challegram.Log;
import p262s6.AbstractC8689y;
import p262s6.C8646a;

public final class C7665b1 {
    public static final C8646a f24574g = new C8646a("ExtractChunkTaskHandler");
    public final byte[] f24575a = new byte[Log.TAG_LUX];
    public final C7688f0 f24576b;
    public final AbstractC8689y f24577c;
    public final AbstractC8689y f24578d;
    public final C7714k1 f24579e;
    public final C7765u2 f24580f;

    public C7665b1(C7688f0 f0Var, AbstractC8689y yVar, AbstractC8689y yVar2, C7714k1 k1Var, C7765u2 u2Var) {
        this.f24576b = f0Var;
        this.f24577c = yVar;
        this.f24578d = yVar2;
        this.f24579e = k1Var;
        this.f24580f = u2Var;
    }

    public final void m15280a(p202o6.C7659a1 r23) {
        throw new UnsupportedOperationException("Method not decompiled: p202o6.C7665b1.m15280a(o6.a1):void");
    }

    public final File m15279b(C7659a1 a1Var) {
        File C = this.f24576b.m15259C(a1Var.f24582b, a1Var.f24555c, a1Var.f24556d, a1Var.f24558f);
        if (!C.exists()) {
            C.mkdirs();
        }
        return C;
    }
}
