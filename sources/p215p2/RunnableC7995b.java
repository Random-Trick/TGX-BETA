package p215p2;

import android.text.TextUtils;
import androidx.work.C1070b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.List;
import p071f2.AbstractC4234j;
import p071f2.AbstractC4239m;
import p071f2.C4223b;
import p087g2.AbstractC4454e;
import p087g2.C4451c;
import p087g2.C4455f;
import p087g2.C4456g;
import p087g2.C4458i;
import p198o2.C7554p;

public class RunnableC7995b implements Runnable {
    public static final String f26039c = AbstractC4234j.m28360f("EnqueueRunnable");
    public final C4456g f26040a;
    public final C4451c f26041b = new C4451c();

    public RunnableC7995b(C4456g gVar) {
        this.f26040a = gVar;
    }

    public static boolean m13817b(C4456g gVar) {
        boolean c = m13816c(gVar.m27616g(), gVar.m27617f(), (String[]) C4456g.m27611l(gVar).toArray(new String[0]), gVar.m27619d(), gVar.m27621b());
        gVar.m27612k();
        return c;
    }

    public static boolean m13816c(p087g2.C4458i r19, java.util.List<? extends p071f2.AbstractC4253u> r20, java.lang.String[] r21, java.lang.String r22, p071f2.EnumC4227d r23) {
        throw new UnsupportedOperationException("Method not decompiled: p215p2.RunnableC7995b.m13816c(g2.i, java.util.List, java.lang.String[], java.lang.String, f2.d):boolean");
    }

    public static boolean m13814e(C4456g gVar) {
        List<C4456g> e = gVar.m27618e();
        boolean z = false;
        if (e != null) {
            boolean z2 = false;
            for (C4456g gVar2 : e) {
                if (!gVar2.m27613j()) {
                    z2 |= m13814e(gVar2);
                } else {
                    AbstractC4234j.m28362c().mo28355h(f26039c, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", gVar2.m27620c())), new Throwable[0]);
                }
            }
            z = z2;
        }
        return m13817b(gVar) | z;
    }

    public static void m13812g(C7554p pVar) {
        C4223b bVar = pVar.f24149j;
        String str = pVar.f24142c;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (bVar.m28390f() || bVar.m28387i()) {
            C1070b.C1071a aVar = new C1070b.C1071a();
            aVar.m38466c(pVar.f24144e).m38462g("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            pVar.f24142c = ConstraintTrackingWorker.class.getName();
            pVar.f24144e = aVar.m38468a();
        }
    }

    public static boolean m13811h(C4458i iVar, String str) {
        try {
            Class<?> cls = Class.forName(str);
            for (AbstractC4454e eVar : iVar.m27588r()) {
                if (cls.isAssignableFrom(eVar.getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    public boolean m13818a() {
        WorkDatabase s = this.f26040a.m27616g().m27587s();
        s.m8731c();
        try {
            boolean e = m13814e(this.f26040a);
            s.m8714t();
            return e;
        } finally {
            s.m8727g();
        }
    }

    public AbstractC4239m m13815d() {
        return this.f26041b;
    }

    public void m13813f() {
        C4458i g = this.f26040a.m27616g();
        C4455f.m27624b(g.m27593m(), g.m27587s(), g.m27588r());
    }

    @Override
    public void run() {
        try {
            if (!this.f26040a.m27615h()) {
                if (m13818a()) {
                    C8000e.m13804a(this.f26040a.m27616g().m27594l(), RescheduleReceiver.class, true);
                    m13813f();
                }
                this.f26041b.m27638a(AbstractC4239m.f14285a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f26040a));
        } catch (Throwable th) {
            this.f26041b.m27638a(new AbstractC4239m.AbstractC4241b.C4242a(th));
        }
    }
}
