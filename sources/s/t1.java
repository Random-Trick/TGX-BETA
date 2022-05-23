package s;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

public class t1 {
    public final Executor f22280a;
    public final Object f22281b = new Object();
    public final Set<j2> f22282c = new LinkedHashSet();
    public final Set<j2> f22283d = new LinkedHashSet();
    public final Set<j2> f22284e = new LinkedHashSet();
    public final CameraDevice.StateCallback f22285f = new a();

    public class a extends CameraDevice.StateCallback {
        public a() {
        }

        public final void b() {
            List<j2> g10;
            synchronized (t1.this.f22281b) {
                g10 = t1.this.g();
                t1.this.f22284e.clear();
                t1.this.f22282c.clear();
                t1.this.f22283d.clear();
            }
            for (j2 j2Var : g10) {
                j2Var.d();
            }
        }

        public final void c() {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (t1.this.f22281b) {
                linkedHashSet.addAll(t1.this.f22284e);
                linkedHashSet.addAll(t1.this.f22282c);
            }
            t1.this.f22280a.execute(new Runnable() {
                @Override
                public final void run() {
                    t1.b(linkedHashSet);
                }
            });
        }

        @Override
        public void onClosed(CameraDevice cameraDevice) {
            b();
        }

        @Override
        public void onDisconnected(CameraDevice cameraDevice) {
            c();
            b();
        }

        @Override
        public void onError(CameraDevice cameraDevice, int i10) {
            c();
            b();
        }

        @Override
        public void onOpened(CameraDevice cameraDevice) {
        }
    }

    public t1(Executor executor) {
        this.f22280a = executor;
    }

    public static void b(Set<j2> set) {
        for (j2 j2Var : set) {
            j2Var.c().p(j2Var);
        }
    }

    public final void a(j2 j2Var) {
        j2 next;
        Iterator<j2> it = g().iterator();
        while (it.hasNext() && (next = it.next()) != j2Var) {
            next.d();
        }
    }

    public CameraDevice.StateCallback c() {
        return this.f22285f;
    }

    public List<j2> d() {
        ArrayList arrayList;
        synchronized (this.f22281b) {
            arrayList = new ArrayList(this.f22282c);
        }
        return arrayList;
    }

    public List<j2> e() {
        ArrayList arrayList;
        synchronized (this.f22281b) {
            arrayList = new ArrayList(this.f22283d);
        }
        return arrayList;
    }

    public List<j2> f() {
        ArrayList arrayList;
        synchronized (this.f22281b) {
            arrayList = new ArrayList(this.f22284e);
        }
        return arrayList;
    }

    public List<j2> g() {
        ArrayList arrayList;
        synchronized (this.f22281b) {
            arrayList = new ArrayList();
            arrayList.addAll(d());
            arrayList.addAll(f());
        }
        return arrayList;
    }

    public void h(j2 j2Var) {
        synchronized (this.f22281b) {
            this.f22282c.remove(j2Var);
            this.f22283d.remove(j2Var);
        }
    }

    public void i(j2 j2Var) {
        synchronized (this.f22281b) {
            this.f22283d.add(j2Var);
        }
    }

    public void j(j2 j2Var) {
        a(j2Var);
        synchronized (this.f22281b) {
            this.f22284e.remove(j2Var);
        }
    }

    public void k(j2 j2Var) {
        synchronized (this.f22281b) {
            this.f22282c.add(j2Var);
            this.f22284e.remove(j2Var);
        }
        a(j2Var);
    }

    public void l(j2 j2Var) {
        synchronized (this.f22281b) {
            this.f22284e.add(j2Var);
        }
    }
}
