package ne;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import ce.y;
import hd.b;
import kb.c;
import ld.h;
import ld.p;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import wc.a;
import zd.g0;
import zd.h0;
import zd.o6;
import zd.t7;
import zd.w6;
import zd.w7;

public class d extends View implements c, t7.i, h0, a {
    public Drawable M;
    public w6 N;
    public TdApi.User O;
    public TdApi.Chat P;
    public o6 Q;
    public boolean R;
    public boolean S;
    public b.a T;
    public b U;
    public float V;
    public float W = 17.0f;
    public int f17934a;
    public final p f17935b;
    public p f17936c;

    public d(Context context) {
        super(context);
        p pVar = new p(this, 1);
        this.f17935b = pVar;
        pVar.E0(0);
    }

    public void f(long j10) {
        if (this.Q != null && getChatId() == j10) {
            m(this.Q, this.P);
        }
    }

    public void g(TdApi.User user) {
        if (this.Q != null && getUserId() == user.f19979id) {
            this.O = user;
            n(this.Q, user, this.S);
        }
    }

    @Override
    public void B3(long j10, boolean z10) {
        g0.i(this, j10, z10);
    }

    @Override
    public void B5(long j10, int i10, boolean z10) {
        g0.x(this, j10, i10, z10);
    }

    @Override
    public void H0(long j10, String str) {
        g0.t(this, j10, str);
    }

    @Override
    public void M1(final TdApi.User user) {
        post(new Runnable() {
            @Override
            public final void run() {
                d.this.g(user);
            }
        });
    }

    @Override
    public void N0(long j10, int i10) {
        g0.l(this, j10, i10);
    }

    @Override
    public void N1(long j10, boolean z10) {
        g0.j(this, j10, z10);
    }

    @Override
    public void Q2() {
        this.f17935b.b0();
        p pVar = this.f17936c;
        if (pVar != null) {
            pVar.b0();
        }
        if (this.Q != null) {
            if (getUserId() != 0) {
                this.Q.e2().N1(getUserId(), this);
            }
            if (getChatId() != 0) {
                this.Q.O9().q0(getChatId(), this);
            }
        }
        this.Q = null;
        this.P = null;
        this.O = null;
    }

    @Override
    public void R3(final long j10, TdApi.ChatPhotoInfo chatPhotoInfo) {
        post(new Runnable() {
            @Override
            public final void run() {
                d.this.f(j10);
            }
        });
    }

    @Override
    public void T5(long j10, long j11, int i10, boolean z10) {
        g0.q(this, j10, j11, i10, z10);
    }

    @Override
    public void X(long j10, TdApi.ChatActionBar chatActionBar) {
        g0.a(this, j10, chatActionBar);
    }

    @Override
    public void Y(long j10, TdApi.Message message) {
        g0.v(this, j10, message);
    }

    @Override
    public void a0(long j10, TdApi.MessageSender messageSender) {
        g0.f(this, j10, messageSender);
    }

    @Override
    public void b() {
        this.f17935b.b();
        p pVar = this.f17936c;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override
    public void b2(long j10, TdApi.DraftMessage draftMessage) {
        g0.g(this, j10, draftMessage);
    }

    @Override
    public void c1(long j10, TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        g0.m(this, j10, chatJoinRequestsInfo);
    }

    public final void d(Canvas canvas, int i10) {
        if (j()) {
            canvas.drawCircle(this.f17935b.J0(), this.f17935b.x0(), this.f17935b.t(), y.g(j.L(i10)));
        } else {
            canvas.drawRect(this.f17935b.getLeft(), this.f17935b.getTop(), this.f17935b.getRight(), this.f17935b.getBottom(), y.g(j.E0()));
        }
    }

    @Override
    public void e() {
        this.f17935b.e();
        p pVar = this.f17936c;
        if (pVar != null) {
            pVar.e();
        }
    }

    @Override
    public void e7(long j10, int i10) {
        g0.k(this, j10, i10);
    }

    @Override
    public void f4(long j10, String str) {
        g0.d(this, j10, str);
    }

    @Override
    public void f5(long j10, String str) {
        g0.u(this, j10, str);
    }

    public long getChatId() {
        TdApi.Chat chat = this.P;
        if (chat != null) {
            return chat.f19908id;
        }
        return 0L;
    }

    public long getUserId() {
        TdApi.User user = this.O;
        if (user != null) {
            return user.f19979id;
        }
        return 0L;
    }

    public final boolean h() {
        return (this.f17934a & 2) != 0;
    }

    public final boolean i() {
        return (this.f17934a & 1) == 0;
    }

    public final boolean j() {
        return (this.f17934a & 4) == 0;
    }

    public void k(o6 o6Var, TdApi.Chat chat) {
        long j10 = chat != null ? chat.f19908id : 0L;
        long chatId = getChatId();
        if (chatId != j10) {
            if (chatId != 0) {
                this.Q.O9().q0(chatId, this);
            }
            this.P = chat;
            this.Q = o6Var;
            if (j10 != 0) {
                m(o6Var, chat);
                o6Var.O9().d0(j10, this);
                return;
            }
            this.f17935b.clear();
        }
    }

    @Override
    public void k3(long j10, TdApi.VideoChat videoChat) {
        g0.y(this, j10, videoChat);
    }

    public void l() {
        this.f17934a |= 8;
        if (this.M == null) {
            this.M = ce.c.g(getResources(), R.drawable.baseline_camera_alt_24);
        }
    }

    @Override
    public void l0(long j10, int i10, boolean z10) {
        g0.w(this, j10, i10, z10);
    }

    public final void m(o6 o6Var, TdApi.Chat chat) {
        TdApi.ChatPhotoInfo chatPhotoInfo = chat.photo;
        boolean z10 = chatPhotoInfo != null;
        this.R = z10;
        if (z10) {
            o(o6Var, chatPhotoInfo.small, chatPhotoInfo.big);
        } else {
            this.T = o6Var.G3(chat, true);
            this.f17935b.clear();
        }
        invalidate();
    }

    public final void n(o6 o6Var, TdApi.User user, boolean z10) {
        this.S = z10;
        TdApi.ProfilePhoto profilePhoto = user.profilePhoto;
        boolean z11 = profilePhoto != null;
        this.R = z11;
        if (z11) {
            o(o6Var, profilePhoto.small, profilePhoto.big);
        } else {
            this.T = o6Var.e2().O2(user, z10);
            this.f17935b.clear();
        }
        invalidate();
    }

    public final void o(o6 o6Var, TdApi.File file, TdApi.File file2) {
        h hVar = new h(o6Var, file);
        hVar.s0(2);
        if (h()) {
            hVar.X(7);
            hVar.h0();
            int i10 = 160;
            if (a.getDefaultAvatarCacheSize() == 160) {
                i10 = 159;
            }
            hVar.t0(i10);
            this.f17936c.G(hVar);
            if (file2 != null) {
                file = file2;
            }
            h hVar2 = new h(o6Var, file);
            hVar2.s0(2);
            this.f17935b.G(hVar2);
            return;
        }
        hVar.t0(a.getDefaultAvatarCacheSize());
        this.f17935b.G(hVar);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if ((this.f17934a & 16) == 0) {
            this.f17935b.e();
            p pVar = this.f17936c;
            if (pVar != null) {
                pVar.e();
            }
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if ((this.f17934a & 16) == 0) {
            this.f17935b.b();
            p pVar = this.f17936c;
            if (pVar != null) {
                pVar.b();
            }
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        p pVar;
        if (!(this.N == null && getUserId() == 0 && getChatId() == 0)) {
            boolean z10 = this.R;
            int i10 = R.id.theme_color_placeholder;
            if (z10) {
                if (this.f17935b.e0() && ((pVar = this.f17936c) == null || pVar.e0())) {
                    d(canvas, R.id.theme_color_placeholder);
                }
                if (this.f17936c != null && this.f17935b.e0()) {
                    this.f17936c.draw(canvas);
                }
                this.f17935b.draw(canvas);
            } else if (i()) {
                if ((this.f17934a & 8) != 0) {
                    b.a aVar = this.T;
                    if (aVar != null) {
                        i10 = aVar.f12764a;
                    }
                    d(canvas, i10);
                } else if (this.T != null) {
                    if (this.U == null) {
                        this.U = new b(a0.u(this.f17935b.getWidth() / 2), this.T, null);
                    }
                    this.U.a(canvas, this.f17935b.J0(), this.f17935b.x0());
                }
            }
        }
        if ((this.f17934a & 8) != 0) {
            if (this.R) {
                d(canvas, R.id.theme_color_statusBar);
            }
            Drawable drawable = this.M;
            if (drawable != null) {
                ce.c.b(canvas, drawable, this.f17935b.J0() - (this.M.getMinimumWidth() / 2), this.f17935b.x0() - (this.M.getMinimumHeight() / 2), y.W(-1));
            }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f17935b.K0(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        if (j()) {
            p pVar = this.f17935b;
            pVar.E0(Math.min(pVar.getWidth(), this.f17935b.getHeight()) / 2);
        }
        if (h()) {
            this.f17936c.f(this.f17935b);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !(motionEvent.getAction() == 0 && getAlpha() == 0.0f) && super.onTouchEvent(motionEvent);
    }

    public void p() {
        this.f17934a |= 16;
    }

    @Override
    public void p6(long j10, boolean z10) {
        g0.h(this, j10, z10);
    }

    public void q(o6 o6Var, long j10, boolean z10) {
        r(o6Var, o6Var.e2().u2(j10), z10);
    }

    @Override
    public void q2(long j10, boolean z10) {
        g0.e(this, j10, z10);
    }

    public void r(o6 o6Var, TdApi.User user, boolean z10) {
        long j10 = user != null ? user.f19979id : 0L;
        long userId = getUserId();
        if (userId != j10) {
            if (userId != 0) {
                this.Q.e2().N1(userId, this);
            }
            this.O = user;
            this.Q = o6Var;
            if (j10 != 0) {
                n(o6Var, user, z10);
                o6Var.e2().L(j10, this);
                return;
            }
            this.f17935b.clear();
        }
    }

    public void setLettersSizeDp(float f10) {
        this.W = f10;
    }

    public void setMainAlpha(float f10) {
        float f11 = this.V;
        if (f11 == f10) {
            return;
        }
        if (f11 != this.f17935b.getAlpha() || !this.f17935b.x()) {
            this.V = f10;
            return;
        }
        p pVar = this.f17935b;
        this.V = f10;
        pVar.setAlpha(f10);
    }

    public void setNeedFull(boolean z10) {
        this.f17934a = ib.c.h(this.f17934a, 2, z10);
        if (z10 && this.f17936c == null) {
            p pVar = new p(this, 1);
            this.f17936c = pVar;
            pVar.f(this.f17935b);
        }
    }

    public void setNoPlaceholders(boolean z10) {
        this.f17934a = ib.c.h(this.f17934a, 1, z10);
    }

    public void setNoRound(boolean z10) {
        this.f17934a = ib.c.h(this.f17934a, 4, z10);
    }

    public void setUser(w6 w6Var) {
        this.N = w6Var;
        boolean z10 = false;
        if (w6Var != null) {
            h m10 = w6Var.m(false);
            if (m10 != null) {
                z10 = true;
            }
            this.R = z10;
            if (z10) {
                this.f17935b.G(m10);
            } else {
                this.T = w6Var.n();
                this.U = null;
                this.f17935b.clear();
            }
        } else {
            this.f17935b.clear();
            this.R = false;
        }
        invalidate();
    }

    @Override
    public void t4(long j10, String[] strArr) {
        g0.b(this, j10, strArr);
    }

    @Override
    public void t7(long j10, TdApi.ChatPermissions chatPermissions) {
        g0.n(this, j10, chatPermissions);
    }

    @Override
    public void u7(long j10, TdApi.UserFullInfo userFullInfo) {
        w7.a(this, j10, userFullInfo);
    }

    @Override
    public void w1(long j10, boolean z10) {
        g0.c(this, j10, z10);
    }

    @Override
    public void w6(long j10, TdApi.ChatPosition chatPosition, boolean z10, boolean z11, boolean z12) {
        g0.p(this, j10, chatPosition, z10, z11, z12);
    }

    @Override
    public void x5(long j10, long j11) {
        g0.s(this, j10, j11);
    }

    @Override
    public void y1(long j10, long j11) {
        g0.r(this, j10, j11);
    }
}
