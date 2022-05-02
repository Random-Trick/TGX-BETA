package gd;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import be.C1357a0;
import be.C1362c;
import be.C1410y;
import be.C1411z;
import ie.RunnableC5390g;
import java.util.concurrent.TimeUnit;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p108hb.C5070i;
import p193nb.C7316a;
import p193nb.C7321e;
import p291uc.C9552h1;
import p291uc.C9678w2;
import p364zd.C11524j;

public class C4806u4 extends AbstractC4761s4 {
    public final TdApi.MessageCall f16377U2;
    public int f16378V2;
    public int f16379W2;
    public String f16380X2;
    public String f16381Y2;
    public boolean f16382Z2;
    public float f16383a3;
    public float f16384b3;
    public boolean f16385c3;
    public float f16386d3;
    public float f16387e3;

    public C4806u4(C9678w2 w2Var, TdApi.Message message, TdApi.MessageCall messageCall) {
        super(w2Var, message);
        this.f16377U2 = messageCall;
    }

    @Override
    public int mo25222X2() {
        return m26068R9() ? C1357a0.m37541i(46.0f) : C1357a0.m37541i(25.0f) * 2;
    }

    @Override
    public void mo25221a0(int i) {
        int i2;
        this.f16378V2 = C4619e.m26852j(this.f16377U2, m25928g6());
        this.f16379W2 = C4619e.m26850l(this.f16377U2);
        boolean z = m26068R9() || this.f16377U2.duration > 0;
        if (z) {
            i2 = C4779t2.m25660K0(this.f16377U2, m25928g6(), true);
        } else {
            i2 = m25928g6() ? R.string.OutgoingCall : R.string.IncomingCall;
        }
        String i1 = C4403w.m27869i1(i2);
        String h = C4619e.m26854h(this.f16122a, z, 1);
        if (m26068R9()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C4403w.m27932T2(this.f16122a.date, TimeUnit.SECONDS));
            if (!C5070i.m24061i(h)) {
                sb2.append(", ");
                sb2.append(h);
            }
            h = sb2.toString();
        } else {
            i -= C1357a0.m37541i(40.0f) + C1357a0.m37541i(11.0f);
        }
        boolean M0 = RunnableC5390g.m22983M0(i1);
        this.f16382Z2 = M0;
        this.f16380X2 = TextUtils.ellipsize(i1, C1410y.m37062P(15.0f, M0), i, TextUtils.TruncateAt.END).toString();
        this.f16381Y2 = TextUtils.ellipsize(h, C1410y.m37040f0(), i - C1357a0.m37541i(20.0f), TextUtils.TruncateAt.END).toString();
        this.f16383a3 = C7389v0.m16680T1(this.f16380X2, C1410y.m37062P(13.0f, this.f16382Z2));
        this.f16384b3 = C7389v0.m16680T1(this.f16381Y2, C1410y.m37040f0());
    }

    @Override
    public void mo25220b1(C9552h1 h1Var, Canvas canvas, int i, int i2, int i3) {
        Drawable X = h1Var.mo14042X(this.f16377U2.isVideo ? R.drawable.baseline_videocam_24 : R.drawable.baseline_phone_24, 0);
        Drawable X2 = h1Var.mo14042X(this.f16378V2, 0);
        boolean R9 = m26068R9();
        int i4 = R.id.theme_color_file;
        if (R9) {
            if (m25918h6()) {
                i4 = R.id.theme_color_bubbleOut_file;
            }
            C1362c.m37487b(canvas, X, ((mo25218c3() + i) - (mo25222X2() / 2.0f)) - (X.getMinimumWidth() / 2.0f), (i2 + (mo25222X2() / 2.0f)) - (X.getMinimumHeight() / 2.0f), C1411z.m36998b(i4));
        } else {
            int i5 = C1357a0.m37541i(25.0f);
            float f = i + i5;
            float f2 = i2 + i5;
            canvas.drawCircle(f, f2, i5, C1410y.m37039g(C11524j.m228N(R.id.theme_color_file)));
            C1362c.m37487b(canvas, X, f - (X.getMinimumWidth() / 2.0f), f2 - (X.getMinimumHeight() / 2.0f), C1410y.m37055W(-1));
            i += (i5 * 2) + C1357a0.m37541i(11.0f);
        }
        if (m26068R9()) {
            i2 -= C1357a0.m37541i(4.0f);
        }
        float f3 = i;
        canvas.drawText(this.f16380X2, f3, C1357a0.m37541i(21.0f) + i2, C1410y.m37063O(15.0f, m26154J4(), this.f16382Z2));
        int i6 = this.f16378V2;
        C1362c.m37487b(canvas, X2, f3, C1357a0.m37541i(i6 == R.drawable.baseline_call_missed_18 ? 27.5f : i6 == R.drawable.baseline_call_made_18 ? 26.5f : 27.0f) + i2, C1410y.m37055W(C11524j.m228N(this.f16379W2)));
        canvas.drawText(this.f16381Y2, i + C1357a0.m37541i(20.0f), i2 + C1357a0.m37541i(41.0f), C1410y.m37046c0(13.0f, m25873m3()));
    }

    @Override
    public int mo25219b2() {
        return AbstractC4761s4.f16062g2 + AbstractC4761s4.f16063h2;
    }

    @Override
    public int mo25218c3() {
        return ((int) Math.max(Math.max(this.f16383a3, this.f16384b3 + C1357a0.m37541i(20.0f)), m26068R9() ? C1357a0.m37541i(182.0f) : 0.0f)) + C1357a0.m37541i(40.0f) + C1357a0.m37541i(11.0f);
    }

    @Override
    public boolean mo25217f8(C9552h1 h1Var, MotionEvent motionEvent) {
        long j;
        boolean z = true;
        if (super.mo25217f8(h1Var, motionEvent)) {
            return true;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && this.f16385c3) {
                        this.f16385c3 = false;
                        return true;
                    }
                } else if (this.f16385c3 && Math.abs(x - this.f16386d3) > C1357a0.m37534p() && Math.abs(y - this.f16387e3) > C1357a0.m37534p()) {
                    this.f16385c3 = false;
                    return true;
                }
            } else if (this.f16385c3) {
                this.f16385c3 = true;
                if (m25928g6()) {
                    j = C7316a.m17044q(this.f16122a.chatId);
                } else {
                    j = C7321e.m16984R0(this.f16122a);
                }
                if (j == 0) {
                    return false;
                }
                m25889k8();
                this.f16099O0.m2930B4().m4713c0().m4549t0(m26096P0(), j, null);
                return true;
            }
            return this.f16385c3;
        }
        if (x < m25959d3() || x > m25959d3() + mo25218c3() || y < m25949e3() || y > m25949e3() + mo25222X2()) {
            z = false;
        }
        this.f16385c3 = z;
        this.f16386d3 = x;
        this.f16387e3 = y;
        return z;
    }
}
