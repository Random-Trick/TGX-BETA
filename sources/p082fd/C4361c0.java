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
            C4356b0 k = C4356b0.m28203k();
            int i2 = message.arg1;
            long j = (i2 == 0 && message.arg2 == 0) ? 0L : (i2 << 32) | (message.arg2 & 4294967295L);
            C4356b0.AbstractC4359c cVar = (C4356b0.AbstractC4359c) message.obj;
            if (message.what == 101) {
                z = true;
            }
            k.m28207g(j, cVar, z);
            return;
        }
        switch (i) {
            case 1:
                C4356b0.m28203k().m28198p((C4812v2) message.obj);
                return;
            case 2:
                C4356b0.m28203k().m28199o((C4812v2) message.obj);
                return;
            case 3:
                C4356b0.m28203k().m28195s((C4812v2) message.obj, Float.intBitsToFloat(message.arg1));
                return;
            case 4:
                C4356b0.m28203k().m28193u();
                return;
            case 5:
                C4356b0.m28203k().m28192v();
                return;
            case 6:
                C4356b0 k2 = C4356b0.m28203k();
                C4812v2 v2Var = (C4812v2) message.obj;
                if (message.arg1 == 1) {
                    z = true;
                }
                k2.m28194t(v2Var, z);
                return;
            case 7:
                C4356b0 k3 = C4356b0.m28203k();
                if (message.arg1 == 1) {
                    z = true;
                }
                k3.m28212b(z);
                return;
            default:
                return;
        }
    }

    public void m28164i(boolean z) {
        m28052h(Message.obtain(m28055d(), 7, z ? 1 : 0, 0), 0L);
    }

    public void m28163j(long j, C4356b0.AbstractC4359c cVar, boolean z) {
        int i = 101;
        if (j == 0) {
            Handler d = m28055d();
            if (!z) {
                i = 100;
            }
            m28052h(Message.obtain(d, i, 0, 0, cVar), 0L);
            return;
        }
        Handler d2 = m28055d();
        if (!z) {
            i = 100;
        }
        m28052h(Message.obtain(d2, i, (int) (j >> 32), (int) j, cVar), 0L);
    }

    public void m28162k(C4812v2 v2Var) {
        m28052h(Message.obtain(m28055d(), 2, v2Var), 0L);
    }

    public void m28161l(C4812v2 v2Var) {
        m28052h(Message.obtain(m28055d(), 1, v2Var), 0L);
    }

    public void m28160m(C4812v2 v2Var, float f) {
        m28052h(Message.obtain(m28055d(), 3, Float.floatToIntBits(f), 0, v2Var), 0L);
    }

    public void m28159n(C4812v2 v2Var, boolean z) {
        m28052h(Message.obtain(m28055d(), 6, z ? 1 : 0, 0, v2Var), 0L);
    }

    public void m28158o() {
        m28052h(Message.obtain(m28055d(), 4), 0L);
    }

    public void m28157p() {
        m28052h(Message.obtain(m28055d(), 5), 0L);
    }
}
