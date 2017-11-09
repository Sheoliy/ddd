package com.example.sheoliy.mdt;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Sheoliy on 2017/7/11.
 */


public class New_CartimeActivity extends Activity {
    private String[]data={"(～￣▽￣)～ 校车服务时间：",
            "&武侯校区——航空港校区",
            "周一至周五",
            "7:50 9:40 11:10 13:20 15:20 16:50 18:10 21:30",
            "周六至周日",
            "7:50 9:40 11:10 13:20 15:20 17:10 18:10 21:30 ",
            "法定节假日",
            "8:30 9:40 14:30 17:10 19:00 21:30",
            "&航空港校区——武侯校区",
            "周一至周五",
            "8:30 10:20 11:30 12:20 12:50 14:30 16:00 17:10",
            "17:50 20:50 22:30",
            "周六至周日",
            "9:00 10:20 11:30 12:20 16:00 17:50 20:50 22:30",
            "法定节假日",
            "9:00 10:30 15:30 18:00 20:00 22:30",
};
    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.new_cartime);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(
                New_CartimeActivity.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);

    }

}
