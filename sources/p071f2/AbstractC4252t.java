package p071f2;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.work.C1066a;
import java.util.Collections;
import java.util.List;
import p087g2.C4458i;

@SuppressLint({"AddedAbstractMethod"})
public abstract class AbstractC4252t {
    public static AbstractC4252t m28346g(Context context) {
        return C4458i.m27591o(context);
    }

    public static void m28345i(Context context, C1066a aVar) {
        C4458i.m27597i(context, aVar);
    }

    public abstract AbstractC4239m mo27602a(String str);

    public abstract AbstractC4239m mo27601b(String str);

    public final AbstractC4239m m28348c(AbstractC4253u uVar) {
        return mo27600d(Collections.singletonList(uVar));
    }

    public abstract AbstractC4239m mo27600d(List<? extends AbstractC4253u> list);

    public AbstractC4239m m28347e(String str, EnumC4227d dVar, C4237l lVar) {
        return mo27599f(str, dVar, Collections.singletonList(lVar));
    }

    public abstract AbstractC4239m mo27599f(String str, EnumC4227d dVar, List<C4237l> list);

    public abstract LiveData<List<C4250s>> mo27598h(String str);
}
