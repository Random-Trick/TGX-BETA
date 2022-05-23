package p6;

import java.io.File;
import org.thunderdog.challegram.Log;
import t6.a;
import t6.y;

public final class b1 {
    public static final a f20548g = new a("ExtractChunkTaskHandler");
    public final byte[] f20549a = new byte[Log.TAG_LUX];
    public final f0 f20550b;
    public final y f20551c;
    public final y f20552d;
    public final k1 f20553e;
    public final u2 f20554f;

    public b1(f0 f0Var, y yVar, y yVar2, k1 k1Var, u2 u2Var) {
        this.f20550b = f0Var;
        this.f20551c = yVar;
        this.f20552d = yVar2;
        this.f20553e = k1Var;
        this.f20554f = u2Var;
    }

    public final void a(p6.a1 r23) {
        throw new UnsupportedOperationException("Method not decompiled: p6.b1.a(p6.a1):void");
    }

    public final File b(a1 a1Var) {
        File C = this.f20550b.C(a1Var.f20556b, a1Var.f20529c, a1Var.f20530d, a1Var.f20532f);
        if (!C.exists()) {
            C.mkdirs();
        }
        return C;
    }
}
