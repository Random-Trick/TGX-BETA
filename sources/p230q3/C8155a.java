package p230q3;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p020b5.C1216l0;
import p020b5.C1230s;

public final class C8155a {
    public static byte[] m13345a(byte[] bArr) {
        return C1216l0.f4526a >= 27 ? bArr : C1216l0.m37977e0(m13343c(C1216l0.m38021A(bArr)));
    }

    public static byte[] m13344b(byte[] bArr) {
        if (C1216l0.f4526a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(C1216l0.m38021A(bArr));
            StringBuilder sb2 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb2.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb2.append("{\"k\":\"");
                sb2.append(m13342d(jSONObject2.getString("k")));
                sb2.append("\",\"kid\":\"");
                sb2.append(m13342d(jSONObject2.getString("kid")));
                sb2.append("\",\"kty\":\"");
                sb2.append(jSONObject2.getString("kty"));
                sb2.append("\"}");
            }
            sb2.append("]}");
            return C1216l0.m37977e0(sb2.toString());
        } catch (JSONException e) {
            String valueOf = String.valueOf(C1216l0.m38021A(bArr));
            C1230s.m37886d("ClearKeyUtil", valueOf.length() != 0 ? "Failed to adjust response data: ".concat(valueOf) : new String("Failed to adjust response data: "), e);
            return bArr;
        }
    }

    public static String m13343c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    public static String m13342d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
