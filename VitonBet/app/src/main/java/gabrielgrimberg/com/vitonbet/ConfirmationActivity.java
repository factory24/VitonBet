package gabrielgrimberg.com.vitonbet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class ConfirmationActivity extends AppCompatActivity
{
    private Button xConfirmBtn;
    private CheckBox xCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

        xConfirmBtn = (Button) findViewById(R.id.confirmbtn);
        xCheckBox = (CheckBox) findViewById(R.id.checkBox);



        xCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b)
            {
                if (compoundButton.isChecked())
                {

                    xConfirmBtn.setEnabled(true);
                    xConfirmBtn.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            Intent loginRIntent = new Intent(ConfirmationActivity.this, MainActivity.class);
                            loginRIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(loginRIntent);
                        }
                    });
                }
                else if(!compoundButton.isChecked())
                {
                    xConfirmBtn.setEnabled(false);
                }

            }
        });


    }
}
