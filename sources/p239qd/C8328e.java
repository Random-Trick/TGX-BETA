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
    public Bitmap f26954M;
    public C8111a f26955N;
    public C8431f f26956O;
    public C6253l f26957P;
    public int f26958Q;
    public int f26959R;
    public int f26960S;
    public int f26961T;
    public int f26962U;
    public int f26963V;
    public FrameLayoutFix f26964W;
    public C8874f f26965a;
    public C8332c f26966a0;
    public View f26967b;
    public RunnableC8330b f26968b0;
    public C8325c f26969c;
    public int f26970c0;
    public int f26971d0;
    public C7856c f26972e0;
    public boolean f26973f0;
    public int f26974g0;
    public int f26975h0;
    public int f26976i0;
    public int f26977j0;

    public class TextureView$SurfaceTextureListenerC8329a implements TextureView.SurfaceTextureListener {
        public TextureView$SurfaceTextureListenerC8329a() {
        }

        public void m12810b() {
            C8328e.this.f26969c.m12865Q(false, true);
        }

        @Override
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            if (surfaceTexture != null && C8328e.this.f26969c == null && C8328e.this.f26954M != null && !C8328e.this.f26954M.isRecycled() && C8328e.this.f26955N != null) {
                C8328e eVar = C8328e.this;
                eVar.f26969c = new C8325c(surfaceTexture, eVar.f26954M, C8328e.this.f26955N, i, i2);
                C8328e.this.f26969c.m12865Q(true, true);
            }
        }

        @Override
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C8328e.this.m12822l();
            return true;
        }

        @Override
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            if (C8328e.this.f26969c != null) {
                C8328e.this.f26969c.m12861U(i, i2);
                C8328e.this.f26969c.m12865Q(false, true);
                C1379j0.m37334d0(new Runnable() {
                    @Override
                    public final void run() {
                        C8328e.TextureView$SurfaceTextureListenerC8329a.this.m12810b();
                    }
                });
            }
        }

        @Override
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public static class RunnableC8330b extends FrameLayoutFix implements C8434g.AbstractC8435a, Runnable {
        public C8328e f26979M;
        public boolean f26980N;
        public C8431f f26981O;
        public int f26982P;
        public int f26983Q = -1;
        public boolean f26984R;
        public AbstractC8331a f26985S;
        public C8434g f26986T;
        public int f26987U;
        public float f26988V;
        public boolean f26989W;

        public interface AbstractC8331a {
            void mo12802a(View view, int i);
        }

        public RunnableC8330b(Context context) {
            super(context);
        }

        private void setEffectiveMode(int i) {
            if (this.f26983Q != i) {
                this.f26983Q = i;
                AbstractC8331a aVar = this.f26985S;
                if (aVar != null) {
                    aVar.mo12802a(this, i);
                }
            }
        }

        public final boolean m12809C1(int i, MotionEvent motionEvent, int i2, int i3) {
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
            C8434g gVar = new C8434g(i4, i2, i3, 1.0f, this.f26979M.f26972e0 != null ? this.f26979M.f26972e0.m14827c() : 0.0f);
            gVar.m12449z(motionEvent);
            gVar.m12450y(this.f26987U, this.f26988V);
            this.f26981O.m12501b(gVar);
            gVar.m12474a(this);
            this.f26986T = gVar;
            return true;
        }

        public void m12808D1() {
            this.f26984R = true;
        }

        public final void m12807E1(int i, MotionEvent motionEvent, boolean z) {
            if (i == 1 || i == 2 || i == 3) {
                if (this.f26986T.m12471d(motionEvent, z)) {
                    this.f26981O.m12479x(this.f26986T);
                } else {
                    this.f26981O.m12484s(this.f26986T);
                }
                this.f26986T.m12459p(this);
                this.f26986T = null;
            }
        }

        public boolean m12806F1() {
            return this.f26983Q != -1;
        }

        public boolean m12805G1() {
            return this.f26983Q != -1;
        }

        public final boolean m12804I1(int i, MotionEvent motionEvent, boolean z) {
            if (i == 1 || i == 2 || i == 3) {
                this.f26986T.m12463l(motionEvent, z);
                return true;
            }
            throw new UnsupportedOperationException("mode == " + i);
        }

        public void m12803J1(int i, float f) {
            if (this.f26987U != i || this.f26988V != f) {
                this.f26987U = i;
                this.f26988V = f;
                C8434g gVar = this.f26986T;
                if (gVar != null) {
                    gVar.m12450y(i, f);
                }
            }
        }

        @Override
        public void mo12448o(C8434g gVar, boolean z) {
            if (z) {
                if (!this.f26989W) {
                    this.f26989W = true;
                    postDelayed(this, 6L);
                    return;
                }
            } else if (this.f26989W) {
                removeCallbacks(this);
            }
            this.f26979M.f26965a.invalidate();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            boolean z = false;
            if (this.f26981O == null) {
                return false;
            }
            if (action == 0) {
                this.f26984R = false;
            }
            if (action != 0 && this.f26983Q == -1) {
                return false;
            }
            if (action != 0) {
                if (action == 1) {
                    m12807E1(this.f26983Q, motionEvent, false);
                    setEffectiveMode(-1);
                } else if (action == 2) {
                    int i = this.f26983Q;
                    if (((RunnableC7470o) this.f26979M.getParent()).getZoomFactor() == 1.0f) {
                        z = true;
                    }
                    if (!m12804I1(i, motionEvent, z)) {
                        setEffectiveMode(-1);
                    }
                } else if (action == 3) {
                    m12807E1(this.f26983Q, motionEvent, this.f26984R);
                    setEffectiveMode(-1);
                    this.f26984R = false;
                }
            } else if (!this.f26980N || this.f26982P == 100 || motionEvent.getPointerCount() > 1 || !m12809C1(this.f26982P, motionEvent, getMeasuredWidth(), getMeasuredHeight())) {
                setEffectiveMode(-1);
                return false;
            } else {
                setEffectiveMode(this.f26982P);
            }
            return true;
        }

        @Override
        public void run() {
            if (this.f26989W) {
                this.f26989W = false;
                this.f26979M.f26965a.invalidate();
            }
        }

        public void setDrawingListener(AbstractC8331a aVar) {
            this.f26985S = aVar;
        }

        public void setPaintingGesturesEnabled(boolean z) {
            this.f26980N = z;
        }

        public void setPaintingMode(int i) {
            this.f26982P = i;
        }

        public void setPaintingState(C8431f fVar) {
            this.f26981O = fVar;
            this.f26979M.f26965a.setPaintState(fVar);
        }

        public void setParent(C8328e eVar) {
            this.f26979M = eVar;
        }
    }

    public class C8332c extends View {
        public C8332c(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            int i = C8328e.this.f26958Q;
            int i2 = C8328e.this.f26959R;
            int i3 = C8328e.this.f26960S - (i / 2);
            int i4 = i + i3;
            int i5 = C8328e.this.f26961T - (i2 / 2);
            int i6 = i2 + i5;
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Paint g = C1410y.m37039g(-16777216);
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
        this.f26964W = frameLayoutFix;
        frameLayoutFix.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(this.f26964W);
        RunnableC8330b bVar = new RunnableC8330b(context);
        this.f26968b0 = bVar;
        bVar.setParent(this);
        this.f26968b0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        this.f26968b0.setVisibility(4);
        this.f26964W.addView(this.f26968b0);
        C8332c cVar = new C8332c(context);
        this.f26966a0 = cVar;
        cVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(this.f26966a0);
    }

    public RunnableC8330b getContentWrap() {
        return this.f26968b0;
    }

    public final void m12823k() {
        if (Build.VERSION.SDK_INT >= 14) {
            int i = this.f26971d0;
            if (i != this.f26976i0) {
                boolean x1 = C7389v0.m16564x1(i);
                int i2 = this.f26976i0;
                this.f26971d0 = i2;
                if (x1 != C7389v0.m16564x1(i2)) {
                    this.f26968b0.requestLayout();
                }
            }
            C7856c cVar = this.f26972e0;
            if (cVar == null || cVar.m14818l()) {
                this.f26968b0.setRotation(0.0f);
                this.f26968b0.setScaleX(1.0f);
                this.f26968b0.setScaleY(1.0f);
                this.f26968b0.setTranslationX(0.0f);
                this.f26968b0.setTranslationY(0.0f);
            } else {
                float c = this.f26972e0.m14827c();
                this.f26968b0.setRotation(c);
                double radians = Math.toRadians(c);
                float abs = (float) Math.abs(Math.sin(radians));
                float abs2 = (float) Math.abs(Math.cos(radians));
                float f = this.f26974g0;
                float f2 = this.f26975h0;
                float max = Math.max(((f * abs2) + (f2 * abs)) / f, ((abs * f) + (abs2 * f2)) / f2);
                this.f26968b0.setScaleX(max);
                this.f26968b0.setScaleY(max);
            }
            this.f26964W.setRotation(this.f26976i0);
        }
    }

    public void m12822l() {
        C8325c cVar = this.f26969c;
        if (cVar != null) {
            cVar.m12851i();
            this.f26969c = null;
        }
    }

    public void m12821m(AbstractC8323a aVar) {
        if (Build.VERSION.SDK_INT < 14 || !m12818p()) {
            aVar.mo12882a(null);
        } else if (this.f26970c0 == 1) {
            C8325c cVar = this.f26969c;
            if (cVar != null) {
                cVar.m12844p(aVar);
            } else {
                aVar.mo12882a(null);
            }
        }
    }

    public void m12820n(C6253l lVar, Bitmap bitmap, C8111a aVar, C8431f fVar) {
        int i;
        if (Build.VERSION.SDK_INT >= 14) {
            this.f26957P = lVar;
            this.f26954M = bitmap;
            if (aVar != null) {
                this.f26955N = aVar;
                i = 1;
            } else if (fVar != null) {
                this.f26956O = fVar;
                i = 2;
            } else {
                throw new IllegalArgumentException("filtersState == null && paintState == null");
            }
            TextureView textureView = null;
            if (i == 1) {
                textureView = new TextureView(getContext());
                textureView.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
                textureView.setVisibility(this.f26973f0 ? 0 : 4);
                textureView.setSurfaceTextureListener(new TextureView$SurfaceTextureListenerC8329a());
                this.f26968b0.addView(textureView);
            } else if (i == 2) {
                this.f26968b0.setPaintingGesturesEnabled(true);
            }
            C8874f fVar2 = new C8874f(getContext());
            this.f26965a = fVar2;
            fVar2.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
            this.f26968b0.addView(this.f26965a);
            this.f26968b0.setPaintingState(fVar);
            this.f26967b = textureView;
            m12823k();
            this.f26970c0 = i;
        }
    }

    public boolean m12819o() {
        return this.f26973f0;
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt != null) {
                if (childAt == this.f26966a0) {
                    childAt.layout(i, i2, i3, i4);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    int i6 = this.f26960S - (measuredWidth / 2);
                    int i7 = this.f26961T - (measuredHeight / 2);
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
            int i3 = this.f26962U;
            int i4 = this.f26963V;
            if (C7389v0.m16564x1(this.f26976i0)) {
                this.f26964W.measure(View.MeasureSpec.makeMeasureSpec(i4, Log.TAG_TDLIB_OPTIONS), View.MeasureSpec.makeMeasureSpec(i3, Log.TAG_TDLIB_OPTIONS));
            } else {
                this.f26964W.measure(View.MeasureSpec.makeMeasureSpec(i3, Log.TAG_TDLIB_OPTIONS), View.MeasureSpec.makeMeasureSpec(i4, Log.TAG_TDLIB_OPTIONS));
            }
            float f2 = 1.0f;
            C7856c cVar = this.f26972e0;
            float f3 = 0.0f;
            if (cVar != null) {
                double d = cVar.m14826d();
                double i5 = this.f26972e0.m14821i();
                double g = this.f26972e0.m14823g();
                double b = this.f26972e0.m14828b();
                f2 = Math.max(this.f26958Q / ((float) (i3 * (g - d))), this.f26959R / ((float) (i4 * (b - i5))));
                f3 = -((float) ((((d + g) / 2.0d) - 0.5d) * ((int) (i3 * f2))));
                f = -((float) ((((i5 + b) / 2.0d) - 0.5d) * ((int) (i4 * f2))));
            } else {
                f = 0.0f;
            }
            this.f26964W.setScaleX(f2);
            this.f26964W.setScaleY(f2);
            this.f26964W.setTranslationX(f3);
            this.f26964W.setTranslationY(f);
            this.f26966a0.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Log.TAG_TDLIB_OPTIONS), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Log.TAG_TDLIB_OPTIONS));
        }
    }

    public final boolean m12818p() {
        return this.f26970c0 == 1 && this.f26969c != null;
    }

    public void m12817q() {
        C8325c cVar = this.f26969c;
        if (cVar != null) {
            cVar.m12869M();
        }
    }

    public void m12816r(boolean z) {
        C8325c cVar = this.f26969c;
        if (cVar != null) {
            cVar.m12866P(z);
        }
    }

    public void m12815s(C6253l lVar, int i, int i2, Bitmap bitmap, C8111a aVar, C8431f fVar) {
        C8325c cVar;
        this.f26974g0 = i;
        this.f26975h0 = i2;
        this.f26976i0 = lVar.m20850X0();
        this.f26972e0 = lVar.m20912j();
        if (this.f26970c0 == 0) {
            m12820n(lVar, bitmap, aVar, fVar);
            return;
        }
        this.f26954M = bitmap;
        this.f26955N = aVar;
        this.f26956O = fVar;
        this.f26957P = lVar;
        m12823k();
        if (this.f26970c0 == 1 && (cVar = this.f26969c) != null) {
            cVar.m12863S(bitmap, aVar);
        }
        this.f26968b0.setPaintingState(fVar);
    }

    public void setEditorVisible(boolean z) {
        this.f26973f0 = z;
        View view = this.f26967b;
        int i = 0;
        if (view != null) {
            view.setVisibility(z ? 0 : 4);
        }
        this.f26968b0.setVisibility(z ? 0 : 4);
        C8332c cVar = this.f26966a0;
        if (!z) {
            i = 4;
        }
        cVar.setVisibility(i);
    }

    public void setPaintingMode(int i) {
        if (this.f26977j0 != i) {
            this.f26977j0 = i;
            this.f26968b0.setPaintingGesturesEnabled(i != 100);
            this.f26968b0.setPaintingMode(i);
        }
    }

    public void m12814t(int i, int i2) {
        this.f26960S = i;
        this.f26961T = i2;
        this.f26966a0.invalidate();
    }

    public void m12813u(int i, int i2, int i3, C7856c cVar) {
        this.f26974g0 = i;
        this.f26972e0 = cVar;
        this.f26975h0 = i2;
        this.f26976i0 = i3;
    }

    public void m12812v(int i, int i2, int i3, int i4) {
        this.f26962U = i;
        this.f26963V = i2;
        this.f26958Q = i3;
        this.f26959R = i4;
        this.f26966a0.invalidate();
    }
}
