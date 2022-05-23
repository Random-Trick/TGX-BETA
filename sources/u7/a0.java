package u7;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import d7.c;
import i5.d;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import l7.f;
import n6.l;
import n6.o;
import n7.b;
import o7.g;
import w7.i;

public class a0 {
    public final c f23596a;
    public final e0 f23597b;
    public final d f23598c;
    public final b<i> f23599d;
    public final b<f> f23600e;
    public final g f23601f;

    public a0(c cVar, e0 e0Var, d dVar, b<i> bVar, b<f> bVar2, g gVar) {
        this.f23596a = cVar;
        this.f23597b = e0Var;
        this.f23598c = dVar;
        this.f23599d = bVar;
        this.f23600e = bVar2;
        this.f23601f = gVar;
    }

    public a0(c cVar, e0 e0Var, b<i> bVar, b<f> bVar2, g gVar) {
        this(cVar, e0Var, new d(cVar.h()), bVar, bVar2, gVar);
    }

    public static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public static boolean f(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    public final l<String> b(l<Bundle> lVar) {
        return lVar.h(y.f23711a, new n6.c(this) {
            public final a0 f23712a;

            {
                this.f23712a = this;
            }

            @Override
            public Object a(l lVar2) {
                return this.f23712a.g(lVar2);
            }
        });
    }

    public final String c() {
        try {
            return a(MessageDigest.getInstance("SHA-1").digest(this.f23596a.j().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    public l<String> d(String str) {
        return b(i(str, e0.c(this.f23596a), "*", new Bundle()));
    }

    public final String e(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                String valueOf = String.valueOf(bundle);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 21);
                sb2.append("Unexpected response: ");
                sb2.append(valueOf);
                Log.w("FirebaseMessaging", sb2.toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    public final String g(l lVar) {
        return e((Bundle) lVar.m(IOException.class));
    }

    public final Bundle h(String str, String str2, String str3, Bundle bundle) {
        f.a a10;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f23596a.k().c());
        bundle.putString("gmsv", Integer.toString(this.f23597b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f23597b.a());
        bundle.putString("app_ver_name", this.f23597b.b());
        bundle.putString("firebase-app-name-hash", c());
        try {
            String b10 = ((o7.l) o.a(this.f23601f.b(false))).b();
            if (!TextUtils.isEmpty(b10)) {
                bundle.putString("Goog-Firebase-Installations-Auth", b10);
            } else {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e10);
        }
        bundle.putString("cliv", "fcm-22.0.0");
        f fVar = this.f23600e.get();
        i iVar = this.f23599d.get();
        if (!(fVar == null || iVar == null || (a10 = fVar.a("fire-iid")) == f.a.NONE)) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(a10.a()));
            bundle.putString("Firebase-Client", iVar.a());
        }
        return bundle;
    }

    public final l<Bundle> i(String str, String str2, String str3, Bundle bundle) {
        h(str, str2, str3, bundle);
        return this.f23598c.a(bundle);
    }

    public l<?> j(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        String valueOf2 = String.valueOf(str3);
        return b(i(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle));
    }

    public l<?> k(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        bundle.putString("delete", "1");
        String valueOf2 = String.valueOf(str3);
        return b(i(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle));
    }
}
