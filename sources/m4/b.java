package m4;

import f4.a;
import m3.c2;
import m3.q1;

public abstract class b implements a.b {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public byte[] getWrappedMetadataBytes() {
        return f4.b.a(this);
    }

    @Override
    public q1 getWrappedMetadataFormat() {
        return f4.b.b(this);
    }

    @Override
    public void populateMediaMetadata(c2.b bVar) {
        f4.b.c(this, bVar);
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        return simpleName.length() != 0 ? "SCTE-35 splice command: type=".concat(simpleName) : new String("SCTE-35 splice command: type=");
    }
}
