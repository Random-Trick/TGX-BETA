package bd;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import be.C1357a0;
import be.C1363c0;
import be.C1410y;
import java.util.concurrent.TimeUnit;
import me.C6883g1;
import me.C6918i3;
import nc.C7389v0;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.widget.SparseDrawableView;
import p037cb.C2057b;
import p051db.C3940f;
import p051db.C3950k;
import p080fb.C4336c;
import p108hb.C5064d;
import p108hb.C5069h;
import p111he.AbstractC5124k0;
import p139jb.AbstractC5911c;
import p156kd.AbstractC6264v;
import p156kd.C6257p;
import p168ld.C6503j;
import p168ld.RunnableC6507m;
import p225pd.C8112b;
import p364zd.C11524j;

public class C1355a extends SparseDrawableView implements AbstractC5911c, C3950k.AbstractC3952b, AbstractC5124k0 {
    public C6883g1.AbstractC6886c f4938O;
    public C8112b f4940Q;
    public float f4941R;
    public float f4942S;
    public C3950k f4943T;
    public String f4945V;
    public int f4946W;
    public C4336c f4947a0;
    public final C3940f f4939P = new C3940f(1, this, C2057b.f7280b, 230);
    public boolean f4944U = true;
    public final C6257p f4948b = new C6257p(this, 0);
    public final C6257p f4949c = new C6257p(this, 0);
    public final C6257p f4936M = new C6257p(this, 0);
    public final RunnableC6507m f4937N = new RunnableC6507m(this);

    public C1355a(Context context) {
        super(context);
    }

    private void setSelectionFactor(float f) {
        if (this.f4942S != f) {
            this.f4942S = f;
            invalidate();
        }
    }

    private void setText(String str) {
        String str2 = this.f4945V;
        if (str2 != null || str != null) {
            if (str == null) {
                this.f4945V = null;
                this.f4946W = 0;
            } else if (str2 == null || !str2.equals(str)) {
                this.f4945V = str;
                this.f4946W = (int) C7389v0.m16680T1(str, C1410y.m37074G0(12.0f, false, true));
            }
        }
    }

    public void m37566A(float f, float f2) {
        if (this.f4941R != f) {
            this.f4941R = f;
            m37562u(f2);
            invalidate();
            return;
        }
        m37562u(f2);
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 1) {
            invalidate();
        } else {
            setSelectionFactor(f);
        }
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    @Override
    public void mo4501a3() {
        setItem(null);
    }

    public void m37565b() {
        if (this.f4944U) {
            this.f4944U = false;
            this.f4937N.mo20248b();
            this.f4936M.mo20248b();
            this.f4948b.mo20248b();
            this.f4949c.mo20248b();
        }
    }

    public void m37564f() {
        if (!this.f4944U) {
            this.f4944U = true;
            this.f4937N.mo20246f();
            this.f4936M.mo20246f();
            this.f4948b.mo20246f();
            this.f4949c.mo20246f();
        }
    }

    @Override
    public void mo5809i(boolean z, int i) {
        m37563t(z ? 1.0f : 0.0f);
    }

    @Override
    public void onDraw(Canvas canvas) {
        C8112b bVar;
        if (this.f4940Q != null) {
            float f = this.f4942S * this.f4941R;
            boolean z = true;
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            boolean z2 = i != 0;
            if (z2) {
                canvas.drawRect(this.f4949c.getLeft(), this.f4949c.getTop(), this.f4949c.getRight(), this.f4949c.getBottom(), C1410y.m37042g(C11524j.m178i()));
                canvas.save();
                float f2 = 1.0f - (0.24f * f);
                canvas.scale(f2, f2, this.f4949c.mo20258I0(), this.f4949c.mo20228y0());
            }
            AbstractC6264v vVar = this.f4936M.m20799r() != null ? this.f4936M : this.f4937N;
            if (!(vVar == this.f4937N && (bVar = this.f4940Q) != null && bVar.m13523X() == 8)) {
                z = false;
            }
            if (z) {
                canvas.save();
                canvas.clipRect(vVar.getLeft(), vVar.getTop(), vVar.getRight(), vVar.getBottom());
                float sqrt = (float) Math.sqrt(2.0d);
                canvas.scale(sqrt, sqrt, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            }
            if (vVar.mo20247c0()) {
                if (this.f4949c.mo20247c0()) {
                    if (this.f4948b.mo20247c0()) {
                        this.f4948b.mo20256N(canvas);
                    }
                    this.f4948b.draw(canvas);
                }
                this.f4949c.draw(canvas);
            }
            vVar.draw(canvas);
            if (z) {
                canvas.restore();
            }
            boolean n0 = this.f4940Q.m13491n0();
            int left = vVar.getLeft() + C1357a0.m37544i(7.0f);
            int top = vVar.getTop() + C1357a0.m37544i(5.0f);
            if (this.f4945V != null) {
                float g = 1.0f - this.f4939P.m29586g();
                RectF a0 = C1410y.m37053a0();
                a0.set(left - C1357a0.m37544i(3.0f), top - C1357a0.m37544i(2.0f), this.f4946W + left + C1357a0.m37544i(3.0f) + (n0 ? C1357a0.m37544i(22.0f) * g : 0.0f), (n0 ? C5069h.m24084j(C1357a0.m37544i(15.0f), C1357a0.m37544i(21.0f), g) : C1357a0.m37544i(15.0f)) + top);
                canvas.drawRoundRect(a0, C1357a0.m37544i(4.0f), C1357a0.m37544i(4.0f), C1410y.m37042g(1275068416));
                canvas.drawText(this.f4945V, left + (n0 ? C1357a0.m37544i(22.0f) * g : 0.0f), top + C1357a0.m37544i(11.0f) + (n0 ? C1357a0.m37544i(3.5f) * g : 0.0f), C1410y.m37074G0(12.0f, false, false));
                this.f4940Q.m13472x().m18624i0(R.drawable.baseline_play_arrow_36_white);
                this.f4940Q.m13472x().m18684A0(R.drawable.baseline_cloud_download_16);
                if (n0) {
                    this.f4940Q.m13472x().m18660M0(false);
                    this.f4940Q.m13472x().m18662L0(false, false, 2, a0, this.f4939P);
                }
            }
            if (this.f4940Q.m13491n0() || this.f4940Q.m13511d0() || this.f4940Q.m13523X() == 8) {
                this.f4940Q.m13484r(this, canvas, 0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            if (z2) {
                canvas.restore();
            }
            if (this.f4941R != 0.0f) {
                int I0 = vVar.mo20258I0() + (((int) (vVar.getWidth() * 0.76f)) / 2);
                int y0 = vVar.mo20228y0() - (((int) (vVar.getHeight() * 0.76f)) / 2);
                canvas.drawCircle(I0, y0, C1357a0.m37544i((2.0f * f) + 9.0f), C1410y.m37063R(C5064d.m24132a(this.f4941R, C5064d.m24129d(-1, C5064d.m24130c(C11524j.m148w(), C11524j.m178i()), f))));
                if (i != 0) {
                    C6918i3.m18466b(canvas, I0, y0, f, null);
                }
            }
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i);
        m37559y();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C4336c cVar = this.f4947a0;
        return cVar != null && cVar.m28248e(this, motionEvent);
    }

    public void setItem(C8112b bVar) {
        C8112b bVar2 = this.f4940Q;
        if (bVar2 != null) {
            bVar2.m13488p(this);
            if (this.f4940Q.m13505g0() && ((bVar == null || this.f4940Q.m13474w() != bVar.m13474w()) && this.f4940Q.m13503h0())) {
                this.f4940Q.m13481s0();
            }
        }
        this.f4940Q = bVar;
        String str = null;
        if (bVar != null) {
            this.f4948b.m20820G(bVar.m13567B());
            this.f4949c.m20820G((!bVar.m13507f0() || bVar.m13537Q() != null) ? bVar.m13559F() : null);
            this.f4936M.m20820G(bVar.m13507f0() ? bVar.m13533S(false) : null);
            this.f4937N.m20232r(bVar.m13507f0() ? bVar.m13537Q() : null);
            this.f4939P.m29577p(bVar.m13507f0(), false);
            bVar.m13514c(this);
            bVar.m13548K0(this.f4938O);
            bVar.m13486q(false);
            if (bVar.m13491n0() && !bVar.m13509e0()) {
                str = C1363c0.m37436h(bVar.m13521Y(false, TimeUnit.SECONDS));
            }
            setText(str);
            return;
        }
        this.f4948b.m20820G(null);
        this.f4949c.m20820G(null);
        this.f4936M.m20820G(null);
        this.f4937N.m20232r(null);
    }

    public void setListener(C6883g1.AbstractC6886c cVar) {
        this.f4938O = cVar;
    }

    public void setSelectableFactor(float f) {
        if (this.f4941R != f) {
            this.f4941R = f;
            invalidate();
        }
    }

    public void m37563t(float f) {
        if (this.f4943T == null) {
            this.f4943T = new C3950k(0, this, C2057b.f7280b, 180L, this.f4942S);
        }
        this.f4943T.m29546i(f);
    }

    public void m37562u(float f) {
        C3950k kVar = this.f4943T;
        if (kVar != null) {
            kVar.m29543l(f);
        }
        setSelectionFactor(f);
    }

    public void m37561v(C4336c.AbstractC4337a aVar) {
        this.f4947a0 = new C4336c(aVar);
    }

    public void m37560x(C8112b bVar) {
        if (this.f4940Q == bVar) {
            C6503j jVar = null;
            this.f4936M.m20820G(bVar != null ? bVar.m13535R() : null);
            RunnableC6507m mVar = this.f4937N;
            if (bVar != null) {
                jVar = bVar.m13537Q();
            }
            mVar.m20232r(jVar);
        }
    }

    public final void m37559y() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f4948b.mo20257K0(0, 0, measuredWidth, measuredHeight);
        this.f4949c.mo20257K0(0, 0, measuredWidth, measuredHeight);
        this.f4936M.mo20257K0(0, 0, measuredWidth, measuredHeight);
        this.f4937N.mo20257K0(0, 0, measuredWidth, measuredHeight);
    }
}
