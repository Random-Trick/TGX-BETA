package sc;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import be.C1357a0;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;

public class GestureDetector$OnGestureListenerC8741d1 extends FrameLayoutFix implements GestureDetector.OnGestureListener {
    public AbstractC8809o<?> f28186M;
    public final float f28187N = C1357a0.m37537p();
    public final GestureDetector f28188O;
    public int f28189P;
    public int f28190Q;
    public float f28191R;
    public boolean f28192S;
    public boolean f28193T;
    public float f28194U;
    public boolean f28195V;
    public int f28196W;
    public boolean f28197a0;
    public float f28198b0;

    public GestureDetector$OnGestureListenerC8741d1(Context context) {
        super(context);
        this.f28188O = new GestureDetector(context, this);
    }

    private String getState() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f28192S) {
            sb2.append("shouldIntercept ");
        }
        if (this.f28193T) {
            sb2.append("intercepting ");
        }
        if (this.f28197a0) {
            sb2.append("scrolling ");
        }
        if (this.f28195V) {
            sb2.append("animating ");
        }
        return sb2.toString();
    }

    public final void m11614C1(MotionEvent motionEvent) {
        this.f28196W = this.f28186M.m11333Bf();
        this.f28198b0 = 0.0f;
        boolean z = false;
        this.f28197a0 = false;
        this.f28193T = false;
        this.f28195V = this.f28186M.m11325Kf();
        this.f28191R = motionEvent.getY();
        if (!this.f28195V && this.f28186M.mo11297ef() && this.f28186M.m11323Mf(motionEvent.getX(), motionEvent.getY())) {
            z = true;
        }
        this.f28192S = z;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (Math.abs(f2) > C1357a0.m37543j(250.0f, 1.0f)) {
            if (this.f28186M.m11330Ef(f2 < 0.0f)) {
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
                if (this.f28193T || this.f28195V) {
                    return true;
                }
                if (this.f28192S) {
                    float y = motionEvent.getY();
                    if (Math.abs(y - this.f28191R) >= this.f28187N && this.f28196W == 0) {
                        this.f28193T = true;
                        this.f28194U = y;
                        this.f28186M.m11299bg();
                        ((AbstractView$OnTouchListenerC7889a) getContext()).m14463m3(16, true);
                        return true;
                    }
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        m11614C1(motionEvent);
        return this.f28195V || super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.f28189P != measuredWidth || this.f28190Q != measuredHeight) {
            this.f28189P = measuredWidth;
            this.f28190Q = measuredHeight;
            this.f28186M.mo11214dg(measuredWidth, measuredHeight);
        }
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
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
        if (this.f28195V) {
            return true;
        }
        if (!this.f28193T) {
            return super.onTouchEvent(motionEvent);
        }
        this.f28188O.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2) {
                if (this.f28197a0) {
                    if (motionEvent.getY() <= this.f28198b0) {
                        this.f28186M.m11289jf(motionEvent);
                        return true;
                    }
                    this.f28186M.m11281nf();
                    this.f28197a0 = false;
                }
                if (this.f28186M.m11313Sf(motionEvent.getY() - this.f28194U) && !this.f28197a0) {
                    this.f28197a0 = true;
                    this.f28198b0 = motionEvent.getY();
                }
            }
            if (this.f28197a0) {
                this.f28186M.m11289jf(motionEvent);
            }
            return true;
        }
        this.f28193T = false;
        this.f28186M.m11289jf(motionEvent);
        this.f28186M.m11301ag();
        ((AbstractView$OnTouchListenerC7889a) getContext()).m14463m3(16, false);
        return true;
    }

    public void setBoundController(AbstractC8809o<?> oVar) {
        this.f28186M = oVar;
    }
}
