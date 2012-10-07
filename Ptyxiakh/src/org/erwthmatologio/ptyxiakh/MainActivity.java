package org.erwthmatologio.ptyxiakh;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.app.AlertDialog;



   public class MainActivity extends Activity 
   {
	   
	  @Override
          public void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_main);
          retrieveQuestion();   
   }
    
	  static int j=1;
   public void retrieveQuestion()
   {
	   
	   TextView question = (TextView)findViewById(R.id.textView1);
	   RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radioGroup1);

	   for (int i = 0; i < radioGroup.getChildCount(); i++)
	            ((RadioButton) radioGroup.getChildAt(i)).setText(String.valueOf(j)+"."+String.valueOf(i+1));
	   
	   question.setText("This is Question "+String.valueOf(j));
	   j++;
	   
	    	
   }
   

   
   public void onRadioButtonClicked(View view)
   {
	   AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
	   dlgAlert.setMessage("This is an alert with no consequence");
	   dlgAlert.setTitle("App Title");
	   dlgAlert.setPositiveButton("OK", null);
	   dlgAlert.setCancelable(false);
	   dlgAlert.create();
	   boolean checked = ((RadioButton) view).isChecked();
	   RadioButton button = (RadioButton) view;
	   
        // Check which radio button was clicked
       switch(view.getId()) 
       {
	       case R.id.radio0:
	           if (checked)
	        	   
	        	   button.setText("ME EPELEKSES!!!!");
	           	   button.setChecked(false);
		           dlgAlert.setMessage(button.getText());
		           dlgAlert.show();
		           break;
            case R.id.radio1:
               if (checked)
            	   button.setText("ME EPELEKSES!!!!");
               	   button.setChecked(false);
	           	   dlgAlert.setMessage(button.getText());
	           	   dlgAlert.show();
	           	   break;
            case R.id.radio2:
               if (checked)
            	   button.setText("ME EPELEKSES!!!!");
               	   button.setChecked(false);
		           dlgAlert.setMessage(button.getText());
		           dlgAlert.show();
		           break;
            case R.id.radio3:
               if (checked)
	               button.setText("ME EPELEKSES!!!!");
                   button.setChecked(false);
		           dlgAlert.setMessage(button.getText());
		           dlgAlert.show();
	               break;
       }
       retrieveQuestion();
        
   }
   
   protected void onPause() {
       super.onPause();
       j=1;
   }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) 
    {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    
}
