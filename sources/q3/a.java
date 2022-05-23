package q3;

import c5.l0;
import c5.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {
    public static byte[] a(byte[] bArr) {
        return l0.f4841a >= 27 ? bArr : l0.f0(c(l0.A(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (l0.f4841a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(l0.A(bArr));
            StringBuilder sb2 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (i10 != 0) {
                    sb2.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                sb2.append("{\"k\":\"");
                sb2.append(d(jSONObject2.getString("k")));
                sb2.append("\",\"kid\":\"");
                sb2.append(d(jSONObject2.getString("kid")));
                sb2.append("\",\"kty\":\"");
                sb2.append(jSONObject2.getString("kty"));
                sb2.append("\"}");
            }
            sb2.append("]}");
            return l0.f0(sb2.toString());
        } catch (JSONException e10) {
            String valueOf = String.valueOf(l0.A(bArr));
            s.d("ClearKeyUtil", valueOf.length() != 0 ? "Failed to adjust response data: ".concat(valueOf) : new String("Failed to adjust response data: "), e10);
            return bArr;
        }
    }

    public static String c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    public static String d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
