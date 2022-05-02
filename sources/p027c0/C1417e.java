package p027c0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.AbstractC0598k;
import androidx.camera.core.AbstractC0615m;
import androidx.camera.core.AbstractC0642r;
import androidx.camera.core.AbstractC0688y2;
import androidx.camera.core.C0519c2;
import androidx.camera.core.C0532e1;
import androidx.camera.core.C0613l3;
import androidx.camera.core.C0662u1;
import androidx.camera.core.C0676x2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import p001a0.C0003a;
import p016b1.AbstractC1125a;
import p016b1.C1132h;
import p336y.AbstractC10194a0;
import p336y.AbstractC10208c0;
import p336y.AbstractC10268n0;
import p336y.AbstractC10273n2;
import p336y.AbstractC10278o2;
import p336y.AbstractC10295s;
import p336y.AbstractC10312x;
import p336y.AbstractC10318y;
import p336y.C10308w;

public final class C1417e implements AbstractC0598k {
    public final AbstractC10278o2 f5227M;
    public final C1419b f5228N;
    public C0613l3 f5230P;
    public AbstractC10208c0 f5236a;
    public final LinkedHashSet<AbstractC10208c0> f5237b;
    public final AbstractC10318y f5238c;
    public final List<AbstractC0688y2> f5229O = new ArrayList();
    public AbstractC10295s f5231Q = C10308w.m5498a();
    public final Object f5232R = new Object();
    public boolean f5233S = true;
    public AbstractC10268n0 f5234T = null;
    public List<AbstractC0688y2> f5235U = new ArrayList();

    public static final class C1418a extends Exception {
        public C1418a(String str) {
            super(str);
        }
    }

    public static final class C1419b {
        public final List<String> f5239a = new ArrayList();

        public C1419b(LinkedHashSet<AbstractC10208c0> linkedHashSet) {
            Iterator<AbstractC10208c0> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                this.f5239a.add(it.next().mo5727l().mo5778a());
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof C1419b) {
                return this.f5239a.equals(((C1419b) obj).f5239a);
            }
            return false;
        }

        public int hashCode() {
            return this.f5239a.hashCode() * 53;
        }
    }

    public static class C1420c {
        public AbstractC10273n2<?> f5240a;
        public AbstractC10273n2<?> f5241b;

        public C1420c(AbstractC10273n2<?> n2Var, AbstractC10273n2<?> n2Var2) {
            this.f5240a = n2Var;
            this.f5241b = n2Var2;
        }
    }

    public C1417e(LinkedHashSet<AbstractC10208c0> linkedHashSet, AbstractC10318y yVar, AbstractC10278o2 o2Var) {
        this.f5236a = linkedHashSet.iterator().next();
        LinkedHashSet<AbstractC10208c0> linkedHashSet2 = new LinkedHashSet<>(linkedHashSet);
        this.f5237b = linkedHashSet2;
        this.f5228N = new C1419b(linkedHashSet2);
        this.f5238c = yVar;
        this.f5227M = o2Var;
    }

    public static void m36986E(Surface surface, SurfaceTexture surfaceTexture, C0676x2.AbstractC0682f fVar) {
        surface.release();
        surfaceTexture.release();
    }

    public static void m36985F(C0676x2 x2Var) {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(x2Var.m40617l().getWidth(), x2Var.m40617l().getHeight());
        surfaceTexture.detachFromGLContext();
        final Surface surface = new Surface(surfaceTexture);
        x2Var.m40607v(surface, C0003a.m42611a(), new AbstractC1125a() {
            @Override
            public final void mo1208a(Object obj) {
                C1417e.m36986E(surface, surfaceTexture, (C0676x2.AbstractC0682f) obj);
            }
        });
    }

    public static Matrix m36972p(Rect rect, Size size) {
        C1132h.m38325b(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static C1419b m36966v(LinkedHashSet<AbstractC10208c0> linkedHashSet) {
        return new C1419b(linkedHashSet);
    }

    public final boolean m36990A(List<AbstractC0688y2> list) {
        boolean z = false;
        boolean z2 = false;
        for (AbstractC0688y2 y2Var : list) {
            if (m36987D(y2Var)) {
                z = true;
            } else if (m36988C(y2Var)) {
                z2 = true;
            }
        }
        return z && !z2;
    }

    public final boolean m36989B(List<AbstractC0688y2> list) {
        boolean z = false;
        boolean z2 = false;
        for (AbstractC0688y2 y2Var : list) {
            if (m36987D(y2Var)) {
                z2 = true;
            } else if (m36988C(y2Var)) {
                z = true;
            }
        }
        return z && !z2;
    }

    public final boolean m36988C(AbstractC0688y2 y2Var) {
        return y2Var instanceof C0532e1;
    }

    public final boolean m36987D(AbstractC0688y2 y2Var) {
        return y2Var instanceof C0519c2;
    }

    public void m36984G(Collection<AbstractC0688y2> collection) {
        synchronized (this.f5232R) {
            m36968t(new ArrayList(collection));
            if (m36962z()) {
                this.f5235U.removeAll(collection);
                try {
                    m36977f(Collections.emptyList());
                } catch (C1418a unused) {
                    throw new IllegalArgumentException("Failed to add extra fake Preview or ImageCapture use case!");
                }
            }
        }
    }

    public final void m36983H() {
        synchronized (this.f5232R) {
            if (this.f5234T != null) {
                this.f5236a.mo5731h().mo5485h(this.f5234T);
            }
        }
    }

    public void m36982I(C0613l3 l3Var) {
        synchronized (this.f5232R) {
            this.f5230P = l3Var;
        }
    }

    public final void m36981J(Map<AbstractC0688y2, Size> map, Collection<AbstractC0688y2> collection) {
        synchronized (this.f5232R) {
            if (this.f5230P != null) {
                Map<AbstractC0688y2, Rect> a = C1429n.m36957a(this.f5236a.mo5731h().mo5490c(), this.f5236a.mo5727l().mo5776c().intValue() == 0, this.f5230P.m40746a(), this.f5236a.mo5727l().mo12262e(this.f5230P.m40744c()), this.f5230P.m40743d(), this.f5230P.m40745b(), map);
                for (AbstractC0688y2 y2Var : collection) {
                    y2Var.mo40587G((Rect) C1132h.m38322e(a.get(y2Var)));
                    y2Var.mo40588F(m36972p(this.f5236a.mo5731h().mo5490c(), map.get(y2Var)));
                }
            }
        }
    }

    @Override
    public AbstractC0642r mo5734a() {
        return this.f5236a.mo5727l();
    }

    @Override
    public AbstractC0615m mo12381b() {
        return this.f5236a.mo5731h();
    }

    public void m36980c(AbstractC10295s sVar) {
        synchronized (this.f5232R) {
            if (sVar == null) {
                sVar = C10308w.m5498a();
            }
            if (!this.f5229O.isEmpty() && !this.f5231Q.mo5494z().equals(sVar.mo5494z())) {
                throw new IllegalStateException("Need to unbind all use cases before binding with extension enabled");
            }
            this.f5231Q = sVar;
            this.f5236a.mo5733c(sVar);
        }
    }

    public void m36977f(Collection<AbstractC0688y2> collection) {
        synchronized (this.f5232R) {
            ArrayList<AbstractC0688y2> arrayList = new ArrayList();
            for (AbstractC0688y2 y2Var : collection) {
                if (this.f5229O.contains(y2Var)) {
                    C0662u1.m40653a("CameraUseCaseAdapter", "Attempting to attach already attached UseCase");
                } else {
                    arrayList.add(y2Var);
                }
            }
            List<AbstractC0688y2> arrayList2 = new ArrayList<>(this.f5229O);
            List<AbstractC0688y2> emptyList = Collections.emptyList();
            List<AbstractC0688y2> emptyList2 = Collections.emptyList();
            if (m36962z()) {
                arrayList2.removeAll(this.f5235U);
                arrayList2.addAll(arrayList);
                emptyList = m36973o(arrayList2, new ArrayList<>(this.f5235U));
                ArrayList arrayList3 = new ArrayList(emptyList);
                arrayList3.removeAll(this.f5235U);
                arrayList.addAll(arrayList3);
                emptyList2 = new ArrayList<>(this.f5235U);
                emptyList2.removeAll(emptyList);
            }
            Map<AbstractC0688y2, C1420c> x = m36964x(arrayList, this.f5231Q.mo5497h(), this.f5227M);
            try {
                List<AbstractC0688y2> arrayList4 = new ArrayList<>(this.f5229O);
                arrayList4.removeAll(emptyList2);
                Map<AbstractC0688y2, Size> q = m36971q(this.f5236a.mo5727l(), arrayList, arrayList4, x);
                m36981J(q, collection);
                this.f5235U = emptyList;
                m36968t(emptyList2);
                for (AbstractC0688y2 y2Var2 : arrayList) {
                    C1420c cVar = x.get(y2Var2);
                    y2Var2.m40563v(this.f5236a, cVar.f5240a, cVar.f5241b);
                    y2Var2.m40585I((Size) C1132h.m38322e(q.get(y2Var2)));
                }
                this.f5229O.addAll(arrayList);
                if (this.f5233S) {
                    this.f5236a.mo5729j(arrayList);
                }
                for (AbstractC0688y2 y2Var3 : arrayList) {
                    y2Var3.m40565t();
                }
            } catch (IllegalArgumentException e) {
                throw new C1418a(e.getMessage());
            }
        }
    }

    public void m36976i(boolean z) {
        this.f5236a.mo5730i(z);
    }

    public void m36975m() {
        synchronized (this.f5232R) {
            if (!this.f5233S) {
                this.f5236a.mo5729j(this.f5229O);
                m36983H();
                for (AbstractC0688y2 y2Var : this.f5229O) {
                    y2Var.m40565t();
                }
                this.f5233S = true;
            }
        }
    }

    public final void m36974n() {
        synchronized (this.f5232R) {
            AbstractC10312x h = this.f5236a.mo5731h();
            this.f5234T = h.mo5487f();
            h.mo5486g();
        }
    }

    public final List<AbstractC0688y2> m36973o(List<AbstractC0688y2> list, List<AbstractC0688y2> list2) {
        ArrayList arrayList = new ArrayList(list2);
        boolean B = m36989B(list);
        boolean A = m36990A(list);
        AbstractC0688y2 y2Var = null;
        AbstractC0688y2 y2Var2 = null;
        for (AbstractC0688y2 y2Var3 : list2) {
            if (m36987D(y2Var3)) {
                y2Var = y2Var3;
            } else if (m36988C(y2Var3)) {
                y2Var2 = y2Var3;
            }
        }
        if (B && y2Var == null) {
            arrayList.add(m36969s());
        } else if (!B && y2Var != null) {
            arrayList.remove(y2Var);
        }
        if (A && y2Var2 == null) {
            arrayList.add(m36970r());
        } else if (!A && y2Var2 != null) {
            arrayList.remove(y2Var2);
        }
        return arrayList;
    }

    public final Map<AbstractC0688y2, Size> m36971q(AbstractC10194a0 a0Var, List<AbstractC0688y2> list, List<AbstractC0688y2> list2, Map<AbstractC0688y2, C1420c> map) {
        ArrayList arrayList = new ArrayList();
        String a = a0Var.mo5778a();
        HashMap hashMap = new HashMap();
        for (AbstractC0688y2 y2Var : list2) {
            arrayList.add(this.f5238c.mo5478a(a, y2Var.m40577h(), y2Var.m40583b()));
            hashMap.put(y2Var, y2Var.m40583b());
        }
        if (!list.isEmpty()) {
            HashMap hashMap2 = new HashMap();
            for (AbstractC0688y2 y2Var2 : list) {
                C1420c cVar = map.get(y2Var2);
                hashMap2.put(y2Var2.m40569p(a0Var, cVar.f5240a, cVar.f5241b), y2Var2);
            }
            Map<AbstractC10273n2<?>, Size> b = this.f5238c.mo5477b(a, arrayList, new ArrayList(hashMap2.keySet()));
            for (Map.Entry entry : hashMap2.entrySet()) {
                hashMap.put((AbstractC0688y2) entry.getValue(), b.get(entry.getKey()));
            }
        }
        return hashMap;
    }

    public final C0532e1 m36970r() {
        return new C0532e1.C0540h().m40905k("ImageCapture-Extra").m40913c();
    }

    public final C0519c2 m36969s() {
        C0519c2 c = new C0519c2.C0521b().m40969i("Preview-Extra").m40975c();
        c.m40978S(C1415c.f5224a);
        return c;
    }

    public final void m36968t(List<AbstractC0688y2> list) {
        synchronized (this.f5232R) {
            if (!list.isEmpty()) {
                this.f5236a.mo5728k(list);
                for (AbstractC0688y2 y2Var : list) {
                    if (this.f5229O.contains(y2Var)) {
                        y2Var.m40560y(this.f5236a);
                    } else {
                        C0662u1.m40651c("CameraUseCaseAdapter", "Attempting to detach non-attached UseCase: " + y2Var);
                    }
                }
                this.f5229O.removeAll(list);
            }
        }
    }

    public void m36967u() {
        synchronized (this.f5232R) {
            if (this.f5233S) {
                this.f5236a.mo5728k(new ArrayList(this.f5229O));
                m36974n();
                this.f5233S = false;
            }
        }
    }

    public C1419b m36965w() {
        return this.f5228N;
    }

    public final Map<AbstractC0688y2, C1420c> m36964x(List<AbstractC0688y2> list, AbstractC10278o2 o2Var, AbstractC10278o2 o2Var2) {
        HashMap hashMap = new HashMap();
        for (AbstractC0688y2 y2Var : list) {
            hashMap.put(y2Var, new C1420c(y2Var.mo40578g(false, o2Var), y2Var.mo40578g(true, o2Var2)));
        }
        return hashMap;
    }

    public List<AbstractC0688y2> m36963y() {
        ArrayList arrayList;
        synchronized (this.f5232R) {
            arrayList = new ArrayList(this.f5229O);
        }
        return arrayList;
    }

    public final boolean m36962z() {
        boolean z;
        synchronized (this.f5232R) {
            z = true;
            if (this.f5231Q.mo5496r() != 1) {
                z = false;
            }
        }
        return z;
    }
}
