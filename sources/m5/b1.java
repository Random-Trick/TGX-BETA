package m5;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import j5.a;
import m5.c;
import y5.h;

public final class b1 extends h {
    public final c f17146a;

    public b1(c cVar, Looper looper) {
        super(looper);
        this.f17146a = cVar;
    }

    public static final void a(Message message) {
        c1 c1Var = (c1) message.obj;
        c1Var.a();
        c1Var.d();
    }

    public static final boolean b(Message message) {
        int i10 = message.what;
        return i10 == 2 || i10 == 1 || i10 == 7;
    }

    @Override
    public final void handleMessage(Message message) {
        c.a aVar;
        c.a aVar2;
        a aVar3;
        a aVar4;
        boolean z10;
        if (this.f17146a.f17163l0.get() == message.arg1) {
            int i10 = message.what;
            if ((i10 == 1 || i10 == 7 || ((i10 == 4 && !this.f17146a.x()) || message.what == 5)) && !this.f17146a.h()) {
                a(message);
                return;
            }
            int i11 = message.what;
            PendingIntent pendingIntent = null;
            if (i11 == 4) {
                this.f17146a.f17160i0 = new a(message.arg2);
                if (c.b0(this.f17146a)) {
                    z10 = this.f17146a.f17161j0;
                    if (!z10) {
                        this.f17146a.k0(3, null);
                        return;
                    }
                }
                aVar4 = this.f17146a.f17160i0;
                a aVar5 = aVar4 != null ? this.f17146a.f17160i0 : new a(8);
                this.f17146a.Y.c(aVar5);
                this.f17146a.O(aVar5);
            } else if (i11 == 5) {
                aVar3 = this.f17146a.f17160i0;
                a aVar6 = aVar3 != null ? this.f17146a.f17160i0 : new a(8);
                this.f17146a.Y.c(aVar6);
                this.f17146a.O(aVar6);
            } else if (i11 == 3) {
                Object obj = message.obj;
                if (obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) obj;
                }
                a aVar7 = new a(message.arg2, pendingIntent);
                this.f17146a.Y.c(aVar7);
                this.f17146a.O(aVar7);
            } else if (i11 == 6) {
                this.f17146a.k0(5, null);
                aVar = this.f17146a.f17155d0;
                if (aVar != null) {
                    aVar2 = this.f17146a.f17155d0;
                    aVar2.q(message.arg2);
                }
                this.f17146a.P(message.arg2);
                c.g0(this.f17146a, 5, 1, null);
            } else if (i11 == 2 && !this.f17146a.a()) {
                a(message);
            } else if (b(message)) {
                ((c1) message.obj).c();
            } else {
                int i12 = message.what;
                StringBuilder sb2 = new StringBuilder(45);
                sb2.append("Don't know how to handle message: ");
                sb2.append(i12);
                Log.wtf("GmsClient", sb2.toString(), new Exception());
            }
        } else if (b(message)) {
            a(message);
        }
    }
}
