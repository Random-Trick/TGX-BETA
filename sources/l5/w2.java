package l5;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import j5.a;
import j5.d;
import java.util.concurrent.atomic.AtomicReference;
import w5.i;

public abstract class w2 extends LifecycleCallback implements DialogInterface.OnCancelListener {
    public final d N;
    public volatile boolean f16265b;
    public final AtomicReference<t2> f16266c = new AtomicReference<>(null);
    public final Handler M = new i(Looper.getMainLooper());

    public w2(h hVar, d dVar) {
        super(hVar);
        this.N = dVar;
    }

    public static final int e(t2 t2Var) {
        if (t2Var == null) {
            return -1;
        }
        return t2Var.a();
    }

    public final void c() {
        this.f16266c.set(null);
        g();
    }

    public final void d(a aVar, int i10) {
        this.f16266c.set(null);
        f(aVar, i10);
    }

    public abstract void f(a aVar, int i10);

    public abstract void g();

    public final void h(a aVar, int i10) {
        t2 t2Var = new t2(aVar, i10);
        if (this.f16266c.compareAndSet(null, t2Var)) {
            this.M.post(new v2(this, t2Var));
        }
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        d(new a(13, null), e(this.f16266c.get()));
    }
}
