package p175m4;

import p073f4.C4260a;
import p073f4.C4263b;
import p174m3.C6600g1;
import p174m3.C6693s1;

public abstract class AbstractC6736b implements C4260a.AbstractC4262b {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public byte[] getWrappedMetadataBytes() {
        return C4263b.m28326a(this);
    }

    @Override
    public C6600g1 getWrappedMetadataFormat() {
        return C4263b.m28325b(this);
    }

    @Override
    public void populateMediaMetadata(C6693s1.C6695b bVar) {
        C4263b.m28324c(this, bVar);
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        return simpleName.length() != 0 ? "SCTE-35 splice command: type=".concat(simpleName) : new String("SCTE-35 splice command: type=");
    }
}
