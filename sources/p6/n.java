package p6;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import w6.p;

public final class n extends l {
    public n(t tVar, p pVar) {
        super(tVar, pVar);
    }

    @Override
    public final void y(Bundle bundle, Bundle bundle2) {
        super.y(bundle, bundle2);
        this.f20698a.e((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
    }
}
