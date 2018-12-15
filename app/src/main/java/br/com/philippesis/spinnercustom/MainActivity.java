package br.com.philippesis.spinnercustom;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner mSpinnerMain;
    private List<SpinnerData> mDataList;
    private SpinnerCustomAdapter mAdapter;
    private SpinnerData mspnData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDataList = new ArrayList<>();
        mDataList.add(new SpinnerData(0, "Selecione", null));
        mDataList.add(new SpinnerData(1, "Java", "Oracle Inc."));
        mDataList.add(new SpinnerData(2, "C#", "Microsoft Inc."));
        mDataList.add(new SpinnerData(3, "Python", "Python S. Fundation"));
        mDataList.add(new SpinnerData(4, "C++", "Community"));

        mSpinnerMain = (Spinner) findViewById(R.id.idspnMain);

        mAdapter = new SpinnerCustomAdapter(this, R.layout.spinner_custom_layout, mDataList);
        mSpinnerMain.setAdapter(mAdapter);
        mSpinnerMain.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                mspnData = mAdapter.getItem(position);
                if (mspnData.getId() != 0) {
                    switch (mspnData.getmMainLabel()) {
                        case "Java":
                            Toast.makeText(MainActivity.this, "Linguagem Selecionada: " +
                                    mspnData.getmMainLabel()+ "\nBoa escolha!", Toast.LENGTH_SHORT).show();
                            break;
                        case "C#":
                            Toast.makeText(MainActivity.this, "Linguagem Selecionada: " +
                                            mspnData.getmMainLabel()+ "\nLamento!!", Toast.LENGTH_SHORT).show();
                            break;
                            default:
                                Toast.makeText(MainActivity.this, "Linguagem Selecionada: " +
                                                mspnData.getmMainLabel(), Toast.LENGTH_SHORT).show();
                                break;

                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
