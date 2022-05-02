package gd;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import be.C1357a0;
import be.C1379j0;
import be.C1410y;
import ie.AbstractC5411l0;
import ie.C5459x0;
import java.util.ArrayList;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p051db.C3950k;
import p082fd.C4403w;
import p139jb.AbstractRunnableC5910b;
import p156kd.C6238b;
import p193nb.C7321e;
import p194nd.C7462l1;
import p194nd.View$OnClickListenerC7430j1;
import p291uc.C9552h1;
import p291uc.C9678w2;
import p335xd.C10192g;
import p350yd.C10930q6;
import td.AbstractC9323v4;
import td.C9357x2;

public class C4714n5 extends AbstractC4761s4 {
    public static float f15860j3 = 10.0f;
    public C5459x0 f15861U2;
    public String f15862V2;
    public int f15863W2;
    public C4848z0 f15864X2;
    public boolean f15865Y2;
    public TdApi.FormattedText f15866Z2;
    public long f15867a3;
    public boolean f15868b3;
    public boolean f15869c3;
    public float f15870d3;
    public float f15871e3;
    public AbstractRunnableC5910b f15872f3;
    public ViewParent f15873g3;
    public View$OnClickListenerC7430j1 f15874h3;
    public long f15875i3;

    public class C4715a extends AbstractRunnableC5910b {
        public final C9552h1 f15876M;

        public C4715a(C9552h1 h1Var) {
            this.f15876M = h1Var;
        }

        @Override
        public void mo1364b() {
            if (C4714n5.this.f15868b3 && C4714n5.this.f15872f3 == this) {
                C4714n5.this.f15872f3 = null;
                C4714n5.this.m26364va(this.f15876M);
            }
        }
    }

    public C4714n5(C9678w2 w2Var, TdApi.Message message, TdApi.Photo photo, TdApi.FormattedText formattedText) {
        super(w2Var, message);
        C4630f0 f0Var = new C4630f0(mo4347s(), this.f16099O0, photo, message.chatId, message.f25406id, (AbstractC4761s4) this, true);
        f0Var.m26790A0(this.f16101P0);
        m26369qa(f0Var, formattedText);
    }

    public static boolean m26368ra(TdApi.MessageContent messageContent) {
        int constructor = messageContent.getConstructor();
        return constructor == -1851395174 || constructor == 1306939396 || constructor == 2021281344;
    }

    public static void m26366ta(ViewParent viewParent, View$OnClickListenerC7430j1 j1Var) {
        viewParent.requestDisallowInterceptTouchEvent(false);
        j1Var.m16419Ih();
    }

    public void m26365ua(View view, Rect rect) {
        this.f15864X2.m25012v().m26779G().m18655O0(rect);
    }

    public final boolean m26384Aa() {
        String M3 = m26126M3();
        String str = this.f15862V2;
        if (str != null && str.equals(M3)) {
            return false;
        }
        this.f15862V2 = M3;
        this.f15863W2 = (int) C7389v0.m16680T1(M3, AbstractC4761s4.m26112N6());
        return true;
    }

    @Override
    public void mo26213D7(long j, C3950k kVar) {
        this.f15864X2.m25034M(j, kVar);
    }

    @Override
    public void mo26181G7() {
        m26360za();
    }

    @Override
    public boolean mo26153J5() {
        return this.f15865Y2;
    }

    @Override
    public void mo25334L8(C6238b bVar, boolean z, int i) {
        this.f15864X2.m25037J(bVar, z);
    }

    @Override
    public boolean mo25333L9(TdApi.Message message, TdApi.MessageContent messageContent, boolean z) {
        int i;
        if (message.content.getConstructor() != messageContent.getConstructor()) {
            C4630f0 ma2 = m26373ma(message, messageContent);
            synchronized (this) {
                i = this.f15864X2.m25039H(ma2) != 0 ? 2 : 0;
            }
        } else {
            C4630f0 p = this.f15864X2.m25018p(message.f25406id);
            if (p != null && messageContent.getConstructor() == -1851395174) {
                int F = p.m26781F();
                int E = p.m26783E();
                if (p.m26776H0(message.f25406id, (TdApi.MessagePhoto) messageContent)) {
                    if (!(F == p.m26781F() && E == p.m26783E())) {
                        this.f15864X2.m25042E();
                    }
                    i = 2;
                }
            }
            i = 0;
        }
        message.content = messageContent;
        if (m26376ja()) {
            i |= 1;
        }
        if (i == 0) {
            return false;
        }
        m25740z8();
        if ((i & 2) == 0) {
            return true;
        }
        m25751y5();
        return true;
    }

    @Override
    public void mo26111N7(boolean z) {
        C4848z0 z0Var = this.f15864X2;
        C4630f0 v = z0Var != null ? z0Var.m25012v() : null;
        if (v != null) {
            if (z) {
                m26384Aa();
            }
            int d3 = m25959d3();
            int e3 = m25949e3();
            int B = v.m26789B() + d3;
            int x = v.m26714x() + e3;
            int i = (d3 + B) / 2;
            int i2 = (e3 + x) / 2;
            int i3 = C1357a0.m37541i(15.0f);
            if (z) {
                m25781v5(d3, e3, B, x);
            } else {
                m25781v5(i - i3, i2 - i3, i + i3, i2 + i3);
            }
        }
    }

    @Override
    public void mo26100O7(boolean z) {
        C4848z0 z0Var;
        if (!m25928g6() && (z0Var = this.f15864X2) != null && z0Var.m25012v() != null) {
            this.f15864X2.m25012v().m26779G().m18612o0(true);
        }
    }

    @Override
    public boolean mo26078R() {
        return false;
    }

    @Override
    public int mo26074R3(boolean z) {
        return 0;
    }

    @Override
    public void mo26070R7(C9552h1 h1Var, boolean z) {
        this.f15864X2.m25046A();
    }

    @Override
    public boolean mo26056T(float f, float f2) {
        int d3 = m25959d3();
        int e3 = m25949e3();
        return !m25975b6() || f < ((float) d3) || f > ((float) (this.f15864X2.m25011w() + d3)) || f2 < ((float) e3) || f2 > ((float) (this.f15864X2.m25014t() + e3));
    }

    @Override
    public void mo26048T7(TdApi.Message message, int i) {
        boolean U9 = m26036U9();
        int F = this.f15864X2.m25041F(message.f25406id, i);
        if (F == 1) {
            if (m26036U9() != U9) {
                m25748y8();
            }
            m25791u5();
        } else if (F == 2) {
            m25748y8();
        }
    }

    @Override
    public int mo25323U1() {
        if (this.f15861U2 == null || C4403w.m27984G2() != this.f15861U2.m22623o()) {
            return -1;
        }
        return this.f15861U2.m22622p() + ((AbstractC4761s4.f16063h2 + AbstractC4761s4.f16062g2) * 2);
    }

    @Override
    public void mo26038U7(TdApi.Message message, boolean z, boolean z2) {
        m26376ja();
        this.f15864X2.m25029d(m26374la(message), z);
    }

    @Override
    public void mo25321V7() {
        this.f15864X2.m25022l();
        m26377ia(null, false);
        m26375ka(null, true, false);
    }

    @Override
    public C7462l1 mo26022W3(long j, View view, int i, int i2, int i3) {
        C7462l1 u = this.f15864X2.m25013u(j, view, i, i2, i3);
        if (u != null) {
            u.m15987m((!m26068R9() || !m25918h6()) ? R.id.theme_color_filling : R.id.theme_color_bubbleOut_background);
        }
        return u;
    }

    @Override
    public boolean mo25319W7(TdApi.Message message, TdApi.MessageContent messageContent, TdApi.MessageContent messageContent2, boolean z) {
        if (message.viaBotUserId == 0 || messageContent.getConstructor() != -1851395174) {
            return false;
        }
        mo25333L9(message, messageContent2, z);
        return true;
    }

    @Override
    public boolean mo26016X0() {
        return this.f15861U2 == null && !m25938f5();
    }

    @Override
    public int mo25222X2() {
        if (this.f15861U2 == null) {
            return this.f15864X2.m25014t();
        }
        return this.f15864X2.m25014t() + this.f15861U2.getHeight() + C1357a0.m37541i(f15860j3) + ((!m26068R9() || m26046T9()) ? 0 : C1357a0.m37541i(f15860j3) - mo25219b2());
    }

    @Override
    public void mo26010X7(long j) {
        if (m25928g6() && m25975b6()) {
            this.f15864X2.m25012v().m26779G().m18624i0(R.drawable.baseline_check_24);
        }
    }

    @Override
    public void mo26007Y(TdApi.ChatType chatType) {
        this.f15864X2.m25028e(chatType);
    }

    @Override
    public void mo25990Z7(long j, long j2, boolean z) {
        this.f15864X2.m25033N(j, j2, z);
        if (this.f15867a3 == j) {
            this.f15867a3 = j2;
        }
    }

    @Override
    public void mo25221a0(int i) {
        int i2;
        boolean U9 = m26036U9();
        if (!U9) {
            i = m26184G4();
            i2 = m26195F4();
        } else if (this.f15864X2.m25009y()) {
            float f = i;
            float f2 = this.f15864X2.m25012v().m26762U() ? 1.08f : 1.5f;
            C4630f0 v = this.f15864X2.m25012v();
            i2 = Math.min((int) (f2 * f), (int) (v.m26783E() * (f / v.m26781F())));
        } else {
            i2 = (int) (i * 0.85f);
        }
        this.f15864X2.m25027f(i, i2, U9 ? 1 : 0, false);
        if (m25975b6()) {
            m26384Aa();
        }
        C5459x0 x0Var = this.f15861U2;
        if (x0Var != null) {
            x0Var.m22642B(m26068R9() ? this.f15864X2.m25011w() - (AbstractC4761s4.f16062g2 * 2) : m25803t4());
        }
    }

    @Override
    public int mo25980a8(long j, long j2, int i) {
        if (!m26376ja()) {
            return 0;
        }
        m25740z8();
        return mo25354J3() == i ? 1 : 2;
    }

    @Override
    public int mo25219b2() {
        return AbstractC4761s4.f16063h2;
    }

    @Override
    public void mo25973b8(long j, float f, boolean z) {
        C4630f0 p;
        if (z && (p = this.f15864X2.m25018p(j)) != null) {
            int y = p.m26712y();
            int A = p.m26791A();
            m26204E5(y, A, y + p.m26789B(), A + p.m26714x(), false);
        }
    }

    @Override
    public void mo25312c1(C9552h1 h1Var, Canvas canvas, int i, int i2, int i3, C6238b bVar) {
        int i4;
        boolean z = m26068R9() && !m26046T9();
        int b = z ? C10192g.m5789b(canvas, m25986a2()) : Integer.MIN_VALUE;
        this.f15864X2.m25021m(h1Var, canvas, i, i2, bVar, m26036U9());
        if (z) {
            C10192g.m5785f(canvas, b);
        }
        if (this.f15862V2 != null) {
            C4630f0 v = this.f15864X2.m25012v();
            int i5 = C1357a0.m37541i(4.0f);
            int y = v.m26712y() + i5;
            if (m26068R9()) {
                i4 = C1357a0.m37541i(2.0f) + i5;
            } else {
                i4 = C1357a0.m37541i(4.0f);
            }
            int i6 = y + i4;
            int i7 = this.f15863W2 + i6 + i5;
            int x = (((i2 + v.m26714x()) - C1357a0.m37541i(4.0f)) - C1357a0.m37541i(20.0f)) - C1357a0.m37541i(4.0f);
            if (m26068R9()) {
                x -= i5;
            }
            RectF a0 = C1410y.m37050a0();
            a0.set(i6 - C1357a0.m37541i(4.0f), C1357a0.m37541i(4.0f) + x, i7, C1357a0.m37541i(4.0f) + x + C1357a0.m37541i(20.0f));
            canvas.drawRoundRect(a0, C1357a0.m37541i(4.0f), C1357a0.m37541i(4.0f), C1410y.m37039g(1275068416));
            canvas.drawText(this.f15862V2, i6, x + C1357a0.m37541i(18.0f), C1410y.m37051a(AbstractC4761s4.m26112N6(), -1));
            if (m25956d6() && !m25928g6()) {
                int C = v.m26787C();
                int D = v.m26785D();
                int i8 = C1357a0.m37541i(10.0f);
                a0.set(C - i8, D - i8, C + i8, D + i8);
                canvas.drawArc(a0, -90.0f, m26144K3() * (-360.0f), true, C1410y.m37039g(-1));
            }
        }
        C5459x0 x0Var = this.f15861U2;
        if (x0Var != null) {
            x0Var.m22630h(canvas, m26370pa(h1Var, x0Var, false), m26370pa(h1Var, this.f15861U2, true), 0, C1357a0.m37541i(f15860j3) + i2 + this.f15864X2.m25014t(), null, 1.0f);
        }
    }

    @Override
    public int mo25218c3() {
        return this.f15861U2 == null ? this.f15864X2.m25011w() : Math.max(this.f15864X2.m25011w(), this.f15861U2.getWidth());
    }

    @Override
    public boolean mo25217f8(C9552h1 h1Var, MotionEvent motionEvent) {
        if (super.mo25217f8(h1Var, motionEvent)) {
            return true;
        }
        int d3 = m25959d3();
        int e3 = m25949e3();
        int w = this.f15864X2.m25011w() + d3;
        int t = this.f15864X2.m25014t() + e3;
        C5459x0 x0Var = this.f15861U2;
        if (x0Var != null && x0Var.m22614x(h1Var, motionEvent)) {
            return true;
        }
        if (!m25975b6() || !this.f15864X2.m25012v().m26779G().m18672G()) {
            return this.f15864X2.m25044C(h1Var, motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            m26377ia(h1Var, false);
            this.f15870d3 = motionEvent.getX();
            float y = motionEvent.getY();
            this.f15871e3 = y;
            float f = this.f15870d3;
            boolean z = f >= ((float) d3) && f <= ((float) w) && y >= ((float) e3) && y <= ((float) t);
            this.f15868b3 = z;
            if (z) {
                m26363wa(h1Var);
                return true;
            }
        } else if (action == 1) {
            if (this.f15868b3) {
                m26377ia(h1Var, true);
            }
            if (this.f15869c3) {
                m26375ka(h1Var, false, true);
            }
        } else if (action != 2) {
            if (action == 3) {
                if (this.f15868b3) {
                    m26377ia(h1Var, false);
                }
                if (this.f15869c3) {
                    m26375ka(h1Var, false, false);
                }
            }
        } else if (this.f15868b3 && Math.max(Math.abs(this.f15870d3 - motionEvent.getX()), Math.abs(this.f15871e3 - motionEvent.getY())) > C1357a0.m37534p()) {
            m26377ia(h1Var, false);
            return true;
        }
        return this.f15868b3 || this.f15869c3;
    }

    @Override
    public boolean mo25917h7() {
        return true;
    }

    public final void m26377ia(View view, boolean z) {
        AbstractRunnableC5910b bVar = this.f15872f3;
        if (bVar != null) {
            bVar.m21857c();
            this.f15872f3 = null;
            if (z) {
                m26361ya(view);
            }
        }
        this.f15868b3 = false;
    }

    public final boolean m26376ja() {
        boolean z;
        long j;
        TdApi.FormattedText formattedText;
        synchronized (this) {
            ArrayList<TdApi.Message> R2 = m26075R2();
            boolean z2 = true;
            z = false;
            if (R2 == null || R2.isEmpty()) {
                C10930q6 q6Var = this.f16099O0;
                TdApi.Message message = this.f16122a;
                TdApi.FormattedText K5 = q6Var.m2785K5(message.chatId, message.f25406id);
                if (K5 != null) {
                    formattedText = K5;
                } else {
                    formattedText = C7321e.m16899w1(this.f16122a.content);
                    z2 = false;
                }
                j = this.f16122a.f25406id;
            } else {
                TdApi.Message z0 = C4779t2.m25383z0(this.f16099O0, R2);
                if (z0 != null) {
                    formattedText = this.f16099O0.m2785K5(z0.chatId, z0.f25406id);
                    if (formattedText == null) {
                        formattedText = C7321e.m16899w1(z0.content);
                        z2 = false;
                    }
                    j = z0.f25406id;
                } else {
                    formattedText = null;
                    j = 0;
                }
            }
            z = z2;
        }
        this.f15865Y2 = z;
        return m26362xa(formattedText, j);
    }

    @Override
    public boolean mo25298k7() {
        return true;
    }

    public final void m26375ka(View view, boolean z, boolean z2) {
        if (this.f15869c3) {
            this.f15869c3 = false;
            if (z2 && SystemClock.uptimeMillis() - this.f15875i3 <= 200) {
                m26361ya(view);
            }
            if (!z) {
                this.f15873g3.requestDisallowInterceptTouchEvent(false);
                this.f15874h3.m16274ai();
            } else if (this.f15864X2.m25012v().m26764S() != null) {
                final ViewParent viewParent = this.f15873g3;
                final View$OnClickListenerC7430j1 j1Var = this.f15874h3;
                C1379j0.m37332e0(new Runnable() {
                    @Override
                    public final void run() {
                        C4714n5.m26366ta(viewParent, j1Var);
                    }
                }, 20L);
            } else {
                this.f15873g3.requestDisallowInterceptTouchEvent(false);
                this.f15874h3.m16419Ih();
            }
            this.f15873g3 = null;
            this.f15874h3 = null;
        }
    }

    public final C4630f0 m26374la(TdApi.Message message) {
        return m26373ma(message, message.content);
    }

    @Override
    public boolean mo25295m8(View view, float f, float f2) {
        C5459x0 x0Var;
        return this.f15864X2.m25043D(view) || ((x0Var = this.f15861U2) != null && x0Var.m22643A(view)) || super.mo25295m8(view, f, f2);
    }

    public final C4630f0 m26373ma(TdApi.Message message, TdApi.MessageContent messageContent) {
        C4630f0 f0Var;
        int constructor = messageContent.getConstructor();
        if (constructor == -1851395174) {
            f0Var = new C4630f0(mo4347s(), this.f16099O0, ((TdApi.MessagePhoto) messageContent).photo, message.chatId, message.f25406id, (AbstractC4761s4) this, true);
        } else if (constructor == 1306939396) {
            f0Var = new C4630f0(mo4347s(), this.f16099O0, ((TdApi.MessageAnimation) messageContent).animation, message.chatId, message.f25406id, (AbstractC4761s4) this, true);
        } else if (constructor == 2021281344) {
            f0Var = new C4630f0(mo4347s(), this.f16099O0, ((TdApi.MessageVideo) messageContent).video, message.chatId, message.f25406id, (AbstractC4761s4) this, true);
        } else {
            throw new IllegalArgumentException("message.content == " + messageContent);
        }
        f0Var.m26790A0(this.f16101P0);
        f0Var.m26713x0(m25774w1(message.f25406id));
        return f0Var;
    }

    public long m26372na() {
        return this.f15867a3;
    }

    @Override
    public long mo25855o1(float f, float f2) {
        C4630f0 q = this.f15864X2.m25017q(f, f2);
        if (q != null) {
            return q.m26769N();
        }
        return 0L;
    }

    public TdApi.File m26371oa() {
        return this.f15864X2.m25012v().m26767P();
    }

    @Override
    public boolean mo25840p7() {
        return true;
    }

    public final int m26370pa(View view, C5459x0 x0Var, boolean z) {
        if (!z) {
            return m26068R9() ? m26046T9() ? m25959d3() : m25959d3() + AbstractC4761s4.f16062g2 : m25792u4();
        }
        if (m26068R9()) {
            return (m26176H1() - AbstractC4761s4.f16062g2) - AbstractC4761s4.f16063h2;
        }
        if (m26036U9()) {
            return view.getMeasuredWidth() - m25792u4();
        }
        int d3 = m25959d3();
        return Math.max(this.f15864X2.m25011w() + d3, d3 + x0Var.getWidth());
    }

    public final void m26369qa(C4630f0 f0Var, TdApi.FormattedText formattedText) {
        TdApi.Message message = this.f16122a;
        if (message.chatId == 0) {
            f0Var.m26749f0(((TdApi.MessagePhoto) message.content).photo.sizes[0].type);
        }
        this.f15864X2 = new C4848z0(f0Var, this);
        m26360za();
        m26362xa(formattedText, this.f16122a.f25406id);
        m26376ja();
        if (m25956d6()) {
            mo26100O7(false);
        }
    }

    @Override
    public boolean mo25289r6(TdApi.Message message, TdApi.MessageContent messageContent) {
        return m26368ra(messageContent) && m26368ra(message.content);
    }

    @Override
    public boolean mo25809s8() {
        if (C1379j0.m37351Q() && !C1379j0.m37349S() && m26133L5() && !m26002Y5() && this.f16122a.content.getConstructor() != 1306939396) {
            if (this.f15864X2.m25009y()) {
                if (this.f15864X2.m25015s() >= (this.f15864X2.m25012v().m26762U() ? 0.8f : 0.5f)) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean m26367sa(int i) {
        return this.f15864X2.m25009y() || (this.f15864X2.m25012v() != null && this.f15864X2.m25012v().m26757Z() && this.f15864X2.m25012v().m26764S().video.f25373id == i);
    }

    public final void m26364va(C9552h1 h1Var) {
        if (!this.f15869c3 && h1Var != null) {
            ViewParent parent = h1Var.getParent();
            this.f15873g3 = parent;
            if (parent != null) {
                this.f15869c3 = true;
                this.f15875i3 = SystemClock.uptimeMillis();
                this.f15873g3.requestDisallowInterceptTouchEvent(true);
                AbstractC9323v4<?> F = mo4347s().m14552P1().m9763F();
                if (F != null) {
                    F.mo9397La();
                }
                View$OnClickListenerC7430j1 pk = View$OnClickListenerC7430j1.m16148pk(this);
                this.f15874h3 = pk;
                if (pk == null) {
                    this.f15873g3.requestDisallowInterceptTouchEvent(false);
                    this.f15869c3 = false;
                }
            }
        }
    }

    public final void m26363wa(C9552h1 h1Var) {
        m26377ia(h1Var, false);
        C4715a aVar = new C4715a(h1Var);
        this.f15872f3 = aVar;
        aVar.m21855e(C1379j0.m37313o());
        this.f15868b3 = true;
        C1379j0.m37332e0(this.f15872f3, 100L);
    }

    public final boolean m26362xa(TdApi.FormattedText formattedText, long j) {
        this.f15867a3 = j;
        if (C7321e.m16995M(this.f15866Z2, formattedText)) {
            return false;
        }
        this.f15866Z2 = formattedText;
        if (!C7321e.m16965a1(formattedText)) {
            C5459x0 D = new C5459x0(formattedText.text, AbstractC4761s4.m26125M4(), m26134L4(), AbstractC5411l0.m22789F(this.f16099O0, formattedText, m25916h8())).m22635a(Log.TAG_GIF_LOADER).m22640D(m26209E0());
            this.f15861U2 = D;
            D.m22636H(this.f16101P0);
            if (!m26068R9()) {
                this.f15861U2.m22635a(64);
            }
        } else {
            this.f15861U2 = null;
        }
        m26360za();
        return true;
    }

    @Override
    public int mo25753y3() {
        return C1357a0.m37541i(8.0f);
    }

    public final void m26361ya(View view) {
        mo4347s().m14584H3().m8984h(view, this.f16101P0).m8958i(m26096P0()).m8948u(new C9357x2.AbstractC9363f() {
            @Override
            public final void mo8098f1(View view2, Rect rect) {
                C4714n5.this.m26365ua(view2, rect);
            }
        }).m8972C(this.f16099O0, R.string.HoldMediaTutorial);
    }

    @Override
    public int mo25743z3() {
        return C7321e.m16965a1(this.f15866Z2) ? C1357a0.m37541i(8.0f) : -C1357a0.m37541i(2.0f);
    }

    public final void m26360za() {
        if (m26068R9()) {
            this.f15864X2.m25035L(m25759x7(), m25927g7());
        }
    }

    public C4714n5(C9678w2 w2Var, TdApi.Message message, TdApi.Video video, TdApi.FormattedText formattedText) {
        super(w2Var, message);
        C4630f0 f0Var = new C4630f0(mo4347s(), this.f16099O0, video, message.chatId, message.f25406id, (AbstractC4761s4) this, true);
        f0Var.m26790A0(this.f16101P0);
        m26369qa(f0Var, formattedText);
    }

    public C4714n5(C9678w2 w2Var, TdApi.Message message, TdApi.Animation animation, TdApi.FormattedText formattedText) {
        super(w2Var, message);
        C4630f0 f0Var = new C4630f0(mo4347s(), this.f16099O0, animation, message.chatId, message.f25406id, (AbstractC4761s4) this, true);
        f0Var.m26790A0(this.f16101P0);
        m26369qa(f0Var, formattedText);
    }

    public C4714n5(C9678w2 w2Var, TdApi.Message message, TdApi.Document document, TdApi.FormattedText formattedText) {
        super(w2Var, message);
        C4630f0 f0Var = new C4630f0(mo4347s(), this.f16099O0, document, message.chatId, message.f25406id, (AbstractC4761s4) this, true);
        f0Var.m26790A0(this.f16101P0);
        m26369qa(f0Var, formattedText);
    }
}
