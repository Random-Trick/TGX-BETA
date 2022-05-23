package s;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import b0.f;
import b1.h;
import c7.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import l0.c;
import s.e1;
import s.j2;
import s.v2;
import u.g;
import w.l;
import y.b2;
import y.j0;
import y.n0;
import y.p1;
import y.q0;
import y.t1;

public final class q1 implements r1 {
    public u2 f22219e;
    public j2 f22220f;
    public b2 f22221g;
    public d f22226l;
    public c7.a<Void> f22227m;
    public c.a<Void> f22228n;
    public final Object f22215a = new Object();
    public final List<j0> f22216b = new ArrayList();
    public final CameraCaptureSession.CaptureCallback f22217c = new a();
    public n0 f22222h = t1.G();
    public r.c f22223i = r.c.e();
    public final Map<q0, Surface> f22224j = new HashMap();
    public List<q0> f22225k = Collections.emptyList();
    public final l f22229o = new l();
    public final e f22218d = new e();

    public class a extends CameraCaptureSession.CaptureCallback {
        public a() {
        }

        @Override
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        }
    }

    public class b implements b0.c<Void> {
        public b() {
        }

        @Override
        public void b(Throwable th) {
            synchronized (q1.this.f22215a) {
                q1.this.f22219e.e();
                int i10 = c.f22232a[q1.this.f22226l.ordinal()];
                if ((i10 == 4 || i10 == 6 || i10 == 7) && !(th instanceof CancellationException)) {
                    androidx.camera.core.t1.l("CaptureSession", "Opening session with fail " + q1.this.f22226l, th);
                    q1.this.l();
                }
            }
        }

        public void a(Void r12) {
        }
    }

    public static class c {
        public static final int[] f22232a;

        static {
            int[] iArr = new int[d.values().length];
            f22232a = iArr;
            try {
                iArr[d.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22232a[d.INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22232a[d.GET_SURFACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22232a[d.OPENING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22232a[d.OPENED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22232a[d.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22232a[d.RELEASING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22232a[d.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public enum d {
        UNINITIALIZED,
        INITIALIZED,
        GET_SURFACE,
        OPENING,
        OPENED,
        CLOSED,
        RELEASING,
        RELEASED
    }

    public final class e extends j2.a {
        public e() {
        }

        @Override
        public void q(j2 j2Var) {
            synchronized (q1.this.f22215a) {
                switch (c.f22232a[q1.this.f22226l.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                        throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + q1.this.f22226l);
                    case 4:
                    case 6:
                    case 7:
                        q1.this.l();
                        break;
                    case 8:
                        androidx.camera.core.t1.a("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                        break;
                }
                androidx.camera.core.t1.c("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + q1.this.f22226l);
            }
        }

        @Override
        public void r(j2 j2Var) {
            synchronized (q1.this.f22215a) {
                switch (c.f22232a[q1.this.f22226l.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                    case 8:
                        throw new IllegalStateException("onConfigured() should not be possible in state: " + q1.this.f22226l);
                    case 4:
                        q1 q1Var = q1.this;
                        q1Var.f22226l = d.OPENED;
                        q1Var.f22220f = j2Var;
                        if (q1Var.f22221g != null) {
                            List<j0> b10 = q1Var.f22223i.d().b();
                            if (!b10.isEmpty()) {
                                q1 q1Var2 = q1.this;
                                q1Var2.m(q1Var2.u(b10));
                            }
                        }
                        androidx.camera.core.t1.a("CaptureSession", "Attempting to send capture request onConfigured");
                        q1 q1Var3 = q1.this;
                        q1Var3.o(q1Var3.f22221g);
                        q1.this.n();
                        break;
                    case 6:
                        q1.this.f22220f = j2Var;
                        break;
                    case 7:
                        j2Var.close();
                        break;
                }
                androidx.camera.core.t1.a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + q1.this.f22226l);
            }
        }

        @Override
        public void s(j2 j2Var) {
            synchronized (q1.this.f22215a) {
                if (c.f22232a[q1.this.f22226l.ordinal()] != 1) {
                    androidx.camera.core.t1.a("CaptureSession", "CameraCaptureSession.onReady() " + q1.this.f22226l);
                } else {
                    throw new IllegalStateException("onReady() should not be possible in state: " + q1.this.f22226l);
                }
            }
        }

        @Override
        public void t(j2 j2Var) {
            synchronized (q1.this.f22215a) {
                if (q1.this.f22226l != d.UNINITIALIZED) {
                    androidx.camera.core.t1.a("CaptureSession", "onSessionFinished()");
                    q1.this.l();
                } else {
                    throw new IllegalStateException("onSessionFinished() should not be possible in state: " + q1.this.f22226l);
                }
            }
        }
    }

    public q1() {
        this.f22226l = d.UNINITIALIZED;
        this.f22226l = d.INITIALIZED;
    }

    public void p(CameraCaptureSession cameraCaptureSession, int i10, boolean z10) {
        synchronized (this.f22215a) {
            if (this.f22226l == d.OPENED) {
                o(this.f22221g);
            }
        }
    }

    public Object r(c.a aVar) {
        String str;
        synchronized (this.f22215a) {
            h.h(this.f22228n == null, "Release completer expected to be null");
            this.f22228n = aVar;
            str = "Release[session=" + this + "]";
        }
        return str;
    }

    public static n0 s(List<j0> list) {
        p1 J = p1.J();
        for (j0 j0Var : list) {
            n0 c10 = j0Var.c();
            for (n0.a<?> aVar : c10.b()) {
                Object a10 = c10.a(aVar, null);
                if (J.e(aVar)) {
                    Object a11 = J.a(aVar, null);
                    if (!Objects.equals(a11, a10)) {
                        androidx.camera.core.t1.a("CaptureSession", "Detect conflicting option " + aVar.c() + " : " + a10 + " != " + a11);
                    }
                } else {
                    J.n(aVar, a10);
                }
            }
        }
        return J;
    }

    @Override
    public void a() {
        ArrayList<j0> arrayList;
        synchronized (this.f22215a) {
            if (!this.f22216b.isEmpty()) {
                arrayList = new ArrayList(this.f22216b);
                this.f22216b.clear();
            } else {
                arrayList = null;
            }
        }
        if (arrayList != null) {
            for (j0 j0Var : arrayList) {
                for (y.h hVar : j0Var.b()) {
                    hVar.a();
                }
            }
        }
    }

    @Override
    public void b(b2 b2Var) {
        synchronized (this.f22215a) {
            switch (c.f22232a[this.f22226l.ordinal()]) {
                case 1:
                    throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.f22226l);
                case 2:
                case 3:
                case 4:
                    this.f22221g = b2Var;
                    break;
                case 5:
                    this.f22221g = b2Var;
                    if (b2Var != null) {
                        if (this.f22224j.keySet().containsAll(b2Var.i())) {
                            androidx.camera.core.t1.a("CaptureSession", "Attempting to submit CaptureRequest after setting");
                            o(this.f22221g);
                            break;
                        } else {
                            androidx.camera.core.t1.c("CaptureSession", "Does not have the proper configured lists");
                            return;
                        }
                    } else {
                        return;
                    }
                case 6:
                case 7:
                case 8:
                    throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
            }
        }
    }

    @Override
    public c7.a<java.lang.Void> c(boolean r4) {
        throw new UnsupportedOperationException("Method not decompiled: s.q1.c(boolean):c7.a");
    }

    @Override
    public void close() {
        synchronized (this.f22215a) {
            int i10 = c.f22232a[this.f22226l.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                if (this.f22221g != null) {
                                    List<j0> a10 = this.f22223i.d().a();
                                    if (!a10.isEmpty()) {
                                        try {
                                            e(u(a10));
                                        } catch (IllegalStateException e10) {
                                            androidx.camera.core.t1.d("CaptureSession", "Unable to issue the request before close the capture session", e10);
                                        }
                                    }
                                }
                            }
                        }
                        u2 u2Var = this.f22219e;
                        h.f(u2Var, "The Opener shouldn't null in state:" + this.f22226l);
                        this.f22219e.e();
                        this.f22226l = d.CLOSED;
                        this.f22221g = null;
                    } else {
                        u2 u2Var2 = this.f22219e;
                        h.f(u2Var2, "The Opener shouldn't null in state:" + this.f22226l);
                        this.f22219e.e();
                    }
                }
                this.f22226l = d.RELEASED;
            } else {
                throw new IllegalStateException("close() should not be possible in state: " + this.f22226l);
            }
        }
    }

    @Override
    public List<j0> d() {
        List<j0> unmodifiableList;
        synchronized (this.f22215a) {
            unmodifiableList = Collections.unmodifiableList(this.f22216b);
        }
        return unmodifiableList;
    }

    @Override
    public void e(List<j0> list) {
        synchronized (this.f22215a) {
            switch (c.f22232a[this.f22226l.ordinal()]) {
                case 1:
                    throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f22226l);
                case 2:
                case 3:
                case 4:
                    this.f22216b.addAll(list);
                    break;
                case 5:
                    this.f22216b.addAll(list);
                    n();
                    break;
                case 6:
                case 7:
                case 8:
                    throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
            }
        }
    }

    @Override
    public b2 f() {
        b2 b2Var;
        synchronized (this.f22215a) {
            b2Var = this.f22221g;
        }
        return b2Var;
    }

    @Override
    public c7.a<Void> g(final b2 b2Var, final CameraDevice cameraDevice, u2 u2Var) {
        synchronized (this.f22215a) {
            if (c.f22232a[this.f22226l.ordinal()] != 2) {
                androidx.camera.core.t1.c("CaptureSession", "Open not allowed in state: " + this.f22226l);
                return f.f(new IllegalStateException("open() should not allow the state: " + this.f22226l));
            }
            this.f22226l = d.GET_SURFACE;
            ArrayList arrayList = new ArrayList(b2Var.i());
            this.f22225k = arrayList;
            this.f22219e = u2Var;
            b0.d f10 = b0.d.b(u2Var.d(arrayList, 5000L)).f(new b0.a() {
                @Override
                public final a apply(Object obj) {
                    a q10;
                    q10 = q1.this.q(b2Var, cameraDevice, (List) obj);
                    return q10;
                }
            }, this.f22219e.b());
            f.b(f10, new b(), this.f22219e.b());
            return f.j(f10);
        }
    }

    public final CameraCaptureSession.CaptureCallback k(List<y.h> list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        for (y.h hVar : list) {
            arrayList.add(m1.a(hVar));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return k0.a(arrayList);
    }

    public void l() {
        d dVar = this.f22226l;
        d dVar2 = d.RELEASED;
        if (dVar == dVar2) {
            androidx.camera.core.t1.a("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.f22226l = dVar2;
        this.f22220f = null;
        c.a<Void> aVar = this.f22228n;
        if (aVar != null) {
            aVar.c(null);
            this.f22228n = null;
        }
    }

    public int m(List<j0> list) {
        e1 e1Var;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        synchronized (this.f22215a) {
            if (list.isEmpty()) {
                return -1;
            }
            try {
                e1Var = new e1();
                arrayList = new ArrayList();
                androidx.camera.core.t1.a("CaptureSession", "Issuing capture request.");
                z10 = false;
                for (j0 j0Var : list) {
                    if (j0Var.d().isEmpty()) {
                        androidx.camera.core.t1.a("CaptureSession", "Skipping issuing empty capture request.");
                    } else {
                        Iterator<q0> it = j0Var.d().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z11 = true;
                                break;
                            }
                            q0 next = it.next();
                            if (!this.f22224j.containsKey(next)) {
                                androidx.camera.core.t1.a("CaptureSession", "Skipping capture request with invalid surface: " + next);
                                z11 = false;
                                break;
                            }
                        }
                        if (z11) {
                            if (j0Var.f() == 2) {
                                z10 = true;
                            }
                            j0.a k10 = j0.a.k(j0Var);
                            b2 b2Var = this.f22221g;
                            if (b2Var != null) {
                                k10.e(b2Var.f().c());
                            }
                            k10.e(this.f22222h);
                            k10.e(j0Var.c());
                            CaptureRequest b10 = z0.b(k10.h(), this.f22220f.j(), this.f22224j);
                            if (b10 == null) {
                                androidx.camera.core.t1.a("CaptureSession", "Skipping issuing request without surface.");
                                return -1;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (y.h hVar : j0Var.b()) {
                                m1.b(hVar, arrayList2);
                            }
                            e1Var.a(b10, arrayList2);
                            arrayList.add(b10);
                        }
                    }
                }
            } catch (CameraAccessException e10) {
                androidx.camera.core.t1.c("CaptureSession", "Unable to access camera: " + e10.getMessage());
                Thread.dumpStack();
            }
            if (!arrayList.isEmpty()) {
                if (this.f22229o.a(arrayList, z10)) {
                    this.f22220f.l();
                    e1Var.c(new e1.a() {
                        @Override
                        public final void a(CameraCaptureSession cameraCaptureSession, int i10, boolean z12) {
                            q1.this.p(cameraCaptureSession, i10, z12);
                        }
                    });
                }
                return this.f22220f.f(arrayList, e1Var);
            }
            androidx.camera.core.t1.a("CaptureSession", "Skipping issuing burst request due to no valid request elements");
            return -1;
        }
    }

    public void n() {
        if (!this.f22216b.isEmpty()) {
            try {
                m(this.f22216b);
            } finally {
                this.f22216b.clear();
            }
        }
    }

    public int o(b2 b2Var) {
        synchronized (this.f22215a) {
            if (b2Var == null) {
                androidx.camera.core.t1.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return -1;
            }
            j0 f10 = b2Var.f();
            if (f10.d().isEmpty()) {
                androidx.camera.core.t1.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    this.f22220f.l();
                } catch (CameraAccessException e10) {
                    androidx.camera.core.t1.c("CaptureSession", "Unable to access camera: " + e10.getMessage());
                    Thread.dumpStack();
                }
                return -1;
            }
            try {
                androidx.camera.core.t1.a("CaptureSession", "Issuing request for session.");
                j0.a k10 = j0.a.k(f10);
                n0 s10 = s(this.f22223i.d().d());
                this.f22222h = s10;
                k10.e(s10);
                CaptureRequest b10 = z0.b(k10.h(), this.f22220f.j(), this.f22224j);
                if (b10 == null) {
                    androidx.camera.core.t1.a("CaptureSession", "Skipping issuing empty request for session.");
                    return -1;
                }
                return this.f22220f.k(b10, k(f10.b(), this.f22217c));
            } catch (CameraAccessException e11) {
                androidx.camera.core.t1.c("CaptureSession", "Unable to access camera: " + e11.getMessage());
                Thread.dumpStack();
                return -1;
            }
        }
    }

    public final c7.a<Void> q(List<Surface> list, b2 b2Var, CameraDevice cameraDevice) {
        synchronized (this.f22215a) {
            int i10 = c.f22232a[this.f22226l.ordinal()];
            if (!(i10 == 1 || i10 == 2)) {
                if (i10 == 3) {
                    this.f22224j.clear();
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        this.f22224j.put(this.f22225k.get(i11), list.get(i11));
                    }
                    ArrayList<Surface> arrayList = new ArrayList(new LinkedHashSet(list));
                    this.f22226l = d.OPENING;
                    androidx.camera.core.t1.a("CaptureSession", "Opening capture session.");
                    j2.a v10 = v2.v(this.f22218d, new v2.a(b2Var.g()));
                    r.a aVar = new r.a(b2Var.d());
                    r.c G = aVar.G(r.c.e());
                    this.f22223i = G;
                    List<j0> c10 = G.d().c();
                    j0.a k10 = j0.a.k(b2Var.f());
                    for (j0 j0Var : c10) {
                        k10.e(j0Var.c());
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Surface surface : arrayList) {
                        u.b bVar = new u.b(surface);
                        bVar.c(aVar.L(null));
                        arrayList2.add(bVar);
                    }
                    g a10 = this.f22219e.a(0, arrayList2, v10);
                    try {
                        CaptureRequest c11 = z0.c(k10.h(), cameraDevice);
                        if (c11 != null) {
                            a10.f(c11);
                        }
                        return this.f22219e.c(cameraDevice, a10, this.f22225k);
                    } catch (CameraAccessException e10) {
                        return f.f(e10);
                    }
                } else if (i10 != 5) {
                    return f.f(new CancellationException("openCaptureSession() not execute in state: " + this.f22226l));
                }
            }
            return f.f(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.f22226l));
        }
    }

    public List<j0> u(List<j0> list) {
        ArrayList arrayList = new ArrayList();
        for (j0 j0Var : list) {
            j0.a k10 = j0.a.k(j0Var);
            k10.o(1);
            for (q0 q0Var : this.f22221g.f().d()) {
                k10.f(q0Var);
            }
            arrayList.add(k10.h());
        }
        return arrayList;
    }
}
