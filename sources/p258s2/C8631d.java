package p258s2;

import com.coremedia.iso.boxes.MovieBox;
import com.googlecode.mp4parser.AbstractC3539a;
import com.googlecode.mp4parser.BasicContainer;
import java.io.UnsupportedEncodingException;
import p269t2.AbstractC8950a;
import p345y8.AbstractC10452f;

public class C8631d extends BasicContainer {
    public static AbstractC10452f f27949a = AbstractC10452f.m5099a(C8631d.class);

    public C8631d(AbstractC3539a aVar) {
        this(aVar, new C8636i(new String[0]));
    }

    public static String m11877m(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        if (bArr != null) {
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, 4));
        }
        try {
            return new String(bArr2, "ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new Error("Required character encoding is missing", e);
        }
    }

    public static byte[] m11876t(String str) {
        byte[] bArr = new byte[4];
        if (str != null) {
            for (int i = 0; i < Math.min(4, str.length()); i++) {
                bArr[i] = (byte) str.charAt(i);
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

    public MovieBox m11875y0() {
        for (AbstractC8950a aVar : getBoxes()) {
            if (aVar instanceof MovieBox) {
                return (MovieBox) aVar;
            }
        }
        return null;
    }

    public C8631d(AbstractC3539a aVar, AbstractC8629b bVar) {
        initContainer(aVar, aVar.size(), bVar);
    }
}
