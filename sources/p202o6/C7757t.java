package p202o6;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p262s6.C8646a;
import p262s6.C8670m;
import p262s6.C8676p;
import p262s6.C8680r;
import p300v6.AbstractC9854e;
import p300v6.C9856g;
import p300v6.C9865p;

public final class C7757t implements AbstractC7680d4 {
    public static final C8646a f24840g = new C8646a("AssetPackServiceImpl");
    public static final Intent f24841h = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");
    public final String f24842a;
    public final C7714k1 f24843b;
    public final C7765u2 f24844c;
    public C8670m f24845d;
    public C8670m f24846e;
    public final AtomicBoolean f24847f = new AtomicBoolean();

    public C7757t(Context context, C7714k1 k1Var, C7765u2 u2Var) {
        this.f24842a = context.getPackageName();
        this.f24843b = k1Var;
        this.f24844c = u2Var;
        if (C8680r.m11747b(context)) {
            Context a = C8676p.m11764a(context);
            C8646a aVar = f24840g;
            Intent intent = f24841h;
            C7686e4 e4Var = C7686e4.f24621a;
            this.f24845d = new C8670m(a, aVar, "AssetPackService", intent, e4Var, null);
            this.f24846e = new C8670m(C8676p.m11764a(context), aVar, "AssetPackService-keepAlive", intent, e4Var, null);
        }
        f24840g.m11818a("AssetPackService initiated.", new Object[0]);
    }

    public static Bundle m15135g() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 11003);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add(2);
        bundle.putIntegerArrayList("supported_patch_formats", arrayList2);
        return bundle;
    }

    public static Bundle m15134h(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", i);
        return bundle;
    }

    public static AbstractC9854e m15133i() {
        f24840g.m11817b("onError(%d)", -11);
        return C9856g.m6748b(new C7657a(-11));
    }

    public static Bundle m15130l(int i, String str, String str2, int i2) {
        Bundle y = m15117y(i, str);
        y.putString("slice_id", str2);
        y.putInt("chunk_number", i2);
        return y;
    }

    public static Bundle m15127o(Map map) {
        Bundle g = m15135g();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        g.putParcelableArrayList("installed_asset_module", arrayList);
        return g;
    }

    public static ArrayList m15121u(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static List m15120v(C7757t tVar, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AssetPackState next = AbstractC7669c.m15277c((Bundle) it.next(), tVar.f24843b, tVar.f24844c).mo15180a().values().iterator().next();
            if (next == null) {
                f24840g.m11817b("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            if (C7682e0.m15269a(next.mo15192d())) {
                arrayList.add(next.mo15193c());
            }
        }
        return arrayList;
    }

    public static Bundle m15117y(int i, String str) {
        Bundle h = m15134h(i);
        h.putString("module_name", str);
        return h;
    }

    @Override
    public final void mo15141a(int i, String str) {
        m15132j(i, str, 10);
    }

    @Override
    public final AbstractC9854e mo15140b(int i, String str, String str2, int i2) {
        if (this.f24845d == null) {
            return m15133i();
        }
        f24840g.m11815d("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i2), Integer.valueOf(i));
        C9865p pVar = new C9865p();
        this.f24845d.m11778q(new C7707j(this, pVar, i, str, str2, i2, pVar), pVar);
        return pVar.m6735a();
    }

    @Override
    public final void mo15139c(int i, String str, String str2, int i2) {
        if (this.f24845d != null) {
            f24840g.m11815d("notifyChunkTransferred", new Object[0]);
            C9865p pVar = new C9865p();
            this.f24845d.m11778q(new C7692g(this, pVar, i, str, str2, i2, pVar), pVar);
            return;
        }
        throw new C7694g1("The Play Store app is not installed or is an unofficial version.", i);
    }

    @Override
    public final void mo15138d(int i) {
        if (this.f24845d != null) {
            f24840g.m11815d("notifySessionFailed", new Object[0]);
            C9865p pVar = new C9865p();
            this.f24845d.m11778q(new C7702i(this, pVar, i, pVar), pVar);
            return;
        }
        throw new C7694g1("The Play Store app is not installed or is an unofficial version.", i);
    }

    @Override
    public final AbstractC9854e mo15137e(Map map) {
        if (this.f24845d == null) {
            return m15133i();
        }
        f24840g.m11815d("syncPacks", new Object[0]);
        C9865p pVar = new C9865p();
        this.f24845d.m11778q(new C7687f(this, pVar, map, pVar), pVar);
        return pVar.m6735a();
    }

    @Override
    public final void mo15136f(List list) {
        if (this.f24845d != null) {
            f24840g.m11815d("cancelDownloads(%s)", list);
            C9865p pVar = new C9865p();
            this.f24845d.m11778q(new C7681e(this, pVar, list, pVar), pVar);
        }
    }

    public final void m15132j(int i, String str, int i2) {
        if (this.f24845d != null) {
            f24840g.m11815d("notifyModuleCompleted", new Object[0]);
            C9865p pVar = new C9865p();
            this.f24845d.m11778q(new C7697h(this, pVar, i, str, pVar, i2), pVar);
            return;
        }
        throw new C7694g1("The Play Store app is not installed or is an unofficial version.", i);
    }

    @Override
    public final synchronized void mo15131k() {
        if (this.f24846e == null) {
            f24840g.m11814e("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        C8646a aVar = f24840g;
        aVar.m11815d("keepAlive", new Object[0]);
        if (!this.f24847f.compareAndSet(false, true)) {
            aVar.m11815d("Service is already kept alive.", new Object[0]);
            return;
        }
        C9865p pVar = new C9865p();
        this.f24846e.m11778q(new C7712k(this, pVar, pVar), pVar);
    }
}
