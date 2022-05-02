package p345y8;

import android.util.Log;

public class C10446a extends AbstractC10452f {
    public String f33519a;

    public C10446a(String str) {
        this.f33519a = str;
    }

    @Override
    public void mo5098b(String str) {
        Log.d("isoparser", String.valueOf(this.f33519a) + ":" + str);
    }

    @Override
    public void mo5097c(String str) {
        Log.e("isoparser", String.valueOf(this.f33519a) + ":" + str);
    }

    @Override
    public void mo5096d(String str) {
        Log.w("isoparser", String.valueOf(this.f33519a) + ":" + str);
    }
}
