package p194nd;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import be.C1357a0;
import be.C1379j0;
import be.C1410y;
import me.C6883g1;
import me.C6957m1;
import me.vkryl.android.widget.FrameLayoutFix;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.loader.C7907b;
import org.thunderdog.challegram.loader.ImageLoader;
import org.thunderdog.challegram.widget.SparseDrawableView;
import p037cb.C2057b;
import p051db.C3950k;
import p067ed.C4183a;
import p082fd.C4403w;
import p108hb.C5064d;
import p108hb.C5069h;
import p139jb.AbstractC5911c;
import p139jb.AbstractRunnableC5910b;
import p156kd.AbstractC6264v;
import p156kd.C6246h;
import p156kd.C6257p;
import p168ld.C6496e;
import p168ld.RunnableC6507m;
import p194nd.C7480p;
import p194nd.RunnableC7495r1;
import p209od.C7856c;
import p225pd.C8112b;
import p239qd.C8328e;
import p350yd.C10536ab;

public class RunnableC7470o extends ViewGroup implements C7480p.AbstractC7482b, Runnable, C6246h.AbstractC6249c, C6883g1.AbstractC6886c, RunnableC7495r1.AbstractC7496a, AbstractC5911c, C6957m1.AbstractC6968k, C3950k.AbstractC3952b {
    public boolean f23830A0;
    public boolean f23831B0;
    public AbstractC7472b f23832C0;
    public boolean f23833D0;
    public boolean f23834E0;
    public boolean f23835F0;
    public final RunnableC6507m f23838M;
    public final C6257p f23839N;
    public final C6257p f23840O;
    public AbstractC6264v f23841P;
    public AbstractC6264v f23842Q;
    public C7480p f23843R;
    public C7476f f23844S;
    public C7474d f23845T;
    public RunnableC7495r1 f23846U;
    public C7473c f23847V;
    public C7475e f23848W;
    public C8112b f23849a;
    public C7412e f23850a0;
    public float f23851b;
    public boolean f23852b0;
    public final C6257p f23853c;
    public C6957m1.C6963f f23854c0;
    public boolean f23855d0;
    public boolean f23856e0;
    public C7462l1 f23857f0;
    public C3950k f23858g0;
    public boolean f23860i0;
    public float f23861j0;
    public int f23863l0;
    public int f23864m0;
    public int f23865n0;
    public int f23866o0;
    public int f23867p0;
    public int f23868q0;
    public int f23869r0;
    public C3950k f23870s0;
    public float f23871t0;
    public AbstractRunnableC5910b f23872u0;
    public boolean f23873v0;
    public float f23875x0;
    public C3950k f23876y0;
    public float f23877z0;
    public float f23859h0 = 1.0f;
    public float f23862k0 = 1.0f;
    public Runnable f23874w0 = new Runnable() {
        @Override
        public final void run() {
            RunnableC7470o.this.m15927c0();
        }
    };
    public long f23836G0 = -1;
    public long f23837H0 = -1;

    public class C7471a extends AbstractRunnableC5910b {
        public C7471a() {
        }

        @Override
        public void mo1364b() {
            if (RunnableC7470o.this.f23872u0 == this && RunnableC7470o.this.f23849a != null) {
                RunnableC7470o.this.m15897x0(false, 1.0f);
                RunnableC7470o.this.m15918j0();
                RunnableC7470o.this.m15935W();
            }
        }
    }

    public interface AbstractC7472b {
        void mo15892M5(C8112b bVar, boolean z);

        void mo15891U4(C8112b bVar, float f);

        void mo15890f1(C8112b bVar, boolean z);

        void mo15889v5(C8112b bVar, boolean z);

        void mo15888z2(C8112b bVar, long j, long j2, float f);
    }

    public class C7473c extends SparseDrawableView {
        public C7473c(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            if (RunnableC7470o.this.f23849a != null && !RunnableC7470o.this.f23835F0 && !RunnableC7470o.this.f23834E0) {
                if (RunnableC7470o.this.f23849a.m13517a0()) {
                    RunnableC7470o.this.f23849a.m13507f0();
                } else {
                    RunnableC7470o.this.f23849a.m13484r(this, canvas, RunnableC7470o.this.f23842Q.getLeft(), RunnableC7470o.this.f23842Q.getTop(), RunnableC7470o.this.f23842Q.getRight(), RunnableC7470o.this.f23842Q.getBottom());
                }
            }
        }
    }

    public class C7474d extends View {
        public C7474d(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            if (RunnableC7470o.this.f23849a != null && RunnableC7470o.this.f23862k0 != 0.0f) {
                if (RunnableC7470o.this.f23859h0 != 0.0f) {
                    boolean z = true;
                    boolean z2 = RunnableC7470o.this.f23851b != 0.0f;
                    if (z2) {
                        canvas.save();
                    }
                    float max = Math.max(0.0f, Math.min(1.0f, RunnableC7470o.this.f23859h0));
                    if (RunnableC7470o.this.f23857f0 == null || max >= 1.0f) {
                        z = false;
                    }
                    if (z) {
                        float f = 1.0f - max;
                        int i = (int) ((RunnableC7470o.this.f23857f0.f23780g + RunnableC7470o.this.f23869r0) * f);
                        canvas.save();
                        canvas.clipRect(RunnableC7470o.this.f23842Q.getLeft() + ((int) ((RunnableC7470o.this.f23857f0.f23778e + RunnableC7470o.this.f23869r0) * f)), RunnableC7470o.this.f23842Q.getTop() + ((int) ((RunnableC7470o.this.f23857f0.f23779f + RunnableC7470o.this.f23868q0) * f)), RunnableC7470o.this.f23842Q.getRight() - i, RunnableC7470o.this.f23842Q.getBottom() - ((int) ((RunnableC7470o.this.f23857f0.f23781h + RunnableC7470o.this.f23868q0) * f)));
                    }
                    if (!RunnableC7470o.this.f23834E0 || !RunnableC7470o.this.f23833D0) {
                        if (RunnableC7470o.this.f23842Q.mo20247c0()) {
                            if (RunnableC7470o.this.f23841P.mo20247c0()) {
                                RunnableC7470o.this.f23840O.draw(canvas);
                            }
                            RunnableC7470o.this.f23841P.draw(canvas);
                        } else if (RunnableC7470o.this.f23858g0 != null) {
                            RunnableC7470o.this.f23858g0.m29546i(1.0f);
                            RunnableC7470o.this.f23858g0 = null;
                        }
                        RunnableC7470o.this.f23842Q.draw(canvas);
                    } else if (RunnableC7470o.this.f23858g0 != null) {
                        RunnableC7470o.this.f23858g0.m29546i(1.0f);
                        RunnableC7470o.this.f23858g0 = null;
                    }
                    if (z) {
                        canvas.restore();
                    }
                    if (z2) {
                        canvas.restore();
                    }
                } else if (RunnableC7470o.this.f23858g0 == null) {
                } else {
                    if ((RunnableC7470o.this.f23834E0 && RunnableC7470o.this.f23833D0) || !RunnableC7470o.this.f23842Q.mo20247c0()) {
                        RunnableC7470o.this.f23858g0.m29546i(1.0f);
                        RunnableC7470o.this.f23858g0 = null;
                    }
                }
            }
        }
    }

    public class C7475e extends ViewGroup {
        public C7475e(Context context) {
            super(context);
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            int i7;
            int i8;
            int childCount = getChildCount();
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int i9 = RunnableC7470o.this.f23866o0 - (RunnableC7470o.this.f23865n0 * 2);
            int i10 = RunnableC7470o.this.f23867p0 - RunnableC7470o.this.f23864m0;
            if (RunnableC7470o.this.f23849a == null) {
                i6 = 0;
                i5 = 0;
            } else if (!RunnableC7470o.this.f23849a.m13491n0() || !RunnableC7470o.this.f23849a.m13497k0()) {
                i6 = RunnableC7470o.this.f23849a.m13519Z();
                i5 = RunnableC7470o.this.f23849a.m13569A();
            } else {
                i6 = RunnableC7470o.this.f23849a.m13569A();
                i5 = RunnableC7470o.this.f23849a.m13519Z();
            }
            if (i6 == 0 || i5 == 0) {
                i8 = i9;
                i7 = i10;
            } else {
                float f = i6;
                float f2 = i5;
                float min = Math.min(i9 / f, i10 / f2);
                i8 = (int) (f * min);
                i7 = (int) (f2 * min);
            }
            int i11 = RunnableC7470o.this.f23865n0 + (i9 / 2);
            int i12 = i10 / 2;
            int i13 = i8 / 2;
            int i14 = i11 - i13;
            int i15 = i11 + i13;
            int i16 = i7 / 2;
            int i17 = i12 - i16;
            int i18 = i12 + i16;
            for (int i19 = 0; i19 < childCount; i19++) {
                View childAt = getChildAt(i19);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams == null || layoutParams.width != -2 || layoutParams.height != -2 || RunnableC7470o.this.f23852b0) {
                    childAt.layout(0, 0, measuredWidth, measuredHeight);
                } else {
                    childAt.layout(i14, i17, i15, i18);
                }
            }
            if (RunnableC7470o.this.f23830A0) {
                RunnableC7470o.this.f23830A0 = false;
                RunnableC7470o.this.f23876y0.m29546i(0.0f);
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            int i3;
            int i4;
            setMeasuredDimension(i, i2);
            int childCount = getChildCount();
            int i5 = RunnableC7470o.this.f23866o0 - (RunnableC7470o.this.f23865n0 * 2);
            int i6 = RunnableC7470o.this.f23867p0 - RunnableC7470o.this.f23864m0;
            if (RunnableC7470o.this.f23849a == null) {
                i4 = 0;
                i3 = 0;
            } else if (!RunnableC7470o.this.f23849a.m13491n0() || !RunnableC7470o.this.f23849a.m13497k0()) {
                i4 = RunnableC7470o.this.f23849a.m13519Z();
                i3 = RunnableC7470o.this.f23849a.m13569A();
            } else {
                i4 = RunnableC7470o.this.f23849a.m13569A();
                i3 = RunnableC7470o.this.f23849a.m13519Z();
            }
            if (!(i4 == 0 || i3 == 0)) {
                float f = i4;
                float f2 = i3;
                float min = Math.min(i5 / f, i6 / f2);
                i5 = (int) (f * min);
                i6 = (int) (f2 * min);
            }
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams != null && layoutParams.width == -2 && layoutParams.height == -2) {
                    measureChild(childAt, View.MeasureSpec.makeMeasureSpec(i5, Log.TAG_TDLIB_OPTIONS), View.MeasureSpec.makeMeasureSpec(i6, Log.TAG_TDLIB_OPTIONS));
                } else {
                    measureChild(childAt, i, i2);
                }
            }
        }
    }

    public class C7476f extends View {
        public float f23882a;

        public C7476f(Context context) {
            super(context);
        }

        public void m15887a(float f) {
            if (this.f23882a != f) {
                this.f23882a = f;
                invalidate();
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            if (RunnableC7470o.this.f23842Q != null && RunnableC7470o.this.f23862k0 != 0.0f && RunnableC7470o.this.f23859h0 != 0.0f) {
                canvas.drawRect(RunnableC7470o.this.f23842Q.getLeft(), RunnableC7470o.this.f23842Q.getTop(), RunnableC7470o.this.f23842Q.getRight(), RunnableC7470o.this.f23842Q.getBottom(), C1410y.m37042g(C5064d.m24131b((int) (this.f23882a * 255.0f), RunnableC7470o.this.f23852b0 ? -1 : 0)));
            }
        }
    }

    public RunnableC7470o(Context context) {
        super(context);
        this.f23843R = new C7480p(context, this, this);
        C7474d dVar = new C7474d(context);
        this.f23845T = dVar;
        dVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        C6257p pVar = new C6257p(this.f23845T, 0);
        this.f23853c = pVar;
        pVar.m20821F();
        this.f23838M = new RunnableC6507m(this.f23845T);
        C6257p pVar2 = new C6257p(this.f23845T, 0);
        this.f23839N = pVar2;
        pVar2.m20821F();
        C6257p pVar3 = new C6257p(this.f23845T, 0);
        this.f23840O = pVar3;
        pVar3.m20821F();
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        frameLayoutFix.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        frameLayoutFix.addView(this.f23845T);
        this.f23842Q = pVar;
        this.f23841P = pVar2;
        addView(frameLayoutFix);
        C7476f fVar = new C7476f(context);
        this.f23844S = fVar;
        fVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(this.f23844S);
        C7473c cVar = new C7473c(context);
        this.f23847V = cVar;
        cVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(this.f23847V);
        C7412e eVar = new C7412e(context);
        this.f23850a0 = eVar;
        eVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(this.f23850a0);
    }

    public void m15912p0(C8112b bVar, C6246h hVar) {
        C8112b bVar2 = this.f23849a;
        if (bVar2 == bVar) {
            this.f23839N.m20820G(bVar2.m13559F());
            this.f23853c.m20820G(hVar);
        }
    }

    public void m15911q0(final C8112b bVar, final C6246h hVar, boolean z, Bitmap bitmap) {
        C1379j0.m37337d0(new Runnable() {
            @Override
            public final void run() {
                RunnableC7470o.this.m15912p0(bVar, hVar);
            }
        });
    }

    public void m15909r0(C6246h hVar) {
        C8112b bVar = this.f23849a;
        if (bVar != null && bVar.m13549K() == hVar && this.f23846U != null) {
            m15899w0(true);
        }
    }

    public void m15907s0() {
        RunnableC7495r1 r1Var = this.f23846U;
        if (r1Var != null) {
            r1Var.m15786X(null);
        }
    }

    private void setCanSeek(boolean z) {
        AbstractC7472b bVar = this.f23832C0;
        if (bVar != null) {
            bVar.mo15892M5(this.f23849a, z);
        }
    }

    private void setImageRadius(int i) {
        AbstractC6264v vVar = this.f23842Q;
        if (vVar instanceof C6257p) {
            ((C6257p) vVar).mo20260D0(i);
        }
        AbstractC6264v vVar2 = this.f23841P;
        if (vVar2 instanceof C6257p) {
            ((C6257p) vVar2).mo20260D0(i);
        }
        this.f23840O.mo20260D0(i);
    }

    private void setPreviewOverlayFactor(float f) {
        if (this.f23871t0 != f) {
            this.f23871t0 = f;
            this.f23847V.setAlpha(1.0f - f);
            this.f23847V.invalidate();
        }
    }

    private void setRotateFactor(float f) {
        if (this.f23877z0 != f) {
            this.f23877z0 = f;
            m15924e0();
        }
    }

    private void setVideoReady(boolean z) {
        if (this.f23833D0 != z) {
            this.f23833D0 = z;
            m15913o0();
        }
    }

    public void m15968A0() {
        RunnableC7495r1 r1Var = this.f23846U;
        if (r1Var != null) {
            r1Var.m15783i();
        }
    }

    public void m15966B0() {
        m15956G0(true, true);
        RunnableC7495r1 r1Var = this.f23846U;
        if (r1Var != null) {
            r1Var.m15775z();
        }
    }

    public final void m15964C0() {
        if (this.f23846U == null) {
            C7475e eVar = new C7475e(getContext());
            this.f23848W = eVar;
            eVar.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
            RunnableC7495r1 r1Var = new RunnableC7495r1(getContext(), this.f23848W, 0);
            this.f23846U = r1Var;
            r1Var.m15793O();
            this.f23846U.m15778v(this.f23852b0);
            this.f23846U.m15797G(this);
            this.f23846U.m15796H(this);
            this.f23834E0 = true;
            addView(this.f23848W, 0);
            m15926d0(false);
            return;
        }
        m15899w0(true);
    }

    public final void m15962D0() {
        m15956G0(false, false);
        this.f23835F0 = false;
        this.f23833D0 = false;
        this.f23836G0 = -1L;
        this.f23837H0 = -1L;
    }

    public void m15960E0(float f) {
        RunnableC7495r1 r1Var = this.f23846U;
        if (r1Var != null) {
            r1Var.m15798F(f);
        }
    }

    public void m15958F0() {
        this.f23855d0 = true;
    }

    public final void m15956G0(boolean z, boolean z2) {
        if (this.f23834E0 != z) {
            this.f23834E0 = z;
            if (z) {
                m15964C0();
                RunnableC7495r1 r1Var = this.f23846U;
                if (r1Var != null) {
                    r1Var.m15786X(this.f23849a);
                }
                AbstractC7472b bVar = this.f23832C0;
                if (bVar != null) {
                    bVar.mo15890f1(this.f23849a, this.f23835F0);
                    return;
                }
                return;
            }
            m15913o0();
            this.f23850a0.m16504e(false, false);
            if (z2) {
                C1379j0.m37337d0(new Runnable() {
                    @Override
                    public final void run() {
                        RunnableC7470o.this.m15907s0();
                    }
                });
                return;
            }
            RunnableC7495r1 r1Var2 = this.f23846U;
            if (r1Var2 != null) {
                r1Var2.m15786X(null);
            }
        }
    }

    public void m15954H0(C8112b bVar, boolean z, int i, float f) {
        C8112b bVar2 = this.f23849a;
        if (bVar2 != bVar) {
            if (bVar2 != null) {
                m15928b0();
                this.f23849a.m13488p(this.f23847V);
                this.f23849a.m13488p(this.f23845T);
                if ((this.f23852b0 && this.f23849a.m13491n0()) || (z && !this.f23849a.m13507f0() && !this.f23849a.m13491n0())) {
                    this.f23849a.m13481s0();
                }
            }
            this.f23849a = bVar;
            this.f23850a0.setProgressVisibleInstant(false);
            if (m15895y0()) {
                C1379j0.m37336e(this.f23874w0);
                m15927c0();
            } else {
                C1379j0.m37335e0(this.f23874w0, 350L);
            }
            this.f23843R.m15860w();
            m15962D0();
            m15946L0();
            m15926d0(false);
            C6246h hVar = null;
            if (bVar == null) {
                this.f23839N.m20820G(null);
                this.f23840O.m20820G(null);
                this.f23838M.m20232r(null);
                this.f23853c.m20820G(null);
                return;
            }
            this.f23840O.m20820G(bVar.m13567B());
            if (!bVar.m13491n0() || !bVar.m13509e0() || !bVar.m13507f0() || z) {
                C6257p pVar = this.f23839N;
                this.f23841P = pVar;
                if (z) {
                    bVar.m13507f0();
                    if (!bVar.m13491n0()) {
                        hVar = bVar.m13531T(i, true);
                    }
                    if (hVar != null) {
                        m15917k0(1.0f);
                        this.f23839N.m20820G(hVar);
                    } else {
                        this.f23839N.m20820G(bVar.m13559F());
                    }
                } else if (!this.f23855d0) {
                    if (this.f23859h0 != 0.0f || !bVar.m13511d0()) {
                        hVar = bVar.m13559F();
                    }
                    pVar.m20820G(hVar);
                }
            } else {
                RunnableC6507m mVar = this.f23838M;
                this.f23841P = mVar;
                mVar.m20232r(bVar.m13537Q());
            }
            this.f23842Q = bVar.m13511d0() ? this.f23838M : this.f23853c;
            if (!this.f23852b0 || bVar.m13559F() == null) {
                m15897x0(z, f);
            }
            m15903u0();
            bVar.m13510e(this.f23845T, this, this);
            if (!z) {
                m15918j0();
            }
        }
    }

    public void m15952I0(int i, int i2, int i3) {
        RunnableC7495r1 r1Var;
        if (this.f23865n0 != i || this.f23863l0 != i2 || this.f23864m0 != i3) {
            this.f23865n0 = i;
            this.f23863l0 = i2;
            this.f23864m0 = i3;
            m15903u0();
            m15914n0();
            C8112b bVar = this.f23849a;
            if (bVar != null && bVar.m13491n0() && this.f23834E0 && (r1Var = this.f23846U) != null) {
                r1Var.m15800D();
            }
        }
    }

    public final void m15950J0(float f, boolean z) {
        C8112b bVar;
        float f2 = this.f23875x0;
        if (f2 != f || !z) {
            this.f23875x0 = f;
            boolean z2 = f2 != f;
            if (z && C5069h.m24083k(f + 90.0f, 360.0f) == f2) {
                C3950k kVar = this.f23876y0;
                if (kVar == null) {
                    this.f23876y0 = new C3950k(0, this, C2057b.f7280b, 180L, 1.0f);
                } else {
                    kVar.m29543l(1.0f);
                }
                this.f23877z0 = 1.0f;
                m15924e0();
                this.f23830A0 = false;
                if (z2) {
                    m15901v0(true);
                    this.f23845T.invalidate();
                    if (!(this.f23846U == null || (bVar = this.f23849a) == null || bVar.m13519Z() / this.f23849a.m13569A() == 1.0f)) {
                        this.f23830A0 = true;
                        this.f23846U.m15800D();
                    }
                }
                if (!this.f23830A0) {
                    this.f23876y0.m29546i(0.0f);
                }
            } else if (z2) {
                C3950k kVar2 = this.f23876y0;
                if (kVar2 != null) {
                    kVar2.m29543l(1.0f);
                }
                this.f23830A0 = false;
                this.f23877z0 = 0.0f;
                m15924e0();
                m15901v0(true);
                this.f23845T.invalidate();
            } else {
                m15924e0();
            }
        }
    }

    public void m15948K0() {
        C8112b bVar;
        if (this.f23846U != null && (bVar = this.f23849a) != null && bVar.m13491n0()) {
            this.f23849a.m13507f0();
            if (this.f23849a.m13523X() == 4) {
                this.f23846U.m15791Q(this.f23849a.m13487p0());
            }
        }
    }

    public final void m15946L0() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (!(childAt == null || childAt == this.f23847V)) {
                this.f23843R.m15883C(this, childAt);
            }
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            setRotateFactor(f);
        } else if (i == 1) {
            setPreviewOverlayFactor(f);
        }
    }

    public final void m15935W() {
        if (this.f23870s0 == null) {
            this.f23870s0 = new C3950k(1, this, C2057b.f7280b, 120L, this.f23871t0);
        }
        C8112b bVar = this.f23849a;
        if (bVar != null) {
            bVar.m13507f0();
        }
        m15917k0(0.0f);
    }

    public void m15934X() {
        this.f23838M.mo20246f();
        this.f23853c.mo20246f();
        this.f23839N.mo20246f();
        this.f23840O.mo20246f();
    }

    public void m15933Y(boolean z) {
        C8112b bVar = this.f23849a;
        if (bVar != null && bVar.m13491n0()) {
            if (!z || this.f23849a.m13509e0()) {
                this.f23849a.m13507f0();
                if (this.f23849a.m13499j0() && !this.f23856e0) {
                    if (!this.f23849a.m13509e0()) {
                        C10536ab.m4667o1().m4636w2().m7119A0(8);
                    }
                    if (C4183a.f14095m) {
                        m15956G0(true, true);
                        RunnableC7495r1 r1Var = this.f23846U;
                        if (r1Var != null && !r1Var.m15776y()) {
                            this.f23846U.m15802A();
                        }
                        this.f23849a.m13471x0(1.0f);
                        return;
                    }
                    C7389v0.m16603n2(C1379j0.m37310r(getContext()).m14551P1().m9762F(), this.f23849a.m13543N());
                }
            }
        }
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        if (i == 0) {
            RunnableC7495r1 r1Var = this.f23846U;
            if (r1Var != null) {
                r1Var.m15800D();
            }
            m15950J0(this.f23875x0, false);
        }
    }

    public boolean m15932Z(boolean z) {
        return getVisibility() == 0 && (getParent() instanceof C7401b0) && ((C7401b0) getParent()).m16522h2(z) && this.f23849a != null && this.f23859h0 == 1.0f;
    }

    @Override
    public void mo15931a(final C6246h hVar, int i, boolean z) {
        C1379j0.m37337d0(new Runnable() {
            @Override
            public final void run() {
                RunnableC7470o.this.m15909r0(hVar);
            }
        });
    }

    public boolean m15930a0() {
        if (!m15932Z(false) || getVisibility() != 0 || this.f23849a == null || getAlpha() != 1.0f) {
            return false;
        }
        this.f23849a.m13507f0();
        return this.f23859h0 == 1.0f && this.f23851b == 0.0f && ((C7401b0) getParent()).m16537O1(this);
    }

    @Override
    public void mo4501a3() {
        m15920h0();
    }

    @Override
    public void mo15929b(TdApi.File file, int i) {
        C8112b bVar;
        C8112b bVar2 = this.f23849a;
        boolean z = true;
        if (bVar2 == null || !bVar2.m13491n0()) {
            C8112b bVar3 = this.f23849a;
            if (bVar3 == null || !bVar3.m13491n0() || i != 2) {
                z = false;
            }
            setCanSeek(z);
        } else {
            setCanSeek(true);
        }
        if (i != 2) {
            return;
        }
        if (this.f23852b0 || ((bVar = this.f23849a) != null && bVar.m13517a0())) {
            m15933Y(false);
        }
    }

    public final void m15928b0() {
        m15917k0(0.0f);
        AbstractRunnableC5910b bVar = this.f23872u0;
        if (bVar != null) {
            bVar.m21858c();
            this.f23872u0 = null;
        }
    }

    @Override
    public void mo15856c(Rect rect) {
        int i;
        int i2;
        int width = this.f23842Q.getWidth();
        int height = this.f23842Q.getHeight();
        C8112b bVar = this.f23849a;
        if (bVar == null) {
            i2 = 0;
            i = 0;
        } else if (!bVar.m13515b0() || !this.f23849a.m13491n0()) {
            i2 = this.f23849a.m13519Z();
            i = this.f23849a.m13569A();
        } else {
            i2 = this.f23849a.m13569A();
            i = this.f23849a.m13519Z();
        }
        if (!(i2 == 0 || i == 0)) {
            float f = i2;
            float f2 = i;
            float min = Math.min(width / f, height / f2);
            i2 = (int) (f * min);
            i = (int) (f2 * min);
        }
        int i3 = i2 / 2;
        rect.left = this.f23842Q.mo20258I0() - i3;
        int i4 = i / 2;
        rect.top = this.f23842Q.mo20228y0() - i4;
        rect.right = this.f23842Q.mo20258I0() + i3;
        rect.bottom = this.f23842Q.mo20228y0() + i4;
    }

    public final void m15927c0() {
        C8112b bVar;
        boolean y0 = m15895y0();
        if (this.f23873v0 != y0) {
            this.f23873v0 = y0;
            if (y0 && (bVar = this.f23849a) != null && bVar.m13537Q() != null && !(getParent() instanceof C7401b0)) {
                C6496e.m20343L(this.f23849a.m13537Q());
            }
            C6496e.m20327n(y0 ? 1 : -1);
        }
    }

    @Override
    public void mo15774d(boolean z) {
        C7412e eVar = this.f23850a0;
        C8112b bVar = this.f23849a;
        eVar.m16504e(z, bVar != null && bVar.m13472x().m18677E());
    }

    public void m15926d0(boolean z) {
        C8112b bVar = this.f23849a;
        if (bVar != null) {
            m15950J0(bVar.m13491n0() ? this.f23849a.m13561E() : 0.0f, z);
        }
    }

    @Override
    public boolean mo15925e(C6883g1 g1Var, View view, TdApi.File file, long j) {
        C8112b bVar = this.f23849a;
        if (bVar == null || !bVar.m13491n0()) {
            return false;
        }
        if (!C4183a.f14095m) {
            if (this.f23849a.m13507f0()) {
                C7389v0.m16603n2(C1379j0.m37310r(getContext()).m14551P1().m9762F(), this.f23849a.m13543N());
            }
            return true;
        } else if ((this.f23835F0 || this.f23834E0 || this.f23849a.m13517a0()) && view == getParent()) {
            return false;
        } else {
            m15956G0(true, true);
            RunnableC7495r1 r1Var = this.f23846U;
            if (r1Var != null) {
                r1Var.m15802A();
            }
            return true;
        }
    }

    public final void m15924e0() {
        int i;
        int i2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        C8112b bVar = this.f23849a;
        if (bVar != null) {
            if (!bVar.m13491n0() ? !this.f23849a.m13501i0() : !this.f23849a.m13515b0()) {
                i2 = this.f23849a.m13519Z();
                i = this.f23849a.m13569A();
            } else {
                i2 = this.f23849a.m13569A();
                i = this.f23849a.m13519Z();
            }
            if (i2 != 0 && i != 0) {
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                if (!this.f23849a.m13491n0() || !this.f23849a.m13497k0() ? measuredWidth <= measuredHeight : measuredWidth >= measuredHeight) {
                    f2 = i2;
                    f = i;
                } else {
                    f2 = i;
                    f = i2;
                }
                float f6 = this.f23877z0;
                float f7 = 90.0f * f6;
                float f8 = (((f2 / f) - 1.0f) * f6) + 1.0f;
                this.f23845T.setRotation(f7);
                this.f23845T.setScaleX(f8);
                this.f23845T.setScaleY(f8);
                if (measuredWidth > measuredHeight) {
                    f3 = i;
                    f4 = i2;
                } else {
                    f3 = i2;
                    f4 = i;
                }
                RunnableC7495r1 r1Var = this.f23846U;
                View x = r1Var != null ? r1Var.m15777x() : null;
                if (x != null) {
                    x.setRotation(this.f23875x0 + f7);
                    if (this.f23849a.m13501i0()) {
                        f5 = (((f4 / f3) - 1.0f) * (1.0f - this.f23877z0)) + 1.0f;
                    } else {
                        f5 = (((f3 / f4) - 1.0f) * this.f23877z0) + 1.0f;
                    }
                    x.setScaleX(f5);
                    x.setScaleY(f5);
                }
            }
        }
    }

    @Override
    public void mo15923f(TdApi.File file, float f) {
        float f2;
        AbstractC7472b bVar = this.f23832C0;
        if (bVar != null) {
            int i = file.expectedSize;
            if (i != 0) {
                TdApi.LocalFile localFile = file.local;
                f2 = (localFile.downloadOffset + localFile.downloadedPrefixSize) / i;
            } else {
                f2 = 0.0f;
            }
            bVar.mo15891U4(this.f23849a, f2);
        }
    }

    public void m15922f0(boolean z) {
        C8112b bVar;
        RunnableC7495r1 r1Var = this.f23846U;
        if (r1Var != null && r1Var.m15781m()) {
            this.f23837H0 = -1L;
            this.f23836G0 = -1L;
        }
        if (z && (bVar = this.f23849a) != null && bVar.m13491n0() && !this.f23849a.m13509e0()) {
            final C8112b bVar2 = this.f23849a;
            final C6246h S = bVar2.m13533S(true);
            ImageLoader.m14391e().m14389g(S, new C7907b.AbstractC7910c() {
                @Override
                public final void mo14347b(boolean z2, Bitmap bitmap) {
                    RunnableC7470o.this.m15911q0(bVar2, S, z2, bitmap);
                }
            });
        }
    }

    @Override
    public void mo15855g(float f, float f2) {
        AbstractC6264v vVar = this.f23842Q;
        if ((vVar instanceof C6257p) && !((C6257p) vVar).m20793x()) {
            vVar = this.f23839N;
        }
        C8112b bVar = this.f23849a;
        int Z = bVar != null ? bVar.m13519Z() : 0;
        C8112b bVar2 = this.f23849a;
        if (vVar.mo20240k1(f, f2, Z, bVar2 != null ? bVar2.m13569A() : 0) && m15932Z(false)) {
            ((C7401b0) getParent()).m16517n2(f, f2);
        }
    }

    public final void m15921g0() {
        int i = Math.abs(this.f23851b) == 1.0f ? 4 : 0;
        if (getVisibility() != i) {
            setVisibility(i);
        }
    }

    @Override
    public void mo9253g4(C6957m1.C6963f fVar) {
        if (this.f23855d0) {
            m15897x0(false, 1.0f);
        }
    }

    public C7480p getDetector() {
        return this.f23843R;
    }

    public float getFactor() {
        return this.f23851b;
    }

    public C6257p getImageReceiver() {
        AbstractC6264v vVar = this.f23842Q;
        C6257p pVar = this.f23853c;
        if (vVar == pVar) {
            return pVar;
        }
        return null;
    }

    public C8112b getMedia() {
        return this.f23849a;
    }

    public AbstractC6264v getReceiver() {
        return this.f23842Q;
    }

    public long getTimeNow() {
        return this.f23836G0;
    }

    public long getTimeTotal() {
        return this.f23837H0;
    }

    public float getZoomFactor() {
        return this.f23843R.m15872k();
    }

    @Override
    public boolean mo15854h() {
        if (!m15930a0()) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        C1379j0.m37310r(getContext()).m14463m3(4, true);
        ((C7401b0) getParent()).m16536Q1();
        this.f23831B0 = true;
        return true;
    }

    public void m15920h0() {
        setMedia(null);
        this.f23850a0.mo4501a3();
        this.f23853c.mo20250Z();
        this.f23838M.mo20250Z();
        this.f23839N.mo20250Z();
        this.f23840O.mo20250Z();
        RunnableC7495r1 r1Var = this.f23846U;
        if (r1Var != null) {
            r1Var.m15780n();
        }
        this.f23856e0 = true;
    }

    @Override
    public void mo15773i() {
        this.f23850a0.m16504e(false, false);
    }

    public void m15919i0() {
        this.f23838M.mo20248b();
        this.f23853c.mo20248b();
        this.f23839N.mo20248b();
        this.f23840O.mo20248b();
    }

    @Override
    public void mo15853j() {
        getParent().requestDisallowInterceptTouchEvent(false);
        C1379j0.m37310r(getContext()).m14463m3(4, false);
    }

    public final void m15918j0() {
        C8112b bVar = this.f23849a;
        if (bVar != null) {
            C6883g1 x = bVar.m13472x();
            boolean z = true;
            if (x != null) {
                x.m18608q0(true);
            }
            this.f23849a.m13514c(this.f23847V);
            C8112b bVar2 = this.f23849a;
            if (bVar2.m13491n0() && !this.f23852b0) {
                z = false;
            }
            bVar2.m13486q(z);
            if (x != null) {
                x.m18608q0(false);
            }
        }
    }

    @Override
    public void mo15772k(boolean z) {
        if (this.f23835F0 != z) {
            this.f23835F0 = z;
            m15913o0();
            AbstractC7472b bVar = this.f23832C0;
            if (bVar != null) {
                bVar.mo15889v5(this.f23849a, z);
            }
        }
    }

    public final void m15917k0(float f) {
        C3950k kVar = this.f23870s0;
        if (kVar != null) {
            kVar.m29543l(f);
        }
        setPreviewOverlayFactor(f);
    }

    @Override
    public boolean mo15852l() {
        return getParent() != null && ((C7401b0) getParent()).m16538N1(this);
    }

    public boolean m15916l0() {
        return !this.f23842Q.mo20247c0() || !this.f23841P.mo20247c0() || !this.f23838M.mo20247c0() || !this.f23840O.mo20247c0() || this.f23834E0;
    }

    @Override
    public boolean mo15851m(float f, float f2) {
        if (!((C7401b0) getParent()).m16539M1() || this.f23849a == null || !m15930a0()) {
            return false;
        }
        if (!this.f23849a.m13491n0()) {
            return true;
        }
        int i = C1357a0.m37544i(28.0f);
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        return f < ((float) (measuredWidth - i)) || f > ((float) (measuredWidth + i)) || f2 < ((float) (measuredHeight - i)) || f2 > ((float) (measuredHeight + i));
    }

    public void m15915m0(C8112b bVar) {
        if (this.f23849a == bVar && bVar != null) {
            if (bVar.m13511d0()) {
                this.f23838M.m20232r(bVar.m13537Q());
            } else {
                this.f23853c.m20820G(bVar.m13533S(true));
            }
        }
    }

    @Override
    public void mo9213m6(C6957m1.C6963f fVar) {
    }

    @Override
    public void mo15850n(Rect rect) {
        rect.left = 0;
        rect.top = 0;
        rect.right = getMeasuredWidth();
        rect.bottom = getMeasuredHeight();
    }

    public final void m15914n0() {
        this.f23844S.invalidate();
        this.f23847V.invalidate();
        this.f23845T.invalidate();
    }

    @Override
    public void mo15849o() {
        m15946L0();
    }

    public final void m15913o0() {
        this.f23845T.invalidate();
        this.f23847V.invalidate();
    }

    @Override
    public void mo9198o1(C6957m1.C6963f fVar) {
        if (!this.f23855d0) {
            m15897x0(false, 1.0f);
        }
        m15933Y(false);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = motionEvent.getAction() == 0;
        if (z) {
            this.f23831B0 = false;
        }
        if (m15932Z(z)) {
            this.f23843R.m15865r(motionEvent);
        }
        return this.f23831B0 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int childCount = getChildCount();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i13 = this.f23866o0 - (this.f23865n0 * 2);
        int i14 = this.f23867p0 - this.f23864m0;
        C8112b bVar = this.f23849a;
        if (bVar == null) {
            i6 = 0;
            i5 = 0;
        } else if (!bVar.m13491n0() || !this.f23849a.m13497k0()) {
            i6 = this.f23849a.m13519Z();
            i5 = this.f23849a.m13569A();
        } else {
            i6 = this.f23849a.m13569A();
            i5 = this.f23849a.m13519Z();
        }
        if (i6 == 0 || i5 == 0) {
            i10 = i13;
            i8 = i10;
            i9 = i14;
            i7 = i9;
        } else {
            C7856c v = this.f23849a.m13476v();
            if (v == null || v.m14817m()) {
                i12 = i6;
                i11 = i5;
            } else {
                double g = v.m14823g() - v.m14826d();
                double b = v.m14828b() - v.m14821i();
                i12 = (int) (i6 * g);
                i11 = (int) (i5 * b);
            }
            float f = i13;
            float f2 = i6;
            float f3 = i14;
            float f4 = i5;
            float min = Math.min(f / f2, f3 / f4);
            i10 = (int) (f2 * min);
            i9 = (int) (f4 * min);
            float f5 = i12;
            float f6 = i11;
            float min2 = Math.min(f / f5, f3 / f6);
            i8 = (int) (f5 * min2);
            i7 = (int) (f6 * min2);
        }
        int i15 = this.f23865n0 + (i13 / 2);
        int i16 = i14 / 2;
        int i17 = i10 / 2;
        int i18 = i15 - i17;
        int i19 = i17 + i15;
        int i20 = i9 / 2;
        int i21 = i16 - i20;
        int i22 = i20 + i16;
        int i23 = i8 / 2;
        int i24 = i7 / 2;
        for (int i25 = 0; i25 < childCount; i25++) {
            View childAt = getChildAt(i25);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (childAt instanceof C8328e) {
                ((C8328e) childAt).m12813t(i15, i16);
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else if (layoutParams == null || layoutParams.width != -2 || layoutParams.height != -2 || this.f23852b0) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else {
                childAt.layout(i18, i21, i19, i22);
            }
        }
        m15946L0();
        m15926d0(false);
    }

    @Override
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (!this.f23852b0 || this.f23849a == null) {
            setMeasuredDimension(i, i2);
            int childCount = getChildCount();
            int i9 = this.f23866o0 - (this.f23865n0 * 2);
            int i10 = this.f23867p0 - this.f23864m0;
            C8112b bVar = this.f23849a;
            if (bVar == null) {
                i4 = 0;
                i3 = 0;
            } else if (!bVar.m13491n0() || !this.f23849a.m13497k0()) {
                i4 = this.f23849a.m13519Z();
                i3 = this.f23849a.m13569A();
            } else {
                i4 = this.f23849a.m13569A();
                i3 = this.f23849a.m13519Z();
            }
            if (i4 == 0 || i3 == 0) {
                i6 = i9;
                i5 = i10;
            } else {
                C7856c v = this.f23849a.m13476v();
                if (v == null || v.m14817m()) {
                    i8 = i4;
                    i7 = i3;
                } else {
                    i8 = (int) (i4 * (v.m14823g() - v.m14826d()));
                    i7 = (int) (i3 * (v.m14828b() - v.m14821i()));
                }
                float f = i9;
                float f2 = i4;
                float f3 = i10;
                float f4 = i3;
                float min = Math.min(f / f2, f3 / f4);
                i9 = (int) (f2 * min);
                i10 = (int) (f4 * min);
                float f5 = i8;
                float f6 = i7;
                float min2 = Math.min(f / f5, f3 / f6);
                i6 = (int) (f5 * min2);
                i5 = (int) (f6 * min2);
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof C8328e) {
                    ((C8328e) childAt).m12811v(i9, i10, i6, i5);
                    measureChild(childAt, i, i2);
                } else {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams != null && layoutParams.width == -2 && layoutParams.height == -2) {
                        measureChild(childAt, View.MeasureSpec.makeMeasureSpec(i9, Log.TAG_TDLIB_OPTIONS), View.MeasureSpec.makeMeasureSpec(i10, Log.TAG_TDLIB_OPTIONS));
                    } else {
                        measureChild(childAt, i, i2);
                    }
                }
            }
            m15946L0();
            m15926d0(false);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2) - (this.f23854c0.m18344B() ? C1357a0.m37544i(56.0f) : 0);
        int z = this.f23854c0.m18303z();
        float Z = this.f23849a.m13519Z();
        float A = this.f23849a.m13569A();
        float min3 = Math.min(size / Z, size2 / A);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(z, (int) (Z * min3)), Log.TAG_TDLIB_OPTIONS);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((int) (A * min3), Log.TAG_TDLIB_OPTIONS);
        setMeasuredDimension(makeMeasureSpec, makeMeasureSpec2);
        m15903u0();
        measureChildren(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = m15932Z(motionEvent.getAction() == 0) && this.f23843R.m15865r(motionEvent);
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            this.f23831B0 = false;
        }
        return z;
    }

    @Override
    public void mo15771p(long j, long j2) {
        this.f23836G0 = j2;
        this.f23837H0 = j;
        AbstractC7472b bVar = this.f23832C0;
        if (bVar != null) {
            bVar.mo15888z2(this.f23849a, j2, j, (float) (j2 / j));
        }
    }

    @Override
    public void mo15770q() {
        setVideoReady(true);
    }

    @Override
    public void run() {
        C3950k kVar = this.f23858g0;
        if (kVar != null) {
            kVar.m29546i(1.0f);
            this.f23858g0 = null;
        }
    }

    @Override
    public void mo9171s6(C6957m1.C6963f fVar) {
        m15966B0();
    }

    public void setBoundForceTouchContext(C6957m1.C6963f fVar) {
        this.f23852b0 = true;
        this.f23854c0 = fVar;
    }

    public void setCallback(AbstractC7472b bVar) {
        this.f23832C0 = bVar;
    }

    public void setDisableAnimations(boolean z) {
        this.f23842Q.mo20252S0(z);
        this.f23841P.mo20252S0(z);
        this.f23840O.mo20252S0(z);
    }

    public void setDisappearing(boolean z) {
        C8112b bVar;
        this.f23860i0 = z;
        if (z) {
            float f = 0.0f;
            if (this.f23835F0 && (bVar = this.f23849a) != null) {
                bVar.m13471x0(0.0f);
            }
            C8112b bVar2 = this.f23849a;
            if (bVar2 != null) {
                f = bVar2.m13478u();
            }
            this.f23861j0 = f;
            m15956G0(false, true);
        }
    }

    public void setFactor(float f) {
        if (this.f23851b != f) {
            this.f23851b = f;
            float f2 = 1.0f;
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            float f3 = i < 0 ? f + 1.0f : 1.0f;
            if (this.f23862k0 != f3) {
                this.f23862k0 = f3;
                this.f23844S.m15887a(f3 == 0.0f ? 0.0f : 1.0f - f3);
                m15913o0();
            }
            if (i < 0) {
                float f4 = (f * 0.25f) + 1.0f;
                setScaleX(f4);
                setScaleY(f4);
                setTranslationX(0.0f);
            } else if (f > 0.0f) {
                setScaleX(1.0f);
                setScaleY(1.0f);
                float f5 = this.f23866o0 * f;
                if (!C4403w.m27986G2()) {
                    f2 = -1.0f;
                }
                setTranslationX((int) (f5 * f2));
            } else {
                setScaleX(1.0f);
                setScaleY(1.0f);
                setTranslationX(0.0f);
            }
            m15921g0();
        }
    }

    public void setMedia(C8112b bVar) {
        m15954H0(bVar, false, 0, 1.0f);
    }

    public void setRevealFactor(float f) {
        C8112b bVar;
        if (this.f23859h0 != f) {
            this.f23859h0 = f;
            if (this.f23849a != null) {
                float d = C5069h.m24090d(f);
                this.f23849a.m13507f0();
                if (!this.f23849a.m13491n0() || !this.f23849a.m13499j0()) {
                    this.f23849a.m13471x0(d);
                } else if (this.f23860i0) {
                    float f2 = this.f23861j0;
                    this.f23849a.m13471x0(f2 + ((1.0f - f2) * (1.0f - d)));
                } else {
                    this.f23849a.m13471x0(1.0f - d);
                }
            }
            m15903u0();
            if (this.f23860i0 && (bVar = this.f23849a) != null && C8112b.m13513c0(bVar.m13523X())) {
                this.f23842Q.setAlpha(Math.max(0.0f, Math.min(1.0f, f)));
            }
            m15914n0();
        }
    }

    public void setSeekProgress(float f) {
        RunnableC7495r1 r1Var = this.f23846U;
        if (r1Var != null) {
            r1Var.m15788U(f);
        }
    }

    public void setTargetAnimator(C3950k kVar) {
        if (!this.f23842Q.mo20247c0()) {
            this.f23858g0 = null;
            kVar.m29546i(1.0f);
            return;
        }
        this.f23858g0 = kVar;
        C1379j0.m37335e0(this, 134L);
    }

    public void setTargetLocation(C7462l1 l1Var) {
        this.f23857f0 = l1Var;
    }

    public void m15905t0(int i, int i2, int i3, int i4, int i5) {
        this.f23866o0 = i4;
        this.f23867p0 = i5;
        this.f23865n0 = i;
        this.f23863l0 = i2;
        this.f23864m0 = i3;
        m15903u0();
    }

    public final void m15903u0() {
        m15901v0(false);
    }

    public final void m15901v0(boolean z) {
        C8112b bVar;
        int i;
        int i2;
        float f;
        float f2;
        float max;
        int i3;
        int i4;
        int i5;
        int i6;
        C8112b bVar2;
        if (!this.f23852b0 || (bVar2 = this.f23849a) == null) {
            C7462l1 l1Var = this.f23857f0;
            if (l1Var == null || this.f23859h0 == 1.0f || (bVar = this.f23849a) == null) {
                AbstractC6264v vVar = this.f23842Q;
                int i7 = this.f23865n0;
                if (!vVar.mo20257K0(i7, this.f23863l0, this.f23866o0 - i7, this.f23867p0 - this.f23864m0) && z) {
                    this.f23842Q.mo20239l();
                }
                AbstractC6264v vVar2 = this.f23841P;
                int i8 = this.f23865n0;
                if (!vVar2.mo20257K0(i8, this.f23863l0, this.f23866o0 - i8, this.f23867p0 - this.f23864m0) && z) {
                    this.f23841P.mo20239l();
                }
                C6257p pVar = this.f23840O;
                int i9 = this.f23865n0;
                if (!pVar.mo20257K0(i9, this.f23863l0, this.f23866o0 - i9, this.f23867p0 - this.f23864m0) && z) {
                    this.f23840O.mo20239l();
                }
                setPivotX(this.f23842Q.mo20258I0());
                setPivotY(this.f23842Q.mo20228y0());
                setImageRadius(0);
                return;
            }
            int i10 = l1Var.f23774a;
            int i11 = l1Var.f23775b;
            int i12 = l1Var.f23776c;
            int i13 = l1Var.f23777d;
            if (!bVar.m13491n0() || !this.f23849a.m13515b0()) {
                i2 = this.f23849a.m13519Z();
                i = this.f23849a.m13569A();
            } else {
                i2 = this.f23849a.m13569A();
                i = this.f23849a.m13519Z();
            }
            this.f23868q0 = 0;
            this.f23869r0 = 0;
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            float f3 = i14;
            float f4 = i15;
            if (Math.max(f3 / i2, f4 / i) != 1.0f) {
                this.f23869r0 = (int) (((((int) (f * max)) - i14) / 2) * Math.max(0.0f, Math.min(1.0f, 1.0f - this.f23859h0)));
                this.f23868q0 = (int) (((((int) (f2 * max)) - i15) / 2) * Math.max(0.0f, Math.min(1.0f, 1.0f - this.f23859h0)));
            }
            float f5 = this.f23859h0;
            if (f5 >= 0.0f) {
                int i16 = this.f23865n0;
                int i17 = this.f23869r0;
                i5 = (i10 + ((int) ((i16 - i10) * f5))) - i17;
                int i18 = this.f23868q0;
                i4 = (i11 + ((int) ((this.f23863l0 - i11) * f5))) - i18;
                i3 = i12 + ((int) (((this.f23866o0 - i16) - i12) * f5)) + i17;
                i6 = i13 + ((int) (((this.f23867p0 - this.f23864m0) - i13) * f5)) + i18;
            } else {
                int a = this.f23857f0.m15999a();
                int b = this.f23857f0.m15998b();
                float f6 = this.f23859h0;
                int i19 = i15 + ((int) (f4 * f6));
                int i20 = (i14 + ((int) (f3 * f6))) / 2;
                int i21 = this.f23869r0;
                i5 = (a - i20) - i21;
                int i22 = i19 / 2;
                int i23 = this.f23868q0;
                i4 = (b - i22) - i23;
                i3 = a + i20 + i21;
                i6 = b + i22 + i23;
            }
            setImageRadius(i2 != i ? 0 : (int) (this.f23857f0.m15996d() * (1.0f - C5069h.m24090d(this.f23859h0))));
            if (!this.f23842Q.mo20257K0(i5, i4, i3, i6) && z) {
                this.f23842Q.mo20239l();
            }
            if (!this.f23841P.mo20257K0(i5, i4, i3, i6) && z) {
                this.f23841P.mo20239l();
            }
            if (!this.f23840O.mo20257K0(i5, i4, i3, i6) && z) {
                this.f23840O.mo20239l();
            }
            setPivotX((i5 + i3) / 2);
            setPivotY((i4 + i6) / 2);
            return;
        }
        int Z = bVar2.m13519Z();
        int A = this.f23849a.m13569A();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f7 = Z;
        float f8 = A;
        float min = Math.min(measuredWidth / f7, measuredHeight / f8);
        int i24 = (int) (f7 * min);
        int i25 = (int) (f8 * min);
        int i26 = (measuredWidth / 2) - (i24 / 2);
        int i27 = i24 + i26;
        int i28 = (measuredHeight / 2) - (i25 / 2);
        int i29 = i25 + i28;
        if (!this.f23841P.mo20257K0(i26, i28, i27, i29) && z) {
            this.f23841P.mo20239l();
        }
        if (!this.f23840O.mo20257K0(i26, i28, i27, i29) && z) {
            this.f23840O.mo20239l();
        }
        if (!this.f23842Q.mo20257K0(i26, i28, i27, i29) && z) {
            this.f23842Q.mo20239l();
        }
        setPivotX((i26 + i27) / 2);
        setPivotY((i28 + i29) / 2);
    }

    public final void m15899w0(boolean z) {
        RunnableC7495r1 r1Var = this.f23846U;
        if (r1Var != null) {
            r1Var.m15800D();
            m15926d0(false);
        }
    }

    public void m15897x0(boolean r7, float r8) {
        throw new UnsupportedOperationException("Method not decompiled: p194nd.RunnableC7470o.m15897x0(boolean, float):void");
    }

    public final boolean m15895y0() {
        C8112b bVar = this.f23849a;
        return bVar != null && bVar.m13491n0() && this.f23849a.m13509e0();
    }

    public void m15893z0() {
        RunnableC7495r1 r1Var = this.f23846U;
        if (r1Var != null) {
            r1Var.m15779r();
        }
    }
}
