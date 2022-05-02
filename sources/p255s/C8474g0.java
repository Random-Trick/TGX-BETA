package p255s;

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
import androidx.camera.core.AbstractC0615m;
import androidx.camera.core.AbstractC0642r;
import androidx.camera.core.AbstractC0658u;
import androidx.camera.core.AbstractC0688y2;
import androidx.camera.core.C0519c2;
import androidx.camera.core.C0662u1;
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
import p001a0.C0003a;
import p015b0.AbstractC1107c;
import p015b0.C1111f;
import p016b1.C1132h;
import p022b7.AbstractFutureC1291a;
import p158l0.C6287c;
import p255s.C8474g0;
import p255s.C8576u2;
import p266t.C8875a;
import p266t.C8887f;
import p266t.C8906m0;
import p336y.AbstractC10194a0;
import p336y.AbstractC10208c0;
import p336y.AbstractC10211c2;
import p336y.AbstractC10287q0;
import p336y.AbstractC10293r1;
import p336y.AbstractC10295s;
import p336y.AbstractC10312x;
import p336y.C10198b0;
import p336y.C10200b2;
import p336y.C10222f0;
import p336y.C10237h1;
import p336y.C10245j0;
import p336y.C10258l2;
import p336y.C10263m1;
import p336y.C10308w;

public final class C8474g0 implements AbstractC10208c0 {
    public final ScheduledExecutorService f27475M;
    public final C10263m1<AbstractC10208c0.EnumC10209a> f27477O;
    public final C8500i1 f27478P;
    public final C8564t f27479Q;
    public final C8481g f27480R;
    public final C8505j0 f27481S;
    public CameraDevice f27482T;
    public C6287c.C6288a<Void> f27486X;
    public final C8478d f27488Z;
    public final C10258l2 f27489a;
    public final C10222f0 f27490a0;
    public final C8906m0 f27491b;
    public final Executor f27493c;
    public C8450c2 f27494c0;
    public final C8569t1 f27495d0;
    public final C8576u2.C8577a f27496e0;
    public AbstractC10295s f27498g0;
    public AbstractC10211c2 f27500i0;
    public volatile EnumC8480f f27476N = EnumC8480f.INITIALIZED;
    public int f27483U = 0;
    public final AtomicInteger f27485W = new AtomicInteger(0);
    public final Map<AbstractC8558r1, AbstractFutureC1291a<Void>> f27487Y = new LinkedHashMap();
    public final Set<C8549q1> f27492b0 = new HashSet();
    public final Set<String> f27497f0 = new HashSet();
    public final Object f27499h0 = new Object();
    public boolean f27501j0 = false;
    public AbstractC8558r1 f27484V = m12385W();

    public class C8475a implements AbstractC1107c<Void> {
        public final AbstractC8558r1 f27502a;

        public C8475a(AbstractC8558r1 r1Var) {
            this.f27502a = r1Var;
        }

        @Override
        public void mo5502b(Throwable th) {
        }

        public void mo5503a(Void r2) {
            CameraDevice cameraDevice;
            C8474g0.this.f27487Y.remove(this.f27502a);
            int i = C8477c.f27505a[C8474g0.this.f27476N.ordinal()];
            if (i != 3) {
                if (i != 6) {
                    if (i != 7) {
                        return;
                    }
                } else if (C8474g0.this.f27483U == 0) {
                    return;
                }
            }
            if (C8474g0.this.m12396L() && (cameraDevice = C8474g0.this.f27482T) != null) {
                C8875a.m11041a(cameraDevice);
                C8474g0.this.f27482T = null;
            }
        }
    }

    public class C8476b implements AbstractC1107c<Void> {
        public C8476b() {
        }

        @Override
        public void mo5502b(Throwable th) {
            if (th instanceof AbstractC10287q0.C10288a) {
                C10200b2 G = C8474g0.this.m12401G(((AbstractC10287q0.C10288a) th).m5538a());
                if (G != null) {
                    C8474g0.this.m12378c0(G);
                }
            } else if (th instanceof CancellationException) {
                C8474g0.this.m12403E("Unable to configure camera cancelled");
            } else {
                EnumC8480f fVar = C8474g0.this.f27476N;
                EnumC8480f fVar2 = EnumC8480f.OPENED;
                if (fVar == fVar2) {
                    C8474g0.this.m12369i0(fVar2, AbstractC0658u.AbstractC0659a.m40659b(4, th));
                }
                if (th instanceof CameraAccessException) {
                    C8474g0 g0Var = C8474g0.this;
                    g0Var.m12403E("Unable to configure camera due to " + th.getMessage());
                } else if (th instanceof TimeoutException) {
                    C0662u1.m40654c("Camera2CameraImpl", "Unable to configure camera " + C8474g0.this.f27481S.mo5778a() + ", timeout!");
                }
            }
        }

        public void mo5503a(Void r1) {
        }
    }

    public static class C8477c {
        public static final int[] f27505a;

        static {
            int[] iArr = new int[EnumC8480f.values().length];
            f27505a = iArr;
            try {
                iArr[EnumC8480f.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27505a[EnumC8480f.PENDING_OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27505a[EnumC8480f.CLOSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27505a[EnumC8480f.OPENED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27505a[EnumC8480f.OPENING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27505a[EnumC8480f.REOPENING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27505a[EnumC8480f.RELEASING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f27505a[EnumC8480f.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public final class C8478d extends CameraManager.AvailabilityCallback implements C10222f0.AbstractC10224b {
        public final String f27506a;
        public boolean f27507b = true;

        public C8478d(String str) {
            this.f27506a = str;
        }

        @Override
        public void mo5697a() {
            if (C8474g0.this.f27476N == EnumC8480f.PENDING_OPEN) {
                C8474g0.this.m12358p0(false);
            }
        }

        public boolean m12344b() {
            return this.f27507b;
        }

        @Override
        public void onCameraAvailable(String str) {
            if (this.f27506a.equals(str)) {
                this.f27507b = true;
                if (C8474g0.this.f27476N == EnumC8480f.PENDING_OPEN) {
                    C8474g0.this.m12358p0(false);
                }
            }
        }

        @Override
        public void onCameraUnavailable(String str) {
            if (this.f27506a.equals(str)) {
                this.f27507b = false;
            }
        }
    }

    public final class C8479e implements AbstractC10312x.AbstractC10315c {
        public C8479e() {
        }

        @Override
        public void mo5484a() {
            C8474g0.this.m12356q0();
        }

        @Override
        public void mo5483b(List<C10245j0> list) {
            C8474g0.this.m12367k0((List) C1132h.m38325e(list));
        }
    }

    public enum EnumC8480f {
        INITIALIZED,
        PENDING_OPEN,
        OPENING,
        OPENED,
        CLOSING,
        REOPENING,
        RELEASING,
        RELEASED
    }

    public final class C8481g extends CameraDevice.StateCallback {
        public final Executor f27519a;
        public final ScheduledExecutorService f27520b;
        public RunnableC8483b f27521c;
        public ScheduledFuture<?> f27522d;
        public final C8482a f27523e = new C8482a();

        public class C8482a {
            public long f27525a = -1;

            public C8482a() {
            }

            public boolean m12337a() {
                if (!(m12336b() >= ((long) m12334d()))) {
                    return true;
                }
                m12333e();
                return false;
            }

            public long m12336b() {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.f27525a == -1) {
                    this.f27525a = uptimeMillis;
                }
                return uptimeMillis - this.f27525a;
            }

            public int m12335c() {
                if (!C8481g.this.m12338f()) {
                    return 700;
                }
                long b = m12336b();
                if (b <= 120000) {
                    return 1000;
                }
                return b <= 300000 ? 2000 : 4000;
            }

            public int m12334d() {
                return !C8481g.this.m12338f() ? 10000 : 1800000;
            }

            public void m12333e() {
                this.f27525a = -1L;
            }
        }

        public class RunnableC8483b implements Runnable {
            public Executor f27527a;
            public boolean f27528b = false;

            public RunnableC8483b(Executor executor) {
                this.f27527a = executor;
            }

            public void m12330c() {
                if (!this.f27528b) {
                    C1132h.m38323g(C8474g0.this.f27476N == EnumC8480f.REOPENING);
                    if (C8481g.this.m12338f()) {
                        C8474g0.this.m12360o0(true);
                    } else {
                        C8474g0.this.m12358p0(true);
                    }
                }
            }

            public void m12331b() {
                this.f27528b = true;
            }

            @Override
            public void run() {
                this.f27527a.execute(new Runnable() {
                    @Override
                    public final void run() {
                        C8474g0.C8481g.RunnableC8483b.this.m12330c();
                    }
                });
            }
        }

        public C8481g(Executor executor, ScheduledExecutorService scheduledExecutorService) {
            this.f27519a = executor;
            this.f27520b = scheduledExecutorService;
        }

        public boolean m12343a() {
            if (this.f27522d == null) {
                return false;
            }
            C8474g0 g0Var = C8474g0.this;
            g0Var.m12403E("Cancelling scheduled re-open: " + this.f27521c);
            this.f27521c.m12331b();
            this.f27521c = null;
            this.f27522d.cancel(false);
            this.f27522d = null;
            return true;
        }

        public final void m12342b(CameraDevice cameraDevice, int i) {
            boolean z = C8474g0.this.f27476N == EnumC8480f.OPENING || C8474g0.this.f27476N == EnumC8480f.OPENED || C8474g0.this.f27476N == EnumC8480f.REOPENING;
            C1132h.m38322h(z, "Attempt to handle open error from non open state: " + C8474g0.this.f27476N);
            if (i == 1 || i == 2 || i == 4) {
                C0662u1.m40656a("Camera2CameraImpl", String.format("Attempt to reopen camera[%s] after error[%s]", cameraDevice.getId(), C8474g0.m12399I(i)));
                m12341c(i);
                return;
            }
            C0662u1.m40654c("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + C8474g0.m12399I(i) + " closing camera.");
            C8474g0.this.m12369i0(EnumC8480f.CLOSING, AbstractC0658u.AbstractC0659a.m40660a(i == 3 ? 5 : 6));
            C8474g0.this.m12407A(false);
        }

        public final void m12341c(int i) {
            int i2 = 1;
            C1132h.m38322h(C8474g0.this.f27483U != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
            if (i == 1) {
                i2 = 2;
            } else if (i != 2) {
                i2 = 3;
            }
            C8474g0.this.m12369i0(EnumC8480f.REOPENING, AbstractC0658u.AbstractC0659a.m40660a(i2));
            C8474g0.this.m12407A(false);
        }

        public void m12340d() {
            this.f27523e.m12333e();
        }

        public void m12339e() {
            boolean z = true;
            C1132h.m38323g(this.f27521c == null);
            if (this.f27522d != null) {
                z = false;
            }
            C1132h.m38323g(z);
            if (this.f27523e.m12337a()) {
                this.f27521c = new RunnableC8483b(this.f27519a);
                C8474g0 g0Var = C8474g0.this;
                g0Var.m12403E("Attempting camera re-open in " + this.f27523e.m12335c() + "ms: " + this.f27521c + " activeResuming = " + C8474g0.this.f27501j0);
                this.f27522d = this.f27520b.schedule(this.f27521c, (long) this.f27523e.m12335c(), TimeUnit.MILLISECONDS);
                return;
            }
            C0662u1.m40654c("Camera2CameraImpl", "Camera reopening attempted for " + this.f27523e.m12334d() + "ms without success.");
            C8474g0.this.m12368j0(EnumC8480f.PENDING_OPEN, null, false);
        }

        public boolean m12338f() {
            int i;
            C8474g0 g0Var = C8474g0.this;
            return (!g0Var.f27501j0 || (i = g0Var.f27483U) == 4 || i == 2) ? false : true;
        }

        @Override
        public void onClosed(CameraDevice cameraDevice) {
            C8474g0.this.m12403E("CameraDevice.onClosed()");
            boolean z = C8474g0.this.f27482T == null;
            C1132h.m38322h(z, "Unexpected onClose callback on camera device: " + cameraDevice);
            int i = C8477c.f27505a[C8474g0.this.f27476N.ordinal()];
            if (i != 3) {
                if (i == 6) {
                    C8474g0 g0Var = C8474g0.this;
                    if (g0Var.f27483U != 0) {
                        g0Var.m12403E("Camera closed due to error: " + C8474g0.m12399I(C8474g0.this.f27483U));
                        m12339e();
                        return;
                    }
                    g0Var.m12358p0(false);
                    return;
                } else if (i != 7) {
                    throw new IllegalStateException("Camera closed while in state: " + C8474g0.this.f27476N);
                }
            }
            C1132h.m38323g(C8474g0.this.m12396L());
            C8474g0.this.m12400H();
        }

        @Override
        public void onDisconnected(CameraDevice cameraDevice) {
            C8474g0.this.m12403E("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        @Override
        public void onError(CameraDevice cameraDevice, int i) {
            C8474g0 g0Var = C8474g0.this;
            g0Var.f27482T = cameraDevice;
            g0Var.f27483U = i;
            int i2 = C8477c.f27505a[g0Var.f27476N.ordinal()];
            if (i2 != 3) {
                if (i2 == 4 || i2 == 5 || i2 == 6) {
                    C0662u1.m40656a("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", cameraDevice.getId(), C8474g0.m12399I(i), C8474g0.this.f27476N.name()));
                    m12342b(cameraDevice, i);
                    return;
                } else if (i2 != 7) {
                    throw new IllegalStateException("onError() should not be possible from state: " + C8474g0.this.f27476N);
                }
            }
            C0662u1.m40654c("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", cameraDevice.getId(), C8474g0.m12399I(i), C8474g0.this.f27476N.name()));
            C8474g0.this.m12407A(false);
        }

        @Override
        public void onOpened(CameraDevice cameraDevice) {
            C8474g0.this.m12403E("CameraDevice.onOpened()");
            C8474g0 g0Var = C8474g0.this;
            g0Var.f27482T = cameraDevice;
            g0Var.f27483U = 0;
            m12340d();
            int i = C8477c.f27505a[C8474g0.this.f27476N.ordinal()];
            if (i != 3) {
                if (i == 5 || i == 6) {
                    C8474g0.this.m12370h0(EnumC8480f.OPENED);
                    C8474g0.this.m12381a0();
                    return;
                } else if (i != 7) {
                    throw new IllegalStateException("onOpened() should not be possible from state: " + C8474g0.this.f27476N);
                }
            }
            C1132h.m38323g(C8474g0.this.m12396L());
            C8474g0.this.f27482T.close();
            C8474g0.this.f27482T = null;
        }
    }

    public static abstract class AbstractC8484h {
        public static AbstractC8484h m12329a(String str, Class<?> cls, C10200b2 b2Var, Size size) {
            return new C8442b(str, cls, b2Var, size);
        }

        public static AbstractC8484h m12328b(AbstractC0688y2 y2Var) {
            return m12329a(C8474g0.m12398J(y2Var), y2Var.getClass(), y2Var.m40577k(), y2Var.m40586b());
        }

        public abstract C10200b2 mo12327c();

        public abstract Size mo12326d();

        public abstract String mo12325e();

        public abstract Class<?> mo12324f();
    }

    public C8474g0(C8906m0 m0Var, String str, C8505j0 j0Var, C10222f0 f0Var, Executor executor, Handler handler) {
        C10263m1<AbstractC10208c0.EnumC10209a> m1Var = new C10263m1<>();
        this.f27477O = m1Var;
        this.f27491b = m0Var;
        this.f27490a0 = f0Var;
        ScheduledExecutorService e = C0003a.m42610e(handler);
        this.f27475M = e;
        Executor f = C0003a.m42609f(executor);
        this.f27493c = f;
        this.f27480R = new C8481g(f, e);
        this.f27489a = new C10258l2(str);
        m1Var.m5598g(AbstractC10208c0.EnumC10209a.CLOSED);
        C8500i1 i1Var = new C8500i1(f0Var);
        this.f27478P = i1Var;
        C8569t1 t1Var = new C8569t1(f);
        this.f27495d0 = t1Var;
        try {
            C8564t tVar = new C8564t(m0Var.m10978c(str), e, f, new C8479e(), j0Var.mo5774h());
            this.f27479Q = tVar;
            this.f27481S = j0Var;
            j0Var.m12255m(tVar);
            j0Var.m12252p(i1Var.m12304a());
            this.f27496e0 = new C8576u2.C8577a(f, e, handler, t1Var, j0Var.m12256l());
            C8478d dVar = new C8478d(str);
            this.f27488Z = dVar;
            f0Var.m5704e(this, f, dVar);
            m0Var.m10975f(f, dVar);
        } catch (C8887f e2) {
            throw C8507j1.m12248a(e2);
        }
    }

    public static String m12399I(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    public static String m12398J(AbstractC0688y2 y2Var) {
        return y2Var.m40579i() + y2Var.hashCode();
    }

    public void m12395M(List list) {
        try {
            m12364m0(list);
        } finally {
            this.f27479Q.m12112u();
        }
    }

    public static void m12394N(Surface surface, SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    public void m12391Q(String str, C10200b2 b2Var) {
        m12403E("Use case " + str + " ACTIVE");
        this.f27489a.m5615m(str, b2Var);
        this.f27489a.m5611q(str, b2Var);
        m12356q0();
    }

    public void m12390R(String str) {
        m12403E("Use case " + str + " INACTIVE");
        this.f27489a.m5612p(str);
        m12356q0();
    }

    public void m12389S(String str, C10200b2 b2Var) {
        m12403E("Use case " + str + " RESET");
        this.f27489a.m5611q(str, b2Var);
        m12371g0(false);
        m12356q0();
        if (this.f27476N == EnumC8480f.OPENED) {
            m12381a0();
        }
    }

    public void m12388T(String str, C10200b2 b2Var) {
        m12403E("Use case " + str + " UPDATED");
        this.f27489a.m5611q(str, b2Var);
        m12356q0();
    }

    public static void m12387U(C10200b2.AbstractC10203c cVar, C10200b2 b2Var) {
        cVar.mo5741a(b2Var, C10200b2.EnumC10205e.SESSION_ERROR_SURFACE_NEEDS_RESET);
    }

    public void m12386V(boolean z) {
        this.f27501j0 = z;
        if (!z) {
            return;
        }
        if (this.f27476N == EnumC8480f.PENDING_OPEN || this.f27476N == EnumC8480f.REOPENING) {
            m12360o0(false);
        }
    }

    public void m12407A(boolean z) {
        boolean z2 = this.f27476N == EnumC8480f.CLOSING || this.f27476N == EnumC8480f.RELEASING || (this.f27476N == EnumC8480f.REOPENING && this.f27483U != 0);
        C1132h.m38322h(z2, "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.f27476N + " (error: " + m12399I(this.f27483U) + ")");
        int i = Build.VERSION.SDK_INT;
        if (i <= 23 || i >= 29 || !m12397K() || this.f27483U != 0) {
            m12371g0(z);
        } else {
            m12405C(z);
        }
        this.f27484V.mo12163a();
    }

    public final void m12406B() {
        m12403E("Closing camera.");
        int i = C8477c.f27505a[this.f27476N.ordinal()];
        boolean z = false;
        if (i == 2) {
            if (this.f27482T == null) {
                z = true;
            }
            C1132h.m38323g(z);
            m12370h0(EnumC8480f.INITIALIZED);
        } else if (i == 4) {
            m12370h0(EnumC8480f.CLOSING);
            m12407A(false);
        } else if (i == 5 || i == 6) {
            boolean a = this.f27480R.m12343a();
            m12370h0(EnumC8480f.CLOSING);
            if (a) {
                C1132h.m38323g(m12396L());
                m12400H();
            }
        } else {
            m12403E("close() ignored due to being in state: " + this.f27476N);
        }
    }

    public final void m12405C(boolean z) {
        final C8549q1 q1Var = new C8549q1();
        this.f27492b0.add(q1Var);
        m12371g0(z);
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        final Surface surface = new Surface(surfaceTexture);
        final Runnable wVar = new Runnable() {
            @Override
            public final void run() {
                C8474g0.m12394N(surface, surfaceTexture);
            }
        };
        C10200b2.C10202b bVar = new C10200b2.C10202b();
        final C10237h1 h1Var = new C10237h1(surface);
        bVar.m5752h(h1Var);
        bVar.m5742r(1);
        m12403E("Start configAndClose.");
        q1Var.mo12157g(bVar.m5747m(), (CameraDevice) C1132h.m38325e(this.f27482T), this.f27496e0.m12051a()).mo13371a(new Runnable() {
            @Override
            public final void run() {
                C8474g0.this.m12393O(q1Var, h1Var, wVar);
            }
        }, this.f27493c);
    }

    public final CameraDevice.StateCallback m12404D() {
        ArrayList arrayList = new ArrayList(this.f27489a.m5623e().m5738b().m5768b());
        arrayList.add(this.f27495d0.m12092c());
        arrayList.add(this.f27480R);
        return C8485g1.m12323a(arrayList);
    }

    public void m12403E(String str) {
        m12402F(str, null);
    }

    public final void m12402F(String str, Throwable th) {
        C0662u1.m40655b("Camera2CameraImpl", String.format("{%s} %s", toString(), str), th);
    }

    public C10200b2 m12401G(AbstractC10287q0 q0Var) {
        for (C10200b2 b2Var : this.f27489a.m5622f()) {
            if (b2Var.m5761i().contains(q0Var)) {
                return b2Var;
            }
        }
        return null;
    }

    public void m12400H() {
        C1132h.m38323g(this.f27476N == EnumC8480f.RELEASING || this.f27476N == EnumC8480f.CLOSING);
        C1132h.m38323g(this.f27487Y.isEmpty());
        this.f27482T = null;
        if (this.f27476N == EnumC8480f.CLOSING) {
            m12370h0(EnumC8480f.INITIALIZED);
            return;
        }
        this.f27491b.m10974g(this.f27488Z);
        m12370h0(EnumC8480f.RELEASED);
        C6287c.C6288a<Void> aVar = this.f27486X;
        if (aVar != null) {
            aVar.m20717c(null);
            this.f27486X = null;
        }
    }

    public final boolean m12397K() {
        return ((C8505j0) mo5727l()).m12256l() == 2;
    }

    public boolean m12396L() {
        return this.f27487Y.isEmpty() && this.f27492b0.isEmpty();
    }

    public final AbstractC8558r1 m12385W() {
        synchronized (this.f27499h0) {
            if (this.f27500i0 == null) {
                return new C8549q1();
            }
            return new C8492h2(this.f27500i0, this.f27481S, this.f27493c, this.f27475M);
        }
    }

    public final void m12384X(List<AbstractC0688y2> list) {
        for (AbstractC0688y2 y2Var : list) {
            String J = m12398J(y2Var);
            if (!this.f27497f0.contains(J)) {
                this.f27497f0.add(J);
                y2Var.m40595B();
            }
        }
    }

    public final void m12383Y(List<AbstractC0688y2> list) {
        for (AbstractC0688y2 y2Var : list) {
            String J = m12398J(y2Var);
            if (this.f27497f0.contains(J)) {
                y2Var.mo40594C();
                this.f27497f0.remove(J);
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    public final void m12382Z(boolean z) {
        if (!z) {
            this.f27480R.m12340d();
        }
        this.f27480R.m12343a();
        m12403E("Opening camera.");
        m12370h0(EnumC8480f.OPENING);
        try {
            this.f27491b.m10976e(this.f27481S.mo5778a(), this.f27493c, m12404D());
        } catch (SecurityException e) {
            m12403E("Unable to open camera due to " + e.getMessage());
            m12370h0(EnumC8480f.REOPENING);
            this.f27480R.m12339e();
        } catch (C8887f e2) {
            m12403E("Unable to open camera due to " + e2.getMessage());
            if (e2.m11022d() == 10001) {
                m12369i0(EnumC8480f.INITIALIZED, AbstractC0658u.AbstractC0659a.m40659b(7, e2));
            }
        }
    }

    @Override
    public AbstractC0642r mo5734a() {
        return C10198b0.m5771b(this);
    }

    public void m12381a0() {
        C1132h.m38323g(this.f27476N == EnumC8480f.OPENED);
        C10200b2.C10206f e = this.f27489a.m5623e();
        if (!e.m5736d()) {
            m12403E("Unable to create capture session due to conflicting configurations");
        } else {
            C1111f.m38360b(this.f27484V.mo12157g(e.m5738b(), (CameraDevice) C1132h.m38325e(this.f27482T), this.f27496e0.m12051a()), new C8476b(), this.f27493c);
        }
    }

    @Override
    public AbstractC0615m mo12380b() {
        return C10198b0.m5772a(this);
    }

    public final void m12379b0() {
        int i = C8477c.f27505a[this.f27476N.ordinal()];
        boolean z = false;
        if (i == 1 || i == 2) {
            m12360o0(false);
        } else if (i != 3) {
            m12403E("open() ignored due to being in state: " + this.f27476N);
        } else {
            m12370h0(EnumC8480f.REOPENING);
            if (!m12396L() && this.f27483U == 0) {
                if (this.f27482T != null) {
                    z = true;
                }
                C1132h.m38322h(z, "Camera Device should be open if session close is not complete");
                m12370h0(EnumC8480f.OPENED);
                m12381a0();
            }
        }
    }

    @Override
    public void mo5733c(AbstractC10295s sVar) {
        if (sVar == null) {
            sVar = C10308w.m5498a();
        }
        AbstractC10211c2 s = sVar.mo5495s(null);
        this.f27498g0 = sVar;
        synchronized (this.f27499h0) {
            this.f27500i0 = s;
        }
    }

    public void m12378c0(final C10200b2 b2Var) {
        ScheduledExecutorService d = C0003a.m42611d();
        List<C10200b2.AbstractC10203c> c = b2Var.m5767c();
        if (!c.isEmpty()) {
            final C10200b2.AbstractC10203c cVar = c.get(0);
            m12402F("Posting surface closed", new Throwable());
            d.execute(new Runnable() {
                @Override
                public final void run() {
                    C8474g0.m12387U(C10200b2.AbstractC10203c.this, b2Var);
                }
            });
        }
    }

    @Override
    public void mo12377d(AbstractC0688y2 y2Var) {
        C1132h.m38325e(y2Var);
        final String J = m12398J(y2Var);
        final C10200b2 k = y2Var.m40577k();
        this.f27493c.execute(new Runnable() {
            @Override
            public final void run() {
                C8474g0.this.m12391Q(J, k);
            }
        });
    }

    public void m12393O(C8549q1 q1Var, AbstractC10287q0 q0Var, Runnable runnable) {
        this.f27492b0.remove(q1Var);
        AbstractFutureC1291a<Void> e0 = m12374e0(q1Var, false);
        q0Var.m5551c();
        C1111f.m38348n(Arrays.asList(e0, q0Var.m5545i())).mo13371a(runnable, C0003a.m42614a());
    }

    @Override
    public void mo12375e(AbstractC0688y2 y2Var) {
        C1132h.m38325e(y2Var);
        final String J = m12398J(y2Var);
        final C10200b2 k = y2Var.m40577k();
        this.f27493c.execute(new Runnable() {
            @Override
            public final void run() {
                C8474g0.this.m12389S(J, k);
            }
        });
    }

    public AbstractFutureC1291a<Void> m12374e0(AbstractC8558r1 r1Var, boolean z) {
        r1Var.close();
        AbstractFutureC1291a<Void> c = r1Var.mo12161c(z);
        m12403E("Releasing session in state " + this.f27476N.name());
        this.f27487Y.put(r1Var, c);
        C1111f.m38360b(c, new C8475a(r1Var), C0003a.m42614a());
        return c;
    }

    @Override
    public void mo12373f(AbstractC0688y2 y2Var) {
        C1132h.m38325e(y2Var);
        final String J = m12398J(y2Var);
        final C10200b2 k = y2Var.m40577k();
        this.f27493c.execute(new Runnable() {
            @Override
            public final void run() {
                C8474g0.this.m12388T(J, k);
            }
        });
    }

    public final void m12372f0() {
        if (this.f27494c0 != null) {
            C10258l2 l2Var = this.f27489a;
            l2Var.m5613o(this.f27494c0.m12439d() + this.f27494c0.hashCode());
            C10258l2 l2Var2 = this.f27489a;
            l2Var2.m5612p(this.f27494c0.m12439d() + this.f27494c0.hashCode());
            this.f27494c0.m12441b();
            this.f27494c0 = null;
        }
    }

    @Override
    public AbstractC10293r1<AbstractC10208c0.EnumC10209a> mo5732g() {
        return this.f27477O;
    }

    public void m12371g0(boolean z) {
        C1132h.m38323g(this.f27484V != null);
        m12403E("Resetting Capture Session");
        AbstractC8558r1 r1Var = this.f27484V;
        C10200b2 f = r1Var.mo12158f();
        List<C10245j0> d = r1Var.mo12160d();
        AbstractC8558r1 W = m12385W();
        this.f27484V = W;
        W.mo12162b(f);
        this.f27484V.mo12159e(d);
        m12374e0(r1Var, z);
    }

    @Override
    public AbstractC10312x mo5731h() {
        return this.f27479Q;
    }

    public void m12370h0(EnumC8480f fVar) {
        m12369i0(fVar, null);
    }

    @Override
    public void mo5730i(final boolean z) {
        this.f27493c.execute(new Runnable() {
            @Override
            public final void run() {
                C8474g0.this.m12386V(z);
            }
        });
    }

    public void m12369i0(EnumC8480f fVar, AbstractC0658u.AbstractC0659a aVar) {
        m12368j0(fVar, aVar, true);
    }

    @Override
    public void mo5729j(Collection<AbstractC0688y2> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (!arrayList.isEmpty()) {
            this.f27479Q.m12150G();
            m12384X(new ArrayList(arrayList));
            final ArrayList arrayList2 = new ArrayList(m12366l0(arrayList));
            try {
                this.f27493c.execute(new Runnable() {
                    @Override
                    public final void run() {
                        C8474g0.this.m12395M(arrayList2);
                    }
                });
            } catch (RejectedExecutionException e) {
                m12402F("Unable to attach use cases.", e);
                this.f27479Q.m12112u();
            }
        }
    }

    public void m12368j0(EnumC8480f fVar, AbstractC0658u.AbstractC0659a aVar, boolean z) {
        AbstractC10208c0.EnumC10209a aVar2;
        m12403E("Transitioning camera internal state: " + this.f27476N + " --> " + fVar);
        this.f27476N = fVar;
        switch (C8477c.f27505a[fVar.ordinal()]) {
            case 1:
                aVar2 = AbstractC10208c0.EnumC10209a.CLOSED;
                break;
            case 2:
                aVar2 = AbstractC10208c0.EnumC10209a.PENDING_OPEN;
                break;
            case 3:
                aVar2 = AbstractC10208c0.EnumC10209a.CLOSING;
                break;
            case 4:
                aVar2 = AbstractC10208c0.EnumC10209a.OPEN;
                break;
            case 5:
            case 6:
                aVar2 = AbstractC10208c0.EnumC10209a.OPENING;
                break;
            case 7:
                aVar2 = AbstractC10208c0.EnumC10209a.RELEASING;
                break;
            case 8:
                aVar2 = AbstractC10208c0.EnumC10209a.RELEASED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + fVar);
        }
        this.f27490a0.m5706c(this, aVar2, z);
        this.f27477O.m5598g(aVar2);
        this.f27478P.m12302c(aVar2, aVar);
    }

    @Override
    public void mo5728k(Collection<AbstractC0688y2> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (!arrayList.isEmpty()) {
            final ArrayList arrayList2 = new ArrayList(m12366l0(arrayList));
            m12383Y(new ArrayList(arrayList));
            this.f27493c.execute(new Runnable() {
                @Override
                public final void run() {
                    C8474g0.this.m12392P(arrayList2);
                }
            });
        }
    }

    public void m12367k0(List<C10245j0> list) {
        ArrayList arrayList = new ArrayList();
        for (C10245j0 j0Var : list) {
            C10245j0.C10246a k = C10245j0.C10246a.m5639k(j0Var);
            if (!j0Var.m5653d().isEmpty() || !j0Var.m5650g() || m12347z(k)) {
                arrayList.add(k.m5642h());
            }
        }
        m12403E("Issue capture request");
        this.f27484V.mo12159e(arrayList);
    }

    @Override
    public AbstractC10194a0 mo5727l() {
        return this.f27481S;
    }

    public final Collection<AbstractC8484h> m12366l0(Collection<AbstractC0688y2> collection) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC0688y2 y2Var : collection) {
            arrayList.add(AbstractC8484h.m12328b(y2Var));
        }
        return arrayList;
    }

    @Override
    public void mo12365m(AbstractC0688y2 y2Var) {
        C1132h.m38325e(y2Var);
        final String J = m12398J(y2Var);
        this.f27493c.execute(new Runnable() {
            @Override
            public final void run() {
                C8474g0.this.m12390R(J);
            }
        });
    }

    public final void m12364m0(Collection<AbstractC8484h> collection) {
        Size d;
        boolean isEmpty = this.f27489a.m5622f().isEmpty();
        ArrayList arrayList = new ArrayList();
        Rational rational = null;
        for (AbstractC8484h hVar : collection) {
            if (!this.f27489a.m5619i(hVar.mo12325e())) {
                this.f27489a.m5614n(hVar.mo12325e(), hVar.mo12327c());
                arrayList.add(hVar.mo12325e());
                if (hVar.mo12324f() == C0519c2.class && (d = hVar.mo12326d()) != null) {
                    rational = new Rational(d.getWidth(), d.getHeight());
                }
            }
        }
        if (!arrayList.isEmpty()) {
            m12403E("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED");
            if (isEmpty) {
                this.f27479Q.m12132Y(true);
                this.f27479Q.m12150G();
            }
            m12348y();
            m12356q0();
            m12371g0(false);
            if (this.f27476N == EnumC8480f.OPENED) {
                m12381a0();
            } else {
                m12379b0();
            }
            if (rational != null) {
                this.f27479Q.m12131Z(rational);
            }
        }
    }

    public final void m12392P(Collection<AbstractC8484h> collection) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (AbstractC8484h hVar : collection) {
            if (this.f27489a.m5619i(hVar.mo12325e())) {
                this.f27489a.m5616l(hVar.mo12325e());
                arrayList.add(hVar.mo12325e());
                if (hVar.mo12324f() == C0519c2.class) {
                    z = true;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            m12403E("Use cases [" + TextUtils.join(", ", arrayList) + "] now DETACHED for camera");
            if (z) {
                this.f27479Q.m12131Z(null);
            }
            m12348y();
            if (this.f27489a.m5622f().isEmpty()) {
                this.f27479Q.m12112u();
                m12371g0(false);
                this.f27479Q.m12132Y(false);
                this.f27484V = m12385W();
                m12406B();
                return;
            }
            m12356q0();
            m12371g0(false);
            if (this.f27476N == EnumC8480f.OPENED) {
                m12381a0();
            }
        }
    }

    public void m12360o0(boolean z) {
        m12403E("Attempting to force open the camera.");
        if (!this.f27490a0.m5703f(this)) {
            m12403E("No cameras available. Waiting for available camera before opening camera.");
            m12370h0(EnumC8480f.PENDING_OPEN);
            return;
        }
        m12382Z(z);
    }

    public void m12358p0(boolean z) {
        m12403E("Attempting to open the camera.");
        if (!(this.f27488Z.m12344b() && this.f27490a0.m5703f(this))) {
            m12403E("No cameras available. Waiting for available camera before opening camera.");
            m12370h0(EnumC8480f.PENDING_OPEN);
            return;
        }
        m12382Z(z);
    }

    public void m12356q0() {
        C10200b2.C10206f c = this.f27489a.m5625c();
        if (c.m5736d()) {
            this.f27479Q.m12130a0(c.m5738b().m5760j());
            c.m5739a(this.f27479Q.m12108y());
            this.f27484V.mo12162b(c.m5738b());
            return;
        }
        this.f27479Q.m12133X();
        this.f27484V.mo12162b(this.f27479Q.m12108y());
    }

    public String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f27481S.mo5778a());
    }

    public final void m12349x() {
        if (this.f27494c0 != null) {
            C10258l2 l2Var = this.f27489a;
            l2Var.m5614n(this.f27494c0.m12439d() + this.f27494c0.hashCode(), this.f27494c0.m12438e());
            C10258l2 l2Var2 = this.f27489a;
            l2Var2.m5615m(this.f27494c0.m12439d() + this.f27494c0.hashCode(), this.f27494c0.m12438e());
        }
    }

    public final void m12348y() {
        C10200b2 b = this.f27489a.m5623e().m5738b();
        C10245j0 f = b.m5764f();
        int size = f.m5653d().size();
        int size2 = b.m5761i().size();
        if (b.m5761i().isEmpty()) {
            return;
        }
        if (f.m5653d().isEmpty()) {
            if (this.f27494c0 == null) {
                this.f27494c0 = new C8450c2(this.f27481S.m12258j());
            }
            m12349x();
        } else if (size2 == 1 && size == 1) {
            m12372f0();
        } else if (size >= 2) {
            m12372f0();
        } else {
            C0662u1.m40656a("Camera2CameraImpl", "mMeteringRepeating is ATTACHED, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
        }
    }

    public final boolean m12347z(C10245j0.C10246a aVar) {
        if (!aVar.m5638l().isEmpty()) {
            C0662u1.m40646k("Camera2CameraImpl", "The capture config builder already has surface inside.");
            return false;
        }
        for (C10200b2 b2Var : this.f27489a.m5624d()) {
            List<AbstractC10287q0> d = b2Var.m5764f().m5653d();
            if (!d.isEmpty()) {
                for (AbstractC10287q0 q0Var : d) {
                    aVar.m5644f(q0Var);
                }
            }
        }
        if (!aVar.m5638l().isEmpty()) {
            return true;
        }
        C0662u1.m40646k("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
        return false;
    }
}
