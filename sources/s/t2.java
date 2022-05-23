package s;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.t1;
import b0.d;
import b0.f;
import c7.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import l0.c;
import u.g;
import y.q0;

public class t2 extends p2 {
    public final Set<String> f22288p;
    public final c7.a<Void> f22289q;
    public c.a<Void> f22290r;
    public List<q0> f22291s;
    public c7.a<Void> f22292t;
    public c7.a<List<Surface>> f22293u;
    public boolean f22294v;
    public final Object f22287o = new Object();
    public final CameraCaptureSession.CaptureCallback f22295w = new a();

    public class a extends CameraCaptureSession.CaptureCallback {
        public a() {
        }

        @Override
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i10) {
            c.a<Void> aVar = t2.this.f22290r;
            if (aVar != null) {
                aVar.d();
                t2.this.f22290r = null;
            }
        }

        @Override
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
            c.a<Void> aVar = t2.this.f22290r;
            if (aVar != null) {
                aVar.c(null);
                t2.this.f22290r = null;
            }
        }
    }

    public t2(Set<String> set, t1 t1Var, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(t1Var, executor, scheduledExecutorService, handler);
        this.f22288p = set;
        if (set.contains("wait_for_request")) {
            this.f22289q = c.a(new c.AbstractC0147c() {
                @Override
                public final Object a(c.a aVar) {
                    Object R;
                    R = t2.this.R(aVar);
                    return R;
                }
            });
        } else {
            this.f22289q = f.h(null);
        }
    }

    public void D() {
        N("Session call super.close()");
        super.close();
    }

    public static void O(Set<j2> set) {
        for (j2 j2Var : set) {
            j2Var.c().p(j2Var);
        }
    }

    public Object R(c.a aVar) {
        this.f22290r = aVar;
        return "StartStreamingFuture[session=" + this + "]";
    }

    public c7.a S(CameraDevice cameraDevice, g gVar, List list, List list2) {
        return super.e(cameraDevice, gVar, list);
    }

    public void M() {
        synchronized (this.f22287o) {
            if (this.f22291s == null) {
                N("deferrableSurface == null, maybe forceClose, skip close");
                return;
            }
            if (this.f22288p.contains("deferrableSurface_close")) {
                for (q0 q0Var : this.f22291s) {
                    q0Var.c();
                }
                N("deferrableSurface closed");
            }
        }
    }

    public void N(String str) {
        t1.a("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    public final void P(Set<j2> set) {
        for (j2 j2Var : set) {
            j2Var.c().q(j2Var);
        }
    }

    public final List<c7.a<Void>> Q(String str, List<j2> list) {
        ArrayList arrayList = new ArrayList();
        for (j2 j2Var : list) {
            arrayList.add(j2Var.n(str));
        }
        return arrayList;
    }

    @Override
    public void close() {
        N("Session call close()");
        if (this.f22288p.contains("wait_for_request")) {
            synchronized (this.f22287o) {
                if (!this.f22294v) {
                    this.f22289q.cancel(true);
                }
            }
        }
        this.f22289q.a(new Runnable() {
            @Override
            public final void run() {
                t2.this.D();
            }
        }, b());
    }

    @Override
    public c7.a<Void> e(final CameraDevice cameraDevice, final g gVar, final List<q0> list) {
        c7.a<Void> j10;
        synchronized (this.f22287o) {
            d f10 = d.b(f.n(Q("wait_for_request", this.f22197b.e()))).f(new b0.a() {
                @Override
                public final a apply(Object obj) {
                    a S;
                    S = t2.this.S(cameraDevice, gVar, list, (List) obj);
                    return S;
                }
            }, a0.a.a());
            this.f22292t = f10;
            j10 = f.j(f10);
        }
        return j10;
    }

    @Override
    public int k(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        int k10;
        if (!this.f22288p.contains("wait_for_request")) {
            return super.k(captureRequest, captureCallback);
        }
        synchronized (this.f22287o) {
            this.f22294v = true;
            k10 = super.k(captureRequest, k0.b(this.f22295w, captureCallback));
        }
        return k10;
    }

    @Override
    public c7.a<List<Surface>> m(List<q0> list, long j10) {
        c7.a<List<Surface>> j11;
        synchronized (this.f22287o) {
            this.f22291s = list;
            j11 = f.j(super.m(list, j10));
        }
        return j11;
    }

    @Override
    public c7.a<Void> n(String str) {
        str.hashCode();
        if (!str.equals("wait_for_request")) {
            return super.n(str);
        }
        return f.j(this.f22289q);
    }

    @Override
    public void p(j2 j2Var) {
        M();
        N("onClosed()");
        super.p(j2Var);
    }

    @Override
    public void r(j2 j2Var) {
        j2 next;
        j2 next2;
        N("Session onConfigured()");
        if (this.f22288p.contains("force_close")) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<j2> it = this.f22197b.f().iterator();
            while (it.hasNext() && (next2 = it.next()) != j2Var) {
                linkedHashSet.add(next2);
            }
            P(linkedHashSet);
        }
        super.r(j2Var);
        if (this.f22288p.contains("force_close")) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator<j2> it2 = this.f22197b.d().iterator();
            while (it2.hasNext() && (next = it2.next()) != j2Var) {
                linkedHashSet2.add(next);
            }
            O(linkedHashSet2);
        }
    }

    @Override
    public boolean stop() {
        boolean stop;
        synchronized (this.f22287o) {
            if (C()) {
                M();
            } else {
                c7.a<Void> aVar = this.f22292t;
                if (aVar != null) {
                    aVar.cancel(true);
                }
                c7.a<List<Surface>> aVar2 = this.f22293u;
                if (aVar2 != null) {
                    aVar2.cancel(true);
                }
            }
            stop = super.stop();
        }
        return stop;
    }
}
