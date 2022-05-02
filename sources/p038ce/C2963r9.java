package p038ce;

import android.content.Context;
import android.view.View;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;
import p350yd.C10930q6;
import td.AbstractC9299t2;

public class C2963r9 extends AbstractC9299t2<String> {
    public C2963r9(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    @Override
    public int mo408A9() {
        return 3;
    }

    @Override
    public View mo8868Ga() {
        return m9534yf();
    }

    @Override
    public int mo9398L9() {
        return R.id.theme_color_filling;
    }

    @Override
    public int mo9375O9() {
        return R.id.theme_color_headerLightIcon;
    }

    @Override
    public int mo9360Q9() {
        return R.id.theme_color_text;
    }

    @Override
    public int mo407R9() {
        return R.id.controller_hashtag;
    }

    @Override
    public CharSequence mo9313X9() {
        return m9131x9();
    }

    @Override
    public View mo403oc(Context context) {
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        frameLayoutFix.addView(m9542qf(null));
        return frameLayoutFix;
    }

    @Override
    public int mo9536wf() {
        return 34;
    }

    @Override
    public String mo9535xf() {
        return m9131x9();
    }
}
