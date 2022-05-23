package qd;

import android.graphics.Canvas;
import android.view.View;
import ce.a0;
import gb.g;
import hd.n5;
import hd.o7;
import hd.s4;
import hd.t2;
import ie.f0;
import ie.t;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import je.l0;
import ld.h;
import ld.i;
import ld.k;
import ld.l;
import ld.s;
import md.j;
import ne.g1;
import ob.e;
import oc.v0;
import od.o;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.a;
import pd.c;
import sd.f;
import zd.o6;

public class b implements f0, g.a {
    public g1 M;
    public boolean N;
    public long O;
    public long P;
    public TdApi.MessageSender Q;
    public int R;
    public TdApi.Photo S;
    public TdApi.Video T;
    public TdApi.VideoNote U;
    public TdApi.Animation V;
    public l W;
    public final a X;
    public final o6 Y;
    public final int Z;
    public h f21542a;
    public int f21543a0;
    public h f21544b;
    public int f21545b0;
    public TdApi.File f21546c;
    public TdApi.FormattedText f21547c0;
    public h f21548d0;
    public j f21549e0;
    public TdApi.ProfilePhoto f21550f0;
    public TdApi.ChatPhoto f21551g0;
    public s4 f21552h0;
    public h f21553i0;
    public h f21554j0;
    public h f21555k0;
    public g f21556l0;
    public TdApi.Message f21557m0;
    public k f21558n0;
    public f f21559o0;
    public g f21560p0;
    public l0[] f21561q0;
    public n5 f21562r0;

    public b(a aVar, o6 o6Var, TdApi.Photo photo, TdApi.FormattedText formattedText) {
        this(aVar, o6Var, 0L, 0L, photo, false);
        this.f21547c0 = formattedText;
    }

    public static b U0(a aVar, o6 o6Var, TdApi.Animation animation, TdApi.FormattedText formattedText) {
        return new b(aVar, o6Var, animation, formattedText);
    }

    public static b V0(a aVar, o6 o6Var, TdApi.Message message) {
        TdApi.ChatEventPhotoChanged chatEventPhotoChanged;
        TdApi.ChatPhoto chatPhoto;
        if (message == null) {
            return null;
        }
        int constructor = message.content.getConstructor();
        if (constructor == -1851395174) {
            return new b(aVar, o6Var, message.chatId, message.f19946id, message.senderId, message.date, (TdApi.MessagePhoto) message.content).B0(message);
        }
        if (constructor == -813415093) {
            return new b(aVar, o6Var, message.chatId, message.f19946id, ((TdApi.MessageChatChangePhoto) message.content).photo).B0(message);
        }
        if (constructor == 0) {
            o7 o7Var = (o7) message.content;
            if (o7Var.f13337b && o7Var.f13336a.action.getConstructor() == -811572541 && !((chatPhoto = (chatEventPhotoChanged = (TdApi.ChatEventPhotoChanged) o7Var.f13336a.action).oldPhoto) == null && chatEventPhotoChanged.newPhoto == null)) {
                long j10 = message.chatId;
                TdApi.ChatPhoto chatPhoto2 = chatEventPhotoChanged.newPhoto;
                return new b(aVar, o6Var, j10, 0L, chatPhoto2 != null ? chatPhoto2 : chatPhoto).Q0(new TdApi.MessageSenderUser(e.U0(o7Var.f13336a.memberId))).M0(o7Var.f13336a.date);
            }
        } else if (constructor == 963323014) {
            return new b(aVar, o6Var, message.chatId, message.f19946id, message.senderId, message.date, (TdApi.MessageVideoNote) message.content).B0(message);
        } else {
            if (constructor == 1306939396) {
                return new b(aVar, o6Var, message.chatId, message.f19946id, message.senderId, message.date, (TdApi.MessageAnimation) message.content).B0(message);
            }
            if (constructor == 2021281344) {
                return new b(aVar, o6Var, message.chatId, message.f19946id, message.senderId, message.date, (TdApi.MessageVideo) message.content, true).B0(message);
            }
        }
        return null;
    }

    public static b W0(a aVar, o6 o6Var, TdApi.Photo photo, TdApi.FormattedText formattedText) {
        return new b(aVar, o6Var, photo, formattedText);
    }

    public static b X0(a aVar, o6 o6Var, TdApi.Video video, TdApi.FormattedText formattedText) {
        return new b(aVar, o6Var, video, formattedText, true);
    }

    public static boolean c0(int i10) {
        return i10 == 3 || i10 == 4 || i10 == 5;
    }

    public static b k(b bVar) {
        return l(bVar, true);
    }

    public static b l(b bVar, boolean z10) {
        if (bVar == null) {
            return null;
        }
        int i10 = bVar.Z;
        if (i10 == 0) {
            b bVar2 = new b(bVar.X, bVar.Y, bVar.O, bVar.P, bVar.S);
            bVar2.Q = bVar.Q;
            bVar2.R = bVar.R;
            bVar2.f21547c0 = bVar.f21547c0;
            bVar2.f21557m0 = bVar.f21557m0;
            return bVar2;
        } else if (i10 == 1) {
            return new b(bVar.X, bVar.Y, bVar.O, bVar.P, bVar.Q, bVar.R, bVar.T, bVar.f21547c0, z10).B0(bVar.f21557m0);
        } else {
            if (i10 == 2) {
                return new b(bVar.X, bVar.Y, bVar.O, bVar.P, bVar.Q, bVar.R, bVar.V, bVar.f21547c0).B0(bVar.f21557m0);
            }
            if (i10 == 6) {
                return new b(bVar.X, bVar.Y, ((TdApi.MessageSenderUser) bVar.Q).userId, bVar.f21550f0);
            }
            if (i10 != 7) {
                return null;
            }
            return new b(bVar.X, bVar.Y, bVar.O, bVar.P, bVar.f21551g0);
        }
    }

    public static int o0() {
        return 1280;
    }

    public int A() {
        double d10;
        double e10;
        l lVar = this.W;
        if (lVar == null || lVar.j() == null) {
            return this.f21545b0;
        }
        c j10 = this.W.j();
        if (v0.x1(j10.h())) {
            d10 = this.f21543a0;
            e10 = j10.f();
        } else {
            d10 = this.f21545b0;
            e10 = j10.e();
        }
        return (int) (d10 * e10);
    }

    public k A0(a aVar) {
        this.W.a0(aVar);
        if (aVar == null || aVar.k()) {
            this.f21558n0 = null;
        } else {
            aVar.n(v0.t1(this.W.q()), this.W.K0());
            k kVar = new k(this.f21548d0, aVar.l(), aVar.i());
            this.f21558n0 = kVar;
            kVar.s0(1);
            this.f21558n0.q0(this.W.D());
            this.f21558n0.Y(v());
            this.f21558n0.n0(C());
        }
        return this.f21558n0;
    }

    public h B() {
        return this.f21542a;
    }

    public final b B0(TdApi.Message message) {
        this.f21557m0 = message;
        return this;
    }

    public f C() {
        f fVar = this.f21559o0;
        if (fVar == null || fVar.i()) {
            return null;
        }
        return this.f21559o0;
    }

    public final void C0(TdApi.Minithumbnail minithumbnail) {
        if (minithumbnail != null) {
            i iVar = new i(minithumbnail);
            this.f21542a = iVar;
            iVar.s0(1);
            this.f21542a.g0(true);
            return;
        }
        this.f21542a = null;
    }

    public long D() {
        int i10 = this.Z;
        if (i10 == 6) {
            return this.f21550f0.f19955id;
        }
        if (i10 == 7) {
            return this.f21551g0.f19911id;
        }
        throw new UnsupportedOperationException();
    }

    public void D0(boolean z10) {
        h hVar = this.f21542a;
        if (hVar != null) {
            hVar.Z(z10);
        }
        h hVar2 = this.f21544b;
        if (hVar2 != null) {
            hVar2.Z(z10);
        }
        h hVar3 = this.f21548d0;
        if (hVar3 != null) {
            hVar3.Z(z10);
        }
    }

    public float E() {
        l lVar = this.W;
        if (lVar != null) {
            return lVar.O0();
        }
        return 0.0f;
    }

    public boolean E0(f fVar, boolean z10) {
        if (fVar != null && fVar.i()) {
            fVar = null;
        }
        boolean n02 = this.W.n0(fVar);
        k kVar = this.f21558n0;
        if (kVar != null) {
            kVar.n0(fVar);
        }
        h hVar = this.f21548d0;
        if (hVar != null) {
            hVar.n0(fVar);
        }
        h hVar2 = this.f21544b;
        if (hVar2 != null) {
            hVar2.n0(fVar);
        }
        if (z10) {
            this.f21559o0 = fVar;
        }
        return n02;
    }

    public h F() {
        return this.f21544b;
    }

    public void F0(int i10) {
        h hVar = this.f21548d0;
        if (hVar instanceof l) {
            ((l) hVar).l1(i10);
        } else {
            hVar.q0(i10);
        }
        h hVar2 = this.f21544b;
        if (hVar2 instanceof l) {
            ((l) hVar2).l1(i10);
        }
    }

    public n5 G() {
        return this.f21562r0;
    }

    public void G0(h hVar) {
        this.f21544b = hVar;
    }

    public TdApi.File H() {
        if (I() == null) {
            return null;
        }
        if (t2.T2(this.f21546c)) {
            return this.f21546c;
        }
        g1 g1Var = this.M;
        if (g1Var == null || !g1Var.H()) {
            return null;
        }
        return this.M.u();
    }

    public void H0(h.c cVar) {
        if (this.Z == 4) {
            this.W.r0(cVar);
        }
    }

    public String I() {
        int i10 = this.Z;
        if (i10 == 0) {
            return "image/jpeg";
        }
        if (i10 == 1) {
            TdApi.Video video = this.T;
            if (video == null) {
                return null;
            }
            String str = video.mimeType;
            return (ib.i.i(str) || !str.startsWith("video/")) ? "video/*" : str;
        } else if (i10 == 2) {
            TdApi.Animation animation = this.V;
            if (animation == null) {
                return null;
            }
            String str2 = animation.mimeType;
            return !ib.i.i(str2) ? (str2.startsWith("video/") || str2.equals("image/gif")) ? str2 : "video/*" : "video/*";
        } else if (i10 == 6 || i10 == 7) {
            return "image/jpeg";
        } else {
            return null;
        }
    }

    public void I0(int i10) {
        h hVar = this.f21542a;
        if (hVar != null) {
            hVar.s0(i10);
        }
        h hVar2 = this.f21544b;
        if (hVar2 != null) {
            hVar2.s0(i10);
        }
        h hVar3 = this.f21548d0;
        if (hVar3 != null) {
            hVar3.s0(i10);
        }
        j jVar = this.f21549e0;
        if (jVar != null) {
            jVar.I(i10);
        }
    }

    public long J() {
        return this.O;
    }

    public void J0(n5 n5Var) {
        this.f21562r0 = n5Var;
        h hVar = this.f21544b;
        if (hVar != null) {
            hVar.f0();
            this.f21544b.d0();
        }
    }

    public l K() {
        return this.W;
    }

    public void K0(g1.c cVar) {
        g1 g1Var = this.M;
        if (g1Var != null) {
            g1Var.L0(cVar);
        }
    }

    public s4 L() {
        return this.f21552h0;
    }

    public void L0(int i10) {
        h hVar = this.f21548d0;
        if (hVar != null) {
            hVar.t0(i10);
        }
    }

    public TdApi.MessageSender M() {
        return this.Q;
    }

    public b M0(int i10) {
        this.R = i10;
        return this;
    }

    public TdApi.Video N() {
        return this.T;
    }

    public b N0(s4 s4Var) {
        this.f21552h0 = s4Var;
        return this;
    }

    public int O() {
        l lVar = this.W;
        if (lVar != null) {
            return lVar.A();
        }
        return 0;
    }

    public b O0(TdApi.Message message) {
        this.f21557m0 = message;
        this.O = message.chatId;
        this.P = message.f19946id;
        return this;
    }

    public TdApi.File P() {
        return this.f21546c;
    }

    public b P0(long j10, long j11) {
        this.O = j10;
        this.P = j11;
        return this;
    }

    public j Q() {
        return this.f21549e0;
    }

    public b Q0(TdApi.MessageSender messageSender) {
        this.Q = messageSender;
        return this;
    }

    public h R() {
        return this.f21548d0;
    }

    public void R0(int i10) {
        l lVar = this.W;
        if (lVar != null) {
            lVar.w0(i10);
        }
    }

    public h S(boolean z10) {
        k kVar = this.f21558n0;
        return (kVar == null || !z10) ? this.f21548d0 : kVar;
    }

    public o6 S0() {
        return this.Y;
    }

    public h T(int i10, boolean z10) {
        h hVar;
        h hVar2 = this.f21544b;
        TdApi.File k10 = hVar2 != null ? hVar2.k() : null;
        if (k10 == null && ((hVar = this.f21554j0) == null || (hVar instanceof i))) {
            if (x() != null && this.M.H()) {
                k10 = this.M.u();
            }
            g1 g1Var = this.M;
            if (g1Var != null && !g1Var.H()) {
                this.M.l(this.O);
            }
        }
        h hVar3 = this.f21554j0;
        if (hVar3 == null || (k10 != null && (hVar3 instanceof i))) {
            if (k10 == null) {
                if (this.f21542a != null) {
                    i iVar = new i(this.f21542a.i(), true);
                    this.f21554j0 = iVar;
                    iVar.s0(2);
                    i iVar2 = new i(this.f21542a.i(), false);
                    this.f21555k0 = iVar2;
                    iVar2.s0(1);
                    return z10 ? this.f21555k0 : this.f21554j0;
                }
                TdApi.Photo photo = this.S;
                TdApi.PhotoSize J0 = photo != null ? e.J0(photo) : null;
                if (J0 != null) {
                    k10 = J0.photo;
                } else {
                    h hVar4 = this.f21548d0;
                    k10 = hVar4 != null ? hVar4.k() : null;
                }
            }
            if (k10 == null) {
                return null;
            }
            h hVar5 = new h(this.Y, k10);
            this.f21554j0 = hVar5;
            hVar5.g0(true);
            this.f21554j0.s0(2);
            this.f21554j0.k0();
            h hVar6 = this.f21544b;
            if (hVar6 != null && hVar6.z() == wc.a.getDefaultAvatarCacheSize()) {
                i10 = wc.a.getDefaultAvatarCacheSize();
            }
            this.f21554j0.t0(i10);
            h hVar7 = new h(this.Y, k10);
            this.f21555k0 = hVar7;
            hVar7.g0(true);
            this.f21555k0.s0(1);
            this.f21555k0.k0();
            this.f21555k0.t0(i10);
        }
        return z10 ? this.f21555k0 : this.f21554j0;
    }

    public boolean T0() {
        return this.W.q1();
    }

    public h U() {
        if (this.f21542a == null) {
            return null;
        }
        if (this.f21553i0 == null) {
            i iVar = new i(this.f21542a.i(), true);
            this.f21553i0 = iVar;
            iVar.s0(2);
        }
        return this.f21553i0;
    }

    public long V() {
        if (q0()) {
            return this.W.J0();
        }
        return -1L;
    }

    public long W() {
        if (q0()) {
            return this.W.P0();
        }
        return -1L;
    }

    public int X() {
        return this.Z;
    }

    public long Y(boolean z10, TimeUnit timeUnit) {
        int i10 = this.Z;
        if (i10 == 1) {
            return timeUnit.convert(this.T.duration, TimeUnit.SECONDS);
        }
        if (i10 == 2) {
            return timeUnit.convert(this.V.duration, TimeUnit.SECONDS);
        }
        if (i10 == 4) {
            return this.W.T0(z10, timeUnit);
        }
        if (i10 != 8) {
            return 0L;
        }
        return timeUnit.convert(this.U.duration, TimeUnit.SECONDS);
    }

    public void Y0() {
        n5 n5Var = this.f21562r0;
        if (n5Var != null) {
            n5Var.w8();
        }
    }

    public int Z() {
        double d10;
        double e10;
        l lVar = this.W;
        if (lVar == null || lVar.j() == null) {
            return this.f21543a0;
        }
        c j10 = this.W.j();
        if (v0.x1(j10.h())) {
            d10 = this.f21545b0;
            e10 = j10.f();
        } else {
            d10 = this.f21543a0;
            e10 = j10.e();
        }
        return (int) (d10 * e10);
    }

    @Override
    public void a() {
        g gVar = this.f21560p0;
        if (gVar != null) {
            Iterator<View> it = gVar.n().iterator();
            while (it.hasNext()) {
                View next = it.next();
                if (next instanceof cd.a) {
                    ((cd.a) next).y(this);
                } else if (next.getParent() instanceof o) {
                    ((o) next.getParent()).m0(this);
                }
            }
        }
        g gVar2 = this.f21556l0;
        if (gVar2 != null) {
            Iterator<View> it2 = gVar2.n().iterator();
            while (it2.hasNext()) {
                View next2 = it2.next();
                if (next2 instanceof g.a) {
                    ((g.a) next2).a();
                }
            }
        }
    }

    public boolean a0() {
        return e0() && n0();
    }

    public void b(View view) {
        if (this.f21556l0 == null) {
            this.f21556l0 = new g();
        }
        this.f21556l0.j(view);
    }

    public boolean b0() {
        return c0(this.Z) && v0.w1(((float) this.W.x()) + E());
    }

    public void c(View view) {
        e(view, null, null);
    }

    @Override
    public long d() {
        return this.P;
    }

    public boolean d0() {
        int i10 = this.Z;
        if (i10 == 2 || i10 == 5) {
            return !n0();
        }
        return false;
    }

    public void e(View view, g1.c cVar, h.c cVar2) {
        g1 x10 = view != null ? x() : this.M;
        if (this.f21560p0 == null) {
            g gVar = new g();
            this.f21560p0 = gVar;
            gVar.r(this);
            if (x10 != null) {
                x10.R0(this.f21560p0);
            }
        }
        if (this.f21560p0.j(view) && x10 != null) {
            x10.R();
        }
        if (!(cVar == null || x10 == null)) {
            x10.L0(cVar);
        }
        H0(cVar2);
    }

    public boolean e0() {
        int i10 = this.Z;
        return i10 == 2 || i10 == 5;
    }

    @Override
    public int f() {
        return this.R;
    }

    public boolean f0() {
        g1 g1Var;
        TdApi.File file = this.f21546c;
        return file == null || t2.T2(file) || ((g1Var = this.M) != null && g1Var.H());
    }

    public boolean g() {
        TdApi.Message message = this.f21557m0;
        if (message != null) {
            return this.Y.H2(message);
        }
        int i10 = this.Z;
        if (i10 == 6) {
            long j10 = ((TdApi.MessageSenderUser) this.Q).userId;
            return this.Y.F2(ob.a.c(j10)) || this.Y.e2().y2(j10);
        } else if (i10 != 7) {
            return false;
        } else {
            long j11 = this.O;
            return j11 != 0 && this.Y.F2(j11);
        }
    }

    public boolean g0() {
        g1 g1Var = this.M;
        return g1Var != null && g1Var.I();
    }

    @Override
    public TdApi.Message getMessage() {
        return this.f21557m0;
    }

    public boolean h() {
        TdApi.Message message = this.f21557m0;
        if (message != null) {
            return message.canBeSaved;
        }
        int i10 = this.Z;
        if (i10 != 7) {
            return i10 == 3 || i10 == 4 || i10 == 5 || H() != null;
        }
        TdApi.Chat W2 = this.Y.W2(this.O);
        return W2 != null && !W2.hasProtectedContent;
    }

    public boolean h0() {
        int i10 = this.Z;
        return i10 == 0 || i10 == 3;
    }

    public boolean i() {
        TdApi.Message message = this.f21557m0;
        if (message != null) {
            return message.canBeForwarded;
        }
        return H() != null;
    }

    public boolean i0() {
        return c0(this.Z) && v0.w1(E());
    }

    public boolean j() {
        if (!(this.f21548d0 instanceof s) || this.W.P0() == ((s) this.f21548d0).D0()) {
            return false;
        }
        s sVar = new s(this.Y, this.W.k());
        this.f21548d0 = sVar;
        sVar.s0(1);
        this.f21548d0.q0(this.W.O0());
        ((s) this.f21548d0).I0(o0());
        s sVar2 = (s) this.f21548d0;
        long j10 = 0;
        if (this.W.P0() > 0) {
            j10 = this.W.P0();
        }
        sVar2.H0(j10);
        if (!this.W.b1()) {
            l lVar = new l(this.W);
            this.f21544b = lVar;
            lVar.s0(1);
            ((l) this.f21544b).l1(this.W.O0());
        }
        return true;
    }

    public boolean j0() {
        int i10 = this.Z;
        if (i10 == 1) {
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        return n0();
    }

    public boolean k0() {
        return c0(this.Z) && v0.x1(this.W.x());
    }

    public boolean l0() {
        return this.f21562r0 != null;
    }

    public org.drinkless.td.libcore.telegram.TdApi.InputMessageContent m(org.drinkless.td.libcore.telegram.TdApi.FormattedText r14) {
        throw new UnsupportedOperationException("Method not decompiled: qd.b.m(org.drinkless.td.libcore.telegram.TdApi$FormattedText):org.drinkless.td.libcore.telegram.TdApi$InputMessageContent");
    }

    public boolean m0() {
        n5 n5Var = this.f21562r0;
        return n5Var != null && n5Var.f6();
    }

    public void n() {
        if (this.f21558n0 != null) {
            File file = new File(this.f21558n0.q());
            if (file.exists() && !file.delete()) {
                Log.w("Unable to delete filtered file", new Object[0]);
            }
        }
        v0.T(new File(this.W.q()));
        List<File> G0 = this.W.G0();
        if (G0 != null) {
            for (File file2 : G0) {
                v0.T(file2);
            }
            G0.clear();
        }
    }

    public boolean n0() {
        int i10 = this.Z;
        if (i10 != 1) {
            if (i10 == 2) {
                return ib.i.c(this.V.mimeType, "video/mp4");
            }
            if (i10 != 4) {
                return false;
            }
        }
        return true;
    }

    public void o(View view) {
        g gVar = this.f21556l0;
        if (gVar != null) {
            gVar.l(view);
        }
    }

    public void p(View view) {
        g1 g1Var;
        g gVar = this.f21560p0;
        if (gVar != null && gVar.l(view) && (g1Var = this.M) != null) {
            g1Var.R();
        }
    }

    public boolean p0() {
        l lVar = this.W;
        return (lVar != null && lVar.p1()) || this.Z == 2;
    }

    public void q(boolean z10) {
        g1 g1Var = this.M;
        if (g1Var != null && this.Z != 4) {
            if (this.O == 0 || z10) {
                g1Var.n();
            } else if (!t2.T2(this.f21546c)) {
                this.M.l(this.O);
            }
        }
    }

    public boolean q0() {
        l lVar = this.W;
        return lVar != null && lVar.a1();
    }

    public <T extends View & t> void r(T t10, Canvas canvas, int i10, int i11, int i12, int i13) {
        g1 g1Var = this.M;
        if (g1Var != null) {
            g1Var.h0(i10, i11, i12, i13);
            this.M.o(t10, canvas);
        }
    }

    public boolean r0(View view, float f10, float f11) {
        if (x() == null) {
            return false;
        }
        if (!f0()) {
            return this.M.X(view, f10, f11);
        }
        int d10 = this.M.d();
        int e10 = this.M.e();
        int i10 = a0.i(28.0f);
        if (f10 < d10 - i10 || f10 > d10 + i10 || f11 < e10 - i10 || f11 > e10 + i10) {
            return false;
        }
        return this.M.X(view, f10, f11);
    }

    public TdApi.FormattedText s() {
        if (c0(this.Z)) {
            return this.W.H0(false, false);
        }
        TdApi.FormattedText formattedText = this.f21547c0;
        if (formattedText == null || ib.i.i(formattedText.text)) {
            return null;
        }
        return this.f21547c0;
    }

    public void s0() {
        if (x() != null) {
            g gVar = this.f21560p0;
            if (gVar == null || !gVar.g()) {
                this.M.V(false);
            }
        }
    }

    public l0[] t() {
        if (this.f21561q0 == null) {
            this.f21561q0 = l0.F(this.Y, this.f21547c0, null);
        }
        return this.f21561q0;
    }

    public boolean t0(View view) {
        return x() != null && this.M.W(view);
    }

    public float u() {
        g1 g1Var = this.M;
        if (g1Var != null) {
            return g1Var.A();
        }
        return 0.0f;
    }

    public boolean u0(View view, float f10, float f11) {
        return x() != null && this.M.X(view, f10, f11);
    }

    public c v() {
        l lVar = this.W;
        if (lVar != null) {
            return lVar.j();
        }
        return null;
    }

    public int v0() {
        int g12 = this.W.g1();
        F0(g12);
        return g12;
    }

    public int w() {
        TdApi.File file = this.f21546c;
        if (file != null) {
            return file.f19913id;
        }
        return 0;
    }

    public b w0(TdApi.FormattedText formattedText) {
        if (c0(this.Z)) {
            this.W.h1(formattedText);
        } else {
            this.f21547c0 = formattedText;
        }
        return this;
    }

    public g1 x() {
        if (this.M == null && this.N) {
            g1 g1Var = new g1(this.X, this.Y, 4, false, 0L, 0L);
            this.M = g1Var;
            g1Var.M0();
            this.M.v0();
            this.M.k0(R.drawable.baseline_play_arrow_36_white);
            this.M.o0(this.W.k());
            g gVar = this.f21560p0;
            if (gVar != null) {
                this.M.R0(gVar);
            }
            this.N = false;
        }
        return this.M;
    }

    public void x0(float f10) {
        g1 g1Var = this.M;
        if (g1Var != null) {
            g1Var.J0(f10);
        }
    }

    public k y() {
        return this.f21558n0;
    }

    public void y0(c cVar) {
        this.W.Y(cVar);
        k kVar = this.f21558n0;
        if (kVar != null) {
            kVar.Y(cVar);
        }
        h hVar = this.f21548d0;
        if (hVar != null) {
            hVar.Y(cVar);
        }
        h hVar2 = this.f21544b;
        if (hVar2 != null) {
            hVar2.Y(cVar);
        }
    }

    public a z() {
        return this.W.r();
    }

    public boolean z0(int i10, int i11) {
        boolean z10;
        l lVar = this.W;
        if (lVar != null) {
            z10 = v0.x1(lVar.x());
        } else {
            h hVar = this.f21548d0;
            z10 = hVar instanceof s ? v0.x1(((s) hVar).G0()) : false;
        }
        if (z10) {
            i11 = i10;
            i10 = i11;
        }
        if (this.f21543a0 == i10 && this.f21545b0 == i11) {
            return false;
        }
        this.f21543a0 = i10;
        this.f21545b0 = i11;
        return true;
    }

    public b(a aVar, o6 o6Var, long j10, long j11, TdApi.Photo photo) {
        this(aVar, o6Var, j10, j11, photo, false);
    }

    public b(a aVar, o6 o6Var, long j10, long j11, TdApi.Photo photo, boolean z10) {
        this.Z = 0;
        this.X = aVar;
        this.Y = o6Var;
        this.S = photo;
        this.O = j10;
        this.P = j11;
        TdApi.PhotoSize m10 = hd.f0.m(photo.sizes);
        TdApi.PhotoSize p10 = hd.f0.p(photo.sizes, m10);
        if (p10 != null) {
            this.f21543a0 = p10.width;
            this.f21545b0 = p10.height;
        } else if (m10 != null) {
            this.f21543a0 = m10.width;
            this.f21545b0 = m10.height;
        } else {
            this.f21543a0 = 0;
            this.f21545b0 = 0;
        }
        if (this.f21543a0 == 0 || this.f21545b0 == 0) {
            int i10 = a0.i(100.0f);
            this.f21545b0 = i10;
            this.f21543a0 = i10;
        }
        C0(photo.minithumbnail);
        if (m10 != null) {
            h hVar = new h(o6Var, m10.photo);
            this.f21544b = hVar;
            hVar.s0(1);
            this.f21544b.g0(true);
            if (z10) {
                this.f21544b.x0();
            }
        } else {
            this.f21544b = null;
        }
        this.f21546c = p10 != null ? p10.photo : null;
        if (p10 != null) {
            h hVar2 = new h(o6Var, p10.photo);
            this.f21548d0 = hVar2;
            hVar2.s0(1);
            this.f21548d0.k0();
            this.f21548d0.g0(true);
            if (z10) {
                this.f21548d0.x0();
            }
            hd.f0.i(this.f21548d0, p10);
        } else {
            this.f21548d0 = null;
        }
        if (p10 != null) {
            g1 g1Var = new g1(aVar, o6Var, 1, true, j10, j11);
            this.M = g1Var;
            g1Var.M0();
            this.M.o0(p10.photo);
        }
    }

    public b(a aVar, o6 o6Var, long j10, long j11, TdApi.MessageSender messageSender, int i10, TdApi.MessagePhoto messagePhoto) {
        this(aVar, o6Var, j10, j11, messagePhoto.photo);
        this.Q = messageSender;
        this.R = i10;
        this.f21547c0 = messagePhoto.caption;
    }

    public b(a aVar, o6 o6Var, long j10, long j11, TdApi.MessageSender messageSender, int i10, TdApi.MessageAnimation messageAnimation) {
        this(aVar, o6Var, j10, j11, messageSender, i10, messageAnimation.animation, messageAnimation.caption);
    }

    public b(a aVar, o6 o6Var, TdApi.Animation animation, TdApi.FormattedText formattedText) {
        this(aVar, o6Var, 0L, 0L, (TdApi.MessageSender) null, 0, animation, formattedText);
    }

    public b(a aVar, o6 o6Var, long j10, long j11, TdApi.MessageSender messageSender, int i10, TdApi.Animation animation, TdApi.FormattedText formattedText) {
        this.X = aVar;
        this.Y = o6Var;
        this.Z = 2;
        this.f21547c0 = formattedText;
        this.V = animation;
        this.O = j10;
        this.P = j11;
        this.Q = messageSender;
        this.R = i10;
        C0(animation.minithumbnail);
        h D5 = t2.D5(o6Var, animation.thumbnail);
        this.f21544b = D5;
        if (D5 != null) {
            D5.s0(1);
            this.f21544b.g0(true);
        }
        this.f21546c = animation.animation;
        j jVar = new j(o6Var, animation);
        this.f21549e0 = jVar;
        jVar.I(1);
        if (!(j10 == 0 || j11 == 0 || he.i.c2().z2())) {
            this.f21549e0.D(true);
        }
        int i11 = animation.width;
        this.f21543a0 = i11;
        int i12 = animation.height;
        this.f21545b0 = i12;
        if (i11 == 0 || i12 == 0) {
            int i13 = a0.i(100.0f);
            this.f21545b0 = i13;
            this.f21543a0 = i13;
        }
        g1 g1Var = new g1(aVar, o6Var, 32, true, j10, j11);
        this.M = g1Var;
        g1Var.M0();
        this.M.o0(this.f21546c);
    }

    public b(a aVar, o6 o6Var, long j10, long j11, TdApi.MessageSender messageSender, int i10, TdApi.MessageVideoNote messageVideoNote) {
        this.X = aVar;
        this.Y = o6Var;
        this.Z = 8;
        TdApi.VideoNote videoNote = messageVideoNote.videoNote;
        this.U = videoNote;
        this.O = j10;
        this.P = j11;
        this.Q = messageSender;
        this.R = i10;
        C0(videoNote.minithumbnail);
        TdApi.Thumbnail thumbnail = messageVideoNote.videoNote.thumbnail;
        if (thumbnail != null) {
            h D5 = t2.D5(o6Var, thumbnail);
            this.f21544b = D5;
            if (D5 != null) {
                D5.g0(true);
                this.f21544b.s0(1);
            }
            TdApi.Thumbnail thumbnail2 = messageVideoNote.videoNote.thumbnail;
            this.f21543a0 = thumbnail2.width;
            this.f21545b0 = thumbnail2.height;
        }
        TdApi.File file = messageVideoNote.videoNote.video;
        this.f21546c = file;
        j jVar = new j(o6Var, file, 2);
        this.f21549e0 = jVar;
        jVar.I(1);
        if (!(j10 == 0 || j11 == 0 || he.i.c2().z2())) {
            this.f21549e0.D(true);
        }
        if (this.f21543a0 == 0 || this.f21545b0 == 0) {
            int i11 = a0.i(100.0f);
            this.f21545b0 = i11;
            this.f21543a0 = i11;
        }
        g1 g1Var = new g1(aVar, o6Var, 64, true, j10, j11);
        this.M = g1Var;
        g1Var.M0();
        this.M.o0(this.f21546c);
    }

    public b(a aVar, o6 o6Var, TdApi.Video video, TdApi.FormattedText formattedText, boolean z10) {
        this(aVar, o6Var, 0L, 0L, null, 0, video, formattedText, z10);
    }

    public b(a aVar, o6 o6Var, long j10, long j11, TdApi.MessageSender messageSender, int i10, TdApi.Video video, TdApi.FormattedText formattedText, boolean z10) {
        this.X = aVar;
        this.Y = o6Var;
        this.Z = 1;
        this.f21547c0 = formattedText;
        this.T = video;
        this.O = j10;
        this.P = j11;
        this.Q = messageSender;
        this.R = i10;
        C0(video.minithumbnail);
        h D5 = t2.D5(o6Var, video.thumbnail);
        this.f21544b = D5;
        if (D5 != null) {
            D5.s0(1);
            this.f21544b.g0(true);
        }
        TdApi.File file = video.video;
        this.f21546c = file;
        s q10 = hd.f0.q(o6Var, file);
        this.f21548d0 = q10;
        q10.s0(1);
        int i11 = video.width;
        this.f21543a0 = i11;
        int i12 = video.height;
        this.f21545b0 = i12;
        if (i11 == 0 || i12 == 0) {
            int i13 = a0.i(100.0f);
            this.f21545b0 = i13;
            this.f21543a0 = i13;
        }
        g1 g1Var = new g1(aVar, o6Var, 4, true, j10, j11);
        this.M = g1Var;
        g1Var.M0();
        if (z10) {
            this.M.k0(R.drawable.baseline_play_arrow_36_white);
        }
        this.M.t0(true);
        this.M.Q0(true);
        this.M.C0(R.drawable.baseline_play_arrow_36_white);
        this.M.o0(this.f21546c);
    }

    public b(a aVar, o6 o6Var, long j10, long j11, TdApi.MessageSender messageSender, int i10, TdApi.MessageVideo messageVideo, boolean z10) {
        this(aVar, o6Var, j10, j11, messageSender, i10, messageVideo.video, messageVideo.caption, z10);
    }

    public b(a aVar, o6 o6Var, long j10, TdApi.ProfilePhoto profilePhoto) {
        this.X = aVar;
        this.Y = o6Var;
        this.Z = 6;
        this.Q = new TdApi.MessageSenderUser(j10);
        this.f21550f0 = profilePhoto;
        int i10 = a0.i(640.0f);
        this.f21545b0 = i10;
        this.f21543a0 = i10;
        TdApi.File file = profilePhoto.small;
        if (file != null) {
            h hVar = new h(o6Var, file);
            this.f21544b = hVar;
            hVar.g0(true);
            this.f21544b.t0(wc.a.getDefaultAvatarCacheSize());
            this.f21544b.s0(1);
        }
        TdApi.File file2 = profilePhoto.big;
        if (file2 != null) {
            this.f21546c = file2;
            h hVar2 = new h(o6Var, file2);
            this.f21548d0 = hVar2;
            hVar2.g0(true);
            this.f21548d0.s0(1);
            g1 g1Var = new g1(aVar, o6Var, 1, true, 0L, 0L);
            this.M = g1Var;
            g1Var.M0();
            this.M.o0(profilePhoto.big);
        }
    }

    public b(a aVar, o6 o6Var, long j10, TdApi.ChatPhotoInfo chatPhotoInfo) {
        this(aVar, o6Var, j10, 0L, new TdApi.ChatPhoto(0L, 0, chatPhotoInfo.minithumbnail, new TdApi.PhotoSize[]{new TdApi.PhotoSize("s", chatPhotoInfo.small, 160, 160, null), new TdApi.PhotoSize("m", chatPhotoInfo.big, 640, 640, null)}, null));
    }

    public b(a aVar, o6 o6Var, long j10, long j11, TdApi.ChatPhoto chatPhoto) {
        this.X = aVar;
        this.Y = o6Var;
        this.Z = 7;
        this.O = j10;
        this.P = j11;
        this.Q = ob.a.l(j10) ? new TdApi.MessageSenderUser(o6Var.h4(j10)) : new TdApi.MessageSenderChat(j10);
        this.R = chatPhoto.addedDate;
        this.f21551g0 = chatPhoto;
        C0(chatPhoto.minithumbnail);
        TdApi.PhotoSize K0 = e.K0(chatPhoto.sizes);
        TdApi.PhotoSize D0 = e.D0(chatPhoto.sizes);
        if (K0 != null) {
            h hVar = new h(o6Var, K0.photo);
            this.f21544b = hVar;
            hVar.g0(true);
            this.f21544b.t0(wc.a.getDefaultAvatarCacheSize());
            this.f21544b.s0(1);
        }
        if (D0 != null) {
            TdApi.File file = D0.photo;
            this.f21546c = file;
            h hVar2 = new h(o6Var, file);
            this.f21548d0 = hVar2;
            hVar2.g0(true);
            this.f21548d0.s0(1);
            g1 g1Var = new g1(aVar, o6Var, 1, true, this.O, j11);
            this.M = g1Var;
            g1Var.M0();
            this.M.o0(D0.photo);
        }
        this.f21545b0 = 640;
        this.f21543a0 = 640;
        Q0(o6Var.Ab(j10));
    }

    public b(a aVar, o6 o6Var, l lVar) {
        this.X = aVar;
        this.Y = o6Var;
        int i10 = lVar.e1() ? 4 : 3;
        this.Z = i10;
        this.f21543a0 = lVar.Y0();
        this.f21545b0 = lVar.L0();
        this.W = lVar;
        if (!lVar.b1()) {
            l lVar2 = new l(lVar);
            this.f21544b = lVar2;
            lVar2.s0(1);
            ((l) this.f21544b).l1(lVar.O0());
        }
        int o02 = o0();
        if (lVar.e1()) {
            if (this.f21548d0 == null) {
                s sVar = new s(o6Var, lVar.k());
                this.f21548d0 = sVar;
                sVar.s0(1);
                this.f21548d0.q0(lVar.O0());
                ((s) this.f21548d0).I0(o02);
                ((s) this.f21548d0).H0(lVar.P0() > 0 ? lVar.P0() : 0L);
            }
            this.N = true;
        } else if (lVar.b1()) {
            l lVar3 = new l(lVar);
            this.f21548d0 = lVar3;
            lVar3.s0(1);
            this.f21548d0.q0(lVar.x());
        } else if (i10 == 5) {
            md.k kVar = new md.k(o6Var, lVar.q());
            this.f21549e0 = kVar;
            kVar.I(1);
        } else {
            l lVar4 = new l(lVar);
            this.f21548d0 = lVar4;
            lVar4.s0(1);
            ((l) this.f21548d0).k1(false);
        }
        h hVar = this.f21548d0;
        if (hVar != null) {
            hVar.t0(o02);
            this.f21548d0.l0();
            this.f21548d0.b0();
            this.f21548d0.i0();
        }
        A0(this.W.r());
        y0(this.W.j());
        E0(this.W.t(), true);
    }
}
