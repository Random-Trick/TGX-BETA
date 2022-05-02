package gd;

import android.graphics.Canvas;
import android.location.Location;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import be.C1363c0;
import be.C1379j0;
import be.C1405v;
import be.C1410y;
import ge.C4868i;
import ie.C5386e;
import ie.RunnableC5390g;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p037cb.C2065g;
import p038ce.AbstractView$OnClickListenerC3344yb;
import p082fd.C4403w;
import p108hb.C5070i;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p156kd.C6240c;
import p156kd.C6246h;
import p156kd.C6251j;
import p156kd.C6257p;
import p291uc.C9552h1;
import p291uc.C9678w2;
import p350yd.C10651f1;
import p350yd.C10930q6;
import td.AbstractC9323v4;

public class C4684k5 extends AbstractC4761s4 implements C10651f1.AbstractC10656e {
    public float f15682A3;
    public float f15683B3;
    public float f15684C3;
    public final TdApi.Location f15685U2;
    public int f15686V2;
    public int f15687W2;
    public final TdApi.Venue f15688X2;
    public long f15689Y2;
    public C6246h f15690Z2;
    public C6246h f15691a3;
    public C5386e f15692b3;
    public float f15693c3;
    public int f15694d3;
    public int f15695e3;
    public int f15696f3;
    public String f15697g3;
    public boolean f15698h3;
    public String f15699i3;
    public long f15700j3;
    public boolean f15701k3;
    public boolean f15702l3;
    public String f15703m3;
    public String f15704n3;
    public float f15705o3;
    public String f15706p3;
    public float f15707q3;
    public long f15708r3;
    public boolean f15709s3;
    public TdApi.Location f15710t3;
    public int f15711u3;
    public int f15712v3;
    public int f15713w3;
    public int f15714x3;
    public int f15715y3;
    public int f15716z3;

    public static class C4685a {
        public final String f15717a;
        public final long f15718b;

        public C4685a(String str, long j) {
            this.f15717a = str;
            this.f15718b = j;
        }
    }

    public C4684k5(C9678w2 w2Var, TdApi.Message message, TdApi.Location location, int i, int i2) {
        super(w2Var, message);
        this.f15700j3 = -1L;
        this.f15708r3 = -1L;
        this.f15685U2 = location;
        this.f15688X2 = null;
        if (i != 0) {
            int constructor = message.senderId.getConstructor();
            if (constructor == -336109341) {
                long j = ((TdApi.MessageSenderUser) message.senderId).userId;
                m26519Da(j, this.f16099O0.m2480e2().m1583v2(j));
            } else if (constructor == -239660751) {
                long j2 = ((TdApi.MessageSenderChat) message.senderId).chatId;
                m26520Ca(j2, this.f16099O0.m2632U2(j2));
            } else {
                throw new AssertionError(message.senderId.toString());
            }
            m26496xa(i, i2, true);
        }
    }

    public static C4685a m26513ga(C10930q6 q6Var, int i) {
        long D4 = q6Var.m2898D4();
        long j = i;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        long L0 = C4403w.m27968L0(j, timeUnit, D4, timeUnit2, true, 5);
        String X0 = C4403w.m27920X0(j, timeUnit, D4, timeUnit2, true, 5, R.string.locationUpdated, false);
        long j2 = -1;
        if (L0 != -1) {
            j2 = SystemClock.uptimeMillis() + Math.max(L0, 0L);
        }
        return new C4685a(X0, j2);
    }

    public void m26505oa() {
        if (!m26031V5()) {
            m26514fa(true);
        }
    }

    public void m26504pa() {
        this.f16099O0.m2485dd().m3847F8(m26097P0(), 0, new Runnable() {
            @Override
            public final void run() {
                C4684k5.this.m26505oa();
            }
        });
    }

    public boolean m26503qa(double d, double d2, AbstractView$OnClickListenerC3344yb.C3351f fVar, View view, int i) {
        if (i == R.id.btn_copyText) {
            C1379j0.m37328i(String.format(Locale.US, "%f,%f", Double.valueOf(d), Double.valueOf(d2)), R.string.CopiedCoordinates);
        } else if (i != R.id.btn_open) {
            if (i == R.id.btn_openIn && C1405v.m37145A(d, d2, fVar.f11153d, fVar.f11154e)) {
                m25770w8();
            }
        } else if (this.f16099O0.m2485dd().m3479q7(this, fVar)) {
            m25770w8();
        }
        return true;
    }

    public static String m26502ra(double d) {
        String str = d > 0.0d ? "N" : "S";
        String ua2 = m26499ua(Location.convert(Math.abs(d), 2), 2);
        return ua2 + str;
    }

    public static String m26501sa(double d) {
        String str = d > 0.0d ? "W" : "E";
        String ua2 = m26499ua(Location.convert(Math.abs(d), 2), 2);
        return ua2 + str;
    }

    public static String m26499ua(String str, int i) {
        String replaceFirst = str.replaceFirst(":", "°").replaceFirst(":", "'");
        int indexOf = replaceFirst.indexOf(".") + 1 + i;
        if (indexOf < replaceFirst.length()) {
            replaceFirst = replaceFirst.substring(0, indexOf);
        }
        return replaceFirst + "\"";
    }

    public final boolean m26522Aa(boolean z) {
        if (!z && (this.f15703m3 == null || this.f15700j3 == -1)) {
            return false;
        }
        boolean z2 = (this.f15716z3 & 2) != 0;
        if (!z && z2 && SystemClock.uptimeMillis() < this.f15700j3) {
            return false;
        }
        String ha = m26512ha();
        String ta = m26500ta(ha);
        boolean c = true ^ C5070i.m24068c(ta, this.f15703m3);
        if (c) {
            this.f15703m3 = ta;
            this.f15704n3 = ha;
            if (this.f15705o3 > 0.0f) {
                this.f15699i3 = TextUtils.ellipsize(ta, C1410y.m37043f0(), this.f15705o3, TextUtils.TruncateAt.END).toString();
            }
        }
        if (!z2 && this.f15701k3) {
            m26497wa(2, false, this.f15700j3 - SystemClock.uptimeMillis());
        } else if (!this.f15701k3) {
            m26508la(2);
        }
        return c;
    }

    public final boolean m26521Ba() {
        String str = this.f15704n3;
        if (str == null) {
            return false;
        }
        String ta = m26500ta(str);
        if (C5070i.m24068c(ta, this.f15703m3)) {
            return false;
        }
        this.f15703m3 = ta;
        if (this.f15705o3 <= 0.0f) {
            return true;
        }
        this.f15699i3 = TextUtils.ellipsize(ta, C1410y.m37043f0(), this.f15705o3, TextUtils.TruncateAt.END).toString();
        return true;
    }

    public final void m26520Ca(long j, TdApi.Chat chat) {
        this.f15691a3 = this.f16099O0.m2526b3(j);
        this.f15694d3 = this.f16099O0.m2511c3(j);
        C5386e j3 = this.f16099O0.m2399j3(j);
        this.f15692b3 = j3;
        this.f15693c3 = C1410y.m37011v0(j3, 18.0f);
    }

    public final void m26519Da(long j, TdApi.User user) {
        this.f15694d3 = this.f16099O0.m2480e2().m1571y2(user);
        if (user != null) {
            this.f15691a3 = C4779t2.m25689G0(this.f16099O0, user);
            this.f15692b3 = C4779t2.m25702E1(user);
        } else {
            this.f15691a3 = null;
            this.f15692b3 = C4779t2.m25702E1(null);
        }
        this.f15693c3 = C1410y.m37011v0(this.f15692b3, 18.0f);
    }

    public final boolean m26518Ea() {
        boolean z = true;
        boolean z2 = (this.f15716z3 & 4) != 0;
        String ia = m26511ia();
        String str = this.f15706p3;
        if ((str == null) != (ia == null) || !C5070i.m24068c(str, ia)) {
            this.f15706p3 = ia;
            this.f15707q3 = C7389v0.m16680T1(ia, C1410y.m37074G0(13.0f, false, true));
        } else {
            z = false;
        }
        if (!z2 && this.f15701k3) {
            m26497wa(4, false, this.f15708r3 - SystemClock.uptimeMillis());
        } else if (z2 && this.f15708r3 == 0) {
            m26508la(4);
        }
        return z;
    }

    @Override
    public void mo26151J8(C6257p pVar) {
        pVar.m20820G(this.f15691a3);
    }

    @Override
    public void mo1718L1(TdApi.Location location, int i) {
        this.f15710t3 = location;
        if (m26521Ba()) {
            m25792u5();
        }
    }

    @Override
    public boolean mo25334L9(TdApi.Message message, TdApi.MessageContent messageContent, boolean z) {
        int i;
        int i2;
        TdApi.Location location;
        boolean z2;
        int constructor = messageContent.getConstructor();
        if (constructor == -2146492043) {
            location = ((TdApi.MessageVenue) messageContent).venue.location;
            i = this.f15686V2;
            i2 = this.f15687W2;
        } else if (constructor != 303973492) {
            return false;
        } else {
            TdApi.MessageLocation messageLocation = (TdApi.MessageLocation) messageContent;
            location = messageLocation.location;
            i = messageLocation.livePeriod;
            i2 = messageLocation.expiresIn;
        }
        TdApi.Location location2 = this.f15685U2;
        double d = location2.latitude;
        double d2 = location.latitude;
        if (d == d2 && location2.longitude == location.longitude) {
            z2 = false;
        } else {
            location2.latitude = d2;
            location2.longitude = location.longitude;
            if (this.f15695e3 > 0 && this.f15696f3 > 0) {
                m26514fa(true);
            }
            z2 = true;
        }
        if (i == this.f15686V2 && i2 == this.f15687W2) {
            return z2;
        }
        m26496xa(i, i2, false);
        return true;
    }

    @Override
    public void mo26122M8(C6240c cVar) {
        cVar.m20978j(null, this.f15690Z2);
    }

    @Override
    public void mo26092P7(boolean z) {
        m26495ya(z && this.f15709s3);
    }

    @Override
    public boolean mo26079R() {
        return false;
    }

    @Override
    public int mo26075R3(boolean z) {
        if (z || this.f15688X2 != null || this.f15686V2 <= 0) {
            return 0;
        }
        return C1357a0.m37544i(26.0f);
    }

    @Override
    public int mo25324U1() {
        return this.f15688X2 == null ? -1 : -2;
    }

    @Override
    public void mo25322V7() {
        super.mo25322V7();
        m26509ka();
    }

    @Override
    public boolean mo26021W5() {
        return false;
    }

    @Override
    public boolean mo26017X0() {
        return this.f15688X2 == null;
    }

    @Override
    public int mo25223X2() {
        if (this.f15688X2 == null && !this.f15709s3) {
            return this.f15696f3;
        }
        return this.f15696f3 + C1357a0.m37544i(m26069R9() ? 9.0f : 4.0f) + (C1357a0.m37544i(20.0f) * 2);
    }

    @Override
    public boolean mo26001Y7(long j, int i) {
        return m26522Aa(true);
    }

    @Override
    public void mo25997Z0(Canvas canvas, C9552h1 h1Var) {
        if (this.f15686V2 <= 0 || this.f15689Y2 == 0) {
            super.mo25997Z0(canvas, h1Var);
        }
    }

    @Override
    public void mo25222a0(int i) {
        String str;
        int G4 = m26037U9() ? i : m26185G4();
        this.f15695e3 = G4;
        this.f15696f3 = (int) (G4 * 0.5f);
        boolean ma2 = m26507ma(false);
        this.f15709s3 = ma2;
        TdApi.Venue venue = this.f15688X2;
        if (venue != null) {
            str = venue.title;
            String str2 = venue.address;
            this.f15704n3 = str2;
            this.f15703m3 = m26500ta(str2);
            this.f15706p3 = null;
        } else if (ma2) {
            str = C4403w.m27871i1(R.string.AttachLiveLocation);
            String ha = m26512ha();
            this.f15704n3 = ha;
            this.f15703m3 = m26500ta(ha);
            this.f15706p3 = m26511ia();
        } else {
            this.f15706p3 = null;
            this.f15704n3 = null;
            this.f15703m3 = null;
            str = null;
        }
        if (str == null || this.f15703m3 == null) {
            this.f15699i3 = null;
            this.f15697g3 = null;
        } else {
            boolean R9 = m26069R9();
            C1357a0.m37544i(11.0f);
            int i2 = C1357a0.m37544i(20.0f);
            int i3 = i - ((m26037U9() ? AbstractC4761s4.f16066k2 : 0) * 2);
            if (R9) {
                i3 -= (AbstractC4761s4.f16062g2 - AbstractC4761s4.f16063h2) * 2;
            }
            if (this.f15706p3 != null) {
                i3 -= C1357a0.m37544i(12.0f) + C1357a0.m37544i(22.0f);
                if (!R9) {
                    i3 -= C1357a0.m37544i(4.0f);
                }
            }
            boolean M0 = RunnableC5390g.m22984M0(str);
            this.f15698h3 = M0;
            this.f15697g3 = TextUtils.ellipsize(str, C1410y.m37023p0(M0), i3, TextUtils.TruncateAt.END).toString();
            if (R9 && this.f15688X2 != null) {
                i3 -= m26148K0(true);
            }
            String str3 = this.f15703m3;
            TextPaint f0 = C1410y.m37043f0();
            float f = i3;
            this.f15705o3 = f;
            this.f15699i3 = TextUtils.ellipsize(str3, f0, f, TextUtils.TruncateAt.END).toString();
            if (m26037U9()) {
                this.f15696f3 -= (i2 * 2) - C1357a0.m37544i(9.0f);
            }
        }
        m26514fa(false);
    }

    @Override
    public int mo25220b2() {
        return AbstractC4761s4.f16063h2;
    }

    @Override
    public void mo25977b5(int i, int i2, int i3) {
        this.f15716z3 &= ~i;
        if (i == 1) {
            int i4 = C1357a0.m37544i(42.0f);
            int i5 = this.f15712v3;
            int i6 = this.f15713w3;
            m25782v5(i5 - i4, i6 - i4, i5 + i4, i6 + i4);
        } else if (i != 2) {
            if (i != 4) {
                if (i == 8) {
                    m26506na();
                } else if (i == 16) {
                    m26507ma(true);
                    m26498va();
                }
            } else if (m26518Ea()) {
                m26506na();
            }
        } else if (m26522Aa(false)) {
            m25792u5();
        }
    }

    @Override
    public int mo25219c3() {
        return this.f15695e3;
    }

    @Override
    public void mo25962d1(p291uc.C9552h1 r33, android.graphics.Canvas r34, int r35, int r36, int r37, p156kd.AbstractC6264v r38, p156kd.AbstractC6264v r39) {
        throw new UnsupportedOperationException("Method not decompiled: gd.C4684k5.mo25962d1(uc.h1, android.graphics.Canvas, int, int, int, kd.v, kd.v):void");
    }

    @Override
    public boolean mo25218f8(C9552h1 h1Var, MotionEvent motionEvent) {
        AbstractView$OnClickListenerC3344yb.C3351f fVar;
        if (super.mo25218f8(h1Var, motionEvent)) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int d3 = m25960d3();
            int e3 = m25950e3();
            if (x < d3 || x > d3 + this.f15695e3 || y < e3 || y > e3 + this.f15696f3) {
                this.f15683B3 = 0.0f;
                this.f15684C3 = 0.0f;
            } else {
                this.f15683B3 = x;
                this.f15684C3 = y;
                return true;
            }
        } else if (action != 1) {
            if (action == 3) {
                this.f15683B3 = 0.0f;
                this.f15684C3 = 0.0f;
            }
        } else if (!(this.f15683B3 == 0.0f || this.f15684C3 == 0.0f)) {
            if (Math.abs(motionEvent.getX() - this.f15683B3) >= C1357a0.m37537p() || Math.abs(motionEvent.getY() - this.f15684C3) >= C1357a0.m37537p()) {
                this.f15683B3 = 0.0f;
                this.f15684C3 = 0.0f;
            } else {
                if (this.f15686V2 > 0) {
                    TdApi.Location location = this.f15685U2;
                    fVar = new AbstractView$OnClickListenerC3344yb.C3351f(location.latitude, location.longitude, this.f16122a);
                } else {
                    TdApi.Location location2 = this.f15685U2;
                    fVar = new AbstractView$OnClickListenerC3344yb.C3351f(location2.latitude, location2.longitude);
                }
                final AbstractView$OnClickListenerC3344yb.C3351f fVar2 = fVar;
                fVar2.m30704a(this.f16122a.chatId, m25982a7().m32269qk());
                TdApi.Venue venue = this.f15688X2;
                if (venue != null) {
                    fVar2.f11153d = venue.title;
                    fVar2.f11154e = venue.address;
                    fVar2.f11157h = this.f15691a3;
                }
                C2065g.m35722c(h1Var);
                if (!m25871m6() || C4868i.m24727c2().m24696g1(false) == 2) {
                    if (this.f16099O0.m2485dd().m3479q7(this, fVar2)) {
                        m25770w8();
                    }
                    return true;
                }
                TdApi.Location location3 = this.f15685U2;
                final double d = location3.latitude;
                final double d2 = location3.longitude;
                AbstractC9323v4<?> P0 = m26097P0();
                P0.m9261ee(m26502ra(d) + " " + m26501sa(d2), new int[]{R.id.btn_open, R.id.btn_copyText, R.id.btn_openIn}, new String[]{C4403w.m27871i1(R.string.OpenMap), C4403w.m27871i1(R.string.CopyCoordinates), C4403w.m27871i1(R.string.OpenInExternalApp)}, null, new int[]{R.drawable.baseline_map_24, R.drawable.baseline_content_copy_24, R.drawable.baseline_open_in_browser_24}, new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view, int i) {
                        boolean qa2;
                        qa2 = C4684k5.this.m26503qa(d, d2, fVar2, view, i);
                        return qa2;
                    }

                    @Override
                    public boolean mo492Q() {
                        return C5115g0.m23936a(this);
                    }

                    @Override
                    public Object mo491b2(int i) {
                        return C5115g0.m23935b(this, i);
                    }
                });
                return true;
            }
        }
        return false;
    }

    public final void m26514fa(boolean z) {
        int g1 = C4868i.m24727c2().m24696g1(!m25871m6());
        if ((g1 == 0 || g1 == -1) && !m25871m6()) {
            g1 = 1;
        }
        if (g1 == -1) {
            this.f16099O0.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C4684k5.this.m26504pa();
                }
            });
        } else if (g1 == 0) {
            this.f15690Z2 = null;
        } else if (g1 == 1) {
            int i = this.f15695e3;
            int i2 = this.f15696f3;
            if (i > 1024 || i2 > 1024) {
                float max = 1024.0f / Math.max(i, i2);
                i = (int) (i * max);
                i2 = (int) (i2 * max);
            }
            int max2 = Math.max(14, i);
            int max3 = Math.max(14, i2);
            int i3 = C1357a0.m37545h() >= 2.0f ? 2 : 1;
            int i4 = max3 / i3;
            C10930q6 q6Var = this.f16099O0;
            TdApi.GetMapThumbnailFile getMapThumbnailFile = new TdApi.GetMapThumbnailFile(this.f15685U2, 16, max2 / i3, i4, i3, m26146K2());
            C6251j jVar = new C6251j(q6Var, getMapThumbnailFile, "telegram_map_" + this.f15685U2.latitude + "," + this.f15685U2.longitude);
            this.f15690Z2 = jVar;
            jVar.m20898s0(2);
        } else if (g1 == 2) {
            C10930q6 q6Var2 = this.f16099O0;
            TdApi.Location location = this.f15685U2;
            C6251j jVar2 = new C6251j(this.f16099O0, C7389v0.m16725I0(q6Var2, location.latitude, location.longitude, 16, false, this.f15695e3, this.f15696f3, null), m25871m6() ? new TdApi.FileTypeSecretThumbnail() : new TdApi.FileTypeThumbnail());
            this.f15690Z2 = jVar2;
            jVar2.m20898s0(2);
        }
        if (z) {
            C6246h hVar = this.f15690Z2;
            if (hVar != null) {
                hVar.m20895u0(true);
            }
            m26184G5();
            C6246h hVar2 = this.f15690Z2;
            if (hVar2 != null) {
                hVar2.m20895u0(false);
            }
        }
    }

    @Override
    public boolean mo25918h7() {
        return true;
    }

    public final String m26512ha() {
        C10930q6 q6Var = this.f16099O0;
        TdApi.Message message = this.f16122a;
        C4685a ga2 = m26513ga(q6Var, Math.max(message.date, message.editDate));
        this.f15700j3 = ga2.f15718b;
        return ga2.f15717a;
    }

    public final String m26511ia() {
        String str;
        if (this.f15689Y2 == 0) {
            this.f15708r3 = -1L;
            return null;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.f15689Y2 - uptimeMillis;
        if (j <= 0) {
            this.f15689Y2 = 0L;
            this.f15708r3 = -1L;
            return null;
        }
        long j2 = 1000;
        if (j <= 60000) {
            str = Integer.toString((int) (j / 1000));
        } else if (j < 3600000) {
            j2 = 60000 - (j % 60000);
            str = Integer.toString((int) ((j / 1000) / 60.0d));
        } else {
            j2 = 3600000 - (j % 3600000);
            str = ((int) Math.ceil(((j / 1000) / 60) / 60.0d)) + "h";
        }
        this.f15708r3 = uptimeMillis + j2;
        return str;
    }

    public boolean m26510ja() {
        return this.f16122a.canBeEdited && this.f15686V2 > 0 && m26507ma(true);
    }

    public final void m26509ka() {
        m26508la(1);
        m26508la(2);
        m26508la(4);
        m26508la(2);
        m26508la(8);
        m26508la(16);
    }

    public final void m26508la(int i) {
        if ((this.f15716z3 & i) != 0) {
            this.f16099O0.m2662S2(this, i);
            this.f15716z3 = (~i) & this.f15716z3;
        }
    }

    public final boolean m26507ma(boolean z) {
        boolean z2 = false;
        boolean z3 = this.f15686V2 > 0 && this.f15689Y2 > 0;
        if (!z3 || this.f15689Y2 > SystemClock.uptimeMillis()) {
            z2 = z3;
        } else {
            this.f15689Y2 = 0L;
        }
        if (z && z2 != this.f15709s3) {
            m25749y8();
        }
        return z2;
    }

    public final void m26506na() {
        if (this.f15706p3 != null && this.f15714x3 != 0 && this.f15715y3 != 0) {
            int i = C1357a0.m37544i(12.0f);
            int i2 = this.f15714x3;
            int i3 = this.f15715y3;
            m25782v5(i2 - i, i3 - i, i2 + i, i3 + i);
        }
    }

    @Override
    public boolean mo25830q7() {
        return true;
    }

    @Override
    public boolean mo25810s8() {
        return C1379j0.m37354Q() && !C1379j0.m37352S() && m26134L5();
    }

    public final String m26500ta(String str) {
        if (this.f15710t3 == null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        TdApi.Location location = this.f15685U2;
        double d = location.latitude;
        double d2 = location.longitude;
        TdApi.Location location2 = this.f15710t3;
        sb2.append(C4403w.m27966L2(C7389v0.m16664Y(d, d2, location2.latitude, location2.longitude)));
        sb2.append(C1363c0.f4975a);
        sb2.append(str);
        return sb2.toString();
    }

    public final void m26498va() {
        long j = this.f15689Y2;
        if (j > 0) {
            m26497wa(16, true, j - SystemClock.uptimeMillis());
        }
    }

    public final void m26497wa(int i, boolean z, long j) {
        boolean z2 = (this.f15716z3 & i) != 0;
        if (!z2 || z) {
            if (z2) {
                this.f16099O0.m2662S2(this, i);
            }
            this.f15716z3 |= i;
            this.f16099O0.m2455fb(this, i, 0, 0, j);
        }
    }

    public final void m26496xa(int i, int i2, boolean z) {
        m26508la(16);
        this.f15686V2 = i;
        this.f15687W2 = i2;
        if (i2 > 0) {
            this.f15689Y2 = SystemClock.uptimeMillis() + (i2 * 1000);
            m26518Ea();
        } else if (this.f15689Y2 > 0) {
            this.f15689Y2 = 0L;
            m26518Ea();
        }
        if (!z) {
            if (this.f16122a.content.getConstructor() == 303973492) {
                ((TdApi.MessageLocation) this.f16122a.content).expiresIn = i2;
            }
            m26507ma(true);
        }
        if (this.f15701k3) {
            m26498va();
        }
    }

    public final void m26495ya(boolean z) {
        if (this.f15701k3 != z) {
            this.f15701k3 = z;
            boolean z2 = false;
            if (z) {
                if (this.f15709s3 && !this.f16122a.isOutgoing) {
                    C10651f1.C10653b e = this.f16099O0.m2930B4().m4735W1().m4371e(this);
                    if (e != null) {
                        this.f15710t3 = e.f34120a;
                        this.f15711u3 = e.f34121b;
                    } else {
                        this.f15710t3 = null;
                        this.f15711u3 = 0;
                    }
                    this.f15702l3 = true;
                }
                boolean Aa = m26522Aa(false);
                if (!Aa) {
                    Aa = m26521Ba();
                }
                if (m26518Ea() || Aa) {
                    z2 = true;
                }
                m26507ma(true);
                m26498va();
                if (z2) {
                    m25792u5();
                    return;
                }
                return;
            }
            m26509ka();
            if (this.f15702l3) {
                this.f16099O0.m2930B4().m4735W1().m4357s(this);
                this.f15702l3 = false;
            }
        }
    }

    public void m26494za() {
        if (m26510ja()) {
            Client r4 = this.f16099O0.m2270r4();
            TdApi.Message message = this.f16122a;
            r4.m14783o(new TdApi.EditMessageLiveLocation(message.chatId, message.f25409id, message.replyMarkup, null, 0, 0), this.f16099O0.m2214uc());
        }
    }

    public C4684k5(C9678w2 w2Var, TdApi.Message message, TdApi.Venue venue) {
        super(w2Var, message);
        this.f15700j3 = -1L;
        this.f15708r3 = -1L;
        this.f15685U2 = venue.location;
        this.f15688X2 = venue;
        this.f15686V2 = 0;
        if ("foursquare".equals(venue.provider)) {
            TdApi.FileType fileTypeSecretThumbnail = m25871m6() ? new TdApi.FileTypeSecretThumbnail() : new TdApi.FileTypeThumbnail();
            String x1 = C4779t2.m25397x1(venue);
            if (x1 != null) {
                C6251j jVar = new C6251j(this.f16099O0, x1, fileTypeSecretThumbnail);
                this.f15691a3 = jVar;
                jVar.m20898s0(1);
            }
        }
    }
}
