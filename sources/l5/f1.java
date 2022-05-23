package l5;

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.Map;
import java.util.Set;
import k5.a;
import m5.c;
import m5.k;

public final class f1 implements c.AbstractC0154c, a2 {
    public final a.f f16086a;
    public final b<?> f16087b;
    public k f16088c = null;
    public Set<Scope> f16089d = null;
    public boolean f16090e = false;
    public final f f16091f;

    public f1(f fVar, a.f fVar2, b<?> bVar) {
        this.f16091f = fVar;
        this.f16086a = fVar2;
        this.f16087b = bVar;
    }

    @Override
    public final void a(k kVar, Set<Scope> set) {
        if (kVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            b(new j5.a(4));
            return;
        }
        this.f16088c = kVar;
        this.f16089d = set;
        h();
    }

    @Override
    public final void b(j5.a aVar) {
        Map map;
        map = this.f16091f.U;
        c1 c1Var = (c1) map.get(this.f16087b);
        if (c1Var != null) {
            c1Var.o(aVar);
        }
    }

    @Override
    public final void c(j5.a aVar) {
        Handler handler;
        handler = this.f16091f.X;
        handler.post(new e1(this, aVar));
    }

    public final void h() {
        k kVar;
        if (this.f16090e && (kVar = this.f16088c) != null) {
            this.f16086a.g(kVar, this.f16089d);
        }
    }
}
