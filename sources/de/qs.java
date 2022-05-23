package de;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import ce.a0;
import ce.c0;
import ce.j0;
import de.cu;
import gd.l;
import gd.w;
import hd.b7;
import hd.w6;
import he.i;
import ib.g;
import ie.g0;
import ie.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ne.p0;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.loader.ImageLoader;
import org.thunderdog.challegram.v.CustomRecyclerView;
import sd.f;
import ud.f2;
import ud.j1;
import ud.s;
import ud.v4;
import zd.hj;
import zd.o6;
import zd.s1;
import zd.t1;

public class qs extends vo<cu> implements View.OnClickListener, Client.g, cu.c, j1, t1.a {
    public iq D0;
    public int E0;
    public boolean F0;
    public long[] G0;
    public w6.a H0;
    public b7 I0;
    public long J0;
    public boolean K0;
    public View L0;
    public boolean M0;
    public boolean N0;
    public Runnable O0;
    public w6 P0;

    public class a extends iq {
        public a(v4 v4Var) {
            super(v4Var);
            qs.this = r1;
        }

        @Override
        public void R2(ra raVar, uc.c cVar, boolean z10) {
            String str;
            long j10 = 0;
            boolean z11 = true;
            switch (raVar.j()) {
                case R.id.btn_camera:
                    if (qs.this.I0 == null || qs.this.I0.q() <= 0) {
                        z11 = false;
                    }
                    cVar.X1(z11, z10);
                    cVar.setData(qs.this.I0 != null ? c0.m(qs.this.I0.q()) : w.i1(R.string.Calculating));
                    return;
                case R.id.btn_clearCache:
                    if (qs.this.P0 != null) {
                        if (z10) {
                            if (qs.this.P0.i() || qs.this.F0) {
                                z11 = false;
                            }
                            cVar.setEnabledAnimated(z11);
                        } else {
                            if (qs.this.P0.i() || qs.this.F0) {
                                z11 = false;
                            }
                            cVar.setEnabled(z11);
                        }
                        if (qs.this.F0) {
                            cVar.setData(R.string.CleaningUp);
                            return;
                        } else {
                            cVar.setData(qs.this.P0.d());
                            return;
                        }
                    } else {
                        cVar.setData(R.string.Calculating);
                        return;
                    }
                case R.id.btn_emoji:
                    if (qs.this.I0 == null || qs.this.I0.k() <= 0) {
                        z11 = false;
                    }
                    cVar.X1(z11, z10);
                    cVar.setData(qs.this.I0 != null ? c0.m(qs.this.I0.j()) : w.i1(R.string.Calculating));
                    return;
                case R.id.btn_junk:
                    if (qs.this.I0 == null) {
                        z11 = false;
                    }
                    cVar.X1(z11, z10);
                    cVar.setData(qs.this.I0 != null ? c0.m(qs.this.I0.l()) : w.i1(R.string.Calculating));
                    return;
                case R.id.btn_keepMedia:
                    cVar.setData(qs.this.J0 == 0 ? w.i1(R.string.KeepMediaForever) : w.w0((int) qs.this.J0, 0, 0, false));
                    return;
                case R.id.btn_languageSettings:
                    cVar.setEnabled(false);
                    cVar.setData(qs.this.I0 != null ? c0.m(qs.this.I0.m()) : w.i1(R.string.Calculating));
                    return;
                case R.id.btn_localDatabase:
                    if (qs.this.I0 == null) {
                        z11 = false;
                    }
                    cVar.X1(z11, z10);
                    if (qs.this.I0 != null) {
                        b7 b7Var = qs.this.I0;
                        if (qs.this.P0 != null) {
                            j10 = qs.this.P0.c();
                        }
                        str = c0.m(b7Var.i(j10));
                    } else {
                        str = w.i1(R.string.Calculating);
                    }
                    cVar.setData(str);
                    return;
                case R.id.btn_logsSize:
                    if (qs.this.I0 == null) {
                        z11 = false;
                    }
                    cVar.X1(z11, z10);
                    cVar.setData(qs.this.I0 != null ? c0.m(qs.this.I0.n()) : w.i1(R.string.Calculating));
                    return;
                case R.id.btn_lottie:
                    if (qs.this.I0 == null) {
                        z11 = false;
                    }
                    cVar.X1(z11, z10);
                    cVar.setData(qs.this.I0 != null ? c0.m(qs.this.I0.o()) : w.i1(R.string.Calculating));
                    return;
                case R.id.btn_otherChats:
                case R.id.btn_otherFiles:
                    if (qs.this.P0 != null) {
                        boolean z12 = raVar.j() == R.id.btn_otherChats;
                        w6 w6Var = qs.this.P0;
                        w6.a e10 = z12 ? w6Var.e() : w6Var.f();
                        if (z10) {
                            cVar.setEnabledAnimated(!e10.l() && !qs.this.F0);
                        } else {
                            cVar.setEnabled(!e10.l() && !qs.this.F0);
                        }
                        if ((!qs.this.F0 || !z12 || qs.this.G0 == null || qs.this.G0.length != 1 || qs.this.G0[0] != 0) && (z12 || qs.this.H0 != qs.this.P0.f())) {
                            cVar.setData(c0.m(e10.h()));
                            return;
                        } else {
                            cVar.setData(R.string.CleaningUp);
                            return;
                        }
                    } else {
                        cVar.setData(R.string.Calculating);
                        return;
                    }
                case R.id.btn_paint:
                    if (qs.this.I0 == null) {
                        z11 = false;
                    }
                    cVar.X1(z11, z10);
                    cVar.setData(qs.this.I0 != null ? c0.m(qs.this.I0.p()) : w.i1(R.string.Calculating));
                    return;
                case R.id.btn_settings:
                    cVar.setEnabled(false);
                    cVar.setData(qs.this.I0 != null ? w.j1(R.string.format_approx, c0.m(qs.this.I0.r())) : w.i1(R.string.Calculating));
                    return;
                case R.id.btn_storagePath:
                    TdApi.TdlibParameters z42 = qs.this.f24495b.z4();
                    cVar.setData(z42 != null ? z42.filesDirectory : "Unavailable");
                    if (z42 == null || !raVar.b()) {
                        z11 = false;
                    }
                    cVar.setEnabled(z11);
                    return;
                default:
                    return;
            }
        }

        @Override
        public void h2(ra raVar, int i10, p0 p0Var, boolean z10) {
            w6.a aVar = (w6.a) raVar.d();
            if (aVar != null) {
                p0Var.i(aVar.k(), (!qs.this.F0 || !ib.b.j(qs.this.G0, raVar.m())) ? c0.m(aVar.h()) : w.i1(R.string.CleaningUp));
                p0Var.setTitleColorId(aVar.m() ? R.id.theme_color_textSecure : aVar.n() ? R.id.theme_color_textNeutral : R.id.theme_color_text);
                p0Var.f(aVar.c(), aVar.d());
            }
        }
    }

    public class b implements Runnable {
        public b() {
            qs.this = r1;
        }

        @Override
        public void run() {
            if (qs.this.O0 == this) {
                if (!qs.this.Sa() && qs.this.Ta()) {
                    qs.this.f24495b.v4().o(new TdApi.GetStorageStatisticsFast(), qs.this);
                }
                if (qs.this.M0) {
                    qs.this.f24495b.hd().postDelayed(this, 2500L);
                }
            }
        }
    }

    public class c implements hj.l {
        public c() {
            qs.this = r1;
        }

        @Override
        public void a() {
            nb nbVar = new nb(qs.this.f24493a, qs.this.f24495b);
            qs.this.Th();
            nbVar.get();
            qs.this.bc().R(nbVar, 0);
        }

        @Override
        public void b() {
            qs.this.bc().M().f();
            qs.this.Yh(true);
            qs.this.Ad(null);
        }
    }

    public qs(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public boolean Ah(View view, int i10) {
        if (i10 != R.id.btn_deleteFile) {
            return true;
        }
        if (!this.I0.h()) {
            Log.w("Failed to delete some emoji sets", new Object[0]);
        }
        Wh();
        return true;
    }

    public boolean Bh(View view, int i10) {
        if (i10 != R.id.btn_deleteFile) {
            return true;
        }
        if (!this.I0.e()) {
            Log.w("Failed to delete some emoji sets", new Object[0]);
        }
        Wh();
        return true;
    }

    public boolean Ch(View view, int i10) {
        if (i10 != R.id.btn_deleteFile) {
            return true;
        }
        if (!this.I0.g()) {
            Log.w("Failed to delete some emoji sets", new Object[0]);
        }
        Wh();
        return true;
    }

    public void Dh(int i10, SparseIntArray sparseIntArray) {
        if (sparseIntArray.get(R.id.btn_tdlib_resetLogSettings) == R.id.btn_tdlib_resetLogSettings) {
            i.c2().Q();
        }
        i.c2().M(new ps(this));
    }

    public void Eh(long j10) {
        if (!Sa()) {
            Zh(j10, false);
        }
    }

    public void Fh(TdApi.Object object) {
        if (object.getConstructor() == -186858780) {
            final long j10 = ((TdApi.OptionValueInteger) object).value;
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    qs.this.Eh(j10);
                }
            });
        }
    }

    public void Gh(b7 b7Var) {
        if (!Sa()) {
            cu w92 = w9();
            if (w92 != null) {
                w92.eh(b7Var);
            }
            ci(b7Var);
        }
    }

    public void Hh(TdApi.Object object) {
        uh(object, true);
    }

    public void Ih(w6 w6Var, boolean z10) {
        if (!Sa()) {
            boolean z11 = this.F0;
            bi(w6Var, z10);
            if (z11) {
                this.f24495b.v4().o(new TdApi.GetStorageStatisticsFast(), this);
            }
        }
    }

    public static int Jh(ra raVar, ra raVar2) {
        boolean D = raVar.D();
        boolean D2 = raVar2.D();
        long m10 = raVar.m();
        long m11 = raVar2.m();
        int l10 = raVar.l();
        int l11 = raVar2.l();
        if (D == D2) {
            int i10 = (m10 > m11 ? 1 : (m10 == m11 ? 0 : -1));
            if (i10 != 0) {
                if (i10 >= 0) {
                    return -1;
                }
            } else if (l10 < l11) {
                return -1;
            } else {
                if (l10 <= l11) {
                    return 0;
                }
            }
        } else if (D) {
            return -1;
        }
        return 1;
    }

    public void Kh(w6.a aVar, int i10, SparseIntArray sparseIntArray) {
        Uh(sparseIntArray, aVar);
    }

    public static void Lh(w6.a aVar, View view, int i10, ra raVar, TextView textView, iq iqVar) {
        textView.setText(w.j1(R.string.ClearX, c0.n(Mh(iqVar.y0(), aVar), false)).toUpperCase());
    }

    public static long Mh(SparseIntArray sparseIntArray, w6.a aVar) {
        int size = sparseIntArray.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            int rh = rh(sparseIntArray.keyAt(i10));
            if (!(rh == -1 || sparseIntArray.valueAt(i10) == 0)) {
                long b10 = aVar.i().b(rh, -1L);
                if (b10 != -1) {
                    j10 += b10;
                }
            }
        }
        return j10;
    }

    public static int rh(int i10) {
        switch (i10) {
            case R.id.btn_files:
                return 4;
            case R.id.btn_gifs:
                return 6;
            case R.id.btn_music:
                return 5;
            case R.id.btn_other:
                return 11;
            case R.id.btn_photos:
                return 0;
            case R.id.btn_profilePhotos:
                return 10;
            case R.id.btn_secretFiles:
                return 7;
            case R.id.btn_stickers:
                return 9;
            case R.id.btn_thumbnails:
                return 8;
            case R.id.btn_video:
                return 1;
            case R.id.btn_videoNote:
                return 3;
            case R.id.btn_voice:
                return 2;
            case R.id.btn_wallpaper:
                return 12;
            default:
                return -1;
        }
    }

    public boolean vh(View view, int i10) {
        if (i10 != R.id.btn_deleteFile) {
            return true;
        }
        i.c2().M(new ps(this));
        return true;
    }

    public boolean wh(View view, int i10) {
        switch (i10) {
            case R.id.btn_keepMedia_1month:
                Zh(2592000L, true);
                break;
            case R.id.btn_keepMedia_1week:
                Zh(604800L, true);
                break;
            case R.id.btn_keepMedia_3days:
                Zh(259200L, true);
                break;
            case R.id.btn_keepMedia_forever:
                Zh(0L, true);
                break;
        }
        return true;
    }

    public void xh() {
        g.b(f.h(), true);
        Wh();
    }

    public boolean yh(View view, int i10) {
        if (i10 != R.id.btn_deleteFile) {
            return true;
        }
        l.a().b(new Runnable() {
            @Override
            public final void run() {
                qs.this.xh();
            }
        });
        return true;
    }

    public boolean zh(View view, int i10) {
        if (i10 != R.id.btn_deleteFile) {
            return true;
        }
        if (!this.I0.f()) {
            Log.w("Failed to delete some junk", new Object[0]);
        }
        Wh();
        return true;
    }

    @Override
    public View G9() {
        return this.L0;
    }

    public final boolean Nh() {
        b7 b7Var = this.I0;
        return b7Var != null && b7Var.q() > 0;
    }

    @Override
    public void O6(b7 b7Var) {
        ci(b7Var);
    }

    public final boolean Oh() {
        b7 b7Var = this.I0;
        return b7Var != null && b7Var.j() > 0;
    }

    @Override
    public void P0(int i10) {
        if (i10 == R.id.btn_resetLocalData) {
            if (ih()) {
                this.f24495b.hd().T2(this, true, new c());
            } else {
                j0.y0(R.string.EraseDatabaseWait, 0);
            }
        }
    }

    public final boolean Ph() {
        b7 b7Var = this.I0;
        return b7Var != null && b7Var.l() > 0;
    }

    public final boolean Qh() {
        b7 b7Var;
        return i.c2().W1() || ((b7Var = this.I0) != null && b7Var.n() > 0);
    }

    @Override
    public int R9() {
        return R.id.controller_storageSettings;
    }

    public final boolean Rh() {
        b7 b7Var = this.I0;
        return b7Var != null && b7Var.o() > 0;
    }

    public final boolean Sh() {
        b7 b7Var = this.I0;
        return b7Var != null && b7Var.p() > 0;
    }

    public void Th() {
        Yh(false);
        if (this.T != null) {
            cu cuVar = new cu(this.f24493a, this.f24495b);
            Ad(cuVar);
            cuVar.get();
            this.T.R(cuVar, 0);
            wt wtVar = new wt(this.f24493a, this.f24495b);
            this.T.R(wtVar, 0);
            wtVar.get();
        }
        this.f24495b.v4().o(new TdApi.GetStorageStatisticsFast(), this);
        th(false);
    }

    public final void Uh(SparseIntArray sparseIntArray, w6.a aVar) {
        int rh;
        if (!(this.F0 || sparseIntArray.size() == 0)) {
            ArrayList arrayList = new ArrayList();
            int size = sparseIntArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = sparseIntArray.keyAt(i10);
                if (!(sparseIntArray.valueAt(i10) == 0 || (rh = rh(keyAt)) == -1)) {
                    switch (rh) {
                        case 0:
                            arrayList.add(new TdApi.FileTypePhoto());
                            continue;
                        case 1:
                            arrayList.add(new TdApi.FileTypeVideo());
                            continue;
                        case 2:
                            arrayList.add(new TdApi.FileTypeVoiceNote());
                            continue;
                        case 3:
                            arrayList.add(new TdApi.FileTypeVideoNote());
                            continue;
                        case 4:
                            arrayList.add(new TdApi.FileTypeDocument());
                            continue;
                        case 5:
                            arrayList.add(new TdApi.FileTypeAudio());
                            continue;
                        case 6:
                            arrayList.add(new TdApi.FileTypeAnimation());
                            continue;
                        case 7:
                            arrayList.add(new TdApi.FileTypeSecret());
                            continue;
                        case 8:
                            arrayList.add(new TdApi.FileTypeThumbnail());
                            continue;
                        case 9:
                            arrayList.add(new TdApi.FileTypeSticker());
                            continue;
                        case 10:
                            arrayList.add(new TdApi.FileTypeProfilePhoto());
                            continue;
                        case 11:
                            arrayList.add(new TdApi.FileTypeUnknown());
                            continue;
                        case 12:
                            arrayList.add(new TdApi.FileTypeWallpaper());
                            continue;
                        default:
                            throw new IllegalArgumentException("key == " + rh);
                    }
                }
            }
            TdApi.FileType[] fileTypeArr = new TdApi.FileType[arrayList.size()];
            arrayList.toArray(fileTypeArr);
            long[] j10 = aVar.j();
            long[] f10 = aVar.f();
            if (Xh(true, j10, aVar)) {
                kg().setItemAnimator(null);
                ImageLoader.e().c(this.f24495b.A6(), false);
                this.N0 = false;
                this.f24495b.v4().o(new TdApi.OptimizeStorage(0L, 0, 0, 0, fileTypeArr, j10, f10, false, 0), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        qs.this.Hh(object);
                    }
                });
            }
        }
    }

    public final void uh(TdApi.Object object, final boolean z10) {
        if (object.getConstructor() != 217237013) {
            r2(object);
            return;
        }
        final w6 w6Var = new w6(this.f24495b, (TdApi.StorageStatistics) object);
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                qs.this.Ih(w6Var, z10);
            }
        });
    }

    @Override
    public int W9() {
        if (this.f24495b != null) {
            return R.id.menu_more;
        }
        return 0;
    }

    public final void Wh() {
        if (!Sa()) {
            this.f24495b.v4().o(new TdApi.GetStorageStatisticsFast(), this);
        }
    }

    @Override
    public CharSequence X9() {
        return w.i1(R.string.StorageUsage);
    }

    public final boolean Xh(boolean z10, long[] jArr, w6.a aVar) {
        if (this.F0 == z10) {
            return false;
        }
        this.F0 = z10;
        this.D0.p3(R.id.btn_localDatabase);
        this.D0.p3(R.id.btn_clearCache);
        this.D0.p3(R.id.btn_logsSize);
        long[] jArr2 = this.G0;
        this.G0 = jArr;
        this.H0 = aVar;
        if (jArr2 != null) {
            for (long j10 : jArr2) {
                if (j10 != 0) {
                    this.D0.q3(j10);
                } else {
                    this.D0.p3(R.id.btn_otherChats);
                }
            }
        }
        if (jArr == null) {
            return true;
        }
        for (long j11 : jArr) {
            if (j11 != 0) {
                this.D0.q3(j11);
            } else {
                this.D0.p3(R.id.btn_otherChats);
            }
        }
        return true;
    }

    public final void Yh(boolean z10) {
        if (this.K0 != z10) {
            this.K0 = z10;
            this.D0.p3(R.id.btn_localDatabase);
            this.D0.p3(R.id.btn_clearCache);
        }
    }

    @Override
    public void Z8() {
        super.Z8();
        t1.b().d(this);
        t1.b().d(this.D0);
    }

    public final void Zh(long j10, boolean z10) {
        if (this.J0 != j10 && !Sa()) {
            this.J0 = j10;
            this.D0.p3(R.id.btn_keepMedia);
            if (z10) {
                this.f24495b.v4().o(new TdApi.SetOption("storage_max_time_from_last_access", new TdApi.OptionValueInteger(j10)), this.f24495b.na());
                this.f24495b.v4().o(new TdApi.SetOption("use_storage_optimizer", new TdApi.OptionValueBoolean(j10 != 0)), this.f24495b.na());
            }
        }
    }

    public final void ai(boolean z10) {
        if (this.M0 != z10) {
            this.M0 = z10;
            if (z10) {
                b bVar = new b();
                this.O0 = bVar;
                bVar.run();
                return;
            }
            this.f24495b.hd().removeCallbacks(this.O0);
            this.O0 = null;
        }
    }

    @Override
    public void b4() {
        s1.a(this);
    }

    public final void bi(w6 w6Var, boolean z10) {
        boolean z11;
        int i10;
        w6 w6Var2 = this.P0;
        Xh(false, null, null);
        this.P0 = w6Var;
        n9();
        this.D0.p3(R.id.btn_clearCache);
        this.D0.p3(R.id.btn_localDatabase);
        if (z10) {
            th(false);
            int L0 = this.D0.L0(R.id.btn_clearCacheHint);
            if (L0 == -1) {
                iq iqVar = this.D0;
                iqVar.s0(iqVar.D(), new ra(9, R.id.btn_clearCacheHint, 0, R.string.ClearCacheHint2));
            } else if (this.D0.C0(L0).Y(R.string.ClearCacheHint2)) {
                this.D0.I(L0);
            }
        } else {
            this.D0.k1(R.id.btn_clearCacheHint);
        }
        ArrayList<w6.a> b10 = w6Var.b();
        List<ra> D0 = this.D0.D0();
        int size = D0.size();
        if (w6Var2 == null || this.E0 >= D0.size()) {
            z11 = false;
        } else {
            int i11 = size - 1;
            z11 = false;
            while (i11 >= this.E0) {
                D0.remove(i11);
                i11--;
                z11 = true;
            }
        }
        if (!b10.isEmpty()) {
            w6.a e10 = w6Var.e();
            w6Var.f();
            Iterator<w6.a> it = b10.iterator();
            boolean z12 = true;
            int i12 = 0;
            while (true) {
                boolean hasNext = it.hasNext();
                i10 = R.string.Chats;
                if (!hasNext) {
                    break;
                }
                w6.a next = it.next();
                if (!next.l()) {
                    if (z12) {
                        D0.add(new ra(8, R.id.chatsStorageUsageList, 0, R.string.Chats));
                        D0.add(new ra(2));
                        z12 = false;
                    } else {
                        D0.add(new ra(1));
                    }
                    D0.add(new ra(46, R.id.chat, 0, 0).N(next.g()).G(next));
                    i12++;
                }
            }
            if (!e10.l()) {
                if (z12) {
                    D0.add(new ra(8, R.id.chatsStorageUsageList, 0, R.string.Chats));
                    D0.add(new ra(2));
                    z12 = false;
                } else {
                    D0.add(new ra(11));
                }
                if (!b10.isEmpty()) {
                    i10 = R.string.OtherChats;
                }
                D0.add(new ra(89, R.id.btn_otherChats, 0, i10));
                if (!this.N0 && i12 == 15) {
                    D0.add(new ra(11));
                    D0.add(new ra(4, R.id.btn_showOtherChats, 0, R.string.ShowOtherChats));
                }
            }
            if (!z12) {
                D0.add(new ra(3));
            }
            if (w6Var2 != null) {
                int size2 = D0.size();
                if (size == size2) {
                    iq iqVar2 = this.D0;
                    int i13 = this.E0;
                    iqVar2.L(i13, size2 - i13);
                    return;
                }
                iq iqVar3 = this.D0;
                int i14 = this.E0;
                iqVar3.L(i14, Math.min(size2 - i14, size - i14));
                if (size2 > size) {
                    this.D0.M(size, size2 - size);
                } else {
                    this.D0.N(size2, size - size2);
                }
            } else {
                this.D0.M(this.E0, D0.size() - this.E0);
            }
        } else if (z11) {
            iq iqVar4 = this.D0;
            int i15 = this.E0;
            iqVar4.N(i15, size - i15);
        }
    }

    public final void ci(b7 b7Var) {
        if (!Sa()) {
            this.I0 = b7Var;
            if (this.D0 != null) {
                fi();
            }
        }
    }

    @Override
    public boolean dc() {
        return this.P0 == null;
    }

    public final void di() {
        if (!this.N0) {
            this.N0 = true;
            th(false);
        }
    }

    @Override
    public void e2() {
        View view = this.L0;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void ei(int r26, final hd.w6.a r27) {
        throw new UnsupportedOperationException("Method not decompiled: de.qs.ei(int, hd.w6$a):void");
    }

    public final void fi() {
        this.D0.p3(R.id.btn_localDatabase);
        this.D0.p3(R.id.btn_settings);
        this.D0.p3(R.id.btn_languageSettings);
        jh();
        kh();
        oh();
        nh();
        ph();
        mh();
    }

    public final boolean ih() {
        return this.P0 != null && !this.K0 && !this.F0;
    }

    public final void jh() {
        lh(R.id.btn_camera, R.string.InAppCameraCache, Nh());
    }

    public final void kh() {
        lh(R.id.btn_emoji, R.string.EmojiSets, Oh());
    }

    public final void lh(int i10, int i11, boolean z10) {
        int L0 = this.D0.L0(i10);
        if ((L0 != -1) != z10) {
            if (z10) {
                int L02 = this.D0.L0(R.id.btn_localDatabase);
                if (L02 != -1) {
                    this.D0.D0().add(L02, new ra(11));
                    this.D0.D0().add(L02, new ra(89, i10, 0, i11));
                    this.D0.M(L02, 2);
                    this.E0 += 2;
                    return;
                }
                throw new AssertionError();
            }
            this.D0.R1(L0, 2);
            this.E0 -= 2;
        } else if (z10) {
            this.D0.r3(L0);
        }
    }

    public final void mh() {
        lh(R.id.btn_junk, R.string.JunkFiles, Ph());
    }

    public final void nh() {
        lh(R.id.btn_logsSize, R.string.LogFiles, Qh());
        qh();
    }

    public final void oh() {
        lh(R.id.btn_lottie, R.string.AnimatedStickers, Rh());
    }

    @Override
    public void onClick(View view) {
        w6.a aVar;
        ra raVar;
        w6.a aVar2;
        switch (view.getId()) {
            case R.id.btn_camera:
                if (this.I0 != null) {
                    ee(w.i1(R.string.InAppCameraCacheDeleteConfirm), new int[]{R.id.btn_deleteFile, R.id.btn_cancel}, new String[]{w.j1(R.string.ClearX, c0.m(this.I0.q())), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new h0() {
                        @Override
                        public boolean P() {
                            return g0.a(this);
                        }

                        @Override
                        public Object a2(int i10) {
                            return g0.b(this, i10);
                        }

                        @Override
                        public final boolean r3(View view2, int i10) {
                            boolean Ah;
                            Ah = qs.this.Ah(view2, i10);
                            return Ah;
                        }
                    });
                    return;
                }
                return;
            case R.id.btn_clearCache:
            case R.id.btn_otherChats:
            case R.id.btn_otherFiles:
                if (!this.K0 && this.P0 != null && !this.F0) {
                    int id2 = view.getId();
                    if (id2 == R.id.btn_clearCache) {
                        aVar = this.P0.g();
                    } else {
                        aVar = id2 == R.id.btn_otherChats ? this.P0.e() : this.P0.f();
                    }
                    ei(R.id.btn_otherChats, aVar);
                    return;
                }
                return;
            case R.id.btn_emoji:
                if (this.I0 != null) {
                    ee(w.i1(R.string.EmojiSetsInfo), new int[]{R.id.btn_deleteFile, R.id.btn_cancel}, new String[]{w.j1(R.string.ClearX, c0.m(this.I0.k())), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new h0() {
                        @Override
                        public boolean P() {
                            return g0.a(this);
                        }

                        @Override
                        public Object a2(int i10) {
                            return g0.b(this, i10);
                        }

                        @Override
                        public final boolean r3(View view2, int i10) {
                            boolean Bh;
                            Bh = qs.this.Bh(view2, i10);
                            return Bh;
                        }
                    });
                    return;
                }
                return;
            case R.id.btn_junk:
                if (this.I0 != null) {
                    ee(w.i1(R.string.JunkFilesInfo), new int[]{R.id.btn_deleteFile, R.id.btn_cancel}, new String[]{w.j1(R.string.ClearX, c0.m(this.I0.l())), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new h0() {
                        @Override
                        public boolean P() {
                            return g0.a(this);
                        }

                        @Override
                        public Object a2(int i10) {
                            return g0.b(this, i10);
                        }

                        @Override
                        public final boolean r3(View view2, int i10) {
                            boolean zh;
                            zh = qs.this.zh(view2, i10);
                            return zh;
                        }
                    });
                    return;
                }
                return;
            case R.id.btn_keepMedia:
                je(new int[]{R.id.btn_keepMedia_3days, R.id.btn_keepMedia_1week, R.id.btn_keepMedia_1month, R.id.btn_keepMedia_forever}, new String[]{w.o2(R.string.xDays, 3L), w.o2(R.string.xWeeks, 1L), w.o2(R.string.xMonths, 1L), w.i1(R.string.KeepMediaForever)}, new h0() {
                    @Override
                    public boolean P() {
                        return g0.a(this);
                    }

                    @Override
                    public Object a2(int i10) {
                        return g0.b(this, i10);
                    }

                    @Override
                    public final boolean r3(View view2, int i10) {
                        boolean wh;
                        wh = qs.this.wh(view2, i10);
                        return wh;
                    }
                });
                return;
            case R.id.btn_localDatabase:
                Mc(R.string.LocalDatabaseExcuse);
                return;
            case R.id.btn_logsSize:
                if (this.I0 != null) {
                    if (i.c2().W1()) {
                        me(new f2(R.id.btn_logsSize).b(w.i1(R.string.AppLogsClear)).q(R.id.theme_color_textNegative).s(w.j1(R.string.ClearX, c0.m(this.I0.n()))).p(new ra[]{new ra(12, (int) R.id.btn_tdlib_resetLogSettings, 0, (int) R.string.AppLogsDisable, false)}).j(new v4.r() {
                            @Override
                            public final void l6(int i10, SparseIntArray sparseIntArray) {
                                qs.this.Dh(i10, sparseIntArray);
                            }
                        }));
                        return;
                    } else {
                        ee(w.i1(R.string.AppLogsClear), new int[]{R.id.btn_deleteFile, R.id.btn_cancel}, new String[]{w.j1(R.string.ClearX, c0.m(this.I0.n())), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new h0() {
                            @Override
                            public boolean P() {
                                return g0.a(this);
                            }

                            @Override
                            public Object a2(int i10) {
                                return g0.b(this, i10);
                            }

                            @Override
                            public final boolean r3(View view2, int i10) {
                                boolean vh;
                                vh = qs.this.vh(view2, i10);
                                return vh;
                            }
                        });
                        return;
                    }
                } else {
                    return;
                }
            case R.id.btn_lottie:
                if (this.I0 != null) {
                    ee(w.i1(R.string.AnimatedStickersInfo), new int[]{R.id.btn_deleteFile, R.id.btn_cancel}, new String[]{w.j1(R.string.ClearX, c0.m(this.I0.o())), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new h0() {
                        @Override
                        public boolean P() {
                            return g0.a(this);
                        }

                        @Override
                        public Object a2(int i10) {
                            return g0.b(this, i10);
                        }

                        @Override
                        public final boolean r3(View view2, int i10) {
                            boolean Ch;
                            Ch = qs.this.Ch(view2, i10);
                            return Ch;
                        }
                    });
                    return;
                }
                return;
            case R.id.btn_paint:
                if (this.I0 != null) {
                    ee(w.i1(R.string.PaintsInfo), new int[]{R.id.btn_deleteFile, R.id.btn_cancel}, new String[]{w.j1(R.string.ClearX, c0.m(this.I0.p())), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new h0() {
                        @Override
                        public boolean P() {
                            return g0.a(this);
                        }

                        @Override
                        public Object a2(int i10) {
                            return g0.b(this, i10);
                        }

                        @Override
                        public final boolean r3(View view2, int i10) {
                            boolean yh;
                            yh = qs.this.yh(view2, i10);
                            return yh;
                        }
                    });
                    return;
                }
                return;
            case R.id.btn_showOtherChats:
                di();
                return;
            case R.id.chat:
                if (!this.K0 && (raVar = (ra) view.getTag()) != null && !this.F0 && (aVar2 = (w6.a) raVar.d()) != null) {
                    ei(R.id.chat, aVar2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public boolean pg() {
        return true;
    }

    public final void ph() {
        lh(R.id.btn_paint, R.string.Paints, Sh());
    }

    public final void qh() {
        ai(Ta() && this.f24495b != null && i.c2().W1());
    }

    @Override
    public void r2(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor == -884922271) {
            final b7 b7Var = new b7((TdApi.StorageStatisticsFast) object, this.I0);
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    qs.this.Gh(b7Var);
                }
            });
        } else if (constructor == 217237013) {
            uh(object, false);
        }
    }

    @Override
    public void rg(Context context, CustomRecyclerView customRecyclerView) {
        t1.b().a(this);
        if (this.f24495b.F4().q1()) {
            s sVar = new s(context);
            sVar.setThemedTextColor(this);
            sVar.A1(a0.i(49.0f), true);
            sVar.setTitle(X9());
            sVar.setSubtitle(this.f24495b.A1().u());
            this.L0 = sVar;
        }
        cu w92 = w9();
        if (w92 != null) {
            this.I0 = w92.Vg();
        }
        this.D0 = new a(this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ra(89, R.id.btn_keepMedia, 0, R.string.KeepMedia));
        arrayList.add(new ra(3));
        arrayList.add(new ra(9, 0, 0, c0.Z(w.i1(R.string.KeepMediaInfo), R.id.theme_color_background_textLight), false));
        arrayList.add(new ra(2));
        arrayList.add(new ra(89, R.id.btn_settings, 0, R.string.SettingsAndThemes));
        arrayList.add(new ra(11));
        arrayList.add(new ra(89, R.id.btn_languageSettings, 0, R.string.LanguageDatabase));
        arrayList.add(new ra(11));
        if (Nh()) {
            arrayList.add(new ra(89, R.id.btn_camera, 0, R.string.InAppCameraCache));
            arrayList.add(new ra(11));
        }
        if (Oh()) {
            arrayList.add(new ra(89, R.id.btn_emoji, 0, R.string.EmojiSets));
            arrayList.add(new ra(11));
        }
        if (Rh()) {
            arrayList.add(new ra(89, R.id.btn_lottie, 0, R.string.AnimatedStickers));
            arrayList.add(new ra(11));
        }
        if (Qh()) {
            arrayList.add(new ra(89, R.id.btn_logsSize, 0, R.string.LogFiles));
            arrayList.add(new ra(11));
        }
        if (Sh()) {
            arrayList.add(new ra(89, R.id.btn_paint, 0, R.string.Paints));
            arrayList.add(new ra(11));
        }
        if (Ph()) {
            arrayList.add(new ra(89, R.id.btn_junk, 0, R.string.JunkFiles));
            arrayList.add(new ra(11));
        }
        arrayList.add(new ra(89, R.id.btn_localDatabase, 0, R.string.LocalDatabase));
        arrayList.add(new ra(11));
        arrayList.add(new ra(89, R.id.btn_clearCache, 0, R.string.MediaAndFiles));
        arrayList.add(new ra(3));
        this.E0 = arrayList.size();
        arrayList.add(new ra(9, R.id.btn_clearCacheHint, 0, R.string.ClearCacheHint));
        this.D0.s2(arrayList, false);
        customRecyclerView.setAdapter(this.D0);
        if (this.I0 == null) {
            if (w92 != null) {
                w92.fh(this);
            } else {
                this.f24495b.v4().o(new TdApi.GetStorageStatisticsFast(), this);
            }
        }
        t1.b().a(this.D0);
        this.f24495b.v4().o(new TdApi.GetOption("storage_max_time_from_last_access"), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                qs.this.Fh(object);
            }
        });
        th(true);
        this.f24495b.hd().postDelayed(new Runnable() {
            @Override
            public final void run() {
                qs.this.n9();
            }
        }, 500L);
    }

    public final int sh(boolean z10) {
        if (z10) {
            return 0;
        }
        return this.N0 ? 1000 : 15;
    }

    @Override
    public void tc() {
        super.tc();
        qh();
    }

    @Override
    public void tg() {
        if (ih()) {
            Yd(new int[]{R.id.btn_resetLocalData}, new String[]{w.i1(R.string.EraseDatabase)}, 0);
        } else {
            j0.y0(R.string.EraseDatabaseWait, 0);
        }
    }

    public final void th(final boolean z10) {
        this.f24495b.v4().o(new TdApi.GetStorageStatistics(sh(z10)), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                qs.this.uh(z10, object);
            }
        });
    }
}
