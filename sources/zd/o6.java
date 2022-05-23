package zd;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import ce.c0;
import ce.j0;
import hd.b;
import hd.s4;
import hd.t2;
import he.i;
import ie.a1;
import ie.c1;
import ie.t;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import jd.w;
import kb.j;
import kb.k;
import oc.v0;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.drinkmore.Tracer;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.b;
import org.thunderdog.challegram.loader.ImageLoader;
import org.thunderdog.challegram.loader.gif.GifBridge;
import org.thunderdog.challegram.sync.SyncHelper;
import ud.v4;
import zd.o6;

public class o6 implements tb, i.q {
    public long A1;
    public long B1;
    public boolean C1;
    public boolean D1;
    public boolean E1;
    public boolean F1;
    public boolean G0;
    public int G1;
    public boolean H0;
    public kb.i H1;
    public boolean I0;
    public boolean I1;
    public boolean J0;
    public TdApi.AuthorizationState J1;
    public String K0;
    public boolean K1;
    public String[] L0;
    public boolean L1;
    public TdApi.Reaction[] M0;
    public String M1;
    public String N1;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public boolean S0;
    public final Comparator<TdApi.User> T;
    public boolean T0;
    public final Comparator<a1> U;
    public o[] U0;
    public final ya V;
    public long V0;
    public Map<String, Queue<Runnable>> V1;
    public final int W;
    public long W0;
    public p W1;
    public k X;
    public String X1;
    public boolean Y0;
    public String Y1;
    public final Object Z;
    public TdApi.NetworkType Z1;
    public boolean f28047a2;
    public hj f28048b;
    public boolean f28051b2;
    public String f28054c1;
    public boolean f28055c2;
    public String f28057d1;
    public boolean f28058d2;
    public TdApi.LanguagePackInfo f28060e1;
    public long f28061e2;
    public String f28063f1;
    public boolean f28064f2;
    public final t7 f28068h0;
    public String f28069h1;
    public TdApi.ChatFilterInfo[] f28070h2;
    public final s9 f28071i0;
    public String f28072i1;
    public final h9 f28074j0;
    public boolean f28076j2;
    public final ic f28077k0;
    public final w8 f28080l0;
    public final vb f28083m0;
    public TdApi.ProfilePhoto f28085m2;
    public final gc f28086n0;
    public boolean f28088n2;
    public final qj f28089o0;
    public boolean f28091o2;
    public final jb f28092p0;
    public final w f28095q0;
    public int f28108u1;
    public boolean f28110v0;
    public int[] f28111v1;
    public int f28113w1;
    public boolean f28115x1;
    public boolean f28117y1;
    public static final long f28039v2 = ob.a.b(1112283549);
    public static final long f28040w2 = ob.a.b(1336679475);
    public static final long f28041x2 = ob.a.b(1136101327);
    public static final long f28042y2 = ob.a.b(1247387696);
    public static final long f28043z2 = ob.a.b(1140222267);
    public static int A2 = -1;
    public static int B2 = -2;
    public final Object f28044a = new Object();
    public final Client.g M = o2.f28034a;
    public final Client.g N = new Client.g() {
        @Override
        public final void r2(TdApi.Object object) {
            o6.this.A8(object);
        }
    };
    public final Client.g O = new Client.g() {
        @Override
        public final void r2(TdApi.Object object) {
            o6.this.H8(object);
        }
    };
    public final Client.g P = n2.f27992a;
    public final Client.g Q = r2.f28317a;
    public final Client.g R = new Client.g() {
        @Override
        public final void r2(TdApi.Object object) {
            o6.this.K8(object);
        }
    };
    public final Client.g S = p2.f28212a;
    public int Y = -1;
    public final Object f28045a0 = new Object();
    public final HashMap<Long, TdApi.Chat> f28049b0 = new HashMap<>();
    public final HashMap<String, e8> f28053c0 = new HashMap<>();
    public final q f28056d0 = new q(0, "AnimatedTgxEmojies", false);
    public final q f28059e0 = new q(2, "BetterDice", true);
    public final HashSet<Long> f28062f0 = new HashSet<>();
    public final HashMap<Long, Integer> f28065g0 = new HashMap<>();
    public final HashSet<Long> f28098r0 = new HashSet<>();
    public final jb.h f28101s0 = new jb.h();
    public long f28104t0 = 0;
    public int f28107u0 = 100000;
    public int f28112w0 = 10000;
    public long f28114x0 = 1000;
    public long f28116y0 = 64;
    public long f28118z0 = 12582912;
    public long A0 = 384;
    public int B0 = 100;
    public int C0 = 200;
    public int D0 = 5;
    public int E0 = 100;
    public double F0 = 0.75d;
    public boolean N0 = true;
    public int X0 = -1;
    public String Z0 = "gif";
    public String f28046a1 = "foursquare";
    public String f28050b1 = "pic";
    public long f28066g1 = SystemClock.uptimeMillis();
    public long f28075j1 = 30000;
    public long f28078k1 = 10000;
    public long f28081l1 = 1271266957;
    public long f28084m1 = 777000;
    public final Map<String, z8> f28087n1 = new HashMap();
    public final x6 f28090o1 = new x6();
    public final x6 f28093p1 = new x6();
    public int f28096q1 = Log.TAG_CAMERA;
    public int f28099r1 = 4000;
    public int f28102s1 = 200;
    public boolean f28105t1 = false;
    public final AtomicInteger f28119z1 = new AtomicInteger(0);
    public final HashMap<String, l> O1 = new HashMap<>();
    public final HashMap<Long, l> P1 = new HashMap<>();
    public final k0.e<ArrayList<v4<?>>> Q1 = new k0.e<>(8);
    public final jb.g R1 = new jb.g();
    public final Object S1 = new Object();
    public final HashMap<String, TdApi.MessageContent> T1 = new HashMap<>();
    public final HashMap<String, TdApi.FormattedText> U1 = new HashMap<>();
    public final Set<String> f28067g2 = new HashSet();
    public final k0.h<TdApi.Call> f28073i2 = new k0.h<>();
    public final List<TdApi.SuggestedAction> f28079k2 = new ArrayList();
    public final Map<String, TdApi.ChatTheme> f28082l2 = new HashMap();
    public final nb.e f28094p2 = new nb.e(new kb.f() {
        @Override
        public final boolean get() {
            boolean B8;
            B8 = o6.this.B8();
            return B8;
        }
    }).c(new Runnable() {
        @Override
        public final void run() {
            o6.this.ra();
        }
    }, new Runnable() {
        @Override
        public final void run() {
            o6.this.sa();
        }
    });
    public final nb.e f28097q2 = new nb.e(new kb.f() {
        @Override
        public final boolean get() {
            boolean C8;
            C8 = o6.this.C8();
            return C8;
        }
    }).c(new Runnable() {
        @Override
        public final void run() {
            o6.this.ra();
        }
    }, new Runnable() {
        @Override
        public final void run() {
            o6.this.sa();
        }
    });
    public final nb.e f28100r2 = new nb.e(new kb.f() {
        @Override
        public final boolean get() {
            boolean D8;
            D8 = o6.this.D8();
            return D8;
        }
    }).c(new Runnable() {
        @Override
        public final void run() {
            o6.this.ra();
        }
    }, new Runnable() {
        @Override
        public final void run() {
            o6.this.sa();
        }
    });
    public final nb.e f28103s2 = new nb.e(new kb.f() {
        @Override
        public final boolean get() {
            boolean E8;
            E8 = o6.this.E8();
            return E8;
        }
    }).c(new Runnable() {
        @Override
        public final void run() {
            o6.this.ra();
        }
    }, new Runnable() {
        @Override
        public final void run() {
            o6.this.sa();
        }
    });
    public final nb.e f28106t2 = new nb.e(h4.f27602a);
    public final nb.e f28109u2 = new nb.e(new kb.f() {
        @Override
        public final boolean get() {
            boolean G8;
            G8 = o6.this.G8();
            return G8;
        }
    });
    public final TdApi.TdlibParameters f28052c = new TdApi.TdlibParameters(false, null, null, true, true, true, true, 21724, "3e0cb5efcd52300aec5994fdfc5bdc16", null, null, null, "0.24.8.1519-arm64-v8a", false, false);

    public class a extends kb.b {
        public final AtomicBoolean M;
        public final TdApi.Message N;
        public final boolean O;
        public final kb.j P;

        public a(AtomicBoolean atomicBoolean, TdApi.Message message, boolean z10, kb.j jVar) {
            this.M = atomicBoolean;
            this.N = message;
            this.O = z10;
            this.P = jVar;
        }

        @Override
        public void b() {
            boolean z10;
            String str;
            synchronized (this.M) {
                if (!this.M.get()) {
                    String j42 = o6.this.j4(this.N.chatId);
                    if (!ib.i.i(j42)) {
                        z10 = false;
                        str = o6.this.Sc(j42, ob.d.i(this.N.f19946id));
                        if (!this.O && this.N.mediaAlbumId != 0) {
                            str = str + "?single";
                        }
                    } else {
                        long p10 = ob.a.p(this.N.chatId);
                        str = p10 != 0 ? o6.this.Tc(p10, ob.d.i(this.N.f19946id)) : null;
                        z10 = true;
                    }
                    if (!ib.i.i(str) && !this.M.getAndSet(true)) {
                        this.P.a(new m(str, z10));
                    }
                }
            }
        }
    }

    public class b implements Client.g {
        public final Client.g f28120a;
        public final long f28121b;

        public b(Client.g gVar, long j10) {
            this.f28120a = gVar;
            this.f28121b = j10;
        }

        @Override
        public void r2(TdApi.Object object) {
            TdApi.ChatInviteLink chatInviteLink;
            switch (object.getConstructor()) {
                case TdApi.Error.CONSTRUCTOR:
                case TdApi.ChatInviteLink.CONSTRUCTOR:
                    this.f28120a.r2(object);
                    return;
                case TdApi.SupergroupFullInfo.CONSTRUCTOR:
                    chatInviteLink = ((TdApi.SupergroupFullInfo) object).inviteLink;
                    break;
                case TdApi.BasicGroupFullInfo.CONSTRUCTOR:
                    chatInviteLink = ((TdApi.BasicGroupFullInfo) object).inviteLink;
                    break;
                default:
                    Log.unexpectedTdlibResponse(object, TdApi.ReplacePrimaryChatInviteLink.class, TdApi.ChatInviteLink.class);
                    return;
            }
            if (chatInviteLink != null) {
                this.f28120a.r2(chatInviteLink);
            } else {
                o6.this.v4().o(new TdApi.ReplacePrimaryChatInviteLink(this.f28121b), this);
            }
        }
    }

    public class c implements Client.g {
        public final TdApi.ChatMemberStatus M;
        public final AtomicReference N;
        public final AtomicInteger O;
        public final i P;
        public final AtomicBoolean f28123a;
        public final long f28124b;
        public final TdApi.MessageSender f28125c;

        public c(AtomicBoolean atomicBoolean, long j10, TdApi.MessageSender messageSender, TdApi.ChatMemberStatus chatMemberStatus, AtomicReference atomicReference, AtomicInteger atomicInteger, i iVar) {
            this.f28123a = atomicBoolean;
            this.f28124b = j10;
            this.f28125c = messageSender;
            this.M = chatMemberStatus;
            this.N = atomicReference;
            this.O = atomicInteger;
            this.P = iVar;
        }

        @Override
        public void r2(TdApi.Object object) {
            int constructor = object.getConstructor();
            boolean z10 = false;
            if (constructor == -1679978726) {
                TdApi.Error error = (TdApi.Error) this.N.getAndSet((TdApi.Error) object);
                if (error == null) {
                    o6.this.v4().o(new TdApi.GetChatMember(this.f28124b, this.f28125c), this);
                    return;
                }
                i iVar = this.P;
                if (iVar != null) {
                    iVar.a(false, error);
                } else {
                    j0.t0(error);
                }
            } else if (constructor == -722616727) {
                AtomicBoolean atomicBoolean = this.f28123a;
                if (atomicBoolean == null || atomicBoolean.getAndSet(true)) {
                    o6.this.v4().o(new TdApi.GetChatMember(this.f28124b, this.f28125c), this);
                } else {
                    o6.this.v4().o(new TdApi.SetChatMemberStatus(this.f28124b, this.f28125c, this.M), this);
                }
            } else if (constructor == 1829953909) {
                TdApi.ChatMember chatMember = (TdApi.ChatMember) object;
                if (this.N.get() != null || ob.e.F(this.M, chatMember.status) || this.O.incrementAndGet() > 3) {
                    o6.this.e2().d1(this.f28124b, chatMember);
                    if (this.P != null) {
                        TdApi.Error error2 = (TdApi.Error) this.N.get();
                        i iVar2 = this.P;
                        if (error2 == null) {
                            z10 = true;
                        }
                        iVar2.a(z10, error2);
                        return;
                    }
                    return;
                }
                o6.this.v4().o(new TdApi.SetAlarm((this.O.get() * 0.5d) + 0.5d), this);
            }
        }
    }

    public class d implements Client.g {
        public final AtomicInteger M;
        public final i N;
        public final AtomicReference O;
        public final long f28126a;
        public final TdApi.MessageSender f28127b;
        public final int f28128c;

        public d(long j10, TdApi.MessageSender messageSender, int i10, AtomicInteger atomicInteger, i iVar, AtomicReference atomicReference) {
            this.f28126a = j10;
            this.f28127b = messageSender;
            this.f28128c = i10;
            this.M = atomicInteger;
            this.N = iVar;
            this.O = atomicReference;
        }

        @Override
        public void r2(TdApi.Object object) {
            int constructor = object.getConstructor();
            boolean z10 = false;
            if (constructor == -1679978726) {
                TdApi.Error error = (TdApi.Error) this.O.getAndSet((TdApi.Error) object);
                if (error == null) {
                    o6.this.v4().o(new TdApi.GetChatMember(this.f28126a, this.f28127b), this);
                    return;
                }
                i iVar = this.N;
                if (iVar != null) {
                    iVar.a(false, error);
                } else {
                    j0.t0(error);
                }
            } else if (constructor == -722616727) {
                o6.this.v4().o(new TdApi.GetChatMember(this.f28126a, this.f28127b), this);
            } else if (constructor == 1829953909) {
                TdApi.ChatMember chatMember = (TdApi.ChatMember) object;
                if (chatMember.status.getConstructor() == this.f28128c || this.M.incrementAndGet() > 3) {
                    o6.this.e2().d1(this.f28126a, chatMember);
                    i iVar2 = this.N;
                    if (iVar2 != null) {
                        if (chatMember.status.getConstructor() == this.f28128c) {
                            z10 = true;
                        }
                        iVar2.a(z10, (TdApi.Error) this.O.get());
                        return;
                    }
                    return;
                }
                o6.this.v4().o(new TdApi.SetAlarm((this.M.get() * 0.5d) + 0.5d), this);
            }
        }
    }

    public class e implements Client.g {
        public final TdApi.Function M;
        public final kb.j f28129a;
        public final List f28130b;
        public final boolean f28131c;

        public e(kb.j jVar, List list, boolean z10, TdApi.Function function) {
            this.f28129a = jVar;
            this.f28130b = list;
            this.f28131c = z10;
            this.M = function;
        }

        @Override
        public void r2(TdApi.Object object) {
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                if (this.f28130b.isEmpty()) {
                    j0.t0(object);
                }
                this.f28129a.a(this.f28130b);
            } else if (constructor == -16498159) {
                TdApi.Message[] messageArr = ((TdApi.Messages) object).messages;
                if (messageArr.length == 0) {
                    this.f28129a.a(this.f28130b);
                    return;
                }
                Collections.addAll(this.f28130b, messageArr);
                List list = this.f28130b;
                long j10 = ((TdApi.Message) list.get(list.size() - 1)).f19946id;
                if (this.f28131c) {
                    ((TdApi.SearchChatMessages) this.M).fromMessageId = j10;
                } else {
                    ((TdApi.GetChatHistory) this.M).fromMessageId = j10;
                }
                o6.this.v4().o(this.M, this);
            }
        }
    }

    public static class g {
        public final TdApi.ChatPosition f28135a;
        public final int f28136b;

        public g(TdApi.ChatPosition chatPosition, int i10) {
            this.f28135a = chatPosition;
            this.f28136b = i10;
        }

        public boolean a() {
            return ib.c.h(this.f28136b, 1, false) != 0;
        }

        public boolean b() {
            return ib.c.b(this.f28136b, 1);
        }

        public boolean c() {
            return ib.c.b(this.f28136b, 4);
        }

        public boolean d() {
            return ib.c.b(this.f28136b, 2);
        }
    }

    public static class h {
        public final e8 f28137a;
        public final TdApi.Chat f28138b;
        public final g f28139c;

        public h(e8 e8Var, TdApi.Chat chat, g gVar) {
            this.f28137a = e8Var;
            this.f28138b = chat;
            this.f28139c = gVar;
        }
    }

    public interface i {
        void a(boolean z10, TdApi.Error error);
    }

    public static class j {
        public int f28140a;
        public int f28141b;
        public String f28142c;
        public String f28143d;

        public j(int i10, int i11, String str, String str2) {
            this.f28140a = i10;
            this.f28141b = i11;
            this.f28142c = str;
            this.f28143d = str2;
        }

        public boolean a() {
            return (this.f28141b & 1) == 0;
        }

        public void b(boolean z10) {
            this.f28141b = ib.c.h(this.f28141b, 1, !z10);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(0);
            sb2.append('_');
            sb2.append(this.f28140a);
            sb2.append('_');
            sb2.append(this.f28141b);
            sb2.append('_');
            sb2.append(this.f28142c.length());
            sb2.append('_');
            sb2.append(this.f28142c);
            if (!ib.i.i(this.f28143d)) {
                sb2.append('_');
                sb2.append(this.f28143d.length());
                sb2.append('_');
                sb2.append(this.f28143d);
            }
            return sb2.toString();
        }
    }

    public static final class k implements Client.g, Client.c {
        public static final AtomicInteger V = new AtomicInteger();
        public final ec M;
        public long O;
        public long P;
        public boolean Q;
        public int S;
        public Runnable U;
        public final o6 f28144a;
        public final Client f28145b;
        public final ec f28146c;
        public boolean N = true;
        public final CountDownLatch R = new CountDownLatch(1);
        public final AtomicBoolean T = new AtomicBoolean(false);

        public k(o6 o6Var) {
            Log.i((int) Log.TAG_ACCOUNTS, "Creating client #%d", Integer.valueOf(V.incrementAndGet()));
            this.f28144a = o6Var;
            Client d10 = Client.d(this, this, this, o6Var.f28115x1);
            this.f28145b = d10;
            o6Var.Ae(d10);
            if (o6Var.f28047a2) {
                d10.o(new TdApi.SetOption("online", new TdApi.OptionValueBoolean(true)), o6Var.M);
            }
            o6Var.V.a2(o6Var, d10);
            this.f28146c = new ec(o6Var, "Y2xvdWRfdGd4X2FuZHJvaWRfcmVzb3Vy");
            this.M = new ec(o6Var, "tgx_log");
            if (!o6Var.V.k1()) {
                m();
            }
        }

        public void n(StackTraceElement[] stackTraceElementArr, TdApi.Object object) {
            if (object.getConstructor() == -1679978726) {
                Tracer.i(this.f28144a.A6(), TdApi.SetTdlibParameters.class, (TdApi.Error) object, stackTraceElementArr);
            }
        }

        public void o(long j10, StackTraceElement[] stackTraceElementArr, TdApi.Object object) {
            b.a.c("CheckDatabaseEncryptionKey response in %dms, accountId:%d", Long.valueOf(SystemClock.uptimeMillis() - j10), Integer.valueOf(this.f28144a.W));
            t();
            if (object.getConstructor() == -1679978726) {
                Tracer.i(this.f28144a.A6(), TdApi.CheckDatabaseEncryptionKey.class, (TdApi.Error) object, stackTraceElementArr);
            }
        }

        public void p(TdApi.Object object) {
            TdApi.Proxy[] proxyArr;
            if (object.getConstructor() == 1200447205) {
                for (TdApi.Proxy proxy : ((TdApi.Proxies) object).proxies) {
                    int o10 = he.i.c2().o(proxy.server, proxy.port, proxy.type, null, proxy.isEnabled);
                    if (proxy.isEnabled) {
                        this.f28144a.nc(o10, proxy.server, proxy.port, proxy.type);
                    }
                }
                return;
            }
            int H0 = he.i.c2().H0();
            i.l A1 = he.i.c2().A1(H0);
            if (A1 != null) {
                this.f28144a.nc(H0, A1.f13864b, A1.f13865c, A1.M);
            } else {
                this.f28144a.nc(0, null, 0, null);
            }
        }

        public void r() {
            synchronized (this.T) {
                if (!this.T.get()) {
                    this.f28144a.dc(true);
                }
            }
        }

        public void s(TdApi.Update update) {
            this.f28144a.Na(this, update);
        }

        public long A() {
            if (this.O != 0) {
                return SystemClock.uptimeMillis() - this.O;
            }
            return -1L;
        }

        public long B() {
            return this.P;
        }

        @Override
        public void a(Throwable th) {
            Tracer.j(th);
        }

        public void k() {
            Log.i((int) Log.TAG_ACCOUNTS, "Calling client.close(), accountId:%d", Integer.valueOf(this.f28144a.W));
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f28145b.c();
            Log.i((int) Log.TAG_ACCOUNTS, "client.close() done in %dms, accountId:%d, accountsNum:%d", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis), Integer.valueOf(this.f28144a.W), Integer.valueOf(V.decrementAndGet()));
        }

        public boolean l() {
            boolean z10 = this.Q;
            this.Q = true;
            return z10;
        }

        public void m() {
            TdApi.Function function;
            if (this.O == 0) {
                this.O = SystemClock.uptimeMillis();
                final StackTraceElement[] stackTrace = new RuntimeException().getStackTrace();
                this.f28145b.o(new TdApi.SetTdlibParameters(this.f28144a.f28052c), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        o6.k.this.n(stackTrace, object);
                    }
                });
                final long uptimeMillis = SystemClock.uptimeMillis();
                this.f28145b.o(new TdApi.CheckDatabaseEncryptionKey(), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        o6.k.this.o(uptimeMillis, stackTrace, object);
                    }
                });
                w();
                if (this.f28144a.W != 0 || !he.i.c2().N2()) {
                    function = new TdApi.SetAlarm(0.0d);
                } else {
                    function = new TdApi.GetProxies();
                }
                this.f28145b.o(function, new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        o6.k.this.p(object);
                    }
                });
                this.f28145b.o(new TdApi.GetApplicationConfig(), this.f28144a.N);
            }
        }

        @Override
        public void r2(TdApi.Object object) {
            if (this.N) {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (object instanceof TdApi.Update) {
                    this.f28144a.Na(this, (TdApi.Update) object);
                } else {
                    Log.e("Invalid update type: %s", object);
                }
                if (Log.needMeasureLaunchSpeed()) {
                    long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
                    if (uptimeMillis2 > 100) {
                        Log.e("%s took %dms", object.toString(), Long.valueOf(uptimeMillis2));
                    }
                    this.P += uptimeMillis2;
                    return;
                }
                return;
            }
            Log.w("Ignored update: %s", object);
        }

        public final void t() {
            synchronized (this.T) {
                if (!this.T.getAndSet(true)) {
                    if (this.U != null) {
                        this.f28144a.hd().removeCallbacks(this.U);
                        this.U = null;
                    }
                    this.f28144a.dc(false);
                }
            }
        }

        public void u(Runnable runnable) {
            v(runnable, 0.0d);
        }

        public void v(final Runnable runnable, double d10) {
            this.f28145b.o(new TdApi.SetAlarm(d10), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    runnable.run();
                }
            });
        }

        public final void w() {
            synchronized (this.T) {
                if (!this.T.get() && this.U == null) {
                    this.U = new Runnable() {
                        @Override
                        public final void run() {
                            o6.k.this.r();
                        }
                    };
                    this.f28144a.hd().postDelayed(this.U, 1000L);
                }
            }
        }

        public void x() {
            this.f28145b.o(new TdApi.Close(), this.f28144a.M);
        }

        public void y(final TdApi.Update update, boolean z10) {
            if (z10) {
                this.f28144a.Na(this, update);
            } else {
                u(new Runnable() {
                    @Override
                    public final void run() {
                        o6.k.this.s(update);
                    }
                });
            }
        }

        public void z() {
            this.N = false;
        }
    }

    public static class l {
        public CountDownLatch f28147a;
        public TdApi.File f28148b;
        public String f28149c;
        public long f28150d;
        public boolean f28151e;
        public Runnable f28152f;
    }

    public static class m {
        public final String f28153a;
        public final boolean f28154b;

        public m(String str, boolean z10) {
            this.f28153a = str;
            this.f28154b = z10;
        }

        public String toString() {
            return this.f28153a;
        }
    }

    public static class n {
        public final long f28155a;
        public final int f28156b;
        public final int f28157c;

        public n(long j10, int i10, int i11) {
            this.f28155a = j10;
            this.f28156b = i10;
            this.f28157c = i11;
        }

        public boolean a() {
            int i10 = this.f28156b;
            return (i10 == 1 || i10 == 2) ? false : true;
        }

        public boolean b() {
            return ob.a.l(this.f28155a);
        }
    }

    public static class o {
        public final String f28158a;
        public final int f28159b;
        public final String f28160c;
        public final String f28161d;

        public o(TdApi.JsonValueObject jsonValueObject) {
            Map<String, TdApi.JsonValue> b10 = ob.c.b(jsonValueObject);
            this.f28158a = ob.c.c(b10.get("host"));
            this.f28159b = ob.c.a(b10.get("port"));
            this.f28160c = ob.c.c(b10.get("username"));
            this.f28161d = ob.c.c(b10.get("password"));
        }
    }

    public static class p {
        public final TdApi.Session[] f28162a;
        public final TdApi.Session[] f28163b;
        public final TdApi.Session[] f28164c;
        public final TdApi.Session f28165d;
        public final boolean f28166e;
        public final int f28167f;
        public final int f28168g;
        public final int f28169h;
        public final int f28170i;

        public p(TdApi.Sessions sessions) {
            boolean z10;
            this.f28170i = sessions.inactiveSessionTtlDays;
            ob.e.r1(sessions.sessions);
            HashMap hashMap = new HashMap();
            TdApi.Session[] sessionArr = sessions.sessions;
            int length = sessionArr.length;
            AtomicInteger atomicInteger = null;
            TdApi.Session session = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                z10 = true;
                if (i10 >= length) {
                    break;
                }
                TdApi.Session session2 = sessionArr[i10];
                i11++;
                if (session2.isCurrent) {
                    session = session2;
                } else if (session2.isPasswordPending) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(session2);
                    i10++;
                } else {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(session2);
                }
                String a10 = a(session2);
                AtomicInteger atomicInteger2 = (AtomicInteger) hashMap.get(a10);
                if (atomicInteger2 != null) {
                    atomicInteger2.incrementAndGet();
                } else {
                    hashMap.put(a10, new AtomicInteger(1));
                }
                i12++;
                i10++;
            }
            atomicInteger = session != null ? (AtomicInteger) hashMap.remove(a(session)) : atomicInteger;
            this.f28162a = sessions.sessions;
            this.f28165d = session;
            this.f28168g = atomicInteger != null ? atomicInteger.get() : 1;
            this.f28167f = hashMap.size();
            this.f28169h = i12;
            this.f28166e = i11 != 1 ? false : z10;
            this.f28164c = (arrayList2 == null || arrayList2.isEmpty()) ? new TdApi.Session[0] : (TdApi.Session[]) arrayList2.toArray(new TdApi.Session[0]);
            this.f28163b = (arrayList == null || arrayList.isEmpty()) ? new TdApi.Session[0] : (TdApi.Session[]) arrayList.toArray(new TdApi.Session[0]);
        }

        public static String a(TdApi.Session session) {
            return session.deviceModel + " " + session.platform + " " + session.systemVersion;
        }
    }

    public static class q {
        public final ConcurrentHashMap<String, TdApi.Sticker> f28171a = new ConcurrentHashMap<>();
        public TdApi.StickerSet f28172b;
        public final int f28173c;
        public boolean f28174d;
        public String f28175e;
        public boolean f28176f;

        public q(int i10, String str, boolean z10) {
            this.f28173c = i10;
            this.f28175e = str;
            this.f28176f = z10;
        }

        public void c() {
            this.f28174d = false;
            this.f28171a.clear();
            this.f28172b = null;
        }

        public TdApi.Sticker d(int i10) {
            return this.f28171a.get(id.d.T(i10));
        }

        public TdApi.Sticker e(String str) {
            return this.f28171a.get(id.d.z().h(str));
        }

        public boolean f() {
            return !this.f28171a.isEmpty();
        }

        public void h(final o6 o6Var) {
            if (!this.f28174d && !ib.i.i(this.f28175e)) {
                this.f28174d = true;
                o6Var.Cc(this.f28175e, new kb.j() {
                    @Override
                    public final void a(Object obj) {
                        o6.q.this.g(o6Var, (TdApi.StickerSet) obj);
                    }
                });
            }
        }

        public void g(o6 o6Var, TdApi.StickerSet stickerSet) {
            TdApi.Sticker d10;
            TdApi.Sticker[] stickerArr;
            c();
            this.f28172b = stickerSet;
            if (stickerSet != null) {
                int i10 = 0;
                for (TdApi.Sticker sticker : stickerSet.stickers) {
                    TdApi.Emojis emojis = stickerSet.emojis[i10];
                    if (!this.f28176f || emojis.emojis.length <= 1) {
                        for (String str : emojis.emojis) {
                            String h10 = id.d.z().h(str);
                            if (!this.f28171a.containsKey(h10)) {
                                this.f28171a.put(h10, sticker);
                            }
                        }
                        i10++;
                    }
                }
            }
            o6Var.O9().C(this.f28173c);
            if (!(this.f28173c != 2 || (d10 = d(0)) == null || t2.T2(d10.sticker))) {
                o6Var.m5().p(d10.sticker);
            }
        }

        public void j(o6 o6Var, TdApi.StickerSet stickerSet) {
            TdApi.StickerSet stickerSet2 = this.f28172b;
            if (stickerSet2 != null && stickerSet2.f19963id == stickerSet.f19963id) {
                g(o6Var, stickerSet);
            }
        }
    }

    public interface r {
        void a(long j10, long j11, TdApi.Error error);
    }

    public static final class s {
        public final TdApi.Document f28177a;
        public final int f28178b;
        public final String f28179c;

        public s(TdApi.Document document, int i10, String str) {
            this.f28177a = document;
            this.f28178b = i10;
            this.f28179c = str;
        }
    }

    public o6(w6 w6Var, boolean z10) {
        TdApi.JsonValue d10;
        rj rjVar = new rj(this);
        this.T = rjVar;
        this.U = new xj(rjVar);
        Object obj = new Object();
        this.Z = obj;
        long j10 = 0;
        ya yaVar = w6Var.f28607a;
        this.V = yaVar;
        this.W = w6Var.f28608b;
        this.f28115x1 = z10;
        this.D1 = w6Var.C();
        this.E1 = w6Var.I();
        boolean needMeasureLaunchSpeed = Log.needMeasureLaunchSpeed();
        j10 = needMeasureLaunchSpeed ? SystemClock.uptimeMillis() : j10;
        this.f28071i0 = new s9(this);
        if (needMeasureLaunchSpeed) {
            Log.v("INITIALIZATION: Tdlib.listeners -> %dms", Long.valueOf(SystemClock.uptimeMillis() - j10));
            j10 = SystemClock.uptimeMillis();
        }
        this.f28068h0 = new t7(this);
        if (needMeasureLaunchSpeed) {
            Log.v("INITIALIZATION: Tdlib.cache -> %dms", Long.valueOf(SystemClock.uptimeMillis() - j10));
            j10 = SystemClock.uptimeMillis();
        }
        this.f28074j0 = new h9(this);
        if (needMeasureLaunchSpeed) {
            Log.v("INITIALIZATION: Tdlib.filesManager -> %dms", Long.valueOf(SystemClock.uptimeMillis() - j10));
            j10 = SystemClock.uptimeMillis();
        }
        this.f28077k0 = new ic(this);
        if (needMeasureLaunchSpeed) {
            Log.v("INITIALIZATION: Tdlib.statusManager -> %dms", Long.valueOf(SystemClock.uptimeMillis() - j10));
            j10 = SystemClock.uptimeMillis();
        }
        this.f28080l0 = new w8(this);
        if (needMeasureLaunchSpeed) {
            Log.v("INITIALIZATION: Tdlib.contactManager -> %dms", Long.valueOf(SystemClock.uptimeMillis() - j10));
            j10 = SystemClock.uptimeMillis();
        }
        this.f28083m0 = new vb(this);
        if (needMeasureLaunchSpeed) {
            Log.v("INITIALIZATION: Tdlib.quickAckManager -> %dms", Long.valueOf(SystemClock.uptimeMillis() - j10));
            j10 = SystemClock.uptimeMillis();
        }
        this.f28086n0 = new gc(this);
        if (needMeasureLaunchSpeed) {
            Log.v("INITIALIZATION: Tdlib.settingsManager -> %dms", Long.valueOf(SystemClock.uptimeMillis() - j10));
            j10 = SystemClock.uptimeMillis();
        }
        this.f28089o0 = new qj(this);
        if (needMeasureLaunchSpeed) {
            Log.v("INITIALIZATION: Tdlib.wallpaperManager -> %dms", Long.valueOf(SystemClock.uptimeMillis() - j10));
            j10 = SystemClock.uptimeMillis();
        }
        this.f28092p0 = new jb(this, yaVar.d2());
        if (needMeasureLaunchSpeed) {
            Log.v("INITIALIZATION: Tdlib.notificationManager -> %dms", Long.valueOf(SystemClock.uptimeMillis() - j10));
            j10 = SystemClock.uptimeMillis();
        }
        this.f28095q0 = new w(this);
        if (needMeasureLaunchSpeed) {
            Log.v("INITIALIZATION: Tdlib.fileGenerationManager -> %dms", Long.valueOf(SystemClock.uptimeMillis() - j10));
            j10 = SystemClock.uptimeMillis();
        }
        String u10 = tc().u();
        this.Y1 = u10;
        if (!ib.i.i(u10) && (d10 = ob.c.d(this.Y1)) != null) {
            La(d10);
        }
        if (needMeasureLaunchSpeed) {
            Log.v("INITIALIZATION: Tdlib.applicationConfig -> %dms", Long.valueOf(SystemClock.uptimeMillis() - j10));
            j10 = SystemClock.uptimeMillis();
        }
        synchronized (obj) {
            if (this.X == null) {
                this.X = ja();
            }
        }
        if (needMeasureLaunchSpeed) {
            Log.i("INITIALIZATION: Tdlib.newClient() -> %dms", Long.valueOf(SystemClock.uptimeMillis() - j10));
        }
        he.i.c2().m(this);
    }

    public void A8(TdApi.Object object) {
        if (object instanceof TdApi.JsonValue) {
            TdApi.JsonValue jsonValue = (TdApi.JsonValue) object;
            Hb(jsonValue, ob.c.f(jsonValue));
            return;
        }
        Log.e("getApplicationConfig failed: %s", t2.z5(object));
    }

    public boolean B8() {
        return T1() != 0;
    }

    public void B9(TdApi.LanguagePackInfo languagePackInfo, kb.i iVar, boolean z10) {
        if (z10) {
            Mc(languagePackInfo.baseLanguagePackId, iVar);
        } else if (iVar != null) {
            iVar.a(false);
        }
    }

    public boolean C8() {
        return T1() != 0 && this.Y == 0;
    }

    public static void C9(String str, kb.i iVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        boolean z10 = true;
        if (constructor == -1679978726) {
            Log.e("Unable to synchronize languagePackId %s: %s", str, t2.z5(object));
            z10 = str.equals(gd.w.a0());
            if (!z10) {
                j0.t0(object);
                z10 = false;
            }
        } else if (constructor != -722616727) {
            Log.unexpectedTdlibResponse(object, TdApi.SynchronizeLanguagePack.class, TdApi.Ok.class, TdApi.Error.class);
            return;
        } else {
            Log.v("%s language is successfully synchronized", str);
        }
        if (iVar != null) {
            iVar.a(z10);
        }
    }

    public static void D7(TdApi.Object object, TdApi.LanguagePackInfo languagePackInfo, kb.i iVar) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
            if (iVar != null) {
                iVar.a(false);
            }
        } else if (constructor == -722616727) {
            gd.w.s(languagePackInfo);
            if (iVar != null) {
                iVar.a(true);
            }
        }
    }

    public boolean D8() {
        int T1 = T1();
        if (T1 != 1) {
            return T1 == 2 && this.f28058d2;
        }
        return true;
    }

    public void D9(kb.j jVar, TdApi.Session session, TdApi.Object object) {
        if (jVar != null) {
            jVar.a(object.getConstructor() == -1679978726 ? (TdApi.Error) object : null);
        }
        if (object.getConstructor() == -722616727) {
            this.W1 = null;
            this.f28071i0.B(session);
        }
    }

    public void E7(final TdApi.LanguagePackInfo languagePackInfo, final kb.i iVar, final TdApi.Object object) {
        hd().post(new Runnable() {
            @Override
            public final void run() {
                o6.D7(TdApi.Object.this, languagePackInfo, iVar);
            }
        });
    }

    public boolean E8() {
        return !this.f28055c2;
    }

    public void E9(kb.j jVar, TdApi.Session session, TdApi.Object object) {
        jVar.a(object.getConstructor() == -1679978726 ? (TdApi.Error) object : null);
        if (object.getConstructor() == -722616727) {
            this.W1 = null;
            this.f28071i0.K(session);
        }
    }

    public void F7(final TdApi.LanguagePackInfo languagePackInfo, final kb.i iVar) {
        v4().o(new TdApi.SetOption("language_pack_id", new TdApi.OptionValueString(languagePackInfo.f19945id)), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                o6.this.E7(languagePackInfo, iVar, object);
            }
        });
    }

    public static boolean F8() {
        return false;
    }

    public static void F9(AtomicReference atomicReference, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, i iVar, boolean z10, TdApi.Error error) {
        if (error != null) {
            atomicReference.set(error);
        }
        if (!z10) {
            atomicBoolean.set(true);
        }
        if (atomicInteger.decrementAndGet() != 0) {
            return;
        }
        if (atomicBoolean.get()) {
            iVar.a(false, (TdApi.Error) atomicReference.get());
        } else {
            iVar.a(true, null);
        }
    }

    public boolean G8() {
        TdApi.AuthorizationState authorizationState = this.J1;
        return authorizationState != null && authorizationState.getConstructor() == 1526047584;
    }

    public void G9(final i iVar, long j10, long j11, TdApi.Object object) {
        i iVar2;
        int constructor = object.getConstructor();
        if (constructor != -1679978726) {
            if (constructor == -722616727) {
                if (iVar != null) {
                    final AtomicInteger atomicInteger = new AtomicInteger(2);
                    final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    final AtomicReference atomicReference = new AtomicReference();
                    iVar2 = new i() {
                        @Override
                        public final void a(boolean z10, TdApi.Error error) {
                            o6.F9(atomicReference, atomicBoolean, atomicInteger, iVar, z10, error);
                        }
                    };
                } else {
                    iVar2 = null;
                }
                i iVar3 = iVar2;
                Ta(j10, new TdApi.MessageSenderUser(j11), TdApi.ChatMemberStatusCreator.CONSTRUCTOR, iVar3);
                Ta(j10, new TdApi.MessageSenderUser(fa()), TdApi.ChatMemberStatusAdministrator.CONSTRUCTOR, iVar3);
            }
        } else if (iVar != null) {
            iVar.a(false, (TdApi.Error) object);
        } else {
            j0.t0(object);
        }
    }

    public void H7(Runnable runnable, final kb.i iVar, boolean z10) {
        if (z10) {
            runnable.run();
        } else if (iVar != null) {
            hd().post(new Runnable() {
                @Override
                public final void run() {
                    kb.i.this.a(false);
                }
            });
        }
    }

    public void H8(TdApi.Object object) {
        TdApi.Message[] messageArr;
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor == -16498159) {
            for (TdApi.Message message : ((TdApi.Messages) object).messages) {
                if (message != null) {
                    ue(new TdApi.UpdateNewMessage(message), false);
                }
            }
        } else if (constructor == 1435961258) {
            ue(new TdApi.UpdateNewMessage((TdApi.Message) object), false);
        }
    }

    public void H9(String str, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.e("Failed to fetch suggested language, code: %s %s", str, t2.z5(object));
            qc(str, null);
        } else if (constructor != 542199642) {
            Log.unexpectedTdlibResponse(object, TdApi.GetLanguagePackInfo.class, TdApi.LanguagePackInfo.class, TdApi.Error.class);
        } else {
            qc(str, (TdApi.LanguagePackInfo) object);
        }
    }

    public static int I1(TdApi.Chat chat, TdApi.ChatPosition chatPosition) {
        if (chatPosition.order == 0) {
            return 0;
        }
        TdApi.ChatPosition[] chatPositionArr = chat.positions;
        if (chatPositionArr == null || chatPositionArr.length <= 0) {
            chat.positions = new TdApi.ChatPosition[]{chatPosition};
            return 3;
        }
        TdApi.ChatPosition[] chatPositionArr2 = new TdApi.ChatPosition[chatPositionArr.length + 1];
        System.arraycopy(chatPositionArr, 0, chatPositionArr2, 0, chatPositionArr.length);
        chatPositionArr2[chat.positions.length] = chatPosition;
        chat.positions = chatPositionArr2;
        return 3;
    }

    public void I7(kb.j jVar, long j10, TdApi.Object object) {
        jVar.a(object.getConstructor() == -1601123095 ? W2(j10) : null);
    }

    public static void I8(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor == -722616727) {
            j0.y0(R.string.Done, 0);
        }
    }

    public void I9(TdApi.Object object) {
        ka().v1(true);
    }

    public static boolean Id(TdApi.Chat chat, TdApi.ChatPosition chatPosition) {
        return Rb(chat, chatPosition) != 0;
    }

    public void J7(final long j10, final kb.j jVar) {
        TdApi.Chat W2 = W2(j10);
        if (W2 != null) {
            jVar.a(W2);
        } else {
            v4().o(new TdApi.GetChat(j10), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    o6.this.I7(jVar, j10, object);
                }
            });
        }
    }

    public static void J8(TdApi.Object object) {
        if (object.getConstructor() == -1679978726) {
            Log.e("TDLib Error (silenced): %s", t2.z5(object));
        }
    }

    public void J9(DialogInterface dialogInterface, int i10) {
        R4();
    }

    public void K7(long j10, kb.j jVar, TdApi.Object object) {
        jVar.a(W2(j10));
    }

    public void K8(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.e(32, "DownloadFile failed: %s", t2.z5(object));
        } else if (constructor == -722616727) {
        } else {
            if (constructor != 766337656) {
                Log.unexpectedTdlibResponse(object, TdApi.DownloadFile.class, TdApi.Ok.class, TdApi.Error.class);
                return;
            }
            TdApi.File file = (TdApi.File) object;
            TdApi.LocalFile localFile = file.local;
            if (localFile.isDownloadingCompleted) {
                ImageLoader.e().h(this, file);
            } else if (!localFile.isDownloadingActive) {
                Log.e(32, "WARNING: Image load not started", new Object[0]);
            }
        }
    }

    public void K9(TdApi.UpdateServiceNotification updateServiceNotification, CharSequence charSequence) {
        v4<?> s10 = j0.s();
        if (s10 == null) {
            return;
        }
        if (ib.i.i(updateServiceNotification.type) || (!updateServiceNotification.type.startsWith("AUTH_KEY_DROP") && !updateServiceNotification.type.startsWith("AUTHKEYDROP"))) {
            s10.Ec(R.string.AppName, charSequence);
        } else {
            s10.Fc(R.string.AppName, charSequence, gd.w.i1(R.string.LogOut), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    o6.this.J9(dialogInterface, i10);
                }
            }, 2);
        }
    }

    public void L7(final kb.j jVar, kb.e eVar, final long j10, TdApi.Chat chat) {
        if (chat != null) {
            jVar.a(chat);
        } else {
            v4().o((TdApi.Function) eVar.get(), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    o6.this.K7(j10, jVar, object);
                }
            });
        }
    }

    public static void L8(TdApi.Object object) {
        if (object.getConstructor() == -1679978726) {
            Log.e("setProfilePhoto failed: %s", t2.z5(object));
            j0.z0(gd.w.j1(R.string.SetProfilePhotoError, t2.z5(object)), 0);
        }
    }

    public static void L9(r rVar, long j10, long j11, TdApi.Object object) {
        if (rVar != null) {
            rVar.a(j10, j11, object.getConstructor() == -1679978726 ? (TdApi.Error) object : null);
        } else if (object.getConstructor() == -1679978726) {
            j0.t0(object);
        }
    }

    public void M7(TdApi.Object object, AtomicInteger atomicInteger, TdApi.Object object2) {
        if (object2.getConstructor() == -1679978726) {
            Log.e("Received error while sending change log: %s", t2.z5(object));
        }
        if (atomicInteger.decrementAndGet() == 0) {
            L4(1);
        }
    }

    public void M8(Runnable runnable, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor == -722616727) {
            c().hd().post(runnable);
        }
    }

    public void M9(final r rVar, final long j10, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor != -1679978726) {
            if (constructor == -1601123095) {
                final long j11 = ((TdApi.Chat) object).f19908id;
                v4().o(new TdApi.GetSupergroupFullInfo(ob.a.p(j11)), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object2) {
                        o6.L9(o6.r.this, j10, j11, object2);
                    }
                });
            }
        } else if (rVar != null) {
            rVar.a(j10, j10, (TdApi.Error) object);
        } else {
            j0.t0(object);
        }
    }

    public void N7(AtomicInteger atomicInteger, List list, final TdApi.Object object) {
        if (object.getConstructor() == -1679978726) {
            Log.e("Received error while posting change log: %s", t2.z5(object));
        }
        if (atomicInteger.decrementAndGet() == 0) {
            final AtomicInteger atomicInteger2 = new AtomicInteger(list.size());
            long Gb = Gb();
            Client.g i2Var = new Client.g() {
                @Override
                public final void r2(TdApi.Object object2) {
                    o6.this.M7(object, atomicInteger2, object2);
                }
            };
            Iterator it = list.iterator();
            while (it.hasNext()) {
                v4().o(new TdApi.AddLocalMessage(Gb, new TdApi.MessageSenderUser(777000L), 0L, true, (TdApi.InputMessageContent) it.next()), i2Var);
            }
        }
    }

    public void N8(Runnable runnable, TdApi.Object object) {
        this.M.r2(object);
        runnable.run();
    }

    public void O7() {
        r4(null);
    }

    public void P7(Runnable runnable, TdApi.Object object) {
        r4(runnable);
    }

    public void P8(Runnable runnable) {
        if (f7()) {
            v0.D2(runnable);
            return;
        }
        W1(runnable, true);
        Y4();
    }

    public static TdApi.FormattedText P9(String str, String str2) {
        TdApi.FormattedText formattedText = new TdApi.FormattedText(gd.w.u1(R.string.ChangeLogText, str, str2), null);
        ob.e.m1(formattedText);
        return formattedText;
    }

    public void Q7(String str, long[] jArr, long j10, long[] jArr2, final Runnable runnable, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            TdApi.Error error = (TdApi.Error) object;
            int max = Math.max(5, t2.v1(error.code, error.message, 5));
            if (max <= 60 || !W6()) {
                Log.e("Unable to register device token, retrying in %d seconds: %s, accountId:%d", Integer.valueOf(max), t2.z5(object), Integer.valueOf(this.W));
                v4().o(new TdApi.SetAlarm(max), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object2) {
                        o6.this.P7(runnable, object2);
                    }
                });
            } else {
                Log.e("Unable to register device token, flood is %d seconds, ignoring: %s, accountId:%d", Integer.valueOf(max), t2.z5(object), Integer.valueOf(this.W));
                this.V.Q2(this.W, true);
                v0.D2(runnable);
            }
        } else if (constructor == 371056428) {
            Log.i(4, "Successfully registered device token:%s, accountId:%d, otherUserIdsCount:%d", str, Integer.valueOf(this.W), Integer.valueOf(jArr.length));
            he.i.c2().y3(((TdApi.PushReceiverId) object).f19957id, this.W);
            gc.q0(this.W, j10, str, jArr);
            F4().Q2(this.W, true);
            F4().e3(this.f28115x1, this.W, jArr2);
            v0.D2(runnable);
        }
        L4(1);
    }

    public void Q8(Map map, String str, TdApi.Object object, long j10, long j11) {
        if (((TdApi.Object) map.get(str)) == object) {
            synchronized (map) {
                map.remove(str);
            }
            this.f28071i0.l2(j10, j11);
        }
    }

    public static void Q9(int i10, int i11, int i12, int i13, String str, List<TdApi.Function> list, List<TdApi.InputMessageContent> list2, boolean z10) {
        TdApi.FormattedText P9 = P9(String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)), str);
        list.add(new TdApi.GetWebPagePreview(P9));
        list.add(new TdApi.GetWebPageInstantView(str, false));
        list2.add(new TdApi.InputMessageText(P9, false, false));
    }

    public void R7(AtomicReference atomicReference, CountDownLatch countDownLatch, TdApi.Object object) {
        synchronized (atomicReference) {
            atomicReference.set(object);
            countDownLatch.countDown();
        }
        L4(7);
    }

    public void R8(final Map map, final String str, final TdApi.Object object, final long j10, final long j11, TdApi.Object object2) {
        if (object2.getConstructor() == -1679978726) {
            j0.t0(object2);
        }
        c().hd().post(new Runnable() {
            @Override
            public final void run() {
                o6.this.Q8(map, str, object, j10, j11);
            }
        });
    }

    public static int Rb(TdApi.Chat chat, TdApi.ChatPosition chatPosition) {
        int c10 = ob.b.c(chat.positions, chatPosition.list);
        if (c10 != -1) {
            return ze(chat, c10, chatPosition);
        }
        return I1(chat, chatPosition);
    }

    public void S7(TdApi.Function function, final AtomicReference atomicReference, final CountDownLatch countDownLatch) {
        H6(7);
        v4().o(function, new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                o6.this.R7(atomicReference, countDownLatch, object);
            }
        });
    }

    public void S8(long j10, Runnable runnable) {
        b.a.a(j10, this.W, "Finished processing push. Invoking after()", new Object[0]);
        runnable.run();
    }

    public void T8(final long j10, final Runnable runnable) {
        b.a.a(j10, this.W, "Making sure we're not in AuthorizationStateLoggingOut", new Object[0]);
        W1(new Runnable() {
            @Override
            public final void run() {
                o6.this.S8(j10, runnable);
            }
        }, false);
    }

    public void U7(kb.j jVar, kb.j jVar2, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1961323642) {
            TdApi.Session session = (TdApi.Session) object;
            if (jVar != null) {
                jVar.a(session);
            }
            this.f28071i0.I(session);
        } else if (constructor == -1679978726 && jVar2 != null) {
            jVar2.a((TdApi.Error) object);
        }
    }

    public void U8(long j10) {
        b.a.a(j10, this.W, "All notifications displayed. But there's no after() callback.", new Object[0]);
    }

    public void V7(long j10, kb.i iVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        boolean z10 = true;
        if (constructor == -1679978726) {
            Log.e("Unable to delete files data:%s, accountId:%d", t2.z5(object), Integer.valueOf(this.W));
        } else if (constructor == 217237013) {
            Log.i("Cleared files in %dms, accountId:%d", Long.valueOf(SystemClock.uptimeMillis() - j10), Integer.valueOf(this.W));
        }
        if (iVar != null) {
            if (object.getConstructor() != 217237013) {
                z10 = false;
            }
            iVar.a(z10);
        }
    }

    public void V8(final long j10, final Runnable runnable) {
        b.a.a(j10, this.W, "Making sure all notifications displayed", new Object[0]);
        G6();
        if (runnable != null) {
            ka().b2(new Runnable() {
                @Override
                public final void run() {
                    o6.this.T8(j10, runnable);
                }
            });
        } else {
            ka().b2(new Runnable() {
                @Override
                public final void run() {
                    o6.this.U8(j10);
                }
            });
        }
    }

    public void W7(long j10, boolean z10, Runnable runnable, TdApi.Object object) {
        if (object.getConstructor() == -1679978726) {
            Log.e("Cannot close secret chat, secretChatId:%d, error: %s", Integer.valueOf(ob.a.n(j10)), t2.z5(object));
        }
        v4().o(new TdApi.DeleteChatHistory(j10, true, z10), zc(runnable));
    }

    public void W8(Runnable runnable, long j10) {
        if (runnable != null) {
            b.a.a(j10, this.W, "Finished processing push. Invoking after()", new Object[0]);
            runnable.run();
            return;
        }
        b.a.a(j10, this.W, "All notifications displayed. But there's no after() callback.", new Object[0]);
    }

    public void X7(long j10, boolean z10, Runnable runnable, TdApi.Object object) {
        if (ob.a.g(j10)) {
            v4().o(new TdApi.DeleteChatHistory(j10, true, z10), oa(runnable));
        }
    }

    public void X8(Runnable runnable) {
        Xb(false);
        runnable.run();
    }

    public void Y7(TdApi.Object object) {
        if (object.getConstructor() == 63135518) {
            Ub(((TdApi.OptionValueBoolean) object).value);
        }
    }

    public void Y8(final long j10, final Runnable runnable, TdApi.Object object) {
        final Runnable g3Var = new Runnable() {
            @Override
            public final void run() {
                o6.this.V8(j10, runnable);
            }
        };
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            TdApi.Error error = (TdApi.Error) object;
            if (error.code == 401) {
                b.a.a(j10, this.W, "TDLib tells to expect AuthorizationStateLoggingOut: %s, waiting.", error);
                W1(new Runnable() {
                    @Override
                    public final void run() {
                        o6.this.W8(runnable, j10);
                    }
                }, true);
            } else {
                b.a.a(j10, this.W, "Failed to process push: %s, performing full sync.", t2.z5(object));
                Xb(true);
                Kc(j10, new Runnable() {
                    @Override
                    public final void run() {
                        o6.this.X8(g3Var);
                    }
                }, true, false);
            }
        } else if (constructor == -722616727) {
            b.a.a(j10, this.W, "Ensuring updateActiveNotifications was sent. ignoreNotificationUpdates:%b, receivedActiveNotificationsTime:%d, receivedActiveNotificationsIgnored: %b", Boolean.valueOf(this.F1), Long.valueOf(this.f28061e2), Boolean.valueOf(this.f28064f2));
            a2(g3Var);
        }
        K4();
    }

    public void Z7() {
        if (!this.f28058d2) {
            this.f28058d2 = true;
            ua();
        }
    }

    public void Z8(boolean z10, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.e("Failed to load avatar, accountId:%d, big:%b", Integer.valueOf(this.W), Boolean.valueOf(z10));
        } else if (constructor == 766337656) {
            TdApi.File file = (TdApi.File) object;
            if (t2.T2(file)) {
                TdApi.ProfilePhoto profilePhoto = this.f28085m2;
                TdApi.File file2 = profilePhoto != null ? z10 ? profilePhoto.big : profilePhoto.small : null;
                if (file2 != null && file2.f19913id == file.f19913id) {
                    ob.e.v(file, file2);
                    A1().h0(z10, file.local.path);
                    this.V.n2(this.W, z10);
                }
            }
        }
    }

    public void a8(long j10, long j11, TdApi.InputMessageText inputMessageText, TdApi.MessageText messageText, TdApi.Object object) {
        if (object.getConstructor() == -1816658231) {
            Ha(j10, j11, new TdApi.MessageAnimatedEmoji((TdApi.AnimatedEmoji) object, inputMessageText.text.text), new TdApi.EditMessageText(j10, j11, null, inputMessageText), this.T1);
        } else {
            Ha(j10, j11, messageText, new TdApi.EditMessageText(j10, j11, null, inputMessageText), this.T1);
        }
    }

    public void a9(AtomicInteger atomicInteger, TdApi.Chat chat) {
        boolean z10;
        TdApi.Message message;
        boolean z11 = true;
        if (chat.unreadCount == 0 || (message = chat.lastMessage) == null) {
            z10 = false;
        } else {
            Sa(chat.f19908id, 0L, new long[]{message.f19946id});
            z10 = true;
        }
        if (chat.isMarkedAsUnread) {
            v4().o(new TdApi.ToggleChatIsMarkedAsUnread(chat.f19908id, false), this.M);
            z10 = true;
        }
        if (chat.unreadMentionCount > 0) {
            v4().o(new TdApi.ReadAllChatMentions(chat.f19908id), this.M);
        } else {
            z11 = z10;
        }
        if (z11) {
            atomicInteger.incrementAndGet();
        }
    }

    public void b8(kb.e eVar, c1 c1Var, kb.e eVar2, kb.j jVar, List list) {
        ArrayList<i.d> arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        i.d dVar = (i.d) eVar.get();
        boolean g10 = dVar.g();
        Iterator it = list.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            TdApi.Message message = (TdApi.Message) it.next();
            TdApi.MessageContent messageContent = message.content;
            TdApi.Document document = ((TdApi.MessageDocument) messageContent).document;
            if (t2.x2(((TdApi.MessageDocument) messageContent).caption, "#preview")) {
                hashMap.put(v0.T0(document.fileName), document.document);
            } else {
                try {
                    i.d dVar2 = (i.d) c1Var.a(message);
                    if (!z10 && dVar2.g()) {
                        z10 = true;
                    } else if (!g10 && dVar2.f13847a.equals(dVar.f13847a)) {
                        g10 = true;
                    }
                    arrayList.add(dVar2);
                } catch (Throwable unused) {
                }
            }
        }
        if (!z10) {
            arrayList.add(0, (i.d) eVar2.get());
        }
        if (!g10) {
            arrayList.add(dVar);
        }
        Collections.sort(arrayList);
        for (i.d dVar3 : arrayList) {
            dVar3.i(this, (TdApi.File) hashMap.remove(dVar3.f13847a));
        }
        jVar.a(arrayList);
    }

    public static void b9(kb.k kVar, AtomicInteger atomicInteger, boolean z10) {
        if (z10 && kVar != null) {
            kVar.a(atomicInteger.get());
        }
    }

    public static boolean c8(String str, TdApi.Message message) {
        return message.content.getConstructor() == 596945783 && t2.x2(((TdApi.MessageDocument) message.content).caption, str);
    }

    public void c9(Runnable runnable) {
        runnable.run();
        L4(1);
    }

    public static int d6(TdApi.AuthorizationState authorizationState) {
        if (authorizationState == null) {
            return 0;
        }
        switch (authorizationState.getConstructor()) {
            case TdApi.AuthorizationStateReady.CONSTRUCTOR:
                return 2;
            case TdApi.AuthorizationStateWaitCode.CONSTRUCTOR:
            case TdApi.AuthorizationStateLoggingOut.CONSTRUCTOR:
            case TdApi.AuthorizationStateWaitPassword.CONSTRUCTOR:
            case TdApi.AuthorizationStateWaitPhoneNumber.CONSTRUCTOR:
            case TdApi.AuthorizationStateWaitRegistration.CONSTRUCTOR:
            case TdApi.AuthorizationStateWaitOtherDeviceConfirmation.CONSTRUCTOR:
                return 1;
            case TdApi.AuthorizationStateClosing.CONSTRUCTOR:
            case TdApi.AuthorizationStateWaitEncryptionKey.CONSTRUCTOR:
            case TdApi.AuthorizationStateWaitTdlibParameters.CONSTRUCTOR:
            case TdApi.AuthorizationStateClosed.CONSTRUCTOR:
                return 0;
            default:
                throw new IllegalArgumentException(authorizationState.toString());
        }
    }

    public static void d8(kb.j r7, org.drinkless.td.libcore.telegram.TdApi.Message r8) {
        throw new UnsupportedOperationException("Method not decompiled: zd.o6.d8(kb.j, org.drinkless.td.libcore.telegram.TdApi$Message):void");
    }

    public void d9(Runnable runnable) {
        runnable.run();
        M4();
    }

    public static void e8(l lVar, CountDownLatch countDownLatch, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.w("Error starting file generation: %s", t2.z5(object));
            countDownLatch.countDown();
        } else if (constructor == 766337656) {
            lVar.f28148b = (TdApi.File) object;
        }
        countDownLatch.countDown();
    }

    public static void e9(Client.g gVar, Runnable runnable, TdApi.Object object) {
        gVar.r2(object);
        runnable.run();
    }

    public static void f8(List list, List list2, List list3, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, kb.j jVar) {
        if (list.size() + list2.size() > 0) {
            ArrayList arrayList = new ArrayList(list2.size() + list3.size() + list.size());
            arrayList.addAll(list2);
            arrayList.addAll(list3);
            arrayList.addAll(list);
            list3 = arrayList;
        }
        boolean z10 = true;
        boolean z11 = list3.size() < 10 && !atomicBoolean.get();
        if (list3.size() >= 10 || atomicBoolean2.get()) {
            z10 = false;
        }
        if (jVar != null) {
            jVar.a(new f(list3, z11, z10));
        }
    }

    public static void f9(Client.g gVar, AtomicInteger atomicInteger, Runnable runnable, TdApi.Object object) {
        gVar.r2(object);
        if (atomicInteger.decrementAndGet() == 0) {
            runnable.run();
        }
    }

    public static void g8(TdApi.Message message, AtomicBoolean atomicBoolean, List list, boolean z10, AtomicInteger atomicInteger, Runnable runnable, TdApi.Object object) {
        int constructor = object.getConstructor();
        int i10 = 0;
        if (constructor == -1679978726) {
            Log.i("Failed to fetch part of an album: %s", t2.z5(object));
        } else if (constructor == -16498159) {
            TdApi.Message[] messageArr = ((TdApi.Messages) object).messages;
            int length = messageArr.length;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                TdApi.Message message2 = messageArr[i10];
                if (message2.f19946id < message.f19946id) {
                    if (message2.mediaAlbumId != message.mediaAlbumId) {
                        atomicBoolean.set(true);
                        break;
                    }
                    list.add(message2);
                }
                i10++;
            }
            if (list.isEmpty() && !z10) {
                atomicBoolean.set(true);
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            runnable.run();
        }
    }

    public void g9(kb.j jVar, TdApi.Object object) {
        this.O.r2(object);
        jVar.a(object instanceof TdApi.Message ? (TdApi.Message) object : null);
    }

    public static void h8(TdApi.Message message, AtomicBoolean atomicBoolean, List list, boolean z10, AtomicInteger atomicInteger, Runnable runnable, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.i("Failed to fetch part of an album: %s", t2.z5(object));
        } else if (constructor == -16498159) {
            TdApi.Message[] messageArr = ((TdApi.Messages) object).messages;
            int length = messageArr.length - 1;
            while (true) {
                if (length < 0) {
                    break;
                }
                TdApi.Message message2 = messageArr[length];
                if (message2.f19946id > message.f19946id) {
                    if (message2.mediaAlbumId != message.mediaAlbumId) {
                        atomicBoolean.set(true);
                        break;
                    }
                    list.add(message2);
                }
                length--;
            }
            Collections.reverse(list);
            if (list.isEmpty() && !z10) {
                atomicBoolean.set(true);
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            runnable.run();
        }
    }

    public void h9(long j10, String str, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.e("Cannot set clientData: %s, chatId:%d, clientData:%s", t2.z5(object), Long.valueOf(j10), str);
            j0.t0(object);
        } else if (constructor == -722616727) {
            this.f28071i0.N0(j10, str);
        }
    }

    public static i.f i8() {
        return he.i.c2().N0();
    }

    public void i9(TdApi.MessageSender messageSender, TdApi.ChatMemberStatus chatMemberStatus, TdApi.ChatMemberStatus chatMemberStatus2, i iVar, long j10, long j11, TdApi.Error error) {
        if (j11 != 0) {
            Nb(j11, messageSender, chatMemberStatus, 0, chatMemberStatus2, iVar);
        } else if (iVar != null) {
            iVar.a(false, error);
        }
    }

    public static i.h j8() {
        return he.i.c2().S0();
    }

    public void j9(long j10, final TdApi.MessageSender messageSender, final TdApi.ChatMemberStatus chatMemberStatus, final TdApi.ChatMemberStatus chatMemberStatus2, final i iVar) {
        Qe(j10, new r() {
            @Override
            public final void a(long j11, long j12, TdApi.Error error) {
                o6.this.i9(messageSender, chatMemberStatus, chatMemberStatus2, iVar, j11, j12, error);
            }
        });
    }

    public static void k8(kb.j jVar, long j10, long j11, TdApi.Object object) {
        if (!(object instanceof TdApi.Message)) {
            if (jVar != null) {
                jVar.a(null);
            }
            Log.i("Could not get message from server: %s, chatId:%s, messageId:%s", t2.z5(object), Long.valueOf(j10), Long.valueOf(j11));
        } else if (jVar != null) {
            jVar.a((TdApi.Message) object);
        }
    }

    public static void k9(i iVar, TdApi.Object object) {
        iVar.a(false, (TdApi.Error) object);
    }

    public void l8(final kb.j jVar, final long j10, final long j11, TdApi.Object object) {
        if (!(object instanceof TdApi.Message)) {
            v4().o(new TdApi.GetMessage(j10, j11), new Client.g() {
                @Override
                public final void r2(TdApi.Object object2) {
                    o6.k8(j.this, j10, j11, object2);
                }
            });
        } else if (jVar != null) {
            jVar.a((TdApi.Message) object);
        }
    }

    public void l9(Runnable runnable, final i iVar, final TdApi.Object object) {
        if (t2.p3(object)) {
            runnable.run();
        } else if (iVar != null) {
            hd().post(new Runnable() {
                @Override
                public final void run() {
                    o6.k9(o6.i.this, object);
                }
            });
        }
    }

    public static void m8(AtomicBoolean atomicBoolean, kb.b bVar, kb.j jVar, TdApi.MessageLink messageLink) {
        synchronized (atomicBoolean) {
            if (!atomicBoolean.getAndSet(true)) {
                if (bVar != null) {
                    bVar.c();
                }
                jVar.a(new m(messageLink.link, messageLink.isPublic));
            }
        }
    }

    public static void m9(kb.i iVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
            iVar.a(false);
        } else if (constructor == -722616727) {
            iVar.a(true);
        }
    }

    public void n8(final AtomicBoolean atomicBoolean, final kb.b bVar, final kb.j jVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.e("Could not fetch message link: %s", t2.z5(object));
            if (bVar != null) {
                hd().post(bVar);
            }
        } else if (constructor == -1354089818) {
            final TdApi.MessageLink messageLink = (TdApi.MessageLink) object;
            hd().post(new Runnable() {
                @Override
                public final void run() {
                    o6.m8(atomicBoolean, bVar, jVar, messageLink);
                }
            });
        }
    }

    public void n9(kb.j jVar, int i10, TdApi.Object object) {
        jVar.a(object.getConstructor() == -1679978726 ? (TdApi.Error) object : null);
        if (object.getConstructor() == -722616727) {
            this.W1 = null;
            this.f28071i0.G(i10);
        }
    }

    public void o9(boolean z10, Client client) {
        client.o(new TdApi.SetOption("is_emulator", new TdApi.OptionValueBoolean(z10)), this.M);
    }

    public void p8(final kb.j jVar, TdApi.Object object) {
        final String str;
        int constructor = object.getConstructor();
        if (constructor == -2018019930) {
            str = ((TdApi.HttpUrl) object).url;
        } else if (constructor != -1679978726) {
            Log.unexpectedTdlibResponse(object, TdApi.GetProxyLink.class, TdApi.HttpUrl.class, TdApi.Error.class);
            return;
        } else {
            Log.e("Proxy link unavailable: %s", t2.z5(object));
            str = null;
        }
        hd().post(new Runnable() {
            @Override
            public final void run() {
                j.this.a(str);
            }
        });
    }

    public void p9(TdApi.NetworkType networkType, Client client) {
        client.o(new TdApi.SetNetworkType(networkType), this.M);
    }

    public void q8(final kb.j jVar, TdApi.Object object) {
        if (object.getConstructor() == 196049779) {
            v4().o(new TdApi.GetProxyLink(((TdApi.Proxy) object).f19956id), new Client.g() {
                @Override
                public final void r2(TdApi.Object object2) {
                    o6.this.p8(jVar, object2);
                }
            });
        }
    }

    public void q9(boolean z10, Client client) {
        client.o(new TdApi.SetOption("online", new TdApi.OptionValueBoolean(z10)), this.M);
    }

    public void r8(kb.j jVar) {
        p pVar = this.W1;
        if (pVar == null) {
            c6(false, jVar);
        } else if (jVar != null) {
            jVar.a(pVar);
        }
    }

    public void s8(kb.j jVar, TdApi.Object object) {
        p pVar;
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.e("Unable to fetch sessions", t2.z5(object));
            if (jVar != null) {
                jVar.a(null);
            }
        } else if (constructor == 842912274) {
            TdApi.Sessions sessions = (TdApi.Sessions) object;
            synchronized (this.f28045a0) {
                pVar = new p(sessions);
                this.W1 = pVar;
            }
            if (jVar != null) {
                jVar.a(pVar);
            }
        }
    }

    public void s9(int i10, TdApi.NotificationSettingsScope notificationSettingsScope, TdApi.Object object) {
        if (object.getConstructor() == -1383458661) {
            TdApi.ScopeNotificationSettings scopeNotificationSettings = (TdApi.ScopeNotificationSettings) object;
            scopeNotificationSettings.muteFor = i10;
            pc(notificationSettingsScope, scopeNotificationSettings);
        }
    }

    public static void t8(kb.j jVar, String[] strArr, String str, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.e("Failed to fetch %d strings: %s, languagePackId: %s", Integer.valueOf(strArr.length), t2.z5(object), str);
            if (jVar != null) {
                jVar.a(null);
            }
        } else if (constructor == 1172082922 && jVar != null) {
            TdApi.LanguagePackString[] languagePackStringArr = ((TdApi.LanguagePackStrings) object).strings;
            HashMap hashMap = new HashMap(languagePackStringArr.length);
            for (TdApi.LanguagePackString languagePackString : languagePackStringArr) {
                if (languagePackString.value.getConstructor() != 1834792698) {
                    hashMap.put(languagePackString.key, languagePackString);
                }
            }
            jVar.a(hashMap);
        }
    }

    public void t9(boolean z10, String str, TdApi.Object object) {
        if (z10) {
            j0.z0(gd.w.j1(R.string.SignedOutAs, str), 0);
        }
        L4(1);
    }

    public static boolean u4(int i10, int i11, boolean z10) {
        return i10 < i11 && (i11 <= 1519 || z10);
    }

    public static void u8(kb.j jVar, Map map, Map map2) {
        if (jVar == null) {
            return;
        }
        if (map == null && map2 == null) {
            jVar.a(null);
        } else if (map == null) {
            jVar.a(map2);
        } else {
            if (map2 != null) {
                map.putAll(map2);
            }
            jVar.a(map);
        }
    }

    public void u9(Runnable runnable, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor == -722616727) {
            c().hd().post(runnable);
        }
    }

    public void v8(String[] strArr, TdApi.LanguagePackInfo languagePackInfo, final kb.j jVar, final Map map) {
        HashSet hashSet = new HashSet(strArr.length);
        Collections.addAll(hashSet, strArr);
        if (map != null) {
            hashSet.removeAll(map.keySet());
        }
        if (!hashSet.isEmpty()) {
            String[] strArr2 = new String[hashSet.size()];
            hashSet.toArray(strArr2);
            f6(languagePackInfo.baseLanguagePackId, strArr2, new kb.j() {
                @Override
                public final void a(Object obj) {
                    o6.u8(j.this, map, (Map) obj);
                }
            });
        }
    }

    public void v9(kb.j jVar, String str, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1816236758) {
            jVar.a((TdApi.StickerSet) object);
        } else if (constructor == -1679978726) {
            Log.e("Failed to find animated emoji sticker set: %s, %s, isDebugInstance: %b", str, t2.z5(object), Boolean.valueOf(W6()));
            jVar.a(null);
        }
    }

    public void w8(kb.k kVar, TdApi.Chat chat) {
        if (chat == null || !t2.h3(O3(f28041x2))) {
            kVar.a(0);
        } else {
            kVar.a(1);
        }
    }

    public static void w9(final Runnable runnable, Client client) {
        client.o(new TdApi.GetCountryCode(), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                runnable.run();
            }
        });
    }

    public void x8(final kb.k kVar, TdApi.Chat chat) {
        if (chat == null || !t2.h3(O3(f28040w2))) {
            Y2(f28041x2, new kb.j() {
                @Override
                public final void a(Object obj) {
                    o6.this.w8(kVar, (TdApi.Chat) obj);
                }
            });
        } else {
            kVar.a(2);
        }
    }

    public void x9(long j10, final Runnable runnable) {
        b.a.a(j10, this.W, "Connection available. Performing network request to make sure it's still active.", new Object[0]);
        Ia(new kb.j() {
            @Override
            public final void a(Object obj) {
                o6.w9(runnable, (Client) obj);
            }
        }, runnable);
    }

    public void y8(final kb.k kVar, TdApi.Chat chat) {
        if (chat == null || !t2.h3(O3(f28039v2))) {
            Y2(f28040w2, new kb.j() {
                @Override
                public final void a(Object obj) {
                    o6.this.x8(kVar, (TdApi.Chat) obj);
                }
            });
        } else {
            kVar.a(3);
        }
    }

    public void y9(long j10, Runnable runnable) {
        b.a.a(j10, this.W, "Sync task finished.", new Object[0]);
        runnable.run();
    }

    public static void z8(TdApi.Object object) {
        if (object.getConstructor() == -1679978726) {
            j0.t0(object);
        }
    }

    public void z9(final Runnable runnable, boolean z10, final long j10) {
        if (runnable == null) {
            b.a.a(j10, this.W, "Sync task finished, but there's no callback.", new Object[0]);
        } else if (z10) {
            b.a.a(j10, this.W, "Making sure havePendingNotifications is false.", new Object[0]);
            b2(new Runnable() {
                @Override
                public final void run() {
                    o6.this.y9(j10, runnable);
                }
            });
        } else {
            b.a.a(j10, this.W, "Sync task finished.", new Object[0]);
            runnable.run();
        }
        L4(3);
    }

    public static int ze(TdApi.Chat chat, int i10, TdApi.ChatPosition chatPosition) {
        TdApi.ChatPosition[] chatPositionArr = chat.positions;
        TdApi.ChatPosition chatPosition2 = chatPositionArr[i10];
        long j10 = chatPosition2.order;
        long j11 = chatPosition.order;
        int i11 = j10 != j11 ? 1 : 0;
        if (j11 == 0) {
            chat.positions = (TdApi.ChatPosition[]) ib.b.z(chatPositionArr, i10, new TdApi.ChatPosition[chatPositionArr.length - 1]);
        } else {
            if (!ob.e.I(chatPosition2.source, chatPosition.source)) {
                i11 |= 2;
            }
            if (chatPosition2.isPinned != chatPosition.isPinned) {
                i11 |= 4;
            }
            if (i11 == 0) {
                return 0;
            }
            chat.positions[i10] = chatPosition;
        }
        return i11;
    }

    public w6 A1() {
        return this.V.U(this.W);
    }

    public boolean A2(TdApi.Chat chat) {
        return B2(chat, true);
    }

    public j A3(TdApi.Chat chat) {
        int s10;
        String str;
        if (chat == null) {
            return null;
        }
        String str2 = chat.clientData;
        if (ib.i.i(str2)) {
            return null;
        }
        String[] split = str2.split("_", 2);
        if (split.length == 2 && (s10 = ib.i.s(split[0])) >= 0 && s10 <= 0) {
            if (s10 < 0) {
                while (s10 <= 0) {
                    str2 = Pe(chat, s10);
                    s10++;
                }
                Kb(chat, str2);
                if (ib.i.i(str2)) {
                    return null;
                }
                split = str2.split("_", 2);
                if (!(split.length == 2 && ib.i.s(split[0]) == 0)) {
                    return null;
                }
            }
            try {
                String str3 = split[1];
                int indexOf = str3.indexOf(95);
                int s11 = ib.i.s(str3.substring(0, indexOf));
                if (!he.d.z(s11)) {
                    return null;
                }
                int i10 = indexOf + 1;
                int indexOf2 = str3.indexOf(95, i10);
                int s12 = ib.i.s(str3.substring(i10, indexOf2));
                int i11 = indexOf2 + 1;
                int indexOf3 = str3.indexOf(95, i11);
                int s13 = ib.i.s(str3.substring(i11, indexOf3));
                if (s13 < 0) {
                    return null;
                }
                int i12 = indexOf3 + 1;
                int i13 = s13 + i12;
                String substring = str3.substring(i12, i13);
                if (str3.length() > i13) {
                    int i14 = i13 + 1;
                    int indexOf4 = str3.indexOf(95, i14);
                    int s14 = ib.i.s(str3.substring(i14, indexOf4));
                    if (s14 > 0) {
                        int i15 = indexOf4 + 1;
                        str = str3.substring(i15, s14 + i15);
                        return new j(s11, s12, substring, str);
                    }
                }
                str = null;
                return new j(s11, s12, substring, str);
            } catch (Throwable th) {
                Log.w("Unable to parse clientData", th, new Object[0]);
            }
        }
        return null;
    }

    public void A4(final long j10, final v4<?> v4Var, boolean z10) {
        if (z10) {
            hd().postDelayed(new Runnable() {
                @Override
                public final void run() {
                    o6.this.T7(j10, v4Var);
                }
            }, 1000L);
        } else {
            T7(j10, v4Var);
        }
    }

    public z8 A5(TdApi.ChatList chatList) {
        String o42 = t2.o4(chatList);
        z8 z8Var = this.f28087n1.get(o42);
        if (z8Var != null) {
            return z8Var;
        }
        z8 z8Var2 = new z8(-1, -1, -1, -1, -1, -1, -1);
        this.f28087n1.put(o42, z8Var2);
        return z8Var2;
    }

    public int A6() {
        return this.W;
    }

    public boolean A7(long j10) {
        return ob.a.l(j10);
    }

    public final void Aa(long j10) {
        this.V.k2(this.W, j10);
        e2().l1(j10);
        this.f28092p0.F1(j10);
    }

    public TdApi.MessageSender Ab(long j10) {
        long h42 = h4(j10);
        return h42 != 0 ? new TdApi.MessageSenderUser(h42) : new TdApi.MessageSenderChat(j10);
    }

    public TdApi.SuggestedAction Ac() {
        synchronized (this.f28045a0) {
            TdApi.SuggestedAction suggestedAction = null;
            for (TdApi.SuggestedAction suggestedAction2 : this.f28079k2) {
                if (q7(suggestedAction2)) {
                    if (suggestedAction != null) {
                        return null;
                    }
                    suggestedAction = suggestedAction2;
                }
            }
            return suggestedAction;
        }
    }

    public final void Ad(TdApi.UpdateChatIsMarkedAsUnread updateChatIsMarkedAsUnread) {
        synchronized (this.f28045a0) {
            TdApi.Chat chat = this.f28049b0.get(Long.valueOf(updateChatIsMarkedAsUnread.chatId));
            if (!kj.b(updateChatIsMarkedAsUnread.chatId, chat, updateChatIsMarkedAsUnread)) {
                chat.isMarkedAsUnread = updateChatIsMarkedAsUnread.isMarkedAsUnread;
                this.f28071i0.b1(updateChatIsMarkedAsUnread);
            }
        }
    }

    public final void Ae(Client client) {
        he(client, true);
        client.o(new TdApi.SetOption("use_quick_ack", new TdApi.OptionValueBoolean(true)), this.M);
        client.o(new TdApi.SetOption("use_pfs", new TdApi.OptionValueBoolean(true)), this.M);
        ve(client);
        boolean e22 = he.i.c2().e2();
        this.f28051b2 = e22;
        client.o(new TdApi.SetOption("is_emulator", new TdApi.OptionValueBoolean(e22)), this.M);
        client.o(new TdApi.SetOption("storage_max_files_size", new TdApi.OptionValueInteger(2147483647L)), this.M);
        client.o(new TdApi.SetOption("ignore_default_disable_notification", new TdApi.OptionValueBoolean(true)), this.M);
        client.o(new TdApi.SetOption("ignore_platform_restrictions", new TdApi.OptionValueBoolean(v0.f1())), this.M);
        p4(client, true);
        if (this.I1) {
            client.o(new TdApi.SetOption("drop_notification_ids", new TdApi.OptionValueBoolean(true)), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    o6.this.I9(object);
                }
            });
            this.I1 = false;
        }
        this.f28052c.useTestDc = W6();
        this.f28052c.databaseDirectory = ya.T0(this.W, false);
        this.f28052c.filesDirectory = ya.T0(this.W, true);
        this.f28052c.systemLanguageCode = ya.P0();
        this.f28052c.deviceModel = ya.C0();
        this.f28052c.systemVersion = ya.Q0();
    }

    public int B1() {
        return z5(R.id.theme_color_notification);
    }

    public boolean B2(org.drinkless.td.libcore.telegram.TdApi.Chat r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: zd.o6.B2(org.drinkless.td.libcore.telegram.TdApi$Chat, boolean):boolean");
    }

    public TdApi.ChatPermissions B3(long j10) {
        TdApi.Chat W2 = W2(j10);
        if (W2 != null) {
            return W2.permissions;
        }
        return null;
    }

    public final void T7(long j10, v4<?> v4Var) {
        synchronized (this.S1) {
            ArrayList<v4<?>> f10 = this.Q1.f(j10);
            if (f10 != null && f10.remove(v4Var) && f10.isEmpty()) {
                this.R1.c(j10);
                this.Q1.l(j10);
                if (Log.isEnabled(8)) {
                    Log.v(8, "closeChat, chatId=%d", Long.valueOf(j10));
                }
                v4().o(new TdApi.CloseChat(j10), this.M);
            }
        }
    }

    public String B5(TdApi.FormattedText formattedText) {
        if (ob.e.c1(formattedText)) {
            return null;
        }
        TdApi.TextEntity[] textEntityArr = formattedText.entities;
        if (textEntityArr != null && textEntityArr.length != 0) {
            return null;
        }
        String trim = formattedText.text.trim();
        if (X6(trim)) {
            return trim;
        }
        return null;
    }

    public boolean B6() {
        return this.R0;
    }

    public boolean B7(TdApi.Chat chat) {
        if (chat == null) {
            return false;
        }
        int constructor = chat.type.getConstructor();
        return constructor == 862366513 || constructor == 1579049844;
    }

    public final void Ba(TdApi.UpdateNotification updateNotification) {
        if (!this.F1) {
            this.f28092p0.J1(updateNotification);
        }
    }

    public String Bb(TdApi.Message message, boolean z10, boolean z11) {
        TdApi.MessageForwardInfo messageForwardInfo;
        long P0 = ob.e.P0(message, z10);
        if (P0 == 0 && z10 && (messageForwardInfo = message.forwardInfo) != null) {
            int constructor = messageForwardInfo.origin.getConstructor();
            if (constructor == -739561951) {
                return ((TdApi.MessageForwardOriginMessageImport) message.forwardInfo.origin).senderName;
            }
            if (constructor == -271257885) {
                return ((TdApi.MessageForwardOriginHiddenUser) message.forwardInfo.origin).senderName;
            }
            P0 = ob.e.P0(message, false);
        }
        if (ob.a.l(P0)) {
            long h42 = h4(P0);
            return z11 ? e2().C2(h42) : e2().J2(h42);
        } else if (P0 != message.chatId || ib.i.i(message.authorSignature)) {
            return U3(P0);
        } else {
            if (z11) {
                return message.authorSignature;
            }
            return gd.w.j1(O6(message.chatId) ? R.string.format_channelAndSignature : R.string.format_chatAndSignature, U3(P0), message.authorSignature);
        }
    }

    public ic Bc() {
        return this.f28077k0;
    }

    public final void Bd(TdApi.UpdateChatLastMessage updateChatLastMessage) {
        if (Log.isEnabled(8)) {
            Object[] objArr = new Object[2];
            objArr[0] = Long.valueOf(updateChatLastMessage.chatId);
            TdApi.Message message = updateChatLastMessage.lastMessage;
            objArr[1] = Long.valueOf(message != null ? message.f19946id : 0L);
            Log.i(8, "updateChatTopMessage chatId=%d messageId=%d", objArr);
        }
        synchronized (this.f28045a0) {
            TdApi.Chat chat = this.f28049b0.get(Long.valueOf(updateChatLastMessage.chatId));
            if (!kj.b(updateChatLastMessage.chatId, chat, updateChatLastMessage)) {
                chat.lastMessage = updateChatLastMessage.lastMessage;
                this.f28071i0.d1(updateChatLastMessage, Sb(chat, updateChatLastMessage.positions));
            }
        }
    }

    public final void Be(TdApi.UpdateUserPrivacySettingRules updateUserPrivacySettingRules) {
        this.f28071i0.H2(updateUserPrivacySettingRules.setting, updateUserPrivacySettingRules.rules);
    }

    public int C1(long j10) {
        return z5(ob.a.j(j10) ? R.id.theme_color_notificationSecure : R.id.theme_color_notification);
    }

    public boolean C2(TdApi.Chat chat) {
        TdApi.ChatMemberStatus O3;
        if (chat != null) {
            long j10 = chat.f19908id;
            if (!(j10 == 0 || (O3 = O3(j10)) == null)) {
                int constructor = O3.getConstructor();
                if (constructor == -160019714) {
                    return true;
                }
                if (constructor != -70024163) {
                    return false;
                }
                return ((TdApi.ChatMemberStatusAdministrator) O3).rights.canInviteUsers;
            }
        }
        return false;
    }

    public boolean C3(TdApi.ChatList chatList, long j10) {
        if (j10 == 0) {
            return false;
        }
        return ob.b.g(W2(j10), chatList);
    }

    public void C4(String str, final kb.j<TdApi.Session> jVar, final kb.j<TdApi.Error> jVar2) {
        v4().o(new TdApi.ConfirmQrCodeAuthentication(str), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                o6.this.U7(jVar, jVar2, object);
            }
        });
    }

    public void C5(kb.j<List<i.f>> jVar) {
        k5(jVar, "#emoji", y3.f28703a, a4.f27225a, d3.f27383a);
    }

    public Client.g C6() {
        return this.R;
    }

    public boolean C7() {
        TdApi.NetworkType networkType = this.Z1;
        return (networkType != null && networkType.getConstructor() == -1971691759) || this.V.g3().n();
    }

    public final void Ca(TdApi.UpdateNotificationGroup updateNotificationGroup) {
        b.a.a(0L, this.W, "Received updateNotificationGroup, groupId: %d, elapsed: %d, ignore: %b", Integer.valueOf(updateNotificationGroup.notificationGroupId), Long.valueOf(SystemClock.uptimeMillis() - this.f28061e2), Boolean.valueOf(this.F1));
        if (!this.F1) {
            this.f28092p0.L1(updateNotificationGroup);
        }
    }

    public String Cb(TdApi.MessageSender messageSender) {
        return Db(messageSender, false);
    }

    public void Cc(final String str, final kb.j<TdApi.StickerSet> jVar) {
        if (ib.i.i(str)) {
            jVar.a(null);
        } else {
            v4().o(new TdApi.SearchStickerSet(str), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    o6.this.v9(jVar, str, object);
                }
            });
        }
    }

    public final void Cd(TdApi.UpdateChatMessageTtl updateChatMessageTtl) {
        synchronized (this.f28045a0) {
            TdApi.Chat chat = this.f28049b0.get(Long.valueOf(updateChatMessageTtl.chatId));
            if (!kj.b(updateChatMessageTtl.chatId, chat, updateChatMessageTtl)) {
                chat.messageTtl = updateChatMessageTtl.messageTtl;
                this.f28071i0.g1(updateChatMessageTtl);
            }
        }
    }

    public final void Ce(TdApi.UpdateReactions updateReactions) {
        synchronized (this.f28045a0) {
            this.M0 = updateReactions.reactions;
        }
    }

    public String D1() {
        return this.V.U(this.W).t();
    }

    public boolean D2(TdApi.Chat chat) {
        return chat != null && (chat.unreadCount > 0 || chat.isMarkedAsUnread);
    }

    public hd.b D3(TdApi.Chat chat, boolean z10, float f10, t tVar) {
        return new hd.b(f10, G3(chat, z10), tVar);
    }

    public int D4() {
        return this.Y;
    }

    public TdApi.FormattedText D5(TdApi.Message message) {
        if (message == null) {
            return null;
        }
        TdApi.FormattedText O5 = O5(message.chatId, message.f19946id);
        return O5 != null ? O5 : ob.e.y1(message.content);
    }

    public boolean D6() {
        return Thread.currentThread() == v4().g();
    }

    public void Da(long j10, v4<?> v4Var) {
        Ea(j10, v4Var, null);
    }

    public String Db(TdApi.MessageSender messageSender, boolean z10) {
        int constructor = messageSender.getConstructor();
        if (constructor == -336109341) {
            long j10 = ((TdApi.MessageSenderUser) messageSender).userId;
            t7 e22 = e2();
            return z10 ? e22.C2(j10) : e22.J2(j10);
        } else if (constructor == -239660751) {
            return U3(((TdApi.MessageSenderChat) messageSender).chatId);
        } else {
            throw new RuntimeException(messageSender.toString());
        }
    }

    public void Dc(int i10) {
        if (i10 > 0) {
            this.G1 += i10;
            x4().x();
        }
    }

    public final void Dd(TdApi.UpdateChatOnlineMemberCount updateChatOnlineMemberCount) {
        synchronized (this.f28045a0) {
            Integer num = this.f28065g0.get(Long.valueOf(updateChatOnlineMemberCount.chatId));
            int intValue = num != null ? num.intValue() : 0;
            int i10 = updateChatOnlineMemberCount.onlineMemberCount;
            if (i10 != intValue) {
                if (i10 != 0) {
                    this.f28065g0.put(Long.valueOf(updateChatOnlineMemberCount.chatId), Integer.valueOf(updateChatOnlineMemberCount.onlineMemberCount));
                } else {
                    this.f28065g0.remove(Long.valueOf(updateChatOnlineMemberCount.chatId));
                }
                this.f28071i0.j1(updateChatOnlineMemberCount);
            }
        }
    }

    public final void De(TdApi.UpdateRecentStickers updateRecentStickers) {
        this.f28071i0.I2(updateRecentStickers);
    }

    public String E1() {
        return this.V.U(this.W).u();
    }

    public boolean E2(org.drinkless.td.libcore.telegram.TdApi.Chat r7) {
        throw new UnsupportedOperationException("Method not decompiled: zd.o6.E2(org.drinkless.td.libcore.telegram.TdApi$Chat):boolean");
    }

    public b.a E3(long j10, TdApi.Chat chat, boolean z10) {
        if (chat != null || j10 == 0) {
            return G3(chat, z10);
        }
        return new b.a(e3(j10));
    }

    public w8 E4() {
        return this.f28080l0;
    }

    public CharSequence E5(TdApi.Chat chat) {
        return Z5(chat, R.id.right_sendStickersAndGifs, R.string.ChatDisabledGifs, R.string.ChatRestrictedGifs, R.string.ChatRestrictedGifsUntil);
    }

    public void E6() {
        H6(6);
    }

    public void Ea(long j10, v4<?> v4Var, final Runnable runnable) {
        synchronized (this.S1) {
            ArrayList<v4<?>> f10 = this.Q1.f(j10);
            if (f10 == null) {
                f10 = new ArrayList<>();
                f10.add(v4Var);
                this.Q1.k(j10, f10);
            } else {
                f10.add(v4Var);
            }
            if (f10.size() == 1) {
                this.R1.g(j10, (int) (System.currentTimeMillis() / 1000));
                if (Log.isEnabled(8)) {
                    Log.v(8, "openChat, chatId=%d", Long.valueOf(j10));
                }
                v4().o(new TdApi.OpenChat(j10), runnable != null ? new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        o6.this.N8(runnable, object);
                    }
                } : this.M);
            } else if (runnable != null) {
                v4().o(new TdApi.SetAlarm(0.0d), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        runnable.run();
                    }
                });
            }
        }
        ka().t1(j10);
    }

    public long Eb(TdApi.Message message) {
        TdApi.MessageForwardInfo messageForwardInfo;
        if (message == null) {
            return 0L;
        }
        if (!k7(message.chatId) || (messageForwardInfo = message.forwardInfo) == null || messageForwardInfo.origin.getConstructor() != -355174191) {
            return ob.e.T0(message);
        }
        return ((TdApi.MessageForwardOriginUser) message.forwardInfo.origin).senderUserId;
    }

    public boolean Ec() {
        return this.f28110v0;
    }

    public final void Ed(TdApi.UpdateChatPendingJoinRequests updateChatPendingJoinRequests) {
        synchronized (this.f28045a0) {
            TdApi.Chat chat = this.f28049b0.get(Long.valueOf(updateChatPendingJoinRequests.chatId));
            if (!kj.b(updateChatPendingJoinRequests.chatId, chat, updateChatPendingJoinRequests)) {
                chat.pendingJoinRequests = updateChatPendingJoinRequests.pendingJoinRequests;
                this.f28071i0.l1(updateChatPendingJoinRequests);
            }
        }
    }

    public final void Ee(TdApi.UpdateSavedAnimations updateSavedAnimations) {
        this.f28071i0.J2(updateSavedAnimations);
    }

    public int F1() {
        return z5(R.id.theme_color_notificationPlayer);
    }

    public boolean F2(long j10) {
        return G2(W2(j10));
    }

    public b.a F3(long j10, boolean z10) {
        return E3(j10, W2(j10), z10);
    }

    public ya F4() {
        return this.V;
    }

    public void F5(kb.j<List<i.h>> jVar) {
        k5(jVar, "#icons", x3.f28664a, b4.f27274a, o3.f28035a);
    }

    public void F6() {
        H6(1);
    }

    public boolean Fa(Client client) {
        boolean z10;
        synchronized (this.Z) {
            k kVar = this.X;
            z10 = kVar != null && kVar.f28145b == client;
        }
        return z10;
    }

    public String Fb(TdApi.MessageSender messageSender) {
        int constructor = messageSender.getConstructor();
        if (constructor == -336109341) {
            return e2().Q2(((TdApi.MessageSenderUser) messageSender).userId);
        }
        if (constructor == -239660751) {
            return j4(((TdApi.MessageSenderChat) messageSender).chatId);
        }
        throw new IllegalArgumentException(messageSender.toString());
    }

    public boolean Fc(long j10) {
        return Gc(W2(j10));
    }

    public final void Fd(TdApi.UpdateChatPermissions updateChatPermissions) {
        synchronized (this.f28045a0) {
            TdApi.Chat chat = this.f28049b0.get(Long.valueOf(updateChatPermissions.chatId));
            if (!kj.b(updateChatPermissions.chatId, chat, updateChatPermissions)) {
                chat.permissions = updateChatPermissions.permissions;
                this.f28071i0.n1(updateChatPermissions);
            }
        }
    }

    public final void Fe(final TdApi.UpdateServiceNotification updateServiceNotification) {
        final CharSequence t52 = t2.t5(ob.e.y1(updateServiceNotification.content));
        if (t52 != null) {
            hd().post(new Runnable() {
                @Override
                public final void run() {
                    o6.this.K9(updateServiceNotification, t52);
                }
            });
        }
    }

    public String G1() {
        return this.V.U(this.W).w();
    }

    public boolean G2(TdApi.Chat chat) {
        return chat != null && chat.canBeReported;
    }

    public hd.b.a G3(org.drinkless.td.libcore.telegram.TdApi.Chat r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: zd.o6.G3(org.drinkless.td.libcore.telegram.TdApi$Chat, boolean):hd.b$a");
    }

    public long G4(TimeUnit timeUnit) {
        return timeUnit.convert(H4(), TimeUnit.MILLISECONDS);
    }

    public int G5() {
        int i10;
        synchronized (this.f28045a0) {
            i10 = this.f28102s1;
        }
        return i10;
    }

    public void G6() {
        H6(4);
    }

    public void Ga(final Runnable runnable) {
        if (!uc()) {
            v0.D2(runnable);
        } else {
            db(new Runnable() {
                @Override
                public final void run() {
                    o6.this.P8(runnable);
                }
            });
        }
    }

    public long Gb() {
        long j10 = this.f28084m1;
        return j10 != 0 ? j10 : ob.a.c(777000L);
    }

    public boolean Gc(TdApi.Chat chat) {
        if (chat == null || !M6(chat)) {
            return false;
        }
        TdApi.User f42 = f4(chat);
        return f42 == null || !f42.isSupport;
    }

    public final void Gd(TdApi.UpdateChatPhoto updateChatPhoto) {
        synchronized (this.f28045a0) {
            TdApi.Chat chat = this.f28049b0.get(Long.valueOf(updateChatPhoto.chatId));
            if (!kj.b(updateChatPhoto.chatId, chat, updateChatPhoto)) {
                chat.photo = updateChatPhoto.photo;
                this.f28071i0.o1(updateChatPhoto);
            }
        }
    }

    public final void Ge(TdApi.StickerSet stickerSet) {
        this.f28056d0.j(this, stickerSet);
        this.f28059e0.j(this, stickerSet);
        this.f28071i0.K2(stickerSet);
    }

    public String H1(int i10) {
        String G1 = G1();
        return i10 != 0 ? gd.w.j1(R.string.format_accountAndCategory, G1, gd.w.N0(i10)) : G1;
    }

    public boolean H2(TdApi.Message message) {
        return message != null && !k7(message.chatId) && !message.isOutgoing && message.sendingState == null && F2(message.chatId);
    }

    public boolean H3(long j10) {
        TdApi.Supergroup g22;
        if (j10 == 0) {
            return false;
        }
        long p10 = ob.a.p(j10);
        if (p10 == 0 || (g22 = e2().g2(p10)) == null) {
            return false;
        }
        return !ib.i.i(g22.username) || g22.hasLocation;
    }

    public long H4() {
        synchronized (this.f28045a0) {
            if (this.V0 != 0) {
                return TimeUnit.SECONDS.toMillis(this.V0) + (SystemClock.elapsedRealtime() - this.W0);
            }
            return System.currentTimeMillis();
        }
    }

    public z8 H5() {
        return A5(ob.b.f19338a);
    }

    public final void H6(int i10) {
        boolean z10;
        synchronized (this.Z) {
            int incrementAndGet = this.f28119z1.incrementAndGet();
            z10 = incrementAndGet == 1;
            Log.v((int) Log.TAG_ACCOUNTS, "accountId:%d, referenceCount:%d, type:%d", Integer.valueOf(this.W), Integer.valueOf(incrementAndGet), Integer.valueOf(i10));
            if (i10 == 0) {
                A1().O();
            }
            hb();
        }
        if (z10) {
            Te();
            if (i10 == 0) {
                this.V.h0(A1());
            }
        }
    }

    public final <T extends TdApi.Object> void Ha(final long j10, final long j11, final T t10, TdApi.Function function, final Map<String, T> map) {
        final String str = j10 + "_" + j11;
        synchronized (map) {
            try {
                map.put(str, t10);
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        break;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                throw th;
            }
        }
        this.f28071i0.l2(j10, j11);
        v4().o(function, new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                o6.this.R8(map, str, t10, j10, j11, object);
            }
        });
    }

    public final void Hb(TdApi.JsonValue jsonValue, String str) {
        String str2 = this.Y1;
        if (str2 == null || !str2.equals(str)) {
            this.Y1 = str;
            tc().k0(str);
            if (jsonValue != null) {
                La(jsonValue);
            }
        }
    }

    public String Hc() {
        return this.f28057d1;
    }

    public final void Hd(TdApi.UpdateChatPosition updateChatPosition) {
        synchronized (this.f28045a0) {
            TdApi.Chat chat = this.f28049b0.get(Long.valueOf(updateChatPosition.chatId));
            if (!kj.b(updateChatPosition.chatId, chat, updateChatPosition)) {
                int Rb = Rb(chat, updateChatPosition.position);
                h hVar = Rb != 0 ? new h(p3(updateChatPosition.position.list), chat, new g(updateChatPosition.position, Rb)) : null;
                if (hVar != null) {
                    this.f28071i0.r1(updateChatPosition, hVar);
                }
            }
        }
    }

    public final void He(TdApi.UpdateSuggestedActions updateSuggestedActions) {
        TdApi.SuggestedAction[] suggestedActionArr;
        synchronized (this.f28045a0) {
            for (TdApi.SuggestedAction suggestedAction : updateSuggestedActions.removedActions) {
                for (int size = this.f28079k2.size() - 1; size >= 0; size--) {
                    if (this.f28079k2.get(size).getConstructor() == suggestedAction.getConstructor()) {
                        this.f28079k2.remove(size);
                    }
                }
            }
            Collections.addAll(this.f28079k2, updateSuggestedActions.addedActions);
        }
        O9().L2(updateSuggestedActions);
    }

    public boolean I2(long j10) {
        TdApi.ChatMemberStatus O3 = O3(j10);
        if (O3 == null) {
            return false;
        }
        int constructor = O3.getConstructor();
        return constructor == -160019714 || (constructor == -70024163 && ((TdApi.ChatMemberStatusAdministrator) O3).rights.canRestrictMembers);
    }

    public boolean I3(TdApi.Chat chat) {
        return !ib.i.i(K3(chat));
    }

    public void I4() {
        L4(6);
    }

    public CharSequence I5(TdApi.Chat chat) {
        return Z5(chat, R.id.right_sendMedia, R.string.ChatDisabledMedia, R.string.ChatRestrictedMedia, R.string.ChatRestrictedMediaUntil);
    }

    public void I6() {
        H6(0);
    }

    public final void Ia(kb.j<Client> jVar, Runnable runnable) {
        synchronized (this.Z) {
            if (!this.f28117y1) {
                k y42 = y4();
                Client client = y42 != null ? y42.f28145b : null;
                if (client != null) {
                    jVar.a(client);
                } else if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    public void Ib(String str, String str2) {
        this.M1 = str;
        this.N1 = str2;
    }

    public TdApi.LanguagePackInfo Ic() {
        return this.f28060e1;
    }

    public final void Ie(TdApi.UpdateSupergroup updateSupergroup) {
        TdApi.Chat chat;
        synchronized (this.f28045a0) {
            chat = this.f28049b0.get(Long.valueOf(ob.a.b(updateSupergroup.supergroup.f19965id)));
            if (chat != null) {
                TdApi.ChatType chatType = chat.type;
                boolean z10 = ((TdApi.ChatTypeSupergroup) chatType).isChannel;
                boolean z11 = updateSupergroup.supergroup.isChannel;
                if (z10 != z11) {
                    ((TdApi.ChatTypeSupergroup) chatType).isChannel = z11;
                    long j10 = ((TdApi.ChatTypeSupergroup) chatType).supergroupId;
                    if (z11) {
                        this.f28098r0.add(Long.valueOf(j10));
                    } else {
                        this.f28098r0.remove(Long.valueOf(j10));
                    }
                }
            }
        }
        this.f28068h0.n1(updateSupergroup, chat);
    }

    public final void J1(long j10, long j11, boolean z10) {
        int size;
        synchronized (this.f28067g2) {
            int size2 = this.f28067g2.size();
            String str = j10 + "_" + j11;
            if (z10) {
                this.f28067g2.add(str);
            } else {
                this.f28067g2.remove(str);
            }
            size = this.f28067g2.size() - size2;
        }
        int i10 = 0;
        if (size > 0) {
            while (i10 < size) {
                H6(8);
                i10++;
            }
        } else if (size < 0) {
            while (i10 < (-size)) {
                L4(8);
                i10++;
            }
        }
    }

    public boolean J2(long j10) {
        return ob.a.i(j10) && !k7(j10) && !L6(j10);
    }

    public String J3(long j10) {
        return K3(P3(j10));
    }

    public void J4() {
        L4(1);
    }

    public void J5(final long j10, final long j11, final kb.j<TdApi.Message> jVar) {
        v4().o(new TdApi.GetMessageLocally(j10, j11), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                o6.this.l8(jVar, j10, j11, object);
            }
        });
    }

    public void J6() {
        x4().m();
    }

    public int Ja() {
        return this.E0;
    }

    public void Jb(boolean z10) {
        if (this.T0 != z10) {
            this.T0 = z10;
            v4().o(new TdApi.SetOption("archive_and_mute_new_chats_from_unknown_users", new TdApi.OptionValueBoolean(z10)), this.M);
        }
    }

    public int Jc() {
        return this.f28107u0;
    }

    public final void Jd(TdApi.UpdateChatReadInbox updateChatReadInbox) {
        synchronized (this.f28045a0) {
            TdApi.Chat chat = this.f28049b0.get(Long.valueOf(updateChatReadInbox.chatId));
            if (!kj.b(updateChatReadInbox.chatId, chat, updateChatReadInbox)) {
                chat.lastReadInboxMessageId = updateChatReadInbox.lastReadInboxMessageId;
                boolean z10 = true;
                boolean z11 = chat.unreadCount > 0;
                int i10 = updateChatReadInbox.unreadCount;
                if (z11 == (i10 > 0)) {
                    z10 = false;
                }
                chat.unreadCount = i10;
                this.f28071i0.t1(updateChatReadInbox, z10, chat, q3(chat.positions));
            }
        }
    }

    public final void Je(TdApi.UpdateTermsOfService updateTermsOfService) {
        hd().sendMessage(hd().obtainMessage(9, updateTermsOfService));
    }

    public boolean K1(f fVar) {
        if (fVar == null) {
            return false;
        }
        for (TdApi.Message message : fVar.f28132a) {
            if (Y9(message)) {
                return true;
            }
        }
        return false;
    }

    public boolean K2(TdApi.Chat chat) {
        return Y5(chat, R.id.right_sendMedia) == null;
    }

    public String K3(TdApi.Chat chat) {
        TdApi.User f42;
        if (chat == null || !he.i.c2().P2()) {
            return null;
        }
        int constructor = chat.type.getConstructor();
        if (constructor == -1472570774) {
            TdApi.Supergroup g22 = e2().g2(ob.a.p(chat.f19908id));
            if (g22 == null || ib.i.i(g22.restrictionReason)) {
                return null;
            }
            return g22.restrictionReason;
        } else if ((constructor == 862366513 || constructor == 1579049844) && (f42 = f4(chat)) != null && !ib.i.i(f42.restrictionReason)) {
            return f42.restrictionReason;
        } else {
            return null;
        }
    }

    public void K4() {
        L4(4);
    }

    public void K5(TdApi.Message message, boolean z10, boolean z11, final kb.j<m> jVar) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final a aVar = (message.sendingState != null || ob.a.l(message.chatId) || ob.d.i(message.f19946id) == 0 || z11) ? null : new a(atomicBoolean, message, z10, jVar);
        v4().o(new TdApi.GetMessageLink(message.chatId, message.f19946id, 0, z10, z11), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                o6.this.n8(atomicBoolean, aVar, jVar, object);
            }
        });
        if (aVar != null) {
            hd().postDelayed(aVar, 500L);
        }
    }

    public boolean K6() {
        TdApi.AuthorizationState authorizationState = this.J1;
        return authorizationState != null && authorizationState.getConstructor() == -1834871737;
    }

    public int Ka() {
        return this.D0;
    }

    public final void Kb(TdApi.Chat chat, final String str) {
        if (chat != null) {
            synchronized (this.f28045a0) {
                if (!ib.i.c(chat.clientData, str)) {
                    chat.clientData = str;
                    final long j10 = chat.f19908id;
                    v4().o(new TdApi.SetChatClientData(j10, str), new Client.g() {
                        @Override
                        public final void r2(TdApi.Object object) {
                            o6.this.h9(j10, str, object);
                        }
                    });
                }
            }
        }
    }

    public void Kc(final long j10, final Runnable runnable, final boolean z10, boolean z11) {
        int i10 = this.W;
        Object[] objArr = new Object[5];
        boolean z12 = false;
        objArr[0] = Boolean.valueOf(z10);
        objArr[1] = Boolean.valueOf(z11);
        if (runnable != null) {
            z12 = true;
        }
        objArr[2] = Boolean.valueOf(z12);
        objArr[3] = Integer.valueOf(this.Y);
        objArr[4] = Integer.valueOf(T1());
        b.a.a(j10, i10, "Performing sync needNotification: %b, needNetworkRequest: %b, hasAfter: %b. Awaiting connection. Connection state: %d, status: %d", objArr);
        H6(3);
        final Runnable q3Var = new Runnable() {
            @Override
            public final void run() {
                o6.this.z9(runnable, z10, j10);
            }
        };
        if (z11) {
            X1(new Runnable() {
                @Override
                public final void run() {
                    o6.this.x9(j10, q3Var);
                }
            });
        } else {
            X1(q3Var);
        }
    }

    public final void Kd(TdApi.UpdateChatReadOutbox updateChatReadOutbox) {
        synchronized (this.f28045a0) {
            TdApi.Chat chat = this.f28049b0.get(Long.valueOf(updateChatReadOutbox.chatId));
            if (!kj.b(updateChatReadOutbox.chatId, chat, updateChatReadOutbox)) {
                chat.lastReadOutboxMessageId = updateChatReadOutbox.lastReadOutboxMessageId;
                this.f28071i0.u1(updateChatReadOutbox);
            }
        }
    }

    public final void Ke(TdApi.UpdateTrendingStickerSets updateTrendingStickerSets) {
        int G;
        synchronized (this.f28045a0) {
            G = t2.G(updateTrendingStickerSets.stickerSets);
            this.f28113w1 = G;
        }
        this.f28071i0.O2(updateTrendingStickerSets, G);
    }

    public boolean L1() {
        return this.H0;
    }

    public boolean L2(TdApi.Chat chat) {
        return Y5(chat, R.id.right_sendStickersAndGifs) == null;
    }

    public boolean L3(TdApi.Chat chat) {
        TdApi.User f42;
        if (chat == null) {
            return false;
        }
        int constructor = chat.type.getConstructor();
        if (constructor != -1472570774) {
            return (constructor == 862366513 || constructor == 1579049844) && (f42 = f4(chat)) != null && f42.isScam;
        }
        TdApi.Supergroup g22 = e2().g2(ob.a.p(chat.f19908id));
        return g22 != null && g22.isScam;
    }

    public final void L4(int i10) {
        synchronized (this.Z) {
            int decrementAndGet = this.f28119z1.decrementAndGet();
            if (decrementAndGet >= 0) {
                Log.v((int) Log.TAG_ACCOUNTS, "accountId:%d, referenceCount:%d, type:%d", Integer.valueOf(this.W), Integer.valueOf(decrementAndGet), Integer.valueOf(i10));
                hb();
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("type == " + i10);
                Tracer.h(illegalStateException);
                throw illegalStateException;
            }
        }
    }

    public TdApi.Message L5(long j10, long j11) {
        if (D6()) {
            return null;
        }
        TdApi.Object w42 = w4(new TdApi.GetMessageLocally(j10, j11), 0L);
        if (w42 instanceof TdApi.Message) {
            return (TdApi.Message) w42;
        }
        if (w42 instanceof TdApi.Error) {
            Log.i("Could not get message: %s, chatId:%s, messageId:%s", t2.z5(w42), Long.valueOf(j10), Long.valueOf(j11));
        }
        return null;
    }

    public boolean L6(long j10) {
        return e2().y2(h4(j10));
    }

    public final void La(TdApi.JsonValue jsonValue) {
        TdApi.JsonObjectMember[] jsonObjectMemberArr;
        char c10;
        TdApi.JsonObjectMember[] jsonObjectMemberArr2;
        char c11;
        if (jsonValue instanceof TdApi.JsonValueObject) {
            for (TdApi.JsonObjectMember jsonObjectMember : ((TdApi.JsonValueObject) jsonValue).members) {
                if (!ib.i.i(jsonObjectMember.key)) {
                    String str = jsonObjectMember.key;
                    str.hashCode();
                    boolean z10 = true;
                    switch (str.hashCode()) {
                        case -1919055391:
                            if (str.equals("qr_login_code")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1688620344:
                            if (str.equals("dialog_filters_tooltip")) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1683918311:
                            if (str.equals("qr_login_camera")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -594881204:
                            if (str.equals("stickers_emoji_cache_time")) {
                                c10 = 3;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -76561797:
                            if (str.equals("youtube_pip")) {
                                c10 = 4;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -24016028:
                            if (str.equals("emojies_animated_zoom")) {
                                c10 = 5;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 3556498:
                            if (str.equals("test")) {
                                c10 = 6;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 169095108:
                            if (str.equals("stickers_emoji_suggest_only_api")) {
                                c10 = 7;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 676199595:
                            if (str.equals("groupcall_video_participants_max")) {
                                c10 = '\b';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1322701672:
                            if (str.equals("round_video_encoding")) {
                                c10 = '\t';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1483286962:
                            if (str.equals("rtc_servers")) {
                                c10 = '\n';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1850325103:
                            if (str.equals("emojies_sounds")) {
                                c10 = 11;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 2136829446:
                            if (str.equals("dialog_filters_enabled")) {
                                c10 = '\f';
                                break;
                            }
                            c10 = 65535;
                            break;
                        default:
                            c10 = 65535;
                            break;
                    }
                    switch (c10) {
                        case 0:
                            TdApi.JsonValue jsonValue2 = jsonObjectMember.value;
                            if (!(jsonValue2 instanceof TdApi.JsonValueString)) {
                                break;
                            } else {
                                this.K0 = ((TdApi.JsonValueString) jsonValue2).value;
                                continue;
                            }
                        case 1:
                            TdApi.JsonValue jsonValue3 = jsonObjectMember.value;
                            if (jsonValue3 instanceof TdApi.JsonValueBoolean) {
                                this.I0 = ((TdApi.JsonValueBoolean) jsonValue3).value;
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            TdApi.JsonValue jsonValue4 = jsonObjectMember.value;
                            if (jsonValue4 instanceof TdApi.JsonValueBoolean) {
                                this.H0 = ((TdApi.JsonValueBoolean) jsonValue4).value;
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                        case 6:
                        case 11:
                            break;
                        case 4:
                            TdApi.JsonValue jsonValue5 = jsonObjectMember.value;
                            if (!(jsonValue5 instanceof TdApi.JsonValueString) || !"disabled".equals(((TdApi.JsonValueString) jsonValue5).value)) {
                                z10 = false;
                            }
                            this.G0 = z10;
                            continue;
                        case 5:
                            TdApi.JsonValue jsonValue6 = jsonObjectMember.value;
                            if (jsonValue6 instanceof TdApi.JsonValueNumber) {
                                this.F0 = Math.max(0.75d, ib.h.b(((TdApi.JsonValueNumber) jsonValue6).value));
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            TdApi.JsonValue jsonValue7 = jsonObjectMember.value;
                            if (jsonValue7 instanceof TdApi.JsonValueBoolean) {
                                this.f28110v0 = ((TdApi.JsonValueBoolean) jsonValue7).value;
                                break;
                            } else {
                                continue;
                            }
                        case '\b':
                            TdApi.JsonValue jsonValue8 = jsonObjectMember.value;
                            if (jsonValue8 instanceof TdApi.JsonValueNumber) {
                                this.f28112w0 = (int) ((TdApi.JsonValueNumber) jsonValue8).value;
                                break;
                            } else {
                                continue;
                            }
                        case '\t':
                            TdApi.JsonValue jsonValue9 = jsonObjectMember.value;
                            if (jsonValue9 instanceof TdApi.JsonValueObject) {
                                for (TdApi.JsonObjectMember jsonObjectMember2 : ((TdApi.JsonValueObject) jsonValue9).members) {
                                    TdApi.JsonValue jsonValue10 = jsonObjectMember2.value;
                                    if (jsonValue10 instanceof TdApi.JsonValueNumber) {
                                        long j10 = (long) ((TdApi.JsonValueNumber) jsonValue10).value;
                                        String str2 = jsonObjectMember2.key;
                                        str2.hashCode();
                                        switch (str2.hashCode()) {
                                            case -233204595:
                                                if (str2.equals("diameter")) {
                                                    c11 = 0;
                                                    break;
                                                }
                                                c11 = 65535;
                                                break;
                                            case 258902020:
                                                if (str2.equals("audio_bitrate")) {
                                                    c11 = 1;
                                                    break;
                                                }
                                                c11 = 65535;
                                                break;
                                            case 408072700:
                                                if (str2.equals("max_size")) {
                                                    c11 = 2;
                                                    break;
                                                }
                                                c11 = 65535;
                                                break;
                                            case 1924434857:
                                                if (str2.equals("video_bitrate")) {
                                                    c11 = 3;
                                                    break;
                                                }
                                                c11 = 65535;
                                                break;
                                            default:
                                                c11 = 65535;
                                                break;
                                        }
                                        switch (c11) {
                                            case 0:
                                                this.A0 = j10;
                                                break;
                                            case 1:
                                                this.f28116y0 = j10;
                                                break;
                                            case 2:
                                                this.f28118z0 = j10;
                                                break;
                                            case 3:
                                                this.f28114x0 = j10;
                                                break;
                                        }
                                    }
                                }
                                break;
                            } else {
                                continue;
                            }
                            break;
                        case '\n':
                            TdApi.JsonValue jsonValue11 = jsonObjectMember.value;
                            if (jsonValue11 instanceof TdApi.JsonValueArray) {
                                TdApi.JsonValue[] jsonValueArr = ((TdApi.JsonValueArray) jsonValue11).values;
                                ArrayList arrayList = new ArrayList(jsonValueArr.length);
                                for (TdApi.JsonValue jsonValue12 : jsonValueArr) {
                                    if (jsonValue12 instanceof TdApi.JsonValueObject) {
                                        try {
                                            arrayList.add(new o((TdApi.JsonValueObject) jsonValue12));
                                        } catch (IllegalArgumentException unused) {
                                        }
                                    }
                                }
                                this.U0 = (o[]) arrayList.toArray(new o[0]);
                                break;
                            } else {
                                continue;
                            }
                        case '\f':
                            TdApi.JsonValue jsonValue13 = jsonObjectMember.value;
                            if (jsonValue13 instanceof TdApi.JsonValueBoolean) {
                                this.J0 = ((TdApi.JsonValueBoolean) jsonValue13).value;
                                break;
                            } else {
                                continue;
                            }
                        default:
                            if (Log.isEnabled(Log.TAG_TDLIB_OPTIONS)) {
                                Log.i((int) Log.TAG_TDLIB_OPTIONS, "appConfig: %s -> %s", jsonObjectMember.key, jsonObjectMember.value);
                                break;
                            } else {
                                continue;
                            }
                    }
                }
            }
        }
    }

    public void Lb(final long j10, final TdApi.MessageSender messageSender, final TdApi.ChatMemberStatus chatMemberStatus, int i10, final TdApi.ChatMemberStatus chatMemberStatus2, final i iVar) {
        if (!ob.a.g(j10) || !t2.z4(chatMemberStatus)) {
            Nb(j10, messageSender, chatMemberStatus, i10, chatMemberStatus2, iVar);
            return;
        }
        final Runnable i3Var = new Runnable() {
            @Override
            public final void run() {
                o6.this.j9(j10, messageSender, chatMemberStatus, chatMemberStatus2, iVar);
            }
        };
        if (i10 <= 0 || messageSender.getConstructor() != -336109341 || !t2.i3(chatMemberStatus, false) || t2.i3(chatMemberStatus2, false)) {
            i3Var.run();
        } else {
            v4().o(new TdApi.AddChatMember(j10, ((TdApi.MessageSenderUser) messageSender).userId, i10), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    o6.this.l9(i3Var, iVar, object);
                }
            });
        }
    }

    public TdApi.Chat Lc(TdApi.Chat chat) {
        return this.f28062f0.contains(Long.valueOf(chat.f19908id)) ? chat : R3(chat.f19908id);
    }

    public final void Ld(TdApi.UpdateChatReplyMarkup updateChatReplyMarkup) {
        synchronized (this.f28045a0) {
            TdApi.Chat chat = this.f28049b0.get(Long.valueOf(updateChatReplyMarkup.chatId));
            if (!kj.b(updateChatReplyMarkup.chatId, chat, updateChatReplyMarkup)) {
                chat.replyMarkupMessageId = updateChatReplyMarkup.replyMarkupMessageId;
                this.f28071i0.x1(updateChatReplyMarkup);
            }
        }
    }

    public final void Le(TdApi.UpdateUnreadChatCount updateUnreadChatCount) {
        if (rc(updateUnreadChatCount.chatList, updateUnreadChatCount.totalCount, updateUnreadChatCount.unreadCount, updateUnreadChatCount.unreadUnmutedCount, updateUnreadChatCount.markedAsUnreadCount, updateUnreadChatCount.markedAsUnreadUnmutedCount) && this.f28090o1.d(this)) {
            hj hd2 = hd();
            hj hd3 = hd();
            int b10 = this.f28090o1.b();
            boolean c10 = this.f28090o1.c();
            hd2.sendMessage(hd3.obtainMessage(3, b10, c10 ? 1 : 0, updateUnreadChatCount.chatList));
        }
    }

    public void M1(final TdApi.LanguagePackInfo languagePackInfo, final kb.i iVar, boolean z10) {
        final Runnable u3Var = new Runnable() {
            @Override
            public final void run() {
                o6.this.F7(languagePackInfo, iVar);
            }
        };
        if (!z10 || t2.g3(languagePackInfo.f19945id)) {
            u3Var.run();
        } else {
            Nc(languagePackInfo, new kb.i() {
                @Override
                public final void a(boolean z11) {
                    o6.this.H7(u3Var, iVar, z11);
                }
            });
        }
    }

    public boolean M2(long j10) {
        if (j10 == 0) {
            return false;
        }
        if (ob.a.l(j10)) {
            return L6(j10);
        }
        TdApi.ChatMemberStatus O3 = O3(j10);
        if (O3 != null) {
            int constructor = O3.getConstructor();
            if (constructor == -160019714 || constructor == -70024163) {
                return true;
            }
            if (constructor == 1661432998 && !((TdApi.ChatMemberStatusRestricted) O3).permissions.canSendPolls) {
                return false;
            }
        }
        TdApi.Chat W2 = W2(j10);
        return W2 != null && W2.permissions.canSendPolls;
    }

    public TdApi.ChatNotificationSettings M3(long j10) {
        TdApi.Chat W2 = W2(j10);
        if (W2 != null) {
            return W2.notificationSettings;
        }
        return null;
    }

    public void M4() {
        L4(0);
    }

    public CharSequence M5(TdApi.Chat chat) {
        return Z5(chat, R.id.right_sendMessages, R.string.ChatDisabledMessages, R.string.ChatRestrictedMessages, R.string.ChatRestrictedMessagesUntil);
    }

    public boolean M6(TdApi.Chat chat) {
        return e2().y2(i4(chat));
    }

    public void Ma(final long j10, String str, final Runnable runnable) {
        int i10 = this.W;
        boolean z10 = true;
        Object[] objArr = new Object[1];
        if (runnable == null) {
            z10 = false;
        }
        objArr[0] = Boolean.valueOf(z10);
        b.a.a(j10, i10, "Started processing push notification, hasAfter:%b", objArr);
        G6();
        v4().o(new TdApi.ProcessPushNotification(str), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                o6.this.Y8(j10, runnable, object);
            }
        });
    }

    public void Mb(long j10, TdApi.MessageSender messageSender, TdApi.ChatMemberStatus chatMemberStatus, TdApi.ChatMemberStatus chatMemberStatus2, i iVar) {
        Lb(j10, messageSender, chatMemberStatus, 0, chatMemberStatus2, iVar);
    }

    public final void Mc(final String str, final kb.i iVar) {
        v4().o(new TdApi.SynchronizeLanguagePack(str), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                o6.C9(str, iVar, object);
            }
        });
    }

    public final void Md(TdApi.UpdateChatTheme updateChatTheme) {
        synchronized (this.f28045a0) {
            TdApi.Chat chat = this.f28049b0.get(Long.valueOf(updateChatTheme.chatId));
            if (!kj.b(updateChatTheme.chatId, chat, updateChatTheme)) {
                chat.themeName = updateChatTheme.themeName;
                this.f28071i0.A1(updateChatTheme, chat, q3(chat.positions));
            }
        }
    }

    public final void Me(TdApi.UpdateUnreadMessageCount updateUnreadMessageCount) {
        if (sc(updateUnreadMessageCount.chatList, updateUnreadMessageCount.unreadCount, updateUnreadMessageCount.unreadUnmutedCount) && this.f28090o1.d(this)) {
            hj hd2 = hd();
            hj hd3 = hd();
            int b10 = this.f28090o1.b();
            boolean c10 = this.f28090o1.c();
            hd2.sendMessage(hd3.obtainMessage(3, b10, c10 ? 1 : 0, updateUnreadMessageCount.chatList));
        }
    }

    public boolean N1() {
        return this.Y0;
    }

    public boolean N2(TdApi.Chat chat) {
        return chat != null && chat.type.getConstructor() == 862366513;
    }

    public TdApi.ChatSource N3(TdApi.ChatList chatList, long j10) {
        TdApi.ChatPosition a10;
        if (j10 == 0 || (a10 = ob.b.a(W2(j10), chatList)) == null) {
            return null;
        }
        return a10.source;
    }

    public void N4(final kb.i iVar) {
        Log.i("Clearing data... accountId:%d", Integer.valueOf(this.W));
        final long uptimeMillis = SystemClock.uptimeMillis();
        v4().o(new TdApi.OptimizeStorage(0L, 0, 0, 0, new TdApi.FileType[]{new TdApi.FileTypeAnimation(), new TdApi.FileTypeAudio(), new TdApi.FileTypeDocument(), new TdApi.FileTypePhoto(), new TdApi.FileTypeProfilePhoto(), new TdApi.FileTypeSecret(), new TdApi.FileTypeSecretThumbnail(), new TdApi.FileTypeSecure(), new TdApi.FileTypeSticker(), new TdApi.FileTypeThumbnail(), new TdApi.FileTypeUnknown(), new TdApi.FileTypeVideo(), new TdApi.FileTypeVideoNote(), new TdApi.FileTypeVoiceNote(), new TdApi.FileTypeWallpaper()}, null, null, false, 0), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                o6.this.V7(uptimeMillis, iVar, object);
            }
        });
    }

    public final long N5() {
        if (he.i.c2().d0()) {
            return TimeUnit.SECONDS.toMillis(1L);
        }
        if (!F4().i1()) {
            return TimeUnit.SECONDS.toMillis(5L);
        }
        if (this.V.A0() == 1) {
            return TimeUnit.MINUTES.toMillis(15L);
        }
        ya yaVar = this.V;
        int i10 = this.W;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int y02 = yaVar.y0(i10, timeUnit.toMillis(15L));
        if (y02 == -1) {
            return TimeUnit.SECONDS.toMillis(5L);
        }
        if (y02 < 3) {
            return timeUnit.toMillis(15L);
        }
        if (y02 < 5) {
            return timeUnit.toMillis(7L);
        }
        if (y02 < 10) {
            return timeUnit.toMillis(2L);
        }
        return TimeUnit.SECONDS.toMillis(5L);
    }

    public boolean N6(long j10) {
        return j10 == ob.a.c(93372553L) || "BotFather".equals(j4(j10));
    }

    public String N9() {
        return this.f28052c.systemLanguageCode;
    }

    public final void Na(k kVar, TdApi.Update update) {
        switch (update.getConstructor()) {
            case TdApi.UpdateChatUnreadMentionCount.CONSTRUCTOR:
                Pd((TdApi.UpdateChatUnreadMentionCount) update);
                return;
            case TdApi.UpdateChatUnreadReactionCount.CONSTRUCTOR:
                Qd((TdApi.UpdateChatUnreadReactionCount) update);
                return;
            case TdApi.UpdateChatMember.CONSTRUCTOR:
            case TdApi.UpdateNewCallbackQuery.CONSTRUCTOR:
            case TdApi.UpdatePoll.CONSTRUCTOR:
            case TdApi.UpdatePollAnswer.CONSTRUCTOR:
            case TdApi.UpdateNewChosenInlineResult.CONSTRUCTOR:
            case TdApi.UpdateNewCustomQuery.CONSTRUCTOR:
            case TdApi.UpdateNewInlineCallbackQuery.CONSTRUCTOR:
            case TdApi.UpdateNewChatJoinRequest.CONSTRUCTOR:
            case TdApi.UpdateNewShippingQuery.CONSTRUCTOR:
            case TdApi.UpdateNewPreCheckoutQuery.CONSTRUCTOR:
            case TdApi.UpdateNewInlineQuery.CONSTRUCTOR:
            case TdApi.UpdateNewCustomEvent.CONSTRUCTOR:
                Log.unexpectedTdlibResponse(update, null, TdApi.Update.class);
                return;
            case TdApi.UpdateChatIsBlocked.CONSTRUCTOR:
                zd((TdApi.UpdateChatIsBlocked) update);
                return;
            case TdApi.UpdateNotification.CONSTRUCTOR:
                Ba((TdApi.UpdateNotification) update);
                return;
            case TdApi.UpdateFileGenerationStop.CONSTRUCTOR:
                be((TdApi.UpdateFileGenerationStop) update);
                return;
            case TdApi.UpdateChatAction.CONSTRUCTOR:
                Rd((TdApi.UpdateChatAction) update);
                return;
            case TdApi.UpdateSecretChat.CONSTRUCTOR:
                this.f28068h0.m1((TdApi.UpdateSecretChat) update);
                return;
            case TdApi.UpdateChatPermissions.CONSTRUCTOR:
                Fd((TdApi.UpdateChatPermissions) update);
                return;
            case TdApi.UpdateChatThemes.CONSTRUCTOR:
                Nd((TdApi.UpdateChatThemes) update);
                return;
            case TdApi.UpdateAnimatedEmojiMessageClicked.CONSTRUCTOR:
                ld((TdApi.UpdateAnimatedEmojiMessageClicked) update);
                return;
            case TdApi.UpdateMessageContentOpened.CONSTRUCTOR:
                ke((TdApi.UpdateMessageContentOpened) update);
                return;
            case TdApi.UpdateUsersNearby.CONSTRUCTOR:
                Ne((TdApi.UpdateUsersNearby) update);
                return;
            case TdApi.UpdateMessageInteractionInfo.CONSTRUCTOR:
                me((TdApi.UpdateMessageInteractionInfo) update);
                return;
            case TdApi.UpdateMessageLiveLocationViewed.CONSTRUCTOR:
                ie((TdApi.UpdateMessageLiveLocationViewed) update);
                return;
            case TdApi.UpdateActiveNotifications.CONSTRUCTOR:
                ya((TdApi.UpdateActiveNotifications) update);
                return;
            case TdApi.UpdateTermsOfService.CONSTRUCTOR:
                Je((TdApi.UpdateTermsOfService) update);
                return;
            case TdApi.UpdateScopeNotificationSettings.CONSTRUCTOR:
                xe((TdApi.UpdateScopeNotificationSettings) update);
                return;
            case TdApi.UpdateAnimationSearchParameters.CONSTRUCTOR:
                md((TdApi.UpdateAnimationSearchParameters) update);
                return;
            case TdApi.UpdateReactions.CONSTRUCTOR:
                Ce((TdApi.UpdateReactions) update);
                return;
            case TdApi.UpdateDiceEmojis.CONSTRUCTOR:
                Ud(((TdApi.UpdateDiceEmojis) update).emojis);
                return;
            case TdApi.UpdateLanguagePackStrings.CONSTRUCTOR:
                ge((TdApi.UpdateLanguagePackStrings) update);
                return;
            case TdApi.UpdateMessageSendFailed.CONSTRUCTOR:
                pe((TdApi.UpdateMessageSendFailed) update);
                return;
            case TdApi.UpdateBasicGroup.CONSTRUCTOR:
                this.f28068h0.g1((TdApi.UpdateBasicGroup) update);
                return;
            case TdApi.UpdateChatFilters.CONSTRUCTOR:
                wd((TdApi.UpdateChatFilters) update);
                return;
            case TdApi.UpdateChatLastMessage.CONSTRUCTOR:
                Bd((TdApi.UpdateChatLastMessage) update);
                return;
            case TdApi.UpdateUserPrivacySettingRules.CONSTRUCTOR:
                Be((TdApi.UpdateUserPrivacySettingRules) update);
                return;
            case TdApi.UpdateChatNotificationSettings.CONSTRUCTOR:
                we((TdApi.UpdateChatNotificationSettings) update);
                return;
            case TdApi.UpdateGroupCallParticipant.CONSTRUCTOR:
                ee((TdApi.UpdateGroupCallParticipant) update);
                return;
            case TdApi.UpdateChatReadInbox.CONSTRUCTOR:
                Jd((TdApi.UpdateChatReadInbox) update);
                return;
            case TdApi.UpdateChatActionBar.CONSTRUCTOR:
                rd((TdApi.UpdateChatActionBar) update);
                return;
            case TdApi.UpdateChatMessageTtl.CONSTRUCTOR:
                Cd((TdApi.UpdateChatMessageTtl) update);
                return;
            case TdApi.UpdateNewMessage.CONSTRUCTOR:
                ue((TdApi.UpdateNewMessage) update, true);
                return;
            case TdApi.UpdateMessageEdited.CONSTRUCTOR:
                le((TdApi.UpdateMessageEdited) update);
                return;
            case TdApi.UpdateFileDownloads.CONSTRUCTOR:
                Zd((TdApi.UpdateFileDownloads) update);
                return;
            case TdApi.UpdateChatPhoto.CONSTRUCTOR:
                Gd((TdApi.UpdateChatPhoto) update);
                return;
            case TdApi.UpdateMessageMentionRead.CONSTRUCTOR:
                oe((TdApi.UpdateMessageMentionRead) update);
                return;
            case TdApi.UpdateChatTitle.CONSTRUCTOR:
                Od((TdApi.UpdateChatTitle) update);
                return;
            case TdApi.UpdateSupergroup.CONSTRUCTOR:
                Ie((TdApi.UpdateSupergroup) update);
                return;
            case TdApi.UpdateUserFullInfo.CONSTRUCTOR:
                this.f28068h0.q1((TdApi.UpdateUserFullInfo) update);
                return;
            case TdApi.UpdateChatPosition.CONSTRUCTOR:
                Hd((TdApi.UpdateChatPosition) update);
                return;
            case TdApi.UpdateSavedAnimations.CONSTRUCTOR:
                Ee((TdApi.UpdateSavedAnimations) update);
                return;
            case TdApi.UpdateUnreadMessageCount.CONSTRUCTOR:
                Me((TdApi.UpdateUnreadMessageCount) update);
                return;
            case TdApi.UpdateFile.CONSTRUCTOR:
                TdApi.UpdateFile updateFile = (TdApi.UpdateFile) update;
                if (Log.isEnabled(Log.TAG_TDLIB_FILES)) {
                    Log.i((int) Log.TAG_TDLIB_FILES, "updateFile id=%d size=%d expectedSize=%d remote=%s local=%s", Integer.valueOf(updateFile.file.f19913id), Integer.valueOf(updateFile.file.size), Integer.valueOf(updateFile.file.expectedSize), updateFile.file.remote.toString(), updateFile.file.local.toString());
                }
                Wd(updateFile);
                return;
            case TdApi.UpdateHavePendingNotifications.CONSTRUCTOR:
                za((TdApi.UpdateHavePendingNotifications) update);
                return;
            case TdApi.UpdateFileGenerationStart.CONSTRUCTOR:
                ae((TdApi.UpdateFileGenerationStart) update);
                return;
            case TdApi.UpdateAttachmentMenuBots.CONSTRUCTOR:
                nd((TdApi.UpdateAttachmentMenuBots) update);
                return;
            case TdApi.UpdateChatPendingJoinRequests.CONSTRUCTOR:
                Ed((TdApi.UpdateChatPendingJoinRequests) update);
                return;
            case TdApi.UpdateSupergroupFullInfo.CONSTRUCTOR:
                this.f28068h0.o1((TdApi.UpdateSupergroupFullInfo) update);
                return;
            case TdApi.UpdateTrendingStickerSets.CONSTRUCTOR:
                Ke((TdApi.UpdateTrendingStickerSets) update);
                return;
            case TdApi.UpdateChatDefaultDisableNotification.CONSTRUCTOR:
                td((TdApi.UpdateChatDefaultDisableNotification) update);
                return;
            case TdApi.UpdateChatOnlineMemberCount.CONSTRUCTOR:
                Dd((TdApi.UpdateChatOnlineMemberCount) update);
                return;
            case TdApi.UpdateMessageContent.CONSTRUCTOR:
                je((TdApi.UpdateMessageContent) update);
                return;
            case TdApi.UpdateNewCallSignalingData.CONSTRUCTOR:
                qd((TdApi.UpdateNewCallSignalingData) update);
                return;
            case TdApi.UpdateChatVideoChat.CONSTRUCTOR:
                Sd((TdApi.UpdateChatVideoChat) update);
                return;
            case TdApi.UpdateChatReadOutbox.CONSTRUCTOR:
                Kd((TdApi.UpdateChatReadOutbox) update);
                return;
            case TdApi.UpdateGroupCall.CONSTRUCTOR:
                de((TdApi.UpdateGroupCall) update);
                return;
            case TdApi.UpdateChatTheme.CONSTRUCTOR:
                Md((TdApi.UpdateChatTheme) update);
                return;
            case TdApi.UpdateFileDownload.CONSTRUCTOR:
                Yd((TdApi.UpdateFileDownload) update);
                return;
            case TdApi.UpdateOption.CONSTRUCTOR:
                ye(kVar, (TdApi.UpdateOption) update);
                return;
            case TdApi.UpdateMessageUnreadReactions.CONSTRUCTOR:
                re((TdApi.UpdateMessageUnreadReactions) update);
                return;
            case TdApi.UpdateUserStatus.CONSTRUCTOR:
                this.f28068h0.r1((TdApi.UpdateUserStatus) update);
                return;
            case TdApi.UpdateMessageIsPinned.CONSTRUCTOR:
                ne((TdApi.UpdateMessageIsPinned) update);
                return;
            case TdApi.UpdateInstalledStickerSets.CONSTRUCTOR:
                fe((TdApi.UpdateInstalledStickerSets) update);
                return;
            case TdApi.UpdateUser.CONSTRUCTOR:
                this.f28068h0.p1((TdApi.UpdateUser) update);
                return;
            case TdApi.UpdateMessageSendAcknowledged.CONSTRUCTOR:
                this.f28083m0.e((TdApi.UpdateMessageSendAcknowledged) update);
                return;
            case TdApi.UpdateChatReplyMarkup.CONSTRUCTOR:
                Ld((TdApi.UpdateChatReplyMarkup) update);
                return;
            case TdApi.UpdateServiceNotification.CONSTRUCTOR:
                Fe((TdApi.UpdateServiceNotification) update);
                return;
            case TdApi.UpdateCall.CONSTRUCTOR:
                pd((TdApi.UpdateCall) update);
                return;
            case TdApi.UpdateNotificationGroup.CONSTRUCTOR:
                Ca((TdApi.UpdateNotificationGroup) update);
                return;
            case TdApi.UpdateBasicGroupFullInfo.CONSTRUCTOR:
                this.f28068h0.h1((TdApi.UpdateBasicGroupFullInfo) update);
                return;
            case TdApi.UpdateChatDraftMessage.CONSTRUCTOR:
                vd((TdApi.UpdateChatDraftMessage) update);
                return;
            case TdApi.UpdateSuggestedActions.CONSTRUCTOR:
                He((TdApi.UpdateSuggestedActions) update);
                return;
            case TdApi.UpdateChatAvailableReactions.CONSTRUCTOR:
                sd((TdApi.UpdateChatAvailableReactions) update);
                return;
            case TdApi.UpdateChatIsMarkedAsUnread.CONSTRUCTOR:
                Ad((TdApi.UpdateChatIsMarkedAsUnread) update);
                return;
            case TdApi.UpdateConnectionState.CONSTRUCTOR:
                Td((TdApi.UpdateConnectionState) update);
                return;
            case TdApi.UpdateWebAppMessageSent.CONSTRUCTOR:
                Oe((TdApi.UpdateWebAppMessageSent) update);
                return;
            case TdApi.UpdateFileAddedToDownloads.CONSTRUCTOR:
                Xd((TdApi.UpdateFileAddedToDownloads) update);
                return;
            case TdApi.UpdateAuthorizationState.CONSTRUCTOR:
                od(kVar, ((TdApi.UpdateAuthorizationState) update).authorizationState);
                return;
            case TdApi.UpdateFavoriteStickers.CONSTRUCTOR:
                Vd((TdApi.UpdateFavoriteStickers) update);
                return;
            case TdApi.UpdateDeleteMessages.CONSTRUCTOR:
                se((TdApi.UpdateDeleteMessages) update);
                return;
            case TdApi.UpdateChatHasProtectedContent.CONSTRUCTOR:
                xd((TdApi.UpdateChatHasProtectedContent) update);
                return;
            case TdApi.UpdateMessageSendSucceeded.CONSTRUCTOR:
                qe((TdApi.UpdateMessageSendSucceeded) update);
                return;
            case TdApi.UpdateFileRemovedFromDownloads.CONSTRUCTOR:
                ce((TdApi.UpdateFileRemovedFromDownloads) update);
                return;
            case TdApi.UpdateStickerSet.CONSTRUCTOR:
                Ge(((TdApi.UpdateStickerSet) update).stickerSet);
                return;
            case TdApi.UpdateRecentStickers.CONSTRUCTOR:
                De((TdApi.UpdateRecentStickers) update);
                return;
            case TdApi.UpdateUnreadChatCount.CONSTRUCTOR:
                Le((TdApi.UpdateUnreadChatCount) update);
                return;
            case TdApi.UpdateChatMessageSender.CONSTRUCTOR:
                ud((TdApi.UpdateChatMessageSender) update);
                return;
            case TdApi.UpdateChatHasScheduledMessages.CONSTRUCTOR:
                yd((TdApi.UpdateChatHasScheduledMessages) update);
                return;
            case TdApi.UpdateNewChat.CONSTRUCTOR:
                te((TdApi.UpdateNewChat) update);
                return;
            default:
                return;
        }
    }

    public final void Nb(long j10, TdApi.MessageSender messageSender, TdApi.ChatMemberStatus chatMemberStatus, int i10, TdApi.ChatMemberStatus chatMemberStatus2, i iVar) {
        TdApi.Function function;
        boolean z10 = ob.a.g(j10) && i10 > 0 && !t2.i3(chatMemberStatus2, false) && t2.i3(chatMemberStatus, false) && messageSender.getConstructor() == -336109341;
        AtomicBoolean atomicBoolean = (!z10 || !t2.H2(chatMemberStatus)) ? null : new AtomicBoolean(false);
        if (z10) {
            function = new TdApi.AddChatMember(j10, ((TdApi.MessageSenderUser) messageSender).userId, i10);
        } else {
            function = new TdApi.SetChatMemberStatus(j10, messageSender, chatMemberStatus);
        }
        v4().o(function, new c(atomicBoolean, j10, messageSender, chatMemberStatus, new AtomicReference(), new AtomicInteger(0), iVar));
    }

    public void Nc(final TdApi.LanguagePackInfo languagePackInfo, final kb.i iVar) {
        if (ib.i.i(languagePackInfo.baseLanguagePackId)) {
            Mc(languagePackInfo.f19945id, iVar);
        } else {
            Mc(languagePackInfo.f19945id, new kb.i() {
                @Override
                public final void a(boolean z10) {
                    o6.this.B9(languagePackInfo, iVar, z10);
                }
            });
        }
    }

    public final void Nd(TdApi.UpdateChatThemes updateChatThemes) {
        TdApi.ChatTheme[] chatThemeArr;
        synchronized (this.f28045a0) {
            this.f28082l2.clear();
            for (TdApi.ChatTheme chatTheme : updateChatThemes.chatThemes) {
                this.f28082l2.put(chatTheme.name, chatTheme);
            }
        }
    }

    public final void Ne(TdApi.UpdateUsersNearby updateUsersNearby) {
        this.f28071i0.P2(updateUsersNearby);
    }

    public boolean O1() {
        return this.X0 == 1;
    }

    public boolean O2(TdApi.Chat chat) {
        return ((u7(chat) && n2(chat, false)) || R2(chat.f19908id)) && ib.i.i(j4(chat.f19908id));
    }

    public TdApi.ChatMemberStatus O3(long j10) {
        if (j10 == 0) {
            return null;
        }
        switch (ob.a.d(j10)) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                TdApi.Supergroup g22 = e2().g2(ob.a.p(j10));
                if (g22 != null) {
                    return g22.status;
                }
                return null;
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                return null;
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                TdApi.BasicGroup M = e2().M(ob.a.m(j10));
                if (M != null) {
                    return M.status;
                }
                return null;
            default:
                throw new RuntimeException();
        }
    }

    public void O4(final long j10, final boolean z10, final Runnable runnable) {
        switch (ob.a.d(j10)) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                TdApi.ChatMemberStatus O3 = O3(j10);
                if (O3 == null || !t2.i3(O3, false)) {
                    v4().o(new TdApi.DeleteChatHistory(j10, true, z10), oa(runnable));
                    return;
                } else {
                    v4().o(new TdApi.SetChatMemberStatus(j10, ca(), new TdApi.ChatMemberStatusLeft()), new Client.g() {
                        @Override
                        public final void r2(TdApi.Object object) {
                            o6.this.X7(j10, z10, runnable, object);
                        }
                    });
                    return;
                }
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
                TdApi.SecretChat b42 = b4(j10);
                if (b42 == null || b42.state.getConstructor() == -1945106707) {
                    v4().o(new TdApi.DeleteChatHistory(j10, true, z10), zc(runnable));
                    return;
                } else {
                    v4().o(new TdApi.CloseSecretChat(ob.a.n(j10)), new Client.g() {
                        @Override
                        public final void r2(TdApi.Object object) {
                            o6.this.W7(j10, z10, runnable, object);
                        }
                    });
                    return;
                }
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                v4().o(new TdApi.DeleteChatHistory(j10, true, z10), oa(runnable));
                return;
            default:
                return;
        }
    }

    public TdApi.FormattedText O5(long j10, long j11) {
        TdApi.MessageContent Q5 = Q5(j10, j11);
        if (Q5 == null) {
            return P5(j10, j11);
        }
        int constructor = Q5.getConstructor();
        if (constructor == 908195298) {
            return ob.e.y1(Q5);
        }
        if (constructor == 1989037971) {
            return ((TdApi.MessageText) Q5).text;
        }
        throw new UnsupportedOperationException(Integer.toString(Q5.getConstructor()));
    }

    public boolean O6(long j10) {
        TdApi.Supergroup c42 = c4(j10);
        return c42 != null && c42.isChannel;
    }

    public s9 O9() {
        return this.f28071i0;
    }

    public Client.g Oa() {
        return this.S;
    }

    public void Ob(long j10, int i10) {
        v4().o(new TdApi.SetChatMessageTtl(j10, i10), na());
    }

    public String Oc() {
        return Uri.parse(this.f28069h1).getHost();
    }

    public final void Od(TdApi.UpdateChatTitle updateChatTitle) {
        synchronized (this.f28045a0) {
            TdApi.Chat chat = this.f28049b0.get(Long.valueOf(updateChatTitle.chatId));
            if (!kj.b(updateChatTitle.chatId, chat, updateChatTitle)) {
                chat.title = updateChatTitle.title;
                this.f28071i0.C1(updateChatTitle, chat, q3(chat.positions));
                if (Build.VERSION.SDK_INT >= 26) {
                    long fa2 = fa();
                    if (fa2 != 0) {
                        cb.v(this, fa2, chat);
                    }
                }
            }
        }
    }

    public final void Oe(TdApi.UpdateWebAppMessageSent updateWebAppMessageSent) {
    }

    public String P1() {
        return this.M1;
    }

    public boolean P2(long j10) {
        TdApi.ChatMemberStatus O3 = O3(j10);
        return O3 != null && O3.getConstructor() == -160019714;
    }

    public TdApi.Chat P3(long j10) {
        TdApi.Chat chat;
        synchronized (this.f28045a0) {
            chat = this.f28049b0.get(Long.valueOf(j10));
            if (chat == null) {
                throw new IllegalStateException("updateChat not received for id:" + j10);
            }
        }
        return chat;
    }

    public void P4(long j10, long[] jArr, boolean z10) {
        v4().o(new TdApi.DeleteMessages(j10, jArr, z10), this.M);
    }

    public TdApi.FormattedText P5(long j10, long j11) {
        TdApi.FormattedText formattedText;
        synchronized (this.U1) {
            HashMap<String, TdApi.FormattedText> hashMap = this.U1;
            formattedText = hashMap.get(j10 + "_" + j11);
        }
        return formattedText;
    }

    public boolean P6(TdApi.MessageSender messageSender) {
        long S0 = ob.e.S0(messageSender);
        return S0 != 0 && O6(S0);
    }

    public final Client.g Pa(final boolean z10) {
        return new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                o6.this.Z8(z10, object);
            }
        };
    }

    public void Pb(long j10, TdApi.ChatNotificationSettings chatNotificationSettings) {
        v4().o(new TdApi.SetChatNotificationSettings(j10, chatNotificationSettings), this.M);
    }

    public String Pc(String str) {
        return Xc("bg/" + str);
    }

    public final void Pd(TdApi.UpdateChatUnreadMentionCount updateChatUnreadMentionCount) {
        synchronized (this.f28045a0) {
            TdApi.Chat chat = this.f28049b0.get(Long.valueOf(updateChatUnreadMentionCount.chatId));
            if (!kj.b(updateChatUnreadMentionCount.chatId, chat, updateChatUnreadMentionCount)) {
                boolean z10 = true;
                boolean z11 = chat.unreadMentionCount > 0;
                int i10 = updateChatUnreadMentionCount.unreadMentionCount;
                if (z11 == (i10 > 0)) {
                    z10 = false;
                }
                chat.unreadMentionCount = i10;
                this.f28071i0.E1(updateChatUnreadMentionCount, z10);
            }
        }
    }

    public final String Pe(TdApi.Chat chat, int i10) {
        throw new RuntimeException("version: " + i10 + ", clientData: " + chat.clientData);
    }

    public String Q1() {
        return this.N1;
    }

    public boolean Q2(TdApi.Chat chat) {
        return Q6(chat) && n2(chat, false);
    }

    public boolean Q3(long j10) {
        if (j10 == 0) {
            return false;
        }
        if (!ob.a.j(j10)) {
            return true;
        }
        TdApi.SecretChat b42 = b4(j10);
        return b42 != null && b42.layer >= 66;
    }

    public void Q4(long j10, long[] jArr, boolean z10) {
        v4().o(new TdApi.DeleteMessages(j10, jArr, z10), this.M);
    }

    public TdApi.MessageContent Q5(long j10, long j11) {
        TdApi.MessageContent messageContent;
        synchronized (this.T1) {
            HashMap<String, TdApi.MessageContent> hashMap = this.T1;
            messageContent = hashMap.get(j10 + "_" + j11);
        }
        return messageContent;
    }

    public boolean Q6(TdApi.Chat chat) {
        return chat != null && chat.type.getConstructor() == -1472570774 && ((TdApi.ChatTypeSupergroup) chat.type).isChannel;
    }

    public vb Qa() {
        return this.f28083m0;
    }

    public void Qb(long j10, TdApi.ChatPermissions chatPermissions, final kb.i iVar) {
        v4().o(new TdApi.SetChatPermissions(j10, chatPermissions), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                o6.m9(kb.i.this, object);
            }
        });
    }

    public String Qc() {
        return ib.i.G(Wc());
    }

    public final void Qd(TdApi.UpdateChatUnreadReactionCount updateChatUnreadReactionCount) {
        synchronized (this.f28045a0) {
            TdApi.Chat chat = this.f28049b0.get(Long.valueOf(updateChatUnreadReactionCount.chatId));
            if (!kj.b(updateChatUnreadReactionCount.chatId, chat, updateChatUnreadReactionCount)) {
                boolean z10 = true;
                boolean z11 = chat.unreadReactionCount > 0;
                int i10 = updateChatUnreadReactionCount.unreadReactionCount;
                if (z11 == (i10 > 0)) {
                    z10 = false;
                }
                chat.unreadReactionCount = i10;
                this.f28071i0.G1(updateChatUnreadReactionCount, z10);
            }
        }
    }

    public void Qe(final long j10, final r rVar) {
        v4().o(new TdApi.UpgradeBasicGroupChatToSupergroupChat(j10), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                o6.this.M9(rVar, j10, object);
            }
        });
    }

    public String R1() {
        if (!r6()) {
            return "";
        }
        return c0.y("+" + this.M1 + this.N1, false, true);
    }

    public boolean R2(long j10) {
        return ob.a.g(j10) && t2.P2(O3(j10));
    }

    public TdApi.Chat R3(long j10) {
        return S3(j10, TimeUnit.SECONDS.toMillis(5L));
    }

    public void R4() {
        v4().o(new TdApi.Destroy(), this.M);
    }

    public String R5() {
        return this.f28050b1;
    }

    public boolean R6(long j10) {
        long p10 = ob.a.p(j10);
        return p10 != 0 && this.f28098r0.contains(Long.valueOf(p10));
    }

    public void R9(long j10, long j11, Runnable runnable) {
        TdApi.Chat W2 = W2(j10);
        if (W2 != null) {
            int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
            if (i10 == 0 && W2.isMarkedAsUnread) {
                v4().o(new TdApi.ToggleChatIsMarkedAsUnread(W2.f19908id, false), oa(runnable));
            }
            if (!u6(W2) && W2.lastMessage != null) {
                if (i10 != 0 || W2.unreadCount > 0) {
                    v4().o(new TdApi.ViewMessages(j10, j11, new long[]{W2.lastMessage.f19946id}, true), oa(runnable));
                }
            }
        }
    }

    public void Ra(TdApi.ChatList chatList, final kb.k kVar) {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        x5(chatList, new kb.j() {
            @Override
            public final void a(Object obj) {
                o6.this.a9(atomicInteger, (TdApi.Chat) obj);
            }
        }, new kb.i() {
            @Override
            public final void a(boolean z10) {
                o6.b9(k.this, atomicInteger, z10);
            }
        }, false);
    }

    public String Rc(String str) {
        return Xc("setlanguage/" + str);
    }

    public final void Rd(TdApi.UpdateChatAction updateChatAction) {
        if (updateChatAction.chatId != fa()) {
            hd().sendMessage(hd().obtainMessage(1, 0, 0, updateChatAction));
        }
    }

    public Comparator<TdApi.User> Re() {
        return this.T;
    }

    public TdApi.AuthorizationState S1() {
        return this.J1;
    }

    public void S2(TdApi.Message message) {
        hd().removeMessages(4, message);
    }

    public TdApi.Chat S3(long j10, long j11) {
        if (j10 == 0) {
            return null;
        }
        TdApi.Chat W2 = this.f28062f0.contains(Long.valueOf(j10)) ? W2(j10) : null;
        if (W2 != null) {
            return W2;
        }
        TdApi.Object w42 = w4(new TdApi.GetChat(j10), j11);
        if (w42 != null) {
            int constructor = w42.getConstructor();
            if (constructor == -1679978726) {
                Log.e("chatSync failed: %s, chatId:%d", t2.z5(w42), Long.valueOf(j10));
            } else if (constructor == -1601123095 && this.f28062f0.contains(Long.valueOf(j10))) {
                return W2(j10);
            } else {
                return null;
            }
        }
        return null;
    }

    public boolean S4(boolean z10) {
        if (z10) {
            v4().o(new TdApi.GetOption("disable_contact_registered_notifications"), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    o6.this.Y7(object);
                }
            });
        }
        return this.f28105t1;
    }

    public List<Long> S5(TdApi.ChatList chatList) {
        synchronized (this.f28045a0) {
            ArrayList<TdApi.Chat> arrayList = null;
            for (TdApi.Chat chat : this.f28049b0.values()) {
                TdApi.ChatPosition a10 = ob.b.a(chat, chatList);
                if (a10 != null && a10.isPinned) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(chat);
                }
            }
            if (arrayList != null) {
                ob.e.o1(arrayList, chatList);
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (TdApi.Chat chat2 : arrayList) {
                    arrayList2.add(Long.valueOf(chat2.f19908id));
                }
                return arrayList2;
            }
            return new ArrayList();
        }
    }

    public boolean S6(long j10) {
        boolean z10;
        synchronized (this.S1) {
            z10 = this.R1.d(j10) != 0;
        }
        return z10;
    }

    public void S9(TdApi.Chat chat, Runnable runnable) {
        if (chat != null && chat.unreadCount == 0 && !chat.isMarkedAsUnread) {
            v4().o(new TdApi.ToggleChatIsMarkedAsUnread(chat.f19908id, true), oa(runnable));
        }
    }

    public void Sa(long j10, long j11, long[] jArr) {
        if (Log.isEnabled(4)) {
            Log.i(4, "Reading messages chatId:%d messageIds:%s", Log.generateSingleLineException(2), Long.valueOf(j10), Arrays.toString(jArr));
        }
        v4().o(new TdApi.ViewMessages(j10, j11, jArr, true), this.M);
    }

    public final java.util.List<zd.o6.h> Sb(org.drinkless.td.libcore.telegram.TdApi.Chat r23, org.drinkless.td.libcore.telegram.TdApi.ChatPosition[] r24) {
        throw new UnsupportedOperationException("Method not decompiled: zd.o6.Sb(org.drinkless.td.libcore.telegram.TdApi$Chat, org.drinkless.td.libcore.telegram.TdApi$ChatPosition[]):java.util.List");
    }

    public String Sc(String str, long j10) {
        return Xc(str + "/" + j10);
    }

    public final void Sd(TdApi.UpdateChatVideoChat updateChatVideoChat) {
        synchronized (this.f28045a0) {
            TdApi.Chat chat = this.f28049b0.get(Long.valueOf(updateChatVideoChat.chatId));
            if (!kj.b(updateChatVideoChat.chatId, chat, updateChatVideoChat)) {
                chat.videoChat = updateChatVideoChat.videoChat;
                this.f28071i0.I1(updateChatVideoChat);
            }
        }
    }

    public Comparator<a1> Se() {
        return this.U;
    }

    public int T1() {
        int d62;
        synchronized (this.f28045a0) {
            d62 = d6(this.J1);
        }
        return d62;
    }

    public final void T2() {
        if (this.f28091o2) {
            SyncHelper.a(j0.q(), this.W);
            this.f28091o2 = false;
        }
    }

    public int T3(long j10) {
        TdApi.Chat W2 = W2(j10);
        if (W2 != null) {
            return W2.messageTtl;
        }
        return 0;
    }

    public void T4(int i10, int i11) {
        hd().sendMessage(hd().obtainMessage(6, i10, i11));
    }

    public CharSequence T5(TdApi.Chat chat) {
        return Z5(chat, R.id.right_sendPolls, R.string.ChatDisabledPolls, R.string.ChatRestrictedPolls, R.string.ChatRestrictedPollsUntil);
    }

    public boolean T6() {
        return this.Y == 0;
    }

    public int T9() {
        return this.f28096q1;
    }

    public final void Ta(long j10, TdApi.MessageSender messageSender, int i10, i iVar) {
        v4().o(new TdApi.GetChatMember(j10, messageSender), new d(j10, messageSender, i10, new AtomicInteger(), iVar, new AtomicReference()));
    }

    public void Tb(boolean z10) {
        if (this.f28105t1 != z10) {
            this.f28105t1 = z10;
            v4().o(new TdApi.SetOption("disable_contact_registered_notifications", new TdApi.OptionValueBoolean(z10)), this.M);
            O9().L1(z10);
        }
    }

    public String Tc(long j10, long j11) {
        return Xc("c/" + j10 + "/" + j11);
    }

    public final void Td(TdApi.UpdateConnectionState updateConnectionState) {
        int i10;
        switch (updateConnectionState.state.getConstructor()) {
            case TdApi.ConnectionStateConnecting.CONSTRUCTOR:
                i10 = 2;
                break;
            case TdApi.ConnectionStateUpdating.CONSTRUCTOR:
                i10 = 3;
                break;
            case TdApi.ConnectionStateConnectingToProxy.CONSTRUCTOR:
                i10 = 1;
                break;
            case TdApi.ConnectionStateReady.CONSTRUCTOR:
                i10 = 0;
                break;
            case TdApi.ConnectionStateWaitingForNetwork.CONSTRUCTOR:
                i10 = 4;
                break;
            default:
                throw new UnsupportedOperationException(updateConnectionState.toString());
        }
        int i11 = this.Y;
        if (i11 != i10) {
            this.Y = i10;
            if (i10 == 0 || i10 == 4) {
                this.f28066g1 = 0L;
            } else if (this.f28066g1 == 0) {
                this.f28066g1 = SystemClock.uptimeMillis();
            }
            this.f28071i0.J1(i10, i11);
            this.V.i2(this, i10);
            if (i10 == 0) {
                pa();
            } else if (i11 == 0) {
                F4().g3().i();
            }
        }
    }

    public void Te() {
        synchronized (this.Z) {
            if (this.X != null && this.f28117y1 && Thread.currentThread() == this.X.f28145b.g()) {
                new Thread(new Runnable() {
                    @Override
                    public final void run() {
                        o6.this.x4();
                    }
                }).start();
                return;
            }
            y4();
        }
    }

    public boolean U1() {
        return this.S0;
    }

    public void U2(s4 s4Var, int i10) {
        hd().removeMessages(i10 + 100000, s4Var);
    }

    public String U3(long j10) {
        return V3(j10, true, false);
    }

    public void U4(int i10, int i11) {
        hd().sendMessage(hd().obtainMessage(5, i10, i11));
    }

    public void U5(long j10, Client.g gVar) {
        b bVar = new b(gVar, j10);
        int d10 = ob.a.d(j10);
        if (d10 == -1472570774) {
            v4().o(new TdApi.GetSupergroupFullInfo(ob.a.p(j10)), bVar);
        } else if (d10 != 973884508) {
            gVar.r2(new TdApi.Error(-1, "Invalid chat type"));
        } else {
            v4().o(new TdApi.GetBasicGroupFullInfo(ob.a.m(j10)), bVar);
        }
    }

    public boolean U6(TdApi.Chat chat) {
        if (chat == null) {
            return false;
        }
        TdApi.User f42 = f4(chat);
        return t2.O2(f42) && !o7(f42.f19979id);
    }

    public int U9() {
        return this.f28099r1;
    }

    public void Ua(long j10, long[] jArr) {
        v4().o(new TdApi.ResendMessages(j10, jArr), Z9());
    }

    public final void Ub(boolean z10) {
        if (this.f28105t1 != z10) {
            this.f28105t1 = z10;
            O9().L1(z10);
        }
    }

    public String Uc(String str, String str2, boolean z10) {
        return Yc().path(str).appendQueryParameter(z10 ? "startgroup" : "start", str2).build().toString();
    }

    public final void Ud(String[] strArr) {
        synchronized (this.f28045a0) {
            this.L0 = strArr;
        }
    }

    public qj Ue() {
        return this.f28089o0;
    }

    public boolean V1() {
        return this.T0;
    }

    public void V2(int i10) {
        if (i10 > 0) {
            do {
                H6(5);
                i10--;
            } while (i10 > 0);
        } else if (i10 < 0) {
            do {
                L4(5);
                i10++;
            } while (i10 < 0);
        }
    }

    public String V3(long j10, boolean z10, boolean z11) {
        TdApi.Chat W2 = W2(j10);
        if (W2 != null) {
            return Y3(W2, z10, z11);
        }
        if (j10 == f28042y2 && ".".equals(W2.title)) {
            return gd.w.i1(R.string.EmojiSets);
        }
        long h42 = h4(j10);
        if (h42 != 0) {
            return e2().B2(h42, z10, z11);
        }
        return null;
    }

    public void V4() {
        bb(new Runnable() {
            @Override
            public final void run() {
                o6.this.Z7();
            }
        });
    }

    public void V5(i.l lVar, final kb.j<String> jVar) {
        v4().o(new TdApi.AddProxy(lVar.f13864b, lVar.f13865c, false, lVar.M), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                o6.this.q8(jVar, object);
            }
        });
    }

    public boolean V6() {
        return F4().x2() == this.W;
    }

    public String V9(TdApi.Message message) {
        return W9(message, true, false);
    }

    public final void Va() {
        this.f28062f0.clear();
        this.f28049b0.clear();
    }

    public void Vb(boolean z10) {
        this.Y0 = z10;
        v4().o(new TdApi.SetOption("disable_sent_scheduled_message_notifications", new TdApi.OptionValueBoolean(z10)), this.M);
    }

    public String Vc(String str) {
        return Xc("addstickers/" + str);
    }

    public final void Vd(TdApi.UpdateFavoriteStickers updateFavoriteStickers) {
        synchronized (this.f28045a0) {
            this.f28111v1 = updateFavoriteStickers.stickerIds;
        }
        this.f28071i0.M1(updateFavoriteStickers);
    }

    public boolean Ve() {
        return !this.G0 || v0.f1();
    }

    public void W1(Runnable runnable, boolean z10) {
        TdApi.AuthorizationState authorizationState;
        if (z10 || ((authorizationState = this.J1) != null && authorizationState.getConstructor() == 154449270)) {
            this.f28109u2.a(runnable);
        } else {
            runnable.run();
        }
    }

    public TdApi.Chat W2(long j10) {
        TdApi.Chat chat;
        if (j10 == 0) {
            return null;
        }
        synchronized (this.f28045a0) {
            chat = this.f28049b0.get(Long.valueOf(j10));
        }
        return chat;
    }

    public String W3(TdApi.Chat chat) {
        return Y3(chat, true, false);
    }

    public final void W4(TdApi.ChatList chatList, int i10, boolean z10) {
        this.V.b1().p(this, chatList, i10, z10);
    }

    public final String W5() {
        String W0 = this.V.W0();
        return ib.i.i(W0) ? he.i.c2().E0() : W0;
    }

    public final boolean W6() {
        return this.f28115x1;
    }

    public String W9(TdApi.Message message, boolean z10, boolean z11) {
        if (message == null) {
            return null;
        }
        TdApi.MessageForwardInfo messageForwardInfo = message.forwardInfo;
        if (messageForwardInfo != null) {
            int constructor = messageForwardInfo.origin.getConstructor();
            if (constructor == -355174191) {
                long j10 = ((TdApi.MessageForwardOriginUser) message.forwardInfo.origin).senderUserId;
                return z11 ? e2().C2(j10) : e2().J2(j10);
            } else if (constructor == 1490730723) {
                TdApi.MessageForwardOriginChannel messageForwardOriginChannel = (TdApi.MessageForwardOriginChannel) message.forwardInfo.origin;
                if (z10 && !ib.i.i(messageForwardOriginChannel.authorSignature)) {
                    return messageForwardOriginChannel.authorSignature;
                }
                TdApi.Chat W2 = W2(messageForwardOriginChannel.chatId);
                if (W2 != null) {
                    return W2.title;
                }
            } else if (constructor == 1526010724) {
                TdApi.MessageForwardOriginChat messageForwardOriginChat = (TdApi.MessageForwardOriginChat) message.forwardInfo.origin;
                if (z10 && !ib.i.i(messageForwardOriginChat.authorSignature)) {
                    return messageForwardOriginChat.authorSignature;
                }
                TdApi.Chat W22 = W2(messageForwardOriginChat.senderChatId);
                if (W22 != null) {
                    return W22.title;
                }
            }
        }
        TdApi.MessageSender messageSender = message.senderId;
        if (messageSender == null) {
            return null;
        }
        return Db(messageSender, z11);
    }

    public final void Wa() {
        this.f28053c0.clear();
        this.f28062f0.clear();
        this.f28073i2.b();
        this.f28101s0.a();
        this.f28065g0.clear();
        this.f28085m2 = null;
        this.T1.clear();
        this.U1.clear();
        this.f28059e0.c();
        this.f28079k2.clear();
        this.f28084m1 = 777000L;
        this.f28081l1 = 1271266957L;
        this.W1 = null;
        this.f28056d0.c();
    }

    public void Wb(boolean z10) {
        this.X0 = z10 ? 1 : 0;
        v4().o(new TdApi.SetOption("disable_top_chats", new TdApi.OptionValueBoolean(z10)), this.M);
    }

    public String Wc() {
        if (!ib.i.i(this.f28069h1)) {
            return this.f28069h1;
        }
        return "https://" + t2.g2() + "/";
    }

    public final void Wd(TdApi.UpdateFile updateFile) {
        this.f28071i0.N1(updateFile);
        this.V.w2().z0(this, updateFile);
        m5().h0(updateFile);
        TdApi.File file = updateFile.file;
        if (file.local.isDownloadingActive || file.remote.isUploadingActive) {
            m5().g0(updateFile);
            int i10 = updateFile.file.f19913id;
            if (!ImageLoader.e().i(this, updateFile.file)) {
                GifBridge.f().n(this, i10, t2.s1(updateFile.file));
            }
        } else if (t2.T2(file)) {
            m5().f0(updateFile);
            if (!ImageLoader.e().h(this, updateFile.file)) {
                GifBridge.f().m(this, updateFile.file);
            }
        } else {
            m5().i0(updateFile);
        }
    }

    public void X1(Runnable runnable) {
        this.f28097q2.a(runnable);
    }

    public void X2(final long j10, final kb.e<TdApi.Function> eVar, final kb.j<TdApi.Chat> jVar) {
        if (eVar == null) {
            Y2(j10, jVar);
        } else {
            Y2(j10, new kb.j() {
                @Override
                public final void a(Object obj) {
                    o6.this.L7(jVar, eVar, j10, (TdApi.Chat) obj);
                }
            });
        }
    }

    public String X3(TdApi.Chat chat, boolean z10) {
        return Y3(chat, z10, false);
    }

    public void X4(TdApi.UpdateUserStatus updateUserStatus, boolean z10) {
        hd().sendMessage(hd().obtainMessage(8, z10 ? 1 : 0, 0, updateUserStatus));
    }

    public TdApi.File X5(String str, TdApi.FileType fileType, long j10) {
        TdApi.Object w42 = w4(new TdApi.GetRemoteFile(str, fileType), j10);
        if (w42 instanceof TdApi.File) {
            return (TdApi.File) w42;
        }
        return null;
    }

    public boolean X6(String str) {
        if (ib.i.i(str)) {
            return false;
        }
        synchronized (this.f28045a0) {
            String[] strArr = this.L0;
            if (strArr != null) {
                for (String str2 : strArr) {
                    if (str.equals(str2)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public String X9(TdApi.Message message) {
        long O0 = ob.e.O0(message);
        if (O0 == 0) {
            return null;
        }
        if (ob.a.i(O0)) {
            return e2().Q2(ob.a.q(O0));
        }
        return j4(O0);
    }

    public final void Xa() {
        this.f28058d2 = false;
        this.F1 = false;
    }

    public final void Xb(boolean z10) {
        if (this.D1 == z10) {
            return;
        }
        if (!z10 || !T6()) {
            this.D1 = z10;
            F4().U2(this.W, z10);
        }
    }

    public String Xc(String str) {
        return Yc().path(str).build().toString();
    }

    public final void Xd(TdApi.UpdateFileAddedToDownloads updateFileAddedToDownloads) {
        this.f28071i0.O1(updateFileAddedToDownloads);
    }

    public void Y1(Runnable runnable) {
        this.f28094p2.a(runnable);
    }

    public void Y2(final long j10, final kb.j<TdApi.Chat> jVar) {
        bb(new Runnable() {
            @Override
            public final void run() {
                o6.this.J7(j10, jVar);
            }
        });
    }

    public String Y3(TdApi.Chat chat, boolean z10, boolean z11) {
        if (chat.f19908id == f28042y2 && ".".equals(chat.title)) {
            return gd.w.i1(R.string.EmojiSets);
        }
        long h42 = h4(chat.f19908id);
        return h42 != 0 ? e2().B2(h42, z10, z11) : chat.title;
    }

    public final void Y4() {
        synchronized (this.Z) {
            Z4();
        }
    }

    public n Y5(TdApi.Chat chat, int i10) {
        TdApi.User u22;
        int constructor;
        if (chat == null || chat.f19908id == 0 || !t2.J3(i10)) {
            return null;
        }
        TdApi.ChatMemberStatus O3 = O3(chat.f19908id);
        boolean z10 = true;
        int i11 = (O3 == null || (O3.getConstructor() != 844723285 && (O3.getConstructor() != 1661432998 || !t2.X(((TdApi.ChatMemberStatusRestricted) O3).permissions, i10)))) ? 0 : 1;
        if (O3 != null) {
            switch (O3.getConstructor()) {
                case TdApi.ChatMemberStatusBanned.CONSTRUCTOR:
                    return new n(chat.f19908id, 2, ((TdApi.ChatMemberStatusBanned) O3).bannedUntilDate);
                case TdApi.ChatMemberStatusCreator.CONSTRUCTOR:
                case TdApi.ChatMemberStatusAdministrator.CONSTRUCTOR:
                    return null;
                case TdApi.ChatMemberStatusMember.CONSTRUCTOR:
                    if (Q6(chat)) {
                        return new n(chat.f19908id, 3, 0);
                    }
                    break;
                case TdApi.ChatMemberStatusRestricted.CONSTRUCTOR:
                    if (!t2.X(chat.permissions, i10)) {
                        return new n(chat.f19908id, 0, 0);
                    }
                    TdApi.ChatMemberStatusRestricted chatMemberStatusRestricted = (TdApi.ChatMemberStatusRestricted) O3;
                    if (!t2.X(chatMemberStatusRestricted.permissions, i10)) {
                        return new n(chat.f19908id, 1, chatMemberStatusRestricted.restrictedUntilDate);
                    }
                    return null;
            }
        }
        int constructor2 = chat.type.getConstructor();
        if (constructor2 == 862366513) {
            TdApi.SecretChat Q1 = e2().Q1(ob.a.n(chat.f19908id));
            if (Q1 == null || Q1.state.getConstructor() != -1611352087 || (u22 = e2().u2(Q1.userId)) == null) {
                return new n(chat.f19908id, 3, 0);
            }
            int constructor3 = u22.type.getConstructor();
            if (constructor3 == -1807729372 || constructor3 == -724541123) {
                return new n(chat.f19908id, 3, 0);
            }
            return null;
        } else if (constructor2 == 1579049844) {
            TdApi.User u23 = e2().u2(ob.a.q(chat.f19908id));
            boolean z11 = u23 == null;
            if (z11 || !((constructor = u23.type.getConstructor()) == -1807729372 || constructor == -724541123)) {
                z10 = z11;
            }
            if (z10) {
                return new n(chat.f19908id, 3, 0);
            }
            return null;
        } else if (!t2.X(chat.permissions, i10)) {
            return new n(chat.f19908id, i11 ^ 1, 0);
        } else {
            return null;
        }
    }

    public boolean Y6() {
        return this.f28051b2;
    }

    public boolean Y9(TdApi.Message message) {
        return (message == null || O5(message.chatId, message.f19946id) == null) ? false : true;
    }

    public int Ya() {
        String ab2 = ab();
        if (ib.i.i(ab2)) {
            return 0;
        }
        return ib.i.s(ab2.substring(8)) - 50;
    }

    public final void Yb(boolean z10) {
        if (this.f28076j2 != z10) {
            this.f28076j2 = z10;
            if (z10) {
                E6();
            } else {
                I4();
            }
        }
    }

    public Uri.Builder Yc() {
        return new Uri.Builder().scheme("https").authority(Oc());
    }

    public final void Yd(TdApi.UpdateFileDownload updateFileDownload) {
        this.f28071i0.P1(updateFileDownload);
    }

    public void Z1(TdApi.Message message, Runnable runnable) {
        TdApi.MessageSendingState messageSendingState = message.sendingState;
        if (messageSendingState == null || messageSendingState.getConstructor() != -1381803582 || Qa().c(message.chatId, message.f19946id)) {
            runnable.run();
            return;
        }
        synchronized (this.f28045a0) {
            if (this.V1 == null) {
                this.V1 = new HashMap();
            }
            String str = message.chatId + "_" + message.f19946id;
            Queue<Runnable> queue = this.V1.get(str);
            if (queue == null) {
                queue = new ArrayDeque<>();
                this.V1.put(str, queue);
            }
            queue.add(runnable);
        }
    }

    public int Z2(long j10) {
        if (j10 != 0) {
            return a3(W2(j10));
        }
        return -1;
    }

    public String Z3(long j10) {
        return V3(j10, true, true);
    }

    public final void Z4() {
        if (this.B1 != 0) {
            if (this.X == null || this.f28117y1) {
                Log.e((int) Log.TAG_ACCOUNTS, "Cannot pause TDLib instance, because it is already paused. accountId:%d", Integer.valueOf(this.W));
                return;
            }
            this.B1 = 0L;
            if (!uc()) {
                Log.i((int) Log.TAG_ACCOUNTS, "Cannot restart TDLib, because it is in use. referenceCount:%d, accountId:%d", Integer.valueOf(this.f28119z1.get()), Integer.valueOf(this.W));
                return;
            }
            Log.i((int) Log.TAG_ACCOUNTS, "Pausing TDLib instance, because it is unused, accountId:%d", Integer.valueOf(this.W));
            this.f28117y1 = true;
            this.X.x();
        }
    }

    public CharSequence Z5(TdApi.Chat chat, int i10, int i11, int i12, int i13) {
        n Y5 = Y5(chat, i10);
        if (Y5 == null) {
            return null;
        }
        switch (i10) {
            case R.id.right_sendMedia:
            case R.id.right_sendPolls:
                CharSequence M5 = M5(chat);
                if (M5 != null) {
                    return M5;
                }
                break;
            case R.id.right_sendStickersAndGifs:
                CharSequence I5 = I5(chat);
                if (I5 != null) {
                    return I5;
                }
                break;
        }
        int i14 = Y5.f28156b;
        if (i14 != 0) {
            if (i14 == 1) {
                int i15 = Y5.f28157c;
                return i15 != 0 ? gd.w.j1(i13, gd.w.C1(i15, TimeUnit.SECONDS)) : gd.w.i1(i12);
            } else if (i14 == 2) {
                int i16 = Y5.f28157c;
                return i16 != 0 ? gd.w.j1(R.string.ChatBannedUntil, gd.w.C1(i16, TimeUnit.SECONDS)) : gd.w.i1(R.string.ChatBanned);
            } else if (i14 != 3) {
                throw new UnsupportedOperationException();
            }
        }
        if (Y5.b()) {
            i11 = R.string.UserDisabledMessages;
        }
        return gd.w.i1(i11);
    }

    public boolean Z6(TdApi.Message message) {
        return message != null && message.chatId == ob.e.R0(message) && b7(message.chatId);
    }

    public Client.g Z9() {
        return this.O;
    }

    public String Za() {
        String ab2 = ab();
        if (ib.i.i(ab2)) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(5);
        for (int i10 = 0; i10 < 5; i10++) {
            sb2.append((CharSequence) ab2, 5, 6);
        }
        return sb2.toString();
    }

    public void Zb(boolean z10) {
        if (this.R0 != z10) {
            this.R0 = z10;
            v4().o(new TdApi.SetOption("ignore_sensitive_content_restrictions", new TdApi.OptionValueBoolean(z10)), this.M);
        }
    }

    public String Zc() {
        return this.f28072i1;
    }

    public final void Zd(TdApi.UpdateFileDownloads updateFileDownloads) {
        this.f28071i0.Q1(updateFileDownloads);
    }

    @Override
    public final int a() {
        return A6();
    }

    public void a2(Runnable runnable) {
        this.f28100r2.a(runnable);
    }

    public int a3(TdApi.Chat chat) {
        if (chat == null) {
            return -1;
        }
        if (chat.type.getConstructor() == -1472570774) {
            TdApi.Supergroup c42 = c4(chat.f19908id);
            if (c42 == null) {
                return -1;
            }
            boolean z10 = !ib.i.i(c42.username) || c42.hasLinkedChat || c42.hasLocation;
            boolean w72 = w7(chat.f19908id);
            int constructor = c42.status.getConstructor();
            if (constructor == -1653518666) {
                return -2;
            }
            if (constructor != -5815259) {
                if (constructor == 1661432998 && !z10 && !((TdApi.ChatMemberStatusRestricted) c42.status).isMember) {
                    return w72 ? 1 : -3;
                }
                return 0;
            } else if (z10) {
                return 0;
            } else {
                return w72 ? 1 : -3;
            }
        }
        return 0;
    }

    public TdApi.BasicGroup a4(long j10) {
        long m10 = ob.a.m(j10);
        if (m10 != 0) {
            return e2().M(m10);
        }
        return null;
    }

    public Client.g a5() {
        return this.P;
    }

    public CharSequence a6(TdApi.Chat chat, TdApi.InputMessageContent inputMessageContent) {
        if (inputMessageContent != null) {
            switch (inputMessageContent.getConstructor()) {
                case TdApi.InputMessageVideo.CONSTRUCTOR:
                case TdApi.InputMessageAudio.CONSTRUCTOR:
                case TdApi.InputMessageVideoNote.CONSTRUCTOR:
                case TdApi.InputMessageDocument.CONSTRUCTOR:
                case TdApi.InputMessagePhoto.CONSTRUCTOR:
                case TdApi.InputMessageVoiceNote.CONSTRUCTOR:
                    return I5(chat);
                case TdApi.InputMessageSticker.CONSTRUCTOR:
                    return e6(chat);
                case TdApi.InputMessageAnimation.CONSTRUCTOR:
                    return E5(chat);
            }
        }
        return M5(chat);
    }

    public boolean a7(String str, boolean z10) {
        if (ib.i.i(str)) {
            return false;
        }
        String G = ib.i.G(str.toLowerCase());
        int indexOf = G.indexOf(47);
        if (indexOf != -1) {
            G = G.substring(0, indexOf);
        }
        if (!ib.i.i(this.f28069h1) && ib.i.c(G, ib.i.G(this.f28069h1))) {
            return true;
        }
        for (String str2 : ob.f.f19346c) {
            if (ib.i.c(G, str2)) {
                return true;
            }
        }
        if (z10) {
            for (String str3 : ob.f.f19347d) {
                if (ib.i.c(G, str3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean aa(TdApi.Message message) {
        return (message == null || message.sendingState == null || Qa().c(message.chatId, message.f19946id)) ? false : true;
    }

    public String ab() {
        TdApi.User da2 = da();
        String str = da2 != null ? da2.phoneNumber : null;
        if (ib.i.i(str)) {
            str = this.M1 + this.N1;
        }
        if (ib.i.i(str) || !str.startsWith("999661") || str.length() != 10) {
            return null;
        }
        return str;
    }

    public void ac(final int i10, final kb.j<TdApi.Error> jVar) {
        v4().o(new TdApi.SetInactiveSessionTtl(i10), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                o6.this.n9(jVar, i10, object);
            }
        });
    }

    public void ad(final TdApi.Session session, final kb.j<TdApi.Error> jVar) {
        v4().o(new TdApi.TerminateAllOtherSessions(), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                o6.this.D9(jVar, session, object);
            }
        });
    }

    public final void ae(TdApi.UpdateFileGenerationStart updateFileGenerationStart) {
        synchronized (this.O1) {
            l remove = this.O1.remove(updateFileGenerationStart.conversion);
            if (remove != null) {
                remove.f28151e = true;
                remove.f28150d = updateFileGenerationStart.generationId;
                remove.f28149c = updateFileGenerationStart.destinationPath;
                this.P1.put(Long.valueOf(updateFileGenerationStart.generationId), remove);
                remove.f28147a.countDown();
                return;
            }
            l5().E0(updateFileGenerationStart);
        }
    }

    public void b2(Runnable runnable) {
        this.f28103s2.a(runnable);
    }

    public boolean b3(long j10) {
        TdApi.Chat W2;
        return (j10 == 0 || (W2 = W2(j10)) == null || ob.b.a(W2, ob.b.f19339b) == null) ? false : true;
    }

    public TdApi.SecretChat b4(long j10) {
        int n10 = ob.a.n(j10);
        if (n10 != 0) {
            return e2().Q1(n10);
        }
        return null;
    }

    public void b5(TdApi.User user) {
        TdApi.ProfilePhoto profilePhoto;
        A1().g0(user);
        TdApi.ProfilePhoto profilePhoto2 = user != null ? user.profilePhoto : null;
        if (profilePhoto2 != null || this.f28085m2 != null) {
            if (profilePhoto2 == null || (profilePhoto = this.f28085m2) == null || profilePhoto2.f19955id != profilePhoto.f19955id || profilePhoto2.small.f19913id != profilePhoto.small.f19913id || profilePhoto2.big.f19913id != profilePhoto.big.f19913id) {
                this.f28085m2 = profilePhoto2;
                if (profilePhoto2 != null) {
                    v4().o(new TdApi.DownloadFile(profilePhoto2.small.f19913id, 4, 0, 0, true), Pa(false));
                    v4().o(new TdApi.DownloadFile(profilePhoto2.big.f19913id, 3, 0, 0, true), Pa(true));
                }
            }
        }
    }

    public CharSequence b6(TdApi.Chat chat, TdApi.Message message) {
        if (message != null) {
            switch (message.content.getConstructor()) {
                case TdApi.MessagePhoto.CONSTRUCTOR:
                case TdApi.MessageAudio.CONSTRUCTOR:
                case TdApi.MessageVoiceNote.CONSTRUCTOR:
                case TdApi.MessageDocument.CONSTRUCTOR:
                case TdApi.MessageVideoNote.CONSTRUCTOR:
                case TdApi.MessageVideo.CONSTRUCTOR:
                    return I5(chat);
                case TdApi.MessagePoll.CONSTRUCTOR:
                    return T5(chat);
                case TdApi.MessageAnimation.CONSTRUCTOR:
                    return E5(chat);
                case TdApi.MessageSticker.CONSTRUCTOR:
                    return e6(chat);
            }
        }
        return M5(chat);
    }

    public boolean b7(long j10) {
        int d10 = ob.a.d(j10);
        if (d10 != -1472570774) {
            return d10 == 973884508;
        }
        return t7(j10);
    }

    public String ba(TdApi.Message message) {
        TdApi.User u22;
        if (message == null) {
            return null;
        }
        long j10 = message.viaBotUserId;
        if (j10 == 0) {
            j10 = ob.e.T0(message);
        }
        if (j10 == 0 || (u22 = e2().u2(j10)) == null || ib.i.i(u22.username)) {
            return null;
        }
        return u22.username;
    }

    public void bb(Runnable runnable) {
        cb(runnable, 0.0d);
    }

    public void bc(boolean z10) {
        synchronized (this.Z) {
            if (this.f28115x1 != z10) {
                this.f28115x1 = z10;
                if (!this.f28117y1) {
                    int i10 = this.f28119z1.get();
                    if (i10 <= 0) {
                        this.X.x();
                    } else {
                        throw new IllegalStateException("referenceCount == " + i10);
                    }
                }
            }
        }
    }

    public void bd(final TdApi.Session session, final kb.j<TdApi.Error> jVar) {
        v4().o(new TdApi.TerminateSession(session.f19961id), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                o6.this.E9(jVar, session, object);
            }
        });
    }

    public final void be(TdApi.UpdateFileGenerationStop updateFileGenerationStop) {
        synchronized (this.O1) {
            l remove = this.P1.remove(Long.valueOf(updateFileGenerationStop.generationId));
            if (remove != null) {
                Runnable runnable = remove.f28152f;
                if (runnable != null) {
                    runnable.run();
                }
                return;
            }
            l5().F0(updateFileGenerationStop);
        }
    }

    @Override
    public final o6 c() {
        return this;
    }

    public int c2() {
        return this.C0;
    }

    public boolean c3(TdApi.Chat chat) {
        if (chat == null) {
            return false;
        }
        boolean i32 = t2.i3(O3(chat.f19908id), false);
        if (i32 || chat.type.getConstructor() == -1472570774) {
            return i32;
        }
        if (chat.lastMessage != null) {
            return true;
        }
        TdApi.ChatPosition[] chatPositionArr = chat.positions;
        if (chatPositionArr != null) {
            for (TdApi.ChatPosition chatPosition : chatPositionArr) {
                if (chatPosition.order != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public TdApi.Supergroup c4(long j10) {
        long p10 = ob.a.p(j10);
        if (p10 != 0) {
            return e2().g2(p10);
        }
        return null;
    }

    public void c5(long j10, long j11, TdApi.FormattedText formattedText) {
        t2.O4(formattedText);
        Ha(j10, j11, formattedText, new TdApi.EditMessageCaption(j10, j11, null, formattedText), this.U1);
    }

    public void c6(boolean z10, final kb.j<p> jVar) {
        if (z10) {
            bb(new Runnable() {
                @Override
                public final void run() {
                    o6.this.r8(jVar);
                }
            });
        } else {
            v4().o(new TdApi.GetActiveSessions(), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    o6.this.s8(jVar, object);
                }
            });
        }
    }

    public boolean c7(TdApi.Chat chat) {
        if (chat == null) {
            return false;
        }
        int constructor = chat.type.getConstructor();
        if (constructor != -1472570774) {
            return constructor == 973884508;
        }
        return !((TdApi.ChatTypeSupergroup) chat.type).isChannel;
    }

    public TdApi.MessageSender ca() {
        return new TdApi.MessageSenderUser(fa());
    }

    public void cb(final Runnable runnable, double d10) {
        H6(1);
        x4().v(new Runnable() {
            @Override
            public final void run() {
                o6.this.c9(runnable);
            }
        }, d10);
    }

    public void cc(final boolean z10) {
        if (this.f28051b2 != z10) {
            this.f28051b2 = z10;
            Ia(new kb.j() {
                @Override
                public final void a(Object obj) {
                    o6.this.o9(z10, (Client) obj);
                }
            }, null);
        }
    }

    public long cd(long j10, TimeUnit timeUnit) {
        return Math.max(System.currentTimeMillis() - timeUnit.toMillis(j10), 0L);
    }

    public final void ce(TdApi.UpdateFileRemovedFromDownloads updateFileRemovedFromDownloads) {
        this.f28071i0.R1(updateFileRemovedFromDownloads);
    }

    public void d2(TdApi.MessageSender messageSender, boolean z10, Client.g gVar) {
        v4().o(new TdApi.ToggleMessageSenderIsBlocked(messageSender, z10), gVar);
    }

    public ld.h d3(long j10) {
        TdApi.ChatPhotoInfo chatPhotoInfo;
        if (j10 == 0) {
            return null;
        }
        TdApi.Chat W2 = W2(j10);
        if (W2 != null) {
            chatPhotoInfo = W2.photo;
        } else {
            chatPhotoInfo = null;
        }
        if (chatPhotoInfo == null) {
            return null;
        }
        ld.h hVar = new ld.h(this, chatPhotoInfo.small);
        hVar.t0(wc.a.getDefaultAvatarCacheSize());
        return hVar;
    }

    public TdApi.ChatType d4(long j10) {
        long j11 = 0;
        if (j10 == 0) {
            return null;
        }
        switch (ob.a.d(j10)) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                long p10 = ob.a.p(j10);
                TdApi.Supergroup g22 = e2().g2(p10);
                return new TdApi.ChatTypeSupergroup(p10, g22 != null && g22.isChannel);
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
                int n10 = ob.a.n(j10);
                TdApi.SecretChat Q1 = e2().Q1(n10);
                if (Q1 != null) {
                    j11 = Q1.userId;
                }
                return new TdApi.ChatTypeSecret(n10, j11);
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                return new TdApi.ChatTypeBasicGroup(ob.a.m(j10));
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                return new TdApi.ChatTypePrivate(ob.a.q(j10));
            default:
                throw new IllegalArgumentException("chatId == " + j10);
        }
    }

    public void d5(final long j10, final long j11, final TdApi.InputMessageText inputMessageText, TdApi.WebPage webPage, boolean z10) {
        TdApi.WebPage webPage2 = inputMessageText.disableWebPagePreview ? null : webPage;
        t2.O4(inputMessageText.text);
        final TdApi.MessageText messageText = new TdApi.MessageText(inputMessageText.text, webPage2);
        TdApi.TextEntity[] textEntityArr = inputMessageText.text.entities;
        if ((textEntityArr == null || textEntityArr.length <= 0) && z10) {
            v4().o(new TdApi.GetAnimatedEmoji(inputMessageText.text.text), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    o6.this.a8(j10, j11, inputMessageText, messageText, object);
                }
            });
        } else {
            Ha(j10, j11, messageText, new TdApi.EditMessageText(j10, j11, null, inputMessageText), this.T1);
        }
    }

    public boolean d7() {
        return this.f28047a2;
    }

    public TdApi.User da() {
        return e2().I0();
    }

    public void db(Runnable runnable) {
        eb(runnable, 0L);
    }

    public final void dc(boolean z10) {
        if (this.K1 != z10) {
            this.K1 = z10;
            F4().b1().q(this, z10);
        }
    }

    public long dd() {
        long j10 = this.f28066g1;
        if (j10 != 0) {
            return SystemClock.uptimeMillis() - j10;
        }
        return 0L;
    }

    public final void de(TdApi.UpdateGroupCall updateGroupCall) {
        this.f28071i0.T1(updateGroupCall);
    }

    public t7 e2() {
        return this.f28068h0;
    }

    public int e3(long j10) {
        long j11 = 0;
        if (j10 == 0) {
            return t2.H0(-1L, fa());
        }
        switch (ob.a.d(j10)) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                return t2.H0(-ob.a.p(j10), fa());
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
                int n10 = ob.a.n(j10);
                TdApi.SecretChat Q1 = n10 != 0 ? e2().Q1(n10) : null;
                t7 e22 = e2();
                if (Q1 != null) {
                    j11 = Q1.userId;
                }
                return e22.w2(j11);
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                return t2.H0(-ob.a.m(j10), fa());
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                return e2().w2(ob.a.q(j10));
            default:
                throw new RuntimeException();
        }
    }

    public TdApi.User e4(long j10) {
        long h42 = h4(j10);
        if (h42 != 0) {
            return e2().u2(h42);
        }
        return null;
    }

    public String e5() {
        return gd.w.j1(R.string.email_metadata, "0.24.8.1519-arm64-v8a", this.f28054c1, ya.P0(), ya.Q0());
    }

    public CharSequence e6(TdApi.Chat chat) {
        return Z5(chat, R.id.right_sendStickersAndGifs, R.string.ChatDisabledStickers, R.string.ChatRestrictedStickers, R.string.ChatRestrictedStickersUntil);
    }

    public boolean e7() {
        return this.K1;
    }

    public TdApi.UserFullInfo ea() {
        long fa2 = fa();
        if (fa2 != 0) {
            return e2().D2(fa2);
        }
        return null;
    }

    public void eb(final Runnable runnable, long j10) {
        I6();
        hd().post(new Runnable() {
            @Override
            public final void run() {
                o6.this.d9(runnable);
            }
        });
    }

    public boolean ec(TdApi.LanguagePackInfo languagePackInfo) {
        return fc(languagePackInfo.f19945id, true);
    }

    public long ed(long j10, TimeUnit timeUnit) {
        return timeUnit.toMillis(j10) + (System.currentTimeMillis() - H4());
    }

    public final void ee(TdApi.UpdateGroupCallParticipant updateGroupCallParticipant) {
        this.f28071i0.V1(updateGroupCallParticipant);
    }

    public long f2(long j10) {
        long dd2 = dd();
        return dd2 != 0 ? Math.max(0L, j10 - dd2) : j10;
    }

    public int f3(TdApi.Chat chat) {
        if (chat != null) {
            switch (chat.type.getConstructor()) {
                case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                    return t2.H0(-((TdApi.ChatTypeSupergroup) chat.type).supergroupId, fa());
                case TdApi.ChatTypeSecret.CONSTRUCTOR:
                case TdApi.ChatTypePrivate.CONSTRUCTOR:
                    long i42 = i4(chat);
                    return o7(i42) ? R.id.theme_color_avatarSavedMessages : e2().w2(i42);
                case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                    return t2.H0(-((TdApi.ChatTypeBasicGroup) chat.type).basicGroupId, fa());
            }
        }
        return t2.H0(-1L, 0L);
    }

    public TdApi.User f4(TdApi.Chat chat) {
        long i42 = i4(chat);
        if (i42 != 0) {
            return e2().u2(i42);
        }
        return null;
    }

    public double f5() {
        return this.F0;
    }

    public final void f6(final String str, final String[] strArr, final kb.j<Map<String, TdApi.LanguagePackString>> jVar) {
        v4().o(new TdApi.GetLanguagePackStrings(str, strArr), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                o6.t8(j.this, strArr, str, object);
            }
        });
    }

    public boolean f7() {
        boolean z10;
        synchronized (this.Z) {
            if (this.X != null && !this.f28117y1) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    public long fa() {
        return e2().J0();
    }

    public final void fb() {
        q4();
        this.f28056d0.h(this);
        if (he.i.c2().k1(32L) && !W6()) {
            this.f28059e0.h(this);
        }
    }

    public final boolean fc(String str, boolean z10) {
        if (ib.i.c(str, str)) {
            return false;
        }
        this.f28054c1 = str;
        if (!z10) {
            return true;
        }
        he(v4(), false);
        return true;
    }

    public void fd(TdApi.ChatInviteLinkInfo chatInviteLinkInfo) {
        if (chatInviteLinkInfo.chatId != 0) {
            synchronized (this.f28045a0) {
                if (!chatInviteLinkInfo.isPublic && chatInviteLinkInfo.accessibleFor != 0) {
                    this.f28101s0.g(chatInviteLinkInfo.chatId, SystemClock.elapsedRealtime() + TimeUnit.SECONDS.toMillis(chatInviteLinkInfo.accessibleFor));
                }
                this.f28101s0.c(chatInviteLinkInfo.chatId);
            }
        }
    }

    public final void fe(TdApi.UpdateInstalledStickerSets updateInstalledStickerSets) {
        if (!updateInstalledStickerSets.isMasks) {
            synchronized (this.f28045a0) {
                this.f28108u1 = updateInstalledStickerSets.stickerSetIds.length;
            }
        }
        this.f28071i0.W1(updateInstalledStickerSets);
    }

    public long g2() {
        return this.f28075j1;
    }

    public boolean g3(long j10) {
        long m10 = ob.a.m(j10);
        return m10 != 0 && e2().N(m10);
    }

    public boolean g4(TdApi.Chat chat) {
        TdApi.User f42 = f4(chat);
        return f42 != null && f42.type.getConstructor() == -1807729372;
    }

    public void g5(kb.i iVar) {
        synchronized (this.Z) {
            if (this.H1 == null) {
                if (this.X == null || this.f28117y1 || this.V.k1()) {
                    this.H1 = null;
                    iVar.a(h5());
                    return;
                }
                this.H1 = iVar;
                this.X.x();
            }
        }
    }

    public void g6(final TdApi.LanguagePackInfo languagePackInfo, final String[] strArr, final kb.j<Map<String, TdApi.LanguagePackString>> jVar) {
        if (ib.i.i(languagePackInfo.baseLanguagePackId)) {
            f6(languagePackInfo.f19945id, strArr, jVar);
        } else {
            f6(languagePackInfo.f19945id, strArr, new kb.j() {
                @Override
                public final void a(Object obj) {
                    o6.this.v8(strArr, languagePackInfo, jVar, (Map) obj);
                }
            });
        }
    }

    public boolean g7(long j10) {
        TdApi.Chat W2;
        if (j10 == 0 || (W2 = W2(j10)) == null) {
            return false;
        }
        if (!ib.i.i(k4(W2))) {
            return true;
        }
        TdApi.Supergroup c42 = c4(j10);
        if (c42 != null) {
            return c42.hasLinkedChat || c42.hasLocation;
        }
        return false;
    }

    public long ga(boolean z10) {
        long fa2 = fa();
        return (fa2 != 0 || !z10) ? fa2 : A1().r();
    }

    public void gb(TdApi.Message message) {
        hd().sendMessageDelayed(hd().obtainMessage(4, message), ((TdApi.MessageLocation) message.content).expiresIn * 1000);
    }

    public final void gc(boolean z10) {
        if (this.E1 != z10) {
            this.E1 = z10;
            if (z10) {
                this.F1 = true;
            }
            F4().Y2(this.W, z10);
            t4();
            if (z10) {
                ka().v1(true);
            }
        }
    }

    public void gd(final long j10, final long j11, String str, final i iVar) {
        v4().o(new TdApi.TransferChatOwnership(j10, j11, str), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                o6.this.G9(iVar, j10, j11, object);
            }
        });
    }

    public final void ge(TdApi.UpdateLanguagePackStrings updateLanguagePackStrings) {
        if ("android_x".equals(updateLanguagePackStrings.localizationTarget)) {
            hd().sendMessage(hd().obtainMessage(11, updateLanguagePackStrings));
        }
    }

    public long h2() {
        return this.f28078k1;
    }

    public boolean h3(long j10) {
        TdApi.Chat W2 = W2(j10);
        return W2 != null && W2.isBlocked;
    }

    public long h4(long j10) {
        if (ob.a.i(j10)) {
            return ob.a.q(j10);
        }
        if (!ob.a.j(j10)) {
            return 0L;
        }
        TdApi.SecretChat Q1 = e2().Q1(ob.a.n(j10));
        if (Q1 != null) {
            return Q1.userId;
        }
        return 0L;
    }

    public final boolean h5() {
        File file = new File(this.f28052c.databaseDirectory, "db.sqlite-wal");
        boolean z10 = !file.exists() || file.delete();
        File file2 = new File(this.f28052c.databaseDirectory, "db.sqlite-shm");
        boolean z11 = (!file2.exists() || file2.delete()) && z10;
        File file3 = new File(this.f28052c.databaseDirectory, "db.sqlite");
        boolean z12 = (!file3.exists() || file3.delete()) && z11;
        if (z12) {
            this.I1 = true;
        }
        boolean z13 = i5() && z12;
        if (z13) {
            Log.i("Successfully deleted TDLib database, accountId:%d", Integer.valueOf(this.W));
        } else {
            Log.e("Failed to delete TDLib database, accountId:%d", Integer.valueOf(this.W));
        }
        return z13;
    }

    @Override
    public void h6(long j10, long j11) {
        if (ib.c.c(j10, 32L) != ib.c.c(j11, 32L) && !W6()) {
            if (!ib.c.c(j10, 32L) || this.f28059e0.f()) {
                O9().C(2);
            } else {
                this.f28059e0.h(this);
            }
        }
    }

    public boolean h7(long j10) {
        if (W6()) {
            return false;
        }
        long p10 = ob.a.p(j10);
        if (p10 == 0) {
            return false;
        }
        return p10 == 1084287520 || p10 == 1266791237 || p10 == 1492016544 || p10 == 1227585106 || p10 == 1116030833;
    }

    public String ha() {
        TdApi.User da2 = da();
        if (da2 == null || ib.i.i(da2.username)) {
            return null;
        }
        return da2.username;
    }

    public final void hb() {
        long j10;
        if (uc()) {
            long N5 = N5();
            long j11 = this.B1;
            if (j11 == 0) {
                Log.i((int) Log.TAG_ACCOUNTS, "Scheduling TDLib restart, accountId:%d, timeout:%d", Integer.valueOf(this.W), Long.valueOf(N5));
                this.B1 = SystemClock.uptimeMillis();
                this.A1 = N5;
                j10 = 0;
            } else {
                long j12 = this.A1;
                if (j12 != N5) {
                    this.A1 = N5;
                    long uptimeMillis = (j11 + N5) - SystemClock.uptimeMillis();
                    Log.i((int) Log.TAG_ACCOUNTS, "Rescheduling TDLib restart, accountId:%d, timeout:%d (%d->%d)", Integer.valueOf(this.W), Long.valueOf(uptimeMillis), Long.valueOf(j12), Long.valueOf(N5));
                    hd().removeMessages(7);
                    N5 = uptimeMillis;
                    j10 = 0;
                } else {
                    return;
                }
            }
            if (N5 > j10) {
                hd().sendMessageDelayed(hd().obtainMessage(7), N5);
            } else {
                Z4();
            }
        } else if (this.B1 != 0) {
            this.B1 = 0L;
            Log.i((int) Log.TAG_ACCOUNTS, "Canceling TDLib restart, accountId:%d, referenceCount:%d, keepAlive:%b", Integer.valueOf(this.W), Integer.valueOf(this.f28119z1.get()), Boolean.valueOf(A1().L()));
            hd().removeMessages(7);
        }
    }

    public void hc(long j10, int i10) {
        TdApi.ScopeNotificationSettings lb2 = lb(j10);
        TdApi.ChatNotificationSettings M3 = M3(j10);
        Objects.requireNonNull(lb2);
        Objects.requireNonNull(M3);
        M3.muteFor = i10;
        M3.useDefaultMuteFor = i10 == 0 && lb2.muteFor == 0;
        Pb(j10, M3);
    }

    public hj hd() {
        if (this.f28048b == null) {
            synchronized (this.f28044a) {
                if (this.f28048b == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    this.f28048b = new hj(this);
                    Log.i((int) Log.TAG_ACCOUNTS, "Created UI handler in %dms", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                }
            }
        }
        return this.f28048b;
    }

    public final void he(Client client, boolean z10) {
        if (z10) {
            this.f28054c1 = he.i.c2().Z0().f19945id;
            client.o(new TdApi.SetOption("language_pack_database_path", new TdApi.OptionValueString(this.V.V1())), this.M);
            client.o(new TdApi.SetOption("localization_target", new TdApi.OptionValueString("android_x")), this.M);
        }
        client.o(new TdApi.SetOption("language_pack_id", new TdApi.OptionValueString(this.f28054c1)), this.M);
    }

    public long i2(TdApi.Message message) {
        return message.isOutgoing ? h4(message.chatId) : Eb(message);
    }

    public boolean i3(TdApi.Chat chat) {
        return chat != null && h3(chat.f19908id);
    }

    public long i4(TdApi.Chat chat) {
        int constructor = chat.type.getConstructor();
        if (constructor == 862366513) {
            return ((TdApi.ChatTypeSecret) chat.type).userId;
        }
        if (constructor != 1579049844) {
            return 0L;
        }
        return ((TdApi.ChatTypePrivate) chat.type).userId;
    }

    public final boolean i5() {
        boolean z10;
        loop0: while (true) {
            z10 = true;
            for (String str : ya.B0(false)) {
                File file = new File(this.f28052c.filesDirectory, str);
                if (file.exists()) {
                    if (!ib.g.b(file, true) || !z10) {
                        z10 = false;
                    }
                }
            }
        }
        for (String str2 : ya.B0(true)) {
            File file2 = new File(this.f28052c.databaseDirectory, str2);
            if (file2.exists()) {
                z10 = ib.g.b(file2, true) && z10;
            }
        }
        return z10;
    }

    public TdApi.SuggestedAction[] i6() {
        TdApi.SuggestedAction[] suggestedActionArr;
        synchronized (this.f28045a0) {
            suggestedActionArr = (TdApi.SuggestedAction[]) this.f28079k2.toArray(new TdApi.SuggestedAction[0]);
        }
        return suggestedActionArr;
    }

    public boolean i7(long j10) {
        long j11 = this.f28081l1;
        return (j11 != 0 && j11 == j10) || j10 == ob.a.c(1271266957L);
    }

    public TdApi.NetworkType ia() {
        return this.Z1;
    }

    public final void ib() {
        if (!this.f28091o2) {
            SyncHelper.b(j0.q(), this.W);
            this.f28091o2 = true;
        }
    }

    public void ic(long j10, int i10) {
        TdApi.Chat R3 = R3(j10);
        Objects.requireNonNull(R3);
        TdApi.NotificationSettingsScope k22 = ka().k2(R3);
        TdApi.ScopeNotificationSettings nb2 = nb(k22);
        if (nb2 == null) {
            TdApi.Object w42 = w4(new TdApi.GetScopeNotificationSettings(k22), 0L);
            if (w42 instanceof TdApi.ScopeNotificationSettings) {
                nb2 = (TdApi.ScopeNotificationSettings) w42;
            }
        }
        Objects.requireNonNull(nb2);
        TdApi.ChatNotificationSettings chatNotificationSettings = R3.notificationSettings;
        chatNotificationSettings.muteFor = i10;
        chatNotificationSettings.useDefaultMuteFor = i10 == 0 && nb2.muteFor == 0;
        Pb(j10, chatNotificationSettings);
    }

    public void id(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            hd().post(runnable);
        }
    }

    public final void ie(TdApi.UpdateMessageLiveLocationViewed updateMessageLiveLocationViewed) {
        this.f28071i0.h2(updateMessageLiveLocationViewed);
        this.V.W1().t();
    }

    public boolean j2(TdApi.Chat chat) {
        TdApi.User f42 = f4(chat);
        if (f42 == null) {
            return false;
        }
        int constructor = f42.type.getConstructor();
        if (constructor != -970625144) {
            return constructor == -598644325;
        }
        return ((TdApi.UserTypeBot) f42.type).canJoinGroups;
    }

    public boolean j3(long j10) {
        return false;
    }

    public String j4(long j10) {
        if (j10 == 0) {
            return null;
        }
        switch (ob.a.d(j10)) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                TdApi.Supergroup g22 = e2().g2(ob.a.p(j10));
                if (g22 == null || ib.i.i(g22.username)) {
                    return null;
                }
                return g22.username;
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
                TdApi.SecretChat Q1 = e2().Q1(ob.a.n(j10));
                if (Q1 != null) {
                    return e2().Q2(Q1.userId);
                }
                return null;
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                return null;
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                return e2().Q2(ob.a.q(j10));
            default:
                throw new RuntimeException();
        }
    }

    public void j5(long j10, String str, TdApi.SearchMessagesFilter searchMessagesFilter, kb.j<List<TdApi.Message>> jVar) {
        TdApi.Function function;
        ArrayList arrayList = new ArrayList();
        boolean z10 = !ib.i.i(str) || searchMessagesFilter != null;
        if (z10) {
            function = new TdApi.SearchChatMessages(j10, str, null, 0L, 0, 100, searchMessagesFilter, 0L);
        } else {
            function = new TdApi.GetChatHistory(j10, 0L, 0, 0, false);
        }
        TdApi.Function function2 = function;
        v4().o(function2, new e(jVar, arrayList, z10, function2));
    }

    public void j6(final kb.k kVar) {
        if (this.V.k1() || W6()) {
            kVar.a(2);
            return;
        }
        long fa2 = fa();
        if (fa2 == 163957826) {
            kVar.a(5);
        } else if (fa2 == 7736885) {
            kVar.a(4);
        } else {
            Y2(f28039v2, new kb.j() {
                @Override
                public final void a(Object obj) {
                    o6.this.y8(kVar, (TdApi.Chat) obj);
                }
            });
        }
    }

    public boolean j7(TdApi.Message message, TdApi.Message message2) {
        TdApi.MessageForwardInfo messageForwardInfo = message.forwardInfo;
        String str = null;
        String str2 = messageForwardInfo != null ? messageForwardInfo.publicServiceAnnouncementType : null;
        TdApi.MessageForwardInfo messageForwardInfo2 = message2.forwardInfo;
        if (messageForwardInfo2 != null) {
            str = messageForwardInfo2.publicServiceAnnouncementType;
        }
        return ob.e.Y(message.senderId, message2.senderId) && ib.i.c(str2, str);
    }

    public final k ja() {
        Object[] objArr = new Object[4];
        objArr[0] = Boolean.valueOf(this.X != null);
        objArr[1] = Integer.valueOf(this.W);
        objArr[2] = Boolean.valueOf(W6());
        objArr[3] = Boolean.valueOf(this.f28117y1);
        Log.i("Creating TDLib client, hasInstance:%b, accountId:%d, debug:%b, wasPaused:%b", objArr);
        this.f28117y1 = false;
        return new k(this);
    }

    public void jb(s4 s4Var, int i10, int i11, int i12, long j10) {
        int i13 = i10 + 100000;
        if (j10 > 0) {
            hd().sendMessageDelayed(hd().obtainMessage(i13, i11, i12, s4Var), j10);
        } else {
            hd().sendMessage(hd().obtainMessage(i13, i11, i12, s4Var));
        }
    }

    public final void jc(boolean z10) {
        if (this.f28088n2 != z10) {
            this.f28088n2 = z10;
            if (z10) {
                ib();
            } else {
                T2();
            }
        }
    }

    public String jd() {
        return this.W + "." + this.f28104t0;
    }

    public final void je(TdApi.UpdateMessageContent updateMessageContent) {
        synchronized (this.f28045a0) {
            if (!kj.b(updateMessageContent.chatId, this.f28049b0.get(Long.valueOf(updateMessageContent.chatId)), updateMessageContent)) {
                this.f28071i0.X1(updateMessageContent);
                int constructor = updateMessageContent.newContent.getConstructor();
                if (constructor == -662130099) {
                    O9().G2(((TdApi.MessagePoll) updateMessageContent.newContent).poll);
                } else if (constructor == 303973492) {
                    e2().t2(updateMessageContent.chatId, updateMessageContent.messageId, (TdApi.MessageLocation) updateMessageContent.newContent);
                }
            }
        }
    }

    public boolean k2(TdApi.Chat chat) {
        return Y5(chat, R.id.right_embedLinks) == null;
    }

    public boolean k3(TdApi.Chat chat) {
        TdApi.User f42;
        if (chat == null) {
            return false;
        }
        int constructor = chat.type.getConstructor();
        if (constructor != -1472570774) {
            return (constructor == 862366513 || constructor == 1579049844) && (f42 = f4(chat)) != null && f42.isFake;
        }
        TdApi.Supergroup g22 = e2().g2(ob.a.p(chat.f19908id));
        return g22 != null && g22.isFake;
    }

    public String k4(TdApi.Chat chat) {
        if (chat == null) {
            return null;
        }
        switch (chat.type.getConstructor()) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                TdApi.Supergroup g22 = e2().g2(((TdApi.ChatTypeSupergroup) chat.type).supergroupId);
                if (g22 == null || ib.i.i(g22.username)) {
                    return null;
                }
                return g22.username;
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                return e2().Q2(i4(chat));
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                return null;
            default:
                throw new RuntimeException();
        }
    }

    public <T extends i.d> void k5(final kb.j<List<T>> jVar, final String str, final kb.e<T> eVar, final kb.e<T> eVar2, final c1<T, TdApi.Message> c1Var) {
        x4().f28146c.j(new kb.j() {
            @Override
            public final void a(Object obj) {
                o6.this.b8(eVar, c1Var, eVar2, jVar, (List) obj);
            }
        }, new kb.d() {
            @Override
            public final boolean a(Object obj) {
                boolean c82;
                c82 = o6.c8(str, (TdApi.Message) obj);
                return c82;
            }
        });
    }

    public int k6(TdApi.ChatList chatList) {
        int i10;
        synchronized (this.f28045a0) {
            i10 = A5(chatList).f28793a;
        }
        return i10;
    }

    public boolean k7(long j10) {
        return o7(ob.a.q(j10));
    }

    public jb ka() {
        return this.f28092p0;
    }

    public int kb(TdApi.NotificationSettingsScope notificationSettingsScope) {
        TdApi.ScopeNotificationSettings M0 = this.f28092p0.M0(notificationSettingsScope);
        if (M0 != null) {
            return M0.muteFor;
        }
        return 0;
    }

    public void kc(final TdApi.NetworkType networkType) {
        this.Z1 = networkType;
        Ia(new kb.j() {
            @Override
            public final void a(Object obj) {
                o6.this.p9(networkType, (Client) obj);
            }
        }, null);
        O9().K1(networkType);
    }

    public String kd(long j10) {
        return this.W + "." + this.f28104t0 + "." + j10;
    }

    public final void ke(TdApi.UpdateMessageContentOpened updateMessageContentOpened) {
        this.f28071i0.Z1(updateMessageContentOpened);
    }

    public boolean l2(TdApi.ChatList chatList, TdApi.Chat chat) {
        TdApi.ChatPosition[] chatPositionArr;
        if (chat == null) {
            return false;
        }
        if ((chatList != null && chatList.getConstructor() == -2022707655) || (chatPositionArr = chat.positions) == null) {
            return false;
        }
        for (TdApi.ChatPosition chatPosition : chatPositionArr) {
            int constructor = chatPosition.list.getConstructor();
            if (constructor == -400991316) {
                return !k7(chat.f19908id) && !p7(chat.f19908id);
            }
            if (constructor == 362770115) {
                return true;
            }
        }
        return false;
    }

    public boolean l3(long j10) {
        TdApi.Chat W2 = W2(j10);
        return W2 != null && W2.hasScheduledMessages;
    }

    public boolean l4(TdApi.Chat chat) {
        TdApi.User f42;
        if (chat == null) {
            return false;
        }
        int constructor = chat.type.getConstructor();
        if (constructor != -1472570774) {
            return (constructor == 862366513 || constructor == 1579049844) && (f42 = f4(chat)) != null && f42.isVerified;
        }
        TdApi.Supergroup g22 = e2().g2(ob.a.p(chat.f19908id));
        return g22 != null && g22.isVerified;
    }

    public w l5() {
        return this.f28095q0;
    }

    public x6 l6() {
        this.f28093p1.d(this);
        return this.f28093p1;
    }

    public boolean l7(TdApi.Chat chat) {
        return chat != null && k7(chat.f19908id);
    }

    public final void la(long j10, long j11) {
        synchronized (this.f28045a0) {
            Map<String, Queue<Runnable>> map = this.V1;
            if (map != null) {
                Queue<Runnable> remove = map.remove(j10 + "_" + j11);
                if (remove != null) {
                    for (Runnable runnable : remove) {
                        runnable.run();
                    }
                }
            }
        }
    }

    public TdApi.ScopeNotificationSettings lb(long j10) {
        return this.f28092p0.K0(j10);
    }

    public void lc(final boolean z10) {
        if (this.f28047a2 != z10) {
            this.f28047a2 = z10;
            Log.i("SetOnline accountId:%d -> %b", Integer.valueOf(this.W), Boolean.valueOf(z10));
            Ia(new kb.j() {
                @Override
                public final void a(Object obj) {
                    o6.this.q9(z10, (Client) obj);
                }
            }, null);
        }
    }

    public final void ld(TdApi.UpdateAnimatedEmojiMessageClicked updateAnimatedEmojiMessageClicked) {
        this.f28071i0.A0(updateAnimatedEmojiMessageClicked);
    }

    public final void le(TdApi.UpdateMessageEdited updateMessageEdited) {
        this.f28071i0.b2(updateMessageEdited);
    }

    public boolean m2(TdApi.Chat chat) {
        return n2(chat, true);
    }

    public je.e m3(long j10) {
        if (j10 != 0) {
            switch (ob.a.d(j10)) {
                case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                    return t2.B1(U3(j10));
                case TdApi.ChatTypeSecret.CONSTRUCTOR:
                case TdApi.ChatTypePrivate.CONSTRUCTOR:
                    return t2.E1(e4(h4(j10)));
            }
        }
        return t2.A1();
    }

    public List<TdApi.Chat> m4(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        synchronized (this.f28045a0) {
            for (long j10 : jArr) {
                TdApi.Chat chat = this.f28049b0.get(Long.valueOf(j10));
                if (!kj.a(j10, chat)) {
                    arrayList.add(chat);
                }
            }
        }
        return arrayList;
    }

    public h9 m5() {
        return this.f28074j0;
    }

    public int m6() {
        return l6().b();
    }

    public boolean m7(TdApi.Message message) {
        return message != null && (message.isOutgoing || n7(message.senderId));
    }

    public TdApi.Chat ma(TdApi.Object object) {
        return W2(((TdApi.Chat) object).f19908id);
    }

    public TdApi.ScopeNotificationSettings mb(TdApi.Chat chat) {
        return this.f28092p0.L0(chat);
    }

    public void mc(TdApi.Chat chat, j jVar) {
        if (chat == null) {
            return;
        }
        if (jVar == null || !he.d.z(jVar.f28140a)) {
            Kb(chat, null);
        } else {
            Kb(chat, jVar.toString());
        }
    }

    public final void md(TdApi.UpdateAnimationSearchParameters updateAnimationSearchParameters) {
    }

    public final void me(TdApi.UpdateMessageInteractionInfo updateMessageInteractionInfo) {
        this.f28071i0.d2(updateMessageInteractionInfo);
    }

    public boolean n2(org.drinkless.td.libcore.telegram.TdApi.Chat r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: zd.o6.n2(org.drinkless.td.libcore.telegram.TdApi$Chat, boolean):boolean");
    }

    public je.e n3(TdApi.Chat chat) {
        if (chat != null) {
            switch (chat.type.getConstructor()) {
                case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                    return t2.B1(W3(chat));
                case TdApi.ChatTypeSecret.CONSTRUCTOR:
                case TdApi.ChatTypePrivate.CONSTRUCTOR:
                    return t2.E1(f4(chat));
            }
        }
        return t2.A1();
    }

    public boolean n4(boolean z10, boolean z11) {
        ArrayList arrayList;
        int T1 = T1();
        if (!(T1 == 2 || T1 == 1)) {
            return false;
        }
        String str = this.W + "_app_version";
        if (T1 == 1 || z10) {
            he.i.c2().u3(str, 1519);
            return z10;
        }
        int V0 = !z11 ? he.i.c2().V0(str, 0) : 0;
        if (V0 != 1519) {
            final ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            if (u4(V0, 906, z11)) {
                arrayList = arrayList3;
                Q9(0, 20, 6, 906, "http://telegra.ph/Telegram-X-03-26", arrayList3, arrayList2, false);
            } else {
                arrayList = arrayList3;
            }
            if (u4(V0, 967, z11)) {
                Q9(0, 20, 10, 967, "http://telegra.ph/Telegram-X-07-27", arrayList, arrayList2, false);
            }
            if (u4(V0, 1005, z11)) {
                Q9(0, 21, 1, 1005, "https://telegra.ph/Telegram-X-10-14", arrayList, arrayList2, false);
            }
            u4(V0, 1010, z11);
            if (u4(V0, 1149, z11)) {
                Q9(0, 21, 7, 1149, "https://telegra.ph/Telegram-X-04-25", arrayList, arrayList2, false);
            }
            if (u4(V0, 1270, z11)) {
                Q9(0, 22, 4, 1270, "https://telegra.ph/Telegram-X-01-23-2", arrayList, arrayList2, false);
            }
            if (u4(V0, 1302, z11)) {
                Q9(0, 22, 5, 1302, "https://telegra.ph/Telegram-X-02-29", arrayList, arrayList2, false);
            }
            if (u4(V0, 1361, z11)) {
                Q9(0, 22, 8, 1361, "https://telegra.ph/Telegram-X-04-23", arrayList, arrayList2, false);
            }
            if (u4(V0, 1470, z11)) {
                Q9(0, 24, 2, 1470, "https://telegra.ph/Telegram-X-11-08", arrayList, arrayList2, true);
            }
            if (!arrayList2.isEmpty()) {
                H6(1);
                ArrayList<TdApi.Function> arrayList4 = arrayList;
                arrayList4.add(new TdApi.CreatePrivateChat(777000L, false));
                long j10 = this.f28084m1;
                if (!(j10 == 0 || j10 == 777000)) {
                    arrayList4.add(new TdApi.GetChat(j10));
                }
                final AtomicInteger atomicInteger = new AtomicInteger(arrayList4.size());
                Client.g l6Var = new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        o6.this.N7(atomicInteger, arrayList2, object);
                    }
                };
                for (TdApi.Function function : arrayList4) {
                    v4().o(function, l6Var);
                }
            }
            he.i.c2().u3(str, 1519);
        }
        return true;
    }

    public TdApi.DiceStickers n5(String str, int i10, TdApi.DiceStickers diceStickers) {
        TdApi.Sticker o52;
        return (!t2.G.f13581a.equals(str) || (o52 = o5(i10)) == null) ? diceStickers : new TdApi.DiceStickersRegular(o52);
    }

    public String n6() {
        return this.f28046a1;
    }

    public boolean n7(TdApi.MessageSender messageSender) {
        return messageSender != null && o7(ob.e.U0(messageSender));
    }

    public Client.g na() {
        return this.M;
    }

    public TdApi.ScopeNotificationSettings nb(TdApi.NotificationSettingsScope notificationSettingsScope) {
        return this.f28092p0.M0(notificationSettingsScope);
    }

    public void nc(int i10, String str, int i11, TdApi.ProxyType proxyType) {
        TdApi.Function function;
        if (str != null) {
            function = new TdApi.AddProxy(str, i11, true, proxyType);
        } else {
            function = new TdApi.DisableProxy();
        }
        v4().o(function, s2.f28363a);
    }

    public final void nd(TdApi.UpdateAttachmentMenuBots updateAttachmentMenuBots) {
    }

    public final void ne(TdApi.UpdateMessageIsPinned updateMessageIsPinned) {
        this.f28071i0.f2(updateMessageIsPinned);
    }

    public boolean o2(long j10) {
        return j10 != 0 && p2(W2(j10));
    }

    public e8 o3(TdApi.ChatList chatList) {
        e8 p32;
        synchronized (this.f28045a0) {
            p32 = p3(chatList);
        }
        return p32;
    }

    public void o4() {
        p4(v4(), false);
    }

    public final TdApi.Sticker o5(int i10) {
        TdApi.Sticker[] stickerArr;
        String[] strArr;
        char c10;
        int i11;
        if (!he.i.c2().k1(32L)) {
            return null;
        }
        TdApi.StickerSet stickerSet = this.f28059e0.f28172b;
        if (stickerSet != null) {
            String D0 = gd.w.D0();
            String Z = gd.w.Z();
            String T = id.d.T(i10);
            TdApi.Sticker sticker = null;
            int i12 = 0;
            for (TdApi.Sticker sticker2 : stickerSet.stickers) {
                int i13 = -1;
                char c11 = 0;
                for (String str : stickerSet.emojis[i12].emojis) {
                    stickerSet = stickerSet;
                    if (str.equals(D0)) {
                        i11 = i13;
                        c10 = 2;
                    } else if (str.equals(Z)) {
                        i11 = i13;
                        c10 = 1;
                    } else if (str.equals(t2.G.f13581a)) {
                        c10 = c11;
                        i11 = 1;
                    } else if (str.equals(T)) {
                        i11 = i10;
                        c10 = c11;
                    } else {
                        continue;
                    }
                    i13 = i11;
                    if (i11 == i10) {
                        if (c10 == 2) {
                            return sticker2;
                        }
                        if (c10 == 1) {
                            c11 = c10;
                            sticker = sticker2;
                        }
                    }
                    c11 = c10;
                }
                i12++;
            }
            if (sticker != null) {
                return sticker;
            }
        }
        TdApi.Sticker d10 = this.f28059e0.d(i10);
        if (d10 != null) {
            return d10;
        }
        if (i10 != 1) {
            return null;
        }
        TdApi.Sticker e10 = this.f28059e0.e(gd.w.D0());
        if (e10 != null) {
            return e10;
        }
        TdApi.Sticker e11 = this.f28059e0.e(gd.w.Z());
        return e11 != null ? e11 : this.f28059e0.e(t2.G.f13581a);
    }

    public String o6(String str) {
        Uri parse;
        List<String> pathSegments;
        if (ib.i.i(str)) {
            return null;
        }
        try {
            parse = Uri.parse(str);
        } catch (Throwable unused) {
        }
        if (!"tg".equals(parse.getScheme())) {
            if (ib.i.i(parse.getScheme())) {
                parse = Uri.parse("http://" + str);
            }
            if (a7(parse.getHost(), false) && (pathSegments = parse.getPathSegments()) != null && pathSegments.size() == 2 && "bg".equalsIgnoreCase(pathSegments.get(0))) {
                String query = parse.getQuery();
                if (ib.i.i(query)) {
                    return pathSegments.get(1);
                }
                return pathSegments.get(1) + "?" + query;
            }
            return null;
        } else if (!"bg".equals(parse.getHost())) {
            return null;
        } else {
            String queryParameter = parse.getQueryParameter("slug");
            if (ib.i.i(queryParameter)) {
                return parse.getQueryParameter("color");
            }
            String queryParameter2 = parse.getQueryParameter("bg_color");
            String queryParameter3 = parse.getQueryParameter("intensity");
            if (ib.i.i(queryParameter2) && ib.i.i(queryParameter3)) {
                return queryParameter;
            }
            StringBuilder sb2 = new StringBuilder(queryParameter);
            sb2.append("?");
            if (!ib.i.i(queryParameter2)) {
                sb2.append("bg_color=");
                sb2.append(queryParameter2);
            }
            if (!ib.i.i(queryParameter3)) {
                if (!ib.i.i(queryParameter2)) {
                    sb2.append("&");
                }
                sb2.append("intensity=");
                sb2.append(queryParameter3);
            }
            return sb2.toString();
        }
    }

    public boolean o7(long j10) {
        return j10 != 0 && j10 == ga(true);
    }

    public Client.g oa(final Runnable runnable) {
        if (runnable != null) {
            return new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    o6.this.M8(runnable, object);
                }
            };
        }
        return na();
    }

    public void ob(String str, int i10, Client.g gVar) {
        v4().o(new TdApi.SearchContacts(str, i10), gVar);
    }

    public void oc(final TdApi.NotificationSettingsScope notificationSettingsScope, final int i10) {
        TdApi.ScopeNotificationSettings nb2 = nb(notificationSettingsScope);
        if (nb2 != null) {
            nb2.muteFor = i10;
            pc(notificationSettingsScope, nb2);
            return;
        }
        v4().o(new TdApi.GetScopeNotificationSettings(notificationSettingsScope), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                o6.this.s9(i10, notificationSettingsScope, object);
            }
        });
    }

    public final void od(zd.o6.k r12, org.drinkless.td.libcore.telegram.TdApi.AuthorizationState r13) {
        throw new UnsupportedOperationException("Method not decompiled: zd.o6.od(zd.o6$k, org.drinkless.td.libcore.telegram.TdApi$AuthorizationState):void");
    }

    public final void oe(TdApi.UpdateMessageMentionRead updateMessageMentionRead) {
        synchronized (this.f28045a0) {
            TdApi.Chat chat = this.f28049b0.get(Long.valueOf(updateMessageMentionRead.chatId));
            if (!kj.b(updateMessageMentionRead.chatId, chat, updateMessageMentionRead)) {
                int i10 = chat.unreadMentionCount;
                boolean z10 = true;
                boolean z11 = i10 > 0;
                int i11 = updateMessageMentionRead.unreadMentionCount;
                boolean z12 = z11 != (i11 > 0);
                if (i10 == i11) {
                    z10 = false;
                }
                chat.unreadMentionCount = i11;
                this.f28071i0.k2(updateMessageMentionRead, z10, z12);
            }
        }
    }

    public boolean p2(TdApi.Chat chat) {
        return (chat == null || chat.lastMessage == null || (!chat.canBeDeletedOnlyForSelf && !chat.canBeDeletedForAllUsers)) ? false : true;
    }

    public final e8 p3(TdApi.ChatList chatList) {
        String o42 = t2.o4(chatList);
        e8 e8Var = this.f28053c0.get(o42);
        if (e8Var != null) {
            return e8Var;
        }
        e8 e8Var2 = new e8(this, chatList);
        this.f28053c0.put(o42, e8Var2);
        return e8Var2;
    }

    public final void p4(Client client, boolean z10) {
        int Y0 = F4().Y0();
        String W5 = W5();
        if (!ib.i.i(W5) && (Y0 == 0 || Y0 == 2)) {
            Y0 = 3;
        }
        if (Y0 != 0) {
            String X0 = F4().X0();
            ArrayList arrayList = new ArrayList();
            if (Y0 == 1) {
                arrayList.add(new TdApi.JsonObjectMember("device_token", new TdApi.JsonValueString("FIREBASE_ERROR")));
                if (!ib.i.i(X0)) {
                    arrayList.add(new TdApi.JsonObjectMember("firebase_error", new TdApi.JsonValueString(X0)));
                }
            } else if (Y0 == 2) {
                arrayList.add(new TdApi.JsonObjectMember("device_token", new TdApi.JsonValueString("FIREBASE_INITIALIZING")));
            } else if (Y0 != 3) {
                arrayList.add(new TdApi.JsonObjectMember("device_token", new TdApi.JsonValueString("UNKNOWN")));
            } else {
                arrayList.add(new TdApi.JsonObjectMember("device_token", new TdApi.JsonValueString(W5)));
            }
            String e10 = ob.c.e(arrayList);
            if (e10 == null) {
                return;
            }
            if (z10 || !ib.i.c(this.X1, e10)) {
                this.X1 = e10;
                client.o(new TdApi.SetOption("connection_parameters", new TdApi.OptionValueString(e10)), this.M);
            }
        }
    }

    public TdApi.Sticker p5(String str) {
        return this.f28056d0.e(str);
    }

    public void p6(Message message) {
        int i10 = message.what;
        boolean z10 = false;
        switch (i10) {
            case 1:
                this.f28077k0.y((TdApi.UpdateChatAction) message.obj);
                return;
            case 2:
                this.f28068h0.i1((TdApi.UpdateCall) message.obj);
                return;
            case 3:
                TdApi.ChatList chatList = (TdApi.ChatList) message.obj;
                int i11 = message.arg1;
                if (message.arg2 == 1) {
                    z10 = true;
                }
                W4(chatList, i11, z10);
                return;
            case 4:
                e2().f1((TdApi.Message) message.obj);
                return;
            case 5:
                e2().c1(message.arg1, message.arg2);
                return;
            case 6:
                e2().b1(message.arg1, message.arg2);
                return;
            case 7:
                Y4();
                return;
            case 8:
                t7 e22 = e2();
                TdApi.UpdateUserStatus updateUserStatus = (TdApi.UpdateUserStatus) message.obj;
                if (message.arg1 == 1) {
                    z10 = true;
                }
                e22.s1(updateUserStatus, z10);
                return;
            case 9:
                hd().w3((TdApi.UpdateTermsOfService) message.obj);
                return;
            case 10:
            default:
                if (i10 >= 100000) {
                    ((s4) message.obj).a5(i10 - 100000, message.arg1, message.arg2);
                    return;
                }
                return;
            case 11:
                gd.w.Z2((TdApi.UpdateLanguagePackStrings) message.obj);
                return;
        }
    }

    public boolean p7(long j10) {
        long j11 = this.f28084m1;
        return (j11 != 0 && j11 == j10) || j10 == ob.a.c(777000L);
    }

    public final void pa() {
        Xb(false);
        this.f28097q2.d();
    }

    public TdApi.Chat pb() {
        return W2(qb());
    }

    public void pc(TdApi.NotificationSettingsScope notificationSettingsScope, TdApi.ScopeNotificationSettings scopeNotificationSettings) {
        v4().o(new TdApi.SetScopeNotificationSettings(notificationSettingsScope, scopeNotificationSettings), this.M);
    }

    public final void pd(TdApi.UpdateCall updateCall) {
        if (t2.G2(updateCall.call)) {
            k0.h<TdApi.Call> hVar = this.f28073i2;
            TdApi.Call call = updateCall.call;
            hVar.j(call.f19905id, call);
        } else {
            this.f28073i2.k(updateCall.call.f19905id);
        }
        Yb(!this.f28073i2.h());
        hd().sendMessage(hd().obtainMessage(2, updateCall));
        this.f28071i0.G0(updateCall);
    }

    public final void pe(TdApi.UpdateMessageSendFailed updateMessageSendFailed) {
        j0.t0(new TdApi.Error(updateMessageSendFailed.errorCode, updateMessageSendFailed.errorMessage));
        synchronized (this.f28045a0) {
            he.i c22 = he.i.c2();
            int i10 = this.W;
            TdApi.Message message = updateMessageSendFailed.message;
            c22.l6(i10, message.chatId, updateMessageSendFailed.oldMessageId, message.f19946id);
        }
        this.f28071i0.p2(updateMessageSendFailed);
        this.f28083m0.f(updateMessageSendFailed.message.chatId, updateMessageSendFailed.oldMessageId);
        this.V.b1().t(this, updateMessageSendFailed);
        J1(updateMessageSendFailed.message.chatId, updateMessageSendFailed.oldMessageId, false);
    }

    public boolean q2(long j10) {
        return j10 != 0 && r2(W2(j10));
    }

    public final e8[] q3(TdApi.ChatPosition[] chatPositionArr) {
        if (chatPositionArr == null || chatPositionArr.length == 0) {
            return null;
        }
        e8[] e8VarArr = new e8[chatPositionArr.length];
        for (int i10 = 0; i10 < chatPositionArr.length; i10++) {
            e8VarArr[i10] = p3(chatPositionArr[i10].list);
        }
        return e8VarArr;
    }

    public void q4() {
        bb(new Runnable() {
            @Override
            public final void run() {
                o6.this.O7();
            }
        });
    }

    public void q5(final kb.j<zd.o6.s> r8) {
        throw new UnsupportedOperationException("Method not decompiled: zd.o6.q5(kb.j):void");
    }

    public boolean q6() {
        return k6(ob.b.f19339b) > 0;
    }

    public boolean q7(TdApi.SuggestedAction suggestedAction) {
        return suggestedAction.getConstructor() == 648771563 || suggestedAction.getConstructor() == 1910534839;
    }

    public final void qa() {
        this.f28094p2.d();
        this.f28100r2.d();
        this.f28097q2.d();
    }

    public long qb() {
        return ob.a.c(fa());
    }

    public final void qc(String str, TdApi.LanguagePackInfo languagePackInfo) {
        if (ib.i.c(this.f28057d1, str) && this.f28060e1 == null) {
            this.f28060e1 = languagePackInfo;
            O9().M2(str, languagePackInfo);
        }
    }

    public final void qd(TdApi.UpdateNewCallSignalingData updateNewCallSignalingData) {
        this.f28071i0.y2(updateNewCallSignalingData);
    }

    public final void qe(TdApi.UpdateMessageSendSucceeded updateMessageSendSucceeded) {
        synchronized (this.f28045a0) {
            he.i c22 = he.i.c2();
            int i10 = this.W;
            TdApi.Message message = updateMessageSendSucceeded.message;
            c22.l6(i10, message.chatId, updateMessageSendSucceeded.oldMessageId, message.f19946id);
        }
        la(updateMessageSendSucceeded.message.chatId, updateMessageSendSucceeded.oldMessageId);
        this.f28071i0.r2(updateMessageSendSucceeded);
        this.f28092p0.D1(updateMessageSendSucceeded);
        this.f28083m0.g(updateMessageSendSucceeded.message.chatId, updateMessageSendSucceeded.oldMessageId);
        this.V.b1().u(this, updateMessageSendSucceeded);
        this.f28068h0.K(updateMessageSendSucceeded.message);
        J1(updateMessageSendSucceeded.message.chatId, updateMessageSendSucceeded.oldMessageId, false);
    }

    public boolean r2(TdApi.Chat chat) {
        return (chat == null || chat.lastMessage == null || !chat.canBeDeletedForAllUsers) ? false : true;
    }

    public TdApi.ChatLocation r3(long j10) {
        TdApi.SupergroupFullInfo h22;
        if (j10 == 0 || ob.a.d(j10) != -1472570774 || (h22 = e2().h2(ob.a.p(j10))) == null) {
            return null;
        }
        return h22.location;
    }

    public synchronized void r4(final Runnable runnable) {
        final String W0 = this.V.W0();
        if (!ib.i.i(W0) && T1() == 2) {
            final long fa2 = fa();
            if (fa2 != 0) {
                final long[] Z = this.V.Z(this.f28115x1);
                final long[] y10 = ib.b.y(Z, Arrays.binarySearch(Z, fa2));
                if (gc.j(A6(), fa2, W0, y10, false)) {
                    Log.i(4, "Device token already registered. accountId:%d", Integer.valueOf(this.W));
                    this.V.Q2(this.W, true);
                    v0.D2(runnable);
                    return;
                }
                Log.i(4, "Registering device token... accountId:%d", Integer.valueOf(this.W));
                this.V.Q2(this.W, false);
                TdApi.DeviceTokenFirebaseCloudMessaging deviceTokenFirebaseCloudMessaging = new TdApi.DeviceTokenFirebaseCloudMessaging(W0, true);
                H6(1);
                v4().o(new TdApi.RegisterDevice(deviceTokenFirebaseCloudMessaging, y10), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        o6.this.Q7(W0, y10, fa2, Z, runnable, object);
                    }
                });
            }
        }
    }

    public void r5(l lVar, TdApi.Error error) {
        synchronized (this.O1) {
            this.P1.remove(Long.valueOf(lVar.f28150d));
        }
        v4().o(new TdApi.FinishFileGeneration(lVar.f28150d, error), yc());
    }

    public boolean r6() {
        return !ib.i.i(this.N1) || !ib.i.i(this.M1);
    }

    public boolean r7() {
        return this.L1;
    }

    public final void ra() {
        H6(1);
    }

    public void rb(TdApi.Function function, Client.g gVar) {
        v4().o(function, gVar);
    }

    public final boolean rc(TdApi.ChatList chatList, int i10, int i11, int i12, int i13, int i14) {
        z8 A5 = A5(chatList);
        int max = Math.max(A5.f28794b, 0);
        int max2 = Math.max(A5.f28795c, 0);
        int i15 = A5.f28793a;
        if (!A5.e(i10, i11, i12, i13, i14)) {
            return false;
        }
        this.V.n1(chatList, i11 - max, i12 - max2, true);
        A1().f0(chatList, A5, true);
        O9().F(chatList, (i10 > 0) != (i15 > 0), i10, i11, i12);
        return true;
    }

    public final void rd(TdApi.UpdateChatActionBar updateChatActionBar) {
        synchronized (this.f28045a0) {
            TdApi.Chat chat = this.f28049b0.get(Long.valueOf(updateChatActionBar.chatId));
            if (!kj.b(updateChatActionBar.chatId, chat, updateChatActionBar)) {
                chat.actionBar = updateChatActionBar.actionBar;
                this.f28071i0.H0(updateChatActionBar);
            }
        }
    }

    public final void re(TdApi.UpdateMessageUnreadReactions updateMessageUnreadReactions) {
        this.f28071i0.t2(updateMessageUnreadReactions);
    }

    public boolean s2(long j10) {
        TdApi.Supergroup g22;
        if (j10 == 0) {
            return false;
        }
        long p10 = ob.a.p(j10);
        return (p10 == 0 || (g22 = e2().g2(p10)) == null || ib.i.i(g22.username)) ? false : true;
    }

    public int s3(long j10) {
        TdApi.BasicGroup M;
        if (j10 == 0) {
            return 0;
        }
        int d10 = ob.a.d(j10);
        if (d10 == -1472570774) {
            long p10 = ob.a.p(j10);
            TdApi.SupergroupFullInfo i22 = e2().i2(p10, false);
            int i10 = i22 != null ? i22.memberCount : 0;
            if (i10 > 0) {
                return i10;
            }
            TdApi.Supergroup g22 = e2().g2(p10);
            if (g22 != null) {
                return g22.memberCount;
            }
            return 0;
        } else if (d10 == 973884508 && (M = e2().M(ob.a.m(j10))) != null) {
            return M.memberCount;
        } else {
            return 0;
        }
    }

    public final boolean s4() {
        boolean z10 = this.f28055c2 || this.D1;
        if (this.C1 != z10) {
            this.C1 = z10;
            F4().X2(this.W, z10);
        }
        return z10;
    }

    public int s5() {
        return this.B0;
    }

    public boolean s6() {
        k0.e<ArrayList<v4<?>>> eVar = this.Q1;
        return eVar != null && eVar.p() > 0;
    }

    public boolean s7(int i10) {
        boolean z10;
        synchronized (this.f28045a0) {
            int[] iArr = this.f28111v1;
            z10 = (iArr == null || ib.b.r(iArr, i10) == -1) ? false : true;
        }
        return z10;
    }

    public final void sa() {
        L4(1);
    }

    public void sb(TdApi.Function[] functionArr, final Client.g gVar, final Runnable runnable) {
        if (functionArr.length != 0) {
            if (functionArr.length == 1) {
                TdApi.Function function = functionArr[0];
                if (runnable != null) {
                    gVar = new Client.g() {
                        @Override
                        public final void r2(TdApi.Object object) {
                            o6.e9(Client.g.this, runnable, object);
                        }
                    };
                }
                rb(function, gVar);
                return;
            }
            if (runnable != null) {
                final AtomicInteger atomicInteger = new AtomicInteger(functionArr.length);
                gVar = new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        o6.f9(Client.g.this, atomicInteger, runnable, object);
                    }
                };
            }
            for (TdApi.Function function2 : functionArr) {
                rb(function2, gVar);
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final boolean sc(TdApi.ChatList chatList, int i10, int i11) {
        z8 A5 = A5(chatList);
        int i12 = A5.f28798f;
        if (i12 == i10 && A5.f28799g == i11) {
            return false;
        }
        int max = Math.max(i12, 0);
        int max2 = Math.max(A5.f28799g, 0);
        A5.f28798f = i10;
        A5.f28799g = i11;
        this.V.n1(chatList, i10 - max, i11 - max2, false);
        A1().f0(chatList, A5, false);
        O9().H(chatList, i10, i11);
        return true;
    }

    public final void sd(TdApi.UpdateChatAvailableReactions updateChatAvailableReactions) {
        synchronized (this.f28045a0) {
            TdApi.Chat chat = this.f28049b0.get(Long.valueOf(updateChatAvailableReactions.chatId));
            if (!kj.b(updateChatAvailableReactions.chatId, chat, updateChatAvailableReactions)) {
                chat.availableReactions = updateChatAvailableReactions.availableReactions;
                this.f28071i0.K0(updateChatAvailableReactions);
            }
        }
    }

    public final void se(TdApi.UpdateDeleteMessages updateDeleteMessages) {
        if (!updateDeleteMessages.fromCache) {
            Arrays.sort(updateDeleteMessages.messageIds);
            this.f28071i0.v2(updateDeleteMessages);
            this.V.b1().v(this, updateDeleteMessages);
            this.f28068h0.c0(updateDeleteMessages.chatId, updateDeleteMessages.messageIds);
        }
    }

    public boolean t2(TdApi.Message message) {
        return message != null && message.sendingState == null && ob.a.p(message.chatId) != 0 && !t2.A3(message);
    }

    public int t3(long j10) {
        return u3(W2(j10));
    }

    public void t4() {
        synchronized (this.Z) {
            hb();
        }
    }

    public void t5(long j10, long j11, long j12, boolean z10, boolean z11) {
        v4().o(new TdApi.ForwardMessages(j10, j11, new long[]{j12}, new TdApi.MessageSendOptions(z10, z11, false, null), false, false, false), Z9());
    }

    public boolean t6(long j10) {
        return u6(W2(j10));
    }

    public boolean t7(long j10) {
        TdApi.Supergroup c42 = c4(j10);
        return c42 != null && !c42.isChannel;
    }

    public void ta(TdApi.UpdateMessageSendAcknowledged updateMessageSendAcknowledged) {
        la(updateMessageSendAcknowledged.chatId, updateMessageSendAcknowledged.messageId);
        this.f28071i0.n2(updateMessageSendAcknowledged);
    }

    public void tb(long j10, long j11, String str) {
        v4().o(new TdApi.SendBotStartMessage(j10, j11, str), Z9());
    }

    public gc tc() {
        return this.f28086n0;
    }

    public final void td(TdApi.UpdateChatDefaultDisableNotification updateChatDefaultDisableNotification) {
        synchronized (this.f28045a0) {
            TdApi.Chat chat = this.f28049b0.get(Long.valueOf(updateChatDefaultDisableNotification.chatId));
            if (!kj.b(updateChatDefaultDisableNotification.chatId, chat, updateChatDefaultDisableNotification)) {
                chat.defaultDisableNotification = updateChatDefaultDisableNotification.defaultDisableNotification;
                this.f28071i0.P0(updateChatDefaultDisableNotification);
            }
        }
    }

    public final void te(TdApi.UpdateNewChat updateNewChat) {
        ArrayList<e8> arrayList;
        TdApi.ChatPosition[] chatPositionArr;
        synchronized (this.f28045a0) {
            this.f28049b0.put(Long.valueOf(updateNewChat.chat.f19908id), updateNewChat.chat);
            this.f28062f0.add(Long.valueOf(updateNewChat.chat.f19908id));
            if (updateNewChat.chat.type.getConstructor() == -1472570774) {
                TdApi.ChatType chatType = updateNewChat.chat.type;
                long j10 = ((TdApi.ChatTypeSupergroup) chatType).supergroupId;
                if (((TdApi.ChatTypeSupergroup) chatType).isChannel) {
                    this.f28098r0.add(Long.valueOf(j10));
                } else {
                    this.f28098r0.remove(Long.valueOf(j10));
                }
            }
            TdApi.ChatPosition[] chatPositionArr2 = updateNewChat.chat.positions;
            if (chatPositionArr2 == null || chatPositionArr2.length <= 0) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(updateNewChat.chat.positions.length);
                for (TdApi.ChatPosition chatPosition : updateNewChat.chat.positions) {
                    if (chatPosition.order != 0) {
                        arrayList.add(p3(chatPosition.list));
                    }
                }
            }
        }
        if (arrayList != null) {
            for (e8 e8Var : arrayList) {
                e8Var.H(updateNewChat.chat);
            }
        }
    }

    public boolean u2(TdApi.Chat chat) {
        return B2(chat, false);
    }

    public int u3(TdApi.Chat chat) {
        if (chat == null) {
            return 0;
        }
        TdApi.ChatNotificationSettings chatNotificationSettings = chat.notificationSettings;
        if (!chatNotificationSettings.useDefaultMuteFor) {
            return chatNotificationSettings.muteFor;
        }
        TdApi.ScopeNotificationSettings L0 = this.f28092p0.L0(chat);
        if (L0 != null) {
            return L0.muteFor;
        }
        return 0;
    }

    public l u5(String str, TdApi.FileType fileType, boolean z10, int i10, long j10) {
        final CountDownLatch countDownLatch = new CountDownLatch(2);
        final l lVar = new l();
        lVar.f28147a = countDownLatch;
        synchronized (this.O1) {
            this.O1.put(str, lVar);
        }
        Client v42 = v4();
        TdApi.InputFileGenerated inputFileGenerated = new TdApi.InputFileGenerated(null, str, 0);
        if (z10) {
            fileType = new TdApi.FileTypeSecret();
        }
        v42.o(new TdApi.UploadFile(inputFileGenerated, fileType, i10), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                o6.e8(o6.l.this, countDownLatch, object);
            }
        });
        try {
            if (j10 > 0) {
                countDownLatch.await(j10, TimeUnit.MILLISECONDS);
            } else {
                countDownLatch.await();
            }
        } catch (InterruptedException e10) {
            Log.i(e10);
        }
        synchronized (this.O1) {
            if (lVar.f28151e) {
                this.P1.remove(Long.valueOf(lVar.f28150d));
            } else {
                this.O1.remove(str);
            }
        }
        if (lVar.f28148b == null || lVar.f28149c == null) {
            return null;
        }
        return lVar;
    }

    public boolean u6(TdApi.Chat chat) {
        return chat != null && !ib.i.i(chat.clientData);
    }

    public boolean u7(TdApi.Chat chat) {
        return chat != null && chat.type.getConstructor() == -1472570774 && !((TdApi.ChatTypeSupergroup) chat.type).isChannel;
    }

    public final void ua() {
        this.f28100r2.d();
    }

    public void ub(TdApi.Update update, boolean z10) {
        x4().y(update, z10);
    }

    public final boolean uc() {
        if (this.f28117y1 || T1() == 0) {
            return false;
        }
        TdApi.AuthorizationState authorizationState = this.J1;
        return (authorizationState == null || authorizationState.getConstructor() == 306402531) && !s4() && !A1().L() && A1().H() && this.f28119z1.get() == 0;
    }

    public final void ud(TdApi.UpdateChatMessageSender updateChatMessageSender) {
        synchronized (this.f28045a0) {
            TdApi.Chat chat = this.f28049b0.get(Long.valueOf(updateChatMessageSender.chatId));
            if (!kj.b(updateChatMessageSender.chatId, chat, updateChatMessageSender)) {
                chat.messageSenderId = updateChatMessageSender.messageSenderId;
                this.f28071i0.Q0(updateChatMessageSender);
            }
        }
    }

    public final void ue(TdApi.UpdateNewMessage updateNewMessage, boolean z10) {
        TdApi.Message message = updateNewMessage.message;
        if ((message.sendingState instanceof TdApi.MessageSendingStatePending) && message.content.getConstructor() != 1810060209) {
            TdApi.Message message2 = updateNewMessage.message;
            J1(message2.chatId, message2.f19946id, true);
            if (z10) {
                return;
            }
        }
        this.f28071i0.z2(updateNewMessage);
        this.f28092p0.I1(updateNewMessage);
        this.V.b1().w(this, updateNewMessage);
        if (!this.f28115x1 && updateNewMessage.message.chatId == ob.a.c(777000L)) {
            this.f28071i0.J(true);
        }
    }

    public boolean v2(long j10) {
        TdApi.ChatMemberStatus O3 = O3(j10);
        if (O3 == null) {
            return false;
        }
        int constructor = O3.getConstructor();
        return constructor == -160019714 || (constructor == -70024163 && ((TdApi.ChatMemberStatusAdministrator) O3).rights.canDeleteMessages);
    }

    public boolean v3(long j10) {
        return w3(W2(j10));
    }

    public Client v4() {
        return x4().f28145b;
    }

    public void v5(final List<TdApi.Message> list, final boolean z10, f fVar, final kb.j<f> jVar) {
        final AtomicInteger atomicInteger;
        final AtomicBoolean atomicBoolean;
        boolean z11 = false;
        final TdApi.Message message = list.get(0);
        final TdApi.Message message2 = list.get(list.size() - 1);
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final AtomicBoolean atomicBoolean2 = new AtomicBoolean(fVar != null && !fVar.f28134c);
        if (fVar != null && !fVar.f28133b) {
            z11 = true;
        }
        final AtomicBoolean atomicBoolean3 = new AtomicBoolean(z11);
        int i10 = !atomicBoolean2.get();
        if (!atomicBoolean3.get()) {
            i10++;
        }
        if (i10 != 0) {
            AtomicInteger atomicInteger2 = new AtomicInteger(i10);
            final Runnable z3Var = new Runnable() {
                @Override
                public final void run() {
                    o6.f8(arrayList, arrayList2, list, atomicBoolean3, atomicBoolean2, jVar);
                }
            };
            int size = (10 - list.size()) + 1;
            if (!atomicBoolean2.get()) {
                atomicInteger = atomicInteger2;
                atomicBoolean = atomicBoolean3;
                v4().o(new TdApi.GetChatHistory(message2.chatId, message2.f19946id, 0, size, z10), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        o6.g8(TdApi.Message.this, atomicBoolean2, arrayList, z10, atomicInteger, z3Var, object);
                    }
                });
            } else {
                atomicInteger = atomicInteger2;
                atomicBoolean = atomicBoolean3;
            }
            if (!atomicBoolean.get()) {
                final AtomicInteger atomicInteger3 = atomicInteger;
                v4().o(new TdApi.GetChatHistory(message.chatId, message.f19946id, -size, size, z10), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        o6.h8(TdApi.Message.this, atomicBoolean, arrayList2, z10, atomicInteger3, z3Var, object);
                    }
                });
            }
        } else if (jVar != null) {
            jVar.a(fVar);
        }
    }

    public boolean v6(long j10, int i10) {
        return Y5(W2(j10), i10) != null;
    }

    public boolean v7(TdApi.Chat chat) {
        TdApi.User f42 = f4(chat);
        return f42 != null && f42.isSupport;
    }

    public final void va() {
        this.f28103s2.d();
    }

    public void vb(long j10, long j11, long j12, TdApi.MessageSendOptions messageSendOptions, long j13, String str) {
        v4().o(new TdApi.SendInlineQueryResultMessage(j10, j11, j12, messageSendOptions, j13, str, false), Z9());
    }

    public boolean vc(TdApi.FormattedText formattedText) {
        return B5(formattedText) != null;
    }

    public final void vd(TdApi.UpdateChatDraftMessage updateChatDraftMessage) {
        synchronized (this.f28045a0) {
            TdApi.Chat chat = this.f28049b0.get(Long.valueOf(updateChatDraftMessage.chatId));
            if (!kj.b(updateChatDraftMessage.chatId, chat, updateChatDraftMessage)) {
                chat.draftMessage = updateChatDraftMessage.draftMessage;
                this.f28071i0.S0(updateChatDraftMessage, Sb(chat, updateChatDraftMessage.positions));
            }
        }
    }

    public final void ve(Client client) {
        int i10 = Build.VERSION.SDK_INT >= 30 ? 7 : 10;
        client.o(new TdApi.SetOption("notification_group_count_max", new TdApi.OptionValueInteger(25L)), this.M);
        client.o(new TdApi.SetOption("notification_group_size_max", new TdApi.OptionValueInteger(i10)), this.M);
    }

    public boolean w2(long j10) {
        return b7(j10);
    }

    public boolean w3(TdApi.Chat chat) {
        return chat != null && t2.x4(chat.notificationSettings, lb(chat.f19908id));
    }

    public TdApi.Object w4(final TdApi.Function function, long j10) {
        TdApi.Object object;
        if (!D6()) {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final AtomicReference atomicReference = new AtomicReference();
            Y1(new Runnable() {
                @Override
                public final void run() {
                    o6.this.S7(function, atomicReference, countDownLatch);
                }
            });
            try {
                if (j10 > 0) {
                    countDownLatch.await(j10, TimeUnit.MILLISECONDS);
                } else {
                    countDownLatch.await();
                }
            } catch (InterruptedException e10) {
                Log.i(e10);
            }
            synchronized (atomicReference) {
                object = (TdApi.Object) atomicReference.get();
            }
            return object;
        }
        throw new IllegalStateException("Cannot call from TDLib thread: " + function);
    }

    public void w5(TdApi.Message message, boolean z10, f fVar, kb.j<f> jVar) {
        if (message.mediaAlbumId == 0) {
            if (jVar != null) {
                jVar.a(null);
            }
        } else if (fVar != null) {
            v5(fVar.f28132a, z10, fVar, jVar);
        } else {
            ArrayList arrayList = new ArrayList(10);
            arrayList.add(message);
            v5(arrayList, z10, fVar, jVar);
        }
    }

    public boolean w6(TdApi.ChatList chatList) {
        return A5(chatList).f28794b > 0;
    }

    public boolean w7(long j10) {
        synchronized (this.f28045a0) {
            long d10 = this.f28101s0.d(j10);
            if (d10 > SystemClock.elapsedRealtime()) {
                return true;
            }
            if (d10 != 0) {
                this.f28101s0.c(j10);
            }
            return false;
        }
    }

    public final void wa() {
        Log.i("Performing account startup for accountId:%d, isAfterRestart:%b", Integer.valueOf(this.W), Boolean.valueOf(this.L1));
        O9().S(this.L1);
        this.L1 = true;
    }

    public void wb(long j10, long j11, long j12, TdApi.MessageSendOptions messageSendOptions, TdApi.InputMessageContent inputMessageContent, final kb.j<TdApi.Message> jVar) {
        Client.g gVar;
        Client v42 = v4();
        TdApi.SendMessage sendMessage = new TdApi.SendMessage(j10, j11, j12, messageSendOptions, null, inputMessageContent);
        if (jVar != null) {
            gVar = new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    o6.this.g9(jVar, object);
                }
            };
        } else {
            gVar = Z9();
        }
        v42.o(sendMessage, gVar);
    }

    public boolean wc(TdApi.Chat chat, int i10, int i11, int i12, int i13) {
        CharSequence Z5 = Z5(chat, i10, i11, i12, i13);
        if (Z5 == null) {
            return false;
        }
        j0.z0(Z5, 0);
        return true;
    }

    public final void wd(TdApi.UpdateChatFilters updateChatFilters) {
        synchronized (this.f28045a0) {
            this.f28070h2 = updateChatFilters.chatFilters;
        }
        this.f28071i0.T0(updateChatFilters);
    }

    public final void we(TdApi.UpdateChatNotificationSettings updateChatNotificationSettings) {
        long j10 = updateChatNotificationSettings.chatId;
        synchronized (this.f28045a0) {
            TdApi.Chat chat = this.f28049b0.get(Long.valueOf(j10));
            if (!kj.b(j10, chat, updateChatNotificationSettings)) {
                TdApi.ChatNotificationSettings chatNotificationSettings = chat.notificationSettings;
                chat.notificationSettings = updateChatNotificationSettings.notificationSettings;
                this.f28071i0.E2(updateChatNotificationSettings);
                this.f28092p0.M1(updateChatNotificationSettings, j10, chatNotificationSettings);
            }
        }
    }

    public boolean x2(long j10) {
        return !ob.a.l(j10);
    }

    public boolean x3(long j10) {
        return y3(W2(j10));
    }

    public final k x4() {
        synchronized (this.Z) {
            k y42 = y4();
            if (y42 != null) {
                return y42;
            }
            CountDownLatch countDownLatch = this.X.R;
            if (!he.i.c2().d0()) {
                v0.o(countDownLatch);
            } else if (!v0.p(countDownLatch, 10L, TimeUnit.SECONDS)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Long close detected. authState: ");
                sb2.append(this.J1);
                sb2.append(", closeState: ");
                k kVar = this.X;
                sb2.append(kVar != null ? kVar.S : -1);
                RuntimeException runtimeException = new RuntimeException(sb2.toString());
                Tracer.h(runtimeException);
                throw runtimeException;
            }
            return x4();
        }
    }

    public void x5(TdApi.ChatList chatList, kb.j<TdApi.Chat> jVar, kb.i iVar, boolean z10) {
        o3(chatList).w(jVar, iVar);
    }

    public boolean x6(long j10) {
        return j10 != 0 && y6(W2(j10));
    }

    public boolean x7(String str) {
        if (ib.i.i(str)) {
            return false;
        }
        if (str.startsWith("tg://")) {
            return true;
        }
        try {
            if (!str.startsWith("http://") && !str.startsWith("https://")) {
                str = "http://" + str;
            }
            return a7(Uri.parse(str).getHost(), false);
        } catch (Throwable unused) {
            return false;
        }
    }

    public void xa(int i10) {
        synchronized (this.S1) {
            int i11 = this.R1.i();
            for (int i12 = 0; i12 < i11; i12++) {
                if (i10 >= this.R1.j(i12)) {
                    long f10 = this.R1.f(i12);
                    TdApi.Chat W2 = W2(f10);
                    if (y6(W2) && (ob.a.j(f10) || hd().l8(W2))) {
                        zb(f10);
                    }
                }
            }
        }
    }

    public void xb(long j10, long j11, long j12, boolean z10, boolean z11, TdApi.InputMessageContent inputMessageContent) {
        yb(j10, j11, j12, z10, z11, inputMessageContent, null);
    }

    public void xc() {
        int v02;
        if (F4().x2() == this.W && (v02 = F4().v0(this.W)) != -1) {
            F4().d0(v02, 0);
        }
        final boolean q12 = F4().q1();
        final String q22 = q12 ? t2.q2(A1().q(), A1().s()) : null;
        H6(1);
        v4().o(new TdApi.LogOut(), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                o6.this.t9(q12, q22, object);
            }
        });
    }

    public final void xd(TdApi.UpdateChatHasProtectedContent updateChatHasProtectedContent) {
        synchronized (this.f28045a0) {
            TdApi.Chat chat = this.f28049b0.get(Long.valueOf(updateChatHasProtectedContent.chatId));
            if (!kj.b(updateChatHasProtectedContent.chatId, chat, updateChatHasProtectedContent)) {
                chat.hasProtectedContent = updateChatHasProtectedContent.hasProtectedContent;
                this.f28071i0.U0(updateChatHasProtectedContent);
            }
        }
    }

    public final void xe(TdApi.UpdateScopeNotificationSettings updateScopeNotificationSettings) {
        this.f28071i0.F2(updateScopeNotificationSettings);
        this.f28092p0.N1(updateScopeNotificationSettings);
    }

    public boolean y2() {
        boolean z10;
        int[] iArr;
        synchronized (this.f28045a0) {
            if (this.f28108u1 < 5 && ((iArr = this.f28111v1) == null || iArr.length <= 0)) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    public boolean y3(TdApi.Chat chat) {
        if (chat == null) {
            return true;
        }
        TdApi.ChatNotificationSettings chatNotificationSettings = chat.notificationSettings;
        return !chatNotificationSettings.useDefaultMuteFor ? chatNotificationSettings.muteFor == 0 : kb(this.f28092p0.k2(chat)) == 0;
    }

    public final k y4() {
        if (this.X == null) {
            this.X = ja();
            hd().postDelayed(new Runnable() {
                @Override
                public final void run() {
                    o6.this.t4();
                }
            }, 350L);
        }
        if (!this.f28117y1) {
            return this.X;
        }
        if (Thread.currentThread() != this.X.f28145b.g()) {
            return null;
        }
        throw new IllegalStateException();
    }

    public String y5() {
        return this.Z0;
    }

    public boolean y6(TdApi.Chat chat) {
        return Y5(chat, R.id.right_sendMessages) == null;
    }

    public boolean y7() {
        TdApi.AuthorizationState authorizationState = this.J1;
        if (authorizationState != null) {
            switch (authorizationState.getConstructor()) {
                case TdApi.AuthorizationStateReady.CONSTRUCTOR:
                case TdApi.AuthorizationStateClosing.CONSTRUCTOR:
                case TdApi.AuthorizationStateWaitEncryptionKey.CONSTRUCTOR:
                case TdApi.AuthorizationStateWaitTdlibParameters.CONSTRUCTOR:
                case TdApi.AuthorizationStateClosed.CONSTRUCTOR:
                    break;
                case TdApi.AuthorizationStateWaitCode.CONSTRUCTOR:
                case TdApi.AuthorizationStateLoggingOut.CONSTRUCTOR:
                case TdApi.AuthorizationStateWaitPassword.CONSTRUCTOR:
                case TdApi.AuthorizationStateWaitPhoneNumber.CONSTRUCTOR:
                case TdApi.AuthorizationStateWaitRegistration.CONSTRUCTOR:
                    return true;
                default:
                    throw new AssertionError(this.J1);
            }
        }
        return false;
    }

    public final void ya(TdApi.UpdateActiveNotifications updateActiveNotifications) {
        b.a.a(0L, this.W, "Received updateActiveNotifications, ignore: %b", Boolean.valueOf(this.F1));
        if (!this.F1 || updateActiveNotifications.groups.length <= 0) {
            this.f28064f2 = false;
        } else {
            updateActiveNotifications = new TdApi.UpdateActiveNotifications(new TdApi.NotificationGroup[0]);
            this.f28064f2 = true;
        }
        this.f28061e2 = SystemClock.uptimeMillis();
        this.f28092p0.C1(updateActiveNotifications, new Runnable() {
            @Override
            public final void run() {
                o6.this.V4();
            }
        });
    }

    public void yb(long j10, long j11, long j12, boolean z10, boolean z11, TdApi.InputMessageContent inputMessageContent, kb.j<TdApi.Message> jVar) {
        wb(j10, j11, j12, new TdApi.MessageSendOptions(z10, z11, false, null), inputMessageContent, jVar);
    }

    public Client.g yc() {
        return this.Q;
    }

    public final void yd(TdApi.UpdateChatHasScheduledMessages updateChatHasScheduledMessages) {
        synchronized (this.f28045a0) {
            TdApi.Chat chat = this.f28049b0.get(Long.valueOf(updateChatHasScheduledMessages.chatId));
            if (!kj.b(updateChatHasScheduledMessages.chatId, chat, updateChatHasScheduledMessages)) {
                chat.hasScheduledMessages = updateChatHasScheduledMessages.hasScheduledMessages;
                this.f28071i0.W0(updateChatHasScheduledMessages);
            }
        }
    }

    public final void ye(zd.o6.k r18, org.drinkless.td.libcore.telegram.TdApi.UpdateOption r19) {
        throw new UnsupportedOperationException("Method not decompiled: zd.o6.ye(zd.o6$k, org.drinkless.td.libcore.telegram.TdApi$UpdateOption):void");
    }

    public boolean z2() {
        return this.Q0;
    }

    public int z3(long j10) {
        Integer num;
        if (j10 == 0) {
            return 0;
        }
        synchronized (this.f28045a0) {
            num = this.f28065g0.get(Long.valueOf(j10));
        }
        if (num == null || num.intValue() <= 1) {
            return 0;
        }
        return num.intValue();
    }

    public TdApi.TdlibParameters z4() {
        return this.f28052c;
    }

    public int z5(int i10) {
        return ae.j.M(i10, tc().M());
    }

    public boolean z6() {
        synchronized (this.f28045a0) {
            for (TdApi.SuggestedAction suggestedAction : this.f28079k2) {
                if (q7(suggestedAction)) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean z7(TdApi.MessageSender messageSender) {
        return h4(ob.e.S0(messageSender)) != 0;
    }

    public final void za(TdApi.UpdateHavePendingNotifications updateHavePendingNotifications) {
        boolean z10 = updateHavePendingNotifications.haveDelayedNotifications || updateHavePendingNotifications.haveUnreceivedNotifications;
        if (this.f28055c2 != z10) {
            this.f28055c2 = z10;
            s4();
        }
        if (!updateHavePendingNotifications.haveUnreceivedNotifications) {
            this.f28106t2.e(true);
        }
        G6();
        this.f28092p0.b2(z10 ? null : new Runnable() {
            @Override
            public final void run() {
                o6.this.va();
            }
        });
    }

    public void zb(long j10) {
        v4().o(new TdApi.SendChatScreenshotTakenNotification(j10), Z9());
    }

    public Client.g zc(final Runnable runnable) {
        if (runnable != null) {
            return new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    o6.this.u9(runnable, object);
                }
            };
        }
        return yc();
    }

    public final void zd(TdApi.UpdateChatIsBlocked updateChatIsBlocked) {
        synchronized (this.f28045a0) {
            TdApi.Chat chat = this.f28049b0.get(Long.valueOf(updateChatIsBlocked.chatId));
            if (!kj.b(updateChatIsBlocked.chatId, chat, updateChatIsBlocked)) {
                chat.isBlocked = updateChatIsBlocked.isBlocked;
                this.f28071i0.Z0(updateChatIsBlocked);
            }
        }
    }

    public static class f {
        public final List<TdApi.Message> f28132a;
        public final boolean f28133b;
        public final boolean f28134c;

        public f(List<TdApi.Message> list, boolean z10, boolean z11) {
            this.f28132a = list;
            this.f28133b = z10;
            this.f28134c = z11;
        }

        public boolean a() {
            return this.f28133b || this.f28134c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof f)) {
                return false;
            }
            List<TdApi.Message> list = ((f) obj).f28132a;
            if (list.size() != this.f28132a.size()) {
                return false;
            }
            for (int i10 = 0; i10 < list.size(); i10++) {
                TdApi.Message message = list.get(i10);
                TdApi.Message message2 = this.f28132a.get(i10);
                if (!(message.chatId == message2.chatId && message.f19946id == message2.f19946id && message.mediaAlbumId == message2.mediaAlbumId)) {
                    return false;
                }
            }
            return true;
        }

        public f(List<TdApi.Message> list) {
            this(list, false, false);
        }
    }
}
