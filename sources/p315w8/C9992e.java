package p315w8;

import java.io.InputStream;
import java.util.Arrays;
import p330x8.C10159b;

public class C9992e extends AbstractC9989b {
    public boolean f32504a;
    public int f32505b;
    public int f32506c;
    public int f32507d;
    public int f32508e;
    public int f32509f;
    public boolean f32510g;
    public int f32511h;
    public int f32512i;
    public boolean f32513j;
    public int f32514k;
    public int f32515l;
    public int f32516m;
    public int f32517n;
    public boolean f32518o;
    public boolean f32519p;
    public boolean f32520q;
    public int[] f32521r;
    public int[] f32522s;
    public int[] f32523t;
    public boolean f32524u;
    public int[] f32525v;
    public C9993a f32526w;

    public static class C9993a {
        public boolean f32527a;
        public C9995g f32528b = new C9995g();
        public int f32529c;
        public boolean[] f32530d;

        public String toString() {
            return "PPSExt{transform_8x8_mode_flag=" + this.f32527a + ", scalindMatrix=" + this.f32528b + ", second_chroma_qp_index_offset=" + this.f32529c + ", pic_scaling_list_present_flag=" + this.f32530d + '}';
        }
    }

    public static C9992e m6304a(InputStream inputStream) {
        C10159b bVar = new C10159b(inputStream);
        C9992e eVar = new C9992e();
        eVar.f32508e = bVar.m5879l("PPS: pic_parameter_set_id");
        eVar.f32509f = bVar.m5879l("PPS: seq_parameter_set_id");
        eVar.f32504a = bVar.m5885f("PPS: entropy_coding_mode_flag");
        eVar.f32510g = bVar.m5885f("PPS: pic_order_present_flag");
        int l = bVar.m5879l("PPS: num_slice_groups_minus1");
        eVar.f32511h = l;
        if (l > 0) {
            int l2 = bVar.m5879l("PPS: slice_group_map_type");
            eVar.f32512i = l2;
            int i = eVar.f32511h;
            eVar.f32521r = new int[i + 1];
            eVar.f32522s = new int[i + 1];
            eVar.f32523t = new int[i + 1];
            if (l2 == 0) {
                for (int i2 = 0; i2 <= eVar.f32511h; i2++) {
                    eVar.f32523t[i2] = bVar.m5879l("PPS: run_length_minus1");
                }
            } else if (l2 == 2) {
                for (int i3 = 0; i3 < eVar.f32511h; i3++) {
                    eVar.f32521r[i3] = bVar.m5879l("PPS: top_left");
                    eVar.f32522s[i3] = bVar.m5879l("PPS: bottom_right");
                }
            } else {
                int i4 = 3;
                if (l2 == 3 || l2 == 4 || l2 == 5) {
                    eVar.f32524u = bVar.m5885f("PPS: slice_group_change_direction_flag");
                    eVar.f32507d = bVar.m5879l("PPS: slice_group_change_rate_minus1");
                } else if (l2 == 6) {
                    if (i + 1 <= 4) {
                        i4 = i + 1 > 2 ? 2 : 1;
                    }
                    int l3 = bVar.m5879l("PPS: pic_size_in_map_units_minus1");
                    eVar.f32525v = new int[l3 + 1];
                    for (int i5 = 0; i5 <= l3; i5++) {
                        int[] iArr = eVar.f32525v;
                        iArr[i5] = bVar.m5881j(i4, "PPS: slice_group_id [" + i5 + "]f");
                    }
                }
            }
        }
        eVar.f32505b = bVar.m5879l("PPS: num_ref_idx_l0_active_minus1");
        eVar.f32506c = bVar.m5879l("PPS: num_ref_idx_l1_active_minus1");
        eVar.f32513j = bVar.m5885f("PPS: weighted_pred_flag");
        eVar.f32514k = (int) bVar.m5884g(2, "PPS: weighted_bipred_idc");
        eVar.f32515l = bVar.m5883h("PPS: pic_init_qp_minus26");
        eVar.f32516m = bVar.m5883h("PPS: pic_init_qs_minus26");
        eVar.f32517n = bVar.m5883h("PPS: chroma_qp_index_offset");
        eVar.f32518o = bVar.m5885f("PPS: deblocking_filter_control_present_flag");
        eVar.f32519p = bVar.m5885f("PPS: constrained_intra_pred_flag");
        eVar.f32520q = bVar.m5885f("PPS: redundant_pic_cnt_present_flag");
        if (bVar.m5889b()) {
            C9993a aVar = new C9993a();
            eVar.f32526w = aVar;
            aVar.f32527a = bVar.m5885f("PPS: transform_8x8_mode_flag");
            if (bVar.m5885f("PPS: pic_scaling_matrix_present_flag")) {
                for (int i6 = 0; i6 < ((eVar.f32526w.f32527a ? 1 : 0) * 2) + 6; i6++) {
                    if (bVar.m5885f("PPS: pic_scaling_list_present_flag")) {
                        C9995g gVar = eVar.f32526w.f32528b;
                        C9994f[] fVarArr = new C9994f[8];
                        gVar.f32533a = fVarArr;
                        C9994f[] fVarArr2 = new C9994f[8];
                        gVar.f32534b = fVarArr2;
                        if (i6 < 6) {
                            fVarArr[i6] = C9994f.m6303a(bVar, 16);
                        } else {
                            fVarArr2[i6 - 6] = C9994f.m6303a(bVar, 64);
                        }
                    }
                }
            }
            eVar.f32526w.f32529c = bVar.m5883h("PPS: second_chroma_qp_index_offset");
        }
        bVar.m5882i();
        return eVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9992e eVar = (C9992e) obj;
        if (!Arrays.equals(this.f32522s, eVar.f32522s) || this.f32517n != eVar.f32517n || this.f32519p != eVar.f32519p || this.f32518o != eVar.f32518o || this.f32504a != eVar.f32504a) {
            return false;
        }
        C9993a aVar = this.f32526w;
        if (aVar == null) {
            if (eVar.f32526w != null) {
                return false;
            }
        } else if (!aVar.equals(eVar.f32526w)) {
            return false;
        }
        return this.f32505b == eVar.f32505b && this.f32506c == eVar.f32506c && this.f32511h == eVar.f32511h && this.f32515l == eVar.f32515l && this.f32516m == eVar.f32516m && this.f32510g == eVar.f32510g && this.f32508e == eVar.f32508e && this.f32520q == eVar.f32520q && Arrays.equals(this.f32523t, eVar.f32523t) && this.f32509f == eVar.f32509f && this.f32524u == eVar.f32524u && this.f32507d == eVar.f32507d && Arrays.equals(this.f32525v, eVar.f32525v) && this.f32512i == eVar.f32512i && Arrays.equals(this.f32521r, eVar.f32521r) && this.f32514k == eVar.f32514k && this.f32513j == eVar.f32513j;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((((((((Arrays.hashCode(this.f32522s) + 31) * 31) + this.f32517n) * 31) + (this.f32519p ? 1231 : 1237)) * 31) + (this.f32518o ? 1231 : 1237)) * 31) + (this.f32504a ? 1231 : 1237)) * 31;
        C9993a aVar = this.f32526w;
        int hashCode2 = (((((((((((((((((((((((((((((((((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f32505b) * 31) + this.f32506c) * 31) + this.f32511h) * 31) + this.f32515l) * 31) + this.f32516m) * 31) + (this.f32510g ? 1231 : 1237)) * 31) + this.f32508e) * 31) + (this.f32520q ? 1231 : 1237)) * 31) + Arrays.hashCode(this.f32523t)) * 31) + this.f32509f) * 31) + (this.f32524u ? 1231 : 1237)) * 31) + this.f32507d) * 31) + Arrays.hashCode(this.f32525v)) * 31) + this.f32512i) * 31) + Arrays.hashCode(this.f32521r)) * 31) + this.f32514k) * 31;
        if (!this.f32513j) {
            i = 1237;
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "PictureParameterSet{\n       entropy_coding_mode_flag=" + this.f32504a + ",\n       num_ref_idx_l0_active_minus1=" + this.f32505b + ",\n       num_ref_idx_l1_active_minus1=" + this.f32506c + ",\n       slice_group_change_rate_minus1=" + this.f32507d + ",\n       pic_parameter_set_id=" + this.f32508e + ",\n       seq_parameter_set_id=" + this.f32509f + ",\n       pic_order_present_flag=" + this.f32510g + ",\n       num_slice_groups_minus1=" + this.f32511h + ",\n       slice_group_map_type=" + this.f32512i + ",\n       weighted_pred_flag=" + this.f32513j + ",\n       weighted_bipred_idc=" + this.f32514k + ",\n       pic_init_qp_minus26=" + this.f32515l + ",\n       pic_init_qs_minus26=" + this.f32516m + ",\n       chroma_qp_index_offset=" + this.f32517n + ",\n       deblocking_filter_control_present_flag=" + this.f32518o + ",\n       constrained_intra_pred_flag=" + this.f32519p + ",\n       redundant_pic_cnt_present_flag=" + this.f32520q + ",\n       top_left=" + this.f32521r + ",\n       bottom_right=" + this.f32522s + ",\n       run_length_minus1=" + this.f32523t + ",\n       slice_group_change_direction_flag=" + this.f32524u + ",\n       slice_group_id=" + this.f32525v + ",\n       extended=" + this.f32526w + '}';
    }
}
