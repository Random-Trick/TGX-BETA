package p255s;

import android.hardware.camera2.CameraCaptureSession;
import java.util.ArrayList;
import java.util.List;
import p336y.AbstractC10234h;
import p336y.C10239i;

public final class C8522m1 {
    public static CameraCaptureSession.CaptureCallback m12243a(AbstractC10234h hVar) {
        if (hVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        m12242b(hVar, arrayList);
        if (arrayList.size() == 1) {
            return (CameraCaptureSession.CaptureCallback) arrayList.get(0);
        }
        return C8511k0.m12248a(arrayList);
    }

    public static void m12242b(AbstractC10234h hVar, List<CameraCaptureSession.CaptureCallback> list) {
        if (hVar instanceof C10239i) {
            for (AbstractC10234h hVar2 : ((C10239i) hVar).m5666d()) {
                m12242b(hVar2, list);
            }
        } else if (hVar instanceof C8518l1) {
            list.add(((C8518l1) hVar).m12244e());
        } else {
            list.add(new C8514k1(hVar));
        }
    }
}
