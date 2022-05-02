package p147k4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p020b5.C1216l0;

public final class C6055b extends AbstractC6069i {
    public static final Parcelable.Creator<C6055b> CREATOR = new C6056a();
    public final byte[] f19264b;

    public class C6056a implements Parcelable.Creator<C6055b> {
        public C6055b createFromParcel(Parcel parcel) {
            return new C6055b(parcel);
        }

        public C6055b[] newArray(int i) {
            return new C6055b[i];
        }
    }

    public C6055b(String str, byte[] bArr) {
        super(str);
        this.f19264b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6055b.class != obj.getClass()) {
            return false;
        }
        C6055b bVar = (C6055b) obj;
        return this.f19289a.equals(bVar.f19289a) && Arrays.equals(this.f19264b, bVar.f19264b);
    }

    public int hashCode() {
        return ((527 + this.f19289a.hashCode()) * 31) + Arrays.hashCode(this.f19264b);
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19289a);
        parcel.writeByteArray(this.f19264b);
    }

    public C6055b(Parcel parcel) {
        super((String) C1216l0.m37971j(parcel.readString()));
        this.f19264b = (byte[]) C1216l0.m37971j(parcel.createByteArray());
    }
}
