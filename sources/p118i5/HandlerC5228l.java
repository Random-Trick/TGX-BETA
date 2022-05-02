package p118i5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import p299v5.HandlerC9849i;

@SuppressLint({"HandlerLeak"})
public final class HandlerC5228l extends HandlerC9849i {
    public final Context f17380a;
    public final C5220d f17381b;

    public HandlerC5228l(C5220d dVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f17381b = dVar;
        this.f17380a = context.getApplicationContext();
    }

    @Override
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("Don't know how to handle this message: ");
            sb2.append(i);
            Log.w("GoogleApiAvailability", sb2.toString());
            return;
        }
        int i2 = this.f17381b.mo23585i(this.f17380a);
        if (this.f17381b.mo23581m(i2)) {
            this.f17381b.m23602r(this.f17380a, i2);
        }
    }
}
