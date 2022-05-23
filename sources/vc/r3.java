package vc;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import ce.j0;
import ce.y;
import gb.j;
import gd.l;
import gd.w;
import hd.f0;
import hd.s4;
import hd.t2;
import ib.i;
import java.util.Objects;
import je.g;
import je.k;
import je.l0;
import je.t;
import je.w0;
import ld.h;
import ld.v;
import ob.e;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import zd.fc;
import zd.o6;

public class r3 implements Client.g, Runnable, kb.c {
    public static int f25202n0;
    public static int f25203o0;
    public static int f25204p0;
    public static int f25205q0;
    public long M;
    public TdApi.MessageSender N;
    public String O;
    public int P;
    public int Q;
    public int R;
    public String S;
    public t2.d T;
    public h U;
    public h V;
    public Path W;
    public boolean X;
    public g Y;
    public g Z;
    public final o6 f25206a;
    public View f25207a0;
    public final s4 f25208b;
    public j f25209b0;
    public long f25210c;
    public Path f25211c0;
    public int f25212d0;
    public int f25213e0;
    public int f25214f0;
    public int f25215g0;
    public int f25216h0;
    public int f25217i0;
    public int f25218j0;
    public TdApi.Function f25219k0;
    public TdApi.Message f25220l0;
    public volatile boolean f25221m0;

    public class a implements k {
        public a() {
        }

        @Override
        public int R() {
            return je.j.d(this);
        }

        @Override
        public long W0(boolean z10) {
            return je.j.c(this, z10);
        }

        @Override
        public int a1() {
            return je.j.f(this);
        }

        @Override
        public int c() {
            return r3.this.f25208b.e2();
        }

        @Override
        public int d(boolean z10) {
            return je.j.b(this, z10);
        }

        @Override
        public int g(boolean z10) {
            return je.j.h(this, z10);
        }

        @Override
        public int o0(boolean z10) {
            return c();
        }

        @Override
        public int r0(boolean z10) {
            return je.j.a(this, z10);
        }

        @Override
        public int t0(boolean z10) {
            return je.j.g(this, z10);
        }
    }

    public class b implements k {
        public b() {
        }

        @Override
        public int R() {
            return je.j.d(this);
        }

        @Override
        public long W0(boolean z10) {
            return je.j.c(this, z10);
        }

        @Override
        public int a1() {
            return je.j.f(this);
        }

        @Override
        public int c() {
            return r3.this.f25208b.J4();
        }

        @Override
        public int d(boolean z10) {
            return je.j.b(this, z10);
        }

        @Override
        public int g(boolean z10) {
            return je.j.h(this, z10);
        }

        @Override
        public int o0(boolean z10) {
            return c();
        }

        @Override
        public int r0(boolean z10) {
            return je.j.a(this, z10);
        }

        @Override
        public int t0(boolean z10) {
            return je.j.g(this, z10);
        }
    }

    public class c implements k {
        public c() {
        }

        @Override
        public int R() {
            return je.j.d(this);
        }

        @Override
        public long W0(boolean z10) {
            return je.j.c(this, z10);
        }

        @Override
        public int a1() {
            return je.j.f(this);
        }

        @Override
        public int c() {
            return ae.j.P0();
        }

        @Override
        public int d(boolean z10) {
            return je.j.b(this, z10);
        }

        @Override
        public int g(boolean z10) {
            return je.j.h(this, z10);
        }

        @Override
        public int o0(boolean z10) {
            return c();
        }

        @Override
        public int r0(boolean z10) {
            return je.j.a(this, z10);
        }

        @Override
        public int t0(boolean z10) {
            return je.j.g(this, z10);
        }
    }

    public r3(o6 o6Var) {
        if (f25202n0 == 0) {
            y();
        }
        this.f25206a = o6Var;
        this.f25208b = null;
    }

    public void F(g gVar) {
        this.Z = gVar;
    }

    public int G() {
        return ae.j.L(this.P);
    }

    public void H(TdApi.Message message, boolean z10) {
        Y(message, z10, false);
    }

    public void I(String str) {
        Z(str);
        i();
        z(false);
    }

    public void J(t2.d dVar, String str, Path path, h hVar, h hVar2, boolean z10, boolean z11) {
        this.f25220l0 = null;
        this.T = dVar;
        Z(str);
        this.W = path;
        this.U = hVar;
        this.V = hVar2;
        this.X = z10;
        h();
        z(!C() || hVar2 != null || hVar != null || z11);
    }

    public static void R() {
        y();
    }

    public static w0 p() {
        return y.A0(13.0f);
    }

    public static w0 t(boolean z10) {
        return y.A0(z10 ? 15.0f : 13.0f);
    }

    public static int x() {
        return f25205q0 + a0.i(10.0f);
    }

    public static void y() {
        f25202n0 = a0.i(3.0f);
        f25204p0 = a0.i(7.0f);
        f25203o0 = a0.i(34.0f);
        f25205q0 = a0.i(41.0f);
    }

    public final boolean A() {
        s4 s4Var = this.f25208b;
        if (s4Var != null) {
            return s4Var.K5();
        }
        TdApi.Message message = this.f25220l0;
        return message != null && message.isChannelPost;
    }

    public boolean B(float f10, float f11, boolean z10) {
        int i10 = this.f25217i0;
        if (f10 >= i10 && f10 <= i10 + b0(z10)) {
            int i11 = this.f25218j0;
            if (f11 >= i11 && f11 <= i11 + f25205q0) {
                return true;
            }
        }
        return false;
    }

    public final boolean C() {
        return this.f25208b != null;
    }

    public final boolean D() {
        s4 s4Var = this.f25208b;
        return s4Var != null && s4Var.g6();
    }

    public final boolean E() {
        s4 s4Var = this.f25208b;
        return s4Var != null && s4Var.i6();
    }

    public void K(int i10) {
        if (this.Q != i10 && i10 > 0) {
            this.Q = i10;
            h();
        }
    }

    public final void L(int i10, int i11, int i12, int i13) {
        if (this.f25211c0 == null) {
            this.f25211c0 = new Path();
        }
        int i14 = a0.i(ae.j.V());
        if (this.f25212d0 != i10 || this.f25213e0 != i11 || this.f25214f0 != i12 || this.f25215g0 != i13 || this.f25216h0 != i14) {
            this.f25212d0 = i10;
            this.f25213e0 = i11;
            this.f25214f0 = i12;
            this.f25215g0 = i13;
            this.f25216h0 = i14;
            this.f25211c0.reset();
            RectF a02 = y.a0();
            a02.set(i10, i11, i12, i13);
            float f10 = i14;
            this.f25211c0.addRoundRect(a02, f10, f10, Path.Direction.CCW);
        }
    }

    public void M() {
        TdApi.Message z02;
        s4 s4Var = this.f25208b;
        if (s4Var == null || (z02 = s4Var.R6().E0().z0(this.f25210c, this.M)) == null) {
            this.R |= 16;
            if (C()) {
                this.f25219k0 = new TdApi.GetMessage(this.f25210c, this.f25208b.X3().replyToMessageId);
                this.f25206a.v4().o(new TdApi.GetRepliedMessage(this.f25210c, this.f25208b.K3()), this);
                return;
            }
            this.f25206a.v4().o(new TdApi.GetMessage(this.f25210c, this.M), this);
            return;
        }
        Y(z02, false, true);
    }

    public boolean N(View view, MotionEvent motionEvent) {
        g gVar;
        return ((this.R & 2) == 0 || (gVar = this.Z) == null || !gVar.U0(view, motionEvent)) ? false : true;
    }

    public final void O(final TdApi.Message message, final boolean z10) {
        l.a().b(new Runnable() {
            @Override
            public final void run() {
                r3.this.H(message, z10);
            }
        });
    }

    public boolean P(long j10, TdApi.MessageContent messageContent) {
        TdApi.Message message = this.f25220l0;
        if (message == null || message.f19946id != j10) {
            return false;
        }
        message.content = messageContent;
        O(message, true);
        return true;
    }

    public void Q(ld.c cVar) {
        cVar.E0(this.X ? (C() ? f25205q0 : f25203o0) / 2 : 0);
        cVar.j(this.U, this.V);
    }

    @Override
    public void Q2() {
        this.f25221m0 = true;
    }

    public void S(CharSequence charSequence, TdApi.Message message) {
        Z(r(charSequence, message));
        Y(message, false, false);
    }

    public void T(CharSequence charSequence, TdApi.Message message, boolean z10) {
        Z(r(charSequence, message));
        int h10 = ib.c.h(this.R, 8, !i.i(charSequence));
        this.R = h10;
        this.R = ib.c.h(h10, 32, z10);
        Y(message, false, false);
    }

    public void U(String str, t2.d dVar, TdApi.Minithumbnail minithumbnail, TdApi.File file) {
        h hVar;
        ld.i iVar = null;
        if (file == null || t2.S2(file)) {
            hVar = null;
        } else {
            h hVar2 = new h(this.f25206a, file);
            hVar2.Z(true);
            hVar2.t0(f25203o0);
            hVar2.k0();
            hVar2.s0(2);
            hVar = hVar2;
        }
        if (minithumbnail != null) {
            iVar = new ld.i(minithumbnail);
            iVar.s0(2);
            iVar.Z(true);
        }
        W(str, dVar, null, iVar, hVar, false, false);
    }

    public void V(final String str) {
        l.a().b(new Runnable() {
            @Override
            public final void run() {
                r3.this.I(str);
            }
        });
    }

    public final void W(final String str, final t2.d dVar, final Path path, final h hVar, final h hVar2, final boolean z10, final boolean z11) {
        l.a().b(new Runnable() {
            @Override
            public final void run() {
                r3.this.J(dVar, str, path, hVar, hVar2, z10, z11);
            }
        });
    }

    public void X(View view) {
        this.f25207a0 = view;
    }

    public final void Y(TdApi.Message message, boolean z10, boolean z11) {
        boolean z12;
        TdApi.Minithumbnail minithumbnail;
        TdApi.Thumbnail thumbnail;
        TdApi.PhotoSize photoSize;
        Path path;
        h hVar;
        String j12;
        Path path2;
        TdApi.Minithumbnail minithumbnail2;
        TdApi.Minithumbnail minithumbnail3;
        TdApi.Thumbnail thumbnail2;
        TdApi.PhotoSize photoSize2;
        TdApi.PhotoSize photoSize3;
        TdApi.Thumbnail thumbnail3;
        this.f25220l0 = message;
        boolean z13 = false;
        if ((this.R & Log.TAG_YOUTUBE) == 0 || this.f25206a.m7(message)) {
            this.P = 0;
        } else {
            this.P = t2.P1(new fc(this.f25206a, message.chatId, message.senderId).b());
        }
        boolean z14 = message.ttl != 0;
        String str = null;
        switch (message.content.getConstructor()) {
            case TdApi.MessagePhoto.CONSTRUCTOR:
                TdApi.Photo photo = ((TdApi.MessagePhoto) message.content).photo;
                photoSize = f0.k0(this.f25206a, photo.sizes, message.chatId);
                TdApi.PhotoSize J0 = e.J0(photo);
                thumbnail = (J0 == null || J0 == photoSize) ? null : t2.K5(photoSize);
                minithumbnail = photo.minithumbnail;
                path2 = null;
                z12 = false;
                path = path2;
                break;
            case TdApi.MessageChatChangePhoto.CONSTRUCTOR:
                TdApi.ChatPhoto chatPhoto = ((TdApi.MessageChatChangePhoto) message.content).photo;
                photoSize = f0.k0(this.f25206a, chatPhoto.sizes, message.chatId);
                TdApi.PhotoSize K0 = e.K0(chatPhoto.sizes);
                thumbnail = (K0 == null || K0 == photoSize) ? null : t2.K5(photoSize);
                minithumbnail = chatPhoto.minithumbnail;
                path = null;
                z12 = true;
                break;
            case TdApi.MessageGame.CONSTRUCTOR:
                TdApi.Photo photo2 = ((TdApi.MessageGame) message.content).game.photo;
                photoSize = f0.k0(this.f25206a, photo2.sizes, message.chatId);
                minithumbnail2 = photo2.minithumbnail;
                minithumbnail = minithumbnail2;
                path2 = null;
                thumbnail = null;
                z12 = false;
                path = path2;
                break;
            case TdApi.MessageDocument.CONSTRUCTOR:
                TdApi.Document document = ((TdApi.MessageDocument) message.content).document;
                if (document != null) {
                    minithumbnail3 = document.minithumbnail;
                    thumbnail2 = document.thumbnail;
                    thumbnail = thumbnail2;
                    photoSize3 = null;
                    minithumbnail = minithumbnail3;
                    z12 = false;
                    photoSize2 = photoSize3;
                    photoSize = photoSize2;
                    path = photoSize2;
                    break;
                } else {
                    return;
                }
            case TdApi.MessageVideoNote.CONSTRUCTOR:
                TdApi.VideoNote videoNote = ((TdApi.MessageVideoNote) message.content).videoNote;
                TdApi.Minithumbnail minithumbnail4 = videoNote.minithumbnail;
                thumbnail = videoNote.thumbnail;
                photoSize2 = null;
                minithumbnail = minithumbnail4;
                z12 = true;
                photoSize = photoSize2;
                path = photoSize2;
                break;
            case TdApi.MessageAnimation.CONSTRUCTOR:
                TdApi.Animation animation = ((TdApi.MessageAnimation) message.content).animation;
                minithumbnail3 = animation.minithumbnail;
                thumbnail2 = animation.thumbnail;
                thumbnail = thumbnail2;
                photoSize3 = null;
                minithumbnail = minithumbnail3;
                z12 = false;
                photoSize2 = photoSize3;
                photoSize = photoSize2;
                path = photoSize2;
                break;
            case TdApi.MessageSticker.CONSTRUCTOR:
                TdApi.Sticker sticker = ((TdApi.MessageSticker) message.content).sticker;
                if (sticker != null) {
                    TdApi.Thumbnail thumbnail4 = sticker.thumbnail;
                    if (thumbnail4 == null) {
                        thumbnail4 = t2.L5(sticker);
                    }
                    TdApi.ClosedVectorPath[] closedVectorPathArr = sticker.outline;
                    int i10 = f25203o0;
                    Path b10 = e.b(closedVectorPathArr, Math.min(i10 / sticker.width, i10 / sticker.height));
                    minithumbnail = null;
                    thumbnail = thumbnail4;
                    z12 = false;
                    photoSize = null;
                    path = b10;
                    break;
                } else {
                    return;
                }
            case TdApi.MessageText.CONSTRUCTOR:
                TdApi.WebPage webPage = ((TdApi.MessageText) message.content).webPage;
                if (webPage != null) {
                    TdApi.Photo photo3 = webPage.photo;
                    if (photo3 != null) {
                        photoSize = f0.k0(this.f25206a, photo3.sizes, message.chatId);
                        minithumbnail2 = webPage.photo.minithumbnail;
                        minithumbnail = minithumbnail2;
                        path2 = null;
                        thumbnail = null;
                        z12 = false;
                        path = path2;
                        break;
                    } else {
                        TdApi.Document document2 = webPage.document;
                        if (document2 == null || (thumbnail = document2.thumbnail) == null) {
                            TdApi.Sticker sticker2 = webPage.sticker;
                            if (sticker2 == null || (thumbnail = sticker2.thumbnail) == null) {
                                TdApi.Animation animation2 = webPage.animation;
                                if (!(animation2 == null || (thumbnail3 = animation2.thumbnail) == null)) {
                                    minithumbnail = animation2.minithumbnail;
                                    photoSize3 = null;
                                    thumbnail = thumbnail3;
                                    z12 = false;
                                    photoSize2 = photoSize3;
                                    photoSize = photoSize2;
                                    path = photoSize2;
                                    break;
                                }
                            } else {
                                TdApi.ClosedVectorPath[] closedVectorPathArr2 = sticker2.outline;
                                int i11 = f25203o0;
                                path2 = e.b(closedVectorPathArr2, Math.min(i11 / sticker2.width, i11 / sticker2.height));
                                photoSize = null;
                                minithumbnail = null;
                                z12 = false;
                                path = path2;
                            }
                        } else {
                            minithumbnail3 = document2.minithumbnail;
                            photoSize3 = null;
                            minithumbnail = minithumbnail3;
                            z12 = false;
                            photoSize2 = photoSize3;
                            photoSize = photoSize2;
                            path = photoSize2;
                        }
                    }
                }
                path2 = null;
                photoSize = null;
                thumbnail = null;
                minithumbnail = null;
                z12 = false;
                path = path2;
                break;
            case TdApi.MessageVideo.CONSTRUCTOR:
                TdApi.Video video = ((TdApi.MessageVideo) message.content).video;
                if (video != null) {
                    minithumbnail3 = video.minithumbnail;
                    thumbnail2 = video.thumbnail;
                    thumbnail = thumbnail2;
                    photoSize3 = null;
                    minithumbnail = minithumbnail3;
                    z12 = false;
                    photoSize2 = photoSize3;
                    photoSize = photoSize2;
                    path = photoSize2;
                    break;
                } else {
                    return;
                }
            default:
                path2 = null;
                photoSize = null;
                thumbnail = null;
                minithumbnail = null;
                z12 = false;
                path = path2;
                break;
        }
        h D5 = t2.D5(this.f25206a, thumbnail);
        boolean z15 = D5 != null && thumbnail.format.getConstructor() == -53588974;
        if (D5 == null && photoSize != null) {
            D5 = new h(this.f25206a, photoSize.photo);
        }
        if (D5 != null) {
            D5.s0(z15 ? 1 : 2);
            if (!z15) {
                D5.Z(true);
            }
            D5.t0(f25203o0);
            D5.k0();
            if (z15) {
                D5.x0();
            }
            if (z14) {
                D5.d0();
                D5.f0();
            }
        }
        if (minithumbnail != null) {
            h iVar = new ld.i(minithumbnail);
            iVar.Z(true);
            iVar.s0(z15 ? 1 : 2);
            hVar = iVar;
        } else {
            hVar = null;
        }
        t2.d R0 = t2.R0(this.f25206a, message.chatId, message);
        TdApi.MessageForwardInfo messageForwardInfo = message.forwardInfo;
        if (messageForwardInfo != null) {
            switch (messageForwardInfo.origin.getConstructor()) {
                case TdApi.MessageForwardOriginMessageImport.CONSTRUCTOR:
                    this.O = ((TdApi.MessageForwardOriginMessageImport) message.forwardInfo.origin).senderName;
                    this.N = null;
                    break;
                case TdApi.MessageForwardOriginUser.CONSTRUCTOR:
                    this.N = new TdApi.MessageSenderUser(((TdApi.MessageForwardOriginUser) message.forwardInfo.origin).senderUserId);
                    this.O = null;
                    break;
                case TdApi.MessageForwardOriginHiddenUser.CONSTRUCTOR:
                    this.O = ((TdApi.MessageForwardOriginHiddenUser) message.forwardInfo.origin).senderName;
                    this.N = null;
                    break;
                case TdApi.MessageForwardOriginChannel.CONSTRUCTOR:
                    TdApi.MessageForwardOriginChannel messageForwardOriginChannel = (TdApi.MessageForwardOriginChannel) message.forwardInfo.origin;
                    this.N = new TdApi.MessageSenderChat(messageForwardOriginChannel.chatId);
                    if (!i.i(messageForwardOriginChannel.authorSignature)) {
                        str = messageForwardOriginChannel.authorSignature;
                    }
                    this.O = str;
                    break;
                case TdApi.MessageForwardOriginChat.CONSTRUCTOR:
                    TdApi.MessageForwardOriginChat messageForwardOriginChat = (TdApi.MessageForwardOriginChat) message.forwardInfo.origin;
                    this.N = new TdApi.MessageSenderChat(messageForwardOriginChat.senderChatId);
                    this.O = messageForwardOriginChat.authorSignature;
                    break;
                default:
                    throw new IllegalArgumentException(message.forwardInfo.origin.toString());
            }
        } else {
            this.N = message.senderId;
            if (this.f25206a.Z6(message)) {
                str = message.authorSignature;
            }
            this.O = str;
        }
        if (ib.c.b(this.R, 8)) {
            j12 = this.S;
        } else if (this.N == null) {
            j12 = this.O;
        } else if (i.i(this.O)) {
            j12 = this.f25206a.Db(this.N, C());
        } else {
            j12 = w.j1(A() ? R.string.format_channelAndSignature : R.string.format_chatAndSignature, this.f25206a.Db(this.N, C()), this.O);
        }
        String str2 = j12;
        if (Thread.currentThread() == l.a().d() || z11) {
            this.T = R0;
            Z(str2);
            this.U = hVar;
            this.W = path;
            this.V = D5;
            this.X = z12;
            h();
            if (z10 || !C() || hVar != null || D5 != null) {
                z13 = true;
            }
            z(z13);
            return;
        }
        W(str2, R0, path, hVar, D5, z12, false);
    }

    public final void Z(CharSequence charSequence) {
        this.S = charSequence != null ? charSequence.toString() : null;
    }

    public void a0(j jVar) {
        this.f25209b0 = jVar;
    }

    public int b0(boolean z10) {
        int i10;
        int i11;
        if (!v()) {
            int max = Math.max(q(), u());
            int i12 = f25204p0;
            i10 = max + i12 + i12;
            i11 = f25202n0;
        } else {
            int max2 = Math.max(q(), u());
            int i13 = f25204p0;
            int i14 = f25202n0;
            i10 = max2 + i13 + i14 + i14 + i13;
            i11 = C() ? f25205q0 : f25203o0;
        }
        return i10 + i11 + (z10 ? a0.i(3.0f) : 0);
    }

    public final void g() {
        l0[] l0VarArr;
        int n10 = n();
        t2.d dVar = this.T;
        g.b j10 = new g.b(dVar != null ? dVar.c(true) : w.i1(R.string.LoadingMessage), n10, C() ? s4.L4() : p(), m()).v().y(8).l().j();
        t2.d dVar2 = this.T;
        j jVar = null;
        if (dVar2 == null || e.c1(dVar2.f13570d)) {
            l0VarArr = null;
        } else {
            o6 o6Var = this.f25206a;
            TdApi.FormattedText formattedText = this.T.f13570d;
            l0VarArr = l0.E(o6Var, formattedText.text, formattedText.entities, null);
        }
        g.b i10 = j10.i(l0VarArr);
        j jVar2 = this.f25209b0;
        if (jVar2 != null) {
            jVar = jVar2;
        } else {
            View view = this.f25207a0;
            if (view != null) {
                jVar = new gb.h(view);
            }
        }
        final g f10 = i10.z(jVar).f();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.Z = f10;
        } else {
            j0.d0(new Runnable() {
                @Override
                public final void run() {
                    r3.this.F(f10);
                }
            });
        }
    }

    public final void h() {
        if (this.Q > 0) {
            i();
            g();
        }
    }

    public final void i() {
        int n10 = n();
        String str = this.S;
        if (str == null) {
            str = w.i1(A() ? R.string.LoadingChannel : R.string.LoadingUser);
        }
        this.Y = new g.b(str, n10, t(C()), s()).v().g().b().d().z(this.f25209b0).f();
    }

    public boolean j(long j10) {
        TdApi.Message message = this.f25220l0;
        if (message == null || message.f19946id != j10) {
            return false;
        }
        W(w.i1(R.string.Error), new t2.d((t2.f) null, (int) R.string.DeletedMessage), null, null, null, false, true);
        return true;
    }

    public void k(Canvas canvas, int i10, int i11, int i12, int i13, v vVar, boolean z10) {
        int i14;
        int i15;
        int i16;
        int i17;
        s4 s4Var = this.f25208b;
        boolean z11 = s4Var != null && s4Var.S8();
        this.f25217i0 = i10;
        this.f25218j0 = i11;
        boolean D = D();
        RectF a02 = y.a0();
        if (z11) {
            int i18 = a0.i(8.0f);
            int i19 = a0.i(12.0f);
            a02.top = i11 - i18;
            a02.bottom = f25205q0 + i11 + i18;
            a02.left = i10 - i19;
            a02.right = i10 + i13;
            float G = ae.j.G();
            canvas.drawRoundRect(a02, G, G, y.g(this.f25208b.d2()));
        }
        if (v()) {
            int i20 = f25202n0;
            int i21 = i20 + i20;
            if (z10) {
                i17 = (i12 - i21) - (C() ? f25205q0 : f25203o0);
            } else {
                i17 = i21 + i10;
            }
            if (C()) {
                int i22 = f25205q0;
                vVar.K0(i17, i11, i17 + i22, i22 + i11);
            } else {
                int i23 = f25203o0;
                vVar.K0(i17, i11, i17 + i23, i23 + i11);
            }
            L(vVar.getLeft(), vVar.getTop(), vVar.getRight(), vVar.getBottom());
            int b10 = yd.g.b(canvas, this.f25211c0);
            if (vVar.e0()) {
                vVar.P(canvas, this.W);
            }
            vVar.draw(canvas);
            yd.g.f(canvas, b10);
        }
        if (C()) {
            int o10 = o();
            g gVar = this.Y;
            if (gVar != null) {
                int i24 = i10 + o10;
                gVar.u(canvas, i24, gVar.getWidth() + i24, 0, i11 + a0.i(1.0f));
            }
            g gVar2 = this.Z;
            if (gVar2 != null) {
                int i25 = i10 + o10;
                gVar2.u(canvas, i25, i25 + gVar2.getWidth(), 0, i11 + a0.i(22.0f));
            }
            if (z10) {
                a02.set(i12 - f25202n0, i11, i12, f25205q0 + i11);
            } else {
                a02.set(i10, i11, f25202n0 + i10, f25205q0 + i11);
            }
            int i26 = f25202n0;
            float f10 = i26 / 2;
            float f11 = i26 / 2;
            if (z11) {
                i15 = this.f25208b.e2();
            } else {
                if (D) {
                    i16 = R.id.theme_color_bubbleOut_chatVerticalLine;
                } else {
                    i16 = this.P;
                    if (i16 == 0) {
                        i15 = ae.j.L(R.id.theme_color_messageVerticalLine);
                    }
                }
                i15 = ae.j.L(i16);
            }
            canvas.drawRoundRect(a02, f10, f11, y.g(i15));
            return;
        }
        if (v()) {
            int i27 = f25202n0;
            i14 = i10 + i27 + f25204p0 + i27 + f25203o0;
        } else {
            i14 = f25202n0 + i10 + f25204p0;
        }
        g gVar3 = this.Y;
        if (gVar3 != null) {
            gVar3.u(canvas, i14, i14 + gVar3.getWidth(), 0, i11 + a0.i(1.0f));
        }
        g gVar4 = this.Z;
        if (gVar4 != null) {
            gVar4.u(canvas, i14, i14 + gVar4.getWidth(), 0, i11 + a0.i(19.0f));
        }
        y.a0().set(i10, i11, f25202n0 + i10, f25203o0 + i11);
        RectF a03 = y.a0();
        int i28 = f25202n0;
        canvas.drawRoundRect(a03, i28 / 2, i28 / 2, y.g(ae.j.L(R.id.theme_color_messageVerticalLine)));
    }

    public String l() {
        TdApi.MessageSender messageSender = this.N;
        return messageSender != null ? this.f25206a.Cb(messageSender) : this.O;
    }

    public final k m() {
        s4 s4Var = this.f25208b;
        if (s4Var != null) {
            return s4Var.S8() ? new a() : new b();
        }
        if (ib.c.b(this.R, 2)) {
            return t.d.C;
        }
        return new c();
    }

    public final int n() {
        int i10;
        int i11;
        if (!v()) {
            int i12 = this.Q;
            i11 = f25204p0;
            i10 = (i12 - i11) - f25202n0;
        } else {
            int i13 = this.Q;
            int i14 = f25204p0;
            int i15 = (i13 - i14) - i14;
            int i16 = f25202n0;
            i10 = (i15 - i16) - i16;
            i11 = C() ? f25205q0 : f25203o0;
        }
        return i10 - i11;
    }

    public final int o() {
        if (v()) {
            int i10 = f25202n0;
            return f25204p0 + i10 + i10 + f25205q0;
        }
        return f25204p0 + f25202n0;
    }

    public final int q() {
        g gVar = this.Z;
        if (gVar != null) {
            return gVar.getWidth();
        }
        return 0;
    }

    public final CharSequence r(CharSequence charSequence, TdApi.Message message) {
        if (!i.i(charSequence)) {
            return charSequence;
        }
        if (message != null) {
            return this.f25206a.W9(message, false, C());
        }
        return w.i1(A() ? R.string.LoadingChannel : R.string.LoadingUser);
    }

    @Override
    public void r2(TdApi.Object object) {
        if (!this.f25221m0) {
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                TdApi.Function function = this.f25219k0;
                if (function != null) {
                    this.f25219k0 = null;
                    this.f25206a.v4().o(function, this);
                    return;
                }
                W(w.i1(R.string.Error), t2.l0(object) == 404 ? new t2.d((t2.f) null, (int) R.string.DeletedMessage) : new t2.d((t2.f) null, 0, t2.z5(object), true), null, null, null, false, false);
                this.f25220l0 = null;
            } else if (constructor != 1435961258) {
                Log.unexpectedTdlibResponse(object, TdApi.GetMessage.class, TdApi.Message.class);
            } else {
                O((TdApi.Message) object, false);
            }
            this.R &= -17;
        }
    }

    @Override
    public void run() {
        View view = this.f25207a0;
        if (view != null) {
            view.invalidate();
            if (this.f25208b != null) {
                KeyEvent.Callback callback = this.f25207a0;
                if (callback instanceof h1) {
                    callback = ((h1) callback).getMessageView();
                }
                if (callback instanceof g1) {
                    ((g1) callback).d0();
                }
            }
            View view2 = this.f25207a0;
            if (view2 instanceof s3) {
                ((s3) view2).A1();
                return;
            }
            return;
        }
        j jVar = this.f25209b0;
        if (jVar != null) {
            jVar.invalidate();
            if (C()) {
                this.f25208b.G5();
            }
        }
    }

    public final k s() {
        s4 s4Var = this.f25208b;
        if (s4Var == null) {
            return t.d.C;
        }
        if (s4Var.S8()) {
            final s4 s4Var2 = this.f25208b;
            Objects.requireNonNull(s4Var2);
            return new k() {
                @Override
                public int R() {
                    return je.j.d(this);
                }

                @Override
                public long W0(boolean z10) {
                    return je.j.c(this, z10);
                }

                @Override
                public int a1() {
                    return je.j.f(this);
                }

                @Override
                public final int c() {
                    return s4.this.e2();
                }

                @Override
                public int d(boolean z10) {
                    return je.j.b(this, z10);
                }

                @Override
                public int g(boolean z10) {
                    return je.j.h(this, z10);
                }

                @Override
                public int o0(boolean z10) {
                    return je.j.e(this, z10);
                }

                @Override
                public int r0(boolean z10) {
                    return je.j.a(this, z10);
                }

                @Override
                public int t0(boolean z10) {
                    return je.j.g(this, z10);
                }
            };
        } else if (this.P != 0) {
            return new k() {
                @Override
                public int R() {
                    return je.j.d(this);
                }

                @Override
                public long W0(boolean z10) {
                    return je.j.c(this, z10);
                }

                @Override
                public int a1() {
                    return je.j.f(this);
                }

                @Override
                public final int c() {
                    int G;
                    G = r3.this.G();
                    return G;
                }

                @Override
                public int d(boolean z10) {
                    return je.j.b(this, z10);
                }

                @Override
                public int g(boolean z10) {
                    return je.j.h(this, z10);
                }

                @Override
                public int o0(boolean z10) {
                    return je.j.e(this, z10);
                }

                @Override
                public int r0(boolean z10) {
                    return je.j.a(this, z10);
                }

                @Override
                public int t0(boolean z10) {
                    return je.j.g(this, z10);
                }
            };
        } else {
            if (E()) {
                return this.f25208b.H2();
            }
            return this.f25208b.F2();
        }
    }

    public final int u() {
        g gVar = this.Y;
        if (gVar != null) {
            return gVar.getWidth();
        }
        return 0;
    }

    public final boolean v() {
        return (this.U == null && this.V == null) ? false : true;
    }

    public boolean w() {
        return this.f25220l0 != null;
    }

    public void z(boolean z10) {
        if (z10) {
            j0.d0(this);
            return;
        }
        View view = this.f25207a0;
        if (view != null) {
            j0.M(view);
            return;
        }
        j jVar = this.f25209b0;
        if (jVar != null) {
            jVar.h();
        }
    }

    public r3(s4 s4Var) {
        if (f25202n0 == 0) {
            y();
        }
        this.f25206a = s4Var.c();
        this.f25208b = s4Var;
        TdApi.Message X3 = s4Var.X3();
        this.f25210c = X3.chatId;
        this.M = X3.replyToMessageId;
    }
}
