package org.thunderdog.challegram.v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import de.o4;
import gb.c;
import kd.t0;
import org.drinkless.td.libcore.telegram.TdApi;

public class ChatsRecyclerView extends CustomRecyclerView implements c.a {
    public int E1;
    public int F1;
    public o4 G1;
    public wc.c H1;
    public LinearLayoutManager I1;
    public b J1;
    public final c K1 = new c(this);

    public class a extends RecyclerView.t {
        public a() {
        }

        @Override
        public void b(RecyclerView recyclerView, int i10, int i11) {
            if (i11 > 0) {
                if (ChatsRecyclerView.this.G1 != null && ChatsRecyclerView.this.G1.Ua() && !ChatsRecyclerView.this.isVerticalScrollBarEnabled()) {
                    ChatsRecyclerView.this.setVerticalScrollBarEnabled(true);
                    ChatsRecyclerView.this.G1.vc();
                }
                if (ChatsRecyclerView.this.J1 != null && ChatsRecyclerView.this.J1.m1() && ChatsRecyclerView.this.I1.a2() + 15 >= ChatsRecyclerView.this.H1.D()) {
                    ChatsRecyclerView.this.J1.A0();
                }
            }
        }
    }

    public interface b {
        void A0();

        boolean m1();
    }

    public ChatsRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        O1(context);
    }

    @Override
    public boolean B(float f10, float f11) {
        return gb.b.d(this, f10, f11);
    }

    @Override
    public void C(View view, float f10, float f11) {
        this.G1.Xj(f10, f11);
    }

    @Override
    public boolean E4() {
        return gb.b.a(this);
    }

    @Override
    public void G(View view, float f10, float f11) {
        gb.b.h(this, view, f10, f11);
    }

    public final void O1(Context context) {
        this.E1 = a0.b(a0.i(72.0f), 5) + 5;
        this.F1 = a0.b(a0.i(72.0f), 25);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
        this.I1 = linearLayoutManager;
        setLayoutManager(linearLayoutManager);
        k(new a());
    }

    public wc.c P1(o4 o4Var, b bVar) {
        this.G1 = o4Var;
        this.J1 = bVar;
        wc.c cVar = new wc.c(o4Var, this.I1);
        this.H1 = cVar;
        setAdapter(cVar);
        return this.H1;
    }

    public void Q1(int i10) {
        View C;
        int X1 = this.I1.X1();
        int i11 = 0;
        if (!(X1 == -1 || (C = this.I1.C(X1)) == null)) {
            i11 = C.getTop();
        }
        if (!((i10 & 1) == 0 || X1 == -1)) {
            this.I1.z2(X1, i11);
        }
        if ((i10 & 2) != 0) {
            this.H1.p0();
        }
    }

    public void R1(long j10, long j11, boolean z10) {
        int C0 = this.H1.C0(j10, j11, z10);
        if (C0 != -1) {
            G1(C0);
        }
    }

    public void S1(long j10, String str) {
        int K0 = this.H1.K0(j10, str);
        if (K0 != -1) {
            G1(K0);
        }
    }

    public void T1(long j10, TdApi.DraftMessage draftMessage) {
        int L0 = this.H1.L0(j10, draftMessage);
        if (L0 != -1) {
            G1(L0);
        }
    }

    public void U1(long j10, boolean z10) {
        int M0 = this.H1.M0(j10, z10);
        if (M0 != -1) {
            G1(M0);
        }
    }

    @Override
    public void U2(View view, float f10, float f11) {
        gb.b.e(this, view, f10, f11);
    }

    @Override
    public void U4(View view, float f10, float f11) {
        gb.b.f(this, view, f10, f11);
    }

    public void V1(long j10, boolean z10) {
        int N0 = this.H1.N0(j10, z10);
        if (N0 != -1) {
            G1(N0);
        }
    }

    public void W1(long j10, TdApi.ChatPermissions chatPermissions) {
        int O0 = this.H1.O0(j10, chatPermissions);
        if (O0 != -1) {
            G1(O0);
        }
    }

    public void X1(long j10, TdApi.ChatPhotoInfo chatPhotoInfo) {
        int P0 = this.H1.P0(j10, chatPhotoInfo);
        if (P0 != -1) {
            View C = this.I1.C(P0);
            if (C == null || !(C instanceof wc.a)) {
                this.H1.I(P0);
            } else {
                ((wc.a) C).t1();
            }
        }
    }

    @Override
    public boolean X6(float f10, float f11) {
        return gb.b.c(this, f10, f11);
    }

    public void Y1(long j10, TdApi.ChatPosition chatPosition, boolean z10, boolean z11, boolean z12) {
        int n02;
        if (z11 && (n02 = this.H1.n0(j10)) != -1) {
            G1(n02);
        }
    }

    public void Z1(long j10, long j11, int i10) {
        int Q0 = this.H1.Q0(j10, j11, i10);
        if (Q0 != -1) {
            G1(Q0);
        }
    }

    public void a2(long j10, long j11) {
        int R0 = this.H1.R0(j10, j11);
        if (R0 != -1) {
            G1(R0);
        }
    }

    public void b2(long j10, boolean z10) {
        int n02 = this.H1.n0(j10);
        if (n02 != -1) {
            View C = getLayoutManager().C(n02);
            if (C instanceof wc.a) {
                wc.a aVar = (wc.a) C;
                if (aVar.getChatId() == j10) {
                    aVar.B1(z10, true);
                    return;
                }
            }
            this.H1.I(n02);
        }
    }

    public void c2(long j10, String str) {
        int T0 = this.H1.T0(j10, str);
        if (T0 != -1) {
            G1(T0);
        }
    }

    public void d2(long j10, TdApi.Message message) {
        int U0 = this.H1.U0(j10, message);
        if (U0 != -1) {
            G1(U0);
        }
    }

    public void e2(long j10, int i10) {
        int V0 = this.H1.V0(j10, i10);
        if (V0 != -1) {
            G1(V0);
        }
    }

    public void f2(boolean z10) {
        this.H1.X0(z10);
        F1();
    }

    public void g2(long j10, long j11, TdApi.MessageContent messageContent) {
        int Y0 = this.H1.Y0(j10, j11, messageContent);
        if (Y0 != -1) {
            G1(Y0);
        }
    }

    public int getInitialLoadCount() {
        return this.E1;
    }

    public int getLoadCount() {
        return this.F1;
    }

    @Override
    public long getLongPressDuration() {
        return gb.b.b(this);
    }

    public void h2(long j10, long j11, TdApi.MessageInteractionInfo messageInteractionInfo) {
        int Z0 = this.H1.Z0(j10, j11, messageInteractionInfo);
        if (Z0 != -1) {
            G1(Z0);
        }
    }

    public void i2(TdApi.Message message, long j10) {
        int a12 = this.H1.a1(message, j10);
        if (a12 != -1) {
            G1(a12);
        }
    }

    public void j2(long j10, long[] jArr) {
        int b12 = this.H1.b1(j10, jArr);
        if (b12 != -1) {
            G1(b12);
        }
    }

    public void k2(long j10, TdApi.ChatNotificationSettings chatNotificationSettings) {
        int S0 = this.H1.S0(j10, chatNotificationSettings);
        if (S0 != -1) {
            G1(S0);
        }
    }

    public void l2(TdApi.NotificationSettingsScope notificationSettingsScope, TdApi.ScopeNotificationSettings scopeNotificationSettings) {
        this.H1.c1(notificationSettingsScope, scopeNotificationSettings);
    }

    @Override
    public boolean m0(View view, float f10, float f11) {
        View C = getLayoutManager().C(this.G1.ii());
        if (C == null) {
            return false;
        }
        int U = getLayoutManager().U(C);
        return f11 >= ((float) U) && f11 < ((float) (U + t0.t()));
    }

    public void m2(TdApi.SecretChat secretChat) {
        int d12 = this.H1.d1(secretChat);
        if (d12 != -1) {
            G1(d12);
        }
    }

    public void n2(TdApi.User user) {
        this.H1.e1(this, user);
    }

    @Override
    public void o(View view, float f10, float f11) {
        gb.b.i(this, view, f10, f11);
    }

    @Override
    public void o2(View view, float f10, float f11) {
        gb.b.g(this, view, f10, f11);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.G1.Uj()) {
            this.K1.e(this, motionEvent);
        }
        return onTouchEvent;
    }

    public void p2(long j10) {
        int i10 = 0;
        while (true) {
            int f12 = this.H1.f1(j10, i10);
            if (f12 != -1) {
                View C = this.I1.C(f12);
                if (C instanceof wc.a) {
                    wc.a aVar = (wc.a) C;
                    if (aVar.getChatId() == this.H1.h0(f12).x()) {
                        aVar.C1();
                        C.invalidate();
                        i10 = f12 + 1;
                    }
                }
                this.H1.I(f12);
                i10 = f12 + 1;
            } else {
                return;
            }
        }
    }

    @Override
    public boolean s4(View view, float f10, float f11) {
        return gb.b.k(this, view, f10, f11);
    }

    public void setTotalRes(int i10) {
        this.H1.H0(i10);
    }

    @Override
    public void z6(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
        gb.b.j(this, view, motionEvent, f10, f11, f12, f13);
    }

    public ChatsRecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        O1(context);
    }
}
