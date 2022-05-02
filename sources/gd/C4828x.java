package gd;

import android.graphics.Canvas;
import android.text.TextUtils;
import be.C1357a0;
import be.C1410y;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.R;
import p108hb.C5070i;
import p156kd.AbstractC6264v;
import p156kd.C6238b;
import p156kd.C6257p;
import p334xc.C10185a;
import p350yd.C10930q6;
import p364zd.C11524j;

public class C4828x extends AbstractC4718o<C4746q7> {
    public final C4746q7 f16462a0;
    public String f16463b0;
    public final boolean f16464c0;
    public String f16465d0;

    public C4828x(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.User user, boolean z) {
        super(aVar, q6Var, 12, null, new C4746q7(q6Var, user));
        String str;
        C4746q7 q7Var = (C4746q7) this.f15886M;
        this.f16462a0 = q7Var;
        this.f16464c0 = z;
        if (q7Var.m26282g() == null || q7Var.m26282g().username.isEmpty()) {
            str = null;
        } else {
            str = "@" + q7Var.m26282g().username;
        }
        this.f16463b0 = str;
    }

    public static String m25126a0(TdApi.User user, boolean z) {
        if (user == null) {
            return null;
        }
        if (z || user.username.isEmpty()) {
            return !C5070i.m24062i(user.firstName) ? user.firstName : C4779t2.m25445q2(user.firstName, user.lastName);
        }
        return "@" + user.username;
    }

    public static boolean m25120g0(int i, AbstractC6264v vVar, long j) {
        return i == 1 && j == 0;
    }

    public static boolean m25118i0(TdApi.User user, String str, boolean z) {
        String lowerCase = str.toLowerCase();
        String lowerCase2 = user.firstName.toLowerCase();
        String lowerCase3 = user.lastName.toLowerCase();
        return (C4779t2.m25445q2(lowerCase2, lowerCase3).startsWith(lowerCase) || lowerCase3.startsWith(lowerCase)) ? z || !C5070i.m24062i(user.username) : (z || !user.username.isEmpty()) && user.username.toLowerCase().startsWith(lowerCase);
    }

    @Override
    public void mo25117E(int i) {
        this.f16462a0.m26280i(12.0f, C1410y.m37065P(14.0f, false));
        int i2 = ((i - (C1357a0.m37544i(14.0f) * 2)) - (C1357a0.m37544i(14.0f) * 2)) - C1357a0.m37544i(12.0f);
        String str = this.f16463b0;
        if (str != null) {
            float f = i2;
            String charSequence = TextUtils.ellipsize(str, C1410y.m37087A(), f, TextUtils.TruncateAt.END).toString();
            this.f16465d0 = charSequence;
            i2 = (int) (f - C7389v0.m16680T1(charSequence, C1410y.m37065P(14.0f, false)));
        }
        this.f16462a0.m26276m(C1410y.m37065P(14.0f, false), i2);
    }

    @Override
    public void mo25114L(C6238b bVar, boolean z) {
        bVar.m20998f(C4819w.f16427a);
        bVar.m20993k(0L).m20820G(this.f16462a0.m26285d());
    }

    public String m25125b0(boolean z) {
        return m25126a0(this.f16462a0.m26282g(), z);
    }

    public TdApi.User m25124c0() {
        return this.f16462a0.m26282g();
    }

    public long m25123d0() {
        return this.f16462a0.m26286c();
    }

    public boolean m25122e0() {
        return this.f16464c0;
    }

    public boolean m25121f0() {
        return this.f16462a0.m26282g() != null && this.f16462a0.m26282g().username.isEmpty();
    }

    public boolean m25119h0(String str, boolean z) {
        return this.f16462a0.m26282g() != null && m25118i0(this.f16462a0.m26282g(), str, z);
    }

    @Override
    public void mo25113k(C10185a aVar, Canvas canvas, C6238b bVar, int i, int i2, int i3) {
        if (this.f16462a0.m26281h()) {
            C6257p k = bVar.m20993k(0L);
            k.mo20260D0(C1357a0.m37544i(14.0f));
            k.mo20257K0(C1357a0.m37544i(14.0f), C1357a0.m37544i(4.0f) + i3, C1357a0.m37544i(14.0f) + (C1357a0.m37544i(14.0f) * 2), C1357a0.m37544i(4.0f) + i3 + (C1357a0.m37544i(14.0f) * 2));
            if (k.mo20247c0()) {
                k.mo20256N(canvas);
            }
            k.draw(canvas);
        } else {
            this.f16462a0.m26288a(canvas, C1357a0.m37544i(14.0f), C1357a0.m37544i(14.0f), i3 + C1357a0.m37544i(4.0f), 12.0f);
        }
        int i4 = (C1357a0.m37544i(14.0f) * 3) + C1357a0.m37544i(12.0f);
        if (this.f16462a0.m26284e() != null) {
            canvas.drawText(this.f16462a0.m26284e(), i4, C1357a0.m37544i(4.0f) + i3 + C1357a0.m37544i(14.0f) + C1357a0.m37544i(5.0f), C1410y.m37066O(14.0f, this.f15890Q ? C11524j.m226O(R.id.theme_color_text, 2) : C11524j.m217S0(), false));
            i4 = i4 + this.f16462a0.m26283f() + C1357a0.m37544i(8.0f);
        }
        if (this.f16465d0 != null) {
            canvas.drawText(this.f16465d0, i4, i3 + C1357a0.m37544i(4.0f) + C1357a0.m37544i(14.0f) + C1357a0.m37544i(5.0f), C1410y.m37085B(this.f15890Q ? C11524j.m226O(R.id.theme_color_textLight, 2) : C11524j.m213U0()));
        }
    }

    @Override
    public int mo25112n() {
        return (C1357a0.m37544i(4.0f) * 2) + (C1357a0.m37544i(14.0f) * 2);
    }
}
