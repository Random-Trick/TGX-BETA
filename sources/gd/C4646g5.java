package gd;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import be.C1410y;
import gd.C4630f0;
import ie.AbstractC5411l0;
import ie.C5459x0;
import ie.RunnableC5390g;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import p108hb.C5070i;
import p156kd.AbstractC6264v;
import p156kd.C6240c;
import p156kd.C6257p;
import p168ld.RunnableC6507m;
import p193nb.C7321e;
import p291uc.C9552h1;
import p291uc.C9678w2;
import p350yd.C10930q6;
import p364zd.C11524j;

public class C4646g5 extends AbstractC4761s4 implements C4630f0.AbstractC4631a {
    public final TdApi.Game f15485U2;
    public C5459x0 f15486V2;
    public TdApi.FormattedText f15487W2;
    public C5459x0 f15488X2;
    public C4630f0 f15489Y2;

    public C4646g5(C9678w2 w2Var, TdApi.Message message, TdApi.Game game) {
        super(w2Var, message);
        this.f15485U2 = game;
        m26650ka();
    }

    public static int m26653ha() {
        return C1357a0.m37544i(12.0f);
    }

    public static int m26652ia() {
        return C1357a0.m37544i(7.0f);
    }

    @Override
    public void mo26161I8(RunnableC6507m mVar) {
        this.f15489Y2.m26738l0(mVar);
    }

    @Override
    public void mo26151J8(C6257p pVar) {
        this.f15489Y2.m26736m0(pVar);
    }

    @Override
    public boolean mo25334L9(TdApi.Message message, TdApi.MessageContent messageContent, boolean z) {
        TdApi.Game game = ((TdApi.MessageGame) messageContent).game;
        TdApi.Game game2 = this.f15485U2;
        game2.text = game.text;
        game2.title = game.title;
        game2.description = game.description;
        if (!m26650ka()) {
            return false;
        }
        m25741z8();
        return true;
    }

    @Override
    public void mo26122M8(C6240c cVar) {
        this.f15489Y2.m26734n0(cVar);
    }

    @Override
    public int mo26075R3(boolean z) {
        return C1357a0.m37544i(C11524j.m208X());
    }

    @Override
    public void mo26071R7(C9552h1 h1Var, boolean z) {
        C4630f0 f0Var = this.f15489Y2;
        if (f0Var != null) {
            f0Var.m26781G().m18655P();
        }
    }

    @Override
    public int mo25223X2() {
        return this.f15489Y2.m26715x() + m26649la();
    }

    @Override
    public void mo26008Y(TdApi.ChatType chatType) {
        C4630f0 f0Var = this.f15489Y2;
        if (f0Var != null) {
            f0Var.m26781G().m18619l(chatType);
        }
    }

    @Override
    public void mo25991Z7(long j, long j2, boolean z) {
        C4630f0 f0Var = this.f15489Y2;
        if (f0Var != null) {
            f0Var.m26778H0(j, j2, z);
        }
    }

    @Override
    public void mo25222a0(int i) {
        int ga2 = m26654ga();
        int i2 = ga2 * 2;
        C5459x0 x0Var = this.f15486V2;
        if (x0Var != null) {
            x0Var.m22643B(ga2);
        }
        C5459x0 x0Var2 = this.f15488X2;
        if (x0Var2 != null) {
            x0Var2.m22643B(ga2);
        }
        m26658ca(ga2, i2);
    }

    @Override
    public int mo25220b2() {
        return AbstractC4761s4.f16062g2 + AbstractC4761s4.f16063h2;
    }

    @Override
    public int mo25219c3() {
        int ha = m26653ha();
        C5459x0 x0Var = this.f15488X2;
        return ha + Math.max(x0Var != null ? x0Var.getWidth() : 0, this.f15489Y2.m26791B());
    }

    public final void m26658ca(int i, int i2) {
        if (this.f15489Y2 == null) {
            if (this.f15485U2.animation != null) {
                AbstractView$OnTouchListenerC7889a s = mo4347s();
                C10930q6 q6Var = this.f16099O0;
                TdApi.Animation animation = this.f15485U2.animation;
                TdApi.Message message = this.f16122a;
                this.f15489Y2 = new C4630f0(s, q6Var, animation, message.chatId, message.f25409id, (AbstractC4761s4) this, false);
            } else {
                AbstractView$OnTouchListenerC7889a s2 = mo4347s();
                C10930q6 q6Var2 = this.f16099O0;
                TdApi.Photo photo = this.f15485U2.photo;
                TdApi.Message message2 = this.f16122a;
                this.f15489Y2 = new C4630f0(s2, q6Var2, photo, message2.chatId, message2.f25409id, (AbstractC4761s4) this, false);
            }
            this.f15489Y2.m26790B0(this.f16101P0);
            this.f15489Y2.m26722t0(this);
        }
        float F = this.f15489Y2.m26783F();
        float E = this.f15489Y2.m26785E();
        float min = Math.min(i / F, i2 / E);
        this.f15489Y2.m26741k((int) (F * min), (int) (min * E));
    }

    @Override
    public void mo25962d1(C9552h1 h1Var, Canvas canvas, int i, int i2, int i3, AbstractC6264v vVar, AbstractC6264v vVar2) {
        this.f15489Y2.m26725s(h1Var, canvas, m26656ea(), m26655fa(), vVar, vVar2, 1.0f);
        m26657da(canvas, i, i2, i3);
    }

    public final void m26657da(Canvas canvas, int i, int i2, int i3) {
        RectF a0 = C1410y.m37053a0();
        int i4 = C1357a0.m37544i(3.0f);
        a0.set(i, i2, i + i4, mo25223X2() + i2);
        float f = i4 / 2;
        canvas.drawRoundRect(a0, f, f, C1410y.m37042g(m26032V4()));
        int ha = i + m26653ha();
        int i5 = 0;
        if (this.f15486V2 != null) {
            int ja = m26651ja() + 0;
            this.f15486V2.m22629j(canvas, ha, i2 + ja, null, 1.0f);
            i5 = this.f15486V2.getHeight() + ja;
        }
        if (this.f15488X2 != null) {
            this.f15488X2.m22629j(canvas, ha, i2 + i5 + (i5 != 0 ? C1357a0.m37544i(4.0f) : m26651ja()), null, 1.0f);
        }
    }

    public final int m26656ea() {
        return m25960d3() + m26653ha();
    }

    @Override
    public boolean mo25218f8(C9552h1 h1Var, MotionEvent motionEvent) {
        if (super.mo25218f8(h1Var, motionEvent) || this.f15489Y2.m26744i0(h1Var, motionEvent)) {
            return true;
        }
        if (this.f15486V2 != null) {
            m26651ja();
            this.f15486V2.getHeight();
            C1357a0.m37544i(4.0f);
        } else {
            m26651ja();
        }
        C5459x0 x0Var = this.f15488X2;
        return x0Var != null && x0Var.m22615x(h1Var, motionEvent);
    }

    public final int m26655fa() {
        return m25950e3() + m26649la();
    }

    public final int m26654ga() {
        return m26185G4() - m26653ha();
    }

    public final int m26651ja() {
        if (this.f15488X2 == null && this.f15486V2 == null) {
            return 0;
        }
        return C1357a0.m37544i(2.0f);
    }

    @Override
    public boolean mo26550k(View view, C4630f0 f0Var) {
        C4602c4 c4Var = this.f16110U;
        if (c4Var == null || c4Var.m27003v()) {
            return false;
        }
        this.f16110U.m27001x(view);
        return true;
    }

    public final boolean m26650ka() {
        boolean z;
        TdApi.FormattedText formattedText;
        C5459x0 x0Var;
        if (C5070i.m24062i(this.f15485U2.title) || ((x0Var = this.f15488X2) != null && x0Var.m22617v().equals(this.f15485U2.title))) {
            z = false;
        } else {
            this.f15486V2 = new C5459x0(this.f15485U2.title, AbstractC4761s4.m26126M4(), m26176H2(), null).m22636a(4).m22641D(m26210E0());
            z = true;
        }
        if (!C7321e.m16965a1(this.f15485U2.text)) {
            formattedText = this.f15485U2.text;
        } else {
            String str = this.f15485U2.description;
            formattedText = new TdApi.FormattedText(str, RunnableC5390g.m22997G(str, 1));
        }
        if (!C7321e.m16965a1(formattedText)) {
            TdApi.FormattedText formattedText2 = this.f15487W2;
            if (formattedText2 == null || !C7321e.m16995M(formattedText2, formattedText)) {
                this.f15487W2 = formattedText;
                this.f15488X2 = new C5459x0(formattedText.text, AbstractC4761s4.m26126M4(), m26135L4(), AbstractC5411l0.m22790F(this.f16099O0, formattedText, m25917h8())).m22641D(m26210E0());
                return true;
            }
        } else if (this.f15487W2 != null) {
            this.f15488X2 = null;
            this.f15487W2 = null;
            return true;
        }
        return z;
    }

    public final int m26649la() {
        int i = 0;
        if (this.f15486V2 != null) {
            i = 0 + m26651ja() + this.f15486V2.getHeight();
        }
        if (this.f15488X2 != null) {
            i += (i != 0 ? C1357a0.m37544i(4.0f) : m26651ja()) + this.f15488X2.getHeight();
        }
        return i > 0 ? i + m26652ia() : i;
    }

    @Override
    public boolean mo25870m7() {
        return this.f15489Y2.m26767Q() != null;
    }

    @Override
    public boolean mo25296m8(View view, float f, float f2) {
        return this.f15489Y2.m26742j0(view) || super.mo25296m8(view, f, f2);
    }

    @Override
    public boolean mo25830q7() {
        return true;
    }
}
