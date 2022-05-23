package gd;

import android.os.Handler;
import android.os.Message;
import gd.b0;
import hd.v2;

public class c0 extends m {
    public c0() {
        super("MediaThread");
    }

    @Override
    public void f(Message message) {
        int i10 = message.what;
        boolean z10 = false;
        if (i10 == 100 || i10 == 101) {
            b0 k10 = b0.k();
            int i11 = message.arg1;
            long j10 = (i11 == 0 && message.arg2 == 0) ? 0L : (i11 << 32) | (message.arg2 & 4294967295L);
            b0.c cVar = (b0.c) message.obj;
            if (message.what == 101) {
                z10 = true;
            }
            k10.g(j10, cVar, z10);
            return;
        }
        switch (i10) {
            case 1:
                b0.k().p((v2) message.obj);
                return;
            case 2:
                b0.k().o((v2) message.obj);
                return;
            case 3:
                b0.k().s((v2) message.obj, Float.intBitsToFloat(message.arg1));
                return;
            case 4:
                b0.k().u();
                return;
            case 5:
                b0.k().v();
                return;
            case 6:
                b0 k11 = b0.k();
                v2 v2Var = (v2) message.obj;
                if (message.arg1 == 1) {
                    z10 = true;
                }
                k11.t(v2Var, z10);
                return;
            case 7:
                b0 k12 = b0.k();
                if (message.arg1 == 1) {
                    z10 = true;
                }
                k12.b(z10);
                return;
            default:
                return;
        }
    }

    public void i(boolean z10) {
        h(Message.obtain(d(), 7, z10 ? 1 : 0, 0), 0L);
    }

    public void j(long j10, b0.c cVar, boolean z10) {
        int i10 = 101;
        if (j10 == 0) {
            Handler d10 = d();
            if (!z10) {
                i10 = 100;
            }
            h(Message.obtain(d10, i10, 0, 0, cVar), 0L);
            return;
        }
        Handler d11 = d();
        if (!z10) {
            i10 = 100;
        }
        h(Message.obtain(d11, i10, (int) (j10 >> 32), (int) j10, cVar), 0L);
    }

    public void k(v2 v2Var) {
        h(Message.obtain(d(), 2, v2Var), 0L);
    }

    public void l(v2 v2Var) {
        h(Message.obtain(d(), 1, v2Var), 0L);
    }

    public void m(v2 v2Var, float f10) {
        h(Message.obtain(d(), 3, Float.floatToIntBits(f10), 0, v2Var), 0L);
    }

    public void n(v2 v2Var, boolean z10) {
        h(Message.obtain(d(), 6, z10 ? 1 : 0, 0, v2Var), 0L);
    }

    public void o() {
        h(Message.obtain(d(), 4), 0L);
    }

    public void p() {
        h(Message.obtain(d(), 5), 0L);
    }
}
