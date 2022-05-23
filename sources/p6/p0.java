package p6;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import t6.y;
import w6.g;

public final class p0 {
    public final y f20738a;

    public p0(y yVar) {
        this.f20738a = yVar;
    }

    public final InputStream a(int i10, String str, String str2, int i11) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) g.a(((d4) this.f20738a.zza()).b(i10, str, str2, i11));
            if (parcelFileDescriptor != null && parcelFileDescriptor.getFileDescriptor() != null) {
                return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
            }
            throw new g1(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i10), str, str2, Integer.valueOf(i11)), i10);
        } catch (InterruptedException e10) {
            throw new g1("Extractor was interrupted while waiting for chunk file.", e10, i10);
        } catch (ExecutionException e11) {
            throw new g1(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i10), str, str2, Integer.valueOf(i11)), e11, i10);
        }
    }
}
