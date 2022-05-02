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
    public final Set<String> f27772p;
    public final AbstractFutureC1291a<Void> f27773q;
    public C6287c.C6288a<Void> f27774r;
    public List<AbstractC10287q0> f27775s;
    public AbstractFutureC1291a<Void> f27776t;
    public AbstractFutureC1291a<List<Surface>> f27777u;
    public boolean f27778v;
    public final Object f27771o = new Object();
    public final CameraCaptureSession.CaptureCallback f27779w = new C8572a();

    public class C8572a extends CameraCaptureSession.CaptureCallback {
        public C8572a() {
        }

        @Override
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            C6287c.C6288a<Void> aVar = C8571t2.this.f27774r;
            if (aVar != null) {
                aVar.m20715d();
                C8571t2.this.f27774r = null;
            }
        }

        @Override
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            C6287c.C6288a<Void> aVar = C8571t2.this.f27774r;
            if (aVar != null) {
                aVar.m20716c(null);
                C8571t2.this.f27774r = null;
            }
        }
    }

    public C8571t2(Set<String> set, C8569t1 t1Var, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(t1Var, executor, scheduledExecutorService, handler);
        this.f27772p = set;
        if (set.contains("wait_for_request")) {
            this.f27773q = C6287c.m20719a(new C6287c.AbstractC6290c() {
                @Override
                public final Object mo5520a(C6287c.C6288a aVar) {
                    Object R;
                    R = C8571t2.this.m12070R(aVar);
                    return R;
                }
            });
        } else {
            this.f27773q = C1111f.m38351h(null);
        }
    }

    public void m12079D() {
        m12074N("Session call super.close()");
        super.close();
    }

    public static void m12073O(Set<AbstractC8508j2> set) {
        for (AbstractC8508j2 j2Var : set) {
            j2Var.mo12192c().mo12035p(j2Var);
        }
    }

    public Object m12070R(C6287c.C6288a aVar) {
        this.f27774r = aVar;
        return "StartStreamingFuture[session=" + this + "]";
    }

    public AbstractFutureC1291a m12069S(CameraDevice cameraDevice, C9407g gVar, List list, List list2) {
        return super.mo12050e(cameraDevice, gVar, list);
    }

    public void m12075M() {
        synchronized (this.f27771o) {
            if (this.f27775s == null) {
                m12074N("deferrableSurface == null, maybe forceClose, skip close");
                return;
            }
            if (this.f27772p.contains("deferrableSurface_close")) {
                for (AbstractC10287q0 q0Var : this.f27775s) {
                    q0Var.m5551c();
                }
                m12074N("deferrableSurface closed");
            }
        }
    }

    public void m12074N(String str) {
        C0662u1.m40653a("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    public final void m12072P(Set<AbstractC8508j2> set) {
        for (AbstractC8508j2 j2Var : set) {
            j2Var.mo12192c().mo12034q(j2Var);
        }
    }

    public final List<AbstractFutureC1291a<Void>> m12071Q(String str, List<AbstractC8508j2> list) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC8508j2 j2Var : list) {
            arrayList.add(j2Var.mo12067n(str));
        }
        return arrayList;
    }

    @Override
    public void close() {
        m12074N("Session call close()");
        if (this.f27772p.contains("wait_for_request")) {
            synchronized (this.f27771o) {
                if (!this.f27778v) {
                    this.f27773q.cancel(true);
                }
            }
        }
        this.f27773q.mo13372a(new Runnable() {
            @Override
            public final void run() {
                C8571t2.this.m12079D();
            }
        }, mo12051b());
    }

    @Override
    public AbstractFutureC1291a<Void> mo12050e(final CameraDevice cameraDevice, final C9407g gVar, final List<AbstractC10287q0> list) {
        AbstractFutureC1291a<Void> j;
        synchronized (this.f27771o) {
            C1108d f = C1108d.m38363b(C1111f.m38345n(m12071Q("wait_for_request", this.f27675b.m12091e()))).m38359f(new AbstractC1104a() {
                @Override
                public final AbstractFutureC1291a apply(Object obj) {
                    AbstractFutureC1291a S;
                    S = C8571t2.this.m12069S(cameraDevice, gVar, list, (List) obj);
                    return S;
                }
            }, C0003a.m42611a());
            this.f27776t = f;
            j = C1111f.m38349j(f);
        }
        return j;
    }

    @Override
    public int mo12068k(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        int k;
        if (!this.f27772p.contains("wait_for_request")) {
            return super.mo12068k(captureRequest, captureCallback);
        }
        synchronized (this.f27771o) {
            this.f27778v = true;
            k = super.mo12068k(captureRequest, C8511k0.m12247b(this.f27779w, captureCallback));
        }
        return k;
    }

    @Override
    public AbstractFutureC1291a<List<Surface>> mo12048m(List<AbstractC10287q0> list, long j) {
        AbstractFutureC1291a<List<Surface>> j2;
        synchronized (this.f27771o) {
            this.f27775s = list;
            j2 = C1111f.m38349j(super.mo12048m(list, j));
        }
        return j2;
    }

    @Override
    public AbstractFutureC1291a<Void> mo12067n(String str) {
        str.hashCode();
        if (!str.equals("wait_for_request")) {
            return super.mo12067n(str);
        }
        return C1111f.m38349j(this.f27773q);
    }

    @Override
    public void mo12035p(AbstractC8508j2 j2Var) {
        m12075M();
        m12074N("onClosed()");
        super.mo12035p(j2Var);
    }

    @Override
    public void mo12033r(AbstractC8508j2 j2Var) {
        AbstractC8508j2 next;
        AbstractC8508j2 next2;
        m12074N("Session onConfigured()");
        if (this.f27772p.contains("force_close")) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<AbstractC8508j2> it = this.f27675b.m12090f().iterator();
            while (it.hasNext() && (next2 = it.next()) != j2Var) {
                linkedHashSet.add(next2);
            }
            m12072P(linkedHashSet);
        }
        super.mo12033r(j2Var);
        if (this.f27772p.contains("force_close")) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator<AbstractC8508j2> it2 = this.f27675b.m12092d().iterator();
            while (it2.hasNext() && (next = it2.next()) != j2Var) {
                linkedHashSet2.add(next);
            }
            m12073O(linkedHashSet2);
        }
    }

    @Override
    public boolean stop() {
        boolean stop;
        synchronized (this.f27771o) {
            if (m12199C()) {
                m12075M();
            } else {
                AbstractFutureC1291a<Void> aVar = this.f27776t;
                if (aVar != null) {
                    aVar.cancel(true);
                }
                AbstractFutureC1291a<List<Surface>> aVar2 = this.f27777u;
                if (aVar2 != null) {
                    aVar2.cancel(true);
                }
            }
            stop = super.stop();
        }
        return stop;
    }
}
