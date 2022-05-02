package gd;

import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import be.C1359b;
import be.C1363c0;
import be.C1379j0;
import be.C1410y;
import ge.C4868i;
import me.C6883g1;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3940f;
import p051db.C3950k;
import p051db.C3953l;
import p080fb.AbstractC4345j;
import p082fd.C4403w;
import p108hb.C5070i;
import p156kd.AbstractC6264v;
import p156kd.C6240c;
import p156kd.C6246h;
import p156kd.C6250i;
import p156kd.C6257p;
import p156kd.C6261s;
import p168ld.C6503j;
import p168ld.RunnableC6507m;
import p193nb.C7321e;
import p194nd.C7462l1;
import p194nd.View$OnClickListenerC7430j1;
import p256s0.C8614h;
import p350yd.C10930q6;
import p364zd.C11524j;

public class C4630f0 implements C6883g1.AbstractC6886c, C6883g1.AbstractC6885b {
    public int f15371M;
    public int f15372N;
    public int f15373O;
    public int f15374P;
    public final C10930q6 f15375Q;
    public TdApi.Photo f15376R;
    public boolean f15377S;
    public TdApi.PhotoSize f15378T;
    public TdApi.PhotoSize f15379U;
    public TdApi.Animation f15380V;
    public TdApi.Video f15381W;
    public TdApi.File f15382X;
    public C6246h f15383Y;
    public C6503j f15384Z;
    public int f15385a;
    public C6246h f15386a0;
    public int f15387b;
    public C6246h f15388b0;
    public int f15389c;
    public int f15390c0;
    public int f15391d0;
    public Path f15392e0;
    public final C6883g1 f15393f0;
    public long f15394g0;
    public AbstractC4761s4 f15395h0;
    public AbstractC4631a f15396i0;
    public final boolean f15397j0;
    public boolean f15398k0;
    public final C3940f f15399l0;
    public C3950k f15400m0;
    public int f15401n0;
    public C4658i f15402o0;
    public Drawable f15403p0;
    public C7462l1 f15404q0;
    public boolean f15405r0;
    public String f15406s0;
    public String f15407t0;
    public int f15408u0;
    public int f15409v0;
    public int f15410w0;
    public String f15411x0;
    public C6240c f15412y0;
    public AbstractC6264v f15413z0;

    public interface AbstractC4631a {
        boolean mo26549k(View view, C4630f0 f0Var);
    }

    public C4630f0(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.Photo photo, long j, long j2, AbstractC4761s4 s4Var, boolean z) {
        this(aVar, q6Var, photo, j, j2, s4Var, z, false);
    }

    public static int m26777H(TdApi.Photo photo, TdApi.PhotoSize photoSize) {
        if (photoSize != null) {
            return photoSize.height;
        }
        TdApi.PhotoSize A0 = C7321e.m17018A0(photo);
        if (A0 != null) {
            return A0.height;
        }
        return 0;
    }

    public static int m26763T(TdApi.Photo photo, TdApi.PhotoSize photoSize) {
        if (photoSize != null) {
            return photoSize.width;
        }
        TdApi.PhotoSize A0 = C7321e.m17018A0(photo);
        if (A0 != null) {
            return A0.width;
        }
        return 0;
    }

    public static boolean m26758Y(TdApi.File file, TdApi.File file2) {
        TdApi.LocalFile localFile;
        TdApi.LocalFile localFile2;
        return (file == null && file2 == null) || !(file == null || file2 == null || (file.f25373id != file2.f25373id && ((localFile = file.local) == null || (localFile2 = file2.local) == null || !C5070i.m24067c(localFile.path, localFile2.path) || C5070i.m24061i(file.local.path))));
    }

    public void m26756a0(TdApi.InlineQueryResultPhoto inlineQueryResultPhoto) {
        if (!this.f15405r0) {
            m26721t0(0L, inlineQueryResultPhoto.photo, false);
            this.f15393f0.m18678D();
            this.f15393f0.m18617m();
        }
    }

    public void m26755b0(String str, String str2, TdApi.Object object) {
        if (object.getConstructor() == 1000709656 && !this.f15405r0) {
            TdApi.InlineQueryResults inlineQueryResults = (TdApi.InlineQueryResults) object;
            if (inlineQueryResults.results.length > 0) {
                double random = Math.random();
                TdApi.InlineQueryResult[] inlineQueryResultArr = inlineQueryResults.results;
                TdApi.InlineQueryResult inlineQueryResult = inlineQueryResultArr[(int) (random * (inlineQueryResultArr.length - 1))];
                if (inlineQueryResult.getConstructor() == 1848319440) {
                    final TdApi.InlineQueryResultPhoto inlineQueryResultPhoto = (TdApi.InlineQueryResultPhoto) inlineQueryResult;
                    this.f15375Q.m2485dd().post(new Runnable() {
                        @Override
                        public final void run() {
                            C4630f0.this.m26756a0(inlineQueryResultPhoto);
                        }
                    });
                }
            } else if (!C5070i.m24067c(str, "pic")) {
                m26768O("pic", str2);
            }
        }
    }

    public void m26753c0(final String str, final String str2, TdApi.Object object) {
        if (object.getConstructor() == -1601123095 && !this.f15405r0) {
            TdApi.Chat ia = this.f15375Q.m2408ia(object);
            this.f15375Q.m2270r4().m14783o(new TdApi.GetInlineQueryResults(C4779t2.m25458o2(ia.type), ia.f25367id, null, str, null), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object2) {
                    C4630f0.this.m26755b0(str2, str, object2);
                }
            });
        }
    }

    public void m26751d0(int i, float f, float f2, C3950k kVar) {
        AbstractC4761s4 s4Var = this.f15395h0;
        if (s4Var != null) {
            s4Var.m25828q8();
        }
    }

    public static boolean m26744i(C6246h hVar, int i, int i2) {
        if (hVar == null || Math.max(i, i2) <= 1024) {
            return false;
        }
        hVar.mo20767t0(Log.TAG_CAMERA);
        return true;
    }

    public static boolean m26742j(C6246h hVar, TdApi.PhotoSize photoSize) {
        return m26744i(hVar, photoSize.width, photoSize.height);
    }

    public static TdApi.PhotoSize m26741j0(C10930q6 q6Var, TdApi.PhotoSize[] photoSizeArr, long j) {
        TdApi.PhotoSize m = m26736m(photoSizeArr);
        TdApi.PhotoSize p = m26730p(photoSizeArr, m);
        return (p == null || (!C4779t2.m25598T2(p.photo) && !q6Var.m2413i5().m3985k(p.photo, 1, q6Var.m2556Z3(j)))) ? m : p;
    }

    public static TdApi.PhotoSize m26738l(TdApi.Photo photo) {
        if (photo != null) {
            return m26736m(photo.sizes);
        }
        return null;
    }

    public static TdApi.PhotoSize m26736m(TdApi.PhotoSize[] photoSizeArr) {
        TdApi.PhotoSize r0 = C4779t2.m25439r0(photoSizeArr, "t");
        if (r0 != null) {
            TdApi.File file = r0.photo;
            if (file.local.canBeDownloaded || C4779t2.m25586V2(file)) {
                return r0;
            }
        }
        TdApi.PhotoSize photoSize = null;
        boolean z = false;
        for (TdApi.PhotoSize photoSize2 : photoSizeArr) {
            if (photoSize == null || Math.max(photoSize2.width, photoSize2.height) < Math.max(photoSize.width, photoSize.height)) {
                photoSize = photoSize2;
            } else if (!z && photoSize.photo.f25373id != photoSize2.photo.f25373id) {
                z = true;
            }
        }
        if (!z || Math.max(photoSize.width, photoSize.height) > 90) {
            return null;
        }
        return photoSize;
    }

    public static TdApi.PhotoSize m26734n(TdApi.Photo photo) {
        return m26730p(photo.sizes, m26736m(photo.sizes));
    }

    public static TdApi.PhotoSize m26732o(TdApi.Photo photo, TdApi.PhotoSize photoSize) {
        if (photo != null) {
            return m26730p(photo.sizes, photoSize);
        }
        return null;
    }

    public static TdApi.PhotoSize m26730p(TdApi.PhotoSize[] photoSizeArr, TdApi.PhotoSize photoSize) {
        TdApi.PhotoSize photoSize2 = null;
        if (photoSizeArr == null) {
            return null;
        }
        int i = 0;
        if (photoSizeArr.length != 1) {
            TdApi.PhotoSize r0 = C4779t2.m25439r0(photoSizeArr, "i");
            if (r0 != null) {
                TdApi.File file = r0.photo;
                if ((file.local.canBeDownloaded || C4779t2.m25586V2(file)) && (photoSize == null || photoSize.photo.f25373id != r0.photo.f25373id)) {
                    return r0;
                }
            }
            for (TdApi.PhotoSize photoSize3 : photoSizeArr) {
                if ((photoSize == null || photoSize3.photo.f25373id != photoSize.photo.f25373id) && ((photoSize2 == null || Math.max(photoSize2.width, photoSize2.height) <= Math.max(photoSize3.width, photoSize3.height)) && C4779t2.m25586V2(photoSize3.photo))) {
                    photoSize2 = photoSize3;
                }
            }
            if (!(photoSize2 == null || C7321e.m17002I0(photoSizeArr).photo.f25373id == photoSize2.photo.f25373id)) {
                return photoSize2;
            }
            int u3 = AbstractC4761s4.m25793u3();
            int i2 = (int) (u3 * 1.7f);
            if (photoSize != null) {
                i = photoSize.photo.f25373id;
            }
            return C4779t2.m25446q0(photoSizeArr, u3, i2, i, "i");
        } else if (photoSize == null || photoSize.photo.f25373id != photoSizeArr[0].photo.f25373id) {
            return photoSizeArr[0];
        } else {
            return null;
        }
    }

    public static C6261s m26728q(C10930q6 q6Var, TdApi.File file) {
        int u3 = AbstractC4761s4.m25793u3();
        C6261s sVar = new C6261s(q6Var, file);
        sVar.m20770J0(u3, (int) (u3 * 1.7f));
        sVar.m20772H0(0L);
        return sVar;
    }

    public static int m26722t() {
        return C1357a0.m37541i(20.0f);
    }

    public static int m26720u() {
        return C1357a0.m37541i(19.0f);
    }

    public int m26791A() {
        return this.f15387b;
    }

    public void m26790A0(AbstractC4345j jVar) {
        this.f15393f0.m18659M0(jVar);
    }

    public int m26789B() {
        return this.f15373O;
    }

    public final boolean m26788B0() {
        C6883g1 g1Var;
        return this.f15383Y != null && C4779t2.m25598T2(this.f15382X) && ((g1Var = this.f15393f0) == null || g1Var.m18676E()) && !m26761V();
    }

    public int m26787C() {
        return (this.f15385a + this.f15371M) >> 1;
    }

    public boolean m26786C0() {
        return true;
    }

    public int m26785D() {
        return (this.f15387b + this.f15372N) >> 1;
    }

    public final void m26784D0() {
        String str;
        int i;
        int i2 = (this.f15373O - (C1357a0.m37541i(8.0f) * 2)) - (C1357a0.m37541i(18.0f) * 2);
        if (i2 > 0) {
            int i3 = this.f15408u0;
            if (i3 > i2 || this.f15409v0 > i2) {
                this.f15411x0 = this.f15406s0;
                this.f15410w0 = i3;
                if (i3 > i2 && (str = this.f15407t0) != null && (i = this.f15409v0) < i2) {
                    this.f15411x0 = str;
                    this.f15410w0 = i;
                } else if (this.f15407t0 == null || this.f15409v0 > i2) {
                    this.f15411x0 = null;
                    this.f15410w0 = 0;
                }
                this.f15406s0 = null;
                this.f15407t0 = null;
            }
        }
    }

    public int m26783E() {
        return this.f15391d0;
    }

    public final void m26782E0() {
        int i;
        int i2 = this.f15373O - (C1357a0.m37541i(4.0f) * 3);
        this.f15411x0 = null;
        this.f15410w0 = 0;
        if (i2 > 0) {
            int i3 = this.f15408u0;
            if (i3 > i2) {
                String str = this.f15407t0;
                if (str != null && (i = this.f15409v0) <= i2) {
                    this.f15411x0 = str;
                    this.f15410w0 = i;
                    return;
                }
                return;
            }
            this.f15411x0 = this.f15406s0;
            this.f15410w0 = i3;
        }
    }

    public int m26781F() {
        return this.f15390c0;
    }

    public final boolean m26780F0() {
        boolean z;
        String str;
        String str2;
        String str3;
        TdApi.Video video;
        String str4;
        int x;
        int A;
        AbstractC4761s4 s4Var;
        if (this.f15381W == null && this.f15380V == null) {
            return false;
        }
        String str5 = null;
        String str6 = "";
        if (this.f15393f0.m18674F()) {
            str = C4403w.m27869i1(R.string.failed);
            str2 = str;
            z = false;
        } else if ((this.f15393f0.m18664K() || ((s4Var = this.f15395h0) != null && !s4Var.m25851o6())) && this.f15393f0.m18672G()) {
            str2 = str6;
            z = false;
            str = null;
        } else {
            String m = C1363c0.m37423m(this.f15393f0.m18684A());
            if (this.f15393f0.m18670H() || !this.f15393f0.m18664K()) {
                if (this.f15393f0.m18668I()) {
                    str6 = C4403w.m27865j1(R.string.ProcessingMedia, m);
                } else {
                    if (this.f15393f0.m18595x() <= this.f15393f0.m18684A()) {
                        str6 = C4403w.m27865j1(R.string.format_uploadStatus, Integer.valueOf((int) Math.floor((x / A) * 100.0f)), m);
                    } else {
                        str6 = C1363c0.m37423m(x) + " / " + m;
                    }
                }
            }
            z = true;
            str2 = str6;
            str = m;
        }
        if (C5070i.m24061i(str) || !C5070i.m24061i(str2)) {
            str3 = str;
            str = str2;
        } else {
            str3 = null;
        }
        if (this.f15381W != null) {
            str3 = C1363c0.m37433h(video.duration);
            if (z) {
                str4 = str3;
                str5 = str;
            } else {
                str4 = null;
            }
            if (!str.isEmpty()) {
                str = str + ", " + str3;
            } else if (this.f15393f0.m18662L()) {
                str5 = C1363c0.m37423m(this.f15393f0.m18684A());
                str4 = str3;
                str = str5;
            } else {
                str = str3;
            }
        } else {
            str4 = null;
        }
        if (str5 != null && (!C5070i.m24067c(this.f15406s0, str5) || !C5070i.m24067c(this.f15407t0, str4))) {
            this.f15406s0 = str5;
            this.f15407t0 = str4;
            TextPaint b0 = C1410y.m37048b0(13.0f);
            this.f15408u0 = (int) C7389v0.m16680T1(str5, b0);
            int T1 = (int) C7389v0.m16680T1(str4, b0);
            this.f15409v0 = T1;
            this.f15410w0 = Math.max(this.f15408u0, T1);
            this.f15411x0 = this.f15406s0;
            m26784D0();
            return true;
        } else if (str5 != null || C5070i.m24067c(this.f15406s0, str)) {
            return false;
        } else {
            this.f15406s0 = str;
            this.f15407t0 = str3;
            TextPaint G0 = C1410y.m37071G0(13.0f, false, true);
            this.f15408u0 = (int) C7389v0.m16680T1(str, G0);
            this.f15409v0 = (int) C7389v0.m16680T1(str3, G0);
            m26782E0();
            return true;
        }
    }

    public C6883g1 m26779G() {
        return this.f15393f0;
    }

    public void m26778G0(long j, long j2, boolean z) {
        if (this.f15394g0 == j) {
            this.f15394g0 = j2;
        }
        m26779G().m18653P0(j, j2, z);
        m26780F0();
    }

    public boolean m26776H0(long j, TdApi.MessagePhoto messagePhoto) {
        if (this.f15394g0 != j) {
            return false;
        }
        m26721t0(j, messagePhoto.photo, this.f15377S);
        return true;
    }

    public C7462l1 m26775I(View view, int i, int i2, int i3) {
        if (this.f15404q0 == null) {
            C7462l1 l1Var = new C7462l1();
            this.f15404q0 = l1Var;
            l1Var.m15986n();
        }
        int i4 = C1357a0.m37541i(C11524j.m238I());
        int i5 = m26774I0() ? (int) (C1357a0.m37541i(C11524j.m240H()) / 1.5f) : 0;
        C7462l1 l1Var2 = this.f15404q0;
        int i6 = this.f15401n0;
        int i7 = (i6 & 1) != 0 ? i4 : i5;
        int i8 = (i6 & 2) != 0 ? i4 : i5;
        int i9 = (i6 & 8) != 0 ? i4 : i5;
        if ((i6 & 4) == 0) {
            i4 = i5;
        }
        l1Var2.m15983q(i7, i8, i9, i4);
        int i10 = this.f15387b + i;
        int measuredHeight = (view.getMeasuredHeight() - this.f15372N) + i2;
        C7462l1 l1Var3 = this.f15404q0;
        int i11 = this.f15385a;
        int i12 = this.f15387b;
        l1Var3.m15991i(i11, i12 + i3, this.f15373O + i11, i12 + this.f15374P + i3);
        this.f15404q0.m15988l(0, i10 < 0 ? -i10 : 0, 0, measuredHeight < 0 ? -measuredHeight : 0);
        return this.f15404q0;
    }

    public final boolean m26774I0() {
        AbstractC4761s4 s4Var = this.f15395h0;
        return s4Var != null ? s4Var.m26068R9() : this.f15375Q.m2294pc().m4086x0();
    }

    public TdApi.Photo m26773J() {
        return this.f15376R;
    }

    public C6240c m26772K() {
        return this.f15412y0;
    }

    public final int m26771L() {
        return C1357a0.m37541i(m26774I0() ? C11524j.m238I() : C11524j.m208X());
    }

    public int m26770M() {
        TdApi.File file;
        C6883g1 g1Var = this.f15393f0;
        if (g1Var == null || g1Var.m18603t() == null) {
            TdApi.PhotoSize photoSize = this.f15378T;
            if (photoSize == null) {
                return 0;
            }
            file = photoSize.photo;
        } else {
            file = this.f15393f0.m18603t();
        }
        return file.f25373id;
    }

    public long m26769N() {
        return this.f15394g0;
    }

    public final void m26768O(final String str, final String str2) {
        this.f15375Q.m2270r4().m14783o(new TdApi.SearchPublicChat(str), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C4630f0.this.m26753c0(str2, str, object);
            }
        });
    }

    public TdApi.File m26767P() {
        return this.f15382X;
    }

    public C6503j m26766Q() {
        return this.f15384Z;
    }

    public AbstractC6264v m26765R() {
        return this.f15413z0;
    }

    public TdApi.Video m26764S() {
        return this.f15381W;
    }

    public boolean m26762U() {
        return this.f15380V != null;
    }

    public final boolean m26761V() {
        AbstractC4761s4 s4Var;
        return this.f15397j0 && (s4Var = this.f15395h0) != null && s4Var.m25975b6();
    }

    public boolean m26760W() {
        return this.f15402o0 != null;
    }

    public boolean m26759X() {
        return this.f15376R != null;
    }

    public boolean m26757Z() {
        return this.f15381W != null;
    }

    @Override
    public TdApi.File mo18589a(TdApi.File file) {
        TdApi.PhotoSize photoSize;
        if (this.f15383Y == null || (photoSize = this.f15379U) == null || !C5070i.m24067c(photoSize.type, "i") || file.f25373id != this.f15379U.photo.f25373id) {
            return null;
        }
        TdApi.PhotoSize l = m26738l(this.f15376R);
        TdApi.PhotoSize photoSize2 = this.f15378T;
        if (!(photoSize2 == null || l == null || photoSize2.photo.f25373id == l.photo.f25373id)) {
            m26715w0(this.f15376R.minithumbnail, l);
        }
        TdApi.PhotoSize o = m26732o(this.f15376R, l);
        if (o == null || o.photo.f25373id == file.f25373id) {
            return null;
        }
        m26709z0(o);
        return o.photo;
    }

    @Override
    public void mo15929b(TdApi.File file, int i) {
        AbstractC4761s4 s4Var;
        if ((this.f15381W != null || this.f15380V != null) && m26780F0() && (s4Var = this.f15395h0) != null) {
            s4Var.m25828q8();
        }
    }

    @Override
    public boolean mo15925e(C6883g1 g1Var, View view, TdApi.File file, long j) {
        AbstractC4761s4 s4Var;
        C4658i iVar = this.f15402o0;
        if (iVar != null) {
            iVar.m26606f(g1Var.m18627h());
            return true;
        }
        AbstractC4631a aVar = this.f15396i0;
        if ((aVar == null || !aVar.mo26549k(view, this)) && (s4Var = this.f15395h0) != null) {
            if (s4Var instanceof C4714n5) {
                View$OnClickListenerC7430j1.m16189kk((C4714n5) s4Var, j);
            } else if (s4Var instanceof C4656h6) {
                View$OnClickListenerC7430j1.m16181lk((C4656h6) s4Var);
            }
        }
        return true;
    }

    public final void m26750e0(int i, int i2, int i3) {
        Path path;
        this.f15371M = this.f15373O + i;
        this.f15372N = this.f15374P + i2;
        this.f15385a = i;
        this.f15387b = i2;
        this.f15389c = i3;
        if (Build.VERSION.SDK_INT >= 19 && (path = this.f15392e0) != null) {
            path.reset();
            RectF a0 = C1410y.m37050a0();
            a0.set(this.f15385a, this.f15387b, this.f15371M, this.f15372N);
            int i4 = i3 / 2;
            Path path2 = this.f15392e0;
            int i5 = this.f15401n0;
            C1359b.m37518a(path2, a0, (i5 & 1) != 0 ? i4 : 0.0f, (i5 & 2) != 0 ? i4 : 0.0f, (i5 & 8) != 0 ? i4 : 0.0f, (i5 & 4) != 0 ? i4 : 0.0f);
        }
    }

    @Override
    public void mo15923f(TdApi.File file, float f) {
        AbstractC4761s4 s4Var;
        if ((this.f15381W != null || this.f15380V != null) && m26780F0() && (s4Var = this.f15395h0) != null) {
            s4Var.m25828q8();
        }
    }

    public void m26749f0(String str) {
        this.f15393f0.m18626h0(1, false);
        m26768O(this.f15375Q.m2737N5(), str);
    }

    public boolean m26747g0() {
        return this.f15384Z != null;
    }

    public boolean m26745h0(View view, MotionEvent motionEvent) {
        return this.f15393f0.m18652Q(view, motionEvent);
    }

    public boolean m26743i0(View view) {
        return this.f15393f0.m18644X(view);
    }

    public void m26740k(int i, int i2) {
        boolean z = this.f15373O != i;
        if (z || this.f15374P != i2) {
            this.f15373O = i;
            this.f15374P = i2;
            this.f15387b = -1;
            this.f15385a = -1;
            if (z && !C5070i.m24061i(this.f15406s0)) {
                if (!m26757Z() || m26779G().m18672G()) {
                    m26782E0();
                } else {
                    m26784D0();
                }
            }
        }
    }

    public void m26739k0(RunnableC6507m mVar) {
        C6883g1 g1Var;
        mVar.m20231r((this.f15384Z == null || !C4779t2.m25598T2(this.f15382X) || ((g1Var = this.f15393f0) != null && !g1Var.m18676E()) || m26761V()) ? null : this.f15384Z);
    }

    public void m26737l0(C6257p pVar) {
        pVar.m20819G(m26788B0() ? this.f15383Y : null);
    }

    public void m26735m0(C6240c cVar) {
        if (m26786C0()) {
            cVar.m20977j(this.f15386a0, this.f15388b0);
        } else {
            cVar.clear();
        }
    }

    public void m26733n0(boolean z) {
        this.f15398k0 = z;
        this.f15393f0.m18606r0(z);
    }

    public boolean m26731o0(int i) {
        int min = Math.min((int) Log.TAG_CAMERA, i);
        C6246h hVar = this.f15383Y;
        if (hVar == null || hVar.m20886z() == min) {
            return false;
        }
        this.f15383Y.mo20767t0(min);
        return m26788B0();
    }

    public void m26729p0(C4658i iVar, boolean z) {
        if (iVar != null) {
            this.f15402o0 = iVar;
            int a = iVar.m26611a();
            if (a != 0) {
                this.f15403p0 = C8614h.m11919d(C1379j0.m37372B(), a, null);
            }
            this.f15393f0.m18624i0(R.drawable.baseline_play_arrow_36_white);
            this.f15393f0.m18590z0(R.drawable.baseline_play_arrow_36_white);
            this.f15393f0.m18606r0(true);
        }
    }

    public void m26727q0(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            z = (z ? 1 : 0) | true;
        }
        if (z4) {
            boolean z5 = z ? 1 : 0;
            char c = z ? 1 : 0;
            z = z5 | true;
        }
        if (z3) {
            boolean z6 = z ? 1 : 0;
            char c2 = z ? 1 : 0;
            char c3 = z ? 1 : 0;
            z = z6 | true;
        }
        if (this.f15401n0 != z) {
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            this.f15401n0 = i;
            m26750e0(this.f15385a, this.f15387b, this.f15389c);
        }
    }

    public void m26726r() {
        this.f15393f0.m18625i();
        this.f15405r0 = true;
    }

    public void m26725r0() {
        this.f15392e0 = null;
    }

    public <T extends android.view.View & p111he.AbstractC5143t> void m26724s(T r28, android.graphics.Canvas r29, int r30, int r31, p156kd.AbstractC6264v r32, p156kd.AbstractC6264v r33, float r34) {
        throw new UnsupportedOperationException("Method not decompiled: gd.C4630f0.m26724s(android.view.View, android.graphics.Canvas, int, int, kd.v, kd.v, float):void");
    }

    public void m26723s0(AbstractC4631a aVar) {
        this.f15396i0 = aVar;
    }

    public final void m26721t0(long j, TdApi.Photo photo, boolean z) {
        this.f15376R = photo;
        this.f15377S = z;
        TdApi.PhotoSize m = m26736m(photo.sizes);
        TdApi.PhotoSize p = m26730p(photo.sizes, m);
        this.f15390c0 = m26763T(photo, p);
        int H = m26777H(photo, p);
        this.f15391d0 = H;
        if (this.f15390c0 == 0 || H == 0) {
            int i = C1357a0.m37541i(100.0f);
            this.f15391d0 = i;
            this.f15390c0 = i;
        }
        TdApi.PhotoSize photoSize = this.f15378T;
        if (!(photoSize == null || m == null || !m26758Y(photoSize.photo, m.photo))) {
            TdApi.PhotoSize photoSize2 = this.f15378T;
            photoSize2.width = m.width;
            photoSize2.height = m.height;
            m = photoSize2;
        }
        TdApi.PhotoSize photoSize3 = this.f15379U;
        boolean z2 = true;
        boolean z3 = photoSize3 != null;
        if (p == null) {
            z2 = false;
        }
        if ((z2 && z3) && m26758Y(photoSize3.photo, p.photo)) {
            TdApi.PhotoSize photoSize4 = this.f15379U;
            photoSize4.width = p.width;
            photoSize4.height = p.height;
            p = photoSize4;
        }
        m26715w0(photo.minithumbnail, m);
        if (m26709z0(p)) {
            C6883g1 g1Var = this.f15393f0;
            TdApi.Message message = null;
            TdApi.File file = p != null ? p.photo : null;
            AbstractC4761s4 s4Var = this.f15395h0;
            if (s4Var != null) {
                message = s4Var.m25984a4(j);
            }
            g1Var.m18614n0(file, message);
        }
    }

    public final void m26719u0(TdApi.Minithumbnail minithumbnail, TdApi.Thumbnail thumbnail) {
        if (minithumbnail != null) {
            this.f15386a0 = new C6250i(minithumbnail);
        } else {
            this.f15386a0 = null;
        }
        C6246h D5 = C4779t2.m25704D5(this.f15375Q, thumbnail);
        if (D5 != null) {
            D5.m20897s0(2);
            if (this.f15377S) {
                D5.m20889x0();
            }
            if (m26761V()) {
                D5.m20919f0();
                D5.mo20767t0(90);
                D5.m20923d0();
            }
        }
        this.f15388b0 = D5;
    }

    public TdApi.Animation m26718v() {
        return this.f15380V;
    }

    public void m26717v0(C6240c cVar) {
        this.f15412y0 = cVar;
    }

    public int m26716w() {
        return this.f15372N;
    }

    public final void m26715w0(TdApi.Minithumbnail minithumbnail, TdApi.PhotoSize photoSize) {
        TdApi.PhotoSize photoSize2 = this.f15378T;
        TdApi.File file = null;
        TdApi.File file2 = photoSize2 != null ? photoSize2.photo : null;
        if (photoSize != null) {
            file = photoSize.photo;
        }
        if (!m26758Y(file2, file)) {
            this.f15378T = photoSize;
            m26719u0(minithumbnail, C4779t2.m25655K5(photoSize));
        } else if (this.f15386a0 == null && minithumbnail != null) {
            this.f15386a0 = new C6250i(minithumbnail);
        }
    }

    public int m26714x() {
        return this.f15374P;
    }

    public void m26713x0(C3950k kVar) {
        this.f15400m0 = kVar;
    }

    public int m26712y() {
        return this.f15385a;
    }

    public void m26711y0(AbstractC6264v vVar) {
        this.f15413z0 = vVar;
    }

    public int m26710z() {
        return this.f15371M;
    }

    public final boolean m26709z0(TdApi.PhotoSize photoSize) {
        if (m26758Y(this.f15382X, photoSize != null ? photoSize.photo : null)) {
            return false;
        }
        if (photoSize != null) {
            TdApi.File file = photoSize.photo;
            this.f15382X = file;
            C6246h hVar = new C6246h(this.f15375Q, file);
            this.f15383Y = hVar;
            hVar.m20897s0(2);
            this.f15383Y.m20909k0();
            if (this.f15377S) {
                this.f15383Y.m20889x0();
            }
            m26742j(this.f15383Y, photoSize);
            return true;
        }
        this.f15383Y = null;
        return true;
    }

    public C4630f0(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.Photo photo, long j, long j2, AbstractC4761s4 s4Var, boolean z, boolean z2) {
        this(aVar, q6Var, photo, j, j2, s4Var, z, z2, null);
    }

    public C4630f0(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.Photo photo, long j, long j2, AbstractC4761s4 s4Var, boolean z, boolean z2, C4658i iVar) {
        this.f15399l0 = new C3940f(0, new C3950k.AbstractC3952b() {
            @Override
            public final void mo45P5(int i, float f, float f2, C3950k kVar) {
                C4630f0.this.m26751d0(i, f, f2, kVar);
            }

            @Override
            public void mo35Y0(int i, float f, C3950k kVar) {
                C3953l.m29526a(this, i, f, kVar);
            }
        }, C2057b.f7280b, 230L);
        this.f15401n0 = 15;
        this.f15375Q = q6Var;
        this.f15376R = photo;
        this.f15395h0 = s4Var;
        this.f15394g0 = j2;
        this.f15397j0 = z;
        if (Build.VERSION.SDK_INT >= 19) {
            this.f15392e0 = new Path();
        }
        C6883g1 g1Var = new C6883g1(aVar, q6Var, 1, !m26761V(), j, j2);
        this.f15393f0 = g1Var;
        g1Var.m18669H0(this);
        g1Var.m18618l0(this);
        m26729p0(iVar, false);
        if (m26761V() && s4Var != null) {
            g1Var.m18624i0(s4Var.m25966c6() ? R.drawable.baseline_check_24 : R.drawable.deproko_baseline_whatshot_24);
            if (s4Var.m25956d6() && !s4Var.m25928g6()) {
                g1Var.m18612o0(true);
            }
        }
        m26721t0(j2, photo, z2);
    }

    public C4630f0(org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a r13, p350yd.C10930q6 r14, org.drinkless.p210td.libcore.telegram.TdApi.Document r15, long r16, long r18, gd.AbstractC4761s4 r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: gd.C4630f0.<init>(org.thunderdog.challegram.a, yd.q6, org.drinkless.td.libcore.telegram.TdApi$Document, long, long, gd.s4, boolean):void");
    }

    public C4630f0(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.Video video, long j, long j2, AbstractC4761s4 s4Var, boolean z) {
        TdApi.Thumbnail thumbnail;
        C3940f fVar = new C3940f(0, new C3950k.AbstractC3952b() {
            @Override
            public final void mo45P5(int i, float f, float f2, C3950k kVar) {
                C4630f0.this.m26751d0(i, f, f2, kVar);
            }

            @Override
            public void mo35Y0(int i, float f, C3950k kVar) {
                C3953l.m29526a(this, i, f, kVar);
            }
        }, C2057b.f7280b, 230L);
        this.f15399l0 = fVar;
        this.f15401n0 = 15;
        this.f15375Q = q6Var;
        this.f15381W = video;
        this.f15395h0 = s4Var;
        this.f15394g0 = j2;
        this.f15397j0 = z;
        if ((video.width == 0 || video.height == 0) && (thumbnail = video.thumbnail) != null) {
            video.width = thumbnail.width;
            video.height = thumbnail.height;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.f15392e0 = new Path();
        }
        m26719u0(video.minithumbnail, video.thumbnail);
        TdApi.File file = video.video;
        this.f15382X = file;
        C6261s q = m26728q(q6Var, file);
        this.f15383Y = q;
        q.m20897s0(2);
        int i = video.width;
        this.f15390c0 = i;
        int i2 = video.height;
        this.f15391d0 = i2;
        if (i == 0 || i2 == 0) {
            int i3 = C1357a0.m37541i(100.0f);
            this.f15391d0 = i3;
            this.f15390c0 = i3;
        }
        C6883g1 g1Var = new C6883g1(aVar, q6Var, 4, !m26761V(), j, j2);
        this.f15393f0 = g1Var;
        g1Var.m18624i0(m26761V() ? (s4Var == null || !s4Var.m25966c6()) ? R.drawable.deproko_baseline_whatshot_24 : R.drawable.baseline_check_24 : R.drawable.baseline_play_arrow_36_white);
        g1Var.m18669H0(this);
        if (s4Var != null && s4Var.m25956d6() && !s4Var.m25928g6()) {
            g1Var.m18612o0(true);
        }
        if (s4Var != null && !s4Var.m25870m6()) {
            g1Var.m18612o0(true);
            g1Var.m18606r0(true);
            g1Var.m18665J0(true);
            g1Var.m18624i0(R.drawable.baseline_play_arrow_36_white);
            g1Var.m18590z0(R.drawable.baseline_cloud_download_24);
        }
        g1Var.m18614n0(video.video, s4Var != null ? s4Var.m25984a4(j2) : null);
        if (s4Var != null && !s4Var.m25870m6()) {
            fVar.m29575p(g1Var.m18676E(), false);
        }
        m26780F0();
    }

    public C4630f0(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.Animation animation, long j, long j2, AbstractC4761s4 s4Var, boolean z) {
        this(aVar, q6Var, animation, j, j2, s4Var, z, false, false, null);
    }

    public C4630f0(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.Animation animation, long j, long j2, AbstractC4761s4 s4Var, boolean z, boolean z2, boolean z3, C4658i iVar) {
        this.f15399l0 = new C3940f(0, new C3950k.AbstractC3952b() {
            @Override
            public final void mo45P5(int i, float f, float f2, C3950k kVar) {
                C4630f0.this.m26751d0(i, f, f2, kVar);
            }

            @Override
            public void mo35Y0(int i, float f, C3950k kVar) {
                C3953l.m29526a(this, i, f, kVar);
            }
        }, C2057b.f7280b, 230L);
        this.f15401n0 = 15;
        this.f15375Q = q6Var;
        this.f15380V = animation;
        this.f15397j0 = z;
        this.f15395h0 = s4Var;
        this.f15394g0 = j2;
        if (Build.VERSION.SDK_INT >= 19) {
            this.f15392e0 = new Path();
        }
        TdApi.Thumbnail thumbnail = animation.thumbnail;
        if (thumbnail != null) {
            m26719u0(animation.minithumbnail, thumbnail);
        }
        this.f15382X = animation.animation;
        C6503j jVar = new C6503j(q6Var, animation);
        this.f15384Z = jVar;
        jVar.m20297I(2);
        if (Math.max(animation.width, animation.height) > 1280) {
            this.f15384Z.m20296J(1280);
        }
        int i = animation.width;
        this.f15390c0 = i;
        int i2 = animation.height;
        this.f15391d0 = i2;
        if (i == 0 || i2 == 0) {
            int i3 = C1357a0.m37541i(100.0f);
            this.f15391d0 = i3;
            this.f15390c0 = i3;
        }
        C6883g1 g1Var = new C6883g1(aVar, q6Var, 32, true, j, j2);
        this.f15393f0 = g1Var;
        g1Var.m18669H0(this);
        m26729p0(iVar, true);
        if (m26761V()) {
            g1Var.m18624i0(R.drawable.deproko_baseline_whatshot_24);
        } else if ((z2 && z3) || (!z2 && !C4868i.m24726c2().m24546z2())) {
            this.f15384Z.m20302D(true);
            g1Var.m18624i0(R.drawable.deproko_baseline_gif_24);
        }
        g1Var.m18614n0(this.f15382X, s4Var != null ? s4Var.m25984a4(j2) : null);
        m26780F0();
    }
}
