package zd;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import ce.c0;
import ce.j0;
import gd.w;
import hd.b;
import hd.t2;
import ie.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kb.j;
import lb.h;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.voip.gui.CallSettings;
import zd.d1;

public class t7 implements d1.c, j0, j0.a {
    public final h.a<Long, j> O;
    public final lb.f<j> P;
    public final o6 f28446a;
    public volatile long f28448b;
    public boolean f28459k0;
    public TdApi.HttpUrl f28466r0;
    public boolean f28467s0;
    public boolean f28468t0;
    public boolean f28469u0;
    public boolean f28471w0;
    public final HashMap<Long, TdApi.User> f28450c = new HashMap<>();
    public final HashMap<Long, TdApi.UserFullInfo> M = new HashMap<>();
    public final lb.f<i> N = new lb.f<>(true);
    public final lb.f<j> Q = new lb.f<>(true, null);
    public final lb.d<e> R = new lb.d<>(true);
    public final HashMap<Long, TdApi.BasicGroup> S = new HashMap<>();
    public final HashMap<Long, TdApi.BasicGroupFullInfo> T = new HashMap<>();
    public final lb.d<b> U = new lb.d<>(true);
    public final lb.f<b> V = new lb.f<>(true);
    public final HashMap<Long, TdApi.Supergroup> W = new HashMap<>();
    public final HashMap<Long, TdApi.SupergroupFullInfo> X = new HashMap<>();
    public final lb.d<h> Y = new lb.d<>();
    public final lb.f<h> Z = new lb.f<>();
    public final HashMap<Integer, TdApi.SecretChat> f28447a0 = new HashMap<>();
    public final lb.d<g> f28449b0 = new lb.d<>();
    public final lb.c<g> f28451c0 = new lb.c<>();
    public final k0.h<TdApi.Call> f28452d0 = new k0.h<>();
    public final k0.h<CallSettings> f28453e0 = new k0.h<>();
    public final lb.d<c> f28454f0 = new lb.d<>();
    public final lb.c<c> f28455g0 = new lb.c<>();
    public final lb.d<d> f28456h0 = new lb.d<>(true);
    public final lb.f<d> f28457i0 = new lb.f<>(true);
    public final ArrayList<TdApi.Message> f28458j0 = new ArrayList<>();
    public final jb.g f28462n0 = new jb.g();
    public final Client.g f28464p0 = new Client.g() {
        @Override
        public final void r2(TdApi.Object object) {
            t7.this.v0(object);
        }
    };
    public final Object f28465q0 = new Object();
    public final Object f28470v0 = new Object();
    public final Client.g f28460l0 = new Client.g() {
        @Override
        public final void r2(TdApi.Object object) {
            t7.this.w0(object);
        }
    };
    public final Client.g f28461m0 = k7.f27854a;
    public final Handler f28463o0 = new f(this);

    public class a extends kb.b {
        public final kb.j M;

        public a(kb.j jVar) {
            this.M = jVar;
        }

        @Override
        public void b() {
            kb.j jVar = this.M;
            if (jVar != null) {
                jVar.a(new TdApi.HttpUrl("https://telegram.org/dlx"));
            }
            c();
        }
    }

    public interface b {
        void K2(TdApi.BasicGroup basicGroup, boolean z10);

        void V3(long j10, TdApi.BasicGroupFullInfo basicGroupFullInfo);
    }

    public interface c {
        void Q4(int i10, int i11);

        void b7(int i10, CallSettings callSettings);

        void d(TdApi.Call call);

        void x0(int i10, int i11);
    }

    public interface d {
        void s2(long j10, TdApi.ChatMember chatMember);
    }

    public interface e {
        void W0(String str);

        void k2(TdApi.User user);
    }

    public static class f extends Handler {
        public final t7 f28472a;

        public f(t7 t7Var) {
            super(Looper.getMainLooper());
            this.f28472a = t7Var;
        }

        @Override
        public void handleMessage(Message message) {
            long longValue = ((Long) message.obj).longValue();
            this.f28472a.t1(longValue, message.arg1, this.f28472a.u2(longValue));
        }
    }

    public interface g {
        void B0(TdApi.SecretChat secretChat);
    }

    public interface h {
        void f0(long j10, TdApi.SupergroupFullInfo supergroupFullInfo);

        void s0(TdApi.Supergroup supergroup);
    }

    public interface i {
        void M1(TdApi.User user);

        void u7(long j10, TdApi.UserFullInfo userFullInfo);
    }

    public interface j {
        void A3(long j10, TdApi.UserStatus userStatus, boolean z10);

        boolean u3();
    }

    public t7(o6 o6Var) {
        boolean z10 = true;
        h.a<Long, j> s7Var = new h.a() {
            @Override
            public final void a(h hVar, boolean z11) {
                t7.this.u0(hVar, z11);
            }
        };
        this.O = s7Var;
        this.P = new lb.f<>(true, s7Var);
        this.f28468t0 = true;
        this.f28446a = o6Var;
        o6Var.O9().l(this);
        j0.d(this);
        this.f28468t0 = j0.F() == 0 ? false : z10;
    }

    public void A0(long j10, TdApi.Object object) {
        this.f28446a.v4().o(new TdApi.GetSupergroupFullInfo(j10), this.f28461m0);
    }

    public void B0(kb.j jVar, long j10) {
        jVar.a(h2(j10));
    }

    public void D0(final kb.j jVar, final long j10, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
            this.f28446a.hd().post(new Runnable() {
                @Override
                public final void run() {
                    j.this.a(null);
                }
            });
        } else if (constructor == -1035719349) {
            this.f28446a.hd().post(new Runnable() {
                @Override
                public final void run() {
                    t7.this.B0(jVar, j10);
                }
            });
        }
    }

    public void F0(final kb.j jVar, final long j10, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
            this.f28446a.hd().post(new Runnable() {
                @Override
                public final void run() {
                    j.this.a(null);
                }
            });
        } else if (constructor == -1308032111) {
            this.f28446a.hd().post(new Runnable() {
                @Override
                public final void run() {
                    t7.this.H0(jVar, j10);
                }
            });
        }
    }

    public void G0(long j10, TdApi.Object object) {
        this.f28446a.v4().o(new TdApi.GetUserFullInfo(j10), this.f28461m0);
    }

    public void H0(kb.j jVar, long j10) {
        jVar.a(D2(j10));
    }

    public static void K0(Iterator<c> it, int i10, int i11, boolean z10) {
        if (it == null) {
            return;
        }
        if (z10) {
            while (it.hasNext()) {
                it.next().Q4(i10, i11);
            }
            return;
        }
        while (it.hasNext()) {
            it.next().x0(i10, i11);
        }
    }

    public static void L0(Iterator<c> it, int i10, CallSettings callSettings) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().b7(i10, callSettings);
            }
        }
    }

    public static void M0(Iterator<b> it, long j10, TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().V3(j10, basicGroupFullInfo);
            }
        }
    }

    public static void N0(Iterator<h> it, long j10, TdApi.SupergroupFullInfo supergroupFullInfo) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().f0(j10, supergroupFullInfo);
            }
        }
    }

    public static void O0(Iterator<i> it, long j10, TdApi.UserFullInfo userFullInfo) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().u7(j10, userFullInfo);
            }
        }
    }

    public static void P0(Iterator<b> it, TdApi.BasicGroup basicGroup, boolean z10) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().K2(basicGroup, z10);
            }
        }
    }

    public static void Q0(Iterator<c> it, TdApi.Call call) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().d(call);
            }
        }
    }

    public static void R0(Iterator<g> it, TdApi.SecretChat secretChat) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().B0(secretChat);
            }
        }
    }

    public static void S0(Iterator<h> it, TdApi.Supergroup supergroup) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().s0(supergroup);
            }
        }
    }

    public static void T0(Iterator<i> it, TdApi.User user) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().M1(user);
            }
        }
    }

    public static void U0(Iterator<e> it, String str) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().W0(str);
            }
        }
    }

    public static void V0(Iterator<e> it, TdApi.User user) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().k2(user);
            }
        }
    }

    public static void a1(Iterator<j> it, long j10, TdApi.UserStatus userStatus, boolean z10) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().A3(j10, userStatus, z10);
            }
        }
    }

    public void n0(kb.j jVar, long j10) {
        jVar.a(O(j10));
    }

    public void p0(final kb.j jVar, final long j10, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
            this.f28446a.hd().post(new Runnable() {
                @Override
                public final void run() {
                    j.this.a(null);
                }
            });
        } else if (constructor == 2022233397) {
            this.f28446a.hd().post(new Runnable() {
                @Override
                public final void run() {
                    t7.this.n0(jVar, j10);
                }
            });
        }
    }

    public void q0(long j10, TdApi.Object object) {
        this.f28446a.v4().o(new TdApi.GetBasicGroupFullInfo(j10), this.f28461m0);
    }

    public void r0(TdApi.HttpUrl httpUrl, kb.j jVar, kb.b bVar) {
        this.f28466r0 = httpUrl;
        if (jVar != null && bVar.d()) {
            jVar.a(httpUrl);
            bVar.c();
        }
    }

    public void s0(final kb.j jVar, final kb.b bVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -2018019930) {
            final TdApi.HttpUrl httpUrl = (TdApi.HttpUrl) object;
            if (c0.Q(httpUrl.url)) {
                this.f28446a.hd().post(new Runnable() {
                    @Override
                    public final void run() {
                        t7.this.r0(httpUrl, jVar, bVar);
                    }
                });
            } else {
                this.f28446a.hd().post(bVar);
            }
        } else if (constructor == -1679978726) {
            this.f28446a.hd().post(bVar);
        }
    }

    public static void t0(kb.j jVar, TdApi.HttpUrl httpUrl) {
        if (jVar != null) {
            jVar.a(new TdApi.Text(w.j1(R.string.InviteText, "Telegram X", httpUrl.url)));
        }
    }

    public void u0(lb.h hVar, boolean z10) {
        V1(z10);
    }

    public void v0(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.i("Unable to load active live locations: %s", t2.z5(object));
        } else if (constructor == -16498159) {
            O1(((TdApi.Messages) object).messages);
        }
    }

    public void w0(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor != -537797015) {
            Log.unexpectedTdlibResponse(object, TdApi.GetMe.class, TdApi.User.class, TdApi.Error.class);
        } else {
            this.f28459k0 = false;
        }
    }

    public static void x0(TdApi.Object object) {
        switch (object.getConstructor()) {
            case TdApi.Error.CONSTRUCTOR:
                Log.i("dataHandler error: %s", t2.z5(object));
                return;
            case TdApi.UserFullInfo.CONSTRUCTOR:
                TdApi.UserFullInfo userFullInfo = (TdApi.UserFullInfo) object;
                return;
            case TdApi.SupergroupFullInfo.CONSTRUCTOR:
                TdApi.SupergroupFullInfo supergroupFullInfo = (TdApi.SupergroupFullInfo) object;
                return;
            case TdApi.Supergroup.CONSTRUCTOR:
                TdApi.Supergroup supergroup = (TdApi.Supergroup) object;
                return;
            case TdApi.User.CONSTRUCTOR:
                TdApi.User user = (TdApi.User) object;
                return;
            case TdApi.BasicGroup.CONSTRUCTOR:
                TdApi.BasicGroup basicGroup = (TdApi.BasicGroup) object;
                return;
            case TdApi.BasicGroupFullInfo.CONSTRUCTOR:
                TdApi.BasicGroupFullInfo basicGroupFullInfo = (TdApi.BasicGroupFullInfo) object;
                return;
            default:
                Log.unexpectedTdlibResponse(object, TdApi.GetUserFullInfo.class, TdApi.UserFullInfo.class, TdApi.BasicGroupFullInfo.class, TdApi.SupergroupFullInfo.class, TdApi.Error.class, TdApi.User.class);
                return;
        }
    }

    public void y0(TdApi.Message message, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.e("Error broadcasting location: %s", t2.z5(object));
        } else if (constructor == 1435961258) {
            TdApi.Message message2 = (TdApi.Message) object;
            message.editDate = message2.editDate;
            if (message2.content.getConstructor() == 303973492) {
                TdApi.MessageLocation messageLocation = (TdApi.MessageLocation) message2.content;
                TdApi.MessageLocation messageLocation2 = (TdApi.MessageLocation) message.content;
                messageLocation2.expiresIn = messageLocation.livePeriod;
                TdApi.Location location = messageLocation2.location;
                TdApi.Location location2 = messageLocation.location;
                location.latitude = location2.latitude;
                location.longitude = location2.longitude;
                e1(message);
            }
        }
    }

    public void z0(TdApi.UpdateUserFullInfo updateUserFullInfo) {
        U0(this.R.iterator(), updateUserFullInfo.userFullInfo.bio);
    }

    public final void A(j jVar) {
        if (jVar.u3()) {
            this.P.g(0L, jVar);
        } else {
            this.Q.g(0L, jVar);
        }
    }

    public final boolean A1(long j10, TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        this.T.put(Long.valueOf(j10), basicGroupFullInfo);
        return true;
    }

    public boolean A2(long j10) {
        return j10 != 0 && t2.I3(u2(j10));
    }

    public final void B(i iVar) {
        this.N.g(0L, iVar);
    }

    public final void B1(long j10, b bVar) {
        this.V.b(Long.valueOf(j10), bVar);
    }

    public String B2(long j10, boolean z10, boolean z11) {
        if (z10 && this.f28446a.o7(j10)) {
            return w.i1(R.string.SavedMessages);
        }
        TdApi.User u22 = u2(j10);
        if (t2.I3(u22)) {
            return w.i1(R.string.HiddenName);
        }
        if (this.f28446a.i7(ob.a.c(j10))) {
            return w.i1(R.string.RepliesBot);
        }
        if (z11) {
            return t2.s2(j10, u22);
        }
        return t2.p2(j10, u22);
    }

    public final void C(long j10, i iVar) {
        if (j10 != 0) {
            this.N.g(Long.valueOf(j10), iVar);
            return;
        }
        throw new IllegalArgumentException("userId == " + j10);
    }

    public final boolean C1(TdApi.SecretChat secretChat) {
        boolean z10 = this.f28447a0.get(Integer.valueOf(secretChat.f19960id)) != null;
        this.f28447a0.put(Integer.valueOf(secretChat.f19960id), secretChat);
        return z10;
    }

    public String C2(long j10) {
        return j10 != 0 ? t2.s2(j10, u2(j10)) : "VOID";
    }

    public final void D(j jVar) {
        if (jVar.u3()) {
            this.P.b(0L, jVar);
        } else {
            this.Q.b(0L, jVar);
        }
    }

    public final void D1(int i10, g gVar) {
        this.f28451c0.b(Integer.valueOf(i10), gVar);
    }

    public TdApi.UserFullInfo D2(long j10) {
        return E2(j10, true);
    }

    public final void E(i iVar) {
        this.N.b(0L, iVar);
    }

    public final int E1(org.drinkless.td.libcore.telegram.TdApi.Supergroup r6) {
        throw new UnsupportedOperationException("Method not decompiled: zd.t7.E1(org.drinkless.td.libcore.telegram.TdApi$Supergroup):int");
    }

    public TdApi.UserFullInfo E2(final long j10, boolean z10) {
        TdApi.UserFullInfo userFullInfo;
        synchronized (this.f28465q0) {
            Long valueOf = Long.valueOf(j10);
            userFullInfo = this.M.get(valueOf);
            if (userFullInfo == null || z10) {
                if (this.f28450c.get(valueOf) != null) {
                    this.f28446a.v4().o(new TdApi.GetUserFullInfo(j10), this.f28461m0);
                } else {
                    this.f28446a.v4().o(new TdApi.GetUser(j10), new Client.g() {
                        @Override
                        public final void r2(TdApi.Object object) {
                            t7.this.G0(j10, object);
                        }
                    });
                }
            }
        }
        return userFullInfo;
    }

    public final void F(long j10, i iVar) {
        if (j10 != 0) {
            this.N.b(Long.valueOf(j10), iVar);
            return;
        }
        throw new IllegalArgumentException("userId == " + j10);
    }

    public final boolean F1(long j10, TdApi.SupergroupFullInfo supergroupFullInfo) {
        this.X.put(Long.valueOf(j10), supergroupFullInfo);
        return true;
    }

    public void F2(final long j10, final kb.j<TdApi.UserFullInfo> jVar) {
        if (j10 != 0) {
            TdApi.UserFullInfo D2 = D2(j10);
            if (jVar != null) {
                if (D2 != null) {
                    jVar.a(D2);
                } else {
                    this.f28446a.v4().o(new TdApi.GetUserFullInfo(j10), new Client.g() {
                        @Override
                        public final void r2(TdApi.Object object) {
                            t7.this.F0(jVar, j10, object);
                        }
                    });
                }
            }
        } else if (jVar != null) {
            jVar.a(null);
        }
    }

    public void G(long j10, d dVar) {
        this.f28457i0.b(Long.valueOf(j10), dVar);
    }

    public final void G1(long j10, h hVar) {
        this.Z.b(Long.valueOf(j10), hVar);
    }

    public boolean G2(long j10) {
        return j10 != 0 && t2.a3(u2(j10));
    }

    public void H(d dVar) {
        this.f28456h0.add(dVar);
    }

    @Override
    public void H1(TdApi.Location location, int i10) {
        synchronized (this.f28458j0) {
            Log.v("Updating %d live location messages", Integer.valueOf(this.f28458j0.size()));
            Iterator<TdApi.Message> it = this.f28458j0.iterator();
            while (it.hasNext()) {
                final TdApi.Message next = it.next();
                this.f28446a.v4().o(new TdApi.EditMessageLiveLocation(next.chatId, next.f19946id, next.replyMarkup, location, i10, 0), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        t7.this.y0(next, object);
                    }
                });
            }
        }
    }

    public boolean H2(long j10) {
        boolean z10 = false;
        if (j10 == 0) {
            return false;
        }
        synchronized (this.f28465q0) {
            TdApi.User user = this.f28450c.get(Long.valueOf(j10));
            TdApi.UserStatus userStatus = user != null ? user.status : null;
            if (!(userStatus == null || userStatus.getConstructor() != -759984891 || ((TdApi.UserStatusOffline) userStatus).wasOnline == 0)) {
                z10 = true;
            }
        }
        return z10;
    }

    public <T extends i & j> void I(T t10) {
        E(t10);
        D(t10);
    }

    @Deprecated
    public TdApi.User I0() {
        TdApi.User user;
        synchronized (this.f28465q0) {
            user = this.f28448b != 0 ? this.f28450c.get(Long.valueOf(this.f28448b)) : null;
        }
        return user;
    }

    public final boolean I1(long j10, TdApi.UserFullInfo userFullInfo) {
        this.M.put(Long.valueOf(j10), userFullInfo);
        return true;
    }

    public je.e I2(TdApi.User user) {
        return t2.E1(user);
    }

    public void J(e eVar) {
        this.R.add(eVar);
    }

    @Deprecated
    public long J0() {
        return this.f28448b;
    }

    public void J1(long j10, d dVar) {
        this.f28457i0.g(Long.valueOf(j10), dVar);
    }

    public String J2(long j10) {
        return j10 != 0 ? t2.p2(j10, u2(j10)) : "VOID";
    }

    public void K(TdApi.Message message) {
        if (message.sendingState == null && message.canBeEdited && message.isOutgoing && message.content.getConstructor() == 303973492) {
            TdApi.MessageLocation messageLocation = (TdApi.MessageLocation) message.content;
            if (messageLocation.livePeriod != 0 && messageLocation.expiresIn != 0) {
                synchronized (this.f28458j0) {
                    this.f28458j0.add(message);
                    W0(1);
                    this.f28446a.gb(message);
                }
            }
        }
    }

    public void K1(d dVar) {
        this.f28456h0.remove(dVar);
    }

    public hd.b K2(long j10, TdApi.User user, boolean z10, float f10, t tVar) {
        return new hd.b(f10, N2(j10, user, z10), tVar);
    }

    public void L(long j10, i iVar) {
        F(j10, iVar);
    }

    public <T extends i & j> void L1(T t10) {
        B(t10);
        A(t10);
    }

    public hd.b L2(long j10, boolean z10, float f10, t tVar) {
        return K2(j10, u2(j10), z10, f10, tVar);
    }

    public TdApi.BasicGroup M(long j10) {
        TdApi.BasicGroup basicGroup;
        synchronized (this.f28465q0) {
            basicGroup = this.S.get(Long.valueOf(j10));
        }
        return basicGroup;
    }

    public void M1(e eVar) {
        this.R.remove(eVar);
    }

    public hd.b M2(TdApi.User user, boolean z10, float f10, t tVar) {
        return K2(user != null ? user.f19979id : 0L, user, z10, f10, tVar);
    }

    public boolean N(long j10) {
        TdApi.BasicGroup M = M(j10);
        return M != null && M.isActive;
    }

    public void N1(long j10, i iVar) {
        C(j10, iVar);
    }

    public b.a N2(long j10, TdApi.User user, boolean z10) {
        if (user != null || j10 == 0) {
            return O2(user, z10);
        }
        return new b.a(t2.H0(j10, this.f28446a.fa()));
    }

    public TdApi.BasicGroupFullInfo O(long j10) {
        return P(j10, true);
    }

    public final void O1(TdApi.Message[] messageArr) {
        synchronized (this.f28458j0) {
            if (!this.f28458j0.isEmpty() || !(messageArr == null || messageArr.length == 0)) {
                Iterator<TdApi.Message> it = this.f28458j0.iterator();
                while (it.hasNext()) {
                    this.f28446a.S2(it.next());
                }
                int size = this.f28458j0.size();
                this.f28458j0.clear();
                if (messageArr != null) {
                    Collections.addAll(this.f28458j0, messageArr);
                    W0(messageArr.length - size);
                    Iterator<TdApi.Message> it2 = this.f28458j0.iterator();
                    while (it2.hasNext()) {
                        this.f28446a.gb(it2.next());
                    }
                } else {
                    W0(-size);
                }
            }
        }
    }

    public b.a O2(TdApi.User user, boolean z10) {
        int i10;
        int i11;
        int i12;
        je.e eVar;
        int i13;
        int i14;
        int i15;
        String str = null;
        if (user == null) {
            return null;
        }
        if (!z10 || !this.f28446a.o7(user.f19979id)) {
            if (this.f28446a.i7(ob.a.c(user.f19979id))) {
                i13 = R.id.theme_color_avatarReplies;
                eVar = null;
                i14 = R.drawable.baseline_reply_24;
            } else {
                eVar = I2(user);
                i13 = x2(user);
                i14 = 0;
            }
            if (this.f28446a.o7(user.f19979id)) {
                i15 = R.drawable.ic_add_a_photo_black_56;
            } else if (this.f28446a.i7(ob.a.c(user.f19979id))) {
                i15 = R.drawable.baseline_reply_56;
            } else {
                i15 = t2.K2(user) ? R.drawable.deproko_baseline_bots_56 : R.drawable.baseline_person_56;
            }
            i10 = i14;
            i12 = i15;
            i11 = i13;
        } else {
            i11 = R.id.theme_color_avatarSavedMessages;
            i10 = R.drawable.baseline_bookmark_24;
            eVar = null;
            i12 = 0;
        }
        if (eVar != null) {
            str = eVar.f15363a;
        }
        return new b.a(i11, str, i10, i12);
    }

    public TdApi.BasicGroupFullInfo P(long j10, boolean z10) {
        TdApi.BasicGroupFullInfo R;
        synchronized (this.f28465q0) {
            R = R(j10, z10);
        }
        return R;
    }

    public TdApi.User P1(String str) {
        TdApi.User user;
        synchronized (this.f28465q0) {
            Iterator<Map.Entry<Long, TdApi.User>> it = this.f28450c.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    user = null;
                    break;
                }
                user = it.next().getValue();
                String str2 = user.username;
                if (str2 != null && str2.length() == str.length() && user.username.toLowerCase().equals(str)) {
                    break;
                }
            }
        }
        return user;
    }

    public TdApi.User P2(long j10) {
        TdApi.User user;
        if (j10 != 0) {
            synchronized (this.f28465q0) {
                user = this.f28450c.get(Long.valueOf(j10));
                if (user == null) {
                    throw new IllegalStateException("id" + j10);
                }
            }
            return user;
        }
        throw new IllegalArgumentException();
    }

    public void Q(final long j10, final kb.j<TdApi.BasicGroupFullInfo> jVar) {
        if (j10 != 0) {
            TdApi.BasicGroupFullInfo O = O(j10);
            if (jVar != null) {
                if (O != null) {
                    jVar.a(O);
                } else {
                    this.f28446a.v4().o(new TdApi.GetBasicGroupFullInfo(j10), new Client.g() {
                        @Override
                        public final void r2(TdApi.Object object) {
                            t7.this.p0(jVar, j10, object);
                        }
                    });
                }
            }
        } else if (jVar != null) {
            jVar.a(null);
        }
    }

    public TdApi.SecretChat Q1(int i10) {
        TdApi.SecretChat secretChat;
        synchronized (this.f28465q0) {
            secretChat = this.f28447a0.get(Integer.valueOf(i10));
        }
        return secretChat;
    }

    public String Q2(long j10) {
        TdApi.User u22;
        if (j10 == 0 || (u22 = u2(j10)) == null || ib.i.i(u22.username)) {
            return null;
        }
        return u22.username;
    }

    public final TdApi.BasicGroupFullInfo R(final long j10, boolean z10) {
        Long valueOf = Long.valueOf(j10);
        TdApi.BasicGroupFullInfo basicGroupFullInfo = this.T.get(valueOf);
        if (basicGroupFullInfo == null || z10) {
            if (this.S.get(valueOf) != null) {
                this.f28446a.v4().o(new TdApi.GetBasicGroupFullInfo(j10), this.f28461m0);
            } else {
                this.f28446a.v4().o(new TdApi.GetBasicGroup(j10), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        t7.this.q0(j10, object);
                    }
                });
            }
        }
        return basicGroupFullInfo;
    }

    public TdApi.SecretChat R1(int i10) {
        TdApi.SecretChat secretChat;
        if (i10 != 0) {
            synchronized (this.f28465q0) {
                secretChat = this.f28447a0.get(Integer.valueOf(i10));
                if (secretChat == null) {
                    throw new IllegalStateException("id:" + i10);
                }
            }
            return secretChat;
        }
        throw new IllegalArgumentException();
    }

    @Override
    public void R2(ArrayList<o6> arrayList, ArrayList<ArrayList<TdApi.Message>> arrayList2) {
        synchronized (this.f28458j0) {
            if (!this.f28458j0.isEmpty()) {
                arrayList.add(this.f28446a);
                arrayList2.add(new ArrayList<>(this.f28458j0));
            }
        }
    }

    public TdApi.BasicGroup S(long j10) {
        TdApi.BasicGroup basicGroup;
        if (j10 != 0) {
            synchronized (this.f28465q0) {
                basicGroup = this.S.get(Long.valueOf(j10));
                if (basicGroup == null) {
                    throw new IllegalStateException("id:" + j10);
                }
            }
            return basicGroup;
        }
        throw new IllegalArgumentException();
    }

    public b.a S1() {
        return new b.a((int) R.id.theme_color_avatarSavedMessages, (String) null, (int) R.drawable.baseline_bookmark_24, 0);
    }

    public int S2(long[] jArr, ArrayList<TdApi.User> arrayList) {
        int i10;
        synchronized (this.f28465q0) {
            i10 = 0;
            for (long j10 : jArr) {
                if (j10 != 0) {
                    TdApi.User user = this.f28450c.get(Long.valueOf(j10));
                    if (user != null) {
                        arrayList.add(user);
                        i10++;
                    } else {
                        Log.bug("updateUser missing for userId:%d", Long.valueOf(j10));
                    }
                }
            }
        }
        return i10;
    }

    public final void T() {
        boolean z10 = this.f28467s0 && !this.f28468t0;
        if (this.f28469u0 != z10) {
            this.f28469u0 = z10;
            Log.i("accountId:%d refreshActive -> %b, size:%d", Integer.valueOf(this.f28446a.A6()), Boolean.valueOf(z10), Integer.valueOf(this.f28462n0.i()));
            if (!z10) {
                this.f28463o0.removeCallbacksAndMessages(null);
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            for (int i10 = this.f28462n0.i() - 1; i10 >= 0; i10--) {
                long f10 = this.f28462n0.f(i10);
                this.f28462n0.j(i10);
                TdApi.User user = this.f28450c.get(Long.valueOf(f10));
                if (user != null) {
                    U(user, user.status, true);
                }
            }
            Log.i("%d iterations in %dms", Integer.valueOf(this.f28462n0.i()), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    public boolean T1(TdApi.MessageSender messageSender) {
        return messageSender != null && messageSender.getConstructor() == -336109341 && y2(((TdApi.MessageSenderUser) messageSender).userId);
    }

    public ArrayList<TdApi.User> T2(long[] jArr) {
        ArrayList<TdApi.User> arrayList = new ArrayList<>(jArr.length);
        S2(jArr, arrayList);
        return arrayList;
    }

    public final void U(TdApi.User user, TdApi.UserStatus userStatus, boolean z10) {
        if (userStatus.getConstructor() == -759984891) {
            int i10 = ((TdApi.UserStatusOffline) userStatus).wasOnline;
            int d10 = this.f28462n0.d(user.f19979id);
            if (d10 != i10 || z10) {
                if (d10 != 0) {
                    this.f28463o0.removeMessages(0, Long.valueOf(user.f19979id));
                    this.f28462n0.c(user.f19979id);
                }
                long L0 = w.L0(i10, TimeUnit.SECONDS, this.f28446a.H4(), TimeUnit.MILLISECONDS, true, 60);
                if (L0 != -1) {
                    this.f28462n0.g(user.f19979id, i10);
                    if (this.f28469u0) {
                        Message obtain = Message.obtain(this.f28463o0, 0, i10, 0, Long.valueOf(user.f19979id));
                        if (z10) {
                            this.f28463o0.sendMessage(obtain);
                        } else {
                            this.f28463o0.sendMessageDelayed(obtain, L0);
                        }
                    }
                }
            }
        } else if (this.f28462n0.d(user.f19979id) != 0) {
            this.f28463o0.removeMessages(0, Long.valueOf(user.f19979id));
            this.f28462n0.c(user.f19979id);
        }
    }

    public final void U1(boolean z10) {
        synchronized (this.f28470v0) {
            if (this.f28468t0 != z10) {
                this.f28468t0 = z10;
                Log.i("accountId:%d refreshUiPaused -> %b", Integer.valueOf(this.f28446a.A6()), Boolean.valueOf(this.f28468t0));
                T();
            }
        }
    }

    public void V() {
        this.f28450c.clear();
        this.M.clear();
        this.S.clear();
        this.T.clear();
        this.W.clear();
        this.X.clear();
        this.f28447a0.clear();
        this.f28452d0.b();
        this.f28453e0.b();
        O1(null);
        this.f28448b = 0L;
        this.f28466r0 = null;
    }

    public final void V1(boolean z10) {
        synchronized (this.f28470v0) {
            if (this.f28467s0 != z10) {
                this.f28467s0 = z10;
                Log.i("accountId:%d refreshNeeded -> %b", Integer.valueOf(this.f28446a.A6()), Boolean.valueOf(z10));
                T();
            }
        }
    }

    public final void W(b bVar) {
        this.U.remove(bVar);
    }

    public final void W0(int i10) {
        boolean z10 = !this.f28458j0.isEmpty();
        if (this.f28471w0 != z10) {
            if (z10) {
                this.f28446a.F4().W1().c(this);
            } else {
                this.f28446a.F4().W1().q(this);
            }
            this.f28471w0 = z10;
        }
        this.f28446a.F4().W1().n(this.f28446a, this.f28458j0.isEmpty() ? null : new ArrayList<>(this.f28458j0));
        this.f28446a.V2(i10);
    }

    public void W1(long j10) {
        synchronized (this.f28458j0) {
            for (int size = this.f28458j0.size() - 1; size >= 0; size--) {
                TdApi.Message message = this.f28458j0.get(size);
                if (j10 == 0 || message.chatId == j10) {
                    this.f28446a.v4().o(new TdApi.EditMessageLiveLocation(message.chatId, message.f19946id, null, null, 0, 0), this.f28446a.yc());
                }
            }
        }
    }

    public final void X(c cVar) {
        this.f28454f0.remove(cVar);
    }

    public final void X0(long j10, TdApi.UserFullInfo userFullInfo) {
        O0(this.N.d(0L), j10, userFullInfo);
        O0(this.N.d(Long.valueOf(j10)), j10, userFullInfo);
    }

    public void X1(Object obj) {
        if (obj instanceof i) {
            E((i) obj);
        }
        if (obj instanceof j) {
            D((j) obj);
        }
        if (obj instanceof b) {
            v1((b) obj);
        }
        if (obj instanceof h) {
            y1((h) obj);
        }
        if (obj instanceof g) {
            x1((g) obj);
        }
        if (obj instanceof c) {
            w1((c) obj);
        }
    }

    public final void Y(g gVar) {
        this.f28449b0.remove(gVar);
    }

    public final void Y0(TdApi.User user) {
        T0(this.N.d(0L), user);
        T0(this.N.d(Long.valueOf(user.f19979id)), user);
    }

    public void Y1(int i10, c cVar) {
        u1(i10, cVar);
    }

    public final void Z(h hVar) {
        this.Y.remove(hVar);
    }

    public final void Z0(long j10, TdApi.UserStatus userStatus, boolean z10) {
        a1(this.P.d(0L), j10, userStatus, z10);
        a1(this.P.d(Long.valueOf(j10)), j10, userStatus, z10);
        a1(this.Q.d(0L), j10, userStatus, z10);
        a1(this.Q.d(Long.valueOf(j10)), j10, userStatus, z10);
    }

    public void Z1(long j10, b bVar) {
        B1(j10, bVar);
    }

    @Override
    public void a() {
        V();
    }

    public void a0(i iVar) {
        B(iVar);
    }

    public void a2(int i10, g gVar) {
        D1(i10, gVar);
    }

    @Override
    public void b(boolean z10) {
        this.f28446a.v4().o(new TdApi.GetActiveLiveLocationMessages(), this.f28464p0);
    }

    public final void b0(long j10, b bVar) {
        this.V.g(Long.valueOf(j10), bVar);
    }

    public void b1(int i10, int i11) {
        K0(this.f28454f0.iterator(), i10, i11, true);
        K0(this.f28455g0.d(Integer.valueOf(i10)), i10, i11, true);
    }

    public void b2(long j10, h hVar) {
        G1(j10, hVar);
    }

    @Override
    public void c() {
        this.f28463o0.removeCallbacksAndMessages(null);
        this.f28446a.v4().o(new TdApi.GetActiveLiveLocationMessages(), this.f28464p0);
    }

    public void c0(long j10, long[] jArr) {
        synchronized (this.f28458j0) {
            if (!this.f28458j0.isEmpty()) {
                int i10 = 0;
                for (int size = this.f28458j0.size() - 1; size >= 0; size--) {
                    TdApi.Message message = this.f28458j0.get(size);
                    if (message.chatId == j10 && ib.b.s(jArr, message.f19946id) != -1) {
                        this.f28446a.S2(message);
                        this.f28458j0.remove(size);
                        i10++;
                    }
                }
                if (i10 > 0) {
                    W0(i10);
                }
            }
        }
    }

    public void c1(int i10, int i11) {
        if (i11 == 3) {
            K0(this.f28454f0.iterator(), i10, i11, false);
            K0(this.f28455g0.d(Integer.valueOf(i10)), i10, i11, false);
        }
    }

    public void c2(long j10, j jVar) {
        if (j10 == 0) {
            throw new IllegalArgumentException("userId == " + j10);
        } else if (jVar.u3()) {
            this.P.b(Long.valueOf(j10), jVar);
        } else {
            this.Q.b(Long.valueOf(j10), jVar);
        }
    }

    public final void d0(int i10, g gVar) {
        this.f28451c0.g(Integer.valueOf(i10), gVar);
    }

    public void d1(long j10, TdApi.ChatMember chatMember) {
        Iterator<d> it = this.f28456h0.iterator();
        while (it.hasNext()) {
            it.next().s2(j10, chatMember);
        }
        Iterator<d> d10 = this.f28457i0.d(Long.valueOf(j10));
        if (d10 != null) {
            while (d10.hasNext()) {
                d10.next().s2(j10, chatMember);
            }
        }
    }

    public <T extends i & j> void d2(long j10, T t10) {
        F(j10, t10);
        c2(j10, t10);
    }

    public final void e0(long j10, h hVar) {
        this.Z.g(Long.valueOf(j10), hVar);
    }

    public final void e1(TdApi.Message message) {
        synchronized (this.f28458j0) {
            if (this.f28458j0.indexOf(message) != -1) {
                this.f28446a.F4().W1().o(this.f28446a, message);
            }
        }
    }

    public <T extends i & j> void e2(long[] jArr, T t10) {
        for (long j10 : jArr) {
            F(j10, t10);
            c2(j10, t10);
        }
    }

    @Override
    public void f(int i10) {
        U1(i10 != 0);
    }

    public TdApi.Message f0(long j10) {
        synchronized (this.f28458j0) {
            Iterator<TdApi.Message> it = this.f28458j0.iterator();
            while (it.hasNext()) {
                TdApi.Message next = it.next();
                if (next.chatId == j10) {
                    return next;
                }
            }
            return null;
        }
    }

    public void f1(TdApi.Message message) {
        synchronized (this.f28458j0) {
            int indexOf = this.f28458j0.indexOf(message);
            if (indexOf != -1) {
                this.f28458j0.remove(indexOf);
                W0(-1);
            }
        }
    }

    public TdApi.Call g0(int i10) {
        TdApi.Call e10;
        synchronized (this.f28465q0) {
            e10 = this.f28452d0.e(i10);
        }
        return e10;
    }

    public void g1(TdApi.UpdateBasicGroup updateBasicGroup) {
        boolean z10;
        boolean z11;
        long j10;
        synchronized (this.f28465q0) {
            TdApi.BasicGroup basicGroup = updateBasicGroup.basicGroup;
            TdApi.BasicGroup basicGroup2 = this.S.get(Long.valueOf(basicGroup.f19904id));
            this.S.put(Long.valueOf(basicGroup.f19904id), basicGroup);
            z10 = true;
            z11 = basicGroup2 != null;
            j10 = (!z11 || basicGroup2.upgradedToSupergroupId != 0) ? 0L : basicGroup.upgradedToSupergroupId;
        }
        if (z11) {
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            P0(this.U.iterator(), updateBasicGroup.basicGroup, i10 != 0);
            Iterator<b> d10 = this.V.d(Long.valueOf(updateBasicGroup.basicGroup.f19904id));
            TdApi.BasicGroup basicGroup3 = updateBasicGroup.basicGroup;
            if (i10 == 0) {
                z10 = false;
            }
            P0(d10, basicGroup3, z10);
        }
    }

    public TdApi.Supergroup g2(long j10) {
        TdApi.Supergroup supergroup;
        synchronized (this.f28465q0) {
            supergroup = this.W.get(Long.valueOf(j10));
        }
        return supergroup;
    }

    public CallSettings h0(int i10) {
        CallSettings e10;
        synchronized (this.f28465q0) {
            e10 = this.f28453e0.e(i10);
        }
        return e10;
    }

    public void h1(TdApi.UpdateBasicGroupFullInfo updateBasicGroupFullInfo) {
        boolean A1;
        synchronized (this.f28465q0) {
            A1 = A1(updateBasicGroupFullInfo.basicGroupId, updateBasicGroupFullInfo.basicGroupFullInfo);
        }
        if (A1) {
            M0(this.U.iterator(), updateBasicGroupFullInfo.basicGroupId, updateBasicGroupFullInfo.basicGroupFullInfo);
            M0(this.V.d(Long.valueOf(updateBasicGroupFullInfo.basicGroupId)), updateBasicGroupFullInfo.basicGroupId, updateBasicGroupFullInfo.basicGroupFullInfo);
        }
    }

    public TdApi.SupergroupFullInfo h2(long j10) {
        return i2(j10, true);
    }

    public void i0(final kb.j<TdApi.HttpUrl> jVar) {
        TdApi.HttpUrl httpUrl = this.f28466r0;
        if (httpUrl == null) {
            final a aVar = new a(jVar);
            this.f28446a.v4().o(new TdApi.GetApplicationDownloadLink(), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    t7.this.s0(jVar, aVar, object);
                }
            });
            if (this.f28446a.F4().g3().k()) {
                j0.e0(aVar, 800L);
            } else {
                aVar.run();
            }
        } else if (jVar != null) {
            jVar.a(httpUrl);
        }
    }

    public void i1(TdApi.UpdateCall updateCall) {
        char c10;
        TdApi.Call call = updateCall.call;
        synchronized (this.f28465q0) {
            c10 = 0;
            boolean z10 = !t2.Z2(this.f28452d0.e(call.f19905id));
            this.f28452d0.j(call.f19905id, call);
            boolean z11 = !t2.Z2(call);
            if (z10 != z11) {
                c10 = z11 ? (char) 1 : (char) 65535;
            }
        }
        Q0(this.f28454f0.iterator(), call);
        Q0(this.f28455g0.d(Integer.valueOf(call.f19905id)), call);
        this.f28446a.F4().b1().m(this.f28446a, call);
        if (c10 == 1) {
            this.f28446a.E6();
        } else if (c10 == 65535) {
            this.f28446a.I4();
        }
    }

    public TdApi.SupergroupFullInfo i2(final long j10, boolean z10) {
        TdApi.SupergroupFullInfo supergroupFullInfo;
        synchronized (this.f28465q0) {
            Long valueOf = Long.valueOf(j10);
            supergroupFullInfo = this.X.get(valueOf);
            if (supergroupFullInfo == null || z10) {
                if (this.W.get(valueOf) != null) {
                    this.f28446a.v4().o(new TdApi.GetSupergroupFullInfo(j10), this.f28461m0);
                } else {
                    this.f28446a.v4().o(new TdApi.GetSupergroup(j10), new Client.g() {
                        @Override
                        public final void r2(TdApi.Object object) {
                            t7.this.A0(j10, object);
                        }
                    });
                }
            }
        }
        return supergroupFullInfo;
    }

    public void j0(final kb.j<TdApi.Text> jVar) {
        i0(new kb.j() {
            @Override
            public final void a(Object obj) {
                t7.t0(j.this, (TdApi.HttpUrl) obj);
            }
        });
    }

    public void j1(int i10, CallSettings callSettings) {
        synchronized (this.f28465q0) {
            this.f28453e0.j(i10, callSettings);
        }
        L0(this.f28454f0.iterator(), i10, callSettings);
        L0(this.f28455g0.d(Integer.valueOf(i10)), i10, callSettings);
        this.f28446a.F4().b1().l(this.f28446a, i10, callSettings);
    }

    public void j2(final long j10, final kb.j<TdApi.SupergroupFullInfo> jVar) {
        if (j10 != 0) {
            TdApi.SupergroupFullInfo h22 = h2(j10);
            if (jVar != null) {
                if (h22 != null) {
                    jVar.a(h22);
                } else {
                    this.f28446a.v4().o(new TdApi.GetSupergroupFullInfo(j10), new Client.g() {
                        @Override
                        public final void r2(TdApi.Object object) {
                            t7.this.D0(jVar, j10, object);
                        }
                    });
                }
            }
        } else if (jVar != null) {
            jVar.a(null);
        }
    }

    public boolean k0() {
        boolean z10;
        synchronized (this.f28458j0) {
            z10 = !this.f28458j0.isEmpty();
        }
        return z10;
    }

    public void k1(String str) {
        if (this.f28448b != 0) {
            U0(this.R.iterator(), str);
        }
    }

    public TdApi.Supergroup k2(long j10) {
        TdApi.Supergroup supergroup;
        if (j10 != 0) {
            synchronized (this.f28465q0) {
                supergroup = this.W.get(Long.valueOf(j10));
                if (supergroup == null) {
                    throw new IllegalStateException("id:" + j10);
                }
            }
            return supergroup;
        }
        throw new IllegalArgumentException();
    }

    public final int l0(long j10, long j11) {
        Iterator<TdApi.Message> it = this.f28458j0.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            TdApi.Message next = it.next();
            if (next.chatId == j10 && next.f19946id == j11) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public void l1(long j10) {
        synchronized (this.f28465q0) {
            if (this.f28448b != j10) {
                this.f28448b = j10;
                int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                TdApi.User user = i10 != 0 ? this.f28450c.get(Long.valueOf(j10)) : null;
                if (i10 == 0) {
                    V0(this.R.iterator(), null);
                    this.f28446a.b5(null);
                } else if (user != null) {
                    V0(this.R.iterator(), user);
                    this.f28446a.b5(user);
                } else if (!this.f28459k0) {
                    this.f28459k0 = true;
                    this.f28446a.v4().o(new TdApi.GetMe(), this.f28460l0);
                }
                if (user != null) {
                    this.f28446a.F4().m2(this.f28446a.A6(), user, true);
                }
            }
        }
    }

    public void l2(Object obj) {
        if (obj instanceof i) {
            B((i) obj);
        }
        if (obj instanceof j) {
            A((j) obj);
        }
        if (obj instanceof b) {
            W((b) obj);
        }
        if (obj instanceof h) {
            Z((h) obj);
        }
        if (obj instanceof g) {
            Y((g) obj);
        }
        if (obj instanceof c) {
            X((c) obj);
        }
    }

    public boolean m0(long j10) {
        if (j10 == 0) {
            return false;
        }
        boolean z10 = true;
        if (j10 == this.f28448b) {
            return true;
        }
        synchronized (this.f28465q0) {
            if (j10 != this.f28448b) {
                z10 = t2.q3(this.f28450c.get(Long.valueOf(j10)));
            }
        }
        return z10;
    }

    public void m1(TdApi.UpdateSecretChat updateSecretChat) {
        boolean C1;
        TdApi.SecretChat secretChat = updateSecretChat.secretChat;
        synchronized (this.f28465q0) {
            C1 = C1(secretChat);
        }
        if (C1) {
            R0(this.f28449b0.iterator(), secretChat);
            R0(this.f28451c0.d(Integer.valueOf(secretChat.f19960id)), secretChat);
        }
    }

    public void m2(int i10, c cVar) {
        u1(i10, cVar);
    }

    public void n1(TdApi.UpdateSupergroup updateSupergroup, TdApi.Chat chat) {
        int E1;
        TdApi.Supergroup supergroup = updateSupergroup.supergroup;
        synchronized (this.f28465q0) {
            E1 = E1(supergroup);
        }
        if (E1 != 0) {
            S0(this.Y.iterator(), supergroup);
            S0(this.Z.d(Long.valueOf(supergroup.f19965id)), supergroup);
        }
        if (Build.VERSION.SDK_INT >= 26 && E1 == 2 && chat != null) {
            cb.v(this.f28446a, this.f28448b, chat);
        }
    }

    public void n2(long j10, b bVar) {
        b0(j10, bVar);
    }

    public void o1(TdApi.UpdateSupergroupFullInfo updateSupergroupFullInfo) {
        boolean F1;
        long j10 = updateSupergroupFullInfo.supergroupId;
        TdApi.SupergroupFullInfo supergroupFullInfo = updateSupergroupFullInfo.supergroupFullInfo;
        synchronized (this.f28465q0) {
            F1 = F1(j10, supergroupFullInfo);
        }
        if (F1) {
            N0(this.Y.iterator(), j10, supergroupFullInfo);
            N0(this.Z.d(Long.valueOf(j10)), j10, supergroupFullInfo);
        }
    }

    public void o2(int i10, g gVar) {
        d0(i10, gVar);
    }

    public void p1(TdApi.UpdateUser updateUser) {
        boolean z10;
        boolean z11;
        TdApi.User user = updateUser.user;
        synchronized (this.f28465q0) {
            TdApi.User user2 = this.f28450c.get(Long.valueOf(user.f19979id));
            z10 = user2 != null;
            if (z10) {
                z11 = !ob.e.m0(user2.status, user.status);
                ob.e.u(user, user2);
                synchronized (this.f28470v0) {
                    user2.status = user.status;
                }
                user = user2;
            } else {
                this.f28450c.put(Long.valueOf(user.f19979id), user);
                z11 = false;
            }
        }
        Y0(user);
        boolean z12 = user.f19979id == this.f28448b;
        if (z12) {
            V0(this.R.iterator(), user);
            this.f28446a.b5(user);
            this.f28446a.ka().E1(user);
        }
        if (z11) {
            r1(new TdApi.UpdateUserStatus(user.f19979id, user.status));
        } else {
            synchronized (this.f28470v0) {
                U(user, user.status, false);
            }
        }
        if (z12) {
            if (Build.VERSION.SDK_INT >= 26) {
                cb.w(user);
            }
            this.f28446a.F4().m2(this.f28446a.A6(), user, true ^ z10);
        }
    }

    public void p2(long j10, h hVar) {
        e0(j10, hVar);
    }

    public void q1(final TdApi.UpdateUserFullInfo updateUserFullInfo) {
        boolean I1;
        synchronized (this.f28465q0) {
            I1 = I1(updateUserFullInfo.userId, updateUserFullInfo.userFullInfo);
        }
        if (I1) {
            X0(updateUserFullInfo.userId, updateUserFullInfo.userFullInfo);
        }
        if (this.f28448b != 0 && updateUserFullInfo.userId == this.f28448b) {
            this.f28446a.id(new Runnable() {
                @Override
                public final void run() {
                    t7.this.z0(updateUserFullInfo);
                }
            });
        }
    }

    public void q2(long j10, j jVar) {
        if (j10 == 0) {
            throw new IllegalArgumentException("userId == " + j10);
        } else if (jVar.u3()) {
            this.P.g(Long.valueOf(j10), jVar);
        } else {
            this.Q.g(Long.valueOf(j10), jVar);
        }
    }

    public void r1(TdApi.UpdateUserStatus updateUserStatus) {
        synchronized (this.f28465q0) {
            TdApi.User user = this.f28450c.get(Long.valueOf(updateUserStatus.userId));
            if (user != null) {
                synchronized (this.f28470v0) {
                    user.status = updateUserStatus.status;
                }
                this.f28446a.X4(updateUserStatus, false);
            }
        }
    }

    public <T extends i & j> void r2(long j10, T t10) {
        C(j10, t10);
        q2(j10, t10);
    }

    public void s1(TdApi.UpdateUserStatus updateUserStatus, boolean z10) {
        synchronized (this.f28465q0) {
            TdApi.User user = this.f28450c.get(Long.valueOf(updateUserStatus.userId));
            if (user != null) {
                Z0(updateUserStatus.userId, user.status, z10);
                synchronized (this.f28470v0) {
                    U(user, user.status, false);
                }
            }
        }
    }

    public <T extends i & j> void s2(long[] jArr, T t10) {
        for (long j10 : jArr) {
            C(j10, t10);
            q2(j10, t10);
        }
    }

    public final void t1(long j10, int i10, TdApi.User user) {
        if (user != null) {
            synchronized (this.f28470v0) {
                TdApi.UserStatus userStatus = user.status;
                if (userStatus != null) {
                    if (userStatus.getConstructor() == -759984891) {
                        if (((TdApi.UserStatusOffline) user.status).wasOnline == i10) {
                            this.f28462n0.c(j10);
                            Z0(j10, user.status, true);
                            synchronized (this.f28470v0) {
                                U(user, user.status, false);
                            }
                        }
                    }
                }
            }
        }
    }

    public void t2(long j10, long j11, TdApi.MessageLocation messageLocation) {
        if (messageLocation.livePeriod != 0) {
            synchronized (this.f28458j0) {
                if (!this.f28458j0.isEmpty()) {
                    int l02 = l0(j10, j11);
                    if (l02 != -1) {
                        TdApi.Message message = this.f28458j0.get(l02);
                        message.content = messageLocation;
                        boolean z10 = messageLocation.expiresIn == 0;
                        this.f28446a.S2(message);
                        if (z10) {
                            this.f28458j0.remove(l02);
                            W0(-1);
                        } else {
                            this.f28446a.gb(message);
                        }
                    }
                }
            }
        }
    }

    public final void u1(int i10, c cVar) {
        this.f28455g0.b(Integer.valueOf(i10), cVar);
    }

    public TdApi.User u2(long j10) {
        TdApi.User user;
        if (j10 == 0) {
            Log.bug("getUser for userId=0", new Object[0]);
            return null;
        }
        synchronized (this.f28465q0) {
            user = this.f28450c.get(Long.valueOf(j10));
            if (user == null) {
                Log.bug("updateUser missing for userId:%d", Long.valueOf(j10));
            }
        }
        return user;
    }

    public final void v1(b bVar) {
        this.U.add(bVar);
    }

    public ld.h v2(long j10) {
        TdApi.ProfilePhoto profilePhoto;
        if (j10 == 0) {
            return null;
        }
        TdApi.User u22 = u2(j10);
        if (u22 != null) {
            profilePhoto = u22.profilePhoto;
        } else {
            profilePhoto = null;
        }
        if (profilePhoto == null) {
            return null;
        }
        ld.h hVar = new ld.h(this.f28446a, profilePhoto.small);
        hVar.t0(wc.a.getDefaultAvatarCacheSize());
        return hVar;
    }

    public final void w1(c cVar) {
        this.f28454f0.add(cVar);
    }

    public int w2(long j10) {
        return x2(j10 != 0 ? u2(j10) : null);
    }

    public final void x1(g gVar) {
        this.f28449b0.add(gVar);
    }

    public int x2(TdApi.User user) {
        return t2.H0((user == null || t2.I3(user)) ? -1L : user.f19979id, this.f28448b);
    }

    public final void y1(h hVar) {
        this.Y.add(hVar);
    }

    public boolean y2(long j10) {
        return j10 != 0 && t2.K2(u2(j10));
    }

    public void z1(i iVar) {
        E(iVar);
    }

    public boolean z2(long j10) {
        return j10 != 0 && t2.O2(u2(j10));
    }
}
