package p148k5;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;
import p118i5.C5217a;
import p118i5.C5220d;
import p299v5.HandlerC9849i;

public abstract class AbstractDialogInterface$OnCancelListenerC6183w2 extends LifecycleCallback implements DialogInterface.OnCancelListener {
    public final C5220d f19580N;
    public volatile boolean f19581b;
    public final AtomicReference<C6171t2> f19582c = new AtomicReference<>(null);
    public final Handler f19579M = new HandlerC9849i(Looper.getMainLooper());

    public AbstractDialogInterface$OnCancelListenerC6183w2(AbstractC6116h hVar, C5220d dVar) {
        super(hVar);
        this.f19580N = dVar;
    }

    public static final int m21095e(C6171t2 t2Var) {
        if (t2Var == null) {
            return -1;
        }
        return t2Var.m21129a();
    }

    public final void m21097c() {
        this.f19582c.set(null);
        mo21093g();
    }

    public final void m21096d(C5217a aVar, int i) {
        this.f19582c.set(null);
        mo21094f(aVar, i);
    }

    public abstract void mo21094f(C5217a aVar, int i);

    public abstract void mo21093g();

    public final void m21092h(C5217a aVar, int i) {
        C6171t2 t2Var = new C6171t2(aVar, i);
        if (this.f19582c.compareAndSet(null, t2Var)) {
            this.f19579M.post(new RunnableC6179v2(this, t2Var));
        }
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        m21096d(new C5217a(13, null), m21095e(this.f19582c.get()));
    }
}
