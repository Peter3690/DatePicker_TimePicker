package tulv.datepicker_timepicker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    DatePicker datePicker;
    TimePicker timePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWidget();
        initDatePicker();
        initTimePicker();
    }

    public void getWidget() {
        datePicker = (DatePicker) findViewById(R.id.dpDate);
        timePicker = (TimePicker) findViewById(R.id.tpTime);
    }

    public void initDatePicker() {
        Toast.makeText(MainActivity.this, "g", Toast.LENGTH_SHORT).show();
        Calendar calendar=Calendar.getInstance();
        int year=calendar.get(Calendar.YEAR);
        int month=calendar.get(Calendar.MONTH);
        int day=calendar.get(Calendar.DAY_OF_MONTH);
        datePicker.init(year-1, month, day, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
                String s = i2 + "/" + (i1+1) + "/" + (i+1);
                Toast.makeText(MainActivity.this, ""+s, Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void initTimePicker(){
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int i, int i1) {
                Toast.makeText(MainActivity.this, i+":"+i1, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
