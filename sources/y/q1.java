package y;

import android.util.ArrayMap;
import java.util.Map;

public class q1 extends i2 {
    public q1(Map<String, Object> map) {
        super(map);
    }

    public static q1 f() {
        return new q1(new ArrayMap());
    }

    public static q1 g(i2 i2Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : i2Var.d()) {
            arrayMap.put(str, i2Var.c(str));
        }
        return new q1(arrayMap);
    }

    public void e(i2 i2Var) {
        Map<String, Object> map;
        Map<String, Object> map2 = this.f26317a;
        if (map2 != null && (map = i2Var.f26317a) != null) {
            map2.putAll(map);
        }
    }

    public void h(String str, Object obj) {
        this.f26317a.put(str, obj);
    }
}
