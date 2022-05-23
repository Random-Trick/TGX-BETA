package ne;

import ae.j;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.j0;
import ce.y;
import ib.h;
import oc.v0;
import od.p1;
import od.q;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.a;
import ud.v4;

public class k3 extends LinearLayout implements p1.a, kb.c, ne.a, a.j {
    public p1 M;
    public float N;
    public String[] O;
    public int P;
    public float Q;
    public b R;
    public c S;
    public q f18167a;
    public a f18168b;
    public a f18169c;

    public static class a extends ImageView implements kb.c {
        public static final DecelerateInterpolator N = new DecelerateInterpolator(2.0f);
        public int M;
        public float f18170a;
        public Bitmap f18171b;
        public Canvas f18172c;

        public a(Context context) {
            super(context);
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(R.drawable.baseline_brightness_5_24);
            setColorFilter(j.o0());
        }

        @Override
        public void Q2() {
            Bitmap bitmap = this.f18171b;
            if (bitmap != null) {
                bitmap.recycle();
                this.f18171b = null;
            }
            this.f18172c = null;
        }

        public final void a() {
            int width;
            if (this.f18171b == null) {
                b();
            }
            this.f18171b.eraseColor(0);
            float width2 = this.f18171b.getWidth() / 2;
            int o02 = j.o0();
            this.M = o02;
            this.f18172c.drawCircle(width2, width2, a0.i(4.0f), y.g(o02));
            this.f18172c.drawCircle(width + ((int) (a0.i(4.0f) * 2.0f * this.f18170a)), width2, a0.i(4.0f), y.D());
        }

        public final void b() {
            if (this.f18171b == null) {
                int i10 = (a0.i(4.0f) * 2) + a0.i(2.0f);
                this.f18171b = Bitmap.createBitmap(i10, i10, Bitmap.Config.ARGB_8888);
                this.f18172c = new Canvas(this.f18171b);
            }
        }

        public void c(float f10) {
            if (f10 > 0.0f && f10 < 1.0f) {
                f10 = N.getInterpolation(f10);
            }
            float f11 = this.f18170a;
            if (f11 != f10) {
                this.f18170a = f10;
                float i10 = a0.i(4.0f) * 2.0f;
                int i11 = (int) (f10 * i10);
                if (((int) (f11 * i10)) != i11) {
                    if (i11 > 0 && i11 < ((int) i10)) {
                        a();
                    }
                    invalidate();
                }
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            int measuredWidth = getMeasuredWidth() / 2;
            int measuredHeight = getMeasuredHeight() / 2;
            float i10 = a0.i(4.0f);
            int i11 = (int) (2.0f * i10);
            int i12 = (int) (i11 * this.f18170a);
            if (i12 == i11) {
                canvas.drawCircle(measuredWidth, measuredHeight, i10, y.g(j.o0()));
            } else if (i12 > 0) {
                if (this.f18171b == null || j.o0() != this.M) {
                    a();
                }
                int width = this.f18171b.getWidth() / 2;
                canvas.drawBitmap(this.f18171b, measuredWidth - width, measuredHeight - width, y.j());
            }
        }
    }

    public interface b {
        void q(k3 k3Var, int i10);
    }

    public interface c {
        void N(k3 k3Var, float f10, float f11, int i10, boolean z10);
    }

    public k3(Context context) {
        super(context);
        p1 p1Var = new p1(context);
        this.M = p1Var;
        p1Var.setAnchorMode(0);
        this.M.h(true, false);
        this.M.setListener(this);
        this.M.g(R.id.theme_color_sliderActive, false);
        this.M.setForceBackgroundColorId(R.id.theme_color_sliderInactive);
        setOrientation(0);
        setLayoutParams(new RecyclerView.LayoutParams(-1, a0.i(56.0f)));
    }

    @Override
    public boolean A4(p1 p1Var) {
        return this.O != null || this.Q > 0.0f;
    }

    @Override
    public void O2(p1 p1Var, boolean z10) {
        q qVar = this.f18167a;
        if (qVar != null) {
            qVar.B1(z10, true);
        }
        if (!z10) {
            float f10 = this.N;
            if (this.O != null) {
                f10 = k(this.P);
                this.M.b(f10);
            }
            h(f10, true);
        }
    }

    @Override
    public void Q2() {
        a aVar = this.f18168b;
        if (aVar != null) {
            aVar.Q2();
            j0.r(getContext()).x2(this);
        }
    }

    @Override
    public void Y0(p1 p1Var, float f10) {
        int d10 = d(f10);
        if (this.P != d10) {
            this.P = d10;
            q qVar = this.f18167a;
            if (qVar != null) {
                String[] strArr = this.O;
                qVar.setValue(strArr != null ? strArr[d10] : Integer.toString(d10));
            }
            b bVar = this.R;
            if (bVar != null) {
                bVar.q(this, this.P);
            }
        }
        h(f10, false);
    }

    @Override
    public void a(float f10) {
        if (this.f18168b != null) {
            p1 p1Var = this.M;
            float f11 = this.Q;
            float f12 = 0.0f;
            if (f11 != 0.0f) {
                f12 = h.d(f10 / f11);
            }
            p1Var.i(f12, true);
        }
    }

    @Override
    public void b() {
        if (this.f18168b != null) {
            j0.r(getContext()).x2(this);
        }
    }

    public void c(v4<?> v4Var) {
        if (v4Var != null) {
            q qVar = this.f18167a;
            if (qVar != null) {
                qVar.z1(v4Var);
            }
            a aVar = this.f18168b;
            if (aVar != null) {
                v4Var.q8(aVar, R.id.theme_color_icon);
            }
            a aVar2 = this.f18169c;
            if (aVar2 != null) {
                v4Var.q8(aVar2, R.id.theme_color_icon);
            }
            v4Var.t8(this.M);
        }
    }

    public final int d(float f10) {
        String[] strArr = this.O;
        if (strArr != null) {
            return Math.round(f10 * (strArr.length - 1));
        }
        return 0;
    }

    @Override
    public void e() {
        if (this.f18168b != null) {
            org.thunderdog.challegram.a r10 = j0.r(getContext());
            p1 p1Var = this.M;
            float f10 = 0.0f;
            if (this.Q != 0.0f) {
                f10 = h.d(r10.W0() / this.Q);
            }
            p1Var.i(f10, false);
            r10.W(this);
        }
    }

    public void f() {
        a aVar = new a(getContext());
        this.f18168b = aVar;
        aVar.setLayoutParams(new ViewGroup.LayoutParams(a0.i(56.0f), -1));
        addView(this.f18168b);
        this.M.setPadding(a0.i(16.0f), 0, a0.i(16.0f), 0);
        this.M.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
        addView(this.M);
        a aVar2 = new a(getContext());
        this.f18169c = aVar2;
        aVar2.c(1.0f);
        this.f18169c.setLayoutParams(new ViewGroup.LayoutParams(a0.i(56.0f), -1));
        addView(this.f18169c);
    }

    public void g() {
        q qVar = new q(getContext());
        this.f18167a = qVar;
        qVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        this.f18167a.setPadding(a0.i(16.0f), 0, 0, 0);
        this.f18167a.A1(R.id.theme_color_text, R.id.theme_color_textNeutral);
        addView(this.f18167a);
        this.M.setPadding(a0.i(16.0f), a0.i(1.0f), a0.i(16.0f), 0);
        this.M.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(this.M);
    }

    public final void h(float f10, boolean z10) {
        if (this.N != f10 || z10) {
            this.N = f10;
            a aVar = this.f18168b;
            if (aVar != null) {
                aVar.c(f10);
            }
            c cVar = this.S;
            if (cVar != null) {
                cVar.N(this, this.N, this.O != null ? 1.0f : this.Q, this.P, z10);
            }
        }
    }

    public void i(float f10, float f11) {
        this.Q = f11;
        float d10 = h.d(f10 / f11);
        this.N = d10;
        a aVar = this.f18168b;
        if (aVar != null) {
            aVar.c(d10);
        }
        this.M.setValue(this.N);
    }

    public void j(CharSequence charSequence, String[] strArr, int i10) {
        this.O = strArr;
        q qVar = this.f18167a;
        if (qVar != null) {
            qVar.setName(charSequence);
            this.f18167a.setValue(strArr[i10]);
            float f10 = 0.0f;
            for (String str : strArr) {
                f10 = Math.max(f10, v0.T1(str, y.b0(13.0f)));
            }
            this.f18167a.setValueMaxWidth(f10);
        }
        float k10 = k(i10);
        this.N = k10;
        a aVar = this.f18168b;
        if (aVar != null) {
            aVar.c(k10);
        }
        this.P = i10;
        this.M.setValue(this.N);
        this.M.setValueCount(strArr.length);
    }

    public final float k(int i10) {
        String[] strArr = this.O;
        if (strArr != null) {
            return i10 * (1.0f / (strArr.length - 1));
        }
        return 0.0f;
    }

    public void setCallback(b bVar) {
        this.R = bVar;
    }

    public void setRealTimeChangeListener(c cVar) {
        this.S = cVar;
    }

    public void setShowOnlyValue(boolean z10) {
        q qVar = this.f18167a;
        if (qVar != null) {
            qVar.setAlwaysDragging(z10);
        }
    }
}
