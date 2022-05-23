package k4;

import android.os.Parcel;
import android.os.Parcelable;
import c5.l0;
import java.util.Arrays;

public final class b extends i {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final byte[] f15632b;

    public class a implements Parcelable.Creator<b> {
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(String str, byte[] bArr) {
        super(str);
        this.f15632b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f15647a.equals(bVar.f15647a) && Arrays.equals(this.f15632b, bVar.f15632b);
    }

    public int hashCode() {
        return ((527 + this.f15647a.hashCode()) * 31) + Arrays.hashCode(this.f15632b);
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15647a);
        parcel.writeByteArray(this.f15632b);
    }

    public b(Parcel parcel) {
        super((String) l0.j(parcel.readString()));
        this.f15632b = (byte[]) l0.j(parcel.createByteArray());
    }
}
