package q7;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import d7.c;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

public class b {
    public static final String[] f21443c = {"*", "FCM", "GCM", ""};
    public final SharedPreferences f21444a;
    public final String f21445b;

    public b(c cVar) {
        this.f21444a = cVar.h().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f21445b = b(cVar);
    }

    public static String b(c cVar) {
        String d10 = cVar.k().d();
        if (d10 != null) {
            return d10;
        }
        String c10 = cVar.k().c();
        if (!c10.startsWith("1:") && !c10.startsWith("2:")) {
            return c10;
        }
        String[] split = c10.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public static String c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    public final String a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    public final String d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    public final PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
            Log.w("ContentValues", "Invalid key stored " + e10);
            return null;
        }
    }

    public String f() {
        synchronized (this.f21444a) {
            String g10 = g();
            if (g10 != null) {
                return g10;
            }
            return h();
        }
    }

    public final String g() {
        String string;
        synchronized (this.f21444a) {
            string = this.f21444a.getString("|S|id", null);
        }
        return string;
    }

    public final String h() {
        synchronized (this.f21444a) {
            String string = this.f21444a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            PublicKey e10 = e(string);
            if (e10 == null) {
                return null;
            }
            return c(e10);
        }
    }

    public String i() {
        synchronized (this.f21444a) {
            for (String str : f21443c) {
                String string = this.f21444a.getString(a(this.f21445b, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith("{")) {
                        string = d(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }
}
