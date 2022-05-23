package de;

import android.content.Context;
import android.view.View;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;
import ud.t2;
import zd.o6;

public class r9 extends t2<String> {
    public r9(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    @Override
    public int A9() {
        return 3;
    }

    @Override
    public View Ga() {
        return yf();
    }

    @Override
    public int L9() {
        return R.id.theme_color_filling;
    }

    @Override
    public int O9() {
        return R.id.theme_color_headerLightIcon;
    }

    @Override
    public int Q9() {
        return R.id.theme_color_text;
    }

    @Override
    public int R9() {
        return R.id.controller_hashtag;
    }

    @Override
    public CharSequence X9() {
        return x9();
    }

    @Override
    public View oc(Context context) {
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        frameLayoutFix.addView(qf(null));
        return frameLayoutFix;
    }

    @Override
    public int wf() {
        return 34;
    }

    @Override
    public String xf() {
        return x9();
    }
}
