package hd;

import ae.j;
import android.graphics.Canvas;
import android.text.TextUtils;
import ce.a0;
import ce.y;
import ib.i;
import ld.b;
import ld.p;
import ld.v;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.a;
import zd.o6;

public class x extends o<q7> {
    public final q7 f13711a0;
    public String f13712b0;
    public final boolean f13713c0;
    public String f13714d0;

    public x(a aVar, o6 o6Var, TdApi.User user, boolean z10) {
        super(aVar, o6Var, 12, null, new q7(o6Var, user));
        String str;
        q7 q7Var = (q7) this.M;
        this.f13711a0 = q7Var;
        this.f13713c0 = z10;
        if (q7Var.g() == null || q7Var.g().username.isEmpty()) {
            str = null;
        } else {
            str = "@" + q7Var.g().username;
        }
        this.f13712b0 = str;
    }

    public static String a0(TdApi.User user, boolean z10) {
        if (user == null) {
            return null;
        }
        if (z10 || user.username.isEmpty()) {
            return !i.i(user.firstName) ? user.firstName : t2.q2(user.firstName, user.lastName);
        }
        return "@" + user.username;
    }

    public static boolean g0(int i10, v vVar, long j10) {
        return i10 == 1 && j10 == 0;
    }

    public static boolean i0(TdApi.User user, String str, boolean z10) {
        String lowerCase = str.toLowerCase();
        String lowerCase2 = user.firstName.toLowerCase();
        String lowerCase3 = user.lastName.toLowerCase();
        return (t2.q2(lowerCase2, lowerCase3).startsWith(lowerCase) || lowerCase3.startsWith(lowerCase)) ? z10 || !i.i(user.username) : (z10 || !user.username.isEmpty()) && user.username.toLowerCase().startsWith(lowerCase);
    }

    @Override
    public void E(int i10) {
        this.f13711a0.i(12.0f, y.P(14.0f, false));
        int i11 = ((i10 - (a0.i(14.0f) * 2)) - (a0.i(14.0f) * 2)) - a0.i(12.0f);
        String str = this.f13712b0;
        if (str != null) {
            float f10 = i11;
            String charSequence = TextUtils.ellipsize(str, y.A(), f10, TextUtils.TruncateAt.END).toString();
            this.f13714d0 = charSequence;
            i11 = (int) (f10 - v0.T1(charSequence, y.P(14.0f, false)));
        }
        this.f13711a0.m(y.P(14.0f, false), i11);
    }

    @Override
    public void L(b bVar, boolean z10) {
        bVar.f(w.f13685a);
        bVar.k(0L).G(this.f13711a0.d());
    }

    public String b0(boolean z10) {
        return a0(this.f13711a0.g(), z10);
    }

    public TdApi.User c0() {
        return this.f13711a0.g();
    }

    public long d0() {
        return this.f13711a0.c();
    }

    public boolean e0() {
        return this.f13713c0;
    }

    public boolean f0() {
        return this.f13711a0.g() != null && this.f13711a0.g().username.isEmpty();
    }

    public boolean h0(String str, boolean z10) {
        return this.f13711a0.g() != null && i0(this.f13711a0.g(), str, z10);
    }

    @Override
    public void j(yc.a aVar, Canvas canvas, b bVar, int i10, int i11, int i12) {
        if (this.f13711a0.h()) {
            p k10 = bVar.k(0L);
            k10.E0(a0.i(14.0f));
            k10.K0(a0.i(14.0f), a0.i(4.0f) + i12, a0.i(14.0f) + (a0.i(14.0f) * 2), a0.i(4.0f) + i12 + (a0.i(14.0f) * 2));
            if (k10.e0()) {
                k10.O(canvas);
            }
            k10.draw(canvas);
        } else {
            this.f13711a0.a(canvas, a0.i(14.0f), a0.i(14.0f), i12 + a0.i(4.0f), 12.0f);
        }
        int i13 = (a0.i(14.0f) * 3) + a0.i(12.0f);
        if (this.f13711a0.e() != null) {
            canvas.drawText(this.f13711a0.e(), i13, a0.i(4.0f) + i12 + a0.i(14.0f) + a0.i(5.0f), y.O(14.0f, this.Q ? j.M(R.id.theme_color_text, 2) : j.P0(), false));
            i13 = i13 + this.f13711a0.f() + a0.i(8.0f);
        }
        if (this.f13714d0 != null) {
            canvas.drawText(this.f13714d0, i13, i12 + a0.i(4.0f) + a0.i(14.0f) + a0.i(5.0f), y.B(this.Q ? j.M(R.id.theme_color_textLight, 2) : j.R0()));
        }
    }

    @Override
    public int n() {
        return (a0.i(4.0f) * 2) + (a0.i(14.0f) * 2);
    }
}
