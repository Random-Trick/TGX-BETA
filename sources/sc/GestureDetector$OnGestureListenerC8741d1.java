package sc;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import be.C1357a0;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;

public class GestureDetector$OnGestureListenerC8741d1 extends FrameLayoutFix implements GestureDetector.OnGestureListener {
    public AbstractC8809o<?> f28183M;
    public final float f28184N = C1357a0.m37534p();
    public final GestureDetector f28185O;
    public int f28186P;
    public int f28187Q;
    public float f28188R;
    public boolean f28189S;
    public boolean f28190T;
    public float f28191U;
    public boolean f28192V;
    public int f28193W;
    public boolean f28194a0;
    public float f28195b0;

    public GestureDetector$OnGestureListenerC8741d1(Context context) {
        super(context);
        this.f28185O = new GestureDetector(context, this);
    }

    private String getState() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f28189S) {
            sb2.append("shouldIntercept ");
        }
        if (this.f28190T) {
            sb2.append("intercepting ");
        }
        if (this.f28194a0) {
            sb2.append("scrolling ");
        }
        if (this.f28192V) {
            sb2.append("animating ");
        }
        return sb2.toString();
    }

    public final void m11615C1(MotionEvent motionEvent) {
        this.f28193W = this.f28183M.m11334Bf();
        this.f28195b0 = 0.0f;
        boolean z = false;
        this.f28194a0 = false;
        this.f28190T = false;
        this.f28192V = this.f28183M.m11326Kf();
        this.f28188R = motionEvent.getY();
        if (!this.f28192V && this.f28183M.mo11298ef() && this.f28183M.m11324Mf(motionEvent.getX(), motionEvent.getY())) {
            z = true;
        }
        this.f28189S = z;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (Math.abs(f2) > C1357a0.m37540j(250.0f, 1.0f)) {
            if (this.f28183M.m11331Ef(f2 < 0.0f)) {
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
                if (this.f28190T || this.f28192V) {
                    return true;
                }
                if (this.f28189S) {
                    float y = motionEvent.getY();
                    if (Math.abs(y - this.f28188R) >= this.f28184N && this.f28193W == 0) {
                        this.f28190T = true;
                        this.f28191U = y;
                        this.f28183M.m11300bg();
                        ((AbstractView$OnTouchListenerC7889a) getContext()).m14464m3(16, true);
                        return true;
                    }
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        m11615C1(motionEvent);
        return this.f28192V || super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.f28186P != measuredWidth || this.f28187Q != measuredHeight) {
            this.f28186P = measuredWidth;
            this.f28187Q = measuredHeight;
            this.f28183M.mo11215dg(measuredWidth, measuredHeight);
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
        if (this.f28192V) {
            return true;
        }
        if (!this.f28190T) {
            return super.onTouchEvent(motionEvent);
        }
        this.f28185O.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2) {
                if (this.f28194a0) {
                    if (motionEvent.getY() <= this.f28195b0) {
                        this.f28183M.m11290jf(motionEvent);
                        return true;
                    }
                    this.f28183M.m11282nf();
                    this.f28194a0 = false;
                }
                if (this.f28183M.m11314Sf(motionEvent.getY() - this.f28191U) && !this.f28194a0) {
                    this.f28194a0 = true;
                    this.f28195b0 = motionEvent.getY();
                }
            }
            if (this.f28194a0) {
                this.f28183M.m11290jf(motionEvent);
            }
            return true;
        }
        this.f28190T = false;
        this.f28183M.m11290jf(motionEvent);
        this.f28183M.m11302ag();
        ((AbstractView$OnTouchListenerC7889a) getContext()).m14464m3(16, false);
        return true;
    }

    public void setBoundController(AbstractC8809o<?> oVar) {
        this.f28183M = oVar;
    }
}
