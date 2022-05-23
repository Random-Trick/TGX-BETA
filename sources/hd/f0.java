package hd;

import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import ce.b;
import ce.c0;
import ce.j0;
import ce.y;
import eb.f;
import eb.k;
import eb.l;
import gd.w;
import ib.i;
import ld.c;
import ld.h;
import ld.p;
import ld.s;
import ld.v;
import md.j;
import md.m;
import ne.g1;
import ob.e;
import oc.v0;
import od.j1;
import od.l1;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import zd.o6;

public class f0 implements g1.c, g1.b {
    public String A0;
    public c B0;
    public v C0;
    public int M;
    public int N;
    public int O;
    public int P;
    public final o6 Q;
    public TdApi.Photo R;
    public boolean S;
    public TdApi.PhotoSize T;
    public TdApi.PhotoSize U;
    public TdApi.Animation V;
    public TdApi.Video W;
    public TdApi.File X;
    public h Y;
    public j Z;
    public int f12956a;
    public h f12957a0;
    public int f12958b;
    public h f12959b0;
    public int f12960c;
    public int f12961c0;
    public int f12962d0;
    public Path f12963e0;
    public final g1 f12964f0;
    public final RectF f12965g0;
    public long f12966h0;
    public s4 f12967i0;
    public a f12968j0;
    public final boolean f12969k0;
    public boolean f12970l0;
    public final f f12971m0;
    public k f12972n0;
    public int f12973o0;
    public i f12974p0;
    public Drawable f12975q0;
    public l1 f12976r0;
    public boolean f12977s0;
    public String f12978t0;
    public String f12979u0;
    public int f12980v0;
    public int f12981w0;
    public int f12982x0;
    public int f12983y0;
    public String f12984z0;

    public interface a {
        boolean f(View view, f0 f0Var);
    }

    public f0(org.thunderdog.challegram.a aVar, o6 o6Var, TdApi.Photo photo, long j10, long j11, s4 s4Var, boolean z10) {
        this(aVar, o6Var, photo, j10, j11, s4Var, z10, false);
    }

    public static int H(TdApi.Photo photo, TdApi.PhotoSize photoSize) {
        if (photoSize != null) {
            return photoSize.height;
        }
        TdApi.PhotoSize C0 = e.C0(photo);
        if (C0 != null) {
            return C0.height;
        }
        return 0;
    }

    public static int T(TdApi.Photo photo, TdApi.PhotoSize photoSize) {
        if (photoSize != null) {
            return photoSize.width;
        }
        TdApi.PhotoSize C0 = e.C0(photo);
        if (C0 != null) {
            return C0.width;
        }
        return 0;
    }

    public static boolean Z(TdApi.File file, TdApi.File file2) {
        TdApi.LocalFile localFile;
        TdApi.LocalFile localFile2;
        return (file == null && file2 == null) || !(file == null || file2 == null || (file.f19913id != file2.f19913id && ((localFile = file.local) == null || (localFile2 = file2.local) == null || !i.c(localFile.path, localFile2.path) || i.i(file.local.path))));
    }

    public void b0(TdApi.InlineQueryResultPhoto inlineQueryResultPhoto) {
        if (!this.f12977s0) {
            u0(0L, inlineQueryResultPhoto.photo, false);
            this.f12964f0.E();
            this.f12964f0.n();
        }
    }

    public void c0(String str, String str2, TdApi.Object object) {
        if (object.getConstructor() == 1000709656 && !this.f12977s0) {
            TdApi.InlineQueryResults inlineQueryResults = (TdApi.InlineQueryResults) object;
            if (inlineQueryResults.results.length > 0) {
                double random = Math.random();
                TdApi.InlineQueryResult[] inlineQueryResultArr = inlineQueryResults.results;
                TdApi.InlineQueryResult inlineQueryResult = inlineQueryResultArr[(int) (random * (inlineQueryResultArr.length - 1))];
                if (inlineQueryResult.getConstructor() == 1848319440) {
                    final TdApi.InlineQueryResultPhoto inlineQueryResultPhoto = (TdApi.InlineQueryResultPhoto) inlineQueryResult;
                    this.Q.hd().post(new Runnable() {
                        @Override
                        public final void run() {
                            f0.this.b0(inlineQueryResultPhoto);
                        }
                    });
                }
            } else if (!i.c(str, "pic")) {
                O("pic", str2);
            }
        }
    }

    public void d0(final String str, final String str2, TdApi.Object object) {
        if (object.getConstructor() == -1601123095 && !this.f12977s0) {
            TdApi.Chat ma2 = this.Q.ma(object);
            this.Q.v4().o(new TdApi.GetInlineQueryResults(t2.o2(ma2.type), ma2.f19908id, null, str, null), new Client.g() {
                @Override
                public final void r2(TdApi.Object object2) {
                    f0.this.c0(str2, str, object2);
                }
            });
        }
    }

    public void e0(int i10, float f10, float f11, k kVar) {
        s4 s4Var = this.f12967i0;
        if (s4Var != null) {
            s4Var.q8();
        }
    }

    public static boolean h(h hVar, int i10, int i11) {
        if (hVar == null || Math.max(i10, i11) <= 1024) {
            return false;
        }
        hVar.t0(Log.TAG_CAMERA);
        return true;
    }

    public static boolean i(h hVar, TdApi.PhotoSize photoSize) {
        return h(hVar, photoSize.width, photoSize.height);
    }

    public static TdApi.PhotoSize k0(o6 o6Var, TdApi.PhotoSize[] photoSizeArr, long j10) {
        TdApi.PhotoSize m10 = m(photoSizeArr);
        TdApi.PhotoSize p10 = p(photoSizeArr, m10);
        return (p10 == null || (!t2.T2(p10.photo) && !o6Var.m5().k(p10.photo, 1, o6Var.d4(j10)))) ? m10 : p10;
    }

    public static TdApi.PhotoSize l(TdApi.Photo photo) {
        if (photo != null) {
            return m(photo.sizes);
        }
        return null;
    }

    public static TdApi.PhotoSize m(TdApi.PhotoSize[] photoSizeArr) {
        TdApi.PhotoSize r02 = t2.r0(photoSizeArr, "t");
        if (r02 != null) {
            TdApi.File file = r02.photo;
            if (file.local.canBeDownloaded || t2.V2(file)) {
                return r02;
            }
        }
        TdApi.PhotoSize photoSize = null;
        boolean z10 = false;
        for (TdApi.PhotoSize photoSize2 : photoSizeArr) {
            if (photoSize == null || Math.max(photoSize2.width, photoSize2.height) < Math.max(photoSize.width, photoSize.height)) {
                photoSize = photoSize2;
            } else if (!z10 && photoSize.photo.f19913id != photoSize2.photo.f19913id) {
                z10 = true;
            }
        }
        if (!z10 || Math.max(photoSize.width, photoSize.height) > 90) {
            return null;
        }
        return photoSize;
    }

    public static TdApi.PhotoSize n(TdApi.Photo photo) {
        return p(photo.sizes, m(photo.sizes));
    }

    public static TdApi.PhotoSize o(TdApi.Photo photo, TdApi.PhotoSize photoSize) {
        if (photo != null) {
            return p(photo.sizes, photoSize);
        }
        return null;
    }

    public static TdApi.PhotoSize p(TdApi.PhotoSize[] photoSizeArr, TdApi.PhotoSize photoSize) {
        TdApi.PhotoSize photoSize2 = null;
        if (photoSizeArr == null) {
            return null;
        }
        int i10 = 0;
        if (photoSizeArr.length != 1) {
            TdApi.PhotoSize r02 = t2.r0(photoSizeArr, "i");
            if (r02 != null) {
                TdApi.File file = r02.photo;
                if ((file.local.canBeDownloaded || t2.V2(file)) && (photoSize == null || photoSize.photo.f19913id != r02.photo.f19913id)) {
                    return r02;
                }
            }
            for (TdApi.PhotoSize photoSize3 : photoSizeArr) {
                if ((photoSize == null || photoSize3.photo.f19913id != photoSize.photo.f19913id) && ((photoSize2 == null || Math.max(photoSize2.width, photoSize2.height) <= Math.max(photoSize3.width, photoSize3.height)) && t2.V2(photoSize3.photo))) {
                    photoSize2 = photoSize3;
                }
            }
            if (!(photoSize2 == null || e.K0(photoSizeArr).photo.f19913id == photoSize2.photo.f19913id)) {
                return photoSize2;
            }
            int r32 = s4.r3();
            int i11 = (int) (r32 * 1.7f);
            if (photoSize != null) {
                i10 = photoSize.photo.f19913id;
            }
            return t2.q0(photoSizeArr, r32, i11, i10, "i");
        } else if (photoSize == null || photoSize.photo.f19913id != photoSizeArr[0].photo.f19913id) {
            return photoSizeArr[0];
        } else {
            return null;
        }
    }

    public static s q(o6 o6Var, TdApi.File file) {
        int r32 = s4.r3();
        s sVar = new s(o6Var, file);
        sVar.J0(r32, (int) (r32 * 1.7f));
        sVar.H0(0L);
        return sVar;
    }

    public static int t() {
        return a0.i(20.0f);
    }

    public static int u() {
        return a0.i(19.0f);
    }

    public int A() {
        return this.f12958b;
    }

    public final boolean A0(TdApi.PhotoSize photoSize) {
        if (Z(this.X, photoSize != null ? photoSize.photo : null)) {
            return false;
        }
        if (photoSize != null) {
            TdApi.File file = photoSize.photo;
            this.X = file;
            h hVar = new h(this.Q, file);
            this.Y = hVar;
            hVar.s0(2);
            this.Y.k0();
            if (this.S) {
                this.Y.x0();
            }
            i(this.Y, photoSize);
            return true;
        }
        this.Y = null;
        return true;
    }

    public int B() {
        return this.O;
    }

    public final void B0(boolean z10) {
        if (this.f12964f0.N() != z10) {
            this.f12964f0.t0(z10);
            this.f12964f0.N0(z10);
            int i10 = R.drawable.baseline_play_arrow_36_white;
            boolean z11 = true;
            if (z10) {
                this.f12964f0.q0(true);
                this.f12964f0.k0(R.drawable.baseline_play_arrow_36_white);
                this.f12964f0.C0(R.drawable.baseline_cloud_download_24);
            } else {
                g1 g1Var = this.f12964f0;
                s4 s4Var = this.f12967i0;
                if (s4Var == null || !s4Var.c6() || this.f12967i0.f6()) {
                    z11 = false;
                }
                g1Var.q0(z11);
                g1 g1Var2 = this.f12964f0;
                if (V()) {
                    s4 s4Var2 = this.f12967i0;
                    i10 = (s4Var2 == null || !s4Var2.b6()) ? R.drawable.deproko_baseline_whatshot_24 : R.drawable.baseline_check_24;
                }
                g1Var2.k0(i10);
                this.f12964f0.C0(R.drawable.baseline_file_download_24);
            }
            s4 s4Var3 = this.f12967i0;
            if (s4Var3 != null && !s4Var3.l6()) {
                this.f12971m0.p(this.f12964f0.F(), false);
            }
            this.f12964f0.X0();
        }
    }

    public int C() {
        return (this.f12956a + this.M) >> 1;
    }

    public void C0(gb.j jVar) {
        this.f12964f0.R0(jVar);
    }

    public int D() {
        return (this.f12958b + this.N) >> 1;
    }

    public final boolean D0() {
        g1 g1Var;
        return this.Y != null && t2.T2(this.X) && ((g1Var = this.f12964f0) == null || g1Var.F()) && !V();
    }

    public int E() {
        return this.f12962d0;
    }

    public boolean E0() {
        return true;
    }

    public int F() {
        return this.f12961c0;
    }

    public final void F0(String str, int i10) {
        String str2;
        int i11;
        int i12 = (this.O - (a0.i(8.0f) * 2)) - (a0.i(18.0f) * 2);
        if (i12 > 0) {
            int i13 = this.f12980v0;
            if (i13 > i12 || this.f12981w0 > i12) {
                this.f12984z0 = this.f12978t0;
                this.f12983y0 = i13;
                if (i13 <= i12 || (str2 = this.f12979u0) == null || (i11 = this.f12981w0) >= i12) {
                    if (this.f12979u0 == null || this.f12981w0 > i12) {
                        this.f12984z0 = null;
                        this.f12983y0 = 0;
                    }
                    this.f12978t0 = null;
                    this.f12979u0 = null;
                    return;
                }
                if (str != null) {
                    str2 = str;
                }
                this.f12984z0 = str2;
                if (str == null) {
                    i10 = i11;
                }
                this.f12983y0 = i10;
                this.f12978t0 = null;
            }
        }
    }

    public g1 G() {
        return this.f12964f0;
    }

    public final void G0() {
        int i10;
        int i11 = this.O - (a0.i(4.0f) * 3);
        this.f12984z0 = null;
        this.f12983y0 = 0;
        if (i11 > 0) {
            int i12 = this.f12980v0;
            if (i12 > i11) {
                String str = this.f12979u0;
                if (str != null && (i10 = this.f12981w0) <= i11) {
                    this.f12984z0 = str;
                    this.f12983y0 = i10;
                    return;
                }
                return;
            }
            this.f12984z0 = this.f12978t0;
            this.f12983y0 = i12;
        }
    }

    public final boolean H0() {
        boolean z10;
        String str;
        String str2;
        String str3;
        String str4;
        TdApi.Video video;
        String str5;
        String str6;
        String str7;
        s4 s4Var;
        if (this.W == null && this.V == null) {
            return false;
        }
        String str8 = null;
        if (this.f12964f0.G()) {
            str2 = w.i1(R.string.failed);
            str3 = null;
            str = str2;
            z10 = false;
        } else {
            if ((this.f12964f0.L() || ((s4Var = this.f12967i0) != null && !s4Var.n6())) && this.f12964f0.H() && (!a0() || !this.f12964f0.F())) {
                str3 = null;
                str = "";
                z10 = false;
            } else {
                str3 = c0.m(this.f12964f0.B());
                if (!this.f12964f0.I() && this.f12964f0.L() && (!a0() || !this.f12964f0.F())) {
                    str = "";
                    z10 = true;
                    str2 = str3;
                    str3 = null;
                } else if (this.f12964f0.J()) {
                    str = w.j1(R.string.ProcessingMedia, str3);
                    z10 = true;
                } else {
                    int y10 = this.f12964f0.y();
                    int B = this.f12964f0.B();
                    if (y10 <= B) {
                        double d10 = (y10 / B) * 100.0f;
                        str7 = w.j1(R.string.format_uploadStatus, Integer.valueOf((int) Math.floor(d10)), str3);
                        str6 = w.j1(R.string.format_percentage, Integer.valueOf((int) Math.floor(d10)));
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        long j10 = y10;
                        sb2.append(c0.m(j10));
                        sb2.append(" / ");
                        sb2.append(str3);
                        str7 = sb2.toString();
                        str6 = c0.m(j10);
                    }
                    z10 = true;
                    str = str7;
                    str2 = str3;
                    str3 = str6;
                }
            }
            str2 = str3;
        }
        if (i.i(str2) || !i.i(str)) {
            str2 = str;
            str4 = str2;
        } else {
            str4 = null;
        }
        if (this.W != null) {
            str4 = c0.h(video.duration);
            if (z10) {
                str8 = str2;
                str5 = str4;
            } else {
                str5 = null;
            }
            if (!str2.isEmpty()) {
                str2 = str2 + ", " + str4;
            } else if (this.f12964f0.N()) {
                str8 = c0.m(this.f12964f0.B());
                str2 = str8;
                str5 = str4;
            } else {
                str2 = str4;
            }
        } else {
            str5 = null;
        }
        if (str8 != null && (!i.c(this.f12978t0, str8) || !i.c(this.f12979u0, str5))) {
            this.f12978t0 = str8;
            this.f12979u0 = str5;
            this.A0 = str3;
            TextPaint b02 = y.b0(13.0f);
            this.f12980v0 = (int) v0.T1(str8, b02);
            this.f12981w0 = (int) v0.T1(str5, b02);
            this.f12982x0 = (int) v0.T1(str3, b02);
            this.f12983y0 = Math.max(this.f12980v0, this.f12981w0);
            this.f12984z0 = this.f12978t0;
            F0(this.A0, this.f12982x0);
            return true;
        } else if (str8 != null || i.c(this.f12978t0, str2)) {
            return false;
        } else {
            this.f12978t0 = str2;
            this.f12979u0 = str4;
            TextPaint F0 = y.F0(13.0f, false, true);
            this.f12980v0 = (int) v0.T1(str2, F0);
            this.f12981w0 = (int) v0.T1(str4, F0);
            G0();
            return true;
        }
    }

    public l1 I(View view, int i10, int i11, int i12) {
        if (this.f12976r0 == null) {
            l1 l1Var = new l1();
            this.f12976r0 = l1Var;
            l1Var.n();
        }
        int i13 = a0.i(ae.j.G());
        int i14 = K0() ? (int) (a0.i(ae.j.F()) / 1.5f) : 0;
        l1 l1Var2 = this.f12976r0;
        int i15 = this.f12973o0;
        int i16 = (i15 & 1) != 0 ? i13 : i14;
        int i17 = (i15 & 2) != 0 ? i13 : i14;
        int i18 = (i15 & 8) != 0 ? i13 : i14;
        if ((i15 & 4) == 0) {
            i13 = i14;
        }
        l1Var2.q(i16, i17, i18, i13);
        int i19 = this.f12958b + i10;
        int measuredHeight = (view.getMeasuredHeight() - this.N) + i11;
        l1 l1Var3 = this.f12976r0;
        int i20 = this.f12956a;
        int i21 = this.f12958b;
        l1Var3.i(i20, i21 + i12, this.O + i20, i21 + this.P + i12);
        this.f12976r0.l(0, i19 < 0 ? -i19 : 0, 0, measuredHeight < 0 ? -measuredHeight : 0);
        return this.f12976r0;
    }

    public void I0(long j10, long j11, boolean z10) {
        if (this.f12966h0 == j10) {
            this.f12966h0 = j11;
        }
        G().V0(j10, j11, z10);
        H0();
    }

    public TdApi.Photo J() {
        return this.R;
    }

    public boolean J0(long j10, TdApi.MessagePhoto messagePhoto) {
        if (this.f12966h0 != j10) {
            return false;
        }
        u0(j10, messagePhoto.photo, this.S);
        return true;
    }

    public c K() {
        return this.B0;
    }

    public final boolean K0() {
        s4 s4Var = this.f12967i0;
        return s4Var != null ? s4Var.R9() : this.Q.tc().x0();
    }

    public final int L() {
        return a0.i(K0() ? ae.j.G() : ae.j.V());
    }

    public int M() {
        TdApi.File file;
        g1 g1Var = this.f12964f0;
        if (g1Var == null || g1Var.u() == null) {
            TdApi.PhotoSize photoSize = this.T;
            if (photoSize == null) {
                return 0;
            }
            file = photoSize.photo;
        } else {
            file = this.f12964f0.u();
        }
        return file.f19913id;
    }

    public long N() {
        return this.f12966h0;
    }

    public final void O(final String str, final String str2) {
        this.Q.v4().o(new TdApi.SearchPublicChat(str), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                f0.this.d0(str2, str, object);
            }
        });
    }

    public TdApi.File P() {
        return this.X;
    }

    public j Q() {
        return this.Z;
    }

    public v R() {
        return this.C0;
    }

    public TdApi.Video S() {
        return this.W;
    }

    public boolean U() {
        return this.V != null;
    }

    public final boolean V() {
        s4 s4Var;
        return this.f12969k0 && (s4Var = this.f12967i0) != null && s4Var.a6();
    }

    public boolean W() {
        return this.f12974p0 != null;
    }

    public boolean X() {
        return this.R != null;
    }

    public final boolean Y(s4 s4Var) {
        return s4Var != null && !s4Var.l6() && !s4Var.a6();
    }

    @Override
    public TdApi.File a(TdApi.File file) {
        TdApi.PhotoSize photoSize;
        if (this.Y == null || (photoSize = this.U) == null || !i.c(photoSize.type, "i") || file.f19913id != this.U.photo.f19913id) {
            return null;
        }
        TdApi.PhotoSize l10 = l(this.R);
        TdApi.PhotoSize photoSize2 = this.T;
        if (!(photoSize2 == null || l10 == null || photoSize2.photo.f19913id == l10.photo.f19913id)) {
            x0(this.R.minithumbnail, l10);
        }
        TdApi.PhotoSize o10 = o(this.R, l10);
        if (o10 == null || o10.photo.f19913id == file.f19913id) {
            return null;
        }
        A0(o10);
        return o10.photo;
    }

    public boolean a0() {
        return this.W != null;
    }

    @Override
    public void e(TdApi.File file, int i10) {
        s4 s4Var;
        TdApi.Video video = this.W;
        if (video != null) {
            B0(!video.video.remote.isUploadingActive);
        }
        if ((this.W != null || this.V != null) && H0() && (s4Var = this.f12967i0) != null) {
            s4Var.q8();
        }
    }

    public final void f0(int i10, int i11, int i12) {
        this.M = this.O + i10;
        this.N = this.P + i11;
        this.f12956a = i10;
        this.f12958b = i11;
        this.f12960c = i12;
        Path path = this.f12963e0;
        if (path != null) {
            path.reset();
            RectF a02 = y.a0();
            a02.set(this.f12956a, this.f12958b, this.M, this.N);
            int i13 = i12 / 2;
            Path path2 = this.f12963e0;
            int i14 = this.f12973o0;
            b.a(path2, a02, (i14 & 1) != 0 ? i13 : 0.0f, (i14 & 2) != 0 ? i13 : 0.0f, (i14 & 8) != 0 ? i13 : 0.0f, (i14 & 4) != 0 ? i13 : 0.0f);
        }
    }

    @Override
    public void g(TdApi.File file, float f10) {
        s4 s4Var;
        if ((this.W != null || this.V != null) && H0() && (s4Var = this.f12967i0) != null) {
            s4Var.q8();
        }
    }

    public void g0(String str) {
        this.f12964f0.j0(1, false);
        O(this.Q.R5(), str);
    }

    public boolean h0() {
        return this.Z != null;
    }

    public boolean i0(View view, MotionEvent motionEvent) {
        return this.f12964f0.S(view, motionEvent);
    }

    public void j(int i10, int i11) {
        boolean z10 = this.O != i10;
        if (z10 || this.P != i11) {
            this.O = i10;
            this.P = i11;
            this.f12958b = -1;
            this.f12956a = -1;
            if (z10 && !i.i(this.f12978t0)) {
                if (!a0() || G().H()) {
                    G0();
                } else {
                    F0(this.A0, this.f12982x0);
                }
            }
        }
    }

    public boolean j0(View view) {
        return this.f12964f0.Z(view);
    }

    @Override
    public boolean k(g1 g1Var, View view, TdApi.File file, long j10) {
        s4 s4Var;
        i iVar = this.f12974p0;
        if (iVar != null) {
            iVar.f(g1Var.h());
            return true;
        }
        a aVar = this.f12968j0;
        if ((aVar == null || !aVar.f(view, this)) && (s4Var = this.f12967i0) != null) {
            if (s4Var instanceof n5) {
                j1.kk((n5) s4Var, j10);
            } else if (s4Var instanceof h6) {
                j1.lk((h6) s4Var);
            }
        }
        return true;
    }

    public void l0(m mVar) {
        g1 g1Var;
        mVar.r((this.Z == null || !t2.T2(this.X) || ((g1Var = this.f12964f0) != null && !g1Var.F()) || V()) ? null : this.Z);
    }

    public void m0(p pVar) {
        pVar.G(D0() ? this.Y : null);
    }

    public void n0(c cVar) {
        if (E0()) {
            cVar.j(this.f12957a0, this.f12959b0);
        } else {
            cVar.clear();
        }
    }

    public void o0(boolean z10) {
        this.f12970l0 = z10;
        this.f12964f0.t0(z10);
    }

    public boolean p0(int i10) {
        int min = Math.min((int) Log.TAG_CAMERA, i10);
        h hVar = this.Y;
        if (hVar == null || hVar.z() == min) {
            return false;
        }
        this.Y.t0(min);
        return D0();
    }

    public void q0(i iVar, boolean z10) {
        if (iVar != null) {
            this.f12974p0 = iVar;
            int a10 = iVar.a();
            if (a10 != 0) {
                this.f12975q0 = s0.h.d(j0.B(), a10, null);
            }
            this.f12964f0.k0(R.drawable.baseline_play_arrow_36_white);
            this.f12964f0.C0(R.drawable.baseline_play_arrow_36_white);
            this.f12964f0.t0(true);
        }
    }

    public void r() {
        this.f12964f0.j();
        this.f12977s0 = true;
    }

    public void r0(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (z11) {
            z10 = (z10 ? 1 : 0) | true;
        }
        if (z13) {
            boolean z14 = z10 ? 1 : 0;
            char c10 = z10 ? 1 : 0;
            z10 = z14 | true;
        }
        if (z12) {
            boolean z15 = z10 ? 1 : 0;
            char c11 = z10 ? 1 : 0;
            char c12 = z10 ? 1 : 0;
            z10 = z15 | true;
        }
        if (this.f12973o0 != z10) {
            int i10 = z10 ? 1 : 0;
            int i11 = z10 ? 1 : 0;
            int i12 = z10 ? 1 : 0;
            this.f12973o0 = i10;
            f0(this.f12956a, this.f12958b, this.f12960c);
        }
    }

    public <T extends android.view.View & ie.t> void s(T r34, android.graphics.Canvas r35, int r36, int r37, ld.v r38, ld.v r39, float r40) {
        throw new UnsupportedOperationException("Method not decompiled: hd.f0.s(android.view.View, android.graphics.Canvas, int, int, ld.v, ld.v, float):void");
    }

    public void s0() {
        this.f12963e0 = null;
    }

    public void t0(a aVar) {
        this.f12968j0 = aVar;
    }

    public final void u0(long j10, TdApi.Photo photo, boolean z10) {
        this.R = photo;
        this.S = z10;
        TdApi.PhotoSize m10 = m(photo.sizes);
        TdApi.PhotoSize p10 = p(photo.sizes, m10);
        this.f12961c0 = T(photo, p10);
        int H = H(photo, p10);
        this.f12962d0 = H;
        if (this.f12961c0 == 0 || H == 0) {
            int i10 = a0.i(100.0f);
            this.f12962d0 = i10;
            this.f12961c0 = i10;
        }
        TdApi.PhotoSize photoSize = this.T;
        if (!(photoSize == null || m10 == null || !Z(photoSize.photo, m10.photo))) {
            TdApi.PhotoSize photoSize2 = this.T;
            photoSize2.width = m10.width;
            photoSize2.height = m10.height;
            m10 = photoSize2;
        }
        TdApi.PhotoSize photoSize3 = this.U;
        boolean z11 = true;
        boolean z12 = photoSize3 != null;
        if (p10 == null) {
            z11 = false;
        }
        if ((z11 && z12) && Z(photoSize3.photo, p10.photo)) {
            TdApi.PhotoSize photoSize4 = this.U;
            photoSize4.width = p10.width;
            photoSize4.height = p10.height;
            p10 = photoSize4;
        }
        x0(photo.minithumbnail, m10);
        if (A0(p10)) {
            g1 g1Var = this.f12964f0;
            TdApi.Message message = null;
            TdApi.File file = p10 != null ? p10.photo : null;
            s4 s4Var = this.f12967i0;
            if (s4Var != null) {
                message = s4Var.Y3(j10);
            }
            g1Var.p0(file, message);
        }
    }

    public TdApi.Animation v() {
        return this.V;
    }

    public final void v0(TdApi.Minithumbnail minithumbnail, TdApi.Thumbnail thumbnail) {
        if (minithumbnail != null) {
            this.f12957a0 = new ld.i(minithumbnail);
        } else {
            this.f12957a0 = null;
        }
        h D5 = t2.D5(this.Q, thumbnail);
        if (D5 != null) {
            D5.s0(2);
            if (this.S) {
                D5.x0();
            }
            if (V()) {
                D5.f0();
                D5.t0(90);
                D5.d0();
            }
        }
        this.f12959b0 = D5;
    }

    public int w() {
        return this.N;
    }

    public void w0(c cVar) {
        this.B0 = cVar;
    }

    public int x() {
        return this.P;
    }

    public final void x0(TdApi.Minithumbnail minithumbnail, TdApi.PhotoSize photoSize) {
        TdApi.PhotoSize photoSize2 = this.T;
        TdApi.File file = null;
        TdApi.File file2 = photoSize2 != null ? photoSize2.photo : null;
        if (photoSize != null) {
            file = photoSize.photo;
        }
        if (!Z(file2, file)) {
            this.T = photoSize;
            v0(minithumbnail, t2.K5(photoSize));
        } else if (this.f12957a0 == null && minithumbnail != null) {
            this.f12957a0 = new ld.i(minithumbnail);
        }
    }

    public int y() {
        return this.f12956a;
    }

    public void y0(k kVar) {
        this.f12972n0 = kVar;
    }

    public int z() {
        return this.M;
    }

    public void z0(v vVar) {
        this.C0 = vVar;
    }

    public f0(org.thunderdog.challegram.a aVar, o6 o6Var, TdApi.Photo photo, long j10, long j11, s4 s4Var, boolean z10, boolean z11) {
        this(aVar, o6Var, photo, j10, j11, s4Var, z10, z11, null);
    }

    public f0(org.thunderdog.challegram.a aVar, o6 o6Var, TdApi.Photo photo, long j10, long j11, s4 s4Var, boolean z10, boolean z11, i iVar) {
        this.f12965g0 = new RectF();
        this.f12971m0 = new f(0, new k.b() {
            @Override
            public final void n4(int i10, float f10, float f11, k kVar) {
                f0.this.e0(i10, f10, f11, kVar);
            }

            @Override
            public void o4(int i10, float f10, k kVar) {
                l.a(this, i10, f10, kVar);
            }
        }, db.b.f7287b, 230L);
        this.f12973o0 = 15;
        this.Q = o6Var;
        this.R = photo;
        this.f12967i0 = s4Var;
        this.f12966h0 = j11;
        this.f12969k0 = z10;
        this.f12963e0 = new Path();
        g1 g1Var = new g1(aVar, o6Var, 1, !V(), j10, j11);
        this.f12964f0 = g1Var;
        g1Var.L0(this);
        g1Var.n0(this);
        q0(iVar, false);
        if (V() && s4Var != null) {
            g1Var.k0(s4Var.b6() ? R.drawable.baseline_check_24 : R.drawable.deproko_baseline_whatshot_24);
            if (s4Var.c6() && !s4Var.f6()) {
                g1Var.q0(true);
            }
        }
        u0(j11, photo, z11);
    }

    public f0(org.thunderdog.challegram.a r13, zd.o6 r14, org.drinkless.td.libcore.telegram.TdApi.Document r15, long r16, long r18, hd.s4 r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: hd.f0.<init>(org.thunderdog.challegram.a, zd.o6, org.drinkless.td.libcore.telegram.TdApi$Document, long, long, hd.s4, boolean):void");
    }

    public f0(org.thunderdog.challegram.a aVar, o6 o6Var, TdApi.Video video, long j10, long j11, s4 s4Var, boolean z10) {
        TdApi.Thumbnail thumbnail;
        this.f12965g0 = new RectF();
        f fVar = new f(0, new k.b() {
            @Override
            public final void n4(int i10, float f10, float f11, k kVar) {
                f0.this.e0(i10, f10, f11, kVar);
            }

            @Override
            public void o4(int i10, float f10, k kVar) {
                l.a(this, i10, f10, kVar);
            }
        }, db.b.f7287b, 230L);
        this.f12971m0 = fVar;
        this.f12973o0 = 15;
        this.Q = o6Var;
        this.W = video;
        this.f12967i0 = s4Var;
        this.f12966h0 = j11;
        this.f12969k0 = z10;
        if ((video.width == 0 || video.height == 0) && (thumbnail = video.thumbnail) != null) {
            video.width = thumbnail.width;
            video.height = thumbnail.height;
        }
        this.f12963e0 = new Path();
        v0(video.minithumbnail, video.thumbnail);
        TdApi.File file = video.video;
        this.X = file;
        s q10 = q(o6Var, file);
        this.Y = q10;
        q10.s0(2);
        int i10 = video.width;
        this.f12961c0 = i10;
        int i11 = video.height;
        this.f12962d0 = i11;
        if (i10 == 0 || i11 == 0) {
            int i12 = a0.i(100.0f);
            this.f12962d0 = i12;
            this.f12961c0 = i12;
        }
        g1 g1Var = new g1(aVar, o6Var, 4, !V(), j10, j11);
        this.f12964f0 = g1Var;
        g1Var.k0(V() ? (s4Var == null || !s4Var.b6()) ? R.drawable.deproko_baseline_whatshot_24 : R.drawable.baseline_check_24 : R.drawable.baseline_play_arrow_36_white);
        g1Var.L0(this);
        if (s4Var != null && s4Var.c6() && !s4Var.f6()) {
            g1Var.q0(true);
        }
        if (Y(s4Var) && !video.video.remote.isUploadingActive) {
            B0(true);
        }
        g1Var.p0(video.video, s4Var != null ? s4Var.Y3(j11) : null);
        if (s4Var != null && !s4Var.l6()) {
            fVar.p(g1Var.F(), false);
        }
        H0();
    }

    public f0(org.thunderdog.challegram.a aVar, o6 o6Var, TdApi.Animation animation, long j10, long j11, s4 s4Var, boolean z10) {
        this(aVar, o6Var, animation, j10, j11, s4Var, z10, false, false, null);
    }

    public f0(org.thunderdog.challegram.a aVar, o6 o6Var, TdApi.Animation animation, long j10, long j11, s4 s4Var, boolean z10, boolean z11, boolean z12, i iVar) {
        this.f12965g0 = new RectF();
        this.f12971m0 = new f(0, new k.b() {
            @Override
            public final void n4(int i10, float f10, float f11, k kVar) {
                f0.this.e0(i10, f10, f11, kVar);
            }

            @Override
            public void o4(int i10, float f10, k kVar) {
                l.a(this, i10, f10, kVar);
            }
        }, db.b.f7287b, 230L);
        this.f12973o0 = 15;
        this.Q = o6Var;
        this.V = animation;
        this.f12969k0 = z10;
        this.f12967i0 = s4Var;
        this.f12966h0 = j11;
        this.f12963e0 = new Path();
        TdApi.Thumbnail thumbnail = animation.thumbnail;
        if (thumbnail != null) {
            v0(animation.minithumbnail, thumbnail);
        }
        this.X = animation.animation;
        j jVar = new j(o6Var, animation);
        this.Z = jVar;
        jVar.I(2);
        if (Math.max(animation.width, animation.height) > 1280) {
            this.Z.J(1280);
        }
        int i10 = animation.width;
        this.f12961c0 = i10;
        int i11 = animation.height;
        this.f12962d0 = i11;
        if (i10 == 0 || i11 == 0) {
            int i12 = a0.i(100.0f);
            this.f12962d0 = i12;
            this.f12961c0 = i12;
        }
        g1 g1Var = new g1(aVar, o6Var, 32, true, j10, j11);
        this.f12964f0 = g1Var;
        g1Var.L0(this);
        q0(iVar, true);
        if (V()) {
            g1Var.k0(R.drawable.deproko_baseline_whatshot_24);
        } else if ((z11 && z12) || (!z11 && !he.i.c2().z2())) {
            this.Z.D(true);
            g1Var.k0(R.drawable.deproko_baseline_gif_24);
        }
        g1Var.p0(this.X, s4Var != null ? s4Var.Y3(j11) : null);
        H0();
    }
}
