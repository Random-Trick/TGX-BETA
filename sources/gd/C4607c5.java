package gd;

import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.MotionEvent;
import be.C1357a0;
import be.C1363c0;
import be.C1379j0;
import be.C1410y;
import ie.C5386e;
import ie.RunnableC5390g;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p156kd.AbstractC6264v;
import p156kd.C6246h;
import p156kd.C6257p;
import p291uc.C9552h1;
import p291uc.C9678w2;
import p350yd.C11059v7;
import p350yd.C11133y7;
import p364zd.C11524j;

public class C4607c5 extends AbstractC4761s4 implements C11059v7.AbstractC11068i {
    public static int f15276k3;
    public static int f15277l3;
    public static int f15278m3;
    public static int f15279n3;
    public static int f15280o3;
    public static int f15281p3;
    public static int f15282q3;
    public String f15283U2;
    public boolean f15284V2;
    public String f15285W2;
    public long f15286X2;
    public TdApi.User f15287Y2;
    public C6246h f15288Z2;
    public int f15289a3;
    public C5386e f15290b3;
    public String f15291c3;
    public String f15292d3;
    public int f15293e3;
    public int f15294f3;
    public int f15295g3;
    public int f15296h3;
    public float f15297i3;
    public float f15298j3;

    public C4607c5(C9678w2 w2Var, TdApi.Message message, TdApi.MessageContact messageContact) {
        super(w2Var, message);
        if (f15276k3 == 0) {
            m26899s5();
        }
        TdApi.Contact contact = messageContact.contact;
        String q2 = C4779t2.m25444q2(contact.firstName, contact.lastName);
        this.f15283U2 = q2;
        this.f15284V2 = RunnableC5390g.m22983M0(q2);
        this.f15290b3 = C4779t2.m25715C1(contact.firstName, contact.lastName);
        this.f15285W2 = C1363c0.m37408y(contact.phoneNumber, contact.userId != 0, true);
        long j = contact.userId;
        this.f15286X2 = j;
        if (j != 0) {
            this.f15287Y2 = this.f16099O0.m2480e2().m1583v2(contact.userId);
            this.f16099O0.m2480e2().m1720L(contact.userId, this);
        }
    }

    public void m26900fa(TdApi.User user) {
        if (!m26030V5()) {
            this.f15287Y2 = user;
            m26902da();
            mo13519a();
            m25791u5();
        }
    }

    public static void m26899s5() {
        f15279n3 = C1357a0.m37541i(57.0f);
        f15276k3 = C1357a0.m37541i(43.0f);
        int i = C1357a0.m37541i(20.5f);
        f15277l3 = i;
        f15278m3 = i * 2;
        f15280o3 = C1357a0.m37541i(16.0f);
        f15281p3 = C1357a0.m37541i(36.0f);
        f15282q3 = C1357a0.m37541i(26.0f);
    }

    @Override
    public void mo26150J8(C6257p pVar) {
        pVar.m20819G(this.f15288Z2);
    }

    @Override
    public void mo1348P1(final TdApi.User user) {
        this.f16099O0.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                C4607c5.this.m26900fa(user);
            }
        });
    }

    @Override
    public int mo26074R3(boolean z) {
        return f15277l3;
    }

    @Override
    public int mo25323U1() {
        return C1357a0.m37541i(1.0f) + f15278m3 + C1357a0.m37541i(6.0f) + this.f15294f3;
    }

    @Override
    public void mo25321V7() {
        if (this.f15286X2 != 0) {
            this.f16099O0.m2480e2().m1702P1(this.f15286X2, this);
        }
    }

    @Override
    public int mo25222X2() {
        return f15276k3;
    }

    @Override
    public void mo25221a0(int i) {
        m26902da();
        this.f15295g3 = C1410y.m37008v0(this.f15290b3, 16.0f);
        this.f15296h3 = i - f15279n3;
        m26901ea();
    }

    @Override
    public int mo25218c3() {
        return (m26068R9() ? 0 : C1357a0.m37541i(10.0f)) + f15278m3 + C1357a0.m37541i(12.0f) + Math.max(this.f15293e3, this.f15294f3);
    }

    @Override
    public void mo25961d1(C9552h1 h1Var, Canvas canvas, int i, int i2, int i3, AbstractC6264v vVar, AbstractC6264v vVar2) {
        int i4;
        int i5;
        if (!m26068R9()) {
            canvas.drawRect(i, i2, C1357a0.m37541i(3.0f) + i, f15276k3 + i2, C1410y.m37039g(C11524j.m172k()));
            i += C1357a0.m37541i(10.0f);
        }
        int i6 = i2 + C1357a0.m37541i(1.0f);
        if (this.f15288Z2 == null) {
            canvas.drawCircle(i + i5, i6 + i5, f15277l3, C1410y.m37039g(C11524j.m228N(this.f15289a3)));
            C1410y.m37045d(canvas, this.f15290b3, (f15277l3 + i) - ((int) (this.f15295g3 / 2.0f)), f15282q3 + i6, 16.0f);
        } else {
            int i7 = f15278m3;
            vVar2.mo20256K0(i, i6, i + i7, i7 + i6);
            if (vVar2.mo20246c0()) {
                canvas.drawCircle(i + i4, i6 + i4, f15277l3, C1410y.m37057U());
            }
            vVar2.draw(canvas);
        }
        float i8 = i + f15278m3 + C1357a0.m37541i(6.0f);
        canvas.drawText(this.f15291c3, i8, f15280o3 + i6, C1410y.m37021p(this.f15284V2, m26197F2()));
        canvas.drawText(this.f15292d3, i8, i6 + f15281p3, C1410y.m37046c0(15.0f, m25873m3()));
    }

    public final void m26902da() {
        TdApi.User user = this.f15287Y2;
        if (user == null || C4779t2.m25415u3(user.profilePhoto)) {
            this.f15288Z2 = null;
            this.f15289a3 = C4779t2.m25681H0(C4779t2.m25671I3(this.f15287Y2) ? -1L : this.f15286X2, this.f16099O0.m2519ba());
            return;
        }
        C6246h hVar = new C6246h(this.f16099O0, this.f15287Y2.profilePhoto.small);
        this.f15288Z2 = hVar;
        hVar.mo20767t0(f15278m3);
    }

    public final void m26901ea() {
        if (this.f15296h3 > 0) {
            String charSequence = TextUtils.ellipsize(this.f15283U2, C1410y.m37023o(this.f15284V2), this.f15296h3, TextUtils.TruncateAt.END).toString();
            this.f15291c3 = charSequence;
            this.f15293e3 = (int) C7389v0.m16680T1(charSequence, C1410y.m37023o(this.f15284V2));
            String charSequence2 = TextUtils.ellipsize(this.f15285W2, C1410y.m37036h0(), this.f15296h3, TextUtils.TruncateAt.END).toString();
            this.f15292d3 = charSequence2;
            this.f15294f3 = (int) C7389v0.m16680T1(charSequence2, C1410y.m37036h0());
        }
    }

    @Override
    public boolean mo25217f8(C9552h1 h1Var, MotionEvent motionEvent) {
        if (super.mo25217f8(h1Var, motionEvent)) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int d3 = m25959d3() + C1357a0.m37541i(10.0f);
            if (x < d3 || x > d3 + f15278m3 + C1357a0.m37541i(6.0f) + Math.max(this.f15293e3, this.f15294f3) || y < m25949e3() + C1357a0.m37541i(1.0f) || y > m25949e3() + C1357a0.m37541i(1.0f) + f15278m3) {
                this.f15297i3 = 0.0f;
                this.f15298j3 = 0.0f;
                return false;
            }
            this.f15297i3 = x;
            this.f15298j3 = y;
            return true;
        } else if (action != 1) {
            if (action != 3) {
                return false;
            }
            this.f15297i3 = 0.0f;
            this.f15298j3 = 0.0f;
            return false;
        } else if (this.f15297i3 == 0.0f || this.f15298j3 == 0.0f) {
            return false;
        } else {
            if (Math.abs(motionEvent.getX() - this.f15297i3) >= C1357a0.m37534p() || Math.abs(motionEvent.getY() - this.f15298j3) >= C1357a0.m37534p()) {
                this.f15297i3 = 0.0f;
                this.f15298j3 = 0.0f;
                return false;
            }
            if (this.f15286X2 != 0) {
                this.f16099O0.m2485dd().m3429v7(m26096P0(), this.f15286X2, m25916h8());
            } else {
                C1379j0.m37338b0(this.f15285W2);
            }
            return true;
        }
    }

    @Override
    public boolean mo25829q7() {
        return true;
    }

    @Override
    public void mo1335u7(long j, TdApi.UserFullInfo userFullInfo) {
        C11133y7.m1438a(this, j, userFullInfo);
    }
}
