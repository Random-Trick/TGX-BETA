package z8;

import android.util.Log;

public class a extends f {
    public String f27027a;

    public a(String str) {
        this.f27027a = str;
    }

    @Override
    public void b(String str) {
        Log.d("isoparser", String.valueOf(this.f27027a) + ":" + str);
    }

    @Override
    public void c(String str) {
        Log.e("isoparser", String.valueOf(this.f27027a) + ":" + str);
    }

    @Override
    public void d(String str) {
        Log.w("isoparser", String.valueOf(this.f27027a) + ":" + str);
    }
}
