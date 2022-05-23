package y6;

import android.app.Activity;
import android.content.Context;
import y6.q;

public final class c extends a {
    @Override
    public final d b(Context context, String str, q.a aVar, q.b bVar) {
        return new m(context, str, context.getPackageName(), w.e(context), aVar, bVar);
    }

    @Override
    public final f c(Activity activity, d dVar, boolean z10) {
        return t.c(activity, dVar.a(), z10);
    }
}
