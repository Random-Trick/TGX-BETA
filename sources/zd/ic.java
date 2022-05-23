package zd;

import ce.o;
import ce.w;
import eb.f;
import eb.k;
import gd.w;
import hd.t2;
import ib.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import je.g;
import lb.h;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import ud.v4;

public class ic implements j0 {
    public final o6 f27735a;
    public final HashMap<String, b> f27736b = new HashMap<>();
    public final h<String, c> f27737c = new h<>();

    public static class a {
        public final TdApi.MessageSender f27738a;
        public TdApi.ChatAction f27739b;

        public a(TdApi.MessageSender messageSender, TdApi.ChatAction chatAction) {
            this.f27738a = messageSender;
            this.f27739b = chatAction;
        }
    }

    public static class b implements k.b {
        public final long M;
        public final long N;
        public final String O;
        public final boolean P;
        public boolean Q;
        public f R;
        public String S;
        public float T;
        public TdApi.ChatAction U;
        public int V;
        public final ArrayList<a> f27740a = new ArrayList<>();
        public final ic f27741b;
        public final o6 f27742c;

        public b(ic icVar, o6 o6Var, long j10, long j11) {
            this.f27741b = icVar;
            this.f27742c = o6Var;
            this.M = j10;
            this.N = j11;
            this.O = ic.w(j10, j11);
            this.P = ob.a.l(j10);
        }

        public TdApi.ChatAction a() {
            return this.U;
        }

        public final void b(int i10) {
            if (i10 != 0) {
                boolean z10 = !this.f27740a.isEmpty();
                if (z10) {
                    if ((i10 & 1) != 0) {
                        m();
                    } else if ((i10 & 2) != 0) {
                        l();
                    }
                }
                if (this.Q != z10) {
                    i(z10, this.f27741b.l(this.M, this.N, this.O, this));
                }
                ic.x(this.M, this.N, this, i10, this.f27741b.f27737c.d(this.O));
            }
        }

        public boolean c() {
            return this.f27740a.isEmpty() && this.T == 0.0f;
        }

        public boolean d() {
            TdApi.ChatAction chatAction;
            return !this.f27740a.isEmpty() && this.T == 1.0f && (chatAction = this.U) != null && ce.b.E(chatAction);
        }

        public int e() {
            return this.V;
        }

        public void f(TdApi.MessageSender messageSender, TdApi.ChatAction chatAction) {
            Iterator<a> it = this.f27740a.iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i10 = -1;
                    break;
                }
                a next = it.next();
                if (!ob.e.Y(messageSender, next.f27738a)) {
                    i10++;
                } else if (ob.e.B(next.f27739b, chatAction)) {
                    return;
                }
            }
            b(g(i10, messageSender, chatAction));
        }

        public final int g(int i10, TdApi.MessageSender messageSender, TdApi.ChatAction chatAction) {
            if (chatAction.getConstructor() == 1160523958) {
                if (i10 == -1) {
                    return 0;
                }
                this.f27740a.remove(i10);
                return 1;
            } else if (i10 != -1) {
                a aVar = this.f27740a.get(i10);
                TdApi.ChatAction chatAction2 = aVar.f27739b;
                aVar.f27739b = chatAction;
                return chatAction2.getConstructor() == chatAction.getConstructor() ? 2 : 3;
            } else {
                this.f27740a.add(0, new a(messageSender, chatAction));
                return 1;
            }
        }

        public void h(TdApi.ChatAction chatAction) {
            int i10 = 0;
            for (int size = this.f27740a.size() - 1; size >= 0; size--) {
                i10 |= g(size, this.f27740a.get(size).f27738a, chatAction);
            }
            b(i10);
        }

        public final void i(boolean z10, boolean z11) {
            if (this.Q != z10 || !z11) {
                this.Q = z10;
                if (z11) {
                    if (this.R == null) {
                        this.R = new f(0, this, db.b.f7287b, 180L, !z10);
                    }
                    this.R.p(z10, true);
                    return;
                }
                f fVar = this.R;
                if (fVar != null) {
                    fVar.p(z10, false);
                }
                j(z10 ? 1.0f : 0.0f);
            }
        }

        public final void j(float f10) {
            if (this.T != f10) {
                this.T = f10;
                ic.x(this.M, this.N, this, 4, this.f27741b.f27737c.d(this.O));
            }
        }

        public String k() {
            return this.S;
        }

        public final void l() {
            TdApi.ChatAction chatAction = null;
            int i10 = 0;
            if (!this.P) {
                Iterator<a> it = this.f27740a.iterator();
                TdApi.ChatAction chatAction2 = null;
                int i11 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i10 = i11;
                        chatAction = chatAction2;
                        break;
                    }
                    a next = it.next();
                    int Z1 = t2.Z1(next.f27739b);
                    if (Z1 != -1) {
                        i11 += Z1;
                    }
                    if (chatAction2 == null) {
                        chatAction2 = next.f27739b;
                    } else if (chatAction2.getConstructor() != next.f27739b.getConstructor()) {
                        break;
                    }
                }
            } else {
                chatAction = this.f27740a.get(0).f27739b;
                i10 = t2.Z1(chatAction);
            }
            this.U = chatAction;
            this.V = i10;
        }

        public final void m() {
            int i10;
            int i11;
            TdApi.ChatAction chatAction;
            int i12;
            String str = null;
            if (this.P) {
                chatAction = this.f27740a.get(0).f27739b;
                i11 = t2.Z1(chatAction);
                i10 = 1;
            } else {
                StringBuilder sb2 = new StringBuilder();
                if (o.m()) {
                    sb2.append("\u200e");
                }
                ArrayList arrayList = new ArrayList();
                Iterator<a> it = this.f27740a.iterator();
                TdApi.ChatAction chatAction2 = null;
                int i13 = 0;
                int i14 = 0;
                boolean z10 = false;
                i10 = 0;
                while (it.hasNext()) {
                    a next = it.next();
                    if (!z10) {
                        int Z1 = t2.Z1(next.f27739b);
                        if (Z1 != -1) {
                            i13 += Z1;
                        }
                        if (chatAction2 == null) {
                            chatAction2 = next.f27739b;
                        } else if (chatAction2.getConstructor() != next.f27739b.getConstructor()) {
                            chatAction2 = null;
                            i13 = 0;
                            z10 = true;
                        }
                    }
                    i10++;
                    if (i10 <= 2) {
                        arrayList.add(this.f27742c.Cb(next.f27738a));
                    } else {
                        i14++;
                    }
                }
                sb2.append(w.x2(arrayList, i14));
                if (o.o()) {
                    sb2.append("\u2069");
                }
                str = sb2.toString();
                chatAction = chatAction2;
                i11 = i13;
            }
            this.U = chatAction;
            this.V = i11;
            if (chatAction == null) {
                this.S = str + (char) 8230;
                return;
            }
            switch (chatAction.getConstructor()) {
                case TdApi.ChatActionChoosingLocation.CONSTRUCTOR:
                    if (!this.P) {
                        if (i10 != 1) {
                            i12 = R.string.AreSendingLocation;
                            break;
                        } else {
                            i12 = R.string.IsSendingLocation;
                            break;
                        }
                    } else {
                        i12 = R.string.SendingLocation;
                        break;
                    }
                case TdApi.ChatActionChoosingContact.CONSTRUCTOR:
                    if (!this.P) {
                        if (i10 != 1) {
                            i12 = R.string.AreSendingContact;
                            break;
                        } else {
                            i12 = R.string.IsSendingContact;
                            break;
                        }
                    } else {
                        i12 = R.string.SendingContact;
                        break;
                    }
                case TdApi.ChatActionStartPlayingGame.CONSTRUCTOR:
                    if (!this.P) {
                        if (i10 != 1) {
                            i12 = R.string.AreSendingGame;
                            break;
                        } else {
                            i12 = R.string.IsSendingGame;
                            break;
                        }
                    } else {
                        i12 = R.string.SendingGame;
                        break;
                    }
                case TdApi.ChatActionRecordingVoiceNote.CONSTRUCTOR:
                    if (!this.P) {
                        if (i10 != 1) {
                            i12 = R.string.AreRecordingAudio;
                            break;
                        } else {
                            i12 = R.string.IsRecordingAudio;
                            break;
                        }
                    } else {
                        i12 = R.string.RecordingAudio;
                        break;
                    }
                case TdApi.ChatActionUploadingVoiceNote.CONSTRUCTOR:
                    if (!this.P) {
                        if (i10 != 1) {
                            i12 = R.string.AreSendingVoice;
                            break;
                        } else {
                            i12 = R.string.IsSendingVoice;
                            break;
                        }
                    } else {
                        i12 = R.string.SendingVoice;
                        break;
                    }
                case TdApi.ChatActionRecordingVideoNote.CONSTRUCTOR:
                    if (!this.P) {
                        if (i10 != 1) {
                            i12 = R.string.AreRecordingRound;
                            break;
                        } else {
                            i12 = R.string.IsRecordingRound;
                            break;
                        }
                    } else {
                        i12 = R.string.RecordingRound;
                        break;
                    }
                case TdApi.ChatActionUploadingDocument.CONSTRUCTOR:
                    if (!this.P) {
                        if (i10 != 1) {
                            i12 = R.string.AreSendingFile;
                            break;
                        } else {
                            i12 = R.string.IsSendingFile;
                            break;
                        }
                    } else {
                        i12 = R.string.SendingFile;
                        break;
                    }
                case TdApi.ChatActionRecordingVideo.CONSTRUCTOR:
                    if (!this.P) {
                        if (i10 != 1) {
                            i12 = R.string.AreRecordingVideo;
                            break;
                        } else {
                            i12 = R.string.IsRecordingVideo;
                            break;
                        }
                    } else {
                        i12 = R.string.RecordingVideo;
                        break;
                    }
                case TdApi.ChatActionChoosingSticker.CONSTRUCTOR:
                    if (!this.P) {
                        if (i10 != 1) {
                            i12 = R.string.AreChoosingSticker;
                            break;
                        } else {
                            i12 = R.string.IsChoosingSticker;
                            break;
                        }
                    } else {
                        i12 = R.string.ChoosingSticker;
                        break;
                    }
                case TdApi.ChatActionTyping.CONSTRUCTOR:
                    if (!this.P) {
                        if (i10 != 1) {
                            i12 = R.string.AreTypingGroup;
                            break;
                        } else {
                            i12 = R.string.IsTypingGroup;
                            break;
                        }
                    } else {
                        i12 = R.string.Typing;
                        break;
                    }
                case TdApi.ChatActionUploadingPhoto.CONSTRUCTOR:
                    if (!this.P) {
                        if (i10 != 1) {
                            i12 = R.string.AreSendingPhoto;
                            break;
                        } else {
                            i12 = R.string.IsSendingPhoto;
                            break;
                        }
                    } else {
                        i12 = R.string.SendingPhoto;
                        break;
                    }
                case TdApi.ChatActionUploadingVideoNote.CONSTRUCTOR:
                    if (!this.P) {
                        if (i10 != 1) {
                            i12 = R.string.AreSendingRound;
                            break;
                        } else {
                            i12 = R.string.IsSendingRound;
                            break;
                        }
                    } else {
                        i12 = R.string.SendingRound;
                        break;
                    }
                case TdApi.ChatActionUploadingVideo.CONSTRUCTOR:
                    if (!this.P) {
                        if (i10 != 1) {
                            i12 = R.string.AreSendingVideos;
                            break;
                        } else {
                            i12 = R.string.IsSendingVideo;
                            break;
                        }
                    } else {
                        i12 = R.string.SendingVideo;
                        break;
                    }
                default:
                    throw new IllegalArgumentException(Integer.toString(chatAction.getConstructor()));
            }
            this.S = this.P ? w.i1(i12) : w.j1(i12, str);
        }

        public float n() {
            return this.T;
        }

        @Override
        public void n4(int i10, float f10, float f11, k kVar) {
            j(f10);
        }

        @Override
        public void o4(int i10, float f10, k kVar) {
        }
    }

    public interface c {
        void a(long j10, long j11, b bVar, int i10);

        boolean b(long j10, long j11, b bVar);
    }

    public static class d implements w.a, c {
        public final o6 f27743a;
        public final org.thunderdog.challegram.a f27744b;
        public final e f27745c;
        public final v4<?> f27746d;
        public b f27747e;
        public String f27748f;
        public int f27749g;
        public g f27750h;
        public boolean f27751i;
        public long f27752j;
        public long f27753k;

        public d(org.thunderdog.challegram.a aVar, o6 o6Var, e eVar, v4<?> v4Var) {
            if (o6Var == null) {
                throw new IllegalArgumentException();
            } else if (aVar != null) {
                this.f27743a = o6Var;
                this.f27744b = aVar;
                this.f27745c = eVar;
                this.f27746d = v4Var;
            } else {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public void a(long j10, long j11, b bVar, int i10) {
            n(bVar, i10);
        }

        @Override
        public boolean b(long j10, long j11, b bVar) {
            return this.f27745c.p();
        }

        @Override
        public long c(ce.w wVar) {
            this.f27745c.n(true);
            return -1L;
        }

        @Override
        public v4<?> d(ce.w wVar) {
            v4<?> v4Var = this.f27746d;
            if (v4Var != null) {
                return v4Var.Z9();
            }
            return null;
        }

        public int e() {
            return this.f27749g;
        }

        public void f(long j10, long j11) {
            long j12 = this.f27752j;
            if (j12 != j10 || this.f27753k != j11) {
                if (j12 != 0) {
                    this.f27743a.Bc().z(this.f27752j, this.f27753k, this);
                }
                this.f27752j = j10;
                this.f27753k = j11;
                if (j10 != 0) {
                    this.f27743a.Bc().k(j10, j11, this);
                }
                n(this.f27743a.Bc().A(j10, j11), -1);
            }
        }

        public void g() {
            if (this.f27752j != 0) {
                this.f27743a.Bc().z(this.f27752j, this.f27753k, this);
                this.f27752j = 0L;
                this.f27753k = 0L;
                n(null, -1);
            }
        }

        public b h() {
            b bVar = this.f27747e;
            if (bVar == null || bVar.c()) {
                return null;
            }
            return this.f27747e;
        }

        public g i() {
            return this.f27750h;
        }

        public String j() {
            return this.f27748f;
        }

        public final void k(String str, TdApi.ChatAction chatAction) {
            this.f27749g = ce.b.D(chatAction);
            if (!i.c(this.f27748f, str)) {
                this.f27748f = str;
                if (i.i(str)) {
                    l(null);
                } else {
                    this.f27745c.q();
                }
            }
        }

        public void l(g gVar) {
            this.f27750h = gVar;
        }

        public final void m(boolean z10) {
            if (this.f27751i != z10) {
                this.f27751i = z10;
                if (z10) {
                    this.f27744b.q1().c(this);
                } else {
                    this.f27744b.q1().f(this);
                }
            }
        }

        public void n(b bVar, int i10) {
            boolean z10 = false;
            boolean z11 = this.f27747e == null || (i10 & 1) != 0;
            this.f27747e = bVar;
            if (z11 && bVar != null) {
                k(bVar.k(), bVar.a());
            }
            m(bVar != null && bVar.d() && this.f27745c.u());
            int i11 = i10 & (-3);
            e eVar = this.f27745c;
            if (!z11 && i11 == 0) {
                z10 = true;
            }
            eVar.n(z10);
        }
    }

    public interface e {
        void n(boolean z10);

        boolean p();

        void q();

        boolean u();
    }

    public ic(o6 o6Var) {
        this.f27735a = o6Var;
        o6Var.O9().l(this);
    }

    public void v() {
        if (!this.f27736b.isEmpty()) {
            TdApi.ChatActionCancel chatActionCancel = new TdApi.ChatActionCancel();
            for (Map.Entry<String, b> entry : this.f27736b.entrySet()) {
                entry.getValue().h(chatActionCancel);
            }
        }
    }

    public static String w(long j10, long j11) {
        if (j11 == 0) {
            return Long.toString(j10);
        }
        return j10 + "_" + j11;
    }

    public static void x(long j10, long j11, b bVar, int i10, Iterator<c> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().a(j10, j11, bVar, i10);
            }
        }
    }

    public b A(long j10, long j11) {
        return this.f27736b.get(w(j10, j11));
    }

    @Override
    public void a() {
        this.f27735a.hd().post(new Runnable() {
            @Override
            public final void run() {
                ic.this.v();
            }
        });
    }

    @Override
    public void b(boolean z10) {
    }

    @Override
    public void c() {
        this.f27736b.clear();
        this.f27737c.c();
    }

    public final void k(long j10, long j11, c cVar) {
        this.f27737c.b(w(j10, j11), cVar);
    }

    public final boolean l(long j10, long j11, String str, b bVar) {
        Iterator<c> d10 = this.f27737c.d(str);
        boolean z10 = false;
        if (d10 != null) {
            while (d10.hasNext()) {
                if (d10.next().b(j10, j11, bVar)) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public CharSequence m(long j10) {
        if (j10 == 0) {
            return "chat unavailable";
        }
        switch (ob.a.d(j10)) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                return t(ob.a.p(j10));
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
                TdApi.SecretChat b42 = this.f27735a.b4(j10);
                return b42 != null ? q(b42.userId) : "unknown secret chat";
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                return p(ob.a.m(j10));
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                return q(ob.a.q(j10));
            default:
                throw new IllegalArgumentException(Long.toString(j10));
        }
    }

    public CharSequence n(TdApi.Chat chat) {
        if (chat == null) {
            return "chat unavailable";
        }
        switch (chat.type.getConstructor()) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                return t(((TdApi.ChatTypeSupergroup) chat.type).supergroupId);
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
                return q(((TdApi.ChatTypeSecret) chat.type).userId);
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                return p(((TdApi.ChatTypeBasicGroup) chat.type).basicGroupId);
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                return q(((TdApi.ChatTypePrivate) chat.type).userId);
            default:
                throw new IllegalArgumentException(chat.type.toString());
        }
    }

    public CharSequence o(TdApi.Chat chat) {
        if (chat == null) {
            return null;
        }
        int constructor = chat.type.getConstructor();
        if (constructor == 862366513 || constructor == 1579049844) {
            return s(t2.n2(chat), this.f27735a.f4(chat), true, false);
        }
        return null;
    }

    public final CharSequence p(long j10) {
        TdApi.BasicGroup M = this.f27735a.e2().M(j10);
        if (M == null || !M.isActive) {
            return gd.w.i1(R.string.inactiveGroup);
        }
        if (t2.f3(M.status)) {
            return gd.w.i1(R.string.notInChat);
        }
        if (t2.d3(M.status)) {
            return gd.w.i1(R.string.YouWereKicked);
        }
        return gd.w.w2(M.memberCount, this.f27735a.z3(ob.a.a(j10)), false);
    }

    public String q(long j10) {
        return s(j10, this.f27735a.e2().u2(j10), true, true);
    }

    public String r(long j10, TdApi.User user, boolean z10) {
        return s(j10, user, z10, true);
    }

    public String s(long j10, TdApi.User user, boolean z10, boolean z11) {
        if (z10 && this.f27735a.o7(j10)) {
            return gd.w.Z1(gd.w.i1(R.string.ChatWithYourself));
        }
        long c10 = ob.a.c(j10);
        if (this.f27735a.p7(c10)) {
            return gd.w.i1(R.string.ServiceNotifications);
        }
        if (this.f27735a.i7(c10)) {
            return gd.w.i1(R.string.ReplyNotifications);
        }
        if (user == null) {
            return gd.w.i1(R.string.UserUnavailable);
        }
        if (user.isSupport) {
            return gd.w.i1(user.status instanceof TdApi.UserStatusOnline ? R.string.SupportOnline : R.string.Support);
        }
        int constructor = user.type.getConstructor();
        if (constructor == -1807729372) {
            return gd.w.i1(R.string.deletedUser);
        }
        if (constructor == -970625144) {
            return gd.w.i1(R.string.Bot);
        }
        if (constructor != -724541123) {
            return gd.w.D1(this.f27735a, user.status, z11);
        }
        return gd.w.i1(R.string.unknownUser);
    }

    public final CharSequence t(long j10) {
        boolean z10 = true;
        TdApi.SupergroupFullInfo i22 = this.f27735a.e2().i2(j10, true);
        int i10 = i22 != null ? i22.memberCount : 0;
        TdApi.Supergroup g22 = this.f27735a.e2().g2(j10);
        if (i10 == 0) {
            i10 = g22 != null ? g22.memberCount : 0;
        }
        if (i10 > 0) {
            int z32 = this.f27735a.z3(ob.a.b(j10));
            if (g22 == null || !g22.isChannel) {
                z10 = false;
            }
            return gd.w.w2(i10, z32, z10);
        } else if (g22 == null) {
            return "channel unavailable";
        } else {
            return gd.w.Z1(gd.w.i1(g22.isChannel ? i.i(g22.username) ? R.string.ChannelPrivate : R.string.Channel : !i.i(g22.username) ? R.string.PublicGroup : R.string.Group));
        }
    }

    public boolean u(long j10) {
        TdApi.User u22;
        return !this.f27735a.o7(j10) && !this.f27735a.p7(ob.a.c(j10)) && (u22 = this.f27735a.e2().u2(j10)) != null && u22.type.getConstructor() == -598644325 && u22.status.getConstructor() == -1529460876;
    }

    public void y(TdApi.UpdateChatAction updateChatAction) {
        if (updateChatAction.action.getConstructor() != 2052990641) {
            String w10 = w(updateChatAction.chatId, updateChatAction.messageThreadId);
            b bVar = this.f27736b.get(w10);
            if (bVar == null) {
                if (updateChatAction.action.getConstructor() != 1160523958) {
                    bVar = new b(this, this.f27735a, updateChatAction.chatId, updateChatAction.messageThreadId);
                    this.f27736b.put(w10, bVar);
                } else {
                    return;
                }
            }
            bVar.f(updateChatAction.senderId, updateChatAction.action);
        }
    }

    public final void z(long j10, long j11, c cVar) {
        this.f27737c.g(w(j10, j11), cVar);
    }
}
