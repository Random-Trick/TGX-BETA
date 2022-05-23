package p6;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import t6.a;

public final class k3 {
    public static final a f20696b = new a("VerifySliceTaskHandler");
    public final f0 f20697a;

    public k3(f0 f0Var) {
        this.f20697a = f0Var;
    }

    public final void a(j3 j3Var) {
        File C = this.f20697a.C(j3Var.f20556b, j3Var.f20678c, j3Var.f20679d, j3Var.f20680e);
        if (C.exists()) {
            b(j3Var, C);
            File D = this.f20697a.D(j3Var.f20556b, j3Var.f20678c, j3Var.f20679d, j3Var.f20680e);
            if (!D.exists()) {
                D.mkdirs();
            }
            if (!C.renameTo(D)) {
                throw new g1(String.format("Failed to move slice %s after verification.", j3Var.f20680e), j3Var.f20555a);
            }
            return;
        }
        throw new g1(String.format("Cannot find unverified files for slice %s.", j3Var.f20680e), j3Var.f20555a);
    }

    public final void b(j3 j3Var, File file) {
        try {
            File B = this.f20697a.B(j3Var.f20556b, j3Var.f20678c, j3Var.f20679d, j3Var.f20680e);
            if (B.exists()) {
                try {
                    if (j2.a(i3.a(file, B)).equals(j3Var.f20681f)) {
                        f20696b.d("Verification of slice %s of pack %s successful.", j3Var.f20680e, j3Var.f20556b);
                        return;
                    }
                    throw new g1(String.format("Verification failed for slice %s.", j3Var.f20680e), j3Var.f20555a);
                } catch (IOException e10) {
                    throw new g1(String.format("Could not digest file during verification for slice %s.", j3Var.f20680e), e10, j3Var.f20555a);
                } catch (NoSuchAlgorithmException e11) {
                    throw new g1("SHA256 algorithm not supported.", e11, j3Var.f20555a);
                }
            } else {
                throw new g1(String.format("Cannot find metadata files for slice %s.", j3Var.f20680e), j3Var.f20555a);
            }
        } catch (IOException e12) {
            throw new g1(String.format("Could not reconstruct slice archive during verification for slice %s.", j3Var.f20680e), e12, j3Var.f20555a);
        }
    }
}
