package p274t7;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

public final class C9023k0 {
    public final SharedPreferences f28952a;
    public final Executor f28956e;
    public final ArrayDeque<String> f28955d = new ArrayDeque<>();
    public boolean f28957f = false;
    public final String f28953b = "topic_operation_queue";
    public final String f28954c = ",";

    public C9023k0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f28952a = sharedPreferences;
        this.f28956e = executor;
    }

    public static C9023k0 m10681c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        C9023k0 k0Var = new C9023k0(sharedPreferences, "topic_operation_queue", ",", executor);
        k0Var.m10680d();
        return k0Var;
    }

    public final boolean m10682b(boolean z) {
        if (!z || this.f28957f) {
            return z;
        }
        m10675i();
        return true;
    }

    public final void m10680d() {
        synchronized (this.f28955d) {
            this.f28955d.clear();
            String string = this.f28952a.getString(this.f28953b, "");
            if (!TextUtils.isEmpty(string) && string.contains(this.f28954c)) {
                String[] split = string.split(this.f28954c, -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f28955d.add(str);
                    }
                }
            }
        }
    }

    public String m10679e() {
        String peek;
        synchronized (this.f28955d) {
            peek = this.f28955d.peek();
        }
        return peek;
    }

    public boolean m10678f(Object obj) {
        boolean remove;
        synchronized (this.f28955d) {
            remove = this.f28955d.remove(obj);
            m10682b(remove);
        }
        return remove;
    }

    public String m10677g() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.f28955d.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(this.f28954c);
        }
        return sb2.toString();
    }

    public final void m10683a() {
        synchronized (this.f28955d) {
            this.f28952a.edit().putString(this.f28953b, m10677g()).commit();
        }
    }

    public final void m10675i() {
        this.f28956e.execute(new Runnable(this) {
            public final C9023k0 f28950a;

            {
                this.f28950a = this;
            }

            @Override
            public void run() {
                this.f28950a.m10683a();
            }
        });
    }
}
