package p0;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Set;
import p0.h;

public class j {
    public static final Object f20349a = new Object();
    public static final Object f20350b = new Object();

    public static Bundle a(h.a aVar) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat d10 = aVar.d();
        bundle2.putInt("icon", d10 != null ? d10.f() : 0);
        bundle2.putCharSequence("title", aVar.h());
        bundle2.putParcelable("actionIntent", aVar.a());
        if (aVar.c() != null) {
            bundle = new Bundle(aVar.c());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle2.putBoolean("showsUserInterface", aVar.g());
        bundle2.putInt("semanticAction", aVar.f());
        return bundle2;
    }

    public static Bundle b(m mVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", mVar.i());
        bundle.putCharSequence("label", mVar.h());
        bundle.putCharSequenceArray("choices", mVar.e());
        bundle.putBoolean("allowFreeFormInput", mVar.c());
        bundle.putBundle("extras", mVar.g());
        Set<String> d10 = mVar.d();
        if (d10 != null && !d10.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(d10.size());
            for (String str : d10) {
                arrayList.add(str);
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    public static Bundle[] c(m[] mVarArr) {
        if (mVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[mVarArr.length];
        for (int i10 = 0; i10 < mVarArr.length; i10++) {
            bundleArr[i10] = b(mVarArr[i10]);
        }
        return bundleArr;
    }
}
