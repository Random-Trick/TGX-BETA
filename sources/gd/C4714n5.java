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
                C4714n5.this.m26365va(this.f15876M);
            }
        }
    }

    public C4714n5(C9678w2 w2Var, TdApi.Message message, TdApi.Photo photo, TdApi.FormattedText formattedText) {
        super(w2Var, message);
        C4630f0 f0Var = new C4630f0(mo4347s(), this.f16099O0, photo, message.chatId, message.f25409id, (AbstractC4761s4) this, true);
        f0Var.m26790B0(this.f16101P0);
        m26370qa(f0Var, formattedText);
    }

    public static boolean m26369ra(TdApi.MessageContent messageContent) {
        int constructor = messageContent.getConstructor();
        return constructor == -1851395174 || constructor == 1306939396 || constructor == 2021281344;
    }

    public static void m26367ta(ViewParent viewParent, View$OnClickListenerC7430j1 j1Var) {
        viewParent.requestDisallowInterceptTouchEvent(false);
        j1Var.m16419Ih();
    }

    public void m26366ua(View view, Rect rect) {
        this.f15864X2.m25013v().m26781G().m18654P0(rect);
    }

    public final boolean m26385Aa() {
        String M3 = m26127M3();
        String str = this.f15862V2;
        if (str != null && str.equals(M3)) {
            return false;
        }
        this.f15862V2 = M3;
        this.f15863W2 = (int) C7389v0.m16680T1(M3, AbstractC4761s4.m26113N6());
        return true;
    }

    @Override
    public void mo26214D7(long j, C3950k kVar) {
        this.f15864X2.m25035M(j, kVar);
    }

    @Override
    public void mo26182G7() {
        m26361za();
    }

    @Override
    public boolean mo26154J5() {
        return this.f15865Y2;
    }

    @Override
    public void mo25335L8(C6238b bVar, boolean z, int i) {
        this.f15864X2.m25038J(bVar, z);
    }

    @Override
    public boolean mo25334L9(TdApi.Message message, TdApi.MessageContent messageContent, boolean z) {
        int i;
        if (message.content.getConstructor() != messageContent.getConstructor()) {
            C4630f0 ma2 = m26374ma(message, messageContent);
            synchronized (this) {
                i = this.f15864X2.m25040H(ma2) != 0 ? 2 : 0;
            }
        } else {
            C4630f0 p = this.f15864X2.m25019p(message.f25409id);
            if (p != null && messageContent.getConstructor() == -1851395174) {
                int F = p.m26783F();
                int E = p.m26785E();
                if (p.m26776I0(message.f25409id, (TdApi.MessagePhoto) messageContent)) {
                    if (!(F == p.m26783F() && E == p.m26785E())) {
                        this.f15864X2.m25043E();
                    }
                    i = 2;
                }
            }
            i = 0;
        }
        message.content = messageContent;
        if (m26377ja()) {
            i |= 1;
        }
        if (i == 0) {
            return false;
        }
        m25741z8();
        if ((i & 2) == 0) {
            return true;
        }
        m25752y5();
        return true;
    }

    @Override
    public void mo26112N7(boolean z) {
        C4848z0 z0Var = this.f15864X2;
        C4630f0 v = z0Var != null ? z0Var.m25013v() : null;
        if (v != null) {
            if (z) {
                m26385Aa();
            }
            int d3 = m25960d3();
            int e3 = m25950e3();
            int B = v.m26791B() + d3;
            int x = v.m26715x() + e3;
            int i = (d3 + B) / 2;
            int i2 = (e3 + x) / 2;
            int i3 = C1357a0.m37544i(15.0f);
            if (z) {
                m25782v5(d3, e3, B, x);
            } else {
                m25782v5(i - i3, i2 - i3, i + i3, i2 + i3);
            }
        }
    }

    @Override
    public void mo26101O7(boolean z) {
        C4848z0 z0Var;
        if (!m25929g6() && (z0Var = this.f15864X2) != null && z0Var.m25013v() != null) {
            this.f15864X2.m25013v().m26781G().m18612o0(true);
        }
    }

    @Override
    public boolean mo26079R() {
        return false;
    }

    @Override
    public int mo26075R3(boolean z) {
        return 0;
    }

    @Override
    public void mo26071R7(C9552h1 h1Var, boolean z) {
        this.f15864X2.m25047A();
    }

    @Override
    public boolean mo26057T(float f, float f2) {
        int d3 = m25960d3();
        int e3 = m25950e3();
        return !m25976b6() || f < ((float) d3) || f > ((float) (this.f15864X2.m25012w() + d3)) || f2 < ((float) e3) || f2 > ((float) (this.f15864X2.m25015t() + e3));
    }

    @Override
    public void mo26049T7(TdApi.Message message, int i) {
        boolean U9 = m26037U9();
        int F = this.f15864X2.m25042F(message.f25409id, i);
        if (F == 1) {
            if (m26037U9() != U9) {
                m25749y8();
            }
            m25792u5();
        } else if (F == 2) {
            m25749y8();
        }
    }

    @Override
    public int mo25324U1() {
        if (this.f15861U2 == null || C4403w.m27986G2() != this.f15861U2.m22624o()) {
            return -1;
        }
        return this.f15861U2.m22623p() + ((AbstractC4761s4.f16063h2 + AbstractC4761s4.f16062g2) * 2);
    }

    @Override
    public void mo26039U7(TdApi.Message message, boolean z, boolean z2) {
        m26377ja();
        this.f15864X2.m25030d(m26375la(message), z);
    }

    @Override
    public void mo25322V7() {
        this.f15864X2.m25023l();
        m26378ia(null, false);
        m26376ka(null, true, false);
    }

    @Override
    public C7462l1 mo26023W3(long j, View view, int i, int i2, int i3) {
        C7462l1 u = this.f15864X2.m25014u(j, view, i, i2, i3);
        if (u != null) {
            u.m15987m((!m26069R9() || !m25919h6()) ? R.id.theme_color_filling : R.id.theme_color_bubbleOut_background);
        }
        return u;
    }

    @Override
    public boolean mo25320W7(TdApi.Message message, TdApi.MessageContent messageContent, TdApi.MessageContent messageContent2, boolean z) {
        if (message.viaBotUserId == 0 || messageContent.getConstructor() != -1851395174) {
            return false;
        }
        mo25334L9(message, messageContent2, z);
        return true;
    }

    @Override
    public boolean mo26017X0() {
        return this.f15861U2 == null && !m25939f5();
    }

    @Override
    public int mo25223X2() {
        if (this.f15861U2 == null) {
            return this.f15864X2.m25015t();
        }
        return this.f15864X2.m25015t() + this.f15861U2.getHeight() + C1357a0.m37544i(f15860j3) + ((!m26069R9() || m26047T9()) ? 0 : C1357a0.m37544i(f15860j3) - mo25220b2());
    }

    @Override
    public void mo26011X7(long j) {
        if (m25929g6() && m25976b6()) {
            this.f15864X2.m25013v().m26781G().m18624i0(R.drawable.baseline_check_24);
        }
    }

    @Override
    public void mo26008Y(TdApi.ChatType chatType) {
        this.f15864X2.m25029e(chatType);
    }

    @Override
    public void mo25991Z7(long j, long j2, boolean z) {
        this.f15864X2.m25034N(j, j2, z);
        if (this.f15867a3 == j) {
            this.f15867a3 = j2;
        }
    }

    @Override
    public void mo25222a0(int i) {
        int i2;
        boolean U9 = m26037U9();
        if (!U9) {
            i = m26185G4();
            i2 = m26196F4();
        } else if (this.f15864X2.m25010y()) {
            float f = i;
            float f2 = this.f15864X2.m25013v().m26763U() ? 1.08f : 1.5f;
            C4630f0 v = this.f15864X2.m25013v();
            i2 = Math.min((int) (f2 * f), (int) (v.m26785E() * (f / v.m26783F())));
        } else {
            i2 = (int) (i * 0.85f);
        }
        this.f15864X2.m25028f(i, i2, U9 ? 1 : 0, false);
        if (m25976b6()) {
            m26385Aa();
        }
        C5459x0 x0Var = this.f15861U2;
        if (x0Var != null) {
            x0Var.m22643B(m26069R9() ? this.f15864X2.m25012w() - (AbstractC4761s4.f16062g2 * 2) : m25804t4());
        }
    }

    @Override
    public int mo25981a8(long j, long j2, int i) {
        if (!m26377ja()) {
            return 0;
        }
        m25741z8();
        return mo25355J3() == i ? 1 : 2;
    }

    @Override
    public int mo25220b2() {
        return AbstractC4761s4.f16063h2;
    }

    @Override
    public void mo25974b8(long j, float f, boolean z) {
        C4630f0 p;
        if (z && (p = this.f15864X2.m25019p(j)) != null) {
            int y = p.m26713y();
            int A = p.m26793A();
            m26205E5(y, A, y + p.m26791B(), A + p.m26715x(), false);
        }
    }

    @Override
    public void mo25313c1(C9552h1 h1Var, Canvas canvas, int i, int i2, int i3, C6238b bVar) {
        int i4;
        boolean z = m26069R9() && !m26047T9();
        int b = z ? C10192g.m5789b(canvas, m25987a2()) : Integer.MIN_VALUE;
        this.f15864X2.m25022m(h1Var, canvas, i, i2, bVar, m26037U9());
        if (z) {
            C10192g.m5785f(canvas, b);
        }
        if (this.f15862V2 != null) {
            C4630f0 v = this.f15864X2.m25013v();
            int i5 = C1357a0.m37544i(4.0f);
            int y = v.m26713y() + i5;
            if (m26069R9()) {
                i4 = C1357a0.m37544i(2.0f) + i5;
            } else {
                i4 = C1357a0.m37544i(4.0f);
            }
            int i6 = y + i4;
            int i7 = this.f15863W2 + i6 + i5;
            int x = (((i2 + v.m26715x()) - C1357a0.m37544i(4.0f)) - C1357a0.m37544i(20.0f)) - C1357a0.m37544i(4.0f);
            if (m26069R9()) {
                x -= i5;
            }
            RectF a0 = C1410y.m37053a0();
            a0.set(i6 - C1357a0.m37544i(4.0f), C1357a0.m37544i(4.0f) + x, i7, C1357a0.m37544i(4.0f) + x + C1357a0.m37544i(20.0f));
            canvas.drawRoundRect(a0, C1357a0.m37544i(4.0f), C1357a0.m37544i(4.0f), C1410y.m37042g(1275068416));
            canvas.drawText(this.f15862V2, i6, x + C1357a0.m37544i(18.0f), C1410y.m37054a(AbstractC4761s4.m26113N6(), -1));
            if (m25957d6() && !m25929g6()) {
                int C = v.m26789C();
                int D = v.m26787D();
                int i8 = C1357a0.m37544i(10.0f);
                a0.set(C - i8, D - i8, C + i8, D + i8);
                canvas.drawArc(a0, -90.0f, m26145K3() * (-360.0f), true, C1410y.m37042g(-1));
            }
        }
        C5459x0 x0Var = this.f15861U2;
        if (x0Var != null) {
            x0Var.m22631h(canvas, m26371pa(h1Var, x0Var, false), m26371pa(h1Var, this.f15861U2, true), 0, C1357a0.m37544i(f15860j3) + i2 + this.f15864X2.m25015t(), null, 1.0f);
        }
    }

    @Override
    public int mo25219c3() {
        return this.f15861U2 == null ? this.f15864X2.m25012w() : Math.max(this.f15864X2.m25012w(), this.f15861U2.getWidth());
    }

    @Override
    public boolean mo25218f8(C9552h1 h1Var, MotionEvent motionEvent) {
        if (super.mo25218f8(h1Var, motionEvent)) {
            return true;
        }
        int d3 = m25960d3();
        int e3 = m25950e3();
        int w = this.f15864X2.m25012w() + d3;
        int t = this.f15864X2.m25015t() + e3;
        C5459x0 x0Var = this.f15861U2;
        if (x0Var != null && x0Var.m22615x(h1Var, motionEvent)) {
            return true;
        }
        if (!m25976b6() || !this.f15864X2.m25013v().m26781G().m18673G()) {
            return this.f15864X2.m25045C(h1Var, motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            m26378ia(h1Var, false);
            this.f15870d3 = motionEvent.getX();
            float y = motionEvent.getY();
            this.f15871e3 = y;
            float f = this.f15870d3;
            boolean z = f >= ((float) d3) && f <= ((float) w) && y >= ((float) e3) && y <= ((float) t);
            this.f15868b3 = z;
            if (z) {
                m26364wa(h1Var);
                return true;
            }
        } else if (action == 1) {
            if (this.f15868b3) {
                m26378ia(h1Var, true);
            }
            if (this.f15869c3) {
                m26376ka(h1Var, false, true);
            }
        } else if (action != 2) {
            if (action == 3) {
                if (this.f15868b3) {
                    m26378ia(h1Var, false);
                }
                if (this.f15869c3) {
                    m26376ka(h1Var, false, false);
                }
            }
        } else if (this.f15868b3 && Math.max(Math.abs(this.f15870d3 - motionEvent.getX()), Math.abs(this.f15871e3 - motionEvent.getY())) > C1357a0.m37537p()) {
            m26378ia(h1Var, false);
            return true;
        }
        return this.f15868b3 || this.f15869c3;
    }

    @Override
    public boolean mo25918h7() {
        return true;
    }

    public final void m26378ia(View view, boolean z) {
        AbstractRunnableC5910b bVar = this.f15872f3;
        if (bVar != null) {
            bVar.m21858c();
            this.f15872f3 = null;
            if (z) {
                m26362ya(view);
            }
        }
        this.f15868b3 = false;
    }

    public final boolean m26377ja() {
        boolean z;
        long j;
        TdApi.FormattedText formattedText;
        synchronized (this) {
            ArrayList<TdApi.Message> R2 = m26076R2();
            boolean z2 = true;
            z = false;
            if (R2 == null || R2.isEmpty()) {
                C10930q6 q6Var = this.f16099O0;
                TdApi.Message message = this.f16122a;
                TdApi.FormattedText K5 = q6Var.m2785K5(message.chatId, message.f25409id);
                if (K5 != null) {
                    formattedText = K5;
                } else {
                    formattedText = C7321e.m16899w1(this.f16122a.content);
                    z2 = false;
                }
                j = this.f16122a.f25409id;
            } else {
                TdApi.Message z0 = C4779t2.m25384z0(this.f16099O0, R2);
                if (z0 != null) {
                    formattedText = this.f16099O0.m2785K5(z0.chatId, z0.f25409id);
                    if (formattedText == null) {
                        formattedText = C7321e.m16899w1(z0.content);
                        z2 = false;
                    }
                    j = z0.f25409id;
                } else {
                    formattedText = null;
                    j = 0;
                }
            }
            z = z2;
        }
        this.f15865Y2 = z;
        return m26363xa(formattedText, j);
    }

    @Override
    public boolean mo25299k7() {
        return true;
    }

    public final void m26376ka(View view, boolean z, boolean z2) {
        if (this.f15869c3) {
            this.f15869c3 = false;
            if (z2 && SystemClock.uptimeMillis() - this.f15875i3 <= 200) {
                m26362ya(view);
            }
            if (!z) {
                this.f15873g3.requestDisallowInterceptTouchEvent(false);
                this.f15874h3.m16274ai();
            } else if (this.f15864X2.m25013v().m26765S() != null) {
                final ViewParent viewParent = this.f15873g3;
                final View$OnClickListenerC7430j1 j1Var = this.f15874h3;
                C1379j0.m37335e0(new Runnable() {
                    @Override
                    public final void run() {
                        C4714n5.m26367ta(viewParent, j1Var);
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

    public final C4630f0 m26375la(TdApi.Message message) {
        return m26374ma(message, message.content);
    }

    @Override
    public boolean mo25296m8(View view, float f, float f2) {
        C5459x0 x0Var;
        return this.f15864X2.m25044D(view) || ((x0Var = this.f15861U2) != null && x0Var.m22644A(view)) || super.mo25296m8(view, f, f2);
    }

    public final C4630f0 m26374ma(TdApi.Message message, TdApi.MessageContent messageContent) {
        C4630f0 f0Var;
        int constructor = messageContent.getConstructor();
        if (constructor == -1851395174) {
            f0Var = new C4630f0(mo4347s(), this.f16099O0, ((TdApi.MessagePhoto) messageContent).photo, message.chatId, message.f25409id, (AbstractC4761s4) this, true);
        } else if (constructor == 1306939396) {
            f0Var = new C4630f0(mo4347s(), this.f16099O0, ((TdApi.MessageAnimation) messageContent).animation, message.chatId, message.f25409id, (AbstractC4761s4) this, true);
        } else if (constructor == 2021281344) {
            f0Var = new C4630f0(mo4347s(), this.f16099O0, ((TdApi.MessageVideo) messageContent).video, message.chatId, message.f25409id, (AbstractC4761s4) this, true);
        } else {
            throw new IllegalArgumentException("message.content == " + messageContent);
        }
        f0Var.m26790B0(this.f16101P0);
        f0Var.m26712y0(m25775w1(message.f25409id));
        return f0Var;
    }

    public long m26373na() {
        return this.f15867a3;
    }

    @Override
    public long mo25856o1(float f, float f2) {
        C4630f0 q = this.f15864X2.m25018q(f, f2);
        if (q != null) {
            return q.m26770N();
        }
        return 0L;
    }

    public TdApi.File m26372oa() {
        return this.f15864X2.m25013v().m26768P();
    }

    @Override
    public boolean mo25841p7() {
        return true;
    }

    public final int m26371pa(View view, C5459x0 x0Var, boolean z) {
        if (!z) {
            return m26069R9() ? m26047T9() ? m25960d3() : m25960d3() + AbstractC4761s4.f16062g2 : m25793u4();
        }
        if (m26069R9()) {
            return (m26177H1() - AbstractC4761s4.f16062g2) - AbstractC4761s4.f16063h2;
        }
        if (m26037U9()) {
            return view.getMeasuredWidth() - m25793u4();
        }
        int d3 = m25960d3();
        return Math.max(this.f15864X2.m25012w() + d3, d3 + x0Var.getWidth());
    }

    public final void m26370qa(C4630f0 f0Var, TdApi.FormattedText formattedText) {
        TdApi.Message message = this.f16122a;
        if (message.chatId == 0) {
            f0Var.m26748g0(((TdApi.MessagePhoto) message.content).photo.sizes[0].type);
        }
        this.f15864X2 = new C4848z0(f0Var, this);
        m26361za();
        m26363xa(formattedText, this.f16122a.f25409id);
        m26377ja();
        if (m25957d6()) {
            mo26101O7(false);
        }
    }

    @Override
    public boolean mo25290r6(TdApi.Message message, TdApi.MessageContent messageContent) {
        return m26369ra(messageContent) && m26369ra(message.content);
    }

    @Override
    public boolean mo25810s8() {
        if (C1379j0.m37354Q() && !C1379j0.m37352S() && m26134L5() && !m26003Y5() && this.f16122a.content.getConstructor() != 1306939396) {
            if (this.f15864X2.m25010y()) {
                if (this.f15864X2.m25016s() >= (this.f15864X2.m25013v().m26763U() ? 0.8f : 0.5f)) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean m26368sa(int i) {
        return this.f15864X2.m25010y() || (this.f15864X2.m25013v() != null && this.f15864X2.m25013v().m26757a0() && this.f15864X2.m25013v().m26765S().video.f25376id == i);
    }

    public final void m26365va(C9552h1 h1Var) {
        if (!this.f15869c3 && h1Var != null) {
            ViewParent parent = h1Var.getParent();
            this.f15873g3 = parent;
            if (parent != null) {
                this.f15869c3 = true;
                this.f15875i3 = SystemClock.uptimeMillis();
                this.f15873g3.requestDisallowInterceptTouchEvent(true);
                AbstractC9323v4<?> F = mo4347s().m14551P1().m9762F();
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

    public final void m26364wa(C9552h1 h1Var) {
        m26378ia(h1Var, false);
        C4715a aVar = new C4715a(h1Var);
        this.f15872f3 = aVar;
        aVar.m21856e(C1379j0.m37316o());
        this.f15868b3 = true;
        C1379j0.m37335e0(this.f15872f3, 100L);
    }

    public final boolean m26363xa(TdApi.FormattedText formattedText, long j) {
        this.f15867a3 = j;
        if (C7321e.m16995M(this.f15866Z2, formattedText)) {
            return false;
        }
        this.f15866Z2 = formattedText;
        if (!C7321e.m16965a1(formattedText)) {
            C5459x0 D = new C5459x0(formattedText.text, AbstractC4761s4.m26126M4(), m26135L4(), AbstractC5411l0.m22790F(this.f16099O0, formattedText, m25917h8())).m22636a(Log.TAG_GIF_LOADER).m22641D(m26210E0());
            this.f15861U2 = D;
            D.m22637H(this.f16101P0);
            if (!m26069R9()) {
                this.f15861U2.m22636a(64);
            }
        } else {
            this.f15861U2 = null;
        }
        m26361za();
        return true;
    }

    @Override
    public int mo25754y3() {
        return C1357a0.m37544i(8.0f);
    }

    public final void m26362ya(View view) {
        mo4347s().m14584H3().m8984h(view, this.f16101P0).m8958i(m26097P0()).m8948u(new C9357x2.AbstractC9363f() {
            @Override
            public final void mo8098f1(View view2, Rect rect) {
                C4714n5.this.m26366ua(view2, rect);
            }
        }).m8972C(this.f16099O0, R.string.HoldMediaTutorial);
    }

    @Override
    public int mo25744z3() {
        return C7321e.m16965a1(this.f15866Z2) ? C1357a0.m37544i(8.0f) : -C1357a0.m37544i(2.0f);
    }

    public final void m26361za() {
        if (m26069R9()) {
            this.f15864X2.m25036L(m25760x7(), m25928g7());
        }
    }

    public C4714n5(C9678w2 w2Var, TdApi.Message message, TdApi.Video video, TdApi.FormattedText formattedText) {
        super(w2Var, message);
        C4630f0 f0Var = new C4630f0(mo4347s(), this.f16099O0, video, message.chatId, message.f25409id, (AbstractC4761s4) this, true);
        f0Var.m26790B0(this.f16101P0);
        m26370qa(f0Var, formattedText);
    }

    public C4714n5(C9678w2 w2Var, TdApi.Message message, TdApi.Animation animation, TdApi.FormattedText formattedText) {
        super(w2Var, message);
        C4630f0 f0Var = new C4630f0(mo4347s(), this.f16099O0, animation, message.chatId, message.f25409id, (AbstractC4761s4) this, true);
        f0Var.m26790B0(this.f16101P0);
        m26370qa(f0Var, formattedText);
    }

    public C4714n5(C9678w2 w2Var, TdApi.Message message, TdApi.Document document, TdApi.FormattedText formattedText) {
        super(w2Var, message);
        C4630f0 f0Var = new C4630f0(mo4347s(), this.f16099O0, document, message.chatId, message.f25409id, (AbstractC4761s4) this, true);
        f0Var.m26790B0(this.f16101P0);
        m26370qa(f0Var, formattedText);
    }
}
