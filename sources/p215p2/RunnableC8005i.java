package p215p2;

import androidx.work.WorkerParameters;
import p087g2.C4458i;

public class RunnableC8005i implements Runnable {
    public C4458i f26059a;
    public String f26060b;
    public WorkerParameters.C1065a f26061c;

    public RunnableC8005i(C4458i iVar, String str, WorkerParameters.C1065a aVar) {
        this.f26059a = iVar;
        this.f26060b = str;
        this.f26061c = aVar;
    }

    @Override
    public void run() {
        this.f26059a.m27589q().m27630k(this.f26060b, this.f26061c);
    }
}
