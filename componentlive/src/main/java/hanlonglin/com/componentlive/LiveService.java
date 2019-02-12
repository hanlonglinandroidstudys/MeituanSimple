package hanlonglin.com.componentlive;

import android.content.Context;
import android.content.Intent;

import hanlonglin.com.componentlib.interfaces.IService;

public class LiveService implements IService {
    @Override
    public void launch(Context context, String className) {
        Intent intent=new Intent(context,LiveActivity.class);
        context.startActivity(intent);
    }
}
