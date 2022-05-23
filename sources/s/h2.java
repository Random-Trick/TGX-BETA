package s;

import android.hardware.camera2.CameraDevice;
import android.util.Size;
import androidx.camera.core.d1;
import androidx.camera.core.t1;
import b0.f;
import c7.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import r.a;
import x.j;
import y.b2;
import y.c2;
import y.d2;
import y.h;
import y.j0;
import y.q0;
import y.u1;
import y.v0;

public final class h2 implements r1 {
    public static List<q0> f22056r = new ArrayList();
    public static int f22057s = 0;
    public final c2 f22058a;
    public final j0 f22059b;
    public final Executor f22060c;
    public final ScheduledExecutorService f22061d;
    public b2 f22064g;
    public b1 f22065h;
    public b2 f22066i;
    public final e f22071n;
    public int f22074q;
    public List<q0> f22063f = new ArrayList();
    public boolean f22067j = false;
    public volatile j0 f22069l = null;
    public volatile boolean f22070m = false;
    public j f22072o = new j.a().d();
    public j f22073p = new j.a().d();
    public final q1 f22062e = new q1();
    public d f22068k = d.UNINITIALIZED;

    public class a implements b0.c<Void> {
        public a() {
        }

        @Override
        public void b(Throwable th) {
            t1.d("ProcessingCaptureSession", "open session failed ", th);
            h2.this.close();
        }

        public void a(Void r12) {
        }
    }

    public class b implements c2.a {
        public final j0 f22076a;

        public b(j0 j0Var) {
            this.f22076a = j0Var;
        }
    }

    public static class c {
        public static final int[] f22078a;

        static {
            int[] iArr = new int[d.values().length];
            f22078a = iArr;
            try {
                iArr[d.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22078a[d.SESSION_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22078a[d.ON_CAPTURE_SESSION_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22078a[d.ON_CAPTURE_SESSION_ENDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22078a[d.CLOSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum d {
        UNINITIALIZED,
        SESSION_INITIALIZED,
        ON_CAPTURE_SESSION_STARTED,
        ON_CAPTURE_SESSION_ENDED,
        CLOSED
    }

    public static class e implements c2.a {
        public List<h> f22082a = Collections.emptyList();
        public final Executor f22083b;

        public e(Executor executor) {
            this.f22083b = executor;
        }

        public void a(List<h> list) {
            this.f22082a = list;
        }
    }

    public h2(c2 c2Var, j0 j0Var, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f22074q = 0;
        this.f22058a = c2Var;
        this.f22059b = j0Var;
        this.f22060c = executor;
        this.f22061d = scheduledExecutorService;
        this.f22071n = new e(executor);
        int i10 = f22057s;
        f22057s = i10 + 1;
        this.f22074q = i10;
        t1.a("ProcessingCaptureSession", "New ProcessingCaptureSession (id=" + this.f22074q + ")");
    }

    public static void l(List<j0> list) {
        for (j0 j0Var : list) {
            for (h hVar : j0Var.b()) {
                hVar.a();
            }
        }
    }

    public static List<d2> m(List<q0> list) {
        ArrayList arrayList = new ArrayList();
        for (q0 q0Var : list) {
            b1.h.b(q0Var instanceof d2, "Surface must be SessionProcessorSurface");
            arrayList.add((d2) q0Var);
        }
        return arrayList;
    }

    public void o() {
        v0.e(this.f22063f);
    }

    public static void p(q0 q0Var) {
        f22056r.remove(q0Var);
    }

    public c7.a q(b2 b2Var, CameraDevice cameraDevice, u2 u2Var, List list) {
        t1.a("ProcessingCaptureSession", "-- getSurfaces done, start init (id=" + this.f22074q + ")");
        if (this.f22068k == d.CLOSED) {
            return f.f(new IllegalStateException("SessionProcessorCaptureSession is closed."));
        }
        u1 u1Var = null;
        if (list.contains(null)) {
            return f.f(new q0.a("Surface closed", b2Var.i().get(list.indexOf(null))));
        }
        try {
            v0.f(this.f22063f);
            u1 u1Var2 = null;
            u1 u1Var3 = null;
            for (int i10 = 0; i10 < b2Var.i().size(); i10++) {
                q0 q0Var = b2Var.i().get(i10);
                if (Objects.equals(q0Var.e(), androidx.camera.core.b2.class)) {
                    u1Var = u1.a(q0Var.h().get(), new Size(q0Var.f().getWidth(), q0Var.f().getHeight()), q0Var.g());
                } else if (Objects.equals(q0Var.e(), d1.class)) {
                    u1Var2 = u1.a(q0Var.h().get(), new Size(q0Var.f().getWidth(), q0Var.f().getHeight()), q0Var.g());
                } else if (Objects.equals(q0Var.e(), androidx.camera.core.j0.class)) {
                    u1Var3 = u1.a(q0Var.h().get(), new Size(q0Var.f().getWidth(), q0Var.f().getHeight()), q0Var.g());
                }
            }
            this.f22068k = d.SESSION_INITIALIZED;
            t1.k("ProcessingCaptureSession", "== initSession (id=" + this.f22074q + ")");
            b2 f10 = this.f22058a.f(this.f22059b, u1Var, u1Var2, u1Var3);
            this.f22066i = f10;
            f10.i().get(0).i().a(new Runnable() {
                @Override
                public final void run() {
                    h2.this.o();
                }
            }, a0.a.a());
            for (final q0 q0Var2 : this.f22066i.i()) {
                f22056r.add(q0Var2);
                q0Var2.i().a(new Runnable() {
                    @Override
                    public final void run() {
                        h2.p(q0.this);
                    }
                }, this.f22060c);
            }
            b2.f fVar = new b2.f();
            fVar.a(b2Var);
            fVar.c();
            fVar.a(this.f22066i);
            b1.h.b(fVar.d(), "Cannot transform the SessionConfig");
            c7.a<Void> g10 = this.f22062e.g(fVar.b(), (CameraDevice) b1.h.e(cameraDevice), u2Var);
            f.b(g10, new a(), this.f22060c);
            return g10;
        } catch (q0.a e10) {
            return f.f(e10);
        }
    }

    public Void r(Void r12) {
        s(this.f22062e);
        return null;
    }

    @Override
    public void a() {
        t1.a("ProcessingCaptureSession", "cancelIssuedCaptureRequests (id=" + this.f22074q + ")");
        if (this.f22069l != null) {
            for (h hVar : this.f22069l.b()) {
                hVar.a();
            }
            this.f22069l = null;
        }
    }

    @Override
    public void b(b2 b2Var) {
        t1.a("ProcessingCaptureSession", "setSessionConfig (id=" + this.f22074q + ")");
        this.f22064g = b2Var;
        if (b2Var != null) {
            this.f22071n.a(b2Var.e());
            if (this.f22068k == d.ON_CAPTURE_SESSION_STARTED) {
                j d10 = j.a.e(b2Var.d()).d();
                this.f22072o = d10;
                t(d10, this.f22073p);
                if (!this.f22067j) {
                    this.f22058a.g(this.f22071n);
                    this.f22067j = true;
                }
            }
        }
    }

    @Override
    public c7.a<Void> c(boolean z10) {
        b1.h.h(this.f22068k == d.CLOSED, "release() can only be called in CLOSED state");
        t1.a("ProcessingCaptureSession", "release (id=" + this.f22074q + ")");
        return this.f22062e.c(z10);
    }

    @Override
    public void close() {
        t1.a("ProcessingCaptureSession", "close (id=" + this.f22074q + ") state=" + this.f22068k);
        int i10 = c.f22078a[this.f22068k.ordinal()];
        if (i10 != 2) {
            if (i10 == 3) {
                this.f22058a.b();
                b1 b1Var = this.f22065h;
                if (b1Var != null) {
                    b1Var.a();
                }
                this.f22068k = d.ON_CAPTURE_SESSION_ENDED;
            } else if (i10 != 4) {
                if (i10 == 5) {
                    return;
                }
                this.f22068k = d.CLOSED;
                this.f22062e.close();
            }
        }
        this.f22058a.c();
        this.f22068k = d.CLOSED;
        this.f22062e.close();
    }

    @Override
    public List<j0> d() {
        return this.f22069l != null ? Arrays.asList(this.f22069l) : Collections.emptyList();
    }

    @Override
    public void e(List<j0> list) {
        if (!list.isEmpty()) {
            if (list.size() > 1 || !n(list)) {
                l(list);
            } else if (this.f22069l != null || this.f22070m) {
                l(list);
            } else {
                j0 j0Var = list.get(0);
                t1.a("ProcessingCaptureSession", "issueCaptureRequests (id=" + this.f22074q + ") + state =" + this.f22068k);
                int i10 = c.f22078a[this.f22068k.ordinal()];
                if (i10 == 1 || i10 == 2) {
                    this.f22069l = j0Var;
                } else if (i10 == 3) {
                    this.f22070m = true;
                    j d10 = j.a.e(j0Var.c()).d();
                    this.f22073p = d10;
                    t(this.f22072o, d10);
                    this.f22058a.a(new b(j0Var));
                } else if (i10 == 4 || i10 == 5) {
                    t1.a("ProcessingCaptureSession", "Run issueCaptureRequests in wrong state, state = " + this.f22068k);
                    l(list);
                }
            }
        }
    }

    @Override
    public b2 f() {
        return this.f22064g;
    }

    @Override
    public c7.a<Void> g(final b2 b2Var, final CameraDevice cameraDevice, final u2 u2Var) {
        boolean z10 = this.f22068k == d.UNINITIALIZED;
        b1.h.b(z10, "Invalid state state:" + this.f22068k);
        b1.h.b(b2Var.i().isEmpty() ^ true, "SessionConfig contains no surfaces");
        t1.a("ProcessingCaptureSession", "open (id=" + this.f22074q + ")");
        List<q0> i10 = b2Var.i();
        this.f22063f = i10;
        return b0.d.b(v0.k(i10, false, 5000L, this.f22060c, this.f22061d)).f(new b0.a() {
            @Override
            public final a apply(Object obj) {
                a q10;
                q10 = h2.this.q(b2Var, cameraDevice, u2Var, (List) obj);
                return q10;
            }
        }, this.f22060c).e(new n.a() {
            @Override
            public final Object apply(Object obj) {
                Void r10;
                r10 = h2.this.r((Void) obj);
                return r10;
            }
        }, this.f22060c);
    }

    public final boolean n(List<j0> list) {
        if (list.isEmpty()) {
            return false;
        }
        for (j0 j0Var : list) {
            if (j0Var.f() != 2) {
                return false;
            }
        }
        return true;
    }

    public void s(q1 q1Var) {
        boolean z10 = this.f22068k == d.SESSION_INITIALIZED;
        b1.h.b(z10, "Invalid state state:" + this.f22068k);
        b1 b1Var = new b1(q1Var, m(this.f22066i.i()));
        this.f22065h = b1Var;
        this.f22058a.e(b1Var);
        this.f22068k = d.ON_CAPTURE_SESSION_STARTED;
        b2 b2Var = this.f22064g;
        if (b2Var != null) {
            b(b2Var);
        }
        if (this.f22069l != null) {
            List<j0> asList = Arrays.asList(this.f22069l);
            this.f22069l = null;
            e(asList);
        }
    }

    public final void t(j jVar, j jVar2) {
        a.C0201a aVar = new a.C0201a();
        aVar.d(jVar);
        aVar.d(jVar2);
        this.f22058a.d(aVar.c());
    }
}
