package me;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import be.C1362c;
import be.C1410y;
import gd.C4587b;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p108hb.C5063c;
import p139jb.AbstractC5911c;
import p156kd.C6246h;
import p156kd.C6257p;
import p350yd.AbstractC10747j0;
import p350yd.C10721i0;
import p350yd.C10930q6;
import p350yd.C11059v7;
import p350yd.C11131y6;
import p350yd.C11133y7;
import p364zd.C11524j;
import vc.C9903a;

public class C6857d extends View implements AbstractC5911c, C11059v7.AbstractC11068i, AbstractC10747j0, AbstractC6828a {
    public Drawable f21532M;
    public C11131y6 f21533N;
    public TdApi.User f21534O;
    public TdApi.Chat f21535P;
    public C10930q6 f21536Q;
    public boolean f21537R;
    public boolean f21538S;
    public C4587b.C4588a f21539T;
    public C4587b f21540U;
    public float f21541V;
    public float f21542W = 17.0f;
    public int f21543a;
    public final C6257p f21544b;
    public C6257p f21545c;

    public C6857d(Context context) {
        super(context);
        C6257p pVar = new C6257p(this, 1);
        this.f21544b = pVar;
        pVar.mo20259D0(0);
    }

    public void m18756e(long j) {
        if (this.f21536Q != null && getChatId() == j) {
            m18749m(this.f21536Q, this.f21535P);
        }
    }

    public void m18755g(TdApi.User user) {
        if (this.f21536Q != null && getUserId() == user.f25439id) {
            this.f21534O = user;
            m18748n(this.f21536Q, user, this.f21538S);
        }
    }

    @Override
    public void mo4076B4(long j, String[] strArr) {
        C10721i0.m4195b(this, j, strArr);
    }

    @Override
    public void mo4075C5(long j, long j2) {
        C10721i0.m4178s(this, j, j2);
    }

    @Override
    public void mo4074G5(long j, int i, boolean z) {
        C10721i0.m4173x(this, j, i, z);
    }

    @Override
    public void mo4073H0(long j, String str) {
        C10721i0.m4177t(this, j, str);
    }

    @Override
    public void mo4072K3(long j, boolean z) {
        C10721i0.m4188i(this, j, z);
    }

    @Override
    public void mo4071L0(long j, int i) {
        C10721i0.m4185l(this, j, i);
    }

    @Override
    public void mo1348P1(final TdApi.User user) {
        post(new Runnable() {
            @Override
            public final void run() {
                C6857d.this.m18755g(user);
            }
        });
    }

    @Override
    public void mo4070R1(long j, boolean z) {
        C10721i0.m4187j(this, j, z);
    }

    @Override
    public void mo4069V5(long j, long j2, int i, boolean z) {
        C10721i0.m4180q(this, j, j2, i, z);
    }

    @Override
    public void mo4068W(long j, TdApi.ChatActionBar chatActionBar) {
        C10721i0.m4196a(this, j, chatActionBar);
    }

    @Override
    public void mo4067Y(long j, TdApi.Message message) {
        C10721i0.m4175v(this, j, message);
    }

    @Override
    public void mo4066a0(long j, TdApi.MessageSender messageSender) {
        C10721i0.m4191f(this, j, messageSender);
    }

    @Override
    public void mo4501a3() {
        this.f21544b.mo20249Z();
        C6257p pVar = this.f21545c;
        if (pVar != null) {
            pVar.mo20249Z();
        }
        if (this.f21536Q != null) {
            if (getUserId() != 0) {
                this.f21536Q.m2480e2().m1702P1(getUserId(), this);
            }
            if (getChatId() != 0) {
                this.f21536Q.m2781K9().m1818q0(getChatId(), this);
            }
        }
        this.f21536Q = null;
        this.f21535P = null;
        this.f21534O = null;
    }

    @Override
    public void mo8229b() {
        this.f21544b.mo20247b();
        C6257p pVar = this.f21545c;
        if (pVar != null) {
            pVar.mo20247b();
        }
    }

    @Override
    public void mo4065c2(long j, TdApi.DraftMessage draftMessage) {
        C10721i0.m4190g(this, j, draftMessage);
    }

    @Override
    public void mo4064c4(final long j, TdApi.ChatPhotoInfo chatPhotoInfo) {
        post(new Runnable() {
            @Override
            public final void run() {
                C6857d.this.m18756e(j);
            }
        });
    }

    public final void m18757d(Canvas canvas, int i) {
        if (m18752j()) {
            canvas.drawCircle(this.f21544b.mo20257I0(), this.f21544b.mo20227y0(), this.f21544b.m20796t(), C1410y.m37039g(C11524j.m228N(i)));
        } else {
            canvas.drawRect(this.f21544b.getLeft(), this.f21544b.getTop(), this.f21544b.getRight(), this.f21544b.getBottom(), C1410y.m37039g(C11524j.m241G0()));
        }
    }

    @Override
    public void mo4063e7(long j, int i) {
        C10721i0.m4186k(this, j, i);
    }

    @Override
    public void mo8225f() {
        this.f21544b.mo20245f();
        C6257p pVar = this.f21545c;
        if (pVar != null) {
            pVar.mo20245f();
        }
    }

    public long getChatId() {
        TdApi.Chat chat = this.f21535P;
        if (chat != null) {
            return chat.f25367id;
        }
        return 0L;
    }

    public long getUserId() {
        TdApi.User user = this.f21534O;
        if (user != null) {
            return user.f25439id;
        }
        return 0L;
    }

    public final boolean m18754h() {
        return (this.f21543a & 2) != 0;
    }

    @Override
    public void mo4062h1(long j, TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        C10721i0.m4184m(this, j, chatJoinRequestsInfo);
    }

    public final boolean m18753i() {
        return (this.f21543a & 1) == 0;
    }

    @Override
    public void mo4061i5(long j, String str) {
        C10721i0.m4176u(this, j, str);
    }

    public final boolean m18752j() {
        return (this.f21543a & 4) == 0;
    }

    public void m18751k(C10930q6 q6Var, TdApi.Chat chat) {
        long j = chat != null ? chat.f25367id : 0L;
        long chatId = getChatId();
        if (chatId != j) {
            if (chatId != 0) {
                this.f21536Q.m2781K9().m1818q0(chatId, this);
            }
            this.f21535P = chat;
            this.f21536Q = q6Var;
            if (j != 0) {
                m18749m(q6Var, chat);
                q6Var.m2781K9().m1870d0(j, this);
                return;
            }
            this.f21544b.clear();
        }
    }

    public void m18750l() {
        this.f21543a |= 8;
        if (this.f21532M == null) {
            this.f21532M = C1362c.m37482g(getResources(), R.drawable.baseline_camera_alt_24);
        }
    }

    public final void m18749m(C10930q6 q6Var, TdApi.Chat chat) {
        TdApi.ChatPhotoInfo chatPhotoInfo = chat.photo;
        boolean z = chatPhotoInfo != null;
        this.f21537R = z;
        if (z) {
            m18747o(q6Var, chatPhotoInfo.small, chatPhotoInfo.big);
        } else {
            this.f21539T = q6Var.m2899D3(chat, true);
            this.f21544b.clear();
        }
        invalidate();
    }

    @Override
    public void mo4060m0(long j, int i, boolean z) {
        C10721i0.m4174w(this, j, i, z);
    }

    public final void m18748n(C10930q6 q6Var, TdApi.User user, boolean z) {
        this.f21538S = z;
        TdApi.ProfilePhoto profilePhoto = user.profilePhoto;
        boolean z2 = profilePhoto != null;
        this.f21537R = z2;
        if (z2) {
            m18747o(q6Var, profilePhoto.small, profilePhoto.big);
        } else {
            this.f21539T = q6Var.m2480e2().m1701P2(user, z);
            this.f21544b.clear();
        }
        invalidate();
    }

    public final void m18747o(C10930q6 q6Var, TdApi.File file, TdApi.File file2) {
        C6246h hVar = new C6246h(q6Var, file);
        hVar.m20897s0(2);
        if (m18754h()) {
            hVar.m20932X(7);
            hVar.m20915h0();
            int i = 160;
            if (C9903a.getDefaultAvatarCacheSize() == 160) {
                i = 159;
            }
            hVar.mo20767t0(i);
            this.f21545c.m20819G(hVar);
            if (file2 != null) {
                file = file2;
            }
            C6246h hVar2 = new C6246h(q6Var, file);
            hVar2.m20897s0(2);
            this.f21544b.m20819G(hVar2);
            return;
        }
        hVar.mo20767t0(C9903a.getDefaultAvatarCacheSize());
        this.f21544b.m20819G(hVar);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if ((this.f21543a & 16) == 0) {
            this.f21544b.mo20245f();
            C6257p pVar = this.f21545c;
            if (pVar != null) {
                pVar.mo20245f();
            }
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if ((this.f21543a & 16) == 0) {
            this.f21544b.mo20247b();
            C6257p pVar = this.f21545c;
            if (pVar != null) {
                pVar.mo20247b();
            }
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        C6257p pVar;
        if (!(this.f21533N == null && getUserId() == 0 && getChatId() == 0)) {
            boolean z = this.f21537R;
            int i = R.id.theme_color_placeholder;
            if (z) {
                if (this.f21544b.mo20246c0() && ((pVar = this.f21545c) == null || pVar.mo20246c0())) {
                    m18757d(canvas, R.id.theme_color_placeholder);
                }
                if (this.f21545c != null && this.f21544b.mo20246c0()) {
                    this.f21545c.draw(canvas);
                }
                this.f21544b.draw(canvas);
            } else if (m18753i()) {
                if ((this.f21543a & 8) != 0) {
                    C4587b.C4588a aVar = this.f21539T;
                    if (aVar != null) {
                        i = aVar.f15120a;
                    }
                    m18757d(canvas, i);
                } else if (this.f21539T != null) {
                    if (this.f21540U == null) {
                        this.f21540U = new C4587b(C1357a0.m37529u(this.f21544b.getWidth() / 2), this.f21539T, null);
                    }
                    this.f21540U.m27215a(canvas, this.f21544b.mo20257I0(), this.f21544b.mo20227y0());
                }
            }
        }
        if ((this.f21543a & 8) != 0) {
            if (this.f21537R) {
                m18757d(canvas, R.id.theme_color_statusBar);
            }
            Drawable drawable = this.f21532M;
            if (drawable != null) {
                C1362c.m37487b(canvas, drawable, this.f21544b.mo20257I0() - (this.f21532M.getMinimumWidth() / 2), this.f21544b.mo20227y0() - (this.f21532M.getMinimumHeight() / 2), C1410y.m37055W(-1));
            }
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f21544b.mo20256K0(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        if (m18752j()) {
            C6257p pVar = this.f21544b;
            pVar.mo20259D0(Math.min(pVar.getWidth(), this.f21544b.getHeight()) / 2);
        }
        if (m18754h()) {
            this.f21545c.m20809e(this.f21544b);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !(motionEvent.getAction() == 0 && getAlpha() == 0.0f) && super.onTouchEvent(motionEvent);
    }

    public void m18746p() {
        this.f21543a |= 16;
    }

    public void m18745q(C10930q6 q6Var, long j, boolean z) {
        m18744r(q6Var, q6Var.m2480e2().m1583v2(j), z);
    }

    @Override
    public void mo4059q6(long j, boolean z) {
        C10721i0.m4189h(this, j, z);
    }

    public void m18744r(C10930q6 q6Var, TdApi.User user, boolean z) {
        long j = user != null ? user.f25439id : 0L;
        long userId = getUserId();
        if (userId != j) {
            if (userId != 0) {
                this.f21536Q.m2480e2().m1702P1(userId, this);
            }
            this.f21534O = user;
            this.f21536Q = q6Var;
            if (j != 0) {
                m18748n(q6Var, user, z);
                q6Var.m2480e2().m1720L(j, this);
                return;
            }
            this.f21544b.clear();
        }
    }

    @Override
    public void mo4058s2(long j, boolean z) {
        C10721i0.m4192e(this, j, z);
    }

    @Override
    public void mo4057s4(long j, String str) {
        C10721i0.m4193d(this, j, str);
    }

    public void setLettersSizeDp(float f) {
        this.f21542W = f;
    }

    public void setMainAlpha(float f) {
        float f2 = this.f21541V;
        if (f2 == f) {
            return;
        }
        if (f2 != this.f21544b.getAlpha() || !this.f21544b.m20792x()) {
            this.f21541V = f;
            return;
        }
        C6257p pVar = this.f21544b;
        this.f21541V = f;
        pVar.setAlpha(f);
    }

    public void setNeedFull(boolean z) {
        this.f21543a = C5063c.m24138h(this.f21543a, 2, z);
        if (z && this.f21545c == null) {
            C6257p pVar = new C6257p(this, 1);
            this.f21545c = pVar;
            pVar.m20809e(this.f21544b);
        }
    }

    public void setNoPlaceholders(boolean z) {
        this.f21543a = C5063c.m24138h(this.f21543a, 1, z);
    }

    public void setNoRound(boolean z) {
        this.f21543a = C5063c.m24138h(this.f21543a, 4, z);
    }

    public void setUser(C11131y6 y6Var) {
        this.f21533N = y6Var;
        boolean z = false;
        if (y6Var != null) {
            C6246h m = y6Var.m1463m(false);
            if (m != null) {
                z = true;
            }
            this.f21537R = z;
            if (z) {
                this.f21544b.m20819G(m);
            } else {
                this.f21539T = y6Var.m1462n();
                this.f21540U = null;
                this.f21544b.clear();
            }
        } else {
            this.f21544b.clear();
            this.f21537R = false;
        }
        invalidate();
    }

    @Override
    public void mo4056t7(long j, TdApi.ChatPermissions chatPermissions) {
        C10721i0.m4183n(this, j, chatPermissions);
    }

    @Override
    public void mo4055u3(long j, TdApi.VideoChat videoChat) {
        C10721i0.m4172y(this, j, videoChat);
    }

    @Override
    public void mo1335u7(long j, TdApi.UserFullInfo userFullInfo) {
        C11133y7.m1438a(this, j, userFullInfo);
    }

    @Override
    public void mo4054w1(long j, boolean z) {
        C10721i0.m4194c(this, j, z);
    }

    @Override
    public void mo4053w6(long j, TdApi.ChatPosition chatPosition, boolean z, boolean z2, boolean z3) {
        C10721i0.m4181p(this, j, chatPosition, z, z2, z3);
    }

    @Override
    public void mo4052y1(long j, long j2) {
        C10721i0.m4179r(this, j, j2);
    }
}
