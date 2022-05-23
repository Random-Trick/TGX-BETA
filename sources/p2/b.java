package p2;

import android.text.TextUtils;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import f2.j;
import f2.m;
import g2.c;
import g2.e;
import g2.f;
import g2.g;
import g2.i;
import java.util.List;
import o2.p;

public class b implements Runnable {
    public static final String f20407c = j.f("EnqueueRunnable");
    public final g f20408a;
    public final c f20409b = new c();

    public b(g gVar) {
        this.f20408a = gVar;
    }

    public static boolean b(g gVar) {
        boolean c10 = c(gVar.g(), gVar.f(), (String[]) g.l(gVar).toArray(new String[0]), gVar.d(), gVar.b());
        gVar.k();
        return c10;
    }

    public static boolean c(g2.i r19, java.util.List<? extends f2.u> r20, java.lang.String[] r21, java.lang.String r22, f2.d r23) {
        throw new UnsupportedOperationException("Method not decompiled: p2.b.c(g2.i, java.util.List, java.lang.String[], java.lang.String, f2.d):boolean");
    }

    public static boolean e(g gVar) {
        List<g> e10 = gVar.e();
        boolean z10 = false;
        if (e10 != null) {
            boolean z11 = false;
            for (g gVar2 : e10) {
                if (!gVar2.j()) {
                    z11 |= e(gVar2);
                } else {
                    j.c().h(f20407c, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", gVar2.c())), new Throwable[0]);
                }
            }
            z10 = z11;
        }
        return b(gVar) | z10;
    }

    public static void g(p pVar) {
        f2.b bVar = pVar.f18599j;
        String str = pVar.f18592c;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (bVar.f() || bVar.i()) {
            b.a aVar = new b.a();
            aVar.c(pVar.f18594e).g("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            pVar.f18592c = ConstraintTrackingWorker.class.getName();
            pVar.f18594e = aVar.a();
        }
    }

    public static boolean h(i iVar, String str) {
        try {
            Class<?> cls = Class.forName(str);
            for (e eVar : iVar.r()) {
                if (cls.isAssignableFrom(eVar.getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    public boolean a() {
        WorkDatabase s10 = this.f20408a.g().s();
        s10.c();
        try {
            boolean e10 = e(this.f20408a);
            s10.t();
            return e10;
        } finally {
            s10.g();
        }
    }

    public m d() {
        return this.f20409b;
    }

    public void f() {
        i g10 = this.f20408a.g();
        f.b(g10.m(), g10.s(), g10.r());
    }

    @Override
    public void run() {
        try {
            if (!this.f20408a.h()) {
                if (a()) {
                    e.a(this.f20408a.g().l(), RescheduleReceiver.class, true);
                    f();
                }
                this.f20409b.a(m.f11823a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f20408a));
        } catch (Throwable th) {
            this.f20409b.a(new m.b.a(th));
        }
    }
}
