package p291uc;

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
import be.C1357a0;
import be.C1374h;
import be.C1379j0;
import be.C1389o;
import be.C1399s0;
import be.C1410y;
import me.C6847b2;
import me.C6990p;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3940f;
import p051db.C3950k;
import p082fd.C4403w;
import p108hb.C5069h;
import p108hb.C5070i;
import p110hd.C5078d;
import p110hd.C5088i;
import p335xd.C10189d;
import p364zd.C11524j;
import td.AbstractC9323v4;

public class C9639r implements C3950k.AbstractC3952b {
    public String f31255M;
    public int f31256N;
    public String f31257O;
    public String[] f31258P;
    public boolean f31259Q;
    public float f31260R;
    public int f31261S;
    public int f31262T;
    public int f31263U;
    public int f31264V;
    public boolean f31265W;
    public float f31266X;
    public C3950k f31267Y;
    public C3940f f31268Z;
    public final Context f31269a;
    public C9642c f31270a0;
    public final AbstractC9641b f31271b;
    public C6990p f31272b0;
    public final AbstractC9323v4<?> f31273c;
    public TextView f31274c0;
    public boolean f31275d0;
    public boolean f31276e0;
    public boolean f31277f0;
    public int f31278g0;

    public class C9640a extends C6990p {
        public C9640a(Context context, AbstractC9323v4 v4Var, boolean z) {
            super(context, v4Var, z);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            C9639r.this.m7926z();
        }
    }

    public interface AbstractC9641b {
        int[] mo7925J2(C9639r rVar, View view, View view2, int i, int i2, int i3, int i4, int i5);

        void mo7924b5(C9639r rVar, View view);
    }

    public static class C9642c extends View {
        public View f31280M;
        public int f31281N;
        public int f31282O = -1;
        public C5088i[] f31283a;
        public Drawable f31284b;
        public Drawable f31285c;

        public C9642c(Context context) {
            super(context);
        }

        public boolean m7921c(float f) {
            int i;
            C5088i[] iVarArr;
            int i2 = C1357a0.m37544i(4.5f);
            float f2 = f - i2;
            int i3 = C1357a0.m37544i(240.0f) - (i2 * 2);
            if (f2 <= 0.0f) {
                i = 0;
            } else {
                float f3 = i3;
                if (f2 >= f3) {
                    i = this.f31283a.length - 1;
                } else {
                    i = Math.max(0, Math.min(this.f31283a.length - 1, (int) ((f2 / f3) * iVarArr.length)));
                }
            }
            if (i == -1 || i == this.f31282O) {
                return false;
            }
            this.f31282O = i;
            invalidate();
            return true;
        }

        public View m7920d() {
            return this.f31280M;
        }

        public final void m7919e(AbstractC9323v4<?> v4Var, boolean z) {
            this.f31283a = new C5088i[C1374h.f4993f.length - (z ? 1 : 0)];
            this.f31284b = C11524j.m250C(R.drawable.stickers_back_all, R.id.theme_color_overlayFilling, v4Var);
            this.f31285c = C11524j.m250C(R.drawable.stickers_back_arrow, R.id.theme_color_overlayFilling, v4Var);
        }

        public void m7918f(View view, int i) {
            this.f31280M = view;
            this.f31281N = i;
            setPivotX((view.getMeasuredWidth() / 2) - i);
            setPivotY(C1357a0.m37544i(46.0f) + C1357a0.m37544i(3.5f) + (C1357a0.m37544i(8.0f) / 2));
        }

        public void m7917g(String str, String str2) {
            String[] strArr;
            int i = 0;
            for (String str3 : C1374h.f4993f) {
                if (str3 == null && str2 == null) {
                    this.f31282O = 0;
                } else if (C5070i.m24068c(str3, str2)) {
                    this.f31282O = i;
                }
                this.f31283a[i] = C5078d.m23987z().m23996q(C1374h.m37383i().m37390b(str, str3));
                i++;
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            int i;
            int i2;
            C5088i[] iVarArr;
            int i3 = C1357a0.m37544i(4.0f);
            int i4 = C1357a0.m37544i(4.5f);
            int i5 = (C1357a0.m37544i(240.0f) - (i4 * 2)) / this.f31283a.length;
            int i6 = C1357a0.m37544i(46.0f);
            int i7 = C1357a0.m37544i(2.5f);
            this.f31284b.setBounds(0, 0, getMeasuredWidth(), (i3 * 2) + i6);
            this.f31284b.draw(canvas);
            int i8 = C1357a0.m37544i(18.0f);
            int i9 = C1357a0.m37544i(8.0f);
            int i10 = C1357a0.m37544i(3.5f) + i6;
            View view = this.f31280M;
            int measuredWidth = view != null ? ((view.getMeasuredWidth() / 2) - this.f31281N) - (i8 / 2) : 0;
            this.f31285c.setBounds(measuredWidth, i10, i8 + measuredWidth, i9 + i10);
            this.f31285c.draw(canvas);
            RectF a0 = C1410y.m37053a0();
            a0.set((this.f31282O * i5) + i4, (i3 / 2) + i7, i + i5, (i2 + i6) - i3);
            canvas.drawRoundRect(a0, C1357a0.m37544i(4.0f), C1357a0.m37544i(4.0f), C1410y.m37042g(681615520));
            for (C5088i iVar : this.f31283a) {
                int min = Math.min(i5, i6) - C1357a0.m37544i(4.0f);
                Rect Z = C1410y.m37055Z();
                int i11 = min / 2;
                int i12 = ((i5 / 2) + i4) - i11;
                Z.left = i12;
                int i13 = ((i6 / 2) + i7) - i11;
                Z.top = i13;
                Z.right = i12 + min;
                Z.bottom = i13 + min;
                C5078d.m23987z().m24002k(canvas, iVar, Z);
                i4 += i5;
            }
        }
    }

    public C9639r(Context context, AbstractC9641b bVar, AbstractC9323v4<?> v4Var) {
        this.f31269a = context;
        this.f31271b = bVar;
        this.f31273c = v4Var;
    }

    public static int[] m7947e(C9639r rVar, View view, View view2, int i, int i2, int i3, int i4, int i5, ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3) {
        int left = view.getLeft();
        int top = view.getTop() + viewGroup2.getTop() + viewGroup3.getTop();
        int max = Math.max(i3, Math.min((viewGroup.getMeasuredWidth() - Math.max(0, i)) - i3, i4 + left));
        int i6 = (top - i2) + i5;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
        layoutParams.topMargin = i6;
        layoutParams.leftMargin = max;
        view2.setLayoutParams(layoutParams);
        viewGroup.addView(view2);
        return new int[]{max - left, i6 - top};
    }

    public void m7940l(View view) {
        C9642c cVar = this.f31270a0;
        if (cVar != null && (cVar.m7920d() instanceof C9647s) && m7941k()) {
            this.f31277f0 = true;
            ((C9647s) this.f31270a0.m7920d()).m7915b();
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            C9642c cVar = this.f31270a0;
            if (cVar != null) {
                float f3 = (0.2f * f) + 0.8f;
                cVar.setScaleX(f3);
                this.f31270a0.setScaleY(f3);
                this.f31270a0.setAlpha(C5069h.m24090d(f));
            }
            C6990p pVar = this.f31272b0;
            if (pVar != null) {
                pVar.setMaxAllowedVisibility(f);
            }
        } else if (i == 1) {
            m7928x(f);
        }
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        if (i == 0 && f == 0.0f && this.f31270a0 != null) {
            m7946f();
        }
    }

    public final void m7949c(boolean z) {
        if (this.f31278g0 != this.f31270a0.f31282O || !z) {
            this.f31278g0 = this.f31270a0.f31282O;
            m7929w(this.f31270a0.f31282O, z);
        }
    }

    public boolean m7948d() {
        return this.f31271b != null && !m7941k();
    }

    public final void m7946f() {
        C9642c cVar = this.f31270a0;
        if (cVar != null) {
            this.f31271b.mo7924b5(this, cVar);
            AbstractC9323v4<?> v4Var = this.f31273c;
            if (v4Var != null) {
                v4Var.m9180qd(this.f31270a0);
            }
            this.f31270a0 = null;
        }
        TextView textView = this.f31274c0;
        if (textView != null) {
            AbstractC9323v4<?> v4Var2 = this.f31273c;
            if (v4Var2 != null) {
                v4Var2.m9180qd(textView);
            }
            this.f31274c0 = null;
        }
        C6990p pVar = this.f31272b0;
        if (pVar != null) {
            this.f31271b.mo7924b5(this, pVar);
            this.f31272b0.m18151e();
            this.f31272b0 = null;
        }
    }

    public String m7945g() {
        return this.f31255M;
    }

    public String[] m7944h() {
        String[] strArr = this.f31258P;
        int i = 0;
        if (strArr != null) {
            int i2 = 0;
            for (String str : strArr) {
                if (!C5070i.m24062i(str)) {
                    i2++;
                } else if (i2 <= 0) {
                    return null;
                } else {
                    String[] strArr2 = new String[i2];
                    System.arraycopy(this.f31258P, 0, strArr2, 0, i2);
                    return strArr2;
                }
            }
            i = i2;
        }
        if (i > 0) {
            return this.f31258P;
        }
        return null;
    }

    public String m7943i() {
        return this.f31257O;
    }

    public void m7942j(View view) {
        m7930v(view, false);
    }

    public final boolean m7941k() {
        C3940f fVar = this.f31268Z;
        return fVar != null && fVar.m29585h();
    }

    public boolean m7939m() {
        return this.f31276e0 || this.f31277f0;
    }

    public boolean m7938n() {
        return !this.f31277f0;
    }

    public final boolean m7937o() {
        C6990p pVar = this.f31272b0;
        return pVar != null && pVar.m18152d() && m7941k() && this.f31268Z.m29586g() > 0.0f;
    }

    public boolean m7936p(View view, float f, float f2, String str, int i, String str2, String[] strArr) {
        this.f31255M = str;
        this.f31256N = i;
        this.f31257O = str2;
        int i2 = i >= 2 ? (i - 2) + 1 : 0;
        if (i2 > 0) {
            if (strArr == null) {
                strArr = new String[i2];
            } else if (strArr.length < i2) {
                String[] strArr2 = new String[i2];
                System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
                strArr = strArr2;
            }
        }
        this.f31258P = strArr;
        this.f31277f0 = false;
        this.f31265W = false;
        this.f31276e0 = false;
        this.f31275d0 = false;
        this.f31259Q = false;
        this.f31260R = f;
        this.f31262T = 0;
        this.f31261S = 0;
        this.f31264V = 0;
        this.f31263U = 0;
        m7930v(view, true);
        return true;
    }

    public final boolean m7935q(View view) {
        if (this.f31270a0 != null) {
            return false;
        }
        C9642c cVar = new C9642c(this.f31269a);
        this.f31270a0 = cVar;
        cVar.m7919e(this.f31273c, false);
        this.f31270a0.m7917g(this.f31255M, this.f31257O);
        AbstractC9323v4<?> v4Var = this.f31273c;
        if (v4Var != null) {
            v4Var.m9163t8(this.f31270a0);
        }
        m7949c(false);
        int i = C1357a0.m37544i(240.0f);
        int[] J2 = this.f31271b.mo7925J2(this, view, this.f31270a0, i, C1357a0.m37544i(46.0f) + C1357a0.m37544i(2.0f) + C1357a0.m37544i(4.0f) + C1357a0.m37544i(8.0f), C1357a0.m37544i(4.0f), (view.getMeasuredWidth() / 2) - Math.min(C1357a0.m37544i(23.0f), i / 2), C1357a0.m37544i(8.0f));
        int i2 = J2[0];
        this.f31261S = i2;
        this.f31262T = J2[1];
        this.f31270a0.m7918f(view, i2);
        return true;
    }

    public void m7934r(View view, MotionEvent motionEvent, float f, float f2) {
        C9642c cVar = this.f31270a0;
        if (cVar != null && cVar.getMeasuredWidth() != 0) {
            if (!this.f31259Q) {
                this.f31259Q = Math.abs(f - this.f31260R) > C1357a0.m37537p() || f2 < 0.0f;
            }
            if (this.f31259Q) {
                float f3 = f - this.f31261S;
                float f4 = f2 - this.f31262T;
                int i = this.f31256N;
                if (i == 0) {
                    return;
                }
                if (i != 1) {
                    m7933s(view, motionEvent, f, f2, f3, f4, (i - 2) + 1);
                } else {
                    m7932t(view, motionEvent, f, f2, f3, f4);
                }
            }
        }
    }

    public final void m7933s(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4, int i) {
        m7932t(view, motionEvent, f, f2, f3, f4);
    }

    public final void m7932t(android.view.View r23, android.view.MotionEvent r24, float r25, float r26, float r27, float r28) {
        throw new UnsupportedOperationException("Method not decompiled: p291uc.C9639r.m7932t(android.view.View, android.view.MotionEvent, float, float, float, float):void");
    }

    public final boolean m7931u(View view, boolean z, MotionEvent motionEvent, float f, float f2) {
        if (this.f31276e0 == z) {
            return false;
        }
        this.f31276e0 = z;
        this.f31274c0.dispatchTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), z ? 0 : 3, Math.max(0.0f, Math.min(this.f31274c0.getMeasuredWidth(), f)), Math.max(0.0f, Math.min(this.f31274c0.getMeasuredHeight(), f2)), motionEvent.getMetaState()));
        if (!z) {
            return true;
        }
        C1379j0.m37324k(view, false);
        return true;
    }

    public final void m7930v(View view, boolean z) {
        if (m7941k() != z) {
            C3940f fVar = this.f31268Z;
            if (fVar == null) {
                this.f31268Z = new C3940f(0, this, C2057b.f7284f, 210L);
            } else if (!z || fVar.m29586g() != 0.0f) {
                this.f31268Z.m29579n(C2057b.f7280b);
                this.f31268Z.m29581l(100L);
            } else {
                this.f31268Z.m29579n(C2057b.f7284f);
                this.f31268Z.m29581l(210L);
            }
            this.f31268Z.m29576q(z, true, m7935q(view) ? this.f31270a0 : null);
        }
    }

    public final void m7929w(float f, boolean z) {
        if (z) {
            if (this.f31267Y == null) {
                this.f31267Y = new C3950k(1, this, C2057b.f7280b, 180L, this.f31266X);
            }
            this.f31267Y.m29546i(f);
            return;
        }
        C3950k kVar = this.f31267Y;
        if (kVar != null) {
            kVar.m29543l(f);
        }
        m7928x(f);
    }

    public final void m7928x(float f) {
        if (this.f31266X != f) {
            this.f31266X = f;
            m7926z();
        }
    }

    public final void m7927y(View view, boolean z) {
        if (this.f31275d0 != z) {
            this.f31275d0 = z;
            C6990p pVar = this.f31272b0;
            if (pVar != null) {
                pVar.m18150f(z, null);
            } else if (z) {
                int i = C1357a0.m37544i(4.5f);
                int i2 = i + ((C1357a0.m37544i(240.0f) - (i * 2)) / C1374h.f4993f.length);
                C9640a aVar = new C9640a(this.f31269a, this.f31273c, false);
                this.f31272b0 = aVar;
                aVar.setCornerCenterX(i2 / 2);
                C6990p pVar2 = this.f31272b0;
                C3940f fVar = this.f31268Z;
                pVar2.setMaxAllowedVisibility(fVar != null ? fVar.m29586g() : 0.0f);
                C6990p pVar3 = this.f31272b0;
                pVar3.m18150f(true, pVar3);
                C6847b2 b2Var = new C6847b2(this.f31269a);
                this.f31274c0 = b2Var;
                b2Var.setId(R.id.btn_send);
                this.f31274c0.setTextSize(1, 15.0f);
                this.f31274c0.setTextColor(C11524j.m228N(R.id.theme_color_textNeutral));
                AbstractC9323v4<?> v4Var = this.f31273c;
                if (v4Var != null) {
                    v4Var.m9119z8(this.f31274c0, R.id.theme_color_textNeutral);
                }
                this.f31274c0.setTypeface(C1389o.m37263i());
                C1399s0.m37178j0(this.f31274c0, C4403w.m27871i1(R.string.ApplyToAll).toUpperCase());
                this.f31274c0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        C9639r.this.m7940l(view2);
                    }
                });
                C10189d.m5795i(this.f31274c0);
                this.f31274c0.setPadding(C1357a0.m37544i(16.0f), 0, C1357a0.m37544i(16.0f), 0);
                this.f31274c0.setGravity(17);
                this.f31274c0.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
                this.f31272b0.addView(this.f31274c0);
                int[] J2 = this.f31271b.mo7925J2(this, view, this.f31272b0, -2, C1357a0.m37544i(48.0f) + this.f31272b0.getPaddingTop() + this.f31272b0.getPaddingBottom(), C1357a0.m37544i(4.0f), this.f31261S, (C1357a0.m37544i(8.0f) - (((C1357a0.m37544i(46.0f) + C1357a0.m37544i(2.0f)) + C1357a0.m37544i(4.0f)) + C1357a0.m37544i(8.0f))) + C1357a0.m37544i(6.0f));
                this.f31263U = J2[0];
                this.f31264V = J2[1];
            }
        }
    }

    public final void m7926z() {
        if (this.f31272b0 != null) {
            int i = C1357a0.m37544i(240.0f) - (C1357a0.m37544i(4.5f) * 2);
            String[] strArr = C1374h.f4993f;
            float length = this.f31266X / (strArr.length - 1);
            int measuredWidth = this.f31272b0.getMeasuredWidth();
            int length2 = (i / strArr.length) / 2;
            this.f31272b0.setCornerCenterX(length2 + ((int) ((measuredWidth - (length2 * 2)) * length)));
            this.f31272b0.setTranslationX((i - measuredWidth) * length);
        }
    }
}
