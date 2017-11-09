package com.example.sheoliy.mdt;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Sheoliy on 2017/7/11.
 */


    public class New_netActivity extends Activity {
        private String[]data={"校园网使用说明",
                "2.1 有线网络",
                "中国电信宽带:开通流程及资费请咨询中国电信营业厅。",
                "教科网：因其教育和科研性质，我校主要向校内行政教学片区开放，具体使用方法及资费请查询信息中心网站。",
                "校内网络：只能访问校内网络资源。",
                "2.2 WiFi网络",
                "中国电信：CHINA-NET，具体使用方法及资费请咨询电信营业厅。",
                "教科网：SWUN-EDU，具体使用方法及资费请查询信息与教育技术中心网站。",};
    @Override
        protected void onCreate(Bundle savedInstanceState){

            super.onCreate(savedInstanceState);

            requestWindowFeature(Window.FEATURE_NO_TITLE);
            setContentView(R.layout.new_net);
            ArrayAdapter<String> adapter=new ArrayAdapter<String>(
                    New_netActivity.this,android.R.layout.simple_list_item_1,data);
            ListView listView=(ListView)findViewById(R.id.list_view);
            listView.setAdapter(adapter);

        }

    }





