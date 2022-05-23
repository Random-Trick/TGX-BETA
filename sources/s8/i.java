package s8;

import d.j;
import java.nio.ByteBuffer;
import java.util.logging.Logger;
import org.thunderdog.challegram.Log;
import s2.c;

@g(tags = {19, 106, 107, 108, 109, 110, 111, 112, 113, j.F0, j.G0, j.H0, j.I0, j.J0, j.K0, j.L0, j.M0, j.N0, j.O0, j.P0, 125, 126, 127, Log.TAG_YOUTUBE, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253})
public class i extends b {
    public static Logger f22618e = Logger.getLogger(i.class.getName());
    public byte[] f22619d;

    @Override
    public void e(ByteBuffer byteBuffer) {
        if (a() > 0) {
            byte[] bArr = new byte[this.f22584b];
            this.f22619d = bArr;
            byteBuffer.get(bArr);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ExtensionDescriptor");
        sb2.append("{bytes=");
        byte[] bArr = this.f22619d;
        sb2.append(bArr == null ? "null" : c.b(bArr));
        sb2.append('}');
        return sb2.toString();
    }
}
