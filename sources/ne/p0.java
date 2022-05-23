package ne;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.o;
import ce.y;
import gd.w;
import hd.b;
import hd.v6;
import id.d;
import kb.c;
import ld.h;
import ld.p;
import md.m;
import org.thunderdog.challegram.R;
import ud.c2;
import ud.v4;
import zd.s1;
import zd.t1;

public class p0 extends RelativeLayout implements c2, c, t1.a {
    public final m M;
    public c2 N;
    public boolean O;
    public int P;
    public boolean Q;
    public v6 R;
    public Path S;
    public boolean T;
    public b U;
    public TextView f18311a;
    public TextView f18312b;
    public final p f18313c;

    public p0(Context context) {
        super(context);
        int i10 = a0.i(72.0f);
        setPadding(0, Math.max(1, a0.i(0.5f)), 0, 0);
        setLayoutParams(new RecyclerView.LayoutParams(-1, i10));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = a0.i(15.0f);
        if (w.G2()) {
            layoutParams.rightMargin = a0.i(72.0f);
            layoutParams.leftMargin = a0.i(16.0f);
            layoutParams.addRule(1, R.id.btn_double);
        } else {
            layoutParams.leftMargin = a0.i(72.0f);
            layoutParams.rightMargin = a0.i(16.0f);
            layoutParams.addRule(0, R.id.btn_double);
        }
        b2 b2Var = new b2(context);
        this.f18311a = b2Var;
        b2Var.setId(R.id.text_title);
        this.f18311a.setTextSize(1, 16.0f);
        this.f18311a.setTypeface(o.i());
        this.f18311a.setTextColor(j.P0());
        this.f18311a.setEllipsize(TextUtils.TruncateAt.END);
        this.f18311a.setSingleLine(true);
        this.f18311a.setLayoutParams(layoutParams);
        this.f18311a.setGravity(w.F1());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = a0.i(38.0f);
        if (w.G2()) {
            layoutParams2.rightMargin = a0.i(72.0f);
            layoutParams2.leftMargin = a0.i(16.0f);
            layoutParams2.addRule(1, R.id.btn_double);
        } else {
            layoutParams2.leftMargin = a0.i(72.0f);
            layoutParams2.rightMargin = a0.i(16.0f);
            layoutParams2.addRule(0, R.id.btn_double);
        }
        b2 b2Var2 = new b2(context);
        this.f18312b = b2Var2;
        b2Var2.setTextSize(1, 13.0f);
        this.f18312b.setTextColor(j.R0());
        this.f18312b.setTypeface(o.k());
        this.f18312b.setEllipsize(TextUtils.TruncateAt.END);
        this.f18312b.setSingleLine(true);
        this.f18312b.setGravity(w.F1());
        this.f18312b.setLayoutParams(layoutParams2);
        t1.b().a(this);
        int i11 = i10 - (a0.i(12.0f) * 2);
        int i12 = (i10 / 2) - (i11 / 2);
        this.P = i12;
        p pVar = new p(this, 0);
        this.f18313c = pVar;
        int i13 = i11 + i12;
        pVar.K0(i12, i12, i13, i13);
        m mVar = new m(this);
        this.M = mVar;
        mVar.K0(i12, i12, i13, i13);
        addView(this.f18311a);
        addView(this.f18312b);
        setWillNotDraw(false);
    }

    public static void j(View view, int i10, int i11, int i12) {
        int i13 = w.G2() ? i11 : i10;
        if (!w.G2()) {
            i10 = i11;
        }
        if (ce.p0.a0(view, i13, i12, i10, 0)) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
            ce.p0.L(layoutParams, !w.G2() ? 1 : 0);
            layoutParams.addRule(w.G2() ? 1 : 0, R.id.btn_double);
            ce.p0.r0(view);
        }
    }

    @Override
    public void Q2() {
        this.f18313c.b0();
        this.M.b0();
        t1.b().d(this);
    }

    public void a(v4<?> v4Var) {
        if (v4Var != null) {
            v4Var.y8(this.f18311a);
            v4Var.A8(this.f18312b);
            v4Var.t8(this);
            v4Var.t8(this.N);
        }
    }

    public void b() {
        this.f18313c.e();
        this.M.e();
    }

    @Override
    public void b4() {
        s1.a(this);
    }

    public final void c() {
        if (this.N == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, a0.i(28.0f));
            layoutParams.addRule(w.G2() ? 9 : 11);
            layoutParams.addRule(15);
            int i10 = a0.i(19.0f);
            layoutParams.leftMargin = i10;
            layoutParams.rightMargin = i10;
            c2 c2Var = new c2(getContext());
            this.N = c2Var;
            c2Var.setId(R.id.btn_double);
            this.N.setLayoutParams(layoutParams);
            addView(this.N);
        }
    }

    public void d() {
        this.f18313c.b();
        this.M.b();
    }

    public void e(boolean z10) {
        this.O = z10;
        s();
        invalidate();
    }

    @Override
    public void e2() {
        this.f18311a.invalidate();
        this.f18312b.invalidate();
        invalidate();
    }

    public void f(h hVar, b.a aVar) {
        this.f18313c.G(hVar);
        this.M.clear();
        setAvatarPlaceholder(aVar);
    }

    public void g(int i10, View.OnClickListener onClickListener) {
        c();
        this.N.setText(i10);
        this.N.setOnClickListener(onClickListener);
    }

    public c2 getButton() {
        return this.N;
    }

    public void h(int i10, View.OnClickListener onClickListener) {
        c();
        this.N.setIcon(i10);
        this.N.setOnClickListener(onClickListener);
        this.N.setPadding(a0.i(6.0f), 0, a0.i(6.0f), 0);
    }

    public void i(CharSequence charSequence, CharSequence charSequence2) {
        this.f18311a.setText(d.z().I(charSequence));
        this.f18312b.setText(d.z().I(charSequence2));
    }

    @Override
    public void onDraw(Canvas canvas) {
        b bVar = this.U;
        if (bVar != null) {
            bVar.a(canvas, this.f18313c.J0(), this.f18313c.x0());
        } else {
            v6 v6Var = this.R;
            if (v6Var == null || !v6Var.m()) {
                if (this.f18313c.e0()) {
                    Path path = this.S;
                    if (path != null) {
                        this.f18313c.P(canvas, path);
                    } else if (this.T) {
                        p pVar = this.f18313c;
                        pVar.u0(canvas, pVar.getWidth() / 2);
                    }
                }
                this.f18313c.draw(canvas);
            } else {
                if (this.M.e0()) {
                    this.M.P(canvas, this.S);
                }
                this.M.draw(canvas);
            }
        }
        v6 v6Var2 = this.R;
        if (v6Var2 != null && v6Var2.u()) {
            int max = Math.max(1, a0.i(0.5f));
            int i10 = a0.i(72.0f);
            if (w.G2()) {
                int measuredWidth = getMeasuredWidth();
                float f10 = measuredWidth - i10;
                float f11 = max;
                canvas.drawRect(f10, 0.0f, measuredWidth, f11, y.g(j.u()));
                canvas.drawRect(0.0f, 0.0f, f10, f11, y.g(j.M0()));
                return;
            }
            float f12 = i10;
            float f13 = max;
            canvas.drawRect(0.0f, 0.0f, f12, f13, y.g(j.u()));
            canvas.drawRect(f12, 0.0f, getMeasuredWidth(), f13, y.g(j.M0()));
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int i12 = a0.i(72.0f);
        int i13 = i12 - (a0.i(12.0f) * 2);
        int i14 = (i12 / 2) - (i13 / 2);
        this.P = i14;
        int i15 = this.O ? i14 / 2 : i14;
        if (w.G2()) {
            int measuredWidth = (getMeasuredWidth() - i15) - i13;
            int i16 = measuredWidth + i13;
            int i17 = i13 + i14;
            this.f18313c.K0(measuredWidth, i14, i16, i17);
            this.M.K0(measuredWidth, i14, i16, i17);
            return;
        }
        int i18 = i15 + i13;
        int i19 = i13 + i14;
        this.f18313c.K0(i15, i14, i18, i19);
        this.M.K0(i15, i14, i18, i19);
    }

    @Override
    public void s() {
        if (this.f18311a.getGravity() != w.F1()) {
            this.f18311a.setGravity(w.F1());
        }
        if (this.f18312b.getGravity() != w.F1()) {
            this.f18312b.setGravity(w.F1());
        }
        int i10 = a0.i(72.0f) - (this.O ? this.P / 2 : 0);
        int i11 = a0.i(16.0f);
        j(this.f18311a, i10, i11, a0.i(15.0f));
        j(this.f18312b, i10, i11, a0.i(38.0f));
    }

    public void setAvatarPlaceholder(b.a aVar) {
        b bVar = null;
        if (aVar != null) {
            bVar = new b(a0.u(this.f18313c.getWidth() / 2.0f), aVar, null);
        }
        this.U = bVar;
    }

    public void setIsRounded(boolean z10) {
        if (this.Q != z10) {
            this.Q = z10;
            p pVar = this.f18313c;
            pVar.E0(z10 ? pVar.getWidth() / 2 : 0);
        }
    }

    public void setStickerSet(v6 v6Var) {
        this.T = false;
        this.f18311a.setText(d.z().I(v6Var.l()));
        this.f18312b.setText(w.o2(v6Var.p() ? R.string.xMasks : R.string.xStickers, v6Var.j()));
        this.f18313c.G(v6Var.i());
        this.M.r(v6Var.g());
        this.S = v6Var.h(a0.i(72.0f) - (a0.i(12.0f) * 2));
        this.R = v6Var;
    }

    public void setTitleColorId(int i10) {
        this.f18311a.setTextColor(j.L(i10));
    }
}
