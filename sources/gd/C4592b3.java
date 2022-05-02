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
        this.f15143b = C4868i.m24727c2().m24585u0();
        int constructor = chat.type.getConstructor();
        this.f15132R = constructor;
        switch (constructor) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                this.f15131Q = ((TdApi.ChatTypeSupergroup) chat.type).supergroupId;
                break;
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
                this.f15131Q = C4779t2.m25459o2(chat.type);
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
        this.f15158o0 = new C5375a.C5377b().m23020d(this).m23022b();
        this.f15159p0 = new C5375a.C5377b().m23018f(R.drawable.baseline_at_16, 16.0f, 0.0f, 17).m23020d(this).m23022b();
        this.f15160q0 = new C5375a.C5377b().m23014j(11.0f).m23020d(this).m23017g().m23023a(false).m23015i(R.id.theme_color_ticksRead).m23018f(R.drawable.baseline_visibility_14, 14.0f, 3.0f, 5).m23022b();
        m27188L0(false);
        m27166W0();
        gVar2.m29573b(m27146f0(), false);
        m27113s();
        if (z) {
            m27133k(C1357a0.m37546g());
        }
    }

    public static C5457w0 m27175S(int i) {
        return C1410y.m37086A0(i == 2 ? 15.0f : 16.0f);
    }

    public static C5457w0 m27165X(int i) {
        return C1410y.m37086A0(i == 2 ? 16.0f : 17.0f);
    }

    public static int m27103v0(int i, int i2, int i3, int i4, int i5) {
        if (i2 == 0) {
            return i;
        }
        return 0;
    }

    public int m27100w0(int i, int i2, int i3, int i4) {
        if (i == 0) {
            return this.f15164u0;
        }
        return 0;
    }

    public void m27097x0(C4779t2.C4783d dVar, C4779t2.C4783d dVar2) {
        if (this.f15148e0 == dVar) {
            m27190K0(dVar2);
            this.f15156m0.invalidate();
        }
    }

    public void m27095y0(StringBuilder sb2, List list, TdApi.Chat chat) {
        if (sb2.length() > 0) {
            sb2.append(C4403w.m27856m0());
        }
        int length = sb2.length();
        sb2.append(this.f15127M.m2661S3(chat));
        if (chat.unreadCount > 0) {
            list.add(new C5417o0(this.f15145c, this.f15127M, null, length, sb2.length(), 0, null).m22762M(C5428t.AbstractC5441d.f17872C));
        }
    }

    public long m27211A() {
        return C4779t2.m25466n2(this.f15128N);
    }

    public final void m27210A0() {
        RunnableC5390g gVar;
        int d1 = (this.f15133S - C9903a.m6651d1(this.f15143b)) - C9903a.getRightPadding();
        int D = m27205D();
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
        this.f15164u0 = (cVar == null || cVar.m23279g() <= 0) ? 0 : C1357a0.m37544i(2.0f) + (C1357a0.m37544i(18.0f) * this.f15149f0.m23279g());
        if (i <= 0 || C5070i.m24062i(this.f15144b0)) {
            this.f15147d0 = null;
        } else {
            RunnableC5390g.C5392b bVar = new RunnableC5390g.C5392b(this.f15144b0, i, m27175S(this.f15143b), C5428t.AbstractC5441d.f17873D);
            if (!m27112s0()) {
                i2 = 2;
            }
            this.f15147d0 = bVar.m22875p(i2).m22866y(Log.TAG_LUX).m22881j().m22878m(m27112s0()).m22877n(new RunnableC5390g.AbstractC5396f() {
                @Override
                public final int mo7827a(int i3, int i4, int i5, int i6) {
                    int w0;
                    w0 = C4592b3.this.m27100w0(i3, i4, i5, i6);
                    return w0;
                }
            }).m22882i(this.f15146c0).m22874q().m22885f();
        }
        mo3252o();
    }

    public int m27209B() {
        return this.f15155l0;
    }

    public final void m27208B0() {
        int timePaddingRight = (this.f15133S - C9903a.getTimePaddingRight()) - this.f15140Z;
        this.f15152i0 = timePaddingRight;
        this.f15155l0 = timePaddingRight - C9903a.getTimePaddingLeft();
    }

    public C5375a m27207C() {
        return this.f15158o0;
    }

    public void m27206C0(boolean z) {
        int d1 = (((this.f15133S - C9903a.m6651d1(this.f15143b)) - this.f15140Z) - C9903a.getTimePaddingRight()) - C9903a.getTimePaddingLeft();
        boolean p0 = m27120p0();
        if (m27162Y0()) {
            d1 = (d1 - C9903a.getMuteOffset()) - C1392p.m37237b();
        }
        boolean h4 = this.f15127M.m2430h4(this.f15128N);
        this.f15141a = C5063c.m24139h(this.f15141a, 32, h4);
        if (h4) {
            d1 -= C1357a0.m37544i(20.0f);
        }
        if (m27158a1()) {
            d1 = (int) (d1 - this.f15160q0.m23036j(C1357a0.m37544i(3.0f)));
        } else if (m27115r0() || m27127m0()) {
            d1 = (d1 - C9903a.getTimePaddingLeft()) - C1357a0.m37544i(20.0f);
        }
        if (p0) {
            d1 -= C1357a0.m37544i(14.0f);
        }
        if (z || this.f15163t0 != d1) {
            this.f15163t0 = d1;
            if (C5070i.m24062i(this.f15137W)) {
                this.f15138X = null;
            } else {
                this.f15138X = new RunnableC5390g.C5392b(this.f15137W, d1, m27165X(this.f15143b), m27120p0() ? C5428t.AbstractC5441d.f17875F : C5428t.AbstractC5441d.f17872C).m22869v().m22889b().m22884g().m22885f();
            }
        }
        int Y = m27163Y();
        this.f15154k0 = C9903a.m6651d1(this.f15143b) + Y;
        int d12 = C9903a.m6651d1(this.f15143b) + Y + C9903a.getMutePadding();
        this.f15153j0 = d12;
        if (h4) {
            this.f15153j0 = d12 + C1357a0.m37544i(20.0f);
        }
        if (p0) {
            this.f15154k0 += C1357a0.m37544i(14.0f);
            this.f15153j0 += C1357a0.m37544i(14.0f);
        }
        if (z && this.f15136V != null) {
            m27192J0();
        }
    }

    public final int m27205D() {
        return Math.round(this.f15158o0.m23036j(C9903a.getTimePaddingLeft()) + this.f15159p0.m23036j(C9903a.getTimePaddingLeft()));
    }

    public void m27204D0() {
        m27133k(C1357a0.m37546g());
    }

    public int m27203E() {
        return this.f15143b;
    }

    public boolean m27202E0() {
        View f = this.f15156m0.mo28228f();
        AbstractC9323v4<?> q9 = AbstractC9323v4.m9183q9(f);
        return f != null && (q9 == null || q9.m9353Ra());
    }

    public C5375a m27201F() {
        return this.f15159p0;
    }

    public boolean m27200F0() {
        if (m27140h0()) {
            return this.f15127M.m2189w5(C7317b.f23228b).f33878c > 0;
        }
        return this.f15127M.m2207v3(this.f15128N);
    }

    public int m27199G() {
        return this.f15153j0;
    }

    public void m27198G0() {
        m27188L0(true);
        m27174S0();
        m27184N0();
    }

    public TdApi.ChatPosition m27197H() {
        return C7317b.m17043a(this.f15128N, this.f15129O);
    }

    public void m27196H0() {
        m27188L0(true);
        this.f15157n0.m29573b(m27146f0(), true);
    }

    public RunnableC5390g m27195I() {
        if ((this.f15141a & 1) != 0) {
            return this.f15142a0;
        }
        return null;
    }

    public void m27194I0() {
        m27174S0();
    }

    public int m27193J() {
        C5320c cVar = this.f15149f0;
        if (cVar != null) {
            return cVar.m23279g();
        }
        return 0;
    }

    public final void m27192J0() {
        if (m27140h0()) {
            this.f15135U = null;
            this.f15136V = new C4587b(C9903a.m6657O0(this.f15143b) / 2.0f, new C4587b.C4588a((int) R.id.theme_color_avatarArchive, (int) R.drawable.baseline_archive_24), null);
            return;
        }
        TdApi.File X1 = (this.f15141a & Log.TAG_YOUTUBE) != 0 ? null : C4779t2.m25576X1(this.f15128N);
        if (X1 == null) {
            this.f15135U = null;
            this.f15136V = this.f15127M.m2947A3(this.f15128N, true, C9903a.m6657O0(this.f15143b) / 2.0f, null);
            return;
        }
        C6246h hVar = new C6246h(this.f15127M, X1);
        this.f15135U = hVar;
        hVar.mo20768t0(C9903a.getDefaultAvatarCacheSize());
        this.f15136V = null;
    }

    public long m27191K() {
        if (this.f15132R == 1579049844) {
            return this.f15131Q;
        }
        return 0L;
    }

    public final void m27190K0(C4779t2.C4783d dVar) {
        C5320c cVar = this.f15149f0;
        if (cVar != null) {
            cVar.m23284b();
        }
        String c = dVar.m25376c(true);
        TdApi.FormattedText formattedText = dVar.f16272d;
        m27176R0(c, formattedText != null ? formattedText.entities : null, dVar.f16273e);
        this.f15148e0 = dVar;
        C4779t2.C4787f fVar = dVar.f16270b;
        if (fVar == null) {
            TdApi.Message message = this.f15128N.lastMessage;
            if (!(message == null || message.forwardInfo == null || (!message.isChannelPost && m27193J() != 0))) {
                TdApi.MessageForwardInfo messageForwardInfo = this.f15128N.lastMessage.forwardInfo;
                switch (messageForwardInfo.origin.getConstructor()) {
                    case TdApi.MessageForwardOriginMessageImport.CONSTRUCTOR:
                        m27141h(R.drawable.templarian_baseline_import_16);
                        break;
                    case TdApi.MessageForwardOriginUser.CONSTRUCTOR:
                        if (C7321e.m16984R0(this.f15128N.lastMessage) != ((TdApi.MessageForwardOriginUser) messageForwardInfo.origin).senderUserId) {
                            m27141h(R.drawable.baseline_share_arrow_16);
                            break;
                        }
                        break;
                    case TdApi.MessageForwardOriginHiddenUser.CONSTRUCTOR:
                        m27141h(R.drawable.baseline_share_arrow_16);
                        break;
                    case TdApi.MessageForwardOriginChannel.CONSTRUCTOR:
                        if (this.f15128N.f25370id != ((TdApi.MessageForwardOriginChannel) messageForwardInfo.origin).chatId) {
                            m27141h(R.drawable.baseline_share_arrow_16);
                            break;
                        }
                        break;
                    case TdApi.MessageForwardOriginChat.CONSTRUCTOR:
                        if (C7321e.m16988P0(this.f15128N.lastMessage) != ((TdApi.MessageForwardOriginChat) messageForwardInfo.origin).senderChatId) {
                            m27141h(R.drawable.baseline_share_arrow_16);
                            break;
                        }
                        break;
                }
            }
        } else {
            m27141h(fVar.f16284b);
        }
        C4779t2.C4787f fVar2 = dVar.f16269a;
        if (fVar2 != null) {
            m27141h(fVar2.f16284b);
        }
        this.f15150g0 = R.id.theme_color_chatListIcon;
        if ((m27132k0() || m27109t0()) && !dVar.f16274f) {
            this.f15141a = 1 | this.f15141a;
        } else {
            TdApi.Message message2 = this.f15128N.lastMessage;
            if (message2 != null && message2.content.getConstructor() == 538893824) {
                C5320c cVar2 = this.f15149f0;
                if (cVar2 != null) {
                    cVar2.m23284b();
                }
                TdApi.Message message3 = this.f15128N.lastMessage;
                m27141h(C4619e.m26854j((TdApi.MessageCall) message3.content, C4779t2.m25430s3(message3)));
                this.f15150g0 = C4619e.m26852l((TdApi.MessageCall) this.f15128N.lastMessage.content);
            }
        }
        m27186M0();
        if (dVar.m25374e()) {
            dVar.m25372g(this);
        }
    }

    public C3941g m27189L() {
        return this.f15157n0;
    }

    public final void m27188L0(boolean z) {
        boolean g0 = m27143g0();
        int a0 = m27159a0();
        boolean z2 = false;
        this.f15159p0.m23027u(g0 ? C10930q6.f34959A2 : 0, false, z && m27202E0());
        C5375a aVar = this.f15158o0;
        if (g0 && a0 == 1) {
            a0 = 0;
        }
        boolean z3 = !m27200F0();
        if (z && m27202E0()) {
            z2 = true;
        }
        aVar.m23027u(a0, z3, z2);
    }

    public int m27187M() {
        return C4779t2.m25550b2(this.f15128N);
    }

    public final void m27186M0() {
        String str;
        int i;
        if ((this.f15141a & 1) != 0) {
            boolean z = false;
            if (m27164X0()) {
                TdApi.DraftMessage draftMessage = this.f15128N.draftMessage;
                if (draftMessage != null && draftMessage.inputMessageText.getConstructor() == 247050392 && !C7321e.m16965a1(((TdApi.InputMessageText) this.f15128N.draftMessage.inputMessageText).text)) {
                    z = true;
                }
                str = C4403w.m27871i1(R.string.Draft);
                this.f15141a |= Log.TAG_CAMERA;
            } else {
                if (m27127m0()) {
                    str = C4403w.m27871i1((this.f15143b == 1 || !this.f15127M.m2568Y6(this.f15128N) || C7321e.m16988P0(this.f15128N.lastMessage) != this.f15128N.f25370id) ? R.string.FromYou : R.string.FromYouAnonymous);
                    this.f15141a |= Log.TAG_CAMERA;
                } else {
                    TdApi.Message message = this.f15128N.lastMessage;
                    if (message == null || message.content.getConstructor() == 67761875) {
                        str = null;
                    } else {
                        if (this.f15143b == 1) {
                            long M0 = C7321e.m16994M0(this.f15128N.lastMessage);
                            TdApi.Message message2 = this.f15128N.lastMessage;
                            if (M0 == message2.chatId && C5070i.m24062i(message2.authorSignature)) {
                                str = C4403w.m27871i1(R.string.FromAnonymous);
                            }
                        }
                        str = this.f15127M.m2167xb(this.f15128N.lastMessage, false, this.f15143b == 1);
                    }
                }
                z = true;
            }
            if (!C5070i.m24062i(str)) {
                int i2 = this.f15143b;
                if (i2 != 1) {
                    i = ((this.f15133S - C9903a.m6651d1(i2)) - C9903a.getRightPadding()) - m27205D();
                } else {
                    i = C1357a0.m37544i(120.0f);
                }
                if (i > 0) {
                    RunnableC5390g.C5392b y = new RunnableC5390g.C5392b(str, i, m27175S(this.f15143b), C5063c.m24145b(this.f15141a, 16) ? C5428t.AbstractC5441d.f17876G : C5428t.AbstractC5441d.f17872C).m22869v().m22866y(Log.TAG_CAMERA);
                    if (z && this.f15143b == 1) {
                        y.m22867x(": ");
                    }
                    this.f15142a0 = y.m22885f();
                } else {
                    this.f15142a0 = null;
                }
            } else {
                this.f15142a0 = null;
            }
        } else {
            this.f15142a0 = null;
        }
        m27210A0();
    }

    public TdApi.ChatSource m27185N() {
        TdApi.ChatPosition H = m27197H();
        if (H != null) {
            return H.source;
        }
        return null;
    }

    public void m27184N0() {
        int i = this.f15141a & (-2);
        this.f15141a = i;
        int i2 = i & (-17);
        this.f15141a = i2;
        int i3 = i2 & (-513);
        this.f15141a = i3;
        this.f15141a = i3 & (-1025);
        C5320c cVar = this.f15149f0;
        if (cVar != null) {
            cVar.m23284b();
        }
        String str = null;
        AbstractC5411l0[] l0VarArr = null;
        this.f15148e0 = null;
        if (this.f15127M.m2284q6(this.f15128N)) {
            this.f15141a |= Log.TAG_GIF_LOADER;
            m27190K0(new C4779t2.C4783d(C4779t2.f16238W, (int) R.string.ChatContentProtected));
            return;
        }
        String H3 = this.f15127M.m2835H3(this.f15128N);
        boolean z = false;
        if (H3 != null) {
            m27190K0(new C4779t2.C4783d(C4779t2.f16237V, 0, H3, false));
        } else if (m27140h0()) {
            final ArrayList arrayList = new ArrayList();
            final StringBuilder sb2 = new StringBuilder();
            this.f15130P.m4280t(new AbstractC5918j() {
                @Override
                public final void mo1330a(Object obj) {
                    C4592b3.this.m27095y0(sb2, arrayList, (TdApi.Chat) obj);
                }
            });
            if (sb2.length() == 0) {
                sb2.append(C4403w.m27838q2(R.string.xChats, this.f15130P.m4301L()));
            }
            String sb3 = sb2.toString();
            if (!arrayList.isEmpty()) {
                l0VarArr = (AbstractC5411l0[]) arrayList.toArray(new AbstractC5411l0[0]);
            }
            m27178Q0(sb3, l0VarArr, false);
            m27186M0();
        } else if (this.f15128N.draftMessage == null || !m27164X0()) {
            TdApi.ChatSource N = m27185N();
            if (N instanceof TdApi.ChatSourcePublicServiceAnnouncement) {
                str = ((TdApi.ChatSourcePublicServiceAnnouncement) N).text;
            }
            if (!C5070i.m24062i(str)) {
                m27190K0(new C4779t2.C4783d(C4779t2.f16236U, 0, str, false));
                return;
            }
            TdApi.Chat chat = this.f15128N;
            if (chat.lastMessage == null && C7316a.m17051j(chat.f25370id)) {
                TdApi.SecretChat X3 = this.f15127M.m2586X3(this.f15128N.f25370id);
                if (X3 != null) {
                    int constructor = X3.state.getConstructor();
                    if (constructor == -1945106707) {
                        m27182O0(R.string.SecretChatCancelled);
                    } else if (constructor == -1637050756) {
                        m27180P0(X3.isOutbound ? C4403w.m27867j1(R.string.AwaitingEncryption, this.f15127M.m2480e2().m1749D2(X3.userId)) : C4403w.m27871i1(R.string.VoipExchangingKeys), true);
                    } else if (constructor != -1611352087) {
                        throw new RuntimeException();
                    } else if (X3.isOutbound) {
                        m27180P0(C4403w.m27867j1(R.string.XJoinedSecretChat, this.f15127M.m2480e2().m1749D2(X3.userId)), true);
                    } else {
                        m27180P0(C4403w.m27871i1(R.string.YouJoinedSecretChat), true);
                    }
                    z = true;
                }
                if (z) {
                    m27186M0();
                    return;
                }
            }
            TdApi.Message message = this.f15128N.lastMessage;
            if (message != null) {
                m27190K0(C4779t2.m25613R0(this.f15127M, message.chatId, message));
                return;
            }
            m27182O0(R.string.DeletedMessage);
            m27186M0();
        } else {
            this.f15141a |= 17;
            TdApi.FormattedText formattedText = ((TdApi.InputMessageText) this.f15128N.draftMessage.inputMessageText).text;
            m27176R0(formattedText.text, formattedText.entities, false);
            m27186M0();
        }
    }

    public RunnableC5390g m27183O() {
        return this.f15147d0;
    }

    public final void m27182O0(int i) {
        m27180P0(C4403w.m27871i1(i), true);
    }

    public int m27181P() {
        return this.f15150g0;
    }

    public final void m27180P0(String str, boolean z) {
        m27178Q0(str, null, z);
    }

    public C5320c m27179Q() {
        return this.f15149f0;
    }

    public final void m27178Q0(String str, AbstractC5411l0[] l0VarArr, boolean z) {
        this.f15144b0 = str;
        if (l0VarArr == null || l0VarArr.length <= 0) {
            l0VarArr = null;
        }
        this.f15146c0 = l0VarArr;
        this.f15141a = C5063c.m24139h(this.f15141a, Log.TAG_CAMERA, z);
    }

    public int m27177R() {
        return this.f15151h0;
    }

    public final void m27176R0(String str, TdApi.TextEntity[] textEntityArr, boolean z) {
        m27178Q0(str, AbstractC5411l0.m22791E(this.f15127M, str, textEntityArr, null), z);
    }

    public void m27174S0() {
        int i;
        String str = "";
        if (m27140h0()) {
            int F = this.f15130P.m4307F();
            if (F != 0) {
                str = C4403w.m27926V2(F, TimeUnit.SECONDS);
            }
            this.f15139Y = str;
        } else {
            TdApi.ChatSource N = m27185N();
            if (N != null) {
                int constructor = N.getConstructor();
                if (constructor == -328571244) {
                    this.f15139Y = C4403w.m27924W0((TdApi.ChatSourcePublicServiceAnnouncement) N);
                } else if (constructor == 394074115) {
                    this.f15139Y = C4403w.m27871i1(R.string.ProxySponsor);
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
                    str = C4403w.m27926V2(i, TimeUnit.SECONDS);
                }
                this.f15139Y = str;
            }
        }
        this.f15140Z = (int) C7389v0.m16680T1(this.f15139Y, C9903a.getTimePaint());
        m27208B0();
        m27166W0();
    }

    public String m27173T() {
        return this.f15139Y;
    }

    public void m27172T0() {
        m27170U0(m27140h0() ? C4403w.m27871i1(R.string.ArchiveTitleList) : this.f15127M.m2661S3(this.f15128N));
        m27206C0(true);
    }

    public int m27171U() {
        return this.f15152i0;
    }

    public final void m27170U0(String str) {
        this.f15137W = str;
    }

    public int m27169V() {
        return this.f15140Z;
    }

    public final void m27168V0(boolean z) {
        int i = this.f15141a;
        if (z != ((i & Log.TAG_CRASH) != 0)) {
            this.f15141a = C5063c.m24139h(i, Log.TAG_CRASH, z);
            C10802kc.C10806d dVar = this.f15165v0;
            if (dVar == null) {
                return;
            }
            if (z) {
                dVar.m3263f(this.f15128N.f25370id, 0L);
            } else {
                dVar.m3262g();
            }
        }
    }

    public RunnableC5390g m27167W() {
        return this.f15138X;
    }

    public final void m27166W0() {
        if (this.f15160q0 != null) {
            this.f15160q0.m23028t(m27154c0(), m27202E0());
        }
    }

    public boolean m27164X0() {
        TdApi.DraftMessage draftMessage;
        if (!m27140h0()) {
            TdApi.Chat chat = this.f15128N;
            if (chat.unreadCount == 0 && (draftMessage = chat.draftMessage) != null && draftMessage.inputMessageText.getConstructor() == 247050392) {
                return true;
            }
        }
        return false;
    }

    public int m27163Y() {
        RunnableC5390g gVar = this.f15138X;
        if (gVar != null) {
            return gVar.getWidth();
        }
        return 0;
    }

    public boolean m27162Y0() {
        return this.f15127M.m2239t3(this.f15128N);
    }

    public final int m27161Z() {
        if (m27140h0()) {
            C10562b9 w5 = this.f15127M.m2189w5(C7317b.f23228b);
            int i = w5.f33877b;
            int i2 = w5.f33879d;
            int i3 = i - i2;
            if (i3 > 0) {
                return i3;
            }
            if (i2 > 0) {
                return C10930q6.f34959A2;
            }
            return 0;
        }
        TdApi.Chat chat = this.f15128N;
        int i4 = chat.unreadCount;
        if (i4 > 0) {
            return i4;
        }
        if (chat.isMarkedAsUnread) {
            return C10930q6.f34959A2;
        }
        return 0;
    }

    public boolean m27160Z0() {
        return (this.f15141a & 32) != 0;
    }

    @Override
    public void mo7829a(long j, long j2, C4779t2.C4783d dVar) {
        C4804u2.m25224a(this, j, j2, dVar);
    }

    public int m27159a0() {
        if (m27135j0()) {
            return C10930q6.f34960B2;
        }
        if (m27140h0()) {
            return m27161Z();
        }
        if (m27185N() != null) {
            return 0;
        }
        TdApi.Chat chat = this.f15128N;
        int i = chat.unreadCount;
        if (i > 0) {
            return i;
        }
        if (chat.isMarkedAsUnread) {
            return C10930q6.f34959A2;
        }
        return 0;
    }

    public boolean m27158a1() {
        TdApi.Message message;
        return !m27115r0() && m27127m0() && m27137i0() && (message = this.f15128N.lastMessage) != null && C4779t2.m25424t2(message.interactionInfo) > 0;
    }

    @Override
    public void mo4501a3() {
        this.f15156m0.m28242k();
        m27168V0(false);
    }

    @Override
    public void mo7828b(long j, long j2, final C4779t2.C4783d dVar, final C4779t2.C4783d dVar2) {
        this.f15127M.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                C4592b3.this.m27097x0(dVar2, dVar);
            }
        });
    }

    public int m27157b0() {
        return this.f15154k0;
    }

    public final C10802kc.C10806d m27156b1() {
        return this.f15165v0;
    }

    public final int m27154c0() {
        TdApi.Chat chat = this.f15128N;
        if (chat == null || !C4779t2.m25430s3(chat.lastMessage)) {
            return 0;
        }
        return C4779t2.m25424t2(this.f15128N.lastMessage.interactionInfo);
    }

    public void m27153c1() {
        TdApi.Chat chat = this.f15128N;
        if (chat != null && chat.lastMessage != null && m27137i0() && m27158a1()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = this.f15134T;
            TdApi.Message message = this.f15128N.lastMessage;
            if (j != message.f25409id || ((float) (uptimeMillis - this.f15162s0)) > ((1.0f - C5069h.m24090d(C4779t2.m25424t2(message.interactionInfo) / 1000.0f)) * 1800000.0f) + 300000.0f) {
                this.f15162s0 = uptimeMillis;
                this.f15134T = this.f15128N.lastMessage.f25409id;
                this.f15127M.m2270r4().m14783o(new TdApi.ViewMessages(this.f15128N.f25370id, 0L, new long[]{this.f15134T}, false), this.f15127M.m2392ja());
            }
        }
    }

    @Override
    public boolean mo8363d(C5375a aVar) {
        return m27202E0();
    }

    public C5375a m27152d0() {
        return this.f15160q0;
    }

    public boolean m27151d1(long j, String str) {
        if (m27098x() != j) {
            return false;
        }
        boolean q6 = this.f15127M.m2284q6(this.f15128N);
        TdApi.Chat chat = this.f15128N;
        chat.clientData = str;
        if (q6 == this.f15127M.m2284q6(chat)) {
            return false;
        }
        m27184N0();
        return true;
    }

    public boolean m27149e0() {
        return this.f15135U != null;
    }

    public boolean m27148e1(long j, boolean z) {
        TdApi.Chat chat = this.f15128N;
        if (chat.f25370id != j || chat.hasScheduledMessages == z) {
            return false;
        }
        chat.hasScheduledMessages = z;
        this.f15157n0.m29573b(z, m27202E0());
        return true;
    }

    public boolean m27146f0() {
        if (m27140h0()) {
            return this.f15130P.m4285o();
        }
        return this.f15128N.hasScheduledMessages;
    }

    public boolean m27145f1(long j, TdApi.ChatPermissions chatPermissions) {
        if (m27098x() != j) {
            return false;
        }
        this.f15128N.permissions = chatPermissions;
        return false;
    }

    public boolean m27143g0() {
        if (m27140h0()) {
            return this.f15130P.m4284p();
        }
        return this.f15128N.unreadMentionCount > 0;
    }

    public boolean m27142g1(long j, TdApi.ChatPhotoInfo chatPhotoInfo) {
        if (m27098x() != j) {
            return false;
        }
        this.f15128N.photo = chatPhotoInfo;
        m27192J0();
        return true;
    }

    public final void m27141h(int i) {
        if (i != 0) {
            if (this.f15149f0 == null) {
                this.f15149f0 = new C5320c(2);
            }
            this.f15149f0.m23285a(i);
        }
    }

    public boolean m27140h0() {
        return (this.f15141a & Log.TAG_VIDEO) != 0;
    }

    public boolean m27139h1(long j, TdApi.ChatPosition chatPosition, boolean z, boolean z2) {
        if (m27098x() == j) {
            TdApi.ChatPosition a = C7317b.m17043a(this.f15128N, this.f15129O);
            if (C10930q6.m2889Dd(this.f15128N, chatPosition) && C7321e.m17015C(this.f15129O, chatPosition.list)) {
                if (z) {
                    m27174S0();
                    m27188L0(true);
                    if ((chatPosition.source instanceof TdApi.ChatSourcePublicServiceAnnouncement) || (a != null && (a.source instanceof TdApi.ChatSourcePublicServiceAnnouncement))) {
                        m27184N0();
                    }
                    m27206C0(false);
                }
                return true;
            }
        }
        return false;
    }

    public void m27138i(View view) {
        if (this.f15156m0.m28243j(view)) {
            m27168V0(true);
        }
    }

    public boolean m27137i0() {
        return C7316a.m17050k(m27098x()) && !this.f15127M.m2283q7(this.f15128N);
    }

    public boolean m27136i1(long j, long j2, int i) {
        if (this.f15128N.f25370id != j) {
            return false;
        }
        boolean X0 = m27164X0();
        TdApi.Chat chat = this.f15128N;
        chat.lastReadInboxMessageId = j2;
        chat.unreadCount = i;
        boolean X02 = m27164X0();
        m27188L0(true);
        if (X0 != X02) {
            m27184N0();
        }
        return true;
    }

    @Override
    public void mo8362j(C5375a aVar, boolean z) {
        if (z) {
            if (aVar == this.f15160q0) {
                m27206C0(false);
            } else {
                if (this.f15161r0 != m27205D()) {
                    m27093z0();
                }
            }
        }
        this.f15156m0.invalidate();
    }

    public boolean m27135j0() {
        if (m27140h0()) {
            return this.f15130P.m4286n();
        }
        return C4779t2.m25611R2(this.f15128N.lastMessage);
    }

    public boolean m27134j1(long j, long j2) {
        TdApi.Chat chat = this.f15128N;
        if (chat.f25370id != j) {
            return false;
        }
        chat.lastReadOutboxMessageId = j2;
        TdApi.Message message = chat.lastMessage;
        return message != null && C4779t2.m25430s3(message);
    }

    public final void m27133k(int i) {
        if (i > 0) {
            this.f15133S = i;
            m27188L0(true);
            m27174S0();
            m27172T0();
            m27184N0();
            m27192J0();
        }
    }

    public boolean m27132k0() {
        return C7316a.m17054g(m27098x());
    }

    public boolean m27131k1(long j, TdApi.ChatNotificationSettings chatNotificationSettings) {
        if (m27098x() != j) {
            return false;
        }
        this.f15128N.notificationSettings = chatNotificationSettings;
        m27206C0(false);
        m27188L0(true);
        return true;
    }

    public void m27130l() {
        int u0 = C4868i.m24727c2().m24585u0();
        if (this.f15143b != u0) {
            this.f15143b = u0;
            this.f15133S = 0;
            if (this.f15136V != null) {
                m27192J0();
            }
            this.f15156m0.requestLayout();
            this.f15156m0.invalidate();
        }
    }

    public boolean m27129l0() {
        return (this.f15141a & Log.TAG_EMOJI) != 0;
    }

    public boolean m27128l1(long j, String str) {
        if (m27098x() != j) {
            return false;
        }
        TdApi.Chat chat = this.f15128N;
        chat.title = str;
        m27170U0(this.f15127M.m2661S3(chat));
        m27206C0(true);
        if (this.f15127M.m2568Y6(this.f15128N) && !C7316a.m17049l(j) && C7321e.m16988P0(this.f15128N.lastMessage) == j) {
            m27184N0();
        }
        return true;
    }

    @Override
    public void mo3254m(boolean z) {
        List<Reference<View>> n = this.f15156m0.m28239n();
        if (n != null) {
            for (int size = n.size() - 1; size >= 0; size--) {
                View view = n.get(size).get();
                if (view != null) {
                    ((C9903a) view).m6646m(z);
                }
            }
        }
    }

    public boolean m27127m0() {
        TdApi.Message message;
        return !m27140h0() && !m27164X0() && (message = this.f15128N.lastMessage) != null && message.isOutgoing;
    }

    public boolean m27126m1(long j, int i) {
        TdApi.Chat chat = this.f15128N;
        if (chat.f25370id == j) {
            boolean z = chat.unreadMentionCount > 0;
            chat.unreadMentionCount = i;
            if ((i > 0) != z) {
                m27188L0(m27202E0());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean mo3253n() {
        return (this.f15141a & Log.TAG_CRASH) != 0 && this.f15156m0.mo28227g() && this.f15145c.m9300Z9().m9118z9();
    }

    public boolean m27125n0() {
        TdApi.ChatPosition H = m27197H();
        return H != null && H.isPinned;
    }

    public boolean m27124n1(long j, TdApi.DraftMessage draftMessage) {
        if (m27098x() != j) {
            return false;
        }
        this.f15128N.draftMessage = draftMessage;
        m27184N0();
        m27174S0();
        m27206C0(false);
        return true;
    }

    @Override
    public void mo3252o() {
        C10802kc.C10806d dVar = this.f15165v0;
        if (dVar != null) {
            String j = dVar.m3259j();
            RunnableC5390g gVar = null;
            if (!C5070i.m24062i(j)) {
                int d1 = ((this.f15133S - C9903a.m6651d1(this.f15143b)) - C9903a.getRightPadding()) - m27205D();
                final int e = this.f15165v0.m3264e();
                if (d1 > 0) {
                    RunnableC5390g.C5392b bVar = new RunnableC5390g.C5392b(j, d1, m27175S(this.f15143b), C5428t.AbstractC5441d.f17873D);
                    int i = 1;
                    if (this.f15143b != 1) {
                        i = 2;
                    }
                    RunnableC5390g.C5392b p = bVar.m22875p(i);
                    if (e > 0) {
                        p.m22877n(new RunnableC5390g.AbstractC5396f() {
                            @Override
                            public final int mo7827a(int i2, int i3, int i4, int i5) {
                                int v0;
                                v0 = C4592b3.m27103v0(e, i2, i3, i4, i5);
                                return v0;
                            }
                        });
                    }
                    gVar = p.m22885f();
                }
            }
            this.f15165v0.m3257l(gVar);
        }
    }

    public boolean m27123o0() {
        TdApi.ChatPosition H = m27197H();
        return H != null && (H.isPinned || H.source != null);
    }

    public void m27122o1(boolean r2) {
        throw new UnsupportedOperationException("Method not decompiled: gd.C4592b3.m27122o1(boolean):void");
    }

    public boolean m27121p(long j) {
        C10930q6.C10936f d;
        TdApi.Message message;
        TdApi.Chat chat = this.f15128N;
        if (!(chat == null || (message = chat.lastMessage) == null || message.f25409id != j)) {
            return true;
        }
        C4779t2.C4783d dVar = this.f15148e0;
        if (dVar == null || (d = dVar.m25375d()) == null) {
            return false;
        }
        for (TdApi.Message message2 : d.f35136a) {
            if (message2.f25409id == j) {
                return true;
            }
        }
        return false;
    }

    public boolean m27120p0() {
        return C7316a.m17051j(m27098x());
    }

    public boolean m27119p1(long j, boolean z) {
        if (m27098x() != j) {
            return false;
        }
        this.f15128N.isMarkedAsUnread = z;
        m27188L0(true);
        return true;
    }

    @Override
    public boolean mo3251q() {
        return C5063c.m24145b(this.f15141a, Log.TAG_CRASH);
    }

    public boolean m27118q0() {
        return (this.f15141a & Log.TAG_YOUTUBE) != 0;
    }

    public boolean m27117q1(long j, long j2, TdApi.MessageContent messageContent) {
        C10930q6.C10936f d;
        boolean z;
        if (m27098x() == j && this.f15128N.lastMessage != null) {
            C4779t2.C4783d dVar = this.f15148e0;
            if (!(dVar == null || (d = dVar.m25375d()) == null)) {
                Iterator<TdApi.Message> it = d.f35136a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    TdApi.Message next = it.next();
                    if (next.f25409id == j2) {
                        next.content = messageContent;
                        z = true;
                        break;
                    }
                }
                if (z) {
                    m27190K0(C4779t2.m25731A0(this.f15127M, this.f15128N.lastMessage, d, true));
                    return true;
                }
            }
            TdApi.Message message = this.f15128N.lastMessage;
            if (message.f25409id == j2) {
                message.content = messageContent;
                m27184N0();
                return true;
            }
        }
        return false;
    }

    public boolean m27116r(int i) {
        int i2 = this.f15133S;
        boolean z = true;
        if (i2 == 0) {
            if (i <= 0) {
                z = false;
            }
            m27133k(i);
            return z;
        } else if (i2 == i || i <= 0) {
            return false;
        } else {
            this.f15133S = i;
            m27208B0();
            m27206C0(false);
            m27093z0();
            return true;
        }
    }

    public boolean m27115r0() {
        TdApi.Chat chat = this.f15128N;
        if (chat != null) {
            if (!this.f15127M.m2595W9(chat.lastMessage) && !this.f15127M.m2625U9(this.f15128N.lastMessage)) {
                C10930q6 q6Var = this.f15127M;
                C4779t2.C4783d dVar = this.f15148e0;
                if (q6Var.m2789K1(dVar != null ? dVar.m25375d() : null)) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean m27114r1(long j, long j2, TdApi.MessageInteractionInfo messageInteractionInfo) {
        if (m27098x() != j || !m27121p(j2)) {
            return false;
        }
        this.f15128N.lastMessage.interactionInfo = messageInteractionInfo;
        m27166W0();
        return m27158a1();
    }

    public boolean m27113s() {
        int h = C5063c.m24139h(this.f15141a, Log.TAG_EMOJI, !m27140h0() && C7316a.m17049l(this.f15128N.f25370id) && this.f15127M.m2166xc().m3288u(C4779t2.m25466n2(this.f15128N)));
        if (this.f15141a == h) {
            return false;
        }
        this.f15141a = h;
        return true;
    }

    public final boolean m27112s0() {
        return this.f15143b == 1 || (this.f15141a & 1) != 0;
    }

    public boolean m27111s1(TdApi.Message message, long j) {
        if (m27121p(j)) {
            return m27102v1(message.chatId, message);
        }
        return false;
    }

    public void m27110t(View view) {
        if (this.f15156m0.m28241l(view)) {
            m27168V0(this.f15156m0.mo28227g());
        }
    }

    public boolean m27109t0() {
        return C7316a.m17050k(m27098x()) && this.f15127M.m2283q7(this.f15128N);
    }

    public boolean m27108t1(long j, long[] jArr) {
        TdApi.Message message;
        C10930q6.C10936f d;
        TdApi.Chat chat = this.f15128N;
        boolean z = false;
        if (chat.f25370id != j || (message = chat.lastMessage) == null) {
            return false;
        }
        if (C5062b.m24154s(jArr, message.f25409id) >= 0) {
            this.f15128N.lastMessage = null;
            m27184N0();
            return true;
        }
        C4779t2.C4783d dVar = this.f15148e0;
        if (!(dVar == null || (d = dVar.m25375d()) == null)) {
            for (int size = d.f35136a.size() - 1; size >= 0; size--) {
                if (C5062b.m24154s(jArr, d.f35136a.get(size).f25409id) >= 0) {
                    d.f35136a.remove(size);
                    z = true;
                }
            }
            if (d.f35136a.size() <= 1) {
                m27184N0();
                return true;
            } else if (z) {
                m27190K0(C4779t2.m25731A0(this.f15127M, this.f15128N.lastMessage, d, true));
            }
        }
        return true;
    }

    public C6246h m27107u() {
        return this.f15135U;
    }

    public boolean m27106u0() {
        if (m27140h0()) {
            return false;
        }
        TdApi.Chat chat = this.f15128N;
        if (chat.lastMessage == null || this.f15127M.m2752M6(chat)) {
            return false;
        }
        if (m27127m0()) {
            TdApi.Chat chat2 = this.f15128N;
            return chat2.lastMessage.f25409id > chat2.lastReadOutboxMessageId;
        }
        TdApi.Chat chat3 = this.f15128N;
        return chat3.lastMessage.f25409id > chat3.lastReadInboxMessageId;
    }

    public boolean m27105u1(TdApi.SecretChat secretChat) {
        if (!m27120p0() || C4779t2.m25550b2(this.f15128N) != secretChat.f25422id || this.f15128N.lastMessage != null || m27164X0()) {
            return false;
        }
        m27184N0();
        return true;
    }

    public C4587b m27104v() {
        return this.f15136V;
    }

    public boolean m27102v1(long j, TdApi.Message message) {
        if (m27098x() != j) {
            return false;
        }
        TdApi.Chat chat = this.f15128N;
        TdApi.Message message2 = chat.lastMessage;
        chat.lastMessage = message;
        if ((message2 == null && message == null) || (message2 != null && message != null && message2.f25409id == message.f25409id)) {
            return false;
        }
        m27188L0(true);
        m27174S0();
        m27184N0();
        m27206C0(false);
        return true;
    }

    public TdApi.Chat m27101w() {
        return this.f15127M.m2632U2(m27098x());
    }

    public boolean m27099w1(TdApi.User user) {
        TdApi.Chat chat = this.f15128N;
        if (chat == null) {
            return false;
        }
        int constructor = chat.type.getConstructor();
        if (constructor != -1472570774) {
            if (constructor != 973884508) {
                if (constructor == 1579049844 && m27191K() == user.f25442id) {
                    m27172T0();
                    m27192J0();
                    return true;
                }
            } else if (C7321e.m16984R0(this.f15128N.lastMessage) == user.f25442id) {
                m27184N0();
                return true;
            }
        } else if (this.f15127M.m2283q7(this.f15128N) && C7321e.m16988P0(this.f15128N.lastMessage) == user.f25442id) {
            m27184N0();
            return true;
        }
        return false;
    }

    public long m27098x() {
        TdApi.Chat chat = this.f15128N;
        if (chat != null) {
            return chat.f25370id;
        }
        return 0L;
    }

    public TdApi.ChatList m27096y() {
        return this.f15129O;
    }

    public long m27094z() {
        if (m27140h0()) {
            return Long.MAX_VALUE;
        }
        return C7317b.m17042b(this.f15128N, this.f15129O);
    }

    public final void m27093z0() {
        if (this.f15143b == 1) {
            m27210A0();
        } else {
            m27186M0();
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
        this.f15143b = C4868i.m24727c2().m24585u0();
        C3941g gVar2 = new C3941g(gVar);
        this.f15157n0 = gVar2;
        this.f15158o0 = new C5375a.C5377b().m23020d(this).m23022b();
        this.f15159p0 = new C5375a.C5377b().m23018f(R.drawable.baseline_at_16, 16.0f, 0.0f, 17).m23020d(this).m23022b();
        this.f15160q0 = null;
        this.f15141a |= Log.TAG_VIDEO;
        m27188L0(false);
        gVar2.m29573b(m27146f0(), false);
        if (z) {
            m27133k(C1357a0.m37546g());
        }
    }
}
