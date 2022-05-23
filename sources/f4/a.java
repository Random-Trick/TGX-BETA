package f4;

import android.os.Parcel;
import android.os.Parcelable;
import c5.l0;
import java.util.Arrays;
import java.util.List;
import m3.c2;
import m3.q1;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0102a();
    public final b[] f11847a;

    public class C0102a implements Parcelable.Creator<a> {
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public interface b extends Parcelable {
        byte[] getWrappedMetadataBytes();

        q1 getWrappedMetadataFormat();

        void populateMediaMetadata(c2.b bVar);
    }

    public a(b... bVarArr) {
        this.f11847a = bVarArr;
    }

    public a a(b... bVarArr) {
        return bVarArr.length == 0 ? this : new a((b[]) l0.u0(this.f11847a, bVarArr));
    }

    public a b(a aVar) {
        return aVar == null ? this : a(aVar.f11847a);
    }

    public b c(int i10) {
        return this.f11847a[i10];
    }

    public int d() {
        return this.f11847a.length;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f11847a, ((a) obj).f11847a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f11847a);
    }

    public String toString() {
        String valueOf = String.valueOf(Arrays.toString(this.f11847a));
        return valueOf.length() != 0 ? "entries=".concat(valueOf) : new String("entries=");
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f11847a.length);
        for (b bVar : this.f11847a) {
            parcel.writeParcelable(bVar, 0);
        }
    }

    public a(List<? extends b> list) {
        this.f11847a = (b[]) list.toArray(new b[0]);
    }

    public a(Parcel parcel) {
        this.f11847a = new b[parcel.readInt()];
        int i10 = 0;
        while (true) {
            b[] bVarArr = this.f11847a;
            if (i10 < bVarArr.length) {
                bVarArr[i10] = (b) parcel.readParcelable(b.class.getClassLoader());
                i10++;
            } else {
                return;
            }
        }
    }
}
