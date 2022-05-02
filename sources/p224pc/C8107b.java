package p224pc;

import org.drinkless.p210td.libcore.telegram.TdApi;
import org.json.JSONObject;

public class C8107b {
    public static C8105a m13589a(TdApi.StatisticalGraphData statisticalGraphData, int i) {
        JSONObject jSONObject = new JSONObject(statisticalGraphData.jsonData);
        if (i == 0) {
            return new C8105a(jSONObject);
        }
        if (i == 1) {
            return new C8108c(jSONObject);
        }
        if (i == 2) {
            return new C8109d(jSONObject);
        }
        if (i == 4) {
            return new C8110e(jSONObject);
        }
        throw new IllegalArgumentException("type == " + i);
    }
}
