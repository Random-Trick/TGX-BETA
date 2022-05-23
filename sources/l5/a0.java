package l5;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;
import java.util.Set;
import k5.a;
import k5.k;
import m5.r;

public final class a0 implements r0 {
    public final u0 f16018a;
    public boolean f16019b = false;

    public a0(u0 u0Var) {
        this.f16018a = u0Var;
    }

    @Override
    public final void a() {
        if (this.f16019b) {
            this.f16019b = false;
            this.f16018a.k(new z(this, this));
        }
    }

    @Override
    public final <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends k, A>> T b(T t10) {
        try {
            this.f16018a.f16252n.f16207x.a(t10);
            q0 q0Var = this.f16018a.f16252n;
            a.f fVar = q0Var.f16198o.get(t10.s());
            r.l(fVar, "Appropriate Api was not requested.");
            if (fVar.a() || !this.f16018a.f16245g.containsKey(t10.s())) {
                t10.u(fVar);
            } else {
                t10.w(new Status(17));
            }
        } catch (DeadObjectException unused) {
            this.f16018a.k(new y(this, this));
        }
        return t10;
    }

    @Override
    public final boolean c() {
        if (this.f16019b) {
            return false;
        }
        Set<h2> set = this.f16018a.f16252n.f16206w;
        if (set == null || set.isEmpty()) {
            this.f16018a.j(null);
            return true;
        }
        this.f16019b = true;
        for (h2 h2Var : set) {
            h2Var.b();
        }
        return false;
    }

    @Override
    public final void d() {
    }

    @Override
    public final <A extends a.b, R extends k, T extends com.google.android.gms.common.api.internal.a<R, A>> T e(T t10) {
        b(t10);
        return t10;
    }

    @Override
    public final void f(Bundle bundle) {
    }

    @Override
    public final void g(j5.a aVar, a<?> aVar2, boolean z10) {
    }

    @Override
    public final void h(int i10) {
        this.f16018a.j(null);
        this.f16018a.f16253o.c(i10, this.f16019b);
    }

    public final void i() {
        if (this.f16019b) {
            this.f16019b = false;
            this.f16018a.f16252n.f16207x.b();
            c();
        }
    }
}
