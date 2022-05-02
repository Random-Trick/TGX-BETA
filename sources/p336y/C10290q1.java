package p336y;

import android.util.ArrayMap;
import java.util.Map;

public class C10290q1 extends C10242i2 {
    public C10290q1(Map<String, Object> map) {
        super(map);
    }

    public static C10290q1 m5536f() {
        return new C10290q1(new ArrayMap());
    }

    public static C10290q1 m5535g(C10242i2 i2Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : i2Var.m5658d()) {
            arrayMap.put(str, i2Var.m5659c(str));
        }
        return new C10290q1(arrayMap);
    }

    public void m5537e(C10242i2 i2Var) {
        Map<String, Object> map;
        Map<String, Object> map2 = this.f33020a;
        if (map2 != null && (map = i2Var.f33020a) != null) {
            map2.putAll(map);
        }
    }

    public void m5534h(String str, Object obj) {
        this.f33020a.put(str, obj);
    }
}
