package gd;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import be.C1410y;
import gd.C4587b;
import ie.AbstractC5411l0;
import ie.C5428t;
import ie.C5457w0;
import ie.C5459x0;
import java.net.URLDecoder;
import me.C6918i3;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import p108hb.C5064d;
import p108hb.C5070i;
import p156kd.C6238b;
import p291uc.AbstractC9622o0;
import p334xc.C10185a;
import p350yd.C10930q6;
import p364zd.C11524j;

public class C4836y extends AbstractC4718o<TdApi.InlineQueryResult> {
    public String f16486a0;
    public String f16487b0;
    public TdApi.TextEntity[] f16488c0;
    public boolean f16489d0;
    public String f16490e0;
    public final C4587b f16491f0;
    public C5459x0 f16492g0;
    public C5459x0 f16493h0;
    public C5459x0 f16494i0;

    public C4836y(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.InlineQueryResultArticle inlineQueryResultArticle) {
        super(aVar, q6Var, 0, inlineQueryResultArticle.f25380id, inlineQueryResultArticle);
        this.f16486a0 = inlineQueryResultArticle.title;
        this.f16487b0 = inlineQueryResultArticle.description;
        this.f16490e0 = (inlineQueryResultArticle.hideUrl || inlineQueryResultArticle.url.isEmpty()) ? null : inlineQueryResultArticle.url;
        this.f16491f0 = new C4587b(25.0f, new C4587b.C4588a(C4779t2.m25576X0(inlineQueryResultArticle.url.isEmpty() ? inlineQueryResultArticle.f25380id : inlineQueryResultArticle.url), C4779t2.m25722B1(this.f16486a0)), null);
        m26348R(AbstractC9622o0.m7980q(q6Var, inlineQueryResultArticle.thumbnail, null, C1357a0.m37541i(50.0f), C1357a0.m37541i(3.0f)));
        mo25116E(C1357a0.m37543g());
    }

    @Override
    public void mo25116E(int i) {
        String str;
        String str2;
        C5459x0 x0Var;
        if (this.f16492g0 == null) {
            C5459x0 x0Var2 = new C5459x0(this.f15901b, this.f16486a0, AbstractC4761s4.m26211D9(), C5428t.AbstractC5441d.f17872C, 0, null, 2);
            this.f16492g0 = x0Var2;
            x0Var2.m22635a(4);
            this.f16492g0.m22639E(2);
        }
        if (this.f16493h0 == null && !C5070i.m24061i(this.f16487b0)) {
            TdApi.TextEntity[] textEntityArr = this.f16488c0;
            if (textEntityArr == null || textEntityArr.length <= 0) {
                x0Var = new C5459x0(this.f15901b, this.f16487b0, AbstractC4761s4.m26211D9(), C5428t.AbstractC5441d.f17872C, 0, null, 4);
            } else {
                x0Var = new C5459x0(this.f16487b0, AbstractC4761s4.m26211D9(), C5428t.AbstractC5441d.f17872C, AbstractC5411l0.m22789F(this.f15901b, new TdApi.FormattedText(this.f16487b0, this.f16488c0), null));
            }
            this.f16493h0 = x0Var;
            x0Var.m22636H(this.f15893T);
            this.f16493h0.m22635a(8);
            this.f16493h0.m22639E(3);
        }
        if (this.f16494i0 == null && (str = this.f16490e0) != null) {
            try {
                str2 = URLDecoder.decode(str, "UTF-8");
            } catch (Throwable unused) {
                str2 = this.f16490e0;
            }
            C5457w0 D9 = AbstractC4761s4.m26211D9();
            C5428t.AbstractC5441d dVar = C5428t.AbstractC5441d.f17872C;
            C10930q6 q6Var = this.f15901b;
            TdApi.TextEntity[] textEntityArr2 = new TdApi.TextEntity[1];
            textEntityArr2[0] = new TdApi.TextEntity(0, str2.length(), this.f16489d0 ? new TdApi.TextEntityTypeEmailAddress() : new TdApi.TextEntityTypeUrl());
            C5459x0 x0Var3 = new C5459x0(str2, D9, dVar, AbstractC5411l0.m22790E(q6Var, str2, textEntityArr2, null));
            this.f16494i0 = x0Var3;
            x0Var3.m22639E(2);
            this.f16494i0.m22636H(this.f15893T);
            this.f16494i0.m22635a(8);
        }
        int i2 = ((i - (C1357a0.m37541i(11.0f) * 2)) - C1357a0.m37541i(50.0f)) - C1357a0.m37541i(15.0f);
        this.f16492g0.m22642B(i2);
        C5459x0 x0Var4 = this.f16493h0;
        if (x0Var4 != null) {
            x0Var4.m22642B(i2);
        }
        C5459x0 x0Var5 = this.f16494i0;
        if (x0Var5 != null) {
            x0Var5.m22642B(i2);
        }
    }

    @Override
    public void mo25115G(Canvas canvas, C6238b bVar, int i, int i2, float f, float f2, float f3, String str, C6918i3 i3Var) {
        int i3 = C1357a0.m37541i(11.0f);
        int i4 = i3 / 2;
        int i5 = (C1357a0.m37541i(11.0f) + C1357a0.m37541i(50.0f)) - i4;
        int i6 = (C1357a0.m37541i(11.0f) + C1357a0.m37541i(50.0f)) - i4;
        C6918i3.m18465c(canvas, i5, i6, f3, str, i3Var);
        RectF a0 = C1410y.m37050a0();
        a0.set(i5 - i3, i6 - i3, i5 + i3, i6 + i3);
        canvas.drawArc(a0, 135.0f, f3 * 170.0f, false, C1410y.m37060R(C5064d.m24129c(C11524j.m148w(), C11524j.m178i())));
    }

    @Override
    public boolean mo25114I(View view, MotionEvent motionEvent) {
        C5459x0 x0Var;
        C5459x0 x0Var2;
        C5459x0 x0Var3 = this.f16492g0;
        return (x0Var3 != null && x0Var3.m22614x(view, motionEvent)) || ((x0Var = this.f16493h0) != null && x0Var.m22614x(view, motionEvent)) || ((x0Var2 = this.f16494i0) != null && x0Var2.m22614x(view, motionEvent));
    }

    @Override
    public void mo25113L(C6238b bVar, boolean z) {
        if (m26335q() != null) {
            m26335q().mo7955f(bVar, z);
        } else {
            bVar.m20999d();
        }
    }

    @Override
    public void mo25112k(C10185a aVar, Canvas canvas, C6238b bVar, int i, int i2, int i3) {
        if (m26335q() != null) {
            m26335q().m7993a(aVar, canvas, bVar, C1357a0.m37541i(11.0f), C1357a0.m37541i(11.0f), 1.0f);
        } else if (this.f16491f0 != null) {
            RectF a0 = C1410y.m37050a0();
            a0.set(C1357a0.m37541i(11.0f), C1357a0.m37541i(11.0f), C1357a0.m37541i(11.0f) + C1357a0.m37541i(50.0f), C1357a0.m37541i(11.0f) + C1357a0.m37541i(50.0f));
            canvas.drawRoundRect(a0, C1357a0.m37541i(3.0f), C1357a0.m37541i(3.0f), C1410y.m37039g(C11524j.m228N(this.f16491f0.f15119d.f15120a)));
            this.f16491f0.m27212d(canvas, a0.centerX(), a0.centerY(), 1.0f, this.f16491f0.m27210f(), false);
        }
        int i4 = C1357a0.m37541i(11.0f) + C1357a0.m37541i(50.0f) + C1357a0.m37541i(15.0f);
        int i5 = i3 + C1357a0.m37541i(11.0f) + C1357a0.m37541i(4.0f);
        boolean z = false;
        C5459x0 x0Var = this.f16492g0;
        boolean z2 = true;
        if (x0Var != null) {
            x0Var.m22628j(canvas, i4, i5, null, 1.0f);
            i5 += this.f16492g0.getHeight();
            z = true;
        }
        if (this.f16493h0 != null) {
            if (z) {
                i5 += C1357a0.m37541i(6.0f);
                z2 = z;
            }
            this.f16493h0.m22628j(canvas, i4, i5, null, 1.0f);
            i5 += this.f16493h0.getHeight();
            z = z2;
        }
        if (this.f16494i0 != null) {
            if (z) {
                i5 += C1357a0.m37541i(6.0f);
            }
            this.f16494i0.m22628j(canvas, i4, i5, null, 1.0f);
        }
    }

    @Override
    public int mo25111n() {
        boolean z;
        int i = C1357a0.m37541i(11.0f) + C1357a0.m37541i(4.0f);
        C5459x0 x0Var = this.f16492g0;
        boolean z2 = true;
        if (x0Var != null) {
            i += x0Var.getHeight();
            z = true;
        } else {
            z = false;
        }
        if (this.f16493h0 != null) {
            if (z) {
                i += C1357a0.m37541i(6.0f);
                z2 = z;
            }
            i += this.f16493h0.getHeight();
            z = z2;
        }
        if (this.f16494i0 != null) {
            if (z) {
                i += C1357a0.m37541i(6.0f);
            }
            i += this.f16494i0.getHeight();
        }
        return Math.max(C1357a0.m37541i(72.0f), i + C1357a0.m37541i(14.0f));
    }

    public C4836y(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.InlineQueryResultGame inlineQueryResultGame) {
        super(aVar, q6Var, 5, inlineQueryResultGame.f25384id, inlineQueryResultGame);
        TdApi.Game game = inlineQueryResultGame.game;
        this.f16486a0 = game.title;
        this.f16487b0 = game.description;
        this.f16491f0 = new C4587b(25.0f, new C4587b.C4588a(C4779t2.m25576X0(game.shortName), C4779t2.m25722B1(this.f16486a0)), null);
        m26348R(AbstractC9622o0.m7984m(q6Var, inlineQueryResultGame.game, C1357a0.m37541i(50.0f), C1357a0.m37541i(3.0f)));
        mo25116E(C1357a0.m37543g());
    }

    public C4836y(org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a r17, p350yd.C10930q6 r18, org.drinkless.p210td.libcore.telegram.TdApi.Message r19) {
        throw new UnsupportedOperationException("Method not decompiled: gd.C4836y.<init>(org.thunderdog.challegram.a, yd.q6, org.drinkless.td.libcore.telegram.TdApi$Message):void");
    }
}
