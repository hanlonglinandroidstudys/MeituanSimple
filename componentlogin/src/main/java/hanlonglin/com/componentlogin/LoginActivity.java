package hanlonglin.com.componentlogin;

import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import hanlonglin.com.componentlib.ServiceFactory;

public class LoginActivity extends AppCompatActivity {

    TextInputEditText ted_account, ted_passwd;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity_login);
        initView();
    }

    private void initView() {
        ted_account = (TextInputEditText) findViewById(R.id.ed_account);
        ted_passwd = (TextInputEditText) findViewById(R.id.ed_passwd);
        btn_login = (Button) findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doLogin();
            }
        });
    }

    private void doLogin() {
        String account = ted_account.getText().toString();
        String passwd = ted_passwd.getText().toString();
        if (account .equals("")) {
            ted_account.setError("账号不能为空！");
            return;
        }
        if (passwd .equals("")) {
            ted_passwd.setError("密码不能为空！");
            return;
        }
        ServiceFactory.getInstance().getLiveService().launch(LoginActivity.this,"");
        finish();
    }
}
