package p249r8;

import java.nio.ByteBuffer;
import p258s2.C8632e;

@AbstractC8385g(tags = {20})
public class C8391m extends AbstractC8380b {
    public int f27256d;

    @Override
    public void mo12589e(ByteBuffer byteBuffer) {
        this.f27256d = C8632e.m11861n(byteBuffer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f27256d == ((C8391m) obj).f27256d;
    }

    public int hashCode() {
        return this.f27256d;
    }

    @Override
    public String toString() {
        return "ProfileLevelIndicationDescriptor{profileLevelIndicationIndex=" + Integer.toHexString(this.f27256d) + '}';
    }
}
