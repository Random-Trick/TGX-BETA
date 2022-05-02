package org.thunderdog.challegram.voip;

import org.json.JSONException;
import org.json.JSONObject;
import org.thunderdog.challegram.Log;

public class VoIPServerConfig {
    private static JSONObject config;

    public static boolean getBoolean(String str, boolean z) {
        JSONObject jSONObject = config;
        return jSONObject != null ? jSONObject.optBoolean(str, z) : z;
    }

    public static double getDouble(String str, double d) {
        JSONObject jSONObject = config;
        return jSONObject != null ? jSONObject.optDouble(str, d) : d;
    }

    public static int getInt(String str, int i) {
        return config.optInt(str, i);
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
        } catch (JSONException e) {
            Log.m14728e(2, "Error parsing VoIP config", e, new Object[0]);
        }
    }
}
