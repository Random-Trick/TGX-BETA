package hd;

import ce.c0;
import ce.y;
import ed.o;
import gd.w;
import hd.b;
import ib.c;
import ib.i;
import ie.a1;
import java.util.ArrayList;
import je.g;
import ld.h;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import wc.a;
import zd.o6;

public class d7 implements a1 {
    public h M;
    public b.a N;
    public float O;
    public String P;
    public float Q;
    public boolean R;
    public String S;
    public int T;
    public int U;
    public ArrayList<d7> V;
    public int W;
    public int X;
    public String Y;
    public String Z;
    public final o6 f12922a;
    public String f12923a0;
    public final long f12924b;
    public long f12925b0;
    public TdApi.User f12926c;

    public d7(o6 o6Var, TdApi.Chat chat) {
        this.f12922a = o6Var;
        this.f12924b = o6Var.i4(chat);
        TdApi.User f42 = o6Var.f4(chat);
        if (f42 != null) {
            C(f42, 0);
        } else {
            y(chat.f19908id, chat);
        }
    }

    public static d7 d(o6 o6Var, TdApi.User user) {
        return new d7(o6Var, user, true, false);
    }

    public static d7 e(o6 o6Var, TdApi.User user) {
        return new d7(o6Var, user, false, true);
    }

    public static String n(String str, String str2) {
        return c0.p((str + " " + str2).trim());
    }

    public static String o(TdApi.User user) {
        return user == null ? "#" : n(user.firstName, user.lastName);
    }

    public void A() {
        this.U |= 32;
        E();
    }

    public void B(TdApi.UserStatus userStatus) {
        TdApi.User user = this.f12926c;
        if (user != null && userStatus != null) {
            user.status = userStatus;
            E();
        }
    }

    public void C(TdApi.User user, int i10) {
        this.f12926c = user;
        if (i10 == 0 || this.f12924b != i10) {
            this.U &= -5;
        } else {
            this.U |= 4;
        }
        if (user == null || t2.u3(user.profilePhoto)) {
            this.N = new b.a(t2.I0(user, this.f12922a.fa()), t2.E1(user));
        } else {
            h hVar = new h(this.f12922a, user.profilePhoto.small);
            this.M = hVar;
            hVar.t0(a.getDefaultAvatarCacheSize());
        }
        D();
        E();
    }

    public boolean D() {
        int i10 = this.U;
        if ((i10 & 352) != 0) {
            return false;
        }
        String q22 = (i10 & 1) != 0 ? t2.q2(this.Y, this.Z) : t2.p2(this.f12924b, this.f12926c);
        if (i.c(this.S, q22)) {
            return false;
        }
        this.S = q22;
        this.R = g.M0(q22);
        this.Q = v0.T1(q22, y.n0());
        return true;
    }

    public boolean E() {
        String str;
        TdApi.User user;
        int i10 = this.U;
        if ((i10 & Log.TAG_YOUTUBE) != 0) {
            return true;
        }
        if (((i10 & 8) != 0 || (i10 & 64) != 0) && (user = this.f12926c) != null) {
            str = c0.w(user.phoneNumber);
        } else if ((i10 & 16) == 0 || this.f12926c == null) {
            int i11 = this.T;
            str = i11 != 0 ? t2.a2(this.f12926c, i11) : null;
        } else {
            str = "@" + this.f12926c.username;
        }
        int i12 = this.U;
        if ((i12 & 1) != 0) {
            str = c0.y(this.f12923a0, false, true);
        } else if (str != null) {
            this.U = i12 & (-3);
        } else if (this.f12924b != 0) {
            int h10 = c.h(i12, 2, this.f12922a.e2().m0(this.f12924b));
            this.U = h10;
            str = t2.S0(this.f12922a, this.f12924b, this.f12926c, (h10 & 32) == 0);
        } else {
            str = this.f12922a.b7(this.f12925b0) ? w.Z1(w.i1(R.string.Group)) : this.f12922a.Bc().m(this.f12925b0).toString();
        }
        if (i.c(this.P, str)) {
            return this.U != i10;
        }
        this.P = str;
        this.O = v0.T1(str, o.getStatusPaint());
        return true;
    }

    public final void a() {
        this.N = new b.a(t2.H0(this.X, this.f12922a.fa()), t2.C1(this.Y, this.Z));
        D();
        E();
    }

    public void b() {
        this.U |= 352;
    }

    @Override
    public TdApi.User c() {
        return this.f12926c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d7)) {
            return super.equals(obj);
        }
        d7 d7Var = (d7) obj;
        return s() == d7Var.s() && h() == d7Var.h() && this.U == d7Var.U && this.T == d7Var.T;
    }

    public h f() {
        return this.M;
    }

    public b.a g() {
        return this.N;
    }

    public long h() {
        long j10 = this.f12925b0;
        return j10 != 0 ? j10 : ob.a.c(s());
    }

    public String i() {
        int i10 = this.U;
        if ((i10 & 352) != 0) {
            return this.S;
        }
        if ((i10 & 1) != 0) {
            return this.Y;
        }
        TdApi.User user = this.f12926c;
        if (user != null) {
            return user.firstName;
        }
        return "User#" + this.f12924b;
    }

    public String j() {
        if ((this.U & 1) != 0) {
            return this.Z;
        }
        TdApi.User user = this.f12926c;
        return user == null ? "" : user.lastName;
    }

    public String k() {
        return this.S;
    }

    public TdApi.MessageSender l() {
        long j10 = this.f12924b;
        if (j10 != 0) {
            return new TdApi.MessageSenderUser(j10);
        }
        long j11 = this.f12925b0;
        if (j11 == 0) {
            throw new IllegalStateException();
        } else if (ob.a.l(j11)) {
            return new TdApi.MessageSenderUser(this.f12922a.h4(this.f12925b0));
        } else {
            return new TdApi.MessageSenderChat(this.f12925b0);
        }
    }

    public String m() {
        return (this.U & 1) != 0 ? n(this.Y, this.Z) : o(this.f12926c);
    }

    public String p() {
        return this.P;
    }

    public float q() {
        return this.O;
    }

    public TdApi.User r() {
        return this.f12926c;
    }

    public long s() {
        if ((this.U & 1) != 0) {
            return this.W;
        }
        TdApi.User user = this.f12926c;
        if (user == null) {
            return 0L;
        }
        return user.f19979id;
    }

    public String t() {
        TdApi.User user;
        if ((this.U & 1) != 0 || (user = this.f12926c) == null) {
            return null;
        }
        return user.username;
    }

    public boolean u() {
        return this.M != null;
    }

    public boolean v() {
        int i10 = this.U;
        return (i10 & 2) != 0 || ((i10 & 64) == 0 && this.f12922a.o7(this.f12924b));
    }

    public boolean w() {
        ArrayList<d7> arrayList = this.V;
        if (arrayList != null && arrayList.size() > 1) {
            ArrayList<d7> arrayList2 = this.V;
            if (!arrayList2.get(arrayList2.size() - 1).equals(this)) {
                return true;
            }
        }
        return false;
    }

    public void x(ArrayList<d7> arrayList) {
        this.V = arrayList;
    }

    public void y(long j10, TdApi.Chat chat) {
        this.f12926c = null;
        this.f12925b0 = j10;
        this.N = this.f12922a.E3(j10, chat, false);
        this.M = this.f12922a.d3(j10);
        String W3 = this.f12922a.W3(chat);
        this.S = W3;
        this.R = g.M0(W3);
        this.Q = v0.T1(this.S, y.n0());
        E();
    }

    public void z(String str) {
        if (i.c(this.P, str)) {
            return;
        }
        if (i.i(str)) {
            this.U &= -129;
            E();
            return;
        }
        this.P = str;
        this.U = (this.U | Log.TAG_YOUTUBE) & (-3);
    }

    public d7(o6 o6Var, TdApi.User user) {
        this.f12922a = o6Var;
        this.f12924b = user.f19979id;
        C(user, 0);
    }

    public d7(o6 o6Var, TdApi.User user, boolean z10, boolean z11) {
        this.f12922a = o6Var;
        this.f12924b = user.f19979id;
        if (z10) {
            this.U = 8;
        } else if (z11) {
            this.U = 16;
        }
        C(user, 0);
    }

    public d7(o6 o6Var, int i10, int i11, String str, String str2, String str3) {
        this.f12924b = 0L;
        this.f12922a = o6Var;
        this.U = 1;
        this.W = i10;
        this.X = i11;
        this.Y = str;
        this.Z = str2;
        this.f12923a0 = str3;
        a();
    }
}
