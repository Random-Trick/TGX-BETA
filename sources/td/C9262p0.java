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
    public final AbstractC9323v4<?> f29915M;
    public HeaderEditText f29916N;
    public int f29919Q;
    public AbstractC9263a f29920R;
    public float f29921S;
    public int f29922T;
    public C6246h f29923U;
    public boolean f29924V;
    public float f29925W;
    public float f29926a0;
    public final Drawable f29918P = C1362c.m37485g(getResources(), R.drawable.baseline_camera_alt_24);
    public final C6257p f29917O = new C6257p(this, C1357a0.m37544i(30.5f));

    public interface AbstractC9263a {
        void mo9773E0(boolean z);
    }

    public C9262p0(Context context, AbstractC9323v4<?> v4Var) {
        super(context);
        this.f29915M = v4Var;
        setWillNotDraw(false);
        FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(-1, C1357a0.m37544i(62.0f));
        s1.topMargin = C1357a0.m37544i(62.0f);
        setLayoutParams(s1);
        FrameLayout.LayoutParams s12 = FrameLayoutFix.m18008s1(-1, -2);
        s12.gravity = C4403w.m27991F1() | 16;
        if (C4403w.m27986G2()) {
            s12.leftMargin = C1357a0.m37544i(20.0f);
            s12.rightMargin = C1357a0.m37544i(96.0f);
        } else {
            s12.rightMargin = C1357a0.m37544i(20.0f);
            s12.leftMargin = C1357a0.m37544i(96.0f);
        }
        HeaderEditText z = HeaderEditText.m14150z(this, false, null);
        this.f29916N = z;
        z.setHint(C4403w.m27871i1(R.string.ChannelName));
        this.f29916N.addTextChangedListener(this);
        this.f29916N.mo8255s();
        this.f29916N.setLayoutParams(s12);
        this.f29916N.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Log.TAG_YOUTUBE)});
        addView(this.f29916N);
    }

    public boolean m9779C1() {
        return this.f29916N.getText().toString().trim().length() == 0;
    }

    public final void m9778D1() {
        int i = C1357a0.m37544i(36.0f);
        int i2 = C1357a0.m37544i(4.0f);
        int i3 = C1357a0.m37544i(20.5f) + ((int) (C1357a0.m37544i(10.0f) * this.f29921S));
        this.f29922T = i3;
        int i4 = i3 * 2;
        int i5 = i2 + this.f29922T + i + ((int) ((-C1357a0.m37544i(53.5f)) * this.f29921S));
        if (C4403w.m27986G2()) {
            i5 = (getMeasuredWidth() - i5) - i4;
        }
        this.f29917O.mo20260D0(this.f29922T);
        this.f29917O.mo20257K0(i5, 0, i5 + i4, i4);
    }

    public final void m9777E1() {
        if (this.f29916N.isEnabled()) {
            C1408x.m37091c(this.f29916N);
            this.f29915M.mo4348c().m2485dd().m3488p8(this.f29915M, this.f29923U != null);
            C2065g.m35722c(this);
        }
    }

    public final void m9776F1(boolean z) {
        if (z && (this.f29919Q & 1) != 0) {
            return;
        }
        if (z || (this.f29919Q & 1) != 0) {
            if (z) {
                this.f29919Q |= 1;
            } else {
                this.f29919Q &= -2;
            }
            AbstractC9263a aVar = this.f29920R;
            if (aVar != null && (this.f29919Q & 2) == 0) {
                aVar.mo9773E0(z);
            }
        }
    }

    public void m9775G1(int i, int i2) {
        if (i != 0) {
            this.f29916N.setHint(C4403w.m27871i1(i));
        }
        if (i2 != 0) {
            this.f29916N.setInputType(i2);
        }
    }

    @Override
    public void mo4501a3() {
        this.f29917O.m20820G(null);
    }

    @Override
    public void afterTextChanged(Editable editable) {
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C6246h getImageFile() {
        return this.f29923U;
    }

    public String getInput() {
        return this.f29916N.getText().toString();
    }

    public EditText getInputView() {
        return this.f29916N;
    }

    public String getPhoto() {
        C6246h hVar = this.f29923U;
        if (hVar == null || !(hVar instanceof C6250i)) {
            return null;
        }
        return ((C6250i) hVar).m20885D0();
    }

    @Override
    public void mo8402i0(float f, float f2, float f3, boolean z) {
        float a = C4896n.m24483a(f);
        if (this.f29921S != a) {
            this.f29921S = a;
            m9778D1();
            float f4 = 1.0f - a;
            if (f4 == 0.0f) {
                setTranslationY(0.0f);
                this.f29916N.setTranslationX(0.0f);
                this.f29916N.setTranslationY(0.0f);
            } else {
                this.f29916N.setTranslationX(C1357a0.m37544i(20.0f) * f4);
                this.f29916N.setTranslationY((-C1357a0.m37544i(10.0f)) * f4);
                setTranslationY((-C4896n.m24479e()) * f4);
            }
            invalidate();
        }
    }

    @Override
    public void mo9774k0(View$OnClickListenerC9170d1 d1Var, int i) {
        C1399s0.m37158t0(this, i + C1357a0.m37544i(62.0f));
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C6257p pVar = this.f29917O;
        if (pVar != null) {
            pVar.mo20246f();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C6257p pVar = this.f29917O;
        if (pVar != null) {
            pVar.mo20248b();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        m9778D1();
        this.f29917O.draw(canvas);
        int I0 = this.f29917O.mo20258I0();
        int y0 = this.f29917O.mo20228y0();
        canvas.drawCircle(I0, y0, this.f29922T, C1410y.m37042g(Log.TAG_TDLIB_FILES));
        Drawable drawable = this.f29918P;
        C1362c.m37490b(canvas, drawable, I0 - ((int) (drawable.getMinimumWidth() * 0.5f)), y0 - ((int) (this.f29918P.getMinimumHeight() * 0.5f)), C1410y.m37058W(-1));
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m9778D1();
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        m9776F1(charSequence.toString().trim().length() > 0);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.f29917O.m20794w(x, y)) {
                this.f29924V = true;
                this.f29925W = x;
                this.f29926a0 = y;
                return true;
            }
            this.f29924V = false;
        } else if (action != 1) {
            if (action != 2) {
                if (action == 3) {
                    this.f29924V = false;
                }
            } else if (this.f29924V && Math.max(Math.abs(motionEvent.getX() - this.f29925W), Math.abs(motionEvent.getY() - this.f29926a0)) > C1357a0.m37537p()) {
                this.f29924V = false;
            }
        } else if (this.f29924V) {
            m9777E1();
            this.f29924V = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void mo8255s() {
        this.f29916N.setGravity(C4403w.m27991F1() | 16);
        int i = C1357a0.m37544i(96.0f);
        int i2 = C1357a0.m37544i(20.0f);
        if (C1399s0.m37192c0(this.f29916N, C4403w.m27991F1() | 16)) {
            HeaderEditText headerEditText = this.f29916N;
            int i3 = C4403w.m27986G2() ? i2 : i;
            if (!C4403w.m27986G2()) {
                i = i2;
            }
            if (C1399s0.m37182h0(headerEditText, i3, 0, i, 0)) {
                C1399s0.m37148y0(this.f29916N);
            }
        }
        invalidate();
    }

    public void setImeOptions(int i) {
        this.f29916N.setImeOptions(i);
    }

    public void setInput(String str) {
        if (str != null) {
            this.f29919Q |= 2;
            this.f29916N.setText(str);
            C1399s0.m37172m0(this.f29916N, str.length());
            this.f29919Q &= -3;
        }
    }

    public void setInputEnabled(boolean z) {
        this.f29916N.setEnabled(z);
    }

    public void setNextField(int i) {
        this.f29916N.setNextFocusDownId(i);
    }

    public void setPhoto(C6246h hVar) {
        this.f29923U = hVar;
        this.f29917O.m20820G(hVar);
    }

    public void setReadyCallback(AbstractC9263a aVar) {
        this.f29920R = aVar;
    }
}
