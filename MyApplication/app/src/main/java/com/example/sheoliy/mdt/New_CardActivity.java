package com.example.sheoliy.mdt;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class New_CardActivity extends Activity{
    private String[]data={"同学们：",
            "首先祝贺你成为西南民族大学中的一员。在进入校园，报到注册成功后，你将获得一张属于你本人的校园一卡通。为方便你们快速掌握西南民族大学校园一卡通及校园网的正确使用方法，让其为你的学习、生活带来更多便利，请你认真阅读本说明。",
            "&1.校园一卡通使用说明",
            "1.1西南民族大学校园一卡通”使用时无需区别其正反面，卡内金额上限为2000元。",
            "1.2一卡通校园卡目前应用范围：学校后勤各消费网点、考试网上报名缴费、机房上机、图书借阅、门禁、考勤、乘校车等。",
            "1.3校园卡如有遗失，请立即挂失，挂失可登录一卡通应用管理平台https://218.194.85.250或本人前往信息与教育技术中心客户部进行【注：不允许电话挂失】。",
            "1.4校园卡初始密码为6位数字(身份证号第9位到第14位数字)。用户可通过一卡通应用管理平台https://218.194.85.250，或圈存机修改密码。若将密码遗忘，请带上相关证件(身份证或学生证)前往信息与教育技术中心客户部办理密码重置。 ",
            "1.5我校已开通建设银行手机APP直接向一卡通充值业务。建议2017级的同学们提前在建行卡上存够需要的款项，并在WIFI环境下载好建设银行手机APP客户端。当你领取到本人校园一卡通卡片后，即可马上充值。具体操作流程请查看附页。",
            "&2.建设银行手机APP向校园一卡通充值流程",
            "温馨提示：使用建设银行手机APP充值前，如尚未将银行卡绑定现在使用的手机号码，请提前到建行柜台添加或修改你银行卡对应绑定的手机号码。充值时间为每日7：00----20：20。每张银行卡每日最多充值5次，单日充值总额不超过1000元。",
            "充值流程：",
            "2.1通过中国建设银行官方网站(www.ccb.com)，下载其手机APP客户端；",
            "2.2点击进入建设银行手机APP；",
            "2.3点击“悦生活”“行政教育”“校园卡充值”“缴费地区（四川省成都市）”“缴费单位（西南民族大学校园卡充值）”；",
            "2.4输入需充值的校园一卡通卡号（请认真核对输入卡号以免误充），输入后，请点击“下一步”；",
            "2.5输入充值金额，然后选择支付方式。未开通手机银行用户只能使用“账号支付”功能充值，充值时需输入付款银行卡账号，提供与银行卡绑定的手机号码的后四位；已开通手机银行的用户也可直接通过“手机银行支付”方式进行充值；",
            "2.6充值过程的最后需要输入与银行卡绑定的手机所接收到的验证码，然后点击确认。确认完毕，一卡通充值即成功。",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.new_card);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(
                New_CardActivity.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);

    }

}



