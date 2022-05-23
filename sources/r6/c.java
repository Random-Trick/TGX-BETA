package r6;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import t6.a;

public class c {
    public static final Set f21756a = new HashSet(Arrays.asList("app_update", "review"));
    public static final Set f21757b = new HashSet(Arrays.asList("native", "unity"));
    public static final Map f21758c = new HashMap();
    public static final a f21759d = new a("PlayCoreVersion");

    public static Bundle a(String str) {
        Bundle bundle = new Bundle();
        Map b10 = b(str);
        bundle.putInt("playcore_version_code", ((Integer) b10.get("java")).intValue());
        if (b10.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((Integer) b10.get("native")).intValue());
        }
        if (b10.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((Integer) b10.get("unity")).intValue());
        }
        return bundle;
    }

    public static synchronized Map b(String str) {
        Map map;
        synchronized (c.class) {
            Map map2 = f21758c;
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
