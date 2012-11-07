package org.caoliu.sp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;

public class Login extends Activity {
	Button LoginButton ;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LoginButton = (Button) findViewById(R.id.LoginButton);       //安卓可以用xml布局文件给控件布局，通过此句得到布局文件里的控件
        //布局文件在res/layout里面
        LoginButton.setOnClickListener((android.view.View.OnClickListener) new myclickListener("login"));
        setContentView(R.layout.activity_login);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_login, menu);
        return true;
    }
    
    public class myclickListener implements OnClickListener
    {
    	String id;
    	public myclickListener(String id)
    	{
    		this.id =id;
    	}
		@Override
		public void onClick(DialogInterface dialog, int which) {
			if(id.equals("login"))
			{
				
				
				//这里写button的响应事件
				
				
				
			}
					
		}
    	
    }
}
