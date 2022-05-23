package m4;

import android.os.Parcel;
import android.os.Parcelable;
import c5.b0;
import c5.l0;

public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C0153a();
    public final long f17118a;
    public final long f17119b;
    public final byte[] f17120c;

    public class C0153a implements Parcelable.Creator<a> {
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(Parcel parcel, C0153a aVar) {
        this(parcel);
    }

    public static a a(b0 b0Var, int i10, long j10) {
        long F = b0Var.F();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        b0Var.j(bArr, 0, i11);
        return new a(F, bArr, j10);
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f17118a);
        parcel.writeLong(this.f17119b);
        parcel.writeByteArray(this.f17120c);
    }

    public a(long j10, byte[] bArr, long j11) {
        this.f17118a = j11;
        this.f17119b = j10;
        this.f17120c = bArr;
    }

    public a(Parcel parcel) {
        this.f17118a = parcel.readLong();
        this.f17119b = parcel.readLong();
        this.f17120c = (byte[]) l0.j(parcel.createByteArray());
    }
}
