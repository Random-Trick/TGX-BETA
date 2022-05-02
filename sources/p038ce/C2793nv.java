package p038ce;

import android.content.Context;
import android.os.Bundle;
import be.C1379j0;
import gd.C4686k6;
import java.util.ArrayList;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import p082fd.C4403w;
import p350yd.C10930q6;
import tc.C9137c;
import td.AbstractC9323v4;

public class C2793nv extends AbstractC3204vo<C2795b> {

    public class C2794a extends C2546iq {
        public C2794a(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo394V2(C2964ra raVar, C9137c cVar, boolean z) {
            cVar.setData(raVar.m32821x());
            cVar.setIgnoreEnabled(true);
            cVar.setEnabled(false);
        }
    }

    public static class C2795b {
        public final int f9431a;
        public final C4686k6 f9432b;

        public C2795b(int i, C4686k6 k6Var) {
            this.f9431a = i;
            this.f9432b = k6Var;
        }
    }

    public C2793nv(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m33513Dg(TdApi.Object object, C2795b bVar, ArrayList arrayList, C2546iq iqVar) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
        } else if (constructor == 1615554212) {
            C4686k6 k6Var = new C4686k6((TdApi.NetworkStatistics) object);
            m9476Ad(new C2795b(bVar.f9431a, k6Var));
            k6Var.m26489d(arrayList, bVar.f9431a);
            iqVar.m34116x2(arrayList, false);
            m31294vg();
        }
        m9204n9();
    }

    public void m33512Eg(final C2795b bVar, final ArrayList arrayList, final C2546iq iqVar, final TdApi.Object object) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                C2793nv.this.m33513Dg(object, bVar, arrayList, iqVar);
            }
        });
    }

    @Override
    public int mo407R9() {
        return R.id.controller_networkStats;
    }

    @Override
    public CharSequence mo9313X9() {
        int i = m9131x9().f9431a;
        if (i == 1) {
            return C4403w.m27869i1(R.string.WiFiUsage);
        }
        if (i != 2) {
            return C4403w.m27869i1(R.string.MobileUsage);
        }
        return C4403w.m27869i1(R.string.RoamingUsage);
    }

    @Override
    public boolean mo9270dc() {
        return m9131x9().f9432b == null;
    }

    @Override
    public void mo30633rg(Context context, CustomRecyclerView customRecyclerView) {
        final C2794a aVar = new C2794a(this);
        final ArrayList<C2964ra> arrayList = new ArrayList<>();
        final C2795b x9 = m9131x9();
        if (x9.f9432b != null) {
            x9.f9432b.m26489d(arrayList, x9.f9431a);
        } else {
            this.f30167b.m2270r4().m14783o(new TdApi.GetNetworkStatistics(), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    C2793nv.this.m33512Eg(x9, arrayList, aVar, object);
                }
            });
        }
        aVar.m34116x2(arrayList, false);
        customRecyclerView.setAdapter(aVar);
    }

    @Override
    public boolean mo9165sd(Bundle bundle, String str) {
        super.mo9165sd(bundle, str);
        m9476Ad(new C2795b(bundle.getInt(str + "type", 0), null));
        return true;
    }

    @Override
    public boolean mo9122yd(Bundle bundle, String str) {
        super.mo9122yd(bundle, str);
        bundle.putInt(str + "type", m9131x9().f9431a);
        return true;
    }
}
