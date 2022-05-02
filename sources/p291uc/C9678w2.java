package p291uc;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1363c0;
import be.C1379j0;
import be.C1399s0;
import gd.AbstractC4761s4;
import gd.C4731p1;
import gd.C4737p7;
import gd.C4779t2;
import gd.C4791t4;
import gd.C4837y0;
import ge.C4868i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.MessagesRecyclerView;
import p038ce.View$OnClickListenerC2971rh;
import p067ed.C4183a;
import p082fd.C4403w;
import p108hb.C5062b;
import p108hb.C5064d;
import p108hb.C5070i;
import p111he.AbstractC5123k;
import p124ib.C5323f;
import p139jb.AbstractC5918j;
import p139jb.AbstractRunnableC5910b;
import p143k0.C6035e;
import p193nb.C7316a;
import p193nb.C7319d;
import p193nb.C7321e;
import p225pd.C8112b;
import p225pd.C8113c;
import p291uc.C9521d3;
import p291uc.C9678w2;
import p292ud.C9773p0;
import p350yd.AbstractC10596d1;
import p350yd.AbstractC10701h1;
import p350yd.AbstractC10748j1;
import p350yd.C10626e1;
import p350yd.C10722i1;
import p350yd.C10733ic;
import p350yd.C10930q6;
import p350yd.C11059v7;
import p350yd.HandlerC10770jj;
import p364zd.C11524j;
import td.AbstractC9323v4;

public class C9678w2 implements Client.AbstractC7865g, C9521d3.AbstractC9523b, AbstractC10748j1, AbstractC10701h1, Comparator<AbstractC4761s4>, C9773p0.AbstractC9776c, AbstractView$OnTouchListenerC7889a.AbstractC7900k, C11059v7.AbstractC11063d, C10733ic.AbstractC10734a {
    public long[] f31410A0;
    public long f31411B0;
    public LinearLayoutManager f31412M;
    public final RecyclerView.AbstractC0910t f31413N;
    public String f31415P;
    public long[] f31416Q;
    public TdApi.ChatEventLogFilters f31417R;
    public C6035e<TdApi.ChatAdministrator> f31418S;
    public boolean f31419T;
    public long f31420U;
    public long f31421V;
    public long f31422W;
    public int f31423X;
    public boolean f31424Y;
    public boolean f31425Z;
    public final View$OnClickListenerC2971rh f31426a;
    public C4837y0 f31427a0;
    public final C10930q6 f31428b;
    public C9580j1 f31430c;
    public boolean f31432d0;
    public boolean f31433e0;
    public C6035e<TdApi.User> f31434f0;
    public List<TdApi.Message> f31435g0;
    public boolean f31436h0;
    public AbstractC4761s4 f31437i0;
    public boolean f31438j0;
    public boolean f31439k0;
    public boolean f31440l0;
    public boolean f31441m0;
    public boolean f31442n0;
    public long f31443o0;
    public long f31444p0;
    public C6035e<long[]> f31445q0;
    public int f31446r0;
    public AbstractRunnableC5910b f31447s0;
    public boolean f31448t0;
    public boolean f31449u0;
    public C7319d f31450v0;
    public int f31451w0;
    public ArrayList<TdApi.Message> f31452x0;
    public AbstractC5123k f31453y0;
    public C9521d3 f31454z0;
    public final C4837y0.AbstractC4840c f31429b0 = new C9680b();
    public final C4837y0.AbstractC4839b f31431c0 = new C9681c();
    public final C9706y1 f31414O = new C9706y1(this);

    public class C9679a extends RecyclerView.AbstractC0910t {
        public final View$OnClickListenerC2971rh f31455a;

        public C9679a(View$OnClickListenerC2971rh rhVar) {
            this.f31455a = rhVar;
        }

        @Override
        public void mo7604a(RecyclerView recyclerView, int i) {
            View$OnClickListenerC2971rh rhVar;
            boolean z = true;
            if (i == 1) {
                this.f31455a.m32176xj(true);
                if (C4868i.m24726c2().m24882G2() && (rhVar = this.f31455a) != null) {
                    rhVar.m32735Gk();
                }
            }
            boolean z2 = i != 0;
            if (C9678w2.this.f31419T != z2) {
                C9678w2.this.f31419T = z2;
                if (!z2) {
                    C9678w2.this.m7605z3();
                }
            }
            if (i == 0) {
                C9678w2.this.m7810D2();
            }
            MessagesRecyclerView messagesRecyclerView = (MessagesRecyclerView) recyclerView;
            if (i == 0) {
                z = false;
            }
            messagesRecyclerView.setIsScrolling(z);
        }

        @Override
        public void mo421b(RecyclerView recyclerView, int i, int i2) {
            C9678w2.this.m7605z3();
            if (i2 == 0) {
                C9678w2.this.m7810D2();
                ((MessagesRecyclerView) recyclerView).m14138O1();
            }
            if (i2 != 0 && !C9678w2.this.f31425Z && C9678w2.this.f31414O.m7509H() != 0) {
                C9678w2.this.f31425Z = true;
                this.f31455a.m9144vc();
                this.f31455a.m32249ro();
            }
        }
    }

    public class C9680b implements C4837y0.AbstractC4840c {
        public C9680b() {
        }

        @Override
        public void mo7603a(AbstractC10596d1<TdApi.Message> d1Var, long j) {
            if (j != 0) {
                C9678w2 w2Var = C9678w2.this;
                w2Var.m7728Z2(!w2Var.f31428b.m2294pc().m4140Q(C9678w2.this.f31414O.m7509H(), j));
            } else if (!d1Var.m4491x()) {
                C9678w2.this.m7728Z2(false);
            }
        }
    }

    public class C9681c implements C4837y0.AbstractC4839b {
        public C9681c() {
        }

        @Override
        public void mo4486C3(AbstractC10596d1<TdApi.Message> d1Var, boolean z) {
            if (!z || !C9678w2.this.f31428b.m2294pc().m4143N(C9678w2.this.f31414O.m7509H())) {
                C9678w2.this.m7728Z2(z);
            }
        }

        @Override
        public void mo4485C6(AbstractC10596d1<TdApi.Message> d1Var, List<TdApi.Message> list, int i, boolean z) {
            C10626e1.m4420g(this, d1Var, list, i, z);
        }

        @Override
        public void mo4484F5(AbstractC10596d1<TdApi.Message> d1Var) {
            C10626e1.m4419h(this, d1Var);
        }

        @Override
        public void mo4483H6(AbstractC10596d1<TdApi.Message> d1Var, TdApi.Message message, int i, int i2) {
            C10626e1.m4422e(this, d1Var, message, i, i2);
        }

        @Override
        public void mo4482J6(AbstractC10596d1<TdApi.Message> d1Var, int i) {
            C10626e1.m4418i(this, d1Var, i);
        }

        @Override
        public void mo4481d4(AbstractC10596d1<TdApi.Message> d1Var, TdApi.Message message, int i) {
            C10626e1.m4421f(this, d1Var, message, i);
        }

        @Override
        public void mo4480i7(AbstractC10596d1<TdApi.Message> d1Var, TdApi.Message message, int i, int i2) {
            C10626e1.m4423d(this, d1Var, message, i, i2);
        }

        @Override
        public void mo4479t6(AbstractC10596d1<TdApi.Message> d1Var) {
            C10626e1.m4425b(this, d1Var);
        }

        @Override
        public void mo4478x2(AbstractC10596d1<TdApi.Message> d1Var, TdApi.Message message, int i) {
            C10626e1.m4424c(this, d1Var, message, i);
        }
    }

    public class C9682d implements C4837y0.AbstractC4839b {
        public C9682d() {
        }

        public void m7601b(AbstractC10596d1 d1Var) {
            if (C9678w2.this.f31427a0 == d1Var && C9678w2.this.f31436h0) {
                C9678w2.this.f31436h0 = false;
                C9678w2.this.f31426a.m9204n9();
            }
        }

        @Override
        public void mo4486C3(AbstractC10596d1<TdApi.Message> d1Var, boolean z) {
            C10626e1.m4426a(this, d1Var, z);
        }

        @Override
        public void mo4485C6(AbstractC10596d1<TdApi.Message> d1Var, List<TdApi.Message> list, int i, boolean z) {
            C10626e1.m4420g(this, d1Var, list, i, z);
        }

        @Override
        public void mo4484F5(AbstractC10596d1<TdApi.Message> d1Var) {
            C10626e1.m4419h(this, d1Var);
        }

        @Override
        public void mo4483H6(AbstractC10596d1<TdApi.Message> d1Var, TdApi.Message message, int i, int i2) {
            C10626e1.m4422e(this, d1Var, message, i, i2);
        }

        @Override
        public void mo4482J6(AbstractC10596d1<TdApi.Message> d1Var, int i) {
            C10626e1.m4418i(this, d1Var, i);
        }

        @Override
        public void mo4481d4(AbstractC10596d1<TdApi.Message> d1Var, TdApi.Message message, int i) {
            C10626e1.m4421f(this, d1Var, message, i);
        }

        @Override
        public void mo4480i7(AbstractC10596d1<TdApi.Message> d1Var, TdApi.Message message, int i, int i2) {
            C10626e1.m4423d(this, d1Var, message, i, i2);
        }

        @Override
        public void mo4479t6(final AbstractC10596d1<TdApi.Message> d1Var) {
            C9678w2.this.f31428b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C9678w2.C9682d.this.m7601b(d1Var);
                }
            });
        }

        @Override
        public void mo4478x2(AbstractC10596d1<TdApi.Message> d1Var, TdApi.Message message, int i) {
            C10626e1.m4424c(this, d1Var, message, i);
        }
    }

    public class C9683e extends AbstractRunnableC5910b {
        public C9683e() {
        }

        public void m7597j() {
            HandlerC10770jj dd = C9678w2.this.f31428b.m2485dd();
            final C9678w2 w2Var = C9678w2.this;
            dd.post(new Runnable() {
                @Override
                public final void run() {
                    C9678w2.m7751T(C9678w2.this);
                }
            });
        }

        @Override
        public void mo1364b() {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < C9678w2.this.f31445q0.m21496p(); i++) {
                long j = C9678w2.this.f31445q0.m21501j(i);
                arrayList.add(new TdApi.ViewMessages(j, j == C9678w2.this.f31443o0 ? C9678w2.this.f31444p0 : 0L, (long[]) C9678w2.this.f31445q0.m21495q(i), false));
            }
            C9678w2.this.f31428b.m2311ob((TdApi.Function[]) arrayList.toArray(new TdApi.Function[0]), C9678w2.this.f31428b.m2392ja(), new Runnable() {
                @Override
                public final void run() {
                    C9678w2.C9683e.this.m7597j();
                }
            });
        }
    }

    public class C9684f extends AbstractC5123k {
        public final long f31461M;
        public final long f31462N;
        public final boolean[] f31464b;
        public final long f31465c;

        public C9684f(boolean[] zArr, long j, long j2, long j3) {
            this.f31464b = zArr;
            this.f31465c = j;
            this.f31461M = j2;
            this.f31462N = j3;
        }

        @Override
        public void mo7438c(TdApi.Object object) {
            if (object.getConstructor() == -16498159) {
                TdApi.Messages messages = (TdApi.Messages) object;
                if (messages.totalCount > 0 && messages.messages.length == 0) {
                    boolean[] zArr = this.f31464b;
                    if (!zArr[0]) {
                        zArr[0] = true;
                        C9678w2.this.f31428b.m2270r4().m14783o(new TdApi.SearchChatMessages(this.f31465c, null, null, 0L, 0, 10, new TdApi.SearchMessagesFilterUnreadMention(), this.f31461M), this);
                        return;
                    }
                }
                C9678w2.this.m7745U2(this, messages, this.f31464b[0] ? 0L : this.f31462N);
                return;
            }
            C9678w2.this.m7745U2(this, null, this.f31462N);
        }
    }

    public interface AbstractC9685g {
        AbstractC4761s4 getMessage();
    }

    public C9678w2(View$OnClickListenerC2971rh rhVar) {
        this.f31426a = rhVar;
        rhVar.mo4347s().m14530V(this);
        this.f31428b = rhVar.mo4348c();
        this.f31413N = new C9679a(rhVar);
    }

    public void m7824A1(long j, long j2) {
        if (this.f31414O.m7509H() == j) {
            m7647q3(j2);
        }
    }

    public void m7819B1(long j, long j2) {
        int n0;
        if (this.f31414O.m7509H() == j && (n0 = this.f31430c.m8112n0(j2)) != -1) {
            AbstractC4761s4 h0 = this.f31430c.m8118h0(n0);
            int l9 = h0.m25878l9(j, j2);
            if (l9 == 1) {
                m7706e1(n0);
            } else if (l9 == 2) {
                m7808E0().m39312I(n0);
            } else if (l9 == 3) {
                m7621w2(h0, n0, j2, h0.m25984a4(j2));
            }
        }
    }

    public void m7815C1(long j, long j2, boolean z) {
        if (this.f31414O.m7509H() == j) {
            m7656o3(j2, z);
        }
    }

    public void m7811D1(long j, long j2) {
        int n0;
        if (this.f31414O.m7509H() == j && (n0 = this.f31430c.m8112n0(j2)) != -1 && this.f31430c.m8116j0(n0).m25964c8(j2)) {
            m7706e1(n0);
        }
    }

    public void m7807E1(TdApi.Message message, long j) {
        if (this.f31414O.m7509H() == message.chatId) {
            m7642r3(message, j);
        }
    }

    public static int m7805F0(int i, TdApi.Chat chat, C4737p7 p7Var) {
        if (chat == null) {
            return 0;
        }
        boolean c0 = m7717c0(chat, p7Var);
        C4868i.C4883o I1 = C4868i.m24726c2().m24869I1(i, chat.f25367id, p7Var != null ? p7Var.m26294g() : 0L);
        if (I1 == null || I1.f16695d) {
            if (c0) {
                return 2;
            }
            if (I1 != null && I1.f16692a.m17026d() != 0) {
                return 3;
            }
        } else if (I1 != null && I1.f16692a.m17026d() != 0) {
            return 3;
        } else {
            if (c0) {
                return 2;
            }
        }
        return 0;
    }

    public void m7804F1(TdApi.Message message, long j) {
        if (this.f31414O.m7509H() == message.chatId) {
            m7634t3(message, j);
        }
    }

    public static C7319d m7801G0(int i, TdApi.Chat chat, C4737p7 p7Var, int i2) {
        if (i2 != 2) {
            if (i2 == 3) {
                C4868i.C4883o I1 = C4868i.m24726c2().m24869I1(i, chat.f25367id, p7Var != null ? p7Var.m26294g() : 0L);
                if (I1 == null || I1.f16692a.m17026d() == 0) {
                    return null;
                }
                return I1.f16692a;
            } else if (i2 != 4) {
                return null;
            }
        }
        if (p7Var != null) {
            return new C7319d(p7Var.m26299b(), p7Var.m26295f() == 0 ? 9L : p7Var.m26295f());
        } else if (chat.lastReadOutboxMessageId == -1048576 || C7316a.m17053h(chat.f25367id)) {
            return new C7319d(chat.f25367id, chat.lastReadInboxMessageId);
        } else {
            return new C7319d(chat.f25367id, Math.max(chat.lastReadOutboxMessageId, chat.lastReadInboxMessageId));
        }
    }

    public void m7800G1(long j, long[] jArr) {
        if (this.f31414O.m7509H() == j) {
            m7630u3(j, jArr);
        }
    }

    public void m7797H1(TdApi.Object object) {
        if (C1379j0.m37305s() == this.f31426a) {
            C1379j0.m37290z0("open/close chat failed " + object.toString(), 1);
        }
    }

    public void m7793I1(int i, C4791t4 t4Var) {
        if (i != t4Var.mo25354J3()) {
            C9580j1 j1Var = this.f31430c;
            j1Var.m39312I(j1Var.m8115k0() - 1);
        }
    }

    public void m7789J1(TdApi.SponsoredMessage sponsoredMessage, AbstractC4761s4 s4Var) {
        if (s4Var != null) {
            this.f31426a.f9933U0 = true;
            boolean z = this.f31412M.m39553T1() == 0;
            this.f31430c.m8124a0(C4731p1.m26306d(this, this.f31414O.m7509H(), s4Var.m25911i3(), sponsoredMessage), false, false);
            if (z && !this.f31419T && !this.f31426a.m32671Li()) {
                this.f31412M.m39522z2(1, C1357a0.m37541i(48.0f));
            }
        }
    }

    public void m7785K1(AbstractC5918j jVar) {
        jVar.mo1330a(m7608z0());
    }

    public void m7781L1(final TdApi.SponsoredMessage sponsoredMessage) {
        if (sponsoredMessage == null) {
            this.f31426a.f9933U0 = true;
            return;
        }
        final AbstractC5918j m2Var = new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                C9678w2.this.m7789J1(sponsoredMessage, (AbstractC4761s4) obj);
            }
        };
        AbstractC4761s4 z0 = m7608z0();
        if (z0 != null) {
            m2Var.mo1330a(z0);
        } else {
            C1379j0.m37332e0(new Runnable() {
                @Override
                public final void run() {
                    C9678w2.this.m7785K1(m2Var);
                }
            }, 1000L);
        }
    }

    public void m7777M1(AbstractC5123k kVar, TdApi.Messages messages, long j) {
        if (kVar == this.f31453y0) {
            this.f31453y0 = null;
            if (messages != null) {
                TdApi.Message[] messageArr = messages.messages;
                if (messageArr.length > 0) {
                    m7743V2(messageArr, j);
                }
            }
        }
    }

    public void m7773N1(long j, AbstractC4761s4 s4Var) {
        if (this.f31414O.m7509H() == j) {
            m7625v3(s4Var);
        }
    }

    public static void m7751T(C9678w2 w2Var) {
        w2Var.m7803F2();
    }

    public static boolean m7717c0(TdApi.Chat chat, C4737p7 p7Var) {
        TdApi.Message message;
        if (p7Var != null) {
            return p7Var.m26290k();
        }
        if (chat.unreadCount >= 1) {
            long j = chat.lastReadInboxMessageId;
            if (j != 0 && j != -1048576 && (message = chat.lastMessage) != null && message.f25406id > j && !message.isOutgoing) {
                return true;
            }
        }
        return false;
    }

    public static long m7695g3(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long seconds = timeUnit.toSeconds(j);
        if (seconds < 15) {
            return j % 3000;
        }
        if (seconds < 60) {
            return j % 5000;
        }
        long minutes = timeUnit.toMinutes(j);
        if (minutes < 30) {
            return j % 15000;
        }
        if (minutes < 60) {
            return j % 30000;
        }
        return j % 60000;
    }

    public void m7644r1(int i, ArrayList arrayList, TdApi.Message message) {
        if (m7613y0(message, i)) {
            arrayList.add(message);
        }
    }

    public static void m7639s1(TdApi.Message message, AtomicInteger atomicInteger, ArrayList arrayList, AbstractC5918j jVar, TdApi.Message message2) {
        if (message2.f25406id == message.f25406id) {
            atomicInteger.set(arrayList.size());
        }
        jVar.mo1330a(message2);
    }

    public void m7635t1(long j, long j2) {
        int n0;
        if (this.f31414O.m7509H() == j && (n0 = this.f31430c.m8112n0(j2)) != -1) {
            m7796H2(n0, this.f31430c.m8116j0(n0), 0, true, false);
        }
    }

    public void m7631u1(boolean z, ArrayList arrayList, boolean[] zArr, int[] iArr, long j, TdApi.Message message) {
        if (!C4779t2.m25713C3(message)) {
            C8112b bVar = null;
            if (z) {
                if (message.content.getConstructor() == 1306939396) {
                    bVar = C8112b.m13527V0(this.f31426a.mo4347s(), this.f31428b, message);
                }
            } else if (message.content.getConstructor() == -1851395174 || message.content.getConstructor() == 2021281344) {
                bVar = C8112b.m13527V0(this.f31426a.mo4347s(), this.f31428b, message);
            }
            if (bVar != null) {
                arrayList.add(0, bVar);
                if (zArr[0]) {
                    iArr[0] = iArr[0] + 1;
                }
            }
            if (!zArr[0] && message.f25406id == j) {
                zArr[0] = true;
            }
        }
    }

    public void m7627v1(long r6, org.drinkless.p210td.libcore.telegram.TdApi.ChatMember r8) {
        throw new UnsupportedOperationException("Method not decompiled: p291uc.C9678w2.m7627v1(long, org.drinkless.td.libcore.telegram.TdApi$ChatMember):void");
    }

    public void m7622w1(long j, long j2, TdApi.MessageContent messageContent) {
        if (this.f31414O.m7509H() == j) {
            m7671l3(j, j2, messageContent);
        }
    }

    public void m7617x1(long j, long j2, int i, TdApi.ReplyMarkup replyMarkup) {
        if (this.f31414O.m7509H() == j) {
            m7666m3(j2, i, replyMarkup);
        }
    }

    public void m7612y1(long j, long j2, TdApi.MessageInteractionInfo messageInteractionInfo) {
        if (this.f31414O.m7509H() == j) {
            m7661n3(j2, messageInteractionInfo);
        }
    }

    public void m7607z1(long j, long j2) {
        if (this.f31414O.m7509H() == j) {
            m7652p3(j2);
        }
    }

    public View m7825A0(long j, long j2) {
        int n0;
        if (this.f31414O.m7509H() != j || (n0 = this.f31430c.m8112n0(j2)) == -1) {
            return null;
        }
        return this.f31412M.mo39262C(n0);
    }

    public void m7823A2() {
        this.f31412M.m39522z2(0, 0);
        m7704e3();
    }

    public boolean m7822A3(long j, long j2, C5323f fVar, boolean z) {
        if (this.f31426a.m9332Ua()) {
            return false;
        }
        boolean O6 = this.f31428b.m2720O6(j);
        long[] r = fVar.m23259r();
        if (!this.f31442n0 || !O6) {
            if (Log.isEnabled(8)) {
                Log.m14721i(8, "Scheduling messages read. isFocused: %b, isOpen: %b, append: %b", Boolean.valueOf(this.f31442n0), Boolean.valueOf(O6), Boolean.valueOf(z));
            }
            return false;
        }
        if (Log.isEnabled(8)) {
            Log.m14721i(8, "Reading %d messages: %s", Integer.valueOf(r.length), Arrays.toString(r));
        }
        if (Log.isEnabled(4)) {
            Log.m14721i(4, "Reading %d messages from MessagesManager: %s", Integer.valueOf(r.length), Arrays.toString(r));
        }
        this.f31428b.m2270r4().m14783o(new TdApi.ViewMessages(j, j2, r, true), this.f31414O);
        return true;
    }

    public AbstractC4761s4 m7820B0() {
        int a2 = this.f31412M.m39546a2();
        if (a2 != -1) {
            return this.f31430c.m8116j0(a2);
        }
        return null;
    }

    public void m7818B2() {
        this.f31428b.m2294pc().m4116i0(this.f31414O.m7509H());
        C4837y0 y0Var = this.f31427a0;
        m7728Z2(y0Var != null && y0Var.m4491x());
    }

    public final View m7816C0() {
        int k0 = this.f31430c.m8115k0();
        return k0 == 0 ? this.f31412M.mo39262C(0) : this.f31412M.mo39262C(k0 - 1);
    }

    public final void m7814C2() {
        if (m7737X0()) {
            this.f31410A0 = null;
            m7810D2();
        }
    }

    public final int m7812D0() {
        int k0 = this.f31430c.m8115k0();
        return (k0 <= 0 || this.f31437i0 == null || this.f31430c.m8116j0(k0 + (-1)) != this.f31437i0) ? k0 : k0 - 1;
    }

    public final void m7810D2() {
        long[] jArr;
        long j;
        long j2;
        long[] jArr2;
        long j3;
        boolean z;
        long j4;
        long j5;
        AbstractC4761s4 j0;
        long[] jArr3;
        boolean z2;
        boolean z3;
        TdApi.Message message;
        if (!this.f31426a.m9332Ua() && !m7725a1() && !C4868i.m24726c2().m24780V() && this.f31442n0) {
            int X1 = this.f31412M.m39549X1();
            long[] jArr4 = this.f31410A0;
            boolean z4 = false;
            if (X1 == -1 || !C9586k1.m8092T(this.f31430c.mo6150F(X1))) {
                jArr2 = jArr4;
                if (m7649q1()) {
                    C9706y1 y1Var = this.f31414O;
                    j3 = y1Var != null ? y1Var.m7509H() : 0L;
                    z = false;
                    j2 = 0;
                    j = 0;
                    jArr = null;
                } else {
                    return;
                }
            } else {
                AbstractC4761s4 j02 = this.f31430c.m8116j0(X1);
                boolean z5 = this.f31430c.m8119g0() != null && this.f31430c.m8119g0().mo25841p6() && this.f31430c.m8115k0() > 1;
                C4737p7 J = this.f31414O.m7507J();
                if (j02 == null || j02.m26145K2() == 0) {
                    jArr2 = jArr4;
                    z2 = false;
                    jArr3 = null;
                    j3 = 0;
                } else {
                    j2 = j02.m26145K2();
                    j = j02.m26065S1();
                    long[] l4 = j02.m25883l4(j);
                    j3 = j02.m26145K2();
                    if (J != null) {
                        z3 = j3 == this.f31414O.m7509H() && J.m26296e() == j;
                        jArr2 = jArr4;
                    } else {
                        TdApi.Chat U2 = this.f31428b.m2632U2(j3);
                        if (U2 == null || (message = U2.lastMessage) == null) {
                            jArr2 = jArr4;
                        } else {
                            jArr2 = jArr4;
                            if (message.f25406id == j) {
                                z3 = true;
                            }
                        }
                        z3 = false;
                    }
                    View C = this.f31412M.mo39262C(X1);
                    int bottom = (C == null || C.getParent() == null) ? false : ((View) C.getParent()).getBottom() - C.getBottom();
                    if (!z3 || bottom) {
                        if (!z5 || !j02.mo25841p6()) {
                            z2 = z3;
                            z4 = bottom;
                            jArr3 = l4;
                        } else {
                            j2 = 0;
                            j = j2;
                            z2 = true;
                            jArr3 = null;
                        }
                        jArr = jArr3;
                        z = z4;
                        z4 = z2;
                    } else {
                        z2 = z3;
                        z4 = bottom;
                        jArr3 = null;
                    }
                }
                j2 = 0;
                j = 0;
                jArr = jArr3;
                z = z4;
                z4 = z2;
            }
            if (this.f31414O.m7515B() || (j0 = this.f31430c.m8116j0(m7812D0() - 1)) == null || j0.m26145K2() != this.f31414O.m7509H()) {
                j5 = 0;
                j4 = 0;
            } else {
                j4 = j0.m26205E4();
                j5 = 0;
            }
            if (j3 != j5) {
                int w6 = this.f31428b.m2188w6();
                long H = this.f31414O.m7509H();
                long K = this.f31414O.m7506K();
                C4868i c2 = C4868i.m24726c2();
                int i = z ? 1 : 0;
                int i2 = z ? 1 : 0;
                c2.m24900D5(w6, H, K, new C4868i.C4883o(new C7319d(j2, j, jArr), i, jArr2, z4, j4));
                C4837y0 y0Var = this.f31427a0;
                if (y0Var != null && H == j2) {
                    y0Var.m25108C0(j);
                }
            }
        }
    }

    public C9580j1 m7808E0() {
        return this.f31430c;
    }

    @Override
    public void mo4051E2(TdApi.Message message) {
        if ((message.schedulingState != null) == m7726a0()) {
            if (m7716c1(message.chatId, message.f25406id) == -1) {
                TdApi.Chat L3 = this.f31428b.m2771L3(message.chatId);
                m7709d3(L3.f25367id, AbstractC4761s4.m26008X9(this, message, L3, this.f31418S));
            }
        } else if (m7687i1() && message.schedulingState != null) {
            this.f31426a.m32675Kr(true);
        }
    }

    public final void m7803F2() {
        C6035e<long[]> eVar;
        m7707e0();
        if (this.f31443o0 != 0 && (eVar = this.f31445q0) != null && eVar.m21496p() > 0) {
            long g3 = this.f31446r0 != 0 ? m7695g3(this.f31428b.m2898D4() - TimeUnit.SECONDS.toMillis(this.f31446r0)) : 60000L;
            C9683e eVar2 = new C9683e();
            this.f31447s0 = eVar2;
            eVar2.m21855e(this.f31428b.m2485dd());
            this.f31428b.m2485dd().postDelayed(this.f31447s0, g3);
        }
    }

    public final void m7799G2(boolean z) {
        m7704e3();
        if (!this.f31426a.f9933U0) {
            m7611y2();
        }
        if (this.f31430c.m8119g0() == null || !this.f31430c.m8119g0().mo25841p6()) {
            this.f31412M.m39522z2(0, 0);
            return;
        }
        this.f31426a.m32378hq(false, false, false);
        if (this.f31426a.m32671Li()) {
            this.f31412M.mo39018x1(1);
        } else {
            this.f31412M.m39522z2(1, C1357a0.m37541i(48.0f));
        }
    }

    @Override
    public void mo4050H(final long j, final long[] jArr) {
        this.f31428b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                C9678w2.this.m7800G1(j, jArr);
            }
        });
    }

    public C6035e<TdApi.ChatAdministrator> m7798H0() {
        return this.f31418S;
    }

    public final void m7796H2(int i, AbstractC4761s4 s4Var, int i2, boolean z, boolean z2) {
        int i3;
        if (i2 == -1) {
            m7788J2(i, 0, false);
            return;
        }
        int w6 = this.f31428b.m2188w6();
        if (i2 == 3) {
            C4868i.C4883o I1 = C4868i.m24726c2().m24869I1(w6, this.f31414O.m7509H(), this.f31414O.m7506K());
            if (I1 != null) {
                this.f31410A0 = I1.f16694c;
                i3 = I1.f16693b;
            } else {
                i3 = 0;
            }
            this.f31410A0 = I1 != null ? I1.f16694c : null;
            m7788J2(i, i3, false);
            m7669m0();
            return;
        }
        int S0 = m7754S0();
        int V0 = m7744V0();
        s4Var.m25934g0(S0);
        int J3 = s4Var.mo25354J3();
        if (J3 > V0 + 0) {
            V0 += 0;
        }
        if (i2 == 2 || i2 == 4 || s4Var.m25765x1() + J3 >= V0) {
            m7788J2(i, V0 - J3, z);
        } else {
            m7788J2(i, ((V0 / 2) - (J3 / 2)) + s4Var.m25765x1(), z);
        }
    }

    public final int m7794I0(int i, int i2, int i3, int i4) {
        if (!m7615x3()) {
            return C11524j.m228N(i);
        }
        float backgroundTransparency = m7645r0().m32662Lr().getBackgroundTransparency();
        if (backgroundTransparency == 1.0f) {
            return C11524j.m228N(i3);
        }
        int N = C11524j.m228N(i2);
        float Y = C11524j.m206Y(i4);
        if (Y > 0.0f) {
            N = C5064d.m24128d(N, m7645r0().m32662Lr().m8006f(N, true), Y);
        }
        return backgroundTransparency > 0.0f ? C5064d.m24128d(N, C11524j.m228N(i3), backgroundTransparency) : N;
    }

    public void m7792I2() {
        ArrayList<TdApi.Message> arrayList = this.f31452x0;
        if (arrayList != null && !arrayList.isEmpty()) {
            TdApi.Message remove = this.f31452x0.remove(0);
            m7730Z0(new C7319d(remove.chatId, remove.f25406id), 1, null, true);
        } else if (this.f31453y0 == null) {
            long j = this.f31422W;
            if (j == 0) {
                AbstractC4761s4 l0 = this.f31430c.m8114l0();
                if (l0 != null) {
                    j = l0.m26065S1();
                } else {
                    return;
                }
            }
            long j2 = j;
            long H = this.f31414O.m7509H();
            long K = this.f31414O.m7506K();
            this.f31453y0 = new C9684f(new boolean[1], H, K, j2);
            this.f31428b.m2270r4().m14783o(new TdApi.SearchChatMessages(H, null, null, j2, -9, 10, new TdApi.SearchMessagesFilterUnreadMention(), K), this.f31453y0);
        }
    }

    public TdApi.ChatEventLogFilters m7790J0() {
        return this.f31417R;
    }

    public final void m7788J2(int i, int i2, boolean z) {
        m7704e3();
        if (z) {
            int b0 = m7722b0(i, i2);
            if (Math.abs(b0) < this.f31426a.m32253rk().getMeasuredHeight()) {
                this.f31426a.m32253rk().mo8024v1(0, b0);
            } else {
                this.f31412M.m39522z2(i, i2);
            }
        } else {
            this.f31412M.m39522z2(i, i2);
        }
    }

    @Override
    public void mo4049J5(long j, long j2) {
        C10722i1.m4167e(this, j, j2);
    }

    public String m7786K0() {
        return this.f31415P;
    }

    public void m7784K2(boolean z) {
        if (m7725a1()) {
            m7704e3();
            m7799G2(false);
        } else if (!m7737X0() || z) {
            if (z) {
                m7814C2();
            }
            m7704e3();
            if (this.f31414O.m7516A()) {
                m7765P1();
            } else {
                m7799G2(true);
            }
        } else {
            long c = this.f31450v0.m17027c();
            long[] jArr = this.f31410A0;
            C7319d dVar = new C7319d(c, jArr[jArr.length - 1]);
            long[] jArr2 = this.f31410A0;
            m7730Z0(dVar, 1, jArr2.length == 1 ? null : C5062b.m24147y(jArr2, jArr2.length - 1), true);
        }
    }

    public long[] m7782L0() {
        return this.f31416Q;
    }

    public void m7780L2(long j, C4737p7 p7Var, TdApi.MessageSender messageSender, boolean z, String str) {
        if (m7692h1()) {
            m7735Y(this.f31417R, str, this.f31416Q);
            return;
        }
        C9521d3 d3Var = this.f31454z0;
        if (p7Var != null) {
            j = p7Var.m26299b();
        }
        d3Var.m8429p(j, p7Var != null ? p7Var.m26294g() : 0L, messageSender, z, str);
    }

    public int m7778M0() {
        return this.f31414O.m7508I();
    }

    public void m7776M2(TdApi.ChatAdministrators chatAdministrators) {
        TdApi.ChatAdministrator[] chatAdministratorArr;
        C6035e<TdApi.ChatAdministrator> eVar = new C6035e<>(chatAdministrators.administrators.length);
        for (TdApi.ChatAdministrator chatAdministrator : chatAdministrators.administrators) {
            eVar.m21500k(chatAdministrator.userId, chatAdministrator);
        }
        this.f31418S = eVar;
        m7685i3();
    }

    public LinearLayoutManager m7774N0() {
        return this.f31412M;
    }

    public void m7772N2(C6035e<TdApi.User> eVar, boolean z) {
        this.f31434f0 = eVar;
        this.f31433e0 = z;
    }

    public int m7770O0() {
        AbstractC4761s4 l0;
        if (this.f31414O.m7515B() || (l0 = this.f31430c.m8114l0()) == null) {
            return -1;
        }
        return l0.m25911i3();
    }

    public final void m7769O1(C7319d dVar, int i, boolean z) {
        if (z) {
            this.f31430c.m8102y0(null);
        }
        this.f31414O.m7477g0(dVar, i, z);
        m7605z3();
    }

    public void m7768O2(TextView textView, boolean z) {
        String G3;
        if (this.f31414O.m7504M() == 3 && (G3 = this.f31428b.m2851G3(this.f31414O.m7509H())) != null) {
            textView.setText(G3);
        } else if (!m7692h1()) {
            textView.setText(C4403w.m27869i1(z ? R.string.NoMessages : R.string.LoadingMessages));
        } else if (!z) {
            textView.setText(C4403w.m27869i1(R.string.LoadingActions));
        } else if (C5070i.m24061i(this.f31415P) && this.f31416Q == null && this.f31417R == null) {
            textView.setText(C1363c0.m37449Y(C4403w.m27869i1(m7701f1() ? R.string.EventLogEmptyChannel : R.string.EventLogEmpty)));
        } else if (C5070i.m24061i(this.f31415P)) {
            textView.setText(C1363c0.m37449Y(C4403w.m27869i1(R.string.EventLogEmptySearch)));
        } else {
            textView.setText(C4403w.m27853m1(R.string.EventLogEmptyTextSearch, this.f31415P));
        }
    }

    public final int m7766P0(int i, int i2, int i3, int i4) {
        if (!m7615x3()) {
            return C11524j.m228N(i);
        }
        float backgroundTransparency = m7645r0().m32662Lr().getBackgroundTransparency();
        if (backgroundTransparency == 1.0f) {
            return C11524j.m228N(i3);
        }
        int N = C11524j.m228N(i2);
        float Y = C11524j.m206Y(i4);
        if (Y > 0.0f) {
            N = C5064d.m24128d(N, m7645r0().m32662Lr().m8006f(N, false), Y);
        }
        return backgroundTransparency > 0.0f ? C5064d.m24128d(N, C11524j.m228N(i3), backgroundTransparency) : N;
    }

    public void m7765P1() {
        m7761Q1(new C7319d(this.f31414O.m7509H(), 0L), null);
    }

    public final void m7764P2(boolean z) {
        if (this.f31442n0 != z) {
            if (Log.isEnabled(8)) {
                Log.m14721i(8, "MessagesManager isFocused -> %b", Boolean.valueOf(z));
            }
            this.f31442n0 = z;
            if (z) {
                m7696g2();
            } else {
                m7724a2();
            }
        }
    }

    public int m7762Q0() {
        C4837y0 y0Var = this.f31427a0;
        if (y0Var != null) {
            return y0Var.m4493v();
        }
        return -1;
    }

    public final void m7761Q1(C7319d dVar, AbstractC4761s4 s4Var) {
        this.f31430c.m8102y0(s4Var);
        this.f31412M.m39522z2(0, 0);
        this.f31414O.m7475h0(dVar);
        m7605z3();
    }

    public final void m7760Q2(boolean z) {
        if (this.f31448t0 != z) {
            this.f31448t0 = z;
            this.f31426a.mo4347s().m14471l0();
        }
    }

    public int m7758R0() {
        int W = this.f31412M.m39229W();
        return (W == 0 || !this.f31426a.m9339Ta()) ? this.f31426a.m32511Xn() : W;
    }

    public void m7757R1() {
        m7753S1();
    }

    public void m7756R2(AbstractC4761s4 s4Var) {
        this.f31437i0 = s4Var;
        if (this.f31438j0 && m7714c3()) {
            if (s4Var instanceof C4791t4) {
                ((C4791t4) s4Var).m25352da(this.f31430c);
            }
            this.f31430c.m8124a0(this.f31437i0, true, false);
            m7698g0();
        }
    }

    @Override
    public void mo4048R3(final long j, final long j2) {
        this.f31428b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                C9678w2.this.m7811D1(j, j2);
            }
        });
    }

    public int m7754S0() {
        int p0 = this.f31412M.m39187p0();
        return (p0 == 0 || !this.f31426a.m9339Ta()) ? this.f31426a.m32498Yn() : p0;
    }

    public final void m7753S1() {
        this.f31414O.m7467l0();
    }

    public void m7752S2(boolean z) {
        if (this.f31449u0 != z) {
            this.f31449u0 = z;
            AbstractC4761s4 j0 = this.f31430c.m8116j0(m7812D0() - 1);
            if (j0 != null) {
                j0.m26149J9();
                this.f31426a.m32253rk().invalidate();
            }
        }
    }

    @Override
    public void mo4047T0(final long j, final long j2, final TdApi.MessageInteractionInfo messageInteractionInfo) {
        int c1 = m7716c1(j, j2);
        if (c1 != -1) {
            this.f31435g0.get(c1).interactionInfo = messageInteractionInfo;
        } else {
            this.f31428b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C9678w2.this.m7612y1(j, j2, messageInteractionInfo);
                }
            });
        }
    }

    public long m7750T1() {
        C4837y0 y0Var = this.f31427a0;
        if (y0Var != null) {
            return y0Var.m25105F0();
        }
        return 0L;
    }

    public void m7749T2(C7319d dVar, int i) {
        this.f31450v0 = dVar;
        this.f31451w0 = i;
    }

    public float m7747U0() {
        return this.f31426a.m32175xk();
    }

    public void m7746U1(Context context, RecyclerView recyclerView, LinearLayoutManager linearLayoutManager) {
        this.f31412M = linearLayoutManager;
        this.f31430c = new C9580j1(context, this, this.f31426a);
        recyclerView.m39394u();
        recyclerView.m39422k(this.f31413N);
        recyclerView.setAdapter(this.f31430c);
    }

    public final void m7745U2(final AbstractC5123k kVar, final TdApi.Messages messages, final long j) {
        this.f31428b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                C9678w2.this.m7777M1(kVar, messages, j);
            }
        });
    }

    @Override
    public void mo4046V(final long j, final long j2) {
        int c1 = m7716c1(j, j2);
        if (c1 != -1) {
            this.f31435g0.get(c1).containsUnreadMention = false;
        } else {
            this.f31428b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C9678w2.this.m7607z1(j, j2);
                }
            });
        }
    }

    public int m7744V0() {
        return m7758R0() - this.f31426a.m32787Ck();
    }

    @Override
    public void mo4045V1(final long j, final long j2, final boolean z) {
        int c1 = m7716c1(j, j2);
        if (c1 != -1) {
            this.f31435g0.get(c1).isPinned = z;
        } else {
            this.f31428b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C9678w2.this.m7815C1(j, j2, z);
                }
            });
        }
    }

    public final void m7743V2(TdApi.Message[] messageArr, long j) {
        ArrayList<TdApi.Message> arrayList = new ArrayList<>(messageArr.length);
        Collections.addAll(arrayList, messageArr);
        this.f31452x0 = arrayList;
        if (!arrayList.isEmpty()) {
            m7792I2();
        }
    }

    public int m7741W0() {
        return this.f31426a.m32787Ck() + this.f31426a.m32567Tj();
    }

    public void m7740W1(boolean z) {
        this.f31454z0.m8435j(z);
    }

    public void m7739W2(boolean z) {
        if (this.f31440l0 != z) {
            this.f31440l0 = z;
            m7693h0();
        }
    }

    public void m7738X(List<AbstractC4761s4> list) {
        if (list != null) {
            for (AbstractC4761s4 s4Var : list) {
                if (s4Var != null) {
                    m7625v3(s4Var);
                }
            }
        }
    }

    public boolean m7737X0() {
        long[] jArr;
        return (this.f31450v0 == null || (jArr = this.f31410A0) == null || jArr.length <= 0) ? false : true;
    }

    @Override
    public void mo4044X1(final TdApi.Message message, final long j) {
        int c1 = m7716c1(message.chatId, j);
        if (c1 != -1) {
            this.f31435g0.set(c1, message);
        } else {
            this.f31428b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C9678w2.this.m7804F1(message, j);
                }
            });
        }
    }

    public void m7736X2(boolean z) {
        if (this.f31441m0 != z) {
            this.f31441m0 = z;
            m7693h0();
        }
    }

    public void m7735Y(TdApi.ChatEventLogFilters chatEventLogFilters, String str, long[] jArr) {
        if (!C5070i.m24067c(this.f31415P, str) || !C7321e.m17017B(this.f31417R, chatEventLogFilters) || !C5062b.m24158n(this.f31416Q, jArr)) {
            this.f31415P = str;
            this.f31417R = chatEventLogFilters;
            this.f31416Q = jArr;
            this.f31426a.m32582Si(!C5070i.m24061i(str) || jArr != null || !C4779t2.m25672I2(chatEventLogFilters));
            m7765P1();
        }
    }

    public boolean m7734Y0() {
        return this.f31448t0;
    }

    public boolean m7733Y1() {
        int M = this.f31414O.m7504M();
        return (M == 1 || M == 3) ? false : true;
    }

    public void m7732Y2(boolean z) {
        if (this.f31439k0 != z) {
            this.f31439k0 = z;
            m7693h0();
        }
    }

    public void m7731Z(TdApi.ChatEventLogFilters chatEventLogFilters, long[] jArr) {
        m7735Y(chatEventLogFilters, this.f31415P, jArr);
    }

    public void m7730Z0(C7319d dVar, int i, long[] jArr, boolean z) {
        if (!m7692h1()) {
            this.f31450v0 = dVar;
            this.f31451w0 = i;
            if (!Arrays.equals(this.f31410A0, jArr)) {
                this.f31410A0 = jArr;
                m7810D2();
                m7669m0();
            }
            int o0 = this.f31430c.m8111o0(dVar);
            if (o0 == -1) {
                m7606z2(dVar, i);
                return;
            }
            if ((i == 4 || i == 5) && o0 > 0) {
                o0--;
            }
            int i2 = o0;
            AbstractC4761s4 j0 = this.f31430c.m8116j0(i2);
            j0.m25891k5(true);
            m7796H2(i2, j0, i, z, false);
        }
    }

    public boolean m7729Z1() {
        return this.f31414O.m7504M() == 4;
    }

    public final void m7728Z2(boolean z) {
        if (this.f31432d0 != z) {
            this.f31432d0 = z;
            this.f31426a.m32547Uq(z, this.f31427a0);
        }
    }

    @Override
    public void mo7727a() {
    }

    public final boolean m7726a0() {
        return this.f31414O.m7504M() == 4;
    }

    public final boolean m7725a1() {
        return this.f31414O.m7504M() != 0;
    }

    public final void m7724a2() {
        m7810D2();
    }

    public final void m7723a3(long j, long j2, C6035e<long[]> eVar, int i) {
        if (this.f31443o0 != j || this.f31444p0 != j2 || this.f31446r0 != i || !C5062b.m24160l(this.f31445q0, eVar)) {
            this.f31443o0 = j;
            this.f31444p0 = j2;
            this.f31445q0 = eVar;
            this.f31446r0 = i;
            m7803F2();
        }
    }

    @Override
    public void mo4083b(long j, long j2) {
        if (this.f31414O.m7509H() == j) {
            m7688i0();
        }
    }

    public final int m7722b0(int i, int i2) {
        long j;
        int i3;
        int X1 = this.f31412M.m39549X1();
        View C = this.f31412M.mo39262C(X1);
        if (C != null) {
            j = C.getBottom() - this.f31412M.m39229W();
            i3 = i2;
        } else {
            i3 = i2;
            j = 0;
        }
        long j2 = -i3;
        long j3 = -this.f31412M.m39229W();
        int k0 = this.f31430c.m8115k0();
        for (int i4 = 0; i4 < k0; i4++) {
            int J3 = this.f31430c.m8116j0(i4).mo25354J3();
            if (i4 < X1) {
                j += J3;
            }
            if (i4 < i) {
                j2 += J3;
            }
            j3 += J3;
        }
        if (j3 > 0) {
            long max = Math.max(0L, Math.min(j3, j2));
            if (max != j) {
                return (int) (j - max);
            }
        }
        return 0;
    }

    public int m7721b1() {
        if (this.f31430c.m8115k0() <= 0) {
            return -1;
        }
        for (int i = 0; i < this.f31430c.m8115k0(); i++) {
            if (this.f31430c.m8116j0(i).m25909i5()) {
                return i;
            }
        }
        return -1;
    }

    public void m7720b2() {
        m7611y2();
    }

    public void m7719b3(List<TdApi.Message> list) {
        this.f31435g0 = list;
    }

    @Override
    public void mo7718c() {
    }

    public final int m7716c1(long j, long j2) {
        List<TdApi.Message> list = this.f31435g0;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int i = 0;
        for (TdApi.Message message : this.f31435g0) {
            if (message.chatId == j && message.f25406id == j2) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void m7715c2() {
        m7705e2();
        m7710d2();
    }

    public final boolean m7714c3() {
        AbstractC4761s4 l0 = this.f31430c.m8114l0();
        return l0 == null || l0 != this.f31437i0;
    }

    @Override
    public void mo4043c6(long j, long j2, TdApi.Sticker sticker) {
        C10722i1.m4171a(this, j, j2, sticker);
    }

    @Override
    public void mo7713d() {
    }

    public boolean m7712d0() {
        C4837y0 y0Var = this.f31427a0;
        return y0Var != null && y0Var.m4491x() && !this.f31432d0;
    }

    public final void m7711d1(long j, int i, int i2) {
        C4837y0 y0Var = new C4837y0(this.f31428b, i, i2, this.f31431c0, j, 0L, null, null, new TdApi.SearchMessagesFilterPinned(), 0L);
        this.f31427a0 = y0Var;
        y0Var.m25056z0(this.f31429b0);
        this.f31427a0.m4497r(new C9682d());
        this.f31428b.m2294pc().m4123f(this);
    }

    public void m7710d2() {
        m7669m0();
    }

    public final void m7709d3(final long j, final AbstractC4761s4 s4Var) {
        s4Var.m25799t8();
        this.f31428b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                C9678w2.this.m7773N1(j, s4Var);
            }
        });
    }

    @Override
    public void mo7708e(int i, int i2, C7319d dVar) {
        if (i == -3) {
            this.f31426a.m32315mo(C4403w.m27993E1(0, 0), 0, 0);
        } else if (i == -2) {
            this.f31426a.m32301no();
        } else if (i != -1) {
            this.f31426a.m32315mo(C4403w.m27993E1(i + 1, i2), i, i2);
            m7730Z0(dVar, 1, null, true);
        } else {
            this.f31426a.m32315mo("", -1, -1);
        }
    }

    public final void m7707e0() {
        AbstractRunnableC5910b bVar = this.f31447s0;
        if (bVar != null) {
            bVar.m21857c();
            this.f31447s0 = null;
        }
    }

    public void m7706e1(int i) {
        LinearLayoutManager linearLayoutManager = this.f31412M;
        if (linearLayoutManager != null) {
            View C = linearLayoutManager.mo39262C(i);
            if (C == null) {
                this.f31430c.m39312I(i);
            } else if (C instanceof C9565i1) {
                C1399s0.m37219B((C9565i1) C);
            } else {
                C.invalidate();
            }
        }
    }

    public final void m7705e2() {
        this.f31426a.m9204n9();
    }

    public final void m7704e3() {
        MessagesRecyclerView rk = this.f31426a.m32253rk();
        if (rk != null) {
            rk.m39496D1();
        }
    }

    @Override
    public void mo7703f(AbstractView$OnTouchListenerC7889a aVar, boolean z) {
        m7693h0();
    }

    public boolean m7702f0(final long j, final long j2, boolean z, boolean z2) {
        int n0;
        if (this.f31414O.m7509H() != j || (n0 = this.f31430c.m8112n0(j2)) == -1) {
            return false;
        }
        if (z) {
            this.f31428b.m2485dd().postDelayed(new Runnable() {
                @Override
                public final void run() {
                    C9678w2.this.m7635t1(j, j2);
                }
            }, C4183a.f14096n ? 120L : 40L);
            return true;
        }
        m7796H2(n0, this.f31430c.m8116j0(n0), 0, true, false);
        return true;
    }

    public boolean m7701f1() {
        return this.f31414O.m7500Q();
    }

    public void m7700f2() {
        this.f31454z0.m8434k();
        if (m7692h1()) {
            m7735Y(this.f31417R, "", this.f31416Q);
        }
    }

    public final void m7699f3() {
        long H = this.f31414O.m7509H();
        long j = this.f31411B0;
        if (j != H) {
            if (j != 0) {
                this.f31426a.m32272pr(j);
                this.f31428b.m2781K9().m1806t0(this.f31411B0, this);
                this.f31428b.m2781K9().m1810s0(this.f31411B0, this);
                this.f31428b.m2480e2().m1722K1(this.f31411B0, this);
            }
            this.f31411B0 = H;
            if (H != 0) {
                this.f31426a.m32364ir(H);
                this.f31428b.m2781K9().m1858g0(H, this);
                this.f31428b.m2781K9().m1862f0(H, this);
                this.f31428b.m2480e2().m1740G(this.f31411B0, this);
            }
        }
    }

    @Override
    public void mo4082g(long j) {
        if (this.f31414O.m7509H() == j) {
            m7688i0();
        }
    }

    public void m7698g0() {
        if (m7812D0() == 0 && !this.f31414O.m7515B() && !this.f31414O.m7516A() && !this.f31414O.m7497T()) {
            this.f31426a.m32755Eq();
        }
    }

    public boolean m7697g1() {
        return this.f31433e0;
    }

    public final void m7696g2() {
        m7605z3();
        m7810D2();
    }

    public final void m7693h0() {
        boolean y1 = this.f31426a.mo4347s().m14414y1();
        boolean z = true;
        if (Log.isEnabled(8)) {
            Log.m14721i(8, "MessagesManager checkFocus parentFocused:%b, parentPaused:%b, isFocused:%b, passcodeShowing:%b", Boolean.valueOf(this.f31440l0), Boolean.valueOf(this.f31439k0), Boolean.valueOf(this.f31442n0), Boolean.valueOf(y1));
        }
        if (!this.f31440l0 || this.f31439k0 || y1) {
            z = false;
        }
        m7764P2(z);
    }

    public boolean m7692h1() {
        return this.f31414O.m7504M() == 1;
    }

    public void m7691h2() {
        this.f31414O.m7447v0();
        m7710d2();
    }

    public final void m7690h3() {
        long j = this.f31411B0;
        if (j != 0) {
            this.f31426a.m32272pr(j);
            this.f31428b.m2781K9().m1806t0(this.f31411B0, this);
            this.f31411B0 = 0L;
        }
    }

    public final void m7688i0() {
        C4837y0 y0Var = this.f31427a0;
        m7728Z2(y0Var != null && y0Var.m4491x() && !this.f31428b.m2294pc().m4140Q(this.f31414O.m7509H(), this.f31427a0.m25105F0()));
    }

    public boolean m7687i1() {
        return this.f31442n0;
    }

    public void m7686i2() {
        m7705e2();
    }

    public final void m7685i3() {
        TdApi.ChatAdministrator chatAdministrator;
        long j = 0;
        TdApi.ChatAdministrator chatAdministrator2 = null;
        for (int i = 0; i < this.f31430c.m8115k0(); i++) {
            AbstractC4761s4 j0 = this.f31430c.m8116j0(i);
            if (j0 != null) {
                long R0 = C7321e.m16984R0(j0.m25993Z3());
                if (j != R0) {
                    C6035e<TdApi.ChatAdministrator> eVar = this.f31418S;
                    if (eVar != null) {
                        chatAdministrator = eVar.m21505f(R0);
                    } else {
                        R0 = j;
                        chatAdministrator = null;
                    }
                    chatAdministrator2 = chatAdministrator;
                    j = R0;
                }
                j0.m26047T8(chatAdministrator2);
            }
        }
    }

    public final void m7683j0(AbstractC4761s4 s4Var, int i, long j) {
    }

    public boolean m7682j1() {
        return this.f31449u0;
    }

    public void m7681j2() {
        if (this.f31454z0 == null) {
            this.f31454z0 = new C9521d3(this.f31428b, this);
        }
        this.f31454z0.m8433l();
    }

    public void m7680j3(List<TdApi.Message> list, C10930q6.C10936f fVar) {
        TdApi.Message message = list.get(0);
        if (this.f31414O.m7509H() == message.chatId) {
            TdApi.Message message2 = list.get(list.size() - 1);
            int n0 = this.f31430c.m8112n0(message.f25406id);
            if (n0 != -1) {
                AbstractC4761s4 j0 = this.f31430c.m8116j0(n0);
                int i = 0;
                int i2 = 0;
                for (TdApi.Message message3 : fVar.f35133a) {
                    long j = message3.f25406id;
                    if (j > message.f25406id) {
                        i++;
                    } else if (j < message2.f25406id) {
                        i2++;
                    }
                }
                for (int i3 = i - 1; i3 >= 0; i3--) {
                    j0.m26199F0(fVar.f35133a.get(i3), true);
                }
                for (int size = fVar.f35133a.size() - i2; size < fVar.f35133a.size(); size++) {
                    j0.m26199F0(fVar.f35133a.get(size), false);
                }
                j0.mo13519a();
            }
        }
    }

    public final void m7678k0(int i, int i2) {
        if (!m7645r0().m32514Xk()) {
            boolean z = true;
            boolean z2 = (m7812D0() > 0) && i != -1 && i2 != -1 && this.f31430c.m8115k0() >= i2;
            if (z2) {
                z2 = i >= 2;
                if (!z2) {
                    int R0 = m7758R0();
                    int i3 = R0 / 2;
                    long j = 0;
                    for (int i4 = 0; i4 < i; i4++) {
                        AbstractC4761s4 j0 = this.f31430c.m8116j0(i4);
                        if (j0 != null) {
                            j += j0.mo25354J3();
                            if (j >= i3) {
                                break;
                            }
                        }
                    }
                    View C = this.f31412M.mo39262C(i);
                    if (C != null) {
                        j += C.getBottom() - R0;
                    }
                    if (j < i3) {
                        z = false;
                    }
                    z2 = z;
                }
            }
            this.f31424Y = z2;
            m7669m0();
        }
    }

    public final boolean m7677k1(long j, long j2, AbstractC4761s4 s4Var) {
        return this.f31426a.m32409fl(j, j2, s4Var);
    }

    public void m7676k2() {
        if (this.f31437i0 == null || !m7714c3()) {
            this.f31438j0 = true;
        } else {
            AbstractC4761s4 s4Var = this.f31437i0;
            if (s4Var instanceof C4791t4) {
                ((C4791t4) s4Var).m25352da(this.f31430c);
            }
            this.f31430c.m8124a0(this.f31437i0, true, false);
        }
        m7698g0();
        m7705e2();
        m7623w0();
        m7810D2();
    }

    public void m7675k3(long j) {
        int k0 = this.f31430c.m8115k0() - 1;
        AbstractC4761s4 s4Var = null;
        while (k0 >= 0) {
            AbstractC4761s4 j0 = this.f31430c.m8116j0(k0);
            if (j0.m25928g6() && j0.m26109N9(j, s4Var)) {
                m7706e1(k0);
            }
            k0--;
            s4Var = j0;
        }
    }

    @Override
    public void mo4042k5(final TdApi.Message message, final long j, int i, String str) {
        int c1 = m7716c1(message.chatId, j);
        if (c1 != -1) {
            this.f31435g0.set(c1, message);
        } else {
            this.f31428b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C9678w2.this.m7807E1(message, j);
                }
            });
        }
    }

    @Override
    public void mo4041l0(final long j, final long j2, final TdApi.MessageContent messageContent) {
        int c1 = m7716c1(j, j2);
        if (c1 != -1) {
            this.f31435g0.get(c1).content = messageContent;
        } else {
            this.f31428b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C9678w2.this.m7622w1(j, j2, messageContent);
                }
            });
        }
    }

    public boolean m7673l1() {
        return !this.f31430c.m8109q0();
    }

    public void m7672l2() {
        m7605z3();
        m7810D2();
    }

    public final void m7671l3(long j, long j2, TdApi.MessageContent messageContent) {
        ArrayList<AbstractC4761s4> i0;
        this.f31426a.m32210uo(j, j2, messageContent);
        if (!this.f31430c.m8109q0() && (i0 = this.f31430c.m8117i0()) != null && !i0.isEmpty()) {
            int i = 0;
            Iterator<AbstractC4761s4> it = i0.iterator();
            while (it.hasNext()) {
                AbstractC4761s4 next = it.next();
                TdApi.Message Z3 = next.m25993Z3();
                if (next.m26050T5(j2)) {
                    m7616x2(next, i, j2, messageContent);
                } else if (Z3.replyToMessageId == j2) {
                    next.m26191F8(j2, messageContent);
                }
                i++;
            }
        }
    }

    public void m7669m0() {
        this.f31426a.m32391gq(m7812D0() > 0 && (this.f31424Y || this.f31414O.m7516A() || m7737X0()), m7668m1());
    }

    public final boolean m7668m1() {
        if (!m7737X0()) {
            return false;
        }
        long[] jArr = this.f31410A0;
        long j = jArr[jArr.length - 1];
        int n0 = this.f31430c.m8112n0(j);
        if (n0 == -1) {
            AbstractC4761s4 B0 = m7820B0();
            return B0 != null && B0.m26205E4() > j;
        }
        AbstractC4761s4 j0 = this.f31430c.m8116j0(n0);
        int S0 = m7754S0();
        int V0 = m7744V0();
        j0.m25934g0(S0);
        return m7722b0(n0, ((V0 / 2) - (j0.mo25354J3() / 2)) + j0.m25765x1()) < 0;
    }

    public void m7667m2(TdApi.Chat chat, C4737p7 p7Var, TdApi.SearchMessagesFilter searchMessagesFilter, View$OnClickListenerC2971rh rhVar, boolean z, boolean z2) {
        int i = 0;
        if (chat.f25367id != 0) {
            if (Log.isEnabled(8)) {
                Log.m14721i(8, "[CREATE] chatId:%d", Long.valueOf(chat.f25367id));
            }
            this.f31428b.m2136za(chat.f25367id, rhVar);
        }
        long j = chat.f25367id;
        if (j == 0 || p7Var != null || z || !z2) {
            this.f31427a0 = null;
        } else {
            m7711d1(j, 10, 50);
        }
        if (z || !this.f31428b.m2867F3(chat)) {
            C9706y1 y1Var = this.f31414O;
            if (z) {
                i = 4;
            }
            y1Var.m7445w0(chat, p7Var, i, searchMessagesFilter);
            m7659o0();
            this.f31430c.m8126A0(chat.type);
            C7319d dVar = this.f31450v0;
            if (dVar != null) {
                m7769O1(dVar, this.f31451w0, true);
            } else {
                m7765P1();
            }
        } else {
            this.f31414O.m7445w0(chat, p7Var, 3, null);
            m7659o0();
            this.f31430c.m8126A0(chat.type);
            m7765P1();
        }
        m7699f3();
    }

    public final void m7666m3(long j, int i, TdApi.ReplyMarkup replyMarkup) {
        int n0 = this.f31430c.m8112n0(j);
        if (n0 != -1) {
            int i9 = this.f31430c.m8118h0(n0).m25905i9(j, i, replyMarkup);
            if (i9 == 1) {
                m7706e1(n0);
            } else if (i9 == 2) {
                m7808E0().m39312I(n0);
            }
        }
    }

    public void m7664n0() {
        this.f31430c.m8122d0(false);
        m7676k2();
    }

    public boolean m7663n1() {
        return this.f31414O.m7504M() == 2;
    }

    public void m7662n2(TdApi.Chat chat) {
        this.f31414O.m7445w0(chat, null, 1, null);
        this.f31430c.m8126A0(chat.type);
        m7765P1();
    }

    public void m7661n3(long j, TdApi.MessageInteractionInfo messageInteractionInfo) {
        int n0 = this.f31430c.m8112n0(j);
        if (n0 != -1 && this.f31430c.m8118h0(n0).m25896j9(j, messageInteractionInfo)) {
            m7706e1(n0);
        }
    }

    public void m7659o0() {
        AbstractC4761s4 s4Var = this.f31437i0;
        if (s4Var != null) {
            s4Var.m26151J7();
        }
        this.f31437i0 = null;
        this.f31438j0 = false;
    }

    public boolean m7658o1() {
        return this.f31414O.m7496U();
    }

    public void m7657o2(TdApi.Chat chat, String str, TdApi.MessageSender messageSender, TdApi.SearchMessagesFilter searchMessagesFilter) {
        this.f31414O.m7445w0(chat, null, 2, searchMessagesFilter);
        this.f31414O.m7441y0(str, messageSender, searchMessagesFilter);
        this.f31430c.m8126A0(chat.type);
        if (searchMessagesFilter != null && searchMessagesFilter.getConstructor() == 371805512) {
            m7711d1(chat.f25367id, 1, 1);
        }
        C7319d dVar = this.f31450v0;
        if (dVar != null) {
            m7769O1(dVar, this.f31451w0, true);
        } else {
            m7765P1();
        }
        m7699f3();
    }

    public void m7656o3(long j, boolean z) {
        int n0 = this.f31430c.m8112n0(j);
        if (n0 != -1 && this.f31430c.m8118h0(n0).m25953d9(j, z)) {
            m7706e1(n0);
        }
    }

    public C8113c m7654p0(final long j, TdApi.SearchMessagesFilter searchMessagesFilter) {
        ArrayList<AbstractC4761s4> i0 = this.f31430c.m8117i0();
        if (i0 == null) {
            return null;
        }
        final ArrayList<C8112b> arrayList = new ArrayList<>();
        final boolean z = searchMessagesFilter != null && searchMessagesFilter.getConstructor() == -155713339;
        final boolean[] zArr = new boolean[1];
        final int[] iArr = new int[1];
        AbstractC5918j<TdApi.Message> n2Var = new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                C9678w2.this.m7631u1(z, arrayList, zArr, iArr, j, (TdApi.Message) obj);
            }
        };
        Iterator<AbstractC4761s4> it = i0.iterator();
        while (it.hasNext()) {
            it.next().m25790u6(n2Var, true);
        }
        if (!zArr[0]) {
            return null;
        }
        C8113c cVar = new C8113c(this.f31426a.mo4347s(), this.f31428b);
        cVar.m13448t(iArr[0], arrayList);
        return cVar;
    }

    @Override
    public void mo4040p1(long j, long j2, TdApi.UnreadReaction[] unreadReactionArr, int i) {
        C10722i1.m4160l(this, j, j2, unreadReactionArr, i);
    }

    public List<AbstractC4761s4> m7653p2(List<TdApi.Message> list) {
        ArrayList arrayList = new ArrayList(list.size());
        TdApi.Chat L3 = this.f31428b.m2771L3(list.get(0).chatId);
        C6035e<TdApi.ChatAdministrator> eVar = this.f31418S;
        AbstractC4761s4 s4Var = null;
        for (TdApi.Message message : list) {
            if (s4Var != null) {
                if (!s4Var.m26199F0(message, true)) {
                    s4Var.m25799t8();
                    arrayList.add(s4Var);
                }
            }
            s4Var = AbstractC4761s4.m26008X9(this, message, L3, eVar);
        }
        if (s4Var != null) {
            s4Var.m25799t8();
            arrayList.add(s4Var);
        }
        return arrayList;
    }

    public void m7652p3(long j) {
        ArrayList<TdApi.Message> arrayList = this.f31452x0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i = 0;
            Iterator<TdApi.Message> it = this.f31452x0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().f25406id == j) {
                    this.f31452x0.remove(i);
                    break;
                } else {
                    i++;
                }
            }
        }
        int n0 = this.f31430c.m8112n0(j);
        if (n0 != -1) {
            this.f31430c.m8118h0(n0).m25758x8(j);
        }
    }

    public int compare(AbstractC4761s4 s4Var, AbstractC4761s4 s4Var2) {
        return Long.compare(s4Var2.m26115N3(), s4Var.m26115N3());
    }

    public boolean m7649q1() {
        return !this.f31414O.m7516A() && !this.f31414O.m7515B() && !this.f31414O.m7497T() && this.f31430c.m8115k0() == 0;
    }

    public void m7648q2(boolean z, boolean z2) {
        AbstractC4761s4 l0;
        if (this.f31430c.m8115k0() != 0 && (l0 = this.f31430c.m8114l0()) != null && (l0 instanceof C4791t4)) {
            final C4791t4 t4Var = (C4791t4) l0;
            View C0 = m7816C0();
            if (C0 == null) {
                C9580j1 j1Var = this.f31430c;
                j1Var.m39312I(j1Var.m8115k0() - 1);
                return;
            }
            final int ca2 = t4Var.m25353ca();
            C0.post(new Runnable() {
                @Override
                public final void run() {
                    C9678w2.this.m7793I1(ca2, t4Var);
                }
            });
        }
    }

    public final void m7647q3(long j) {
        int n0 = this.f31430c.m8112n0(j);
        if (n0 != -1) {
            this.f31430c.m8118h0(n0).m25888k9(j);
            m7706e1(n0);
        }
    }

    @Override
    public boolean mo6987q7(TdApi.Message message, boolean z, boolean z2, List<TdApi.Message> list, long j) {
        return j != 0 && j == message.chatId && !z;
    }

    public View$OnClickListenerC2971rh m7645r0() {
        return this.f31426a;
    }

    public void m7643r2() {
        AbstractC4761s4 g0;
        if (this.f31430c.m8115k0() != 0 && (g0 = this.f31430c.m8119g0()) != null) {
            g0.m26223C8();
            this.f31430c.m39312I(0);
        }
    }

    public final void m7642r3(TdApi.Message message, long j) {
        m7620w3(j, message.f25406id);
        int n0 = this.f31430c.m8112n0(j);
        if (n0 != -1 && this.f31430c.m8118h0(n0).m25817r9(message, j)) {
            m7706e1(n0);
        }
    }

    @Override
    public void mo4039r5(final long j, final long j2, final int i, final TdApi.ReplyMarkup replyMarkup) {
        int c1 = m7716c1(j, j2);
        if (c1 != -1) {
            TdApi.Message message = this.f31435g0.get(c1);
            message.editDate = i;
            message.replyMarkup = replyMarkup;
            return;
        }
        this.f31428b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                C9678w2.this.m7617x1(j, j2, i, replyMarkup);
            }
        });
    }

    public TdApi.User m7640s0(long j) {
        C6035e<TdApi.User> eVar = this.f31434f0;
        if (eVar != null) {
            return eVar.m21505f(j);
        }
        return null;
    }

    public void m7638s2() {
        ArrayList<AbstractC4761s4> i0 = this.f31430c.m8117i0();
        if (i0 != null) {
            Iterator<AbstractC4761s4> it = i0.iterator();
            while (it.hasNext()) {
                AbstractC4761s4 next = it.next();
                int J3 = next.mo25354J3();
                next.m26223C8();
                if (J3 == next.mo25354J3() || m7615x3()) {
                    next.m25791u5();
                } else {
                    next.m26140K8();
                }
            }
        }
    }

    @Override
    public void mo4251s3(final long j, final long j2) {
        this.f31428b.m2469ed(new Runnable() {
            @Override
            public final void run() {
                C9678w2.this.m7819B1(j, j2);
            }
        });
    }

    @Override
    public C9773p0.C9775b mo6986s5(final TdApi.Message message) {
        int n0;
        if (this.f31414O.m7509H() != message.chatId || (n0 = this.f31430c.m8112n0(message.f25406id)) == -1) {
            return null;
        }
        AbstractC4761s4 j0 = this.f31430c.m8116j0(n0);
        final int constructor = message.content.getConstructor();
        final ArrayList arrayList = new ArrayList();
        int k0 = this.f31430c.m8115k0();
        final AbstractC5918j<TdApi.Message> l2Var = new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                C9678w2.this.m7644r1(constructor, arrayList, (TdApi.Message) obj);
            }
        };
        for (int i = k0 - 1; i > n0; i--) {
            AbstractC4761s4 j02 = this.f31430c.m8116j0(i);
            if (j02 != null) {
                j02.m25790u6(l2Var, false);
            }
        }
        final AtomicInteger atomicInteger = new AtomicInteger(-1);
        j0.m25790u6(new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                C9678w2.m7639s1(TdApi.Message.this, atomicInteger, arrayList, l2Var, (TdApi.Message) obj);
            }
        }, false);
        if (atomicInteger.get() != -1) {
            for (int i2 = n0 - 1; i2 >= 0; i2--) {
                AbstractC4761s4 j03 = this.f31430c.m8116j0(i2);
                if (j03 != null) {
                    j03.m25790u6(l2Var, false);
                }
            }
            if (arrayList.size() == 1) {
                return null;
            }
            return new C9773p0.C9775b(arrayList, atomicInteger.get());
        }
        throw new IllegalStateException();
    }

    public void m7636t0(AbstractC9323v4<?> v4Var) {
        m7823A2();
        m7707e0();
        this.f31410A0 = null;
        this.f31451w0 = 0;
        this.f31428b.m2294pc().m4126d0(this);
        this.f31450v0 = null;
        this.f31425Z = false;
        this.f31422W = 0L;
        this.f31418S = null;
        C4837y0 y0Var = this.f31427a0;
        if (y0Var != null) {
            y0Var.mo4501a3();
            this.f31427a0 = null;
        }
        this.f31432d0 = false;
        this.f31448t0 = false;
        m7690h3();
        this.f31453y0 = null;
        this.f31452x0 = null;
        long H = this.f31414O.m7509H();
        if (H != 0) {
            if (Log.isEnabled(8)) {
                Log.m14721i(8, "[DESTROY] chatId:%d", Long.valueOf(H));
            }
            this.f31428b.m2190w4(H, v4Var, true);
        }
        this.f31414O.m7449u0();
        this.f31430c.m8122d0(true);
        m7659o0();
        this.f31420U = 0L;
        this.f31421V = 0L;
        this.f31436h0 = false;
    }

    @Override
    public void mo255t2(final TdApi.Object object) {
        if (object.getConstructor() != -722616727) {
            this.f31428b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C9678w2.this.m7797H1(object);
                }
            });
        }
    }

    public final void m7634t3(TdApi.Message message, long j) {
        m7620w3(j, message.f25406id);
        int n0 = this.f31430c.m8112n0(j);
        if (n0 != -1) {
            AbstractC4761s4 h0 = this.f31430c.m8118h0(n0);
            int s9 = h0.m25808s9(message, j);
            if (s9 == 1) {
                m7706e1(n0);
            } else if (s9 == 2) {
                m7808E0().m39312I(n0);
            } else if (s9 == 3) {
                m7621w2(h0, n0, message.f25406id, message);
            }
            m7683j0(h0, n0, message.f25406id);
            m7605z3();
        }
    }

    public void m7632u0() {
        if (!this.f31428b.m2443g7(this.f31414O.m7509H())) {
            long T1 = m7750T1();
            if (T1 != 0) {
                this.f31428b.m2294pc().m4107n(this.f31414O.m7509H(), T1);
                m7728Z2(false);
            }
        }
    }

    @Override
    public void mo1560u2(final long j, final TdApi.ChatMember chatMember) {
        this.f31428b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                C9678w2.this.m7627v1(j, chatMember);
            }
        });
    }

    public void m7630u3(long j, long[] jArr) {
        this.f31426a.m32536Vo(jArr);
        this.f31426a.m32727H(j, jArr);
        int yk = this.f31426a.m32162yk();
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (i < this.f31430c.m8115k0()) {
            AbstractC4761s4 j0 = this.f31430c.m8116j0(i);
            int length = jArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    i++;
                    break;
                }
                long j2 = jArr[i3];
                int D8 = j0.m26212D8(j2);
                if (D8 != 0) {
                    if (D8 == 1) {
                        if (this.f31426a.m32285or(j2, this.f31430c.m8104w0(i))) {
                            yk--;
                            z = true;
                        }
                        i2++;
                        if (i2 == jArr.length) {
                            break;
                        }
                    } else if (D8 == 2) {
                        if (this.f31426a.m32285or(j2, j0)) {
                            yk--;
                            z = true;
                        }
                        i2++;
                        if (i2 == jArr.length) {
                            break;
                        }
                    }
                } else if (j0.m25993Z3().replyToMessageId == j2) {
                    j0.m26201E8(j2);
                }
                i3++;
            }
        }
        if (z) {
            if (yk == 0) {
                this.f31426a.m9307Y8();
            } else {
                this.f31426a.m9402Kd(yk);
            }
        }
        if (i2 > 0) {
            int k0 = this.f31430c.m8115k0();
            if (k0 == 0) {
                if (this.f31414O.m7515B() || this.f31414O.m7516A()) {
                    this.f31426a.m32562To();
                } else {
                    m7664n0();
                }
            } else if (k0 == 1 && (this.f31430c.m8116j0(0) instanceof C4791t4)) {
                m7648q2(false, false);
                this.f31426a.m32755Eq();
            }
        }
    }

    public void m7628v0(ArrayList<AbstractC4761s4> arrayList, int i, int i2, AbstractC4761s4 s4Var, C7319d dVar, int i3, boolean z) {
        if (arrayList.size() != 0 || i == 0 || i == 3) {
            C6035e<TdApi.ChatAdministrator> eVar = this.f31418S;
            if (eVar != null) {
                long j = 0;
                TdApi.ChatAdministrator chatAdministrator = null;
                Iterator<AbstractC4761s4> it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC4761s4 next = it.next();
                    if (next.m26166I1() == null) {
                        long i4 = next.m26247A4().m4207i();
                        if (j != i4) {
                            chatAdministrator = eVar.m21505f(i4);
                            j = i4;
                        }
                        next.m26047T8(chatAdministrator);
                    }
                }
            }
            if (i != 0) {
                if (i == 1) {
                    this.f31430c.m8123c0(arrayList, true);
                    m7705e2();
                    return;
                } else if (i == 2) {
                    int X1 = this.f31412M.m39549X1();
                    View C = this.f31412M.mo39262C(X1);
                    int W = C == null ? 0 : this.f31412M.m39229W() - C.getBottom();
                    this.f31430c.m8123c0(arrayList, false);
                    this.f31412M.m39522z2(X1 + arrayList.size(), W);
                    return;
                } else if (i != 3) {
                    return;
                }
            }
            if (i == 3) {
                this.f31430c.m8101z0(arrayList);
            } else {
                this.f31430c.m8123c0(arrayList, true);
            }
            if (s4Var != null) {
                m7796H2(i2, s4Var, i3 == 0 ? -1 : i3, false, false);
            } else if (dVar != null && dVar.m17023g() && !arrayList.isEmpty()) {
                this.f31412M.m39522z2(arrayList.size() - 1, -arrayList.get(arrayList.size() - 1).mo25354J3());
            } else if (i2 == 0) {
                this.f31412M.m39522z2(0, 0);
            } else {
                this.f31412M.mo39018x1(i2);
            }
            if (!z) {
                m7705e2();
            }
            m7605z3();
        } else if (!z) {
            m7705e2();
        }
    }

    public void m7626v2() {
        this.f31426a.mo4347s().m14413y2(this);
    }

    public final void m7625v3(AbstractC4761s4 s4Var) {
        int M = this.f31414O.m7504M();
        if (M != 2 && M != 3) {
            long K = this.f31414O.m7506K();
            if (K == 0 || s4Var.m25930g4() == K) {
                if (!s4Var.m25928g6()) {
                    this.f31426a.m32411fj(s4Var.m25993Z3());
                }
                if (!this.f31414O.m7516A()) {
                    boolean z = this.f31412M.m39549X1() == 0;
                    AbstractC4761s4 g0 = this.f31430c.m8119g0();
                    if (g0 == null || !g0.m26199F0(s4Var.m25993Z3(), true)) {
                        boolean z2 = (s4Var.m25851o6() || (z && (!s4Var.m25937f6() || s4Var.m26113N5()))) && !s4Var.mo25841p6();
                        if (z2) {
                            if (!this.f31430c.m8124a0(s4Var, false, z2)) {
                                m7799G2(false);
                            }
                            if (s4Var.m25851o6()) {
                                m7814C2();
                            }
                        } else if (z) {
                            View C = this.f31412M.mo39262C(0);
                            int bottom = (C == null || C.getParent() == null) ? 0 : ((View) C.getParent()).getBottom() - C.getBottom();
                            boolean z3 = this.f31412M.m39553T1() == 0;
                            if (this.f31430c.m8124a0(s4Var, false, z2)) {
                                return;
                            }
                            if (!s4Var.mo25841p6() || !z3) {
                                this.f31412M.m39522z2(0, bottom);
                            } else if (this.f31426a.m32671Li()) {
                                this.f31412M.mo39018x1(1);
                            } else {
                                this.f31412M.m39522z2(1, C1357a0.m37541i(48.0f));
                            }
                        } else {
                            this.f31430c.m8124a0(s4Var, false, z2);
                        }
                    } else {
                        if (!z) {
                            g0.m26049T6();
                        }
                        g0.m26246A5(s4Var.m26115N3(), -1);
                        s4Var.m26151J7();
                    }
                } else if (s4Var.m25851o6()) {
                    m7765P1();
                }
            }
        }
    }

    public void m7623w0() {
        int k0 = this.f31430c.m8115k0();
        if (k0 <= 0) {
            return;
        }
        if (this.f31414O.m7515B() || this.f31414O.m7516A()) {
            long j = 0;
            for (int i = 0; i < k0; i++) {
                j += this.f31430c.m8116j0(i).mo25354J3();
            }
            if (j < m7758R0()) {
                this.f31414O.m7469k0();
            }
        }
    }

    public final void m7621w2(AbstractC4761s4 s4Var, int i, long j, TdApi.Message message) {
        int D8 = s4Var.m26212D8(j);
        if (D8 == 1) {
            this.f31430c.m8103x0(i, AbstractC4761s4.m26008X9(this, message, s4Var.m26207E2(), this.f31418S));
        } else if (D8 == 2) {
            Log.m14709w("Warning: message combination breaking is not supported", new Object[0]);
        }
    }

    public final void m7620w3(long j, long j2) {
        int s;
        if (m7737X0() && (s = C5062b.m24153s(this.f31410A0, j)) >= 0) {
            long[] jArr = this.f31410A0;
            jArr[s] = j2;
            Arrays.sort(jArr);
            m7810D2();
        }
    }

    public long[] m7618x0(C7319d dVar) {
        return (!m7737X0() || !this.f31450v0.m17028b(dVar)) ? new long[]{dVar.m17026d()} : C5062b.m24170b(this.f31410A0, dVar.m17026d());
    }

    public final void m7616x2(AbstractC4761s4 s4Var, int i, long j, TdApi.MessageContent messageContent) {
        int h9 = s4Var.m25915h9(j, messageContent);
        if (h9 == 1) {
            m7706e1(i);
        } else if (h9 == 2) {
            m7808E0().m39312I(i);
        } else if (h9 == 3) {
            TdApi.Message a4 = s4Var.m25984a4(j);
            a4.content = messageContent;
            m7621w2(s4Var, i, j, a4);
        }
    }

    public boolean m7615x3() {
        C10733ic pc = m7645r0().mo4348c().m2294pc();
        if (!this.f31414O.m7500Q() ? !pc.m4086x0() : pc.m4099r()) {
            if (!this.f31426a.m32527Wk()) {
                return false;
            }
        }
        return true;
    }

    public final boolean m7613y0(TdApi.Message message, int i) {
        return !this.f31428b.m2595W9(message) && i == message.content.getConstructor();
    }

    public final void m7611y2() {
        synchronized (this.f31426a) {
            if (!this.f31426a.f9933U0) {
                C9706y1 y1Var = this.f31414O;
                y1Var.m7451t0(y1Var.m7509H(), new AbstractC5918j() {
                    @Override
                    public final void mo1330a(Object obj) {
                        C9678w2.this.m7781L1((TdApi.SponsoredMessage) obj);
                    }
                });
            }
        }
    }

    public final void m7610y3(int i, int i2) {
        C6035e<long[]> eVar;
        long j;
        boolean z;
        int i3 = i;
        int i4 = i2;
        if (!(i3 == -1 || i4 == -1 || m7725a1() || !this.f31442n0)) {
            AbstractC4761s4 j0 = this.f31430c.m8116j0(i3);
            AbstractC4761s4 j02 = this.f31430c.m8116j0(i4);
            if (!(j0 == null || j02 == null)) {
                long E4 = j0.m26205E4();
                long S1 = j02.m26065S1();
                int i5 = i4 - i3;
                int i6 = i5 + 1;
                if (!(this.f31420U == E4 && this.f31421V == S1 && this.f31423X == i6)) {
                    boolean z2 = false;
                    boolean z3 = false;
                    C5323f fVar = null;
                    int i7 = 0;
                    C6035e eVar2 = null;
                    boolean z4 = true;
                    while (i3 <= i4) {
                        View C = this.f31412M.mo39262C(i3);
                        boolean z5 = C instanceof AbstractC9685g;
                        if (!z5) {
                            z4 = false;
                        }
                        AbstractC4761s4 message = z5 ? ((AbstractC9685g) C).getMessage() : null;
                        if (message != null) {
                            if (!message.m25856o0() && !message.mo25841p6()) {
                                z2 = true;
                            }
                            if (message == this.f31437i0) {
                                z3 = true;
                            }
                            i7 = Math.max(message.m25911i3(), i7);
                            if (message.m26039U6()) {
                                z = z2;
                                long S12 = message.m26065S1();
                                if (message.m26107O0()) {
                                    j = S1;
                                    if (S12 > this.f31422W) {
                                        this.f31422W = S12;
                                    }
                                } else {
                                    j = S1;
                                }
                                if (fVar == null) {
                                    fVar = new C5323f(i5);
                                } else {
                                    fVar.m23261i(i5);
                                }
                                message.m26094P3(fVar);
                            } else {
                                j = S1;
                                z = z2;
                            }
                            if (message.mo25349w7()) {
                                if (eVar2 == null) {
                                    eVar2 = new C6035e();
                                }
                                C5323f fVar2 = (C5323f) eVar2.m21505f(message.m26145K2());
                                if (fVar2 == null) {
                                    fVar2 = new C5323f(i5);
                                    eVar2.m21500k(message.m26145K2(), fVar2);
                                } else {
                                    fVar2.m23261i(i5);
                                }
                                message.m26094P3(fVar2);
                            }
                            z2 = z;
                        } else {
                            j = S1;
                        }
                        i3++;
                        i4 = i2;
                        S1 = j;
                    }
                    long j2 = S1;
                    if (eVar2 != null) {
                        C6035e<long[]> eVar3 = new C6035e<>(eVar2.m21496p());
                        for (int i8 = 0; i8 < eVar2.m21496p(); i8++) {
                            eVar3.m21510a(eVar2.m21501j(i8), ((C5323f) eVar2.m21495q(i8)).m23259r());
                        }
                        eVar = eVar3;
                    } else {
                        eVar = null;
                    }
                    if (z4) {
                        this.f31420U = E4;
                        this.f31421V = j2;
                        this.f31423X = i6;
                    } else {
                        this.f31423X = 0;
                        long j3 = 0;
                        this.f31421V = j3;
                        this.f31420U = j3;
                    }
                    m7760Q2(z2);
                    m7723a3(this.f31414O.m7509H(), this.f31414O.m7506K(), eVar, i7);
                    m7752S2(z3);
                    if (fVar != null) {
                        m7822A3(this.f31414O.m7509H(), this.f31414O.m7506K(), fVar, true);
                    }
                }
            }
        }
    }

    public AbstractC4761s4 m7608z0() {
        int T1 = this.f31412M.m39553T1();
        if (T1 == -1) {
            T1 = this.f31412M.m39549X1();
        }
        if (T1 != -1) {
            return this.f31430c.m8116j0(T1);
        }
        return null;
    }

    public void m7606z2(C7319d dVar, int i) {
        m7659o0();
        this.f31450v0 = dVar;
        this.f31451w0 = i;
        m7769O1(dVar, i, false);
    }

    public void m7605z3() {
        LinearLayoutManager linearLayoutManager = this.f31412M;
        if (linearLayoutManager != null) {
            int X1 = linearLayoutManager.m39549X1();
            int a2 = this.f31412M.m39546a2();
            if (!(X1 == -1 || a2 == -1)) {
                m7610y3(X1, a2);
                if (this.f31442n0 && ((X1 - 7 > 0 || !this.f31414O.m7473i0(false)) && a2 + 10 >= this.f31430c.mo6153D())) {
                    this.f31414O.m7473i0(true);
                }
            }
            m7678k0(X1, a2);
            this.f31426a.m32463bj(X1, a2, true);
        }
    }

    @Override
    public void mo4038z5(final long j, final long j2) {
        int c1 = m7716c1(j, j2);
        if (c1 != -1) {
            C4779t2.m25497i5(this.f31435g0.get(c1));
        } else {
            this.f31428b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C9678w2.this.m7824A1(j, j2);
                }
            });
        }
    }
}
