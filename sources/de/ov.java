package de;

import android.content.Context;
import android.os.Bundle;
import ce.j0;
import gd.w;
import hd.k6;
import java.util.ArrayList;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import uc.c;
import ud.v4;
import zd.o6;

public class ov extends vo<b> {

    public class a extends iq {
        public a(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void R2(ra raVar, c cVar, boolean z10) {
            cVar.setData(raVar.x());
            cVar.setIgnoreEnabled(true);
            cVar.setEnabled(false);
        }
    }

    public static class b {
        public final int f9017a;
        public final k6 f9018b;

        public b(int i10, k6 k6Var) {
            this.f9017a = i10;
            this.f9018b = k6Var;
        }
    }

    public ov(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void Dg(TdApi.Object object, b bVar, ArrayList arrayList, iq iqVar) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor == 1615554212) {
            k6 k6Var = new k6((TdApi.NetworkStatistics) object);
            Ad(new b(bVar.f9017a, k6Var));
            k6Var.d(arrayList, bVar.f9017a);
            iqVar.s2(arrayList, false);
            vg();
        }
        n9();
    }

    public void Eg(final b bVar, final ArrayList arrayList, final iq iqVar, final TdApi.Object object) {
        wd(new Runnable() {
            @Override
            public final void run() {
                ov.this.Dg(object, bVar, arrayList, iqVar);
            }
        });
    }

    @Override
    public int R9() {
        return R.id.controller_networkStats;
    }

    @Override
    public CharSequence X9() {
        int i10 = x9().f9017a;
        if (i10 == 1) {
            return w.i1(R.string.WiFiUsage);
        }
        if (i10 != 2) {
            return w.i1(R.string.MobileUsage);
        }
        return w.i1(R.string.RoamingUsage);
    }

    @Override
    public boolean dc() {
        return x9().f9018b == null;
    }

    @Override
    public void rg(Context context, CustomRecyclerView customRecyclerView) {
        final a aVar = new a(this);
        final ArrayList<ra> arrayList = new ArrayList<>();
        final b x92 = x9();
        if (x92.f9018b != null) {
            x92.f9018b.d(arrayList, x92.f9017a);
        } else {
            this.f24495b.v4().o(new TdApi.GetNetworkStatistics(), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    ov.this.Eg(x92, arrayList, aVar, object);
                }
            });
        }
        aVar.s2(arrayList, false);
        customRecyclerView.setAdapter(aVar);
    }

    @Override
    public boolean sd(Bundle bundle, String str) {
        super.sd(bundle, str);
        Ad(new b(bundle.getInt(str + "type", 0), null));
        return true;
    }

    @Override
    public boolean yd(Bundle bundle, String str) {
        super.yd(bundle, str);
        bundle.putInt(str + "type", x9().f9017a);
        return true;
    }
}
