package zd;

import hd.b;
import hd.t2;
import ib.c;
import ib.i;
import je.e;
import ld.h;
import ob.a;
import org.drinkless.td.libcore.telegram.TdApi;
import vc.v2;

public class fc {
    public final o6 f27512a;
    public final long f27513b;
    public final TdApi.MessageSender f27514c;
    public final String f27515d;
    public final String f27516e;
    public final String f27517f;
    public final TdApi.ChatPhotoInfo f27518g;
    public final e f27519h;
    public final b.a f27520i;
    public final int f27521j;

    public fc(o6 o6Var, long j10, TdApi.MessageSender messageSender) {
        this(o6Var, j10, messageSender, null, false);
    }

    public h a() {
        int constructor = this.f27514c.getConstructor();
        if (constructor == -336109341) {
            return this.f27512a.e2().v2(((TdApi.MessageSenderUser) this.f27514c).userId);
        }
        if (constructor == -239660751) {
            return this.f27512a.d3(((TdApi.MessageSenderChat) this.f27514c).chatId);
        }
        throw new AssertionError();
    }

    public int b() {
        return this.f27520i.f12764a;
    }

    public long c() {
        if (n()) {
            return ((TdApi.MessageSenderChat) this.f27514c).chatId;
        }
        return 0L;
    }

    public e d() {
        return this.f27519h;
    }

    public String e() {
        return this.f27515d;
    }

    public int f() {
        return t2.P1(b());
    }

    public String g() {
        return this.f27516e;
    }

    public b.a h() {
        return this.f27520i;
    }

    public long i() {
        if (q()) {
            return ((TdApi.MessageSenderUser) this.f27514c).userId;
        }
        return 0L;
    }

    public String j() {
        return this.f27517f;
    }

    public boolean k() {
        return n() && this.f27513b == c() && !this.f27512a.O6(c());
    }

    public boolean l() {
        return c.b(this.f27521j, 1);
    }

    public boolean m() {
        return n() && this.f27512a.O6(c());
    }

    public boolean n() {
        return this.f27514c.getConstructor() == -239660751;
    }

    public boolean o() {
        return i() == this.f27512a.fa();
    }

    public boolean p() {
        return c.b(this.f27521j, 2);
    }

    public boolean q() {
        return this.f27514c.getConstructor() == -336109341;
    }

    public fc(o6 o6Var, long j10, TdApi.MessageSender messageSender, v2 v2Var, boolean z10) {
        int i10;
        this.f27512a = o6Var;
        this.f27513b = j10;
        this.f27514c = messageSender;
        int constructor = messageSender.getConstructor();
        TdApi.ChatPhotoInfo chatPhotoInfo = null;
        if (constructor == -336109341) {
            long j11 = ((TdApi.MessageSenderUser) messageSender).userId;
            TdApi.User u22 = (!z10 || v2Var == null) ? o6Var.e2().u2(j11) : v2Var.s0(j11);
            TdApi.ProfilePhoto profilePhoto = u22 != null ? u22.profilePhoto : null;
            this.f27515d = t2.p2(j11, u22);
            this.f27516e = t2.s2(j11, u22);
            this.f27517f = (u22 == null || i.i(u22.username)) ? null : u22.username;
            this.f27518g = profilePhoto != null ? new TdApi.ChatPhotoInfo(profilePhoto.small, profilePhoto.big, profilePhoto.minithumbnail, profilePhoto.hasAnimation) : chatPhotoInfo;
            this.f27519h = t2.E1(u22);
            this.f27520i = o6Var.e2().N2(j11, u22, false);
            i10 = c.h(c.h(0, 1, t2.K2(u22)), 2, o6Var.p7(a.c(j11)));
        } else if (constructor == -239660751) {
            long j12 = ((TdApi.MessageSenderChat) messageSender).chatId;
            TdApi.Chat W2 = o6Var.W2(j12);
            this.f27515d = o6Var.X3(W2, false);
            this.f27516e = o6Var.Y3(W2, false, true);
            this.f27517f = o6Var.k4(W2);
            this.f27518g = W2 != null ? W2.photo : chatPhotoInfo;
            this.f27519h = o6Var.n3(W2);
            this.f27520i = o6Var.E3(j12, W2, false);
            i10 = c.h(c.h(0, 1, o6Var.M6(W2)), 2, o6Var.p7(j12));
        } else {
            throw new UnsupportedOperationException(messageSender.toString());
        }
        this.f27521j = i10;
    }
}
