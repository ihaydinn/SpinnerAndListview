# SpinnerAndListview

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
 
    ListView liste;
    String[] gunler={"Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"};
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
        liste=(ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter=
                new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,gunler);
        liste.setAdapter(adapter);
        liste.setOnItemClickListener(this);
 
    }
 
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
 
        TextView gecici=(TextView) view;
        Toast.makeText(this, gecici.getText()+" "+position, Toast.LENGTH_LONG ).show();
 
    }
}

///////////////////////Custom ListView/////////////////////////////////////////

public class MainActivity extends AppCompatActivity {
 
    String[] mevsim = {"Sonbahar", "Kış", "İlkbahar", "Yaz"};
 
    ListView liste;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
        liste = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, R.layout.tek_satir, R.id.textView, mevsim);
        liste.setAdapter(adapter);
    }
}


XML

<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/activity_main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:paddingBottom="@dimen/activity_vertical_margin"
    android:paddingLeft="@dimen/activity_horizontal_margin"
    android:paddingRight="@dimen/activity_horizontal_margin"
    android:paddingTop="@dimen/activity_vertical_margin"
    tools:context="iha.com.listviewwithimage.MainActivity">
 
    <ListView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_alignParentTop="true"
        android:id="@+id/listView"
        android:layout_alignParentStart="true" />
</RelativeLayout>

<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="horizontal">
 
 
    <ImageView
        android:layout_width="74dp"
        android:layout_height="77dp"
        app:srcCompat="@drawable/logo"
        android:id="@+id/imageView" />
 
    <TextView
        android:text=""
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:id="@+id/textView"
        android:layout_weight="1" />
</LinearLayout>
