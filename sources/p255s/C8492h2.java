package p255s;

import android.hardware.camera2.CameraDevice;
import android.util.Size;
import androidx.camera.core.C0519c2;
import androidx.camera.core.C0532e1;
import androidx.camera.core.C0599k0;
import androidx.camera.core.C0662u1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p001a0.C0003a;
import p015b0.AbstractC1104a;
import p015b0.AbstractC1107c;
import p015b0.C1108d;
import p015b0.C1111f;
import p016b1.C1132h;
import p022b7.AbstractFutureC1291a;
import p182n.AbstractC7094a;
import p240r.C8333a;
import p321x.C10061j;
import p336y.AbstractC10211c2;
import p336y.AbstractC10234h;
import p336y.AbstractC10287q0;
import p336y.AbstractC10303u1;
import p336y.C10200b2;
import p336y.C10216d2;
import p336y.C10245j0;
import p336y.C10305v0;

public final class C8492h2 implements AbstractC8558r1 {
    public static List<AbstractC10287q0> f27534r = new ArrayList();
    public static int f27535s = 0;
    public final AbstractC10211c2 f27536a;
    public final C8505j0 f27537b;
    public final Executor f27538c;
    public final ScheduledExecutorService f27539d;
    public C10200b2 f27542g;
    public C8444b1 f27543h;
    public C10200b2 f27544i;
    public final C8497e f27549n;
    public int f27552q;
    public List<AbstractC10287q0> f27541f = new ArrayList();
    public boolean f27545j = false;
    public volatile C10245j0 f27547l = null;
    public volatile boolean f27548m = false;
    public C10061j f27550o = new C10061j.C10062a().m6090d();
    public C10061j f27551p = new C10061j.C10062a().m6090d();
    public final C8549q1 f27540e = new C8549q1();
    public EnumC8496d f27546k = EnumC8496d.UNINITIALIZED;

    public class C8493a implements AbstractC1107c<Void> {
        public C8493a() {
        }

        @Override
        public void mo5502b(Throwable th) {
            C0662u1.m40653d("ProcessingCaptureSession", "open session failed ", th);
            C8492h2.this.close();
        }

        public void mo5503a(Void r1) {
        }
    }

    public class C8494b implements AbstractC10211c2.AbstractC10212a {
        public final C10245j0 f27554a;

        public C8494b(C10245j0 j0Var) {
            this.f27554a = j0Var;
        }
    }

    public static class C8495c {
        public static final int[] f27556a;

        static {
            int[] iArr = new int[EnumC8496d.values().length];
            f27556a = iArr;
            try {
                iArr[EnumC8496d.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27556a[EnumC8496d.SESSION_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27556a[EnumC8496d.ON_CAPTURE_SESSION_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27556a[EnumC8496d.ON_CAPTURE_SESSION_ENDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27556a[EnumC8496d.CLOSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum EnumC8496d {
        UNINITIALIZED,
        SESSION_INITIALIZED,
        ON_CAPTURE_SESSION_STARTED,
        ON_CAPTURE_SESSION_ENDED,
        CLOSED
    }

    public static class C8497e implements AbstractC10211c2.AbstractC10212a {
        public List<AbstractC10234h> f27563a = Collections.emptyList();
        public final Executor f27564b;

        public C8497e(Executor executor) {
            this.f27564b = executor;
        }

        public void m12305a(List<AbstractC10234h> list) {
            this.f27563a = list;
        }
    }

    public C8492h2(AbstractC10211c2 c2Var, C8505j0 j0Var, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f27552q = 0;
        this.f27536a = c2Var;
        this.f27537b = j0Var;
        this.f27538c = executor;
        this.f27539d = scheduledExecutorService;
        this.f27549n = new C8497e(executor);
        int i = f27535s;
        f27535s = i + 1;
        this.f27552q = i;
        C0662u1.m40656a("ProcessingCaptureSession", "New ProcessingCaptureSession (id=" + this.f27552q + ")");
    }

    public static void m12315l(List<C10245j0> list) {
        for (C10245j0 j0Var : list) {
            for (AbstractC10234h hVar : j0Var.m5655b()) {
                hVar.mo5669a();
            }
        }
    }

    public static List<C10216d2> m12314m(List<AbstractC10287q0> list) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC10287q0 q0Var : list) {
            C1132h.m38328b(q0Var instanceof C10216d2, "Surface must be SessionProcessorSurface");
            arrayList.add((C10216d2) q0Var);
        }
        return arrayList;
    }

    public void m12312o() {
        C10305v0.m5510e(this.f27541f);
    }

    public static void m12311p(AbstractC10287q0 q0Var) {
        f27534r.remove(q0Var);
    }

    public AbstractFutureC1291a m12310q(C10200b2 b2Var, CameraDevice cameraDevice, C8576u2 u2Var, List list) {
        C0662u1.m40656a("ProcessingCaptureSession", "-- getSurfaces done, start init (id=" + this.f27552q + ")");
        if (this.f27546k == EnumC8496d.CLOSED) {
            return C1111f.m38356f(new IllegalStateException("SessionProcessorCaptureSession is closed."));
        }
        AbstractC10303u1 u1Var = null;
        if (list.contains(null)) {
            return C1111f.m38356f(new AbstractC10287q0.C10288a("Surface closed", b2Var.m5761i().get(list.indexOf(null))));
        }
        try {
            C10305v0.m5509f(this.f27541f);
            AbstractC10303u1 u1Var2 = null;
            AbstractC10303u1 u1Var3 = null;
            for (int i = 0; i < b2Var.m5761i().size(); i++) {
                AbstractC10287q0 q0Var = b2Var.m5761i().get(i);
                if (Objects.equals(q0Var.m5549e(), C0519c2.class)) {
                    u1Var = AbstractC10303u1.m5519a(q0Var.m5546h().get(), new Size(q0Var.m5548f().getWidth(), q0Var.m5548f().getHeight()), q0Var.m5547g());
                } else if (Objects.equals(q0Var.m5549e(), C0532e1.class)) {
                    u1Var2 = AbstractC10303u1.m5519a(q0Var.m5546h().get(), new Size(q0Var.m5548f().getWidth(), q0Var.m5548f().getHeight()), q0Var.m5547g());
                } else if (Objects.equals(q0Var.m5549e(), C0599k0.class)) {
                    u1Var3 = AbstractC10303u1.m5519a(q0Var.m5546h().get(), new Size(q0Var.m5548f().getWidth(), q0Var.m5548f().getHeight()), q0Var.m5547g());
                }
            }
            this.f27546k = EnumC8496d.SESSION_INITIALIZED;
            C0662u1.m40646k("ProcessingCaptureSession", "== initSession (id=" + this.f27552q + ")");
            C10200b2 f = this.f27536a.m5720f(this.f27537b, u1Var, u1Var2, u1Var3);
            this.f27544i = f;
            f.m5761i().get(0).m5545i().mo13371a(new Runnable() {
                @Override
                public final void run() {
                    C8492h2.this.m12312o();
                }
            }, C0003a.m42614a());
            for (final AbstractC10287q0 q0Var2 : this.f27544i.m5761i()) {
                f27534r.add(q0Var2);
                q0Var2.m5545i().mo13371a(new Runnable() {
                    @Override
                    public final void run() {
                        C8492h2.m12311p(AbstractC10287q0.this);
                    }
                }, this.f27538c);
            }
            C10200b2.C10206f fVar = new C10200b2.C10206f();
            fVar.m5739a(b2Var);
            fVar.m5737c();
            fVar.m5739a(this.f27544i);
            C1132h.m38328b(fVar.m5736d(), "Cannot transform the SessionConfig");
            AbstractFutureC1291a<Void> g = this.f27540e.mo12157g(fVar.m5738b(), (CameraDevice) C1132h.m38325e(cameraDevice), u2Var);
            C1111f.m38360b(g, new C8493a(), this.f27538c);
            return g;
        } catch (AbstractC10287q0.C10288a e) {
            return C1111f.m38356f(e);
        }
    }

    public Void m12309r(Void r1) {
        m12308s(this.f27540e);
        return null;
    }

    @Override
    public void mo12163a() {
        C0662u1.m40656a("ProcessingCaptureSession", "cancelIssuedCaptureRequests (id=" + this.f27552q + ")");
        if (this.f27547l != null) {
            for (AbstractC10234h hVar : this.f27547l.m5655b()) {
                hVar.mo5669a();
            }
            this.f27547l = null;
        }
    }

    @Override
    public void mo12162b(C10200b2 b2Var) {
        C0662u1.m40656a("ProcessingCaptureSession", "setSessionConfig (id=" + this.f27552q + ")");
        this.f27542g = b2Var;
        if (b2Var != null) {
            this.f27549n.m12305a(b2Var.m5765e());
            if (this.f27546k == EnumC8496d.ON_CAPTURE_SESSION_STARTED) {
                C10061j d = C10061j.C10062a.m6089e(b2Var.m5766d()).m6090d();
                this.f27550o = d;
                m12307t(d, this.f27551p);
                if (!this.f27545j) {
                    this.f27536a.m5719g(this.f27549n);
                    this.f27545j = true;
                }
            }
        }
    }

    @Override
    public AbstractFutureC1291a<Void> mo12161c(boolean z) {
        C1132h.m38322h(this.f27546k == EnumC8496d.CLOSED, "release() can only be called in CLOSED state");
        C0662u1.m40656a("ProcessingCaptureSession", "release (id=" + this.f27552q + ")");
        return this.f27540e.mo12161c(z);
    }

    @Override
    public void close() {
        C0662u1.m40656a("ProcessingCaptureSession", "close (id=" + this.f27552q + ") state=" + this.f27546k);
        int i = C8495c.f27556a[this.f27546k.ordinal()];
        if (i != 2) {
            if (i == 3) {
                this.f27536a.m5724b();
                C8444b1 b1Var = this.f27543h;
                if (b1Var != null) {
                    b1Var.m12445a();
                }
                this.f27546k = EnumC8496d.ON_CAPTURE_SESSION_ENDED;
            } else if (i != 4) {
                if (i == 5) {
                    return;
                }
                this.f27546k = EnumC8496d.CLOSED;
                this.f27540e.close();
            }
        }
        this.f27536a.m5723c();
        this.f27546k = EnumC8496d.CLOSED;
        this.f27540e.close();
    }

    @Override
    public List<C10245j0> mo12160d() {
        return this.f27547l != null ? Arrays.asList(this.f27547l) : Collections.emptyList();
    }

    @Override
    public void mo12159e(List<C10245j0> list) {
        if (!list.isEmpty()) {
            if (list.size() > 1 || !m12313n(list)) {
                m12315l(list);
            } else if (this.f27547l != null || this.f27548m) {
                m12315l(list);
            } else {
                C10245j0 j0Var = list.get(0);
                C0662u1.m40656a("ProcessingCaptureSession", "issueCaptureRequests (id=" + this.f27552q + ") + state =" + this.f27546k);
                int i = C8495c.f27556a[this.f27546k.ordinal()];
                if (i == 1 || i == 2) {
                    this.f27547l = j0Var;
                } else if (i == 3) {
                    this.f27548m = true;
                    C10061j d = C10061j.C10062a.m6089e(j0Var.m5654c()).m6090d();
                    this.f27551p = d;
                    m12307t(this.f27550o, d);
                    this.f27536a.m5725a(new C8494b(j0Var));
                } else if (i == 4 || i == 5) {
                    C0662u1.m40656a("ProcessingCaptureSession", "Run issueCaptureRequests in wrong state, state = " + this.f27546k);
                    m12315l(list);
                }
            }
        }
    }

    @Override
    public C10200b2 mo12158f() {
        return this.f27542g;
    }

    @Override
    public AbstractFutureC1291a<Void> mo12157g(final C10200b2 b2Var, final CameraDevice cameraDevice, final C8576u2 u2Var) {
        boolean z = this.f27546k == EnumC8496d.UNINITIALIZED;
        C1132h.m38328b(z, "Invalid state state:" + this.f27546k);
        C1132h.m38328b(b2Var.m5761i().isEmpty() ^ true, "SessionConfig contains no surfaces");
        C0662u1.m40656a("ProcessingCaptureSession", "open (id=" + this.f27552q + ")");
        List<AbstractC10287q0> i = b2Var.m5761i();
        this.f27541f = i;
        return C1108d.m38366b(C10305v0.m5504k(i, false, 5000L, this.f27538c, this.f27539d)).m38362f(new AbstractC1104a() {
            @Override
            public final AbstractFutureC1291a apply(Object obj) {
                AbstractFutureC1291a q;
                q = C8492h2.this.m12310q(b2Var, cameraDevice, u2Var, (List) obj);
                return q;
            }
        }, this.f27538c).m38363e(new AbstractC7094a() {
            @Override
            public final Object apply(Object obj) {
                Void r;
                r = C8492h2.this.m12309r((Void) obj);
                return r;
            }
        }, this.f27538c);
    }

    public final boolean m12313n(List<C10245j0> list) {
        if (list.isEmpty()) {
            return false;
        }
        for (C10245j0 j0Var : list) {
            if (j0Var.m5651f() != 2) {
                return false;
            }
        }
        return true;
    }

    public void m12308s(C8549q1 q1Var) {
        boolean z = this.f27546k == EnumC8496d.SESSION_INITIALIZED;
        C1132h.m38328b(z, "Invalid state state:" + this.f27546k);
        C8444b1 b1Var = new C8444b1(q1Var, m12314m(this.f27544i.m5761i()));
        this.f27543h = b1Var;
        this.f27536a.m5721e(b1Var);
        this.f27546k = EnumC8496d.ON_CAPTURE_SESSION_STARTED;
        C10200b2 b2Var = this.f27542g;
        if (b2Var != null) {
            mo12162b(b2Var);
        }
        if (this.f27547l != null) {
            List<C10245j0> asList = Arrays.asList(this.f27547l);
            this.f27547l = null;
            mo12159e(asList);
        }
    }

    public final void m12307t(C10061j jVar, C10061j jVar2) {
        C8333a.C8334a aVar = new C8333a.C8334a();
        aVar.m12790d(jVar);
        aVar.m12790d(jVar2);
        this.f27536a.m5722d(aVar.m12791c());
    }
}
