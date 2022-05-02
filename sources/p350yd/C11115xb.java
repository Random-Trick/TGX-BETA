package p350yd;

import org.drinkless.p210td.libcore.telegram.TdApi;
import p124ib.C5324g;
import p143k0.C6035e;

public class C11115xb {
    public final C10930q6 f35650a;
    public final C6035e<C5324g> f35651b = new C6035e<>();

    public C11115xb(C10930q6 q6Var) {
        this.f35650a = q6Var;
    }

    public void m1518d(long j, long j2) {
        synchronized (this) {
            C5324g f = this.f35651b.m21505f(j);
            if (f != null) {
                f.m23256c(j2);
                if (f.m23250i() == 0) {
                    this.f35651b.m21499l(j);
                }
            }
        }
    }

    public int m1520b(long j, long j2) {
        int i;
        synchronized (this) {
            C5324g f = this.f35651b.m21505f(j);
            i = 0;
            if (f != null) {
                i = f.m23254e(j2, 0);
            }
        }
        return i;
    }

    public boolean m1519c(long j, long j2) {
        return m1520b(j, j2) > 0;
    }

    public void m1517e(TdApi.UpdateMessageSendAcknowledged updateMessageSendAcknowledged) {
        boolean z;
        synchronized (this) {
            C5324g f = this.f35651b.m21505f(updateMessageSendAcknowledged.chatId);
            z = true;
            if (f != null) {
                int d = f.m23255d(updateMessageSendAcknowledged.messageId);
                f.m23252g(updateMessageSendAcknowledged.messageId, d + 1);
                if (d != 0) {
                    z = false;
                }
            } else {
                C5324g gVar = new C5324g(4);
                gVar.m23252g(updateMessageSendAcknowledged.messageId, 1);
                this.f35651b.m21500k(updateMessageSendAcknowledged.chatId, gVar);
            }
        }
        if (z) {
            this.f35650a.m2296pa(updateMessageSendAcknowledged);
        }
    }

    public void m1516f(long j, long j2) {
        m1514h(j, j2);
    }

    public void m1515g(long j, long j2) {
        m1514h(j, j2);
    }

    public void m1514h(final long j, final long j2) {
        this.f35650a.m2485dd().postDelayed(new Runnable() {
            @Override
            public final void run() {
                C11115xb.this.m1518d(j, j2);
            }
        }, 200L);
    }
}
