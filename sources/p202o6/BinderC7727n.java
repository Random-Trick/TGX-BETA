package p202o6;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import p300v6.C9865p;

public final class BinderC7727n extends BinderC7717l {
    public BinderC7727n(C7757t tVar, C9865p pVar) {
        super(tVar, pVar);
    }

    @Override
    public final void mo11751z(Bundle bundle, Bundle bundle2) {
        super.mo11751z(bundle, bundle2);
        this.f24741a.m6731e((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
    }
}
