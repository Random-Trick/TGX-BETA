package p202o6;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import p262s6.C8646a;

public final class C7716k3 {
    public static final C8646a f24742b = new C8646a("VerifySliceTaskHandler");
    public final C7688f0 f24743a;

    public C7716k3(C7688f0 f0Var) {
        this.f24743a = f0Var;
    }

    public final void m15182a(C7711j3 j3Var) {
        File C = this.f24743a.m15259C(j3Var.f24582b, j3Var.f24724c, j3Var.f24725d, j3Var.f24726e);
        if (C.exists()) {
            m15181b(j3Var, C);
            File D = this.f24743a.m15258D(j3Var.f24582b, j3Var.f24724c, j3Var.f24725d, j3Var.f24726e);
            if (!D.exists()) {
                D.mkdirs();
            }
            if (!C.renameTo(D)) {
                throw new C7694g1(String.format("Failed to move slice %s after verification.", j3Var.f24726e), j3Var.f24581a);
            }
            return;
        }
        throw new C7694g1(String.format("Cannot find unverified files for slice %s.", j3Var.f24726e), j3Var.f24581a);
    }

    public final void m15181b(C7711j3 j3Var, File file) {
        try {
            File B = this.f24743a.m15260B(j3Var.f24582b, j3Var.f24724c, j3Var.f24725d, j3Var.f24726e);
            if (B.exists()) {
                try {
                    if (C7710j2.m15196a(C7706i3.m15201a(file, B)).equals(j3Var.f24727f)) {
                        f24742b.m11814d("Verification of slice %s of pack %s successful.", j3Var.f24726e, j3Var.f24582b);
                        return;
                    }
                    throw new C7694g1(String.format("Verification failed for slice %s.", j3Var.f24726e), j3Var.f24581a);
                } catch (IOException e) {
                    throw new C7694g1(String.format("Could not digest file during verification for slice %s.", j3Var.f24726e), e, j3Var.f24581a);
                } catch (NoSuchAlgorithmException e2) {
                    throw new C7694g1("SHA256 algorithm not supported.", e2, j3Var.f24581a);
                }
            } else {
                throw new C7694g1(String.format("Cannot find metadata files for slice %s.", j3Var.f24726e), j3Var.f24581a);
            }
        } catch (IOException e3) {
            throw new C7694g1(String.format("Could not reconstruct slice archive during verification for slice %s.", j3Var.f24726e), e3, j3Var.f24581a);
        }
    }
}
