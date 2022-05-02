package gd;

import android.os.SystemClock;
import android.view.View;
import be.C1357a0;
import be.C1392p;
import be.C1410y;
import gd.C4587b;
import gd.C4779t2;
import ge.C4868i;
import ie.AbstractC5411l0;
import ie.C5375a;
import ie.C5417o0;
import ie.C5428t;
import ie.C5457w0;
import ie.RunnableC5390g;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p051db.C3941g;
import p080fb.C4341g;
import p082fd.C4403w;
import p108hb.C5062b;
import p108hb.C5063c;
import p108hb.C5069h;
import p108hb.C5070i;
import p124ib.C5320c;
import p139jb.AbstractC5911c;
import p139jb.AbstractC5918j;
import p156kd.C6246h;
import p193nb.C7316a;
import p193nb.C7317b;
import p193nb.C7321e;
import p350yd.C10562b9;
import p350yd.C10684g8;
import p350yd.C10802kc;
import p350yd.C10930q6;
import td.AbstractC9323v4;
import vc.C9903a;

public class C4592b3 implements C10802kc.AbstractC10807e, C4779t2.C4783d.AbstractC4784a, C5375a.AbstractC5378c, AbstractC5911c {
    public final C10930q6 f15127M;
    public final TdApi.Chat f15128N;
    public final TdApi.ChatList f15129O;
    public final C10684g8 f15130P;
    public long f15131Q;
    public int f15132R;
    public int f15133S;
    public long f15134T;
    public C6246h f15135U;
    public C4587b f15136V;
    public String f15137W;
    public RunnableC5390g f15138X;
    public String f15139Y;
    public int f15140Z;
    public int f15141a;
    public RunnableC5390g f15142a0;
    public int f15143b;
    public String f15144b0;
    public final AbstractC9323v4<?> f15145c;
    public AbstractC5411l0[] f15146c0;
    public RunnableC5390g f15147d0;
    public C4779t2.C4783d f15148e0;
    public C5320c f15149f0;
    public int f15150g0;
    public int f15151h0;
    public int f15152i0;
    public int f15153j0;
    public int f15154k0;
    public int f15155l0;
    public final C4341g f15156m0;
    public final C3941g f15157n0;
    public final C5375a f15158o0;
    public final C5375a f15159p0;
    public final C5375a f15160q0;
    public int f15161r0;
    public long f15162s0;
    public int f15163t0;
    public int f15164u0;
    public final C10802kc.C10806d f15165v0;

    public C4592b3(AbstractC9323v4<?> v4Var, TdApi.ChatList chatList, TdApi.Chat chat, boolean z) {
        C4341g gVar = new C4341g();
        this.f15156m0 = gVar;
        this.f15163t0 = -1;
        this.f15145c = v4Var;
        this.f15165v0 = new C10802kc.C10806d(v4Var.mo4347s(), v4Var.mo4348c(), this, v4Var);
        C10930q6 c = v4Var.mo4348c();
        this.f15127M = c;
        this.f15129O = chatList;
        this.f15128N = C7321e.m16940j(chat);
        this.f15130P = null;
        this.f15143b = C4868i.m24726c2().m24584u0();
        int constructor = chat.type.getConstructor();
        this.f15132R = constructor;
        switch (constructor) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                this.f15131Q = ((TdApi.ChatTypeSupergroup) chat.type).supergroupId;
                break;
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
                this.f15131Q = C4779t2.m25458o2(chat.type);
                break;
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                this.f15131Q = ((TdApi.ChatTypeBasicGroup) chat.type).basicGroupId;
                break;
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                long j = ((TdApi.ChatTypePrivate) chat.type).userId;
                this.f15131Q = j;
                if (j != 0 && c.m2379k7(j)) {
                    this.f15141a |= Log.TAG_YOUTUBE;
                    break;
                }
                break;
        }
        C3941g gVar2 = new C3941g(gVar);
        this.f15157n0 = gVar2;
        this.f15158o0 = new C5375a.C5377b().m23019d(this).m23021b();
        this.f15159p0 = new C5375a.C5377b().m23017f(R.drawable.baseline_at_16, 16.0f, 0.0f, 17).m23019d(this).m23021b();
        this.f15160q0 = new C5375a.C5377b().m23013j(11.0f).m23019d(this).m23016g().m23022a(false).m23014i(R.id.theme_color_ticksRead).m23017f(R.drawable.baseline_visibility_14, 14.0f, 3.0f, 5).m23021b();
        m27186L0(false);
        m27164W0();
        gVar2.m29571b(m27144f0(), false);
        m27111s();
        if (z) {
            m27131k(C1357a0.m37543g());
        }
    }

    public static C5457w0 m27173S(int i) {
        return C1410y.m37083A0(i == 2 ? 15.0f : 16.0f);
    }

    public static C5457w0 m27163X(int i) {
        return C1410y.m37083A0(i == 2 ? 16.0f : 17.0f);
    }

    public static int m27101v0(int i, int i2, int i3, int i4, int i5) {
        if (i2 == 0) {
            return i;
        }
        return 0;
    }

    public int m27098w0(int i, int i2, int i3, int i4) {
        if (i == 0) {
            return this.f15164u0;
        }
        return 0;
    }

    public void m27095x0(C4779t2.C4783d dVar, C4779t2.C4783d dVar2) {
        if (this.f15148e0 == dVar) {
            m27188K0(dVar2);
            this.f15156m0.invalidate();
        }
    }

    public void m27093y0(StringBuilder sb2, List list, TdApi.Chat chat) {
        if (sb2.length() > 0) {
            sb2.append(C4403w.m27854m0());
        }
        int length = sb2.length();
        sb2.append(this.f15127M.m2661S3(chat));
        if (chat.unreadCount > 0) {
            list.add(new C5417o0(this.f15145c, this.f15127M, null, length, sb2.length(), 0, null).m22761M(C5428t.AbstractC5441d.f17872C));
        }
    }

    public long m27209A() {
        return C4779t2.m25465n2(this.f15128N);
    }

    public final void m27208A0() {
        RunnableC5390g gVar;
        int d1 = (this.f15133S - C9903a.m6651d1(this.f15143b)) - C9903a.getRightPadding();
        int D = m27203D();
        this.f15161r0 = D;
        int i = d1 - D;
        this.f15151h0 = C9903a.m6651d1(this.f15143b);
        int i2 = 1;
        if (!((this.f15141a & 1) == 0 || (gVar = this.f15142a0) == null || this.f15143b != 1)) {
            int width = gVar.getWidth();
            i -= width;
            this.f15151h0 += width;
        }
        C5320c cVar = this.f15149f0;
        this.f15164u0 = (cVar == null || cVar.m23278g() <= 0) ? 0 : C1357a0.m37541i(2.0f) + (C1357a0.m37541i(18.0f) * this.f15149f0.m23278g());
        if (i <= 0 || C5070i.m24061i(this.f15144b0)) {
            this.f15147d0 = null;
        } else {
            RunnableC5390g.C5392b bVar = new RunnableC5390g.C5392b(this.f15144b0, i, m27173S(this.f15143b), C5428t.AbstractC5441d.f17873D);
            if (!m27110s0()) {
                i2 = 2;
            }
            this.f15147d0 = bVar.m22874p(i2).m22865y(Log.TAG_LUX).m22880j().m22877m(m27110s0()).m22876n(new RunnableC5390g.AbstractC5396f() {
                @Override
                public final int mo7827a(int i3, int i4, int i5, int i6) {
                    int w0;
                    w0 = C4592b3.this.m27098w0(i3, i4, i5, i6);
                    return w0;
                }
            }).m22881i(this.f15146c0).m22873q().m22884f();
        }
        mo3252o();
    }

    public int m27207B() {
        return this.f15155l0;
    }

    public final void m27206B0() {
        int timePaddingRight = (this.f15133S - C9903a.getTimePaddingRight()) - this.f15140Z;
        this.f15152i0 = timePaddingRight;
        this.f15155l0 = timePaddingRight - C9903a.getTimePaddingLeft();
    }

    public C5375a m27205C() {
        return this.f15158o0;
    }

    public void m27204C0(boolean z) {
        int d1 = (((this.f15133S - C9903a.m6651d1(this.f15143b)) - this.f15140Z) - C9903a.getTimePaddingRight()) - C9903a.getTimePaddingLeft();
        boolean p0 = m27118p0();
        if (m27160Y0()) {
            d1 = (d1 - C9903a.getMuteOffset()) - C1392p.m37234b();
        }
        boolean h4 = this.f15127M.m2430h4(this.f15128N);
        this.f15141a = C5063c.m24138h(this.f15141a, 32, h4);
        if (h4) {
            d1 -= C1357a0.m37541i(20.0f);
        }
        if (m27156a1()) {
            d1 = (int) (d1 - this.f15160q0.m23035j(C1357a0.m37541i(3.0f)));
        } else if (m27113r0() || m27125m0()) {
            d1 = (d1 - C9903a.getTimePaddingLeft()) - C1357a0.m37541i(20.0f);
        }
        if (p0) {
            d1 -= C1357a0.m37541i(14.0f);
        }
        if (z || this.f15163t0 != d1) {
            this.f15163t0 = d1;
            if (C5070i.m24061i(this.f15137W)) {
                this.f15138X = null;
            } else {
                this.f15138X = new RunnableC5390g.C5392b(this.f15137W, d1, m27163X(this.f15143b), m27118p0() ? C5428t.AbstractC5441d.f17875F : C5428t.AbstractC5441d.f17872C).m22868v().m22888b().m22883g().m22884f();
            }
        }
        int Y = m27161Y();
        this.f15154k0 = C9903a.m6651d1(this.f15143b) + Y;
        int d12 = C9903a.m6651d1(this.f15143b) + Y + C9903a.getMutePadding();
        this.f15153j0 = d12;
        if (h4) {
            this.f15153j0 = d12 + C1357a0.m37541i(20.0f);
        }
        if (p0) {
            this.f15154k0 += C1357a0.m37541i(14.0f);
            this.f15153j0 += C1357a0.m37541i(14.0f);
        }
        if (z && this.f15136V != null) {
            m27190J0();
        }
    }

    public final int m27203D() {
        return Math.round(this.f15158o0.m23035j(C9903a.getTimePaddingLeft()) + this.f15159p0.m23035j(C9903a.getTimePaddingLeft()));
    }

    public void m27202D0() {
        m27131k(C1357a0.m37543g());
    }

    public int m27201E() {
        return this.f15143b;
    }

    public boolean m27200E0() {
        View f = this.f15156m0.mo28226f();
        AbstractC9323v4<?> q9 = AbstractC9323v4.m9183q9(f);
        return f != null && (q9 == null || q9.m9353Ra());
    }

    public C5375a m27199F() {
        return this.f15159p0;
    }

    public boolean m27198F0() {
        if (m27138h0()) {
            return this.f15127M.m2189w5(C7317b.f23225b).f33875c > 0;
        }
        return this.f15127M.m2207v3(this.f15128N);
    }

    public int m27197G() {
        return this.f15153j0;
    }

    public void m27196G0() {
        m27186L0(true);
        m27172S0();
        m27182N0();
    }

    public TdApi.ChatPosition m27195H() {
        return C7317b.m17043a(this.f15128N, this.f15129O);
    }

    public void m27194H0() {
        m27186L0(true);
        this.f15157n0.m29571b(m27144f0(), true);
    }

    public RunnableC5390g m27193I() {
        if ((this.f15141a & 1) != 0) {
            return this.f15142a0;
        }
        return null;
    }

    public void m27192I0() {
        m27172S0();
    }

    public int m27191J() {
        C5320c cVar = this.f15149f0;
        if (cVar != null) {
            return cVar.m23278g();
        }
        return 0;
    }

    public final void m27190J0() {
        if (m27138h0()) {
            this.f15135U = null;
            this.f15136V = new C4587b(C9903a.m6657O0(this.f15143b) / 2.0f, new C4587b.C4588a((int) R.id.theme_color_avatarArchive, (int) R.drawable.baseline_archive_24), null);
            return;
        }
        TdApi.File X1 = (this.f15141a & Log.TAG_YOUTUBE) != 0 ? null : C4779t2.m25575X1(this.f15128N);
        if (X1 == null) {
            this.f15135U = null;
            this.f15136V = this.f15127M.m2947A3(this.f15128N, true, C9903a.m6657O0(this.f15143b) / 2.0f, null);
            return;
        }
        C6246h hVar = new C6246h(this.f15127M, X1);
        this.f15135U = hVar;
        hVar.mo20767t0(C9903a.getDefaultAvatarCacheSize());
        this.f15136V = null;
    }

    public long m27189K() {
        if (this.f15132R == 1579049844) {
            return this.f15131Q;
        }
        return 0L;
    }

    public final void m27188K0(C4779t2.C4783d dVar) {
        C5320c cVar = this.f15149f0;
        if (cVar != null) {
            cVar.m23283b();
        }
        String c = dVar.m25375c(true);
        TdApi.FormattedText formattedText = dVar.f16272d;
        m27174R0(c, formattedText != null ? formattedText.entities : null, dVar.f16273e);
        this.f15148e0 = dVar;
        C4779t2.C4787f fVar = dVar.f16270b;
        if (fVar == null) {
            TdApi.Message message = this.f15128N.lastMessage;
            if (!(message == null || message.forwardInfo == null || (!message.isChannelPost && m27191J() != 0))) {
                TdApi.MessageForwardInfo messageForwardInfo = this.f15128N.lastMessage.forwardInfo;
                switch (messageForwardInfo.origin.getConstructor()) {
                    case TdApi.MessageForwardOriginMessageImport.CONSTRUCTOR:
                        m27139h(R.drawable.templarian_baseline_import_16);
                        break;
                    case TdApi.MessageForwardOriginUser.CONSTRUCTOR:
                        if (C7321e.m16984R0(this.f15128N.lastMessage) != ((TdApi.MessageForwardOriginUser) messageForwardInfo.origin).senderUserId) {
                            m27139h(R.drawable.baseline_share_arrow_16);
                            break;
                        }
                        break;
                    case TdApi.MessageForwardOriginHiddenUser.CONSTRUCTOR:
                        m27139h(R.drawable.baseline_share_arrow_16);
                        break;
                    case TdApi.MessageForwardOriginChannel.CONSTRUCTOR:
                        if (this.f15128N.f25367id != ((TdApi.MessageForwardOriginChannel) messageForwardInfo.origin).chatId) {
                            m27139h(R.drawable.baseline_share_arrow_16);
                            break;
                        }
                        break;
                    case TdApi.MessageForwardOriginChat.CONSTRUCTOR:
                        if (C7321e.m16988P0(this.f15128N.lastMessage) != ((TdApi.MessageForwardOriginChat) messageForwardInfo.origin).senderChatId) {
                            m27139h(R.drawable.baseline_share_arrow_16);
                            break;
                        }
                        break;
                }
            }
        } else {
            m27139h(fVar.f16284b);
        }
        C4779t2.C4787f fVar2 = dVar.f16269a;
        if (fVar2 != null) {
            m27139h(fVar2.f16284b);
        }
        this.f15150g0 = R.id.theme_color_chatListIcon;
        if ((m27130k0() || m27107t0()) && !dVar.f16274f) {
            this.f15141a = 1 | this.f15141a;
        } else {
            TdApi.Message message2 = this.f15128N.lastMessage;
            if (message2 != null && message2.content.getConstructor() == 538893824) {
                C5320c cVar2 = this.f15149f0;
                if (cVar2 != null) {
                    cVar2.m23283b();
                }
                TdApi.Message message3 = this.f15128N.lastMessage;
                m27139h(C4619e.m26852j((TdApi.MessageCall) message3.content, C4779t2.m25429s3(message3)));
                this.f15150g0 = C4619e.m26850l((TdApi.MessageCall) this.f15128N.lastMessage.content);
            }
        }
        m27184M0();
        if (dVar.m25373e()) {
            dVar.m25371g(this);
        }
    }

    public C3941g m27187L() {
        return this.f15157n0;
    }

    public final void m27186L0(boolean z) {
        boolean g0 = m27141g0();
        int a0 = m27157a0();
        boolean z2 = false;
        this.f15159p0.m23026u(g0 ? C10930q6.f34956A2 : 0, false, z && m27200E0());
        C5375a aVar = this.f15158o0;
        if (g0 && a0 == 1) {
            a0 = 0;
        }
        boolean z3 = !m27198F0();
        if (z && m27200E0()) {
            z2 = true;
        }
        aVar.m23026u(a0, z3, z2);
    }

    public int m27185M() {
        return C4779t2.m25549b2(this.f15128N);
    }

    public final void m27184M0() {
        String str;
        int i;
        if ((this.f15141a & 1) != 0) {
            boolean z = false;
            if (m27162X0()) {
                TdApi.DraftMessage draftMessage = this.f15128N.draftMessage;
                if (draftMessage != null && draftMessage.inputMessageText.getConstructor() == 247050392 && !C7321e.m16965a1(((TdApi.InputMessageText) this.f15128N.draftMessage.inputMessageText).text)) {
                    z = true;
                }
                str = C4403w.m27869i1(R.string.Draft);
                this.f15141a |= Log.TAG_CAMERA;
            } else {
                if (m27125m0()) {
                    str = C4403w.m27869i1((this.f15143b == 1 || !this.f15127M.m2568Y6(this.f15128N) || C7321e.m16988P0(this.f15128N.lastMessage) != this.f15128N.f25367id) ? R.string.FromYou : R.string.FromYouAnonymous);
                    this.f15141a |= Log.TAG_CAMERA;
                } else {
                    TdApi.Message message = this.f15128N.lastMessage;
                    if (message == null || message.content.getConstructor() == 67761875) {
                        str = null;
                    } else {
                        if (this.f15143b == 1) {
                            long M0 = C7321e.m16994M0(this.f15128N.lastMessage);
                            TdApi.Message message2 = this.f15128N.lastMessage;
                            if (M0 == message2.chatId && C5070i.m24061i(message2.authorSignature)) {
                                str = C4403w.m27869i1(R.string.FromAnonymous);
                            }
                        }
                        str = this.f15127M.m2167xb(this.f15128N.lastMessage, false, this.f15143b == 1);
                    }
                }
                z = true;
            }
            if (!C5070i.m24061i(str)) {
                int i2 = this.f15143b;
                if (i2 != 1) {
                    i = ((this.f15133S - C9903a.m6651d1(i2)) - C9903a.getRightPadding()) - m27203D();
                } else {
                    i = C1357a0.m37541i(120.0f);
                }
                if (i > 0) {
                    RunnableC5390g.C5392b y = new RunnableC5390g.C5392b(str, i, m27173S(this.f15143b), C5063c.m24144b(this.f15141a, 16) ? C5428t.AbstractC5441d.f17876G : C5428t.AbstractC5441d.f17872C).m22868v().m22865y(Log.TAG_CAMERA);
                    if (z && this.f15143b == 1) {
                        y.m22866x(": ");
                    }
                    this.f15142a0 = y.m22884f();
                } else {
                    this.f15142a0 = null;
                }
            } else {
                this.f15142a0 = null;
            }
        } else {
            this.f15142a0 = null;
        }
        m27208A0();
    }

    public TdApi.ChatSource m27183N() {
        TdApi.ChatPosition H = m27195H();
        if (H != null) {
            return H.source;
        }
        return null;
    }

    public void m27182N0() {
        int i = this.f15141a & (-2);
        this.f15141a = i;
        int i2 = i & (-17);
        this.f15141a = i2;
        int i3 = i2 & (-513);
        this.f15141a = i3;
        this.f15141a = i3 & (-1025);
        C5320c cVar = this.f15149f0;
        if (cVar != null) {
            cVar.m23283b();
        }
        String str = null;
        AbstractC5411l0[] l0VarArr = null;
        this.f15148e0 = null;
        if (this.f15127M.m2284q6(this.f15128N)) {
            this.f15141a |= Log.TAG_GIF_LOADER;
            m27188K0(new C4779t2.C4783d(C4779t2.f16238W, (int) R.string.ChatContentProtected));
            return;
        }
        String H3 = this.f15127M.m2835H3(this.f15128N);
        boolean z = false;
        if (H3 != null) {
            m27188K0(new C4779t2.C4783d(C4779t2.f16237V, 0, H3, false));
        } else if (m27138h0()) {
            final ArrayList arrayList = new ArrayList();
            final StringBuilder sb2 = new StringBuilder();
            this.f15130P.m4280t(new AbstractC5918j() {
                @Override
                public final void mo1330a(Object obj) {
                    C4592b3.this.m27093y0(sb2, arrayList, (TdApi.Chat) obj);
                }
            });
            if (sb2.length() == 0) {
                sb2.append(C4403w.m27836q2(R.string.xChats, this.f15130P.m4301L()));
            }
            String sb3 = sb2.toString();
            if (!arrayList.isEmpty()) {
                l0VarArr = (AbstractC5411l0[]) arrayList.toArray(new AbstractC5411l0[0]);
            }
            m27176Q0(sb3, l0VarArr, false);
            m27184M0();
        } else if (this.f15128N.draftMessage == null || !m27162X0()) {
            TdApi.ChatSource N = m27183N();
            if (N instanceof TdApi.ChatSourcePublicServiceAnnouncement) {
                str = ((TdApi.ChatSourcePublicServiceAnnouncement) N).text;
            }
            if (!C5070i.m24061i(str)) {
                m27188K0(new C4779t2.C4783d(C4779t2.f16236U, 0, str, false));
                return;
            }
            TdApi.Chat chat = this.f15128N;
            if (chat.lastMessage == null && C7316a.m17051j(chat.f25367id)) {
                TdApi.SecretChat X3 = this.f15127M.m2586X3(this.f15128N.f25367id);
                if (X3 != null) {
                    int constructor = X3.state.getConstructor();
                    if (constructor == -1945106707) {
                        m27180O0(R.string.SecretChatCancelled);
                    } else if (constructor == -1637050756) {
                        m27178P0(X3.isOutbound ? C4403w.m27865j1(R.string.AwaitingEncryption, this.f15127M.m2480e2().m1749D2(X3.userId)) : C4403w.m27869i1(R.string.VoipExchangingKeys), true);
                    } else if (constructor != -1611352087) {
                        throw new RuntimeException();
                    } else if (X3.isOutbound) {
                        m27178P0(C4403w.m27865j1(R.string.XJoinedSecretChat, this.f15127M.m2480e2().m1749D2(X3.userId)), true);
                    } else {
                        m27178P0(C4403w.m27869i1(R.string.YouJoinedSecretChat), true);
                    }
                    z = true;
                }
                if (z) {
                    m27184M0();
                    return;
                }
            }
            TdApi.Message message = this.f15128N.lastMessage;
            if (message != null) {
                m27188K0(C4779t2.m25612R0(this.f15127M, message.chatId, message));
                return;
            }
            m27180O0(R.string.DeletedMessage);
            m27184M0();
        } else {
            this.f15141a |= 17;
            TdApi.FormattedText formattedText = ((TdApi.InputMessageText) this.f15128N.draftMessage.inputMessageText).text;
            m27174R0(formattedText.text, formattedText.entities, false);
            m27184M0();
        }
    }

    public RunnableC5390g m27181O() {
        return this.f15147d0;
    }

    public final void m27180O0(int i) {
        m27178P0(C4403w.m27869i1(i), true);
    }

    public int m27179P() {
        return this.f15150g0;
    }

    public final void m27178P0(String str, boolean z) {
        m27176Q0(str, null, z);
    }

    public C5320c m27177Q() {
        return this.f15149f0;
    }

    public final void m27176Q0(String str, AbstractC5411l0[] l0VarArr, boolean z) {
        this.f15144b0 = str;
        if (l0VarArr == null || l0VarArr.length <= 0) {
            l0VarArr = null;
        }
        this.f15146c0 = l0VarArr;
        this.f15141a = C5063c.m24138h(this.f15141a, Log.TAG_CAMERA, z);
    }

    public int m27175R() {
        return this.f15151h0;
    }

    public final void m27174R0(String str, TdApi.TextEntity[] textEntityArr, boolean z) {
        m27176Q0(str, AbstractC5411l0.m22790E(this.f15127M, str, textEntityArr, null), z);
    }

    public void m27172S0() {
        int i;
        String str = "";
        if (m27138h0()) {
            int F = this.f15130P.m4307F();
            if (F != 0) {
                str = C4403w.m27924V2(F, TimeUnit.SECONDS);
            }
            this.f15139Y = str;
        } else {
            TdApi.ChatSource N = m27183N();
            if (N != null) {
                int constructor = N.getConstructor();
                if (constructor == -328571244) {
                    this.f15139Y = C4403w.m27922W0((TdApi.ChatSourcePublicServiceAnnouncement) N);
                } else if (constructor == 394074115) {
                    this.f15139Y = C4403w.m27869i1(R.string.ProxySponsor);
                }
            } else {
                TdApi.Chat chat = this.f15128N;
                TdApi.DraftMessage draftMessage = chat.draftMessage;
                if (draftMessage != null) {
                    i = draftMessage.date;
                } else {
                    TdApi.Message message = chat.lastMessage;
                    i = message != null ? message.date : 0;
                }
                if (i != 0) {
                    str = C4403w.m27924V2(i, TimeUnit.SECONDS);
                }
                this.f15139Y = str;
            }
        }
        this.f15140Z = (int) C7389v0.m16680T1(this.f15139Y, C9903a.getTimePaint());
        m27206B0();
        m27164W0();
    }

    public String m27171T() {
        return this.f15139Y;
    }

    public void m27170T0() {
        m27168U0(m27138h0() ? C4403w.m27869i1(R.string.ArchiveTitleList) : this.f15127M.m2661S3(this.f15128N));
        m27204C0(true);
    }

    public int m27169U() {
        return this.f15152i0;
    }

    public final void m27168U0(String str) {
        this.f15137W = str;
    }

    public int m27167V() {
        return this.f15140Z;
    }

    public final void m27166V0(boolean z) {
        int i = this.f15141a;
        if (z != ((i & Log.TAG_CRASH) != 0)) {
            this.f15141a = C5063c.m24138h(i, Log.TAG_CRASH, z);
            C10802kc.C10806d dVar = this.f15165v0;
            if (dVar == null) {
                return;
            }
            if (z) {
                dVar.m3263f(this.f15128N.f25367id, 0L);
            } else {
                dVar.m3262g();
            }
        }
    }

    public RunnableC5390g m27165W() {
        return this.f15138X;
    }

    public final void m27164W0() {
        if (this.f15160q0 != null) {
            this.f15160q0.m23027t(m27152c0(), m27200E0());
        }
    }

    public boolean m27162X0() {
        TdApi.DraftMessage draftMessage;
        if (!m27138h0()) {
            TdApi.Chat chat = this.f15128N;
            if (chat.unreadCount == 0 && (draftMessage = chat.draftMessage) != null && draftMessage.inputMessageText.getConstructor() == 247050392) {
                return true;
            }
        }
        return false;
    }

    public int m27161Y() {
        RunnableC5390g gVar = this.f15138X;
        if (gVar != null) {
            return gVar.getWidth();
        }
        return 0;
    }

    public boolean m27160Y0() {
        return this.f15127M.m2239t3(this.f15128N);
    }

    public final int m27159Z() {
        if (m27138h0()) {
            C10562b9 w5 = this.f15127M.m2189w5(C7317b.f23225b);
            int i = w5.f33874b;
            int i2 = w5.f33876d;
            int i3 = i - i2;
            if (i3 > 0) {
                return i3;
            }
            if (i2 > 0) {
                return C10930q6.f34956A2;
            }
            return 0;
        }
        TdApi.Chat chat = this.f15128N;
        int i4 = chat.unreadCount;
        if (i4 > 0) {
            return i4;
        }
        if (chat.isMarkedAsUnread) {
            return C10930q6.f34956A2;
        }
        return 0;
    }

    public boolean m27158Z0() {
        return (this.f15141a & 32) != 0;
    }

    @Override
    public void mo7829a(long j, long j2, C4779t2.C4783d dVar) {
        C4804u2.m25223a(this, j, j2, dVar);
    }

    public int m27157a0() {
        if (m27133j0()) {
            return C10930q6.f34957B2;
        }
        if (m27138h0()) {
            return m27159Z();
        }
        if (m27183N() != null) {
            return 0;
        }
        TdApi.Chat chat = this.f15128N;
        int i = chat.unreadCount;
        if (i > 0) {
            return i;
        }
        if (chat.isMarkedAsUnread) {
            return C10930q6.f34956A2;
        }
        return 0;
    }

    public boolean m27156a1() {
        TdApi.Message message;
        return !m27113r0() && m27125m0() && m27135i0() && (message = this.f15128N.lastMessage) != null && C4779t2.m25423t2(message.interactionInfo) > 0;
    }

    @Override
    public void mo4501a3() {
        this.f15156m0.m28240k();
        m27166V0(false);
    }

    @Override
    public void mo7828b(long j, long j2, final C4779t2.C4783d dVar, final C4779t2.C4783d dVar2) {
        this.f15127M.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                C4592b3.this.m27095x0(dVar2, dVar);
            }
        });
    }

    public int m27155b0() {
        return this.f15154k0;
    }

    public final C10802kc.C10806d m27154b1() {
        return this.f15165v0;
    }

    public final int m27152c0() {
        TdApi.Chat chat = this.f15128N;
        if (chat == null || !C4779t2.m25429s3(chat.lastMessage)) {
            return 0;
        }
        return C4779t2.m25423t2(this.f15128N.lastMessage.interactionInfo);
    }

    public void m27151c1() {
        TdApi.Chat chat = this.f15128N;
        if (chat != null && chat.lastMessage != null && m27135i0() && m27156a1()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = this.f15134T;
            TdApi.Message message = this.f15128N.lastMessage;
            if (j != message.f25406id || ((float) (uptimeMillis - this.f15162s0)) > ((1.0f - C5069h.m24089d(C4779t2.m25423t2(message.interactionInfo) / 1000.0f)) * 1800000.0f) + 300000.0f) {
                this.f15162s0 = uptimeMillis;
                this.f15134T = this.f15128N.lastMessage.f25406id;
                this.f15127M.m2270r4().m14783o(new TdApi.ViewMessages(this.f15128N.f25367id, 0L, new long[]{this.f15134T}, false), this.f15127M.m2392ja());
            }
        }
    }

    @Override
    public boolean mo8363d(C5375a aVar) {
        return m27200E0();
    }

    public C5375a m27150d0() {
        return this.f15160q0;
    }

    public boolean m27149d1(long j, String str) {
        if (m27096x() != j) {
            return false;
        }
        boolean q6 = this.f15127M.m2284q6(this.f15128N);
        TdApi.Chat chat = this.f15128N;
        chat.clientData = str;
        if (q6 == this.f15127M.m2284q6(chat)) {
            return false;
        }
        m27182N0();
        return true;
    }

    public boolean m27147e0() {
        return this.f15135U != null;
    }

    public boolean m27146e1(long j, boolean z) {
        TdApi.Chat chat = this.f15128N;
        if (chat.f25367id != j || chat.hasScheduledMessages == z) {
            return false;
        }
        chat.hasScheduledMessages = z;
        this.f15157n0.m29571b(z, m27200E0());
        return true;
    }

    public boolean m27144f0() {
        if (m27138h0()) {
            return this.f15130P.m4285o();
        }
        return this.f15128N.hasScheduledMessages;
    }

    public boolean m27143f1(long j, TdApi.ChatPermissions chatPermissions) {
        if (m27096x() != j) {
            return false;
        }
        this.f15128N.permissions = chatPermissions;
        return false;
    }

    public boolean m27141g0() {
        if (m27138h0()) {
            return this.f15130P.m4284p();
        }
        return this.f15128N.unreadMentionCount > 0;
    }

    public boolean m27140g1(long j, TdApi.ChatPhotoInfo chatPhotoInfo) {
        if (m27096x() != j) {
            return false;
        }
        this.f15128N.photo = chatPhotoInfo;
        m27190J0();
        return true;
    }

    public final void m27139h(int i) {
        if (i != 0) {
            if (this.f15149f0 == null) {
                this.f15149f0 = new C5320c(2);
            }
            this.f15149f0.m23284a(i);
        }
    }

    public boolean m27138h0() {
        return (this.f15141a & Log.TAG_VIDEO) != 0;
    }

    public boolean m27137h1(long j, TdApi.ChatPosition chatPosition, boolean z, boolean z2) {
        if (m27096x() == j) {
            TdApi.ChatPosition a = C7317b.m17043a(this.f15128N, this.f15129O);
            if (C10930q6.m2889Dd(this.f15128N, chatPosition) && C7321e.m17015C(this.f15129O, chatPosition.list)) {
                if (z) {
                    m27172S0();
                    m27186L0(true);
                    if ((chatPosition.source instanceof TdApi.ChatSourcePublicServiceAnnouncement) || (a != null && (a.source instanceof TdApi.ChatSourcePublicServiceAnnouncement))) {
                        m27182N0();
                    }
                    m27204C0(false);
                }
                return true;
            }
        }
        return false;
    }

    public void m27136i(View view) {
        if (this.f15156m0.m28241j(view)) {
            m27166V0(true);
        }
    }

    public boolean m27135i0() {
        return C7316a.m17050k(m27096x()) && !this.f15127M.m2283q7(this.f15128N);
    }

    public boolean m27134i1(long j, long j2, int i) {
        if (this.f15128N.f25367id != j) {
            return false;
        }
        boolean X0 = m27162X0();
        TdApi.Chat chat = this.f15128N;
        chat.lastReadInboxMessageId = j2;
        chat.unreadCount = i;
        boolean X02 = m27162X0();
        m27186L0(true);
        if (X0 != X02) {
            m27182N0();
        }
        return true;
    }

    @Override
    public void mo8362j(C5375a aVar, boolean z) {
        if (z) {
            if (aVar == this.f15160q0) {
                m27204C0(false);
            } else {
                if (this.f15161r0 != m27203D()) {
                    m27091z0();
                }
            }
        }
        this.f15156m0.invalidate();
    }

    public boolean m27133j0() {
        if (m27138h0()) {
            return this.f15130P.m4286n();
        }
        return C4779t2.m25610R2(this.f15128N.lastMessage);
    }

    public boolean m27132j1(long j, long j2) {
        TdApi.Chat chat = this.f15128N;
        if (chat.f25367id != j) {
            return false;
        }
        chat.lastReadOutboxMessageId = j2;
        TdApi.Message message = chat.lastMessage;
        return message != null && C4779t2.m25429s3(message);
    }

    public final void m27131k(int i) {
        if (i > 0) {
            this.f15133S = i;
            m27186L0(true);
            m27172S0();
            m27170T0();
            m27182N0();
            m27190J0();
        }
    }

    public boolean m27130k0() {
        return C7316a.m17054g(m27096x());
    }

    public boolean m27129k1(long j, TdApi.ChatNotificationSettings chatNotificationSettings) {
        if (m27096x() != j) {
            return false;
        }
        this.f15128N.notificationSettings = chatNotificationSettings;
        m27204C0(false);
        m27186L0(true);
        return true;
    }

    public void m27128l() {
        int u0 = C4868i.m24726c2().m24584u0();
        if (this.f15143b != u0) {
            this.f15143b = u0;
            this.f15133S = 0;
            if (this.f15136V != null) {
                m27190J0();
            }
            this.f15156m0.requestLayout();
            this.f15156m0.invalidate();
        }
    }

    public boolean m27127l0() {
        return (this.f15141a & Log.TAG_EMOJI) != 0;
    }

    public boolean m27126l1(long j, String str) {
        if (m27096x() != j) {
            return false;
        }
        TdApi.Chat chat = this.f15128N;
        chat.title = str;
        m27168U0(this.f15127M.m2661S3(chat));
        m27204C0(true);
        if (this.f15127M.m2568Y6(this.f15128N) && !C7316a.m17049l(j) && C7321e.m16988P0(this.f15128N.lastMessage) == j) {
            m27182N0();
        }
        return true;
    }

    @Override
    public void mo3254m(boolean z) {
        List<Reference<View>> n = this.f15156m0.m28237n();
        if (n != null) {
            for (int size = n.size() - 1; size >= 0; size--) {
                View view = n.get(size).get();
                if (view != null) {
                    ((C9903a) view).m6646m(z);
                }
            }
        }
    }

    public boolean m27125m0() {
        TdApi.Message message;
        return !m27138h0() && !m27162X0() && (message = this.f15128N.lastMessage) != null && message.isOutgoing;
    }

    public boolean m27124m1(long j, int i) {
        TdApi.Chat chat = this.f15128N;
        if (chat.f25367id == j) {
            boolean z = chat.unreadMentionCount > 0;
            chat.unreadMentionCount = i;
            if ((i > 0) != z) {
                m27186L0(m27200E0());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean mo3253n() {
        return (this.f15141a & Log.TAG_CRASH) != 0 && this.f15156m0.mo28225g() && this.f15145c.m9300Z9().m9118z9();
    }

    public boolean m27123n0() {
        TdApi.ChatPosition H = m27195H();
        return H != null && H.isPinned;
    }

    public boolean m27122n1(long j, TdApi.DraftMessage draftMessage) {
        if (m27096x() != j) {
            return false;
        }
        this.f15128N.draftMessage = draftMessage;
        m27182N0();
        m27172S0();
        m27204C0(false);
        return true;
    }

    @Override
    public void mo3252o() {
        C10802kc.C10806d dVar = this.f15165v0;
        if (dVar != null) {
            String j = dVar.m3259j();
            RunnableC5390g gVar = null;
            if (!C5070i.m24061i(j)) {
                int d1 = ((this.f15133S - C9903a.m6651d1(this.f15143b)) - C9903a.getRightPadding()) - m27203D();
                final int e = this.f15165v0.m3264e();
                if (d1 > 0) {
                    RunnableC5390g.C5392b bVar = new RunnableC5390g.C5392b(j, d1, m27173S(this.f15143b), C5428t.AbstractC5441d.f17873D);
                    int i = 1;
                    if (this.f15143b != 1) {
                        i = 2;
                    }
                    RunnableC5390g.C5392b p = bVar.m22874p(i);
                    if (e > 0) {
                        p.m22876n(new RunnableC5390g.AbstractC5396f() {
                            @Override
                            public final int mo7827a(int i2, int i3, int i4, int i5) {
                                int v0;
                                v0 = C4592b3.m27101v0(e, i2, i3, i4, i5);
                                return v0;
                            }
                        });
                    }
                    gVar = p.m22884f();
                }
            }
            this.f15165v0.m3257l(gVar);
        }
    }

    public boolean m27121o0() {
        TdApi.ChatPosition H = m27195H();
        return H != null && (H.isPinned || H.source != null);
    }

    public void m27120o1(boolean r2) {
        throw new UnsupportedOperationException("Method not decompiled: gd.C4592b3.m27120o1(boolean):void");
    }

    public boolean m27119p(long j) {
        C10930q6.C10936f d;
        TdApi.Message message;
        TdApi.Chat chat = this.f15128N;
        if (!(chat == null || (message = chat.lastMessage) == null || message.f25406id != j)) {
            return true;
        }
        C4779t2.C4783d dVar = this.f15148e0;
        if (dVar == null || (d = dVar.m25374d()) == null) {
            return false;
        }
        for (TdApi.Message message2 : d.f35133a) {
            if (message2.f25406id == j) {
                return true;
            }
        }
        return false;
    }

    public boolean m27118p0() {
        return C7316a.m17051j(m27096x());
    }

    public boolean m27117p1(long j, boolean z) {
        if (m27096x() != j) {
            return false;
        }
        this.f15128N.isMarkedAsUnread = z;
        m27186L0(true);
        return true;
    }

    @Override
    public boolean mo3251q() {
        return C5063c.m24144b(this.f15141a, Log.TAG_CRASH);
    }

    public boolean m27116q0() {
        return (this.f15141a & Log.TAG_YOUTUBE) != 0;
    }

    public boolean m27115q1(long j, long j2, TdApi.MessageContent messageContent) {
        C10930q6.C10936f d;
        boolean z;
        if (m27096x() == j && this.f15128N.lastMessage != null) {
            C4779t2.C4783d dVar = this.f15148e0;
            if (!(dVar == null || (d = dVar.m25374d()) == null)) {
                Iterator<TdApi.Message> it = d.f35133a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    TdApi.Message next = it.next();
                    if (next.f25406id == j2) {
                        next.content = messageContent;
                        z = true;
                        break;
                    }
                }
                if (z) {
                    m27188K0(C4779t2.m25730A0(this.f15127M, this.f15128N.lastMessage, d, true));
                    return true;
                }
            }
            TdApi.Message message = this.f15128N.lastMessage;
            if (message.f25406id == j2) {
                message.content = messageContent;
                m27182N0();
                return true;
            }
        }
        return false;
    }

    public boolean m27114r(int i) {
        int i2 = this.f15133S;
        boolean z = true;
        if (i2 == 0) {
            if (i <= 0) {
                z = false;
            }
            m27131k(i);
            return z;
        } else if (i2 == i || i <= 0) {
            return false;
        } else {
            this.f15133S = i;
            m27206B0();
            m27204C0(false);
            m27091z0();
            return true;
        }
    }

    public boolean m27113r0() {
        TdApi.Chat chat = this.f15128N;
        if (chat != null) {
            if (!this.f15127M.m2595W9(chat.lastMessage) && !this.f15127M.m2625U9(this.f15128N.lastMessage)) {
                C10930q6 q6Var = this.f15127M;
                C4779t2.C4783d dVar = this.f15148e0;
                if (q6Var.m2789K1(dVar != null ? dVar.m25374d() : null)) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean m27112r1(long j, long j2, TdApi.MessageInteractionInfo messageInteractionInfo) {
        if (m27096x() != j || !m27119p(j2)) {
            return false;
        }
        this.f15128N.lastMessage.interactionInfo = messageInteractionInfo;
        m27164W0();
        return m27156a1();
    }

    public boolean m27111s() {
        int h = C5063c.m24138h(this.f15141a, Log.TAG_EMOJI, !m27138h0() && C7316a.m17049l(this.f15128N.f25367id) && this.f15127M.m2166xc().m3288u(C4779t2.m25465n2(this.f15128N)));
        if (this.f15141a == h) {
            return false;
        }
        this.f15141a = h;
        return true;
    }

    public final boolean m27110s0() {
        return this.f15143b == 1 || (this.f15141a & 1) != 0;
    }

    public boolean m27109s1(TdApi.Message message, long j) {
        if (m27119p(j)) {
            return m27100v1(message.chatId, message);
        }
        return false;
    }

    public void m27108t(View view) {
        if (this.f15156m0.m28239l(view)) {
            m27166V0(this.f15156m0.mo28225g());
        }
    }

    public boolean m27107t0() {
        return C7316a.m17050k(m27096x()) && this.f15127M.m2283q7(this.f15128N);
    }

    public boolean m27106t1(long j, long[] jArr) {
        TdApi.Message message;
        C10930q6.C10936f d;
        TdApi.Chat chat = this.f15128N;
        boolean z = false;
        if (chat.f25367id != j || (message = chat.lastMessage) == null) {
            return false;
        }
        if (C5062b.m24153s(jArr, message.f25406id) >= 0) {
            this.f15128N.lastMessage = null;
            m27182N0();
            return true;
        }
        C4779t2.C4783d dVar = this.f15148e0;
        if (!(dVar == null || (d = dVar.m25374d()) == null)) {
            for (int size = d.f35133a.size() - 1; size >= 0; size--) {
                if (C5062b.m24153s(jArr, d.f35133a.get(size).f25406id) >= 0) {
                    d.f35133a.remove(size);
                    z = true;
                }
            }
            if (d.f35133a.size() <= 1) {
                m27182N0();
                return true;
            } else if (z) {
                m27188K0(C4779t2.m25730A0(this.f15127M, this.f15128N.lastMessage, d, true));
            }
        }
        return true;
    }

    public C6246h m27105u() {
        return this.f15135U;
    }

    public boolean m27104u0() {
        if (m27138h0()) {
            return false;
        }
        TdApi.Chat chat = this.f15128N;
        if (chat.lastMessage == null || this.f15127M.m2752M6(chat)) {
            return false;
        }
        if (m27125m0()) {
            TdApi.Chat chat2 = this.f15128N;
            return chat2.lastMessage.f25406id > chat2.lastReadOutboxMessageId;
        }
        TdApi.Chat chat3 = this.f15128N;
        return chat3.lastMessage.f25406id > chat3.lastReadInboxMessageId;
    }

    public boolean m27103u1(TdApi.SecretChat secretChat) {
        if (!m27118p0() || C4779t2.m25549b2(this.f15128N) != secretChat.f25419id || this.f15128N.lastMessage != null || m27162X0()) {
            return false;
        }
        m27182N0();
        return true;
    }

    public C4587b m27102v() {
        return this.f15136V;
    }

    public boolean m27100v1(long j, TdApi.Message message) {
        if (m27096x() != j) {
            return false;
        }
        TdApi.Chat chat = this.f15128N;
        TdApi.Message message2 = chat.lastMessage;
        chat.lastMessage = message;
        if ((message2 == null && message == null) || (message2 != null && message != null && message2.f25406id == message.f25406id)) {
            return false;
        }
        m27186L0(true);
        m27172S0();
        m27182N0();
        m27204C0(false);
        return true;
    }

    public TdApi.Chat m27099w() {
        return this.f15127M.m2632U2(m27096x());
    }

    public boolean m27097w1(TdApi.User user) {
        TdApi.Chat chat = this.f15128N;
        if (chat == null) {
            return false;
        }
        int constructor = chat.type.getConstructor();
        if (constructor != -1472570774) {
            if (constructor != 973884508) {
                if (constructor == 1579049844 && m27189K() == user.f25439id) {
                    m27170T0();
                    m27190J0();
                    return true;
                }
            } else if (C7321e.m16984R0(this.f15128N.lastMessage) == user.f25439id) {
                m27182N0();
                return true;
            }
        } else if (this.f15127M.m2283q7(this.f15128N) && C7321e.m16988P0(this.f15128N.lastMessage) == user.f25439id) {
            m27182N0();
            return true;
        }
        return false;
    }

    public long m27096x() {
        TdApi.Chat chat = this.f15128N;
        if (chat != null) {
            return chat.f25367id;
        }
        return 0L;
    }

    public TdApi.ChatList m27094y() {
        return this.f15129O;
    }

    public long m27092z() {
        if (m27138h0()) {
            return Long.MAX_VALUE;
        }
        return C7317b.m17042b(this.f15128N, this.f15129O);
    }

    public final void m27091z0() {
        if (this.f15143b == 1) {
            m27208A0();
        } else {
            m27184M0();
        }
    }

    public C4592b3(AbstractC9323v4<?> v4Var, C10684g8 g8Var, boolean z) {
        C4341g gVar = new C4341g();
        this.f15156m0 = gVar;
        this.f15163t0 = -1;
        this.f15145c = v4Var;
        this.f15165v0 = null;
        this.f15127M = v4Var.mo4348c();
        this.f15128N = null;
        this.f15129O = null;
        this.f15130P = g8Var;
        this.f15143b = C4868i.m24726c2().m24584u0();
        C3941g gVar2 = new C3941g(gVar);
        this.f15157n0 = gVar2;
        this.f15158o0 = new C5375a.C5377b().m23019d(this).m23021b();
        this.f15159p0 = new C5375a.C5377b().m23017f(R.drawable.baseline_at_16, 16.0f, 0.0f, 17).m23019d(this).m23021b();
        this.f15160q0 = null;
        this.f15141a |= Log.TAG_VIDEO;
        m27186L0(false);
        gVar2.m29571b(m27144f0(), false);
        if (z) {
            m27131k(C1357a0.m37543g());
        }
    }
}
