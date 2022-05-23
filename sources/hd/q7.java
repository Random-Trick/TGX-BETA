package hd;

import ae.j;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.text.TextUtils;
import ce.a0;
import ce.y;
import je.e;
import ld.h;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import wc.a;
import zd.o6;

public class q7 {
    public final o6 f13364a;
    public final long f13365b;
    public TdApi.User f13366c;
    public String f13367d;
    public h f13368e;
    public int f13369f;
    public e f13370g;
    public int f13371h;
    public int f13372i;
    public String f13373j;
    public int f13374k;

    public q7(o6 o6Var, long j10) {
        this.f13364a = o6Var;
        this.f13365b = j10;
        TdApi.User u22 = o6Var.e2().u2(j10);
        if (u22 != null) {
            j(u22);
            return;
        }
        this.f13369f = t2.H0(-1L, 0L);
        this.f13370g = t2.A1();
        this.f13367d = "User#" + j10;
    }

    public void a(Canvas canvas, int i10, int i11, int i12, float f10) {
        int i13 = i11 + i10;
        int i14 = i12 + i10;
        canvas.drawCircle(i13, i14, i10, y.g(j.L(this.f13369f)));
        e eVar = this.f13370g;
        if (eVar != null) {
            y.d(canvas, eVar, i13 - (this.f13371h / 2), i14 + a0.i(5.0f), f10);
        }
    }

    public String b() {
        TdApi.User user = this.f13366c;
        if (user != null) {
            String trim = user.firstName.trim();
            return trim.isEmpty() ? this.f13366c.lastName.trim() : trim;
        }
        return "User#" + this.f13365b;
    }

    public long c() {
        return this.f13365b;
    }

    public h d() {
        return this.f13368e;
    }

    public String e() {
        return this.f13373j;
    }

    public int f() {
        return this.f13374k;
    }

    public TdApi.User g() {
        return this.f13366c;
    }

    public boolean h() {
        return this.f13368e != null;
    }

    public void i(float f10, TextPaint textPaint) {
        if (this.f13371h == 0) {
            this.f13371h = y.v0(this.f13370g, f10);
        }
        if (textPaint != null && this.f13372i == 0) {
            String str = this.f13367d;
            this.f13372i = str != null ? (int) v0.T1(str, textPaint) : 0;
        }
    }

    public void j(TdApi.User user) {
        this.f13366c = user;
        this.f13367d = t2.q2(user.firstName, user.lastName);
        if (user.profilePhoto != null) {
            h hVar = this.f13368e;
            if (hVar == null || hVar.s() != user.profilePhoto.small.f19913id) {
                h hVar2 = new h(this.f13364a, user.profilePhoto.small);
                this.f13368e = hVar2;
                hVar2.t0(a.getDefaultAvatarCacheSize());
                return;
            }
            this.f13368e.k().local.path = user.profilePhoto.small.local.path;
            return;
        }
        this.f13369f = t2.H0(user.f19979id, this.f13364a.fa());
        this.f13370g = t2.E1(user);
    }

    public boolean k(TdApi.UserStatus userStatus) {
        TdApi.User user = this.f13366c;
        if (user == null || userStatus == null) {
            return false;
        }
        user.status = userStatus;
        return true;
    }

    public final o6 l() {
        return this.f13364a;
    }

    public void m(TextPaint textPaint, int i10) {
        int i11 = this.f13372i;
        if (i11 > i10) {
            String str = this.f13367d;
            String charSequence = str != null ? TextUtils.ellipsize(str, textPaint, i10, TextUtils.TruncateAt.END).toString() : null;
            this.f13373j = charSequence;
            this.f13374k = (int) v0.T1(charSequence, textPaint);
            return;
        }
        this.f13373j = this.f13367d;
        this.f13374k = i11;
    }

    public q7(o6 o6Var, TdApi.User user) {
        this.f13364a = o6Var;
        this.f13365b = user.f19979id;
        j(user);
    }
}
