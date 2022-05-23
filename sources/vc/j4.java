package vc;

import ae.h;
import ae.j;
import ae.z;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.b;
import ce.j0;
import ce.v;
import ce.y;
import eb.k;
import gd.b0;
import gd.w;
import ib.d;
import ib.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kb.c;
import ld.p;
import ne.n2;
import oc.v0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.widget.SparseDrawableView;
import ud.v4;
import zd.o6;
import zd.qj;

public class j4 extends RecyclerView.h<a> implements View.OnClickListener, ae.a {
    public static final int[] T = {2040615, 2957363, 8923969, 6311250, 5930367, 5726831, 3757446, 4689847, 7781324, 8310740, 12772324, 11917257, 9160616, 16641969, 16776621, 15423082, 15626350, 15835038, 13661014, 16306846, 15065270, 13883841, 15198420, 13490923, 13947373, 13553358, 15593713};
    public final v4<?> M;
    public ArrayList<h> N;
    public h O;
    public final int Q;
    public h R;
    public int S = -1;
    public final ArrayList<RecyclerView> P = new ArrayList<>();

    public static class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }

        public static a O(Context context, int i10, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
            if (i10 == 0) {
                b bVar = new b(context);
                bVar.setOnClickListener(onClickListener);
                bVar.setOnLongClickListener(onLongClickListener);
                return new a(bVar);
            } else if (i10 == 1) {
                n2 n2Var = new n2(context);
                n2Var.f(1.0f);
                n2Var.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                return new a(n2Var);
            } else {
                throw new IllegalArgumentException("viewType == " + i10);
            }
        }
    }

    public static class b extends SparseDrawableView implements k.b, c {
        public boolean M;
        public h N;
        public float O;
        public k P;
        public final b.a Q = new b.a();
        public final p f25069b = new p(this, 0);
        public final p f25070c = new p(this, 0);

        public b(Context context) {
            super(context);
        }

        private void setFactor(float f10) {
            if (this.O != f10) {
                this.O = f10;
                invalidate();
            }
        }

        public void A(h hVar, boolean z10) {
            this.N = hVar;
            if (hVar != null) {
                if (hVar.X()) {
                    this.f25070c.setColorFilter(hVar.B());
                    this.f25069b.G(null);
                } else {
                    this.f25070c.D();
                    this.f25069b.G(hVar.G(true));
                }
                this.f25070c.G(hVar.G(false));
            } else {
                this.f25069b.G(null);
                this.f25070c.G(null);
            }
            y(z10, false);
        }

        @Override
        public void Q2() {
            this.f25069b.b0();
            this.f25070c.b0();
        }

        public void b() {
            this.f25069b.b();
            this.f25070c.b();
        }

        public void e() {
            this.f25069b.e();
            this.f25070c.e();
        }

        public h getWallpaper() {
            return this.N;
        }

        @Override
        public void n4(int i10, float f10, float f11, k kVar) {
            setFactor(f10);
        }

        @Override
        public void o4(int i10, float f10, k kVar) {
        }

        @Override
        public void onDraw(Canvas canvas) {
            int i10;
            Drawable Z;
            h hVar = this.N;
            if (hVar == null || hVar.R()) {
                canvas.drawColor(j.b());
            } else if (this.N.V()) {
                canvas.drawColor(this.N.i());
            } else if (this.N.U()) {
                ce.b.l(canvas, this.Q, 0, 0, getMeasuredWidth(), getMeasuredHeight(), this.N.K(), this.N.m(), this.N.H(), 1.0f);
            } else if (this.N.T()) {
                ce.b.p(canvas, this.Q, 0, 0, getMeasuredWidth(), getMeasuredHeight(), this.N.r(), 1.0f);
            } else if (this.N.X()) {
                if (this.N.Z()) {
                    ce.b.l(canvas, this.Q, 0, 0, getMeasuredWidth(), getMeasuredHeight(), this.N.K(), this.N.m(), this.N.H(), 1.0f);
                } else if (this.N.Y()) {
                    ce.b.p(canvas, this.Q, 0, 0, getMeasuredWidth(), getMeasuredHeight(), this.N.r(), 1.0f);
                } else {
                    canvas.drawColor(this.N.i());
                }
                float F = this.N.F();
                int i11 = (F > 1.0f ? 1 : (F == 1.0f ? 0 : -1));
                if (i11 != 0) {
                    p pVar = this.f25070c;
                    pVar.V(F * pVar.R0());
                }
                this.f25070c.draw(canvas);
                if (i11 != 0) {
                    this.f25070c.Q();
                }
            } else {
                if (this.f25070c.e0()) {
                    if (this.f25069b.e0()) {
                        this.f25069b.O(canvas);
                    }
                    this.f25069b.draw(canvas);
                }
                this.f25070c.draw(canvas);
            }
            float f10 = this.M ? this.O : 1.0f;
            int measuredWidth = getMeasuredWidth() / 2;
            int measuredHeight = getMeasuredHeight() / 2;
            h hVar2 = this.N;
            boolean z10 = hVar2 != null && hVar2.Q();
            float f11 = z10 ? 1.0f : this.O;
            float f12 = 0.0f;
            if (f11 != 0.0f) {
                canvas.drawCircle(measuredWidth, measuredHeight, a0.i(28.0f), y.g(d.b((int) (f11 * 86.0f), 0)));
                if (z10) {
                    Paint W = y.W(-1);
                    W.setAlpha((int) ((1.0f - this.O) * 255.0f));
                    ce.c.b(canvas, Z(R.drawable.baseline_image_24, 0), measuredWidth - (Z.getMinimumWidth() / 2), measuredHeight - (Z.getMinimumHeight() / 2), W);
                    W.setAlpha(255);
                }
                float f13 = f10 <= 0.3f ? 0.0f : (f10 - 0.3f) / 0.7f;
                if (f13 > 0.0f) {
                    int b10 = d.b((int) (this.O * 255.0f), -1);
                    int i12 = (f13 > 0.3f ? 1 : (f13 == 0.3f ? 0 : -1));
                    float f14 = i12 <= 0 ? f13 / 0.3f : 1.0f;
                    if (i12 > 0) {
                        f12 = (f13 - 0.3f) / 0.7f;
                    }
                    canvas.save();
                    canvas.translate((measuredWidth / 2) + a0.i(13.0f), measuredHeight + a0.i(1.0f));
                    canvas.rotate(-45.0f);
                    int i13 = a0.i(14.0f);
                    int i14 = a0.i(7.0f);
                    int i15 = a0.i(4.0f);
                    int i16 = a0.i(11.0f);
                    int i17 = a0.i(2.0f);
                    float f15 = i15;
                    canvas.drawRect(f15, i16 - i14, i15 + i17, i10 + ((int) (i14 * f14)), y.g(b10));
                    canvas.drawRect(f15, i16 - i17, i15 + ((int) (i13 * f12)), i16, y.g(b10));
                    canvas.restore();
                }
            }
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i11, i11);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            this.f25069b.K0(0, 0, measuredWidth, measuredHeight);
            this.f25070c.K0(0, 0, measuredWidth, measuredHeight);
        }

        public void setWallpaperSelected(boolean z10) {
            y(z10, true);
        }

        public final void v(float f10) {
            if (this.P == null) {
                this.P = new k(0, this, db.b.f7287b, 180L, this.O);
            }
            this.P.i(f10);
        }

        public final void w(float f10) {
            k kVar = this.P;
            if (kVar != null) {
                kVar.l(f10);
            }
            setFactor(f10);
        }

        public void x(h hVar) {
            this.N = hVar;
            this.f25069b.G(hVar.G(true));
            this.f25070c.G(hVar.G(false));
        }

        public final void y(boolean z10, boolean z11) {
            if (this.M != z10) {
                this.M = z10;
                float f10 = 1.0f;
                if (z11) {
                    if (!z10) {
                        f10 = 0.0f;
                    }
                    v(f10);
                    return;
                }
                if (!z10) {
                    f10 = 0.0f;
                }
                w(f10);
            }
        }
    }

    public j4(v4<?> v4Var, int i10) {
        this.M = v4Var;
        this.Q = i10;
        this.O = v4Var.c().tc().I(j.g0());
        v4Var.c().Ue().k(new qj.b() {
            @Override
            public final void a(List list) {
                j4.this.u0(list);
            }
        }, j.y0(i10));
        z.u().d(this);
    }

    public static int e0(RecyclerView recyclerView, LinearLayoutManager linearLayoutManager, int i10, int i11) {
        int X1 = linearLayoutManager.X1();
        int i12 = (i10 + i11) * X1;
        View C = linearLayoutManager.C(X1);
        if (C == null) {
            return i12;
        }
        if (w.G2()) {
            return i12 + (linearLayoutManager.T(C) - recyclerView.getMeasuredWidth());
        }
        return i12 - linearLayoutManager.Q(C);
    }

    public static ArrayList<h> j0(o6 o6Var, List<h> list, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        h hVar = null;
        try {
            h I = o6Var.tc().I(j.g0());
            if (I == null || !I.Q()) {
                str = null;
            } else {
                str = I.p();
            }
            if (i.i(str)) {
                ld.h i11 = b0.k().i();
                str = i11 != null ? i11.q() : "custom";
            }
            hVar = new h(o6Var, str);
        } catch (Throwable th) {
            Log.w("Cannot add custom wallpaper option", th, new Object[0]);
        }
        int i12 = j.S() == null ? 1 : 0;
        int i13 = hVar != null ? 1 : 0;
        ArrayList<h> arrayList = new ArrayList<>(list.size() + i13 + i12 + T.length);
        if (i13 != 0) {
            arrayList.add(hVar);
        }
        if (i12 != 0) {
            arrayList.add(h.g0(o6Var));
        }
        arrayList.addAll(list);
        final boolean y02 = j.y0(i10);
        int[] v10 = h.v();
        arrayList.ensureCapacity(arrayList.size() + v10.length);
        for (int i14 : v10) {
            h h02 = h.h0(o6Var, i14);
            if (h02 != null) {
                Iterator<h> it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z12 = false;
                        break;
                    }
                    h next = it.next();
                    if (i.c(next.w(), h02.w())) {
                        next.q0(h02.u());
                        z12 = true;
                        break;
                    }
                }
                if (!z12) {
                    arrayList.add(h02);
                }
            }
        }
        final String h10 = qj.h(j.T(i10));
        if (h10 != null) {
            Iterator<h> it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (h10.equals(it2.next().w())) {
                        z11 = true;
                        break;
                    }
                } else {
                    z11 = false;
                    break;
                }
            }
            if (!z11) {
                if (h10.length() == 6) {
                    try {
                        arrayList.add(new h(o6Var, Color.parseColor("#" + h10)));
                        z11 = true;
                    } catch (IllegalArgumentException unused) {
                    }
                }
                if (!z11) {
                    arrayList.add(h.i0(o6Var, h10));
                }
            }
        }
        Collections.sort(arrayList, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int k02;
                k02 = j4.k0(h10, y02, (h) obj, (h) obj2);
                return k02;
            }
        });
        int size = arrayList.size() - 1;
        for (int length = T.length - 1; length >= 0; length--) {
            int i15 = T[length];
            while (true) {
                if (size < 0) {
                    z10 = false;
                    break;
                }
                size--;
                h hVar2 = arrayList.get(size);
                if (hVar2.V() && hVar2.i() == i15) {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                arrayList.add(new h(o6Var, i15));
            }
        }
        return arrayList;
    }

    public static int k0(String str, boolean z10, h hVar, h hVar2) {
        boolean equals;
        if (hVar.Q() != hVar2.Q()) {
            return hVar.Q() ? -1 : 1;
        }
        if (hVar.R() != hVar2.R()) {
            return hVar.R() ? -1 : 1;
        }
        if (str != null && (equals = str.equals(hVar.w())) != str.equals(hVar2.w())) {
            return equals ? -1 : 1;
        }
        if (!z10 && hVar.N() != hVar2.N()) {
            return hVar.N() ? -1 : 1;
        }
        if (hVar.S() != hVar2.S()) {
            return hVar.S() ? 1 : -1;
        }
        if (hVar.S()) {
            return 0;
        }
        if (hVar.W() != hVar2.W()) {
            return hVar.W() ? 1 : -1;
        }
        if (!hVar.W()) {
            return 0;
        }
        if (z10) {
            if (hVar.N() != hVar2.N()) {
                return hVar.N() ? -1 : 1;
            }
            if (hVar.O() != hVar2.O()) {
                return hVar.O() ? -1 : 1;
            }
        }
        int I = h.I(hVar.u(), z10);
        int I2 = h.I(hVar2.u(), z10);
        if (I != I2) {
            return I < I2 ? 1 : -1;
        }
        return 0;
    }

    public void m0(List list) {
        final ArrayList<h> j02 = j0(this.M.c(), list, this.Q);
        j0.d0(new Runnable() {
            @Override
            public final void run() {
                j4.this.l0(j02);
            }
        });
    }

    @Override
    public int D() {
        ArrayList<h> arrayList = this.N;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 1;
    }

    @Override
    public int F(int i10) {
        return this.N != null ? 0 : 1;
    }

    @Override
    public void P(RecyclerView recyclerView) {
        this.P.add(recyclerView);
        int i02 = i0(this.O);
        if (i02 != -1) {
            ((LinearLayoutManager) recyclerView.getLayoutManager()).z2(i02, (a0.g() / 2) - (a0.i(105.0f) / 2));
        }
    }

    @Override
    public void T(RecyclerView recyclerView) {
        this.P.remove(recyclerView);
    }

    @Override
    public void a(o6 o6Var, h hVar, int i10) {
        if (this.M.c() == o6Var && j.g0() == i10) {
            ArrayList<h> arrayList = this.N;
            if (arrayList != null && !arrayList.isEmpty() && hVar != null && hVar.Q()) {
                int i11 = 0;
                if (!h.g(this.N.get(0), hVar)) {
                    h hVar2 = this.N.get(0);
                    this.N.set(0, hVar);
                    int i02 = i0(hVar);
                    if (i02 != -1) {
                        Iterator<RecyclerView> it = this.P.iterator();
                        while (it.hasNext()) {
                            View C = it.next().getLayoutManager().C(i02);
                            if (C != null && (C instanceof b)) {
                                b bVar = (b) C;
                                if (h.g(bVar.getWallpaper(), hVar2)) {
                                    bVar.x(hVar);
                                    i11++;
                                }
                            }
                        }
                        if (i11 != this.P.size()) {
                            I(i02);
                        }
                    }
                }
            }
            s0(hVar);
        }
    }

    @Override
    public void c(o6 o6Var, int i10) {
    }

    public void f0(boolean z10) {
        int i02 = i0(this.O);
        if (i02 != -1) {
            g0(z10, i02);
        }
    }

    public void g0(boolean z10, int i10) {
        Iterator<RecyclerView> it = this.P.iterator();
        while (it.hasNext()) {
            RecyclerView next = it.next();
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) next.getLayoutManager();
            if (next.getMeasuredWidth() == 0) {
                linearLayoutManager.x1(i10);
            } else {
                int measuredWidth = next.getMeasuredWidth() / 2;
                int i11 = a0.i(105.0f);
                int i12 = a0.i(3.0f);
                if (z10) {
                    int e02 = e0(next, linearLayoutManager, i11, i12);
                    int i13 = i11 + i12;
                    int max = Math.max(0, Math.min(((this.N.size() * i13) + i12) - next.getMeasuredWidth(), ((i13 * i10) - measuredWidth) + (i11 / 2) + i12));
                    if (max != e02) {
                        next.C1();
                        next.u1(w.G2() ? e02 - max : max - e02, 0);
                    }
                } else {
                    linearLayoutManager.z2(i10, (measuredWidth - (i11 / 2)) - i12);
                }
            }
        }
    }

    public void h0() {
        z.u().R(this);
    }

    public final int i0(h hVar) {
        if (this.N == null) {
            return -1;
        }
        if (this.S != -1 && h.g(this.R, hVar)) {
            return this.S;
        }
        int i10 = 0;
        Iterator<h> it = this.N.iterator();
        while (it.hasNext()) {
            h next = it.next();
            if (h.g(hVar, next)) {
                this.R = next;
                this.S = i10;
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public void Q(a aVar, int i10) {
        ArrayList<h> arrayList;
        if (aVar.n() == 0 && (arrayList = this.N) != null) {
            h hVar = arrayList.get(i10);
            ((b) aVar.f2982a).A(hVar, h.g(hVar, this.O));
        }
    }

    public a S(ViewGroup viewGroup, int i10) {
        return a.O(this.M.t(), i10, this, null);
    }

    @Override
    public void onClick(View view) {
        h wallpaper;
        if (!(view instanceof b) || (wallpaper = ((b) view).getWallpaper()) == null) {
            return;
        }
        if (wallpaper.Q()) {
            v.t(false);
        } else {
            this.M.c().tc().s0(wallpaper, true, j.g0());
        }
    }

    public void V(a aVar) {
        int n10 = aVar.n();
        if (n10 == 0) {
            ((b) aVar.f2982a).e();
        } else if (n10 == 1) {
            ((n2) aVar.f2982a).e();
        }
    }

    public void W(a aVar) {
        int n10 = aVar.n();
        if (n10 == 0) {
            ((b) aVar.f2982a).b();
        } else if (n10 == 1) {
            ((n2) aVar.f2982a).b();
        }
    }

    public final void l0(ArrayList<h> arrayList) {
        int D = D();
        this.N = arrayList;
        h I = this.M.c().tc().I(j.g0());
        this.O = I;
        int i02 = i0(I);
        if (i02 == -1) {
            i02 = 0;
            while (arrayList.size() > i02) {
                h hVar = arrayList.get(i02);
                if (!hVar.Q() && !hVar.R()) {
                    break;
                }
                i02++;
            }
            arrayList.add(i02, this.O);
        }
        v0.k2(this, D);
        g0(false, i02);
    }

    public final void s0(h hVar) {
        if (!h.g(this.O, hVar)) {
            h hVar2 = this.O;
            this.O = hVar;
            t0(hVar2, false);
            t0(hVar, true);
            f0(true);
        }
    }

    public final void t0(h hVar, boolean z10) {
        int i02 = i0(hVar);
        if (i02 != -1) {
            int i10 = 0;
            Iterator<RecyclerView> it = this.P.iterator();
            while (it.hasNext()) {
                View C = it.next().getLayoutManager().C(i02);
                if (C != null && (C instanceof b)) {
                    b bVar = (b) C;
                    if (h.g(bVar.getWallpaper(), hVar)) {
                        bVar.setWallpaperSelected(z10);
                        i10++;
                    }
                }
            }
            if (i10 == 0 || i10 < this.P.size()) {
                I(i02);
            }
        }
    }

    public final void u0(final List<h> list) {
        if (list != null) {
            b0.k().q(new Runnable() {
                @Override
                public final void run() {
                    j4.this.m0(list);
                }
            });
        }
    }
}
