package gd;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import be.C1357a0;
import be.C1362c;
import be.C1410y;
import ie.C5428t;
import ie.RunnableC5390g;
import java.lang.ref.Reference;
import java.util.List;
import me.C6952l3;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p051db.C3941g;
import p080fb.C4341g;
import p082fd.C4403w;
import p108hb.C5070i;
import p111he.AbstractC5098a1;
import p111he.AbstractC5113f0;
import p111he.AbstractC5143t;
import p156kd.AbstractC6264v;
import p156kd.C6246h;
import p193nb.C7316a;
import p193nb.C7321e;
import p350yd.C10534a9;
import p350yd.C10930q6;
import p350yd.HandlerC10770jj;
import p364zd.C11524j;
import td.C9357x2;
import vc.C9903a;

public class C4649h implements AbstractC5113f0, C4341g.AbstractC4342a, AbstractC5098a1, C9357x2.AbstractC9363f {
    public static Paint.FontMetricsInt f15494f0;
    public long f15495M;
    public long f15496N;
    public boolean f15497O;
    public boolean f15498P;
    public TdApi.ChatMember f15499Q;
    public boolean f15500R;
    public RunnableC5390g f15501S;
    public TdApi.User f15502T;
    public String f15503U;
    public RunnableC5390g f15504V;
    public CharSequence f15505W;
    public RunnableC5390g f15506X;
    public C4587b f15507Y;
    public C6246h f15508Z;
    public final C10930q6 f15509a;
    public final C4341g f15510a0;
    public long f15511b;
    public final C3941g f15512b0;
    public final long f15513c;
    public final int f15514c0 = C1357a0.m37541i(72.0f) + C1357a0.m37541i(11.0f);
    public boolean f15515d0;
    public int f15516e0;

    public C4649h(C10930q6 q6Var, TdApi.Chat chat) {
        C4341g r = new C4341g().m28233r(this);
        this.f15510a0 = r;
        this.f15512b0 = new C3941g(r);
        this.f15509a = q6Var;
        this.f15511b = chat.f25367id;
        this.f15513c = C4779t2.m25465n2(chat);
        this.f15495M = C7316a.m17048m(chat.f25367id);
        this.f15496N = C7316a.m17045p(chat.f25367id);
        m26630x(chat.title);
        this.f15507Y = q6Var.m2947A3(chat, false, 25.0f, null);
        TdApi.ChatPhotoInfo chatPhotoInfo = chat.photo;
        if (chatPhotoInfo != null) {
            m26632v(chatPhotoInfo.small);
        }
        m26629y();
    }

    public static C4649h m26647A(C10930q6 q6Var, TdApi.ChatMember chatMember, boolean z, boolean z2) {
        C4649h hVar;
        int constructor = chatMember.memberId.getConstructor();
        if (constructor == -336109341) {
            hVar = new C4649h(q6Var, ((TdApi.MessageSenderUser) chatMember.memberId).userId, !z);
        } else if (constructor == -239660751) {
            hVar = new C4649h(q6Var, q6Var.m2771L3(((TdApi.MessageSenderChat) chatMember.memberId).chatId));
        } else {
            throw new IllegalArgumentException(chatMember.memberId.toString());
        }
        hVar.m26634t(chatMember, z, z2);
        return hVar;
    }

    @Override
    public void mo13519a() {
        List<Reference<View>> n = this.f15510a0.m28237n();
        if (n != null) {
            for (Reference<View> reference : n) {
                View view = reference.get();
                if (view != null && (view instanceof C6952l3)) {
                    ((C6952l3) view).m18385B0(this);
                }
            }
        }
    }

    @Override
    public TdApi.User mo23960c() {
        return this.f15502T;
    }

    @Override
    public long mo13513d() {
        return 0L;
    }

    public final void m26646e() {
        int i = this.f15516e0 - this.f15514c0;
        RunnableC5390g gVar = this.f15501S;
        if (gVar != null) {
            i -= gVar.getWidth() + C1357a0.m37541i(4.0f);
        }
        int i2 = i;
        if (i2 <= 0) {
            this.f15506X = null;
        } else if (!C5070i.m24061i(this.f15505W)) {
            this.f15506X = new RunnableC5390g.C5392b(this.f15509a, this.f15505W, (HandlerC10770jj.C10788q) null, i2, C1410y.m37083A0(15.0f), C5428t.AbstractC5441d.f17873D).m22868v().m22884f();
        } else {
            this.f15506X = null;
        }
    }

    @Override
    public void mo8098f1(View view, Rect rect) {
        RunnableC5390g gVar = this.f15504V;
        if (gVar != null) {
            gVar.m22908q1(rect);
        }
    }

    @Override
    public int mo13507g() {
        return 0;
    }

    @Override
    public TdApi.Message getMessage() {
        return null;
    }

    public final void m26645h() {
        String str;
        int i = this.f15516e0 - this.f15514c0;
        TdApi.ChatMember chatMember = this.f15499Q;
        RunnableC5390g gVar = null;
        if (chatMember != null) {
            str = C7321e.m16998K0(chatMember.status);
            if (C5070i.m24061i(str) && this.f15500R) {
                int constructor = this.f15499Q.status.getConstructor();
                if (constructor == -160019714) {
                    str = C4403w.m27869i1(R.string.message_ownerSign);
                } else if (constructor == 82243562) {
                    str = C4403w.m27869i1(R.string.message_adminSignPlain);
                }
            }
        } else {
            str = null;
        }
        if (!C5070i.m24061i(str)) {
            RunnableC5390g f = new RunnableC5390g.C5392b(str, i, C1410y.m37083A0(13.0f), C5428t.AbstractC5441d.f17873D).m22868v().m22884f();
            this.f15501S = f;
            i -= f.getWidth() + C1357a0.m37541i(4.0f);
        } else {
            this.f15501S = null;
        }
        if (i <= 0) {
            this.f15504V = null;
            return;
        }
        if (!C5070i.m24061i(this.f15503U)) {
            gVar = new RunnableC5390g.C5392b(this.f15503U, i, C1410y.m37083A0(15.0f), C5428t.AbstractC5441d.f17872C).m22888b().m22868v().m22884f();
        }
        this.f15504V = gVar;
    }

    public <T extends View & AbstractC5143t> void m26644i(T t, AbstractC6264v vVar, Canvas canvas) {
        int i = C1357a0.m37541i(72.0f);
        C4403w.m27984G2();
        int measuredWidth = t.getMeasuredWidth();
        float a = this.f15512b0.m29572a();
        if (a > 0.0f) {
            double radians = Math.toRadians(45.0d);
            float I0 = vVar.mo20257I0() + ((float) ((vVar.getWidth() / 2) * Math.sin(radians)));
            float y0 = vVar.mo20227y0() + ((float) ((vVar.getHeight() / 2) * Math.cos(radians)));
            Drawable X = t.mo14042X(R.drawable.baseline_incognito_circle_18, R.id.theme_color_iconLight);
            canvas.drawCircle(I0, y0, (X.getMinimumWidth() / 2.0f) * a, C1410y.m37039g(C11524j.m148w()));
            int i2 = (a > 1.0f ? 1 : (a == 1.0f ? 0 : -1));
            if (i2 != 0) {
                canvas.save();
                canvas.scale(a, a, I0, y0);
            }
            C1362c.m37487b(canvas, X, I0 - (X.getMinimumWidth() / 2.0f), y0 - (X.getMinimumHeight() / 2.0f), C1410y.m37067K());
            if (i2 != 0) {
                canvas.restore();
            }
        }
        RunnableC5390g gVar = this.f15504V;
        if (gVar != null) {
            gVar.m22903t(canvas, i, C1357a0.m37541i(13.0f));
        }
        RunnableC5390g gVar2 = this.f15501S;
        C5428t.AbstractC5441d dVar = null;
        if (gVar2 != null) {
            int i3 = (measuredWidth - C1357a0.m37541i(14.0f)) - this.f15501S.getWidth();
            int measuredHeight = (t.getMeasuredHeight() / 2) - (this.f15501S.getHeight() / 2);
            TdApi.ChatMember chatMember = this.f15499Q;
            gVar2.m22893y(canvas, i3, measuredHeight, (chatMember == null || !C4779t2.m25623P2(chatMember.status)) ? null : C5428t.AbstractC5441d.f17877H);
        }
        RunnableC5390g gVar3 = this.f15506X;
        if (gVar3 != null) {
            int i4 = C1357a0.m37541i(33.0f);
            if (this.f15497O) {
                dVar = C5428t.AbstractC5441d.f17877H;
            }
            gVar3.m22893y(canvas, i, i4, dVar);
        }
    }

    public C6246h m26643j() {
        return this.f15508Z;
    }

    public C4587b m26642k() {
        return this.f15507Y;
    }

    public long m26641m() {
        return this.f15511b;
    }

    public TdApi.ChatMember m26640n() {
        return this.f15499Q;
    }

    public TdApi.MessageSender m26639o() {
        long j = this.f15513c;
        if (j != 0) {
            return new TdApi.MessageSenderUser(j);
        }
        long j2 = this.f15511b;
        if (j2 != 0) {
            return C7316a.m17049l(j2) ? new TdApi.MessageSenderUser(this.f15509a.m2494d4(this.f15511b)) : new TdApi.MessageSenderChat(this.f15511b);
        }
        return null;
    }

    public long m26638p() {
        return this.f15513c;
    }

    public C4341g m26637q() {
        return this.f15510a0;
    }

    public void m26636r(int i) {
        if (this.f15516e0 != i && i > 0) {
            this.f15516e0 = i;
            m26645h();
            m26646e();
        }
    }

    public void m26635s(boolean z) {
        if (this.f15498P != z) {
            this.f15498P = z;
            if (this.f15497O) {
                m26633u(false);
            }
        }
    }

    public void m26634t(TdApi.ChatMember chatMember, boolean z, boolean z2) {
        TdApi.ChatMember chatMember2 = this.f15499Q;
        boolean z3 = true;
        boolean z4 = chatMember2 != null && C7321e.m16975W(chatMember2.memberId, chatMember.memberId);
        this.f15499Q = chatMember;
        this.f15515d0 = z;
        this.f15500R = z2;
        C3941g gVar = this.f15512b0;
        boolean W0 = C7321e.m16974W0(chatMember.status);
        if (!z4 || !this.f15510a0.mo28225g()) {
            z3 = false;
        }
        gVar.m29571b(W0, z3);
        m26629y();
        if (z4) {
            m26645h();
            this.f15510a0.invalidate();
        }
    }

    public final void m26633u(boolean z) {
        if (this.f15497O == z) {
            return;
        }
        if (!this.f15498P || !z) {
            this.f15497O = z;
            this.f15510a0.invalidate();
        }
    }

    public final void m26632v(TdApi.File file) {
        C6246h hVar = this.f15508Z;
        int i = 0;
        int s = hVar != null ? hVar.mo20825s() : 0;
        if (file != null) {
            i = file.f25373id;
        }
        if (s != i) {
            if (file != null) {
                C6246h hVar2 = new C6246h(this.f15509a, file);
                this.f15508Z = hVar2;
                hVar2.mo20767t0(C9903a.getDefaultAvatarCacheSize());
            } else {
                this.f15508Z = null;
            }
            if (this.f15516e0 > 0) {
                this.f15510a0.mo18573a();
            }
        }
    }

    public void m26631w(CharSequence charSequence) {
        if (!C5070i.m24067c(this.f15505W, charSequence)) {
            this.f15505W = charSequence;
            if (this.f15516e0 != 0) {
                m26646e();
                this.f15510a0.invalidate();
            }
        }
    }

    public final void m26630x(String str) {
        if (!C5070i.m24067c(this.f15503U, str)) {
            if (f15494f0 == null) {
                f15494f0 = new Paint.FontMetricsInt();
            }
            this.f15503U = str;
            if (this.f15516e0 != 0) {
                m26645h();
                this.f15510a0.invalidate();
            }
        }
    }

    public void m26629y() {
        String str;
        CharSequence charSequence = null;
        if (this.f15515d0) {
            charSequence = C4779t2.m25666J1(new C10534a9(null, this.f15509a), this.f15499Q, false);
        }
        if (!C5070i.m24061i(charSequence)) {
            m26631w(charSequence);
        } else if (this.f15513c != 0) {
            TdApi.User v2 = this.f15509a.m2480e2().m1583v2(this.f15513c);
            boolean q3 = C4779t2.m25443q3(v2);
            if (q3) {
                str = C4403w.m27869i1(R.string.status_Online);
            } else if (v2 == null || v2.type.getConstructor() != 1262387765) {
                str = this.f15509a.m2166xc().m3291r(this.f15513c, v2, false);
            } else {
                str = C4403w.m27869i1(((TdApi.UserTypeBot) v2.type).canReadAllGroupMessages ? R.string.BotStatusRead : R.string.BotStatusCantRead);
            }
            m26631w(str);
            m26633u(q3);
        } else {
            m26631w(this.f15509a.m2166xc().m3296m(this.f15511b));
            m26633u(false);
        }
    }

    public void m26628z() {
        TdApi.User v2;
        long j = this.f15511b;
        TdApi.File file = null;
        if (j != 0) {
            TdApi.Chat U2 = this.f15509a.m2632U2(j);
            if (U2 != null) {
                m26630x(U2.title);
                this.f15507Y = this.f15509a.m2947A3(U2, false, 25.0f, null);
                TdApi.ChatPhotoInfo chatPhotoInfo = U2.photo;
                if (chatPhotoInfo != null) {
                    file = chatPhotoInfo.small;
                }
                m26632v(file);
                this.f15510a0.invalidate();
            }
        } else if (this.f15513c != 0 && (v2 = this.f15509a.m2480e2().m1583v2(this.f15513c)) != null) {
            m26630x(C4779t2.m25451p2(v2.f25439id, v2));
            this.f15507Y = this.f15509a.m2480e2().m1709N2(v2, false, 25.0f, null);
            TdApi.ProfilePhoto profilePhoto = v2.profilePhoto;
            if (profilePhoto != null) {
                file = profilePhoto.small;
            }
            m26632v(file);
            this.f15510a0.invalidate();
        }
    }

    public C4649h(C10930q6 q6Var, long j, boolean z) {
        TdApi.ProfilePhoto profilePhoto;
        C4341g r = new C4341g().m28233r(this);
        this.f15510a0 = r;
        this.f15512b0 = new C3941g(r);
        this.f15509a = q6Var;
        this.f15513c = j;
        TdApi.User v2 = q6Var.m2480e2().m1583v2(j);
        this.f15502T = v2;
        m26630x(C4779t2.m25437r2(v2));
        this.f15507Y = q6Var.m2480e2().m1709N2(this.f15502T, false, 25.0f, null);
        TdApi.User user = this.f15502T;
        if (!(user == null || (profilePhoto = user.profilePhoto) == null)) {
            m26632v(profilePhoto.small);
        }
        if (z) {
            m26629y();
        }
    }
}
