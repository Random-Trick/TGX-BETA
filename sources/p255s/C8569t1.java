package p255s;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

public class C8569t1 {
    public final Executor f27767a;
    public final Object f27768b = new Object();
    public final Set<AbstractC8508j2> f27769c = new LinkedHashSet();
    public final Set<AbstractC8508j2> f27770d = new LinkedHashSet();
    public final Set<AbstractC8508j2> f27771e = new LinkedHashSet();
    public final CameraDevice.StateCallback f27772f = new C8570a();

    public class C8570a extends CameraDevice.StateCallback {
        public C8570a() {
        }

        public final void m12081b() {
            List<AbstractC8508j2> g;
            synchronized (C8569t1.this.f27768b) {
                g = C8569t1.this.m12088g();
                C8569t1.this.f27771e.clear();
                C8569t1.this.f27769c.clear();
                C8569t1.this.f27770d.clear();
            }
            for (AbstractC8508j2 j2Var : g) {
                j2Var.mo12190d();
            }
        }

        public final void m12080c() {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (C8569t1.this.f27768b) {
                linkedHashSet.addAll(C8569t1.this.f27771e);
                linkedHashSet.addAll(C8569t1.this.f27769c);
            }
            C8569t1.this.f27767a.execute(new Runnable() {
                @Override
                public final void run() {
                    C8569t1.m12093b(linkedHashSet);
                }
            });
        }

        @Override
        public void onClosed(CameraDevice cameraDevice) {
            m12081b();
        }

        @Override
        public void onDisconnected(CameraDevice cameraDevice) {
            m12080c();
            m12081b();
        }

        @Override
        public void onError(CameraDevice cameraDevice, int i) {
            m12080c();
            m12081b();
        }

        @Override
        public void onOpened(CameraDevice cameraDevice) {
        }
    }

    public C8569t1(Executor executor) {
        this.f27767a = executor;
    }

    public static void m12093b(Set<AbstractC8508j2> set) {
        for (AbstractC8508j2 j2Var : set) {
            j2Var.mo12191c().mo12034p(j2Var);
        }
    }

    public final void m12094a(AbstractC8508j2 j2Var) {
        AbstractC8508j2 next;
        Iterator<AbstractC8508j2> it = m12088g().iterator();
        while (it.hasNext() && (next = it.next()) != j2Var) {
            next.mo12190d();
        }
    }

    public CameraDevice.StateCallback m12092c() {
        return this.f27772f;
    }

    public List<AbstractC8508j2> m12091d() {
        ArrayList arrayList;
        synchronized (this.f27768b) {
            arrayList = new ArrayList(this.f27769c);
        }
        return arrayList;
    }

    public List<AbstractC8508j2> m12090e() {
        ArrayList arrayList;
        synchronized (this.f27768b) {
            arrayList = new ArrayList(this.f27770d);
        }
        return arrayList;
    }

    public List<AbstractC8508j2> m12089f() {
        ArrayList arrayList;
        synchronized (this.f27768b) {
            arrayList = new ArrayList(this.f27771e);
        }
        return arrayList;
    }

    public List<AbstractC8508j2> m12088g() {
        ArrayList arrayList;
        synchronized (this.f27768b) {
            arrayList = new ArrayList();
            arrayList.addAll(m12091d());
            arrayList.addAll(m12089f());
        }
        return arrayList;
    }

    public void m12087h(AbstractC8508j2 j2Var) {
        synchronized (this.f27768b) {
            this.f27769c.remove(j2Var);
            this.f27770d.remove(j2Var);
        }
    }

    public void m12086i(AbstractC8508j2 j2Var) {
        synchronized (this.f27768b) {
            this.f27770d.add(j2Var);
        }
    }

    public void m12085j(AbstractC8508j2 j2Var) {
        m12094a(j2Var);
        synchronized (this.f27768b) {
            this.f27771e.remove(j2Var);
        }
    }

    public void m12084k(AbstractC8508j2 j2Var) {
        synchronized (this.f27768b) {
            this.f27769c.add(j2Var);
            this.f27771e.remove(j2Var);
        }
        m12094a(j2Var);
    }

    public void m12083l(AbstractC8508j2 j2Var) {
        synchronized (this.f27768b) {
            this.f27771e.add(j2Var);
        }
    }
}
