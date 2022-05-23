package org.thunderdog.challegram.service;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import gd.w;
import ib.i;
import java.util.ArrayList;
import java.util.List;
import oc.v0;
import org.thunderdog.challegram.MainActivity;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.b;
import p0.h;

public class ForegroundService extends Service {
    public String M;
    public int N;
    public final List<a> f20109a = new ArrayList();
    public CharSequence f20110b;
    public CharSequence f20111c;

    public static class a {
        public final CharSequence f20112a;
        public final CharSequence f20113b;
        public final String f20114c;
        public final int f20115d;
        public final long f20116e;
        public final int f20117f;

        public a(CharSequence charSequence, CharSequence charSequence2, String str, int i10, long j10, int i11) {
            this.f20112a = charSequence;
            this.f20113b = charSequence2;
            this.f20114c = str;
            this.f20115d = i10;
            this.f20116e = j10;
            this.f20117f = i11;
        }
    }

    public static void d(Context context, CharSequence charSequence, CharSequence charSequence2, String str, int i10, long j10, int i11) {
        if (!i.i(str)) {
            Intent intent = new Intent(context, ForegroundService.class);
            intent.setAction("start");
            intent.putExtra("extra_title", charSequence);
            if (!i.i(charSequence2)) {
                intent.putExtra("extra_subtitle", charSequence2);
            }
            intent.putExtra("extra_channel_id", str);
            if (i10 != 0) {
                intent.putExtra("extra_icon_res", i10);
            }
            intent.putExtra("extra_push_id", j10);
            intent.putExtra("extra_account_id", i11);
            q0.a.k(context, intent);
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static void e(Context context, long j10, int i10) {
        Intent intent = new Intent(context, ForegroundService.class);
        intent.setAction("stop");
        intent.putExtra("extra_push_id", j10);
        intent.putExtra("extra_account_id", i10);
        q0.a.k(context, intent);
    }

    public final void a(Intent intent) {
        CharSequence charSequenceExtra = intent.getCharSequenceExtra("extra_title");
        if (i.i(charSequenceExtra)) {
            charSequenceExtra = intent.getStringExtra("extra_title");
        }
        CharSequence charSequenceExtra2 = intent.getCharSequenceExtra("extra_subtitle");
        String stringExtra = intent.getStringExtra("extra_channel_id");
        int intExtra = intent.getIntExtra("extra_icon_res", R.drawable.baseline_sync_white_24);
        long longExtra = intent.getLongExtra("extra_push_id", 0L);
        int intExtra2 = intent.getIntExtra("extra_account_id", -1);
        this.f20109a.add(new a(charSequenceExtra, charSequenceExtra2, stringExtra, intExtra, longExtra, intExtra2));
        b.a.a(longExtra, intExtra2, "handleStart() Title: %s  ChannelId: %s  Text: %s", charSequenceExtra, stringExtra, charSequenceExtra2);
        if (this.f20109a.size() == 1) {
            b.a.a(longExtra, intExtra2, "First request. Title: %s  ChannelId: %s  Text: %s", charSequenceExtra, stringExtra, charSequenceExtra2);
            this.f20110b = charSequenceExtra;
            this.f20111c = charSequenceExtra2;
            this.M = stringExtra;
            this.N = intExtra;
        }
        c(this.f20110b, this.f20111c, this.M, this.N);
    }

    public final void b(Intent intent) {
        a aVar;
        int i10;
        String str;
        CharSequence charSequence;
        CharSequence charSequence2;
        long longExtra = intent.getLongExtra("extra_push_id", 0L);
        int intExtra = intent.getIntExtra("extra_account_id", -1);
        b.a.a(longExtra, intExtra, "handleStop()", new Object[0]);
        if (this.f20109a.isEmpty()) {
            b.a.a(longExtra, intExtra, "Bug: handleStop() without handleStart()", new Object[0]);
            aVar = null;
        } else {
            List<a> list = this.f20109a;
            aVar = list.remove(list.size() - 1);
        }
        if (!i.i(this.M)) {
            charSequence2 = this.f20110b;
            charSequence = this.f20111c;
            str = this.M;
            i10 = this.N;
        } else if (aVar != null) {
            CharSequence charSequence3 = aVar.f20112a;
            CharSequence charSequence4 = aVar.f20113b;
            String str2 = aVar.f20114c;
            i10 = aVar.f20115d;
            charSequence2 = charSequence3;
            charSequence = charSequence4;
            str = str2;
        } else {
            charSequence2 = w.i1(R.string.RetrievingMessages);
            str = v0.N0();
            charSequence = null;
            i10 = 0;
        }
        if (!i.i(str)) {
            c(charSequence2, charSequence, str, i10);
            if (this.f20109a.isEmpty()) {
                b.a.a(longExtra, intExtra, "Last request. Ending foreground service.", new Object[0]);
                stopForeground(true);
                stopSelf();
                this.f20110b = null;
                this.f20111c = null;
                this.M = null;
                this.N = 0;
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, String str, int i10) {
        if (!this.f20109a.isEmpty()) {
            List<a> list = this.f20109a;
            a aVar = list.get(list.size() - 1);
            CharSequence charSequence3 = aVar.f20112a;
            str = aVar.f20114c;
            i10 = aVar.f20115d;
            charSequence2 = aVar.f20113b;
            charSequence = charSequence3;
        }
        h.e o10 = new h.e(this, str).F(i10).q(charSequence).o(PendingIntent.getActivity(this, 0, new Intent(this, MainActivity.class), 0));
        if (!i.i(charSequence2)) {
            o10.p(charSequence2);
        }
        v0.N2(this, 2147483643, o10.d());
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
    }

    @Override
    public int onStartCommand(Intent intent, int i10, int i11) {
        synchronized (ForegroundService.class) {
            if (intent != null) {
                try {
                    if ("start".equals(intent.getAction())) {
                        a(intent);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (intent == null || !"stop".equals(intent.getAction())) {
                throw new IllegalStateException("Action needs to be START or STOP.");
            }
            b(intent);
        }
        return 2;
    }
}
