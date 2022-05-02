package p239qd;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import be.C1379j0;
import be.C1410y;
import me.vkryl.android.widget.FrameLayoutFix;
import nc.C7389v0;
import org.thunderdog.challegram.Log;
import p156kd.C6253l;
import p194nd.RunnableC7470o;
import p209od.C7856c;
import p225pd.C8111a;
import p239qd.C8328e;
import p254rd.C8431f;
import p254rd.C8434g;
import sd.C8874f;

public class C8328e extends ViewGroup {
    public Bitmap f26957M;
    public C8111a f26958N;
    public C8431f f26959O;
    public C6253l f26960P;
    public int f26961Q;
    public int f26962R;
    public int f26963S;
    public int f26964T;
    public int f26965U;
    public int f26966V;
    public FrameLayoutFix f26967W;
    public C8874f f26968a;
    public C8332c f26969a0;
    public View f26970b;
    public RunnableC8330b f26971b0;
    public C8325c f26972c;
    public int f26973c0;
    public int f26974d0;
    public C7856c f26975e0;
    public boolean f26976f0;
    public int f26977g0;
    public int f26978h0;
    public int f26979i0;
    public int f26980j0;

    public class TextureView$SurfaceTextureListenerC8329a implements TextureView.SurfaceTextureListener {
        public TextureView$SurfaceTextureListenerC8329a() {
        }

        public void m12809b() {
            C8328e.this.f26972c.m12864Q(false, true);
        }

        @Override
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            if (surfaceTexture != null && C8328e.this.f26972c == null && C8328e.this.f26957M != null && !C8328e.this.f26957M.isRecycled() && C8328e.this.f26958N != null) {
                C8328e eVar = C8328e.this;
                eVar.f26972c = new C8325c(surfaceTexture, eVar.f26957M, C8328e.this.f26958N, i, i2);
                C8328e.this.f26972c.m12864Q(true, true);
            }
        }

        @Override
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C8328e.this.m12821l();
            return true;
        }

        @Override
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            if (C8328e.this.f26972c != null) {
                C8328e.this.f26972c.m12860U(i, i2);
                C8328e.this.f26972c.m12864Q(false, true);
                C1379j0.m37337d0(new Runnable() {
                    @Override
                    public final void run() {
                        C8328e.TextureView$SurfaceTextureListenerC8329a.this.m12809b();
                    }
                });
            }
        }

        @Override
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public static class RunnableC8330b extends FrameLayoutFix implements C8434g.AbstractC8435a, Runnable {
        public C8328e f26982M;
        public boolean f26983N;
        public C8431f f26984O;
        public int f26985P;
        public int f26986Q = -1;
        public boolean f26987R;
        public AbstractC8331a f26988S;
        public C8434g f26989T;
        public int f26990U;
        public float f26991V;
        public boolean f26992W;

        public interface AbstractC8331a {
            void mo12801a(View view, int i);
        }

        public RunnableC8330b(Context context) {
            super(context);
        }

        private void setEffectiveMode(int i) {
            if (this.f26986Q != i) {
                this.f26986Q = i;
                AbstractC8331a aVar = this.f26988S;
                if (aVar != null) {
                    aVar.mo12801a(this, i);
                }
            }
        }

        public final boolean m12808C1(int i, MotionEvent motionEvent, int i2, int i3) {
            int i4;
            if (i == 1) {
                i4 = 0;
            } else if (i == 2) {
                i4 = 1;
            } else if (i != 3) {
                return false;
            } else {
                i4 = 2;
            }
            C8434g gVar = new C8434g(i4, i2, i3, 1.0f, this.f26982M.f26975e0 != null ? this.f26982M.f26975e0.m14827c() : 0.0f);
            gVar.m12448z(motionEvent);
            gVar.m12449y(this.f26990U, this.f26991V);
            this.f26984O.m12500b(gVar);
            gVar.m12473a(this);
            this.f26989T = gVar;
            return true;
        }

        public void m12807D1() {
            this.f26987R = true;
        }

        public final void m12806E1(int i, MotionEvent motionEvent, boolean z) {
            if (i == 1 || i == 2 || i == 3) {
                if (this.f26989T.m12470d(motionEvent, z)) {
                    this.f26984O.m12478x(this.f26989T);
                } else {
                    this.f26984O.m12483s(this.f26989T);
                }
                this.f26989T.m12458p(this);
                this.f26989T = null;
            }
        }

        public boolean m12805F1() {
            return this.f26986Q != -1;
        }

        public boolean m12804G1() {
            return this.f26986Q != -1;
        }

        public final boolean m12803I1(int i, MotionEvent motionEvent, boolean z) {
            if (i == 1 || i == 2 || i == 3) {
                this.f26989T.m12462l(motionEvent, z);
                return true;
            }
            throw new UnsupportedOperationException("mode == " + i);
        }

        public void m12802J1(int i, float f) {
            if (this.f26990U != i || this.f26991V != f) {
                this.f26990U = i;
                this.f26991V = f;
                C8434g gVar = this.f26989T;
                if (gVar != null) {
                    gVar.m12449y(i, f);
                }
            }
        }

        @Override
        public void mo12447o(C8434g gVar, boolean z) {
            if (z) {
                if (!this.f26992W) {
                    this.f26992W = true;
                    postDelayed(this, 6L);
                    return;
                }
            } else if (this.f26992W) {
                removeCallbacks(this);
            }
            this.f26982M.f26968a.invalidate();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            boolean z = false;
            if (this.f26984O == null) {
                return false;
            }
            if (action == 0) {
                this.f26987R = false;
            }
            if (action != 0 && this.f26986Q == -1) {
                return false;
            }
            if (action != 0) {
                if (action == 1) {
                    m12806E1(this.f26986Q, motionEvent, false);
                    setEffectiveMode(-1);
                } else if (action == 2) {
                    int i = this.f26986Q;
                    if (((RunnableC7470o) this.f26982M.getParent()).getZoomFactor() == 1.0f) {
                        z = true;
                    }
                    if (!m12803I1(i, motionEvent, z)) {
                        setEffectiveMode(-1);
                    }
                } else if (action == 3) {
                    m12806E1(this.f26986Q, motionEvent, this.f26987R);
                    setEffectiveMode(-1);
                    this.f26987R = false;
                }
            } else if (!this.f26983N || this.f26985P == 100 || motionEvent.getPointerCount() > 1 || !m12808C1(this.f26985P, motionEvent, getMeasuredWidth(), getMeasuredHeight())) {
                setEffectiveMode(-1);
                return false;
            } else {
                setEffectiveMode(this.f26985P);
            }
            return true;
        }

        @Override
        public void run() {
            if (this.f26992W) {
                this.f26992W = false;
                this.f26982M.f26968a.invalidate();
            }
        }

        public void setDrawingListener(AbstractC8331a aVar) {
            this.f26988S = aVar;
        }

        public void setPaintingGesturesEnabled(boolean z) {
            this.f26983N = z;
        }

        public void setPaintingMode(int i) {
            this.f26985P = i;
        }

        public void setPaintingState(C8431f fVar) {
            this.f26984O = fVar;
            this.f26982M.f26968a.setPaintState(fVar);
        }

        public void setParent(C8328e eVar) {
            this.f26982M = eVar;
        }
    }

    public class C8332c extends View {
        public C8332c(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            int i = C8328e.this.f26961Q;
            int i2 = C8328e.this.f26962R;
            int i3 = C8328e.this.f26963S - (i / 2);
            int i4 = i + i3;
            int i5 = C8328e.this.f26964T - (i2 / 2);
            int i6 = i2 + i5;
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Paint g = C1410y.m37042g(-16777216);
            if (i3 > 0) {
                canvas.drawRect(0.0f, i5, i3, i6, g);
            }
            if (i4 < measuredWidth) {
                canvas.drawRect(i4, i5, measuredWidth, i6, g);
            }
            if (i5 > 0) {
                canvas.drawRect(0.0f, 0.0f, measuredWidth, i5, g);
            }
            if (i6 < measuredHeight) {
                canvas.drawRect(0.0f, i6, measuredWidth, measuredHeight, g);
            }
        }
    }

    public C8328e(Context context) {
        super(context);
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        this.f26967W = frameLayoutFix;
        frameLayoutFix.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(this.f26967W);
        RunnableC8330b bVar = new RunnableC8330b(context);
        this.f26971b0 = bVar;
        bVar.setParent(this);
        this.f26971b0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        this.f26971b0.setVisibility(4);
        this.f26967W.addView(this.f26971b0);
        C8332c cVar = new C8332c(context);
        this.f26969a0 = cVar;
        cVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(this.f26969a0);
    }

    public RunnableC8330b getContentWrap() {
        return this.f26971b0;
    }

    public final void m12822k() {
        if (Build.VERSION.SDK_INT >= 14) {
            int i = this.f26974d0;
            if (i != this.f26979i0) {
                boolean x1 = C7389v0.m16564x1(i);
                int i2 = this.f26979i0;
                this.f26974d0 = i2;
                if (x1 != C7389v0.m16564x1(i2)) {
                    this.f26971b0.requestLayout();
                }
            }
            C7856c cVar = this.f26975e0;
            if (cVar == null || cVar.m14818l()) {
                this.f26971b0.setRotation(0.0f);
                this.f26971b0.setScaleX(1.0f);
                this.f26971b0.setScaleY(1.0f);
                this.f26971b0.setTranslationX(0.0f);
                this.f26971b0.setTranslationY(0.0f);
            } else {
                float c = this.f26975e0.m14827c();
                this.f26971b0.setRotation(c);
                double radians = Math.toRadians(c);
                float abs = (float) Math.abs(Math.sin(radians));
                float abs2 = (float) Math.abs(Math.cos(radians));
                float f = this.f26977g0;
                float f2 = this.f26978h0;
                float max = Math.max(((f * abs2) + (f2 * abs)) / f, ((abs * f) + (abs2 * f2)) / f2);
                this.f26971b0.setScaleX(max);
                this.f26971b0.setScaleY(max);
            }
            this.f26967W.setRotation(this.f26979i0);
        }
    }

    public void m12821l() {
        C8325c cVar = this.f26972c;
        if (cVar != null) {
            cVar.m12850i();
            this.f26972c = null;
        }
    }

    public void m12820m(AbstractC8323a aVar) {
        if (Build.VERSION.SDK_INT < 14 || !m12817p()) {
            aVar.mo12881a(null);
        } else if (this.f26973c0 == 1) {
            C8325c cVar = this.f26972c;
            if (cVar != null) {
                cVar.m12843p(aVar);
            } else {
                aVar.mo12881a(null);
            }
        }
    }

    public void m12819n(C6253l lVar, Bitmap bitmap, C8111a aVar, C8431f fVar) {
        int i;
        if (Build.VERSION.SDK_INT >= 14) {
            this.f26960P = lVar;
            this.f26957M = bitmap;
            if (aVar != null) {
                this.f26958N = aVar;
                i = 1;
            } else if (fVar != null) {
                this.f26959O = fVar;
                i = 2;
            } else {
                throw new IllegalArgumentException("filtersState == null && paintState == null");
            }
            TextureView textureView = null;
            if (i == 1) {
                textureView = new TextureView(getContext());
                textureView.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
                textureView.setVisibility(this.f26976f0 ? 0 : 4);
                textureView.setSurfaceTextureListener(new TextureView$SurfaceTextureListenerC8329a());
                this.f26971b0.addView(textureView);
            } else if (i == 2) {
                this.f26971b0.setPaintingGesturesEnabled(true);
            }
            C8874f fVar2 = new C8874f(getContext());
            this.f26968a = fVar2;
            fVar2.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
            this.f26971b0.addView(this.f26968a);
            this.f26971b0.setPaintingState(fVar);
            this.f26970b = textureView;
            m12822k();
            this.f26973c0 = i;
        }
    }

    public boolean m12818o() {
        return this.f26976f0;
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt != null) {
                if (childAt == this.f26969a0) {
                    childAt.layout(i, i2, i3, i4);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    int i6 = this.f26963S - (measuredWidth / 2);
                    int i7 = this.f26964T - (measuredHeight / 2);
                    childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
                }
            }
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        float f;
        setMeasuredDimension(i, i2);
        if (getChildCount() != 0) {
            int i3 = this.f26965U;
            int i4 = this.f26966V;
            if (C7389v0.m16564x1(this.f26979i0)) {
                this.f26967W.measure(View.MeasureSpec.makeMeasureSpec(i4, Log.TAG_TDLIB_OPTIONS), View.MeasureSpec.makeMeasureSpec(i3, Log.TAG_TDLIB_OPTIONS));
            } else {
                this.f26967W.measure(View.MeasureSpec.makeMeasureSpec(i3, Log.TAG_TDLIB_OPTIONS), View.MeasureSpec.makeMeasureSpec(i4, Log.TAG_TDLIB_OPTIONS));
            }
            float f2 = 1.0f;
            C7856c cVar = this.f26975e0;
            float f3 = 0.0f;
            if (cVar != null) {
                double d = cVar.m14826d();
                double i5 = this.f26975e0.m14821i();
                double g = this.f26975e0.m14823g();
                double b = this.f26975e0.m14828b();
                f2 = Math.max(this.f26961Q / ((float) (i3 * (g - d))), this.f26962R / ((float) (i4 * (b - i5))));
                f3 = -((float) ((((d + g) / 2.0d) - 0.5d) * ((int) (i3 * f2))));
                f = -((float) ((((i5 + b) / 2.0d) - 0.5d) * ((int) (i4 * f2))));
            } else {
                f = 0.0f;
            }
            this.f26967W.setScaleX(f2);
            this.f26967W.setScaleY(f2);
            this.f26967W.setTranslationX(f3);
            this.f26967W.setTranslationY(f);
            this.f26969a0.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Log.TAG_TDLIB_OPTIONS), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Log.TAG_TDLIB_OPTIONS));
        }
    }

    public final boolean m12817p() {
        return this.f26973c0 == 1 && this.f26972c != null;
    }

    public void m12816q() {
        C8325c cVar = this.f26972c;
        if (cVar != null) {
            cVar.m12868M();
        }
    }

    public void m12815r(boolean z) {
        C8325c cVar = this.f26972c;
        if (cVar != null) {
            cVar.m12865P(z);
        }
    }

    public void m12814s(C6253l lVar, int i, int i2, Bitmap bitmap, C8111a aVar, C8431f fVar) {
        C8325c cVar;
        this.f26977g0 = i;
        this.f26978h0 = i2;
        this.f26979i0 = lVar.m20851X0();
        this.f26975e0 = lVar.m20913j();
        if (this.f26973c0 == 0) {
            m12819n(lVar, bitmap, aVar, fVar);
            return;
        }
        this.f26957M = bitmap;
        this.f26958N = aVar;
        this.f26959O = fVar;
        this.f26960P = lVar;
        m12822k();
        if (this.f26973c0 == 1 && (cVar = this.f26972c) != null) {
            cVar.m12862S(bitmap, aVar);
        }
        this.f26971b0.setPaintingState(fVar);
    }

    public void setEditorVisible(boolean z) {
        this.f26976f0 = z;
        View view = this.f26970b;
        int i = 0;
        if (view != null) {
            view.setVisibility(z ? 0 : 4);
        }
        this.f26971b0.setVisibility(z ? 0 : 4);
        C8332c cVar = this.f26969a0;
        if (!z) {
            i = 4;
        }
        cVar.setVisibility(i);
    }

    public void setPaintingMode(int i) {
        if (this.f26980j0 != i) {
            this.f26980j0 = i;
            this.f26971b0.setPaintingGesturesEnabled(i != 100);
            this.f26971b0.setPaintingMode(i);
        }
    }

    public void m12813t(int i, int i2) {
        this.f26963S = i;
        this.f26964T = i2;
        this.f26969a0.invalidate();
    }

    public void m12812u(int i, int i2, int i3, C7856c cVar) {
        this.f26977g0 = i;
        this.f26975e0 = cVar;
        this.f26978h0 = i2;
        this.f26979i0 = i3;
    }

    public void m12811v(int i, int i2, int i3, int i4) {
        this.f26965U = i;
        this.f26966V = i2;
        this.f26961Q = i3;
        this.f26962R = i4;
        this.f26969a0.invalidate();
    }
}
