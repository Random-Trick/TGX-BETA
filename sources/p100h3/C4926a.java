package p100h3;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import org.thunderdog.challegram.Log;
import p018b3.AbstractC1159m;
import p058e3.C4118a;
import p116i3.AbstractC5179c;
import p146k3.AbstractC6045a;
import p161l3.C6307a;

public class C4926a implements AbstractC4950s {
    public final Context f16799a;
    public final AbstractC5179c f16800b;
    public AlarmManager f16801c;
    public final AbstractC4934g f16802d;
    public final AbstractC6045a f16803e;

    public C4926a(Context context, AbstractC5179c cVar, AbstractC6045a aVar, AbstractC4934g gVar) {
        this(context, cVar, (AlarmManager) context.getSystemService("alarm"), aVar, gVar);
    }

    @Override
    public void mo24393a(AbstractC1159m mVar, int i) {
        mo24392b(mVar, i, false);
    }

    @Override
    public void mo24392b(AbstractC1159m mVar, int i, boolean z) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", mVar.mo38266b());
        builder.appendQueryParameter("priority", String.valueOf(C6307a.m20689a(mVar.mo38264d())));
        if (mVar.mo38265c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(mVar.mo38265c(), 0));
        }
        Intent intent = new Intent(this.f16799a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i);
        if (z || !m24439c(intent)) {
            long y = this.f16800b.mo23669y(mVar);
            long g = this.f16802d.m24430g(mVar.mo38264d(), y, i);
            C4118a.m28885b("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", mVar, Long.valueOf(g), Long.valueOf(y), Integer.valueOf(i));
            this.f16801c.set(3, this.f16803e.mo21443a() + g, PendingIntent.getBroadcast(this.f16799a, 0, intent, 0));
            return;
        }
        C4118a.m28886a("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", mVar);
    }

    public boolean m24439c(Intent intent) {
        return PendingIntent.getBroadcast(this.f16799a, 0, intent, Log.TAG_TDLIB_FILES) != null;
    }

    public C4926a(Context context, AbstractC5179c cVar, AlarmManager alarmManager, AbstractC6045a aVar, AbstractC4934g gVar) {
        this.f16799a = context;
        this.f16800b = cVar;
        this.f16801c = alarmManager;
        this.f16803e = aVar;
        this.f16802d = gVar;
    }
}
