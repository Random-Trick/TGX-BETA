package p175m4;

import android.os.Parcel;
import android.os.Parcelable;
import p020b5.C1189b0;
import p020b5.C1216l0;

public final class C6734a extends AbstractC6736b {
    public static final Parcelable.Creator<C6734a> CREATOR = new C6735a();
    public final long f21187a;
    public final long f21188b;
    public final byte[] f21189c;

    public class C6735a implements Parcelable.Creator<C6734a> {
        public C6734a createFromParcel(Parcel parcel) {
            return new C6734a(parcel, null);
        }

        public C6734a[] newArray(int i) {
            return new C6734a[i];
        }
    }

    public C6734a(Parcel parcel, C6735a aVar) {
        this(parcel);
    }

    public static C6734a m19179a(C1189b0 b0Var, int i, long j) {
        long F = b0Var.m38157F();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        b0Var.m38136j(bArr, 0, i2);
        return new C6734a(F, bArr, j);
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f21187a);
        parcel.writeLong(this.f21188b);
        parcel.writeByteArray(this.f21189c);
    }

    public C6734a(long j, byte[] bArr, long j2) {
        this.f21187a = j2;
        this.f21188b = j;
        this.f21189c = bArr;
    }

    public C6734a(Parcel parcel) {
        this.f21187a = parcel.readLong();
        this.f21188b = parcel.readLong();
        this.f21189c = (byte[]) C1216l0.m37971j(parcel.createByteArray());
    }
}
