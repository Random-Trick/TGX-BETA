package de;

import android.content.Context;
import android.view.View;
import gd.w;
import hd.o;
import java.util.ArrayList;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import zd.o6;

public class e20 extends j10<o<?>> {
    public String G0;

    public e20(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    @Override
    public String Cf() {
        return this.G0;
    }

    @Override
    public int Df() {
        return 14;
    }

    @Override
    public boolean Lg() {
        return false;
    }

    @Override
    public boolean Nf() {
        return true;
    }

    public o<?> rg(TdApi.Object object) {
        return null;
    }

    public e20 Qg(String str) {
        this.G0 = str;
        return this;
    }

    @Override
    public CharSequence X9() {
        return w.i1(R.string.TabMedia);
    }

    @Override
    public TdApi.Function hf(long j10, long j11, String str, long j12, String str2, int i10) {
        return null;
    }

    @Override
    public CharSequence mo1if(ArrayList<o<?>> arrayList) {
        return null;
    }

    @Override
    public void onClick(View view) {
    }

    @Override
    public int xg() {
        return 0;
    }
}
