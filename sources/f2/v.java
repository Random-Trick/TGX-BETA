package f2;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

public abstract class v {
    public static final String f11846a = j.f("WorkerFactory");

    public class a extends v {
        @Override
        public ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    public static v c() {
        return new a();
    }

    public abstract ListenableWorker a(Context context, String str, WorkerParameters workerParameters);

    public final ListenableWorker b(Context context, String str, WorkerParameters workerParameters) {
        ListenableWorker a10 = a(context, str, workerParameters);
        if (a10 == null) {
            Class cls = null;
            try {
                cls = Class.forName(str).asSubclass(ListenableWorker.class);
            } catch (Throwable th) {
                j c10 = j.c();
                String str2 = f11846a;
                c10.b(str2, "Invalid class: " + str, th);
            }
            if (cls != null) {
                try {
                    a10 = (ListenableWorker) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    j c11 = j.c();
                    String str3 = f11846a;
                    c11.b(str3, "Could not instantiate " + str, th2);
                }
            }
        }
        if (a10 == null || !a10.k()) {
            return a10;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), str));
    }
}
