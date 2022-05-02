package gd;

import be.C1363c0;
import be.C1410y;
import gd.C4587b;
import ie.RunnableC5390g;
import java.util.ArrayList;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p053dd.C4022o;
import p082fd.C4403w;
import p108hb.C5063c;
import p108hb.C5070i;
import p111he.AbstractC5098a1;
import p156kd.C6246h;
import p193nb.C7316a;
import p350yd.C10930q6;
import vc.C9903a;

public class C4618d7 implements AbstractC5098a1 {
    public C6246h f15317M;
    public C4587b.C4588a f15318N;
    public float f15319O;
    public String f15320P;
    public float f15321Q;
    public boolean f15322R;
    public String f15323S;
    public int f15324T;
    public int f15325U;
    public ArrayList<C4618d7> f15326V;
    public int f15327W;
    public int f15328X;
    public String f15329Y;
    public String f15330Z;
    public final C10930q6 f15331a;
    public String f15332a0;
    public final long f15333b;
    public long f15334b0;
    public TdApi.User f15335c;

    public C4618d7(C10930q6 q6Var, TdApi.Chat chat) {
        this.f15331a = q6Var;
        this.f15333b = q6Var.m2478e4(chat);
        TdApi.User b4 = q6Var.m2525b4(chat);
        if (b4 != null) {
            m26889C(b4, 0);
        } else {
            m26863y(chat.f25367id, chat);
        }
    }

    public static C4618d7 m26884d(C10930q6 q6Var, TdApi.User user) {
        return new C4618d7(q6Var, user, true, false);
    }

    public static C4618d7 m26883e(C10930q6 q6Var, TdApi.User user) {
        return new C4618d7(q6Var, user, false, true);
    }

    public static String m26874n(String str, String str2) {
        return C1363c0.m37417p((str + " " + str2).trim());
    }

    public static String m26873o(TdApi.User user) {
        return user == null ? "#" : m26874n(user.firstName, user.lastName);
    }

    public void m26891A() {
        this.f15325U |= 32;
        m26887E();
    }

    public void m26890B(TdApi.UserStatus userStatus) {
        TdApi.User user = this.f15335c;
        if (user != null && userStatus != null) {
            user.status = userStatus;
            m26887E();
        }
    }

    public void m26889C(TdApi.User user, int i) {
        this.f15335c = user;
        if (i == 0 || this.f15333b != i) {
            this.f15325U &= -5;
        } else {
            this.f15325U |= 4;
        }
        if (user == null || C4779t2.m25415u3(user.profilePhoto)) {
            this.f15318N = new C4587b.C4588a(C4779t2.m25674I0(user, this.f15331a.m2519ba()), C4779t2.m25701E1(user));
        } else {
            C6246h hVar = new C6246h(this.f15331a, user.profilePhoto.small);
            this.f15317M = hVar;
            hVar.mo20767t0(C9903a.getDefaultAvatarCacheSize());
        }
        m26888D();
        m26887E();
    }

    public boolean m26888D() {
        int i = this.f15325U;
        if ((i & 352) != 0) {
            return false;
        }
        String q2 = (i & 1) != 0 ? C4779t2.m25444q2(this.f15329Y, this.f15330Z) : C4779t2.m25451p2(this.f15333b, this.f15335c);
        if (C5070i.m24067c(this.f15323S, q2)) {
            return false;
        }
        this.f15323S = q2;
        this.f15322R = RunnableC5390g.m22983M0(q2);
        this.f15321Q = C7389v0.m16680T1(q2, C1410y.m37024n0());
        return true;
    }

    public boolean m26887E() {
        String str;
        TdApi.User user;
        int i = this.f15325U;
        if ((i & Log.TAG_YOUTUBE) != 0) {
            return true;
        }
        if (((i & 8) != 0 || (i & 64) != 0) && (user = this.f15335c) != null) {
            str = C1363c0.m37410w(user.phoneNumber);
        } else if ((i & 16) == 0 || this.f15335c == null) {
            int i2 = this.f15324T;
            str = i2 != 0 ? C4779t2.m25556a2(this.f15335c, i2) : null;
        } else {
            str = "@" + this.f15335c.username;
        }
        int i3 = this.f15325U;
        if ((i3 & 1) != 0) {
            str = C1363c0.m37408y(this.f15332a0, false, true);
        } else if (str != null) {
            this.f15325U = i3 & (-3);
        } else if (this.f15333b != 0) {
            int h = C5063c.m24138h(i3, 2, this.f15331a.m2480e2().m1621m0(this.f15333b));
            this.f15325U = h;
            str = C4779t2.m25606S0(this.f15331a, this.f15333b, this.f15335c, (h & 32) == 0);
        } else {
            str = this.f15331a.m2583X6(this.f15334b0) ? C4403w.m27909Z1(C4403w.m27869i1(R.string.Group)) : this.f15331a.m2166xc().m3296m(this.f15334b0).toString();
        }
        if (C5070i.m24067c(this.f15320P, str)) {
            return this.f15325U != i;
        }
        this.f15320P = str;
        this.f15319O = C7389v0.m16680T1(str, C4022o.getStatusPaint());
        return true;
    }

    public final void m26886a() {
        this.f15318N = new C4587b.C4588a(C4779t2.m25681H0(this.f15328X, this.f15331a.m2519ba()), C4779t2.m25715C1(this.f15329Y, this.f15330Z));
        m26888D();
        m26887E();
    }

    public void m26885b() {
        this.f15325U |= 352;
    }

    @Override
    public TdApi.User mo23960c() {
        return this.f15335c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4618d7)) {
            return super.equals(obj);
        }
        C4618d7 d7Var = (C4618d7) obj;
        return m26869s() == d7Var.m26869s() && m26880h() == d7Var.m26880h() && this.f15325U == d7Var.f15325U && this.f15324T == d7Var.f15324T;
    }

    public C6246h m26882f() {
        return this.f15317M;
    }

    public C4587b.C4588a m26881g() {
        return this.f15318N;
    }

    public long m26880h() {
        long j = this.f15334b0;
        return j != 0 ? j : C7316a.m17058c(m26869s());
    }

    public String m26879i() {
        int i = this.f15325U;
        if ((i & 352) != 0) {
            return this.f15323S;
        }
        if ((i & 1) != 0) {
            return this.f15329Y;
        }
        TdApi.User user = this.f15335c;
        if (user != null) {
            return user.firstName;
        }
        return "User#" + this.f15333b;
    }

    public String m26878j() {
        if ((this.f15325U & 1) != 0) {
            return this.f15330Z;
        }
        TdApi.User user = this.f15335c;
        return user == null ? "" : user.lastName;
    }

    public String m26877k() {
        return this.f15323S;
    }

    public TdApi.MessageSender m26876l() {
        long j = this.f15333b;
        if (j != 0) {
            return new TdApi.MessageSenderUser(j);
        }
        long j2 = this.f15334b0;
        if (j2 == 0) {
            throw new IllegalStateException();
        } else if (C7316a.m17049l(j2)) {
            return new TdApi.MessageSenderUser(this.f15331a.m2494d4(this.f15334b0));
        } else {
            return new TdApi.MessageSenderChat(this.f15334b0);
        }
    }

    public String m26875m() {
        return (this.f15325U & 1) != 0 ? m26874n(this.f15329Y, this.f15330Z) : m26873o(this.f15335c);
    }

    public String m26872p() {
        return this.f15320P;
    }

    public float m26871q() {
        return this.f15319O;
    }

    public TdApi.User m26870r() {
        return this.f15335c;
    }

    public long m26869s() {
        if ((this.f15325U & 1) != 0) {
            return this.f15327W;
        }
        TdApi.User user = this.f15335c;
        if (user == null) {
            return 0L;
        }
        return user.f25439id;
    }

    public String m26868t() {
        TdApi.User user;
        if ((this.f15325U & 1) != 0 || (user = this.f15335c) == null) {
            return null;
        }
        return user.username;
    }

    public boolean m26867u() {
        return this.f15317M != null;
    }

    public boolean m26866v() {
        int i = this.f15325U;
        return (i & 2) != 0 || ((i & 64) == 0 && this.f15331a.m2379k7(this.f15333b));
    }

    public boolean m26865w() {
        ArrayList<C4618d7> arrayList = this.f15326V;
        if (arrayList != null && arrayList.size() > 1) {
            ArrayList<C4618d7> arrayList2 = this.f15326V;
            if (!arrayList2.get(arrayList2.size() - 1).equals(this)) {
                return true;
            }
        }
        return false;
    }

    public void m26864x(ArrayList<C4618d7> arrayList) {
        this.f15326V = arrayList;
    }

    public void m26863y(long j, TdApi.Chat chat) {
        this.f15335c = null;
        this.f15334b0 = j;
        this.f15318N = this.f15331a.m2931B3(j, chat, false);
        this.f15317M = this.f15331a.m2526b3(j);
        String S3 = this.f15331a.m2661S3(chat);
        this.f15323S = S3;
        this.f15322R = RunnableC5390g.m22983M0(S3);
        this.f15321Q = C7389v0.m16680T1(this.f15323S, C1410y.m37024n0());
        m26887E();
    }

    public void m26862z(String str) {
        if (C5070i.m24067c(this.f15320P, str)) {
            return;
        }
        if (C5070i.m24061i(str)) {
            this.f15325U &= -129;
            m26887E();
            return;
        }
        this.f15320P = str;
        int i = this.f15325U | Log.TAG_YOUTUBE;
        this.f15325U = i;
        this.f15325U = i & (-3);
    }

    public C4618d7(C10930q6 q6Var, TdApi.User user) {
        this.f15331a = q6Var;
        this.f15333b = user.f25439id;
        m26889C(user, 0);
    }

    public C4618d7(C10930q6 q6Var, TdApi.User user, boolean z, boolean z2) {
        this.f15331a = q6Var;
        this.f15333b = user.f25439id;
        if (z) {
            this.f15325U = 8;
        } else if (z2) {
            this.f15325U = 16;
        }
        m26889C(user, 0);
    }

    public C4618d7(C10930q6 q6Var, int i, int i2, String str, String str2, String str3) {
        this.f15333b = 0L;
        this.f15331a = q6Var;
        this.f15325U = 1;
        this.f15327W = i;
        this.f15328X = i2;
        this.f15329Y = str;
        this.f15330Z = str2;
        this.f15332a0 = str3;
        m26886a();
    }
}
