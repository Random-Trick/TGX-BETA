package c5;

import android.os.Handler;
import android.os.Message;
import c5.n;
import java.util.ArrayList;
import java.util.List;

public final class g0 implements n {
    public static final List<b> f4819b = new ArrayList(50);
    public final Handler f4820a;

    public static final class b implements n.a {
        public Message f4821a;
        public g0 f4822b;

        public b() {
        }

        @Override
        public void a() {
            ((Message) c5.a.e(this.f4821a)).sendToTarget();
            b();
        }

        public final void b() {
            this.f4821a = null;
            this.f4822b = null;
            g0.n(this);
        }

        public boolean c(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) c5.a.e(this.f4821a));
            b();
            return sendMessageAtFrontOfQueue;
        }

        public b d(Message message, g0 g0Var) {
            this.f4821a = message;
            this.f4822b = g0Var;
            return this;
        }
    }

    public g0(Handler handler) {
        this.f4820a = handler;
    }

    public static b m() {
        b bVar;
        List<b> list = f4819b;
        synchronized (list) {
            if (list.isEmpty()) {
                bVar = new b();
            } else {
                bVar = list.remove(list.size() - 1);
            }
        }
        return bVar;
    }

    public static void n(b bVar) {
        List<b> list = f4819b;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(bVar);
            }
        }
    }

    @Override
    public n.a a(int i10, int i11, int i12) {
        return m().d(this.f4820a.obtainMessage(i10, i11, i12), this);
    }

    @Override
    public boolean b(n.a aVar) {
        return ((b) aVar).c(this.f4820a);
    }

    @Override
    public boolean c(Runnable runnable) {
        return this.f4820a.post(runnable);
    }

    @Override
    public n.a d(int i10) {
        return m().d(this.f4820a.obtainMessage(i10), this);
    }

    @Override
    public boolean e(int i10) {
        return this.f4820a.hasMessages(i10);
    }

    @Override
    public boolean f(int i10) {
        return this.f4820a.sendEmptyMessage(i10);
    }

    @Override
    public n.a g(int i10, int i11, int i12, Object obj) {
        return m().d(this.f4820a.obtainMessage(i10, i11, i12, obj), this);
    }

    @Override
    public boolean h(int i10, long j10) {
        return this.f4820a.sendEmptyMessageAtTime(i10, j10);
    }

    @Override
    public void i(int i10) {
        this.f4820a.removeMessages(i10);
    }

    @Override
    public n.a j(int i10, Object obj) {
        return m().d(this.f4820a.obtainMessage(i10, obj), this);
    }

    @Override
    public void k(Object obj) {
        this.f4820a.removeCallbacksAndMessages(obj);
    }
}
