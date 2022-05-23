package dd;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.j0;
import db.g;
import eb.k;
import ld.h;
import ld.p;
import md.m;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import zd.o6;

public class j extends View implements k.b, kb.c {
    public static final Interpolator f7383j0 = new OvershootInterpolator(3.2f);
    public l M;
    public Path N;
    public o6 O;
    public boolean P;
    public float Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public float U;
    public float V;
    public kb.b W;
    public boolean f7385a0;
    public c f7387b0;
    public kb.b f7389c0;
    public l f7390d0;
    public boolean f7391e0;
    public boolean f7392f0;
    public boolean f7393g0;
    public boolean f7394h0;
    public boolean f7395i0;
    public final p f7384a = new p(this, 0);
    public final m f7386b = new m(this);
    public final k f7388c = new k(0, this, f7383j0, 230);

    public class a extends kb.b {
        public a() {
        }

        @Override
        public void b() {
            j.this.m();
            j.this.f7385a0 = false;
        }
    }

    public class b extends kb.b {
        public final j M;
        public final l N;

        public b(j jVar, l lVar) {
            this.M = jVar;
            this.N = lVar;
        }

        @Override
        public void b() {
            j.this.o(this.M, this.N);
        }
    }

    public interface c {
        void E5(j jVar, l lVar, boolean z10);

        void J1(j jVar, l lVar);

        boolean Q1(j jVar);

        boolean W2(j jVar, View view, l lVar, boolean z10, boolean z11, TdApi.MessageSchedulingState messageSchedulingState);

        boolean g4(j jVar, int i10, int i11);

        long getStickerOutputChatId();

        int getStickersListTop();

        int getViewportHeight();

        void j5(j jVar, l lVar);

        void w2(j jVar, l lVar);
    }

    public j(Context context) {
        super(context);
    }

    @Override
    public void Q2() {
        this.f7384a.b0();
        this.f7386b.b0();
    }

    public void d() {
        this.f7384a.e();
        this.f7386b.e();
    }

    public final void e() {
        kb.b bVar = this.W;
        if (bVar != null) {
            bVar.c();
            this.W = null;
        }
        this.f7385a0 = false;
    }

    public final void f() {
        kb.b bVar = this.f7389c0;
        if (bVar != null) {
            bVar.c();
            this.f7389c0 = null;
        }
    }

    public final void g(MotionEvent motionEvent) {
        l lVar;
        if (motionEvent != null && this.f7392f0) {
            q(motionEvent);
            this.f7392f0 = false;
        }
        if (this.f7391e0) {
            this.f7395i0 = true;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
                return;
            }
            return;
        }
        e();
        if (this.f7393g0) {
            if (!this.f7395i0 && getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            j0.r(getContext()).n3(8, false);
            this.f7393g0 = false;
            this.f7391e0 = false;
            setStickerPressed(false);
            if (this.f7387b0 != null) {
                l lVar2 = this.f7390d0;
                if (!(lVar2 == null || (lVar = this.M) == null || lVar.equals(lVar2))) {
                    this.f7387b0.E5(this, this.f7390d0, false);
                }
                this.f7387b0.w2(this, this.M);
            }
            f();
            ((org.thunderdog.challegram.a) getContext()).y0();
        }
    }

    public l getSticker() {
        return this.M;
    }

    public long getStickerOutputChatId() {
        c cVar = this.f7387b0;
        if (cVar != null) {
            return cVar.getStickerOutputChatId();
        }
        return 0L;
    }

    public void h() {
        if (this.f7391e0) {
            this.f7391e0 = false;
            g(null);
        }
    }

    public void i() {
        this.f7384a.b();
        this.f7386b.b();
    }

    public void j(o6 o6Var) {
        this.O = o6Var;
    }

    public final void k(MotionEvent motionEvent, int i10, int i11) {
        l sticker;
        boolean z10;
        if (!this.f7395i0 && getParent() != null) {
            c cVar = this.f7387b0;
            View X = (cVar == null || cVar.g4(this, i10, i11)) ? ((RecyclerView) getParent()).X(i10, i11) : null;
            if ((X instanceof j) && (sticker = ((j) X).getSticker()) != null && !sticker.n() && !sticker.equals(this.f7390d0)) {
                this.f7391e0 = false;
                c cVar2 = this.f7387b0;
                if (cVar2 != null) {
                    cVar2.E5(this, this.f7390d0, false);
                }
                this.f7390d0 = sticker;
                org.thunderdog.challegram.a aVar = (org.thunderdog.challegram.a) getContext();
                int left = X.getLeft() + (X.getMeasuredWidth() / 2);
                int top = X.getTop() + X.getPaddingTop() + (((X.getMeasuredHeight() - X.getPaddingBottom()) - X.getPaddingTop()) / 2);
                c cVar3 = this.f7387b0;
                aVar.F2(sticker, left, top + (cVar3 != null ? cVar3.getStickersListTop() : 0));
                c cVar4 = this.f7387b0;
                if (cVar4 != null) {
                    cVar4.j5(this, sticker);
                    this.f7387b0.E5(this, sticker, true);
                    z10 = this.f7387b0.Q1(this);
                } else {
                    z10 = false;
                }
                t(this, sticker, z10, true);
                j0.k(this, false);
            }
        }
    }

    public boolean l(View view, l lVar, boolean z10, TdApi.MessageSchedulingState messageSchedulingState) {
        c cVar = this.f7387b0;
        return cVar != null && cVar.W2(this, view, lVar, true, z10, messageSchedulingState);
    }

    public final void m() {
        l lVar;
        boolean z10;
        if (!this.f7393g0 && (lVar = this.M) != null && !lVar.n()) {
            getParent().requestDisallowInterceptTouchEvent(true);
            j0.r(getContext()).n3(8, true);
            this.f7393g0 = true;
            this.f7391e0 = false;
            this.f7392f0 = false;
            this.f7395i0 = false;
            setStickerPressed(true);
            l lVar2 = this.M;
            this.f7390d0 = lVar2;
            c cVar = this.f7387b0;
            if (cVar != null) {
                cVar.J1(this, lVar2);
                z10 = this.f7387b0.Q1(this);
            } else {
                z10 = false;
            }
            t(this, this.M, z10, false);
            j0.k(this, true);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = (getMeasuredHeight() - getPaddingBottom()) - getPaddingTop();
            int left = getLeft();
            int top = getTop() + getPaddingTop();
            org.thunderdog.challegram.a aVar = (org.thunderdog.challegram.a) getContext();
            o6 o6Var = this.O;
            l lVar3 = this.M;
            int i10 = left + (measuredWidth / 2);
            int i11 = top + (measuredHeight / 2);
            c cVar2 = this.f7387b0;
            aVar.h2(o6Var, this, lVar3, i10, i11 + (cVar2 != null ? cVar2.getStickersListTop() : 0), Math.min(measuredWidth, measuredHeight) - (a0.i(8.0f) * 2), this.f7387b0.getViewportHeight(), this.S || this.T);
        }
    }

    public final void n() {
        e();
        a aVar = new a();
        this.W = aVar;
        this.f7385a0 = true;
        postDelayed(aVar, 300L);
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (this.Q != f10) {
            this.Q = f10;
            invalidate();
        }
    }

    public final void o(j jVar, l lVar) {
        j0.k(jVar, false);
        jVar.p();
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }

    @Override
    public void onDraw(Canvas canvas) {
        boolean z10 = this.Q != 0.0f;
        if (z10) {
            canvas.save();
            float f10 = ((1.0f - this.Q) * 0.18f) + 0.82f;
            canvas.scale(f10, f10, getMeasuredWidth() / 2, getPaddingTop() + (((getMeasuredHeight() - getPaddingBottom()) - getPaddingBottom()) / 2));
        }
        if (this.P) {
            if (this.f7386b.e0()) {
                if (this.f7384a.e0()) {
                    this.f7384a.P(canvas, this.N);
                }
                this.f7384a.draw(canvas);
            }
            this.f7386b.draw(canvas);
        } else {
            if (this.f7384a.e0()) {
                this.f7384a.P(canvas, this.N);
            }
            this.f7384a.draw(canvas);
        }
        if (z10) {
            canvas.restore();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        if (this.S) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(a0.i(72.0f), Log.TAG_TDLIB_OPTIONS), i11);
        } else if (this.R) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(a0.B() / 5, Log.TAG_TDLIB_OPTIONS));
        } else {
            super.onMeasure(i10, i10);
        }
        int i12 = a0.i(8.0f);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i13 = measuredWidth - i12;
        this.f7384a.K0(i12, getPaddingTop() + i12, i13, (measuredHeight - getPaddingBottom()) - i12);
        this.f7386b.K0(i12, getPaddingTop() + i12, i13, (measuredHeight - getPaddingBottom()) - i12);
        l lVar = this.M;
        this.N = lVar != null ? lVar.b(Math.min(this.f7384a.getWidth(), this.f7384a.getHeight())) : null;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.U = motionEvent.getX();
            this.V = motionEvent.getY();
            n();
            return true;
        } else if (action != 1) {
            if (action != 2) {
                if (action == 3) {
                    g(motionEvent);
                    return true;
                }
            } else if (this.f7393g0) {
                k(motionEvent, getLeft() + ((int) motionEvent.getX()), getTop() + ((int) motionEvent.getY()));
            } else if (this.f7385a0 && Math.max(Math.abs(this.U - motionEvent.getX()), Math.abs(this.V - motionEvent.getY())) > a0.p()) {
                e();
            }
            return true;
        } else {
            boolean z10 = this.f7385a0 && !this.f7393g0;
            g(motionEvent);
            if (!(!z10 || this.f7387b0 == null || this.M == null)) {
                g.c(this);
                this.f7387b0.W2(this, this, this.M, false, false, null);
            }
            return true;
        }
    }

    public void p() {
        this.f7391e0 = true;
        ((org.thunderdog.challegram.a) getContext()).g2(this, this.f7390d0);
    }

    public final void q(MotionEvent motionEvent) {
        int top = getTop();
        c cVar = this.f7387b0;
        if (cVar != null) {
            top += cVar.getStickersListTop();
        }
        motionEvent.offsetLocation(getLeft(), top);
        ((org.thunderdog.challegram.a) getContext()).F0(motionEvent);
    }

    public void r() {
        setSticker(this.M);
    }

    public final void s() {
        this.f7388c.m(0.0f, true);
        this.Q = 0.0f;
    }

    public void setSticker(l lVar) {
        this.M = lVar;
        this.P = lVar != null && lVar.m();
        s();
        Path path = null;
        h h10 = (lVar == null || lVar.n()) ? null : lVar.h();
        md.j i10 = (lVar == null || lVar.n()) ? null : lVar.i();
        if ((lVar == null || lVar.n()) && h10 != null) {
            throw new RuntimeException("");
        }
        if (lVar != null) {
            path = lVar.b(Math.min(this.f7384a.getWidth(), this.f7384a.getHeight()));
        }
        this.N = path;
        this.f7384a.G(h10);
        this.f7386b.r(i10);
    }

    public void setStickerMovementCallback(c cVar) {
        this.f7387b0 = cVar;
    }

    public void setStickerPressed(boolean z10) {
        if (this.f7394h0 != z10) {
            this.f7394h0 = z10;
            this.f7388c.i(z10 ? 1.0f : 0.0f);
        }
    }

    public boolean t(j jVar, l lVar, boolean z10, boolean z11) {
        f();
        if (z10 && z11) {
            return false;
        }
        b bVar = new b(jVar, lVar);
        this.f7389c0 = bVar;
        bVar.e(j0.o());
        j0.e0(this.f7389c0, z11 ? 1500L : 1000L);
        return true;
    }

    public void u() {
        this.T = true;
    }

    public void v() {
        this.S = true;
    }

    public void w() {
        this.R = true;
    }
}
