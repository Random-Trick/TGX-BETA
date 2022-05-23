package de;

import android.content.Context;
import gd.w;
import he.i;
import id.d;
import java.util.List;
import kb.j;
import org.thunderdog.challegram.R;
import zd.o6;

public class zs extends ys<i.f> {
    public zs(Context context, o6 o6Var) {
        super(context, o6Var, 256L, R.string.EmojiInfo, R.string.EmojiCurrent, R.string.EmojiBuiltIn, R.string.EmojiLoaded, R.string.EmojiUpdate, R.string.EmojiInstalling);
    }

    @Override
    public int R9() {
        return R.id.controller_emojiSets;
    }

    @Override
    public void Ug(j<List<i.f>> jVar) {
        this.f24495b.C5(jVar);
    }

    @Override
    public CharSequence X9() {
        return w.i1(R.string.EmojiSets);
    }

    public void Pg(i.f fVar) {
        d.z().g(fVar);
        if (Vg() != null) {
            Vg().fi();
        }
    }

    public i.f Tg() {
        return i.c2().N0();
    }
}
