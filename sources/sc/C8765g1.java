package sc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1363c0;
import be.C1410y;
import me.C6918i3;
import nc.C7389v0;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3950k;
import p080fb.C4335b;
import p080fb.C4336c;
import p082fd.C4403w;
import p108hb.C5064d;
import p139jb.AbstractC5911c;
import p156kd.C6246h;
import p156kd.C6253l;
import p156kd.C6257p;
import p364zd.C11524j;

public class C8765g1 extends View implements AbstractC5911c, C3950k.AbstractC3952b, C4336c.AbstractC4337a, C6246h.AbstractC6247a {
    public int f28267M;
    public AbstractC8766a f28269O;
    public boolean f28270P;
    public View.OnLongClickListener f28271Q;
    public String f28272R;
    public int f28273S;
    public String f28275U;
    public boolean f28276V;
    public C3950k f28277W;
    public final C6257p f28278a;
    public float f28279a0;
    public C6246h f28280b;
    public C6918i3 f28281b0;
    public int f28282c;
    public int f28274T = -1;
    public final C4336c f28268N = new C4336c(this);

    public interface AbstractC8766a {
        void mo11473x(View view, boolean z);
    }

    public C8765g1(Context context) {
        super(context);
        C6257p pVar = new C6257p(this, 0);
        this.f28278a = pVar;
        pVar.m20820F();
        pVar.mo20251S0(true);
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
    }

    private void setFactor(float f) {
        if (this.f28279a0 != f) {
            this.f28279a0 = f;
            if (f > 0.0f && this.f28281b0 == null) {
                this.f28281b0 = C6918i3.m18460h(f, this.f28275U);
            }
            invalidate();
        }
    }

    @Override
    public boolean mo7429B(float f, float f2) {
        return true;
    }

    @Override
    public void mo7428C(View view, float f, float f2) {
        if (this.f28269O != null) {
            int i = C1357a0.m37541i(24.0f) * 2;
            this.f28269O.mo11473x(view, f2 <= ((float) i) && f >= ((float) (getMeasuredWidth() - i)));
        }
    }

    @Override
    public void mo7427F(View view, float f, float f2) {
        C4335b.m28254h(this, view, f, f2);
    }

    @Override
    public boolean mo7426K4() {
        return C4335b.m28261a(this);
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        setFactor(f);
    }

    @Override
    public boolean mo7425W6(float f, float f2) {
        return C4335b.m28259c(this, f, f2);
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    @Override
    public void mo7424Z4(View view, float f, float f2) {
        C4335b.m28256f(this, view, f, f2);
    }

    @Override
    public void mo11483a(C6246h hVar) {
        if (this.f28280b == hVar) {
            this.f28278a.clear();
            this.f28278a.m20819G(this.f28280b);
        }
    }

    @Override
    public void mo4501a3() {
        this.f28278a.m20819G(null);
        C6918i3 i3Var = this.f28281b0;
        if (i3Var != null) {
            i3Var.m18467a();
            this.f28281b0 = null;
        }
        this.f28279a0 = 0.0f;
    }

    public final void m11482b(float f) {
        if (this.f28277W == null) {
            this.f28277W = new C3950k(0, this, C2057b.f7280b, 180L, this.f28279a0);
        }
        this.f28277W.m29544i(f);
    }

    public void m11481c() {
        this.f28278a.mo20245f();
    }

    public void m11480d() {
        this.f28278a.mo20247b();
    }

    public final void m11479e(float f) {
        C3950k kVar = this.f28277W;
        if (kVar != null) {
            kVar.m29541l(f);
        }
        setFactor(f);
    }

    public void m11478f(int i, boolean z) {
        if (i >= 0) {
            setSelectionIndex(i);
            m11477g(true, z);
            return;
        }
        m11477g(false, z);
    }

    @Override
    public void mo7419f3(View view, float f, float f2) {
        C4335b.m28257e(this, view, f, f2);
    }

    public final void m11477g(boolean z, boolean z2) {
        if (this.f28276V != z) {
            this.f28276V = z;
            float f = 1.0f;
            if (z2) {
                if (!z) {
                    f = 0.0f;
                }
                m11482b(f);
                return;
            }
            if (!z) {
                f = 0.0f;
            }
            m11479e(f);
        }
    }

    public C6246h getImage() {
        return this.f28280b;
    }

    @Override
    public long getLongPressDuration() {
        return C4335b.m28260b(this);
    }

    public int getReceiverOffset() {
        if (this.f28279a0 != 0.0f) {
            return (this.f28278a.getWidth() - ((int) (this.f28278a.getWidth() * (1.0f - (this.f28279a0 * 0.24f))))) / 2;
        }
        return 0;
    }

    public void m11476h(C6246h hVar, int i, boolean z) {
        C6246h hVar2 = this.f28280b;
        if (hVar2 != hVar) {
            if (hVar2 != null) {
                hVar2.m20934V(this);
            }
            this.f28280b = hVar;
            if (hVar != null) {
                hVar.m20927b(this);
            }
            this.f28278a.m20819G(hVar);
            if (hVar instanceof C6253l) {
                C6253l lVar = (C6253l) hVar;
                if (lVar.m20843e1()) {
                    int S0 = lVar.m20855S0(false);
                    int S02 = lVar.m20855S0(false);
                    if (S0 < S02) {
                        this.f28272R = C4403w.m27865j1(R.string.format_trimmedDuration, C1363c0.m37433h(S0), C1363c0.m37433h(S02));
                    } else {
                        this.f28272R = C1363c0.m37433h(S02);
                    }
                    this.f28273S = (int) C7389v0.m16680T1(this.f28272R, C1410y.m37071G0(12.0f, false, true));
                    m11478f(i, false);
                    m11475i(!z, false);
                    setSelectionIndex(i);
                    invalidate();
                }
            }
            this.f28272R = null;
            m11478f(i, false);
            m11475i(!z, false);
            setSelectionIndex(i);
            invalidate();
        }
    }

    public void m11475i(boolean z, boolean z2) {
        if (this.f28270P != z) {
            this.f28270P = z;
            invalidate();
        }
    }

    public final void m11474j() {
        this.f28278a.mo20256K0(0, 0, this.f28282c, this.f28267M);
    }

    @Override
    public boolean mo7418n0(View view, float f, float f2) {
        return this.f28269O != null;
    }

    @Override
    public void mo7417o2(View view, float f, float f2) {
        C4335b.m28255g(this, view, f, f2);
    }

    @Override
    public void onDraw(Canvas canvas) {
        C6918i3 i3Var;
        if (this.f28279a0 != 0.0f || this.f28278a.mo20246c0()) {
            canvas.drawRect(0.0f, 0.0f, this.f28282c, this.f28267M, C1410y.m37039g(C11524j.m178i()));
        }
        float f = this.f28279a0;
        boolean z = f != 0.0f;
        if (z) {
            float f2 = 1.0f - (f * 0.24f);
            canvas.save();
            canvas.scale(f2, f2, this.f28278a.mo20257I0(), this.f28278a.mo20227y0());
        }
        this.f28278a.draw(canvas);
        String str = this.f28272R;
        if (str != null && !str.isEmpty()) {
            int left = this.f28278a.getLeft() + C1357a0.m37541i(7.0f);
            int top = this.f28278a.getTop() + C1357a0.m37541i(5.0f);
            RectF a0 = C1410y.m37050a0();
            a0.set(left - C1357a0.m37541i(3.0f), top - C1357a0.m37541i(2.0f), this.f28273S + left + C1357a0.m37541i(3.0f), C1357a0.m37541i(15.0f) + top);
            canvas.drawRoundRect(a0, C1357a0.m37541i(4.0f), C1357a0.m37541i(4.0f), C1410y.m37039g(1275068416));
            canvas.drawText(this.f28272R, left, top + C1357a0.m37541i(11.0f), C1410y.m37071G0(12.0f, false, false));
        }
        if (z) {
            canvas.restore();
        }
        if (!this.f28270P) {
            int I0 = this.f28278a.mo20257I0() + (((int) (this.f28278a.getWidth() * 0.76f)) / 2);
            int y0 = this.f28278a.mo20227y0() - (((int) (this.f28278a.getHeight() * 0.76f)) / 2);
            canvas.drawCircle(I0, y0, C1357a0.m37541i((this.f28279a0 * 2.0f) + 9.0f), C1410y.m37060R(C5064d.m24131a(1.0f, C5064d.m24128d(-1, C5064d.m24129c(C11524j.m148w(), C11524j.m178i()), this.f28279a0))));
            float f3 = this.f28279a0;
            if (f3 != 0.0f && (i3Var = this.f28281b0) != null) {
                C6918i3.m18465c(canvas, I0, y0, f3, this.f28275U, i3Var);
            }
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.f28282c != measuredWidth || this.f28267M != measuredHeight) {
            this.f28282c = measuredWidth;
            this.f28267M = measuredHeight;
            m11474j();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f28268N.m28246e(this, motionEvent);
    }

    @Override
    public void mo7416p(View view, float f, float f2) {
        C4335b.m28253i(this, view, f, f2);
    }

    public void setAnimationsDisabled(boolean z) {
        this.f28278a.mo20251S0(z);
    }

    public void setClickListener(AbstractC8766a aVar) {
        this.f28269O = aVar;
    }

    @Override
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f28271Q = onLongClickListener;
    }

    public void setSelectionIndex(int i) {
        if (this.f28274T != i && i >= 0) {
            this.f28274T = i;
            this.f28275U = String.valueOf(i + 1);
            invalidate();
        }
    }

    @Override
    public boolean mo7415z4(View view, float f, float f2) {
        View.OnLongClickListener onLongClickListener = this.f28271Q;
        return onLongClickListener != null && onLongClickListener.onLongClick(view);
    }

    @Override
    public void mo7414z6(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4) {
        C4335b.m28252j(this, view, motionEvent, f, f2, f3, f4);
    }
}
