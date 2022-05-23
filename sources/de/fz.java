package de;

import ae.n;
import ae.p;
import ae.r;
import ae.z;
import android.app.TimePickerDialog;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TimePicker;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.c0;
import ce.j0;
import ce.o;
import ce.y;
import de.fz;
import de.rh;
import de.t30;
import de.ys;
import ed.j;
import ed.k;
import gd.w;
import he.i;
import ib.f;
import ib.h;
import ie.g0;
import ie.h0;
import ie.j;
import ie.u;
import ie.u0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kd.x0;
import ne.k3;
import ne.o2;
import ne.y1;
import oc.v0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import uc.d;
import ud.f2;
import ud.v4;
import yd.g;
import zd.o6;
import zd.t1;

public class fz extends vo<c> implements View.OnClickListener, v4.r, k3.c, View.OnLongClickListener, t1.a, j.a {
    public iq E0;
    public int G0;
    public boolean H0;
    public float I0;
    public x0 J0;
    public List<r> K0;
    public List<r> L0;
    public List<r> M0;
    public r O0;
    public ra P0;
    public int D0 = 0;
    public int F0 = 0;
    public final Comparator<r> N0 = iy.f8351a;

    public class a extends iq {
        public a(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void R2(ra raVar, uc.c cVar, boolean z10) {
            cVar.setDrawModifier(raVar.f());
            boolean z11 = false;
            switch (raVar.j()) {
                case R.id.btn_audioCompression:
                    cVar.getToggler().r(!i.c2().k1(256L), z10);
                    return;
                case R.id.btn_autoNightModeScheduled_location:
                    if (z10) {
                        if (fz.this.J0 == null) {
                            z11 = true;
                        }
                        cVar.setEnabledAnimated(z11);
                    } else {
                        if (fz.this.J0 == null) {
                            z11 = true;
                        }
                        cVar.setEnabled(z11);
                    }
                    cVar.setName(fz.this.J0 == null ? R.string.AutoNightModeScheduledByLocation : R.string.AutoNightModeScheduledByLocationProgress);
                    cVar.invalidate();
                    return;
                case R.id.btn_autoNightModeScheduled_timeOff:
                case R.id.btn_autoNightModeScheduled_timeOn:
                    cVar.setData(v0.P2(cVar.getId() == R.id.btn_autoNightModeScheduled_timeOn ? i.c2().p1() : i.c2().o1()));
                    return;
                case R.id.btn_autoplayGIFs:
                    cVar.getToggler().r(i.c2().z2(), z10);
                    return;
                case R.id.btn_cameraRatio:
                    int q02 = i.c2().q0();
                    if (q02 == 1) {
                        cVar.setData("4:3");
                        return;
                    } else if (q02 == 2) {
                        cVar.setData("1:1");
                        return;
                    } else if (q02 != 3) {
                        cVar.setData("16:9");
                        return;
                    } else {
                        cVar.setData(R.string.CameraRatioFull);
                        return;
                    }
                case R.id.btn_cameraSetting:
                    d toggler = cVar.getToggler();
                    if (i.c2().k1(raVar.m()) != raVar.b()) {
                        z11 = true;
                    }
                    toggler.r(z11, z10);
                    return;
                case R.id.btn_cameraType:
                    if (fd.a.f11889k) {
                        int r02 = i.c2().r0();
                        if (r02 == 0) {
                            cVar.setData(R.string.CameraTypeLegacy);
                            return;
                        } else if (r02 == 1) {
                            cVar.setData(R.string.CameraTypeXBeta);
                            return;
                        } else if (r02 == 2) {
                            cVar.setData(R.string.CameraTypeSystem);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        d toggler2 = cVar.getToggler();
                        if (i.c2().r0() == 2) {
                            z11 = true;
                        }
                        toggler2.r(z11, z10);
                        return;
                    }
                case R.id.btn_cameraVolume:
                    int s02 = i.c2().s0();
                    if (s02 == 0) {
                        cVar.setData(R.string.CameraVolumeShoot);
                        return;
                    } else if (s02 == 1) {
                        cVar.setData(R.string.CameraVolumeZoom);
                        return;
                    } else if (s02 == 2) {
                        cVar.setData(R.string.CameraVolumeNone);
                        return;
                    } else {
                        return;
                    }
                case R.id.btn_chatListStyle:
                    int u02 = i.c2().u0();
                    if (u02 == 2) {
                        cVar.setData(R.string.ChatListStyle2);
                        return;
                    } else if (u02 != 3) {
                        cVar.setData(R.string.ChatListStyle1);
                        return;
                    } else {
                        cVar.setData(R.string.ChatListStyle3);
                        return;
                    }
                case R.id.btn_chatSwipes:
                    StringBuilder sb2 = new StringBuilder();
                    if (i.c2().C2()) {
                        sb2.append(w.i1(R.string.QuickActionSettingShare));
                    }
                    if (i.c2().B2()) {
                        if (sb2.length() > 0) {
                            sb2.append(w.m0());
                        }
                        sb2.append(w.i1(R.string.QuickActionSettingReply));
                    }
                    if (sb2.length() == 0) {
                        sb2.append(w.i1(R.string.QuickActionSettingNone));
                    }
                    cVar.setData(sb2.toString());
                    return;
                case R.id.btn_checkUpdates:
                    int M = fz.this.t().c0().M();
                    if (M == 0) {
                        cVar.X1(true, z10);
                        cVar.setName(R.string.CheckForUpdates);
                        return;
                    } else if (M == 1) {
                        cVar.X1(false, z10);
                        cVar.setName(R.string.CheckingForUpdates);
                        return;
                    } else if (M == 2) {
                        cVar.X1(true, z10);
                        long N = fz.this.t().c0().N() - fz.this.t().c0().j();
                        if (N > 0) {
                            cVar.setName(w.m1(R.string.DownloadUpdateSize, c0.m(N)));
                            return;
                        } else {
                            cVar.setName(R.string.DownloadUpdate);
                            return;
                        }
                    } else if (M == 3) {
                        cVar.X1(false, z10);
                        cVar.setName(w.t0(fz.this.t().c0().j(), fz.this.t().c0().N(), true));
                        return;
                    } else if (M == 4) {
                        cVar.X1(true, z10);
                        cVar.setName(R.string.InstallUpdate);
                        return;
                    } else {
                        return;
                    }
                case R.id.btn_confirmCalls:
                    cVar.getToggler().r(i.c2().L2(), z10);
                    return;
                case R.id.btn_customVibrations:
                    cVar.getToggler().r(i.c2().p6(), z10);
                    return;
                case R.id.btn_earpieceMode:
                case R.id.btn_earpieceModeVideo:
                    i c22 = i.c2();
                    if (raVar.j() == R.id.btn_earpieceModeVideo) {
                        z11 = true;
                    }
                    int F0 = c22.F0(z11);
                    if (F0 == 0) {
                        cVar.setData(R.string.EarpieceModeNever);
                        return;
                    } else if (F0 == 1) {
                        cVar.setData(R.string.EarpieceModeProximity);
                        return;
                    } else if (F0 == 2) {
                        cVar.setData(R.string.EarpieceModeAlways);
                        return;
                    } else {
                        return;
                    }
                case R.id.btn_emoji:
                    i.f N0 = i.c2().N0();
                    if (N0.f13847a.equals("apple")) {
                        cVar.setData(R.string.EmojiBuiltIn);
                        return;
                    } else {
                        cVar.setData(N0.M);
                        return;
                    }
                case R.id.btn_forceExoPlayerExtensions:
                    cVar.getToggler().r(i.c2().k1(128L), z10);
                    return;
                case R.id.btn_hideChatKeyboard:
                    cVar.getToggler().r(i.c2().G2(), z10);
                    return;
                case R.id.btn_hqRounds:
                    cVar.getToggler().r(i.c2().J2(), z10);
                    return;
                case R.id.btn_icon:
                    cVar.setData(R.string.IconsBuiltIn);
                    return;
                case R.id.btn_ignoreContentRestrictions:
                    cVar.getToggler().r(!i.c2().P2(), z10);
                    return;
                case R.id.btn_instantViewMode:
                    int U0 = i.c2().U0();
                    if (U0 == 0) {
                        cVar.setData(R.string.AutoInstantViewNone);
                        return;
                    } else if (U0 == 1) {
                        cVar.setData(R.string.AutoInstantViewTelegram);
                        return;
                    } else if (U0 == 2) {
                        cVar.setData(R.string.AutoInstantViewAll);
                        return;
                    } else {
                        return;
                    }
                case R.id.btn_markdown:
                    cVar.getToggler().r(i.c2().k1(4L), z10);
                    return;
                case R.id.btn_mosaic:
                    cVar.getToggler().r(i.c2().E3(), z10);
                    return;
                case R.id.btn_rearRounds:
                    cVar.getToggler().r(i.c2().U5(), z10);
                    return;
                case R.id.btn_reduceMotion:
                    cVar.getToggler().r(i.c2().O2(), z10);
                    return;
                case R.id.btn_restrictSensitiveContent:
                    cVar.getToggler().r(fz.this.f24495b.B6(), z10);
                    return;
                case R.id.btn_saveToGallery:
                    cVar.getToggler().r(i.c2().R2(), z10);
                    return;
                case R.id.btn_secret_batmanTransitions:
                    cVar.getToggler().r(i.c2().k1(2L), z10);
                    return;
                case R.id.btn_sendByEnter:
                    cVar.getToggler().r(i.c2().T2(), z10);
                    return;
                case R.id.btn_separateMedia:
                    cVar.getToggler().r(i.c2().U2(), z10);
                    return;
                case R.id.btn_sizeUnit:
                    cVar.setData(i.c2().k1(64L) ? R.string.SizeUnitMetric : R.string.SizeUnitBinary);
                    return;
                case R.id.btn_stickerSuggestions:
                    int K1 = i.c2().K1();
                    if (K1 == 0) {
                        cVar.setData(R.string.SuggestStickersAll);
                        return;
                    } else if (K1 == 1) {
                        cVar.setData(R.string.SuggestStickersInstalled);
                        return;
                    } else if (K1 == 2) {
                        cVar.setData(R.string.SuggestStickersNone);
                        return;
                    } else {
                        return;
                    }
                case R.id.btn_switchRtl:
                    cVar.getToggler().r(w.G2(), z10);
                    return;
                case R.id.btn_systemEmoji:
                    cVar.getToggler().r(i.c2().r6(), z10);
                    return;
                case R.id.btn_systemFonts:
                    cVar.getToggler().r(i.c2().s6(), z10);
                    return;
                case R.id.btn_theme:
                    cVar.setName(raVar.u());
                    o2 L1 = cVar.L1();
                    if (L1 != null) {
                        L1.c(raVar.D(), z10);
                        return;
                    }
                    return;
                case R.id.btn_toggleNewSetting:
                    boolean k12 = i.c2().k1(raVar.m());
                    if (raVar.b()) {
                        k12 = !k12;
                    }
                    cVar.getToggler().r(k12, z10);
                    return;
                case R.id.btn_updateAutomatically:
                    int i02 = i.c2().i0();
                    d toggler3 = cVar.getToggler();
                    if (i02 != 1) {
                        z11 = true;
                    }
                    toggler3.r(z11, z10);
                    if (i02 == 0) {
                        cVar.setData(R.string.AutoUpdatePrompt);
                        return;
                    } else if (i02 == 1) {
                        cVar.setData(R.string.AutoUpdateNever);
                        return;
                    } else if (i02 == 2) {
                        cVar.setData(R.string.AutoUpdateWiFi);
                        return;
                    } else if (i02 == 3) {
                        cVar.setData(R.string.AutoUpdateAlways);
                        return;
                    } else {
                        return;
                    }
                case R.id.btn_useBigEmoji:
                    cVar.getToggler().r(i.c2().o6(), z10);
                    return;
                case R.id.btn_useHoldToPreview:
                    cVar.getToggler().r(i.c2().M2(), z10);
                    return;
                case R.id.btn_useInAppBrowser:
                    cVar.getToggler().r(i.c2().q6(), z10);
                    return;
                default:
                    return;
            }
        }
    }

    public class b implements j.b {
        public b() {
        }

        public void i(r rVar) {
            fz.this.ih(rVar, true);
        }

        @Override
        public void a(RecyclerView.c0 c0Var) {
            final r rVar = (r) ((ra) c0Var.f2982a.getTag()).d();
            fz.this.f24495b.hd().y8(fz.this, rVar, new Runnable() {
                @Override
                public final void run() {
                    fz.b.this.i(rVar);
                }
            });
        }

        @Override
        public boolean b(RecyclerView recyclerView, RecyclerView.c0 c0Var, int i10) {
            ra raVar = (ra) c0Var.f2982a.getTag();
            return raVar != null && raVar.j() == R.id.btn_theme && ((r) raVar.d()).k();
        }

        @Override
        public float e() {
            return k.a(this);
        }
    }

    public static class c {
        public final int f8012a;

        public c(int i10) {
            this.f8012a = i10;
        }
    }

    public fz(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public boolean Ah(View view, int i10) {
        int i11;
        switch (i10) {
            case R.id.btn_cameraVolumeShoot:
                i11 = 0;
                break;
            case R.id.btn_cameraVolumeZoom:
                i11 = 1;
                break;
            default:
                i11 = 2;
                break;
        }
        i.c2().l4(i11);
        this.E0.p3(R.id.btn_cameraVolume);
        return true;
    }

    public void Bh(int i10, SparseIntArray sparseIntArray) {
        int L0;
        int i11 = 0;
        switch (sparseIntArray.get(R.id.btn_cameraType)) {
            case R.id.btn_cameraTypeSystem:
                i11 = 2;
                break;
            case R.id.btn_cameraTypeX:
                i11 = 1;
                break;
        }
        int r02 = i.c2().r0();
        i.c2().k4(i11);
        if (i11 != 2) {
            this.f24493a.j0();
        }
        if (r02 != i11 && ((r02 == 2 || i11 == 2) && (L0 = this.E0.L0(R.id.btn_cameraType)) != -1)) {
            int i12 = L0 + 2;
            if (r02 == 2) {
                List<ra> mh = mh();
                int i13 = i12 + 1;
                this.E0.D0().addAll(i13, mh);
                this.E0.M(i13, mh.size());
                this.E0.s0(i13 + mh.size() + 1, Qh());
            } else {
                this.E0.R1(i12 + 1, 8);
                this.E0.j1(i12 + 2);
            }
        }
        this.E0.p3(R.id.btn_cameraType);
    }

    public void Ch(boolean z10) {
        i.c2().P5(false);
        this.E0.p3(R.id.btn_systemFonts);
    }

    public void Dh(boolean z10) {
        if (z10) {
            i.c2().P5(true);
            this.E0.p3(R.id.btn_systemFonts);
        }
    }

    public void Eh(int i10, Location location) {
        if (this.J0 != null) {
            this.J0 = null;
            this.E0.p3(R.id.btn_autoNightModeScheduled_location);
            if (i.c2().m1() == 2) {
                if (i10 != 0) {
                    j0.y0(R.string.DetectLocationError, 0);
                    return;
                }
                Calendar a10 = a9.a.a(location.getLatitude(), location.getLongitude(), TimeZone.getDefault(), f.e(), 0.0d);
                Calendar b10 = a9.a.b(location.getLatitude(), location.getLongitude(), TimeZone.getDefault(), f.e(), 0.0d);
                int i11 = b10.get(11);
                int i12 = b10.get(12);
                int i13 = a10.get(11);
                int i14 = a10.get(12);
                j0.y0(R.string.Done, 0);
                if (i.c2().m5(ib.c.f(ib.c.g(i11, i12, 0), ib.c.g(i13, i14, 0)))) {
                    this.E0.p3(R.id.btn_autoNightModeScheduled_timeOff);
                    this.E0.p3(R.id.btn_autoNightModeScheduled_timeOn);
                }
            }
        }
    }

    public void Fh(int i10) {
        if (!Sa()) {
            boolean z10 = i10 >= 1 || i.c2().k1(2L);
            int L0 = this.E0.L0(R.id.btn_secret_batmanTransitions);
            if (z10 == (L0 != -1)) {
                return;
            }
            if (z10) {
                int O0 = this.E0.O0(R.id.btn_systemFonts);
                if (O0 != -1) {
                    this.E0.D0().addAll(O0, Arrays.asList(new ra(7, R.id.btn_secret_batmanTransitions, 0, R.string.BatmanTransitions), new ra(11)));
                    this.E0.M(O0, 2);
                    return;
                }
                return;
            }
            this.E0.R1(L0, 2);
        }
    }

    public void Gh(final int i10) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                fz.this.Fh(i10);
            }
        });
    }

    public void Hh(int i10, SparseIntArray sparseIntArray) {
        int u02 = i.c2().u0();
        switch (sparseIntArray.get(R.id.btn_chatListStyle)) {
            case R.id.btn_chatListStyle1:
                u02 = 1;
                break;
            case R.id.btn_chatListStyle2:
                u02 = 2;
                break;
            case R.id.btn_chatListStyle3:
                u02 = 3;
                break;
        }
        i.c2().n4(u02);
        this.E0.p3(R.id.btn_chatListStyle);
    }

    public void Ih(int i10, int i11, boolean z10, int i12, SparseIntArray sparseIntArray) {
        switch (sparseIntArray.get(i11)) {
            case R.id.btn_earpieceMode_always:
                i10 = 2;
                break;
            case R.id.btn_earpieceMode_never:
                i10 = 0;
                break;
            case R.id.btn_earpieceMode_proximity:
                i10 = 1;
                break;
        }
        i.c2().A4(z10, i10);
        this.E0.p3(i11);
    }

    public void Jh(int i10, SparseIntArray sparseIntArray) {
        int U0 = i.c2().U0();
        switch (sparseIntArray.get(R.id.btn_instantViewMode)) {
            case R.id.btn_instantViewModeAll:
                U0 = 2;
                break;
            case R.id.btn_instantViewModeNone:
                U0 = 0;
                break;
            case R.id.btn_instantViewModeTelegram:
                U0 = 1;
                break;
        }
        i.c2().O4(U0);
        this.E0.p3(R.id.btn_instantViewMode);
    }

    public void Kh(int i10, SparseIntArray sparseIntArray) {
        int K1 = i.c2().K1();
        switch (sparseIntArray.get(R.id.btn_stickerSuggestions)) {
            case R.id.btn_stickerSuggestionsAll:
                K1 = 0;
                break;
            case R.id.btn_stickerSuggestionsInstalled:
                K1 = 1;
                break;
            case R.id.btn_stickerSuggestionsNone:
                K1 = 2;
                break;
        }
        i.c2().I5(K1);
        this.E0.p3(R.id.btn_stickerSuggestions);
    }

    public void Lh(r rVar) {
        ih(rVar, true);
    }

    public boolean Mh(ra raVar, View view, int i10) {
        switch (i10) {
            case R.id.btn_delete:
                final r rVar = (r) raVar.d();
                this.f24495b.hd().y8(this, rVar, new Runnable() {
                    @Override
                    public final void run() {
                        fz.this.Lh(rVar);
                    }
                });
                break;
            case R.id.btn_edit:
                rh((r) raVar.d(), false);
                break;
            case R.id.btn_new:
                hh((r) raVar.d());
                break;
            case R.id.btn_share:
                r rVar2 = (r) raVar.d();
                this.f24495b.hd().V2(this, rVar2, !rVar2.i(), false);
                break;
        }
        return true;
    }

    public void Nh(int i10, SparseIntArray sparseIntArray) {
        int i02 = i.c2().i0();
        int i11 = sparseIntArray.get(R.id.btn_updateAutomatically);
        boolean z10 = (i02 == 1 && i11 != R.id.btn_updateAutomaticallyNever) || (i02 != 1 && i11 == R.id.btn_updateAutomaticallyNever);
        switch (i11) {
            case R.id.btn_updateAutomaticallyAlways:
                i02 = 3;
                break;
            case R.id.btn_updateAutomaticallyNever:
                i02 = 1;
                break;
            case R.id.btn_updateAutomaticallyPrompt:
                i02 = 0;
                break;
            case R.id.btn_updateAutomaticallyWiFi:
                i02 = 2;
                break;
        }
        i.c2().g4(i02);
        this.E0.p3(R.id.btn_updateAutomatically);
        int L0 = this.E0.L0(R.id.btn_updateAutomatically);
        if (z10 && L0 != -1) {
            if (i02 == 1) {
                this.E0.R1(L0 + 1, 4);
            } else {
                this.E0.Y0(L0 + 1, (ra[]) Oh().toArray(new ra[0]));
            }
        }
    }

    public static List<ra> Oh() {
        return Arrays.asList(new ra(11), new ra(7, R.id.btn_toggleNewSetting, 0, R.string.InstallBetas).N(512L), new ra(11), new ra(4, R.id.btn_checkUpdates, 0, R.string.CheckForUpdates));
    }

    public static ra Qh() {
        return new ra(9, 0, 0, R.string.CameraFlipInfo);
    }

    public static ra Rh(r rVar) {
        ra raVar;
        int c10 = rVar.c();
        boolean A = z.A(c10);
        p i10 = z.u().i();
        boolean z10 = i10.a() == rVar.c();
        if (A) {
            raVar = new ra(13, (int) R.id.btn_theme, 0, (CharSequence) rVar.d(), false);
        } else {
            raVar = new ra(13, R.id.btn_theme, 0, z.p(c10));
        }
        if (z10 && A && !rVar.h()) {
            rVar.n((n) i10);
        }
        raVar.G(rVar);
        raVar.M(c10);
        raVar.S(z10);
        if (A) {
            c10 = rVar.m();
        }
        raVar.Q(ae.j.K(c10));
        return raVar;
    }

    public static ra Sh(boolean z10) {
        if (z10) {
            return new ra(89, R.id.btn_autoNightModeScheduled_timeOn, 0, R.string.AutoNightModeScheduledTurnOn);
        }
        return new ra(89, R.id.btn_autoNightModeScheduled_timeOff, 0, R.string.AutoNightModeScheduledTurnOff);
    }

    public static ra Th() {
        return new ra(4, R.id.btn_autoNightModeScheduled_location);
    }

    public static List<ra> mh() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ra(11));
        arrayList.add(new ra(7, R.id.btn_cameraSetting, 0, R.string.CameraGrid).N(4096L));
        arrayList.add(new ra(11));
        arrayList.add(new ra(89, R.id.btn_cameraVolume, 0, R.string.CameraVolume));
        arrayList.add(new ra(11));
        arrayList.add(new ra(89, R.id.btn_cameraRatio, 0, R.string.CameraRatio));
        arrayList.add(new ra(11));
        arrayList.add(new ra(7, R.id.btn_cameraSetting, 0, R.string.CameraFlip).N(1024L).E(true));
        return arrayList;
    }

    public void oh(r rVar) {
        if (!Sa()) {
            rh(rVar, true);
        }
    }

    public boolean ph(boolean z10, r rVar, y1 y1Var, String str) {
        String trim = str.trim();
        if (ib.i.i(trim)) {
            return false;
        }
        int m10 = z10 ? rVar.m() : rVar.c();
        int H = z.u().H(trim, m10, z10 ? rVar.c() : 0);
        if (H == 0) {
            return false;
        }
        final r rVar2 = new r(H, trim, rVar.f(), m10, z10 ? rVar.b() | 2 : 0);
        if (rVar.k()) {
            rVar2.a((n) rVar.e());
        }
        this.f24495b.hd().postDelayed(new Runnable() {
            @Override
            public final void run() {
                fz.this.oh(rVar2);
            }
        }, 150L);
        return true;
    }

    public void qh(RecyclerView.m mVar) {
        kg().setItemAnimator(mVar);
    }

    public static int th(r rVar, r rVar2) {
        return rVar.l() != rVar2.l() ? rVar.l() ? -1 : 1 : Integer.compare(rVar.c(), rVar2.c());
    }

    public void uh() {
        this.E0.p3(R.id.btn_checkUpdates);
    }

    public void vh(int i10, boolean z10, int i11, TimePicker timePicker, int i12, int i13) {
        int g10 = ib.c.g(i12, i13, 0);
        if (i10 != g10) {
            i.c2().l5(g10, z10);
            this.E0.p3(i11);
        }
    }

    public void wh(int i10, SparseIntArray sparseIntArray) {
        i.c2().i5(64L, sparseIntArray.get(R.id.btn_sizeUnit) == R.id.btn_sizeUnitMetric);
        this.E0.p3(R.id.btn_sizeUnit);
    }

    public void xh(int i10, SparseIntArray sparseIntArray) {
        i c22 = i.c2();
        boolean z10 = true;
        boolean z11 = sparseIntArray.get(R.id.btn_messageShare) != R.id.btn_messageShare;
        if (sparseIntArray.get(R.id.btn_messageReply) == R.id.btn_messageReply) {
            z10 = false;
        }
        c22.w4(z11, z10);
        this.E0.p3(R.id.btn_chatSwipes);
    }

    public void yh(int i10, boolean z10) {
        Vh();
    }

    public boolean zh(View view, int i10) {
        int i11;
        switch (i10) {
            case R.id.btn_cameraRatio_1_1:
                i11 = 2;
                break;
            case R.id.btn_cameraRatio_4_3:
                i11 = 1;
                break;
            case R.id.btn_cameraRatio_fullScreen:
                i11 = 3;
                break;
            default:
                i11 = 0;
                break;
        }
        i.c2().j4(i11);
        this.E0.p3(R.id.btn_cameraRatio);
        return true;
    }

    @Override
    public void E6(int i10, int i11, boolean z10) {
        if (i11 == 1 && i10 == 0) {
            vd(new Runnable() {
                @Override
                public final void run() {
                    fz.this.uh();
                }
            }, 250L);
        } else {
            this.E0.p3(R.id.btn_checkUpdates);
        }
    }

    @Override
    public void F0(long j10, long j11) {
        this.E0.p3(R.id.btn_checkUpdates);
    }

    @Override
    public void N(k3 k3Var, float f10, float f11, int i10, boolean z10) {
        if (i.c2().k5(f11 * f10, z10)) {
            int i11 = (int) (f10 * 100.0f);
            if (this.G0 != i11) {
                this.G0 = i11;
                int O0 = this.E0.O0(R.id.btn_autoNightMode_description);
                if (O0 != -1) {
                    this.E0.D0().get(O0).X(w.j1(R.string.AutoNightModeDescriptionAuto, Integer.valueOf(this.G0)));
                    this.E0.r3(O0);
                }
            }
            t().p0();
        }
    }

    public final ra Ph() {
        return new ra(74).M(Float.floatToIntBits(this.I0)).U(null, Float.floatToIntBits(i.c2().i1()));
    }

    @Override
    public int R9() {
        return R.id.controller_themeSettings;
    }

    public final String Uh(String str, boolean z10) {
        int i10;
        boolean z11;
        if (z10) {
            str = w.j1(R.string.FileNameCopy, str);
            i10 = 1;
        } else {
            i10 = 2;
        }
        while (true) {
            String j12 = i10 == 1 ? str : w.j1(R.string.FileNameDuplicate, str, Integer.valueOf(i10));
            Iterator<r> it = this.L0.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().d().equals(j12)) {
                        i10++;
                        z11 = true;
                        break;
                    }
                } else {
                    z11 = false;
                    break;
                }
            }
            if (!z11) {
                Iterator<r> it2 = this.M0.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (it2.next().d().equals(j12)) {
                            i10++;
                            z11 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (!z11) {
                    return j12;
                }
            }
        }
    }

    public final void Vh() {
        rh rhVar = new rh(this.f24493a, this.f24495b);
        rhVar.Lp(new rh.c0(1, null, null));
        ac(rhVar);
    }

    public void Wh(c cVar) {
        super.Ad(cVar);
        this.D0 = cVar.f8012a;
    }

    @Override
    public CharSequence X9() {
        int i10 = this.D0;
        return w.i1(i10 == 2 ? R.string.CameraSettings : i10 == 1 ? R.string.Tweaks : R.string.Themes);
    }

    public void Xh(int i10, boolean z10) {
        int i11;
        boolean z11;
        int i12;
        int i13 = this.F0;
        if (i13 != i10) {
            this.F0 = i10;
            int i14 = 3;
            if (i10 == 0) {
                i11 = R.id.btn_autoNightModeNone;
            } else if (i10 == 1) {
                i11 = R.id.btn_autoNightModeAuto;
            } else if (i10 == 2) {
                i11 = R.id.btn_autoNightModeScheduled;
            } else if (i10 == 3) {
                i11 = R.id.btn_autoNightModeSystem;
            } else {
                throw new IllegalArgumentException("autoNightMode == " + i10);
            }
            this.E0.p2(R.id.btn_autoNightMode, i11);
            List<ra> D0 = this.E0.D0();
            int size = D0.size() - 1;
            ra raVar = D0.get(size);
            int i15 = R.string.AutoNightModeDescriptionScheduled;
            if (i10 == 0) {
                boolean z12 = this.H0;
                boolean z13 = z12 || i13 != 2;
                if (z13) {
                    if (z12) {
                        i15 = R.string.AutoNightModeDescription;
                    }
                    z11 = raVar.Y(i15);
                } else {
                    z11 = z13;
                }
            } else if (i10 == 1) {
                z11 = raVar.Z(w.j1(R.string.AutoNightModeDescriptionAuto, Integer.valueOf(this.G0)));
            } else if (i10 == 2) {
                boolean z14 = this.H0 || i13 != 0;
                z11 = z14 ? raVar.Y(R.string.AutoNightModeDescriptionScheduled) : z14;
            } else if (i10 != 3) {
                z11 = false;
            } else {
                z11 = raVar.Y(Build.VERSION.SDK_INT >= 29 ? R.string.AutoNightModeDescriptionSystemQ : R.string.AutoNightModeDescriptionSystem);
            }
            if (z11) {
                this.E0.I(size);
            }
            if (i10 == 0 || i10 == 3) {
                if (i13 == 0 || i13 == 3) {
                    i14 = 0;
                } else if (i13 == 2) {
                    i14 = 7;
                }
                if (i14 > 0) {
                    this.E0.R1(size - i14, i14);
                }
            } else if (i13 == 0 || i13 == 3) {
                int i16 = size + 1;
                D0.add(size, new ra(2));
                if (i10 != 1) {
                    if (i10 == 2) {
                        int i17 = i16 + 1;
                        D0.add(i16, Sh(true));
                        int i18 = i17 + 1;
                        D0.add(i17, new ra(11));
                        int i19 = i18 + 1;
                        D0.add(i18, Sh(false));
                        int i20 = i19 + 1;
                        D0.add(i19, new ra(11));
                        i12 = i20 + 1;
                        D0.add(i20, Th());
                    }
                    D0.add(i16, new ra(3));
                    this.E0.M(size, (i16 + 1) - size);
                } else {
                    i12 = i16 + 1;
                    D0.add(i16, Ph());
                }
                i16 = i12;
                D0.add(i16, new ra(3));
                this.E0.M(size, (i16 + 1) - size);
            } else if (i13 == 2) {
                int i21 = size - 5;
                D0.set(i21, Ph());
                this.E0.I(i21);
                this.E0.R1(i21 + 1, 3);
                this.E0.j1(i21 - 1);
            } else if (i13 == 1) {
                int i22 = size - 2;
                D0.set(i22, new ra(11));
                this.E0.I(i22);
                D0.add(i22, Sh(true));
                this.E0.J(i22);
                int i23 = i22 + 2;
                D0.add(i23, Th());
                D0.add(i23, new ra(11));
                D0.add(i23, Sh(false));
                this.E0.M(i23, 3);
            }
            if (i10 != 0 && i10 != 2 && z10) {
                ((LinearLayoutManager) kg().getLayoutManager()).z2(D0.size() - 1, 0);
            }
        }
    }

    public final void Yh(int i10, boolean z10) {
        int kh = kh(i10);
        if (kh != -1) {
            ra raVar = this.E0.D0().get(kh);
            if (raVar.D() != z10) {
                raVar.S(z10);
                this.E0.r3(kh);
            }
        }
    }

    @Override
    public void Z8() {
        super.Z8();
        gh();
        t1.b().d(this);
        t().c0().K(this);
    }

    public final void Zh() {
        int u02 = i.c2().u0();
        f2 f2Var = new f2(R.id.btn_chatListStyle);
        ra[] raVarArr = new ra[3];
        raVarArr[0] = new ra(13, (int) R.id.btn_chatListStyle1, 0, (int) R.string.ChatListStyle1, (int) R.id.btn_chatListStyle, u02 == 1);
        raVarArr[1] = new ra(13, (int) R.id.btn_chatListStyle2, 0, (int) R.string.ChatListStyle2, (int) R.id.btn_chatListStyle, u02 == 2);
        raVarArr[2] = new ra(13, (int) R.id.btn_chatListStyle3, 0, (int) R.string.ChatListStyle3, (int) R.id.btn_chatListStyle, u02 == 3);
        me(f2Var.p(raVarArr).j(new v4.r() {
            @Override
            public final void l6(int i10, SparseIntArray sparseIntArray) {
                fz.this.Hh(i10, sparseIntArray);
            }
        }).c(false));
    }

    public final void ai(final boolean z10) {
        ra[] raVarArr;
        final int F0 = i.c2().F0(z10);
        final int i10 = z10 ? R.id.btn_earpieceModeVideo : R.id.btn_earpieceMode;
        boolean z11 = true;
        ra raVar = new ra(13, (int) R.id.btn_earpieceMode_never, 0, (int) R.string.EarpieceModeNever, i10, F0 == 0);
        ra raVar2 = new ra(13, (int) R.id.btn_earpieceMode_proximity, 0, (int) R.string.EarpieceModeProximity, i10, F0 == 1);
        if (z10) {
            raVarArr = new ra[]{raVar, raVar2};
        } else {
            ra[] raVarArr2 = new ra[3];
            raVarArr2[0] = raVar;
            raVarArr2[1] = raVar2;
            if (F0 != 2) {
                z11 = false;
            }
            raVarArr2[2] = new ra(13, (int) R.id.btn_earpieceMode_always, 0, (int) R.string.EarpieceModeAlways, i10, z11);
            raVarArr = raVarArr2;
        }
        me(new f2(i10).p(raVarArr).c(false).j(new v4.r() {
            @Override
            public final void l6(int i11, SparseIntArray sparseIntArray) {
                fz.this.Ih(F0, i10, z10, i11, sparseIntArray);
            }
        }));
    }

    @Override
    public void b4() {
        fi();
    }

    public final void bi() {
        int U0 = i.c2().U0();
        f2 f2Var = new f2(R.id.btn_instantViewMode);
        ra[] raVarArr = new ra[3];
        raVarArr[0] = new ra(13, (int) R.id.btn_instantViewModeAll, 0, (int) R.string.AutoInstantViewAll, (int) R.id.btn_instantViewMode, U0 == 2);
        raVarArr[1] = new ra(13, (int) R.id.btn_instantViewModeTelegram, 0, (int) R.string.AutoInstantViewTelegram, (int) R.id.btn_instantViewMode, U0 == 1);
        raVarArr[2] = new ra(13, (int) R.id.btn_instantViewModeNone, 0, (int) R.string.AutoInstantViewNone, (int) R.id.btn_instantViewMode, U0 == 0);
        me(f2Var.p(raVarArr).c(false).b(w.i1(R.string.AutoInstantViewDesc)).j(new v4.r() {
            @Override
            public final void l6(int i10, SparseIntArray sparseIntArray) {
                fz.this.Jh(i10, sparseIntArray);
            }
        }));
    }

    public final void ci() {
        int K1 = i.c2().K1();
        f2 f2Var = new f2(R.id.btn_stickerSuggestions);
        ra[] raVarArr = new ra[3];
        raVarArr[0] = new ra(13, (int) R.id.btn_stickerSuggestionsAll, 0, (int) R.string.SuggestStickersAll, (int) R.id.btn_stickerSuggestions, K1 == 0);
        raVarArr[1] = new ra(13, (int) R.id.btn_stickerSuggestionsInstalled, 0, (int) R.string.SuggestStickersInstalled, (int) R.id.btn_stickerSuggestions, K1 == 1);
        raVarArr[2] = new ra(13, (int) R.id.btn_stickerSuggestionsNone, 0, (int) R.string.SuggestStickersNone, (int) R.id.btn_stickerSuggestions, K1 == 2);
        me(f2Var.p(raVarArr).j(new v4.r() {
            @Override
            public final void l6(int i10, SparseIntArray sparseIntArray) {
                fz.this.Kh(i10, sparseIntArray);
            }
        }).c(false));
    }

    public final void di(final ra raVar) {
        CharSequence charSequence;
        int l10 = raVar.l();
        boolean A = z.A(l10);
        int V = z.V(l10);
        boolean z10 = A && i.c2().Y1(V);
        boolean x10 = z.u().x(l10);
        int i10 = A ? x10 ? 3 : 4 : 1;
        jb.c cVar = new jb.c(i10);
        jb.c cVar2 = new jb.c(i10);
        u0 u0Var = new u0(i10);
        jb.c cVar3 = new jb.c(i10);
        if (A) {
            int i11 = R.string.Share;
            if (z10) {
                charSequence = w.m1(R.string.ThemeEditInfo, raVar.u());
                cVar.a(R.id.btn_edit);
                cVar2.a(R.drawable.baseline_edit_24);
                u0Var.a(R.string.ThemeEdit);
                cVar3.a(1);
                cVar.a(R.id.btn_share);
                cVar2.a(R.drawable.baseline_forward_24);
                if (i.c2().z(V)) {
                    i11 = R.string.ThemeExport;
                }
                u0Var.a(i11);
                cVar3.a(1);
                if (!x10) {
                    cVar.a(R.id.btn_new);
                    cVar2.a(R.drawable.baseline_content_copy_24);
                    u0Var.a(R.string.ThemeCopy);
                    cVar3.a(1);
                }
            } else {
                charSequence = w.m1(R.string.ThemeCreateInfo, raVar.u());
                cVar.a(R.id.btn_new);
                cVar2.a(R.drawable.baseline_edit_24);
                u0Var.a(R.string.ThemeCreate);
                cVar3.a(1);
                cVar.a(R.id.btn_share);
                cVar2.a(R.drawable.baseline_forward_24);
                u0Var.a(R.string.Share);
                cVar3.a(1);
            }
            cVar.a(R.id.btn_delete);
            cVar2.a(R.drawable.baseline_delete_forever_24);
            u0Var.a(R.string.ThemeRemove);
            cVar3.a(2);
        } else {
            charSequence = w.m1(R.string.ThemeCreateInfo, raVar.u());
            cVar.a(R.id.btn_new);
            cVar2.a(R.drawable.baseline_create_24);
            u0Var.a(R.string.ThemeCreate);
            cVar3.a(1);
        }
        ee(charSequence, cVar.e(), u0Var.d(), cVar3.e(), cVar2.e(), new h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i12) {
                return g0.b(this, i12);
            }

            @Override
            public final boolean r3(View view, int i12) {
                boolean Mh;
                Mh = fz.this.Mh(raVar, view, i12);
                return Mh;
            }
        });
    }

    @Override
    public void e2() {
        iq iqVar = this.E0;
        if (iqVar != null) {
            View C = kg().getLayoutManager().C(iqVar.L0(R.id.btn_emoji));
            if (C != null) {
                C.invalidate();
            }
        }
    }

    public final void sh(r rVar) {
        if (rVar != null) {
            int L0 = this.E0.L0(R.id.btn_themeCreate);
            if (L0 != -1) {
                int size = L0 - (this.M0.size() * 2);
                if (rVar.l()) {
                    this.L0.add(0, rVar);
                    int i10 = size - 1;
                    if (this.L0.isEmpty()) {
                        this.E0.D0().add(i10, new ra(3));
                        this.E0.D0().add(i10, Rh(rVar));
                        this.E0.D0().add(i10, new ra(2));
                        this.E0.M(i10, 3);
                        return;
                    }
                    int size2 = i10 - (this.L0.size() * 2);
                    this.E0.D0().add(size2, new ra(11));
                    this.E0.D0().add(size2, Rh(rVar));
                    this.E0.M(size2, 2);
                    return;
                }
                this.M0.add(0, rVar);
                this.E0.D0().add(size, new ra(11));
                this.E0.D0().add(size, Rh(rVar));
                this.E0.M(size, 2);
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public final void ei() {
        int i02 = i.c2().i0();
        f2 f2Var = new f2(R.id.btn_updateAutomatically);
        ra[] raVarArr = new ra[4];
        raVarArr[0] = new ra(13, (int) R.id.btn_updateAutomaticallyPrompt, 0, (int) R.string.AutoUpdatePrompt, (int) R.id.btn_updateAutomatically, i02 == 0);
        raVarArr[1] = new ra(13, (int) R.id.btn_updateAutomaticallyAlways, 0, (int) R.string.AutoUpdateAlways, (int) R.id.btn_updateAutomatically, i02 == 3);
        raVarArr[2] = new ra(13, (int) R.id.btn_updateAutomaticallyWiFi, 0, (int) R.string.AutoUpdateWiFi, (int) R.id.btn_updateAutomatically, i02 == 2);
        raVarArr[3] = new ra(13, (int) R.id.btn_updateAutomaticallyNever, 0, (int) R.string.AutoUpdateNever, (int) R.id.btn_updateAutomatically, i02 == 1);
        me(f2Var.p(raVarArr).c(false).j(new v4.r() {
            @Override
            public final void l6(int i10, SparseIntArray sparseIntArray) {
                fz.this.Nh(i10, sparseIntArray);
            }
        }));
    }

    public final void fh(List<ra> list, List<r> list2, boolean z10) {
        if (!list2.isEmpty() || z10) {
            list.add(new ra(2, 0));
            boolean z11 = true;
            for (r rVar : list2) {
                boolean j10 = rVar.j();
                if (z.u().x(rVar.c())) {
                    this.O0 = rVar;
                }
                if (z11) {
                    z11 = false;
                } else {
                    list.add(new ra(11));
                }
                if (j10) {
                    list.add(Rh(rVar));
                } else {
                    list.add(Rh(rVar));
                }
            }
            if (z10) {
                if (!z11) {
                    list.add(new ra(11));
                }
                list.add(new ra(4, R.id.btn_themeCreate, 0, R.string.ThemeCreate));
            }
            list.add(new ra(3));
            if (z10) {
                ra raVar = new ra(9, R.id.btn_themeCreateInfo);
                this.P0 = raVar;
                list.add(raVar);
                r rVar2 = this.O0;
                if (rVar2 != null) {
                    this.P0.X(w.m1(R.string.ThemeCreateInfo, rVar2.d()));
                }
            }
        }
    }

    public void fi() {
        iq iqVar = this.E0;
        if (iqVar != null) {
            iqVar.p3(R.id.btn_emoji);
        }
    }

    public final void gh() {
        x0 x0Var = this.J0;
        if (x0Var != null) {
            x0Var.h();
            this.J0 = null;
        }
    }

    public void gi() {
        iq iqVar = this.E0;
        if (iqVar != null) {
            iqVar.p3(R.id.btn_icon);
        }
    }

    public final void hh(final r rVar) {
        if (rVar != null) {
            final boolean k10 = rVar.k();
            Pc(w.i1(R.string.ThemeCreateTitle), w.i1(R.string.ThemeName), R.string.ThemeCreateConfirm, R.string.Cancel, Uh(rVar.d(), k10), new v4.m() {
                @Override
                public final boolean a(y1 y1Var, String str) {
                    boolean ph;
                    ph = fz.this.ph(k10, rVar, y1Var, str);
                    return ph;
                }
            }, true);
        }
    }

    public void hi(r rVar) {
        iq iqVar;
        int J0;
        if (!Sa() && (iqVar = this.E0) != null && (J0 = iqVar.J0(rVar)) != -1) {
            this.E0.D0().get(J0).X(rVar.d());
            this.E0.r3(J0);
        }
    }

    @Override
    public void i3(p pVar, p pVar2) {
        Yh(pVar.a(), false);
        Yh(pVar2.a(), true);
        r lh = lh(pVar2);
        if (lh != null && this.O0 != lh) {
            this.O0 = lh;
            ra raVar = this.P0;
            if (raVar != null && raVar.Z(w.m1(R.string.ThemeCreateInfo, lh.d()))) {
                iq iqVar = this.E0;
                iqVar.r3(iqVar.F0(this.P0));
            }
        }
    }

    public void ih(r rVar, boolean z10) {
        if (!Sa()) {
            final RecyclerView.m itemAnimator = z10 ? null : kg().getItemAnimator();
            if (!z10 && itemAnimator != null) {
                kg().setItemAnimator(null);
            }
            if (rVar.l()) {
                int indexOf = this.L0.indexOf(rVar);
                if (indexOf != -1) {
                    int J0 = this.E0.J0(rVar);
                    this.L0.remove(indexOf);
                    if (this.L0.isEmpty()) {
                        this.E0.R1(J0 - 1, 3);
                    } else if (indexOf == 0) {
                        this.E0.R1(J0, 2);
                    } else {
                        this.E0.R1(J0 - 1, 2);
                    }
                } else {
                    return;
                }
            } else {
                int indexOf2 = this.M0.indexOf(rVar);
                if (indexOf2 != -1) {
                    this.M0.remove(indexOf2);
                    int J02 = this.E0.J0(rVar);
                    if (J02 != -1) {
                        this.E0.R1(J02, 2);
                    }
                } else {
                    return;
                }
            }
            if (!z10 && itemAnimator != null) {
                this.f24495b.hd().postDelayed(new Runnable() {
                    @Override
                    public final void run() {
                        fz.this.qh(itemAnimator);
                    }
                }, 100L);
            }
        }
    }

    public final void rh(final r rVar, final boolean z10) {
        if (!Sa()) {
            if (!z.u().x(rVar.c())) {
                z.u().h(this.f24495b, rVar.e(), true, new Runnable() {
                    @Override
                    public final void run() {
                        fz.this.rh(rVar, z10);
                    }
                });
                return;
            }
            t30 t30Var = new t30(this.f24493a, this.f24495b);
            t30Var.Ad(new t30.a(rVar, z10 ? new Runnable() {
                @Override
                public final void run() {
                    fz.this.sh(rVar);
                }
            } : null, this));
            ac(t30Var);
        }
    }

    public final int kh(int i10) {
        int L0 = this.E0.L0(R.id.btn_theme);
        if (L0 != -1) {
            int D = this.E0.D();
            while (L0 < D) {
                ra raVar = this.E0.D0().get(L0);
                if (raVar.j() == R.id.btn_theme && raVar.l() == i10) {
                    return L0;
                }
                L0++;
            }
        }
        return -1;
    }

    @Override
    public void l6(int i10, SparseIntArray sparseIntArray) {
        int i11;
        if (i10 == R.id.theme_chat) {
            switch (sparseIntArray.get(R.id.theme_chat, R.id.theme_chat_modern)) {
                case R.id.theme_chat_classic:
                    i11 = 2;
                    break;
                case R.id.theme_chat_modern:
                    i11 = 1;
                    break;
                default:
                    return;
            }
            this.f24495b.tc().l0(i11);
            this.E0.p3(R.id.theme_chat);
        }
    }

    public final r lh(p pVar) {
        int a10 = pVar.a();
        if (z.A(a10)) {
            List<r> list = this.L0;
            if (list != null) {
                for (r rVar : list) {
                    if (a10 == rVar.c()) {
                        return rVar;
                    }
                }
            }
            List<r> list2 = this.M0;
            if (list2 == null) {
                return null;
            }
            for (r rVar2 : list2) {
                if (a10 == rVar2.c()) {
                    return rVar2;
                }
            }
            return null;
        }
        List<r> list3 = this.K0;
        if (list3 == null) {
            return null;
        }
        for (r rVar3 : list3) {
            if (a10 == rVar3.c()) {
                return rVar3;
            }
        }
        return null;
    }

    public final p nh(ra raVar) {
        return ((r) raVar.d()).e();
    }

    @Override
    public void onClick(View view) {
        int i10 = 3;
        int i11 = 2;
        final boolean z10 = false;
        switch (view.getId()) {
            case R.id.btn_audioCompression:
                i.c2().i5(256L, !this.E0.S2(view));
                return;
            case R.id.btn_autoNightModeAuto:
            case R.id.btn_autoNightModeNone:
            case R.id.btn_autoNightModeScheduled:
            case R.id.btn_autoNightModeSystem:
                if (this.E0.H1(view)) {
                    int i12 = this.E0.y0().get(R.id.btn_autoNightMode);
                    if (i12 != R.id.btn_autoNightModeSystem) {
                        switch (i12) {
                            case R.id.btn_autoNightModeAuto:
                                i10 = 1;
                                break;
                            case R.id.btn_autoNightModeNone:
                                i10 = 0;
                                break;
                            case R.id.btn_autoNightModeScheduled:
                                i10 = 2;
                                break;
                            default:
                                return;
                        }
                    }
                    Xh(i10, true);
                    i.c2().f4(i10);
                    return;
                }
                return;
            case R.id.btn_autoNightModeScheduled_location:
                if (this.J0 == null) {
                    this.J0 = x0.y(this.f24493a, 10000L, true, true, new x0.f() {
                        @Override
                        public final void a(int i13, Location location) {
                            fz.this.Eh(i13, location);
                        }
                    });
                    this.E0.p3(R.id.btn_autoNightModeScheduled_location);
                    return;
                }
                return;
            case R.id.btn_autoNightModeScheduled_timeOff:
            case R.id.btn_autoNightModeScheduled_timeOn:
                final int id2 = view.getId();
                if (id2 == R.id.btn_autoNightModeScheduled_timeOn) {
                    z10 = true;
                }
                i c22 = i.c2();
                final int p12 = z10 ? c22.p1() : c22.o1();
                g.l(new TimePickerDialog(t(), ae.j.t(), new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public final void onTimeSet(TimePicker timePicker, int i13, int i14) {
                        fz.this.vh(p12, z10, id2, timePicker, i13, i14);
                    }
                }, ib.c.j(p12), ib.c.k(p12), !j0.X()));
                return;
            case R.id.btn_autoplayGIFs:
                i.c2().h4(this.E0.S2(view));
                return;
            case R.id.btn_cameraRatio:
                ee(w.q(w.i1(R.string.CameraRatio)), new int[]{R.id.btn_cameraRatio_16_9, R.id.btn_cameraRatio_4_3, R.id.btn_cameraRatio_fullScreen}, new String[]{"16:9", "4:3", w.i1(R.string.CameraRatioFull)}, null, new int[]{R.drawable.baseline_crop_16_9_24, R.drawable.baseline_crop_3_2_24, R.drawable.baseline_crop_free_24}, new h0() {
                    @Override
                    public boolean P() {
                        return g0.a(this);
                    }

                    @Override
                    public Object a2(int i13) {
                        return g0.b(this, i13);
                    }

                    @Override
                    public final boolean r3(View view2, int i13) {
                        boolean zh;
                        zh = fz.this.zh(view2, i13);
                        return zh;
                    }
                });
                return;
            case R.id.btn_cameraSetting:
                ra raVar = (ra) view.getTag();
                i c23 = i.c2();
                long m10 = raVar.m();
                if (raVar.b() != this.E0.S2(view)) {
                    z10 = true;
                }
                c23.i5(m10, z10);
                return;
            case R.id.btn_cameraType:
                if (fd.a.f11889k) {
                    int r02 = i.c2().r0();
                    ra[] raVarArr = new ra[3];
                    raVarArr[0] = new ra(13, (int) R.id.btn_cameraTypeX, 0, (int) R.string.CameraTypeXBeta, (int) R.id.btn_cameraType, r02 == 1);
                    raVarArr[1] = new ra(13, (int) R.id.btn_cameraTypeLegacy, 0, (int) R.string.CameraTypeLegacy, (int) R.id.btn_cameraType, r02 == 0);
                    raVarArr[2] = new ra(13, (int) R.id.btn_cameraTypeSystem, 0, (int) R.string.CameraTypeSystem, (int) R.id.btn_cameraType, r02 == 2);
                    ne(R.id.btn_cameraType, raVarArr, new v4.r() {
                        @Override
                        public final void l6(int i13, SparseIntArray sparseIntArray) {
                            fz.this.Bh(i13, sparseIntArray);
                        }
                    });
                    return;
                }
                i c24 = i.c2();
                if (!this.E0.S2(view)) {
                    i11 = 0;
                }
                c24.k4(i11);
                return;
            case R.id.btn_cameraVolume:
                ee(w.q(w.i1(R.string.CameraVolume)), new int[]{R.id.btn_cameraVolumeShoot, R.id.btn_cameraVolumeZoom, R.id.btn_cameraVolumeNone}, new String[]{w.i1(R.string.CameraVolumeShoot), w.i1(R.string.CameraVolumeZoom), w.i1(R.string.CameraVolumeNone)}, null, new int[]{R.drawable.baseline_camera_enhance_24, R.drawable.baseline_zoom_in_24, R.drawable.baseline_volume_up_24}, new h0() {
                    @Override
                    public boolean P() {
                        return g0.a(this);
                    }

                    @Override
                    public Object a2(int i13) {
                        return g0.b(this, i13);
                    }

                    @Override
                    public final boolean r3(View view2, int i13) {
                        boolean Ah;
                        Ah = fz.this.Ah(view2, i13);
                        return Ah;
                    }
                });
                return;
            case R.id.btn_chatBackground:
                if (Build.VERSION.SDK_INT < 23 || t().checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
                    Vh();
                    return;
                } else {
                    t().K2(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, new ie.a() {
                        @Override
                        public final void l1(int i13, boolean z11) {
                            fz.this.yh(i13, z11);
                        }
                    });
                    return;
                }
            case R.id.btn_chatFontSize:
                rh rhVar = new rh(this.f24493a, this.f24495b);
                rhVar.Lp(new rh.c0(2, null, null));
                ac(rhVar);
                return;
            case R.id.btn_chatListStyle:
                Zh();
                return;
            case R.id.btn_chatSwipes:
                ne(R.id.btn_chatSwipes, new ra[]{new ra(12, (int) R.id.btn_messageShare, 0, (int) R.string.Share, (int) R.id.btn_messageShare, i.c2().C2()), new ra(12, (int) R.id.btn_messageReply, 0, (int) R.string.Reply, (int) R.id.btn_messageReply, i.c2().B2())}, new v4.r() {
                    @Override
                    public final void l6(int i13, SparseIntArray sparseIntArray) {
                        fz.this.xh(i13, sparseIntArray);
                    }
                });
                return;
            case R.id.btn_checkUpdates:
                int M = t().c0().M();
                if (M == 0) {
                    t().c0().m();
                    return;
                } else if (M == 2) {
                    t().c0().o();
                    return;
                } else if (M == 4) {
                    t().c0().q();
                    return;
                } else {
                    return;
                }
            case R.id.btn_confirmCalls:
                i.c2().b5(this.E0.S2(view));
                return;
            case R.id.btn_customVibrations:
                i.c2().L5(this.E0.S2(view));
                return;
            case R.id.btn_earpieceMode:
                ai(false);
                return;
            case R.id.btn_earpieceModeVideo:
                ai(true);
                return;
            case R.id.btn_emoji:
                v4<?> zsVar = new zs(this.f24493a, this.f24495b);
                zsVar.Ad(new ys.c(this));
                ac(zsVar);
                return;
            case R.id.btn_forceExoPlayerExtensions:
                i.c2().i5(128L, this.E0.S2(view));
                return;
            case R.id.btn_hideChatKeyboard:
                i.c2().Y4(this.E0.S2(view));
                return;
            case R.id.btn_hqRounds:
                i.c2().a5(this.E0.S2(view));
                return;
            case R.id.btn_icon:
                v4<?> atVar = new at(this.f24493a, this.f24495b);
                atVar.Ad(new ys.c(this));
                ac(atVar);
                return;
            case R.id.btn_ignoreContentRestrictions:
                i.c2().B5(!this.E0.S2(view));
                return;
            case R.id.btn_instantViewMode:
                bi();
                return;
            case R.id.btn_markdown:
                i.c2().i5(4L, this.E0.S2(view));
                return;
            case R.id.btn_mosaic:
                i.c2().A5(this.E0.S2(view));
                return;
            case R.id.btn_previewChat:
                rh rhVar2 = new rh(this.f24493a, this.f24495b);
                rhVar2.Lp(new rh.c0(0, null, null));
                ac(rhVar2);
                return;
            case R.id.btn_rearRounds:
                i.c2().H5(this.E0.S2(view));
                return;
            case R.id.btn_reduceMotion:
                i.c2().g6();
                this.E0.p3(R.id.btn_reduceMotion);
                return;
            case R.id.btn_restrictSensitiveContent:
                this.f24495b.Zb(this.E0.S2(view));
                return;
            case R.id.btn_saveToGallery:
                i.c2().C5(this.E0.S2(view));
                return;
            case R.id.btn_secret_batmanTransitions:
                i.c2().i5(2L, this.E0.S2(view));
                return;
            case R.id.btn_sendByEnter:
                i.c2().e5(this.E0.S2(view));
                return;
            case R.id.btn_separateMedia:
                i.c2().f5(this.E0.S2(view));
                return;
            case R.id.btn_sizeUnit:
                boolean k12 = i.c2().k1(64L);
                me(new f2(R.id.btn_sizeUnit).p(new ra[]{new ra(13, (int) R.id.btn_sizeUnitMetric, 0, (int) R.string.SizeUnitMetric, (int) R.id.btn_sizeUnit, k12), new ra(13, (int) R.id.btn_sizeUnitBinary, 0, (int) R.string.SizeUnitBinary, (int) R.id.btn_sizeUnit, !k12)}).j(new v4.r() {
                    @Override
                    public final void l6(int i13, SparseIntArray sparseIntArray) {
                        fz.this.wh(i13, sparseIntArray);
                    }
                }).c(false));
                return;
            case R.id.btn_stickerSuggestions:
                ci();
                return;
            case R.id.btn_subscribeToBeta:
                this.f24495b.hd().U8(this);
                return;
            case R.id.btn_switchRtl:
                i.c2().d5(w.k2(), this.E0.S2(view));
                return;
            case R.id.btn_systemEmoji:
                i.c2().O5(this.E0.S2(view));
                return;
            case R.id.btn_systemFonts:
                Boolean f10 = o.f();
                if (f10 != null && f10.booleanValue() != i.c2().s6()) {
                    i.c2().P5(f10.booleanValue());
                    this.E0.p3(R.id.btn_systemFonts);
                    return;
                } else if (i.c2().s6()) {
                    re(w.i1(R.string.RestartEffect), new kb.i() {
                        @Override
                        public final void a(boolean z11) {
                            fz.this.Ch(z11);
                        }
                    });
                    return;
                } else {
                    re(TextUtils.concat(w.H0(this, R.string.UseSystemFontsHint, new Object[0]), "\n\n", w.i1(R.string.RestartEffect)), new kb.i() {
                        @Override
                        public final void a(boolean z11) {
                            fz.this.Dh(z11);
                        }
                    });
                    return;
                }
            case R.id.btn_theme:
                ra raVar2 = (ra) view.getTag();
                if (z.u().x(raVar2.l())) {
                    r rVar = (r) raVar2.d();
                    if (!rVar.l() && rVar.k()) {
                        rh(rVar, false);
                        return;
                    } else if (rVar.k()) {
                        di(raVar2);
                        return;
                    } else {
                        return;
                    }
                } else {
                    z.u().h(this.f24495b, nh(raVar2), false, null);
                    return;
                }
            case R.id.btn_themeCreate:
                hh(this.O0);
                return;
            case R.id.btn_toggleNewSetting:
                ra raVar3 = (ra) view.getTag();
                boolean S2 = this.E0.S2(view);
                if (raVar3.b()) {
                    S2 = !S2;
                }
                i.c2().i5(raVar3.m(), S2);
                if (S2 && raVar3.m() == 512) {
                    t().c0().m();
                    return;
                }
                return;
            case R.id.btn_updateAutomatically:
                ei();
                return;
            case R.id.btn_useBigEmoji:
                i.c2().K5(this.E0.S2(view));
                return;
            case R.id.btn_useHoldToPreview:
                i.c2().c5(this.E0.S2(view));
                return;
            case R.id.btn_useInAppBrowser:
                i.c2().M5(this.E0.S2(view));
                return;
            default:
                int c10 = ((ra) view.getTag()).c();
                if (c10 != R.id.btn_forcePlainChannels) {
                    if (c10 == R.id.theme_chat && this.E0.H1(view)) {
                        if (this.E0.y0().get(R.id.theme_chat) != R.id.theme_chat_classic) {
                            i11 = 1;
                        }
                        this.f24495b.tc().l0(i11);
                        return;
                    }
                    return;
                } else if (this.E0.H1(view)) {
                    if (this.E0.y0().get(R.id.btn_forcePlainChannels) != R.id.btn_forcePlainChannels) {
                        z10 = true;
                    }
                    this.f24495b.tc().m0(z10);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public boolean onLongClick(View view) {
        if (view.getId() != R.id.btn_theme) {
            return false;
        }
        di((ra) view.getTag());
        return true;
    }

    @Override
    public boolean pg() {
        return true;
    }

    @Override
    public void q0(int i10) {
        Xh(i10, false);
    }

    @Override
    public void rg(Context context, CustomRecyclerView customRecyclerView) {
        this.E0 = new a(this);
        ArrayList arrayList = new ArrayList();
        int i10 = this.f24495b.tc().i();
        int i11 = this.D0;
        if (i11 == 0) {
            this.E0.B2(this);
            arrayList.add(new ra(14));
            arrayList.add(new ra(8, 0, 0, R.string.ChatMode));
            arrayList.add(new ra(2));
            arrayList.add(new ra(12, (int) R.id.theme_chat_classic, 0, (int) R.string.ChatStyleBubbles, (int) R.id.theme_chat, i10 == 2));
            arrayList.add(new ra(11));
            arrayList.add(new ra(12, (int) R.id.btn_forcePlainChannels, 0, (int) R.string.ChatStyleBubblesChannel, (int) R.id.btn_forcePlainChannels, !this.f24495b.tc().r()));
            if (!this.f24495b.A1().G()) {
                arrayList.add(new ra(11));
                arrayList.add(new ra(89, R.id.btn_emoji, 0, R.string.Emoji).I(new u(w.i1(R.string.EmojiPreview), y.f())));
                t1.b().a(this);
            }
            arrayList.add(new ra(11));
            arrayList.add(new ra(89, R.id.btn_chatListStyle, 0, R.string.ChatListStyle));
            arrayList.add(new ra(11));
            arrayList.add(new ra(4, R.id.btn_chatBackground, 0, R.string.Wallpaper));
            arrayList.add(new ra(11));
            arrayList.add(new ra(4, R.id.btn_chatFontSize, 0, R.string.TextSize));
            arrayList.add(new ra(3));
            arrayList.add(new ra(8, 0, 0, R.string.ColorTheme));
            List<r> q10 = z.u().q();
            this.K0 = q10;
            fh(arrayList, q10, false);
            List<r> D0 = i.c2().D0();
            Collections.sort(D0, this.N0);
            this.L0 = new ArrayList();
            this.M0 = new ArrayList();
            for (r rVar : D0) {
                if (rVar.l()) {
                    this.L0.add(rVar);
                } else {
                    this.M0.add(rVar);
                }
            }
            fh(arrayList, this.L0, false);
            fh(arrayList, this.M0, true);
            this.H0 = false;
            this.I0 = 20.0f;
            float f10 = 0.0f;
            try {
                SensorManager sensorManager = (SensorManager) j0.q().getSystemService("sensor");
                if (sensorManager != null) {
                    Sensor defaultSensor = sensorManager.getDefaultSensor(5);
                    boolean z10 = defaultSensor != null;
                    this.H0 = z10;
                    if (z10) {
                        float min = Math.min(this.I0, defaultSensor.getMaximumRange());
                        this.I0 = min;
                        boolean z11 = min > 0.0f;
                        this.H0 = z11;
                        if (z11) {
                            this.I0 = Math.max(min, 2.25f);
                        }
                    }
                }
            } catch (Throwable th) {
                Log.i("Cannot access light sensor", th, new Object[0]);
            }
            this.F0 = i.c2().m1();
            if (this.I0 != 0.0f) {
                f10 = h.d(i.c2().i1() / this.I0);
            }
            this.G0 = (int) (f10 * 100.0f);
            arrayList.add(new ra(8, 0, 0, R.string.AutoNightMode));
            arrayList.add(new ra(2));
            arrayList.add(new ra(13, (int) R.id.btn_autoNightModeNone, 0, (int) R.string.AutoNightDisabled, (int) R.id.btn_autoNightMode, this.F0 == 0));
            if (i.Q == 3 || this.F0 == 3 || t().h1()) {
                arrayList.add(new ra(11));
                arrayList.add(new ra(13, (int) R.id.btn_autoNightModeSystem, 0, Build.VERSION.SDK_INT >= 29 ? R.string.AutoNightSystemQ : R.string.AutoNightSystem, (int) R.id.btn_autoNightMode, this.F0 == 3));
            }
            if (this.H0) {
                this.E0.J2(this);
                arrayList.add(new ra(11));
                arrayList.add(new ra(13, (int) R.id.btn_autoNightModeAuto, 0, (int) R.string.AutoNightAutomatic, (int) R.id.btn_autoNightMode, this.F0 == 1));
            }
            arrayList.add(new ra(11));
            arrayList.add(new ra(13, (int) R.id.btn_autoNightModeScheduled, 0, (int) R.string.AutoNightScheduled, (int) R.id.btn_autoNightMode, this.F0 == 2));
            arrayList.add(new ra(3));
            int i12 = this.F0;
            int i13 = R.string.AutoNightModeDescriptionScheduled;
            if (i12 == 0) {
                if (this.H0) {
                    i13 = R.string.AutoNightModeDescription;
                }
                arrayList.add(new ra(9, R.id.btn_autoNightMode_description, 0, i13));
            } else if (i12 == 1) {
                arrayList.add(new ra(2));
                arrayList.add(Ph());
                arrayList.add(new ra(3));
                arrayList.add(new ra(9, (int) R.id.btn_autoNightMode_description, 0, (CharSequence) w.j1(R.string.AutoNightModeDescriptionAuto, Integer.valueOf(this.G0)), false));
            } else if (i12 == 2) {
                arrayList.add(new ra(2));
                arrayList.add(Sh(true));
                arrayList.add(new ra(11));
                arrayList.add(Sh(false));
                arrayList.add(new ra(11));
                arrayList.add(Th());
                arrayList.add(new ra(3));
                arrayList.add(new ra(9, (int) R.id.btn_autoNightMode_description, 0, (CharSequence) w.i1(R.string.AutoNightModeDescriptionScheduled), false));
            } else if (i12 == 3) {
                arrayList.add(new ra(9, R.id.btn_autoNightMode_description, 0, Build.VERSION.SDK_INT >= 29 ? R.string.AutoNightModeDescriptionSystemQ : R.string.AutoNightModeDescriptionSystem));
            }
            ed.j.a(customRecyclerView, new b());
        } else if (i11 == 1) {
            arrayList.add(new ra(7, R.id.btn_autoplayGIFs, 0, R.string.AutoplayGifs));
            if (fd.a.f11890l) {
                arrayList.add(new ra(11));
                arrayList.add(new ra(7, (int) R.id.btn_useInAppBrowser, 0, (int) R.string.UseInAppBrowser, i.c2().q6()));
            }
            arrayList.add(new ra(11));
            arrayList.add(new ra(7, (int) R.id.btn_useHoldToPreview, 0, (int) R.string.HoldToPreview, i.c2().M2()));
            arrayList.add(new ra(11));
            arrayList.add(new ra(7, R.id.btn_customVibrations, 0, R.string.CustomVibrations));
            arrayList.add(new ra(11));
            arrayList.add(new ra(7, (int) R.id.btn_reduceMotion, 0, (int) R.string.ReduceMotion, i.c2().O2()));
            if (w.G2() || w.B0() != 0) {
                arrayList.add(new ra(11));
                arrayList.add(new ra(7, R.id.btn_switchRtl, 0, R.string.RtlLayout));
            }
            arrayList.add(new ra(3));
            if (v0.f1()) {
                arrayList.addAll(Arrays.asList(new ra(8, 0, 0, R.string.InAppUpdates), new ra(2), new ra(92, R.id.btn_updateAutomatically, 0, R.string.AutoUpdate)));
                if (i.c2().i0() != 1) {
                    arrayList.addAll(Oh());
                }
            } else {
                arrayList.addAll(Arrays.asList(new ra(8, 0, 0, R.string.AppUpdates), new ra(2), new ra(4, R.id.btn_checkUpdates, 0, R.string.CheckForUpdates), new ra(11), new ra(4, R.id.btn_subscribeToBeta, 0, R.string.SubscribeToBeta)));
            }
            arrayList.add(new ra(3));
            t().c0().i(this);
            arrayList.add(new ra(8, 0, 0, R.string.Chats));
            arrayList.add(new ra(2));
            arrayList.add(new ra(7, R.id.btn_toggleNewSetting, 0, R.string.AnimatedEmoji).N(16L).E(true));
            arrayList.add(new ra(11));
            arrayList.add(new ra(7, R.id.btn_useBigEmoji, 0, R.string.BigEmoji));
            arrayList.add(new ra(11));
            arrayList.add(new ra(7, R.id.btn_toggleNewSetting, 0, R.string.LoopAnimatedStickers).N(8L).E(true));
            arrayList.add(new ra(11));
            arrayList.add(new ra(89, R.id.btn_stickerSuggestions, 0, R.string.SuggestStickers));
            boolean f12 = v0.f1();
            if (this.f24495b.z2() && (f12 || this.f24495b.B6())) {
                arrayList.add(new ra(11));
                arrayList.add(new ra(7, R.id.btn_restrictSensitiveContent, 0, R.string.DisplaySensitiveContent));
            }
            if (f12 || !i.c2().P2()) {
                arrayList.add(new ra(11));
                arrayList.add(new ra(7, R.id.btn_ignoreContentRestrictions, 0, R.string.IgnoreRestrictions));
            }
            if (i.c2().k1(32L)) {
                arrayList.add(new ra(11));
                arrayList.add(new ra(7, R.id.btn_toggleNewSetting, 0, R.string.UseExplicitDice).N(32L));
            }
            arrayList.add(new ra(3));
            arrayList.add(new ra(2));
            arrayList.add(new ra(89, R.id.btn_chatSwipes, 0, R.string.ChatQuickActions));
            arrayList.add(new ra(11));
            arrayList.add(new ra(7, R.id.btn_sendByEnter, 0, R.string.SendByEnter));
            arrayList.add(new ra(11));
            arrayList.add(new ra(7, R.id.btn_hideChatKeyboard, 0, R.string.HideChatKeyboard));
            arrayList.add(new ra(11));
            arrayList.add(new ra(7, R.id.btn_saveToGallery, 0, R.string.SaveOutgoingPhotos));
            arrayList.add(new ra(11));
            arrayList.add(new ra(89, R.id.btn_instantViewMode, 0, R.string.AutoInstantView));
            arrayList.add(new ra(11));
            arrayList.add(new ra(7, R.id.btn_toggleNewSetting, 0, R.string.OpenEmbed).N(8192L).E(true));
            arrayList.add(new ra(3));
            arrayList.add(new ra(9, 0, 0, w.H0(this, R.string.OpenEmbedDesc, new Object[0]), false));
            arrayList.add(new ra(2));
            arrayList.add(new ra(89, R.id.btn_sizeUnit, 0, R.string.SizeUnit));
            arrayList.add(new ra(11));
            arrayList.add(new ra(7, R.id.btn_mosaic, 0, R.string.RememberAlbumSetting));
            arrayList.add(new ra(11));
            arrayList.add(new ra(7, R.id.btn_separateMedia, 0, R.string.SeparateMediaTab));
            arrayList.add(new ra(11));
            arrayList.add(new ra(7, R.id.btn_markdown, 0, R.string.EditMarkdown));
            arrayList.add(new ra(3));
            arrayList.add(new ra(9, 0, 0, w.H0(this, R.string.EditMarkdownHint2, new Object[0]), false));
            arrayList.add(new ra(8, 0, 0, R.string.VoiceMessages));
            arrayList.add(new ra(2));
            arrayList.add(new ra(89, R.id.btn_earpieceMode, 0, R.string.EarpieceMode));
            arrayList.add(new ra(3));
            arrayList.add(new ra(8, 0, 0, R.string.VideoMessages));
            arrayList.add(new ra(2));
            arrayList.add(new ra(89, R.id.btn_earpieceModeVideo, 0, R.string.EarpieceMode));
            arrayList.add(new ra(11));
            arrayList.add(new ra(7, R.id.btn_rearRounds, 0, R.string.UseRearRoundVideos));
            if (!fd.b.f11917n && fd.a.f11894p) {
                arrayList.add(new ra(11));
                arrayList.add(new ra(7, R.id.btn_hqRounds, 0, R.string.UseHqRoundVideos));
            }
            arrayList.add(new ra(3));
            arrayList.add(new ra(8, 0, 0, R.string.Calls));
            arrayList.add(new ra(2));
            arrayList.add(new ra(7, R.id.btn_confirmCalls, 0, R.string.ConfirmCalls));
            arrayList.add(new ra(3));
            arrayList.add(new ra(9, 0, 0, R.string.ConfirmCallsDesc));
            if (fd.a.f11888j) {
                arrayList.add(new ra(8, 0, 0, R.string.Camera));
                arrayList.add(new ra(2));
                if (fd.a.f11889k) {
                    arrayList.add(new ra(89, R.id.btn_cameraType, 0, R.string.CameraType));
                } else {
                    arrayList.add(new ra(7, R.id.btn_cameraType, 0, R.string.CameraUseSystem));
                }
                arrayList.add(new ra(11));
                arrayList.add(new ra(7, R.id.btn_cameraSetting, 0, R.string.CameraKeepMedia).N(2048L));
                boolean z12 = i.c2().r0() != 2;
                if (z12) {
                    arrayList.addAll(mh());
                }
                arrayList.add(new ra(3));
                if (z12) {
                    arrayList.add(Qh());
                }
            }
            arrayList.add(new ra(8, 0, 0, R.string.Other));
            arrayList.add(new ra(2));
            arrayList.add(new ra(7, R.id.btn_systemFonts, 0, R.string.UseSystemFonts));
            arrayList.add(new ra(11));
            arrayList.add(new ra(7, R.id.btn_forceExoPlayerExtensions, 0, R.string.ForceBuiltinDecoding));
            arrayList.add(new ra(11));
            arrayList.add(new ra(7, R.id.btn_audioCompression, 0, R.string.CompressAudio));
            arrayList.add(new ra(3));
            this.f24495b.j6(new kb.k() {
                @Override
                public final void a(int i14) {
                    fz.this.Gh(i14);
                }
            });
        } else if (i11 != 2) {
            throw new IllegalArgumentException("mode == " + this.D0);
        }
        this.E0.s2(arrayList, true);
        customRecyclerView.setAdapter(this.E0);
        this.f24495b.Ue().k(null, ae.j.x0());
    }

    @Override
    public void sc() {
        super.sc();
        t().p0();
    }

    @Override
    public boolean sd(Bundle bundle, String str) {
        super.sd(bundle, str);
        this.D0 = bundle.getInt(str + "mode", 0);
        return true;
    }

    @Override
    public boolean yd(Bundle bundle, String str) {
        super.yd(bundle, str);
        bundle.putInt(str + "mode", this.D0);
        return true;
    }
}
