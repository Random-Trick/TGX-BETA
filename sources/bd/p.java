package bd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import bd.h;
import ce.a0;
import ce.j0;
import ce.o;
import ce.p0;
import db.b;
import me.vkryl.android.widget.FrameLayoutFix;
import oc.v0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;

public class p extends FrameLayoutFix implements h.a {
    public int M;
    public int N;
    public h O;
    public g P;
    public o Q;
    public int R;
    public String S;
    public ld.h U;
    public Paint W;
    public Paint f4166a0;
    public View f4167b0;
    public boolean f4168c0;
    public s f4169d0;
    public ld.h f4170e0;
    public ld.p T = new ld.p(this, 0);
    public int V = a0.i(10.0f);

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            ld.p pVar = p.this.T;
            p.this.f4170e0 = null;
            pVar.G(null);
        }
    }

    public p(Context context) {
        super(context);
        setId(R.id.youtube_container);
        setClipChildren(false);
        Paint paint = new Paint(5);
        this.W = paint;
        paint.setStyle(Paint.Style.FILL);
        this.W.setColor(-16777216);
        Paint paint2 = new Paint(5);
        this.f4166a0 = paint2;
        paint2.setColor(-1);
        this.f4166a0.setTypeface(o.k());
        this.f4166a0.setTextSize(a0.i(15.0f));
        setClipChildren(false);
        setWillNotDraw(false);
    }

    private void setError(String str) {
        if (this.P != null) {
            ((org.thunderdog.challegram.a) getContext()).getFragmentManager().beginTransaction().remove(this.P).commit();
            this.P = null;
        }
        this.R = str == null ? 0 : (int) v0.T1(str, this.f4166a0);
        this.S = str;
        postInvalidate();
    }

    public void B1() {
        ld.p pVar = this.T;
        this.f4170e0 = null;
        pVar.G(null);
        View view = this.f4167b0;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public boolean C1() {
        return this.f4168c0;
    }

    public void D1(String str) {
        if (this.O == null) {
            this.O = new h(str, this.Q, this);
        }
        this.P = g.f(this.O);
        ((org.thunderdog.challegram.a) getContext()).getFragmentManager().beginTransaction().add(R.id.youtube_container, this.P).commit();
    }

    public void E1() {
        ld.p pVar = this.T;
        this.f4170e0 = null;
        pVar.G(null);
    }

    public void G1() {
        g gVar = this.P;
        if (gVar != null) {
            gVar.c();
            this.P = null;
        }
    }

    public void H1(int i10) {
        g gVar = this.P;
        if (gVar != null && gVar.d() != null) {
            this.P.d().k(i10);
        }
    }

    public void I1(int i10, int i11) {
        this.M = i10;
        this.N = i11;
    }

    public void K1() {
        View view = this.f4167b0;
        if (view != null) {
            view.setVisibility(4);
            ld.p pVar = this.T;
            ld.h hVar = this.U;
            this.f4170e0 = hVar;
            pVar.G(hVar);
        }
    }

    @Override
    public void P0() {
        this.f4168c0 = true;
        View view = this.f4167b0;
        if (view != null) {
            if (s.f4176m0) {
                j0.i0(view);
            }
            f.f(this.f4167b0);
            this.Q.setAlpha(0.0f);
            this.f4167b0.setAlpha(0.0f);
            o oVar = this.Q;
            DecelerateInterpolator decelerateInterpolator = b.f7287b;
            p0.h(oVar, 1.0f, 200L, decelerateInterpolator, null);
            p0.h(this.f4167b0, 1.0f, 200L, decelerateInterpolator, new a());
            return;
        }
        ld.p pVar = this.T;
        this.f4170e0 = null;
        pVar.G(null);
    }

    @Override
    public void W() {
        this.f4169d0.D1(true);
    }

    @Override
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, 0, layoutParams);
        if (!this.f4168c0 && this.f4167b0 == null && getChildCount() == 2) {
            view.setAlpha(0.0f);
            this.Q.setAlpha(0.0f);
            this.f4167b0 = view;
        }
    }

    public int getCurrentWidth() {
        return this.M;
    }

    public com.google.android.youtube.player.b getPlayer() {
        g gVar = this.P;
        if (gVar == null) {
            return null;
        }
        return gVar.d();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T.e();
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.T.b();
    }

    @Override
    public void onDraw(Canvas canvas) {
        g gVar;
        View view;
        o oVar;
        if (this.f4170e0 != null || (gVar = this.P) == null || gVar.e() || !(((view = this.f4167b0) == null || view.getAlpha() == 1.0f) && ((oVar = this.Q) == null || oVar.getAlpha() == 1.0f))) {
            canvas.drawRect(0.0f, 0.0f, this.M, this.N, this.W);
            this.T.draw(canvas);
        }
        if (this.S != null) {
            this.W.setAlpha(153);
            canvas.drawRect(0.0f, 0.0f, this.M, this.N, this.W);
            this.W.setAlpha(255);
            canvas.drawText(this.S, (int) ((this.M * 0.5f) - (this.R * 0.5f)), (int) ((this.N * 0.5f) + this.V), this.f4166a0);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.M, Log.TAG_TDLIB_OPTIONS), View.MeasureSpec.makeMeasureSpec(this.N, Log.TAG_TDLIB_OPTIONS));
        this.T.K0(0, 0, this.M, this.N);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        o oVar = this.Q;
        return oVar != null && oVar.z(motionEvent);
    }

    public void setControls(o oVar) {
        this.Q = oVar;
    }

    public void setParentLayout(s sVar) {
        this.f4169d0 = sVar;
    }

    public void setPreview(ld.h hVar) {
        this.U = hVar;
        ld.p pVar = this.T;
        this.f4170e0 = hVar;
        pVar.G(hVar);
    }

    @Override
    public void v0(String str) {
        setError(str);
    }
}
