package p350yd;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import be.C1363c0;
import be.C1379j0;
import gd.AbstractC4761s4;
import gd.C4587b;
import gd.C4779t2;
import ge.C4862d;
import ge.C4868i;
import id.C5365w;
import ie.C5386e;
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
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.drinkmore.Tracer;
import org.thunderdog.challegram.C7903b;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.loader.ImageLoader;
import org.thunderdog.challegram.loader.gif.GifBridge;
import org.thunderdog.challegram.sync.SyncHelper;
import p082fd.C4403w;
import p108hb.C5062b;
import p108hb.C5063c;
import p108hb.C5068g;
import p108hb.C5069h;
import p108hb.C5070i;
import p110hd.C5078d;
import p111he.AbstractC5098a1;
import p111he.AbstractC5107c1;
import p111he.AbstractC5143t;
import p124ib.C5324g;
import p124ib.C5325h;
import p126j$.util.concurrent.ConcurrentHashMap;
import p139jb.AbstractC5912d;
import p139jb.AbstractC5913e;
import p139jb.AbstractC5914f;
import p139jb.AbstractC5917i;
import p139jb.AbstractC5918j;
import p139jb.AbstractC5919k;
import p139jb.AbstractRunnableC5910b;
import p143k0.C6035e;
import p143k0.C6038h;
import p156kd.C6246h;
import p181mb.C6814e;
import p193nb.C7316a;
import p193nb.C7317b;
import p193nb.C7318c;
import p193nb.C7319d;
import p193nb.C7321e;
import p193nb.C7322f;
import p350yd.C10930q6;
import p364zd.C11524j;
import td.AbstractC9323v4;
import vc.C9903a;

public class C10930q6 implements AbstractC11073vb, C4868i.AbstractC4886q {
    public long f34964A1;
    public long f34966B1;
    public boolean f34968C1;
    public boolean f34970D1;
    public boolean f34972E1;
    public boolean f34974F1;
    public boolean f34975G0;
    public int f34976G1;
    public boolean f34977H0;
    public AbstractC5917i f34978H1;
    public boolean f34979I0;
    public boolean f34980I1;
    public boolean f34981J0;
    public TdApi.AuthorizationState f34982J1;
    public String f34983K0;
    public boolean f34984K1;
    public String[] f34985L0;
    public boolean f34986L1;
    public TdApi.Reaction[] f34988M0;
    public String f34989M1;
    public String f34992N1;
    public boolean f34994O0;
    public boolean f34997P0;
    public boolean f35000Q0;
    public boolean f35003R0;
    public boolean f35006S0;
    public final Comparator<TdApi.User> f35008T;
    public boolean f35009T0;
    public final Comparator<AbstractC5098a1> f35011U;
    public C10945o[] f35012U0;
    public final C10536ab f35014V;
    public long f35015V0;
    public Map<String, Queue<Runnable>> f35016V1;
    public final int f35017W;
    public long f35018W0;
    public C10946p f35019W1;
    public C10941k f35020X;
    public String f35022X1;
    public boolean f35024Y0;
    public String f35025Y1;
    public final Object f35026Z;
    public TdApi.NetworkType f35028Z1;
    public boolean f35032a2;
    public HandlerC10770jj f35033b;
    public boolean f35036b2;
    public String f35039c1;
    public boolean f35040c2;
    public String f35042d1;
    public boolean f35043d2;
    public TdApi.LanguagePackInfo f35045e1;
    public long f35046e2;
    public String f35048f1;
    public boolean f35049f2;
    public final C11059v7 f35053h0;
    public String f35054h1;
    public TdApi.ChatFilterInfo[] f35055h2;
    public final C11039u9 f35056i0;
    public String f35057i1;
    public final C10756j9 f35059j0;
    public boolean f35061j2;
    public final C10802kc f35062k0;
    public final C11134y8 f35065l0;
    public final C11115xb f35068m0;
    public TdApi.ProfilePhoto f35070m2;
    public final C10733ic f35071n0;
    public boolean f35073n2;
    public final C11004sj f35074o0;
    public boolean f35076o2;
    public final C10827lb f35077p0;
    public final C5365w f35080q0;
    public int f35093u1;
    public boolean f35095v0;
    public int[] f35096v1;
    public int f35098w1;
    public boolean f35100x1;
    public boolean f35102y1;
    public static final long f34958v2 = C7316a.m17059b(1112283549);
    public static final long f34959w2 = C7316a.m17059b(1336679475);
    public static final long f34960x2 = C7316a.m17059b(1136101327);
    public static final long f34961y2 = C7316a.m17059b(1247387696);
    public static final long f34962z2 = C7316a.m17059b(1140222267);
    public static int f34956A2 = -1;
    public static int f34957B2 = -2;
    public final Object f35029a = new Object();
    public final Client.AbstractC7865g f34987M = C10926q2.f34951a;
    public final Client.AbstractC7865g f34990N = new Client.AbstractC7865g() {
        @Override
        public final void mo255t2(TdApi.Object object) {
            C10930q6.this.m2186w8(object);
        }
    };
    public final Client.AbstractC7865g f34993O = new Client.AbstractC7865g() {
        @Override
        public final void mo255t2(TdApi.Object object) {
            C10930q6.this.m2894D8(object);
        }
    };
    public final Client.AbstractC7865g f34996P = C10905p2.f34902a;
    public final Client.AbstractC7865g f34999Q = C11011t2.f35350a;
    public final Client.AbstractC7865g f35002R = new Client.AbstractC7865g() {
        @Override
        public final void mo255t2(TdApi.Object object) {
            C10930q6.this.m2846G8(object);
        }
    };
    public final Client.AbstractC7865g f35005S = C10966r2.f35228a;
    public int f35023Y = -1;
    public final Object f35030a0 = new Object();
    public final HashMap<Long, TdApi.Chat> f35034b0 = new HashMap<>();
    public final HashMap<String, C10684g8> f35038c0 = new HashMap<>();
    public final C10947q f35041d0 = new C10947q(0, "AnimatedTgxEmojies", false);
    public final C10947q f35044e0 = new C10947q(2, "BetterDice", true);
    public final HashSet<Long> f35047f0 = new HashSet<>();
    public final HashMap<Long, Integer> f35050g0 = new HashMap<>();
    public final HashSet<Long> f35083r0 = new HashSet<>();
    public final C5325h f35086s0 = new C5325h();
    public long f35089t0 = 0;
    public int f35092u0 = 100000;
    public int f35097w0 = 10000;
    public long f35099x0 = 1000;
    public long f35101y0 = 64;
    public long f35103z0 = 12582912;
    public long f34963A0 = 384;
    public int f34965B0 = 100;
    public int f34967C0 = 200;
    public int f34969D0 = 5;
    public int f34971E0 = 100;
    public double f34973F0 = 0.75d;
    public boolean f34991N0 = true;
    public int f35021X0 = -1;
    public String f35027Z0 = "gif";
    public String f35031a1 = "foursquare";
    public String f35035b1 = "pic";
    public long f35051g1 = SystemClock.uptimeMillis();
    public long f35060j1 = 30000;
    public long f35063k1 = 10000;
    public long f35066l1 = 1271266957;
    public long f35069m1 = 777000;
    public final Map<String, C10562b9> f35072n1 = new HashMap();
    public final C11164z6 f35075o1 = new C11164z6();
    public final C11164z6 f35078p1 = new C11164z6();
    public int f35081q1 = Log.TAG_CAMERA;
    public int f35084r1 = 4000;
    public int f35087s1 = 200;
    public boolean f35090t1 = false;
    public final AtomicInteger f35104z1 = new AtomicInteger(0);
    public final HashMap<String, C10942l> f34995O1 = new HashMap<>();
    public final HashMap<Long, C10942l> f34998P1 = new HashMap<>();
    public final C6035e<ArrayList<AbstractC9323v4<?>>> f35001Q1 = new C6035e<>(8);
    public final C5324g f35004R1 = new C5324g();
    public final Object f35007S1 = new Object();
    public final HashMap<String, TdApi.MessageContent> f35010T1 = new HashMap<>();
    public final HashMap<String, TdApi.FormattedText> f35013U1 = new HashMap<>();
    public final Set<String> f35052g2 = new HashSet();
    public final C6038h<TdApi.Call> f35058i2 = new C6038h<>();
    public final List<TdApi.SuggestedAction> f35064k2 = new ArrayList();
    public final Map<String, TdApi.ChatTheme> f35067l2 = new HashMap();
    public final C6814e f35079p2 = new C6814e(new AbstractC5914f() {
        @Override
        public final boolean get() {
            boolean x8;
            x8 = C10930q6.this.m2170x8();
            return x8;
        }
    }).m18905c(new Runnable() {
        @Override
        public final void run() {
            C10930q6.this.m2328na();
        }
    }, new Runnable() {
        @Override
        public final void run() {
            C10930q6.this.m2312oa();
        }
    });
    public final C6814e f35082q2 = new C6814e(new AbstractC5914f() {
        @Override
        public final boolean get() {
            boolean y8;
            y8 = C10930q6.this.m2154y8();
            return y8;
        }
    }).m18905c(new Runnable() {
        @Override
        public final void run() {
            C10930q6.this.m2328na();
        }
    }, new Runnable() {
        @Override
        public final void run() {
            C10930q6.this.m2312oa();
        }
    });
    public final C6814e f35085r2 = new C6814e(new AbstractC5914f() {
        @Override
        public final boolean get() {
            boolean z8;
            z8 = C10930q6.this.m2138z8();
            return z8;
        }
    }).m18905c(new Runnable() {
        @Override
        public final void run() {
            C10930q6.this.m2328na();
        }
    }, new Runnable() {
        @Override
        public final void run() {
            C10930q6.this.m2312oa();
        }
    });
    public final C6814e f35088s2 = new C6814e(new AbstractC5914f() {
        @Override
        public final boolean get() {
            boolean A8;
            A8 = C10930q6.this.m2942A8();
            return A8;
        }
    }).m18905c(new Runnable() {
        @Override
        public final void run() {
            C10930q6.this.m2328na();
        }
    }, new Runnable() {
        @Override
        public final void run() {
            C10930q6.this.m2312oa();
        }
    });
    public final C6814e f35091t2 = new C6814e(C10751j4.f34392a);
    public final C6814e f35094u2 = new C6814e(new AbstractC5914f() {
        @Override
        public final boolean get() {
            boolean C8;
            C8 = C10930q6.this.m2910C8();
            return C8;
        }
    });
    public final TdApi.TdlibParameters f35037c = new TdApi.TdlibParameters(false, null, null, true, true, true, true, 21724, "3e0cb5efcd52300aec5994fdfc5bdc16", null, null, null, "0.24.6.1506-arm64-v8a", false, false);

    public class C10931a extends AbstractRunnableC5910b {
        public final AtomicBoolean f35105M;
        public final TdApi.Message f35106N;
        public final boolean f35107O;
        public final AbstractC5918j f35108P;

        public C10931a(AtomicBoolean atomicBoolean, TdApi.Message message, boolean z, AbstractC5918j jVar) {
            this.f35105M = atomicBoolean;
            this.f35106N = message;
            this.f35107O = z;
            this.f35108P = jVar;
        }

        @Override
        public void mo1364b() {
            boolean z;
            String str;
            synchronized (this.f35105M) {
                if (!this.f35105M.get()) {
                    String f4 = C10930q6.this.m2462f4(this.f35106N.chatId);
                    if (!C5070i.m24061i(f4)) {
                        z = false;
                        str = C10930q6.this.m2714Oc(f4, C7319d.m17021i(this.f35106N.f25406id));
                        if (!this.f35107O && this.f35106N.mediaAlbumId != 0) {
                            str = str + "?single";
                        }
                    } else {
                        long p = C7316a.m17045p(this.f35106N.chatId);
                        str = p != 0 ? C10930q6.this.m2698Pc(p, C7319d.m17021i(this.f35106N.f25406id)) : null;
                        z = true;
                    }
                    if (!C5070i.m24061i(str) && !this.f35105M.getAndSet(true)) {
                        this.f35108P.mo1330a(new C10943m(str, z));
                    }
                }
            }
        }
    }

    public class C10932b implements Client.AbstractC7865g {
        public final Client.AbstractC7865g f35110a;
        public final long f35111b;

        public C10932b(Client.AbstractC7865g gVar, long j) {
            this.f35110a = gVar;
            this.f35111b = j;
        }

        @Override
        public void mo255t2(TdApi.Object object) {
            TdApi.ChatInviteLink chatInviteLink;
            switch (object.getConstructor()) {
                case TdApi.Error.CONSTRUCTOR:
                case TdApi.ChatInviteLink.CONSTRUCTOR:
                    this.f35110a.mo255t2(object);
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
                this.f35110a.mo255t2(chatInviteLink);
            } else {
                C10930q6.this.m2270r4().m14783o(new TdApi.ReplacePrimaryChatInviteLink(this.f35111b), this);
            }
        }
    }

    public class C10933c implements Client.AbstractC7865g {
        public final TdApi.ChatMemberStatus f35113M;
        public final AtomicReference f35114N;
        public final AtomicInteger f35115O;
        public final AbstractC10939i f35116P;
        public final AtomicBoolean f35118a;
        public final long f35119b;
        public final TdApi.MessageSender f35120c;

        public C10933c(AtomicBoolean atomicBoolean, long j, TdApi.MessageSender messageSender, TdApi.ChatMemberStatus chatMemberStatus, AtomicReference atomicReference, AtomicInteger atomicInteger, AbstractC10939i iVar) {
            this.f35118a = atomicBoolean;
            this.f35119b = j;
            this.f35120c = messageSender;
            this.f35113M = chatMemberStatus;
            this.f35114N = atomicReference;
            this.f35115O = atomicInteger;
            this.f35116P = iVar;
        }

        @Override
        public void mo255t2(TdApi.Object object) {
            int constructor = object.getConstructor();
            boolean z = false;
            if (constructor == -1679978726) {
                TdApi.Error error = (TdApi.Error) this.f35114N.getAndSet((TdApi.Error) object);
                if (error == null) {
                    C10930q6.this.m2270r4().m14783o(new TdApi.GetChatMember(this.f35119b, this.f35120c), this);
                    return;
                }
                AbstractC10939i iVar = this.f35116P;
                if (iVar != null) {
                    iVar.mo1765a(false, error);
                } else {
                    C1379j0.m37302t0(error);
                }
            } else if (constructor == -722616727) {
                AtomicBoolean atomicBoolean = this.f35118a;
                if (atomicBoolean == null || atomicBoolean.getAndSet(true)) {
                    C10930q6.this.m2270r4().m14783o(new TdApi.GetChatMember(this.f35119b, this.f35120c), this);
                } else {
                    C10930q6.this.m2270r4().m14783o(new TdApi.SetChatMemberStatus(this.f35119b, this.f35120c, this.f35113M), this);
                }
            } else if (constructor == 1829953909) {
                TdApi.ChatMember chatMember = (TdApi.ChatMember) object;
                if (this.f35114N.get() != null || C7321e.m17013D(this.f35113M, chatMember.status) || this.f35115O.incrementAndGet() > 3) {
                    C10930q6.this.m2480e2().m1651e1(this.f35119b, chatMember);
                    if (this.f35116P != null) {
                        TdApi.Error error2 = (TdApi.Error) this.f35114N.get();
                        AbstractC10939i iVar2 = this.f35116P;
                        if (error2 == null) {
                            z = true;
                        }
                        iVar2.mo1765a(z, error2);
                        return;
                    }
                    return;
                }
                C10930q6.this.m2270r4().m14783o(new TdApi.SetAlarm((this.f35115O.get() * 0.5d) + 0.5d), this);
            }
        }
    }

    public class C10934d implements Client.AbstractC7865g {
        public final AtomicInteger f35121M;
        public final AbstractC10939i f35122N;
        public final AtomicReference f35123O;
        public final long f35125a;
        public final TdApi.MessageSender f35126b;
        public final int f35127c;

        public C10934d(long j, TdApi.MessageSender messageSender, int i, AtomicInteger atomicInteger, AbstractC10939i iVar, AtomicReference atomicReference) {
            this.f35125a = j;
            this.f35126b = messageSender;
            this.f35127c = i;
            this.f35121M = atomicInteger;
            this.f35122N = iVar;
            this.f35123O = atomicReference;
        }

        @Override
        public void mo255t2(TdApi.Object object) {
            int constructor = object.getConstructor();
            boolean z = false;
            if (constructor == -1679978726) {
                TdApi.Error error = (TdApi.Error) this.f35123O.getAndSet((TdApi.Error) object);
                if (error == null) {
                    C10930q6.this.m2270r4().m14783o(new TdApi.GetChatMember(this.f35125a, this.f35126b), this);
                    return;
                }
                AbstractC10939i iVar = this.f35122N;
                if (iVar != null) {
                    iVar.mo1765a(false, error);
                } else {
                    C1379j0.m37302t0(error);
                }
            } else if (constructor == -722616727) {
                C10930q6.this.m2270r4().m14783o(new TdApi.GetChatMember(this.f35125a, this.f35126b), this);
            } else if (constructor == 1829953909) {
                TdApi.ChatMember chatMember = (TdApi.ChatMember) object;
                if (chatMember.status.getConstructor() == this.f35127c || this.f35121M.incrementAndGet() > 3) {
                    C10930q6.this.m2480e2().m1651e1(this.f35125a, chatMember);
                    AbstractC10939i iVar2 = this.f35122N;
                    if (iVar2 != null) {
                        if (chatMember.status.getConstructor() == this.f35127c) {
                            z = true;
                        }
                        iVar2.mo1765a(z, (TdApi.Error) this.f35123O.get());
                        return;
                    }
                    return;
                }
                C10930q6.this.m2270r4().m14783o(new TdApi.SetAlarm((this.f35121M.get() * 0.5d) + 0.5d), this);
            }
        }
    }

    public class C10935e implements Client.AbstractC7865g {
        public final TdApi.Function f35128M;
        public final AbstractC5918j f35130a;
        public final List f35131b;
        public final boolean f35132c;

        public C10935e(AbstractC5918j jVar, List list, boolean z, TdApi.Function function) {
            this.f35130a = jVar;
            this.f35131b = list;
            this.f35132c = z;
            this.f35128M = function;
        }

        @Override
        public void mo255t2(TdApi.Object object) {
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                if (this.f35131b.isEmpty()) {
                    C1379j0.m37302t0(object);
                }
                this.f35130a.mo1330a(this.f35131b);
            } else if (constructor == -16498159) {
                TdApi.Message[] messageArr = ((TdApi.Messages) object).messages;
                if (messageArr.length == 0) {
                    this.f35130a.mo1330a(this.f35131b);
                    return;
                }
                Collections.addAll(this.f35131b, messageArr);
                List list = this.f35131b;
                long j = ((TdApi.Message) list.get(list.size() - 1)).f25406id;
                if (this.f35132c) {
                    ((TdApi.SearchChatMessages) this.f35128M).fromMessageId = j;
                } else {
                    ((TdApi.GetChatHistory) this.f35128M).fromMessageId = j;
                }
                C10930q6.this.m2270r4().m14783o(this.f35128M, this);
            }
        }
    }

    public static class C10937g {
        public final TdApi.ChatPosition f35136a;
        public final int f35137b;

        public C10937g(TdApi.ChatPosition chatPosition, int i) {
            this.f35136a = chatPosition;
            this.f35137b = i;
        }

        public boolean m2130a() {
            return C5063c.m24138h(this.f35137b, 1, false) != 0;
        }

        public boolean m2129b() {
            return C5063c.m24144b(this.f35137b, 1);
        }

        public boolean m2128c() {
            return C5063c.m24144b(this.f35137b, 4);
        }

        public boolean m2127d() {
            return C5063c.m24144b(this.f35137b, 2);
        }
    }

    public static class C10938h {
        public final C10684g8 f35138a;
        public final TdApi.Chat f35139b;
        public final C10937g f35140c;

        public C10938h(C10684g8 g8Var, TdApi.Chat chat, C10937g gVar) {
            this.f35138a = g8Var;
            this.f35139b = chat;
            this.f35140c = gVar;
        }
    }

    public interface AbstractC10939i {
        void mo1765a(boolean z, TdApi.Error error);
    }

    public static class C10940j {
        public int f35141a;
        public int f35142b;
        public String f35143c;
        public String f35144d;

        public C10940j(int i, int i2, String str, String str2) {
            this.f35141a = i;
            this.f35142b = i2;
            this.f35143c = str;
            this.f35144d = str2;
        }

        public boolean m2126a() {
            return (this.f35142b & 1) == 0;
        }

        public void m2125b(boolean z) {
            this.f35142b = C5063c.m24138h(this.f35142b, 1, !z);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(0);
            sb2.append('_');
            sb2.append(this.f35141a);
            sb2.append('_');
            sb2.append(this.f35142b);
            sb2.append('_');
            sb2.append(this.f35143c.length());
            sb2.append('_');
            sb2.append(this.f35143c);
            if (!C5070i.m24061i(this.f35144d)) {
                sb2.append('_');
                sb2.append(this.f35144d.length());
                sb2.append('_');
                sb2.append(this.f35144d);
            }
            return sb2.toString();
        }
    }

    public static final class C10941k implements Client.AbstractC7865g, Client.AbstractC7861c {
        public static final AtomicInteger f35145V = new AtomicInteger();
        public final C10691gc f35146M;
        public long f35148O;
        public long f35149P;
        public boolean f35150Q;
        public int f35152S;
        public Runnable f35154U;
        public final C10930q6 f35155a;
        public final Client f35156b;
        public final C10691gc f35157c;
        public boolean f35147N = true;
        public final CountDownLatch f35151R = new CountDownLatch(1);
        public final AtomicBoolean f35153T = new AtomicBoolean(false);

        public C10941k(C10930q6 q6Var) {
            Log.m14721i((int) Log.TAG_ACCOUNTS, "Creating client #%d", Integer.valueOf(f35145V.incrementAndGet()));
            this.f35155a = q6Var;
            Client d = Client.m14794d(this, this, this, q6Var.f35100x1);
            this.f35156b = d;
            q6Var.m2196ve(d);
            if (q6Var.f35032a2) {
                d.m14783o(new TdApi.SetOption("online", new TdApi.OptionValueBoolean(true)), q6Var.f34987M);
            }
            q6Var.f35014V.m4719a2(q6Var, d);
            this.f35157c = new C10691gc(q6Var, "Y2xvdWRfdGd4X2FuZHJvaWRfcmVzb3Vy");
            this.f35146M = new C10691gc(q6Var, "tgx_log");
            if (!q6Var.f35014V.m4680k1()) {
                m2110m();
            }
        }

        public void m2109n(StackTraceElement[] stackTraceElementArr, TdApi.Object object) {
            if (object.getConstructor() == -1679978726) {
                Tracer.m14771i(this.f35155a.m2188w6(), TdApi.SetTdlibParameters.class, (TdApi.Error) object, stackTraceElementArr);
            }
        }

        public void m2108o(long j, StackTraceElement[] stackTraceElementArr, TdApi.Object object) {
            C7903b.C7904a.m14397c("CheckDatabaseEncryptionKey response in %dms, accountId:%d", Long.valueOf(SystemClock.uptimeMillis() - j), Integer.valueOf(this.f35155a.f35017W));
            m2103t();
            if (object.getConstructor() == -1679978726) {
                Tracer.m14771i(this.f35155a.m2188w6(), TdApi.CheckDatabaseEncryptionKey.class, (TdApi.Error) object, stackTraceElementArr);
            }
        }

        public void m2107p(TdApi.Object object) {
            TdApi.Proxy[] proxyArr;
            if (object.getConstructor() == 1200447205) {
                for (TdApi.Proxy proxy : ((TdApi.Proxies) object).proxies) {
                    int o = C4868i.m24726c2().m24633o(proxy.server, proxy.port, proxy.type, null, proxy.isEnabled);
                    if (proxy.isEnabled) {
                        this.f35155a.m2390jc(o, proxy.server, proxy.port, proxy.type);
                    }
                }
                return;
            }
            int H0 = C4868i.m24726c2().m24877H0();
            C4868i.C4880l A1 = C4868i.m24726c2().m24925A1(H0);
            if (A1 != null) {
                this.f35155a.m2390jc(H0, A1.f16690b, A1.f16691c, A1.f16681M);
            } else {
                this.f35155a.m2390jc(0, null, 0, null);
            }
        }

        public void m2105r() {
            synchronized (this.f35153T) {
                if (!this.f35153T.get()) {
                    this.f35155a.m2548Zb(true);
                }
            }
        }

        public void m2104s(TdApi.Update update) {
            this.f35155a.m2796Ja(this, update);
        }

        public long m2124A() {
            if (this.f35148O != 0) {
                return SystemClock.uptimeMillis() - this.f35148O;
            }
            return -1L;
        }

        public long m2123B() {
            return this.f35149P;
        }

        @Override
        public void mo2122a(Throwable th) {
            Tracer.m14770j(th);
        }

        public void m2112k() {
            Log.m14721i((int) Log.TAG_ACCOUNTS, "Calling client.close(), accountId:%d", Integer.valueOf(this.f35155a.f35017W));
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f35156b.m14795c();
            Log.m14721i((int) Log.TAG_ACCOUNTS, "client.close() done in %dms, accountId:%d, accountsNum:%d", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis), Integer.valueOf(this.f35155a.f35017W), Integer.valueOf(f35145V.decrementAndGet()));
        }

        public boolean m2111l() {
            boolean z = this.f35150Q;
            this.f35150Q = true;
            return z;
        }

        public void m2110m() {
            TdApi.Function function;
            if (this.f35148O == 0) {
                this.f35148O = SystemClock.uptimeMillis();
                final StackTraceElement[] stackTrace = new RuntimeException().getStackTrace();
                this.f35156b.m14783o(new TdApi.SetTdlibParameters(this.f35155a.f35037c), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        C10930q6.C10941k.this.m2109n(stackTrace, object);
                    }
                });
                final long uptimeMillis = SystemClock.uptimeMillis();
                this.f35156b.m14783o(new TdApi.CheckDatabaseEncryptionKey(), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        C10930q6.C10941k.this.m2108o(uptimeMillis, stackTrace, object);
                    }
                });
                m2100w();
                if (this.f35155a.f35017W != 0 || !C4868i.m24726c2().m24833N2()) {
                    function = new TdApi.SetAlarm(0.0d);
                } else {
                    function = new TdApi.GetProxies();
                }
                this.f35156b.m14783o(function, new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        C10930q6.C10941k.this.m2107p(object);
                    }
                });
                this.f35156b.m14783o(new TdApi.GetApplicationConfig(), this.f35155a.f34990N);
            }
        }

        public final void m2103t() {
            synchronized (this.f35153T) {
                if (!this.f35153T.getAndSet(true)) {
                    if (this.f35154U != null) {
                        this.f35155a.m2485dd().removeCallbacks(this.f35154U);
                        this.f35154U = null;
                    }
                    this.f35155a.m2548Zb(false);
                }
            }
        }

        @Override
        public void mo255t2(TdApi.Object object) {
            if (this.f35147N) {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (object instanceof TdApi.Update) {
                    this.f35155a.m2796Ja(this, (TdApi.Update) object);
                } else {
                    Log.m14724e("Invalid update type: %s", object);
                }
                if (Log.needMeasureLaunchSpeed()) {
                    long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
                    if (uptimeMillis2 > 100) {
                        Log.m14724e("%s took %dms", object.toString(), Long.valueOf(uptimeMillis2));
                    }
                    this.f35149P += uptimeMillis2;
                    return;
                }
                return;
            }
            Log.m14709w("Ignored update: %s", object);
        }

        public void m2102u(Runnable runnable) {
            m2101v(runnable, 0.0d);
        }

        public void m2101v(final Runnable runnable, double d) {
            this.f35156b.m14783o(new TdApi.SetAlarm(d), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    runnable.run();
                }
            });
        }

        public final void m2100w() {
            synchronized (this.f35153T) {
                if (!this.f35153T.get() && this.f35154U == null) {
                    this.f35154U = new Runnable() {
                        @Override
                        public final void run() {
                            C10930q6.C10941k.this.m2105r();
                        }
                    };
                    this.f35155a.m2485dd().postDelayed(this.f35154U, 1000L);
                }
            }
        }

        public void m2099x() {
            this.f35156b.m14783o(new TdApi.Close(), this.f35155a.f34987M);
        }

        public void m2098y(final TdApi.Update update, boolean z) {
            if (z) {
                this.f35155a.m2796Ja(this, update);
            } else {
                m2102u(new Runnable() {
                    @Override
                    public final void run() {
                        C10930q6.C10941k.this.m2104s(update);
                    }
                });
            }
        }

        public void m2097z() {
            this.f35147N = false;
        }
    }

    public static class C10942l {
        public CountDownLatch f35158a;
        public TdApi.File f35159b;
        public String f35160c;
        public long f35161d;
        public boolean f35162e;
        public Runnable f35163f;
    }

    public static class C10943m {
        public final String f35164a;
        public final boolean f35165b;

        public C10943m(String str, boolean z) {
            this.f35164a = str;
            this.f35165b = z;
        }

        public String toString() {
            return this.f35164a;
        }
    }

    public static class C10944n {
        public final long f35166a;
        public final int f35167b;
        public final int f35168c;

        public C10944n(long j, int i, int i2) {
            this.f35166a = j;
            this.f35167b = i;
            this.f35168c = i2;
        }

        public boolean m2090a() {
            int i = this.f35167b;
            return (i == 1 || i == 2) ? false : true;
        }

        public boolean m2089b() {
            return C7316a.m17049l(this.f35166a);
        }
    }

    public static class C10945o {
        public final String f35169a;
        public final int f35170b;
        public final String f35171c;
        public final String f35172d;

        public C10945o(TdApi.JsonValueObject jsonValueObject) {
            Map<String, TdApi.JsonValue> b = C7318c.m17035b(jsonValueObject);
            this.f35169a = C7318c.m17034c(b.get("host"));
            this.f35170b = C7318c.m17036a(b.get("port"));
            this.f35171c = C7318c.m17034c(b.get("username"));
            this.f35172d = C7318c.m17034c(b.get("password"));
        }
    }

    public static class C10946p {
        public final TdApi.Session[] f35173a;
        public final TdApi.Session[] f35174b;
        public final TdApi.Session[] f35175c;
        public final TdApi.Session f35176d;
        public final boolean f35177e;
        public final int f35178f;
        public final int f35179g;
        public final int f35180h;
        public final int f35181i;

        public C10946p(TdApi.Sessions sessions) {
            boolean z;
            this.f35181i = sessions.inactiveSessionTtlDays;
            C7321e.m16920p1(sessions.sessions);
            HashMap hashMap = new HashMap();
            TdApi.Session[] sessionArr = sessions.sessions;
            int length = sessionArr.length;
            AtomicInteger atomicInteger = null;
            TdApi.Session session = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                z = true;
                if (i >= length) {
                    break;
                }
                TdApi.Session session2 = sessionArr[i];
                i2++;
                if (session2.isCurrent) {
                    session = session2;
                } else if (session2.isPasswordPending) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(session2);
                    i++;
                } else {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(session2);
                }
                String a = m2088a(session2);
                AtomicInteger atomicInteger2 = (AtomicInteger) hashMap.get(a);
                if (atomicInteger2 != null) {
                    atomicInteger2.incrementAndGet();
                } else {
                    hashMap.put(a, new AtomicInteger(1));
                }
                i3++;
                i++;
            }
            atomicInteger = session != null ? (AtomicInteger) hashMap.remove(m2088a(session)) : atomicInteger;
            this.f35173a = sessions.sessions;
            this.f35176d = session;
            this.f35179g = atomicInteger != null ? atomicInteger.get() : 1;
            this.f35178f = hashMap.size();
            this.f35180h = i3;
            this.f35177e = i2 != 1 ? false : z;
            this.f35175c = (arrayList2 == null || arrayList2.isEmpty()) ? new TdApi.Session[0] : (TdApi.Session[]) arrayList2.toArray(new TdApi.Session[0]);
            this.f35174b = (arrayList == null || arrayList.isEmpty()) ? new TdApi.Session[0] : (TdApi.Session[]) arrayList.toArray(new TdApi.Session[0]);
        }

        public static String m2088a(TdApi.Session session) {
            return session.deviceModel + " " + session.platform + " " + session.systemVersion;
        }
    }

    public static class C10947q {
        public final ConcurrentHashMap<String, TdApi.Sticker> f35182a = new ConcurrentHashMap<>();
        public TdApi.StickerSet f35183b;
        public final int f35184c;
        public boolean f35185d;
        public String f35186e;
        public boolean f35187f;

        public C10947q(int i, String str, boolean z) {
            this.f35184c = i;
            this.f35186e = str;
            this.f35187f = z;
        }

        public void m2085c() {
            this.f35185d = false;
            this.f35182a.clear();
            this.f35183b = null;
        }

        public TdApi.Sticker m2084d(int i) {
            return this.f35182a.get(C5078d.m24013T(i));
        }

        public TdApi.Sticker m2083e(String str) {
            return this.f35182a.get(C5078d.m23986z().m24004h(str));
        }

        public boolean m2082f() {
            return !this.f35182a.isEmpty();
        }

        public void m2080h(final C10930q6 q6Var) {
            if (!this.f35185d && !C5070i.m24061i(this.f35186e)) {
                this.f35185d = true;
                q6Var.m2150yc(this.f35186e, new AbstractC5918j() {
                    @Override
                    public final void mo1330a(Object obj) {
                        C10930q6.C10947q.this.m2081g(q6Var, (TdApi.StickerSet) obj);
                    }
                });
            }
        }

        public void m2081g(C10930q6 q6Var, TdApi.StickerSet stickerSet) {
            TdApi.Sticker d;
            TdApi.Sticker[] stickerArr;
            m2085c();
            this.f35183b = stickerSet;
            if (stickerSet != null) {
                int i = 0;
                for (TdApi.Sticker sticker : stickerSet.stickers) {
                    TdApi.Emojis emojis = stickerSet.emojis[i];
                    if (!this.f35187f || emojis.emojis.length <= 1) {
                        for (String str : emojis.emojis) {
                            String h = C5078d.m23986z().m24004h(str);
                            if (!this.f35182a.containsKey(h)) {
                                this.f35182a.put(h, sticker);
                            }
                        }
                        i++;
                    }
                }
            }
            q6Var.m2781K9().m1971C(this.f35184c);
            if (!(this.f35184c != 2 || (d = m2084d(0)) == null || C4779t2.m25598T2(d.sticker))) {
                q6Var.m2413i5().m3975p(d.sticker);
            }
        }

        public void m2078j(C10930q6 q6Var, TdApi.StickerSet stickerSet) {
            TdApi.StickerSet stickerSet2 = this.f35183b;
            if (stickerSet2 != null && stickerSet2.f25423id == stickerSet.f25423id) {
                m2081g(q6Var, stickerSet);
            }
        }
    }

    public interface AbstractC10948r {
        void mo1525a(long j, long j2, TdApi.Error error);
    }

    public static final class C10949s {
        public final TdApi.Document f35188a;
        public final int f35189b;
        public final String f35190c;

        public C10949s(TdApi.Document document, int i, String str) {
            this.f35188a = document;
            this.f35189b = i;
            this.f35190c = str;
        }
    }

    public C10930q6(C11131y6 y6Var, boolean z) {
        TdApi.JsonValue d;
        C11028tj tjVar = new C11028tj(this);
        this.f35008T = tjVar;
        this.f35011U = new C11177zj(tjVar);
        Object obj = new Object();
        this.f35026Z = obj;
        long j = 0;
        C10536ab abVar = y6Var.f35704a;
        this.f35014V = abVar;
        this.f35017W = y6Var.f35705b;
        this.f35100x1 = z;
        this.f34970D1 = y6Var.m1508C();
        this.f34972E1 = y6Var.m1502I();
        boolean needMeasureLaunchSpeed = Log.needMeasureLaunchSpeed();
        j = needMeasureLaunchSpeed ? SystemClock.uptimeMillis() : j;
        this.f35056i0 = new C11039u9(this);
        if (needMeasureLaunchSpeed) {
            Log.m14714v("INITIALIZATION: Tdlib.listeners -> %dms", Long.valueOf(SystemClock.uptimeMillis() - j));
            j = SystemClock.uptimeMillis();
        }
        this.f35053h0 = new C11059v7(this);
        if (needMeasureLaunchSpeed) {
            Log.m14714v("INITIALIZATION: Tdlib.cache -> %dms", Long.valueOf(SystemClock.uptimeMillis() - j));
            j = SystemClock.uptimeMillis();
        }
        this.f35059j0 = new C10756j9(this);
        if (needMeasureLaunchSpeed) {
            Log.m14714v("INITIALIZATION: Tdlib.filesManager -> %dms", Long.valueOf(SystemClock.uptimeMillis() - j));
            j = SystemClock.uptimeMillis();
        }
        this.f35062k0 = new C10802kc(this);
        if (needMeasureLaunchSpeed) {
            Log.m14714v("INITIALIZATION: Tdlib.statusManager -> %dms", Long.valueOf(SystemClock.uptimeMillis() - j));
            j = SystemClock.uptimeMillis();
        }
        this.f35065l0 = new C11134y8(this);
        if (needMeasureLaunchSpeed) {
            Log.m14714v("INITIALIZATION: Tdlib.contactManager -> %dms", Long.valueOf(SystemClock.uptimeMillis() - j));
            j = SystemClock.uptimeMillis();
        }
        this.f35068m0 = new C11115xb(this);
        if (needMeasureLaunchSpeed) {
            Log.m14714v("INITIALIZATION: Tdlib.quickAckManager -> %dms", Long.valueOf(SystemClock.uptimeMillis() - j));
            j = SystemClock.uptimeMillis();
        }
        this.f35071n0 = new C10733ic(this);
        if (needMeasureLaunchSpeed) {
            Log.m14714v("INITIALIZATION: Tdlib.settingsManager -> %dms", Long.valueOf(SystemClock.uptimeMillis() - j));
            j = SystemClock.uptimeMillis();
        }
        this.f35074o0 = new C11004sj(this);
        if (needMeasureLaunchSpeed) {
            Log.m14714v("INITIALIZATION: Tdlib.wallpaperManager -> %dms", Long.valueOf(SystemClock.uptimeMillis() - j));
            j = SystemClock.uptimeMillis();
        }
        this.f35077p0 = new C10827lb(this, abVar.m4707d2());
        if (needMeasureLaunchSpeed) {
            Log.m14714v("INITIALIZATION: Tdlib.notificationManager -> %dms", Long.valueOf(SystemClock.uptimeMillis() - j));
            j = SystemClock.uptimeMillis();
        }
        this.f35080q0 = new C5365w(this);
        if (needMeasureLaunchSpeed) {
            Log.m14714v("INITIALIZATION: Tdlib.fileGenerationManager -> %dms", Long.valueOf(SystemClock.uptimeMillis() - j));
            j = SystemClock.uptimeMillis();
        }
        String u = m2294pc().m4093u();
        this.f35025Y1 = u;
        if (!C5070i.m24061i(u) && (d = C7318c.m17033d(this.f35025Y1)) != null) {
            m2828Ha(d);
        }
        if (needMeasureLaunchSpeed) {
            Log.m14714v("INITIALIZATION: Tdlib.applicationConfig -> %dms", Long.valueOf(SystemClock.uptimeMillis() - j));
            j = SystemClock.uptimeMillis();
        }
        synchronized (obj) {
            if (this.f35020X == null) {
                this.f35020X = m2456fa();
            }
        }
        if (needMeasureLaunchSpeed) {
            Log.m14719i("INITIALIZATION: Tdlib.newClient() -> %dms", Long.valueOf(SystemClock.uptimeMillis() - j));
        }
        C4868i.m24726c2().m24649m(this);
    }

    public void m2943A7(final TdApi.LanguagePackInfo languagePackInfo, final AbstractC5917i iVar, final TdApi.Object object) {
        m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                C10930q6.m2139z7(TdApi.Object.this, languagePackInfo, iVar);
            }
        });
    }

    public boolean m2942A8() {
        return !this.f35040c2;
    }

    public void m2941A9(AbstractC5918j jVar, TdApi.Session session, TdApi.Object object) {
        jVar.mo1330a(object.getConstructor() == -1679978726 ? (TdApi.Error) object : null);
        if (object.getConstructor() == -722616727) {
            this.f35019W1 = null;
            this.f35056i0.m1939K(session);
        }
    }

    public void m2927B7(final TdApi.LanguagePackInfo languagePackInfo, final AbstractC5917i iVar) {
        m2270r4().m14783o(new TdApi.SetOption("language_pack_id", new TdApi.OptionValueString(languagePackInfo.f25405id)), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C10930q6.this.m2943A7(languagePackInfo, iVar, object);
            }
        });
    }

    public static boolean m2926B8() {
        return false;
    }

    public static void m2925B9(AtomicReference atomicReference, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, AbstractC10939i iVar, boolean z, TdApi.Error error) {
        if (error != null) {
            atomicReference.set(error);
        }
        if (!z) {
            atomicBoolean.set(true);
        }
        if (atomicInteger.decrementAndGet() != 0) {
            return;
        }
        if (atomicBoolean.get()) {
            iVar.mo1765a(false, (TdApi.Error) atomicReference.get());
        } else {
            iVar.mo1765a(true, null);
        }
    }

    public boolean m2910C8() {
        TdApi.AuthorizationState authorizationState = this.f34982J1;
        return authorizationState != null && authorizationState.getConstructor() == 1526047584;
    }

    public void m2909C9(final AbstractC10939i iVar, long j, long j2, TdApi.Object object) {
        AbstractC10939i iVar2;
        int constructor = object.getConstructor();
        if (constructor != -1679978726) {
            if (constructor == -722616727) {
                if (iVar != null) {
                    final AtomicInteger atomicInteger = new AtomicInteger(2);
                    final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    final AtomicReference atomicReference = new AtomicReference();
                    iVar2 = new AbstractC10939i() {
                        @Override
                        public final void mo1765a(boolean z, TdApi.Error error) {
                            C10930q6.m2925B9(atomicReference, atomicBoolean, atomicInteger, iVar, z, error);
                        }
                    };
                } else {
                    iVar2 = null;
                }
                AbstractC10939i iVar3 = iVar2;
                m2700Pa(j, new TdApi.MessageSenderUser(j2), TdApi.ChatMemberStatusCreator.CONSTRUCTOR, iVar3);
                m2700Pa(j, new TdApi.MessageSenderUser(m2519ba()), TdApi.ChatMemberStatusAdministrator.CONSTRUCTOR, iVar3);
            }
        } else if (iVar != null) {
            iVar.mo1765a(false, (TdApi.Error) object);
        } else {
            C1379j0.m37302t0(object);
        }
    }

    public void m2895D7(Runnable runnable, final AbstractC5917i iVar, boolean z) {
        if (z) {
            runnable.run();
        } else if (iVar != null) {
            m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    AbstractC5917i.this.mo1322a(false);
                }
            });
        }
    }

    public void m2894D8(TdApi.Object object) {
        TdApi.Message[] messageArr;
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
        } else if (constructor == -16498159) {
            for (TdApi.Message message : ((TdApi.Messages) object).messages) {
                if (message != null) {
                    m2292pe(new TdApi.UpdateNewMessage(message), false);
                }
            }
        } else if (constructor == 1435961258) {
            m2292pe(new TdApi.UpdateNewMessage((TdApi.Message) object), false);
        }
    }

    public void m2893D9(String str, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.m14724e("Failed to fetch suggested language, code: %s %s", str, C4779t2.m25378z5(object));
            m2342mc(str, null);
        } else if (constructor != 542199642) {
            Log.unexpectedTdlibResponse(object, TdApi.GetLanguagePackInfo.class, TdApi.LanguagePackInfo.class, TdApi.Error.class);
        } else {
            m2342mc(str, (TdApi.LanguagePackInfo) object);
        }
    }

    public static boolean m2889Dd(TdApi.Chat chat, TdApi.ChatPosition chatPosition) {
        return m2731Nb(chat, chatPosition) != 0;
    }

    public void m2879E7(AbstractC5918j jVar, long j, TdApi.Object object) {
        jVar.mo1330a(object.getConstructor() == -1601123095 ? m2632U2(j) : null);
    }

    public static void m2878E8(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
        } else if (constructor == -722616727) {
            C1379j0.m37292y0(R.string.Done, 0);
        }
    }

    public void m2877E9(TdApi.Object object) {
        m2440ga().m3070v1(true);
    }

    public void m2863F7(final long j, final AbstractC5918j jVar) {
        TdApi.Chat U2 = m2632U2(j);
        if (U2 != null) {
            jVar.mo1330a(U2);
        } else {
            m2270r4().m14783o(new TdApi.GetChat(j), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    C10930q6.this.m2879E7(jVar, j, object);
                }
            });
        }
    }

    public static void m2862F8(TdApi.Object object) {
        if (object.getConstructor() == -1679978726) {
            Log.m14724e("TDLib Error (silenced): %s", C4779t2.m25378z5(object));
        }
    }

    public void m2861F9(DialogInterface dialogInterface, int i) {
        m2738N4();
    }

    public void m2847G7(long j, AbstractC5918j jVar, TdApi.Object object) {
        jVar.mo1330a(m2632U2(j));
    }

    public void m2846G8(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.m14727e(32, "DownloadFile failed: %s", C4779t2.m25378z5(object));
        } else if (constructor == -722616727) {
        } else {
            if (constructor != 766337656) {
                Log.unexpectedTdlibResponse(object, TdApi.DownloadFile.class, TdApi.C7866Ok.class, TdApi.Error.class);
                return;
            }
            TdApi.File file = (TdApi.File) object;
            TdApi.LocalFile localFile = file.local;
            if (localFile.isDownloadingCompleted) {
                ImageLoader.m14392e().m14389h(this, file);
            } else if (!localFile.isDownloadingActive) {
                Log.m14727e(32, "WARNING: Image load not started", new Object[0]);
            }
        }
    }

    public void m2845G9(TdApi.UpdateServiceNotification updateServiceNotification, CharSequence charSequence) {
        AbstractC9323v4<?> s = C1379j0.m37305s();
        if (s == null) {
            return;
        }
        if (C5070i.m24061i(updateServiceNotification.type) || (!updateServiceNotification.type.startsWith("AUTH_KEY_DROP") && !updateServiceNotification.type.startsWith("AUTHKEYDROP"))) {
            s.m9447Ec(R.string.AppName, charSequence);
        } else {
            s.m9439Fc(R.string.AppName, charSequence, C4403w.m27869i1(R.string.LogOut), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C10930q6.this.m2861F9(dialogInterface, i);
                }
            }, 2);
        }
    }

    public void m2831H7(final AbstractC5918j jVar, AbstractC5913e eVar, final long j, TdApi.Chat chat) {
        if (chat != null) {
            jVar.mo1330a(chat);
        } else {
            m2270r4().m14783o((TdApi.Function) eVar.get(), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    C10930q6.this.m2847G7(j, jVar, object);
                }
            });
        }
    }

    public static void m2830H8(TdApi.Object object) {
        if (object.getConstructor() == -1679978726) {
            Log.m14724e("setProfilePhoto failed: %s", C4779t2.m25378z5(object));
            C1379j0.m37290z0(C4403w.m27865j1(R.string.SetProfilePhotoError, C4779t2.m25378z5(object)), 0);
        }
    }

    public static void m2829H9(AbstractC10948r rVar, long j, long j2, TdApi.Object object) {
        if (rVar != null) {
            rVar.mo1525a(j, j2, object.getConstructor() == -1679978726 ? (TdApi.Error) object : null);
        } else if (object.getConstructor() == -1679978726) {
            C1379j0.m37302t0(object);
        }
    }

    public static int m2821I1(TdApi.Chat chat, TdApi.ChatPosition chatPosition) {
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

    public void m2815I7(TdApi.Object object, AtomicInteger atomicInteger, TdApi.Object object2) {
        if (object2.getConstructor() == -1679978726) {
            Log.m14724e("Received error while sending change log: %s", C4779t2.m25378z5(object));
        }
        if (atomicInteger.decrementAndGet() == 0) {
            m2834H4(1);
        }
    }

    public void m2814I8(Runnable runnable, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
        } else if (constructor == -722616727) {
            mo1480c().m2485dd().post(runnable);
        }
    }

    public void m2813I9(final AbstractC10948r rVar, final long j, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor != -1679978726) {
            if (constructor == -1601123095) {
                final long j2 = ((TdApi.Chat) object).f25367id;
                m2270r4().m14783o(new TdApi.GetSupergroupFullInfo(C7316a.m17045p(j2)), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object2) {
                        C10930q6.m2829H9(C10930q6.AbstractC10948r.this, j, j2, object2);
                    }
                });
            }
        } else if (rVar != null) {
            rVar.mo1525a(j, j, (TdApi.Error) object);
        } else {
            C1379j0.m37302t0(object);
        }
    }

    public void m2799J7(AtomicInteger atomicInteger, List list, final TdApi.Object object) {
        if (object.getConstructor() == -1679978726) {
            Log.m14724e("Received error while posting change log: %s", C4779t2.m25378z5(object));
        }
        if (atomicInteger.decrementAndGet() == 0) {
            final AtomicInteger atomicInteger2 = new AtomicInteger(list.size());
            long Cb = m2907Cb();
            Client.AbstractC7865g k2Var = new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object2) {
                    C10930q6.this.m2815I7(object, atomicInteger2, object2);
                }
            };
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m2270r4().m14783o(new TdApi.AddLocalMessage(Cb, new TdApi.MessageSenderUser(777000L), 0L, true, (TdApi.InputMessageContent) it.next()), k2Var);
            }
        }
    }

    public void m2798J8(Runnable runnable, TdApi.Object object) {
        this.f34987M.mo255t2(object);
        runnable.run();
    }

    public void m2783K7() {
        m2334n4(null);
    }

    public void m2767L7(Runnable runnable, TdApi.Object object) {
        m2334n4(runnable);
    }

    public void m2766L8(Runnable runnable) {
        if (m2522b7()) {
            C7389v0.m16743D2(runnable);
            return;
        }
        m2603W1(runnable, true);
        m2630U4();
    }

    public static TdApi.FormattedText m2765L9(String str, String str2) {
        TdApi.FormattedText formattedText = new TdApi.FormattedText(C4403w.m27821u1(R.string.ChangeLogText, str, str2), null);
        C7321e.m16935k1(formattedText);
        return formattedText;
    }

    public void m2751M7(String str, long[] jArr, long j, long[] jArr2, final Runnable runnable, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            TdApi.Error error = (TdApi.Error) object;
            int max = Math.max(5, C4779t2.m25410v1(error.code, error.message, 5));
            if (max <= 60 || !m2658S6()) {
                Log.m14724e("Unable to register device token, retrying in %d seconds: %s, accountId:%d", Integer.valueOf(max), C4779t2.m25378z5(object), Integer.valueOf(this.f35017W));
                m2270r4().m14783o(new TdApi.SetAlarm(max), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object2) {
                        C10930q6.this.m2767L7(runnable, object2);
                    }
                });
            } else {
                Log.m14724e("Unable to register device token, flood is %d seconds, ignoring: %s, accountId:%d", Integer.valueOf(max), C4779t2.m25378z5(object), Integer.valueOf(this.f35017W));
                this.f35014V.m4758Q2(this.f35017W, true);
                C7389v0.m16743D2(runnable);
            }
        } else if (constructor == 371056428) {
            Log.m14721i(4, "Successfully registered device token:%s, accountId:%d, otherUserIdsCount:%d", str, Integer.valueOf(this.f35017W), Integer.valueOf(jArr.length));
            C4868i.m24726c2().m24552y3(((TdApi.PushReceiverId) object).f25416id, this.f35017W);
            C10733ic.m4100q0(this.f35017W, j, str, jArr);
            m2930B4().m4758Q2(this.f35017W, true);
            m2930B4().m4702e3(this.f35100x1, this.f35017W, jArr2);
            C7389v0.m16743D2(runnable);
        }
        m2834H4(1);
    }

    public void m2750M8(Map map, String str, TdApi.Object object, long j, long j2) {
        if (((TdApi.Object) map.get(str)) == object) {
            synchronized (map) {
                map.remove(str);
            }
            this.f35056i0.m1836l2(j, j2);
        }
    }

    public static void m2749M9(int i, int i2, int i3, int i4, String str, List<TdApi.Function> list, List<TdApi.InputMessageContent> list2, boolean z) {
        TdApi.FormattedText L9 = m2765L9(String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)), str);
        list.add(new TdApi.GetWebPagePreview(L9));
        list.add(new TdApi.GetWebPageInstantView(str, false));
        list2.add(new TdApi.InputMessageText(L9, false, false));
    }

    public void m2735N7(AtomicReference atomicReference, CountDownLatch countDownLatch, TdApi.Object object) {
        synchronized (atomicReference) {
            atomicReference.set(object);
            countDownLatch.countDown();
        }
        m2834H4(7);
    }

    public void m2734N8(final Map map, final String str, final TdApi.Object object, final long j, final long j2, TdApi.Object object2) {
        if (object2.getConstructor() == -1679978726) {
            C1379j0.m37302t0(object2);
        }
        mo1480c().m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                C10930q6.this.m2750M8(map, str, object, j, j2);
            }
        });
    }

    public static int m2731Nb(TdApi.Chat chat, TdApi.ChatPosition chatPosition) {
        int c = C7317b.m17041c(chat.positions, chatPosition.list);
        if (c != -1) {
            return m2212ue(chat, c, chatPosition);
        }
        return m2821I1(chat, chatPosition);
    }

    public void m2719O7(TdApi.Function function, final AtomicReference atomicReference, final CountDownLatch countDownLatch) {
        m2896D6(7);
        m2270r4().m14783o(function, new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C10930q6.this.m2735N7(atomicReference, countDownLatch, object);
            }
        });
    }

    public void m2718O8(long j, Runnable runnable) {
        C7903b.C7904a.m14399a(j, this.f35017W, "Finished processing push. Invoking after()", new Object[0]);
        runnable.run();
    }

    public void m2702P8(final long j, final Runnable runnable) {
        C7903b.C7904a.m14399a(j, this.f35017W, "Making sure we're not in AuthorizationStateLoggingOut", new Object[0]);
        m2603W1(new Runnable() {
            @Override
            public final void run() {
                C10930q6.this.m2718O8(j, runnable);
            }
        }, false);
    }

    public void m2687Q7(AbstractC5918j jVar, AbstractC5918j jVar2, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor != -1679978726) {
            if (constructor == 1068672887) {
                TdApi.Session session = (TdApi.Session) object;
                if (jVar != null) {
                    jVar.mo1330a(session);
                }
                this.f35056i0.m1947I(session);
            }
        } else if (jVar2 != null) {
            jVar2.mo1330a((TdApi.Error) object);
        }
    }

    public void m2686Q8(long j) {
        C7903b.C7904a.m14399a(j, this.f35017W, "All notifications displayed. But there's no after() callback.", new Object[0]);
    }

    public void m2672R7(long j, AbstractC5917i iVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        boolean z = true;
        if (constructor == -1679978726) {
            Log.m14724e("Unable to delete files data:%s, accountId:%d", C4779t2.m25378z5(object), Integer.valueOf(this.f35017W));
        } else if (constructor == 217237013) {
            Log.m14719i("Cleared files in %dms, accountId:%d", Long.valueOf(SystemClock.uptimeMillis() - j), Integer.valueOf(this.f35017W));
        }
        if (iVar != null) {
            if (object.getConstructor() != 217237013) {
                z = false;
            }
            iVar.mo1322a(z);
        }
    }

    public void m2671R8(final long j, final Runnable runnable) {
        C7903b.C7904a.m14399a(j, this.f35017W, "Making sure all notifications displayed", new Object[0]);
        m2912C6();
        if (runnable != null) {
            m2440ga().m3147b2(new Runnable() {
                @Override
                public final void run() {
                    C10930q6.this.m2702P8(j, runnable);
                }
            });
        } else {
            m2440ga().m3147b2(new Runnable() {
                @Override
                public final void run() {
                    C10930q6.this.m2686Q8(j);
                }
            });
        }
    }

    public void m2657S7(long j, boolean z, Runnable runnable, TdApi.Object object) {
        if (object.getConstructor() == -1679978726) {
            Log.m14724e("Cannot close secret chat, secretChatId:%d, error: %s", Integer.valueOf(C7316a.m17047n(j)), C4779t2.m25378z5(object));
        }
        m2270r4().m14783o(new TdApi.DeleteChatHistory(j, true, z), m2198vc(runnable));
    }

    public void m2656S8(Runnable runnable, long j) {
        if (runnable != null) {
            C7903b.C7904a.m14399a(j, this.f35017W, "Finished processing push. Invoking after()", new Object[0]);
            runnable.run();
            return;
        }
        C7903b.C7904a.m14399a(j, this.f35017W, "All notifications displayed. But there's no after() callback.", new Object[0]);
    }

    public void m2642T7(long j, boolean z, Runnable runnable, TdApi.Object object) {
        if (C7316a.m17054g(j)) {
            m2270r4().m14783o(new TdApi.DeleteChatHistory(j, true, z), m2376ka(runnable));
        }
    }

    public void m2641T8(Runnable runnable) {
        m2638Tb(false);
        runnable.run();
    }

    public void m2627U7(TdApi.Object object) {
        if (object.getConstructor() == 63135518) {
            m2683Qb(((TdApi.OptionValueBoolean) object).value);
        }
    }

    public void m2626U8(final long j, final Runnable runnable, TdApi.Object object) {
        final Runnable i3Var = new Runnable() {
            @Override
            public final void run() {
                C10930q6.this.m2671R8(j, runnable);
            }
        };
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            TdApi.Error error = (TdApi.Error) object;
            if (error.code == 401) {
                C7903b.C7904a.m14399a(j, this.f35017W, "TDLib tells to expect AuthorizationStateLoggingOut: %s, waiting.", error);
                m2603W1(new Runnable() {
                    @Override
                    public final void run() {
                        C10930q6.this.m2656S8(runnable, j);
                    }
                }, true);
            } else {
                C7903b.C7904a.m14399a(j, this.f35017W, "Failed to process push: %s, performing full sync.", C4779t2.m25378z5(object));
                m2638Tb(true);
                m2842Gc(j, new Runnable() {
                    @Override
                    public final void run() {
                        C10930q6.this.m2641T8(i3Var);
                    }
                }, true, false);
            }
        } else if (constructor == -722616727) {
            C7903b.C7904a.m14399a(j, this.f35017W, "Ensuring updateActiveNotifications was sent. ignoreNotificationUpdates:%b, receivedActiveNotificationsTime:%d, receivedActiveNotificationsIgnored: %b", Boolean.valueOf(this.f34974F1), Long.valueOf(this.f35046e2), Boolean.valueOf(this.f35049f2));
            m2543a2(i3Var);
        }
        m2850G4();
    }

    public void m2612V7() {
        if (!this.f35043d2) {
            this.f35043d2 = true;
            m2280qa();
        }
    }

    public void m2611V8(boolean z, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.m14724e("Failed to load avatar, accountId:%d, big:%b", Integer.valueOf(this.f35017W), Boolean.valueOf(z));
        } else if (constructor == 766337656) {
            TdApi.File file = (TdApi.File) object;
            if (C4779t2.m25598T2(file)) {
                TdApi.ProfilePhoto profilePhoto = this.f35070m2;
                TdApi.File file2 = profilePhoto != null ? z ? profilePhoto.big : profilePhoto.small : null;
                if (file2 != null && file2.f25373id == file.f25373id) {
                    C7321e.m16907u(file, file2);
                    m2949A1().m1469h0(z, file.local.path);
                    this.f35014V.m4669n2(this.f35017W, z);
                }
            }
        }
    }

    public void m2597W7(long j, long j2, TdApi.InputMessageText inputMessageText, TdApi.MessageText messageText, TdApi.Object object) {
        if (object.getConstructor() == -1816658231) {
            m2892Da(j, j2, new TdApi.MessageAnimatedEmoji((TdApi.AnimatedEmoji) object, inputMessageText.text.text), new TdApi.EditMessageText(j, j2, null, inputMessageText), this.f35010T1);
        } else {
            m2892Da(j, j2, messageText, new TdApi.EditMessageText(j, j2, null, inputMessageText), this.f35010T1);
        }
    }

    public void m2596W8(AtomicInteger atomicInteger, TdApi.Chat chat) {
        boolean z;
        TdApi.Message message;
        boolean z2 = true;
        if (chat.unreadCount == 0 || (message = chat.lastMessage) == null) {
            z = false;
        } else {
            m2716Oa(chat.f25367id, 0L, new long[]{message.f25406id});
            z = true;
        }
        if (chat.isMarkedAsUnread) {
            m2270r4().m14783o(new TdApi.ToggleChatIsMarkedAsUnread(chat.f25367id, false), this.f34987M);
            z = true;
        }
        if (chat.unreadMentionCount > 0) {
            m2270r4().m14783o(new TdApi.ReadAllChatMentions(chat.f25367id), this.f34987M);
        } else {
            z2 = z;
        }
        if (z2) {
            atomicInteger.incrementAndGet();
        }
    }

    public void m2582X7(AbstractC5913e eVar, AbstractC5107c1 c1Var, AbstractC5913e eVar2, AbstractC5918j jVar, List list) {
        ArrayList<C4868i.AbstractC4872d> arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        C4868i.AbstractC4872d dVar = (C4868i.AbstractC4872d) eVar.get();
        boolean g = dVar.mo24528g();
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            TdApi.Message message = (TdApi.Message) it.next();
            TdApi.MessageContent messageContent = message.content;
            TdApi.Document document = ((TdApi.MessageDocument) messageContent).document;
            if (C4779t2.m25395x2(((TdApi.MessageDocument) messageContent).caption, "#preview")) {
                hashMap.put(C7389v0.m16681T0(document.fileName), document.document);
            } else {
                try {
                    C4868i.AbstractC4872d dVar2 = (C4868i.AbstractC4872d) c1Var.mo2952a(message);
                    if (!z && dVar2.mo24528g()) {
                        z = true;
                    } else if (!g && dVar2.f16665a.equals(dVar.f16665a)) {
                        g = true;
                    }
                    arrayList.add(dVar2);
                } catch (Throwable unused) {
                }
            }
        }
        if (!z) {
            arrayList.add(0, (C4868i.AbstractC4872d) eVar2.get());
        }
        if (!g) {
            arrayList.add(dVar);
        }
        Collections.sort(arrayList);
        for (C4868i.AbstractC4872d dVar3 : arrayList) {
            dVar3.m24534i(this, (TdApi.File) hashMap.remove(dVar3.f16665a));
        }
        jVar.mo1330a(arrayList);
    }

    public static void m2581X8(AbstractC5919k kVar, AtomicInteger atomicInteger, boolean z) {
        if (z && kVar != null) {
            kVar.mo3250a(atomicInteger.get());
        }
    }

    public static boolean m2567Y7(String str, TdApi.Message message) {
        return message.content.getConstructor() == 596945783 && C4779t2.m25395x2(((TdApi.MessageDocument) message.content).caption, str);
    }

    public void m2566Y8(Runnable runnable) {
        runnable.run();
        m2834H4(1);
    }

    public static int m2554Z5(TdApi.AuthorizationState authorizationState) {
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

    public static void m2552Z7(p139jb.AbstractC5918j r7, org.drinkless.p210td.libcore.telegram.TdApi.Message r8) {
        throw new UnsupportedOperationException("Method not decompiled: p350yd.C10930q6.m2552Z7(jb.j, org.drinkless.td.libcore.telegram.TdApi$Message):void");
    }

    public void m2551Z8(Runnable runnable) {
        runnable.run();
        m2818I4();
    }

    public static void m2537a8(C10942l lVar, CountDownLatch countDownLatch, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.m14709w("Error starting file generation: %s", C4779t2.m25378z5(object));
            countDownLatch.countDown();
        } else if (constructor == 766337656) {
            lVar.f35159b = (TdApi.File) object;
        }
        countDownLatch.countDown();
    }

    public static void m2536a9(Client.AbstractC7865g gVar, Runnable runnable, TdApi.Object object) {
        gVar.mo255t2(object);
        runnable.run();
    }

    public static void m2521b8(List list, List list2, List list3, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, AbstractC5918j jVar) {
        if (list.size() + list2.size() > 0) {
            ArrayList arrayList = new ArrayList(list2.size() + list3.size() + list.size());
            arrayList.addAll(list2);
            arrayList.addAll(list3);
            arrayList.addAll(list);
            list3 = arrayList;
        }
        boolean z = true;
        boolean z2 = list3.size() < 10 && !atomicBoolean.get();
        if (list3.size() >= 10 || atomicBoolean2.get()) {
            z = false;
        }
        if (jVar != null) {
            jVar.mo1330a(new C10936f(list3, z2, z));
        }
    }

    public static void m2520b9(Client.AbstractC7865g gVar, AtomicInteger atomicInteger, Runnable runnable, TdApi.Object object) {
        gVar.mo255t2(object);
        if (atomicInteger.decrementAndGet() == 0) {
            runnable.run();
        }
    }

    public static void m2506c8(TdApi.Message message, AtomicBoolean atomicBoolean, List list, boolean z, AtomicInteger atomicInteger, Runnable runnable, TdApi.Object object) {
        int constructor = object.getConstructor();
        int i = 0;
        if (constructor == -1679978726) {
            Log.m14719i("Failed to fetch part of an album: %s", C4779t2.m25378z5(object));
        } else if (constructor == -16498159) {
            TdApi.Message[] messageArr = ((TdApi.Messages) object).messages;
            int length = messageArr.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                TdApi.Message message2 = messageArr[i];
                if (message2.f25406id < message.f25406id) {
                    if (message2.mediaAlbumId != message.mediaAlbumId) {
                        atomicBoolean.set(true);
                        break;
                    }
                    list.add(message2);
                }
                i++;
            }
            if (list.isEmpty() && !z) {
                atomicBoolean.set(true);
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            runnable.run();
        }
    }

    public void m2505c9(AbstractC5918j jVar, TdApi.Object object) {
        this.f34993O.mo255t2(object);
        jVar.mo1330a(object instanceof TdApi.Message ? (TdApi.Message) object : null);
    }

    public static void m2490d8(TdApi.Message message, AtomicBoolean atomicBoolean, List list, boolean z, AtomicInteger atomicInteger, Runnable runnable, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.m14719i("Failed to fetch part of an album: %s", C4779t2.m25378z5(object));
        } else if (constructor == -16498159) {
            TdApi.Message[] messageArr = ((TdApi.Messages) object).messages;
            int length = messageArr.length - 1;
            while (true) {
                if (length < 0) {
                    break;
                }
                TdApi.Message message2 = messageArr[length];
                if (message2.f25406id > message.f25406id) {
                    if (message2.mediaAlbumId != message.mediaAlbumId) {
                        atomicBoolean.set(true);
                        break;
                    }
                    list.add(message2);
                }
                length--;
            }
            Collections.reverse(list);
            if (list.isEmpty() && !z) {
                atomicBoolean.set(true);
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            runnable.run();
        }
    }

    public void m2489d9(long j, String str, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.m14724e("Cannot set clientData: %s, chatId:%d, clientData:%s", C4779t2.m25378z5(object), Long.valueOf(j), str);
            C1379j0.m37302t0(object);
        } else if (constructor == -722616727) {
            this.f35056i0.m1926N0(j, str);
        }
    }

    public static C4868i.C4874f m2474e8() {
        return C4868i.m24726c2().m24835N0();
    }

    public void m2473e9(TdApi.MessageSender messageSender, TdApi.ChatMemberStatus chatMemberStatus, TdApi.ChatMemberStatus chatMemberStatus2, AbstractC10939i iVar, long j, long j2, TdApi.Error error) {
        if (j2 != 0) {
            m2795Jb(j2, messageSender, chatMemberStatus, 0, chatMemberStatus2, iVar);
        } else if (iVar != null) {
            iVar.mo1765a(false, error);
        }
    }

    public static C4868i.C4876h m2458f8() {
        return C4868i.m24726c2().m24800S0();
    }

    public void m2457f9(long j, final TdApi.MessageSender messageSender, final TdApi.ChatMemberStatus chatMemberStatus, final TdApi.ChatMemberStatus chatMemberStatus2, final AbstractC10939i iVar) {
        m2776Ke(j, new AbstractC10948r() {
            @Override
            public final void mo1525a(long j2, long j3, TdApi.Error error) {
                C10930q6.this.m2473e9(messageSender, chatMemberStatus, chatMemberStatus2, iVar, j2, j3, error);
            }
        });
    }

    public static void m2442g8(AbstractC5918j jVar, long j, long j2, TdApi.Object object) {
        if (!(object instanceof TdApi.Message)) {
            if (jVar != null) {
                jVar.mo1330a(null);
            }
            Log.m14719i("Could not get message from server: %s, chatId:%s, messageId:%s", C4779t2.m25378z5(object), Long.valueOf(j), Long.valueOf(j2));
        } else if (jVar != null) {
            jVar.mo1330a((TdApi.Message) object);
        }
    }

    public static void m2441g9(AbstractC10939i iVar, TdApi.Object object) {
        iVar.mo1765a(false, (TdApi.Error) object);
    }

    public void m2426h8(final AbstractC5918j jVar, final long j, final long j2, TdApi.Object object) {
        if (!(object instanceof TdApi.Message)) {
            m2270r4().m14783o(new TdApi.GetMessage(j, j2), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object2) {
                    C10930q6.m2442g8(AbstractC5918j.this, j, j2, object2);
                }
            });
        } else if (jVar != null) {
            jVar.mo1330a((TdApi.Message) object);
        }
    }

    public void m2425h9(Runnable runnable, final AbstractC10939i iVar, final TdApi.Object object) {
        if (C4779t2.m25450p3(object)) {
            runnable.run();
        } else if (iVar != null) {
            m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C10930q6.m2441g9(C10930q6.AbstractC10939i.this, object);
                }
            });
        }
    }

    public static void m2410i8(AtomicBoolean atomicBoolean, AbstractRunnableC5910b bVar, AbstractC5918j jVar, TdApi.MessageLink messageLink) {
        synchronized (atomicBoolean) {
            if (!atomicBoolean.getAndSet(true)) {
                if (bVar != null) {
                    bVar.m21857c();
                }
                jVar.mo1330a(new C10943m(messageLink.link, messageLink.isPublic));
            }
        }
    }

    public static void m2409i9(AbstractC5917i iVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
            iVar.mo1322a(false);
        } else if (constructor == -722616727) {
            iVar.mo1322a(true);
        }
    }

    public void m2394j8(final AtomicBoolean atomicBoolean, final AbstractRunnableC5910b bVar, final AbstractC5918j jVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.m14724e("Could not fetch message link: %s", C4779t2.m25378z5(object));
            if (bVar != null) {
                m2485dd().post(bVar);
            }
        } else if (constructor == -1354089818) {
            final TdApi.MessageLink messageLink = (TdApi.MessageLink) object;
            m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C10930q6.m2410i8(atomicBoolean, bVar, jVar, messageLink);
                }
            });
        }
    }

    public void m2393j9(AbstractC5918j jVar, int i, TdApi.Object object) {
        jVar.mo1330a(object.getConstructor() == -1679978726 ? (TdApi.Error) object : null);
        if (object.getConstructor() == -722616727) {
            this.f35019W1 = null;
            this.f35056i0.m1955G(i);
        }
    }

    public void m2377k9(boolean z, Client client) {
        client.m14783o(new TdApi.SetOption("is_emulator", new TdApi.OptionValueBoolean(z)), this.f34987M);
    }

    public void m2362l8(final AbstractC5918j jVar, TdApi.Object object) {
        final String str;
        int constructor = object.getConstructor();
        if (constructor == -2018019930) {
            str = ((TdApi.HttpUrl) object).url;
        } else if (constructor != -1679978726) {
            Log.unexpectedTdlibResponse(object, TdApi.GetProxyLink.class, TdApi.HttpUrl.class, TdApi.Error.class);
            return;
        } else {
            Log.m14724e("Proxy link unavailable: %s", C4779t2.m25378z5(object));
            str = null;
        }
        m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                AbstractC5918j.this.mo1330a(str);
            }
        });
    }

    public void m2361l9(TdApi.NetworkType networkType, Client client) {
        client.m14783o(new TdApi.SetNetworkType(networkType), this.f34987M);
    }

    public void m2346m8(final AbstractC5918j jVar, TdApi.Object object) {
        if (object.getConstructor() == 196049779) {
            m2270r4().m14783o(new TdApi.GetProxyLink(((TdApi.Proxy) object).f25415id), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object2) {
                    C10930q6.this.m2362l8(jVar, object2);
                }
            });
        }
    }

    public void m2345m9(boolean z, Client client) {
        client.m14783o(new TdApi.SetOption("online", new TdApi.OptionValueBoolean(z)), this.f34987M);
    }

    public void m2330n8(AbstractC5918j jVar) {
        C10946p pVar = this.f35019W1;
        if (pVar == null) {
            m2569Y5(false, jVar);
        } else if (jVar != null) {
            jVar.mo1330a(pVar);
        }
    }

    public void m2314o8(AbstractC5918j jVar, TdApi.Object object) {
        C10946p pVar;
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.m14724e("Unable to fetch sessions", C4779t2.m25378z5(object));
            if (jVar != null) {
                jVar.mo1330a(null);
            }
        } else if (constructor == 842912274) {
            TdApi.Sessions sessions = (TdApi.Sessions) object;
            synchronized (this.f35030a0) {
                pVar = new C10946p(sessions);
                this.f35019W1 = pVar;
            }
            if (jVar != null) {
                jVar.mo1330a(pVar);
            }
        }
    }

    public void m2313o9(int i, TdApi.NotificationSettingsScope notificationSettingsScope, TdApi.Object object) {
        if (object.getConstructor() == -426103745) {
            TdApi.ScopeNotificationSettings scopeNotificationSettings = (TdApi.ScopeNotificationSettings) object;
            scopeNotificationSettings.muteFor = i;
            m2358lc(notificationSettingsScope, scopeNotificationSettings);
        }
    }

    public static void m2298p8(AbstractC5918j jVar, String[] strArr, String str, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.m14724e("Failed to fetch %d strings: %s, languagePackId: %s", Integer.valueOf(strArr.length), C4779t2.m25378z5(object), str);
            if (jVar != null) {
                jVar.mo1330a(null);
            }
        } else if (constructor == 1172082922 && jVar != null) {
            TdApi.LanguagePackString[] languagePackStringArr = ((TdApi.LanguagePackStrings) object).strings;
            HashMap hashMap = new HashMap(languagePackStringArr.length);
            for (TdApi.LanguagePackString languagePackString : languagePackStringArr) {
                if (languagePackString.value.getConstructor() != 1834792698) {
                    hashMap.put(languagePackString.key, languagePackString);
                }
            }
            jVar.mo1330a(hashMap);
        }
    }

    public void m2297p9(boolean z, String str, TdApi.Object object) {
        if (z) {
            C1379j0.m37290z0(C4403w.m27865j1(R.string.SignedOutAs, str), 0);
        }
        m2834H4(1);
    }

    public static boolean m2286q4(int i, int i2, boolean z) {
        return i < i2 && (i2 <= 1506 || z);
    }

    public static void m2282q8(AbstractC5918j jVar, Map map, Map map2) {
        if (jVar == null) {
            return;
        }
        if (map == null && map2 == null) {
            jVar.mo1330a(null);
        } else if (map == null) {
            jVar.mo1330a(map2);
        } else {
            if (map2 != null) {
                map.putAll(map2);
            }
            jVar.mo1330a(map);
        }
    }

    public void m2281q9(Runnable runnable, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
        } else if (constructor == -722616727) {
            mo1480c().m2485dd().post(runnable);
        }
    }

    public void m2266r8(String[] strArr, TdApi.LanguagePackInfo languagePackInfo, final AbstractC5918j jVar, final Map map) {
        HashSet hashSet = new HashSet(strArr.length);
        Collections.addAll(hashSet, strArr);
        if (map != null) {
            hashSet.removeAll(map.keySet());
        }
        if (!hashSet.isEmpty()) {
            String[] strArr2 = new String[hashSet.size()];
            hashSet.toArray(strArr2);
            m2523b6(languagePackInfo.baseLanguagePackId, strArr2, new AbstractC5918j() {
                @Override
                public final void mo1330a(Object obj) {
                    C10930q6.m2282q8(AbstractC5918j.this, map, (Map) obj);
                }
            });
        }
    }

    public void m2265r9(AbstractC5918j jVar, String str, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1816236758) {
            jVar.mo1330a((TdApi.StickerSet) object);
        } else if (constructor == -1679978726) {
            Log.m14724e("Failed to find animated emoji sticker set: %s, %s, isDebugInstance: %b", str, C4779t2.m25378z5(object), Boolean.valueOf(m2658S6()));
            jVar.mo1330a(null);
        }
    }

    public void m2250s8(AbstractC5919k kVar, TdApi.Chat chat) {
        if (chat == null || !C4779t2.m25506h3(m2787K3(f34960x2))) {
            kVar.mo3250a(0);
        } else {
            kVar.mo3250a(1);
        }
    }

    public static void m2249s9(final Runnable runnable, Client client) {
        client.m14783o(new TdApi.GetCountryCode(), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                runnable.run();
            }
        });
    }

    public void m2234t8(final AbstractC5919k kVar, TdApi.Chat chat) {
        if (chat == null || !C4779t2.m25506h3(m2787K3(f34959w2))) {
            m2602W2(f34960x2, new AbstractC5918j() {
                @Override
                public final void mo1330a(Object obj) {
                    C10930q6.this.m2250s8(kVar, (TdApi.Chat) obj);
                }
            });
        } else {
            kVar.mo3250a(2);
        }
    }

    public void m2233t9(long j, final Runnable runnable) {
        C7903b.C7904a.m14399a(j, this.f35017W, "Connection available. Performing network request to make sure it's still active.", new Object[0]);
        m2876Ea(new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                C10930q6.m2249s9(runnable, (Client) obj);
            }
        }, runnable);
    }

    public void m2218u8(final AbstractC5919k kVar, TdApi.Chat chat) {
        if (chat == null || !C4779t2.m25506h3(m2787K3(f34958v2))) {
            m2602W2(f34959w2, new AbstractC5918j() {
                @Override
                public final void mo1330a(Object obj) {
                    C10930q6.this.m2234t8(kVar, (TdApi.Chat) obj);
                }
            });
        } else {
            kVar.mo3250a(3);
        }
    }

    public void m2217u9(long j, Runnable runnable) {
        C7903b.C7904a.m14399a(j, this.f35017W, "Sync task finished.", new Object[0]);
        runnable.run();
    }

    public static int m2212ue(TdApi.Chat chat, int i, TdApi.ChatPosition chatPosition) {
        TdApi.ChatPosition[] chatPositionArr = chat.positions;
        TdApi.ChatPosition chatPosition2 = chatPositionArr[i];
        long j = chatPosition2.order;
        long j2 = chatPosition.order;
        int i2 = j != j2 ? 1 : 0;
        if (j2 == 0) {
            chat.positions = (TdApi.ChatPosition[]) C5062b.m24146z(chatPositionArr, i, new TdApi.ChatPosition[chatPositionArr.length - 1]);
        } else {
            if (!C7321e.m17007G(chatPosition2.source, chatPosition.source)) {
                i2 |= 2;
            }
            if (chatPosition2.isPinned != chatPosition.isPinned) {
                i2 |= 4;
            }
            if (i2 == 0) {
                return 0;
            }
            chat.positions[i] = chatPosition;
        }
        return i2;
    }

    public static void m2202v8(TdApi.Object object) {
        if (object.getConstructor() == -1679978726) {
            C1379j0.m37302t0(object);
        }
    }

    public void m2201v9(final Runnable runnable, boolean z, final long j) {
        if (runnable == null) {
            C7903b.C7904a.m14399a(j, this.f35017W, "Sync task finished, but there's no callback.", new Object[0]);
        } else if (z) {
            C7903b.C7904a.m14399a(j, this.f35017W, "Making sure havePendingNotifications is false.", new Object[0]);
            m2527b2(new Runnable() {
                @Override
                public final void run() {
                    C10930q6.this.m2217u9(j, runnable);
                }
            });
        } else {
            C7903b.C7904a.m14399a(j, this.f35017W, "Sync task finished.", new Object[0]);
            runnable.run();
        }
        m2834H4(3);
    }

    public void m2186w8(TdApi.Object object) {
        if (object instanceof TdApi.JsonValue) {
            TdApi.JsonValue jsonValue = (TdApi.JsonValue) object;
            m2891Db(jsonValue, C7318c.m17031f(jsonValue));
            return;
        }
        Log.m14724e("getApplicationConfig failed: %s", C4779t2.m25378z5(object));
    }

    public boolean m2170x8() {
        return m2648T1() != 0;
    }

    public void m2169x9(TdApi.LanguagePackInfo languagePackInfo, AbstractC5917i iVar, boolean z) {
        if (z) {
            m2810Ic(languagePackInfo.baseLanguagePackId, iVar);
        } else if (iVar != null) {
            iVar.mo1322a(false);
        }
    }

    public boolean m2154y8() {
        return m2648T1() != 0 && this.f35023Y == 0;
    }

    public static void m2153y9(String str, AbstractC5917i iVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        boolean z = true;
        if (constructor == -1679978726) {
            Log.m14724e("Unable to synchronize languagePackId %s: %s", str, C4779t2.m25378z5(object));
            z = str.equals(C4403w.m27906a0());
            if (!z) {
                C1379j0.m37302t0(object);
                z = false;
            }
        } else if (constructor != -722616727) {
            Log.unexpectedTdlibResponse(object, TdApi.SynchronizeLanguagePack.class, TdApi.C7866Ok.class, TdApi.Error.class);
            return;
        } else {
            Log.m14714v("%s language is successfully synchronized", str);
        }
        if (iVar != null) {
            iVar.mo1322a(z);
        }
    }

    public static void m2139z7(TdApi.Object object, TdApi.LanguagePackInfo languagePackInfo, AbstractC5917i iVar) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
            if (iVar != null) {
                iVar.mo1322a(false);
            }
        } else if (constructor == -722616727) {
            C4403w.m27831s(languagePackInfo);
            if (iVar != null) {
                iVar.mo1322a(true);
            }
        }
    }

    public boolean m2138z8() {
        int T1 = m2648T1();
        if (T1 != 1) {
            return T1 == 2 && this.f35043d2;
        }
        return true;
    }

    public void m2137z9(AbstractC5918j jVar, TdApi.Session session, TdApi.Object object) {
        if (jVar != null) {
            jVar.mo1330a(object.getConstructor() == -1679978726 ? (TdApi.Error) object : null);
        }
        if (object.getConstructor() == -722616727) {
            this.f35019W1 = null;
            this.f35056i0.m1975B(session);
        }
    }

    public C11131y6 m2949A1() {
        return this.f35014V.m4745U(this.f35017W);
    }

    public boolean m2948A2(TdApi.Chat chat) {
        TdApi.ChatMemberStatus K3;
        if (chat != null) {
            long j = chat.f25367id;
            if (!(j == 0 || (K3 = m2787K3(j)) == null)) {
                int constructor = K3.getConstructor();
                if (constructor == -160019714) {
                    return true;
                }
                if (constructor != 82243562) {
                    return false;
                }
                return ((TdApi.ChatMemberStatusAdministrator) K3).canInviteUsers;
            }
        }
        return false;
    }

    public C4587b m2947A3(TdApi.Chat chat, boolean z, float f, AbstractC5143t tVar) {
        return new C4587b(f, m2899D3(chat, z), tVar);
    }

    public C11134y8 m2946A4() {
        return this.f35065l0;
    }

    public CharSequence m2945A5(TdApi.Chat chat) {
        return m2614V5(chat, R.id.right_sendStickersAndGifs, R.string.ChatDisabledGifs, R.string.ChatRestrictedGifs, R.string.ChatRestrictedGifsUntil);
    }

    public void m2944A6() {
        m2896D6(6);
    }

    public void m2940Aa(long j, AbstractC9323v4<?> v4Var, final Runnable runnable) {
        synchronized (this.f35007S1) {
            ArrayList<AbstractC9323v4<?>> f = this.f35001Q1.m21505f(j);
            if (f == null) {
                f = new ArrayList<>();
                f.add(v4Var);
                this.f35001Q1.m21500k(j, f);
            } else {
                f.add(v4Var);
            }
            if (f.size() == 1) {
                this.f35004R1.m23252g(j, (int) (System.currentTimeMillis() / 1000));
                if (Log.isEnabled(8)) {
                    Log.m14716v(8, "openChat, chatId=%d", Long.valueOf(j));
                }
                m2270r4().m14783o(new TdApi.OpenChat(j), runnable != null ? new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        C10930q6.this.m2798J8(runnable, object);
                    }
                } : this.f34987M);
            } else if (runnable != null) {
                m2270r4().m14783o(new TdApi.SetAlarm(0.0d), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        runnable.run();
                    }
                });
            }
        }
        m2440ga().m3078t1(j);
    }

    public long m2939Ab(TdApi.Message message) {
        TdApi.MessageForwardInfo messageForwardInfo;
        if (message == null) {
            return 0L;
        }
        if (!m2443g7(message.chatId) || (messageForwardInfo = message.forwardInfo) == null || messageForwardInfo.origin.getConstructor() != -355174191) {
            return C7321e.m16984R0(message);
        }
        return ((TdApi.MessageForwardOriginUser) message.forwardInfo.origin).senderUserId;
    }

    public boolean m2938Ac() {
        return this.f35095v0;
    }

    public final void m2937Ad(TdApi.UpdateChatPermissions updateChatPermissions) {
        synchronized (this.f35030a0) {
            TdApi.Chat chat = this.f35034b0.get(Long.valueOf(updateChatPermissions.chatId));
            if (!C10859mj.m2997b(updateChatPermissions.chatId, chat, updateChatPermissions)) {
                chat.permissions = updateChatPermissions.permissions;
                this.f35056i0.m1829n1(updateChatPermissions);
            }
        }
    }

    public final void m2936Ae(final TdApi.UpdateServiceNotification updateServiceNotification) {
        final CharSequence t5 = C4779t2.m25420t5(C7321e.m16899w1(updateServiceNotification.content));
        if (t5 != null) {
            m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C10930q6.this.m2845G9(updateServiceNotification, t5);
                }
            });
        }
    }

    public int m2933B1() {
        return m2205v5(R.id.theme_color_notification);
    }

    public boolean m2932B2(TdApi.Chat chat) {
        return chat != null && (chat.unreadCount > 0 || chat.isMarkedAsUnread);
    }

    public C4587b.C4588a m2931B3(long j, TdApi.Chat chat, boolean z) {
        if (chat != null || j == 0) {
            return m2899D3(chat, z);
        }
        return new C4587b.C4588a(m2511c3(j));
    }

    public C10536ab m2930B4() {
        return this.f35014V;
    }

    public void m2929B5(AbstractC5918j<List<C4868i.C4876h>> jVar) {
        m2445g5(jVar, "#icons", C11161z3.f35790a, C10602d4.f33988a, C10927q3.f34952a);
    }

    public void m2928B6() {
        m2896D6(1);
    }

    public boolean m2924Ba(Client client) {
        boolean z;
        synchronized (this.f35026Z) {
            C10941k kVar = this.f35020X;
            z = kVar != null && kVar.f35156b == client;
        }
        return z;
    }

    public String m2923Bb(TdApi.MessageSender messageSender) {
        int constructor = messageSender.getConstructor();
        if (constructor == -336109341) {
            return m2480e2().m1694R2(((TdApi.MessageSenderUser) messageSender).userId);
        }
        if (constructor == -239660751) {
            return m2462f4(((TdApi.MessageSenderChat) messageSender).chatId);
        }
        throw new IllegalArgumentException(messageSender.toString());
    }

    public boolean m2922Bc(long j) {
        return m2906Cc(m2632U2(j));
    }

    public final void m2921Bd(TdApi.UpdateChatPhoto updateChatPhoto) {
        synchronized (this.f35030a0) {
            TdApi.Chat chat = this.f35034b0.get(Long.valueOf(updateChatPhoto.chatId));
            if (!C10859mj.m2997b(updateChatPhoto.chatId, chat, updateChatPhoto)) {
                chat.photo = updateChatPhoto.photo;
                this.f35056i0.m1825o1(updateChatPhoto);
            }
        }
    }

    public final void m2920Be(TdApi.StickerSet stickerSet) {
        this.f35041d0.m2078j(this, stickerSet);
        this.f35044e0.m2078j(this, stickerSet);
        this.f35056i0.m1936K2(stickerSet);
    }

    public int m2917C1(long j) {
        return m2205v5(C7316a.m17051j(j) ? R.id.theme_color_notificationSecure : R.id.theme_color_notification);
    }

    public boolean m2916C2(org.drinkless.p210td.libcore.telegram.TdApi.Chat r7) {
        throw new UnsupportedOperationException("Method not decompiled: p350yd.C10930q6.m2916C2(org.drinkless.td.libcore.telegram.TdApi$Chat):boolean");
    }

    public C4587b.C4588a m2915C3(long j, boolean z) {
        return m2931B3(j, m2632U2(j), z);
    }

    public long m2914C4(TimeUnit timeUnit) {
        return timeUnit.convert(m2898D4(), TimeUnit.MILLISECONDS);
    }

    public int m2913C5() {
        int i;
        synchronized (this.f35030a0) {
            i = this.f35087s1;
        }
        return i;
    }

    public void m2912C6() {
        m2896D6(4);
    }

    public void m2908Ca(final Runnable runnable) {
        if (!m2278qc()) {
            C7389v0.m16743D2(runnable);
        } else {
            m2549Za(new Runnable() {
                @Override
                public final void run() {
                    C10930q6.this.m2766L8(runnable);
                }
            });
        }
    }

    public long m2907Cb() {
        long j = this.f35069m1;
        return j != 0 ? j : C7316a.m17058c(777000L);
    }

    public boolean m2906Cc(TdApi.Chat chat) {
        if (chat == null || !m2816I6(chat)) {
            return false;
        }
        TdApi.User b4 = m2525b4(chat);
        return b4 == null || !b4.isSupport;
    }

    public final void m2905Cd(TdApi.UpdateChatPosition updateChatPosition) {
        synchronized (this.f35030a0) {
            TdApi.Chat chat = this.f35034b0.get(Long.valueOf(updateChatPosition.chatId));
            if (!C10859mj.m2997b(updateChatPosition.chatId, chat, updateChatPosition)) {
                int Nb = m2731Nb(chat, updateChatPosition.position);
                C10938h hVar = Nb != 0 ? new C10938h(m2351m3(updateChatPosition.position.list), chat, new C10937g(updateChatPosition.position, Nb)) : null;
                if (hVar != null) {
                    this.f35056i0.m1813r1(updateChatPosition, hVar);
                }
            }
        }
    }

    public final void m2904Ce(TdApi.UpdateSuggestedActions updateSuggestedActions) {
        TdApi.SuggestedAction[] suggestedActionArr;
        synchronized (this.f35030a0) {
            for (TdApi.SuggestedAction suggestedAction : updateSuggestedActions.removedActions) {
                for (int size = this.f35064k2.size() - 1; size >= 0; size--) {
                    if (this.f35064k2.get(size).getConstructor() == suggestedAction.getConstructor()) {
                        this.f35064k2.remove(size);
                    }
                }
            }
            Collections.addAll(this.f35064k2, updateSuggestedActions.addedActions);
        }
        m2781K9().m1932L2(updateSuggestedActions);
    }

    public String m2901D1() {
        return this.f35014V.m4745U(this.f35017W).m1456t();
    }

    public boolean m2900D2(long j) {
        return m2884E2(m2632U2(j));
    }

    public gd.C4587b.C4588a m2899D3(org.drinkless.p210td.libcore.telegram.TdApi.Chat r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: p350yd.C10930q6.m2899D3(org.drinkless.td.libcore.telegram.TdApi$Chat, boolean):gd.b$a");
    }

    public long m2898D4() {
        synchronized (this.f35030a0) {
            if (this.f35015V0 != 0) {
                return TimeUnit.SECONDS.toMillis(this.f35015V0) + (SystemClock.elapsedRealtime() - this.f35018W0);
            }
            return System.currentTimeMillis();
        }
    }

    public C10562b9 m2897D5() {
        return m2189w5(C7317b.f23224a);
    }

    public final void m2896D6(int i) {
        boolean z;
        synchronized (this.f35026Z) {
            int incrementAndGet = this.f35104z1.incrementAndGet();
            z = incrementAndGet == 1;
            Log.m14716v((int) Log.TAG_ACCOUNTS, "accountId:%d, referenceCount:%d, type:%d", Integer.valueOf(this.f35017W), Integer.valueOf(incrementAndGet), Integer.valueOf(i));
            if (i == 0) {
                m2949A1().m1496O();
            }
            m2487db();
        }
        if (z) {
            m2728Ne();
            if (i == 0) {
                this.f35014V.m4693h0(m2949A1());
            }
        }
    }

    public final <T extends TdApi.Object> void m2892Da(final long j, final long j2, final T t, TdApi.Function function, final Map<String, T> map) {
        final String str = j + "_" + j2;
        synchronized (map) {
            try {
                map.put(str, t);
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
        this.f35056i0.m1836l2(j, j2);
        m2270r4().m14783o(function, new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C10930q6.this.m2734N8(map, str, t, j, j2, object);
            }
        });
    }

    public final void m2891Db(TdApi.JsonValue jsonValue, String str) {
        String str2 = this.f35025Y1;
        if (str2 == null || !str2.equals(str)) {
            this.f35025Y1 = str;
            m2294pc().m4112k0(str);
            if (jsonValue != null) {
                m2828Ha(jsonValue);
            }
        }
    }

    public String m2890Dc() {
        return this.f35042d1;
    }

    public final void m2888De(TdApi.UpdateSupergroup updateSupergroup) {
        TdApi.Chat chat;
        synchronized (this.f35030a0) {
            chat = this.f35034b0.get(Long.valueOf(C7316a.m17059b(updateSupergroup.supergroup.f25425id)));
            if (chat != null) {
                TdApi.ChatType chatType = chat.type;
                boolean z = ((TdApi.ChatTypeSupergroup) chatType).isChannel;
                boolean z2 = updateSupergroup.supergroup.isChannel;
                if (z != z2) {
                    ((TdApi.ChatTypeSupergroup) chatType).isChannel = z2;
                    long j = ((TdApi.ChatTypeSupergroup) chatType).supergroupId;
                    if (z2) {
                        this.f35083r0.add(Long.valueOf(j));
                    } else {
                        this.f35083r0.remove(Long.valueOf(j));
                    }
                }
            }
        }
        this.f35053h0.m1608p1(updateSupergroup, chat);
    }

    public String m2885E1() {
        return this.f35014V.m4745U(this.f35017W).m1455u();
    }

    public boolean m2884E2(TdApi.Chat chat) {
        return chat != null && chat.canBeReported;
    }

    public boolean m2883E3(long j) {
        TdApi.Supergroup h2;
        if (j == 0) {
            return false;
        }
        long p = C7316a.m17045p(j);
        if (p == 0 || (h2 = m2480e2().m1638h2(p)) == null) {
            return false;
        }
        return !C5070i.m24061i(h2.username) || h2.hasLocation;
    }

    public void m2882E4() {
        m2834H4(6);
    }

    public CharSequence m2881E5(TdApi.Chat chat) {
        return m2614V5(chat, R.id.right_sendMedia, R.string.ChatDisabledMedia, R.string.ChatRestrictedMedia, R.string.ChatRestrictedMediaUntil);
    }

    public void m2880E6() {
        m2896D6(0);
    }

    public final void m2876Ea(AbstractC5918j<Client> jVar, Runnable runnable) {
        synchronized (this.f35026Z) {
            if (!this.f35102y1) {
                C10941k u4 = m2222u4();
                Client client = u4 != null ? u4.f35156b : null;
                if (client != null) {
                    jVar.mo1330a(client);
                } else if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    public void m2875Eb(String str, String str2) {
        this.f34989M1 = str;
        this.f34992N1 = str2;
    }

    public TdApi.LanguagePackInfo m2874Ec() {
        return this.f35045e1;
    }

    public final void m2873Ed(TdApi.UpdateChatReadInbox updateChatReadInbox) {
        synchronized (this.f35030a0) {
            TdApi.Chat chat = this.f35034b0.get(Long.valueOf(updateChatReadInbox.chatId));
            if (!C10859mj.m2997b(updateChatReadInbox.chatId, chat, updateChatReadInbox)) {
                chat.lastReadInboxMessageId = updateChatReadInbox.lastReadInboxMessageId;
                boolean z = true;
                boolean z2 = chat.unreadCount > 0;
                int i = updateChatReadInbox.unreadCount;
                if (z2 == (i > 0)) {
                    z = false;
                }
                chat.unreadCount = i;
                this.f35056i0.m1805t1(updateChatReadInbox, z, chat, m2335n3(chat.positions));
            }
        }
    }

    public final void m2872Ee(TdApi.UpdateTermsOfService updateTermsOfService) {
        m2485dd().sendMessage(m2485dd().obtainMessage(9, updateTermsOfService));
    }

    public int m2869F1() {
        return m2205v5(R.id.theme_color_notificationPlayer);
    }

    public boolean m2868F2(TdApi.Message message) {
        return message != null && !m2443g7(message.chatId) && !message.isOutgoing && message.sendingState == null && m2900D2(message.chatId);
    }

    public boolean m2867F3(TdApi.Chat chat) {
        return !C5070i.m24061i(m2835H3(chat));
    }

    public void m2866F4() {
        m2834H4(1);
    }

    public void m2865F5(final long j, final long j2, final AbstractC5918j<TdApi.Message> jVar) {
        m2270r4().m14783o(new TdApi.GetMessageLocally(j, j2), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C10930q6.this.m2426h8(jVar, j, j2, object);
            }
        });
    }

    public void m2864F6() {
        m2238t4().m2110m();
    }

    public int m2860Fa() {
        return this.f34971E0;
    }

    public void m2859Fb(boolean z) {
        if (this.f35009T0 != z) {
            this.f35009T0 = z;
            m2270r4().m14783o(new TdApi.SetOption("archive_and_mute_new_chats_from_unknown_users", new TdApi.OptionValueBoolean(z)), this.f34987M);
        }
    }

    public int m2858Fc() {
        return this.f35092u0;
    }

    public final void m2857Fd(TdApi.UpdateChatReadOutbox updateChatReadOutbox) {
        synchronized (this.f35030a0) {
            TdApi.Chat chat = this.f35034b0.get(Long.valueOf(updateChatReadOutbox.chatId));
            if (!C10859mj.m2997b(updateChatReadOutbox.chatId, chat, updateChatReadOutbox)) {
                chat.lastReadOutboxMessageId = updateChatReadOutbox.lastReadOutboxMessageId;
                this.f35056i0.m1801u1(updateChatReadOutbox);
            }
        }
    }

    public final void m2856Fe(TdApi.UpdateTrendingStickerSets updateTrendingStickerSets) {
        int G;
        synchronized (this.f35030a0) {
            G = C4779t2.m25689G(updateTrendingStickerSets.stickerSets);
            this.f35098w1 = G;
        }
        this.f35056i0.m1920O2(updateTrendingStickerSets, G);
    }

    public String m2853G1() {
        return this.f35014V.m4745U(this.f35017W).m1453w();
    }

    public boolean m2852G2(long j) {
        TdApi.ChatMemberStatus K3 = m2787K3(j);
        if (K3 == null) {
            return false;
        }
        int constructor = K3.getConstructor();
        return constructor == -160019714 || (constructor == 82243562 && ((TdApi.ChatMemberStatusAdministrator) K3).canRestrictMembers);
    }

    public String m2851G3(long j) {
        return m2835H3(m2771L3(j));
    }

    public void m2850G4() {
        m2834H4(4);
    }

    public void m2849G5(TdApi.Message message, boolean z, boolean z2, final AbstractC5918j<C10943m> jVar) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final C10931a aVar = (message.sendingState != null || C7316a.m17049l(message.chatId) || C7319d.m17021i(message.f25406id) == 0 || z2) ? null : new C10931a(atomicBoolean, message, z, jVar);
        m2270r4().m14783o(new TdApi.GetMessageLink(message.chatId, message.f25406id, 0, z, z2), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C10930q6.this.m2394j8(atomicBoolean, aVar, jVar, object);
            }
        });
        if (aVar != null) {
            m2485dd().postDelayed(aVar, 500L);
        }
    }

    public boolean m2848G6() {
        TdApi.AuthorizationState authorizationState = this.f34982J1;
        return authorizationState != null && authorizationState.getConstructor() == -1834871737;
    }

    public int m2844Ga() {
        return this.f34969D0;
    }

    public final void m2843Gb(TdApi.Chat chat, final String str) {
        if (chat != null) {
            synchronized (this.f35030a0) {
                if (!C5070i.m24067c(chat.clientData, str)) {
                    chat.clientData = str;
                    final long j = chat.f25367id;
                    m2270r4().m14783o(new TdApi.SetChatClientData(j, str), new Client.AbstractC7865g() {
                        @Override
                        public final void mo255t2(TdApi.Object object) {
                            C10930q6.this.m2489d9(j, str, object);
                        }
                    });
                }
            }
        }
    }

    public void m2842Gc(final long j, final Runnable runnable, final boolean z, boolean z2) {
        int i = this.f35017W;
        Object[] objArr = new Object[5];
        boolean z3 = false;
        objArr[0] = Boolean.valueOf(z);
        objArr[1] = Boolean.valueOf(z2);
        if (runnable != null) {
            z3 = true;
        }
        objArr[2] = Boolean.valueOf(z3);
        objArr[3] = Integer.valueOf(this.f35023Y);
        objArr[4] = Integer.valueOf(m2648T1());
        C7903b.C7904a.m14399a(j, i, "Performing sync needNotification: %b, needNetworkRequest: %b, hasAfter: %b. Awaiting connection. Connection state: %d, status: %d", objArr);
        m2896D6(3);
        final Runnable s3Var = new Runnable() {
            @Override
            public final void run() {
                C10930q6.this.m2201v9(runnable, z, j);
            }
        };
        if (z2) {
            m2588X1(new Runnable() {
                @Override
                public final void run() {
                    C10930q6.this.m2233t9(j, s3Var);
                }
            });
        } else {
            m2588X1(s3Var);
        }
    }

    public final void m2841Gd(TdApi.UpdateChatReplyMarkup updateChatReplyMarkup) {
        synchronized (this.f35030a0) {
            TdApi.Chat chat = this.f35034b0.get(Long.valueOf(updateChatReplyMarkup.chatId));
            if (!C10859mj.m2997b(updateChatReplyMarkup.chatId, chat, updateChatReplyMarkup)) {
                chat.replyMarkupMessageId = updateChatReplyMarkup.replyMarkupMessageId;
                this.f35056i0.m1789x1(updateChatReplyMarkup);
            }
        }
    }

    public final void m2840Ge(TdApi.UpdateUnreadChatCount updateUnreadChatCount) {
        if (m2326nc(updateUnreadChatCount.chatList, updateUnreadChatCount.totalCount, updateUnreadChatCount.unreadCount, updateUnreadChatCount.unreadUnmutedCount, updateUnreadChatCount.markedAsUnreadCount, updateUnreadChatCount.markedAsUnreadUnmutedCount) && this.f35075o1.m1326d(this)) {
            HandlerC10770jj dd = m2485dd();
            HandlerC10770jj dd2 = m2485dd();
            int b = this.f35075o1.m1328b();
            boolean c = this.f35075o1.m1327c();
            dd.sendMessage(dd2.obtainMessage(3, b, c ? 1 : 0, updateUnreadChatCount.chatList));
        }
    }

    public String m2837H1(int i) {
        String G1 = m2853G1();
        return i != 0 ? C4403w.m27865j1(R.string.format_accountAndCategory, G1, C4403w.m27958N0(i)) : G1;
    }

    public boolean m2836H2(long j) {
        return C7316a.m17052i(j) && !m2443g7(j) && !m2832H6(j);
    }

    public String m2835H3(TdApi.Chat chat) {
        TdApi.User b4;
        if (chat == null || !C4868i.m24726c2().m24819P2()) {
            return null;
        }
        int constructor = chat.type.getConstructor();
        if (constructor == -1472570774) {
            TdApi.Supergroup h2 = m2480e2().m1638h2(C7316a.m17045p(chat.f25367id));
            if (h2 == null || C5070i.m24061i(h2.restrictionReason)) {
                return null;
            }
            return h2.restrictionReason;
        } else if ((constructor == 862366513 || constructor == 1579049844) && (b4 = m2525b4(chat)) != null && !C5070i.m24061i(b4.restrictionReason)) {
            return b4.restrictionReason;
        } else {
            return null;
        }
    }

    public final void m2834H4(int i) {
        synchronized (this.f35026Z) {
            int decrementAndGet = this.f35104z1.decrementAndGet();
            if (decrementAndGet >= 0) {
                Log.m14716v((int) Log.TAG_ACCOUNTS, "accountId:%d, referenceCount:%d, type:%d", Integer.valueOf(this.f35017W), Integer.valueOf(decrementAndGet), Integer.valueOf(i));
                m2487db();
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("type == " + i);
                Tracer.m14772h(illegalStateException);
                throw illegalStateException;
            }
        }
    }

    public TdApi.Message m2833H5(long j, long j2) {
        if (m2140z6()) {
            return null;
        }
        TdApi.Object s4 = m2254s4(new TdApi.GetMessageLocally(j, j2), 0L);
        if (s4 instanceof TdApi.Message) {
            return (TdApi.Message) s4;
        }
        if (s4 instanceof TdApi.Error) {
            Log.m14719i("Could not get message: %s, chatId:%s, messageId:%s", C4779t2.m25378z5(s4), Long.valueOf(j), Long.valueOf(j2));
        }
        return null;
    }

    public boolean m2832H6(long j) {
        return m2480e2().m1567z2(m2494d4(j));
    }

    public final void m2828Ha(TdApi.JsonValue jsonValue) {
        TdApi.JsonObjectMember[] jsonObjectMemberArr;
        char c;
        TdApi.JsonObjectMember[] jsonObjectMemberArr2;
        char c2;
        if (jsonValue instanceof TdApi.JsonValueObject) {
            for (TdApi.JsonObjectMember jsonObjectMember : ((TdApi.JsonValueObject) jsonValue).members) {
                if (!C5070i.m24061i(jsonObjectMember.key)) {
                    String str = jsonObjectMember.key;
                    str.hashCode();
                    boolean z = true;
                    switch (str.hashCode()) {
                        case -1919055391:
                            if (str.equals("qr_login_code")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1688620344:
                            if (str.equals("dialog_filters_tooltip")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1683918311:
                            if (str.equals("qr_login_camera")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -594881204:
                            if (str.equals("stickers_emoji_cache_time")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -76561797:
                            if (str.equals("youtube_pip")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -24016028:
                            if (str.equals("emojies_animated_zoom")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3556498:
                            if (str.equals("test")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case 169095108:
                            if (str.equals("stickers_emoji_suggest_only_api")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case 676199595:
                            if (str.equals("groupcall_video_participants_max")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1322701672:
                            if (str.equals("round_video_encoding")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1483286962:
                            if (str.equals("rtc_servers")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1850325103:
                            if (str.equals("emojies_sounds")) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2136829446:
                            if (str.equals("dialog_filters_enabled")) {
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            TdApi.JsonValue jsonValue2 = jsonObjectMember.value;
                            if (!(jsonValue2 instanceof TdApi.JsonValueString)) {
                                break;
                            } else {
                                this.f34983K0 = ((TdApi.JsonValueString) jsonValue2).value;
                                continue;
                            }
                        case 1:
                            TdApi.JsonValue jsonValue3 = jsonObjectMember.value;
                            if (jsonValue3 instanceof TdApi.JsonValueBoolean) {
                                this.f34979I0 = ((TdApi.JsonValueBoolean) jsonValue3).value;
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            TdApi.JsonValue jsonValue4 = jsonObjectMember.value;
                            if (jsonValue4 instanceof TdApi.JsonValueBoolean) {
                                this.f34977H0 = ((TdApi.JsonValueBoolean) jsonValue4).value;
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
                                z = false;
                            }
                            this.f34975G0 = z;
                            continue;
                        case 5:
                            TdApi.JsonValue jsonValue6 = jsonObjectMember.value;
                            if (jsonValue6 instanceof TdApi.JsonValueNumber) {
                                this.f34973F0 = Math.max(0.75d, C5069h.m24091b(((TdApi.JsonValueNumber) jsonValue6).value));
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            TdApi.JsonValue jsonValue7 = jsonObjectMember.value;
                            if (jsonValue7 instanceof TdApi.JsonValueBoolean) {
                                this.f35095v0 = ((TdApi.JsonValueBoolean) jsonValue7).value;
                                break;
                            } else {
                                continue;
                            }
                        case '\b':
                            TdApi.JsonValue jsonValue8 = jsonObjectMember.value;
                            if (jsonValue8 instanceof TdApi.JsonValueNumber) {
                                this.f35097w0 = (int) ((TdApi.JsonValueNumber) jsonValue8).value;
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
                                        long j = (long) ((TdApi.JsonValueNumber) jsonValue10).value;
                                        String str2 = jsonObjectMember2.key;
                                        str2.hashCode();
                                        switch (str2.hashCode()) {
                                            case -233204595:
                                                if (str2.equals("diameter")) {
                                                    c2 = 0;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 258902020:
                                                if (str2.equals("audio_bitrate")) {
                                                    c2 = 1;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 408072700:
                                                if (str2.equals("max_size")) {
                                                    c2 = 2;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 1924434857:
                                                if (str2.equals("video_bitrate")) {
                                                    c2 = 3;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            default:
                                                c2 = 65535;
                                                break;
                                        }
                                        switch (c2) {
                                            case 0:
                                                this.f34963A0 = j;
                                                break;
                                            case 1:
                                                this.f35101y0 = j;
                                                break;
                                            case 2:
                                                this.f35103z0 = j;
                                                break;
                                            case 3:
                                                this.f35099x0 = j;
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
                                            arrayList.add(new C10945o((TdApi.JsonValueObject) jsonValue12));
                                        } catch (IllegalArgumentException unused) {
                                        }
                                    }
                                }
                                this.f35012U0 = (C10945o[]) arrayList.toArray(new C10945o[0]);
                                break;
                            } else {
                                continue;
                            }
                        case '\f':
                            TdApi.JsonValue jsonValue13 = jsonObjectMember.value;
                            if (jsonValue13 instanceof TdApi.JsonValueBoolean) {
                                this.f34981J0 = ((TdApi.JsonValueBoolean) jsonValue13).value;
                                break;
                            } else {
                                continue;
                            }
                        default:
                            if (Log.isEnabled(Log.TAG_TDLIB_OPTIONS)) {
                                Log.m14721i((int) Log.TAG_TDLIB_OPTIONS, "appConfig: %s -> %s", jsonObjectMember.key, jsonObjectMember.value);
                                break;
                            } else {
                                continue;
                            }
                    }
                }
            }
        }
    }

    public void m2827Hb(final long j, final TdApi.MessageSender messageSender, final TdApi.ChatMemberStatus chatMemberStatus, int i, final TdApi.ChatMemberStatus chatMemberStatus2, final AbstractC10939i iVar) {
        if (!C7316a.m17054g(j) || !C4779t2.m25379z4(chatMemberStatus)) {
            m2795Jb(j, messageSender, chatMemberStatus, i, chatMemberStatus2, iVar);
            return;
        }
        final Runnable k3Var = new Runnable() {
            @Override
            public final void run() {
                C10930q6.this.m2457f9(j, messageSender, chatMemberStatus, chatMemberStatus2, iVar);
            }
        };
        if (i <= 0 || messageSender.getConstructor() != -336109341 || !C4779t2.m25499i3(chatMemberStatus, false) || C4779t2.m25499i3(chatMemberStatus2, false)) {
            k3Var.run();
        } else {
            m2270r4().m14783o(new TdApi.AddChatMember(j, ((TdApi.MessageSenderUser) messageSender).userId, i), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    C10930q6.this.m2425h9(k3Var, iVar, object);
                }
            });
        }
    }

    public TdApi.Chat m2826Hc(TdApi.Chat chat) {
        return this.f35047f0.contains(Long.valueOf(chat.f25367id)) ? chat : m2739N3(chat.f25367id);
    }

    public final void m2825Hd(TdApi.UpdateChatTheme updateChatTheme) {
        synchronized (this.f35030a0) {
            TdApi.Chat chat = this.f35034b0.get(Long.valueOf(updateChatTheme.chatId));
            if (!C10859mj.m2997b(updateChatTheme.chatId, chat, updateChatTheme)) {
                chat.themeName = updateChatTheme.themeName;
                this.f35056i0.m1977A1(updateChatTheme, chat, m2335n3(chat.positions));
            }
        }
    }

    public final void m2824He(TdApi.UpdateUnreadMessageCount updateUnreadMessageCount) {
        if (m2310oc(updateUnreadMessageCount.chatList, updateUnreadMessageCount.unreadCount, updateUnreadMessageCount.unreadUnmutedCount) && this.f35075o1.m1326d(this)) {
            HandlerC10770jj dd = m2485dd();
            HandlerC10770jj dd2 = m2485dd();
            int b = this.f35075o1.m1328b();
            boolean c = this.f35075o1.m1327c();
            dd.sendMessage(dd2.obtainMessage(3, b, c ? 1 : 0, updateUnreadMessageCount.chatList));
        }
    }

    public boolean m2820I2(TdApi.Chat chat) {
        return m2629U5(chat, R.id.right_sendMedia) == null;
    }

    public TdApi.ChatNotificationSettings m2819I3(long j) {
        TdApi.Chat U2 = m2632U2(j);
        if (U2 != null) {
            return U2.notificationSettings;
        }
        return null;
    }

    public void m2818I4() {
        m2834H4(0);
    }

    public CharSequence m2817I5(TdApi.Chat chat) {
        return m2614V5(chat, R.id.right_sendMessages, R.string.ChatDisabledMessages, R.string.ChatRestrictedMessages, R.string.ChatRestrictedMessagesUntil);
    }

    public boolean m2816I6(TdApi.Chat chat) {
        return m2480e2().m1567z2(m2478e4(chat));
    }

    public void m2812Ia(final long j, String str, final Runnable runnable) {
        int i = this.f35017W;
        boolean z = true;
        Object[] objArr = new Object[1];
        if (runnable == null) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        C7903b.C7904a.m14399a(j, i, "Started processing push notification, hasAfter:%b", objArr);
        m2912C6();
        m2270r4().m14783o(new TdApi.ProcessPushNotification(str), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C10930q6.this.m2626U8(j, runnable, object);
            }
        });
    }

    public void m2811Ib(long j, TdApi.MessageSender messageSender, TdApi.ChatMemberStatus chatMemberStatus, TdApi.ChatMemberStatus chatMemberStatus2, AbstractC10939i iVar) {
        m2827Hb(j, messageSender, chatMemberStatus, 0, chatMemberStatus2, iVar);
    }

    public final void m2810Ic(final String str, final AbstractC5917i iVar) {
        m2270r4().m14783o(new TdApi.SynchronizeLanguagePack(str), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C10930q6.m2153y9(str, iVar, object);
            }
        });
    }

    public final void m2809Id(TdApi.UpdateChatThemes updateChatThemes) {
        TdApi.ChatTheme[] chatThemeArr;
        synchronized (this.f35030a0) {
            this.f35067l2.clear();
            for (TdApi.ChatTheme chatTheme : updateChatThemes.chatThemes) {
                this.f35067l2.put(chatTheme.name, chatTheme);
            }
        }
    }

    public final void m2808Ie(TdApi.UpdateUsersNearby updateUsersNearby) {
        this.f35056i0.m1916P2(updateUsersNearby);
    }

    public final void m2805J1(long j, long j2, boolean z) {
        int size;
        synchronized (this.f35052g2) {
            int size2 = this.f35052g2.size();
            String str = j + "_" + j2;
            if (z) {
                this.f35052g2.add(str);
            } else {
                this.f35052g2.remove(str);
            }
            size = this.f35052g2.size() - size2;
        }
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                m2896D6(8);
            }
        } else if (size < 0) {
            for (int i2 = size - 1; i2 >= 0; i2--) {
                m2834H4(8);
            }
        }
    }

    public boolean m2804J2(TdApi.Chat chat) {
        return m2629U5(chat, R.id.right_sendStickersAndGifs) == null;
    }

    public TdApi.ChatSource m2803J3(TdApi.ChatList chatList, long j) {
        TdApi.ChatPosition a;
        if (j == 0 || (a = C7317b.m17043a(m2632U2(j), chatList)) == null) {
            return null;
        }
        return a.source;
    }

    public void m2802J4(final AbstractC5917i iVar) {
        Log.m14719i("Clearing data... accountId:%d", Integer.valueOf(this.f35017W));
        final long uptimeMillis = SystemClock.uptimeMillis();
        m2270r4().m14783o(new TdApi.OptimizeStorage(0L, 0, 0, 0, new TdApi.FileType[]{new TdApi.FileTypeAnimation(), new TdApi.FileTypeAudio(), new TdApi.FileTypeDocument(), new TdApi.FileTypePhoto(), new TdApi.FileTypeProfilePhoto(), new TdApi.FileTypeSecret(), new TdApi.FileTypeSecretThumbnail(), new TdApi.FileTypeSecure(), new TdApi.FileTypeSticker(), new TdApi.FileTypeThumbnail(), new TdApi.FileTypeUnknown(), new TdApi.FileTypeVideo(), new TdApi.FileTypeVideoNote(), new TdApi.FileTypeVoiceNote(), new TdApi.FileTypeWallpaper()}, null, null, false, 0), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C10930q6.this.m2672R7(uptimeMillis, iVar, object);
            }
        });
    }

    public final long m2801J5() {
        if (C4868i.m24726c2().m24720d0()) {
            return TimeUnit.SECONDS.toMillis(1L);
        }
        if (!m2930B4().m4687i1()) {
            return TimeUnit.SECONDS.toMillis(5L);
        }
        if (this.f35014V.m4824A0() == 1) {
            return TimeUnit.MINUTES.toMillis(15L);
        }
        C10536ab abVar = this.f35014V;
        int i = this.f35017W;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int y0 = abVar.m4630y0(i, timeUnit.toMillis(15L));
        if (y0 == -1) {
            return TimeUnit.SECONDS.toMillis(5L);
        }
        if (y0 < 3) {
            return timeUnit.toMillis(15L);
        }
        if (y0 < 5) {
            return timeUnit.toMillis(7L);
        }
        if (y0 < 10) {
            return timeUnit.toMillis(2L);
        }
        return TimeUnit.SECONDS.toMillis(5L);
    }

    public boolean m2800J6(long j) {
        return j == C7316a.m17058c(93372553L) || "BotFather".equals(m2462f4(j));
    }

    public String m2797J9() {
        return this.f35037c.systemLanguageCode;
    }

    public final void m2796Ja(C10941k kVar, TdApi.Update update) {
        switch (update.getConstructor()) {
            case TdApi.UpdateChatUnreadMentionCount.CONSTRUCTOR:
                m2777Kd((TdApi.UpdateChatUnreadMentionCount) update);
                return;
            case TdApi.UpdateChatUnreadReactionCount.CONSTRUCTOR:
                m2761Ld((TdApi.UpdateChatUnreadReactionCount) update);
                return;
            case TdApi.UpdateNotificationGroup.CONSTRUCTOR:
                m2152ya((TdApi.UpdateNotificationGroup) update);
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
                m2213ud((TdApi.UpdateChatIsBlocked) update);
                return;
            case TdApi.UpdateNotification.CONSTRUCTOR:
                m2168xa((TdApi.UpdateNotification) update);
                return;
            case TdApi.UpdateFileGenerationStop.CONSTRUCTOR:
                m2591Wd((TdApi.UpdateFileGenerationStop) update);
                return;
            case TdApi.UpdateChatAction.CONSTRUCTOR:
                m2745Md((TdApi.UpdateChatAction) update);
                return;
            case TdApi.UpdateSecretChat.CONSTRUCTOR:
                this.f35053h0.m1612o1((TdApi.UpdateSecretChat) update);
                return;
            case TdApi.UpdateChatPermissions.CONSTRUCTOR:
                m2937Ad((TdApi.UpdateChatPermissions) update);
                return;
            case TdApi.UpdateChatThemes.CONSTRUCTOR:
                m2809Id((TdApi.UpdateChatThemes) update);
                return;
            case TdApi.UpdateAnimatedEmojiMessageClicked.CONSTRUCTOR:
                m2421hd((TdApi.UpdateAnimatedEmojiMessageClicked) update);
                return;
            case TdApi.UpdateMessageContentOpened.CONSTRUCTOR:
                m2452fe((TdApi.UpdateMessageContentOpened) update);
                return;
            case TdApi.UpdateUsersNearby.CONSTRUCTOR:
                m2808Ie((TdApi.UpdateUsersNearby) update);
                return;
            case TdApi.UpdateMessageInteractionInfo.CONSTRUCTOR:
                m2420he((TdApi.UpdateMessageInteractionInfo) update);
                return;
            case TdApi.UpdateMessageLiveLocationViewed.CONSTRUCTOR:
                m2484de((TdApi.UpdateMessageLiveLocationViewed) update);
                return;
            case TdApi.UpdateActiveNotifications.CONSTRUCTOR:
                m2216ua((TdApi.UpdateActiveNotifications) update);
                return;
            case TdApi.UpdateTermsOfService.CONSTRUCTOR:
                m2872Ee((TdApi.UpdateTermsOfService) update);
                return;
            case TdApi.UpdateScopeNotificationSettings.CONSTRUCTOR:
                m2244se((TdApi.UpdateScopeNotificationSettings) update);
                return;
            case TdApi.UpdateAnimationSearchParameters.CONSTRUCTOR:
                m2405id((TdApi.UpdateAnimationSearchParameters) update);
                return;
            case TdApi.UpdateReactions.CONSTRUCTOR:
                m2164xe((TdApi.UpdateReactions) update);
                return;
            case TdApi.UpdateDiceEmojis.CONSTRUCTOR:
                m2697Pd(((TdApi.UpdateDiceEmojis) update).emojis);
                return;
            case TdApi.UpdateLanguagePackStrings.CONSTRUCTOR:
                m2515be((TdApi.UpdateLanguagePackStrings) update);
                return;
            case TdApi.UpdateMessageSendFailed.CONSTRUCTOR:
                m2372ke((TdApi.UpdateMessageSendFailed) update);
                return;
            case TdApi.UpdateBasicGroup.CONSTRUCTOR:
                this.f35053h0.m1639h1((TdApi.UpdateBasicGroup) update);
                return;
            case TdApi.UpdateChatFilters.CONSTRUCTOR:
                m2261rd((TdApi.UpdateChatFilters) update);
                return;
            case TdApi.UpdateChatLastMessage.CONSTRUCTOR:
                m2181wd((TdApi.UpdateChatLastMessage) update);
                return;
            case TdApi.UpdateUserPrivacySettingRules.CONSTRUCTOR:
                m2180we((TdApi.UpdateUserPrivacySettingRules) update);
                return;
            case TdApi.UpdateChatNotificationSettings.CONSTRUCTOR:
                m2260re((TdApi.UpdateChatNotificationSettings) update);
                return;
            case TdApi.UpdateGroupCallParticipant.CONSTRUCTOR:
                m2546Zd((TdApi.UpdateGroupCallParticipant) update);
                return;
            case TdApi.UpdateChatReadInbox.CONSTRUCTOR:
                m2873Ed((TdApi.UpdateChatReadInbox) update);
                return;
            case TdApi.UpdateChatActionBar.CONSTRUCTOR:
                m2341md((TdApi.UpdateChatActionBar) update);
                return;
            case TdApi.UpdateChatMessageTtl.CONSTRUCTOR:
                m2165xd((TdApi.UpdateChatMessageTtl) update);
                return;
            case TdApi.UpdateNewMessage.CONSTRUCTOR:
                m2292pe((TdApi.UpdateNewMessage) update, true);
                return;
            case TdApi.UpdateMessageEdited.CONSTRUCTOR:
                m2436ge((TdApi.UpdateMessageEdited) update);
                return;
            case TdApi.UpdateFileDownloads.CONSTRUCTOR:
                m2621Ud((TdApi.UpdateFileDownloads) update);
                return;
            case TdApi.UpdateChatPhoto.CONSTRUCTOR:
                m2921Bd((TdApi.UpdateChatPhoto) update);
                return;
            case TdApi.UpdateMessageMentionRead.CONSTRUCTOR:
                m2388je((TdApi.UpdateMessageMentionRead) update);
                return;
            case TdApi.UpdateChatTitle.CONSTRUCTOR:
                m2793Jd((TdApi.UpdateChatTitle) update);
                return;
            case TdApi.UpdateSupergroup.CONSTRUCTOR:
                m2888De((TdApi.UpdateSupergroup) update);
                return;
            case TdApi.UpdateUserFullInfo.CONSTRUCTOR:
                this.f35053h0.m1596s1((TdApi.UpdateUserFullInfo) update);
                return;
            case TdApi.UpdateChatPosition.CONSTRUCTOR:
                m2905Cd((TdApi.UpdateChatPosition) update);
                return;
            case TdApi.UpdateSavedAnimations.CONSTRUCTOR:
                m2132ze((TdApi.UpdateSavedAnimations) update);
                return;
            case TdApi.UpdateUnreadMessageCount.CONSTRUCTOR:
                m2824He((TdApi.UpdateUnreadMessageCount) update);
                return;
            case TdApi.UpdateFile.CONSTRUCTOR:
                TdApi.UpdateFile updateFile = (TdApi.UpdateFile) update;
                if (Log.isEnabled(Log.TAG_TDLIB_FILES)) {
                    Log.m14721i((int) Log.TAG_TDLIB_FILES, "updateFile id=%d size=%d expectedSize=%d remote=%s local=%s", Integer.valueOf(updateFile.file.f25373id), Integer.valueOf(updateFile.file.size), Integer.valueOf(updateFile.file.expectedSize), updateFile.file.remote.toString(), updateFile.file.local.toString());
                }
                m2666Rd(updateFile);
                return;
            case TdApi.UpdateHavePendingNotifications.CONSTRUCTOR:
                m2200va((TdApi.UpdateHavePendingNotifications) update);
                return;
            case TdApi.UpdateFileGenerationStart.CONSTRUCTOR:
                m2606Vd((TdApi.UpdateFileGenerationStart) update);
                return;
            case TdApi.UpdateChatPendingJoinRequests.CONSTRUCTOR:
                m2133zd((TdApi.UpdateChatPendingJoinRequests) update);
                return;
            case TdApi.UpdateSupergroupFullInfo.CONSTRUCTOR:
                this.f35053h0.m1604q1((TdApi.UpdateSupergroupFullInfo) update);
                return;
            case TdApi.UpdateTrendingStickerSets.CONSTRUCTOR:
                m2856Fe((TdApi.UpdateTrendingStickerSets) update);
                return;
            case TdApi.UpdateChatDefaultDisableNotification.CONSTRUCTOR:
                m2309od((TdApi.UpdateChatDefaultDisableNotification) update);
                return;
            case TdApi.UpdateChatOnlineMemberCount.CONSTRUCTOR:
                m2149yd((TdApi.UpdateChatOnlineMemberCount) update);
                return;
            case TdApi.UpdateMessageContent.CONSTRUCTOR:
                m2468ee((TdApi.UpdateMessageContent) update);
                return;
            case TdApi.UpdateNewCallSignalingData.CONSTRUCTOR:
                m2357ld((TdApi.UpdateNewCallSignalingData) update);
                return;
            case TdApi.UpdateChatVideoChat.CONSTRUCTOR:
                m2729Nd((TdApi.UpdateChatVideoChat) update);
                return;
            case TdApi.UpdateChatReadOutbox.CONSTRUCTOR:
                m2857Fd((TdApi.UpdateChatReadOutbox) update);
                return;
            case TdApi.UpdateGroupCall.CONSTRUCTOR:
                m2561Yd((TdApi.UpdateGroupCall) update);
                return;
            case TdApi.UpdateChatTheme.CONSTRUCTOR:
                m2825Hd((TdApi.UpdateChatTheme) update);
                return;
            case TdApi.UpdateFileDownload.CONSTRUCTOR:
                m2636Td((TdApi.UpdateFileDownload) update);
                return;
            case TdApi.UpdateOption.CONSTRUCTOR:
                m2228te(kVar, (TdApi.UpdateOption) update);
                return;
            case TdApi.UpdateMessageUnreadReactions.CONSTRUCTOR:
                m2340me((TdApi.UpdateMessageUnreadReactions) update);
                return;
            case TdApi.UpdateUserStatus.CONSTRUCTOR:
                this.f35053h0.m1592t1((TdApi.UpdateUserStatus) update);
                return;
            case TdApi.UpdateMessageIsPinned.CONSTRUCTOR:
                m2404ie((TdApi.UpdateMessageIsPinned) update);
                return;
            case TdApi.UpdateInstalledStickerSets.CONSTRUCTOR:
                m2531ae((TdApi.UpdateInstalledStickerSets) update);
                return;
            case TdApi.UpdateUser.CONSTRUCTOR:
                this.f35053h0.m1600r1((TdApi.UpdateUser) update);
                return;
            case TdApi.UpdateMessageSendAcknowledged.CONSTRUCTOR:
                this.f35068m0.m1517e((TdApi.UpdateMessageSendAcknowledged) update);
                return;
            case TdApi.UpdateChatReplyMarkup.CONSTRUCTOR:
                m2841Gd((TdApi.UpdateChatReplyMarkup) update);
                return;
            case TdApi.UpdateServiceNotification.CONSTRUCTOR:
                m2936Ae((TdApi.UpdateServiceNotification) update);
                return;
            case TdApi.UpdateCall.CONSTRUCTOR:
                m2373kd((TdApi.UpdateCall) update);
                return;
            case TdApi.UpdateBasicGroupFullInfo.CONSTRUCTOR:
                this.f35053h0.m1635i1((TdApi.UpdateBasicGroupFullInfo) update);
                return;
            case TdApi.UpdateChatDraftMessage.CONSTRUCTOR:
                m2277qd((TdApi.UpdateChatDraftMessage) update);
                return;
            case TdApi.UpdateSuggestedActions.CONSTRUCTOR:
                m2904Ce((TdApi.UpdateSuggestedActions) update);
                return;
            case TdApi.UpdateChatAvailableReactions.CONSTRUCTOR:
                m2325nd((TdApi.UpdateChatAvailableReactions) update);
                return;
            case TdApi.UpdateChatIsMarkedAsUnread.CONSTRUCTOR:
                m2197vd((TdApi.UpdateChatIsMarkedAsUnread) update);
                return;
            case TdApi.UpdateConnectionState.CONSTRUCTOR:
                m2713Od((TdApi.UpdateConnectionState) update);
                return;
            case TdApi.UpdateFileAddedToDownloads.CONSTRUCTOR:
                m2651Sd((TdApi.UpdateFileAddedToDownloads) update);
                return;
            case TdApi.UpdateAuthorizationState.CONSTRUCTOR:
                m2389jd(kVar, ((TdApi.UpdateAuthorizationState) update).authorizationState);
                return;
            case TdApi.UpdateFavoriteStickers.CONSTRUCTOR:
                m2681Qd((TdApi.UpdateFavoriteStickers) update);
                return;
            case TdApi.UpdateDeleteMessages.CONSTRUCTOR:
                m2324ne((TdApi.UpdateDeleteMessages) update);
                return;
            case TdApi.UpdateChatHasProtectedContent.CONSTRUCTOR:
                m2245sd((TdApi.UpdateChatHasProtectedContent) update);
                return;
            case TdApi.UpdateMessageSendSucceeded.CONSTRUCTOR:
                m2356le((TdApi.UpdateMessageSendSucceeded) update);
                return;
            case TdApi.UpdateFileRemovedFromDownloads.CONSTRUCTOR:
                m2576Xd((TdApi.UpdateFileRemovedFromDownloads) update);
                return;
            case TdApi.UpdateStickerSet.CONSTRUCTOR:
                m2920Be(((TdApi.UpdateStickerSet) update).stickerSet);
                return;
            case TdApi.UpdateRecentStickers.CONSTRUCTOR:
                m2148ye((TdApi.UpdateRecentStickers) update);
                return;
            case TdApi.UpdateUnreadChatCount.CONSTRUCTOR:
                m2840Ge((TdApi.UpdateUnreadChatCount) update);
                return;
            case TdApi.UpdateChatMessageSender.CONSTRUCTOR:
                m2293pd((TdApi.UpdateChatMessageSender) update);
                return;
            case TdApi.UpdateChatHasScheduledMessages.CONSTRUCTOR:
                m2229td((TdApi.UpdateChatHasScheduledMessages) update);
                return;
            case TdApi.UpdateNewChat.CONSTRUCTOR:
                m2308oe((TdApi.UpdateNewChat) update);
                return;
            default:
                return;
        }
    }

    public final void m2795Jb(long j, TdApi.MessageSender messageSender, TdApi.ChatMemberStatus chatMemberStatus, int i, TdApi.ChatMemberStatus chatMemberStatus2, AbstractC10939i iVar) {
        TdApi.Function function;
        boolean z = C7316a.m17054g(j) && i > 0 && !C4779t2.m25499i3(chatMemberStatus2, false) && C4779t2.m25499i3(chatMemberStatus, false) && messageSender.getConstructor() == -336109341;
        AtomicBoolean atomicBoolean = (!z || !C4779t2.m25679H2(chatMemberStatus)) ? null : new AtomicBoolean(false);
        if (z) {
            function = new TdApi.AddChatMember(j, ((TdApi.MessageSenderUser) messageSender).userId, i);
        } else {
            function = new TdApi.SetChatMemberStatus(j, messageSender, chatMemberStatus);
        }
        m2270r4().m14783o(function, new C10933c(atomicBoolean, j, messageSender, chatMemberStatus, new AtomicReference(), new AtomicInteger(0), iVar));
    }

    public void m2794Jc(final TdApi.LanguagePackInfo languagePackInfo, final AbstractC5917i iVar) {
        if (C5070i.m24061i(languagePackInfo.baseLanguagePackId)) {
            m2810Ic(languagePackInfo.f25405id, iVar);
        } else {
            m2810Ic(languagePackInfo.f25405id, new AbstractC5917i() {
                @Override
                public final void mo1322a(boolean z) {
                    C10930q6.this.m2169x9(languagePackInfo, iVar, z);
                }
            });
        }
    }

    public final void m2793Jd(TdApi.UpdateChatTitle updateChatTitle) {
        synchronized (this.f35030a0) {
            TdApi.Chat chat = this.f35034b0.get(Long.valueOf(updateChatTitle.chatId));
            if (!C10859mj.m2997b(updateChatTitle.chatId, chat, updateChatTitle)) {
                chat.title = updateChatTitle.title;
                this.f35056i0.m1969C1(updateChatTitle, chat, m2335n3(chat.positions));
                if (Build.VERSION.SDK_INT >= 26) {
                    long ba2 = m2519ba();
                    if (ba2 != 0) {
                        C10639eb.m4382v(this, ba2, chat);
                    }
                }
            }
        }
    }

    public final String m2792Je(TdApi.Chat chat, int i) {
        throw new RuntimeException("version: " + i + ", clientData: " + chat.clientData);
    }

    public boolean m2789K1(C10936f fVar) {
        if (fVar == null) {
            return false;
        }
        for (TdApi.Message message : fVar.f35133a) {
            if (m2625U9(message)) {
                return true;
            }
        }
        return false;
    }

    public boolean m2788K2(long j) {
        if (j == 0) {
            return false;
        }
        if (C7316a.m17049l(j)) {
            return m2832H6(j);
        }
        TdApi.ChatMemberStatus K3 = m2787K3(j);
        if (K3 != null) {
            int constructor = K3.getConstructor();
            if (constructor == -160019714 || constructor == 82243562) {
                return true;
            }
            if (constructor == 1661432998 && !((TdApi.ChatMemberStatusRestricted) K3).permissions.canSendPolls) {
                return false;
            }
        }
        TdApi.Chat U2 = m2632U2(j);
        return U2 != null && U2.permissions.canSendPolls;
    }

    public TdApi.ChatMemberStatus m2787K3(long j) {
        if (j == 0) {
            return null;
        }
        switch (C7316a.m17057d(j)) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                TdApi.Supergroup h2 = m2480e2().m1638h2(C7316a.m17045p(j));
                if (h2 != null) {
                    return h2.status;
                }
                return null;
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                return null;
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                TdApi.BasicGroup M = m2480e2().m1716M(C7316a.m17048m(j));
                if (M != null) {
                    return M.status;
                }
                return null;
            default:
                throw new RuntimeException();
        }
    }

    public void m2786K4(final long j, final boolean z, final Runnable runnable) {
        switch (C7316a.m17057d(j)) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                TdApi.ChatMemberStatus K3 = m2787K3(j);
                if (K3 == null || !C4779t2.m25499i3(K3, false)) {
                    m2270r4().m14783o(new TdApi.DeleteChatHistory(j, true, z), m2376ka(runnable));
                    return;
                } else {
                    m2270r4().m14783o(new TdApi.SetChatMemberStatus(j, m2565Y9(), new TdApi.ChatMemberStatusLeft()), new Client.AbstractC7865g() {
                        @Override
                        public final void mo255t2(TdApi.Object object) {
                            C10930q6.this.m2642T7(j, z, runnable, object);
                        }
                    });
                    return;
                }
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
                TdApi.SecretChat X3 = m2586X3(j);
                if (X3 == null || X3.state.getConstructor() == -1945106707) {
                    m2270r4().m14783o(new TdApi.DeleteChatHistory(j, true, z), m2198vc(runnable));
                    return;
                } else {
                    m2270r4().m14783o(new TdApi.CloseSecretChat(C7316a.m17047n(j)), new Client.AbstractC7865g() {
                        @Override
                        public final void mo255t2(TdApi.Object object) {
                            C10930q6.this.m2657S7(j, z, runnable, object);
                        }
                    });
                    return;
                }
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                m2270r4().m14783o(new TdApi.DeleteChatHistory(j, true, z), m2376ka(runnable));
                return;
            default:
                return;
        }
    }

    public TdApi.FormattedText m2785K5(long j, long j2) {
        TdApi.MessageContent M5 = m2753M5(j, j2);
        if (M5 == null) {
            return m2769L5(j, j2);
        }
        int constructor = M5.getConstructor();
        if (constructor == 908195298) {
            return C7321e.m16899w1(M5);
        }
        if (constructor == 1989037971) {
            return ((TdApi.MessageText) M5).text;
        }
        throw new UnsupportedOperationException(Integer.toString(M5.getConstructor()));
    }

    public boolean m2784K6(long j) {
        TdApi.Supergroup Y3 = m2571Y3(j);
        return Y3 != null && Y3.isChannel;
    }

    public C11039u9 m2781K9() {
        return this.f35056i0;
    }

    public Client.AbstractC7865g m2780Ka() {
        return this.f35005S;
    }

    public void m2779Kb(long j, int i) {
        m2270r4().m14783o(new TdApi.SetChatMessageTtl(j, i), m2392ja());
    }

    public String m2778Kc() {
        return Uri.parse(this.f35054h1).getHost();
    }

    public final void m2777Kd(TdApi.UpdateChatUnreadMentionCount updateChatUnreadMentionCount) {
        synchronized (this.f35030a0) {
            TdApi.Chat chat = this.f35034b0.get(Long.valueOf(updateChatUnreadMentionCount.chatId));
            if (!C10859mj.m2997b(updateChatUnreadMentionCount.chatId, chat, updateChatUnreadMentionCount)) {
                boolean z = true;
                boolean z2 = chat.unreadMentionCount > 0;
                int i = updateChatUnreadMentionCount.unreadMentionCount;
                if (z2 == (i > 0)) {
                    z = false;
                }
                chat.unreadMentionCount = i;
                this.f35056i0.m1961E1(updateChatUnreadMentionCount, z);
            }
        }
    }

    public void m2776Ke(final long j, final AbstractC10948r rVar) {
        m2270r4().m14783o(new TdApi.UpgradeBasicGroupChatToSupergroupChat(j), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C10930q6.this.m2813I9(rVar, j, object);
            }
        });
    }

    public boolean m2773L1() {
        return this.f34977H0;
    }

    public boolean m2772L2(TdApi.Chat chat) {
        return chat != null && chat.type.getConstructor() == 862366513;
    }

    public TdApi.Chat m2771L3(long j) {
        TdApi.Chat chat;
        synchronized (this.f35030a0) {
            chat = this.f35034b0.get(Long.valueOf(j));
            if (chat == null) {
                throw new IllegalStateException("updateChat not received for id:" + j);
            }
        }
        return chat;
    }

    public void m2770L4(long j, long[] jArr, boolean z) {
        m2270r4().m14783o(new TdApi.DeleteMessages(j, jArr, z), this.f34987M);
    }

    public TdApi.FormattedText m2769L5(long j, long j2) {
        TdApi.FormattedText formattedText;
        synchronized (this.f35013U1) {
            HashMap<String, TdApi.FormattedText> hashMap = this.f35013U1;
            formattedText = hashMap.get(j + "_" + j2);
        }
        return formattedText;
    }

    public boolean m2768L6(TdApi.MessageSender messageSender) {
        long Q0 = C7321e.m16986Q0(messageSender);
        return Q0 != 0 && m2784K6(Q0);
    }

    public final Client.AbstractC7865g m2764La(final boolean z) {
        return new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C10930q6.this.m2611V8(z, object);
            }
        };
    }

    public void m2763Lb(long j, TdApi.ChatNotificationSettings chatNotificationSettings) {
        m2270r4().m14783o(new TdApi.SetChatNotificationSettings(j, chatNotificationSettings), this.f34987M);
    }

    public String m2762Lc(String str) {
        return m2637Tc("bg/" + str);
    }

    public final void m2761Ld(TdApi.UpdateChatUnreadReactionCount updateChatUnreadReactionCount) {
        synchronized (this.f35030a0) {
            TdApi.Chat chat = this.f35034b0.get(Long.valueOf(updateChatUnreadReactionCount.chatId));
            if (!C10859mj.m2997b(updateChatUnreadReactionCount.chatId, chat, updateChatUnreadReactionCount)) {
                boolean z = true;
                boolean z2 = chat.unreadReactionCount > 0;
                int i = updateChatUnreadReactionCount.unreadReactionCount;
                if (z2 == (i > 0)) {
                    z = false;
                }
                chat.unreadReactionCount = i;
                this.f35056i0.m1953G1(updateChatUnreadReactionCount, z);
            }
        }
    }

    public Comparator<TdApi.User> m2760Le() {
        return this.f35008T;
    }

    public void m2757M1(final TdApi.LanguagePackInfo languagePackInfo, final AbstractC5917i iVar, boolean z) {
        final Runnable w3Var = new Runnable() {
            @Override
            public final void run() {
                C10930q6.this.m2927B7(languagePackInfo, iVar);
            }
        };
        if (!z || C4779t2.m25513g3(languagePackInfo.f25405id)) {
            w3Var.run();
        } else {
            m2794Jc(languagePackInfo, new AbstractC5917i() {
                @Override
                public final void mo1322a(boolean z2) {
                    C10930q6.this.m2895D7(w3Var, iVar, z2);
                }
            });
        }
    }

    public boolean m2756M2(TdApi.Chat chat) {
        return ((m2283q7(chat) && m2336n2(chat, false)) || m2708P2(chat.f25367id)) && C5070i.m24061i(m2462f4(chat.f25367id));
    }

    public boolean m2755M3(long j) {
        if (j == 0) {
            return false;
        }
        if (!C7316a.m17051j(j)) {
            return true;
        }
        TdApi.SecretChat X3 = m2586X3(j);
        return X3 != null && X3.layer >= 66;
    }

    public void m2754M4(long j, long[] jArr, boolean z) {
        m2270r4().m14783o(new TdApi.DeleteMessages(j, jArr, z), this.f34987M);
    }

    public TdApi.MessageContent m2753M5(long j, long j2) {
        TdApi.MessageContent messageContent;
        synchronized (this.f35010T1) {
            HashMap<String, TdApi.MessageContent> hashMap = this.f35010T1;
            messageContent = hashMap.get(j + "_" + j2);
        }
        return messageContent;
    }

    public boolean m2752M6(TdApi.Chat chat) {
        return chat != null && chat.type.getConstructor() == -1472570774 && ((TdApi.ChatTypeSupergroup) chat.type).isChannel;
    }

    public C11115xb m2748Ma() {
        return this.f35068m0;
    }

    public void m2747Mb(long j, TdApi.ChatPermissions chatPermissions, final AbstractC5917i iVar) {
        m2270r4().m14783o(new TdApi.SetChatPermissions(j, chatPermissions), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C10930q6.m2409i9(AbstractC5917i.this, object);
            }
        });
    }

    public String m2746Mc() {
        return C5070i.m24071G(m2652Sc());
    }

    public final void m2745Md(TdApi.UpdateChatAction updateChatAction) {
        if (updateChatAction.chatId != m2519ba()) {
            m2485dd().sendMessage(m2485dd().obtainMessage(1, 0, 0, updateChatAction));
        }
    }

    public Comparator<AbstractC5098a1> m2744Me() {
        return this.f35011U;
    }

    public boolean m2741N1() {
        return this.f35024Y0;
    }

    public boolean m2740N2(long j) {
        TdApi.ChatMemberStatus K3 = m2787K3(j);
        return K3 != null && K3.getConstructor() == -160019714;
    }

    public TdApi.Chat m2739N3(long j) {
        return m2723O3(j, TimeUnit.SECONDS.toMillis(5L));
    }

    public void m2738N4() {
        m2270r4().m14783o(new TdApi.Destroy(), this.f34987M);
    }

    public String m2737N5() {
        return this.f35035b1;
    }

    public boolean m2736N6(long j) {
        long p = C7316a.m17045p(j);
        return p != 0 && this.f35083r0.contains(Long.valueOf(p));
    }

    public void m2733N9(long j, long j2, Runnable runnable) {
        TdApi.Chat U2 = m2632U2(j);
        if (U2 != null) {
            int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            if (i == 0 && U2.isMarkedAsUnread) {
                m2270r4().m14783o(new TdApi.ToggleChatIsMarkedAsUnread(U2.f25367id, false), m2376ka(runnable));
            }
            if (!m2284q6(U2) && U2.lastMessage != null) {
                if (i != 0 || U2.unreadCount > 0) {
                    m2270r4().m14783o(new TdApi.ViewMessages(j, j2, new long[]{U2.lastMessage.f25406id}, true), m2376ka(runnable));
                }
            }
        }
    }

    public void m2732Na(TdApi.ChatList chatList, final AbstractC5919k kVar) {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        m2237t5(chatList, new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                C10930q6.this.m2596W8(atomicInteger, (TdApi.Chat) obj);
            }
        }, new AbstractC5917i() {
            @Override
            public final void mo1322a(boolean z) {
                C10930q6.m2581X8(AbstractC5919k.this, atomicInteger, z);
            }
        }, false);
    }

    public String m2730Nc(String str) {
        return m2637Tc("setlanguage/" + str);
    }

    public final void m2729Nd(TdApi.UpdateChatVideoChat updateChatVideoChat) {
        synchronized (this.f35030a0) {
            TdApi.Chat chat = this.f35034b0.get(Long.valueOf(updateChatVideoChat.chatId));
            if (!C10859mj.m2997b(updateChatVideoChat.chatId, chat, updateChatVideoChat)) {
                chat.videoChat = updateChatVideoChat.videoChat;
                this.f35056i0.m1945I1(updateChatVideoChat);
            }
        }
    }

    public void m2728Ne() {
        synchronized (this.f35026Z) {
            if (this.f35020X != null && this.f35102y1 && Thread.currentThread() == this.f35020X.f35156b.m14791g()) {
                new Thread(new Runnable() {
                    @Override
                    public final void run() {
                        C10930q6.this.m2238t4();
                    }
                }).start();
                return;
            }
            m2222u4();
        }
    }

    public boolean m2725O1() {
        return this.f35021X0 == 1;
    }

    public boolean m2724O2(TdApi.Chat chat) {
        return m2752M6(chat) && m2336n2(chat, false);
    }

    public TdApi.Chat m2723O3(long j, long j2) {
        if (j == 0) {
            return null;
        }
        TdApi.Chat U2 = this.f35047f0.contains(Long.valueOf(j)) ? m2632U2(j) : null;
        if (U2 != null) {
            return U2;
        }
        TdApi.Object s4 = m2254s4(new TdApi.GetChat(j), j2);
        if (s4 != null) {
            int constructor = s4.getConstructor();
            if (constructor == -1679978726) {
                Log.m14724e("chatSync failed: %s, chatId:%d", C4779t2.m25378z5(s4), Long.valueOf(j));
            } else if (constructor == -1601123095 && this.f35047f0.contains(Long.valueOf(j))) {
                return m2632U2(j);
            } else {
                return null;
            }
        }
        return null;
    }

    public boolean m2722O4(boolean z) {
        if (z) {
            m2270r4().m14783o(new TdApi.GetOption("disable_contact_registered_notifications"), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    C10930q6.this.m2627U7(object);
                }
            });
        }
        return this.f35090t1;
    }

    public List<Long> m2721O5(TdApi.ChatList chatList) {
        synchronized (this.f35030a0) {
            ArrayList<TdApi.Chat> arrayList = null;
            for (TdApi.Chat chat : this.f35034b0.values()) {
                TdApi.ChatPosition a = C7317b.m17043a(chat, chatList);
                if (a != null && a.isPinned) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(chat);
                }
            }
            if (arrayList != null) {
                C7321e.m16929m1(arrayList, chatList);
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (TdApi.Chat chat2 : arrayList) {
                    arrayList2.add(Long.valueOf(chat2.f25367id));
                }
                return arrayList2;
            }
            return new ArrayList();
        }
    }

    public boolean m2720O6(long j) {
        boolean z;
        synchronized (this.f35007S1) {
            z = this.f35004R1.m23255d(j) != 0;
        }
        return z;
    }

    public void m2717O9(TdApi.Chat chat, Runnable runnable) {
        if (chat != null && chat.unreadCount == 0 && !chat.isMarkedAsUnread) {
            m2270r4().m14783o(new TdApi.ToggleChatIsMarkedAsUnread(chat.f25367id, true), m2376ka(runnable));
        }
    }

    public void m2716Oa(long j, long j2, long[] jArr) {
        if (Log.isEnabled(4)) {
            Log.m14722i(4, "Reading messages chatId:%d messageIds:%s", Log.generateSingleLineException(2), Long.valueOf(j), Arrays.toString(jArr));
        }
        m2270r4().m14783o(new TdApi.ViewMessages(j, j2, jArr, true), this.f34987M);
    }

    public final java.util.List<p350yd.C10930q6.C10938h> m2715Ob(org.drinkless.p210td.libcore.telegram.TdApi.Chat r23, org.drinkless.p210td.libcore.telegram.TdApi.ChatPosition[] r24) {
        throw new UnsupportedOperationException("Method not decompiled: p350yd.C10930q6.m2715Ob(org.drinkless.td.libcore.telegram.TdApi$Chat, org.drinkless.td.libcore.telegram.TdApi$ChatPosition[]):java.util.List");
    }

    public String m2714Oc(String str, long j) {
        return m2637Tc(str + "/" + j);
    }

    public final void m2713Od(TdApi.UpdateConnectionState updateConnectionState) {
        int i;
        switch (updateConnectionState.state.getConstructor()) {
            case TdApi.ConnectionStateConnecting.CONSTRUCTOR:
                i = 2;
                break;
            case TdApi.ConnectionStateUpdating.CONSTRUCTOR:
                i = 3;
                break;
            case TdApi.ConnectionStateConnectingToProxy.CONSTRUCTOR:
                i = 1;
                break;
            case TdApi.ConnectionStateReady.CONSTRUCTOR:
                i = 0;
                break;
            case TdApi.ConnectionStateWaitingForNetwork.CONSTRUCTOR:
                i = 4;
                break;
            default:
                throw new UnsupportedOperationException(updateConnectionState.toString());
        }
        int i2 = this.f35023Y;
        if (i2 != i) {
            this.f35023Y = i;
            if (i == 0 || i == 4) {
                this.f35051g1 = 0L;
            } else if (this.f35051g1 == 0) {
                this.f35051g1 = SystemClock.uptimeMillis();
            }
            this.f35056i0.m1941J1(i, i2);
            this.f35014V.m4686i2(this, i);
            if (i == 0) {
                m2360la();
            } else if (i2 == 0) {
                m2930B4().m4694g3().m28144i();
            }
        }
    }

    public C11004sj m2712Oe() {
        return this.f35074o0;
    }

    public String m2709P1() {
        return this.f34989M1;
    }

    public boolean m2708P2(long j) {
        return C7316a.m17054g(j) && C4779t2.m25623P2(m2787K3(j));
    }

    public int m2707P3(long j) {
        TdApi.Chat U2 = m2632U2(j);
        if (U2 != null) {
            return U2.messageTtl;
        }
        return 0;
    }

    public void m2706P4(int i, int i2) {
        m2485dd().sendMessage(m2485dd().obtainMessage(6, i, i2));
    }

    public CharSequence m2705P5(TdApi.Chat chat) {
        return m2614V5(chat, R.id.right_sendPolls, R.string.ChatDisabledPolls, R.string.ChatRestrictedPolls, R.string.ChatRestrictedPollsUntil);
    }

    public boolean m2704P6() {
        return this.f35023Y == 0;
    }

    public int m2701P9() {
        return this.f35081q1;
    }

    public final void m2700Pa(long j, TdApi.MessageSender messageSender, int i, AbstractC10939i iVar) {
        m2270r4().m14783o(new TdApi.GetChatMember(j, messageSender), new C10934d(j, messageSender, i, new AtomicInteger(), iVar, new AtomicReference()));
    }

    public void m2699Pb(boolean z) {
        if (this.f35090t1 != z) {
            this.f35090t1 = z;
            m2270r4().m14783o(new TdApi.SetOption("disable_contact_registered_notifications", new TdApi.OptionValueBoolean(z)), this.f34987M);
            m2781K9().m1933L1(z);
        }
    }

    public String m2698Pc(long j, long j2) {
        return m2637Tc("c/" + j + "/" + j2);
    }

    public final void m2697Pd(String[] strArr) {
        synchronized (this.f35030a0) {
            this.f34985L0 = strArr;
        }
    }

    public boolean m2696Pe() {
        return !this.f34975G0 || C7389v0.m16636f1();
    }

    public String m2693Q1() {
        return this.f34992N1;
    }

    public void m2692Q2(TdApi.Message message) {
        m2485dd().removeMessages(4, message);
    }

    public String m2691Q3(long j) {
        return m2676R3(j, true, false);
    }

    public void m2690Q4(int i, int i2) {
        m2485dd().sendMessage(m2485dd().obtainMessage(5, i, i2));
    }

    public void m2689Q5(long j, Client.AbstractC7865g gVar) {
        C10932b bVar = new C10932b(gVar, j);
        int d = C7316a.m17057d(j);
        if (d == -1472570774) {
            m2270r4().m14783o(new TdApi.GetSupergroupFullInfo(C7316a.m17045p(j)), bVar);
        } else if (d != 973884508) {
            gVar.mo255t2(new TdApi.Error(-1, "Invalid chat type"));
        } else {
            m2270r4().m14783o(new TdApi.GetBasicGroupFullInfo(C7316a.m17048m(j)), bVar);
        }
    }

    public boolean m2688Q6(TdApi.Chat chat) {
        if (chat == null) {
            return false;
        }
        TdApi.User b4 = m2525b4(chat);
        return C4779t2.m25630O2(b4) && !m2379k7(b4.f25439id);
    }

    public int m2685Q9() {
        return this.f35084r1;
    }

    public void m2684Qa(long j, long[] jArr) {
        m2270r4().m14783o(new TdApi.ResendMessages(j, jArr), m2610V9());
    }

    public final void m2683Qb(boolean z) {
        if (this.f35090t1 != z) {
            this.f35090t1 = z;
            m2781K9().m1933L1(z);
        }
    }

    public String m2682Qc(String str, String str2, boolean z) {
        return m2622Uc().path(str).appendQueryParameter(z ? "startgroup" : "start", str2).build().toString();
    }

    public final void m2681Qd(TdApi.UpdateFavoriteStickers updateFavoriteStickers) {
        synchronized (this.f35030a0) {
            this.f35096v1 = updateFavoriteStickers.stickerIds;
        }
        this.f35056i0.m1929M1(updateFavoriteStickers);
    }

    public String m2678R1() {
        if (!m2332n6()) {
            return "";
        }
        return C1363c0.m37408y("+" + this.f34989M1 + this.f34992N1, false, true);
    }

    public final void m2677R2() {
        if (this.f35076o2) {
            SyncHelper.m14202a(C1379j0.m37309q(), this.f35017W);
            this.f35076o2 = false;
        }
    }

    public String m2676R3(long j, boolean z, boolean z2) {
        TdApi.Chat U2 = m2632U2(j);
        if (U2 != null) {
            return m2631U3(U2, z, z2);
        }
        if (j == f34961y2 && ".".equals(U2.title)) {
            return C4403w.m27869i1(R.string.EmojiSets);
        }
        long d4 = m2494d4(j);
        if (d4 != 0) {
            return m2480e2().m1753C2(d4, z, z2);
        }
        return null;
    }

    public void m2675R4() {
        m2579Xa(new Runnable() {
            @Override
            public final void run() {
                C10930q6.this.m2612V7();
            }
        });
    }

    public void m2674R5(C4868i.C4880l lVar, final AbstractC5918j<String> jVar) {
        m2270r4().m14783o(new TdApi.AddProxy(lVar.f16690b, lVar.f16691c, false, lVar.f16681M), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C10930q6.this.m2346m8(jVar, object);
            }
        });
    }

    public boolean m2673R6() {
        return m2930B4().m4632x2() == this.f35017W;
    }

    public String m2670R9(TdApi.Message message) {
        return m2655S9(message, true, false);
    }

    public final void m2669Ra() {
        this.f35047f0.clear();
        this.f35034b0.clear();
    }

    public void m2668Rb(boolean z) {
        this.f35024Y0 = z;
        m2270r4().m14783o(new TdApi.SetOption("disable_sent_scheduled_message_notifications", new TdApi.OptionValueBoolean(z)), this.f34987M);
    }

    public String m2667Rc(String str) {
        return m2637Tc("addstickers/" + str);
    }

    public final void m2666Rd(TdApi.UpdateFile updateFile) {
        this.f35056i0.m1925N1(updateFile);
        this.f35014V.m4636w2().m7009z0(this, updateFile);
        m2413i5().m3990h0(updateFile);
        TdApi.File file = updateFile.file;
        if (file.local.isDownloadingActive || file.remote.isUploadingActive) {
            m2413i5().m3992g0(updateFile);
            int i = updateFile.file.f25373id;
            if (!ImageLoader.m14392e().m14388i(this, updateFile.file)) {
                GifBridge.m14341f().m14333n(this, i, C4779t2.m25431s1(updateFile.file));
            }
        } else if (C4779t2.m25598T2(file)) {
            m2413i5().m3994f0(updateFile);
            if (!ImageLoader.m14392e().m14389h(this, updateFile.file)) {
                GifBridge.m14341f().m14334m(this, updateFile.file);
            }
        } else {
            m2413i5().m3988i0(updateFile);
        }
    }

    public TdApi.AuthorizationState m2663S1() {
        return this.f34982J1;
    }

    public void m2662S2(AbstractC4761s4 s4Var, int i) {
        m2485dd().removeMessages(i + 100000, s4Var);
    }

    public String m2661S3(TdApi.Chat chat) {
        return m2631U3(chat, true, false);
    }

    public final void m2660S4(TdApi.ChatList chatList, int i, boolean z) {
        this.f35014V.m4716b1().m1539p(this, chatList, i, z);
    }

    public final String m2659S5() {
        String W0 = this.f35014V.m4736W0();
        return C5070i.m24061i(W0) ? C4868i.m24726c2().m24898E0() : W0;
    }

    public final boolean m2658S6() {
        return this.f35100x1;
    }

    public String m2655S9(TdApi.Message message, boolean z, boolean z2) {
        if (message == null) {
            return null;
        }
        TdApi.MessageForwardInfo messageForwardInfo = message.forwardInfo;
        if (messageForwardInfo != null) {
            int constructor = messageForwardInfo.origin.getConstructor();
            if (constructor == -355174191) {
                long j = ((TdApi.MessageForwardOriginUser) message.forwardInfo.origin).senderUserId;
                return z2 ? m2480e2().m1749D2(j) : m2480e2().m1721K2(j);
            } else if (constructor == 1490730723) {
                TdApi.MessageForwardOriginChannel messageForwardOriginChannel = (TdApi.MessageForwardOriginChannel) message.forwardInfo.origin;
                if (z && !C5070i.m24061i(messageForwardOriginChannel.authorSignature)) {
                    return messageForwardOriginChannel.authorSignature;
                }
                TdApi.Chat U2 = m2632U2(messageForwardOriginChannel.chatId);
                if (U2 != null) {
                    return U2.title;
                }
            } else if (constructor == 1526010724) {
                TdApi.MessageForwardOriginChat messageForwardOriginChat = (TdApi.MessageForwardOriginChat) message.forwardInfo.origin;
                if (z && !C5070i.m24061i(messageForwardOriginChat.authorSignature)) {
                    return messageForwardOriginChat.authorSignature;
                }
                TdApi.Chat U22 = m2632U2(messageForwardOriginChat.senderChatId);
                if (U22 != null) {
                    return U22.title;
                }
            }
        }
        TdApi.MessageSender messageSender = message.senderId;
        if (messageSender == null) {
            return null;
        }
        return m2135zb(messageSender, z2);
    }

    public final void m2654Sa() {
        this.f35038c0.clear();
        this.f35047f0.clear();
        this.f35058i2.m21474b();
        this.f35086s0.m23248a();
        this.f35050g0.clear();
        this.f35070m2 = null;
        this.f35010T1.clear();
        this.f35013U1.clear();
        this.f35044e0.m2085c();
        this.f35064k2.clear();
        this.f35069m1 = 777000L;
        this.f35066l1 = 1271266957L;
        this.f35019W1 = null;
        this.f35041d0.m2085c();
    }

    public void m2653Sb(boolean z) {
        this.f35021X0 = z ? 1 : 0;
        m2270r4().m14783o(new TdApi.SetOption("disable_top_chats", new TdApi.OptionValueBoolean(z)), this.f34987M);
    }

    public String m2652Sc() {
        if (!C5070i.m24061i(this.f35054h1)) {
            return this.f35054h1;
        }
        return "https://" + C4779t2.m25514g2() + "/";
    }

    public final void m2651Sd(TdApi.UpdateFileAddedToDownloads updateFileAddedToDownloads) {
        this.f35056i0.m1921O1(updateFileAddedToDownloads);
    }

    public int m2648T1() {
        int Z5;
        synchronized (this.f35030a0) {
            Z5 = m2554Z5(this.f34982J1);
        }
        return Z5;
    }

    public void m2647T2(int i) {
        if (i > 0) {
            do {
                m2896D6(5);
                i--;
            } while (i > 0);
        } else if (i < 0) {
            do {
                m2834H4(5);
                i++;
            } while (i < 0);
        }
    }

    public String m2646T3(TdApi.Chat chat, boolean z) {
        return m2631U3(chat, z, false);
    }

    public void m2645T4(TdApi.UpdateUserStatus updateUserStatus, boolean z) {
        m2485dd().sendMessage(m2485dd().obtainMessage(8, z ? 1 : 0, 0, updateUserStatus));
    }

    public TdApi.File m2644T5(String str, TdApi.FileType fileType, long j) {
        TdApi.Object s4 = m2254s4(new TdApi.GetRemoteFile(str, fileType), j);
        if (s4 instanceof TdApi.File) {
            return (TdApi.File) s4;
        }
        return null;
    }

    public boolean m2643T6(String str) {
        if (C5070i.m24061i(str)) {
            return false;
        }
        synchronized (this.f35030a0) {
            String[] strArr = this.f34985L0;
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

    public String m2640T9(TdApi.Message message) {
        long M0 = C7321e.m16994M0(message);
        if (M0 == 0) {
            return null;
        }
        if (C7316a.m17052i(M0)) {
            return m2480e2().m1694R2(C7316a.m17044q(M0));
        }
        return m2462f4(M0);
    }

    public final void m2639Ta() {
        this.f35043d2 = false;
        this.f34974F1 = false;
    }

    public final void m2638Tb(boolean z) {
        if (this.f34970D1 == z) {
            return;
        }
        if (!z || !m2704P6()) {
            this.f34970D1 = z;
            m2930B4().m4742U2(this.f35017W, z);
        }
    }

    public String m2637Tc(String str) {
        return m2622Uc().path(str).build().toString();
    }

    public final void m2636Td(TdApi.UpdateFileDownload updateFileDownload) {
        this.f35056i0.m1917P1(updateFileDownload);
    }

    public boolean m2633U1() {
        return this.f35006S0;
    }

    public TdApi.Chat m2632U2(long j) {
        TdApi.Chat chat;
        if (j == 0) {
            return null;
        }
        synchronized (this.f35030a0) {
            chat = this.f35034b0.get(Long.valueOf(j));
        }
        return chat;
    }

    public String m2631U3(TdApi.Chat chat, boolean z, boolean z2) {
        if (chat.f25367id == f34961y2 && ".".equals(chat.title)) {
            return C4403w.m27869i1(R.string.EmojiSets);
        }
        long d4 = m2494d4(chat.f25367id);
        return d4 != 0 ? m2480e2().m1753C2(d4, z, z2) : chat.title;
    }

    public final void m2630U4() {
        synchronized (this.f35026Z) {
            m2615V4();
        }
    }

    public C10944n m2629U5(TdApi.Chat chat, int i) {
        TdApi.User v2;
        int constructor;
        if (chat == null || chat.f25367id == 0 || !C4779t2.m25664J3(i)) {
            return null;
        }
        TdApi.ChatMemberStatus K3 = m2787K3(chat.f25367id);
        boolean z = true;
        int i2 = (K3 == null || (K3.getConstructor() != 844723285 && (K3.getConstructor() != 1661432998 || !C4779t2.m25577X(((TdApi.ChatMemberStatusRestricted) K3).permissions, i)))) ? 0 : 1;
        if (K3 != null) {
            switch (K3.getConstructor()) {
                case TdApi.ChatMemberStatusBanned.CONSTRUCTOR:
                    return new C10944n(chat.f25367id, 2, ((TdApi.ChatMemberStatusBanned) K3).bannedUntilDate);
                case TdApi.ChatMemberStatusCreator.CONSTRUCTOR:
                case TdApi.ChatMemberStatusAdministrator.CONSTRUCTOR:
                    return null;
                case TdApi.ChatMemberStatusMember.CONSTRUCTOR:
                    if (m2752M6(chat)) {
                        return new C10944n(chat.f25367id, 3, 0);
                    }
                    break;
                case TdApi.ChatMemberStatusRestricted.CONSTRUCTOR:
                    if (!C4779t2.m25577X(chat.permissions, i)) {
                        return new C10944n(chat.f25367id, 0, 0);
                    }
                    TdApi.ChatMemberStatusRestricted chatMemberStatusRestricted = (TdApi.ChatMemberStatusRestricted) K3;
                    if (!C4779t2.m25577X(chatMemberStatusRestricted.permissions, i)) {
                        return new C10944n(chat.f25367id, 1, chatMemberStatusRestricted.restrictedUntilDate);
                    }
                    return null;
            }
        }
        int constructor2 = chat.type.getConstructor();
        if (constructor2 == 862366513) {
            TdApi.SecretChat S1 = m2480e2().m1691S1(C7316a.m17047n(chat.f25367id));
            if (S1 == null || S1.state.getConstructor() != -1611352087 || (v2 = m2480e2().m1583v2(S1.userId)) == null) {
                return new C10944n(chat.f25367id, 3, 0);
            }
            int constructor3 = v2.type.getConstructor();
            if (constructor3 == -1807729372 || constructor3 == -724541123) {
                return new C10944n(chat.f25367id, 3, 0);
            }
            return null;
        } else if (constructor2 == 1579049844) {
            TdApi.User v22 = m2480e2().m1583v2(C7316a.m17044q(chat.f25367id));
            boolean z2 = v22 == null;
            if (z2 || !((constructor = v22.type.getConstructor()) == -1807729372 || constructor == -724541123)) {
                z = z2;
            }
            if (z) {
                return new C10944n(chat.f25367id, 3, 0);
            }
            return null;
        } else if (!C4779t2.m25577X(chat.permissions, i)) {
            return new C10944n(chat.f25367id, i2 ^ 1, 0);
        } else {
            return null;
        }
    }

    public boolean m2628U6() {
        return this.f35036b2;
    }

    public boolean m2625U9(TdApi.Message message) {
        return (message == null || m2785K5(message.chatId, message.f25406id) == null) ? false : true;
    }

    public int m2624Ua() {
        String Wa = m2594Wa();
        if (C5070i.m24061i(Wa)) {
            return 0;
        }
        return C5070i.m24051s(Wa.substring(8)) - 50;
    }

    public final void m2623Ub(boolean z) {
        if (this.f35061j2 != z) {
            this.f35061j2 = z;
            if (z) {
                m2944A6();
            } else {
                m2882E4();
            }
        }
    }

    public Uri.Builder m2622Uc() {
        return new Uri.Builder().scheme("https").authority(m2778Kc());
    }

    public final void m2621Ud(TdApi.UpdateFileDownloads updateFileDownloads) {
        this.f35056i0.m1913Q1(updateFileDownloads);
    }

    public boolean m2618V1() {
        return this.f35009T0;
    }

    public void m2617V2(final long j, final AbstractC5913e<TdApi.Function> eVar, final AbstractC5918j<TdApi.Chat> jVar) {
        if (eVar == null) {
            m2602W2(j, jVar);
        } else {
            m2602W2(j, new AbstractC5918j() {
                @Override
                public final void mo1330a(Object obj) {
                    C10930q6.this.m2831H7(jVar, eVar, j, (TdApi.Chat) obj);
                }
            });
        }
    }

    public String m2616V3(long j) {
        return m2676R3(j, true, true);
    }

    public final void m2615V4() {
        if (this.f34966B1 != 0) {
            if (this.f35020X == null || this.f35102y1) {
                Log.m14727e((int) Log.TAG_ACCOUNTS, "Cannot pause TDLib instance, because it is already paused. accountId:%d", Integer.valueOf(this.f35017W));
                return;
            }
            this.f34966B1 = 0L;
            if (!m2278qc()) {
                Log.m14721i((int) Log.TAG_ACCOUNTS, "Cannot restart TDLib, because it is in use. referenceCount:%d, accountId:%d", Integer.valueOf(this.f35104z1.get()), Integer.valueOf(this.f35017W));
                return;
            }
            Log.m14721i((int) Log.TAG_ACCOUNTS, "Pausing TDLib instance, because it is unused, accountId:%d", Integer.valueOf(this.f35017W));
            this.f35102y1 = true;
            this.f35020X.m2099x();
        }
    }

    public CharSequence m2614V5(TdApi.Chat chat, int i, int i2, int i3, int i4) {
        C10944n U5 = m2629U5(chat, i);
        if (U5 == null) {
            return null;
        }
        switch (i) {
            case R.id.right_sendMedia:
            case R.id.right_sendPolls:
                CharSequence I5 = m2817I5(chat);
                if (I5 != null) {
                    return I5;
                }
                break;
            case R.id.right_sendStickersAndGifs:
                CharSequence E5 = m2881E5(chat);
                if (E5 != null) {
                    return E5;
                }
                break;
        }
        int i5 = U5.f35167b;
        if (i5 != 0) {
            if (i5 == 1) {
                int i6 = U5.f35168c;
                return i6 != 0 ? C4403w.m27865j1(i4, C4403w.m28001C1(i6, TimeUnit.SECONDS)) : C4403w.m27869i1(i3);
            } else if (i5 == 2) {
                int i7 = U5.f35168c;
                return i7 != 0 ? C4403w.m27865j1(R.string.ChatBannedUntil, C4403w.m28001C1(i7, TimeUnit.SECONDS)) : C4403w.m27869i1(R.string.ChatBanned);
            } else if (i5 != 3) {
                throw new UnsupportedOperationException();
            }
        }
        if (U5.m2089b()) {
            i2 = R.string.UserDisabledMessages;
        }
        return C4403w.m27869i1(i2);
    }

    public boolean m2613V6(TdApi.Message message) {
        return message != null && message.chatId == C7321e.m16988P0(message) && m2583X6(message.chatId);
    }

    public Client.AbstractC7865g m2610V9() {
        return this.f34993O;
    }

    public String m2609Va() {
        String Wa = m2594Wa();
        if (C5070i.m24061i(Wa)) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(5);
        for (int i = 0; i < 5; i++) {
            sb2.append((CharSequence) Wa, 5, 6);
        }
        return sb2.toString();
    }

    public void m2608Vb(boolean z) {
        if (this.f35003R0 != z) {
            this.f35003R0 = z;
            m2270r4().m14783o(new TdApi.SetOption("ignore_sensitive_content_restrictions", new TdApi.OptionValueBoolean(z)), this.f34987M);
        }
    }

    public String m2607Vc() {
        return this.f35057i1;
    }

    public final void m2606Vd(TdApi.UpdateFileGenerationStart updateFileGenerationStart) {
        synchronized (this.f34995O1) {
            C10942l remove = this.f34995O1.remove(updateFileGenerationStart.conversion);
            if (remove != null) {
                remove.f35162e = true;
                remove.f35161d = updateFileGenerationStart.generationId;
                remove.f35160c = updateFileGenerationStart.destinationPath;
                this.f34998P1.put(Long.valueOf(updateFileGenerationStart.generationId), remove);
                remove.f35158a.countDown();
                return;
            }
            m2429h5().m23144E0(updateFileGenerationStart);
        }
    }

    public void m2603W1(Runnable runnable, boolean z) {
        TdApi.AuthorizationState authorizationState;
        if (z || ((authorizationState = this.f34982J1) != null && authorizationState.getConstructor() == 154449270)) {
            this.f35094u2.m18907a(runnable);
        } else {
            runnable.run();
        }
    }

    public void m2602W2(final long j, final AbstractC5918j<TdApi.Chat> jVar) {
        m2579Xa(new Runnable() {
            @Override
            public final void run() {
                C10930q6.this.m2863F7(j, jVar);
            }
        });
    }

    public TdApi.BasicGroup m2601W3(long j) {
        long m = C7316a.m17048m(j);
        if (m != 0) {
            return m2480e2().m1716M(m);
        }
        return null;
    }

    public Client.AbstractC7865g m2600W4() {
        return this.f34996P;
    }

    public CharSequence m2599W5(TdApi.Chat chat, TdApi.InputMessageContent inputMessageContent) {
        if (inputMessageContent != null) {
            switch (inputMessageContent.getConstructor()) {
                case TdApi.InputMessageVideo.CONSTRUCTOR:
                case TdApi.InputMessageAudio.CONSTRUCTOR:
                case TdApi.InputMessageVideoNote.CONSTRUCTOR:
                case TdApi.InputMessageDocument.CONSTRUCTOR:
                case TdApi.InputMessagePhoto.CONSTRUCTOR:
                case TdApi.InputMessageVoiceNote.CONSTRUCTOR:
                    return m2881E5(chat);
                case TdApi.InputMessageSticker.CONSTRUCTOR:
                    return m2539a6(chat);
                case TdApi.InputMessageAnimation.CONSTRUCTOR:
                    return m2945A5(chat);
            }
        }
        return m2817I5(chat);
    }

    public boolean m2598W6(String str, boolean z) {
        if (C5070i.m24061i(str)) {
            return false;
        }
        String G = C5070i.m24071G(str.toLowerCase());
        int indexOf = G.indexOf(47);
        if (indexOf != -1) {
            G = G.substring(0, indexOf);
        }
        if (!C5070i.m24061i(this.f35054h1) && C5070i.m24067c(G, C5070i.m24071G(this.f35054h1))) {
            return true;
        }
        for (String str2 : C7322f.f23232c) {
            if (C5070i.m24067c(G, str2)) {
                return true;
            }
        }
        if (z) {
            for (String str3 : C7322f.f23233d) {
                if (C5070i.m24067c(G, str3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean m2595W9(TdApi.Message message) {
        return (message == null || message.sendingState == null || m2748Ma().m1519c(message.chatId, message.f25406id)) ? false : true;
    }

    public String m2594Wa() {
        TdApi.User Z9 = m2550Z9();
        String str = Z9 != null ? Z9.phoneNumber : null;
        if (C5070i.m24061i(str)) {
            str = this.f34989M1 + this.f34992N1;
        }
        if (C5070i.m24061i(str) || !str.startsWith("999661") || str.length() != 10) {
            return null;
        }
        return str;
    }

    public void m2593Wb(final int i, final AbstractC5918j<TdApi.Error> jVar) {
        m2270r4().m14783o(new TdApi.SetInactiveSessionTtl(i), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C10930q6.this.m2393j9(jVar, i, object);
            }
        });
    }

    public void m2592Wc(final TdApi.Session session, final AbstractC5918j<TdApi.Error> jVar) {
        m2270r4().m14783o(new TdApi.TerminateAllOtherSessions(), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C10930q6.this.m2137z9(jVar, session, object);
            }
        });
    }

    public final void m2591Wd(TdApi.UpdateFileGenerationStop updateFileGenerationStop) {
        synchronized (this.f34995O1) {
            C10942l remove = this.f34998P1.remove(Long.valueOf(updateFileGenerationStop.generationId));
            if (remove != null) {
                Runnable runnable = remove.f35163f;
                if (runnable != null) {
                    runnable.run();
                }
                return;
            }
            m2429h5().m23142F0(updateFileGenerationStop);
        }
    }

    public void m2588X1(Runnable runnable) {
        this.f35082q2.m18907a(runnable);
    }

    public int m2587X2(long j) {
        if (j != 0) {
            return m2572Y2(m2632U2(j));
        }
        return -1;
    }

    public TdApi.SecretChat m2586X3(long j) {
        int n = C7316a.m17047n(j);
        if (n != 0) {
            return m2480e2().m1691S1(n);
        }
        return null;
    }

    public void m2585X4(TdApi.User user) {
        TdApi.ProfilePhoto profilePhoto;
        m2949A1().m1471g0(user);
        TdApi.ProfilePhoto profilePhoto2 = user != null ? user.profilePhoto : null;
        if (profilePhoto2 != null || this.f35070m2 != null) {
            if (profilePhoto2 == null || (profilePhoto = this.f35070m2) == null || profilePhoto2.f25414id != profilePhoto.f25414id || profilePhoto2.small.f25373id != profilePhoto.small.f25373id || profilePhoto2.big.f25373id != profilePhoto.big.f25373id) {
                this.f35070m2 = profilePhoto2;
                if (profilePhoto2 != null) {
                    m2270r4().m14783o(new TdApi.DownloadFile(profilePhoto2.small.f25373id, 4, 0, 0, true), m2764La(false));
                    m2270r4().m14783o(new TdApi.DownloadFile(profilePhoto2.big.f25373id, 3, 0, 0, true), m2764La(true));
                }
            }
        }
    }

    public CharSequence m2584X5(TdApi.Chat chat, TdApi.Message message) {
        if (message != null) {
            switch (message.content.getConstructor()) {
                case TdApi.MessagePhoto.CONSTRUCTOR:
                case TdApi.MessageAudio.CONSTRUCTOR:
                case TdApi.MessageVoiceNote.CONSTRUCTOR:
                case TdApi.MessageDocument.CONSTRUCTOR:
                case TdApi.MessageVideoNote.CONSTRUCTOR:
                case TdApi.MessageVideo.CONSTRUCTOR:
                    return m2881E5(chat);
                case TdApi.MessagePoll.CONSTRUCTOR:
                    return m2705P5(chat);
                case TdApi.MessageAnimation.CONSTRUCTOR:
                    return m2945A5(chat);
                case TdApi.MessageSticker.CONSTRUCTOR:
                    return m2539a6(chat);
            }
        }
        return m2817I5(chat);
    }

    public boolean m2583X6(long j) {
        int d = C7316a.m17057d(j);
        if (d != -1472570774) {
            return d == 973884508;
        }
        return m2299p7(j);
    }

    public String m2580X9(TdApi.Message message) {
        TdApi.User v2;
        if (message == null) {
            return null;
        }
        long j = message.viaBotUserId;
        if (j == 0) {
            j = C7321e.m16984R0(message);
        }
        if (j == 0 || (v2 = m2480e2().m1583v2(j)) == null || C5070i.m24061i(v2.username)) {
            return null;
        }
        return v2.username;
    }

    public void m2579Xa(Runnable runnable) {
        m2564Ya(runnable, 0.0d);
    }

    public void m2578Xb(boolean z) {
        synchronized (this.f35026Z) {
            if (this.f35100x1 != z) {
                this.f35100x1 = z;
                if (!this.f35102y1) {
                    int i = this.f35104z1.get();
                    if (i <= 0) {
                        this.f35020X.m2099x();
                    } else {
                        throw new IllegalStateException("referenceCount == " + i);
                    }
                }
            }
        }
    }

    public void m2577Xc(final TdApi.Session session, final AbstractC5918j<TdApi.Error> jVar) {
        m2270r4().m14783o(new TdApi.TerminateSession(session.f25420id), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C10930q6.this.m2941A9(jVar, session, object);
            }
        });
    }

    public final void m2576Xd(TdApi.UpdateFileRemovedFromDownloads updateFileRemovedFromDownloads) {
        this.f35056i0.m1909R1(updateFileRemovedFromDownloads);
    }

    public void m2573Y1(Runnable runnable) {
        this.f35079p2.m18907a(runnable);
    }

    public int m2572Y2(TdApi.Chat chat) {
        if (chat == null) {
            return -1;
        }
        if (chat.type.getConstructor() == -1472570774) {
            TdApi.Supergroup Y3 = m2571Y3(chat.f25367id);
            if (Y3 == null) {
                return -1;
            }
            boolean z = !C5070i.m24061i(Y3.username) || Y3.hasLinkedChat || Y3.hasLocation;
            boolean s7 = m2251s7(chat.f25367id);
            int constructor = Y3.status.getConstructor();
            if (constructor == -1653518666) {
                return -2;
            }
            if (constructor != -5815259) {
                if (constructor == 1661432998 && !z && !((TdApi.ChatMemberStatusRestricted) Y3.status).isMember) {
                    return s7 ? 1 : -3;
                }
                return 0;
            } else if (z) {
                return 0;
            } else {
                return s7 ? 1 : -3;
            }
        }
        return 0;
    }

    public TdApi.Supergroup m2571Y3(long j) {
        long p = C7316a.m17045p(j);
        if (p != 0) {
            return m2480e2().m1638h2(p);
        }
        return null;
    }

    public void m2570Y4(long j, long j2, TdApi.FormattedText formattedText) {
        C4779t2.m25628O4(formattedText);
        m2892Da(j, j2, formattedText, new TdApi.EditMessageCaption(j, j2, null, formattedText), this.f35013U1);
    }

    public void m2569Y5(boolean z, final AbstractC5918j<C10946p> jVar) {
        if (z) {
            m2579Xa(new Runnable() {
                @Override
                public final void run() {
                    C10930q6.this.m2330n8(jVar);
                }
            });
        } else {
            m2270r4().m14783o(new TdApi.GetActiveSessions(), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    C10930q6.this.m2314o8(jVar, object);
                }
            });
        }
    }

    public boolean m2568Y6(TdApi.Chat chat) {
        if (chat == null) {
            return false;
        }
        int constructor = chat.type.getConstructor();
        if (constructor != -1472570774) {
            return constructor == 973884508;
        }
        return !((TdApi.ChatTypeSupergroup) chat.type).isChannel;
    }

    public TdApi.MessageSender m2565Y9() {
        return new TdApi.MessageSenderUser(m2519ba());
    }

    public void m2564Ya(final Runnable runnable, double d) {
        m2896D6(1);
        m2238t4().m2101v(new Runnable() {
            @Override
            public final void run() {
                C10930q6.this.m2566Y8(runnable);
            }
        }, d);
    }

    public void m2563Yb(final boolean z) {
        if (this.f35036b2 != z) {
            this.f35036b2 = z;
            m2876Ea(new AbstractC5918j() {
                @Override
                public final void mo1330a(Object obj) {
                    C10930q6.this.m2377k9(z, (Client) obj);
                }
            }, null);
        }
    }

    public long m2562Yc(long j, TimeUnit timeUnit) {
        return Math.max(System.currentTimeMillis() - timeUnit.toMillis(j), 0L);
    }

    public final void m2561Yd(TdApi.UpdateGroupCall updateGroupCall) {
        this.f35056i0.m1902T1(updateGroupCall);
    }

    public void m2558Z1(TdApi.Message message, Runnable runnable) {
        TdApi.MessageSendingState messageSendingState = message.sendingState;
        if (messageSendingState == null || messageSendingState.getConstructor() != -1381803582 || m2748Ma().m1519c(message.chatId, message.f25406id)) {
            runnable.run();
            return;
        }
        synchronized (this.f35030a0) {
            if (this.f35016V1 == null) {
                this.f35016V1 = new HashMap();
            }
            String str = message.chatId + "_" + message.f25406id;
            Queue<Runnable> queue = this.f35016V1.get(str);
            if (queue == null) {
                queue = new ArrayDeque<>();
                this.f35016V1.put(str, queue);
            }
            queue.add(runnable);
        }
    }

    public boolean m2557Z2(long j) {
        TdApi.Chat U2;
        return (j == 0 || (U2 = m2632U2(j)) == null || C7317b.m17043a(U2, C7317b.f23225b) == null) ? false : true;
    }

    public TdApi.ChatType m2556Z3(long j) {
        long j2 = 0;
        if (j == 0) {
            return null;
        }
        switch (C7316a.m17057d(j)) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                long p = C7316a.m17045p(j);
                TdApi.Supergroup h2 = m2480e2().m1638h2(p);
                return new TdApi.ChatTypeSupergroup(p, h2 != null && h2.isChannel);
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
                int n = C7316a.m17047n(j);
                TdApi.SecretChat S1 = m2480e2().m1691S1(n);
                if (S1 != null) {
                    j2 = S1.userId;
                }
                return new TdApi.ChatTypeSecret(n, j2);
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                return new TdApi.ChatTypeBasicGroup(C7316a.m17048m(j));
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                return new TdApi.ChatTypePrivate(C7316a.m17044q(j));
            default:
                throw new IllegalArgumentException("chatId == " + j);
        }
    }

    public void m2555Z4(final long j, final long j2, final TdApi.InputMessageText inputMessageText, TdApi.WebPage webPage, boolean z) {
        TdApi.WebPage webPage2 = inputMessageText.disableWebPagePreview ? null : webPage;
        C4779t2.m25628O4(inputMessageText.text);
        final TdApi.MessageText messageText = new TdApi.MessageText(inputMessageText.text, webPage2);
        TdApi.TextEntity[] textEntityArr = inputMessageText.text.entities;
        if ((textEntityArr == null || textEntityArr.length <= 0) && z) {
            m2270r4().m14783o(new TdApi.GetAnimatedEmoji(inputMessageText.text.text), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    C10930q6.this.m2597W7(j, j2, inputMessageText, messageText, object);
                }
            });
        } else {
            m2892Da(j, j2, messageText, new TdApi.EditMessageText(j, j2, null, inputMessageText), this.f35010T1);
        }
    }

    public boolean m2553Z6() {
        return this.f35032a2;
    }

    public TdApi.User m2550Z9() {
        return m2480e2().m1731I0();
    }

    public void m2549Za(Runnable runnable) {
        m2534ab(runnable, 0L);
    }

    public final void m2548Zb(boolean z) {
        if (this.f34984K1 != z) {
            this.f34984K1 = z;
            m2930B4().m4716b1().m1538q(this, z);
        }
    }

    public long m2547Zc() {
        long j = this.f35051g1;
        if (j != 0) {
            return SystemClock.uptimeMillis() - j;
        }
        return 0L;
    }

    public final void m2546Zd(TdApi.UpdateGroupCallParticipant updateGroupCallParticipant) {
        this.f35056i0.m1896V1(updateGroupCallParticipant);
    }

    @Override
    public final int mo1484a() {
        return m2188w6();
    }

    public void m2543a2(Runnable runnable) {
        this.f35085r2.m18907a(runnable);
    }

    public boolean m2542a3(TdApi.Chat chat) {
        if (chat == null) {
            return false;
        }
        boolean i3 = C4779t2.m25499i3(m2787K3(chat.f25367id), false);
        if (i3 || chat.type.getConstructor() == -1472570774) {
            return i3;
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

    public TdApi.User m2541a4(long j) {
        long d4 = m2494d4(j);
        if (d4 != 0) {
            return m2480e2().m1583v2(d4);
        }
        return null;
    }

    public String m2540a5() {
        return C4403w.m27865j1(R.string.email_metadata, "0.24.6.1506-arm64-v8a", this.f35039c1, C10536ab.m4764P0(), C10536ab.m4760Q0());
    }

    public CharSequence m2539a6(TdApi.Chat chat) {
        return m2614V5(chat, R.id.right_sendStickersAndGifs, R.string.ChatDisabledStickers, R.string.ChatRestrictedStickers, R.string.ChatRestrictedStickersUntil);
    }

    public boolean m2538a7() {
        return this.f34984K1;
    }

    public TdApi.UserFullInfo m2535aa() {
        long ba2 = m2519ba();
        if (ba2 != 0) {
            return m2480e2().m1745E2(ba2);
        }
        return null;
    }

    public void m2534ab(final Runnable runnable, long j) {
        m2880E6();
        m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                C10930q6.this.m2551Z8(runnable);
            }
        });
    }

    public boolean m2533ac(TdApi.LanguagePackInfo languagePackInfo) {
        return m2517bc(languagePackInfo.f25405id, true);
    }

    public long m2532ad(long j, TimeUnit timeUnit) {
        return timeUnit.toMillis(j) + (System.currentTimeMillis() - m2898D4());
    }

    public final void m2531ae(TdApi.UpdateInstalledStickerSets updateInstalledStickerSets) {
        if (!updateInstalledStickerSets.isMasks) {
            synchronized (this.f35030a0) {
                this.f35093u1 = updateInstalledStickerSets.stickerSetIds.length;
            }
        }
        this.f35056i0.m1893W1(updateInstalledStickerSets);
    }

    public void m2527b2(Runnable runnable) {
        this.f35088s2.m18907a(runnable);
    }

    public C6246h m2526b3(long j) {
        TdApi.ChatPhotoInfo chatPhotoInfo;
        if (j == 0) {
            return null;
        }
        TdApi.Chat U2 = m2632U2(j);
        if (U2 != null) {
            chatPhotoInfo = U2.photo;
        } else {
            chatPhotoInfo = null;
        }
        if (chatPhotoInfo == null) {
            return null;
        }
        C6246h hVar = new C6246h(this, chatPhotoInfo.small);
        hVar.mo20767t0(C9903a.getDefaultAvatarCacheSize());
        return hVar;
    }

    public TdApi.User m2525b4(TdApi.Chat chat) {
        long e4 = m2478e4(chat);
        if (e4 != 0) {
            return m2480e2().m1583v2(e4);
        }
        return null;
    }

    public double m2524b5() {
        return this.f34973F0;
    }

    public final void m2523b6(final String str, final String[] strArr, final AbstractC5918j<Map<String, TdApi.LanguagePackString>> jVar) {
        m2270r4().m14783o(new TdApi.GetLanguagePackStrings(str, strArr), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C10930q6.m2298p8(AbstractC5918j.this, strArr, str, object);
            }
        });
    }

    public boolean m2522b7() {
        boolean z;
        synchronized (this.f35026Z) {
            if (this.f35020X != null && !this.f35102y1) {
                z = false;
            }
            z = true;
        }
        return z;
    }

    public long m2519ba() {
        return m2480e2().m1727J0();
    }

    public final void m2518bb() {
        m2350m4();
        this.f35041d0.m2080h(this);
        if (C4868i.m24726c2().m24663k1(32L) && !m2658S6()) {
            this.f35044e0.m2080h(this);
        }
    }

    public final boolean m2517bc(String str, boolean z) {
        if (C5070i.m24067c(str, str)) {
            return false;
        }
        this.f35039c1 = str;
        if (!z) {
            return true;
        }
        m2500ce(m2270r4(), false);
        return true;
    }

    public void m2516bd(TdApi.ChatInviteLinkInfo chatInviteLinkInfo) {
        if (chatInviteLinkInfo.chatId != 0) {
            synchronized (this.f35030a0) {
                if (!chatInviteLinkInfo.isPublic && chatInviteLinkInfo.accessibleFor != 0) {
                    this.f35086s0.m23242g(chatInviteLinkInfo.chatId, SystemClock.elapsedRealtime() + TimeUnit.SECONDS.toMillis(chatInviteLinkInfo.accessibleFor));
                }
                this.f35086s0.m23246c(chatInviteLinkInfo.chatId);
            }
        }
    }

    public final void m2515be(TdApi.UpdateLanguagePackStrings updateLanguagePackStrings) {
        if ("android_x".equals(updateLanguagePackStrings.localizationTarget)) {
            m2485dd().sendMessage(m2485dd().obtainMessage(11, updateLanguagePackStrings));
        }
    }

    @Override
    public final C10930q6 mo1480c() {
        return this;
    }

    public int m2512c2() {
        return this.f34967C0;
    }

    public int m2511c3(long j) {
        long j2 = 0;
        if (j == 0) {
            return C4779t2.m25681H0(-1L, m2519ba());
        }
        switch (C7316a.m17057d(j)) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                return C4779t2.m25681H0(-C7316a.m17045p(j), m2519ba());
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
                int n = C7316a.m17047n(j);
                TdApi.SecretChat S1 = n != 0 ? m2480e2().m1691S1(n) : null;
                C11059v7 e2 = m2480e2();
                if (S1 != null) {
                    j2 = S1.userId;
                }
                return e2.m1575x2(j2);
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                return C4779t2.m25681H0(-C7316a.m17048m(j), m2519ba());
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                return m2480e2().m1575x2(C7316a.m17044q(j));
            default:
                throw new RuntimeException();
        }
    }

    public boolean m2510c4(TdApi.Chat chat) {
        TdApi.User b4 = m2525b4(chat);
        return b4 != null && b4.type.getConstructor() == -1807729372;
    }

    public void m2509c5(AbstractC5917i iVar) {
        synchronized (this.f35026Z) {
            if (this.f34978H1 == null) {
                if (this.f35020X == null || this.f35102y1 || this.f35014V.m4680k1()) {
                    this.f34978H1 = null;
                    iVar.mo1322a(m2493d5());
                    return;
                }
                this.f34978H1 = iVar;
                this.f35020X.m2099x();
            }
        }
    }

    public void m2508c6(final TdApi.LanguagePackInfo languagePackInfo, final String[] strArr, final AbstractC5918j<Map<String, TdApi.LanguagePackString>> jVar) {
        if (C5070i.m24061i(languagePackInfo.baseLanguagePackId)) {
            m2523b6(languagePackInfo.f25405id, strArr, jVar);
        } else {
            m2523b6(languagePackInfo.f25405id, strArr, new AbstractC5918j() {
                @Override
                public final void mo1330a(Object obj) {
                    C10930q6.this.m2266r8(strArr, languagePackInfo, jVar, (Map) obj);
                }
            });
        }
    }

    public boolean m2507c7(long j) {
        TdApi.Chat U2;
        if (j == 0 || (U2 = m2632U2(j)) == null) {
            return false;
        }
        if (!C5070i.m24061i(m2446g4(U2))) {
            return true;
        }
        TdApi.Supergroup Y3 = m2571Y3(j);
        if (Y3 != null) {
            return Y3.hasLinkedChat || Y3.hasLocation;
        }
        return false;
    }

    public long m2504ca(boolean z) {
        long ba2 = m2519ba();
        return (ba2 != 0 || !z) ? ba2 : m2949A1().m1458r();
    }

    public void m2503cb(TdApi.Message message) {
        m2485dd().sendMessageDelayed(m2485dd().obtainMessage(4, message), ((TdApi.MessageLocation) message.content).expiresIn * 1000);
    }

    public final void m2502cc(boolean z) {
        if (this.f34972E1 != z) {
            this.f34972E1 = z;
            if (z) {
                this.f34974F1 = true;
            }
            m2930B4().m4726Y2(this.f35017W, z);
            m2302p4();
            if (z) {
                m2440ga().m3070v1(true);
            }
        }
    }

    public void m2501cd(final long j, final long j2, String str, final AbstractC10939i iVar) {
        m2270r4().m14783o(new TdApi.TransferChatOwnership(j, j2, str), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C10930q6.this.m2909C9(iVar, j, j2, object);
            }
        });
    }

    public final void m2500ce(Client client, boolean z) {
        if (z) {
            this.f35039c1 = C4868i.m24726c2().m24751Z0().f25405id;
            client.m14783o(new TdApi.SetOption("language_pack_database_path", new TdApi.OptionValueString(this.f35014V.m4739V1())), this.f34987M);
            client.m14783o(new TdApi.SetOption("localization_target", new TdApi.OptionValueString("android_x")), this.f34987M);
        }
        client.m14783o(new TdApi.SetOption("language_pack_id", new TdApi.OptionValueString(this.f35039c1)), this.f34987M);
    }

    public void m2496d2(TdApi.MessageSender messageSender, boolean z, Client.AbstractC7865g gVar) {
        m2270r4().m14783o(new TdApi.ToggleMessageSenderIsBlocked(messageSender, z), gVar);
    }

    public int m2495d3(TdApi.Chat chat) {
        if (chat != null) {
            switch (chat.type.getConstructor()) {
                case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                    return C4779t2.m25681H0(-((TdApi.ChatTypeSupergroup) chat.type).supergroupId, m2519ba());
                case TdApi.ChatTypeSecret.CONSTRUCTOR:
                case TdApi.ChatTypePrivate.CONSTRUCTOR:
                    long e4 = m2478e4(chat);
                    return m2379k7(e4) ? R.id.theme_color_avatarSavedMessages : m2480e2().m1575x2(e4);
                case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                    return C4779t2.m25681H0(-((TdApi.ChatTypeBasicGroup) chat.type).basicGroupId, m2519ba());
            }
        }
        return C4779t2.m25681H0(-1L, 0L);
    }

    public long m2494d4(long j) {
        if (C7316a.m17052i(j)) {
            return C7316a.m17044q(j);
        }
        if (!C7316a.m17051j(j)) {
            return 0L;
        }
        TdApi.SecretChat S1 = m2480e2().m1691S1(C7316a.m17047n(j));
        if (S1 != null) {
            return S1.userId;
        }
        return 0L;
    }

    public final boolean m2493d5() {
        File file = new File(this.f35037c.databaseDirectory, "db.sqlite-wal");
        boolean z = !file.exists() || file.delete();
        File file2 = new File(this.f35037c.databaseDirectory, "db.sqlite-shm");
        boolean z2 = (!file2.exists() || file2.delete()) && z;
        File file3 = new File(this.f35037c.databaseDirectory, "db.sqlite");
        boolean z3 = (!file3.exists() || file3.delete()) && z2;
        if (z3) {
            this.f34980I1 = true;
        }
        boolean z4 = m2477e5() && z3;
        if (z4) {
            Log.m14719i("Successfully deleted TDLib database, accountId:%d", Integer.valueOf(this.f35017W));
        } else {
            Log.m14724e("Failed to delete TDLib database, accountId:%d", Integer.valueOf(this.f35017W));
        }
        return z4;
    }

    public TdApi.SuggestedAction[] m2492d6() {
        TdApi.SuggestedAction[] suggestedActionArr;
        synchronized (this.f35030a0) {
            suggestedActionArr = (TdApi.SuggestedAction[]) this.f35064k2.toArray(new TdApi.SuggestedAction[0]);
        }
        return suggestedActionArr;
    }

    public boolean m2491d7(long j) {
        if (m2658S6()) {
            return false;
        }
        long p = C7316a.m17045p(j);
        if (p == 0) {
            return false;
        }
        return p == 1084287520 || p == 1266791237 || p == 1492016544 || p == 1227585106 || p == 1116030833;
    }

    public String m2488da() {
        TdApi.User Z9 = m2550Z9();
        if (Z9 == null || C5070i.m24061i(Z9.username)) {
            return null;
        }
        return Z9.username;
    }

    public final void m2487db() {
        long j;
        if (m2278qc()) {
            long J5 = m2801J5();
            long j2 = this.f34966B1;
            if (j2 == 0) {
                Log.m14721i((int) Log.TAG_ACCOUNTS, "Scheduling TDLib restart, accountId:%d, timeout:%d", Integer.valueOf(this.f35017W), Long.valueOf(J5));
                this.f34966B1 = SystemClock.uptimeMillis();
                this.f34964A1 = J5;
                j = 0;
            } else {
                long j3 = this.f34964A1;
                if (j3 != J5) {
                    this.f34964A1 = J5;
                    long uptimeMillis = (j2 + J5) - SystemClock.uptimeMillis();
                    Log.m14721i((int) Log.TAG_ACCOUNTS, "Rescheduling TDLib restart, accountId:%d, timeout:%d (%d->%d)", Integer.valueOf(this.f35017W), Long.valueOf(uptimeMillis), Long.valueOf(j3), Long.valueOf(J5));
                    m2485dd().removeMessages(7);
                    J5 = uptimeMillis;
                    j = 0;
                } else {
                    return;
                }
            }
            if (J5 > j) {
                m2485dd().sendMessageDelayed(m2485dd().obtainMessage(7), J5);
            } else {
                m2615V4();
            }
        } else if (this.f34966B1 != 0) {
            this.f34966B1 = 0L;
            Log.m14721i((int) Log.TAG_ACCOUNTS, "Canceling TDLib restart, accountId:%d, referenceCount:%d, keepAlive:%b", Integer.valueOf(this.f35017W), Integer.valueOf(this.f35104z1.get()), Boolean.valueOf(m2949A1().m1499L()));
            m2485dd().removeMessages(7);
        }
    }

    public void m2486dc(long j, int i) {
        TdApi.ScopeNotificationSettings hb = m2423hb(j);
        TdApi.ChatNotificationSettings I3 = m2819I3(j);
        Objects.requireNonNull(hb);
        Objects.requireNonNull(I3);
        I3.muteFor = i;
        I3.useDefaultMuteFor = i == 0 && hb.muteFor == 0;
        m2763Lb(j, I3);
    }

    public HandlerC10770jj m2485dd() {
        if (this.f35033b == null) {
            synchronized (this.f35029a) {
                if (this.f35033b == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    this.f35033b = new HandlerC10770jj(this);
                    Log.m14721i((int) Log.TAG_ACCOUNTS, "Created UI handler in %dms", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                }
            }
        }
        return this.f35033b;
    }

    public final void m2484de(TdApi.UpdateMessageLiveLocationViewed updateMessageLiveLocationViewed) {
        this.f35056i0.m1852h2(updateMessageLiveLocationViewed);
        this.f35014V.m4735W1().m4356t();
    }

    public C11059v7 m2480e2() {
        return this.f35053h0;
    }

    public boolean m2479e3(long j) {
        long m = C7316a.m17048m(j);
        return m != 0 && m2480e2().m1712N(m);
    }

    public long m2478e4(TdApi.Chat chat) {
        int constructor = chat.type.getConstructor();
        if (constructor == 862366513) {
            return ((TdApi.ChatTypeSecret) chat.type).userId;
        }
        if (constructor != 1579049844) {
            return 0L;
        }
        return ((TdApi.ChatTypePrivate) chat.type).userId;
    }

    public final boolean m2477e5() {
        boolean z;
        loop0: while (true) {
            z = true;
            for (String str : C10536ab.m4820B0(false)) {
                File file = new File(this.f35037c.filesDirectory, str);
                if (file.exists()) {
                    if (!C5068g.m24101b(file, true) || !z) {
                        z = false;
                    }
                }
            }
        }
        for (String str2 : C10536ab.m4820B0(true)) {
            File file2 = new File(this.f35037c.databaseDirectory, str2);
            if (file2.exists()) {
                z = C5068g.m24101b(file2, true) && z;
            }
        }
        return z;
    }

    public void m2476e6(final AbstractC5919k kVar) {
        if (this.f35014V.m4680k1() || m2658S6()) {
            kVar.mo3250a(2);
            return;
        }
        long ba2 = m2519ba();
        if (ba2 == 163957826) {
            kVar.mo3250a(5);
        } else if (ba2 == 7736885) {
            kVar.mo3250a(4);
        } else {
            m2602W2(f34958v2, new AbstractC5918j() {
                @Override
                public final void mo1330a(Object obj) {
                    C10930q6.this.m2218u8(kVar, (TdApi.Chat) obj);
                }
            });
        }
    }

    public boolean m2475e7(long j) {
        long j2 = this.f35066l1;
        return (j2 != 0 && j2 == j) || j == C7316a.m17058c(1271266957L);
    }

    public TdApi.NetworkType m2472ea() {
        return this.f35028Z1;
    }

    public final void m2471eb() {
        if (!this.f35076o2) {
            SyncHelper.m14201b(C1379j0.m37309q(), this.f35017W);
            this.f35076o2 = true;
        }
    }

    public void m2470ec(long j, int i) {
        TdApi.Chat N3 = m2739N3(j);
        Objects.requireNonNull(N3);
        TdApi.NotificationSettingsScope k2 = m2440ga().m3113k2(N3);
        TdApi.ScopeNotificationSettings jb = m2391jb(k2);
        if (jb == null) {
            TdApi.Object s4 = m2254s4(new TdApi.GetScopeNotificationSettings(k2), 0L);
            if (s4 instanceof TdApi.ScopeNotificationSettings) {
                jb = (TdApi.ScopeNotificationSettings) s4;
            }
        }
        Objects.requireNonNull(jb);
        TdApi.ChatNotificationSettings chatNotificationSettings = N3.notificationSettings;
        chatNotificationSettings.muteFor = i;
        chatNotificationSettings.useDefaultMuteFor = i == 0 && jb.muteFor == 0;
        m2763Lb(j, chatNotificationSettings);
    }

    public void m2469ed(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            m2485dd().post(runnable);
        }
    }

    public final void m2468ee(TdApi.UpdateMessageContent updateMessageContent) {
        synchronized (this.f35030a0) {
            if (!C10859mj.m2997b(updateMessageContent.chatId, this.f35034b0.get(Long.valueOf(updateMessageContent.chatId)), updateMessageContent)) {
                this.f35056i0.m1890X1(updateMessageContent);
                int constructor = updateMessageContent.newContent.getConstructor();
                if (constructor == -662130099) {
                    m2781K9().m1952G2(((TdApi.MessagePoll) updateMessageContent.newContent).poll);
                } else if (constructor == 303973492) {
                    m2480e2().m1587u2(updateMessageContent.chatId, updateMessageContent.messageId, (TdApi.MessageLocation) updateMessageContent.newContent);
                }
            }
        }
    }

    public long m2464f2(long j) {
        long Zc = m2547Zc();
        return Zc != 0 ? Math.max(0L, j - Zc) : j;
    }

    public boolean m2463f3(long j) {
        TdApi.Chat U2 = m2632U2(j);
        return U2 != null && U2.isBlocked;
    }

    public String m2462f4(long j) {
        if (j == 0) {
            return null;
        }
        switch (C7316a.m17057d(j)) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                TdApi.Supergroup h2 = m2480e2().m1638h2(C7316a.m17045p(j));
                if (h2 == null || C5070i.m24061i(h2.username)) {
                    return null;
                }
                return h2.username;
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
                TdApi.SecretChat S1 = m2480e2().m1691S1(C7316a.m17047n(j));
                if (S1 != null) {
                    return m2480e2().m1694R2(S1.userId);
                }
                return null;
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                return null;
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                return m2480e2().m1694R2(C7316a.m17044q(j));
            default:
                throw new RuntimeException();
        }
    }

    public void m2461f5(long j, String str, TdApi.SearchMessagesFilter searchMessagesFilter, AbstractC5918j<List<TdApi.Message>> jVar) {
        TdApi.Function function;
        ArrayList arrayList = new ArrayList();
        boolean z = !C5070i.m24061i(str) || searchMessagesFilter != null;
        if (z) {
            function = new TdApi.SearchChatMessages(j, str, null, 0L, 0, 100, searchMessagesFilter, 0L);
        } else {
            function = new TdApi.GetChatHistory(j, 0L, 0, 0, false);
        }
        TdApi.Function function2 = function;
        m2270r4().m14783o(function2, new C10935e(jVar, arrayList, z, function2));
    }

    public int m2460f6(TdApi.ChatList chatList) {
        int i;
        synchronized (this.f35030a0) {
            i = m2189w5(chatList).f33873a;
        }
        return i;
    }

    public boolean m2459f7(TdApi.Message message, TdApi.Message message2) {
        TdApi.MessageForwardInfo messageForwardInfo = message.forwardInfo;
        String str = null;
        String str2 = messageForwardInfo != null ? messageForwardInfo.publicServiceAnnouncementType : null;
        TdApi.MessageForwardInfo messageForwardInfo2 = message2.forwardInfo;
        if (messageForwardInfo2 != null) {
            str = messageForwardInfo2.publicServiceAnnouncementType;
        }
        return C7321e.m16975W(message.senderId, message2.senderId) && C5070i.m24067c(str2, str);
    }

    public final C10941k m2456fa() {
        Object[] objArr = new Object[4];
        objArr[0] = Boolean.valueOf(this.f35020X != null);
        objArr[1] = Integer.valueOf(this.f35017W);
        objArr[2] = Boolean.valueOf(m2658S6());
        objArr[3] = Boolean.valueOf(this.f35102y1);
        Log.m14719i("Creating TDLib client, hasInstance:%b, accountId:%d, debug:%b, wasPaused:%b", objArr);
        this.f35102y1 = false;
        return new C10941k(this);
    }

    public void m2455fb(AbstractC4761s4 s4Var, int i, int i2, int i3, long j) {
        int i4 = i + 100000;
        if (j > 0) {
            m2485dd().sendMessageDelayed(m2485dd().obtainMessage(i4, i2, i3, s4Var), j);
        } else {
            m2485dd().sendMessage(m2485dd().obtainMessage(i4, i2, i3, s4Var));
        }
    }

    public final void m2454fc(boolean z) {
        if (this.f35073n2 != z) {
            this.f35073n2 = z;
            if (z) {
                m2471eb();
            } else {
                m2677R2();
            }
        }
    }

    public String m2453fd() {
        return this.f35017W + "." + this.f35089t0;
    }

    public final void m2452fe(TdApi.UpdateMessageContentOpened updateMessageContentOpened) {
        this.f35056i0.m1884Z1(updateMessageContentOpened);
    }

    public long m2448g2() {
        return this.f35060j1;
    }

    public boolean m2447g3(TdApi.Chat chat) {
        return chat != null && m2463f3(chat.f25367id);
    }

    public String m2446g4(TdApi.Chat chat) {
        if (chat == null) {
            return null;
        }
        switch (chat.type.getConstructor()) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                TdApi.Supergroup h2 = m2480e2().m1638h2(((TdApi.ChatTypeSupergroup) chat.type).supergroupId);
                if (h2 == null || C5070i.m24061i(h2.username)) {
                    return null;
                }
                return h2.username;
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                return m2480e2().m1694R2(m2478e4(chat));
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                return null;
            default:
                throw new RuntimeException();
        }
    }

    public <T extends C4868i.AbstractC4872d> void m2445g5(final AbstractC5918j<List<T>> jVar, final String str, final AbstractC5913e<T> eVar, final AbstractC5913e<T> eVar2, final AbstractC5107c1<T, TdApi.Message> c1Var) {
        m2238t4().f35157c.m4264j(new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                C10930q6.this.m2582X7(eVar, c1Var, eVar2, jVar, (List) obj);
            }
        }, new AbstractC5912d() {
            @Override
            public final boolean mo1511a(Object obj) {
                boolean Y7;
                Y7 = C10930q6.m2567Y7(str, (TdApi.Message) obj);
                return Y7;
            }
        });
    }

    public C11164z6 m2444g6() {
        this.f35078p1.m1326d(this);
        return this.f35078p1;
    }

    public boolean m2443g7(long j) {
        return m2379k7(C7316a.m17044q(j));
    }

    public C10827lb m2440ga() {
        return this.f35077p0;
    }

    public int m2439gb(TdApi.NotificationSettingsScope notificationSettingsScope) {
        TdApi.ScopeNotificationSettings M0 = this.f35077p0.m3195M0(notificationSettingsScope);
        if (M0 != null) {
            return M0.muteFor;
        }
        return 0;
    }

    public void m2438gc(final TdApi.NetworkType networkType) {
        this.f35028Z1 = networkType;
        m2876Ea(new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                C10930q6.this.m2361l9(networkType, (Client) obj);
            }
        }, null);
        m2781K9().m1937K1(networkType);
    }

    public String m2437gd(long j) {
        return this.f35017W + "." + this.f35089t0 + "." + j;
    }

    public final void m2436ge(TdApi.UpdateMessageEdited updateMessageEdited) {
        this.f35056i0.m1876b2(updateMessageEdited);
    }

    public long m2432h2() {
        return this.f35063k1;
    }

    public boolean m2431h3(long j) {
        return false;
    }

    public boolean m2430h4(TdApi.Chat chat) {
        TdApi.User b4;
        if (chat == null) {
            return false;
        }
        int constructor = chat.type.getConstructor();
        if (constructor != -1472570774) {
            return (constructor == 862366513 || constructor == 1579049844) && (b4 = m2525b4(chat)) != null && b4.isVerified;
        }
        TdApi.Supergroup h2 = m2480e2().m1638h2(C7316a.m17045p(chat.f25367id));
        return h2 != null && h2.isVerified;
    }

    public C5365w m2429h5() {
        return this.f35080q0;
    }

    public int m2428h6() {
        return m2444g6().m1328b();
    }

    public boolean m2427h7(TdApi.Chat chat) {
        return chat != null && m2443g7(chat.f25367id);
    }

    public final void m2424ha(long j, long j2) {
        synchronized (this.f35030a0) {
            Map<String, Queue<Runnable>> map = this.f35016V1;
            if (map != null) {
                Queue<Runnable> remove = map.remove(j + "_" + j2);
                if (remove != null) {
                    for (Runnable runnable : remove) {
                        runnable.run();
                    }
                }
            }
        }
    }

    public TdApi.ScopeNotificationSettings m2423hb(long j) {
        return this.f35077p0.m3203K0(j);
    }

    public void m2422hc(final boolean z) {
        if (this.f35032a2 != z) {
            this.f35032a2 = z;
            Log.m14719i("SetOnline accountId:%d -> %b", Integer.valueOf(this.f35017W), Boolean.valueOf(z));
            m2876Ea(new AbstractC5918j() {
                @Override
                public final void mo1330a(Object obj) {
                    C10930q6.this.m2345m9(z, (Client) obj);
                }
            }, null);
        }
    }

    public final void m2421hd(TdApi.UpdateAnimatedEmojiMessageClicked updateAnimatedEmojiMessageClicked) {
        this.f35056i0.m1978A0(updateAnimatedEmojiMessageClicked);
    }

    public final void m2420he(TdApi.UpdateMessageInteractionInfo updateMessageInteractionInfo) {
        this.f35056i0.m1868d2(updateMessageInteractionInfo);
    }

    public long m2416i2(TdApi.Message message) {
        return message.isOutgoing ? m2494d4(message.chatId) : m2939Ab(message);
    }

    public boolean m2415i3(long j) {
        TdApi.Chat U2 = m2632U2(j);
        return U2 != null && U2.hasScheduledMessages;
    }

    public List<TdApi.Chat> m2414i4(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        synchronized (this.f35030a0) {
            for (long j : jArr) {
                TdApi.Chat chat = this.f35034b0.get(Long.valueOf(j));
                if (!C10859mj.m2998a(j, chat)) {
                    arrayList.add(chat);
                }
            }
        }
        return arrayList;
    }

    public C10756j9 m2413i5() {
        return this.f35059j0;
    }

    @Override
    public void mo2412i6(long j, long j2) {
        if (C5063c.m24143c(j, 32L) != C5063c.m24143c(j2, 32L) && !m2658S6()) {
            if (!C5063c.m24143c(j, 32L) || this.f35044e0.m2082f()) {
                m2781K9().m1971C(2);
            } else {
                this.f35044e0.m2080h(this);
            }
        }
    }

    public boolean m2411i7(TdApi.Message message) {
        return message != null && (message.isOutgoing || m2395j7(message.senderId));
    }

    public TdApi.Chat m2408ia(TdApi.Object object) {
        return m2632U2(((TdApi.Chat) object).f25367id);
    }

    public TdApi.ScopeNotificationSettings m2407ib(TdApi.Chat chat) {
        return this.f35077p0.m3199L0(chat);
    }

    public void m2406ic(TdApi.Chat chat, C10940j jVar) {
        if (chat == null) {
            return;
        }
        if (jVar == null || !C4862d.m24931z(jVar.f35141a)) {
            m2843Gb(chat, null);
        } else {
            m2843Gb(chat, jVar.toString());
        }
    }

    public final void m2405id(TdApi.UpdateAnimationSearchParameters updateAnimationSearchParameters) {
    }

    public final void m2404ie(TdApi.UpdateMessageIsPinned updateMessageIsPinned) {
        this.f35056i0.m1860f2(updateMessageIsPinned);
    }

    public boolean m2400j2(TdApi.Chat chat) {
        TdApi.User b4 = m2525b4(chat);
        if (b4 == null) {
            return false;
        }
        int constructor = b4.type.getConstructor();
        if (constructor == -598644325) {
            return true;
        }
        if (constructor != 1262387765) {
            return false;
        }
        return ((TdApi.UserTypeBot) b4.type).canJoinGroups;
    }

    public C5386e m2399j3(long j) {
        if (j != 0) {
            switch (C7316a.m17057d(j)) {
                case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                    return C4779t2.m25722B1(m2691Q3(j));
                case TdApi.ChatTypeSecret.CONSTRUCTOR:
                case TdApi.ChatTypePrivate.CONSTRUCTOR:
                    return C4779t2.m25701E1(m2541a4(m2494d4(j)));
            }
        }
        return C4779t2.m25729A1();
    }

    public boolean m2398j4(boolean z, boolean z2) {
        ArrayList arrayList;
        int T1 = m2648T1();
        if (!(T1 == 2 || T1 == 1)) {
            return false;
        }
        String str = this.f35017W + "_app_version";
        if (T1 == 1 || z) {
            C4868i.m24726c2().m24581u3(str, 1506);
            return z;
        }
        int V0 = !z2 ? C4868i.m24726c2().m24779V0(str, 0) : 0;
        if (V0 != 1506) {
            final ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            if (m2286q4(V0, 906, z2)) {
                arrayList = arrayList3;
                m2749M9(0, 20, 6, 906, "http://telegra.ph/Telegram-X-03-26", arrayList3, arrayList2, false);
            } else {
                arrayList = arrayList3;
            }
            if (m2286q4(V0, 967, z2)) {
                m2749M9(0, 20, 10, 967, "http://telegra.ph/Telegram-X-07-27", arrayList, arrayList2, false);
            }
            if (m2286q4(V0, 1005, z2)) {
                m2749M9(0, 21, 1, 1005, "https://telegra.ph/Telegram-X-10-14", arrayList, arrayList2, false);
            }
            m2286q4(V0, 1010, z2);
            if (m2286q4(V0, 1149, z2)) {
                m2749M9(0, 21, 7, 1149, "https://telegra.ph/Telegram-X-04-25", arrayList, arrayList2, false);
            }
            if (m2286q4(V0, 1270, z2)) {
                m2749M9(0, 22, 4, 1270, "https://telegra.ph/Telegram-X-01-23-2", arrayList, arrayList2, false);
            }
            if (m2286q4(V0, 1302, z2)) {
                m2749M9(0, 22, 5, 1302, "https://telegra.ph/Telegram-X-02-29", arrayList, arrayList2, false);
            }
            if (m2286q4(V0, 1361, z2)) {
                m2749M9(0, 22, 8, 1361, "https://telegra.ph/Telegram-X-04-23", arrayList, arrayList2, false);
            }
            if (m2286q4(V0, 1470, z2)) {
                m2749M9(0, 24, 2, 1470, "https://telegra.ph/Telegram-X-11-08", arrayList, arrayList2, true);
            }
            if (!arrayList2.isEmpty()) {
                m2896D6(1);
                ArrayList<TdApi.Function> arrayList4 = arrayList;
                arrayList4.add(new TdApi.CreatePrivateChat(777000L, false));
                long j = this.f35069m1;
                if (!(j == 0 || j == 777000)) {
                    arrayList4.add(new TdApi.GetChat(j));
                }
                final AtomicInteger atomicInteger = new AtomicInteger(arrayList4.size());
                Client.AbstractC7865g n6Var = new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        C10930q6.this.m2799J7(atomicInteger, arrayList2, object);
                    }
                };
                for (TdApi.Function function : arrayList4) {
                    m2270r4().m14783o(function, n6Var);
                }
            }
            C4868i.m24726c2().m24581u3(str, 1506);
        }
        return true;
    }

    public TdApi.DiceStickers m2397j5(String str, int i, TdApi.DiceStickers diceStickers) {
        TdApi.Sticker k5;
        return (!C4779t2.f16222G.f16283a.equals(str) || (k5 = m2381k5(i)) == null) ? diceStickers : new TdApi.DiceStickersRegular(k5);
    }

    public String m2396j6() {
        return this.f35031a1;
    }

    public boolean m2395j7(TdApi.MessageSender messageSender) {
        return messageSender != null && m2379k7(C7321e.m16982S0(messageSender));
    }

    public Client.AbstractC7865g m2392ja() {
        return this.f34987M;
    }

    public TdApi.ScopeNotificationSettings m2391jb(TdApi.NotificationSettingsScope notificationSettingsScope) {
        return this.f35077p0.m3195M0(notificationSettingsScope);
    }

    public void m2390jc(int i, String str, int i2, TdApi.ProxyType proxyType) {
        TdApi.Function function;
        if (str != null) {
            function = new TdApi.AddProxy(str, i2, true, proxyType);
        } else {
            function = new TdApi.DisableProxy();
        }
        m2270r4().m14783o(function, C11032u2.f35401a);
    }

    public final void m2389jd(p350yd.C10930q6.C10941k r12, org.drinkless.p210td.libcore.telegram.TdApi.AuthorizationState r13) {
        throw new UnsupportedOperationException("Method not decompiled: p350yd.C10930q6.m2389jd(yd.q6$k, org.drinkless.td.libcore.telegram.TdApi$AuthorizationState):void");
    }

    public final void m2388je(TdApi.UpdateMessageMentionRead updateMessageMentionRead) {
        synchronized (this.f35030a0) {
            TdApi.Chat chat = this.f35034b0.get(Long.valueOf(updateMessageMentionRead.chatId));
            if (!C10859mj.m2997b(updateMessageMentionRead.chatId, chat, updateMessageMentionRead)) {
                int i = chat.unreadMentionCount;
                boolean z = true;
                boolean z2 = i > 0;
                int i2 = updateMessageMentionRead.unreadMentionCount;
                boolean z3 = z2 != (i2 > 0);
                if (i == i2) {
                    z = false;
                }
                chat.unreadMentionCount = i2;
                this.f35056i0.m1840k2(updateMessageMentionRead, z, z3);
            }
        }
    }

    public boolean m2384k2(TdApi.Chat chat) {
        return m2629U5(chat, R.id.right_embedLinks) == null;
    }

    public C5386e m2383k3(TdApi.Chat chat) {
        if (chat != null) {
            switch (chat.type.getConstructor()) {
                case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                    return C4779t2.m25722B1(m2661S3(chat));
                case TdApi.ChatTypeSecret.CONSTRUCTOR:
                case TdApi.ChatTypePrivate.CONSTRUCTOR:
                    return C4779t2.m25701E1(m2525b4(chat));
            }
        }
        return C4779t2.m25729A1();
    }

    public void m2382k4() {
        m2366l4(m2270r4(), false);
    }

    public final TdApi.Sticker m2381k5(int i) {
        TdApi.Sticker[] stickerArr;
        String[] strArr;
        char c;
        int i2;
        if (!C4868i.m24726c2().m24663k1(32L)) {
            return null;
        }
        TdApi.StickerSet stickerSet = this.f35044e0.f35183b;
        if (stickerSet != null) {
            String D0 = C4403w.m27998D0();
            String Z = C4403w.m27911Z();
            String T = C5078d.m24013T(i);
            TdApi.Sticker sticker = null;
            int i3 = 0;
            for (TdApi.Sticker sticker2 : stickerSet.stickers) {
                int i4 = -1;
                char c2 = 0;
                for (String str : stickerSet.emojis[i3].emojis) {
                    stickerSet = stickerSet;
                    if (str.equals(D0)) {
                        i2 = i4;
                        c = 2;
                    } else if (str.equals(Z)) {
                        i2 = i4;
                        c = 1;
                    } else if (str.equals(C4779t2.f16222G.f16283a)) {
                        c = c2;
                        i2 = 1;
                    } else if (str.equals(T)) {
                        i2 = i;
                        c = c2;
                    } else {
                        continue;
                    }
                    i4 = i2;
                    if (i2 == i) {
                        if (c == 2) {
                            return sticker2;
                        }
                        if (c == 1) {
                            c2 = c;
                            sticker = sticker2;
                        }
                    }
                    c2 = c;
                }
                i3++;
            }
            if (sticker != null) {
                return sticker;
            }
        }
        TdApi.Sticker d = this.f35044e0.m2084d(i);
        if (d != null) {
            return d;
        }
        if (i != 1) {
            return null;
        }
        TdApi.Sticker e = this.f35044e0.m2083e(C4403w.m27998D0());
        if (e != null) {
            return e;
        }
        TdApi.Sticker e2 = this.f35044e0.m2083e(C4403w.m27911Z());
        return e2 != null ? e2 : this.f35044e0.m2083e(C4779t2.f16222G.f16283a);
    }

    public String m2380k6(String str) {
        Uri parse;
        List<String> pathSegments;
        if (C5070i.m24061i(str)) {
            return null;
        }
        try {
            parse = Uri.parse(str);
        } catch (Throwable unused) {
        }
        if (!"tg".equals(parse.getScheme())) {
            if (C5070i.m24061i(parse.getScheme())) {
                parse = Uri.parse("http://" + str);
            }
            if (m2598W6(parse.getHost(), false) && (pathSegments = parse.getPathSegments()) != null && pathSegments.size() == 2 && "bg".equalsIgnoreCase(pathSegments.get(0))) {
                String query = parse.getQuery();
                if (C5070i.m24061i(query)) {
                    return pathSegments.get(1);
                }
                return pathSegments.get(1) + "?" + query;
            }
            return null;
        } else if (!"bg".equals(parse.getHost())) {
            return null;
        } else {
            String queryParameter = parse.getQueryParameter("slug");
            if (C5070i.m24061i(queryParameter)) {
                return parse.getQueryParameter("color");
            }
            String queryParameter2 = parse.getQueryParameter("bg_color");
            String queryParameter3 = parse.getQueryParameter("intensity");
            if (C5070i.m24061i(queryParameter2) && C5070i.m24061i(queryParameter3)) {
                return queryParameter;
            }
            StringBuilder sb2 = new StringBuilder(queryParameter);
            sb2.append("?");
            if (!C5070i.m24061i(queryParameter2)) {
                sb2.append("bg_color=");
                sb2.append(queryParameter2);
            }
            if (!C5070i.m24061i(queryParameter3)) {
                if (!C5070i.m24061i(queryParameter2)) {
                    sb2.append("&");
                }
                sb2.append("intensity=");
                sb2.append(queryParameter3);
            }
            return sb2.toString();
        }
    }

    public boolean m2379k7(long j) {
        return j != 0 && j == m2504ca(true);
    }

    public Client.AbstractC7865g m2376ka(final Runnable runnable) {
        if (runnable != null) {
            return new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    C10930q6.this.m2814I8(runnable, object);
                }
            };
        }
        return m2392ja();
    }

    public void m2375kb(String str, int i, Client.AbstractC7865g gVar) {
        m2270r4().m14783o(new TdApi.SearchContacts(str, i), gVar);
    }

    public void m2374kc(final TdApi.NotificationSettingsScope notificationSettingsScope, final int i) {
        TdApi.ScopeNotificationSettings jb = m2391jb(notificationSettingsScope);
        if (jb != null) {
            jb.muteFor = i;
            m2358lc(notificationSettingsScope, jb);
            return;
        }
        m2270r4().m14783o(new TdApi.GetScopeNotificationSettings(notificationSettingsScope), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C10930q6.this.m2313o9(i, notificationSettingsScope, object);
            }
        });
    }

    public final void m2373kd(TdApi.UpdateCall updateCall) {
        if (C4779t2.m25686G2(updateCall.call)) {
            C6038h<TdApi.Call> hVar = this.f35058i2;
            TdApi.Call call = updateCall.call;
            hVar.m21466j(call.f25364id, call);
        } else {
            this.f35058i2.m21465k(updateCall.call.f25364id);
        }
        m2623Ub(!this.f35058i2.m21468h());
        m2485dd().sendMessage(m2485dd().obtainMessage(2, updateCall));
        this.f35056i0.m1954G0(updateCall);
    }

    public final void m2372ke(TdApi.UpdateMessageSendFailed updateMessageSendFailed) {
        C1379j0.m37302t0(new TdApi.Error(updateMessageSendFailed.errorCode, updateMessageSendFailed.errorMessage));
        synchronized (this.f35030a0) {
            C4868i c2 = C4868i.m24726c2();
            int i = this.f35017W;
            TdApi.Message message = updateMessageSendFailed.message;
            c2.m24650l6(i, message.chatId, updateMessageSendFailed.oldMessageId, message.f25406id);
        }
        this.f35056i0.m1820p2(updateMessageSendFailed);
        this.f35068m0.m1516f(updateMessageSendFailed.message.chatId, updateMessageSendFailed.oldMessageId);
        this.f35014V.m4716b1().m1535t(this, updateMessageSendFailed);
        m2805J1(updateMessageSendFailed.message.chatId, updateMessageSendFailed.oldMessageId, false);
    }

    public boolean m2368l2(TdApi.ChatList chatList, TdApi.Chat chat) {
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
                return !m2443g7(chat.f25367id) && !m2363l7(chat.f25367id);
            }
            if (constructor == 362770115) {
                return true;
            }
        }
        return false;
    }

    public C10684g8 m2367l3(TdApi.ChatList chatList) {
        C10684g8 m3;
        synchronized (this.f35030a0) {
            m3 = m2351m3(chatList);
        }
        return m3;
    }

    public final void m2366l4(Client client, boolean z) {
        int Y0 = m2930B4().m4728Y0();
        String S5 = m2659S5();
        if (!C5070i.m24061i(S5) && (Y0 == 0 || Y0 == 2)) {
            Y0 = 3;
        }
        if (Y0 != 0) {
            String X0 = m2930B4().m4732X0();
            ArrayList arrayList = new ArrayList();
            if (Y0 == 1) {
                arrayList.add(new TdApi.JsonObjectMember("device_token", new TdApi.JsonValueString("FIREBASE_ERROR")));
                if (!C5070i.m24061i(X0)) {
                    arrayList.add(new TdApi.JsonObjectMember("firebase_error", new TdApi.JsonValueString(X0)));
                }
            } else if (Y0 == 2) {
                arrayList.add(new TdApi.JsonObjectMember("device_token", new TdApi.JsonValueString("FIREBASE_INITIALIZING")));
            } else if (Y0 != 3) {
                arrayList.add(new TdApi.JsonObjectMember("device_token", new TdApi.JsonValueString("UNKNOWN")));
            } else {
                arrayList.add(new TdApi.JsonObjectMember("device_token", new TdApi.JsonValueString(S5)));
            }
            String e = C7318c.m17032e(arrayList);
            if (e == null) {
                return;
            }
            if (z || !C5070i.m24067c(this.f35022X1, e)) {
                this.f35022X1 = e;
                client.m14783o(new TdApi.SetOption("connection_parameters", new TdApi.OptionValueString(e)), this.f34987M);
            }
        }
    }

    public TdApi.Sticker m2365l5(String str) {
        return this.f35041d0.m2083e(str);
    }

    public void m2364l6(Message message) {
        int i = message.what;
        boolean z = false;
        switch (i) {
            case 1:
                this.f35062k0.m3284y((TdApi.UpdateChatAction) message.obj);
                return;
            case 2:
                this.f35053h0.m1631j1((TdApi.UpdateCall) message.obj);
                return;
            case 3:
                TdApi.ChatList chatList = (TdApi.ChatList) message.obj;
                int i2 = message.arg1;
                if (message.arg2 == 1) {
                    z = true;
                }
                m2660S4(chatList, i2, z);
                return;
            case 4:
                m2480e2().m1643g1((TdApi.Message) message.obj);
                return;
            case 5:
                m2480e2().m1655d1(message.arg1, message.arg2);
                return;
            case 6:
                m2480e2().m1659c1(message.arg1, message.arg2);
                return;
            case 7:
                m2630U4();
                return;
            case 8:
                C11059v7 e2 = m2480e2();
                TdApi.UpdateUserStatus updateUserStatus = (TdApi.UpdateUserStatus) message.obj;
                if (message.arg1 == 1) {
                    z = true;
                }
                e2.m1588u1(updateUserStatus, z);
                return;
            case 9:
                m2485dd().m3423w3((TdApi.UpdateTermsOfService) message.obj);
                return;
            case 10:
            default:
                if (i >= 100000) {
                    ((AbstractC4761s4) message.obj).mo25976b5(i - 100000, message.arg1, message.arg2);
                    return;
                }
                return;
            case 11:
                C4403w.m27908Z2((TdApi.UpdateLanguagePackStrings) message.obj);
                return;
        }
    }

    public boolean m2363l7(long j) {
        long j2 = this.f35069m1;
        return (j2 != 0 && j2 == j) || j == C7316a.m17058c(777000L);
    }

    public final void m2360la() {
        m2638Tb(false);
        this.f35082q2.m18904d();
    }

    public TdApi.Chat m2359lb() {
        return m2632U2(m2343mb());
    }

    public void m2358lc(TdApi.NotificationSettingsScope notificationSettingsScope, TdApi.ScopeNotificationSettings scopeNotificationSettings) {
        m2270r4().m14783o(new TdApi.SetScopeNotificationSettings(notificationSettingsScope, scopeNotificationSettings), this.f34987M);
    }

    public final void m2357ld(TdApi.UpdateNewCallSignalingData updateNewCallSignalingData) {
        this.f35056i0.m1784y2(updateNewCallSignalingData);
    }

    public final void m2356le(TdApi.UpdateMessageSendSucceeded updateMessageSendSucceeded) {
        synchronized (this.f35030a0) {
            C4868i c2 = C4868i.m24726c2();
            int i = this.f35017W;
            TdApi.Message message = updateMessageSendSucceeded.message;
            c2.m24650l6(i, message.chatId, updateMessageSendSucceeded.oldMessageId, message.f25406id);
        }
        m2424ha(updateMessageSendSucceeded.message.chatId, updateMessageSendSucceeded.oldMessageId);
        this.f35056i0.m1812r2(updateMessageSendSucceeded);
        this.f35077p0.m3230D1(updateMessageSendSucceeded);
        this.f35068m0.m1515g(updateMessageSendSucceeded.message.chatId, updateMessageSendSucceeded.oldMessageId);
        this.f35014V.m4716b1().m1534u(this, updateMessageSendSucceeded);
        this.f35053h0.m1724K(updateMessageSendSucceeded.message);
        m2805J1(updateMessageSendSucceeded.message.chatId, updateMessageSendSucceeded.oldMessageId, false);
    }

    public boolean m2352m2(TdApi.Chat chat) {
        return m2336n2(chat, true);
    }

    public final C10684g8 m2351m3(TdApi.ChatList chatList) {
        String o4 = C4779t2.m25456o4(chatList);
        C10684g8 g8Var = this.f35038c0.get(o4);
        if (g8Var != null) {
            return g8Var;
        }
        C10684g8 g8Var2 = new C10684g8(this, chatList);
        this.f35038c0.put(o4, g8Var2);
        return g8Var2;
    }

    public void m2350m4() {
        m2579Xa(new Runnable() {
            @Override
            public final void run() {
                C10930q6.this.m2783K7();
            }
        });
    }

    public void m2349m5(final p139jb.AbstractC5918j<p350yd.C10930q6.C10949s> r8) {
        throw new UnsupportedOperationException("Method not decompiled: p350yd.C10930q6.m2349m5(jb.j):void");
    }

    public boolean m2348m6() {
        return m2460f6(C7317b.f23225b) > 0;
    }

    public boolean m2347m7(TdApi.SuggestedAction suggestedAction) {
        return suggestedAction.getConstructor() == 648771563 || suggestedAction.getConstructor() == 1910534839;
    }

    public final void m2344ma() {
        this.f35079p2.m18904d();
        this.f35085r2.m18904d();
        this.f35082q2.m18904d();
    }

    public long m2343mb() {
        return C7316a.m17058c(m2519ba());
    }

    public final void m2342mc(String str, TdApi.LanguagePackInfo languagePackInfo) {
        if (C5070i.m24067c(this.f35042d1, str) && this.f35045e1 == null) {
            this.f35045e1 = languagePackInfo;
            m2781K9().m1928M2(str, languagePackInfo);
        }
    }

    public final void m2341md(TdApi.UpdateChatActionBar updateChatActionBar) {
        synchronized (this.f35030a0) {
            TdApi.Chat chat = this.f35034b0.get(Long.valueOf(updateChatActionBar.chatId));
            if (!C10859mj.m2997b(updateChatActionBar.chatId, chat, updateChatActionBar)) {
                chat.actionBar = updateChatActionBar.actionBar;
                this.f35056i0.m1950H0(updateChatActionBar);
            }
        }
    }

    public final void m2340me(TdApi.UpdateMessageUnreadReactions updateMessageUnreadReactions) {
        this.f35056i0.m1804t2(updateMessageUnreadReactions);
    }

    public boolean m2336n2(org.drinkless.p210td.libcore.telegram.TdApi.Chat r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: p350yd.C10930q6.m2336n2(org.drinkless.td.libcore.telegram.TdApi$Chat, boolean):boolean");
    }

    public final C10684g8[] m2335n3(TdApi.ChatPosition[] chatPositionArr) {
        if (chatPositionArr == null || chatPositionArr.length == 0) {
            return null;
        }
        C10684g8[] g8VarArr = new C10684g8[chatPositionArr.length];
        for (int i = 0; i < chatPositionArr.length; i++) {
            g8VarArr[i] = m2351m3(chatPositionArr[i].list);
        }
        return g8VarArr;
    }

    public synchronized void m2334n4(final Runnable runnable) {
        final String W0 = this.f35014V.m4736W0();
        if (!C5070i.m24061i(W0) && m2648T1() == 2) {
            final long ba2 = m2519ba();
            if (ba2 != 0) {
                final long[] Z = this.f35014V.m4725Z(this.f35100x1);
                final long[] y = C5062b.m24147y(Z, Arrays.binarySearch(Z, ba2));
                if (C10733ic.m4115j(m2188w6(), ba2, W0, y, false)) {
                    Log.m14721i(4, "Device token already registered. accountId:%d", Integer.valueOf(this.f35017W));
                    this.f35014V.m4758Q2(this.f35017W, true);
                    C7389v0.m16743D2(runnable);
                    return;
                }
                Log.m14721i(4, "Registering device token... accountId:%d", Integer.valueOf(this.f35017W));
                this.f35014V.m4758Q2(this.f35017W, false);
                TdApi.DeviceTokenFirebaseCloudMessaging deviceTokenFirebaseCloudMessaging = new TdApi.DeviceTokenFirebaseCloudMessaging(W0, true);
                m2896D6(1);
                m2270r4().m14783o(new TdApi.RegisterDevice(deviceTokenFirebaseCloudMessaging, y), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        C10930q6.this.m2751M7(W0, y, ba2, Z, runnable, object);
                    }
                });
            }
        }
    }

    public void m2333n5(C10942l lVar, TdApi.Error error) {
        synchronized (this.f34995O1) {
            this.f34998P1.remove(Long.valueOf(lVar.f35161d));
        }
        m2270r4().m14783o(new TdApi.FinishFileGeneration(lVar.f35161d, error), m2214uc());
    }

    public boolean m2332n6() {
        return !C5070i.m24061i(this.f34992N1) || !C5070i.m24061i(this.f34989M1);
    }

    public boolean m2331n7() {
        return this.f34986L1;
    }

    public final void m2328na() {
        m2896D6(1);
    }

    public void m2327nb(TdApi.Function function, Client.AbstractC7865g gVar) {
        m2270r4().m14783o(function, gVar);
    }

    public final boolean m2326nc(TdApi.ChatList chatList, int i, int i2, int i3, int i4, int i5) {
        C10562b9 w5 = m2189w5(chatList);
        int max = Math.max(w5.f33874b, 0);
        int max2 = Math.max(w5.f33875c, 0);
        int i6 = w5.f33873a;
        if (!w5.m4531e(i, i2, i3, i4, i5)) {
            return false;
        }
        this.f35014V.m4670n1(chatList, i2 - max, i3 - max2, true);
        m2949A1().m1473f0(chatList, w5, true);
        m2781K9().m1959F(chatList, (i > 0) != (i6 > 0), i, i2, i3);
        return true;
    }

    public final void m2325nd(TdApi.UpdateChatAvailableReactions updateChatAvailableReactions) {
        synchronized (this.f35030a0) {
            TdApi.Chat chat = this.f35034b0.get(Long.valueOf(updateChatAvailableReactions.chatId));
            if (!C10859mj.m2997b(updateChatAvailableReactions.chatId, chat, updateChatAvailableReactions)) {
                chat.availableReactions = updateChatAvailableReactions.availableReactions;
                this.f35056i0.m1938K0(updateChatAvailableReactions);
            }
        }
    }

    public final void m2324ne(TdApi.UpdateDeleteMessages updateDeleteMessages) {
        if (!updateDeleteMessages.fromCache) {
            Arrays.sort(updateDeleteMessages.messageIds);
            this.f35056i0.m1796v2(updateDeleteMessages);
            this.f35014V.m4716b1().m1533v(this, updateDeleteMessages);
            this.f35053h0.m1660c0(updateDeleteMessages.chatId, updateDeleteMessages.messageIds);
        }
    }

    public boolean m2320o2(long j) {
        return j != 0 && m2304p2(m2632U2(j));
    }

    public TdApi.ChatLocation m2319o3(long j) {
        TdApi.SupergroupFullInfo i2;
        if (j == 0 || C7316a.m17057d(j) != -1472570774 || (i2 = m2480e2().m1634i2(C7316a.m17045p(j))) == null) {
            return null;
        }
        return i2.location;
    }

    public final boolean m2318o4() {
        boolean z = this.f35040c2 || this.f34970D1;
        if (this.f34968C1 != z) {
            this.f34968C1 = z;
            m2930B4().m4730X2(this.f35017W, z);
        }
        return z;
    }

    public int m2317o5() {
        return this.f34965B0;
    }

    public boolean m2316o6() {
        C6035e<ArrayList<AbstractC9323v4<?>>> eVar = this.f35001Q1;
        return eVar != null && eVar.m21496p() > 0;
    }

    public boolean m2315o7(int i) {
        boolean z;
        synchronized (this.f35030a0) {
            int[] iArr = this.f35096v1;
            z = (iArr == null || C5062b.m24154r(iArr, i) == -1) ? false : true;
        }
        return z;
    }

    public final void m2312oa() {
        m2834H4(1);
    }

    public void m2311ob(TdApi.Function[] functionArr, final Client.AbstractC7865g gVar, final Runnable runnable) {
        if (functionArr.length != 0) {
            if (functionArr.length == 1) {
                TdApi.Function function = functionArr[0];
                if (runnable != null) {
                    gVar = new Client.AbstractC7865g() {
                        @Override
                        public final void mo255t2(TdApi.Object object) {
                            C10930q6.m2536a9(Client.AbstractC7865g.this, runnable, object);
                        }
                    };
                }
                m2327nb(function, gVar);
                return;
            }
            if (runnable != null) {
                final AtomicInteger atomicInteger = new AtomicInteger(functionArr.length);
                gVar = new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        C10930q6.m2520b9(Client.AbstractC7865g.this, atomicInteger, runnable, object);
                    }
                };
            }
            for (TdApi.Function function2 : functionArr) {
                m2327nb(function2, gVar);
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final boolean m2310oc(TdApi.ChatList chatList, int i, int i2) {
        C10562b9 w5 = m2189w5(chatList);
        int i3 = w5.f33878f;
        if (i3 == i && w5.f33879g == i2) {
            return false;
        }
        int max = Math.max(i3, 0);
        int max2 = Math.max(w5.f33879g, 0);
        w5.f33878f = i;
        w5.f33879g = i2;
        this.f35014V.m4670n1(chatList, i - max, i2 - max2, false);
        m2949A1().m1473f0(chatList, w5, false);
        m2781K9().m1951H(chatList, i, i2);
        return true;
    }

    public final void m2309od(TdApi.UpdateChatDefaultDisableNotification updateChatDefaultDisableNotification) {
        synchronized (this.f35030a0) {
            TdApi.Chat chat = this.f35034b0.get(Long.valueOf(updateChatDefaultDisableNotification.chatId));
            if (!C10859mj.m2997b(updateChatDefaultDisableNotification.chatId, chat, updateChatDefaultDisableNotification)) {
                chat.defaultDisableNotification = updateChatDefaultDisableNotification.defaultDisableNotification;
                this.f35056i0.m1918P0(updateChatDefaultDisableNotification);
            }
        }
    }

    public final void m2308oe(TdApi.UpdateNewChat updateNewChat) {
        ArrayList<C10684g8> arrayList;
        TdApi.ChatPosition[] chatPositionArr;
        synchronized (this.f35030a0) {
            this.f35034b0.put(Long.valueOf(updateNewChat.chat.f25367id), updateNewChat.chat);
            this.f35047f0.add(Long.valueOf(updateNewChat.chat.f25367id));
            if (updateNewChat.chat.type.getConstructor() == -1472570774) {
                TdApi.ChatType chatType = updateNewChat.chat.type;
                long j = ((TdApi.ChatTypeSupergroup) chatType).supergroupId;
                if (((TdApi.ChatTypeSupergroup) chatType).isChannel) {
                    this.f35083r0.add(Long.valueOf(j));
                } else {
                    this.f35083r0.remove(Long.valueOf(j));
                }
            }
            TdApi.ChatPosition[] chatPositionArr2 = updateNewChat.chat.positions;
            if (chatPositionArr2 == null || chatPositionArr2.length <= 0) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(updateNewChat.chat.positions.length);
                for (TdApi.ChatPosition chatPosition : updateNewChat.chat.positions) {
                    if (chatPosition.order != 0) {
                        arrayList.add(m2351m3(chatPosition.list));
                    }
                }
            }
        }
        if (arrayList != null) {
            for (C10684g8 g8Var : arrayList) {
                g8Var.m4305H(updateNewChat.chat);
            }
        }
    }

    public boolean m2304p2(TdApi.Chat chat) {
        if (chat == null || chat.lastMessage == null) {
            return false;
        }
        switch (C7316a.m17057d(chat.f25367id)) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                TdApi.Supergroup Y3 = m2571Y3(chat.f25367id);
                return Y3 != null && !Y3.isChannel && C5070i.m24061i(Y3.username);
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                return true;
            default:
                return false;
        }
    }

    public int m2303p3(long j) {
        TdApi.BasicGroup M;
        if (j == 0) {
            return 0;
        }
        int d = C7316a.m17057d(j);
        if (d == -1472570774) {
            long p = C7316a.m17045p(j);
            TdApi.SupergroupFullInfo j2 = m2480e2().m1630j2(p, false);
            int i = j2 != null ? j2.memberCount : 0;
            if (i > 0) {
                return i;
            }
            TdApi.Supergroup h2 = m2480e2().m1638h2(p);
            if (h2 != null) {
                return h2.memberCount;
            }
            return 0;
        } else if (d == 973884508 && (M = m2480e2().m1716M(C7316a.m17048m(j))) != null) {
            return M.memberCount;
        } else {
            return 0;
        }
    }

    public void m2302p4() {
        synchronized (this.f35026Z) {
            m2487db();
        }
    }

    public void m2301p5(long j, long j2, long j3, boolean z, boolean z2) {
        m2270r4().m14783o(new TdApi.ForwardMessages(j, j2, new long[]{j3}, new TdApi.MessageSendOptions(z, z2, false, null), false, false, false), m2610V9());
    }

    public boolean m2300p6(long j) {
        return m2284q6(m2632U2(j));
    }

    public boolean m2299p7(long j) {
        TdApi.Supergroup Y3 = m2571Y3(j);
        return Y3 != null && !Y3.isChannel;
    }

    public void m2296pa(TdApi.UpdateMessageSendAcknowledged updateMessageSendAcknowledged) {
        m2424ha(updateMessageSendAcknowledged.chatId, updateMessageSendAcknowledged.messageId);
        this.f35056i0.m1828n2(updateMessageSendAcknowledged);
    }

    public void m2295pb(long j, long j2, String str) {
        m2270r4().m14783o(new TdApi.SendBotStartMessage(j, j2, str), m2610V9());
    }

    public C10733ic m2294pc() {
        return this.f35071n0;
    }

    public final void m2293pd(TdApi.UpdateChatMessageSender updateChatMessageSender) {
        synchronized (this.f35030a0) {
            TdApi.Chat chat = this.f35034b0.get(Long.valueOf(updateChatMessageSender.chatId));
            if (!C10859mj.m2997b(updateChatMessageSender.chatId, chat, updateChatMessageSender)) {
                chat.messageSenderId = updateChatMessageSender.messageSenderId;
                this.f35056i0.m1914Q0(updateChatMessageSender);
            }
        }
    }

    public final void m2292pe(TdApi.UpdateNewMessage updateNewMessage, boolean z) {
        TdApi.Message message = updateNewMessage.message;
        if ((message.sendingState instanceof TdApi.MessageSendingStatePending) && message.content.getConstructor() != 1810060209) {
            TdApi.Message message2 = updateNewMessage.message;
            m2805J1(message2.chatId, message2.f25406id, true);
            if (z) {
                return;
            }
        }
        this.f35056i0.m1780z2(updateNewMessage);
        this.f35077p0.m3210I1(updateNewMessage);
        this.f35014V.m4716b1().m1532w(this, updateNewMessage);
        if (!this.f35100x1 && updateNewMessage.message.chatId == C7316a.m17058c(777000L)) {
            this.f35056i0.m1943J(true);
        }
    }

    public boolean m2288q2(long j) {
        TdApi.Supergroup h2;
        if (j == 0) {
            return false;
        }
        long p = C7316a.m17045p(j);
        return (p == 0 || (h2 = m2480e2().m1638h2(p)) == null || C5070i.m24061i(h2.username)) ? false : true;
    }

    public int m2287q3(long j) {
        return m2271r3(m2632U2(j));
    }

    public C10942l m2285q5(String str, TdApi.FileType fileType, boolean z, int i, long j) {
        final CountDownLatch countDownLatch = new CountDownLatch(2);
        final C10942l lVar = new C10942l();
        lVar.f35158a = countDownLatch;
        synchronized (this.f34995O1) {
            this.f34995O1.put(str, lVar);
        }
        Client r4 = m2270r4();
        TdApi.InputFileGenerated inputFileGenerated = new TdApi.InputFileGenerated(null, str, 0);
        if (z) {
            fileType = new TdApi.FileTypeSecret();
        }
        r4.m14783o(new TdApi.UploadFile(inputFileGenerated, fileType, i), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C10930q6.m2537a8(C10930q6.C10942l.this, countDownLatch, object);
            }
        });
        try {
            if (j > 0) {
                countDownLatch.await(j, TimeUnit.MILLISECONDS);
            } else {
                countDownLatch.await();
            }
        } catch (InterruptedException e) {
            Log.m14718i(e);
        }
        synchronized (this.f34995O1) {
            if (lVar.f35162e) {
                this.f34998P1.remove(Long.valueOf(lVar.f35161d));
            } else {
                this.f34995O1.remove(str);
            }
        }
        if (lVar.f35159b == null || lVar.f35160c == null) {
            return null;
        }
        return lVar;
    }

    public boolean m2284q6(TdApi.Chat chat) {
        return chat != null && !C5070i.m24061i(chat.clientData);
    }

    public boolean m2283q7(TdApi.Chat chat) {
        return chat != null && chat.type.getConstructor() == -1472570774 && !((TdApi.ChatTypeSupergroup) chat.type).isChannel;
    }

    public final void m2280qa() {
        this.f35085r2.m18904d();
    }

    public void m2279qb(TdApi.Update update, boolean z) {
        m2238t4().m2098y(update, z);
    }

    public final boolean m2278qc() {
        if (this.f35102y1 || m2648T1() == 0) {
            return false;
        }
        TdApi.AuthorizationState authorizationState = this.f34982J1;
        return (authorizationState == null || authorizationState.getConstructor() == 306402531) && !m2318o4() && !m2949A1().m1499L() && m2949A1().m1503H() && this.f35104z1.get() == 0;
    }

    public final void m2277qd(TdApi.UpdateChatDraftMessage updateChatDraftMessage) {
        synchronized (this.f35030a0) {
            TdApi.Chat chat = this.f35034b0.get(Long.valueOf(updateChatDraftMessage.chatId));
            if (!C10859mj.m2997b(updateChatDraftMessage.chatId, chat, updateChatDraftMessage)) {
                chat.draftMessage = updateChatDraftMessage.draftMessage;
                this.f35056i0.m1906S0(updateChatDraftMessage, m2715Ob(chat, updateChatDraftMessage.positions));
            }
        }
    }

    public final void m2276qe(Client client) {
        int i = Build.VERSION.SDK_INT >= 30 ? 7 : 10;
        client.m14783o(new TdApi.SetOption("notification_group_count_max", new TdApi.OptionValueInteger(25L)), this.f34987M);
        client.m14783o(new TdApi.SetOption("notification_group_size_max", new TdApi.OptionValueInteger(i)), this.f34987M);
    }

    public boolean m2272r2(TdApi.Message message) {
        return message != null && message.sendingState == null && C7316a.m17045p(message.chatId) != 0 && !C4779t2.m25727A3(message);
    }

    public int m2271r3(TdApi.Chat chat) {
        if (chat == null) {
            return 0;
        }
        TdApi.ChatNotificationSettings chatNotificationSettings = chat.notificationSettings;
        if (!chatNotificationSettings.useDefaultMuteFor) {
            return chatNotificationSettings.muteFor;
        }
        TdApi.ScopeNotificationSettings L0 = this.f35077p0.m3199L0(chat);
        if (L0 != null) {
            return L0.muteFor;
        }
        return 0;
    }

    public Client m2270r4() {
        return m2238t4().f35156b;
    }

    public void m2269r5(final List<TdApi.Message> list, final boolean z, C10936f fVar, final AbstractC5918j<C10936f> jVar) {
        final AtomicInteger atomicInteger;
        final AtomicBoolean atomicBoolean;
        boolean z2 = false;
        final TdApi.Message message = list.get(0);
        final TdApi.Message message2 = list.get(list.size() - 1);
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final AtomicBoolean atomicBoolean2 = new AtomicBoolean(fVar != null && !fVar.f35135c);
        if (fVar != null && !fVar.f35134b) {
            z2 = true;
        }
        final AtomicBoolean atomicBoolean3 = new AtomicBoolean(z2);
        int i = !atomicBoolean2.get();
        if (!atomicBoolean3.get()) {
            i++;
        }
        if (i != 0) {
            AtomicInteger atomicInteger2 = new AtomicInteger(i);
            final Runnable b4Var = new Runnable() {
                @Override
                public final void run() {
                    C10930q6.m2521b8(arrayList, arrayList2, list, atomicBoolean3, atomicBoolean2, jVar);
                }
            };
            int size = (10 - list.size()) + 1;
            if (!atomicBoolean2.get()) {
                atomicInteger = atomicInteger2;
                atomicBoolean = atomicBoolean3;
                m2270r4().m14783o(new TdApi.GetChatHistory(message2.chatId, message2.f25406id, 0, size, z), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        C10930q6.m2506c8(TdApi.Message.this, atomicBoolean2, arrayList, z, atomicInteger, b4Var, object);
                    }
                });
            } else {
                atomicInteger = atomicInteger2;
                atomicBoolean = atomicBoolean3;
            }
            if (!atomicBoolean.get()) {
                final AtomicInteger atomicInteger3 = atomicInteger;
                m2270r4().m14783o(new TdApi.GetChatHistory(message.chatId, message.f25406id, -size, size, z), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        C10930q6.m2490d8(TdApi.Message.this, atomicBoolean, arrayList2, z, atomicInteger3, b4Var, object);
                    }
                });
            }
        } else if (jVar != null) {
            jVar.mo1330a(fVar);
        }
    }

    public boolean m2268r6(long j, int i) {
        return m2629U5(m2632U2(j), i) != null;
    }

    public boolean m2267r7(TdApi.Chat chat) {
        TdApi.User b4 = m2525b4(chat);
        return b4 != null && b4.isSupport;
    }

    public final void m2264ra() {
        this.f35088s2.m18904d();
    }

    public void m2263rb(long j, long j2, long j3, TdApi.MessageSendOptions messageSendOptions, long j4, String str) {
        m2270r4().m14783o(new TdApi.SendInlineQueryResultMessage(j, j2, j3, messageSendOptions, j4, str, false), m2610V9());
    }

    public boolean m2262rc(TdApi.FormattedText formattedText) {
        return m2173x5(formattedText) != null;
    }

    public final void m2261rd(TdApi.UpdateChatFilters updateChatFilters) {
        synchronized (this.f35030a0) {
            this.f35055h2 = updateChatFilters.chatFilters;
        }
        this.f35056i0.m1903T0(updateChatFilters);
    }

    public final void m2260re(TdApi.UpdateChatNotificationSettings updateChatNotificationSettings) {
        long j = updateChatNotificationSettings.chatId;
        synchronized (this.f35030a0) {
            TdApi.Chat chat = this.f35034b0.get(Long.valueOf(j));
            if (!C10859mj.m2997b(j, chat, updateChatNotificationSettings)) {
                TdApi.ChatNotificationSettings chatNotificationSettings = chat.notificationSettings;
                chat.notificationSettings = updateChatNotificationSettings.notificationSettings;
                this.f35056i0.m1960E2(updateChatNotificationSettings);
                this.f35077p0.m3194M1(updateChatNotificationSettings, j, chatNotificationSettings);
            }
        }
    }

    public boolean m2256s2(TdApi.Chat chat) {
        return m2144z2(chat, false);
    }

    public boolean m2255s3(long j) {
        return m2239t3(m2632U2(j));
    }

    public TdApi.Object m2254s4(final TdApi.Function function, long j) {
        TdApi.Object object;
        if (!m2140z6()) {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final AtomicReference atomicReference = new AtomicReference();
            m2573Y1(new Runnable() {
                @Override
                public final void run() {
                    C10930q6.this.m2719O7(function, atomicReference, countDownLatch);
                }
            });
            try {
                if (j > 0) {
                    countDownLatch.await(j, TimeUnit.MILLISECONDS);
                } else {
                    countDownLatch.await();
                }
            } catch (InterruptedException e) {
                Log.m14718i(e);
            }
            synchronized (atomicReference) {
                object = (TdApi.Object) atomicReference.get();
            }
            return object;
        }
        throw new IllegalStateException("Cannot call from TDLib thread: " + function);
    }

    public void m2253s5(TdApi.Message message, boolean z, C10936f fVar, AbstractC5918j<C10936f> jVar) {
        if (message.mediaAlbumId == 0) {
            if (jVar != null) {
                jVar.mo1330a(null);
            }
        } else if (fVar != null) {
            m2269r5(fVar.f35133a, z, fVar, jVar);
        } else {
            ArrayList arrayList = new ArrayList(10);
            arrayList.add(message);
            m2269r5(arrayList, z, fVar, jVar);
        }
    }

    public boolean m2252s6(TdApi.ChatList chatList) {
        return m2189w5(chatList).f33874b > 0;
    }

    public boolean m2251s7(long j) {
        synchronized (this.f35030a0) {
            long d = this.f35086s0.m23245d(j);
            if (d > SystemClock.elapsedRealtime()) {
                return true;
            }
            if (d != 0) {
                this.f35086s0.m23246c(j);
            }
            return false;
        }
    }

    public final void m2248sa() {
        Log.m14719i("Performing account startup for accountId:%d, isAfterRestart:%b", Integer.valueOf(this.f35017W), Boolean.valueOf(this.f34986L1));
        m2781K9().m1907S(this.f34986L1);
        this.f34986L1 = true;
    }

    public void m2247sb(long j, long j2, long j3, TdApi.MessageSendOptions messageSendOptions, TdApi.InputMessageContent inputMessageContent, final AbstractC5918j<TdApi.Message> jVar) {
        Client.AbstractC7865g gVar;
        Client r4 = m2270r4();
        TdApi.SendMessage sendMessage = new TdApi.SendMessage(j, j2, j3, messageSendOptions, null, inputMessageContent);
        if (jVar != null) {
            gVar = new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    C10930q6.this.m2505c9(jVar, object);
                }
            };
        } else {
            gVar = m2610V9();
        }
        r4.m14783o(sendMessage, gVar);
    }

    public boolean m2246sc(TdApi.Chat chat, int i, int i2, int i3, int i4) {
        CharSequence V5 = m2614V5(chat, i, i2, i3, i4);
        if (V5 == null) {
            return false;
        }
        C1379j0.m37290z0(V5, 0);
        return true;
    }

    public final void m2245sd(TdApi.UpdateChatHasProtectedContent updateChatHasProtectedContent) {
        synchronized (this.f35030a0) {
            TdApi.Chat chat = this.f35034b0.get(Long.valueOf(updateChatHasProtectedContent.chatId));
            if (!C10859mj.m2997b(updateChatHasProtectedContent.chatId, chat, updateChatHasProtectedContent)) {
                chat.hasProtectedContent = updateChatHasProtectedContent.hasProtectedContent;
                this.f35056i0.m1900U0(updateChatHasProtectedContent);
            }
        }
    }

    public final void m2244se(TdApi.UpdateScopeNotificationSettings updateScopeNotificationSettings) {
        this.f35056i0.m1956F2(updateScopeNotificationSettings);
        this.f35077p0.m3190N1(updateScopeNotificationSettings);
    }

    public boolean m2240t2(long j) {
        TdApi.ChatMemberStatus K3 = m2787K3(j);
        if (K3 == null) {
            return false;
        }
        int constructor = K3.getConstructor();
        return constructor == -160019714 || (constructor == 82243562 && ((TdApi.ChatMemberStatusAdministrator) K3).canDeleteMessages);
    }

    public boolean m2239t3(TdApi.Chat chat) {
        return chat != null && C4779t2.m25393x4(chat.notificationSettings, m2423hb(chat.f25367id));
    }

    public final C10941k m2238t4() {
        synchronized (this.f35026Z) {
            C10941k u4 = m2222u4();
            if (u4 != null) {
                return u4;
            }
            CountDownLatch countDownLatch = this.f35020X.f35151R;
            if (!C4868i.m24726c2().m24720d0()) {
                C7389v0.m16602o(countDownLatch);
            } else if (!C7389v0.m16598p(countDownLatch, 10L, TimeUnit.SECONDS)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Long close detected. authState: ");
                sb2.append(this.f34982J1);
                sb2.append(", closeState: ");
                C10941k kVar = this.f35020X;
                sb2.append(kVar != null ? kVar.f35152S : -1);
                RuntimeException runtimeException = new RuntimeException(sb2.toString());
                Tracer.m14772h(runtimeException);
                throw runtimeException;
            }
            return m2238t4();
        }
    }

    public void m2237t5(TdApi.ChatList chatList, AbstractC5918j<TdApi.Chat> jVar, AbstractC5917i iVar, boolean z) {
        m2367l3(chatList).m4277w(jVar, iVar);
    }

    public boolean m2236t6(long j) {
        return j != 0 && m2220u6(m2632U2(j));
    }

    public boolean m2235t7(String str) {
        if (C5070i.m24061i(str)) {
            return false;
        }
        if (str.startsWith("tg://")) {
            return true;
        }
        try {
            if (!str.startsWith("http://") && !str.startsWith("https://")) {
                str = "http://" + str;
            }
            return m2598W6(Uri.parse(str).getHost(), false);
        } catch (Throwable unused) {
            return false;
        }
    }

    public void m2232ta(int i) {
        synchronized (this.f35007S1) {
            int i2 = this.f35004R1.m23250i();
            for (int i3 = 0; i3 < i2; i3++) {
                if (i >= this.f35004R1.m23249j(i3)) {
                    long f = this.f35004R1.m23253f(i3);
                    TdApi.Chat U2 = m2632U2(f);
                    if (m2220u6(U2) && (C7316a.m17051j(f) || m2485dd().m3528l8(U2))) {
                        m2199vb(f);
                    }
                }
            }
        }
    }

    public void m2231tb(long j, long j2, long j3, boolean z, boolean z2, TdApi.InputMessageContent inputMessageContent) {
        m2215ub(j, j2, j3, z, z2, inputMessageContent, null);
    }

    public void m2230tc() {
        int v0;
        if (m2930B4().m4632x2() == this.f35017W && (v0 = m2930B4().m4642v0(this.f35017W)) != -1) {
            m2930B4().m4709d0(v0, 0);
        }
        final boolean q1 = m2930B4().m4661q1();
        final String q2 = q1 ? C4779t2.m25444q2(m2949A1().m1459q(), m2949A1().m1457s()) : null;
        m2896D6(1);
        m2270r4().m14783o(new TdApi.LogOut(), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C10930q6.this.m2297p9(q1, q2, object);
            }
        });
    }

    public final void m2229td(TdApi.UpdateChatHasScheduledMessages updateChatHasScheduledMessages) {
        synchronized (this.f35030a0) {
            TdApi.Chat chat = this.f35034b0.get(Long.valueOf(updateChatHasScheduledMessages.chatId));
            if (!C10859mj.m2997b(updateChatHasScheduledMessages.chatId, chat, updateChatHasScheduledMessages)) {
                chat.hasScheduledMessages = updateChatHasScheduledMessages.hasScheduledMessages;
                this.f35056i0.m1894W0(updateChatHasScheduledMessages);
            }
        }
    }

    public final void m2228te(p350yd.C10930q6.C10941k r18, org.drinkless.p210td.libcore.telegram.TdApi.UpdateOption r19) {
        throw new UnsupportedOperationException("Method not decompiled: p350yd.C10930q6.m2228te(yd.q6$k, org.drinkless.td.libcore.telegram.TdApi$UpdateOption):void");
    }

    public boolean m2224u2(long j) {
        return m2583X6(j);
    }

    public boolean m2223u3(long j) {
        return m2207v3(m2632U2(j));
    }

    public final C10941k m2222u4() {
        if (this.f35020X == null) {
            this.f35020X = m2456fa();
            m2485dd().postDelayed(new Runnable() {
                @Override
                public final void run() {
                    C10930q6.this.m2302p4();
                }
            }, 350L);
        }
        if (!this.f35102y1) {
            return this.f35020X;
        }
        if (Thread.currentThread() != this.f35020X.f35156b.m14791g()) {
            return null;
        }
        throw new IllegalStateException();
    }

    public String m2221u5() {
        return this.f35027Z0;
    }

    public boolean m2220u6(TdApi.Chat chat) {
        return m2629U5(chat, R.id.right_sendMessages) == null;
    }

    public boolean m2219u7() {
        TdApi.AuthorizationState authorizationState = this.f34982J1;
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
                    throw new AssertionError(this.f34982J1);
            }
        }
        return false;
    }

    public final void m2216ua(TdApi.UpdateActiveNotifications updateActiveNotifications) {
        C7903b.C7904a.m14399a(0L, this.f35017W, "Received updateActiveNotifications, ignore: %b", Boolean.valueOf(this.f34974F1));
        if (!this.f34974F1 || updateActiveNotifications.groups.length <= 0) {
            this.f35049f2 = false;
        } else {
            updateActiveNotifications = new TdApi.UpdateActiveNotifications(new TdApi.NotificationGroup[0]);
            this.f35049f2 = true;
        }
        this.f35046e2 = SystemClock.uptimeMillis();
        this.f35077p0.m3234C1(updateActiveNotifications, new Runnable() {
            @Override
            public final void run() {
                C10930q6.this.m2675R4();
            }
        });
    }

    public void m2215ub(long j, long j2, long j3, boolean z, boolean z2, TdApi.InputMessageContent inputMessageContent, AbstractC5918j<TdApi.Message> jVar) {
        m2247sb(j, j2, j3, new TdApi.MessageSendOptions(z, z2, false, null), inputMessageContent, jVar);
    }

    public Client.AbstractC7865g m2214uc() {
        return this.f34999Q;
    }

    public final void m2213ud(TdApi.UpdateChatIsBlocked updateChatIsBlocked) {
        synchronized (this.f35030a0) {
            TdApi.Chat chat = this.f35034b0.get(Long.valueOf(updateChatIsBlocked.chatId));
            if (!C10859mj.m2997b(updateChatIsBlocked.chatId, chat, updateChatIsBlocked)) {
                chat.isBlocked = updateChatIsBlocked.isBlocked;
                this.f35056i0.m1885Z0(updateChatIsBlocked);
            }
        }
    }

    public boolean m2208v2(long j) {
        return !C7316a.m17049l(j);
    }

    public boolean m2207v3(TdApi.Chat chat) {
        if (chat == null) {
            return true;
        }
        TdApi.ChatNotificationSettings chatNotificationSettings = chat.notificationSettings;
        return !chatNotificationSettings.useDefaultMuteFor ? chatNotificationSettings.muteFor == 0 : m2439gb(this.f35077p0.m3113k2(chat)) == 0;
    }

    public TdApi.TdlibParameters m2206v4() {
        return this.f35037c;
    }

    public int m2205v5(int i) {
        return C11524j.m226O(i, m2294pc().m4144M());
    }

    public boolean m2204v6() {
        synchronized (this.f35030a0) {
            for (TdApi.SuggestedAction suggestedAction : this.f35064k2) {
                if (m2347m7(suggestedAction)) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean m2203v7(TdApi.MessageSender messageSender) {
        return m2494d4(C7321e.m16986Q0(messageSender)) != 0;
    }

    public final void m2200va(TdApi.UpdateHavePendingNotifications updateHavePendingNotifications) {
        boolean z = updateHavePendingNotifications.haveDelayedNotifications || updateHavePendingNotifications.haveUnreceivedNotifications;
        if (this.f35040c2 != z) {
            this.f35040c2 = z;
            m2318o4();
        }
        if (!updateHavePendingNotifications.haveUnreceivedNotifications) {
            this.f35091t2.m18903e(true);
        }
        m2912C6();
        this.f35077p0.m3147b2(z ? null : new Runnable() {
            @Override
            public final void run() {
                C10930q6.this.m2264ra();
            }
        });
    }

    public void m2199vb(long j) {
        m2270r4().m14783o(new TdApi.SendChatScreenshotTakenNotification(j), m2610V9());
    }

    public Client.AbstractC7865g m2198vc(final Runnable runnable) {
        if (runnable != null) {
            return new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    C10930q6.this.m2281q9(runnable, object);
                }
            };
        }
        return m2214uc();
    }

    public final void m2197vd(TdApi.UpdateChatIsMarkedAsUnread updateChatIsMarkedAsUnread) {
        synchronized (this.f35030a0) {
            TdApi.Chat chat = this.f35034b0.get(Long.valueOf(updateChatIsMarkedAsUnread.chatId));
            if (!C10859mj.m2997b(updateChatIsMarkedAsUnread.chatId, chat, updateChatIsMarkedAsUnread)) {
                chat.isMarkedAsUnread = updateChatIsMarkedAsUnread.isMarkedAsUnread;
                this.f35056i0.m1877b1(updateChatIsMarkedAsUnread);
            }
        }
    }

    public final void m2196ve(Client client) {
        m2500ce(client, true);
        client.m14783o(new TdApi.SetOption("use_quick_ack", new TdApi.OptionValueBoolean(true)), this.f34987M);
        client.m14783o(new TdApi.SetOption("use_pfs", new TdApi.OptionValueBoolean(true)), this.f34987M);
        m2276qe(client);
        boolean e2 = C4868i.m24726c2().m24710e2();
        this.f35036b2 = e2;
        client.m14783o(new TdApi.SetOption("is_emulator", new TdApi.OptionValueBoolean(e2)), this.f34987M);
        client.m14783o(new TdApi.SetOption("storage_max_files_size", new TdApi.OptionValueInteger(2147483647L)), this.f34987M);
        client.m14783o(new TdApi.SetOption("ignore_default_disable_notification", new TdApi.OptionValueBoolean(true)), this.f34987M);
        client.m14783o(new TdApi.SetOption("ignore_platform_restrictions", new TdApi.OptionValueBoolean(C7389v0.m16636f1())), this.f34987M);
        m2366l4(client, true);
        if (this.f34980I1) {
            client.m14783o(new TdApi.SetOption("drop_notification_ids", new TdApi.OptionValueBoolean(true)), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    C10930q6.this.m2877E9(object);
                }
            });
            this.f34980I1 = false;
        }
        this.f35037c.useTestDc = m2658S6();
        this.f35037c.databaseDirectory = C10536ab.m4748T0(this.f35017W, false);
        this.f35037c.filesDirectory = C10536ab.m4748T0(this.f35017W, true);
        this.f35037c.systemLanguageCode = C10536ab.m4764P0();
        this.f35037c.deviceModel = C10536ab.m4816C0();
        this.f35037c.systemVersion = C10536ab.m4760Q0();
    }

    public boolean m2192w2() {
        boolean z;
        int[] iArr;
        synchronized (this.f35030a0) {
            if (this.f35093u1 < 5 && ((iArr = this.f35096v1) == null || iArr.length <= 0)) {
                z = false;
            }
            z = true;
        }
        return z;
    }

    public int m2191w3(long j) {
        Integer num;
        if (j == 0) {
            return 0;
        }
        synchronized (this.f35030a0) {
            num = this.f35050g0.get(Long.valueOf(j));
        }
        if (num == null || num.intValue() <= 1) {
            return 0;
        }
        return num.intValue();
    }

    public void m2190w4(final long j, final AbstractC9323v4<?> v4Var, boolean z) {
        if (z) {
            m2485dd().postDelayed(new Runnable() {
                @Override
                public final void run() {
                    C10930q6.this.m2703P7(j, v4Var);
                }
            }, 1000L);
        } else {
            m2703P7(j, v4Var);
        }
    }

    public C10562b9 m2189w5(TdApi.ChatList chatList) {
        String o4 = C4779t2.m25456o4(chatList);
        C10562b9 b9Var = this.f35072n1.get(o4);
        if (b9Var != null) {
            return b9Var;
        }
        C10562b9 b9Var2 = new C10562b9(-1, -1, -1, -1, -1, -1, -1);
        this.f35072n1.put(o4, b9Var2);
        return b9Var2;
    }

    public int m2188w6() {
        return this.f35017W;
    }

    public boolean m2187w7(long j) {
        return C7316a.m17049l(j);
    }

    public final void m2184wa(long j) {
        this.f35014V.m4679k2(this.f35017W, j);
        m2480e2().m1616n1(j);
        this.f35077p0.m3222F1(j);
    }

    public TdApi.MessageSender m2183wb(long j) {
        long d4 = m2494d4(j);
        return d4 != 0 ? new TdApi.MessageSenderUser(d4) : new TdApi.MessageSenderChat(j);
    }

    public TdApi.SuggestedAction m2182wc() {
        synchronized (this.f35030a0) {
            TdApi.SuggestedAction suggestedAction = null;
            for (TdApi.SuggestedAction suggestedAction2 : this.f35064k2) {
                if (m2347m7(suggestedAction2)) {
                    if (suggestedAction != null) {
                        return null;
                    }
                    suggestedAction = suggestedAction2;
                }
            }
            return suggestedAction;
        }
    }

    public final void m2181wd(TdApi.UpdateChatLastMessage updateChatLastMessage) {
        if (Log.isEnabled(8)) {
            Object[] objArr = new Object[2];
            objArr[0] = Long.valueOf(updateChatLastMessage.chatId);
            TdApi.Message message = updateChatLastMessage.lastMessage;
            objArr[1] = Long.valueOf(message != null ? message.f25406id : 0L);
            Log.m14721i(8, "updateChatTopMessage chatId=%d messageId=%d", objArr);
        }
        synchronized (this.f35030a0) {
            TdApi.Chat chat = this.f35034b0.get(Long.valueOf(updateChatLastMessage.chatId));
            if (!C10859mj.m2997b(updateChatLastMessage.chatId, chat, updateChatLastMessage)) {
                chat.lastMessage = updateChatLastMessage.lastMessage;
                this.f35056i0.m1869d1(updateChatLastMessage, m2715Ob(chat, updateChatLastMessage.positions));
            }
        }
    }

    public final void m2180we(TdApi.UpdateUserPrivacySettingRules updateUserPrivacySettingRules) {
        this.f35056i0.m1948H2(updateUserPrivacySettingRules.setting, updateUserPrivacySettingRules.rules);
    }

    public boolean m2176x2() {
        return this.f35000Q0;
    }

    public C10940j m2175x3(TdApi.Chat chat) {
        int s;
        String str;
        if (chat == null) {
            return null;
        }
        String str2 = chat.clientData;
        if (C5070i.m24061i(str2)) {
            return null;
        }
        String[] split = str2.split("_", 2);
        if (split.length == 2 && (s = C5070i.m24051s(split[0])) >= 0 && s <= 0) {
            if (s < 0) {
                while (s <= 0) {
                    str2 = m2792Je(chat, s);
                    s++;
                }
                m2843Gb(chat, str2);
                if (C5070i.m24061i(str2)) {
                    return null;
                }
                split = str2.split("_", 2);
                if (!(split.length == 2 && C5070i.m24051s(split[0]) == 0)) {
                    return null;
                }
            }
            try {
                String str3 = split[1];
                int indexOf = str3.indexOf(95);
                int s2 = C5070i.m24051s(str3.substring(0, indexOf));
                if (!C4862d.m24931z(s2)) {
                    return null;
                }
                int i = indexOf + 1;
                int indexOf2 = str3.indexOf(95, i);
                int s3 = C5070i.m24051s(str3.substring(i, indexOf2));
                int i2 = indexOf2 + 1;
                int indexOf3 = str3.indexOf(95, i2);
                int s4 = C5070i.m24051s(str3.substring(i2, indexOf3));
                if (s4 < 0) {
                    return null;
                }
                int i3 = indexOf3 + 1;
                int i4 = s4 + i3;
                String substring = str3.substring(i3, i4);
                if (str3.length() > i4) {
                    int i5 = i4 + 1;
                    int indexOf4 = str3.indexOf(95, i5);
                    int s5 = C5070i.m24051s(str3.substring(i5, indexOf4));
                    if (s5 > 0) {
                        int i6 = indexOf4 + 1;
                        str = str3.substring(i6, s5 + i6);
                        return new C10940j(s2, s3, substring, str);
                    }
                }
                str = null;
                return new C10940j(s2, s3, substring, str);
            } catch (Throwable th) {
                Log.m14710w("Unable to parse clientData", th, new Object[0]);
            }
        }
        return null;
    }

    public final void m2703P7(long j, AbstractC9323v4<?> v4Var) {
        synchronized (this.f35007S1) {
            ArrayList<AbstractC9323v4<?>> f = this.f35001Q1.m21505f(j);
            if (f != null && f.remove(v4Var) && f.isEmpty()) {
                this.f35004R1.m23256c(j);
                this.f35001Q1.m21499l(j);
                if (Log.isEnabled(8)) {
                    Log.m14716v(8, "closeChat, chatId=%d", Long.valueOf(j));
                }
                m2270r4().m14783o(new TdApi.CloseChat(j), this.f34987M);
            }
        }
    }

    public String m2173x5(TdApi.FormattedText formattedText) {
        if (C7321e.m16965a1(formattedText)) {
            return null;
        }
        TdApi.TextEntity[] textEntityArr = formattedText.entities;
        if (textEntityArr != null && textEntityArr.length != 0) {
            return null;
        }
        String trim = formattedText.text.trim();
        if (m2643T6(trim)) {
            return trim;
        }
        return null;
    }

    public boolean m2172x6() {
        return this.f35003R0;
    }

    public boolean m2171x7(TdApi.Chat chat) {
        if (chat == null) {
            return false;
        }
        int constructor = chat.type.getConstructor();
        return constructor == 862366513 || constructor == 1579049844;
    }

    public final void m2168xa(TdApi.UpdateNotification updateNotification) {
        if (!this.f34974F1) {
            this.f35077p0.m3206J1(updateNotification);
        }
    }

    public String m2167xb(TdApi.Message message, boolean z, boolean z2) {
        TdApi.MessageForwardInfo messageForwardInfo;
        long N0 = C7321e.m16992N0(message, z);
        if (N0 == 0 && z && (messageForwardInfo = message.forwardInfo) != null) {
            int constructor = messageForwardInfo.origin.getConstructor();
            if (constructor == -739561951) {
                return ((TdApi.MessageForwardOriginMessageImport) message.forwardInfo.origin).senderName;
            }
            if (constructor == -271257885) {
                return ((TdApi.MessageForwardOriginHiddenUser) message.forwardInfo.origin).senderName;
            }
            N0 = C7321e.m16992N0(message, false);
        }
        if (C7316a.m17049l(N0)) {
            long d4 = m2494d4(N0);
            return z2 ? m2480e2().m1749D2(d4) : m2480e2().m1721K2(d4);
        } else if (N0 != message.chatId || C5070i.m24061i(message.authorSignature)) {
            return m2691Q3(N0);
        } else {
            if (z2) {
                return message.authorSignature;
            }
            return C4403w.m27865j1(m2784K6(message.chatId) ? R.string.format_channelAndSignature : R.string.format_chatAndSignature, m2691Q3(N0), message.authorSignature);
        }
    }

    public C10802kc m2166xc() {
        return this.f35062k0;
    }

    public final void m2165xd(TdApi.UpdateChatMessageTtl updateChatMessageTtl) {
        synchronized (this.f35030a0) {
            TdApi.Chat chat = this.f35034b0.get(Long.valueOf(updateChatMessageTtl.chatId));
            if (!C10859mj.m2997b(updateChatMessageTtl.chatId, chat, updateChatMessageTtl)) {
                chat.messageTtl = updateChatMessageTtl.messageTtl;
                this.f35056i0.m1857g1(updateChatMessageTtl);
            }
        }
    }

    public final void m2164xe(TdApi.UpdateReactions updateReactions) {
        synchronized (this.f35030a0) {
            this.f34988M0 = updateReactions.reactions;
        }
    }

    public boolean m2160y2(TdApi.Chat chat) {
        return m2144z2(chat, true);
    }

    public TdApi.ChatPermissions m2159y3(long j) {
        TdApi.Chat U2 = m2632U2(j);
        if (U2 != null) {
            return U2.permissions;
        }
        return null;
    }

    public void m2158y4(String str, final AbstractC5918j<TdApi.Session> jVar, final AbstractC5918j<TdApi.Error> jVar2) {
        m2270r4().m14783o(new TdApi.ConfirmQrCodeAuthentication(str), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C10930q6.this.m2687Q7(jVar, jVar2, object);
            }
        });
    }

    public void m2157y5(AbstractC5918j<List<C4868i.C4874f>> jVar) {
        m2445g5(jVar, "#emoji", C10529a4.f33754a, C10578c4.f33919a, C10658f3.f34123a);
    }

    public Client.AbstractC7865g m2156y6() {
        return this.f35002R;
    }

    public boolean m2155y7() {
        TdApi.NetworkType networkType = this.f35028Z1;
        return (networkType != null && networkType.getConstructor() == -1971691759) || this.f35014V.m4694g3().m28139n();
    }

    public final void m2152ya(TdApi.UpdateNotificationGroup updateNotificationGroup) {
        C7903b.C7904a.m14399a(0L, this.f35017W, "Received updateNotificationGroup, groupId: %d, elapsed: %d, ignore: %b", Integer.valueOf(updateNotificationGroup.notificationGroupId), Long.valueOf(SystemClock.uptimeMillis() - this.f35046e2), Boolean.valueOf(this.f34974F1));
        if (!this.f34974F1) {
            this.f35077p0.m3198L1(updateNotificationGroup);
        }
    }

    public String m2151yb(TdApi.MessageSender messageSender) {
        return m2135zb(messageSender, false);
    }

    public void m2150yc(final String str, final AbstractC5918j<TdApi.StickerSet> jVar) {
        if (C5070i.m24061i(str)) {
            jVar.mo1330a(null);
        } else {
            m2270r4().m14783o(new TdApi.SearchStickerSet(str), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    C10930q6.this.m2265r9(jVar, str, object);
                }
            });
        }
    }

    public final void m2149yd(TdApi.UpdateChatOnlineMemberCount updateChatOnlineMemberCount) {
        synchronized (this.f35030a0) {
            Integer num = this.f35050g0.get(Long.valueOf(updateChatOnlineMemberCount.chatId));
            int intValue = num != null ? num.intValue() : 0;
            int i = updateChatOnlineMemberCount.onlineMemberCount;
            if (i != intValue) {
                if (i != 0) {
                    this.f35050g0.put(Long.valueOf(updateChatOnlineMemberCount.chatId), Integer.valueOf(updateChatOnlineMemberCount.onlineMemberCount));
                } else {
                    this.f35050g0.remove(Long.valueOf(updateChatOnlineMemberCount.chatId));
                }
                this.f35056i0.m1845j1(updateChatOnlineMemberCount);
            }
        }
    }

    public final void m2148ye(TdApi.UpdateRecentStickers updateRecentStickers) {
        this.f35056i0.m1944I2(updateRecentStickers);
    }

    public boolean m2144z2(org.drinkless.p210td.libcore.telegram.TdApi.Chat r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: p350yd.C10930q6.m2144z2(org.drinkless.td.libcore.telegram.TdApi$Chat, boolean):boolean");
    }

    public boolean m2143z3(TdApi.ChatList chatList, long j) {
        if (j == 0) {
            return false;
        }
        return C7317b.m17037g(m2632U2(j), chatList);
    }

    public int m2142z4() {
        return this.f35023Y;
    }

    public TdApi.FormattedText m2141z5(TdApi.Message message) {
        if (message == null) {
            return null;
        }
        TdApi.FormattedText K5 = m2785K5(message.chatId, message.f25406id);
        return K5 != null ? K5 : C7321e.m16899w1(message.content);
    }

    public boolean m2140z6() {
        return Thread.currentThread() == m2270r4().m14791g();
    }

    public void m2136za(long j, AbstractC9323v4<?> v4Var) {
        m2940Aa(j, v4Var, null);
    }

    public String m2135zb(TdApi.MessageSender messageSender, boolean z) {
        int constructor = messageSender.getConstructor();
        if (constructor == -336109341) {
            long j = ((TdApi.MessageSenderUser) messageSender).userId;
            C11059v7 e2 = m2480e2();
            return z ? e2.m1749D2(j) : e2.m1721K2(j);
        } else if (constructor == -239660751) {
            return m2691Q3(((TdApi.MessageSenderChat) messageSender).chatId);
        } else {
            throw new RuntimeException(messageSender.toString());
        }
    }

    public void m2134zc(int i) {
        if (i > 0) {
            this.f34976G1 += i;
            m2238t4().m2099x();
        }
    }

    public final void m2133zd(TdApi.UpdateChatPendingJoinRequests updateChatPendingJoinRequests) {
        synchronized (this.f35030a0) {
            TdApi.Chat chat = this.f35034b0.get(Long.valueOf(updateChatPendingJoinRequests.chatId));
            if (!C10859mj.m2997b(updateChatPendingJoinRequests.chatId, chat, updateChatPendingJoinRequests)) {
                chat.pendingJoinRequests = updateChatPendingJoinRequests.pendingJoinRequests;
                this.f35056i0.m1837l1(updateChatPendingJoinRequests);
            }
        }
    }

    public final void m2132ze(TdApi.UpdateSavedAnimations updateSavedAnimations) {
        this.f35056i0.m1940J2(updateSavedAnimations);
    }

    public static class C10936f {
        public final List<TdApi.Message> f35133a;
        public final boolean f35134b;
        public final boolean f35135c;

        public C10936f(List<TdApi.Message> list, boolean z, boolean z2) {
            this.f35133a = list;
            this.f35134b = z;
            this.f35135c = z2;
        }

        public boolean m2131a() {
            return this.f35134b || this.f35135c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof C10936f)) {
                return false;
            }
            List<TdApi.Message> list = ((C10936f) obj).f35133a;
            if (list.size() != this.f35133a.size()) {
                return false;
            }
            for (int i = 0; i < list.size(); i++) {
                TdApi.Message message = list.get(i);
                TdApi.Message message2 = this.f35133a.get(i);
                if (!(message.chatId == message2.chatId && message.f25406id == message2.f25406id && message.mediaAlbumId == message2.mediaAlbumId)) {
                    return false;
                }
            }
            return true;
        }

        public C10936f(List<TdApi.Message> list) {
            this(list, false, false);
        }
    }
}
