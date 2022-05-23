package s;

import android.annotation.SuppressLint;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.m;
import androidx.camera.core.r;
import androidx.camera.core.t;
import androidx.camera.core.t1;
import androidx.camera.core.x2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import l0.c;
import s.g0;
import s.u2;
import t.m0;
import y.a0;
import y.b0;
import y.b2;
import y.c0;
import y.c2;
import y.f0;
import y.h1;
import y.j0;
import y.l2;
import y.m1;
import y.q0;
import y.r1;
import y.s;
import y.w;
import y.x;

public final class g0 implements c0 {
    public final ScheduledExecutorService M;
    public final m1<c0.a> O;
    public final i1 P;
    public final t Q;
    public final g R;
    public final j0 S;
    public CameraDevice T;
    public c.a<Void> X;
    public final d Z;
    public final l2 f22017a;
    public final f0 f22018a0;
    public final m0 f22019b;
    public final Executor f22021c;
    public c2 f22022c0;
    public final t1 f22023d0;
    public final u2.a f22024e0;
    public s f22026g0;
    public c2 f22028i0;
    public volatile f N = f.INITIALIZED;
    public int U = 0;
    public final AtomicInteger W = new AtomicInteger(0);
    public final Map<r1, c7.a<Void>> Y = new LinkedHashMap();
    public final Set<q1> f22020b0 = new HashSet();
    public final Set<String> f22025f0 = new HashSet();
    public final Object f22027h0 = new Object();
    public boolean f22029j0 = false;
    public r1 V = W();

    public class a implements b0.c<Void> {
        public final r1 f22030a;

        public a(r1 r1Var) {
            this.f22030a = r1Var;
        }

        @Override
        public void b(Throwable th) {
        }

        public void a(Void r22) {
            CameraDevice cameraDevice;
            g0.this.Y.remove(this.f22030a);
            int i10 = c.f22033a[g0.this.N.ordinal()];
            if (i10 != 3) {
                if (i10 != 6) {
                    if (i10 != 7) {
                        return;
                    }
                } else if (g0.this.U == 0) {
                    return;
                }
            }
            if (g0.this.L() && (cameraDevice = g0.this.T) != null) {
                t.a.a(cameraDevice);
                g0.this.T = null;
            }
        }
    }

    public class b implements b0.c<Void> {
        public b() {
        }

        @Override
        public void b(Throwable th) {
            if (th instanceof q0.a) {
                b2 G = g0.this.G(((q0.a) th).a());
                if (G != null) {
                    g0.this.c0(G);
                }
            } else if (th instanceof CancellationException) {
                g0.this.E("Unable to configure camera cancelled");
            } else {
                f fVar = g0.this.N;
                f fVar2 = f.OPENED;
                if (fVar == fVar2) {
                    g0.this.i0(fVar2, t.a.b(4, th));
                }
                if (th instanceof CameraAccessException) {
                    g0 g0Var = g0.this;
                    g0Var.E("Unable to configure camera due to " + th.getMessage());
                } else if (th instanceof TimeoutException) {
                    t1.c("Camera2CameraImpl", "Unable to configure camera " + g0.this.S.a() + ", timeout!");
                }
            }
        }

        public void a(Void r12) {
        }
    }

    public static class c {
        public static final int[] f22033a;

        static {
            int[] iArr = new int[f.values().length];
            f22033a = iArr;
            try {
                iArr[f.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22033a[f.PENDING_OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22033a[f.CLOSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22033a[f.OPENED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22033a[f.OPENING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22033a[f.REOPENING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22033a[f.RELEASING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22033a[f.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public final class d extends CameraManager.AvailabilityCallback implements f0.b {
        public final String f22034a;
        public boolean f22035b = true;

        public d(String str) {
            this.f22034a = str;
        }

        @Override
        public void a() {
            if (g0.this.N == f.PENDING_OPEN) {
                g0.this.p0(false);
            }
        }

        public boolean b() {
            return this.f22035b;
        }

        @Override
        public void onCameraAvailable(String str) {
            if (this.f22034a.equals(str)) {
                this.f22035b = true;
                if (g0.this.N == f.PENDING_OPEN) {
                    g0.this.p0(false);
                }
            }
        }

        @Override
        public void onCameraUnavailable(String str) {
            if (this.f22034a.equals(str)) {
                this.f22035b = false;
            }
        }
    }

    public final class e implements x.c {
        public e() {
        }

        @Override
        public void a() {
            g0.this.q0();
        }

        @Override
        public void b(List<j0> list) {
            g0.this.k0((List) b1.h.e(list));
        }
    }

    public enum f {
        INITIALIZED,
        PENDING_OPEN,
        OPENING,
        OPENED,
        CLOSING,
        REOPENING,
        RELEASING,
        RELEASED
    }

    public final class g extends CameraDevice.StateCallback {
        public final Executor f22041a;
        public final ScheduledExecutorService f22042b;
        public b f22043c;
        public ScheduledFuture<?> f22044d;
        public final a f22045e = new a();

        public class a {
            public long f22047a = -1;

            public a() {
            }

            public boolean a() {
                if (!(b() >= ((long) d()))) {
                    return true;
                }
                e();
                return false;
            }

            public long b() {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.f22047a == -1) {
                    this.f22047a = uptimeMillis;
                }
                return uptimeMillis - this.f22047a;
            }

            public int c() {
                if (!g.this.f()) {
                    return 700;
                }
                long b10 = b();
                if (b10 <= 120000) {
                    return 1000;
                }
                return b10 <= 300000 ? 2000 : 4000;
            }

            public int d() {
                return !g.this.f() ? 10000 : 1800000;
            }

            public void e() {
                this.f22047a = -1L;
            }
        }

        public class b implements Runnable {
            public Executor f22049a;
            public boolean f22050b = false;

            public b(Executor executor) {
                this.f22049a = executor;
            }

            public void c() {
                if (!this.f22050b) {
                    b1.h.g(g0.this.N == f.REOPENING);
                    if (g.this.f()) {
                        g0.this.o0(true);
                    } else {
                        g0.this.p0(true);
                    }
                }
            }

            public void b() {
                this.f22050b = true;
            }

            @Override
            public void run() {
                this.f22049a.execute(new Runnable() {
                    @Override
                    public final void run() {
                        g0.g.b.this.c();
                    }
                });
            }
        }

        public g(Executor executor, ScheduledExecutorService scheduledExecutorService) {
            this.f22041a = executor;
            this.f22042b = scheduledExecutorService;
        }

        public boolean a() {
            if (this.f22044d == null) {
                return false;
            }
            g0 g0Var = g0.this;
            g0Var.E("Cancelling scheduled re-open: " + this.f22043c);
            this.f22043c.b();
            this.f22043c = null;
            this.f22044d.cancel(false);
            this.f22044d = null;
            return true;
        }

        public final void b(CameraDevice cameraDevice, int i10) {
            boolean z10 = g0.this.N == f.OPENING || g0.this.N == f.OPENED || g0.this.N == f.REOPENING;
            b1.h.h(z10, "Attempt to handle open error from non open state: " + g0.this.N);
            if (i10 == 1 || i10 == 2 || i10 == 4) {
                t1.a("Camera2CameraImpl", String.format("Attempt to reopen camera[%s] after error[%s]", cameraDevice.getId(), g0.I(i10)));
                c(i10);
                return;
            }
            t1.c("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + g0.I(i10) + " closing camera.");
            g0.this.i0(f.CLOSING, t.a.a(i10 == 3 ? 5 : 6));
            g0.this.A(false);
        }

        public final void c(int i10) {
            int i11 = 1;
            b1.h.h(g0.this.U != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
            if (i10 == 1) {
                i11 = 2;
            } else if (i10 != 2) {
                i11 = 3;
            }
            g0.this.i0(f.REOPENING, t.a.a(i11));
            g0.this.A(false);
        }

        public void d() {
            this.f22045e.e();
        }

        public void e() {
            boolean z10 = true;
            b1.h.g(this.f22043c == null);
            if (this.f22044d != null) {
                z10 = false;
            }
            b1.h.g(z10);
            if (this.f22045e.a()) {
                this.f22043c = new b(this.f22041a);
                g0 g0Var = g0.this;
                g0Var.E("Attempting camera re-open in " + this.f22045e.c() + "ms: " + this.f22043c + " activeResuming = " + g0.this.f22029j0);
                this.f22044d = this.f22042b.schedule(this.f22043c, (long) this.f22045e.c(), TimeUnit.MILLISECONDS);
                return;
            }
            t1.c("Camera2CameraImpl", "Camera reopening attempted for " + this.f22045e.d() + "ms without success.");
            g0.this.j0(f.PENDING_OPEN, null, false);
        }

        public boolean f() {
            int i10;
            g0 g0Var = g0.this;
            return (!g0Var.f22029j0 || (i10 = g0Var.U) == 4 || i10 == 2) ? false : true;
        }

        @Override
        public void onClosed(CameraDevice cameraDevice) {
            g0.this.E("CameraDevice.onClosed()");
            boolean z10 = g0.this.T == null;
            b1.h.h(z10, "Unexpected onClose callback on camera device: " + cameraDevice);
            int i10 = c.f22033a[g0.this.N.ordinal()];
            if (i10 != 3) {
                if (i10 == 6) {
                    g0 g0Var = g0.this;
                    if (g0Var.U != 0) {
                        g0Var.E("Camera closed due to error: " + g0.I(g0.this.U));
                        e();
                        return;
                    }
                    g0Var.p0(false);
                    return;
                } else if (i10 != 7) {
                    throw new IllegalStateException("Camera closed while in state: " + g0.this.N);
                }
            }
            b1.h.g(g0.this.L());
            g0.this.H();
        }

        @Override
        public void onDisconnected(CameraDevice cameraDevice) {
            g0.this.E("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        @Override
        public void onError(CameraDevice cameraDevice, int i10) {
            g0 g0Var = g0.this;
            g0Var.T = cameraDevice;
            g0Var.U = i10;
            int i11 = c.f22033a[g0Var.N.ordinal()];
            if (i11 != 3) {
                if (i11 == 4 || i11 == 5 || i11 == 6) {
                    t1.a("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", cameraDevice.getId(), g0.I(i10), g0.this.N.name()));
                    b(cameraDevice, i10);
                    return;
                } else if (i11 != 7) {
                    throw new IllegalStateException("onError() should not be possible from state: " + g0.this.N);
                }
            }
            t1.c("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", cameraDevice.getId(), g0.I(i10), g0.this.N.name()));
            g0.this.A(false);
        }

        @Override
        public void onOpened(CameraDevice cameraDevice) {
            g0.this.E("CameraDevice.onOpened()");
            g0 g0Var = g0.this;
            g0Var.T = cameraDevice;
            g0Var.U = 0;
            d();
            int i10 = c.f22033a[g0.this.N.ordinal()];
            if (i10 != 3) {
                if (i10 == 5 || i10 == 6) {
                    g0.this.h0(f.OPENED);
                    g0.this.a0();
                    return;
                } else if (i10 != 7) {
                    throw new IllegalStateException("onOpened() should not be possible from state: " + g0.this.N);
                }
            }
            b1.h.g(g0.this.L());
            g0.this.T.close();
            g0.this.T = null;
        }
    }

    public static abstract class h {
        public static h a(String str, Class<?> cls, b2 b2Var, Size size) {
            return new s.b(str, cls, b2Var, size);
        }

        public static h b(x2 x2Var) {
            return a(g0.J(x2Var), x2Var.getClass(), x2Var.k(), x2Var.b());
        }

        public abstract b2 c();

        public abstract Size d();

        public abstract String e();

        public abstract Class<?> f();
    }

    public g0(m0 m0Var, String str, j0 j0Var, f0 f0Var, Executor executor, Handler handler) {
        m1<c0.a> m1Var = new m1<>();
        this.O = m1Var;
        this.f22019b = m0Var;
        this.f22018a0 = f0Var;
        ScheduledExecutorService e10 = a0.a.e(handler);
        this.M = e10;
        Executor f10 = a0.a.f(executor);
        this.f22021c = f10;
        this.R = new g(f10, e10);
        this.f22017a = new l2(str);
        m1Var.g(c0.a.CLOSED);
        i1 i1Var = new i1(f0Var);
        this.P = i1Var;
        t1 t1Var = new t1(f10);
        this.f22023d0 = t1Var;
        try {
            t tVar = new t(m0Var.c(str), e10, f10, new e(), j0Var.h());
            this.Q = tVar;
            this.S = j0Var;
            j0Var.m(tVar);
            j0Var.p(i1Var.a());
            this.f22024e0 = new u2.a(f10, e10, handler, t1Var, j0Var.l());
            d dVar = new d(str);
            this.Z = dVar;
            f0Var.e(this, f10, dVar);
            m0Var.f(f10, dVar);
        } catch (t.f e11) {
            throw j1.a(e11);
        }
    }

    public static String I(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    public static String J(x2 x2Var) {
        return x2Var.i() + x2Var.hashCode();
    }

    public void M(List list) {
        try {
            m0(list);
        } finally {
            this.Q.u();
        }
    }

    public static void N(Surface surface, SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    public void Q(String str, b2 b2Var) {
        E("Use case " + str + " ACTIVE");
        this.f22017a.m(str, b2Var);
        this.f22017a.q(str, b2Var);
        q0();
    }

    public void R(String str) {
        E("Use case " + str + " INACTIVE");
        this.f22017a.p(str);
        q0();
    }

    public void S(String str, b2 b2Var) {
        E("Use case " + str + " RESET");
        this.f22017a.q(str, b2Var);
        g0(false);
        q0();
        if (this.N == f.OPENED) {
            a0();
        }
    }

    public void T(String str, b2 b2Var) {
        E("Use case " + str + " UPDATED");
        this.f22017a.q(str, b2Var);
        q0();
    }

    public static void U(b2.c cVar, b2 b2Var) {
        cVar.a(b2Var, b2.e.SESSION_ERROR_SURFACE_NEEDS_RESET);
    }

    public void V(boolean z10) {
        this.f22029j0 = z10;
        if (!z10) {
            return;
        }
        if (this.N == f.PENDING_OPEN || this.N == f.REOPENING) {
            o0(false);
        }
    }

    public void A(boolean z10) {
        boolean z11 = this.N == f.CLOSING || this.N == f.RELEASING || (this.N == f.REOPENING && this.U != 0);
        b1.h.h(z11, "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.N + " (error: " + I(this.U) + ")");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 23 || i10 >= 29 || !K() || this.U != 0) {
            g0(z10);
        } else {
            C(z10);
        }
        this.V.a();
    }

    public final void B() {
        E("Closing camera.");
        int i10 = c.f22033a[this.N.ordinal()];
        boolean z10 = false;
        if (i10 == 2) {
            if (this.T == null) {
                z10 = true;
            }
            b1.h.g(z10);
            h0(f.INITIALIZED);
        } else if (i10 == 4) {
            h0(f.CLOSING);
            A(false);
        } else if (i10 == 5 || i10 == 6) {
            boolean a10 = this.R.a();
            h0(f.CLOSING);
            if (a10) {
                b1.h.g(L());
                H();
            }
        } else {
            E("close() ignored due to being in state: " + this.N);
        }
    }

    public final void C(boolean z10) {
        final q1 q1Var = new q1();
        this.f22020b0.add(q1Var);
        g0(z10);
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        final Surface surface = new Surface(surfaceTexture);
        final Runnable wVar = new Runnable() {
            @Override
            public final void run() {
                g0.N(surface, surfaceTexture);
            }
        };
        b2.b bVar = new b2.b();
        final h1 h1Var = new h1(surface);
        bVar.h(h1Var);
        bVar.r(1);
        E("Start configAndClose.");
        q1Var.g(bVar.m(), (CameraDevice) b1.h.e(this.T), this.f22024e0.a()).a(new Runnable() {
            @Override
            public final void run() {
                g0.this.O(q1Var, h1Var, wVar);
            }
        }, this.f22021c);
    }

    public final CameraDevice.StateCallback D() {
        ArrayList arrayList = new ArrayList(this.f22017a.e().b().b());
        arrayList.add(this.f22023d0.c());
        arrayList.add(this.R);
        return g1.a(arrayList);
    }

    public void E(String str) {
        F(str, null);
    }

    public final void F(String str, Throwable th) {
        t1.b("Camera2CameraImpl", String.format("{%s} %s", toString(), str), th);
    }

    public b2 G(q0 q0Var) {
        for (b2 b2Var : this.f22017a.f()) {
            if (b2Var.i().contains(q0Var)) {
                return b2Var;
            }
        }
        return null;
    }

    public void H() {
        b1.h.g(this.N == f.RELEASING || this.N == f.CLOSING);
        b1.h.g(this.Y.isEmpty());
        this.T = null;
        if (this.N == f.CLOSING) {
            h0(f.INITIALIZED);
            return;
        }
        this.f22019b.g(this.Z);
        h0(f.RELEASED);
        c.a<Void> aVar = this.X;
        if (aVar != null) {
            aVar.c(null);
            this.X = null;
        }
    }

    public final boolean K() {
        return ((j0) l()).l() == 2;
    }

    public boolean L() {
        return this.Y.isEmpty() && this.f22020b0.isEmpty();
    }

    public final r1 W() {
        synchronized (this.f22027h0) {
            if (this.f22028i0 == null) {
                return new q1();
            }
            return new h2(this.f22028i0, this.S, this.f22021c, this.M);
        }
    }

    public final void X(List<x2> list) {
        for (x2 x2Var : list) {
            String J = J(x2Var);
            if (!this.f22025f0.contains(J)) {
                this.f22025f0.add(J);
                x2Var.B();
            }
        }
    }

    public final void Y(List<x2> list) {
        for (x2 x2Var : list) {
            String J = J(x2Var);
            if (this.f22025f0.contains(J)) {
                x2Var.C();
                this.f22025f0.remove(J);
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    public final void Z(boolean z10) {
        if (!z10) {
            this.R.d();
        }
        this.R.a();
        E("Opening camera.");
        h0(f.OPENING);
        try {
            this.f22019b.e(this.S.a(), this.f22021c, D());
        } catch (SecurityException e10) {
            E("Unable to open camera due to " + e10.getMessage());
            h0(f.REOPENING);
            this.R.e();
        } catch (t.f e11) {
            E("Unable to open camera due to " + e11.getMessage());
            if (e11.d() == 10001) {
                i0(f.INITIALIZED, t.a.b(7, e11));
            }
        }
    }

    @Override
    public r a() {
        return b0.b(this);
    }

    public void a0() {
        b1.h.g(this.N == f.OPENED);
        b2.f e10 = this.f22017a.e();
        if (!e10.d()) {
            E("Unable to create capture session due to conflicting configurations");
        } else {
            b0.f.b(this.V.g(e10.b(), (CameraDevice) b1.h.e(this.T), this.f22024e0.a()), new b(), this.f22021c);
        }
    }

    @Override
    public m b() {
        return b0.a(this);
    }

    public final void b0() {
        int i10 = c.f22033a[this.N.ordinal()];
        boolean z10 = false;
        if (i10 == 1 || i10 == 2) {
            o0(false);
        } else if (i10 != 3) {
            E("open() ignored due to being in state: " + this.N);
        } else {
            h0(f.REOPENING);
            if (!L() && this.U == 0) {
                if (this.T != null) {
                    z10 = true;
                }
                b1.h.h(z10, "Camera Device should be open if session close is not complete");
                h0(f.OPENED);
                a0();
            }
        }
    }

    @Override
    public void c(s sVar) {
        if (sVar == null) {
            sVar = w.a();
        }
        c2 s10 = sVar.s(null);
        this.f22026g0 = sVar;
        synchronized (this.f22027h0) {
            this.f22028i0 = s10;
        }
    }

    public void c0(final b2 b2Var) {
        ScheduledExecutorService d10 = a0.a.d();
        List<b2.c> c10 = b2Var.c();
        if (!c10.isEmpty()) {
            final b2.c cVar = c10.get(0);
            F("Posting surface closed", new Throwable());
            d10.execute(new Runnable() {
                @Override
                public final void run() {
                    g0.U(b2.c.this, b2Var);
                }
            });
        }
    }

    @Override
    public void d(x2 x2Var) {
        b1.h.e(x2Var);
        final String J = J(x2Var);
        final b2 k10 = x2Var.k();
        this.f22021c.execute(new Runnable() {
            @Override
            public final void run() {
                g0.this.Q(J, k10);
            }
        });
    }

    public void O(q1 q1Var, q0 q0Var, Runnable runnable) {
        this.f22020b0.remove(q1Var);
        c7.a<Void> e02 = e0(q1Var, false);
        q0Var.c();
        b0.f.n(Arrays.asList(e02, q0Var.i())).a(runnable, a0.a.a());
    }

    @Override
    public void e(x2 x2Var) {
        b1.h.e(x2Var);
        final String J = J(x2Var);
        final b2 k10 = x2Var.k();
        this.f22021c.execute(new Runnable() {
            @Override
            public final void run() {
                g0.this.S(J, k10);
            }
        });
    }

    public c7.a<Void> e0(r1 r1Var, boolean z10) {
        r1Var.close();
        c7.a<Void> c10 = r1Var.c(z10);
        E("Releasing session in state " + this.N.name());
        this.Y.put(r1Var, c10);
        b0.f.b(c10, new a(r1Var), a0.a.a());
        return c10;
    }

    @Override
    public void f(x2 x2Var) {
        b1.h.e(x2Var);
        final String J = J(x2Var);
        final b2 k10 = x2Var.k();
        this.f22021c.execute(new Runnable() {
            @Override
            public final void run() {
                g0.this.T(J, k10);
            }
        });
    }

    public final void f0() {
        if (this.f22022c0 != null) {
            l2 l2Var = this.f22017a;
            l2Var.o(this.f22022c0.d() + this.f22022c0.hashCode());
            l2 l2Var2 = this.f22017a;
            l2Var2.p(this.f22022c0.d() + this.f22022c0.hashCode());
            this.f22022c0.b();
            this.f22022c0 = null;
        }
    }

    @Override
    public r1<c0.a> g() {
        return this.O;
    }

    public void g0(boolean z10) {
        b1.h.g(this.V != null);
        E("Resetting Capture Session");
        r1 r1Var = this.V;
        b2 f10 = r1Var.f();
        List<j0> d10 = r1Var.d();
        r1 W = W();
        this.V = W;
        W.b(f10);
        this.V.e(d10);
        e0(r1Var, z10);
    }

    @Override
    public x h() {
        return this.Q;
    }

    public void h0(f fVar) {
        i0(fVar, null);
    }

    @Override
    public void i(final boolean z10) {
        this.f22021c.execute(new Runnable() {
            @Override
            public final void run() {
                g0.this.V(z10);
            }
        });
    }

    public void i0(f fVar, t.a aVar) {
        j0(fVar, aVar, true);
    }

    @Override
    public void j(Collection<x2> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (!arrayList.isEmpty()) {
            this.Q.G();
            X(new ArrayList(arrayList));
            final ArrayList arrayList2 = new ArrayList(l0(arrayList));
            try {
                this.f22021c.execute(new Runnable() {
                    @Override
                    public final void run() {
                        g0.this.M(arrayList2);
                    }
                });
            } catch (RejectedExecutionException e10) {
                F("Unable to attach use cases.", e10);
                this.Q.u();
            }
        }
    }

    public void j0(f fVar, t.a aVar, boolean z10) {
        c0.a aVar2;
        E("Transitioning camera internal state: " + this.N + " --> " + fVar);
        this.N = fVar;
        switch (c.f22033a[fVar.ordinal()]) {
            case 1:
                aVar2 = c0.a.CLOSED;
                break;
            case 2:
                aVar2 = c0.a.PENDING_OPEN;
                break;
            case 3:
                aVar2 = c0.a.CLOSING;
                break;
            case 4:
                aVar2 = c0.a.OPEN;
                break;
            case 5:
            case 6:
                aVar2 = c0.a.OPENING;
                break;
            case 7:
                aVar2 = c0.a.RELEASING;
                break;
            case 8:
                aVar2 = c0.a.RELEASED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + fVar);
        }
        this.f22018a0.c(this, aVar2, z10);
        this.O.g(aVar2);
        this.P.c(aVar2, aVar);
    }

    @Override
    public void k(Collection<x2> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (!arrayList.isEmpty()) {
            final ArrayList arrayList2 = new ArrayList(l0(arrayList));
            Y(new ArrayList(arrayList));
            this.f22021c.execute(new Runnable() {
                @Override
                public final void run() {
                    g0.this.P(arrayList2);
                }
            });
        }
    }

    public void k0(List<j0> list) {
        ArrayList arrayList = new ArrayList();
        for (j0 j0Var : list) {
            j0.a k10 = j0.a.k(j0Var);
            if (!j0Var.d().isEmpty() || !j0Var.g() || z(k10)) {
                arrayList.add(k10.h());
            }
        }
        E("Issue capture request");
        this.V.e(arrayList);
    }

    @Override
    public a0 l() {
        return this.S;
    }

    public final Collection<h> l0(Collection<x2> collection) {
        ArrayList arrayList = new ArrayList();
        for (x2 x2Var : collection) {
            arrayList.add(h.b(x2Var));
        }
        return arrayList;
    }

    @Override
    public void m(x2 x2Var) {
        b1.h.e(x2Var);
        final String J = J(x2Var);
        this.f22021c.execute(new Runnable() {
            @Override
            public final void run() {
                g0.this.R(J);
            }
        });
    }

    public final void m0(Collection<h> collection) {
        Size d10;
        boolean isEmpty = this.f22017a.f().isEmpty();
        ArrayList arrayList = new ArrayList();
        Rational rational = null;
        for (h hVar : collection) {
            if (!this.f22017a.i(hVar.e())) {
                this.f22017a.n(hVar.e(), hVar.c());
                arrayList.add(hVar.e());
                if (hVar.f() == androidx.camera.core.b2.class && (d10 = hVar.d()) != null) {
                    rational = new Rational(d10.getWidth(), d10.getHeight());
                }
            }
        }
        if (!arrayList.isEmpty()) {
            E("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED");
            if (isEmpty) {
                this.Q.Y(true);
                this.Q.G();
            }
            y();
            q0();
            g0(false);
            if (this.N == f.OPENED) {
                a0();
            } else {
                b0();
            }
            if (rational != null) {
                this.Q.Z(rational);
            }
        }
    }

    public final void P(Collection<h> collection) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (h hVar : collection) {
            if (this.f22017a.i(hVar.e())) {
                this.f22017a.l(hVar.e());
                arrayList.add(hVar.e());
                if (hVar.f() == androidx.camera.core.b2.class) {
                    z10 = true;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            E("Use cases [" + TextUtils.join(", ", arrayList) + "] now DETACHED for camera");
            if (z10) {
                this.Q.Z(null);
            }
            y();
            if (this.f22017a.f().isEmpty()) {
                this.Q.u();
                g0(false);
                this.Q.Y(false);
                this.V = W();
                B();
                return;
            }
            q0();
            g0(false);
            if (this.N == f.OPENED) {
                a0();
            }
        }
    }

    public void o0(boolean z10) {
        E("Attempting to force open the camera.");
        if (!this.f22018a0.f(this)) {
            E("No cameras available. Waiting for available camera before opening camera.");
            h0(f.PENDING_OPEN);
            return;
        }
        Z(z10);
    }

    public void p0(boolean z10) {
        E("Attempting to open the camera.");
        if (!(this.Z.b() && this.f22018a0.f(this))) {
            E("No cameras available. Waiting for available camera before opening camera.");
            h0(f.PENDING_OPEN);
            return;
        }
        Z(z10);
    }

    public void q0() {
        b2.f c10 = this.f22017a.c();
        if (c10.d()) {
            this.Q.a0(c10.b().j());
            c10.a(this.Q.y());
            this.V.b(c10.b());
            return;
        }
        this.Q.X();
        this.V.b(this.Q.y());
    }

    public String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.S.a());
    }

    public final void x() {
        if (this.f22022c0 != null) {
            l2 l2Var = this.f22017a;
            l2Var.n(this.f22022c0.d() + this.f22022c0.hashCode(), this.f22022c0.e());
            l2 l2Var2 = this.f22017a;
            l2Var2.m(this.f22022c0.d() + this.f22022c0.hashCode(), this.f22022c0.e());
        }
    }

    public final void y() {
        b2 b10 = this.f22017a.e().b();
        j0 f10 = b10.f();
        int size = f10.d().size();
        int size2 = b10.i().size();
        if (b10.i().isEmpty()) {
            return;
        }
        if (f10.d().isEmpty()) {
            if (this.f22022c0 == null) {
                this.f22022c0 = new c2(this.S.j());
            }
            x();
        } else if (size2 == 1 && size == 1) {
            f0();
        } else if (size >= 2) {
            f0();
        } else {
            t1.a("Camera2CameraImpl", "mMeteringRepeating is ATTACHED, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
        }
    }

    public final boolean z(j0.a aVar) {
        if (!aVar.l().isEmpty()) {
            t1.k("Camera2CameraImpl", "The capture config builder already has surface inside.");
            return false;
        }
        for (b2 b2Var : this.f22017a.d()) {
            List<q0> d10 = b2Var.f().d();
            if (!d10.isEmpty()) {
                for (q0 q0Var : d10) {
                    aVar.f(q0Var);
                }
            }
        }
        if (!aVar.l().isEmpty()) {
            return true;
        }
        t1.k("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
        return false;
    }
}
