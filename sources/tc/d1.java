package tc;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import ce.a0;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.a;

public class d1 extends FrameLayoutFix implements GestureDetector.OnGestureListener {
    public o<?> M;
    public final float N = a0.p();
    public final GestureDetector O;
    public int P;
    public int Q;
    public float R;
    public boolean S;
    public boolean T;
    public float U;
    public boolean V;
    public int W;
    public boolean f23114a0;
    public float f23115b0;

    public d1(Context context) {
        super(context);
        this.O = new GestureDetector(context, this);
    }

    private String getState() {
        StringBuilder sb2 = new StringBuilder();
        if (this.S) {
            sb2.append("shouldIntercept ");
        }
        if (this.T) {
            sb2.append("intercepting ");
        }
        if (this.f23114a0) {
            sb2.append("scrolling ");
        }
        if (this.V) {
            sb2.append("animating ");
        }
        return sb2.toString();
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        if (Math.abs(f11) > a0.j(250.0f, 1.0f)) {
            if (this.M.Ef(f11 < 0.0f)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2) {
                if (this.T || this.V) {
                    return true;
                }
                if (this.S) {
                    float y10 = motionEvent.getY();
                    if (Math.abs(y10 - this.R) >= this.N && this.W == 0) {
                        this.T = true;
                        this.U = y10;
                        this.M.bg();
                        ((a) getContext()).n3(16, true);
                        return true;
                    }
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        z1(motionEvent);
        return this.V || super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.P != measuredWidth || this.Q != measuredHeight) {
            this.P = measuredWidth;
            this.Q = measuredHeight;
            this.M.dg(measuredWidth, measuredHeight);
        }
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.V) {
            return true;
        }
        if (!this.T) {
            return super.onTouchEvent(motionEvent);
        }
        this.O.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2) {
                if (this.f23114a0) {
                    if (motionEvent.getY() <= this.f23115b0) {
                        this.M.jf(motionEvent);
                        return true;
                    }
                    this.M.nf();
                    this.f23114a0 = false;
                }
                if (this.M.Sf(motionEvent.getY() - this.U) && !this.f23114a0) {
                    this.f23114a0 = true;
                    this.f23115b0 = motionEvent.getY();
                }
            }
            if (this.f23114a0) {
                this.M.jf(motionEvent);
            }
            return true;
        }
        this.T = false;
        this.M.jf(motionEvent);
        this.M.ag();
        ((a) getContext()).n3(16, false);
        return true;
    }

    public void setBoundController(o<?> oVar) {
        this.M = oVar;
    }

    public final void z1(MotionEvent motionEvent) {
        this.W = this.M.Bf();
        this.f23115b0 = 0.0f;
        boolean z10 = false;
        this.f23114a0 = false;
        this.T = false;
        this.V = this.M.Kf();
        this.R = motionEvent.getY();
        if (!this.V && this.M.ef() && this.M.Mf(motionEvent.getX(), motionEvent.getY())) {
            z10 = true;
        }
        this.S = z10;
    }
}
