package p202o6;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class AbstractC7669c {
    public static AbstractC7669c m15277c(Bundle bundle, C7714k1 k1Var, C7765u2 u2Var) {
        return m15276d(bundle, k1Var, u2Var, new ArrayList(), C7676d0.f24596a);
    }

    public static AbstractC7669c m15276d(Bundle bundle, C7714k1 k1Var, C7765u2 u2Var, List list, AbstractC7670c0 c0Var) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        HashMap hashMap = new HashMap();
        int size = stringArrayList.size();
        for (int i = 0; i < size; i++) {
            String str = stringArrayList.get(i);
            hashMap.put(str, AssetPackState.m30295i(bundle, str, k1Var, u2Var, c0Var));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            hashMap.put(str2, AssetPackState.m30296h(str2, 4, 0, 0L, 0L, 0.0d, 1, "", ""));
        }
        return new C7718l0(bundle.getLong("total_bytes_to_download"), hashMap);
    }

    public abstract Map<String, AssetPackState> mo15180a();

    public abstract long mo15179b();
}
