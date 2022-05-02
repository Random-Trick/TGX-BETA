package ad;

import ad.RunnableC0266h;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import be.C1357a0;
import be.C1379j0;
import be.C1389o;
import be.C1399s0;
import com.google.android.youtube.player.AbstractC3514b;
import me.vkryl.android.widget.FrameLayoutFix;
import nc.C7389v0;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p156kd.C6246h;
import p156kd.C6257p;

public class C0277p extends FrameLayoutFix implements RunnableC0266h.AbstractC0267a {
    public int f870M;
    public int f871N;
    public RunnableC0266h f872O;
    public FragmentC0265g f873P;
    public C0274o f874Q;
    public int f875R;
    public String f876S;
    public C6246h f878U;
    public Paint f880W;
    public Paint f881a0;
    public View f882b0;
    public boolean f883c0;
    public C0281s f884d0;
    public C6246h f885e0;
    public C6257p f877T = new C6257p(this, 0);
    public int f879V = C1357a0.m37541i(10.0f);

    public class C0278a extends AnimatorListenerAdapter {
        public C0278a() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            C6257p pVar = C0277p.this.f877T;
            C0277p.this.f885e0 = null;
            pVar.m20819G(null);
        }
    }

    public C0277p(Context context) {
        super(context);
        setId(R.id.youtube_container);
        setClipChildren(false);
        Paint paint = new Paint(5);
        this.f880W = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f880W.setColor(-16777216);
        Paint paint2 = new Paint(5);
        this.f881a0 = paint2;
        paint2.setColor(-1);
        this.f881a0.setTypeface(C1389o.m37258k());
        this.f881a0.setTextSize(C1357a0.m37541i(15.0f));
        setClipChildren(false);
        setWillNotDraw(false);
    }

    private void setError(String str) {
        if (this.f873P != null) {
            ((AbstractView$OnTouchListenerC7889a) getContext()).getFragmentManager().beginTransaction().remove(this.f873P).commit();
            this.f873P = null;
        }
        this.f875R = str == null ? 0 : (int) C7389v0.m16680T1(str, this.f881a0);
        this.f876S = str;
        postInvalidate();
    }

    public void m41926E1() {
        C6257p pVar = this.f877T;
        this.f885e0 = null;
        pVar.m20819G(null);
        View view = this.f882b0;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public boolean m41925F1() {
        return this.f883c0;
    }

    public void m41924G1(String str) {
        if (this.f872O == null) {
            this.f872O = new RunnableC0266h(str, this.f874Q, this);
        }
        this.f873P = FragmentC0265g.m41965f(this.f872O);
        ((AbstractView$OnTouchListenerC7889a) getContext()).getFragmentManager().beginTransaction().add(R.id.youtube_container, this.f873P).commit();
    }

    public void m41923I1() {
        C6257p pVar = this.f877T;
        this.f885e0 = null;
        pVar.m20819G(null);
    }

    public void m41922J1() {
        FragmentC0265g gVar = this.f873P;
        if (gVar != null) {
            gVar.m41968c();
            this.f873P = null;
        }
    }

    public void m41921L1(int i) {
        FragmentC0265g gVar = this.f873P;
        if (gVar != null && gVar.m41967d() != null) {
            this.f873P.m41967d().mo5938k(i);
        }
    }

    public void m41920M1(int i, int i2) {
        this.f870M = i;
        this.f871N = i2;
    }

    public void m41919N1() {
        View view = this.f882b0;
        if (view != null) {
            view.setVisibility(4);
            C6257p pVar = this.f877T;
            C6246h hVar = this.f878U;
            this.f885e0 = hVar;
            pVar.m20819G(hVar);
        }
    }

    @Override
    public void mo41918Q0() {
        this.f883c0 = true;
        View view = this.f882b0;
        if (view != null) {
            if (C0281s.f891m0) {
                C1379j0.m37324i0(view);
            }
            C0264f.m41969f(this.f882b0);
            this.f874Q.setAlpha(0.0f);
            this.f882b0.setAlpha(0.0f);
            C0274o oVar = this.f874Q;
            DecelerateInterpolator decelerateInterpolator = C2057b.f7280b;
            C1399s0.m37174k(oVar, 1.0f, 200L, decelerateInterpolator, null);
            C1399s0.m37174k(this.f882b0, 1.0f, 200L, decelerateInterpolator, new C0278a());
            return;
        }
        C6257p pVar = this.f877T;
        this.f885e0 = null;
        pVar.m20819G(null);
    }

    @Override
    public void mo41917V() {
        this.f884d0.mo41912G1(true);
    }

    @Override
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, 0, layoutParams);
        if (!this.f883c0 && this.f882b0 == null && getChildCount() == 2) {
            view.setAlpha(0.0f);
            this.f874Q.setAlpha(0.0f);
            this.f882b0 = view;
        }
    }

    public int getCurrentWidth() {
        return this.f870M;
    }

    public AbstractC3514b getPlayer() {
        FragmentC0265g gVar = this.f873P;
        if (gVar == null) {
            return null;
        }
        return gVar.m41967d();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f877T.mo20245f();
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f877T.mo20247b();
    }

    @Override
    public void onDraw(Canvas canvas) {
        FragmentC0265g gVar;
        View view;
        C0274o oVar;
        if (this.f885e0 != null || (gVar = this.f873P) == null || gVar.m41966e() || !(((view = this.f882b0) == null || view.getAlpha() == 1.0f) && ((oVar = this.f874Q) == null || oVar.getAlpha() == 1.0f))) {
            canvas.drawRect(0.0f, 0.0f, this.f870M, this.f871N, this.f880W);
            this.f877T.draw(canvas);
        }
        if (this.f876S != null) {
            this.f880W.setAlpha(153);
            canvas.drawRect(0.0f, 0.0f, this.f870M, this.f871N, this.f880W);
            this.f880W.setAlpha(255);
            canvas.drawText(this.f876S, (int) ((this.f870M * 0.5f) - (this.f875R * 0.5f)), (int) ((this.f871N * 0.5f) + this.f879V), this.f881a0);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f870M, Log.TAG_TDLIB_OPTIONS), View.MeasureSpec.makeMeasureSpec(this.f871N, Log.TAG_TDLIB_OPTIONS));
        this.f877T.mo20256K0(0, 0, this.f870M, this.f871N);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        C0274o oVar = this.f874Q;
        return oVar != null && oVar.m41929z(motionEvent);
    }

    public void setControls(C0274o oVar) {
        this.f874Q = oVar;
    }

    public void setParentLayout(C0281s sVar) {
        this.f884d0 = sVar;
    }

    public void setPreview(C6246h hVar) {
        this.f878U = hVar;
        C6257p pVar = this.f877T;
        this.f885e0 = hVar;
        pVar.m20819G(hVar);
    }

    @Override
    public void mo41916w0(String str) {
        setError(str);
    }
}
