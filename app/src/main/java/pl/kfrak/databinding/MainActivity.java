package pl.kfrak.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import pl.kfrak.databinding.databinding.ActivityMainBinding;
import pl.kfrak.databinding.models.Beer;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //binding.setBeer(//());


    }

    private Beer getPiast() {
        Beer piastBeer = new Beer("Piast", 6f, 2.5f);
        return piastBeer;
    }

    private Beer getLech() {
        Beer lechBeer = new Beer("Lech", 10f, 4f);
        return lechBeer;
    }

    private Beer getRedds() {
        Beer redsBeer = new Beer("Redds", 1f, 8.49f);
        return redsBeer;
    }

    public void showPiast(View view){
        binding.setBeer(getPiast());
    }

    public void showLech(View view){
        binding.setBeer(getLech());
    }

    public void showRedds(View view){
        binding.setBeer(getRedds());
    }


}
