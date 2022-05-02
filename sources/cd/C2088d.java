package cd;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import be.C1357a0;
import be.C1379j0;
import be.C1389o;
import be.C1399s0;
import be.C1410y;
import me.C6847b2;
import me.C6924j2;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3950k;
import p082fd.C4403w;
import p108hb.C5069h;
import p111he.C5147v;
import p139jb.AbstractC5911c;
import p156kd.AbstractC6264v;
import p156kd.C6257p;
import p168ld.C6496e;
import p168ld.RunnableC6507m;
import p335xd.C10189d;
import p335xd.C10192g;
import p350yd.C10930q6;
import p350yd.HandlerC10770jj;
import p364zd.AbstractC11526l;
import p364zd.AbstractC11531p;
import p364zd.C11510b;
import p364zd.C11524j;
import p364zd.C11525k;
import p364zd.C11537v;
import p364zd.C11541z;
import td.AbstractC9162c;
import td.AbstractC9323v4;

public class C2088d extends FrameLayoutFix implements C3950k.AbstractC3952b, C6924j2.AbstractC6928d, AbstractC9162c, AbstractC5911c, AbstractC11526l {
    public static final OvershootInterpolator f7334u0 = new OvershootInterpolator(1.0f);
    public final C3950k f7335M = new C3950k(0, this, f7334u0, 268);
    public final C6257p f7336N;
    public final RunnableC6507m f7337O;
    public final C6257p f7338P;
    public final C2091c f7339Q;
    public final TextPaint f7340R;
    public final C11537v f7341S;
    public C2099j f7342T;
    public C6924j2 f7343U;
    public C2104l f7344V;
    public int f7345W;
    public int f7346a0;
    public int f7347b0;
    public C5147v f7348c0;
    public boolean f7349d0;
    public Path f7350e0;
    public int f7351f0;
    public int f7352g0;
    public int f7353h0;
    public int f7354i0;
    public C10930q6 f7355j0;
    public LinearLayout f7356k0;
    public boolean f7357l0;
    public C3950k f7358m0;
    public float f7359n0;
    public float f7360o0;
    public C3950k f7361p0;
    public float f7362q0;
    public float f7363r0;
    public float f7364s0;
    public View f7365t0;

    public class C2089a extends LinearLayout {
        public C2089a(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            RectF a0 = C1410y.m37053a0();
            a0.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
            canvas.drawRoundRect(a0, C1357a0.m37544i(2.0f), C1357a0.m37544i(2.0f), Build.VERSION.SDK_INT >= 21 ? C1410y.m37042g(C11524j.m148w()) : C1410y.m37084B0(C11524j.m148w()));
        }
    }

    public class C2090b extends ViewOutlineProvider {
        public C2090b() {
        }

        @Override
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(view.getPaddingLeft(), view.getPaddingTop(), view.getMeasuredWidth() - view.getPaddingRight(), view.getMeasuredHeight() - view.getPaddingBottom(), C1357a0.m37544i(2.0f));
        }
    }

    public class C2091c extends View {
        public C2091c(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            boolean z = true;
            boolean z2 = C2088d.this.f7362q0 != 1.0f;
            if (z2) {
                float f = C2088d.this.f7353h0 / C2088d.this.f7345W;
                float f2 = f + ((1.0f - f) * C2088d.this.f7362q0);
                float stickerCenterX = C2088d.this.getStickerCenterX();
                float stickerCenterY = C2088d.this.getStickerCenterY();
                canvas.save();
                canvas.translate((stickerCenterX - C2088d.this.f7351f0) * (1.0f - C2088d.this.f7362q0) * (-1.0f), (stickerCenterY - C2088d.this.f7352g0) * (1.0f - C2088d.this.f7362q0) * (-1.0f));
                canvas.scale(f2, f2, stickerCenterX, stickerCenterY);
            }
            float f3 = ((1.0f - C2088d.this.f7360o0) * 0.27999997f) + 0.72f;
            boolean z3 = C2088d.this.f7344V != null && C2088d.this.f7344V.m35574m();
            C2088d dVar = C2088d.this;
            AbstractC6264v vVar = z3 ? dVar.f7337O : dVar.f7336N;
            if (C2088d.this.f7348c0 != null) {
                int I0 = vVar.mo20258I0() - (C2088d.this.f7348c0.m23804g() / 2);
                int y0 = (vVar.mo20228y0() - (C2088d.this.f7347b0 / 2)) - C1357a0.m37544i(58.0f);
                boolean z4 = C2088d.this.f7360o0 != 0.0f;
                if (z4) {
                    canvas.save();
                    canvas.scale(f3, f3, vVar.mo20258I0(), C1357a0.m37544i(15.0f) + y0);
                }
                C2088d.this.f7348c0.m23810a(canvas, I0, y0, -16777216, false);
                if (z4) {
                    canvas.restore();
                }
            }
            if (C2088d.this.f7360o0 == 0.0f) {
                z = false;
            }
            if (z) {
                canvas.save();
                canvas.scale(f3, f3, vVar.mo20258I0(), vVar.mo20228y0());
            }
            if (!z3) {
                if (vVar.mo20247c0()) {
                    if (C2088d.this.f7338P.mo20247c0()) {
                        C2088d.this.f7338P.mo20255O(canvas, C2088d.this.f7350e0);
                    }
                    C2088d.this.f7338P.draw(canvas);
                }
                vVar.draw(canvas);
            } else if (vVar.mo20247c0()) {
                if (C2088d.this.f7338P.mo20247c0()) {
                    C2088d.this.f7338P.mo20255O(canvas, C2088d.this.f7350e0);
                }
                C2088d.this.f7338P.draw(canvas);
            } else {
                vVar.draw(canvas);
            }
            if (z) {
                canvas.restore();
            }
            if (z2) {
                canvas.restore();
            }
        }
    }

    public C2088d(Context context) {
        super(context);
        C11537v vVar = new C11537v();
        this.f7341S = vVar;
        TextPaint textPaint = new TextPaint(5);
        this.f7340R = textPaint;
        textPaint.setTextSize(C1357a0.m37544i(30.0f));
        textPaint.setTypeface(C1389o.m37263i());
        C2091c cVar = new C2091c(context);
        this.f7339Q = cVar;
        cVar.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        addView(cVar);
        C10192g.m5781j(this, R.id.theme_color_previewBackground);
        vVar.m74f(this);
        setAlpha(0.0f);
        cVar.setLayerType(2, C1399s0.m37159t());
        setLayerType(2, C1399s0.m37159t());
        this.f7338P = new C6257p(cVar, 0);
        this.f7336N = new C6257p(cVar, 0);
        this.f7337O = new RunnableC6507m(cVar);
        C11541z.m7t().m23f(this);
    }

    private int getDesiredHeight() {
        return this.f7354i0 != -1 ? Math.min(getMeasuredHeight(), this.f7354i0) : getMeasuredHeight();
    }

    public int getStickerCenterX() {
        return getMeasuredWidth() / 2;
    }

    public int getStickerCenterY() {
        return getDesiredHeight() / 2;
    }

    public void m35648h2(C2104l lVar, View view) {
        AbstractC9323v4<?> d2;
        int id2 = view.getId();
        if (id2 == R.id.btn_favorite) {
            int g = lVar.m35580g();
            if (this.f7355j0.m2315o7(g)) {
                this.f7355j0.m2270r4().m14783o(new TdApi.RemoveFavoriteSticker(new TdApi.InputFileId(g)), this.f7355j0.m2392ja());
            } else {
                this.f7355j0.m2270r4().m14783o(new TdApi.AddFavoriteSticker(new TdApi.InputFileId(g)), this.f7355j0.m2392ja());
            }
            m35654Y1();
        } else if (id2 == R.id.btn_send) {
            C2099j jVar = this.f7342T;
            if (jVar != null && jVar.m35603l(view, lVar, false, null)) {
                m35654Y1();
            }
        } else if (id2 != R.id.btn_view) {
            m35654Y1();
        } else if (this.f7342T != null && (d2 = m35650d2()) != null) {
            this.f7355j0.m2485dd().m3777M8(d2, lVar.m35576k());
            m35654Y1();
        }
    }

    public void m35647i2(View view, C2104l lVar, boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
        if (this.f7342T.m35603l(view, lVar, z, messageSchedulingState)) {
            m35654Y1();
        }
    }

    public boolean m35646k2(final C2104l lVar, final View view) {
        AbstractC9323v4<?> d2 = m35650d2();
        return d2 != null && this.f7355j0.m2485dd().m3787L8(d2, this.f7342T.getStickerOutputChatId(), true, new HandlerC10770jj.AbstractC10786o() {
            @Override
            public final void mo3333a(boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
                C2088d.this.m35647i2(view, lVar, z, messageSchedulingState, z2);
            }
        }, null);
    }

    private void setMenuFactor(float f) {
        if (this.f7359n0 != f) {
            this.f7359n0 = f;
            this.f7356k0.setAlpha(C5069h.m24090d(f));
            float f2 = (this.f7359n0 * 0.4f) + 0.6f;
            this.f7356k0.setScaleX(f2);
            this.f7356k0.setScaleY(f2);
        }
    }

    private void setReplaceFactor(float f) {
        if (this.f7360o0 != f) {
            this.f7360o0 = f;
            this.f7339Q.invalidate();
        }
    }

    @Override
    public void mo11175I2(C6924j2 j2Var) {
        this.f7343U = j2Var;
        this.f7335M.m29546i(1.0f);
    }

    @Override
    public void mo137J4(int i, int i2, float f, boolean z) {
        C11525k.m138c(this, i, i2, f, z);
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            setAlpha(Math.max(0.0f, Math.min(1.0f, f)));
            setAppearFactor(f);
        } else if (i == 1) {
            setReplaceFactor(f);
        } else if (i == 3) {
            setMenuFactor(f);
        }
    }

    @Override
    public boolean mo136W0() {
        return true;
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        C6924j2 j2Var;
        LinearLayout linearLayout;
        if (i != 0) {
            if (i == 3 && f == 0.0f && (linearLayout = this.f7356k0) != null) {
                removeView(linearLayout);
                this.f7356k0 = null;
            }
        } else if (f == 0.0f) {
            this.f7336N.clear();
            this.f7338P.clear();
            this.f7337O.clear();
            C6924j2 j2Var2 = this.f7343U;
            if (j2Var2 != null) {
                j2Var2.m18441G2();
            }
        } else if (f == 1.0f && (j2Var = this.f7343U) != null) {
            j2Var.mo18440H2();
        }
    }

    public final void m35654Y1() {
        C2099j jVar = this.f7342T;
        if (jVar != null) {
            jVar.m35607h();
        }
    }

    public final void m35653Z1(MotionEvent motionEvent, View view, int i) {
        view.dispatchTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), i, (motionEvent.getX() + this.f7363r0) - view.getLeft(), (motionEvent.getY() + this.f7364s0) - view.getTop(), motionEvent.getMetaState()));
    }

    public void m35652a2(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2) {
            m35642p2(motionEvent, m35651b2(motionEvent, motionEvent.getX(), motionEvent.getY()));
        }
        View view = this.f7365t0;
        if (view != null) {
            motionEvent.offsetLocation(this.f7363r0 - view.getLeft(), this.f7364s0 - this.f7365t0.getTop());
            this.f7365t0.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void mo4501a3() {
        C11541z.m7t().m42S(this);
        this.f7336N.clear();
        this.f7337O.clear();
        this.f7338P.clear();
        C2104l lVar = this.f7344V;
        if (lVar != null) {
            if (lVar.m35574m()) {
                C6496e.m20326o(this.f7344V.m35583d(), false);
            }
            this.f7344V = null;
        }
    }

    @Override
    public void mo135a7(AbstractC11531p pVar, AbstractC11531p pVar2) {
        C11525k.m139b(this, pVar, pVar2);
    }

    public final View m35651b2(MotionEvent motionEvent, float f, float f2) {
        LinearLayout linearLayout = this.f7356k0;
        if (linearLayout == null) {
            return null;
        }
        int left = linearLayout.getLeft();
        int top = this.f7356k0.getTop();
        int right = this.f7356k0.getRight();
        int bottom = this.f7356k0.getBottom();
        this.f7363r0 = 0.0f;
        this.f7364s0 = 0.0f;
        float f3 = left;
        if (f >= f3 && f <= right) {
            float f4 = top;
            if (f2 >= f4 && f2 <= bottom) {
                float f5 = f - f3;
                float f6 = f2 - f4;
                this.f7363r0 = 0.0f - f3;
                this.f7364s0 = 0.0f - f4;
                int childCount = this.f7356k0.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = this.f7356k0.getChildAt(i);
                    int left2 = childAt.getLeft();
                    int top2 = childAt.getTop();
                    int right2 = childAt.getRight();
                    int bottom2 = childAt.getBottom();
                    if (f5 >= left2 && f5 <= right2 && f6 >= top2 && f6 <= bottom2) {
                        return childAt;
                    }
                }
            }
        }
        return null;
    }

    @Override
    public void mo11141d0() {
    }

    public final AbstractC9323v4<?> m35650d2() {
        AbstractC9323v4<?> q9 = AbstractC9323v4.m9183q9(this.f7342T);
        return q9 == null ? C1379j0.m37306t(getContext()) : q9;
    }

    public void m35649f2() {
        if (this.f7356k0 != null) {
            m35641r2(false, true);
        }
    }

    @Override
    public boolean mo10134g0(boolean z) {
        m35654Y1();
        return true;
    }

    public final void m35645l2() {
        if (this.f7344V != null) {
            int stickerCenterX = getStickerCenterX();
            int stickerCenterY = getStickerCenterY();
            this.f7345W = this.f7344V.m35575l();
            this.f7346a0 = this.f7344V.m35581f();
            this.f7347b0 = Math.min(C1357a0.m37544i(190.0f), C1357a0.m37556B() - C1357a0.m37544i(86.0f));
            int max = Math.max(this.f7345W, this.f7346a0);
            int i = this.f7347b0;
            if (max != i) {
                float min = Math.min(i / this.f7345W, i / this.f7346a0);
                this.f7345W = (int) (this.f7345W * min);
                this.f7346a0 = (int) (this.f7346a0 * min);
            }
            C6257p pVar = this.f7338P;
            int i2 = this.f7345W;
            int i3 = this.f7346a0;
            pVar.mo20257K0(stickerCenterX - (i2 / 2), stickerCenterY - (i3 / 2), (i2 / 2) + stickerCenterX, (i3 / 2) + stickerCenterY);
            C6257p pVar2 = this.f7336N;
            int i4 = this.f7345W;
            int i5 = this.f7346a0;
            pVar2.mo20257K0(stickerCenterX - (i4 / 2), stickerCenterY - (i5 / 2), (i4 / 2) + stickerCenterX, (i5 / 2) + stickerCenterY);
            RunnableC6507m mVar = this.f7337O;
            int i6 = this.f7345W;
            int i7 = this.f7346a0;
            mVar.mo20257K0(stickerCenterX - (i6 / 2), stickerCenterY - (i7 / 2), stickerCenterX + (i6 / 2), stickerCenterY + (i7 / 2));
        }
    }

    public void m35644m2(final C2104l lVar) {
        boolean z;
        m35641r2(false, false);
        C2089a aVar = new C2089a(getContext());
        this.f7356k0 = aVar;
        if (Build.VERSION.SDK_INT >= 21) {
            aVar.setElevation(C1357a0.m37544i(1.0f));
            this.f7356k0.setTranslationZ(C1357a0.m37544i(1.0f));
            this.f7356k0.setOutlineProvider(new C2090b());
        } else {
            C1399s0.m37186f0(aVar, 1);
        }
        this.f7356k0.setWillNotDraw(false);
        this.f7356k0.setPadding(C1357a0.m37544i(4.0f), C1357a0.m37544i(4.0f), C1357a0.m37544i(4.0f), C1357a0.m37544i(4.0f));
        this.f7356k0.setOrientation(0);
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-2, C1357a0.m37544i(48.0f) + this.f7356k0.getPaddingTop() + this.f7356k0.getPaddingBottom(), 1);
        t1.topMargin = getStickerCenterY() + (this.f7346a0 / 2) + C1357a0.m37544i(32.0f);
        this.f7356k0.setLayoutParams(t1);
        View.OnClickListener aVar2 = new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                C2088d.this.m35648h2(lVar, view);
            }
        };
        this.f7341S.m74f(this.f7356k0);
        boolean o7 = this.f7355j0.m2315o7(lVar.m35580g());
        if (o7 || this.f7355j0.m2192w2()) {
            ImageView imageView = new ImageView(getContext());
            imageView.setId(R.id.btn_favorite);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setOnClickListener(aVar2);
            imageView.setImageResource(o7 ? R.drawable.baseline_star_24 : R.drawable.baseline_star_border_24);
            imageView.setColorFilter(C11524j.m228N(R.id.theme_color_textNeutral));
            this.f7341S.m75e(imageView, R.id.theme_color_textNeutral);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(C1357a0.m37544i(48.0f), -1));
            imageView.setPadding(C4403w.m27986G2() ? 0 : C1357a0.m37544i(8.0f), 0, C4403w.m27986G2() ? C1357a0.m37544i(8.0f) : 0, 0);
            C10189d.m5795i(imageView);
            C1399s0.m37196a0(imageView);
            if (C4403w.m27986G2()) {
                this.f7356k0.addView(imageView, 0);
            } else {
                this.f7356k0.addView(imageView);
            }
            z = true;
        } else {
            z = false;
        }
        boolean s = lVar.m35568s();
        C6847b2 b2Var = new C6847b2(getContext());
        b2Var.setId(R.id.btn_send);
        b2Var.setTextSize(1, 15.0f);
        b2Var.setTypeface(C1389o.m37263i());
        b2Var.setTextColor(C11524j.m228N(R.id.theme_color_textNeutral));
        this.f7341S.m77c(b2Var, R.id.theme_color_textNeutral);
        C1399s0.m37178j0(b2Var, C4403w.m27871i1(R.string.SendSticker).toUpperCase());
        b2Var.setOnClickListener(aVar2);
        C10189d.m5795i(b2Var);
        float f = 12.0f;
        int i = C1357a0.m37544i(z ? 12.0f : 16.0f);
        int i2 = C1357a0.m37544i(s ? 12.0f : 16.0f);
        int i3 = C4403w.m27986G2() ? i2 : i;
        if (!C4403w.m27986G2()) {
            i = i2;
        }
        b2Var.setPadding(i3, 0, i, 0);
        b2Var.setGravity(17);
        b2Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        if (C4403w.m27986G2()) {
            this.f7356k0.addView(b2Var, 0);
        } else {
            this.f7356k0.addView(b2Var);
        }
        C2099j jVar = this.f7342T;
        if (!(jVar == null || jVar.getStickerOutputChatId() == 0)) {
            b2Var.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public final boolean onLongClick(View view) {
                    boolean k2;
                    k2 = C2088d.this.m35646k2(lVar, view);
                    return k2;
                }
            });
        }
        if (s) {
            C6847b2 b2Var2 = new C6847b2(getContext());
            b2Var2.setId(R.id.btn_view);
            b2Var2.setTypeface(C1389o.m37263i());
            b2Var2.setTextSize(1, 15.0f);
            b2Var2.setTextColor(C11524j.m228N(R.id.theme_color_textNeutral));
            C1399s0.m37178j0(b2Var2, C4403w.m27871i1(R.string.ViewPackPreview).toUpperCase());
            this.f7341S.m77c(b2Var2, R.id.theme_color_textNeutral);
            b2Var2.setOnClickListener(aVar2);
            C10189d.m5795i(b2Var2);
            int i4 = C1357a0.m37544i(C4403w.m27986G2() ? 16.0f : 12.0f);
            if (!C4403w.m27986G2()) {
                f = 16.0f;
            }
            b2Var2.setPadding(i4, 0, C1357a0.m37544i(f), 0);
            b2Var2.setGravity(17);
            b2Var2.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
            if (C4403w.m27986G2()) {
                this.f7356k0.addView(b2Var2, 0);
            } else {
                this.f7356k0.addView(b2Var2);
            }
        }
        this.f7356k0.setAlpha(0.0f);
        addView(this.f7356k0);
        m35641r2(true, true);
    }

    @Override
    public void mo134m7(boolean z, C11510b bVar) {
        this.f7341S.m66n(z);
    }

    public void m35643n2(C2104l lVar, int i, int i2) {
        C3950k kVar = this.f7361p0;
        if (kVar == null) {
            this.f7361p0 = new C3950k(1, this, f7334u0, 220L, 1.0f);
        } else {
            kVar.m29543l(1.0f);
        }
        this.f7360o0 = 1.0f;
        m35640t2(lVar, true);
        this.f7351f0 = i;
        this.f7352g0 = i2;
        this.f7361p0.m29546i(0.0f);
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m35645l2();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return true;
        }
        m35654Y1();
        return true;
    }

    public final void m35642p2(MotionEvent motionEvent, View view) {
        View view2 = this.f7365t0;
        if (view2 != view) {
            if (view2 != null) {
                m35653Z1(motionEvent, view2, 3);
            }
            this.f7365t0 = view;
            if (view != null) {
                m35653Z1(motionEvent, view, 0);
                C1379j0.m37324k(view, false);
            }
        }
    }

    @Override
    public void mo133q0(int i) {
        C11525k.m140a(this, i);
    }

    public void m35641r2(boolean z, boolean z2) {
        LinearLayout linearLayout;
        if (this.f7357l0 != z) {
            this.f7357l0 = z;
            float f = z ? 1.0f : 0.0f;
            if (z2) {
                if (this.f7358m0 == null) {
                    this.f7358m0 = new C3950k(3, this, C2057b.f7280b, 100L, this.f7359n0);
                }
                if (f == 1.0f && this.f7359n0 == 0.0f) {
                    this.f7358m0.m29559B(C2057b.f7284f);
                    this.f7358m0.m29530y(290L);
                } else {
                    this.f7358m0.m29559B(C2057b.f7280b);
                    this.f7358m0.m29530y(140L);
                }
                this.f7358m0.m29546i(f);
                return;
            }
            C3950k kVar = this.f7358m0;
            if (kVar != null) {
                kVar.m29543l(f);
            }
            setMenuFactor(f);
            if (f == 0.0f && (linearLayout = this.f7356k0) != null) {
                removeView(linearLayout);
                this.f7356k0 = null;
            }
        }
    }

    public void setAppearFactor(float f) {
        if (this.f7362q0 != f) {
            this.f7362q0 = f;
            this.f7339Q.invalidate();
        }
    }

    public void setControllerView(C2099j jVar) {
        this.f7342T = jVar;
    }

    public final void m35640t2(C2104l lVar, boolean z) {
        if (lVar.m35574m()) {
            C6496e.m20326o(lVar.m35583d(), true);
        }
        C2104l lVar2 = this.f7344V;
        if (lVar2 != null && lVar2.m35574m()) {
            C6496e.m20326o(this.f7344V.m35583d(), false);
        }
        this.f7344V = lVar;
        if (lVar.m35571p() || this.f7349d0) {
            this.f7348c0 = null;
        } else {
            this.f7348c0 = new C5147v(lVar.m35586a(), -1, this.f7340R);
        }
        m35645l2();
        this.f7338P.m20820G(lVar.m35579h());
        this.f7336N.m20820G(lVar.m35582e());
        this.f7337O.m20232r(lVar.m35583d());
        this.f7350e0 = lVar.m35585b(-1);
        m35649f2();
    }

    public void m35639u2(C10930q6 q6Var, C2104l lVar, int i, int i2, int i3, int i4, boolean z) {
        this.f7355j0 = q6Var;
        this.f7349d0 = z;
        this.f7351f0 = i;
        this.f7352g0 = i2;
        this.f7353h0 = i3;
        this.f7354i0 = i4;
        m35640t2(lVar, false);
    }

    @Override
    public boolean mo11107w2(C6924j2 j2Var, C3950k kVar) {
        this.f7335M.m29544k();
        this.f7335M.m29530y(292L);
        if (this.f7335M.m29540o() == 0.0f) {
            j2Var.m18441G2();
            return true;
        }
        this.f7343U = j2Var;
        this.f7335M.m29546i(0.0f);
        return true;
    }
}
