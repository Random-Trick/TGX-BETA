package p336y;

import android.util.ArrayMap;
import java.util.Map;
import java.util.Set;

public class C10242i2 {
    public static final C10242i2 f33022b = new C10242i2(new ArrayMap());
    public final Map<String, Object> f33023a;

    public C10242i2(Map<String, Object> map) {
        this.f33023a = map;
    }

    public static C10242i2 m5661a() {
        return f33022b;
    }

    public static C10242i2 m5660b(C10242i2 i2Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : i2Var.m5658d()) {
            arrayMap.put(str, i2Var.m5659c(str));
        }
        return new C10242i2(arrayMap);
    }

    public Object m5659c(String str) {
        return this.f33023a.get(str);
    }

    public Set<String> m5658d() {
        return this.f33023a.keySet();
    }
}
