package vc;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ce.a0;
import ce.h;
import ce.j0;
import ce.o;
import ce.p0;
import ce.y;
import eb.f;
import eb.k;
import gd.w;
import id.d;
import id.i;
import ne.b2;
import ne.p;
import org.thunderdog.challegram.R;
import ud.v4;

public class q implements k.b {
    public String M;
    public int N;
    public String O;
    public String[] P;
    public boolean Q;
    public float R;
    public int S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public float X;
    public k Y;
    public f Z;
    public final Context f25172a;
    public c f25173a0;
    public final b f25174b;
    public p f25175b0;
    public final v4<?> f25176c;
    public TextView f25177c0;
    public boolean f25178d0;
    public boolean f25179e0;
    public boolean f25180f0;
    public int f25181g0;

    public class a extends p {
        public a(Context context, v4 v4Var, boolean z10) {
            super(context, v4Var, z10);
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            q.this.z();
        }
    }

    public interface b {
        int[] U5(q qVar, View view, View view2, int i10, int i11, int i12, int i13, int i14);

        void k0(q qVar, View view);
    }

    public static class c extends View {
        public View M;
        public int N;
        public int O = -1;
        public i[] f25182a;
        public Drawable f25183b;
        public Drawable f25184c;

        public c(Context context) {
            super(context);
        }

        public boolean c(float f10) {
            int i10;
            i[] iVarArr;
            int i11 = a0.i(4.5f);
            float f11 = f10 - i11;
            int i12 = a0.i(240.0f) - (i11 * 2);
            if (f11 <= 0.0f) {
                i10 = 0;
            } else {
                float f12 = i12;
                if (f11 >= f12) {
                    i10 = this.f25182a.length - 1;
                } else {
                    i10 = Math.max(0, Math.min(this.f25182a.length - 1, (int) ((f11 / f12) * iVarArr.length)));
                }
            }
            if (i10 == -1 || i10 == this.O) {
                return false;
            }
            this.O = i10;
            invalidate();
            return true;
        }

        public View d() {
            return this.M;
        }

        public final void e(v4<?> v4Var, boolean z10) {
            this.f25182a = new i[h.f5260f.length - (z10 ? 1 : 0)];
            this.f25183b = j.A(R.drawable.stickers_back_all, R.id.theme_color_overlayFilling, v4Var);
            this.f25184c = j.A(R.drawable.stickers_back_arrow, R.id.theme_color_overlayFilling, v4Var);
        }

        public void f(View view, int i10) {
            this.M = view;
            this.N = i10;
            setPivotX((view.getMeasuredWidth() / 2) - i10);
            setPivotY(a0.i(46.0f) + a0.i(3.5f) + (a0.i(8.0f) / 2));
        }

        public void g(String str, String str2) {
            String[] strArr;
            int i10 = 0;
            for (String str3 : h.f5260f) {
                if (str3 == null && str2 == null) {
                    this.O = 0;
                } else if (ib.i.c(str3, str2)) {
                    this.O = i10;
                }
                this.f25182a[i10] = d.z().q(h.i().b(str, str3));
                i10++;
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            int i10;
            int i11;
            i[] iVarArr;
            int i12 = a0.i(4.0f);
            int i13 = a0.i(4.5f);
            int i14 = (a0.i(240.0f) - (i13 * 2)) / this.f25182a.length;
            int i15 = a0.i(46.0f);
            int i16 = a0.i(2.5f);
            this.f25183b.setBounds(0, 0, getMeasuredWidth(), (i12 * 2) + i15);
            this.f25183b.draw(canvas);
            int i17 = a0.i(18.0f);
            int i18 = a0.i(8.0f);
            int i19 = a0.i(3.5f) + i15;
            View view = this.M;
            int measuredWidth = view != null ? ((view.getMeasuredWidth() / 2) - this.N) - (i17 / 2) : 0;
            this.f25184c.setBounds(measuredWidth, i19, i17 + measuredWidth, i18 + i19);
            this.f25184c.draw(canvas);
            RectF a02 = y.a0();
            a02.set((this.O * i14) + i13, (i12 / 2) + i16, i10 + i14, (i11 + i15) - i12);
            canvas.drawRoundRect(a02, a0.i(4.0f), a0.i(4.0f), y.g(681615520));
            for (i iVar : this.f25182a) {
                int min = Math.min(i14, i15) - a0.i(4.0f);
                Rect Z = y.Z();
                int i20 = min / 2;
                int i21 = ((i14 / 2) + i13) - i20;
                Z.left = i21;
                int i22 = ((i15 / 2) + i16) - i20;
                Z.top = i22;
                Z.right = i21 + min;
                Z.bottom = i22 + min;
                d.z().k(canvas, iVar, Z);
                i13 += i14;
            }
        }
    }

    public q(Context context, b bVar, v4<?> v4Var) {
        this.f25172a = context;
        this.f25174b = bVar;
        this.f25176c = v4Var;
    }

    public static int[] e(q qVar, View view, View view2, int i10, int i11, int i12, int i13, int i14, ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3) {
        int left = view.getLeft();
        int top = view.getTop() + viewGroup2.getTop() + viewGroup3.getTop();
        int max = Math.max(i12, Math.min((viewGroup.getMeasuredWidth() - Math.max(0, i10)) - i12, i13 + left));
        int i15 = (top - i11) + i14;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i11);
        layoutParams.topMargin = i15;
        layoutParams.leftMargin = max;
        view2.setLayoutParams(layoutParams);
        viewGroup.addView(view2);
        return new int[]{max - left, i15 - top};
    }

    public void l(View view) {
        c cVar = this.f25173a0;
        if (cVar != null && (cVar.d() instanceof r) && k()) {
            this.f25180f0 = true;
            ((r) this.f25173a0.d()).b();
        }
    }

    public final void c(boolean z10) {
        if (this.f25181g0 != this.f25173a0.O || !z10) {
            this.f25181g0 = this.f25173a0.O;
            w(this.f25173a0.O, z10);
        }
    }

    public boolean d() {
        return this.f25174b != null && !k();
    }

    public final void f() {
        c cVar = this.f25173a0;
        if (cVar != null) {
            this.f25174b.k0(this, cVar);
            v4<?> v4Var = this.f25176c;
            if (v4Var != null) {
                v4Var.qd(this.f25173a0);
            }
            this.f25173a0 = null;
        }
        TextView textView = this.f25177c0;
        if (textView != null) {
            v4<?> v4Var2 = this.f25176c;
            if (v4Var2 != null) {
                v4Var2.qd(textView);
            }
            this.f25177c0 = null;
        }
        p pVar = this.f25175b0;
        if (pVar != null) {
            this.f25174b.k0(this, pVar);
            this.f25175b0.e();
            this.f25175b0 = null;
        }
    }

    public String g() {
        return this.M;
    }

    public String[] h() {
        String[] strArr = this.P;
        int i10 = 0;
        if (strArr != null) {
            int i11 = 0;
            for (String str : strArr) {
                if (!ib.i.i(str)) {
                    i11++;
                } else if (i11 <= 0) {
                    return null;
                } else {
                    String[] strArr2 = new String[i11];
                    System.arraycopy(this.P, 0, strArr2, 0, i11);
                    return strArr2;
                }
            }
            i10 = i11;
        }
        if (i10 > 0) {
            return this.P;
        }
        return null;
    }

    public String i() {
        return this.O;
    }

    public void j(View view) {
        v(view, false);
    }

    public final boolean k() {
        f fVar = this.Z;
        return fVar != null && fVar.h();
    }

    public boolean m() {
        return this.f25179e0 || this.f25180f0;
    }

    public boolean n() {
        return !this.f25180f0;
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 0) {
            c cVar = this.f25173a0;
            if (cVar != null) {
                float f12 = (0.2f * f10) + 0.8f;
                cVar.setScaleX(f12);
                this.f25173a0.setScaleY(f12);
                this.f25173a0.setAlpha(ib.h.d(f10));
            }
            p pVar = this.f25175b0;
            if (pVar != null) {
                pVar.setMaxAllowedVisibility(f10);
            }
        } else if (i10 == 1) {
            x(f10);
        }
    }

    public final boolean o() {
        p pVar = this.f25175b0;
        return pVar != null && pVar.d() && k() && this.Z.g() > 0.0f;
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        if (i10 == 0 && f10 == 0.0f && this.f25173a0 != null) {
            f();
        }
    }

    public boolean p(View view, float f10, float f11, String str, int i10, String str2, String[] strArr) {
        this.M = str;
        this.N = i10;
        this.O = str2;
        int i11 = i10 >= 2 ? (i10 - 2) + 1 : 0;
        if (i11 > 0) {
            if (strArr == null) {
                strArr = new String[i11];
            } else if (strArr.length < i11) {
                String[] strArr2 = new String[i11];
                System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
                strArr = strArr2;
            }
        }
        this.P = strArr;
        this.f25180f0 = false;
        this.W = false;
        this.f25179e0 = false;
        this.f25178d0 = false;
        this.Q = false;
        this.R = f10;
        this.T = 0;
        this.S = 0;
        this.V = 0;
        this.U = 0;
        v(view, true);
        return true;
    }

    public final boolean q(View view) {
        if (this.f25173a0 != null) {
            return false;
        }
        c cVar = new c(this.f25172a);
        this.f25173a0 = cVar;
        cVar.e(this.f25176c, false);
        this.f25173a0.g(this.M, this.O);
        v4<?> v4Var = this.f25176c;
        if (v4Var != null) {
            v4Var.t8(this.f25173a0);
        }
        c(false);
        int i10 = a0.i(240.0f);
        int[] U5 = this.f25174b.U5(this, view, this.f25173a0, i10, a0.i(46.0f) + a0.i(2.0f) + a0.i(4.0f) + a0.i(8.0f), a0.i(4.0f), (view.getMeasuredWidth() / 2) - Math.min(a0.i(23.0f), i10 / 2), a0.i(8.0f));
        int i11 = U5[0];
        this.S = i11;
        this.T = U5[1];
        this.f25173a0.f(view, i11);
        return true;
    }

    public void r(View view, MotionEvent motionEvent, float f10, float f11) {
        c cVar = this.f25173a0;
        if (cVar != null && cVar.getMeasuredWidth() != 0) {
            if (!this.Q) {
                this.Q = Math.abs(f10 - this.R) > a0.p() || f11 < 0.0f;
            }
            if (this.Q) {
                float f12 = f10 - this.S;
                float f13 = f11 - this.T;
                int i10 = this.N;
                if (i10 == 0) {
                    return;
                }
                if (i10 != 1) {
                    s(view, motionEvent, f10, f11, f12, f13, (i10 - 2) + 1);
                } else {
                    t(view, motionEvent, f10, f11, f12, f13);
                }
            }
        }
    }

    public final void s(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13, int i10) {
        t(view, motionEvent, f10, f11, f12, f13);
    }

    public final void t(android.view.View r23, android.view.MotionEvent r24, float r25, float r26, float r27, float r28) {
        throw new UnsupportedOperationException("Method not decompiled: vc.q.t(android.view.View, android.view.MotionEvent, float, float, float, float):void");
    }

    public final boolean u(View view, boolean z10, MotionEvent motionEvent, float f10, float f11) {
        if (this.f25179e0 == z10) {
            return false;
        }
        this.f25179e0 = z10;
        this.f25177c0.dispatchTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), z10 ? 0 : 3, Math.max(0.0f, Math.min(this.f25177c0.getMeasuredWidth(), f10)), Math.max(0.0f, Math.min(this.f25177c0.getMeasuredHeight(), f11)), motionEvent.getMetaState()));
        if (!z10) {
            return true;
        }
        j0.k(view, false);
        return true;
    }

    public final void v(View view, boolean z10) {
        if (k() != z10) {
            f fVar = this.Z;
            if (fVar == null) {
                this.Z = new f(0, this, db.b.f7291f, 210L);
            } else if (!z10 || fVar.g() != 0.0f) {
                this.Z.n(db.b.f7287b);
                this.Z.l(100L);
            } else {
                this.Z.n(db.b.f7291f);
                this.Z.l(210L);
            }
            this.Z.q(z10, true, q(view) ? this.f25173a0 : null);
        }
    }

    public final void w(float f10, boolean z10) {
        if (z10) {
            if (this.Y == null) {
                this.Y = new k(1, this, db.b.f7287b, 180L, this.X);
            }
            this.Y.i(f10);
            return;
        }
        k kVar = this.Y;
        if (kVar != null) {
            kVar.l(f10);
        }
        x(f10);
    }

    public final void x(float f10) {
        if (this.X != f10) {
            this.X = f10;
            z();
        }
    }

    public final void y(View view, boolean z10) {
        if (this.f25178d0 != z10) {
            this.f25178d0 = z10;
            p pVar = this.f25175b0;
            if (pVar != null) {
                pVar.f(z10, null);
            } else if (z10) {
                int i10 = a0.i(4.5f);
                int i11 = i10 + ((a0.i(240.0f) - (i10 * 2)) / h.f5260f.length);
                a aVar = new a(this.f25172a, this.f25176c, false);
                this.f25175b0 = aVar;
                aVar.setCornerCenterX(i11 / 2);
                p pVar2 = this.f25175b0;
                f fVar = this.Z;
                pVar2.setMaxAllowedVisibility(fVar != null ? fVar.g() : 0.0f);
                p pVar3 = this.f25175b0;
                pVar3.f(true, pVar3);
                b2 b2Var = new b2(this.f25172a);
                this.f25177c0 = b2Var;
                b2Var.setId(R.id.btn_send);
                this.f25177c0.setTextSize(1, 15.0f);
                this.f25177c0.setTextColor(j.L(R.id.theme_color_textNeutral));
                v4<?> v4Var = this.f25176c;
                if (v4Var != null) {
                    v4Var.z8(this.f25177c0, R.id.theme_color_textNeutral);
                }
                this.f25177c0.setTypeface(o.i());
                p0.c0(this.f25177c0, w.i1(R.string.ApplyToAll).toUpperCase());
                this.f25177c0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        q.this.l(view2);
                    }
                });
                yd.d.i(this.f25177c0);
                this.f25177c0.setPadding(a0.i(16.0f), 0, a0.i(16.0f), 0);
                this.f25177c0.setGravity(17);
                this.f25177c0.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
                this.f25175b0.addView(this.f25177c0);
                int[] U5 = this.f25174b.U5(this, view, this.f25175b0, -2, a0.i(48.0f) + this.f25175b0.getPaddingTop() + this.f25175b0.getPaddingBottom(), a0.i(4.0f), this.S, (a0.i(8.0f) - (((a0.i(46.0f) + a0.i(2.0f)) + a0.i(4.0f)) + a0.i(8.0f))) + a0.i(6.0f));
                this.U = U5[0];
                this.V = U5[1];
            }
        }
    }

    public final void z() {
        if (this.f25175b0 != null) {
            int i10 = a0.i(240.0f) - (a0.i(4.5f) * 2);
            String[] strArr = h.f5260f;
            float length = this.X / (strArr.length - 1);
            int measuredWidth = this.f25175b0.getMeasuredWidth();
            int length2 = (i10 / strArr.length) / 2;
            this.f25175b0.setCornerCenterX(length2 + ((int) ((measuredWidth - (length2 * 2)) * length)));
            this.f25175b0.setTranslationX((i10 - measuredWidth) * length);
        }
    }
}
