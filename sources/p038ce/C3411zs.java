package p038ce;

import android.content.Context;
import ge.C4868i;
import java.util.List;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p110hd.C5078d;
import p139jb.AbstractC5918j;
import p350yd.C10930q6;

public class C3411zs extends AbstractView$OnClickListenerC3371ys<C4868i.C4874f> {
    public C3411zs(Context context, C10930q6 q6Var) {
        super(context, q6Var, 256L, R.string.EmojiInfo, R.string.EmojiCurrent, R.string.EmojiBuiltIn, R.string.EmojiLoaded, R.string.EmojiUpdate, R.string.EmojiInstalling);
    }

    @Override
    public int mo407R9() {
        return R.id.controller_emojiSets;
    }

    @Override
    public void mo30657Ug(AbstractC5918j<List<C4868i.C4874f>> jVar) {
        this.f30167b.m2157y5(jVar);
    }

    @Override
    public CharSequence mo9313X9() {
        return C4403w.m27869i1(R.string.EmojiSets);
    }

    public void mo30659Pg(C4868i.C4874f fVar) {
        C5078d.m23986z().m24005g(fVar);
        if (m30672Vg() != null) {
            m30672Vg().m34813fi();
        }
    }

    public C4868i.C4874f mo30658Tg() {
        return C4868i.m24726c2().m24835N0();
    }
}
