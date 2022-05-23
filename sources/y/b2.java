package y;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import androidx.camera.core.t1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import y.j0;

public final class b2 {
    public final List<q0> f26253a;
    public final List<CameraDevice.StateCallback> f26254b;
    public final List<CameraCaptureSession.StateCallback> f26255c;
    public final List<h> f26256d;
    public final List<c> f26257e;
    public final j0 f26258f;

    public static class a {
        public final Set<q0> f26259a = new LinkedHashSet();
        public final j0.a f26260b = new j0.a();
        public final List<CameraDevice.StateCallback> f26261c = new ArrayList();
        public final List<CameraCaptureSession.StateCallback> f26262d = new ArrayList();
        public final List<c> f26263e = new ArrayList();
        public final List<h> f26264f = new ArrayList();
    }

    public static class b extends a {
        public static b o(n2<?> n2Var) {
            d A = n2Var.A(null);
            if (A != null) {
                b bVar = new b();
                A.a(n2Var, bVar);
                return bVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + n2Var.q(n2Var.toString()));
        }

        public void a(Collection<CameraDevice.StateCallback> collection) {
            for (CameraDevice.StateCallback stateCallback : collection) {
                e(stateCallback);
            }
        }

        public void b(Collection<h> collection) {
            this.f26260b.a(collection);
        }

        public void c(List<CameraCaptureSession.StateCallback> list) {
            for (CameraCaptureSession.StateCallback stateCallback : list) {
                j(stateCallback);
            }
        }

        public void d(h hVar) {
            this.f26260b.c(hVar);
            if (!this.f26264f.contains(hVar)) {
                this.f26264f.add(hVar);
            }
        }

        public void e(CameraDevice.StateCallback stateCallback) {
            if (!this.f26261c.contains(stateCallback)) {
                this.f26261c.add(stateCallback);
            }
        }

        public void f(c cVar) {
            this.f26263e.add(cVar);
        }

        public void g(n0 n0Var) {
            this.f26260b.e(n0Var);
        }

        public void h(q0 q0Var) {
            this.f26259a.add(q0Var);
        }

        public void i(h hVar) {
            this.f26260b.c(hVar);
        }

        public void j(CameraCaptureSession.StateCallback stateCallback) {
            if (!this.f26262d.contains(stateCallback)) {
                this.f26262d.add(stateCallback);
            }
        }

        public void k(q0 q0Var) {
            this.f26259a.add(q0Var);
            this.f26260b.f(q0Var);
        }

        public void l(String str, Object obj) {
            this.f26260b.g(str, obj);
        }

        public b2 m() {
            return new b2(new ArrayList(this.f26259a), this.f26261c, this.f26262d, this.f26264f, this.f26263e, this.f26260b.h());
        }

        public void n() {
            this.f26259a.clear();
            this.f26260b.i();
        }

        public List<h> p() {
            return Collections.unmodifiableList(this.f26264f);
        }

        public void q(n0 n0Var) {
            this.f26260b.n(n0Var);
        }

        public void r(int i10) {
            this.f26260b.o(i10);
        }
    }

    public interface c {
        void a(b2 b2Var, e eVar);
    }

    public interface d {
        void a(n2<?> n2Var, b bVar);
    }

    public enum e {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    public static final class f extends a {
        public static final List<Integer> f26268j = Arrays.asList(1, 3);
        public final f0.c f26269g = new f0.c();
        public boolean f26270h = true;
        public boolean f26271i = false;

        public void a(b2 b2Var) {
            j0 f10 = b2Var.f();
            if (f10.f() != -1) {
                this.f26271i = true;
                this.f26260b.o(e(f10.f(), this.f26260b.m()));
            }
            this.f26260b.b(b2Var.f().e());
            this.f26261c.addAll(b2Var.b());
            this.f26262d.addAll(b2Var.g());
            this.f26260b.a(b2Var.e());
            this.f26264f.addAll(b2Var.h());
            this.f26263e.addAll(b2Var.c());
            this.f26259a.addAll(b2Var.i());
            this.f26260b.l().addAll(f10.d());
            if (!this.f26259a.containsAll(this.f26260b.l())) {
                t1.a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.f26270h = false;
            }
            this.f26260b.e(f10.c());
        }

        public b2 b() {
            if (this.f26270h) {
                ArrayList arrayList = new ArrayList(this.f26259a);
                this.f26269g.d(arrayList);
                return new b2(arrayList, this.f26261c, this.f26262d, this.f26264f, this.f26263e, this.f26260b.h());
            }
            throw new IllegalArgumentException("Unsupported session configuration combination");
        }

        public void c() {
            this.f26259a.clear();
            this.f26260b.i();
        }

        public boolean d() {
            return this.f26271i && this.f26270h;
        }

        public final int e(int i10, int i11) {
            List<Integer> list = f26268j;
            return list.indexOf(Integer.valueOf(i10)) >= list.indexOf(Integer.valueOf(i11)) ? i10 : i11;
        }
    }

    public b2(List<q0> list, List<CameraDevice.StateCallback> list2, List<CameraCaptureSession.StateCallback> list3, List<h> list4, List<c> list5, j0 j0Var) {
        this.f26253a = list;
        this.f26254b = Collections.unmodifiableList(list2);
        this.f26255c = Collections.unmodifiableList(list3);
        this.f26256d = Collections.unmodifiableList(list4);
        this.f26257e = Collections.unmodifiableList(list5);
        this.f26258f = j0Var;
    }

    public static b2 a() {
        return new b2(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new ArrayList(0), new j0.a().h());
    }

    public List<CameraDevice.StateCallback> b() {
        return this.f26254b;
    }

    public List<c> c() {
        return this.f26257e;
    }

    public n0 d() {
        return this.f26258f.c();
    }

    public List<h> e() {
        return this.f26258f.b();
    }

    public j0 f() {
        return this.f26258f;
    }

    public List<CameraCaptureSession.StateCallback> g() {
        return this.f26255c;
    }

    public List<h> h() {
        return this.f26256d;
    }

    public List<q0> i() {
        return Collections.unmodifiableList(this.f26253a);
    }

    public int j() {
        return this.f26258f.f();
    }
}
