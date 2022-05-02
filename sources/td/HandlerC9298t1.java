package td;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public class HandlerC9298t1 extends Handler {
    public C9270q1 f30090a;
    public C9312u1 f30091b = new C9312u1();
    public boolean f30092c;
    public int f30093d;
    public int f30094e;
    public Object f30095f;

    public HandlerC9298t1(C9270q1 q1Var) {
        this.f30090a = q1Var;
    }

    public static boolean m9607c() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public void m9609a(AbstractC9323v4<?> v4Var) {
        sendMessageDelayed(Message.obtain(this, 12, v4Var), 18L);
    }

    public void m9608b() {
        if (this.f30092c) {
            sendMessage(Message.obtain(this, this.f30093d, 0, this.f30094e, this.f30095f));
            this.f30092c = false;
            this.f30094e = 0;
            this.f30093d = 0;
            this.f30095f = null;
        }
    }

    public void m9606d() {
        if (m9607c()) {
            this.f30090a.m9759G0(false);
        } else {
            sendMessage(Message.obtain(this, 0));
        }
    }

    public void m9605e() {
        m9606d();
    }

    public AbstractC9323v4<?> m9604f() {
        if (this.f30092c) {
            return (AbstractC9323v4) this.f30095f;
        }
        return null;
    }

    public C9312u1 m9603g() {
        return this.f30091b;
    }

    public int m9602h() {
        return this.f30091b.m9513C();
    }

    @Override
    public void handleMessage(Message message) {
        boolean z = false;
        switch (message.what) {
            case 0:
                m9606d();
                return;
            case 1:
                m9596n((AbstractC9323v4) message.obj);
                return;
            case 2:
                AbstractC9323v4<?> v4Var = (AbstractC9323v4) message.obj;
                int i = message.arg2;
                boolean z2 = (i & 1) != 0;
                if ((i & 2) != 0) {
                    z = true;
                }
                m9595o(v4Var, z2, z);
                return;
            case 3:
                AbstractC9323v4<?> v4Var2 = (AbstractC9323v4) message.obj;
                if (message.arg1 == 1) {
                    z = true;
                }
                m9598l(v4Var2, z);
                return;
            case 4:
                m9599k((AbstractC9323v4) message.obj);
                return;
            case 5:
            case 6:
            default:
                return;
            case 7:
                m9597m((AbstractC9323v4) message.obj);
                return;
            case 8:
                m9594p();
                return;
            case 9:
                m9593q();
                return;
            case 10:
                m9600j();
                return;
            case 11:
                m9601i((AbstractC9323v4) message.obj, message.arg2);
                return;
            case 12:
                if (!((AbstractC9323v4) message.obj).m9347Sa()) {
                    ((AbstractC9323v4) message.obj).mo9166sc();
                    return;
                }
                return;
        }
    }

    public void m9601i(AbstractC9323v4<?> v4Var, int i) {
        if (m9607c()) {
            this.f30091b.m9498o(v4Var, i);
        } else {
            sendMessage(Message.obtain(this, 11, 0, i, v4Var));
        }
    }

    public void m9600j() {
        if (!m9607c()) {
            sendMessage(Message.obtain(this, 10));
        } else if (!this.f30090a.m9741S()) {
            this.f30090a.m9744P();
            this.f30090a.m9759G0(true);
            AbstractC9323v4<?> n = this.f30091b.m9499n();
            if (n != null) {
                n.get();
                this.f30090a.m9722f0(n, 1);
            }
        }
    }

    public void m9599k(AbstractC9323v4<?> v4Var) {
        if (!m9607c()) {
            sendMessage(Message.obtain(this, 4, 0, 0, v4Var));
        } else if (this.f30090a.m9741S()) {
            if (!this.f30090a.m9736X()) {
                this.f30090a.m9744P();
                v4Var.get();
                this.f30091b.m9493t(v4Var, true);
                this.f30090a.m9722f0(v4Var, 2);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public void m9598l(AbstractC9323v4<?> v4Var, boolean z) {
        if (!m9607c()) {
            sendMessage(Message.obtain(this, 3, z ? 1 : 0, 0, v4Var));
        } else if (this.f30090a.m9741S()) {
            this.f30090a.m9683z0(this.f30091b.m9499n());
            this.f30091b.m9487z(this.f30090a, z);
            m9605e();
            v4Var.mo9166sc();
        }
    }

    public void m9597m(AbstractC9323v4<?> v4Var) {
        if (!m9607c()) {
            sendMessage(Message.obtain(this, 7, v4Var));
        } else if (this.f30090a.m9741S()) {
            this.f30090a.m9683z0(v4Var);
            m9605e();
        }
    }

    public void m9596n(AbstractC9323v4<?> v4Var) {
        if (m9607c()) {
            v4Var.get();
            this.f30091b.m9511b(this.f30090a);
            this.f30091b.m9493t(v4Var, true);
            this.f30090a.m9771A0();
            this.f30090a.m9715j(v4Var);
            m9609a(v4Var);
            this.f30090a.m9756I().setTitle(v4Var);
            this.f30090a.m9759G0(false);
            return;
        }
        sendMessage(Message.obtain(this, 1, 0, 0, v4Var));
    }

    public void m9595o(AbstractC9323v4<?> v4Var, boolean z, boolean z2) {
        int i = z2 ? (z ? 1 : 0) + 2 : z ? 1 : 0;
        if (!m9607c()) {
            sendMessage(Message.obtain(this, 2, 0, i, v4Var));
        } else if (this.f30090a.m9741S()) {
            this.f30092c = true;
            this.f30095f = v4Var;
            this.f30093d = 2;
            this.f30094e = i;
        } else {
            v4Var.get();
            this.f30090a.m9759G0(true);
            this.f30091b.m9493t(v4Var, true);
            this.f30090a.m9685y0(v4Var, z, z2);
        }
    }

    public void m9594p() {
        if (!m9607c()) {
            sendMessage(Message.obtain(this, 8));
        } else if (this.f30090a.m9741S()) {
            AbstractC9323v4<?> n = this.f30091b.m9499n();
            if (n != null) {
                this.f30090a.m9683z0(n);
                n.get().setAlpha(1.0f);
            }
            this.f30090a.m9755I0(8);
            m9605e();
            AbstractC9323v4<?> l = this.f30091b.m9501l();
            if (l != null) {
                l.mo9166sc();
            }
        }
    }

    public void m9593q() {
        if (!m9607c()) {
            sendMessage(Message.obtain(this, 9));
        } else if (this.f30090a.m9741S()) {
            AbstractC9323v4<?> x = this.f30091b.m9489x();
            if (x != null) {
                this.f30090a.m9683z0(x);
            }
            this.f30090a.m9755I0(8);
            if (x != null) {
                x.mo9384N8(this.f30090a);
                x.mo417Z8();
                x.mo9266e9();
            }
            m9605e();
            AbstractC9323v4<?> l = this.f30091b.m9501l();
            if (l != null) {
                l.mo9166sc();
            }
        }
    }
}
