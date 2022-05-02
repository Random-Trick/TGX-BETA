package p020b5;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import p020b5.AbstractC1221n;

public final class C1199g0 implements AbstractC1221n {
    public static final List<C1201b> f4498b = new ArrayList(50);
    public final Handler f4499a;

    public static final class C1201b implements AbstractC1221n.AbstractC1222a {
        public Message f4500a;
        public C1199g0 f4501b;

        public C1201b() {
        }

        @Override
        public void mo37909a() {
            ((Message) C1186a.m38188e(this.f4500a)).sendToTarget();
            m38075b();
        }

        public final void m38075b() {
            this.f4500a = null;
            this.f4501b = null;
            C1199g0.m38076n(this);
        }

        public boolean m38074c(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) C1186a.m38188e(this.f4500a));
            m38075b();
            return sendMessageAtFrontOfQueue;
        }

        public C1201b m38073d(Message message, C1199g0 g0Var) {
            this.f4500a = message;
            this.f4501b = g0Var;
            return this;
        }
    }

    public C1199g0(Handler handler) {
        this.f4499a = handler;
    }

    public static C1201b m38077m() {
        C1201b bVar;
        List<C1201b> list = f4498b;
        synchronized (list) {
            if (list.isEmpty()) {
                bVar = new C1201b();
            } else {
                bVar = list.remove(list.size() - 1);
            }
        }
        return bVar;
    }

    public static void m38076n(C1201b bVar) {
        List<C1201b> list = f4498b;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(bVar);
            }
        }
    }

    @Override
    public AbstractC1221n.AbstractC1222a mo37920a(int i, int i2, int i3) {
        return m38077m().m38073d(this.f4499a.obtainMessage(i, i2, i3), this);
    }

    @Override
    public boolean mo37919b(AbstractC1221n.AbstractC1222a aVar) {
        return ((C1201b) aVar).m38074c(this.f4499a);
    }

    @Override
    public boolean mo37918c(Runnable runnable) {
        return this.f4499a.post(runnable);
    }

    @Override
    public AbstractC1221n.AbstractC1222a mo37917d(int i) {
        return m38077m().m38073d(this.f4499a.obtainMessage(i), this);
    }

    @Override
    public boolean mo37916e(int i) {
        return this.f4499a.hasMessages(i);
    }

    @Override
    public boolean mo37915f(int i) {
        return this.f4499a.sendEmptyMessage(i);
    }

    @Override
    public AbstractC1221n.AbstractC1222a mo37914g(int i, int i2, int i3, Object obj) {
        return m38077m().m38073d(this.f4499a.obtainMessage(i, i2, i3, obj), this);
    }

    @Override
    public boolean mo37913h(int i, long j) {
        return this.f4499a.sendEmptyMessageAtTime(i, j);
    }

    @Override
    public void mo37912i(int i) {
        this.f4499a.removeMessages(i);
    }

    @Override
    public AbstractC1221n.AbstractC1222a mo37911j(int i, Object obj) {
        return m38077m().m38073d(this.f4499a.obtainMessage(i, obj), this);
    }

    @Override
    public void mo37910k(Object obj) {
        this.f4499a.removeCallbacksAndMessages(obj);
    }
}
