package gd;

import android.graphics.Canvas;
import android.text.TextUtils;
import be.C1357a0;
import be.C1410y;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import p156kd.AbstractC6264v;
import p156kd.C6238b;
import p156kd.C6257p;
import p334xc.C10185a;
import p350yd.C10930q6;
import p364zd.C11524j;

public class C4747r extends AbstractC4718o<TdApi.BotCommand> {
    public final C4746q7 f15962a0;
    public int f15963b0;
    public String f15964c0;
    public String f15965d0;

    public C4747r(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, long j, TdApi.BotCommand botCommand) {
        super(aVar, q6Var, 14, null, botCommand);
        this.f15962a0 = new C4746q7(q6Var, j);
    }

    public static boolean m26272c0(int i, AbstractC6264v vVar, long j) {
        return i == 1 && j == 0;
    }

    @Override
    public void mo25117E(int i) {
        String str = null;
        this.f15962a0.m26280i(12.0f, null);
        String str2 = "/" + ((TdApi.BotCommand) this.f15886M).command;
        if (this.f15963b0 == 0) {
            this.f15963b0 = (int) C7389v0.m16680T1(str2, C1410y.m37087A());
        }
        int i2 = ((((i - (C1357a0.m37544i(14.0f) * 2)) - (C1357a0.m37544i(14.0f) * 2)) - C1357a0.m37544i(12.0f)) - this.f15963b0) - C1357a0.m37544i(12.0f);
        if (i2 <= 0) {
            this.f15964c0 = TextUtils.ellipsize(str2, C1410y.m37087A(), i2 + this.f15963b0 + C1357a0.m37544i(12.0f), TextUtils.TruncateAt.END).toString();
            this.f15965d0 = null;
            return;
        }
        this.f15964c0 = str2;
        if (!((TdApi.BotCommand) this.f15886M).description.isEmpty()) {
            str = TextUtils.ellipsize(((TdApi.BotCommand) this.f15886M).description, C1410y.m37087A(), i2, TextUtils.TruncateAt.END).toString();
        }
        this.f15965d0 = str;
    }

    @Override
    public void mo25114L(C6238b bVar, boolean z) {
        bVar.m20998f(C4738q.f15937a);
        bVar.m20993k(0L).m20820G(this.f15962a0.m26285d());
    }

    public String m26274a0() {
        return "/" + ((TdApi.BotCommand) this.f15886M).command;
    }

    public String m26273b0() {
        if (this.f15962a0.m26282g() != null) {
            return this.f15962a0.m26282g().username;
        }
        return null;
    }

    public boolean m26271d0(String str) {
        return ((TdApi.BotCommand) this.f15886M).command.startsWith(str);
    }

    @Override
    public void mo25113k(C10185a aVar, Canvas canvas, C6238b bVar, int i, int i2, int i3) {
        C6257p k = bVar.m20993k(0L);
        k.mo20260D0(C1357a0.m37544i(14.0f));
        k.mo20257K0(C1357a0.m37544i(14.0f), C1357a0.m37544i(4.0f) + i3, C1357a0.m37544i(14.0f) + (C1357a0.m37544i(14.0f) * 2), C1357a0.m37544i(4.0f) + i3 + (C1357a0.m37544i(14.0f) * 2));
        if (this.f15962a0.m26281h()) {
            if (k.mo20247c0()) {
                k.mo20256N(canvas);
            }
            k.draw(canvas);
        } else {
            this.f15962a0.m26288a(canvas, C1357a0.m37544i(14.0f), C1357a0.m37544i(14.0f), i3 + C1357a0.m37544i(4.0f), 12.0f);
        }
        int i4 = (C1357a0.m37544i(14.0f) * 3) + C1357a0.m37544i(12.0f);
        int i5 = i3 + C1357a0.m37544i(4.0f) + C1357a0.m37544i(14.0f) + C1357a0.m37544i(5.0f);
        String str = this.f15964c0;
        if (str != null) {
            canvas.drawText(str, i4, i5, C1410y.m37085B(C11524j.m217S0()));
            i4 += this.f15963b0 + C1357a0.m37544i(12.0f);
        }
        String str2 = this.f15965d0;
        if (str2 != null) {
            canvas.drawText(str2, i4, i5, C1410y.m37085B(C11524j.m213U0()));
        }
    }

    @Override
    public int mo25112n() {
        return (C1357a0.m37544i(4.0f) * 2) + (C1357a0.m37544i(14.0f) * 2);
    }

    public C4747r(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.User user, TdApi.BotCommand botCommand) {
        super(aVar, q6Var, 14, null, botCommand);
        this.f15962a0 = new C4746q7(q6Var, user);
    }
}
