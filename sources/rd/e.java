package rd;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import ce.j0;
import ce.y;
import ld.l;
import me.vkryl.android.widget.FrameLayoutFix;
import oc.v0;
import od.o;
import org.thunderdog.challegram.Log;
import rd.e;
import sd.f;
import sd.g;

public class e extends ViewGroup {
    public Bitmap M;
    public qd.a N;
    public f O;
    public l P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public FrameLayoutFix W;
    public td.f f21924a;
    public c f21925a0;
    public View f21926b;
    public b f21927b0;
    public rd.c f21928c;
    public int f21929c0;
    public int f21930d0;
    public pd.c f21931e0;
    public boolean f21932f0;
    public int f21933g0;
    public int f21934h0;
    public int f21935i0;
    public int f21936j0;

    public class a implements TextureView.SurfaceTextureListener {
        public a() {
        }

        public void b() {
            e.this.f21928c.Q(false, true);
        }

        @Override
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            if (surfaceTexture != null && e.this.f21928c == null && e.this.M != null && !e.this.M.isRecycled() && e.this.N != null) {
                e eVar = e.this;
                eVar.f21928c = new rd.c(surfaceTexture, eVar.M, e.this.N, i10, i11);
                e.this.f21928c.Q(true, true);
            }
        }

        @Override
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            e.this.l();
            return true;
        }

        @Override
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            if (e.this.f21928c != null) {
                e.this.f21928c.U(i10, i11);
                e.this.f21928c.Q(false, true);
                j0.d0(new Runnable() {
                    @Override
                    public final void run() {
                        e.a.this.b();
                    }
                });
            }
        }

        @Override
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public static class b extends FrameLayoutFix implements g.a, Runnable {
        public e M;
        public boolean N;
        public f O;
        public int P;
        public int Q = -1;
        public boolean R;
        public a S;
        public g T;
        public int U;
        public float V;
        public boolean W;

        public interface a {
            void a(View view, int i10);
        }

        public b(Context context) {
            super(context);
        }

        private void setEffectiveMode(int i10) {
            if (this.Q != i10) {
                this.Q = i10;
                a aVar = this.S;
                if (aVar != null) {
                    aVar.a(this, i10);
                }
            }
        }

        public void A1() {
            this.R = true;
        }

        public final void B1(int i10, MotionEvent motionEvent, boolean z10) {
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                if (this.T.d(motionEvent, z10)) {
                    this.O.x(this.T);
                } else {
                    this.O.s(this.T);
                }
                this.T.p(this);
                this.T = null;
            }
        }

        public boolean C1() {
            return this.Q != -1;
        }

        public boolean D1() {
            return this.Q != -1;
        }

        public final boolean E1(int i10, MotionEvent motionEvent, boolean z10) {
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                this.T.l(motionEvent, z10);
                return true;
            }
            throw new UnsupportedOperationException("mode == " + i10);
        }

        public void G1(int i10, float f10) {
            if (this.U != i10 || this.V != f10) {
                this.U = i10;
                this.V = f10;
                g gVar = this.T;
                if (gVar != null) {
                    gVar.y(i10, f10);
                }
            }
        }

        @Override
        public void h0(g gVar, boolean z10) {
            if (z10) {
                if (!this.W) {
                    this.W = true;
                    postDelayed(this, 6L);
                    return;
                }
            } else if (this.W) {
                removeCallbacks(this);
            }
            this.M.f21924a.invalidate();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            boolean z10 = false;
            if (this.O == null) {
                return false;
            }
            if (action == 0) {
                this.R = false;
            }
            if (action != 0 && this.Q == -1) {
                return false;
            }
            if (action != 0) {
                if (action == 1) {
                    B1(this.Q, motionEvent, false);
                    setEffectiveMode(-1);
                } else if (action == 2) {
                    int i10 = this.Q;
                    if (((o) this.M.getParent()).getZoomFactor() == 1.0f) {
                        z10 = true;
                    }
                    if (!E1(i10, motionEvent, z10)) {
                        setEffectiveMode(-1);
                    }
                } else if (action == 3) {
                    B1(this.Q, motionEvent, this.R);
                    setEffectiveMode(-1);
                    this.R = false;
                }
            } else if (!this.N || this.P == 100 || motionEvent.getPointerCount() > 1 || !z1(this.P, motionEvent, getMeasuredWidth(), getMeasuredHeight())) {
                setEffectiveMode(-1);
                return false;
            } else {
                setEffectiveMode(this.P);
            }
            return true;
        }

        @Override
        public void run() {
            if (this.W) {
                this.W = false;
                this.M.f21924a.invalidate();
            }
        }

        public void setDrawingListener(a aVar) {
            this.S = aVar;
        }

        public void setPaintingGesturesEnabled(boolean z10) {
            this.N = z10;
        }

        public void setPaintingMode(int i10) {
            this.P = i10;
        }

        public void setPaintingState(f fVar) {
            this.O = fVar;
            this.M.f21924a.setPaintState(fVar);
        }

        public void setParent(e eVar) {
            this.M = eVar;
        }

        public final boolean z1(int i10, MotionEvent motionEvent, int i11, int i12) {
            int i13;
            if (i10 == 1) {
                i13 = 0;
            } else if (i10 == 2) {
                i13 = 1;
            } else if (i10 != 3) {
                return false;
            } else {
                i13 = 2;
            }
            g gVar = new g(i13, i11, i12, 1.0f, this.M.f21931e0 != null ? this.M.f21931e0.c() : 0.0f);
            gVar.z(motionEvent);
            gVar.y(this.U, this.V);
            this.O.b(gVar);
            gVar.a(this);
            this.T = gVar;
            return true;
        }
    }

    public class c extends View {
        public c(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            int i10 = e.this.Q;
            int i11 = e.this.R;
            int i12 = e.this.S - (i10 / 2);
            int i13 = i10 + i12;
            int i14 = e.this.T - (i11 / 2);
            int i15 = i11 + i14;
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Paint g10 = y.g(-16777216);
            if (i12 > 0) {
                canvas.drawRect(0.0f, i14, i12, i15, g10);
            }
            if (i13 < measuredWidth) {
                canvas.drawRect(i13, i14, measuredWidth, i15, g10);
            }
            if (i14 > 0) {
                canvas.drawRect(0.0f, 0.0f, measuredWidth, i14, g10);
            }
            if (i15 < measuredHeight) {
                canvas.drawRect(0.0f, i15, measuredWidth, measuredHeight, g10);
            }
        }
    }

    public e(Context context) {
        super(context);
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        this.W = frameLayoutFix;
        frameLayoutFix.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(this.W);
        b bVar = new b(context);
        this.f21927b0 = bVar;
        bVar.setParent(this);
        this.f21927b0.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        this.f21927b0.setVisibility(4);
        this.W.addView(this.f21927b0);
        c cVar = new c(context);
        this.f21925a0 = cVar;
        cVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(this.f21925a0);
    }

    public b getContentWrap() {
        return this.f21927b0;
    }

    public final void k() {
        int i10 = this.f21930d0;
        if (i10 != this.f21935i0) {
            boolean x12 = v0.x1(i10);
            int i11 = this.f21935i0;
            this.f21930d0 = i11;
            if (x12 != v0.x1(i11)) {
                this.f21927b0.requestLayout();
            }
        }
        pd.c cVar = this.f21931e0;
        if (cVar == null || cVar.l()) {
            this.f21927b0.setRotation(0.0f);
            this.f21927b0.setScaleX(1.0f);
            this.f21927b0.setScaleY(1.0f);
            this.f21927b0.setTranslationX(0.0f);
            this.f21927b0.setTranslationY(0.0f);
        } else {
            float c10 = this.f21931e0.c();
            this.f21927b0.setRotation(c10);
            double radians = Math.toRadians(c10);
            float abs = (float) Math.abs(Math.sin(radians));
            float abs2 = (float) Math.abs(Math.cos(radians));
            float f10 = this.f21933g0;
            float f11 = this.f21934h0;
            float max = Math.max(((f10 * abs2) + (f11 * abs)) / f10, ((abs * f10) + (abs2 * f11)) / f11);
            this.f21927b0.setScaleX(max);
            this.f21927b0.setScaleY(max);
        }
        this.W.setRotation(this.f21935i0);
    }

    public void l() {
        rd.c cVar = this.f21928c;
        if (cVar != null) {
            cVar.i();
            this.f21928c = null;
        }
    }

    public void m(rd.a aVar) {
        if (!p()) {
            aVar.a(null);
        } else if (this.f21929c0 == 1) {
            rd.c cVar = this.f21928c;
            if (cVar != null) {
                cVar.p(aVar);
            } else {
                aVar.a(null);
            }
        }
    }

    public void n(l lVar, Bitmap bitmap, qd.a aVar, f fVar) {
        int i10;
        this.P = lVar;
        this.M = bitmap;
        if (aVar != null) {
            this.N = aVar;
            i10 = 1;
        } else if (fVar != null) {
            this.O = fVar;
            i10 = 2;
        } else {
            throw new IllegalArgumentException("filtersState == null && paintState == null");
        }
        TextureView textureView = null;
        if (i10 == 1) {
            textureView = new TextureView(getContext());
            textureView.setLayoutParams(FrameLayoutFix.q1(-1, -1));
            textureView.setVisibility(this.f21932f0 ? 0 : 4);
            textureView.setSurfaceTextureListener(new a());
            this.f21927b0.addView(textureView);
        } else if (i10 == 2) {
            this.f21927b0.setPaintingGesturesEnabled(true);
        }
        td.f fVar2 = new td.f(getContext());
        this.f21924a = fVar2;
        fVar2.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        this.f21927b0.addView(this.f21924a);
        this.f21927b0.setPaintingState(fVar);
        this.f21926b = textureView;
        k();
        this.f21929c0 = i10;
    }

    public boolean o() {
        return this.f21932f0;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt != null) {
                if (childAt == this.f21925a0) {
                    childAt.layout(i10, i11, i12, i13);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    int i15 = this.S - (measuredWidth / 2);
                    int i16 = this.T - (measuredHeight / 2);
                    childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
                }
            }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        float f10;
        setMeasuredDimension(i10, i11);
        if (getChildCount() != 0) {
            int i12 = this.U;
            int i13 = this.V;
            if (v0.x1(this.f21935i0)) {
                this.W.measure(View.MeasureSpec.makeMeasureSpec(i13, Log.TAG_TDLIB_OPTIONS), View.MeasureSpec.makeMeasureSpec(i12, Log.TAG_TDLIB_OPTIONS));
            } else {
                this.W.measure(View.MeasureSpec.makeMeasureSpec(i12, Log.TAG_TDLIB_OPTIONS), View.MeasureSpec.makeMeasureSpec(i13, Log.TAG_TDLIB_OPTIONS));
            }
            float f11 = 1.0f;
            pd.c cVar = this.f21931e0;
            float f12 = 0.0f;
            if (cVar != null) {
                double d10 = cVar.d();
                double i14 = this.f21931e0.i();
                double g10 = this.f21931e0.g();
                double b10 = this.f21931e0.b();
                f11 = Math.max(this.Q / ((float) (i12 * (g10 - d10))), this.R / ((float) (i13 * (b10 - i14))));
                f12 = -((float) ((((d10 + g10) / 2.0d) - 0.5d) * ((int) (i12 * f11))));
                f10 = -((float) ((((i14 + b10) / 2.0d) - 0.5d) * ((int) (i13 * f11))));
            } else {
                f10 = 0.0f;
            }
            this.W.setScaleX(f11);
            this.W.setScaleY(f11);
            this.W.setTranslationX(f12);
            this.W.setTranslationY(f10);
            this.f21925a0.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Log.TAG_TDLIB_OPTIONS), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Log.TAG_TDLIB_OPTIONS));
        }
    }

    public final boolean p() {
        return this.f21929c0 == 1 && this.f21928c != null;
    }

    public void q() {
        rd.c cVar = this.f21928c;
        if (cVar != null) {
            cVar.M();
        }
    }

    public void r(boolean z10) {
        rd.c cVar = this.f21928c;
        if (cVar != null) {
            cVar.P(z10);
        }
    }

    public void s(l lVar, int i10, int i11, Bitmap bitmap, qd.a aVar, f fVar) {
        rd.c cVar;
        this.f21933g0 = i10;
        this.f21934h0 = i11;
        this.f21935i0 = lVar.X0();
        this.f21931e0 = lVar.j();
        if (this.f21929c0 == 0) {
            n(lVar, bitmap, aVar, fVar);
            return;
        }
        this.M = bitmap;
        this.N = aVar;
        this.O = fVar;
        this.P = lVar;
        k();
        if (this.f21929c0 == 1 && (cVar = this.f21928c) != null) {
            cVar.S(bitmap, aVar);
        }
        this.f21927b0.setPaintingState(fVar);
    }

    public void setEditorVisible(boolean z10) {
        this.f21932f0 = z10;
        View view = this.f21926b;
        int i10 = 0;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 4);
        }
        this.f21927b0.setVisibility(z10 ? 0 : 4);
        c cVar = this.f21925a0;
        if (!z10) {
            i10 = 4;
        }
        cVar.setVisibility(i10);
    }

    public void setPaintingMode(int i10) {
        if (this.f21936j0 != i10) {
            this.f21936j0 = i10;
            this.f21927b0.setPaintingGesturesEnabled(i10 != 100);
            this.f21927b0.setPaintingMode(i10);
        }
    }

    public void t(int i10, int i11) {
        this.S = i10;
        this.T = i11;
        this.f21925a0.invalidate();
    }

    public void u(int i10, int i11, int i12, pd.c cVar) {
        this.f21933g0 = i10;
        this.f21931e0 = cVar;
        this.f21934h0 = i11;
        this.f21935i0 = i12;
    }

    public void v(int i10, int i11, int i12, int i13) {
        this.U = i10;
        this.V = i11;
        this.Q = i12;
        this.R = i13;
        this.f21925a0.invalidate();
    }
}
