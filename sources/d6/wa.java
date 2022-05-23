package d6;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class wa implements bb {
    public final List<bb> f7095a;

    public wa(Context context, va vaVar) {
        ArrayList arrayList = new ArrayList();
        this.f7095a = arrayList;
        if (vaVar.c()) {
            arrayList.add(new kb(context, vaVar));
        }
    }

    @Override
    public final void a(fb fbVar) {
        for (bb bbVar : this.f7095a) {
            bbVar.a(fbVar);
        }
    }
}
