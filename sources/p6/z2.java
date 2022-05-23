package p6;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import org.thunderdog.challegram.Log;
import t6.a;
import t6.v;
import t6.y;

public final class z2 {
    public static final a f20918c = new a("PatchSliceTaskHandler");
    public final f0 f20919a;
    public final y f20920b;

    public z2(f0 f0Var, y yVar) {
        this.f20919a = f0Var;
        this.f20920b = yVar;
    }

    public final void a(y2 y2Var) {
        File u10 = this.f20919a.u(y2Var.f20556b, y2Var.f20865c, y2Var.f20866d);
        File file = new File(this.f20919a.v(y2Var.f20556b, y2Var.f20865c, y2Var.f20866d), y2Var.f20870h);
        try {
            InputStream inputStream = y2Var.f20872j;
            if (y2Var.f20869g == 2) {
                inputStream = new GZIPInputStream(inputStream, Log.TAG_LUX);
            }
            i0 i0Var = new i0(u10, file);
            File C = this.f20919a.C(y2Var.f20556b, y2Var.f20867e, y2Var.f20868f, y2Var.f20870h);
            if (!C.exists()) {
                C.mkdirs();
            }
            g3 g3Var = new g3(this.f20919a, y2Var.f20556b, y2Var.f20867e, y2Var.f20868f, y2Var.f20870h);
            v.a(i0Var, inputStream, new j1(C, g3Var), y2Var.f20871i);
            g3Var.i(0);
            inputStream.close();
            f20918c.d("Patching and extraction finished for slice %s of pack %s.", y2Var.f20870h, y2Var.f20556b);
            ((d4) this.f20920b.zza()).c(y2Var.f20555a, y2Var.f20556b, y2Var.f20870h, 0);
            try {
                y2Var.f20872j.close();
            } catch (IOException unused) {
                f20918c.e("Could not close file for slice %s of pack %s.", y2Var.f20870h, y2Var.f20556b);
            }
        } catch (IOException e10) {
            f20918c.b("IOException during patching %s.", e10.getMessage());
            throw new g1(String.format("Error patching slice %s of pack %s.", y2Var.f20870h, y2Var.f20556b), e10, y2Var.f20555a);
        }
    }
}
