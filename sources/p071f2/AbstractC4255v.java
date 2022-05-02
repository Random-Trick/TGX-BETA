package p071f2;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

public abstract class AbstractC4255v {
    public static final String f14312a = AbstractC4234j.m28360f("WorkerFactory");

    public class C4256a extends AbstractC4255v {
        @Override
        public ListenableWorker mo28332a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    public static AbstractC4255v m28333c() {
        return new C4256a();
    }

    public abstract ListenableWorker mo28332a(Context context, String str, WorkerParameters workerParameters);

    public final ListenableWorker m28334b(Context context, String str, WorkerParameters workerParameters) {
        ListenableWorker a = mo28332a(context, str, workerParameters);
        if (a == null) {
            Class cls = null;
            try {
                cls = Class.forName(str).asSubclass(ListenableWorker.class);
            } catch (Throwable th) {
                AbstractC4234j c = AbstractC4234j.m28362c();
                String str2 = f14312a;
                c.mo28358b(str2, "Invalid class: " + str, th);
            }
            if (cls != null) {
                try {
                    a = (ListenableWorker) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    AbstractC4234j c2 = AbstractC4234j.m28362c();
                    String str3 = f14312a;
                    c2.mo28358b(str3, "Could not instantiate " + str, th2);
                }
            }
        }
        if (a == null || !a.m38511k()) {
            return a;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), str));
    }
}
