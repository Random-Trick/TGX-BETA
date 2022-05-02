package p053dd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import be.C1379j0;
import be.C1389o;
import be.C1399s0;
import gd.C4618d7;
import java.util.ArrayList;
import java.util.Iterator;
import p037cb.C2057b;
import p037cb.C2065g;
import p053dd.C3992a;
import p082fd.C4383l;
import p082fd.C4403w;

public class C4004i extends View {
    public int f13420M;
    public boolean f13421N;
    public boolean f13422O;
    public int f13423P;
    public int f13424Q;
    public float f13425R;
    public int f13427T;
    public int f13428U;
    public int f13429V;
    public int f13430W;
    public TextPaint f13431a;
    public C3992a f13433c;
    public int f13426S = -1;
    public ArrayList<C3998d> f13432b = new ArrayList<>(10);

    public class C4005a extends AnimatorListenerAdapter {
        public final C3998d f13434a;

        public C4005a(C3998d dVar) {
            this.f13434a = dVar;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            this.f13434a.m29383h();
            if (C4004i.this.f13422O) {
                C4004i.this.f13433c.m29407J1();
            }
            C4004i.this.setBoundLayerType(0);
            C4004i.this.f13421N = false;
        }
    }

    public class C4006b extends AnimatorListenerAdapter {
        public final boolean f13436a;

        public C4006b(boolean z) {
            this.f13436a = z;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            C4004i.this.m29351n();
            if (C4004i.this.f13422O) {
                C4004i.this.f13433c.m29407J1();
            }
            if (this.f13436a) {
                C4004i.this.requestLayout();
            }
            C4004i.this.setBoundLayerType(0);
            C4004i.this.f13421N = false;
        }
    }

    public C4004i(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(7);
        this.f13431a = textPaint;
        textPaint.setStyle(Paint.Style.FILL);
        this.f13431a.setTypeface(C1389o.m37258k());
        this.f13431a.setTextSize(C1357a0.m37541i(14.0f));
    }

    public void m29347r(ValueAnimator valueAnimator) {
        setFactor(C2057b.m35735a(valueAnimator));
    }

    public void m29346s(C3998d dVar) {
        ArrayList<C3998d> arrayList;
        dVar.m29365z();
        if (this.f13432b.size() == 0) {
            dVar.m29392C(C1357a0.m37541i(4.0f), C1357a0.m37541i(12.0f));
        } else {
            C3998d dVar2 = this.f13432b.get(arrayList.size() - 1);
            float i = C1357a0.m37541i(8.0f);
            float o = dVar2.m29376o() + dVar2.m29377n() + i;
            float p = dVar2.m29375p();
            if (dVar.m29377n() + o > getMeasuredWidth() - i) {
                o = C1357a0.m37541i(4.0f);
                p = p + dVar2.m29378m() + i;
            }
            dVar.m29392C((int) o, (int) p);
        }
        this.f13425R = 0.0f;
        int size = this.f13432b.size();
        this.f13423P = size;
        this.f13424Q = size + 1;
        int currentHeight = getCurrentHeight();
        this.f13432b.add(dVar);
        int currentHeight2 = getCurrentHeight();
        if (currentHeight2 != currentHeight) {
            requestLayout();
        }
        this.f13422O = this.f13433c.m29404N1(currentHeight2, false);
        dVar.m29366y();
        setBoundLayerType(2);
        ValueAnimator b = C2057b.m35734b();
        b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C4004i.this.m29347r(valueAnimator);
            }
        });
        b.setInterpolator(C2057b.f7280b);
        b.setDuration(150L);
        b.setStartDelay(20L);
        b.addListener(new C4005a(dVar));
        b.start();
    }

    public void setBoundLayerType(int i) {
        if (getMeasuredHeight() < 512) {
            C1399s0.m37183f0(this, i);
        }
        C1399s0.m37183f0(C1379j0.m37299v(), i);
        C3992a.AbstractC3995c cVar = this.f13433c.f13372P;
        if (cVar != null) {
            C1399s0.m37183f0(cVar.mo29397o(), i);
        }
    }

    public void m29345t(C4618d7 d7Var) {
        int i = C1357a0.m37541i(100.0f);
        int B = (((int) ((C1357a0.m37553B() - C1357a0.m37541i(60.0f)) * 0.5f)) - C1357a0.m37541i(8.0f)) - C1357a0.m37541i(44.0f);
        if (B >= i) {
            i = B > C1357a0.m37541i(200.0f) ? C1357a0.m37541i(200.0f) : B;
        }
        final C3998d dVar = new C3998d(this, d7Var, i);
        C1379j0.m37334d0(new Runnable() {
            @Override
            public final void run() {
                C4004i.this.m29346s(dVar);
            }
        });
    }

    public void m29344u(ValueAnimator valueAnimator) {
        setFactor(C2057b.m35735a(valueAnimator));
    }

    public int getCurrentHeight() {
        int size = this.f13432b.size();
        if (size == 0) {
            return 0;
        }
        C3998d dVar = null;
        while (size != 0) {
            dVar = this.f13432b.get(size - 1);
            if (!dVar.m29374q()) {
                break;
            }
            size--;
        }
        if (dVar.m29374q()) {
            return 0;
        }
        return dVar.m29378m() + dVar.m29375p();
    }

    public float getFactor() {
        return this.f13425R;
    }

    public void m29356i(final C4618d7 d7Var) {
        this.f13421N = true;
        this.f13422O = false;
        C4383l.m28059a().m28058b(new Runnable() {
            @Override
            public final void run() {
                C4004i.this.m29345t(d7Var);
            }
        });
    }

    public void m29355j(C4618d7 d7Var) {
        ArrayList<C3998d> arrayList;
        int i = C1357a0.m37541i(100.0f);
        int B = (((int) ((C1357a0.m37553B() - C1357a0.m37541i(60.0f)) * 0.5f)) - C1357a0.m37541i(8.0f)) - C1357a0.m37541i(44.0f);
        if (B >= i) {
            i = B > C1357a0.m37541i(200.0f) ? C1357a0.m37541i(200.0f) : B;
        }
        C3998d dVar = new C3998d(this, d7Var, i);
        if (this.f13432b.size() == 0) {
            dVar.m29392C(C1357a0.m37541i(4.0f), C1357a0.m37541i(12.0f));
        } else {
            C3998d dVar2 = this.f13432b.get(arrayList.size() - 1);
            float i2 = C1357a0.m37541i(8.0f);
            float o = dVar2.m29376o() + dVar2.m29377n() + i2;
            float p = dVar2.m29375p();
            if (dVar.m29377n() + o > getMeasuredWidth() - i2) {
                o = C1357a0.m37541i(4.0f);
                p = p + dVar2.m29378m() + i2;
            }
            dVar.m29392C((int) o, (int) p);
        }
        dVar.m29365z();
        this.f13432b.add(dVar);
    }

    public void m29354k() {
        int size = this.f13432b.size();
        if (size != 0) {
            float i = C1357a0.m37541i(8.0f);
            float g = (getMeasuredWidth() == 0 ? C1357a0.m37543g() - C1357a0.m37541i(60.0f) : getMeasuredWidth()) - i;
            float i2 = C1357a0.m37541i(4.0f);
            float i3 = C1357a0.m37541i(12.0f);
            float f = i2;
            for (int i4 = 0; i4 < size; i4++) {
                C3998d dVar = this.f13432b.get(i4);
                if (!dVar.m29374q()) {
                    if (dVar.m29377n() + f > g) {
                        i3 = i3 + dVar.m29378m() + i;
                        f = i2;
                    }
                    dVar.m29392C((int) f, (int) i3);
                    f = f + dVar.m29377n() + i;
                }
            }
        }
    }

    public final void m29353l() {
        this.f13432b.get(this.f13426S).m29385f();
        this.f13426S = -1;
    }

    public final void m29352m() {
        C2065g.m35719c(this);
        C3998d dVar = this.f13432b.get(this.f13426S);
        m29349p(this.f13426S, true);
        C3992a.AbstractC3995c cVar = this.f13433c.f13372P;
        if (cVar != null) {
            cVar.mo29396p3(dVar.m29380k());
        }
    }

    public void m29351n() {
        for (int i = this.f13423P; i < this.f13424Q; i++) {
            this.f13432b.get(i).m29384g();
        }
        this.f13432b.remove(this.f13423P).m29382i();
        this.f13424Q = 0;
        this.f13423P = 0;
    }

    public void m29350o() {
        Iterator<C3998d> it = this.f13432b.iterator();
        while (it.hasNext()) {
            it.next().m29382i();
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Iterator<C3998d> it = this.f13432b.iterator();
        while (it.hasNext()) {
            it.next().m29370u();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Iterator<C3998d> it = this.f13432b.iterator();
        while (it.hasNext()) {
            it.next().m29369v();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        Iterator<C3998d> it = this.f13432b.iterator();
        while (it.hasNext()) {
            it.next().m29381j(canvas, this);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), getCurrentHeight());
        int measuredWidth = getMeasuredWidth();
        if (this.f13420M != measuredWidth) {
            this.f13420M = measuredWidth;
            m29354k();
            int currentHeight = getCurrentHeight();
            this.f13433c.m29406L1(currentHeight);
            setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), currentHeight);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f13427T = (int) motionEvent.getX();
            this.f13428U = (int) motionEvent.getY();
            int i2 = (int) (C1357a0.m37541i(8.0f) * 0.5f);
            this.f13426S = -1;
            if (this.f13421N) {
                return false;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= this.f13432b.size()) {
                    break;
                }
                C3998d dVar = this.f13432b.get(i3);
                int o = dVar.m29376o();
                int p = dVar.m29375p();
                int n = dVar.m29377n();
                int m = dVar.m29378m();
                if (C4403w.m27984G2()) {
                    o = (getMeasuredWidth() - o) - n;
                }
                int i4 = this.f13427T;
                if (i4 >= o - i2 && i4 < o + n + i2 && (i = this.f13428U) >= p - i2 && i < p + m + i2) {
                    this.f13426S = i3;
                    this.f13429V = C1357a0.m37541i(1.0f);
                    this.f13430W = C1357a0.m37541i(7.0f);
                    dVar.m29391D();
                    break;
                }
                i3++;
            }
            return this.f13426S != -1;
        } else if (action != 1) {
            if (action == 2) {
                if (this.f13426S != -1 && (Math.abs(this.f13427T - motionEvent.getX()) > C1357a0.m37534p() || Math.abs(this.f13428U - motionEvent.getY()) > C1357a0.m37534p())) {
                    m29353l();
                }
                return true;
            } else if (action != 3) {
                return false;
            } else {
                if (this.f13426S != -1) {
                    m29353l();
                }
                return true;
            }
        } else if (this.f13426S == -1) {
            return false;
        } else {
            m29352m();
            return true;
        }
    }

    public final void m29349p(int i, boolean z) {
        int currentHeight = getCurrentHeight();
        this.f13432b.get(i).m29368w();
        int i2 = i + 1;
        if (i2 < this.f13432b.size()) {
            while (i2 < this.f13432b.size()) {
                this.f13432b.get(i2).m29367x();
                i2++;
            }
            m29354k();
        }
        this.f13423P = i;
        this.f13424Q = this.f13432b.size();
        this.f13425R = 0.0f;
        boolean z2 = false;
        this.f13422O = false;
        this.f13421N = true;
        int currentHeight2 = getCurrentHeight();
        if (currentHeight2 != currentHeight) {
            z2 = true;
        }
        this.f13422O = this.f13433c.m29404N1(currentHeight2, z);
        setBoundLayerType(2);
        ValueAnimator b = C2057b.m35734b();
        b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C4004i.this.m29344u(valueAnimator);
            }
        });
        b.setInterpolator(C2057b.f7280b);
        b.setDuration(150L);
        b.addListener(new C4006b(z2));
        b.start();
    }

    public boolean m29348q() {
        return this.f13421N;
    }

    public void setFactor(float f) {
        if (this.f13425R != f) {
            this.f13425R = f;
            for (int i = this.f13423P; i < this.f13424Q; i++) {
                this.f13432b.get(i).m29393B(f);
            }
            if (this.f13422O) {
                this.f13433c.setFactor(f);
            }
            invalidate();
        }
    }

    public void setHeaderView(C3992a aVar) {
        this.f13433c = aVar;
    }

    public void m29343v(C4618d7 d7Var) {
        long h = d7Var.m26880h();
        Iterator<C3998d> it = this.f13432b.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().m29380k() == h) {
                m29349p(i, false);
                return;
            }
            i++;
        }
    }
}
