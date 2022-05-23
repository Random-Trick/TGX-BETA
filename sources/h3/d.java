package h3;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import b3.m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import i3.c;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import l3.a;

public class d implements r {
    public final Context f12470a;
    public final c f12471b;
    public final f f12472c;

    public d(Context context, c cVar, f fVar) {
        this.f12470a = context;
        this.f12471b = cVar;
        this.f12472c = fVar;
    }

    @Override
    public void a(m mVar, int i10) {
        b(mVar, i10, false);
    }

    @Override
    public void b(m mVar, int i10, boolean z10) {
        ComponentName componentName = new ComponentName(this.f12470a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f12470a.getSystemService("jobscheduler");
        int c10 = c(mVar);
        if (z10 || !d(jobScheduler, c10, i10)) {
            long x10 = this.f12471b.x(mVar);
            JobInfo.Builder c11 = this.f12472c.c(new JobInfo.Builder(c10, componentName), mVar.d(), x10, i10);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i10);
            persistableBundle.putString("backendName", mVar.b());
            persistableBundle.putInt("priority", a.a(mVar.d()));
            if (mVar.c() != null) {
                persistableBundle.putString("extras", Base64.encodeToString(mVar.c(), 0));
            }
            c11.setExtras(persistableBundle);
            e3.a.b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", mVar, Integer.valueOf(c10), Long.valueOf(this.f12472c.g(mVar.d(), x10, i10)), Long.valueOf(x10), Integer.valueOf(i10));
            jobScheduler.schedule(c11.build());
            return;
        }
        e3.a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", mVar);
    }

    public int c(m mVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f12470a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(mVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(a.a(mVar.d())).array());
        if (mVar.c() != null) {
            adler32.update(mVar.c());
        }
        return (int) adler32.getValue();
    }

    public final boolean d(JobScheduler jobScheduler, int i10, int i11) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i12 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i10) {
                return i12 >= i11;
            }
        }
        return false;
    }
}
