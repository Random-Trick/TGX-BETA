package p038ce;

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
import be.C1363c0;
import be.C1379j0;
import be.C1389o;
import be.C1410y;
import ge.C4868i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import me.C6942k3;
import me.C6985o2;
import me.View$OnFocusChangeListenerC7069y1;
import nc.C7389v0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import p038ce.AbstractView$OnClickListenerC3371ys;
import p038ce.View$OnClickListenerC2364ez;
import p038ce.View$OnClickListenerC2971rh;
import p038ce.s30;
import p053dd.C4007j;
import p053dd.C4012k;
import p067ed.C4183a;
import p067ed.C4184b;
import p082fd.C4403w;
import p108hb.C5063c;
import p108hb.C5067f;
import p108hb.C5069h;
import p108hb.C5070i;
import p111he.AbstractC5096a;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p111he.C5120j;
import p111he.C5145u;
import p111he.C5146u0;
import p124ib.C5320c;
import p139jb.AbstractC5917i;
import p139jb.AbstractC5919k;
import p141jd.C5996x0;
import p335xd.C10192g;
import p350yd.C10930q6;
import p350yd.C11052v1;
import p360z8.C11428a;
import p364zd.AbstractC11531p;
import p364zd.C11524j;
import p364zd.C11529n;
import p364zd.C11533r;
import p364zd.C11541z;
import tc.C9137c;
import tc.C9139d;
import td.AbstractC9323v4;
import td.C9188f2;

public class View$OnClickListenerC2364ez extends AbstractC3204vo<C2367c> implements View.OnClickListener, AbstractC9323v4.AbstractC9343r, C6942k3.AbstractC6945c, View.OnLongClickListener, C11052v1.AbstractC11053a, C5120j.AbstractC5121a {
    public C2546iq f8105E0;
    public int f8107G0;
    public boolean f8108H0;
    public float f8109I0;
    public C5996x0 f8110J0;
    public List<C11533r> f8111K0;
    public List<C11533r> f8112L0;
    public List<C11533r> f8113M0;
    public C11533r f8115O0;
    public C2964ra f8116P0;
    public int f8104D0 = 0;
    public int f8106F0 = 0;
    public final Comparator<C11533r> f8114N0 = C2511hy.f8567a;

    public class C2365a extends C2546iq {
        public C2365a(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo394V2(C2964ra raVar, C9137c cVar, boolean z) {
            cVar.setDrawModifier(raVar.m32840f());
            boolean z2 = false;
            switch (raVar.m32835j()) {
                case R.id.btn_audioCompression:
                    cVar.getToggler().m10186r(!C4868i.m24726c2().m24663k1(256L), z);
                    return;
                case R.id.btn_autoNightModeScheduled_location:
                    if (z) {
                        if (View$OnClickListenerC2364ez.this.f8110J0 == null) {
                            z2 = true;
                        }
                        cVar.setEnabledAnimated(z2);
                    } else {
                        if (View$OnClickListenerC2364ez.this.f8110J0 == null) {
                            z2 = true;
                        }
                        cVar.setEnabled(z2);
                    }
                    cVar.setName(View$OnClickListenerC2364ez.this.f8110J0 == null ? R.string.AutoNightModeScheduledByLocation : R.string.AutoNightModeScheduledByLocationProgress);
                    cVar.invalidate();
                    return;
                case R.id.btn_autoNightModeScheduled_timeOff:
                case R.id.btn_autoNightModeScheduled_timeOn:
                    cVar.setData(C7389v0.m16695P2(cVar.getId() == R.id.btn_autoNightModeScheduled_timeOn ? C4868i.m24726c2().m24623p1() : C4868i.m24726c2().m24631o1()));
                    return;
                case R.id.btn_autoplayGIFs:
                    cVar.getToggler().m10186r(C4868i.m24726c2().m24546z2(), z);
                    return;
                case R.id.btn_cameraRatio:
                    int q0 = C4868i.m24726c2().m24616q0();
                    if (q0 == 1) {
                        cVar.setData("4:3");
                        return;
                    } else if (q0 == 2) {
                        cVar.setData("1:1");
                        return;
                    } else if (q0 != 3) {
                        cVar.setData("16:9");
                        return;
                    } else {
                        cVar.setData(R.string.CameraRatioFull);
                        return;
                    }
                case R.id.btn_cameraSetting:
                    C9139d toggler = cVar.getToggler();
                    if (C4868i.m24726c2().m24663k1(raVar.m32832m()) != raVar.m32848b()) {
                        z2 = true;
                    }
                    toggler.m10186r(z2, z);
                    return;
                case R.id.btn_cameraType:
                    if (C4183a.f14093k) {
                        int r0 = C4868i.m24726c2().m24608r0();
                        if (r0 == 0) {
                            cVar.setData(R.string.CameraTypeLegacy);
                            return;
                        } else if (r0 == 1) {
                            cVar.setData(R.string.CameraTypeXBeta);
                            return;
                        } else if (r0 == 2) {
                            cVar.setData(R.string.CameraTypeSystem);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        C9139d toggler2 = cVar.getToggler();
                        if (C4868i.m24726c2().m24608r0() == 2) {
                            z2 = true;
                        }
                        toggler2.m10186r(z2, z);
                        return;
                    }
                case R.id.btn_cameraVolume:
                    int s0 = C4868i.m24726c2().m24600s0();
                    if (s0 == 0) {
                        cVar.setData(R.string.CameraVolumeShoot);
                        return;
                    } else if (s0 == 1) {
                        cVar.setData(R.string.CameraVolumeZoom);
                        return;
                    } else if (s0 == 2) {
                        cVar.setData(R.string.CameraVolumeNone);
                        return;
                    } else {
                        return;
                    }
                case R.id.btn_chatListStyle:
                    int u0 = C4868i.m24726c2().m24584u0();
                    if (u0 == 2) {
                        cVar.setData(R.string.ChatListStyle2);
                        return;
                    } else if (u0 != 3) {
                        cVar.setData(R.string.ChatListStyle1);
                        return;
                    } else {
                        cVar.setData(R.string.ChatListStyle3);
                        return;
                    }
                case R.id.btn_chatSwipes:
                    StringBuilder sb2 = new StringBuilder();
                    if (C4868i.m24726c2().m24910C2()) {
                        sb2.append(C4403w.m27869i1(R.string.QuickActionSettingShare));
                    }
                    if (C4868i.m24726c2().m24917B2()) {
                        if (sb2.length() > 0) {
                            sb2.append(C4403w.m27854m0());
                        }
                        sb2.append(C4403w.m27869i1(R.string.QuickActionSettingReply));
                    }
                    if (sb2.length() == 0) {
                        sb2.append(C4403w.m27869i1(R.string.QuickActionSettingNone));
                    }
                    cVar.setData(sb2.toString());
                    return;
                case R.id.btn_checkUpdates:
                    int M = View$OnClickListenerC2364ez.this.mo4347s().m14510b0().m23914M();
                    if (M == 0) {
                        cVar.m10208Y1(true, z);
                        cVar.setName(R.string.CheckForUpdates);
                        return;
                    } else if (M == 1) {
                        cVar.m10208Y1(false, z);
                        cVar.setName(R.string.CheckingForUpdates);
                        return;
                    } else if (M == 2) {
                        cVar.m10208Y1(true, z);
                        long N = View$OnClickListenerC2364ez.this.mo4347s().m14510b0().m23913N() - View$OnClickListenerC2364ez.this.mo4347s().m14510b0().m23904j();
                        if (N > 0) {
                            cVar.setName(C4403w.m27853m1(R.string.DownloadUpdateSize, C1363c0.m37423m(N)));
                            return;
                        } else {
                            cVar.setName(R.string.DownloadUpdate);
                            return;
                        }
                    } else if (M == 3) {
                        cVar.m10208Y1(false, z);
                        cVar.setName(C4403w.m27826t0(View$OnClickListenerC2364ez.this.mo4347s().m14510b0().m23904j(), View$OnClickListenerC2364ez.this.mo4347s().m14510b0().m23913N(), true));
                        return;
                    } else if (M == 4) {
                        cVar.m10208Y1(true, z);
                        cVar.setName(R.string.InstallUpdate);
                        return;
                    } else {
                        return;
                    }
                case R.id.btn_confirmCalls:
                    cVar.getToggler().m10186r(C4868i.m24726c2().m24847L2(), z);
                    return;
                case R.id.btn_customVibrations:
                    cVar.getToggler().m10186r(C4868i.m24726c2().m24618p6(), z);
                    return;
                case R.id.btn_earpieceMode:
                case R.id.btn_earpieceModeVideo:
                    C4868i c2 = C4868i.m24726c2();
                    if (raVar.m32835j() == R.id.btn_earpieceModeVideo) {
                        z2 = true;
                    }
                    int F0 = c2.m24891F0(z2);
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
                    C4868i.C4874f N0 = C4868i.m24726c2().m24835N0();
                    if (N0.f16665a.equals("apple")) {
                        cVar.setData(R.string.EmojiBuiltIn);
                        return;
                    } else {
                        cVar.setData(N0.f16661M);
                        return;
                    }
                case R.id.btn_forceExoPlayerExtensions:
                    cVar.getToggler().m10186r(C4868i.m24726c2().m24663k1(128L), z);
                    return;
                case R.id.btn_hideChatKeyboard:
                    cVar.getToggler().m10186r(C4868i.m24726c2().m24882G2(), z);
                    return;
                case R.id.btn_hqRounds:
                    cVar.getToggler().m10186r(C4868i.m24726c2().m24861J2(), z);
                    return;
                case R.id.btn_icon:
                    cVar.setData(R.string.IconsBuiltIn);
                    return;
                case R.id.btn_ignoreContentRestrictions:
                    cVar.getToggler().m10186r(!C4868i.m24726c2().m24819P2(), z);
                    return;
                case R.id.btn_instantViewMode:
                    int U0 = C4868i.m24726c2().m24786U0();
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
                    cVar.getToggler().m10186r(C4868i.m24726c2().m24663k1(4L), z);
                    return;
                case R.id.btn_mosaic:
                    cVar.getToggler().m10186r(C4868i.m24726c2().m24895E3(), z);
                    return;
                case R.id.btn_rearRounds:
                    cVar.getToggler().m10186r(C4868i.m24726c2().m24781U5(), z);
                    return;
                case R.id.btn_reduceMotion:
                    cVar.getToggler().m10186r(C4868i.m24726c2().m24826O2(), z);
                    return;
                case R.id.btn_restrictSensitiveContent:
                    cVar.getToggler().m10186r(View$OnClickListenerC2364ez.this.f30167b.m2172x6(), z);
                    return;
                case R.id.btn_saveToGallery:
                    cVar.getToggler().m10186r(C4868i.m24726c2().m24805R2(), z);
                    return;
                case R.id.btn_secret_batmanTransitions:
                    cVar.getToggler().m10186r(C4868i.m24726c2().m24663k1(2L), z);
                    return;
                case R.id.btn_sendByEnter:
                    cVar.getToggler().m10186r(C4868i.m24726c2().m24791T2(), z);
                    return;
                case R.id.btn_separateMedia:
                    cVar.getToggler().m10186r(C4868i.m24726c2().m24784U2(), z);
                    return;
                case R.id.btn_sizeUnit:
                    cVar.setData(C4868i.m24726c2().m24663k1(64L) ? R.string.SizeUnitMetric : R.string.SizeUnitBinary);
                    return;
                case R.id.btn_stickerSuggestions:
                    int K1 = C4868i.m24726c2().m24855K1();
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
                    cVar.getToggler().m10186r(C4403w.m27984G2(), z);
                    return;
                case R.id.btn_systemEmoji:
                    cVar.getToggler().m10186r(C4868i.m24726c2().m24602r6(), z);
                    return;
                case R.id.btn_systemFonts:
                    cVar.getToggler().m10186r(C4868i.m24726c2().m24594s6(), z);
                    return;
                case R.id.btn_theme:
                    cVar.setName(raVar.m32824u());
                    C6985o2 O1 = cVar.m10216O1();
                    if (O1 != null) {
                        O1.m18178c(raVar.m32873D(), z);
                        return;
                    }
                    return;
                case R.id.btn_toggleNewSetting:
                    boolean k1 = C4868i.m24726c2().m24663k1(raVar.m32832m());
                    if (raVar.m32848b()) {
                        k1 = !k1;
                    }
                    cVar.getToggler().m10186r(k1, z);
                    return;
                case R.id.btn_updateAutomatically:
                    int i0 = C4868i.m24726c2().m24680i0();
                    C9139d toggler3 = cVar.getToggler();
                    if (i0 != 1) {
                        z2 = true;
                    }
                    toggler3.m10186r(z2, z);
                    if (i0 == 0) {
                        cVar.setData(R.string.AutoUpdatePrompt);
                        return;
                    } else if (i0 == 1) {
                        cVar.setData(R.string.AutoUpdateNever);
                        return;
                    } else if (i0 == 2) {
                        cVar.setData(R.string.AutoUpdateWiFi);
                        return;
                    } else if (i0 == 3) {
                        cVar.setData(R.string.AutoUpdateAlways);
                        return;
                    } else {
                        return;
                    }
                case R.id.btn_useBigEmoji:
                    cVar.getToggler().m10186r(C4868i.m24726c2().m24626o6(), z);
                    return;
                case R.id.btn_useHoldToPreview:
                    cVar.getToggler().m10186r(C4868i.m24726c2().m24840M2(), z);
                    return;
                case R.id.btn_useInAppBrowser:
                    cVar.getToggler().m10186r(C4868i.m24726c2().m24610q6(), z);
                    return;
                default:
                    return;
            }
        }
    }

    public class C2366b implements C4007j.AbstractC4009b {
        public C2366b() {
        }

        public void m34789i(C11533r rVar) {
            View$OnClickListenerC2364ez.this.m34808ih(rVar, true);
        }

        @Override
        public void mo9527a(RecyclerView.AbstractC0886d0 d0Var) {
            final C11533r rVar = (C11533r) ((C2964ra) d0Var.f3479a.getTag()).m32844d();
            View$OnClickListenerC2364ez.this.f30167b.m2485dd().m3398y8(View$OnClickListenerC2364ez.this, rVar, new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2364ez.C2366b.this.m34789i(rVar);
                }
            });
        }

        @Override
        public boolean mo9526b(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, int i) {
            C2964ra raVar = (C2964ra) d0Var.f3479a.getTag();
            return raVar != null && raVar.m32835j() == R.id.btn_theme && ((C11533r) raVar.m32844d()).m102k();
        }

        @Override
        public float mo9525e() {
            return C4012k.m29329a(this);
        }
    }

    public static class C2367c {
        public final int f8119a;

        public C2367c(int i) {
            this.f8119a = i;
        }
    }

    public View$OnClickListenerC2364ez(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public boolean m34875Ah(View view, int i) {
        int i2;
        switch (i) {
            case R.id.btn_cameraVolumeShoot:
                i2 = 0;
                break;
            case R.id.btn_cameraVolumeZoom:
                i2 = 1;
                break;
            default:
                i2 = 2;
                break;
        }
        C4868i.m24726c2().m24652l4(i2);
        this.f8105E0.m34130s3(R.id.btn_cameraVolume);
        return true;
    }

    public void m34873Bh(int i, SparseIntArray sparseIntArray) {
        int N0;
        int i2 = 0;
        switch (sparseIntArray.get(R.id.btn_cameraType)) {
            case R.id.btn_cameraTypeSystem:
                i2 = 2;
                break;
            case R.id.btn_cameraTypeX:
                i2 = 1;
                break;
        }
        int r0 = C4868i.m24726c2().m24608r0();
        C4868i.m24726c2().m24660k4(i2);
        if (i2 != 2) {
            this.f30165a.m14488h0();
        }
        if (r0 != i2 && ((r0 == 2 || i2 == 2) && (N0 = this.f8105E0.m34224N0(R.id.btn_cameraType)) != -1)) {
            int i3 = N0 + 2;
            if (r0 == 2) {
                List<C2964ra> mh = m34804mh();
                int i4 = i3 + 1;
                this.f8105E0.m34240F0().addAll(i4, mh);
                this.f8105E0.m39308M(i4, mh.size());
                this.f8105E0.m34129t0(i4 + mh.size() + 1, m34843Qh());
            } else {
                this.f8105E0.m34204V1(i3 + 1, 8);
                this.f8105E0.m34147n1(i3 + 2);
            }
        }
        this.f8105E0.m34130s3(R.id.btn_cameraType);
    }

    public void m34871Ch(boolean z) {
        C4868i.m24726c2().m24816P5(false);
        this.f8105E0.m34130s3(R.id.btn_systemFonts);
    }

    public void m34869Dh(boolean z) {
        if (z) {
            C4868i.m24726c2().m24816P5(true);
            this.f8105E0.m34130s3(R.id.btn_systemFonts);
        }
    }

    public void m34867Eh(int i, Location location) {
        if (this.f8110J0 != null) {
            this.f8110J0 = null;
            this.f8105E0.m34130s3(R.id.btn_autoNightModeScheduled_location);
            if (C4868i.m24726c2().m24647m1() == 2) {
                if (i != 0) {
                    C1379j0.m37292y0(R.string.DetectLocationError, 0);
                    return;
                }
                Calendar a = C11428a.m666a(location.getLatitude(), location.getLongitude(), TimeZone.getDefault(), C5067f.m24115e(), 0.0d);
                Calendar b = C11428a.m665b(location.getLatitude(), location.getLongitude(), TimeZone.getDefault(), C5067f.m24115e(), 0.0d);
                int i2 = b.get(11);
                int i3 = b.get(12);
                int i4 = a.get(11);
                int i5 = a.get(12);
                C1379j0.m37292y0(R.string.Done, 0);
                if (C4868i.m24726c2().m24643m5(C5063c.m24140f(C5063c.m24139g(i2, i3, 0), C5063c.m24139g(i4, i5, 0)))) {
                    this.f8105E0.m34130s3(R.id.btn_autoNightModeScheduled_timeOff);
                    this.f8105E0.m34130s3(R.id.btn_autoNightModeScheduled_timeOn);
                }
            }
        }
    }

    public void m34865Fh(int i) {
        if (!m9347Sa()) {
            boolean z = i >= 1 || C4868i.m24726c2().m24663k1(2L);
            int N0 = this.f8105E0.m34224N0(R.id.btn_secret_batmanTransitions);
            if (z == (N0 != -1)) {
                return;
            }
            if (z) {
                int Q0 = this.f8105E0.m34218Q0(R.id.btn_systemFonts);
                if (Q0 != -1) {
                    this.f8105E0.m34240F0().addAll(Q0, Arrays.asList(new C2964ra(7, R.id.btn_secret_batmanTransitions, 0, R.string.BatmanTransitions), new C2964ra(11)));
                    this.f8105E0.m39308M(Q0, 2);
                    return;
                }
                return;
            }
            this.f8105E0.m34204V1(N0, 2);
        }
    }

    public void m34863Gh(final int i) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2364ez.this.m34865Fh(i);
            }
        });
    }

    public void m34861Hh(int i, SparseIntArray sparseIntArray) {
        int u0 = C4868i.m24726c2().m24584u0();
        switch (sparseIntArray.get(R.id.btn_chatListStyle)) {
            case R.id.btn_chatListStyle1:
                u0 = 1;
                break;
            case R.id.btn_chatListStyle2:
                u0 = 2;
                break;
            case R.id.btn_chatListStyle3:
                u0 = 3;
                break;
        }
        C4868i.m24726c2().m24636n4(u0);
        this.f8105E0.m34130s3(R.id.btn_chatListStyle);
    }

    public void m34859Ih(int i, int i2, boolean z, int i3, SparseIntArray sparseIntArray) {
        switch (sparseIntArray.get(i2)) {
            case R.id.btn_earpieceMode_always:
                i = 2;
                break;
            case R.id.btn_earpieceMode_never:
                i = 0;
                break;
            case R.id.btn_earpieceMode_proximity:
                i = 1;
                break;
        }
        C4868i.m24726c2().m24922A4(z, i);
        this.f8105E0.m34130s3(i2);
    }

    public void m34857Jh(int i, SparseIntArray sparseIntArray) {
        int U0 = C4868i.m24726c2().m24786U0();
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
        C4868i.m24726c2().m24824O4(U0);
        this.f8105E0.m34130s3(R.id.btn_instantViewMode);
    }

    public void m34855Kh(int i, SparseIntArray sparseIntArray) {
        int K1 = C4868i.m24726c2().m24855K1();
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
        C4868i.m24726c2().m24865I5(K1);
        this.f8105E0.m34130s3(R.id.btn_stickerSuggestions);
    }

    public void m34853Lh(C11533r rVar) {
        m34808ih(rVar, true);
    }

    public boolean m34851Mh(C2964ra raVar, View view, int i) {
        switch (i) {
            case R.id.btn_delete:
                final C11533r rVar = (C11533r) raVar.m32844d();
                this.f30167b.m2485dd().m3398y8(this, rVar, new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC2364ez.this.m34853Lh(rVar);
                    }
                });
                break;
            case R.id.btn_edit:
                m34799rh((C11533r) raVar.m32844d(), false);
                break;
            case R.id.btn_new:
                m34810hh((C11533r) raVar.m32844d());
                break;
            case R.id.btn_share:
                C11533r rVar2 = (C11533r) raVar.m32844d();
                this.f30167b.m2485dd().m3693V2(this, rVar2, !rVar2.m104i(), false);
                break;
        }
        return true;
    }

    public void m34849Nh(int i, SparseIntArray sparseIntArray) {
        int i0 = C4868i.m24726c2().m24680i0();
        int i2 = sparseIntArray.get(R.id.btn_updateAutomatically);
        boolean z = (i0 == 1 && i2 != R.id.btn_updateAutomaticallyNever) || (i0 != 1 && i2 == R.id.btn_updateAutomaticallyNever);
        switch (i2) {
            case R.id.btn_updateAutomaticallyAlways:
                i0 = 3;
                break;
            case R.id.btn_updateAutomaticallyNever:
                i0 = 1;
                break;
            case R.id.btn_updateAutomaticallyPrompt:
                i0 = 0;
                break;
            case R.id.btn_updateAutomaticallyWiFi:
                i0 = 2;
                break;
        }
        C4868i.m24726c2().m24692g4(i0);
        this.f8105E0.m34130s3(R.id.btn_updateAutomatically);
        int N0 = this.f8105E0.m34224N0(R.id.btn_updateAutomatically);
        if (z && N0 != -1) {
            if (i0 == 1) {
                this.f8105E0.m34204V1(N0 + 1, 4);
            } else {
                this.f8105E0.m34188b1(N0 + 1, (C2964ra[]) m34847Oh().toArray(new C2964ra[0]));
            }
        }
    }

    public static List<C2964ra> m34847Oh() {
        return Arrays.asList(new C2964ra(11), new C2964ra(7, R.id.btn_toggleNewSetting, 0, R.string.InstallBetas).m32863N(512L), new C2964ra(11), new C2964ra(4, R.id.btn_checkUpdates, 0, R.string.CheckForUpdates));
    }

    public static C2964ra m34843Qh() {
        return new C2964ra(9, 0, 0, R.string.CameraFlipInfo);
    }

    public static C2964ra m34841Rh(C11533r rVar) {
        C2964ra raVar;
        int c = rVar.m110c();
        boolean y = C11541z.m1y(c);
        AbstractC11531p i = C11541z.m7t().m20i();
        boolean z = i.mo96a() == rVar.m110c();
        if (y) {
            raVar = new C2964ra(13, (int) R.id.btn_theme, 0, (CharSequence) rVar.m109d(), false);
        } else {
            raVar = new C2964ra(13, R.id.btn_theme, 0, C11541z.m14o(c));
        }
        if (z && y && !rVar.m105h()) {
            rVar.m99n((C11529n) i);
        }
        raVar.m32870G(rVar);
        raVar.m32864M(c);
        raVar.m32858S(z);
        if (y) {
            c = rVar.m100m();
        }
        raVar.m32860Q(C11524j.m230M(c));
        return raVar;
    }

    public static C2964ra m34839Sh(boolean z) {
        if (z) {
            return new C2964ra(89, R.id.btn_autoNightModeScheduled_timeOn, 0, R.string.AutoNightModeScheduledTurnOn);
        }
        return new C2964ra(89, R.id.btn_autoNightModeScheduled_timeOff, 0, R.string.AutoNightModeScheduledTurnOff);
    }

    public static C2964ra m34837Th() {
        return new C2964ra(4, R.id.btn_autoNightModeScheduled_location);
    }

    public static List<C2964ra> m34804mh() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2964ra(11));
        arrayList.add(new C2964ra(7, R.id.btn_cameraSetting, 0, R.string.CameraGrid).m32863N(4096L));
        arrayList.add(new C2964ra(11));
        arrayList.add(new C2964ra(89, R.id.btn_cameraVolume, 0, R.string.CameraVolume));
        arrayList.add(new C2964ra(11));
        arrayList.add(new C2964ra(89, R.id.btn_cameraRatio, 0, R.string.CameraRatio));
        arrayList.add(new C2964ra(11));
        arrayList.add(new C2964ra(7, R.id.btn_cameraSetting, 0, R.string.CameraFlip).m32863N(1024L).m32872E(true));
        return arrayList;
    }

    public void m34802oh(C11533r rVar) {
        if (!m9347Sa()) {
            m34799rh(rVar, true);
        }
    }

    public boolean m34801ph(boolean z, C11533r rVar, View$OnFocusChangeListenerC7069y1 y1Var, String str) {
        String trim = str.trim();
        if (C5070i.m24061i(trim)) {
            return false;
        }
        int m = z ? rVar.m100m() : rVar.m110c();
        int F = C11541z.m7t().m58F(trim, m, z ? rVar.m110c() : 0);
        if (F == 0) {
            return false;
        }
        final C11533r rVar2 = new C11533r(F, trim, rVar.m107f(), m, z ? rVar.m111b() | 2 : 0);
        if (rVar.m102k()) {
            rVar2.m112a((C11529n) rVar.m108e());
        }
        this.f30167b.m2485dd().postDelayed(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2364ez.this.m34802oh(rVar2);
            }
        }, 150L);
        return true;
    }

    public void m34800qh(RecyclerView.AbstractC0896m mVar) {
        m31303kg().setItemAnimator(mVar);
    }

    public static int m34797th(C11533r rVar, C11533r rVar2) {
        return rVar.m101l() != rVar2.m101l() ? rVar.m101l() ? -1 : 1 : Integer.compare(rVar.m110c(), rVar2.m110c());
    }

    public void m34796uh() {
        this.f8105E0.m34130s3(R.id.btn_checkUpdates);
    }

    public void m34795vh(int i, boolean z, int i2, TimePicker timePicker, int i3, int i4) {
        int g = C5063c.m24139g(i3, i4, 0);
        if (i != g) {
            C4868i.m24726c2().m24651l5(g, z);
            this.f8105E0.m34130s3(i2);
        }
    }

    public void m34794wh(int i, SparseIntArray sparseIntArray) {
        C4868i.m24726c2().m24675i5(64L, sparseIntArray.get(R.id.btn_sizeUnit) == R.id.btn_sizeUnitMetric);
        this.f8105E0.m34130s3(R.id.btn_sizeUnit);
    }

    public void m34793xh(int i, SparseIntArray sparseIntArray) {
        C4868i c2 = C4868i.m24726c2();
        boolean z = true;
        boolean z2 = sparseIntArray.get(R.id.btn_messageShare) != R.id.btn_messageShare;
        if (sparseIntArray.get(R.id.btn_messageReply) == R.id.btn_messageReply) {
            z = false;
        }
        c2.m24565w4(z2, z);
        this.f8105E0.m34130s3(R.id.btn_chatSwipes);
    }

    public void m34792yh(int i, boolean z) {
        m34833Vh();
    }

    public boolean m34791zh(View view, int i) {
        int i2;
        switch (i) {
            case R.id.btn_cameraRatio_1_1:
                i2 = 2;
                break;
            case R.id.btn_cameraRatio_4_3:
                i2 = 1;
                break;
            case R.id.btn_cameraRatio_fullScreen:
                i2 = 3;
                break;
            default:
                i2 = 0;
                break;
        }
        C4868i.m24726c2().m24668j4(i2);
        this.f8105E0.m34130s3(R.id.btn_cameraRatio);
        return true;
    }

    @Override
    public void mo23887F0(long j, long j2) {
        this.f8105E0.m34130s3(R.id.btn_checkUpdates);
    }

    @Override
    public void mo23886I6(int i, int i2, boolean z) {
        if (i2 == 1 && i == 0) {
            m9143vd(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2364ez.this.m34796uh();
                }
            }, 250L);
        } else {
            this.f8105E0.m34130s3(R.id.btn_checkUpdates);
        }
    }

    @Override
    public void mo18387M3(C6942k3 k3Var, float f, float f2, int i, boolean z) {
        if (C4868i.m24726c2().m24659k5(f2 * f, z)) {
            int i2 = (int) (f * 100.0f);
            if (this.f8107G0 != i2) {
                this.f8107G0 = i2;
                int Q0 = this.f8105E0.m34218Q0(R.id.btn_autoNightMode_description);
                if (Q0 != -1) {
                    this.f8105E0.m34240F0().get(Q0).m32853X(C4403w.m27865j1(R.string.AutoNightModeDescriptionAuto, Integer.valueOf(this.f8107G0)));
                    this.f8105E0.m34124u3(Q0);
                }
            }
            mo4347s().m14463n0();
        }
    }

    public final C2964ra m34845Ph() {
        return new C2964ra(74).m32864M(Float.floatToIntBits(this.f8109I0)).m32856U(null, Float.floatToIntBits(C4868i.m24726c2().m24679i1()));
    }

    @Override
    public int mo407R9() {
        return R.id.controller_themeSettings;
    }

    public final String m34835Uh(String str, boolean z) {
        int i;
        boolean z2;
        if (z) {
            str = C4403w.m27865j1(R.string.FileNameCopy, str);
            i = 1;
        } else {
            i = 2;
        }
        while (true) {
            String j1 = i == 1 ? str : C4403w.m27865j1(R.string.FileNameDuplicate, str, Integer.valueOf(i));
            Iterator<C11533r> it = this.f8112L0.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().m109d().equals(j1)) {
                        i++;
                        z2 = true;
                        break;
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
            if (!z2) {
                Iterator<C11533r> it2 = this.f8113M0.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (it2.next().m109d().equals(j1)) {
                            i++;
                            z2 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (!z2) {
                    return j1;
                }
            }
        }
    }

    public final void m34833Vh() {
        View$OnClickListenerC2971rh rhVar = new View$OnClickListenerC2971rh(this.f30165a, this.f30167b);
        rhVar.m32664Lp(new View$OnClickListenerC2971rh.C2977c0(1, null, null));
        m9291ac(rhVar);
    }

    public void m34831Wh(C2367c cVar) {
        super.m9476Ad(cVar);
        this.f8104D0 = cVar.f8119a;
    }

    @Override
    public CharSequence mo9313X9() {
        int i = this.f8104D0;
        return C4403w.m27869i1(i == 2 ? R.string.CameraSettings : i == 1 ? R.string.Tweaks : R.string.Themes);
    }

    public void m34829Xh(int i, boolean z) {
        int i2;
        boolean z2;
        int i3;
        int i4 = this.f8106F0;
        if (i4 != i) {
            this.f8106F0 = i;
            int i5 = 3;
            if (i == 0) {
                i2 = R.id.btn_autoNightModeNone;
            } else if (i == 1) {
                i2 = R.id.btn_autoNightModeAuto;
            } else if (i == 2) {
                i2 = R.id.btn_autoNightModeScheduled;
            } else if (i == 3) {
                i2 = R.id.btn_autoNightModeSystem;
            } else {
                throw new IllegalArgumentException("autoNightMode == " + i);
            }
            this.f8105E0.m34125u2(R.id.btn_autoNightMode, i2);
            List<C2964ra> F0 = this.f8105E0.m34240F0();
            int size = F0.size() - 1;
            C2964ra raVar = F0.get(size);
            int i6 = R.string.AutoNightModeDescriptionScheduled;
            if (i == 0) {
                boolean z3 = this.f8108H0;
                boolean z4 = z3 || i4 != 2;
                if (z4) {
                    if (z3) {
                        i6 = R.string.AutoNightModeDescription;
                    }
                    z2 = raVar.m32852Y(i6);
                } else {
                    z2 = z4;
                }
            } else if (i == 1) {
                z2 = raVar.m32851Z(C4403w.m27865j1(R.string.AutoNightModeDescriptionAuto, Integer.valueOf(this.f8107G0)));
            } else if (i == 2) {
                boolean z5 = this.f8108H0 || i4 != 0;
                z2 = z5 ? raVar.m32852Y(R.string.AutoNightModeDescriptionScheduled) : z5;
            } else if (i != 3) {
                z2 = false;
            } else {
                z2 = raVar.m32852Y(Build.VERSION.SDK_INT >= 29 ? R.string.AutoNightModeDescriptionSystemQ : R.string.AutoNightModeDescriptionSystem);
            }
            if (z2) {
                this.f8105E0.m39312I(size);
            }
            if (i == 0 || i == 3) {
                if (i4 == 0 || i4 == 3) {
                    i5 = 0;
                } else if (i4 == 2) {
                    i5 = 7;
                }
                if (i5 > 0) {
                    this.f8105E0.m34204V1(size - i5, i5);
                }
            } else if (i4 == 0 || i4 == 3) {
                int i7 = size + 1;
                F0.add(size, new C2964ra(2));
                if (i != 1) {
                    if (i == 2) {
                        int i8 = i7 + 1;
                        F0.add(i7, m34839Sh(true));
                        int i9 = i8 + 1;
                        F0.add(i8, new C2964ra(11));
                        int i10 = i9 + 1;
                        F0.add(i9, m34839Sh(false));
                        int i11 = i10 + 1;
                        F0.add(i10, new C2964ra(11));
                        i3 = i11 + 1;
                        F0.add(i11, m34837Th());
                    }
                    F0.add(i7, new C2964ra(3));
                    this.f8105E0.m39308M(size, (i7 + 1) - size);
                } else {
                    i3 = i7 + 1;
                    F0.add(i7, m34845Ph());
                }
                i7 = i3;
                F0.add(i7, new C2964ra(3));
                this.f8105E0.m39308M(size, (i7 + 1) - size);
            } else if (i4 == 2) {
                int i12 = size - 5;
                F0.set(i12, m34845Ph());
                this.f8105E0.m39312I(i12);
                this.f8105E0.m34204V1(i12 + 1, 3);
                this.f8105E0.m34147n1(i12 - 1);
            } else if (i4 == 1) {
                int i13 = size - 2;
                F0.set(i13, new C2964ra(11));
                this.f8105E0.m39312I(i13);
                F0.add(i13, m34839Sh(true));
                this.f8105E0.m39311J(i13);
                int i14 = i13 + 2;
                F0.add(i14, m34837Th());
                F0.add(i14, new C2964ra(11));
                F0.add(i14, m34839Sh(false));
                this.f8105E0.m39308M(i14, 3);
            }
            if (i != 0 && i != 2 && z) {
                ((LinearLayoutManager) m31303kg().getLayoutManager()).m39522z2(F0.size() - 1, 0);
            }
        }
    }

    public final void m34827Yh(int i, boolean z) {
        int kh = m34806kh(i);
        if (kh != -1) {
            C2964ra raVar = this.f8105E0.m34240F0().get(kh);
            if (raVar.m32873D() != z) {
                raVar.m32858S(z);
                this.f8105E0.m34124u3(kh);
            }
        }
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        m34812gh();
        C11052v1.m1768b().m1766d(this);
        mo4347s().m14510b0().m23916K(this);
    }

    public final void m34825Zh() {
        int u0 = C4868i.m24726c2().m24584u0();
        C9188f2 f2Var = new C9188f2(R.id.btn_chatListStyle);
        C2964ra[] raVarArr = new C2964ra[3];
        raVarArr[0] = new C2964ra(13, (int) R.id.btn_chatListStyle1, 0, (int) R.string.ChatListStyle1, (int) R.id.btn_chatListStyle, u0 == 1);
        raVarArr[1] = new C2964ra(13, (int) R.id.btn_chatListStyle2, 0, (int) R.string.ChatListStyle2, (int) R.id.btn_chatListStyle, u0 == 2);
        raVarArr[2] = new C2964ra(13, (int) R.id.btn_chatListStyle3, 0, (int) R.string.ChatListStyle3, (int) R.id.btn_chatListStyle, u0 == 3);
        m9206me(f2Var.m9997p(raVarArr).m10003j(new AbstractC9323v4.AbstractC9343r() {
            @Override
            public final void mo1773l6(int i, SparseIntArray sparseIntArray) {
                View$OnClickListenerC2364ez.this.m34861Hh(i, sparseIntArray);
            }
        }).m10010c(false));
    }

    @Override
    public void mo135a7(AbstractC11531p pVar, AbstractC11531p pVar2) {
        m34827Yh(pVar.mo96a(), false);
        m34827Yh(pVar2.mo96a(), true);
        C11533r lh = m34805lh(pVar2);
        if (lh != null && this.f8115O0 != lh) {
            this.f8115O0 = lh;
            C2964ra raVar = this.f8116P0;
            if (raVar != null && raVar.m32851Z(C4403w.m27853m1(R.string.ThemeCreateInfo, lh.m109d()))) {
                C2546iq iqVar = this.f8105E0;
                iqVar.m34124u3(iqVar.m34235H0(this.f8116P0));
            }
        }
    }

    public final void m34823ai(final boolean z) {
        C2964ra[] raVarArr;
        final int F0 = C4868i.m24726c2().m24891F0(z);
        final int i = z ? R.id.btn_earpieceModeVideo : R.id.btn_earpieceMode;
        boolean z2 = true;
        C2964ra raVar = new C2964ra(13, (int) R.id.btn_earpieceMode_never, 0, (int) R.string.EarpieceModeNever, i, F0 == 0);
        C2964ra raVar2 = new C2964ra(13, (int) R.id.btn_earpieceMode_proximity, 0, (int) R.string.EarpieceModeProximity, i, F0 == 1);
        if (z) {
            raVarArr = new C2964ra[]{raVar, raVar2};
        } else {
            C2964ra[] raVarArr2 = new C2964ra[3];
            raVarArr2[0] = raVar;
            raVarArr2[1] = raVar2;
            if (F0 != 2) {
                z2 = false;
            }
            raVarArr2[2] = new C2964ra(13, (int) R.id.btn_earpieceMode_always, 0, (int) R.string.EarpieceModeAlways, i, z2);
            raVarArr = raVarArr2;
        }
        m9206me(new C9188f2(i).m9997p(raVarArr).m10010c(false).m10003j(new AbstractC9323v4.AbstractC9343r() {
            @Override
            public final void mo1773l6(int i2, SparseIntArray sparseIntArray) {
                View$OnClickListenerC2364ez.this.m34859Ih(F0, i, z, i2, sparseIntArray);
            }
        }));
    }

    public final void m34821bi() {
        int U0 = C4868i.m24726c2().m24786U0();
        C9188f2 f2Var = new C9188f2(R.id.btn_instantViewMode);
        C2964ra[] raVarArr = new C2964ra[3];
        raVarArr[0] = new C2964ra(13, (int) R.id.btn_instantViewModeAll, 0, (int) R.string.AutoInstantViewAll, (int) R.id.btn_instantViewMode, U0 == 2);
        raVarArr[1] = new C2964ra(13, (int) R.id.btn_instantViewModeTelegram, 0, (int) R.string.AutoInstantViewTelegram, (int) R.id.btn_instantViewMode, U0 == 1);
        raVarArr[2] = new C2964ra(13, (int) R.id.btn_instantViewModeNone, 0, (int) R.string.AutoInstantViewNone, (int) R.id.btn_instantViewMode, U0 == 0);
        m9206me(f2Var.m9997p(raVarArr).m10010c(false).m10011b(C4403w.m27869i1(R.string.AutoInstantViewDesc)).m10003j(new AbstractC9323v4.AbstractC9343r() {
            @Override
            public final void mo1773l6(int i, SparseIntArray sparseIntArray) {
                View$OnClickListenerC2364ez.this.m34857Jh(i, sparseIntArray);
            }
        }));
    }

    public final void m34819ci() {
        int K1 = C4868i.m24726c2().m24855K1();
        C9188f2 f2Var = new C9188f2(R.id.btn_stickerSuggestions);
        C2964ra[] raVarArr = new C2964ra[3];
        raVarArr[0] = new C2964ra(13, (int) R.id.btn_stickerSuggestionsAll, 0, (int) R.string.SuggestStickersAll, (int) R.id.btn_stickerSuggestions, K1 == 0);
        raVarArr[1] = new C2964ra(13, (int) R.id.btn_stickerSuggestionsInstalled, 0, (int) R.string.SuggestStickersInstalled, (int) R.id.btn_stickerSuggestions, K1 == 1);
        raVarArr[2] = new C2964ra(13, (int) R.id.btn_stickerSuggestionsNone, 0, (int) R.string.SuggestStickersNone, (int) R.id.btn_stickerSuggestions, K1 == 2);
        m9206me(f2Var.m9997p(raVarArr).m10003j(new AbstractC9323v4.AbstractC9343r() {
            @Override
            public final void mo1773l6(int i, SparseIntArray sparseIntArray) {
                View$OnClickListenerC2364ez.this.m34855Kh(i, sparseIntArray);
            }
        }).m10010c(false));
    }

    public final void m34817di(final C2964ra raVar) {
        CharSequence charSequence;
        int l = raVar.m32833l();
        boolean y = C11541z.m1y(l);
        int T = C11541z.m41T(l);
        boolean z = y && C4868i.m24726c2().m24757Y1(T);
        boolean w = C11541z.m7t().m3w(l);
        int i = y ? w ? 3 : 4 : 1;
        C5320c cVar = new C5320c(i);
        C5320c cVar2 = new C5320c(i);
        C5146u0 u0Var = new C5146u0(i);
        C5320c cVar3 = new C5320c(i);
        if (y) {
            int i2 = R.string.Share;
            if (z) {
                charSequence = C4403w.m27853m1(R.string.ThemeEditInfo, raVar.m32824u());
                cVar.m23284a(R.id.btn_edit);
                cVar2.m23284a(R.drawable.baseline_edit_24);
                u0Var.m23816a(R.string.ThemeEdit);
                cVar3.m23284a(1);
                cVar.m23284a(R.id.btn_share);
                cVar2.m23284a(R.drawable.baseline_forward_24);
                if (C4868i.m24726c2().m24549z(T)) {
                    i2 = R.string.ThemeExport;
                }
                u0Var.m23816a(i2);
                cVar3.m23284a(1);
                if (!w) {
                    cVar.m23284a(R.id.btn_new);
                    cVar2.m23284a(R.drawable.baseline_content_copy_24);
                    u0Var.m23816a(R.string.ThemeCopy);
                    cVar3.m23284a(1);
                }
            } else {
                charSequence = C4403w.m27853m1(R.string.ThemeCreateInfo, raVar.m32824u());
                cVar.m23284a(R.id.btn_new);
                cVar2.m23284a(R.drawable.baseline_edit_24);
                u0Var.m23816a(R.string.ThemeCreate);
                cVar3.m23284a(1);
                cVar.m23284a(R.id.btn_share);
                cVar2.m23284a(R.drawable.baseline_forward_24);
                u0Var.m23816a(R.string.Share);
                cVar3.m23284a(1);
            }
            cVar.m23284a(R.id.btn_delete);
            cVar2.m23284a(R.drawable.baseline_delete_forever_24);
            u0Var.m23816a(R.string.ThemeRemove);
            cVar3.m23284a(2);
        } else {
            charSequence = C4403w.m27853m1(R.string.ThemeCreateInfo, raVar.m32824u());
            cVar.m23284a(R.id.btn_new);
            cVar2.m23284a(R.drawable.baseline_create_24);
            u0Var.m23816a(R.string.ThemeCreate);
            cVar3.m23284a(1);
        }
        m9261ee(charSequence, cVar.m23280e(), u0Var.m23813d(), cVar3.m23280e(), cVar2.m23280e(), new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i3) {
                boolean Mh;
                Mh = View$OnClickListenerC2364ez.this.m34851Mh(raVar, view, i3);
                return Mh;
            }

            @Override
            public boolean mo492Q() {
                return C5115g0.m23935a(this);
            }

            @Override
            public Object mo491b2(int i3) {
                return C5115g0.m23934b(this, i3);
            }
        });
    }

    public final void m34798sh(C11533r rVar) {
        if (rVar != null) {
            int N0 = this.f8105E0.m34224N0(R.id.btn_themeCreate);
            if (N0 != -1) {
                int size = N0 - (this.f8113M0.size() * 2);
                if (rVar.m101l()) {
                    this.f8112L0.add(0, rVar);
                    int i = size - 1;
                    if (this.f8112L0.isEmpty()) {
                        this.f8105E0.m34240F0().add(i, new C2964ra(3));
                        this.f8105E0.m34240F0().add(i, m34841Rh(rVar));
                        this.f8105E0.m34240F0().add(i, new C2964ra(2));
                        this.f8105E0.m39308M(i, 3);
                        return;
                    }
                    int size2 = i - (this.f8112L0.size() * 2);
                    this.f8105E0.m34240F0().add(size2, new C2964ra(11));
                    this.f8105E0.m34240F0().add(size2, m34841Rh(rVar));
                    this.f8105E0.m39308M(size2, 2);
                    return;
                }
                this.f8113M0.add(0, rVar);
                this.f8105E0.m34240F0().add(size, new C2964ra(11));
                this.f8105E0.m34240F0().add(size, m34841Rh(rVar));
                this.f8105E0.m39308M(size, 2);
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public final void m34815ei() {
        int i0 = C4868i.m24726c2().m24680i0();
        C9188f2 f2Var = new C9188f2(R.id.btn_updateAutomatically);
        C2964ra[] raVarArr = new C2964ra[4];
        raVarArr[0] = new C2964ra(13, (int) R.id.btn_updateAutomaticallyPrompt, 0, (int) R.string.AutoUpdatePrompt, (int) R.id.btn_updateAutomatically, i0 == 0);
        raVarArr[1] = new C2964ra(13, (int) R.id.btn_updateAutomaticallyAlways, 0, (int) R.string.AutoUpdateAlways, (int) R.id.btn_updateAutomatically, i0 == 3);
        raVarArr[2] = new C2964ra(13, (int) R.id.btn_updateAutomaticallyWiFi, 0, (int) R.string.AutoUpdateWiFi, (int) R.id.btn_updateAutomatically, i0 == 2);
        raVarArr[3] = new C2964ra(13, (int) R.id.btn_updateAutomaticallyNever, 0, (int) R.string.AutoUpdateNever, (int) R.id.btn_updateAutomatically, i0 == 1);
        m9206me(f2Var.m9997p(raVarArr).m10010c(false).m10003j(new AbstractC9323v4.AbstractC9343r() {
            @Override
            public final void mo1773l6(int i, SparseIntArray sparseIntArray) {
                View$OnClickListenerC2364ez.this.m34849Nh(i, sparseIntArray);
            }
        }));
    }

    public final void m34814fh(List<C2964ra> list, List<C11533r> list2, boolean z) {
        if (!list2.isEmpty() || z) {
            list.add(new C2964ra(2, 0));
            boolean z2 = true;
            for (C11533r rVar : list2) {
                boolean j = rVar.m103j();
                if (C11541z.m7t().m3w(rVar.m110c())) {
                    this.f8115O0 = rVar;
                }
                if (z2) {
                    z2 = false;
                } else {
                    list.add(new C2964ra(11));
                }
                if (j) {
                    list.add(m34841Rh(rVar));
                } else {
                    list.add(m34841Rh(rVar));
                }
            }
            if (z) {
                if (!z2) {
                    list.add(new C2964ra(11));
                }
                list.add(new C2964ra(4, R.id.btn_themeCreate, 0, R.string.ThemeCreate));
            }
            list.add(new C2964ra(3));
            if (z) {
                C2964ra raVar = new C2964ra(9, R.id.btn_themeCreateInfo);
                this.f8116P0 = raVar;
                list.add(raVar);
                C11533r rVar2 = this.f8115O0;
                if (rVar2 != null) {
                    this.f8116P0.m32853X(C4403w.m27853m1(R.string.ThemeCreateInfo, rVar2.m109d()));
                }
            }
        }
    }

    public void m34813fi() {
        C2546iq iqVar = this.f8105E0;
        if (iqVar != null) {
            iqVar.m34130s3(R.id.btn_emoji);
        }
    }

    @Override
    public void mo452g2() {
        C2546iq iqVar = this.f8105E0;
        if (iqVar != null) {
            View C = m31303kg().getLayoutManager().mo39262C(iqVar.m34224N0(R.id.btn_emoji));
            if (C != null) {
                C.invalidate();
            }
        }
    }

    public final void m34812gh() {
        C5996x0 x0Var = this.f8110J0;
        if (x0Var != null) {
            x0Var.m21596h();
            this.f8110J0 = null;
        }
    }

    public void m34811gi() {
        C2546iq iqVar = this.f8105E0;
        if (iqVar != null) {
            iqVar.m34130s3(R.id.btn_icon);
        }
    }

    public final void m34810hh(final C11533r rVar) {
        if (rVar != null) {
            final boolean k = rVar.m102k();
            m9364Pc(C4403w.m27869i1(R.string.ThemeCreateTitle), C4403w.m27869i1(R.string.ThemeName), R.string.ThemeCreateConfirm, R.string.Cancel, m34835Uh(rVar.m109d(), k), new AbstractC9323v4.AbstractC9336m() {
                @Override
                public final boolean mo4197a(View$OnFocusChangeListenerC7069y1 y1Var, String str) {
                    boolean ph;
                    ph = View$OnClickListenerC2364ez.this.m34801ph(k, rVar, y1Var, str);
                    return ph;
                }
            }, true);
        }
    }

    public void m34809hi(C11533r rVar) {
        C2546iq iqVar;
        int L0;
        if (!m9347Sa() && (iqVar = this.f8105E0) != null && (L0 = iqVar.m34228L0(rVar)) != -1) {
            this.f8105E0.m34240F0().get(L0).m32853X(rVar.m109d());
            this.f8105E0.m34124u3(L0);
        }
    }

    public void m34808ih(C11533r rVar, boolean z) {
        if (!m9347Sa()) {
            final RecyclerView.AbstractC0896m itemAnimator = z ? null : m31303kg().getItemAnimator();
            if (!z && itemAnimator != null) {
                m31303kg().setItemAnimator(null);
            }
            if (rVar.m101l()) {
                int indexOf = this.f8112L0.indexOf(rVar);
                if (indexOf != -1) {
                    int L0 = this.f8105E0.m34228L0(rVar);
                    this.f8112L0.remove(indexOf);
                    if (this.f8112L0.isEmpty()) {
                        this.f8105E0.m34204V1(L0 - 1, 3);
                    } else if (indexOf == 0) {
                        this.f8105E0.m34204V1(L0, 2);
                    } else {
                        this.f8105E0.m34204V1(L0 - 1, 2);
                    }
                } else {
                    return;
                }
            } else {
                int indexOf2 = this.f8113M0.indexOf(rVar);
                if (indexOf2 != -1) {
                    this.f8113M0.remove(indexOf2);
                    int L02 = this.f8105E0.m34228L0(rVar);
                    if (L02 != -1) {
                        this.f8105E0.m34204V1(L02, 2);
                    }
                } else {
                    return;
                }
            }
            if (!z && itemAnimator != null) {
                this.f30167b.m2485dd().postDelayed(new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC2364ez.this.m34800qh(itemAnimator);
                    }
                }, 100L);
            }
        }
    }

    public final void m34799rh(final C11533r rVar, final boolean z) {
        if (!m9347Sa()) {
            if (!C11541z.m7t().m3w(rVar.m110c())) {
                C11541z.m7t().m21h(this.f30167b, rVar.m108e(), true, new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC2364ez.this.m34799rh(rVar, z);
                    }
                });
                return;
            }
            s30 s30Var = new s30(this.f30165a, this.f30167b);
            s30Var.m9476Ad(new s30.C3032a(rVar, z ? new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2364ez.this.m34798sh(rVar);
                }
            } : null, this));
            m9291ac(s30Var);
        }
    }

    public final int m34806kh(int i) {
        int N0 = this.f8105E0.m34224N0(R.id.btn_theme);
        if (N0 != -1) {
            int D = this.f8105E0.mo6153D();
            while (N0 < D) {
                C2964ra raVar = this.f8105E0.m34240F0().get(N0);
                if (raVar.m32835j() == R.id.btn_theme && raVar.m32833l() == i) {
                    return N0;
                }
                N0++;
            }
        }
        return -1;
    }

    @Override
    public void mo1773l6(int i, SparseIntArray sparseIntArray) {
        int i2;
        if (i == R.id.theme_chat) {
            switch (sparseIntArray.get(R.id.theme_chat, R.id.theme_chat_modern)) {
                case R.id.theme_chat_classic:
                    i2 = 2;
                    break;
                case R.id.theme_chat_modern:
                    i2 = 1;
                    break;
                default:
                    return;
            }
            this.f30167b.m2294pc().m4110l0(i2);
            this.f8105E0.m34130s3(R.id.theme_chat);
        }
    }

    public final C11533r m34805lh(AbstractC11531p pVar) {
        int a = pVar.mo96a();
        if (C11541z.m1y(a)) {
            List<C11533r> list = this.f8112L0;
            if (list != null) {
                for (C11533r rVar : list) {
                    if (a == rVar.m110c()) {
                        return rVar;
                    }
                }
            }
            List<C11533r> list2 = this.f8113M0;
            if (list2 == null) {
                return null;
            }
            for (C11533r rVar2 : list2) {
                if (a == rVar2.m110c()) {
                    return rVar2;
                }
            }
            return null;
        }
        List<C11533r> list3 = this.f8111K0;
        if (list3 == null) {
            return null;
        }
        for (C11533r rVar3 : list3) {
            if (a == rVar3.m110c()) {
                return rVar3;
            }
        }
        return null;
    }

    public final AbstractC11531p m34803nh(C2964ra raVar) {
        return ((C11533r) raVar.m32844d()).m108e();
    }

    @Override
    public void mo443o4() {
        m34813fi();
    }

    @Override
    public void onClick(View view) {
        int i = 3;
        int i2 = 2;
        final boolean z = false;
        switch (view.getId()) {
            case R.id.btn_audioCompression:
                C4868i.m24726c2().m24675i5(256L, !this.f8105E0.m34201W2(view));
                return;
            case R.id.btn_autoNightModeAuto:
            case R.id.btn_autoNightModeNone:
            case R.id.btn_autoNightModeScheduled:
            case R.id.btn_autoNightModeSystem:
                if (this.f8105E0.m34223N1(view)) {
                    int i3 = this.f8105E0.m34252A0().get(R.id.btn_autoNightMode);
                    if (i3 != R.id.btn_autoNightModeSystem) {
                        switch (i3) {
                            case R.id.btn_autoNightModeAuto:
                                i = 1;
                                break;
                            case R.id.btn_autoNightModeNone:
                                i = 0;
                                break;
                            case R.id.btn_autoNightModeScheduled:
                                i = 2;
                                break;
                            default:
                                return;
                        }
                    }
                    m34829Xh(i, true);
                    C4868i.m24726c2().m24700f4(i);
                    return;
                }
                return;
            case R.id.btn_autoNightModeScheduled_location:
                if (this.f8110J0 == null) {
                    this.f8110J0 = C5996x0.m21580y(this.f30165a, 10000L, true, true, new C5996x0.AbstractC6002f() {
                        @Override
                        public final void mo11689a(int i4, Location location) {
                            View$OnClickListenerC2364ez.this.m34867Eh(i4, location);
                        }
                    });
                    this.f8105E0.m34130s3(R.id.btn_autoNightModeScheduled_location);
                    return;
                }
                return;
            case R.id.btn_autoNightModeScheduled_timeOff:
            case R.id.btn_autoNightModeScheduled_timeOn:
                final int id2 = view.getId();
                if (id2 == R.id.btn_autoNightModeScheduled_timeOn) {
                    z = true;
                }
                C4868i c2 = C4868i.m24726c2();
                final int p1 = z ? c2.m24623p1() : c2.m24631o1();
                C10192g.m5779l(new TimePickerDialog(mo4347s(), C11524j.m150v(), new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public final void onTimeSet(TimePicker timePicker, int i4, int i5) {
                        View$OnClickListenerC2364ez.this.m34795vh(p1, z, id2, timePicker, i4, i5);
                    }
                }, C5063c.m24136j(p1), C5063c.m24135k(p1), !C1379j0.m37344X()));
                return;
            case R.id.btn_autoplayGIFs:
                C4868i.m24726c2().m24684h4(this.f8105E0.m34201W2(view));
                return;
            case R.id.btn_cameraRatio:
                m9261ee(C4403w.m27839q(C4403w.m27869i1(R.string.CameraRatio)), new int[]{R.id.btn_cameraRatio_16_9, R.id.btn_cameraRatio_4_3, R.id.btn_cameraRatio_fullScreen}, new String[]{"16:9", "4:3", C4403w.m27869i1(R.string.CameraRatioFull)}, null, new int[]{R.drawable.baseline_crop_16_9_24, R.drawable.baseline_crop_3_2_24, R.drawable.baseline_crop_free_24}, new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view2, int i4) {
                        boolean zh;
                        zh = View$OnClickListenerC2364ez.this.m34791zh(view2, i4);
                        return zh;
                    }

                    @Override
                    public boolean mo492Q() {
                        return C5115g0.m23935a(this);
                    }

                    @Override
                    public Object mo491b2(int i4) {
                        return C5115g0.m23934b(this, i4);
                    }
                });
                return;
            case R.id.btn_cameraSetting:
                C2964ra raVar = (C2964ra) view.getTag();
                C4868i c22 = C4868i.m24726c2();
                long m = raVar.m32832m();
                if (raVar.m32848b() != this.f8105E0.m34201W2(view)) {
                    z = true;
                }
                c22.m24675i5(m, z);
                return;
            case R.id.btn_cameraType:
                if (C4183a.f14093k) {
                    int r0 = C4868i.m24726c2().m24608r0();
                    C2964ra[] raVarArr = new C2964ra[3];
                    raVarArr[0] = new C2964ra(13, (int) R.id.btn_cameraTypeX, 0, (int) R.string.CameraTypeXBeta, (int) R.id.btn_cameraType, r0 == 1);
                    raVarArr[1] = new C2964ra(13, (int) R.id.btn_cameraTypeLegacy, 0, (int) R.string.CameraTypeLegacy, (int) R.id.btn_cameraType, r0 == 0);
                    raVarArr[2] = new C2964ra(13, (int) R.id.btn_cameraTypeSystem, 0, (int) R.string.CameraTypeSystem, (int) R.id.btn_cameraType, r0 == 2);
                    m9199ne(R.id.btn_cameraType, raVarArr, new AbstractC9323v4.AbstractC9343r() {
                        @Override
                        public final void mo1773l6(int i4, SparseIntArray sparseIntArray) {
                            View$OnClickListenerC2364ez.this.m34873Bh(i4, sparseIntArray);
                        }
                    });
                    return;
                }
                C4868i c23 = C4868i.m24726c2();
                if (!this.f8105E0.m34201W2(view)) {
                    i2 = 0;
                }
                c23.m24660k4(i2);
                return;
            case R.id.btn_cameraVolume:
                m9261ee(C4403w.m27839q(C4403w.m27869i1(R.string.CameraVolume)), new int[]{R.id.btn_cameraVolumeShoot, R.id.btn_cameraVolumeZoom, R.id.btn_cameraVolumeNone}, new String[]{C4403w.m27869i1(R.string.CameraVolumeShoot), C4403w.m27869i1(R.string.CameraVolumeZoom), C4403w.m27869i1(R.string.CameraVolumeNone)}, null, new int[]{R.drawable.baseline_camera_enhance_24, R.drawable.baseline_zoom_in_24, R.drawable.baseline_volume_up_24}, new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view2, int i4) {
                        boolean Ah;
                        Ah = View$OnClickListenerC2364ez.this.m34875Ah(view2, i4);
                        return Ah;
                    }

                    @Override
                    public boolean mo492Q() {
                        return C5115g0.m23935a(this);
                    }

                    @Override
                    public Object mo491b2(int i4) {
                        return C5115g0.m23934b(this, i4);
                    }
                });
                return;
            case R.id.btn_chatBackground:
                if (Build.VERSION.SDK_INT < 23 || mo4347s().checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
                    m34833Vh();
                    return;
                } else {
                    mo4347s().m14575J2(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, new AbstractC5096a() {
                        @Override
                        public final void mo4252o1(int i4, boolean z2) {
                            View$OnClickListenerC2364ez.this.m34792yh(i4, z2);
                        }
                    });
                    return;
                }
            case R.id.btn_chatFontSize:
                View$OnClickListenerC2971rh rhVar = new View$OnClickListenerC2971rh(this.f30165a, this.f30167b);
                rhVar.m32664Lp(new View$OnClickListenerC2971rh.C2977c0(2, null, null));
                m9291ac(rhVar);
                return;
            case R.id.btn_chatListStyle:
                m34825Zh();
                return;
            case R.id.btn_chatSwipes:
                m9199ne(R.id.btn_chatSwipes, new C2964ra[]{new C2964ra(12, (int) R.id.btn_messageShare, 0, (int) R.string.Share, (int) R.id.btn_messageShare, C4868i.m24726c2().m24910C2()), new C2964ra(12, (int) R.id.btn_messageReply, 0, (int) R.string.Reply, (int) R.id.btn_messageReply, C4868i.m24726c2().m24917B2())}, new AbstractC9323v4.AbstractC9343r() {
                    @Override
                    public final void mo1773l6(int i4, SparseIntArray sparseIntArray) {
                        View$OnClickListenerC2364ez.this.m34793xh(i4, sparseIntArray);
                    }
                });
                return;
            case R.id.btn_checkUpdates:
                int M = mo4347s().m14510b0().m23914M();
                if (M == 0) {
                    mo4347s().m14510b0().m23901m();
                    return;
                } else if (M == 2) {
                    mo4347s().m14510b0().m23899o();
                    return;
                } else if (M == 4) {
                    mo4347s().m14510b0().m23897q();
                    return;
                } else {
                    return;
                }
            case R.id.btn_confirmCalls:
                C4868i.m24726c2().m24731b5(this.f8105E0.m34201W2(view));
                return;
            case R.id.btn_customVibrations:
                C4868i.m24726c2().m24844L5(this.f8105E0.m34201W2(view));
                return;
            case R.id.btn_earpieceMode:
                m34823ai(false);
                return;
            case R.id.btn_earpieceModeVideo:
                m34823ai(true);
                return;
            case R.id.btn_emoji:
                AbstractC9323v4<?> zsVar = new C3411zs(this.f30165a, this.f30167b);
                zsVar.m9476Ad(new AbstractView$OnClickListenerC3371ys.C3374c(this));
                m9291ac(zsVar);
                return;
            case R.id.btn_forceExoPlayerExtensions:
                C4868i.m24726c2().m24675i5(128L, this.f8105E0.m34201W2(view));
                return;
            case R.id.btn_hideChatKeyboard:
                C4868i.m24726c2().m24754Y4(this.f8105E0.m34201W2(view));
                return;
            case R.id.btn_hqRounds:
                C4868i.m24726c2().m24739a5(this.f8105E0.m34201W2(view));
                return;
            case R.id.btn_icon:
                AbstractC9323v4<?> atVar = new C2155at(this.f30165a, this.f30167b);
                atVar.m9476Ad(new AbstractView$OnClickListenerC3371ys.C3374c(this));
                m9291ac(atVar);
                return;
            case R.id.btn_ignoreContentRestrictions:
                C4868i.m24726c2().m24914B5(!this.f8105E0.m34201W2(view));
                return;
            case R.id.btn_instantViewMode:
                m34821bi();
                return;
            case R.id.btn_markdown:
                C4868i.m24726c2().m24675i5(4L, this.f8105E0.m34201W2(view));
                return;
            case R.id.btn_mosaic:
                C4868i.m24726c2().m24921A5(this.f8105E0.m34201W2(view));
                return;
            case R.id.btn_previewChat:
                View$OnClickListenerC2971rh rhVar2 = new View$OnClickListenerC2971rh(this.f30165a, this.f30167b);
                rhVar2.m32664Lp(new View$OnClickListenerC2971rh.C2977c0(0, null, null));
                m9291ac(rhVar2);
                return;
            case R.id.btn_rearRounds:
                C4868i.m24726c2().m24872H5(this.f8105E0.m34201W2(view));
                return;
            case R.id.btn_reduceMotion:
                C4868i.m24726c2().m24690g6();
                this.f8105E0.m34130s3(R.id.btn_reduceMotion);
                return;
            case R.id.btn_restrictSensitiveContent:
                this.f30167b.m2608Vb(this.f8105E0.m34201W2(view));
                return;
            case R.id.btn_saveToGallery:
                C4868i.m24726c2().m24907C5(this.f8105E0.m34201W2(view));
                return;
            case R.id.btn_secret_batmanTransitions:
                C4868i.m24726c2().m24675i5(2L, this.f8105E0.m34201W2(view));
                return;
            case R.id.btn_sendByEnter:
                C4868i.m24726c2().m24707e5(this.f8105E0.m34201W2(view));
                return;
            case R.id.btn_separateMedia:
                C4868i.m24726c2().m24699f5(this.f8105E0.m34201W2(view));
                return;
            case R.id.btn_sizeUnit:
                boolean k1 = C4868i.m24726c2().m24663k1(64L);
                m9206me(new C9188f2(R.id.btn_sizeUnit).m9997p(new C2964ra[]{new C2964ra(13, (int) R.id.btn_sizeUnitMetric, 0, (int) R.string.SizeUnitMetric, (int) R.id.btn_sizeUnit, k1), new C2964ra(13, (int) R.id.btn_sizeUnitBinary, 0, (int) R.string.SizeUnitBinary, (int) R.id.btn_sizeUnit, !k1)}).m10003j(new AbstractC9323v4.AbstractC9343r() {
                    @Override
                    public final void mo1773l6(int i4, SparseIntArray sparseIntArray) {
                        View$OnClickListenerC2364ez.this.m34794wh(i4, sparseIntArray);
                    }
                }).m10010c(false));
                return;
            case R.id.btn_stickerSuggestions:
                m34819ci();
                return;
            case R.id.btn_subscribeToBeta:
                this.f30167b.m2485dd().m3858E7(this, C4403w.m27821u1(R.string.url_betaSubscription, new Object[0]), null);
                return;
            case R.id.btn_switchRtl:
                C4868i.m24726c2().m24715d5(C4403w.m27860k2(), this.f8105E0.m34201W2(view));
                return;
            case R.id.btn_systemEmoji:
                C4868i.m24726c2().m24823O5(this.f8105E0.m34201W2(view));
                return;
            case R.id.btn_systemFonts:
                Boolean f = C1389o.m37263f();
                if (f != null && f.booleanValue() != C4868i.m24726c2().m24594s6()) {
                    C4868i.m24726c2().m24816P5(f.booleanValue());
                    this.f8105E0.m34130s3(R.id.btn_systemFonts);
                    return;
                } else if (C4868i.m24726c2().m24594s6()) {
                    m9172re(C4403w.m27869i1(R.string.RestartEffect), new AbstractC5917i() {
                        @Override
                        public final void mo1322a(boolean z2) {
                            View$OnClickListenerC2364ez.this.m34871Ch(z2);
                        }
                    });
                    return;
                } else {
                    m9172re(TextUtils.concat(C4403w.m27982H0(this, R.string.UseSystemFontsHint, new Object[0]), "\n\n", C4403w.m27869i1(R.string.RestartEffect)), new AbstractC5917i() {
                        @Override
                        public final void mo1322a(boolean z2) {
                            View$OnClickListenerC2364ez.this.m34869Dh(z2);
                        }
                    });
                    return;
                }
            case R.id.btn_theme:
                C2964ra raVar2 = (C2964ra) view.getTag();
                if (C11541z.m7t().m3w(raVar2.m32833l())) {
                    C11533r rVar = (C11533r) raVar2.m32844d();
                    if (!rVar.m101l() && rVar.m102k()) {
                        m34799rh(rVar, false);
                        return;
                    } else if (rVar.m102k()) {
                        m34817di(raVar2);
                        return;
                    } else {
                        return;
                    }
                } else {
                    C11541z.m7t().m21h(this.f30167b, m34803nh(raVar2), false, null);
                    return;
                }
            case R.id.btn_themeCreate:
                m34810hh(this.f8115O0);
                return;
            case R.id.btn_toggleNewSetting:
                C2964ra raVar3 = (C2964ra) view.getTag();
                boolean W2 = this.f8105E0.m34201W2(view);
                if (raVar3.m32848b()) {
                    W2 = !W2;
                }
                C4868i.m24726c2().m24675i5(raVar3.m32832m(), W2);
                if (W2 && raVar3.m32832m() == 512) {
                    mo4347s().m14510b0().m23901m();
                    return;
                }
                return;
            case R.id.btn_updateAutomatically:
                m34815ei();
                return;
            case R.id.btn_useBigEmoji:
                C4868i.m24726c2().m24851K5(this.f8105E0.m34201W2(view));
                return;
            case R.id.btn_useHoldToPreview:
                C4868i.m24726c2().m24723c5(this.f8105E0.m34201W2(view));
                return;
            case R.id.btn_useInAppBrowser:
                C4868i.m24726c2().m24837M5(this.f8105E0.m34201W2(view));
                return;
            default:
                int c = ((C2964ra) view.getTag()).m32846c();
                if (c != R.id.btn_forcePlainChannels) {
                    if (c == R.id.theme_chat && this.f8105E0.m34223N1(view)) {
                        if (this.f8105E0.m34252A0().get(R.id.theme_chat) != R.id.theme_chat_classic) {
                            i2 = 1;
                        }
                        this.f30167b.m2294pc().m4110l0(i2);
                        return;
                    }
                    return;
                } else if (this.f8105E0.m34223N1(view)) {
                    if (this.f8105E0.m34252A0().get(R.id.btn_forcePlainChannels) != R.id.btn_forcePlainChannels) {
                        z = true;
                    }
                    this.f30167b.m2294pc().m4108m0(z);
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
        m34817di((C2964ra) view.getTag());
        return true;
    }

    @Override
    public boolean mo31074pg() {
        return true;
    }

    @Override
    public void mo133q0(int i) {
        m34829Xh(i, false);
    }

    @Override
    public void mo30633rg(Context context, CustomRecyclerView customRecyclerView) {
        this.f8105E0 = new C2365a(this);
        ArrayList arrayList = new ArrayList();
        int i = this.f30167b.m2294pc().m4117i();
        int i2 = this.f8104D0;
        if (i2 == 0) {
            this.f8105E0.m34238F2(this);
            arrayList.add(new C2964ra(14));
            arrayList.add(new C2964ra(8, 0, 0, R.string.ChatMode));
            arrayList.add(new C2964ra(2));
            arrayList.add(new C2964ra(12, (int) R.id.theme_chat_classic, 0, (int) R.string.ChatStyleBubbles, (int) R.id.theme_chat, i == 2));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(12, (int) R.id.btn_forcePlainChannels, 0, (int) R.string.ChatStyleBubblesChannel, (int) R.id.btn_forcePlainChannels, !this.f30167b.m2294pc().m4099r()));
            if (!this.f30167b.m2949A1().m1504G()) {
                arrayList.add(new C2964ra(11));
                arrayList.add(new C2964ra(89, R.id.btn_emoji, 0, R.string.Emoji).m32868I(new C5145u(C4403w.m27869i1(R.string.EmojiPreview), C1410y.m37041f())));
                C11052v1.m1768b().m1769a(this);
            }
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(89, R.id.btn_chatListStyle, 0, R.string.ChatListStyle));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(4, R.id.btn_chatBackground, 0, R.string.Wallpaper));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(4, R.id.btn_chatFontSize, 0, R.string.TextSize));
            arrayList.add(new C2964ra(3));
            arrayList.add(new C2964ra(8, 0, 0, R.string.ColorTheme));
            List<C11533r> p = C11541z.m7t().m13p();
            this.f8111K0 = p;
            m34814fh(arrayList, p, false);
            List<C11533r> D0 = C4868i.m24726c2().m24905D0();
            Collections.sort(D0, this.f8114N0);
            this.f8112L0 = new ArrayList();
            this.f8113M0 = new ArrayList();
            for (C11533r rVar : D0) {
                if (rVar.m101l()) {
                    this.f8112L0.add(rVar);
                } else {
                    this.f8113M0.add(rVar);
                }
            }
            m34814fh(arrayList, this.f8112L0, false);
            m34814fh(arrayList, this.f8113M0, true);
            this.f8108H0 = false;
            this.f8109I0 = 20.0f;
            float f = 0.0f;
            try {
                SensorManager sensorManager = (SensorManager) C1379j0.m37309q().getSystemService("sensor");
                if (sensorManager != null) {
                    Sensor defaultSensor = sensorManager.getDefaultSensor(5);
                    boolean z = defaultSensor != null;
                    this.f8108H0 = z;
                    if (z) {
                        float min = Math.min(this.f8109I0, defaultSensor.getMaximumRange());
                        this.f8109I0 = min;
                        boolean z2 = min > 0.0f;
                        this.f8108H0 = z2;
                        if (z2) {
                            this.f8109I0 = Math.max(min, 2.25f);
                        }
                    }
                }
            } catch (Throwable th) {
                Log.m14720i("Cannot access light sensor", th, new Object[0]);
            }
            this.f8106F0 = C4868i.m24726c2().m24647m1();
            if (this.f8109I0 != 0.0f) {
                f = C5069h.m24089d(C4868i.m24726c2().m24679i1() / this.f8109I0);
            }
            this.f8107G0 = (int) (f * 100.0f);
            arrayList.add(new C2964ra(8, 0, 0, R.string.AutoNightMode));
            arrayList.add(new C2964ra(2));
            arrayList.add(new C2964ra(13, (int) R.id.btn_autoNightModeNone, 0, (int) R.string.AutoNightDisabled, (int) R.id.btn_autoNightMode, this.f8106F0 == 0));
            if (C4868i.f16613Q == 3 || this.f8106F0 == 3 || mo4347s().m14490g1()) {
                arrayList.add(new C2964ra(11));
                arrayList.add(new C2964ra(13, (int) R.id.btn_autoNightModeSystem, 0, Build.VERSION.SDK_INT >= 29 ? R.string.AutoNightSystemQ : R.string.AutoNightSystem, (int) R.id.btn_autoNightMode, this.f8106F0 == 3));
            }
            if (this.f8108H0) {
                this.f8105E0.m34222N2(this);
                arrayList.add(new C2964ra(11));
                arrayList.add(new C2964ra(13, (int) R.id.btn_autoNightModeAuto, 0, (int) R.string.AutoNightAutomatic, (int) R.id.btn_autoNightMode, this.f8106F0 == 1));
            }
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(13, (int) R.id.btn_autoNightModeScheduled, 0, (int) R.string.AutoNightScheduled, (int) R.id.btn_autoNightMode, this.f8106F0 == 2));
            arrayList.add(new C2964ra(3));
            int i3 = this.f8106F0;
            int i4 = R.string.AutoNightModeDescriptionScheduled;
            if (i3 == 0) {
                if (this.f8108H0) {
                    i4 = R.string.AutoNightModeDescription;
                }
                arrayList.add(new C2964ra(9, R.id.btn_autoNightMode_description, 0, i4));
            } else if (i3 == 1) {
                arrayList.add(new C2964ra(2));
                arrayList.add(m34845Ph());
                arrayList.add(new C2964ra(3));
                arrayList.add(new C2964ra(9, (int) R.id.btn_autoNightMode_description, 0, (CharSequence) C4403w.m27865j1(R.string.AutoNightModeDescriptionAuto, Integer.valueOf(this.f8107G0)), false));
            } else if (i3 == 2) {
                arrayList.add(new C2964ra(2));
                arrayList.add(m34839Sh(true));
                arrayList.add(new C2964ra(11));
                arrayList.add(m34839Sh(false));
                arrayList.add(new C2964ra(11));
                arrayList.add(m34837Th());
                arrayList.add(new C2964ra(3));
                arrayList.add(new C2964ra(9, (int) R.id.btn_autoNightMode_description, 0, (CharSequence) C4403w.m27869i1(R.string.AutoNightModeDescriptionScheduled), false));
            } else if (i3 == 3) {
                arrayList.add(new C2964ra(9, R.id.btn_autoNightMode_description, 0, Build.VERSION.SDK_INT >= 29 ? R.string.AutoNightModeDescriptionSystemQ : R.string.AutoNightModeDescriptionSystem));
            }
            C4007j.m29342a(customRecyclerView, new C2366b());
        } else if (i2 == 1) {
            arrayList.add(new C2964ra(7, R.id.btn_autoplayGIFs, 0, R.string.AutoplayGifs));
            if (C4183a.f14094l) {
                arrayList.add(new C2964ra(11));
                arrayList.add(new C2964ra(7, (int) R.id.btn_useInAppBrowser, 0, (int) R.string.UseInAppBrowser, C4868i.m24726c2().m24610q6()));
            }
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(7, (int) R.id.btn_useHoldToPreview, 0, (int) R.string.HoldToPreview, C4868i.m24726c2().m24840M2()));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(7, R.id.btn_customVibrations, 0, R.string.CustomVibrations));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(7, (int) R.id.btn_reduceMotion, 0, (int) R.string.ReduceMotion, C4868i.m24726c2().m24826O2()));
            if (C4403w.m27984G2() || C4403w.m28006B0() != 0) {
                arrayList.add(new C2964ra(11));
                arrayList.add(new C2964ra(7, R.id.btn_switchRtl, 0, R.string.RtlLayout));
            }
            arrayList.add(new C2964ra(3));
            if (C7389v0.m16636f1()) {
                arrayList.addAll(Arrays.asList(new C2964ra(8, 0, 0, R.string.InAppUpdates), new C2964ra(2), new C2964ra(92, R.id.btn_updateAutomatically, 0, R.string.AutoUpdate)));
                if (C4868i.m24726c2().m24680i0() != 1) {
                    arrayList.addAll(m34847Oh());
                }
            } else {
                arrayList.addAll(Arrays.asList(new C2964ra(8, 0, 0, R.string.AppUpdates), new C2964ra(2), new C2964ra(4, R.id.btn_checkUpdates, 0, R.string.CheckForUpdates), new C2964ra(11), new C2964ra(4, R.id.btn_subscribeToBeta, 0, R.string.SubscribeToBeta)));
            }
            arrayList.add(new C2964ra(3));
            mo4347s().m14510b0().m23905i(this);
            arrayList.add(new C2964ra(8, 0, 0, R.string.Chats));
            arrayList.add(new C2964ra(2));
            arrayList.add(new C2964ra(7, R.id.btn_toggleNewSetting, 0, R.string.AnimatedEmoji).m32863N(16L).m32872E(true));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(7, R.id.btn_useBigEmoji, 0, R.string.BigEmoji));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(7, R.id.btn_toggleNewSetting, 0, R.string.LoopAnimatedStickers).m32863N(8L).m32872E(true));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(89, R.id.btn_stickerSuggestions, 0, R.string.SuggestStickers));
            boolean f1 = C7389v0.m16636f1();
            if (this.f30167b.m2176x2() && (f1 || this.f30167b.m2172x6())) {
                arrayList.add(new C2964ra(11));
                arrayList.add(new C2964ra(7, R.id.btn_restrictSensitiveContent, 0, R.string.DisplaySensitiveContent));
            }
            if (f1 || !C4868i.m24726c2().m24819P2()) {
                arrayList.add(new C2964ra(11));
                arrayList.add(new C2964ra(7, R.id.btn_ignoreContentRestrictions, 0, R.string.IgnoreRestrictions));
            }
            if (C4868i.m24726c2().m24663k1(32L)) {
                arrayList.add(new C2964ra(11));
                arrayList.add(new C2964ra(7, R.id.btn_toggleNewSetting, 0, R.string.UseExplicitDice).m32863N(32L));
            }
            arrayList.add(new C2964ra(3));
            arrayList.add(new C2964ra(2));
            arrayList.add(new C2964ra(89, R.id.btn_chatSwipes, 0, R.string.ChatQuickActions));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(7, R.id.btn_sendByEnter, 0, R.string.SendByEnter));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(7, R.id.btn_hideChatKeyboard, 0, R.string.HideChatKeyboard));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(7, R.id.btn_saveToGallery, 0, R.string.SaveOutgoingPhotos));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(89, R.id.btn_instantViewMode, 0, R.string.AutoInstantView));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(7, R.id.btn_toggleNewSetting, 0, R.string.OpenEmbed).m32863N(8192L).m32872E(true));
            arrayList.add(new C2964ra(3));
            arrayList.add(new C2964ra(9, 0, 0, C4403w.m27982H0(this, R.string.OpenEmbedDesc, new Object[0]), false));
            arrayList.add(new C2964ra(2));
            arrayList.add(new C2964ra(89, R.id.btn_sizeUnit, 0, R.string.SizeUnit));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(7, R.id.btn_mosaic, 0, R.string.RememberAlbumSetting));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(7, R.id.btn_separateMedia, 0, R.string.SeparateMediaTab));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(7, R.id.btn_markdown, 0, R.string.EditMarkdown));
            arrayList.add(new C2964ra(3));
            arrayList.add(new C2964ra(9, 0, 0, C4403w.m27982H0(this, R.string.EditMarkdownHint2, new Object[0]), false));
            arrayList.add(new C2964ra(8, 0, 0, R.string.VoiceMessages));
            arrayList.add(new C2964ra(2));
            arrayList.add(new C2964ra(89, R.id.btn_earpieceMode, 0, R.string.EarpieceMode));
            arrayList.add(new C2964ra(3));
            arrayList.add(new C2964ra(8, 0, 0, R.string.VideoMessages));
            arrayList.add(new C2964ra(2));
            arrayList.add(new C2964ra(89, R.id.btn_earpieceModeVideo, 0, R.string.EarpieceMode));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(7, R.id.btn_rearRounds, 0, R.string.UseRearRoundVideos));
            if (!C4184b.f14121n && C4183a.f14098p) {
                arrayList.add(new C2964ra(11));
                arrayList.add(new C2964ra(7, R.id.btn_hqRounds, 0, R.string.UseHqRoundVideos));
            }
            arrayList.add(new C2964ra(3));
            arrayList.add(new C2964ra(8, 0, 0, R.string.Calls));
            arrayList.add(new C2964ra(2));
            arrayList.add(new C2964ra(7, R.id.btn_confirmCalls, 0, R.string.ConfirmCalls));
            arrayList.add(new C2964ra(3));
            arrayList.add(new C2964ra(9, 0, 0, R.string.ConfirmCallsDesc));
            if (C4183a.f14092j) {
                arrayList.add(new C2964ra(8, 0, 0, R.string.Camera));
                arrayList.add(new C2964ra(2));
                if (C4183a.f14093k) {
                    arrayList.add(new C2964ra(89, R.id.btn_cameraType, 0, R.string.CameraType));
                } else {
                    arrayList.add(new C2964ra(7, R.id.btn_cameraType, 0, R.string.CameraUseSystem));
                }
                arrayList.add(new C2964ra(11));
                arrayList.add(new C2964ra(7, R.id.btn_cameraSetting, 0, R.string.CameraKeepMedia).m32863N(2048L));
                boolean z3 = C4868i.m24726c2().m24608r0() != 2;
                if (z3) {
                    arrayList.addAll(m34804mh());
                }
                arrayList.add(new C2964ra(3));
                if (z3) {
                    arrayList.add(m34843Qh());
                }
            }
            arrayList.add(new C2964ra(8, 0, 0, R.string.Other));
            arrayList.add(new C2964ra(2));
            arrayList.add(new C2964ra(7, R.id.btn_systemFonts, 0, R.string.UseSystemFonts));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(7, R.id.btn_forceExoPlayerExtensions, 0, R.string.ForceBuiltinDecoding));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(7, R.id.btn_audioCompression, 0, R.string.CompressAudio));
            arrayList.add(new C2964ra(3));
            this.f30167b.m2476e6(new AbstractC5919k() {
                @Override
                public final void mo3250a(int i5) {
                    View$OnClickListenerC2364ez.this.m34863Gh(i5);
                }
            });
        } else if (i2 != 2) {
            throw new IllegalArgumentException("mode == " + this.f8104D0);
        }
        this.f8105E0.m34116x2(arrayList, true);
        customRecyclerView.setAdapter(this.f8105E0);
        this.f30167b.m2712Oe().m2013k(null, C11524j.m141z0());
    }

    @Override
    public void mo9166sc() {
        super.mo9166sc();
        mo4347s().m14463n0();
    }

    @Override
    public boolean mo9165sd(Bundle bundle, String str) {
        super.mo9165sd(bundle, str);
        this.f8104D0 = bundle.getInt(str + "mode", 0);
        return true;
    }

    @Override
    public boolean mo9122yd(Bundle bundle, String str) {
        super.mo9122yd(bundle, str);
        bundle.putInt(str + "mode", this.f8104D0);
        return true;
    }
}
