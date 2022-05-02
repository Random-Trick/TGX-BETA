package p315w8;

import java.io.InputStream;
import p315w8.C9997i;
import p330x8.C10159b;

public class C9996h extends AbstractC9989b {
    public boolean f32535A;
    public int f32536B;
    public int f32537C;
    public int f32538D;
    public boolean f32539E;
    public boolean f32540F;
    public boolean f32541G;
    public int f32542H;
    public int f32543I;
    public int f32544J;
    public int f32545K;
    public int[] f32546L;
    public C9997i f32547M;
    public C9995g f32548N;
    public int f32549O;
    public int f32550a;
    public boolean f32551b;
    public boolean f32552c;
    public boolean f32553d;
    public int f32554e;
    public boolean f32555f;
    public boolean f32556g;
    public boolean f32557h;
    public C9990c f32558i;
    public int f32559j;
    public int f32560k;
    public int f32561l;
    public int f32562m;
    public int f32563n;
    public int f32564o;
    public boolean f32565p;
    public int f32566q;
    public long f32567r;
    public boolean f32568s;
    public boolean f32569t;
    public boolean f32570u;
    public boolean f32571v;
    public boolean f32572w;
    public boolean f32573x;
    public int f32574y;
    public int f32575z;

    public static C9997i m6302a(C10159b bVar) {
        C9997i iVar = new C9997i();
        boolean f = bVar.m5885f("VUI: aspect_ratio_info_present_flag");
        iVar.f32576a = f;
        if (f) {
            C9988a a = C9988a.m6306a((int) bVar.m5884g(8, "VUI: aspect_ratio"));
            iVar.f32600y = a;
            if (a == C9988a.f32485b) {
                iVar.f32577b = (int) bVar.m5884g(16, "VUI: sar_width");
                iVar.f32578c = (int) bVar.m5884g(16, "VUI: sar_height");
            }
        }
        boolean f2 = bVar.m5885f("VUI: overscan_info_present_flag");
        iVar.f32579d = f2;
        if (f2) {
            iVar.f32580e = bVar.m5885f("VUI: overscan_appropriate_flag");
        }
        boolean f3 = bVar.m5885f("VUI: video_signal_type_present_flag");
        iVar.f32581f = f3;
        if (f3) {
            iVar.f32582g = (int) bVar.m5884g(3, "VUI: video_format");
            iVar.f32583h = bVar.m5885f("VUI: video_full_range_flag");
            boolean f4 = bVar.m5885f("VUI: colour_description_present_flag");
            iVar.f32584i = f4;
            if (f4) {
                iVar.f32585j = (int) bVar.m5884g(8, "VUI: colour_primaries");
                iVar.f32586k = (int) bVar.m5884g(8, "VUI: transfer_characteristics");
                iVar.f32587l = (int) bVar.m5884g(8, "VUI: matrix_coefficients");
            }
        }
        boolean f5 = bVar.m5885f("VUI: chroma_loc_info_present_flag");
        iVar.f32588m = f5;
        if (f5) {
            iVar.f32589n = bVar.m5879l("VUI chroma_sample_loc_type_top_field");
            iVar.f32590o = bVar.m5879l("VUI chroma_sample_loc_type_bottom_field");
        }
        boolean f6 = bVar.m5885f("VUI: timing_info_present_flag");
        iVar.f32591p = f6;
        if (f6) {
            iVar.f32592q = (int) bVar.m5884g(32, "VUI: num_units_in_tick");
            iVar.f32593r = (int) bVar.m5884g(32, "VUI: time_scale");
            iVar.f32594s = bVar.m5885f("VUI: fixed_frame_rate_flag");
        }
        boolean f7 = bVar.m5885f("VUI: nal_hrd_parameters_present_flag");
        if (f7) {
            iVar.f32597v = m6300c(bVar);
        }
        boolean f8 = bVar.m5885f("VUI: vcl_hrd_parameters_present_flag");
        if (f8) {
            iVar.f32598w = m6300c(bVar);
        }
        if (f7 || f8) {
            iVar.f32595t = bVar.m5885f("VUI: low_delay_hrd_flag");
        }
        iVar.f32596u = bVar.m5885f("VUI: pic_struct_present_flag");
        if (bVar.m5885f("VUI: bitstream_restriction_flag")) {
            C9997i.C9998a aVar = new C9997i.C9998a();
            iVar.f32599x = aVar;
            aVar.f32601a = bVar.m5885f("VUI: motion_vectors_over_pic_boundaries_flag");
            iVar.f32599x.f32602b = bVar.m5879l("VUI max_bytes_per_pic_denom");
            iVar.f32599x.f32603c = bVar.m5879l("VUI max_bits_per_mb_denom");
            iVar.f32599x.f32604d = bVar.m5879l("VUI log2_max_mv_length_horizontal");
            iVar.f32599x.f32605e = bVar.m5879l("VUI log2_max_mv_length_vertical");
            iVar.f32599x.f32606f = bVar.m5879l("VUI num_reorder_frames");
            iVar.f32599x.f32607g = bVar.m5879l("VUI max_dec_frame_buffering");
        }
        return iVar;
    }

    public static C9996h m6301b(InputStream inputStream) {
        C10159b bVar = new C10159b(inputStream);
        C9996h hVar = new C9996h();
        hVar.f32566q = (int) bVar.m5884g(8, "SPS: profile_idc");
        hVar.f32568s = bVar.m5885f("SPS: constraint_set_0_flag");
        hVar.f32569t = bVar.m5885f("SPS: constraint_set_1_flag");
        hVar.f32570u = bVar.m5885f("SPS: constraint_set_2_flag");
        hVar.f32571v = bVar.m5885f("SPS: constraint_set_3_flag");
        hVar.f32572w = bVar.m5885f("SPS: constraint_set_4_flag");
        hVar.f32573x = bVar.m5885f("SPS: constraint_set_5_flag");
        hVar.f32567r = bVar.m5884g(2, "SPS: reserved_zero_2bits");
        hVar.f32574y = (int) bVar.m5884g(8, "SPS: level_idc");
        hVar.f32575z = bVar.m5879l("SPS: seq_parameter_set_id");
        int i = hVar.f32566q;
        if (i == 100 || i == 110 || i == 122 || i == 144) {
            C9990c a = C9990c.m6305a(bVar.m5879l("SPS: chroma_format_idc"));
            hVar.f32558i = a;
            if (a == C9990c.f32490g) {
                hVar.f32535A = bVar.m5885f("SPS: residual_color_transform_flag");
            }
            hVar.f32563n = bVar.m5879l("SPS: bit_depth_luma_minus8");
            hVar.f32564o = bVar.m5879l("SPS: bit_depth_chroma_minus8");
            hVar.f32565p = bVar.m5885f("SPS: qpprime_y_zero_transform_bypass_flag");
            if (bVar.m5885f("SPS: seq_scaling_matrix_present_lag")) {
                m6299d(bVar, hVar);
            }
        } else {
            hVar.f32558i = C9990c.f32488e;
        }
        hVar.f32559j = bVar.m5879l("SPS: log2_max_frame_num_minus4");
        int l = bVar.m5879l("SPS: pic_order_cnt_type");
        hVar.f32550a = l;
        if (l == 0) {
            hVar.f32560k = bVar.m5879l("SPS: log2_max_pic_order_cnt_lsb_minus4");
        } else if (l == 1) {
            hVar.f32552c = bVar.m5885f("SPS: delta_pic_order_always_zero_flag");
            hVar.f32536B = bVar.m5883h("SPS: offset_for_non_ref_pic");
            hVar.f32537C = bVar.m5883h("SPS: offset_for_top_to_bottom_field");
            int l2 = bVar.m5879l("SPS: num_ref_frames_in_pic_order_cnt_cycle");
            hVar.f32549O = l2;
            hVar.f32546L = new int[l2];
            for (int i2 = 0; i2 < hVar.f32549O; i2++) {
                int[] iArr = hVar.f32546L;
                iArr[i2] = bVar.m5883h("SPS: offsetForRefFrame [" + i2 + "]");
            }
        }
        hVar.f32538D = bVar.m5879l("SPS: num_ref_frames");
        hVar.f32539E = bVar.m5885f("SPS: gaps_in_frame_num_value_allowed_flag");
        hVar.f32562m = bVar.m5879l("SPS: pic_width_in_mbs_minus1");
        hVar.f32561l = bVar.m5879l("SPS: pic_height_in_map_units_minus1");
        boolean f = bVar.m5885f("SPS: frame_mbs_only_flag");
        hVar.f32540F = f;
        if (!f) {
            hVar.f32556g = bVar.m5885f("SPS: mb_adaptive_frame_field_flag");
        }
        hVar.f32557h = bVar.m5885f("SPS: direct_8x8_inference_flag");
        boolean f2 = bVar.m5885f("SPS: frame_cropping_flag");
        hVar.f32541G = f2;
        if (f2) {
            hVar.f32542H = bVar.m5879l("SPS: frame_crop_left_offset");
            hVar.f32543I = bVar.m5879l("SPS: frame_crop_right_offset");
            hVar.f32544J = bVar.m5879l("SPS: frame_crop_top_offset");
            hVar.f32545K = bVar.m5879l("SPS: frame_crop_bottom_offset");
        }
        if (bVar.m5885f("SPS: vui_parameters_present_flag")) {
            hVar.f32547M = m6302a(bVar);
        }
        bVar.m5882i();
        return hVar;
    }

    public static C9991d m6300c(C10159b bVar) {
        C9991d dVar = new C9991d();
        dVar.f32494a = bVar.m5879l("SPS: cpb_cnt_minus1");
        dVar.f32495b = (int) bVar.m5884g(4, "HRD: bit_rate_scale");
        dVar.f32496c = (int) bVar.m5884g(4, "HRD: cpb_size_scale");
        int i = dVar.f32494a;
        dVar.f32497d = new int[i + 1];
        dVar.f32498e = new int[i + 1];
        dVar.f32499f = new boolean[i + 1];
        for (int i2 = 0; i2 <= dVar.f32494a; i2++) {
            dVar.f32497d[i2] = bVar.m5879l("HRD: bit_rate_value_minus1");
            dVar.f32498e[i2] = bVar.m5879l("HRD: cpb_size_value_minus1");
            dVar.f32499f[i2] = bVar.m5885f("HRD: cbr_flag");
        }
        dVar.f32500g = (int) bVar.m5884g(5, "HRD: initial_cpb_removal_delay_length_minus1");
        dVar.f32501h = (int) bVar.m5884g(5, "HRD: cpb_removal_delay_length_minus1");
        dVar.f32502i = (int) bVar.m5884g(5, "HRD: dpb_output_delay_length_minus1");
        dVar.f32503j = (int) bVar.m5884g(5, "HRD: time_offset_length");
        return dVar;
    }

    public static void m6299d(C10159b bVar, C9996h hVar) {
        hVar.f32548N = new C9995g();
        for (int i = 0; i < 8; i++) {
            if (bVar.m5885f("SPS: seqScalingListPresentFlag")) {
                C9995g gVar = hVar.f32548N;
                C9994f[] fVarArr = new C9994f[8];
                gVar.f32533a = fVarArr;
                C9994f[] fVarArr2 = new C9994f[8];
                gVar.f32534b = fVarArr2;
                if (i < 6) {
                    fVarArr[i] = C9994f.m6303a(bVar, 16);
                } else {
                    fVarArr2[i - 6] = C9994f.m6303a(bVar, 64);
                }
            }
        }
    }

    public String toString() {
        return "SeqParameterSet{ \n        pic_order_cnt_type=" + this.f32550a + ", \n        field_pic_flag=" + this.f32551b + ", \n        delta_pic_order_always_zero_flag=" + this.f32552c + ", \n        weighted_pred_flag=" + this.f32553d + ", \n        weighted_bipred_idc=" + this.f32554e + ", \n        entropy_coding_mode_flag=" + this.f32555f + ", \n        mb_adaptive_frame_field_flag=" + this.f32556g + ", \n        direct_8x8_inference_flag=" + this.f32557h + ", \n        chroma_format_idc=" + this.f32558i + ", \n        log2_max_frame_num_minus4=" + this.f32559j + ", \n        log2_max_pic_order_cnt_lsb_minus4=" + this.f32560k + ", \n        pic_height_in_map_units_minus1=" + this.f32561l + ", \n        pic_width_in_mbs_minus1=" + this.f32562m + ", \n        bit_depth_luma_minus8=" + this.f32563n + ", \n        bit_depth_chroma_minus8=" + this.f32564o + ", \n        qpprime_y_zero_transform_bypass_flag=" + this.f32565p + ", \n        profile_idc=" + this.f32566q + ", \n        constraint_set_0_flag=" + this.f32568s + ", \n        constraint_set_1_flag=" + this.f32569t + ", \n        constraint_set_2_flag=" + this.f32570u + ", \n        constraint_set_3_flag=" + this.f32571v + ", \n        constraint_set_4_flag=" + this.f32572w + ", \n        constraint_set_5_flag=" + this.f32573x + ", \n        level_idc=" + this.f32574y + ", \n        seq_parameter_set_id=" + this.f32575z + ", \n        residual_color_transform_flag=" + this.f32535A + ", \n        offset_for_non_ref_pic=" + this.f32536B + ", \n        offset_for_top_to_bottom_field=" + this.f32537C + ", \n        num_ref_frames=" + this.f32538D + ", \n        gaps_in_frame_num_value_allowed_flag=" + this.f32539E + ", \n        frame_mbs_only_flag=" + this.f32540F + ", \n        frame_cropping_flag=" + this.f32541G + ", \n        frame_crop_left_offset=" + this.f32542H + ", \n        frame_crop_right_offset=" + this.f32543I + ", \n        frame_crop_top_offset=" + this.f32544J + ", \n        frame_crop_bottom_offset=" + this.f32545K + ", \n        offsetForRefFrame=" + this.f32546L + ", \n        vuiParams=" + this.f32547M + ", \n        scalingMatrix=" + this.f32548N + ", \n        num_ref_frames_in_pic_order_cnt_cycle=" + this.f32549O + '}';
    }
}
