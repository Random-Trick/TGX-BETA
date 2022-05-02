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
    public static List<AbstractC10287q0> f27531r = new ArrayList();
    public static int f27532s = 0;
    public final AbstractC10211c2 f27533a;
    public final C8505j0 f27534b;
    public final Executor f27535c;
    public final ScheduledExecutorService f27536d;
    public C10200b2 f27539g;
    public C8444b1 f27540h;
    public C10200b2 f27541i;
    public final C8497e f27546n;
    public int f27549q;
    public List<AbstractC10287q0> f27538f = new ArrayList();
    public boolean f27542j = false;
    public volatile C10245j0 f27544l = null;
    public volatile boolean f27545m = false;
    public C10061j f27547o = new C10061j.C10062a().m6090d();
    public C10061j f27548p = new C10061j.C10062a().m6090d();
    public final C8549q1 f27537e = new C8549q1();
    public EnumC8496d f27543k = EnumC8496d.UNINITIALIZED;

    public class C8493a implements AbstractC1107c<Void> {
        public C8493a() {
        }

        @Override
        public void mo5502b(Throwable th) {
            C0662u1.m40650d("ProcessingCaptureSession", "open session failed ", th);
            C8492h2.this.close();
        }

        public void mo5503a(Void r1) {
        }
    }

    public class C8494b implements AbstractC10211c2.AbstractC10212a {
        public final C10245j0 f27551a;

        public C8494b(C10245j0 j0Var) {
            this.f27551a = j0Var;
        }
    }

    public static class C8495c {
        public static final int[] f27553a;

        static {
            int[] iArr = new int[EnumC8496d.values().length];
            f27553a = iArr;
            try {
                iArr[EnumC8496d.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27553a[EnumC8496d.SESSION_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27553a[EnumC8496d.ON_CAPTURE_SESSION_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27553a[EnumC8496d.ON_CAPTURE_SESSION_ENDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27553a[EnumC8496d.CLOSED.ordinal()] = 5;
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
        public List<AbstractC10234h> f27560a = Collections.emptyList();
        public final Executor f27561b;

        public C8497e(Executor executor) {
            this.f27561b = executor;
        }

        public void m12306a(List<AbstractC10234h> list) {
            this.f27560a = list;
        }
    }

    public C8492h2(AbstractC10211c2 c2Var, C8505j0 j0Var, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f27549q = 0;
        this.f27533a = c2Var;
        this.f27534b = j0Var;
        this.f27535c = executor;
        this.f27536d = scheduledExecutorService;
        this.f27546n = new C8497e(executor);
        int i = f27532s;
        f27532s = i + 1;
        this.f27549q = i;
        C0662u1.m40653a("ProcessingCaptureSession", "New ProcessingCaptureSession (id=" + this.f27549q + ")");
    }

    public static void m12316l(List<C10245j0> list) {
        for (C10245j0 j0Var : list) {
            for (AbstractC10234h hVar : j0Var.m5655b()) {
                hVar.mo5669a();
            }
        }
    }

    public static List<C10216d2> m12315m(List<AbstractC10287q0> list) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC10287q0 q0Var : list) {
            C1132h.m38325b(q0Var instanceof C10216d2, "Surface must be SessionProcessorSurface");
            arrayList.add((C10216d2) q0Var);
        }
        return arrayList;
    }

    public void m12313o() {
        C10305v0.m5510e(this.f27538f);
    }

    public static void m12312p(AbstractC10287q0 q0Var) {
        f27531r.remove(q0Var);
    }

    public AbstractFutureC1291a m12311q(C10200b2 b2Var, CameraDevice cameraDevice, C8576u2 u2Var, List list) {
        C0662u1.m40653a("ProcessingCaptureSession", "-- getSurfaces done, start init (id=" + this.f27549q + ")");
        if (this.f27543k == EnumC8496d.CLOSED) {
            return C1111f.m38353f(new IllegalStateException("SessionProcessorCaptureSession is closed."));
        }
        AbstractC10303u1 u1Var = null;
        if (list.contains(null)) {
            return C1111f.m38353f(new AbstractC10287q0.C10288a("Surface closed", b2Var.m5761i().get(list.indexOf(null))));
        }
        try {
            C10305v0.m5509f(this.f27538f);
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
            this.f27543k = EnumC8496d.SESSION_INITIALIZED;
            C0662u1.m40643k("ProcessingCaptureSession", "== initSession (id=" + this.f27549q + ")");
            C10200b2 f = this.f27533a.m5720f(this.f27534b, u1Var, u1Var2, u1Var3);
            this.f27541i = f;
            f.m5761i().get(0).m5545i().mo13372a(new Runnable() {
                @Override
                public final void run() {
                    C8492h2.this.m12313o();
                }
            }, C0003a.m42611a());
            for (final AbstractC10287q0 q0Var2 : this.f27541i.m5761i()) {
                f27531r.add(q0Var2);
                q0Var2.m5545i().mo13372a(new Runnable() {
                    @Override
                    public final void run() {
                        C8492h2.m12312p(AbstractC10287q0.this);
                    }
                }, this.f27535c);
            }
            C10200b2.C10206f fVar = new C10200b2.C10206f();
            fVar.m5739a(b2Var);
            fVar.m5737c();
            fVar.m5739a(this.f27541i);
            C1132h.m38325b(fVar.m5736d(), "Cannot transform the SessionConfig");
            AbstractFutureC1291a<Void> g = this.f27537e.mo12158g(fVar.m5738b(), (CameraDevice) C1132h.m38322e(cameraDevice), u2Var);
            C1111f.m38357b(g, new C8493a(), this.f27535c);
            return g;
        } catch (AbstractC10287q0.C10288a e) {
            return C1111f.m38353f(e);
        }
    }

    public Void m12310r(Void r1) {
        m12309s(this.f27537e);
        return null;
    }

    @Override
    public void mo12164a() {
        C0662u1.m40653a("ProcessingCaptureSession", "cancelIssuedCaptureRequests (id=" + this.f27549q + ")");
        if (this.f27544l != null) {
            for (AbstractC10234h hVar : this.f27544l.m5655b()) {
                hVar.mo5669a();
            }
            this.f27544l = null;
        }
    }

    @Override
    public void mo12163b(C10200b2 b2Var) {
        C0662u1.m40653a("ProcessingCaptureSession", "setSessionConfig (id=" + this.f27549q + ")");
        this.f27539g = b2Var;
        if (b2Var != null) {
            this.f27546n.m12306a(b2Var.m5765e());
            if (this.f27543k == EnumC8496d.ON_CAPTURE_SESSION_STARTED) {
                C10061j d = C10061j.C10062a.m6089e(b2Var.m5766d()).m6090d();
                this.f27547o = d;
                m12308t(d, this.f27548p);
                if (!this.f27542j) {
                    this.f27533a.m5719g(this.f27546n);
                    this.f27542j = true;
                }
            }
        }
    }

    @Override
    public AbstractFutureC1291a<Void> mo12162c(boolean z) {
        C1132h.m38319h(this.f27543k == EnumC8496d.CLOSED, "release() can only be called in CLOSED state");
        C0662u1.m40653a("ProcessingCaptureSession", "release (id=" + this.f27549q + ")");
        return this.f27537e.mo12162c(z);
    }

    @Override
    public void close() {
        C0662u1.m40653a("ProcessingCaptureSession", "close (id=" + this.f27549q + ") state=" + this.f27543k);
        int i = C8495c.f27553a[this.f27543k.ordinal()];
        if (i != 2) {
            if (i == 3) {
                this.f27533a.m5724b();
                C8444b1 b1Var = this.f27540h;
                if (b1Var != null) {
                    b1Var.m12446a();
                }
                this.f27543k = EnumC8496d.ON_CAPTURE_SESSION_ENDED;
            } else if (i != 4) {
                if (i == 5) {
                    return;
                }
                this.f27543k = EnumC8496d.CLOSED;
                this.f27537e.close();
            }
        }
        this.f27533a.m5723c();
        this.f27543k = EnumC8496d.CLOSED;
        this.f27537e.close();
    }

    @Override
    public List<C10245j0> mo12161d() {
        return this.f27544l != null ? Arrays.asList(this.f27544l) : Collections.emptyList();
    }

    @Override
    public void mo12160e(List<C10245j0> list) {
        if (!list.isEmpty()) {
            if (list.size() > 1 || !m12314n(list)) {
                m12316l(list);
            } else if (this.f27544l != null || this.f27545m) {
                m12316l(list);
            } else {
                C10245j0 j0Var = list.get(0);
                C0662u1.m40653a("ProcessingCaptureSession", "issueCaptureRequests (id=" + this.f27549q + ") + state =" + this.f27543k);
                int i = C8495c.f27553a[this.f27543k.ordinal()];
                if (i == 1 || i == 2) {
                    this.f27544l = j0Var;
                } else if (i == 3) {
                    this.f27545m = true;
                    C10061j d = C10061j.C10062a.m6089e(j0Var.m5654c()).m6090d();
                    this.f27548p = d;
                    m12308t(this.f27547o, d);
                    this.f27533a.m5725a(new C8494b(j0Var));
                } else if (i == 4 || i == 5) {
                    C0662u1.m40653a("ProcessingCaptureSession", "Run issueCaptureRequests in wrong state, state = " + this.f27543k);
                    m12316l(list);
                }
            }
        }
    }

    @Override
    public C10200b2 mo12159f() {
        return this.f27539g;
    }

    @Override
    public AbstractFutureC1291a<Void> mo12158g(final C10200b2 b2Var, final CameraDevice cameraDevice, final C8576u2 u2Var) {
        boolean z = this.f27543k == EnumC8496d.UNINITIALIZED;
        C1132h.m38325b(z, "Invalid state state:" + this.f27543k);
        C1132h.m38325b(b2Var.m5761i().isEmpty() ^ true, "SessionConfig contains no surfaces");
        C0662u1.m40653a("ProcessingCaptureSession", "open (id=" + this.f27549q + ")");
        List<AbstractC10287q0> i = b2Var.m5761i();
        this.f27538f = i;
        return C1108d.m38363b(C10305v0.m5504k(i, false, 5000L, this.f27535c, this.f27536d)).m38359f(new AbstractC1104a() {
            @Override
            public final AbstractFutureC1291a apply(Object obj) {
                AbstractFutureC1291a q;
                q = C8492h2.this.m12311q(b2Var, cameraDevice, u2Var, (List) obj);
                return q;
            }
        }, this.f27535c).m38360e(new AbstractC7094a() {
            @Override
            public final Object apply(Object obj) {
                Void r;
                r = C8492h2.this.m12310r((Void) obj);
                return r;
            }
        }, this.f27535c);
    }

    public final boolean m12314n(List<C10245j0> list) {
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

    public void m12309s(C8549q1 q1Var) {
        boolean z = this.f27543k == EnumC8496d.SESSION_INITIALIZED;
        C1132h.m38325b(z, "Invalid state state:" + this.f27543k);
        C8444b1 b1Var = new C8444b1(q1Var, m12315m(this.f27541i.m5761i()));
        this.f27540h = b1Var;
        this.f27533a.m5721e(b1Var);
        this.f27543k = EnumC8496d.ON_CAPTURE_SESSION_STARTED;
        C10200b2 b2Var = this.f27539g;
        if (b2Var != null) {
            mo12163b(b2Var);
        }
        if (this.f27544l != null) {
            List<C10245j0> asList = Arrays.asList(this.f27544l);
            this.f27544l = null;
            mo12160e(asList);
        }
    }

    public final void m12308t(C10061j jVar, C10061j jVar2) {
        C8333a.C8334a aVar = new C8333a.C8334a();
        aVar.m12791d(jVar);
        aVar.m12791d(jVar2);
        this.f27533a.m5722d(aVar.m12792c());
    }
}
