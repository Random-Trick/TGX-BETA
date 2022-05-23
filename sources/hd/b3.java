package hd;

import android.os.SystemClock;
import android.view.View;
import ce.a0;
import ce.p;
import ce.y;
import gd.w;
import hd.b;
import hd.t2;
import he.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import je.a;
import je.g;
import je.l0;
import je.o0;
import je.t;
import je.w0;
import kb.c;
import kb.j;
import ld.h;
import ob.b;
import ob.e;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ud.v4;
import zd.e8;
import zd.ic;
import zd.o6;
import zd.z8;

public class b3 implements ic.e, t2.d.a, a.c, c {
    public final o6 M;
    public final TdApi.Chat N;
    public final TdApi.ChatList O;
    public final e8 P;
    public long Q;
    public int R;
    public int S;
    public long T;
    public h U;
    public b V;
    public String W;
    public g X;
    public String Y;
    public int Z;
    public int f12771a;
    public g f12772a0;
    public int f12773b;
    public String f12774b0;
    public final v4<?> f12775c;
    public l0[] f12776c0;
    public g f12777d0;
    public t2.d f12778e0;
    public jb.c f12779f0;
    public int f12780g0;
    public int f12781h0;
    public int f12782i0;
    public int f12783j0;
    public int f12784k0;
    public int f12785l0;
    public g f12786m0;
    public final gb.g f12787n0;
    public final eb.g f12788o0;
    public final a f12789p0;
    public final a f12790q0;
    public final a f12791r0;
    public int f12792s0;
    public long f12793t0;
    public int f12794u0;
    public int f12795v0;
    public final ic.d f12796w0;

    public b3(v4<?> v4Var, TdApi.ChatList chatList, TdApi.Chat chat, boolean z10) {
        gb.g gVar = new gb.g();
        this.f12787n0 = gVar;
        this.f12794u0 = -1;
        this.f12775c = v4Var;
        this.f12796w0 = new ic.d(v4Var.t(), v4Var.c(), this, v4Var);
        o6 c10 = v4Var.c();
        this.M = c10;
        this.O = chatList;
        this.N = e.j(chat);
        this.P = null;
        this.f12773b = i.c2().u0();
        int constructor = chat.type.getConstructor();
        this.R = constructor;
        switch (constructor) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                this.Q = ((TdApi.ChatTypeSupergroup) chat.type).supergroupId;
                break;
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
                this.Q = t2.o2(chat.type);
                break;
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                this.Q = ((TdApi.ChatTypeBasicGroup) chat.type).basicGroupId;
                break;
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                long j10 = ((TdApi.ChatTypePrivate) chat.type).userId;
                this.Q = j10;
                if (j10 != 0 && c10.o7(j10)) {
                    this.f12771a |= Log.TAG_YOUTUBE;
                    break;
                }
                break;
        }
        eb.g gVar2 = new eb.g(gVar);
        this.f12788o0 = gVar2;
        this.f12789p0 = new a.b().d(this).b();
        this.f12790q0 = new a.b().f(R.drawable.baseline_at_16, 16.0f, 0.0f, 17).d(this).b();
        this.f12791r0 = new a.b().j(11.0f).d(this).g().a(false).i(R.id.theme_color_ticksRead).f(R.drawable.baseline_visibility_14, 14.0f, 3.0f, 5).b();
        M0(false);
        X0();
        gVar2.b(g0(), false);
        r();
        if (z10) {
            j(a0.g());
        }
    }

    public static w0 T(int i10) {
        return y.A0(i10 == 2 ? 15.0f : 16.0f);
    }

    public static w0 Y(int i10) {
        return y.A0(i10 == 2 ? 16.0f : 17.0f);
    }

    public static int w0(int i10, int i11, int i12, int i13, int i14) {
        if (i11 == 0) {
            return i10;
        }
        return 0;
    }

    public int x0(int i10, int i11, int i12, int i13) {
        if (i10 == 0) {
            return this.f12795v0;
        }
        return 0;
    }

    public void y0(t2.d dVar, t2.d dVar2) {
        if (this.f12778e0 == dVar) {
            L0(dVar2);
            this.f12787n0.invalidate();
        }
    }

    public void z0(StringBuilder sb2, List list, TdApi.Chat chat) {
        if (sb2.length() > 0) {
            sb2.append(w.m0());
        }
        int length = sb2.length();
        sb2.append(this.M.W3(chat));
        if (chat.unreadCount > 0) {
            list.add(new o0(this.f12775c, this.M, null, length, sb2.length(), 0, null).M(t.d.C));
        }
    }

    public long A() {
        if (i0()) {
            return Long.MAX_VALUE;
        }
        return b.b(this.N, this.O);
    }

    public final void A0() {
        if (this.f12773b == 1) {
            B0();
        } else {
            N0();
        }
    }

    public long B() {
        return t2.n2(this.N);
    }

    public final void B0() {
        g gVar;
        int f12 = (this.S - wc.a.f1(this.f12773b)) - wc.a.getRightPadding();
        int E = E();
        this.f12792s0 = E;
        int i10 = f12 - E;
        this.f12781h0 = wc.a.f1(this.f12773b);
        int i11 = 1;
        if (!((this.f12771a & 1) == 0 || (gVar = this.f12772a0) == null || this.f12773b != 1)) {
            int width = gVar.getWidth();
            i10 -= width;
            this.f12781h0 += width;
        }
        jb.c cVar = this.f12779f0;
        this.f12795v0 = (cVar == null || cVar.g() <= 0) ? 0 : a0.i(2.0f) + (a0.i(18.0f) * this.f12779f0.g());
        if (i10 <= 0 || ib.i.i(this.f12774b0)) {
            this.f12777d0 = null;
        } else {
            g.b bVar = new g.b(this.f12774b0, i10, T(this.f12773b), t.d.D);
            if (!t0()) {
                i11 = 2;
            }
            this.f12777d0 = bVar.p(i11).y(Log.TAG_LUX).j().m(t0()).n(new g.f() {
                @Override
                public final int a(int i12, int i13, int i14, int i15) {
                    int x02;
                    x02 = b3.this.x0(i12, i13, i14, i15);
                    return x02;
                }
            }).i(this.f12776c0).q().f();
        }
        q();
    }

    public int C() {
        return this.f12785l0;
    }

    public final void C0() {
        int timePaddingRight = (this.S - wc.a.getTimePaddingRight()) - this.Z;
        this.f12782i0 = timePaddingRight;
        this.f12785l0 = timePaddingRight - wc.a.getTimePaddingLeft();
    }

    public a D() {
        return this.f12789p0;
    }

    public void D0(boolean z10) {
        int f12 = (((this.S - wc.a.f1(this.f12773b)) - this.Z) - wc.a.getTimePaddingRight()) - wc.a.getTimePaddingLeft();
        boolean q02 = q0();
        if (a1()) {
            f12 = (f12 - wc.a.getMuteOffset()) - p.b();
        }
        boolean l42 = this.M.l4(this.N);
        this.f12771a = ib.c.h(this.f12771a, 32, l42);
        if (l42) {
            f12 -= a0.i(20.0f);
        }
        int h10 = ib.c.h(this.f12771a, Log.TAG_ROUND, this.M.L3(this.N));
        this.f12771a = h10;
        this.f12771a = ib.c.h(h10, Log.TAG_COMPRESS, this.M.k3(this.N));
        boolean z11 = Z0() || b1();
        if (z11) {
            g f10 = new g.b(w.i1(Z0() ? R.string.FakeMark : R.string.ScamMark), f12, y.A0(12.0f), t.d.G).v().b().g().f();
            this.f12786m0 = f10;
            f12 -= f10.getWidth() + (a0.i(4.0f) * 2);
        }
        if (d1()) {
            f12 = (int) (f12 - this.f12791r0.j(a0.i(3.0f)));
        } else if (s0() || n0()) {
            f12 = (f12 - wc.a.getTimePaddingLeft()) - a0.i(20.0f);
        }
        if (q02) {
            f12 -= a0.i(14.0f);
        }
        if (z10 || this.f12794u0 != f12) {
            this.f12794u0 = f12;
            if (ib.i.i(this.W)) {
                this.X = null;
            } else {
                this.X = new g.b(this.W, f12, Y(this.f12773b), q0() ? t.d.F : t.d.C).v().b().g().f();
            }
        }
        int Z = Z();
        this.f12784k0 = wc.a.f1(this.f12773b) + Z;
        int f13 = wc.a.f1(this.f12773b) + Z + wc.a.getMutePadding();
        this.f12783j0 = f13;
        if (l42) {
            this.f12783j0 = f13 + a0.i(20.0f);
        }
        if (z11) {
            this.f12783j0 += this.f12786m0.getWidth();
        }
        if (q02) {
            this.f12784k0 += a0.i(14.0f);
            this.f12783j0 += a0.i(14.0f);
        }
        if (z10 && this.V != null) {
            K0();
        }
    }

    public final int E() {
        return Math.round(this.f12789p0.j(wc.a.getTimePaddingLeft()) + this.f12790q0.j(wc.a.getTimePaddingLeft()));
    }

    public void E0() {
        j(a0.g());
    }

    public int F() {
        return this.f12773b;
    }

    public boolean F0() {
        View f10 = this.f12787n0.f();
        v4<?> q92 = v4.q9(f10);
        return f10 != null && (q92 == null || q92.Ra());
    }

    public a G() {
        return this.f12790q0;
    }

    public boolean G0() {
        if (i0()) {
            return this.M.A5(b.f19339b).f28795c > 0;
        }
        return this.M.y3(this.N);
    }

    public int H() {
        return this.f12783j0;
    }

    public void H0() {
        M0(true);
        T0();
        O0();
    }

    public TdApi.ChatPosition I() {
        return b.a(this.N, this.O);
    }

    public void I0() {
        M0(true);
        this.f12788o0.b(g0(), true);
    }

    public g J() {
        if ((this.f12771a & 1) != 0) {
            return this.f12772a0;
        }
        return null;
    }

    public void J0() {
        T0();
    }

    public int K() {
        jb.c cVar = this.f12779f0;
        if (cVar != null) {
            return cVar.g();
        }
        return 0;
    }

    public final void K0() {
        if (i0()) {
            this.U = null;
            this.V = new b(wc.a.Q0(this.f12773b) / 2.0f, new b.a((int) R.id.theme_color_avatarArchive, (int) R.drawable.baseline_archive_24), null);
            return;
        }
        TdApi.File X1 = (this.f12771a & Log.TAG_YOUTUBE) != 0 ? null : t2.X1(this.N);
        if (X1 == null) {
            this.U = null;
            this.V = this.M.D3(this.N, true, wc.a.Q0(this.f12773b) / 2.0f, null);
            return;
        }
        h hVar = new h(this.M, X1);
        this.U = hVar;
        hVar.t0(wc.a.getDefaultAvatarCacheSize());
        this.V = null;
    }

    public long L() {
        if (this.R == 1579049844) {
            return this.Q;
        }
        return 0L;
    }

    public final void L0(t2.d dVar) {
        jb.c cVar = this.f12779f0;
        if (cVar != null) {
            cVar.b();
        }
        String c10 = dVar.c(true);
        TdApi.FormattedText formattedText = dVar.f13570d;
        S0(c10, formattedText != null ? formattedText.entities : null, dVar.f13571e);
        this.f12778e0 = dVar;
        t2.f fVar = dVar.f13568b;
        if (fVar == null) {
            TdApi.Message message = this.N.lastMessage;
            if (!(message == null || message.forwardInfo == null || (!message.isChannelPost && K() != 0))) {
                TdApi.MessageForwardInfo messageForwardInfo = this.N.lastMessage.forwardInfo;
                switch (messageForwardInfo.origin.getConstructor()) {
                    case TdApi.MessageForwardOriginMessageImport.CONSTRUCTOR:
                        h(R.drawable.templarian_baseline_import_16);
                        break;
                    case TdApi.MessageForwardOriginUser.CONSTRUCTOR:
                        if (e.T0(this.N.lastMessage) != ((TdApi.MessageForwardOriginUser) messageForwardInfo.origin).senderUserId) {
                            h(R.drawable.baseline_share_arrow_16);
                            break;
                        }
                        break;
                    case TdApi.MessageForwardOriginHiddenUser.CONSTRUCTOR:
                        h(R.drawable.baseline_share_arrow_16);
                        break;
                    case TdApi.MessageForwardOriginChannel.CONSTRUCTOR:
                        if (this.N.f19908id != ((TdApi.MessageForwardOriginChannel) messageForwardInfo.origin).chatId) {
                            h(R.drawable.baseline_share_arrow_16);
                            break;
                        }
                        break;
                    case TdApi.MessageForwardOriginChat.CONSTRUCTOR:
                        if (e.R0(this.N.lastMessage) != ((TdApi.MessageForwardOriginChat) messageForwardInfo.origin).senderChatId) {
                            h(R.drawable.baseline_share_arrow_16);
                            break;
                        }
                        break;
                }
            }
        } else {
            h(fVar.f13582b);
        }
        t2.f fVar2 = dVar.f13567a;
        if (fVar2 != null) {
            h(fVar2.f13582b);
        }
        this.f12780g0 = R.id.theme_color_chatListIcon;
        if ((l0() || u0()) && !dVar.f13572f) {
            this.f12771a = 1 | this.f12771a;
        } else {
            TdApi.Message message2 = this.N.lastMessage;
            if (message2 != null && message2.content.getConstructor() == 538893824) {
                jb.c cVar2 = this.f12779f0;
                if (cVar2 != null) {
                    cVar2.b();
                }
                TdApi.Message message3 = this.N.lastMessage;
                h(e.j((TdApi.MessageCall) message3.content, t2.s3(message3)));
                this.f12780g0 = e.l((TdApi.MessageCall) this.N.lastMessage.content);
            }
        }
        N0();
        if (dVar.e()) {
            dVar.g(this);
        }
    }

    public eb.g M() {
        return this.f12788o0;
    }

    public final void M0(boolean z10) {
        boolean h02 = h0();
        int b02 = b0();
        boolean z11 = false;
        this.f12790q0.v(h02 ? o6.A2 : 0, false, z10 && F0());
        a aVar = this.f12789p0;
        if (h02 && b02 == 1) {
            b02 = 0;
        }
        boolean z12 = !G0();
        if (z10 && F0()) {
            z11 = true;
        }
        aVar.v(b02, z12, z11);
    }

    public int N() {
        return t2.b2(this.N);
    }

    public final void N0() {
        String str;
        int i10;
        if ((this.f12771a & 1) != 0) {
            boolean z10 = false;
            if (Y0()) {
                TdApi.DraftMessage draftMessage = this.N.draftMessage;
                if (draftMessage != null && draftMessage.inputMessageText.getConstructor() == 247050392 && !e.c1(((TdApi.InputMessageText) this.N.draftMessage.inputMessageText).text)) {
                    z10 = true;
                }
                str = w.i1(R.string.Draft);
                this.f12771a |= Log.TAG_CAMERA;
            } else {
                if (n0()) {
                    str = w.i1((this.f12773b == 1 || !this.M.c7(this.N) || e.R0(this.N.lastMessage) != this.N.f19908id) ? R.string.FromYou : R.string.FromYouAnonymous);
                    this.f12771a |= Log.TAG_CAMERA;
                } else {
                    TdApi.Message message = this.N.lastMessage;
                    if (message == null || message.content.getConstructor() == 67761875) {
                        str = null;
                    } else {
                        if (this.f12773b == 1) {
                            long O0 = e.O0(this.N.lastMessage);
                            TdApi.Message message2 = this.N.lastMessage;
                            if (O0 == message2.chatId && ib.i.i(message2.authorSignature)) {
                                str = w.i1(R.string.FromAnonymous);
                            }
                        }
                        str = this.M.Bb(this.N.lastMessage, false, this.f12773b == 1);
                    }
                }
                z10 = true;
            }
            if (!ib.i.i(str)) {
                int i11 = this.f12773b;
                if (i11 != 1) {
                    i10 = ((this.S - wc.a.f1(i11)) - wc.a.getRightPadding()) - E();
                } else {
                    i10 = a0.i(120.0f);
                }
                if (i10 > 0) {
                    g.b y10 = new g.b(str, i10, T(this.f12773b), ib.c.b(this.f12771a, 16) ? t.d.G : t.d.C).v().y(Log.TAG_CAMERA);
                    if (z10 && this.f12773b == 1) {
                        y10.x(": ");
                    }
                    this.f12772a0 = y10.f();
                } else {
                    this.f12772a0 = null;
                }
            } else {
                this.f12772a0 = null;
            }
        } else {
            this.f12772a0 = null;
        }
        B0();
    }

    public TdApi.ChatSource O() {
        TdApi.ChatPosition I = I();
        if (I != null) {
            return I.source;
        }
        return null;
    }

    public void O0() {
        this.f12771a = this.f12771a & (-2) & (-17) & (-513) & (-1025);
        jb.c cVar = this.f12779f0;
        if (cVar != null) {
            cVar.b();
        }
        String str = null;
        l0[] l0VarArr = null;
        this.f12778e0 = null;
        if (this.M.u6(this.N)) {
            this.f12771a |= Log.TAG_GIF_LOADER;
            L0(new t2.d(t2.W, (int) R.string.ChatContentProtected));
            return;
        }
        String K3 = this.M.K3(this.N);
        boolean z10 = false;
        if (K3 != null) {
            L0(new t2.d(t2.V, 0, K3, false));
        } else if (i0()) {
            final ArrayList arrayList = new ArrayList();
            final StringBuilder sb2 = new StringBuilder();
            this.P.t(new j() {
                @Override
                public final void a(Object obj) {
                    b3.this.z0(sb2, arrayList, (TdApi.Chat) obj);
                }
            });
            if (sb2.length() == 0) {
                sb2.append(w.q2(R.string.xChats, this.P.L()));
            }
            String sb3 = sb2.toString();
            if (!arrayList.isEmpty()) {
                l0VarArr = (l0[]) arrayList.toArray(new l0[0]);
            }
            R0(sb3, l0VarArr, false);
            N0();
        } else if (this.N.draftMessage == null || !Y0()) {
            TdApi.ChatSource O = O();
            if (O instanceof TdApi.ChatSourcePublicServiceAnnouncement) {
                str = ((TdApi.ChatSourcePublicServiceAnnouncement) O).text;
            }
            if (!ib.i.i(str)) {
                L0(new t2.d(t2.U, 0, str, false));
                return;
            }
            TdApi.Chat chat = this.N;
            if (chat.lastMessage == null && ob.a.j(chat.f19908id)) {
                TdApi.SecretChat b42 = this.M.b4(this.N.f19908id);
                if (b42 != null) {
                    int constructor = b42.state.getConstructor();
                    if (constructor == -1945106707) {
                        P0(R.string.SecretChatCancelled);
                    } else if (constructor == -1637050756) {
                        Q0(b42.isOutbound ? w.j1(R.string.AwaitingEncryption, this.M.e2().C2(b42.userId)) : w.i1(R.string.VoipExchangingKeys), true);
                    } else if (constructor != -1611352087) {
                        throw new RuntimeException();
                    } else if (b42.isOutbound) {
                        Q0(w.j1(R.string.XJoinedSecretChat, this.M.e2().C2(b42.userId)), true);
                    } else {
                        Q0(w.i1(R.string.YouJoinedSecretChat), true);
                    }
                    z10 = true;
                }
                if (z10) {
                    N0();
                    return;
                }
            }
            TdApi.Message message = this.N.lastMessage;
            if (message != null) {
                L0(t2.R0(this.M, message.chatId, message));
                return;
            }
            P0(R.string.DeletedMessage);
            N0();
        } else {
            this.f12771a |= 17;
            TdApi.FormattedText formattedText = ((TdApi.InputMessageText) this.N.draftMessage.inputMessageText).text;
            S0(formattedText.text, formattedText.entities, false);
            N0();
        }
    }

    public g P() {
        return this.f12777d0;
    }

    public final void P0(int i10) {
        Q0(w.i1(i10), true);
    }

    public int Q() {
        return this.f12780g0;
    }

    public final void Q0(String str, boolean z10) {
        R0(str, null, z10);
    }

    @Override
    public void Q2() {
        this.f12787n0.k();
        W0(false);
    }

    public jb.c R() {
        return this.f12779f0;
    }

    public final void R0(String str, l0[] l0VarArr, boolean z10) {
        this.f12774b0 = str;
        if (l0VarArr == null || l0VarArr.length <= 0) {
            l0VarArr = null;
        }
        this.f12776c0 = l0VarArr;
        this.f12771a = ib.c.h(this.f12771a, Log.TAG_CAMERA, z10);
    }

    public int S() {
        return this.f12781h0;
    }

    public final void S0(String str, TdApi.TextEntity[] textEntityArr, boolean z10) {
        R0(str, l0.E(this.M, str, textEntityArr, null), z10);
    }

    public void T0() {
        int i10;
        String str = "";
        if (i0()) {
            int F = this.P.F();
            if (F != 0) {
                str = w.V2(F, TimeUnit.SECONDS);
            }
            this.Y = str;
        } else {
            TdApi.ChatSource O = O();
            if (O != null) {
                int constructor = O.getConstructor();
                if (constructor == -328571244) {
                    this.Y = w.W0((TdApi.ChatSourcePublicServiceAnnouncement) O);
                } else if (constructor == 394074115) {
                    this.Y = w.i1(R.string.ProxySponsor);
                }
            } else {
                TdApi.Chat chat = this.N;
                TdApi.DraftMessage draftMessage = chat.draftMessage;
                if (draftMessage != null) {
                    i10 = draftMessage.date;
                } else {
                    TdApi.Message message = chat.lastMessage;
                    i10 = message != null ? message.date : 0;
                }
                if (i10 != 0) {
                    str = w.V2(i10, TimeUnit.SECONDS);
                }
                this.Y = str;
            }
        }
        this.Z = (int) v0.T1(this.Y, wc.a.getTimePaint());
        C0();
        X0();
    }

    public String U() {
        return this.Y;
    }

    public void U0() {
        V0(i0() ? w.i1(R.string.ArchiveTitleList) : this.M.W3(this.N));
        D0(true);
    }

    public int V() {
        return this.f12782i0;
    }

    public final void V0(String str) {
        this.W = str;
    }

    public int W() {
        return this.Z;
    }

    public final void W0(boolean z10) {
        int i10 = this.f12771a;
        if (z10 != ((i10 & Log.TAG_CRASH) != 0)) {
            this.f12771a = ib.c.h(i10, Log.TAG_CRASH, z10);
            ic.d dVar = this.f12796w0;
            if (dVar == null) {
                return;
            }
            if (z10) {
                dVar.f(this.N.f19908id, 0L);
            } else {
                dVar.g();
            }
        }
    }

    public g X() {
        return this.X;
    }

    public final void X0() {
        if (this.f12791r0 != null) {
            this.f12791r0.u(d0(), F0());
        }
    }

    public boolean Y0() {
        TdApi.DraftMessage draftMessage;
        if (!i0()) {
            TdApi.Chat chat = this.N;
            if (chat.unreadCount == 0 && (draftMessage = chat.draftMessage) != null && draftMessage.inputMessageText.getConstructor() == 247050392) {
                return true;
            }
        }
        return false;
    }

    public int Z() {
        g gVar = this.X;
        if (gVar != null) {
            return gVar.getWidth();
        }
        return 0;
    }

    public boolean Z0() {
        return (this.f12771a & Log.TAG_COMPRESS) != 0;
    }

    @Override
    public void a(long j10, long j11, t2.d dVar) {
        u2.a(this, j10, j11, dVar);
    }

    public final int a0() {
        if (i0()) {
            z8 A5 = this.M.A5(ob.b.f19339b);
            int i10 = A5.f28794b;
            int i11 = A5.f28796d;
            int i12 = i10 - i11;
            if (i12 > 0) {
                return i12;
            }
            if (i11 > 0) {
                return o6.A2;
            }
            return 0;
        }
        TdApi.Chat chat = this.N;
        int i13 = chat.unreadCount;
        if (i13 > 0) {
            return i13;
        }
        if (chat.isMarkedAsUnread) {
            return o6.A2;
        }
        return 0;
    }

    public boolean a1() {
        return this.M.w3(this.N);
    }

    @Override
    public void b(long j10, long j11, final t2.d dVar, final t2.d dVar2) {
        this.M.hd().post(new Runnable() {
            @Override
            public final void run() {
                b3.this.y0(dVar2, dVar);
            }
        });
    }

    public int b0() {
        if (k0()) {
            return o6.B2;
        }
        if (i0()) {
            return a0();
        }
        if (O() != null) {
            return 0;
        }
        TdApi.Chat chat = this.N;
        int i10 = chat.unreadCount;
        if (i10 > 0) {
            return i10;
        }
        if (chat.isMarkedAsUnread) {
            return o6.A2;
        }
        return 0;
    }

    public boolean b1() {
        return (this.f12771a & Log.TAG_ROUND) != 0;
    }

    public int c0() {
        return this.f12784k0;
    }

    public boolean c1() {
        return (this.f12771a & 32) != 0;
    }

    @Override
    public boolean d(a aVar) {
        return F0();
    }

    public final int d0() {
        TdApi.Chat chat = this.N;
        if (chat == null || !t2.s3(chat.lastMessage)) {
            return 0;
        }
        return t2.t2(this.N.lastMessage.interactionInfo);
    }

    public boolean d1() {
        TdApi.Message message;
        return !s0() && n0() && j0() && (message = this.N.lastMessage) != null && t2.t2(message.interactionInfo) > 0;
    }

    public a e0() {
        return this.f12791r0;
    }

    public final ic.d e1() {
        return this.f12796w0;
    }

    public boolean f0() {
        return this.U != null;
    }

    public void f1() {
        TdApi.Chat chat = this.N;
        if (chat != null && chat.lastMessage != null && j0() && d1()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j10 = this.T;
            TdApi.Message message = this.N.lastMessage;
            if (j10 != message.f19946id || ((float) (uptimeMillis - this.f12793t0)) > ((1.0f - ib.h.d(t2.t2(message.interactionInfo) / 1000.0f)) * 1800000.0f) + 300000.0f) {
                this.f12793t0 = uptimeMillis;
                this.T = this.N.lastMessage.f19946id;
                this.M.v4().o(new TdApi.ViewMessages(this.N.f19908id, 0L, new long[]{this.T}, false), this.M.na());
            }
        }
    }

    public boolean g0() {
        if (i0()) {
            return this.P.o();
        }
        return this.N.hasScheduledMessages;
    }

    public boolean g1(long j10, String str) {
        if (x() != j10) {
            return false;
        }
        boolean u62 = this.M.u6(this.N);
        TdApi.Chat chat = this.N;
        chat.clientData = str;
        if (u62 == this.M.u6(chat)) {
            return false;
        }
        O0();
        return true;
    }

    public final void h(int i10) {
        if (i10 != 0) {
            if (this.f12779f0 == null) {
                this.f12779f0 = new jb.c(2);
            }
            this.f12779f0.a(i10);
        }
    }

    public boolean h0() {
        if (i0()) {
            return this.P.p();
        }
        return this.N.unreadMentionCount > 0;
    }

    public boolean h1(long j10, boolean z10) {
        TdApi.Chat chat = this.N;
        if (chat.f19908id != j10 || chat.hasScheduledMessages == z10) {
            return false;
        }
        chat.hasScheduledMessages = z10;
        this.f12788o0.b(z10, F0());
        return true;
    }

    public void i(View view) {
        if (this.f12787n0.j(view)) {
            W0(true);
        }
    }

    public boolean i0() {
        return (this.f12771a & Log.TAG_VIDEO) != 0;
    }

    public boolean i1(long j10, TdApi.ChatPermissions chatPermissions) {
        if (x() != j10) {
            return false;
        }
        this.N.permissions = chatPermissions;
        return false;
    }

    public final void j(int i10) {
        if (i10 > 0) {
            this.S = i10;
            M0(true);
            T0();
            U0();
            O0();
            K0();
        }
    }

    public boolean j0() {
        return ob.a.k(x()) && !this.M.u7(this.N);
    }

    public boolean j1(long j10, TdApi.ChatPhotoInfo chatPhotoInfo) {
        if (x() != j10) {
            return false;
        }
        this.N.photo = chatPhotoInfo;
        K0();
        return true;
    }

    public void k() {
        int u02 = i.c2().u0();
        if (this.f12773b != u02) {
            this.f12773b = u02;
            this.S = 0;
            if (this.V != null) {
                K0();
            }
            this.f12787n0.requestLayout();
            this.f12787n0.invalidate();
        }
    }

    public boolean k0() {
        if (i0()) {
            return this.P.n();
        }
        return t2.R2(this.N.lastMessage);
    }

    public boolean k1(long j10, TdApi.ChatPosition chatPosition, boolean z10, boolean z11) {
        if (x() == j10) {
            TdApi.ChatPosition a10 = ob.b.a(this.N, this.O);
            if (o6.Id(this.N, chatPosition) && e.E(this.O, chatPosition.list)) {
                if (z10) {
                    T0();
                    M0(true);
                    if ((chatPosition.source instanceof TdApi.ChatSourcePublicServiceAnnouncement) || (a10 != null && (a10.source instanceof TdApi.ChatSourcePublicServiceAnnouncement))) {
                        O0();
                    }
                    D0(false);
                }
                return true;
            }
        }
        return false;
    }

    public boolean l(long j10) {
        o6.f d10;
        TdApi.Message message;
        TdApi.Chat chat = this.N;
        if (!(chat == null || (message = chat.lastMessage) == null || message.f19946id != j10)) {
            return true;
        }
        t2.d dVar = this.f12778e0;
        if (dVar == null || (d10 = dVar.d()) == null) {
            return false;
        }
        for (TdApi.Message message2 : d10.f28132a) {
            if (message2.f19946id == j10) {
                return true;
            }
        }
        return false;
    }

    public boolean l0() {
        return ob.a.g(x());
    }

    public boolean l1(long j10, long j11, int i10) {
        if (this.N.f19908id != j10) {
            return false;
        }
        boolean Y0 = Y0();
        TdApi.Chat chat = this.N;
        chat.lastReadInboxMessageId = j11;
        chat.unreadCount = i10;
        boolean Y02 = Y0();
        M0(true);
        if (Y0 != Y02) {
            O0();
        }
        return true;
    }

    @Override
    public void m(a aVar, boolean z10) {
        if (z10) {
            if (aVar == this.f12791r0) {
                D0(false);
            } else {
                if (this.f12792s0 != E()) {
                    A0();
                }
            }
        }
        this.f12787n0.invalidate();
    }

    public boolean m0() {
        return (this.f12771a & Log.TAG_EMOJI) != 0;
    }

    public boolean m1(long j10, long j11) {
        TdApi.Chat chat = this.N;
        if (chat.f19908id != j10) {
            return false;
        }
        chat.lastReadOutboxMessageId = j11;
        TdApi.Message message = chat.lastMessage;
        return message != null && t2.s3(message);
    }

    @Override
    public void n(boolean z10) {
        Iterator<View> it = this.f12787n0.n().iterator();
        while (it.hasNext()) {
            ((wc.a) it.next()).n(z10);
        }
    }

    public boolean n0() {
        TdApi.Message message;
        return !i0() && !Y0() && (message = this.N.lastMessage) != null && message.isOutgoing;
    }

    public boolean n1(long j10, TdApi.ChatNotificationSettings chatNotificationSettings) {
        if (x() != j10) {
            return false;
        }
        this.N.notificationSettings = chatNotificationSettings;
        D0(false);
        M0(true);
        return true;
    }

    public boolean o(int i10) {
        int i11 = this.S;
        boolean z10 = true;
        if (i11 == 0) {
            if (i10 <= 0) {
                z10 = false;
            }
            j(i10);
            return z10;
        } else if (i11 == i10 || i10 <= 0) {
            return false;
        } else {
            this.S = i10;
            C0();
            D0(false);
            A0();
            return true;
        }
    }

    public boolean o0() {
        TdApi.ChatPosition I = I();
        return I != null && I.isPinned;
    }

    public boolean o1(long j10, String str) {
        if (x() != j10) {
            return false;
        }
        TdApi.Chat chat = this.N;
        chat.title = str;
        V0(this.M.W3(chat));
        D0(true);
        if (this.M.c7(this.N) && !ob.a.l(j10) && e.R0(this.N.lastMessage) == j10) {
            O0();
        }
        return true;
    }

    @Override
    public boolean p() {
        return (this.f12771a & Log.TAG_CRASH) != 0 && this.f12787n0.g() && this.f12775c.Z9().z9();
    }

    public boolean p0() {
        TdApi.ChatPosition I = I();
        return I != null && (I.isPinned || I.source != null);
    }

    public boolean p1(long j10, int i10) {
        TdApi.Chat chat = this.N;
        if (chat.f19908id == j10) {
            boolean z10 = chat.unreadMentionCount > 0;
            chat.unreadMentionCount = i10;
            if ((i10 > 0) != z10) {
                M0(F0());
                return true;
            }
        }
        return false;
    }

    @Override
    public void q() {
        ic.d dVar = this.f12796w0;
        if (dVar != null) {
            String j10 = dVar.j();
            g gVar = null;
            if (!ib.i.i(j10)) {
                int f12 = ((this.S - wc.a.f1(this.f12773b)) - wc.a.getRightPadding()) - E();
                final int e10 = this.f12796w0.e();
                if (f12 > 0) {
                    g.b bVar = new g.b(j10, f12, T(this.f12773b), t.d.D);
                    int i10 = 1;
                    if (this.f12773b != 1) {
                        i10 = 2;
                    }
                    g.b p10 = bVar.p(i10);
                    if (e10 > 0) {
                        p10.n(new g.f() {
                            @Override
                            public final int a(int i11, int i12, int i13, int i14) {
                                int w02;
                                w02 = b3.w0(e10, i11, i12, i13, i14);
                                return w02;
                            }
                        });
                    }
                    gVar = p10.f();
                }
            }
            this.f12796w0.l(gVar);
        }
    }

    public boolean q0() {
        return ob.a.j(x());
    }

    public boolean q1(long j10, TdApi.DraftMessage draftMessage) {
        if (x() != j10) {
            return false;
        }
        this.N.draftMessage = draftMessage;
        O0();
        T0();
        D0(false);
        return true;
    }

    public boolean r() {
        int h10 = ib.c.h(this.f12771a, Log.TAG_EMOJI, !i0() && ob.a.l(this.N.f19908id) && this.M.Bc().u(t2.n2(this.N)));
        if (this.f12771a == h10) {
            return false;
        }
        this.f12771a = h10;
        return true;
    }

    public boolean r0() {
        return (this.f12771a & Log.TAG_YOUTUBE) != 0;
    }

    public void r1(boolean r2) {
        throw new UnsupportedOperationException("Method not decompiled: hd.b3.r1(boolean):void");
    }

    public void s(View view) {
        if (this.f12787n0.l(view)) {
            W0(this.f12787n0.g());
        }
    }

    public boolean s0() {
        TdApi.Chat chat = this.N;
        if (chat != null) {
            if (!this.M.aa(chat.lastMessage) && !this.M.Y9(this.N.lastMessage)) {
                o6 o6Var = this.M;
                t2.d dVar = this.f12778e0;
                if (o6Var.K1(dVar != null ? dVar.d() : null)) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean s1(long j10, boolean z10) {
        if (x() != j10) {
            return false;
        }
        this.N.isMarkedAsUnread = z10;
        M0(true);
        return true;
    }

    public h t() {
        return this.U;
    }

    public final boolean t0() {
        return this.f12773b == 1 || (this.f12771a & 1) != 0;
    }

    public boolean t1(long j10, long j11, TdApi.MessageContent messageContent) {
        o6.f d10;
        boolean z10;
        if (x() == j10 && this.N.lastMessage != null) {
            t2.d dVar = this.f12778e0;
            if (!(dVar == null || (d10 = dVar.d()) == null)) {
                Iterator<TdApi.Message> it = d10.f28132a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                    TdApi.Message next = it.next();
                    if (next.f19946id == j11) {
                        next.content = messageContent;
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    L0(t2.A0(this.M, this.N.lastMessage, d10, true));
                    return true;
                }
            }
            TdApi.Message message = this.N.lastMessage;
            if (message.f19946id == j11) {
                message.content = messageContent;
                O0();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean u() {
        return ib.c.b(this.f12771a, Log.TAG_CRASH);
    }

    public boolean u0() {
        return ob.a.k(x()) && this.M.u7(this.N);
    }

    public boolean u1(long j10, long j11, TdApi.MessageInteractionInfo messageInteractionInfo) {
        if (x() != j10 || !l(j11)) {
            return false;
        }
        this.N.lastMessage.interactionInfo = messageInteractionInfo;
        X0();
        return d1();
    }

    public b v() {
        return this.V;
    }

    public boolean v0() {
        if (i0()) {
            return false;
        }
        TdApi.Chat chat = this.N;
        if (chat.lastMessage == null || this.M.Q6(chat)) {
            return false;
        }
        if (n0()) {
            TdApi.Chat chat2 = this.N;
            return chat2.lastMessage.f19946id > chat2.lastReadOutboxMessageId;
        }
        TdApi.Chat chat3 = this.N;
        return chat3.lastMessage.f19946id > chat3.lastReadInboxMessageId;
    }

    public boolean v1(TdApi.Message message, long j10) {
        if (l(j10)) {
            return y1(message.chatId, message);
        }
        return false;
    }

    public TdApi.Chat w() {
        return this.M.W2(x());
    }

    public boolean w1(long j10, long[] jArr) {
        TdApi.Message message;
        o6.f d10;
        TdApi.Chat chat = this.N;
        boolean z10 = false;
        if (chat.f19908id != j10 || (message = chat.lastMessage) == null) {
            return false;
        }
        if (ib.b.s(jArr, message.f19946id) >= 0) {
            this.N.lastMessage = null;
            O0();
            return true;
        }
        t2.d dVar = this.f12778e0;
        if (!(dVar == null || (d10 = dVar.d()) == null)) {
            for (int size = d10.f28132a.size() - 1; size >= 0; size--) {
                if (ib.b.s(jArr, d10.f28132a.get(size).f19946id) >= 0) {
                    d10.f28132a.remove(size);
                    z10 = true;
                }
            }
            if (d10.f28132a.size() <= 1) {
                O0();
                return true;
            } else if (z10) {
                L0(t2.A0(this.M, this.N.lastMessage, d10, true));
            }
        }
        return true;
    }

    public long x() {
        TdApi.Chat chat = this.N;
        if (chat != null) {
            return chat.f19908id;
        }
        return 0L;
    }

    public boolean x1(TdApi.SecretChat secretChat) {
        if (!q0() || t2.b2(this.N) != secretChat.f19960id || this.N.lastMessage != null || Y0()) {
            return false;
        }
        O0();
        return true;
    }

    public TdApi.ChatList y() {
        return this.O;
    }

    public boolean y1(long j10, TdApi.Message message) {
        if (x() != j10) {
            return false;
        }
        TdApi.Chat chat = this.N;
        TdApi.Message message2 = chat.lastMessage;
        chat.lastMessage = message;
        if ((message2 == null && message == null) || (message2 != null && message != null && message2.f19946id == message.f19946id)) {
            return false;
        }
        M0(true);
        T0();
        O0();
        D0(false);
        return true;
    }

    public g z() {
        return this.f12786m0;
    }

    public boolean z1(TdApi.User user) {
        TdApi.Chat chat = this.N;
        if (chat == null) {
            return false;
        }
        int constructor = chat.type.getConstructor();
        if (constructor != -1472570774) {
            if (constructor != 973884508) {
                if (constructor == 1579049844 && L() == user.f19979id) {
                    U0();
                    K0();
                    return true;
                }
            } else if (e.T0(this.N.lastMessage) == user.f19979id) {
                O0();
                return true;
            }
        } else if (this.M.u7(this.N) && e.R0(this.N.lastMessage) == user.f19979id) {
            O0();
            return true;
        }
        return false;
    }

    public b3(v4<?> v4Var, e8 e8Var, boolean z10) {
        gb.g gVar = new gb.g();
        this.f12787n0 = gVar;
        this.f12794u0 = -1;
        this.f12775c = v4Var;
        this.f12796w0 = null;
        this.M = v4Var.c();
        this.N = null;
        this.O = null;
        this.P = e8Var;
        this.f12773b = i.c2().u0();
        eb.g gVar2 = new eb.g(gVar);
        this.f12788o0 = gVar2;
        this.f12789p0 = new a.b().d(this).b();
        this.f12790q0 = new a.b().f(R.drawable.baseline_at_16, 16.0f, 0.0f, 17).d(this).b();
        this.f12791r0 = null;
        this.f12771a |= Log.TAG_VIDEO;
        M0(false);
        gVar2.b(g0(), false);
        if (z10) {
            j(a0.g());
        }
    }
}
