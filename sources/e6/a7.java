package e6;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class a7 implements e7 {
    public final List<e7> f10640a;

    public a7(Context context, z6 z6Var) {
        ArrayList arrayList = new ArrayList();
        this.f10640a = arrayList;
        if (z6Var.c()) {
            arrayList.add(new m7(context, z6Var));
        }
    }

    @Override
    public final void a(g7 g7Var) {
        for (e7 e7Var : this.f10640a) {
            e7Var.a(g7Var);
        }
    }
}
