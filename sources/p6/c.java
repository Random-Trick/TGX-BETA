package p6;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class c {
    public static c c(Bundle bundle, k1 k1Var, u2 u2Var) {
        return d(bundle, k1Var, u2Var, new ArrayList(), d0.f20573a);
    }

    public static c d(Bundle bundle, k1 k1Var, u2 u2Var, List list, c0 c0Var) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        HashMap hashMap = new HashMap();
        int size = stringArrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = stringArrayList.get(i10);
            hashMap.put(str, AssetPackState.i(bundle, str, k1Var, u2Var, c0Var));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            hashMap.put(str2, AssetPackState.h(str2, 4, 0, 0L, 0L, 0.0d, 1, "", ""));
        }
        return new l0(bundle.getLong("total_bytes_to_download"), hashMap);
    }

    public abstract Map<String, AssetPackState> a();

    public abstract long b();
}
