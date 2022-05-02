package p291uc;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import be.C1379j0;
import be.C1410y;
import gd.AbstractC4761s4;
import gd.C4630f0;
import gd.C4779t2;
import ie.AbstractC5408k;
import ie.AbstractC5411l0;
import ie.C5406j;
import ie.C5428t;
import ie.C5457w0;
import ie.RunnableC5390g;
import java.util.Objects;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p080fb.AbstractC4345j;
import p080fb.C4343h;
import p082fd.C4383l;
import p082fd.C4403w;
import p108hb.C5063c;
import p108hb.C5070i;
import p139jb.AbstractC5911c;
import p156kd.AbstractC6264v;
import p156kd.C6240c;
import p156kd.C6246h;
import p156kd.C6250i;
import p193nb.C7321e;
import p335xd.C10192g;
import p350yd.C10712hc;
import p350yd.C10930q6;
import p364zd.C11524j;

public class RunnableC9651s3 implements Client.AbstractC7865g, Runnable, AbstractC5911c {
    public static int f31323n0;
    public static int f31324o0;
    public static int f31325p0;
    public static int f31326q0;
    public long f31327M;
    public TdApi.MessageSender f31328N;
    public String f31329O;
    public int f31330P;
    public int f31331Q;
    public int f31332R;
    public String f31333S;
    public C4779t2.C4783d f31334T;
    public C6246h f31335U;
    public C6246h f31336V;
    public Path f31337W;
    public boolean f31338X;
    public RunnableC5390g f31339Y;
    public RunnableC5390g f31340Z;
    public final C10930q6 f31341a;
    public View f31342a0;
    public final AbstractC4761s4 f31343b;
    public AbstractC4345j f31344b0;
    public long f31345c;
    public Path f31346c0;
    public int f31347d0;
    public int f31348e0;
    public int f31349f0;
    public int f31350g0;
    public int f31351h0;
    public int f31352i0;
    public int f31353j0;
    public TdApi.Function f31354k0;
    public TdApi.Message f31355l0;
    public volatile boolean f31356m0;

    public class C9652a implements AbstractC5408k {
        public C9652a() {
        }

        @Override
        public int mo7858Q() {
            return C5406j.m22807d(this);
        }

        @Override
        public long mo7857X0(boolean z) {
            return C5406j.m22808c(this, z);
        }

        @Override
        public int mo7856b1() {
            return C5406j.m22805f(this);
        }

        @Override
        public int mo7855c() {
            return RunnableC9651s3.this.f31343b.m25922h2();
        }

        @Override
        public int mo7854e(boolean z) {
            return C5406j.m22809b(this, z);
        }

        @Override
        public int mo7853g(boolean z) {
            return C5406j.m22803h(this, z);
        }

        @Override
        public int mo7852o0(boolean z) {
            return mo7855c();
        }

        @Override
        public int mo7851p0(boolean z) {
            return C5406j.m22810a(this, z);
        }

        @Override
        public int mo7850r0(boolean z) {
            return C5406j.m22804g(this, z);
        }
    }

    public class C9653b implements AbstractC5408k {
        public C9653b() {
        }

        @Override
        public int mo7858Q() {
            return C5406j.m22807d(this);
        }

        @Override
        public long mo7857X0(boolean z) {
            return C5406j.m22808c(this, z);
        }

        @Override
        public int mo7856b1() {
            return C5406j.m22805f(this);
        }

        @Override
        public int mo7855c() {
            return RunnableC9651s3.this.f31343b.m26154J4();
        }

        @Override
        public int mo7854e(boolean z) {
            return C5406j.m22809b(this, z);
        }

        @Override
        public int mo7853g(boolean z) {
            return C5406j.m22803h(this, z);
        }

        @Override
        public int mo7852o0(boolean z) {
            return mo7855c();
        }

        @Override
        public int mo7851p0(boolean z) {
            return C5406j.m22810a(this, z);
        }

        @Override
        public int mo7850r0(boolean z) {
            return C5406j.m22804g(this, z);
        }
    }

    public class C9654c implements AbstractC5408k {
        public C9654c() {
        }

        @Override
        public int mo7858Q() {
            return C5406j.m22807d(this);
        }

        @Override
        public long mo7857X0(boolean z) {
            return C5406j.m22808c(this, z);
        }

        @Override
        public int mo7856b1() {
            return C5406j.m22805f(this);
        }

        @Override
        public int mo7855c() {
            return C11524j.m217S0();
        }

        @Override
        public int mo7854e(boolean z) {
            return C5406j.m22809b(this, z);
        }

        @Override
        public int mo7853g(boolean z) {
            return C5406j.m22803h(this, z);
        }

        @Override
        public int mo7852o0(boolean z) {
            return mo7855c();
        }

        @Override
        public int mo7851p0(boolean z) {
            return C5406j.m22810a(this, z);
        }

        @Override
        public int mo7850r0(boolean z) {
            return C5406j.m22804g(this, z);
        }
    }

    public RunnableC9651s3(C10930q6 q6Var) {
        if (f31323n0 == 0) {
            m7860y();
        }
        this.f31341a = q6Var;
        this.f31343b = null;
    }

    public void m7907F(RunnableC5390g gVar) {
        this.f31340Z = gVar;
    }

    public int m7906G() {
        return C11524j.m228N(this.f31330P);
    }

    public void m7905H(TdApi.Message message, boolean z) {
        m7888Y(message, z, false);
    }

    public void m7904I(String str) {
        m7887Z(str);
        m7876i();
        m7859z(false);
    }

    public void m7903J(C4779t2.C4783d dVar, String str, Path path, C6246h hVar, C6246h hVar2, boolean z, boolean z2) {
        this.f31355l0 = null;
        this.f31334T = dVar;
        m7887Z(str);
        this.f31337W = path;
        this.f31335U = hVar;
        this.f31336V = hVar2;
        this.f31338X = z;
        m7877h();
        m7859z(!m7910C() || hVar2 != null || hVar != null || z2);
    }

    public static void m7895R() {
        m7860y();
    }

    public static C5457w0 m7869p() {
        return C1410y.m37083A0(13.0f);
    }

    public static C5457w0 m7865t(boolean z) {
        return C1410y.m37083A0(z ? 15.0f : 13.0f);
    }

    public static int m7861x() {
        return f31326q0 + C1357a0.m37541i(10.0f);
    }

    public static void m7860y() {
        f31323n0 = C1357a0.m37541i(3.0f);
        f31325p0 = C1357a0.m37541i(7.0f);
        f31324o0 = C1357a0.m37541i(34.0f);
        f31326q0 = C1357a0.m37541i(41.0f);
    }

    public final boolean m7912A() {
        AbstractC4761s4 s4Var = this.f31343b;
        if (s4Var != null) {
            return s4Var.m26133L5();
        }
        TdApi.Message message = this.f31355l0;
        return message != null && message.isChannelPost;
    }

    public boolean m7911B(float f, float f2, boolean z) {
        int i = this.f31352i0;
        if (f >= i && f <= i + m7883b0(z)) {
            int i2 = this.f31353j0;
            if (f2 >= i2 && f2 <= i2 + f31326q0) {
                return true;
            }
        }
        return false;
    }

    public final boolean m7910C() {
        return this.f31343b != null;
    }

    public final boolean m7909D() {
        AbstractC4761s4 s4Var = this.f31343b;
        return s4Var != null && s4Var.m25918h6();
    }

    public final boolean m7908E() {
        AbstractC4761s4 s4Var = this.f31343b;
        return s4Var != null && s4Var.m25899j6();
    }

    public void m7902K(int i) {
        if (this.f31331Q != i && i > 0) {
            this.f31331Q = i;
            m7877h();
        }
    }

    public final void m7901L(int i, int i2, int i3, int i4) {
        if (this.f31346c0 == null) {
            this.f31346c0 = new Path();
        }
        int i5 = C1357a0.m37541i(C11524j.m208X());
        if (this.f31347d0 != i || this.f31348e0 != i2 || this.f31349f0 != i3 || this.f31350g0 != i4 || this.f31351h0 != i5) {
            this.f31347d0 = i;
            this.f31348e0 = i2;
            this.f31349f0 = i3;
            this.f31350g0 = i4;
            this.f31351h0 = i5;
            this.f31346c0.reset();
            RectF a0 = C1410y.m37050a0();
            a0.set(i, i2, i3, i4);
            float f = i5;
            this.f31346c0.addRoundRect(a0, f, f, Path.Direction.CCW);
        }
    }

    public void m7900M() {
        TdApi.Message B0;
        AbstractC4761s4 s4Var = this.f31343b;
        if (s4Var == null || (B0 = s4Var.m26071R6().m7808E0().m8125B0(this.f31345c, this.f31327M)) == null) {
            this.f31332R |= 16;
            if (m7910C()) {
                this.f31354k0 = new TdApi.GetMessage(this.f31345c, this.f31343b.m25993Z3().replyToMessageId);
                this.f31341a.m2270r4().m14783o(new TdApi.GetRepliedMessage(this.f31345c, this.f31343b.m26115N3()), this);
                return;
            }
            this.f31341a.m2270r4().m14783o(new TdApi.GetMessage(this.f31345c, this.f31327M), this);
            return;
        }
        m7888Y(B0, false, true);
    }

    public boolean m7899N(View view, MotionEvent motionEvent) {
        RunnableC5390g gVar;
        return ((this.f31332R & 2) == 0 || (gVar = this.f31340Z) == null || !gVar.m22967U0(view, motionEvent)) ? false : true;
    }

    public final void m7898O(final TdApi.Message message, final boolean z) {
        C4383l.m28059a().m28058b(new Runnable() {
            @Override
            public final void run() {
                RunnableC9651s3.this.m7905H(message, z);
            }
        });
    }

    public boolean m7897P(long j, TdApi.MessageContent messageContent) {
        TdApi.Message message = this.f31355l0;
        if (message == null || message.f25406id != j) {
            return false;
        }
        message.content = messageContent;
        m7898O(message, true);
        return true;
    }

    public void m7896Q(C6240c cVar) {
        cVar.mo20259D0(this.f31338X ? (m7910C() ? f31326q0 : f31324o0) / 2 : 0);
        cVar.m20977j(this.f31335U, this.f31336V);
    }

    public void m7894S(CharSequence charSequence, TdApi.Message message) {
        m7887Z(m7867r(charSequence, message));
        m7888Y(message, false, false);
    }

    public void m7893T(CharSequence charSequence, TdApi.Message message, boolean z) {
        m7887Z(m7867r(charSequence, message));
        int h = C5063c.m24138h(this.f31332R, 8, !C5070i.m24061i(charSequence));
        this.f31332R = h;
        this.f31332R = C5063c.m24138h(h, 32, z);
        m7888Y(message, false, false);
    }

    public void m7892U(String str, C4779t2.C4783d dVar, TdApi.Minithumbnail minithumbnail, TdApi.File file) {
        C6246h hVar;
        C6250i iVar = null;
        if (file == null || C4779t2.m25604S2(file)) {
            hVar = null;
        } else {
            C6246h hVar2 = new C6246h(this.f31341a, file);
            hVar2.m20930Z(true);
            hVar2.mo20767t0(f31324o0);
            hVar2.m20909k0();
            hVar2.m20897s0(2);
            hVar = hVar2;
        }
        if (minithumbnail != null) {
            iVar = new C6250i(minithumbnail);
            iVar.m20897s0(2);
            iVar.m20930Z(true);
        }
        m7890W(str, dVar, null, iVar, hVar, false, false);
    }

    public void m7891V(final String str) {
        C4383l.m28059a().m28058b(new Runnable() {
            @Override
            public final void run() {
                RunnableC9651s3.this.m7904I(str);
            }
        });
    }

    public final void m7890W(final String str, final C4779t2.C4783d dVar, final Path path, final C6246h hVar, final C6246h hVar2, final boolean z, final boolean z2) {
        C4383l.m28059a().m28058b(new Runnable() {
            @Override
            public final void run() {
                RunnableC9651s3.this.m7903J(dVar, str, path, hVar, hVar2, z, z2);
            }
        });
    }

    public void m7889X(View view) {
        this.f31342a0 = view;
    }

    public final void m7888Y(TdApi.Message message, boolean z, boolean z2) {
        boolean z3;
        TdApi.Minithumbnail minithumbnail;
        TdApi.Thumbnail thumbnail;
        TdApi.PhotoSize photoSize;
        Path path;
        C6246h hVar;
        String j1;
        TdApi.MessageForwardInfo messageForwardInfo;
        Path path2;
        TdApi.Minithumbnail minithumbnail2;
        TdApi.Minithumbnail minithumbnail3;
        TdApi.Thumbnail thumbnail2;
        TdApi.PhotoSize photoSize2;
        TdApi.PhotoSize photoSize3;
        TdApi.Thumbnail thumbnail3;
        this.f31355l0 = message;
        boolean z4 = false;
        if ((this.f31332R & Log.TAG_YOUTUBE) == 0 || this.f31341a.m2411i7(message)) {
            this.f31330P = 0;
        } else {
            this.f31330P = C4779t2.m25624P1(new C10712hc(this.f31341a, message.chatId, message.senderId).m4214b());
        }
        boolean z5 = message.ttl != 0;
        String str = null;
        switch (message.content.getConstructor()) {
            case TdApi.MessagePhoto.CONSTRUCTOR:
                TdApi.Photo photo = ((TdApi.MessagePhoto) message.content).photo;
                photoSize = C4630f0.m26741j0(this.f31341a, photo.sizes, message.chatId);
                TdApi.PhotoSize H0 = C7321e.m17004H0(photo);
                thumbnail = (H0 == null || H0 == photoSize) ? null : C4779t2.m25655K5(photoSize);
                minithumbnail = photo.minithumbnail;
                path2 = null;
                z3 = false;
                path = path2;
                break;
            case TdApi.MessageChatChangePhoto.CONSTRUCTOR:
                TdApi.ChatPhoto chatPhoto = ((TdApi.MessageChatChangePhoto) message.content).photo;
                photoSize = C4630f0.m26741j0(this.f31341a, chatPhoto.sizes, message.chatId);
                TdApi.PhotoSize I0 = C7321e.m17002I0(chatPhoto.sizes);
                thumbnail = (I0 == null || I0 == photoSize) ? null : C4779t2.m25655K5(photoSize);
                minithumbnail = chatPhoto.minithumbnail;
                path = null;
                z3 = true;
                break;
            case TdApi.MessageGame.CONSTRUCTOR:
                TdApi.Photo photo2 = ((TdApi.MessageGame) message.content).game.photo;
                photoSize = C4630f0.m26741j0(this.f31341a, photo2.sizes, message.chatId);
                minithumbnail2 = photo2.minithumbnail;
                minithumbnail = minithumbnail2;
                path2 = null;
                thumbnail = null;
                z3 = false;
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
                    z3 = false;
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
                z3 = true;
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
                z3 = false;
                photoSize2 = photoSize3;
                photoSize = photoSize2;
                path = photoSize2;
                break;
            case TdApi.MessageSticker.CONSTRUCTOR:
                TdApi.Sticker sticker = ((TdApi.MessageSticker) message.content).sticker;
                if (sticker != null) {
                    TdApi.Thumbnail thumbnail4 = sticker.thumbnail;
                    if (thumbnail4 == null) {
                        thumbnail4 = C4779t2.m25648L5(sticker);
                    }
                    TdApi.ClosedVectorPath[] closedVectorPathArr = sticker.outline;
                    int i = f31324o0;
                    Path b = C7321e.m16964b(closedVectorPathArr, Math.min(i / sticker.width, i / sticker.height));
                    minithumbnail = null;
                    thumbnail = thumbnail4;
                    z3 = false;
                    photoSize = null;
                    path = b;
                    break;
                } else {
                    return;
                }
            case TdApi.MessageText.CONSTRUCTOR:
                TdApi.WebPage webPage = ((TdApi.MessageText) message.content).webPage;
                if (webPage != null) {
                    TdApi.Photo photo3 = webPage.photo;
                    if (photo3 != null) {
                        photoSize = C4630f0.m26741j0(this.f31341a, photo3.sizes, message.chatId);
                        minithumbnail2 = webPage.photo.minithumbnail;
                        minithumbnail = minithumbnail2;
                        path2 = null;
                        thumbnail = null;
                        z3 = false;
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
                                    z3 = false;
                                    photoSize2 = photoSize3;
                                    photoSize = photoSize2;
                                    path = photoSize2;
                                    break;
                                }
                            } else {
                                TdApi.ClosedVectorPath[] closedVectorPathArr2 = sticker2.outline;
                                int i2 = f31324o0;
                                path2 = C7321e.m16964b(closedVectorPathArr2, Math.min(i2 / sticker2.width, i2 / sticker2.height));
                                photoSize = null;
                                minithumbnail = null;
                                z3 = false;
                                path = path2;
                            }
                        } else {
                            minithumbnail3 = document2.minithumbnail;
                            photoSize3 = null;
                            minithumbnail = minithumbnail3;
                            z3 = false;
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
                z3 = false;
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
                    z3 = false;
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
                z3 = false;
                path = path2;
                break;
        }
        C6246h D5 = C4779t2.m25704D5(this.f31341a, thumbnail);
        boolean z6 = D5 != null && thumbnail.format.getConstructor() == -53588974;
        if (D5 == null && photoSize != null) {
            D5 = new C6246h(this.f31341a, photoSize.photo);
        }
        if (D5 != null) {
            D5.m20897s0(z6 ? 1 : 2);
            if (!z6) {
                D5.m20930Z(true);
            }
            D5.mo20767t0(f31324o0);
            D5.m20909k0();
            if (z6) {
                D5.m20889x0();
            }
            if (z5) {
                D5.m20923d0();
                D5.m20919f0();
            }
        }
        if (minithumbnail != null) {
            C6246h iVar = new C6250i(minithumbnail);
            iVar.m20930Z(true);
            iVar.m20897s0(z6 ? 1 : 2);
            hVar = iVar;
        } else {
            hVar = null;
        }
        C4779t2.C4783d R0 = C4779t2.m25612R0(this.f31341a, message.chatId, message);
        if (!m7912A() || (messageForwardInfo = message.forwardInfo) == null) {
            this.f31328N = message.senderId;
            if (this.f31341a.m2613V6(message)) {
                str = message.authorSignature;
            }
            this.f31329O = str;
        } else {
            switch (messageForwardInfo.origin.getConstructor()) {
                case TdApi.MessageForwardOriginMessageImport.CONSTRUCTOR:
                    this.f31329O = ((TdApi.MessageForwardOriginMessageImport) message.forwardInfo.origin).senderName;
                    this.f31328N = null;
                    break;
                case TdApi.MessageForwardOriginUser.CONSTRUCTOR:
                    this.f31328N = new TdApi.MessageSenderUser(((TdApi.MessageForwardOriginUser) message.forwardInfo.origin).senderUserId);
                    this.f31329O = null;
                    break;
                case TdApi.MessageForwardOriginHiddenUser.CONSTRUCTOR:
                    this.f31329O = ((TdApi.MessageForwardOriginHiddenUser) message.forwardInfo.origin).senderName;
                    this.f31328N = null;
                    break;
                case TdApi.MessageForwardOriginChannel.CONSTRUCTOR:
                    TdApi.MessageForwardOriginChannel messageForwardOriginChannel = (TdApi.MessageForwardOriginChannel) message.forwardInfo.origin;
                    this.f31328N = new TdApi.MessageSenderChat(messageForwardOriginChannel.chatId);
                    if (!C5070i.m24061i(messageForwardOriginChannel.authorSignature)) {
                        str = messageForwardOriginChannel.authorSignature;
                    }
                    this.f31329O = str;
                    break;
                case TdApi.MessageForwardOriginChat.CONSTRUCTOR:
                    TdApi.MessageForwardOriginChat messageForwardOriginChat = (TdApi.MessageForwardOriginChat) message.forwardInfo.origin;
                    this.f31328N = new TdApi.MessageSenderChat(messageForwardOriginChat.senderChatId);
                    this.f31329O = messageForwardOriginChat.authorSignature;
                    break;
                default:
                    throw new IllegalArgumentException(message.forwardInfo.origin.toString());
            }
        }
        if (C5063c.m24144b(this.f31332R, 8)) {
            j1 = this.f31333S;
        } else if (this.f31328N == null) {
            j1 = this.f31329O;
        } else if (C5070i.m24061i(this.f31329O)) {
            j1 = this.f31341a.m2135zb(this.f31328N, m7910C());
        } else {
            j1 = C4403w.m27865j1(m7912A() ? R.string.format_channelAndSignature : R.string.format_chatAndSignature, this.f31341a.m2135zb(this.f31328N, m7910C()), this.f31329O);
        }
        String str2 = j1;
        if (Thread.currentThread() == C4383l.m28059a().m28056d() || z2) {
            this.f31334T = R0;
            m7887Z(str2);
            this.f31335U = hVar;
            this.f31337W = path;
            this.f31336V = D5;
            this.f31338X = z3;
            m7877h();
            if (z || !m7910C() || hVar != null || D5 != null) {
                z4 = true;
            }
            m7859z(z4);
            return;
        }
        m7890W(str2, R0, path, hVar, D5, z3, false);
    }

    public final void m7887Z(CharSequence charSequence) {
        this.f31333S = charSequence != null ? charSequence.toString() : null;
    }

    public void m7885a0(AbstractC4345j jVar) {
        this.f31344b0 = jVar;
    }

    @Override
    public void mo4501a3() {
        this.f31356m0 = true;
    }

    public int m7883b0(boolean z) {
        int i;
        int i2;
        if (!m7863v()) {
            int max = Math.max(m7868q(), m7864u());
            int i3 = f31325p0;
            i = max + i3 + i3;
            i2 = f31323n0;
        } else {
            int max2 = Math.max(m7868q(), m7864u());
            int i4 = f31325p0;
            int i5 = f31323n0;
            i = max2 + i4 + i5 + i5 + i4;
            i2 = m7910C() ? f31326q0 : f31324o0;
        }
        return i + i2 + (z ? C1357a0.m37541i(3.0f) : 0);
    }

    public final void m7878g() {
        AbstractC5411l0[] l0VarArr;
        int n = m7871n();
        C4779t2.C4783d dVar = this.f31334T;
        RunnableC5390g.C5392b j = new RunnableC5390g.C5392b(dVar != null ? dVar.m25375c(true) : C4403w.m27869i1(R.string.LoadingMessage), n, m7910C() ? AbstractC4761s4.m26125M4() : m7869p(), m7872m()).m22868v().m22865y(8).m22878l().m22880j();
        C4779t2.C4783d dVar2 = this.f31334T;
        AbstractC4345j jVar = null;
        if (dVar2 == null || C7321e.m16965a1(dVar2.f16272d)) {
            l0VarArr = null;
        } else {
            C10930q6 q6Var = this.f31341a;
            TdApi.FormattedText formattedText = this.f31334T.f16272d;
            l0VarArr = AbstractC5411l0.m22790E(q6Var, formattedText.text, formattedText.entities, null);
        }
        RunnableC5390g.C5392b i = j.m22881i(l0VarArr);
        AbstractC4345j jVar2 = this.f31344b0;
        if (jVar2 != null) {
            jVar = jVar2;
        } else {
            View view = this.f31342a0;
            if (view != null) {
                jVar = new C4343h(view);
            }
        }
        final RunnableC5390g f = i.m22864z(jVar).m22884f();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f31340Z = f;
        } else {
            C1379j0.m37334d0(new Runnable() {
                @Override
                public final void run() {
                    RunnableC9651s3.this.m7907F(f);
                }
            });
        }
    }

    public final void m7877h() {
        if (this.f31331Q > 0) {
            m7876i();
            m7878g();
        }
    }

    public final void m7876i() {
        int n = m7871n();
        String str = this.f31333S;
        if (str == null) {
            str = C4403w.m27869i1(m7912A() ? R.string.LoadingChannel : R.string.LoadingUser);
        }
        this.f31339Y = new RunnableC5390g.C5392b(str, n, m7865t(m7910C()), m7866s()).m22868v().m22883g().m22888b().m22886d().m22864z(this.f31344b0).m22884f();
    }

    public boolean m7875j(long j) {
        TdApi.Message message = this.f31355l0;
        if (message == null || message.f25406id != j) {
            return false;
        }
        m7890W(C4403w.m27869i1(R.string.Error), new C4779t2.C4783d((C4779t2.C4787f) null, (int) R.string.DeletedMessage), null, null, null, false, true);
        return true;
    }

    public void m7874k(Canvas canvas, int i, int i2, int i3, int i4, AbstractC6264v vVar, boolean z) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        AbstractC4761s4 s4Var = this.f31343b;
        boolean z2 = s4Var != null && s4Var.m26058S8();
        this.f31352i0 = i;
        this.f31353j0 = i2;
        boolean D = m7909D();
        RectF a0 = C1410y.m37050a0();
        if (z2) {
            int i10 = C1357a0.m37541i(8.0f);
            int i11 = C1357a0.m37541i(12.0f);
            a0.top = i2 - i10;
            a0.bottom = f31326q0 + i2 + i10;
            a0.left = i - i11;
            a0.right = i + i4;
            float I = C11524j.m238I();
            canvas.drawRoundRect(a0, I, I, C1410y.m37039g(this.f31343b.m25932g2()));
        }
        if (m7863v()) {
            int i12 = f31323n0;
            int i13 = i12 + i12;
            if (z) {
                i8 = (i3 - i13) - (m7910C() ? f31326q0 : f31324o0);
            } else {
                i8 = i13 + i;
            }
            if (m7910C()) {
                int i14 = f31326q0;
                vVar.mo20256K0(i8, i2, i8 + i14, i14 + i2);
            } else {
                int i15 = f31324o0;
                vVar.mo20256K0(i8, i2, i8 + i15, i15 + i2);
            }
            if (Build.VERSION.SDK_INT >= 19) {
                m7901L(vVar.getLeft(), vVar.getTop(), vVar.getRight(), vVar.getBottom());
                i9 = C10192g.m5789b(canvas, this.f31346c0);
            } else {
                i9 = Integer.MIN_VALUE;
            }
            if (vVar.mo20246c0()) {
                vVar.mo20254O(canvas, this.f31337W);
            }
            vVar.draw(canvas);
            C10192g.m5785f(canvas, i9);
        }
        if (m7910C()) {
            int o = m7870o();
            RunnableC5390g gVar = this.f31339Y;
            if (gVar != null) {
                int i16 = i + o;
                gVar.m22901u(canvas, i16, gVar.getWidth() + i16, 0, i2 + C1357a0.m37541i(1.0f));
            }
            RunnableC5390g gVar2 = this.f31340Z;
            if (gVar2 != null) {
                int i17 = i + o;
                gVar2.m22901u(canvas, i17, i17 + gVar2.getWidth(), 0, i2 + C1357a0.m37541i(22.0f));
            }
            if (z) {
                a0.set(i3 - f31323n0, i2, i3, f31326q0 + i2);
            } else {
                a0.set(i, i2, f31323n0 + i, f31326q0 + i2);
            }
            int i18 = f31323n0;
            float f = i18 / 2;
            float f2 = i18 / 2;
            if (z2) {
                i6 = this.f31343b.m25922h2();
            } else {
                if (D) {
                    i7 = R.id.theme_color_bubbleOut_chatVerticalLine;
                } else {
                    i7 = this.f31330P;
                    if (i7 == 0) {
                        i6 = C11524j.m228N(R.id.theme_color_messageVerticalLine);
                    }
                }
                i6 = C11524j.m228N(i7);
            }
            canvas.drawRoundRect(a0, f, f2, C1410y.m37039g(i6));
            return;
        }
        if (m7863v()) {
            int i19 = f31323n0;
            i5 = i + i19 + f31325p0 + i19 + f31324o0;
        } else {
            i5 = f31323n0 + i + f31325p0;
        }
        RunnableC5390g gVar3 = this.f31339Y;
        if (gVar3 != null) {
            gVar3.m22901u(canvas, i5, i5 + gVar3.getWidth(), 0, i2 + C1357a0.m37541i(1.0f));
        }
        RunnableC5390g gVar4 = this.f31340Z;
        if (gVar4 != null) {
            gVar4.m22901u(canvas, i5, i5 + gVar4.getWidth(), 0, i2 + C1357a0.m37541i(19.0f));
        }
        C1410y.m37050a0().set(i, i2, f31323n0 + i, f31324o0 + i2);
        RectF a02 = C1410y.m37050a0();
        int i20 = f31323n0;
        canvas.drawRoundRect(a02, i20 / 2, i20 / 2, C1410y.m37039g(C11524j.m228N(R.id.theme_color_messageVerticalLine)));
    }

    public String m7873l() {
        TdApi.MessageSender messageSender = this.f31328N;
        return messageSender != null ? this.f31341a.m2151yb(messageSender) : this.f31329O;
    }

    public final AbstractC5408k m7872m() {
        AbstractC4761s4 s4Var = this.f31343b;
        if (s4Var != null) {
            return s4Var.m26058S8() ? new C9652a() : new C9653b();
        }
        if (C5063c.m24144b(this.f31332R, 2)) {
            return C5428t.AbstractC5441d.f17872C;
        }
        return new C9654c();
    }

    public final int m7871n() {
        int i;
        int i2;
        if (!m7863v()) {
            int i3 = this.f31331Q;
            i2 = f31325p0;
            i = (i3 - i2) - f31323n0;
        } else {
            int i4 = this.f31331Q;
            int i5 = f31325p0;
            int i6 = (i4 - i5) - i5;
            int i7 = f31323n0;
            i = (i6 - i7) - i7;
            i2 = m7910C() ? f31326q0 : f31324o0;
        }
        return i - i2;
    }

    public final int m7870o() {
        if (m7863v()) {
            int i = f31323n0;
            return f31325p0 + i + i + f31326q0;
        }
        return f31325p0 + f31323n0;
    }

    public final int m7868q() {
        RunnableC5390g gVar = this.f31340Z;
        if (gVar != null) {
            return gVar.getWidth();
        }
        return 0;
    }

    public final CharSequence m7867r(CharSequence charSequence, TdApi.Message message) {
        if (!C5070i.m24061i(charSequence)) {
            return charSequence;
        }
        if (message != null) {
            return this.f31341a.m2655S9(message, false, m7910C());
        }
        return C4403w.m27869i1(m7912A() ? R.string.LoadingChannel : R.string.LoadingUser);
    }

    @Override
    public void run() {
        View view = this.f31342a0;
        if (view != null) {
            view.invalidate();
            if (this.f31343b != null) {
                KeyEvent.Callback callback = this.f31342a0;
                if (callback instanceof C9565i1) {
                    callback = ((C9565i1) callback).getMessageView();
                }
                if (callback instanceof C9552h1) {
                    ((C9552h1) callback).m8339d0();
                }
            }
            View view2 = this.f31342a0;
            if (view2 instanceof View$OnClickListenerC9659t3) {
                ((View$OnClickListenerC9659t3) view2).m7846D1();
                return;
            }
            return;
        }
        AbstractC4345j jVar = this.f31344b0;
        if (jVar != null) {
            jVar.invalidate();
            if (m7910C()) {
                this.f31343b.m26172H5();
            }
        }
    }

    public final AbstractC5408k m7866s() {
        AbstractC4761s4 s4Var = this.f31343b;
        if (s4Var == null) {
            return C5428t.AbstractC5441d.f17872C;
        }
        if (s4Var.m26058S8()) {
            final AbstractC4761s4 s4Var2 = this.f31343b;
            Objects.requireNonNull(s4Var2);
            return new AbstractC5408k() {
                @Override
                public int mo7858Q() {
                    return C5406j.m22807d(this);
                }

                @Override
                public long mo7857X0(boolean z) {
                    return C5406j.m22808c(this, z);
                }

                @Override
                public int mo7856b1() {
                    return C5406j.m22805f(this);
                }

                @Override
                public final int mo7855c() {
                    return AbstractC4761s4.this.m25922h2();
                }

                @Override
                public int mo7854e(boolean z) {
                    return C5406j.m22809b(this, z);
                }

                @Override
                public int mo7853g(boolean z) {
                    return C5406j.m22803h(this, z);
                }

                @Override
                public int mo7852o0(boolean z) {
                    return C5406j.m22806e(this, z);
                }

                @Override
                public int mo7851p0(boolean z) {
                    return C5406j.m22810a(this, z);
                }

                @Override
                public int mo7850r0(boolean z) {
                    return C5406j.m22804g(this, z);
                }
            };
        } else if (this.f31330P != 0) {
            return new AbstractC5408k() {
                @Override
                public int mo7858Q() {
                    return C5406j.m22807d(this);
                }

                @Override
                public long mo7857X0(boolean z) {
                    return C5406j.m22808c(this, z);
                }

                @Override
                public int mo7856b1() {
                    return C5406j.m22805f(this);
                }

                @Override
                public final int mo7855c() {
                    int G;
                    G = RunnableC9651s3.this.m7906G();
                    return G;
                }

                @Override
                public int mo7854e(boolean z) {
                    return C5406j.m22809b(this, z);
                }

                @Override
                public int mo7853g(boolean z) {
                    return C5406j.m22803h(this, z);
                }

                @Override
                public int mo7852o0(boolean z) {
                    return C5406j.m22806e(this, z);
                }

                @Override
                public int mo7851p0(boolean z) {
                    return C5406j.m22810a(this, z);
                }

                @Override
                public int mo7850r0(boolean z) {
                    return C5406j.m22804g(this, z);
                }
            };
        } else {
            if (m7908E()) {
                return this.f31343b.m26155J2();
            }
            return this.f31343b.m26175H2();
        }
    }

    @Override
    public void mo255t2(TdApi.Object object) {
        if (!this.f31356m0) {
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                TdApi.Function function = this.f31354k0;
                if (function != null) {
                    this.f31354k0 = null;
                    this.f31341a.m2270r4().m14783o(function, this);
                    return;
                }
                m7890W(C4403w.m27869i1(R.string.Error), C4779t2.m25481l0(object) == 404 ? new C4779t2.C4783d((C4779t2.C4787f) null, (int) R.string.DeletedMessage) : new C4779t2.C4783d((C4779t2.C4787f) null, 0, C4779t2.m25378z5(object), true), null, null, null, false, false);
                this.f31355l0 = null;
            } else if (constructor != 1435961258) {
                Log.unexpectedTdlibResponse(object, TdApi.GetMessage.class, TdApi.Message.class);
            } else {
                m7898O((TdApi.Message) object, false);
            }
            this.f31332R &= -17;
        }
    }

    public final int m7864u() {
        RunnableC5390g gVar = this.f31339Y;
        if (gVar != null) {
            return gVar.getWidth();
        }
        return 0;
    }

    public final boolean m7863v() {
        return (this.f31335U == null && this.f31336V == null) ? false : true;
    }

    public boolean m7862w() {
        return this.f31355l0 != null;
    }

    public void m7859z(boolean z) {
        if (z) {
            C1379j0.m37334d0(this);
            return;
        }
        View view = this.f31342a0;
        if (view != null) {
            C1379j0.m37355M(view);
            return;
        }
        AbstractC4345j jVar = this.f31344b0;
        if (jVar != null) {
            jVar.mo28224h();
        }
    }

    public RunnableC9651s3(AbstractC4761s4 s4Var) {
        if (f31323n0 == 0) {
            m7860y();
        }
        this.f31341a = s4Var.mo4348c();
        this.f31343b = s4Var;
        TdApi.Message Z3 = s4Var.m25993Z3();
        this.f31345c = Z3.chatId;
        this.f31327M = Z3.replyToMessageId;
    }
}
