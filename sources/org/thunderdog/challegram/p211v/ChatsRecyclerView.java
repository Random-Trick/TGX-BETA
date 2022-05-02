package org.thunderdog.challegram.p211v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p038ce.View$OnClickListenerC2805o4;
import p080fb.C4335b;
import p080fb.C4336c;
import p141jd.C5974t0;
import vc.C9903a;
import vc.C9906c;

public class ChatsRecyclerView extends CustomRecyclerView implements C4336c.AbstractC4337a {
    public int f25713F1;
    public int f25714G1;
    public View$OnClickListenerC2805o4 f25715H1;
    public C9906c f25716I1;
    public LinearLayoutManager f25717J1;
    public AbstractC7919b f25718K1;
    public final C4336c f25719L1 = new C4336c(this);

    public class C7918a extends RecyclerView.AbstractC0910t {
        public C7918a() {
        }

        @Override
        public void mo421b(RecyclerView recyclerView, int i, int i2) {
            if (i2 > 0) {
                if (ChatsRecyclerView.this.f25715H1 != null && ChatsRecyclerView.this.f25715H1.m9332Ua() && !ChatsRecyclerView.this.isVerticalScrollBarEnabled()) {
                    ChatsRecyclerView.this.setVerticalScrollBarEnabled(true);
                    ChatsRecyclerView.this.f25715H1.m9144vc();
                }
                if (ChatsRecyclerView.this.f25718K1 != null && ChatsRecyclerView.this.f25718K1.mo14164q1() && ChatsRecyclerView.this.f25717J1.m39549a2() + 15 >= ChatsRecyclerView.this.f25716I1.mo6153D()) {
                    ChatsRecyclerView.this.f25718K1.mo14165A0();
                }
            }
        }
    }

    public interface AbstractC7919b {
        void mo14165A0();

        boolean mo14164q1();
    }

    public ChatsRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m14192P1(context);
    }

    @Override
    public boolean mo7429B(float f, float f2) {
        return C4335b.m28260d(this, f, f2);
    }

    @Override
    public void mo7428C(View view, float f, float f2) {
        this.f25715H1.m33407Xj(f, f2);
    }

    @Override
    public void mo7427F(View view, float f, float f2) {
        C4335b.m28256h(this, view, f, f2);
    }

    @Override
    public boolean mo7426K4() {
        return C4335b.m28263a(this);
    }

    public final void m14192P1(Context context) {
        this.f25713F1 = C1357a0.m37551b(C1357a0.m37544i(72.0f), 5) + 5;
        this.f25714G1 = C1357a0.m37551b(C1357a0.m37544i(72.0f), 25);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
        this.f25717J1 = linearLayoutManager;
        setLayoutManager(linearLayoutManager);
        m39425k(new C7918a());
    }

    public C9906c m14191Q1(View$OnClickListenerC2805o4 o4Var, AbstractC7919b bVar) {
        this.f25715H1 = o4Var;
        this.f25718K1 = bVar;
        C9906c cVar = new C9906c(o4Var, this.f25717J1);
        this.f25716I1 = cVar;
        setAdapter(cVar);
        return this.f25716I1;
    }

    public void m14190R1(int i) {
        View C;
        int X1 = this.f25717J1.m39552X1();
        int i2 = 0;
        if (!(X1 == -1 || (C = this.f25717J1.mo39265C(X1)) == null)) {
            i2 = C.getTop();
        }
        if (!((i & 1) == 0 || X1 == -1)) {
            this.f25717J1.m39525z2(X1, i2);
        }
        if ((i & 2) != 0) {
            this.f25716I1.m6583q0();
        }
    }

    public void m14189S1(long j, long j2, boolean z) {
        int E0 = this.f25716I1.m6630E0(j, j2, z);
        if (E0 != -1) {
            m14162H1(E0);
        }
    }

    public void m14188T1(long j, String str) {
        int M0 = this.f25716I1.m6622M0(j, str);
        if (M0 != -1) {
            m14162H1(M0);
        }
    }

    public void m14187U1(long j, TdApi.DraftMessage draftMessage) {
        int N0 = this.f25716I1.m6621N0(j, draftMessage);
        if (N0 != -1) {
            m14162H1(N0);
        }
    }

    public void m14186V1(long j, boolean z) {
        int O0 = this.f25716I1.m6620O0(j, z);
        if (O0 != -1) {
            m14162H1(O0);
        }
    }

    public void m14185W1(long j, boolean z) {
        int P0 = this.f25716I1.m6618P0(j, z);
        if (P0 != -1) {
            m14162H1(P0);
        }
    }

    @Override
    public boolean mo7425W6(float f, float f2) {
        return C4335b.m28261c(this, f, f2);
    }

    public void m14184X1(long j, TdApi.ChatPermissions chatPermissions) {
        int Q0 = this.f25716I1.m6617Q0(j, chatPermissions);
        if (Q0 != -1) {
            m14162H1(Q0);
        }
    }

    public void m14183Y1(long j, TdApi.ChatPhotoInfo chatPhotoInfo) {
        int R0 = this.f25716I1.m6616R0(j, chatPhotoInfo);
        if (R0 != -1) {
            View C = this.f25717J1.mo39265C(R0);
            if (C == null || !(C instanceof C9903a)) {
                this.f25716I1.m39315I(R0);
            } else {
                ((C9903a) C).m6640u1();
            }
        }
    }

    public void m14182Z1(long j, TdApi.ChatPosition chatPosition, boolean z, boolean z2, boolean z3) {
        int o0;
        if (z2 && (o0 = this.f25716I1.m6585o0(j)) != -1) {
            m14162H1(o0);
        }
    }

    @Override
    public void mo7424Z4(View view, float f, float f2) {
        C4335b.m28258f(this, view, f, f2);
    }

    public void m14181a2(long j, long j2, int i) {
        int S0 = this.f25716I1.m6615S0(j, j2, i);
        if (S0 != -1) {
            m14162H1(S0);
        }
    }

    public void m14180b2(long j, long j2) {
        int T0 = this.f25716I1.m6613T0(j, j2);
        if (T0 != -1) {
            m14162H1(T0);
        }
    }

    public void m14179c2(long j, boolean z) {
        int o0 = this.f25716I1.m6585o0(j);
        if (o0 != -1) {
            View C = getLayoutManager().mo39265C(o0);
            if (C instanceof C9903a) {
                C9903a aVar = (C9903a) C;
                if (aVar.getChatId() == j) {
                    aVar.m6662D1(z, true);
                    return;
                }
            }
            this.f25716I1.m39315I(o0);
        }
    }

    public void m14178d2(long j, String str) {
        int V0 = this.f25716I1.m6611V0(j, str);
        if (V0 != -1) {
            m14162H1(V0);
        }
    }

    public void m14177e2(long j, TdApi.Message message) {
        int W0 = this.f25716I1.m6610W0(j, message);
        if (W0 != -1) {
            m14162H1(W0);
        }
    }

    public void m14176f2(long j, int i) {
        int X0 = this.f25716I1.m6609X0(j, i);
        if (X0 != -1) {
            m14162H1(X0);
        }
    }

    @Override
    public void mo7419f3(View view, float f, float f2) {
        C4335b.m28259e(this, view, f, f2);
    }

    public void m14175g2(boolean z) {
        this.f25716I1.m6606a1(z);
        m14163G1();
    }

    public int getInitialLoadCount() {
        return this.f25713F1;
    }

    public int getLoadCount() {
        return this.f25714G1;
    }

    @Override
    public long getLongPressDuration() {
        return C4335b.m28262b(this);
    }

    public void m14174h2(long j, long j2, TdApi.MessageContent messageContent) {
        int b1 = this.f25716I1.m6605b1(j, j2, messageContent);
        if (b1 != -1) {
            m14162H1(b1);
        }
    }

    public void m14173i2(long j, long j2, TdApi.MessageInteractionInfo messageInteractionInfo) {
        int c1 = this.f25716I1.m6603c1(j, j2, messageInteractionInfo);
        if (c1 != -1) {
            m14162H1(c1);
        }
    }

    public void m14172j2(TdApi.Message message, long j) {
        int d1 = this.f25716I1.m6601d1(message, j);
        if (d1 != -1) {
            m14162H1(d1);
        }
    }

    public void m14171k2(long j, long[] jArr) {
        int f1 = this.f25716I1.m6598f1(j, jArr);
        if (f1 != -1) {
            m14162H1(f1);
        }
    }

    public void m14170l2(long j, TdApi.ChatNotificationSettings chatNotificationSettings) {
        int U0 = this.f25716I1.m6612U0(j, chatNotificationSettings);
        if (U0 != -1) {
            m14162H1(U0);
        }
    }

    public void m14169m2(TdApi.NotificationSettingsScope notificationSettingsScope, TdApi.ScopeNotificationSettings scopeNotificationSettings) {
        this.f25716I1.m6596g1(notificationSettingsScope, scopeNotificationSettings);
    }

    @Override
    public boolean mo7418n0(View view, float f, float f2) {
        View C = getLayoutManager().mo39265C(this.f25715H1.m33354ii());
        if (C == null) {
            return false;
        }
        int U = getLayoutManager().m39234U(C);
        return f2 >= ((float) U) && f2 < ((float) (U + C5974t0.m21736t()));
    }

    public void m14168n2(TdApi.SecretChat secretChat) {
        int h1 = this.f25716I1.m6594h1(secretChat);
        if (h1 != -1) {
            m14162H1(h1);
        }
    }

    @Override
    public void mo7417o2(View view, float f, float f2) {
        C4335b.m28257g(this, view, f, f2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.f25715H1.m33419Uj()) {
            this.f25719L1.m28248e(this, motionEvent);
        }
        return onTouchEvent;
    }

    @Override
    public void mo7416p(View view, float f, float f2) {
        C4335b.m28255i(this, view, f, f2);
    }

    public void m14167p2(TdApi.User user) {
        this.f25716I1.m6592i1(this, user);
    }

    public void m14166q2(long j) {
        int i = 0;
        while (true) {
            int j1 = this.f25716I1.m6590j1(j, i);
            if (j1 != -1) {
                View C = this.f25717J1.mo39265C(j1);
                if (C instanceof C9903a) {
                    C9903a aVar = (C9903a) C;
                    if (aVar.getChatId() == this.f25716I1.m6593i0(j1).m27098x()) {
                        aVar.m6661E1();
                        C.invalidate();
                        i = j1 + 1;
                    }
                }
                this.f25716I1.m39315I(j1);
                i = j1 + 1;
            } else {
                return;
            }
        }
    }

    public void setTotalRes(int i) {
        this.f25716I1.m6625J0(i);
    }

    @Override
    public boolean mo7415z4(View view, float f, float f2) {
        return C4335b.m28253k(this, view, f, f2);
    }

    @Override
    public void mo7414z6(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4) {
        C4335b.m28254j(this, view, motionEvent, f, f2, f3, f4);
    }

    public ChatsRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m14192P1(context);
    }
}
