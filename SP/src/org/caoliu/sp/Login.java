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
        LoginButton = (Button) findViewById(R.id.LoginButton);       //��׿������xml�����ļ����ؼ����֣�ͨ���˾�õ������ļ���Ŀؼ�
        //�����ļ���res/layout����
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
				
				
				//����дbutton����Ӧ�¼�
				
				
				
			}
					
		}
    	
    }
}
