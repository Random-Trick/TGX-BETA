package c0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.b2;
import androidx.camera.core.d1;
import androidx.camera.core.k;
import androidx.camera.core.k3;
import androidx.camera.core.m;
import androidx.camera.core.r;
import androidx.camera.core.t1;
import androidx.camera.core.w2;
import androidx.camera.core.x2;
import b1.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import y.a0;
import y.c0;
import y.n0;
import y.n2;
import y.o2;
import y.s;
import y.w;
import y.x;
import y.y;

public final class e implements k {
    public final o2 M;
    public final b N;
    public k3 P;
    public c0 f4201a;
    public final LinkedHashSet<c0> f4202b;
    public final y f4203c;
    public final List<x2> O = new ArrayList();
    public s Q = w.a();
    public final Object R = new Object();
    public boolean S = true;
    public n0 T = null;
    public List<x2> U = new ArrayList();

    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public static final class b {
        public final List<String> f4204a = new ArrayList();

        public b(LinkedHashSet<c0> linkedHashSet) {
            Iterator<c0> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                this.f4204a.add(it.next().l().a());
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f4204a.equals(((b) obj).f4204a);
            }
            return false;
        }

        public int hashCode() {
            return this.f4204a.hashCode() * 53;
        }
    }

    public static class c {
        public n2<?> f4205a;
        public n2<?> f4206b;

        public c(n2<?> n2Var, n2<?> n2Var2) {
            this.f4205a = n2Var;
            this.f4206b = n2Var2;
        }
    }

    public e(LinkedHashSet<c0> linkedHashSet, y yVar, o2 o2Var) {
        this.f4201a = linkedHashSet.iterator().next();
        LinkedHashSet<c0> linkedHashSet2 = new LinkedHashSet<>(linkedHashSet);
        this.f4202b = linkedHashSet2;
        this.N = new b(linkedHashSet2);
        this.f4203c = yVar;
        this.M = o2Var;
    }

    public static void E(Surface surface, SurfaceTexture surfaceTexture, w2.f fVar) {
        surface.release();
        surfaceTexture.release();
    }

    public static void F(w2 w2Var) {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(w2Var.l().getWidth(), w2Var.l().getHeight());
        surfaceTexture.detachFromGLContext();
        final Surface surface = new Surface(surfaceTexture);
        w2Var.v(surface, a0.a.a(), new b1.a() {
            @Override
            public final void a(Object obj) {
                e.E(surface, surfaceTexture, (w2.f) obj);
            }
        });
    }

    public static Matrix p(Rect rect, Size size) {
        h.b(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static b v(LinkedHashSet<c0> linkedHashSet) {
        return new b(linkedHashSet);
    }

    public final boolean A(List<x2> list) {
        boolean z10 = false;
        boolean z11 = false;
        for (x2 x2Var : list) {
            if (D(x2Var)) {
                z10 = true;
            } else if (C(x2Var)) {
                z11 = true;
            }
        }
        return z10 && !z11;
    }

    public final boolean B(List<x2> list) {
        boolean z10 = false;
        boolean z11 = false;
        for (x2 x2Var : list) {
            if (D(x2Var)) {
                z11 = true;
            } else if (C(x2Var)) {
                z10 = true;
            }
        }
        return z10 && !z11;
    }

    public final boolean C(x2 x2Var) {
        return x2Var instanceof d1;
    }

    public final boolean D(x2 x2Var) {
        return x2Var instanceof b2;
    }

    public void G(Collection<x2> collection) {
        synchronized (this.R) {
            t(new ArrayList(collection));
            if (z()) {
                this.U.removeAll(collection);
                try {
                    f(Collections.emptyList());
                } catch (a unused) {
                    throw new IllegalArgumentException("Failed to add extra fake Preview or ImageCapture use case!");
                }
            }
        }
    }

    public final void H() {
        synchronized (this.R) {
            if (this.T != null) {
                this.f4201a.h().h(this.T);
            }
        }
    }

    public void I(k3 k3Var) {
        synchronized (this.R) {
            this.P = k3Var;
        }
    }

    public final void J(Map<x2, Size> map, Collection<x2> collection) {
        synchronized (this.R) {
            if (this.P != null) {
                Map<x2, Rect> a10 = n.a(this.f4201a.h().c(), this.f4201a.l().c().intValue() == 0, this.P.a(), this.f4201a.l().e(this.P.c()), this.P.d(), this.P.b(), map);
                for (x2 x2Var : collection) {
                    x2Var.G((Rect) h.e(a10.get(x2Var)));
                    x2Var.F(p(this.f4201a.h().c(), map.get(x2Var)));
                }
            }
        }
    }

    @Override
    public r a() {
        return this.f4201a.l();
    }

    @Override
    public m b() {
        return this.f4201a.h();
    }

    public void c(s sVar) {
        synchronized (this.R) {
            if (sVar == null) {
                sVar = w.a();
            }
            if (!this.O.isEmpty() && !this.Q.z().equals(sVar.z())) {
                throw new IllegalStateException("Need to unbind all use cases before binding with extension enabled");
            }
            this.Q = sVar;
            this.f4201a.c(sVar);
        }
    }

    public void f(Collection<x2> collection) {
        synchronized (this.R) {
            ArrayList<x2> arrayList = new ArrayList();
            for (x2 x2Var : collection) {
                if (this.O.contains(x2Var)) {
                    t1.a("CameraUseCaseAdapter", "Attempting to attach already attached UseCase");
                } else {
                    arrayList.add(x2Var);
                }
            }
            List<x2> arrayList2 = new ArrayList<>(this.O);
            List<x2> emptyList = Collections.emptyList();
            List<x2> emptyList2 = Collections.emptyList();
            if (z()) {
                arrayList2.removeAll(this.U);
                arrayList2.addAll(arrayList);
                emptyList = o(arrayList2, new ArrayList<>(this.U));
                ArrayList arrayList3 = new ArrayList(emptyList);
                arrayList3.removeAll(this.U);
                arrayList.addAll(arrayList3);
                emptyList2 = new ArrayList<>(this.U);
                emptyList2.removeAll(emptyList);
            }
            Map<x2, c> x10 = x(arrayList, this.Q.h(), this.M);
            try {
                List<x2> arrayList4 = new ArrayList<>(this.O);
                arrayList4.removeAll(emptyList2);
                Map<x2, Size> q10 = q(this.f4201a.l(), arrayList, arrayList4, x10);
                J(q10, collection);
                this.U = emptyList;
                t(emptyList2);
                for (x2 x2Var2 : arrayList) {
                    c cVar = x10.get(x2Var2);
                    x2Var2.v(this.f4201a, cVar.f4205a, cVar.f4206b);
                    x2Var2.I((Size) h.e(q10.get(x2Var2)));
                }
                this.O.addAll(arrayList);
                if (this.S) {
                    this.f4201a.j(arrayList);
                }
                for (x2 x2Var3 : arrayList) {
                    x2Var3.t();
                }
            } catch (IllegalArgumentException e10) {
                throw new a(e10.getMessage());
            }
        }
    }

    public void i(boolean z10) {
        this.f4201a.i(z10);
    }

    public void m() {
        synchronized (this.R) {
            if (!this.S) {
                this.f4201a.j(this.O);
                H();
                for (x2 x2Var : this.O) {
                    x2Var.t();
                }
                this.S = true;
            }
        }
    }

    public final void n() {
        synchronized (this.R) {
            x h10 = this.f4201a.h();
            this.T = h10.f();
            h10.g();
        }
    }

    public final List<x2> o(List<x2> list, List<x2> list2) {
        ArrayList arrayList = new ArrayList(list2);
        boolean B = B(list);
        boolean A = A(list);
        x2 x2Var = null;
        x2 x2Var2 = null;
        for (x2 x2Var3 : list2) {
            if (D(x2Var3)) {
                x2Var = x2Var3;
            } else if (C(x2Var3)) {
                x2Var2 = x2Var3;
            }
        }
        if (B && x2Var == null) {
            arrayList.add(s());
        } else if (!B && x2Var != null) {
            arrayList.remove(x2Var);
        }
        if (A && x2Var2 == null) {
            arrayList.add(r());
        } else if (!A && x2Var2 != null) {
            arrayList.remove(x2Var2);
        }
        return arrayList;
    }

    public final Map<x2, Size> q(a0 a0Var, List<x2> list, List<x2> list2, Map<x2, c> map) {
        ArrayList arrayList = new ArrayList();
        String a10 = a0Var.a();
        HashMap hashMap = new HashMap();
        for (x2 x2Var : list2) {
            arrayList.add(this.f4203c.a(a10, x2Var.h(), x2Var.b()));
            hashMap.put(x2Var, x2Var.b());
        }
        if (!list.isEmpty()) {
            HashMap hashMap2 = new HashMap();
            for (x2 x2Var2 : list) {
                c cVar = map.get(x2Var2);
                hashMap2.put(x2Var2.p(a0Var, cVar.f4205a, cVar.f4206b), x2Var2);
            }
            Map<n2<?>, Size> b10 = this.f4203c.b(a10, arrayList, new ArrayList(hashMap2.keySet()));
            for (Map.Entry entry : hashMap2.entrySet()) {
                hashMap.put((x2) entry.getValue(), b10.get(entry.getKey()));
            }
        }
        return hashMap;
    }

    public final d1 r() {
        return new d1.h().k("ImageCapture-Extra").c();
    }

    public final b2 s() {
        b2 c10 = new b2.b().i("Preview-Extra").c();
        c10.S(c0.c.f4198a);
        return c10;
    }

    public final void t(List<x2> list) {
        synchronized (this.R) {
            if (!list.isEmpty()) {
                this.f4201a.k(list);
                for (x2 x2Var : list) {
                    if (this.O.contains(x2Var)) {
                        x2Var.y(this.f4201a);
                    } else {
                        t1.c("CameraUseCaseAdapter", "Attempting to detach non-attached UseCase: " + x2Var);
                    }
                }
                this.O.removeAll(list);
            }
        }
    }

    public void u() {
        synchronized (this.R) {
            if (this.S) {
                this.f4201a.k(new ArrayList(this.O));
                n();
                this.S = false;
            }
        }
    }

    public b w() {
        return this.N;
    }

    public final Map<x2, c> x(List<x2> list, o2 o2Var, o2 o2Var2) {
        HashMap hashMap = new HashMap();
        for (x2 x2Var : list) {
            hashMap.put(x2Var, new c(x2Var.g(false, o2Var), x2Var.g(true, o2Var2)));
        }
        return hashMap;
    }

    public List<x2> y() {
        ArrayList arrayList;
        synchronized (this.R) {
            arrayList = new ArrayList(this.O);
        }
        return arrayList;
    }

    public final boolean z() {
        boolean z10;
        synchronized (this.R) {
            z10 = true;
            if (this.Q.r() != 1) {
                z10 = false;
            }
        }
        return z10;
    }
}
