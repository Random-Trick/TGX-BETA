package be;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import p154kb.C6227d;
import td.AbstractC9323v4;
import td.C9270q1;

public class C1406w implements Handler.Callback, C6227d.AbstractC6228a, AbstractC9323v4.AbstractC9333j, AbstractView$OnTouchListenerC7889a.AbstractC7897h {
    public boolean f5103N;
    public boolean f5104O;
    public final AbstractView$OnTouchListenerC7889a f5105a;
    public final C6227d<AbstractC1407a> f5106b = new C6227d<>(false, true, this);
    public final C6227d<AbstractC1407a> f5107c = new C6227d<>();
    public final Handler f5102M = new Handler(Looper.getMainLooper(), this);

    public interface AbstractC1407a {
        AbstractC9323v4<?> mo3268a(C1406w wVar);

        long mo3266c(C1406w wVar);
    }

    public C1406w(AbstractView$OnTouchListenerC7889a aVar) {
        this.f5105a = aVar;
        aVar.m14553P(this);
    }

    public static long m37095e() {
        return Math.max(ValueAnimator.getFrameDelay(), 15L);
    }

    @Override
    public void mo6938O0(int i, boolean z) {
    }

    @Override
    public void mo6929S4() {
        m37096d();
    }

    @Override
    public void mo9111a(AbstractC9323v4<?> v4Var, C9270q1 q1Var, boolean z) {
        C6227d<AbstractC1407a> dVar;
        C6227d<AbstractC1407a> dVar2;
        if (z) {
            dVar2 = this.f5107c;
            dVar = this.f5106b;
        } else {
            dVar2 = this.f5106b;
            dVar = this.f5107c;
        }
        Iterator<AbstractC1407a> it = dVar2.iterator();
        while (it.hasNext()) {
            AbstractC1407a next = it.next();
            if (next.mo3268a(this) == v4Var) {
                dVar2.remove(next);
                dVar.add(next);
            }
        }
    }

    @Override
    public void mo4374b(C6227d<?> dVar, boolean z) {
        if (this.f5104O != z) {
            this.f5104O = z;
            m37096d();
        }
    }

    public void m37097c(AbstractC1407a aVar) {
        boolean z;
        AbstractC9323v4<?> a = aVar.mo3268a(this);
        if (a != null) {
            if (a.m9118z9()) {
                z = this.f5106b.add(aVar);
            } else {
                z = this.f5107c.add(aVar);
            }
            if (z) {
                a.m9232j8(this);
                return;
            }
            return;
        }
        this.f5106b.add(aVar);
    }

    public final void m37096d() {
        boolean z = this.f5104O && this.f5105a.m14582I0() == 0;
        if (this.f5103N != z) {
            this.f5103N = z;
            if (z) {
                Handler handler = this.f5102M;
                handler.sendMessageDelayed(Message.obtain(handler, 0), m37095e());
                return;
            }
            this.f5102M.removeMessages(0);
        }
    }

    @Override
    public void mo6904d6() {
        m37096d();
    }

    public void m37094f(AbstractC1407a aVar) {
        AbstractC9323v4<?> a = aVar.mo3268a(this);
        if (a == null || a.m9118z9()) {
            this.f5106b.remove(aVar);
        } else {
            this.f5107c.remove(aVar);
        }
    }

    @Override
    public boolean handleMessage(Message message) {
        Iterator<AbstractC1407a> it = this.f5106b.iterator();
        long j = -1;
        while (it.hasNext()) {
            long c = it.next().mo3266c(this);
            if (c != -1 && (j == -1 || c < j)) {
                j = c;
            }
        }
        if (!this.f5103N) {
            return true;
        }
        Handler handler = this.f5102M;
        handler.sendMessageDelayed(Message.obtain(handler, 0), Math.max(m37095e(), j));
        return true;
    }

    @Override
    public void mo6871o6() {
        m37096d();
    }
}
