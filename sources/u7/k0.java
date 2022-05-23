package u7;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

public final class k0 {
    public final SharedPreferences f23641a;
    public final Executor f23645e;
    public final ArrayDeque<String> f23644d = new ArrayDeque<>();
    public boolean f23646f = false;
    public final String f23642b = "topic_operation_queue";
    public final String f23643c = ",";

    public k0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f23641a = sharedPreferences;
        this.f23645e = executor;
    }

    public static k0 c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        k0 k0Var = new k0(sharedPreferences, "topic_operation_queue", ",", executor);
        k0Var.d();
        return k0Var;
    }

    public final boolean b(boolean z10) {
        if (!z10 || this.f23646f) {
            return z10;
        }
        i();
        return true;
    }

    public final void d() {
        synchronized (this.f23644d) {
            this.f23644d.clear();
            String string = this.f23641a.getString(this.f23642b, "");
            if (!TextUtils.isEmpty(string) && string.contains(this.f23643c)) {
                String[] split = string.split(this.f23643c, -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f23644d.add(str);
                    }
                }
            }
        }
    }

    public String e() {
        String peek;
        synchronized (this.f23644d) {
            peek = this.f23644d.peek();
        }
        return peek;
    }

    public boolean f(Object obj) {
        boolean remove;
        synchronized (this.f23644d) {
            remove = this.f23644d.remove(obj);
            b(remove);
        }
        return remove;
    }

    public String g() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.f23644d.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(this.f23643c);
        }
        return sb2.toString();
    }

    public final void a() {
        synchronized (this.f23644d) {
            this.f23641a.edit().putString(this.f23642b, g()).commit();
        }
    }

    public final void i() {
        this.f23645e.execute(new Runnable(this) {
            public final k0 f23639a;

            {
                this.f23639a = this;
            }

            @Override
            public void run() {
                this.f23639a.a();
            }
        });
    }
}
