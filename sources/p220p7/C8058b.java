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
    public static final String[] f26243c = {"*", "FCM", "GCM", ""};
    public final SharedPreferences f26244a;
    public final String f26245b;

    public C8058b(C2021c cVar) {
        this.f26244a = cVar.m35818h().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f26245b = m13687b(cVar);
    }

    public static String m13687b(C2021c cVar) {
        String d = cVar.m35815k().m35795d();
        if (d != null) {
            return d;
        }
        String c = cVar.m35815k().m35796c();
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

    public static String m13686c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    public final String m13688a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    public final String m13685d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    public final PublicKey m13684e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            Log.w("ContentValues", "Invalid key stored " + e);
            return null;
        }
    }

    public String m13683f() {
        synchronized (this.f26244a) {
            String g = m13682g();
            if (g != null) {
                return g;
            }
            return m13681h();
        }
    }

    public final String m13682g() {
        String string;
        synchronized (this.f26244a) {
            string = this.f26244a.getString("|S|id", null);
        }
        return string;
    }

    public final String m13681h() {
        synchronized (this.f26244a) {
            String string = this.f26244a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            PublicKey e = m13684e(string);
            if (e == null) {
                return null;
            }
            return m13686c(e);
        }
    }

    public String m13680i() {
        synchronized (this.f26244a) {
            for (String str : f26243c) {
                String string = this.f26244a.getString(m13688a(this.f26245b, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith("{")) {
                        string = m13685d(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }
}
