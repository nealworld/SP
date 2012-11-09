package org.caoliu.sp;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.util.Log;
public class Login extends Activity{
	Button LoginButton ;
	private static final String TAG = "MyActivity";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        LoginButton = (Button) findViewById(R.id.LoginButton);       
        LoginButton.setOnClickListener(new myclickListener("login"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_login, menu);
        return true;
    }
    public class myclickListener implements View.OnClickListener
    {
    	String id;
    	public myclickListener(String id)
    	{
    		this.id =id;
    	}

		@Override
		public void onClick(View v) {
			if(id.equals("login"))
			{
				 Log.println(RESULT_OK, TAG, "click the login button");
			}
			
		}
    	
    }
}
