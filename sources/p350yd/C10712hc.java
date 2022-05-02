package p350yd;

import gd.C4587b;
import gd.C4779t2;
import ie.C5386e;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p108hb.C5063c;
import p108hb.C5070i;
import p156kd.C6246h;
import p193nb.C7316a;
import p291uc.C9678w2;

public class C10712hc {
    public final C10930q6 f34272a;
    public final long f34273b;
    public final TdApi.MessageSender f34274c;
    public final String f34275d;
    public final String f34276e;
    public final String f34277f;
    public final TdApi.ChatPhotoInfo f34278g;
    public final C5386e f34279h;
    public final C4587b.C4588a f34280i;
    public final int f34281j;

    public C10712hc(C10930q6 q6Var, long j, TdApi.MessageSender messageSender) {
        this(q6Var, j, messageSender, null, false);
    }

    public C6246h m4215a() {
        int constructor = this.f34274c.getConstructor();
        if (constructor == -336109341) {
            return this.f34272a.m2480e2().m1579w2(((TdApi.MessageSenderUser) this.f34274c).userId);
        }
        if (constructor == -239660751) {
            return this.f34272a.m2526b3(((TdApi.MessageSenderChat) this.f34274c).chatId);
        }
        throw new AssertionError();
    }

    public int m4214b() {
        return this.f34280i.f15120a;
    }

    public long m4213c() {
        if (m4202n()) {
            return ((TdApi.MessageSenderChat) this.f34274c).chatId;
        }
        return 0L;
    }

    public C5386e m4212d() {
        return this.f34279h;
    }

    public String m4211e() {
        return this.f34275d;
    }

    public int m4210f() {
        return C4779t2.m25624P1(m4214b());
    }

    public String m4209g() {
        return this.f34276e;
    }

    public C4587b.C4588a m4208h() {
        return this.f34280i;
    }

    public long m4207i() {
        if (m4199q()) {
            return ((TdApi.MessageSenderUser) this.f34274c).userId;
        }
        return 0L;
    }

    public String m4206j() {
        return this.f34277f;
    }

    public boolean m4205k() {
        return m4202n() && this.f34273b == m4213c() && !this.f34272a.m2784K6(m4213c());
    }

    public boolean m4204l() {
        return C5063c.m24144b(this.f34281j, 1);
    }

    public boolean m4203m() {
        return m4202n() && this.f34272a.m2784K6(m4213c());
    }

    public boolean m4202n() {
        return this.f34274c.getConstructor() == -239660751;
    }

    public boolean m4201o() {
        return m4207i() == this.f34272a.m2519ba();
    }

    public boolean m4200p() {
        return C5063c.m24144b(this.f34281j, 2);
    }

    public boolean m4199q() {
        return this.f34274c.getConstructor() == -336109341;
    }

    public C10712hc(C10930q6 q6Var, long j, TdApi.MessageSender messageSender, C9678w2 w2Var, boolean z) {
        int i;
        this.f34272a = q6Var;
        this.f34273b = j;
        this.f34274c = messageSender;
        int constructor = messageSender.getConstructor();
        TdApi.ChatPhotoInfo chatPhotoInfo = null;
        if (constructor == -336109341) {
            long j2 = ((TdApi.MessageSenderUser) messageSender).userId;
            TdApi.User v2 = (!z || w2Var == null) ? q6Var.m2480e2().m1583v2(j2) : w2Var.m7640s0(j2);
            TdApi.ProfilePhoto profilePhoto = v2 != null ? v2.profilePhoto : null;
            this.f34275d = C4779t2.m25451p2(j2, v2);
            this.f34276e = C4779t2.m25430s2(j2, v2);
            this.f34277f = (v2 == null || C5070i.m24061i(v2.username)) ? null : v2.username;
            this.f34278g = profilePhoto != null ? new TdApi.ChatPhotoInfo(profilePhoto.small, profilePhoto.big, profilePhoto.minithumbnail, profilePhoto.hasAnimation) : chatPhotoInfo;
            this.f34279h = C4779t2.m25701E1(v2);
            this.f34280i = q6Var.m2480e2().m1705O2(j2, v2, false);
            i = C5063c.m24138h(C5063c.m24138h(0, 1, C4779t2.m25658K2(v2)), 2, q6Var.m2363l7(C7316a.m17058c(j2)));
        } else if (constructor == -239660751) {
            long j3 = ((TdApi.MessageSenderChat) messageSender).chatId;
            TdApi.Chat U2 = q6Var.m2632U2(j3);
            this.f34275d = q6Var.m2646T3(U2, false);
            this.f34276e = q6Var.m2631U3(U2, false, true);
            this.f34277f = q6Var.m2446g4(U2);
            this.f34278g = U2 != null ? U2.photo : chatPhotoInfo;
            this.f34279h = q6Var.m2383k3(U2);
            this.f34280i = q6Var.m2931B3(j3, U2, false);
            i = C5063c.m24138h(C5063c.m24138h(0, 1, q6Var.m2816I6(U2)), 2, q6Var.m2363l7(j3));
        } else {
            throw new UnsupportedOperationException(messageSender.toString());
        }
        this.f34281j = i;
    }
}
