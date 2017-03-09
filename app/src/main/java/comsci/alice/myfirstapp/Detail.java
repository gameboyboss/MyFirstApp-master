package comsci.alice.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //intial View การผูกวิวในหน้า ui ให้รู้จักกับตัวแปลบนจาวา
        TextView titleTextView = (TextView) findViewById(R.id.txtTitleDetail);
        TextView detailScroll = (TextView) findViewById(R.id.txtDetailScroll);
        ImageView imageDetail = (ImageView) findViewById(R.id.imvImageDetail);
        Button button = (Button) findViewById(R.id.btnBack);

        //รับข้อมูลจาก main activity มาแสดงผลบน detail
        titleTextView.setText(getIntent().getStringExtra("Title"));
        detailScroll.setText(getIntent().getStringExtra("Detail"));
        imageDetail.setImageResource(getIntent().getIntExtra("Image",R.drawable.traffic_01));






    }   //main Method

        public void clickback(View view) {finish();
        }
}   //main Class
