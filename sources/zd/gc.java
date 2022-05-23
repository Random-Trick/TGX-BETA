package zd;

import ae.j;
import ae.z;
import he.i;
import java.util.Arrays;
import java.util.Iterator;
import k0.h;
import me.vkryl.leveldb.LevelDB;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;

public class gc implements j0 {
    public Integer M;
    public Integer N;
    public Boolean O;
    public Integer P;
    public Long Q;
    public Long T;
    public lb.d<e> Y;
    public lb.d<d> Z;
    public final o6 f27566a;
    public Integer f27567b;
    public Integer f27568c;
    public final h<ae.h> R = new h<>();
    public final Object S = new Object();
    public final jb.h U = new jb.h();
    public final jb.h V = new jb.h();
    public final lb.d<a> W = new lb.d<>();
    public final lb.d<b> X = new lb.d<>();

    public interface a {
        void b(long j10, long j11);

        void f(long j10);
    }

    public interface b {
        void I4(long j10);

        void k7(long j10);
    }

    public static class c {
        public final long f27569a;
        public int f27570b = 1;
        public long f27571c;
        public long f27572d;
        public int f27573e;
        public Log.d f27574f;

        public c(long j10) {
            this.f27569a = j10;
        }

        public boolean a() {
            return ib.c.b(this.f27573e, 1);
        }
    }

    public interface d {
        void N2(o6 o6Var, boolean z10);
    }

    public interface e {
        void d7(o6 o6Var, long j10, boolean z10);
    }

    public gc(o6 o6Var) {
        this.f27566a = o6Var;
        T();
        o6Var.O9().l(this);
    }

    public static long[] A(int i10) {
        return i.c2().n3().r(S("registered_device_uid_other", i10));
    }

    public static int B(int i10) {
        return i.c2().V0(S("registered_device_tdlib", i10), 0);
    }

    public static String C(int i10) {
        return i.c2().L1(S("registered_device_token", i10), null);
    }

    public static long D(int i10) {
        return i.c2().e1(S("registered_device_uid", i10), 0L);
    }

    public static long E(int i10, long j10) {
        i c22 = i.c2();
        return c22.e1(S("remote_chat_id_", i10) + j10, 0L);
    }

    public static int F(i iVar, int i10, boolean z10) {
        return z.a0(iVar, Z(iVar, "settings_global_theme_daylight", 0, i10), true, z10);
    }

    public static String S(String str, int i10) {
        if (i10 == 0) {
            return str;
        }
        return i10 + "_" + str;
    }

    public static String U(int i10, String str, String str2) {
        return S("pending_conversion_", i10) + str2 + "_" + str;
    }

    public static int Z(i iVar, String str, int i10, int i11) {
        String S = S(str, i11);
        if (i11 > 0) {
            return iVar.V0(S, iVar.V0(str, i10));
        }
        return iVar.V0(S, i10);
    }

    public static void h0(int i10, int i11, int i12) {
        i c22 = i.c2();
        int X = z.X(Z(c22, "settings_global_theme", 0, i10), true);
        int Y = z.Y(Z(c22, "settings_global_theme_daylight", 0, i10), true, false);
        int Y2 = z.Y(Z(c22, "settings_global_theme_night", 0, i10), true, true);
        if (X == i11 || Y == i11 || Y2 == i11) {
            LevelDB W = i.c2().W();
            if (Y == i11) {
                W.putInt(S("settings_global_theme_daylight", i10), i12);
            }
            if (Y2 == i11) {
                W.putInt(S("settings_global_theme_night", i10), i12);
            }
            if (X == i11) {
                W.putInt(S("settings_global_theme", i10), i12);
            }
            W.apply();
        }
    }

    public static boolean j(int i10, long j10, String str, long[] jArr, boolean z10) {
        if (B(i10) == 83 && D(i10) == j10 && ib.i.c(C(i10), str)) {
            if (!z10) {
                long[] A = A(i10);
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

    public static void m(int i10, int i11) {
        LevelDB W = i.c2().W();
        i.c2().N(i10, W, i11);
        W.apply();
    }

    public static void p(int i10, int i11, boolean z10, int i12) {
        LevelDB levelDB;
        i c22 = i.c2();
        int Y = z.Y(Z(c22, "settings_global_theme_daylight", 0, i10), true, false);
        int Y2 = z.Y(Z(c22, "settings_global_theme_night", 0, i10), true, true);
        if (z10 && Y == i11) {
            if (i12 == 0 || j.y0(i12)) {
                i12 = 11;
            }
            levelDB = i.c2().W();
            levelDB.putInt(S("settings_global_theme_daylight", i10), z.b0(i12));
            levelDB.putInt(S("settings_global_theme_night", i10), z.b0(i11));
        } else if (z10 || Y2 != i11) {
            levelDB = null;
        } else {
            if (i12 == 0 || !j.y0(i12)) {
                i12 = 10;
            }
            levelDB = i.c2().W();
            levelDB.putInt(S("settings_global_theme_night", i10), z.b0(i12));
            levelDB.putInt(S("settings_global_theme_daylight", i10), z.b0(i11));
        }
        if (levelDB != null) {
            levelDB.apply();
        }
    }

    public static void q0(int i10, long j10, String str, long[] jArr) {
        if (ib.i.i(str)) {
            w0(i10);
            return;
        }
        LevelDB W = i.c2().W();
        W.putString(S("registered_device_token", i10), str);
        W.putLong(S("registered_device_uid", i10), j10);
        W.putInt(S("registered_device_tdlib", i10), 83);
        if (jArr == null || jArr.length <= 0) {
            W.remove(S("registered_device_uid_other", i10));
        } else {
            W.I(S("registered_device_uid_other", i10), jArr);
        }
        W.apply();
    }

    public static void w0(int i10) {
        i.c2().W().remove(S("registered_device_token", i10)).remove(S("registered_device_uid", i10)).remove(S("registered_device_uid_other", i10)).remove(S("registered_device_tdlib", i10)).apply();
    }

    public final boolean G(long j10) {
        return ib.c.c(H(), j10);
    }

    public final long H() {
        if (this.Q == null) {
            this.Q = Long.valueOf(i.c2().e1(S("settings_user_preferences", this.f27566a.A6()), 0L));
        }
        return this.Q.longValue();
    }

    public ae.h I(int i10) {
        return J(i10, false);
    }

    public ae.h J(int i10, boolean z10) {
        int g10 = this.R.g(i10);
        ae.h o10 = g10 >= 0 ? this.R.o(g10) : null;
        if (g10 < 0) {
            o10 = ae.h.n0(this.f27566a, i10);
            this.R.j(i10, o10);
        }
        if (o10 == null) {
            return null;
        }
        if (z10 || !o10.R()) {
            return o10;
        }
        return null;
    }

    public int K() {
        if (this.f27568c == null) {
            this.f27568c = Integer.valueOf(z.Y(Z(i.c2(), "settings_global_theme_daylight", 0, this.f27566a.A6()), true, false));
        }
        return this.f27568c.intValue();
    }

    public int L() {
        if (this.M == null) {
            this.M = Integer.valueOf(z.Y(Z(i.c2(), "settings_global_theme_night", 0, this.f27566a.A6()), true, true));
        }
        return this.M.intValue();
    }

    public int M() {
        if (this.f27567b == null) {
            int X = z.X(Z(i.c2(), "settings_global_theme", 0, this.f27566a.A6()), true);
            if (i.c2().m1() == 2) {
                int K = i.c2().a2() ? K() : L();
                if (X != K) {
                    i.c2().u3(S("settings_global_theme", this.f27566a.A6()), K);
                    X = K;
                }
            }
            this.f27567b = Integer.valueOf(X);
        }
        return this.f27567b.intValue();
    }

    public boolean N(long j10) {
        i c22 = i.c2();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(S("dismiss_pinned_", this.f27566a.A6()));
        sb2.append(j10);
        return c22.e1(sb2.toString(), 0L) > 0;
    }

    public boolean O() {
        return z() > 0;
    }

    public boolean P(String str, String str2) {
        return i.c2().L(U(this.f27566a.A6(), str, str2));
    }

    public boolean Q(long j10, long j11) {
        if (j11 != 0) {
            i c22 = i.c2();
            if (c22.e1(S("dismiss_pinned_", this.f27566a.A6()) + j10, 0L) >= j11) {
                return true;
            }
        }
        return false;
    }

    public boolean R(long j10, TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        if (chatJoinRequestsInfo != null) {
            i c22 = i.c2();
            if (!Arrays.equals(c22.f1(S("dismiss_requests_", this.f27566a.A6()) + j10), chatJoinRequestsInfo.userIds)) {
                return false;
            }
        }
        return true;
    }

    public final void T() {
    }

    public boolean V() {
        return G(1L);
    }

    public boolean W() {
        return G(2L);
    }

    public final long X() {
        String S = S("local_chat_ids", this.f27566a.A6());
        if (this.T == null) {
            this.T = Long.valueOf(i.c2().e1(S, 0L));
        }
        Long valueOf = Long.valueOf(this.T.longValue() + 1);
        this.T = valueOf;
        long longValue = valueOf.longValue();
        i.c2().w3(S, longValue);
        return longValue;
    }

    public final void Y(long j10, boolean z10) {
        Iterator<e> it = this.Y.iterator();
        while (it.hasNext()) {
            it.next().d7(this.f27566a, j10, z10);
        }
    }

    @Override
    public void a() {
    }

    public void a0(String str, String str2) {
        i.c2().A3(U(this.f27566a.A6(), str, str2));
    }

    @Override
    public void b(boolean z10) {
        if (z10 && this.f27566a.A6() > 0) {
            T();
        }
    }

    public void b0(b bVar) {
        this.X.remove(bVar);
    }

    @Override
    public void c() {
        LevelDB W = i.c2().W();
        int A6 = this.f27566a.A6();
        i.c2().P(this.f27566a, W);
        this.R.b();
        W.remove(S("settings_chat_style", A6));
        W.remove(S("settings_channel_plain", A6));
        W.remove(S("settings_user_preferences", A6));
        W.remove(S("settings_global_theme", A6));
        W.remove(S("settings_global_theme_night", A6));
        W.remove(S("settings_global_theme_daylight", A6));
        W.remove(S("local_chat_ids", A6));
        i.c2().P3(A6, W);
        i.c2().G3(new String[]{S("dismiss_pinned_", A6), S("dismiss_requests_", A6), S("notification_gdata_", A6), S("notification_data_", A6), S("pending_conversion_", A6), S("local_chat_id_", A6), S("remote_chat_id_", A6)}, W);
        W.apply();
        this.M = null;
        this.f27568c = null;
        this.f27567b = null;
        this.P = null;
        this.N = null;
        this.O = null;
        this.Q = null;
        this.T = null;
        this.U.a();
        this.V.a();
        w0(this.f27566a.A6());
        T();
    }

    public void c0(d dVar) {
        lb.d<d> dVar2 = this.Z;
        if (dVar2 != null) {
            dVar2.remove(dVar);
        }
    }

    public void d(b bVar) {
        this.X.add(bVar);
    }

    public void d0(a aVar) {
        this.W.remove(aVar);
    }

    public void e(d dVar) {
        if (this.Z == null) {
            this.Z = new lb.d<>(true);
        }
        this.Z.add(dVar);
    }

    public void e0(e eVar) {
        lb.d<e> dVar = this.Y;
        if (dVar != null) {
            dVar.remove(eVar);
        }
    }

    public void f(a aVar) {
        this.W.add(aVar);
    }

    public void f0(gc gcVar) {
        int M = gcVar.M();
        int K = gcVar.K();
        int L = gcVar.L();
        int A6 = this.f27566a.A6();
        LevelDB W = i.c2().W();
        String S = S("settings_global_theme_daylight", A6);
        Integer valueOf = Integer.valueOf(K);
        this.f27568c = valueOf;
        W.putInt(S, valueOf.intValue());
        String S2 = S("settings_global_theme_night", A6);
        Integer valueOf2 = Integer.valueOf(L);
        this.M = valueOf2;
        W.putInt(S2, valueOf2.intValue());
        String S3 = S("settings_global_theme", A6);
        Integer valueOf3 = Integer.valueOf(M);
        this.f27567b = valueOf3;
        W.putInt(S3, valueOf3.intValue());
        W.apply();
    }

    public void g(e eVar) {
        if (this.Y == null) {
            this.Y = new lb.d<>();
        }
        this.Y.add(eVar);
    }

    public void g0(int i10, int i11) {
        if (M() == i10 || K() == i10 || L() == i10) {
            int A6 = this.f27566a.A6();
            LevelDB W = i.c2().W();
            if (K() == i10) {
                String S = S("settings_global_theme_daylight", A6);
                Integer valueOf = Integer.valueOf(i11);
                this.f27568c = valueOf;
                W.putInt(S, valueOf.intValue());
            }
            if (L() == i10) {
                String S2 = S("settings_global_theme_night", A6);
                Integer valueOf2 = Integer.valueOf(i11);
                this.M = valueOf2;
                W.putInt(S2, valueOf2.intValue());
            }
            if (M() == i10) {
                String S3 = S("settings_global_theme", A6);
                Integer valueOf3 = Integer.valueOf(i11);
                this.f27567b = valueOf3;
                W.putInt(S3, valueOf3.intValue());
            }
            W.apply();
        }
    }

    public java.lang.String h() {
        throw new UnsupportedOperationException("Method not decompiled: zd.gc.h():java.lang.String");
    }

    public int i() {
        throw new UnsupportedOperationException("Method not decompiled: zd.gc.i():int");
    }

    public void i0(long j10) {
        i c22 = i.c2();
        c22.F3(S("dismiss_pinned_", this.f27566a.A6()) + j10);
        Iterator<a> it = this.W.iterator();
        while (it.hasNext()) {
            it.next().f(j10);
        }
    }

    public void j0(long j10, boolean z10) {
        i c22 = i.c2();
        c22.F3(S("dismiss_requests_", this.f27566a.A6()) + j10);
        if (!z10) {
            Iterator<b> it = this.X.iterator();
            while (it.hasNext()) {
                it.next().k7(j10);
            }
        }
    }

    public void k() {
        LevelDB n32 = i.c2().n3();
        n32.N(S("notification_data_", this.f27566a.A6()));
        n32.N(S("notification_gdata_", this.f27566a.A6()));
        n32.k();
    }

    public void k0(String str) {
        String S = S("settings_app_config", this.f27566a.A6());
        if (ib.i.i(str)) {
            i.c2().F3(S);
        } else {
            i.c2().z3(S, str);
        }
    }

    public void l(int i10) {
        this.R.k(i10);
        m(this.f27566a.A6(), i10);
    }

    public void l0(int i10) {
        if (i() != i10) {
            this.N = Integer.valueOf(i10);
            i.c2().u3(S("settings_chat_style", this.f27566a.A6()), i10);
            if (i10 == 2) {
                this.f27566a.Ue().g();
            }
            z.u().K(this.f27566a, i10);
        }
    }

    public void m0(boolean z10) {
        this.O = Boolean.valueOf(z10);
        i.c2().s3(S("settings_channel_plain", this.f27566a.A6()), z10);
    }

    public void n(long j10, long j11) {
        i c22 = i.c2();
        c22.w3(S("dismiss_pinned_", this.f27566a.A6()) + j10, j11);
        Iterator<a> it = this.W.iterator();
        while (it.hasNext()) {
            it.next().b(j10, j11);
        }
    }

    public void n0(int i10) {
        int M = M();
        if (M != i10) {
            int A6 = this.f27566a.A6();
            LevelDB W = i.c2().W();
            if (j.y0(i10)) {
                String S = S("settings_global_theme_night", A6);
                Integer valueOf = Integer.valueOf(i10);
                this.M = valueOf;
                W.putInt(S, z.b0(valueOf.intValue()));
            } else if (j.y0(M)) {
                String S2 = S("settings_global_theme_night", A6);
                Integer valueOf2 = Integer.valueOf(M);
                this.M = valueOf2;
                W.putInt(S2, z.b0(valueOf2.intValue()));
            }
            if (!j.y0(i10)) {
                String S3 = S("settings_global_theme_daylight", A6);
                Integer valueOf3 = Integer.valueOf(i10);
                this.f27568c = valueOf3;
                W.putInt(S3, z.b0(valueOf3.intValue()));
            } else if (!j.y0(M)) {
                String S4 = S("settings_global_theme_daylight", A6);
                Integer valueOf4 = Integer.valueOf(M);
                this.f27568c = valueOf4;
                W.putInt(S4, z.b0(valueOf4.intValue()));
            }
            String S5 = S("settings_global_theme", A6);
            Integer valueOf5 = Integer.valueOf(i10);
            this.f27567b = valueOf5;
            W.putInt(S5, z.b0(valueOf5.intValue()));
            W.apply();
            this.f27566a.Ue().u(M, i10);
        }
    }

    public void o(long j10, TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        i c22 = i.c2();
        c22.x3(S("dismiss_requests_", this.f27566a.A6()) + j10, chatJoinRequestsInfo.userIds);
        Iterator<b> it = this.X.iterator();
        while (it.hasNext()) {
            it.next().I4(j10);
        }
    }

    public void o0(int i10, int i11) {
        String S = S("notification_data_" + i10, this.f27566a.A6());
        if (i11 != 0) {
            i.c2().u3(S, i11);
        } else {
            i.c2().F3(S);
        }
    }

    public void p0(int i10, int i11, int i12) {
        String S = S("notification_gdata_" + i10, this.f27566a.A6());
        if (i11 == 0 && i12 == 0) {
            i.c2().F3(S);
            return;
        }
        i.c2().w3(S, ib.c.f(i11, i12));
    }

    public void q(int i10, boolean z10, int i11) {
        LevelDB levelDB;
        int A6 = this.f27566a.A6();
        if (z10 && K() == i10) {
            if (i11 == 0 || j.y0(i11)) {
                i11 = 11;
            }
            levelDB = i.c2().W();
            String S = S("settings_global_theme_daylight", A6);
            Integer valueOf = Integer.valueOf(i11);
            this.f27568c = valueOf;
            levelDB.putInt(S, z.b0(valueOf.intValue()));
            String S2 = S("settings_global_theme_night", A6);
            Integer valueOf2 = Integer.valueOf(i10);
            this.M = valueOf2;
            levelDB.putInt(S2, z.b0(valueOf2.intValue()));
        } else if (z10 || L() != i10) {
            levelDB = null;
        } else {
            if (i11 == 0 || !j.y0(i11)) {
                i11 = 10;
            }
            levelDB = i.c2().W();
            String S3 = S("settings_global_theme_night", A6);
            Integer valueOf3 = Integer.valueOf(i11);
            this.M = valueOf3;
            levelDB.putInt(S3, z.b0(valueOf3.intValue()));
            String S4 = S("settings_global_theme_daylight", A6);
            Integer valueOf4 = Integer.valueOf(i10);
            this.f27568c = valueOf4;
            levelDB.putInt(S4, z.b0(valueOf4.intValue()));
        }
        if (levelDB != null) {
            levelDB.apply();
        }
    }

    public boolean r() {
        if (this.O == null) {
            this.O = Boolean.valueOf(i.c2().o0(S("settings_channel_plain", this.f27566a.A6()), true));
        }
        return this.O.booleanValue();
    }

    public boolean r0(long j10, boolean z10) {
        long H = H();
        long i10 = ib.c.i(H, j10, z10);
        if (H == i10) {
            return false;
        }
        i c22 = i.c2();
        String S = S("settings_user_preferences", this.f27566a.A6());
        Long valueOf = Long.valueOf(i10);
        this.Q = valueOf;
        c22.w3(S, valueOf.longValue());
        Y(j10, z10);
        return true;
    }

    public void s(String str, String str2) {
        i.c2().F3(U(this.f27566a.A6(), str, str2));
    }

    public void s0(ae.h hVar, boolean z10, int i10) {
        ae.h I = I(i10);
        if ((I == null && hVar != null) || (z10 && !ae.h.h(I, hVar, false))) {
            z.u().L(this.f27566a, hVar, 0L, i10);
            if (hVar != null) {
                hVar.p0(i10);
                hVar.c0(this.f27566a);
            } else {
                LevelDB W = i.c2().W();
                i.c2().O(this.f27566a, W, i10);
                W.apply();
            }
            this.R.j(i10, hVar);
        }
    }

    public void t() {
        if (z() > 0) {
            this.P = 0;
            i.c2().H3(S("notification_error", this.f27566a.A6()), null);
            lb.d<d> dVar = this.Z;
            if (dVar != null) {
                Iterator<d> it = dVar.iterator();
                while (it.hasNext()) {
                    it.next().N2(this.f27566a, false);
                }
            }
        }
    }

    public void t0() {
        int i10 = 2;
        if (i() == 2) {
            i10 = 1;
        }
        l0(i10);
    }

    public String u() {
        return i.c2().L1(S("settings_app_config", this.f27566a.A6()), null);
    }

    public void u0(long j10) {
        r0(j10, !G(j10));
    }

    public long v() {
        if (z() == 0) {
            return 0L;
        }
        String S = S("notification_error_", this.f27566a.A6());
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        for (LevelDB.a aVar : i.c2().n3().g(S)) {
            String l10 = aVar.l();
            int indexOf = l10.indexOf(95, S.length());
            if (indexOf != -1) {
                long w10 = ib.i.w(l10.substring(S.length(), indexOf));
                String substring = l10.substring(indexOf + 1);
                substring.hashCode();
                if (substring.equals("chat")) {
                    long i10 = aVar.i();
                    if (w10 == j12) {
                        j10 = i10;
                        j14 = j10;
                    } else {
                        j14 = i10;
                    }
                    j13 = w10;
                } else if (substring.equals("time")) {
                    long i11 = aVar.i();
                    if (i11 > j11) {
                        j10 = j13 == w10 ? j14 : 0L;
                        j11 = i11;
                        j12 = w10;
                    }
                }
            }
        }
        return j10;
    }

    public synchronized void v0(Throwable th, boolean z10, long j10) {
        lb.d<d> dVar;
        int z11 = z() + 1;
        boolean z12 = z11 == 1;
        int i10 = z10 ? 1 : 0;
        nb.a aVar = new nb.a(Log.blobSize(th) + 1);
        aVar.B((byte) i10);
        Log.toBlob(th, aVar);
        byte[] y10 = aVar.y();
        String S = S("notification_error", this.f27566a.A6());
        String i11 = i.c2().n3().i(S, y10);
        LevelDB W = i.c2().W();
        if (z12) {
            W.putInt(S("notification_version", this.f27566a.A6()), 1519020);
        }
        W.putInt(S, z11);
        if (i11 == null || !i11.endsWith("_data")) {
            String str = S + "_" + z11 + "_data";
            String str2 = S + "_" + z11 + "_time";
            String str3 = S + "_" + z11 + "_chat";
            W.D(str, y10);
            if (j10 != 0) {
                W.putLong(str3, j10);
            } else {
                W.remove(str3);
            }
            W.putLong(str2, System.currentTimeMillis());
        } else {
            String substring = i11.substring(0, i11.length() - 4);
            String str4 = substring + "count";
            String str5 = substring + "time";
            String str6 = substring + "chat";
            W.putInt(str4, W.getInt(str4, 1) + 1);
            if (j10 != 0) {
                W.putLong(str6, j10);
            } else {
                W.remove(str6);
            }
            W.putLong(str5, System.currentTimeMillis());
        }
        W.apply();
        this.P = Integer.valueOf(z11);
        if (z12 && (dVar = this.Z) != null) {
            Iterator<d> it = dVar.iterator();
            while (it.hasNext()) {
                it.next().N2(this.f27566a, true);
            }
        }
    }

    public long w(long j10) {
        long d10;
        synchronized (this.S) {
            d10 = this.U.d(j10);
            if (d10 == 0) {
                String str = S("local_chat_id_", this.f27566a.A6()) + j10;
                long e12 = i.c2().e1(str, 0L);
                if (e12 == 0) {
                    long X = X();
                    i.c2().w3(str, X);
                    i.c2().w3(S("remote_chat_id_", this.f27566a.A6()) + X, j10);
                    d10 = X;
                } else {
                    d10 = e12;
                }
                this.U.g(j10, d10);
                this.V.g(d10, j10);
            }
        }
        return d10;
    }

    public int x(int i10) {
        return i.c2().V0(S("notification_data_" + i10, this.f27566a.A6()), 0);
    }

    public boolean x0() {
        return i() == 2;
    }

    public long y(int i10) {
        return i.c2().e1(S("notification_gdata_" + i10, this.f27566a.A6()), 0L);
    }

    public int z() {
        if (this.P == null) {
            if (i.c2().V0(S("notification_version", this.f27566a.A6()), 1519020) != 1519020) {
                LevelDB W = i.c2().W();
                W.N(S("notification_error", this.f27566a.A6()));
                W.remove(S("notification_version", this.f27566a.A6()));
                W.apply();
            }
            this.P = Integer.valueOf(i.c2().V0(S("notification_error", this.f27566a.A6()), 0));
        }
        return this.P.intValue();
    }
}
