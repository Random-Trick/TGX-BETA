package gd;

import android.graphics.Canvas;
import android.text.TextPaint;
import android.text.TextUtils;
import be.C1357a0;
import be.C1410y;
import ie.C5386e;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p156kd.C6246h;
import p350yd.C10930q6;
import p364zd.C11524j;
import vc.C9903a;

public class C4746q7 {
    public final C10930q6 f15951a;
    public final long f15952b;
    public TdApi.User f15953c;
    public String f15954d;
    public C6246h f15955e;
    public int f15956f;
    public C5386e f15957g;
    public int f15958h;
    public int f15959i;
    public String f15960j;
    public int f15961k;

    public C4746q7(C10930q6 q6Var, long j) {
        this.f15951a = q6Var;
        this.f15952b = j;
        TdApi.User v2 = q6Var.m2480e2().m1583v2(j);
        if (v2 != null) {
            m26279j(v2);
            return;
        }
        this.f15956f = C4779t2.m25682H0(-1L, 0L);
        this.f15957g = C4779t2.m25730A1();
        this.f15954d = "User#" + j;
    }

    public void m26288a(Canvas canvas, int i, int i2, int i3, float f) {
        int i4 = i2 + i;
        int i5 = i3 + i;
        canvas.drawCircle(i4, i5, i, C1410y.m37042g(C11524j.m228N(this.f15956f)));
        C5386e eVar = this.f15957g;
        if (eVar != null) {
            C1410y.m37048d(canvas, eVar, i4 - (this.f15958h / 2), i5 + C1357a0.m37544i(5.0f), f);
        }
    }

    public String m26287b() {
        TdApi.User user = this.f15953c;
        if (user != null) {
            String trim = user.firstName.trim();
            return trim.isEmpty() ? this.f15953c.lastName.trim() : trim;
        }
        return "User#" + this.f15952b;
    }

    public long m26286c() {
        return this.f15952b;
    }

    public C6246h m26285d() {
        return this.f15955e;
    }

    public String m26284e() {
        return this.f15960j;
    }

    public int m26283f() {
        return this.f15961k;
    }

    public TdApi.User m26282g() {
        return this.f15953c;
    }

    public boolean m26281h() {
        return this.f15955e != null;
    }

    public void m26280i(float f, TextPaint textPaint) {
        if (this.f15958h == 0) {
            this.f15958h = C1410y.m37011v0(this.f15957g, f);
        }
        if (textPaint != null && this.f15959i == 0) {
            String str = this.f15954d;
            this.f15959i = str != null ? (int) C7389v0.m16680T1(str, textPaint) : 0;
        }
    }

    public void m26279j(TdApi.User user) {
        this.f15953c = user;
        this.f15954d = C4779t2.m25445q2(user.firstName, user.lastName);
        if (user.profilePhoto != null) {
            C6246h hVar = this.f15955e;
            if (hVar == null || hVar.mo20826s() != user.profilePhoto.small.f25376id) {
                C6246h hVar2 = new C6246h(this.f15951a, user.profilePhoto.small);
                this.f15955e = hVar2;
                hVar2.mo20768t0(C9903a.getDefaultAvatarCacheSize());
                return;
            }
            this.f15955e.m20911k().local.path = user.profilePhoto.small.local.path;
            return;
        }
        this.f15956f = C4779t2.m25682H0(user.f25442id, this.f15951a.m2519ba());
        this.f15957g = C4779t2.m25702E1(user);
    }

    public boolean m26278k(TdApi.UserStatus userStatus) {
        TdApi.User user = this.f15953c;
        if (user == null || userStatus == null) {
            return false;
        }
        user.status = userStatus;
        return true;
    }

    public final C10930q6 m26277l() {
        return this.f15951a;
    }

    public void m26276m(TextPaint textPaint, int i) {
        int i2 = this.f15959i;
        if (i2 > i) {
            String str = this.f15954d;
            String charSequence = str != null ? TextUtils.ellipsize(str, textPaint, i, TextUtils.TruncateAt.END).toString() : null;
            this.f15960j = charSequence;
            this.f15961k = (int) C7389v0.m16680T1(charSequence, textPaint);
            return;
        }
        this.f15960j = this.f15954d;
        this.f15961k = i2;
    }

    public C4746q7(C10930q6 q6Var, TdApi.User user) {
        this.f15951a = q6Var;
        this.f15952b = user.f25442id;
        m26279j(user);
    }
}
