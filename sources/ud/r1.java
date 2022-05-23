package ud;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import ce.a0;
import gd.w;
import org.thunderdog.challegram.a;

public class r1 implements GestureDetector.OnGestureListener {
    public boolean M;
    public float N;
    public float O;
    public int P;
    public int Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public GestureDetector f24415a;
    public q1 f24416b;
    public k0 f24417c;

    public r1(Context context, q1 q1Var, k0 k0Var) {
        this.f24415a = new GestureDetector(context, this);
        this.f24416b = q1Var;
        this.f24417c = k0Var;
        c(false);
    }

    public final boolean a() {
        int N = this.f24416b.N();
        v4<?> F = this.f24416b.F();
        return N > 0 && F != null && F.we() && !F.r9() && !F.Oa() && !F.Ma() && (N != 1 || !F.Na());
    }

    public final boolean b(v4<?> v4Var, float f10, float f11) {
        int N = this.f24416b.N();
        return N > 0 && v4Var != null && v4Var.we() && !v4Var.r9() && !v4Var.Oa() && !v4Var.Ma() && (N != 1 || !v4Var.Na()) && v4Var.S8(this.f24416b, f10, f11);
    }

    public final void c(boolean z10) {
        this.N = 0.0f;
        this.O = 0.0f;
        this.R = false;
        this.S = false;
        this.T = false;
        this.U = false;
        this.P = -1;
        this.Q = -1;
        if (z10 && !this.f24416b.S()) {
            i(false);
        }
    }

    public boolean d() {
        return this.T || this.U;
    }

    public void e() {
        k0 k0Var;
        this.V = false;
        if (this.T) {
            this.f24416b.B();
            this.f24416b.G0(false);
        } else if (this.U && (k0Var = this.f24417c) != null) {
            k0Var.uf();
        }
        c(true);
    }

    public boolean f(MotionEvent motionEvent) {
        k0 k0Var;
        this.P = (int) Math.floor(motionEvent.getX(0) - this.N);
        int floor = this.S ? (int) Math.floor(Math.max(0.0f, motionEvent.getY(0) - this.O)) : 0;
        this.Q = floor;
        if (this.T) {
            this.f24416b.L0(this.S ? floor : this.P);
            return this.T;
        } else if (!this.U || (k0Var = this.f24417c) == null) {
            if (this.R) {
                float x10 = motionEvent.getX(0) - this.N;
                float y10 = motionEvent.getY(0) - this.O;
                k0 k0Var2 = this.f24417c;
                if (k0Var2 == null || !k0Var2.Ff() || Math.abs(x10) < a0.p()) {
                    if (!(!this.S ? !(!w.G2() ? x10 < a0.q() || Math.abs(y10) > a0.r() : x10 > (-a0.q()) || Math.abs(y10) > a0.r()) : !(y10 < a0.q() || Math.abs(x10) > a0.r()))) {
                        return false;
                    }
                    if (!a()) {
                        this.R = false;
                        return false;
                    }
                    this.N += x10;
                    this.O += y10;
                    this.R = false;
                    this.T = this.f24416b.N() > 1;
                    i(true);
                    if (!this.T) {
                        k0 k0Var3 = this.f24417c;
                        if (k0Var3 == null || !k0Var3.fg()) {
                            this.R = false;
                        } else {
                            this.U = true;
                        }
                    } else if (!this.f24416b.p0(motionEvent.getY())) {
                        this.T = false;
                        this.R = false;
                        return false;
                    }
                    f(motionEvent);
                    return true;
                }
                this.N += x10;
                if (!a()) {
                    this.R = false;
                    return false;
                }
                this.R = false;
                if (!this.f24417c.fg()) {
                    this.R = false;
                    return false;
                }
                this.U = true;
            }
            return false;
        } else {
            if (k0Var.Ff()) {
                this.P = (int) (motionEvent.getX(0) - this.N);
            }
            this.f24417c.mg(this.P);
            return false;
        }
    }

    public boolean g(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f24415a.onTouchEvent(motionEvent);
            return true;
        } else if (action == 1) {
            this.f24415a.onTouchEvent(motionEvent);
            return h(motionEvent);
        } else if (action != 2) {
            return this.f24415a.onTouchEvent(motionEvent);
        } else {
            this.f24415a.onTouchEvent(motionEvent);
            return f(motionEvent);
        }
    }

    public boolean h(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: ud.r1.h(android.view.MotionEvent):boolean");
    }

    public final void i(boolean z10) {
        if (this.W != z10) {
            this.W = z10;
            ((a) this.f24416b.E()).f3(z10);
        }
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        v4<?> F;
        boolean z10 = false;
        if (!this.f24416b.W() && !this.f24416b.S()) {
            this.N = motionEvent.getX(0);
            float y10 = motionEvent.getY(0);
            this.O = y10;
            if (y10 > 0.0f && (F = this.f24416b.F()) != null && !F.Va()) {
                k0 k0Var = this.f24417c;
                boolean z11 = (k0Var != null && k0Var.Ff()) || (!this.M && b(F, this.N, this.O));
                this.R = z11;
                if (z11 && F.Me()) {
                    z10 = true;
                }
                this.S = z10;
                return this.R;
            }
        }
        return false;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        if (!this.S) {
            f11 = f10;
        }
        float abs = Math.abs(f11);
        if (abs > a0.j(250.0f, 1.0f)) {
            this.V = true;
            if (this.T) {
                if ((f11 >= 0.0f || (w.G2() && !this.S)) && (f11 < 0.0f || !w.G2() || this.S)) {
                    this.f24416b.p(abs);
                } else {
                    this.f24416b.v(abs);
                }
            } else if (this.U && this.f24417c != null) {
                if ((f10 >= 0.0f || w.G2()) && (f10 < 0.0f || !w.G2())) {
                    this.f24417c.Zf(abs);
                } else {
                    this.f24417c.pf(abs, null);
                }
            }
            c(false);
        } else {
            this.V = false;
        }
        return this.V;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return this.T || this.U;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
