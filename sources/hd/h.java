package hd;

import ae.j;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import ce.a0;
import ce.c;
import ce.y;
import gb.g;
import gd.w;
import ib.i;
import ie.a1;
import ie.f0;
import java.util.Iterator;
import je.g;
import je.t;
import ld.v;
import ne.l3;
import ob.a;
import ob.e;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import ud.x2;
import zd.hj;
import zd.o6;
import zd.y8;

public class h implements f0, g.a, a1, x2.f {
    public static Paint.FontMetricsInt f13040f0;
    public long M;
    public long N;
    public boolean O;
    public boolean P;
    public TdApi.ChatMember Q;
    public boolean R;
    public je.g S;
    public TdApi.User T;
    public String U;
    public je.g V;
    public CharSequence W;
    public je.g X;
    public b Y;
    public ld.h Z;
    public final o6 f13041a;
    public final g f13042a0;
    public long f13043b;
    public final eb.g f13044b0;
    public final long f13045c;
    public final int f13046c0 = a0.i(72.0f) + a0.i(11.0f);
    public boolean f13047d0;
    public int f13048e0;

    public h(o6 o6Var, TdApi.Chat chat) {
        g r10 = new g().r(this);
        this.f13042a0 = r10;
        this.f13044b0 = new eb.g(r10);
        this.f13041a = o6Var;
        this.f13043b = chat.f19908id;
        this.f13045c = t2.n2(chat);
        this.M = a.m(chat.f19908id);
        this.N = a.p(chat.f19908id);
        x(chat.title);
        this.Y = o6Var.D3(chat, false, 25.0f, null);
        TdApi.ChatPhotoInfo chatPhotoInfo = chat.photo;
        if (chatPhotoInfo != null) {
            v(chatPhotoInfo.small);
        }
        y();
    }

    public static h A(o6 o6Var, TdApi.ChatMember chatMember, boolean z10, boolean z11) {
        h hVar;
        int constructor = chatMember.memberId.getConstructor();
        if (constructor == -336109341) {
            hVar = new h(o6Var, ((TdApi.MessageSenderUser) chatMember.memberId).userId, !z10);
        } else if (constructor == -239660751) {
            hVar = new h(o6Var, o6Var.P3(((TdApi.MessageSenderChat) chatMember.memberId).chatId));
        } else {
            throw new IllegalArgumentException(chatMember.memberId.toString());
        }
        hVar.t(chatMember, z10, z11);
        return hVar;
    }

    @Override
    public void a() {
        Iterator<View> it = this.f13042a0.n().iterator();
        while (it.hasNext()) {
            View next = it.next();
            if (next instanceof l3) {
                ((l3) next).C0(this);
            }
        }
    }

    @Override
    public TdApi.User c() {
        return this.T;
    }

    @Override
    public long d() {
        return 0L;
    }

    @Override
    public void d1(View view, Rect rect) {
        je.g gVar = this.V;
        if (gVar != null) {
            gVar.q1(rect);
        }
    }

    @Override
    public int f() {
        return 0;
    }

    public final void g() {
        int i10 = this.f13048e0 - this.f13046c0;
        je.g gVar = this.S;
        if (gVar != null) {
            i10 -= gVar.getWidth() + a0.i(4.0f);
        }
        int i11 = i10;
        if (i11 <= 0) {
            this.X = null;
        } else if (!i.i(this.W)) {
            this.X = new g.b(this.f13041a, this.W, (hj.q) null, i11, y.A0(15.0f), t.d.D).v().f();
        } else {
            this.X = null;
        }
    }

    @Override
    public TdApi.Message getMessage() {
        return null;
    }

    public final void h() {
        String str;
        int i10 = this.f13048e0 - this.f13046c0;
        TdApi.ChatMember chatMember = this.Q;
        je.g gVar = null;
        if (chatMember != null) {
            str = e.M0(chatMember.status);
            if (i.i(str) && this.R) {
                int constructor = this.Q.status.getConstructor();
                if (constructor == -160019714) {
                    str = w.i1(R.string.message_ownerSign);
                } else if (constructor == -70024163) {
                    str = w.i1(R.string.message_adminSignPlain);
                }
            }
        } else {
            str = null;
        }
        if (!i.i(str)) {
            je.g f10 = new g.b(str, i10, y.A0(13.0f), t.d.D).v().f();
            this.S = f10;
            i10 -= f10.getWidth() + a0.i(4.0f);
        } else {
            this.S = null;
        }
        if (i10 <= 0) {
            this.V = null;
            return;
        }
        if (!i.i(this.U)) {
            gVar = new g.b(this.U, i10, y.A0(15.0f), t.d.C).b().v().f();
        }
        this.V = gVar;
    }

    public <T extends View & ie.t> void i(T t10, v vVar, Canvas canvas) {
        int i10 = a0.i(72.0f);
        w.G2();
        int measuredWidth = t10.getMeasuredWidth();
        float a10 = this.f13044b0.a();
        if (a10 > 0.0f) {
            double radians = Math.toRadians(45.0d);
            float J0 = vVar.J0() + ((float) ((vVar.getWidth() / 2) * Math.sin(radians)));
            float x02 = vVar.x0() + ((float) ((vVar.getHeight() / 2) * Math.cos(radians)));
            Drawable Z = t10.Z(R.drawable.baseline_incognito_circle_18, R.id.theme_color_iconLight);
            canvas.drawCircle(J0, x02, (Z.getMinimumWidth() / 2.0f) * a10, y.g(j.u()));
            int i11 = (a10 > 1.0f ? 1 : (a10 == 1.0f ? 0 : -1));
            if (i11 != 0) {
                canvas.save();
                canvas.scale(a10, a10, J0, x02);
            }
            c.b(canvas, Z, J0 - (Z.getMinimumWidth() / 2.0f), x02 - (Z.getMinimumHeight() / 2.0f), y.K());
            if (i11 != 0) {
                canvas.restore();
            }
        }
        je.g gVar = this.V;
        if (gVar != null) {
            gVar.t(canvas, i10, a0.i(13.0f));
        }
        je.g gVar2 = this.S;
        t.d dVar = null;
        if (gVar2 != null) {
            int i12 = (measuredWidth - a0.i(14.0f)) - this.S.getWidth();
            int measuredHeight = (t10.getMeasuredHeight() / 2) - (this.S.getHeight() / 2);
            TdApi.ChatMember chatMember = this.Q;
            gVar2.y(canvas, i12, measuredHeight, (chatMember == null || !t2.P2(chatMember.status)) ? null : t.d.H);
        }
        je.g gVar3 = this.X;
        if (gVar3 != null) {
            int i13 = a0.i(33.0f);
            if (this.O) {
                dVar = t.d.H;
            }
            gVar3.y(canvas, i10, i13, dVar);
        }
    }

    public ld.h j() {
        return this.Z;
    }

    public b k() {
        return this.Y;
    }

    public long m() {
        return this.f13043b;
    }

    public TdApi.ChatMember n() {
        return this.Q;
    }

    public TdApi.MessageSender o() {
        long j10 = this.f13045c;
        if (j10 != 0) {
            return new TdApi.MessageSenderUser(j10);
        }
        long j11 = this.f13043b;
        if (j11 != 0) {
            return a.l(j11) ? new TdApi.MessageSenderUser(this.f13041a.h4(this.f13043b)) : new TdApi.MessageSenderChat(this.f13043b);
        }
        return null;
    }

    public long p() {
        return this.f13045c;
    }

    public gb.g q() {
        return this.f13042a0;
    }

    public void r(int i10) {
        if (this.f13048e0 != i10 && i10 > 0) {
            this.f13048e0 = i10;
            h();
            g();
        }
    }

    public void s(boolean z10) {
        if (this.P != z10) {
            this.P = z10;
            if (this.O) {
                u(false);
            }
        }
    }

    public void t(TdApi.ChatMember chatMember, boolean z10, boolean z11) {
        TdApi.ChatMember chatMember2 = this.Q;
        boolean z12 = true;
        boolean z13 = chatMember2 != null && e.Y(chatMember2.memberId, chatMember.memberId);
        this.Q = chatMember;
        this.f13047d0 = z10;
        this.R = z11;
        eb.g gVar = this.f13044b0;
        boolean Y0 = e.Y0(chatMember.status);
        if (!z13 || !this.f13042a0.g()) {
            z12 = false;
        }
        gVar.b(Y0, z12);
        y();
        if (z13) {
            h();
            this.f13042a0.invalidate();
        }
    }

    public final void u(boolean z10) {
        if (this.O == z10) {
            return;
        }
        if (!this.P || !z10) {
            this.O = z10;
            this.f13042a0.invalidate();
        }
    }

    public final void v(TdApi.File file) {
        ld.h hVar = this.Z;
        int i10 = 0;
        int s10 = hVar != null ? hVar.s() : 0;
        if (file != null) {
            i10 = file.f19913id;
        }
        if (s10 != i10) {
            if (file != null) {
                ld.h hVar2 = new ld.h(this.f13041a, file);
                this.Z = hVar2;
                hVar2.t0(wc.a.getDefaultAvatarCacheSize());
            } else {
                this.Z = null;
            }
            if (this.f13048e0 > 0) {
                this.f13042a0.a();
            }
        }
    }

    public void w(CharSequence charSequence) {
        if (!i.c(this.W, charSequence)) {
            this.W = charSequence;
            if (this.f13048e0 != 0) {
                g();
                this.f13042a0.invalidate();
            }
        }
    }

    public final void x(String str) {
        if (!i.c(this.U, str)) {
            if (f13040f0 == null) {
                f13040f0 = new Paint.FontMetricsInt();
            }
            this.U = str;
            if (this.f13048e0 != 0) {
                h();
                this.f13042a0.invalidate();
            }
        }
    }

    public void y() {
        String str;
        CharSequence charSequence = null;
        if (this.f13047d0) {
            charSequence = t2.J1(new y8(null, this.f13041a), this.Q, false);
        }
        if (!i.i(charSequence)) {
            w(charSequence);
        } else if (this.f13045c != 0) {
            TdApi.User u22 = this.f13041a.e2().u2(this.f13045c);
            boolean q32 = t2.q3(u22);
            if (q32) {
                str = w.i1(R.string.status_Online);
            } else if (u22 == null || u22.type.getConstructor() != -970625144) {
                str = this.f13041a.Bc().r(this.f13045c, u22, false);
            } else {
                str = w.i1(((TdApi.UserTypeBot) u22.type).canReadAllGroupMessages ? R.string.BotStatusRead : R.string.BotStatusCantRead);
            }
            w(str);
            u(q32);
        } else {
            w(this.f13041a.Bc().m(this.f13043b));
            u(false);
        }
    }

    public void z() {
        TdApi.User u22;
        long j10 = this.f13043b;
        TdApi.File file = null;
        if (j10 != 0) {
            TdApi.Chat W2 = this.f13041a.W2(j10);
            if (W2 != null) {
                x(W2.title);
                this.Y = this.f13041a.D3(W2, false, 25.0f, null);
                TdApi.ChatPhotoInfo chatPhotoInfo = W2.photo;
                if (chatPhotoInfo != null) {
                    file = chatPhotoInfo.small;
                }
                v(file);
                this.f13042a0.invalidate();
            }
        } else if (this.f13045c != 0 && (u22 = this.f13041a.e2().u2(this.f13045c)) != null) {
            x(t2.p2(u22.f19979id, u22));
            this.Y = this.f13041a.e2().M2(u22, false, 25.0f, null);
            TdApi.ProfilePhoto profilePhoto = u22.profilePhoto;
            if (profilePhoto != null) {
                file = profilePhoto.small;
            }
            v(file);
            this.f13042a0.invalidate();
        }
    }

    public h(o6 o6Var, long j10, boolean z10) {
        TdApi.ProfilePhoto profilePhoto;
        gb.g r10 = new gb.g().r(this);
        this.f13042a0 = r10;
        this.f13044b0 = new eb.g(r10);
        this.f13041a = o6Var;
        this.f13045c = j10;
        TdApi.User u22 = o6Var.e2().u2(j10);
        this.T = u22;
        x(t2.r2(u22));
        this.Y = o6Var.e2().M2(this.T, false, 25.0f, null);
        TdApi.User user = this.T;
        if (!(user == null || (profilePhoto = user.profilePhoto) == null)) {
            v(profilePhoto.small);
        }
        if (z10) {
            y();
        }
    }
}
