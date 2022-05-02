package p274t7;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import p034c7.C2021c;
import p102h5.C4962d;
import p150k7.AbstractC6214f;
import p177m6.AbstractC6757c;
import p177m6.AbstractC6775l;
import p177m6.C6781o;
import p178m7.AbstractC6794b;
import p190n7.AbstractC7289g;
import p190n7.AbstractC7295l;
import p301v7.AbstractC9882i;

public class C9002a0 {
    public final C2021c f28905a;
    public final C9010e0 f28906b;
    public final C4962d f28907c;
    public final AbstractC6794b<AbstractC9882i> f28908d;
    public final AbstractC6794b<AbstractC6214f> f28909e;
    public final AbstractC7289g f28910f;

    public C9002a0(C2021c cVar, C9010e0 e0Var, C4962d dVar, AbstractC6794b<AbstractC9882i> bVar, AbstractC6794b<AbstractC6214f> bVar2, AbstractC7289g gVar) {
        this.f28905a = cVar;
        this.f28906b = e0Var;
        this.f28907c = dVar;
        this.f28908d = bVar;
        this.f28909e = bVar2;
        this.f28910f = gVar;
    }

    public C9002a0(C2021c cVar, C9010e0 e0Var, AbstractC6794b<AbstractC9882i> bVar, AbstractC6794b<AbstractC6214f> bVar2, AbstractC7289g gVar) {
        this(cVar, e0Var, new C4962d(cVar.m35815h()), bVar, bVar2, gVar);
    }

    public static String m10732a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public static boolean m10727f(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    public final AbstractC6775l<String> m10731b(AbstractC6775l<Bundle> lVar) {
        return lVar.mo19073h(ExecutorC9054y.f29031a, new AbstractC6757c(this) {
            public final C9002a0 f29032a;

            {
                this.f29032a = this;
            }

            @Override
            public Object mo10598a(AbstractC6775l lVar2) {
                return this.f29032a.m10726g(lVar2);
            }
        });
    }

    public final String m10730c() {
        try {
            return m10732a(MessageDigest.getInstance("SHA-1").digest(this.f28905a.m35813j().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    public AbstractC6775l<String> m10729d(String str) {
        return m10731b(m10724i(str, C9010e0.m10709c(this.f28905a), "*", new Bundle()));
    }

    public final String m10728e(Bundle bundle) {
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

    public final String m10726g(AbstractC6775l lVar) {
        return m10728e((Bundle) lVar.mo19068m(IOException.class));
    }

    public final Bundle m10725h(String str, String str2, String str3, Bundle bundle) {
        AbstractC6214f.EnumC6215a a;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f28905a.m35812k().m35793c());
        bundle.putString("gmsv", Integer.toString(this.f28906b.m10708d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f28906b.m10711a());
        bundle.putString("app_ver_name", this.f28906b.m10710b());
        bundle.putString("firebase-app-name-hash", m10730c());
        try {
            String b = ((AbstractC7295l) C6781o.m19054a(this.f28910f.mo17133b(false))).mo17131b();
            if (!TextUtils.isEmpty(b)) {
                bundle.putString("Goog-Firebase-Installations-Auth", b);
            } else {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("cliv", "fcm-22.0.0");
        AbstractC6214f fVar = this.f28909e.get();
        AbstractC9882i iVar = this.f28908d.get();
        if (!(fVar == null || iVar == null || (a = fVar.mo21060a("fire-iid")) == AbstractC6214f.EnumC6215a.NONE)) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(a.m21059a()));
            bundle.putString("Firebase-Client", iVar.mo6695a());
        }
        return bundle;
    }

    public final AbstractC6775l<Bundle> m10724i(String str, String str2, String str3, Bundle bundle) {
        m10725h(str, str2, str3, bundle);
        return this.f28907c.m24376a(bundle);
    }

    public AbstractC6775l<?> m10723j(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        String valueOf2 = String.valueOf(str3);
        return m10731b(m10724i(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle));
    }

    public AbstractC6775l<?> m10722k(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        bundle.putString("delete", "1");
        String valueOf2 = String.valueOf(str3);
        return m10731b(m10724i(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle));
    }
}
