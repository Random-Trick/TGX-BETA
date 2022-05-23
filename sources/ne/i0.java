package ne;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import eb.f;
import eb.k;
import eb.l;
import java.util.ArrayList;
import java.util.Iterator;
import me.vkryl.android.widget.FrameLayoutFix;
import ud.v4;

public class i0 extends FrameLayoutFix implements kb.c {
    public final ArrayList<b> M = new ArrayList<>();
    public final k N = new k(0, new k.b() {
        @Override
        public final void n4(int i10, float f10, float f11, k kVar) {
            i0.this.H1(i10, f10, f11, kVar);
        }

        @Override
        public void o4(int i10, float f10, k kVar) {
            l.a(this, i10, f10, kVar);
        }
    }, db.b.f7287b, 180, 1.0f);
    public int O;
    public d P;

    public class a implements k.b {
        public final c f18099a;

        public a(c cVar) {
            this.f18099a = cVar;
        }

        @Override
        public void n4(int i10, float f10, float f11, k kVar) {
            i0.this.P1();
        }

        @Override
        public void o4(int i10, float f10, k kVar) {
            if (f10 == 0.0f) {
                this.f18099a.o7();
            }
        }
    }

    public static class b {
        public final c f18101a;
        public final View f18102b;
        public final f3 f18103c;
        public final f f18104d;
        public int f18105e;

        public b(c cVar, View view, f3 f3Var, k.b bVar) {
            this.f18101a = cVar;
            this.f18102b = view;
            this.f18103c = f3Var;
            this.f18104d = new f(0, bVar, db.b.f7287b, 180L);
            this.f18105e = cVar.a6();
        }
    }

    public interface c extends kb.e<View> {
        boolean O0();

        int a6();

        void o7();
    }

    public interface d {
        void a(i0 i0Var);
    }

    public static final class e implements c {
        public final View f18106a;
        public final int f18107b;

        public e(View view, int i10) {
            this.f18106a = view;
            this.f18107b = i10;
        }

        @Override
        public boolean O0() {
            return j0.a(this);
        }

        public View get() {
            return this.f18106a;
        }

        @Override
        public int a6() {
            return this.f18107b;
        }

        @Override
        public void o7() {
            j0.b(this);
        }
    }

    public i0(Context context) {
        super(context);
    }

    public void H1(int i10, float f10, float f11, k kVar) {
        P1();
    }

    public void B1(c cVar, boolean z10, float f10) {
        int D1 = D1(cVar);
        if (D1 != -1) {
            this.M.get(D1).f18104d.f(z10, f10);
            P1();
        }
    }

    public void C1(boolean z10) {
        Iterator<b> it = this.M.iterator();
        while (it.hasNext()) {
            it.next().f18104d.p(false, z10);
        }
    }

    public final int D1(c cVar) {
        Iterator<b> it = this.M.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next().f18101a == cVar) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public void E1(c[] cVarArr, v4<?> v4Var) {
        if (!this.M.isEmpty()) {
            throw new IllegalStateException();
        } else if (cVarArr.length != 0) {
            this.M.ensureCapacity(cVarArr.length);
            for (c cVar : cVarArr) {
                f3 f3Var = new f3(getContext());
                f3Var.setSimpleBottomTransparentShadow(false);
                f3Var.setVisibility(8);
                f3Var.setAlpha(0.0f);
                f3Var.setLayoutParams(FrameLayoutFix.q1(-1, a0.i(7.0f)));
                addView(f3Var, 0);
                if (v4Var != null) {
                    v4Var.t8(f3Var);
                }
                View view = cVar.get();
                view.setVisibility(8);
                addView(view, 0);
                this.M.add(new b(cVar, view, f3Var, new a(cVar)));
            }
            this.M.trimToSize();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public boolean G1(c cVar) {
        int D1 = D1(cVar);
        return D1 != -1 && this.M.get(D1).f18104d.g() > 0.0f;
    }

    public void I1(c cVar) {
        int D1 = D1(cVar);
        if (D1 != -1) {
            b bVar = this.M.get(D1);
            int a62 = cVar.a6();
            if (bVar.f18105e != a62) {
                bVar.f18105e = a62;
                P1();
            }
        }
    }

    public final void K1(int i10) {
        if (this.O != i10) {
            this.O = i10;
            d dVar = this.P;
            if (dVar != null) {
                dVar.a(this);
            }
        }
    }

    public void L1(float f10, boolean z10) {
        if (z10) {
            this.N.i(f10);
            return;
        }
        this.N.l(f10);
        P1();
    }

    public void O1(c cVar, boolean z10, boolean z11) {
        int D1 = D1(cVar);
        if (D1 != -1) {
            this.M.get(D1).f18104d.p(z10, z11);
        }
    }

    public final void P1() {
        Iterator<b> it = this.M.iterator();
        float f10 = 0.0f;
        while (it.hasNext()) {
            b next = it.next();
            float g10 = next.f18104d.g();
            if (next.f18101a.O0()) {
                g10 *= this.N.o();
            }
            float f11 = next.f18105e;
            float f12 = f10 - ((1.0f - g10) * f11);
            int i10 = g10 > 0.0f ? 0 : 8;
            next.f18102b.setTranslationY(f12);
            if (next.f18102b.getVisibility() != i10) {
                next.f18102b.setVisibility(i10);
            }
            next.f18103c.setAlpha(g10);
            next.f18103c.setTranslationY(f12 + f11);
            if (next.f18103c.getVisibility() != i10) {
                next.f18103c.setVisibility(i10);
            }
            f10 += f11 * g10;
        }
        K1(Math.round(f10));
    }

    @Override
    public void Q2() {
        Iterator<b> it = this.M.iterator();
        while (it.hasNext()) {
            b next = it.next();
            c cVar = next.f18101a;
            if (cVar instanceof kb.c) {
                ((kb.c) cVar).Q2();
            }
            View view = next.f18102b;
            if (view instanceof kb.c) {
                ((kb.c) view).Q2();
            }
        }
        removeAllViews();
    }

    public int getTotalVisualHeight() {
        Iterator<b> it = this.M.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            b next = it.next();
            float g10 = next.f18104d.g();
            if (next.f18101a.O0()) {
                g10 *= this.N.o();
            }
            i10 = (int) (i10 + (next.f18105e * g10));
        }
        K1(i10);
        return i10;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent) || motionEvent.getAction() != 0 || motionEvent.getY() < ((float) getTotalVisualHeight());
    }

    public void setTotalHeightChangeListener(d dVar) {
        this.P = dVar;
    }
}
