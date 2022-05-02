package gd;

import android.graphics.Canvas;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import be.C1357a0;
import be.C1359b;
import be.C1363c0;
import be.C1369e0;
import be.C1379j0;
import be.C1410y;
import ie.RunnableC5390g;
import java.io.File;
import lb.EnumC6459p;
import me.C6883g1;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3950k;
import p067ed.C4183a;
import p080fb.AbstractC4345j;
import p082fd.C4403w;
import p108hb.C5064d;
import p108hb.C5069h;
import p108hb.C5070i;
import p111he.AbstractC5117h0;
import p111he.AbstractC5143t;
import p111he.C5115g0;
import p139jb.AbstractC5918j;
import p156kd.AbstractC6264v;
import p156kd.C6240c;
import p156kd.C6246h;
import p156kd.C6250i;
import p156kd.C6256o;
import p156kd.C6257p;
import p156kd.C6261s;
import p291uc.C9626o4;
import p292ud.C9726c;
import p292ud.C9773p0;
import p350yd.C10536ab;
import p350yd.C10930q6;
import p350yd.C11009t1;
import p350yd.HandlerC10770jj;
import p364zd.C11524j;

public class C4707n extends AbstractC4597c implements C6883g1.AbstractC6886c, C11009t1.AbstractC11010a, C9773p0.AbstractC9779f {
    public TdApi.VoiceNote f15810M;
    public C6883g1 f15811N;
    public boolean f15812O;
    public boolean f15813P;
    public long f15814Q = -1;
    public long f15815R = -1;
    public int f15816S;
    public boolean f15817T;
    public C6246h f15818U;
    public C6246h f15819V;
    public C6246h f15820W;
    public String f15821X;
    public boolean f15822Y;
    public String f15823Z;
    public String f15824a0;
    public TdApi.Document f15825b;
    public C9626o4 f15826b0;
    public TdApi.Audio f15827c;
    public RunnableC5390g f15828c0;
    public RunnableC5390g f15829d0;
    public float f15830e0;
    public final AbstractC4761s4 f15831f0;
    public float f15832g0;
    public AbstractC4345j f15833h0;
    public int f15834i0;
    public boolean f15835j0;
    public ViewParent f15836k0;
    public float f15837l0;
    public float f15838m0;
    public long f15839n0;
    public boolean f15840o0;
    public boolean f15841p0;
    public int f15842q0;
    public int f15843r0;

    public class C4708a implements C3950k.AbstractC3952b {
        public C4708a() {
        }

        @Override
        public void mo45P5(int i, float f, float f2, C3950k kVar) {
            C4707n.this.f15832g0 = f;
            C4707n.this.f15831f0.m25791u5();
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
        }
    }

    public C4707n(AbstractC4761s4 s4Var, TdApi.Document document) {
        this.f15831f0 = s4Var;
        boolean F3 = C4779t2.m25692F3(document);
        this.f15812O = F3;
        if (F3) {
            TdApi.Audio B4 = C4779t2.m25719B4(document);
            m26403a0(B4, null, null);
            if (B4.audio.size < EnumC6459p.f20156b.mo20395b(128.0d)) {
                this.f15811N.m18592y0();
                return;
            }
            return;
        }
        m26401c0(document);
    }

    public static C6246h m26424E(C6246h hVar, String str) {
        hVar.mo20767t0(C1357a0.m37540j(80.0f, 3.0f));
        hVar.m20930Z(true);
        hVar.m20909k0();
        hVar.m20897s0(2);
        return hVar;
    }

    public static C6246h m26423G(C10930q6 q6Var, TdApi.Document document) {
        if (C1369e0.m37396c(document.mimeType)) {
            C6246h hVar = new C6246h(q6Var, document.document);
            hVar.m20900p0();
            return m26424E(hVar, document.mimeType);
        } else if (C1369e0.m37393f(document.mimeType)) {
            return m26424E(new C6261s(q6Var, document.document), document.mimeType);
        } else {
            return null;
        }
    }

    public static int m26421I() {
        return C1357a0.m37541i(25.0f) * 2;
    }

    public static int m26419K() {
        return C1357a0.m37541i(12.0f);
    }

    public static int m26418L() {
        return C1357a0.m37541i(25.0f) * 2;
    }

    public static String m26416N(String str) {
        String a = C1369e0.m37398a(str);
        if (a == null) {
            return str;
        }
        return a.toUpperCase() + " " + C4403w.m27869i1(R.string.File);
    }

    public boolean m26410T(HandlerC10770jj.C10781k kVar, View view, int i) {
        if (i == R.id.btn_messageApplyLocalization) {
            this.f15831f0.mo4348c().m2485dd().m3877C8(this.f15831f0.m26096P0(), kVar, this.f15831f0.m25993Z3());
        } else if (i == R.id.btn_open) {
            m26404Z();
        }
        this.f15831f0.m25769w8();
        return true;
    }

    public void m26409U(final HandlerC10770jj.C10781k kVar) {
        this.f15831f0.m26096P0().m9261ee(C4403w.m27869i1(R.string.LanguageWarning), new int[]{R.id.btn_messageApplyLocalization, R.id.btn_open}, new String[]{C4403w.m27869i1(R.string.LanguageInstall), C4403w.m27869i1(R.string.Open)}, null, new int[]{R.drawable.baseline_language_24, R.drawable.baseline_open_in_browser_24}, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean T;
                T = C4707n.this.m26410T(kVar, view, i);
                return T;
            }

            @Override
            public boolean mo492Q() {
                return C5115g0.m23935a(this);
            }

            @Override
            public Object mo491b2(int i) {
                return C5115g0.m23934b(this, i);
            }
        });
    }

    public void m26408V() {
        C1379j0.m37342Z(this.f15831f0.m26096P0(), C5070i.m24061i(this.f15825b.fileName) ? null : this.f15825b.fileName, new File(this.f15825b.document.local.path), this.f15825b.mimeType, C4779t2.m25423t2(this.f15831f0.m25993Z3().interactionInfo));
    }

    public static String m26390v(TdApi.File file, boolean z, boolean z2) {
        return m26389w(file, false, z, z2);
    }

    public static String m26389w(TdApi.File file, boolean z, boolean z2, boolean z3) {
        TdApi.LocalFile localFile;
        TdApi.RemoteFile remoteFile;
        int i;
        long j;
        if (file == null || (localFile = file.local) == null || (remoteFile = file.remote) == null) {
            return null;
        }
        if ((!z && !localFile.isDownloadingActive && !z2) || (i = file.expectedSize) == 0) {
            return null;
        }
        if (z) {
            j = i;
        } else {
            j = remoteFile.isUploadingActive ? remoteFile.uploadedSize : localFile.downloadedSize;
        }
        return C4403w.m27826t0(j, i, z3);
    }

    public void m26426A() {
        this.f15835j0 = false;
    }

    @Override
    public boolean mo1990C0(int i) {
        return m26411S() || m26413Q();
    }

    public final C6246h m26425D() {
        TdApi.Thumbnail thumbnail;
        if (this.f15820W == null) {
            if (this.f15825b != null) {
                this.f15820W = m26423G(this.f15831f0.mo4348c(), this.f15825b);
            } else {
                TdApi.Audio audio = this.f15827c;
                if (audio != null && C4779t2.m25598T2(audio.audio) && ((thumbnail = this.f15827c.albumCoverThumbnail) == null || this.f15819V == null || Math.max(thumbnail.width, thumbnail.height) < 90)) {
                    C6256o oVar = new C6256o(this.f15827c.audio.local.path);
                    this.f15820W = oVar;
                    oVar.mo20767t0(C1357a0.m37540j(80.0f, 2.0f));
                    this.f15820W.m20897s0(2);
                }
            }
        }
        return this.f15820W;
    }

    public final void m26422H() {
        ViewParent viewParent = this.f15836k0;
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(false);
            this.f15836k0 = null;
            this.f15840o0 = false;
            this.f15831f0.m25791u5();
        }
    }

    public int m26420J() {
        if (this.f15826b0 != null) {
            return -2;
        }
        return ((int) this.f15830e0) + m26418L() + m26419K();
    }

    public final int m26417M() {
        RunnableC5390g gVar = this.f15829d0;
        if (gVar != null) {
            return gVar.getWidth();
        }
        return 0;
    }

    public final int m26415O() {
        RunnableC5390g gVar = this.f15828c0;
        if (gVar != null) {
            return gVar.getWidth();
        }
        return 0;
    }

    public final void m26414P() {
        String y = m26387y(null, true);
        this.f15823Z = y;
        this.f15824a0 = m26387y(y, false);
    }

    public boolean m26413Q() {
        return this.f15827c != null;
    }

    public boolean m26412R() {
        return this.f15825b != null;
    }

    public boolean m26411S() {
        return this.f15810M != null;
    }

    @Override
    public void mo6973V2(C10930q6 q6Var, long j, long j2, int i, float f, long j3, long j4, boolean z) {
        this.f15815R = j3;
        this.f15814Q = j4;
        boolean z2 = false;
        int w = j3 > 0 ? C7389v0.m16570w(j3) : 0;
        if (w != this.f15816S) {
            z2 = true;
        }
        this.f15816S = w;
        if (this.f15813P) {
            if (z2) {
                m26399e0(m26388x());
            }
            this.f15831f0.m25791u5();
        }
    }

    public final void m26407W() {
        int K = (this.f15834i0 - m26419K()) - m26418L();
        if (K > 0) {
            float f = this.f15830e0;
            m26397g0(K);
            if (this.f15830e0 != f && f != 0.0f) {
                this.f15831f0.m25997Z(false);
            }
        }
    }

    public final boolean m26406X() {
        return this.f15826b0 == null;
    }

    public void m26405Y() {
        if (this.f15810M != null) {
            if (this.f15832g0 == 1.0f) {
                if (!this.f15831f0.m25967c5()) {
                    this.f15832g0 = 0.0f;
                } else {
                    new C3950k(0, new C4708a(), C2057b.f7280b, 180L, this.f15832g0).m29544i(0.0f);
                }
            }
            this.f15831f0.m25791u5();
        }
    }

    public void m26404Z() {
        if (this.f15825b != null) {
            this.f15811N.m18649S(this.f15831f0.m26096P0(), new Runnable() {
                @Override
                public final void run() {
                    C4707n.this.m26408V();
                }
            });
            this.f15831f0.m25769w8();
        }
    }

    @Override
    public void mo25246a(int i) {
        this.f15834i0 = i;
        C9626o4 o4Var = this.f15826b0;
        if (o4Var != null) {
            o4Var.m7968j(Math.min(C1357a0.m37541i(420.0f), (((Math.min(AbstractC4761s4.m25793u3(), i) - (C1357a0.m37541i(25.0f) * 2)) - m26419K()) - ((int) this.f15830e0)) - C1357a0.m37541i(12.0f)));
        }
        if (this.f15821X != null || this.f15823Z != null) {
            m26386z(i - (m26418L() + m26419K()));
        }
    }

    public void m26403a0(TdApi.Audio audio, TdApi.Message message, C9773p0.AbstractC9776c cVar) {
        this.f15827c = audio;
        String m2 = C4779t2.m25472m2(audio);
        this.f15821X = m2;
        this.f15822Y = RunnableC5390g.m22983M0(m2);
        m26414P();
        boolean z = audio.albumCoverThumbnail != null && (C4183a.f14104v || this.f15831f0.m25993Z3().viaBotUserId == 0);
        this.f15817T = z;
        if (z) {
            if (audio.albumCoverMinithumbnail != null) {
                C6250i iVar = new C6250i(audio.albumCoverMinithumbnail);
                this.f15818U = iVar;
                iVar.m20897s0(2);
                this.f15818U.m20930Z(true);
            } else {
                this.f15818U = null;
            }
            C6246h D5 = C4779t2.m25704D5(this.f15831f0.mo4348c(), audio.albumCoverThumbnail);
            this.f15819V = D5;
            if (D5 != null) {
                D5.m20930Z(true);
                this.f15819V.m20897s0(2);
                this.f15819V.m20909k0();
            }
            if (C4779t2.m25598T2(audio.audio)) {
                m26425D();
            }
        }
        C6883g1 g1Var = new C6883g1(this.f15831f0.mo4347s(), this.f15831f0.mo4348c(), 16, this.f15819V != null, this.f15831f0.m26145K2(), this.f15831f0.m26115N3());
        this.f15811N = g1Var;
        g1Var.m18634d0(this.f15831f0);
        this.f15811N.m18669H0(this);
        if (this.f15817T) {
            this.f15811N.m18638b0(1140850688);
        } else {
            this.f15811N.m18636c0(this.f15831f0.m25918h6() ? R.id.theme_color_bubbleOut_file : R.id.theme_color_file);
        }
        C6883g1 g1Var2 = this.f15811N;
        if (message == null) {
            message = C4779t2.m25705D4(audio);
        }
        g1Var2.m18679C0(message, cVar);
        AbstractC4345j jVar = this.f15833h0;
        if (jVar != null) {
            this.f15811N.m18659M0(jVar);
        }
    }

    @Override
    public void mo15929b(TdApi.File file, int i) {
        if (m26406X()) {
            m26399e0(m26388x());
        }
    }

    public void m26402b0() {
        this.f15841p0 = true;
    }

    @Override
    public <T extends View & AbstractC5143t> void mo25245c(T t, Canvas canvas, int i, int i2, AbstractC6264v vVar, AbstractC6264v vVar2, int i3, int i4, float f, float f2) {
        int i5;
        int i6;
        float f3;
        this.f15842q0 = i;
        this.f15843r0 = i2;
        int L = m26418L();
        int i7 = i + L;
        int i8 = i2 + L;
        vVar.mo20256K0(i, i2, i7, i8);
        float f4 = 1.0f;
        int i9 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i9 != 0) {
            canvas.save();
            float f5 = 1.0f - (0.1f * f2);
            canvas.scale(f5, f5, vVar.mo20257I0(), vVar.mo20227y0());
        }
        if (this.f15817T) {
            vVar.mo20250U(vVar.getAlpha() * f);
            vVar2.mo20250U(vVar2.getAlpha() * f);
            i5 = i8;
            i6 = i7;
            C1359b.m37498u(canvas, vVar, vVar2, true, true, i, i2, i7, i5);
            vVar2.mo20253P();
            vVar.mo20253P();
        } else {
            i5 = i8;
            i6 = i7;
        }
        this.f15811N.m18671G0(f);
        this.f15811N.m18630f0(i, i2, i6, i5);
        this.f15811N.m18615n(t, canvas);
        if (i9 != 0) {
            canvas.restore();
        }
        int i10 = i6;
        C1359b.m37493z(canvas, vVar, f2, i4);
        if (this.f15826b0 == null) {
            int K = i10 + m26419K();
            RunnableC5390g gVar = this.f15828c0;
            if (gVar != null) {
                gVar.m22899v(canvas, K, K + gVar.getWidth(), 0, i2 + C1357a0.m37541i(8.0f), null, f);
            }
            RunnableC5390g gVar2 = this.f15829d0;
            if (gVar2 != null) {
                gVar2.m22899v(canvas, K, K + gVar2.getWidth(), 0, i2 + C1357a0.m37541i(29.0f), null, f);
                return;
            }
            return;
        }
        if (this.f15831f0.m26145K2() == 0) {
            f3 = 0.68f;
        } else if (!this.f15813P) {
            if (this.f15831f0.m26083Q5()) {
                f4 = 0.0f;
            }
            f3 = f4;
        } else if (this.f15838m0 == -1.0f || (!this.f15840o0 && (this.f15839n0 == 0 || SystemClock.uptimeMillis() - this.f15839n0 >= 100))) {
            long j = this.f15814Q;
            if (j > 0) {
                long j2 = this.f15815R;
                if (j2 > 0) {
                    f3 = (float) (j2 / j);
                }
            }
            f3 = 0.0f;
        } else {
            f3 = this.f15838m0;
        }
        int i11 = (C1357a0.m37541i(25.0f) * 2) + i + m26419K();
        int i12 = C1357a0.m37541i(25.0f) + i2;
        this.f15826b0.m7972f(canvas, f3, i11, i12);
        boolean h6 = this.f15831f0.m25918h6();
        if (this.f15832g0 != 0.0f) {
            int i13 = C1357a0.m37541i(25.0f);
            C1357a0.m37541i(2.0f);
            double radians = Math.toRadians(45.0d);
            double d = i13;
            float i14 = C1357a0.m37541i(25.0f) + i + ((float) (d * Math.sin(radians))) + C1357a0.m37541i(22.0f);
            float cos = i12 + ((float) (d * Math.cos(radians)));
            float f6 = this.f15832g0;
            canvas.drawCircle(i14, cos, C1357a0.m37541i(3.0f) * f6, C1410y.m37039g(C5064d.m24131a(f6, C11524j.m228N(h6 ? R.id.theme_color_bubbleOut_waveformActive : R.id.theme_color_waveformActive))));
        }
        if (this.f15829d0 != null) {
            int K2 = i10 + m26419K() + this.f15826b0.m7969i() + C1357a0.m37541i(12.0f);
            RunnableC5390g gVar3 = this.f15829d0;
            gVar3.m22899v(canvas, K2, K2 + gVar3.getWidth(), 0, i2 + C1357a0.m37541i(18.0f), null, f);
        }
    }

    public void m26401c0(TdApi.Document document) {
        this.f15825b = document;
        String str = document.fileName;
        this.f15821X = str;
        if (str == null || str.length() == 0) {
            this.f15821X = m26416N(document.mimeType);
        }
        this.f15822Y = RunnableC5390g.m22983M0(this.f15821X);
        m26414P();
        if (document.thumbnail == null && this.f15831f0.m25851o6() && C1369e0.m37396c(C7389v0.m16555z2(document.document.local.path))) {
            this.f15817T = true;
            C6250i iVar = new C6250i(document.document.local.path);
            this.f15819V = iVar;
            iVar.m20900p0();
            this.f15819V.m20930Z(true);
            this.f15819V.mo20767t0(C1357a0.m37540j(80.0f, 3.0f));
            this.f15819V.m20897s0(2);
        } else if (document.thumbnail != null) {
            this.f15817T = true;
            if (document.minithumbnail != null) {
                C6250i iVar2 = new C6250i(document.minithumbnail);
                this.f15818U = iVar2;
                iVar2.m20897s0(2);
                this.f15818U.m20930Z(true);
            } else {
                this.f15818U = null;
            }
            C6246h D5 = C4779t2.m25704D5(this.f15831f0.mo4348c(), document.thumbnail);
            this.f15819V = D5;
            if (D5 != null) {
                D5.m20930Z(true);
                this.f15819V.mo20767t0(C1357a0.m37540j(80.0f, 3.0f));
                this.f15819V.m20897s0(2);
                this.f15819V.m20909k0();
            }
            if (C1369e0.m37396c(document.mimeType)) {
                m26425D();
            }
        }
        C6883g1 g1Var = new C6883g1(this.f15831f0.mo4347s(), this.f15831f0.mo4348c(), 8, this.f15817T && C1369e0.m37396c(document.mimeType), this.f15831f0.m26145K2(), this.f15831f0.m26115N3());
        this.f15811N = g1Var;
        g1Var.m18634d0(this.f15831f0);
        this.f15811N.m18669H0(this);
        if (this.f15817T) {
            this.f15811N.m18638b0(1140850688);
        } else {
            this.f15811N.m18620k0(document);
            this.f15811N.m18636c0(C4779t2.m25466n1(document, this.f15831f0.m25918h6()));
        }
        this.f15811N.m18614n0(document.document, this.f15831f0.m25993Z3());
        AbstractC4345j jVar = this.f15833h0;
        if (jVar != null) {
            this.f15811N.m18659M0(jVar);
        }
    }

    @Override
    public int mo25244d(int i) {
        return this.f15817T ? m26418L() / 2 : i;
    }

    public final void m26400d0(boolean z) {
        if (this.f15813P != z) {
            this.f15813P = z;
            if (!z) {
                m26422H();
            }
            m26399e0(m26388x());
            this.f15831f0.m25791u5();
        }
    }

    @Override
    public boolean mo15925e(C6883g1 g1Var, View view, TdApi.File file, long j) {
        if (this.f15825b == null) {
            return false;
        }
        this.f15831f0.mo4348c().m2485dd().m3778M7(this.f15831f0.m26096P0(), this.f15825b, new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                C4707n.this.m26409U((HandlerC10770jj.C10781k) obj);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                C4707n.this.m26404Z();
            }
        });
        return true;
    }

    public final boolean m26399e0(String str) {
        String y = m26387y(str, false);
        if (C5070i.m24067c(this.f15823Z, str) && C5070i.m24067c(this.f15824a0, y)) {
            return false;
        }
        this.f15823Z = str;
        this.f15824a0 = y;
        m26407W();
        this.f15831f0.m25791u5();
        return true;
    }

    @Override
    public void mo15923f(TdApi.File file, float f) {
        if (m26406X()) {
            m26399e0(m26388x());
        }
    }

    public void m26398f0(TdApi.VoiceNote voiceNote, TdApi.Message message, C9773p0.AbstractC9776c cVar) {
        this.f15810M = voiceNote;
        m26414P();
        this.f15826b0 = new C9626o4(voiceNote.waveform, 0, this.f15831f0.m25918h6());
        this.f15832g0 = (message != this.f15831f0.m25993Z3() || this.f15831f0.m26083Q5()) ? 0.0f : 1.0f;
        C6883g1 g1Var = new C6883g1(this.f15831f0.mo4347s(), this.f15831f0.mo4348c(), 2, false, this.f15831f0.m26145K2(), this.f15831f0.m26115N3());
        this.f15811N = g1Var;
        g1Var.m18634d0(this.f15831f0);
        this.f15811N.m18669H0(this);
        this.f15811N.m18636c0(this.f15831f0.m25918h6() ? R.id.theme_color_bubbleOut_file : R.id.theme_color_file);
        this.f15811N.m18677D0(message != null ? message : C4779t2.m25698E4(voiceNote), cVar, this);
        AbstractC4345j jVar = this.f15833h0;
        if (jVar != null) {
            this.f15811N.m18659M0(jVar);
        }
        if (this.f15831f0.m26145K2() == 0) {
            this.f15811N.m18626h0(2, false);
            this.f15811N.m18624i0(R.drawable.baseline_pause_24);
        }
    }

    @Override
    public TdApi.File mo25243g() {
        return mo25242h().m18603t();
    }

    public final void m26397g0(int i) {
        this.f15829d0 = !C5070i.m24061i(this.f15823Z) ? new RunnableC5390g.C5392b(this.f15823Z, i, C1410y.m37038g0(), this.f15831f0.m25844p3()).m22868v().m22884f() : null;
        if (!C5070i.m24061i(this.f15824a0)) {
            this.f15830e0 = Math.max(Math.max(this.f15830e0, m26417M()), new RunnableC5390g.C5392b(this.f15824a0, i, C1410y.m37038g0(), this.f15831f0.m25844p3()).m22868v().m22884f().getWidth());
        } else {
            this.f15830e0 = Math.max(this.f15830e0, m26417M());
        }
    }

    @Override
    public void mo1989g1(int i, boolean z, boolean z2) {
    }

    @Override
    public C6883g1 mo25242h() {
        return this.f15811N;
    }

    @Override
    public int mo25241i() {
        return m26421I();
    }

    @Override
    public int mo25240j() {
        C9626o4 o4Var;
        int i;
        float f;
        float f2;
        int L = m26418L() + m26419K();
        if (this.f15826b0 != null) {
            f2 = L;
            f = o4Var.m7969i() + this.f15830e0;
            i = C1357a0.m37541i(12.0f);
        } else {
            f2 = L;
            f = Math.max(m26415O(), this.f15830e0);
            i = C1357a0.m37541i(6.0f);
        }
        return (int) (f2 + f + i);
    }

    @Override
    public boolean mo25239k(View view, MotionEvent motionEvent) {
        int i = this.f15842q0;
        int i2 = this.f15843r0;
        if (this.f15811N.m18652Q(view, motionEvent)) {
            return true;
        }
        if (this.f15841p0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        if (!this.f15835j0 && this.f15836k0 == null) {
                            return false;
                        }
                        m26422H();
                        m26426A();
                    }
                } else if (!this.f15835j0 && this.f15836k0 == null) {
                    return false;
                } else {
                    if (this.f15826b0 != null) {
                        if (this.f15836k0 != null && !this.f15840o0 && Math.abs(this.f15837l0 - x) >= C1357a0.m37534p()) {
                            this.f15840o0 = true;
                            this.f15837l0 = x;
                        }
                        if (this.f15840o0) {
                            int i3 = i + (C1357a0.m37541i(25.0f) * 2) + m26419K();
                            float i4 = this.f15826b0.m7969i();
                            float d = C5069h.m24089d((x - i3) / i4);
                            float f = this.f15838m0;
                            boolean z = f == -1.0f || ((int) (i4 * d)) != ((int) (i4 * f));
                            this.f15838m0 = d;
                            if (z) {
                                this.f15831f0.m25791u5();
                            }
                        }
                        return this.f15836k0 != null;
                    }
                }
            } else if (!this.f15835j0 && this.f15836k0 == null) {
                return false;
            } else {
                if (this.f15840o0 && this.f15838m0 != -1.0f && this.f15813P && this.f15814Q > 0) {
                    this.f15839n0 = SystemClock.uptimeMillis();
                    C9726c Y = C10536ab.m4667o1().m4729Y();
                    long j = this.f15814Q;
                    Y.m7382v0((long) (j * this.f15838m0), j);
                }
                m26422H();
                if (this.f15835j0 && this.f15811N.m18647U(view)) {
                    this.f15831f0.m25889k8();
                }
                m26426A();
            }
            return this.f15835j0 || this.f15836k0 != null;
        }
        m26426A();
        if (this.f15826b0 != null && this.f15813P && this.f15814Q > 0 && this.f15815R >= 0) {
            int i5 = C1357a0.m37541i(25.0f);
            int K = (i5 * 2) + i + m26419K();
            int i6 = i2 + i5;
            if (y >= i6 - i5 && y <= i6 + i5 && x >= K && x <= K + this.f15826b0.m7969i()) {
                this.f15837l0 = i;
                ViewParent parent = view.getParent();
                this.f15836k0 = parent;
                if (parent == null) {
                    return false;
                }
                parent.requestDisallowInterceptTouchEvent(true);
                return true;
            }
        }
        if (this.f15821X == null && this.f15823Z == null) {
            return false;
        }
        float y2 = this.f15811N.m18593y() * 1.6f;
        float y3 = i2 + this.f15811N.m18593y();
        if (x >= (this.f15811N.m18593y() + i) - y2 && x <= i + m26418L() + m26419K() + Math.max(m26415O(), this.f15830e0) + y2 && y >= y3 - y2 && y <= y3 + y2) {
            this.f15835j0 = true;
        }
        return this.f15835j0;
    }

    @Override
    public void mo25238l(C6257p pVar) {
        TdApi.Audio audio;
        if (this.f15817T) {
            TdApi.Document document = this.f15825b;
            if ((document == null || !C4779t2.m25598T2(document.document) || !C1369e0.m37396c(this.f15825b.mimeType)) && ((audio = this.f15827c) == null || !C4779t2.m25598T2(audio.audio))) {
                pVar.m20819G(null);
            } else {
                pVar.m20819G(m26425D());
            }
        } else {
            pVar.m20819G(null);
        }
    }

    @Override
    public void mo25237m(C6240c cVar) {
        if (this.f15817T) {
            cVar.m20977j(this.f15818U, this.f15819V);
        } else {
            cVar.clear();
        }
    }

    @Override
    public void mo25236n(AbstractC4345j jVar) {
        this.f15833h0 = jVar;
        this.f15811N.m18659M0(jVar);
    }

    public final String m26391u(TdApi.File file, boolean z) {
        C6883g1 g1Var = this.f15811N;
        return m26389w(file, z, g1Var != null && g1Var.m18670H(), this.f15831f0.mo26066S0());
    }

    public final String m26388x() {
        return m26387y(null, false);
    }

    public final String m26387y(String str, boolean z) {
        TdApi.File file;
        String str2 = null;
        if (str != null) {
            TdApi.Document document = this.f15825b;
            if (document != null) {
                file = document.document;
            } else {
                TdApi.Audio audio = this.f15827c;
                file = audio != null ? audio.audio : null;
            }
            String u = m26391u(file, true);
            if (u == null || u.equals(str)) {
                return null;
            }
            return u;
        }
        TdApi.Document document2 = this.f15825b;
        if (document2 != null) {
            TdApi.File file2 = document2.document;
            if (file2.remote.isUploadingActive && file2.expectedSize == 0) {
                return C4403w.m27869i1(R.string.ProcessingFile);
            }
            String u2 = m26391u(file2, false);
            if (u2 != null) {
                return u2;
            }
            if (!C5070i.m24061i(this.f15825b.fileName)) {
                str2 = C7389v0.m16573v0(this.f15825b.fileName);
            }
            if (C5070i.m24061i(str2) && !C5070i.m24061i(this.f15825b.mimeType)) {
                str2 = C1369e0.m37398a(this.f15825b.mimeType);
            }
            if ("tgx-theme".equalsIgnoreCase(str2)) {
                if (z && !C5070i.m24061i(this.f15821X) && this.f15821X.toLowerCase().endsWith(".tgx-theme")) {
                    String str3 = this.f15821X;
                    this.f15821X = str3.substring(0, (str3.length() - 1) - 9);
                }
                return C4403w.m27865j1(R.string.ThemeFile, C1363c0.m37423m(file2.expectedSize));
            } else if (C5070i.m24061i(str2) || str2.length() > 7) {
                return C1363c0.m37423m(file2.expectedSize);
            } else {
                String upperCase = str2.toUpperCase();
                if (z && !C5070i.m24061i(this.f15821X)) {
                    String upperCase2 = this.f15821X.toUpperCase();
                    if (upperCase2.endsWith("." + upperCase)) {
                        String str4 = this.f15821X;
                        this.f15821X = str4.substring(0, (str4.length() - 1) - upperCase.length());
                    }
                }
                return C4403w.m27865j1(R.string.format_fileSizeAndExtension, C1363c0.m37423m(file2.expectedSize), upperCase);
            }
        } else {
            TdApi.VoiceNote voiceNote = this.f15810M;
            if (voiceNote == null) {
                TdApi.Audio audio2 = this.f15827c;
                if (audio2 == null) {
                    return null;
                }
                String u3 = m26391u(audio2.audio, false);
                return u3 != null ? u3 : C4779t2.m25521f2(this.f15827c);
            } else if (this.f15813P) {
                return C1363c0.m37433h(this.f15816S);
            } else {
                return C1363c0.m37433h(voiceNote.duration);
            }
        }
    }

    public final void m26386z(int i) {
        RunnableC5390g gVar;
        String str = this.f15821X;
        if (str != null) {
            gVar = new RunnableC5390g.C5392b(str, i, C1410y.m37018q0(), this.f15831f0.m26134L4()).m22865y(this.f15825b != null ? Log.TAG_VOICE : 0).m22868v().m22888b().m22884f();
        } else {
            gVar = null;
        }
        this.f15828c0 = gVar;
        float f = this.f15830e0;
        m26397g0(i);
        if (this.f15830e0 != f && f != 0.0f) {
            this.f15831f0.m25997Z(false);
        }
    }

    @Override
    public void mo6972z1(C10930q6 q6Var, long j, long j2, int i, int i2) {
        m26400d0(i2 == 3 || i2 == 2);
    }

    public C4707n(AbstractC4761s4 s4Var, TdApi.Audio audio, TdApi.Message message, C9773p0.AbstractC9776c cVar) {
        this.f15831f0 = s4Var;
        m26403a0(audio, message, cVar);
    }

    public C4707n(AbstractC4761s4 s4Var, TdApi.VoiceNote voiceNote, TdApi.Message message, C9773p0.AbstractC9776c cVar) {
        this.f15831f0 = s4Var;
        m26398f0(voiceNote, message, cVar);
    }
}
