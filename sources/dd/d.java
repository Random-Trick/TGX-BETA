package dd;

import ae.j;
import ae.l;
import ae.v;
import ae.z;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import ce.a0;
import ce.j0;
import ce.o;
import ce.p0;
import ce.y;
import eb.k;
import gd.w;
import ib.h;
import ld.p;
import md.e;
import md.m;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.b2;
import ne.j2;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import ud.v4;
import yd.g;
import zd.hj;
import zd.o6;

public class d extends FrameLayoutFix implements k.b, j2.d, ud.c, kb.c, l {
    public static final OvershootInterpolator f7341u0 = new OvershootInterpolator(1.0f);
    public final k M = new k(0, this, f7341u0, 268);
    public final p N;
    public final m O;
    public final p P;
    public final c Q;
    public final TextPaint R;
    public final v S;
    public j T;
    public j2 U;
    public l V;
    public int W;
    public int f7342a0;
    public int f7343b0;
    public ie.v f7344c0;
    public boolean f7345d0;
    public Path f7346e0;
    public int f7347f0;
    public int f7348g0;
    public int f7349h0;
    public int f7350i0;
    public o6 f7351j0;
    public LinearLayout f7352k0;
    public boolean f7353l0;
    public k f7354m0;
    public float f7355n0;
    public float f7356o0;
    public k f7357p0;
    public float f7358q0;
    public float f7359r0;
    public float f7360s0;
    public View f7361t0;

    public class a extends LinearLayout {
        public a(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            RectF a02 = y.a0();
            a02.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
            canvas.drawRoundRect(a02, a0.i(2.0f), a0.i(2.0f), y.g(j.u()));
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(view.getPaddingLeft(), view.getPaddingTop(), view.getMeasuredWidth() - view.getPaddingRight(), view.getMeasuredHeight() - view.getPaddingBottom(), a0.i(2.0f));
        }
    }

    public class c extends View {
        public c(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            boolean z10 = true;
            boolean z11 = d.this.f7358q0 != 1.0f;
            if (z11) {
                float f10 = d.this.f7349h0 / d.this.W;
                float f11 = f10 + ((1.0f - f10) * d.this.f7358q0);
                float stickerCenterX = d.this.getStickerCenterX();
                float stickerCenterY = d.this.getStickerCenterY();
                canvas.save();
                canvas.translate((stickerCenterX - d.this.f7347f0) * (1.0f - d.this.f7358q0) * (-1.0f), (stickerCenterY - d.this.f7348g0) * (1.0f - d.this.f7358q0) * (-1.0f));
                canvas.scale(f11, f11, stickerCenterX, stickerCenterY);
            }
            float f12 = ((1.0f - d.this.f7356o0) * 0.27999997f) + 0.72f;
            boolean z12 = d.this.V != null && d.this.V.m();
            d dVar = d.this;
            ld.v vVar = z12 ? dVar.O : dVar.N;
            if (d.this.f7344c0 != null) {
                int J0 = vVar.J0() - (d.this.f7344c0.g() / 2);
                int x02 = (vVar.x0() - (d.this.f7343b0 / 2)) - a0.i(58.0f);
                boolean z13 = d.this.f7356o0 != 0.0f;
                if (z13) {
                    canvas.save();
                    canvas.scale(f12, f12, vVar.J0(), a0.i(15.0f) + x02);
                }
                d.this.f7344c0.a(canvas, J0, x02, -16777216, false);
                if (z13) {
                    canvas.restore();
                }
            }
            if (d.this.f7356o0 == 0.0f) {
                z10 = false;
            }
            if (z10) {
                canvas.save();
                canvas.scale(f12, f12, vVar.J0(), vVar.x0());
            }
            if (!z12) {
                if (vVar.e0()) {
                    if (d.this.P.e0()) {
                        d.this.P.P(canvas, d.this.f7346e0);
                    }
                    d.this.P.draw(canvas);
                }
                vVar.draw(canvas);
            } else if (vVar.e0()) {
                if (d.this.P.e0()) {
                    d.this.P.P(canvas, d.this.f7346e0);
                }
                d.this.P.draw(canvas);
            } else {
                vVar.draw(canvas);
            }
            if (z10) {
                canvas.restore();
            }
            if (z11) {
                canvas.restore();
            }
        }
    }

    public d(Context context) {
        super(context);
        v vVar = new v();
        this.S = vVar;
        TextPaint textPaint = new TextPaint(5);
        this.R = textPaint;
        textPaint.setTextSize(a0.i(30.0f));
        textPaint.setTypeface(o.i());
        c cVar = new c(context);
        this.Q = cVar;
        cVar.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        addView(cVar);
        g.j(this, R.id.theme_color_previewBackground);
        vVar.f(this);
        setAlpha(0.0f);
        cVar.setLayerType(2, p0.q());
        setLayerType(2, p0.q());
        this.P = new p(cVar, 0);
        this.N = new p(cVar, 0);
        this.O = new m(cVar);
        z.u().e(this);
    }

    public void f2(l lVar, View view) {
        v4<?> c22;
        int id2 = view.getId();
        if (id2 == R.id.btn_favorite) {
            int g10 = lVar.g();
            if (this.f7351j0.s7(g10)) {
                this.f7351j0.v4().o(new TdApi.RemoveFavoriteSticker(new TdApi.InputFileId(g10)), this.f7351j0.na());
            } else {
                this.f7351j0.v4().o(new TdApi.AddFavoriteSticker(new TdApi.InputFileId(g10)), this.f7351j0.na());
            }
            X1();
        } else if (id2 == R.id.btn_send) {
            j jVar = this.T;
            if (jVar != null && jVar.l(view, lVar, false, null)) {
                X1();
            }
        } else if (id2 != R.id.btn_view) {
            X1();
        } else if (this.T != null && (c22 = c2()) != null) {
            this.f7351j0.hd().M8(c22, lVar.k());
            X1();
        }
    }

    public void g2(View view, l lVar, boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
        if (this.T.l(view, lVar, z10, messageSchedulingState)) {
            X1();
        }
    }

    private int getDesiredHeight() {
        return this.f7350i0 != -1 ? Math.min(getMeasuredHeight(), this.f7350i0) : getMeasuredHeight();
    }

    public int getStickerCenterX() {
        return getMeasuredWidth() / 2;
    }

    public int getStickerCenterY() {
        return getDesiredHeight() / 2;
    }

    public boolean h2(final l lVar, final View view) {
        v4<?> c22 = c2();
        return c22 != null && this.f7351j0.hd().L8(c22, this.T.getStickerOutputChatId(), true, new hj.o() {
            @Override
            public final void a(boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
                d.this.g2(view, lVar, z10, messageSchedulingState, z11);
            }
        }, null);
    }

    private void setMenuFactor(float f10) {
        if (this.f7355n0 != f10) {
            this.f7355n0 = f10;
            this.f7352k0.setAlpha(h.d(f10));
            float f11 = (this.f7355n0 * 0.4f) + 0.6f;
            this.f7352k0.setScaleX(f11);
            this.f7352k0.setScaleY(f11);
        }
    }

    private void setReplaceFactor(float f10) {
        if (this.f7356o0 != f10) {
            this.f7356o0 = f10;
            this.Q.invalidate();
        }
    }

    @Override
    public void C4(int i10, int i11, float f10, boolean z10) {
        ae.k.c(this, i10, i11, f10, z10);
    }

    @Override
    public void H2(j2 j2Var) {
        this.U = j2Var;
        this.M.i(1.0f);
    }

    @Override
    public void Q2() {
        z.u().U(this);
        this.N.clear();
        this.O.clear();
        this.P.clear();
        l lVar = this.V;
        if (lVar != null) {
            if (lVar.m()) {
                e.o(this.V.d(), false);
            }
            this.V = null;
        }
    }

    @Override
    public boolean U1(j2 j2Var, k kVar) {
        this.M.k();
        this.M.y(292L);
        if (this.M.o() == 0.0f) {
            j2Var.B2();
            return true;
        }
        this.U = j2Var;
        this.M.i(0.0f);
        return true;
    }

    @Override
    public boolean V0() {
        return true;
    }

    public final void X1() {
        j jVar = this.T;
        if (jVar != null) {
            jVar.h();
        }
    }

    public final void Y1(MotionEvent motionEvent, View view, int i10) {
        view.dispatchTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), i10, (motionEvent.getX() + this.f7359r0) - view.getLeft(), (motionEvent.getY() + this.f7360s0) - view.getTop(), motionEvent.getMetaState()));
    }

    public void Z1(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2) {
            l2(motionEvent, a2(motionEvent, motionEvent.getX(), motionEvent.getY()));
        }
        View view = this.f7361t0;
        if (view != null) {
            motionEvent.offsetLocation(this.f7359r0 - view.getLeft(), this.f7360s0 - this.f7361t0.getTop());
            this.f7361t0.dispatchTouchEvent(motionEvent);
        }
    }

    public final View a2(MotionEvent motionEvent, float f10, float f11) {
        LinearLayout linearLayout = this.f7352k0;
        if (linearLayout == null) {
            return null;
        }
        int left = linearLayout.getLeft();
        int top = this.f7352k0.getTop();
        int right = this.f7352k0.getRight();
        int bottom = this.f7352k0.getBottom();
        this.f7359r0 = 0.0f;
        this.f7360s0 = 0.0f;
        float f12 = left;
        if (f10 >= f12 && f10 <= right) {
            float f13 = top;
            if (f11 >= f13 && f11 <= bottom) {
                float f14 = f10 - f12;
                float f15 = f11 - f13;
                this.f7359r0 = 0.0f - f12;
                this.f7360s0 = 0.0f - f13;
                int childCount = this.f7352k0.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = this.f7352k0.getChildAt(i10);
                    int left2 = childAt.getLeft();
                    int top2 = childAt.getTop();
                    int right2 = childAt.getRight();
                    int bottom2 = childAt.getBottom();
                    if (f14 >= left2 && f14 <= right2 && f15 >= top2 && f15 <= bottom2) {
                        return childAt;
                    }
                }
            }
        }
        return null;
    }

    @Override
    public void c0() {
    }

    public final v4<?> c2() {
        v4<?> q92 = v4.q9(this.T);
        return q92 == null ? j0.t(getContext()) : q92;
    }

    public void d2() {
        if (this.f7352k0 != null) {
            m2(false, true);
        }
    }

    public final void i2() {
        if (this.V != null) {
            int stickerCenterX = getStickerCenterX();
            int stickerCenterY = getStickerCenterY();
            this.W = this.V.l();
            this.f7342a0 = this.V.f();
            this.f7343b0 = Math.min(a0.i(190.0f), a0.B() - a0.i(86.0f));
            int max = Math.max(this.W, this.f7342a0);
            int i10 = this.f7343b0;
            if (max != i10) {
                float min = Math.min(i10 / this.W, i10 / this.f7342a0);
                this.W = (int) (this.W * min);
                this.f7342a0 = (int) (this.f7342a0 * min);
            }
            p pVar = this.P;
            int i11 = this.W;
            int i12 = this.f7342a0;
            pVar.K0(stickerCenterX - (i11 / 2), stickerCenterY - (i12 / 2), (i11 / 2) + stickerCenterX, (i12 / 2) + stickerCenterY);
            p pVar2 = this.N;
            int i13 = this.W;
            int i14 = this.f7342a0;
            pVar2.K0(stickerCenterX - (i13 / 2), stickerCenterY - (i14 / 2), (i13 / 2) + stickerCenterX, (i14 / 2) + stickerCenterY);
            m mVar = this.O;
            int i15 = this.W;
            int i16 = this.f7342a0;
            mVar.K0(stickerCenterX - (i15 / 2), stickerCenterY - (i16 / 2), stickerCenterX + (i15 / 2), stickerCenterY + (i16 / 2));
        }
    }

    @Override
    public void i3(ae.p pVar, ae.p pVar2) {
        ae.k.b(this, pVar, pVar2);
    }

    @Override
    public boolean j0(boolean z10) {
        X1();
        return true;
    }

    public void j2(final l lVar) {
        boolean z10;
        m2(false, false);
        a aVar = new a(getContext());
        this.f7352k0 = aVar;
        aVar.setElevation(a0.i(1.0f));
        this.f7352k0.setTranslationZ(a0.i(1.0f));
        this.f7352k0.setOutlineProvider(new b());
        this.f7352k0.setWillNotDraw(false);
        this.f7352k0.setPadding(a0.i(4.0f), a0.i(4.0f), a0.i(4.0f), a0.i(4.0f));
        this.f7352k0.setOrientation(0);
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(-2, a0.i(48.0f) + this.f7352k0.getPaddingTop() + this.f7352k0.getPaddingBottom(), 1);
        r12.topMargin = getStickerCenterY() + (this.f7342a0 / 2) + a0.i(32.0f);
        this.f7352k0.setLayoutParams(r12);
        View.OnClickListener aVar2 = new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                d.this.f2(lVar, view);
            }
        };
        this.S.f(this.f7352k0);
        boolean s72 = this.f7351j0.s7(lVar.g());
        if (s72 || this.f7351j0.y2()) {
            ImageView imageView = new ImageView(getContext());
            imageView.setId(R.id.btn_favorite);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setOnClickListener(aVar2);
            imageView.setImageResource(s72 ? R.drawable.baseline_star_24 : R.drawable.baseline_star_border_24);
            imageView.setColorFilter(j.L(R.id.theme_color_textNeutral));
            this.S.e(imageView, R.id.theme_color_textNeutral);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(a0.i(48.0f), -1));
            imageView.setPadding(w.G2() ? 0 : a0.i(8.0f), 0, w.G2() ? a0.i(8.0f) : 0, 0);
            yd.d.i(imageView);
            p0.T(imageView);
            if (w.G2()) {
                this.f7352k0.addView(imageView, 0);
            } else {
                this.f7352k0.addView(imageView);
            }
            z10 = true;
        } else {
            z10 = false;
        }
        boolean s10 = lVar.s();
        b2 b2Var = new b2(getContext());
        b2Var.setId(R.id.btn_send);
        b2Var.setTextSize(1, 15.0f);
        b2Var.setTypeface(o.i());
        b2Var.setTextColor(j.L(R.id.theme_color_textNeutral));
        this.S.c(b2Var, R.id.theme_color_textNeutral);
        p0.c0(b2Var, w.i1(R.string.SendSticker).toUpperCase());
        b2Var.setOnClickListener(aVar2);
        yd.d.i(b2Var);
        float f10 = 12.0f;
        int i10 = a0.i(z10 ? 12.0f : 16.0f);
        int i11 = a0.i(s10 ? 12.0f : 16.0f);
        int i12 = w.G2() ? i11 : i10;
        if (!w.G2()) {
            i10 = i11;
        }
        b2Var.setPadding(i12, 0, i10, 0);
        b2Var.setGravity(17);
        b2Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        if (w.G2()) {
            this.f7352k0.addView(b2Var, 0);
        } else {
            this.f7352k0.addView(b2Var);
        }
        j jVar = this.T;
        if (!(jVar == null || jVar.getStickerOutputChatId() == 0)) {
            b2Var.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public final boolean onLongClick(View view) {
                    boolean h22;
                    h22 = d.this.h2(lVar, view);
                    return h22;
                }
            });
        }
        if (s10) {
            b2 b2Var2 = new b2(getContext());
            b2Var2.setId(R.id.btn_view);
            b2Var2.setTypeface(o.i());
            b2Var2.setTextSize(1, 15.0f);
            b2Var2.setTextColor(j.L(R.id.theme_color_textNeutral));
            p0.c0(b2Var2, w.i1(R.string.ViewPackPreview).toUpperCase());
            this.S.c(b2Var2, R.id.theme_color_textNeutral);
            b2Var2.setOnClickListener(aVar2);
            yd.d.i(b2Var2);
            int i13 = a0.i(w.G2() ? 16.0f : 12.0f);
            if (!w.G2()) {
                f10 = 16.0f;
            }
            b2Var2.setPadding(i13, 0, a0.i(f10), 0);
            b2Var2.setGravity(17);
            b2Var2.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
            if (w.G2()) {
                this.f7352k0.addView(b2Var2, 0);
            } else {
                this.f7352k0.addView(b2Var2);
            }
        }
        this.f7352k0.setAlpha(0.0f);
        addView(this.f7352k0);
        m2(true, true);
    }

    @Override
    public void j6(boolean z10, ae.b bVar) {
        this.S.n(z10);
    }

    public void k2(l lVar, int i10, int i11) {
        k kVar = this.f7357p0;
        if (kVar == null) {
            this.f7357p0 = new k(1, this, f7341u0, 220L, 1.0f);
        } else {
            kVar.l(1.0f);
        }
        this.f7356o0 = 1.0f;
        n2(lVar, true);
        this.f7347f0 = i10;
        this.f7348g0 = i11;
        this.f7357p0.i(0.0f);
    }

    public final void l2(MotionEvent motionEvent, View view) {
        View view2 = this.f7361t0;
        if (view2 != view) {
            if (view2 != null) {
                Y1(motionEvent, view2, 3);
            }
            this.f7361t0 = view;
            if (view != null) {
                Y1(motionEvent, view, 0);
                j0.k(view, false);
            }
        }
    }

    public void m2(boolean z10, boolean z11) {
        LinearLayout linearLayout;
        if (this.f7353l0 != z10) {
            this.f7353l0 = z10;
            float f10 = z10 ? 1.0f : 0.0f;
            if (z11) {
                if (this.f7354m0 == null) {
                    this.f7354m0 = new k(3, this, db.b.f7287b, 100L, this.f7355n0);
                }
                if (f10 == 1.0f && this.f7355n0 == 0.0f) {
                    this.f7354m0.B(db.b.f7291f);
                    this.f7354m0.y(290L);
                } else {
                    this.f7354m0.B(db.b.f7287b);
                    this.f7354m0.y(140L);
                }
                this.f7354m0.i(f10);
                return;
            }
            k kVar = this.f7354m0;
            if (kVar != null) {
                kVar.l(f10);
            }
            setMenuFactor(f10);
            if (f10 == 0.0f && (linearLayout = this.f7352k0) != null) {
                removeView(linearLayout);
                this.f7352k0 = null;
            }
        }
    }

    public final void n2(l lVar, boolean z10) {
        if (lVar.m()) {
            e.o(lVar.d(), true);
        }
        l lVar2 = this.V;
        if (lVar2 != null && lVar2.m()) {
            e.o(this.V.d(), false);
        }
        this.V = lVar;
        if (lVar.p() || this.f7345d0) {
            this.f7344c0 = null;
        } else {
            this.f7344c0 = new ie.v(lVar.a(), -1, this.R);
        }
        i2();
        this.P.G(lVar.h());
        this.N.G(lVar.e());
        this.O.r(lVar.d());
        this.f7346e0 = lVar.b(-1);
        d2();
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 0) {
            setAlpha(Math.max(0.0f, Math.min(1.0f, f10)));
            setAppearFactor(f10);
        } else if (i10 == 1) {
            setReplaceFactor(f10);
        } else if (i10 == 3) {
            setMenuFactor(f10);
        }
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        j2 j2Var;
        LinearLayout linearLayout;
        if (i10 != 0) {
            if (i10 == 3 && f10 == 0.0f && (linearLayout = this.f7352k0) != null) {
                removeView(linearLayout);
                this.f7352k0 = null;
            }
        } else if (f10 == 0.0f) {
            this.N.clear();
            this.P.clear();
            this.O.clear();
            j2 j2Var2 = this.U;
            if (j2Var2 != null) {
                j2Var2.B2();
            }
        } else if (f10 == 1.0f && (j2Var = this.U) != null) {
            j2Var.C2();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        i2();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return true;
        }
        X1();
        return true;
    }

    public void p2(o6 o6Var, l lVar, int i10, int i11, int i12, int i13, boolean z10) {
        this.f7351j0 = o6Var;
        this.f7345d0 = z10;
        this.f7347f0 = i10;
        this.f7348g0 = i11;
        this.f7349h0 = i12;
        this.f7350i0 = i13;
        n2(lVar, false);
    }

    @Override
    public void q0(int i10) {
        ae.k.a(this, i10);
    }

    public void setAppearFactor(float f10) {
        if (this.f7358q0 != f10) {
            this.f7358q0 = f10;
            this.Q.invalidate();
        }
    }

    public void setControllerView(j jVar) {
        this.T = jVar;
    }
}
