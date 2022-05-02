package p350yd;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import be.C1363c0;
import be.C1379j0;
import gd.C4587b;
import gd.C4779t2;
import ie.C5386e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.voip.gui.CallSettings;
import p082fd.C4403w;
import p108hb.C5062b;
import p108hb.C5070i;
import p111he.AbstractC5143t;
import p124ib.C5324g;
import p139jb.AbstractC5918j;
import p139jb.AbstractRunnableC5910b;
import p143k0.C6038h;
import p154kb.C6226c;
import p154kb.C6227d;
import p154kb.C6231f;
import p154kb.C6233h;
import p156kd.C6246h;
import p193nb.C7316a;
import p193nb.C7321e;
import p350yd.C10651f1;
import vc.C9903a;

public class C11059v7 implements C10651f1.AbstractC10654c, AbstractC10816l0, C1379j0.AbstractC1380a {
    public final C6233h.AbstractC6234a<Long, AbstractC11069j> f35497O;
    public final C6231f<AbstractC11069j> f35498P;
    public final C10930q6 f35509a;
    public volatile long f35511b;
    public boolean f35522k0;
    public TdApi.HttpUrl f35529r0;
    public boolean f35530s0;
    public boolean f35531t0;
    public boolean f35532u0;
    public boolean f35534w0;
    public final HashMap<Long, TdApi.User> f35513c = new HashMap<>();
    public final HashMap<Long, TdApi.UserFullInfo> f35495M = new HashMap<>();
    public final C6231f<AbstractC11068i> f35496N = new C6231f<>(true);
    public final C6231f<AbstractC11069j> f35499Q = new C6231f<>(true, null);
    public final C6227d<AbstractC11064e> f35500R = new C6227d<>(true);
    public final HashMap<Long, TdApi.BasicGroup> f35501S = new HashMap<>();
    public final HashMap<Long, TdApi.BasicGroupFullInfo> f35502T = new HashMap<>();
    public final C6227d<AbstractC11061b> f35503U = new C6227d<>(true);
    public final C6231f<AbstractC11061b> f35504V = new C6231f<>(true);
    public final HashMap<Long, TdApi.Supergroup> f35505W = new HashMap<>();
    public final HashMap<Long, TdApi.SupergroupFullInfo> f35506X = new HashMap<>();
    public final C6227d<AbstractC11067h> f35507Y = new C6227d<>();
    public final C6231f<AbstractC11067h> f35508Z = new C6231f<>();
    public final HashMap<Integer, TdApi.SecretChat> f35510a0 = new HashMap<>();
    public final C6227d<AbstractC11066g> f35512b0 = new C6227d<>();
    public final C6226c<AbstractC11066g> f35514c0 = new C6226c<>();
    public final C6038h<TdApi.Call> f35515d0 = new C6038h<>();
    public final C6038h<CallSettings> f35516e0 = new C6038h<>();
    public final C6227d<AbstractC11062c> f35517f0 = new C6227d<>();
    public final C6226c<AbstractC11062c> f35518g0 = new C6226c<>();
    public final C6227d<AbstractC11063d> f35519h0 = new C6227d<>(true);
    public final C6231f<AbstractC11063d> f35520i0 = new C6231f<>(true);
    public final ArrayList<TdApi.Message> f35521j0 = new ArrayList<>();
    public final C5324g f35525n0 = new C5324g();
    public final Client.AbstractC7865g f35527p0 = new Client.AbstractC7865g() {
        @Override
        public final void mo255t2(TdApi.Object object) {
            C11059v7.this.m1585v0(object);
        }
    };
    public final Object f35528q0 = new Object();
    public final Object f35533v0 = new Object();
    public final Client.AbstractC7865g f35523l0 = new Client.AbstractC7865g() {
        @Override
        public final void mo255t2(TdApi.Object object) {
            C11059v7.this.m1581w0(object);
        }
    };
    public final Client.AbstractC7865g f35524m0 = C10845m7.f34751a;
    public final Handler f35526o0 = new HandlerC11065f(this);

    public class C11060a extends AbstractRunnableC5910b {
        public final AbstractC5918j f35535M;

        public C11060a(AbstractC5918j jVar) {
            this.f35535M = jVar;
        }

        @Override
        public void mo1364b() {
            AbstractC5918j jVar = this.f35535M;
            if (jVar != null) {
                jVar.mo1330a(new TdApi.HttpUrl("https://telegram.org/dlx"));
            }
            m21858c();
        }
    }

    public interface AbstractC11061b {
        void mo1566W2(TdApi.BasicGroup basicGroup, boolean z);

        void mo1565i4(long j, TdApi.BasicGroupFullInfo basicGroupFullInfo);
    }

    public interface AbstractC11062c {
        void mo1564X4(int i, int i2);

        void mo1563b7(int i, CallSettings callSettings);

        void mo1562f(TdApi.Call call);

        void mo1561x0(int i, int i2);
    }

    public interface AbstractC11063d {
        void mo1560u2(long j, TdApi.ChatMember chatMember);
    }

    public interface AbstractC11064e {
        void mo1559a1(String str);

        void mo1558l2(TdApi.User user);
    }

    public static class HandlerC11065f extends Handler {
        public final C11059v7 f35537a;

        public HandlerC11065f(C11059v7 v7Var) {
            super(Looper.getMainLooper());
            this.f35537a = v7Var;
        }

        @Override
        public void handleMessage(Message message) {
            long longValue = ((Long) message.obj).longValue();
            this.f35537a.m1584v1(longValue, message.arg1, this.f35537a.m1583v2(longValue));
        }
    }

    public interface AbstractC11066g {
        void mo1557B0(TdApi.SecretChat secretChat);
    }

    public interface AbstractC11067h {
        void mo1556h0(long j, TdApi.SupergroupFullInfo supergroupFullInfo);

        void mo1555t0(TdApi.Supergroup supergroup);
    }

    public interface AbstractC11068i {
        void mo1348P1(TdApi.User user);

        void mo1335u7(long j, TdApi.UserFullInfo userFullInfo);
    }

    public interface AbstractC11069j {
        boolean mo1350D3();

        void mo1349J3(long j, TdApi.UserStatus userStatus, boolean z);
    }

    public C11059v7(C10930q6 q6Var) {
        boolean z = true;
        C6233h.AbstractC6234a<Long, AbstractC11069j> u7Var = new C6233h.AbstractC6234a() {
            @Override
            public final void mo1980a(C6233h hVar, boolean z2) {
                C11059v7.this.m1589u0(hVar, z2);
            }
        };
        this.f35497O = u7Var;
        this.f35498P = new C6231f<>(true, u7Var);
        this.f35531t0 = true;
        this.f35509a = q6Var;
        q6Var.m2781K9().m1839l(this);
        C1379j0.m37338d(this);
        this.f35531t0 = C1379j0.m37367F() == 0 ? false : z;
    }

    public void m1763A0(long j, TdApi.Object object) {
        this.f35509a.m2270r4().m14783o(new TdApi.GetSupergroupFullInfo(j), this.f35524m0);
    }

    public void m1759B0(AbstractC5918j jVar, long j) {
        jVar.mo1330a(m1634i2(j));
    }

    public void m1751D0(final AbstractC5918j jVar, final long j, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37305t0(object);
            this.f35509a.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    AbstractC5918j.this.mo1330a(null);
                }
            });
        } else if (constructor == -1035719349) {
            this.f35509a.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C11059v7.this.m1759B0(jVar, j);
                }
            });
        }
    }

    public void m1743F0(final AbstractC5918j jVar, final long j, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37305t0(object);
            this.f35509a.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    AbstractC5918j.this.mo1330a(null);
                }
            });
        } else if (constructor == 2138747126) {
            this.f35509a.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C11059v7.this.m1735H0(jVar, j);
                }
            });
        }
    }

    public void m1739G0(long j, TdApi.Object object) {
        this.f35509a.m2270r4().m14783o(new TdApi.GetUserFullInfo(j), this.f35524m0);
    }

    public void m1735H0(AbstractC5918j jVar, long j) {
        jVar.mo1330a(m1745E2(j));
    }

    public static void m1723K0(Iterator<AbstractC11062c> it, int i, int i2, boolean z) {
        if (it == null) {
            return;
        }
        if (z) {
            while (it.hasNext()) {
                it.next().mo1564X4(i, i2);
            }
            return;
        }
        while (it.hasNext()) {
            it.next().mo1561x0(i, i2);
        }
    }

    public static void m1719L0(Iterator<AbstractC11062c> it, int i, CallSettings callSettings) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo1563b7(i, callSettings);
            }
        }
    }

    public static void m1715M0(Iterator<AbstractC11061b> it, long j, TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo1565i4(j, basicGroupFullInfo);
            }
        }
    }

    public static void m1711N0(Iterator<AbstractC11067h> it, long j, TdApi.SupergroupFullInfo supergroupFullInfo) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo1556h0(j, supergroupFullInfo);
            }
        }
    }

    public static void m1707O0(Iterator<AbstractC11068i> it, long j, TdApi.UserFullInfo userFullInfo) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo1335u7(j, userFullInfo);
            }
        }
    }

    public static void m1703P0(Iterator<AbstractC11061b> it, TdApi.BasicGroup basicGroup, boolean z) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo1566W2(basicGroup, z);
            }
        }
    }

    public static void m1696R0(Iterator<AbstractC11062c> it, TdApi.Call call) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo1562f(call);
            }
        }
    }

    public static void m1692S0(Iterator<AbstractC11066g> it, TdApi.SecretChat secretChat) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo1557B0(secretChat);
            }
        }
    }

    public static void m1688T0(Iterator<AbstractC11067h> it, TdApi.Supergroup supergroup) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo1555t0(supergroup);
            }
        }
    }

    public static void m1684U0(Iterator<AbstractC11068i> it, TdApi.User user) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo1348P1(user);
            }
        }
    }

    public static void m1681V0(Iterator<AbstractC11064e> it, String str) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo1559a1(str);
            }
        }
    }

    public static void m1678W0(Iterator<AbstractC11064e> it, TdApi.User user) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo1558l2(user);
            }
        }
    }

    public static void m1663b1(Iterator<AbstractC11069j> it, long j, TdApi.UserStatus userStatus, boolean z) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo1349J3(j, userStatus, z);
            }
        }
    }

    public void m1617n0(AbstractC5918j jVar, long j) {
        jVar.mo1330a(m1708O(j));
    }

    public void m1609p0(final AbstractC5918j jVar, final long j, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37305t0(object);
            this.f35509a.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    AbstractC5918j.this.mo1330a(null);
                }
            });
        } else if (constructor == 2022233397) {
            this.f35509a.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C11059v7.this.m1617n0(jVar, j);
                }
            });
        }
    }

    public void m1605q0(long j, TdApi.Object object) {
        this.f35509a.m2270r4().m14783o(new TdApi.GetBasicGroupFullInfo(j), this.f35524m0);
    }

    public void m1601r0(TdApi.HttpUrl httpUrl, AbstractC5918j jVar, AbstractRunnableC5910b bVar) {
        this.f35529r0 = httpUrl;
        if (jVar != null && bVar.m21857d()) {
            jVar.mo1330a(httpUrl);
            bVar.m21858c();
        }
    }

    public void m1597s0(final AbstractC5918j jVar, final AbstractRunnableC5910b bVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -2018019930) {
            final TdApi.HttpUrl httpUrl = (TdApi.HttpUrl) object;
            if (C1363c0.m37460Q(httpUrl.url)) {
                this.f35509a.m2485dd().post(new Runnable() {
                    @Override
                    public final void run() {
                        C11059v7.this.m1601r0(httpUrl, jVar, bVar);
                    }
                });
            } else {
                this.f35509a.m2485dd().post(bVar);
            }
        } else if (constructor == -1679978726) {
            this.f35509a.m2485dd().post(bVar);
        }
    }

    public static void m1593t0(AbstractC5918j jVar, TdApi.HttpUrl httpUrl) {
        if (jVar != null) {
            jVar.mo1330a(new TdApi.Text(C4403w.m27867j1(R.string.InviteText, "Telegram X", httpUrl.url)));
        }
    }

    public void m1589u0(C6233h hVar, boolean z) {
        m1674X1(z);
    }

    public void m1585v0(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.m14719i("Unable to load active live locations: %s", C4779t2.m25379z5(object));
        } else if (constructor == -16498159) {
            m1699Q1(((TdApi.Messages) object).messages);
        }
    }

    public void m1581w0(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37305t0(object);
        } else if (constructor != -537797015) {
            Log.unexpectedTdlibResponse(object, TdApi.GetMe.class, TdApi.User.class, TdApi.Error.class);
        } else {
            this.f35522k0 = false;
        }
    }

    public static void m1577x0(TdApi.Object object) {
        switch (object.getConstructor()) {
            case TdApi.Error.CONSTRUCTOR:
                Log.m14719i("dataHandler error: %s", C4779t2.m25379z5(object));
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
            case TdApi.UserFullInfo.CONSTRUCTOR:
                TdApi.UserFullInfo userFullInfo = (TdApi.UserFullInfo) object;
                return;
            default:
                Log.unexpectedTdlibResponse(object, TdApi.GetUserFullInfo.class, TdApi.UserFullInfo.class, TdApi.BasicGroupFullInfo.class, TdApi.SupergroupFullInfo.class, TdApi.Error.class, TdApi.User.class);
                return;
        }
    }

    public void m1573y0(TdApi.Message message, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.m14724e("Error broadcasting location: %s", C4779t2.m25379z5(object));
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
                m1647f1(message);
            }
        }
    }

    public void m1569z0(TdApi.UpdateUserFullInfo updateUserFullInfo) {
        m1681V0(this.f35500R.iterator(), updateUserFullInfo.userFullInfo.bio);
    }

    public final void m1764A(AbstractC11069j jVar) {
        if (jVar.mo1350D3()) {
            this.f35498P.m21017g(0L, jVar);
        } else {
            this.f35499Q.m21017g(0L, jVar);
        }
    }

    public final void m1762A1(AbstractC11067h hVar) {
        this.f35507Y.add(hVar);
    }

    public boolean m1761A2(long j) {
        return j != 0 && C4779t2.m25631O2(m1583v2(j));
    }

    public final void m1760B(AbstractC11068i iVar) {
        this.f35496N.m21017g(0L, iVar);
    }

    public void m1758B1(AbstractC11068i iVar) {
        m1748E(iVar);
    }

    public boolean m1757B2(long j) {
        return j != 0 && C4779t2.m25672I3(m1583v2(j));
    }

    public final void m1756C(long j, AbstractC11068i iVar) {
        if (j != 0) {
            this.f35496N.m21017g(Long.valueOf(j), iVar);
            return;
        }
        throw new IllegalArgumentException("userId == " + j);
    }

    public final boolean m1754C1(long j, TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        this.f35502T.put(Long.valueOf(j), basicGroupFullInfo);
        return true;
    }

    public String m1753C2(long j, boolean z, boolean z2) {
        if (z && this.f35509a.m2379k7(j)) {
            return C4403w.m27871i1(R.string.SavedMessages);
        }
        TdApi.User v2 = m1583v2(j);
        if (C4779t2.m25672I3(v2)) {
            return C4403w.m27871i1(R.string.HiddenName);
        }
        if (this.f35509a.m2475e7(C7316a.m17058c(j))) {
            return C4403w.m27871i1(R.string.RepliesBot);
        }
        if (z2) {
            return C4779t2.m25431s2(j, v2);
        }
        return C4779t2.m25452p2(j, v2);
    }

    public final void m1752D(AbstractC11069j jVar) {
        if (jVar.mo1350D3()) {
            this.f35498P.m21022b(0L, jVar);
        } else {
            this.f35499Q.m21022b(0L, jVar);
        }
    }

    public final void m1750D1(long j, AbstractC11061b bVar) {
        this.f35504V.m21022b(Long.valueOf(j), bVar);
    }

    public String m1749D2(long j) {
        return j != 0 ? C4779t2.m25431s2(j, m1583v2(j)) : "VOID";
    }

    public final void m1748E(AbstractC11068i iVar) {
        this.f35496N.m21022b(0L, iVar);
    }

    public final boolean m1746E1(TdApi.SecretChat secretChat) {
        boolean z = this.f35510a0.get(Integer.valueOf(secretChat.f25422id)) != null;
        this.f35510a0.put(Integer.valueOf(secretChat.f25422id), secretChat);
        return z;
    }

    public TdApi.UserFullInfo m1745E2(long j) {
        return m1741F2(j, true);
    }

    public final void m1744F(long j, AbstractC11068i iVar) {
        if (j != 0) {
            this.f35496N.m21022b(Long.valueOf(j), iVar);
            return;
        }
        throw new IllegalArgumentException("userId == " + j);
    }

    public final void m1742F1(int i, AbstractC11066g gVar) {
        this.f35514c0.m21022b(Integer.valueOf(i), gVar);
    }

    public TdApi.UserFullInfo m1741F2(final long j, boolean z) {
        TdApi.UserFullInfo userFullInfo;
        synchronized (this.f35528q0) {
            Long valueOf = Long.valueOf(j);
            userFullInfo = this.f35495M.get(valueOf);
            if (userFullInfo == null || z) {
                if (this.f35513c.get(valueOf) != null) {
                    this.f35509a.m2270r4().m14783o(new TdApi.GetUserFullInfo(j), this.f35524m0);
                } else {
                    this.f35509a.m2270r4().m14783o(new TdApi.GetUser(j), new Client.AbstractC7865g() {
                        @Override
                        public final void mo255t2(TdApi.Object object) {
                            C11059v7.this.m1739G0(j, object);
                        }
                    });
                }
            }
        }
        return userFullInfo;
    }

    public void m1740G(long j, AbstractC11063d dVar) {
        this.f35520i0.m21022b(Long.valueOf(j), dVar);
    }

    public final int m1738G1(org.drinkless.p210td.libcore.telegram.TdApi.Supergroup r6) {
        throw new UnsupportedOperationException("Method not decompiled: p350yd.C11059v7.m1738G1(org.drinkless.td.libcore.telegram.TdApi$Supergroup):int");
    }

    public void m1737G2(final long j, final AbstractC5918j<TdApi.UserFullInfo> jVar) {
        if (j != 0) {
            TdApi.UserFullInfo E2 = m1745E2(j);
            if (jVar != null) {
                if (E2 != null) {
                    jVar.mo1330a(E2);
                } else {
                    this.f35509a.m2270r4().m14783o(new TdApi.GetUserFullInfo(j), new Client.AbstractC7865g() {
                        @Override
                        public final void mo255t2(TdApi.Object object) {
                            C11059v7.this.m1743F0(jVar, j, object);
                        }
                    });
                }
            }
        } else if (jVar != null) {
            jVar.mo1330a(null);
        }
    }

    public void m1736H(AbstractC11063d dVar) {
        this.f35519h0.add(dVar);
    }

    public final boolean m1734H1(long j, TdApi.SupergroupFullInfo supergroupFullInfo) {
        this.f35506X.put(Long.valueOf(j), supergroupFullInfo);
        return true;
    }

    public boolean m1733H2(long j) {
        return j != 0 && C4779t2.m25556a3(m1583v2(j));
    }

    public <T extends AbstractC11068i & AbstractC11069j> void m1732I(T t) {
        m1748E(t);
        m1752D(t);
    }

    @Deprecated
    public TdApi.User m1731I0() {
        TdApi.User user;
        synchronized (this.f35528q0) {
            user = this.f35511b != 0 ? this.f35513c.get(Long.valueOf(this.f35511b)) : null;
        }
        return user;
    }

    public final void m1730I1(long j, AbstractC11067h hVar) {
        this.f35508Z.m21022b(Long.valueOf(j), hVar);
    }

    public boolean m1729I2(long j) {
        boolean z = false;
        if (j == 0) {
            return false;
        }
        synchronized (this.f35528q0) {
            TdApi.User user = this.f35513c.get(Long.valueOf(j));
            TdApi.UserStatus userStatus = user != null ? user.status : null;
            if (!(userStatus == null || userStatus.getConstructor() != -759984891 || ((TdApi.UserStatusOffline) userStatus).wasOnline == 0)) {
                z = true;
            }
        }
        return z;
    }

    public void m1728J(AbstractC11064e eVar) {
        this.f35500R.add(eVar);
    }

    @Deprecated
    public long m1727J0() {
        return this.f35511b;
    }

    public final boolean m1726J1(long j, TdApi.UserFullInfo userFullInfo) {
        this.f35495M.put(Long.valueOf(j), userFullInfo);
        return true;
    }

    public C5386e m1725J2(TdApi.User user) {
        return C4779t2.m25702E1(user);
    }

    public void m1724K(TdApi.Message message) {
        if (message.sendingState == null && message.canBeEdited && message.isOutgoing && message.content.getConstructor() == 303973492) {
            TdApi.MessageLocation messageLocation = (TdApi.MessageLocation) message.content;
            if (messageLocation.livePeriod != 0 && messageLocation.expiresIn != 0) {
                synchronized (this.f35521j0) {
                    this.f35521j0.add(message);
                    m1675X0(1);
                    this.f35509a.m2503cb(message);
                }
            }
        }
    }

    public void m1722K1(long j, AbstractC11063d dVar) {
        this.f35520i0.m21017g(Long.valueOf(j), dVar);
    }

    public String m1721K2(long j) {
        return j != 0 ? C4779t2.m25452p2(j, m1583v2(j)) : "VOID";
    }

    public void m1720L(long j, AbstractC11068i iVar) {
        m1744F(j, iVar);
    }

    @Override
    public void mo1718L1(TdApi.Location location, int i) {
        synchronized (this.f35521j0) {
            Log.m14714v("Updating %d live location messages", Integer.valueOf(this.f35521j0.size()));
            Iterator<TdApi.Message> it = this.f35521j0.iterator();
            while (it.hasNext()) {
                final TdApi.Message next = it.next();
                this.f35509a.m2270r4().m14783o(new TdApi.EditMessageLiveLocation(next.chatId, next.f25409id, next.replyMarkup, location, i, 0), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        C11059v7.this.m1573y0(next, object);
                    }
                });
            }
        }
    }

    public C4587b m1717L2(long j, TdApi.User user, boolean z, float f, AbstractC5143t tVar) {
        return new C4587b(f, m1705O2(j, user, z), tVar);
    }

    public TdApi.BasicGroup m1716M(long j) {
        TdApi.BasicGroup basicGroup;
        synchronized (this.f35528q0) {
            basicGroup = this.f35501S.get(Long.valueOf(j));
        }
        return basicGroup;
    }

    public void m1714M1(AbstractC11063d dVar) {
        this.f35519h0.remove(dVar);
    }

    public C4587b m1713M2(long j, boolean z, float f, AbstractC5143t tVar) {
        return m1717L2(j, m1583v2(j), z, f, tVar);
    }

    public boolean m1712N(long j) {
        TdApi.BasicGroup M = m1716M(j);
        return M != null && M.isActive;
    }

    public <T extends AbstractC11068i & AbstractC11069j> void m1710N1(T t) {
        m1760B(t);
        m1764A(t);
    }

    public C4587b m1709N2(TdApi.User user, boolean z, float f, AbstractC5143t tVar) {
        return m1717L2(user != null ? user.f25442id : 0L, user, z, f, tVar);
    }

    public TdApi.BasicGroupFullInfo m1708O(long j) {
        return m1704P(j, true);
    }

    public void m1706O1(AbstractC11064e eVar) {
        this.f35500R.remove(eVar);
    }

    public C4587b.C4588a m1705O2(long j, TdApi.User user, boolean z) {
        if (user != null || j == 0) {
            return m1701P2(user, z);
        }
        return new C4587b.C4588a(C4779t2.m25682H0(j, this.f35509a.m2519ba()));
    }

    public TdApi.BasicGroupFullInfo m1704P(long j, boolean z) {
        TdApi.BasicGroupFullInfo R;
        synchronized (this.f35528q0) {
            R = m1697R(j, z);
        }
        return R;
    }

    public void m1702P1(long j, AbstractC11068i iVar) {
        m1756C(j, iVar);
    }

    public C4587b.C4588a m1701P2(TdApi.User user, boolean z) {
        int i;
        int i2;
        int i3;
        C5386e eVar;
        int i4;
        int i5;
        int i6;
        String str = null;
        if (user == null) {
            return null;
        }
        if (!z || !this.f35509a.m2379k7(user.f25442id)) {
            if (this.f35509a.m2475e7(C7316a.m17058c(user.f25442id))) {
                i4 = R.id.theme_color_avatarReplies;
                eVar = null;
                i5 = R.drawable.baseline_reply_24;
            } else {
                eVar = m1725J2(user);
                i4 = m1571y2(user);
                i5 = 0;
            }
            if (this.f35509a.m2379k7(user.f25442id)) {
                i6 = R.drawable.ic_add_a_photo_black_56;
            } else if (this.f35509a.m2475e7(C7316a.m17058c(user.f25442id))) {
                i6 = R.drawable.baseline_reply_56;
            } else {
                i6 = C4779t2.m25659K2(user) ? R.drawable.deproko_baseline_bots_56 : R.drawable.baseline_person_56;
            }
            i = i5;
            i3 = i6;
            i2 = i4;
        } else {
            i2 = R.id.theme_color_avatarSavedMessages;
            i = R.drawable.baseline_bookmark_24;
            eVar = null;
            i3 = 0;
        }
        if (eVar != null) {
            str = eVar.f17711a;
        }
        return new C4587b.C4588a(i2, str, i, i3);
    }

    public void m1700Q(final long j, final AbstractC5918j<TdApi.BasicGroupFullInfo> jVar) {
        if (j != 0) {
            TdApi.BasicGroupFullInfo O = m1708O(j);
            if (jVar != null) {
                if (O != null) {
                    jVar.mo1330a(O);
                } else {
                    this.f35509a.m2270r4().m14783o(new TdApi.GetBasicGroupFullInfo(j), new Client.AbstractC7865g() {
                        @Override
                        public final void mo255t2(TdApi.Object object) {
                            C11059v7.this.m1609p0(jVar, j, object);
                        }
                    });
                }
            }
        } else if (jVar != null) {
            jVar.mo1330a(null);
        }
    }

    public final void m1699Q1(TdApi.Message[] messageArr) {
        synchronized (this.f35521j0) {
            if (!this.f35521j0.isEmpty() || !(messageArr == null || messageArr.length == 0)) {
                Iterator<TdApi.Message> it = this.f35521j0.iterator();
                while (it.hasNext()) {
                    this.f35509a.m2692Q2(it.next());
                }
                int size = this.f35521j0.size();
                this.f35521j0.clear();
                if (messageArr != null) {
                    Collections.addAll(this.f35521j0, messageArr);
                    m1675X0(messageArr.length - size);
                    Iterator<TdApi.Message> it2 = this.f35521j0.iterator();
                    while (it2.hasNext()) {
                        this.f35509a.m2503cb(it2.next());
                    }
                } else {
                    m1675X0(-size);
                }
            }
        }
    }

    public TdApi.User m1698Q2(long j) {
        TdApi.User user;
        if (j != 0) {
            synchronized (this.f35528q0) {
                user = this.f35513c.get(Long.valueOf(j));
                if (user == null) {
                    throw new IllegalStateException("id" + j);
                }
            }
            return user;
        }
        throw new IllegalArgumentException();
    }

    public final TdApi.BasicGroupFullInfo m1697R(final long j, boolean z) {
        Long valueOf = Long.valueOf(j);
        TdApi.BasicGroupFullInfo basicGroupFullInfo = this.f35502T.get(valueOf);
        if (basicGroupFullInfo == null || z) {
            if (this.f35501S.get(valueOf) != null) {
                this.f35509a.m2270r4().m14783o(new TdApi.GetBasicGroupFullInfo(j), this.f35524m0);
            } else {
                this.f35509a.m2270r4().m14783o(new TdApi.GetBasicGroup(j), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        C11059v7.this.m1605q0(j, object);
                    }
                });
            }
        }
        return basicGroupFullInfo;
    }

    public TdApi.User m1695R1(String str) {
        TdApi.User user;
        synchronized (this.f35528q0) {
            Iterator<Map.Entry<Long, TdApi.User>> it = this.f35513c.entrySet().iterator();
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

    public String m1694R2(long j) {
        TdApi.User v2;
        if (j == 0 || (v2 = m1583v2(j)) == null || C5070i.m24062i(v2.username)) {
            return null;
        }
        return v2.username;
    }

    public TdApi.BasicGroup m1693S(long j) {
        TdApi.BasicGroup basicGroup;
        if (j != 0) {
            synchronized (this.f35528q0) {
                basicGroup = this.f35501S.get(Long.valueOf(j));
                if (basicGroup == null) {
                    throw new IllegalStateException("id:" + j);
                }
            }
            return basicGroup;
        }
        throw new IllegalArgumentException();
    }

    public TdApi.SecretChat m1691S1(int i) {
        TdApi.SecretChat secretChat;
        synchronized (this.f35528q0) {
            secretChat = this.f35510a0.get(Integer.valueOf(i));
        }
        return secretChat;
    }

    public int m1690S2(long[] jArr, ArrayList<TdApi.User> arrayList) {
        int i;
        synchronized (this.f35528q0) {
            i = 0;
            for (long j : jArr) {
                if (j != 0) {
                    TdApi.User user = this.f35513c.get(Long.valueOf(j));
                    if (user != null) {
                        arrayList.add(user);
                        i++;
                    } else {
                        Log.bug("updateUser missing for userId:%d", Long.valueOf(j));
                    }
                }
            }
        }
        return i;
    }

    public final void m1689T() {
        boolean z = this.f35530s0 && !this.f35531t0;
        if (this.f35532u0 != z) {
            this.f35532u0 = z;
            Log.m14719i("accountId:%d refreshActive -> %b, size:%d", Integer.valueOf(this.f35509a.m2188w6()), Boolean.valueOf(z), Integer.valueOf(this.f35525n0.m23251i()));
            if (!z) {
                this.f35526o0.removeCallbacksAndMessages(null);
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            for (int i = this.f35525n0.m23251i() - 1; i >= 0; i--) {
                long f = this.f35525n0.m23254f(i);
                this.f35525n0.m23250j(i);
                TdApi.User user = this.f35513c.get(Long.valueOf(f));
                if (user != null) {
                    m1685U(user, user.status, true);
                }
            }
            Log.m14719i("%d iterations in %dms", Integer.valueOf(this.f35525n0.m23251i()), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    public TdApi.SecretChat m1687T1(int i) {
        TdApi.SecretChat secretChat;
        if (i != 0) {
            synchronized (this.f35528q0) {
                secretChat = this.f35510a0.get(Integer.valueOf(i));
                if (secretChat == null) {
                    throw new IllegalStateException("id:" + i);
                }
            }
            return secretChat;
        }
        throw new IllegalArgumentException();
    }

    public ArrayList<TdApi.User> m1686T2(long[] jArr) {
        ArrayList<TdApi.User> arrayList = new ArrayList<>(jArr.length);
        m1690S2(jArr, arrayList);
        return arrayList;
    }

    public final void m1685U(TdApi.User user, TdApi.UserStatus userStatus, boolean z) {
        if (userStatus.getConstructor() == -759984891) {
            int i = ((TdApi.UserStatusOffline) userStatus).wasOnline;
            int d = this.f35525n0.m23256d(user.f25442id);
            if (d != i || z) {
                if (d != 0) {
                    this.f35526o0.removeMessages(0, Long.valueOf(user.f25442id));
                    this.f35525n0.m23257c(user.f25442id);
                }
                long L0 = C4403w.m27968L0(i, TimeUnit.SECONDS, this.f35509a.m2898D4(), TimeUnit.MILLISECONDS, true, 60);
                if (L0 != -1) {
                    this.f35525n0.m23253g(user.f25442id, i);
                    if (this.f35532u0) {
                        Message obtain = Message.obtain(this.f35526o0, 0, i, 0, Long.valueOf(user.f25442id));
                        if (z) {
                            this.f35526o0.sendMessage(obtain);
                        } else {
                            this.f35526o0.sendMessageDelayed(obtain, L0);
                        }
                    }
                }
            }
        } else if (this.f35525n0.m23256d(user.f25442id) != 0) {
            this.f35526o0.removeMessages(0, Long.valueOf(user.f25442id));
            this.f35525n0.m23257c(user.f25442id);
        }
    }

    public C4587b.C4588a m1683U1() {
        return new C4587b.C4588a((int) R.id.theme_color_avatarSavedMessages, (String) null, (int) R.drawable.baseline_bookmark_24, 0);
    }

    public void m1682V() {
        this.f35513c.clear();
        this.f35495M.clear();
        this.f35501S.clear();
        this.f35502T.clear();
        this.f35505W.clear();
        this.f35506X.clear();
        this.f35510a0.clear();
        this.f35515d0.m21475b();
        this.f35516e0.m21475b();
        m1699Q1(null);
        this.f35511b = 0L;
        this.f35529r0 = null;
    }

    public boolean m1680V1(TdApi.MessageSender messageSender) {
        return messageSender != null && messageSender.getConstructor() == -336109341 && m1567z2(((TdApi.MessageSenderUser) messageSender).userId);
    }

    public final void m1679W(AbstractC11061b bVar) {
        this.f35503U.remove(bVar);
    }

    public final void m1677W1(boolean z) {
        synchronized (this.f35533v0) {
            if (this.f35531t0 != z) {
                this.f35531t0 = z;
                Log.m14719i("accountId:%d refreshUiPaused -> %b", Integer.valueOf(this.f35509a.m2188w6()), Boolean.valueOf(this.f35531t0));
                m1689T();
            }
        }
    }

    public final void m1676X(AbstractC11062c cVar) {
        this.f35517f0.remove(cVar);
    }

    public final void m1675X0(int i) {
        boolean z = !this.f35521j0.isEmpty();
        if (this.f35534w0 != z) {
            if (z) {
                this.f35509a.m2930B4().m4735W1().m4373c(this);
            } else {
                this.f35509a.m2930B4().m4735W1().m4359q(this);
            }
            this.f35534w0 = z;
        }
        this.f35509a.m2930B4().m4735W1().m4363n(this.f35509a, this.f35521j0.isEmpty() ? null : new ArrayList<>(this.f35521j0));
        this.f35509a.m2647T2(i);
    }

    public final void m1674X1(boolean z) {
        synchronized (this.f35533v0) {
            if (this.f35530s0 != z) {
                this.f35530s0 = z;
                Log.m14719i("accountId:%d refreshNeeded -> %b", Integer.valueOf(this.f35509a.m2188w6()), Boolean.valueOf(z));
                m1689T();
            }
        }
    }

    public final void m1673Y(AbstractC11066g gVar) {
        this.f35512b0.remove(gVar);
    }

    public final void m1672Y0(long j, TdApi.UserFullInfo userFullInfo) {
        m1707O0(this.f35496N.m21020d(0L), j, userFullInfo);
        m1707O0(this.f35496N.m21020d(Long.valueOf(j)), j, userFullInfo);
    }

    public void m1671Y1(long j) {
        synchronized (this.f35521j0) {
            for (int size = this.f35521j0.size() - 1; size >= 0; size--) {
                TdApi.Message message = this.f35521j0.get(size);
                if (j == 0 || message.chatId == j) {
                    this.f35509a.m2270r4().m14783o(new TdApi.EditMessageLiveLocation(message.chatId, message.f25409id, null, null, 0, 0), this.f35509a.m2214uc());
                }
            }
        }
    }

    public final void m1670Z(AbstractC11067h hVar) {
        this.f35507Y.remove(hVar);
    }

    public final void m1669Z0(TdApi.User user) {
        m1684U0(this.f35496N.m21020d(0L), user);
        m1684U0(this.f35496N.m21020d(Long.valueOf(user.f25442id)), user);
    }

    public void m1668Z1(Object obj) {
        if (obj instanceof AbstractC11068i) {
            m1748E((AbstractC11068i) obj);
        }
        if (obj instanceof AbstractC11069j) {
            m1752D((AbstractC11069j) obj);
        }
        if (obj instanceof AbstractC11061b) {
            m1576x1((AbstractC11061b) obj);
        }
        if (obj instanceof AbstractC11067h) {
            m1762A1((AbstractC11067h) obj);
        }
        if (obj instanceof AbstractC11066g) {
            m1568z1((AbstractC11066g) obj);
        }
        if (obj instanceof AbstractC11062c) {
            m1572y1((AbstractC11062c) obj);
        }
    }

    @Override
    public void mo1411a() {
        m1682V();
    }

    public void m1667a0(AbstractC11068i iVar) {
        m1760B(iVar);
    }

    public final void m1666a1(long j, TdApi.UserStatus userStatus, boolean z) {
        m1663b1(this.f35498P.m21020d(0L), j, userStatus, z);
        m1663b1(this.f35498P.m21020d(Long.valueOf(j)), j, userStatus, z);
        m1663b1(this.f35499Q.m21020d(0L), j, userStatus, z);
        m1663b1(this.f35499Q.m21020d(Long.valueOf(j)), j, userStatus, z);
    }

    public void m1665a2(int i, AbstractC11062c cVar) {
        m1580w1(i, cVar);
    }

    @Override
    public void mo1409b(boolean z) {
        this.f35509a.m2270r4().m14783o(new TdApi.GetActiveLiveLocationMessages(), this.f35527p0);
    }

    public final void m1664b0(long j, AbstractC11061b bVar) {
        this.f35504V.m21017g(Long.valueOf(j), bVar);
    }

    public void m1662b2(long j, AbstractC11061b bVar) {
        m1750D1(j, bVar);
    }

    @Override
    public void mo1661b3(ArrayList<C10930q6> arrayList, ArrayList<ArrayList<TdApi.Message>> arrayList2) {
        synchronized (this.f35521j0) {
            if (!this.f35521j0.isEmpty()) {
                arrayList.add(this.f35509a);
                arrayList2.add(new ArrayList<>(this.f35521j0));
            }
        }
    }

    @Override
    public void mo1407c() {
        this.f35526o0.removeCallbacksAndMessages(null);
        this.f35509a.m2270r4().m14783o(new TdApi.GetActiveLiveLocationMessages(), this.f35527p0);
    }

    public void m1660c0(long j, long[] jArr) {
        synchronized (this.f35521j0) {
            if (!this.f35521j0.isEmpty()) {
                int i = 0;
                for (int size = this.f35521j0.size() - 1; size >= 0; size--) {
                    TdApi.Message message = this.f35521j0.get(size);
                    if (message.chatId == j && C5062b.m24154s(jArr, message.f25409id) != -1) {
                        this.f35509a.m2692Q2(message);
                        this.f35521j0.remove(size);
                        i++;
                    }
                }
                if (i > 0) {
                    m1675X0(i);
                }
            }
        }
    }

    public void m1659c1(int i, int i2) {
        m1723K0(this.f35517f0.iterator(), i, i2, true);
        m1723K0(this.f35518g0.m21020d(Integer.valueOf(i)), i, i2, true);
    }

    public void m1658c2(int i, AbstractC11066g gVar) {
        m1742F1(i, gVar);
    }

    public final void m1656d0(int i, AbstractC11066g gVar) {
        this.f35514c0.m21017g(Integer.valueOf(i), gVar);
    }

    public void m1655d1(int i, int i2) {
        if (i2 == 3) {
            m1723K0(this.f35517f0.iterator(), i, i2, false);
            m1723K0(this.f35518g0.m21020d(Integer.valueOf(i)), i, i2, false);
        }
    }

    public void m1654d2(long j, AbstractC11067h hVar) {
        m1730I1(j, hVar);
    }

    public final void m1652e0(long j, AbstractC11067h hVar) {
        this.f35508Z.m21017g(Long.valueOf(j), hVar);
    }

    public void m1651e1(long j, TdApi.ChatMember chatMember) {
        Iterator<AbstractC11063d> it = this.f35519h0.iterator();
        while (it.hasNext()) {
            it.next().mo1560u2(j, chatMember);
        }
        Iterator<AbstractC11063d> d = this.f35520i0.m21020d(Long.valueOf(j));
        if (d != null) {
            while (d.hasNext()) {
                d.next().mo1560u2(j, chatMember);
            }
        }
    }

    public void m1650e2(long j, AbstractC11069j jVar) {
        if (j == 0) {
            throw new IllegalArgumentException("userId == " + j);
        } else if (jVar.mo1350D3()) {
            this.f35498P.m21022b(Long.valueOf(j), jVar);
        } else {
            this.f35499Q.m21022b(Long.valueOf(j), jVar);
        }
    }

    public TdApi.Message m1648f0(long j) {
        synchronized (this.f35521j0) {
            Iterator<TdApi.Message> it = this.f35521j0.iterator();
            while (it.hasNext()) {
                TdApi.Message next = it.next();
                if (next.chatId == j) {
                    return next;
                }
            }
            return null;
        }
    }

    public final void m1647f1(TdApi.Message message) {
        synchronized (this.f35521j0) {
            if (this.f35521j0.indexOf(message) != -1) {
                this.f35509a.m2930B4().m4735W1().m4361o(this.f35509a, message);
            }
        }
    }

    public <T extends AbstractC11068i & AbstractC11069j> void m1646f2(long j, T t) {
        m1744F(j, t);
        m1650e2(j, t);
    }

    public TdApi.Call m1644g0(int i) {
        TdApi.Call e;
        synchronized (this.f35528q0) {
            e = this.f35515d0.m21472e(i);
        }
        return e;
    }

    public void m1643g1(TdApi.Message message) {
        synchronized (this.f35521j0) {
            int indexOf = this.f35521j0.indexOf(message);
            if (indexOf != -1) {
                this.f35521j0.remove(indexOf);
                m1675X0(-1);
            }
        }
    }

    public <T extends AbstractC11068i & AbstractC11069j> void m1642g2(long[] jArr, T t) {
        for (long j : jArr) {
            m1744F(j, t);
            m1650e2(j, t);
        }
    }

    @Override
    public void mo1641h(int i) {
        m1677W1(i != 0);
    }

    public CallSettings m1640h0(int i) {
        CallSettings e;
        synchronized (this.f35528q0) {
            e = this.f35516e0.m21472e(i);
        }
        return e;
    }

    public void m1639h1(TdApi.UpdateBasicGroup updateBasicGroup) {
        boolean z;
        boolean z2;
        long j;
        synchronized (this.f35528q0) {
            TdApi.BasicGroup basicGroup = updateBasicGroup.basicGroup;
            TdApi.BasicGroup basicGroup2 = this.f35501S.get(Long.valueOf(basicGroup.f25366id));
            this.f35501S.put(Long.valueOf(basicGroup.f25366id), basicGroup);
            z = true;
            z2 = basicGroup2 != null;
            j = (!z2 || basicGroup2.upgradedToSupergroupId != 0) ? 0L : basicGroup.upgradedToSupergroupId;
        }
        if (z2) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            m1703P0(this.f35503U.iterator(), updateBasicGroup.basicGroup, i != 0);
            Iterator<AbstractC11061b> d = this.f35504V.m21020d(Long.valueOf(updateBasicGroup.basicGroup.f25366id));
            TdApi.BasicGroup basicGroup3 = updateBasicGroup.basicGroup;
            if (i == 0) {
                z = false;
            }
            m1703P0(d, basicGroup3, z);
        }
    }

    public TdApi.Supergroup m1638h2(long j) {
        TdApi.Supergroup supergroup;
        synchronized (this.f35528q0) {
            supergroup = this.f35505W.get(Long.valueOf(j));
        }
        return supergroup;
    }

    public void m1636i0(final AbstractC5918j<TdApi.HttpUrl> jVar) {
        TdApi.HttpUrl httpUrl = this.f35529r0;
        if (httpUrl == null) {
            final C11060a aVar = new C11060a(jVar);
            this.f35509a.m2270r4().m14783o(new TdApi.GetApplicationDownloadLink(), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    C11059v7.this.m1597s0(jVar, aVar, object);
                }
            });
            if (this.f35509a.m2930B4().m4694g3().m28144k()) {
                C1379j0.m37335e0(aVar, 800L);
            } else {
                aVar.run();
            }
        } else if (jVar != null) {
            jVar.mo1330a(httpUrl);
        }
    }

    public void m1635i1(TdApi.UpdateBasicGroupFullInfo updateBasicGroupFullInfo) {
        boolean C1;
        synchronized (this.f35528q0) {
            C1 = m1754C1(updateBasicGroupFullInfo.basicGroupId, updateBasicGroupFullInfo.basicGroupFullInfo);
        }
        if (C1) {
            m1715M0(this.f35503U.iterator(), updateBasicGroupFullInfo.basicGroupId, updateBasicGroupFullInfo.basicGroupFullInfo);
            m1715M0(this.f35504V.m21020d(Long.valueOf(updateBasicGroupFullInfo.basicGroupId)), updateBasicGroupFullInfo.basicGroupId, updateBasicGroupFullInfo.basicGroupFullInfo);
        }
    }

    public TdApi.SupergroupFullInfo m1634i2(long j) {
        return m1630j2(j, true);
    }

    public void m1632j0(final AbstractC5918j<TdApi.Text> jVar) {
        m1636i0(new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                C11059v7.m1593t0(AbstractC5918j.this, (TdApi.HttpUrl) obj);
            }
        });
    }

    public void m1631j1(TdApi.UpdateCall updateCall) {
        char c;
        TdApi.Call call = updateCall.call;
        synchronized (this.f35528q0) {
            c = 0;
            boolean z = !C4779t2.m25563Z2(this.f35515d0.m21472e(call.f25367id));
            this.f35515d0.m21467j(call.f25367id, call);
            boolean z2 = !C4779t2.m25563Z2(call);
            if (z != z2) {
                c = z2 ? (char) 1 : (char) 65535;
            }
        }
        m1696R0(this.f35517f0.iterator(), call);
        m1696R0(this.f35518g0.m21020d(Integer.valueOf(call.f25367id)), call);
        this.f35509a.m2930B4().m4716b1().m1542m(this.f35509a, call);
        if (c == 1) {
            this.f35509a.m2944A6();
        } else if (c == 65535) {
            this.f35509a.m2882E4();
        }
    }

    public TdApi.SupergroupFullInfo m1630j2(final long j, boolean z) {
        TdApi.SupergroupFullInfo supergroupFullInfo;
        synchronized (this.f35528q0) {
            Long valueOf = Long.valueOf(j);
            supergroupFullInfo = this.f35506X.get(valueOf);
            if (supergroupFullInfo == null || z) {
                if (this.f35505W.get(valueOf) != null) {
                    this.f35509a.m2270r4().m14783o(new TdApi.GetSupergroupFullInfo(j), this.f35524m0);
                } else {
                    this.f35509a.m2270r4().m14783o(new TdApi.GetSupergroup(j), new Client.AbstractC7865g() {
                        @Override
                        public final void mo255t2(TdApi.Object object) {
                            C11059v7.this.m1763A0(j, object);
                        }
                    });
                }
            }
        }
        return supergroupFullInfo;
    }

    public boolean m1628k0() {
        boolean z;
        synchronized (this.f35521j0) {
            z = !this.f35521j0.isEmpty();
        }
        return z;
    }

    public void m1627k2(final long j, final AbstractC5918j<TdApi.SupergroupFullInfo> jVar) {
        if (j != 0) {
            TdApi.SupergroupFullInfo i2 = m1634i2(j);
            if (jVar != null) {
                if (i2 != null) {
                    jVar.mo1330a(i2);
                } else {
                    this.f35509a.m2270r4().m14783o(new TdApi.GetSupergroupFullInfo(j), new Client.AbstractC7865g() {
                        @Override
                        public final void mo255t2(TdApi.Object object) {
                            C11059v7.this.m1751D0(jVar, j, object);
                        }
                    });
                }
            }
        } else if (jVar != null) {
            jVar.mo1330a(null);
        }
    }

    public final int m1625l0(long j, long j2) {
        Iterator<TdApi.Message> it = this.f35521j0.iterator();
        int i = 0;
        while (it.hasNext()) {
            TdApi.Message next = it.next();
            if (next.chatId == j && next.f25409id == j2) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void m1624l1(int i, CallSettings callSettings) {
        synchronized (this.f35528q0) {
            this.f35516e0.m21467j(i, callSettings);
        }
        m1719L0(this.f35517f0.iterator(), i, callSettings);
        m1719L0(this.f35518g0.m21020d(Integer.valueOf(i)), i, callSettings);
        this.f35509a.m2930B4().m4716b1().m1543l(this.f35509a, i, callSettings);
    }

    public TdApi.Supergroup m1623l2(long j) {
        TdApi.Supergroup supergroup;
        if (j != 0) {
            synchronized (this.f35528q0) {
                supergroup = this.f35505W.get(Long.valueOf(j));
                if (supergroup == null) {
                    throw new IllegalStateException("id:" + j);
                }
            }
            return supergroup;
        }
        throw new IllegalArgumentException();
    }

    public boolean m1621m0(long j) {
        if (j == 0) {
            return false;
        }
        boolean z = true;
        if (j == this.f35511b) {
            return true;
        }
        synchronized (this.f35528q0) {
            if (j != this.f35511b) {
                z = C4779t2.m25444q3(this.f35513c.get(Long.valueOf(j)));
            }
        }
        return z;
    }

    public void m1620m1(String str) {
        if (this.f35511b != 0) {
            m1681V0(this.f35500R.iterator(), str);
        }
    }

    public void m1619m2(Object obj) {
        if (obj instanceof AbstractC11068i) {
            m1760B((AbstractC11068i) obj);
        }
        if (obj instanceof AbstractC11069j) {
            m1764A((AbstractC11069j) obj);
        }
        if (obj instanceof AbstractC11061b) {
            m1679W((AbstractC11061b) obj);
        }
        if (obj instanceof AbstractC11067h) {
            m1670Z((AbstractC11067h) obj);
        }
        if (obj instanceof AbstractC11066g) {
            m1673Y((AbstractC11066g) obj);
        }
        if (obj instanceof AbstractC11062c) {
            m1676X((AbstractC11062c) obj);
        }
    }

    public void m1616n1(long j) {
        synchronized (this.f35528q0) {
            if (this.f35511b != j) {
                this.f35511b = j;
                int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                TdApi.User user = i != 0 ? this.f35513c.get(Long.valueOf(j)) : null;
                if (i == 0) {
                    m1678W0(this.f35500R.iterator(), null);
                    this.f35509a.m2585X4(null);
                } else if (user != null) {
                    m1678W0(this.f35500R.iterator(), user);
                    this.f35509a.m2585X4(user);
                } else if (!this.f35522k0) {
                    this.f35522k0 = true;
                    this.f35509a.m2270r4().m14783o(new TdApi.GetMe(), this.f35523l0);
                }
                if (user != null) {
                    this.f35509a.m2930B4().m4672m2(this.f35509a.m2188w6(), user, true);
                }
            }
        }
    }

    public void m1615n2(int i, AbstractC11062c cVar) {
        m1580w1(i, cVar);
    }

    public void m1612o1(TdApi.UpdateSecretChat updateSecretChat) {
        boolean E1;
        TdApi.SecretChat secretChat = updateSecretChat.secretChat;
        synchronized (this.f35528q0) {
            E1 = m1746E1(secretChat);
        }
        if (E1) {
            m1692S0(this.f35512b0.iterator(), secretChat);
            m1692S0(this.f35514c0.m21020d(Integer.valueOf(secretChat.f25422id)), secretChat);
        }
    }

    public void m1611o2(long j, AbstractC11061b bVar) {
        m1664b0(j, bVar);
    }

    public void m1608p1(TdApi.UpdateSupergroup updateSupergroup, TdApi.Chat chat) {
        int G1;
        TdApi.Supergroup supergroup = updateSupergroup.supergroup;
        synchronized (this.f35528q0) {
            G1 = m1738G1(supergroup);
        }
        if (G1 != 0) {
            m1688T0(this.f35507Y.iterator(), supergroup);
            m1688T0(this.f35508Z.m21020d(Long.valueOf(supergroup.f25428id)), supergroup);
        }
        if (Build.VERSION.SDK_INT >= 26 && G1 == 2 && chat != null) {
            C10639eb.m4382v(this.f35509a, this.f35511b, chat);
        }
    }

    public void m1607p2(int i, AbstractC11066g gVar) {
        m1656d0(i, gVar);
    }

    public void m1604q1(TdApi.UpdateSupergroupFullInfo updateSupergroupFullInfo) {
        boolean H1;
        long j = updateSupergroupFullInfo.supergroupId;
        TdApi.SupergroupFullInfo supergroupFullInfo = updateSupergroupFullInfo.supergroupFullInfo;
        synchronized (this.f35528q0) {
            H1 = m1734H1(j, supergroupFullInfo);
        }
        if (H1) {
            m1711N0(this.f35507Y.iterator(), j, supergroupFullInfo);
            m1711N0(this.f35508Z.m21020d(Long.valueOf(j)), j, supergroupFullInfo);
        }
    }

    public void m1603q2(long j, AbstractC11067h hVar) {
        m1652e0(j, hVar);
    }

    public void m1600r1(TdApi.UpdateUser updateUser) {
        boolean z;
        boolean z2;
        TdApi.User user = updateUser.user;
        synchronized (this.f35528q0) {
            TdApi.User user2 = this.f35513c.get(Long.valueOf(user.f25442id));
            z = user2 != null;
            if (z) {
                z2 = !C7321e.m16936k0(user2.status, user.status);
                C7321e.m16910t(user, user2);
                synchronized (this.f35533v0) {
                    user2.status = user.status;
                }
                user = user2;
            } else {
                this.f35513c.put(Long.valueOf(user.f25442id), user);
                z2 = false;
            }
        }
        m1669Z0(user);
        boolean z3 = user.f25442id == this.f35511b;
        if (z3) {
            m1678W0(this.f35500R.iterator(), user);
            this.f35509a.m2585X4(user);
            this.f35509a.m2440ga().m3226E1(user);
        }
        if (z2) {
            m1592t1(new TdApi.UpdateUserStatus(user.f25442id, user.status));
        } else {
            synchronized (this.f35533v0) {
                m1685U(user, user.status, false);
            }
        }
        if (z3) {
            if (Build.VERSION.SDK_INT >= 26) {
                C10639eb.m4381w(user);
            }
            this.f35509a.m2930B4().m4672m2(this.f35509a.m2188w6(), user, true ^ z);
        }
    }

    public void m1599r2(long j, AbstractC11069j jVar) {
        if (j == 0) {
            throw new IllegalArgumentException("userId == " + j);
        } else if (jVar.mo1350D3()) {
            this.f35498P.m21017g(Long.valueOf(j), jVar);
        } else {
            this.f35499Q.m21017g(Long.valueOf(j), jVar);
        }
    }

    public void m1596s1(final TdApi.UpdateUserFullInfo updateUserFullInfo) {
        boolean J1;
        synchronized (this.f35528q0) {
            J1 = m1726J1(updateUserFullInfo.userId, updateUserFullInfo.userFullInfo);
        }
        if (J1) {
            m1672Y0(updateUserFullInfo.userId, updateUserFullInfo.userFullInfo);
        }
        if (this.f35511b != 0 && updateUserFullInfo.userId == this.f35511b) {
            this.f35509a.m2469ed(new Runnable() {
                @Override
                public final void run() {
                    C11059v7.this.m1569z0(updateUserFullInfo);
                }
            });
        }
    }

    public <T extends AbstractC11068i & AbstractC11069j> void m1595s2(long j, T t) {
        m1756C(j, t);
        m1599r2(j, t);
    }

    public void m1592t1(TdApi.UpdateUserStatus updateUserStatus) {
        synchronized (this.f35528q0) {
            TdApi.User user = this.f35513c.get(Long.valueOf(updateUserStatus.userId));
            if (user != null) {
                synchronized (this.f35533v0) {
                    user.status = updateUserStatus.status;
                }
                this.f35509a.m2645T4(updateUserStatus, false);
            }
        }
    }

    public <T extends AbstractC11068i & AbstractC11069j> void m1591t2(long[] jArr, T t) {
        for (long j : jArr) {
            m1756C(j, t);
            m1599r2(j, t);
        }
    }

    public void m1588u1(TdApi.UpdateUserStatus updateUserStatus, boolean z) {
        synchronized (this.f35528q0) {
            TdApi.User user = this.f35513c.get(Long.valueOf(updateUserStatus.userId));
            if (user != null) {
                m1666a1(updateUserStatus.userId, user.status, z);
                synchronized (this.f35533v0) {
                    m1685U(user, user.status, false);
                }
            }
        }
    }

    public void m1587u2(long j, long j2, TdApi.MessageLocation messageLocation) {
        if (messageLocation.livePeriod != 0) {
            synchronized (this.f35521j0) {
                if (!this.f35521j0.isEmpty()) {
                    int l0 = m1625l0(j, j2);
                    if (l0 != -1) {
                        TdApi.Message message = this.f35521j0.get(l0);
                        message.content = messageLocation;
                        boolean z = messageLocation.expiresIn == 0;
                        this.f35509a.m2692Q2(message);
                        if (z) {
                            this.f35521j0.remove(l0);
                            m1675X0(-1);
                        } else {
                            this.f35509a.m2503cb(message);
                        }
                    }
                }
            }
        }
    }

    public final void m1584v1(long j, int i, TdApi.User user) {
        if (user != null) {
            synchronized (this.f35533v0) {
                TdApi.UserStatus userStatus = user.status;
                if (userStatus != null) {
                    if (userStatus.getConstructor() == -759984891) {
                        if (((TdApi.UserStatusOffline) user.status).wasOnline == i) {
                            this.f35525n0.m23257c(j);
                            m1666a1(j, user.status, true);
                            synchronized (this.f35533v0) {
                                m1685U(user, user.status, false);
                            }
                        }
                    }
                }
            }
        }
    }

    public TdApi.User m1583v2(long j) {
        TdApi.User user;
        if (j == 0) {
            Log.bug("getUser for userId=0", new Object[0]);
            return null;
        }
        synchronized (this.f35528q0) {
            user = this.f35513c.get(Long.valueOf(j));
            if (user == null) {
                Log.bug("updateUser missing for userId:%d", Long.valueOf(j));
            }
        }
        return user;
    }

    public final void m1580w1(int i, AbstractC11062c cVar) {
        this.f35518g0.m21022b(Integer.valueOf(i), cVar);
    }

    public C6246h m1579w2(long j) {
        TdApi.ProfilePhoto profilePhoto;
        if (j == 0) {
            return null;
        }
        TdApi.User v2 = m1583v2(j);
        if (v2 != null) {
            profilePhoto = v2.profilePhoto;
        } else {
            profilePhoto = null;
        }
        if (profilePhoto == null) {
            return null;
        }
        C6246h hVar = new C6246h(this.f35509a, profilePhoto.small);
        hVar.mo20768t0(C9903a.getDefaultAvatarCacheSize());
        return hVar;
    }

    public final void m1576x1(AbstractC11061b bVar) {
        this.f35503U.add(bVar);
    }

    public int m1575x2(long j) {
        return m1571y2(j != 0 ? m1583v2(j) : null);
    }

    public final void m1572y1(AbstractC11062c cVar) {
        this.f35517f0.add(cVar);
    }

    public int m1571y2(TdApi.User user) {
        return C4779t2.m25682H0((user == null || C4779t2.m25672I3(user)) ? -1L : user.f25442id, this.f35511b);
    }

    public final void m1568z1(AbstractC11066g gVar) {
        this.f35512b0.add(gVar);
    }

    public boolean m1567z2(long j) {
        return j != 0 && C4779t2.m25659K2(m1583v2(j));
    }
}
