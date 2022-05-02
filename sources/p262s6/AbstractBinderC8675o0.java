package p262s6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class AbstractBinderC8675o0 extends BinderC8655e0 implements AbstractC8677p0 {
    public AbstractBinderC8675o0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    @Override
    public final boolean mo11749q(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                mo11755o1(parcel.readInt(), (Bundle) C8657f0.m11804a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                mo11758j(parcel.readInt(), (Bundle) C8657f0.m11804a(parcel, Bundle.CREATOR));
                return true;
            case 4:
                mo11753v1(parcel.readInt(), (Bundle) C8657f0.m11804a(parcel, Bundle.CREATOR));
                return true;
            case 5:
                mo11762G(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 6:
                Parcelable.Creator creator = Bundle.CREATOR;
                mo11763F1((Bundle) C8657f0.m11804a(parcel, creator), (Bundle) C8657f0.m11804a(parcel, creator));
                return true;
            case 7:
                mo11754p0((Bundle) C8657f0.m11804a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                mo11761M0((Bundle) C8657f0.m11804a(parcel, creator2), (Bundle) C8657f0.m11804a(parcel, creator2));
                return true;
            case 9:
            default:
                return false;
            case 10:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                mo11760W0((Bundle) C8657f0.m11804a(parcel, creator3), (Bundle) C8657f0.m11804a(parcel, creator3));
                return true;
            case 11:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                mo11759h1((Bundle) C8657f0.m11804a(parcel, creator4), (Bundle) C8657f0.m11804a(parcel, creator4));
                return true;
            case 12:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                mo11751z((Bundle) C8657f0.m11804a(parcel, creator5), (Bundle) C8657f0.m11804a(parcel, creator5));
                return true;
            case 13:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                mo11752x0((Bundle) C8657f0.m11804a(parcel, creator6), (Bundle) C8657f0.m11804a(parcel, creator6));
                return true;
            case 14:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                mo11757j0((Bundle) C8657f0.m11804a(parcel, creator7), (Bundle) C8657f0.m11804a(parcel, creator7));
                return true;
            case 15:
                mo11756n((Bundle) C8657f0.m11804a(parcel, Bundle.CREATOR));
                return true;
        }
    }
}
