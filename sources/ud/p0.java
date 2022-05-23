package ud;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.FrameLayout;
import ce.a0;
import ce.x;
import ce.y;
import db.g;
import gd.w;
import he.n;
import kb.c;
import ld.h;
import ld.i;
import ld.p;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.HeaderEditText;
import ud.d1;

public class p0 extends FrameLayoutFix implements c2, c, i2, TextWatcher, d1.c {
    public final v4<?> M;
    public HeaderEditText N;
    public int Q;
    public a R;
    public float S;
    public int T;
    public h U;
    public boolean V;
    public float W;
    public float f24342a0;
    public final Drawable P = ce.c.g(getResources(), R.drawable.baseline_camera_alt_24);
    public final p O = new p(this, a0.i(30.5f));

    public interface a {
        void E0(boolean z10);
    }

    public p0(Context context, v4<?> v4Var) {
        super(context);
        this.M = v4Var;
        setWillNotDraw(false);
        FrameLayout.LayoutParams q12 = FrameLayoutFix.q1(-1, a0.i(62.0f));
        q12.topMargin = a0.i(62.0f);
        setLayoutParams(q12);
        FrameLayout.LayoutParams q13 = FrameLayoutFix.q1(-1, -2);
        q13.gravity = w.F1() | 16;
        if (w.G2()) {
            q13.leftMargin = a0.i(20.0f);
            q13.rightMargin = a0.i(96.0f);
        } else {
            q13.rightMargin = a0.i(20.0f);
            q13.leftMargin = a0.i(96.0f);
        }
        HeaderEditText z10 = HeaderEditText.z(this, false, null);
        this.N = z10;
        z10.setHint(w.i1(R.string.ChannelName));
        this.N.addTextChangedListener(this);
        this.N.s();
        this.N.setLayoutParams(q13);
        this.N.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Log.TAG_YOUTUBE)});
        addView(this.N);
    }

    public final void A1() {
        int i10 = a0.i(36.0f);
        int i11 = a0.i(4.0f);
        int i12 = a0.i(20.5f) + ((int) (a0.i(10.0f) * this.S));
        this.T = i12;
        int i13 = i12 * 2;
        int i14 = i11 + this.T + i10 + ((int) ((-a0.i(53.5f)) * this.S));
        if (w.G2()) {
            i14 = (getMeasuredWidth() - i14) - i13;
        }
        this.O.E0(this.T);
        this.O.K0(i14, 0, i14 + i13, i13);
    }

    public final void B1() {
        if (this.N.isEnabled()) {
            x.c(this.N);
            this.M.c().hd().p8(this.M, this.U != null);
            g.c(this);
        }
    }

    public final void C1(boolean z10) {
        if (z10 && (this.Q & 1) != 0) {
            return;
        }
        if (z10 || (this.Q & 1) != 0) {
            if (z10) {
                this.Q |= 1;
            } else {
                this.Q &= -2;
            }
            a aVar = this.R;
            if (aVar != null && (this.Q & 2) == 0) {
                aVar.E0(z10);
            }
        }
    }

    public void D1(int i10, int i11) {
        if (i10 != 0) {
            this.N.setHint(w.i1(i10));
        }
        if (i11 != 0) {
            this.N.setInputType(i11);
        }
    }

    @Override
    public void Q2() {
        this.O.G(null);
    }

    @Override
    public void afterTextChanged(Editable editable) {
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public h getImageFile() {
        return this.U;
    }

    public String getInput() {
        return this.N.getText().toString();
    }

    public EditText getInputView() {
        return this.N;
    }

    public String getPhoto() {
        h hVar = this.U;
        if (hVar == null || !(hVar instanceof i)) {
            return null;
        }
        return ((i) hVar).D0();
    }

    @Override
    public void k0(float f10, float f11, float f12, boolean z10) {
        float a10 = n.a(f10);
        if (this.S != a10) {
            this.S = a10;
            A1();
            float f13 = 1.0f - a10;
            if (f13 == 0.0f) {
                setTranslationY(0.0f);
                this.N.setTranslationX(0.0f);
                this.N.setTranslationY(0.0f);
            } else {
                this.N.setTranslationX(a0.i(20.0f) * f13);
                this.N.setTranslationY((-a0.i(10.0f)) * f13);
                setTranslationY((-n.e()) * f13);
            }
            invalidate();
        }
    }

    @Override
    public void m(d1 d1Var, int i10) {
        ce.p0.m0(this, i10 + a0.i(62.0f));
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        p pVar = this.O;
        if (pVar != null) {
            pVar.e();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p pVar = this.O;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        A1();
        this.O.draw(canvas);
        int J0 = this.O.J0();
        int x02 = this.O.x0();
        canvas.drawCircle(J0, x02, this.T, y.g(Log.TAG_TDLIB_FILES));
        Drawable drawable = this.P;
        ce.c.b(canvas, drawable, J0 - ((int) (drawable.getMinimumWidth() * 0.5f)), x02 - ((int) (this.P.getMinimumHeight() * 0.5f)), y.W(-1));
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        A1();
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        C1(charSequence.toString().trim().length() > 0);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (this.O.w(x10, y10)) {
                this.V = true;
                this.W = x10;
                this.f24342a0 = y10;
                return true;
            }
            this.V = false;
        } else if (action != 1) {
            if (action != 2) {
                if (action == 3) {
                    this.V = false;
                }
            } else if (this.V && Math.max(Math.abs(motionEvent.getX() - this.W), Math.abs(motionEvent.getY() - this.f24342a0)) > a0.p()) {
                this.V = false;
            }
        } else if (this.V) {
            B1();
            this.V = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void s() {
        this.N.setGravity(w.F1() | 16);
        int i10 = a0.i(96.0f);
        int i11 = a0.i(20.0f);
        if (ce.p0.V(this.N, w.F1() | 16)) {
            HeaderEditText headerEditText = this.N;
            int i12 = w.G2() ? i11 : i10;
            if (!w.G2()) {
                i10 = i11;
            }
            if (ce.p0.a0(headerEditText, i12, 0, i10, 0)) {
                ce.p0.r0(this.N);
            }
        }
        invalidate();
    }

    public void setImeOptions(int i10) {
        this.N.setImeOptions(i10);
    }

    public void setInput(String str) {
        if (str != null) {
            this.Q |= 2;
            this.N.setText(str);
            ce.p0.f0(this.N, str.length());
            this.Q &= -3;
        }
    }

    public void setInputEnabled(boolean z10) {
        this.N.setEnabled(z10);
    }

    public void setNextField(int i10) {
        this.N.setNextFocusDownId(i10);
    }

    public void setPhoto(h hVar) {
        this.U = hVar;
        this.O.G(hVar);
    }

    public void setReadyCallback(a aVar) {
        this.R = aVar;
    }

    public boolean z1() {
        return this.N.getText().toString().trim().length() == 0;
    }
}
