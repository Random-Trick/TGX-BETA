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
    public final ScheduledExecutorService f27472M;
    public final C10263m1<AbstractC10208c0.EnumC10209a> f27474O;
    public final C8500i1 f27475P;
    public final C8564t f27476Q;
    public final C8481g f27477R;
    public final C8505j0 f27478S;
    public CameraDevice f27479T;
    public C6287c.C6288a<Void> f27483X;
    public final C8478d f27485Z;
    public final C10258l2 f27486a;
    public final C10222f0 f27487a0;
    public final C8906m0 f27488b;
    public final Executor f27490c;
    public C8450c2 f27491c0;
    public final C8569t1 f27492d0;
    public final C8576u2.C8577a f27493e0;
    public AbstractC10295s f27495g0;
    public AbstractC10211c2 f27497i0;
    public volatile EnumC8480f f27473N = EnumC8480f.INITIALIZED;
    public int f27480U = 0;
    public final AtomicInteger f27482W = new AtomicInteger(0);
    public final Map<AbstractC8558r1, AbstractFutureC1291a<Void>> f27484Y = new LinkedHashMap();
    public final Set<C8549q1> f27489b0 = new HashSet();
    public final Set<String> f27494f0 = new HashSet();
    public final Object f27496h0 = new Object();
    public boolean f27498j0 = false;
    public AbstractC8558r1 f27481V = m12386W();

    public class C8475a implements AbstractC1107c<Void> {
        public final AbstractC8558r1 f27499a;

        public C8475a(AbstractC8558r1 r1Var) {
            this.f27499a = r1Var;
        }

        @Override
        public void mo5502b(Throwable th) {
        }

        public void mo5503a(Void r2) {
            CameraDevice cameraDevice;
            C8474g0.this.f27484Y.remove(this.f27499a);
            int i = C8477c.f27502a[C8474g0.this.f27473N.ordinal()];
            if (i != 3) {
                if (i != 6) {
                    if (i != 7) {
                        return;
                    }
                } else if (C8474g0.this.f27480U == 0) {
                    return;
                }
            }
            if (C8474g0.this.m12397L() && (cameraDevice = C8474g0.this.f27479T) != null) {
                C8875a.m11042a(cameraDevice);
                C8474g0.this.f27479T = null;
            }
        }
    }

    public class C8476b implements AbstractC1107c<Void> {
        public C8476b() {
        }

        @Override
        public void mo5502b(Throwable th) {
            if (th instanceof AbstractC10287q0.C10288a) {
                C10200b2 G = C8474g0.this.m12402G(((AbstractC10287q0.C10288a) th).m5538a());
                if (G != null) {
                    C8474g0.this.m12379c0(G);
                }
            } else if (th instanceof CancellationException) {
                C8474g0.this.m12404E("Unable to configure camera cancelled");
            } else {
                EnumC8480f fVar = C8474g0.this.f27473N;
                EnumC8480f fVar2 = EnumC8480f.OPENED;
                if (fVar == fVar2) {
                    C8474g0.this.m12370i0(fVar2, AbstractC0658u.AbstractC0659a.m40656b(4, th));
                }
                if (th instanceof CameraAccessException) {
                    C8474g0 g0Var = C8474g0.this;
                    g0Var.m12404E("Unable to configure camera due to " + th.getMessage());
                } else if (th instanceof TimeoutException) {
                    C0662u1.m40651c("Camera2CameraImpl", "Unable to configure camera " + C8474g0.this.f27478S.mo5778a() + ", timeout!");
                }
            }
        }

        public void mo5503a(Void r1) {
        }
    }

    public static class C8477c {
        public static final int[] f27502a;

        static {
            int[] iArr = new int[EnumC8480f.values().length];
            f27502a = iArr;
            try {
                iArr[EnumC8480f.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27502a[EnumC8480f.PENDING_OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27502a[EnumC8480f.CLOSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27502a[EnumC8480f.OPENED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27502a[EnumC8480f.OPENING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27502a[EnumC8480f.REOPENING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27502a[EnumC8480f.RELEASING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f27502a[EnumC8480f.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public final class C8478d extends CameraManager.AvailabilityCallback implements C10222f0.AbstractC10224b {
        public final String f27503a;
        public boolean f27504b = true;

        public C8478d(String str) {
            this.f27503a = str;
        }

        @Override
        public void mo5697a() {
            if (C8474g0.this.f27473N == EnumC8480f.PENDING_OPEN) {
                C8474g0.this.m12359p0(false);
            }
        }

        public boolean m12345b() {
            return this.f27504b;
        }

        @Override
        public void onCameraAvailable(String str) {
            if (this.f27503a.equals(str)) {
                this.f27504b = true;
                if (C8474g0.this.f27473N == EnumC8480f.PENDING_OPEN) {
                    C8474g0.this.m12359p0(false);
                }
            }
        }

        @Override
        public void onCameraUnavailable(String str) {
            if (this.f27503a.equals(str)) {
                this.f27504b = false;
            }
        }
    }

    public final class C8479e implements AbstractC10312x.AbstractC10315c {
        public C8479e() {
        }

        @Override
        public void mo5484a() {
            C8474g0.this.m12357q0();
        }

        @Override
        public void mo5483b(List<C10245j0> list) {
            C8474g0.this.m12368k0((List) C1132h.m38322e(list));
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
        public final Executor f27516a;
        public final ScheduledExecutorService f27517b;
        public RunnableC8483b f27518c;
        public ScheduledFuture<?> f27519d;
        public final C8482a f27520e = new C8482a();

        public class C8482a {
            public long f27522a = -1;

            public C8482a() {
            }

            public boolean m12338a() {
                if (!(m12337b() >= ((long) m12335d()))) {
                    return true;
                }
                m12334e();
                return false;
            }

            public long m12337b() {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.f27522a == -1) {
                    this.f27522a = uptimeMillis;
                }
                return uptimeMillis - this.f27522a;
            }

            public int m12336c() {
                if (!C8481g.this.m12339f()) {
                    return 700;
                }
                long b = m12337b();
                if (b <= 120000) {
                    return 1000;
                }
                return b <= 300000 ? 2000 : 4000;
            }

            public int m12335d() {
                return !C8481g.this.m12339f() ? 10000 : 1800000;
            }

            public void m12334e() {
                this.f27522a = -1L;
            }
        }

        public class RunnableC8483b implements Runnable {
            public Executor f27524a;
            public boolean f27525b = false;

            public RunnableC8483b(Executor executor) {
                this.f27524a = executor;
            }

            public void m12331c() {
                if (!this.f27525b) {
                    C1132h.m38320g(C8474g0.this.f27473N == EnumC8480f.REOPENING);
                    if (C8481g.this.m12339f()) {
                        C8474g0.this.m12361o0(true);
                    } else {
                        C8474g0.this.m12359p0(true);
                    }
                }
            }

            public void m12332b() {
                this.f27525b = true;
            }

            @Override
            public void run() {
                this.f27524a.execute(new Runnable() {
                    @Override
                    public final void run() {
                        C8474g0.C8481g.RunnableC8483b.this.m12331c();
                    }
                });
            }
        }

        public C8481g(Executor executor, ScheduledExecutorService scheduledExecutorService) {
            this.f27516a = executor;
            this.f27517b = scheduledExecutorService;
        }

        public boolean m12344a() {
            if (this.f27519d == null) {
                return false;
            }
            C8474g0 g0Var = C8474g0.this;
            g0Var.m12404E("Cancelling scheduled re-open: " + this.f27518c);
            this.f27518c.m12332b();
            this.f27518c = null;
            this.f27519d.cancel(false);
            this.f27519d = null;
            return true;
        }

        public final void m12343b(CameraDevice cameraDevice, int i) {
            boolean z = C8474g0.this.f27473N == EnumC8480f.OPENING || C8474g0.this.f27473N == EnumC8480f.OPENED || C8474g0.this.f27473N == EnumC8480f.REOPENING;
            C1132h.m38319h(z, "Attempt to handle open error from non open state: " + C8474g0.this.f27473N);
            if (i == 1 || i == 2 || i == 4) {
                C0662u1.m40653a("Camera2CameraImpl", String.format("Attempt to reopen camera[%s] after error[%s]", cameraDevice.getId(), C8474g0.m12400I(i)));
                m12342c(i);
                return;
            }
            C0662u1.m40651c("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + C8474g0.m12400I(i) + " closing camera.");
            C8474g0.this.m12370i0(EnumC8480f.CLOSING, AbstractC0658u.AbstractC0659a.m40657a(i == 3 ? 5 : 6));
            C8474g0.this.m12408A(false);
        }

        public final void m12342c(int i) {
            int i2 = 1;
            C1132h.m38319h(C8474g0.this.f27480U != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
            if (i == 1) {
                i2 = 2;
            } else if (i != 2) {
                i2 = 3;
            }
            C8474g0.this.m12370i0(EnumC8480f.REOPENING, AbstractC0658u.AbstractC0659a.m40657a(i2));
            C8474g0.this.m12408A(false);
        }

        public void m12341d() {
            this.f27520e.m12334e();
        }

        public void m12340e() {
            boolean z = true;
            C1132h.m38320g(this.f27518c == null);
            if (this.f27519d != null) {
                z = false;
            }
            C1132h.m38320g(z);
            if (this.f27520e.m12338a()) {
                this.f27518c = new RunnableC8483b(this.f27516a);
                C8474g0 g0Var = C8474g0.this;
                g0Var.m12404E("Attempting camera re-open in " + this.f27520e.m12336c() + "ms: " + this.f27518c + " activeResuming = " + C8474g0.this.f27498j0);
                this.f27519d = this.f27517b.schedule(this.f27518c, (long) this.f27520e.m12336c(), TimeUnit.MILLISECONDS);
                return;
            }
            C0662u1.m40651c("Camera2CameraImpl", "Camera reopening attempted for " + this.f27520e.m12335d() + "ms without success.");
            C8474g0.this.m12369j0(EnumC8480f.PENDING_OPEN, null, false);
        }

        public boolean m12339f() {
            int i;
            C8474g0 g0Var = C8474g0.this;
            return (!g0Var.f27498j0 || (i = g0Var.f27480U) == 4 || i == 2) ? false : true;
        }

        @Override
        public void onClosed(CameraDevice cameraDevice) {
            C8474g0.this.m12404E("CameraDevice.onClosed()");
            boolean z = C8474g0.this.f27479T == null;
            C1132h.m38319h(z, "Unexpected onClose callback on camera device: " + cameraDevice);
            int i = C8477c.f27502a[C8474g0.this.f27473N.ordinal()];
            if (i != 3) {
                if (i == 6) {
                    C8474g0 g0Var = C8474g0.this;
                    if (g0Var.f27480U != 0) {
                        g0Var.m12404E("Camera closed due to error: " + C8474g0.m12400I(C8474g0.this.f27480U));
                        m12340e();
                        return;
                    }
                    g0Var.m12359p0(false);
                    return;
                } else if (i != 7) {
                    throw new IllegalStateException("Camera closed while in state: " + C8474g0.this.f27473N);
                }
            }
            C1132h.m38320g(C8474g0.this.m12397L());
            C8474g0.this.m12401H();
        }

        @Override
        public void onDisconnected(CameraDevice cameraDevice) {
            C8474g0.this.m12404E("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        @Override
        public void onError(CameraDevice cameraDevice, int i) {
            C8474g0 g0Var = C8474g0.this;
            g0Var.f27479T = cameraDevice;
            g0Var.f27480U = i;
            int i2 = C8477c.f27502a[g0Var.f27473N.ordinal()];
            if (i2 != 3) {
                if (i2 == 4 || i2 == 5 || i2 == 6) {
                    C0662u1.m40653a("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", cameraDevice.getId(), C8474g0.m12400I(i), C8474g0.this.f27473N.name()));
                    m12343b(cameraDevice, i);
                    return;
                } else if (i2 != 7) {
                    throw new IllegalStateException("onError() should not be possible from state: " + C8474g0.this.f27473N);
                }
            }
            C0662u1.m40651c("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", cameraDevice.getId(), C8474g0.m12400I(i), C8474g0.this.f27473N.name()));
            C8474g0.this.m12408A(false);
        }

        @Override
        public void onOpened(CameraDevice cameraDevice) {
            C8474g0.this.m12404E("CameraDevice.onOpened()");
            C8474g0 g0Var = C8474g0.this;
            g0Var.f27479T = cameraDevice;
            g0Var.f27480U = 0;
            m12341d();
            int i = C8477c.f27502a[C8474g0.this.f27473N.ordinal()];
            if (i != 3) {
                if (i == 5 || i == 6) {
                    C8474g0.this.m12371h0(EnumC8480f.OPENED);
                    C8474g0.this.m12382a0();
                    return;
                } else if (i != 7) {
                    throw new IllegalStateException("onOpened() should not be possible from state: " + C8474g0.this.f27473N);
                }
            }
            C1132h.m38320g(C8474g0.this.m12397L());
            C8474g0.this.f27479T.close();
            C8474g0.this.f27479T = null;
        }
    }

    public static abstract class AbstractC8484h {
        public static AbstractC8484h m12330a(String str, Class<?> cls, C10200b2 b2Var, Size size) {
            return new C8442b(str, cls, b2Var, size);
        }

        public static AbstractC8484h m12329b(AbstractC0688y2 y2Var) {
            return m12330a(C8474g0.m12399J(y2Var), y2Var.getClass(), y2Var.m40574k(), y2Var.m40583b());
        }

        public abstract C10200b2 mo12328c();

        public abstract Size mo12327d();

        public abstract String mo12326e();

        public abstract Class<?> mo12325f();
    }

    public C8474g0(C8906m0 m0Var, String str, C8505j0 j0Var, C10222f0 f0Var, Executor executor, Handler handler) {
        C10263m1<AbstractC10208c0.EnumC10209a> m1Var = new C10263m1<>();
        this.f27474O = m1Var;
        this.f27488b = m0Var;
        this.f27487a0 = f0Var;
        ScheduledExecutorService e = C0003a.m42607e(handler);
        this.f27472M = e;
        Executor f = C0003a.m42606f(executor);
        this.f27490c = f;
        this.f27477R = new C8481g(f, e);
        this.f27486a = new C10258l2(str);
        m1Var.m5598g(AbstractC10208c0.EnumC10209a.CLOSED);
        C8500i1 i1Var = new C8500i1(f0Var);
        this.f27475P = i1Var;
        C8569t1 t1Var = new C8569t1(f);
        this.f27492d0 = t1Var;
        try {
            C8564t tVar = new C8564t(m0Var.m10979c(str), e, f, new C8479e(), j0Var.mo5774h());
            this.f27476Q = tVar;
            this.f27478S = j0Var;
            j0Var.m12256m(tVar);
            j0Var.m12253p(i1Var.m12305a());
            this.f27493e0 = new C8576u2.C8577a(f, e, handler, t1Var, j0Var.m12257l());
            C8478d dVar = new C8478d(str);
            this.f27485Z = dVar;
            f0Var.m5704e(this, f, dVar);
            m0Var.m10976f(f, dVar);
        } catch (C8887f e2) {
            throw C8507j1.m12249a(e2);
        }
    }

    public static String m12400I(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    public static String m12399J(AbstractC0688y2 y2Var) {
        return y2Var.m40576i() + y2Var.hashCode();
    }

    public void m12396M(List list) {
        try {
            m12365m0(list);
        } finally {
            this.f27476Q.m12113u();
        }
    }

    public static void m12395N(Surface surface, SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    public void m12392Q(String str, C10200b2 b2Var) {
        m12404E("Use case " + str + " ACTIVE");
        this.f27486a.m5615m(str, b2Var);
        this.f27486a.m5611q(str, b2Var);
        m12357q0();
    }

    public void m12391R(String str) {
        m12404E("Use case " + str + " INACTIVE");
        this.f27486a.m5612p(str);
        m12357q0();
    }

    public void m12390S(String str, C10200b2 b2Var) {
        m12404E("Use case " + str + " RESET");
        this.f27486a.m5611q(str, b2Var);
        m12372g0(false);
        m12357q0();
        if (this.f27473N == EnumC8480f.OPENED) {
            m12382a0();
        }
    }

    public void m12389T(String str, C10200b2 b2Var) {
        m12404E("Use case " + str + " UPDATED");
        this.f27486a.m5611q(str, b2Var);
        m12357q0();
    }

    public static void m12388U(C10200b2.AbstractC10203c cVar, C10200b2 b2Var) {
        cVar.mo5741a(b2Var, C10200b2.EnumC10205e.SESSION_ERROR_SURFACE_NEEDS_RESET);
    }

    public void m12387V(boolean z) {
        this.f27498j0 = z;
        if (!z) {
            return;
        }
        if (this.f27473N == EnumC8480f.PENDING_OPEN || this.f27473N == EnumC8480f.REOPENING) {
            m12361o0(false);
        }
    }

    public void m12408A(boolean z) {
        boolean z2 = this.f27473N == EnumC8480f.CLOSING || this.f27473N == EnumC8480f.RELEASING || (this.f27473N == EnumC8480f.REOPENING && this.f27480U != 0);
        C1132h.m38319h(z2, "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.f27473N + " (error: " + m12400I(this.f27480U) + ")");
        int i = Build.VERSION.SDK_INT;
        if (i <= 23 || i >= 29 || !m12398K() || this.f27480U != 0) {
            m12372g0(z);
        } else {
            m12406C(z);
        }
        this.f27481V.mo12164a();
    }

    public final void m12407B() {
        m12404E("Closing camera.");
        int i = C8477c.f27502a[this.f27473N.ordinal()];
        boolean z = false;
        if (i == 2) {
            if (this.f27479T == null) {
                z = true;
            }
            C1132h.m38320g(z);
            m12371h0(EnumC8480f.INITIALIZED);
        } else if (i == 4) {
            m12371h0(EnumC8480f.CLOSING);
            m12408A(false);
        } else if (i == 5 || i == 6) {
            boolean a = this.f27477R.m12344a();
            m12371h0(EnumC8480f.CLOSING);
            if (a) {
                C1132h.m38320g(m12397L());
                m12401H();
            }
        } else {
            m12404E("close() ignored due to being in state: " + this.f27473N);
        }
    }

    public final void m12406C(boolean z) {
        final C8549q1 q1Var = new C8549q1();
        this.f27489b0.add(q1Var);
        m12372g0(z);
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        final Surface surface = new Surface(surfaceTexture);
        final Runnable wVar = new Runnable() {
            @Override
            public final void run() {
                C8474g0.m12395N(surface, surfaceTexture);
            }
        };
        C10200b2.C10202b bVar = new C10200b2.C10202b();
        final C10237h1 h1Var = new C10237h1(surface);
        bVar.m5752h(h1Var);
        bVar.m5742r(1);
        m12404E("Start configAndClose.");
        q1Var.mo12158g(bVar.m5747m(), (CameraDevice) C1132h.m38322e(this.f27479T), this.f27493e0.m12052a()).mo13372a(new Runnable() {
            @Override
            public final void run() {
                C8474g0.this.m12394O(q1Var, h1Var, wVar);
            }
        }, this.f27490c);
    }

    public final CameraDevice.StateCallback m12405D() {
        ArrayList arrayList = new ArrayList(this.f27486a.m5623e().m5738b().m5768b());
        arrayList.add(this.f27492d0.m12093c());
        arrayList.add(this.f27477R);
        return C8485g1.m12324a(arrayList);
    }

    public void m12404E(String str) {
        m12403F(str, null);
    }

    public final void m12403F(String str, Throwable th) {
        C0662u1.m40652b("Camera2CameraImpl", String.format("{%s} %s", toString(), str), th);
    }

    public C10200b2 m12402G(AbstractC10287q0 q0Var) {
        for (C10200b2 b2Var : this.f27486a.m5622f()) {
            if (b2Var.m5761i().contains(q0Var)) {
                return b2Var;
            }
        }
        return null;
    }

    public void m12401H() {
        C1132h.m38320g(this.f27473N == EnumC8480f.RELEASING || this.f27473N == EnumC8480f.CLOSING);
        C1132h.m38320g(this.f27484Y.isEmpty());
        this.f27479T = null;
        if (this.f27473N == EnumC8480f.CLOSING) {
            m12371h0(EnumC8480f.INITIALIZED);
            return;
        }
        this.f27488b.m10975g(this.f27485Z);
        m12371h0(EnumC8480f.RELEASED);
        C6287c.C6288a<Void> aVar = this.f27483X;
        if (aVar != null) {
            aVar.m20716c(null);
            this.f27483X = null;
        }
    }

    public final boolean m12398K() {
        return ((C8505j0) mo5727l()).m12257l() == 2;
    }

    public boolean m12397L() {
        return this.f27484Y.isEmpty() && this.f27489b0.isEmpty();
    }

    public final AbstractC8558r1 m12386W() {
        synchronized (this.f27496h0) {
            if (this.f27497i0 == null) {
                return new C8549q1();
            }
            return new C8492h2(this.f27497i0, this.f27478S, this.f27490c, this.f27472M);
        }
    }

    public final void m12385X(List<AbstractC0688y2> list) {
        for (AbstractC0688y2 y2Var : list) {
            String J = m12399J(y2Var);
            if (!this.f27494f0.contains(J)) {
                this.f27494f0.add(J);
                y2Var.m40592B();
            }
        }
    }

    public final void m12384Y(List<AbstractC0688y2> list) {
        for (AbstractC0688y2 y2Var : list) {
            String J = m12399J(y2Var);
            if (this.f27494f0.contains(J)) {
                y2Var.mo40591C();
                this.f27494f0.remove(J);
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    public final void m12383Z(boolean z) {
        if (!z) {
            this.f27477R.m12341d();
        }
        this.f27477R.m12344a();
        m12404E("Opening camera.");
        m12371h0(EnumC8480f.OPENING);
        try {
            this.f27488b.m10977e(this.f27478S.mo5778a(), this.f27490c, m12405D());
        } catch (SecurityException e) {
            m12404E("Unable to open camera due to " + e.getMessage());
            m12371h0(EnumC8480f.REOPENING);
            this.f27477R.m12340e();
        } catch (C8887f e2) {
            m12404E("Unable to open camera due to " + e2.getMessage());
            if (e2.m11023d() == 10001) {
                m12370i0(EnumC8480f.INITIALIZED, AbstractC0658u.AbstractC0659a.m40656b(7, e2));
            }
        }
    }

    @Override
    public AbstractC0642r mo5734a() {
        return C10198b0.m5771b(this);
    }

    public void m12382a0() {
        C1132h.m38320g(this.f27473N == EnumC8480f.OPENED);
        C10200b2.C10206f e = this.f27486a.m5623e();
        if (!e.m5736d()) {
            m12404E("Unable to create capture session due to conflicting configurations");
        } else {
            C1111f.m38357b(this.f27481V.mo12158g(e.m5738b(), (CameraDevice) C1132h.m38322e(this.f27479T), this.f27493e0.m12052a()), new C8476b(), this.f27490c);
        }
    }

    @Override
    public AbstractC0615m mo12381b() {
        return C10198b0.m5772a(this);
    }

    public final void m12380b0() {
        int i = C8477c.f27502a[this.f27473N.ordinal()];
        boolean z = false;
        if (i == 1 || i == 2) {
            m12361o0(false);
        } else if (i != 3) {
            m12404E("open() ignored due to being in state: " + this.f27473N);
        } else {
            m12371h0(EnumC8480f.REOPENING);
            if (!m12397L() && this.f27480U == 0) {
                if (this.f27479T != null) {
                    z = true;
                }
                C1132h.m38319h(z, "Camera Device should be open if session close is not complete");
                m12371h0(EnumC8480f.OPENED);
                m12382a0();
            }
        }
    }

    @Override
    public void mo5733c(AbstractC10295s sVar) {
        if (sVar == null) {
            sVar = C10308w.m5498a();
        }
        AbstractC10211c2 s = sVar.mo5495s(null);
        this.f27495g0 = sVar;
        synchronized (this.f27496h0) {
            this.f27497i0 = s;
        }
    }

    public void m12379c0(final C10200b2 b2Var) {
        ScheduledExecutorService d = C0003a.m42608d();
        List<C10200b2.AbstractC10203c> c = b2Var.m5767c();
        if (!c.isEmpty()) {
            final C10200b2.AbstractC10203c cVar = c.get(0);
            m12403F("Posting surface closed", new Throwable());
            d.execute(new Runnable() {
                @Override
                public final void run() {
                    C8474g0.m12388U(C10200b2.AbstractC10203c.this, b2Var);
                }
            });
        }
    }

    @Override
    public void mo12378d(AbstractC0688y2 y2Var) {
        C1132h.m38322e(y2Var);
        final String J = m12399J(y2Var);
        final C10200b2 k = y2Var.m40574k();
        this.f27490c.execute(new Runnable() {
            @Override
            public final void run() {
                C8474g0.this.m12392Q(J, k);
            }
        });
    }

    public void m12394O(C8549q1 q1Var, AbstractC10287q0 q0Var, Runnable runnable) {
        this.f27489b0.remove(q1Var);
        AbstractFutureC1291a<Void> e0 = m12375e0(q1Var, false);
        q0Var.m5551c();
        C1111f.m38345n(Arrays.asList(e0, q0Var.m5545i())).mo13372a(runnable, C0003a.m42611a());
    }

    @Override
    public void mo12376e(AbstractC0688y2 y2Var) {
        C1132h.m38322e(y2Var);
        final String J = m12399J(y2Var);
        final C10200b2 k = y2Var.m40574k();
        this.f27490c.execute(new Runnable() {
            @Override
            public final void run() {
                C8474g0.this.m12390S(J, k);
            }
        });
    }

    public AbstractFutureC1291a<Void> m12375e0(AbstractC8558r1 r1Var, boolean z) {
        r1Var.close();
        AbstractFutureC1291a<Void> c = r1Var.mo12162c(z);
        m12404E("Releasing session in state " + this.f27473N.name());
        this.f27484Y.put(r1Var, c);
        C1111f.m38357b(c, new C8475a(r1Var), C0003a.m42611a());
        return c;
    }

    @Override
    public void mo12374f(AbstractC0688y2 y2Var) {
        C1132h.m38322e(y2Var);
        final String J = m12399J(y2Var);
        final C10200b2 k = y2Var.m40574k();
        this.f27490c.execute(new Runnable() {
            @Override
            public final void run() {
                C8474g0.this.m12389T(J, k);
            }
        });
    }

    public final void m12373f0() {
        if (this.f27491c0 != null) {
            C10258l2 l2Var = this.f27486a;
            l2Var.m5613o(this.f27491c0.m12440d() + this.f27491c0.hashCode());
            C10258l2 l2Var2 = this.f27486a;
            l2Var2.m5612p(this.f27491c0.m12440d() + this.f27491c0.hashCode());
            this.f27491c0.m12442b();
            this.f27491c0 = null;
        }
    }

    @Override
    public AbstractC10293r1<AbstractC10208c0.EnumC10209a> mo5732g() {
        return this.f27474O;
    }

    public void m12372g0(boolean z) {
        C1132h.m38320g(this.f27481V != null);
        m12404E("Resetting Capture Session");
        AbstractC8558r1 r1Var = this.f27481V;
        C10200b2 f = r1Var.mo12159f();
        List<C10245j0> d = r1Var.mo12161d();
        AbstractC8558r1 W = m12386W();
        this.f27481V = W;
        W.mo12163b(f);
        this.f27481V.mo12160e(d);
        m12375e0(r1Var, z);
    }

    @Override
    public AbstractC10312x mo5731h() {
        return this.f27476Q;
    }

    public void m12371h0(EnumC8480f fVar) {
        m12370i0(fVar, null);
    }

    @Override
    public void mo5730i(final boolean z) {
        this.f27490c.execute(new Runnable() {
            @Override
            public final void run() {
                C8474g0.this.m12387V(z);
            }
        });
    }

    public void m12370i0(EnumC8480f fVar, AbstractC0658u.AbstractC0659a aVar) {
        m12369j0(fVar, aVar, true);
    }

    @Override
    public void mo5729j(Collection<AbstractC0688y2> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (!arrayList.isEmpty()) {
            this.f27476Q.m12151G();
            m12385X(new ArrayList(arrayList));
            final ArrayList arrayList2 = new ArrayList(m12367l0(arrayList));
            try {
                this.f27490c.execute(new Runnable() {
                    @Override
                    public final void run() {
                        C8474g0.this.m12396M(arrayList2);
                    }
                });
            } catch (RejectedExecutionException e) {
                m12403F("Unable to attach use cases.", e);
                this.f27476Q.m12113u();
            }
        }
    }

    public void m12369j0(EnumC8480f fVar, AbstractC0658u.AbstractC0659a aVar, boolean z) {
        AbstractC10208c0.EnumC10209a aVar2;
        m12404E("Transitioning camera internal state: " + this.f27473N + " --> " + fVar);
        this.f27473N = fVar;
        switch (C8477c.f27502a[fVar.ordinal()]) {
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
        this.f27487a0.m5706c(this, aVar2, z);
        this.f27474O.m5598g(aVar2);
        this.f27475P.m12303c(aVar2, aVar);
    }

    @Override
    public void mo5728k(Collection<AbstractC0688y2> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (!arrayList.isEmpty()) {
            final ArrayList arrayList2 = new ArrayList(m12367l0(arrayList));
            m12384Y(new ArrayList(arrayList));
            this.f27490c.execute(new Runnable() {
                @Override
                public final void run() {
                    C8474g0.this.m12393P(arrayList2);
                }
            });
        }
    }

    public void m12368k0(List<C10245j0> list) {
        ArrayList arrayList = new ArrayList();
        for (C10245j0 j0Var : list) {
            C10245j0.C10246a k = C10245j0.C10246a.m5639k(j0Var);
            if (!j0Var.m5653d().isEmpty() || !j0Var.m5650g() || m12348z(k)) {
                arrayList.add(k.m5642h());
            }
        }
        m12404E("Issue capture request");
        this.f27481V.mo12160e(arrayList);
    }

    @Override
    public AbstractC10194a0 mo5727l() {
        return this.f27478S;
    }

    public final Collection<AbstractC8484h> m12367l0(Collection<AbstractC0688y2> collection) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC0688y2 y2Var : collection) {
            arrayList.add(AbstractC8484h.m12329b(y2Var));
        }
        return arrayList;
    }

    @Override
    public void mo12366m(AbstractC0688y2 y2Var) {
        C1132h.m38322e(y2Var);
        final String J = m12399J(y2Var);
        this.f27490c.execute(new Runnable() {
            @Override
            public final void run() {
                C8474g0.this.m12391R(J);
            }
        });
    }

    public final void m12365m0(Collection<AbstractC8484h> collection) {
        Size d;
        boolean isEmpty = this.f27486a.m5622f().isEmpty();
        ArrayList arrayList = new ArrayList();
        Rational rational = null;
        for (AbstractC8484h hVar : collection) {
            if (!this.f27486a.m5619i(hVar.mo12326e())) {
                this.f27486a.m5614n(hVar.mo12326e(), hVar.mo12328c());
                arrayList.add(hVar.mo12326e());
                if (hVar.mo12325f() == C0519c2.class && (d = hVar.mo12327d()) != null) {
                    rational = new Rational(d.getWidth(), d.getHeight());
                }
            }
        }
        if (!arrayList.isEmpty()) {
            m12404E("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED");
            if (isEmpty) {
                this.f27476Q.m12133Y(true);
                this.f27476Q.m12151G();
            }
            m12349y();
            m12357q0();
            m12372g0(false);
            if (this.f27473N == EnumC8480f.OPENED) {
                m12382a0();
            } else {
                m12380b0();
            }
            if (rational != null) {
                this.f27476Q.m12132Z(rational);
            }
        }
    }

    public final void m12393P(Collection<AbstractC8484h> collection) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (AbstractC8484h hVar : collection) {
            if (this.f27486a.m5619i(hVar.mo12326e())) {
                this.f27486a.m5616l(hVar.mo12326e());
                arrayList.add(hVar.mo12326e());
                if (hVar.mo12325f() == C0519c2.class) {
                    z = true;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            m12404E("Use cases [" + TextUtils.join(", ", arrayList) + "] now DETACHED for camera");
            if (z) {
                this.f27476Q.m12132Z(null);
            }
            m12349y();
            if (this.f27486a.m5622f().isEmpty()) {
                this.f27476Q.m12113u();
                m12372g0(false);
                this.f27476Q.m12133Y(false);
                this.f27481V = m12386W();
                m12407B();
                return;
            }
            m12357q0();
            m12372g0(false);
            if (this.f27473N == EnumC8480f.OPENED) {
                m12382a0();
            }
        }
    }

    public void m12361o0(boolean z) {
        m12404E("Attempting to force open the camera.");
        if (!this.f27487a0.m5703f(this)) {
            m12404E("No cameras available. Waiting for available camera before opening camera.");
            m12371h0(EnumC8480f.PENDING_OPEN);
            return;
        }
        m12383Z(z);
    }

    public void m12359p0(boolean z) {
        m12404E("Attempting to open the camera.");
        if (!(this.f27485Z.m12345b() && this.f27487a0.m5703f(this))) {
            m12404E("No cameras available. Waiting for available camera before opening camera.");
            m12371h0(EnumC8480f.PENDING_OPEN);
            return;
        }
        m12383Z(z);
    }

    public void m12357q0() {
        C10200b2.C10206f c = this.f27486a.m5625c();
        if (c.m5736d()) {
            this.f27476Q.m12131a0(c.m5738b().m5760j());
            c.m5739a(this.f27476Q.m12109y());
            this.f27481V.mo12163b(c.m5738b());
            return;
        }
        this.f27476Q.m12134X();
        this.f27481V.mo12163b(this.f27476Q.m12109y());
    }

    public String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f27478S.mo5778a());
    }

    public final void m12350x() {
        if (this.f27491c0 != null) {
            C10258l2 l2Var = this.f27486a;
            l2Var.m5614n(this.f27491c0.m12440d() + this.f27491c0.hashCode(), this.f27491c0.m12439e());
            C10258l2 l2Var2 = this.f27486a;
            l2Var2.m5615m(this.f27491c0.m12440d() + this.f27491c0.hashCode(), this.f27491c0.m12439e());
        }
    }

    public final void m12349y() {
        C10200b2 b = this.f27486a.m5623e().m5738b();
        C10245j0 f = b.m5764f();
        int size = f.m5653d().size();
        int size2 = b.m5761i().size();
        if (b.m5761i().isEmpty()) {
            return;
        }
        if (f.m5653d().isEmpty()) {
            if (this.f27491c0 == null) {
                this.f27491c0 = new C8450c2(this.f27478S.m12259j());
            }
            m12350x();
        } else if (size2 == 1 && size == 1) {
            m12373f0();
        } else if (size >= 2) {
            m12373f0();
        } else {
            C0662u1.m40653a("Camera2CameraImpl", "mMeteringRepeating is ATTACHED, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
        }
    }

    public final boolean m12348z(C10245j0.C10246a aVar) {
        if (!aVar.m5638l().isEmpty()) {
            C0662u1.m40643k("Camera2CameraImpl", "The capture config builder already has surface inside.");
            return false;
        }
        for (C10200b2 b2Var : this.f27486a.m5624d()) {
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
        C0662u1.m40643k("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
        return false;
    }
}
