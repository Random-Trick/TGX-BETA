package j5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import w5.i;

@SuppressLint({"HandlerLeak"})
public final class l extends i {
    public final Context f15083a;
    public final d f15084b;

    public l(d dVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f15084b = dVar;
        this.f15083a = context.getApplicationContext();
    }

    @Override
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("Don't know how to handle this message: ");
            sb2.append(i10);
            Log.w("GoogleApiAvailability", sb2.toString());
            return;
        }
        int i11 = this.f15084b.i(this.f15083a);
        if (this.f15084b.m(i11)) {
            this.f15084b.r(this.f15083a, i11);
        }
    }
}
