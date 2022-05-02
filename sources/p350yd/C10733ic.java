package p350yd;

import ge.C4868i;
import java.util.Arrays;
import java.util.Iterator;
import me.vkryl.leveldb.LevelDB;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import p108hb.C5063c;
import p108hb.C5070i;
import p124ib.C5325h;
import p143k0.C6038h;
import p154kb.C6227d;
import p181mb.C6810a;
import p364zd.C11520h;
import p364zd.C11524j;
import p364zd.C11541z;

public class C10733ic implements AbstractC10816l0 {
    public Integer f34338M;
    public Integer f34339N;
    public Boolean f34340O;
    public Integer f34341P;
    public Long f34342Q;
    public Long f34345T;
    public C6227d<AbstractC10738e> f34350Y;
    public C6227d<AbstractC10737d> f34351Z;
    public final C10930q6 f34352a;
    public Integer f34353b;
    public Integer f34354c;
    public final C6038h<C11520h> f34343R = new C6038h<>();
    public final Object f34344S = new Object();
    public final C5325h f34346U = new C5325h();
    public final C5325h f34347V = new C5325h();
    public final C6227d<AbstractC10734a> f34348W = new C6227d<>();
    public final C6227d<AbstractC10735b> f34349X = new C6227d<>();

    public interface AbstractC10734a {
        void mo4083b(long j, long j2);

        void mo4082g(long j);
    }

    public interface AbstractC10735b {
        void mo4081Q4(long j);

        void mo4080l7(long j);
    }

    public static class C10736c {
        public final long f34355a;
        public int f34356b = 1;
        public long f34357c;
        public long f34358d;
        public int f34359e;
        public Log.C7881d f34360f;

        public C10736c(long j) {
            this.f34355a = j;
        }

        public boolean m4079a() {
            return C5063c.m24145b(this.f34359e, 1);
        }
    }

    public interface AbstractC10737d {
        void mo4078r3(C10930q6 q6Var, boolean z);
    }

    public interface AbstractC10738e {
        void mo4077A1(C10930q6 q6Var, long j, boolean z);
    }

    public C10733ic(C10930q6 q6Var) {
        this.f34352a = q6Var;
        m4137T();
        q6Var.m2781K9().m1839l(this);
    }

    public static long[] m4156A(int i) {
        return C4868i.m24727c2().m24638n3().m17963r(m4138S("registered_device_uid_other", i));
    }

    public static int m4155B(int i) {
        return C4868i.m24727c2().m24780V0(m4138S("registered_device_tdlib", i), 0);
    }

    public static String m4154C(int i) {
        return C4868i.m24727c2().m24849L1(m4138S("registered_device_token", i), null);
    }

    public static long m4153D(int i) {
        return C4868i.m24727c2().m24712e1(m4138S("registered_device_uid", i), 0L);
    }

    public static long m4152E(int i, long j) {
        C4868i c2 = C4868i.m24727c2();
        return c2.m24712e1(m4138S("remote_chat_id_", i) + j, 0L);
    }

    public static int m4151F(C4868i iVar, int i, boolean z) {
        return C11541z.m36Y(iVar, m4131Z(iVar, "settings_global_theme_daylight", 0, i), true, z);
    }

    public static String m4138S(String str, int i) {
        if (i == 0) {
            return str;
        }
        return i + "_" + str;
    }

    public static String m4136U(int i, String str, String str2) {
        return m4138S("pending_conversion_", i) + str2 + "_" + str;
    }

    public static int m4131Z(C4868i iVar, String str, int i, int i2) {
        String S = m4138S(str, i2);
        if (i2 > 0) {
            return iVar.m24780V0(S, iVar.m24780V0(str, i));
        }
        return iVar.m24780V0(S, i);
    }

    public static void m4118h0(int i, int i2, int i3) {
        C4868i c2 = C4868i.m24727c2();
        int V = C11541z.m39V(m4131Z(c2, "settings_global_theme", 0, i), true);
        int W = C11541z.m38W(m4131Z(c2, "settings_global_theme_daylight", 0, i), true, false);
        int W2 = C11541z.m38W(m4131Z(c2, "settings_global_theme_night", 0, i), true, true);
        if (V == i2 || W == i2 || W2 == i2) {
            LevelDB W3 = C4868i.m24727c2().m24774W();
            if (W == i2) {
                W3.putInt(m4138S("settings_global_theme_daylight", i), i3);
            }
            if (W2 == i2) {
                W3.putInt(m4138S("settings_global_theme_night", i), i3);
            }
            if (V == i2) {
                W3.putInt(m4138S("settings_global_theme", i), i3);
            }
            W3.apply();
        }
    }

    public static boolean m4115j(int i, long j, String str, long[] jArr, boolean z) {
        if (m4155B(i) == 82 && m4153D(i) == j && C5070i.m24068c(m4154C(i), str)) {
            if (!z) {
                long[] A = m4156A(i);
                if (jArr == null || jArr.length <= 0) {
                    jArr = null;
                }
                if (Arrays.equals(A, jArr)) {
                }
            }
            return true;
        }
        return false;
    }

    public static void m4109m(int i, int i2) {
        LevelDB W = C4868i.m24727c2().m24774W();
        C4868i.m24727c2().m24837N(i, W, i2);
        W.apply();
    }

    public static void m4103p(int i, int i2, boolean z, int i3) {
        LevelDB levelDB;
        C4868i c2 = C4868i.m24727c2();
        int W = C11541z.m38W(m4131Z(c2, "settings_global_theme_daylight", 0, i), true, false);
        int W2 = C11541z.m38W(m4131Z(c2, "settings_global_theme_night", 0, i), true, true);
        if (z && W == i2) {
            if (i3 == 0 || C11524j.m253A0(i3)) {
                i3 = 11;
            }
            levelDB = C4868i.m24727c2().m24774W();
            levelDB.putInt(m4138S("settings_global_theme_daylight", i), C11541z.m34Z(i3));
            levelDB.putInt(m4138S("settings_global_theme_night", i), C11541z.m34Z(i2));
        } else if (z || W2 != i2) {
            levelDB = null;
        } else {
            if (i3 == 0 || !C11524j.m253A0(i3)) {
                i3 = 10;
            }
            levelDB = C4868i.m24727c2().m24774W();
            levelDB.putInt(m4138S("settings_global_theme_night", i), C11541z.m34Z(i3));
            levelDB.putInt(m4138S("settings_global_theme_daylight", i), C11541z.m34Z(i2));
        }
        if (levelDB != null) {
            levelDB.apply();
        }
    }

    public static void m4100q0(int i, long j, String str, long[] jArr) {
        if (C5070i.m24062i(str)) {
            m4088w0(i);
            return;
        }
        LevelDB W = C4868i.m24727c2().m24774W();
        W.putString(m4138S("registered_device_token", i), str);
        W.putLong(m4138S("registered_device_uid", i), j);
        W.putInt(m4138S("registered_device_tdlib", i), 82);
        if (jArr == null || jArr.length <= 0) {
            W.remove(m4138S("registered_device_uid_other", i));
        } else {
            W.m17995I(m4138S("registered_device_uid_other", i), jArr);
        }
        W.apply();
    }

    public static void m4088w0(int i) {
        C4868i.m24727c2().m24774W().remove(m4138S("registered_device_token", i)).remove(m4138S("registered_device_uid", i)).remove(m4138S("registered_device_uid_other", i)).remove(m4138S("registered_device_tdlib", i)).apply();
    }

    public final boolean m4150G(long j) {
        return C5063c.m24144c(m4149H(), j);
    }

    public final long m4149H() {
        if (this.f34342Q == null) {
            this.f34342Q = Long.valueOf(C4868i.m24727c2().m24712e1(m4138S("settings_user_preferences", this.f34352a.m2188w6()), 0L));
        }
        return this.f34342Q.longValue();
    }

    public C11520h m4148I(int i) {
        return m4147J(i, false);
    }

    public C11520h m4147J(int i, boolean z) {
        int g = this.f34343R.m21470g(i);
        C11520h o = g >= 0 ? this.f34343R.m21463o(g) : null;
        if (g < 0) {
            o = C11520h.m283n0(this.f34352a, i);
            this.f34343R.m21467j(i, o);
        }
        if (o == null) {
            return null;
        }
        if (z || !o.m319R()) {
            return o;
        }
        return null;
    }

    public int m4146K() {
        if (this.f34354c == null) {
            this.f34354c = Integer.valueOf(C11541z.m38W(m4131Z(C4868i.m24727c2(), "settings_global_theme_daylight", 0, this.f34352a.m2188w6()), true, false));
        }
        return this.f34354c.intValue();
    }

    public int m4145L() {
        if (this.f34338M == null) {
            this.f34338M = Integer.valueOf(C11541z.m38W(m4131Z(C4868i.m24727c2(), "settings_global_theme_night", 0, this.f34352a.m2188w6()), true, true));
        }
        return this.f34338M.intValue();
    }

    public int m4144M() {
        if (this.f34353b == null) {
            int V = C11541z.m39V(m4131Z(C4868i.m24727c2(), "settings_global_theme", 0, this.f34352a.m2188w6()), true);
            if (C4868i.m24727c2().m24648m1() == 2) {
                int K = C4868i.m24727c2().m24743a2() ? m4146K() : m4145L();
                if (V != K) {
                    C4868i.m24727c2().m24582u3(m4138S("settings_global_theme", this.f34352a.m2188w6()), K);
                    V = K;
                }
            }
            this.f34353b = Integer.valueOf(V);
        }
        return this.f34353b.intValue();
    }

    public boolean m4143N(long j) {
        C4868i c2 = C4868i.m24727c2();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m4138S("dismiss_pinned_", this.f34352a.m2188w6()));
        sb2.append(j);
        return c2.m24712e1(sb2.toString(), 0L) > 0;
    }

    public boolean m4142O() {
        return m4084z() > 0;
    }

    public boolean m4141P(String str, String str2) {
        return C4868i.m24727c2().m24851L(m4136U(this.f34352a.m2188w6(), str, str2));
    }

    public boolean m4140Q(long j, long j2) {
        if (j2 != 0) {
            C4868i c2 = C4868i.m24727c2();
            if (c2.m24712e1(m4138S("dismiss_pinned_", this.f34352a.m2188w6()) + j, 0L) >= j2) {
                return true;
            }
        }
        return false;
    }

    public boolean m4139R(long j, TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        if (chatJoinRequestsInfo != null) {
            C4868i c2 = C4868i.m24727c2();
            if (!Arrays.equals(c2.m24704f1(m4138S("dismiss_requests_", this.f34352a.m2188w6()) + j), chatJoinRequestsInfo.userIds)) {
                return false;
            }
        }
        return true;
    }

    public final void m4137T() {
    }

    public boolean m4135V() {
        return m4150G(1L);
    }

    public boolean m4134W() {
        return m4150G(2L);
    }

    public final long m4133X() {
        String S = m4138S("local_chat_ids", this.f34352a.m2188w6());
        if (this.f34345T == null) {
            this.f34345T = Long.valueOf(C4868i.m24727c2().m24712e1(S, 0L));
        }
        Long valueOf = Long.valueOf(this.f34345T.longValue() + 1);
        this.f34345T = valueOf;
        long longValue = valueOf.longValue();
        C4868i.m24727c2().m24567w3(S, longValue);
        return longValue;
    }

    public final void m4132Y(long j, boolean z) {
        Iterator<AbstractC10738e> it = this.f34350Y.iterator();
        while (it.hasNext()) {
            it.next().mo4077A1(this.f34352a, j, z);
        }
    }

    @Override
    public void mo1411a() {
    }

    public void m4130a0(String str, String str2) {
        C4868i.m24727c2().m24924A3(m4136U(this.f34352a.m2188w6(), str, str2));
    }

    @Override
    public void mo1409b(boolean z) {
        if (z && this.f34352a.m2188w6() > 0) {
            m4137T();
        }
    }

    public void m4129b0(AbstractC10735b bVar) {
        this.f34349X.remove(bVar);
    }

    @Override
    public void mo1407c() {
        LevelDB W = C4868i.m24727c2().m24774W();
        int w6 = this.f34352a.m2188w6();
        C4868i.m24727c2().m24823P(this.f34352a, W);
        this.f34343R.m21475b();
        W.remove(m4138S("settings_chat_style", w6));
        W.remove(m4138S("settings_channel_plain", w6));
        W.remove(m4138S("settings_user_preferences", w6));
        W.remove(m4138S("settings_global_theme", w6));
        W.remove(m4138S("settings_global_theme_night", w6));
        W.remove(m4138S("settings_global_theme_daylight", w6));
        W.remove(m4138S("local_chat_ids", w6));
        C4868i.m24727c2().m24819P3(w6, W);
        C4868i.m24727c2().m24882G3(new String[]{m4138S("dismiss_pinned_", w6), m4138S("dismiss_requests_", w6), m4138S("notification_gdata_", w6), m4138S("notification_data_", w6), m4138S("pending_conversion_", w6), m4138S("local_chat_id_", w6), m4138S("remote_chat_id_", w6)}, W);
        W.apply();
        this.f34338M = null;
        this.f34354c = null;
        this.f34353b = null;
        this.f34341P = null;
        this.f34339N = null;
        this.f34340O = null;
        this.f34342Q = null;
        this.f34345T = null;
        this.f34346U.m23249a();
        this.f34347V.m23249a();
        m4088w0(this.f34352a.m2188w6());
        m4137T();
    }

    public void m4128c0(AbstractC10737d dVar) {
        C6227d<AbstractC10737d> dVar2 = this.f34351Z;
        if (dVar2 != null) {
            dVar2.remove(dVar);
        }
    }

    public void m4127d(AbstractC10735b bVar) {
        this.f34349X.add(bVar);
    }

    public void m4126d0(AbstractC10734a aVar) {
        this.f34348W.remove(aVar);
    }

    public void m4125e(AbstractC10737d dVar) {
        if (this.f34351Z == null) {
            this.f34351Z = new C6227d<>(true);
        }
        this.f34351Z.add(dVar);
    }

    public void m4124e0(AbstractC10738e eVar) {
        C6227d<AbstractC10738e> dVar = this.f34350Y;
        if (dVar != null) {
            dVar.remove(eVar);
        }
    }

    public void m4123f(AbstractC10734a aVar) {
        this.f34348W.add(aVar);
    }

    public void m4122f0(C10733ic icVar) {
        int M = icVar.m4144M();
        int K = icVar.m4146K();
        int L = icVar.m4145L();
        int w6 = this.f34352a.m2188w6();
        LevelDB W = C4868i.m24727c2().m24774W();
        String S = m4138S("settings_global_theme_daylight", w6);
        Integer valueOf = Integer.valueOf(K);
        this.f34354c = valueOf;
        W.putInt(S, valueOf.intValue());
        String S2 = m4138S("settings_global_theme_night", w6);
        Integer valueOf2 = Integer.valueOf(L);
        this.f34338M = valueOf2;
        W.putInt(S2, valueOf2.intValue());
        String S3 = m4138S("settings_global_theme", w6);
        Integer valueOf3 = Integer.valueOf(M);
        this.f34353b = valueOf3;
        W.putInt(S3, valueOf3.intValue());
        W.apply();
    }

    public void m4121g(AbstractC10738e eVar) {
        if (this.f34350Y == null) {
            this.f34350Y = new C6227d<>();
        }
        this.f34350Y.add(eVar);
    }

    public void m4120g0(int i, int i2) {
        if (m4144M() == i || m4146K() == i || m4145L() == i) {
            int w6 = this.f34352a.m2188w6();
            LevelDB W = C4868i.m24727c2().m24774W();
            if (m4146K() == i) {
                String S = m4138S("settings_global_theme_daylight", w6);
                Integer valueOf = Integer.valueOf(i2);
                this.f34354c = valueOf;
                W.putInt(S, valueOf.intValue());
            }
            if (m4145L() == i) {
                String S2 = m4138S("settings_global_theme_night", w6);
                Integer valueOf2 = Integer.valueOf(i2);
                this.f34338M = valueOf2;
                W.putInt(S2, valueOf2.intValue());
            }
            if (m4144M() == i) {
                String S3 = m4138S("settings_global_theme", w6);
                Integer valueOf3 = Integer.valueOf(i2);
                this.f34353b = valueOf3;
                W.putInt(S3, valueOf3.intValue());
            }
            W.apply();
        }
    }

    public java.lang.String m4119h() {
        throw new UnsupportedOperationException("Method not decompiled: p350yd.C10733ic.m4119h():java.lang.String");
    }

    public int m4117i() {
        throw new UnsupportedOperationException("Method not decompiled: p350yd.C10733ic.m4117i():int");
    }

    public void m4116i0(long j) {
        C4868i c2 = C4868i.m24727c2();
        c2.m24889F3(m4138S("dismiss_pinned_", this.f34352a.m2188w6()) + j);
        Iterator<AbstractC10734a> it = this.f34348W.iterator();
        while (it.hasNext()) {
            it.next().mo4082g(j);
        }
    }

    public void m4114j0(long j, boolean z) {
        C4868i c2 = C4868i.m24727c2();
        c2.m24889F3(m4138S("dismiss_requests_", this.f34352a.m2188w6()) + j);
        if (!z) {
            Iterator<AbstractC10735b> it = this.f34349X.iterator();
            while (it.hasNext()) {
                it.next().mo4080l7(j);
            }
        }
    }

    public void m4113k() {
        LevelDB n3 = C4868i.m24727c2().m24638n3();
        n3.m17990N(m4138S("notification_data_", this.f34352a.m2188w6()));
        n3.m17990N(m4138S("notification_gdata_", this.f34352a.m2188w6()));
        n3.m17970k();
    }

    public void m4112k0(String str) {
        String S = m4138S("settings_app_config", this.f34352a.m2188w6());
        if (C5070i.m24062i(str)) {
            C4868i.m24727c2().m24889F3(S);
        } else {
            C4868i.m24727c2().m24546z3(S, str);
        }
    }

    public void m4111l(int i) {
        this.f34343R.m21466k(i);
        m4109m(this.f34352a.m2188w6(), i);
    }

    public void m4110l0(int i) {
        if (m4117i() != i) {
            this.f34339N = Integer.valueOf(i);
            C4868i.m24727c2().m24582u3(m4138S("settings_chat_style", this.f34352a.m2188w6()), i);
            if (i == 2) {
                this.f34352a.m2712Oe().m2017g();
            }
            C11541z.m7t().m54I(this.f34352a, i);
        }
    }

    public void m4108m0(boolean z) {
        this.f34340O = Boolean.valueOf(z);
        C4868i.m24727c2().m24598s3(m4138S("settings_channel_plain", this.f34352a.m2188w6()), z);
    }

    public void m4107n(long j, long j2) {
        C4868i c2 = C4868i.m24727c2();
        c2.m24567w3(m4138S("dismiss_pinned_", this.f34352a.m2188w6()) + j, j2);
        Iterator<AbstractC10734a> it = this.f34348W.iterator();
        while (it.hasNext()) {
            it.next().mo4083b(j, j2);
        }
    }

    public void m4106n0(int i) {
        int M = m4144M();
        if (M != i) {
            int w6 = this.f34352a.m2188w6();
            LevelDB W = C4868i.m24727c2().m24774W();
            if (C11524j.m253A0(i)) {
                String S = m4138S("settings_global_theme_night", w6);
                Integer valueOf = Integer.valueOf(i);
                this.f34338M = valueOf;
                W.putInt(S, C11541z.m34Z(valueOf.intValue()));
            } else if (C11524j.m253A0(M)) {
                String S2 = m4138S("settings_global_theme_night", w6);
                Integer valueOf2 = Integer.valueOf(M);
                this.f34338M = valueOf2;
                W.putInt(S2, C11541z.m34Z(valueOf2.intValue()));
            }
            if (!C11524j.m253A0(i)) {
                String S3 = m4138S("settings_global_theme_daylight", w6);
                Integer valueOf3 = Integer.valueOf(i);
                this.f34354c = valueOf3;
                W.putInt(S3, C11541z.m34Z(valueOf3.intValue()));
            } else if (!C11524j.m253A0(M)) {
                String S4 = m4138S("settings_global_theme_daylight", w6);
                Integer valueOf4 = Integer.valueOf(M);
                this.f34354c = valueOf4;
                W.putInt(S4, C11541z.m34Z(valueOf4.intValue()));
            }
            String S5 = m4138S("settings_global_theme", w6);
            Integer valueOf5 = Integer.valueOf(i);
            this.f34353b = valueOf5;
            W.putInt(S5, C11541z.m34Z(valueOf5.intValue()));
            W.apply();
            this.f34352a.m2712Oe().m2003u(M, i);
        }
    }

    public void m4105o(long j, TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        C4868i c2 = C4868i.m24727c2();
        c2.m24560x3(m4138S("dismiss_requests_", this.f34352a.m2188w6()) + j, chatJoinRequestsInfo.userIds);
        Iterator<AbstractC10735b> it = this.f34349X.iterator();
        while (it.hasNext()) {
            it.next().mo4081Q4(j);
        }
    }

    public void m4104o0(int i, int i2) {
        String S = m4138S("notification_data_" + i, this.f34352a.m2188w6());
        if (i2 != 0) {
            C4868i.m24727c2().m24582u3(S, i2);
        } else {
            C4868i.m24727c2().m24889F3(S);
        }
    }

    public void m4102p0(int i, int i2, int i3) {
        String S = m4138S("notification_gdata_" + i, this.f34352a.m2188w6());
        if (i2 == 0 && i3 == 0) {
            C4868i.m24727c2().m24889F3(S);
            return;
        }
        C4868i.m24727c2().m24567w3(S, C5063c.m24141f(i2, i3));
    }

    public void m4101q(int i, boolean z, int i2) {
        LevelDB levelDB;
        int w6 = this.f34352a.m2188w6();
        if (z && m4146K() == i) {
            if (i2 == 0 || C11524j.m253A0(i2)) {
                i2 = 11;
            }
            levelDB = C4868i.m24727c2().m24774W();
            String S = m4138S("settings_global_theme_daylight", w6);
            Integer valueOf = Integer.valueOf(i2);
            this.f34354c = valueOf;
            levelDB.putInt(S, C11541z.m34Z(valueOf.intValue()));
            String S2 = m4138S("settings_global_theme_night", w6);
            Integer valueOf2 = Integer.valueOf(i);
            this.f34338M = valueOf2;
            levelDB.putInt(S2, C11541z.m34Z(valueOf2.intValue()));
        } else if (z || m4145L() != i) {
            levelDB = null;
        } else {
            if (i2 == 0 || !C11524j.m253A0(i2)) {
                i2 = 10;
            }
            levelDB = C4868i.m24727c2().m24774W();
            String S3 = m4138S("settings_global_theme_night", w6);
            Integer valueOf3 = Integer.valueOf(i2);
            this.f34338M = valueOf3;
            levelDB.putInt(S3, C11541z.m34Z(valueOf3.intValue()));
            String S4 = m4138S("settings_global_theme_daylight", w6);
            Integer valueOf4 = Integer.valueOf(i);
            this.f34354c = valueOf4;
            levelDB.putInt(S4, C11541z.m34Z(valueOf4.intValue()));
        }
        if (levelDB != null) {
            levelDB.apply();
        }
    }

    public boolean m4099r() {
        if (this.f34340O == null) {
            this.f34340O = Boolean.valueOf(C4868i.m24727c2().m24633o0(m4138S("settings_channel_plain", this.f34352a.m2188w6()), true));
        }
        return this.f34340O.booleanValue();
    }

    public boolean m4098r0(long j, boolean z) {
        long H = m4149H();
        long i = C5063c.m24138i(H, j, z);
        if (H == i) {
            return false;
        }
        C4868i c2 = C4868i.m24727c2();
        String S = m4138S("settings_user_preferences", this.f34352a.m2188w6());
        Long valueOf = Long.valueOf(i);
        this.f34342Q = valueOf;
        c2.m24567w3(S, valueOf.longValue());
        m4132Y(j, z);
        return true;
    }

    public void m4097s(String str, String str2) {
        C4868i.m24727c2().m24889F3(m4136U(this.f34352a.m2188w6(), str, str2));
    }

    public void m4096s0(C11520h hVar, boolean z, int i) {
        C11520h I = m4148I(i);
        if ((I == null && hVar != null) || (z && !C11520h.m296h(I, hVar, false))) {
            C11541z.m7t().m53J(this.f34352a, hVar, 0L, i);
            if (hVar != null) {
                hVar.m279p0(i);
                hVar.m305c0(this.f34352a);
            } else {
                LevelDB W = C4868i.m24727c2().m24774W();
                C4868i.m24727c2().m24830O(this.f34352a, W, i);
                W.apply();
            }
            this.f34343R.m21467j(i, hVar);
        }
    }

    public void m4095t() {
        if (m4084z() > 0) {
            this.f34341P = 0;
            C4868i.m24727c2().m24875H3(m4138S("notification_error", this.f34352a.m2188w6()), null);
            C6227d<AbstractC10737d> dVar = this.f34351Z;
            if (dVar != null) {
                Iterator<AbstractC10737d> it = dVar.iterator();
                while (it.hasNext()) {
                    it.next().mo4078r3(this.f34352a, false);
                }
            }
        }
    }

    public void m4094t0() {
        int i = 2;
        if (m4117i() == 2) {
            i = 1;
        }
        m4110l0(i);
    }

    public String m4093u() {
        return C4868i.m24727c2().m24849L1(m4138S("settings_app_config", this.f34352a.m2188w6()), null);
    }

    public void m4092u0(long j) {
        m4098r0(j, !m4150G(j));
    }

    public long m4091v() {
        if (m4084z() == 0) {
            return 0L;
        }
        String S = m4138S("notification_error_", this.f34352a.m2188w6());
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        for (LevelDB.C7052a aVar : C4868i.m24727c2().m24638n3().m17974g(S)) {
            String l = aVar.m17943l();
            int indexOf = l.indexOf(95, S.length());
            if (indexOf != -1) {
                long w = C5070i.m24048w(l.substring(S.length(), indexOf));
                String substring = l.substring(indexOf + 1);
                substring.hashCode();
                if (substring.equals("chat")) {
                    long i = aVar.m17946i();
                    if (w == j3) {
                        j = i;
                        j5 = j;
                    } else {
                        j5 = i;
                    }
                    j4 = w;
                } else if (substring.equals("time")) {
                    long i2 = aVar.m17946i();
                    if (i2 > j2) {
                        j = j4 == w ? j5 : 0L;
                        j2 = i2;
                        j3 = w;
                    }
                }
            }
        }
        return j;
    }

    public synchronized void m4090v0(Throwable th, boolean z, long j) {
        C6227d<AbstractC10737d> dVar;
        int z2 = m4084z() + 1;
        boolean z3 = z2 == 1;
        int i = z ? 1 : 0;
        C6810a aVar = new C6810a(Log.blobSize(th) + 1);
        aVar.m18952B((byte) i);
        Log.toBlob(th, aVar);
        byte[] y = aVar.m18915y();
        String S = m4138S("notification_error", this.f34352a.m2188w6());
        String i2 = C4868i.m24727c2().m24638n3().m17972i(S, y);
        LevelDB W = C4868i.m24727c2().m24774W();
        if (z3) {
            W.putInt(m4138S("notification_version", this.f34352a.m2188w6()), 1507020);
        }
        W.putInt(S, z2);
        if (i2 == null || !i2.endsWith("_data")) {
            String str = S + "_" + z2 + "_data";
            String str2 = S + "_" + z2 + "_time";
            String str3 = S + "_" + z2 + "_chat";
            W.m18000D(str, y);
            if (j != 0) {
                W.putLong(str3, j);
            } else {
                W.remove(str3);
            }
            W.putLong(str2, System.currentTimeMillis());
        } else {
            String substring = i2.substring(0, i2.length() - 4);
            String str4 = substring + "count";
            String str5 = substring + "time";
            String str6 = substring + "chat";
            W.putInt(str4, W.getInt(str4, 1) + 1);
            if (j != 0) {
                W.putLong(str6, j);
            } else {
                W.remove(str6);
            }
            W.putLong(str5, System.currentTimeMillis());
        }
        W.apply();
        this.f34341P = Integer.valueOf(z2);
        if (z3 && (dVar = this.f34351Z) != null) {
            Iterator<AbstractC10737d> it = dVar.iterator();
            while (it.hasNext()) {
                it.next().mo4078r3(this.f34352a, true);
            }
        }
    }

    public long m4089w(long j) {
        long d;
        synchronized (this.f34344S) {
            d = this.f34346U.m23246d(j);
            if (d == 0) {
                String str = m4138S("local_chat_id_", this.f34352a.m2188w6()) + j;
                long e1 = C4868i.m24727c2().m24712e1(str, 0L);
                if (e1 == 0) {
                    long X = m4133X();
                    C4868i.m24727c2().m24567w3(str, X);
                    C4868i.m24727c2().m24567w3(m4138S("remote_chat_id_", this.f34352a.m2188w6()) + X, j);
                    d = X;
                } else {
                    d = e1;
                }
                this.f34346U.m23243g(j, d);
                this.f34347V.m23243g(d, j);
            }
        }
        return d;
    }

    public int m4087x(int i) {
        return C4868i.m24727c2().m24780V0(m4138S("notification_data_" + i, this.f34352a.m2188w6()), 0);
    }

    public boolean m4086x0() {
        return m4117i() == 2;
    }

    public long m4085y(int i) {
        return C4868i.m24727c2().m24712e1(m4138S("notification_gdata_" + i, this.f34352a.m2188w6()), 0L);
    }

    public int m4084z() {
        if (this.f34341P == null) {
            if (C4868i.m24727c2().m24780V0(m4138S("notification_version", this.f34352a.m2188w6()), 1507020) != 1507020) {
                LevelDB W = C4868i.m24727c2().m24774W();
                W.m17990N(m4138S("notification_error", this.f34352a.m2188w6()));
                W.remove(m4138S("notification_version", this.f34352a.m2188w6()));
                W.apply();
            }
            this.f34341P = Integer.valueOf(C4868i.m24727c2().m24780V0(m4138S("notification_error", this.f34352a.m2188w6()), 0));
        }
        return this.f34341P.intValue();
    }
}
