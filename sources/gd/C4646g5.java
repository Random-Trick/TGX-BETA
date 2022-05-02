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
        m26649ka();
    }

    public static int m26652ha() {
        return C1357a0.m37541i(12.0f);
    }

    public static int m26651ia() {
        return C1357a0.m37541i(7.0f);
    }

    @Override
    public void mo26160I8(RunnableC6507m mVar) {
        this.f15489Y2.m26739k0(mVar);
    }

    @Override
    public void mo26150J8(C6257p pVar) {
        this.f15489Y2.m26737l0(pVar);
    }

    @Override
    public boolean mo25333L9(TdApi.Message message, TdApi.MessageContent messageContent, boolean z) {
        TdApi.Game game = ((TdApi.MessageGame) messageContent).game;
        TdApi.Game game2 = this.f15485U2;
        game2.text = game.text;
        game2.title = game.title;
        game2.description = game.description;
        if (!m26649ka()) {
            return false;
        }
        m25740z8();
        return true;
    }

    @Override
    public void mo26121M8(C6240c cVar) {
        this.f15489Y2.m26735m0(cVar);
    }

    @Override
    public int mo26074R3(boolean z) {
        return C1357a0.m37541i(C11524j.m208X());
    }

    @Override
    public void mo26070R7(C9552h1 h1Var, boolean z) {
        C4630f0 f0Var = this.f15489Y2;
        if (f0Var != null) {
            f0Var.m26779G().m18654P();
        }
    }

    @Override
    public int mo25222X2() {
        return this.f15489Y2.m26714x() + m26648la();
    }

    @Override
    public void mo26007Y(TdApi.ChatType chatType) {
        C4630f0 f0Var = this.f15489Y2;
        if (f0Var != null) {
            f0Var.m26779G().m18619l(chatType);
        }
    }

    @Override
    public void mo25990Z7(long j, long j2, boolean z) {
        C4630f0 f0Var = this.f15489Y2;
        if (f0Var != null) {
            f0Var.m26778G0(j, j2, z);
        }
    }

    @Override
    public void mo25221a0(int i) {
        int ga2 = m26653ga();
        int i2 = ga2 * 2;
        C5459x0 x0Var = this.f15486V2;
        if (x0Var != null) {
            x0Var.m22642B(ga2);
        }
        C5459x0 x0Var2 = this.f15488X2;
        if (x0Var2 != null) {
            x0Var2.m22642B(ga2);
        }
        m26657ca(ga2, i2);
    }

    @Override
    public int mo25219b2() {
        return AbstractC4761s4.f16062g2 + AbstractC4761s4.f16063h2;
    }

    @Override
    public int mo25218c3() {
        int ha = m26652ha();
        C5459x0 x0Var = this.f15488X2;
        return ha + Math.max(x0Var != null ? x0Var.getWidth() : 0, this.f15489Y2.m26789B());
    }

    public final void m26657ca(int i, int i2) {
        if (this.f15489Y2 == null) {
            if (this.f15485U2.animation != null) {
                AbstractView$OnTouchListenerC7889a s = mo4347s();
                C10930q6 q6Var = this.f16099O0;
                TdApi.Animation animation = this.f15485U2.animation;
                TdApi.Message message = this.f16122a;
                this.f15489Y2 = new C4630f0(s, q6Var, animation, message.chatId, message.f25406id, (AbstractC4761s4) this, false);
            } else {
                AbstractView$OnTouchListenerC7889a s2 = mo4347s();
                C10930q6 q6Var2 = this.f16099O0;
                TdApi.Photo photo = this.f15485U2.photo;
                TdApi.Message message2 = this.f16122a;
                this.f15489Y2 = new C4630f0(s2, q6Var2, photo, message2.chatId, message2.f25406id, (AbstractC4761s4) this, false);
            }
            this.f15489Y2.m26790A0(this.f16101P0);
            this.f15489Y2.m26723s0(this);
        }
        float F = this.f15489Y2.m26781F();
        float E = this.f15489Y2.m26783E();
        float min = Math.min(i / F, i2 / E);
        this.f15489Y2.m26740k((int) (F * min), (int) (min * E));
    }

    @Override
    public void mo25961d1(C9552h1 h1Var, Canvas canvas, int i, int i2, int i3, AbstractC6264v vVar, AbstractC6264v vVar2) {
        this.f15489Y2.m26724s(h1Var, canvas, m26655ea(), m26654fa(), vVar, vVar2, 1.0f);
        m26656da(canvas, i, i2, i3);
    }

    public final void m26656da(Canvas canvas, int i, int i2, int i3) {
        RectF a0 = C1410y.m37050a0();
        int i4 = C1357a0.m37541i(3.0f);
        a0.set(i, i2, i + i4, mo25222X2() + i2);
        float f = i4 / 2;
        canvas.drawRoundRect(a0, f, f, C1410y.m37039g(m26031V4()));
        int ha = i + m26652ha();
        int i5 = 0;
        if (this.f15486V2 != null) {
            int ja = m26650ja() + 0;
            this.f15486V2.m22628j(canvas, ha, i2 + ja, null, 1.0f);
            i5 = this.f15486V2.getHeight() + ja;
        }
        if (this.f15488X2 != null) {
            this.f15488X2.m22628j(canvas, ha, i2 + i5 + (i5 != 0 ? C1357a0.m37541i(4.0f) : m26650ja()), null, 1.0f);
        }
    }

    public final int m26655ea() {
        return m25959d3() + m26652ha();
    }

    @Override
    public boolean mo25217f8(C9552h1 h1Var, MotionEvent motionEvent) {
        if (super.mo25217f8(h1Var, motionEvent) || this.f15489Y2.m26745h0(h1Var, motionEvent)) {
            return true;
        }
        if (this.f15486V2 != null) {
            m26650ja();
            this.f15486V2.getHeight();
            C1357a0.m37541i(4.0f);
        } else {
            m26650ja();
        }
        C5459x0 x0Var = this.f15488X2;
        return x0Var != null && x0Var.m22614x(h1Var, motionEvent);
    }

    public final int m26654fa() {
        return m25949e3() + m26648la();
    }

    public final int m26653ga() {
        return m26184G4() - m26652ha();
    }

    public final int m26650ja() {
        if (this.f15488X2 == null && this.f15486V2 == null) {
            return 0;
        }
        return C1357a0.m37541i(2.0f);
    }

    @Override
    public boolean mo26549k(View view, C4630f0 f0Var) {
        C4602c4 c4Var = this.f16110U;
        if (c4Var == null || c4Var.m27001v()) {
            return false;
        }
        this.f16110U.m26999x(view);
        return true;
    }

    public final boolean m26649ka() {
        boolean z;
        TdApi.FormattedText formattedText;
        C5459x0 x0Var;
        if (C5070i.m24061i(this.f15485U2.title) || ((x0Var = this.f15488X2) != null && x0Var.m22616v().equals(this.f15485U2.title))) {
            z = false;
        } else {
            this.f15486V2 = new C5459x0(this.f15485U2.title, AbstractC4761s4.m26125M4(), m26175H2(), null).m22635a(4).m22640D(m26209E0());
            z = true;
        }
        if (!C7321e.m16965a1(this.f15485U2.text)) {
            formattedText = this.f15485U2.text;
        } else {
            String str = this.f15485U2.description;
            formattedText = new TdApi.FormattedText(str, RunnableC5390g.m22996G(str, 1));
        }
        if (!C7321e.m16965a1(formattedText)) {
            TdApi.FormattedText formattedText2 = this.f15487W2;
            if (formattedText2 == null || !C7321e.m16995M(formattedText2, formattedText)) {
                this.f15487W2 = formattedText;
                this.f15488X2 = new C5459x0(formattedText.text, AbstractC4761s4.m26125M4(), m26134L4(), AbstractC5411l0.m22789F(this.f16099O0, formattedText, m25916h8())).m22640D(m26209E0());
                return true;
            }
        } else if (this.f15487W2 != null) {
            this.f15488X2 = null;
            this.f15487W2 = null;
            return true;
        }
        return z;
    }

    public final int m26648la() {
        int i = 0;
        if (this.f15486V2 != null) {
            i = 0 + m26650ja() + this.f15486V2.getHeight();
        }
        if (this.f15488X2 != null) {
            i += (i != 0 ? C1357a0.m37541i(4.0f) : m26650ja()) + this.f15488X2.getHeight();
        }
        return i > 0 ? i + m26651ia() : i;
    }

    @Override
    public boolean mo25869m7() {
        return this.f15489Y2.m26766Q() != null;
    }

    @Override
    public boolean mo25295m8(View view, float f, float f2) {
        return this.f15489Y2.m26743i0(view) || super.mo25295m8(view, f, f2);
    }

    @Override
    public boolean mo25829q7() {
        return true;
    }
}
