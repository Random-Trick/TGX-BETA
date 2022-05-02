package p033c6;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class C1974wa implements AbstractC1671bb {
    public final List<AbstractC1671bb> f7057a;

    public C1974wa(Context context, AbstractC1960va vaVar) {
        ArrayList arrayList = new ArrayList();
        this.f7057a = arrayList;
        if (vaVar.mo35844c()) {
            arrayList.add(new C1806kb(context, vaVar));
        }
    }

    @Override
    public final void mo35840a(C1731fb fbVar) {
        for (AbstractC1671bb bbVar : this.f7057a) {
            bbVar.mo35840a(fbVar);
        }
    }
}
