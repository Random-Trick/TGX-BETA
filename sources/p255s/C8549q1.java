package p255s;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.core.C0662u1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import p015b0.AbstractC1104a;
import p015b0.AbstractC1107c;
import p015b0.C1108d;
import p015b0.C1111f;
import p016b1.C1132h;
import p022b7.AbstractFutureC1291a;
import p158l0.C6287c;
import p240r.C8333a;
import p240r.C8336c;
import p255s.AbstractC8508j2;
import p255s.C8464e1;
import p255s.C8582v2;
import p279u.C9398b;
import p279u.C9407g;
import p306w.C9934l;
import p336y.AbstractC10234h;
import p336y.AbstractC10268n0;
import p336y.AbstractC10287q0;
import p336y.C10200b2;
import p336y.C10245j0;
import p336y.C10284p1;
import p336y.C10300t1;

public final class C8549q1 implements AbstractC8558r1 {
    public C8576u2 f27700e;
    public AbstractC8508j2 f27701f;
    public C10200b2 f27702g;
    public EnumC8553d f27707l;
    public AbstractFutureC1291a<Void> f27708m;
    public C6287c.C6288a<Void> f27709n;
    public final Object f27696a = new Object();
    public final List<C10245j0> f27697b = new ArrayList();
    public final CameraCaptureSession.CaptureCallback f27698c = new C8550a();
    public AbstractC10268n0 f27703h = C10300t1.m5525G();
    public C8336c f27704i = C8336c.m12783e();
    public final Map<AbstractC10287q0, Surface> f27705j = new HashMap();
    public List<AbstractC10287q0> f27706k = Collections.emptyList();
    public final C9934l f27710o = new C9934l();
    public final C8554e f27699d = new C8554e();

    public class C8550a extends CameraCaptureSession.CaptureCallback {
        public C8550a() {
        }

        @Override
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        }
    }

    public class C8551b implements AbstractC1107c<Void> {
        public C8551b() {
        }

        @Override
        public void mo5502b(Throwable th) {
            synchronized (C8549q1.this.f27696a) {
                C8549q1.this.f27700e.m12052e();
                int i = C8552c.f27713a[C8549q1.this.f27707l.ordinal()];
                if ((i == 4 || i == 6 || i == 7) && !(th instanceof CancellationException)) {
                    C0662u1.m40645l("CaptureSession", "Opening session with fail " + C8549q1.this.f27707l, th);
                    C8549q1.this.m12174l();
                }
            }
        }

        public void mo5503a(Void r1) {
        }
    }

    public static class C8552c {
        public static final int[] f27713a;

        static {
            int[] iArr = new int[EnumC8553d.values().length];
            f27713a = iArr;
            try {
                iArr[EnumC8553d.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27713a[EnumC8553d.INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27713a[EnumC8553d.GET_SURFACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27713a[EnumC8553d.OPENING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27713a[EnumC8553d.OPENED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27713a[EnumC8553d.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27713a[EnumC8553d.RELEASING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f27713a[EnumC8553d.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public enum EnumC8553d {
        UNINITIALIZED,
        INITIALIZED,
        GET_SURFACE,
        OPENING,
        OPENED,
        CLOSED,
        RELEASING,
        RELEASED
    }

    public final class C8554e extends AbstractC8508j2.AbstractC8509a {
        public C8554e() {
        }

        @Override
        public void mo12033q(AbstractC8508j2 j2Var) {
            synchronized (C8549q1.this.f27696a) {
                switch (C8552c.f27713a[C8549q1.this.f27707l.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                        throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + C8549q1.this.f27707l);
                    case 4:
                    case 6:
                    case 7:
                        C8549q1.this.m12174l();
                        break;
                    case 8:
                        C0662u1.m40656a("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                        break;
                }
                C0662u1.m40654c("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + C8549q1.this.f27707l);
            }
        }

        @Override
        public void mo12032r(AbstractC8508j2 j2Var) {
            synchronized (C8549q1.this.f27696a) {
                switch (C8552c.f27713a[C8549q1.this.f27707l.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                    case 8:
                        throw new IllegalStateException("onConfigured() should not be possible in state: " + C8549q1.this.f27707l);
                    case 4:
                        C8549q1 q1Var = C8549q1.this;
                        q1Var.f27707l = EnumC8553d.OPENED;
                        q1Var.f27701f = j2Var;
                        if (q1Var.f27702g != null) {
                            List<C10245j0> b = q1Var.f27704i.m12784d().m12781b();
                            if (!b.isEmpty()) {
                                C8549q1 q1Var2 = C8549q1.this;
                                q1Var2.m12173m(q1Var2.m12165u(b));
                            }
                        }
                        C0662u1.m40656a("CaptureSession", "Attempting to send capture request onConfigured");
                        C8549q1 q1Var3 = C8549q1.this;
                        q1Var3.m12171o(q1Var3.f27702g);
                        C8549q1.this.m12172n();
                        break;
                    case 6:
                        C8549q1.this.f27701f = j2Var;
                        break;
                    case 7:
                        j2Var.close();
                        break;
                }
                C0662u1.m40656a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + C8549q1.this.f27707l);
            }
        }

        @Override
        public void mo12031s(AbstractC8508j2 j2Var) {
            synchronized (C8549q1.this.f27696a) {
                if (C8552c.f27713a[C8549q1.this.f27707l.ordinal()] != 1) {
                    C0662u1.m40656a("CaptureSession", "CameraCaptureSession.onReady() " + C8549q1.this.f27707l);
                } else {
                    throw new IllegalStateException("onReady() should not be possible in state: " + C8549q1.this.f27707l);
                }
            }
        }

        @Override
        public void mo12030t(AbstractC8508j2 j2Var) {
            synchronized (C8549q1.this.f27696a) {
                if (C8549q1.this.f27707l != EnumC8553d.UNINITIALIZED) {
                    C0662u1.m40656a("CaptureSession", "onSessionFinished()");
                    C8549q1.this.m12174l();
                } else {
                    throw new IllegalStateException("onSessionFinished() should not be possible in state: " + C8549q1.this.f27707l);
                }
            }
        }
    }

    public C8549q1() {
        this.f27707l = EnumC8553d.UNINITIALIZED;
        this.f27707l = EnumC8553d.INITIALIZED;
    }

    public void m12170p(CameraCaptureSession cameraCaptureSession, int i, boolean z) {
        synchronized (this.f27696a) {
            if (this.f27707l == EnumC8553d.OPENED) {
                m12171o(this.f27702g);
            }
        }
    }

    public Object m12168r(C6287c.C6288a aVar) {
        String str;
        synchronized (this.f27696a) {
            C1132h.m38322h(this.f27709n == null, "Release completer expected to be null");
            this.f27709n = aVar;
            str = "Release[session=" + this + "]";
        }
        return str;
    }

    public static AbstractC10268n0 m12167s(List<C10245j0> list) {
        C10284p1 J = C10284p1.m5569J();
        for (C10245j0 j0Var : list) {
            AbstractC10268n0 c = j0Var.m5654c();
            for (AbstractC10268n0.AbstractC10269a<?> aVar : c.mo5425b()) {
                Object a = c.mo5426a(aVar, null);
                if (J.mo5422e(aVar)) {
                    Object a2 = J.mo5426a(aVar, null);
                    if (!Objects.equals(a2, a)) {
                        C0662u1.m40656a("CaptureSession", "Detect conflicting option " + aVar.mo5580c() + " : " + a + " != " + a2);
                    }
                } else {
                    J.mo5566n(aVar, a);
                }
            }
        }
        return J;
    }

    @Override
    public void mo12163a() {
        ArrayList<C10245j0> arrayList;
        synchronized (this.f27696a) {
            if (!this.f27697b.isEmpty()) {
                arrayList = new ArrayList(this.f27697b);
                this.f27697b.clear();
            } else {
                arrayList = null;
            }
        }
        if (arrayList != null) {
            for (C10245j0 j0Var : arrayList) {
                for (AbstractC10234h hVar : j0Var.m5655b()) {
                    hVar.mo5669a();
                }
            }
        }
    }

    @Override
    public void mo12162b(C10200b2 b2Var) {
        synchronized (this.f27696a) {
            switch (C8552c.f27713a[this.f27707l.ordinal()]) {
                case 1:
                    throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.f27707l);
                case 2:
                case 3:
                case 4:
                    this.f27702g = b2Var;
                    break;
                case 5:
                    this.f27702g = b2Var;
                    if (b2Var != null) {
                        if (this.f27705j.keySet().containsAll(b2Var.m5761i())) {
                            C0662u1.m40656a("CaptureSession", "Attempting to submit CaptureRequest after setting");
                            m12171o(this.f27702g);
                            break;
                        } else {
                            C0662u1.m40654c("CaptureSession", "Does not have the proper configured lists");
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
    public p022b7.AbstractFutureC1291a<java.lang.Void> mo12161c(boolean r4) {
        throw new UnsupportedOperationException("Method not decompiled: p255s.C8549q1.mo12161c(boolean):b7.a");
    }

    @Override
    public void close() {
        synchronized (this.f27696a) {
            int i = C8552c.f27713a[this.f27707l.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                if (this.f27702g != null) {
                                    List<C10245j0> a = this.f27704i.m12784d().m12782a();
                                    if (!a.isEmpty()) {
                                        try {
                                            mo12159e(m12165u(a));
                                        } catch (IllegalStateException e) {
                                            C0662u1.m40653d("CaptureSession", "Unable to issue the request before close the capture session", e);
                                        }
                                    }
                                }
                            }
                        }
                        C8576u2 u2Var = this.f27700e;
                        C1132h.m38324f(u2Var, "The Opener shouldn't null in state:" + this.f27707l);
                        this.f27700e.m12052e();
                        this.f27707l = EnumC8553d.CLOSED;
                        this.f27702g = null;
                    } else {
                        C8576u2 u2Var2 = this.f27700e;
                        C1132h.m38324f(u2Var2, "The Opener shouldn't null in state:" + this.f27707l);
                        this.f27700e.m12052e();
                    }
                }
                this.f27707l = EnumC8553d.RELEASED;
            } else {
                throw new IllegalStateException("close() should not be possible in state: " + this.f27707l);
            }
        }
    }

    @Override
    public List<C10245j0> mo12160d() {
        List<C10245j0> unmodifiableList;
        synchronized (this.f27696a) {
            unmodifiableList = Collections.unmodifiableList(this.f27697b);
        }
        return unmodifiableList;
    }

    @Override
    public void mo12159e(List<C10245j0> list) {
        synchronized (this.f27696a) {
            switch (C8552c.f27713a[this.f27707l.ordinal()]) {
                case 1:
                    throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f27707l);
                case 2:
                case 3:
                case 4:
                    this.f27697b.addAll(list);
                    break;
                case 5:
                    this.f27697b.addAll(list);
                    m12172n();
                    break;
                case 6:
                case 7:
                case 8:
                    throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
            }
        }
    }

    @Override
    public C10200b2 mo12158f() {
        C10200b2 b2Var;
        synchronized (this.f27696a) {
            b2Var = this.f27702g;
        }
        return b2Var;
    }

    @Override
    public AbstractFutureC1291a<Void> mo12157g(final C10200b2 b2Var, final CameraDevice cameraDevice, C8576u2 u2Var) {
        synchronized (this.f27696a) {
            if (C8552c.f27713a[this.f27707l.ordinal()] != 2) {
                C0662u1.m40654c("CaptureSession", "Open not allowed in state: " + this.f27707l);
                return C1111f.m38356f(new IllegalStateException("open() should not allow the state: " + this.f27707l));
            }
            this.f27707l = EnumC8553d.GET_SURFACE;
            ArrayList arrayList = new ArrayList(b2Var.m5761i());
            this.f27706k = arrayList;
            this.f27700e = u2Var;
            C1108d f = C1108d.m38366b(u2Var.m12053d(arrayList, 5000L)).m38362f(new AbstractC1104a() {
                @Override
                public final AbstractFutureC1291a apply(Object obj) {
                    AbstractFutureC1291a q;
                    q = C8549q1.this.m12169q(b2Var, cameraDevice, (List) obj);
                    return q;
                }
            }, this.f27700e.m12055b());
            C1111f.m38360b(f, new C8551b(), this.f27700e.m12055b());
            return C1111f.m38352j(f);
        }
    }

    public final CameraCaptureSession.CaptureCallback m12175k(List<AbstractC10234h> list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        for (AbstractC10234h hVar : list) {
            arrayList.add(C8522m1.m12242a(hVar));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return C8511k0.m12247a(arrayList);
    }

    public void m12174l() {
        EnumC8553d dVar = this.f27707l;
        EnumC8553d dVar2 = EnumC8553d.RELEASED;
        if (dVar == dVar2) {
            C0662u1.m40656a("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.f27707l = dVar2;
        this.f27701f = null;
        C6287c.C6288a<Void> aVar = this.f27709n;
        if (aVar != null) {
            aVar.m20717c(null);
            this.f27709n = null;
        }
    }

    public int m12173m(List<C10245j0> list) {
        C8464e1 e1Var;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        synchronized (this.f27696a) {
            if (list.isEmpty()) {
                return -1;
            }
            try {
                e1Var = new C8464e1();
                arrayList = new ArrayList();
                C0662u1.m40656a("CaptureSession", "Issuing capture request.");
                z = false;
                for (C10245j0 j0Var : list) {
                    if (j0Var.m5653d().isEmpty()) {
                        C0662u1.m40656a("CaptureSession", "Skipping issuing empty capture request.");
                    } else {
                        Iterator<AbstractC10287q0> it = j0Var.m5653d().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z2 = true;
                                break;
                            }
                            AbstractC10287q0 next = it.next();
                            if (!this.f27705j.containsKey(next)) {
                                C0662u1.m40656a("CaptureSession", "Skipping capture request with invalid surface: " + next);
                                z2 = false;
                                break;
                            }
                        }
                        if (z2) {
                            if (j0Var.m5651f() == 2) {
                                z = true;
                            }
                            C10245j0.C10246a k = C10245j0.C10246a.m5639k(j0Var);
                            C10200b2 b2Var = this.f27702g;
                            if (b2Var != null) {
                                k.m5645e(b2Var.m5764f().m5654c());
                            }
                            k.m5645e(this.f27703h);
                            k.m5645e(j0Var.m5654c());
                            CaptureRequest b = C8597z0.m12022b(k.m5642h(), this.f27701f.mo12186j(), this.f27705j);
                            if (b == null) {
                                C0662u1.m40656a("CaptureSession", "Skipping issuing request without surface.");
                                return -1;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (AbstractC10234h hVar : j0Var.m5655b()) {
                                C8522m1.m12241b(hVar, arrayList2);
                            }
                            e1Var.m12412a(b, arrayList2);
                            arrayList.add(b);
                        }
                    }
                }
            } catch (CameraAccessException e) {
                C0662u1.m40654c("CaptureSession", "Unable to access camera: " + e.getMessage());
                Thread.dumpStack();
            }
            if (!arrayList.isEmpty()) {
                if (this.f27710o.m6465a(arrayList, z)) {
                    this.f27701f.mo12185l();
                    e1Var.m12410c(new C8464e1.AbstractC8465a() {
                        @Override
                        public final void mo12201a(CameraCaptureSession cameraCaptureSession, int i, boolean z3) {
                            C8549q1.this.m12170p(cameraCaptureSession, i, z3);
                        }
                    });
                }
                return this.f27701f.mo12189f(arrayList, e1Var);
            }
            C0662u1.m40656a("CaptureSession", "Skipping issuing burst request due to no valid request elements");
            return -1;
        }
    }

    public void m12172n() {
        if (!this.f27697b.isEmpty()) {
            try {
                m12173m(this.f27697b);
            } finally {
                this.f27697b.clear();
            }
        }
    }

    public int m12171o(C10200b2 b2Var) {
        synchronized (this.f27696a) {
            if (b2Var == null) {
                C0662u1.m40656a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return -1;
            }
            C10245j0 f = b2Var.m5764f();
            if (f.m5653d().isEmpty()) {
                C0662u1.m40656a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    this.f27701f.mo12185l();
                } catch (CameraAccessException e) {
                    C0662u1.m40654c("CaptureSession", "Unable to access camera: " + e.getMessage());
                    Thread.dumpStack();
                }
                return -1;
            }
            try {
                C0662u1.m40656a("CaptureSession", "Issuing request for session.");
                C10245j0.C10246a k = C10245j0.C10246a.m5639k(f);
                AbstractC10268n0 s = m12167s(this.f27704i.m12784d().m12779d());
                this.f27703h = s;
                k.m5645e(s);
                CaptureRequest b = C8597z0.m12022b(k.m5642h(), this.f27701f.mo12186j(), this.f27705j);
                if (b == null) {
                    C0662u1.m40656a("CaptureSession", "Skipping issuing empty request for session.");
                    return -1;
                }
                return this.f27701f.mo12067k(b, m12175k(f.m5655b(), this.f27698c));
            } catch (CameraAccessException e2) {
                C0662u1.m40654c("CaptureSession", "Unable to access camera: " + e2.getMessage());
                Thread.dumpStack();
                return -1;
            }
        }
    }

    public final AbstractFutureC1291a<Void> m12169q(List<Surface> list, C10200b2 b2Var, CameraDevice cameraDevice) {
        synchronized (this.f27696a) {
            int i = C8552c.f27713a[this.f27707l.ordinal()];
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    this.f27705j.clear();
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        this.f27705j.put(this.f27706k.get(i2), list.get(i2));
                    }
                    ArrayList<Surface> arrayList = new ArrayList(new LinkedHashSet(list));
                    this.f27707l = EnumC8553d.OPENING;
                    C0662u1.m40656a("CaptureSession", "Opening capture session.");
                    AbstractC8508j2.AbstractC8509a v = C8582v2.m12037v(this.f27699d, new C8582v2.C8583a(b2Var.m5763g()));
                    C8333a aVar = new C8333a(b2Var.m5766d());
                    C8336c G = aVar.m12799G(C8336c.m12783e());
                    this.f27704i = G;
                    List<C10245j0> c = G.m12784d().m12780c();
                    C10245j0.C10246a k = C10245j0.C10246a.m5639k(b2Var.m5764f());
                    for (C10245j0 j0Var : c) {
                        k.m5645e(j0Var.m5654c());
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Surface surface : arrayList) {
                        C9398b bVar = new C9398b(surface);
                        bVar.m8796c(aVar.m12794L(null));
                        arrayList2.add(bVar);
                    }
                    C9407g a = this.f27700e.m12056a(0, arrayList2, v);
                    try {
                        CaptureRequest c2 = C8597z0.m12021c(k.m5642h(), cameraDevice);
                        if (c2 != null) {
                            a.m8778f(c2);
                        }
                        return this.f27700e.m12054c(cameraDevice, a, this.f27706k);
                    } catch (CameraAccessException e) {
                        return C1111f.m38356f(e);
                    }
                } else if (i != 5) {
                    return C1111f.m38356f(new CancellationException("openCaptureSession() not execute in state: " + this.f27707l));
                }
            }
            return C1111f.m38356f(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.f27707l));
        }
    }

    public List<C10245j0> m12165u(List<C10245j0> list) {
        ArrayList arrayList = new ArrayList();
        for (C10245j0 j0Var : list) {
            C10245j0.C10246a k = C10245j0.C10246a.m5639k(j0Var);
            k.m5635o(1);
            for (AbstractC10287q0 q0Var : this.f27702g.m5764f().m5653d()) {
                k.m5644f(q0Var);
            }
            arrayList.add(k.m5642h());
        }
        return arrayList;
    }
}
