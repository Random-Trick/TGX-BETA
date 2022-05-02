package me;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import java.util.ArrayList;
import java.util.Iterator;
import me.vkryl.android.widget.FrameLayoutFix;
import p037cb.C2057b;
import p051db.C3940f;
import p051db.C3950k;
import p051db.C3953l;
import p139jb.AbstractC5911c;
import p139jb.AbstractC5913e;
import td.AbstractC9323v4;

public class C6910i0 extends FrameLayoutFix implements AbstractC5911c {
    public final ArrayList<C6912b> f21838M = new ArrayList<>();
    public final C3950k f21839N = new C3950k(0, new C3950k.AbstractC3952b() {
        @Override
        public final void mo45P5(int i, float f, float f2, C3950k kVar) {
            C6910i0.this.m18478L1(i, f, f2, kVar);
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
            C3953l.m29526a(this, i, f, kVar);
        }
    }, C2057b.f7280b, 180, 1.0f);
    public int f21840O;
    public AbstractC6914d f21841P;

    public class C6911a implements C3950k.AbstractC3952b {
        public final AbstractC6913c f21842a;

        public C6911a(AbstractC6913c cVar) {
            this.f21842a = cVar;
        }

        @Override
        public void mo45P5(int i, float f, float f2, C3950k kVar) {
            C6910i0.this.m18473S1();
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
            if (f == 0.0f) {
                this.f21842a.mo18468p7();
            }
        }
    }

    public static class C6912b {
        public final AbstractC6913c f21844a;
        public final View f21845b;
        public final C6879f3 f21846c;
        public final C3940f f21847d;
        public int f21848e;

        public C6912b(AbstractC6913c cVar, View view, C6879f3 f3Var, C3950k.AbstractC3952b bVar) {
            this.f21844a = cVar;
            this.f21845b = view;
            this.f21846c = f3Var;
            this.f21847d = new C3940f(0, bVar, C2057b.f7280b, 180L);
            this.f21848e = cVar.mo18469b6();
        }
    }

    public interface AbstractC6913c extends AbstractC5913e<View> {
        boolean mo18471M0();

        int mo18469b6();

        void mo18468p7();
    }

    public interface AbstractC6914d {
        void mo18472a(C6910i0 i0Var);
    }

    public static final class C6915e implements AbstractC6913c {
        public final View f21849a;
        public final int f21850b;

        public C6915e(View view, int i) {
            this.f21849a = view;
            this.f21850b = i;
        }

        @Override
        public boolean mo18471M0() {
            return C6922j0.m18448a(this);
        }

        public View get() {
            return this.f21849a;
        }

        @Override
        public int mo18469b6() {
            return this.f21850b;
        }

        @Override
        public void mo18468p7() {
            C6922j0.m18447b(this);
        }
    }

    public C6910i0(Context context) {
        super(context);
    }

    public void m18478L1(int i, float f, float f2, C3950k kVar) {
        m18473S1();
    }

    public void m18483E1(AbstractC6913c cVar, boolean z, float f) {
        int G1 = m18481G1(cVar);
        if (G1 != -1) {
            this.f21838M.get(G1).f21847d.m29585f(z, f);
            m18473S1();
        }
    }

    public void m18482F1(boolean z) {
        Iterator<C6912b> it = this.f21838M.iterator();
        while (it.hasNext()) {
            it.next().f21847d.m29575p(false, z);
        }
    }

    public final int m18481G1(AbstractC6913c cVar) {
        Iterator<C6912b> it = this.f21838M.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().f21844a == cVar) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void m18480I1(AbstractC6913c[] cVarArr, AbstractC9323v4<?> v4Var) {
        if (!this.f21838M.isEmpty()) {
            throw new IllegalStateException();
        } else if (cVarArr.length != 0) {
            this.f21838M.ensureCapacity(cVarArr.length);
            for (AbstractC6913c cVar : cVarArr) {
                C6879f3 f3Var = new C6879f3(getContext());
                f3Var.setSimpleBottomTransparentShadow(false);
                f3Var.setVisibility(8);
                f3Var.setAlpha(0.0f);
                f3Var.setLayoutParams(FrameLayoutFix.m18008s1(-1, C1357a0.m37541i(7.0f)));
                addView(f3Var, 0);
                if (v4Var != null) {
                    v4Var.m9163t8(f3Var);
                }
                View view = cVar.get();
                view.setVisibility(8);
                addView(view, 0);
                this.f21838M.add(new C6912b(cVar, view, f3Var, new C6911a(cVar)));
            }
            this.f21838M.trimToSize();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public boolean m18479J1(AbstractC6913c cVar) {
        int G1 = m18481G1(cVar);
        return G1 != -1 && this.f21838M.get(G1).f21847d.m29584g() > 0.0f;
    }

    public void m18477M1(AbstractC6913c cVar) {
        int G1 = m18481G1(cVar);
        if (G1 != -1) {
            C6912b bVar = this.f21838M.get(G1);
            int b6 = cVar.mo18469b6();
            if (bVar.f21848e != b6) {
                bVar.f21848e = b6;
                m18473S1();
            }
        }
    }

    public final void m18476N1(int i) {
        if (this.f21840O != i) {
            this.f21840O = i;
            AbstractC6914d dVar = this.f21841P;
            if (dVar != null) {
                dVar.mo18472a(this);
            }
        }
    }

    public void m18475O1(float f, boolean z) {
        if (z) {
            this.f21839N.m29544i(f);
            return;
        }
        this.f21839N.m29541l(f);
        m18473S1();
    }

    public void m18474Q1(AbstractC6913c cVar, boolean z, boolean z2) {
        int G1 = m18481G1(cVar);
        if (G1 != -1) {
            this.f21838M.get(G1).f21847d.m29575p(z, z2);
        }
    }

    public final void m18473S1() {
        Iterator<C6912b> it = this.f21838M.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            C6912b next = it.next();
            float g = next.f21847d.m29584g();
            if (next.f21844a.mo18471M0()) {
                g *= this.f21839N.m29538o();
            }
            float f2 = next.f21848e;
            float f3 = f - ((1.0f - g) * f2);
            int i = g > 0.0f ? 0 : 8;
            next.f21845b.setTranslationY(f3);
            if (next.f21845b.getVisibility() != i) {
                next.f21845b.setVisibility(i);
            }
            next.f21846c.setAlpha(g);
            next.f21846c.setTranslationY(f3 + f2);
            if (next.f21846c.getVisibility() != i) {
                next.f21846c.setVisibility(i);
            }
            f += f2 * g;
        }
        m18476N1(Math.round(f));
    }

    @Override
    public void mo4501a3() {
        Iterator<C6912b> it = this.f21838M.iterator();
        while (it.hasNext()) {
            C6912b next = it.next();
            AbstractC6913c cVar = next.f21844a;
            if (cVar instanceof AbstractC5911c) {
                ((AbstractC5911c) cVar).mo4501a3();
            }
            View view = next.f21845b;
            if (view instanceof AbstractC5911c) {
                ((AbstractC5911c) view).mo4501a3();
            }
        }
        removeAllViews();
    }

    public int getTotalVisualHeight() {
        Iterator<C6912b> it = this.f21838M.iterator();
        int i = 0;
        while (it.hasNext()) {
            C6912b next = it.next();
            float g = next.f21847d.m29584g();
            if (next.f21844a.mo18471M0()) {
                g *= this.f21839N.m29538o();
            }
            i = (int) (i + (next.f21848e * g));
        }
        m18476N1(i);
        return i;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent) || motionEvent.getAction() != 0 || motionEvent.getY() < ((float) getTotalVisualHeight());
    }

    public void setTotalHeightChangeListener(AbstractC6914d dVar) {
        this.f21841P = dVar;
    }
}
