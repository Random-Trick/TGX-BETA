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
    public static final C8646a f24970c = new C8646a("PatchSliceTaskHandler");
    public final C7688f0 f24971a;
    public final AbstractC8689y f24972b;

    public C7790z2(C7688f0 f0Var, AbstractC8689y yVar) {
        this.f24971a = f0Var;
        this.f24972b = yVar;
    }

    public final void m15081a(C7785y2 y2Var) {
        File u = this.f24971a.m15231u(y2Var.f24582b, y2Var.f24913c, y2Var.f24914d);
        File file = new File(this.f24971a.m15230v(y2Var.f24582b, y2Var.f24913c, y2Var.f24914d), y2Var.f24918h);
        try {
            InputStream inputStream = y2Var.f24920j;
            if (y2Var.f24917g == 2) {
                inputStream = new GZIPInputStream(inputStream, Log.TAG_LUX);
            }
            C7703i0 i0Var = new C7703i0(u, file);
            File C = this.f24971a.m15259C(y2Var.f24582b, y2Var.f24915e, y2Var.f24916f, y2Var.f24918h);
            if (!C.exists()) {
                C.mkdirs();
            }
            C7696g3 g3Var = new C7696g3(this.f24971a, y2Var.f24582b, y2Var.f24915e, y2Var.f24916f, y2Var.f24918h);
            C8686v.m11737a(i0Var, inputStream, new C7709j1(C, g3Var), y2Var.f24919i);
            g3Var.m15217i(0);
            inputStream.close();
            f24970c.m11814d("Patching and extraction finished for slice %s of pack %s.", y2Var.f24918h, y2Var.f24582b);
            ((AbstractC7680d4) this.f24972b.zza()).mo15139c(y2Var.f24581a, y2Var.f24582b, y2Var.f24918h, 0);
            try {
                y2Var.f24920j.close();
            } catch (IOException unused) {
                f24970c.m11813e("Could not close file for slice %s of pack %s.", y2Var.f24918h, y2Var.f24582b);
            }
        } catch (IOException e) {
            f24970c.m11816b("IOException during patching %s.", e.getMessage());
            throw new C7694g1(String.format("Error patching slice %s of pack %s.", y2Var.f24918h, y2Var.f24582b), e, y2Var.f24581a);
        }
    }
}
