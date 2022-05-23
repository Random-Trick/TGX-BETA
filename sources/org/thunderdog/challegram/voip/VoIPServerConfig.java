package org.thunderdog.challegram.voip;

import org.json.JSONException;
import org.json.JSONObject;
import org.thunderdog.challegram.Log;

public class VoIPServerConfig {
    private static JSONObject config;

    public static boolean getBoolean(String str, boolean z10) {
        JSONObject jSONObject = config;
        return jSONObject != null ? jSONObject.optBoolean(str, z10) : z10;
    }

    public static double getDouble(String str, double d10) {
        JSONObject jSONObject = config;
        return jSONObject != null ? jSONObject.optDouble(str, d10) : d10;
    }

    public static int getInt(String str, int i10) {
        return config.optInt(str, i10);
    }

    public static String getString(String str, String str2) {
        JSONObject jSONObject = config;
        return jSONObject != null ? jSONObject.optString(str, str2) : str2;
    }

    private static native void nativeSetConfig(String str);

    public static void setConfig(String str) {
        try {
            config = new JSONObject(str);
            nativeSetConfig(str);
        } catch (JSONException e10) {
            Log.e(2, "Error parsing VoIP config", e10, new Object[0]);
        }
    }
}
