package id.ac.polinema.tebakangka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

	//  TODO: deklarasikan variabel di sini
	private EditText inputNumber;
	private TextView outputText;
	private int random;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// TODO: bind layout di sini
		inputNumber = findViewById(R.id.number_input);
		initRandomNumber();
	}

	// TODO: generate angka random di sini
	private void initRandomNumber() {
        final int min = 1;
        final int max = 100;
        random = new Random().nextInt((max - min) + 1) + min;
	}

	public void handleGuess(View view) {
		// TODO: Tambahkan logika untuk melakukan pengecekan angka
        int input = Integer.parseInt(inputNumber.getText().toString());
        outputText.setText(""+random);
        if(input == random){
            Toast.makeText(this, "Jawaban Anda Benar !", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Jawaban Anda Salah !", Toast.LENGTH_SHORT).show();
        }
	}

	public void handleReset(View view) {
		// TODO: Reset tampilan
	}
}
