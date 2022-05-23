package ob;

import ib.i;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import ra.k;

public final class c {
    public static final int a(TdApi.JsonValue jsonValue) {
        if (jsonValue instanceof TdApi.JsonValueNumber) {
            return (int) ((TdApi.JsonValueNumber) jsonValue).value;
        }
        if (jsonValue instanceof TdApi.JsonValueString) {
            return i.u(((TdApi.JsonValueString) jsonValue).value, 0, 2, null);
        }
        return 0;
    }

    public static final Map<String, TdApi.JsonValue> b(TdApi.JsonValue jsonValue) {
        if (!(jsonValue instanceof TdApi.JsonValueObject)) {
            return null;
        }
        TdApi.JsonValueObject jsonValueObject = (TdApi.JsonValueObject) jsonValue;
        HashMap hashMap = new HashMap(jsonValueObject.members.length);
        TdApi.JsonObjectMember[] jsonObjectMemberArr = jsonValueObject.members;
        k.d(jsonObjectMemberArr, "json.members");
        for (TdApi.JsonObjectMember jsonObjectMember : jsonObjectMemberArr) {
            String str = jsonObjectMember.key;
            k.d(str, "member.key");
            TdApi.JsonValue jsonValue2 = jsonObjectMember.value;
            k.d(jsonValue2, "member.value");
            hashMap.put(str, jsonValue2);
        }
        return hashMap;
    }

    public static final String c(TdApi.JsonValue jsonValue) {
        if (jsonValue instanceof TdApi.JsonValueString) {
            return ((TdApi.JsonValueString) jsonValue).value;
        }
        return null;
    }

    public static final TdApi.JsonValue d(String str) {
        if (i.i(str)) {
            return null;
        }
        TdApi.Object e10 = Client.e(new TdApi.GetJsonValue(str));
        if (e10 instanceof TdApi.JsonValue) {
            return (TdApi.JsonValue) e10;
        }
        return null;
    }

    public static final String e(List<? extends TdApi.JsonObjectMember> list) {
        k.e(list, "members");
        return f(g(list));
    }

    public static final String f(TdApi.JsonValue jsonValue) {
        k.e(jsonValue, "obj");
        TdApi.Object e10 = Client.e(new TdApi.GetJsonString(jsonValue));
        if (e10 instanceof TdApi.Text) {
            return ((TdApi.Text) e10).text;
        }
        return null;
    }

    public static final TdApi.JsonValueObject g(List<? extends TdApi.JsonObjectMember> list) {
        k.e(list, "members");
        Object[] array = list.toArray(new TdApi.JsonObjectMember[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return new TdApi.JsonValueObject((TdApi.JsonObjectMember[]) array);
    }
}
