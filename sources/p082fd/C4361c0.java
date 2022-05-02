package p082fd;

import android.os.Handler;
import android.os.Message;
import gd.C4812v2;
import p082fd.C4356b0;

public class C4361c0 extends C4384m {
    public C4361c0() {
        super("MediaThread");
    }

    @Override
    public void mo3052f(Message message) {
        int i = message.what;
        boolean z = false;
        if (i == 100 || i == 101) {
            C4356b0 k = C4356b0.m28201k();
            int i2 = message.arg1;
            long j = (i2 == 0 && message.arg2 == 0) ? 0L : (i2 << 32) | (message.arg2 & 4294967295L);
            C4356b0.AbstractC4359c cVar = (C4356b0.AbstractC4359c) message.obj;
            if (message.what == 101) {
                z = true;
            }
            k.m28205g(j, cVar, z);
            return;
        }
        switch (i) {
            case 1:
                C4356b0.m28201k().m28196p((C4812v2) message.obj);
                return;
            case 2:
                C4356b0.m28201k().m28197o((C4812v2) message.obj);
                return;
            case 3:
                C4356b0.m28201k().m28193s((C4812v2) message.obj, Float.intBitsToFloat(message.arg1));
                return;
            case 4:
                C4356b0.m28201k().m28191u();
                return;
            case 5:
                C4356b0.m28201k().m28190v();
                return;
            case 6:
                C4356b0 k2 = C4356b0.m28201k();
                C4812v2 v2Var = (C4812v2) message.obj;
                if (message.arg1 == 1) {
                    z = true;
                }
                k2.m28192t(v2Var, z);
                return;
            case 7:
                C4356b0 k3 = C4356b0.m28201k();
                if (message.arg1 == 1) {
                    z = true;
                }
                k3.m28210b(z);
                return;
            default:
                return;
        }
    }

    public void m28162i(boolean z) {
        m28050h(Message.obtain(m28053d(), 7, z ? 1 : 0, 0), 0L);
    }

    public void m28161j(long j, C4356b0.AbstractC4359c cVar, boolean z) {
        int i = 101;
        if (j == 0) {
            Handler d = m28053d();
            if (!z) {
                i = 100;
            }
            m28050h(Message.obtain(d, i, 0, 0, cVar), 0L);
            return;
        }
        Handler d2 = m28053d();
        if (!z) {
            i = 100;
        }
        m28050h(Message.obtain(d2, i, (int) (j >> 32), (int) j, cVar), 0L);
    }

    public void m28160k(C4812v2 v2Var) {
        m28050h(Message.obtain(m28053d(), 2, v2Var), 0L);
    }

    public void m28159l(C4812v2 v2Var) {
        m28050h(Message.obtain(m28053d(), 1, v2Var), 0L);
    }

    public void m28158m(C4812v2 v2Var, float f) {
        m28050h(Message.obtain(m28053d(), 3, Float.floatToIntBits(f), 0, v2Var), 0L);
    }

    public void m28157n(C4812v2 v2Var, boolean z) {
        m28050h(Message.obtain(m28053d(), 6, z ? 1 : 0, 0, v2Var), 0L);
    }

    public void m28156o() {
        m28050h(Message.obtain(m28053d(), 4), 0L);
    }

    public void m28155p() {
        m28050h(Message.obtain(m28053d(), 5), 0L);
    }
}
