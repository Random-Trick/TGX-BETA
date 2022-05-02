package p291uc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1359b;
import be.C1362c;
import be.C1379j0;
import be.C1405v;
import be.C1410y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import me.C6977n2;
import nc.C7389v0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.widget.SparseDrawableView;
import p037cb.C2057b;
import p051db.C3950k;
import p082fd.C4356b0;
import p082fd.C4403w;
import p108hb.C5064d;
import p108hb.C5070i;
import p139jb.AbstractC5911c;
import p156kd.C6246h;
import p156kd.C6257p;
import p350yd.C10930q6;
import p350yd.C11004sj;
import p364zd.AbstractC11508a;
import p364zd.C11520h;
import p364zd.C11524j;
import p364zd.C11541z;
import td.AbstractC9323v4;

public class View$OnClickListenerC9592k4 extends RecyclerView.AbstractC0890h<C9593a> implements View.OnClickListener, AbstractC11508a {
    public static final int[] f31102T = {2040615, 2957363, 8923969, 6311250, 5930367, 5726831, 3757446, 4689847, 7781324, 8310740, 12772324, 11917257, 9160616, 16641969, 16776621, 15423082, 15626350, 15835038, 13661014, 16306846, 15065270, 13883841, 15198420, 13490923, 13947373, 13553358, 15593713};
    public final AbstractC9323v4<?> f31103M;
    public ArrayList<C11520h> f31104N;
    public C11520h f31105O;
    public final int f31107Q;
    public C11520h f31108R;
    public int f31109S = -1;
    public final ArrayList<RecyclerView> f31106P = new ArrayList<>();

    public static class C9593a extends RecyclerView.AbstractC0886d0 {
        public C9593a(View view) {
            super(view);
        }

        public static C9593a m8069O(Context context, int i, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
            if (i == 0) {
                C9594b bVar = new C9594b(context);
                bVar.setOnClickListener(onClickListener);
                bVar.setOnLongClickListener(onLongClickListener);
                return new C9593a(bVar);
            } else if (i == 1) {
                C6977n2 n2Var = new C6977n2(context);
                n2Var.m18228e(1.0f);
                n2Var.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                return new C9593a(n2Var);
            } else {
                throw new IllegalArgumentException("viewType == " + i);
            }
        }
    }

    public static class C9594b extends SparseDrawableView implements C3950k.AbstractC3952b, AbstractC5911c {
        public boolean f31110M;
        public C11520h f31111N;
        public float f31112O;
        public C3950k f31113P;
        public final C1359b.C1360a f31114Q = new C1359b.C1360a();
        public final C6257p f31115b = new C6257p(this, 0);
        public final C6257p f31116c = new C6257p(this, 0);

        public C9594b(Context context) {
            super(context);
        }

        private void setFactor(float f) {
            if (this.f31112O != f) {
                this.f31112O = f;
                invalidate();
            }
        }

        @Override
        public void mo45P5(int i, float f, float f2, C3950k kVar) {
            setFactor(f);
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
        }

        @Override
        public void mo4501a3() {
            this.f31115b.mo20250Z();
            this.f31116c.mo20250Z();
        }

        public void m8068b() {
            this.f31115b.mo20248b();
            this.f31116c.mo20248b();
        }

        public void m8067f() {
            this.f31115b.mo20246f();
            this.f31116c.mo20246f();
        }

        public C11520h getWallpaper() {
            return this.f31111N;
        }

        @Override
        public void onDraw(Canvas canvas) {
            int i;
            Drawable X;
            C11520h hVar = this.f31111N;
            if (hVar == null || hVar.m319R()) {
                canvas.drawColor(C11524j.m199b());
            } else if (this.f31111N.m315V()) {
                canvas.drawColor(this.f31111N.m294i());
            } else if (this.f31111N.m316U()) {
                C1359b.m37510l(canvas, this.f31114Q, 0, 0, getMeasuredWidth(), getMeasuredHeight(), this.f31111N.m326K(), this.f31111N.m286m(), this.f31111N.m329H(), 1.0f);
            } else if (this.f31111N.m317T()) {
                C1359b.m37506p(canvas, this.f31114Q, 0, 0, getMeasuredWidth(), getMeasuredHeight(), this.f31111N.m276r(), 1.0f);
            } else if (this.f31111N.m313X()) {
                if (this.f31111N.m311Z()) {
                    C1359b.m37510l(canvas, this.f31114Q, 0, 0, getMeasuredWidth(), getMeasuredHeight(), this.f31111N.m326K(), this.f31111N.m286m(), this.f31111N.m329H(), 1.0f);
                } else if (this.f31111N.m312Y()) {
                    C1359b.m37506p(canvas, this.f31114Q, 0, 0, getMeasuredWidth(), getMeasuredHeight(), this.f31111N.m276r(), 1.0f);
                } else {
                    canvas.drawColor(this.f31111N.m294i());
                }
                float F = this.f31111N.m331F();
                int i2 = (F > 1.0f ? 1 : (F == 1.0f ? 0 : -1));
                if (i2 != 0) {
                    C6257p pVar = this.f31116c;
                    pVar.mo20251U(F * pVar.mo20253R0());
                }
                this.f31116c.draw(canvas);
                if (i2 != 0) {
                    this.f31116c.mo20254P();
                }
            } else {
                if (this.f31116c.mo20247c0()) {
                    if (this.f31115b.mo20247c0()) {
                        this.f31115b.mo20256N(canvas);
                    }
                    this.f31115b.draw(canvas);
                }
                this.f31116c.draw(canvas);
            }
            float f = this.f31110M ? this.f31112O : 1.0f;
            int measuredWidth = getMeasuredWidth() / 2;
            int measuredHeight = getMeasuredHeight() / 2;
            C11520h hVar2 = this.f31111N;
            boolean z = hVar2 != null && hVar2.m320Q();
            float f2 = z ? 1.0f : this.f31112O;
            float f3 = 0.0f;
            if (f2 != 0.0f) {
                canvas.drawCircle(measuredWidth, measuredHeight, C1357a0.m37544i(28.0f), C1410y.m37042g(C5064d.m24131b((int) (f2 * 86.0f), 0)));
                if (z) {
                    Paint W = C1410y.m37058W(-1);
                    W.setAlpha((int) ((1.0f - this.f31112O) * 255.0f));
                    C1362c.m37490b(canvas, mo14041X(R.drawable.baseline_image_24, 0), measuredWidth - (X.getMinimumWidth() / 2), measuredHeight - (X.getMinimumHeight() / 2), W);
                    W.setAlpha(255);
                }
                float f4 = f <= 0.3f ? 0.0f : (f - 0.3f) / 0.7f;
                if (f4 > 0.0f) {
                    int b = C5064d.m24131b((int) (this.f31112O * 255.0f), -1);
                    int i3 = (f4 > 0.3f ? 1 : (f4 == 0.3f ? 0 : -1));
                    float f5 = i3 <= 0 ? f4 / 0.3f : 1.0f;
                    if (i3 > 0) {
                        f3 = (f4 - 0.3f) / 0.7f;
                    }
                    canvas.save();
                    canvas.translate((measuredWidth / 2) + C1357a0.m37544i(13.0f), measuredHeight + C1357a0.m37544i(1.0f));
                    canvas.rotate(-45.0f);
                    int i4 = C1357a0.m37544i(14.0f);
                    int i5 = C1357a0.m37544i(7.0f);
                    int i6 = C1357a0.m37544i(4.0f);
                    int i7 = C1357a0.m37544i(11.0f);
                    int i8 = C1357a0.m37544i(2.0f);
                    float f6 = i6;
                    canvas.drawRect(f6, i7 - i5, i6 + i8, i + ((int) (i5 * f5)), C1410y.m37042g(b));
                    canvas.drawRect(f6, i7 - i8, i6 + ((int) (i4 * f3)), i7, C1410y.m37042g(b));
                    canvas.restore();
                }
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i2, i2);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            this.f31115b.mo20257K0(0, 0, measuredWidth, measuredHeight);
            this.f31116c.mo20257K0(0, 0, measuredWidth, measuredHeight);
        }

        public void setWallpaperSelected(boolean z) {
            m8063x(z, true);
        }

        public final void m8066t(float f) {
            if (this.f31113P == null) {
                this.f31113P = new C3950k(0, this, C2057b.f7280b, 180L, this.f31112O);
            }
            this.f31113P.m29546i(f);
        }

        public final void m8065u(float f) {
            C3950k kVar = this.f31113P;
            if (kVar != null) {
                kVar.m29543l(f);
            }
            setFactor(f);
        }

        public void m8064v(C11520h hVar) {
            this.f31111N = hVar;
            this.f31115b.m20820G(hVar.m330G(true));
            this.f31116c.m20820G(hVar.m330G(false));
        }

        public final void m8063x(boolean z, boolean z2) {
            if (this.f31110M != z) {
                this.f31110M = z;
                float f = 1.0f;
                if (z2) {
                    if (!z) {
                        f = 0.0f;
                    }
                    m8066t(f);
                    return;
                }
                if (!z) {
                    f = 0.0f;
                }
                m8065u(f);
            }
        }

        public void m8062y(C11520h hVar, boolean z) {
            this.f31111N = hVar;
            if (hVar != null) {
                if (hVar.m313X()) {
                    this.f31116c.setColorFilter(hVar.m335B());
                    this.f31115b.m20820G(null);
                } else {
                    this.f31116c.mo20261D();
                    this.f31115b.m20820G(hVar.m330G(true));
                }
                this.f31116c.m20820G(hVar.m330G(false));
            } else {
                this.f31115b.m20820G(null);
                this.f31116c.m20820G(null);
            }
            m8063x(z, false);
        }
    }

    public View$OnClickListenerC9592k4(AbstractC9323v4<?> v4Var, int i) {
        this.f31103M = v4Var;
        this.f31107Q = i;
        this.f31105O = v4Var.mo4348c().m2294pc().m4148I(C11524j.m177i0());
        v4Var.mo4348c().m2712Oe().m2013k(new C11004sj.AbstractC11006b() {
            @Override
            public final void mo2002a(List list) {
                View$OnClickListenerC9592k4.this.m8070w0(list);
            }
        }, C11524j.m253A0(i));
        C11541z.m7t().m26d(this);
    }

    public static int m8086f0(RecyclerView recyclerView, LinearLayoutManager linearLayoutManager, int i, int i2) {
        int X1 = linearLayoutManager.m39552X1();
        int i3 = (i + i2) * X1;
        View C = linearLayoutManager.mo39265C(X1);
        if (C == null) {
            return i3;
        }
        if (C4403w.m27986G2()) {
            return i3 + (linearLayoutManager.m39235T(C) - recyclerView.getMeasuredWidth());
        }
        return i3 - linearLayoutManager.m39240Q(C);
    }

    public static ArrayList<C11520h> m8081k0(C10930q6 q6Var, List<C11520h> list, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        C11520h hVar = null;
        try {
            C11520h I = q6Var.m2294pc().m4148I(C11524j.m177i0());
            if (I == null || !I.m320Q()) {
                str = null;
            } else {
                str = I.m280p();
            }
            if (C5070i.m24062i(str)) {
                C6246h i2 = C4356b0.m28203k().m28205i();
                str = i2 != null ? i2.mo20876q() : "custom";
            }
            hVar = new C11520h(q6Var, str);
        } catch (Throwable th) {
            Log.m14710w("Cannot add custom wallpaper option", th, new Object[0]);
        }
        int i3 = C11524j.m214U() == null ? 1 : 0;
        int i4 = hVar != null ? 1 : 0;
        ArrayList<C11520h> arrayList = new ArrayList<>(list.size() + i4 + i3 + f31102T.length);
        if (i4 != 0) {
            arrayList.add(hVar);
        }
        if (i3 != 0) {
            arrayList.add(C11520h.m297g0(q6Var));
        }
        arrayList.addAll(list);
        final boolean A0 = C11524j.m253A0(i);
        int[] v = C11520h.m269v();
        arrayList.ensureCapacity(arrayList.size() + v.length);
        for (int i5 : v) {
            C11520h h0 = C11520h.m295h0(q6Var, i5);
            if (h0 != null) {
                Iterator<C11520h> it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z3 = false;
                        break;
                    }
                    C11520h next = it.next();
                    if (C5070i.m24068c(next.m268w(), h0.m268w())) {
                        next.m277q0(h0.m270u());
                        z3 = true;
                        break;
                    }
                }
                if (!z3) {
                    arrayList.add(h0);
                }
            }
        }
        final String h = C11004sj.m2016h(C11524j.m212V(i));
        if (h != null) {
            Iterator<C11520h> it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (h.equals(it2.next().m268w())) {
                        z2 = true;
                        break;
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
            if (!z2) {
                if (h.length() == 6) {
                    try {
                        arrayList.add(new C11520h(q6Var, Color.parseColor("#" + h)));
                        z2 = true;
                    } catch (IllegalArgumentException unused) {
                    }
                }
                if (!z2) {
                    arrayList.add(C11520h.m293i0(q6Var, h));
                }
            }
        }
        Collections.sort(arrayList, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int l0;
                l0 = View$OnClickListenerC9592k4.m8080l0(h, A0, (C11520h) obj, (C11520h) obj2);
                return l0;
            }
        });
        int size = arrayList.size() - 1;
        for (int length = f31102T.length - 1; length >= 0; length--) {
            int i6 = f31102T[length];
            while (true) {
                if (size < 0) {
                    z = false;
                    break;
                }
                size--;
                C11520h hVar2 = arrayList.get(size);
                if (hVar2.m315V() && hVar2.m294i() == i6) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                arrayList.add(new C11520h(q6Var, i6));
            }
        }
        return arrayList;
    }

    public static int m8080l0(String str, boolean z, C11520h hVar, C11520h hVar2) {
        boolean equals;
        if (hVar.m320Q() != hVar2.m320Q()) {
            return hVar.m320Q() ? -1 : 1;
        }
        if (hVar.m319R() != hVar2.m319R()) {
            return hVar.m319R() ? -1 : 1;
        }
        if (str != null && (equals = str.equals(hVar.m268w())) != str.equals(hVar2.m268w())) {
            return equals ? -1 : 1;
        }
        if (!z && hVar.m323N() != hVar2.m323N()) {
            return hVar.m323N() ? -1 : 1;
        }
        if (hVar.m318S() != hVar2.m318S()) {
            return hVar.m318S() ? 1 : -1;
        }
        if (hVar.m318S()) {
            return 0;
        }
        if (hVar.m314W() != hVar2.m314W()) {
            return hVar.m314W() ? 1 : -1;
        }
        if (!hVar.m314W()) {
            return 0;
        }
        if (z) {
            if (hVar.m323N() != hVar2.m323N()) {
                return hVar.m323N() ? -1 : 1;
            }
            if (hVar.m322O() != hVar2.m322O()) {
                return hVar.m322O() ? -1 : 1;
            }
        }
        int I = C11520h.m328I(hVar.m270u(), z);
        int I2 = C11520h.m328I(hVar2.m270u(), z);
        if (I != I2) {
            return I < I2 ? 1 : -1;
        }
        return 0;
    }

    public void m8078n0(List list) {
        final ArrayList<C11520h> k0 = m8081k0(this.f31103M.mo4348c(), list, this.f31107Q);
        C1379j0.m37337d0(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC9592k4.this.m8079m0(k0);
            }
        });
    }

    @Override
    public int mo6153D() {
        ArrayList<C11520h> arrayList = this.f31104N;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 1;
    }

    @Override
    public int mo6150F(int i) {
        return this.f31104N != null ? 0 : 1;
    }

    @Override
    public void mo6619P(RecyclerView recyclerView) {
        this.f31106P.add(recyclerView);
        int j0 = m8082j0(this.f31105O);
        if (j0 != -1) {
            ((LinearLayoutManager) recyclerView.getLayoutManager()).m39525z2(j0, (C1357a0.m37546g() / 2) - (C1357a0.m37544i(105.0f) / 2));
        }
    }

    @Override
    public void mo6614T(RecyclerView recyclerView) {
        this.f31106P.remove(recyclerView);
    }

    @Override
    public void mo378b(C10930q6 q6Var, int i) {
    }

    public void m8085g0(boolean z) {
        int j0 = m8082j0(this.f31105O);
        if (j0 != -1) {
            m8084h0(z, j0);
        }
    }

    public void m8084h0(boolean z, int i) {
        Iterator<RecyclerView> it = this.f31106P.iterator();
        while (it.hasNext()) {
            RecyclerView next = it.next();
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) next.getLayoutManager();
            if (next.getMeasuredWidth() == 0) {
                linearLayoutManager.mo39021x1(i);
            } else {
                int measuredWidth = next.getMeasuredWidth() / 2;
                int i2 = C1357a0.m37544i(105.0f);
                int i3 = C1357a0.m37544i(3.0f);
                if (z) {
                    int f0 = m8086f0(next, linearLayoutManager, i2, i3);
                    int i4 = i2 + i3;
                    int max = Math.max(0, Math.min(((this.f31104N.size() * i4) + i3) - next.getMeasuredWidth(), ((i4 * i) - measuredWidth) + (i2 / 2) + i3));
                    if (max != f0) {
                        next.m39499D1();
                        next.mo8024v1(C4403w.m27986G2() ? f0 - max : max - f0, 0);
                    }
                } else {
                    linearLayoutManager.m39525z2(i, (measuredWidth - (i2 / 2)) - i3);
                }
            }
        }
    }

    public void m8083i0() {
        C11541z.m7t().m44Q(this);
    }

    public final int m8082j0(C11520h hVar) {
        if (this.f31104N == null) {
            return -1;
        }
        if (this.f31109S != -1 && C11520h.m298g(this.f31108R, hVar)) {
            return this.f31109S;
        }
        int i = 0;
        Iterator<C11520h> it = this.f31104N.iterator();
        while (it.hasNext()) {
            C11520h next = it.next();
            if (C11520h.m298g(hVar, next)) {
                this.f31108R = next;
                this.f31109S = i;
                return i;
            }
            i++;
        }
        return -1;
    }

    public void mo6146Q(C9593a aVar, int i) {
        ArrayList<C11520h> arrayList;
        if (aVar.m39335n() == 0 && (arrayList = this.f31104N) != null) {
            C11520h hVar = arrayList.get(i);
            ((C9594b) aVar.f3479a).m8062y(hVar, C11520h.m298g(hVar, this.f31105O));
        }
    }

    @Override
    public void onClick(View view) {
        C11520h wallpaper;
        if (!(view instanceof C9594b) || (wallpaper = ((C9594b) view).getWallpaper()) == null) {
            return;
        }
        if (wallpaper.m320Q()) {
            C1405v.m37104t(false);
        } else {
            this.f31103M.mo4348c().m2294pc().m4096s0(wallpaper, true, C11524j.m177i0());
        }
    }

    public C9593a mo6145S(ViewGroup viewGroup, int i) {
        return C9593a.m8069O(this.f31103M.mo4347s(), i, this, null);
    }

    @Override
    public void mo377q(C10930q6 q6Var, C11520h hVar, int i) {
        if (this.f31103M.mo4348c() == q6Var && C11524j.m177i0() == i) {
            ArrayList<C11520h> arrayList = this.f31104N;
            if (arrayList != null && !arrayList.isEmpty() && hVar != null && hVar.m320Q()) {
                int i2 = 0;
                if (!C11520h.m298g(this.f31104N.get(0), hVar)) {
                    C11520h hVar2 = this.f31104N.get(0);
                    this.f31104N.set(0, hVar);
                    int j0 = m8082j0(hVar);
                    if (j0 != -1) {
                        Iterator<RecyclerView> it = this.f31106P.iterator();
                        while (it.hasNext()) {
                            View C = it.next().getLayoutManager().mo39265C(j0);
                            if (C != null && (C instanceof C9594b)) {
                                C9594b bVar = (C9594b) C;
                                if (C11520h.m298g(bVar.getWallpaper(), hVar2)) {
                                    bVar.m8064v(hVar);
                                    i2++;
                                }
                            }
                        }
                        if (i2 != this.f31106P.size()) {
                            m39315I(j0);
                        }
                    }
                }
            }
            m8072t0(hVar);
        }
    }

    public void mo6144V(C9593a aVar) {
        int n = aVar.m39335n();
        if (n == 0) {
            ((C9594b) aVar.f3479a).m8067f();
        } else if (n == 1) {
            ((C6977n2) aVar.f3479a).mo8225f();
        }
    }

    public void mo6143W(C9593a aVar) {
        int n = aVar.m39335n();
        if (n == 0) {
            ((C9594b) aVar.f3479a).m8068b();
        } else if (n == 1) {
            ((C6977n2) aVar.f3479a).mo8229b();
        }
    }

    public final void m8079m0(ArrayList<C11520h> arrayList) {
        int D = mo6153D();
        this.f31104N = arrayList;
        C11520h I = this.f31103M.mo4348c().m2294pc().m4148I(C11524j.m177i0());
        this.f31105O = I;
        int j0 = m8082j0(I);
        if (j0 == -1) {
            j0 = 0;
            while (arrayList.size() > j0) {
                C11520h hVar = arrayList.get(j0);
                if (!hVar.m320Q() && !hVar.m319R()) {
                    break;
                }
                j0++;
            }
            arrayList.add(j0, this.f31105O);
        }
        C7389v0.m16615k2(this, D);
        m8084h0(false, j0);
    }

    public final void m8072t0(C11520h hVar) {
        if (!C11520h.m298g(this.f31105O, hVar)) {
            C11520h hVar2 = this.f31105O;
            this.f31105O = hVar;
            m8071u0(hVar2, false);
            m8071u0(hVar, true);
            m8085g0(true);
        }
    }

    public final void m8071u0(C11520h hVar, boolean z) {
        int j0 = m8082j0(hVar);
        if (j0 != -1) {
            int i = 0;
            Iterator<RecyclerView> it = this.f31106P.iterator();
            while (it.hasNext()) {
                View C = it.next().getLayoutManager().mo39265C(j0);
                if (C != null && (C instanceof C9594b)) {
                    C9594b bVar = (C9594b) C;
                    if (C11520h.m298g(bVar.getWallpaper(), hVar)) {
                        bVar.setWallpaperSelected(z);
                        i++;
                    }
                }
            }
            if (i == 0 || i < this.f31106P.size()) {
                m39315I(j0);
            }
        }
    }

    public final void m8070w0(final List<C11520h> list) {
        if (list != null) {
            C4356b0.m28203k().m28197q(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC9592k4.this.m8078n0(list);
                }
            });
        }
    }
}
