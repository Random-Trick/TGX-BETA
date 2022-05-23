package ud;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public class t1 extends Handler {
    public q1 f24439a;
    public u1 f24440b = new u1();
    public boolean f24441c;
    public int f24442d;
    public int f24443e;
    public Object f24444f;

    public t1(q1 q1Var) {
        this.f24439a = q1Var;
    }

    public static boolean c() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public void a(v4<?> v4Var) {
        sendMessageDelayed(Message.obtain(this, 12, v4Var), 18L);
    }

    public void b() {
        if (this.f24441c) {
            sendMessage(Message.obtain(this, this.f24442d, 0, this.f24443e, this.f24444f));
            this.f24441c = false;
            this.f24443e = 0;
            this.f24442d = 0;
            this.f24444f = null;
        }
    }

    public void d() {
        if (c()) {
            this.f24439a.G0(false);
        } else {
            sendMessage(Message.obtain(this, 0));
        }
    }

    public void e() {
        d();
    }

    public v4<?> f() {
        if (this.f24441c) {
            return (v4) this.f24444f;
        }
        return null;
    }

    public u1 g() {
        return this.f24440b;
    }

    public int h() {
        return this.f24440b.C();
    }

    @Override
    public void handleMessage(Message message) {
        boolean z10 = false;
        switch (message.what) {
            case 0:
                d();
                return;
            case 1:
                n((v4) message.obj);
                return;
            case 2:
                v4<?> v4Var = (v4) message.obj;
                int i10 = message.arg2;
                boolean z11 = (i10 & 1) != 0;
                if ((i10 & 2) != 0) {
                    z10 = true;
                }
                o(v4Var, z11, z10);
                return;
            case 3:
                v4<?> v4Var2 = (v4) message.obj;
                if (message.arg1 == 1) {
                    z10 = true;
                }
                l(v4Var2, z10);
                return;
            case 4:
                k((v4) message.obj);
                return;
            case 5:
            case 6:
            default:
                return;
            case 7:
                m((v4) message.obj);
                return;
            case 8:
                p();
                return;
            case 9:
                q();
                return;
            case 10:
                j();
                return;
            case 11:
                i((v4) message.obj, message.arg2);
                return;
            case 12:
                if (!((v4) message.obj).Sa()) {
                    ((v4) message.obj).sc();
                    return;
                }
                return;
        }
    }

    public void i(v4<?> v4Var, int i10) {
        if (c()) {
            this.f24440b.o(v4Var, i10);
        } else {
            sendMessage(Message.obtain(this, 11, 0, i10, v4Var));
        }
    }

    public void j() {
        if (!c()) {
            sendMessage(Message.obtain(this, 10));
        } else if (!this.f24439a.S()) {
            this.f24439a.P();
            this.f24439a.G0(true);
            v4<?> n10 = this.f24440b.n();
            if (n10 != null) {
                n10.get();
                this.f24439a.f0(n10, 1);
            }
        }
    }

    public void k(v4<?> v4Var) {
        if (!c()) {
            sendMessage(Message.obtain(this, 4, 0, 0, v4Var));
        } else if (this.f24439a.S()) {
            if (!this.f24439a.X()) {
                this.f24439a.P();
                v4Var.get();
                this.f24440b.t(v4Var, true);
                this.f24439a.f0(v4Var, 2);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public void l(v4<?> v4Var, boolean z10) {
        if (!c()) {
            sendMessage(Message.obtain(this, 3, z10 ? 1 : 0, 0, v4Var));
        } else if (this.f24439a.S()) {
            this.f24439a.z0(this.f24440b.n());
            this.f24440b.z(this.f24439a, z10);
            e();
            v4Var.sc();
        }
    }

    public void m(v4<?> v4Var) {
        if (!c()) {
            sendMessage(Message.obtain(this, 7, v4Var));
        } else if (this.f24439a.S()) {
            this.f24439a.z0(v4Var);
            e();
        }
    }

    public void n(v4<?> v4Var) {
        if (c()) {
            v4Var.get();
            this.f24440b.b(this.f24439a);
            this.f24440b.t(v4Var, true);
            this.f24439a.A0();
            this.f24439a.j(v4Var);
            a(v4Var);
            this.f24439a.I().setTitle(v4Var);
            this.f24439a.G0(false);
            return;
        }
        sendMessage(Message.obtain(this, 1, 0, 0, v4Var));
    }

    public void o(v4<?> v4Var, boolean z10, boolean z11) {
        int i10 = z11 ? (z10 ? 1 : 0) + 2 : z10 ? 1 : 0;
        if (!c()) {
            sendMessage(Message.obtain(this, 2, 0, i10, v4Var));
        } else if (this.f24439a.S()) {
            this.f24441c = true;
            this.f24444f = v4Var;
            this.f24442d = 2;
            this.f24443e = i10;
        } else {
            v4Var.get();
            this.f24439a.G0(true);
            this.f24440b.t(v4Var, true);
            this.f24439a.y0(v4Var, z10, z11);
        }
    }

    public void p() {
        if (!c()) {
            sendMessage(Message.obtain(this, 8));
        } else if (this.f24439a.S()) {
            v4<?> n10 = this.f24440b.n();
            if (n10 != null) {
                this.f24439a.z0(n10);
                n10.get().setAlpha(1.0f);
            }
            this.f24439a.I0(8);
            e();
            v4<?> l10 = this.f24440b.l();
            if (l10 != null) {
                l10.sc();
            }
        }
    }

    public void q() {
        if (!c()) {
            sendMessage(Message.obtain(this, 9));
        } else if (this.f24439a.S()) {
            v4<?> x10 = this.f24440b.x();
            if (x10 != null) {
                this.f24439a.z0(x10);
            }
            this.f24439a.I0(8);
            if (x10 != null) {
                x10.N8(this.f24439a);
                x10.Z8();
                x10.e9();
            }
            e();
            v4<?> l10 = this.f24440b.l();
            if (l10 != null) {
                l10.sc();
            }
        }
    }
}
