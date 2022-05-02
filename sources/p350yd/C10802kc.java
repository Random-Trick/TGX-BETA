package p350yd;

import be.C1359b;
import be.C1389o;
import be.C1406w;
import gd.C4779t2;
import ie.RunnableC5390g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3940f;
import p051db.C3950k;
import p082fd.C4403w;
import p108hb.C5070i;
import p154kb.C6233h;
import p193nb.C7316a;
import p193nb.C7321e;
import td.AbstractC9323v4;

public class C10802kc implements AbstractC10816l0 {
    public final C10930q6 f34577a;
    public final HashMap<String, C10804b> f34578b = new HashMap<>();
    public final C6233h<String, AbstractC10805c> f34579c = new C6233h<>();

    public static class C10803a {
        public final TdApi.MessageSender f34580a;
        public TdApi.ChatAction f34581b;

        public C10803a(TdApi.MessageSender messageSender, TdApi.ChatAction chatAction) {
            this.f34580a = messageSender;
            this.f34581b = chatAction;
        }
    }

    public static class C10804b implements C3950k.AbstractC3952b {
        public final long f34582M;
        public final long f34583N;
        public final String f34584O;
        public final boolean f34585P;
        public boolean f34586Q;
        public C3940f f34587R;
        public String f34588S;
        public float f34589T;
        public TdApi.ChatAction f34590U;
        public int f34591V;
        public final ArrayList<C10803a> f34592a = new ArrayList<>();
        public final C10802kc f34593b;
        public final C10930q6 f34594c;

        public C10804b(C10802kc kcVar, C10930q6 q6Var, long j, long j2) {
            this.f34593b = kcVar;
            this.f34594c = q6Var;
            this.f34582M = j;
            this.f34583N = j2;
            this.f34584O = C10802kc.m3286w(j, j2);
            this.f34585P = C7316a.m17049l(j);
        }

        @Override
        public void mo45P5(int i, float f, float f2, C3950k kVar) {
            m3273j(f);
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
        }

        public TdApi.ChatAction m3282a() {
            return this.f34590U;
        }

        public final void m3281b(int i) {
            if (i != 0) {
                boolean z = !this.f34592a.isEmpty();
                if (z) {
                    if ((i & 1) != 0) {
                        m3270m();
                    } else if ((i & 2) != 0) {
                        m3271l();
                    }
                }
                if (this.f34586Q != z) {
                    m3274i(z, this.f34593b.m3297l(this.f34582M, this.f34583N, this.f34584O, this));
                }
                C10802kc.m3285x(this.f34582M, this.f34583N, this, i, this.f34593b.f34579c.m21019d(this.f34584O));
            }
        }

        public boolean m3280c() {
            return this.f34592a.isEmpty() && this.f34589T == 0.0f;
        }

        public boolean m3279d() {
            TdApi.ChatAction chatAction;
            return !this.f34592a.isEmpty() && this.f34589T == 1.0f && (chatAction = this.f34590U) != null && C1359b.m37519E(chatAction);
        }

        public int m3278e() {
            return this.f34591V;
        }

        public void m3277f(TdApi.MessageSender messageSender, TdApi.ChatAction chatAction) {
            Iterator<C10803a> it = this.f34592a.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                C10803a next = it.next();
                if (!C7321e.m16975W(messageSender, next.f34580a)) {
                    i++;
                } else if (C7321e.m17019A(next.f34581b, chatAction)) {
                    return;
                }
            }
            m3281b(m3276g(i, messageSender, chatAction));
        }

        public final int m3276g(int i, TdApi.MessageSender messageSender, TdApi.ChatAction chatAction) {
            if (chatAction.getConstructor() == 1160523958) {
                if (i == -1) {
                    return 0;
                }
                this.f34592a.remove(i);
                return 1;
            } else if (i != -1) {
                C10803a aVar = this.f34592a.get(i);
                TdApi.ChatAction chatAction2 = aVar.f34581b;
                aVar.f34581b = chatAction;
                return chatAction2.getConstructor() == chatAction.getConstructor() ? 2 : 3;
            } else {
                this.f34592a.add(0, new C10803a(messageSender, chatAction));
                return 1;
            }
        }

        public void m3275h(TdApi.ChatAction chatAction) {
            int i = 0;
            for (int size = this.f34592a.size() - 1; size >= 0; size--) {
                i |= m3276g(size, this.f34592a.get(size).f34580a, chatAction);
            }
            m3281b(i);
        }

        public final void m3274i(boolean z, boolean z2) {
            if (this.f34586Q != z || !z2) {
                this.f34586Q = z;
                if (z2) {
                    if (this.f34587R == null) {
                        this.f34587R = new C3940f(0, this, C2057b.f7280b, 180L, !z);
                    }
                    this.f34587R.m29575p(z, true);
                    return;
                }
                C3940f fVar = this.f34587R;
                if (fVar != null) {
                    fVar.m29575p(z, false);
                }
                m3273j(z ? 1.0f : 0.0f);
            }
        }

        public final void m3273j(float f) {
            if (this.f34589T != f) {
                this.f34589T = f;
                C10802kc.m3285x(this.f34582M, this.f34583N, this, 4, this.f34593b.f34579c.m21019d(this.f34584O));
            }
        }

        public String m3272k() {
            return this.f34588S;
        }

        public final void m3271l() {
            TdApi.ChatAction chatAction = null;
            int i = 0;
            if (!this.f34585P) {
                Iterator<C10803a> it = this.f34592a.iterator();
                TdApi.ChatAction chatAction2 = null;
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = i2;
                        chatAction = chatAction2;
                        break;
                    }
                    C10803a next = it.next();
                    int Z1 = C4779t2.m25563Z1(next.f34581b);
                    if (Z1 != -1) {
                        i2 += Z1;
                    }
                    if (chatAction2 == null) {
                        chatAction2 = next.f34581b;
                    } else if (chatAction2.getConstructor() != next.f34581b.getConstructor()) {
                        break;
                    }
                }
            } else {
                chatAction = this.f34592a.get(0).f34581b;
                i = C4779t2.m25563Z1(chatAction);
            }
            this.f34590U = chatAction;
            this.f34591V = i;
        }

        public final void m3270m() {
            int i;
            int i2;
            TdApi.ChatAction chatAction;
            int i3;
            String str = null;
            if (this.f34585P) {
                chatAction = this.f34592a.get(0).f34581b;
                i2 = C4779t2.m25563Z1(chatAction);
                i = 1;
            } else {
                StringBuilder sb2 = new StringBuilder();
                if (C1389o.m37256m()) {
                    sb2.append("\u200e");
                }
                ArrayList arrayList = new ArrayList();
                Iterator<C10803a> it = this.f34592a.iterator();
                TdApi.ChatAction chatAction2 = null;
                int i4 = 0;
                int i5 = 0;
                boolean z = false;
                i = 0;
                while (it.hasNext()) {
                    C10803a next = it.next();
                    if (!z) {
                        int Z1 = C4779t2.m25563Z1(next.f34581b);
                        if (Z1 != -1) {
                            i4 += Z1;
                        }
                        if (chatAction2 == null) {
                            chatAction2 = next.f34581b;
                        } else if (chatAction2.getConstructor() != next.f34581b.getConstructor()) {
                            chatAction2 = null;
                            i4 = 0;
                            z = true;
                        }
                    }
                    i++;
                    if (i <= 2) {
                        arrayList.add(this.f34594c.m2151yb(next.f34580a));
                    } else {
                        i5++;
                    }
                }
                sb2.append(C4403w.m27808x2(arrayList, i5));
                if (C1389o.m37254o()) {
                    sb2.append("\u2069");
                }
                str = sb2.toString();
                chatAction = chatAction2;
                i2 = i4;
            }
            this.f34590U = chatAction;
            this.f34591V = i2;
            if (chatAction == null) {
                this.f34588S = str + (char) 8230;
                return;
            }
            switch (chatAction.getConstructor()) {
                case TdApi.ChatActionChoosingLocation.CONSTRUCTOR:
                    if (!this.f34585P) {
                        if (i != 1) {
                            i3 = R.string.AreSendingLocation;
                            break;
                        } else {
                            i3 = R.string.IsSendingLocation;
                            break;
                        }
                    } else {
                        i3 = R.string.SendingLocation;
                        break;
                    }
                case TdApi.ChatActionChoosingContact.CONSTRUCTOR:
                    if (!this.f34585P) {
                        if (i != 1) {
                            i3 = R.string.AreSendingContact;
                            break;
                        } else {
                            i3 = R.string.IsSendingContact;
                            break;
                        }
                    } else {
                        i3 = R.string.SendingContact;
                        break;
                    }
                case TdApi.ChatActionStartPlayingGame.CONSTRUCTOR:
                    if (!this.f34585P) {
                        if (i != 1) {
                            i3 = R.string.AreSendingGame;
                            break;
                        } else {
                            i3 = R.string.IsSendingGame;
                            break;
                        }
                    } else {
                        i3 = R.string.SendingGame;
                        break;
                    }
                case TdApi.ChatActionRecordingVoiceNote.CONSTRUCTOR:
                    if (!this.f34585P) {
                        if (i != 1) {
                            i3 = R.string.AreRecordingAudio;
                            break;
                        } else {
                            i3 = R.string.IsRecordingAudio;
                            break;
                        }
                    } else {
                        i3 = R.string.RecordingAudio;
                        break;
                    }
                case TdApi.ChatActionUploadingVoiceNote.CONSTRUCTOR:
                    if (!this.f34585P) {
                        if (i != 1) {
                            i3 = R.string.AreSendingVoice;
                            break;
                        } else {
                            i3 = R.string.IsSendingVoice;
                            break;
                        }
                    } else {
                        i3 = R.string.SendingVoice;
                        break;
                    }
                case TdApi.ChatActionRecordingVideoNote.CONSTRUCTOR:
                    if (!this.f34585P) {
                        if (i != 1) {
                            i3 = R.string.AreRecordingRound;
                            break;
                        } else {
                            i3 = R.string.IsRecordingRound;
                            break;
                        }
                    } else {
                        i3 = R.string.RecordingRound;
                        break;
                    }
                case TdApi.ChatActionUploadingDocument.CONSTRUCTOR:
                    if (!this.f34585P) {
                        if (i != 1) {
                            i3 = R.string.AreSendingFile;
                            break;
                        } else {
                            i3 = R.string.IsSendingFile;
                            break;
                        }
                    } else {
                        i3 = R.string.SendingFile;
                        break;
                    }
                case TdApi.ChatActionRecordingVideo.CONSTRUCTOR:
                    if (!this.f34585P) {
                        if (i != 1) {
                            i3 = R.string.AreRecordingVideo;
                            break;
                        } else {
                            i3 = R.string.IsRecordingVideo;
                            break;
                        }
                    } else {
                        i3 = R.string.RecordingVideo;
                        break;
                    }
                case TdApi.ChatActionChoosingSticker.CONSTRUCTOR:
                    if (!this.f34585P) {
                        if (i != 1) {
                            i3 = R.string.AreChoosingSticker;
                            break;
                        } else {
                            i3 = R.string.IsChoosingSticker;
                            break;
                        }
                    } else {
                        i3 = R.string.ChoosingSticker;
                        break;
                    }
                case TdApi.ChatActionTyping.CONSTRUCTOR:
                    if (!this.f34585P) {
                        if (i != 1) {
                            i3 = R.string.AreTypingGroup;
                            break;
                        } else {
                            i3 = R.string.IsTypingGroup;
                            break;
                        }
                    } else {
                        i3 = R.string.Typing;
                        break;
                    }
                case TdApi.ChatActionUploadingPhoto.CONSTRUCTOR:
                    if (!this.f34585P) {
                        if (i != 1) {
                            i3 = R.string.AreSendingPhoto;
                            break;
                        } else {
                            i3 = R.string.IsSendingPhoto;
                            break;
                        }
                    } else {
                        i3 = R.string.SendingPhoto;
                        break;
                    }
                case TdApi.ChatActionUploadingVideoNote.CONSTRUCTOR:
                    if (!this.f34585P) {
                        if (i != 1) {
                            i3 = R.string.AreSendingRound;
                            break;
                        } else {
                            i3 = R.string.IsSendingRound;
                            break;
                        }
                    } else {
                        i3 = R.string.SendingRound;
                        break;
                    }
                case TdApi.ChatActionUploadingVideo.CONSTRUCTOR:
                    if (!this.f34585P) {
                        if (i != 1) {
                            i3 = R.string.AreSendingVideos;
                            break;
                        } else {
                            i3 = R.string.IsSendingVideo;
                            break;
                        }
                    } else {
                        i3 = R.string.SendingVideo;
                        break;
                    }
                default:
                    throw new IllegalArgumentException(Integer.toString(chatAction.getConstructor()));
            }
            this.f34588S = this.f34585P ? C4403w.m27869i1(i3) : C4403w.m27865j1(i3, str);
        }

        public float m3269n() {
            return this.f34589T;
        }
    }

    public interface AbstractC10805c {
        boolean mo3267b(long j, long j2, C10804b bVar);

        void mo3265d(long j, long j2, C10804b bVar, int i);
    }

    public static class C10806d implements C1406w.AbstractC1407a, AbstractC10805c {
        public final C10930q6 f34595a;
        public final AbstractView$OnTouchListenerC7889a f34596b;
        public final AbstractC10807e f34597c;
        public final AbstractC9323v4<?> f34598d;
        public C10804b f34599e;
        public String f34600f;
        public int f34601g;
        public RunnableC5390g f34602h;
        public boolean f34603i;
        public long f34604j;
        public long f34605k;

        public C10806d(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, AbstractC10807e eVar, AbstractC9323v4<?> v4Var) {
            if (q6Var == null) {
                throw new IllegalArgumentException();
            } else if (aVar != null) {
                this.f34595a = q6Var;
                this.f34596b = aVar;
                this.f34597c = eVar;
                this.f34598d = v4Var;
            } else {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public AbstractC9323v4<?> mo3268a(C1406w wVar) {
            AbstractC9323v4<?> v4Var = this.f34598d;
            if (v4Var != null) {
                return v4Var.m9300Z9();
            }
            return null;
        }

        @Override
        public boolean mo3267b(long j, long j2, C10804b bVar) {
            return this.f34597c.mo3253n();
        }

        @Override
        public long mo3266c(C1406w wVar) {
            this.f34597c.mo3254m(true);
            return -1L;
        }

        @Override
        public void mo3265d(long j, long j2, C10804b bVar, int i) {
            m3255n(bVar, i);
        }

        public int m3264e() {
            return this.f34601g;
        }

        public void m3263f(long j, long j2) {
            long j3 = this.f34604j;
            if (j3 != j || this.f34605k != j2) {
                if (j3 != 0) {
                    this.f34595a.m2166xc().m3283z(this.f34604j, this.f34605k, this);
                }
                this.f34604j = j;
                this.f34605k = j2;
                if (j != 0) {
                    this.f34595a.m2166xc().m3298k(j, j2, this);
                }
                m3255n(this.f34595a.m2166xc().m3306A(j, j2), -1);
            }
        }

        public void m3262g() {
            if (this.f34604j != 0) {
                this.f34595a.m2166xc().m3283z(this.f34604j, this.f34605k, this);
                this.f34604j = 0L;
                this.f34605k = 0L;
                m3255n(null, -1);
            }
        }

        public C10804b m3261h() {
            C10804b bVar = this.f34599e;
            if (bVar == null || bVar.m3280c()) {
                return null;
            }
            return this.f34599e;
        }

        public RunnableC5390g m3260i() {
            return this.f34602h;
        }

        public String m3259j() {
            return this.f34600f;
        }

        public final void m3258k(String str, TdApi.ChatAction chatAction) {
            this.f34601g = C1359b.m37520D(chatAction);
            if (!C5070i.m24067c(this.f34600f, str)) {
                this.f34600f = str;
                if (C5070i.m24061i(str)) {
                    m3257l(null);
                } else {
                    this.f34597c.mo3252o();
                }
            }
        }

        public void m3257l(RunnableC5390g gVar) {
            this.f34602h = gVar;
        }

        public final void m3256m(boolean z) {
            if (this.f34603i != z) {
                this.f34603i = z;
                if (z) {
                    this.f34596b.m14454p1().m37094c(this);
                } else {
                    this.f34596b.m14454p1().m37091f(this);
                }
            }
        }

        public void m3255n(C10804b bVar, int i) {
            boolean z = false;
            boolean z2 = this.f34599e == null || (i & 1) != 0;
            this.f34599e = bVar;
            if (z2 && bVar != null) {
                m3258k(bVar.m3272k(), bVar.m3282a());
            }
            m3256m(bVar != null && bVar.m3279d() && this.f34597c.mo3251q());
            int i2 = i & (-3);
            AbstractC10807e eVar = this.f34597c;
            if (!z2 && i2 == 0) {
                z = true;
            }
            eVar.mo3254m(z);
        }
    }

    public interface AbstractC10807e {
        void mo3254m(boolean z);

        boolean mo3253n();

        void mo3252o();

        boolean mo3251q();
    }

    public C10802kc(C10930q6 q6Var) {
        this.f34577a = q6Var;
        q6Var.m2781K9().m1839l(this);
    }

    public void m3287v() {
        if (!this.f34578b.isEmpty()) {
            TdApi.ChatActionCancel chatActionCancel = new TdApi.ChatActionCancel();
            for (Map.Entry<String, C10804b> entry : this.f34578b.entrySet()) {
                entry.getValue().m3275h(chatActionCancel);
            }
        }
    }

    public static String m3286w(long j, long j2) {
        if (j2 == 0) {
            return Long.toString(j);
        }
        return j + "_" + j2;
    }

    public static void m3285x(long j, long j2, C10804b bVar, int i, Iterator<AbstractC10805c> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next().mo3265d(j, j2, bVar, i);
            }
        }
    }

    public C10804b m3306A(long j, long j2) {
        return this.f34578b.get(m3286w(j, j2));
    }

    @Override
    public void mo1411a() {
        this.f34577a.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                C10802kc.this.m3287v();
            }
        });
    }

    @Override
    public void mo1409b(boolean z) {
    }

    @Override
    public void mo1407c() {
        this.f34578b.clear();
        this.f34579c.m21020c();
    }

    public final void m3298k(long j, long j2, AbstractC10805c cVar) {
        this.f34579c.m21021b(m3286w(j, j2), cVar);
    }

    public final boolean m3297l(long j, long j2, String str, C10804b bVar) {
        Iterator<AbstractC10805c> d = this.f34579c.m21019d(str);
        boolean z = false;
        if (d != null) {
            while (d.hasNext()) {
                if (d.next().mo3267b(j, j2, bVar)) {
                    z = true;
                }
            }
        }
        return z;
    }

    public CharSequence m3296m(long j) {
        if (j == 0) {
            return "chat unavailable";
        }
        switch (C7316a.m17057d(j)) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                return m3289t(C7316a.m17045p(j));
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
                TdApi.SecretChat X3 = this.f34577a.m2586X3(j);
                return X3 != null ? m3292q(X3.userId) : "unknown secret chat";
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                return m3293p(C7316a.m17048m(j));
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                return m3292q(C7316a.m17044q(j));
            default:
                throw new IllegalArgumentException(Long.toString(j));
        }
    }

    public CharSequence m3295n(TdApi.Chat chat) {
        if (chat == null) {
            return "chat unavailable";
        }
        switch (chat.type.getConstructor()) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                return m3289t(((TdApi.ChatTypeSupergroup) chat.type).supergroupId);
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
                return m3292q(((TdApi.ChatTypeSecret) chat.type).userId);
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                return m3293p(((TdApi.ChatTypeBasicGroup) chat.type).basicGroupId);
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                return m3292q(((TdApi.ChatTypePrivate) chat.type).userId);
            default:
                throw new IllegalArgumentException(chat.type.toString());
        }
    }

    public CharSequence m3294o(TdApi.Chat chat) {
        if (chat == null) {
            return null;
        }
        int constructor = chat.type.getConstructor();
        if (constructor == 862366513 || constructor == 1579049844) {
            return m3290s(C4779t2.m25465n2(chat), this.f34577a.m2525b4(chat), true, false);
        }
        return null;
    }

    public final CharSequence m3293p(long j) {
        TdApi.BasicGroup M = this.f34577a.m2480e2().m1716M(j);
        if (M == null || !M.isActive) {
            return C4403w.m27869i1(R.string.inactiveGroup);
        }
        if (C4779t2.m25520f3(M.status)) {
            return C4403w.m27869i1(R.string.notInChat);
        }
        if (C4779t2.m25534d3(M.status)) {
            return C4403w.m27869i1(R.string.YouWereKicked);
        }
        return C4403w.m27812w2(M.memberCount, this.f34577a.m2191w3(C7316a.m17060a(j)), false);
    }

    public String m3292q(long j) {
        return m3290s(j, this.f34577a.m2480e2().m1583v2(j), true, true);
    }

    public String m3291r(long j, TdApi.User user, boolean z) {
        return m3290s(j, user, z, true);
    }

    public String m3290s(long j, TdApi.User user, boolean z, boolean z2) {
        if (z && this.f34577a.m2379k7(j)) {
            return C4403w.m27909Z1(C4403w.m27869i1(R.string.ChatWithYourself));
        }
        long c = C7316a.m17058c(j);
        if (this.f34577a.m2363l7(c)) {
            return C4403w.m27869i1(R.string.ServiceNotifications);
        }
        if (this.f34577a.m2475e7(c)) {
            return C4403w.m27869i1(R.string.ReplyNotifications);
        }
        if (user == null) {
            return C4403w.m27869i1(R.string.UserUnavailable);
        }
        if (user.isSupport) {
            return C4403w.m27869i1(user.status instanceof TdApi.UserStatusOnline ? R.string.SupportOnline : R.string.Support);
        }
        int constructor = user.type.getConstructor();
        if (constructor == -1807729372) {
            return C4403w.m27869i1(R.string.deletedUser);
        }
        if (constructor == -724541123) {
            return C4403w.m27869i1(R.string.unknownUser);
        }
        if (constructor != 1262387765) {
            return C4403w.m27997D1(this.f34577a, user.status, z2);
        }
        return C4403w.m27869i1(R.string.Bot);
    }

    public final CharSequence m3289t(long j) {
        boolean z = true;
        TdApi.SupergroupFullInfo j2 = this.f34577a.m2480e2().m1630j2(j, true);
        int i = j2 != null ? j2.memberCount : 0;
        TdApi.Supergroup h2 = this.f34577a.m2480e2().m1638h2(j);
        if (i == 0) {
            i = h2 != null ? h2.memberCount : 0;
        }
        if (i > 0) {
            int w3 = this.f34577a.m2191w3(C7316a.m17059b(j));
            if (h2 == null || !h2.isChannel) {
                z = false;
            }
            return C4403w.m27812w2(i, w3, z);
        } else if (h2 == null) {
            return "channel unavailable";
        } else {
            return C4403w.m27909Z1(C4403w.m27869i1(h2.isChannel ? C5070i.m24061i(h2.username) ? R.string.ChannelPrivate : R.string.Channel : !C5070i.m24061i(h2.username) ? R.string.PublicGroup : R.string.Group));
        }
    }

    public boolean m3288u(long j) {
        TdApi.User v2;
        return !this.f34577a.m2379k7(j) && !this.f34577a.m2363l7(C7316a.m17058c(j)) && (v2 = this.f34577a.m2480e2().m1583v2(j)) != null && v2.type.getConstructor() == -598644325 && v2.status.getConstructor() == -1529460876;
    }

    public void m3284y(TdApi.UpdateChatAction updateChatAction) {
        if (updateChatAction.action.getConstructor() != 2052990641) {
            String w = m3286w(updateChatAction.chatId, updateChatAction.messageThreadId);
            C10804b bVar = this.f34578b.get(w);
            if (bVar == null) {
                if (updateChatAction.action.getConstructor() != 1160523958) {
                    bVar = new C10804b(this, this.f34577a, updateChatAction.chatId, updateChatAction.messageThreadId);
                    this.f34578b.put(w, bVar);
                } else {
                    return;
                }
            }
            bVar.m3277f(updateChatAction.senderId, updateChatAction.action);
        }
    }

    public final void m3283z(long j, long j2, AbstractC10805c cVar) {
        this.f34579c.m21016g(m3286w(j, j2), cVar);
    }
}
