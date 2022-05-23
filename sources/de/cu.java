package de;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import ce.j0;
import de.ov;
import gd.w;
import hd.b7;
import hd.k6;
import he.i;
import ie.g0;
import ie.h0;
import java.util.List;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import ud.f2;
import ud.s;
import ud.v4;
import zd.h9;
import zd.o6;
import zd.u0;
import zd.ya;

public class cu extends vo<b> implements View.OnClickListener, v4.r, u0, Client.g, i.m {
    public int D0;
    public boolean E0;
    public iq F0;
    public View G0;
    public b7 H0;
    public c I0;
    public k6 J0;

    public class a extends iq {
        public a(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void R2(ra raVar, uc.c cVar, boolean z10) {
            int j10 = raVar.j();
            int i10 = R.string.Never;
            boolean z11 = true;
            switch (j10) {
                case R.id.btn_dataSaver:
                    boolean z12 = !cu.this.f24495b.m5().U();
                    if (z10) {
                        cVar.setEnabledAnimated(z12);
                    } else {
                        cVar.setEnabled(z12);
                    }
                    cVar.getToggler().r(cu.this.f24495b.m5().Q(), z10);
                    return;
                case R.id.btn_dataSaverForce:
                    boolean S = cu.this.f24495b.m5().S();
                    boolean T = cu.this.f24495b.m5().T();
                    if (S && T) {
                        i10 = R.string.WhenUsingMobileDataOrRoaming;
                    } else if (S) {
                        i10 = R.string.WhenUsingMobileData;
                    } else if (T) {
                        i10 = R.string.WhenUsingRoaming;
                    }
                    cVar.setData(i10);
                    if (!cu.this.f24495b.m5().U() && cu.this.f24495b.m5().R()) {
                        z11 = false;
                    }
                    if (z10) {
                        cVar.setEnabledAnimated(z11);
                        return;
                    } else {
                        cVar.setEnabled(z11);
                        return;
                    }
                case R.id.btn_dataUsageMobile:
                    cVar.setData(cu.this.J0 != null ? cu.this.J0.j() : w.i1(R.string.Calculating));
                    return;
                case R.id.btn_dataUsageRoaming:
                    cVar.setData(cu.this.J0 != null ? cu.this.J0.k() : w.i1(R.string.Calculating));
                    return;
                case R.id.btn_dataUsageTotal:
                    cVar.setData(cu.this.J0 != null ? cu.this.J0.l() : w.i1(R.string.Calculating));
                    return;
                case R.id.btn_dataUsageWiFi:
                    cVar.setData(cu.this.J0 != null ? cu.this.J0.m() : w.i1(R.string.Calculating));
                    return;
                default:
                    switch (j10) {
                        case R.id.btn_inChannelChats:
                            cVar.setData(cu.this.f24495b.m5().w());
                            return;
                        case R.id.btn_inGroupChats:
                            cVar.setData(cu.this.f24495b.m5().y());
                            return;
                        case R.id.btn_inPrivateChats:
                            cVar.setData(cu.this.f24495b.m5().A());
                            return;
                        default:
                            switch (j10) {
                                case R.id.btn_lessDataForCalls:
                                    int O = cu.this.f24495b.m5().O();
                                    if (O == 1) {
                                        cVar.setData(R.string.OnMobileNetwork);
                                        return;
                                    } else if (O == 2) {
                                        cVar.setData(R.string.UseLessDataAlways);
                                        return;
                                    } else if (O != 3) {
                                        cVar.setData(R.string.Never);
                                        return;
                                    } else {
                                        cVar.setData(R.string.OnRoaming);
                                        return;
                                    }
                                case R.id.btn_proxy:
                                    int H0 = i.c2().H0();
                                    if (H0 != 0) {
                                        cVar.setData(i.c2().D1(H0));
                                        return;
                                    } else {
                                        cVar.setData(i.c2().k0() == 0 ? R.string.ProxySetup : R.string.ProxyDisabled);
                                        return;
                                    }
                                case R.id.btn_resetNetworkStats:
                                    cVar.setData(cu.this.J0 != null ? cu.this.J0.i() : w.i1(R.string.LoadingInformation));
                                    return;
                                case R.id.btn_storageUsage:
                                    cVar.setData(cu.this.H0 != null ? cu.this.H0.u() ? w.i1(R.string.StorageUsageHint) : cu.this.H0.t() : w.i1(R.string.Calculating));
                                    return;
                                default:
                                    switch (j10) {
                                        case R.id.btn_mediaMobileLimits:
                                            cVar.setData(cu.this.f24495b.m5().D());
                                            return;
                                        case R.id.btn_mediaRoamingLimits:
                                            cVar.setData(cu.this.f24495b.m5().F());
                                            return;
                                        case R.id.btn_mediaWiFiLimits:
                                            cVar.setData(cu.this.f24495b.m5().G());
                                            return;
                                        default:
                                            return;
                                    }
                            }
                    }
            }
        }
    }

    public static class b {
        public int f7672a;
        public Object f7673b;

        public b(int i10) {
            this.f7672a = i10;
        }

        public b a(Object obj) {
            this.f7673b = obj;
            return this;
        }
    }

    public interface c {
        void O6(b7 b7Var);
    }

    public cu(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void Wg(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor == -722616727) {
            this.f24495b.v4().o(new TdApi.GetNetworkStatistics(), this);
        }
    }

    public boolean Xg(View view, int i10) {
        if (i10 != R.id.btn_delete) {
            return true;
        }
        this.f24495b.v4().o(new TdApi.ResetNetworkStatistics(), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                cu.this.Wg(object);
            }
        });
        return true;
    }

    public void Yg(b7 b7Var) {
        if (!Sa()) {
            eh(b7Var);
        }
    }

    public void Zg(k6 k6Var) {
        if (!Sa()) {
            dh(k6Var);
        }
    }

    public void ah(TdApi.Object object) {
        if (Sa()) {
            return;
        }
        if (this.H0 == null) {
            eh(new b7(null, null));
        } else {
            j0.t0(object);
        }
    }

    @Override
    public int A9() {
        return 3;
    }

    @Override
    public View G9() {
        return this.G0;
    }

    @Override
    public int R9() {
        return R.id.controller_chatSettings;
    }

    public b7 Vg() {
        return this.H0;
    }

    @Override
    public void X0(i.l lVar, boolean z10) {
    }

    @Override
    public CharSequence X9() {
        return w.i1(this.D0 == 1 ? R.string.NetworkUsage : R.string.DataSettings);
    }

    @Override
    public void Z8() {
        super.Z8();
        if (this.D0 == 0) {
            ya.o1().b1().y(this);
            i.c2().N3(this);
        }
    }

    @Override
    public void a3(int i10, String str, int i11, TdApi.ProxyType proxyType, String str2, boolean z10, boolean z11) {
        if (z10) {
            this.F0.p3(R.id.btn_proxy);
        }
    }

    public final ra[] bh() {
        return new ra[]{new ra(5, R.id.btn_mediaMobileLimits, 0, R.string.RestrictOverMobile), new ra(11), new ra(5, R.id.btn_mediaWiFiLimits, 0, R.string.RestrictOnWiFi), new ra(11), new ra(5, R.id.btn_mediaRoamingLimits, 0, R.string.RestrictOnRoaming), new ra(3)};
    }

    @Override
    public void c3(o6 o6Var, int i10, boolean z10) {
    }

    public void ch(b bVar) {
        super.Ad(bVar);
        int i10 = bVar.f7672a;
        this.D0 = i10;
        if (i10 == 1) {
            this.J0 = (k6) bVar.f7673b;
        }
    }

    public final void dh(k6 k6Var) {
        this.J0 = k6Var;
        if (this.D0 == 1) {
            this.F0.p3(R.id.btn_dataUsageWiFi);
            this.F0.p3(R.id.btn_dataUsageMobile);
            this.F0.p3(R.id.btn_dataUsageRoaming);
            this.F0.p3(R.id.btn_resetNetworkStats);
            v4<?> kd2 = kd();
            if (kd2 != null) {
                ((cu) kd2).dh(k6Var);
                return;
            }
            return;
        }
        this.F0.p3(R.id.btn_dataUsageTotal);
    }

    public void eh(b7 b7Var) {
        if (!Sa()) {
            this.H0 = b7Var;
            this.F0.p3(R.id.btn_storageUsage);
            c cVar = this.I0;
            if (cVar != null) {
                cVar.O6(b7Var);
                this.I0 = null;
            }
        }
    }

    public void fh(c cVar) {
        this.I0 = cVar;
    }

    @Override
    public void g7(boolean z10) {
    }

    @Override
    public void l6(int i10, SparseIntArray sparseIntArray) {
        boolean z10 = true;
        int i11 = 1;
        boolean z11 = false;
        switch (i10) {
            case R.id.btn_dataSaverForce:
                boolean z12 = sparseIntArray.get(R.id.btn_forceMobile) != 0;
                if (sparseIntArray.get(R.id.btn_forceRoaming) == 0) {
                    z10 = false;
                }
                if (this.f24495b.m5().s0(z12, z10)) {
                    this.F0.p3(R.id.btn_dataSaver);
                    this.F0.p3(i10);
                    return;
                }
                return;
            case R.id.btn_inChannelChats:
            case R.id.btn_inGroupChats:
            case R.id.btn_inPrivateChats:
            case R.id.btn_mediaMobileLimits:
            case R.id.btn_mediaRoamingLimits:
            case R.id.btn_mediaWiFiLimits:
                int size = sparseIntArray.size();
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < size; i14++) {
                    int keyAt = sparseIntArray.keyAt(i14);
                    int valueAt = sparseIntArray.valueAt(i14);
                    switch (keyAt) {
                        case R.id.btn_file:
                            i12 |= 8;
                            break;
                        case R.id.btn_gif:
                            i12 |= 32;
                            break;
                        case R.id.btn_music:
                            i12 |= 16;
                            break;
                        case R.id.btn_photos:
                            i12 |= 1;
                            break;
                        case R.id.btn_size:
                            i13 = h9.f27612d0[valueAt];
                            break;
                        case R.id.btn_video:
                            i12 |= 4;
                            break;
                        case R.id.btn_videoNote:
                            i12 |= 64;
                            break;
                        case R.id.btn_voice:
                            i12 |= 2;
                            break;
                    }
                }
                switch (i10) {
                    case R.id.btn_inChannelChats:
                        z11 = this.f24495b.m5().t0(i12);
                        break;
                    case R.id.btn_inGroupChats:
                        z11 = this.f24495b.m5().u0(i12);
                        break;
                    case R.id.btn_inPrivateChats:
                        z11 = this.f24495b.m5().v0(i12);
                        break;
                    default:
                        switch (i10) {
                            case R.id.btn_mediaMobileLimits:
                                z11 = this.f24495b.m5().w0(i12, i13);
                                break;
                            case R.id.btn_mediaRoamingLimits:
                                z11 = this.f24495b.m5().x0(i12, i13);
                                break;
                            case R.id.btn_mediaWiFiLimits:
                                z11 = this.f24495b.m5().y0(i12, i13);
                                break;
                        }
                }
                if (z11) {
                    this.F0.p3(i10);
                    return;
                }
                return;
            case R.id.btn_lessDataForCalls:
                int i15 = sparseIntArray.get(R.id.btn_lessDataForCalls);
                if (i15 == R.id.btn_always) {
                    i11 = 2;
                } else if (i15 != R.id.btn_mobile) {
                    i11 = i15 == R.id.btn_roaming ? 3 : 0;
                }
                if (this.f24495b.m5().z0(i11)) {
                    this.F0.p3(R.id.btn_lessDataForCalls);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void onClick(View view) {
        int i10;
        int i11;
        int i12;
        String[] strArr;
        int id2 = view.getId();
        boolean S2 = this.F0.S2(view);
        int i13 = 2;
        switch (id2) {
            case R.id.btn_cacheSettings:
                ac(new qs(this.f24493a, this.f24495b));
                return;
            case R.id.btn_lessDataForCalls:
                f2 a10 = new f2(id2).a(new ra(28, 0, 0, R.string.UseLessDataForCallsDesc));
                ra[] raVarArr = new ra[4];
                raVarArr[0] = new ra(13, (int) R.id.btn_disabled, 0, (int) R.string.Never, id2, this.f24495b.m5().O() == 0);
                raVarArr[1] = new ra(13, (int) R.id.btn_roaming, 0, (int) R.string.OnRoaming, id2, this.f24495b.m5().O() == 3);
                raVarArr[2] = new ra(13, (int) R.id.btn_mobile, 0, (int) R.string.OnMobileNetwork, id2, this.f24495b.m5().O() == 1);
                raVarArr[3] = new ra(13, (int) R.id.btn_always, 0, (int) R.string.UseLessDataAlways, id2, this.f24495b.m5().O() == 2);
                me(a10.p(raVarArr).j(this));
                return;
            case R.id.btn_proxy:
                this.f24495b.hd().x7(this, true);
                return;
            case R.id.btn_resetNetworkStats:
                ee(w.i1(R.string.ResetStatsHint), new int[]{R.id.btn_delete, R.id.btn_cancel}, new String[]{w.i1(R.string.Reset), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new h0() {
                    @Override
                    public boolean P() {
                        return g0.a(this);
                    }

                    @Override
                    public Object a2(int i14) {
                        return g0.b(this, i14);
                    }

                    @Override
                    public final boolean r3(View view2, int i14) {
                        boolean Xg;
                        Xg = cu.this.Xg(view2, i14);
                        return Xg;
                    }
                });
                return;
            case R.id.btn_showAdvanced:
                int L0 = this.F0.L0(R.id.btn_showAdvanced);
                if (L0 != -1) {
                    List<ra> D0 = this.F0.D0();
                    D0.remove(L0);
                    D0.remove(L0);
                    ra[] bh = bh();
                    ib.b.m(D0, D0.size() + bh.length);
                    int i14 = L0;
                    for (ra raVar : bh) {
                        i14++;
                        D0.add(i14, raVar);
                    }
                    this.F0.N(L0, 2);
                    this.F0.M(L0, bh.length);
                    return;
                }
                return;
            case R.id.btn_storageUsage:
                v4<?> qsVar = new qs(this.f24493a, this.f24495b);
                qsVar.Ad(this);
                ac(qsVar);
                return;
            default:
                switch (id2) {
                    case R.id.btn_dataSaver:
                        if (this.f24495b.m5().q0(S2)) {
                            this.F0.p3(R.id.btn_dataSaverForce);
                            return;
                        }
                        return;
                    case R.id.btn_dataSaverForce:
                        ne(id2, new ra[]{new ra(12, (int) R.id.btn_forceMobile, 0, (int) R.string.WhenUsingMobileData, this.f24495b.m5().S()), new ra(12, (int) R.id.btn_forceRoaming, 0, (int) R.string.WhenUsingRoaming, this.f24495b.m5().T())}, this);
                        return;
                    case R.id.btn_dataUsageMobile:
                    case R.id.btn_dataUsageRoaming:
                    case R.id.btn_dataUsageWiFi:
                        if (this.J0 != null) {
                            switch (id2) {
                                case R.id.btn_dataUsageMobile:
                                    i13 = 0;
                                    break;
                                case R.id.btn_dataUsageRoaming:
                                    break;
                                case R.id.btn_dataUsageTotal:
                                default:
                                    return;
                                case R.id.btn_dataUsageWiFi:
                                    i13 = 1;
                                    break;
                            }
                            v4<?> ovVar = new ov(this.f24493a, this.f24495b);
                            ovVar.Ad(new ov.b(i13, this.J0));
                            ac(ovVar);
                            return;
                        }
                        return;
                    case R.id.btn_dataUsageTotal:
                        if (this.J0 != null) {
                            cu cuVar = new cu(this.f24493a, this.f24495b);
                            cuVar.ch(new b(1).a(this.J0));
                            ac(cuVar);
                            return;
                        }
                        return;
                    default:
                        switch (id2) {
                            case R.id.btn_inChannelChats:
                            case R.id.btn_inGroupChats:
                            case R.id.btn_inPrivateChats:
                                break;
                            default:
                                switch (id2) {
                                    case R.id.btn_mediaMobileLimits:
                                    case R.id.btn_mediaRoamingLimits:
                                    case R.id.btn_mediaWiFiLimits:
                                        break;
                                    default:
                                        return;
                                }
                        }
                        int i15 = R.id.btn_size;
                        switch (id2) {
                            case R.id.btn_inChannelChats:
                                i11 = this.f24495b.m5().u();
                                i15 = 0;
                                i10 = 0;
                                break;
                            case R.id.btn_inGroupChats:
                                i11 = this.f24495b.m5().x();
                                i15 = 0;
                                i10 = 0;
                                break;
                            case R.id.btn_inPrivateChats:
                                i11 = this.f24495b.m5().z();
                                i15 = 0;
                                i10 = 0;
                                break;
                            default:
                                switch (id2) {
                                    case R.id.btn_mediaMobileLimits:
                                        i11 = this.f24495b.m5().L();
                                        i10 = this.f24495b.m5().C();
                                        break;
                                    case R.id.btn_mediaRoamingLimits:
                                        i11 = this.f24495b.m5().M();
                                        i10 = this.f24495b.m5().E();
                                        break;
                                    case R.id.btn_mediaWiFiLimits:
                                        i11 = this.f24495b.m5().N();
                                        i10 = this.f24495b.m5().H();
                                        break;
                                    default:
                                        throw new RuntimeException();
                                }
                        }
                        if (i15 != 0) {
                            int length = h9.f27612d0.length;
                            strArr = new String[length];
                            i12 = 0;
                            for (int i16 = 0; i16 < length; i16++) {
                                this.f24495b.m5();
                                int[] iArr = h9.f27612d0;
                                strArr[i16] = h9.I(iArr[i16]);
                                if (iArr[i16] == i10) {
                                    i12 = i16;
                                }
                            }
                        } else {
                            strArr = null;
                            i12 = 0;
                        }
                        f2 f2Var = new f2(id2);
                        ra[] raVarArr2 = new ra[7];
                        raVarArr2[0] = new ra(12, (int) R.id.btn_photos, 0, i15 != 0 ? R.string.NoPhotos : R.string.Photos, (i11 & 1) != 0);
                        raVarArr2[1] = new ra(12, (int) R.id.btn_voice, 0, i15 != 0 ? R.string.NoVoiceMessages : R.string.VoiceMessages, (i11 & 2) != 0);
                        raVarArr2[2] = new ra(12, (int) R.id.btn_videoNote, 0, i15 != 0 ? R.string.NoVideoMessages : R.string.VideoMessages, (i11 & 64) != 0);
                        raVarArr2[3] = new ra(12, (int) R.id.btn_video, 0, i15 != 0 ? R.string.NoVideos : R.string.Videos, (i11 & 4) != 0);
                        raVarArr2[4] = new ra(12, (int) R.id.btn_file, 0, i15 != 0 ? R.string.NoFiles : R.string.Files, (i11 & 8) != 0);
                        raVarArr2[5] = new ra(12, (int) R.id.btn_music, 0, i15 != 0 ? R.string.NoMusic : R.string.Music, (i11 & 16) != 0);
                        raVarArr2[6] = new ra(12, (int) R.id.btn_gif, 0, i15 != 0 ? R.string.NoGIFs : R.string.GIFs, (i11 & 32) != 0);
                        me(f2Var.p(raVarArr2).j(this).u(i15).v(i12).w(strArr).c(false));
                        return;
                }
        }
    }

    @Override
    public boolean pg() {
        return true;
    }

    @Override
    public void r2(final TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    cu.this.ah(object);
                }
            });
        } else if (constructor == -884922271) {
            final b7 b7Var = new b7((TdApi.StorageStatisticsFast) object, null);
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    cu.this.Yg(b7Var);
                }
            });
        } else if (constructor == 1615554212) {
            final k6 k6Var = new k6((TdApi.NetworkStatistics) object);
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    cu.this.Zg(k6Var);
                }
            });
        }
    }

    @Override
    @SuppressLint({"InflateParams"})
    public void rg(Context context, CustomRecyclerView customRecyclerView) {
        ra[] raVarArr;
        this.F0 = new a(this);
        if (this.D0 == 1) {
            if (this.f24495b.F4().q1()) {
                s sVar = new s(context);
                sVar.setThemedTextColor(this);
                sVar.A1(0, true);
                sVar.setTitle(X9());
                sVar.setSubtitle(this.f24495b.A1().u());
                this.G0 = sVar;
            }
            raVarArr = new ra[]{new ra(5, R.id.btn_dataUsageMobile, R.drawable.baseline_signal_cellular_alt_24, R.string.MobileUsage), new ra(11), new ra(5, R.id.btn_dataUsageWiFi, R.drawable.baseline_wifi_24, R.string.WiFiUsage), new ra(11), new ra(5, R.id.btn_dataUsageRoaming, R.drawable.baseline_public_24, R.string.RoamingUsage), new ra(3), new ra(2), new ra(5, R.id.btn_resetNetworkStats, 0, R.string.ResetStatistics).d0(R.id.theme_color_textNegative), new ra(3)};
        } else {
            raVarArr = new ra[]{new ra(5, R.id.btn_storageUsage, R.drawable.baseline_data_usage_24, R.string.StorageUsage), new ra(11), new ra(5, R.id.btn_dataUsageTotal, R.drawable.baseline_import_export_24, R.string.NetworkUsage), new ra(3), new ra(2), new ra(7, R.id.btn_dataSaver, 0, R.string.DataSaver), new ra(11), new ra(5, R.id.btn_dataSaverForce, 0, R.string.TurnOnAutomatically), new ra(3), new ra(9, 0, 0, R.string.DataSaverDesc), new ra(8, 0, 0, R.string.Connection), new ra(2), new ra(5, R.id.btn_lessDataForCalls, 0, R.string.VoipUseLessData), new ra(11), new ra(5, R.id.btn_proxy, 0, R.string.Proxy), new ra(3), new ra(8, 0, 0, R.string.AutomaticMediaDownload), new ra(2), new ra(5, R.id.btn_inPrivateChats, 0, R.string.InPrivateChats), new ra(11), new ra(5, R.id.btn_inGroupChats, 0, R.string.InGroups), new ra(11), new ra(5, R.id.btn_inChannelChats, 0, R.string.InChannels), new ra(11), new ra(4, R.id.btn_showAdvanced, 0, R.string.Advanced), new ra(3)};
        }
        this.F0.t2(raVarArr, false);
        if (this.E0) {
            List<ra> D0 = this.F0.D0();
            int L0 = this.F0.L0(R.id.btn_showAdvanced);
            if (L0 != -1) {
                D0.remove(L0);
                D0.remove(L0);
                ra[] bh = bh();
                ib.b.m(D0, D0.size() + bh.length);
                for (ra raVar : bh) {
                    L0++;
                    D0.add(L0, raVar);
                }
            }
        }
        customRecyclerView.setAdapter(this.F0);
        int i10 = this.D0;
        if (i10 == 0) {
            this.f24495b.v4().o(new TdApi.GetStorageStatisticsFast(), this);
            this.f24495b.v4().o(new TdApi.GetNetworkStatistics(), this);
            ya.o1().b1().c(this);
            i.c2().r(this);
        } else if (i10 == 1 && this.J0 == null) {
            this.f24495b.v4().o(new TdApi.GetNetworkStatistics(), this);
        }
    }

    @Override
    public boolean sd(Bundle bundle, String str) {
        super.sd(bundle, str);
        boolean z10 = false;
        int i10 = bundle.getInt(str + "mode", 0);
        if (i10 == 0) {
            if (bundle.getBoolean(str + "advanced", false)) {
                z10 = true;
            }
        }
        this.E0 = z10;
        if (i10 != 0) {
            ch(new b(i10));
        }
        return true;
    }

    @Override
    public void v(boolean z10) {
        if (!Sa()) {
            this.F0.p3(R.id.btn_dataSaver);
            this.F0.p3(R.id.btn_dataSaverForce);
        }
    }

    @Override
    public void v6(int i10, int i11) {
        if (!Sa()) {
            this.F0.p3(R.id.btn_dataSaver);
            this.F0.p3(R.id.btn_dataSaverForce);
        }
    }

    @Override
    public boolean yd(Bundle bundle, String str) {
        super.yd(bundle, str);
        bundle.putInt(str + "mode", this.D0);
        if (this.D0 == 0) {
            bundle.putBoolean(str + "advanced", this.F0.L0(R.id.btn_showAdvanced) == -1);
        }
        return true;
    }
}
