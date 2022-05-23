package t6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class o0 extends e0 implements p0 {
    public o0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    @Override
    public final boolean q(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 2:
                o1(parcel.readInt(), (Bundle) f0.a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                j(parcel.readInt(), (Bundle) f0.a(parcel, Bundle.CREATOR));
                return true;
            case 4:
                v1(parcel.readInt(), (Bundle) f0.a(parcel, Bundle.CREATOR));
                return true;
            case 5:
                F(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 6:
                Parcelable.Creator creator = Bundle.CREATOR;
                D1((Bundle) f0.a(parcel, creator), (Bundle) f0.a(parcel, creator));
                return true;
            case 7:
                r0((Bundle) f0.a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                J0((Bundle) f0.a(parcel, creator2), (Bundle) f0.a(parcel, creator2));
                return true;
            case 9:
            default:
                return false;
            case 10:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                W0((Bundle) f0.a(parcel, creator3), (Bundle) f0.a(parcel, creator3));
                return true;
            case 11:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                h1((Bundle) f0.a(parcel, creator4), (Bundle) f0.a(parcel, creator4));
                return true;
            case 12:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                y((Bundle) f0.a(parcel, creator5), (Bundle) f0.a(parcel, creator5));
                return true;
            case 13:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                A0((Bundle) f0.a(parcel, creator6), (Bundle) f0.a(parcel, creator6));
                return true;
            case 14:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                m0((Bundle) f0.a(parcel, creator7), (Bundle) f0.a(parcel, creator7));
                return true;
            case 15:
                n((Bundle) f0.a(parcel, Bundle.CREATOR));
                return true;
        }
    }
}
