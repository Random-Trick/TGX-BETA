package td;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public class HandlerC9298t1 extends Handler {
    public C9270q1 f30087a;
    public C9312u1 f30088b = new C9312u1();
    public boolean f30089c;
    public int f30090d;
    public int f30091e;
    public Object f30092f;

    public HandlerC9298t1(C9270q1 q1Var) {
        this.f30087a = q1Var;
    }

    public static boolean m9608c() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public void m9610a(AbstractC9323v4<?> v4Var) {
        sendMessageDelayed(Message.obtain(this, 12, v4Var), 18L);
    }

    public void m9609b() {
        if (this.f30089c) {
            sendMessage(Message.obtain(this, this.f30090d, 0, this.f30091e, this.f30092f));
            this.f30089c = false;
            this.f30091e = 0;
            this.f30090d = 0;
            this.f30092f = null;
        }
    }

    public void m9607d() {
        if (m9608c()) {
            this.f30087a.m9760G0(false);
        } else {
            sendMessage(Message.obtain(this, 0));
        }
    }

    public void m9606e() {
        m9607d();
    }

    public AbstractC9323v4<?> m9605f() {
        if (this.f30089c) {
            return (AbstractC9323v4) this.f30092f;
        }
        return null;
    }

    public C9312u1 m9604g() {
        return this.f30088b;
    }

    public int m9603h() {
        return this.f30088b.m9513C();
    }

    @Override
    public void handleMessage(Message message) {
        boolean z = false;
        switch (message.what) {
            case 0:
                m9607d();
                return;
            case 1:
                m9597n((AbstractC9323v4) message.obj);
                return;
            case 2:
                AbstractC9323v4<?> v4Var = (AbstractC9323v4) message.obj;
                int i = message.arg2;
                boolean z2 = (i & 1) != 0;
                if ((i & 2) != 0) {
                    z = true;
                }
                m9596o(v4Var, z2, z);
                return;
            case 3:
                AbstractC9323v4<?> v4Var2 = (AbstractC9323v4) message.obj;
                if (message.arg1 == 1) {
                    z = true;
                }
                m9599l(v4Var2, z);
                return;
            case 4:
                m9600k((AbstractC9323v4) message.obj);
                return;
            case 5:
            case 6:
            default:
                return;
            case 7:
                m9598m((AbstractC9323v4) message.obj);
                return;
            case 8:
                m9595p();
                return;
            case 9:
                m9594q();
                return;
            case 10:
                m9601j();
                return;
            case 11:
                m9602i((AbstractC9323v4) message.obj, message.arg2);
                return;
            case 12:
                if (!((AbstractC9323v4) message.obj).m9347Sa()) {
                    ((AbstractC9323v4) message.obj).mo9166sc();
                    return;
                }
                return;
        }
    }

    public void m9602i(AbstractC9323v4<?> v4Var, int i) {
        if (m9608c()) {
            this.f30088b.m9498o(v4Var, i);
        } else {
            sendMessage(Message.obtain(this, 11, 0, i, v4Var));
        }
    }

    public void m9601j() {
        if (!m9608c()) {
            sendMessage(Message.obtain(this, 10));
        } else if (!this.f30087a.m9742S()) {
            this.f30087a.m9745P();
            this.f30087a.m9760G0(true);
            AbstractC9323v4<?> n = this.f30088b.m9499n();
            if (n != null) {
                n.get();
                this.f30087a.m9723f0(n, 1);
            }
        }
    }

    public void m9600k(AbstractC9323v4<?> v4Var) {
        if (!m9608c()) {
            sendMessage(Message.obtain(this, 4, 0, 0, v4Var));
        } else if (this.f30087a.m9742S()) {
            if (!this.f30087a.m9737X()) {
                this.f30087a.m9745P();
                v4Var.get();
                this.f30088b.m9493t(v4Var, true);
                this.f30087a.m9723f0(v4Var, 2);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public void m9599l(AbstractC9323v4<?> v4Var, boolean z) {
        if (!m9608c()) {
            sendMessage(Message.obtain(this, 3, z ? 1 : 0, 0, v4Var));
        } else if (this.f30087a.m9742S()) {
            this.f30087a.m9684z0(this.f30088b.m9499n());
            this.f30088b.m9487z(this.f30087a, z);
            m9606e();
            v4Var.mo9166sc();
        }
    }

    public void m9598m(AbstractC9323v4<?> v4Var) {
        if (!m9608c()) {
            sendMessage(Message.obtain(this, 7, v4Var));
        } else if (this.f30087a.m9742S()) {
            this.f30087a.m9684z0(v4Var);
            m9606e();
        }
    }

    public void m9597n(AbstractC9323v4<?> v4Var) {
        if (m9608c()) {
            v4Var.get();
            this.f30088b.m9511b(this.f30087a);
            this.f30088b.m9493t(v4Var, true);
            this.f30087a.m9772A0();
            this.f30087a.m9716j(v4Var);
            m9610a(v4Var);
            this.f30087a.m9757I().setTitle(v4Var);
            this.f30087a.m9760G0(false);
            return;
        }
        sendMessage(Message.obtain(this, 1, 0, 0, v4Var));
    }

    public void m9596o(AbstractC9323v4<?> v4Var, boolean z, boolean z2) {
        int i = z2 ? (z ? 1 : 0) + 2 : z ? 1 : 0;
        if (!m9608c()) {
            sendMessage(Message.obtain(this, 2, 0, i, v4Var));
        } else if (this.f30087a.m9742S()) {
            this.f30089c = true;
            this.f30092f = v4Var;
            this.f30090d = 2;
            this.f30091e = i;
        } else {
            v4Var.get();
            this.f30087a.m9760G0(true);
            this.f30088b.m9493t(v4Var, true);
            this.f30087a.m9686y0(v4Var, z, z2);
        }
    }

    public void m9595p() {
        if (!m9608c()) {
            sendMessage(Message.obtain(this, 8));
        } else if (this.f30087a.m9742S()) {
            AbstractC9323v4<?> n = this.f30088b.m9499n();
            if (n != null) {
                this.f30087a.m9684z0(n);
                n.get().setAlpha(1.0f);
            }
            this.f30087a.m9756I0(8);
            m9606e();
            AbstractC9323v4<?> l = this.f30088b.m9501l();
            if (l != null) {
                l.mo9166sc();
            }
        }
    }

    public void m9594q() {
        if (!m9608c()) {
            sendMessage(Message.obtain(this, 9));
        } else if (this.f30087a.m9742S()) {
            AbstractC9323v4<?> x = this.f30088b.m9489x();
            if (x != null) {
                this.f30087a.m9684z0(x);
            }
            this.f30087a.m9756I0(8);
            if (x != null) {
                x.mo9384N8(this.f30087a);
                x.mo417Z8();
                x.mo9266e9();
            }
            m9606e();
            AbstractC9323v4<?> l = this.f30088b.m9501l();
            if (l != null) {
                l.mo9166sc();
            }
        }
    }
}
