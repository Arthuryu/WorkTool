package com.test.worktool;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/*** ==============================================================================
 *
 * 版 权 : ****
 *
 * @author  : 王 建 宇
 *
 * @version  : 1.0
 *
 * 创建日期 : 2018/7/24 17:34
 *
 * 描 述 :
 *
 *
 *
 * 修订历史 :
 *
 * ==============================================================================*/
public class AutoStartBroadcastReceiver extends BroadcastReceiver {
    static final String action_boot ="android.intent.action.BOOT_COMPLETED";
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(action_boot)){
            Intent sayHelloIntent=new Intent(context,MainActivity.class);

            sayHelloIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            context.startActivity(sayHelloIntent);
        }
    }

}
