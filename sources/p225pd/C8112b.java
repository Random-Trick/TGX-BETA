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
    public C6883g1 f26356M;
    public long f26357N;
    public long f26358O;
    public TdApi.MessageSender f26359P;
    public int f26360Q;
    public TdApi.Photo f26361R;
    public TdApi.Video f26362S;
    public TdApi.VideoNote f26363T;
    public TdApi.Animation f26364U;
    public C6253l f26365V;
    public final AbstractView$OnTouchListenerC7889a f26366W;
    public final C10930q6 f26367X;
    public final int f26368Y;
    public int f26369Z;
    public C6246h f26370a;
    public int f26371a0;
    public C6246h f26372b;
    public TdApi.FormattedText f26373b0;
    public TdApi.File f26374c;
    public C6246h f26375c0;
    public C6503j f26376d0;
    public TdApi.ProfilePhoto f26377e0;
    public TdApi.ChatPhoto f26378f0;
    public AbstractC4761s4 f26379g0;
    public C6246h f26380h0;
    public C6246h f26381i0;
    public C6246h f26382j0;
    public C4341g f26383k0;
    public TdApi.Message f26384l0;
    public C6252k f26385m0;
    public C8431f f26386n0;
    public C4341g f26387o0;
    public AbstractC5411l0[] f26388p0;
    public C4714n5 f26389q0;

    public C8112b(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.Photo photo, TdApi.FormattedText formattedText) {
        this(aVar, q6Var, 0L, 0L, photo, false);
        this.f26373b0 = formattedText;
    }

    public static C8112b m13529U0(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.Animation animation, TdApi.FormattedText formattedText) {
        return new C8112b(aVar, q6Var, animation, formattedText);
    }

    public static C8112b m13527V0(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.Message message) {
        TdApi.ChatEventPhotoChanged chatEventPhotoChanged;
        TdApi.ChatPhoto chatPhoto;
        if (message == null) {
            return null;
        }
        int constructor = message.content.getConstructor();
        if (constructor == -1851395174) {
            return new C8112b(aVar, q6Var, message.chatId, message.f25406id, message.senderId, message.date, (TdApi.MessagePhoto) message.content).m13567B0(message);
        }
        if (constructor == -813415093) {
            return new C8112b(aVar, q6Var, message.chatId, message.f25406id, ((TdApi.MessageChatChangePhoto) message.content).photo).m13567B0(message);
        }
        if (constructor == 0) {
            C4728o7 o7Var = (C4728o7) message.content;
            if (o7Var.f15919b && o7Var.f15918a.action.getConstructor() == -811572541 && !((chatPhoto = (chatEventPhotoChanged = (TdApi.ChatEventPhotoChanged) o7Var.f15918a.action).oldPhoto) == null && chatEventPhotoChanged.newPhoto == null)) {
                long j = message.chatId;
                TdApi.ChatPhoto chatPhoto2 = chatEventPhotoChanged.newPhoto;
                return new C8112b(aVar, q6Var, j, 0L, chatPhoto2 != null ? chatPhoto2 : chatPhoto).m13537Q0(new TdApi.MessageSenderUser(C7321e.m16982S0(o7Var.f15918a.memberId))).m13545M0(o7Var.f15918a.date);
            }
        } else if (constructor == 963323014) {
            return new C8112b(aVar, q6Var, message.chatId, message.f25406id, message.senderId, message.date, (TdApi.MessageVideoNote) message.content).m13567B0(message);
        } else {
            if (constructor == 1306939396) {
                return new C8112b(aVar, q6Var, message.chatId, message.f25406id, message.senderId, message.date, (TdApi.MessageAnimation) message.content).m13567B0(message);
            }
            if (constructor == 2021281344) {
                return new C8112b(aVar, q6Var, message.chatId, message.f25406id, message.senderId, message.date, (TdApi.MessageVideo) message.content, true).m13567B0(message);
            }
        }
        return null;
    }

    public static C8112b m13525W0(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.Photo photo, TdApi.FormattedText formattedText) {
        return new C8112b(aVar, q6Var, photo, formattedText);
    }

    public static C8112b m13523X0(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.Video video, TdApi.FormattedText formattedText) {
        return new C8112b(aVar, q6Var, video, formattedText, true);
    }

    public static boolean m13514c0(int i) {
        return i == 3 || i == 4 || i == 5;
    }

    public static C8112b m13499k(C8112b bVar) {
        return m13497l(bVar, true);
    }

    public static C8112b m13497l(C8112b bVar, boolean z) {
        if (bVar == null) {
            return null;
        }
        int i = bVar.f26368Y;
        if (i == 0) {
            C8112b bVar2 = new C8112b(bVar.f26366W, bVar.f26367X, bVar.f26357N, bVar.f26358O, bVar.f26361R);
            bVar2.f26359P = bVar.f26359P;
            bVar2.f26360Q = bVar.f26360Q;
            bVar2.f26373b0 = bVar.f26373b0;
            bVar2.f26384l0 = bVar.f26384l0;
            return bVar2;
        } else if (i == 1) {
            return new C8112b(bVar.f26366W, bVar.f26367X, bVar.f26357N, bVar.f26358O, bVar.f26359P, bVar.f26360Q, bVar.f26362S, bVar.f26373b0, z).m13567B0(bVar.f26384l0);
        } else {
            if (i == 2) {
                return new C8112b(bVar.f26366W, bVar.f26367X, bVar.f26357N, bVar.f26358O, bVar.f26359P, bVar.f26360Q, bVar.f26364U, bVar.f26373b0).m13567B0(bVar.f26384l0);
            }
            if (i == 6) {
                return new C8112b(bVar.f26366W, bVar.f26367X, ((TdApi.MessageSenderUser) bVar.f26359P).userId, bVar.f26377e0);
            }
            if (i != 7) {
                return null;
            }
            return new C8112b(bVar.f26366W, bVar.f26367X, bVar.f26357N, bVar.f26358O, bVar.f26378f0);
        }
    }

    public static int m13490o0() {
        return 1280;
    }

    public int m13570A() {
        double d;
        double e;
        C6253l lVar = this.f26365V;
        if (lVar == null || lVar.m20912j() == null) {
            return this.f26371a0;
        }
        C7856c j = this.f26365V.m20912j();
        if (C7389v0.m16564x1(j.m14822h())) {
            d = this.f26369Z;
            e = j.m14824f();
        } else {
            d = this.f26371a0;
            e = j.m14825e();
        }
        return (int) (d * e);
    }

    public C6252k m13569A0(C8111a aVar) {
        this.f26365V.m20928a0(aVar);
        if (aVar == null || aVar.m13575k()) {
            this.f26385m0 = null;
        } else {
            aVar.m13572n(C7389v0.m16580t1(this.f26365V.mo20875q()), this.f26365V.m20863K0());
            C6252k kVar = new C6252k(this.f26375c0, aVar.m13574l(), aVar.m13577i());
            this.f26385m0 = kVar;
            kVar.m20897s0(1);
            this.f26385m0.mo20874q0(this.f26365V.mo20872D());
            this.f26385m0.m20931Y(m13477v());
            this.f26385m0.m20904n0(m13566C());
        }
        return this.f26385m0;
    }

    public C6246h m13568B() {
        return this.f26370a;
    }

    public final C8112b m13567B0(TdApi.Message message) {
        this.f26384l0 = message;
        return this;
    }

    public C8431f m13566C() {
        C8431f fVar = this.f26386n0;
        if (fVar == null || fVar.m12494i()) {
            return null;
        }
        return this.f26386n0;
    }

    public final void m13565C0(TdApi.Minithumbnail minithumbnail) {
        if (minithumbnail != null) {
            C6250i iVar = new C6250i(minithumbnail);
            this.f26370a = iVar;
            iVar.m20897s0(1);
            this.f26370a.m20917g0(true);
            return;
        }
        this.f26370a = null;
    }

    public long m13564D() {
        int i = this.f26368Y;
        if (i == 6) {
            return this.f26377e0.f25414id;
        }
        if (i == 7) {
            return this.f26378f0.f25370id;
        }
        throw new UnsupportedOperationException();
    }

    public void m13563D0(boolean z) {
        C6246h hVar = this.f26370a;
        if (hVar != null) {
            hVar.m20930Z(z);
        }
        C6246h hVar2 = this.f26372b;
        if (hVar2 != null) {
            hVar2.m20930Z(z);
        }
        C6246h hVar3 = this.f26375c0;
        if (hVar3 != null) {
            hVar3.m20930Z(z);
        }
    }

    public float m13562E() {
        C6253l lVar = this.f26365V;
        if (lVar != null) {
            return lVar.m20859O0();
        }
        return 0.0f;
    }

    public boolean m13561E0(C8431f fVar, boolean z) {
        if (fVar != null && fVar.m12494i()) {
            fVar = null;
        }
        boolean n0 = this.f26365V.m20904n0(fVar);
        C6252k kVar = this.f26385m0;
        if (kVar != null) {
            kVar.m20904n0(fVar);
        }
        C6246h hVar = this.f26375c0;
        if (hVar != null) {
            hVar.m20904n0(fVar);
        }
        C6246h hVar2 = this.f26372b;
        if (hVar2 != null) {
            hVar2.m20904n0(fVar);
        }
        if (z) {
            this.f26386n0 = fVar;
        }
        return n0;
    }

    public C6246h m13560F() {
        return this.f26372b;
    }

    public void m13559F0(int i) {
        C6246h hVar = this.f26375c0;
        if (hVar instanceof C6253l) {
            ((C6253l) hVar).m20836l1(i);
        } else {
            hVar.mo20874q0(i);
        }
        C6246h hVar2 = this.f26372b;
        if (hVar2 instanceof C6253l) {
            ((C6253l) hVar2).m20836l1(i);
        }
    }

    public C4714n5 m13558G() {
        return this.f26389q0;
    }

    public void m13557G0(C6246h hVar) {
        this.f26372b = hVar;
    }

    public TdApi.File m13556H() {
        if (m13554I() == null) {
            return null;
        }
        if (C4779t2.m25598T2(this.f26374c)) {
            return this.f26374c;
        }
        C6883g1 g1Var = this.f26356M;
        if (g1Var == null || !g1Var.m18672G()) {
            return null;
        }
        return this.f26356M.m18603t();
    }

    public void m13555H0(C6246h.AbstractC6249c cVar) {
        if (this.f26368Y == 4) {
            this.f26365V.m20898r0(cVar);
        }
    }

    public String m13554I() {
        int i = this.f26368Y;
        if (i == 0) {
            return "image/jpeg";
        }
        if (i == 1) {
            TdApi.Video video = this.f26362S;
            if (video == null) {
                return null;
            }
            String str = video.mimeType;
            return (C5070i.m24061i(str) || !str.startsWith("video/")) ? "video/*" : str;
        } else if (i == 2) {
            TdApi.Animation animation = this.f26364U;
            if (animation == null) {
                return null;
            }
            String str2 = animation.mimeType;
            return !C5070i.m24061i(str2) ? (str2.startsWith("video/") || str2.equals("image/gif")) ? str2 : "video/*" : "video/*";
        } else if (i == 6 || i == 7) {
            return "image/jpeg";
        } else {
            return null;
        }
    }

    public void m13553I0(int i) {
        C6246h hVar = this.f26370a;
        if (hVar != null) {
            hVar.m20897s0(i);
        }
        C6246h hVar2 = this.f26372b;
        if (hVar2 != null) {
            hVar2.m20897s0(i);
        }
        C6246h hVar3 = this.f26375c0;
        if (hVar3 != null) {
            hVar3.m20897s0(i);
        }
        C6503j jVar = this.f26376d0;
        if (jVar != null) {
            jVar.m20297I(i);
        }
    }

    public long m13552J() {
        return this.f26357N;
    }

    public void m13551J0(C4714n5 n5Var) {
        this.f26389q0 = n5Var;
        C6246h hVar = this.f26372b;
        if (hVar != null) {
            hVar.m20919f0();
            this.f26372b.m20923d0();
        }
    }

    public C6253l m13550K() {
        return this.f26365V;
    }

    public void m13549K0(C6883g1.AbstractC6886c cVar) {
        C6883g1 g1Var = this.f26356M;
        if (g1Var != null) {
            g1Var.m18669H0(cVar);
        }
    }

    public AbstractC4761s4 m13548L() {
        return this.f26379g0;
    }

    public void m13547L0(int i) {
        C6246h hVar = this.f26375c0;
        if (hVar != null) {
            hVar.mo20767t0(i);
        }
    }

    public TdApi.MessageSender m13546M() {
        return this.f26359P;
    }

    public C8112b m13545M0(int i) {
        this.f26360Q = i;
        return this;
    }

    public TdApi.Video m13544N() {
        return this.f26362S;
    }

    public C8112b m13543N0(AbstractC4761s4 s4Var) {
        this.f26379g0 = s4Var;
        return this;
    }

    public int m13542O() {
        C6253l lVar = this.f26365V;
        if (lVar != null) {
            return lVar.m20955A();
        }
        return 0;
    }

    public C8112b m13541O0(TdApi.Message message) {
        this.f26384l0 = message;
        this.f26357N = message.chatId;
        this.f26358O = message.f25406id;
        return this;
    }

    public TdApi.File m13540P() {
        return this.f26374c;
    }

    public C8112b m13539P0(long j, long j2) {
        this.f26357N = j;
        this.f26358O = j2;
        return this;
    }

    public C6503j m13538Q() {
        return this.f26376d0;
    }

    public C8112b m13537Q0(TdApi.MessageSender messageSender) {
        this.f26359P = messageSender;
        return this;
    }

    public C6246h m13536R() {
        return this.f26375c0;
    }

    public void m13535R0(int i) {
        C6253l lVar = this.f26365V;
        if (lVar != null) {
            lVar.m20890w0(i);
        }
    }

    public C6246h m13534S(boolean z) {
        C6252k kVar = this.f26385m0;
        return (kVar == null || !z) ? this.f26375c0 : kVar;
    }

    public C10930q6 m13533S0() {
        return this.f26367X;
    }

    public C6246h m13532T(int i, boolean z) {
        C6246h hVar;
        C6246h hVar2 = this.f26372b;
        TdApi.File k = hVar2 != null ? hVar2.m20910k() : null;
        if (k == null && ((hVar = this.f26381i0) == null || (hVar instanceof C6250i))) {
            C6883g1 g1Var = this.f26356M;
            if (g1Var != null && g1Var.m18672G()) {
                k = this.f26356M.m18603t();
            }
            C6883g1 g1Var2 = this.f26356M;
            if (g1Var2 != null && !g1Var2.m18672G()) {
                this.f26356M.m18621k(this.f26357N);
            }
        }
        C6246h hVar3 = this.f26381i0;
        if (hVar3 == null || (k != null && (hVar3 instanceof C6250i))) {
            if (k == null) {
                if (this.f26370a != null) {
                    C6250i iVar = new C6250i(this.f26370a.m20914i(), true);
                    this.f26381i0 = iVar;
                    iVar.m20897s0(2);
                    C6250i iVar2 = new C6250i(this.f26370a.m20914i(), false);
                    this.f26382j0 = iVar2;
                    iVar2.m20897s0(1);
                    return z ? this.f26382j0 : this.f26381i0;
                }
                TdApi.Photo photo = this.f26361R;
                TdApi.PhotoSize H0 = photo != null ? C7321e.m17004H0(photo) : null;
                if (H0 != null) {
                    k = H0.photo;
                } else {
                    C6246h hVar4 = this.f26375c0;
                    k = hVar4 != null ? hVar4.m20910k() : null;
                }
            }
            if (k == null) {
                return null;
            }
            C6246h hVar5 = new C6246h(this.f26367X, k);
            this.f26381i0 = hVar5;
            hVar5.m20917g0(true);
            this.f26381i0.m20897s0(2);
            this.f26381i0.m20909k0();
            C6246h hVar6 = this.f26372b;
            if (hVar6 != null && hVar6.m20886z() == C9903a.getDefaultAvatarCacheSize()) {
                i = C9903a.getDefaultAvatarCacheSize();
            }
            this.f26381i0.mo20767t0(i);
            C6246h hVar7 = new C6246h(this.f26367X, k);
            this.f26382j0 = hVar7;
            hVar7.m20917g0(true);
            this.f26382j0.m20897s0(1);
            this.f26382j0.m20909k0();
            this.f26382j0.mo20767t0(i);
        }
        return z ? this.f26382j0 : this.f26381i0;
    }

    public boolean m13531T0() {
        return this.f26365V.m20831q1();
    }

    public C6246h m13530U() {
        if (this.f26370a == null) {
            return null;
        }
        if (this.f26380h0 == null) {
            C6250i iVar = new C6250i(this.f26370a.m20914i(), true);
            this.f26380h0 = iVar;
            iVar.m20897s0(2);
        }
        return this.f26380h0;
    }

    public long m13528V() {
        if (m13486q0()) {
            return this.f26365V.m20864J0();
        }
        return -1L;
    }

    public long m13526W() {
        if (m13486q0()) {
            return this.f26365V.m20858P0();
        }
        return -1L;
    }

    public int m13524X() {
        return this.f26368Y;
    }

    public long m13522Y(boolean z, TimeUnit timeUnit) {
        int i = this.f26368Y;
        if (i == 1) {
            return timeUnit.convert(this.f26362S.duration, TimeUnit.SECONDS);
        }
        if (i == 2) {
            return timeUnit.convert(this.f26364U.duration, TimeUnit.SECONDS);
        }
        if (i == 4) {
            return this.f26365V.m20854T0(z, timeUnit);
        }
        if (i != 8) {
            return 0L;
        }
        return timeUnit.convert(this.f26363T.duration, TimeUnit.SECONDS);
    }

    public void m13521Y0() {
        C4714n5 n5Var = this.f26389q0;
        if (n5Var != null) {
            n5Var.m25769w8();
        }
    }

    public int m13520Z() {
        double d;
        double e;
        C6253l lVar = this.f26365V;
        if (lVar == null || lVar.m20912j() == null) {
            return this.f26369Z;
        }
        C7856c j = this.f26365V.m20912j();
        if (C7389v0.m16564x1(j.m14822h())) {
            d = this.f26371a0;
            e = j.m14824f();
        } else {
            d = this.f26369Z;
            e = j.m14825e();
        }
        return (int) (d * e);
    }

    @Override
    public void mo13519a() {
        List<Reference<View>> n;
        List<Reference<View>> n2;
        C4341g gVar = this.f26387o0;
        if (!(gVar == null || (n2 = gVar.m28237n()) == null)) {
            for (Reference<View> reference : n2) {
                View view = reference.get();
                if (view != null) {
                    if (view instanceof C1355a) {
                        ((C1355a) view).m37557x(this);
                    } else if (view.getParent() instanceof RunnableC7470o) {
                        ((RunnableC7470o) view.getParent()).m15915m0(this);
                    }
                }
            }
        }
        C4341g gVar2 = this.f26383k0;
        if (!(gVar2 == null || (n = gVar2.m28237n()) == null)) {
            for (Reference<View> reference2 : n) {
                View view2 = reference2.get();
                if (view2 instanceof C4341g.AbstractC4342a) {
                    ((C4341g.AbstractC4342a) view2).mo13519a();
                }
            }
        }
    }

    public boolean m13518a0() {
        return m13510e0() && m13492n0();
    }

    public void m13517b(View view) {
        if (this.f26383k0 == null) {
            this.f26383k0 = new C4341g();
        }
        this.f26383k0.m28241j(view);
    }

    public boolean m13516b0() {
        return m13514c0(this.f26368Y) && C7389v0.m16568w1(((float) this.f26365V.mo20873x()) + m13562E());
    }

    public void m13515c(View view) {
        m13511e(view, null, null);
    }

    @Override
    public long mo13513d() {
        return this.f26358O;
    }

    public boolean m13512d0() {
        int i = this.f26368Y;
        if (i == 2 || i == 5) {
            return !m13492n0();
        }
        return false;
    }

    public void m13511e(View view, C6883g1.AbstractC6886c cVar, C6246h.AbstractC6249c cVar2) {
        C6883g1 g1Var;
        C6883g1 g1Var2;
        if (this.f26387o0 == null) {
            C4341g gVar = new C4341g();
            this.f26387o0 = gVar;
            gVar.m28233r(this);
            C6883g1 g1Var3 = this.f26356M;
            if (g1Var3 != null) {
                g1Var3.m18659M0(this.f26387o0);
            }
        }
        if (this.f26387o0.m28241j(view) && (g1Var2 = this.f26356M) != null) {
            g1Var2.m18654P();
        }
        if (!(cVar == null || (g1Var = this.f26356M) == null)) {
            g1Var.m18669H0(cVar);
        }
        m13555H0(cVar2);
    }

    public boolean m13510e0() {
        int i = this.f26368Y;
        return i == 2 || i == 5;
    }

    public boolean m13509f() {
        TdApi.Message message = this.f26384l0;
        if (message != null) {
            return this.f26367X.m2868F2(message);
        }
        int i = this.f26368Y;
        if (i == 6) {
            long j = ((TdApi.MessageSenderUser) this.f26359P).userId;
            return this.f26367X.m2900D2(C7316a.m17058c(j)) || this.f26367X.m2480e2().m1567z2(j);
        } else if (i != 7) {
            return false;
        } else {
            long j2 = this.f26357N;
            return j2 != 0 && this.f26367X.m2900D2(j2);
        }
    }

    public boolean m13508f0() {
        C6883g1 g1Var;
        TdApi.File file = this.f26374c;
        return file == null || C4779t2.m25598T2(file) || ((g1Var = this.f26356M) != null && g1Var.m18672G());
    }

    @Override
    public int mo13507g() {
        return this.f26360Q;
    }

    public boolean m13506g0() {
        C6883g1 g1Var = this.f26356M;
        return g1Var != null && g1Var.m18670H();
    }

    @Override
    public TdApi.Message getMessage() {
        return this.f26384l0;
    }

    public boolean m13505h() {
        TdApi.Message message = this.f26384l0;
        if (message != null) {
            return message.canBeSaved;
        }
        int i = this.f26368Y;
        if (i != 7) {
            return i == 3 || i == 4 || i == 5 || m13556H() != null;
        }
        TdApi.Chat U2 = this.f26367X.m2632U2(this.f26357N);
        return U2 != null && !U2.hasProtectedContent;
    }

    public boolean m13504h0() {
        int i = this.f26368Y;
        return i == 0 || i == 3;
    }

    public boolean m13503i() {
        TdApi.Message message = this.f26384l0;
        if (message != null) {
            return message.canBeForwarded;
        }
        return m13556H() != null;
    }

    public boolean m13502i0() {
        return m13514c0(this.f26368Y) && C7389v0.m16568w1(m13562E());
    }

    public boolean m13501j() {
        if (!(this.f26375c0 instanceof C6261s) || this.f26365V.m20858P0() == ((C6261s) this.f26375c0).m20776D0()) {
            return false;
        }
        C6261s sVar = new C6261s(this.f26367X, this.f26365V.m20910k());
        this.f26375c0 = sVar;
        sVar.m20897s0(1);
        this.f26375c0.mo20874q0(this.f26365V.m20859O0());
        ((C6261s) this.f26375c0).m20771I0(m13490o0());
        C6261s sVar2 = (C6261s) this.f26375c0;
        long j = 0;
        if (this.f26365V.m20858P0() > 0) {
            j = this.f26365V.m20858P0();
        }
        sVar2.m20772H0(j);
        if (!this.f26365V.m20846b1()) {
            C6253l lVar = new C6253l(this.f26365V);
            this.f26372b = lVar;
            lVar.m20897s0(1);
            ((C6253l) this.f26372b).m20836l1(this.f26365V.m20859O0());
        }
        return true;
    }

    public boolean m13500j0() {
        int i = this.f26368Y;
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        return m13492n0();
    }

    public boolean m13498k0() {
        return m13514c0(this.f26368Y) && C7389v0.m16564x1(this.f26365V.mo20873x());
    }

    public boolean m13496l0() {
        return this.f26389q0 != null;
    }

    public org.drinkless.p210td.libcore.telegram.TdApi.InputMessageContent m13495m(org.drinkless.p210td.libcore.telegram.TdApi.FormattedText r14) {
        throw new UnsupportedOperationException("Method not decompiled: p225pd.C8112b.m13495m(org.drinkless.td.libcore.telegram.TdApi$FormattedText):org.drinkless.td.libcore.telegram.TdApi$InputMessageContent");
    }

    public boolean m13494m0() {
        C4714n5 n5Var = this.f26389q0;
        return n5Var != null && n5Var.m25928g6();
    }

    public void m13493n() {
        if (this.f26385m0 != null) {
            File file = new File(this.f26385m0.mo20875q());
            if (file.exists() && !file.delete()) {
                Log.m14709w("Unable to delete filtered file", new Object[0]);
            }
        }
        C7389v0.m16682T(new File(this.f26365V.mo20875q()));
        List<File> G0 = this.f26365V.m20868G0();
        if (G0 != null) {
            for (File file2 : G0) {
                C7389v0.m16682T(file2);
            }
            G0.clear();
        }
    }

    public boolean m13492n0() {
        int i = this.f26368Y;
        if (i != 1) {
            if (i == 2) {
                return C5070i.m24067c(this.f26364U.mimeType, "video/mp4");
            }
            if (i != 4) {
                return false;
            }
        }
        return true;
    }

    public void m13491o(View view) {
        C4341g gVar = this.f26383k0;
        if (gVar != null) {
            gVar.m28239l(view);
        }
    }

    public void m13489p(View view) {
        C6883g1 g1Var;
        C4341g gVar = this.f26387o0;
        if (gVar != null && gVar.m28239l(view) && (g1Var = this.f26356M) != null) {
            g1Var.m18654P();
        }
    }

    public boolean m13488p0() {
        C6253l lVar = this.f26365V;
        return (lVar != null && lVar.m20832p1()) || this.f26368Y == 2;
    }

    public void m13487q(boolean z) {
        C6883g1 g1Var = this.f26356M;
        if (g1Var != null && this.f26368Y != 4) {
            if (this.f26357N == 0 || z) {
                g1Var.m18617m();
            } else if (!C4779t2.m25598T2(this.f26374c)) {
                this.f26356M.m18621k(this.f26357N);
            }
        }
    }

    public boolean m13486q0() {
        C6253l lVar = this.f26365V;
        return lVar != null && lVar.m20847a1();
    }

    public <T extends View & AbstractC5143t> void m13485r(T t, Canvas canvas, int i, int i2, int i3, int i4) {
        C6883g1 g1Var = this.f26356M;
        if (g1Var != null) {
            g1Var.m18630f0(i, i2, i3, i4);
            this.f26356M.m18615n(t, canvas);
        }
    }

    public boolean m13484r0(View view, float f, float f2) {
        if (this.f26356M == null) {
            return false;
        }
        if (!m13508f0()) {
            return this.f26356M.m18646V(view, f, f2);
        }
        int d = this.f26356M.m18635d();
        int e = this.f26356M.m18633e();
        int i = C1357a0.m37541i(28.0f);
        if (f < d - i || f > d + i || f2 < e - i || f2 > e + i) {
            return false;
        }
        return this.f26356M.m18646V(view, f, f2);
    }

    public TdApi.FormattedText m13483s() {
        if (m13514c0(this.f26368Y)) {
            return this.f26365V.m20867H0(false, false);
        }
        TdApi.FormattedText formattedText = this.f26373b0;
        if (formattedText == null || C5070i.m24061i(formattedText.text)) {
            return null;
        }
        return this.f26373b0;
    }

    public void m13482s0() {
        if (this.f26356M != null) {
            C4341g gVar = this.f26387o0;
            if (gVar == null || !gVar.mo28225g()) {
                this.f26356M.m18648T(false);
            }
        }
    }

    public AbstractC5411l0[] m13481t() {
        if (this.f26388p0 == null) {
            this.f26388p0 = AbstractC5411l0.m22789F(this.f26367X, this.f26373b0, null);
        }
        return this.f26388p0;
    }

    public boolean m13480t0(View view) {
        C6883g1 g1Var = this.f26356M;
        return g1Var != null && g1Var.m18647U(view);
    }

    public float m13479u() {
        C6883g1 g1Var = this.f26356M;
        if (g1Var != null) {
            return g1Var.m18591z();
        }
        return 0.0f;
    }

    public boolean m13478u0(View view, float f, float f2) {
        C6883g1 g1Var = this.f26356M;
        return g1Var != null && g1Var.m18646V(view, f, f2);
    }

    public C7856c m13477v() {
        C6253l lVar = this.f26365V;
        if (lVar != null) {
            return lVar.m20912j();
        }
        return null;
    }

    public int m13476v0() {
        int g1 = this.f26365V.m20841g1();
        m13559F0(g1);
        return g1;
    }

    public int m13475w() {
        TdApi.File file = this.f26374c;
        if (file != null) {
            return file.f25373id;
        }
        return 0;
    }

    public C8112b m13474w0(TdApi.FormattedText formattedText) {
        if (m13514c0(this.f26368Y)) {
            this.f26365V.m20840h1(formattedText);
        } else {
            this.f26373b0 = formattedText;
        }
        return this;
    }

    public C6883g1 m13473x() {
        return this.f26356M;
    }

    public void m13472x0(float f) {
        C6883g1 g1Var = this.f26356M;
        if (g1Var != null) {
            g1Var.m18671G0(f);
        }
    }

    public C6252k m13471y() {
        return this.f26385m0;
    }

    public void m13470y0(C7856c cVar) {
        this.f26365V.m20931Y(cVar);
        C6252k kVar = this.f26385m0;
        if (kVar != null) {
            kVar.m20931Y(cVar);
        }
        C6246h hVar = this.f26375c0;
        if (hVar != null) {
            hVar.m20931Y(cVar);
        }
        C6246h hVar2 = this.f26372b;
        if (hVar2 != null) {
            hVar2.m20931Y(cVar);
        }
    }

    public C8111a m13469z() {
        return this.f26365V.m20899r();
    }

    public boolean m13468z0(int i, int i2) {
        boolean z;
        C6253l lVar = this.f26365V;
        if (lVar != null) {
            z = C7389v0.m16564x1(lVar.mo20873x());
        } else {
            C6246h hVar = this.f26375c0;
            z = hVar instanceof C6261s ? C7389v0.m16564x1(((C6261s) hVar).m20773G0()) : false;
        }
        if (z) {
            i2 = i;
            i = i2;
        }
        if (this.f26369Z == i && this.f26371a0 == i2) {
            return false;
        }
        this.f26369Z = i;
        this.f26371a0 = i2;
        return true;
    }

    public C8112b(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, long j, long j2, TdApi.Photo photo) {
        this(aVar, q6Var, j, j2, photo, false);
    }

    public C8112b(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, long j, long j2, TdApi.Photo photo, boolean z) {
        this.f26368Y = 0;
        this.f26366W = aVar;
        this.f26367X = q6Var;
        this.f26361R = photo;
        this.f26357N = j;
        this.f26358O = j2;
        TdApi.PhotoSize m = C4630f0.m26736m(photo.sizes);
        TdApi.PhotoSize p = C4630f0.m26730p(photo.sizes, m);
        if (p != null) {
            this.f26369Z = p.width;
            this.f26371a0 = p.height;
        } else if (m != null) {
            this.f26369Z = m.width;
            this.f26371a0 = m.height;
        } else {
            this.f26369Z = 0;
            this.f26371a0 = 0;
        }
        if (this.f26369Z == 0 || this.f26371a0 == 0) {
            int i = C1357a0.m37541i(100.0f);
            this.f26371a0 = i;
            this.f26369Z = i;
        }
        m13565C0(photo.minithumbnail);
        if (m != null) {
            C6246h hVar = new C6246h(q6Var, m.photo);
            this.f26372b = hVar;
            hVar.m20897s0(1);
            this.f26372b.m20917g0(true);
            if (z) {
                this.f26372b.m20889x0();
            }
        } else {
            this.f26372b = null;
        }
        this.f26374c = p != null ? p.photo : null;
        if (p != null) {
            C6246h hVar2 = new C6246h(q6Var, p.photo);
            this.f26375c0 = hVar2;
            hVar2.m20897s0(1);
            this.f26375c0.m20909k0();
            this.f26375c0.m20917g0(true);
            if (z) {
                this.f26375c0.m20889x0();
            }
            C4630f0.m26742j(this.f26375c0, p);
        } else {
            this.f26375c0 = null;
        }
        if (p != null) {
            C6883g1 g1Var = new C6883g1(aVar, q6Var, 1, true, j, j2);
            this.f26356M = g1Var;
            g1Var.m18667I0();
            this.f26356M.m18616m0(p.photo);
        }
    }

    public C8112b(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, long j, long j2, TdApi.MessageSender messageSender, int i, TdApi.MessagePhoto messagePhoto) {
        this(aVar, q6Var, j, j2, messagePhoto.photo);
        this.f26359P = messageSender;
        this.f26360Q = i;
        this.f26373b0 = messagePhoto.caption;
    }

    public C8112b(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, long j, long j2, TdApi.MessageSender messageSender, int i, TdApi.MessageAnimation messageAnimation) {
        this(aVar, q6Var, j, j2, messageSender, i, messageAnimation.animation, messageAnimation.caption);
    }

    public C8112b(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.Animation animation, TdApi.FormattedText formattedText) {
        this(aVar, q6Var, 0L, 0L, (TdApi.MessageSender) null, 0, animation, formattedText);
    }

    public C8112b(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, long j, long j2, TdApi.MessageSender messageSender, int i, TdApi.Animation animation, TdApi.FormattedText formattedText) {
        this.f26366W = aVar;
        this.f26367X = q6Var;
        this.f26368Y = 2;
        this.f26373b0 = formattedText;
        this.f26364U = animation;
        this.f26357N = j;
        this.f26358O = j2;
        this.f26359P = messageSender;
        this.f26360Q = i;
        m13565C0(animation.minithumbnail);
        C6246h D5 = C4779t2.m25704D5(q6Var, animation.thumbnail);
        this.f26372b = D5;
        if (D5 != null) {
            D5.m20897s0(1);
            this.f26372b.m20917g0(true);
        }
        this.f26374c = animation.animation;
        C6503j jVar = new C6503j(q6Var, animation);
        this.f26376d0 = jVar;
        jVar.m20297I(1);
        if (!(j == 0 || j2 == 0 || C4868i.m24726c2().m24546z2())) {
            this.f26376d0.m20302D(true);
        }
        int i2 = animation.width;
        this.f26369Z = i2;
        int i3 = animation.height;
        this.f26371a0 = i3;
        if (i2 == 0 || i3 == 0) {
            int i4 = C1357a0.m37541i(100.0f);
            this.f26371a0 = i4;
            this.f26369Z = i4;
        }
        C6883g1 g1Var = new C6883g1(aVar, q6Var, 32, true, j, j2);
        this.f26356M = g1Var;
        g1Var.m18667I0();
        this.f26356M.m18616m0(this.f26374c);
    }

    public C8112b(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, long j, long j2, TdApi.MessageSender messageSender, int i, TdApi.MessageVideoNote messageVideoNote) {
        this.f26366W = aVar;
        this.f26367X = q6Var;
        this.f26368Y = 8;
        TdApi.VideoNote videoNote = messageVideoNote.videoNote;
        this.f26363T = videoNote;
        this.f26357N = j;
        this.f26358O = j2;
        this.f26359P = messageSender;
        this.f26360Q = i;
        m13565C0(videoNote.minithumbnail);
        TdApi.Thumbnail thumbnail = messageVideoNote.videoNote.thumbnail;
        if (thumbnail != null) {
            C6246h D5 = C4779t2.m25704D5(q6Var, thumbnail);
            this.f26372b = D5;
            if (D5 != null) {
                D5.m20917g0(true);
                this.f26372b.m20897s0(1);
            }
            TdApi.Thumbnail thumbnail2 = messageVideoNote.videoNote.thumbnail;
            this.f26369Z = thumbnail2.width;
            this.f26371a0 = thumbnail2.height;
        }
        TdApi.File file = messageVideoNote.videoNote.video;
        this.f26374c = file;
        C6503j jVar = new C6503j(q6Var, file, 2);
        this.f26376d0 = jVar;
        jVar.m20297I(1);
        if (!(j == 0 || j2 == 0 || C4868i.m24726c2().m24546z2())) {
            this.f26376d0.m20302D(true);
        }
        if (this.f26369Z == 0 || this.f26371a0 == 0) {
            int i2 = C1357a0.m37541i(100.0f);
            this.f26371a0 = i2;
            this.f26369Z = i2;
        }
        C6883g1 g1Var = new C6883g1(aVar, q6Var, 64, true, j, j2);
        this.f26356M = g1Var;
        g1Var.m18667I0();
        this.f26356M.m18616m0(this.f26374c);
    }

    public C8112b(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.Video video, TdApi.FormattedText formattedText, boolean z) {
        this(aVar, q6Var, 0L, 0L, null, 0, video, formattedText, z);
    }

    public C8112b(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, long j, long j2, TdApi.MessageSender messageSender, int i, TdApi.Video video, TdApi.FormattedText formattedText, boolean z) {
        this.f26366W = aVar;
        this.f26367X = q6Var;
        this.f26368Y = 1;
        this.f26373b0 = formattedText;
        this.f26362S = video;
        this.f26357N = j;
        this.f26358O = j2;
        this.f26359P = messageSender;
        this.f26360Q = i;
        m13565C0(video.minithumbnail);
        C6246h D5 = C4779t2.m25704D5(q6Var, video.thumbnail);
        this.f26372b = D5;
        if (D5 != null) {
            D5.m20897s0(1);
            this.f26372b.m20917g0(true);
        }
        TdApi.File file = video.video;
        this.f26374c = file;
        C6261s q = C4630f0.m26728q(q6Var, file);
        this.f26375c0 = q;
        q.m20897s0(1);
        int i2 = video.width;
        this.f26369Z = i2;
        int i3 = video.height;
        this.f26371a0 = i3;
        if (i2 == 0 || i3 == 0) {
            int i4 = C1357a0.m37541i(100.0f);
            this.f26371a0 = i4;
            this.f26369Z = i4;
        }
        C6883g1 g1Var = new C6883g1(aVar, q6Var, 4, true, j, j2);
        this.f26356M = g1Var;
        g1Var.m18667I0();
        if (z) {
            this.f26356M.m18624i0(R.drawable.baseline_play_arrow_36_white);
        }
        this.f26356M.m18606r0(true);
        this.f26356M.m18661L0(true);
        this.f26356M.m18590z0(R.drawable.baseline_play_arrow_36_white);
        this.f26356M.m18616m0(this.f26374c);
    }

    public C8112b(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, long j, long j2, TdApi.MessageSender messageSender, int i, TdApi.MessageVideo messageVideo, boolean z) {
        this(aVar, q6Var, j, j2, messageSender, i, messageVideo.video, messageVideo.caption, z);
    }

    public C8112b(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, long j, TdApi.ProfilePhoto profilePhoto) {
        this.f26366W = aVar;
        this.f26367X = q6Var;
        this.f26368Y = 6;
        this.f26359P = new TdApi.MessageSenderUser(j);
        this.f26377e0 = profilePhoto;
        int i = C1357a0.m37541i(640.0f);
        this.f26371a0 = i;
        this.f26369Z = i;
        TdApi.File file = profilePhoto.small;
        if (file != null) {
            C6246h hVar = new C6246h(q6Var, file);
            this.f26372b = hVar;
            hVar.m20917g0(true);
            this.f26372b.mo20767t0(C9903a.getDefaultAvatarCacheSize());
            this.f26372b.m20897s0(1);
        }
        TdApi.File file2 = profilePhoto.big;
        if (file2 != null) {
            this.f26374c = file2;
            C6246h hVar2 = new C6246h(q6Var, file2);
            this.f26375c0 = hVar2;
            hVar2.m20917g0(true);
            this.f26375c0.m20897s0(1);
            C6883g1 g1Var = new C6883g1(aVar, q6Var, 1, true, 0L, 0L);
            this.f26356M = g1Var;
            g1Var.m18667I0();
            this.f26356M.m18616m0(profilePhoto.big);
        }
    }

    public C8112b(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, long j, TdApi.ChatPhotoInfo chatPhotoInfo) {
        this(aVar, q6Var, j, 0L, new TdApi.ChatPhoto(0L, 0, chatPhotoInfo.minithumbnail, new TdApi.PhotoSize[]{new TdApi.PhotoSize("s", chatPhotoInfo.small, 160, 160, null), new TdApi.PhotoSize("m", chatPhotoInfo.big, 640, 640, null)}, null));
    }

    public C8112b(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, long j, long j2, TdApi.ChatPhoto chatPhoto) {
        this.f26366W = aVar;
        this.f26367X = q6Var;
        this.f26368Y = 7;
        this.f26357N = j;
        this.f26358O = j2;
        this.f26359P = C7316a.m17049l(j) ? new TdApi.MessageSenderUser(q6Var.m2494d4(j)) : new TdApi.MessageSenderChat(j);
        this.f26360Q = chatPhoto.addedDate;
        this.f26378f0 = chatPhoto;
        m13565C0(chatPhoto.minithumbnail);
        TdApi.PhotoSize I0 = C7321e.m17002I0(chatPhoto.sizes);
        TdApi.PhotoSize B0 = C7321e.m17016B0(chatPhoto.sizes);
        if (I0 != null) {
            C6246h hVar = new C6246h(q6Var, I0.photo);
            this.f26372b = hVar;
            hVar.m20917g0(true);
            this.f26372b.mo20767t0(C9903a.getDefaultAvatarCacheSize());
            this.f26372b.m20897s0(1);
        }
        if (B0 != null) {
            TdApi.File file = B0.photo;
            this.f26374c = file;
            C6246h hVar2 = new C6246h(q6Var, file);
            this.f26375c0 = hVar2;
            hVar2.m20917g0(true);
            this.f26375c0.m20897s0(1);
            C6883g1 g1Var = new C6883g1(aVar, q6Var, 1, true, this.f26357N, j2);
            this.f26356M = g1Var;
            g1Var.m18667I0();
            this.f26356M.m18616m0(B0.photo);
        }
        this.f26371a0 = 640;
        this.f26369Z = 640;
        m13537Q0(q6Var.m2183wb(j));
    }

    public C8112b(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, C6253l lVar) {
        this.f26366W = aVar;
        this.f26367X = q6Var;
        int i = lVar.m20843e1() ? 4 : 3;
        this.f26368Y = i;
        this.f26369Z = lVar.m20849Y0();
        this.f26371a0 = lVar.m20862L0();
        this.f26365V = lVar;
        if (!lVar.m20846b1()) {
            C6253l lVar2 = new C6253l(lVar);
            this.f26372b = lVar2;
            lVar2.m20897s0(1);
            ((C6253l) this.f26372b).m20836l1(lVar.m20859O0());
        }
        int o0 = m13490o0();
        if (lVar.m20843e1()) {
            if (this.f26375c0 == null) {
                C6261s sVar = new C6261s(q6Var, lVar.m20910k());
                this.f26375c0 = sVar;
                sVar.m20897s0(1);
                this.f26375c0.mo20874q0(lVar.m20859O0());
                ((C6261s) this.f26375c0).m20771I0(o0);
                ((C6261s) this.f26375c0).m20772H0(lVar.m20858P0() > 0 ? lVar.m20858P0() : 0L);
            }
            C6883g1 g1Var = new C6883g1(aVar, q6Var, 4, false, 0L, 0L);
            this.f26356M = g1Var;
            g1Var.m18667I0();
            this.f26356M.m18602t0();
            this.f26356M.m18624i0(R.drawable.baseline_play_arrow_36_white);
            this.f26356M.m18616m0(lVar.m20910k());
        } else if (lVar.m20846b1()) {
            C6253l lVar3 = new C6253l(lVar);
            this.f26375c0 = lVar3;
            lVar3.m20897s0(1);
            this.f26375c0.mo20874q0(lVar.mo20873x());
        } else if (i == 5) {
            C6505k kVar = new C6505k(q6Var, lVar.mo20875q());
            this.f26376d0 = kVar;
            kVar.m20297I(1);
        } else {
            C6253l lVar4 = new C6253l(lVar);
            this.f26375c0 = lVar4;
            lVar4.m20897s0(1);
            ((C6253l) this.f26375c0).m20837k1(false);
        }
        C6246h hVar = this.f26375c0;
        if (hVar != null) {
            hVar.mo20767t0(o0);
            this.f26375c0.m20908l0();
            this.f26375c0.m20926b0();
            this.f26375c0.m20913i0();
        }
        m13569A0(this.f26365V.m20899r());
        m13470y0(this.f26365V.m20912j());
        m13561E0(this.f26365V.m20896t(), true);
    }
}
