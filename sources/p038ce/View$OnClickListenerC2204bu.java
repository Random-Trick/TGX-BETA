package p038ce;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import be.C1379j0;
import gd.C4596b7;
import gd.C4686k6;
import ge.C4868i;
import java.util.List;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import p038ce.C2793nv;
import p082fd.C4403w;
import p108hb.C5062b;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p350yd.AbstractC11083w0;
import p350yd.C10536ab;
import p350yd.C10756j9;
import p350yd.C10930q6;
import tc.C9137c;
import td.AbstractC9323v4;
import td.C9188f2;
import td.C9289s;

public class View$OnClickListenerC2204bu extends AbstractC3204vo<C2206b> implements View.OnClickListener, AbstractC9323v4.AbstractC9343r, AbstractC11083w0, Client.AbstractC7865g, C4868i.AbstractC4881m {
    public int f7694D0;
    public boolean f7695E0;
    public C2546iq f7696F0;
    public View f7697G0;
    public C4596b7 f7698H0;
    public AbstractC2207c f7699I0;
    public C4686k6 f7700J0;

    public class C2205a extends C2546iq {
        public C2205a(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo394V2(C2964ra raVar, C9137c cVar, boolean z) {
            int j = raVar.m32838j();
            int i = R.string.Never;
            boolean z2 = true;
            switch (j) {
                case R.id.btn_dataSaver:
                    boolean z3 = !View$OnClickListenerC2204bu.this.f30170b.m2413i5().m4011U();
                    if (z) {
                        cVar.setEnabledAnimated(z3);
                    } else {
                        cVar.setEnabled(z3);
                    }
                    cVar.getToggler().m10185r(View$OnClickListenerC2204bu.this.f30170b.m2413i5().m4015Q(), z);
                    return;
                case R.id.btn_dataSaverForce:
                    boolean S = View$OnClickListenerC2204bu.this.f30170b.m2413i5().m4013S();
                    boolean T = View$OnClickListenerC2204bu.this.f30170b.m2413i5().m4012T();
                    if (S && T) {
                        i = R.string.WhenUsingMobileDataOrRoaming;
                    } else if (S) {
                        i = R.string.WhenUsingMobileData;
                    } else if (T) {
                        i = R.string.WhenUsingRoaming;
                    }
                    cVar.setData(i);
                    if (!View$OnClickListenerC2204bu.this.f30170b.m2413i5().m4011U() && View$OnClickListenerC2204bu.this.f30170b.m2413i5().m4014R()) {
                        z2 = false;
                    }
                    if (z) {
                        cVar.setEnabledAnimated(z2);
                        return;
                    } else {
                        cVar.setEnabled(z2);
                        return;
                    }
                case R.id.btn_dataUsageMobile:
                    cVar.setData(View$OnClickListenerC2204bu.this.f7700J0 != null ? View$OnClickListenerC2204bu.this.f7700J0.m26484j() : C4403w.m27871i1(R.string.Calculating));
                    return;
                case R.id.btn_dataUsageRoaming:
                    cVar.setData(View$OnClickListenerC2204bu.this.f7700J0 != null ? View$OnClickListenerC2204bu.this.f7700J0.m26483k() : C4403w.m27871i1(R.string.Calculating));
                    return;
                case R.id.btn_dataUsageTotal:
                    cVar.setData(View$OnClickListenerC2204bu.this.f7700J0 != null ? View$OnClickListenerC2204bu.this.f7700J0.m26482l() : C4403w.m27871i1(R.string.Calculating));
                    return;
                case R.id.btn_dataUsageWiFi:
                    cVar.setData(View$OnClickListenerC2204bu.this.f7700J0 != null ? View$OnClickListenerC2204bu.this.f7700J0.m26481m() : C4403w.m27871i1(R.string.Calculating));
                    return;
                default:
                    switch (j) {
                        case R.id.btn_inChannelChats:
                            cVar.setData(View$OnClickListenerC2204bu.this.f30170b.m2413i5().m3962w());
                            return;
                        case R.id.btn_inGroupChats:
                            cVar.setData(View$OnClickListenerC2204bu.this.f30170b.m2413i5().m3958y());
                            return;
                        case R.id.btn_inPrivateChats:
                            cVar.setData(View$OnClickListenerC2204bu.this.f30170b.m2413i5().m4037A());
                            return;
                        default:
                            switch (j) {
                                case R.id.btn_lessDataForCalls:
                                    int O = View$OnClickListenerC2204bu.this.f30170b.m2413i5().m4017O();
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
                                    int H0 = C4868i.m24727c2().m24878H0();
                                    if (H0 != 0) {
                                        cVar.setData(C4868i.m24727c2().m24905D1(H0));
                                        return;
                                    } else {
                                        cVar.setData(C4868i.m24727c2().m24665k0() == 0 ? R.string.ProxySetup : R.string.ProxyDisabled);
                                        return;
                                    }
                                case R.id.btn_resetNetworkStats:
                                    cVar.setData(View$OnClickListenerC2204bu.this.f7700J0 != null ? View$OnClickListenerC2204bu.this.f7700J0.m26485i() : C4403w.m27871i1(R.string.LoadingInformation));
                                    return;
                                case R.id.btn_storageUsage:
                                    cVar.setData(View$OnClickListenerC2204bu.this.f7698H0 != null ? View$OnClickListenerC2204bu.this.f7698H0.m27072u() ? C4403w.m27871i1(R.string.StorageUsageHint) : View$OnClickListenerC2204bu.this.f7698H0.m27073t() : C4403w.m27871i1(R.string.Calculating));
                                    return;
                                default:
                                    switch (j) {
                                        case R.id.btn_mediaMobileLimits:
                                            cVar.setData(View$OnClickListenerC2204bu.this.f30170b.m2413i5().m4031D());
                                            return;
                                        case R.id.btn_mediaRoamingLimits:
                                            cVar.setData(View$OnClickListenerC2204bu.this.f30170b.m2413i5().m4027F());
                                            return;
                                        case R.id.btn_mediaWiFiLimits:
                                            cVar.setData(View$OnClickListenerC2204bu.this.f30170b.m2413i5().m4025G());
                                            return;
                                        default:
                                            return;
                                    }
                            }
                    }
            }
        }
    }

    public static class C2206b {
        public int f7702a;
        public Object f7703b;

        public C2206b(int i) {
            this.f7702a = i;
        }

        public C2206b m35361a(Object obj) {
            this.f7703b = obj;
            return this;
        }
    }

    public interface AbstractC2207c {
        void mo32935P(C4596b7 b7Var);
    }

    public View$OnClickListenerC2204bu(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m35371Wg(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37305t0(object);
        } else if (constructor == -722616727) {
            this.f30170b.m2270r4().m14783o(new TdApi.GetNetworkStatistics(), this);
        }
    }

    public boolean m35370Xg(View view, int i) {
        if (i != R.id.btn_delete) {
            return true;
        }
        this.f30170b.m2270r4().m14783o(new TdApi.ResetNetworkStatistics(), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC2204bu.this.m35371Wg(object);
            }
        });
        return true;
    }

    public void m35369Yg(C4596b7 b7Var) {
        if (!m9347Sa()) {
            m35363eh(b7Var);
        }
    }

    public void m35368Zg(C4686k6 k6Var) {
        if (!m9347Sa()) {
            m35364dh(k6Var);
        }
    }

    public void m35367ah(TdApi.Object object) {
        if (m9347Sa()) {
            return;
        }
        if (this.f7698H0 == null) {
            m35363eh(new C4596b7(null, null));
        } else {
            C1379j0.m37305t0(object);
        }
    }

    @Override
    public int mo408A9() {
        return 3;
    }

    @Override
    public View mo8869G9() {
        return this.f7697G0;
    }

    @Override
    public void mo4623P4(C4868i.C4880l lVar, boolean z) {
    }

    @Override
    public int mo407R9() {
        return R.id.controller_chatSettings;
    }

    public C4596b7 m35372Vg() {
        return this.f7698H0;
    }

    @Override
    public CharSequence mo9313X9() {
        return C4403w.m27871i1(this.f7694D0 == 1 ? R.string.NetworkUsage : R.string.DataSettings);
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        if (this.f7694D0 == 0) {
            C10536ab.m4667o1().m4716b1().m1530y(this);
            C4868i.m24727c2().m24833N3(this);
        }
    }

    public final C2964ra[] m35366bh() {
        return new C2964ra[]{new C2964ra(5, R.id.btn_mediaMobileLimits, 0, R.string.RestrictOverMobile), new C2964ra(11), new C2964ra(5, R.id.btn_mediaWiFiLimits, 0, R.string.RestrictOnWiFi), new C2964ra(11), new C2964ra(5, R.id.btn_mediaRoamingLimits, 0, R.string.RestrictOnRoaming), new C2964ra(3)};
    }

    public void m35365ch(C2206b bVar) {
        super.m9476Ad(bVar);
        int i = bVar.f7702a;
        this.f7694D0 = i;
        if (i == 1) {
            this.f7700J0 = (C4686k6) bVar.f7703b;
        }
    }

    public final void m35364dh(C4686k6 k6Var) {
        this.f7700J0 = k6Var;
        if (this.f7694D0 == 1) {
            this.f7696F0.m34133s3(R.id.btn_dataUsageWiFi);
            this.f7696F0.m34133s3(R.id.btn_dataUsageMobile);
            this.f7696F0.m34133s3(R.id.btn_dataUsageRoaming);
            this.f7696F0.m34133s3(R.id.btn_resetNetworkStats);
            AbstractC9323v4<?> kd = m9221kd();
            if (kd != null) {
                ((View$OnClickListenerC2204bu) kd).m35364dh(k6Var);
                return;
            }
            return;
        }
        this.f7696F0.m34133s3(R.id.btn_dataUsageTotal);
    }

    public void m35363eh(C4596b7 b7Var) {
        if (!m9347Sa()) {
            this.f7698H0 = b7Var;
            this.f7696F0.m34133s3(R.id.btn_storageUsage);
            AbstractC2207c cVar = this.f7699I0;
            if (cVar != null) {
                cVar.mo32935P(b7Var);
                this.f7699I0 = null;
            }
        }
    }

    public void m35362fh(AbstractC2207c cVar) {
        this.f7699I0 = cVar;
    }

    @Override
    public void mo4622g7(boolean z) {
    }

    @Override
    public void mo1528h5(C10930q6 q6Var, int i, boolean z) {
    }

    @Override
    public void mo4621k3(int i, String str, int i2, TdApi.ProxyType proxyType, String str2, boolean z, boolean z2) {
        if (z) {
            this.f7696F0.m34133s3(R.id.btn_proxy);
        }
    }

    @Override
    public void mo1773l6(int i, SparseIntArray sparseIntArray) {
        boolean z = true;
        int i2 = 1;
        boolean z2 = false;
        switch (i) {
            case R.id.btn_dataSaverForce:
                boolean z3 = sparseIntArray.get(R.id.btn_forceMobile) != 0;
                if (sparseIntArray.get(R.id.btn_forceRoaming) == 0) {
                    z = false;
                }
                if (this.f30170b.m2413i5().m3968s0(z3, z)) {
                    this.f7696F0.m34133s3(R.id.btn_dataSaver);
                    this.f7696F0.m34133s3(i);
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
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    int keyAt = sparseIntArray.keyAt(i5);
                    int valueAt = sparseIntArray.valueAt(i5);
                    switch (keyAt) {
                        case R.id.btn_file:
                            i3 |= 8;
                            break;
                        case R.id.btn_gif:
                            i3 |= 32;
                            break;
                        case R.id.btn_music:
                            i3 |= 16;
                            break;
                        case R.id.btn_photos:
                            i3 |= 1;
                            break;
                        case R.id.btn_size:
                            i4 = C10756j9.f34405d0[valueAt];
                            break;
                        case R.id.btn_video:
                            i3 |= 4;
                            break;
                        case R.id.btn_videoNote:
                            i3 |= 64;
                            break;
                        case R.id.btn_voice:
                            i3 |= 2;
                            break;
                    }
                }
                switch (i) {
                    case R.id.btn_inChannelChats:
                        z2 = this.f30170b.m2413i5().m3966t0(i3);
                        break;
                    case R.id.btn_inGroupChats:
                        z2 = this.f30170b.m2413i5().m3965u0(i3);
                        break;
                    case R.id.btn_inPrivateChats:
                        z2 = this.f30170b.m2413i5().m3963v0(i3);
                        break;
                    default:
                        switch (i) {
                            case R.id.btn_mediaMobileLimits:
                                z2 = this.f30170b.m2413i5().m3961w0(i3, i4);
                                break;
                            case R.id.btn_mediaRoamingLimits:
                                z2 = this.f30170b.m2413i5().m3959x0(i3, i4);
                                break;
                            case R.id.btn_mediaWiFiLimits:
                                z2 = this.f30170b.m2413i5().m3957y0(i3, i4);
                                break;
                        }
                }
                if (z2) {
                    this.f7696F0.m34133s3(i);
                    return;
                }
                return;
            case R.id.btn_lessDataForCalls:
                int i6 = sparseIntArray.get(R.id.btn_lessDataForCalls);
                if (i6 == R.id.btn_always) {
                    i2 = 2;
                } else if (i6 != R.id.btn_mobile) {
                    i2 = i6 == R.id.btn_roaming ? 3 : 0;
                }
                if (this.f30170b.m2413i5().m3955z0(i2)) {
                    this.f7696F0.m34133s3(R.id.btn_lessDataForCalls);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void onClick(View view) {
        int i;
        int i2;
        int i3;
        String[] strArr;
        int id2 = view.getId();
        boolean W2 = this.f7696F0.m34204W2(view);
        int i4 = 2;
        switch (id2) {
            case R.id.btn_cacheSettings:
                m9291ac(new View$OnClickListenerC2942qs(this.f30168a, this.f30170b));
                return;
            case R.id.btn_lessDataForCalls:
                C9188f2 a = new C9188f2(id2).m10011a(new C2964ra(28, 0, 0, R.string.UseLessDataForCallsDesc));
                C2964ra[] raVarArr = new C2964ra[4];
                raVarArr[0] = new C2964ra(13, (int) R.id.btn_disabled, 0, (int) R.string.Never, id2, this.f30170b.m2413i5().m4017O() == 0);
                raVarArr[1] = new C2964ra(13, (int) R.id.btn_roaming, 0, (int) R.string.OnRoaming, id2, this.f30170b.m2413i5().m4017O() == 3);
                raVarArr[2] = new C2964ra(13, (int) R.id.btn_mobile, 0, (int) R.string.OnMobileNetwork, id2, this.f30170b.m2413i5().m4017O() == 1);
                raVarArr[3] = new C2964ra(13, (int) R.id.btn_always, 0, (int) R.string.UseLessDataAlways, id2, this.f30170b.m2413i5().m4017O() == 2);
                m9206me(a.m9996p(raVarArr).m10002j(this));
                return;
            case R.id.btn_proxy:
                this.f30170b.m2485dd().m3409x7(this, true);
                return;
            case R.id.btn_resetNetworkStats:
                m9261ee(C4403w.m27871i1(R.string.ResetStatsHint), new int[]{R.id.btn_delete, R.id.btn_cancel}, new String[]{C4403w.m27871i1(R.string.Reset), C4403w.m27871i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view2, int i5) {
                        boolean Xg;
                        Xg = View$OnClickListenerC2204bu.this.m35370Xg(view2, i5);
                        return Xg;
                    }

                    @Override
                    public boolean mo492Q() {
                        return C5115g0.m23936a(this);
                    }

                    @Override
                    public Object mo491b2(int i5) {
                        return C5115g0.m23935b(this, i5);
                    }
                });
                return;
            case R.id.btn_showAdvanced:
                int N0 = this.f7696F0.m34227N0(R.id.btn_showAdvanced);
                if (N0 != -1) {
                    List<C2964ra> F0 = this.f7696F0.m34243F0();
                    F0.remove(N0);
                    F0.remove(N0);
                    C2964ra[] bh = m35366bh();
                    C5062b.m24160m(F0, F0.size() + bh.length);
                    int i5 = N0;
                    for (C2964ra raVar : bh) {
                        i5++;
                        F0.add(i5, raVar);
                    }
                    this.f7696F0.m39310N(N0, 2);
                    this.f7696F0.m39311M(N0, bh.length);
                    return;
                }
                return;
            case R.id.btn_storageUsage:
                AbstractC9323v4<?> qsVar = new View$OnClickListenerC2942qs(this.f30168a, this.f30170b);
                qsVar.m9476Ad(this);
                m9291ac(qsVar);
                return;
            default:
                switch (id2) {
                    case R.id.btn_dataSaver:
                        if (this.f30170b.m2413i5().m3972q0(W2)) {
                            this.f7696F0.m34133s3(R.id.btn_dataSaverForce);
                            return;
                        }
                        return;
                    case R.id.btn_dataSaverForce:
                        m9199ne(id2, new C2964ra[]{new C2964ra(12, (int) R.id.btn_forceMobile, 0, (int) R.string.WhenUsingMobileData, this.f30170b.m2413i5().m4013S()), new C2964ra(12, (int) R.id.btn_forceRoaming, 0, (int) R.string.WhenUsingRoaming, this.f30170b.m2413i5().m4012T())}, this);
                        return;
                    case R.id.btn_dataUsageMobile:
                    case R.id.btn_dataUsageRoaming:
                    case R.id.btn_dataUsageWiFi:
                        if (this.f7700J0 != null) {
                            switch (id2) {
                                case R.id.btn_dataUsageMobile:
                                    i4 = 0;
                                    break;
                                case R.id.btn_dataUsageRoaming:
                                    break;
                                case R.id.btn_dataUsageTotal:
                                default:
                                    return;
                                case R.id.btn_dataUsageWiFi:
                                    i4 = 1;
                                    break;
                            }
                            AbstractC9323v4<?> nvVar = new C2793nv(this.f30168a, this.f30170b);
                            nvVar.m9476Ad(new C2793nv.C2795b(i4, this.f7700J0));
                            m9291ac(nvVar);
                            return;
                        }
                        return;
                    case R.id.btn_dataUsageTotal:
                        if (this.f7700J0 != null) {
                            View$OnClickListenerC2204bu buVar = new View$OnClickListenerC2204bu(this.f30168a, this.f30170b);
                            buVar.m35365ch(new C2206b(1).m35361a(this.f7700J0));
                            m9291ac(buVar);
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
                        int i6 = R.id.btn_size;
                        switch (id2) {
                            case R.id.btn_inChannelChats:
                                i2 = this.f30170b.m2413i5().m3964v();
                                i6 = 0;
                                i = 0;
                                break;
                            case R.id.btn_inGroupChats:
                                i2 = this.f30170b.m2413i5().m3960x();
                                i6 = 0;
                                i = 0;
                                break;
                            case R.id.btn_inPrivateChats:
                                i2 = this.f30170b.m2413i5().m3956z();
                                i6 = 0;
                                i = 0;
                                break;
                            default:
                                switch (id2) {
                                    case R.id.btn_mediaMobileLimits:
                                        i2 = this.f30170b.m2413i5().m4020L();
                                        i = this.f30170b.m2413i5().m4033C();
                                        break;
                                    case R.id.btn_mediaRoamingLimits:
                                        i2 = this.f30170b.m2413i5().m4019M();
                                        i = this.f30170b.m2413i5().m4029E();
                                        break;
                                    case R.id.btn_mediaWiFiLimits:
                                        i2 = this.f30170b.m2413i5().m4018N();
                                        i = this.f30170b.m2413i5().m4024H();
                                        break;
                                    default:
                                        throw new RuntimeException();
                                }
                        }
                        if (i6 != 0) {
                            int length = C10756j9.f34405d0.length;
                            strArr = new String[length];
                            i3 = 0;
                            for (int i7 = 0; i7 < length; i7++) {
                                this.f30170b.m2413i5();
                                int[] iArr = C10756j9.f34405d0;
                                strArr[i7] = C10756j9.m4023I(iArr[i7]);
                                if (iArr[i7] == i) {
                                    i3 = i7;
                                }
                            }
                        } else {
                            strArr = null;
                            i3 = 0;
                        }
                        C9188f2 f2Var = new C9188f2(id2);
                        C2964ra[] raVarArr2 = new C2964ra[7];
                        raVarArr2[0] = new C2964ra(12, (int) R.id.btn_photos, 0, i6 != 0 ? R.string.NoPhotos : R.string.Photos, (i2 & 1) != 0);
                        raVarArr2[1] = new C2964ra(12, (int) R.id.btn_voice, 0, i6 != 0 ? R.string.NoVoiceMessages : R.string.VoiceMessages, (i2 & 2) != 0);
                        raVarArr2[2] = new C2964ra(12, (int) R.id.btn_videoNote, 0, i6 != 0 ? R.string.NoVideoMessages : R.string.VideoMessages, (i2 & 64) != 0);
                        raVarArr2[3] = new C2964ra(12, (int) R.id.btn_video, 0, i6 != 0 ? R.string.NoVideos : R.string.Videos, (i2 & 4) != 0);
                        raVarArr2[4] = new C2964ra(12, (int) R.id.btn_file, 0, i6 != 0 ? R.string.NoFiles : R.string.Files, (i2 & 8) != 0);
                        raVarArr2[5] = new C2964ra(12, (int) R.id.btn_music, 0, i6 != 0 ? R.string.NoMusic : R.string.Music, (i2 & 16) != 0);
                        raVarArr2[6] = new C2964ra(12, (int) R.id.btn_gif, 0, i6 != 0 ? R.string.NoGIFs : R.string.GIFs, (i2 & 32) != 0);
                        m9206me(f2Var.m9996p(raVarArr2).m10002j(this).m9991u(i6).m9990v(i3).m9989w(strArr).m10009c(false));
                        return;
                }
        }
    }

    @Override
    public boolean mo31076pg() {
        return true;
    }

    @Override
    @SuppressLint({"InflateParams"})
    public void mo30635rg(Context context, CustomRecyclerView customRecyclerView) {
        C2964ra[] raVarArr;
        this.f7696F0 = new C2205a(this);
        if (this.f7694D0 == 1) {
            if (this.f30170b.m2930B4().m4661q1()) {
                C9289s sVar = new C9289s(context);
                sVar.setThemedTextColor(this);
                sVar.m9631D1(0, true);
                sVar.setTitle(mo9313X9());
                sVar.setSubtitle(this.f30170b.m2949A1().m1455u());
                this.f7697G0 = sVar;
            }
            raVarArr = new C2964ra[]{new C2964ra(5, R.id.btn_dataUsageMobile, R.drawable.baseline_signal_cellular_alt_24, R.string.MobileUsage), new C2964ra(11), new C2964ra(5, R.id.btn_dataUsageWiFi, R.drawable.baseline_wifi_24, R.string.WiFiUsage), new C2964ra(11), new C2964ra(5, R.id.btn_dataUsageRoaming, R.drawable.baseline_public_24, R.string.RoamingUsage), new C2964ra(3), new C2964ra(2), new C2964ra(5, R.id.btn_resetNetworkStats, 0, R.string.ResetStatistics).m32846d0(R.id.theme_color_textNegative), new C2964ra(3)};
        } else {
            raVarArr = new C2964ra[]{new C2964ra(5, R.id.btn_storageUsage, R.drawable.baseline_data_usage_24, R.string.StorageUsage), new C2964ra(11), new C2964ra(5, R.id.btn_dataUsageTotal, R.drawable.baseline_import_export_24, R.string.NetworkUsage), new C2964ra(3), new C2964ra(2), new C2964ra(7, R.id.btn_dataSaver, 0, R.string.DataSaver), new C2964ra(11), new C2964ra(5, R.id.btn_dataSaverForce, 0, R.string.TurnOnAutomatically), new C2964ra(3), new C2964ra(9, 0, 0, R.string.DataSaverDesc), new C2964ra(8, 0, 0, R.string.Connection), new C2964ra(2), new C2964ra(5, R.id.btn_lessDataForCalls, 0, R.string.VoipUseLessData), new C2964ra(11), new C2964ra(5, R.id.btn_proxy, 0, R.string.Proxy), new C2964ra(3), new C2964ra(8, 0, 0, R.string.AutomaticMediaDownload), new C2964ra(2), new C2964ra(5, R.id.btn_inPrivateChats, 0, R.string.InPrivateChats), new C2964ra(11), new C2964ra(5, R.id.btn_inGroupChats, 0, R.string.InGroups), new C2964ra(11), new C2964ra(5, R.id.btn_inChannelChats, 0, R.string.InChannels), new C2964ra(11), new C2964ra(4, R.id.btn_showAdvanced, 0, R.string.Advanced), new C2964ra(3)};
        }
        this.f7696F0.m34116y2(raVarArr, false);
        if (this.f7695E0) {
            List<C2964ra> F0 = this.f7696F0.m34243F0();
            int N0 = this.f7696F0.m34227N0(R.id.btn_showAdvanced);
            if (N0 != -1) {
                F0.remove(N0);
                F0.remove(N0);
                C2964ra[] bh = m35366bh();
                C5062b.m24160m(F0, F0.size() + bh.length);
                for (C2964ra raVar : bh) {
                    N0++;
                    F0.add(N0, raVar);
                }
            }
        }
        customRecyclerView.setAdapter(this.f7696F0);
        int i = this.f7694D0;
        if (i == 0) {
            this.f30170b.m2270r4().m14783o(new TdApi.GetStorageStatisticsFast(), this);
            this.f30170b.m2270r4().m14783o(new TdApi.GetNetworkStatistics(), this);
            C10536ab.m4667o1().m4716b1().m1552c(this);
            C4868i.m24727c2().m24610r(this);
        } else if (i == 1 && this.f7700J0 == null) {
            this.f30170b.m2270r4().m14783o(new TdApi.GetNetworkStatistics(), this);
        }
    }

    @Override
    public boolean mo9165sd(Bundle bundle, String str) {
        super.mo9165sd(bundle, str);
        boolean z = false;
        int i = bundle.getInt(str + "mode", 0);
        if (i == 0) {
            if (bundle.getBoolean(str + "advanced", false)) {
                z = true;
            }
        }
        this.f7695E0 = z;
        if (i != 0) {
            m35365ch(new C2206b(i));
        }
        return true;
    }

    @Override
    public void mo255t2(final TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            this.f30170b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2204bu.this.m35367ah(object);
                }
            });
        } else if (constructor == -884922271) {
            final C4596b7 b7Var = new C4596b7((TdApi.StorageStatisticsFast) object, null);
            this.f30170b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2204bu.this.m35369Yg(b7Var);
                }
            });
        } else if (constructor == 1615554212) {
            final C4686k6 k6Var = new C4686k6((TdApi.NetworkStatistics) object);
            this.f30170b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2204bu.this.m35368Zg(k6Var);
                }
            });
        }
    }

    @Override
    public void mo1527u(boolean z) {
        if (!m9347Sa()) {
            this.f7696F0.m34133s3(R.id.btn_dataSaver);
            this.f7696F0.m34133s3(R.id.btn_dataSaverForce);
        }
    }

    @Override
    public void mo1526v6(int i, int i2) {
        if (!m9347Sa()) {
            this.f7696F0.m34133s3(R.id.btn_dataSaver);
            this.f7696F0.m34133s3(R.id.btn_dataSaverForce);
        }
    }

    @Override
    public boolean mo9122yd(Bundle bundle, String str) {
        super.mo9122yd(bundle, str);
        bundle.putInt(str + "mode", this.f7694D0);
        if (this.f7694D0 == 0) {
            bundle.putBoolean(str + "advanced", this.f7696F0.m34227N0(R.id.btn_showAdvanced) == -1);
        }
        return true;
    }
}
