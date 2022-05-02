package me;

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
import be.C1357a0;
import be.C1363c0;
import be.C1379j0;
import be.C1389o;
import be.C1399s0;
import me.vkryl.android.widget.FrameLayoutFix;
import nc.C7389v0;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3940f;
import p051db.C3950k;
import p082fd.C4403w;
import p108hb.C5064d;
import p108hb.C5070i;
import p111he.AbstractC5109d0;
import p350yd.C10930q6;
import p364zd.C11524j;
import td.AbstractC9323v4;
import td.C9357x2;

public class View$OnFocusChangeListenerC7069y1 extends FrameLayoutFix implements View.OnFocusChangeListener, C3950k.AbstractC3952b, TextWatcher, TextView.OnEditorActionListener {
    public C3950k f22420A0;
    public boolean f22421B0;
    public C3950k f22422C0;
    public boolean f22423D0;
    public TextView f22424M;
    public C7043v1 f22425N;
    public TextView f22426O;
    public boolean f22427P;
    public AbstractC7073d f22428Q;
    public AbstractC7077h f22429R;
    public AbstractC7072c f22430S;
    public AbstractC7074e f22431T;
    public AbstractC5109d0 f22432U;
    public AbstractC7075f f22434W;
    public boolean f22435a0;
    public AbstractC9323v4<?> f22437c0;
    public C6985o2 f22438d0;
    public C3940f f22439e0;
    public C9357x2.C9370l f22440f0;
    public AbstractC7076g f22441g0;
    public CharSequence f22442h0;
    public String f22443i0;
    public boolean f22444j0;
    public boolean f22445k0;
    public boolean f22446l0;
    public boolean f22447m0;
    public boolean f22448n0;
    public C3950k f22449o0;
    public C3950k f22450p0;
    public float f22451q0;
    public float f22452r0;
    public float f22453s0;
    public C3950k f22454t0;
    public float f22455u0;
    public CharSequence f22456v0;
    public CharSequence f22457w0;
    public boolean f22458x0;
    public Runnable f22459y0;
    public boolean f22460z0;
    public int f22433V = R.id.theme_color_text;
    public int f22436b0 = -1;

    public class C7070a extends C7043v1 {
        public C7070a(Context context) {
            super(context);
        }

        @Override
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (View$OnFocusChangeListenerC7069y1.this.f22434W != null && View$OnFocusChangeListenerC7069y1.this.f22434W.mo17891a(View$OnFocusChangeListenerC7069y1.this)) {
                editorInfo.imeOptions &= -1073741825;
            }
            return onCreateInputConnection;
        }
    }

    public class C7071b extends C6847b2 {
        public C7071b(Context context) {
            super(context);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View$OnFocusChangeListenerC7069y1.this.f22435a0) {
                setPivotX(getMeasuredWidth());
            } else {
                setPivotX(0.0f);
            }
        }
    }

    public interface AbstractC7072c {
        boolean mo17894S0(View$OnFocusChangeListenerC7069y1 y1Var);
    }

    public interface AbstractC7073d {
        void mo17893I1(View$OnFocusChangeListenerC7069y1 y1Var, boolean z);
    }

    public interface AbstractC7074e {
        void mo17892b0(View$OnFocusChangeListenerC7069y1 y1Var, boolean z);
    }

    public interface AbstractC7075f {
        boolean mo17891a(View$OnFocusChangeListenerC7069y1 y1Var);
    }

    public interface AbstractC7076g {
        void mo17890a(View$OnFocusChangeListenerC7069y1 y1Var, C6985o2 o2Var);
    }

    public interface AbstractC7077h {
        void mo17889i2(View$OnFocusChangeListenerC7069y1 y1Var, CharSequence charSequence);
    }

    public View$OnFocusChangeListenerC7069y1(Context context) {
        super(context);
        m17911X1(context, true);
    }

    public static int m17915T1(float f) {
        return C5064d.m24131b((int) (f * 255.0f), C11524j.m217S0());
    }

    public void m17910Y1(View view) {
        AbstractC7076g gVar = this.f22441g0;
        if (gVar != null) {
            gVar.mo17890a(this, this.f22438d0);
        }
    }

    public void m17909Z1(RectF rectF) {
        rectF.offset((-C1357a0.m37544i(40.0f)) * (1.0f - this.f22439e0.m29586g()), 0.0f);
    }

    private void setFactor(float f) {
        if (this.f22452r0 != f) {
            this.f22452r0 = f;
            m17895u2();
            this.f22425N.m18031A(f);
        }
    }

    private void setFadeFactor(float f) {
        if (this.f22455u0 != f) {
            this.f22455u0 = f;
            float interpolation = C2057b.f7280b.getInterpolation(f);
            float f2 = interpolation <= 0.5f ? interpolation / 0.5f : 1.0f - ((interpolation - 0.5f) / 0.5f);
            if (interpolation > 0.5f && !this.f22460z0) {
                m17917Q1();
            }
            float f3 = 1.0f - f2;
            this.f22425N.setTextColor(m17915T1(f3));
            TextView textView = this.f22424M;
            if (textView != null) {
                textView.setAlpha(f3);
            }
        }
    }

    private void setIsNotEmpty(boolean z) {
        if (this.f22427P != z) {
            this.f22427P = z;
            AbstractC7073d dVar = this.f22428Q;
            if (dVar != null) {
                dVar.mo17893I1(this, !z);
            }
        }
    }

    private void setRadioVisibility(float f) {
        this.f22438d0.setAlpha(f);
        this.f22438d0.setTranslationX((-C1357a0.m37544i(40.0f)) * (1.0f - f));
        this.f22425N.setTranslationX(C1357a0.m37544i(40.0f) * f);
        C9357x2.C9370l lVar = this.f22440f0;
        if (lVar != null) {
            lVar.m8904U();
        }
    }

    private void setReverseScaleFactor(float f) {
        if (this.f22453s0 != f) {
            this.f22453s0 = f;
            m17895u2();
        }
    }

    private void setTextAlphaFactor(float f) {
        if (this.f22451q0 != f) {
            this.f22451q0 = f;
            this.f22425N.setTextColor(m17915T1(f));
        }
    }

    private void setTextImpl(CharSequence charSequence) {
        this.f22425N.setText(charSequence);
        C1399s0.m37172m0(this.f22425N, charSequence != null ? charSequence.length() : 0);
    }

    public void m17924G1(@Deprecated boolean z) {
        if (this.f22426O == null) {
            this.f22425N.setParent(this);
            FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(-2, -2);
            s1.topMargin = z ? C1357a0.m37544i(19.0f) : C1357a0.m37544i(20.0f) + C1357a0.m37544i(11.0f);
            int i = C1357a0.m37544i(6.0f);
            s1.rightMargin = i;
            s1.leftMargin = i;
            s1.gravity = this.f22435a0 ? 3 : 5;
            C6847b2 b2Var = new C6847b2(getContext());
            this.f22426O = b2Var;
            b2Var.setTextColor(C11524j.m213U0());
            this.f22426O.setTextSize(1, 13.0f);
            this.f22426O.setTypeface(C1389o.m37261k());
            this.f22426O.setAlpha(0.0f);
            this.f22426O.setLayoutParams(s1);
            TextView textView = this.f22424M;
            FrameLayout.LayoutParams layoutParams = textView != null ? (FrameLayout.LayoutParams) textView.getLayoutParams() : null;
            if (this.f22435a0) {
                if (layoutParams != null) {
                    layoutParams.leftMargin = C1357a0.m37544i(40.0f);
                }
                C7043v1 v1Var = this.f22425N;
                v1Var.setPadding(v1Var.getPaddingLeft() + C1357a0.m37544i(32.0f), this.f22425N.getPaddingTop(), this.f22425N.getPaddingRight(), this.f22425N.getPaddingBottom());
            } else {
                if (layoutParams != null) {
                    layoutParams.rightMargin = C1357a0.m37544i(40.0f);
                }
                C7043v1 v1Var2 = this.f22425N;
                v1Var2.setPadding(v1Var2.getPaddingLeft(), this.f22425N.getPaddingTop(), this.f22425N.getPaddingRight() + C1357a0.m37544i(32.0f), this.f22425N.getPaddingBottom());
            }
            addView(this.f22426O);
        }
    }

    public void m17923I1() {
        if (this.f22438d0 == null) {
            C6985o2 e = C6985o2.m18176e(getContext(), true);
            this.f22438d0 = e;
            C1399s0.m37152w0(e);
            this.f22438d0.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    View$OnFocusChangeListenerC7069y1.this.m17910Y1(view);
                }
            });
            this.f22438d0.setAlpha(0.0f);
            ((ViewGroup) getParent()).addView(this.f22438d0);
            this.f22439e0 = new C3940f(6, this, C2057b.f7280b, 180L);
        }
    }

    public void m17922J1(AbstractC9323v4<?> v4Var) {
        this.f22437c0 = v4Var;
        if (v4Var != null) {
            v4Var.m9119z8(this.f22425N, this.f22433V);
            TextView textView = this.f22424M;
            if (textView != null) {
                v4Var.m9119z8(textView, R.id.theme_color_textPlaceholder);
            }
            v4Var.m9163t8(this.f22425N);
            v4Var.m9178r8(this.f22425N, R.id.theme_color_textSelectionHighlight);
            v4Var.m9170s8(this.f22425N, R.id.theme_color_textPlaceholder);
            TextView textView2 = this.f22426O;
            if (textView2 != null) {
                v4Var.m9119z8(textView2, R.id.theme_color_textLight);
            }
            C6985o2 o2Var = this.f22438d0;
            if (o2Var != null) {
                v4Var.m9163t8(o2Var);
            }
        }
    }

    public final void m17921L1(float f) {
        if (this.f22450p0 == null) {
            this.f22450p0 = new C3950k(5, this, C2057b.f7280b, 130L, this.f22451q0);
        }
        this.f22450p0.m29546i(f);
    }

    public final void m17920M1(float f) {
        if (this.f22420A0 == null) {
            this.f22420A0 = new C3950k(3, this, C2057b.f7280b, 180L);
        }
        this.f22420A0.m29546i(f);
    }

    public final void m17919N1(float f) {
        if (this.f22449o0 == null) {
            this.f22449o0 = new C3950k(0, this, C2057b.f7280b, 150L, this.f22452r0);
        }
        this.f22449o0.m29546i(f);
    }

    public final void m17918O1(float f) {
        if (this.f22422C0 == null) {
            this.f22422C0 = new C3950k(4, this, C2057b.f7280b, 180L);
        }
        this.f22422C0.m29546i(f);
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        switch (i) {
            case 0:
                setFactor(f);
                return;
            case 1:
                setFadeFactor(f);
                return;
            case 2:
                setReverseScaleFactor(1.0f - f);
                return;
            case 3:
                this.f22425N.setErrorFactor(f);
                return;
            case 4:
                this.f22425N.setGoodFactor(f);
                return;
            case 5:
                setTextAlphaFactor(f);
                return;
            case 6:
                setRadioVisibility(f);
                return;
            default:
                return;
        }
    }

    public final void m17917Q1() {
        if (!this.f22460z0) {
            this.f22460z0 = true;
            this.f22425N.setIsPassword(this.f22458x0);
            if (!C5070i.m24062i(this.f22457w0)) {
                this.f22425N.setText(this.f22457w0);
                C1399s0.m37172m0(this.f22425N, this.f22457w0.length());
            } else {
                this.f22425N.setText("");
            }
            TextView textView = this.f22424M;
            if (textView != null) {
                textView.setText(this.f22456v0);
            }
            Runnable runnable = this.f22459y0;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void m17916S1(boolean z) {
        if (this.f22435a0 != z) {
            this.f22435a0 = z;
            int i = 5;
            this.f22425N.setGravity((z ? 5 : 3) | 16);
            TextView textView = this.f22424M;
            if (textView != null) {
                if (!z) {
                    i = 3;
                }
                textView.setGravity(i | 16);
            }
        }
    }

    public final void m17914U1(float f) {
        C3950k kVar = this.f22450p0;
        if (kVar != null) {
            kVar.m29543l(f);
        }
        setTextAlphaFactor(f);
    }

    public final void m17913V1(float f) {
        C3950k kVar = this.f22449o0;
        if (kVar != null) {
            kVar.m29543l(f);
        }
        setFactor(f);
        if (this.f22445k0) {
            m17914U1(f);
        }
    }

    public boolean m17912W1() {
        return this.f22421B0;
    }

    public final void m17911X1(Context context, boolean z) {
        FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(-1, -2);
        s1.topMargin = C1357a0.m37544i(z ? 20.0f : 8.0f);
        C7070a aVar = new C7070a(context);
        this.f22425N = aVar;
        aVar.setImeOptions(268435456);
        this.f22425N.setTypeface(C1389o.m37261k());
        this.f22425N.setGravity(19);
        this.f22425N.setTextSize(1, 17.0f);
        this.f22425N.setBackgroundResource(R.drawable.transparent);
        this.f22425N.setTextColor(C11524j.m228N(this.f22433V));
        this.f22425N.setHintTextColor(C11524j.m207X0());
        this.f22425N.setLayoutParams(s1);
        this.f22425N.addTextChangedListener(this);
        this.f22425N.setPadding(C1357a0.m37544i(1.5f), C1357a0.m37544i(8.0f), C1357a0.m37544i(1.5f), C1357a0.m37544i(9.0f));
        addView(this.f22425N);
        if (z) {
            FrameLayout.LayoutParams s12 = FrameLayoutFix.m18008s1(-1, C1357a0.m37544i(40.0f));
            s12.topMargin = C1357a0.m37544i(20.0f);
            C7071b bVar = new C7071b(context);
            this.f22424M = bVar;
            bVar.setPivotY(0.0f);
            this.f22424M.setTypeface(C1389o.m37261k());
            this.f22424M.setSingleLine(true);
            this.f22424M.setEllipsize(TextUtils.TruncateAt.END);
            this.f22424M.setTextColor(C11524j.m207X0());
            this.f22424M.setTextSize(1, 17.0f);
            this.f22424M.setPadding(C1357a0.m37544i(1.5f), 0, C1357a0.m37544i(1.5f), 0);
            this.f22424M.setGravity(19);
            this.f22424M.setLayoutParams(s12);
            addView(this.f22424M);
        }
        this.f22425N.setOnFocusChangeListener(this);
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        float f2 = 1.0f;
        if (i != 0) {
            if (i == 5 && f == 0.0f && this.f22445k0 && !this.f22448n0) {
                setTextImpl("");
                if (!this.f22448n0) {
                    f2 = 0.0f;
                }
                m17919N1(f2);
            }
        } else if (f == 1.0f && this.f22445k0 && this.f22425N.getText().toString().trim().length() > 0) {
            m17921L1(1.0f);
        }
    }

    public void m17908a2(float f) {
        TextView textView = this.f22426O;
        if (textView != null) {
            textView.setAlpha(f);
        }
    }

    @Override
    public void afterTextChanged(Editable editable) {
    }

    public void m17907b2(int i, String str, boolean z, Runnable runnable) {
        m17905f2(C4403w.m27871i1(i), str, z, runnable);
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void m17906d2(int i, boolean z, Runnable runnable) {
        m17905f2(C4403w.m27871i1(i), null, z, runnable);
    }

    public void m17905f2(CharSequence charSequence, CharSequence charSequence2, boolean z, Runnable runnable) {
        C3950k kVar = this.f22454t0;
        if (kVar == null) {
            this.f22454t0 = new C3950k(1, this, C2057b.f7283e, 360L, this.f22455u0);
        } else {
            kVar.m29543l(0.0f);
            this.f22455u0 = 0.0f;
        }
        this.f22460z0 = false;
        this.f22456v0 = charSequence;
        this.f22457w0 = charSequence2;
        this.f22458x0 = z;
        this.f22459y0 = runnable;
        this.f22454t0.m29546i(1.0f);
    }

    public C7043v1 getEditText() {
        return this.f22425N;
    }

    public CharSequence getText() {
        return this.f22425N.getText();
    }

    public void m17904h2(CharSequence charSequence, boolean z) {
        this.f22442h0 = charSequence;
        if (charSequence != null && !getText().toString().equals(charSequence)) {
            this.f22442h0 = null;
            m17900m2(charSequence, z);
            this.f22442h0 = charSequence;
        }
    }

    public void m17903i2(boolean z, boolean z2) {
        if (this.f22448n0 != z) {
            this.f22448n0 = z;
            this.f22425N.m18030B(this.f22447m0, false);
            float f = 0.0f;
            if (this.f22445k0 && !z && this.f22425N.getText().toString().trim().length() > 0) {
                m17921L1(0.0f);
            } else if (z2) {
                if (z) {
                    f = 1.0f;
                }
                m17919N1(f);
            } else {
                if (z) {
                    f = 1.0f;
                }
                m17913V1(f);
            }
        } else {
            this.f22425N.m18030B(this.f22447m0, z2);
        }
    }

    public boolean isEmpty() {
        return this.f22425N.getText().length() == 0;
    }

    public void m17902k2(boolean z, boolean z2) {
        if (this.f22438d0 != null || z) {
            m17923I1();
            this.f22438d0.m18178c(z, z2);
        }
    }

    public void m17901l2(boolean z, boolean z2) {
        if (this.f22438d0 != null || z) {
            m17923I1();
            this.f22439e0.m29577p(z, z2);
        }
    }

    public void m17900m2(CharSequence charSequence, boolean z) {
        boolean z2 = (charSequence != null && charSequence.length() > 0) || this.f22447m0 || !C5070i.m24062i(this.f22425N.getHint());
        if (!z || !this.f22445k0) {
            setTextImpl(charSequence);
            this.f22448n0 = z2;
            m17913V1(z2 ? 1.0f : 0.0f);
            return;
        }
        if (z2) {
            setTextImpl(charSequence);
        }
        setIsActive(z2);
    }

    public void m17899n2() {
        this.f22445k0 = true;
        this.f22425N.setTextColor(m17915T1(0.0f));
    }

    @Override
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        AbstractC7072c cVar;
        return C7389v0.m16608m1(i, keyEvent) && (cVar = this.f22430S) != null && cVar.mo17894S0(this);
    }

    @Override
    public void onFocusChange(View view, boolean z) {
        if (this.f22447m0 != z) {
            this.f22447m0 = z;
            m17897r2(true);
            AbstractC7074e eVar = this.f22431T;
            if (eVar != null) {
                eVar.mo17892b0(this, z);
            }
        }
    }

    @Override
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        AbstractC7072c cVar;
        return (i == 66 && (cVar = this.f22430S) != null && cVar.mo17894S0(this)) || super.onKeyDown(i, keyEvent);
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.f22444j0) {
            CharSequence charSequence2 = this.f22442h0;
            if (charSequence2 == null || charSequence2.equals(charSequence)) {
                if (!C5070i.m24062i(charSequence)) {
                    m17897r2(true);
                }
                m17896t2();
                String charSequence3 = charSequence.toString();
                String str = this.f22443i0;
                if (str == null || !str.equals(charSequence3)) {
                    this.f22443i0 = charSequence3;
                    if (this.f22445k0 && this.f22447m0) {
                        m17914U1(charSequence3.trim().length() > 0 ? 1.0f : 0.0f);
                    }
                    setIsNotEmpty(!charSequence3.isEmpty());
                    AbstractC7077h hVar = this.f22429R;
                    if (hVar != null) {
                        hVar.mo17889i2(this, charSequence3);
                        return;
                    }
                    return;
                }
                return;
            }
            this.f22444j0 = true;
            setText(this.f22442h0);
            this.f22444j0 = false;
        }
    }

    public void m17898p2(AbstractC9323v4<?> v4Var, C10930q6 q6Var, int i) {
        if (this.f22438d0 == null) {
            m17923I1();
        }
        C9357x2.C9370l lVar = this.f22440f0;
        if (lVar != null) {
            lVar.m8920E(true);
        }
        this.f22440f0 = C1379j0.m37310r(getContext()).m14584H3().m8985g(this.f22438d0).m8958i(v4Var).m8945x(new C9357x2.AbstractC9364g() {
            @Override
            public final void mo8975a(RectF rectF) {
                View$OnFocusChangeListenerC7069y1.this.m17909Z1(rectF);
            }
        }).m8972C(q6Var, i).m8919F();
    }

    public final void m17897r2(boolean z) {
        m17903i2(this.f22446l0 || this.f22447m0 || !isEmpty() || !C5070i.m24062i(this.f22425N.getHint()), z);
    }

    public void setAlwaysActive(boolean z) {
        if (this.f22446l0 != z) {
            this.f22446l0 = z;
            m17897r2(false);
        }
    }

    public void setBlockedText(CharSequence charSequence) {
        m17904h2(charSequence, false);
    }

    public void setDoneListener(AbstractC7072c cVar) {
        boolean z = this.f22430S != null;
        this.f22430S = cVar;
        if (!z && cVar != null) {
            this.f22425N.setOnEditorActionListener(this);
        } else if (z && cVar == null) {
            this.f22425N.setOnEditorActionListener(null);
        }
    }

    public void setEmptyHint(int i) {
        this.f22425N.setHint(i != 0 ? C4403w.m27871i1(i) : null);
    }

    public void setEmptyListener(AbstractC7073d dVar) {
        this.f22428Q = dVar;
    }

    public void setFocusListener(AbstractC7074e eVar) {
        this.f22431T = eVar;
    }

    public void setHeightChangeListener(AbstractC5109d0 d0Var) {
        this.f22432U = d0Var;
    }

    public void setHint(int i) {
        TextView textView = this.f22424M;
        if (textView != null) {
            textView.setText(C4403w.m27871i1(i));
        }
    }

    public void setInErrorState(boolean z) {
        if (this.f22421B0 != z) {
            this.f22421B0 = z;
            m17920M1(z ? 1.0f : 0.0f);
        }
    }

    public void setInGoodState(boolean z) {
        if (this.f22423D0 != z) {
            this.f22423D0 = z;
            m17918O1(z ? 1.0f : 0.0f);
        }
    }

    public void setInputEnabled(boolean z) {
        this.f22425N.setEnabled(z);
        setTextColorId(z ? R.id.theme_color_text : R.id.theme_color_textLight);
    }

    public void setIsActive(boolean z) {
        m17903i2(z, true);
    }

    public void setMaxLength(int i) {
        if (this.f22436b0 != i) {
            this.f22436b0 = i;
            m17924G1(false);
            m17896t2();
        }
    }

    public void setNeedNextButton(AbstractC7075f fVar) {
        this.f22434W = fVar;
    }

    public void setOnRadioClickListener(AbstractC7076g gVar) {
        this.f22441g0 = gVar;
    }

    public void setText(CharSequence charSequence) {
        m17900m2(charSequence, false);
    }

    public void setTextColorId(int i) {
        if (this.f22433V != i) {
            this.f22433V = i;
            this.f22425N.setTextColor(C11524j.m228N(i));
            AbstractC9323v4<?> v4Var = this.f22437c0;
            if (v4Var != null) {
                v4Var.m9205n8(this, i);
            }
        }
    }

    public void setTextListener(AbstractC7077h hVar) {
        this.f22429R = hVar;
    }

    public final void m17896t2() {
        TextView textView = this.f22426O;
        if (textView != null) {
            int i = this.f22436b0;
            if (i == -1) {
                textView.setText("");
                return;
            }
            int length = i - this.f22425N.getText().length();
            if (length > 50) {
                this.f22426O.setText("");
                return;
            }
            this.f22426O.setText(C1363c0.m37440f(length));
            this.f22426O.setTextColor(C11524j.m228N(length <= 0 ? R.id.theme_color_textNegative : R.id.theme_color_textLight));
        }
    }

    public final void m17895u2() {
        TextView textView = this.f22424M;
        if (textView != null) {
            float f = this.f22452r0 * (1.0f - this.f22453s0);
            float f2 = 1.0f - (0.23076923f * f);
            textView.setScaleX(f2);
            this.f22424M.setScaleY(f2);
            this.f22424M.setTranslationY((-C1357a0.m37544i(20.0f)) * f);
        }
    }

    public void setHint(CharSequence charSequence) {
        TextView textView = this.f22424M;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public View$OnFocusChangeListenerC7069y1(Context context, boolean z) {
        super(context);
        m17911X1(context, z);
    }
}
