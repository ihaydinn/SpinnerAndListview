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
