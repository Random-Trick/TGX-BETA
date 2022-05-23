package y;

import android.util.ArrayMap;
import java.util.Map;
import java.util.Set;

public class i2 {
    public static final i2 f26316b = new i2(new ArrayMap());
    public final Map<String, Object> f26317a;

    public i2(Map<String, Object> map) {
        this.f26317a = map;
    }

    public static i2 a() {
        return f26316b;
    }

    public static i2 b(i2 i2Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : i2Var.d()) {
            arrayMap.put(str, i2Var.c(str));
        }
        return new i2(arrayMap);
    }

    public Object c(String str) {
        return this.f26317a.get(str);
    }

    public Set<String> d() {
        return this.f26317a.keySet();
    }
}
