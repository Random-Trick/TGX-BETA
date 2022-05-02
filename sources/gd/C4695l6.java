package gd;

import java.io.File;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p350yd.C10930q6;

public class C4695l6 {
    public final C10930q6.C10942l f15749a;
    public File f15750b;
    public final int f15751c;
    public byte[] f15752d;
    public final C4812v2 f15753e;

    public C4695l6(C10930q6 q6Var, C10930q6.C10942l lVar, int i, byte[] bArr) {
        this.f15749a = lVar;
        this.f15750b = new File(lVar.f35160c);
        this.f15751c = i;
        this.f15753e = new C4812v2(q6Var, this);
        this.f15752d = bArr;
    }

    public void m26474a() {
        File file = this.f15750b;
        if (file != null && file.delete()) {
            this.f15750b = null;
        }
    }

    public C4812v2 m26473b() {
        return this.f15753e;
    }

    public int m26472c() {
        return this.f15751c;
    }

    public File m26471d() {
        return this.f15750b;
    }

    public int m26470e() {
        return this.f15749a.f35159b.f25373id;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof C4695l6) && ((C4695l6) obj).f15749a == this.f15749a;
    }

    public String m26469f() {
        return this.f15750b.getPath();
    }

    public byte[] m26468g() {
        return this.f15752d;
    }

    public void m26467h(byte[] bArr) {
        this.f15752d = bArr;
        this.f15753e.m25196j(bArr);
    }

    public TdApi.InputFile m26466i() {
        return new TdApi.InputFileId(this.f15749a.f35159b.f25373id);
    }
}
