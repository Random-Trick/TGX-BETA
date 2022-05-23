package hd;

import android.graphics.Canvas;
import android.location.Location;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import ce.c0;
import ce.j0;
import ce.v;
import ce.y;
import de.yb;
import gd.w;
import ib.i;
import ie.g0;
import ie.h0;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import je.e;
import je.g;
import ld.c;
import ld.h;
import ld.j;
import ld.p;
import oc.v0;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import ud.v4;
import vc.g1;
import vc.v2;
import zd.d1;
import zd.o6;

public class k5 extends s4 implements d1.e {
    public float A3;
    public float B3;
    public float C3;
    public final TdApi.Location U2;
    public int V2;
    public int W2;
    public final TdApi.Venue X2;
    public long Y2;
    public h Z2;
    public h f13171a3;
    public e f13172b3;
    public float f13173c3;
    public int f13174d3;
    public int f13175e3;
    public int f13176f3;
    public String f13177g3;
    public boolean f13178h3;
    public String f13179i3;
    public long f13180j3;
    public boolean f13181k3;
    public boolean f13182l3;
    public String f13183m3;
    public String f13184n3;
    public float f13185o3;
    public String f13186p3;
    public float f13187q3;
    public long f13188r3;
    public boolean f13189s3;
    public TdApi.Location f13190t3;
    public int f13191u3;
    public int f13192v3;
    public int f13193w3;
    public int f13194x3;
    public int f13195y3;
    public int f13196z3;

    public static class a {
        public final String f13197a;
        public final long f13198b;

        public a(String str, long j10) {
            this.f13197a = str;
            this.f13198b = j10;
        }
    }

    public k5(v2 v2Var, TdApi.Message message, TdApi.Location location, int i10, int i11) {
        super(v2Var, message);
        this.f13180j3 = -1L;
        this.f13188r3 = -1L;
        this.U2 = location;
        this.X2 = null;
        if (i10 != 0) {
            int constructor = message.senderId.getConstructor();
            if (constructor == -336109341) {
                long j10 = ((TdApi.MessageSenderUser) message.senderId).userId;
                Da(j10, this.O0.e2().u2(j10));
            } else if (constructor == -239660751) {
                long j11 = ((TdApi.MessageSenderChat) message.senderId).chatId;
                Ca(j11, this.O0.W2(j11));
            } else {
                throw new AssertionError(message.senderId.toString());
            }
            xa(i10, i11, true);
        }
    }

    public static a ga(o6 o6Var, int i10) {
        long H4 = o6Var.H4();
        long j10 = i10;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        long L0 = w.L0(j10, timeUnit, H4, timeUnit2, true, 5);
        String X0 = w.X0(j10, timeUnit, H4, timeUnit2, true, 5, R.string.locationUpdated, false);
        long j11 = -1;
        if (L0 != -1) {
            j11 = SystemClock.uptimeMillis() + Math.max(L0, 0L);
        }
        return new a(X0, j11);
    }

    public void oa() {
        if (!U5()) {
            fa(true);
        }
    }

    public void pa() {
        this.O0.hd().F8(Q0(), 0, new Runnable() {
            @Override
            public final void run() {
                k5.this.oa();
            }
        });
    }

    public boolean qa(double d10, double d11, yb.f fVar, View view, int i10) {
        if (i10 == R.id.btn_copyText) {
            j0.i(String.format(Locale.US, "%f,%f", Double.valueOf(d10), Double.valueOf(d11)), R.string.CopiedCoordinates);
        } else if (i10 != R.id.btn_open) {
            if (i10 == R.id.btn_openIn && v.A(d10, d11, fVar.f10187d, fVar.f10188e)) {
                w8();
            }
        } else if (this.O0.hd().q7(this, fVar)) {
            w8();
        }
        return true;
    }

    public static String ra(double d10) {
        String str = d10 > 0.0d ? "N" : "S";
        String ua2 = ua(Location.convert(Math.abs(d10), 2), 2);
        return ua2 + str;
    }

    public static String sa(double d10) {
        String str = d10 > 0.0d ? "W" : "E";
        String ua2 = ua(Location.convert(Math.abs(d10), 2), 2);
        return ua2 + str;
    }

    public static String ua(String str, int i10) {
        String replaceFirst = str.replaceFirst(":", "°").replaceFirst(":", "'");
        int indexOf = replaceFirst.indexOf(".") + 1 + i10;
        if (indexOf < replaceFirst.length()) {
            replaceFirst = replaceFirst.substring(0, indexOf);
        }
        return replaceFirst + "\"";
    }

    public final boolean Aa(boolean z10) {
        if (!z10 && (this.f13183m3 == null || this.f13180j3 == -1)) {
            return false;
        }
        boolean z11 = (this.f13196z3 & 2) != 0;
        if (!z10 && z11 && SystemClock.uptimeMillis() < this.f13180j3) {
            return false;
        }
        String ha2 = ha();
        String ta2 = ta(ha2);
        boolean c10 = true ^ i.c(ta2, this.f13183m3);
        if (c10) {
            this.f13183m3 = ta2;
            this.f13184n3 = ha2;
            if (this.f13185o3 > 0.0f) {
                this.f13179i3 = TextUtils.ellipsize(ta2, y.f0(), this.f13185o3, TextUtils.TruncateAt.END).toString();
            }
        }
        if (!z11 && this.f13181k3) {
            wa(2, false, this.f13180j3 - SystemClock.uptimeMillis());
        } else if (!this.f13181k3) {
            la(2);
        }
        return c10;
    }

    public final boolean Ba() {
        String str = this.f13184n3;
        if (str == null) {
            return false;
        }
        String ta2 = ta(str);
        if (i.c(ta2, this.f13183m3)) {
            return false;
        }
        this.f13183m3 = ta2;
        if (this.f13185o3 <= 0.0f) {
            return true;
        }
        this.f13179i3 = TextUtils.ellipsize(ta2, y.f0(), this.f13185o3, TextUtils.TruncateAt.END).toString();
        return true;
    }

    public final void Ca(long j10, TdApi.Chat chat) {
        this.f13171a3 = this.O0.d3(j10);
        this.f13174d3 = this.O0.e3(j10);
        e m32 = this.O0.m3(j10);
        this.f13172b3 = m32;
        this.f13173c3 = y.v0(m32, 18.0f);
    }

    public final void Da(long j10, TdApi.User user) {
        this.f13174d3 = this.O0.e2().x2(user);
        if (user != null) {
            this.f13171a3 = t2.G0(this.O0, user);
            this.f13172b3 = t2.E1(user);
        } else {
            this.f13171a3 = null;
            this.f13172b3 = t2.E1(null);
        }
        this.f13173c3 = y.v0(this.f13172b3, 18.0f);
    }

    public final boolean Ea() {
        boolean z10 = true;
        boolean z11 = (this.f13196z3 & 4) != 0;
        String ia2 = ia();
        String str = this.f13186p3;
        if ((str == null) != (ia2 == null) || !i.c(str, ia2)) {
            this.f13186p3 = ia2;
            this.f13187q3 = v0.T1(ia2, y.F0(13.0f, false, true));
        } else {
            z10 = false;
        }
        if (!z11 && this.f13181k3) {
            wa(4, false, this.f13188r3 - SystemClock.uptimeMillis());
        } else if (z11 && this.f13188r3 == 0) {
            la(4);
        }
        return z10;
    }

    @Override
    public void H1(TdApi.Location location, int i10) {
        this.f13190t3 = location;
        if (Ba()) {
            u5();
        }
    }

    @Override
    public void J8(p pVar) {
        pVar.G(this.f13171a3);
    }

    @Override
    public boolean L9(TdApi.Message message, TdApi.MessageContent messageContent, boolean z10) {
        int i10;
        int i11;
        TdApi.Location location;
        boolean z11;
        int constructor = messageContent.getConstructor();
        if (constructor == -2146492043) {
            location = ((TdApi.MessageVenue) messageContent).venue.location;
            i10 = this.V2;
            i11 = this.W2;
        } else if (constructor != 303973492) {
            return false;
        } else {
            TdApi.MessageLocation messageLocation = (TdApi.MessageLocation) messageContent;
            location = messageLocation.location;
            i10 = messageLocation.livePeriod;
            i11 = messageLocation.expiresIn;
        }
        TdApi.Location location2 = this.U2;
        double d10 = location2.latitude;
        double d11 = location.latitude;
        if (d10 == d11 && location2.longitude == location.longitude) {
            z11 = false;
        } else {
            location2.latitude = d11;
            location2.longitude = location.longitude;
            if (this.f13175e3 > 0 && this.f13176f3 > 0) {
                fa(true);
            }
            z11 = true;
        }
        if (i10 == this.V2 && i11 == this.W2) {
            return z11;
        }
        xa(i10, i11, false);
        return true;
    }

    @Override
    public void M8(c cVar) {
        cVar.j(null, this.Z2);
    }

    @Override
    public int O3(boolean z10) {
        if (z10 || this.X2 != null || this.V2 <= 0) {
            return 0;
        }
        return a0.i(26.0f);
    }

    @Override
    public void P7(boolean z10) {
        ya(z10 && this.f13189s3);
    }

    @Override
    public int R1() {
        return this.X2 == null ? -1 : -2;
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public boolean V5() {
        return false;
    }

    @Override
    public void V7() {
        super.V7();
        ka();
    }

    @Override
    public int W2() {
        if (this.X2 == null && !this.f13189s3) {
            return this.f13176f3;
        }
        return this.f13176f3 + a0.i(R9() ? 9.0f : 4.0f) + (a0.i(20.0f) * 2);
    }

    @Override
    public boolean X0() {
        return this.X2 == null;
    }

    @Override
    public void Y0(Canvas canvas, g1 g1Var) {
        if (this.V2 <= 0 || this.Y2 == 0) {
            super.Y0(canvas, g1Var);
        }
    }

    @Override
    public int Y1() {
        return s4.f13430h2;
    }

    @Override
    public boolean Y7(long j10, int i10) {
        return Aa(true);
    }

    @Override
    public int a3() {
        return this.f13175e3;
    }

    @Override
    public void a5(int i10, int i11, int i12) {
        this.f13196z3 &= ~i10;
        if (i10 == 1) {
            int i13 = a0.i(42.0f);
            int i14 = this.f13192v3;
            int i15 = this.f13193w3;
            v5(i14 - i13, i15 - i13, i14 + i13, i15 + i13);
        } else if (i10 != 2) {
            if (i10 != 4) {
                if (i10 == 8) {
                    na();
                } else if (i10 == 16) {
                    ma(true);
                    va();
                }
            } else if (Ea()) {
                na();
            }
        } else if (Aa(false)) {
            u5();
        }
    }

    @Override
    public void b0(int i10) {
        String str;
        int G4 = U9() ? i10 : G4();
        this.f13175e3 = G4;
        this.f13176f3 = (int) (G4 * 0.5f);
        boolean ma2 = ma(false);
        this.f13189s3 = ma2;
        TdApi.Venue venue = this.X2;
        if (venue != null) {
            str = venue.title;
            String str2 = venue.address;
            this.f13184n3 = str2;
            this.f13183m3 = ta(str2);
            this.f13186p3 = null;
        } else if (ma2) {
            str = w.i1(R.string.AttachLiveLocation);
            String ha2 = ha();
            this.f13184n3 = ha2;
            this.f13183m3 = ta(ha2);
            this.f13186p3 = ia();
        } else {
            this.f13186p3 = null;
            this.f13184n3 = null;
            this.f13183m3 = null;
            str = null;
        }
        if (str == null || this.f13183m3 == null) {
            this.f13179i3 = null;
            this.f13177g3 = null;
        } else {
            boolean R9 = R9();
            a0.i(11.0f);
            int i11 = a0.i(20.0f);
            int i12 = i10 - ((U9() ? s4.f13433k2 : 0) * 2);
            if (R9) {
                i12 -= (s4.f13429g2 - s4.f13430h2) * 2;
            }
            if (this.f13186p3 != null) {
                i12 -= a0.i(12.0f) + a0.i(22.0f);
                if (!R9) {
                    i12 -= a0.i(4.0f);
                }
            }
            boolean M0 = g.M0(str);
            this.f13178h3 = M0;
            this.f13177g3 = TextUtils.ellipsize(str, y.p0(M0), i12, TextUtils.TruncateAt.END).toString();
            if (R9 && this.X2 != null) {
                i12 -= L0(true);
            }
            String str3 = this.f13183m3;
            TextPaint f02 = y.f0();
            float f10 = i12;
            this.f13185o3 = f10;
            this.f13179i3 = TextUtils.ellipsize(str3, f02, f10, TextUtils.TruncateAt.END).toString();
            if (U9()) {
                this.f13176f3 -= (i11 * 2) - a0.i(9.0f);
            }
        }
        fa(false);
    }

    @Override
    public void c1(vc.g1 r33, android.graphics.Canvas r34, int r35, int r36, int r37, ld.v r38, ld.v r39) {
        throw new UnsupportedOperationException("Method not decompiled: hd.k5.c1(vc.g1, android.graphics.Canvas, int, int, int, ld.v, ld.v):void");
    }

    @Override
    public boolean f8(g1 g1Var, MotionEvent motionEvent) {
        yb.f fVar;
        if (super.f8(g1Var, motionEvent)) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int b32 = b3();
            int c32 = c3();
            if (x10 < b32 || x10 > b32 + this.f13175e3 || y10 < c32 || y10 > c32 + this.f13176f3) {
                this.B3 = 0.0f;
                this.C3 = 0.0f;
            } else {
                this.B3 = x10;
                this.C3 = y10;
                return true;
            }
        } else if (action != 1) {
            if (action == 3) {
                this.B3 = 0.0f;
                this.C3 = 0.0f;
            }
        } else if (!(this.B3 == 0.0f || this.C3 == 0.0f)) {
            if (Math.abs(motionEvent.getX() - this.B3) >= a0.p() || Math.abs(motionEvent.getY() - this.C3) >= a0.p()) {
                this.B3 = 0.0f;
                this.C3 = 0.0f;
            } else {
                if (this.V2 > 0) {
                    TdApi.Location location = this.U2;
                    fVar = new yb.f(location.latitude, location.longitude, this.f13449a);
                } else {
                    TdApi.Location location2 = this.U2;
                    fVar = new yb.f(location2.latitude, location2.longitude);
                }
                final yb.f fVar2 = fVar;
                fVar2.a(this.f13449a.chatId, a7().qk());
                TdApi.Venue venue = this.X2;
                if (venue != null) {
                    fVar2.f10187d = venue.title;
                    fVar2.f10188e = venue.address;
                    fVar2.f10191h = this.f13171a3;
                }
                db.g.c(g1Var);
                if (!l6() || he.i.c2().g1(false) == 2) {
                    if (this.O0.hd().q7(this, fVar2)) {
                        w8();
                    }
                    return true;
                }
                TdApi.Location location3 = this.U2;
                final double d10 = location3.latitude;
                final double d11 = location3.longitude;
                v4<?> Q0 = Q0();
                Q0.ee(ra(d10) + " " + sa(d11), new int[]{R.id.btn_open, R.id.btn_copyText, R.id.btn_openIn}, new String[]{w.i1(R.string.OpenMap), w.i1(R.string.CopyCoordinates), w.i1(R.string.OpenInExternalApp)}, null, new int[]{R.drawable.baseline_map_24, R.drawable.baseline_content_copy_24, R.drawable.baseline_open_in_browser_24}, new h0() {
                    @Override
                    public boolean P() {
                        return g0.a(this);
                    }

                    @Override
                    public Object a2(int i10) {
                        return g0.b(this, i10);
                    }

                    @Override
                    public final boolean r3(View view, int i10) {
                        boolean qa2;
                        qa2 = k5.this.qa(d10, d11, fVar2, view, i10);
                        return qa2;
                    }
                });
                return true;
            }
        }
        return false;
    }

    public final void fa(boolean z10) {
        int g12 = he.i.c2().g1(!l6());
        if ((g12 == 0 || g12 == -1) && !l6()) {
            g12 = 1;
        }
        if (g12 == -1) {
            this.O0.hd().post(new Runnable() {
                @Override
                public final void run() {
                    k5.this.pa();
                }
            });
        } else if (g12 == 0) {
            this.Z2 = null;
        } else if (g12 == 1) {
            int i10 = this.f13175e3;
            int i11 = this.f13176f3;
            if (i10 > 1024 || i11 > 1024) {
                float max = 1024.0f / Math.max(i10, i11);
                i10 = (int) (i10 * max);
                i11 = (int) (i11 * max);
            }
            int max2 = Math.max(14, i10);
            int max3 = Math.max(14, i11);
            int i12 = a0.h() >= 2.0f ? 2 : 1;
            int i13 = max3 / i12;
            o6 o6Var = this.O0;
            TdApi.GetMapThumbnailFile getMapThumbnailFile = new TdApi.GetMapThumbnailFile(this.U2, 16, max2 / i12, i13, i12, I2());
            j jVar = new j(o6Var, getMapThumbnailFile, "telegram_map_" + this.U2.latitude + "," + this.U2.longitude);
            this.Z2 = jVar;
            jVar.s0(2);
        } else if (g12 == 2) {
            o6 o6Var2 = this.O0;
            TdApi.Location location = this.U2;
            j jVar2 = new j(this.O0, v0.I0(o6Var2, location.latitude, location.longitude, 16, false, this.f13175e3, this.f13176f3, null), l6() ? new TdApi.FileTypeSecretThumbnail() : new TdApi.FileTypeThumbnail());
            this.Z2 = jVar2;
            jVar2.s0(2);
        }
        if (z10) {
            h hVar = this.Z2;
            if (hVar != null) {
                hVar.u0(true);
            }
            F5();
            h hVar2 = this.Z2;
            if (hVar2 != null) {
                hVar2.u0(false);
            }
        }
    }

    @Override
    public boolean h7() {
        return true;
    }

    public final String ha() {
        o6 o6Var = this.O0;
        TdApi.Message message = this.f13449a;
        a ga2 = ga(o6Var, Math.max(message.date, message.editDate));
        this.f13180j3 = ga2.f13198b;
        return ga2.f13197a;
    }

    public final String ia() {
        String str;
        if (this.Y2 == 0) {
            this.f13188r3 = -1L;
            return null;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j10 = this.Y2 - uptimeMillis;
        if (j10 <= 0) {
            this.Y2 = 0L;
            this.f13188r3 = -1L;
            return null;
        }
        long j11 = 1000;
        if (j10 <= 60000) {
            str = Integer.toString((int) (j10 / 1000));
        } else if (j10 < 3600000) {
            j11 = 60000 - (j10 % 60000);
            str = Integer.toString((int) ((j10 / 1000) / 60.0d));
        } else {
            j11 = 3600000 - (j10 % 3600000);
            str = ((int) Math.ceil(((j10 / 1000) / 60) / 60.0d)) + "h";
        }
        this.f13188r3 = uptimeMillis + j11;
        return str;
    }

    public boolean ja() {
        return this.f13449a.canBeEdited && this.V2 > 0 && ma(true);
    }

    public final void ka() {
        la(1);
        la(2);
        la(4);
        la(2);
        la(8);
        la(16);
    }

    public final void la(int i10) {
        if ((this.f13196z3 & i10) != 0) {
            this.O0.U2(this, i10);
            this.f13196z3 = (~i10) & this.f13196z3;
        }
    }

    public final boolean ma(boolean z10) {
        boolean z11 = false;
        boolean z12 = this.V2 > 0 && this.Y2 > 0;
        if (!z12 || this.Y2 > SystemClock.uptimeMillis()) {
            z11 = z12;
        } else {
            this.Y2 = 0L;
        }
        if (z10 && z11 != this.f13189s3) {
            y8();
        }
        return z11;
    }

    public final void na() {
        if (this.f13186p3 != null && this.f13194x3 != 0 && this.f13195y3 != 0) {
            int i10 = a0.i(12.0f);
            int i11 = this.f13194x3;
            int i12 = this.f13195y3;
            v5(i11 - i10, i12 - i10, i11 + i10, i12 + i10);
        }
    }

    @Override
    public boolean q7() {
        return true;
    }

    @Override
    public boolean s8() {
        return j0.Q() && !j0.S() && K5();
    }

    public final String ta(String str) {
        if (this.f13190t3 == null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        TdApi.Location location = this.U2;
        double d10 = location.latitude;
        double d11 = location.longitude;
        TdApi.Location location2 = this.f13190t3;
        sb2.append(w.L2(v0.Y(d10, d11, location2.latitude, location2.longitude)));
        sb2.append(c0.f5242a);
        sb2.append(str);
        return sb2.toString();
    }

    public final void va() {
        long j10 = this.Y2;
        if (j10 > 0) {
            wa(16, true, j10 - SystemClock.uptimeMillis());
        }
    }

    public final void wa(int i10, boolean z10, long j10) {
        boolean z11 = (this.f13196z3 & i10) != 0;
        if (!z11 || z10) {
            if (z11) {
                this.O0.U2(this, i10);
            }
            this.f13196z3 |= i10;
            this.O0.jb(this, i10, 0, 0, j10);
        }
    }

    public final void xa(int i10, int i11, boolean z10) {
        la(16);
        this.V2 = i10;
        this.W2 = i11;
        if (i11 > 0) {
            this.Y2 = SystemClock.uptimeMillis() + (i11 * 1000);
            Ea();
        } else if (this.Y2 > 0) {
            this.Y2 = 0L;
            Ea();
        }
        if (!z10) {
            if (this.f13449a.content.getConstructor() == 303973492) {
                ((TdApi.MessageLocation) this.f13449a.content).expiresIn = i11;
            }
            ma(true);
        }
        if (this.f13181k3) {
            va();
        }
    }

    public final void ya(boolean z10) {
        if (this.f13181k3 != z10) {
            this.f13181k3 = z10;
            boolean z11 = false;
            if (z10) {
                if (this.f13189s3 && !this.f13449a.isOutgoing) {
                    d1.b e10 = this.O0.F4().W1().e(this);
                    if (e10 != null) {
                        this.f13190t3 = e10.f27377a;
                        this.f13191u3 = e10.f27378b;
                    } else {
                        this.f13190t3 = null;
                        this.f13191u3 = 0;
                    }
                    this.f13182l3 = true;
                }
                boolean Aa = Aa(false);
                if (!Aa) {
                    Aa = Ba();
                }
                if (Ea() || Aa) {
                    z11 = true;
                }
                ma(true);
                va();
                if (z11) {
                    u5();
                    return;
                }
                return;
            }
            ka();
            if (this.f13182l3) {
                this.O0.F4().W1().s(this);
                this.f13182l3 = false;
            }
        }
    }

    public void za() {
        if (ja()) {
            Client v42 = this.O0.v4();
            TdApi.Message message = this.f13449a;
            v42.o(new TdApi.EditMessageLiveLocation(message.chatId, message.f19946id, message.replyMarkup, null, 0, 0), this.O0.yc());
        }
    }

    public k5(v2 v2Var, TdApi.Message message, TdApi.Venue venue) {
        super(v2Var, message);
        this.f13180j3 = -1L;
        this.f13188r3 = -1L;
        this.U2 = venue.location;
        this.X2 = venue;
        this.V2 = 0;
        if ("foursquare".equals(venue.provider)) {
            TdApi.FileType fileTypeSecretThumbnail = l6() ? new TdApi.FileTypeSecretThumbnail() : new TdApi.FileTypeThumbnail();
            String x12 = t2.x1(venue);
            if (x12 != null) {
                j jVar = new j(this.O0, x12, fileTypeSecretThumbnail);
                this.f13171a3 = jVar;
                jVar.s0(1);
            }
        }
    }
}
