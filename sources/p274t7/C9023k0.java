package p274t7;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

public final class C9023k0 {
    public final SharedPreferences f28955a;
    public final Executor f28959e;
    public final ArrayDeque<String> f28958d = new ArrayDeque<>();
    public boolean f28960f = false;
    public final String f28956b = "topic_operation_queue";
    public final String f28957c = ",";

    public C9023k0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f28955a = sharedPreferences;
        this.f28959e = executor;
    }

    public static C9023k0 m10680c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        C9023k0 k0Var = new C9023k0(sharedPreferences, "topic_operation_queue", ",", executor);
        k0Var.m10679d();
        return k0Var;
    }

    public final boolean m10681b(boolean z) {
        if (!z || this.f28960f) {
            return z;
        }
        m10674i();
        return true;
    }

    public final void m10679d() {
        synchronized (this.f28958d) {
            this.f28958d.clear();
            String string = this.f28955a.getString(this.f28956b, "");
            if (!TextUtils.isEmpty(string) && string.contains(this.f28957c)) {
                String[] split = string.split(this.f28957c, -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f28958d.add(str);
                    }
                }
            }
        }
    }

    public String m10678e() {
        String peek;
        synchronized (this.f28958d) {
            peek = this.f28958d.peek();
        }
        return peek;
    }

    public boolean m10677f(Object obj) {
        boolean remove;
        synchronized (this.f28958d) {
            remove = this.f28958d.remove(obj);
            m10681b(remove);
        }
        return remove;
    }

    public String m10676g() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.f28958d.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(this.f28957c);
        }
        return sb2.toString();
    }

    public final void m10682a() {
        synchronized (this.f28958d) {
            this.f28955a.edit().putString(this.f28956b, m10676g()).commit();
        }
    }

    public final void m10674i() {
        this.f28959e.execute(new Runnable(this) {
            public final C9023k0 f28953a;

            {
                this.f28953a = this;
            }

            @Override
            public void run() {
                this.f28953a.m10682a();
            }
        });
    }
}
