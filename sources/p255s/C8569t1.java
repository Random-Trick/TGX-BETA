package p255s;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

public class C8569t1 {
    public final Executor f27764a;
    public final Object f27765b = new Object();
    public final Set<AbstractC8508j2> f27766c = new LinkedHashSet();
    public final Set<AbstractC8508j2> f27767d = new LinkedHashSet();
    public final Set<AbstractC8508j2> f27768e = new LinkedHashSet();
    public final CameraDevice.StateCallback f27769f = new C8570a();

    public class C8570a extends CameraDevice.StateCallback {
        public C8570a() {
        }

        public final void m12082b() {
            List<AbstractC8508j2> g;
            synchronized (C8569t1.this.f27765b) {
                g = C8569t1.this.m12089g();
                C8569t1.this.f27768e.clear();
                C8569t1.this.f27766c.clear();
                C8569t1.this.f27767d.clear();
            }
            for (AbstractC8508j2 j2Var : g) {
                j2Var.mo12191d();
            }
        }

        public final void m12081c() {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (C8569t1.this.f27765b) {
                linkedHashSet.addAll(C8569t1.this.f27768e);
                linkedHashSet.addAll(C8569t1.this.f27766c);
            }
            C8569t1.this.f27764a.execute(new Runnable() {
                @Override
                public final void run() {
                    C8569t1.m12094b(linkedHashSet);
                }
            });
        }

        @Override
        public void onClosed(CameraDevice cameraDevice) {
            m12082b();
        }

        @Override
        public void onDisconnected(CameraDevice cameraDevice) {
            m12081c();
            m12082b();
        }

        @Override
        public void onError(CameraDevice cameraDevice, int i) {
            m12081c();
            m12082b();
        }

        @Override
        public void onOpened(CameraDevice cameraDevice) {
        }
    }

    public C8569t1(Executor executor) {
        this.f27764a = executor;
    }

    public static void m12094b(Set<AbstractC8508j2> set) {
        for (AbstractC8508j2 j2Var : set) {
            j2Var.mo12192c().mo12035p(j2Var);
        }
    }

    public final void m12095a(AbstractC8508j2 j2Var) {
        AbstractC8508j2 next;
        Iterator<AbstractC8508j2> it = m12089g().iterator();
        while (it.hasNext() && (next = it.next()) != j2Var) {
            next.mo12191d();
        }
    }

    public CameraDevice.StateCallback m12093c() {
        return this.f27769f;
    }

    public List<AbstractC8508j2> m12092d() {
        ArrayList arrayList;
        synchronized (this.f27765b) {
            arrayList = new ArrayList(this.f27766c);
        }
        return arrayList;
    }

    public List<AbstractC8508j2> m12091e() {
        ArrayList arrayList;
        synchronized (this.f27765b) {
            arrayList = new ArrayList(this.f27767d);
        }
        return arrayList;
    }

    public List<AbstractC8508j2> m12090f() {
        ArrayList arrayList;
        synchronized (this.f27765b) {
            arrayList = new ArrayList(this.f27768e);
        }
        return arrayList;
    }

    public List<AbstractC8508j2> m12089g() {
        ArrayList arrayList;
        synchronized (this.f27765b) {
            arrayList = new ArrayList();
            arrayList.addAll(m12092d());
            arrayList.addAll(m12090f());
        }
        return arrayList;
    }

    public void m12088h(AbstractC8508j2 j2Var) {
        synchronized (this.f27765b) {
            this.f27766c.remove(j2Var);
            this.f27767d.remove(j2Var);
        }
    }

    public void m12087i(AbstractC8508j2 j2Var) {
        synchronized (this.f27765b) {
            this.f27767d.add(j2Var);
        }
    }

    public void m12086j(AbstractC8508j2 j2Var) {
        m12095a(j2Var);
        synchronized (this.f27765b) {
            this.f27768e.remove(j2Var);
        }
    }

    public void m12085k(AbstractC8508j2 j2Var) {
        synchronized (this.f27765b) {
            this.f27766c.add(j2Var);
            this.f27768e.remove(j2Var);
        }
        m12095a(j2Var);
    }

    public void m12084l(AbstractC8508j2 j2Var) {
        synchronized (this.f27765b) {
            this.f27768e.add(j2Var);
        }
    }
}
