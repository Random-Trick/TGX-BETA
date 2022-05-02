package p046d6;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class C3622a7 implements AbstractC3662e7 {
    public final List<AbstractC3662e7> f12349a;

    public C3622a7(Context context, AbstractC3857z6 z6Var) {
        ArrayList arrayList = new ArrayList();
        this.f12349a = arrayList;
        if (z6Var.mo29726c()) {
            arrayList.add(new C3741m7(context, z6Var));
        }
    }

    @Override
    public final void mo29807a(C3682g7 g7Var) {
        for (AbstractC3662e7 e7Var : this.f12349a) {
            e7Var.mo29807a(g7Var);
        }
    }
}
