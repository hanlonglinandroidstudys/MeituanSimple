package hanlonglin.com.componentlogin;

import android.content.Context;
import android.content.Intent;

import hanlonglin.com.componentlib.interfaces.IService;

public class LoginService implements IService {
    @Override
    public void launch(Context context, String className) {
        Intent intent=new Intent(context,LoginActivity.class);
        context.startActivity(intent);
    }
}
