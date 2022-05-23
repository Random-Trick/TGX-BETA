package hd;

import ae.j;
import android.graphics.Canvas;
import android.text.TextUtils;
import ce.a0;
import ce.y;
import ld.b;
import ld.p;
import ld.v;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.a;
import zd.o6;

public class r extends o<TdApi.BotCommand> {
    public final q7 f13375a0;
    public int f13376b0;
    public String f13377c0;
    public String f13378d0;

    public r(a aVar, o6 o6Var, long j10, TdApi.BotCommand botCommand) {
        super(aVar, o6Var, 14, null, botCommand);
        this.f13375a0 = new q7(o6Var, j10);
    }

    public static boolean c0(int i10, v vVar, long j10) {
        return i10 == 1 && j10 == 0;
    }

    @Override
    public void E(int i10) {
        String str = null;
        this.f13375a0.i(12.0f, null);
        String str2 = "/" + ((TdApi.BotCommand) this.M).command;
        if (this.f13376b0 == 0) {
            this.f13376b0 = (int) v0.T1(str2, y.A());
        }
        int i11 = ((((i10 - (a0.i(14.0f) * 2)) - (a0.i(14.0f) * 2)) - a0.i(12.0f)) - this.f13376b0) - a0.i(12.0f);
        if (i11 <= 0) {
            this.f13377c0 = TextUtils.ellipsize(str2, y.A(), i11 + this.f13376b0 + a0.i(12.0f), TextUtils.TruncateAt.END).toString();
            this.f13378d0 = null;
            return;
        }
        this.f13377c0 = str2;
        if (!((TdApi.BotCommand) this.M).description.isEmpty()) {
            str = TextUtils.ellipsize(((TdApi.BotCommand) this.M).description, y.A(), i11, TextUtils.TruncateAt.END).toString();
        }
        this.f13378d0 = str;
    }

    @Override
    public void L(b bVar, boolean z10) {
        bVar.f(q.f13351a);
        bVar.k(0L).G(this.f13375a0.d());
    }

    public String a0() {
        return "/" + ((TdApi.BotCommand) this.M).command;
    }

    public String b0() {
        if (this.f13375a0.g() != null) {
            return this.f13375a0.g().username;
        }
        return null;
    }

    public boolean d0(String str) {
        return ((TdApi.BotCommand) this.M).command.startsWith(str);
    }

    @Override
    public void j(yc.a aVar, Canvas canvas, b bVar, int i10, int i11, int i12) {
        p k10 = bVar.k(0L);
        k10.E0(a0.i(14.0f));
        k10.K0(a0.i(14.0f), a0.i(4.0f) + i12, a0.i(14.0f) + (a0.i(14.0f) * 2), a0.i(4.0f) + i12 + (a0.i(14.0f) * 2));
        if (this.f13375a0.h()) {
            if (k10.e0()) {
                k10.O(canvas);
            }
            k10.draw(canvas);
        } else {
            this.f13375a0.a(canvas, a0.i(14.0f), a0.i(14.0f), i12 + a0.i(4.0f), 12.0f);
        }
        int i13 = (a0.i(14.0f) * 3) + a0.i(12.0f);
        int i14 = i12 + a0.i(4.0f) + a0.i(14.0f) + a0.i(5.0f);
        String str = this.f13377c0;
        if (str != null) {
            canvas.drawText(str, i13, i14, y.B(j.P0()));
            i13 += this.f13376b0 + a0.i(12.0f);
        }
        String str2 = this.f13378d0;
        if (str2 != null) {
            canvas.drawText(str2, i13, i14, y.B(j.R0()));
        }
    }

    @Override
    public int n() {
        return (a0.i(4.0f) * 2) + (a0.i(14.0f) * 2);
    }

    public r(a aVar, o6 o6Var, TdApi.User user, TdApi.BotCommand botCommand) {
        super(aVar, o6Var, 14, null, botCommand);
        this.f13375a0 = new q7(o6Var, user);
    }
}
