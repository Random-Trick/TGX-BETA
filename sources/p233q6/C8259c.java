package p233q6;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p262s6.C8646a;

public class C8259c {
    public static final Set f26713a = new HashSet(Arrays.asList("app_update", "review"));
    public static final Set f26714b = new HashSet(Arrays.asList("native", "unity"));
    public static final Map f26715c = new HashMap();
    public static final C8646a f26716d = new C8646a("PlayCoreVersion");

    public static Bundle m13020a(String str) {
        Bundle bundle = new Bundle();
        Map b = m13019b(str);
        bundle.putInt("playcore_version_code", ((Integer) b.get("java")).intValue());
        if (b.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((Integer) b.get("native")).intValue());
        }
        if (b.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((Integer) b.get("unity")).intValue());
        }
        return bundle;
    }

    public static synchronized Map m13019b(String str) {
        Map map;
        synchronized (C8259c.class) {
            Map map2 = f26715c;
            if (!map2.containsKey(str)) {
                HashMap hashMap = new HashMap();
                hashMap.put("java", 11003);
                map2.put(str, hashMap);
            }
            map = (Map) map2.get(str);
        }
        return map;
    }
}
