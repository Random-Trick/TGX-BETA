package hd;

import java.io.File;
import org.drinkless.td.libcore.telegram.TdApi;
import zd.o6;

public class l6 {
    public final o6.l f13225a;
    public File f13226b;
    public final int f13227c;
    public byte[] f13228d;
    public final v2 f13229e;

    public l6(o6 o6Var, o6.l lVar, int i10, byte[] bArr) {
        this.f13225a = lVar;
        this.f13226b = new File(lVar.f28149c);
        this.f13227c = i10;
        this.f13229e = new v2(o6Var, this);
        this.f13228d = bArr;
    }

    public void a() {
        File file = this.f13226b;
        if (file != null && file.delete()) {
            this.f13226b = null;
        }
    }

    public v2 b() {
        return this.f13229e;
    }

    public int c() {
        return this.f13227c;
    }

    public File d() {
        return this.f13226b;
    }

    public int e() {
        return this.f13225a.f28148b.f19913id;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof l6) && ((l6) obj).f13225a == this.f13225a;
    }

    public String f() {
        return this.f13226b.getPath();
    }

    public byte[] g() {
        return this.f13228d;
    }

    public void h(byte[] bArr) {
        this.f13228d = bArr;
        this.f13229e.j(bArr);
    }

    public TdApi.InputFile i() {
        return new TdApi.InputFileId(this.f13225a.f28148b.f19913id);
    }
}
