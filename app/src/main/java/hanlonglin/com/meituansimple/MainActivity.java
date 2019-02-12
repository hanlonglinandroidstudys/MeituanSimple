package hanlonglin.com.meituansimple;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import hanlonglin.com.componentlib.ServiceFactory;


public class MainActivity extends AppCompatActivity {

    Button btn_login, btn_live;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        btn_live = (Button) findViewById(R.id.btn_live);
        btn_login = (Button) findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("TAG", "点击登陆");
//                Intent intent=new Intent(MainActivity.this,LoginActivity.class);
//                startActivity(intent);
                ServiceFactory.getInstance().getLoginService().launch(MainActivity.this, "");
            }
        });
        btn_live.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("TAG", "点击直播");
//                Intent intent=new Intent(MainActivity.this,LiveActivity.class);
//                startActivity(intent);
                ServiceFactory.getInstance().getLiveService().launch(MainActivity.this, "");
            }
        });
    }
}
