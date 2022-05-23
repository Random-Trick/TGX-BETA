package p6;

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
import t6.a;
import t6.m;
import t6.p;
import t6.r;
import w6.e;
import w6.g;

public final class t implements d4 {
    public static final a f20795g = new a("AssetPackServiceImpl");
    public static final Intent f20796h = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");
    public final String f20797a;
    public final k1 f20798b;
    public final u2 f20799c;
    public m f20800d;
    public m f20801e;
    public final AtomicBoolean f20802f = new AtomicBoolean();

    public t(Context context, k1 k1Var, u2 u2Var) {
        this.f20797a = context.getPackageName();
        this.f20798b = k1Var;
        this.f20799c = u2Var;
        if (r.b(context)) {
            Context a10 = p.a(context);
            a aVar = f20795g;
            Intent intent = f20796h;
            e4 e4Var = e4.f20595a;
            this.f20800d = new m(a10, aVar, "AssetPackService", intent, e4Var, null);
            this.f20801e = new m(p.a(context), aVar, "AssetPackService-keepAlive", intent, e4Var, null);
        }
        f20795g.a("AssetPackService initiated.", new Object[0]);
    }

    public static Bundle g() {
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

    public static Bundle h(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", i10);
        return bundle;
    }

    public static e i() {
        f20795g.b("onError(%d)", -11);
        return g.b(new a(-11));
    }

    public static Bundle l(int i10, String str, String str2, int i11) {
        Bundle y10 = y(i10, str);
        y10.putString("slice_id", str2);
        y10.putInt("chunk_number", i11);
        return y10;
    }

    public static Bundle o(Map map) {
        Bundle g10 = g();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        g10.putParcelableArrayList("installed_asset_module", arrayList);
        return g10;
    }

    public static ArrayList u(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static List v(t tVar, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AssetPackState next = c.c((Bundle) it.next(), tVar.f20798b, tVar.f20799c).a().values().iterator().next();
            if (next == null) {
                f20795g.b("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            if (e0.a(next.d())) {
                arrayList.add(next.c());
            }
        }
        return arrayList;
    }

    public static Bundle y(int i10, String str) {
        Bundle h10 = h(i10);
        h10.putString("module_name", str);
        return h10;
    }

    @Override
    public final void a(int i10, String str) {
        j(i10, str, 10);
    }

    @Override
    public final e b(int i10, String str, String str2, int i11) {
        if (this.f20800d == null) {
            return i();
        }
        f20795g.d("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i11), Integer.valueOf(i10));
        w6.p pVar = new w6.p();
        this.f20800d.q(new j(this, pVar, i10, str, str2, i11, pVar), pVar);
        return pVar.a();
    }

    @Override
    public final void c(int i10, String str, String str2, int i11) {
        if (this.f20800d != null) {
            f20795g.d("notifyChunkTransferred", new Object[0]);
            w6.p pVar = new w6.p();
            this.f20800d.q(new g(this, pVar, i10, str, str2, i11, pVar), pVar);
            return;
        }
        throw new g1("The Play Store app is not installed or is an unofficial version.", i10);
    }

    @Override
    public final void d(int i10) {
        if (this.f20800d != null) {
            f20795g.d("notifySessionFailed", new Object[0]);
            w6.p pVar = new w6.p();
            this.f20800d.q(new i(this, pVar, i10, pVar), pVar);
            return;
        }
        throw new g1("The Play Store app is not installed or is an unofficial version.", i10);
    }

    @Override
    public final e e(Map map) {
        if (this.f20800d == null) {
            return i();
        }
        f20795g.d("syncPacks", new Object[0]);
        w6.p pVar = new w6.p();
        this.f20800d.q(new f(this, pVar, map, pVar), pVar);
        return pVar.a();
    }

    @Override
    public final void f(List list) {
        if (this.f20800d != null) {
            f20795g.d("cancelDownloads(%s)", list);
            w6.p pVar = new w6.p();
            this.f20800d.q(new e(this, pVar, list, pVar), pVar);
        }
    }

    public final void j(int i10, String str, int i11) {
        if (this.f20800d != null) {
            f20795g.d("notifyModuleCompleted", new Object[0]);
            w6.p pVar = new w6.p();
            this.f20800d.q(new h(this, pVar, i10, str, pVar, i11), pVar);
            return;
        }
        throw new g1("The Play Store app is not installed or is an unofficial version.", i10);
    }

    @Override
    public final synchronized void k() {
        if (this.f20801e == null) {
            f20795g.e("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        a aVar = f20795g;
        aVar.d("keepAlive", new Object[0]);
        if (!this.f20802f.compareAndSet(false, true)) {
            aVar.d("Service is already kept alive.", new Object[0]);
            return;
        }
        w6.p pVar = new w6.p();
        this.f20801e.q(new k(this, pVar, pVar), pVar);
    }
}
