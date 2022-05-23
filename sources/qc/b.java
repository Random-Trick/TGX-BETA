package qc;

import org.drinkless.td.libcore.telegram.TdApi;
import org.json.JSONObject;

public class b {
    public static a a(TdApi.StatisticalGraphData statisticalGraphData, int i10) {
        JSONObject jSONObject = new JSONObject(statisticalGraphData.jsonData);
        if (i10 == 0) {
            return new a(jSONObject);
        }
        if (i10 == 1) {
            return new c(jSONObject);
        }
        if (i10 == 2) {
            return new d(jSONObject);
        }
        if (i10 == 4) {
            return new e(jSONObject);
        }
        throw new IllegalArgumentException("type == " + i10);
    }
}
