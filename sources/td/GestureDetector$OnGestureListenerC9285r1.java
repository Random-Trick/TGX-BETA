package td;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import be.C1357a0;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import p082fd.C4403w;

public class GestureDetector$OnGestureListenerC9285r1 implements GestureDetector.OnGestureListener {
    public boolean f30030M;
    public float f30031N;
    public float f30032O;
    public int f30033P;
    public int f30034Q;
    public boolean f30035R;
    public boolean f30036S;
    public boolean f30037T;
    public boolean f30038U;
    public boolean f30039V;
    public boolean f30040W;
    public GestureDetector f30041a;
    public C9270q1 f30042b;
    public View$OnClickListenerC9218k0 f30043c;

    public GestureDetector$OnGestureListenerC9285r1(Context context, C9270q1 q1Var, View$OnClickListenerC9218k0 k0Var) {
        this.f30041a = new GestureDetector(context, this);
        this.f30042b = q1Var;
        this.f30043c = k0Var;
        m9640c(false);
    }

    public final boolean m9642a() {
        int N = this.f30042b.m9748N();
        AbstractC9323v4<?> F = this.f30042b.m9763F();
        return N > 0 && F != null && F.mo9134we() && !F.mo9177r9() && !F.m9374Oa() && !F.m9390Ma() && (N != 1 || !F.m9382Na());
    }

    public final boolean m9641b(AbstractC9323v4<?> v4Var, float f, float f2) {
        int N = this.f30042b.m9748N();
        return N > 0 && v4Var != null && v4Var.mo9134we() && !v4Var.mo9177r9() && !v4Var.m9374Oa() && !v4Var.m9390Ma() && (N != 1 || !v4Var.m9382Na()) && v4Var.mo8863S8(this.f30042b, f, f2);
    }

    public final void m9640c(boolean z) {
        this.f30031N = 0.0f;
        this.f30032O = 0.0f;
        this.f30035R = false;
        this.f30036S = false;
        this.f30037T = false;
        this.f30038U = false;
        this.f30033P = -1;
        this.f30034Q = -1;
        if (z && !this.f30042b.m9742S()) {
            m9634i(false);
        }
    }

    public boolean m9639d() {
        return this.f30037T || this.f30038U;
    }

    public void m9638e() {
        View$OnClickListenerC9218k0 k0Var;
        this.f30039V = false;
        if (this.f30037T) {
            this.f30042b.m9771B();
            this.f30042b.m9760G0(false);
        } else if (this.f30038U && (k0Var = this.f30043c) != null) {
            k0Var.m9891uf();
        }
        m9640c(true);
    }

    public boolean m9637f(MotionEvent motionEvent) {
        View$OnClickListenerC9218k0 k0Var;
        this.f30033P = (int) Math.floor(motionEvent.getX(0) - this.f30031N);
        int floor = this.f30036S ? (int) Math.floor(Math.max(0.0f, motionEvent.getY(0) - this.f30032O)) : 0;
        this.f30034Q = floor;
        if (this.f30037T) {
            this.f30042b.m9750L0(this.f30036S ? floor : this.f30033P);
            return this.f30037T;
        } else if (!this.f30038U || (k0Var = this.f30043c) == null) {
            if (this.f30035R) {
                float x = motionEvent.getX(0) - this.f30031N;
                float y = motionEvent.getY(0) - this.f30032O;
                View$OnClickListenerC9218k0 k0Var2 = this.f30043c;
                if (k0Var2 == null || !k0Var2.m9958Ff() || Math.abs(x) < C1357a0.m37534p()) {
                    if (!(!this.f30036S ? !(!C4403w.m27984G2() ? x < C1357a0.m37533q() || Math.abs(y) > C1357a0.m37532r() : x > (-C1357a0.m37533q()) || Math.abs(y) > C1357a0.m37532r()) : !(y < C1357a0.m37533q() || Math.abs(x) > C1357a0.m37532r()))) {
                        return false;
                    }
                    if (!m9642a()) {
                        this.f30035R = false;
                        return false;
                    }
                    this.f30031N += x;
                    this.f30032O += y;
                    this.f30035R = false;
                    this.f30037T = this.f30042b.m9748N() > 1;
                    m9634i(true);
                    if (!this.f30037T) {
                        View$OnClickListenerC9218k0 k0Var3 = this.f30043c;
                        if (k0Var3 == null || !k0Var3.m9915fg()) {
                            this.f30035R = false;
                        } else {
                            this.f30038U = true;
                        }
                    } else if (!this.f30042b.m9703p0(motionEvent.getY())) {
                        this.f30037T = false;
                        this.f30035R = false;
                        return false;
                    }
                    m9637f(motionEvent);
                    return true;
                }
                this.f30031N += x;
                if (!m9642a()) {
                    this.f30035R = false;
                    return false;
                }
                this.f30035R = false;
                if (!this.f30043c.m9915fg()) {
                    this.f30035R = false;
                    return false;
                }
                this.f30038U = true;
            }
            return false;
        } else {
            if (k0Var.m9958Ff()) {
                this.f30033P = (int) (motionEvent.getX(0) - this.f30031N);
            }
            this.f30043c.m9901mg(this.f30033P);
            return false;
        }
    }

    public boolean m9636g(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f30041a.onTouchEvent(motionEvent);
            return true;
        } else if (action == 1) {
            this.f30041a.onTouchEvent(motionEvent);
            return m9635h(motionEvent);
        } else if (action != 2) {
            return this.f30041a.onTouchEvent(motionEvent);
        } else {
            this.f30041a.onTouchEvent(motionEvent);
            return m9637f(motionEvent);
        }
    }

    public boolean m9635h(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: td.GestureDetector$OnGestureListenerC9285r1.m9635h(android.view.MotionEvent):boolean");
    }

    public final void m9634i(boolean z) {
        if (this.f30040W != z) {
            this.f30040W = z;
            ((AbstractView$OnTouchListenerC7889a) this.f30042b.m9765E()).m14492f3(z);
        }
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        AbstractC9323v4<?> F;
        boolean z = false;
        if (!this.f30042b.m9738W() && !this.f30042b.m9742S()) {
            this.f30031N = motionEvent.getX(0);
            float y = motionEvent.getY(0);
            this.f30032O = y;
            if (y > 0.0f && (F = this.f30042b.m9763F()) != null && !F.mo9325Va()) {
                View$OnClickListenerC9218k0 k0Var = this.f30043c;
                boolean z2 = (k0Var != null && k0Var.m9958Ff()) || (!this.f30030M && m9641b(F, this.f30031N, this.f30032O));
                this.f30035R = z2;
                if (z2 && F.mo9386Me()) {
                    z = true;
                }
                this.f30036S = z;
                return this.f30035R;
            }
        }
        return false;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.f30036S) {
            f2 = f;
        }
        float abs = Math.abs(f2);
        if (abs > C1357a0.m37540j(250.0f, 1.0f)) {
            this.f30039V = true;
            if (this.f30037T) {
                if ((f2 >= 0.0f || (C4403w.m27984G2() && !this.f30036S)) && (f2 < 0.0f || !C4403w.m27984G2() || this.f30036S)) {
                    this.f30042b.m9704p(abs);
                } else {
                    this.f30042b.m9693v(abs);
                }
            } else if (this.f30038U && this.f30043c != null) {
                if ((f >= 0.0f || C4403w.m27984G2()) && (f < 0.0f || !C4403w.m27984G2())) {
                    this.f30043c.m9927Zf(abs);
                } else {
                    this.f30043c.m9896pf(abs, null);
                }
            }
            m9640c(false);
        } else {
            this.f30039V = false;
        }
        return this.f30039V;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return this.f30037T || this.f30038U;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
