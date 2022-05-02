package p225pd;

import android.graphics.Canvas;
import android.view.View;
import bd.C1355a;
import be.C1357a0;
import gd.AbstractC4761s4;
import gd.C4630f0;
import gd.C4714n5;
import gd.C4728o7;
import gd.C4779t2;
import ge.C4868i;
import ie.AbstractC5411l0;
import java.io.File;
import java.lang.ref.Reference;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.C6883g1;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p080fb.C4341g;
import p108hb.C5070i;
import p111he.AbstractC5113f0;
import p111he.AbstractC5143t;
import p156kd.C6246h;
import p156kd.C6250i;
import p156kd.C6252k;
import p156kd.C6253l;
import p156kd.C6261s;
import p168ld.C6503j;
import p168ld.C6505k;
import p193nb.C7316a;
import p193nb.C7321e;
import p194nd.RunnableC7470o;
import p209od.C7856c;
import p254rd.C8431f;
import p350yd.C10930q6;
import vc.C9903a;

public class C8112b implements AbstractC5113f0, C4341g.AbstractC4342a {
    public C6883g1 f26359M;
    public long f26360N;
    public long f26361O;
    public TdApi.MessageSender f26362P;
    public int f26363Q;
    public TdApi.Photo f26364R;
    public TdApi.Video f26365S;
    public TdApi.VideoNote f26366T;
    public TdApi.Animation f26367U;
    public C6253l f26368V;
    public final AbstractView$OnTouchListenerC7889a f26369W;
    public final C10930q6 f26370X;
    public final int f26371Y;
    public int f26372Z;
    public C6246h f26373a;
    public int f26374a0;
    public C6246h f26375b;
    public TdApi.FormattedText f26376b0;
    public TdApi.File f26377c;
    public C6246h f26378c0;
    public C6503j f26379d0;
    public TdApi.ProfilePhoto f26380e0;
    public TdApi.ChatPhoto f26381f0;
    public AbstractC4761s4 f26382g0;
    public C6246h f26383h0;
    public C6246h f26384i0;
    public C6246h f26385j0;
    public C4341g f26386k0;
    public TdApi.Message f26387l0;
    public C6252k f26388m0;
    public C8431f f26389n0;
    public C4341g f26390o0;
    public AbstractC5411l0[] f26391p0;
    public C4714n5 f26392q0;

    public C8112b(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.Photo photo, TdApi.FormattedText formattedText) {
        this(aVar, q6Var, 0L, 0L, photo, false);
        this.f26376b0 = formattedText;
    }

    public static C8112b m13528U0(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.Animation animation, TdApi.FormattedText formattedText) {
        return new C8112b(aVar, q6Var, animation, formattedText);
    }

    public static C8112b m13526V0(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.Message message) {
        TdApi.ChatEventPhotoChanged chatEventPhotoChanged;
        TdApi.ChatPhoto chatPhoto;
        if (message == null) {
            return null;
        }
        int constructor = message.content.getConstructor();
        if (constructor == -1851395174) {
            return new C8112b(aVar, q6Var, message.chatId, message.f25409id, message.senderId, message.date, (TdApi.MessagePhoto) message.content).m13566B0(message);
        }
        if (constructor == -813415093) {
            return new C8112b(aVar, q6Var, message.chatId, message.f25409id, ((TdApi.MessageChatChangePhoto) message.content).photo).m13566B0(message);
        }
        if (constructor == 0) {
            C4728o7 o7Var = (C4728o7) message.content;
            if (o7Var.f15919b && o7Var.f15918a.action.getConstructor() == -811572541 && !((chatPhoto = (chatEventPhotoChanged = (TdApi.ChatEventPhotoChanged) o7Var.f15918a.action).oldPhoto) == null && chatEventPhotoChanged.newPhoto == null)) {
                long j = message.chatId;
                TdApi.ChatPhoto chatPhoto2 = chatEventPhotoChanged.newPhoto;
                return new C8112b(aVar, q6Var, j, 0L, chatPhoto2 != null ? chatPhoto2 : chatPhoto).m13536Q0(new TdApi.MessageSenderUser(C7321e.m16982S0(o7Var.f15918a.memberId))).m13544M0(o7Var.f15918a.date);
            }
        } else if (constructor == 963323014) {
            return new C8112b(aVar, q6Var, message.chatId, message.f25409id, message.senderId, message.date, (TdApi.MessageVideoNote) message.content).m13566B0(message);
        } else {
            if (constructor == 1306939396) {
                return new C8112b(aVar, q6Var, message.chatId, message.f25409id, message.senderId, message.date, (TdApi.MessageAnimation) message.content).m13566B0(message);
            }
            if (constructor == 2021281344) {
                return new C8112b(aVar, q6Var, message.chatId, message.f25409id, message.senderId, message.date, (TdApi.MessageVideo) message.content, true).m13566B0(message);
            }
        }
        return null;
    }

    public static C8112b m13524W0(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.Photo photo, TdApi.FormattedText formattedText) {
        return new C8112b(aVar, q6Var, photo, formattedText);
    }

    public static C8112b m13522X0(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.Video video, TdApi.FormattedText formattedText) {
        return new C8112b(aVar, q6Var, video, formattedText, true);
    }

    public static boolean m13513c0(int i) {
        return i == 3 || i == 4 || i == 5;
    }

    public static C8112b m13498k(C8112b bVar) {
        return m13496l(bVar, true);
    }

    public static C8112b m13496l(C8112b bVar, boolean z) {
        if (bVar == null) {
            return null;
        }
        int i = bVar.f26371Y;
        if (i == 0) {
            C8112b bVar2 = new C8112b(bVar.f26369W, bVar.f26370X, bVar.f26360N, bVar.f26361O, bVar.f26364R);
            bVar2.f26362P = bVar.f26362P;
            bVar2.f26363Q = bVar.f26363Q;
            bVar2.f26376b0 = bVar.f26376b0;
            bVar2.f26387l0 = bVar.f26387l0;
            return bVar2;
        } else if (i == 1) {
            return new C8112b(bVar.f26369W, bVar.f26370X, bVar.f26360N, bVar.f26361O, bVar.f26362P, bVar.f26363Q, bVar.f26365S, bVar.f26376b0, z).m13566B0(bVar.f26387l0);
        } else {
            if (i == 2) {
                return new C8112b(bVar.f26369W, bVar.f26370X, bVar.f26360N, bVar.f26361O, bVar.f26362P, bVar.f26363Q, bVar.f26367U, bVar.f26376b0).m13566B0(bVar.f26387l0);
            }
            if (i == 6) {
                return new C8112b(bVar.f26369W, bVar.f26370X, ((TdApi.MessageSenderUser) bVar.f26362P).userId, bVar.f26380e0);
            }
            if (i != 7) {
                return null;
            }
            return new C8112b(bVar.f26369W, bVar.f26370X, bVar.f26360N, bVar.f26361O, bVar.f26381f0);
        }
    }

    public static int m13489o0() {
        return 1280;
    }

    public int m13569A() {
        double d;
        double e;
        C6253l lVar = this.f26368V;
        if (lVar == null || lVar.m20913j() == null) {
            return this.f26374a0;
        }
        C7856c j = this.f26368V.m20913j();
        if (C7389v0.m16564x1(j.m14822h())) {
            d = this.f26372Z;
            e = j.m14824f();
        } else {
            d = this.f26374a0;
            e = j.m14825e();
        }
        return (int) (d * e);
    }

    public C6252k m13568A0(C8111a aVar) {
        this.f26368V.m20929a0(aVar);
        if (aVar == null || aVar.m13574k()) {
            this.f26388m0 = null;
        } else {
            aVar.m13571n(C7389v0.m16580t1(this.f26368V.mo20876q()), this.f26368V.m20864K0());
            C6252k kVar = new C6252k(this.f26378c0, aVar.m13573l(), aVar.m13576i());
            this.f26388m0 = kVar;
            kVar.m20898s0(1);
            this.f26388m0.mo20875q0(this.f26368V.mo20873D());
            this.f26388m0.m20932Y(m13476v());
            this.f26388m0.m20905n0(m13565C());
        }
        return this.f26388m0;
    }

    public C6246h m13567B() {
        return this.f26373a;
    }

    public final C8112b m13566B0(TdApi.Message message) {
        this.f26387l0 = message;
        return this;
    }

    public C8431f m13565C() {
        C8431f fVar = this.f26389n0;
        if (fVar == null || fVar.m12493i()) {
            return null;
        }
        return this.f26389n0;
    }

    public final void m13564C0(TdApi.Minithumbnail minithumbnail) {
        if (minithumbnail != null) {
            C6250i iVar = new C6250i(minithumbnail);
            this.f26373a = iVar;
            iVar.m20898s0(1);
            this.f26373a.m20918g0(true);
            return;
        }
        this.f26373a = null;
    }

    public long m13563D() {
        int i = this.f26371Y;
        if (i == 6) {
            return this.f26380e0.f25417id;
        }
        if (i == 7) {
            return this.f26381f0.f25373id;
        }
        throw new UnsupportedOperationException();
    }

    public void m13562D0(boolean z) {
        C6246h hVar = this.f26373a;
        if (hVar != null) {
            hVar.m20931Z(z);
        }
        C6246h hVar2 = this.f26375b;
        if (hVar2 != null) {
            hVar2.m20931Z(z);
        }
        C6246h hVar3 = this.f26378c0;
        if (hVar3 != null) {
            hVar3.m20931Z(z);
        }
    }

    public float m13561E() {
        C6253l lVar = this.f26368V;
        if (lVar != null) {
            return lVar.m20860O0();
        }
        return 0.0f;
    }

    public boolean m13560E0(C8431f fVar, boolean z) {
        if (fVar != null && fVar.m12493i()) {
            fVar = null;
        }
        boolean n0 = this.f26368V.m20905n0(fVar);
        C6252k kVar = this.f26388m0;
        if (kVar != null) {
            kVar.m20905n0(fVar);
        }
        C6246h hVar = this.f26378c0;
        if (hVar != null) {
            hVar.m20905n0(fVar);
        }
        C6246h hVar2 = this.f26375b;
        if (hVar2 != null) {
            hVar2.m20905n0(fVar);
        }
        if (z) {
            this.f26389n0 = fVar;
        }
        return n0;
    }

    public C6246h m13559F() {
        return this.f26375b;
    }

    public void m13558F0(int i) {
        C6246h hVar = this.f26378c0;
        if (hVar instanceof C6253l) {
            ((C6253l) hVar).m20837l1(i);
        } else {
            hVar.mo20875q0(i);
        }
        C6246h hVar2 = this.f26375b;
        if (hVar2 instanceof C6253l) {
            ((C6253l) hVar2).m20837l1(i);
        }
    }

    public C4714n5 m13557G() {
        return this.f26392q0;
    }

    public void m13556G0(C6246h hVar) {
        this.f26375b = hVar;
    }

    public TdApi.File m13555H() {
        if (m13553I() == null) {
            return null;
        }
        if (C4779t2.m25599T2(this.f26377c)) {
            return this.f26377c;
        }
        C6883g1 g1Var = this.f26359M;
        if (g1Var == null || !g1Var.m18673G()) {
            return null;
        }
        return this.f26359M.m18603t();
    }

    public void m13554H0(C6246h.AbstractC6249c cVar) {
        if (this.f26371Y == 4) {
            this.f26368V.m20899r0(cVar);
        }
    }

    public String m13553I() {
        int i = this.f26371Y;
        if (i == 0) {
            return "image/jpeg";
        }
        if (i == 1) {
            TdApi.Video video = this.f26365S;
            if (video == null) {
                return null;
            }
            String str = video.mimeType;
            return (C5070i.m24062i(str) || !str.startsWith("video/")) ? "video/*" : str;
        } else if (i == 2) {
            TdApi.Animation animation = this.f26367U;
            if (animation == null) {
                return null;
            }
            String str2 = animation.mimeType;
            return !C5070i.m24062i(str2) ? (str2.startsWith("video/") || str2.equals("image/gif")) ? str2 : "video/*" : "video/*";
        } else if (i == 6 || i == 7) {
            return "image/jpeg";
        } else {
            return null;
        }
    }

    public void m13552I0(int i) {
        C6246h hVar = this.f26373a;
        if (hVar != null) {
            hVar.m20898s0(i);
        }
        C6246h hVar2 = this.f26375b;
        if (hVar2 != null) {
            hVar2.m20898s0(i);
        }
        C6246h hVar3 = this.f26378c0;
        if (hVar3 != null) {
            hVar3.m20898s0(i);
        }
        C6503j jVar = this.f26379d0;
        if (jVar != null) {
            jVar.m20298I(i);
        }
    }

    public long m13551J() {
        return this.f26360N;
    }

    public void m13550J0(C4714n5 n5Var) {
        this.f26392q0 = n5Var;
        C6246h hVar = this.f26375b;
        if (hVar != null) {
            hVar.m20920f0();
            this.f26375b.m20924d0();
        }
    }

    public C6253l m13549K() {
        return this.f26368V;
    }

    public void m13548K0(C6883g1.AbstractC6886c cVar) {
        C6883g1 g1Var = this.f26359M;
        if (g1Var != null) {
            g1Var.m18668I0(cVar);
        }
    }

    public AbstractC4761s4 m13547L() {
        return this.f26382g0;
    }

    public void m13546L0(int i) {
        C6246h hVar = this.f26378c0;
        if (hVar != null) {
            hVar.mo20768t0(i);
        }
    }

    public TdApi.MessageSender m13545M() {
        return this.f26362P;
    }

    public C8112b m13544M0(int i) {
        this.f26363Q = i;
        return this;
    }

    public TdApi.Video m13543N() {
        return this.f26365S;
    }

    public C8112b m13542N0(AbstractC4761s4 s4Var) {
        this.f26382g0 = s4Var;
        return this;
    }

    public int m13541O() {
        C6253l lVar = this.f26368V;
        if (lVar != null) {
            return lVar.m20956A();
        }
        return 0;
    }

    public C8112b m13540O0(TdApi.Message message) {
        this.f26387l0 = message;
        this.f26360N = message.chatId;
        this.f26361O = message.f25409id;
        return this;
    }

    public TdApi.File m13539P() {
        return this.f26377c;
    }

    public C8112b m13538P0(long j, long j2) {
        this.f26360N = j;
        this.f26361O = j2;
        return this;
    }

    public C6503j m13537Q() {
        return this.f26379d0;
    }

    public C8112b m13536Q0(TdApi.MessageSender messageSender) {
        this.f26362P = messageSender;
        return this;
    }

    public C6246h m13535R() {
        return this.f26378c0;
    }

    public void m13534R0(int i) {
        C6253l lVar = this.f26368V;
        if (lVar != null) {
            lVar.m20891w0(i);
        }
    }

    public C6246h m13533S(boolean z) {
        C6252k kVar = this.f26388m0;
        return (kVar == null || !z) ? this.f26378c0 : kVar;
    }

    public C10930q6 m13532S0() {
        return this.f26370X;
    }

    public C6246h m13531T(int i, boolean z) {
        C6246h hVar;
        C6246h hVar2 = this.f26375b;
        TdApi.File k = hVar2 != null ? hVar2.m20911k() : null;
        if (k == null && ((hVar = this.f26384i0) == null || (hVar instanceof C6250i))) {
            C6883g1 g1Var = this.f26359M;
            if (g1Var != null && g1Var.m18673G()) {
                k = this.f26359M.m18603t();
            }
            C6883g1 g1Var2 = this.f26359M;
            if (g1Var2 != null && !g1Var2.m18673G()) {
                this.f26359M.m18621k(this.f26360N);
            }
        }
        C6246h hVar3 = this.f26384i0;
        if (hVar3 == null || (k != null && (hVar3 instanceof C6250i))) {
            if (k == null) {
                if (this.f26373a != null) {
                    C6250i iVar = new C6250i(this.f26373a.m20915i(), true);
                    this.f26384i0 = iVar;
                    iVar.m20898s0(2);
                    C6250i iVar2 = new C6250i(this.f26373a.m20915i(), false);
                    this.f26385j0 = iVar2;
                    iVar2.m20898s0(1);
                    return z ? this.f26385j0 : this.f26384i0;
                }
                TdApi.Photo photo = this.f26364R;
                TdApi.PhotoSize H0 = photo != null ? C7321e.m17004H0(photo) : null;
                if (H0 != null) {
                    k = H0.photo;
                } else {
                    C6246h hVar4 = this.f26378c0;
                    k = hVar4 != null ? hVar4.m20911k() : null;
                }
            }
            if (k == null) {
                return null;
            }
            C6246h hVar5 = new C6246h(this.f26370X, k);
            this.f26384i0 = hVar5;
            hVar5.m20918g0(true);
            this.f26384i0.m20898s0(2);
            this.f26384i0.m20910k0();
            C6246h hVar6 = this.f26375b;
            if (hVar6 != null && hVar6.m20887z() == C9903a.getDefaultAvatarCacheSize()) {
                i = C9903a.getDefaultAvatarCacheSize();
            }
            this.f26384i0.mo20768t0(i);
            C6246h hVar7 = new C6246h(this.f26370X, k);
            this.f26385j0 = hVar7;
            hVar7.m20918g0(true);
            this.f26385j0.m20898s0(1);
            this.f26385j0.m20910k0();
            this.f26385j0.mo20768t0(i);
        }
        return z ? this.f26385j0 : this.f26384i0;
    }

    public boolean m13530T0() {
        return this.f26368V.m20832q1();
    }

    public C6246h m13529U() {
        if (this.f26373a == null) {
            return null;
        }
        if (this.f26383h0 == null) {
            C6250i iVar = new C6250i(this.f26373a.m20915i(), true);
            this.f26383h0 = iVar;
            iVar.m20898s0(2);
        }
        return this.f26383h0;
    }

    public long m13527V() {
        if (m13485q0()) {
            return this.f26368V.m20865J0();
        }
        return -1L;
    }

    public long m13525W() {
        if (m13485q0()) {
            return this.f26368V.m20859P0();
        }
        return -1L;
    }

    public int m13523X() {
        return this.f26371Y;
    }

    public long m13521Y(boolean z, TimeUnit timeUnit) {
        int i = this.f26371Y;
        if (i == 1) {
            return timeUnit.convert(this.f26365S.duration, TimeUnit.SECONDS);
        }
        if (i == 2) {
            return timeUnit.convert(this.f26367U.duration, TimeUnit.SECONDS);
        }
        if (i == 4) {
            return this.f26368V.m20855T0(z, timeUnit);
        }
        if (i != 8) {
            return 0L;
        }
        return timeUnit.convert(this.f26366T.duration, TimeUnit.SECONDS);
    }

    public void m13520Y0() {
        C4714n5 n5Var = this.f26392q0;
        if (n5Var != null) {
            n5Var.m25770w8();
        }
    }

    public int m13519Z() {
        double d;
        double e;
        C6253l lVar = this.f26368V;
        if (lVar == null || lVar.m20913j() == null) {
            return this.f26372Z;
        }
        C7856c j = this.f26368V.m20913j();
        if (C7389v0.m16564x1(j.m14822h())) {
            d = this.f26374a0;
            e = j.m14824f();
        } else {
            d = this.f26372Z;
            e = j.m14825e();
        }
        return (int) (d * e);
    }

    @Override
    public void mo13518a() {
        List<Reference<View>> n;
        List<Reference<View>> n2;
        C4341g gVar = this.f26390o0;
        if (!(gVar == null || (n2 = gVar.m28239n()) == null)) {
            for (Reference<View> reference : n2) {
                View view = reference.get();
                if (view != null) {
                    if (view instanceof C1355a) {
                        ((C1355a) view).m37560x(this);
                    } else if (view.getParent() instanceof RunnableC7470o) {
                        ((RunnableC7470o) view.getParent()).m15915m0(this);
                    }
                }
            }
        }
        C4341g gVar2 = this.f26386k0;
        if (!(gVar2 == null || (n = gVar2.m28239n()) == null)) {
            for (Reference<View> reference2 : n) {
                View view2 = reference2.get();
                if (view2 instanceof C4341g.AbstractC4342a) {
                    ((C4341g.AbstractC4342a) view2).mo13518a();
                }
            }
        }
    }

    public boolean m13517a0() {
        return m13509e0() && m13491n0();
    }

    public void m13516b(View view) {
        if (this.f26386k0 == null) {
            this.f26386k0 = new C4341g();
        }
        this.f26386k0.m28243j(view);
    }

    public boolean m13515b0() {
        return m13513c0(this.f26371Y) && C7389v0.m16568w1(((float) this.f26368V.mo20874x()) + m13561E());
    }

    public void m13514c(View view) {
        m13510e(view, null, null);
    }

    @Override
    public long mo13512d() {
        return this.f26361O;
    }

    public boolean m13511d0() {
        int i = this.f26371Y;
        if (i == 2 || i == 5) {
            return !m13491n0();
        }
        return false;
    }

    public void m13510e(View view, C6883g1.AbstractC6886c cVar, C6246h.AbstractC6249c cVar2) {
        C6883g1 g1Var;
        C6883g1 g1Var2;
        if (this.f26390o0 == null) {
            C4341g gVar = new C4341g();
            this.f26390o0 = gVar;
            gVar.m28235r(this);
            C6883g1 g1Var3 = this.f26359M;
            if (g1Var3 != null) {
                g1Var3.m18658N0(this.f26390o0);
            }
        }
        if (this.f26390o0.m28243j(view) && (g1Var2 = this.f26359M) != null) {
            g1Var2.m18655P();
        }
        if (!(cVar == null || (g1Var = this.f26359M) == null)) {
            g1Var.m18668I0(cVar);
        }
        m13554H0(cVar2);
    }

    public boolean m13509e0() {
        int i = this.f26371Y;
        return i == 2 || i == 5;
    }

    public boolean m13508f() {
        TdApi.Message message = this.f26387l0;
        if (message != null) {
            return this.f26370X.m2868F2(message);
        }
        int i = this.f26371Y;
        if (i == 6) {
            long j = ((TdApi.MessageSenderUser) this.f26362P).userId;
            return this.f26370X.m2900D2(C7316a.m17058c(j)) || this.f26370X.m2480e2().m1567z2(j);
        } else if (i != 7) {
            return false;
        } else {
            long j2 = this.f26360N;
            return j2 != 0 && this.f26370X.m2900D2(j2);
        }
    }

    public boolean m13507f0() {
        C6883g1 g1Var;
        TdApi.File file = this.f26377c;
        return file == null || C4779t2.m25599T2(file) || ((g1Var = this.f26359M) != null && g1Var.m18673G());
    }

    @Override
    public int mo13506g() {
        return this.f26363Q;
    }

    public boolean m13505g0() {
        C6883g1 g1Var = this.f26359M;
        return g1Var != null && g1Var.m18671H();
    }

    @Override
    public TdApi.Message getMessage() {
        return this.f26387l0;
    }

    public boolean m13504h() {
        TdApi.Message message = this.f26387l0;
        if (message != null) {
            return message.canBeSaved;
        }
        int i = this.f26371Y;
        if (i != 7) {
            return i == 3 || i == 4 || i == 5 || m13555H() != null;
        }
        TdApi.Chat U2 = this.f26370X.m2632U2(this.f26360N);
        return U2 != null && !U2.hasProtectedContent;
    }

    public boolean m13503h0() {
        int i = this.f26371Y;
        return i == 0 || i == 3;
    }

    public boolean m13502i() {
        TdApi.Message message = this.f26387l0;
        if (message != null) {
            return message.canBeForwarded;
        }
        return m13555H() != null;
    }

    public boolean m13501i0() {
        return m13513c0(this.f26371Y) && C7389v0.m16568w1(m13561E());
    }

    public boolean m13500j() {
        if (!(this.f26378c0 instanceof C6261s) || this.f26368V.m20859P0() == ((C6261s) this.f26378c0).m20777D0()) {
            return false;
        }
        C6261s sVar = new C6261s(this.f26370X, this.f26368V.m20911k());
        this.f26378c0 = sVar;
        sVar.m20898s0(1);
        this.f26378c0.mo20875q0(this.f26368V.m20860O0());
        ((C6261s) this.f26378c0).m20772I0(m13489o0());
        C6261s sVar2 = (C6261s) this.f26378c0;
        long j = 0;
        if (this.f26368V.m20859P0() > 0) {
            j = this.f26368V.m20859P0();
        }
        sVar2.m20773H0(j);
        if (!this.f26368V.m20847b1()) {
            C6253l lVar = new C6253l(this.f26368V);
            this.f26375b = lVar;
            lVar.m20898s0(1);
            ((C6253l) this.f26375b).m20837l1(this.f26368V.m20860O0());
        }
        return true;
    }

    public boolean m13499j0() {
        int i = this.f26371Y;
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        return m13491n0();
    }

    public boolean m13497k0() {
        return m13513c0(this.f26371Y) && C7389v0.m16564x1(this.f26368V.mo20874x());
    }

    public boolean m13495l0() {
        return this.f26392q0 != null;
    }

    public org.drinkless.p210td.libcore.telegram.TdApi.InputMessageContent m13494m(org.drinkless.p210td.libcore.telegram.TdApi.FormattedText r14) {
        throw new UnsupportedOperationException("Method not decompiled: p225pd.C8112b.m13494m(org.drinkless.td.libcore.telegram.TdApi$FormattedText):org.drinkless.td.libcore.telegram.TdApi$InputMessageContent");
    }

    public boolean m13493m0() {
        C4714n5 n5Var = this.f26392q0;
        return n5Var != null && n5Var.m25929g6();
    }

    public void m13492n() {
        if (this.f26388m0 != null) {
            File file = new File(this.f26388m0.mo20876q());
            if (file.exists() && !file.delete()) {
                Log.m14709w("Unable to delete filtered file", new Object[0]);
            }
        }
        C7389v0.m16682T(new File(this.f26368V.mo20876q()));
        List<File> G0 = this.f26368V.m20869G0();
        if (G0 != null) {
            for (File file2 : G0) {
                C7389v0.m16682T(file2);
            }
            G0.clear();
        }
    }

    public boolean m13491n0() {
        int i = this.f26371Y;
        if (i != 1) {
            if (i == 2) {
                return C5070i.m24068c(this.f26367U.mimeType, "video/mp4");
            }
            if (i != 4) {
                return false;
            }
        }
        return true;
    }

    public void m13490o(View view) {
        C4341g gVar = this.f26386k0;
        if (gVar != null) {
            gVar.m28241l(view);
        }
    }

    public void m13488p(View view) {
        C6883g1 g1Var;
        C4341g gVar = this.f26390o0;
        if (gVar != null && gVar.m28241l(view) && (g1Var = this.f26359M) != null) {
            g1Var.m18655P();
        }
    }

    public boolean m13487p0() {
        C6253l lVar = this.f26368V;
        return (lVar != null && lVar.m20833p1()) || this.f26371Y == 2;
    }

    public void m13486q(boolean z) {
        C6883g1 g1Var = this.f26359M;
        if (g1Var != null && this.f26371Y != 4) {
            if (this.f26360N == 0 || z) {
                g1Var.m18617m();
            } else if (!C4779t2.m25599T2(this.f26377c)) {
                this.f26359M.m18621k(this.f26360N);
            }
        }
    }

    public boolean m13485q0() {
        C6253l lVar = this.f26368V;
        return lVar != null && lVar.m20848a1();
    }

    public <T extends View & AbstractC5143t> void m13484r(T t, Canvas canvas, int i, int i2, int i3, int i4) {
        C6883g1 g1Var = this.f26359M;
        if (g1Var != null) {
            g1Var.m18630f0(i, i2, i3, i4);
            this.f26359M.m18615n(t, canvas);
        }
    }

    public boolean m13483r0(View view, float f, float f2) {
        if (this.f26359M == null) {
            return false;
        }
        if (!m13507f0()) {
            return this.f26359M.m18646V(view, f, f2);
        }
        int d = this.f26359M.m18635d();
        int e = this.f26359M.m18633e();
        int i = C1357a0.m37544i(28.0f);
        if (f < d - i || f > d + i || f2 < e - i || f2 > e + i) {
            return false;
        }
        return this.f26359M.m18646V(view, f, f2);
    }

    public TdApi.FormattedText m13482s() {
        if (m13513c0(this.f26371Y)) {
            return this.f26368V.m20868H0(false, false);
        }
        TdApi.FormattedText formattedText = this.f26376b0;
        if (formattedText == null || C5070i.m24062i(formattedText.text)) {
            return null;
        }
        return this.f26376b0;
    }

    public void m13481s0() {
        if (this.f26359M != null) {
            C4341g gVar = this.f26390o0;
            if (gVar == null || !gVar.mo28227g()) {
                this.f26359M.m18648T(false);
            }
        }
    }

    public AbstractC5411l0[] m13480t() {
        if (this.f26391p0 == null) {
            this.f26391p0 = AbstractC5411l0.m22790F(this.f26370X, this.f26376b0, null);
        }
        return this.f26391p0;
    }

    public boolean m13479t0(View view) {
        C6883g1 g1Var = this.f26359M;
        return g1Var != null && g1Var.m18647U(view);
    }

    public float m13478u() {
        C6883g1 g1Var = this.f26359M;
        if (g1Var != null) {
            return g1Var.m18591z();
        }
        return 0.0f;
    }

    public boolean m13477u0(View view, float f, float f2) {
        C6883g1 g1Var = this.f26359M;
        return g1Var != null && g1Var.m18646V(view, f, f2);
    }

    public C7856c m13476v() {
        C6253l lVar = this.f26368V;
        if (lVar != null) {
            return lVar.m20913j();
        }
        return null;
    }

    public int m13475v0() {
        int g1 = this.f26368V.m20842g1();
        m13558F0(g1);
        return g1;
    }

    public int m13474w() {
        TdApi.File file = this.f26377c;
        if (file != null) {
            return file.f25376id;
        }
        return 0;
    }

    public C8112b m13473w0(TdApi.FormattedText formattedText) {
        if (m13513c0(this.f26371Y)) {
            this.f26368V.m20841h1(formattedText);
        } else {
            this.f26376b0 = formattedText;
        }
        return this;
    }

    public C6883g1 m13472x() {
        return this.f26359M;
    }

    public void m13471x0(float f) {
        C6883g1 g1Var = this.f26359M;
        if (g1Var != null) {
            g1Var.m18670H0(f);
        }
    }

    public C6252k m13470y() {
        return this.f26388m0;
    }

    public void m13469y0(C7856c cVar) {
        this.f26368V.m20932Y(cVar);
        C6252k kVar = this.f26388m0;
        if (kVar != null) {
            kVar.m20932Y(cVar);
        }
        C6246h hVar = this.f26378c0;
        if (hVar != null) {
            hVar.m20932Y(cVar);
        }
        C6246h hVar2 = this.f26375b;
        if (hVar2 != null) {
            hVar2.m20932Y(cVar);
        }
    }

    public C8111a m13468z() {
        return this.f26368V.m20900r();
    }

    public boolean m13467z0(int i, int i2) {
        boolean z;
        C6253l lVar = this.f26368V;
        if (lVar != null) {
            z = C7389v0.m16564x1(lVar.mo20874x());
        } else {
            C6246h hVar = this.f26378c0;
            z = hVar instanceof C6261s ? C7389v0.m16564x1(((C6261s) hVar).m20774G0()) : false;
        }
        if (z) {
            i2 = i;
            i = i2;
        }
        if (this.f26372Z == i && this.f26374a0 == i2) {
            return false;
        }
        this.f26372Z = i;
        this.f26374a0 = i2;
        return true;
    }

    public C8112b(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, long j, long j2, TdApi.Photo photo) {
        this(aVar, q6Var, j, j2, photo, false);
    }

    public C8112b(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, long j, long j2, TdApi.Photo photo, boolean z) {
        this.f26371Y = 0;
        this.f26369W = aVar;
        this.f26370X = q6Var;
        this.f26364R = photo;
        this.f26360N = j;
        this.f26361O = j2;
        TdApi.PhotoSize m = C4630f0.m26737m(photo.sizes);
        TdApi.PhotoSize p = C4630f0.m26731p(photo.sizes, m);
        if (p != null) {
            this.f26372Z = p.width;
            this.f26374a0 = p.height;
        } else if (m != null) {
            this.f26372Z = m.width;
            this.f26374a0 = m.height;
        } else {
            this.f26372Z = 0;
            this.f26374a0 = 0;
        }
        if (this.f26372Z == 0 || this.f26374a0 == 0) {
            int i = C1357a0.m37544i(100.0f);
            this.f26374a0 = i;
            this.f26372Z = i;
        }
        m13564C0(photo.minithumbnail);
        if (m != null) {
            C6246h hVar = new C6246h(q6Var, m.photo);
            this.f26375b = hVar;
            hVar.m20898s0(1);
            this.f26375b.m20918g0(true);
            if (z) {
                this.f26375b.m20890x0();
            }
        } else {
            this.f26375b = null;
        }
        this.f26377c = p != null ? p.photo : null;
        if (p != null) {
            C6246h hVar2 = new C6246h(q6Var, p.photo);
            this.f26378c0 = hVar2;
            hVar2.m20898s0(1);
            this.f26378c0.m20910k0();
            this.f26378c0.m20918g0(true);
            if (z) {
                this.f26378c0.m20890x0();
            }
            C4630f0.m26743j(this.f26378c0, p);
        } else {
            this.f26378c0 = null;
        }
        if (p != null) {
            C6883g1 g1Var = new C6883g1(aVar, q6Var, 1, true, j, j2);
            this.f26359M = g1Var;
            g1Var.m18666J0();
            this.f26359M.m18616m0(p.photo);
        }
    }

    public C8112b(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, long j, long j2, TdApi.MessageSender messageSender, int i, TdApi.MessagePhoto messagePhoto) {
        this(aVar, q6Var, j, j2, messagePhoto.photo);
        this.f26362P = messageSender;
        this.f26363Q = i;
        this.f26376b0 = messagePhoto.caption;
    }

    public C8112b(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, long j, long j2, TdApi.MessageSender messageSender, int i, TdApi.MessageAnimation messageAnimation) {
        this(aVar, q6Var, j, j2, messageSender, i, messageAnimation.animation, messageAnimation.caption);
    }

    public C8112b(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.Animation animation, TdApi.FormattedText formattedText) {
        this(aVar, q6Var, 0L, 0L, (TdApi.MessageSender) null, 0, animation, formattedText);
    }

    public C8112b(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, long j, long j2, TdApi.MessageSender messageSender, int i, TdApi.Animation animation, TdApi.FormattedText formattedText) {
        this.f26369W = aVar;
        this.f26370X = q6Var;
        this.f26371Y = 2;
        this.f26376b0 = formattedText;
        this.f26367U = animation;
        this.f26360N = j;
        this.f26361O = j2;
        this.f26362P = messageSender;
        this.f26363Q = i;
        m13564C0(animation.minithumbnail);
        C6246h D5 = C4779t2.m25705D5(q6Var, animation.thumbnail);
        this.f26375b = D5;
        if (D5 != null) {
            D5.m20898s0(1);
            this.f26375b.m20918g0(true);
        }
        this.f26377c = animation.animation;
        C6503j jVar = new C6503j(q6Var, animation);
        this.f26379d0 = jVar;
        jVar.m20298I(1);
        if (!(j == 0 || j2 == 0 || C4868i.m24727c2().m24547z2())) {
            this.f26379d0.m20303D(true);
        }
        int i2 = animation.width;
        this.f26372Z = i2;
        int i3 = animation.height;
        this.f26374a0 = i3;
        if (i2 == 0 || i3 == 0) {
            int i4 = C1357a0.m37544i(100.0f);
            this.f26374a0 = i4;
            this.f26372Z = i4;
        }
        C6883g1 g1Var = new C6883g1(aVar, q6Var, 32, true, j, j2);
        this.f26359M = g1Var;
        g1Var.m18666J0();
        this.f26359M.m18616m0(this.f26377c);
    }

    public C8112b(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, long j, long j2, TdApi.MessageSender messageSender, int i, TdApi.MessageVideoNote messageVideoNote) {
        this.f26369W = aVar;
        this.f26370X = q6Var;
        this.f26371Y = 8;
        TdApi.VideoNote videoNote = messageVideoNote.videoNote;
        this.f26366T = videoNote;
        this.f26360N = j;
        this.f26361O = j2;
        this.f26362P = messageSender;
        this.f26363Q = i;
        m13564C0(videoNote.minithumbnail);
        TdApi.Thumbnail thumbnail = messageVideoNote.videoNote.thumbnail;
        if (thumbnail != null) {
            C6246h D5 = C4779t2.m25705D5(q6Var, thumbnail);
            this.f26375b = D5;
            if (D5 != null) {
                D5.m20918g0(true);
                this.f26375b.m20898s0(1);
            }
            TdApi.Thumbnail thumbnail2 = messageVideoNote.videoNote.thumbnail;
            this.f26372Z = thumbnail2.width;
            this.f26374a0 = thumbnail2.height;
        }
        TdApi.File file = messageVideoNote.videoNote.video;
        this.f26377c = file;
        C6503j jVar = new C6503j(q6Var, file, 2);
        this.f26379d0 = jVar;
        jVar.m20298I(1);
        if (!(j == 0 || j2 == 0 || C4868i.m24727c2().m24547z2())) {
            this.f26379d0.m20303D(true);
        }
        if (this.f26372Z == 0 || this.f26374a0 == 0) {
            int i2 = C1357a0.m37544i(100.0f);
            this.f26374a0 = i2;
            this.f26372Z = i2;
        }
        C6883g1 g1Var = new C6883g1(aVar, q6Var, 64, true, j, j2);
        this.f26359M = g1Var;
        g1Var.m18666J0();
        this.f26359M.m18616m0(this.f26377c);
    }

    public C8112b(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.Video video, TdApi.FormattedText formattedText, boolean z) {
        this(aVar, q6Var, 0L, 0L, null, 0, video, formattedText, z);
    }

    public C8112b(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, long j, long j2, TdApi.MessageSender messageSender, int i, TdApi.Video video, TdApi.FormattedText formattedText, boolean z) {
        this.f26369W = aVar;
        this.f26370X = q6Var;
        this.f26371Y = 1;
        this.f26376b0 = formattedText;
        this.f26365S = video;
        this.f26360N = j;
        this.f26361O = j2;
        this.f26362P = messageSender;
        this.f26363Q = i;
        m13564C0(video.minithumbnail);
        C6246h D5 = C4779t2.m25705D5(q6Var, video.thumbnail);
        this.f26375b = D5;
        if (D5 != null) {
            D5.m20898s0(1);
            this.f26375b.m20918g0(true);
        }
        TdApi.File file = video.video;
        this.f26377c = file;
        C6261s q = C4630f0.m26729q(q6Var, file);
        this.f26378c0 = q;
        q.m20898s0(1);
        int i2 = video.width;
        this.f26372Z = i2;
        int i3 = video.height;
        this.f26374a0 = i3;
        if (i2 == 0 || i3 == 0) {
            int i4 = C1357a0.m37544i(100.0f);
            this.f26374a0 = i4;
            this.f26372Z = i4;
        }
        C6883g1 g1Var = new C6883g1(aVar, q6Var, 4, true, j, j2);
        this.f26359M = g1Var;
        g1Var.m18666J0();
        if (z) {
            this.f26359M.m18624i0(R.drawable.baseline_play_arrow_36_white);
        }
        this.f26359M.m18606r0(true);
        this.f26359M.m18660M0(true);
        this.f26359M.m18684A0(R.drawable.baseline_play_arrow_36_white);
        this.f26359M.m18616m0(this.f26377c);
    }

    public C8112b(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, long j, long j2, TdApi.MessageSender messageSender, int i, TdApi.MessageVideo messageVideo, boolean z) {
        this(aVar, q6Var, j, j2, messageSender, i, messageVideo.video, messageVideo.caption, z);
    }

    public C8112b(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, long j, TdApi.ProfilePhoto profilePhoto) {
        this.f26369W = aVar;
        this.f26370X = q6Var;
        this.f26371Y = 6;
        this.f26362P = new TdApi.MessageSenderUser(j);
        this.f26380e0 = profilePhoto;
        int i = C1357a0.m37544i(640.0f);
        this.f26374a0 = i;
        this.f26372Z = i;
        TdApi.File file = profilePhoto.small;
        if (file != null) {
            C6246h hVar = new C6246h(q6Var, file);
            this.f26375b = hVar;
            hVar.m20918g0(true);
            this.f26375b.mo20768t0(C9903a.getDefaultAvatarCacheSize());
            this.f26375b.m20898s0(1);
        }
        TdApi.File file2 = profilePhoto.big;
        if (file2 != null) {
            this.f26377c = file2;
            C6246h hVar2 = new C6246h(q6Var, file2);
            this.f26378c0 = hVar2;
            hVar2.m20918g0(true);
            this.f26378c0.m20898s0(1);
            C6883g1 g1Var = new C6883g1(aVar, q6Var, 1, true, 0L, 0L);
            this.f26359M = g1Var;
            g1Var.m18666J0();
            this.f26359M.m18616m0(profilePhoto.big);
        }
    }

    public C8112b(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, long j, TdApi.ChatPhotoInfo chatPhotoInfo) {
        this(aVar, q6Var, j, 0L, new TdApi.ChatPhoto(0L, 0, chatPhotoInfo.minithumbnail, new TdApi.PhotoSize[]{new TdApi.PhotoSize("s", chatPhotoInfo.small, 160, 160, null), new TdApi.PhotoSize("m", chatPhotoInfo.big, 640, 640, null)}, null));
    }

    public C8112b(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, long j, long j2, TdApi.ChatPhoto chatPhoto) {
        this.f26369W = aVar;
        this.f26370X = q6Var;
        this.f26371Y = 7;
        this.f26360N = j;
        this.f26361O = j2;
        this.f26362P = C7316a.m17049l(j) ? new TdApi.MessageSenderUser(q6Var.m2494d4(j)) : new TdApi.MessageSenderChat(j);
        this.f26363Q = chatPhoto.addedDate;
        this.f26381f0 = chatPhoto;
        m13564C0(chatPhoto.minithumbnail);
        TdApi.PhotoSize I0 = C7321e.m17002I0(chatPhoto.sizes);
        TdApi.PhotoSize B0 = C7321e.m17016B0(chatPhoto.sizes);
        if (I0 != null) {
            C6246h hVar = new C6246h(q6Var, I0.photo);
            this.f26375b = hVar;
            hVar.m20918g0(true);
            this.f26375b.mo20768t0(C9903a.getDefaultAvatarCacheSize());
            this.f26375b.m20898s0(1);
        }
        if (B0 != null) {
            TdApi.File file = B0.photo;
            this.f26377c = file;
            C6246h hVar2 = new C6246h(q6Var, file);
            this.f26378c0 = hVar2;
            hVar2.m20918g0(true);
            this.f26378c0.m20898s0(1);
            C6883g1 g1Var = new C6883g1(aVar, q6Var, 1, true, this.f26360N, j2);
            this.f26359M = g1Var;
            g1Var.m18666J0();
            this.f26359M.m18616m0(B0.photo);
        }
        this.f26374a0 = 640;
        this.f26372Z = 640;
        m13536Q0(q6Var.m2183wb(j));
    }

    public C8112b(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, C6253l lVar) {
        this.f26369W = aVar;
        this.f26370X = q6Var;
        int i = lVar.m20844e1() ? 4 : 3;
        this.f26371Y = i;
        this.f26372Z = lVar.m20850Y0();
        this.f26374a0 = lVar.m20863L0();
        this.f26368V = lVar;
        if (!lVar.m20847b1()) {
            C6253l lVar2 = new C6253l(lVar);
            this.f26375b = lVar2;
            lVar2.m20898s0(1);
            ((C6253l) this.f26375b).m20837l1(lVar.m20860O0());
        }
        int o0 = m13489o0();
        if (lVar.m20844e1()) {
            if (this.f26378c0 == null) {
                C6261s sVar = new C6261s(q6Var, lVar.m20911k());
                this.f26378c0 = sVar;
                sVar.m20898s0(1);
                this.f26378c0.mo20875q0(lVar.m20860O0());
                ((C6261s) this.f26378c0).m20772I0(o0);
                ((C6261s) this.f26378c0).m20773H0(lVar.m20859P0() > 0 ? lVar.m20859P0() : 0L);
            }
            C6883g1 g1Var = new C6883g1(aVar, q6Var, 4, false, 0L, 0L);
            this.f26359M = g1Var;
            g1Var.m18666J0();
            this.f26359M.m18602t0();
            this.f26359M.m18624i0(R.drawable.baseline_play_arrow_36_white);
            this.f26359M.m18616m0(lVar.m20911k());
        } else if (lVar.m20847b1()) {
            C6253l lVar3 = new C6253l(lVar);
            this.f26378c0 = lVar3;
            lVar3.m20898s0(1);
            this.f26378c0.mo20875q0(lVar.mo20874x());
        } else if (i == 5) {
            C6505k kVar = new C6505k(q6Var, lVar.mo20876q());
            this.f26379d0 = kVar;
            kVar.m20298I(1);
        } else {
            C6253l lVar4 = new C6253l(lVar);
            this.f26378c0 = lVar4;
            lVar4.m20898s0(1);
            ((C6253l) this.f26378c0).m20838k1(false);
        }
        C6246h hVar = this.f26378c0;
        if (hVar != null) {
            hVar.mo20768t0(o0);
            this.f26378c0.m20909l0();
            this.f26378c0.m20927b0();
            this.f26378c0.m20914i0();
        }
        m13568A0(this.f26368V.m20900r());
        m13469y0(this.f26368V.m20913j());
        m13560E0(this.f26368V.m20897t(), true);
    }
}
