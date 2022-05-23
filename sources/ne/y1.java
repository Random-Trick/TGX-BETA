package ne;

import ae.j;
import android.content.Context;
import android.graphics.RectF;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.FrameLayout;
import android.widget.TextView;
import ce.a0;
import ce.c0;
import ce.j0;
import ce.o;
import ce.p0;
import eb.k;
import gd.w;
import ib.i;
import ie.d0;
import me.vkryl.android.widget.FrameLayoutFix;
import oc.v0;
import org.thunderdog.challegram.R;
import ud.v4;
import ud.x2;
import zd.o6;

public class y1 extends FrameLayoutFix implements View.OnFocusChangeListener, k.b, TextWatcher, TextView.OnEditorActionListener {
    public k A0;
    public boolean B0;
    public k C0;
    public boolean D0;
    public TextView M;
    public v1 N;
    public TextView O;
    public boolean P;
    public d Q;
    public h R;
    public c S;
    public e T;
    public d0 U;
    public f W;
    public boolean f18434a0;
    public v4<?> f18436c0;
    public o2 f18437d0;
    public eb.f f18438e0;
    public x2.l f18439f0;
    public g f18440g0;
    public CharSequence f18441h0;
    public String f18442i0;
    public boolean f18443j0;
    public boolean f18444k0;
    public boolean f18445l0;
    public boolean f18446m0;
    public boolean f18447n0;
    public k f18448o0;
    public k f18449p0;
    public float f18450q0;
    public float f18451r0;
    public float f18452s0;
    public k f18453t0;
    public float f18454u0;
    public CharSequence f18455v0;
    public CharSequence f18456w0;
    public boolean f18457x0;
    public Runnable f18458y0;
    public boolean f18459z0;
    public int V = R.id.theme_color_text;
    public int f18435b0 = -1;

    public class a extends v1 {
        public a(Context context) {
            super(context);
        }

        @Override
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (y1.this.W != null && y1.this.W.a(y1.this)) {
                editorInfo.imeOptions &= -1073741825;
            }
            return onCreateInputConnection;
        }
    }

    public class b extends b2 {
        public b(Context context) {
            super(context);
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (y1.this.f18434a0) {
                setPivotX(getMeasuredWidth());
            } else {
                setPivotX(0.0f);
            }
        }
    }

    public interface c {
        boolean t6(y1 y1Var);
    }

    public interface d {
        void N4(y1 y1Var, boolean z10);
    }

    public interface e {
        void i4(y1 y1Var, boolean z10);
    }

    public interface f {
        boolean a(y1 y1Var);
    }

    public interface g {
        void a(y1 y1Var, o2 o2Var);
    }

    public interface h {
        void p4(y1 y1Var, CharSequence charSequence);
    }

    public y1(Context context) {
        super(context);
        W1(context, true);
    }

    public static int R1(float f10) {
        return ib.d.b((int) (f10 * 255.0f), j.P0());
    }

    public void X1(View view) {
        g gVar = this.f18440g0;
        if (gVar != null) {
            gVar.a(this, this.f18437d0);
        }
    }

    public void Y1(RectF rectF) {
        rectF.offset((-a0.i(40.0f)) * (1.0f - this.f18438e0.g()), 0.0f);
    }

    private void setFactor(float f10) {
        if (this.f18451r0 != f10) {
            this.f18451r0 = f10;
            p2();
            this.N.A(f10);
        }
    }

    private void setFadeFactor(float f10) {
        if (this.f18454u0 != f10) {
            this.f18454u0 = f10;
            float interpolation = db.b.f7287b.getInterpolation(f10);
            float f11 = interpolation <= 0.5f ? interpolation / 0.5f : 1.0f - ((interpolation - 0.5f) / 0.5f);
            if (interpolation > 0.5f && !this.f18459z0) {
                O1();
            }
            float f12 = 1.0f - f11;
            this.N.setTextColor(R1(f12));
            TextView textView = this.M;
            if (textView != null) {
                textView.setAlpha(f12);
            }
        }
    }

    private void setIsNotEmpty(boolean z10) {
        if (this.P != z10) {
            this.P = z10;
            d dVar = this.Q;
            if (dVar != null) {
                dVar.N4(this, !z10);
            }
        }
    }

    private void setRadioVisibility(float f10) {
        this.f18437d0.setAlpha(f10);
        this.f18437d0.setTranslationX((-a0.i(40.0f)) * (1.0f - f10));
        this.N.setTranslationX(a0.i(40.0f) * f10);
        x2.l lVar = this.f18439f0;
        if (lVar != null) {
            lVar.U();
        }
    }

    private void setReverseScaleFactor(float f10) {
        if (this.f18452s0 != f10) {
            this.f18452s0 = f10;
            p2();
        }
    }

    private void setTextAlphaFactor(float f10) {
        if (this.f18450q0 != f10) {
            this.f18450q0 = f10;
            this.N.setTextColor(R1(f10));
        }
    }

    private void setTextImpl(CharSequence charSequence) {
        this.N.setText(charSequence);
        p0.f0(this.N, charSequence != null ? charSequence.length() : 0);
    }

    public void D1(@Deprecated boolean z10) {
        if (this.O == null) {
            this.N.setParent(this);
            FrameLayout.LayoutParams q12 = FrameLayoutFix.q1(-2, -2);
            q12.topMargin = z10 ? a0.i(19.0f) : a0.i(20.0f) + a0.i(11.0f);
            int i10 = a0.i(6.0f);
            q12.rightMargin = i10;
            q12.leftMargin = i10;
            q12.gravity = this.f18434a0 ? 3 : 5;
            b2 b2Var = new b2(getContext());
            this.O = b2Var;
            b2Var.setTextColor(j.R0());
            this.O.setTextSize(1, 13.0f);
            this.O.setTypeface(o.k());
            this.O.setAlpha(0.0f);
            this.O.setLayoutParams(q12);
            TextView textView = this.M;
            FrameLayout.LayoutParams layoutParams = textView != null ? (FrameLayout.LayoutParams) textView.getLayoutParams() : null;
            if (this.f18434a0) {
                if (layoutParams != null) {
                    layoutParams.leftMargin = a0.i(40.0f);
                }
                v1 v1Var = this.N;
                v1Var.setPadding(v1Var.getPaddingLeft() + a0.i(32.0f), this.N.getPaddingTop(), this.N.getPaddingRight(), this.N.getPaddingBottom());
            } else {
                if (layoutParams != null) {
                    layoutParams.rightMargin = a0.i(40.0f);
                }
                v1 v1Var2 = this.N;
                v1Var2.setPadding(v1Var2.getPaddingLeft(), this.N.getPaddingTop(), this.N.getPaddingRight() + a0.i(32.0f), this.N.getPaddingBottom());
            }
            addView(this.O);
        }
    }

    public void E1() {
        if (this.f18437d0 == null) {
            o2 e10 = o2.e(getContext(), true);
            this.f18437d0 = e10;
            p0.p0(e10);
            this.f18437d0.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    y1.this.X1(view);
                }
            });
            this.f18437d0.setAlpha(0.0f);
            ((ViewGroup) getParent()).addView(this.f18437d0);
            this.f18438e0 = new eb.f(6, this, db.b.f7287b, 180L);
        }
    }

    public void G1(v4<?> v4Var) {
        this.f18436c0 = v4Var;
        if (v4Var != null) {
            v4Var.z8(this.N, this.V);
            TextView textView = this.M;
            if (textView != null) {
                v4Var.z8(textView, R.id.theme_color_textPlaceholder);
            }
            v4Var.t8(this.N);
            v4Var.r8(this.N, R.id.theme_color_textSelectionHighlight);
            v4Var.s8(this.N, R.id.theme_color_textPlaceholder);
            TextView textView2 = this.O;
            if (textView2 != null) {
                v4Var.z8(textView2, R.id.theme_color_textLight);
            }
            o2 o2Var = this.f18437d0;
            if (o2Var != null) {
                v4Var.t8(o2Var);
            }
        }
    }

    public final void H1(float f10) {
        if (this.f18449p0 == null) {
            this.f18449p0 = new k(5, this, db.b.f7287b, 130L, this.f18450q0);
        }
        this.f18449p0.i(f10);
    }

    public final void I1(float f10) {
        if (this.A0 == null) {
            this.A0 = new k(3, this, db.b.f7287b, 180L);
        }
        this.A0.i(f10);
    }

    public final void K1(float f10) {
        if (this.f18448o0 == null) {
            this.f18448o0 = new k(0, this, db.b.f7287b, 150L, this.f18451r0);
        }
        this.f18448o0.i(f10);
    }

    public final void L1(float f10) {
        if (this.C0 == null) {
            this.C0 = new k(4, this, db.b.f7287b, 180L);
        }
        this.C0.i(f10);
    }

    public final void O1() {
        if (!this.f18459z0) {
            this.f18459z0 = true;
            this.N.setIsPassword(this.f18457x0);
            if (!i.i(this.f18456w0)) {
                this.N.setText(this.f18456w0);
                p0.f0(this.N, this.f18456w0.length());
            } else {
                this.N.setText("");
            }
            TextView textView = this.M;
            if (textView != null) {
                textView.setText(this.f18455v0);
            }
            Runnable runnable = this.f18458y0;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void P1(boolean z10) {
        if (this.f18434a0 != z10) {
            this.f18434a0 = z10;
            int i10 = 5;
            this.N.setGravity((z10 ? 5 : 3) | 16);
            TextView textView = this.M;
            if (textView != null) {
                if (!z10) {
                    i10 = 3;
                }
                textView.setGravity(i10 | 16);
            }
        }
    }

    public final void S1(float f10) {
        k kVar = this.f18449p0;
        if (kVar != null) {
            kVar.l(f10);
        }
        setTextAlphaFactor(f10);
    }

    public final void T1(float f10) {
        k kVar = this.f18448o0;
        if (kVar != null) {
            kVar.l(f10);
        }
        setFactor(f10);
        if (this.f18444k0) {
            S1(f10);
        }
    }

    public boolean V1() {
        return this.B0;
    }

    public final void W1(Context context, boolean z10) {
        FrameLayout.LayoutParams q12 = FrameLayoutFix.q1(-1, -2);
        q12.topMargin = a0.i(z10 ? 20.0f : 8.0f);
        a aVar = new a(context);
        this.N = aVar;
        aVar.setImeOptions(268435456);
        this.N.setTypeface(o.k());
        this.N.setGravity(19);
        this.N.setTextSize(1, 17.0f);
        this.N.setBackgroundResource(R.drawable.transparent);
        this.N.setTextColor(j.L(this.V));
        this.N.setHintTextColor(j.U0());
        this.N.setLayoutParams(q12);
        this.N.addTextChangedListener(this);
        this.N.setPadding(a0.i(1.5f), a0.i(8.0f), a0.i(1.5f), a0.i(9.0f));
        addView(this.N);
        if (z10) {
            FrameLayout.LayoutParams q13 = FrameLayoutFix.q1(-1, a0.i(40.0f));
            q13.topMargin = a0.i(20.0f);
            b bVar = new b(context);
            this.M = bVar;
            bVar.setPivotY(0.0f);
            this.M.setTypeface(o.k());
            this.M.setSingleLine(true);
            this.M.setEllipsize(TextUtils.TruncateAt.END);
            this.M.setTextColor(j.U0());
            this.M.setTextSize(1, 17.0f);
            this.M.setPadding(a0.i(1.5f), 0, a0.i(1.5f), 0);
            this.M.setGravity(19);
            this.M.setLayoutParams(q13);
            addView(this.M);
        }
        this.N.setOnFocusChangeListener(this);
    }

    public void Z1(float f10) {
        TextView textView = this.O;
        if (textView != null) {
            textView.setAlpha(f10);
        }
    }

    public void a2(int i10, String str, boolean z10, Runnable runnable) {
        d2(w.i1(i10), str, z10, runnable);
    }

    @Override
    public void afterTextChanged(Editable editable) {
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public void c2(int i10, boolean z10, Runnable runnable) {
        d2(w.i1(i10), null, z10, runnable);
    }

    public void d2(CharSequence charSequence, CharSequence charSequence2, boolean z10, Runnable runnable) {
        k kVar = this.f18453t0;
        if (kVar == null) {
            this.f18453t0 = new k(1, this, db.b.f7290e, 360L, this.f18454u0);
        } else {
            kVar.l(0.0f);
            this.f18454u0 = 0.0f;
        }
        this.f18459z0 = false;
        this.f18455v0 = charSequence;
        this.f18456w0 = charSequence2;
        this.f18457x0 = z10;
        this.f18458y0 = runnable;
        this.f18453t0.i(1.0f);
    }

    public void f2(CharSequence charSequence, boolean z10) {
        this.f18441h0 = charSequence;
        if (charSequence != null && !getText().toString().equals(charSequence)) {
            this.f18441h0 = null;
            j2(charSequence, z10);
            this.f18441h0 = charSequence;
        }
    }

    public void g2(boolean z10, boolean z11) {
        if (this.f18447n0 != z10) {
            this.f18447n0 = z10;
            this.N.B(this.f18446m0, false);
            float f10 = 0.0f;
            if (this.f18444k0 && !z10 && this.N.getText().toString().trim().length() > 0) {
                H1(0.0f);
            } else if (z11) {
                if (z10) {
                    f10 = 1.0f;
                }
                K1(f10);
            } else {
                if (z10) {
                    f10 = 1.0f;
                }
                T1(f10);
            }
        } else {
            this.N.B(this.f18446m0, z11);
        }
    }

    public v1 getEditText() {
        return this.N;
    }

    public CharSequence getText() {
        return this.N.getText();
    }

    public void h2(boolean z10, boolean z11) {
        if (this.f18437d0 != null || z10) {
            E1();
            this.f18437d0.c(z10, z11);
        }
    }

    public void i2(boolean z10, boolean z11) {
        if (this.f18437d0 != null || z10) {
            E1();
            this.f18438e0.p(z10, z11);
        }
    }

    public boolean isEmpty() {
        return this.N.getText().length() == 0;
    }

    public void j2(CharSequence charSequence, boolean z10) {
        boolean z11 = (charSequence != null && charSequence.length() > 0) || this.f18446m0 || !i.i(this.N.getHint());
        if (!z10 || !this.f18444k0) {
            setTextImpl(charSequence);
            this.f18447n0 = z11;
            T1(z11 ? 1.0f : 0.0f);
            return;
        }
        if (z11) {
            setTextImpl(charSequence);
        }
        setIsActive(z11);
    }

    public void k2() {
        this.f18444k0 = true;
        this.N.setTextColor(R1(0.0f));
    }

    public void l2(v4<?> v4Var, o6 o6Var, int i10) {
        if (this.f18437d0 == null) {
            E1();
        }
        x2.l lVar = this.f18439f0;
        if (lVar != null) {
            lVar.E(true);
        }
        this.f18439f0 = j0.r(getContext()).I3().g(this.f18437d0).i(v4Var).x(new x2.g() {
            @Override
            public final void a(RectF rectF) {
                y1.this.Y1(rectF);
            }
        }).C(o6Var, i10).F();
    }

    public final void m2(boolean z10) {
        g2(this.f18445l0 || this.f18446m0 || !isEmpty() || !i.i(this.N.getHint()), z10);
    }

    public final void n2() {
        TextView textView = this.O;
        if (textView != null) {
            int i10 = this.f18435b0;
            if (i10 == -1) {
                textView.setText("");
                return;
            }
            int length = i10 - this.N.getText().length();
            if (length > 50) {
                this.O.setText("");
                return;
            }
            this.O.setText(c0.f(length));
            this.O.setTextColor(j.L(length <= 0 ? R.id.theme_color_textNegative : R.id.theme_color_textLight));
        }
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        switch (i10) {
            case 0:
                setFactor(f10);
                return;
            case 1:
                setFadeFactor(f10);
                return;
            case 2:
                setReverseScaleFactor(1.0f - f10);
                return;
            case 3:
                this.N.setErrorFactor(f10);
                return;
            case 4:
                this.N.setGoodFactor(f10);
                return;
            case 5:
                setTextAlphaFactor(f10);
                return;
            case 6:
                setRadioVisibility(f10);
                return;
            default:
                return;
        }
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        float f11 = 1.0f;
        if (i10 != 0) {
            if (i10 == 5 && f10 == 0.0f && this.f18444k0 && !this.f18447n0) {
                setTextImpl("");
                if (!this.f18447n0) {
                    f11 = 0.0f;
                }
                K1(f11);
            }
        } else if (f10 == 1.0f && this.f18444k0 && this.N.getText().toString().trim().length() > 0) {
            H1(1.0f);
        }
    }

    @Override
    public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        c cVar;
        return v0.m1(i10, keyEvent) && (cVar = this.S) != null && cVar.t6(this);
    }

    @Override
    public void onFocusChange(View view, boolean z10) {
        if (this.f18446m0 != z10) {
            this.f18446m0 = z10;
            m2(true);
            e eVar = this.T;
            if (eVar != null) {
                eVar.i4(this, z10);
            }
        }
    }

    @Override
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        c cVar;
        return (i10 == 66 && (cVar = this.S) != null && cVar.t6(this)) || super.onKeyDown(i10, keyEvent);
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (!this.f18443j0) {
            CharSequence charSequence2 = this.f18441h0;
            if (charSequence2 == null || charSequence2.equals(charSequence)) {
                if (!i.i(charSequence)) {
                    m2(true);
                }
                n2();
                String charSequence3 = charSequence.toString();
                String str = this.f18442i0;
                if (str == null || !str.equals(charSequence3)) {
                    this.f18442i0 = charSequence3;
                    if (this.f18444k0 && this.f18446m0) {
                        S1(charSequence3.trim().length() > 0 ? 1.0f : 0.0f);
                    }
                    setIsNotEmpty(!charSequence3.isEmpty());
                    h hVar = this.R;
                    if (hVar != null) {
                        hVar.p4(this, charSequence3);
                        return;
                    }
                    return;
                }
                return;
            }
            this.f18443j0 = true;
            setText(this.f18441h0);
            this.f18443j0 = false;
        }
    }

    public final void p2() {
        TextView textView = this.M;
        if (textView != null) {
            float f10 = this.f18451r0 * (1.0f - this.f18452s0);
            float f11 = 1.0f - (0.23076923f * f10);
            textView.setScaleX(f11);
            this.M.setScaleY(f11);
            this.M.setTranslationY((-a0.i(20.0f)) * f10);
        }
    }

    public void setAlwaysActive(boolean z10) {
        if (this.f18445l0 != z10) {
            this.f18445l0 = z10;
            m2(false);
        }
    }

    public void setBlockedText(CharSequence charSequence) {
        f2(charSequence, false);
    }

    public void setDoneListener(c cVar) {
        boolean z10 = this.S != null;
        this.S = cVar;
        if (!z10 && cVar != null) {
            this.N.setOnEditorActionListener(this);
        } else if (z10 && cVar == null) {
            this.N.setOnEditorActionListener(null);
        }
    }

    public void setEmptyHint(int i10) {
        this.N.setHint(i10 != 0 ? w.i1(i10) : null);
    }

    public void setEmptyListener(d dVar) {
        this.Q = dVar;
    }

    public void setFocusListener(e eVar) {
        this.T = eVar;
    }

    public void setHeightChangeListener(d0 d0Var) {
        this.U = d0Var;
    }

    public void setHint(int i10) {
        TextView textView = this.M;
        if (textView != null) {
            textView.setText(w.i1(i10));
        }
    }

    public void setInErrorState(boolean z10) {
        if (this.B0 != z10) {
            this.B0 = z10;
            I1(z10 ? 1.0f : 0.0f);
        }
    }

    public void setInGoodState(boolean z10) {
        if (this.D0 != z10) {
            this.D0 = z10;
            L1(z10 ? 1.0f : 0.0f);
        }
    }

    public void setInputEnabled(boolean z10) {
        this.N.setEnabled(z10);
        setTextColorId(z10 ? R.id.theme_color_text : R.id.theme_color_textLight);
    }

    public void setIsActive(boolean z10) {
        g2(z10, true);
    }

    public void setMaxLength(int i10) {
        if (this.f18435b0 != i10) {
            this.f18435b0 = i10;
            D1(false);
            n2();
        }
    }

    public void setNeedNextButton(f fVar) {
        this.W = fVar;
    }

    public void setOnRadioClickListener(g gVar) {
        this.f18440g0 = gVar;
    }

    public void setText(CharSequence charSequence) {
        j2(charSequence, false);
    }

    public void setTextColorId(int i10) {
        if (this.V != i10) {
            this.V = i10;
            this.N.setTextColor(j.L(i10));
            v4<?> v4Var = this.f18436c0;
            if (v4Var != null) {
                v4Var.n8(this, i10);
            }
        }
    }

    public void setTextListener(h hVar) {
        this.R = hVar;
    }

    public void setHint(CharSequence charSequence) {
        TextView textView = this.M;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public y1(Context context, boolean z10) {
        super(context);
        W1(context, z10);
    }
}
