package p336y;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import androidx.camera.core.C0662u1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p069f0.C4201c;
import p336y.C10245j0;

public final class C10200b2 {
    public final List<AbstractC10287q0> f32944a;
    public final List<CameraDevice.StateCallback> f32945b;
    public final List<CameraCaptureSession.StateCallback> f32946c;
    public final List<AbstractC10234h> f32947d;
    public final List<AbstractC10203c> f32948e;
    public final C10245j0 f32949f;

    public static class C10201a {
        public final Set<AbstractC10287q0> f32950a = new LinkedHashSet();
        public final C10245j0.C10246a f32951b = new C10245j0.C10246a();
        public final List<CameraDevice.StateCallback> f32952c = new ArrayList();
        public final List<CameraCaptureSession.StateCallback> f32953d = new ArrayList();
        public final List<AbstractC10203c> f32954e = new ArrayList();
        public final List<AbstractC10234h> f32955f = new ArrayList();
    }

    public static class C10202b extends C10201a {
        public static C10202b m5745o(AbstractC10273n2<?> n2Var) {
            AbstractC10204d A = n2Var.mo5456A(null);
            if (A != null) {
                C10202b bVar = new C10202b();
                A.mo5740a(n2Var, bVar);
                return bVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + n2Var.mo5432q(n2Var.toString()));
        }

        public void m5759a(Collection<CameraDevice.StateCallback> collection) {
            for (CameraDevice.StateCallback stateCallback : collection) {
                m5755e(stateCallback);
            }
        }

        public void m5758b(Collection<AbstractC10234h> collection) {
            this.f32951b.m5649a(collection);
        }

        public void m5757c(List<CameraCaptureSession.StateCallback> list) {
            for (CameraCaptureSession.StateCallback stateCallback : list) {
                m5750j(stateCallback);
            }
        }

        public void m5756d(AbstractC10234h hVar) {
            this.f32951b.m5647c(hVar);
            if (!this.f32955f.contains(hVar)) {
                this.f32955f.add(hVar);
            }
        }

        public void m5755e(CameraDevice.StateCallback stateCallback) {
            if (!this.f32952c.contains(stateCallback)) {
                this.f32952c.add(stateCallback);
            }
        }

        public void m5754f(AbstractC10203c cVar) {
            this.f32954e.add(cVar);
        }

        public void m5753g(AbstractC10268n0 n0Var) {
            this.f32951b.m5645e(n0Var);
        }

        public void m5752h(AbstractC10287q0 q0Var) {
            this.f32950a.add(q0Var);
        }

        public void m5751i(AbstractC10234h hVar) {
            this.f32951b.m5647c(hVar);
        }

        public void m5750j(CameraCaptureSession.StateCallback stateCallback) {
            if (!this.f32953d.contains(stateCallback)) {
                this.f32953d.add(stateCallback);
            }
        }

        public void m5749k(AbstractC10287q0 q0Var) {
            this.f32950a.add(q0Var);
            this.f32951b.m5644f(q0Var);
        }

        public void m5748l(String str, Object obj) {
            this.f32951b.m5643g(str, obj);
        }

        public C10200b2 m5747m() {
            return new C10200b2(new ArrayList(this.f32950a), this.f32952c, this.f32953d, this.f32955f, this.f32954e, this.f32951b.m5642h());
        }

        public void m5746n() {
            this.f32950a.clear();
            this.f32951b.m5641i();
        }

        public List<AbstractC10234h> m5744p() {
            return Collections.unmodifiableList(this.f32955f);
        }

        public void m5743q(AbstractC10268n0 n0Var) {
            this.f32951b.m5636n(n0Var);
        }

        public void m5742r(int i) {
            this.f32951b.m5635o(i);
        }
    }

    public interface AbstractC10203c {
        void mo5741a(C10200b2 b2Var, EnumC10205e eVar);
    }

    public interface AbstractC10204d {
        void mo5740a(AbstractC10273n2<?> n2Var, C10202b bVar);
    }

    public enum EnumC10205e {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    public static final class C10206f extends C10201a {
        public static final List<Integer> f32959j = Arrays.asList(1, 3);
        public final C4201c f32960g = new C4201c();
        public boolean f32961h = true;
        public boolean f32962i = false;

        public void m5739a(C10200b2 b2Var) {
            C10245j0 f = b2Var.m5764f();
            if (f.m5651f() != -1) {
                this.f32962i = true;
                this.f32951b.m5635o(m5735e(f.m5651f(), this.f32951b.m5637m()));
            }
            this.f32951b.m5648b(b2Var.m5764f().m5652e());
            this.f32952c.addAll(b2Var.m5768b());
            this.f32953d.addAll(b2Var.m5763g());
            this.f32951b.m5649a(b2Var.m5765e());
            this.f32955f.addAll(b2Var.m5762h());
            this.f32954e.addAll(b2Var.m5767c());
            this.f32950a.addAll(b2Var.m5761i());
            this.f32951b.m5638l().addAll(f.m5653d());
            if (!this.f32950a.containsAll(this.f32951b.m5638l())) {
                C0662u1.m40653a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.f32961h = false;
            }
            this.f32951b.m5645e(f.m5654c());
        }

        public C10200b2 m5738b() {
            if (this.f32961h) {
                ArrayList arrayList = new ArrayList(this.f32950a);
                this.f32960g.m28475d(arrayList);
                return new C10200b2(arrayList, this.f32952c, this.f32953d, this.f32955f, this.f32954e, this.f32951b.m5642h());
            }
            throw new IllegalArgumentException("Unsupported session configuration combination");
        }

        public void m5737c() {
            this.f32950a.clear();
            this.f32951b.m5641i();
        }

        public boolean m5736d() {
            return this.f32962i && this.f32961h;
        }

        public final int m5735e(int i, int i2) {
            List<Integer> list = f32959j;
            return list.indexOf(Integer.valueOf(i)) >= list.indexOf(Integer.valueOf(i2)) ? i : i2;
        }
    }

    public C10200b2(List<AbstractC10287q0> list, List<CameraDevice.StateCallback> list2, List<CameraCaptureSession.StateCallback> list3, List<AbstractC10234h> list4, List<AbstractC10203c> list5, C10245j0 j0Var) {
        this.f32944a = list;
        this.f32945b = Collections.unmodifiableList(list2);
        this.f32946c = Collections.unmodifiableList(list3);
        this.f32947d = Collections.unmodifiableList(list4);
        this.f32948e = Collections.unmodifiableList(list5);
        this.f32949f = j0Var;
    }

    public static C10200b2 m5769a() {
        return new C10200b2(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new ArrayList(0), new C10245j0.C10246a().m5642h());
    }

    public List<CameraDevice.StateCallback> m5768b() {
        return this.f32945b;
    }

    public List<AbstractC10203c> m5767c() {
        return this.f32948e;
    }

    public AbstractC10268n0 m5766d() {
        return this.f32949f.m5654c();
    }

    public List<AbstractC10234h> m5765e() {
        return this.f32949f.m5655b();
    }

    public C10245j0 m5764f() {
        return this.f32949f;
    }

    public List<CameraCaptureSession.StateCallback> m5763g() {
        return this.f32946c;
    }

    public List<AbstractC10234h> m5762h() {
        return this.f32947d;
    }

    public List<AbstractC10287q0> m5761i() {
        return Collections.unmodifiableList(this.f32944a);
    }

    public int m5760j() {
        return this.f32949f.m5651f();
    }
}
