package de;

import android.content.Context;
import gd.w;
import he.i;
import java.util.List;
import kb.j;
import org.thunderdog.challegram.R;
import zd.o6;

public class at extends ys<i.h> {
    public at(Context context, o6 o6Var) {
        super(context, o6Var, 0L, 0, R.string.IconsCurrent, R.string.IconsBuiltIn, R.string.IconsLoaded, R.string.IconsUpdate, R.string.IconsInstalling);
    }

    @Override
    public int R9() {
        return R.id.controller_iconSets;
    }

    @Override
    public void Ug(j<List<i.h>> jVar) {
        this.f24495b.F5(jVar);
    }

    @Override
    public CharSequence X9() {
        return w.i1(R.string.Icons);
    }

    public void Pg(i.h hVar) {
        if (Vg() != null) {
            Vg().gi();
        }
    }

    public i.h Tg() {
        return i.c2().S0();
    }
}
