package cd;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1379j0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import p037cb.C2065g;
import p051db.C3950k;
import p139jb.AbstractC5911c;
import p139jb.AbstractRunnableC5910b;
import p156kd.C6246h;
import p156kd.C6257p;
import p168ld.C6503j;
import p168ld.RunnableC6507m;
import p350yd.C10930q6;

public class C2099j extends View implements C3950k.AbstractC3952b, AbstractC5911c {
    public static final Interpolator f7403j0 = new OvershootInterpolator(3.2f);
    public C2104l f7404M;
    public Path f7405N;
    public C10930q6 f7406O;
    public boolean f7407P;
    public float f7408Q;
    public boolean f7409R;
    public boolean f7410S;
    public boolean f7411T;
    public float f7412U;
    public float f7413V;
    public AbstractRunnableC5910b f7414W;
    public boolean f7416a0;
    public AbstractC2102c f7418b0;
    public AbstractRunnableC5910b f7420c0;
    public C2104l f7421d0;
    public boolean f7422e0;
    public boolean f7423f0;
    public boolean f7424g0;
    public boolean f7425h0;
    public boolean f7426i0;
    public final C6257p f7415a = new C6257p(this, 0);
    public final RunnableC6507m f7417b = new RunnableC6507m(this);
    public final C3950k f7419c = new C3950k(0, this, f7403j0, 230);

    public class C2100a extends AbstractRunnableC5910b {
        public C2100a() {
        }

        @Override
        public void mo1364b() {
            C2099j.this.m35602m();
            C2099j.this.f7416a0 = false;
        }
    }

    public class C2101b extends AbstractRunnableC5910b {
        public final C2099j f7428M;
        public final C2104l f7429N;

        public C2101b(C2099j jVar, C2104l lVar) {
            this.f7428M = jVar;
            this.f7429N = lVar;
        }

        @Override
        public void mo1364b() {
            C2099j.this.m35600o(this.f7428M, this.f7429N);
        }
    }

    public interface AbstractC2102c {
        void mo7577A4(C2099j jVar, C2104l lVar);

        void mo7576B1(C2099j jVar, C2104l lVar, boolean z);

        void mo7568H1(C2099j jVar, C2104l lVar);

        void mo7556U6(C2099j jVar, C2104l lVar);

        boolean mo7547e1(C2099j jVar, int i, int i2);

        long getStickerOutputChatId();

        int getStickersListTop();

        int getViewportHeight();

        boolean mo7542k4(C2099j jVar, View view, C2104l lVar, boolean z, boolean z2, TdApi.MessageSchedulingState messageSchedulingState);

        boolean mo7534v0(C2099j jVar);
    }

    public C2099j(Context context) {
        super(context);
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (this.f7408Q != f) {
            this.f7408Q = f;
            invalidate();
        }
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    @Override
    public void mo4501a3() {
        this.f7415a.mo20250Z();
        this.f7417b.mo20250Z();
    }

    public void m35611d() {
        this.f7415a.mo20246f();
        this.f7417b.mo20246f();
    }

    public final void m35610e() {
        AbstractRunnableC5910b bVar = this.f7414W;
        if (bVar != null) {
            bVar.m21858c();
            this.f7414W = null;
        }
        this.f7416a0 = false;
    }

    public final void m35609f() {
        AbstractRunnableC5910b bVar = this.f7420c0;
        if (bVar != null) {
            bVar.m21858c();
            this.f7420c0 = null;
        }
    }

    public final void m35608g(MotionEvent motionEvent) {
        C2104l lVar;
        if (motionEvent != null && this.f7423f0) {
            m35598q(motionEvent);
            this.f7423f0 = false;
        }
        if (this.f7422e0) {
            this.f7426i0 = true;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
                return;
            }
            return;
        }
        m35610e();
        if (this.f7424g0) {
            if (!this.f7426i0 && getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            C1379j0.m37310r(getContext()).m14463m3(8, false);
            this.f7424g0 = false;
            this.f7422e0 = false;
            setStickerPressed(false);
            if (this.f7418b0 != null) {
                C2104l lVar2 = this.f7421d0;
                if (!(lVar2 == null || (lVar = this.f7404M) == null || lVar.equals(lVar2))) {
                    this.f7418b0.mo7576B1(this, this.f7421d0, false);
                }
                this.f7418b0.mo7556U6(this, this.f7404M);
            }
            m35609f();
            ((AbstractView$OnTouchListenerC7889a) getContext()).m14429v0();
        }
    }

    public C2104l getSticker() {
        return this.f7404M;
    }

    public long getStickerOutputChatId() {
        AbstractC2102c cVar = this.f7418b0;
        if (cVar != null) {
            return cVar.getStickerOutputChatId();
        }
        return 0L;
    }

    public void m35607h() {
        if (this.f7422e0) {
            this.f7422e0 = false;
            m35608g(null);
        }
    }

    public void m35606i() {
        this.f7415a.mo20248b();
        this.f7417b.mo20248b();
    }

    public void m35605j(C10930q6 q6Var) {
        this.f7406O = q6Var;
    }

    public final void m35604k(MotionEvent motionEvent, int i, int i2) {
        C2104l sticker;
        boolean z;
        if (!this.f7426i0 && getParent() != null) {
            AbstractC2102c cVar = this.f7418b0;
            View X = (cVar == null || cVar.mo7547e1(this, i, i2)) ? ((RecyclerView) getParent()).m39460X(i, i2) : null;
            if ((X instanceof C2099j) && (sticker = ((C2099j) X).getSticker()) != null && !sticker.m35573n() && !sticker.equals(this.f7421d0)) {
                this.f7422e0 = false;
                AbstractC2102c cVar2 = this.f7418b0;
                if (cVar2 != null) {
                    cVar2.mo7576B1(this, this.f7421d0, false);
                }
                this.f7421d0 = sticker;
                AbstractView$OnTouchListenerC7889a aVar = (AbstractView$OnTouchListenerC7889a) getContext();
                int left = X.getLeft() + (X.getMeasuredWidth() / 2);
                int top = X.getTop() + X.getPaddingTop() + (((X.getMeasuredHeight() - X.getPaddingBottom()) - X.getPaddingTop()) / 2);
                AbstractC2102c cVar3 = this.f7418b0;
                aVar.m14604D2(sticker, left, top + (cVar3 != null ? cVar3.getStickersListTop() : 0));
                AbstractC2102c cVar4 = this.f7418b0;
                if (cVar4 != null) {
                    cVar4.mo7568H1(this, sticker);
                    this.f7418b0.mo7576B1(this, sticker, true);
                    z = this.f7418b0.mo7534v0(this);
                } else {
                    z = false;
                }
                m35595t(this, sticker, z, true);
                C1379j0.m37324k(this, false);
            }
        }
    }

    public boolean m35603l(View view, C2104l lVar, boolean z, TdApi.MessageSchedulingState messageSchedulingState) {
        AbstractC2102c cVar = this.f7418b0;
        return cVar != null && cVar.mo7542k4(this, view, lVar, true, z, messageSchedulingState);
    }

    public final void m35602m() {
        C2104l lVar;
        boolean z;
        if (!this.f7424g0 && (lVar = this.f7404M) != null && !lVar.m35573n()) {
            getParent().requestDisallowInterceptTouchEvent(true);
            C1379j0.m37310r(getContext()).m14463m3(8, true);
            this.f7424g0 = true;
            this.f7422e0 = false;
            this.f7423f0 = false;
            this.f7426i0 = false;
            setStickerPressed(true);
            C2104l lVar2 = this.f7404M;
            this.f7421d0 = lVar2;
            AbstractC2102c cVar = this.f7418b0;
            if (cVar != null) {
                cVar.mo7577A4(this, lVar2);
                z = this.f7418b0.mo7534v0(this);
            } else {
                z = false;
            }
            m35595t(this, this.f7404M, z, false);
            C1379j0.m37324k(this, true);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = (getMeasuredHeight() - getPaddingBottom()) - getPaddingTop();
            int left = getLeft();
            int top = getTop() + getPaddingTop();
            AbstractView$OnTouchListenerC7889a aVar = (AbstractView$OnTouchListenerC7889a) getContext();
            C10930q6 q6Var = this.f7406O;
            C2104l lVar3 = this.f7404M;
            int i = left + (measuredWidth / 2);
            int i2 = top + (measuredHeight / 2);
            AbstractC2102c cVar2 = this.f7418b0;
            aVar.m14492f2(q6Var, this, lVar3, i, i2 + (cVar2 != null ? cVar2.getStickersListTop() : 0), Math.min(measuredWidth, measuredHeight) - (C1357a0.m37544i(8.0f) * 2), this.f7418b0.getViewportHeight(), this.f7410S || this.f7411T);
        }
    }

    public final void m35601n() {
        m35610e();
        C2100a aVar = new C2100a();
        this.f7414W = aVar;
        this.f7416a0 = true;
        postDelayed(aVar, 300L);
    }

    public final void m35600o(C2099j jVar, C2104l lVar) {
        C1379j0.m37324k(jVar, false);
        jVar.m35599p();
    }

    @Override
    public void onDraw(Canvas canvas) {
        boolean z = this.f7408Q != 0.0f;
        if (z) {
            canvas.save();
            float f = ((1.0f - this.f7408Q) * 0.18f) + 0.82f;
            canvas.scale(f, f, getMeasuredWidth() / 2, getPaddingTop() + (((getMeasuredHeight() - getPaddingBottom()) - getPaddingBottom()) / 2));
        }
        if (this.f7407P) {
            if (this.f7417b.mo20247c0()) {
                if (this.f7415a.mo20247c0()) {
                    this.f7415a.mo20255O(canvas, this.f7405N);
                }
                this.f7415a.draw(canvas);
            }
            this.f7417b.draw(canvas);
        } else {
            if (this.f7415a.mo20247c0()) {
                this.f7415a.mo20255O(canvas, this.f7405N);
            }
            this.f7415a.draw(canvas);
        }
        if (z) {
            canvas.restore();
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        if (this.f7410S) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(C1357a0.m37544i(72.0f), Log.TAG_TDLIB_OPTIONS), i2);
        } else if (this.f7409R) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(C1357a0.m37556B() / 5, Log.TAG_TDLIB_OPTIONS));
        } else {
            super.onMeasure(i, i);
        }
        int i3 = C1357a0.m37544i(8.0f);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i4 = measuredWidth - i3;
        this.f7415a.mo20257K0(i3, getPaddingTop() + i3, i4, (measuredHeight - getPaddingBottom()) - i3);
        this.f7417b.mo20257K0(i3, getPaddingTop() + i3, i4, (measuredHeight - getPaddingBottom()) - i3);
        C2104l lVar = this.f7404M;
        this.f7405N = lVar != null ? lVar.m35585b(Math.min(this.f7415a.getWidth(), this.f7415a.getHeight())) : null;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f7412U = motionEvent.getX();
            this.f7413V = motionEvent.getY();
            m35601n();
            return true;
        } else if (action != 1) {
            if (action != 2) {
                if (action == 3) {
                    m35608g(motionEvent);
                    return true;
                }
            } else if (this.f7424g0) {
                m35604k(motionEvent, getLeft() + ((int) motionEvent.getX()), getTop() + ((int) motionEvent.getY()));
            } else if (this.f7416a0 && Math.max(Math.abs(this.f7412U - motionEvent.getX()), Math.abs(this.f7413V - motionEvent.getY())) > C1357a0.m37537p()) {
                m35610e();
            }
            return true;
        } else {
            boolean z = this.f7416a0 && !this.f7424g0;
            m35608g(motionEvent);
            if (!(!z || this.f7418b0 == null || this.f7404M == null)) {
                C2065g.m35722c(this);
                this.f7418b0.mo7542k4(this, this, this.f7404M, false, false, null);
            }
            return true;
        }
    }

    public void m35599p() {
        this.f7422e0 = true;
        ((AbstractView$OnTouchListenerC7889a) getContext()).m14496e2(this, this.f7421d0);
    }

    public final void m35598q(MotionEvent motionEvent) {
        int top = getTop();
        AbstractC2102c cVar = this.f7418b0;
        if (cVar != null) {
            top += cVar.getStickersListTop();
        }
        motionEvent.offsetLocation(getLeft(), top);
        ((AbstractView$OnTouchListenerC7889a) getContext()).m14611C0(motionEvent);
    }

    public void m35597r() {
        setSticker(this.f7404M);
    }

    public final void m35596s() {
        this.f7419c.m29542m(0.0f, true);
        this.f7408Q = 0.0f;
    }

    public void setSticker(C2104l lVar) {
        this.f7404M = lVar;
        this.f7407P = lVar != null && lVar.m35574m();
        m35596s();
        Path path = null;
        C6246h h = (lVar == null || lVar.m35573n()) ? null : lVar.m35579h();
        C6503j i = (lVar == null || lVar.m35573n()) ? null : lVar.m35578i();
        if ((lVar == null || lVar.m35573n()) && h != null) {
            throw new RuntimeException("");
        }
        if (lVar != null) {
            path = lVar.m35585b(Math.min(this.f7415a.getWidth(), this.f7415a.getHeight()));
        }
        this.f7405N = path;
        this.f7415a.m20820G(h);
        this.f7417b.m20232r(i);
    }

    public void setStickerMovementCallback(AbstractC2102c cVar) {
        this.f7418b0 = cVar;
    }

    public void setStickerPressed(boolean z) {
        if (this.f7425h0 != z) {
            this.f7425h0 = z;
            this.f7419c.m29546i(z ? 1.0f : 0.0f);
        }
    }

    public boolean m35595t(C2099j jVar, C2104l lVar, boolean z, boolean z2) {
        m35609f();
        if (z && z2) {
            return false;
        }
        C2101b bVar = new C2101b(jVar, lVar);
        this.f7420c0 = bVar;
        bVar.m21856e(C1379j0.m37316o());
        C1379j0.m37335e0(this.f7420c0, z2 ? 1500L : 1000L);
        return true;
    }

    public void m35594u() {
        this.f7411T = true;
    }

    public void m35593v() {
        this.f7410S = true;
    }

    public void m35592w() {
        this.f7409R = true;
    }
}
