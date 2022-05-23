package p2;

import androidx.work.WorkerParameters;

public class i implements Runnable {
    public g2.i f20426a;
    public String f20427b;
    public WorkerParameters.a f20428c;

    public i(g2.i iVar, String str, WorkerParameters.a aVar) {
        this.f20426a = iVar;
        this.f20427b = str;
        this.f20428c = aVar;
    }

    @Override
    public void run() {
        this.f20426a.q().k(this.f20427b, this.f20428c);
    }
}
