package g5;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;
import m5.r;
import org.json.JSONException;

public class a {
    public static final Lock f12102c = new ReentrantLock();
    @GuardedBy("sLk")
    public static a f12103d;
    public final Lock f12104a = new ReentrantLock();
    @GuardedBy("mLk")
    public final SharedPreferences f12105b;

    public a(Context context) {
        this.f12105b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @RecentlyNonNull
    public static a a(@RecentlyNonNull Context context) {
        r.k(context);
        Lock lock = f12102c;
        lock.lock();
        try {
            if (f12103d == null) {
                f12103d = new a(context.getApplicationContext());
            }
            a aVar = f12103d;
            lock.unlock();
            return aVar;
        } catch (Throwable th) {
            f12102c.unlock();
            throw th;
        }
    }

    public static final String d(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(":");
        sb2.append(str2);
        return sb2.toString();
    }

    @RecentlyNullable
    public GoogleSignInAccount b() {
        String c10;
        String c11 = c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(c11) || (c10 = c(d("googleSignInAccount", c11))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.l(c10);
        } catch (JSONException unused) {
            return null;
        }
    }

    @RecentlyNullable
    public final String c(@RecentlyNonNull String str) {
        this.f12104a.lock();
        try {
            return this.f12105b.getString(str, null);
        } finally {
            this.f12104a.unlock();
        }
    }
}
