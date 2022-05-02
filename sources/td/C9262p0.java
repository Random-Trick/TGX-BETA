package td;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.FrameLayout;
import be.C1357a0;
import be.C1362c;
import be.C1399s0;
import be.C1408x;
import be.C1410y;
import ge.C4896n;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.HeaderEditText;
import p037cb.C2065g;
import p082fd.C4403w;
import p139jb.AbstractC5911c;
import p156kd.C6246h;
import p156kd.C6250i;
import p156kd.C6257p;
import td.View$OnClickListenerC9170d1;

public class C9262p0 extends FrameLayoutFix implements AbstractC9165c2, AbstractC5911c, AbstractC9208i2, TextWatcher, View$OnClickListenerC9170d1.AbstractC9173c {
    public final AbstractC9323v4<?> f29912M;
    public HeaderEditText f29913N;
    public int f29916Q;
    public AbstractC9263a f29917R;
    public float f29918S;
    public int f29919T;
    public C6246h f29920U;
    public boolean f29921V;
    public float f29922W;
    public float f29923a0;
    public final Drawable f29915P = C1362c.m37482g(getResources(), R.drawable.baseline_camera_alt_24);
    public final C6257p f29914O = new C6257p(this, C1357a0.m37541i(30.5f));

    public interface AbstractC9263a {
        void mo9774E0(boolean z);
    }

    public C9262p0(Context context, AbstractC9323v4<?> v4Var) {
        super(context);
        this.f29912M = v4Var;
        setWillNotDraw(false);
        FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(-1, C1357a0.m37541i(62.0f));
        s1.topMargin = C1357a0.m37541i(62.0f);
        setLayoutParams(s1);
        FrameLayout.LayoutParams s12 = FrameLayoutFix.m18008s1(-1, -2);
        s12.gravity = C4403w.m27989F1() | 16;
        if (C4403w.m27984G2()) {
            s12.leftMargin = C1357a0.m37541i(20.0f);
            s12.rightMargin = C1357a0.m37541i(96.0f);
        } else {
            s12.rightMargin = C1357a0.m37541i(20.0f);
            s12.leftMargin = C1357a0.m37541i(96.0f);
        }
        HeaderEditText z = HeaderEditText.m14151z(this, false, null);
        this.f29913N = z;
        z.setHint(C4403w.m27869i1(R.string.ChannelName));
        this.f29913N.addTextChangedListener(this);
        this.f29913N.mo8255s();
        this.f29913N.setLayoutParams(s12);
        this.f29913N.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Log.TAG_YOUTUBE)});
        addView(this.f29913N);
    }

    public boolean m9780C1() {
        return this.f29913N.getText().toString().trim().length() == 0;
    }

    public final void m9779D1() {
        int i = C1357a0.m37541i(36.0f);
        int i2 = C1357a0.m37541i(4.0f);
        int i3 = C1357a0.m37541i(20.5f) + ((int) (C1357a0.m37541i(10.0f) * this.f29918S));
        this.f29919T = i3;
        int i4 = i3 * 2;
        int i5 = i2 + this.f29919T + i + ((int) ((-C1357a0.m37541i(53.5f)) * this.f29918S));
        if (C4403w.m27984G2()) {
            i5 = (getMeasuredWidth() - i5) - i4;
        }
        this.f29914O.mo20259D0(this.f29919T);
        this.f29914O.mo20256K0(i5, 0, i5 + i4, i4);
    }

    public final void m9778E1() {
        if (this.f29913N.isEnabled()) {
            C1408x.m37088c(this.f29913N);
            this.f29912M.mo4348c().m2485dd().m3488p8(this.f29912M, this.f29920U != null);
            C2065g.m35719c(this);
        }
    }

    public final void m9777F1(boolean z) {
        if (z && (this.f29916Q & 1) != 0) {
            return;
        }
        if (z || (this.f29916Q & 1) != 0) {
            if (z) {
                this.f29916Q |= 1;
            } else {
                this.f29916Q &= -2;
            }
            AbstractC9263a aVar = this.f29917R;
            if (aVar != null && (this.f29916Q & 2) == 0) {
                aVar.mo9774E0(z);
            }
        }
    }

    public void m9776G1(int i, int i2) {
        if (i != 0) {
            this.f29913N.setHint(C4403w.m27869i1(i));
        }
        if (i2 != 0) {
            this.f29913N.setInputType(i2);
        }
    }

    @Override
    public void mo4501a3() {
        this.f29914O.m20819G(null);
    }

    @Override
    public void afterTextChanged(Editable editable) {
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C6246h getImageFile() {
        return this.f29920U;
    }

    public String getInput() {
        return this.f29913N.getText().toString();
    }

    public EditText getInputView() {
        return this.f29913N;
    }

    public String getPhoto() {
        C6246h hVar = this.f29920U;
        if (hVar == null || !(hVar instanceof C6250i)) {
            return null;
        }
        return ((C6250i) hVar).m20884D0();
    }

    @Override
    public void mo8402i0(float f, float f2, float f3, boolean z) {
        float a = C4896n.m24482a(f);
        if (this.f29918S != a) {
            this.f29918S = a;
            m9779D1();
            float f4 = 1.0f - a;
            if (f4 == 0.0f) {
                setTranslationY(0.0f);
                this.f29913N.setTranslationX(0.0f);
                this.f29913N.setTranslationY(0.0f);
            } else {
                this.f29913N.setTranslationX(C1357a0.m37541i(20.0f) * f4);
                this.f29913N.setTranslationY((-C1357a0.m37541i(10.0f)) * f4);
                setTranslationY((-C4896n.m24478e()) * f4);
            }
            invalidate();
        }
    }

    @Override
    public void mo9775k0(View$OnClickListenerC9170d1 d1Var, int i) {
        C1399s0.m37155t0(this, i + C1357a0.m37541i(62.0f));
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C6257p pVar = this.f29914O;
        if (pVar != null) {
            pVar.mo20245f();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C6257p pVar = this.f29914O;
        if (pVar != null) {
            pVar.mo20247b();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        m9779D1();
        this.f29914O.draw(canvas);
        int I0 = this.f29914O.mo20257I0();
        int y0 = this.f29914O.mo20227y0();
        canvas.drawCircle(I0, y0, this.f29919T, C1410y.m37039g(Log.TAG_TDLIB_FILES));
        Drawable drawable = this.f29915P;
        C1362c.m37487b(canvas, drawable, I0 - ((int) (drawable.getMinimumWidth() * 0.5f)), y0 - ((int) (this.f29915P.getMinimumHeight() * 0.5f)), C1410y.m37055W(-1));
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m9779D1();
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        m9777F1(charSequence.toString().trim().length() > 0);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.f29914O.m20793w(x, y)) {
                this.f29921V = true;
                this.f29922W = x;
                this.f29923a0 = y;
                return true;
            }
            this.f29921V = false;
        } else if (action != 1) {
            if (action != 2) {
                if (action == 3) {
                    this.f29921V = false;
                }
            } else if (this.f29921V && Math.max(Math.abs(motionEvent.getX() - this.f29922W), Math.abs(motionEvent.getY() - this.f29923a0)) > C1357a0.m37534p()) {
                this.f29921V = false;
            }
        } else if (this.f29921V) {
            m9778E1();
            this.f29921V = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void mo8255s() {
        this.f29913N.setGravity(C4403w.m27989F1() | 16);
        int i = C1357a0.m37541i(96.0f);
        int i2 = C1357a0.m37541i(20.0f);
        if (C1399s0.m37189c0(this.f29913N, C4403w.m27989F1() | 16)) {
            HeaderEditText headerEditText = this.f29913N;
            int i3 = C4403w.m27984G2() ? i2 : i;
            if (!C4403w.m27984G2()) {
                i = i2;
            }
            if (C1399s0.m37179h0(headerEditText, i3, 0, i, 0)) {
                C1399s0.m37145y0(this.f29913N);
            }
        }
        invalidate();
    }

    public void setImeOptions(int i) {
        this.f29913N.setImeOptions(i);
    }

    public void setInput(String str) {
        if (str != null) {
            this.f29916Q |= 2;
            this.f29913N.setText(str);
            C1399s0.m37169m0(this.f29913N, str.length());
            this.f29916Q &= -3;
        }
    }

    public void setInputEnabled(boolean z) {
        this.f29913N.setEnabled(z);
    }

    public void setNextField(int i) {
        this.f29913N.setNextFocusDownId(i);
    }

    public void setPhoto(C6246h hVar) {
        this.f29920U = hVar;
        this.f29914O.m20819G(hVar);
    }

    public void setReadyCallback(AbstractC9263a aVar) {
        this.f29917R = aVar;
    }
}
