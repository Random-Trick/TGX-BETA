package p220p7;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
import p034c7.C2021c;

public class C8058b {
    public static final String[] f26240c = {"*", "FCM", "GCM", ""};
    public final SharedPreferences f26241a;
    public final String f26242b;

    public C8058b(C2021c cVar) {
        this.f26241a = cVar.m35815h().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f26242b = m13688b(cVar);
    }

    public static String m13688b(C2021c cVar) {
        String d = cVar.m35812k().m35792d();
        if (d != null) {
            return d;
        }
        String c = cVar.m35812k().m35793c();
        if (!c.startsWith("1:") && !c.startsWith("2:")) {
            return c;
        }
        String[] split = c.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public static String m13687c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    public final String m13689a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    public final String m13686d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    public final PublicKey m13685e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            Log.w("ContentValues", "Invalid key stored " + e);
            return null;
        }
    }

    public String m13684f() {
        synchronized (this.f26241a) {
            String g = m13683g();
            if (g != null) {
                return g;
            }
            return m13682h();
        }
    }

    public final String m13683g() {
        String string;
        synchronized (this.f26241a) {
            string = this.f26241a.getString("|S|id", null);
        }
        return string;
    }

    public final String m13682h() {
        synchronized (this.f26241a) {
            String string = this.f26241a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            PublicKey e = m13685e(string);
            if (e == null) {
                return null;
            }
            return m13687c(e);
        }
    }

    public String m13681i() {
        synchronized (this.f26241a) {
            for (String str : f26240c) {
                String string = this.f26241a.getString(m13689a(this.f26242b, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith("{")) {
                        string = m13686d(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }
}
