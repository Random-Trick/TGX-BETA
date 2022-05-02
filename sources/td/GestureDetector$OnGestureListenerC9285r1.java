package td;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import be.C1357a0;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import p082fd.C4403w;

public class GestureDetector$OnGestureListenerC9285r1 implements GestureDetector.OnGestureListener {
    public boolean f30033M;
    public float f30034N;
    public float f30035O;
    public int f30036P;
    public int f30037Q;
    public boolean f30038R;
    public boolean f30039S;
    public boolean f30040T;
    public boolean f30041U;
    public boolean f30042V;
    public boolean f30043W;
    public GestureDetector f30044a;
    public C9270q1 f30045b;
    public View$OnClickListenerC9218k0 f30046c;

    public GestureDetector$OnGestureListenerC9285r1(Context context, C9270q1 q1Var, View$OnClickListenerC9218k0 k0Var) {
        this.f30044a = new GestureDetector(context, this);
        this.f30045b = q1Var;
        this.f30046c = k0Var;
        m9639c(false);
    }

    public final boolean m9641a() {
        int N = this.f30045b.m9747N();
        AbstractC9323v4<?> F = this.f30045b.m9762F();
        return N > 0 && F != null && F.mo9134we() && !F.mo9177r9() && !F.m9374Oa() && !F.m9390Ma() && (N != 1 || !F.m9382Na());
    }

    public final boolean m9640b(AbstractC9323v4<?> v4Var, float f, float f2) {
        int N = this.f30045b.m9747N();
        return N > 0 && v4Var != null && v4Var.mo9134we() && !v4Var.mo9177r9() && !v4Var.m9374Oa() && !v4Var.m9390Ma() && (N != 1 || !v4Var.m9382Na()) && v4Var.mo8863S8(this.f30045b, f, f2);
    }

    public final void m9639c(boolean z) {
        this.f30034N = 0.0f;
        this.f30035O = 0.0f;
        this.f30038R = false;
        this.f30039S = false;
        this.f30040T = false;
        this.f30041U = false;
        this.f30036P = -1;
        this.f30037Q = -1;
        if (z && !this.f30045b.m9741S()) {
            m9633i(false);
        }
    }

    public boolean m9638d() {
        return this.f30040T || this.f30041U;
    }

    public void m9637e() {
        View$OnClickListenerC9218k0 k0Var;
        this.f30042V = false;
        if (this.f30040T) {
            this.f30045b.m9770B();
            this.f30045b.m9759G0(false);
        } else if (this.f30041U && (k0Var = this.f30046c) != null) {
            k0Var.m9890uf();
        }
        m9639c(true);
    }

    public boolean m9636f(MotionEvent motionEvent) {
        View$OnClickListenerC9218k0 k0Var;
        this.f30036P = (int) Math.floor(motionEvent.getX(0) - this.f30034N);
        int floor = this.f30039S ? (int) Math.floor(Math.max(0.0f, motionEvent.getY(0) - this.f30035O)) : 0;
        this.f30037Q = floor;
        if (this.f30040T) {
            this.f30045b.m9749L0(this.f30039S ? floor : this.f30036P);
            return this.f30040T;
        } else if (!this.f30041U || (k0Var = this.f30046c) == null) {
            if (this.f30038R) {
                float x = motionEvent.getX(0) - this.f30034N;
                float y = motionEvent.getY(0) - this.f30035O;
                View$OnClickListenerC9218k0 k0Var2 = this.f30046c;
                if (k0Var2 == null || !k0Var2.m9957Ff() || Math.abs(x) < C1357a0.m37537p()) {
                    if (!(!this.f30039S ? !(!C4403w.m27986G2() ? x < C1357a0.m37536q() || Math.abs(y) > C1357a0.m37535r() : x > (-C1357a0.m37536q()) || Math.abs(y) > C1357a0.m37535r()) : !(y < C1357a0.m37536q() || Math.abs(x) > C1357a0.m37535r()))) {
                        return false;
                    }
                    if (!m9641a()) {
                        this.f30038R = false;
                        return false;
                    }
                    this.f30034N += x;
                    this.f30035O += y;
                    this.f30038R = false;
                    this.f30040T = this.f30045b.m9747N() > 1;
                    m9633i(true);
                    if (!this.f30040T) {
                        View$OnClickListenerC9218k0 k0Var3 = this.f30046c;
                        if (k0Var3 == null || !k0Var3.m9914fg()) {
                            this.f30038R = false;
                        } else {
                            this.f30041U = true;
                        }
                    } else if (!this.f30045b.m9702p0(motionEvent.getY())) {
                        this.f30040T = false;
                        this.f30038R = false;
                        return false;
                    }
                    m9636f(motionEvent);
                    return true;
                }
                this.f30034N += x;
                if (!m9641a()) {
                    this.f30038R = false;
                    return false;
                }
                this.f30038R = false;
                if (!this.f30046c.m9914fg()) {
                    this.f30038R = false;
                    return false;
                }
                this.f30041U = true;
            }
            return false;
        } else {
            if (k0Var.m9957Ff()) {
                this.f30036P = (int) (motionEvent.getX(0) - this.f30034N);
            }
            this.f30046c.m9900mg(this.f30036P);
            return false;
        }
    }

    public boolean m9635g(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f30044a.onTouchEvent(motionEvent);
            return true;
        } else if (action == 1) {
            this.f30044a.onTouchEvent(motionEvent);
            return m9634h(motionEvent);
        } else if (action != 2) {
            return this.f30044a.onTouchEvent(motionEvent);
        } else {
            this.f30044a.onTouchEvent(motionEvent);
            return m9636f(motionEvent);
        }
    }

    public boolean m9634h(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: td.GestureDetector$OnGestureListenerC9285r1.m9634h(android.view.MotionEvent):boolean");
    }

    public final void m9633i(boolean z) {
        if (this.f30043W != z) {
            this.f30043W = z;
            ((AbstractView$OnTouchListenerC7889a) this.f30045b.m9764E()).m14491f3(z);
        }
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        AbstractC9323v4<?> F;
        boolean z = false;
        if (!this.f30045b.m9737W() && !this.f30045b.m9741S()) {
            this.f30034N = motionEvent.getX(0);
            float y = motionEvent.getY(0);
            this.f30035O = y;
            if (y > 0.0f && (F = this.f30045b.m9762F()) != null && !F.mo9325Va()) {
                View$OnClickListenerC9218k0 k0Var = this.f30046c;
                boolean z2 = (k0Var != null && k0Var.m9957Ff()) || (!this.f30033M && m9640b(F, this.f30034N, this.f30035O));
                this.f30038R = z2;
                if (z2 && F.mo9386Me()) {
                    z = true;
                }
                this.f30039S = z;
                return this.f30038R;
            }
        }
        return false;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.f30039S) {
            f2 = f;
        }
        float abs = Math.abs(f2);
        if (abs > C1357a0.m37543j(250.0f, 1.0f)) {
            this.f30042V = true;
            if (this.f30040T) {
                if ((f2 >= 0.0f || (C4403w.m27986G2() && !this.f30039S)) && (f2 < 0.0f || !C4403w.m27986G2() || this.f30039S)) {
                    this.f30045b.m9703p(abs);
                } else {
                    this.f30045b.m9692v(abs);
                }
            } else if (this.f30041U && this.f30046c != null) {
                if ((f >= 0.0f || C4403w.m27986G2()) && (f < 0.0f || !C4403w.m27986G2())) {
                    this.f30046c.m9926Zf(abs);
                } else {
                    this.f30046c.m9895pf(abs, null);
                }
            }
            m9639c(false);
        } else {
            this.f30042V = false;
        }
        return this.f30042V;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return this.f30040T || this.f30041U;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
