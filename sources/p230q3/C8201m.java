package p230q3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import p020b5.C1186a;
import p020b5.C1216l0;
import p174m3.C6615i;

public final class C8201m implements Comparator<C8203b>, Parcelable {
    public static final Parcelable.Creator<C8201m> CREATOR = new C8202a();
    public final int f26560M;
    public final C8203b[] f26561a;
    public int f26562b;
    public final String f26563c;

    public class C8202a implements Parcelable.Creator<C8201m> {
        public C8201m createFromParcel(Parcel parcel) {
            return new C8201m(parcel);
        }

        public C8201m[] newArray(int i) {
            return new C8201m[i];
        }
    }

    public static final class C8203b implements Parcelable {
        public static final Parcelable.Creator<C8203b> CREATOR = new C8204a();
        public final String f26564M;
        public final byte[] f26565N;
        public int f26566a;
        public final UUID f26567b;
        public final String f26568c;

        public class C8204a implements Parcelable.Creator<C8203b> {
            public C8203b createFromParcel(Parcel parcel) {
                return new C8203b(parcel);
            }

            public C8203b[] newArray(int i) {
                return new C8203b[i];
            }
        }

        public C8203b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public C8203b m13213a(byte[] bArr) {
            return new C8203b(this.f26567b, this.f26568c, this.f26564M, bArr);
        }

        public boolean m13212b(UUID uuid) {
            return C6615i.f20675a.equals(this.f26567b) || uuid.equals(this.f26567b);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C8203b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            C8203b bVar = (C8203b) obj;
            return C1216l0.m37985c(this.f26568c, bVar.f26568c) && C1216l0.m37985c(this.f26564M, bVar.f26564M) && C1216l0.m37985c(this.f26567b, bVar.f26567b) && Arrays.equals(this.f26565N, bVar.f26565N);
        }

        public int hashCode() {
            if (this.f26566a == 0) {
                int hashCode = this.f26567b.hashCode() * 31;
                String str = this.f26568c;
                this.f26566a = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f26564M.hashCode()) * 31) + Arrays.hashCode(this.f26565N);
            }
            return this.f26566a;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f26567b.getMostSignificantBits());
            parcel.writeLong(this.f26567b.getLeastSignificantBits());
            parcel.writeString(this.f26568c);
            parcel.writeString(this.f26564M);
            parcel.writeByteArray(this.f26565N);
        }

        public C8203b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f26567b = (UUID) C1186a.m38188e(uuid);
            this.f26568c = str;
            this.f26564M = (String) C1186a.m38188e(str2);
            this.f26565N = bArr;
        }

        public C8203b(Parcel parcel) {
            this.f26567b = new UUID(parcel.readLong(), parcel.readLong());
            this.f26568c = parcel.readString();
            this.f26564M = (String) C1216l0.m37971j(parcel.readString());
            this.f26565N = parcel.createByteArray();
        }
    }

    public C8201m(List<C8203b> list) {
        this(null, false, (C8203b[]) list.toArray(new C8203b[0]));
    }

    public int compare(C8203b bVar, C8203b bVar2) {
        UUID uuid = C6615i.f20675a;
        if (uuid.equals(bVar.f26567b)) {
            return uuid.equals(bVar2.f26567b) ? 0 : 1;
        }
        return bVar.f26567b.compareTo(bVar2.f26567b);
    }

    public C8201m m13217b(String str) {
        return C1216l0.m37985c(this.f26563c, str) ? this : new C8201m(str, false, this.f26561a);
    }

    public C8203b m13216c(int i) {
        return this.f26561a[i];
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8201m.class != obj.getClass()) {
            return false;
        }
        C8201m mVar = (C8201m) obj;
        return C1216l0.m37985c(this.f26563c, mVar.f26563c) && Arrays.equals(this.f26561a, mVar.f26561a);
    }

    public int hashCode() {
        if (this.f26562b == 0) {
            String str = this.f26563c;
            this.f26562b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f26561a);
        }
        return this.f26562b;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f26563c);
        parcel.writeTypedArray(this.f26561a, 0);
    }

    public C8201m(C8203b... bVarArr) {
        this(null, bVarArr);
    }

    public C8201m(String str, C8203b... bVarArr) {
        this(str, true, bVarArr);
    }

    public C8201m(String str, boolean z, C8203b... bVarArr) {
        this.f26563c = str;
        bVarArr = z ? (C8203b[]) bVarArr.clone() : bVarArr;
        this.f26561a = bVarArr;
        this.f26560M = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    public C8201m(Parcel parcel) {
        this.f26563c = parcel.readString();
        C8203b[] bVarArr = (C8203b[]) C1216l0.m37971j((C8203b[]) parcel.createTypedArray(C8203b.CREATOR));
        this.f26561a = bVarArr;
        this.f26560M = bVarArr.length;
    }
}
