package f2;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.work.a;
import g2.i;
import java.util.Collections;
import java.util.List;

@SuppressLint({"AddedAbstractMethod"})
public abstract class t {
    public static t g(Context context) {
        return i.o(context);
    }

    public static void i(Context context, a aVar) {
        i.i(context, aVar);
    }

    public abstract m a(String str);

    public abstract m b(String str);

    public final m c(u uVar) {
        return d(Collections.singletonList(uVar));
    }

    public abstract m d(List<? extends u> list);

    public m e(String str, d dVar, l lVar) {
        return f(str, dVar, Collections.singletonList(lVar));
    }

    public abstract m f(String str, d dVar, List<l> list);

    public abstract LiveData<List<s>> h(String str);
}
