package p074f5;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import p163l5.C6378r;

public class C4271a {
    public static final Lock f14326c = new ReentrantLock();
    @GuardedBy("sLk")
    public static C4271a f14327d;
    public final Lock f14328a = new ReentrantLock();
    @GuardedBy("mLk")
    public final SharedPreferences f14329b;

    public C4271a(Context context) {
        this.f14329b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @RecentlyNonNull
    public static C4271a m28315a(@RecentlyNonNull Context context) {
        C6378r.m20507k(context);
        Lock lock = f14326c;
        lock.lock();
        try {
            if (f14327d == null) {
                f14327d = new C4271a(context.getApplicationContext());
            }
            C4271a aVar = f14327d;
            lock.unlock();
            return aVar;
        } catch (Throwable th) {
            f14326c.unlock();
            throw th;
        }
    }

    public static final String m28312d(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(":");
        sb2.append(str2);
        return sb2.toString();
    }

    @RecentlyNullable
    public GoogleSignInAccount m28314b() {
        String c;
        String c2 = m28313c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(c2) || (c = m28313c(m28312d("googleSignInAccount", c2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m30406l(c);
        } catch (JSONException unused) {
            return null;
        }
    }

    @RecentlyNullable
    public final String m28313c(@RecentlyNonNull String str) {
        this.f14328a.lock();
        try {
            return this.f14329b.getString(str, null);
        } finally {
            this.f14328a.unlock();
        }
    }
}
