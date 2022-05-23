package zd;

import jb.g;
import k0.e;
import org.drinkless.td.libcore.telegram.TdApi;

public class vb {
    public final o6 f28573a;
    public final e<g> f28574b = new e<>();

    public vb(o6 o6Var) {
        this.f28573a = o6Var;
    }

    public void d(long j10, long j11) {
        synchronized (this) {
            g f10 = this.f28574b.f(j10);
            if (f10 != null) {
                f10.c(j11);
                if (f10.i() == 0) {
                    this.f28574b.l(j10);
                }
            }
        }
    }

    public int b(long j10, long j11) {
        int i10;
        synchronized (this) {
            g f10 = this.f28574b.f(j10);
            i10 = 0;
            if (f10 != null) {
                i10 = f10.e(j11, 0);
            }
        }
        return i10;
    }

    public boolean c(long j10, long j11) {
        return b(j10, j11) > 0;
    }

    public void e(TdApi.UpdateMessageSendAcknowledged updateMessageSendAcknowledged) {
        boolean z10;
        synchronized (this) {
            g f10 = this.f28574b.f(updateMessageSendAcknowledged.chatId);
            z10 = true;
            if (f10 != null) {
                int d10 = f10.d(updateMessageSendAcknowledged.messageId);
                f10.g(updateMessageSendAcknowledged.messageId, d10 + 1);
                if (d10 != 0) {
                    z10 = false;
                }
            } else {
                g gVar = new g(4);
                gVar.g(updateMessageSendAcknowledged.messageId, 1);
                this.f28574b.k(updateMessageSendAcknowledged.chatId, gVar);
            }
        }
        if (z10) {
            this.f28573a.ta(updateMessageSendAcknowledged);
        }
    }

    public void f(long j10, long j11) {
        h(j10, j11);
    }

    public void g(long j10, long j11) {
        h(j10, j11);
    }

    public void h(final long j10, final long j11) {
        this.f28573a.hd().postDelayed(new Runnable() {
            @Override
            public final void run() {
                vb.this.d(j10, j11);
            }
        }, 200L);
    }
}
