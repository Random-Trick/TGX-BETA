package org.thunderdog.challegram.service;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.List;
import nc.C7389v0;
import org.thunderdog.challegram.C7903b;
import org.thunderdog.challegram.MainActivity;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p108hb.C5070i;
import p213p0.C7956h;
import p227q0.C8117a;

public class ForegroundService extends Service {
    public String f25656M;
    public int f25657N;
    public final List<C7915a> f25658a = new ArrayList();
    public CharSequence f25659b;
    public CharSequence f25660c;

    public static class C7915a {
        public final CharSequence f25661a;
        public final CharSequence f25662b;
        public final String f25663c;
        public final int f25664d;
        public final long f25665e;
        public final int f25666f;

        public C7915a(CharSequence charSequence, CharSequence charSequence2, String str, int i, long j, int i2) {
            this.f25661a = charSequence;
            this.f25662b = charSequence2;
            this.f25663c = str;
            this.f25664d = i;
            this.f25665e = j;
            this.f25666f = i2;
        }
    }

    public static void m14264d(Context context, CharSequence charSequence, CharSequence charSequence2, String str, int i, long j, int i2) {
        if (!C5070i.m24062i(str)) {
            Intent intent = new Intent(context, ForegroundService.class);
            intent.setAction("start");
            intent.putExtra("extra_title", charSequence);
            if (!C5070i.m24062i(charSequence2)) {
                intent.putExtra("extra_subtitle", charSequence2);
            }
            intent.putExtra("extra_channel_id", str);
            if (i != 0) {
                intent.putExtra("extra_icon_res", i);
            }
            intent.putExtra("extra_push_id", j);
            intent.putExtra("extra_account_id", i2);
            C8117a.m13430m(context, intent);
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static void m14263e(Context context, long j, int i) {
        Intent intent = new Intent(context, ForegroundService.class);
        intent.setAction("stop");
        intent.putExtra("extra_push_id", j);
        intent.putExtra("extra_account_id", i);
        C8117a.m13430m(context, intent);
    }

    public final void m14267a(Intent intent) {
        CharSequence charSequenceExtra = intent.getCharSequenceExtra("extra_title");
        if (C5070i.m24062i(charSequenceExtra)) {
            charSequenceExtra = intent.getStringExtra("extra_title");
        }
        CharSequence charSequenceExtra2 = intent.getCharSequenceExtra("extra_subtitle");
        String stringExtra = intent.getStringExtra("extra_channel_id");
        int intExtra = intent.getIntExtra("extra_icon_res", R.drawable.baseline_sync_white_24);
        long longExtra = intent.getLongExtra("extra_push_id", 0L);
        int intExtra2 = intent.getIntExtra("extra_account_id", -1);
        this.f25658a.add(new C7915a(charSequenceExtra, charSequenceExtra2, stringExtra, intExtra, longExtra, intExtra2));
        C7903b.C7904a.m14398a(longExtra, intExtra2, "handleStart() Title: %s  ChannelId: %s  Text: %s", charSequenceExtra, stringExtra, charSequenceExtra2);
        if (this.f25658a.size() == 1) {
            C7903b.C7904a.m14398a(longExtra, intExtra2, "First request. Title: %s  ChannelId: %s  Text: %s", charSequenceExtra, stringExtra, charSequenceExtra2);
            this.f25659b = charSequenceExtra;
            this.f25660c = charSequenceExtra2;
            this.f25656M = stringExtra;
            this.f25657N = intExtra;
        }
        m14265c(this.f25659b, this.f25660c, this.f25656M, this.f25657N);
    }

    public final void m14266b(Intent intent) {
        C7915a aVar;
        int i;
        String str;
        CharSequence charSequence;
        CharSequence charSequence2;
        long longExtra = intent.getLongExtra("extra_push_id", 0L);
        int intExtra = intent.getIntExtra("extra_account_id", -1);
        C7903b.C7904a.m14398a(longExtra, intExtra, "handleStop()", new Object[0]);
        if (this.f25658a.isEmpty()) {
            C7903b.C7904a.m14398a(longExtra, intExtra, "Bug: handleStop() without handleStart()", new Object[0]);
            aVar = null;
        } else {
            List<C7915a> list = this.f25658a;
            aVar = list.remove(list.size() - 1);
        }
        if (!C5070i.m24062i(this.f25656M)) {
            charSequence2 = this.f25659b;
            charSequence = this.f25660c;
            str = this.f25656M;
            i = this.f25657N;
        } else if (aVar != null) {
            CharSequence charSequence3 = aVar.f25661a;
            CharSequence charSequence4 = aVar.f25662b;
            String str2 = aVar.f25663c;
            i = aVar.f25664d;
            charSequence2 = charSequence3;
            charSequence = charSequence4;
            str = str2;
        } else {
            charSequence2 = C4403w.m27871i1(R.string.RetrievingMessages);
            str = C7389v0.m16705N0();
            charSequence = null;
            i = 0;
        }
        if (!C5070i.m24062i(str)) {
            m14265c(charSequence2, charSequence, str, i);
            if (this.f25658a.isEmpty()) {
                C7903b.C7904a.m14398a(longExtra, intExtra, "Last request. Ending foreground service.", new Object[0]);
                stopForeground(true);
                stopSelf();
                this.f25659b = null;
                this.f25660c = null;
                this.f25656M = null;
                this.f25657N = 0;
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    public final void m14265c(CharSequence charSequence, CharSequence charSequence2, String str, int i) {
        if (!this.f25658a.isEmpty()) {
            List<C7915a> list = this.f25658a;
            C7915a aVar = list.get(list.size() - 1);
            CharSequence charSequence3 = aVar.f25661a;
            str = aVar.f25663c;
            i = aVar.f25664d;
            charSequence2 = aVar.f25662b;
            charSequence = charSequence3;
        }
        C7956h.C7965e o = new C7956h.C7965e(this, str).m13970F(i).m13945q(charSequence).m13947o(PendingIntent.getActivity(this, 0, new Intent(this, MainActivity.class), 0));
        if (!C5070i.m24062i(charSequence2)) {
            o.m13946p(charSequence2);
        }
        C7389v0.m16703N2(this, 2147483643, o.m13958d());
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
    }

    @Override
    public int onStartCommand(Intent intent, int i, int i2) {
        synchronized (ForegroundService.class) {
            if (intent != null) {
                try {
                    if ("start".equals(intent.getAction())) {
                        m14267a(intent);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (intent == null || !"stop".equals(intent.getAction())) {
                throw new IllegalStateException("Action needs to be START or STOP.");
            }
            m14266b(intent);
        }
        return 2;
    }
}
