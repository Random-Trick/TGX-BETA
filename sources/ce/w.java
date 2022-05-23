package ce;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import lb.d;
import org.thunderdog.challegram.a;
import ud.q1;
import ud.v4;

public class w implements Handler.Callback, d.a, v4.j, a.h {
    public boolean N;
    public boolean O;
    public final org.thunderdog.challegram.a f5355a;
    public final d<a> f5356b = new d<>(false, true, this);
    public final d<a> f5357c = new d<>();
    public final Handler M = new Handler(Looper.getMainLooper(), this);

    public interface a {
        long c(w wVar);

        v4<?> d(w wVar);
    }

    public w(org.thunderdog.challegram.a aVar) {
        this.f5355a = aVar;
        aVar.Q(this);
    }

    public static long e() {
        return Math.max(ValueAnimator.getFrameDelay(), 15L);
    }

    @Override
    public void M4() {
        d();
    }

    @Override
    public void Q0(int i10, boolean z10) {
    }

    @Override
    public void a(v4<?> v4Var, q1 q1Var, boolean z10) {
        d<a> dVar;
        d<a> dVar2;
        if (z10) {
            dVar2 = this.f5357c;
            dVar = this.f5356b;
        } else {
            dVar2 = this.f5356b;
            dVar = this.f5357c;
        }
        Iterator<a> it = dVar2.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.d(this) == v4Var) {
                dVar2.remove(next);
                dVar.add(next);
            }
        }
    }

    @Override
    public void b(d<?> dVar, boolean z10) {
        if (this.O != z10) {
            this.O = z10;
            d();
        }
    }

    public void c(a aVar) {
        boolean z10;
        v4<?> d10 = aVar.d(this);
        if (d10 != null) {
            if (d10.z9()) {
                z10 = this.f5356b.add(aVar);
            } else {
                z10 = this.f5357c.add(aVar);
            }
            if (z10) {
                d10.j8(this);
                return;
            }
            return;
        }
        this.f5356b.add(aVar);
    }

    @Override
    public void c6() {
        d();
    }

    public final void d() {
        boolean z10 = this.O && this.f5355a.L0() == 0;
        if (this.N != z10) {
            this.N = z10;
            if (z10) {
                Handler handler = this.M;
                handler.sendMessageDelayed(Message.obtain(handler, 0), e());
                return;
            }
            this.M.removeMessages(0);
        }
    }

    public void f(a aVar) {
        v4<?> d10 = aVar.d(this);
        if (d10 == null || d10.z9()) {
            this.f5356b.remove(aVar);
        } else {
            this.f5357c.remove(aVar);
        }
    }

    @Override
    public boolean handleMessage(Message message) {
        Iterator<a> it = this.f5356b.iterator();
        long j10 = -1;
        while (it.hasNext()) {
            long c10 = it.next().c(this);
            if (c10 != -1 && (j10 == -1 || c10 < j10)) {
                j10 = c10;
            }
        }
        if (!this.N) {
            return true;
        }
        Handler handler = this.M;
        handler.sendMessageDelayed(Message.obtain(handler, 0), Math.max(e(), j10));
        return true;
    }

    @Override
    public void o6() {
        d();
    }
}
