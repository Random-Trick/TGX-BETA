package hd;

import ae.j;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import hd.b;
import ib.d;
import ib.i;
import java.net.URLDecoder;
import je.l0;
import je.t;
import je.w0;
import je.x0;
import ne.i3;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.a;
import vc.n0;
import zd.o6;

public class y extends o<TdApi.InlineQueryResult> {
    public String f13733a0;
    public String f13734b0;
    public TdApi.TextEntity[] f13735c0;
    public boolean f13736d0;
    public String f13737e0;
    public final b f13738f0;
    public x0 f13739g0;
    public x0 f13740h0;
    public x0 f13741i0;

    public y(a aVar, o6 o6Var, TdApi.InlineQueryResultArticle inlineQueryResultArticle) {
        super(aVar, o6Var, 0, inlineQueryResultArticle.f19920id, inlineQueryResultArticle);
        this.f13733a0 = inlineQueryResultArticle.title;
        this.f13734b0 = inlineQueryResultArticle.description;
        this.f13737e0 = (inlineQueryResultArticle.hideUrl || inlineQueryResultArticle.url.isEmpty()) ? null : inlineQueryResultArticle.url;
        this.f13738f0 = new b(25.0f, new b.a(t2.X0(inlineQueryResultArticle.url.isEmpty() ? inlineQueryResultArticle.f19920id : inlineQueryResultArticle.url), t2.B1(this.f13733a0)), null);
        R(n0.q(o6Var, inlineQueryResultArticle.thumbnail, null, a0.i(50.0f), a0.i(3.0f)));
        E(a0.g());
    }

    @Override
    public void E(int i10) {
        String str;
        String str2;
        x0 x0Var;
        if (this.f13739g0 == null) {
            x0 x0Var2 = new x0(this.f13323b, this.f13733a0, s4.D9(), t.d.C, 0, null, 2);
            this.f13739g0 = x0Var2;
            x0Var2.a(4);
            this.f13739g0.E(2);
        }
        if (this.f13740h0 == null && !i.i(this.f13734b0)) {
            TdApi.TextEntity[] textEntityArr = this.f13735c0;
            if (textEntityArr == null || textEntityArr.length <= 0) {
                x0Var = new x0(this.f13323b, this.f13734b0, s4.D9(), t.d.C, 0, null, 4);
            } else {
                x0Var = new x0(this.f13734b0, s4.D9(), t.d.C, l0.F(this.f13323b, new TdApi.FormattedText(this.f13734b0, this.f13735c0), null));
            }
            this.f13740h0 = x0Var;
            x0Var.H(this.T);
            this.f13740h0.a(8);
            this.f13740h0.E(3);
        }
        if (this.f13741i0 == null && (str = this.f13737e0) != null) {
            try {
                str2 = URLDecoder.decode(str, "UTF-8");
            } catch (Throwable unused) {
                str2 = this.f13737e0;
            }
            w0 D9 = s4.D9();
            t.d dVar = t.d.C;
            o6 o6Var = this.f13323b;
            TdApi.TextEntity[] textEntityArr2 = new TdApi.TextEntity[1];
            textEntityArr2[0] = new TdApi.TextEntity(0, str2.length(), this.f13736d0 ? new TdApi.TextEntityTypeEmailAddress() : new TdApi.TextEntityTypeUrl());
            x0 x0Var3 = new x0(str2, D9, dVar, l0.E(o6Var, str2, textEntityArr2, null));
            this.f13741i0 = x0Var3;
            x0Var3.E(2);
            this.f13741i0.H(this.T);
            this.f13741i0.a(8);
        }
        int i11 = ((i10 - (a0.i(11.0f) * 2)) - a0.i(50.0f)) - a0.i(15.0f);
        this.f13739g0.B(i11);
        x0 x0Var4 = this.f13740h0;
        if (x0Var4 != null) {
            x0Var4.B(i11);
        }
        x0 x0Var5 = this.f13741i0;
        if (x0Var5 != null) {
            x0Var5.B(i11);
        }
    }

    @Override
    public void G(Canvas canvas, ld.b bVar, int i10, int i11, float f10, float f11, float f12, String str, i3 i3Var) {
        int i12 = a0.i(11.0f);
        int i13 = i12 / 2;
        int i14 = (a0.i(11.0f) + a0.i(50.0f)) - i13;
        int i15 = (a0.i(11.0f) + a0.i(50.0f)) - i13;
        i3.c(canvas, i14, i15, f12, str, i3Var);
        RectF a02 = ce.y.a0();
        a02.set(i14 - i12, i15 - i12, i14 + i12, i15 + i12);
        canvas.drawArc(a02, 135.0f, f12 * 170.0f, false, ce.y.R(d.c(j.u(), j.i())));
    }

    @Override
    public boolean I(View view, MotionEvent motionEvent) {
        x0 x0Var;
        x0 x0Var2;
        x0 x0Var3 = this.f13739g0;
        return (x0Var3 != null && x0Var3.x(view, motionEvent)) || ((x0Var = this.f13740h0) != null && x0Var.x(view, motionEvent)) || ((x0Var2 = this.f13741i0) != null && x0Var2.x(view, motionEvent));
    }

    @Override
    public void L(ld.b bVar, boolean z10) {
        if (q() != null) {
            q().f(bVar, z10);
        } else {
            bVar.d();
        }
    }

    @Override
    public void j(yc.a aVar, Canvas canvas, ld.b bVar, int i10, int i11, int i12) {
        if (q() != null) {
            q().a(aVar, canvas, bVar, a0.i(11.0f), a0.i(11.0f), 1.0f);
        } else if (this.f13738f0 != null) {
            RectF a02 = ce.y.a0();
            a02.set(a0.i(11.0f), a0.i(11.0f), a0.i(11.0f) + a0.i(50.0f), a0.i(11.0f) + a0.i(50.0f));
            canvas.drawRoundRect(a02, a0.i(3.0f), a0.i(3.0f), ce.y.g(j.L(this.f13738f0.f12763d.f12764a)));
            this.f13738f0.d(canvas, a02.centerX(), a02.centerY(), 1.0f, this.f13738f0.f(), false);
        }
        int i13 = a0.i(11.0f) + a0.i(50.0f) + a0.i(15.0f);
        int i14 = i12 + a0.i(11.0f) + a0.i(4.0f);
        boolean z10 = false;
        x0 x0Var = this.f13739g0;
        boolean z11 = true;
        if (x0Var != null) {
            x0Var.j(canvas, i13, i14, null, 1.0f);
            i14 += this.f13739g0.getHeight();
            z10 = true;
        }
        if (this.f13740h0 != null) {
            if (z10) {
                i14 += a0.i(6.0f);
                z11 = z10;
            }
            this.f13740h0.j(canvas, i13, i14, null, 1.0f);
            i14 += this.f13740h0.getHeight();
            z10 = z11;
        }
        if (this.f13741i0 != null) {
            if (z10) {
                i14 += a0.i(6.0f);
            }
            this.f13741i0.j(canvas, i13, i14, null, 1.0f);
        }
    }

    @Override
    public int n() {
        boolean z10;
        int i10 = a0.i(11.0f) + a0.i(4.0f);
        x0 x0Var = this.f13739g0;
        boolean z11 = true;
        if (x0Var != null) {
            i10 += x0Var.getHeight();
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f13740h0 != null) {
            if (z10) {
                i10 += a0.i(6.0f);
                z11 = z10;
            }
            i10 += this.f13740h0.getHeight();
            z10 = z11;
        }
        if (this.f13741i0 != null) {
            if (z10) {
                i10 += a0.i(6.0f);
            }
            i10 += this.f13741i0.getHeight();
        }
        return Math.max(a0.i(72.0f), i10 + a0.i(14.0f));
    }

    public y(a aVar, o6 o6Var, TdApi.InlineQueryResultGame inlineQueryResultGame) {
        super(aVar, o6Var, 5, inlineQueryResultGame.f19924id, inlineQueryResultGame);
        TdApi.Game game = inlineQueryResultGame.game;
        this.f13733a0 = game.title;
        this.f13734b0 = game.description;
        this.f13738f0 = new b(25.0f, new b.a(t2.X0(game.shortName), t2.B1(this.f13733a0)), null);
        R(n0.m(o6Var, inlineQueryResultGame.game, a0.i(50.0f), a0.i(3.0f)));
        E(a0.g());
    }

    public y(org.thunderdog.challegram.a r17, zd.o6 r18, org.drinkless.td.libcore.telegram.TdApi.Message r19) {
        throw new UnsupportedOperationException("Method not decompiled: hd.y.<init>(org.thunderdog.challegram.a, zd.o6, org.drinkless.td.libcore.telegram.TdApi$Message):void");
    }
}
