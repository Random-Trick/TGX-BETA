package p202o6;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import org.thunderdog.challegram.Log;
import p262s6.AbstractC8689y;
import p262s6.C8646a;
import p262s6.C8686v;

public final class C7790z2 {
    public static final C8646a f24967c = new C8646a("PatchSliceTaskHandler");
    public final C7688f0 f24968a;
    public final AbstractC8689y f24969b;

    public C7790z2(C7688f0 f0Var, AbstractC8689y yVar) {
        this.f24968a = f0Var;
        this.f24969b = yVar;
    }

    public final void m15081a(C7785y2 y2Var) {
        File u = this.f24968a.m15231u(y2Var.f24579b, y2Var.f24910c, y2Var.f24911d);
        File file = new File(this.f24968a.m15230v(y2Var.f24579b, y2Var.f24910c, y2Var.f24911d), y2Var.f24915h);
        try {
            InputStream inputStream = y2Var.f24917j;
            if (y2Var.f24914g == 2) {
                inputStream = new GZIPInputStream(inputStream, Log.TAG_LUX);
            }
            C7703i0 i0Var = new C7703i0(u, file);
            File C = this.f24968a.m15259C(y2Var.f24579b, y2Var.f24912e, y2Var.f24913f, y2Var.f24915h);
            if (!C.exists()) {
                C.mkdirs();
            }
            C7696g3 g3Var = new C7696g3(this.f24968a, y2Var.f24579b, y2Var.f24912e, y2Var.f24913f, y2Var.f24915h);
            C8686v.m11738a(i0Var, inputStream, new C7709j1(C, g3Var), y2Var.f24916i);
            g3Var.m15217i(0);
            inputStream.close();
            f24967c.m11815d("Patching and extraction finished for slice %s of pack %s.", y2Var.f24915h, y2Var.f24579b);
            ((AbstractC7680d4) this.f24969b.zza()).mo15139c(y2Var.f24578a, y2Var.f24579b, y2Var.f24915h, 0);
            try {
                y2Var.f24917j.close();
            } catch (IOException unused) {
                f24967c.m11814e("Could not close file for slice %s of pack %s.", y2Var.f24915h, y2Var.f24579b);
            }
        } catch (IOException e) {
            f24967c.m11817b("IOException during patching %s.", e.getMessage());
            throw new C7694g1(String.format("Error patching slice %s of pack %s.", y2Var.f24915h, y2Var.f24579b), e, y2Var.f24578a);
        }
    }
}
