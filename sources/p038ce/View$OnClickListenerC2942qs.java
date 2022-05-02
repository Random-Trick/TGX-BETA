package p038ce;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import be.C1357a0;
import be.C1363c0;
import be.C1379j0;
import gd.C4596b7;
import gd.C4826w6;
import ge.C4868i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.C6992p0;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.loader.ImageLoader;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import p038ce.View$OnClickListenerC2204bu;
import p082fd.C4383l;
import p082fd.C4403w;
import p108hb.C5062b;
import p108hb.C5068g;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p254rd.C8431f;
import p350yd.C10930q6;
import p350yd.C11031u1;
import p350yd.C11052v1;
import p350yd.HandlerC10770jj;
import tc.C9137c;
import td.AbstractC9213j1;
import td.AbstractC9323v4;
import td.C9188f2;
import td.C9289s;

public class View$OnClickListenerC2942qs extends AbstractC3204vo<View$OnClickListenerC2204bu> implements View.OnClickListener, Client.AbstractC7865g, View$OnClickListenerC2204bu.AbstractC2207c, AbstractC9213j1, C11052v1.AbstractC11053a {
    public C2546iq f9784D0;
    public int f9785E0;
    public boolean f9786F0;
    public long[] f9787G0;
    public C4826w6.C4827a f9788H0;
    public C4596b7 f9789I0;
    public long f9790J0;
    public boolean f9791K0;
    public View f9792L0;
    public boolean f9793M0;
    public boolean f9794N0;
    public Runnable f9795O0;
    public C4826w6 f9796P0;

    public class C2943a extends C2546iq {
        public C2943a(AbstractC9323v4 v4Var) {
            super(v4Var);
            View$OnClickListenerC2942qs.this = r1;
        }

        @Override
        public void mo394V2(C2964ra raVar, C9137c cVar, boolean z) {
            String str;
            long j = 0;
            boolean z2 = true;
            switch (raVar.m32838j()) {
                case R.id.btn_camera:
                    if (View$OnClickListenerC2942qs.this.f9789I0 == null || View$OnClickListenerC2942qs.this.f9789I0.m27076q() <= 0) {
                        z2 = false;
                    }
                    cVar.m10207Y1(z2, z);
                    cVar.setData(View$OnClickListenerC2942qs.this.f9789I0 != null ? C1363c0.m37426m(View$OnClickListenerC2942qs.this.f9789I0.m27076q()) : C4403w.m27871i1(R.string.Calculating));
                    return;
                case R.id.btn_clearCache:
                    if (View$OnClickListenerC2942qs.this.f9796P0 != null) {
                        if (z) {
                            if (View$OnClickListenerC2942qs.this.f9796P0.m25146i() || View$OnClickListenerC2942qs.this.f9786F0) {
                                z2 = false;
                            }
                            cVar.setEnabledAnimated(z2);
                        } else {
                            if (View$OnClickListenerC2942qs.this.f9796P0.m25146i() || View$OnClickListenerC2942qs.this.f9786F0) {
                                z2 = false;
                            }
                            cVar.setEnabled(z2);
                        }
                        if (View$OnClickListenerC2942qs.this.f9786F0) {
                            cVar.setData(R.string.CleaningUp);
                            return;
                        } else {
                            cVar.setData(View$OnClickListenerC2942qs.this.f9796P0.m25151d());
                            return;
                        }
                    } else {
                        cVar.setData(R.string.Calculating);
                        return;
                    }
                case R.id.btn_emoji:
                    if (View$OnClickListenerC2942qs.this.f9789I0 == null || View$OnClickListenerC2942qs.this.f9789I0.m27082k() <= 0) {
                        z2 = false;
                    }
                    cVar.m10207Y1(z2, z);
                    cVar.setData(View$OnClickListenerC2942qs.this.f9789I0 != null ? C1363c0.m37426m(View$OnClickListenerC2942qs.this.f9789I0.m27083j()) : C4403w.m27871i1(R.string.Calculating));
                    return;
                case R.id.btn_junk:
                    if (View$OnClickListenerC2942qs.this.f9789I0 == null) {
                        z2 = false;
                    }
                    cVar.m10207Y1(z2, z);
                    cVar.setData(View$OnClickListenerC2942qs.this.f9789I0 != null ? C1363c0.m37426m(View$OnClickListenerC2942qs.this.f9789I0.m27081l()) : C4403w.m27871i1(R.string.Calculating));
                    return;
                case R.id.btn_keepMedia:
                    cVar.setData(View$OnClickListenerC2942qs.this.f9790J0 == 0 ? C4403w.m27871i1(R.string.KeepMediaForever) : C4403w.m27816w0((int) View$OnClickListenerC2942qs.this.f9790J0, 0, 0, false));
                    return;
                case R.id.btn_languageSettings:
                    cVar.setEnabled(false);
                    cVar.setData(View$OnClickListenerC2942qs.this.f9789I0 != null ? C1363c0.m37426m(View$OnClickListenerC2942qs.this.f9789I0.m27080m()) : C4403w.m27871i1(R.string.Calculating));
                    return;
                case R.id.btn_localDatabase:
                    if (View$OnClickListenerC2942qs.this.f9789I0 == null) {
                        z2 = false;
                    }
                    cVar.m10207Y1(z2, z);
                    if (View$OnClickListenerC2942qs.this.f9789I0 != null) {
                        C4596b7 b7Var = View$OnClickListenerC2942qs.this.f9789I0;
                        if (View$OnClickListenerC2942qs.this.f9796P0 != null) {
                            j = View$OnClickListenerC2942qs.this.f9796P0.m25152c();
                        }
                        str = C1363c0.m37426m(b7Var.m27084i(j));
                    } else {
                        str = C4403w.m27871i1(R.string.Calculating);
                    }
                    cVar.setData(str);
                    return;
                case R.id.btn_logsSize:
                    if (View$OnClickListenerC2942qs.this.f9789I0 == null) {
                        z2 = false;
                    }
                    cVar.m10207Y1(z2, z);
                    cVar.setData(View$OnClickListenerC2942qs.this.f9789I0 != null ? C1363c0.m37426m(View$OnClickListenerC2942qs.this.f9789I0.m27079n()) : C4403w.m27871i1(R.string.Calculating));
                    return;
                case R.id.btn_lottie:
                    if (View$OnClickListenerC2942qs.this.f9789I0 == null) {
                        z2 = false;
                    }
                    cVar.m10207Y1(z2, z);
                    cVar.setData(View$OnClickListenerC2942qs.this.f9789I0 != null ? C1363c0.m37426m(View$OnClickListenerC2942qs.this.f9789I0.m27078o()) : C4403w.m27871i1(R.string.Calculating));
                    return;
                case R.id.btn_otherChats:
                case R.id.btn_otherFiles:
                    if (View$OnClickListenerC2942qs.this.f9796P0 != null) {
                        boolean z3 = raVar.m32838j() == R.id.btn_otherChats;
                        C4826w6 w6Var = View$OnClickListenerC2942qs.this.f9796P0;
                        C4826w6.C4827a e = z3 ? w6Var.m25150e() : w6Var.m25149f();
                        if (z) {
                            cVar.setEnabledAnimated(!e.m25132l() && !View$OnClickListenerC2942qs.this.f9786F0);
                        } else {
                            cVar.setEnabled(!e.m25132l() && !View$OnClickListenerC2942qs.this.f9786F0);
                        }
                        if ((!View$OnClickListenerC2942qs.this.f9786F0 || !z3 || View$OnClickListenerC2942qs.this.f9787G0 == null || View$OnClickListenerC2942qs.this.f9787G0.length != 1 || View$OnClickListenerC2942qs.this.f9787G0[0] != 0) && (z3 || View$OnClickListenerC2942qs.this.f9788H0 != View$OnClickListenerC2942qs.this.f9796P0.m25149f())) {
                            cVar.setData(C1363c0.m37426m(e.m25136h()));
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
                    if (View$OnClickListenerC2942qs.this.f9789I0 == null) {
                        z2 = false;
                    }
                    cVar.m10207Y1(z2, z);
                    cVar.setData(View$OnClickListenerC2942qs.this.f9789I0 != null ? C1363c0.m37426m(View$OnClickListenerC2942qs.this.f9789I0.m27077p()) : C4403w.m27871i1(R.string.Calculating));
                    return;
                case R.id.btn_settings:
                    cVar.setEnabled(false);
                    cVar.setData(View$OnClickListenerC2942qs.this.f9789I0 != null ? C4403w.m27867j1(R.string.format_approx, C1363c0.m37426m(View$OnClickListenerC2942qs.this.f9789I0.m27075r())) : C4403w.m27871i1(R.string.Calculating));
                    return;
                case R.id.btn_storagePath:
                    TdApi.TdlibParameters v4 = View$OnClickListenerC2942qs.this.f30170b.m2206v4();
                    cVar.setData(v4 != null ? v4.filesDirectory : "Unavailable");
                    if (v4 == null || !raVar.m32851b()) {
                        z2 = false;
                    }
                    cVar.setEnabled(z2);
                    return;
                default:
                    return;
            }
        }

        @Override
        public void mo32880m2(C2964ra raVar, int i, C6992p0 p0Var, boolean z) {
            C4826w6.C4827a aVar = (C4826w6.C4827a) raVar.m32847d();
            if (aVar != null) {
                p0Var.m18140i(aVar.m25133k(), (!View$OnClickListenerC2942qs.this.f9786F0 || !C5062b.m24163j(View$OnClickListenerC2942qs.this.f9787G0, raVar.m32835m())) ? C1363c0.m37426m(aVar.m25136h()) : C4403w.m27871i1(R.string.CleaningUp));
                p0Var.setTitleColorId(aVar.m25131m() ? R.id.theme_color_textSecure : aVar.m25130n() ? R.id.theme_color_textNeutral : R.id.theme_color_text);
                p0Var.m18143f(aVar.m25141c(), aVar.m25140d());
            }
        }
    }

    public class RunnableC2944b implements Runnable {
        public RunnableC2944b() {
            View$OnClickListenerC2942qs.this = r1;
        }

        @Override
        public void run() {
            if (View$OnClickListenerC2942qs.this.f9795O0 == this) {
                if (!View$OnClickListenerC2942qs.this.m9347Sa() && View$OnClickListenerC2942qs.this.m9339Ta()) {
                    View$OnClickListenerC2942qs.this.f30170b.m2270r4().m14783o(new TdApi.GetStorageStatisticsFast(), View$OnClickListenerC2942qs.this);
                }
                if (View$OnClickListenerC2942qs.this.f9793M0) {
                    View$OnClickListenerC2942qs.this.f30170b.m2485dd().postDelayed(this, 2500L);
                }
            }
        }
    }

    public class C2945c implements HandlerC10770jj.AbstractC10782l {
        public C2945c() {
            View$OnClickListenerC2942qs.this = r1;
        }

        @Override
        public void mo3341a() {
            C2760nb nbVar = new C2760nb(View$OnClickListenerC2942qs.this.f30168a, View$OnClickListenerC2942qs.this.f30170b);
            View$OnClickListenerC2942qs.this.m32925Th();
            nbVar.get();
            View$OnClickListenerC2942qs.this.m9284bc().m9742R(nbVar, 0);
        }

        @Override
        public void mo3340b() {
            View$OnClickListenerC2942qs.this.m9284bc().m9748M().m9507f();
            View$OnClickListenerC2942qs.this.m32915Yh(true);
            View$OnClickListenerC2942qs.this.m9476Ad(null);
        }
    }

    public View$OnClickListenerC2942qs(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public boolean m32964Ah(View view, int i) {
        if (i != R.id.btn_deleteFile) {
            return true;
        }
        if (!this.f9789I0.m27085h()) {
            Log.m14709w("Failed to delete some emoji sets", new Object[0]);
        }
        m32919Wh();
        return true;
    }

    public boolean m32962Bh(View view, int i) {
        if (i != R.id.btn_deleteFile) {
            return true;
        }
        if (!this.f9789I0.m27088e()) {
            Log.m14709w("Failed to delete some emoji sets", new Object[0]);
        }
        m32919Wh();
        return true;
    }

    public boolean m32960Ch(View view, int i) {
        if (i != R.id.btn_deleteFile) {
            return true;
        }
        if (!this.f9789I0.m27086g()) {
            Log.m14709w("Failed to delete some emoji sets", new Object[0]);
        }
        m32919Wh();
        return true;
    }

    public void m32958Dh(int i, SparseIntArray sparseIntArray) {
        if (sparseIntArray.get(R.id.btn_tdlib_resetLogSettings) == R.id.btn_tdlib_resetLogSettings) {
            C4868i.m24727c2().m24816Q();
        }
        C4868i.m24727c2().m24844M(new RunnableC2892ps(this));
    }

    public void m32956Eh(long j) {
        if (!m9347Sa()) {
            m32913Zh(j, false);
        }
    }

    public void m32954Fh(TdApi.Object object) {
        if (object.getConstructor() == -186858780) {
            final long j = ((TdApi.OptionValueInteger) object).value;
            this.f30170b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2942qs.this.m32956Eh(j);
                }
            });
        }
    }

    public void m32952Gh(C4596b7 b7Var) {
        if (!m9347Sa()) {
            View$OnClickListenerC2204bu w9 = m9139w9();
            if (w9 != null) {
                w9.m35363eh(b7Var);
            }
            m32907ci(b7Var);
        }
    }

    public void m32950Hh(TdApi.Object object) {
        m32886uh(object, true);
    }

    public void m32948Ih(C4826w6 w6Var, boolean z) {
        if (!m9347Sa()) {
            boolean z2 = this.f9786F0;
            m32909bi(w6Var, z);
            if (z2) {
                this.f30170b.m2270r4().m14783o(new TdApi.GetStorageStatisticsFast(), this);
            }
        }
    }

    public static int m32946Jh(C2964ra raVar, C2964ra raVar2) {
        boolean D = raVar.m32876D();
        boolean D2 = raVar2.m32876D();
        long m = raVar.m32835m();
        long m2 = raVar2.m32835m();
        int l = raVar.m32836l();
        int l2 = raVar2.m32836l();
        if (D == D2) {
            int i = (m > m2 ? 1 : (m == m2 ? 0 : -1));
            if (i != 0) {
                if (i >= 0) {
                    return -1;
                }
            } else if (l < l2) {
                return -1;
            } else {
                if (l <= l2) {
                    return 0;
                }
            }
        } else if (D) {
            return -1;
        }
        return 1;
    }

    public void m32944Kh(C4826w6.C4827a aVar, int i, SparseIntArray sparseIntArray) {
        m32923Uh(sparseIntArray, aVar);
    }

    public static void m32942Lh(C4826w6.C4827a aVar, View view, int i, C2964ra raVar, TextView textView, C2546iq iqVar) {
        textView.setText(C4403w.m27867j1(R.string.ClearX, C1363c0.m37424n(m32940Mh(iqVar.m34255A0(), aVar), false)).toUpperCase());
    }

    public static long m32940Mh(SparseIntArray sparseIntArray, C4826w6.C4827a aVar) {
        int size = sparseIntArray.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            int rh = m32889rh(sparseIntArray.keyAt(i));
            if (!(rh == -1 || sparseIntArray.valueAt(i) == 0)) {
                long b = aVar.m25135i().m23238b(rh, -1L);
                if (b != -1) {
                    j += b;
                }
            }
        }
        return j;
    }

    public static int m32889rh(int i) {
        switch (i) {
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

    public boolean m32885vh(View view, int i) {
        if (i != R.id.btn_deleteFile) {
            return true;
        }
        C4868i.m24727c2().m24844M(new RunnableC2892ps(this));
        return true;
    }

    public boolean m32884wh(View view, int i) {
        switch (i) {
            case R.id.btn_keepMedia_1month:
                m32913Zh(2592000L, true);
                break;
            case R.id.btn_keepMedia_1week:
                m32913Zh(604800L, true);
                break;
            case R.id.btn_keepMedia_3days:
                m32913Zh(259200L, true);
                break;
            case R.id.btn_keepMedia_forever:
                m32913Zh(0L, true);
                break;
        }
        return true;
    }

    public void m32883xh() {
        C5068g.m24102b(C8431f.m12494h(), true);
        m32919Wh();
    }

    public boolean m32882yh(View view, int i) {
        if (i != R.id.btn_deleteFile) {
            return true;
        }
        C4383l.m28061a().m28060b(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2942qs.this.m32883xh();
            }
        });
        return true;
    }

    public boolean m32881zh(View view, int i) {
        if (i != R.id.btn_deleteFile) {
            return true;
        }
        if (!this.f9789I0.m27087f()) {
            Log.m14709w("Failed to delete some junk", new Object[0]);
        }
        m32919Wh();
        return true;
    }

    @Override
    public View mo8869G9() {
        return this.f9792L0;
    }

    @Override
    public void mo8864N0(int i) {
        if (i == R.id.btn_resetLocalData) {
            if (m32898ih()) {
                this.f30170b.m2485dd().m3713T2(this, true, new C2945c());
            } else {
                C1379j0.m37295y0(R.string.EraseDatabaseWait, 0);
            }
        }
    }

    public final boolean m32938Nh() {
        C4596b7 b7Var = this.f9789I0;
        return b7Var != null && b7Var.m27076q() > 0;
    }

    public final boolean m32936Oh() {
        C4596b7 b7Var = this.f9789I0;
        return b7Var != null && b7Var.m27083j() > 0;
    }

    @Override
    public void mo32935P(C4596b7 b7Var) {
        m32907ci(b7Var);
    }

    public final boolean m32933Ph() {
        C4596b7 b7Var = this.f9789I0;
        return b7Var != null && b7Var.m27081l() > 0;
    }

    public final boolean m32931Qh() {
        C4596b7 b7Var;
        return C4868i.m24727c2().m24772W1() || ((b7Var = this.f9789I0) != null && b7Var.m27079n() > 0);
    }

    @Override
    public int mo407R9() {
        return R.id.controller_storageSettings;
    }

    public final boolean m32929Rh() {
        C4596b7 b7Var = this.f9789I0;
        return b7Var != null && b7Var.m27078o() > 0;
    }

    public final boolean m32927Sh() {
        C4596b7 b7Var = this.f9789I0;
        return b7Var != null && b7Var.m27077p() > 0;
    }

    public void m32925Th() {
        m32915Yh(false);
        if (this.f30161T != null) {
            View$OnClickListenerC2204bu buVar = new View$OnClickListenerC2204bu(this.f30168a, this.f30170b);
            m9476Ad(buVar);
            buVar.get();
            this.f30161T.m9742R(buVar, 0);
            View$OnClickListenerC3217vt vtVar = new View$OnClickListenerC3217vt(this.f30168a, this.f30170b);
            this.f30161T.m9742R(vtVar, 0);
            vtVar.get();
        }
        this.f30170b.m2270r4().m14783o(new TdApi.GetStorageStatisticsFast(), this);
        m32887th(false);
    }

    public final void m32923Uh(SparseIntArray sparseIntArray, C4826w6.C4827a aVar) {
        int rh;
        if (!(this.f9786F0 || sparseIntArray.size() == 0)) {
            ArrayList arrayList = new ArrayList();
            int size = sparseIntArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = sparseIntArray.keyAt(i);
                if (!(sparseIntArray.valueAt(i) == 0 || (rh = m32889rh(keyAt)) == -1)) {
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
            long[] j = aVar.m25134j();
            long[] f = aVar.m25138f();
            if (m32917Xh(true, j, aVar)) {
                m31305kg().setItemAnimator(null);
                ImageLoader.m14391e().m14393c(this.f30170b.m2188w6(), false);
                this.f9794N0 = false;
                this.f30170b.m2270r4().m14783o(new TdApi.OptimizeStorage(0L, 0, 0, 0, fileTypeArr, j, f, false, 0), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        View$OnClickListenerC2942qs.this.m32950Hh(object);
                    }
                });
            }
        }
    }

    public final void m32886uh(TdApi.Object object, final boolean z) {
        if (object.getConstructor() != 217237013) {
            mo255t2(object);
            return;
        }
        final C4826w6 w6Var = new C4826w6(this.f30170b, (TdApi.StorageStatistics) object);
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2942qs.this.m32948Ih(w6Var, z);
            }
        });
    }

    @Override
    public int mo418W9() {
        if (this.f30170b != null) {
            return R.id.menu_more;
        }
        return 0;
    }

    public final void m32919Wh() {
        if (!m9347Sa()) {
            this.f30170b.m2270r4().m14783o(new TdApi.GetStorageStatisticsFast(), this);
        }
    }

    @Override
    public CharSequence mo9313X9() {
        return C4403w.m27871i1(R.string.StorageUsage);
    }

    public final boolean m32917Xh(boolean z, long[] jArr, C4826w6.C4827a aVar) {
        if (this.f9786F0 == z) {
            return false;
        }
        this.f9786F0 = z;
        this.f9784D0.m34133s3(R.id.btn_localDatabase);
        this.f9784D0.m34133s3(R.id.btn_clearCache);
        this.f9784D0.m34133s3(R.id.btn_logsSize);
        long[] jArr2 = this.f9787G0;
        this.f9787G0 = jArr;
        this.f9788H0 = aVar;
        if (jArr2 != null) {
            for (long j : jArr2) {
                if (j != 0) {
                    this.f9784D0.m34130t3(j);
                } else {
                    this.f9784D0.m34133s3(R.id.btn_otherChats);
                }
            }
        }
        if (jArr == null) {
            return true;
        }
        for (long j2 : jArr) {
            if (j2 != 0) {
                this.f9784D0.m34130t3(j2);
            } else {
                this.f9784D0.m34133s3(R.id.btn_otherChats);
            }
        }
        return true;
    }

    public final void m32915Yh(boolean z) {
        if (this.f9791K0 != z) {
            this.f9791K0 = z;
            this.f9784D0.m34133s3(R.id.btn_localDatabase);
            this.f9784D0.m34133s3(R.id.btn_clearCache);
        }
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        C11052v1.m1768b().m1766d(this);
        C11052v1.m1768b().m1766d(this.f9784D0);
    }

    public final void m32913Zh(long j, boolean z) {
        if (this.f9790J0 != j && !m9347Sa()) {
            this.f9790J0 = j;
            this.f9784D0.m34133s3(R.id.btn_keepMedia);
            if (z) {
                this.f30170b.m2270r4().m14783o(new TdApi.SetOption("storage_max_time_from_last_access", new TdApi.OptionValueInteger(j)), this.f30170b.m2392ja());
                this.f30170b.m2270r4().m14783o(new TdApi.SetOption("use_storage_optimizer", new TdApi.OptionValueBoolean(j != 0)), this.f30170b.m2392ja());
            }
        }
    }

    public final void m32911ai(boolean z) {
        if (this.f9793M0 != z) {
            this.f9793M0 = z;
            if (z) {
                RunnableC2944b bVar = new RunnableC2944b();
                this.f9795O0 = bVar;
                bVar.run();
                return;
            }
            this.f30170b.m2485dd().removeCallbacks(this.f9795O0);
            this.f9795O0 = null;
        }
    }

    public final void m32909bi(C4826w6 w6Var, boolean z) {
        boolean z2;
        int i;
        C4826w6 w6Var2 = this.f9796P0;
        m32917Xh(false, null, null);
        this.f9796P0 = w6Var;
        m9204n9();
        this.f9784D0.m34133s3(R.id.btn_clearCache);
        this.f9784D0.m34133s3(R.id.btn_localDatabase);
        if (z) {
            m32887th(false);
            int N0 = this.f9784D0.m34227N0(R.id.btn_clearCacheHint);
            if (N0 == -1) {
                C2546iq iqVar = this.f9784D0;
                iqVar.m34132t0(iqVar.mo6153D(), new C2964ra(9, R.id.btn_clearCacheHint, 0, R.string.ClearCacheHint2));
            } else if (this.f9784D0.m34246E0(N0).m32855Y(R.string.ClearCacheHint2)) {
                this.f9784D0.m39315I(N0);
            }
        } else {
            this.f9784D0.m34147o1(R.id.btn_clearCacheHint);
        }
        ArrayList<C4826w6.C4827a> b = w6Var.m25153b();
        List<C2964ra> F0 = this.f9784D0.m34243F0();
        int size = F0.size();
        if (w6Var2 == null || this.f9785E0 >= F0.size()) {
            z2 = false;
        } else {
            int i2 = size - 1;
            z2 = false;
            while (i2 >= this.f9785E0) {
                F0.remove(i2);
                i2--;
                z2 = true;
            }
        }
        if (!b.isEmpty()) {
            C4826w6.C4827a e = w6Var.m25150e();
            w6Var.m25149f();
            Iterator<C4826w6.C4827a> it = b.iterator();
            boolean z3 = true;
            int i3 = 0;
            while (true) {
                boolean hasNext = it.hasNext();
                i = R.string.Chats;
                if (!hasNext) {
                    break;
                }
                C4826w6.C4827a next = it.next();
                if (!next.m25132l()) {
                    if (z3) {
                        F0.add(new C2964ra(8, R.id.chatsStorageUsageList, 0, R.string.Chats));
                        F0.add(new C2964ra(2));
                        z3 = false;
                    } else {
                        F0.add(new C2964ra(1));
                    }
                    F0.add(new C2964ra(46, R.id.chat, 0, 0).m32866N(next.m25137g()).m32873G(next));
                    i3++;
                }
            }
            if (!e.m25132l()) {
                if (z3) {
                    F0.add(new C2964ra(8, R.id.chatsStorageUsageList, 0, R.string.Chats));
                    F0.add(new C2964ra(2));
                    z3 = false;
                } else {
                    F0.add(new C2964ra(11));
                }
                if (!b.isEmpty()) {
                    i = R.string.OtherChats;
                }
                F0.add(new C2964ra(89, R.id.btn_otherChats, 0, i));
                if (!this.f9794N0 && i3 == 15) {
                    F0.add(new C2964ra(11));
                    F0.add(new C2964ra(4, R.id.btn_showOtherChats, 0, R.string.ShowOtherChats));
                }
            }
            if (!z3) {
                F0.add(new C2964ra(3));
            }
            if (w6Var2 != null) {
                int size2 = F0.size();
                if (size == size2) {
                    C2546iq iqVar2 = this.f9784D0;
                    int i4 = this.f9785E0;
                    iqVar2.m39312L(i4, size2 - i4);
                    return;
                }
                C2546iq iqVar3 = this.f9784D0;
                int i5 = this.f9785E0;
                iqVar3.m39312L(i5, Math.min(size2 - i5, size - i5));
                if (size2 > size) {
                    this.f9784D0.m39311M(size, size2 - size);
                } else {
                    this.f9784D0.m39310N(size2, size - size2);
                }
            } else {
                this.f9784D0.m39311M(this.f9785E0, F0.size() - this.f9785E0);
            }
        } else if (z2) {
            C2546iq iqVar4 = this.f9784D0;
            int i6 = this.f9785E0;
            iqVar4.m39310N(i6, size - i6);
        }
    }

    public final void m32907ci(C4596b7 b7Var) {
        if (!m9347Sa()) {
            this.f9789I0 = b7Var;
            if (this.f9784D0 != null) {
                m32901fi();
            }
        }
    }

    @Override
    public boolean mo9270dc() {
        return this.f9796P0 == null;
    }

    public final void m32905di() {
        if (!this.f9794N0) {
            this.f9794N0 = true;
            m32887th(false);
        }
    }

    public final void m32903ei(int r26, final gd.C4826w6.C4827a r27) {
        throw new UnsupportedOperationException("Method not decompiled: p038ce.View$OnClickListenerC2942qs.m32903ei(int, gd.w6$a):void");
    }

    public final void m32901fi() {
        this.f9784D0.m34133s3(R.id.btn_localDatabase);
        this.f9784D0.m34133s3(R.id.btn_settings);
        this.f9784D0.m34133s3(R.id.btn_languageSettings);
        m32897jh();
        m32896kh();
        m32892oh();
        m32893nh();
        m32891ph();
        m32894mh();
    }

    @Override
    public void mo452g2() {
        View view = this.f9792L0;
        if (view != null) {
            view.invalidate();
        }
    }

    public final boolean m32898ih() {
        return this.f9796P0 != null && !this.f9791K0 && !this.f9786F0;
    }

    public final void m32897jh() {
        m32895lh(R.id.btn_camera, R.string.InAppCameraCache, m32938Nh());
    }

    public final void m32896kh() {
        m32895lh(R.id.btn_emoji, R.string.EmojiSets, m32936Oh());
    }

    public final void m32895lh(int i, int i2, boolean z) {
        int N0 = this.f9784D0.m34227N0(i);
        if ((N0 != -1) != z) {
            if (z) {
                int N02 = this.f9784D0.m34227N0(R.id.btn_localDatabase);
                if (N02 != -1) {
                    this.f9784D0.m34243F0().add(N02, new C2964ra(11));
                    this.f9784D0.m34243F0().add(N02, new C2964ra(89, i, 0, i2));
                    this.f9784D0.m39311M(N02, 2);
                    this.f9785E0 += 2;
                    return;
                }
                throw new AssertionError();
            }
            this.f9784D0.m34207V1(N0, 2);
            this.f9785E0 -= 2;
        } else if (z) {
            this.f9784D0.m34127u3(N0);
        }
    }

    public final void m32894mh() {
        m32895lh(R.id.btn_junk, R.string.JunkFiles, m32933Ph());
    }

    public final void m32893nh() {
        m32895lh(R.id.btn_logsSize, R.string.LogFiles, m32931Qh());
        m32890qh();
    }

    @Override
    public void mo443o4() {
        C11031u1.m1981a(this);
    }

    public final void m32892oh() {
        m32895lh(R.id.btn_lottie, R.string.AnimatedStickers, m32929Rh());
    }

    @Override
    public void onClick(View view) {
        C4826w6.C4827a aVar;
        C2964ra raVar;
        C4826w6.C4827a aVar2;
        switch (view.getId()) {
            case R.id.btn_camera:
                if (this.f9789I0 != null) {
                    m9261ee(C4403w.m27871i1(R.string.InAppCameraCacheDeleteConfirm), new int[]{R.id.btn_deleteFile, R.id.btn_cancel}, new String[]{C4403w.m27867j1(R.string.ClearX, C1363c0.m37426m(this.f9789I0.m27076q())), C4403w.m27871i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                        @Override
                        public final boolean mo493A3(View view2, int i) {
                            boolean Ah;
                            Ah = View$OnClickListenerC2942qs.this.m32964Ah(view2, i);
                            return Ah;
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
                    return;
                }
                return;
            case R.id.btn_clearCache:
            case R.id.btn_otherChats:
            case R.id.btn_otherFiles:
                if (!this.f9791K0 && this.f9796P0 != null && !this.f9786F0) {
                    int id2 = view.getId();
                    if (id2 == R.id.btn_clearCache) {
                        aVar = this.f9796P0.m25148g();
                    } else {
                        aVar = id2 == R.id.btn_otherChats ? this.f9796P0.m25150e() : this.f9796P0.m25149f();
                    }
                    m32903ei(R.id.btn_otherChats, aVar);
                    return;
                }
                return;
            case R.id.btn_emoji:
                if (this.f9789I0 != null) {
                    m9261ee(C4403w.m27871i1(R.string.EmojiSetsInfo), new int[]{R.id.btn_deleteFile, R.id.btn_cancel}, new String[]{C4403w.m27867j1(R.string.ClearX, C1363c0.m37426m(this.f9789I0.m27082k())), C4403w.m27871i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                        @Override
                        public final boolean mo493A3(View view2, int i) {
                            boolean Bh;
                            Bh = View$OnClickListenerC2942qs.this.m32962Bh(view2, i);
                            return Bh;
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
                    return;
                }
                return;
            case R.id.btn_junk:
                if (this.f9789I0 != null) {
                    m9261ee(C4403w.m27871i1(R.string.JunkFilesInfo), new int[]{R.id.btn_deleteFile, R.id.btn_cancel}, new String[]{C4403w.m27867j1(R.string.ClearX, C1363c0.m37426m(this.f9789I0.m27081l())), C4403w.m27871i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                        @Override
                        public final boolean mo493A3(View view2, int i) {
                            boolean zh;
                            zh = View$OnClickListenerC2942qs.this.m32881zh(view2, i);
                            return zh;
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
                    return;
                }
                return;
            case R.id.btn_keepMedia:
                m9227je(new int[]{R.id.btn_keepMedia_3days, R.id.btn_keepMedia_1week, R.id.btn_keepMedia_1month, R.id.btn_keepMedia_forever}, new String[]{C4403w.m27846o2(R.string.xDays, 3L), C4403w.m27846o2(R.string.xWeeks, 1L), C4403w.m27846o2(R.string.xMonths, 1L), C4403w.m27871i1(R.string.KeepMediaForever)}, new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view2, int i) {
                        boolean wh;
                        wh = View$OnClickListenerC2942qs.this.m32884wh(view2, i);
                        return wh;
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
                return;
            case R.id.btn_localDatabase:
                m9388Mc(R.string.LocalDatabaseExcuse);
                return;
            case R.id.btn_logsSize:
                if (this.f9789I0 != null) {
                    if (C4868i.m24727c2().m24772W1()) {
                        m9206me(new C9188f2(R.id.btn_logsSize).m10010b(C4403w.m27871i1(R.string.AppLogsClear)).m9995q(R.id.theme_color_textNegative).m9993s(C4403w.m27867j1(R.string.ClearX, C1363c0.m37426m(this.f9789I0.m27079n()))).m9996p(new C2964ra[]{new C2964ra(12, (int) R.id.btn_tdlib_resetLogSettings, 0, (int) R.string.AppLogsDisable, false)}).m10002j(new AbstractC9323v4.AbstractC9343r() {
                            @Override
                            public final void mo1773l6(int i, SparseIntArray sparseIntArray) {
                                View$OnClickListenerC2942qs.this.m32958Dh(i, sparseIntArray);
                            }
                        }));
                        return;
                    } else {
                        m9261ee(C4403w.m27871i1(R.string.AppLogsClear), new int[]{R.id.btn_deleteFile, R.id.btn_cancel}, new String[]{C4403w.m27867j1(R.string.ClearX, C1363c0.m37426m(this.f9789I0.m27079n())), C4403w.m27871i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                            @Override
                            public final boolean mo493A3(View view2, int i) {
                                boolean vh;
                                vh = View$OnClickListenerC2942qs.this.m32885vh(view2, i);
                                return vh;
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
                        return;
                    }
                } else {
                    return;
                }
            case R.id.btn_lottie:
                if (this.f9789I0 != null) {
                    m9261ee(C4403w.m27871i1(R.string.AnimatedStickersInfo), new int[]{R.id.btn_deleteFile, R.id.btn_cancel}, new String[]{C4403w.m27867j1(R.string.ClearX, C1363c0.m37426m(this.f9789I0.m27078o())), C4403w.m27871i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                        @Override
                        public final boolean mo493A3(View view2, int i) {
                            boolean Ch;
                            Ch = View$OnClickListenerC2942qs.this.m32960Ch(view2, i);
                            return Ch;
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
                    return;
                }
                return;
            case R.id.btn_paint:
                if (this.f9789I0 != null) {
                    m9261ee(C4403w.m27871i1(R.string.PaintsInfo), new int[]{R.id.btn_deleteFile, R.id.btn_cancel}, new String[]{C4403w.m27867j1(R.string.ClearX, C1363c0.m37426m(this.f9789I0.m27077p())), C4403w.m27871i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                        @Override
                        public final boolean mo493A3(View view2, int i) {
                            boolean yh;
                            yh = View$OnClickListenerC2942qs.this.m32882yh(view2, i);
                            return yh;
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
                    return;
                }
                return;
            case R.id.btn_showOtherChats:
                m32905di();
                return;
            case R.id.chat:
                if (!this.f9791K0 && (raVar = (C2964ra) view.getTag()) != null && !this.f9786F0 && (aVar2 = (C4826w6.C4827a) raVar.m32847d()) != null) {
                    m32903ei(R.id.chat, aVar2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public boolean mo31076pg() {
        return true;
    }

    public final void m32891ph() {
        m32895lh(R.id.btn_paint, R.string.Paints, m32927Sh());
    }

    public final void m32890qh() {
        m32911ai(m9339Ta() && this.f30170b != null && C4868i.m24727c2().m24772W1());
    }

    @Override
    public void mo30635rg(Context context, CustomRecyclerView customRecyclerView) {
        C11052v1.m1768b().m1769a(this);
        if (this.f30170b.m2930B4().m4661q1()) {
            C9289s sVar = new C9289s(context);
            sVar.setThemedTextColor(this);
            sVar.m9631D1(C1357a0.m37544i(49.0f), true);
            sVar.setTitle(mo9313X9());
            sVar.setSubtitle(this.f30170b.m2949A1().m1455u());
            this.f9792L0 = sVar;
        }
        View$OnClickListenerC2204bu w9 = m9139w9();
        if (w9 != null) {
            this.f9789I0 = w9.m35372Vg();
        }
        this.f9784D0 = new C2943a(this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2964ra(89, R.id.btn_keepMedia, 0, R.string.KeepMedia));
        arrayList.add(new C2964ra(3));
        arrayList.add(new C2964ra(9, 0, 0, C1363c0.m37451Z(C4403w.m27871i1(R.string.KeepMediaInfo), R.id.theme_color_background_textLight), false));
        arrayList.add(new C2964ra(2));
        arrayList.add(new C2964ra(89, R.id.btn_settings, 0, R.string.SettingsAndThemes));
        arrayList.add(new C2964ra(11));
        arrayList.add(new C2964ra(89, R.id.btn_languageSettings, 0, R.string.LanguageDatabase));
        arrayList.add(new C2964ra(11));
        if (m32938Nh()) {
            arrayList.add(new C2964ra(89, R.id.btn_camera, 0, R.string.InAppCameraCache));
            arrayList.add(new C2964ra(11));
        }
        if (m32936Oh()) {
            arrayList.add(new C2964ra(89, R.id.btn_emoji, 0, R.string.EmojiSets));
            arrayList.add(new C2964ra(11));
        }
        if (m32929Rh()) {
            arrayList.add(new C2964ra(89, R.id.btn_lottie, 0, R.string.AnimatedStickers));
            arrayList.add(new C2964ra(11));
        }
        if (m32931Qh()) {
            arrayList.add(new C2964ra(89, R.id.btn_logsSize, 0, R.string.LogFiles));
            arrayList.add(new C2964ra(11));
        }
        if (m32927Sh()) {
            arrayList.add(new C2964ra(89, R.id.btn_paint, 0, R.string.Paints));
            arrayList.add(new C2964ra(11));
        }
        if (m32933Ph()) {
            arrayList.add(new C2964ra(89, R.id.btn_junk, 0, R.string.JunkFiles));
            arrayList.add(new C2964ra(11));
        }
        arrayList.add(new C2964ra(89, R.id.btn_localDatabase, 0, R.string.LocalDatabase));
        arrayList.add(new C2964ra(11));
        arrayList.add(new C2964ra(89, R.id.btn_clearCache, 0, R.string.MediaAndFiles));
        arrayList.add(new C2964ra(3));
        this.f9785E0 = arrayList.size();
        arrayList.add(new C2964ra(9, R.id.btn_clearCacheHint, 0, R.string.ClearCacheHint));
        this.f9784D0.m34119x2(arrayList, false);
        customRecyclerView.setAdapter(this.f9784D0);
        if (this.f9789I0 == null) {
            if (w9 != null) {
                w9.m35362fh(this);
            } else {
                this.f30170b.m2270r4().m14783o(new TdApi.GetStorageStatisticsFast(), this);
            }
        }
        C11052v1.m1768b().m1769a(this.f9784D0);
        this.f30170b.m2270r4().m14783o(new TdApi.GetOption("storage_max_time_from_last_access"), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC2942qs.this.m32954Fh(object);
            }
        });
        m32887th(true);
        this.f30170b.m2485dd().postDelayed(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2942qs.this.m9204n9();
            }
        }, 500L);
    }

    public final int m32888sh(boolean z) {
        if (z) {
            return 0;
        }
        return this.f9794N0 ? 1000 : 15;
    }

    @Override
    public void mo255t2(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37305t0(object);
        } else if (constructor == -884922271) {
            final C4596b7 b7Var = new C4596b7((TdApi.StorageStatisticsFast) object, this.f9789I0);
            this.f30170b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2942qs.this.m32952Gh(b7Var);
                }
            });
        } else if (constructor == 217237013) {
            m32886uh(object, false);
        }
    }

    @Override
    public void mo9159tc() {
        super.mo9159tc();
        m32890qh();
    }

    @Override
    public void mo31298tg() {
        if (m32898ih()) {
            m9302Yd(new int[]{R.id.btn_resetLocalData}, new String[]{C4403w.m27871i1(R.string.EraseDatabase)}, 0);
        } else {
            C1379j0.m37295y0(R.string.EraseDatabaseWait, 0);
        }
    }

    public final void m32887th(final boolean z) {
        this.f30170b.m2270r4().m14783o(new TdApi.GetStorageStatistics(m32888sh(z)), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC2942qs.this.m32886uh(z, object);
            }
        });
    }
}
