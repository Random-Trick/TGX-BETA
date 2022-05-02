package p249r8;

import java.nio.ByteBuffer;
import java.util.logging.Logger;
import org.thunderdog.challegram.Log;
import p039d.C3563j;
import p258s2.C8630c;

@AbstractC8385g(tags = {19, 106, 107, 108, 109, 110, 111, 112, 113, C3563j.f11927F0, C3563j.f11932G0, C3563j.f11937H0, C3563j.f11942I0, C3563j.f11947J0, C3563j.f11952K0, C3563j.f11957L0, C3563j.f11962M0, C3563j.f11967N0, C3563j.f11972O0, C3563j.f11977P0, 125, 126, 127, Log.TAG_YOUTUBE, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253})
public class C8387i extends AbstractC8380b {
    public static Logger f27251e = Logger.getLogger(C8387i.class.getName());
    public byte[] f27252d;

    @Override
    public void mo12589e(ByteBuffer byteBuffer) {
        if (m12636a() > 0) {
            byte[] bArr = new byte[this.f27217b];
            this.f27252d = bArr;
            byteBuffer.get(bArr);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ExtensionDescriptor");
        sb2.append("{bytes=");
        byte[] bArr = this.f27252d;
        sb2.append(bArr == null ? "null" : C8630c.m11879b(bArr));
        sb2.append('}');
        return sb2.toString();
    }
}
