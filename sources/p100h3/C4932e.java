package p100h3;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import p018b3.AbstractC1159m;
import p058e3.C4118a;
import p116i3.AbstractC5179c;
import p161l3.C6307a;

public class C4932e implements AbstractC4950s {
    public final Context f16813a;
    public final AbstractC5179c f16814b;
    public final AbstractC4934g f16815c;

    public C4932e(Context context, AbstractC5179c cVar, AbstractC4934g gVar) {
        this.f16813a = context;
        this.f16814b = cVar;
        this.f16815c = gVar;
    }

    @Override
    public void mo24392a(AbstractC1159m mVar, int i) {
        mo24391b(mVar, i, false);
    }

    @Override
    public void mo24391b(AbstractC1159m mVar, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.f16813a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f16813a.getSystemService("jobscheduler");
        int c = m24437c(mVar);
        if (z || !m24436d(jobScheduler, c, i)) {
            long y = this.f16814b.mo23668y(mVar);
            JobInfo.Builder c2 = this.f16815c.m24433c(new JobInfo.Builder(c, componentName), mVar.mo38261d(), y, i);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", mVar.mo38263b());
            persistableBundle.putInt("priority", C6307a.m20688a(mVar.mo38261d()));
            if (mVar.mo38262c() != null) {
                persistableBundle.putString("extras", Base64.encodeToString(mVar.mo38262c(), 0));
            }
            c2.setExtras(persistableBundle);
            C4118a.m28883b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", mVar, Integer.valueOf(c), Long.valueOf(this.f16815c.m24429g(mVar.mo38261d(), y, i)), Long.valueOf(y), Integer.valueOf(i));
            jobScheduler.schedule(c2.build());
            return;
        }
        C4118a.m28884a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", mVar);
    }

    public int m24437c(AbstractC1159m mVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f16813a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(mVar.mo38263b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(C6307a.m20688a(mVar.mo38261d())).array());
        if (mVar.mo38262c() != null) {
            adler32.update(mVar.mo38262c());
        }
        return (int) adler32.getValue();
    }

    public final boolean m24436d(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i3 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i) {
                return i3 >= i2;
            }
        }
        return false;
    }
}
