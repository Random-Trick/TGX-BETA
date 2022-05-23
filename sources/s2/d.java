package s2;

import com.coremedia.iso.boxes.MovieBox;
import com.googlecode.mp4parser.BasicContainer;
import com.googlecode.mp4parser.a;
import java.io.UnsupportedEncodingException;
import z8.f;

public class d extends BasicContainer {
    public static f f22462a = f.a(d.class);

    public d(a aVar) {
        this(aVar, new i(new String[0]));
    }

    public static String m(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        if (bArr != null) {
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, 4));
        }
        try {
            return new String(bArr2, "ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new Error("Required character encoding is missing", e10);
        }
    }

    public static byte[] s(String str) {
        byte[] bArr = new byte[4];
        if (str != null) {
            for (int i10 = 0; i10 < Math.min(4, str.length()); i10++) {
                bArr[i10] = (byte) str.charAt(i10);
            }
        }
        return bArr;
    }

    @Override
    public void close() {
        this.dataSource.close();
    }

    @Override
    public String toString() {
        return "model(" + this.dataSource.toString() + ")";
    }

    public MovieBox y0() {
        for (t2.a aVar : getBoxes()) {
            if (aVar instanceof MovieBox) {
                return (MovieBox) aVar;
            }
        }
        return null;
    }

    public d(a aVar, b bVar) {
        initContainer(aVar, aVar.size(), bVar);
    }
}
