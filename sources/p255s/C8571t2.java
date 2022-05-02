package p255s;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.C0662u1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p001a0.C0003a;
import p015b0.AbstractC1104a;
import p015b0.C1108d;
import p015b0.C1111f;
import p022b7.AbstractFutureC1291a;
import p158l0.C6287c;
import p279u.C9407g;
import p336y.AbstractC10287q0;

public class C8571t2 extends C8544p2 {
    public final Set<String> f27775p;
    public final AbstractFutureC1291a<Void> f27776q;
    public C6287c.C6288a<Void> f27777r;
    public List<AbstractC10287q0> f27778s;
    public AbstractFutureC1291a<Void> f27779t;
    public AbstractFutureC1291a<List<Surface>> f27780u;
    public boolean f27781v;
    public final Object f27774o = new Object();
    public final CameraCaptureSession.CaptureCallback f27782w = new C8572a();

    public class C8572a extends CameraCaptureSession.CaptureCallback {
        public C8572a() {
        }

        @Override
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            C6287c.C6288a<Void> aVar = C8571t2.this.f27777r;
            if (aVar != null) {
                aVar.m20716d();
                C8571t2.this.f27777r = null;
            }
        }

        @Override
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            C6287c.C6288a<Void> aVar = C8571t2.this.f27777r;
            if (aVar != null) {
                aVar.m20717c(null);
                C8571t2.this.f27777r = null;
            }
        }
    }

    public C8571t2(Set<String> set, C8569t1 t1Var, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(t1Var, executor, scheduledExecutorService, handler);
        this.f27775p = set;
        if (set.contains("wait_for_request")) {
            this.f27776q = C6287c.m20720a(new C6287c.AbstractC6290c() {
                @Override
                public final Object mo5520a(C6287c.C6288a aVar) {
                    Object R;
                    R = C8571t2.this.m12069R(aVar);
                    return R;
                }
            });
        } else {
            this.f27776q = C1111f.m38354h(null);
        }
    }

    public void m12078D() {
        m12073N("Session call super.close()");
        super.close();
    }

    public static void m12072O(Set<AbstractC8508j2> set) {
        for (AbstractC8508j2 j2Var : set) {
            j2Var.mo12191c().mo12034p(j2Var);
        }
    }

    public Object m12069R(C6287c.C6288a aVar) {
        this.f27777r = aVar;
        return "StartStreamingFuture[session=" + this + "]";
    }

    public AbstractFutureC1291a m12068S(CameraDevice cameraDevice, C9407g gVar, List list, List list2) {
        return super.mo12049e(cameraDevice, gVar, list);
    }

    public void m12074M() {
        synchronized (this.f27774o) {
            if (this.f27778s == null) {
                m12073N("deferrableSurface == null, maybe forceClose, skip close");
                return;
            }
            if (this.f27775p.contains("deferrableSurface_close")) {
                for (AbstractC10287q0 q0Var : this.f27778s) {
                    q0Var.m5551c();
                }
                m12073N("deferrableSurface closed");
            }
        }
    }

    public void m12073N(String str) {
        C0662u1.m40656a("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    public final void m12071P(Set<AbstractC8508j2> set) {
        for (AbstractC8508j2 j2Var : set) {
            j2Var.mo12191c().mo12033q(j2Var);
        }
    }

    public final List<AbstractFutureC1291a<Void>> m12070Q(String str, List<AbstractC8508j2> list) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC8508j2 j2Var : list) {
            arrayList.add(j2Var.mo12066n(str));
        }
        return arrayList;
    }

    @Override
    public void close() {
        m12073N("Session call close()");
        if (this.f27775p.contains("wait_for_request")) {
            synchronized (this.f27774o) {
                if (!this.f27781v) {
                    this.f27776q.cancel(true);
                }
            }
        }
        this.f27776q.mo13371a(new Runnable() {
            @Override
            public final void run() {
                C8571t2.this.m12078D();
            }
        }, mo12050b());
    }

    @Override
    public AbstractFutureC1291a<Void> mo12049e(final CameraDevice cameraDevice, final C9407g gVar, final List<AbstractC10287q0> list) {
        AbstractFutureC1291a<Void> j;
        synchronized (this.f27774o) {
            C1108d f = C1108d.m38366b(C1111f.m38348n(m12070Q("wait_for_request", this.f27678b.m12090e()))).m38362f(new AbstractC1104a() {
                @Override
                public final AbstractFutureC1291a apply(Object obj) {
                    AbstractFutureC1291a S;
                    S = C8571t2.this.m12068S(cameraDevice, gVar, list, (List) obj);
                    return S;
                }
            }, C0003a.m42614a());
            this.f27779t = f;
            j = C1111f.m38352j(f);
        }
        return j;
    }

    @Override
    public int mo12067k(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        int k;
        if (!this.f27775p.contains("wait_for_request")) {
            return super.mo12067k(captureRequest, captureCallback);
        }
        synchronized (this.f27774o) {
            this.f27781v = true;
            k = super.mo12067k(captureRequest, C8511k0.m12246b(this.f27782w, captureCallback));
        }
        return k;
    }

    @Override
    public AbstractFutureC1291a<List<Surface>> mo12047m(List<AbstractC10287q0> list, long j) {
        AbstractFutureC1291a<List<Surface>> j2;
        synchronized (this.f27774o) {
            this.f27778s = list;
            j2 = C1111f.m38352j(super.mo12047m(list, j));
        }
        return j2;
    }

    @Override
    public AbstractFutureC1291a<Void> mo12066n(String str) {
        str.hashCode();
        if (!str.equals("wait_for_request")) {
            return super.mo12066n(str);
        }
        return C1111f.m38352j(this.f27776q);
    }

    @Override
    public void mo12034p(AbstractC8508j2 j2Var) {
        m12074M();
        m12073N("onClosed()");
        super.mo12034p(j2Var);
    }

    @Override
    public void mo12032r(AbstractC8508j2 j2Var) {
        AbstractC8508j2 next;
        AbstractC8508j2 next2;
        m12073N("Session onConfigured()");
        if (this.f27775p.contains("force_close")) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<AbstractC8508j2> it = this.f27678b.m12089f().iterator();
            while (it.hasNext() && (next2 = it.next()) != j2Var) {
                linkedHashSet.add(next2);
            }
            m12071P(linkedHashSet);
        }
        super.mo12032r(j2Var);
        if (this.f27775p.contains("force_close")) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator<AbstractC8508j2> it2 = this.f27678b.m12091d().iterator();
            while (it2.hasNext() && (next = it2.next()) != j2Var) {
                linkedHashSet2.add(next);
            }
            m12072O(linkedHashSet2);
        }
    }

    @Override
    public boolean stop() {
        boolean stop;
        synchronized (this.f27774o) {
            if (m12198C()) {
                m12074M();
            } else {
                AbstractFutureC1291a<Void> aVar = this.f27779t;
                if (aVar != null) {
                    aVar.cancel(true);
                }
                AbstractFutureC1291a<List<Surface>> aVar2 = this.f27780u;
                if (aVar2 != null) {
                    aVar2.cancel(true);
                }
            }
            stop = super.stop();
        }
        return stop;
    }
}
