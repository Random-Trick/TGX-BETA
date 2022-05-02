package p215p2;

import androidx.work.WorkerParameters;
import p087g2.C4458i;

public class RunnableC8005i implements Runnable {
    public C4458i f26062a;
    public String f26063b;
    public WorkerParameters.C1065a f26064c;

    public RunnableC8005i(C4458i iVar, String str, WorkerParameters.C1065a aVar) {
        this.f26062a = iVar;
        this.f26063b = str;
        this.f26064c = aVar;
    }

    @Override
    public void run() {
        this.f26062a.m27591q().m27632k(this.f26063b, this.f26064c);
    }
}
